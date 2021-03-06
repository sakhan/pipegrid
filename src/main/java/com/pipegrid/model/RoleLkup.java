package com.pipegrid.model;

import java.io.Serializable;

// Generated Aug 24, 2012 4:44:03 PM by Hibernate Tools 4.0.0


/**
 * RoleLkup generated by hbm2java
 */
public class RoleLkup implements Serializable 
{
	private String roleCode;
	private String name;
	private String description;

	public RoleLkup() {
	}

	public RoleLkup(String roleCode, String name) {
		this.roleCode = roleCode;
		this.name = name;
	}

	public RoleLkup(String roleCode, String name, String description) {
		this.roleCode = roleCode;
		this.name = name;
		this.description = description;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((roleCode == null) ? 0 : roleCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        RoleLkup other = (RoleLkup) obj;
        if (roleCode == null)
        {
            if (other.roleCode != null)
            {
                return false;
            }
        } else if (!roleCode.equals(other.roleCode))
        {
            return false;
        }
        return true;
    }


    public enum Role
    {
        ADMIN("A"),
        MEMBER("M"),
        SUPER_USER("S");
        
        private String _code;
        Role(String code) { _code = code; }
        public String getCode() { return _code; }
    }

}
