Hello Github, ini adalah repository pertama saya.

Ini fitur 1
Ini fitur 2
Ini baris baru ditambahkan di GitHub.
Ini fitur 3

# Jobsheet 5

## Percobaan 1
[ifCetakKRS08.java](https://github.com/okeokke/PraktikumDaspro/blob/main/jobsheet5/ifCetakKRS08.java)
### Pertanyaan
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional? 
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya? 
3. Sistem  perlu  memberikan  informasi  apabila  pengguna  memasukkan  nilai  false,  maka terdapat  keluaran  “Registrasi  ditolak.  Silakan  lunasi  UKT  terlebih  dahulu”.  Modifikasi program tersebut dengan menambahkan struktur ELSE! 
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1”

### Jawaban Pertanyaan
1 . Karena variabel kondisi bertipe boolean, dimana boolean sendiri sudah hanya memiliki 2 kondisi yaitu true/false, jadi variabel pada statement IF tidak perlu operator relasi
2 . Tidak ada output lanjutan, hal tersebut terjadi karena pernyataan yang ada hanya ada pada untuk kondisi true, sedangkan pada kondisi false (atau else) belum ada pernyataan bagi kondisi tersebut.

3 & 4 . [ifCetakKRS08.java](https://github.com/okeokke/PraktikumDaspro/blob/main/jobsheet5/ifCetakKRS08.java)


## Percobaan 
[switchCetakKRS08.java](https://github.com/okeokke/PraktikumDaspro/blob/main/jobsheet5/switchCetakKRS08.java)
### Pertanyaan
1. Apa fungsi dari sintaks break?
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
3. buat file baru dengan nama ifElseCetakKRS08.java . File ini berisi program hasil transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah dibuat ke dalam bentuk IF-ELSE IF-ELSE.
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan "Modifikasi Percobaan 2"

### Jawaban Pertanyaan
1. break berfungsi untuk mengakhiri pernyataan dari sebuah case. tanpa break, pernyataan untuk case selanjutnya akan tetap tereksekusi sampai ada sintaks break, atau jika tidak akan error.
2. default kurang lebih berarti kondisi asli jika tidak ada case yang cocok dengan kondisi yang diberikan.

3 & 4. [ifElseCetakKRS08.java](https://github.com/okeokke/PraktikumDaspro/blob/main/jobsheet5/ifElseCetakKRS08.java)


## Percobaan 3
[nestedUjianSkripsi08.java](https://github.com/okeokke/PraktikumDaspro/blob/main/jobsheet5/nestedUjianSkripsi08.java)
### Pertanyaan
1. Apa  yang  terjadi  jika  mahasiswa  menjawab  "No"  pada  pertanyaan  bebas  kompen?  Mengapa demikian? 
2. Jelaskan maksud dari potongan kode berikut!
```
if (bimbinganP1 >= 8 && bimbinganP2 >= 4)
```
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi! 

### Jawaban Pertanyaan
1. pada saat menjawab "No", program masih berlanjut menanya inputan untuk bimbingan 1 dan 2, dikarenakan program java berjalan secara sekuensial atau berurutan. dan pada program, memag dicoding untuk mengambil semua inputan terlebih dahulu sebelum memprosesnya. hal tersebut bisa dilakukan untuk menghindari variabel yang belum dideklarasikan saat pemrosesan.

2. maksud dari potongan kode tersebut yaitu untuk mengecek 2 kondisi yang kedua kondisi tersebut harus positif untuk menghasilkan pernyataan positif, karena dalam potongan kode tersebut menggunakan operator relasi && (AND)

3. Alur pemeriksaan dimulai dengan if statement yang mengecek kondisi kompen, yang jika kondisi true,
akan dilanjutkan dengan pemrosesan pengecekan **jika** bimbinganP1 **DAN** bimbinganP2 melebihi syarat yang diperlukan lalu apakah kondisi keduanya berstatus true yang akan menghasilkan output "Syarat terpenuhi".
Jika tidak/false, dilanjutkan dengan pengecekan **jika** bimbinganP1 **DAN** bimbinganP2 apakah kurang dari syarat yang diperlukan lalu apakah kondisinya true yang akan menghasilkan "Gagal, kedua syarat tidak terpenuhi".
Jika tidak/false, dilanjutkan dengan pengecekan kondisi **jika** bimbinganP1 apakah kurang dari nilai 8, jika kondisi true, akan mencetak "Gagal, syarat bimbinganP1 tidak terpenuhi".
Jika tidak/false, tidak ada variabel yang dicek lagi, dan dipastikan bahwa bimbinganP2 tidak lengkap dan akan mencetak "Gagal, syarat bimbinganP2 tidak terpenuhi".
Setelah eksekusi perintah dalam kondisi true statement if komndisi kompen, jika kondisi false, maka akan mencetak "Gagal, mahasiswa memiliki kompen"
