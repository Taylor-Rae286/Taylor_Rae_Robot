package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;



public class makeShoot extends Command{
    private Shooter m_Shooter;

    public makeShoot(Shooter m_Shooter){
        this.m_Shooter = m_Shooter;

        addRequirements(m_Shooter);
    }
     

    @Override
    public void execute(){
        m_Shooter.Shoot(5.0);
    }

}
