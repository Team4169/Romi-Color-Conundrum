// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
       new DriveDistance(0.65, 13, drivetrain),
       new TurnDegrees(-0.5, 52, drivetrain),
       new DriveDistance(0.65, 11, drivetrain),
       new TurnDegrees(-0.5, 95, drivetrain),
       new DriveDistance(-0.75, 41, drivetrain),
       new TurnDegrees(-0.5, 86, drivetrain),
       new DriveDistance(0.65, 12, drivetrain),
       new TurnDegrees(0.5, 71, drivetrain),
       new DriveDistance(-0.65, 11, drivetrain),
       new TurnDegrees(0.5, 69, drivetrain),
       new DriveDistance(0.65, 15, drivetrain),
       new TurnDegrees(-0.5, 70, drivetrain),
       new DriveDistance(0.65, 13, drivetrain),
       new TurnDegrees(-0.5, 70, drivetrain),
       new DriveDistance(0.65, 16, drivetrain),
       new TurnDegrees(0.5, 70, drivetrain),
       new DriveDistance(0.65, 42, drivetrain),
       new TurnDegrees(0.5, 70, drivetrain),
       new DriveDistance(0.65, 12, drivetrain),
       new TurnDegrees(-0.5, 70, drivetrain),
       new DriveDistance(0.65, 15, drivetrain));
  }}
