/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
/**
 *
 * @author Galan
 */
public class Firma 
{
    private String nazwafirmy;
    private String imie;
    private String nazwisko;
    private int wiek;
    public int zarobki;
    public String getNazwa_firmy()
    {
        return nazwafirmy;
    }
    public void setNazwafirmy(String nazwafirmy)
    {
        this.nazwafirmy = "POL BUD";
    }
     public String getImie()
    {
        return imie;
    }
    public void setImie(String imie)
    {
        this.imie = "Adam";
    }
     public String getNazwisko()
    {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko)
    {
        this.nazwafirmy = "Szef";
    }
     public int getWiek()
    {
        return wiek;
    }
    public void setWiek(int wiek)
    {
        this.wiek = 50;
    }
}
