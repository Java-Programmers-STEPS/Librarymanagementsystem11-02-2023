package studentjsp;

public class User {
private int id;
private String Studentname,Course,Gender,Address,Email,Password,Confirmpassword;
private int Dateofbirth,Mobile;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentname() {
	return Studentname;
}
public void setStudentname(String studentname) {
	Studentname = studentname;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getConfirmpassword() {
	return Confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	Confirmpassword = confirmpassword;
}
public int getDateofbirth() {
	return Dateofbirth;
}
public void setDateofbirth(int dateofbirth) {
	Dateofbirth = dateofbirth;
}
public int getMobile() {
	return Mobile;
}
public void setMobile(int mobile) {
	Mobile = mobile;
}
}
