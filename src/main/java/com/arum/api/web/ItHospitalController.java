package com.arum.api.web;

import com.arum.api.service.ithospital.ItHospitalService;
import com.arum.api.web.dto.ItHospitalDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ItHospitalController {

    private final ItHospitalService itHospitalService;

    @GetMapping("/api/v1/hospital")
    public String test(Model model){
        model.addAttribute("ithospital", itHospitalService.findAllDesc());
        return "hospital";
    }
}
