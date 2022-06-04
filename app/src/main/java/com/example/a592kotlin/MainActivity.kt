package com.example.a592kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.main_recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        getAdapter(data())
    }

    private fun data(): ArrayList<Feeds> {
        val feeds = ArrayList<Feeds>()
        feeds.add(Feeds(R.drawable.rasm,"Alisher Daminov","Sep 21 - ",R.drawable.rasm))
        feeds.add(Feeds(R.drawable.rasms,"Alisher Daminov","May 14 - ",R.drawable.rasms))
        feeds.add(Feeds(R.drawable.ali,"Alisher Daminov","Apr 18 - ",R.drawable.ali))
        feeds.add(Feeds(R.drawable.rasm,"Alisher Daminov","Sep 21 - ",R.drawable.rasm))
        feeds.add(Feeds(R.drawable.rasms,"Alisher Daminov","May 14 - ",R.drawable.rasms))
        feeds.add(Feeds(R.drawable.ali,"Alisher Daminov","Apr 18 - ",R.drawable.ali))
        feeds.add(Feeds(R.drawable.rasm,"Alisher Daminov","Sep 21 - ",R.drawable.rasm))
        feeds.add(Feeds(R.drawable.rasms,"Alisher Daminov","May 14 - ",R.drawable.rasms))
        feeds.add(Feeds(R.drawable.ali,"Alisher Daminov","Apr 18 - ",R.drawable.ali))
        feeds.add(Feeds(R.drawable.rasm,"Alisher Daminov","Sep 21 - ",R.drawable.rasm))
        feeds.add(Feeds(R.drawable.rasms,"Alisher Daminov","May 14 - ",R.drawable.rasms))
        feeds.add(Feeds(R.drawable.ali,"Alisher Daminov","Apr 18 - ",R.drawable.ali))

        return feeds
    }

    private fun getAdapter(list: ArrayList<Feeds>) {
        val adapter = FeedsAdapter(this, list)
        recyclerView.adapter = adapter
    }
}