**Nama: Prakasa Wira Mukti**

**Nim: 2409116054**

**Tema: Manajemen Daftar Harga Komponen Komputer**

---

# Deskripsi Program

Program ini dibuat untuk orang orang seperti pemilik toko komputer, teknisi, atau orang orang yang ingin merakit komputer untuk mencatat harga dari komponen yang ingin mereka beli, sehingga mereka bisa mempertimbangkan terlebih dahulu sebelum membeli. Disini pengguna dapat menambahkan komponen baru beserta harganya, melihat daftar komponen yang sudah tersimpan, memperbarui data komponen, serta menghapus data komponen yang tidak diperlukan.

---

# Penjelasan Alur Program

**1. Inisialisasi Data**

Disini saya menggunakan import java.util.ArrayList; untuk menyimpan data dan import java.util.Scanner; untuk input.

namakomponen menyimpan nama komponen komputer.
hargakomponen menyimpan harga dari masing-masing komponen.
Scanner (input) digunakan untuk membaca data dari pengguna.

Kode ini berfungsi untuk menyiapkan struktur data (ArrayList) dan input (Scanner).
Variabel pilihan digunakan untuk menampung menu yang dipilih.

<img width="365" height="134" alt="image" src="https://github.com/user-attachments/assets/d7e4aa3e-6c57-4eee-a172-0ac75ed4406b" />


**2. Perulangan Menu Utama**

Program menggunakan do-while loop, sehingga menu akan selalu ditampilkan berulang kali sampai pengguna memilih opsi keluar.
Menu utama terdiri dari 6 pilihan:

- Buat List Komponen

- Lihat List Komponen

- Update List Komponen

- Hapus List Komponen

- Hitung Total Harga Komponen

- Keluar

Jika pengguna memasukkan angka di luar 1–6, maka akan tampil pesan "Pilihan tidak valid".

<img width="406" height="167" alt="image" src="https://github.com/user-attachments/assets/e7f92a88-2211-44c5-9eb1-6be12b41a08a" />


<img width="178" height="31" alt="image" src="https://github.com/user-attachments/assets/82a336ac-7c8f-49a4-9a0f-dc2e05d9db6e" />

**3. Pilihan Menu (switch-case)**

Case 1: Buat List Komponen

Disini User diminta memasukkan nama dan harga komponen.
Data disimpan ke dalam dua ArrayList (namakomponen dan hargakomponen).

Program menampilkan pesan: "Komponen berhasil ditambahkan".

<img width="370" height="154" alt="image" src="https://github.com/user-attachments/assets/cf765d0c-5ea4-4054-bcea-49ad78314385" />


Case 2: Lihat List Komponen

Jika daftar kosong nanti tampil pesan "Kosong".

Kalau ada isi datanya, program akan menampilkan daftar semua komponen yang sudah tersimpan, dalam format:

[Nomor]. NamaKomponen | Harga: RpHarga

Harga ditampilkan dengan format ribuan (String.format("%,.2f", harga)).

<img width="514" height="155" alt="image" src="https://github.com/user-attachments/assets/1baf83f2-5979-4942-8ef5-4de4c38f2f31" />


Case 3: Update List Komponen

User diminta memasukkan nomor indeks komponen yang ingin diubah.
Jika nomo valid: User diminta memasukkan nama baru dan harga baru,
Data lama diganti dengan data baru pada indeks tersebut,
Tampil pesan: "Komponen berhasil diupdate".

Jika nomor tidak valid akan tampil notif "Nomor tidak valid.".

<img width="431" height="260" alt="image" src="https://github.com/user-attachments/assets/bddc2414-5603-4a4d-8087-206fe76ae9a7" />

Case 4: Hapus List Komponen

User diminta memasukkan nomor indeks komponen yang ingin dihapus.

Jika nomor valid:
Data nama dan harga pada indeks tersebut dihapus dari ArrayList,
Tampil pesan: "Komponen berhasil dihapus",

Jika nomor tidak valid nanti akan tampil "Nomor tidak valid.".

<img width="439" height="169" alt="image" src="https://github.com/user-attachments/assets/5ddebcab-1211-4de9-bea9-1dc3cfa00857" />

Case 5: Hitung Total Harga Komponen

Program menjumlahkan semua nilai dalam hargakomponen.

Hasil ditampilkan dalam format:
Total harga semua komponen: RpX,XXX.XX

<img width="545" height="104" alt="image" src="https://github.com/user-attachments/assets/480d6ce8-d459-4685-8fcc-db12cb508468" />

Case 6: Keluar

Program menampilkan pesan: "Babay"

Looping berhenti karena kondisi pilihan != 6 tidak terpenuhi.

<img width="257" height="50" alt="image" src="https://github.com/user-attachments/assets/08d42f1d-a636-4732-80aa-2ea35896a2f1" />

**4. Default**

Kalau user memasukkan angka selain 1, 2, 3, 4, 5, 6, maka blok default akan dijalankan.

Program akan menampilkan pesan:
"Pilihan tidak valid"

Setelah itu, program kembali ke menu utama karena masih berada di dalam perulangan do-while.

<img width="291" height="42" alt="image" src="https://github.com/user-attachments/assets/ec2a91a0-b67a-409f-aa9a-b55152c7727e" />

**5. Output**

-Menu

<img width="217" height="103" alt="image" src="https://github.com/user-attachments/assets/a197447b-9b19-4d20-bad4-e033c785a586" />

- Opsi 1

<img width="209" height="140" alt="image" src="https://github.com/user-attachments/assets/ab54f7d3-8191-4e89-9c1d-13f40d7f4eeb" />

- Opsi 2

<img width="228" height="130" alt="image" src="https://github.com/user-attachments/assets/b126d715-f616-4475-9002-452ea26f6261" />

- Opsi 3

<img width="266" height="281" alt="image" src="https://github.com/user-attachments/assets/98319ede-ee36-495b-b472-df822ecfa804" />

- Opsi 4

  <img width="253" height="253" alt="image" src="https://github.com/user-attachments/assets/bc6992d2-5338-404a-aa25-ab3e07b6f6b2" />

- Opsi 5

  <img width="253" height="295" alt="image" src="https://github.com/user-attachments/assets/238e833d-01a3-4ce6-86c2-98798df3e6fc" />

- Opsi 6

  <img width="217" height="186" alt="image" src="https://github.com/user-attachments/assets/dcbe56cd-f9bb-4a44-b732-ffae84fa7697" />

- Default

  <img width="215" height="119" alt="image" src="https://github.com/user-attachments/assets/5c463fd6-4804-4883-bda2-aed12cf62d06" />

  
