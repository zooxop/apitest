package com.arum.api.web.dto;

import com.arum.api.domain.ithospital.IT_Hospital;
import lombok.Getter;

@Getter
public class ItHospitalDto {
    private String ihlHospNo;

    public ItHospitalDto(IT_Hospital entity){
        this.ihlHospNo = entity.getIhlHospNo();
    }
}
