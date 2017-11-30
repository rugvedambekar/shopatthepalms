package smartmango.app.shopatthepalms.navigation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;

/**
 * Created by rugve on 11/29/2017.
 */

public class ExpandableNavAdapter extends BaseExpandableListAdapter {

    ExpandableNavAdapter() {

    }

    @Override
    public int getGroupCount() {
        return Navigation.Group.values().length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return Navigation.Group.values()[groupPosition].subItems.length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Navigation.Group.values()[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return Navigation.Group.values()[groupPosition].subItems[childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
