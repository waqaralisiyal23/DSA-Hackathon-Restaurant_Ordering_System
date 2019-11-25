import java.util.List;       //importing the list interface
import java.util.ArrayList;   //importing the ArrayList class
import java.util.Queue;         //importing the queue interface
import java.util.LinkedList;   //importing the LinkedList class
import java.util.Iterator;        //importing the Iterator class
import java.util.Scanner;    //importing Scanner class for user input
//Creating a main class
public class Project{
    //Main method
    public static void main(String[]args)
    {
        System.out.println("********Welcome to Chatpata Restaurant********");  //Printing the restaurant name
        int price = 0;    //stores the price
        while(true){ 
            //Adding the items in the menu
            Menu item1 = new Menu("ZingerBurger",180,"Fast Food");
            Menu item2 = new Menu("ChickenRoll",100,"Fast Food");
            Menu item3 = new Menu("Water",40,"Desserts");
            Menu item4 = new Menu("ColdDrink",50,"Desserts");
            Menu item5 = new Menu("Coffee",40,"Desserts");
            Menu item6 = new Menu("Shakes",60,"Desserts");
            Menu item7 = new Menu("Juices",80,"Desserts");
            Menu item8 = new Menu("MixedSalad",20,"Salad");
            Menu item9 = new Menu("GrilledChickenSalad",20,"Salad"); 

            //Creating a list of categories by using List interface and implementing by ArrayList
            List<String> list = new ArrayList<>();
            //Adding the categories in the list
            list.add("Fast Food");
            list.add("Desserts");
            list.add("Salad");
            list.add("Exit");
    
            System.out.println("Categories");   //just printing categories

            int i=1;    //Counting for categories
            Iterator iter = list.iterator();    //Using the iterator class for accessing the categories
            while(iter.hasNext()){         //If the next category is present in the list it will go inside loop
                System.out.println(i+") "+iter.next());    //prints the category 
                i++;      //incrementing i
            }

            Scanner sc = new Scanner(System.in);  //Crreating the object of Scanner class for taking the user input
            System.out.print("Select Category: ");    
            int catSelection = sc.nextInt();    //stores the inserted value
            
            Queue<Menu> queue = new LinkedList<Menu>();   //Creating a queue which contains objects of Menu class
            //Adding the objects in Queue
            queue.add(item1);
            queue.add(item2);
            queue.add(item3);
            queue.add(item4);
            queue.add(item5);
            queue.add(item6);
            queue.add(item7);
            queue.add(item8);
            queue.add(item9);

            
            if(catSelection==1){
                Iterator iter1 = queue.iterator();    //Using the iterator class for accessing the items
                while(iter1.hasNext()){         //If the next item is present in the queue it will go inside loop
                    Menu m = (Menu)iter1.next();    //Retrieving the object in m
                    if(m.getCategory().equals(list.get(catSelection-1)))
                        System.out.println("-"+m.getItem()+"\t\tRs: "+m.getPrice());    //prints the item 
                }    
            }
            else if(catSelection==2){
                Iterator iter1 = queue.iterator();    //Using the iterator class for accessing the items
                while(iter1.hasNext()){         //If the next item is present in the queue it will go inside loop
                    Menu m = (Menu)iter1.next();    //Retrieving the object in m
                    if(m.getCategory().equals(list.get(catSelection-1)))
                        System.out.println("-"+m.getItem()+"\t\tRs: "+m.getPrice());    //prints the item 
                }    
            }
            else if(catSelection==3){
                Iterator iter1 = queue.iterator();    //Using the iterator class for accessing the items
                while(iter1.hasNext()){         //If the next item is present in the queue it will go inside loop
                    Menu m = (Menu)iter1.next();    //Retrieving the object in m
                    if(m.getCategory().equals(list.get(catSelection-1)))
                        System.out.println("-"+m.getItem()+"\t\tRs: "+m.getPrice());    //prints the item 
                }    
            }
            else if(catSelection==4){
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }

            System.out.print("Select item name: ");    //Taking the input of item name
            String itName = sc.next();      //stores the item name in itName
            Iterator<Menu> it = queue.iterator();      //using Iterator class to access elements
            while(it.hasNext()){       //if the next Item is present loop will run
                Menu m = (Menu)it.next();      //stores the object in m
                if(m.getItem().equalsIgnoreCase(itName)){      //Checking the item name
                    System.out.println(m.getItem()+" is your order.");     //printing the order
                    price+=m.getPrice();      //adding the price
                }    
            }

            System.out.println("Total Price: "+price);     //printing the total price
        }
        System.out.println("********Thank You********");    //printing thankyu
    }
}