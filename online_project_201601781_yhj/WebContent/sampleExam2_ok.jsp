<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
request.setCharacterEncoding("euc-kr");

int total = 0;

String dap1=request.getParameter("dap1");
String bogi1=request.getParameter("bogi1");
String dap2=request.getParameter("dap2");
String bogi2=request.getParameter("bogi2");
String dap3=request.getParameter("dap3");
String bogi3=request.getParameter("bogi3");
String dap4=request.getParameter("dap4");
String bogi4=request.getParameter("bogi4");
String dap5=request.getParameter("dap5");
String bogi5=request.getParameter("bogi5");

if(dap1.equals(bogi1)){	
	total+=1;
}
if(dap2.equals(bogi2)){
	total+=1;
}
if(dap3.equals(bogi3)){
	total+=1;
}
if(dap4.equals(bogi4)){
	total+=1;
}
if(dap5.equals(bogi5)){
	total+=1;
}
%>

<b>������ <%=total %>�Դϴ�.</b><br><br>
<%
out.print(1+"<br>");
out.print("��   :" + dap1);
out.print("����:" + bogi1);
out.print(2+"<br>");
out.print("��   :" + dap2);
out.print("����:" +bogi2);
out.print(3+"<br>");
out.print("��   :" + dap3);
out.print("����:" +bogi3);
out.print(4+"<br>");
out.print("��   :" + dap4);
out.print("����:" +bogi4);
out.print(5+"<br>");
out.print("��   :" + dap5);
out.print("����:" +bogi5);

%>


</body>
</html>