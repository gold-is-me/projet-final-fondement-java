package combats;

import HERO.Hero;
import MONSTRES.Monstre;
import functions.UT;

public class combat {
    Hero hero;
    Monstre monstre;
    public combat(Hero hero, Monstre monstre) {
        this.hero = hero;
        this.monstre = monstre;
    }
    public void combat() {}

    public void attaquerMonstre(Hero attaquant, Monstre defenseur) {
        defenseur.lostPv(UT.dice4());
    }

    public void attaquerHero(Monstre attaquant, Hero defenseur) {

    }



    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Monstre getMonstre() {
        return monstre;
    }

    public void setMonstre(Monstre monstre) {
        this.monstre = monstre;
    }
}
