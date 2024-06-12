package es.ies.puerto.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ies.puerto.model.entity.Game;

@Repository("gameRepository")
public interface IGameRepository extends JpaRepository<Game, Integer> {
    public Optional<Game> findById(Integer id);

    public List<Game> findAll();

    @SuppressWarnings("unchecked")
    public Game save(Game map);

    public void deleteById(Integer id);
}