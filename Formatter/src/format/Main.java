package format;

import java.util.*;

class Main {

    public static void main(String args[]) {
// StringBuilder sb = new StringBuilder();
// Formatter f = new Formatter(sb);
// int a = 1234;
// int b = 5;
// f.format("PI is %6.2f!", Math.PI);
// System.out.println(sb);//The output is: PI is 3.141592653589793000!
        System.out.printf("PI is %25.18f!\n", Math.PI);

        System.out.println();
        System.out.println();
        System.out.println("Name: Nguyen Hoa, age: 19");
        System.out.println("Name: Nguyen Hoang Long, age: 20");
        System.out.println();
        System.out.println();

        System.out.printf("Name: %18s, age: 19\n", "Nguyen Hoa");
        System.out.printf("Name: %18s, age: 19\n", "Nguyen Hoang Long");
        System.out.println();
        System.out.println();
// System.out.printf(format, arguments);
// System.out.printf(locale, format, arguments);
// We specify the formatting rules using the format parameter. Rules start with the % character.
        System.out.printf("Hello %10.3f!%n", 110.18);
// s formats strings.
// d formats decimal integers.
// f formats floating-point numbers.
// t formats date/time values.

// %[flags][width][.precision]conversion-character
// To break the string into separate lines, we have a %n specifier:
        System.out.printf("baeldung%nline%nterminator\n");

// To format a simple string, we'll use the %s combination. Additionally, we can make the string uppercase:
        System.out.printf("'%s' %n", "baeldung");
        System.out.printf("'%S' %n", "baeldung");
// And this is the output:
// 'baeldung'
// 'BAELDUNG'
// Also, to specify a minimum length, we can specify a width
        System.out.printf("'%15s' %n", "baeldung ");
// which gives us:
// ' baeldung'
// If we need to left-justify our string, we can use the – flag:
        System.out.printf("'%-10s' %n", "baeldung");
// This is the output:
// 'baeldung '
// Even more, we can limit the number of characters in our output by specifying a precision:

        System.out.printf("%2.2s\n", "Hi there!\n");
// The first x number in %x.ys syntax is the padding. y is the number of chars.

// Integer Formatting
// The printf() method accepts all the integers available in the language — byte, short, int, long, and BigInteger if we use %d:
        System.out.printf("simple integer: %d%n", 10000L);
// With the help of the d character, we'll have this result:
// simple integer: 10000
// In case we need to format our number with the thousands separator, we can use the , flag. And we can also format our results for different locales:

        System.out.printf(Locale.US, "%,d %n", 10000);
        System.out.printf(Locale.ITALY, "%,d %n", 10000);
// As we can see, the formatting in the US is different than in Italy:
// 10,000
// 10.000

// To format a float number, we'll need the f format:
        System.out.printf("%f%n", 5.1473);
// which will output:

// 5.147300
// Of course, the first thing that comes to mind is to control the precision:
        System.out.printf("'%5.2f'%n", 5.1473);
// Here we define the width of our number as 5, and the length of the decimal part is 2:

// ' 5.15'
// Here we have one-space padding from the beginning of the number to support the predefined width.
// To have our output in scientific notation, we just use the e conversion-character:
        System.out.printf("'%5.2e'%n", 5.1473);

        System.out.printf("Ten Sinh Vien: %s, diem trung binh: %f, %n", "Nguyen Hoang", 5.15);
// And this is our result:
// '5.15e+00'
    }
}
