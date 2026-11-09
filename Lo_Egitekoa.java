/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gaztelekua_err1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author amaia
 */
public class Lo_Egitekoa extends Ekintza
{
    private String Egun_kop;
    private String Udaleku_izena;
    
    public Lo_Egitekoa()
    {
        super();
        Egun_kop="1";
        Udaleku_izena="Udalekua";
    }//eraikitzailea
    
    public Lo_Egitekoa(String e, String u)
    {
        super();
        this.Egun_kop=e;
        this.Udaleku_izena=u;
    }//eraikitzailea parametroekin
    
    public String setEkintza_id()
    {
        super.setEkintza_id();
        return "";
    }//setEkintza_id
    
    public String setEkintza_id(String i)
    {
        super.setEkintza_id(i);
        return "";
    }//setEkintza_id parametroekin
    
    public String setLekua()
    {
        super.setLekua();
        return "";
    }//setLekua
    
    public String setLekua(String L)
    {
        super.setLekua(L);
        return "";
    }//setLekua parametroekin
    
    public String setIzaera()
    {
       super.setIzaera();
       return "";
    }//setIzaera
    
    public String setIzaera(String iz)
    {
        super.setIzaera(iz);
        return "";
    }//setIzaera parametroekin
    
    public String setMota()
    {
        super.setMota();
        return "";
    }//setMota
    
    public String setMota(String m)
    {
        super.setMota(m);
        return "";
    }//setMota parametroekin
    
    public String setUdaleku_izena()
    {
        String u;
        System.out.println("Sartu ekintzaren id-a: ");
        Scanner sc= new Scanner(System.in);
        u=sc.nextLine();
        Udaleku_izena=u;
        
        return Udaleku_izena;
    }//setudaleku_izena
    
    public String setUdaleku_izena(String u)
    {
        this.Udaleku_izena=u;
        return Udaleku_izena;
    }//setUdaleku_izena parametroekin
    
    public LocalDate setEkintza_data()
    {
        super.setEkintza_data();
        return null;
    }//setEkintza_data
    
    public LocalDate setEkintza_data(LocalDate d)
    {
        super.setEkintza_data(d);
        return null;
    }//setEkintza_data parametroekin
    
    public String setEgun_kop()
    {
        String ek;
        System.out.println("Sartu ekintzak iraugo dituen egunen kopurua: ");
        Scanner sc= new Scanner(System.in);
        ek=sc.nextLine();
        Egun_kop=ek;
        
        return Egun_kop;
    }//setEgun_kop
    
    public String setEgun_kop(String ek)
    {
        this.Egun_kop=ek;
        return Egun_kop;
    }//setEgun_kop parametroekin
    
    public String getEkintza_id()
    {
       super.getEkintza_id();
       return "";
    }//getEkintza_id
    
    public String getLekua()
    {
        super.getLekua();
        return"";
    }//getLekua
    
    public String getIzaera()
    {
        super.getIzaera();
        return "";
    }//getIzaera
    
    public String getMota()
    {
        super.getMota();
        return "";
    }//getMota
    
    public String getUdaleku_izena()
    {
        System.out.println("Udalekua: "+Udaleku_izena);
        return Udaleku_izena;
    }//getUdaleku_izena
    
    public LocalDate getEkintza_data()
    {
        super.getEkintza_data();
        return null;
    }//getEkintza_data
    
    public String getEgun_kop()
    {
        System.out.println("Ekintzak iraungo dituen egunak: "+Egun_kop);
        return "";
    }//getEgun_kop
    
    public void getAll_Lo_egitekoa()
    {
       super.getAll_Ekintza();
       getUdaleku_izena();
       getEgun_kop();
    }//getAll_Lo_egitekoa
}//class
