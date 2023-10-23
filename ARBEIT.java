package com.lego.ev3.lejos.current;

import java.util.ArrayList;

public class ARBEIT
{

    GRAPH_MATRIX g;
    RICHTUNG r;

    public ARBEIT()
    {
    }
    
    public void AusfuehrenAutobahn()
    {
        GRAPH_MATRIX g = new GRAPH_MATRIX(14);
        
        g.KnotenEinfuegen("A");
        g.KnotenEinfuegen("F");
        g.KnotenEinfuegen("FD");
        g.KnotenEinfuegen("HO");
        g.KnotenEinfuegen("KA");
        g.KnotenEinfuegen("LI");
        g.KnotenEinfuegen("M");
        g.KnotenEinfuegen("N");
        g.KnotenEinfuegen("PA");
        g.KnotenEinfuegen("R");
        g.KnotenEinfuegen("RO");
        g.KnotenEinfuegen("S");
        g.KnotenEinfuegen("UL");
        g.KnotenEinfuegen("WÜ");

        g.KanteEinfuegen("KA","F",127);
        g.KanteEinfuegen("F","WÜ",131);
        g.KanteEinfuegen("WÜ","N",104);
        g.KanteEinfuegen("N","R",80);
        g.KanteEinfuegen("R","PA",72);
        g.KanteEinfuegen("HO","WÜ",192);
        g.KanteEinfuegen("HO","N",116);
        g.KanteEinfuegen("HO","R",166);
        g.KanteEinfuegen("FD","WÜ",98);
        g.KanteEinfuegen("M","A",64);
        g.KanteEinfuegen("M","N",163);
        g.KanteEinfuegen("M","R",117);
        g.KanteEinfuegen("M","RO",60);
        g.KanteEinfuegen("UL","A",59);
        g.KanteEinfuegen("UL","WÜ",165);
        g.KanteEinfuegen("UL","LI",126);
        g.KanteEinfuegen("UL","S",103);
        g.KanteEinfuegen("S","KA",53);
        g.KanteEinfuegen("S","WÜ",155);
        
        g.Ausgeben();
    }

    public void AusfuehrenFlug()
    {
        GRAPH_MATRIX g = new GRAPH_MATRIX(21);
        
        g.KnotenEinfuegen("AMS");
        g.KnotenEinfuegen("ARN");
        g.KnotenEinfuegen("BKK");
        g.KnotenEinfuegen("CAI");
        g.KnotenEinfuegen("CDG");
        g.KnotenEinfuegen("DEL");
        g.KnotenEinfuegen("DME");
        g.KnotenEinfuegen("FRA");
        g.KnotenEinfuegen("GRU");
        g.KnotenEinfuegen("JFK");
        g.KnotenEinfuegen("JNB");
        g.KnotenEinfuegen("LHR");
        g.KnotenEinfuegen("MAD");
        g.KnotenEinfuegen("MEX");
        g.KnotenEinfuegen("MUC");
        g.KnotenEinfuegen("NRT");
        g.KnotenEinfuegen("ORD");
        g.KnotenEinfuegen("PEK");
        g.KnotenEinfuegen("SFO");
        g.KnotenEinfuegen("SIN");
        g.KnotenEinfuegen("TXL");

        g.KanteEinfuegen("FRA","AMS",70);
        g.KanteEinfuegen("FRA","ARN",125);
        g.KanteEinfuegen("FRA","BKK",620);
        g.KanteEinfuegen("FRA","CAI",235);
        g.KanteEinfuegen("FRA","CDG",70);
        g.KanteEinfuegen("FRA","DEL",440);
        g.KanteEinfuegen("FRA","DME",195);
        g.KanteEinfuegen("FRA","GRU",710);
        g.KanteEinfuegen("FRA","JFK",525);
        g.KanteEinfuegen("FRA","JNB",645);
        g.KanteEinfuegen("FRA","LHR",100);
        g.KanteEinfuegen("FRA","MAD",150);
        g.KanteEinfuegen("FRA","MEX",705);
        g.KanteEinfuegen("FRA","MUC",55);
        g.KanteEinfuegen("FRA","NRT",660);
        g.KanteEinfuegen("FRA","ORD",565);
        g.KanteEinfuegen("FRA","PEK",550);
        g.KanteEinfuegen("FRA","SFO",684);
        g.KanteEinfuegen("FRA","SIN",720);
        g.KanteEinfuegen("FRA","TXL",65);
        
        g.KanteEinfuegen("MUC","AMS",95);
        g.KanteEinfuegen("MUC","ARN",130);
        g.KanteEinfuegen("MUC","BKK",620);
        g.KanteEinfuegen("MUC","CAI",230);
        g.KanteEinfuegen("MUC","CDG",100);
        g.KanteEinfuegen("MUC","DEL",445);
        g.KanteEinfuegen("MUC","DME",190);
        g.KanteEinfuegen("MUC","GRU",760);
        g.KanteEinfuegen("MUC","JFK",550);
        g.KanteEinfuegen("MUC","JNB",645);
        g.KanteEinfuegen("MUC","LHR",125);
        g.KanteEinfuegen("MUC","MAD",155);
        g.KanteEinfuegen("MUC","NRT",705);
        g.KanteEinfuegen("MUC","ORD",600);
        g.KanteEinfuegen("MUC","PEK",590);
        g.KanteEinfuegen("MUC","SFO",730);
        g.KanteEinfuegen("MUC","SIN",725);
        g.KanteEinfuegen("MUC","TXL",70);
        
        g.KanteEinfuegen("TXL","ARN",90);
        g.KanteEinfuegen("TXL","CDG",105);
        g.KanteEinfuegen("TXL","DME",165);

        g.Ausgeben();
    }
    
