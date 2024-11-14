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
 Animal(String name,int age,int foots,double weight)
 {
  this.age=age;
  this.name=name;
  this.foots=foots;
  this.weight=weight;
 }
 public static void main(String args[])
 {
  Animal animal1=new animal("cat",12)
  system.out.println(animal1.age)
  system.out.println(animal1.name)
 }
 public static void main(String args[])
 {
  Animal animal2=new animal("lion",15,4,50.0)
  system.out.println(animal2.name)
  system.out.println(animal2.age)
  system.out.println(animal2.foot)
  system.out.println(animal2.weight)
 }
}
 
