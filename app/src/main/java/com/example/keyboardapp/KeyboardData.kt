 package com.example.keyboardapp

object KeyboardData {

    private val keyboardNames = arrayOf("Razer BlackWidow Chroma V2",
        "Corsair Strafe Cherry MX Brown Mechanical Keyboard",
        "Steelseries APEX M260 Mechanical Keyboard",
        "Logitech G613",
        "Mechanical Keyboard Royal Kludge RK61",
        "Corsair K65 Compact Mechanical Gaming Keyboard",
        "Digital Alliance Meca Sport",
            "Keyboard Mechanical Imperion Mech 7",
        "Warwolf V10 Mechanical Keyboard Gaming",
        "Sades K10 Rainbow Mechanical Gaming Keyboard"
    )

    private val price = arrayOf("Rp 2.600.000",
        "Rp 1.500.000",
        "Rp 1.200.000",
        "Rp 1.300.000",
        "Rp 850.000",
        "Rp 800.000",
        "Rp 714.000",
        "Rp 363.000",
        "Rp 299.000",
        "Rp 650.000",
        "Rp 650.000"
    )

    private val berat  = arrayOf(" ± 1.400 gram",
            " ± 1.200 gram",
            " ± 1.300 gram",
            " ± 1.300 gram",
            " ± 1.500 gram",
            " ± 1.200 gram",
            " ± 1.100 gram",
            " ± 1.300 gram",
            " ± 1.130 gram",
            " ± 1.344 gram",
            )

    private val details = arrayOf("Razer Blackwidow V2 diperbaharui dengan opsi switch terbaru, wrist rest magnetik dan tampilan yang menarik. Selain Razer Green dan Orange, Razer Blackwidow V2 juga dilengkapi dengan alternatif switch Razer Yellow yang dirancang untuk mempercepat respon ketika tuts ditekan. Fitur tambahan dari Chroma yaitu Individual Programable Key hingga 16.8 juta pilihan warna yang dapat diatur sesuai keinginan kamu.",

        "Corsair hadir dengan desain ergonomis yang dilengkapi dengan backlight full color, sehingga kamu akan nyaman saat menggunakannya walaupun dalam waktu lama. Gaming keyboard ini mampu meningkatkan kecepatan permainan kamu. Terdapat port USB 2.0 untuk konektifitasnya serta kompatibel dengan sistem operasi Windows 10, Windows 8, dan Windows 7. Keyboard ini juga memiliki teknologi anti-ghosting untuk memaksimalkan kinerjanya.",
        "SteelSeries APEX M260 Heat Orange Mechanical Keyboard merupakan gaming keyboard yang menggunakan teknologi PBT Double Shot keycaps dan Window Lock sehingga lebih tahan lama saat dipakai. Desainnya sederhana namun tetap stylish dan menawan dalam balutan warna hitam. Gaming keyboard ini memiliki black kaihl switch yang juga kompatibel dengan sistem operasi Windows maupun Mac.",
        "Keyboard ini memiliki desain tipis dengan bobot sekitar 1,5 Kg yang ketinggiannya dapat disesuaikan dengan panel yang terdapat dibawahnya sesuai keinginan pengguna. Logitech G613 merupakan keyboard nirkabel yang dirancang khusus untuk para gamer yang menginginkan kemampuan kinerja yang lebih bagus dari switch mekanis, serta kebebasan tanpa kabel yang berbelit.",
        "Keyboard ini memiliki fitur Bluetooth yang bisa digunakan untuk untuk sistem Windows, IOS, dan Android. Disematkan baterai lithium 800mA yang bisa bertahan lama saat kamu memakainya. Desain keyboard mechanical ini sangat egronomis dengan bahan Aluminium Alloy serta sandaran tangan yang nyaman untuk mengetik dalam waktu lama. Terdapat N-Key Rollover yang memfasilitasi kamu saat mengetik dan bermain game.",
        "Corsair K65 termasuk seri mechanical keyboard yang termurah dikelasnya. Corsair K65 memiliki tampilan yang elegan dalam balutan bodi chassis berbahan aluminium anodized tebal berwarna abu-abu, dan tombol-tombolnya berwarna hitam dibiarkan memberikan efek mengapung diatas plate aluminium tersebut. productnation",
        "Digital Alliance Meca Sport merupakan keyboard gaming yang di desain sesuai tangan para gamer, sehingga akan terasa lebih nyaman saat bermain game. Digital Alliance Mechanical menghadirkan ukuran keyboard yang hanya 60% dari ukuran keyboard biasa. Dengan Outemu switch, kamu bisa menggantinya antara merah atau biru. Keyboard ini juga cocok digunakan untuk kebutuhan multimedia lainnya.",
        "Generic Mechanical Imperion Mech 7 Gaming Keyboard merupakan keyboard gaming dengan teknologi RGB 7 colour exchange yang dapat diatur irama dan warna sesuai dengan selera kamu. Dengan desain bodi aluminium, keyboard ini semakin terlihat kuat dan tangguh. productnation",
        "Seri ini merupakan mechanical keyboard seri tertinggi dari merk Warwolf. Keyboard ini dapat digunakan untuk memenuhi kebutuhan kantor hingga kebutuhan para gamer. Diklaim dapat bertahan hingga 5 juta klik (keypress). Dilengkapi dengan 3 warna lampu keyboard yang dapat berganti secara otomatis, yaitu biru, merah dan ungu, membuat keyboard ini semakin menarik.",
        "Keyboard ini dilengkapi dengan 8 mode backlighting, 3 mode tombol game built-in pola pencahayaan, dan LED lampu. Ketinggian keyboard ini juga dapat diataur sesuai keinginan pengguna. Switch kustom mekanisnya dirancang responsif dan juga tahan lama. Diklaim lebih dari 50 juta kali keystroke tes dan kompatibel dengan Windows XP, Vista, 7, 8, 10, Mac OS X."
        )

