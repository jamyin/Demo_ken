package com.jam.tree;
/**
 * @author YIn
 * @time:2015年8月19日 上午9:27:56
 */
public class OrganizationEntity {  
    public int parentId;  
    public int orgId;  
    public String orgName;  
    public int getParentId() {  
        return parentId;  
    }  
    public void setParentId(int parentId) {  
        this.parentId = parentId;  
    }  
    public int getOrgId() {  
        return orgId;  
    }  
    public void setOrgId(int orgId) {  
        this.orgId = orgId;  
    }  
    public String getOrgName() {  
        return orgName;  
    }  
    public void setOrgName(String orgName) {  
        this.orgName = orgName;  
    }  
} 
