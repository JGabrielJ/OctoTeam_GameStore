package com.example.octoteam_gamestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// MainActivity1
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    private lateinit var gameCardList1: ArrayList<GameCard>
    private lateinit var gameCardList2: ArrayList<GameCard>
    private lateinit var gameCardAdapter1: GameCardAdapter
    private lateinit var gameCardAdapter2: GameCardAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        recyclerView1 = findViewById(R.id.horizontalRvFeaturedAndRecommended)
        recyclerView2 = findViewById(R.id.horizontalRvSpecialOffers)
        recyclerView1.setHasFixedSize(true)
        recyclerView2.setHasFixedSize(true)
        recyclerView1.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerView2.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        gameCardList1 = ArrayList()
        gameCardList2 = ArrayList()

        addDataToList()

        gameCardAdapter1 = GameCardAdapter(gameCardList1)
        recyclerView1.adapter = gameCardAdapter1
        gameCardAdapter2 = GameCardAdapter(gameCardList2)
        recyclerView2.adapter = gameCardAdapter2
    }

    private fun addDataToList() {
        gameCardList1.add(GameCard(R.drawable.cod,
            "Call of Duty  Modern Warfare 2",
            35, 299.99, 194.90)) //Adicionando COD MW II

        gameCardList1.add(GameCard(R.drawable.gta, "Grand Theft Auto V",
            65, 109.69, 38.63)) //Adicionando GTA V

        gameCardList2.add(GameCard(R.drawable.terr,
            "Terraria",
            40, 30.00, 18.00)) //Adicionando Terraria

        gameCardList2.add(GameCard(R.drawable.red, "Red Dead Redemption 2",
            35, 299.99, 194.95)) //Adicionando RR2
    }
}