    private val imagesKey = intArrayOf(R.drawable.razer,
        R.drawable.corsair,
        R.drawable.apex,
        R.drawable.logitec,
        R.drawable.royal,
        R.drawable.corsairk65,
        R.drawable.aliance,
        R.drawable.imperion,
        R.drawable.warwolf,
        R.drawable.sades
        )

    private val tipeSwitch = arrayOf("green,blue,brown",
            "red,brown,blue,speed,silent",
            "blue,red,brown",
            "blue,red",
            "blue,brown",
            "red",
            "blue,brown",
            "blue",
            "blue,red",
            "blue","brown","blue"
            )

    private val tkeyboard = arrayOf("Full 104 keys",
            "Full 104 keys",
            "Full 104 keys",
            "TKL (Ten Key Less) 87 keys",
            "Full 104 keys",
            "TKL (Ten Key Less) 87 keys",
            "Full 104 keys",
            "TKL (Ten Key Less) 87 keys",
            "Full 104 keys",
            "Full 104 keys",
    )

    private val fiturs  = arrayOf(" seperti Anti Ghosting, LED Backlight, dan Full Mechanical Keys",
    "tombol pengaturan dedicated, baik untuk fungsi multimedia, kendali volume, microphone,  switch kontrol brightness LED",
    " fitur anti-ghosting dan kenyamanan feedback",
    "Panel alumunium  wireless dan Bluetooth",
    "Anti cipratan air Supports NKRO in wired mode,Supports bluetooth and USB wired dual-mode connection.",
    "100% anti-ghosting with full key rollover on USB, Gunmetal gray anodized aluminum chassis",
    "Anti cipratan air,anti-ghosting",
    "Aplikasi driver, Macro key, Kabel modular",
    "Panel alumunium,anti-ghosting",
    "Aplikasi driver, Macro key, Kabel modular,anti-ghosting",
    )


//    kecurigaaan kemungkinan gambar tidak bisa tampil di deteail karena terdapat kesalahan disini

    val listData:ArrayList<Keyboard>
    get() {
        val list = arrayListOf<Keyboard>()
        for (position in keyboardNames.indices ){
            val keyboard = Keyboard()
            keyboard.name = keyboardNames[position]
            keyboard.detail = details[position]
            keyboard.photo  = imagesKey[position]
            keyboard.harga = price[position]
            keyboard.berat = berat[position]
            keyboard.fitur = fiturs[position]
            keyboard.tswitch = tipeSwitch[position]
            keyboard.tkeyboard= tkeyboard[position]
            list.add(keyboard)
        }
         return  list
 }
}