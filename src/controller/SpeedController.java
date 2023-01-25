package controller;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import view.MainFrame;

public class SpeedController implements ChangeListener {

    @Override
    public void stateChanged(ChangeEvent arg0) {
        int speed=MainFrame.getInstance().getJsSpeed();
        MainFrame.getInstance().setSpeed(speed);
    }

}