public class Qualification {
    public static void main(String[] args) {

        String[] students = {"Ana", "Luis", "Maria", "Pedro", "Sofia"};
        double[] qualifications = {18.5, 16.0, 19.2, 15.7, 18.5};

        double first = 0;
        double second = 0;
        double third = 0;

        for (double grade : qualifications) {
            if (grade > first) {
                third = second;
                second = first;
                first = grade;
            }
            else if (grade > second){
                third = second;
                second = grade;
            }
        }

        System.out.println("The top 3 is:");
        System.out.println("1. " + first);
        System.out.println("2. " + second);
        System.out.println("3. " + third);
    }
}

