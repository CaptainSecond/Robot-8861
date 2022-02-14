// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TurretConstants;

public class Turetsubsystem extends SubsystemBase {
  PWMSparkMax turetMotor = new PWMSparkMax(TurretConstants.TurretMotoroutput);
  /** Creates a new Turetsubsystem. */
  public Turetsubsystem() {

  }
  public void runTurret(double speed){
    turetMotor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
