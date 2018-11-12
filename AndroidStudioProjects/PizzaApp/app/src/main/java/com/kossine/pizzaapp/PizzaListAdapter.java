package com.kossine.pizzaapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 1/7/18.
 */
public class PizzaListAdapter extends RecyclerView.Adapter<PizzaListAdapter.PizzaViewHolder> {

    private LayoutInflater layoutInflater;
    private List<Pizza> pizzaList;


    public PizzaListAdapter(Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        pizzaList = new ArrayList<>();
    }

    public void addPizzas(List<Pizza> pizzaList) {
        this.pizzaList.clear();
        this.pizzaList.addAll(pizzaList);
        this.pizzaList.addAll(pizzaList);
        this.pizzaList.addAll(pizzaList);
        this.pizzaList.addAll(pizzaList);
        notifyDataSetChanged();
    }

    @Override
    public PizzaListAdapter.PizzaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.pizza, parent, false);
        return new PizzaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PizzaListAdapter.PizzaViewHolder holder, int position) {

        Pizza pizza = pizzaList.get(position);
        holder.bind(pizza);
    }


    @Override
    public int getItemCount() {
        return pizzaList.size();
    }
    public class PizzaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgPizza;
        private TextView txtPizzaName;
        private TextView txtPizzaDescription;
        private TextView txtPizzaPrice;
        private Button btnAdd;

        public void bind(Pizza pizza) {
            txtPizzaName.setText(pizza.getName());
            txtPizzaDescription.setText(pizza.getDescription());
            txtPizzaPrice.setText(pizza.getPrice().toString());

            Picasso
                    .get()
                    .load(pizza.getImageUrl())
                    .placeholder(R.drawable.pizza2)
                    .error(R.drawable.pizza).into(imgPizza);
        }

        public PizzaViewHolder(View itemView) {
            super(itemView);
            imgPizza = itemView.findViewById(R.id.img_pizza_image);
            txtPizzaName = itemView.findViewById(R.id.txt_pizza_name);
            txtPizzaDescription = itemView.findViewById(R.id.txt_pizza_description);
            txtPizzaPrice = itemView.findViewById(R.id.txt_price);
            btnAdd = itemView.findViewById(R.id.btn_add);
            btnAdd.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v){

                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
