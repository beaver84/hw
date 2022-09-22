package timf.hw.controller;

import io.swagger.annotations.ApiModelProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import timf.hw.model.dto.CompensationRequest;
import timf.hw.model.dto.CompensationResponse;
import timf.hw.model.dto.PanaltyRequest;
import timf.hw.model.dto.PanaltyResponse;
import timf.hw.model.dto.VOCAllResponse;
import timf.hw.model.dto.VOCRequest;
import timf.hw.model.dto.VOCResponse;
import timf.hw.model.dto.VOCShortResponse;
import timf.hw.service.VOCService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class VOCController {

    private final VOCService vOCService;

    @PostMapping("/v1/voc")
    @ApiModelProperty(value = "VOC 등록", notes = "VOC를 등록한다.")
    public VOCResponse addVOC(
        @RequestBody VOCRequest vOCRequest
    ){
        return vOCService.addVOC(vOCRequest);
    }

    @PostMapping("/v1/panalty")
    @ApiModelProperty(value = "panalty 등록", notes = "panalty를 등록한다.")
    public PanaltyResponse addPanalty(
        @RequestBody PanaltyRequest panaltyRequest
    ){
        return vOCService.addPanalty(panaltyRequest);
    }

    @PostMapping("/v1/compensation")
    @ApiModelProperty(value = "compensation 등록", notes = "compensation를 등록한다.")
    public CompensationResponse addCompensation(
        @RequestBody CompensationRequest compensationRequest
    ){
        return vOCService.addCompensation(compensationRequest);
    }

    @GetMapping("/v1/voc/all")
    @ApiModelProperty(value = "VOC 목록을 조회", notes = "VOC 목록을 조회한다.")
    public List<VOCAllResponse> getVocAllResponse(
    ){
        return vOCService.getVocAllResponse();
    }

    @GetMapping("/v1/voc/{voc_id}")
    @ApiModelProperty(value = "VOC 단건 조회(하위 panalty, compensation 목록 포함)", notes = "VOC 단건을 조회(하위 panalty, compensation 목록 포함)한다.")
    public VOCShortResponse getVocResponse(
        @PathVariable long voc_id
    ){
        return vOCService.getVocResponse(voc_id);
    }
}
