package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import frc.robot.Constants;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSS2 extends SubsystemBase {

    private final CANSparkMax m_motor = new CANSparkMax(Constants.kMotorPort2, MotorType.kBrushless);
  
    /** Creates a new Drivetrain. */
    public MotorSS2() {
      m_motor.set(0);
    }
  
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
  
    public void move(double driverController) {
      m_motor.set(driverController);
    }
  }
    
