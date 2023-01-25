package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import view.MainFrame; 

public class ShuffleController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {
        List<Integer> nums=MainFrame.getInstance().generateList();
        MainFrame.getInstance().setNums(nums);
    }

}