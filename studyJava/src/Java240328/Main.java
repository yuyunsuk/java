package Java240328;

import java.time.LocalDate;
import java.util.ArrayList;

class LMSSearch {
    LMSSearch(){
    };

    void searchLoginID(String ltID, ArrayList<LectureRecord> ltRecordArrayList) {

        String strltNum = ltID;
        System.out.println("[강의 1번] ID = ["+strltNum+"] 수강생의 Login ID는 ");

        for (int i=0; i<ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
            if (ltRecordArrayList.get(i).ltID.equals(strltNum)) {
                System.out.println(ltRecordArrayList.get(i).userId);
            }
        }
        System.out.print("입니다.");
        System.out.println();
        System.out.println();
    }

    void searchLTName(String userID, ArrayList<LectureRecord> ltRecordArrayList, ArrayList<Lecture> ltArrayList) {

        // 3번 (유저의 Login ID로 강의명 찾기 -> 배열로)
        String strUserID = userID;
        System.out.println("["+strUserID+"] 수강생의 강의명 리스트는");

        ArrayList<String> ltIDArrayList1 = new ArrayList<>(); // 강의ID ArrayList 변수
        for (int i=0; i<ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
            if (ltRecordArrayList.get(i).userId.equals(strUserID)) {
                ltIDArrayList1.add(ltRecordArrayList.get(i).ltID);
            }
        }

        for (int i=0; i<ltIDArrayList1.size(); i++) { // ltIDArrayList 리스트 조회
            for (int j=0; j<ltArrayList.size(); j++) { // 강의 ArrayList 에서 찾기
                if (ltIDArrayList1.get(i).equals(ltArrayList.get(j).ltID)) { // ltIDArrayList 와 같은것이 있으면 출력
                    System.out.println(ltArrayList.get(i).ltName);
                }
            }
        }

        System.out.print("입니다.");
        System.out.println();
        System.out.println();

    }

    void searchEmail(String strName, ArrayList<LectureRecord> ltRecordArrayList, ArrayList<Lecture> ltArrayList, ArrayList<User> userArrayList) {

        //String strltName = "JAVA교육자료01";
        String strltName = strName;
        String strltID = "";

        for (int i=0; i<ltArrayList.size(); i++) { // 강의 ArrayList 에서 찾기
            if (ltArrayList.get(i).ltName.equals(strltName)) {
                strltID = ltArrayList.get(i).ltID;
            }
        }
        System.out.println("[" + strltName + "] 강의명의 강의ID는 " + strltID + "입니다.");

        ArrayList<String> ltIDArrayList2 = new ArrayList<>(); // User들의 ID ArrayList 변수
        for (int i=0; i<ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
            if (ltRecordArrayList.get(i).ltID.equals(strltID)) {
                ltIDArrayList2.add(ltRecordArrayList.get(i).userId);
            }
        }

        System.out.println("강의를 듣는 유저는");
        for (int i=0; i<ltIDArrayList2.size(); i++) { // ID 리스트
            System.out.println(ltIDArrayList2.get(i));
        }
        System.out.println("입니다.");

        // User ArrayList
        System.out.println("[" + strltName + "] 강의명으로 강의를 듣는 이메일 리스트는");
        for (int i=0; i<ltIDArrayList2.size(); i++) { // User들의 ID ArrayList 변수
            for (int j=0; j<userArrayList.size(); j++) { // User ArrayList 에서 찾기
                if (ltIDArrayList2.get(i).equals(userArrayList.get(j).userId)) {
                    System.out.println(userArrayList.get(j).userEmail);
                }
            }
        }
        System.out.print("입니다.");
        System.out.println();
        System.out.println();

    }
}

