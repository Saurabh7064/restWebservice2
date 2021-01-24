package com.angular.rest.basic.auth;

public class AuthenticationBean  {

    AuthenticationBean(){}
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    public AuthenticationBean(String message) {
        this.message=message;
    }
}
