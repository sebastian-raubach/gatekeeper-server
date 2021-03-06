/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.UpdatableRecordImpl;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.gatekeeper.server.database.tables.PasswordResetLog;


/**
 * Log table of password reset requests.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PasswordResetLogRecord extends UpdatableRecordImpl<PasswordResetLogRecord> implements Record3<Integer, Timestamp, String>
{

    private static final long serialVersionUID = 389610777;

    /**
     * Create a detached PasswordResetLogRecord
     */
    public PasswordResetLogRecord()
    {
        super(PasswordResetLog.PASSWORD_RESET_LOG);
    }

    /**
     * Create a detached, initialised PasswordResetLogRecord
     */
    public PasswordResetLogRecord(Integer userId, Timestamp timestamp, String ipAddress)
    {
        super(PasswordResetLog.PASSWORD_RESET_LOG);

        set(0, userId);
        set(1, timestamp);
        set(2, ipAddress);
    }

    /**
     * Getter for <code>germinate_gatekeeper.password_reset_log.user_id</code>.
     */
    public Integer getUserId()
    {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_gatekeeper.password_reset_log.user_id</code>.
     */
    public void setUserId(Integer value)
    {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_gatekeeper.password_reset_log.timestamp</code>.
     */
    public Timestamp getTimestamp()
    {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>germinate_gatekeeper.password_reset_log.timestamp</code>.
     */
    public void setTimestamp(Timestamp value)
    {
        set(1, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_gatekeeper.password_reset_log.ip_address</code>.
     */
    public String getIpAddress()
    {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>germinate_gatekeeper.password_reset_log.ip_address</code>.
     */
    public void setIpAddress(String value)
    {
        set(2, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Timestamp> key()
    {
        return (Record2) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Timestamp, String> fieldsRow()
    {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Timestamp, String> valuesRow()
    {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1()
    {
        return PasswordResetLog.PASSWORD_RESET_LOG.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2()
    {
        return PasswordResetLog.PASSWORD_RESET_LOG.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3()
    {
        return PasswordResetLog.PASSWORD_RESET_LOG.IP_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1()
    {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2()
    {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3()
    {
        return getIpAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1()
    {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2()
    {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3()
    {
        return getIpAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordResetLogRecord value1(Integer value)
    {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordResetLogRecord value2(Timestamp value)
    {
        setTimestamp(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordResetLogRecord value3(String value)
    {
        setIpAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordResetLogRecord values(Integer value1, Timestamp value2, String value3)
    {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }
}
