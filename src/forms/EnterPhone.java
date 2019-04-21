package forms;

import controllers.FramesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class EnterPhone {

    private JPanel rootPanel;
    private JPanel topPane;
    private JTextPane helpText;
    private JTextField textField1;
    private JButton nextButton;

    private FramesController controller;

    public EnterPhone(FramesController framesController) {
        controller = framesController;
        textField1.requestFocus();
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.jumpToCodeConfirm(textField1.getText());
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    controller.jumpToCodeConfirm(textField1.getText());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                /*if(e.getKeyCode() == KeyEvent.VK_ENTER&&e.){
                    controller.jumpToCodeConfirm(textField1.getText());
                }*/
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
        });
    }

    public Container getRootPanel() {
        return rootPanel;
    }

    public JTextField getTextField() {
        return textField1;
    }

    public void clear() {
        textField1.setText("");
    }
}
