
// Question 1
// public class main{
//     public static void main(String args[]){
//         System.out.println("Hello");
//         System.out.println("Prince Kumar Sahni");
//     }
// }

// Question 2
// public class main{
//     public static void main(String args[]){
//         int a = 74;
//         int b = 36;
//         System.out.println(a + b);
//     }
// }

// Question 3
// public class main{
//     public static void main(String args[]){
//         int a = 50;
//         int b = 3;
//         System.out.println(a / b);
//     }
// }

// Question 4
// public class main{
//     public static void main(String args[]){
//         System.out.println(-5+8*6);
//         System.out.println((55+9)%9);
//         System.out.println(20+-3*5/8);
//         System.out.println(5 + 15/3 *2-8%3);
//     }
// }

import java.util.Scanner;
// Question 5
// public class main{
//     public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Input first Number : ");
//     int num1 = sc.nextInt();
//     System.out.println("Input Second Number : ");
//     int num2 = sc.nextInt();
//     System.out.println(num1 + num2);
//     }
// }

// Question 6
// public class main{
//     public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Input first Number : ");

//     int num1 = sc.nextInt();
//     System.out.println("Input Second Number : ");
//     int num2 = sc.nextInt();
//     System.out.println(num1 + num2);
//     System.out.println(num1 - num2);
//     System.out.println(num1 * num2);
//     System.out.println(num1 / num2);
//     }
// }

// Question 7
// public class main{
//     public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the number that you want to get the multiplication table : ");
//     int num1 = sc.nextInt();

//         for(int i = 1; i<=10; i++){
//             String mul = num1 + "X" + i + "=" + (num1*i) ;
//             System.out.println(mul);
//         }
//     }
// }

// Question 8 skip watch the video first
// public class main{
//     public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);

//         for(int i = 0; i<3; i++){
//             System.out.println("J");
//             for(int j = 1; j<4; j++){
//                 System.out.println("j" + "J");
//             }
//         }
//     }
// }

// Question 9
// public class main{
//     public static void main(String args[]) {

//     double num1 = (25.5 * 3.5 -3.5*3.5);
//     double num2 = (40.5 - 4.5);
//     System.out.println(num1/num2);
//     }
// }

//Question 10
// public class main{
//     public static void main(String args[]) {

//     double num1 = (4.0*(1-(1.0/3) + (1.0/5) - (1.0/7)  + (1.0/9) - (1.0/11)));
//     System.out.println(num1);
//     }
// }

// Question 11
// public class main{
//     public static void main(String args[]) {

//     double radius = 7.5;
//     double perimeter = 2 * Math.PI * radius;
//     double area = Math.PI * radius * radius;
//     System.out.println(perimeter);
//     System.out.println(area);
//     }
// }

// Question 12
// public class main{
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();

//         float avg = (num1 + num2 + num3) / 3 ;
//         System.out.println(avg);
//     }
// }

// Question 13
// public class main{
//     public static void main(String args[]) {

//     double width = 5.6;
//     double height = 8.5;
//     double area = width * height;
//     double perimeter = 2 * ( width + height);
//     System.out.println(area);
//     System.out.println(perimeter);
//     }
// }

// Question 14 - Solve after watching the video.
// public class main{
//     public static void main(String args[]) {

//     }
// }

// Question 15
// public class main{
//     public static void main(String args[]) {

//     int a = 5;
//     int b = 6;
//     int temp;

//     temp = a;
//     a = b;
//     b = temp;
//     System.out.println("a = " + a);
//     System.out.println("b = " + b);
//     }
// }

// Question 16
// public class main{
//     public static void main(String args[]) {

//     System.out.println("""""""");
//     System.out.println(" +     +");
//     System.out.println("[| o o |]");
//     System.out.println(" |  ^  | ");
//     System.out.println(" |     | ");
//     System.out.println(" | '_' | ");
//     System.out.println(" +-----+ ");
//     }
// }

// Question 17 - sum of binary number -see the video
// public class main{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int carry, i = 0;
//         int[] sum = new int[20];
//         System.out.println("Input first binary number : ");
//         long num1 = sc.nextLong();
//         System.out.println("Input second binary number : ");
//         long num2 = sc.nextLong();

