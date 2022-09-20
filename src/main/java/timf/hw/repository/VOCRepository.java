package timf.hw.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import timf.hw.model.entity.VOC;

public interface VOCRepository extends JpaRepository<VOC, Long> {
}
