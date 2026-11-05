/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.erronka1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author amaia
 */
public class main_jolasak_ek 
{
    public void ekuazioa(ArrayList a, ArrayList b)
    {
        Scanner sc= new Scanner(System.in);
         
        int i, sinb_aurkitu, balio1, balio2,zenb, zenb1, zenb2, errepikatu, punt,erantzuna, asmatu;
        String sinboloa;
         
        erantzuna=0;
        punt=0;
        errepikatu=1;
        do
        {
            for(i=0; i<=15; i++)
            {
                zenb=(int)(Math.random()*100);
                a.add(zenb);
            }//for

            balio1=(int)(Math.random()*15);
            zenb1=(int)a.get(balio1);

            balio2=(int)(Math.random()*15);
            zenb2=(int)a.get(balio2);

            sinb_aurkitu=(int)(Math.random()*3);
            sinboloa=(String)b.get(sinb_aurkitu);
            
            switch(sinb_aurkitu)
            {
                case 0: //--> gehiketa
                    erantzuna= zenb2-zenb1;
                    break;

                case 1: //--> kenketa
                    erantzuna=zenb1-zenb2;
                    break;

                case 2: //-->zatiketa
                    do
                    {
                      balio2=(int)(Math.random()*15);
                      zenb2=(int)a.get(balio2);
                    }
                    while(zenb1%zenb2 !=0);
                    erantzuna=zenb1/zenb2;
                    break;

                case 3: //-->biderketa
                    do
                    {
                      balio2=(int)(Math.random()*15);
                      zenb2=(int)a.get(balio2);
                    }
                    while(zenb1>zenb2);
                    erantzuna= zenb2/zenb1;
                    break;
            }//switch

            System.out.println(zenb1+""+sinboloa+""+"X ="+zenb2);
            System.out.println("Zein da X-en balioa? Sartu zure erantzuna");
            asmatu=sc.nextInt();
            errepikatu++;

            if(asmatu==erantzuna)
            {
                punt++;
            }//if.
            
        }//do
        while(errepikatu<4);
        System.out.println("Lortutako puntuazioa: "+punt+"/3");
        
        
        
    }//ekuazioa
    
    public void urkatua()
    {
        
        
    }//urkatua
    
    public void aditzak()
    {
        
        
    }//aditzak
    
    

    public void main(String[] args) 
    {
      int jolasa, puntuazioa, segi1, segi2, segi3;
      
      ArrayList<Integer>ek_zenbakiak= new ArrayList();
      
      ArrayList<String>ek_sinboloa= new ArrayList();
      ek_sinboloa.add("+");
      ek_sinboloa.add("-");
      ek_sinboloa.add("/");
      ek_sinboloa.add("*");
      
      puntuazioa=0;
      Scanner sc= new Scanner(System.in);
        do
       {

         System.out.println("---JOLASAK---");
         System.out.println("1- Historia urkatua");
         System.out.println("2- Ekuazioa asmatu");
         System.out.println("3- Aditzen test-a");
         System.out.println("0- Menutik atera");
         jolasa=sc.nextInt();

         switch(jolasa)
         {

                  case 1:  //--->Historia urkatua
                    do
                     {
                       System.out.println("Berriro jolastu nahi duzu?");
                       System.out.print("1- Bai || 2- Ez");
                       segi1=sc.nextInt();

                     }//do
                     while(segi1!=2);
                    break;

                   case 2:  //---> Ekuazioa asmatu
                    do
                     {
                      ekuazioa(ek_zenbakiak, ek_sinboloa);
                      System.out.println("Berriro jolastu nahi duzu?");
                      System.out.print("1- Bai || 2- Ez");
                      segi2=sc.nextInt();
                     }//do
                     while(segi2!=2);
                   break;

                   case 3:  //---> Aditzak
                    do
                    {
                     System.out.println("Berriro jolastu nahi duzu?");
                     System.out.print("1- Bai || 2- Ez");
                     segi3=sc.nextInt();
                    }//do
                    while(segi3!=2);
                   break;
           }//switch

         }//do
       while(jolasa !=0 && jolasa <=3);
    }//main
}//class
