/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

/**
 * Add your docs here.
 */
public class TurretRotation extends Subsystem {
  private VictorSPX motorTurret = new VictorSPX(RobotMap.MOTOR_TURRET_ROTATION_ID);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new TurretRight());
  }

  public void setSpeedRight (boolean isActive) {
    if (isActive) {
      motorTurret.set(ControlMode.PercentOutput, RobotMap.GLOBAL_VELOCITY);
    }  
  }

  public void setSpeedLeft (boolean isActive) {
    if (isActive) {
      motorTurret.set(ControlMode.PercentOutput, -RobotMap.GLOBAL_VELOCITY);
    }  
  }
}
