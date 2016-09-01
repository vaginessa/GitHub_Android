package com.zpauly.githubapp.entity.response.issues;

import com.zpauly.githubapp.entity.response.UserBean;

import java.util.List;

/**
 * Created by zpauly on 16/9/1.
 */
public class IssueBean {
    /**
     * id : 1
     * url : https://api.github.com/repos/octocat/Hello-World/issues/1347
     * repository_url : https://api.github.com/repos/octocat/Hello-World
     * labels_url : https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}
     * comments_url : https://api.github.com/repos/octocat/Hello-World/issues/1347/comments
     * events_url : https://api.github.com/repos/octocat/Hello-World/issues/1347/events
     * html_url : https://github.com/octocat/Hello-World/issues/1347
     * number : 1347
     * state : open
     * title : Found a bug
     * body : I'm having a problem with this.
     * user : {"login":"octocat","id":1,"avatar_url":"https://github.com/images/error/octocat_happy.gif","gravatar_id":"","url":"https://api.github.com/users/octocat","html_url":"https://github.com/octocat","followers_url":"https://api.github.com/users/octocat/followers","following_url":"https://api.github.com/users/octocat/following{/other_user}","gists_url":"https://api.github.com/users/octocat/gists{/gist_id}","starred_url":"https://api.github.com/users/octocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/octocat/subscriptions","organizations_url":"https://api.github.com/users/octocat/orgs","repos_url":"https://api.github.com/users/octocat/repos","events_url":"https://api.github.com/users/octocat/events{/privacy}","received_events_url":"https://api.github.com/users/octocat/received_events","type":"User","site_admin":false}
     * labels : [{"url":"https://api.github.com/repos/octocat/Hello-World/labels/bug","name":"bug","color":"f29513"}]
     * assignee : {"login":"octocat","id":1,"avatar_url":"https://github.com/images/error/octocat_happy.gif","gravatar_id":"","url":"https://api.github.com/users/octocat","html_url":"https://github.com/octocat","followers_url":"https://api.github.com/users/octocat/followers","following_url":"https://api.github.com/users/octocat/following{/other_user}","gists_url":"https://api.github.com/users/octocat/gists{/gist_id}","starred_url":"https://api.github.com/users/octocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/octocat/subscriptions","organizations_url":"https://api.github.com/users/octocat/orgs","repos_url":"https://api.github.com/users/octocat/repos","events_url":"https://api.github.com/users/octocat/events{/privacy}","received_events_url":"https://api.github.com/users/octocat/received_events","type":"User","site_admin":false}
     * milestone : {"url":"https://api.github.com/repos/octocat/Hello-World/milestones/1","html_url":"https://github.com/octocat/Hello-World/milestones/v1.0","labels_url":"https://api.github.com/repos/octocat/Hello-World/milestones/1/labels","id":1002604,"number":1,"state":"open","title":"v1.0","description":"Tracking milestone for version 1.0","creator":{"login":"octocat","id":1,"avatar_url":"https://github.com/images/error/octocat_happy.gif","gravatar_id":"","url":"https://api.github.com/users/octocat","html_url":"https://github.com/octocat","followers_url":"https://api.github.com/users/octocat/followers","following_url":"https://api.github.com/users/octocat/following{/other_user}","gists_url":"https://api.github.com/users/octocat/gists{/gist_id}","starred_url":"https://api.github.com/users/octocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/octocat/subscriptions","organizations_url":"https://api.github.com/users/octocat/orgs","repos_url":"https://api.github.com/users/octocat/repos","events_url":"https://api.github.com/users/octocat/events{/privacy}","received_events_url":"https://api.github.com/users/octocat/received_events","type":"User","site_admin":false},"open_issues":4,"closed_issues":8,"created_at":"2011-04-10T20:09:31Z","updated_at":"2014-03-03T18:58:10Z","closed_at":"2013-02-12T13:22:01Z","due_on":"2012-10-09T23:39:01Z"}
     * locked : false
     * comments : 0
     * pull_request : {"url":"https://api.github.com/repos/octocat/Hello-World/pulls/1347","html_url":"https://github.com/octocat/Hello-World/pull/1347","diff_url":"https://github.com/octocat/Hello-World/pull/1347.diff","patch_url":"https://github.com/octocat/Hello-World/pull/1347.patch"}
     * closed_at : null
     * created_at : 2011-04-22T13:33:48Z
     * updated_at : 2011-04-22T13:33:48Z
     */

