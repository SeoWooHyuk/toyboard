package com.restfulproject.toyboard.openapi.dto.param;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.restfulproject.toyboard.openapi.domain.OpenApiCamping;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpenApiCampingPram {
    
    private List<OpenApiCamping> data;
    private int currentCount;
    private int matchCount;
    private int page;
    private int perPage;
    private int totalCount;

    public OpenApiCampingPram() {
    }

    public OpenApiCampingPram(List<OpenApiCamping> data, int currentCount, int matchCount, int page, int perPage,
            int totalCount) {
        this.data = data;
        this.currentCount = currentCount;
        this.matchCount = matchCount;
        this.page = page;
        this.perPage = perPage;
        this.totalCount = totalCount;
    }

    
}