    public void AusfuehrenICE()
    {
        GRAPH_MATRIX g = new GRAPH_MATRIX(16);
        
        g.KnotenEinfuegen("A");
        g.KnotenEinfuegen("B");
        g.KnotenEinfuegen("D");
        g.KnotenEinfuegen("DD");
        g.KnotenEinfuegen("F");
        g.KnotenEinfuegen("F2");
        g.KnotenEinfuegen("FD");
        g.KnotenEinfuegen("HH");
        g.KnotenEinfuegen("H");
        g.KnotenEinfuegen("K");
        g.KnotenEinfuegen("L");
        g.KnotenEinfuegen("M");
        g.KnotenEinfuegen("MA");
        g.KnotenEinfuegen("N");
        g.KnotenEinfuegen("S");
        g.KnotenEinfuegen("WÜ");

        g.KanteEinfuegen("F2","F",10);
        g.KanteEinfuegen("FD","F",52);
        g.KanteEinfuegen("HH","B",143);
        g.KanteEinfuegen("H","B",98);
        g.KanteEinfuegen("H","D",100);
        g.KanteEinfuegen("H","FD",88);
        g.KanteEinfuegen("H","HH",74);
        g.KanteEinfuegen("K","D",77);
        g.KanteEinfuegen("K","F2",67);
        g.KanteEinfuegen("L","B",67);
        g.KanteEinfuegen("L","DD",73);
        g.KanteEinfuegen("L","FD",151);
        g.KanteEinfuegen("M","A",40);
        g.KanteEinfuegen("MA","F",30);
        g.KanteEinfuegen("MA","F2",30);
        g.KanteEinfuegen("N","A",62);
        g.KanteEinfuegen("N","L",189);
        g.KanteEinfuegen("N","M",71);
        g.KanteEinfuegen("S","A",98);
        g.KanteEinfuegen("S","MA",37);      
        g.KanteEinfuegen("WÜ","F",70);
        g.KanteEinfuegen("WÜ","FD",34);
        g.KanteEinfuegen("WÜ","N",58);

        g.Ausgeben();
    }
    
    public static void AusfuehrenAusschnitt()
    {
        GRAPH_MATRIX g = new GRAPH_MATRIX(14);
        
        g.KnotenEinfuegen("A");
        g.KnotenEinfuegen("F");
        g.KnotenEinfuegen("FD");
        g.KnotenEinfuegen("HO");
        g.KnotenEinfuegen("KA");
        g.KnotenEinfuegen("LI");
        g.KnotenEinfuegen("M");
        g.KnotenEinfuegen("N");
        g.KnotenEinfuegen("PA");
        g.KnotenEinfuegen("R");
        g.KnotenEinfuegen("RO");
        g.KnotenEinfuegen("S");
        g.KnotenEinfuegen("UL");
        g.KnotenEinfuegen("WÜ");
        
        g.KanteEinfuegen("KA","F",127);
        g.KanteEinfuegen("F","WÜ",131);
        g.KanteEinfuegen("WÜ","N",104);
        g.KanteEinfuegen("N","R",80);
        g.KanteEinfuegen("R","PA",72);
        g.KanteEinfuegen("HO","WÜ",192);
        g.KanteEinfuegen("HO","N",116);
        g.KanteEinfuegen("HO","R",166);
        g.KanteEinfuegen("FD","WÜ",98);
        g.KanteEinfuegen("M","A",64);
        g.KanteEinfuegen("M","N",163);
        g.KanteEinfuegen("M","R",117);
        g.KanteEinfuegen("M","RO",60);
        g.KanteEinfuegen("UL","A",59);
        g.KanteEinfuegen("UL","WÜ",165);
        g.KanteEinfuegen("UL","LI",126);
        g.KanteEinfuegen("UL","S",103);
        g.KanteEinfuegen("S","KA",53);

        g.Ausgeben();
        
        g.KuerzesterWeg("A","KA");
    }
    
