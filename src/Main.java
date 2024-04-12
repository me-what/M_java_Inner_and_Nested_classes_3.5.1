public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom", "qwerty");
        tom.displayPerson();
        tom.account.displayAccount();
        System.out.println();

        // Person_2
        Person_2 bob = new Person_2("Bob");
        bob.setAccount("qwerty");
        System.out.println();

        // factorial
        Math.Factorial fact = Math.getFactorial(6);
        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getResult());
    }
}