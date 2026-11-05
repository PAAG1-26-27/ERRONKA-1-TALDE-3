/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.erronka01;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author amaia + imanol + andoni
 */
public class Programa_Jolasak 
{
    public int ekuazioa(ArrayList a, ArrayList b, int punt)
    {
        Scanner sc= new Scanner(System.in);
         
        int i, sinb_aurkitu, balio1, balio2,zenb, zenb1, zenb2, errepikatu,erantzuna, asmatu;
        String sinboloa;
         
        erantzuna=0;
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
        System.out.println("Lortutako puntuazioa: "+punt+"/3 \n");
        
        return punt;
        
    }//ekuazioa
    
    public int Urkatua(int p)
    {
        Scanner ms = new Scanner(System.in);
        int zein, i, saiakera=0;
        boolean badago;
        String erantzuna;
        String[] GalderakUrk;
        GalderakUrk=new String[10];
        {//galderak
        GalderakUrk[0]="Zein izan zen Espainiako azken dikatadorea?";
        GalderakUrk[1]="Nor izan zen amerikaren aurkikuntzaren buru izan zen nabigatzailea?";
        GalderakUrk[2]="Zein zientzialari aurkitu ziten Polonio eta Radio elementuak bere senarrarekin?";
        GalderakUrk[3]="Zein diktadore erromatar 23 labankadaz hil zuten K.a. 44. urtean? ";
        GalderakUrk[4]="Nor izan zen Hegoafrikako aktibista eta presidentea izan zena, apartheidaren aurkako eta adiskidetzearen aldeko sinbolo globala ere bazena?";
        GalderakUrk[5]="Mazedoniako erregea izan zena, antzinako munduko inperiorik handienetako bat eraiki zuena.";
        GalderakUrk[6]="Nor izan zen kristianismoaren fundatzailea?";
        GalderakUrk[7]="Zein izan zen erlatibitatearen teoriaren sortzailea?";
        GalderakUrk[8]="Nor izan zen grabitatearen eta mekanikaren legeak folmulatu zuenak";
        GalderakUrk[9]="Nor izan zen La Gioconda marraztu zuen margolaria?";
        }//galderak
        String[] EmaitzakUrk;
        EmaitzakUrk=new String[10];
        {//emaitzak
        EmaitzakUrk[0]="Francisco Franco";
        EmaitzakUrk[1]="Cristobal Colon";
        EmaitzakUrk[2]="Marie Curie";
        EmaitzakUrk[3]="Julio Zesar";
        EmaitzakUrk[4]="Nelson Mandela";
        EmaitzakUrk[5]="Alexandro Handia";
        EmaitzakUrk[6]="Nazareteko Jesus";
        EmaitzakUrk[7]="Albert Einstein";
        EmaitzakUrk[8]="Isaac Newton";
        EmaitzakUrk[9]="Leonardo da Vinci";
        }//emaitzak
        zein=(int)(Math.random()*9);
        ArrayList<Character>EmaiUrkList = new ArrayList();
        ArrayList<Character>Inkognita = new ArrayList();
        for(i=0;i<EmaitzakUrk[zein].length();i++)//kopiatu emaitza arraylistean
        {   
            EmaiUrkList.add(EmaitzakUrk[zein].charAt(i));
        }
        for(i=0;i<EmaiUrkList.size();i++)//kopiatu emaitzalist baina inkognita moduan
        {
            if(EmaiUrkList.get(i)==' ')
            {
                Inkognita.add(' ');
            }
            else
            {
            Inkognita.add('_');   
            } 
        }
        System.out.println("Kontuz mayuskulekin!");
        do
        {
            if(!Inkognita.contains('_'))
            {
                System.out.println("Erantzuna Aurkitu duzu!");
                System.out.println(EmaitzakUrk[zein]+" da!");
                return p++;
            }
            {
                switch(saiakera)//Urkatuarean marrazkiak
                {
                    case 1:
                    {

                        System.out.println("-----");
                    }
                    break;
                    case 2:
                    {
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("-----");
                    }
                    break;
                    case 3:
                    {
                        System.out.println("  ______");
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("-----");
                    }
                    break;
                    case 4:
                    {
                        System.out.println("  ______");
                        System.out.println("  |    |");
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("-----");
                    }
                    break;
                    case 5:
                    {
                        System.out.println("  ______");
                        System.out.println("  |    |");
                        System.out.println("  |    O");
                        System.out.println("  |");
                        System.out.println("  |");
                        System.out.println("-----");
                    }
                    break;
                    case 6:
                    {
                        System.out.println("  ______");
                    System.out.println("  |    |");
                    System.out.println("  |    O");
                    System.out.println("  |    |");
                    System.out.println("  |");
                    System.out.println("-----");
                    }
                    break;
                    case 7:
                    {
                        System.out.println("  ______");
                        System.out.println("  |    |");
                        System.out.println("  |    O");
                        System.out.println("  |    |");
                        System.out.println("  |    /");
                        System.out.println("-----");
                    }
                    break;
                    case 8:
                    {
                        System.out.println("  ______");
                        System.out.println("  |    |");
                        System.out.println("  |    O");
                        System.out.println("  |    |");
                        System.out.println("  |    /)");
                        System.out.println("-----");
                    }
                    break;
                    case 9:
                    {
                        System.out.println("  ______");
                        System.out.println("  |    |");
                        System.out.println("  |    O");
                        System.out.println("  |   /|");
                        System.out.println("  |    /)");
                        System.out.println("-----");
                    }
                    break;
                }
            }//Urkatuen marrazkiak
            System.out.println(GalderakUrk[zein]);
            for (i=0;i<Inkognita.size();i++)
            {
                System.out.printf("%s ",Inkognita.get(i));
            }
            System.out.printf("\n");
            erantzuna=ms.nextLine();
            if(erantzuna.length()!=1)//hitz oso bat asmatzen badu
            {
                if(erantzuna.equals(EmaitzakUrk[zein]))
                {
                    System.out.println("Erantzuna zuzena da!");
                    System.out.println(EmaitzakUrk[zein]+" da!");
                    p++;
                    return p;
                }
                else
                {
                    System.out.println("Zure erantzuna ez da zuzena.");
                    saiakera++;
                }
            }
            else //charactere bakarra asmatzen badu
            {
                badago=false;
                    if(EmaiUrkList.contains(erantzuna.charAt(0)))//karakterea aurkitzen badu
                    {
                        for(i=0;i<EmaiUrkList.size();i++)
                        {
                            if(EmaiUrkList.get(i)==erantzuna.charAt(0))
                            {
                                Inkognita.set(i,erantzuna.charAt(0));
                            }
                        }
                    }  
                    else
                    {
                        System.out.println("Zure erantzuna ez da zuzena.");
                        saiakera++;
                    }
            }
        }
        while(saiakera<10);
        {
            System.out.println("  ______");
            System.out.println("  |    |");
            System.out.println("  |    O");
            System.out.println("  |   /|)");
            System.out.println("  |    /)");
            System.out.println("-----");
        }//urkatuaren marrazki osoa
        System.out.println("Saiakerarik gabe geratu zara");
        return p;
    }
    
