// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  PWMSparkMax LMotor;
  PWMSparkMax RMotor;
  DifferentialDrive m_drive;
  public DriveSubsystem() {
    LMotor = new PWMSparkMax(DriveConstants.LeftMotor);
    RMotor = new PWMSparkMax(DriveConstants.RightMotor);
    m_drive = new DifferentialDrive(LMotor, RMotor);
  }

  public void arcadeDrive(double fwd, double rot){
    m_drive.arcadeDrive(fwd, rot);
  }

  public void tankDrive(double l, double r){
    m_drive.tankDrive(l, r);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
