package frc.robot;

public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class ChassisConstants{
    public static final int kLeft1MotorID = 0;
    public static final int kLeft2MotorID = 1;
    public static final int kRight1MotorID = 2;
    public static final int kRight2MotorID = 3;

    public static final double kDrivingSpeed = 0.6;
  }

  public static class ElevatorConstants{
    public static final int kElevatorLeftMotorID = 4;
    public static final int kElevatorRightMotorID = 5;
  }

  public static class ModuleConstants{
    // 輪子轉向的kP常數
    public static final double kPTurning = 0.5;

    // 輪子單位換算
    public static final double kWheelDiameterMeters = 0.0992;
    public static final double kDriveMotorGearRatio = 1 / 5.95;
    public static final double kTurningMotorGearRatio = 1 / 42;

    public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters; // Position
    public static final double kDriveEncoderRot2MeterPerSec = kDriveEncoderRot2Meter / 60; // Velocity
    public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI; // Position
    public static final double kTurningEncoderRot2RadPerSec = kTurningEncoderRot2Rad / 60; // Velocity
  }
}
