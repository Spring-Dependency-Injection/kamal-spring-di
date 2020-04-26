package com.kamal.springframework.dependencyInjection.kamalspringdi.examplebeans;

public class FakeJmsSource {

    private String jmsUserName;

    private String jmsUserPassword;

    private String jmsUrl;

    public String getJmsUserName() {
        return jmsUserName;
    }

    public void setJmsUserName(String jmsUserName) {
        this.jmsUserName = jmsUserName;
    }

    public String getJmsUserPassword() {
        return jmsUserPassword;
    }

    public void setJmsUserPassword(String jmsUserPassword) {
        this.jmsUserPassword = jmsUserPassword;
    }

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }
}
