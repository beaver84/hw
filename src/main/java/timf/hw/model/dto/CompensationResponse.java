package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CompensationResponse {

    private long compensationSeqno;

    private long vocSeqno;

    private int compensationContent;

    @Builder
    public CompensationResponse(long compensationSeqno, long vocSeqno, int compensationContent) {
        this.compensationSeqno = compensationSeqno;
        this.vocSeqno = vocSeqno;
        this.compensationContent = compensationContent;
    }
}
