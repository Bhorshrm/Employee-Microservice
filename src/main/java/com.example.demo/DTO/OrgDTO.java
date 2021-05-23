package com.example.demo.DTO;

import com.sun.istack.NotNull;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class OrgDTO  {

    private UUID orgId;
    @NotNull
    private String orgName;

    public OrgDTO(UUID orgId, String orgName) {
        this.orgId = orgId;
        this.orgName = orgName;
    }

    public OrgDTO() {
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public UUID getOrgId() {
        return orgId;
    }

    public void setOrgId(UUID orgId) {
        this.orgId = orgId;
    }
}
