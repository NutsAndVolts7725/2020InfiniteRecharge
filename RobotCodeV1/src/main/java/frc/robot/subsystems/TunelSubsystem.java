/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class TunelSubsystem extends Subsystem {
  
  private VictorSPX motorIntake1 = new VictorSPX(RobotMap.MOTOR_INTAKE_1_ID);
  private VictorSPX motorIntake2 = new VictorSPX(RobotMap.MOTOR_INTAKE_2_ID);
  private VictorSPX motorIntake3 = new VictorSPX(RobotMap.MOTOR_INTAKE_3_ID);

public void TunelEntryOn(double speed) {
  motorIntake1.set(ControlMode.PercentOutput, speed); 
}

public void TunelFinalOn(double speed) {
  motorIntake2.set(ControlMode.PercentOutput, speed); 
}

public void TunelShooterOn(double speed) {
  motorIntake3.set(ControlMode.PercentOutput, speed);
}


  @Override
  public void initDefaultCommand() {
    
  }
}
