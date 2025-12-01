package Basics;

public class Operators 
{
	public static void main(String[] args)
	{
		// Arithmetic operator
        int p = 10;
        int q = 3;

        System.out.println(p + q);// 13
        System.out.println(p - q);// 7
        System.out.println(p * q);// 30
        System.out.println(p / q); // 3  (integer division)
        System.out.println(p % q); // 1
        
        
        // Assignment Operator
        int x = 5;

        x += 3;  // x = x + 3 → 8
        x -= 2;  // x = x - 2 → 6
        x *= 4;  // x = x * 4 → 24
        x /= 3;  // x = x / 3 → 8
        x %= 5;  // x = x % 5 → 3
        
        
        // Relational (Comparison) operator
        int a = 10;
        int b = 20;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        System.out.println(a >= 10); // true
        System.out.println(b <= 15); // false
        
        
        // Logical Operators
        boolean x1 = true;
        boolean y = false;

        System.out.println(x1 && y); // false
        System.out.println(x1 || y); // true
        System.out.println(!x1);     // false
        
        
        // Unary Operators
        int n = 5;

        System.out.println(++n); // 6  (increment first)
        System.out.println(n++); // 6  (print first, then increment → 7)
        System.out.println(--n); // 6
        System.out.println(n--); // 6 (then becomes 5)

        
        // Bitwise Operators
        int a1 = 5;   // 0101
        int b1 = 3;   // 0011

        System.out.println(a1 & b1);  // 1   (0001)
        System.out.println(a1 | b1);  // 7   (0111)
        System.out.println(a1 ^ b1);  // 6   (0110)
        System.out.println(~a1);     // -6
        System.out.println(a1 << 1); // 10
        System.out.println(a1 >> 1); // 2
        
        
        // Ternary Operator
        int age = 17;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result); // Minor

	}

}
