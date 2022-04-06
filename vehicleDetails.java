class vehicle{
    int v_id;
    String v_name,v_model;
    double price;

    vehicle(){
        v_id=90;
        v_name="Mahindra";
        v_model="XUV";
        price=89999;
    }
    vehicle(int id, String name, String model, double p){
        v_id=id;
        v_name=name;
        v_model=model;
        price=p;
    }

    void display(){
        System.out.println("vehicle id is "+v_id);
        System.out.println("vehicle name is "+v_name);
        System.out.println("vehicle model is "+v_model);
        System.out.println("vehicle price is "+price);

    }
}

public class vehicleDetails{
    public static void main(String[] args){

        vehicle [] obj=new vehicle[4];
        obj[0]=new vehicle(12,"asd","ghb",455);
        obj[1]=new vehicle(14,"new","hhh",900);
        obj[2]=new vehicle(15,"wes","www",800);
        obj[3]=new vehicle();
        obj[0].display();
        obj[1].display();
        obj[2].display();
        obj[3].display();
        
    }
}