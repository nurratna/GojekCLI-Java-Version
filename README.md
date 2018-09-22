# Order Ojek - Java CLI

## Flow Utama

### Step 1 - Registrasi

Ketika pertama kali dibuka, aplikasi akan meminta pengguna memasukkan informasi:
- Nama
- Email
- Nomor HP
- Password
- Saldo : 0 **(otomatis tersimpan tanpa harus diinput)**

Setelah diinput, aplikasi akan menyimpan data-data tersebut ke dalam file `user.txt`.

    Catatan: Apabila aplikasi dibuka untuk kedua kali-nya dan file `user.txt` sudah ada, maka langsung ke step 2.
    
    
### Step 2 - Login

Setelah selesai input data awal, aplikasi akan menampilkan halaman login dengan input:
- Email/Nomor HP
- Password

Jika berhasil, user akan masuk ke aplikasi (masuk step 3).  
Jika gagal, aplikasi menampilkan kembali halaman login dengan pesan:
"Kombinasi Email/Nomor HP dan Password yang Anda masukkan salah".

### Step 3 - Menu Utama

Setelah berhasil login, aplikasi akan menampilkan menu:
- Lihat Profil
- Pesan Ojek
- Topup Saldo **(Bonus)**
- Lihat Riwayat Transaksi **(Bonus)**
- Keluar

### Step 4.1 - Lihat Profil

Jika pengguna memilih menu "Lihat Profil", aplikasi akan menampilkan:
- Profil yang tersimpan pada file "user.txt"
- Menu "Ubah Profil" **(Bonus)**
- Menu "Kembali ke Menu Utama"

Jika memilih menu "Ubah Profil", aplikasi akan meminta pengguna memasukkan informasi:
- Nama
- Email
- Nomor HP
- Password

Field yang diisi akan berubah informasinya pada `user.txt`.

`Catatan: pengguna tidak bisa mengubah saldo kecuali melakukan topup saldo`

### Step 4.2 - Pesan Gojek

Jika pengguna memilih menu Pesan Ojek, aplikasi akan meminta pengguna memasukkan informasi **(origin) lokasi saat ini**.

Kemudian aplikasi akan meminta pengguna memasukkan **(destination) lokasi tujuan**.

Aplikasi kemudian akan menghitung biaya yang harus dibayarkan dengan rumus: `jarak antar lokasi (float) * HARGA_PER_KM` hanya apabila **lokasi dilayani**.


``` Catatan
// Daftar lokasi yang bisa diinput beserta koordinatnya masing-masing tersimpan pada file "locations.txt".

// Jika lokasi Asal atau Tujuan tidak ada pada daftar lokasi ketika menghitung biaya, aplikasi menampilkan pesan "Belum melayani rute tersebut".

// jarak antar lokasi dapat dihitung dengan rumus: |(x2 - x1)| / |(y2 - y1)| dimana (x,y) adalah koordinat lokasi tersebut

// HARGA_PER_KM_MOTOR = 2000
// HARGA_PER_KM_MOBIL = 5000
```

Jika rute ditemukan maka aplikasi akan menyimpan setiap data transaksi ke file `orders.txt`. Data-data yang disimpan adalah sebagai berikut:
- Timestamp
- Layanan (Ojek Motor/Mobil)
- Asal
- Tujuan
- Biaya


## Flow Ekstra
### Step 4.2 - Order Ojek

Pengguna dapat memilih layanan `Ojek Motor` atau `Ojek Mobil` dan memilih metode pembayaran menggunakan `tunai` atau `saldo`.

### Step 4.3 - Topup Saldo

Terdapat menu baru untuk melakukan top-up saldo . Ketika memesan kendaraan, pengguna dapat memilih melakukan pembayaran dengan uang tunai atau `saldo`. Apabila dengan `saldo` maka saldo akan berkurang. Lengkapi juga dengan validasi apabila saldo tidak mencukupi.

### Step 4.4 - Lihat Riwayat Transaksi

Jika pengguna memilih menu "Lihat Riwayat Transaksi", aplikasi akan menampilkan daftar riwayat transaksi yang terdapat di file `orders.txt` ke layar.


## Kriteria penilaian

1. Aplikasi dibentuk dengan prinsip pemograman yang baik, ditandai dengan struktur yang baik seperti penamaan variabel, method, dll serta dapat dijelaskan dan diargumentasikan dengan baik ketika tahap demo.

2. Coding convention JAVA diterapkan dengan baik.

3. Nilai tambah:
- Mengerjakan flow ekstra
- Aplikasi mampu menangani aksi tidak terduga user


## Materi

Setiap materi **Java For Beginner** dapat dilihat di:
- [Introduction to Java](https://slides.com/nurratna/introduction-to-java/fullscreen)
- [Datatypes in Java](https://slides.com/nurratna/data-types-in-java/fullscreen)
- [String and Arrays](https://slides.com/nurratna/string-and-array/fullscreen)
- [Flow Control Statements](https://slides.com/nurratna/flow-control/fullscreen)
- [Looping and Iteration](https://slides.com/nurratna/looping-in-java/fullscreen)
- [I/O in Java](https://slides.com/nurratna/i-o-in-java/fullscreen)
- [Methods in Java](https://slides.com/nurratna/deck/fullscreen)
- [Exercise](https://slides.com/nurratna/exercise-java-programming/fullscreen)
