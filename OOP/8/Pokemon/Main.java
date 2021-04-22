// Richard Rivaldo 13519185

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Section 1 ---");
        GhostPokemon gp1 = new GhostPokemon();
        FightingPokemon fp1 = new FightingPokemon();
        NormalPokemon np1 = new NormalPokemon();
        Pokemon p1 = new Pokemon();
        System.out.println(gp1.getName());
        System.out.println(fp1.getName());
        System.out.println(np1.getName());
        System.out.println(p1.getName());

        GhostPokemon gp2 = new GhostPokemon("Gastly");
        FightingPokemon fp2 = new FightingPokemon("Machop");
        NormalPokemon np2 = new NormalPokemon("Rattata");
        Pokemon p2 = new Pokemon("Big Boss");
        System.out.println(gp2.getName());
        System.out.println(fp2.getName());
        System.out.println(np2.getName());
        System.out.println(p2.getName());

        gp2.displayClass();
        fp2.displayClass();
        np2.displayClass();
        p2.displayClass();
        gp2.setUniqueID("G1");
        System.out.println(gp2.getUniqueID());
        fp2.setUniqueID(12);
        System.out.println(fp2.getUniqueID());

        System.out.println("--- Section 2 ---");
        gp2.checkElement();
        fp2.checkElement();
        np2.checkElement();
        gp2.specialSkill();
        fp2.displayAura();
        gp2.displayAura();
        fp2.specialSkill();

        System.out.println("--- Section 3 ---");
        PokemonAction Gastly = new PokemonAction(gp2);
        Gastly.displayPokemonClass();
        PokemonAction Rattata = new PokemonAction(np2);
        Rattata.displayPokemonClass();
        System.out.println("Gastly vs Rattata");
        for(int i = 0; i < 7; i++){
            Gastly.attack();
            Rattata.defense();
        }
        for(int i = 0; i < 3; i++){
            Rattata.attack();
            Gastly.defense();
        }
        Rattata.useSkill();
        Gastly.useSkill();
        Rattata.run();

        System.out.println("--- Section 4 ---");
        System.out.println("New Battle Found");
        PokemonAction Machop = new PokemonAction(fp2);
        PokemonAction BigBoss = new PokemonAction(p2);
        Machop.displayPokemonClass();
        BigBoss.displayPokemonClass();
        System.out.println("Big Boss vs Machop");
        for(int i = 0; i < 4; i++){
            Machop.attack();
            BigBoss.defense();
        }
        for(int i = 0; i < 8; i++){
            BigBoss.attack();
            Machop.defense();
        }
        Machop.useSkill();
        BigBoss.useSkill();
        Machop.run();
        System.out.println("All Battle Finished");
    }
}