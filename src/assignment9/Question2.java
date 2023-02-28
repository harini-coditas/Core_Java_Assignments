package assignment9;

abstract class Instrument{
    public abstract void play();

}
class Piano extends Instrument{

    @Override
    public void play() {

        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument{

    @Override
    public void play() {

        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument{

    @Override
    public void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Instrument[] instrument = new Instrument[10];
        for(int i=0; i<3 ;i++){
            instrument[i] = new Piano();
        }
        for(int i=3; i<6 ;i++){
            instrument[i] = new Flute();
        }
        for(int i=6; i<10 ;i++){
            instrument[i] = new Guitar();
        }
        for(int i=0; i<10 ;i++){
            instrument[i].play();
        }

    }
}

/*
Piano is playing tan tan tan tan
Piano is playing tan tan tan tan
Piano is playing tan tan tan tan
Flute is playing toot toot toot toot
Flute is playing toot toot toot toot
Flute is playing toot toot toot toot
Guitar is playing tin tin tin
Guitar is playing tin tin tin
Guitar is playing tin tin tin
Guitar is playing tin tin tin
 */