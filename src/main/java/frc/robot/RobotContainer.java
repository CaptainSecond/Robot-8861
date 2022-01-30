// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.JoystickConstants;
import frc.robot.commands.ClimbCommand;
import frc.robot.commands.FunnelCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.JoystickDriveCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.subsystems.ClimbSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.FunnelSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  Joystick m_driverController = new Joystick(JoystickConstants.F310);

  DriveSubsystem m_robotDrive = new DriveSubsystem();
  IntakeSubsystem m_intake = new IntakeSubsystem();
  FunnelSubsystem m_funnel = new FunnelSubsystem();
  ShooterSubsystem m_shooter = new ShooterSubsystem();
  ClimbSubsystem m_climb = new ClimbSubsystem();
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    m_robotDrive.setDefaultCommand(new JoystickDriveCommand(m_robotDrive,() -> -m_driverController.getRawAxis(1),() -> m_driverController.getRawAxis(4)));

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //new JoystickButton(m_driverController, 6).whileHeld(new IntakeGroupCommand(m_intake, m_push));
    //Intake
    new JoystickButton(m_driverController, 1).whileHeld(new IntakeCommand(m_intake, 0.8));
    new JoystickButton(m_driverController, 2).whileHeld(new IntakeCommand(m_intake, -0.8));

    //Funnel
    new JoystickButton(m_driverController, 3).whileHeld(new FunnelCommand(m_funnel, 0.8));
    new JoystickButton(m_driverController, 4).whileHeld(new FunnelCommand(m_funnel, -0.8));

    //Shooter
    new JoystickButton(m_driverController, 5).whileHeld(new ShooterCommand(m_shooter, 0.8));
    new JoystickButton(m_driverController, 6).whileHeld(new ShooterCommand(m_shooter, -0.8));

    //Climb
    new JoystickButton(m_driverController, 7).whileHeld(new ClimbCommand(m_climb, 0.8));
    new JoystickButton(m_driverController, 8).whileHeld(new ClimbCommand(m_climb, -0.8));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
