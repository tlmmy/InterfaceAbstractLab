/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author l152student
 */
public class StartUp {
        public static void main(String[] args) {
        /*
        I believe that an interface is not the ideal way to create this program.
        Although there is no risk of inhereting code that is not needed, because most of 
        the code is reused anyway it seemed to be redundant.
        */    
            
        /*
        I chose to use the Liskov Substitution principle for this program.  By
        making them all a Course, you can group them together.  Depending on the different 
        needs of the program you may not want to use this.  If you wanted to group all
        of one type of class this would not be a good way to declare them.
        */
        ProgrammingCourse advanced = new AdvancedJavaCourse("Advanced Java", "1");
        System.out.println(advanced.getCourseName() + " " + advanced.getCourseNumber());
        
        ProgrammingCourse introJava = new IntroJavaCourse("Intro to Java", "2");
        System.out.println(introJava.getCourseName() + " " + introJava.getCourseNumber());
        
        ProgrammingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming", "3");
        System.out.println(introProgramming.getCourseName() + " " + introProgramming.getCourseNumber());
    }
}
