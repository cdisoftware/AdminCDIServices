package com.cdi.com.AdministradorCDI.ServiceImplements;

public class MyFileNotFoundException extends Exception {

    public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
