//Creating a class Menu which consists items and its price//
class Menu{
    //Declaring the instance varibales
    private String item;     
    private int price;
    private String category;
    //Creating empty constructor which initializes the numerical value to 0 and strings to null
    public Menu(){
        item=null;
        price=0;
        category=null;
    }
    //Creating a constructor which directly sets the item and its price
    public Menu(String item,int price,String category){
        this.item=item;
        this.price=price;
        this.category=category;
    }

    //Making setter and getters for the instance variables
    public void addItem(String item){
        this.item=item;
    }
    public String getItem(){
        return item;
    }
    public int getPrice(){
        return price;
    }
    public void addPrice(int price){
        this.price=price;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }


}