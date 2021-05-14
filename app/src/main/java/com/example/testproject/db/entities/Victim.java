package com.example.testproject.db.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

import lombok.Data;


@Entity
@Data
public class Victim implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int id_victim;

    public String lastname;
    public String firstname;
    public String middle_name;
    public String gender;
    public String birthday;
    public String passport;
    public String citizenship;
    public String social_status;
    public String official_position;
    public String phone;

    public Victim() {
    }

}
