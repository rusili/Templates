package nyc.c4q.rusili.utilitytemplates.network.HTTPUrlConnection;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

public class HTTP {
    private static String url;
    private String stringResponse;

    public HTTP (String urlParam) {
        this.url = urlParam;
    }

    // returns a string
    public String getStringResponse () {
        String tempResponse = new String();
        InputStream inputStream = null;
        try {
            inputStream = getInputStream(url);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String inputLine;
        try {
            while ((inputLine = bufferedReader.readLine()) != null) {
                tempResponse += inputLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        stringResponse = tempResponse;
        return tempResponse;
    }

    // returns the string as a JSONObject
    public JSONObject getJSONResponse () {
        JSONObject JSON = null;
        try {
            JSON = new JSONObject(getStringResponse());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return JSON;
    }

    private static InputStream getInputStream (String urlParam) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        URL url = new URL(urlParam);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();

        // Create the SSL connection
        SSLContext sc = null;
        sc = SSLContext.getInstance("TLS");
        sc.init(null, null, new java.security.SecureRandom());
        httpsURLConnection.setSSLSocketFactory(sc.getSocketFactory());

        // set Timeout and method
        httpsURLConnection.setReadTimeout(5000);
        httpsURLConnection.setConnectTimeout(5000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setDoInput(true);

        httpsURLConnection.connect();
        return httpsURLConnection.getInputStream();
    }
}
