package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VOCRequest {

    private long voc_seqno;

    private String attributable_person;

    private String attributable_content;

    private boolean confirm_yn;

    private boolean objection_yn;

    @Builder
    public VOCRequest(long voc_seqno, String attributable_person, String attributable_content, boolean confirm_yn, boolean objection_yn) {
        this.voc_seqno = voc_seqno;
        this.attributable_person = attributable_person;
        this.attributable_content = attributable_content;
        this.confirm_yn = confirm_yn;
        this.objection_yn = objection_yn;
    }
}
