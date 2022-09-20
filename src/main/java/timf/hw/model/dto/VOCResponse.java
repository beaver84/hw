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

    private String attributablePerson;

    private String attributableContent;

    private boolean confirmYn;

    private boolean objectionYn;

    @Builder
    public VOCResponse(long vocSeqno, String attributablePerson, String attributableContent, boolean objectionYn) {
        this.vocSeqno = vocSeqno;
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.confirmYn = confirmYn;
        this.objectionYn = objectionYn;
    }
}