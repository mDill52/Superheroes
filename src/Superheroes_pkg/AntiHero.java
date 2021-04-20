package Superheroes_pkg;

public class AntiHero extends Superhero {
    private String name;
    private String abilities;
    private String originCity;

    public AntiHero(String na, String ab, String oc) {
        name = na;
        abilities = ab;
        originCity = oc;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAbilities() {
        return this.abilities;
    }

    @Override
    public String getOriginCity() {
        return this.originCity;

    }

    public void catchphrase()
    {
        System.out.println("We are Lethal Protectors of the innocent!! Maximum Effort!!");
    }
}
