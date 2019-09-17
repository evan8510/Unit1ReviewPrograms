package Lesson3;


public class VariablesReview {

    public static void main(String[] args) {
        //primitive data types -> can only store data
        //whole numbers
        byte b = 127; //1 byte of memory max value is 127
        short c = 12345; //2 bytes
        int a = 1234567890; //4 bytes
        long d = 1234567890123456789L; //8 bytes
        
        //decimal
        float flt = 45.78F; // 4 bytes
        double dbl = 45.78; // 8 bytes
        
        //2 more primitive data types
        boolean bool = false;
        char lett = 'c';
        
        //Strings are NOT primitive
        //String have abilities (methods) / things they can do
        String s = "I went to school today";
        // s. -> brings up the list of methods for a String
        //3 Things to Know About Methods
        //a) ALL methods have a return type (even void, which returns nothing)
        //b) Methods may or may not require parameters (data to be sent in)
        //c) Some methods have more than 1 way to use them: pen.move(x) pen.move(x, y)
        
        int len = s.length();
            System.out.println("The length is " + len);
            
        char l = s.charAt(7); //'t'
        String str1 = s.substring(0,4); // 0,1,2,3, -> I wen
        String str2 = s.substring(5); //7 to the end: to school today
        System.out.println("First 4 are: " + str1);
        System.out.println("From 7 to the end is " + str2);
        System.out.println("The length is " + s.length());
        
        //escape codes: \n new line \t tab \\, \" -> to print a " or \
        System.out.println("I went\nto school\n\ntoday");
        System.out.println("I went\tto school\t\t today");
        String msg = "She was like \"No way!\" She didn't want to go.";
        String path = "C:\\Downloads\\Temp";
        System.out.println(msg);
        System.out.println(path);
    }
    
}
