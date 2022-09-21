package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import timf.hw.model.enums.AttributableCode;

@Getter
@Setter
@NoArgsConstructor
public class VOCRequest {

    private AttributableCode attributableCode;

    private String attributablePerson;

    private String attributableContent;

    private boolean objectionYn;

    @Builder
    public VOCRequest(AttributableCode attributableCode, String attributablePerson, String attributableContent, boolean objectionYn) {
        this.attributableCode = attributableCode;
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.objectionYn = objectionYn;
    }
}
