// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class Intakesubsystem extends SubsystemBase {
  PWMSparkMax IntakeMotor = new PWMSparkMax(IntakeConstants.IntakeMotoroutput);
  /** Creates a new Intakesubsystem. */
  public Intakesubsystem() {

  }
  public void runIntake(double m_speed){
    IntakeMotor.set(m_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Intake Motor Speed", IntakeMotor.get());
  }
}
