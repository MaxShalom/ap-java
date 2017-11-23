
# Primitive Data Types

* **Boolean** - Light switch (True/False)
* **Char** - 1 character - single quotes
* **int** - 1 digit number
* **Double** - Number with a decimal point

## public static void
1. **public** - can be used anywhere; private - only usable in that class
2. **static** - not associated
3. **void** - not returning anything

Many other options for these

```java
    public static void mose() {
        System.out.printLn("mo")
    }

    run() {
        mose();
    }
```

These above commands will run the command **mose();** that we declared and say "mo" in the console whenever ran.

```java
public static int adding example (int x, int y) {
  int z = x + y;
  return z;
}

class example {
  public static void main (string....) {
  	w = (add 2,3);
  }
}
```

These commands will have the integer of z print as 5 since we said that x is 2 and y is 3.

```java
import Math
run() {
	w = math.sqrt(36);
}
```

This snippet shows the Java Math function. The phrase **import Math** goes on top of _everything_ else that is in your Java document. We then used the method **math.sqrt (36);** which would output the square root of 36, 6.

------

## Code Examples

Example 1:

```java
import java.lang.Math;
public class problemOne
{
  public static void main(String[] args)
  {
    double v0 = 4.53;
    double ax = 3.21;
    double x = 8.1;
    double x0 = 6.9;
    double v = equationOne(v0, ax, x, x0);
    System.out.println(v);
  }

  public static double equationOne(double v0, double ax, double x, double x0)
  {
  	return Math.sqrt(v0*v0 + 2*ax*(x-x0));
  }
}	
```


Example 2:

```java
    import java.lang.Math;
    public class problemTwo
    {
        public static void main(String[] args)
        {
            double l = 5.6;
            double g = 3.25;
            double t = pendulum(l, g);
            System.out.println(t);
        }
        public static double pendulum(double l, double g)
        {
            return 2*3.14159365*Math.sqrt(l/g);
        }
    }
```


Example 3:

```java
    import java.lang.Math;
    public class problemThree
    {
        public static void main(String[] args)
        {
            int a = 8;
            int b = 4;
            double c = hype(a, b);
            System.out.println(c);
        }
        public static double hype(int a, int b)
        {
            return Math.sqrt(a*a + b*b);
        }
    }
```
