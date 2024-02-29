import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Code = new Scanner(System.in);
        boolean Pilihan = false;


        while (!Pilihan) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = Code.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String studentNIM = Code.next();
                    if (studentNIM.length() == 15) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    String pengguna = Code.next();
                    System.out.print("Enter your password (admin): ");
                    String katasandi = Code.next();
                    if (pengguna.equals("abimanyu") && katasandi.equals("abimanyu")) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    Pilihan = true;
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again");
            }
        }

        Code.close();
    }
}