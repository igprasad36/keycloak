package org.keycloak.admin.ui.rest.model;

public class AvailableRealm {
    private String realmId;
    private String displayName;

    public AvailableRealm(String realmId, String displayName) {
        this.realmId = realmId;
        this.displayName = displayName;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getRealmId() {
        return this.realmId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
