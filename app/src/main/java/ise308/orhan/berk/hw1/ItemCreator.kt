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

class ItemCreator {

    // Değişken ve Obje tanımlamaları
    var pImages: Int? = 0
    var pTitle : String? = null
    var pText : String? = null

    // CardView içerisindeki yapının oluşumu
    constructor(pImage : Int?, pTitle : String?, pText : String?){
        this.pImages = pImage
        this.pTitle = pTitle
        this.pText = pText
    }

}