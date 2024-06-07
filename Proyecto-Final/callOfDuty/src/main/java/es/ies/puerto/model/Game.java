package es.ies.puerto.model;
import java.util.Objects;

public class Game {
    private String gameName;
    private String releaseDate;
    private Float rating;

    public Game() {
    }

    public Game(String gameName){
        this.gameName = gameName;
    }

    public Game(String gameName, String releaseDate, Float rating) {
        this.gameName = gameName;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Float getRating() {
        return this.rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(gameName, game.gameName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName);
    }

    @Override
    public String toString() {
        return "{" +
            " gameName='" + getGameName() + "'" +
            ", releaseDate='" + getReleaseDate() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }    
}
