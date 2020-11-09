package com.alaric.java.frame;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/9
 **/
public class LoginService {
public boolean login(String account, String password) {
    if ("admin".equals(account) && "123".equals(password)) {
        return true;
    }
    return false;
}
}
