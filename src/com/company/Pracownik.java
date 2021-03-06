package com.company;

/**
 * Created by user on 2016-05-04.
 */
public class Pracownik {
    private String imie;
    private String nazwisko;
    private double placa;
    private char plec;
    private int dzial;

    public Pracownik(String imie, String nazwisko, double placa, char plec, int dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }

    public double getPlaca() {
        return placa;
    }

    public int getDzial() {
        return dzial;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", placa=" + placa +
                ", plec=" + plec +
                ", dzial=" + dzial +
                '}';
    }

    public boolean czyPracujeWDziale(Pracownik pracownik, int dzial) {
        if (pracownik.dzial == dzial) return true;
        return false;
    }
}
