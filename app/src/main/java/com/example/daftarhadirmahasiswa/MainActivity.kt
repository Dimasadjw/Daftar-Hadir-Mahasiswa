package com.example.daftarhadirmahasiswa

import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.net.Uri
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textViewWelcomeMaasage : TextView = findViewById(R.id.textViewWelcomeMessage)
        val email:String = intent.getStringExtra(Login.KEY_USERNAME) ?: ""
        textViewWelcomeMaasage.text = "Hello, $email"

        val recyclerView = findViewById<RecyclerView>(R.id.recycleview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val mhsAdapter = MahasiswaAdapter(
            getMahasiswa(), ::shareProfile, ::goToProfilActivity)
        recyclerView.adapter = mhsAdapter
    }
    fun goToProfilActivity(mahasiswa: Mahasiswa) {
        val explicitIntent = Intent(this,
            ProfileActivity::class.java)
        explicitIntent.putExtra("name", mahasiswa.name)
        startActivity(explicitIntent)
    }
    fun shareProfile(mahasiswa: Mahasiswa) {
// val implicitIntent = Intent(Intent.ACTION_SEND)
// implicitIntent.type = "text/plain"
// implicitIntent.putExtra(Intent.EXTRA_EMAIL, mahasiswa.name)
// implicitIntent.putExtra(Intent.EXTRA_TEXT, mahasiswa.nim)
// startActivity(implicitIntent)

        val implicitIntent = Intent(Intent.ACTION_VIEW,
            Uri.parse("https://wa.me/6281230038392?text=Hallo")
        )
        startActivity(implicitIntent )
    }


    fun getMahasiswa(): List<Mahasiswa> {
        val listMahasiswa = mutableListOf<Mahasiswa>()

        listMahasiswa.add(
            Mahasiswa(
                "ALBASHITA ISNAINI ARROHIM",
                "243307031", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "ANISA AURALITA ASZAHRA",
                "243307032", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "ARSYIL FIQIH SEFTIANA",
                "243307033", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "ARYA PRAMUDIA SURYA NDARU",
                "243307034", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "ARYA TEJO PRAWIRAYUDA",
                "243307035", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "ARYASUTA DANISWARA",
                "243307036", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "BAYU KRISDIANTORO",
                "243307037", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "BERYL AZZAHRA RAFFAGUSTIFRAM",
                "243307038", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "BIMA PRAWIRA DHARMA",
                "243307039", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "CANDRA NUR ANDIKA",
                "243307040", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "DANIS ATIA AGARA",
                "243307041", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "DIMAS ADJIE WIBOWO",
                "243307042", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "ESTIN DWI PRASETIAJI",
                "243307043", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "FACHRIZAL PAMBUDI LUHUR",
                "243307044", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "FAJAR BAGUS EKA SATRIA",
                "243307045", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "FAUZAN GUSMIRAWAN",
                "243307046", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "FIRDA NOVIANTI",
                "243307047", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "GHANI FADILAH",
                "243307049", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "HANY SETYARINI",
                "243307050", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "IKA FAJAR NURLELA",
                "243307051", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "INES FARAH SEBIAN",
                "243307052", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "JESICA WAHYU IZATI",
                "243307053", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "KARLITA AGUSTIN WARDHANI",
                "243307054", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "LIVYA JUNITA ENJELINA",
                "243307055", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "MADA HASAN SATRIO",
                "243307056", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "MIDIANA NURUSSAHAR",
                "243307057", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "MUHAMMAD FAKHRUDDIN AROZI",
                "243307058", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "POPY AFRISA PRAMESTI",
                "243307059", Status.HADIR
            )
        )

        listMahasiswa.add(
            Mahasiswa(
                "YOGO PRASETYO",
                "243307060", Status.HADIR
            )
        )

        return listMahasiswa
    }
}