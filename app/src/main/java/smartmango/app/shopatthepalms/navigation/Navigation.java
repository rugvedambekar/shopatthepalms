package smartmango.app.shopatthepalms.navigation;

import java.util.HashMap;
import java.util.List;

/**
 * Created by rugve on 11/29/2017.
 */

public class Navigation {

//    private static Navigation mInstance;
//
//    public static Navigation getInstance() {
//        if (mInstance == null) mInstance = new Navigation();
//        return mInstance;
//    }
//
//
//    private final HashMap<Group, List<Item>> mGroupCount;
//
//    private Navigation() {
//        mGroupCount = new HashMap<>();
//
//        for (Item item : Item.values()) {
//            if (item.group.equals(Group.None)) mGroupCount.put(item)
//        }
//    }

    public enum Item {
        Settings, RecentOrders(-1, "Recent Orders");

        final int imgId;
        final String title;

        Item() {
            imgId = -1;
            title = null;
        }

        Item(int i, String t) {
            title = t;
            imgId = i;
        }

    }


    public enum Group {
        Home,
        Search,
        Sales,

        MyAccount("My Account", Item.Settings, Item.RecentOrders);

        final int imgId;
        final String title;

        final Item[] subItems;

        Group() {
            imgId = -1;
            title = name();
            subItems = new Item[0];
        }

        Group(Item... sItems) {
            imgId = -1;
            title = name();
            subItems = sItems;
        }

        Group(String t, Item... sItems) {
            imgId = -1;
            title = t;
            subItems = sItems;
        }

    }
}
