class DataType {
    public static void main(String[] args) {
       //whole
        //byte
        byte b = 127;
        System.out.println("Byte data "+b);
        
        //short
        short  s = 32767;
        System.out.println("Short data "+s);
        
        //int
        int  i = 2147483647;
        System.out.println("int data "+i);

        //long
        long  longValue = 2147483648L;
        System.out.println("Long data "+longValue);

    // decimal
        //float
        float  floatValue = 123.56F;
        System.out.println("Float data "+floatValue);
        
        //double
        double  doubleValue = 123.56D;
        System.out.println("Double data "+doubleValue);

    // character data
        //char

        char ch = 'A';
        System.out.println("character data "+ch);
    //true , false
        //boolean
        boolean booleanValue = true;
        System.out.println("boolean data "+booleanValue);
    }

    // byte : 1 byte
    //short : 2 bytes
    //int : 4 bytes
    //long : 8 bytes
    //float: 4 bytes
    //double : 8 bytes
    // char : 2 bytes
    // boolean : 1 byte
    String str = "java fullstack developer"; //48 bytes

}