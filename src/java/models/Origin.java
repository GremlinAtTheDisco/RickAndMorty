package models;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Origin implements Serializable {

    private String name;
    private String url;

    public Origin(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Origin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Origin{" + "name=" + name + '}';
    }

}
