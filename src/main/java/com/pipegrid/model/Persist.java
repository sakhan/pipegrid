package com.pipegrid.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Base class for all Hibernate persistent objects.
 * 
 * @author sheraz.khan
 */
public abstract class Persist implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    protected Long _id = null;

    public Persist() {}
    
    public Persist(Long id)
    {
        setId(id);
    }
    
    public Long getId()
    {
        return _id;
    }
    public void setId(Long id)
    {
        _id = id;
    }
    
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_id == null) ? 0 : _id.hashCode());
        return result;
    }
    
    public boolean equals(Object obj)
    {
        if (obj instanceof Persist == false) 
        {
            return false;
        }
        if (this == obj) 
        {
            return true;
        }
        Persist rhs = (Persist) obj;
        return new EqualsBuilder()                
                .append(this.getId(), rhs.getId())
                .isEquals();
    }
    
}
