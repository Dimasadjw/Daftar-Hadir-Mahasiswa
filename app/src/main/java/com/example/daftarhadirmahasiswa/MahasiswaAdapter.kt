package com.example.daftarhadirmahasiswa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter (
    val listMahasiswa:List<Mahasiswa>,
    val onClickShareMahasiswa: (Mahasiswa) -> Unit,
    val onClickOpenProfileMahasiswa: (Mahasiswa) -> Unit,
):
    RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MahasiswaViewHolder {
        val layout: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mahasiswa, parent, false)
        return MahasiswaViewHolder(layout)
    }

    override fun onBindViewHolder(
        holder: MahasiswaViewHolder,
        position: Int
    ) {
        val mahasiswa:Mahasiswa = listMahasiswa[position]

        holder.buttonShareProfile.setOnClickListener {
            onClickShareMahasiswa(mahasiswa)
        }
        holder.buttonOpenProfile.setOnClickListener {
            onClickOpenProfileMahasiswa(mahasiswa)
        }
        holder.textViewName.text = mahasiswa.name
        holder.textViewNIM.text = mahasiswa.nim
        holder.textViewStatus.text = mahasiswa.status.toString()
    }

    override fun getItemCount(): Int = listMahasiswa.size

    class MahasiswaViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textViewNIM = view.findViewById<TextView>(R.id.textViewNim)
        val textViewName = view.findViewById<TextView>(R.id.textViewName)
        val textViewStatus = view.findViewById<TextView>(R.id.textViewStatus)
        val buttonShareProfile = view.findViewById<Button>(R.id.buttonShareProfile)
        val buttonOpenProfile = view.findViewById<Button>(R.id.buttonOpenProfile)
    }
}