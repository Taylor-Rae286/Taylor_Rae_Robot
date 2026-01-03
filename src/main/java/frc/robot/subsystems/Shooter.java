package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants.ShooterConstants;

public class Shooter extends SubsystemBase{
    private TalonSRX m_TalonSRX = new TalonSRX(ShooterConstants.M_SHOOTER_MOTER_ID_0);
    private SimpleMotorFeedforward m_Feedforward = new SimpleMotorFeedforward(ShooterConstants.ks, ShooterConstants.kv);
    private PIDController m_PidController = new PIDController(0.0, 0.0, 0.0);


    public Shooter(){

    }

    public void Shoot(Double speed){
        m_TalonSRX.set(ControlMode.Velocity, (m_Feedforward.calculate(speed) + m_PidController.calculate(speed)));
    }
}

