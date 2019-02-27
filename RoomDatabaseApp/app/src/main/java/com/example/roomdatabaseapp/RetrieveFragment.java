package com.example.roomdatabaseapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RetrieveFragment extends Fragment {
    TextView textView;

    public RetrieveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_retrieve, container, false);
        textView = view.findViewById(R.id.text);
        List<Book> books = MainActivity.myDatabaseApp.myDao().retrieve();
        String retrievedData = "";
        for (Book book : books) {
            int bookId = book.getBookId();
            String bookName = book.getBookName();
            String authorName = book.getAuthorName();
            int quantity = book.getQuantity();
            retrievedData = retrievedData+"\n\nBookId: "+bookId+"\nBookName: "+bookName
                    +"\nAuthorName: "+authorName+"\nQuantity: "+quantity;
        }
        textView.setText(retrievedData);
        return view;
    }
}
