package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {
  // 宣告馬達控制器
  private final CANSparkMax left1 = new CANSparkMax(Constants.ChassisConstants.kLeft1MotorID, MotorType.kBrushless);
  private final CANSparkMax left2 = new CANSparkMax(Constants.ChassisConstants.kLeft2MotorID, MotorType.kBrushless);
  private final CANSparkMax right1 = new CANSparkMax(Constants.ChassisConstants.kRight1MotorID, MotorType.kBrushless);
  private final CANSparkMax right2 = new CANSparkMax(Constants.ChassisConstants.kRight2MotorID, MotorType.kBrushless);

  // 宣告馬達控制組
  private final MotorControllerGroup left = new MotorControllerGroup(left1, left2);
  private final MotorControllerGroup right = new MotorControllerGroup(right1, right2);

  // 宣告底盤
  private final DifferentialDrive mDrive = new DifferentialDrive(left, right);

  // 宣告陀螺儀
  private final AHRS gyro = new AHRS(SPI.Port.kMXP);

  // 建構式(初始化)
  public Chassis() {
    left1.restoreFactoryDefaults();
    left2.restoreFactoryDefaults();
    right1.restoreFactoryDefaults();
    right2.restoreFactoryDefaults();
    gyro.reset();
  }

  public void drive(double speed, double rotation){
    mDrive.arcadeDrive(speed*Constants.ChassisConstants.kDrivingSpeed, rotation*Constants.ChassisConstants.kDrivingSpeed);
  }

  public double getAngle(){
    return gyro.getAngle();
  }

  // 公開還是私人? 有沒有回傳值? 取名 有沒有輸入?
  public void resetGyro(){
    gyro.reset();
  }

  // 設定Gyro角度
  public void setGyroTo(double angle){
    gyro.setAngleAdjustment(angle);
  }

  @Override
  public void periodic() {
    System.out.println("Gyro Angle:" + getAngle());
  }
}
