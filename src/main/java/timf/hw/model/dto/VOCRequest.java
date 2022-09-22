package timf.hw.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import timf.hw.model.enums.AttributableCode;

@Getter
@Setter
@NoArgsConstructor
public class VOCRequest {

    @ApiModelProperty("귀책 코드")
    private AttributableCode attributableCode;

    @ApiModelProperty("귀책 당사자")
    private String attributablePerson;

    @ApiModelProperty("귀책 내용")
    private String attributableContent;

    @ApiModelProperty("이의제기 여부")
    private boolean objectionYn;

    @Builder
    public VOCRequest(AttributableCode attributableCode, String attributablePerson, String attributableContent, boolean objectionYn) {
        this.attributableCode = attributableCode;
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.objectionYn = objectionYn;
    }
}
