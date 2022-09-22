package timf.hw.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CompensationRequest {

    @ApiModelProperty("VOC_ID")
    private long vocSeqno;

    @ApiModelProperty("배상정보 내용")
    private int compensationContent;

    @Builder
    public CompensationRequest(long vocSeqno, int compensationContent) {
        this.vocSeqno = vocSeqno;
        this.compensationContent = compensationContent;
    }
}
