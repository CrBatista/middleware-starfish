CREATE TABLE SF_USER
(
    ID BIGINT NOT NULL,
    ACTIVE BOOLEAN,
    PASSWORD VARCHAR(64),
    NAME VARCHAR(80) NOT NULL,
    SALT VARCHAR(80),
    CONSTRAINT PK_SF_USER PRIMARY KEY (ID)
);

