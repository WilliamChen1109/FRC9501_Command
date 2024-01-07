package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class SwerveModule {
    // 宣告馬達
    private final CANSparkMax driveMotor;
    private final CANSparkMax turningMotor;

    public SwerveModule(int driveMotorId, int turningMotorId){
        driveMotor = new CANSparkMax(driveMotorId, MotorType.kBrushless);
        turningMotor = new CANSparkMax(turningMotorId, MotorType.kBrushless); 
    }
}
