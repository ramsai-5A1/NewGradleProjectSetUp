package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello SpringBoot");

//        OkHttpClient client = new OkHttpClient();
//        String url = "https://fakestoreapi.com/products/1";
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//
//        try (Response response = client.newCall(request).execute()) {
//            if (!response.isSuccessful()) {
//                System.out.println("Something went wrong!!!");
//            } else {
//                System.out.println("Reaching till this line");
//                System.out.println(response.body().string());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ProductService service = retrofit.create(ProductService.class);
        Product product = service.getProductById("5").execute().body();
        System.out.println("Product extracted from web is: " + product.toString());
    }
}