public class Main {
    public static void main(String[] args) {

        // 1번 (유저, 강의, 수강관리 클래스 생성 -> ArrayList 담기)
        ArrayList<User> userArrayList = new ArrayList<>();
        User user1 = new User("24030001", "TestUser1", "010-1234-5678", "testuser1@naver.com", "대전 중구 중앙로 121번길 20", "남성", 24, LocalDate.of(1972,10,1));
        User user2 = new User("24030002", "TestUser2", "010-2234-5678", "testuser2@naver.com", "대전 중구 중앙로 122번길 20", "여성", 25, LocalDate.of(1972,10,2));
        User user3 = new User("24030003", "TestUser3", "010-3234-5678", "testuser3@naver.com", "대전 중구 중앙로 123번길 20", "남성", 26, LocalDate.of(1972,10,3));
        User user4 = new User("24030004", "TestUser4", "010-4234-5678", "testuser4@naver.com", "대전 중구 중앙로 124번길 20", "여성", 27, LocalDate.of(1972,10,4));
        User user5 = new User("24030005", "TestUser5", "010-5234-5678", "testuser5@naver.com", "대전 중구 중앙로 125번길 20", "남성", 28, LocalDate.of(1972,10,5));
        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        userArrayList.add(user5);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println();

        ArrayList<Lecture> ltArrayList = new ArrayList<>();
        Lecture lt1 = new Lecture("LT24030001","JAVA교육자료01","프로그래밍","초급","동영상",100);
        Lecture lt2 = new Lecture("LT24030002","파이썬교육자료01","프로그래밍","중급","동영상",40);
        Lecture lt3 = new Lecture("LT24030003","C#교육자료01","프로그래밍","중급","동영상",60);
        ltArrayList.add(lt1);
        ltArrayList.add(lt2);
        ltArrayList.add(lt3);
        System.out.println(lt1.toString());
        System.out.println(lt2.toString());
        System.out.println(lt3.toString());
        System.out.println();

        ArrayList<LectureRecord> ltRecordArrayList = new ArrayList<>();
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
        ltRecordArrayList.add(ltr1);
        ltRecordArrayList.add(ltr2);
        ltRecordArrayList.add(ltr3);
        ltRecordArrayList.add(ltr4);
        ltRecordArrayList.add(ltr5);
        ltRecordArrayList.add(ltr7);

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

        System.out.println(userArrayList.toString());     // 유저 ArrayList
        System.out.println(ltArrayList.toString());       // 강의 ArrayList
        System.out.println(ltRecordArrayList.toString()); // 강의관리 ArrayList
        System.out.println();

        LMSSearch lmsS1 = new LMSSearch();

        // 2번 (강의1번 ID 수강생의 Login ID 찾기)
        String strltNum = "LT24030001";
        lmsS1.searchLoginID(strltNum, ltRecordArrayList);

//        System.out.println("[강의 1번] ID = ["+strltNum+"] 수강생의 Login ID는 ");
//
//        for (int i=0; i<ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
//            if (ltRecordArrayList.get(i).ltID.equals(strltNum)) {
//                System.out.println(ltRecordArrayList.get(i).userId);
//            }
//        }
//        System.out.print("입니다.");
//        System.out.println();
//        System.out.println();

        // 3번 (유저의 Login ID로 강의명 찾기 -> 배열로)
        String strUserID = "24030002";
        lmsS1.searchLTName(strUserID, ltRecordArrayList, ltArrayList);

//        System.out.println("["+strUserID+"] 수강생의 강의명 리스트는");
//
//        ArrayList<String> ltIDArrayList1 = new ArrayList<>(); // 강의ID ArrayList 변수
//        for (int i=0; i<ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
//            if (ltRecordArrayList.get(i).userId.equals(strUserID)) {
//                ltIDArrayList1.add(ltRecordArrayList.get(i).ltID);
//            }
//        }
//
//        for (int i=0; i<ltIDArrayList1.size(); i++) { // ltIDArrayList 리스트 조회
//            for (int j=0; j<ltArrayList.size(); j++) { // 강의 ArrayList 에서 찾기
//                if (ltIDArrayList1.get(i).equals(ltArrayList.get(j).ltID)) { // ltIDArrayList 와 같은것이 있으면 출력
//                    System.out.println(ltArrayList.get(i).ltName);
//                }
//            }
//        }
//
//        System.out.print("입니다.");
//        System.out.println();
//        System.out.println();

        // 4번 (강의명으로 수강생들의 이메일 찾기 -> 배열로)
        String strltName = "JAVA교육자료01";
        lmsS1.searchEmail(strltName, ltRecordArrayList, ltArrayList, userArrayList);

//        String strltID = "";
//
//        for (int i=0; i<ltArrayList.size(); i++) { // 강의 ArrayList 에서 찾기
//            if (ltArrayList.get(i).ltName.equals(strltName)) {
//                strltID = ltArrayList.get(i).ltID;
//            }
//        }
//        System.out.println("[" + strltName + "] 강의명의 강의ID는 " + strltID + "입니다.");
//
//        ArrayList<String> ltIDArrayList2 = new ArrayList<>(); // User들의 ID ArrayList 변수
//        for (int i=0; i<ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
//            if (ltRecordArrayList.get(i).ltID.equals(strltID)) {
//                ltIDArrayList2.add(ltRecordArrayList.get(i).userId);
//            }
//        }
//
//        System.out.println("강의를 듣는 유저는");
//        for (int i=0; i<ltIDArrayList2.size(); i++) { // ID 리스트
//            System.out.println(ltIDArrayList2.get(i));
//        }
//        System.out.println("입니다.");
//
//        // User ArrayList
//        System.out.println("[" + strltName + "] 강의명으로 강의를 듣는 이메일 리스트는");
//        for (int i=0; i<ltIDArrayList2.size(); i++) { // User들의 ID ArrayList 변수
//            for (int j=0; j<userArrayList.size(); j++) { // User ArrayList 에서 찾기
//                if (ltIDArrayList2.get(i).equals(userArrayList.get(j).userId)) {
//                    System.out.println(userArrayList.get(j).userEmail);
//                }
//            }
//        }
//        System.out.print("입니다.");
//        System.out.println();
//        System.out.println();

        // 기타
        System.out.print("[파이썬교육자료01] 수강자는 ");
        for (int i=0; i<ltRecordArrayList.size(); i++) {
            if (ltRecordArrayList.get(i).ltID.equals("LT24030002")) {
                System.out.print(ltRecordArrayList.get(i).userId + " ");
            }
        }
        System.out.print("입니다.");
        System.out.println();



    }
}
