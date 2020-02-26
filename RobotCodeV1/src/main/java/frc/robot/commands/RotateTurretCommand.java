/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RotateTurretCommand extends Command {
  
  public static enum Direction {
    RIGHT,
    LEFT
  }

  Direction direction;

  public RotateTurretCommand(Direction direction) {
    requires(Robot.RotateTurret);
    this.direction = direction;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    switch (direction) {
      case RIGHT:
        Robot.RotateTurret.setSpeedLeft(false);
        Robot.RotateTurret.setSpeedRight(true);
        System.out.println("Turret Rotation Right");
        break;
     
      case LEFT:
        Robot.RotateTurret.setSpeedRight(false);
        Robot.RotateTurret.setSpeedLeft(true);
        System.out.println("Turret Rotation Left");
        break;
  
      default:
        break;
    }

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.RotateTurret.setSpeedRight(false);
    Robot.RotateTurret.setSpeedLeft(false);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
