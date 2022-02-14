// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class Drivesubsysteme extends SubsystemBase {
  /** Creates a new Drive. */
  PWMSparkMax leftMotor = new PWMSparkMax(DriveConstants.LeftMotoroutput);
  PWMSparkMax rightMotor = new PWMSparkMax(DriveConstants.RightMotoroutput);
  DifferentialDrive m_drive;

  public Drivesubsysteme() {
    m_drive = new DifferentialDrive(leftMotor, rightMotor);
  }

  public void arcadeDrive(double fwd, double rot) {
    m_drive.arcadeDrive(fwd, rot);
  }

  public void tankDrive(double left, double right) {
    m_drive.tankDrive(left, right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}


