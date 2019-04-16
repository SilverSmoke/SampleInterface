package controllers;

import forms.CodeConfirm;
import forms.ContactsList;
import forms.EnterPhone;

import javax.swing.*;

public class FramesController {

    private JFrame codeConfirm;
    private JFrame contactList;
    private JFrame enterFone;

    private CodeConfirm codeConfirmForm;
    private ContactsList contactListForm;
    private EnterPhone enterFoneForm;

    public FramesController(JFrame codeConfirm, JFrame contactList, JFrame enterPhone) {
        this.codeConfirm = codeConfirm;
        this.contactList = contactList;
        this.enterFone = enterPhone;
        constructionFrames();
    }

    private void constructionFrames() {
        /**enterPhone construction*/
        enterFoneForm = new EnterPhone(this);
        enterFone.setContentPane(enterFoneForm.getRootPanel());

        enterFone.setTitle("Enter Phone");
        enterFone.setSize(500, 400);
        enterFone.setLocationRelativeTo(null);
        enterFone.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        enterFone.dispose();
        enterFone.setUndecorated(true);
        enterFone.setVisible(true);

        /**confirmCode construction*/
        codeConfirmForm = new CodeConfirm(this);
        codeConfirm.setContentPane(codeConfirmForm.getRootPanel());

        codeConfirm.setTitle("Confirm Code");
        codeConfirm.setSize(500, 400);
        codeConfirm.setLocationRelativeTo(null);
        codeConfirm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        codeConfirm.dispose();
        codeConfirm.setUndecorated(true);
        codeConfirm.setVisible(false);

        /**contactList construction*/
        contactListForm = new ContactsList(this);
        contactList.setContentPane(contactListForm.getRootPanel());

        contactList.setTitle("Contact List");
        contactList.setSize(500, 400);
        contactList.setLocationRelativeTo(null);
        contactList.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        contactList.dispose();
        contactList.setUndecorated(true);
        contactList.setVisible(false);
    }

    public void jumpToCodeConfirm(String text) {
        codeConfirmForm.setPhone(text);
        enterFone.setVisible(false);
        codeConfirm.setVisible(true);
    }

    public void jampToContactList() {
        codeConfirm.setVisible(false);
        contactList.setVisible(true);
    }
}
