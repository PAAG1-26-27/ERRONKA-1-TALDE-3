/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.erronka_jolasa;
import java.util.Scanner;
/**
 *
 * @author ibarra.andoni
 */
public class ERRONKA_JOLASA {

    public static void main(String[] args) {
        //Aldagaiak definituta
        int x, puntuazioa = 0, teklatu;
        String teklatu2;
        Scanner sc = new Scanner(System.in);
        
        
        
        //Array Esaldiak
       String [] Esaldiak;
       Esaldiak = new String[10];
       {
           Esaldiak [0] = "Anek gehiegi ____ ____ atzo, horregatik, gaur ez da ondo sentitzen.";
           Esaldiak [1] = "Gure laguna, Joseba. ______ ____ asteartetikan.";
           Esaldiak [2] = "Gaur nere ordenagailua ______ ___";
           Esaldiak [3] = "Mikelek atzo Anderrei aurpegian ____ _____ ";
           Esaldiak [4] = "Egunero, gosaldu eta gero, nire hortzak _________ ____";
           Esaldiak [5] = "Irenek, atzo, bere mobila _____ ____.";
           Esaldiak [6] = "Nere betaurrekoak garbitzeaz ____ _____.";
           Esaldiak [7] = "Amamak, duela gutxi, _____ _____ hortzak.";
           Esaldiak [8] = "Nere arrebak, kriston sustoa _____ ____.";
           Esaldiak [9] = "Duela bi aste, nere urtebetetzea _____ ____.";
       }
        
        //Matriz Erantzun Posibleak
        String [][] Erantzun_posibleak = new String [10][3];
        Erantzun_posibleak = new String [][]
        {
            {"edan zuen", "edan du", "edanda dago",}, //0
            {"Mindu naiz", "Minduta dago", "Mindu zen",}, //1
            {"Ahaztu dugu", "Ahaztu dut", "",}, //2
            {"jo zion", "jo diot", "jo zitzaion",}, //3
            {"garbitzen ditut", "garbitzen dizkiot", "garbitu ditut",}, //4
            {"galdu dut", "galdu zitzaion", "galdu zuen",}, //5
            {"ahaztu da", "ahaztu naiz", "ahaztu nintzen",}, //6
            {"galdu nuen", "galdu nituen", "galdu zituen",}, //7
            {"emango nion", "eman nion", "eman dit",}, //8
            {"izan zen", "izango litzateke", "izango zen",}, //9
        };
        
        //Array Eranztun zuzenak
        String [] Erantzun_zuzenak;
        Erantzun_zuzenak = new String [10];
        {
           Erantzun_zuzenak [0] = "A";
           Erantzun_zuzenak [1] = "B";
           Erantzun_zuzenak [2] = "B";
           Erantzun_zuzenak [3] = "A";
           Erantzun_zuzenak [4] = "A";
           Erantzun_zuzenak [5] = "C";
           Erantzun_zuzenak [6] = "B";
           Erantzun_zuzenak [7] = "C";
           Erantzun_zuzenak [8] = "C";
           Erantzun_zuzenak [9] = "A";
        }
        
        do {
            x = (int) (Math.random() * 10);
           
            if (x == 0) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[0]);
                System.out.println("A--> " + Erantzun_posibleak[0][0]);
                System.out.println("B--> " + Erantzun_posibleak[0][1]);
                System.out.println("C--> " + Erantzun_posibleak[0][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[0])){
                    puntuazioa++;
                }
            }
            
            if (x == 1) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[1]);
                System.out.println("A--> " + Erantzun_posibleak[1][0]);
                System.out.println("B--> " + Erantzun_posibleak[1][1]);
                System.out.println("C--> " + Erantzun_posibleak[1][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[1])){
                    puntuazioa++;
                }
            }
            
            if (x == 2) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[2]);
                System.out.println("A--> " + Erantzun_posibleak[2][0]);
                System.out.println("B--> " + Erantzun_posibleak[2][1]);
                System.out.println("C--> " + Erantzun_posibleak[2][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[2])){
                    puntuazioa++;
                }
            }
            
            if (x == 3) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[3]);
                System.out.println("A--> " + Erantzun_posibleak[3][0]);
                System.out.println("B--> " + Erantzun_posibleak[3][1]);
                System.out.println("C--> " + Erantzun_posibleak[3][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[3])){
                    puntuazioa++;
                }
            }
            
            if (x == 4) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[4]);
                System.out.println("A--> " + Erantzun_posibleak[4][0]);
                System.out.println("B--> " + Erantzun_posibleak[4][1]);
                System.out.println("C--> " + Erantzun_posibleak[4][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[4])){
                    puntuazioa++;
                }
            }
            
            if (x == 5) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[5]);
                System.out.println("A--> " + Erantzun_posibleak[5][0]);
                System.out.println("B--> " + Erantzun_posibleak[5][1]);
                System.out.println("C--> " + Erantzun_posibleak[5][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[5])){
                    puntuazioa++;
                }
            }
            
            if (x == 6) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[6]);
                System.out.println("A--> " + Erantzun_posibleak[6][0]);
                System.out.println("B--> " + Erantzun_posibleak[6][1]);
                System.out.println("C--> " + Erantzun_posibleak[6][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[6])){
                    puntuazioa++;
                }
            }
            
            if (x == 7) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[7]);
                System.out.println("A--> " + Erantzun_posibleak[7][0]);
                System.out.println("B--> " + Erantzun_posibleak[7][1]);
                System.out.println("C--> " + Erantzun_posibleak[7][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[7])){
                    puntuazioa++;
                }
            }
            
            if (x == 8) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[8]);
                System.out.println("A--> " + Erantzun_posibleak[8][0]);
                System.out.println("B--> " + Erantzun_posibleak[8][1]);
                System.out.println("C--> " + Erantzun_posibleak[8][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[8])){
                    puntuazioa++;
                }
            }
            
            if (x == 9) {
                System.out.println("Hurrengo esaldian aditza falta da. Aukeratu hurrengo aukeretikan zuzena (A, B edo C)");
                System.out.println(Esaldiak[9]);
                System.out.println("A--> " + Erantzun_posibleak[9][0]);
                System.out.println("B--> " + Erantzun_posibleak[9][1]);
                System.out.println("C--> " + Erantzun_posibleak[9][2]);
                teklatu2 = sc.nextLine();// ---> Gure erantzuna hauxe da
                if (teklatu2.equalsIgnoreCase(Erantzun_zuzenak[9])){
                    puntuazioa++;
                }
            }
            
            System.out.println("Jarraitu nahi duzu?");
            System.out.println("1 Ez, nahiko egin dut");
            System.out.println("2 Bai, gehiago nahhi dut egin");
            teklatu = sc.nextInt();
            sc.nextLine();
        }while(teklatu != 1); //do bukatzen da
        System.out.println("Zure puntuazioa hau izan da=  " + puntuazioa);
        System.out.println("Hurren arte :D");
        
    }//main
}//class
