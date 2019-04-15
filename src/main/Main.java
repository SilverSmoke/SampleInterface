package main;

import controllers.FramesController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame codeConfirm = new JFrame();
        JFrame contactList = new JFrame();
        JFrame enterPhone = new JFrame();

        FramesController controller = new FramesController(codeConfirm, contactList, enterPhone);
    }
}
