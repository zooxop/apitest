package com.arum.api.domain.ithospital;

import com.arum.api.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class IT_Hospital {

    @Id
    @Column(columnDefinition = "TEXT", nullable = false, name = "IHL_HOSP_NO")
    private String ihlHospNo;

    @Builder
    public IT_Hospital(String ihl_hosp_no){
        this.ihlHospNo = ihl_hosp_no;
    }
}
