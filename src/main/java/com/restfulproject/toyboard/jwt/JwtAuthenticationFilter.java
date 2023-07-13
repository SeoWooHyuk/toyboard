package com.restfulproject.toyboard.jwt;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import java.io.IOException;
import java.util.Arrays;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final UserDetailsService userDetailsService;
    private final JwtTokenUtil jwtTokenUtil;

    public JwtAuthenticationFilter(
        UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil) {
        this.userDetailsService = userDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    String HEADER_STRING = "Authorization";
    String TOKEN_PREFIX = "Bearer ";

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String header = req.getHeader(HEADER_STRING);
        String userId = null;
        String authToken = null;

            // System.out.println("읽었나"+header);
        if (header != null && header.startsWith(TOKEN_PREFIX)) {
            authToken = header.replace(TOKEN_PREFIX,"");
            try {
                userId = jwtTokenUtil.getUsernameFromToken(authToken);
            } catch (IllegalArgumentException e) {
                System.out.println("JwtAuthenticationFilter: token error (fail get user id) !");
                e.printStackTrace();
            } catch (ExpiredJwtException e) {
                System.out.println("JwtAuthenticationFilter: expired token !"); //토큰이만료됨
                e.printStackTrace();
            } catch(SignatureException e){
                System.out.println("JwtAuthenticationFilter: invalid member !");
                e.printStackTrace();
            }
            catch (MalformedJwtException e) {
                System.out.println("JwtAuthenticationFilter: invalid jwt형식이아닙니다. !");
                // JWT 문자열이 형식에 맞지 않을 때 실행될 예외 처리 코드
                // e.printStackTrace();
            }
        } else {
            // System.out.println("JwtAuthenticationFilter: request that do not require authorization.");
        }

        if (userId != null && SecurityContextHolder.getContext().getAuthentication() == null) {
           
        
            UserDetails userDetails = userDetailsService.loadUserByUsername(userId);

            if (jwtTokenUtil.validateToken(authToken, userDetails)) {
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")));
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(req));
                logger.info("authenticated user " + userId + ", setting security context");
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }

        chain.doFilter(req, res);
    }
}
