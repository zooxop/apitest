package com.arum.api.domain.ithospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ITHOSPITALRepository extends JpaRepository<IT_Hospital, Long> {
    @Query("SELECT p.ihl_hosp_no FROM IT_Hospital p")
    List<IT_Hospital> findAllDesc();
}
