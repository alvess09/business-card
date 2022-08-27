package com.alvesariel.businesscard

import android.app.Application
import com.alvesariel.businesscard.data.AppDatabase
import com.alvesariel.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}