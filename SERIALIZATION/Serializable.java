package Student;
import java.io.*;
import java.sql.Statement;
public class Serializable {

		String pathName = "C:\\Users\\sravya.meenakshi\\Documents\\sravya.txt";

		public static void printdata(student s) {
			System.out.println(s);
		}

		public void writObjectToFile(student s) {
			try {
		FileOutputStream fos = new FileOutputStream(pathName);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(s);
		out.close();
		out.flush();
		fos.close();
		System.out.println("Object has been successfully SERIALIZED\n" + "Data before Deserialization:");
		printdata(s);
			}catch (IOException ex) {
		System.out.println("IOException is caught");
	}
}

public student readObjectFromFile() {
	student s = null;
	try {
		FileInputStream fis = new FileInputStream(pathName);
		ObjectInputStream in = new ObjectInputStream(fis);
		s = (student) in.readObject();
		in.close();
		fis.close();
		System.out.println("Object has been successfully DESERIZLIZED\n" + "Data after Deserialization:");
		printdata(s);
	} catch (IOException ex) {
		System.out.println("IOException is caught");
	} catch (ClassNotFoundException ex) {
		System.out.println("ClassNotFoundException" + " is caught");
	}
	return s;
}

		
//				public static void printdata(Student stu) {
//					System.out.println(stu);
//				}
//
//				public void writObjectToFile(Student s) {
//					try {
//
//						FileOutputStream fos = new FileOutputStream(pathName);
//						ObjectOutputStream out = new ObjectOutputStream(fos);
//						out.writeObject(s);
//						out.close();
//						out.flush();
//						fos.close();
//						System.out.println("Object has been successfully SERIALIZED\n" + "Data before Deserialization:");
//						printdata(s);
//					} catch (IOException ex) {
//						System.out.println("IOException is caught");
//					}
//				}
//
//				public student readObjectFromFile() {
//					student s = null;
//					try {
//						FileInputStream fis = new FileInputStream(pathName);
//						ObjectInputStream in = new ObjectInputStream(fis);
//						s = (student) in.readObject();
//						in.close();
//						fis.close();
//						System.out.println("Object has been successfully DESERIZLIZED\n" + "Data after Deserialization:");
//						printdata(s);
//					} catch (IOException ex) {
//						System.out.println("IOException is caught");
//					} catch (ClassNotFoundException ex) {
//						System.out.println("ClassNotFoundException" + " is caught");
//					}
//					return s;
//				}

				public static void main(String[] args) {
					
					student s=new student("sravya","Meenakshi",6061,16,"A",550,"30-9-7","Namboori vari street","vijayawada","andhra pradesh" , 520002);
					Serializable ss=new Serializable();
					ss.writObjectToFile(s);
					ss.readObjectFromFile();
					student s1=new student("swetha","kavya",6146,16,"B",549,"30-8-9","Namboori vari street","vijayawada","andhra pradesh" , 520002);
					ss.writObjectToFile(s1);
					ss.readObjectFromFile();
					
				}

		}