    public void AusfuehrenSUBahn()
    {
        GRAPH_MATRIX g = new GRAPH_MATRIX(41);
        
        g.KnotenEinfuegen("A");
        g.KnotenEinfuegen("Altomünster");
        g.KnotenEinfuegen("Arabellapark");
        g.KnotenEinfuegen("Dachau");
        g.KnotenEinfuegen("Donnersbergerbrücke");
        g.KnotenEinfuegen("Ebersberg");
        g.KnotenEinfuegen("Erding");
        g.KnotenEinfuegen("Feldmoching");
        g.KnotenEinfuegen("Flughafen");
        g.KnotenEinfuegen("Freising");
        g.KnotenEinfuegen("Fürstenried");
        g.KnotenEinfuegen("Garching");
        g.KnotenEinfuegen("Geltendorf");
        g.KnotenEinfuegen("Giesing");
        g.KnotenEinfuegen("Großhadern");
        g.KnotenEinfuegen("Harras");
        g.KnotenEinfuegen("Hauptbahnhof");
        g.KnotenEinfuegen("Heimeranplatz");
        g.KnotenEinfuegen("Herrsching");
        g.KnotenEinfuegen("Holzkirchen");
        g.KnotenEinfuegen("Innsbrucker Ring");
        g.KnotenEinfuegen("Karlsplatz");
        g.KnotenEinfuegen("Kreuzstraße");
        g.KnotenEinfuegen("Laim");
        g.KnotenEinfuegen("Laimer Platz");
        g.KnotenEinfuegen("Mammendorf");
        g.KnotenEinfuegen("Mangfallplatz");
        g.KnotenEinfuegen("Marienplatz");
        g.KnotenEinfuegen("Messe");
        g.KnotenEinfuegen("Neufahrn");
        g.KnotenEinfuegen("Neuperlach");
        g.KnotenEinfuegen("Odeonsplatz");
        g.KnotenEinfuegen("OEZ");
        g.KnotenEinfuegen("Ostbahnhof");
        g.KnotenEinfuegen("Pasing");
        g.KnotenEinfuegen("Petershausen");
        g.KnotenEinfuegen("Scheidplatz");
        g.KnotenEinfuegen("Sendlinger Tor");
        g.KnotenEinfuegen("Trudering");
        g.KnotenEinfuegen("Tutzing");
        g.KnotenEinfuegen("Wolfratshausen");

        g.KanteEinfuegen("Dachau","Altomünster",1);
        g.KanteEinfuegen("Harras","Großhadern",1);
        g.KanteEinfuegen("Hauptbahnhof","Donnersbergerbrücke",1);
        g.KanteEinfuegen("Heimeranplatz","Donnersbergerbrücke",1);
        g.KanteEinfuegen("Heimeranplatz","Harras",1);
        g.KanteEinfuegen("Heimeranplatz","Hauptbahnhof",1);
        g.KanteEinfuegen("Holzkirchen","Giesing",1);
        g.KanteEinfuegen("Innsbrucker Ring","Giesing",1);
        g.KanteEinfuegen("Karlsplatz","Hauptbahnhof",1);
        g.KanteEinfuegen("Laim","Dachau",1);
        g.KanteEinfuegen("Laim","Donnersbergerbrücke",1);
        g.KanteEinfuegen("Laim","Feldmoching",1);
        g.KanteEinfuegen("Laimer Platz","Heimeranplatz",1);
        g.KanteEinfuegen("Marienplatz","Karlsplatz",1);
        g.KanteEinfuegen("Neufahrn","Feldmoching",1);
        g.KanteEinfuegen("Neufahrn","Flughafen",1);
        g.KanteEinfuegen("Neufahrn","Freising",1);
        g.KanteEinfuegen("Neuperlach","Giesing",1);
        g.KanteEinfuegen("Neuperlach","Innsbrucker Ring",1);
        g.KanteEinfuegen("Neuperlach","Kreuzstraße",1);
        g.KanteEinfuegen("Odeonsplatz","Arabellapark",1);
        g.KanteEinfuegen("Odeonsplatz","Garching",1);
        g.KanteEinfuegen("Odeonsplatz","Karlsplatz",1);
        g.KanteEinfuegen("Odeonsplatz","Marienplatz",1);
        g.KanteEinfuegen("OEZ","Hauptbahnhof",1);
        g.KanteEinfuegen("Ostbahnhof","Erding",1);
        g.KanteEinfuegen("Ostbahnhof","Flughafen",1);
        g.KanteEinfuegen("Ostbahnhof","Giesing",1);
        g.KanteEinfuegen("Ostbahnhof","Innsbrucker Ring",1);
        g.KanteEinfuegen("Ostbahnhof","Marienplatz",1);
        g.KanteEinfuegen("Ostbahnhof","Odeonsplatz",1);
        g.KanteEinfuegen("Pasing","Geltendorf",1);
        g.KanteEinfuegen("Pasing","Herrsching",1);
        g.KanteEinfuegen("Pasing","Laim",1);
        g.KanteEinfuegen("Pasing","Mammendorf",1);
        g.KanteEinfuegen("Petershausen","Dachau",1);
        g.KanteEinfuegen("Scheidplatz","Feldmoching",1);
        g.KanteEinfuegen("Scheidplatz","Hauptbahnhof",1);
        g.KanteEinfuegen("Scheidplatz","OEZ",1);
        g.KanteEinfuegen("Sendlinger Tor","Fürstenried",1);
        g.KanteEinfuegen("Sendlinger Tor","Giesing",1);
        g.KanteEinfuegen("Sendlinger Tor","Harras",1);
        g.KanteEinfuegen("Sendlinger Tor","Hauptbahnhof",1);
        g.KanteEinfuegen("Sendlinger Tor","Marienplatz",1);
        g.KanteEinfuegen("Trudering","Ebersberg",1);
        g.KanteEinfuegen("Trudering","Innsbrucker Ring",1);
        g.KanteEinfuegen("Trudering","Messe",1);
        g.KanteEinfuegen("Trudering","Ostbahnhof",1);
        g.KanteEinfuegen("Tutzing","Pasing",1);
        g.KanteEinfuegen("Wolfratshausen","Harras",1);

        g.Ausgeben();
    }

