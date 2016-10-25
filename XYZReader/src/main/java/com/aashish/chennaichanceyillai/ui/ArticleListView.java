package com.aashish.chennaichanceyillai.ui;

public interface ArticleListView {
    void showProgressBar();

    void hideProgressBar();

    void showArticleDetails(long articleId);

    void onArticlesUpdateFailed(String errorMessage);
}
