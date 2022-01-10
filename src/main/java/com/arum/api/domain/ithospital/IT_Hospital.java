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
    @Column(columnDefinition = "TEXT", nullable = false)
    private String ihl_hosp_no;

    @Builder
    public IT_Hospital(String ihl_hosp_no){
        this.ihl_hosp_no = ihl_hosp_no;
    }
}
