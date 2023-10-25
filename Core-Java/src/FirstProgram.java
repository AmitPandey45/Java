package src;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Adding some more console printing");

         // Let's print the classloader name of current class.   
        //Application/System classloader will load this class  
        Class c = HelloWorld.class;  
        System.out.println(c.getClassLoader());  
        //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
        System.out.println(String.class.getClassLoader());  
    }
}