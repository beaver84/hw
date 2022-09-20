package timf.hw.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import timf.hw.model.entity.Panalty;
import timf.hw.model.entity.VOC;

import java.util.List;

public interface PanaltyRepository extends JpaRepository<Panalty, Long> {
    List<Panalty> findByVocSeqno(long voc_id);
}
