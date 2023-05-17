package com.example.databinding_demo;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Man_bindable extends BaseObservable {
    private String name;
    private String level;

    public Man_bindable(String name, String level) {
        this.name = name;
        this.level = level;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
        notifyPropertyChanged(BR.level);
    }
}
