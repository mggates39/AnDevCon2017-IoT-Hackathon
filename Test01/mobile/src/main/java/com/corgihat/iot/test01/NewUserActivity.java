package com.corgihat.iot.test01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import com.corgihat.iot.test01.models.User;

public class NewUserActivity extends AppCompatActivity {
    private static final String TAG = NewUserActivity.class.getSimpleName();

    private DatabaseReference mDatabase;
    private ValueEventListener valueEventListener;
    private FirebaseAuth mAuth;
    private String uid;

    private TextView txtUserName, txtEmail;
    private EditText inputFullName, inputPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtUserName = (TextView) findViewById(R.id.textUserName);
        txtEmail = (TextView) findViewById(R.id.textUserEmail);
        inputFullName = (EditText) findViewById(R.id.editUserFullName);
        inputPhoneNumber = (EditText) findViewById(R.id.editUserPhone);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();

        uid = mAuth.getCurrentUser().getUid();
        Log.d(TAG, "User ID: " + uid);

        valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);

                // Check for null
                if (user == null) {
                    Log.e(TAG, "User data is null!");
                    return;
                }

                Log.d(TAG, "User name: " + user.getUsername() + ", email " + user.getEmail());

                updateUserInterface(user);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("Failed to read user: " + databaseError.getCode());
            }
        };

        mDatabase.child("users").child(uid).addValueEventListener(valueEventListener);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = inputFullName.getText().toString();
                String phoneNumber = inputPhoneNumber.getText().toString();
                Log.d(TAG, "Update User User ID: " + uid + " fullname: " + fullName);
                mDatabase.child("users").child(uid).child("fullname").setValue(fullName);
                mDatabase.child("users").child(uid).child("phone").setValue(phoneNumber);

                Toast.makeText(view.getContext(), getString(R.string.user_saved), Toast.LENGTH_LONG).show();

                NewUserActivity.this.finish();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    protected void onStop() {
        mDatabase.child("users").child(uid).removeEventListener(valueEventListener);

        super.onStop();
    }

    protected void updateUserInterface(User user)
    {
        Log.d(TAG, "Update User Interfaces User ID: " + uid + " username: " + user.getUsername());
        String userName = getString(R.string.user_name_placeholder, user.getUsername());
        txtUserName.setText(userName);

        String email = getString(R.string.user_email_placeholder, user.getEmail());
        txtEmail.setText(email);

        inputFullName.setText(user.getFullname());
        inputPhoneNumber.setText(user.getPhone());

    }
}
