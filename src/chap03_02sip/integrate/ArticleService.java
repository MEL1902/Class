package chap03_02sip.integrate;

public class ArticleService {
    Repository repository = new ArticleRepository();

    public void createArticle(){
        repository.createArticle();
    }

    public Article findArticleById(Long id){
        return repository.findArticleById(id);
    }
}
