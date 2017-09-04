package ev3.exercises.ultraSonicDemo;

import ev3.exercises.library.*;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.*;
import lejos.hardware.port.*;
import lejos.utility.Delay;

public class Lop
{
	public static void main(String[] args)	throws Exception
	{
		float range;
		UltraSonicSensor uss = new UltraSonicSensor(SensorPort.S4);
		range = uss.getRange();

		if(range > .25){
			Lcd.clear(7, 7, 10);
			Lcd.Print(7, 7, "%.3f", range);
			Delay.msDelay(500);

			range = uss.getRange();
	}else{

		Motor.A.setSpeed(900);
		Motor.D.setSpeed(900);

		Motor.A.forward();
		Motor.D.forward();
		Thread.sleep(8000);

}

	uss.close();



	}


}