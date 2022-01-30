// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimbConstants;

public class ClimbSubsystem extends SubsystemBase {
  /** Creates a new ClimbSubsystem. */
  PWMSparkMax ClimbMotor;
  public ClimbSubsystem() {
    ClimbMotor = new PWMSparkMax(ClimbConstants.ClimbMotor);
  }

  public void RunClimb(double m_speed){
    ClimbMotor.set(m_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
