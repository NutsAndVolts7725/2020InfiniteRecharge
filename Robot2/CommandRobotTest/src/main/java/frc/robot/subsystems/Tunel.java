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
public class Tunel extends Subsystem {
  private VictorSPX motorIntake1 = new VictorSPX(RobotMap.MOTOR_INTAKE_1_ID);
  private VictorSPX motorIntake2 = new VictorSPX(RobotMap.MOTOR_INTAKE_2_ID);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }


  public void ActivarEntrada(double speed) {
      motorIntake1.set(ControlMode.PercentOutput, speed);
  }

  public void ActivarSubida(double speed) {
    motorIntake2.set(ControlMode.PercentOutput, speed);
  }
}
