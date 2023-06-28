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
    private int dob=24;
	private int age = 21;
	private String fName;
	private String lName;
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
    myObj.setfName("Raj");
    myObj2.setfName("Shrish");
    myObj.setLName("Patel");
myObj2.setLName("Patel");
System.out.println("First Name: "+myObj.getfName());
System.out.println("Last Name: "+myObj.getLName());
System.out.println("First Name: "+myObj2.getfName());
System.out.println("Last Name: "+myObj2.getLName());
myObj.setLName("Patel");
myObj2.setLName("Patel");

    }

	public String getfName() {
		return this.fName;
	}

	
	public void setfName(String name) {
		this.fName = name;
	}

	public String getLName() {
		return this.lName;
	}

	/**
	 * 
	 * @param lName
	 */
	public void setLName(String lName) {
		this.lName = lName;
	}

    

    
    
}
