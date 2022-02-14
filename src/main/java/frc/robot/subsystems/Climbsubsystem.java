// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimbConstants;

public class Climbsubsystem extends SubsystemBase {
  PWMSparkMax ClimbMotor = new PWMSparkMax(ClimbConstants.ClimbMotoroutput);
  PWMSparkMax ClimbMotor2 = new PWMSparkMax(ClimbConstants.ClimbMotoroutput2);
  /** Creates a new Climbsubsystem. */
  public Climbsubsystem() {}

  public void runClimb(double speed){
    ClimbMotor.set(speed);
  }
  public void runClimb2(double m_speed){
    ClimbMotor2.set(m_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
