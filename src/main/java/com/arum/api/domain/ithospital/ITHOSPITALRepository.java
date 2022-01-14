package com.arum.api.domain.ithospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ITHOSPITALRepository extends JpaRepository<IT_Hospital, Long> {
    @Query(value = "SELECT p.IHL_HOSP_NO FROM IT_Hospital p", nativeQuery = true)
    List<IT_Hospital> findAllDesc();
}
