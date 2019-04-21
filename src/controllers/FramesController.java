package controllers;

import dao.BridgeDAO;
import forms.CodeConfirm;
import forms.ContactsList;
import forms.EnterPhone;

import javax.swing.*;

public class FramesController {

    private JFrame enterFone;

    private CodeConfirm codeConfirmForm;
    private ContactsList contactListForm;
    private EnterPhone enterFoneForm;
    private BridgeDAO bridgeDAO;

    public FramesController(JFrame enterPhone, BridgeDAO bridgeDAO) {
        this.enterFone = enterPhone;
        this.bridgeDAO =  bridgeDAO;
        constructionFrames();
    }

    private void constructionFrames() {
        /**enterPhone construction*/
        enterFoneForm = new EnterPhone(this);
        enterFone.setContentPane(enterFoneForm.getRootPanel());

        enterFone.setTitle("Enter Phone");
        enterFone.setSize(500, 400);
        enterFone.setResizable(false);
        enterFone.setLocationRelativeTo(null);
        enterFone.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        enterFone.setVisible(true);

        /**confirmCode construction*/
        codeConfirmForm = new CodeConfirm(this);

        /**contactList construction*/
        contactListForm = new ContactsList(this);
    }

    public void jumpToCodeConfirm(String text) {
        bridgeDAO.checkPhone(text);
        codeConfirmForm.setPhone(text);
        enterFone.getContentPane().removeAll();
        enterFone.getContentPane().add(codeConfirmForm.getRootPanel());
        enterFone.pack();
        enterFone.setTitle("Confirm code");
    }

    public void jampToContactList() {
        enterFone.getContentPane().removeAll();
        enterFone.getContentPane().add(contactListForm.getRootPanel());
        enterFone.pack();
        enterFone.setTitle("Contact list");
    }
}
