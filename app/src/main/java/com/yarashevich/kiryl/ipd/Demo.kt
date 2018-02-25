package com.yarashevich.kiryl.ipd

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.support.v4.content.ContextCompat
import android.widget.Toast

import com.example.library.items.MaterialAboutActionItem
import com.example.library.items.MaterialAboutItemOnClickAction
import com.example.library.items.MaterialAboutTitleItem
import com.example.library.model.MaterialAboutCard
import com.example.library.model.MaterialAboutList
import com.example.library.ConvenienceBuilder
import com.example.library.util.OpenSourceLicense
import com.mikepenz.community_material_typeface_library.CommunityMaterial
import com.mikepenz.google_material_typeface_library.GoogleMaterial
import com.mikepenz.iconics.IconicsDrawable

object Demo {

    fun createMaterialAboutList(c: Context, colorIcon: Int, theme: Int): MaterialAboutList {
        val appCardBuilder = MaterialAboutCard.Builder()

        // Add items to card

        appCardBuilder.addItem(MaterialAboutTitleItem.Builder()
                .text("О программе:")
                .desc("© 2016 Kirill Yaroshevich")
                .icon(R.mipmap.kkkk)
                .build())

        try {

            appCardBuilder.addItem(ConvenienceBuilder.createVersionActionItem(c,
                    IconicsDrawable(c)
                            .icon(GoogleMaterial.Icon.gmd_info_outline)
                            .color(ContextCompat.getColor(c, colorIcon))
                            .sizeDp(18),
                    "Версия",
                    false))

        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }

        appCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Список изменений")
                .icon(R.drawable.ic_history_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebViewDialogOnClickAction(c, "Список изменений программы", "https://github.com/kiruha21/IPD3/releases", true, false))
                .build())

        appCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Play Маркет")
                .icon(R.drawable.ic_google_play_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://play.google.com/store/apps/details?id=com.yarashevich.kiryl.ipd")))
                .build())

        appCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Оцените нас")
                .icon(R.drawable.ic_thumb_up_outline_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://play.google.com/store/apps/details?id=com.yarashevich.kiryl.ipd")))
                .build())

        appCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Self-educated person | website")
                .subText("Официальный сайт разработчика")
                .icon(R.drawable.ic_google_chrome_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("http://personalcode.at.ua/")))
                .build())


        val authorCardBuilder = MaterialAboutCard.Builder()
        authorCardBuilder.title("Автор и разработчик:")
        //        authorCardBuilder.titleColor(ContextCompat.getColor(c, R.color.colorAccent));

        authorCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Кирилл Ярошевич (@kiruha_21)")
                .subText("Студент ИПД. Факультет: экономики и бизнеса :)")
                .icon(R.drawable.ic_account_circle_grey600_24dp)
                .build())

        authorCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Профиль на GitHub")
                .icon(IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_github_circle)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://github.com/kiruha21")))
                .build())

        authorCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("ВКонтакте")
                .icon(R.drawable.ic_vk_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://vk.com/kirill_yaroshevich")))
                .build())

        authorCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Instagram")
                .icon(R.drawable.ic_instagram_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://www.instagram.com/kirill_yaroshevich")))
                .build())

        authorCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Telegram")
                .icon(R.drawable.ic_telegram_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("http://telegram.me/kirill_21")))
                .build())

        authorCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Facebook")
                .icon(R.drawable.ic_facebook_box_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://www.facebook.com/jaroschevich")))
                .build())

        val ipdCardBuilder = MaterialAboutCard.Builder()
        ipdCardBuilder.title("Информация о институте:")
        //        authorCardBuilder.titleColor(ContextCompat.getColor(c, R.color.colorAccent));

        ipdCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Сайт института")
                .subText("Официальный сайт института")
                .icon(R.drawable.ic_google_chrome_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("http://www.uoipd.by/ru/")))
                .build())

        ipdCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Подслушано ИПД")
                .subText("Подслушано теперь и в ИПД. Поделись своим секретом, анонимность гарантирована.")
                .icon(R.drawable.ic_vk_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://vk.com/public68692518")))
                .build())

        ipdCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("ВКонтакте")
                .icon(R.drawable.ic_vk_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://vk.com/uoipd_by")))
                .build())

        ipdCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Facebook")
                .icon(R.drawable.ic_facebook_box_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://www.facebook.com/IPDMinsk")))
                .build())

        ipdCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .text("Twitter")
                .icon(R.drawable.ic_twitter_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://twitter.com/uoipd")))
                .build())

        ipdCardBuilder.addItem(ConvenienceBuilder.createEmailItem(c,
                IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_email)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18),
                "Email",
                true,
                "uoipd@tut.by",
                "Отправлено из приложения: ИПД Расписание (https://play.google.com/store/apps/details?id=com.yarashevich.kiryl.ipd)"))

        ipdCardBuilder.addItem(ConvenienceBuilder.createPhoneItem(c,
                IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_phone)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18),
                "Телефон",
                true,
                "+375(017)298-43-59"))

        ipdCardBuilder.addItem(ConvenienceBuilder.createMapItem(c,
                IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_map)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18),
                "Местоположение",
                "г.Минск,ул.Серафимовича,11",
                "г.Минск,ул.Серафимовича,11"))

        val otherCardBuilder = MaterialAboutCard.Builder()
        otherCardBuilder.title("Важно знать:")

        otherCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .icon(IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_attachment)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .text("Институт предпринимательской деятельности“ (ИПД) основан в 1992 году.")
                .subTextHtml("<i>Главная задача института – подготовка специалистов и руководителей высшей квалификации нового типа, свободно ориентирующихся в безбрежных информационных потоках, имеющих фундаментальное профессиональное образование, обладающих высокой культурой интеллектуального и управленческого труда, способных раскрытием своего потенциала содействовать становлению цивилизованных рыночных отношений, развитию демократии и правового государства.</i>")
                .setIconGravity(MaterialAboutActionItem.GRAVITY_TOP)
                .build())

        otherCardBuilder.addItem(MaterialAboutActionItem.Builder()
                .icon(IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_cat)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .text("История развития приложения:")
                .subTextHtml("<i>Это приложение для Android основано мной (Кирилл Ярошевич). Так как во время учёбы приходилось смотреть расписание занятий на сайте в PDF, и постоянно искать какую-то информацию, было написано собственно это приложение. По началу приложение писал ради интереса и для себя, позже начал править ошибки и доводить до ума. Немного позже добавлял информацию которой часто пользовался в институте. В конечном итоге начал распостранять через Google Play для студентов ИПД, и править ошибки приложения дальше.</i>")
                .setIconGravity(MaterialAboutActionItem.GRAVITY_TOP)
                .build())

        return MaterialAboutList(appCardBuilder.build(), authorCardBuilder.build(), ipdCardBuilder.build(), otherCardBuilder.build())
    }
}