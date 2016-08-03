package com.zpauly.githubapp.network.gitdata;

import com.zpauly.githubapp.Api;
import com.zpauly.githubapp.entity.response.BlobBean;
import com.zpauly.githubapp.network.repositories.RepositoriesService;
import com.zpauly.githubapp.utils.RetrofitUtil;
import com.zpauly.githubapp.utils.StringConverterFactory;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by zpauly on 16-8-3.
 */

public class GitDataMethod {
    private static GitDataMethod instance;

    private Retrofit retrofit;

    private GitDataService service;

    private GitDataMethod() {
        retrofit = RetrofitUtil.initRetrofit(Api.GitHubApi);
        service = retrofit.create(GitDataService.class);
    }

    public static GitDataMethod getInstance() {
        if (instance == null) {
            synchronized (GitDataMethod.class) {
                if (instance == null) {
                    instance = new GitDataMethod();
                }
            }
        }
        return instance;
    }

    public void getAblob(Observer<String> observer, String auth, String owner,
                         String repo, String sha) {
        Retrofit retrofit = RetrofitUtil.initCustomRetrofit(Api.GitHubApi, StringConverterFactory.create(),
                RxJavaCallAdapterFactory.create());
        GitDataService service = retrofit.create(GitDataService.class);
        service.getABlob(auth, "application/vnd.github.VERSION.raw", owner, repo, sha)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
