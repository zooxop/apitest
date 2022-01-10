package com.arum.api.web.dto;

import com.arum.api.domain.ithospital.IT_Hospital;
import lombok.Getter;

@Getter
public class ItHospitalDto {
    private String ihl_hosp_id;

    public ItHospitalDto(IT_Hospital entity){
        this.ihl_hosp_id = entity.getIhl_hosp_no();
    }
}
