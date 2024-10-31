public class AgeVerification {
        public static void main(String[] args) {
            int age = Integer.parseInt(args[0]);
            System.out.println("vous avez passé en argument "+age );
            if (age >= 18) {
            System.out.println("Vous êtes majeur.");
            } 
            else {
            System.out.println("Vous êtes mineur.");
            }
        }
}
