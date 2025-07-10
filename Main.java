package main;


class Mammal {
    String reference = "https://kids.nationalgeographic.com/animals/mammals";

    String getInterestingFacts() {
        return "Mammals include humans and all other warm-blooded vertebrates with hair.";
    }
}

class BobCatExample extends Mammal {
    String reference = "https://kids.nationalgeographic.com/animals/mammals/facts/bobcat";

    @Override
    String getInterestingFacts() {
        return "The wild feline is about twice as big as a house cat—and a lot faster.";
    }
}

class Cheetah extends Mammal {
    String reference = "https://kids.nationalgeographic.com/animals/mammals/facts/cheetah";

    @Override
    String getInterestingFacts() {
        return "Fastest mammal on land, the cheetah can reach speeds of up to 60 mph.";
    }
}

class GiantPanda extends Mammal {
    String reference = "https://kids.nationalgeographic.com/animals/mammals/facts/giant-panda";

    @Override
    String getInterestingFacts() {
        return "Pandas eat fast, they eat a lot, and spend about 12 hours a day doing it.";
    }
}
public class Main {
	public static void main(String args[]) {
        BobCatExample myBobCat = new BobCatExample();
        System.out.println(myBobCat.getInterestingFacts());

        Cheetah myCheetah = new Cheetah();
        System.out.println(myCheetah.getInterestingFacts());

        GiantPanda myPanda = new GiantPanda();
        System.out.println(myPanda.getInterestingFacts());
    }
}
