ALTER TABLE USERCONFIG ALTER COLUMN USERID SET NOT NULL;
ALTER TABLE USERCONFIG ALTER COLUMN PARAM SET NOT NULL;
ALTER TABLE USERCONFIG ADD PRIMARY KEY (USERID , PARAM);

UPDATE VK_PREISE SET ID = SUBSTR(RANDOM_UUID(), 1, 25);
ALTER TABLE VK_PREISE ALTER ID SET NOT NULL;
ALTER TABLE VK_PREISE ADD PRIMARY KEY (ID);