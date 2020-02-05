/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.commands.TunelEntry;
import frc.robot.commands.TunelFinal;
import frc.robot.commands.Turret;
import frc.robot.commands.RotateTurretLeft;
import frc.robot.commands.RotateTurretRight;
import frc.robot.commands.Wheel;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.POVButton;

import javax.swing.text.Position;

import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.Relay.Direction;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
  Joystick driverController = new Joystick(RobotMap.DRIVER_CONTROLLER);

  JoystickButton JoystickButton2 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_1_BUTTON_2);
  JoystickButton JoystickButton12 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_1_BUTTON_12);
  JoystickButton JoystickButton9 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_1_BUTTON_9);
  
  JoystickButton JoystickButton10 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_1_BUTTON_10);


  Joystick turretController = new Joystick(RobotMap.DRIVER_CONTROLLER_2);
  JoystickButton joystick2TriggerLeft = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_TRIGGER_LEFT);
  JoystickButton joystick2TriggerRight = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_TRIGGER_RIGHT);

  JoystickButton joystick2ButtonLeft = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_LEFT);
  JoystickButton joystick2ButtonRight = new JoystickButton(this.turretController, RobotMap.JOYSTICK_2_BUTTON_RIGHT);

  JoystickButton JoystickButton6 = new JoystickButton(this.driverController, RobotMap.JOYSTICK_2_BUTTON_LEFT);

  POVButton Joystick2PovUp = new POVButton(turretController, RobotMap.POV_UP);
  POVButton Joystick2PovDown = new POVButton(turretController, RobotMap.POV_DOWN);

public OI() {
  //this.JoystickButton11.whenPressed(new subirPelota());
  this.JoystickButton2.whenPressed(new TunelEntry());
  
  this.joystick2TriggerRight.whileHeld(new RotateTurretRight());
  this.joystick2TriggerLeft.whileHeld(new RotateTurretLeft());

  this.Joystick2PovUp.whenPressed(new TunelFinal(TunelFinal.Direction.TUNEL_FINAL_UP));
  this.Joystick2PovDown.whenPressed(new TunelFinal(TunelFinal.Direction.TUNEL_FINAL_DOWN));
  this.joystick2ButtonLeft.whenPressed(new TunelFinal(TunelFinal.Direction.TUNEL_FINAL_OFF));
  this.joystick2ButtonRight.whenPressed(new Turret());

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
