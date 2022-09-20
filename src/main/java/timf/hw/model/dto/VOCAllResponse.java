package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VOCAllResponse {

    private long vocSeqno;

    private int attributableCode;

    private String attributablePerson;

    private String attributableContent;

    private boolean objectionYn;

    private int compensationContent;

    @Builder
    public VOCAllResponse(long vocSeqno, int attributableCode, String attributablePerson, String attributableContent, boolean objectionYn, PanaltyResponse panaltyResponse, CompensationResponse compensationResponse, int compensationContent) {
        this.vocSeqno = vocSeqno;
        this.attributableCode = attributableCode;
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.objectionYn = objectionYn;
        this.compensationContent = compensationContent;
    }
}