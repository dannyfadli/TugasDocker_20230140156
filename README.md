# Laporan Praktikum: Implementasi Docker - Web Data Mahasiswa
![Status](https://img.shields.io/badge/Status-Completed-success)
![NIM](https://img.shields.io/badge/NIM-20230140156-blue)

Proyek ini merupakan implementasi kontainerisasi menggunakan Docker untuk aplikasi berbasis Java Spring Boot. Mencakup build image, push ke Docker Hub, dan penggunaan image rekan tim.

---

## 1. Docker Hub & Images
Daftar image lokal dan image yang ditarik dari repositori luar.

| Deskripsi | Screenshot |
|-----------|------------|
| **Daftar Image Terpasang** | <img width="1209" height="667" alt="Cuplikan layar 2026-04-14 105137" src="https://github.com/user-attachments/assets/7bbf1a26-2833-4cf8-8d8e-187c2f123d79" /> |

---

## 2. Docker Containers
Status kontainer aktif hasil dari konfigurasi image pribadi dan rekan.

| Deskripsi | Screenshot |
|-----------|------------|
| **Kontainer yang Berjalan** | <img width="1355" height="646" alt="Cuplikan layar 2026-04-14 105610" src="https://github.com/user-attachments/assets/1914a11d-de83-42e8-b62b-55d21117da8e" /> |

---

## 3. Dokumentasi Aplikasi Pribadi (Port: 8080)

<details>
<summary><b>Lihat Screenshot Alur Aplikasi</b></summary>

### • Halaman Login
<img width="600" src="https://github.com/user-attachments/assets/e064b07d-a894-49f6-b999-17362f5b57dc" />

### • Halaman Home
<img width="800" src="https://github.com/user-attachments/assets/f55dde9c-e937-4856-ad75-11f34ed9ac03" />

### • Form Input & Hasil
<img width="800" src="https://github.com/user-attachments/assets/1949ec6f-1caa-437a-bde3-e20ee86712a0" />
<img width="800" src="https://github.com/user-attachments/assets/cb343a50-79a0-452f-99f1-556bace9252b" />

</details>

---

## 4. Dokumentasi Aplikasi Rekan (Pulled Image)

<details>
<summary><b>Lihat Screenshot Aplikasi Rekan</b></summary>

### • Alur Login & Home Rekan
<img width="600" src="https://github.com/user-attachments/assets/8d8826d0-fb73-4898-9c4f-ecf65712851d" />
<img width="800" src="https://github.com/user-attachments/assets/c454b750-adff-4e65-9c9e-e1f905efe274" />

### • Form Input & Hasil Rekan
<img width="800" src="https://github.com/user-attachments/assets/29a9dca2-acb1-4e5f-83ae-0a94dc2e662c" />
<img width="800" src="https://github.com/user-attachments/assets/160446ca-6b40-42aa-9225-b5cc139b7313" />

</details>

---

**Catatan:**
- Container dijalankan dengan perintah `docker run -p 8080:8080 [nama_image]`.
- Pastikan koneksi internet stabil saat melakukan `pull` image dari rekan tim.
