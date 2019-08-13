SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID IN 
( SELECT DEPARTMENT_ID FROM EMPLOYEES 
  GROUP BY DEPARTMENT_ID 
  HAVING MAX(SALARY)>10000)
