package exercise_2_Animal;

public enum Animals {
                    CAT(4),
                    DOG(10),
                    HORSE(7);
    private int age;

    Animals(int agePar){this.age=agePar;}

    @Override
    public String toString() {return super.toString()+", вік "+age;
    }

}

class Main{
    public static void main(String[] args) {
        System.out.println(Animals.CAT);
        System.out.println(Animals.DOG);
        System.out.println(Animals.HORSE);
    }
}
