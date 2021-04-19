package Superheroes_pkg;

public class HeroCreator {
    public Superhero getHero(String HeroType, String na, String ab, String oc)
    {
        // Create object here
        if(HeroType.equalsIgnoreCase("ProHero"))
            return new ProHero(na,ab,oc);
        else if(HeroType.equalsIgnoreCase("RookieHero"))
            return new RookieHero(na,ab,oc);
        else if(HeroType.equalsIgnoreCase("SideKick"))
            return new SideKick(na,ab,oc);
        else if(HeroType.equalsIgnoreCase("KidHero"))
            return new KidHero(na,ab,oc);
        else if(HeroType.equalsIgnoreCase("AntiHero"))
            return new AntiHero(na,ab,oc);
        else
            return null;
    }
}