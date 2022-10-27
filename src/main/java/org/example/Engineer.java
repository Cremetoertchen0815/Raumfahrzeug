package org.example;

public class Engineer implements ICommunicator {

    private ControlJob controlJob;
    public Engineer(ControlJob controlJob) {
        this.controlJob = controlJob;
    }
    public void messageReceived(int message) {

    }
}
