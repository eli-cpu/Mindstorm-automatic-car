package com.lego.ev3.lejos.current;

import java.util.ArrayList; // Import von ArrayList um Michis und Davids Code nutzen zu können, der auch ArrayLists nutzt

public class ADAPTER_WEG {
	
	int max_knoten; // Anzahl allter Knoten auf der Strecke
	GRAPH_MATRIX dijkstra; // Zugriff auf Michis Dijkstra Code
	RICHTUNG richtung; // Zugriff auf Davids Code eine Liste von Knoten in Richtungen umzuwandeln
	public String start; // String des Startknotens
	public String end; // String des Endknotens
	
	public ADAPTER_WEG(String startInput, String endInput) // Input for start und end4
	{
		max_knoten = 20; // 20 nur als Probewert
		dijkstra = new GRAPH_MATRIX(max_knoten); // Initialisieren des Dijkstras
		richtung = new RICHTUNG(max_knoten); // Initialisieren des Umwandlungscodes
		start = startInput; // start setzen
		end = endInput; // end setzen
	}
	
	public ArrayList<String> liste_geben() // Diese Methode gibt einfach die Methode Richtungen von Davids Code wieder mit der Liste bekommen von Michis Code Kuerzester Weg mit start und end als Knoten
	{
		return richtung.Richtungen(dijkstra.KuerzesterWeg(start,end));
	}
	
	public String startGeben()
	{
		return start;
	}
	
	public String endGeben()
	{
		return end;
	}
}