//         while(num1 != 0 || num2 != 0){
//             sum[i++] = (int)((num1 % 10 + num2 % 10 + carry) % 2);
//             carry = (int)((num1 % 10 + num2 % 10 + carry) / 2);
//             num1 = num1 / 10;
//             num2 = num2 / 10;
//         }

//         if(carry != 0){
//             sum[i++] = carry;
//         }
//         --i;

//         System.out.println("Output : ");
//         while( i>= 0){
//             System.out.print(sum[i--]);
//         }
//         System.out.print("\n");

//     }
// }

// Question 31 
// public class main{
//     public static void main(String args[]) {
//         System.out.println("Java Version : " + System.getProperty("java.version"));
//         System.out.println("Java Runtime version : " + System.getProperty("java.runtime.version"));
//         System.out.println("Java Home : " + System.getProperty("java.home"));
//         System.out.println("Java Vendor : " + System.getProperty("java.vendor"));
//         System.out.println("Java Vendor Url  : " + System.getProperty("java.vendor.url"));
//         System.out.println("Java Class Path : " + System.getProperty("java.class.path"));
//     }
// }

// Question 32

// public class main{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input first integer : ");
//         int num1 = sc.nextInt();
//         System.out.println("Input Second integer : ");
//         int num2 = sc.nextInt();
//         if(num1 == num2)
//             System.out.printf("%d == %d\n", num1, num2);
//         if(num1 != num2)
//             System.out.printf("%d != %d\n", num1, num2);
//         if(num1 < num2)
//             System.out.printf("%d < %d\n", num1, num2);
//         if(num1 > num2)
//             System.out.printf("%d > %d\n", num1, num2);
//         if(num1 <= num2)
//             System.out.printf("%d <= %d\n", num1, num2);
//         if(num1 >= num2)
//             System.out.printf("%d >= %d\n", num1, num2);
//     }
// }

// Question 33
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num = sc.nextInt();

//         int sum = 0;
//         while(num > 0){
//             int rem = num%10;
//             sum = sum + rem; 
//             num = num / 10;

//         }
//         System.out.println("The sum of digits " + sum);
//     }
// }

// Question 34
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Side of hexagon");
//         int s = sc.nextInt();
//         System.out.println("The Area of the hexagone is : " + hexagonArea(s) + "\n");
//     }
//     public static double hexagonArea(double s){
//         return (6*(s*s))/(4*Math.tan(3.14/6));
//     }
// }

// Question 35
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of side of Polygon");
//         int n = sc.nextInt();
//         System.out.println("Enter the length of the side");
//         double s = sc.nextDouble();
//         System.out.println("Area of Polygon is : " + polygonArea(n, s));
//     }

//     public static double polygonArea(int n, double s){
//         return (n * (s * s))/(4*Math.tan((3.14/n)));
//     }
// }

// Question 36
// public class main{
//     public static void main(String args[]){

//         // Find the diatance between the two point
//         // Radius of the earth = 6371.01km
//         // lat1 = Math.toRadians(lat1);
//         // lon1 = Math.toRadians(lon1);
//         // lat2 = Math.toRadians(lat2);
//         // lon2 = Math.toRadians(lon2);
//         double lat1 = 25;
//         double lon1 = 35;
//         double lat2 = 35.5;
//         double lon2 = 25.5;
//         double earthRadius = 6371.01;

//         double distanceBetween  = earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2) * Math.cos(lon1 - lon2));

//         System.out.println(distanceBetween);
//     }
// }

// Question 37
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the character that you want to reverse");
//         char[] inputString = sc.nextLine().toCharArray();
//         System.out.println("Reverse String : ");

//         for(int i = inputString.length - 1; i>=0; i--){
//             System.out.print(inputString[i]);
//         }

//     }

// }

// Question 38
// public class main{
//     public static void main(String args[]){
//         String inputString = "Hello, I am doing some space work and writing some 1 3 4 code.";
//         count(inputString);
//     }

//     public static void count(String x){
//         char[] ch = x.toCharArray();
//         int letter = 0;
//         int space = 0;
//         int num = 0;
//         int other = 0;

