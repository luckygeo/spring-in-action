package me.spring.mvc.interfaces;



import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created on 2017/8/7
 */
public class Spittle {


    @NotNull
    @Min(5)
    @Max(10)
    private Long id;

    @NotNull
    @Size(min = 0,max = 2)
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

    public Spittle() {
    }
}
