---
layout: page 
title:  Strings Redefined
--- 


### Primitive v. Class Data Types

#### Primitive

- Holds only one piece of data at a time
- Example: int and double

#### Class

- Holds more than one piece of data at a time
- Can hold data of different types
- Has built in methods



### How are variables stored in memory?

#### Primitive Types

- The variable holds the actual value.

  ```java
  int num1 = 17;
  ```

#### Class Types

- The variable holds the memory location of the actual data - refers to it

  ```java
  String word1 = "Hello";
  ```



### What if there is no reference?

```java
String word;
```

- What does word hold?
- null - special value that means "no reference."



### Garbage Collection

```java
String alpha = "The final frontier";
alpha = null;
```

- What happens to "The final frontier"?
- It is **Garbage Collected.**
- Java goes through and "cleans up" any unmatched values in memory.



### So why can't I use ==?

```java
String a = "Howdy";
String b = "Howdy";
```

- The == tests the value stored directly in a and b.
- These are two different memory locations
- Prove the point:

```java
if (a.equals(b));
if (a.substring(int));
if (a.substring(int, int));
```

