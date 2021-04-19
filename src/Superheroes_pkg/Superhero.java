package Superheroes_pkg;

public abstract class Superhero {
    // abstract methods to be implemented in subclasses
    public abstract String getName();
    public abstract String getAbilities();
    public abstract String getOriginCity();
    public abstract void catchphrase();

    @Override
    public String toString() {
        return "Name: "+this.getName() + ", Abilities: "+this.getAbilities()+", Home City: "+this.getOriginCity();
    }
}


