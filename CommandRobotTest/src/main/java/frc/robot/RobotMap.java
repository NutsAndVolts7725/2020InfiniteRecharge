/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  
  
  //MOTORS
  public static final int MOTOR_INTAKE_1_ID = 5;
  public static final int MOTOR_INTAKE_2_ID = 6;

  public static final int MOTOR_TURRET_ROTATION_ID = 5;
  
  //JOYSTICKS
  public static final int DRIVER_CONTROLLER_1 = 0;
  public static final int DRIVER_CONTROLLER_2 = 0;
  
  //BUTTONS
  public static final int JOYSTICK_1_BUTTON_11 = 11;
  public static final int JOYSTICK_1_BUTTON_12 = 12;

  public static final int JOYSTICK_2_BUTTON_LEFT = 7;
  public static final int JOYSTICK_2_BUTTON_RIGHT = 8;
  
  //DRIVER LIMITATIONS AND VALUES
  public static final double GLOBAL_VELOCITY = 0.5;
public static final double GLOBAL_VELOCITY_END = 0;




  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
