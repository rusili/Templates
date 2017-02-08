package nyc.c4q.rusili.utilitytemplates.network.HTTPUrlConnection;

import android.os.AsyncTask;

import org.json.JSONObject;

public class GetHTTP extends AsyncTask<String, Void, JSONObject> {
    private NetworkListener networkListener;

    public GetHTTP(NetworkListener networkListenerParam){
        this.networkListener = networkListenerParam;
    }

    @Override
    protected JSONObject doInBackground (String... params) {
        return null;
    }

    @Override
    protected void onPostExecute (JSONObject jsonObject) {
        super.onPostExecute(jsonObject);
        networkListener.onDataRetrieved(jsonObject);
        networkListener = null;
    }
}
