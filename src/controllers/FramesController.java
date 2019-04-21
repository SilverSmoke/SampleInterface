package controllers;

import dao.BridgeDAO;
import forms.CodeConfirm;
import forms.ContactsList;
import forms.EnterPhone;

import javax.swing.*;

public class FramesController {

    private JFrame mainFrame;

    private CodeConfirm codeConfirmForm;
    private ContactsList contactListForm;
    private EnterPhone enterPhone;

    private BridgeDAO bridgeDAO;

    public FramesController(JFrame jFrame, BridgeDAO bridgeDAO) {
        this.mainFrame = jFrame;
        this.bridgeDAO =  bridgeDAO;
        constructionFrames();
    }

    private void constructionFrames() {
        /**enterPhone construction*/
        enterPhone = new EnterPhone(this);
        mainFrame.setContentPane(enterPhone.getRootPanel());

        mainFrame.setTitle("Enter Phone");
        mainFrame.setSize(500, 400);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setVisible(true);
        enterPhone.getTextField().requestFocus();

        /**confirmCode construction*/
        codeConfirmForm = new CodeConfirm(this);

        /**contactList construction*/
        contactListForm = new ContactsList(this);
    }

    public void jumpToCodeConfirm(String text) {
        if(!bridgeDAO.isPhone(text)){
            enterPhone.clear();
            JOptionPane.showMessageDialog(mainFrame, "Введите правильный номер!");
            return;
        }
        codeConfirmForm.setPhoneNumber(text);
        mainFrame.getContentPane().removeAll();
        mainFrame.getContentPane().add(codeConfirmForm.getRootPanel());
        mainFrame.pack();
        mainFrame.setTitle("Confirm code");
        codeConfirmForm.getTextField().requestFocus();
    }

    public void jampToContactList(String code) {
        if(!bridgeDAO.isAuthCode(code)){
            codeConfirmForm.clear();
            JOptionPane.showMessageDialog(mainFrame, "Неверный код! Повторите ввод!");
            return;
        }
        mainFrame.getContentPane().removeAll();
        mainFrame.getContentPane().add(contactListForm.getRootPanel());
        mainFrame.pack();
        mainFrame.setTitle("Contact list");
    }
}
