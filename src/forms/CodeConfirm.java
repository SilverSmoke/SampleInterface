package forms;

import controllers.FramesController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodeConfirm {
    private JPanel rootPanel;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JTextPane наДанныйНомерТелефонаTextPane;
    private JTextPane gavagram;
    private JTextPane введитеКодСтраныИTextPanez;
    private JTextField textField1;
    private JButton продолжитьButton;
    private JLabel phone;

    private FramesController controller;

    public CodeConfirm(FramesController framesController) {
        controller = framesController;
        продолжитьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.jampToContactList();
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setPhone(String text) {
        phone.setText(text);
    }
}
