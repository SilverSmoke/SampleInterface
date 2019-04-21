package daoImplements;

import dao.BridgeDAO;

public class BridgeDAOImplement implements BridgeDAO {

    private String phoneNumber;
    private String codeAuth;

    public BridgeDAOImplement() {
        phoneNumber = "+79059439686";
        codeAuth = "1111";
    }

    public boolean isPhone(String phoneNumber){
        return this.phoneNumber.equals(phoneNumber);
    }

    public boolean isAuthCode(String code){
        return codeAuth.equals(code);
    }
}
