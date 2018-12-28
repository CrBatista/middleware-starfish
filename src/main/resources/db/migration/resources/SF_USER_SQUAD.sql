CREATE TABLE SF_USER_SQUAD
(
    USER_ID BIGINT NOT NULL,
    SQUAD_ID BIGINT NOT NULL,
    CONSTRAINT PK_SF_USER_SQUAD PRIMARY KEY (USER_ID, SQUAD_ID),
    CONSTRAINT FK_SF_USER_SQUAD__SF_USER FOREIGN KEY (USER_ID)
        REFERENCES SF_USER (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT FK_SF_USER_SQUAD__SF_SQUAD FOREIGN KEY (SQUAD_ID)
        REFERENCES SF_SQUAD (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
