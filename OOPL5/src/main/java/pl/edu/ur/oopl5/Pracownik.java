/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Galan
 */
public class Pracownik extends Firma
{
    public String imie;
    public String nazwisko;
    public int wiek;
    Scanner pobierz = new Scanner(System.in);
    public Pracownik (String imie,String nazwisko,int wiek)
    {
        this.imie = "";
        this.nazwisko = "";
        this.wiek = 30;
    }
    void pobierz()
    {
        System.out.println("Podaj imie pracownika");
        imie = pobierz.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        nazwisko = pobierz.nextLine();
        System.out.println("Podaj wiek pracownika");
        wiek = pobierz.nextInt();
        System.out.println("Ustal zarobki pracownika");
        zarobki = pobierz.nextInt();
    }
    void wyswietl()
    {
        System.out.println("Imie pracownika nr" +imie);
        System.out.println("Nazwisko pracownika "+nazwisko);
        System.out.println("Wiek pracownika "+wiek);
    }
}
