/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Galan
 */
public class Data 
{
    void pokazdate()
    {
       Date currentDate = new Date();
       Calendar calendar = Calendar.getInstance();
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
       String dateString = dateFormat.format(currentDate);
       System.out.println(dateString);
       System.out.println("Data dzisiejsza: " + dateFormat.format(calendar.getTime()));
       calendar.add(Calendar.DAY_OF_MONTH, 7 );
       System.out.println("Data za tydzien: " + dateFormat.format(calendar.getTime()));  
       calendar = Calendar.getInstance();
       System.out.println("Data dzisiejsza: " + dateFormat.format(calendar.getTime()));
       calendar.add(Calendar.DAY_OF_MONTH, -7 );
       System.out.println("Data tydzien temu: " + dateFormat.format(calendar.getTime())); 
    }
}
