package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CompensationRequest {

    private long vocSeqno;

    private int compensationContent;

    @Builder
    public CompensationRequest(long vocSeqno, int compensationContent) {
        this.vocSeqno = vocSeqno;
        this.compensationContent = compensationContent;
    }
}
