package com.wuyi.creationalPattern.factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class URLConnectionReader {
    public static void main(String[] args) {
        try {
            URL baidu=new URL("https://www.baidu.com");
            URLConnection urlConnection = baidu.openConnection();
            BufferedReader in=new
                    BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line=in.readLine())!=null){
                System.out.println(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
