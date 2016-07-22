package test.impiger.com.mvpdagger2.mainscreen;

import java.util.List;

import test.impiger.com.mvpdagger2.data.Post;

/**
 * Created by prasanth on 21/07/16.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}