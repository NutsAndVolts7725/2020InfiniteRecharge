/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {

  //Motors IDs
	public static final int MOTOR_INTAKE_1_ID = 8;    //Banda entrada
  public static final int MOTOR_INTAKE_2_ID = 7;    //Banda media
  public static final int MOTOR_INTAKE_3_ID = 0;    //Banda superior
  public static final int MOTOR_WHEEL_ID = 0;       //Rueda de Ruleta 
  public static final int MOTOR_SHOOTER_ID = 0;     //Shooter 
  public static final int MOTOR_SHOOTER_2_ID = 0;   //Shooter
  public static final int MOTOR_ROTATION_ID = 5;    //Rotador de Torreta

  public static final int COMPRESSOR_1_ID = 13;       //Compresor
  public static final int COMPRESSOR_FORWARD_ID = 2;  //Compressor Forward Port
  public static final int COMPRESSOR_REVERSE_ID = 3;  //Compressor Reverse Port

  public static final int MOTOR_DRIVE_RF_ID = 12;   //Manejar derecha enfrente
  public static final int MOTOR_DRIVE_RB_ID = 11;   //Manejar derecha atras
  public static final int MOTOR_DRIVE_LF_ID = 10;   //Manejar izquierda enfrente
  public static final int MOTOR_DRIVE_LB_ID = 9;    //Manejar izquierda atras
  
  //Controllers
  public static final int DRIVER_CONTROLLER = 0;

  public static final int DRIVER_CONTROLLER_2 = 1;
  
  //Buttons
	public static final int JOYSTICK_1_BUTTON_11 = 11;
  public static final int JOYSTICK_1_BUTTON_12 = 12;
  public static final int JOYSTICK_1_BUTTON_9 = 9;
  public static final int JOYSTICK_1_BUTTON_10 = 10;
  public static final int JOYSTICK_1_BUTTON_2 = 2;
  
  public static final int JOYSTICK_2_BUTTON_LEFT = 5;
  public static final int JOYSTICK_2_BUTTON_RIGHT = 6;
  public static final int JOYSTICK_2_TRIGGER_LEFT = 7;
  public static final int JOYSTICK_2_TRIGGER_RIGHT = 8;
  public static final int JOYSTICK_2_BUTTON_YELLOW = 4;
  public static final int JOYSTICK_2_BUTTON_BLUE = 1;
  public static final int JOYSTICK_2_BUTTON_GREEN = 2;
  public static final int JOYSTICK_2_BUTTON_RED = 3;
  public static final int JOYSTICK_2_BUTTON_START = 10;
  public static final int JOYSTICK_2_BUTTON_DOWN = 11;
  public static final int JOYSTICK_2_BUTTON_UP = 12;
  
  //Driver limitations and values
  public static final double GLOBAL_VELOCITY = 0.3;
  public static final double TUNEL_ENTRY_ON_VELOCITY = 0.5;
  public static final double TURRET_ROTATION_VELOCITY_LOW = 0.3;
  public static final double TURRET_ROTATION_VELOCITY_HIGH = 0.6;
  public static final double TURRET_SPEED = 1.0;
  public static final double WHEEL_VELOCITY = 0.5;
  public static final double DISTANCE_PER_REVOLUTION = 25.13;
  public static final double PULSES_PER_REVOLUTION = 1024;
  
  //Joystick turret controller
  public static final int POV_UP = 0;
  public static final int POV_DOWN = 180;

  //Joystick driver controller
  public static final int xAxisNum = 0;
  public static final int yAxisNum = 1;
  public static final int zAxisNum = 2;
  public static final int sliderNUm = 3;

  //Variables 
  public static int [] numTicks = { 0, 0 };








  
  


}
