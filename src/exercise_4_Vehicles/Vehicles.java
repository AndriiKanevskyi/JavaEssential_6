package exercise_4_Vehicles;
/*
Завдання 4

Створіть проект за допомогою IntelliJ IDEA.
 Створіть перечислювальний тип (enum) Vehicles, що містить конструктор,
 який повинен набувати цілого числа (вартість автомобіля), містити метод getColor(),
 який повертає рядок з кольором автомобіля, і містити перевантажений метод toString(),
 який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.
 */
public enum Vehicles {
                    BMW(25000,"Black"),
                    AUDI(30000,"Green"),
                    VW(17000,"Grey");

    int price;
    String color;

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Марка: "+ super.toString()+ ", Колір: "+getColor()+", ціна: "+price;
    }

    Vehicles(int parPrice, String parColor){
        this.price=parPrice;
        this.color=parColor;
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(Vehicles.VW);
        System.out.println(Vehicles.BMW);
        System.out.println(Vehicles.AUDI);
    }
}
