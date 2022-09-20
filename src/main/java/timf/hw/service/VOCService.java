package timf.hw.service;

import timf.hw.model.dto.VOCRequest;
import timf.hw.model.dto.VOCResponse;

public interface VOCService {
    VOCResponse addVOC(VOCRequest vOCRequest);
}
