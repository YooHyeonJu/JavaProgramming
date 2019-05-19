<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*"%>
<%@ page import="javax.naming.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%!
// 문제를 랜덤하게 보여주기 위한 함수
int[] QuizRandom(int e1, int e2, int e3, int e4, int e5) {
	int[] result = new int[5];
	int[] temp = new int[]{e1,e2,e3,e4,e5};
	Random r = new Random();
	
	int len = 5;
	for(int i = 0;i<5;i++){
		int d = r.nextInt(len);
		result[i] = temp[d];
		temp[d] = temp[len-1];
		len -=1;
	}
	return result;
}%>
<%!
 // 보기를 랜덤하게 보여주기 위한 함수
String[] STRRandom(String e1, String e2, String e3, String e4) {
	String[] result = new String[4];
	String[] temp = new String[]{e1,e2,e3,e4};
	Random r = new Random();
	
	int len = 4;
	for(int i = 0;i<4;i++){
		int d = r.nextInt(len);
		result[i] = temp[d];
		temp[d] = temp[len-1];
		len -=1;
	}
	return result;
}
 %>
<%
	request.setCharacterEncoding("euc-kr");
	
	String id=null;
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs1=null;
	ResultSet rs2=null;
	ResultSet rs3=null;
	ResultSet rs4=null;
	ResultSet rs5=null;
	
	
	String driver="oracle.jdbc.driver.OracleDriver";  
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	
	
	int[] q_num = QuizRandom(1,2,3,4,5);

	// 정상적으로 로그인 하고 들어오면 이곳 수행
	try {
		Class.forName(driver);  
		conn=DriverManager.getConnection(url,"yhj781","hj0503");
		pstmt=conn.prepareStatement("SELECT * FROM sihyeomMunje where munje_num=?");
		pstmt.setInt(1,q_num[0]);
		rs1=pstmt.executeQuery();
			
		pstmt=conn.prepareStatement("SELECT * FROM sihyeomMunje where munje_num=?");
		pstmt.setInt(1,q_num[1]);
		rs2=pstmt.executeQuery();
		
		pstmt=conn.prepareStatement("SELECT * FROM sihyeomMunje where munje_num=?");
		pstmt.setInt(1,q_num[2]);
		rs3=pstmt.executeQuery();
		
		pstmt=conn.prepareStatement("SELECT * FROM sihyeomMunje where munje_num=?");
		pstmt.setInt(1,q_num[3]);
		rs4=pstmt.executeQuery();
		
		pstmt=conn.prepareStatement("SELECT * FROM sihyeomMunje where munje_num=?");
		pstmt.setInt(1,q_num[4]);
		rs5=pstmt.executeQuery();
		
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<body>

<form name="quiz" action="sampleExam2_ok.jsp" method="post">

<% 

int idx = 1;
rs1.next(); %>
	<b>문제<%=rs1.getString("munje_num")%></b> 
	<%=rs1.getString("munje")%> <br>
	<%String[] show = STRRandom(rs1.getString("BOGI1"),rs1.getString("BOGI2"),rs1.getString("BOGI3"),rs1.getString("BOGI4")); %>
	<input type="radio" name="bogi1" value="<%=show[0]%>"> <%=show[0]%>
	<input type="radio" name="bogi1" value="<%=show[1]%>"> <%=show[1]%>
	<input type="radio" name="bogi1" value="<%=show[2]%>"> <%=show[2]%>
	<input type="radio" name="bogi1" value="<%=show[3]%>"> <%=show[3]%>
	<input type="hidden" name="dap1" value="<%=rs1.getString("DAP")%>" ><br>
<%rs2.next();  %> 	
	<b>문제<%=rs2.getInt("munje_num")%></b> <%=rs2.getString("munje")%> <br>
	<%show = STRRandom(rs2.getString("BOGI1"),rs2.getString("BOGI2"),rs2.getString("BOGI3"),rs2.getString("BOGI4")); %>
	<input type="radio" name="bogi2" value="<%=show[0]%>"> <%=show[0]%>
	<input type="radio" name="bogi2" value="<%=show[1]%>"> <%=show[1]%>
	<input type="radio" name="bogi2" value="<%=show[2]%>"> <%=show[2]%>
	<input type="radio" name="bogi2" value="<%=show[3]%>"> <%=show[3]%>
	<input type="hidden" name="dap2" value="<%=rs2.getString("DAP")%>" ><br>
<%rs3.next();  %>
	<b>문제<%=rs3.getInt("munje_num") %></b> <%=rs3.getString("munje")%> <br>
	<%show = STRRandom(rs3.getString("BOGI1"),rs3.getString("BOGI2"),rs3.getString("BOGI3"),rs3.getString("BOGI4")); %>
	<input type="radio" name="bogi3" value="<%=show[0]%>"> <%=show[0]%>
	<input type="radio" name="bogi3" value="<%=show[1]%>"> <%=show[1]%>
	<input type="radio" name="bogi3" value="<%=show[2]%>"> <%=show[2]%>
	<input type="radio" name="bogi3" value="<%=show[3]%>"> <%=show[3]%>
	<input type="hidden" name="dap3" value="<%=rs3.getString("DAP")%>" ><br>
<%rs4.next();  %>
	<b>문제<%=rs4.getInt("munje_num") %></b> <%=rs4.getString("munje")%> <br>
	<%show = STRRandom(rs4.getString("BOGI1"),rs4.getString("BOGI2"),rs4.getString("BOGI3"),rs4.getString("BOGI4")); %>
	<input type="radio" name="bogi4" value="<%=show[0]%>"> <%=show[0]%>
	<input type="radio" name="bogi4" value="<%=show[1]%>"> <%=show[1]%>
	<input type="radio" name="bogi4" value="<%=show[2]%>"> <%=show[2]%>
	<input type="radio" name="bogi4" value="<%=show[3]%>"> <%=show[3]%>
	<input type="hidden" name="dap4" value="<%=rs4.getString("DAP")%>" ><br>
<%rs5.next();  %>	
	<b>문제<%=rs5.getInt("munje_num") %></b> <%=rs5.getString("munje")%> <br>
	<%show = STRRandom(rs5.getString("BOGI1"),rs5.getString("BOGI2"),rs5.getString("BOGI3"),rs5.getString("BOGI4")); %>
	<input type="radio" name="bogi5" value="<%=show[0]%>"> <%=show[0]%>
	<input type="radio" name="bogi5" value="<%=show[1]%>"> <%=show[1]%>
	<input type="radio" name="bogi5" value="<%=show[2]%>"> <%=show[2]%>
	<input type="radio" name="bogi5" value="<%=show[3]%>"> <%=show[3]%>
	<input type="hidden" name="dap5" value="<%=rs5.getString("DAP")%>" ><br>


<input type="submit" value="채점 후 제출하기">
</form>
</body>
</html>