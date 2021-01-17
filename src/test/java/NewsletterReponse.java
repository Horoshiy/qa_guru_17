import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsletterReponse {
    @JsonProperty("Success")
    private boolean success;

    @JsonProperty("Success")
    public boolean isSuccess() {
        return success;
    }

    @JsonProperty("Success")
    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "NewsletterReponse{" +
                "success=" + success +
                '}';
    }
}
