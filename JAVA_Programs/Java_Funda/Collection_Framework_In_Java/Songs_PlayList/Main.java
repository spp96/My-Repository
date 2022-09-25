package Question_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter The Number of songs You Want To Add In Your Playlist");
        int list_ofNumber = user.nextInt();
        Song[] arr = new Song[list_ofNumber];
        PlayList playList = new PlayList();
        for (int i=0;i<list_ofNumber;i++){
            System.out.println("Enter Your Favourite Movie Name");
            String movie_Name = user.next();
            System.out.println("Enter Your Favorite Song Name");
            String song_Name = user.next();
            user.nextLine();
            Song new_Song = new Song(movie_Name,song_Name);
            playList.addSong(new_Song);
            arr[i]=new_Song;
        }
        for (int j=0;j< arr.length;j++){
            String movieName = arr[j].getMovieName();
            String songName = arr[j].getSongName();
            Song new_song1 = new Song(movieName,songName);
            new_song1.play();
        }
    }
}
