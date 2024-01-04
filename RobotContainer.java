package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.ChassisDriveCommand;
import frc.robot.commands.ElevatorCommand;
import frc.robot.subsystems.Chassis;
import frc.robot.subsystems.Elevator;

public class RobotContainer {
  // 搖桿物件建立
  private final XboxController mController = new XboxController(Constants.OperatorConstants.kDriverControllerPort);
  // Subsystem宣告和new
  private final Chassis mChassis = new Chassis();
  private final Elevator mElevator = new Elevator();

  // 建構式
  public RobotContainer() {
    // 按鍵對應
    configureBindings();

    // 預設Command
    // 傳進Command的值會動的時候必須要用Lambda表示，在Command裡要用Supplier接他
    mChassis.setDefaultCommand(new ArcadeDrive(mChassis, () -> mController.getLeftY(), () -> mController.getRightX()));
  }

  // 按鍵設定
  private void configureBindings() {
    // 按著就執行
    new JoystickButton(mController, Button.kA.value).whileTrue(new ChassisDriveCommand(mChassis, 0.4, 0));
    // 按下X下降，按下Y上升
    new JoystickButton(mController, Button.kX.value).whileTrue(new ElevatorCommand(mElevator, 0.5));
    new JoystickButton(mController, Button.kY.value).whileTrue(new ElevatorCommand(mElevator, -0.35));
    // 沒有按著就執行
    new JoystickButton(mController, Button.kB.value).whileFalse(null);
    // 按下的瞬間執行
    new JoystickButton(mController, Button.kLeftBumper.value).onTrue(null);
    // 放開的瞬間執行
    new JoystickButton(mController, Button.kStart.value).onFalse(null);
  }

  // 傳自走程式碼用的
  public Command getAutonomousCommand() {
    // 先把Elevator升上去，然後把Elevator降下來，底盤向後移動
    return new SequentialCommandGroup(
      new ElevatorCommand(mElevator, 0.4).withTimeout(1),
      new ElevatorCommand(mElevator, -0.3).withTimeout(1),
      new ChassisDriveCommand(mChassis, -0.4, 0).withTimeout(3)
    );
  }
}
