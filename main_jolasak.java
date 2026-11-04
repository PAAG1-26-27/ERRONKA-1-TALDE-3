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
public class main_jolasak 
{
    public void ekuazioa(ArrayList a, ArrayList b)
    {
       
    }//ekuazioa
    
    public void urkatua()
    {
        
        
    }//urkatua
    
    public void aditzak()
    {
        
        
    }//aditzak
    
    

    public static void main(String[] args) 
    {
      int jolasa, puntuazioa, segi1, segi2, segi3;
      
     
      
      puntuazioa=0;
      Scanner sc= new Scanner(System.in);
        do
       {

         System.out.println("---JOLASAK---");
         System.out.println("1- Historia urkatua");
         System.out.println("2- Ekuazioa asmatu");
         System.out.println("3- Aditzen test-a");
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
