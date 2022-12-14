package com.heshan.rxjavademo.data;

public final class GitHubRepo {

    private final int id;
    private final String name;
    private final String htmlUrl;
    private final String description;
    private final String language;
    private final int stargazersCount;

    public GitHubRepo(int id,
                      String name,
                      String htmlUrl,
                      String description,
                      String language,
                      int stargazersCount) {
        this.id = id;
        this.name = name;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.language = language;
        this.stargazersCount = stargazersCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }
}
