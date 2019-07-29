package Student;

import java.io.Serializable;

@SuppressWarnings("serial")
public class student extends Person implements Serializable{
   int studentId;
   int standard;
   String division;
   int mark;
   String Address;
   String street;
   String city;
   String state;
   int zip;
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public String getDivision() {
	return division;
}
public void setDivision(String division) {
	this.division = division;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

public student(String firstName,String lastName,int studentId, int standard, String division, int mark, String Address,String street,String city,String state,int zip) {
	super();
	this.studentId = studentId;
	this.standard = standard;
	this.division = division;
	this.mark = mark;
	this.Address = Address;
	this.street=street;
	this.city=city;
	this.state=state;
	this.zip=zip;
	
}
//public student(String firstName, String lastName, int studentId2, int standard2, String string, int mark2,
//		String address2, String street2, String city2, String state2, int zip2) {
//	// TODO Auto-generated constructor stub
//	super();
//	this.studentId = studentId;
//	this.standard = standard;
//	this.division = division;
//	this.mark = mark;
//	this.Address = Address;
//	this.street=street;
//	this.city=city;
//	this.state=state;
//	this.zip=zip;
//	
//}
@Override
public String toString() {
	return "student [studentId=" + studentId + ", standard=" + standard + ", division=" + division + ", mark=" + mark
			+ ", Address=" + Address + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
			+ "]";
}
}

