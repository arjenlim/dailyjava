package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello\nWei Zhin");

//        int a = 0, b = 0, c = 0;
//        Scanner input = new Scanner(System.in);
//        a = input.nextInt();
//        b = input.nextInt();
//        c = a + b;
//        input.close();
//        System.out.println(c);

//        int result = 50 / 3;
//        System.out.println(result);

//        int result1 = -5 + (8*6);
//        int result2 = (55+9) % 9;
//        int result3 = 20 + -3*5 / 8;
//        int result4 = 5 + 15 / 3 * 2 - 8 % 3;
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);

//        int a = 0, b = 0, c = 0;
//        Scanner input = new Scanner(System.in);
//        a = input.nextInt();
//        b = input.nextInt();
//        c = a * b;
//        input.close();
//        System.out.println(c);

//        int a = 2;
//        int b = 5;
//        int c = a;
//        a = b;
//        b = c;
//        System.out.printf("%d %d",a ,b);

//        int a = 0, b = 0, c = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("First number");
//        a = input.nextInt();
//        System.out.println("Second number");
//        b = input.nextInt();
//        c = a + b;
//        System.out.println(c);
//        c = a - b;
//        System.out.println(c);
//        c = a * b;
//        System.out.println(c);
//        c = a / b;
//        System.out.println(c);
//        c = a % b;
//        System.out.println(c);
//        input.close();

//        Scanner input = new Scanner(System.in);
//        System.out.println("First number");
//        int a = input.nextInt();
//
//        for (int i = 1; i < 11; i++){
//            int result = a * i;
//            System.out.println(result);
//        }

//        System.out.println("   J    a   v     v  a   ");
//        System.out.println("   J   a a   v   v  a a  ");
//        System.out.println("J  J  aaaaa   V V  aaaaa ");
//        System.out.println(" JJ  a     a   V  a     a");

//        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
//        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
//        System.out.println(result);

//        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

//        double radius = 7.5;
//        double perimeter = radius * 2 * 3.142;
//        double area = 3.142 * (Math.pow(radius, 2));
//
//        System.out.println("Perimeter is " + perimeter);
//        System.out.println("Area is " + area);

//        Scanner input = new Scanner(System.in);
//        double x = input.nextInt();
//        double y = input.nextInt();
//        double z = input.nextInt();
//        double avg = (x + y + z) /3;
//        input.close();
//
//        System.out.println(avg);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Width:\n");
//        double width = input.nextDouble();
//        System.out.println("Height:\n");
//        double height = input.nextDouble();
//        input.close();
//
//        double area = width * height;
//        double perimeter = 2 * (width * height);
//
//        System.out.println("Area: " + area);
//        System.out.println("Perimeter: "+ perimeter);

//        Scanner input = new Scanner(System.in);
//        int nums = input.nextInt();
//        String digit = String.valueOf(nums);
//        System.out.println(digit);
//        char[] num = digit.toCharArray();
//
//        //Use a for loop to reverse based the character position
//        for (int i = 0, j = num.length-1; i < j; i++,j--) {
//            char temp = num[i];
//            num[i] = num[j];
//            num[j] = temp;
//            System.out.println(num);
//        }
//
//        //Using String builder to reverse
//        String reversedString = new StringBuilder(digit).reverse().toString();
//        int reversedNum = Integer.parseInt(reversedString);
//        System.out.println(reversedNum);
//        System.out.println(reversedString);

//        int a, b, temp;
//
//        a = 0;
//        temp = a;
//        b = 1;
//
//        a = b; b = temp;
//        System.out.println(a);
//        System.out.println(b);

//        String[] arr = new String[5];
//
//        arr[0] = " +\"\"\"\"\"+ ";
//        arr[1] = "[| o o |]";
//        arr[2] = " |  ^  | ";
//        arr[3] = " | '-' | ";
//        arr[4] = " +-----+";
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Input first binary: ");
//        String x = input.nextLine();
//        System.out.println("Input second binary: ");
//        String y = input.nextLine();
//
//        int num1 = Integer.parseInt(x, 2);
//        System.out.println(num1);
//        int num2 = Integer.parseInt(y, 2);
//        System.out.println(num2);
//        int sum = num1 + num2;
//        int multiply = num1 * num2;
//
//        String addition = Integer.toBinaryString(sum);
//        String multiplication = Integer.toBinaryString(multiply);
//
//        System.out.println(addition);
//        System.out.println(multiplication);

