# Basic Java 1-7

### Variables

* Items that hold stuff


### User Input

```java
    import java.util.Scanner
    
    Scanner scan = new scanner(System.in);
    int x = scan.nextInt();
```


* x is now equal to whatever the user inputted into the console

### Arithmetic Expression
* "+" - Add
* "-" - Subtract
* "*" - Multiply
* "/" - Divide
* "%" - Mod

### Casting
* Upcasting 
    * If you want to raise a value up to a larger data type, that is always allowed.
    * Example:

        ```java
        double x = 33;
        x++;
        ```

* Downcasting
    * Bringing something to a lower data type is harder, you need to declare the cast explicitly
    * this always truncates (brings down) the decimal, rounding use:

        ```java
        Math.round(x);
        x--;
        ```

### Logical Operators
* || - or
* == - is equal to
* != - is not 
* && - and
* One expression at a time: If the first one doesn't satisfy the condition, it doesn't evaluate the second.
