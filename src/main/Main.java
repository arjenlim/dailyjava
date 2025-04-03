package main;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.nio.*;
import java.io.*;
import java.time.*;
import java.text.*;

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

//        //36. Distance Between Two Points
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input the latitude of coordinate 1: ");
//        double x1 = input.nextDouble();
//        System.out.print("Input the longitude of coordinate 1: ");
//        double x2 = input.nextDouble();
//        System.out.print("Input the latitude of coordinate 2: ");
//        double y1 = input.nextDouble();
//        System.out.print("Input the longitude of coordinate 2: ");
//        double y2 = input.nextDouble();
//
//        System.out.println("The distance between those points is: " + distanceTwoPoint(x1, x2, y1, y2));
//    }
//    public static double distanceTwoPoint(double x1, double x2, double y1, double y2){
//        x1 = Math.toRadians(x1);
//        x2 = Math.toRadians(x2);
//        y1 = Math.toRadians(y1);
//        y2 = Math.toRadians(y2);
//        double r = 6371.01;
//        return r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

/*        //37 Reverse a string
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string:");
        char[] letters = input.nextLine().toCharArray();
        for(int i = letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }*/
/*
        //38 Count characters in a String
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] s = input.nextLine().toCharArray();
        int letter , space , digit , other;
        letter = space = digit = other = 0;

        for(int i = 0; i < s.length; i++){
            if(Character.isLetter(s[i])){
                letter ++;
            } else if (Character.isDigit(s[i])) {
                digit ++;
            } else if (Character.isSpaceChar(s[i])) {
                space ++;
            }else{
                other ++;
            }
        }
        System.out.println("Letter: "+ letter);
        System.out.println("Space: "+ space);
        System.out.println("Digit: "+ digit);
        System.out.println("Other: "+ other);
*/
        /*//39 Unique Three Digit Numbers
        int counter = 0;
        for (int first = 1; first <= 4; first++) {
            for (int second = 1; second <= 4; second++) {
                if (second == first) continue; // Skip if digits are not unique

                for (int third = 1; third <= 4; third++) {
                    if (third == first || third == second) continue; // Ensure uniqueness

                    counter++; // Increment count
                    System.out.println(first + "" + second + "" + third);
                }
            }
        }
        System.out.println("Total unique three-digit numbers: " + counter);*/

/*        //40 available charsets
        System.out.println("List of available character sets: ");

        // Iterate through the available character sets and print their names
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }*/
        /* //41 Ascii value finder
        Scanner input = new Scanner(System.in);
        System.out.println("Input a character: ");
        char ch = input.next().charAt(0);
        int ascii = ch;
        System.out.println(ascii);*/

/*        //42 Input and Disply Password
        Scanner input = new Scanner(System.in);
        System.out.println("Input your Password: ");
        String pw = input.next();
        System.out.print("Your password was: "+ pw);

        //Console approach
        Console cons;
        if((cons = System.console()) != null){
            char[] pass_ward= null;

            try{
                pass_ward = cons.readPassword("Input your password: ");
                System.out.println("Your password was: " + new String(pass_ward));
            }finally {
                if(pass_ward != null){
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        }
        else {
            throw new RuntimeException("Can't get the password... No console");
        }*/

/*        //43 Twinkle Poem Formatter
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("\tHow I wonder what you are!");
        System.out.println("\t\tUp above the world so high,  ");
        System.out.println("\t\tLike a diamond in the sky.");
        System.out.println("Twinkle, twinkle, little star, ");
        System.out.println("\tHow I wonder what you are");*/

        //44 Compute n+nn+nnn
/*        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Input number: ");
            int n = input.nextInt();
            int nn = n * 11;
            int nnn = n * 111;
            if (n != 0) {
                int x = n + nn + nnn;
                System.out.printf("%d + %d + %d\n", n, nn, nnn);
                System.out.printf("%d + %d %d = " + x +"\n", nnn, nn, n);
            } else {
                System.out.println("n is 0");
            }
        }*/

/*        //45 File Size Finder
        // Display the file sizes in bytes for two files.
        System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");*/

/*        //46 Display current time
        Long currentTime = System.currentTimeMillis();
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date(currentTime);
        String time = simpleDateFormat.format(date);
        System.out.println(time);*/

/*        //47 Display current time and date in specific format
        // Create a SimpleDateFormat with a specific date and time format
        SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");

        // Set the time zone for the calendar to GMT
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        // Display the current date and time in the specified format
        System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));

        //47.1 modify program into dd/mm/yyyy
        SimpleDateFormat cdt1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        System.out.println("\nNow: " + cdt1.format(System.currentTimeMillis()));*/

/*        //48 Print odd numbers
        for(int i =1; i <100; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }*/
/*        //48.1 Print even numbers
        for(int i =1; i <100; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }*/
        /*//48.2 Print prime numbers within a range
        for (int i = 1; i <= 100; i++) {
            int flag = 1;
            for (int j = 2; j <= Math.sqrt(i); j++)  // 2.Try dividing the number by half check whether it divisible
            {
                if (i % j == 0) // 3. If the number is divisible by other number ->Not a prime Number
                {
                    flag = 0;
                    break;
                }

            }
            if (flag == 1) // 4. If the number is not divisible by any other numbers but only by itself and 1 -> prime no
            {
                System.out.println(i);

            }
        }*/

        //48.3 Display numbers in reverse order
        /*for (int i = 100; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }*/
        //48.4 Find sum of printed numbers
/*        int sum = 0;
        for (int i = 100; i >= 0; i--) {
            if (i % 2 != 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);*/

