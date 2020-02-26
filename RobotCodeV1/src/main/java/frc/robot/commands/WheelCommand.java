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
import frc.robot.subsystems.ColorSensorSubsystem;

public class WheelCommand extends Command {
  boolean isMoving = false;
  boolean isColor = false;

  static ColorSensorSubsystem colorSensor = new ColorSensorSubsystem();

  public static enum Options {
    WHEEL_ON,
    YELLOW,
    RED,
    GREEN,
    BLUE,
    CYCLE
  }

  Options options;

  public WheelCommand(Options options) {
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
          Robot.Wheel.WheelOn(RobotMap.WHEEL_VELOCITY);
          isMoving = true;
    
        } else {
          Robot.Wheel.WheelOn(0);
          isMoving = false;
        }
      break;


      case GREEN:
      boolean isColorYellow = colorSensor.isYellow();

        if (!isColorYellow) {
          Robot.Wheel.WheelOn(RobotMap.WHEEL_VELOCITY);
          System.out.println("Girando Amarillo");
          System.out.println("Amarillo Girando");
        }
        else if (isColorYellow) {
          Robot.Wheel.WheelOn(0);
          System.out.println("Acabar amarillo");
        }
        

      break;


      case BLUE:
      boolean isColorRed = colorSensor.isRed();

      if (!isColorRed) {
        Robot.Wheel.WheelOn(RobotMap.WHEEL_VELOCITY);
        System.out.println("Girando Rojo");
        System.out.println("Rojo Girando");
      }
      else if (isColorRed) {
        Robot.Wheel.WheelOn(0);
        System.out.println("Acabar rojo");
      }

      break;


      case YELLOW:

      boolean isColorGreen = colorSensor.isGreen();

      if (!isColorGreen) {
        Robot.Wheel.WheelOn(RobotMap.WHEEL_VELOCITY);
        System.out.println("Girando verde");
        System.out.println("verde Girando");
      }
      else if (isColorGreen) {
        Robot.Wheel.WheelOn(0);
        System.out.println("Acabar verde");
      }

      break;


      case RED:

      boolean isColorBlue = colorSensor.isBlue();

      if (!isColorBlue) {
        Robot.Wheel.WheelOn(RobotMap.WHEEL_VELOCITY);
        System.out.println("Girando azul");
        System.out.println("azul Girando");
      }
      else if (isColorBlue) {
        Robot.Wheel.WheelOn(0);
        System.out.println("Acabar azul");
      }

      break;


      case CYCLE:

      if (!isMoving) {
        Robot.Wheel.WheelOn(RobotMap.WHEEL_VELOCITY);
        isMoving = true;
        System.out.println("Wheel On");
      } else {
        Robot.Wheel.WheelOn(0);
        isMoving = false;
        System.out.println("Wheel Off");
      }
      

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
