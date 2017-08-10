package sg.edu.rp.webservices.p12_mydatabook;

import java.io.Serializable;

/**
 * Created by 15039840 on 10/8/2017.
 */

public class Content implements Serializable {
    private int id;
    private String content;

    public Content(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
