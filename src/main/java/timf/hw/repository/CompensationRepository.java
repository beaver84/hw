package timf.hw.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import timf.hw.model.entity.Compensation;
import timf.hw.model.entity.VOC;

import java.util.List;

public interface CompensationRepository extends JpaRepository<Compensation, Long> {
    List<Compensation> findByVocSeqno(long voc_id);
}
