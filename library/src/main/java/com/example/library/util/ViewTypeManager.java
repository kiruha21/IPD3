package com.example.library.util;

import android.content.Context;
import android.view.View;

import com.example.library.holders.MaterialAboutItemViewHolder;
import com.example.library.items.MaterialAboutItem;

public abstract class ViewTypeManager {

    public static final class ItemType {
        public static final int ACTION_ITEM = 0;
        public static final int TITLE_ITEM = 1;
    }

    public static final class ItemLayout {
        public static final int ACTION_LAYOUT = com.example.library.R.layout.mal_material_about_action_item;
        public static final int TITLE_LAYOUT = com.example.library.R.layout.mal_material_about_title_item;
    }

    public abstract int getLayout(int itemType);

    public abstract MaterialAboutItemViewHolder getViewHolder(int itemType, View view);

    public abstract void setupItem(int itemType, MaterialAboutItemViewHolder holder, MaterialAboutItem item, Context context);
}
