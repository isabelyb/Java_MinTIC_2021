public class Example1 {
    public static void main(String[] args) throws Exception {
        var name = "Pepe Mojica";

        var result = greeting(name);
    
        System.out.println(result);
    }

    public static String greeting(String name){
        return "Hola, " + name + "!";
    }
}
