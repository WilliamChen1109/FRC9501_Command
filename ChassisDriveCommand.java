package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Chassis;

public class ChassisDriveCommand extends CommandBase {
  // Subsystem的建構方式:
  // 1.在Class底下先把要用到的Subsystem宣告出來(不要new出來)
  private final Chassis mChassis;
  private final double speed, rotation;
  // 建構式(跟使用者要Subsystem)
  public ChassisDriveCommand(Chassis mChassis, double speed, double rotation) {
    // 2.把呼叫Command提供的Subsystem指派給Class內的物件
    this.mChassis = mChassis;
    this.speed = speed;
    this.rotation = rotation;
    addRequirements(mChassis);
  }

  // 初始化，開始的時候執行一次
  @Override
  public void initialize() {
    System.out.println("Chassis Drive Commnad Execute!");
  }

  // Command的執行區
  @Override
  public void execute() {
    mChassis.drive(speed, rotation);
  }

  // 相對於初始化，結束的時候執行一次
  @Override
  public void end(boolean interrupted) {
    System.out.println("Chassis Drive Commnad interrupted!");
  }

  // 判斷結束了沒
  @Override
  public boolean isFinished() {
    return false;
  }
}
