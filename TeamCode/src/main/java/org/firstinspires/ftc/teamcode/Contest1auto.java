package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


@Autonomous(name = "Contest 1 Autonomous", group = "Autonomous")
public class Contest1auto extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();

    RobotHardware robot;

    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        robot = new RobotHardware(hardwareMap);

        waitForStart();
        runtime.reset();

        // autonomous start
        robot.move(30,0,0.15);
        robot.move(5, -10, 0.02);
        robot.carousel.setPower(1);
        robot.move(40, 0, 0.02);
        robot.carousel.setPower(0);

        telemetry.addData("Finished", "RT: " + runtime.toString());
        telemetry.update();
    }

}