package edu.mnstate.wy5094ho.tekieproject;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.jar.JarException;

/**
 * Created by wy5094ho on 10/18/2017.
 */

public class menu {
    private String id;

    public menu(){}

    public menu (String tmpid){
        this.setId(tmpid);

    }

    public String getId() {return id;}
    public void setId(String id) {this.id=id;}


    public static ArrayList<menu> createmenudata(String js,Context con)throws JSONException{
        final ArrayList<menu> mylist = new ArrayList<>();
        try{
            String jsonString = loadJsonFromAsset(js,con);
            JSONObject json = new JSONObject(jsonString);
            JSONArray menus = json.getJSONArray("menus");
            for (int i = 0; i <menus.length() ; i++) {
                menu m = new menu();
                String tmp;

                tmp = menus.getJSONObject(i).getString("id");
                m.setId(tmp);
                mylist.add(m);

            }
        }
        catch (JSONException e){e.printStackTrace();}
        return mylist;
    }
    private static String loadJsonFromAsset(String filename, Context con){
        String json = null;
        try{
            InputStream is = con.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        }
        catch (java.io.IOException ex){
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
