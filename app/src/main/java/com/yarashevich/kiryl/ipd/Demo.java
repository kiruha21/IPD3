package com.yarashevich.kiryl.ipd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.content.ContextCompat;

import com.example.library.items.MaterialAboutActionItem;
import com.example.library.items.MaterialAboutTitleItem;
import com.example.library.model.MaterialAboutCard;
import com.example.library.model.MaterialAboutList;
import com.example.library.ConvenienceBuilder;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;

public class Demo {

    public static MaterialAboutList createMaterialAboutList(final Context c, final int colorIcon, final int theme) {
        MaterialAboutCard.Builder appCardBuilder = new MaterialAboutCard.Builder();

        // Add items to card

        appCardBuilder.addItem(new MaterialAboutTitleItem.Builder()
                .text("О программе:")
                .desc("© 2016 Kirill Yaroshevich")
                .icon(R.mipmap.kkkk)
                .build());

        try {

            appCardBuilder.addItem(ConvenienceBuilder.createVersionActionItem(c,
                    new IconicsDrawable(c)
                            .icon(GoogleMaterial.Icon.gmd_info_outline)
                            .color(ContextCompat.getColor(c, colorIcon))
                            .sizeDp(18),
                    "Версия",
                    false));

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        appCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Play Маркет")
                .icon(R.mipmap.play)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://play.google.com/store/apps/details?id=com.yarashevich.kiryl.ipd")))
                .build());

        appCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Personalcode | Персональный сайт автора")
                .icon(R.mipmap.chrome)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("http://personalcode.at.ua/")))
                .build());




        MaterialAboutCard.Builder authorCardBuilder = new MaterialAboutCard.Builder();
        authorCardBuilder.title("Автор и разработчик:");
//        authorCardBuilder.titleColor(ContextCompat.getColor(c, R.color.colorAccent));

        authorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Кирилл Ярошевич (@kiruha_21)")
                .subText("Студент ИПД. Факультет: экономики и бизнеса :)")
                .icon(R.drawable.ic_account_circle_grey600_24dp)
                .build());

        authorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("ВКонтакте")
                .icon(R.drawable.ic_vk_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://vk.com/kirill_yaroshevich")))
                .build());

        authorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Instagram")
                .icon(R.drawable.ic_instagram_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://www.instagram.com/kirill_yaroshevich")))
                .build());

        authorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Telegram")
                .icon(R.drawable.ic_telegram_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("http://telegram.me/kirill_21")))
                .build());

        authorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Facebook")
                .icon(R.drawable.ic_facebook_box_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://www.facebook.com/jaroschevich")))
                .build());

        MaterialAboutCard.Builder ipdCardBuilder = new MaterialAboutCard.Builder();
        ipdCardBuilder.title("Информация о институте:");
//        authorCardBuilder.titleColor(ContextCompat.getColor(c, R.color.colorAccent));

       ipdCardBuilder.addItem(new MaterialAboutActionItem.Builder()
               .text("Сайт института")
               .icon(R.drawable.ic_google_chrome_grey600_24dp)
               .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("http://www.uoipd.by/ru/")))
               .build());

        ipdCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("ВКонтакте")
                .icon(R.drawable.ic_vk_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://vk.com/uoipd_by")))
                .build());

        ipdCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Facebook")
                .icon(R.drawable.ic_facebook_box_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://www.facebook.com/IPDMinsk")))
                .build());

        ipdCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Twitter")
                .icon(R.drawable.ic_twitter_grey600_24dp)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://twitter.com/uoipd")))
                .build());

        ipdCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Email")
                .subText("uoipd@tut.by")
                .icon(R.drawable.ic_email_outline_grey600_24dp)
                .build());

        ipdCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Телефон")
                .subText("+375(017)298-43-59")
                .icon(R.drawable.ic_deskphone_grey600_24dp)
                .build());

        ipdCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Местоположение")
                .subText("г.Минск,ул.Серафимовича,11")
                .icon(R.drawable.ic_crosshairs_gps_grey600_24dp)
                .build());



        MaterialAboutCard.Builder otherCardBuilder = new MaterialAboutCard.Builder();
        otherCardBuilder.title("Важно знать:");

        otherCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .icon(new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_attachment)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .text("”Институт предпринимательской деятельности“ (ИПД) основан в 1992 году.")
                .subTextHtml("<i>Главная задача института – подготовка специалистов и руководителей высшей квалификации нового типа, свободно ориентирующихся в безбрежных информационных потоках, имеющих фундаментальное профессиональное образование, обладающих высокой культурой интеллектуального и управленческого труда, способных раскрытием своего потенциала содействовать становлению цивилизованных рыночных отношений, развитию демократии и правового государства.</i>")
                .setIconGravity(MaterialAboutActionItem.GRAVITY_TOP)
                .build());

        return new MaterialAboutList(appCardBuilder.build(), authorCardBuilder.build(), ipdCardBuilder.build(), otherCardBuilder.build());
    }
}