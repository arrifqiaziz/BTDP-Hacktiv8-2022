git add .
- menambahkan semua file ke staging area

git add nama_file
- menambahkan file tertentu ke staging area

git commit -m "komentar"
- commit perubahan pada staged file

git commit -m nama_file
- commit perubahan staged file tertentu

git push
- mengirim file yang di commit ke remote repository

git fetch
- download kontent file konten dari remote repository

git pull
- menarik file dari remote repository ke local repository

git pull -- rebase
- menarik file dari remote dan replace code file local dengan code file di remote.
  jadi semua code di local akan mengikuti code yang di remote sama persis
 
git branch
- melihat nama branch

git branch nama_branch
- membuat branch

git push --set-upstream origin nama_branch
- push branch local yang baru dibuat

git branch -d nama_branch
- delete local branch