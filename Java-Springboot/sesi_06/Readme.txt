Version Control System (VCS)
Sistem yang mencatat semua perubahan yang dilakukan pada file sehingga semua riwayatnya akan terekam
dan bisa dilihat kembali nanti. Ketika ada perubahan,
sistem dapat melihat bukan hanya dari file yang berubah
tapi dari setiap baris dalam file.

Contoh VCS :
 - Github
 - Gitlab
 - Bitbucket

Bagian dari Git
 - Repository	-> direktori penyimpanan file proyek
 - Branch		-> salinan dari repositori. Anda bisa menggunakan branch ketika akan melakukan suatu
pengembangan atau development secara terpisah.

Cara membuat akun GitHub
 - Masuk ke Github dan daftar.
 - Tentukan username kamu yang baik, jelas, mudah diingat dan dibaca; dengan huruf kecil (misalnya arrifqiaziz atau arrifqi14).
 - Konfirmasi email akun GitHub di inbox kamu.
 - Kunjungi https://github.com/settings/profile lalu lengkapi profil kamu.
 - "Update profile" kamu.
 - Jika nanti kamu melihat USERNAME, artinya perlu diganti dengan username-kamu. Misalnya username kamu adalah arrifqiaziz, berarti github.com/USERNAME menjadi github.com/arrifqiaziz.

Cara Install Git
 - Download installer pada https://git-scm.com/
 - Jalankan instalasi
 - Pada pengaturan path pilih bagian "Use Git from the Windows Command Prompt" (tengah)
 - Pilih "Use Windows default console"
 - Next saja dan berhasil
 - Cek instalasi dengan git --version

Konfigurasi
- Konfigurasikan global username dan password nya dengan buka cmd lalu ketik
- git config --global user.name "Nama_Register_Github"
- git config --global user.email user@email.com
- cek dengan git config --list


Cara Upload Git
- git init
- git add .
- git status
- git commit -m ‘your message’
- git remote add origin ‘your_url_name’
- git push -u origin master

