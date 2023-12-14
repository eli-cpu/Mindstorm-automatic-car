package com.lego.ev3.lejos.current;

import java.util.ArrayList;

public class ARBEIT2
{

    GRAPH_MATRIX g;
    RICHTUNG r;

    public ARBEIT2()
    {
    	Aufsetzen();
    }
   
    /**
     * 
     */
    public static void Aufsetzen()
    {
    
       
    }
    
    public ArrayList<String> gib_weg(String start, String ende)
    {
    	GRAPH_MATRIX g = new GRAPH_MATRIX(11);
        RICHTUNG r = new RICHTUNG(8);
           
            g.KnotenEinfuegen("A");
            r.OrtHinzufuegen(2, 2,"A");
            g.KnotenEinfuegen("B");
            r.OrtHinzufuegen(3, 2,"B");
            g.KnotenEinfuegen("C");
            r.OrtHinzufuegen(5, 2,"C");
            g.KnotenEinfuegen("D");
            r.OrtHinzufuegen(5, 3,"D");
            g.KnotenEinfuegen("E");
            r.OrtHinzufuegen(5, 5,"E");
            g.KnotenEinfuegen("F");
            r.OrtHinzufuegen(3, 5,"F");
            g.KnotenEinfuegen("G");
            r.OrtHinzufuegen(2, 5,"G");
            g.KnotenEinfuegen("H");
            r.OrtHinzufuegen(2, 4,"H");
            g.KnotenEinfuegen("I");
            r.OrtHinzufuegen(3, 4,"I");
            g.KnotenEinfuegen("J");
            r.OrtHinzufuegen(4, 4,"J");
            g.KnotenEinfuegen("K");
            r.OrtHinzufuegen(4, 3,"K");
           
            g.KanteEinfuegen("A","B",1);
            g.KanteEinfuegen("A","H",1);
            g.KanteEinfuegen("B","C",1);
            g.KanteEinfuegen("B","I",1);
            g.KanteEinfuegen("C","D",1);
            g.KanteEinfuegen("D","K",1);
            g.KanteEinfuegen("D","E",1);
            g.KanteEinfuegen("E","F",1);
            g.KanteEinfuegen("F","I",1);
            g.KanteEinfuegen("F","G",1);
            g.KanteEinfuegen("G","H",1);
            g.KanteEinfuegen("H","I",1);
            g.KanteEinfuegen("J","K",1);
            g.KanteEinfuegen("J","I",1);
    	
    	return r.Richtungen(g.KuerzesterWeg(start, ende));
    }
    
    
   
   
}
