package com.example.saad.js;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    Button signin;
    EditText username_signin;
    EditText password_signin;
    String username;
    String password;

    EditText username_signup;
    EditText password_signup;
    EditText repassword_signup;
    EditText dob_signup;
    EditText email_signup;
    CheckBox read_signup;

    ImageView editdp;
    ImageView dp;
    static final int CAM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new FragmentStart(),"0");
        viewPagerAdapter.addFragments(new FragmentOne(),"1");
        viewPagerAdapter.addFragments(new FragmentTwo(),"2");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);



    }
    public void S(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SignInFragmented frag = new SignInFragmented();
        fragmentTransaction.add(R.id.layout1,frag);
        fragmentTransaction.commit();

    }
    public void D(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Signin_Fragment_2 frag = new Signin_Fragment_2();
        fragmentTransaction.add(R.id.layout2,frag);
        fragmentTransaction.commit();

    }
    public void A(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Signin_fragmented_3 frag = new Signin_fragmented_3();
        fragmentTransaction.add(R.id.layout3,frag);
        fragmentTransaction.commit();

    }
    public void Signup1(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Signup_Fragmented fragUp = new Signup_Fragmented();
        fragmentTransaction.add(R.id.layout1,fragUp);
        fragmentTransaction.commit();

    }
    public void Signup2(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Signup_fragmented_2 fragUp = new Signup_fragmented_2();
        fragmentTransaction.add(R.id.layout2,fragUp);
        fragmentTransaction.commit();

    }
    public void Signup3(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Signup_fragmented_3 fragUp = new Signup_fragmented_3();
        fragmentTransaction.add(R.id.layout3,fragUp);
        fragmentTransaction.commit();

    }

    public void ff(View view) {
        Toast.makeText(MainActivity.this, "Back Button Pressed", Toast.LENGTH_SHORT).show();
        //this.getParent().onBackPressed();

        Intent intent = new Intent(this, MainActivity.class);
        // intent.putExtra(web_frag); // so you can pass what activity you're coming from, if needed
        startActivity(intent);
        this.finish();
    }
    public void back_button_signup_2(View view) {
        //this.getParent().onBackPressed();

        //Intent intent = new Intent(this, MainActivity.class);
        // intent.putExtra(web_frag); // so you can pass what activity you're coming from, if needed
        //startActivity(intent);
        //this.finish();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne frag = new FragmentOne();
        fragmentTransaction.add(R.id.layout2,frag);
        fragmentTransaction.commit();
    }
    public void back_button_signup_3(View view) {
        //this.getParent().onBackPressed();

        //Intent intent = new Intent(this, FragmentTwo.class);
        // intent.putExtra(web_frag); // so you can pass what activity you're coming from, if needed
        //startActivity(intent);
        //this.finish();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTwo frag = new FragmentTwo();
        fragmentTransaction.add(R.id.layout3,frag);
        fragmentTransaction.commit();
    }
    public void back_button_signin_2(View view) {
        //this.getParent().onBackPressed();

        //Intent intent = new Intent(this, MainActivity.class);
        // intent.putExtra(web_frag); // so you can pass what activity you're coming from, if needed
        //startActivity(intent);
        //this.finish();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne frag = new FragmentOne();
        fragmentTransaction.add(R.id.layout2,frag);
        fragmentTransaction.commit();
    }
    public void back_button_signin_3(View view) {
        //this.getParent().onBackPressed();

        //Intent intent = new Intent(this, MainActivity.class);
        // intent.putExtra(web_frag); // so you can pass what activity you're coming from, if needed
        //startActivity(intent);
        //this.finish();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTwo frag = new FragmentTwo();
        fragmentTransaction.add(R.id.layout3,frag);
        fragmentTransaction.commit();
    }
    public void clear1(View view){
        username_signin = (EditText)findViewById(R.id.username_signin);
        username_signin.setText(" ");
    }

    public void clear2(View view){
        password_signin = (EditText)findViewById(R.id.password_signin);
        password_signin.setText(" ");
    }
    public void signin_Button_clicked(View view){
        username_signin = (EditText)findViewById(R.id.username_signin);
        password_signin = (EditText)findViewById(R.id.password_signin);
        username = username_signin.getText().toString();
        password= password_signin.getText().toString();
        Toast.makeText(MainActivity.this," Hello "+username+" ",Toast.LENGTH_SHORT).show();
    }
    public void clear_signup_username(View view){

    }
    public void camera(View view){
        dp = (ImageView)findViewById(R.id.dp);
        editdp = (ImageView)findViewById(R.id.dpedit);
       Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File file = getfile();
        camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
        startActivityForResult(camera_intent,CAM_REQUEST);

    }
    private File getfile(){
        File folder = new File("sdcard/camera_app");
        if(!folder.exists()){
            folder.mkdir();
        }
        File image_file = new File(folder,"cam_image.jpg");
        return image_file;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String path = "sdcard/camera_app/cam_image.jpg";
        dp.setImageDrawable(Drawable.createFromPath(path));
    }
}
