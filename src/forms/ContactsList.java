package forms;

import controllers.FramesController;

import javax.swing.*;
import java.awt.*;

public class ContactsList {
    private JPanel rootPanel;
    private JTextPane textOfMessageTextPane;

    FramesController controller;

    public ContactsList(FramesController framesController) {
        controller = framesController;
    }

    public Container getRootPanel() {
        return rootPanel;
    }
}
