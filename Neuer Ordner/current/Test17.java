package com.lego.ev3.lejos.current;

import lejos.hardware.Button;
import lejos.utility.Delay;
import java.util.ArrayList;
import lejos.robotics.RegulatedMotor;

public class Test17 {
	static LineLeader line;
	static FARBSENSOR2 color;
	static Motor links;
	static Motor rechts;
	static ArrayList<String> liste;
	static ADAPTER_WEG weg;
	static String start;
	static String ende;
	static int counter;
	static RegulatedMotor[] list;
	
	public Test17()
	{
		start = "A";
		ende = "F";
		line = new LineLeader();
		color = new FARBSENSOR2();
		links = new Motor("A");
		rechts = new Motor("D");
		weg = new ADAPTER_WEG(start, ende);
		liste = weg.liste_geben();
		list = new RegulatedMotor[1];
		list[0] = rechts.motor;
		counter = 0;
	}
	
	static void fahren()
	{
		links.motor.synchronizeWith(list);
		links.motor.startSynchronization();
		links.forward();
		rechts.forward();
		links.motor.endSynchronization();
		Delay.msDelay(250);
		links.motor.synchronizeWith(list);
		links.motor.startSynchronization();
		links.stop();
		rechts.stop();
		links.motor.endSynchronization();
	}
	
	static void fahren(int zeit)
	{
		links.motor.synchronizeWith(list);
		links.motor.startSynchronization();
		links.forward();
		rechts.forward();
		links.motor.endSynchronization();
		Delay.msDelay(zeit);
		links.motor.synchronizeWith(list);
		links.motor.startSynchronization();
		links.stop();
		rechts.stop();
		links.motor.endSynchronization();
	}
	
	static void links_abbiegen()
	{
		links.backward();
		rechts.forward();
		Delay.msDelay(725);
		links.stop();
		rechts.stop();
	}
	
	static void rechts_abbiegen()
	{
		rechts.backward();
		links.forward();
		Delay.msDelay(725);
		links.stop();
		rechts.stop();
	}
	
	
	static void give_directions()
	{
		if(liste.get(counter).equals("l"))
		{
			links_abbiegen();
		}
		else if(liste.get(counter).equals( "m"))
		{
			fahren();
		}
		else if(liste.get(counter).equals( "r"))
		{
			rechts_abbiegen();
		}
		counter++;
	}
	
	static void rechts_korrigieren()
	{
		rechts.backward();
		links.forward();
		Delay.msDelay(150);
		links.stop();
		rechts.stop();
		fahren(100);
		
		
	}
	
	static void links_korrigieren()
	{
		links.backward();
		rechts.forward();
		Delay.msDelay(150);
		links.stop();
		rechts.stop();
		fahren(100);
	}
	
	public static void main(String[] args)
	{
		new Test17();
		while(Button.ESCAPE.isUp() && counter >=-1) {
			System.out.println("On the way");
			if(start != ende)
			{
				color.measure_color();
				if(color.read_colour() == 2) // grün
				{
					give_directions();
				}
				else if(color.read_colour() == 7) // schwarz
				{
					line.calculate_off();
					if(line.read_off() == 0)
					{
						fahren();
					}
					else if(line.read_off() == 1)
					{
						rechts_korrigieren();
					}
					else if(line.read_off() == -1)
					{
						links_korrigieren();
					}
				}
					
			}
			else
			{
				System.out.println("Am Ziel bereits angekommen");
				counter = -1;
			}
		}
	}
}
