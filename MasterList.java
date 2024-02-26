import java.util.ArrayList;

public class MasterList {
    ArrayList<PopcornOrder> orders;
public MasterList(){
    orders = new ArrayList<PopcornOrder>();
}
public void addOrder(PopcornOrder i){
    orders.add(i);
}
public int getTotalOrders(){
    int sum = 0;
    for(int i = 0; i<orders.size();i++){
        sum+=orders.get(i).getNumordered();
     }
        return sum;
    }
    public int removeVariety(String i){
        int removed = 0;
        for(int j = 0; j<orders.size();j++){
            if(i == orders.get(j).getVariety()){
                orders.remove(orders.get(j));
                removed = orders.get(j).getNumordered();
            }
        }
        return removed;
    }
    public String toString(){
        return "Here are all your orders: " + orders + ".";
    }
}

