package pl.edu.ur.oopl5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
public class Main 
{
   
    
    public static void main(String[] args) 
    {
        // TODO zad 3, 5, 6
       
       int wybor;
       Scanner pobierz = new Scanner(System.in);
       System.out.println("Witaj w programie wcisnij na klawiaturze numery zadadan, ktore cie interesuja np zadanie 3 = 3 itd");
       wybor = pobierz.nextInt();
       switch(wybor)
       {
       case 3:
       Stos stos = new Stos();
       int wybor1;
       do 
       {    
        System.out.println("Witaj w Stosie 1.Dodaj liczbe,2.Usun liczbe,3.Wyswietl stos,4.Zakoncz program");
        wybor1 = pobierz.nextInt();
        switch(wybor1)
        {
            case 1:
            stos.push();
            break;
            case 2:
            stos.pop();
            break;
            case 3:
            stos.wyswietlstos();
            break;
        }
       }
       while(wybor!=4);
           break;
       case 4:    
       Data data = new Data();
       data.pokazdate();
       break;
       case 5:
       int a,b;
       Pracownik[] pracownik = new Pracownik[100];
       Firma firma = new Firma();
       System.out.println("Podaj ilu pracownikow chcesz dodac:");
       a = pobierz.nextInt();
       for (int i=0;i<a;i++)
       {
           pracownik[i] = new Pracownik("","",30);
           pracownik[i].pobierz();
       }
       System.out.println("Podaj ilu pracownikow chcesz wyswietlic");
       b = pobierz.nextInt();
       for (int i=0;i<b;i++)
       {
           pracownik[i].wyswietl();
       }
       break;
       case 6:
       int g;
       Liczba l1 = new Liczba(10);
       l1.uzupelnij();
       System.out.println("Podaj przez jaka liczbe chcesz pomonozyc ta obecna:");
       g = pobierz.nextInt();
       l1.liczba*=g;
       System.out.println("Silnia z twojej liczby to: "+l1.silnia(g));
       break;
       }
}
}
