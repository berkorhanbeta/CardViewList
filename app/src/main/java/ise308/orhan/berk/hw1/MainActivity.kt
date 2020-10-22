/*
 * Created by Berk Orhan on 21.10.2020
 * APPBeta Mobile | www.APPBeta.net | mobile@appbeta.net
 *
 *TODO           YASAL UYARI
 *
 *                 Bu proje dosyasının herhangi bir amaç ile izinsiz olarak dağıtılması,
 *                 çoğaltılması, satılması ve izinsiz kullanılması yasaktır!
 *
 *                 İzinsiz kullanım, çoğaltımı, dağıtımı, satışı yapıldığı
 *                 tespit edilmesi halinde yasal yollara başvurulacaktır.
 *
 *                  Copyright (c)  2020. Berk Orhan. All rights reserved.
 *
 */

package ise308.orhan.berk.hw1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    // Creating Objects and Variables
    private var mainView : ListView? = null
    private var listCreator : ListCreator ? = null
    private var cardViewList : ArrayList<ItemCreator> ? = null

    // Main Function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    // Main Function For ListView
    fun listViewLayout(v : View){
        // Creating ActionBar Object.
        var actionbar = supportActionBar
        setContentView(R.layout.screen_listview)

        // Creating A ListView
        mainView = findViewById(R.id.listView)
        // Creating Array and Adding Items
        cardViewList = ArrayList()
        cardViewList = ItemsForListView()
        listCreator = ListCreator(applicationContext, cardViewList!!)
        mainView?.adapter = listCreator

        // Back Button For ListView Screen.
        actionbar?.setDisplayHomeAsUpEnabled(true)
    }

    // This is a ToolBar Back Button Function
    override fun onSupportNavigateUp(): Boolean {
        var actionbar = supportActionBar
        setContentView(R.layout.activity_main)
        actionbar?.setDisplayHomeAsUpEnabled(false)
        return true
    }


    // We are adding content for our listView.
    private fun ItemsForListView() : ArrayList<ItemCreator> {

        var item : ArrayList<ItemCreator> = ArrayList()

        item.add(
            ItemCreator(
                    R.drawable.c,
                getString(R.string.itemTitle1),
                getString(R.string.itemText1)))

        item.add(
            ItemCreator(
                    R.drawable.java,
                getString(R.string.itemTitle2),
                getString(R.string.itemText2)))

        item.add(
                ItemCreator(
                        R.drawable.sql,
                        getString(R.string.itemTitle10),
                        getString(R.string.itemText10)))

        item.add(
            ItemCreator(
                    R.drawable.php,
                getString(R.string.itemTitle3),
                getString(R.string.itemText3)))

        item.add(
            ItemCreator(
                    R.drawable.ruby,
                getString(R.string.itemTitle4),
                getString(R.string.itemText4)))

        item.add(
            ItemCreator(
                    R.drawable.swift,
                getString(R.string.itemTitle5),
                getString(R.string.itemText5)))

        item.add(
            ItemCreator(
                    R.drawable.csharp,
                getString(R.string.itemTitle6),
                getString(R.string.itemText6)))

        item.add(
            ItemCreator(
                    R.drawable.python,
                getString(R.string.itemTitle7),
                getString(R.string.itemText7)))

        item.add(
            ItemCreator(
                    R.drawable.kotlin,
                getString(R.string.itemTitle8),
                getString(R.string.itemText8)))

        item.add(
            ItemCreator(
                    R.drawable.scala,
                getString(R.string.itemTitle9),
                getString(R.string.itemText9)))

        return item

    }

}