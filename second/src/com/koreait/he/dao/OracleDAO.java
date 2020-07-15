package com.koreait.he.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {

	public static void main(String[] args) {
		OracleDAO oracle = new OracleDAO();
		Connection con = null;
		try {
			oracle.getConn();
			oracle.closeConn(con);
		}catch(Exception e) {
			System.out.println("d");
		}
	}
	
	
	//싱글톤 패턴
	private static OracleDAO dao = null;
	
	private OracleDAO() {}			//자동으로 생성하는 기본생성자는 public임. private로 하려면 다시 정의해줘야 함.
	
	public static OracleDAO getInstance() {					//static이라 OracleDAO 클래스를 객체화 하지 않아도 호출 가능. 
		if(dao == null) {
			dao = new OracleDAO();							//dao가 null인 상태(처음 상태)면 객체를 생성해서 넣는다.
		}
		return dao;											//호출할때마다 처음 생성된 객체 주소값을 반환.
	}
	
	
	//DB연결
	public Connection getConn() throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("접속성공!");
		
		return con;
	}
	
	public void closeConn(Connection conn) throws Exception{
		if(conn != null) {						//FM 방식
			try {
				conn.close();
			} catch(Exception e) {
				
			}
		}					
		
		//conn.close();								//시험용
	}
}
