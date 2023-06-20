package com.myapp;
import java.util.ArrayList;
import java.util.List;

public class Role {
    private String roleName;
    private List<UserRole> roleUsers;

    public Role(String roleName) {
        this.roleName = roleName;
        roleUsers = new ArrayList<>();
    }

    public void addRoleUser(UserRole userRole) {
        roleUsers.add(userRole);
    }

    public List<UserRole> getRoleUsers() {
        return roleUsers;
    }

    public String getRoleName() {
        return roleName;
    }
}
