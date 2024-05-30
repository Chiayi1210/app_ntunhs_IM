package com.example.w9

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app_record.RecordAdapter
import com.example.w9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mAdapter: RecordAdapter
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.toolbarMain.inflateMenu(R.menu.menu)
        setContentView(binding.root)

        mAdapter = RecordAdapter(this, Bprecords(emptyList()))
        binding.recordRecycler.adapter = mAdapter
        binding.recordRecycler.layoutManager = LinearLayoutManager(this)

        val records = Bprecords(mutableListOf(
            Bprecord("2024-05-09 10:00", 120, 80, 72),
            Bprecord("2024-05-09 14:00", 125, 82, 75),
            Bprecord("2024-05-10 08:00", 118, 78, 70)
        ))
        mAdapter.updateData(records)

        binding.toolbarMain.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_add -> {
                    Log.e(TAG, "Menu_add")
                    true
                }
                else -> false
            }
        }
    }
}
