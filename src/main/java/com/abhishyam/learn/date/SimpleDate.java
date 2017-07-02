package com.abhishyam.learn.date;

import java.util.Date;

/**
 * Created by Rachana Rao on 7/2/2017.
 */
public class SimpleDate {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SimpleDate{");
        sb.append("date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
