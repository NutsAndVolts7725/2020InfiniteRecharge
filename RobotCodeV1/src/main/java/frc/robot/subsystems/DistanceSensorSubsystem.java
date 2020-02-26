/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * Add your docs here.
 */
public class DistanceSensorSubsystem extends Subsystem {

  private static final AnalogInput mb1013 = new AnalogInput(0);
  private static final double VOLTS_TO_DIST = 108.7;

  public double getVoltage() {
    return mb1013.getVoltage();
  }

  public double getDistance() {
    return mb1013.getVoltage() * VOLTS_TO_DIST;
  }

  public void updateDashboard() {
    SmartDashboard.putNumber("Distance (volts)", getVoltage());
    SmartDashboard.putNumber("Distance (real)", getDistance());
  }

@Override
protected void initDefaultCommand() {
	
}
  
  }

