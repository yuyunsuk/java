package Java240328;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfors() {

        Main.userArrayList = new ArrayList<>();
        Main.ltArrayList = new ArrayList<>();
        Main.ltRecordArrayList = new ArrayList<>();

        // 1번 (유저, 강의, 수강관리 클래스 생성 -> ArrayList 담기)

        User user1 = new User("24030001", "TestUser1", "010-1234-5678", "testuser1@naver.com", "대전 중구 중앙로 121번길 20", "남성", 24, LocalDate.of(1972,10,1));
        User user2 = new User("24030002", "TestUser2", "010-2234-5678", "testuser2@naver.com", "대전 중구 중앙로 122번길 20", "여성", 25, LocalDate.of(1972,10,2));
        User user3 = new User("24030003", "TestUser3", "010-3234-5678", "testuser3@naver.com", "대전 중구 중앙로 123번길 20", "남성", 26, LocalDate.of(1972,10,3));
        User user4 = new User("24030004", "TestUser4", "010-4234-5678", "testuser4@naver.com", "대전 중구 중앙로 124번길 20", "여성", 27, LocalDate.of(1972,10,4));
        User user5 = new User("24030005", "TestUser5", "010-5234-5678", "testuser5@naver.com", "대전 중구 중앙로 125번길 20", "남성", 28, LocalDate.of(1972,10,5));
        Main.userArrayList.add(user1);
        Main.userArrayList.add(user2);
        Main.userArrayList.add(user3);
        Main.userArrayList.add(user4);
        Main.userArrayList.add(user5);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println();


        Lecture lt1 = new Lecture("LT24030001","JAVA교육자료01",LTCategory.PROGRAMING,LTGrade.EASY,"동영상",100);
        Lecture lt2 = new Lecture("LT24030002","파이썬교육자료01",LTCategory.PROGRAMING,LTGrade.MIDDLE,"동영상",40);
        Lecture lt3 = new Lecture("LT24030003","C#교육자료01",LTCategory.PROGRAMING,LTGrade.MIDDLE,"동영상",60);
        Main.ltArrayList.add(lt1);
        Main.ltArrayList.add(lt2);
        Main.ltArrayList.add(lt3);
        System.out.println(lt1.toString());
        System.out.println(lt2.toString());
        System.out.println(lt3.toString());
        System.out.println();


        LectureRecord ltr1 = new LectureRecord("24030001","LT24030001");
        LectureRecord ltr2 = new LectureRecord("24030001","LT24030002");
        LectureRecord ltr3 = new LectureRecord("24030001","LT24030003");
        LectureRecord ltr4 = new LectureRecord("24030002","LT24030001");
        LectureRecord ltr5 = new LectureRecord("24030002","LT24030002");
        LectureRecord ltr6 = new LectureRecord("24030003","LT24030002");
        LectureRecord ltr7 = new LectureRecord("24030003","LT24030003");
        System.out.println(ltr1.toString());
        System.out.println(ltr2.toString());
        System.out.println(ltr3.toString());
        System.out.println(ltr4.toString());
        System.out.println(ltr5.toString());
        System.out.println(ltr6.toString());
        System.out.println(ltr7.toString());
        System.out.println();
        Main.ltRecordArrayList.add(ltr1);
        Main.ltRecordArrayList.add(ltr2);
        Main.ltRecordArrayList.add(ltr3);
        Main.ltRecordArrayList.add(ltr4);
        Main.ltRecordArrayList.add(ltr5);
        Main.ltRecordArrayList.add(ltr7);

        LectureHistory lth1 = new LectureHistory("20240328", "11:00", "LT24030001", "24030001", 22);
        LectureHistory lth2 = new LectureHistory("20240328", "11:01", "LT24030001", "24030002", 23);
        LectureHistory lth3 = new LectureHistory("20240328", "11:02", "LT24030001", "24030003", 24);
        LectureHistory lth4 = new LectureHistory("20240328", "11:03", "LT24030002", "24030004", 25);
        LectureHistory lth5 = new LectureHistory("20240328", "11:04", "LT24030002", "24030005", 26);
        LectureHistory lth6 = new LectureHistory("20240328", "11:05", "LT24030002", "24030001", 27);
        LectureHistory lth7 = new LectureHistory("20240328", "11:06", "LT24030003", "24030002", 28);
        LectureHistory lth8 = new LectureHistory("20240328", "11:07", "LT24030003", "24030003", 29);
        LectureHistory lth9 = new LectureHistory("20240328", "11:08", "LT24030003", "24030004", 30);

        System.out.println(lth1.toString());
        System.out.println(lth2.toString());
        System.out.println(lth3.toString());
        System.out.println(lth4.toString());
        System.out.println(lth5.toString());
        System.out.println(lth6.toString());
        System.out.println(lth7.toString());
        System.out.println(lth8.toString());
        System.out.println(lth9.toString());
        System.out.println();
        System.out.println();



    };
}
