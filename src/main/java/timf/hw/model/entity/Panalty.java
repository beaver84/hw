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
@Table(name = "panalty")
public class Panalty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "panalty_seqno")
    private long panaltySeqno;

    @Column(name = "voc_seqno")
    private long vocSeqno;

    @Column(name = "confirm_yn")
    private boolean confirmYn;

    @Column(name = "panalty_content")
    private String panaltyContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voc_seqno", insertable = false, updatable = false)
    private VOC voc;

    @Builder
    public Panalty(long panaltySeqno, long vocSeqno, boolean confirmYn, String panaltyContent, VOC voc) {
        this.panaltySeqno = panaltySeqno;
        this.vocSeqno = vocSeqno;
        this.confirmYn = confirmYn;
        this.panaltyContent = panaltyContent;
        this.voc = voc;
    }
}
