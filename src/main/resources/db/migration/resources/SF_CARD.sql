CREATE TABLE SF_CARD (
    ID BIGINT NOT NULL,
    DESCRIPTION VARCHAR(3500),
    SECTION_ID BIGINT,
    SQUAD_ID BIGINT,
    STATUS_ID BIGINT,
    USER_ID BIGINT,
    CONSTRAINT PK_SF_CARD PRIMARY KEY (ID),
    CONSTRAINT PF_SF_CARD__SF_SECTION FOREIGN KEY (SECTION_ID)
        REFERENCES SF_SECTION (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT PF_SF_CARD__SF_CARD_STATUS FOREIGN KEY (STATUS_ID)
        REFERENCES SF_CARD_STATUS (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT PF_SF_CARD__SF_SQUAD FOREIGN KEY (SQUAD_ID)
        REFERENCES SF_SQUAD (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT PF_SF_CARD__SF_USER FOREIGN KEY (USER_ID)
        REFERENCES SF_USER (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
