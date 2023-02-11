package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class AdminDao {
public static Connection getConnection() {
	Connection con =null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementsystemfinal","root","");
	}catch(Exception e) {System.out.println(e);}
	
return con;
}
	public static int save(Student u) {
		int status=0;
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into admin(studentname,course,gender,age,mobile,address,email,PASSWORD)values(?,?,?,?,?,?,?,?)");
			ps.setString(1, u.getStudentname());
			ps.setString(2,u.getCourse());
			ps.setString(3,u.getGender());
			ps.setInt(4, u.getAge());
			ps.setInt(5, u.getMobile());
			ps.setString(6,u.getAddress());
			ps.setString(7, u.getEmail());
			ps.setString(8, u.getPASSWORD());
			status=ps.executeUpdate();
		}
		catch(Exception e) {System.out.println(e);}
		return status;
	}
	public static int update(Student u) {
		int status=0;
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("Update admin set studentname=?,course=?,gender=?,age=?,mobile=?,address=?,email=?,PASSWORD=? where studentid=?");
			ps.setString(1, u.getStudentname());
			ps.setString(2,u.getCourse());
			ps.setString(3,u.getGender());
			ps.setInt(4, u.getAge());
			ps.setInt(5, u.getMobile());
			ps.setString(6,u.getAddress());
			ps.setString(7, u.getEmail());
			ps.setString(8, u.getPASSWORD());
			status=ps.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		return status;
	}
	public static List<Student>getAllrecords(){
		List<Student>list=new ArrayList<Student>();
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select*from admin");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student u=new Student();
				u.setId(rs.getInt("id"));
				u.setStudentname(rs.getString("studentname"));
				u.setCourse(rs.getString("course"));
				u.setGender(rs.getString("gender"));
				u.setAge(rs.getInt("age"));
				u.setMobile(rs.getInt("mobile"));
				u.setAddress(rs.getString("address"));
				u.setEmail(rs.getString("email"));
				u.setPASSWORD(rs.getString("PASSWORD"));
				list.add(u);
			}
		}catch(Exception e) {System.out.println(e);}
		return list;
			}
	public static Student getRecordById(int id) {
		Student u =null;
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from admin where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				u=new Student();
				u.setId(rs.getInt("id"));
				u.setStudentname(rs.getString("studentname"));
				u.setCourse(rs.getString("course"));
				u.setGender(rs.getString("gender"));
				u.setAge(rs.getInt("age"));
				u.setMobile(rs.getInt("mobile"));
				u.setAddress(rs.getString("address"));
				u.setEmail(rs.getString("email"));
				u.setPASSWORD(rs.getString("PASSWORD"));
				
			}
			
		}catch(Exception e) {System.out.println(e);}
		return u;
	}
	
}


