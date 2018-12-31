#Thank you sanfoundary.com

// #1
public class Test1 {

	public static void main(String[] args) {
        int g = 3;
        System.out.print(++g * 8);

	}

}
//#2
public class Test1 {
	public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        b++;
        ++a;
        System.out.println(a + " " + b + " " + c);

	}
}

//#3

public class Test1 {
	public static void main(String[] args) {
        double a = 26;
        int  b = 37;
        a -= a % 10;
        b += b % 10;
        System.out.println(a + " "  + b);
    }
}

//#4

public class Test1 {
	public static void main(String[] args) {
        double var1 = 1 + 5; 
        double var2 = var1 / 4;
        int var3 = 1 + 5;
        int var4 = var3 / 4;
        System.out.print(var2 + " " + var4);
  }
}

//#5

public class Test1 {
	public static void main(String[] args) {
        boolean a = true;
        boolean b = !true;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = d ? b : c;
        System.out.println(d + " " + e);
   } 
}

//#6

public class Test1 {
	public static void main(String[] args) {
        int x = 3;
        int y =x<<3;
        int z;
        z = x > y ? x : y;
        System.out.print(z);
   } 
}

//#7

public class Test1 {
	public static void main(String[] args) {
        int x , y = 2;
        x = 10;
        if (x != 10 && x / 0 == 0)
           System.out.println(y++ + ++y);
        else
            System.out.println(++y + ++y);
   } 
}

//#8
public class Test1 {
	public static void main(String[] args) {
        int sum = 0;
        int j=0;
        for (int i = 0; i<5; ++i)
        {
            sum += i;
        }

     System.out.println(sum);
   } 
}
//#9
public class Test1 {
	public static void main(String[] args) {
        int x = 2;
        for (int y = 0; y < 10; ++y) 
        {
            if (y % x == 0) 
                continue;  
            else if (y == 8)
                 break;
            else
               System.out.print(y + " ");
        }
   } 
}

//# 10 . Write a program to reverse a number
//11. Make Simple Calculator
