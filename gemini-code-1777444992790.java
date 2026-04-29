package com.wisxz.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Wisxz-AI Application
 * Ini adalah file gabungan Application dan Controller untuk kemudahan.
 */
@SpringBootApplication
@Controller
public class WisxzAI {

    public static void main(String[] args) {
        // Menjalankan aplikasi Wisxz-AI
        SpringApplication.run(WisxzAI.class, args);
        System.out.println("Wisxz-AI sedang berjalan di http://localhost:8080");
    }

    @GetMapping("/")
    public String index(Model model) {
        // Data yang akan ditampilkan di website
        model.addAttribute("botName", "Wisxz-AI");
        model.addAttribute("status", "Sistem Aktif");
        model.addAttribute("repoLink", "https://github.com/Wisxz/Wisxz-AI");
        
        // Mengarahkan ke file index.html di folder resources/templates
        return "index";
    }
}