/*        //Check even or odd
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();
        if (num %2 ==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        //check input prime or not
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false; // Numbers less than 2 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // No need to check further, it's not prime
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        //check input is positive or negative
        if(num >=0){
            System.out.println(num+" is positive");
        }else{
            System.out.println(num+" is negative");
        }*/

        //50. Divisible by 3,5,both
/*        List<Integer> list3=new ArrayList<Integer>();
        List<Integer> list5=new ArrayList<Integer>();
        List<Integer> list7=new ArrayList<Integer>();
        List<Integer> list35=new ArrayList<Integer>();
        List<Integer> list23=new ArrayList<Integer>();
        List<Integer> listn=new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        int n = input.nextInt();
        int count =0;

        for(int i = 1; i<=100; i++){
            if(i%3 ==0){
                list3.add(i);
            }
            if(i%5 ==0){
                list5.add(i);
            }
            if(i%7 ==0){
                list7.add(i);
            }
            if(i%3 ==0 && i%5 ==0){
                list35.add(i);
            }
            if(i%2 ==0 && i%3 ==0){
                list23.add(i);
            }
            if(i%n ==0){
                listn.add(i);
                count += 1;
            }
        }

        System.out.println("Divided by 3:\n" + list3);
        System.out.println("Divided by 5:\n" + list5);
        System.out.println("Divided by 7:\n" + list7);
        System.out.println("Divided by 3 and 5:\n" + list35);
        System.out.println("Divided by 2 and 3:\n" + list23);
        System.out.println("Divisible by: "+ n +"\n" + listn + " Count: " + count);*/

        //51 String to integer conversion
/*        Scanner input = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String s = input.nextLine();
        int n = Integer.parseInt(s);
        System.out.print("The integer value is: "+n);*/

        //52 Sum Equals Third Integer
/*        Scanner input = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = input.nextInt();
        System.out.print("Input a number 2: ");
        int num2 = input.nextInt();
        System.out.print("Input a number 3: ");
        int num3 = input.nextInt();

        if((num1 + num2) == num3){
            System.out.println("The result is: true ");
        }else{
            System.out.println("The result is: false ");
        }*/

        //53 Number Comparison Logic
        /*Scanner input = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = input.nextInt();
        System.out.print("Input a number 2: ");
        int num2 = input.nextInt();
        System.out.print("Input a number 3: ");
        int num3 = input.nextInt();
        System.out.print("Input a boolean value (true/false): ");
        boolean abc = input.nextBoolean();

        System.out.print("The result is: "+ test(num1, num2, num3, abc));
        }
    public static boolean test(int p, int q, int r, boolean abc){
        if (abc){
            return(r > q);
        }else{
            return(r > q && q > p);
        }*/

        //54 Same Rightmost Digit Check
/*        Scanner input = new Scanner(System.in);
        System.out.print("Input number 1: ");
        char[] num1 = input.next().toCharArray();
        System.out.print("Input number 2: ");
        char[] num2 = input.next().toCharArray();
        System.out.print("Input number 3: ");
        char[] num3 = input.next().toCharArray();

        System.out.print("The result is: " + rightmost(num1, num2, num3));
    }

    public static boolean rightmost(char[] x, char[] y, char[] z) {
        return (x[x.length-1] == y[y.length-1] || x[x.length-1] == z[z.length-1] || y[y.length-1] == z[z.length-1]);*/


        //Find largest in a range of numbers
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = 0;
        if(input.hasNextInt()) {
            arraySize = input.nextInt();
        }
        int[] arr = new int[arraySize];
        for (int i = 0; i< arraySize; i++){
            System.out.println("Enter the element of the array at:" + (i + 1));
            arr[i] = input.nextInt();
        }
        int largest = arr[0];
        int second = arr[1];
        for(int i = 1; i < arraySize; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i] > second){
                second = arr[i];
            }
        }
        //Find 2nd largest

        input.close();
        System.out.println(Arrays.toString(arr));
        System.out.println(largest);
        System.out.println(second);*/

        //55 Seconds to Time conversion
/*        Scanner input = new Scanner(System.in);
        int second = input.nextInt();

        int s = second%60;
        int h = second/60;
        int m = h%60;
        h = h/60;

        System.out.printf("%d:%d:%d", h,m,s);*/

        //56 Count divisibles in range
/*        int x = 5;
        int y = 20;
        int p = 3;
        int count = 0;

        for(int i = 5; i <= 20; i++){
            if (i%p ==0){
                count++;
            }
        }
        System.out.println(count);*/

        //57 Count factors of integer
/*        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");

        // Read an integer from the user
        int x = in.nextInt();

        // Call the result method and print the result
        System.out.println(result(x));
    }

    // Define a method to calculate the number of divisors for a given integer
    public static int result(int num) {
        int ctr = 0;

        // Iterate from 1 to the square root of the input number
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            // Check if 'i' is a divisor, and if it's not a perfect square
            if (num % i == 0 && i * i != num) {
                ctr += 2;  // Increase the count by 2
            } else if (i * i == num) {
                ctr++;  // If 'i' is a perfect square, increase the count by 1
            }
        }
        return ctr;*/

        //58 Capitalize first letter of each word
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String upper_case_list = "";
        Scanner lineScan = new Scanner(s);
        while(lineScan.hasNext()){
            String word = lineScan.next();
            upper_case_list += Character.toUpperCase(word.charAt(0)) + word.substring(1)+ " ";
        }
        System.out.println(upper_case_list);

    }
}
