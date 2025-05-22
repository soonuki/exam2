package practice01.run;


import practice01.model.vo.Book;
import practice01.model.vo.Food;
import practice01.model.vo.Product;

public class ProductRun {
  public static void main(String[] args){
    Product p1 = new Food("치킨",20000,3);
    Product p2 = new Book("자바의 정석",15000);
    int foodPrice = p1.calculatePrice();
    int bookPrice = p2.calculatePrice();

    System.out.println(p1.getName()+"의 최종가격 : "+foodPrice);
    System.out.println(p2.getName()+"의 최종가격 : "+bookPrice);
  }
}
