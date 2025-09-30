package application;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Bichano");

        //System.out.println(gato.getNome());
        //System.out.println(gato.comunicar());
    

    Animal[] animais = new Animal[4];
    animais[0] = gato;
    animais[1] = new Cachorro("Totó");
    animais[2] = new Cachorro("Snoopy");
    animais[3] = new Cachorro("Malhado");

    for(Animal a : animais) {
        System.out.println(a);
    }
}

