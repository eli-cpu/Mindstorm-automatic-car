package com.lego.ev3.lejos.current;


import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.MindsensorsLineLeader;
import lejos.robotics.SampleProvider;
import lejos.hardware.Keys;
import lejos.hardware.lcd.GraphicsLCD;

public class LineLeader {
	MindsensorsLineLeader line;
	SampleProvider lineProvider;
	float[] lineSample;
	int Sample;
	boolean using;
	int off;
	int strecke;
	int außerhalb;
	Keys keys;
	GraphicsLCD lcd;
	
	public static void main(String[] args)
	{
		new LineLeader();
	}
	
	public LineLeader() {
		Port s4 = LocalEV3.get().getPort("S4");
		line = new MindsensorsLineLeader(s4);
		lineProvider = line.getRedMode();
		using = true;
		keys = LocalEV3.get().getKeys();
		lcd = LocalEV3.get().getGraphicsLCD();
		lineSample = new float[lineProvider.sampleSize()];
		schwarz_weiss_konfigurieren();
		
		/*while (Button.ESCAPE.isUp())
		{
			calculate_off();
			System.out.println(read_off());
			Delay.msDelay(250);
		
		/*while (Button.ESCAPE.isUp()) {
			lineProvider.fetchSample(lineSample, 0);
			System.out.println(lineSample[0]);
			System.out.println(lineProvider.sampleSize());
			Delay.msDelay(250);}*/
		
		
	line.close();
	}
	
	public void set_using(boolean new_using)
	{
		using = new_using;
	}
	
	public void calculate_off()
	{
		Port s = LocalEV3.get().getPort("S4");
		line = new MindsensorsLineLeader(s);
		lineProvider.fetchSample(lineSample, 0);
		if(lineSample[0] == 1.0 ) // 1.0 == weiß, bzw. hellere Farbe
		{
			off = 1; // zu weit rechts
		}
		else if(lineSample[7] == 1.0)
		{
			off = -1; // zu weit links
		}
		else if(lineSample[0] ==0.0 && lineSample[7] == 0.0) // 0.0 == schwarz, bzw dunklere Farbe
		{
			off = 0; // in der mitte
		}
		line.close();
	}
	
	public int read_off()
	{
		return off;
	}
	
	public void schwarz_weiss_konfigurieren()
	{
		lcd.drawString("Weiss kalibrieren",5 ,0 ,0);
		keys.waitForAnyPress();
		line.calibrateWhite();
		lcd.clear();
		lcd.drawString("Schwarz kalibrieren",5 ,0 ,0);
		keys.waitForAnyPress();
		line.calibrateBlack();
	}
}
