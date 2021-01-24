package com.angular.rest.webservices2.restWebservice2.jwt.resource;


import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;


  /*  {
        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYxMjA2NTc5NiwiaWF0IjoxNjExNDYwOTk2fQ.D9pCVIGMxSnYybf92A9neHGGZkUQDByzox0M5pt8vTZHnTXsz8hTz-mIeG_cUx_er0rMiwfVuXGA91W6ifDxmw"
    }*/


    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}