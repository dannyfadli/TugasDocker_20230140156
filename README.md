# Laporan Praktikum: Implementasi Docker - Web Data Mahasiswa

Proyek ini merupakan implementasi kontainerisasi menggunakan Docker untuk aplikasi berbasis Java Spring Boot. Proyek mencakup proses build image, push ke Docker Hub, serta penggunaan image dari rekan tim untuk dijalankan di lingkungan lokal.

---

## 1. Docker Hub & Images
Bagian ini menampilkan daftar image yang telah berhasil di-push ke Docker Hub pribadi dan image yang telah di-pull dari repositori rekan tim.

| Deskripsi | Screenshot |
|-----------|------------|
| **Halaman Image Docker Desktop** | ![Docker Images](<img width="1209" height="667" alt="Cuplikan layar 2026-04-14 105137" src="https://github.com/user-attachments/assets/7bbf1a26-2833-4cf8-8d8e-187c2f123d79" />
) |

---

## 2. Docker Containers
Menampilkan status kontainer yang sedang berjalan di Docker Desktop, termasuk kontainer yang dibuat dari image rekan tim.

| Deskripsi | Screenshot |
|-----------|------------|
| **Halaman Container Docker Desktop** | ![Docker Containers](<img width="1355" height="646" alt="Cuplikan layar 2026-04-14 105610" src="https://github.com/user-attachments/assets/1914a11d-de83-42e8-b62b-55d21117da8e" />
) |

---

## 3. Dokumentasi Aplikasi Pribadi (Local Run)
Berikut adalah fungsionalitas aplikasi yang dijalankan melalui kontainer Docker pribadi.

### • Halaman Login
![Login Page](<img width="600" height="455" alt="Cuplikan layar 2026-04-14 110049" src="https://github.com/user-attachments/assets/e064b07d-a894-49f6-b999-17362f5b57dc" />
)

### • Halaman Home (Data Kosong)
![Home Page](<img width="1911" height="874" alt="Cuplikan layar 2026-04-14 110440" src="https://github.com/user-attachments/assets/f55dde9c-e937-4856-ad75-11f34ed9ac03" />
)

### • Halaman Form Input
![Form Input](<img width="1898" height="878" alt="Cuplikan layar 2026-04-14 110513" src="https://github.com/user-attachments/assets/1949ec6f-1caa-437a-bde3-e20ee86712a0" />
)

### • Halaman Home Setelah Input
![Home After Input](<img width="1894" height="849" alt="Cuplikan layar 2026-04-14 110523" src="https://github.com/user-attachments/assets/cb343a50-79a0-452f-99f1-556bace9252b" />
)

---

## 4. Dokumentasi Aplikasi Rekan (Pulled Image)
Berikut adalah fungsionalitas aplikasi milik rekan tim yang dijalankan melalui Docker di lingkungan lokal saya.

### • Halaman Login Rekan
![Login Rekan](<img width="924" height="886" alt="Cuplikan layar 2026-04-14 105826" src="https://github.com/user-attachments/assets/8d8826d0-fb73-4898-9c4f-ecf65712851d" />
) 

### • Halaman Home Rekan
![Home Rekan](<img width="894" height="351" alt="Cuplikan layar 2026-04-14 105913" src="https://github.com/user-attachments/assets/c454b750-adff-4e65-9c9e-e1f905efe274" />
)

### • Halaman Form Input Rekan
![Form Input Rekan](<img width="726" height="431" alt="Cuplikan layar 2026-04-14 105941" src="https://github.com/user-attachments/assets/29a9dca2-acb1-4e5f-83ae-0a94dc2e662c" />
)

### • Halaman Home Rekan Setelah Input
![Home Rekan After Input](<img width="832" height="373" alt="Cuplikan layar 2026-04-14 105956" src="https://github.com/user-attachments/assets/160446ca-6b40-42aa-9225-b5cc139b7313" />
)

---

**Catatan:**
- Pastikan semua file gambar berada dalam satu folder yang sama dengan `README.md` atau sesuaikan path gambarnya.
- Aplikasi berjalan pada port default yang telah ditentukan dalam Dockerfile.
