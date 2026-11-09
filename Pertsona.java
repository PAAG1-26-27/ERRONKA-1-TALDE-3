/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.erronka01_klaseak;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
/**
 *
 * @author ibarra.andoni
 */
public class Pertsona {

    private String NAN;
    private String Izena;
    private String Abizena;
    private LocalDate Jaiotze_data;
    private String Telefonoa;
    Scanner sc = new Scanner(System.in);
    
    
    public Pertsona(){
        NAN = ("ABCDEFGH1");
        Izena = ("Izena");
        Abizena = ("Abizena");
        Jaiotze_data = LocalDate.parse("0018-08-01");
        Telefonoa = ("123456789");
    }
    
    public Pertsona (String N, String I, String a, LocalDate D, String t) {
        NAN=N;
        Izena=I;
        Abizena=a;
        Jaiotze_data=D;
        Telefonoa=t;
    }
    
    public String setNAN (){
        System.out.println("Sartu NAN zenbakia");
        String N;
        N = sc.nextLine();
        return NAN = N;
    }
    
    public String setNAN (String N){
        return NAN = N;
    }
    
    public String setIzena (){
        System.out.println("Sartu izena");
        String I;
        I = sc.nextLine();
        return Izena = I;
    }
    
    public String setIzena (String I){
        return Izena = I;
    }
    
    public String setAbizena (){
        System.out.println("Sartu abizena");
        String a;
        a = sc.nextLine();
        return Abizena = a;
    }
    
    public String setAbizena (String a){
        return Abizena = a;
    }
    
    public LocalDate setJaiotze_data (){
        LocalDate d;

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Sartu jaiotze data (dd/mm/aaaa): ");
        String entrada = sc.nextLine();

        try 
        {
            d = LocalDate.parse(entrada, formato);
            System.out.println("Data ondo irakurrita: " + d);
            Jaiotze_data=d;
            return Jaiotze_data;
        }//try
        catch (DateTimeParseException e) 
        {
            System.out.println("Dataren formatua okerra da.");
        }//catch
        return Jaiotze_data;
    }
    
    public LocalDate setJaiotze_data (LocalDate D){
        return Jaiotze_data = D;
    }
    
    public String setTelefonoa (){
        System.out.println("Sartu telefonoa");
        String t;
        t = sc.nextLine();
        return Telefonoa = t;
    }
    
    public String setTelefonoa (String t){
        return Telefonoa = t;
    }}
    
    public String getNAN (){
        return NAN;
    }
    
    public String getIzena (){
        return Izena;
    }
    
    public String getAbizena (){
        return Abizena;
    }
    
    public LocalDate getJaiotze_data (){
        return Jaiotze_data;
    }
    
    public String getTelefonoa (){
        return Telefonoa;
    }
    
    public void getAllPers()
    {
        getNAN();
        getIzena();
        getAbizena();
        getJaiotze_data();
        getTelefonoa();
    }
}
