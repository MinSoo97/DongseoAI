package com.example.hackathon2020;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static DBHelper sInstance;

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "Wordbook3.db";

    //단어장 디비 테이블
    private static final String SQL_CREATE_ENTRIES = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s INTEGER DEFAULT 0) ", DbContract.DbEntry.TABLE_NAME, DbContract.DbEntry._ID,
            DbContract.DbEntry.WORDBOOK_NAME_TITLE, DbContract.DbEntry.WORDBOOK_NAME_SUBTITLE, DbContract.DbEntry.PROBLEM_COUNT);
    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + DbContract.DbEntry.TABLE_NAME;

    //단어 디비 테이블
    private static final String SQL_CREATE_ENTRIES2 = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT,  %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT NOT NULL, %s DATE, %s INTEGER DEFAULT 0)",
            DbContract.DbEntry2.TABLE_NAME, DbContract.DbEntry2._ID, DbContract.DbEntry2.WORD_SPELL, DbContract.DbEntry2.WORD_MEAN1, DbContract.DbEntry2.WORD_MEAN2, DbContract.DbEntry2.WORD_MEAN3, DbContract.DbEntry2.WORD_MEAN4,
            DbContract.DbEntry2.WORD_MEAN5, DbContract.DbEntry2.WORDBOOK_ID, DbContract.DbEntry2.DATE, DbContract.DbEntry2.CORRECT_ANSWER);
    private static final String SQL_DELETE_ENTRIES2 = "DROP TABLE IF EXISTS " + DbContract.DbEntry2.TABLE_NAME;

    

}
