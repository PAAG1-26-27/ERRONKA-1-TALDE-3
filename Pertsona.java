/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertsona;
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
        Jaiotze_data = LocalDate.parse("2018-08-01");
        Telefonoa = ("123456789");
    }
    
    public Pertsona (String N, String I, String a, LocalDate D, String t) {
        N = ("ABCDEFGH1");
        I = ("Izena");
        a = ("Abizena");
        D = LocalDate.parse("2018-08-01");
        t = ("123456789");
    }
    
    public void setNAN (){
        System.out.println("Sartu NAN zenbakia");
        String N;
        N = sc.nextLine();
        NAN = N;
    }
    
    public void setNAN (String N){
        System.out.println("Sartu NAN zenbakia");
        N = sc.nextLine();
        NAN = N;
    }
    
    public void setIzena (){
        System.out.println("Sartu izena");
        String I;
        I = sc.nextLine();
        Izena = I;
    }
    
    public void setIzena (String I){
        System.out.println("Sartu izena");
        I = sc.nextLine();
        Izena = I;
    }
    
    public void setAbizena (){
        System.out.println("Sartu abizena");
        String a;
        a = sc.nextLine();
        Abizena = a;
    }
    
    public void setAbizena (String a){
        System.out.println("Sartu abizena");
        a = sc.nextLine();
        Abizena = a;
    }
    
    public void setJaiotze_data (){
        System.out.println("Sartu jaiotze data");
        LocalDate D;
        D = LocalDate.parse(sc.nextLine());
        Jaiotze_data = D;
    }
    
    public void setJaiotze_data (LocalDate D){
        System.out.println("Sartu jaiotze data");
        D = LocalDate.parse(sc.nextLine());
        Jaiotze_data = D;
    }
    
    public void setTelefonoa (){
        System.out.println("Sartu telefonoa");
        String t;
        t = sc.nextLine();
        Telefonoa = t;
    }
    
    public void setTelefonoa (String t){
        System.out.println("Sartu telefonoa");
        t = sc.nextLine();
        Telefonoa = t;
    }
    
    public void getNAN (){
        System.out.println("Ekintzaren Id-a hau da " + NAN);
    }
    
    public void getIzena (){
        System.out.println("Ekintzaren Id-a hau da " + Izena);
    }
    
    public void getAbizena (){
        System.out.println("Ekintzaren Id-a hau da " + Abizena);
    }
    
    public void getJaiotze_data (){
        System.out.println("Ekintzaren Id-a hau da " + Jaiotze_data);
    }
    
    public void getTelefonoa (){
        System.out.println("Ekintzaren Id-a hau da " + Telefonoa);
    }
}
