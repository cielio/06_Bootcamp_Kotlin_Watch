package com.bootcamp.watch

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader

object MealStore {

  fun fetchMeals(context: Context): MutableList<com.cielio.shared.Meal> {
    val stream = context.resources.openRawResource(R.raw.meals)
    val reader = BufferedReader(InputStreamReader(stream, "UTF-8"))
    val listType = object : TypeToken<ArrayList<com.cielio.shared.Meal>>() {}.type
    return Gson().fromJson(reader, listType)
  }
}