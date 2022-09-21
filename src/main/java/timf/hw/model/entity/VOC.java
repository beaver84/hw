package timf.hw.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import timf.hw.model.enums.AttributableCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "attributable_code")
    private AttributableCode attributableCode;

    @Column(name = "attributable_person")
    private String attributablePerson;

    @Column(name = "attributable_content")
    private String attributableContent;

    @Column(name = "objection_yn")
    private boolean objectionYn;

    @OneToMany(mappedBy = "compensationSeqno")
    private List<Compensation> compensation = new ArrayList<>();

    @OneToMany(mappedBy = "panaltySeqno")
    private List<Panalty> panalty = new ArrayList<>();

    @Builder
    public VOC(long vocSeqno, AttributableCode attributableCode, String attributablePerson, String attributableContent, boolean objectionYn, List<Compensation> compensation, List<Panalty> panalty) {
        this.vocSeqno = vocSeqno;
        this.attributableCode = attributableCode;
        this.attributablePerson = attributablePerson;
        this.attributableContent = attributableContent;
        this.objectionYn = objectionYn;
        this.compensation = compensation;
        this.panalty = panalty;
    }
}
