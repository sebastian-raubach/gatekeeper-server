/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database;


import org.jooq.*;
import org.jooq.impl.Internal;

import javax.annotation.Generated;

import jhi.gatekeeper.server.database.tables.*;
import jhi.gatekeeper.server.database.tables.records.*;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>germinate_gatekeeper</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys
{

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AccessRequestsRecord, Integer>  IDENTITY_ACCESS_REQUESTS  = Identities0.IDENTITY_ACCESS_REQUESTS;
    public static final Identity<DatabaseSystemsRecord, Integer> IDENTITY_DATABASE_SYSTEMS = Identities0.IDENTITY_DATABASE_SYSTEMS;
    public static final Identity<InstitutionsRecord, Integer>    IDENTITY_INSTITUTIONS     = Identities0.IDENTITY_INSTITUTIONS;
    public static final Identity<UnapprovedUsersRecord, Integer> IDENTITY_UNAPPROVED_USERS = Identities0.IDENTITY_UNAPPROVED_USERS;
    public static final Identity<UsersRecord, Integer>           IDENTITY_USERS            = Identities0.IDENTITY_USERS;
    public static final Identity<UserTypesRecord, Integer>       IDENTITY_USER_TYPES       = Identities0.IDENTITY_USER_TYPES;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccessRequestsRecord>           KEY_ACCESS_REQUESTS_PRIMARY              = UniqueKeys0.KEY_ACCESS_REQUESTS_PRIMARY;
    public static final UniqueKey<DatabaseSystemsRecord>          KEY_DATABASE_SYSTEMS_PRIMARY             = UniqueKeys0.KEY_DATABASE_SYSTEMS_PRIMARY;
    public static final UniqueKey<InstitutionsRecord>             KEY_INSTITUTIONS_PRIMARY                 = UniqueKeys0.KEY_INSTITUTIONS_PRIMARY;
    public static final UniqueKey<PasswordResetLogRecord>         KEY_PASSWORD_RESET_LOG_PRIMARY           = UniqueKeys0.KEY_PASSWORD_RESET_LOG_PRIMARY;
    public static final UniqueKey<SchemaVersionRecord>            KEY_SCHEMA_VERSION_PRIMARY               = UniqueKeys0.KEY_SCHEMA_VERSION_PRIMARY;
    public static final UniqueKey<UnapprovedUsersRecord>          KEY_UNAPPROVED_USERS_PRIMARY             = UniqueKeys0.KEY_UNAPPROVED_USERS_PRIMARY;
    public static final UniqueKey<UsersRecord>                    KEY_USERS_PRIMARY                        = UniqueKeys0.KEY_USERS_PRIMARY;
    public static final UniqueKey<UserHasAccessToDatabasesRecord> KEY_USER_HAS_ACCESS_TO_DATABASES_PRIMARY = UniqueKeys0.KEY_USER_HAS_ACCESS_TO_DATABASES_PRIMARY;
    public static final UniqueKey<UserTypesRecord>                KEY_USER_TYPES_PRIMARY                   = UniqueKeys0.KEY_USER_TYPES_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccessRequestsRecord, UsersRecord>                     ACCESS_REQUESTS_IBFK_1              = ForeignKeys0.ACCESS_REQUESTS_IBFK_1;
    public static final ForeignKey<AccessRequestsRecord, DatabaseSystemsRecord>           ACCESS_REQUESTS_IBFK_2              = ForeignKeys0.ACCESS_REQUESTS_IBFK_2;
    public static final ForeignKey<PasswordResetLogRecord, UsersRecord>                   PASSWORD_RESET_LOG_IBFK_1           = ForeignKeys0.PASSWORD_RESET_LOG_IBFK_1;
    public static final ForeignKey<UnapprovedUsersRecord, InstitutionsRecord>             UNAPPROVED_USERS_IBFK_1             = ForeignKeys0.UNAPPROVED_USERS_IBFK_1;
    public static final ForeignKey<UnapprovedUsersRecord, DatabaseSystemsRecord>          UNAPPROVED_USERS_IBFK_2             = ForeignKeys0.UNAPPROVED_USERS_IBFK_2;
    public static final ForeignKey<UsersRecord, InstitutionsRecord>                       USERS_IBFK_1                        = ForeignKeys0.USERS_IBFK_1;
    public static final ForeignKey<UserHasAccessToDatabasesRecord, UsersRecord>           USER_HAS_ACCESS_TO_DATABASES_IBFK_3 = ForeignKeys0.USER_HAS_ACCESS_TO_DATABASES_IBFK_3;
    public static final ForeignKey<UserHasAccessToDatabasesRecord, DatabaseSystemsRecord> USER_HAS_ACCESS_TO_DATABASES_IBFK_2 = ForeignKeys0.USER_HAS_ACCESS_TO_DATABASES_IBFK_2;
    public static final ForeignKey<UserHasAccessToDatabasesRecord, UserTypesRecord>       USER_HAS_ACCESS_TO_DATABASES_IBFK_1 = ForeignKeys0.USER_HAS_ACCESS_TO_DATABASES_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0
    {
        public static Identity<AccessRequestsRecord, Integer>  IDENTITY_ACCESS_REQUESTS  = Internal.createIdentity(AccessRequests.ACCESS_REQUESTS, AccessRequests.ACCESS_REQUESTS.ID);
        public static Identity<DatabaseSystemsRecord, Integer> IDENTITY_DATABASE_SYSTEMS = Internal.createIdentity(DatabaseSystems.DATABASE_SYSTEMS, DatabaseSystems.DATABASE_SYSTEMS.ID);
        public static Identity<InstitutionsRecord, Integer>    IDENTITY_INSTITUTIONS     = Internal.createIdentity(Institutions.INSTITUTIONS, Institutions.INSTITUTIONS.ID);
        public static Identity<UnapprovedUsersRecord, Integer> IDENTITY_UNAPPROVED_USERS = Internal.createIdentity(UnapprovedUsers.UNAPPROVED_USERS, UnapprovedUsers.UNAPPROVED_USERS.ID);
        public static Identity<UsersRecord, Integer>           IDENTITY_USERS            = Internal.createIdentity(Users.USERS, Users.USERS.ID);
        public static Identity<UserTypesRecord, Integer>       IDENTITY_USER_TYPES       = Internal.createIdentity(UserTypes.USER_TYPES, UserTypes.USER_TYPES.ID);
    }

    private static class UniqueKeys0
    {
        public static final UniqueKey<AccessRequestsRecord>           KEY_ACCESS_REQUESTS_PRIMARY              = Internal.createUniqueKey(AccessRequests.ACCESS_REQUESTS, "KEY_access_requests_PRIMARY", AccessRequests.ACCESS_REQUESTS.ID);
        public static final UniqueKey<DatabaseSystemsRecord>          KEY_DATABASE_SYSTEMS_PRIMARY             = Internal.createUniqueKey(DatabaseSystems.DATABASE_SYSTEMS, "KEY_database_systems_PRIMARY", DatabaseSystems.DATABASE_SYSTEMS.ID);
        public static final UniqueKey<InstitutionsRecord>             KEY_INSTITUTIONS_PRIMARY                 = Internal.createUniqueKey(Institutions.INSTITUTIONS, "KEY_institutions_PRIMARY", Institutions.INSTITUTIONS.ID);
        public static final UniqueKey<PasswordResetLogRecord>         KEY_PASSWORD_RESET_LOG_PRIMARY           = Internal.createUniqueKey(PasswordResetLog.PASSWORD_RESET_LOG, "KEY_password_reset_log_PRIMARY", PasswordResetLog.PASSWORD_RESET_LOG.USER_ID, PasswordResetLog.PASSWORD_RESET_LOG.TIMESTAMP);
        public static final UniqueKey<SchemaVersionRecord>            KEY_SCHEMA_VERSION_PRIMARY               = Internal.createUniqueKey(SchemaVersion.SCHEMA_VERSION, "KEY_schema_version_PRIMARY", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
        public static final UniqueKey<UnapprovedUsersRecord>          KEY_UNAPPROVED_USERS_PRIMARY             = Internal.createUniqueKey(UnapprovedUsers.UNAPPROVED_USERS, "KEY_unapproved_users_PRIMARY", UnapprovedUsers.UNAPPROVED_USERS.ID);
        public static final UniqueKey<UsersRecord>                    KEY_USERS_PRIMARY                        = Internal.createUniqueKey(Users.USERS, "KEY_users_PRIMARY", Users.USERS.ID);
        public static final UniqueKey<UserHasAccessToDatabasesRecord> KEY_USER_HAS_ACCESS_TO_DATABASES_PRIMARY = Internal.createUniqueKey(UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, "KEY_user_has_access_to_databases_PRIMARY", UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_ID, UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.DATABASE_ID);
        public static final UniqueKey<UserTypesRecord>                KEY_USER_TYPES_PRIMARY                   = Internal.createUniqueKey(UserTypes.USER_TYPES, "KEY_user_types_PRIMARY", UserTypes.USER_TYPES.ID);
    }

    private static class ForeignKeys0
    {
        public static final ForeignKey<AccessRequestsRecord, UsersRecord>                     ACCESS_REQUESTS_IBFK_1              = Internal.createForeignKey(Keys.KEY_USERS_PRIMARY, AccessRequests.ACCESS_REQUESTS, "access_requests_ibfk_1", AccessRequests.ACCESS_REQUESTS.USER_ID);
        public static final ForeignKey<AccessRequestsRecord, DatabaseSystemsRecord>           ACCESS_REQUESTS_IBFK_2              = Internal.createForeignKey(Keys.KEY_DATABASE_SYSTEMS_PRIMARY, AccessRequests.ACCESS_REQUESTS, "access_requests_ibfk_2", AccessRequests.ACCESS_REQUESTS.DATABASE_SYSTEM_ID);
        public static final ForeignKey<PasswordResetLogRecord, UsersRecord>                   PASSWORD_RESET_LOG_IBFK_1           = Internal.createForeignKey(Keys.KEY_USERS_PRIMARY, PasswordResetLog.PASSWORD_RESET_LOG, "password_reset_log_ibfk_1", PasswordResetLog.PASSWORD_RESET_LOG.USER_ID);
        public static final ForeignKey<UnapprovedUsersRecord, InstitutionsRecord>             UNAPPROVED_USERS_IBFK_1             = Internal.createForeignKey(Keys.KEY_INSTITUTIONS_PRIMARY, UnapprovedUsers.UNAPPROVED_USERS, "unapproved_users_ibfk_1", UnapprovedUsers.UNAPPROVED_USERS.INSTITUTION_ID);
        public static final ForeignKey<UnapprovedUsersRecord, DatabaseSystemsRecord>          UNAPPROVED_USERS_IBFK_2             = Internal.createForeignKey(Keys.KEY_DATABASE_SYSTEMS_PRIMARY, UnapprovedUsers.UNAPPROVED_USERS, "unapproved_users_ibfk_2", UnapprovedUsers.UNAPPROVED_USERS.DATABASE_SYSTEM_ID);
        public static final ForeignKey<UsersRecord, InstitutionsRecord>                       USERS_IBFK_1                        = Internal.createForeignKey(Keys.KEY_INSTITUTIONS_PRIMARY, Users.USERS, "users_ibfk_1", Users.USERS.INSTITUTION_ID);
        public static final ForeignKey<UserHasAccessToDatabasesRecord, UsersRecord>           USER_HAS_ACCESS_TO_DATABASES_IBFK_3 = Internal.createForeignKey(Keys.KEY_USERS_PRIMARY, UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, "user_has_access_to_databases_ibfk_3", UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_ID);
        public static final ForeignKey<UserHasAccessToDatabasesRecord, DatabaseSystemsRecord> USER_HAS_ACCESS_TO_DATABASES_IBFK_2 = Internal.createForeignKey(Keys.KEY_DATABASE_SYSTEMS_PRIMARY, UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, "user_has_access_to_databases_ibfk_2", UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.DATABASE_ID);
        public static final ForeignKey<UserHasAccessToDatabasesRecord, UserTypesRecord>       USER_HAS_ACCESS_TO_DATABASES_IBFK_1 = Internal.createForeignKey(Keys.KEY_USER_TYPES_PRIMARY, UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, "user_has_access_to_databases_ibfk_1", UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_TYPE_ID);
    }
}
