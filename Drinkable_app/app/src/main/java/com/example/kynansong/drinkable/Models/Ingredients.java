package com.example.kynansong.drinkable.Models;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ListView;

import com.example.kynansong.drinkable.Repo.IngredientsRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kynansong on 19/11/2017.
 */

public class Ingredients {


    private Integer ingredientID;
    private String ingredientNAME;

    public Ingredients(Integer ingredientID, String ingredientNAME) {
        this.ingredientID = ingredientID;
        this.ingredientNAME = ingredientNAME;
    }

    public Integer getIngredientID() {
        return ingredientID;
    }

    public String getIngredientName(){
        return ingredientNAME;
    }

    public void setIngredientName(String ingredient){
        this.ingredientNAME = ingredient;
    }


    public void setingredientID(Integer id) {
        this.ingredientID = id;
    }
}
