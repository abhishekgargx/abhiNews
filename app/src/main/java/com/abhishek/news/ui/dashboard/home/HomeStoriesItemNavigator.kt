package com.abhishek.news.ui.dashboard.home

import android.view.View
import com.abhishek.news.model.Article

/**
 * Created by Abhishek Garg on 18/05/20 - https://www.linkedin.com/in/abhishekgarg727/
 */
interface HomeStoriesItemNavigator {
    fun onStoriesItemClick(view : View, article: Article)
}