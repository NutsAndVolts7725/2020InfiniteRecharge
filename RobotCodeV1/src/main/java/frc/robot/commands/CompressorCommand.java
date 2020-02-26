/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class CompressorCommand extends Command {
  public static enum Direction {
    UP_ROULETTE,
    DOWN_ROULETTE,
		OFF
  }

  Direction direction;

  public CompressorCommand(Direction direction) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.Compressor);
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
      case UP_ROULETTE:
        Robot.Compressor.elevateWheel();
        System.out.println("ABRIENDO RUEDA");
        break;
      case DOWN_ROULETTE:
        Robot.Compressor.lowerWheel();
        System.out.println("BAJANDO RUEDA");
        break;
      case OFF:
        Robot.Compressor.off();
        System.out.println("OFF PISTON");
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
  }
}
