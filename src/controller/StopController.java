package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Algorithm;
import view.MainFrame;

public class StopController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {
        Algorithm alg=MainFrame.getInstance().getAlg();
        MainFrame.getInstance().setViewControls(true);
        alg.stop();
    }

}