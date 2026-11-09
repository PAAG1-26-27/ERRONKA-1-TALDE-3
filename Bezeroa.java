/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.erronka01_klaseak_ProgramaOsoa;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Aguirresarobe.Imanol
 */
public class Bezeroa extends Pertsona 
{
    Scanner sc = new Scanner(System.in);
    
    private String Nazionalitatea;
    private String Bazk_kodea;
    
    public Bezeroa()
    {
        super();
        Nazionalitatea = "Espainia";
        Bazk_kodea = "Ez";
    }
    public Bezeroa(String naz, String baz,String N, String I, String a, LocalDate D, String t)
    {
        super(N, I, a, D, t);
        Nazionalitatea = naz;
        Bazk_kodea = baz;
    }
    
    public String setNazionalitatea()
    {
        String naz;
        System.out.println("Sartu nazionalitatea");
        naz=sc.nextLine();
        Nazionalitatea=naz;
        return Nazionalitatea;
    }    
    public String setNazionalitatea(String naz)
    {
        Nazionalitatea=naz;
        return Nazionalitatea;
    }
    
    public String setBazk_kodea()
    {
        String baz;
        System.out.println("Sartu bazkide kodea");
        baz=sc.nextLine();
        Bazk_kodea=baz;
        return Bazk_kodea;
    }    
    public String setBazk_kodea(String baz)
    {
        Bazk_kodea=baz;
        return Bazk_kodea;
    }
    
    
    public String getNazionalitatea()
    {
        return Nazionalitatea;
    }
    public String getBazk_kodea()
    {
        return Bazk_kodea;
    }
    public void getAllBez()
    {
        super.getAllPers();
        System.out.println("Nazionalitatea: "+getNazionalitatea());
        if("Ez".equals(getBazk_kodea()))
        {
            System.out.println("Bezero hau ez da bazkidea.");
        }
        else
        {
            System.out.println("Bazkide kodea: "+getBazk_kodea());
        }
    }
}
