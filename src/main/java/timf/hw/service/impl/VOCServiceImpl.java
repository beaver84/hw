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
                .attributablePerson(vOCRequest.getAttributable_person())
                .attributableContent(vOCRequest.getAttributable_content())
                .confirmYn(vOCRequest.isConfirm_yn())
                .objectionYn(vOCRequest.isObjection_yn())
                .build();
        VOC saveResult = vOCRepository.save(vocToEntity);

        return VOCResponse.builder()
                .attributable_content(saveResult.getAttributableContent())
                .attributable_person(saveResult.getAttributablePerson())
                .confirm_yn(saveResult.isConfirmYn())
                .objection_yn(saveResult.isObjectionYn())
                .build();
    }
}
