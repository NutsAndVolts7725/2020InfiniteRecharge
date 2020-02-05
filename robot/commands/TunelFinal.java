/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;



public class TunelFinal extends Command {
  
  public static enum Direction {
    TUNEL_FINAL_UP,
    TUNEL_FINAL_DOWN,
    TUNEL_FINAL_OFF
  }
  
  Direction direction;
  boolean isMovingUp = false;
  boolean isMovingDown = false;

  public TunelFinal(Direction direction) {
    requires(Robot.Tunel);
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

      case TUNEL_FINAL_UP:
        isMovingDown = false;
        if (!isMovingUp) {
          Robot.Tunel.TunelFinalOn(RobotMap.GLOBAL_VELOCITY);
          isMovingUp = true;
          System.out.println("Tunel Final Up On");
          isMovingDown = false;
        } else {
          Robot.Tunel.TunelFinalOn(0);
          isMovingUp = false;
          System.out.println("Tunel Final Up Off");
          isMovingDown = false;
        }
      break;

      case TUNEL_FINAL_DOWN:
        isMovingUp = false;
        if (!isMovingDown) {
          Robot.Tunel.TunelFinalOn(-RobotMap.GLOBAL_VELOCITY);
          isMovingDown = true;
          System.out.println("Tunel Final Down On");
          isMovingUp = false;
        } else {
          Robot.Tunel.TunelFinalOn(0);
          isMovingDown = false;
          System.out.println("Tunel Final Down Off");
          isMovingUp = false;
        }
      break;

      case TUNEL_FINAL_OFF:
       isMovingUp = false;
       isMovingDown = false;
       Robot.Tunel.TunelFinalOn(0);
       System.out.println("Tunel Final ALL Off");
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
