package mx.com.example.commons.to;

import java.io.Serializable;
import java.util.Date;

public class EventBase implements Serializable {
    private String uuid;
    private Date dateTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
