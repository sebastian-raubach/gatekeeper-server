/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.Timestamp;
import java.util.*;

import javax.annotation.Generated;

import jhi.gatekeeper.server.database.*;
import jhi.gatekeeper.server.database.tables.records.PasswordResetLogRecord;


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
public class PasswordResetLog extends TableImpl<PasswordResetLogRecord>
{

    /**
     * The reference instance of <code>germinate_gatekeeper.password_reset_log</code>
     */
    public static final  PasswordResetLog                              PASSWORD_RESET_LOG = new PasswordResetLog();
    private static final long                                          serialVersionUID   = -945645829;
    /**
     * The column <code>germinate_gatekeeper.password_reset_log.user_id</code>.
     */
    public final         TableField<PasswordResetLogRecord, Integer>   USER_ID            = createField("user_id", SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>germinate_gatekeeper.password_reset_log.timestamp</code>.
     */
    public final         TableField<PasswordResetLogRecord, Timestamp> TIMESTAMP          = createField("timestamp", SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");
    /**
     * The column <code>germinate_gatekeeper.password_reset_log.ip_address</code>.
     */
    public final         TableField<PasswordResetLogRecord, String>    IP_ADDRESS         = createField("ip_address", SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * Create a <code>germinate_gatekeeper.password_reset_log</code> table reference
     */
    public PasswordResetLog()
    {
        this(DSL.name("password_reset_log"), null);
    }

    /**
     * Create an aliased <code>germinate_gatekeeper.password_reset_log</code> table reference
     */
    public PasswordResetLog(String alias)
    {
        this(DSL.name(alias), PASSWORD_RESET_LOG);
    }

    /**
     * Create an aliased <code>germinate_gatekeeper.password_reset_log</code> table reference
     */
    public PasswordResetLog(Name alias)
    {
        this(alias, PASSWORD_RESET_LOG);
    }

    private PasswordResetLog(Name alias, Table<PasswordResetLogRecord> aliased)
    {
        this(alias, aliased, null);
    }

    private PasswordResetLog(Name alias, Table<PasswordResetLogRecord> aliased, Field<?>[] parameters)
    {
        super(alias, null, aliased, parameters, DSL.comment("Log table of password reset requests."));
    }

    public <O extends Record> PasswordResetLog(Table<O> child, ForeignKey<O, PasswordResetLogRecord> key)
    {
        super(child, key, PASSWORD_RESET_LOG);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PasswordResetLogRecord> getRecordType()
    {
        return PasswordResetLogRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema()
    {
        return GerminateGatekeeper.GERMINATE_GATEKEEPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes()
    {
        return Arrays.<Index>asList(Indexes.PASSWORD_RESET_LOG_PRIMARY, Indexes.PASSWORD_RESET_LOG_USER_ID_USERS_USER_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PasswordResetLogRecord> getPrimaryKey()
    {
        return Keys.KEY_PASSWORD_RESET_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PasswordResetLogRecord>> getKeys()
    {
        return Arrays.<UniqueKey<PasswordResetLogRecord>>asList(Keys.KEY_PASSWORD_RESET_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PasswordResetLogRecord, ?>> getReferences()
    {
        return Arrays.<ForeignKey<PasswordResetLogRecord, ?>>asList(Keys.PASSWORD_RESET_LOG_IBFK_1);
    }

    public Users users()
    {
        return new Users(this, Keys.PASSWORD_RESET_LOG_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordResetLog as(String alias)
    {
        return new PasswordResetLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordResetLog as(Name alias)
    {
        return new PasswordResetLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PasswordResetLog rename(String name)
    {
        return new PasswordResetLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PasswordResetLog rename(Name name)
    {
        return new PasswordResetLog(name, null);
    }
}
