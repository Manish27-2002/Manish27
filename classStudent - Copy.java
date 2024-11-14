class Student
{
 String name;
 int rollno;
 String className;
 String city;

 Student(String name,int rollno)
 {
  this.name=name;
  this.rollno=rollno;
 }
 Student(String name,int rollno,String className,String city)
 {
this("Manish",12);
  this.name=name;
  this.rollno=rollno;
  this.className=className;
  this.city=city;
 }
  public static void main(String args[])
 {

  Student student1=new Student("manish",12);
  System.out.println(student1.name);
  System.out.println(student1.rollno);

  Student student2=new Student("babu",3556,"welcome","bangloore");
  System.out.println(student2.rollno);
  System.out.println(student2.name);
  System.out.println(student2.city);
  System.out.println(student2.className);
 }
}
  