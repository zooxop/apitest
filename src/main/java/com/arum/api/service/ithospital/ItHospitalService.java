package com.arum.api.service.ithospital;

import com.arum.api.domain.ithospital.ITHOSPITALRepository;
import com.arum.api.web.dto.ItHospitalDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ItHospitalService {
    private final ITHOSPITALRepository ithospitalRepository;

    @Transactional
    public List<ItHospitalDto> findAllDesc(){
        return ithospitalRepository.findAllDesc().stream().map(ItHospitalDto::new).collect(Collectors.toList());
    }
}
