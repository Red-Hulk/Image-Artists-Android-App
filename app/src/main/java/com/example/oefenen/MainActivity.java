package com.example.oefenen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Emma Watson", "emma@hotmail.com", "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/actress-bella-thorne-walks-the-red-carpet-ahead-of-the-news-photo-1598966727.jpg"));
        contacts.add(new Contact("Bella Thorne", "thorne@hotmail.com", "https://static.wikia.nocookie.net/disney/images/a/a5/Bella_Thorne.jpg"));
        contacts.add(new Contact("Selena Gomez", "selena@hotmail.com", "https://www.rtlboulevard.nl/sites/default/files/content/images/2020/12/31/selena%20Gomez.jpg"));
        contacts.add(new Contact("Ariana Grande", "ariana@hotmail.com", "https://www.digifotopro.nl/sites/default/files/styles/article-image/public/502f7f90-5a1f-4b15-8015-9bbf55f502a3.jpg"));
        contacts.add(new Contact("Lorde", "lorde@hotmail.com", "https://images.squarespace-cdn.com/content/v1/5817f843579fb366cecb8e9a/1508543973071-KZ23ZJ7MAE2H5TERW64T/ke17ZwdGBToddI8pDm48kKG6OoQUcDwE6Xrn0CktdYIUqsxRUqqbr1mOJYKfIPR7LoDQ9mXPOjoJoqy81S2I8N_N4V1vUb5AoIIIbLZhVYxCRW4BPu10St3TBAUQYVKc7wdBxA2FfWIL_oInLxCuGYBExGLaY8v4Pn7yFeMELUKe4DQXRx1Bu1AnCO9mIfj2/lorde.jpg"));

        ContactRecViewAdapter adapter = new ContactRecViewAdapter(this);
        adapter.setContacts(contacts);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}