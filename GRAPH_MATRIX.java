package com.lego.ev3.lejos.current;

import java.util.*;

public class GRAPH_MATRIX
{
    private int anzahlKnoten;
    private KNOTEN[] knoten;
    private int[][] matrix;
    private boolean[] besucht;
    private int distanz[];
    private int kommtVon[];
    
    public GRAPH_MATRIX(int maximaleKnoten)
    {
        anzahlKnoten = 0;
        knoten = new KNOTEN[maximaleKnoten];
        matrix = new int[maximaleKnoten][maximaleKnoten];
        besucht = new boolean[maximaleKnoten];
        distanz  = new int[maximaleKnoten];
        kommtVon = new int[maximaleKnoten];
    }
    
    public void KnotenEinfuegen(String bezeichner)
    {
        if ((anzahlKnoten < knoten.length) && (KnotenNummer(bezeichner) == -1))
        {
            knoten[anzahlKnoten] = new KNOTEN(bezeichner);
            matrix[anzahlKnoten][anzahlKnoten] = 0;
            for (int i=0; i<anzahlKnoten; i++)
            {
                matrix[anzahlKnoten][i] = -1;
                matrix[i][anzahlKnoten] = -1;
            }
            anzahlKnoten = anzahlKnoten + 1;
        }
    }
    
    private int KnotenNummer(String bezeichner)
    {
        int i, ergeb;
        
        ergeb = -1;
        for (i=0; (i < anzahlKnoten) && (ergeb == -1); i++)
            if (knoten[i].BezeichnungGeben().equals(bezeichner))
                ergeb = i;
        
        return ergeb;
    }
    
    public String KnotenBezeichnerGeben(int knotenNummer)
    {
        if ((knotenNummer < anzahlKnoten) && (knotenNummer >= 0))
            return knoten[knotenNummer].BezeichnungGeben();
        else
            return "";
    }
    
    public void KanteEinfuegen(String von, String nach, int gewichtung)
    {
        int vonNummer, nachNummer;
        
        vonNummer = KnotenNummer(von);
        nachNummer = KnotenNummer(nach);
        if ((vonNummer!=-1) && (nachNummer!=-1) && (vonNummer!=nachNummer))
        {
            matrix[vonNummer][nachNummer] = gewichtung;
            matrix[nachNummer][vonNummer] = gewichtung;
        }
    }
    
    public void Ausgeben()
    {
        int breite = 4;
        System.out.print("    ");  
        for (int i=0; i<anzahlKnoten; i++)
            System.out.print(knoten[i].BezFormatGeben(breite));
        System.out.println();
        
        for (int i=0; i<anzahlKnoten; i++)
        {
            System.out.print(knoten[i].BezFormatGeben(breite));
            for (int j=0; j<anzahlKnoten; j++)
                if (matrix[i][j] != -1)
                    System.out.print((matrix[i][j]+"   ").substring(0,breite));
                else
                    System.out.print("    ");
            System.out.println();           
        }
    }    
    
    int KnotenAnzahlgeben()
    {
        return anzahlKnoten;
    }
    
    
    int KanteGewichtGeben(String von, String nach)
    {  
        int vonNummer = KnotenNummer(von);
        int nachNummer = KnotenNummer(nach);
        if ((vonNummer!=-1) && (nachNummer!=-1))
            return matrix[vonNummer][nachNummer];
        else
            return -1;
    }
   
    private void Besuchen(int knotenNummer)
    {
        besucht[knotenNummer] = true;
        System.out.print("besucht " + knoten[knotenNummer].BezeichnungGeben()+"; ");

        for (int abzweigNummer=0; abzweigNummer < anzahlKnoten; abzweigNummer++)
        {
            if ((matrix[knotenNummer][abzweigNummer]>0) && (!besucht[abzweigNummer]))
            {
                Besuchen(abzweigNummer);   
                System.out.print("zurück nach " + knoten[knotenNummer].BezeichnungGeben()+"; ");                
            }
        }
        
        System.out.println("fertig mit " + knoten[knotenNummer].BezeichnungGeben()+"; ");
     }

    public void TiefenSuche(String startKnoten)
    {
        int startNummer;
        
        startNummer = KnotenNummer(startKnoten);
        
        if (startNummer != -1)
        {
            for (int i=0 ; i<anzahlKnoten; i++)
                besucht[i] = false;
            Besuchen(startNummer);
        }
    }
    
    private int MinKnoten()
    {
        int minPos = 0;
        int minWert = Integer.MAX_VALUE;
        
        for (int i=0; i<anzahlKnoten; i++)
        {
            if (!besucht[i] && (minWert > distanz[i]))
            {
                minWert = distanz[i];
                minPos = i;
            }
        }
        return minPos;
    }

     public ArrayList<String> KuerzesterWeg(String startKnoten, String zielKnoten)
     {
    	ArrayList<String> Weg = new ArrayList<>();
        int startNummer = KnotenNummer(startKnoten); 
        int zielNummer  = KnotenNummer(zielKnoten);
        int knotenNummer, neueDistanz;
        
        for (int i=0; i<anzahlKnoten; i++)
            {
                besucht[i]=false;
                distanz[i]=Integer.MAX_VALUE;
            }
        distanz[startNummer] = 0;
        kommtVon[startNummer] = startNummer;
        
        for (int i=0; i<anzahlKnoten; i++)
        {
           knotenNummer = MinKnoten();
            besucht[knotenNummer] = true;
            
            for (int abzweigNummer=0; abzweigNummer<anzahlKnoten; abzweigNummer++)
            {
                if ((matrix[knotenNummer][abzweigNummer]>0) && (!besucht[abzweigNummer]))
                {
                    neueDistanz = distanz[knotenNummer] + matrix[knotenNummer][abzweigNummer];
                    
                    if (neueDistanz < distanz[abzweigNummer])
                    {
                        distanz[abzweigNummer] = neueDistanz;
                        kommtVon[abzweigNummer] = knotenNummer;
                    }
                }
            }            
        }
        
        System.out.println("Entfernung: " + distanz[zielNummer]);
        
        Weg.add(zielKnoten);
        knotenNummer = zielNummer;
        while (knotenNummer != startNummer)
        {
           knotenNummer = kommtVon[knotenNummer];
           Weg.add(knoten[knotenNummer].BezeichnungGeben());
         }
        Collections.reverse(Weg);
        System.out.println(Weg);
        return Weg;
    }
}
