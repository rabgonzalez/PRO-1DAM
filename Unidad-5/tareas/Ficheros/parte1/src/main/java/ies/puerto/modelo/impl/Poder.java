package ies.puerto.modelo.impl;

import java.util.Objects;

import org.simpleframework.xml.Root;

@Root(name="poder")
public class Poder {
    private String poder;   

    public Poder() {
    }

    public Poder(String poder) {
        this.poder = poder;
    }

    public String getPoder() {
        return this.poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Poder)) {
            return false;
        }
        Poder poder = (Poder) o;
        return Objects.equals(poder, poder.poder);
    }

    @Override
    public String toString() {
        return "{" +
            " poder='" + getPoder() + "'" +
            "}";
    }
}
