/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Wheel extends Command {
  boolean isMoving = false;

  public static enum Options {
    WHEEL_ON,
    YELLOW,
    RED,
    GREEN,
    BLUE,
    CYCLE
  }

  Options options;

  public Wheel(Options options) {
    requires(Robot.Wheel);
    this.options = options;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    switch(options) {

      case WHEEL_ON:
        if (!isMoving) {
          Robot.Wheel.WheelOn(0.2);
          isMoving = true;
    
        } else {
          Robot.Wheel.WheelOn(0);
          isMoving = false;
        }
      break;


      case YELLOW:

      break;


      case RED:

      break;


      case GREEN:

      break;


      case BLUE:

      break;


      case CYCLE:

      break;


      default:
      break;

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
