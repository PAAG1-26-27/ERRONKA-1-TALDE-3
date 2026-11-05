/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.erronka01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aguirresarobe.Imanol
 */
public class Urkatua 
{
    Scanner ms = new Scanner(System.in);
    public int urkatua(int p)
    {
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
                    return p++;
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

    public void main(String[] args) {
        int puntuazioa=0;
        puntuazioa=urkatua(puntuazioa);
    }
}
