package com.kossine.pizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPizzaList;
    private PizzaListAdapter pizzaListAdapter;

    private void populatePizzas() {
        List<Pizza> pizzaList = new ArrayList<>();

        Pizza pizza = new Pizza();
        pizza.setDescription("Red capsicum, Baby corn, Tomato");
        pizza.setName("Red pizza");
        pizza.setImageUrl("https://thumbs.dreamstime.com/b/vector-pizza-icon-white-61129638.jpg");
        pizza.setPrice(20.0);
        pizzaList.add(pizza);

        pizza = new Pizza();
        pizza.setDescription("Paneer, Baby corn, Tomato");
        pizza.setName("Panner pizza");
        pizza.setPrice(200.0);
        pizza.setImageUrl("http://downloadicons.net/sites/default/files/pizza-icon-65951.png");
        pizzaList.add(pizza);

        pizza = new Pizza();
        pizza.setDescription("Chicken, Baby corn, Tomato");
        pizza.setName("Chicken pizza");
        pizza.setPrice(2.0);
        pizzaList.add(pizza);

        pizzaListAdapter.addPizzas(pizzaList);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initView();
        populatePizzas();
    }

    private void init() {
        pizzaListAdapter = new PizzaListAdapter(this);

    }

    private void initView() {
        rvPizzaList = findViewById(R.id.rv_pizza_list);
        rvPizzaList.setAdapter(pizzaListAdapter);
        rvPizzaList.setLayoutManager(new LinearLayoutManager(this));
    }
}