    private int id;
    private String url;
    private String repository_url;
    private String labels_url;
    private String comments_url;
    private String events_url;
    private String html_url;
    private int number;
    private String state;
    private String title;
    private String body;
    /**
     * login : octocat
     * id : 1
     * avatar_url : https://github.com/images/error/octocat_happy.gif
     * gravatar_id :
     * url : https://api.github.com/users/octocat
     * html_url : https://github.com/octocat
     * followers_url : https://api.github.com/users/octocat/followers
     * following_url : https://api.github.com/users/octocat/following{/other_user}
     * gists_url : https://api.github.com/users/octocat/gists{/gist_id}
     * starred_url : https://api.github.com/users/octocat/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/octocat/subscriptions
     * organizations_url : https://api.github.com/users/octocat/orgs
     * repos_url : https://api.github.com/users/octocat/repos
     * events_url : https://api.github.com/users/octocat/events{/privacy}
     * received_events_url : https://api.github.com/users/octocat/received_events
     * type : User
     * site_admin : false
     */

    private UserBean user;
    /**
     * login : octocat
     * id : 1
     * avatar_url : https://github.com/images/error/octocat_happy.gif
     * gravatar_id :
     * url : https://api.github.com/users/octocat
     * html_url : https://github.com/octocat
     * followers_url : https://api.github.com/users/octocat/followers
     * following_url : https://api.github.com/users/octocat/following{/other_user}
     * gists_url : https://api.github.com/users/octocat/gists{/gist_id}
     * starred_url : https://api.github.com/users/octocat/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/octocat/subscriptions
     * organizations_url : https://api.github.com/users/octocat/orgs
     * repos_url : https://api.github.com/users/octocat/repos
     * events_url : https://api.github.com/users/octocat/events{/privacy}
     * received_events_url : https://api.github.com/users/octocat/received_events
     * type : User
     * site_admin : false
     */

    private AssigneeBean assignee;
    /**
     * url : https://api.github.com/repos/octocat/Hello-World/milestones/1
     * html_url : https://github.com/octocat/Hello-World/milestones/v1.0
     * labels_url : https://api.github.com/repos/octocat/Hello-World/milestones/1/labels
     * id : 1002604
     * number : 1
     * state : open
     * title : v1.0
     * description : Tracking milestone for version 1.0
     * creator : {"login":"octocat","id":1,"avatar_url":"https://github.com/images/error/octocat_happy.gif","gravatar_id":"","url":"https://api.github.com/users/octocat","html_url":"https://github.com/octocat","followers_url":"https://api.github.com/users/octocat/followers","following_url":"https://api.github.com/users/octocat/following{/other_user}","gists_url":"https://api.github.com/users/octocat/gists{/gist_id}","starred_url":"https://api.github.com/users/octocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/octocat/subscriptions","organizations_url":"https://api.github.com/users/octocat/orgs","repos_url":"https://api.github.com/users/octocat/repos","events_url":"https://api.github.com/users/octocat/events{/privacy}","received_events_url":"https://api.github.com/users/octocat/received_events","type":"User","site_admin":false}
     * open_issues : 4
     * closed_issues : 8
     * created_at : 2011-04-10T20:09:31Z
     * updated_at : 2014-03-03T18:58:10Z
     * closed_at : 2013-02-12T13:22:01Z
     * due_on : 2012-10-09T23:39:01Z
     */

    private MilestoneBean milestone;
    private boolean locked;
    private int comments;
    /**
     * url : https://api.github.com/repos/octocat/Hello-World/pulls/1347
     * html_url : https://github.com/octocat/Hello-World/pull/1347
     * diff_url : https://github.com/octocat/Hello-World/pull/1347.diff
     * patch_url : https://github.com/octocat/Hello-World/pull/1347.patch
     */

    private PullRequestBean pull_request;
    private Object closed_at;
    private String created_at;
    private String updated_at;
    /**
     * url : https://api.github.com/repos/octocat/Hello-World/labels/bug
     * name : bug
     * color : f29513
     */

    private List<LabelBean> labels;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepository_url() {
        return repository_url;
    }

    public void setRepository_url(String repository_url) {
        this.repository_url = repository_url;
    }

    public String getLabels_url() {
        return labels_url;
    }

    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public AssigneeBean getAssignee() {
        return assignee;
    }

    public void setAssignee(AssigneeBean assignee) {
        this.assignee = assignee;
    }

    public MilestoneBean getMilestone() {
        return milestone;
    }

    public void setMilestone(MilestoneBean milestone) {
        this.milestone = milestone;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public PullRequestBean getPull_request() {
        return pull_request;
    }

    public void setPull_request(PullRequestBean pull_request) {
        this.pull_request = pull_request;
    }

    public Object getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(Object closed_at) {
        this.closed_at = closed_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public List<LabelBean> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelBean> labels) {
        this.labels = labels;
    }
}
