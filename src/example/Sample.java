package example;

public class Sample {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("poppy");
//        System.out.println("dog = " + dog.name);
//
//        dog.sleep();
//
//        //HouseDog
//        HouseDog houseDog = new HouseDog();
//        houseDog.setName("happy");
//        houseDog.sleep();
//        houseDog.sleep(3);

//        HouseDog happy = new HouseDog("happy");
//        HouseDog yorkshire = new HouseDog(1);
//        System.out.println(happy.name);
//        System.out.println(yorkshire.name);
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
