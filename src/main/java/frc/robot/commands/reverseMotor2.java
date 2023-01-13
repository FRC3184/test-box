package frc.robot.commands;

import frc.robot.subsystems.MotorSS2;
import edu.wpi.first.wpilibj2.command.CommandBase;


/** An example command that uses an example subsystem. */
public class reverseMotor2 extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final MotorSS2 m_motor;
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param m_MotorSS2 The subsystem used by this command.
     */
    public reverseMotor2(MotorSS2 m_MotorSS2) {
      m_motor = m_MotorSS2;
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(m_MotorSS2);
    }
    
   // Called when the command is initially scheduled.
   @Override
   public void initialize() {}
  
   // Called every time the scheduler runs while the command is scheduled.
   @Override
   public void execute() {
       m_motor.move(-0.05);
   }
  
   // Called once the command ends or is interrupted.
   @Override
   public void end(boolean interrupted) {
       m_motor.move(0);
   }
  
   // Returns true when the command should end.
   @Override
   public boolean isFinished() {
     return false;
   }
  }