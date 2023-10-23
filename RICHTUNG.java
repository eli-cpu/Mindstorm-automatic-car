package com.lego.ev3.lejos.current;

import java.util.ArrayList;

public class RICHTUNG {

    private int xPos;
    private int yPos;
    private int groesse;
    private String[][] orte;
    private String blickrichtung;
    
    public RICHTUNG(int groesse1) {
        xPos = 0;
        yPos = 0;
        groesse = groesse1;
        orte = new String[groesse][groesse];
        for (int x=0; x<groesse; x++){
            for (int y=0; y<groesse; y++) {
                    orte[x][y] = "0";
            }
        }
        
        blickrichtung = "N";
    }
    
    public void OrtHinzufuegen(int x, int y, String Name) {
        orte[x][y] = Name;
    }
    
    private void StartPosiSetzen(String Start) {
          for (int x=0; x<groesse; x++){
                for (int y=0; y<groesse; y++) {
                    if(orte[x][y].equals(Start)) {
                        xPos=x;
                        yPos=y;
                    }
                }
          }            
    }
    
    private void StartBickrichtungSetzen(String NextPosi) {
        if(orte[xPos][yPos+1].equals(NextPosi)) {
            blickrichtung = "N";
            yPos++;
        }
        else if(orte[xPos+1][yPos].equals(NextPosi)) {
            blickrichtung = "O";
            xPos++;
        }
        else if(orte[xPos][yPos-1].equals(NextPosi)) {
            blickrichtung = "S";
            yPos--;
        }
        else if(orte[xPos-1][yPos].equals(NextPosi)) {
            blickrichtung = "W";
            xPos--;
        }
    }
    
    private boolean Vergleich(int x, int y , String name){
        if(x<groesse && y<groesse && x>=0 && y>=0){
            return orte[x][y].equals(name);
        }
        return false;
    }
    
    private String AusgabeList(ArrayList<String> liste, int stelle) {
    	return liste.get(stelle);
    }
    
    public ArrayList<String> Richtungen(ArrayList<String> Weg){
        ArrayList<String> Richtungen = new ArrayList<>();
        StartPosiSetzen(Weg.get(0));
        StartBickrichtungSetzen(Weg.get(1));
        int laenge = Weg.size();
        Richtungen.add("m");
        for (int i=2; i <= laenge-1; i++) {
            switch (blickrichtung) {
              case "N":
                  if(Vergleich(xPos, yPos-1, AusgabeList(Weg, i))) {
                        blickrichtung = "N";
                        yPos--;
                        Richtungen.add("m");
                  }
                  else if(Vergleich(xPos, yPos-2, AusgabeList(Weg, i))) {
                      blickrichtung = "N";
                      yPos = yPos-2;
                      Richtungen.add("m");
                  }
                  else if(Vergleich(xPos+1, yPos, AusgabeList(Weg, i))) {
                        blickrichtung = "O";
                        xPos++;
                        Richtungen.add("r");
                  }
                  else if(Vergleich(xPos+2, yPos, AusgabeList(Weg, i))) {
                      blickrichtung = "O";
                      xPos = xPos+2;
                      Richtungen.add("r");
                  }
                  else if(Vergleich(xPos-1, yPos, AusgabeList(Weg, i))) {
                        blickrichtung = "W";
                        xPos--;
                        Richtungen.add("l");
                    }
                  else if(Vergleich(xPos-2, yPos, AusgabeList(Weg, i))) {
                      blickrichtung = "W";
                      xPos = xPos-2;
                      Richtungen.add("l");
                  }
                break;
              case "O":
                  if(Vergleich(xPos+1, yPos, AusgabeList(Weg, i))) {
                        blickrichtung = "O";
                        xPos++;
                        Richtungen.add("m");
                    }
                  else if(Vergleich(xPos+2, yPos, AusgabeList(Weg, i))) {
                      blickrichtung = "O";
                      xPos = xPos+2;
                      Richtungen.add("m");
                  }
                    else if(Vergleich(xPos, yPos+1, AusgabeList(Weg, i))) {
                        blickrichtung = "S";
                        yPos++;
                        Richtungen.add("r");
                    }
                    else if(Vergleich(xPos, yPos+2, AusgabeList(Weg, i))) {
                        blickrichtung = "S";
                        yPos = yPos+2;
                        Richtungen.add("r");
                    }
                    else if(Vergleich(xPos, yPos-1, AusgabeList(Weg, i))) {
                        blickrichtung = "N";
                        yPos--;
                        Richtungen.add("l");
                    }
                    else if(Vergleich(xPos, yPos-2, AusgabeList(Weg, i))) {
                        blickrichtung = "N";
                        yPos = yPos-2;
                        Richtungen.add("l");
                    }
                break;
              case "S":
                  if(Vergleich(xPos, yPos+1, AusgabeList(Weg, i))) {
                        blickrichtung = "S";
                        yPos++;
                        Richtungen.add("m");
                    }
                  else if(Vergleich(xPos, yPos+2, AusgabeList(Weg, i))) {
                      blickrichtung = "S";
                      yPos = yPos+2;
                      Richtungen.add("m");
                  }
                    else if(Vergleich(xPos-1, yPos, AusgabeList(Weg, i))) {
                        blickrichtung = "W";
                        xPos--;
                        Richtungen.add("r");
                    }
                    else if(Vergleich(xPos-2, yPos, AusgabeList(Weg, i))) {
                        blickrichtung = "W";
                        xPos = xPos-2;
                        Richtungen.add("r");
                    }
                    else if(Vergleich(xPos+1, yPos, AusgabeList(Weg, i))) {
                        blickrichtung = "O";
                        xPos++;
                        Richtungen.add("l");
                    }
                    else if(Vergleich(xPos+2, yPos, AusgabeList(Weg, i))) {
                        blickrichtung = "O";
                        xPos = xPos+2;
                        Richtungen.add("l");
                    }
                break;
              case "W":
                  if(Vergleich(xPos-1, yPos, AusgabeList(Weg, i))) {
                        blickrichtung = "W";
                        xPos--;
                        Richtungen.add("m");
                    }
                  else if(Vergleich(xPos-2, yPos, AusgabeList(Weg, i))) {
                      blickrichtung = "W";
                      xPos = xPos-2;
                      Richtungen.add("m");
                  }
                    else if(Vergleich(xPos, yPos-1, AusgabeList(Weg, i))) {
                        blickrichtung = "N";
                        yPos--;
                        Richtungen.add("r");
                    }
                    else if(Vergleich(xPos, yPos-2, AusgabeList(Weg, i))) {
                        blickrichtung = "N";
                        yPos = yPos-2;
                        Richtungen.add("r");
                    }
                    else if(Vergleich(xPos, yPos+1, AusgabeList(Weg, i))) {
                        blickrichtung = "S";
                        yPos++;
                        Richtungen.add("l");
                    }
                    else if(Vergleich(xPos, yPos+2, AusgabeList(Weg, i))) {
                        blickrichtung = "S";
                        yPos = yPos+2;
                        Richtungen.add("l");
                    }
                break;
            }
        }
        return Richtungen;
    }
}
