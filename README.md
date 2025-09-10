# PostTest1

Manajemen Daftar Harga Komponen Komputer

Deskripsi Program

Program ini dibuat untuk orang orang seperti pemilik toko komputer, teknisi, atau orang orang yang ingin merakit komputer untuk mencatat harga dari komponen yang ingin mereka beli, sehingga mereka bisa mempertimbangkan terlebih dahulu sebelum membeli. Disini pengguna dapat menambahkan komponen baru beserta harganya, melihat daftar komponen yang sudah tersimpan, memperbarui data komponen, serta menghapus data komponen yang tidak diperlukan.

Penjelasan Alur Program

1. Inisialisasi Data

Program membuat dua ArrayList:

namakomponen menyimpan nama komponen komputer.
hargakomponen menyimpan harga dari masing-masing komponen.
Scanner (input) digunakan untuk membaca data dari pengguna.

Kode ini berfungsi untuk menyiapkan struktur data (ArrayList) dan input (Scanner).
Variabel pilihan digunakan untuk menampung menu yang dipilih.

<img width="340" height="55" alt="image" src="https://github.com/user-attachments/assets/478a6ad6-d31a-430a-96e3-8bbac2c22a71" />

2. Perulangan Menu Utama

Program akan menampilkan menu utama dalam sebuah do-while loop, selama pilihan bukan 5 (Keluar), program akan terus berjalan.

Menu yang ditampilkan:
-Buat List Komponen

-Lihat List Komponen

-Update List Komponen

-Hapus List Komponen

-Keluar

Program menggunakan do-while loop supaya menu terus tampil sampai user memilih keluar.

<img width="408" height="146" alt="image" src="https://github.com/user-attachments/assets/80c16702-7da9-47e3-974e-27dd616c5ce0" />

<img width="178" height="31" alt="image" src="https://github.com/user-attachments/assets/82a336ac-7c8f-49a4-9a0f-dc2e05d9db6e" />

Pilihan Menu (switch-case)

Case 1: Buat List Komponen
Pertama User akan diminta untuk memasukkan nama komponen, lalu User diminta memasukkan harga dari komponen, naama dan harga nantinya akan disimpan ke dalam ArrayList, setelah itu program akan menampilkan pesan bahwa komponen berhasil ditambahkan.

<img width="383" height="157" alt="image" src="https://github.com/user-attachments/assets/1f3e075d-a23e-4e58-a732-07b7d78172b9" />

Case 2: Lihat List Komponen

Jika ArrayList kosong nanti akan tampil pesan "Kosong", jika ada isi program akan tampilkan seluruh daftar komponen dengan format: NamaKomponen | Harga: RpHargaKomponen

<img width="443" height="154" alt="image" src="https://github.com/user-attachments/assets/d5353a81-eee7-4415-8e3e-bc2edb91bc33" />

Case 3: Update List Komponen

User diminta untuk memasukkan nomor indeks komponen yang ingin diupdate.
Jika nomor valid:

-User memasukkan nama baru dan harga baru.

-Data lama pada indeks tersebut diganti dengan data baru.

-Tampil pesan "Komponen berhasil diupdate".

-Jika nomor tidak valid akan tampil "Nomor tidak valid.".

<img width="437" height="266" alt="image" src="https://github.com/user-attachments/assets/52ad68dc-a4a1-475b-b8df-f9a422e304ba" />

Case 4: Hapus List Komponen

User diminta memasukkan nomor indeks komponen yang ingin dihapus.

Jika nomor valid:

-Data pada indeks tersebut dihapus dari kedua ArrayList.

-Akan tampil pesan "Komponen berhasil dihapus".

-Jika nomor tidak valid → tampil "Nomor tidak valid.".


<img width="429" height="164" alt="image" src="https://github.com/user-attachments/assets/529a453b-5f34-4ca6-9010-15a6c54dba75" />

Case 5: Keluar

Jika memasukkan no 5, prrogram akan menampilkan "..............".

Perulangan berhenti karena kondisi pilihan != 5 tidak terpenuhi.

<img width="281" height="56" alt="image" src="https://github.com/user-attachments/assets/84201db1-daee-4522-af55-307001f30d73" />
