# Basic Java 1-7



### Printing in Java

* System.out.print(x); prints x to the console
* System.out.println(x); prints x and starts a new line in the console after
  * Useful if you want to view results easier
* Escape characters:
  * “\n” makes the rest of the output go on a new line
    * System.out.print(x + “\n”) is the same as System.out.println(x)
  * “\t” makes a tab
  * “\\” makes a \, “\’” makes a ‘, “\”” makes a “

### Variables

* Items that hold stuff

* Rules for naming variables:

* -  All variable names must begin with a letter of the alphabet, an underscore, or ( _ ), or a dollar sign ($).  

  -  After the first letter, variable names can also contain letters and the digits 0 to 9.  No spaces or special characters. 

  -  You cannot use a java keyword

  -  - Ex: boolean if = true; 


### User Input

```java
    import java.util.Scanner
    
    Scanner scan = new scanner(System.in);
    int x = scan.nextInt();
```


* x is now equal to whatever the user inputted into the console
* Works with all data types, just change scan.nextInt to scan.nextDouble or scan.nextChar based on what data type you are accepting

### Arithmetic Expression
* "+" - Add
* "-" - Subtract
* "*" - Multiply
* "/" - Divide
* "%" - Mod


* If you mix integers and reals in an operation, the result is a real. For example, 3*5.0 is 15.0, not 15.
* You can assign an integer value to a real variable. For example, double x=5 sets x to 5.0.
* You cannot assign a real value to an integer variable. For example, both int i=5.8 and int i=5.0 are illegal. This is to protect you from accidentally losing the fractional part. **However**, if you use a cast to reassure Java that you really mean it, then it's legal. For example, int i=(int)5.8 is legal,and gives i the value 5. 

### Casting
* Upcasting 
    * If you want to raise a value up to a larger data type, that is always allowed.
    * Example:

        ```java
        double x = 33;
        ```

* Downcasting
    * Bringing something to a lower data type is harder, you need to declare the cast explicitly
    * this always truncates (brings down) the decimal, rounding use:

        ```java
        Math.round(x);
        x--;
        ```

### Booleans

[![Image result for light switch](https://tse2.mm.bing.net/th?id=OIP.2FTSwITmPXfIOCl8ztQHBQC5Es&w=124&h=201&c=7&qlt=90&o=4&dpr=1.75&pid=1.7)](https://www.bing.com/images/search?view=detailV2&ccid=2FTSwITm&id=E8047A96E6C68AFC2FFF3957772266272B4F34A7&thid=OIP.2FTSwITmPXfIOCl8ztQHBQC5Es&mediaurl=http%3a%2f%2fwww.electrical-online.com%2fwp-content%2fuploads%2f2010%2f09%2flight-switch.jpg&exph=1000&expw=618&q=light+switch&simid=608056187169932196&selectedIndex=2&adlt=strict)

* A boolean is a light switch.
* it can either be true or false.
* These translate to...
  * On or off 

    or...

  * 1 or 0

### Logical Operators

* "||" - or
* "==" - is equal to
* "!=" - is not equal (! = is not, can be applied to more things)
* "&&" - and
* One expression at a time: If the first one doesn't satisfy the condition, it doesn't evaluate the second.

### Random CS Fact

* The first “bug” was actually a moth in someone's computer!
