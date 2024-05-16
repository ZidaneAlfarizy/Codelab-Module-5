import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (true) {
            System.out.print("Masukkan nama mahasiswa ke-" + i + ": ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            if (input.trim().isEmpty()) {
                try {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    continue;
                }
            }

            mahasiswaList.add(input);
            i++;
        }

        System.out.println("Daftar nama mahasiswa:");
        for (String nama : mahasiswaList) {
            System.out.println(nama);
        }
    }
}