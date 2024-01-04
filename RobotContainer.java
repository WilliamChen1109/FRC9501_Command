package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.ChassisDriveCommand;
import frc.robot.subsystems.Chassis;

public class RobotContainer {
  // 搖桿物件建立
  private final XboxController mController = new XboxController(Constants.OperatorConstants.kDriverControllerPort);
  // Subsystem宣告和new
  private final Chassis mChassis = new Chassis();

  // 建構式
  public RobotContainer() {
    // 按鍵對應
    configureBindings();

    // 預設Command
    mChassis.setDefaultCommand(new ArcadeDrive(mChassis, () -> mController.getLeftY(), () -> mController.getRightX()));
  }

  // 按鍵設定
  private void configureBindings() {
    // 按著就執行
    new JoystickButton(mController, Button.kA.value).whileTrue(new ChassisDriveCommand(mChassis, 0.4, 0));
    // 沒有按著就執行
    new JoystickButton(mController, Button.kB.value).whileFalse(null);
    // 按下的瞬間執行
    new JoystickButton(mController, Button.kLeftBumper.value).onTrue(null);
    // 放開的瞬間執行
    new JoystickButton(mController, Button.kStart.value).onFalse(null);
  }

  // 傳自走程式碼用的
  public Command getAutonomousCommand() {
    return null;
  }
}
