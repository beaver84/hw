package timf.hw.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import timf.hw.model.dto.VOCRequest;
import timf.hw.model.dto.VOCResponse;
import timf.hw.service.VOCService;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class VOCController {

    private final VOCService vOCService;

    @PostMapping("/v1/VOC")
    public VOCResponse addVOC(
        @RequestBody
        VOCRequest vOCRequest
    ){
        return vOCService.addVOC(vOCRequest);
    }
}
