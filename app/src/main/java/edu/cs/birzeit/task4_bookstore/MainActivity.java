package edu.cs.birzeit.task4_bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import edu.cs.birzeit.task4_bookstore.model.Book;
import edu.cs.birzeit.task4_bookstore.model.BookFactor;
import edu.cs.birzeit.task4_bookstore.model.iIBookDA;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        populateSpinner();
    }
    private void populateSpinner() {
        BookFactor factory = new BookFactor();
        iIBookDA objBook = factory.getModel();

        String[] cats = objBook.getCategories();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, cats);

        spinner.setAdapter(adapter);
    }
    public void btnBookOnClick(View view) {
        BookFactor factory = new BookFactor();
        iIBookDA objBook = factory.getModel();

        String item  = "";
        item = spinner.getSelectedItem().toString();
        List<Book> Books = objBook.getBooks(item);
        String str="";
        for (Book b:Books)
            str+=b.getTitle()+"\n";
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();


    }
}