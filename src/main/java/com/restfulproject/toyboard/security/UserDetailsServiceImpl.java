package com.restfulproject.toyboard.security;

import java.util.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.restfulproject.toyboard.member.dao.MemberDao;
import com.restfulproject.toyboard.member.domain.Member;



@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final MemberDao infoMemberDao;

    public UserDetailsServiceImpl(MemberDao infoMemberDao) {
        this.infoMemberDao = infoMemberDao;
    }

    // username = User (id)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("UserDetailsServiceImpl loadUserByUsername " + new Date());
        Member member = infoMemberDao.findById(username);
        if (member == null) {
            throw new UsernameNotFoundException(String.format("'%s'는 존재하지 않는 사용자입니다.", username));
        }

        return new UserDetailsImpl(member);
    }
}
