/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gaztelekua_err1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author amaia
 */
public class Ekintza 
{
    private String Ekintza_id;
    private String Lekua;
    private LocalDate Ekintza_data;
    private String Izaera;
    private String Mota;
    private double Prezioa;
    
    public Ekintza()
    {
        Ekintza_id="0A";
        Lekua="Non";
        Ekintza_data= LocalDate.now();
        Izaera="Ezezaguna";
        Mota="Zelakoa"; 
        Prezioa=0.00;
    }//eraikitzailea.
    
    public Ekintza (String i, String L, LocalDate d, String iz, String m, double p)
    {
        this.Ekintza_id=i;
        this.Lekua=L;
        this.Ekintza_data=d;
        this.Izaera=iz;
        this.Mota=m;
        this.Prezioa=p;
        
    }//eraikitzailea parametroekin
    
    public String setEkintza_id()
    {
         String i;
         System.out.println("Sartu ekintzaren id-a: ");
         Scanner sc= new Scanner(System.in);
         i=sc.nextLine();
         Ekintza_id=i;
         
         return Ekintza_id;
    }//setEkintza_id
    
    public String setEkintza_id(String i)
    {
        this.Ekintza_id=i;
        return Ekintza_id;
    }//setEkintza_id parametroekin
    
    public String setLekua()
    {
        String L;
        System.out.println("Sartu ekintzaren id-a: ");
        Scanner sc= new Scanner(System.in);
        L=sc.nextLine();
        Lekua=L;
        
        return Lekua;
    }//setLekua
    
    public String setLekua(String L)
    {
        this.Lekua=L;
        return Lekua;
    }//setLekua parametroekin
    
    public LocalDate setEkintza_data()
    {
        LocalDate d;

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Sartu ekintzaren data (dd/mm/aaaa): ");
        String entrada = sc.nextLine();

        try 
        {
            d = LocalDate.parse(entrada, formato);
            System.out.println("Data ondo irakurrita: " + d);
            Ekintza_data=d;
        }//try
        catch (DateTimeParseException e) 
        {
            System.out.println("Dataren formatua okerra da.");
        }//catch
        return Ekintza_data;
    }//setEkintza_data
    
    public LocalDate setEkintza_data(LocalDate d)
    {
        this.Ekintza_data=d;
        return Ekintza_data;
    }//setEkintza_data parametroekin
    
    public String setIzaera()
    {
        String iz;
        System.out.println("Sartu ekintzaren id-a: ");
        Scanner sc= new Scanner(System.in);
        iz=sc.nextLine();
        Izaera=iz;
        
        return Izaera;
    }//setIzaera
    
    public String setIzaera(String iz)
    {
        this.Izaera=iz;
        return Izaera;
    }//setIzaera parametroekin
    
    public String setMota()
    {
        String m;
        System.out.println("Sartu ekintzaren id-a: ");
        Scanner sc= new Scanner(System.in);
        m=sc.nextLine();
        Mota=m;
        
        return Mota;
    }//setMota
    
    public String setMota(String m)
    {
        this.Mota=m;
        return Mota;
    }//setMota parametroekin
    
    public double setPrezioa()
    {
        double p;
        Scanner sc= new Scanner(System.in);
        System.out.println("Sartu ekintzaren prezioa: ");
        p=sc.nextDouble();
        Prezioa=p;
        
        return Prezioa;
    }//setPrezioa
    
    public double setPrezioa(double p)
    {
        this.Prezioa=p;
        return Prezioa;
    }//setPrezioa parametroekin
    
    
    
    public String getEkintza_id()
    {
        
        return Ekintza_id;
    }//getEkintza_id
    
    public String getLekua()
    {
       
        return Lekua;
    }//getLekua
    
    public LocalDate getEkintza_data()
    {
        
        return Ekintza_data;
    }//getEkintza_data
    
    public String getIzaera()
    {
      
      return Izaera;
    }//getIzaera
    
    public String getMota()
    {
       
       return Mota;
    }//getMota
    
    public double getPrezioa()
    {
        return Prezioa;
    }//getPrezioa
    
    public void getAll_Ekintza()
    {
      getEkintza_id();
      getLekua();
      getEkintza_data();
      getIzaera();
      getMota();
      getPrezioa();
    }//getAll_Ekintza
}//class
