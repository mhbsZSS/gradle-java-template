package application;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override
    public String comunicar () {
        return "Au, au";
    }
}
