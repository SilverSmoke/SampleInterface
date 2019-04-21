package main;

import controllers.FramesController;
import dao.BridgeDAO;
import daoImplements.BridgeDAOImplement;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame enterPhone = new JFrame();
        BridgeDAO bridgeDAO = new BridgeDAOImplement();

        FramesController controller = new FramesController(enterPhone, bridgeDAO);
    }
}
