package timf.hw.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class PanaltyRequest {

    @ApiModelProperty("VOC_ID")
    private long vocSeqno;

    @ApiModelProperty("기사 확인 여부")
    private boolean confirmYn;

    @ApiModelProperty("패널티 내용")
    private String panaltyContent;

    public long getVocSeqno() {
        return vocSeqno;
    }

    public boolean isConfirmYn() {
        return confirmYn;
    }

    public String getPanaltyContent() {
        return panaltyContent;
    }

    public void setVocSeqno(long vocSeqno) {
        this.vocSeqno = vocSeqno;
    }

    public void setConfirmYn() {
        //처음에 배송기사 분이 확인 전까지는 false로 지정
        this.confirmYn = false;
    }

    public void setPanaltyContent(String panaltyContent) {
        this.panaltyContent = panaltyContent;
    }

    @Builder
    public PanaltyRequest(long vocSeqno, boolean confirmYn, String panaltyContent) {
        this.vocSeqno = vocSeqno;
        this.confirmYn = confirmYn;
        this.panaltyContent = panaltyContent;
    }
}
