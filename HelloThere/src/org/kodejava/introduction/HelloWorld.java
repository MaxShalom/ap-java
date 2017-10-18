package org.kodejava.introduction;

public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        HelloWorld hello = new HelloWorld();

        String name = "world";
        /* Enter name below to see your name in the output. */
        hello.setName("There");
        hello.sayHello();
    }

    private void sayHello() {
        System.out.println("Hello " + getName() + "!");
    }
}
