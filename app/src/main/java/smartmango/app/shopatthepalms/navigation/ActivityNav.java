package smartmango.app.shopatthepalms.navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import smartmango.app.shopatthepalms.R;
import smartmango.app.shopatthepalms.ActivityBase;

/**
 * Created by rugve on 11/29/2017.
 */

public class ActivityNav extends ActivityBase {

    //region View Injections

    @BindView(R.id.layoutDrawer)
    private DrawerLayout mDrawer;

    @BindView(R.id.toolbar)
    private Toolbar mToolbar;

    @BindView(R.id.listViewNav)
    private ExpandableListView mNavLV;

    @BindView(R.id.containerMain)
    private FrameLayout mMainContainer;

    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);

        } else super.onBackPressed();
    }


}
