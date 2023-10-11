package chap03_02sip.integrate;

public class UserRepository implements Repository {

    @Override
    public void createUser() {

    }

    @Override
    public User findUserById(Long id) {
        return null;  //유저에서 쓸 기능 구현
    }

    @Override
    public void createArticle() {
        // 쓰지도 않을 Article 관련 로직 구현
    }

    @Override
    public Article findArticleById(Long id) {
        // 쓰지도 않을 Article 관련 로직 구현
        return null;
    }
}
