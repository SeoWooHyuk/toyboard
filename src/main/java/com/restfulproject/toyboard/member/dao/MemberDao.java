package com.restfulproject.toyboard.member.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.restfulproject.toyboard.member.domain.Member;
import com.restfulproject.toyboard.member.dto.param.CreateMemberParam;


@Mapper
@Repository
public interface MemberDao {
    

	public Member findById(String id); //시큐리티 디테일서비스에서 사용 

 	public Integer isExistUserId(String id); //중복여부확인

	public Integer createMember(CreateMemberParam param);  //화원가입처리


}
