package es.ies.puerto.model.dto;

import java.util.Objects;

public class AgentDTO {
    private Integer id;
    private String name;
    private String rarity;
    private int age;
    private int game_id;

    public int getGame_id() {
        return this.game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public AgentDTO() {
    }

    public AgentDTO(Integer id){
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return this.rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AgentDTO)) {
            return false;
        }
        AgentDTO agentDTO = (AgentDTO) o;
        return Objects.equals(id, agentDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", rarity='" + getRarity() + "'" +
                ", age='" + getAge() + "'" +
                ", game_id='" + getGame_id() + "'" +
                "}";
    }
}