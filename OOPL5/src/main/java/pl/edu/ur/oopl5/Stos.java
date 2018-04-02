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

public class Stos 
{
    public int wskaznik_stosu=0;
    public int[] tab = new int[6];
    Scanner pobierz = new Scanner(System.in);
    void push()
{
    if (wskaznik_stosu>=6)
    {
        System.out.println("Stos pelny");
    }
    else
    {
        System.out.println("Podaj liczbe, ktora chcesz dodac na stos");
        wskaznik_stosu++;
        tab[wskaznik_stosu] = pobierz.nextInt();
    }
}   
void pop()
{
    if (wskaznik_stosu>=1)
    {
        System.out.println("Usuwam element ze stosu");
        wskaznik_stosu--;
    }
    else
    {
        System.out.println("Stos pusty");
    }
}
void wyswietlstos()
{
    System.out.println("...STOS...");
    for (int i=wskaznik_stosu;i>=1;i--)
    {
        System.out.println(tab[i]);
    }
}
}