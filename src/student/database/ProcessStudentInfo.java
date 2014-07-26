package student.database;
import xml.reader.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to write a method which will convert score into Grade in letter('A'for90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.Then print this to the console.
		 * Do any necessary steps that require for below successful output.
		 * .................................................
		 * Student (id= 1) "Marc" "Carp"   Grade= B
		 * Student (id= 2) "Israt" "Khan"   Grade= A
		 * Student (id= 3) "Mohi" "Uddin"   Grade= A
		 * Student (id= 4) "Abrar" "Hossain"   Grade= B
		 * Student (id= 5) "Abida" "Sultana"   Grade= B
		 * .................................................
		 * 
		 * 
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
			
				List <Student> x = new ArrayList<>();
				XmlReader myDB = new XmlReader();
				x = myDB.parseData("id");
				for (Student element: x ){
					int score = Integer.parseInt(element.score);
					String grade;
					switch(score/10){
					case 10:
					case 9: grade = "A"; 
						break;
					case 8: grade = "B";
						break;
					case 7: grade = "C";
						break;
					default : grade = "F";
					}
				
				System.out.printf("Student (id = %s)%s\t%s Grade = %s\n",element.id,element.firstName,element.lastName,grade);
				}
			}

}
