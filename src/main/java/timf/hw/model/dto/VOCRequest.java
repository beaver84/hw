package timf.hw.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VOCRequest {

    private String attributablePerson;

    private String attributableContent;

    private boolean objectionYn;

    @Builder
    public VOCRequest(String attributablePerson, String attributableContent, boolean objectionYn) {
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.objectionYn = objectionYn;
    }
}
