package com.tugas.deploy.controller;

import com.tugas.deploy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private final String USERNAME = "admin";
    private final String PASSWORD = "20230140156";

    // 🔥 penyimpanan data sementara (tidak pakai database)
    private List<User> list = new ArrayList<>();

    // ================= LOGIN =================
    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            return "redirect:/home"; // 🔥 wajib redirect
        } else {
            model.addAttribute("error", "Username atau password salah");
            return "login";
        }
    }

    // ================= HOME =================
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("list", list); // kirim data ke view
        return "home";
    }

    // ================= FORM =================
    @GetMapping("/form")
    public String form() {
        return "form";
    }

    // ================= SUBMIT =================
    @PostMapping("/submit")
    public String submit(
            @RequestParam String nama,
            @RequestParam String nim,
            @RequestParam String jk
    ) {
        // 🔥 simpan ke list (temporary)
        list.add(new User(nama, nim, jk));

        return "redirect:/home"; // balik ke home
    }
}