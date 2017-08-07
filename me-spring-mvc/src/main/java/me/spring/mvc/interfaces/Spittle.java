package me.spring.mvc.interfaces;

import java.util.Date;

/**
 * Created on 2017/8/7
 */
public class Spittle {
    private Long id;

    private String message;

    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Spittle(String message, Date date) {
        this.message = message;
        this.date = date;
    }
}
