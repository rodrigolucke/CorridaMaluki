package get;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import models.Grid;

/**
 * Created by animesh on 21/11/18.
 */

public class QueryGps {

    private static final String SAMPLE_JSON_RESPONSE = "";


    private QueryGps() {

    }

    public static ArrayList<Grid> extractCarsDetails() {

        ArrayList<Grid> cars = new ArrayList<>();

        try {
            JSONObject jsonRootObject = new JSONObject(SAMPLE_JSON_RESPONSE);
            JSONArray jsonArray = jsonRootObject.getJSONArray("features");

            for (int i = 1; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                JSONObject properties = jsonObject.getJSONObject("properties");

                int rating = Integer.parseInt(properties.optString("rating").toString());
                String product = properties.optString("product").toString();
                String price = properties.optString("price").toString();

                Grid carsDetails = new Grid(rating, product);

                cars.add(carsDetails);

            }


        } catch (JSONException e) {
            Log.e("QueryUtils","Problem loading JSON");
        }

        return cars;

    }


}