    public static void RichtungTest() {
        RICHTUNG r = new RICHTUNG(30);    
    
        r.OrtHinzufuegen(1,1,"A");
        r.OrtHinzufuegen(2,1,"B");
        r.OrtHinzufuegen(2,2,"C");
        r.OrtHinzufuegen(3,2,"D");
        r.OrtHinzufuegen(3,3,"E");
        r.OrtHinzufuegen(2,3,"F");
        r.OrtHinzufuegen(1,3,"G");
        r.OrtHinzufuegen(1,4,"H");
        r.OrtHinzufuegen(1,5,"I");
        r.OrtHinzufuegen(2,5,"J");
        r.OrtHinzufuegen(3,5,"K");
        r.OrtHinzufuegen(4,5,"L");
        r.OrtHinzufuegen(4,4,"M");
        r.OrtHinzufuegen(4,3,"N");
        r.OrtHinzufuegen(5,3,"O");
        r.OrtHinzufuegen(6,3,"P");
        r.OrtHinzufuegen(6,2,"Q");
        r.OrtHinzufuegen(7,2,"R");
        r.OrtHinzufuegen(7,3,"S");
        r.OrtHinzufuegen(7,4,"T");
        r.OrtHinzufuegen(8,4,"U");
        r.OrtHinzufuegen(8,3,"V");
        
        ArrayList<String> Test = new ArrayList<>();
        Test.add("A");
        Test.add("B");
        Test.add("C");
        Test.add("D");
        Test.add("E");
        Test.add("F");
        Test.add("G");
        Test.add("H");
        Test.add("I");
        Test.add("J");
        Test.add("K");
        Test.add("L");
        Test.add("M");
        Test.add("N");
        Test.add("O");
        Test.add("P");
        Test.add("Q");
        Test.add("R");
        Test.add("S");
        Test.add("T");
        Test.add("U");
        Test.add("V");
        
        System.out.println(r.Richtungen(Test));
    }
    
    public static void main(String[] args) {
        //AusfuehrenAusschnitt();
        RichtungTest();
    }
}
