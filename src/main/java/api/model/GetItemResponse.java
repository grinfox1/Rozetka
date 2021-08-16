package api.model;

import com.google.gson.annotations.SerializedName;

public class GetItemResponse {

    @SerializedName("method")
    private String method;
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private ResultItem result;

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

    public ResultItem getResult() {
        return result;
    }

    public void setResult(ResultItem result) {
        this.result = result;
    }

}
