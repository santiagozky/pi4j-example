package com.santiagozky.picar;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.RaspiGpioProvider;
import com.pi4j.io.gpio.RaspiPin;

public class Pi4J {

	
	
	public static void main(String[] arg){
		
		GpioController gpio = GpioFactory.getInstance();
		RaspiGpioProvider gpioProvider = new RaspiGpioProvider();
		GpioPinPwmOutput pwm = gpio.provisionPwmOutputPin( RaspiPin.GPIO_17);
		pwm.setPwm(11);
	}
}
