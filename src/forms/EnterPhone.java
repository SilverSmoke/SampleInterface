package forms;

import controllers.FramesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EnterPhone {

    JPanel rootPanel;
    private JPanel topPane;
    private JTextPane helpText;
    private JTextField textField1;
    private JButton nextButton;

    private FramesController controller;

    public EnterPhone(FramesController framesController) {
        controller = framesController;
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.jumpToCodeConfirm(textField1.getText());
            }
        });
    }

    public Container getRootPanel() {
        return rootPanel;
    }
}
