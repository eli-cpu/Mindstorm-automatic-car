package com.lego.ev3.lejos.current;

public class KNOTEN
{
    private String bezeichnung;

    public KNOTEN(String neuerWert)
    {
        bezeichnung = neuerWert;
    }

    public String BezeichnungGeben()
    {
        return bezeichnung;
    }

     public String BezFormatGeben(int breite)
    {
         return (bezeichnung+"               ").substring(0,breite);
    }
    
}
