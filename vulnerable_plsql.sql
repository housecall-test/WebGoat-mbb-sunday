
CREATE OR REPLACE PROCEDURE vulnerable_procedure (param IN VARCHAR2) AS
    TYPE ref_cursor IS REF CURSOR;
    cursor ref_cursor;
    query VARCHAR2(200);
BEGIN
    query := 'SELECT * FROM users WHERE username = ''' || param || '''';
    OPEN cursor FOR query;
    -- Process the cursor
    CLOSE cursor;
END vulnerable_procedure;
