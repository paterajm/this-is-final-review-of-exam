/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam.review.pkgfinal;

/**
 *
 * @author warrior
 */
public class ExamReviewFinal {

    /**
     * @param args the command line arguments
     */
    int age=10;
    int dob=24;
    public ExamReviewFinal(){
    age=21;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
    ExamReviewFinal myObj=new ExamReviewFinal();
    ExamReviewFinal myObj2=new ExamReviewFinal();
    System.out.println(myObj.age);
    System.out.println(myObj2.age);
    System.out.println(myObj.dob);
    System.out.println(myObj2.dob);


    }

    

    
    
}
