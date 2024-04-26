public class Main {
    public static void main(String[] args) {

        // Задача №1
        byte ageHuman = 19;
        byte legalAge = 18;
        if (ageHuman >= legalAge) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то он совершеннолетний.");
        }if (ageHuman < legalAge) {  // Как я понял провести условия через условного оператора if
            System.out.println("Если возраст человека равен " + ageHuman + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача №2
        byte airTemperature = 5;
        byte coldTemperature = 5;
        if (airTemperature < coldTemperature) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку.");
        }if (airTemperature >= coldTemperature) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки.");
        }

        // Задача №3
        short carSpeed = 125;
        short speedExceeded = 60;
        boolean overSpeed = carSpeed > speedExceeded;  // Решил попробовать булевые
        if (overSpeed) {
            System.out.println("Если скорость " + carSpeed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + carSpeed + " ,то можно ездить спокойно.");
        }

        // Задача №4
        byte personAge = 17;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge >= 7 && personAge <= 17) {   // я вмето нового if поставил else if  так на мой взгляд быстрее ( изучал в python похожее), НО ЕСЛИ СКАЖИТЕ ПЕРЕПИСАТЬ - Я ПЕРЕПИШУ
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то его место в университете.");
        } else if (personAge > 24) {     // просто else  тут не подойдет т.к. в personAge могут поставить 1 )))
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу.");
        }

        // Задача №5
        byte childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься без сопровождения взрослого.");
        }

        // Задача №6
        byte peopleCarriage = 102;
        byte capacityCarriage = 102;
        byte seating = 60;
        if (peopleCarriage < seating) {
            System.out.println("В вагоне есть сидячее место.");
        } else if (peopleCarriage >= seating && peopleCarriage < capacityCarriage) {
            System.out.println("В вагоне есть стоячее место.");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }

        // Задача №7
        int one;
        one = 1;
        int two;
        two = 2;
        int three;
        three = 3;

        if (one > two && one > three) {
            System.out.println(one + " самое большое число.");
        } else if (two > one && two > three) {
            System.out.println(two + " самое большое число.");
            //}  if (three > one && three > two) {
        } else {
            System.out.println(three + " самое большое число.");
        }


        // Надеюсь что я правельно понял

    }
}