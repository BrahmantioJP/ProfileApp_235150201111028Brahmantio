# ProfileApp_235150201111028Brahmantio

## Penjelasan singkat kode
Pada project ini, saya membuat aplikasi profil sederhana menggunakan **Jetpack Compose**.  
Di dalam `MainActivity`, saya memanggil `ProfileScreen()` yang berisi tampilan utama.  

Pada `ProfileScreen`, saya menggunakan **Column** untuk menata komponen secara vertikal dan mengatur alignment ke tengah layar.  
Di dalamnya saya membuat sebuah panel dengan **background** berwarna `surfaceVariant` dan sudut membulat menggunakan `RoundedCornerShape`.  

Selanjutnya, saya membuat panel yang memuat **foto profil** ditampilkan dengan `Image` berukuran **120dp**, dipotong lingkaran memakai `clip(CircleShape)`.  Saya juga menambahkan gambar di folder `res/drawable` dan menamainya `profil.png`.  Setelah itu, saya menambahkan **teks** untuk menampilkan **nama, NIM, dan deskripsi singkat**.  

Terakhir, saya membuat tombol interaktif `FollowButton()` yang memanfaatkan **state** `remember { mutableStateOf(false) }`.  
Saat tombol ditekan, nilai state berubah sehingga teks tombol otomatis berganti antara **“Follow”** dan **“Unfollow”**.

## Analisis singkat keuntungan Compose dibandingkan XML layout.
Menurut saya, **Jetpack Compose** memiliki sejumlah keunggulan dibanding **XML layout** tradisional. Compose bersifat **deklaratif dan berbasis state**, sehingga UI dapat otomatis menyesuaikan saat data berubah tanpa harus menulis kode tambahan seperti `findViewById` atau `notifyDataSetChanged`. Selain itu, struktur kode menjadi **lebih ringkas** karena UI dibangun dengan fungsi `@Composable` yang mudah dipahami, diuji, dan dipakai ulang. Dari sisi keamanan, Compose menawarkan **type-safety Kotlin** sehingga kesalahan dapat langsung terdeteksi pada saat kompilasi. Pengembangan juga terasa lebih cepat berkat fitur **Preview** dan **Hot Reload** yang memungkinkan saya melihat perubahan UI secara langsung tanpa harus melakukan build ulang aplikasi penuh. Terakhir, Compose mendukung **integrasi Material 3** yang memudahkan penerapan theming dan styling konsisten hanya dengan membungkus komponen di dalam Theme. Dengan keunggulan-keunggulan ini, pengembangan aplikasi menjadi lebih **efisien, terstruktur, dan mudah dirawat** dibandingkan dengan XML.
