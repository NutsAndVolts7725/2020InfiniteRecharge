/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.TunelSubsystem;
import frc.robot.subsystems.CompressorSubsystem;
import frc.robot.subsystems.TurretRotationSubsystem;
import frc.robot.subsystems.DistanceSensorSubsystem;
import frc.robot.subsystems.DriveSubsystem;
//import frc.robot.subsystems.EncoderSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.WheelSubsystem;
import edu.wpi.first.cameraserver.CameraServer;
import frc.robot.subsystems.ColorSensorSubsystem;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Encoder;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static OI m_oi;
  public static TunelSubsystem Tunel = new TunelSubsystem();
  public static ShooterSubsystem Shooter = new ShooterSubsystem();
  public static TurretRotationSubsystem RotateTurret = new TurretRotationSubsystem();
  public static WheelSubsystem Wheel = new WheelSubsystem();
  public static DistanceSensorSubsystem DistanceSensor = new DistanceSensorSubsystem();
  public static ColorSensorSubsystem ColorSensor = new ColorSensorSubsystem();
  //public static EncoderSubsystem Encoder = new EncoderSubsystem();
  public static DriveSubsystem DriveSubsystem = new DriveSubsystem();
  public static CompressorSubsystem Compressor = new CompressorSubsystem();
  public static DistanceSensorSubsystem mb1013 = new DistanceSensorSubsystem();

  Compressor c = new Compressor(6);

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    m_oi = new OI();

    CameraServer.getInstance().startAutomaticCapture();

    //ColorSensor.initColor();

    c.setClosedLoopControl(true);
    c.start();
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {

    //Encoder.getDistance();

    //SmartDashboard.putNumber("Distance (volts)", voltage);
    //SmartDashboard.putNumber("Distance (real)", distance);

    mb1013.updateDashboard();

    ColorSensor.getColor();
 


  }

  /*
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
