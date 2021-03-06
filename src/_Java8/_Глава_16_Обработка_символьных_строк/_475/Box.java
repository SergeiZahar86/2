package _Java8._Глава_16_Обработка_символьных_строк._475;

// Override toString() for Box class.
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() { // Переопределяем метод
        return "Dimensions are " + width + " by " +
                depth + " by " + height + ".";
    }
}

class toStringDemo {
    public static void main(String args[]) {
        Box b = new Box(10, 12, 14);
        String s = "Box b: " + b; // concatenate Box object

        System.out.println(b); // convert Box toString
        System.out.println(s);
    }
}
