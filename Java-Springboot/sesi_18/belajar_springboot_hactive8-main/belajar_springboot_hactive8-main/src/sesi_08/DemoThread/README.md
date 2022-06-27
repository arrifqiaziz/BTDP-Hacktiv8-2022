# Concurrent
 - makan kue dan nyanyi secara bersamaan
 - There are two tasks executing concurrently,
   tetapi berjalan di 1-core CPU, 
   so the CPU will decide to run a task first and then the other task 
   or run half a task and half another task, etc. 
   Two tasks can start, run, and complete in overlapping time periods 
   i.e Task-2 can start even before Task-1 gets completed. 
   It all depends on the system architecture.
   
# Parallel
 - split tasks menjadi smaller sub-task yang bisa di proses secara parallel, 
   ex: menjalankan pada multiple CPU pada waktu yang sama
 - untuk menjalankan parallel, tidak harus ada dua task atau lebih,
   ia akan menjalankan bagian dari task atau multiple task secara bersamaan
   menggunakan multi-core infrastructure dari CPU dengan cara assigning
   core ke tiap task/sub-task
 - If we keep going with the same example as above, the rule is still 
   singing and eating concurrently, but this time, you play in a team of two. 
   You probably will eat and let your friend sing 
   (because she sings better and you eat better). 
   So this time, the two tasks are really executed simultaneously, 
   and it’s called parallel.
 - Parallelism membutuhkan hardware dengan multiple processing units, 
   essentially. In single-core CPU, you may get concurrency but NOT parallelism. 
   Parallelism is a specific kind of concurrency where tasks are really executed simultaneously.
   
-  Synchronization -> fitur yang digunakan untuk memaksa kode program hanya boleh diakses oleh satu thread saja  

---------------------------------------------------------------


1. aplikasi bisa concurrent — tetapi tidak parallel,
   dalam artian bisa memproses 1 task atau lebih secara bersamaan, tetapi tidak mengeksekusi 2 task secara bersamaan

2. aplikasi bisa parallel — tetapi tidak concurrent, 
   dalam artian bisa memproses multiple sub-tasks of a task in multi-core CPU at the same time.

3. aplikasi bisa tidak parallel - bisa tidak concurrent juga
   dalam artian memproses semua task secara sequential 1 per 1

4. aplikasi bisa prallel - bisa concurrent
   dalam artian memproses multiple task secara conccurent dalam multi core CPU secara bersamaan