package Superheroes_pkg;

public class HeroFactory {
    public static void main(String[] args) {
        // Creates objects
        HeroCreator hero = new HeroCreator();
        Superhero pro = hero.getHero("ProHero", "Captain IceStorm", "Ice Powers", "Springle City");
        Superhero rookie = hero.getHero("RookieHero","Tech Wizard", "Technology Control and Super Genius", "Qwerty City");
        Superhero sidekick = hero.getHero("SideKick", "DragonStrike" , "Martial Arts and Stone Skin", "Sakura City");
        Superhero kid = hero.getHero("KidHero", "Torchlight", "Fire Powers", "Pallet Town");
        Superhero antihero = hero.getHero("AntiHero", "StrongJaw", "ShapeShifting", "FinnHaven");

        // Prints hero details and catchphrase
        System.out.println(pro);
        pro.catchphrase();

        System.out.println(rookie);
        rookie.catchphrase();

        System.out.println(sidekick);
        sidekick.catchphrase();

        System.out.println(kid);
        kid.catchphrase();

        System.out.println(antihero);
        antihero.catchphrase();
    }
}