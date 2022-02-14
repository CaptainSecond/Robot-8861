// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivesubsysteme;

public class DriveCommand extends CommandBase {
  Drivesubsysteme drive;
  DoubleSupplier m_left;
  DoubleSupplier m_right;

  /** Creates a new DriveCommand. */
  public DriveCommand(Drivesubsysteme m_drive, DoubleSupplier left, DoubleSupplier right) {
    drive = m_drive; 
    m_left = left;
    m_right = right;
    addRequirements(drive);

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive.arcadeDrive(m_left.getAsDouble(), m_right.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
