class Hello {
    public static void main(String a[]) {
        System.out.print("Hello World");
        byte b = 10;
        int c = 138;
        System.out.println("Byte value: " + b);
        System.out.println("Int value: " + c);
        b = (byte)c; // type casting
        System.out.println("Byte value after type casting: " + b);
        
        float f = 10.5f; // forFloat we need to explicitly mention f or F
        double d = 6.9; // default type is double
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);

        //very large double value
        double largeDouble = 1.7e+308; // scientific notation, this value is 17 followed by 307 zeros
        System.out.println("Large double value: " + largeDouble);

        f = (float)d; // type casting
        System.out.println("Float value after type casting: " + f);

        int num1 = 10;
        float num2 = 5.5f;
        num1 = (int)num2; // type casting
        System.out.println("Int value after type casting: " + num1);

        char ch = 'A';
        System.out.println("Char value: " + ch);

        //Binary literals
        int binaryValue = 0b1010; // binary literal
        System.out.println("Binary value: " + binaryValue);
        //Hexadecimal literals
        int hexValue = 0x1A; // hexadecimal literal
        System.out.println("Hexadecimal value: " + hexValue);

        int nums1 = 10_00_00_000;
        System.out.println("Value with underscores: " + nums1);
    }
}
