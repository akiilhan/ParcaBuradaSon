package com.example.parcaburada

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener,MyItemClickListener {


    private lateinit var mToolbar: Toolbar
    private lateinit var mDrawerLayout: DrawerLayout
    private lateinit var mNavController: NavController
    private lateinit var mNavigationView: NavigationView
    private lateinit var mFloatingActionButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpNavigation()
    }

    private fun setUpNavigation() {
        //Toolbar
        mToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mToolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        //Toolbar

        //Navigation Drawer
        mDrawerLayout = findViewById(R.id.drawer_layout)
        mNavigationView = findViewById(R.id.nav_view)
        mNavController = Navigation.findNavController(this@MainActivity, R.id.nav_host_fragment)

        NavigationUI.setupActionBarWithNavController(this@MainActivity, mNavController, mDrawerLayout)
        NavigationUI.setupWithNavController(mNavigationView, mNavController)
        mNavigationView.setNavigationItemSelectedListener(this)
        //Navigation Drawer

        //Floating Action button
        mFloatingActionButton = findViewById(R.id.fab)
        mFloatingActionButton.setOnClickListener { _ ->
            //Snackbar.make(view, getString(R.string.text_fab_action), Snackbar.LENGTH_LONG)
            //  .setAction(getString(R.string.text_action), null).show()
        }
        //Floating Action button
    }

    //Transition between fragments controller
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(mNavController, mDrawerLayout)
    }

    //Navigation Drawer Controller
    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        menuItem.isChecked = true
        mDrawerLayout.closeDrawers()

        when (menuItem.itemId) {
            R.id.nav_home -> navigateToFragment(R.id.nav_home)
            R.id.nav_gallery -> navigateToFragment(R.id.nav_gallery)
            R.id.nav_slideshow -> navigateToFragment(R.id.nav_slideshow)
            R.id.nav_tools -> navigateToFragment(R.id.nav_tools)
            R.id.nav_share -> navigateToFragment(R.id.nav_share)
            R.id.nav_send -> navigateToFragment(R.id.nav_send)
            R.id.nav_sepet -> navigateToFragment(R.id.nav_sepet)
        }
        return true
    }

    //Back button
    override fun onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.END)
        } else {
            super.onBackPressed()
        }
    }

    //Toolbar icon controller
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.shop -> navigateToFragment(R.id.nav_sepet)
        }
        return super.onOptionsItemSelected(item)
    }
    //Toolbar icon controller

    //Custom method to navigate to fragments
    private fun navigateToFragment(fragmentName: Int): Boolean {
        mNavController.navigate(fragmentName)
        return true
    }

    override fun userItemClick(position: Int) {
        //super.userItemClick(position) No need of it.
        when (position) {
            0 ->{

                Log.e("aki","opel: "+position)
            } //start a fragment
                1 ->{ Log.e("aki","chevrolet: "+position)} //start a fragment
        }
    }
}