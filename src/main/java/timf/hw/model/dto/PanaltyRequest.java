package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PanaltyRequest {

    private long vocSeqno;

    private boolean confirmYn;

    private String panaltyContent;

    @Builder
    public PanaltyRequest(long vocSeqno, boolean confirmYn, String panaltyContent) {
        this.vocSeqno = vocSeqno;
        this.confirmYn = confirmYn;
        this.panaltyContent = panaltyContent;
    }
}
