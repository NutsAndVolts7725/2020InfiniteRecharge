/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.commands.TunelEntryCommand;
import frc.robot.commands.TunelFinalCommand;
import frc.robot.commands.TurretCommand;
import frc.robot.commands.CompressorCommand;
import frc.robot.commands.RotateTurretCommand;
import frc.robot.commands.WheelCommand;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.POVButton;
import edu.wpi.first.wpilibj.Joystick;




/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
  
  //DRIVER CONTROLLER
  public Joystick driverController = new Joystick(RobotMap.DRIVER_CONTROLLER);

  JoystickButton JoystickButton2 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_1_BUTTON_2);
  JoystickButton JoystickButton9 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_1_BUTTON_9);
  JoystickButton JoystickButton10 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_1_BUTTON_10);
  JoystickButton JoystickButton12 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_1_BUTTON_12);



  //TURRET CONTROLLER
  Joystick turretController = new Joystick(RobotMap.DRIVER_CONTROLLER_2);
 
  JoystickButton Joystick2TriggerLeft = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_TRIGGER_LEFT);
  JoystickButton joystick2TriggerRight = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_TRIGGER_RIGHT);

  JoystickButton Joystick2ButtonLeft = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_LEFT);
  JoystickButton Joystick2ButtonRight = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_RIGHT);

  POVButton Joystick2PovUp = new POVButton(turretController, RobotMap.POV_UP);
  POVButton Joystick2PovDown = new POVButton(turretController, RobotMap.POV_DOWN);

  JoystickButton Joystick2ButtonYellow = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_YELLOW);
  JoystickButton Joystick2ButtonBlue = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_BLUE);
  JoystickButton Joystick2ButtonGreen = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_GREEN);
  JoystickButton Joystick2ButtonRed = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_RED);
  JoystickButton Joystick2ButtonStart = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_START);
  JoystickButton Joystick2ButtonDown = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_DOWN);
  JoystickButton Joystick2ButtonUp = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_UP);

public OI() {
  this.JoystickButton2.whenPressed(new TunelEntryCommand());
  
  this.joystick2TriggerRight.whileHeld(new RotateTurretCommand(RotateTurretCommand.Direction.RIGHT));
  this.Joystick2TriggerLeft.whileHeld(new RotateTurretCommand(RotateTurretCommand.Direction.LEFT));

  this.Joystick2PovUp.whenPressed(new TunelFinalCommand(TunelFinalCommand.Direction.TUNEL_FINAL_UP));
  this.Joystick2PovDown.whenPressed(new TunelFinalCommand(TunelFinalCommand.Direction.TUNEL_FINAL_DOWN));
  this.Joystick2ButtonLeft.whenPressed(new TunelFinalCommand(TunelFinalCommand.Direction.TUNEL_FINAL_OFF));
  this.Joystick2ButtonRight.whenPressed(new TurretCommand());
  this.Joystick2ButtonYellow.whileHeld(new WheelCommand(WheelCommand.Options.YELLOW));
  this.Joystick2ButtonBlue.whileHeld(new WheelCommand(WheelCommand.Options.BLUE));
  this.Joystick2ButtonGreen.whileHeld(new WheelCommand(WheelCommand.Options.GREEN));
  this.Joystick2ButtonRed.whileHeld(new WheelCommand(WheelCommand.Options.RED));
  this.Joystick2ButtonStart.whenPressed(new WheelCommand(WheelCommand.Options.CYCLE));

  this.Joystick2ButtonDown.whenPressed(new CompressorCommand(CompressorCommand.Direction.UP_ROULETTE));
  this.Joystick2ButtonUp.whenPressed(new CompressorCommand(CompressorCommand.Direction.DOWN_ROULETTE));


}

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());
  

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
