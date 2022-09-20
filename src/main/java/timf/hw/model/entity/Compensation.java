package timf.hw.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Compensation")
public class Compensation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compensation_seqno")
    private long compensationSeqno;

    @Column(name = "voc_seqno")
    private long vocSeqno;

    @Column(name = "compensation_content")
    private int compensationContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voc_seqno", insertable = false, updatable = false)
    private VOC voc;

    @Builder
    public Compensation(long compensationSeqno, long vocSeqno, int compensationContent, VOC voc) {
        this.compensationSeqno = compensationSeqno;
        this.vocSeqno = vocSeqno;
        this.compensationContent = compensationContent;
        this.voc = voc;
    }
}
