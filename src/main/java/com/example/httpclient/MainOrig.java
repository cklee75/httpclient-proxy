package com.example.httpclient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class MainOrig {
    public static void main(String[] args) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Define the API endpoint
            String url = "https://jsonplaceholder.typicode.com/posts";
            
            // Create the HTTP POST request
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json");
            
            // Create the JSON payload
            String jsonPayload = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
            StringEntity entity = new StringEntity(jsonPayload);
            httpPost.setEntity(entity);
            
            // Execute the POST request
            try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
                // Print the status code
                System.out.println("Response Code: " + response.getStatusLine().getStatusCode());
                
                // Print the response body
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response Body: " + responseBody);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
