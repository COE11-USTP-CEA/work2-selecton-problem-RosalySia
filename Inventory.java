import java.util.List;
import java.util.ArrayList;
class Inventory{
    public static void main(String[]args){
        List<Item> INV = new ArrayList();
        float total = 0.0f;

        System.out.println("Gevero Store");

        Item g1 = new Item("Creamsilk", "Conditioner", 7.00f);

        Item g2 = new Item("Century tuna","Sardines", 20.00f);

        Item g3 = new Item("Pancit Canton","Noodles", 10.00f);

        Item g4 = new Item("Surf","Detergent Bar", 10.00f);

        Item g5 = new Item("Colgate","toothpaste", 10.00f);

        Item g6 = new Item("Silver Swan","Vinegar", 8.00f);

        Item g7 = new Item("Datu puti","Soy sauce", 8.00f);
        
        Item g8 = new Item("Dove","Shampoo", 7.00f);
        
        Item g9 = new Item("HeadNshoulder","Shampoo", 7.00f);

        Item g10 = new Item("Safe Guard","Soap", 10.00f);

        INV.add(g1);
        INV.add(g2);
        INV.add(g3);
        INV.add(g4);
        INV.add(g5);
        INV.add(g6);
        INV.add(g7);
        INV.add(g8);
        INV.add(g9);
        INV.add(g10);

        for(Item x: INV){
            if(x.Getname()=="Safe Guard"){
                System.out.println("Item Found!");
            }
            else{
                System.out.println("Item Not Available");
            }
            total = total + x.Getprice();
            }
            System.out.println(total);
        }
}