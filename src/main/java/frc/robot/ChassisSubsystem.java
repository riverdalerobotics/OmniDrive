/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 * Add your docs here.
 */
public class ChassisSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Spark frontLeft;
  Spark frontRight;
  Spark backLeft;
  Spark backRight;

  MecanumDrive drive;

  
  
   //ColorSensorV3 colorSensor = new ColorSensorV3(I2C.Port.kOnboard);
  
  public ChassisSubsystem () {
    frontLeft = new Spark(1);

    frontRight = new Spark(0);
    // frontRight.setInverted(true);

    backLeft  = new Spark(2);
    // backLeft.setInverted(true);

    backRight = new Spark(3);

    drive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);


  }

public void drive(final double forward, final double side, final double rotate){
  drive.driveCartesian(side, forward, rotate);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
   setDefaultCommand(new ChassisDefaultCommand());
  }

public void output() {
  // SmartDashboard.putNumber("Red", colorSensor.getRed());
  // SmartDashboard.putNumber("Green", colorSensor.getGreen());
  // SmartDashboard.putNumber("Blue", colorSensor.getBlue());
}

}
