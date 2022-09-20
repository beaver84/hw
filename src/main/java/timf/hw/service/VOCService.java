package timf.hw.service;

import timf.hw.model.dto.CompensationRequest;
import timf.hw.model.dto.CompensationResponse;
import timf.hw.model.dto.PanaltyRequest;
import timf.hw.model.dto.PanaltyResponse;
import timf.hw.model.dto.VOCAllResponse;
import timf.hw.model.dto.VOCRequest;
import timf.hw.model.dto.VOCResponse;

import java.util.List;

public interface VOCService {
    VOCResponse addVOC(VOCRequest vOCRequest);

    PanaltyResponse addPanalty(PanaltyRequest panaltyRequest);

    CompensationResponse addCompensation(CompensationRequest compensationRequest);

    List<VOCAllResponse> getVocAllResponse();
}
