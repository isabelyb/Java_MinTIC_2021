public class Example1 {
    public static void main(String[] args) throws Exception {
        var name = "Pepe Mojica";

        var result = greeting(name);  //declarando una variable que llama a una función
    
        System.out.println(result);
    }

    public static String greeting(String name){
        return "Hola, " + name + "!";
    }
}
