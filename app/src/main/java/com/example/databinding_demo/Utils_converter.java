package com.example.databinding_demo;

import androidx.databinding.BindingConversion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils_converter {
    @BindingConversion
    public static String converDate(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }
}
