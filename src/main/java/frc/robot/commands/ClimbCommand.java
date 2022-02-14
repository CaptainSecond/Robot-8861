// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Climbsubsystem;

public class ClimbCommand extends CommandBase {
  Climbsubsystem climb;
  double speed;

  /** Creates a new ClimbCommand. */
  public ClimbCommand(Climbsubsystem m_climb, double m_speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    climb = m_climb;
    speed = m_speed;
    addRequirements(climb);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    climb.runClimb(speed);
    climb.runClimb2(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    climb.runClimb(0);
    climb.runClimb2(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