    public int aditzak(int puntuazioa)
    {
        //Aldagaiak definituta
        int x, teklatu;
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
           Esaldiak [5] = "Anek gehiegi ____ ____ atzo, horeegatik, gaur ez da ondo sentitzen.";
           Esaldiak [6] = "Anek gehiegi ____ ____ atzo, horeegatik, gaur ez da ondo sentitzen.";
           Esaldiak [7] = "Anek gehiegi ____ ____ atzo, horeegatik, gaur ez da ondo sentitzen.";
           Esaldiak [8] = "Anek gehiegi ____ ____ atzo, horeegatik, gaur ez da ondo sentitzen.";
           Esaldiak [9] = "Anek gehiegi ____ ____ atzo, horeegatik, gaur ez da ondo sentitzen.";
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
            {"edan zuen", "edan du", "edanda dago",}, //5
            {"edan zuen", "edan du", "edanda dago",}, //6
            {"edan zuen", "edan du", "edanda dago",}, //7
            {"edan zuen", "edan du", "edanda dago",}, //8
            {"edan zuen", "edan du", "edanda dago",}, //9
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                   System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
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
                    System.out.println("Zorionak! Erantzuna zuzena da!");
                    puntuazioa++;
                }
                else
                {
                    System.out.println("Erantzun okerra da.");
                }
            }
            
            System.out.println("Beste bat egin nahi duzu?");
            System.out.println("1 Ez, nahiko egin dut");
            System.out.println("2 Bai, gehiago nahi dut egin");
            teklatu = sc.nextInt();
            sc.nextLine();
        }while(teklatu != 1); //do bukatzen da
        return puntuazioa;
    }//aditzak
    
    

    public void main(String[] args) 
    {
      int jolasa, puntuazioa, segi1, segi2;
      
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

         System.out.println("\n---JOLASAK---      Zure puntuazioa: "+puntuazioa);
         System.out.println("1- Historia urkatua");
         System.out.println("2- Ekuazioa asmatu");
         System.out.println("3- Aditzen test-a");
         System.out.println("------------");
         System.out.println("0- irten");
         jolasa=sc.nextInt();

         switch(jolasa)
         {

                  case 1:  //--->Historia urkatua
                    do
                     {
                         puntuazioa=Urkatua(puntuazioa);
                        System.out.println("Berriro jolastu nahi duzu?");
                        System.out.println("1- Bai || 2- Ez");
                        segi1=sc.nextInt();

                     }//do
                     while(segi1!=2);
                    break;

                   case 2:  //---> Ekuazioa asmatu
                    do
                     {
                        puntuazioa=ekuazioa(ek_zenbakiak, ek_sinboloa, puntuazioa);
                        System.out.println("Berriro jolastu nahi duzu?");
                        System.out.println("1- Bai || 2- Ez");
                        segi2=sc.nextInt();
                     }//do
                     while(segi2!=2);
                   break;

                   case 3:  //---> Aditzak
                   {
                        puntuazioa=aditzak(puntuazioa);//funtzio bera errepikatzeko galdetzen du
                   }
                   break;
           }//switch

         }//do
       while(jolasa !=0 && jolasa <=3);
    }//main
}//class
