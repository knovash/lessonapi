package com.solvd.lessonapi.domain;

public class Permissions{
    public boolean admin;
    public boolean maintain;
    public boolean push;
    public boolean triage;
    public boolean pull;

    public boolean isAdmin() {
        return admin;
    }

    public boolean isMaintain() {
        return maintain;
    }

    public boolean isPush() {
        return push;
    }

    public boolean isTriage() {
        return triage;
    }

    public boolean isPull() {
        return pull;
    }
}
