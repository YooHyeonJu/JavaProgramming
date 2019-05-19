
Drop table QUIZ_Test; 

Create Table QUIZ_Test
(
  Q_NUM int  primary key,
  Q_QUESTION varchar2(200) ,  -- ����
  Q_EX1 varchar2(20) ,             --  ����
  Q_EX2 varchar2(20) ,             --  ����
  Q_EX3 varchar2(20) ,            --  ����
  Q_EX4 varchar2(20) ,            --  ����
  Q_ANSWER varchar2(20)      --  ����
 );
 
-- select * from QUIZ_Test  

 
 Insert  into Quiz_Test(Q_NUM, Q_QUESTION,  Q_EX1, Q_EX2, Q_EX3, Q_EX4, Q_ANSWER) Values(1, '1+1= �����ΰ�  ?',  '1', '2', '3', '4', '2');

 Insert  into Quiz_Test(Q_NUM, Q_QUESTION,  Q_EX1, Q_EX2, Q_EX3, Q_EX4, Q_ANSWER) Values(2, '1+2= �����ΰ�  ?',  '3', '4', '5', '6', '3');

 Insert  into Quiz_Test(Q_NUM, Q_QUESTION,  Q_EX1, Q_EX2, Q_EX3, Q_EX4, Q_ANSWER) Values(3, '1+3= �����ΰ�  ?',  '3', '4', '5', '6', '4');

 Insert  into Quiz_Test(Q_NUM, Q_QUESTION,  Q_EX1, Q_EX2, Q_EX3, Q_EX4, Q_ANSWER) Values(4, '1+4= �����ΰ�  ?',  '3', '4', '5', '6', '5');

 
Create Table sihyeomMunje
(
  munje_num int  primary key,
  munje varchar2(200) ,  -- ����
  munje_type varchar2(5) ,   
     -- TT (���� T ���� T ) , TI (���� T ���� I )  , IT (���� I ���� T )
  munje_image varchar2(50) , 
  bogi1 varchar2(100) ,   --  ���� 1
  bogi2 varchar2(100) ,    --  ���� 2
  bogi3 varchar2(100) ,   --  ���� 3
  bogi4 varchar2(100) ,   --  ���� 4
  dap varchar2(100)    --  ����
   ); 
-- select * from sihyeomMunje  
Insert  into sihyeomMunje(munje_num, munje, munje_type, bogi1, bogi2, bogi3, bogi4, dap) Values
(1, '다음 중 1 + 1은   ?', 'TT', '일<br>', '이<br>', '삼<br>','사<br>','이<br>');
Insert  into sihyeomMunje(munje_num, munje, munje_type, bogi1, bogi2, bogi3, bogi4, dap) Values
(2, '다음 중 1 + 2은   ?', 'TT', '일<br>', '이<br>', '삼<br>','사<br>','삼<br>');
Insert  into sihyeomMunje(munje_num, munje, munje_type, bogi1, bogi2, bogi3, bogi4, dap) Values
(3, '다음 중 1 + 3은 ?', 'TT', '일<br>', '이<br>', '삼<br>','사<br>','사<br>');
Insert  into sihyeomMunje(munje_num, munje, munje_type, bogi1, bogi2, bogi3, bogi4, dap) Values
(4, '다음 중 1 + 4은 ?', 'TT', '삼<br>', '사<br>', '오<br>','육<br>','오<br>');
Insert  into sihyeomMunje(munje_num, munje, munje_type, bogi1, bogi2, bogi3, bogi4, dap) Values
(5, '다음 중 1 + 5은 ?', 'TT', '삼<br>', '사<br>', '오<br>','육<br>','육<br>');

select * from SIHYEOMMUNJE
