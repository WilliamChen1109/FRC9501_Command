package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveDriveOdometry;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveSubsystem extends SubsystemBase{
    private final SwerveModule frontLeft = new SwerveModule(
            0,
            0, 
            false, 
            false, 
            0, 
            0, 
            false);
            
    private final SwerveModule frontRight = new SwerveModule(
        0,
        0, 
        false, 
        false, 
        0, 
        0, 
        false);

    private final SwerveModule backLeft = new SwerveModule(
        0,
        0, 
        false, 
        false, 
        0, 
        0, 
        false);

    private final SwerveModule backRight = new SwerveModule(
        0,
        0, 
        false, 
        false, 
        0, 
        0, 
        false);

    private final AHRS gyro = new AHRS(SPI.Port.kMXP);

    private final SwerveDriveOdometry odometer = new SwerveDriveOdometry(null, new Rotation2d(gyro.getAngle()), null);
}
