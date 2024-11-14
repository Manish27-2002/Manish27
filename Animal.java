class Animal
{
 String name;
 int legs;
 int age;
 double weight;
 
 Animal(String name,int age)
 {
  this.age=age;
  this.name=name;
 }
 Animal(String name,int age,int legs,double weight)
 {
  this.age=age;
  this.name=name;
  this.legs=legs;
  this.weight=weight;
 }
 public static void main(String args[])
 {
  Animal animal1=new Animal("cat",12);
  System.out.println(animal1.age);
  System.out.println(animal1.name);
 
 
  Animal animal2=new Animal("lion",15,4,50.0);
  System.out.println(animal2.name);
  System.out.println(animal2.age);
  System.out.println(animal2.legs);
  System.out.println(animal2.weight);
 }
}
 
