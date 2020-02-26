/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class CompressorSubsystem extends Subsystem {
  DoubleSolenoid compressor;

  public CompressorSubsystem() {
    compressor = new DoubleSolenoid(RobotMap.COMPRESSOR_1_ID, RobotMap.COMPRESSOR_FORWARD_ID, RobotMap.COMPRESSOR_REVERSE_ID);
    compressor.set(DoubleSolenoid.Value.kOff);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void lowerWheel () {
    off();
    compressor.set(DoubleSolenoid.Value.kForward);
  }

  public void elevateWheel () {
    off();
    compressor.set(DoubleSolenoid.Value.kReverse);
  }

  public void off(){
    compressor.set(DoubleSolenoid.Value.kOff);
  }
}
