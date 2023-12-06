public class App {
    public static void main(String[] args) throws Exception {

        Cachorro c = new Cachorro();
        Gato g = new Gato();

        c.setNome("Milo");
        g.setNome("Luna");

        System.out.println("Meu nome é " + c.getNome() + " eu sou um cachorro");
        System.out.println("Meu nome é " + g.getNome() + " eu sou um gato");

        c.mostrar();
        g.mostrar();







    }
}
