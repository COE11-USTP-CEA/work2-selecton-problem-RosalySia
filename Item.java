class Item{
    String name;
    String catname;
    float price;

    public void Setname(String x){
        name = x;
    } 
    public void Setcatname(String y){
        catname = y;
    }
    public void Setprice(float z){
        price = z;
    }
    public String Getname(){
        return name;
    }
    public String Getcatname(){
         return catname;
    }
    public float Getprice(){
        return price;
    }

    public Item(String x, String y, float z){
        name = x;
        catname = y;
        price = z;
    }
}