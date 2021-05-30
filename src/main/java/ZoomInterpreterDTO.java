import java.io.Serializable;

public class ZoomInterpreterDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public String email;

    public String languages;

    @Override
    public String toString() {
        return "ZoomInterpreterDTO [email=" + getEmail() + ", languages=" + getLanguages() + "]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
