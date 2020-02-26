/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class TunelEntryCommand extends Command {
  boolean isMoving = false;

  public TunelEntryCommand() {
    requires(Robot.Tunel);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    if (!isMoving) {
      Robot.Tunel.TunelEntryOn(RobotMap.TUNEL_ENTRY_ON_VELOCITY);
      isMoving = true;
      System.out.println("Tunel Entry On");
    } else {
      Robot.Tunel.TunelEntryOn(0);
      isMoving = false;
      System.out.println("Tunel Entry Off");
    }

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
   
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
