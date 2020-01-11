package codein;
class Vehicle
{

    public void move()
    {

    System.out.println("Vehicle- general term");

    }

}

class MotorBike extends Vehicle{

    public void move(){

    System.out.println("MotorBike- being specific with vehicles");

    }

}

public class Test2{

    public static void main(String[] args){

    Vehicle vh=new MotorBike();

    vh.move();    

    vh=new Vehicle();

    vh.move();    

    }

}