package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VOCResponse {

    private long vocSeqno;

    private int attributableCode;

    private String attributablePerson;

    private String attributableContent;

    private boolean objectionYn;

    @Builder
    public VOCResponse(long vocSeqno, int attributableCode, String attributablePerson, String attributableContent, boolean objectionYn) {
        this.vocSeqno = vocSeqno;
        this.attributableCode = attributableCode;
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.objectionYn = objectionYn;
    }
}