package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveDriveOdometry;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SwerveSubsystem extends SubsystemBase{
    private final SwerveModule frontLeft = new SwerveModule(
            Constants.DriveConstants.kFrontLeftDriveMotorPort,
            Constants.DriveConstants.kFrontLeftTurningMotorPort, 
            Constants.DriveConstants.kFrontLeftDriveEncoderReversed, 
            Constants.DriveConstants.kFrontLeftTurningEncoderReversed, 
            Constants.DriveConstants.kFrontLeftDriveAbsoluteEncoderPort, 
            Constants.DriveConstants.kFrontLeftAbsoluteEncoderOffsetRad, 
            Constants.DriveConstants.kFrontLeftAbsoluteEncoderReversed);

    private final SwerveModule frontRight = new SwerveModule(
            Constants.DriveConstants.kFrontRightDriveMotorPort,
            Constants.DriveConstants.kFrontRightTurningMotorPort, 
            Constants.DriveConstants.kFrontRightDriveEncoderReversed, 
            Constants.DriveConstants.kFrontRightTurningEncoderReversed, 
            Constants.DriveConstants.kFrontRightDriveAbsoluteEncoderPort, 
            Constants.DriveConstants.kFrontRightAbsoluteEncoderOffsetRad, 
            Constants.DriveConstants.kFrontRightAbsoluteEncoderReversed);

    private final SwerveModule backLeft = new SwerveModule(
            Constants.DriveConstants.kBackLeftDriveMotorPort,
            Constants.DriveConstants.kBackLeftTurningMotorPort, 
            Constants.DriveConstants.kBackLeftDriveEncoderReversed, 
            Constants.DriveConstants.kBackLeftTurningEncoderReversed, 
            Constants.DriveConstants.kBackLeftDriveAbsoluteEncoderPort, 
            Constants.DriveConstants.kBackLeftAbsoluteEncoderOffsetRad, 
            Constants.DriveConstants.kBackLeftAbsoluteEncoderReversed);

    private final SwerveModule backRight = new SwerveModule(
            Constants.DriveConstants.kBackRightDriveMotorPort,
            Constants.DriveConstants.kBackRightTurningMotorPort, 
            Constants.DriveConstants.kBackRightDriveEncoderReversed, 
            Constants.DriveConstants.kBackRightTurningEncoderReversed, 
            Constants.DriveConstants.kBackRightDriveAbsoluteEncoderPort, 
            Constants.DriveConstants.kBackRightAbsoluteEncoderOffsetRad, 
            Constants.DriveConstants.kBackRightAbsoluteEncoderReversed);

    private final AHRS gyro = new AHRS(SPI.Port.kMXP);

    private final SwerveDriveOdometry odometer = new SwerveDriveOdometry(null, new Rotation2d(gyro.getAngle()), null);
}
