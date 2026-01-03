package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class makeDrive extends Command{

    private final Drivetrain m_drivetrain;
    private final CommandXboxController controller;

    public makeDrive(Drivetrain m_drivetrain, CommandXboxController controller){
        this.m_drivetrain = m_drivetrain;
        this.controller = controller;

        addRequirements(m_drivetrain);
    }

    
    @Override
    public void execute(){
        
        m_drivetrain.Drive(controller.getLeftY(), controller.getRightY());
    }

    @Override
  public boolean isFinished() {
    return false;
  }

}