/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;


  

public class DriveSubsystem extends Subsystem {

  DifferentialDrive drive;
  SpeedControllerGroup leftSpeedCtrlGr, rightSpeedCtrlGr;
  
  public DriveSubsystem () {
    WPI_VictorSPX motorDriveRF = new WPI_VictorSPX(RobotMap.MOTOR_DRIVE_RF_ID);
    WPI_VictorSPX motorDriveRB = new WPI_VictorSPX(RobotMap.MOTOR_DRIVE_RB_ID);
    WPI_VictorSPX motorDriveLF = new WPI_VictorSPX(RobotMap.MOTOR_DRIVE_LF_ID);
    WPI_VictorSPX motorDriveLB = new WPI_VictorSPX(RobotMap.MOTOR_DRIVE_LB_ID);

    leftSpeedCtrlGr = new SpeedControllerGroup(motorDriveLF, motorDriveLB);
    rightSpeedCtrlGr = new SpeedControllerGroup(motorDriveRF, motorDriveRB);

    drive = new DifferentialDrive(leftSpeedCtrlGr, rightSpeedCtrlGr);
  } 

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveCommand());
  }

  public void drive(double xAxis, double yAxis ){
    drive.arcadeDrive(yAxis, xAxis);
  }

}
