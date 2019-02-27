package com.example.roomdatabaseapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertFragment extends Fragment implements View.OnClickListener {
    EditText bookIdEditText,bookNameEditText,authorNameEditText,quantityEditText;
    Button saveButton;

    public InsertFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view=inflater.inflate(R.layout.fragment_insert, container, false);
        bookIdEditText=view.findViewById(R.id.book_id);
        bookNameEditText=view.findViewById(R.id.book_name);
        authorNameEditText=view.findViewById(R.id.author_name);
        quantityEditText=view.findViewById(R.id.quantity);
        saveButton=view.findViewById(R.id.save);
        saveButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view)
    {
        int bookId=Integer.parseInt(bookIdEditText.getText().toString());
        String bookName=bookNameEditText.getText().toString();
        String authorName=authorNameEditText.getText().toString();
        int quantity=Integer.parseInt(quantityEditText.getText().toString());
        Book book=new Book();
        book.setBookId(bookId);
        book.setBookName(bookName);
        book.setAuthorName(authorName);
        book.setQuantity(quantity);
        MainActivity.myDatabaseApp.myDao().insert(book);
        Toast.makeText(getContext(),"insertion successful",Toast.LENGTH_SHORT).show();
        bookIdEditText.setText("");
        bookNameEditText.setText("");
        authorNameEditText.setText("");
        quantityEditText.setText("");
    }
}
