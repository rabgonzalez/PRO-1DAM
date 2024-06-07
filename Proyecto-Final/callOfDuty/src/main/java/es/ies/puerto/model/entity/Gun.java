package es.ies.puerto.model.entity;
import java.util.Objects;

public class Gun {
    private String name;
    private String type;
    private String rarity;

    public Gun() {
    }

    public Gun(String name){
        this.name = name;
    }

    public Gun(String name, String type, String rarity) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return this.rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gun)) {
            return false;
        }
        Gun gun = (Gun) o;
        return Objects.equals(name, gun.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }    
}
