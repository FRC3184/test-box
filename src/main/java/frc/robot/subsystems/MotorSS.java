/* Functions for the drivetrain subsystem */

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import frc.robot.Constants;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSS extends SubsystemBase {

  private final CANSparkMax m_motor = new CANSparkMax(Constants.kMotorPort, MotorType.kBrushless);

  /** Creates a new Drivetrain. */
  public MotorSS() {
    m_motor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void move(double speed) {
    m_motor.set(speed);
  }
}
