**Nama: Prakasa Wira Mukti**

**Nim: 2409116054**

**Tema: Manajemen Daftar Harga Komponen Komputer**

---

# Deskripsi Program

Program ini dibuat untuk orang orang seperti pemilik toko komputer, teknisi, atau orang orang yang ingin merakit komputer untuk mencatat harga dari komponen yang ingin mereka beli, sehingga mereka bisa mempertimbangkan terlebih dahulu sebelum membeli. Disini pengguna dapat menambahkan komponen baru beserta harganya, melihat daftar komponen yang sudah tersimpan, memperbarui data komponen, serta menghapus data komponen yang tidak diperlukan.

---

# Penjelasan Alur Program

**1. Inisialisasi Data**

Program membuat dua ArrayList:

namakomponen menyimpan nama komponen komputer.
hargakomponen menyimpan harga dari masing-masing komponen.
Scanner (input) digunakan untuk membaca data dari pengguna.

Kode ini berfungsi untuk menyiapkan struktur data (ArrayList) dan input (Scanner).
Variabel pilihan digunakan untuk menampung menu yang dipilih.

<img width="340" height="55" alt="image" src="https://github.com/user-attachments/assets/478a6ad6-d31a-430a-96e3-8bbac2c22a71" />

**2. Perulangan Menu Utama**

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

**3. Pilihan Menu (switch-case)**

*Case 1: Buat List Komponen*

Pertama User akan diminta untuk memasukkan nama komponen, lalu User diminta memasukkan harga dari komponen, naama dan harga nantinya akan disimpan ke dalam ArrayList, setelah itu program akan menampilkan pesan bahwa komponen berhasil ditambahkan.

<img width="383" height="157" alt="image" src="https://github.com/user-attachments/assets/1f3e075d-a23e-4e58-a732-07b7d78172b9" />

*Case 2: Lihat List Komponen*

Jika ArrayList kosong nanti akan tampil pesan "Kosong", jika ada isi program akan tampilkan seluruh daftar komponen dengan format: NamaKomponen | Harga: RpHargaKomponen

<img width="443" height="154" alt="image" src="https://github.com/user-attachments/assets/d5353a81-eee7-4415-8e3e-bc2edb91bc33" />

*Case 3: Update List Komponen*

User diminta untuk memasukkan nomor indeks komponen yang ingin diupdate.
Jika nomor valid:

-User memasukkan nama baru dan harga baru.

-Data lama pada indeks tersebut diganti dengan data baru.

-Tampil pesan "Komponen berhasil diupdate".

-Jika nomor tidak valid akan tampil "Nomor tidak valid.".

<img width="437" height="266" alt="image" src="https://github.com/user-attachments/assets/52ad68dc-a4a1-475b-b8df-f9a422e304ba" />

*Case 4: Hapus List Komponen*

User diminta memasukkan nomor indeks komponen yang ingin dihapus.

Jika nomor valid:

-Data pada indeks tersebut dihapus dari kedua ArrayList.

-Akan tampil pesan "Komponen berhasil dihapus".

-Jika nomor tidak valid → tampil "Nomor tidak valid.".


<img width="429" height="164" alt="image" src="https://github.com/user-attachments/assets/529a453b-5f34-4ca6-9010-15a6c54dba75" />

*Case 5: Keluar*

Jika memasukkan no 5, prrogram akan menampilkan "..............".

Perulangan berhenti karena kondisi pilihan != 5 tidak terpenuhi.

<img width="281" height="56" alt="image" src="https://github.com/user-attachments/assets/84201db1-daee-4522-af55-307001f30d73" />

**4. Default**

Jika user memasukkan angka selain 1–5, tampil pesan "Pilihan tidak valid".

<img width="299" height="41" alt="image" src="https://github.com/user-attachments/assets/4ec76a0f-a65a-4ad6-a27b-71701b88937f" />

**5. Output**

-Menu*

<img width="215" height="92" alt="image" src="https://github.com/user-attachments/assets/0030d1ad-739f-4f66-a04d-c4f4edd245f4" />

- Opsi 1: Create (Buat List Komponen)

<img width="212" height="121" alt="image" src="https://github.com/user-attachments/assets/de1e4582-e73b-46c7-93d0-d2922a0cdf3a" />

- Opsi 2: Read (Lihat List Komponen)

<img width="218" height="116" alt="image" src="https://github.com/user-attachments/assets/95dc5844-ad4a-4dee-bc1c-74cb85299fcc" />

- Opsi 3: Update (Update List Komponen)

<img width="279" height="260" alt="image" src="https://github.com/user-attachments/assets/f6cb1c2a-504d-4621-9c76-a9c9e1153f50" />

- Opsi 4: Delete (Hapus List Komponen)

<img width="520" height="458" alt="image" src="https://github.com/user-attachments/assets/257a8bb8-43bf-4319-b847-5fc9ae794c13" />

- Opsi 5: Keluar

<img width="219" height="175" alt="image" src="https://github.com/user-attachments/assets/2af76b59-1006-4cb0-b5af-ee1a2e668c7f" />

- Jika memilih opsi selain 1-5
-  
<img width="221" height="110" alt="image" src="https://github.com/user-attachments/assets/b5f2ff21-72a6-400c-9e3a-e49fa67227e7" />


