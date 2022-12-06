public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();



    }

    public static void task1() {
        System.out.println("Задача 1!");
        int age = 17;
        if (age >= 18) {
            System.out.println("Человеку  больше или ровно 18 лет!");
        } else {
            System.out.println("Человек не достиг совершеннолетия!");
        }
    }

    public static void task2() {
        System.out.println("Задача 2!");
        int degrees = 8;
        if (degrees < 5) {
            System.out.println("Температура " + degrees + " градусов " + " на улице холодно , нужно надеть шапку! ");
        }
        if (degrees > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача3!");
        int speed = 20;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф! ");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно!");
        }
    }

    public static void task4() {
        System.out.println("Задача 4!");
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад!");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу!");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " ,то его место в университете!");
        }
        if (age > 24) {
            System.out.println("Если возраст человека больше чем " + age + " ,то ему пора ходить на работу!");
        }
    }

    public static void task5() {
        System.out.println("Задача 5!");
        int age =16;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на актрационе");
        } else {
            System.out.println("Можно кататься!");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Можно кататься только в сопровождении взрослого!");
        } else {
            System.out.println("Кататься нельзя если нет взрослого!");
        }
        if (age>14){
            System.out.println("Можно кататься без сопровождения !");
        }else{
            System.out.println("Нельзя кататься без сопровождения!");
        }
    }
    public static void task6() {
        System.out.println("Задача 6!");
        int capacity = 102;
        int seats = 60;
        int standingPlaces  = 49;
        boolean a = (seats+standingPlaces)<=102;
        boolean b = (seats+standingPlaces)>102;
        if (capacity <= 102 && a){
            System.out.println("Места свободные есть!");
        }if (capacity <= 102 && a && seats <= 59 ){
            System.out.println("Ваше место сидячее!");
        }if (capacity <= 102 && a && seats <= 60 && standingPlaces <= 42){
            System.out.println("Ваше место стоячее");
        }else if (capacity>=102&&b){
            System.out.println("Мест свободных нет!");
        }
    }

    public static void task7() {
        System.out.println("Задача 7!");
        int one=36;
        int two=399;
        int three=3234;
        if (one>two && one>three) {
            System.out.println(one + " Самое большое число среди 3-х!");
        }else if (two>one && two>three){
            System.out.println(two + " самое большое число!");
        }else {
            System.out.println(three + " Самое большое число!");
        }

    }
}

