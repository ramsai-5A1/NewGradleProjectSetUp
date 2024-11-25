package org.example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductService {

    @GET("/products/{productId}")
    Call<Product> getProductById(@Path("productId") String productId);
}
