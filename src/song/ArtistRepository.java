package song;

import util.Utility;

import java.io.*;
import java.util.*;

import static util.Utility.*;

public class ArtistRepository {

    // key : 가수 이름 | value : Artist 객체
    private static Map<String, Artist> artistList;

    static {
        artistList = new HashMap<>();
    }

    // 신규 가수를 map에 추가하는 기능
    public void addNewAtrist(String artistName, String songName) {
        // 1. 신규 가수 정보를 생성 -> Set 객체 전달
        Artist artist = new Artist(artistName, new HashSet<>());
        // 2. 생성된 노래 목록을 리턴, 노래 이름을 추가
        artist.getSongList().add(songName);
        // 3. 완성된 객체를 Map에 저장
        artistList.put(artistName, artist);
    }

    // 가수명을 전달받아 현재 등록된 가수인지의 여부를 리턴하는 기능
    public boolean isRegisted(String artistName) {
        return artistList.containsKey(artistName);
    }

    /**
     *  기존 가수 정보에 노래만 추가하는 기능
     * @param artistName - 사용자의 입력 가수 이름
     * @param songName - 사용자의 입력 노래 이름
     * @return - 곡명이 중복되었다면 false
     *           곡이 정상적으로 추가되었다면 true
     */
    public boolean addNewSong(String artistName, String songName) {
        // Map에서 기존 가수 객체 찾기
        Artist artist = artistList.get(artistName);
        // Set의 add는 add의 실행 결과를 boolean으로 리턴함 -> 중복 발생시 객체가 추가되지않고 false를 리턴함
        boolean flag = artist.getSongList().add(songName);
        return flag;
    }

    public static Map<String, Artist> getArtistList() {
        return artistList;
    }

    // 노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) {

        Artist artist = artistList.get(artistName);

        Set<String> songList = artist.getSongList();

        List<String> songs = new ArrayList<>(songList);

        System.out.printf("# 가수 %s의 노래 목록\n", artistName);
        for (int i = 0; i < songs.size(); i++) {
            System.out.printf("%d. %s\n", i+1, songs.get(i));
        }

    }

    // 세이브
    public void saveData() {
        // 폴더 경로 : Utility 클래스에 상수로 선언됨
        // 폴더가 실존하지 않는다면 생성을 하고 세이브 파일을 생성해야 함
        // 파일명은 song.sav

        File f = new File(FILE_PATH);
        if (!f.exists()) f.mkdirs();

        try(FileOutputStream fos = new FileOutputStream(FILE_PATH + "/song.sav")) {

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(artistList);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    // 로드
    public void loadData() {
        // 세이브 파일이 존재하는지 체크함
        // 존재한다면 로드를 진행해 artistList에 할당(대입)함
        File f = new File(FILE_PATH + "/song.sav");
        if (f.exists()) {

            try(FileInputStream fis = new FileInputStream(FILE_PATH + "/song.sav")) {

                ObjectInputStream ois = new ObjectInputStream(fis);

//                artistList = ois.readObject(); -> 알트 엔터로 형변환
                artistList = (Map<String, Artist>) ois.readObject();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("\n로드 할 파일이 없습니다.");
        }


    }




}
