// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class JoystickConstants{
        public static final int F310  = 0; // Joystick
        public static final int Panel = 1; // Driver Station Button
    }

    // Drive
    public static final class DriveConstants{
        public static final int LeftMotor = 0;  // Sase Sol 
        public static final int RightMotor = 1; // Sase Sağ 
        public static final boolean LeftMotorInverted = true;
        public static final boolean RightMotorInverted = true;
    }

    public static final class IntakeConstants{
        public static int IntakeMotor=2;
    }

    public static class FunnelConstants{
        public static int FunnelMotor=3;
    }

    public static class ShooterConstants{
        public static int ShooterMotor=4;
    }

    public static class ClimbConstants{
        public static int ClimbMotor=5;
    }
}
