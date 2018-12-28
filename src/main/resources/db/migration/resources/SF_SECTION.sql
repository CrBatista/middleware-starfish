CREATE TABLE SF_SECTION (
  ID INT IDENTITY,
  NAME VARCHAR(255) NOT NULL,
  CONSTRAINT PK_SF_SECTION PRIMARY KEY (ID)
);

INSERT INTO SF_SECTION (ID, NAME) VALUES
  (0, "Keep Doing"),
  (1, "Start Doing"),
  (2, "Stop doing"),
  (3, "More of"),
  (4, "Less of");

