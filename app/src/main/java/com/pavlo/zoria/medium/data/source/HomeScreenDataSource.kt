package com.pavlo.zoria.medium.data.source

import com.pavlo.zoria.medium.R
import com.pavlo.zoria.medium.data.Category
import com.pavlo.zoria.medium.data.HomeScreen

object HomeScreenDataSource: DataSource<HomeScreen> {
    private val list by lazy{
        setUpHomeScreen()
    }

    private fun setUpHomeScreen(): HomeScreen {
        val categories = mutableListOf<Category>()
        categories.add(Category( "Winter", R.drawable.ic_baseline_ac_unit_24, MovieDataSource.movies))
        categories.add(Category( "Government", R.drawable.ic_baseline_account_balance_24, MovieDataSource.movies))
        categories.add(Category( "Account", R.drawable.ic_baseline_assignment_ind_24, MovieDataSource.movies))
        categories.add(Category( "Commute", R.drawable.ic_baseline_commute_24, MovieDataSource.movies))
        categories.add(Category( "Fireplace", R.drawable.ic_baseline_fireplace_24, MovieDataSource.movies))
        categories.add(Category( "Feedback", R.drawable.ic_baseline_feedback_24, FeedbackDataSource.getData()))
        return HomeScreen("Home Screen", categories)
    }

    override fun getData(): HomeScreen = list

    override fun getById(id: Long): HomeScreen? {
        TODO("Not yet implemented")
    }
}