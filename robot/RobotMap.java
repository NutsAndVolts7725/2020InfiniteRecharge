/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {

  //Motors IDs
	public static final int MOTOR_INTAKE_1_ID = 5; //Entrada
  public static final int MOTOR_INTAKE_2_ID = 6; //Medio
  public static final int MOTOR_INTAKE_3_ID = 7; //Disparador
  public static final int MOTOR_INTAKE_4_ID = 8; //Ruleta
  
  public static final int MOTOR_SHOOTER_ID = 4; //Shooter
  
  public static final int MOTOR_TURRET_ROTATION_ID = 5;
  
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
  
  //Driver limitations and values
  public static final double GLOBAL_VELOCITY = 0.3;
  public static final double TUNEL_ENTRY_ON_VELOCITY = 0.5;
  public static final double TURRET_ROTATION_VELOCITY_LOW = 0.3;
  public static final double TURRET_ROTATION_VELOCITY_HIGH = 0.6;
  public static final double TURRET_SPEED = 0.3;
  
  public static final int POV_UP = 0;
  public static final int POV_DOWN = 180;




  
  


}
