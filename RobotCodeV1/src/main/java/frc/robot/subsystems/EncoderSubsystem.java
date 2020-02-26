/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Counter;

/**
 * Add your docs here.
 */

//NADA DE ESTO FUNCIONA, todo es experimentacion
//Los puertos deberian de estar bien, son dos cables DIO conectados al RoboRIO en dos puertos diferentes (1,2)
//Se basa codigo en el siguiente: https://gist.github.com/DomenicP/7252269


/*
public class EncoderSubsystem extends Subsystem {
  Encoder encoder; 
  static int numRev = 0;

  public static final double kDistancePerRevolution = RobotMap.DISTANCE_PER_REVOLUTION; //8mm (diameter) wheel * pi
  public static final double kPulsesPerRevolution = RobotMap.PULSES_PER_REVOLUTION;   
  public static final double kDistancePerPulse = kDistancePerRevolution / kPulsesPerRevolution;

  public EncoderSubsystem() {
    encoder = new Encoder(2, 3, true, EncodingType.k4X);
    SmartDashboard.putNumber("Encoder", encoder.get());
  }

  @Override
  public void initDefaultCommand() {
  }

  public void getDistance() {
    encoder = new Encoder(2, 3, true, EncodingType.k4X);
    SmartDashboard.putNumber("Encoder", encoder.get());

    
    //encoder.setDistancePerPulse(kDistancePerPulse);
    //double distance = encoder.getDistance();
    //SmartDashboard.putNumber("Encoder", distance); 
    
  } 
} 
*/


