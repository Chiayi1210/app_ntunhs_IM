package com.example.app_record

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app_record.databinding.ItemRecordBinding

data class Bprecord(val datetime: String, val sys: Int, val dia: Int, val hr: Int)
data class Bprecords(val bprecords: List<Bprecord>)

class RecordAdapter(
    private val context: Context,
    private var data: Bprecords
) : RecyclerView.Adapter<RecordAdapter.RecordViewHolder>() {

    class RecordViewHolder(val binding: ItemRecordBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemRecordBinding.inflate(inflater, parent, false)
        return RecordViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecordViewHolder, position: Int) {
        val record = data.bprecords[position]
        with(holder.binding) {
            txtDate.text = record.datetime
            txtResult.text = "SYS: ${record.sys}, DIA: ${record.dia}, HR: ${record.hr}"
        }
    }

    override fun getItemCount(): Int {
        return data.bprecords.size
    }

    fun updateData(newData: Bprecords) {
        data = newData
        notifyDataSetChanged()
    }

    fun addRecord(newRecord: Bprecord) {
        val mutableList = data.bprecords.toMutableList()
        mutableList.add(newRecord)
        data = Bprecords(mutableList)
        notifyDataSetChanged()
    }
}
