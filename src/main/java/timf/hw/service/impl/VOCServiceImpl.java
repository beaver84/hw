package timf.hw.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import timf.hw.model.dto.VOCRequest;
import timf.hw.model.dto.VOCResponse;
import timf.hw.model.entity.VOC;
import timf.hw.repository.VOCRepository;
import timf.hw.service.VOCService;

@Service
@RequiredArgsConstructor
public class VOCServiceImpl implements VOCService {

    private final VOCRepository vOCRepository;

    @Override
    public VOCResponse addVOC(VOCRequest vOCRequest) {
        VOC vocToEntity = VOC.builder()
                .attributablePerson(vOCRequest.getAttributablePerson())
                .attributableContent(vOCRequest.getAttributableContent())
                .confirmYn(vOCRequest.isConfirmYn())
                .objectionYn(vOCRequest.isObjectionYn())
                .build();
        VOC saveResult = vOCRepository.save(vocToEntity);

        return VOCResponse.builder()
                .attributableContent(saveResult.getAttributableContent())
                .attributablePerson(saveResult.getAttributablePerson())
                .confirmYn(saveResult.isConfirmYn())
                .objectionYn(saveResult.isObjectionYn())
                .build();
    }
}
