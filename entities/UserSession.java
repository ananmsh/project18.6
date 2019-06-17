package entities;

import java.util.HashSet;
import java.util.Set;

public final class UserSession {

    private static UserSession instance;

    private String userName;
    private String LoggerType;

    private UserSession(String userName, String privileges) {
        this.userName = userName;
        this.LoggerType = privileges;
    }

    public static UserSession getInstace(String userName, String privileges) {
        if(instance == null) {
            instance = new UserSession(userName, privileges);
        }
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public String getPrivileges() {
        return LoggerType;
    }

    public void cleanUserSession() {
        userName = "";// or null
        LoggerType = "";
    }

    @Override
    public String toString() {
        return "UserSession{" +
                "userName='" + userName + '\'' +
                ", privileges=" + LoggerType +
                '}';
    }
}
