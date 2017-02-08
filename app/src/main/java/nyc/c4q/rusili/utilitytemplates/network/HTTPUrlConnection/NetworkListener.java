package nyc.c4q.rusili.utilitytemplates.network.HTTPUrlConnection;

import org.json.JSONObject;

public interface NetworkListener {
    public void onDataRetrieved(JSONObject jsonObject);
}
