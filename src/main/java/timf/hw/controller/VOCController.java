package timf.hw.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import timf.hw.model.dto.CompensationRequest;
import timf.hw.model.dto.CompensationResponse;
import timf.hw.model.dto.PanaltyRequest;
import timf.hw.model.dto.PanaltyResponse;
import timf.hw.model.dto.VOCRequest;
import timf.hw.model.dto.VOCResponse;
import timf.hw.service.VOCService;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class VOCController {

    private final VOCService vOCService;

    @PostMapping("/v1/voc")
    public VOCResponse addVOC(
        @RequestBody VOCRequest vOCRequest
    ){
        return vOCService.addVOC(vOCRequest);
    }

    @PostMapping("/v1/panalty")
    public PanaltyResponse addPanalty(
            @RequestBody PanaltyRequest panaltyRequest
    ){
        return vOCService.addPanalty(panaltyRequest);
    }

    @PostMapping("/v1/compensation")
    public CompensationResponse addCompensation(
            @RequestBody CompensationRequest compensationRequest
    ){
        return vOCService.addCompensation(compensationRequest);
    }
}
