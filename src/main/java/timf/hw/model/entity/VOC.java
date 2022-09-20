package timf.hw.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "VOC")
public class VOC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voc_seqno")
    private long vocSeqno;

    @Column(name = "attributable_person")
    private String attributablePerson;

    @Column(name = "attributable_content")
    private String attributableContent;

    @Column(name = "confirm_yn")
    private boolean confirmYn;

    @Column(name = "objection_yn")
    private boolean objectionYn;

    @Builder
    public VOC(long vocSeqno, String attributablePerson, String attributableContent, boolean confirmYn, boolean objectionYn) {
        this.vocSeqno = vocSeqno;
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.confirmYn = confirmYn;
        this.objectionYn = objectionYn;
    }
}
