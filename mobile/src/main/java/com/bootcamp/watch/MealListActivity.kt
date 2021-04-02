package com.bootcamp.watch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MealListActivity : AppCompatActivity(), MealListAdapter.Callback {
  private var adapter: MealListAdapter? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val meals = MealStore.fetchMeals(this)
    adapter = MealListAdapter(meals, this)
    list.adapter = adapter
    list.layoutManager = LinearLayoutManager(this)
  }

  override fun mealClicked(meal: com.cielio.shared.Meal) {
    // TODO: Handle this meal click!
  }
}
