package net.vlasov.guthub_bot.service;

import net.vlasov.guthub_bot.dto.Repo;
import net.vlasov.guthub_bot.service.GitHubService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Start {

    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        Call<List<Repo>> call = service.listRepos("MVlasovD");
        List<Repo> repos = call.execute().body();
        repos.forEach(System.out::println);
    }

}
