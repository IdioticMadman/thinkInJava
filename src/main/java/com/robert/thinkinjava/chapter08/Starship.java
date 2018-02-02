package com.robert.thinkinjava.chapter08;


class AlertStatus {
    public void status() {
    }
}

class RunningStatus extends AlertStatus{
    public void status() {
        System.out.println("running status");
    }
}

class ErrorStatus extends AlertStatus {
    public void status() {
        System.out.println("error status");
    }
}

class FinishStatus extends AlertStatus{
    public void status() {
        System.out.println("finish status");
    }

}

public class Starship {
}
