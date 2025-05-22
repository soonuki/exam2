package practice01.model.vo;

public class Food extends Product{

  private int expirationDays;

  public Food(String name, int price, int expirationDays){
    super(name,price);
    this.expirationDays = expirationDays;
  }
  public int calculateDiscountRate(){
    int day = expirationDays;
    int result = 0;
    if(day <= 1){
      result = 80;
    }else if(day <= 5){
      result = 50;
    }else if (day <= 10){
      result = 20;
    }
    return result;
  }
  @Override
  public int calculatePrice(){
    int origin = super.getPrice();
    int calcRate = calculateDiscountRate();
    int now = origin - (origin*calcRate/100);
    return now;
  }

  public int getExpirationDays(){
    return expirationDays;
  }
}
