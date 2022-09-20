package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PanaltyResponse {

    private long panaltySeqno;

    private long vocSeqno;

    private boolean confirmYn;

    private String panaltyContent;

    @Builder
    public PanaltyResponse(long panaltySeqno, long vocSeqno, boolean confirmYn, String panaltyContent) {
        this.panaltySeqno = panaltySeqno;
        this.vocSeqno = vocSeqno;
        this.confirmYn = confirmYn;
        this.panaltyContent = panaltyContent;
    }
}
