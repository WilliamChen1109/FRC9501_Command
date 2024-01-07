package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;

public class SwerveModule {
    // 宣告馬達
    private final CANSparkMax driveMotor;
    private final CANSparkMax turningMotor;

    // 宣告Encoder
    private final RelativeEncoder driveEncoder;
    private final RelativeEncoder turningEncoder;

    // 宣告PID控制器
    private final PIDController turningPidController;

    public SwerveModule(int driveMotorId, int turningMotorId){
        driveMotor = new CANSparkMax(driveMotorId, MotorType.kBrushless);
        turningMotor = new CANSparkMax(turningMotorId, MotorType.kBrushless);

        driveEncoder = driveMotor.getEncoder();
        turningEncoder = turningMotor.getEncoder();

        turningPidController = new PIDController(1, 0, 0);
    }
}
