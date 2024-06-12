package es.ies.puerto.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ies.puerto.model.entity.Map;

@Repository("mapRepository")
public interface IMapRepository extends JpaRepository<Map, Integer> {
    public Optional<Map> findById(Integer id);

    public List<Map> findAll();

    @SuppressWarnings("unchecked")
    public Map save(Map map);

    public void deleteById(Integer id);
}