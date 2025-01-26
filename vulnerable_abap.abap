
DATA: lv_sql_query TYPE string,
      lv_param TYPE string.

lv_param = 'user_input'. " Assume user_input is the input from the user
CONCATENATE 'SELECT * FROM users WHERE username = ''' lv_param '''' INTO lv_sql_query.

EXEC SQL.
    EXECUTE IMMEDIATE :lv_sql_query
ENDEXEC.
