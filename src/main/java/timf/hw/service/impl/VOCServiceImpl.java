package timf.hw.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import timf.hw.model.dto.CompensationRequest;
import timf.hw.model.dto.CompensationResponse;
import timf.hw.model.dto.PanaltyRequest;
import timf.hw.model.dto.PanaltyResponse;
import timf.hw.model.dto.VOCAllResponse;
import timf.hw.model.dto.VOCRequest;
import timf.hw.model.dto.VOCResponse;
import timf.hw.model.dto.VOCShortResponse;
import timf.hw.model.entity.Compensation;
import timf.hw.model.entity.Panalty;
import timf.hw.model.entity.VOC;
import timf.hw.repository.CompensationRepository;
import timf.hw.repository.PanaltyRepository;
import timf.hw.repository.VOCRepository;
import timf.hw.service.VOCService;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.reflections.util.ConfigurationBuilder.*;

@RequiredArgsConstructor
@Service
public class VOCServiceImpl implements VOCService {

    private final VOCRepository vOCRepository;
    private final PanaltyRepository panaltyRepository;
    private final CompensationRepository compensationRepository;

    @Override
    public VOCResponse addVOC(VOCRequest vOCRequest) {
        VOC vocToEntity = VOC.builder()
                .attributableCode(vOCRequest.getAttributableCode())
                .attributablePerson(vOCRequest.getAttributablePerson())
                .attributableContent(vOCRequest.getAttributableContent())
                .objectionYn(vOCRequest.isObjectionYn())
                .build();
        VOC saveResult = vOCRepository.save(vocToEntity);

        return VOCResponse.builder()
                .attributableCode(saveResult.getAttributableCode())
                .attributablePerson(saveResult.getAttributablePerson())
                .attributableContent(saveResult.getAttributableContent())
                .objectionYn(saveResult.isObjectionYn())
                .vocSeqno(saveResult.getVocSeqno())
                .build();
    }

    @Override
    public PanaltyResponse addPanalty(PanaltyRequest panaltyRequest) {
        Panalty panaltyToEntity = Panalty.builder()
                .vocSeqno(panaltyRequest.getVocSeqno())
                .confirmYn(false)
                .panaltyContent(panaltyRequest.getPanaltyContent())
                .build();
        Panalty saveResult = panaltyRepository.save(panaltyToEntity);

        return PanaltyResponse.builder()
                .panaltySeqno(saveResult.getPanaltySeqno())
                .vocSeqno(saveResult.getVocSeqno())
                .confirmYn(saveResult.isConfirmYn())
                .panaltyContent(saveResult.getPanaltyContent())
                .build();
    }

    @Override
    public CompensationResponse addCompensation(CompensationRequest compensationRequest) {
        Compensation compensationToEntity = Compensation.builder()
                .vocSeqno(compensationRequest.getVocSeqno())
                .compensationContent(compensationRequest.getCompensationContent())
                .build();

        Compensation saveResult = compensationRepository.save(compensationToEntity);

        return CompensationResponse.builder()
                .compensationSeqno(saveResult.getCompensationSeqno())
                .vocSeqno(saveResult.getVocSeqno())
                .compensationContent(saveResult.getCompensationContent())
                .build();
    }

    @Override
    public List<VOCAllResponse> getVocAllResponse() {
        List<VOC> vocList = vOCRepository.findAll();
        List<VOCAllResponse> result = new ArrayList<>();
        for (VOC voc : vocList) {

            VOCAllResponse vocResponse = VOCAllResponse.builder()
                    .vocSeqno(voc.getVocSeqno())
                    .attributableCode(voc.getAttributableCode())
                    .attributableContent(voc.getAttributableContent())
                    .attributablePerson(voc.getAttributablePerson())
                    .objectionYn(voc.isObjectionYn())
                    .build();
            result.add(vocResponse);
        }
        return result;
    }

    @Override
    public VOCShortResponse getVocResponse(long vocId) {
        Optional<VOC> voc = vOCRepository.findById(vocId);
        VOC findVoc = voc.get();

        List<Panalty> panaltys = panaltyRepository.findByVocSeqno(vocId);
        List<PanaltyResponse> panaltyResponseList = new ArrayList<>();
        for (Panalty panalty : panaltys) {
            PanaltyResponse response = PanaltyResponse.builder()
                    .confirmYn(panalty.isConfirmYn())
                    .vocSeqno(panalty.getVocSeqno())
                    .panaltyContent(panalty.getPanaltyContent())
                    .panaltySeqno(panalty.getPanaltySeqno())
                    .build();
            panaltyResponseList.add(response);
        }

        List<Compensation> compensations = compensationRepository.findByVocSeqno(vocId);
        List<CompensationResponse> compensationResponseList = new ArrayList<>();
        for (Compensation compensation : compensations) {
            CompensationResponse response = CompensationResponse.builder()
                    .vocSeqno(compensation.getVocSeqno())
                    .compensationContent(compensation.getCompensationContent())
                    .compensationSeqno(compensation.getCompensationSeqno())
                    .build();
            compensationResponseList.add(response);
        }

        findVoc.setPanalty(panaltys);
        findVoc.setCompensation(compensations);

        return VOCShortResponse.builder()
                .compensations(compensationResponseList)
                .panaltys(panaltyResponseList)
                .vocSeqno(vocId)
                .attributableCode(findVoc.getAttributableCode())
                .objectionYn(findVoc.isObjectionYn())
                .attributableContent(findVoc.getAttributableContent())
                .attributablePerson(findVoc.getAttributablePerson())
                .build();
    }

    @Override
    public PanaltyResponse modifyPanaltyConfirm(long panaltyId, boolean panaltycConfirmYn) {
        Panalty findPanalty = panaltyRepository.findById(panaltyId).orElseThrow(EntityNotFoundException::new);

        findPanalty.setConfirmYn(panaltycConfirmYn);
        Panalty savedPanalty = panaltyRepository.save(findPanalty);

        return PanaltyResponse.builder()
                .panaltySeqno(panaltyId)
                .vocSeqno(savedPanalty.getVocSeqno())
                .confirmYn(savedPanalty.isConfirmYn())
                .panaltyContent(savedPanalty.getPanaltyContent())
                .build();
    }
}
