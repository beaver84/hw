package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import timf.hw.model.entity.Compensation;
import timf.hw.model.entity.Panalty;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class VOCShortResponse {

    private long vocSeqno;

    private int attributableCode;

    private String attributablePerson;

    private String attributableContent;

    private boolean objectionYn;

    private List<CompensationResponse> compensations;

    private List<PanaltyResponse> panaltys;

    @Builder
    public VOCShortResponse(long vocSeqno, int attributableCode, String attributablePerson, String attributableContent, boolean objectionYn, List<CompensationResponse> compensations, List<PanaltyResponse> panaltys) {
        this.vocSeqno = vocSeqno;
        this.attributableCode = attributableCode;
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.objectionYn = objectionYn;
        this.compensations = compensations;
        this.panaltys = panaltys;
    }
}