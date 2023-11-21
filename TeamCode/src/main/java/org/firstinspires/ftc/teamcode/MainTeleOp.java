package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Main")
public class MainTeleOp extends LinearOpMode {

    Servo armRight;
    Servo armLeft;

    @Override
    public void runOpMode() throws InterruptedException {
        armRight = hardwareMap.get(Servo.class, "armRight");
        armLeft = hardwareMap.get(Servo.class, "armLeft");
    }
}
