package com.restfulproject.toyboard.openapi.dao;

import org.apache.ibatis.annotations.Mapper;
import com.restfulproject.toyboard.openapi.domain.OpenApiCamping;

@Mapper
public interface OpenApiCampingDao {

    public Integer createOpenApi(OpenApiCamping data);  //화원가입처리
}
