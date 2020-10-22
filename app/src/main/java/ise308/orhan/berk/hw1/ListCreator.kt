/*
 * Created by Berk Orhan on
 * APPBeta Mobile | www.APPBeta.net | mobile@appbeta.net
 *
 *           YASAL UYARI
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

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class ListCreator(var context: Context, var itemList : ArrayList<ItemCreator>) : BaseAdapter() {


    //  Creating Objects and Variables
        lateinit var pImage : ImageView
        lateinit var pTitle : TextView
        lateinit var pText : TextView
        lateinit var viewer : View
        lateinit var paragraphs : ItemCreator

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            // XML'deki tasarım objelerini tanımlıyoruz.
            viewer = View.inflate(context, R.layout.item_design, null)
            pImage = viewer.findViewById(R.id.text_image)
            pTitle = viewer.findViewById(R.id.text_title)
            pText = viewer.findViewById(R.id.text_paragpraph)

            paragraphs = itemList.get(position)
            pImage.setImageResource(paragraphs.pImages!!)
            pTitle.text = paragraphs.pTitle
            pText.text = paragraphs.pText

            return viewer!!
        }

        // Finding item position
        override fun getItem(position: Int): Any {
            return itemList.get(position)
        }

        // Finding Item ID
        override fun getItemId(position: Int): Long {
  //          TODO("Not yet implemented")
            return position.toLong()
        }

        // Finding array size.
        override fun getCount(): Int {
//            TODO("Not yet implemented")
            return itemList.size
        }


    }
