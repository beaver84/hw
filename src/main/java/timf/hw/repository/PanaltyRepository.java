package timf.hw.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import timf.hw.model.entity.Panalty;
import timf.hw.model.entity.VOC;

public interface PanaltyRepository extends JpaRepository<Panalty, Long> {
}
