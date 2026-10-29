public class Qualification {
    public static void main(String[] args) {

        String[] students = {"Ana", "Luis", "Maria", "Pedro", "Sofia"};
        double[] qualifications = {18.5, 16.0, 19.2, 15.7, 18.5};

        double first = 0;
        double second = 0;
        double third = 0;
        String firstName = "";
        String secondName = "";
        String thirdName = "";

        for (int i = 0; i < qualifications.length; i++) {
            double grade = qualifications[i];

            if (grade > first) {
                third = second;
                thirdName = secondName;

                second = first;
                secondName = firstName;

                first = grade;
                firstName = students[i];
            }
            else if (grade > second) {
                third = second;
                thirdName = secondName;

                second = grade;
                secondName = students[i];
            }
            else if (grade > third) {
                third = grade;
                thirdName = students[i];
            }
        }

        System.out.println("The top 3 is:");
        System.out.println("1. " + firstName + " - " + first);
        System.out.println("2. " + secondName + " - " + second);
        System.out.println("3. " + thirdName + " - " + third);
    }
}

