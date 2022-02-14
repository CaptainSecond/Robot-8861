// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.JoystickConstants;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.Auto.AutoCommand;
import frc.robot.subsystems.Climbsubsystem;
import frc.robot.subsystems.Drivesubsysteme;
import frc.robot.subsystems.Funelsubsytem;
import frc.robot.subsystems.Intakesubsystem;
import frc.robot.subsystems.Shootersubsystem;
import frc.robot.subsystems.Turetsubsystem;
import frc.robot.subsystems.VisionSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */

public class RobotContainer {
  public Joystick m_driverController = new Joystick(JoystickConstants.F310);

  Drivesubsysteme m_drive = new Drivesubsysteme();
  Intakesubsystem m_intake = new Intakesubsystem();
  Funelsubsytem m_funel = new Funelsubsytem();
  Turetsubsystem m_turet = new Turetsubsystem();
  Shootersubsystem m_shooter = new Shootersubsystem();
  Climbsubsystem m_climb = new Climbsubsystem();
  VisionSubsystem m_vision = new VisionSubsystem();

  // The robot's subsystems and commands are defined here...
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    m_drive.setDefaultCommand(new DriveCommand(m_drive,() -> -m_driverController.getRawAxis(1),() -> m_driverController.getRawAxis(0)));

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return new AutoCommand(m_vision, m_turet, m_funel, m_shooter, m_intake, m_drive);
  }
}
