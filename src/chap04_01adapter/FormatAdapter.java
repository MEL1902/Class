package chap04_01adapter;

//MediaPackage 인터페이스도 MediaPlayer 자료형인 것처럼 동작하도록 만들어주는 어댑터 클래스
public class FormatAdapter implements MediaPlayer {

    private MediaPackage media;

    public FormatAdapter(MediaPackage media){
        this.media = media;
    }

    @Override
    public void play(String fileName) {
        System.out.println("어댑터를 사용해서 package를 player로 변환했습니다.");
        media.playFile(fileName);
    }
}