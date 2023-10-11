package chap03_02sip.integrate;

public class ArticleRepository implements Repository{
    @Override
    public void createUser() {
        //필요없는 유저 로직 구현
    }

    @Override
    public User findUserById(Long id) {
        //필요없는 유저 로직 구현
        return null;
    }

    @Override
    public void createArticle() {
        //실제로 사용할 아티클 관련 로직
    }

    @Override
    public Article findArticleById(Long id) {
        //실제로 사용할 아티클 관련 로직
        return null;
    }
}
