# PBO4 Data Mahasiswa
Tugas kuliah PBO 4 - Data Mahasiswa dengan Java

## Rancangan Class
### main class
Terdapat ArrayList data untuk menyimpan data setiap mahasiswa,
terdapat while True loop yang digunakan untuk menjalankan aplikasi terus
menerus hinga user memilih menu exit. Dilakukan pengecekan menggunakan
if else untuk melakukan navigasi menu app. Menu tersebut adalah

  1. untuk menampilkan data,
  2. untuk menambah data,
  3. untuk mencari data,
  4. untuk menghapus data, dan
  5. untuk keluar.
  
Jika user menginputkan angka 1, maka akan menampilkan semua data
yang disimpan dalam array list. Jika array list kosong maka akan ditampilkan
pesan data kosong. Jika user menginputkan angka 2, maka akan menambah
data dengan user meninputkan data 1 persatu, sesuai dengan atribut yang
dimiliki class Mahasiswa. Data tersebut adalah NIM, nama, tanggal lahir, dan
gender. Setelah dibuat objek mahasiswa baru dengan data tersebut, objek
akan dimasukan kedalam array list. Jika user menginputkan angka 3, maka
akan ditampilkan menu 1 untuk mencari data berdasarkan NIM, dan menu 2
untuk memfilter berdasarkan gender. Jika user menginputkan angka 4, maka
user akan diminta untuk menginputkan NIM yang akan dihapus dari data. Jika
user menginputkan angka 5, maka program akan keluar.

### Class Mahasiswa
Mahasiswa memiliki atribut NIM, nama, tglLahirStr, dan genderStr yang
bertipe data String, tglLahir yang bertipe data Date, dan gender yang bertipe
data integer.Pada class Mahasiswa juga terdapat constructor. Pada saat
objek diinstansiasi, data yang diberikan pada constructor adalah data string
kecuali untuk gender, kemudian dilakukan konversi sesuai dengan tipe data
yang sesuai seperti tglLahirStr menjadi tglLahir yang bertipe data Date dan
gender int yang dikonvert menjadi genderStr yang merupakan text laki laki
jika gender int adalah 0 dan perempuan jika gender int adalah 1.