//        //Decimal into binary, hexadecimal, octal
//        Scanner input = new Scanner(System.in);
//        System.out.println("Decimal number: ");
//        //Treat the input as a string
//        String x = input.nextLine();
//
//        //convert decimal string to integer
//        int num = Integer.parseInt(x);
//        //convert integer to binaryString
//        String binary = Integer.toBinaryString(num);
//        //convert integer to hexadecimal
//        String hex = Integer.toHexString(num);
//        //convert integer to octal
//        String octal = Integer.toOctalString(num);
//        System.out.println(binary);
//        System.out.println(hex);
//        System.out.println(octal);

//        //Binary to decimal, hexadecimal, octal
//        Scanner input = new Scanner(System.in);
//        System.out.println("Binary number: ");
//        String x = input.nextLine();
//        input.close();
//
//        //convert to decimal with parseInt, base 2 so Java knows this String is converted into integer with base 2
//        int decimal = Integer.parseInt(x,2);
//        //convert decimal to hexadecimal
//        String hex = Integer.toHexString(decimal);
//        //convert decimal to octal
//        String octal = Integer.toOctalString(decimal);
//
//        System.out.println(decimal);
//        System.out.println(hex);
//        System.out.println(octal);

//        //Octal to decimal, binary, hexadecimal
//        Scanner input = new Scanner(System.in);
//        System.out.println("Octal number: ");
//        String x = input.nextLine();
//        input.close();
//
//        //convert to decimal with parseInt, base 2 so Java knows this String is converted into integer with base 2
//        int decimal = Integer.parseInt(x,8);
//        //convert decimal to binary
//        String binary = Integer.toBinaryString(decimal);
//        //convert decimal to hexadecimal
//        String hex = Integer.toHexString(decimal);
//
//        System.out.println(decimal);
//        System.out.println(binary);
//        System.out.println(hex);

//        //Hexadecimal to decimal, binary, octal
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hexadecimal number: ");
//        String x = input.nextLine();
//        input.close();
//
//        //convert to decimal with parseInt, base 2 so Java knows this String is converted into integer with base 2
//        int decimal = Integer.parseInt(x,16);
//        //convert decimal to binary
//        String binary = Integer.toBinaryString(decimal);
//        //convert decimal to hexadecimal
//        String octal = Integer.toOctalString(decimal);
//
//        System.out.println(decimal);
//        System.out.println(binary);
//        System.out.println(octal);

//        // Display Java version
//        System.out.println("\nJava Version: " + System.getProperty("java.version"));
//
//        // Display Java runtime version
//        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
//
//        // Display Java home directory
//        System.out.println("Java Home: " + System.getProperty("java.home"));
//
//        // Display Java vendor name
//        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
//
//        // Display Java vendor URL
//        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
//
//        // Display Java class path
//        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");

/*        Scanner input = new Scanner(System.in);
        int x, y;
        x = input.nextInt();
        y = input.nextInt();
        if (x == y){
            System.out.printf("%d == %d\n", x, y);
        }else{
            System.out.printf("%d != %d\n", x, y);
        }
        if (x < y){
            System.out.printf("%d < %d\n", x, y);
        }else if(x > y){
            System.out.printf("%d > %d\n", x, y);
        }
        if (x <= y){
            System.out.printf("%d <= %d\n", x, y);
        }else{
            System.out.printf("%d >= %d\n", x, y);
        }*/

/*        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Sum of the digits is " + sumDigit(n));
    }

    public static int sumDigit(int n) {
        int sum = 0;

        while (n != 0) {
            System.out.println(n % 10);
            sum = sum + n % 10;
            System.out.println(n /= 10);
            n = n / 10;
            System.out.println(sum);
        }
        return sum;
    }*/
/*        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of a side:");
        double s = input.nextDouble();
        System.out.println("The area of hexagon is : " + hexArea(s));
        }

        public static double hexArea(double s){
            return (6 * (Math.pow(s,2))) / (4 * (Math.tan(Math.PI / 6)));
        }*/

/*        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon:");
        int n = input.nextInt();
        System.out.println("Enter the length of a side:");
        double s = input.nextDouble();
        System.out.println("The area is: "+ polyArea(n, s));
    }
    public static double polyArea(int n, double s){
        return (n * (Math.pow(s,2))) / (4 * Math.tan(Math.PI / n));
    }*/

        
    }
}