//         for(int i = 0; i < x.length(); i++){
//             if(Character.isLetter(ch[i])){
//                 letter ++;
//             } else if(Character.isDigit(ch[i])){
//                 num ++ ;
//             } else if(Character.isSpaceChar(ch[i])){
//                 space ++ ;
//             } else {
//                 other ++ ;
//             }
//         }
//         System.out.println("letter : " + letter);
//         System.out.println("space : " + space);
//         System.out.println("number : " + num);
//         System.out.println("other : " + other);
//     }
// }

import java.util.Random;
// Question 39
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//             // int inputNumber = sc.nextInt();
//             Random rand = new Random();
//             int upperbound = 444;
//             int int_random = rand.nextInt(upperbound);
//             System.out.println(int_random);
//     }
// }

// Question 41
// public class main{
//     public static void main(String args[]){
//         int chr = 'A';
//         System.out.println("The ASCII value of Z is  : " + chr);
//     }
// }

// Question 42 - No Solution
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//     }
// }

// Question 43
// public class main{
//     public static void main(String args[]){
//         System.out.println("Twinkle, twinkle, little star,");
//         System.out.println("\tHow I wonder what you are!");
//         System.out.println("\t\tUp above the world so high,");
//         System.out.println("\t\tLike a diamond in the sky");
//         System.out.println("Twinkle, twinkle, little star,");
//         System.out.println("\tHow I wonder what you are");
//     }
// }

// Question 44
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number");
//         int num = sc.nextInt();
//         System.out.println(num + " + " + num + num + " + " +num + num+ num);

//     }
// }

import java.io.File;
// Question 45
// public class main {

//  public static void main(String[] args) {
//   System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
//   System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
//  }
// }

// Question 46 - 47
// public class main{
//     public static void main(String args[]){
//         System.out.format("\n Current Data time : %tc%n\n", System.currentTimeMillis());
//     }
// }

// Question 48
// public class main{
//     public static void main(String args[]){
//         for(int i = 1; i<100; i++){
//             if(i%2 != 0){
//                 System.out.println(i);
//             }

//         }
//     }
// }

// Question 49
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int num1 = sc.nextInt();
//         if(num1 % 2 == 0){
//             System.out.println("1");
//         } else {
//             System.out.println("0");
//         }
//     }
// }

// Question 50
// public class main{
//     public static void main(String args[]){
//         int i = 1; 
//         System.out.println("This is divided by 3");
//         while(i <=100){
//             if(i%3 == 0){

//                 System.out.println(i);
//             } 
//             i++;
//         };
//         int j = 1;
//         System.out.println("This is Divided by 5");
//         while(j <=100){
//             if(j%5 == 0){

//                 System.out.println(j);
//             } 
//             j++;
//         };
//         int k = 1;
//         System.out.println("This is Divided by both 3 and 5");
//         while(k <=100){
//             if(k%3 == 0 || k%5 == 0){

//                 System.out.println(k);
//             } 
//             k++;
//         }
//     }
// }

// Question 51
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number");
//         String any = sc.next();
//         int result = Integer.parseInt(any);
//         System.out.println("The integer value is " + result);
//     }
// }

// Qestion 52
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int num1 = sc.nextInt();
//         System.out.println("Enter the Second number");
//         int num2 = sc.nextInt();
//         System.out.println("Enter the Second number");
//         int num3 = sc.nextInt();

//         int sum = num1 + num2;
//         if(sum == num3){
//             System.out.println("The result is : True");
//         }
//     }
// }

// Question 53
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int num1 = sc.nextInt();
//         System.out.println("Enter the Second number");
//         int num2 = sc.nextInt();
//         System.out.println("Enter the Third number");
//         int num3 = sc.nextInt();

//         if(num2 > num1 && num3> num2){
//             System.out.println("The result is : True");
//         }
//     }
// }

// public class main{
//     public static void main(String args[]){
//         for(int i = 1; i<=100; i++){
//             if(i%2 != 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

public class main {
    public static void main(String args[]) {
        int sum = 0;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, how much you want ");

        while ((input = sc.nextInt()) != 0) {
            sum = input + sum;
        }

        System.out.println("The sum is " + sum);
    }
}
