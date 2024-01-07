package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Elevator;

public class ElevatorCommand extends CommandBase {
  private final Elevator elevatorSubsystem;
  private final double speed;

  public ElevatorCommand(Elevator elevatorSubsystem, double speed) {
    this.speed = speed;
    this.elevatorSubsystem = elevatorSubsystem;
    addRequirements(elevatorSubsystem);
  }

  @Override
  public void initialize() {
    System.out.println("Elevator Commnad Execute!");
  }

  // Command的執行區
  @Override
  public void execute(){
    elevatorSubsystem.set(speed);
  }

  // 相對於初始化，結束的時候執行一次
  @Override
  public void end(boolean interrupted) {
    elevatorSubsystem.stopMotor();
    System.out.println("Elevator Commnad interrupted!");
  }

  // 判斷結束了沒
  @Override
  public boolean isFinished() {
    return false;
  }
}
