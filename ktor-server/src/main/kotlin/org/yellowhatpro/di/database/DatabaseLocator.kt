package org.yellowhatpro.di.database

import org.yellowhatpro.db.Database
import org.yellowhatpro.db.DatabaseImpl

object DatabaseLocator {
    private fun providesClientName():String{
        return "todo"
    }
    fun provideDatabase(): Database {
        return DatabaseImpl(providesClientName())
    }
}