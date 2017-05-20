package com.henri.springlearn.springlearn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Created by Propriétaire on 20/05/2017.
 */

@Entity
public class Image {
    @Id @GeneratedValue
    private long Id;

    private String name;

    private Image() {}

    private Image(String name) {
        this.name=name;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
