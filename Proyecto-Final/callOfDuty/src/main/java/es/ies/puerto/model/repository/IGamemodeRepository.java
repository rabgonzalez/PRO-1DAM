package es.ies.puerto.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ies.puerto.model.entity.Gamemode;

@Repository("gamemodeRepository")
public interface IGamemodeRepository extends JpaRepository<Gamemode, Integer> {
    public Optional<Gamemode> findById(Integer id);

    public List<Gamemode> findAll();

    @SuppressWarnings("unchecked")
    public Gamemode save(Gamemode map);

    public void deleteById(Integer id);
}