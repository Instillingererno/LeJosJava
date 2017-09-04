import lejos.hardware.motor.*;
import lejos.hardware.lcd.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.NXTTouchSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.hardware.sensor.NXTColorSensor;
import lejos.hardware.sensor.NXTSoundSensor;
import lejos.hardware.sensor.NXTUltrasonicSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.hardware.ev3.EV3;
import lejos.hardware.Keys;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;
import lejos.hardware.sensor.*;

public class Student
{
	public static void main(String[] args)	throws Exception
	{
	/*	try{

			Brick brick = BrickFinder.getDefault();
			Port s3 = brick.getPort("S3");

*/
		System.out.println("Hello World");

		Motor.A.setSpeed(250);
		Motor.D.setSpeed(250);

		System.out.println("SENSPAI ARIGATO!");

		for(int i = 0; i<=3 ; i++){
		System.out.println("FORWARD!");
		Motor.A.forward();
		Motor.D.forward();
		Thread.sleep(3000);

		LCD.clear();
		System.out.println("STOP!");
    	Motor.A.stop();
     	Motor.D.stop();
		Thread.sleep(300);

		LCD.clear();
		System.out.println("SNU!");
		Motor.A.backward();
		Motor.D.forward();
		Thread.sleep(450);

		System.out.println("NY LOOP!!!!!!!!!!!!!!!");

		}

	//}

	}


}