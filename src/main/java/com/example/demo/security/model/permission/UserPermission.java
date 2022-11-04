package com.example.demo.security.model.permission;

public enum UserPermission {
    DUDE_READ("dude:read"),
    DUDE_WRITE("dude:write");

    private final String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
