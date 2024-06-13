package es.ies.puerto.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;

import es.ies.puerto.model.dto.AgentDTO;
import es.ies.puerto.model.dto.GameDTO;
import es.ies.puerto.model.dto.GamemodeDTO;
import es.ies.puerto.model.dto.GunDTO;
import es.ies.puerto.model.dto.MapDTO;
import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gamemode;
import es.ies.puerto.model.entity.Gun;
import es.ies.puerto.model.entity.Map;

public abstract class InitializeHelp {
    private static final String COUNTRY = "España";
    public static final float RATING = 5f;
    public static final int AGE = 20;
    public static final String TYPE = "type";
    public static final String RELEASEDATE = "2013-09-16";
    public static final String RARITY = "rarity";
    public static final String NAME = "name";
    public static final int ID = 1;
    public Agent agent;
    public AgentDTO agentDTO;
    public Gun gun;
    public GunDTO gunDTO;
    public Game game;
    public GameDTO gameDTO;
    public Gamemode gamemode;
    public GamemodeDTO gamemodeDTO;
    public Map map;
    public MapDTO mapDTO;

    public Set<Agent> agents;
    public Set<Integer> agents_id;
    public Set<Gun> guns;
    public Set<Integer> guns_id;
    public Set<Game> games;
    public Set<Integer> games_id;
    public Set<Gamemode> gamemodes;
    public Set<Integer> gamemodes_id;
    public Set<Map> maps;
    public Set<Integer> maps_id;

    @BeforeEach
    public void beforeEach() {
        agent = new Agent();
        agent.setId(ID);
        agentDTO = new AgentDTO(ID);

        gun = new Gun();
        gun.setId(ID);
        gunDTO = new GunDTO(ID);

        game = new Game();
        game.setId(ID);
        gameDTO = new GameDTO(ID);

        gamemode = new Gamemode();
        gamemode.setId(ID);
        gamemodeDTO = new GamemodeDTO(ID);

        map = new Map();
        map.setId(ID);
        mapDTO = new MapDTO(ID);

        agents = new HashSet<>(Arrays.asList(agent));
        agents_id = new HashSet<>(Arrays.asList(agent.getId()));

        guns = new HashSet<>(Arrays.asList(gun));
        guns_id = new HashSet<>(Arrays.asList(gun.getId()));

        games = new HashSet<>(Arrays.asList(game));
        games_id = new HashSet<>(Arrays.asList(game.getId()));

        gamemodes = new HashSet<>(Arrays.asList(gamemode));
        gamemodes_id = new HashSet<>(Arrays.asList(gamemode.getId()));

        maps = new HashSet<>(Arrays.asList(map));
        maps_id = new HashSet<>(Arrays.asList(map.getId()));

        agent.setAge(AGE);
        agent.setName(NAME);
        agent.setRarity(RARITY);
        agent.setGame(game);
        agentDTO.setAge(AGE);
        agentDTO.setName(NAME);
        agentDTO.setRarity(RARITY);
        agentDTO.setGame_id(game.getId());

        gun.setName(NAME);
        gun.setRarity(RARITY);
        gun.setType(TYPE);
        gun.setGames(games);
        gunDTO.setName(NAME);
        gunDTO.setRarity(RARITY);
        gunDTO.setType(TYPE);
        gunDTO.setGames_id(games_id);

        game.setGameName(NAME);
        game.setRating(RATING);
        game.setReleaseDate(RELEASEDATE);
        game.setAgents(agents);
        game.setGamemodes(gamemodes);
        game.setGuns(guns);
        game.setMaps(maps);
        gameDTO.setGameName(NAME);
        gameDTO.setRating(RATING);
        gameDTO.setReleaseDate(RELEASEDATE);
        gameDTO.setAgents_id(agents_id);
        gameDTO.setGamemodes_id(gamemodes_id);
        gameDTO.setGuns_id(guns_id);
        gameDTO.setMaps_id(maps_id);

        gamemode.setName(NAME);
        gamemode.setGame(games);
        gamemode.setMaps(maps);
        gamemodeDTO.setName(NAME);
        gamemodeDTO.setGames_id(games_id);
        gamemodeDTO.setMaps_id(maps_id);

        map.setName(NAME);
        map.setCountry(COUNTRY);
        map.setGame(game);
        map.setGamemodes(gamemodes);
        mapDTO.setName(NAME);
        mapDTO.setCountry(COUNTRY);
        mapDTO.setGame_id(game.getId());
        mapDTO.setGamemodes_id(gamemodes_id);
    }
}
