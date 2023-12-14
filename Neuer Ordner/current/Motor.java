package com.lego.ev3.lejos.current;

import lejos.robotics.RegulatedMotor;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.motor.EV3LargeRegulatedMotor;


public class Motor {
	RegulatedMotor motor;
	
	
	public Motor(String Motorport)
	{
		Port port = LocalEV3.get().getPort(Motorport);
		motor = new EV3LargeRegulatedMotor(port);
		
	}
	
	void forward()
	{
		motor.forward();
	}
	
	void backward()
	{
		motor.backward();
	}
	
	void stop()
	{
		motor.stop();
	}
}
