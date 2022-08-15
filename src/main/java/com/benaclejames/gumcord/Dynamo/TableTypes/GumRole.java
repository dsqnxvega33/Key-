package com.benaclejames.gumcord.Dynamo.TableTypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GumRole {
    public Long RoleId;
    public Long MaxKeyAge;
    public String OODAdditionalInfo;

    public Long getRoleId() {return RoleId;}
    public void setRoleId(Long roleId) {RoleId = roleId;}

    public Long getMaxKeyAge() {return MaxKeyAge;}
    public void setMaxKeyAge(Long maxKeyAge) {MaxKeyAge = maxKeyAge;}

    public String getOODAdditionalInfo() {return OODAdditionalInfo;}
    public void setOODAdditionalInfo(String oodAdditionalInfo) {OODAdditionalInfo = oodAdditionalInfo;}
}