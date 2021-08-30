package api.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateItemResponse {

    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private CreateResult result;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateResult getCreateResult() {
        return result;
    }

    public void setCreateResult(CreateResult result) {
        this.result = result;
    }

}
