package com.pavlo.zoria.medium.data.source

import com.pavlo.zoria.medium.data.Feedback
import kotlin.random.Random

object FeedbackDataSource : DataSource<List<Feedback>> {
    private val list by lazy {
        setupFeedback(Random.nextInt(100))
    }

    override fun getData(): List<Feedback> = list

    override fun getById(id: Long): List<Feedback>? = list.firstOrNull { it.id == id }?.let {
        listOf(it)
    }

    private fun setupFeedback(size: Int): List<Feedback> {
        val result = mutableListOf<Feedback>()
        for (i in 0..size) {
            val id = Random.nextLong() * 100
            val feedback = Feedback(
                id,
                authorNames.random() + " " + authorSurnames.random(),
                feedbacks.random(),
                backgroundImageUrls.random(),
                avatarUrls.random(),
                Random.nextInt(50),
                Random.nextInt(50)
            )
            result.add(feedback)
        }
        return result
    }

    val authorNames = arrayOf(
        "John Honey",
        "Pablo Escobar",
        "Tony Tinate",
        "Bar Jun",
        "Anonimus"
    )

    val authorSurnames = arrayOf(
        "Honey",
        "Escobar",
        "Tinate",
        "Jun",
        "Surname"
    )

    val feedbacks = arrayOf(
        "\"TeneT\" Christopher nolan fans\"\uD83D\uDCAF❤\uD83D\uDCAF india\uD83C\uDDEE\uD83C\uDDF3\uD83E\uDDE1\uD83E\uDD0D\uD83D\uDC9A\uD83C\uDDEE\uD83C\uDDF3 தமிழன்டா",
        "La quinceañera recibiendo las flores con este tema de fondo",
        "This song helped me trough some rlly hard times......coldplay? Nah the best band ever whit no doubt \uD83D\uDCAA",
        "Listen to this whenever you wanna hurt yourself,whenever you’re in the mood to cry",
        "Eu amo tanto essa música,só consigo imaginar ela como trilha da minha vida e eu não quero mais viver,espero q alguém lembre de mim quando ouvi-la❤",
        "I recently lost my wife to divorce, lost my job to Covid, lost my house and car and only get to see my 8 year old son twice a month.... But this song brings me hope.",
        "Music is the only time machine we have"
    )

    val backgroundImageUrls = arrayOf(
        "https://miro.medium.com/max/3002/1*dP81IJq-tGFxy1rIK3RYsg.png",
        "https://www.3ctele.com/wp-content/uploads/2015/12/3c-gradient-background.png",
        "https://i.pinimg.com/originals/78/f3/4c/78f34c25a0faf5a1a566656b3d2ce10d.jpg",
        "https://images.unsplash.com/photo-1579548122080-c35fd6820ecb?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=2000&fit=max&ixid=eyJhcHBfaWQiOjExNzczfQ",
        "https://1.bp.blogspot.com/-J8iTrpIWg54/XkuCYVr5URI/AAAAAAAANzc/FR9bu1icH98WffWiVfFqQLgTGz16Bw5WgCLcBGAsYHQ/s1920/Soft%2BGradient%2BBackground.jpg",
        "https://img5.goodfon.ru/wallpaper/nbig/f/b6/gradient-abstraktsiia-sinii-linii-background.jpg",
        "https://cdn.dribbble.com/users/156849/screenshots/6993098/32.gif",
        "https://png.pngtree.com/thumb_back/fw800/background/20190223/ourmid/pngtree-full-3d-radial-gradient-background-redcreative-backgroundcolored-radiation-image_84559.jpg"
    )

    val avatarUrls = arrayOf(
        "https://mymodernmet.com/wp/wp-content/uploads/archive/9YPBjDyXBmK6zd25PAM1_gesichtermix14.jpg",
        "https://static.artfido.com/2018/07/two-celebs-one-face-003.jpg",
        "https://s2.r29static.com/bin/entry/ad0/x,80/1536762/image.jpg",
        "https://thechive.com/wp-content/uploads/2020/03/celebrity-celeb-face-morphs-photoshop15.jpg",
        "https://i.pinimg.com/736x/8d/05/c0/8d05c073111a8246d5fdbf5b3e338108--john-travolta-tom-cruise.jpg",
        "https://hips.hearstapps.com/amv-prod-gp.s3.amazonaws.com/gearpatrol/wp-content/uploads/2019/10/Buy-a-Kia-Telluride-Instead-gear-patrol-slide-1.jpg",
        "https://media.wired.com/photos/5d09594a62bcb0c9752779d9/1:1/w_1500,h_1500,c_limit/Transpo_G70_TA-518126.jpg",
        "https://cdn1.buyacar.co.uk/sites/buyacar/files/styles/w860/public/range-rover-evoque-1.jpg",
        "https://arbordayblog.org/wp-content/uploads/2018/06/oak-tree-sunset-iStock-477164218.jpg"
    )
}