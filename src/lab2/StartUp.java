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
        Course advanced = new AdvancedJavaCourse("Advanced Java", "1");
        System.out.println(advanced.getCourseName() + " " + advanced.getCourseNumber());
        
        Course introJava = new IntroJavaCourse("Intro to Java", "2");
        System.out.println(introJava.getCourseName() + " " + introJava.getCourseNumber());
        
        Course introProgramming = new IntroToProgrammingCourse("Intro to Programming", "3");
        System.out.println(introProgramming.getCourseName() + " " + introProgramming.getCourseNumber());
    }
}
