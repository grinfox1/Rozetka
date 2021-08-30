package api.model.response;

import api.model.request.CreateItemRequest;
import api.model.request.UpdateItemRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateItemResponse {

    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private String result;

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
