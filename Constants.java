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

  public static class DriveConstants{
    public static final double kPhysicalMaxSpeedMeterPerSecond = 5;

    // 四顆輪子的DriveMotorID
    public static final int kFrontLeftDriveMotorPort = 8;
    public static final int kBackLeftDriveMotorPort = 2;
    public static final int kFrontRightDriveMotorPort = 6;
    public static final int kBackRightDriveMotorPort = 4;

    // 四顆輪子的TurningMotorID
    public static final int kFrontLeftTurningMotorPort = 7;
    public static final int kBackLeftTurningMotorPort = 1;
    public static final int kFrontRightTurningMotorPort = 5;
    public static final int kBackRightTurningMotorPort = 3;

    // 四個輪子的TurningEncoder要不要反轉
    public static final boolean kFrontLeftTurningEncoderReversed = true;
    public static final boolean kBackLeftTurningEncoderReversed = true;
    public static final boolean kFrontRightTurningEncoderReversed = true;
    public static final boolean kBackRightTurningEncoderReversed = true;

    // 四顆輪子的DriveEncoder要不要反轉
    public static final boolean kFrontLeftDriveEncoderReversed = true;
    public static final boolean kBackLeftDriveEncoderReversed = true;
    public static final boolean kFrontRightDriveEncoderReversed = false;
    public static final boolean kBackRightDriveEncoderReversed = false;

    // 四顆輪子的AbsoluteEncoderPort
    public static final int kFrontLeftDriveAbsoluteEncoderPort = 0;
    public static final int kBackLeftDriveAbsoluteEncoderPort = 1;
    public static final int kFrontRightDriveAbsoluteEncoderPort = 2;
    public static final int kBackRightDriveAbsoluteEncoderPort = 3;

    // 四顆輪子的Encoder要不要反轉
    public static final boolean kFrontLeftAbsoluteEncoderReversed = false;
    public static final boolean kBackLeftAbsoluteEncoderReversed = false;
    public static final boolean kFrontRightAbsoluteEncoderReversed = false;
    public static final boolean kBackRightAbsoluteEncoderReversed = false;

    // 四顆輪子AbsoluteEncoder的Offset(要自己調參數)
    public static final double kFrontLeftAbsoluteEncoderOffsetRad = 0;
    public static final double kBackLeftAbsoluteEncoderOffsetRad = 0;
    public static final double kFrontRightAbsoluteEncoderOffsetRad = 0;
    public static final double kBackRightAbsoluteEncoderOffsetRad = 0;
  }
}
