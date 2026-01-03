package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DrivetrainConstants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class Drivetrain extends SubsystemBase{

    private VictorSPX leftMotor0 = new VictorSPX(DrivetrainConstants.M_LEFT_MOTOR_ID_0);
    private VictorSPX leftMotor1 = new VictorSPX(DrivetrainConstants.M_LEFT_MOTOR_ID_1);
    private VictorSPX rightMotor0 = new VictorSPX(DrivetrainConstants.M_RIGHT_MOTOR_ID_0);
    private VictorSPX rightMotor1 = new VictorSPX(DrivetrainConstants.M_RIGHT_MOTOR_ID_1);

    public Drivetrain(){
    }

    public void Drive(double leftStickY, double rightStickY){
        leftMotor0.set(ControlMode.PercentOutput, leftStickY);
        leftMotor1.follow(leftMotor1);
        rightMotor0.set(ControlMode.PercentOutput, rightStickY);
        rightMotor1.follow(rightMotor1);

    }
    public void stopMotor(){
        Drive(0.0, 0.0);
    }
    public double getStatus(){
        return rightMotor1.getMotorOutputPercent();
    }
    public void setInput(double leftSide, double rightSide){
        Drive(leftSide, rightSide);
    }
}




