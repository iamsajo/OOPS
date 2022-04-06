class product{
    int p_id;
    String p_name;
    double price;
    void details(){
        System.out.println("product id is "+p_id);
        System.out.println("product name is "+p_name);
        System.out.println("product price "+price);
    }
}

public class product_details{
    public static void main(String[] args) {
        product p1=new product();
        p1.p_id=123;
        p1.p_name="milk";
        p1.price=120;
        p1.details();

        product p2=new product();
        p2.p_id=234;
        p2.p_name="bread";
        p2.price=90;
        p2.details();

        product p3=new product();
        p3.p_id=233;
        p3.p_name="jam";
        p3.price=80;
        p3.details();

        if(p1.price<p2.price && p1.price<p3.price){
            System.out.println("product 1 is lesser cost");
        }
        else if(p2.price<p3.price){
            System.out.println("product 2 is lesser cost");
        }
        else{
            System.out.println("product 3 is lesser cost");
        }




        
    }
}