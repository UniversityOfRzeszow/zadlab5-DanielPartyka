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
public class Liczba 
{
    public int liczba;
    public Liczba(int liczba)
    {
        this.liczba = 0;
    }
    int[] liczby = new int[10];
    Scanner pobierz = new Scanner(System.in);
    void uzupelnij()
    {
        int n;
        System.out.println("Podaj liczbe");
        n = pobierz.nextInt();        
    }
    int silnia(int n)
    {
        if (n==1) return 1;
        else return n*silnia(n-1); 
    }
}
