package homework_9.refarcoringHW6;

public class Wild extends GroundAnimal implements Hunt{

    protected boolean isPredator;

    @Override
    public String makeVoice() {
        return ("Hello... I'm ");
    }

    @Override
    public void hunt() {
        if (isPredator) {
            System.out.println("For eating I'm hunting");
        } else {
            System.out.println("For eating I'm searching for trees");
        }
    }

    public void hungry() {
        if (isPredator) {
            System.out.println("I'm angry and want some meat.");
        } else {
            System.out.println("I'm eating grass or leaves.");
        }
        hunt();
    }

    static class Wolf extends Wild{

        public Wolf(int id, int age, int weight, boolean predator, String colours) {
            this.id=id;
            this.age=age;
            this.weight=weight;
            this.isPredator=predator;
            this.colour=colours;
        }

        @Override
        public String toString() {
            return "Wolf{" +
                    "id=" + id +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", colour='" + colour + '\'' +
                    '}';
        }

        @Override
        public String makeVoice() {
            return (super.makeVoice()
                    .concat("Wolf"));
        }
        @Override
        public void sound() {
            System.out.println("Wo-oo-o-o-o-w.");
        }

        @Override
        public String swim() {
            System.out.println("I can swim if it's need to");
            return null;
        }
    }

    static class Giraffe extends Wild{

        public Giraffe(int id, int age, int weight, boolean predator, String colours) {
            this.id=id;
            this.age=age;
            this.weight=weight;
            this.isPredator=predator;
            this.colour=colours;
        }

        @Override
        public String toString() {
            return "Giraffe{" +
                    "id=" + id +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", colour='" + colour + '\'' +
                    '}';
        }

        @Override
        public String makeVoice() {
            return (super.makeVoice()
                    .concat("Giraffe"));
        }
        @Override
        public void sound() {
            System.out.println("Hzo-o-o-o-w.");
        }

        @Override
        public String swim() {
            System.out.println("I cannot swim:( I'm drowning");
            return null;
        }
    }
}
