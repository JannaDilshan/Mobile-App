package com.example.emart



import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import com.example.emart .databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageList = intArrayOf(
            R.drawable.monitor,
            R.drawable.keyboard,
            R.drawable.mouse,
            R.drawable.gamingcase,
            R.drawable.fan,
            R.drawable.motherboad,
            R.drawable.ssd
        )
        val descList = intArrayOf(
            R.string.Monitor,
            R.string.KeyBoard,
            R.string.Mouse,
            R.string.GamingCase,
            R.string.Fan,
            R.string.Motherboad,
            R.string.SSD
        )
        val nameList = arrayOf("Monitor", "KeyBord", "Mouse", "GamingCase", "Fan", "Motherboad", "SSD")
        for (i in imageList.indices) {
            listData = ListData(
                nameList[i], descList[i], imageList[i]
            )
            dataArrayList.add(listData)
        }
        listAdapter = ListAdapter(this@ListActivity, dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true
        binding.listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@ListActivity, DetailedActivity::class.java)
            intent.putExtra("name", nameList[i])
            intent.putExtra("desc", descList[i])
            intent.putExtra("image", imageList[i])
            startActivity(intent)
        }
    }
}