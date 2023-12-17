package com.infratoken.sdk.local;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import com.infratoken.sdk.domain.dtos.assets.BuyAssetPrimaryMarketDTO;
import com.infratoken.sdk.domain.dtos.assets.CreateAssetDTO;
import com.infratoken.sdk.domain.dtos.assets.QuickSellAssetDTO;
import com.infratoken.sdk.domain.dtos.assets.ReleaseDTO;
import com.infratoken.sdk.domain.dtos.assets.SettleInstallmentDTO;

public class SdkLocal {
  private HttpClient httpClient;
  private String baseUrl = "http://localhost:3334/api";
  private String accessKey;

  public SdkLocal(String accesskey) {
    this.httpClient = HttpClient.newHttpClient();
    this.accessKey = accesskey;
  }

  // Tokenization methods
  public String tokenizeAsset(
      String tokenCode,
      String blockchain) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(
            this.baseUrl + "/tokenization/unsigned-transaction/tokenize/" + tokenCode + "?blockchain=" + blockchain))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .GET().build();
    HttpResponse<String> response = this.httpClient.send(request, BodyHandlers.ofString());
    return response.body();
  }

  public String transferToMarket(
      String tokenCode,
      String blockchain) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(
            this.baseUrl + "/tokenization/unsigned-transaction/transfer-to-market/" + tokenCode + "?blockchain="
                + blockchain))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .GET().build();
    HttpResponse<String> response = this.httpClient.send(request, BodyHandlers.ofString());
    return response.body();
  }

  public String putTokenOnSale(
      String tokenCode,
      String blockchain) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(
            this.baseUrl + "/tokenization/unsigned-transaction/put-on-sale/" + tokenCode + "?blockchain="
                + blockchain))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .GET().build();
    HttpResponse<String> response = this.httpClient.send(request, BodyHandlers.ofString());
    return response.body();
  }

  public String tokenizeQuickSell(
      String transactionId,
      String blockchain) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(
            this.baseUrl + "/tokenization/unsigned-transaction/secondary-market/quick-sell/" + transactionId
                + "?blockchain="
                + blockchain))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .GET().build();
    HttpResponse<String> response = this.httpClient.send(request, BodyHandlers.ofString());
    return response.body();
  }

  // Asset methods
  public void releaseAsset(ReleaseDTO release) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(this.baseUrl + "/assets/release"))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .method("PATCH", BodyPublishers.ofString(release.toJson()))
        .build();
    this.httpClient.send(request, BodyHandlers.ofString());
  }

  public void createAsset(CreateAssetDTO asset) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(this.baseUrl + "/asset"))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .POST(BodyPublishers.ofString(asset.toJson()))
        .build();
    this.httpClient.send(request, BodyHandlers.ofString());
  }

  public String listTokensInformations() throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(this.baseUrl + "/asset/listing/tokens-informations"))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .GET().build();
    HttpResponse<String> response = this.httpClient.send(request, BodyHandlers.ofString());
    return response.body();
  }

  public String instantSettleInstallment(SettleInstallmentDTO settleInstallment)
      throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(this.baseUrl + "/asset/settlement/instant"))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .method("PATCH", BodyPublishers.ofString(settleInstallment.toJson()))
        .build();
    HttpResponse<String> response = this.httpClient.send(request, BodyHandlers.ofString());
    return response.body();
  }

  // Order methods
  public String buyAssetPrimaryMarket(BuyAssetPrimaryMarketDTO buyAssetPrimaryMarket)
      throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(this.baseUrl + "/market/primary/asset/buy"))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .POST(BodyPublishers.ofString(buyAssetPrimaryMarket.toJson()))
        .build();
    HttpResponse<String> response = this.httpClient.send(request, BodyHandlers.ofString());
    return response.body();
  }

  public String quickSellAsset(QuickSellAssetDTO quickSellAsset)
      throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(this.baseUrl + "/market/secondary/asset/quick-sell"))
        .header("Content-Type", "application/json")
        .header("Authorization", "Bearer " + this.accessKey)
        .POST(BodyPublishers.ofString(quickSellAsset.toJson()))
        .build();
    HttpResponse<String> response = this.httpClient.send(request, BodyHandlers.ofString());
    return response.body();
  }
}
