package com.zpauly.githubapp.network.issues;

import com.zpauly.githubapp.Api;
import com.zpauly.githubapp.base.BaseNetMethod;
import com.zpauly.githubapp.entity.request.IssueCommentRequestBean;
import com.zpauly.githubapp.entity.request.IssueRequestBean;
import com.zpauly.githubapp.entity.response.AssigneeBean;
import com.zpauly.githubapp.entity.response.CommentBean;
import com.zpauly.githubapp.entity.response.issues.IssueBean;
import com.zpauly.githubapp.entity.response.issues.LabelBean;
import com.zpauly.githubapp.entity.response.MilestoneBean;
import com.zpauly.githubapp.utils.RetrofitUtil;

import java.util.List;

import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by zpauly on 16/9/1.
 */
public class IssuesMethod extends BaseNetMethod {
    private Retrofit retrofit;

    private IssuesService service;

    private static class Nested {
        static IssuesMethod instance = new IssuesMethod();
    }

    private IssuesMethod() {
        retrofit = RetrofitUtil.initRetrofit(Api.GitHubApi);
        service = retrofit.create(IssuesService.class);
    }

    public static IssuesMethod getInstance() {
        return Nested.instance;
    }

    public void getIssues(Observer<List<IssueBean>> observer, String auth,
                          String filter, String state, String labels, String sort,
                          String direction, String since, int pageId) {
        service.getIssues(auth, "application/vnd.github.VERSION.html", filter, state, labels, sort, direction, since, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getDefaultIssues(Observer<List<IssueBean>> observer, String auth, int pageId) {
        service.getIssues(auth, "application/vnd.github.VERSION.html", null, null, null, null, null, null, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getUserIssues(Observer<List<IssueBean>> observer, String auth,
                              String filter, String state, String labels, String sort,
                              String direction, String since, int pageId) {
        service.getUserIssues(auth, "application/vnd.github.VERSION.html", filter, state, labels, sort, direction, since, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getDefaultUserIssues(Observer<List<IssueBean>> observer, String auth, int pageId) {
        service.getUserIssues(auth, "application/vnd.github.VERSION.html", null, null, null, null, null, null, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getOrgIssues(Observer<List<IssueBean>> observer, String auth,
                             String org,
                             String filter, String state, String labels, String sort,
                             String direction, String since, int pageId) {
        service.getOrgIssues(auth, "application/vnd.github.VERSION.html",org, filter, state, labels, sort, direction, since, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getDefaultOrgIssues(Observer<List<IssueBean>> observer, String auth,
                                    String org, int pageId) {
        service.getOrgIssues(auth, "application/vnd.github.VERSION.html", org, null, null, null, null, null, null, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getARepoIssues(Observer<List<IssueBean>> observer,
                               String auth, String owner, String repo,
                               String milestone, String state, String assignee,
                               String creator, String mentioned, String sort,
                               String direction, String since, String[] labels, int pageId) {
        service.getARepoIssues(auth, "application/vnd.github.VERSION.html", owner, repo, milestone, state, assignee, creator,
                mentioned, sort, direction, since, labels, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getDefaultARepoIssues(Observer<List<IssueBean>> observer,
                                      String auth, String owner, String repo, int pageId) {
        service.getARepoIssues(auth, "application/vnd.github.VERSION.html", owner, repo,
                null, null, null, null, null, null, null, null, null, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getASingleIssue(Observer<IssueBean> observer,
                                String auth, String owner, String repo, int number, int pageId) {
        service.getASingleIssue(auth, "application/vnd.github.VERSION.html", owner, repo, number, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getAnIssueComments(Observer<List<CommentBean>> observer,
                                   String auth, String owner, String repo, int number,
                                   String since, int pageId) {
        service.getAnIssueComments(auth, "application/vnd.github.VERSION.html", owner, repo, number, since, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getDefaultAnIssueComments(Observer<List<CommentBean>> observer,
                                   String auth, String owner, String repo, int number,
                                   int pageId) {
        service.getAnIssueComments(auth, "application/vnd.github.VERSION.html", owner, repo, number, null, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void checkAssignee(Observer<String> observer, String auth, String owner, String repo,
                              String assignee) {
        service.checkAssignee(auth, owner, repo, assignee)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getAssignees(Observer<List<AssigneeBean>> observer, String auth,
                             String owner, String repo) {
        service.getAssignees(auth, owner, repo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void createAnIssue(Observer<IssueBean> observer, String auth,
                              IssueRequestBean issueRequestBean,
                              String owner, String repo) {
        service.createAnIssue(auth, issueRequestBean, owner, repo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void createAComment(Observer<CommentBean> observer,
                               IssueCommentRequestBean issueCommentRequestBean,
                               String auth, String owner, String repo, int number) {
        service.createAComment(auth, issueCommentRequestBean, owner, repo, number)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getMilestones(Observer<List<MilestoneBean>> observer, String auth,
                              String owner, String repo,
                              String state, String sort, String direction, int pageId) {
        service.getMilestones(auth, owner, repo, state, sort, direction, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getLabels(Observer<List<LabelBean>> observer, String auth, String owner, String repo, int pageId) {
        service.getLabels(auth, owner, repo, pageId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void lockAnIssue(Observer<String> observer, String auth,
                            String owner, String repo, int number) {
        service.lockAnIssue(auth, owner, repo, number)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void unlockAnIssue(Observer<String> observer, String auth,
                              String owner, String repo, int number) {
        service.unlockAnIssue(auth, owner, repo, number)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
