package forms;

import controllers.FramesController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CodeConfirm {
    private JPanel rootPanel;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JTextPane helpText;
    private JTextField codeField;
    private JButton confirmButton;
    private JLabel phoneNumber;

    private FramesController controller;

    public CodeConfirm(FramesController framesController) {
        controller = framesController;
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.jampToContactList(codeField.getText());
            }
        });
        codeField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    controller.jampToContactList(codeField.getText());
                }
            }
        });
        confirmButton.requestFocus();
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setPhoneNumber(String text) {
        phoneNumber.setText(text);
    }

    public JTextField getTextField() {
        return codeField;
    }

    public void clear() {
        codeField.setText("");
    }
}
