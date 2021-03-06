/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ViewUserDetails implements Serializable
{

    private static final long serialVersionUID = 536190046;

    private Integer   id;
    private String    username;
    private String    fullName;
    private String    emailAddress;
    private Timestamp createdOn;
    private Byte      gatekeeperAccess;
    private String    name;
    private String    acronym;
    private String    address;

    public ViewUserDetails()
    {
    }

    public ViewUserDetails(ViewUserDetails value)
    {
        this.id = value.id;
        this.username = value.username;
        this.fullName = value.fullName;
        this.emailAddress = value.emailAddress;
        this.createdOn = value.createdOn;
        this.gatekeeperAccess = value.gatekeeperAccess;
        this.name = value.name;
        this.acronym = value.acronym;
        this.address = value.address;
    }

    public ViewUserDetails(
        Integer id,
        String username,
        String fullName,
        String emailAddress,
        Timestamp createdOn,
        Byte gatekeeperAccess,
        String name,
        String acronym,
        String address
    )
    {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.createdOn = createdOn;
        this.gatekeeperAccess = gatekeeperAccess;
        this.name = name;
        this.acronym = acronym;
        this.address = address;
    }

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return this.username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getFullName()
    {
        return this.fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getEmailAddress()
    {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public Timestamp getCreatedOn()
    {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn)
    {
        this.createdOn = createdOn;
    }

    public Byte getGatekeeperAccess()
    {
        return this.gatekeeperAccess;
    }

    public void setGatekeeperAccess(Byte gatekeeperAccess)
    {
        this.gatekeeperAccess = gatekeeperAccess;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAcronym()
    {
        return this.acronym;
    }

    public void setAcronym(String acronym)
    {
        this.acronym = acronym;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("ViewUserDetails (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(fullName);
        sb.append(", ").append(emailAddress);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(gatekeeperAccess);
        sb.append(", ").append(name);
        sb.append(", ").append(acronym);
        sb.append(", ").append(address);

        sb.append(")");
        return sb.toString();
    }
}
