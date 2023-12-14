package com.lego.ev3.lejos.current;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class FARBSENSOR2 {
	EV3ColorSensor colorSensor;
	SampleProvider colorProvider;
	float[] colorSample;
	float color;
	
	public static void main(String[] args)
	{
		new FARBSENSOR2();

	}
	
	public FARBSENSOR2() {
		Port s3 = LocalEV3.get().getPort("S3");
		colorSensor = new EV3ColorSensor(s3);
		colorProvider = colorSensor.getColorIDMode();
		colorSample = new float[colorProvider.sampleSize()];
		colorSensor.close();
	}
	
	public float read_colour()
	{
		return color;
	}
	
	public void measure_color()
	{
		Port s = LocalEV3.get().getPort("S3");
		colorSensor = new EV3ColorSensor(s);
		colorProvider = colorSensor.getColorIDMode();
		colorProvider.fetchSample(colorSample, 0);
		color = colorSample[0];
		colorSensor.close();
	}

}
