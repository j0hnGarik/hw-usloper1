public class Main {
    public static void main(String... args) {
        System.out.println("задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else{
                System.out.println("Если возраст человека равен " + age + " то он несовершеннолетний");
            }
        System.out.println("задача 2");
        int t = 10;
        if (t < 5) {
        System.out.println("На улице " + t + " градуса, нужно надеть шапку");
        } else{
            System.out.println("На улице " + t + " градусов, шапка не нужна");
        }
        System.out.println("задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("eсли скорость " + speed + " то, придется заплатить штраф" );
        } else{
            System.out.println("если скорость " + speed + " то, можно ездить спокойно");
        }
        System.out.println("задача 4");
        int a = 17;
        if (a >= 2 && a <= 6) {
            System.out.println("если возраст человека равен " + a + " то ему нужно ходить в детский сад");
        }
        if (a >= 7 && a <= 17) {
            System.out.println("ecли возраст человека равен " + a + " то ему нужно ходить в школу");
        }
        if (a >= 18 && a <= 24) {
            System.out.println("если возраст человека равен " + a + " то ему надо ходить в университет");
        }
        if (a > 24) {
            System.out.println("если возраст человека равен " + a + " то ему надо ходить на работу");
        }
        System.out.println("задача 5");
        int childAge = 5;
        if (childAge < 5) {
            System.out.println("если возраст ребенка равен " + childAge + " то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge >= 14) {
            System.out.println("если возраст ребенка равен " + childAge + "то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("задача 6");
        int passengers = 102;
        int carriegeCapacity = 102;
        int seating = 60;
        int stand = (carriegeCapacity - seating);
        if (passengers <= 60) {
            System.out.println("в вагоне есть сидячие места");
        }
        if (passengers > 60 && passengers < 102) {
            System.out.println("в вагоне есть стоячие места");
        } else {
            System.out.println("вагон уже полностью забит");
        }
        System.out.println("задача 7");
        int one = 5;
        int two = 7;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }
    }}

