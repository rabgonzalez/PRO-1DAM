package es.ies.puerto.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ies.puerto.model.entity.Gun;

@Repository("gunRepository")
public interface IGunRepository extends JpaRepository<Gun, Integer> {
    public Optional<Gun> findById(Integer id);

    public List<Gun> findAll();

    @SuppressWarnings("unchecked")
    public Gun save(Gun agent);

    public void deleteById(Integer id);
}