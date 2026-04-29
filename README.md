/**
 * Wisxz-AI - Program Java Sederhana tentang Artificial Intelligence
 * Tugas KKA
 * 
 * Program ini mensimulasikan chatbot AI sederhana dengan nama "Wisxz-AI"
 */

import java.util.Scanner;

public class WisxzAI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====================================================");
        System.out.println("          🤖 Wisxz-AI  (Java Edition)               ");
        System.out.println("=====================================================");
        System.out.println("Halo! Saya adalah Wisxz-AI, asisten AI sederhana.");
        System.out.println("Ketik 'exit', 'keluar', atau 'bye' untuk mengakhiri.\n");

        while (true) {
            System.out.print("Anda: ");
            String input = scanner.nextLine().toLowerCase().trim();

            // Keluar dari program
            if (input.equals("exit") || input.equals("keluar") || input.equals("bye")) {
                System.out.println("Wisxz-AI: Sampai jumpa! Semoga harimu menyenangkan! 👋");
                break;
            }

            // Logika respon AI
            String response = getResponse(input);
            System.out.println("Wisxz-AI : " + response);
        }

        scanner.close();
    }

    // Method untuk menentukan respon AI
    public static String getResponse(String input) {
        if (input.contains("nama") || input.contains("siapa kamu")) {
            return "Nama saya Wisxz-AI. Senang bertemu denganmu!";
        }
        else if (input.contains("apa kabar") || input.contains("how are you")) {
            return "Saya dalam kondisi baik! Bagaimana kabar kamu hari ini?";
        }
        else if (input.contains("cuaca")) {
            return "Maaf ya, saya belum bisa cek cuaca real-time. Tapi semoga cuacanya mendukung aktivitasmu!";
        }
        else if (input.contains("makan") || input.contains("lapar")) {
            return "Kalau lapar, jangan ditahan! Makanlah yang enak, misalnya nasi kuning atau coto Makassar 🍲";
        }
        else if (input.contains("belajar") || input.contains("kuliah") || input.contains("tugas")) {
            return "Semangat belajarnya! Kalau ada yang sulit, tanya saja ke saya. Saya siap bantu!";
        }
        else if (input.contains("terima kasih") || input.contains("thanks") || input.contains("makasih")) {
            return "Sama-sama! Senang bisa membantu kamu 😊";
        }
        else if (input.contains("siapa") && input.contains("buat")) {
            return "Saya dibuat oleh kamu menggunakan Java untuk tugas KKA.";
        }
        else {
            return "Maaf, saya belum paham maksudmu. Bisa dijelaskan lebih detail?";
        }
    }
}
