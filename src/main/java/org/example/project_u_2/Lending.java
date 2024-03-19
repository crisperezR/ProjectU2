package org.example.project_u_2;

public class Lending {
    private String uId;
    private String bId;

    public Lending(String uId, String bId) {
        this.uId = uId;
        this.bId = bId;
    }

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public String getBId() {
        return bId;
    }

    public void setBId(String bId) {
        this.bId = bId;
    }
}
