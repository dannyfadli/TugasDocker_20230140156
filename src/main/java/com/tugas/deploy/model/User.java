package com.tugas.deploy.model;

public class User {
    private String nama;
    private String nim;
    private String jk;

    // Constructor kosong
    public User() {
    }

    // Constructor dengan parameter
    public User(String nama, String nim, String jk) {
        this.nama = nama;
        this.nim = nim;
        this.jk = jk;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
}