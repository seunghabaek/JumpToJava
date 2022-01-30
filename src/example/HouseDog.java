package example;

public class HouseDog extends Dog {

    public HouseDog(String name) {
        this.setName(name);
    }

    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    //method overriding
    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

