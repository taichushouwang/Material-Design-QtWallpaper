package us.wili.qtwallpaper.utils;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.widget.SwipeRefreshLayout;

/**
 * UI
 * Created by qiu on 1/10/16.
 */
public class UIUtils {

    public static void changeRefreshLayoutColor(SwipeRefreshLayout refreshLayout) {
        refreshLayout.setColorSchemeResources(android.R.color.holo_green_light,
                android.R.color.holo_blue_light, android.R.color.holo_orange_light,
                android.R.color.holo_purple);
    }

    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dipValue * scale + 0.5f);
    }

    public static int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            return resources.getDimensionPixelSize(resourceId);
        }
        return 0;
    }
}
