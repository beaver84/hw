package timf.hw.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import timf.hw.model.dto.VOCRequest;
import timf.hw.model.dto.VOCResponse;
import timf.hw.repository.VOCRepository;
import timf.hw.service.VOCService;

@Service
@RequiredArgsConstructor
public class VOCServiceImpl implements VOCService {

    private final VOCRepository vOCRepository;

    @Override
    public VOCResponse addVOC(VOCRequest vOCRequest) {

    }
}
