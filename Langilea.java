/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Langilea extends Pertsona{
    
    private String Langile_Id;
    private String Departamentua;
    Scanner sc = new Scanner(System.in);
    
    public Langilea (){
        super();
        Langile_Id = "A0B";
        Departamentua = "Admin";
    }
    
    public Langilea (String L_Id, String Depart,String N, String I, String a, LocalDate D, String t)
    {
        super(N, I, a, D, t);
        Langile_Id = L_Id;
        Departamentua = Depart;
    }
    
    public String setLangile_Id(){
        System.out.println("Sartu langilearen Id zenbakia");
        String L_Id;
        L_Id = sc.nextLine();
        return Langile_Id = L_Id;
    }
    
    public String setLangile_Id(String L_Id){
        return Langile_Id = L_Id;
    }
    
    public String setDepartamentua(){
        System.out.println("Sartu departamentuaren izena");
        String Depart;
        Depart = sc.nextLine();
        return Departamentua = Depart;
    }
    
    public String setDepartamentua(String Depart){
        return Departamentua = Depart;
    }
    
    public String getLangile_Id (){
        return Langile_Id;
    }
    
    public String getDepartamentua (){
        return Departamentua;
    }
    
    public void getAllLangilea(){
        getAllPers();
        getLangile_Id();
        getDepartamentua();
    }
}
