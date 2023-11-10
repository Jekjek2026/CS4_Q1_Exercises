package storesim;
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    earnings = 0;
    
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index < itemList.size()) {
        this.earnings += itemList.get(index).getCost();
    }
    else {
        System.out.println("There are only " + itemList.size() + " items in the store");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean found = true;
    for (Item i : itemList) {
        if (i.getName().equals(name)) {
            this.earnings += i.getCost();
            found = true;
        }
    }
    if(!found) {
        System.out.println("The store doesn't sell it");
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if (itemList.contains(i)) {
        this.earnings += i.getCost();
        System.out.println("You have sold " + i.getName());
    }
    else {
        System.out.println("The store doesn't sell it");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    this.itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for (Item i : itemList) {
        if(i.getType().equals(type)){
            System.out.println(i.getName() + " " + i.getType());
        }
        
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for (Item i : itemList) {
        if(i.getCost() <= maxCost){
            System.out.println(i.getName());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for (Item i : itemList) {
        if(i.getCost() >= minCost){
            System.out.println(i.getName());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (Store i : storeList) {
        System.out.println(i.getName() + " " + i.getEarnings());
        
    }
  }
}
