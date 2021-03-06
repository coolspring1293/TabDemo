package com.noandroid.familycontacts.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "CITY".
*/
public class CityDao extends AbstractDao<City, Long> {

    public static final String TABLENAME = "CITY";

    /**
     * Properties of entity City.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Province = new Property(1, String.class, "province", false, "PROVINCE");
        public final static Property Cityname = new Property(2, String.class, "cityname", false, "CITYNAME");
        public final static Property WeatherCode = new Property(3, String.class, "weatherCode", false, "WEATHER_CODE");
        public final static Property WeatherInfo = new Property(4, String.class, "weatherInfo", false, "WEATHER_INFO");
        public final static Property Temperature = new Property(5, String.class, "temperature", false, "TEMPERATURE");
    };


    public CityDao(DaoConfig config) {
        super(config);
    }
    
    public CityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"PROVINCE\" TEXT NOT NULL ," + // 1: province
                "\"CITYNAME\" TEXT NOT NULL ," + // 2: cityname
                "\"WEATHER_CODE\" TEXT NOT NULL ," + // 3: weatherCode
                "\"WEATHER_INFO\" TEXT," + // 4: weatherInfo
                "\"TEMPERATURE\" TEXT);"); // 5: temperature
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, City entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getProvince());
        stmt.bindString(3, entity.getCityname());
        stmt.bindString(4, entity.getWeatherCode());
 
        String weatherInfo = entity.getWeatherInfo();
        if (weatherInfo != null) {
            stmt.bindString(5, weatherInfo);
        }
 
        String temperature = entity.getTemperature();
        if (temperature != null) {
            stmt.bindString(6, temperature);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public City readEntity(Cursor cursor, int offset) {
        City entity = new City( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // province
            cursor.getString(offset + 2), // cityname
            cursor.getString(offset + 3), // weatherCode
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // weatherInfo
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // temperature
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, City entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setProvince(cursor.getString(offset + 1));
        entity.setCityname(cursor.getString(offset + 2));
        entity.setWeatherCode(cursor.getString(offset + 3));
        entity.setWeatherInfo(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTemperature(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(City entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(City entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
