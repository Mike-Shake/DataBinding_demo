package com.example.databinding_demo;

import androidx.databinding.ObservableField;

public class Man_ObservableField {
    public ObservableField<String> name=new ObservableField<>();
    public ObservableField<String> level=new ObservableField<>();

    public Man_ObservableField(String name,String level) {
        this.name.set(name);
        this.level.set(level);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<String> getLevel() {
        return level;
    }

    public void setLevel(ObservableField<String> level) {
        this.level = level;
    }
}
