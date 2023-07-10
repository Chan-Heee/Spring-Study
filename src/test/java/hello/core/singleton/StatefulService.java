package hello.core.singleton;

public class StatefulService {
    //private int price; (무상태로 유지)
    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
       // this.price  =price; <-문제 지점
        return price;
    }
//    public int getPrice(){
//        return price;
//    }
}
