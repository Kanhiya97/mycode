package classComponents.variables;

public class Product {
    //what, why, where they are stored, when they get the memory
    // when the get deleted
        // instance variables will be deleted when object is deleted
        // static variables will be deleted when class is unloaded
        // local variables will be deleted when method execution is complete
    // how many times they get the memory?
        // IV will get the memory every time object is created
        // SV will get the memory only once at the time of class loading
        // LV will get the memory every time method/block/constructor is called.
    int productId;//instance variable will get the memory at the time object creation
    String productName;//IV
    int productQuantity;//IV
    int productPrice;//IV
    static String companyName = "Parle";//static variables will get the memory at the time class loading

    public static void main(String[] args) {
        int temp = 100;//local variables will get the memory every time method is called

    }
}
