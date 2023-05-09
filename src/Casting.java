public class Casting {
    public static void main(String[] args){
//        variable double equal to 112.35
        double decimal = 112.35;
        System.out.println("Double: " + decimal);
//        variable int = double variable
        int data = (int)decimal;
        System.out.println("int: " + data);
//        string variable equal to 49
        String number = "49";
        System.out.println("The string value is: " + number);
//        variable int = number.parseInt
        int num = Integer.parseInt(number);
        System.out.println("The integer value is: " + num);

    }
}
