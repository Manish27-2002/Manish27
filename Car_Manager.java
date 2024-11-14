class Cars{
String name;
String color;
int engineCapacity;
int noOfTyres;
double fuelCapacity;
int noOfSeets;
double speed;
int weight;
double getCarMilage(){
return (speed/fuelCapacity);
}
}
class Car_Manager{
public static void main(String args[]){
Cars c1=new Cars();
c1.name="lambogine";
c1.color="black";
c1.noOfTyres=4;
c1.noOfSeets=2;
c1.weight=2000;
c1.engineCapacity=300;
c1.speed=50.0;
c1.fuelCapacity=100.0;
double CarMilage=c1.getCarMilage();
System.out.println("name:"+car.name);
System.out.println("color:"+c1.color);
System.out.println("noOfTyres:"+c1.noOfTyres);
System.out.println("noOfSeets:"+c1.noOfSeets);
System.out.println("weight:"+c1.weight);
System.out.println("engineCapacity:"+c1.engineCapacity);
System.out.println("speed:"+c1.speed);
System.out.println("carMilage:"+CarMilage);
}
}