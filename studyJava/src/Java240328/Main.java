package Java240328;

import java.util.ArrayList;

class LMSSearch {
    LMSSearch(){
    };

    void searchLoginID(String ltID) {

        String strltNum = ltID;
        System.out.println("[강의 1번] ID = ["+strltNum+"] 수강생의 Login ID는 ");

        for (int i=0; i<Main.ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
            if (Main.ltRecordArrayList.get(i).getLtID().equals(strltNum)) {
                System.out.println(Main.ltRecordArrayList.get(i).getUserId());
            }
        }
        System.out.print("입니다.");
        System.out.println();
        System.out.println();
    }

    void searchLTName(String userID) {

        // 3번 (유저의 Login ID로 강의명 찾기 -> 배열로)
        String strUserID = userID;
        System.out.println("["+strUserID+"] 수강생의 강의명 리스트는");

        ArrayList<String> ltIDArrayList1 = new ArrayList<>(); // 강의ID ArrayList 변수
        for (int i=0; i<Main.ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
            if (Main.ltRecordArrayList.get(i).getUserId().equals(strUserID)) {
                ltIDArrayList1.add(Main.ltRecordArrayList.get(i).getLtID());
            }
        }

        for (int i=0; i<ltIDArrayList1.size(); i++) { // ltIDArrayList 리스트 조회
            for (int j=0; j<Main.ltArrayList.size(); j++) { // 강의 ArrayList 에서 찾기
                if (ltIDArrayList1.get(i).equals(Main.ltArrayList.get(j).getLtID())) { // ltIDArrayList 와 같은것이 있으면 출력
                    System.out.println(Main.ltArrayList.get(i).getLtName());
                }
            }
        }

        System.out.print("입니다.");
        System.out.println();
        System.out.println();

    }

    void searchEmail(String strName) {

        //String strltName = "JAVA교육자료01";
        String strltName = strName;
        String strltID = "";

        for (int i=0; i<Main.ltArrayList.size(); i++) { // 강의 ArrayList 에서 찾기
            if (Main.ltArrayList.get(i).getLtName().equals(strltName)) {
                strltID = Main.ltArrayList.get(i).getLtID();
            }
        }
        System.out.println("[" + strltName + "] 강의명의 강의ID는 " + strltID + "입니다.");

        ArrayList<String> ltIDArrayList2 = new ArrayList<>(); // User들의 ID ArrayList 변수
        for (int i=0; i<Main.ltRecordArrayList.size(); i++) { // 강의관리 ArrayList 에서 찾기
            if (Main.ltRecordArrayList.get(i).getLtID().equals(strltID)) {
                ltIDArrayList2.add(Main.ltRecordArrayList.get(i).getUserId());
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
            for (int j=0; j<Main.userArrayList.size(); j++) { // User ArrayList 에서 찾기
                if (ltIDArrayList2.get(i).equals(Main.userArrayList.get(j).getUserId())) {
                    System.out.println(Main.userArrayList.get(j).getUserEmail());
                }
            }
        }
        System.out.print("입니다.");
        System.out.println();
        System.out.println();

    }
}

public class Main {

    static ArrayList<User> userArrayList;
    static ArrayList<Lecture> ltArrayList;
    static ArrayList<LectureRecord> ltRecordArrayList;
    static ArrayList<Review> ltReviewArrayList;

    public static void main(String[] args) {

        // 정보 초기화
        InfoCreate.createInfors();

        LMSSearch lmsS1 = new LMSSearch();

        // 2번 (강의1번 ID 수강생의 Login ID 찾기)
        String strltNum = "LT24030001";
        lmsS1.searchLoginID(strltNum);

        // 3번 (유저의 Login ID로 강의명 찾기 -> 배열로)
        String strUserID = "24030002";
        lmsS1.searchLTName(strUserID);

        // 4번 (강의명으로 수강생들의 이메일 찾기 -> 배열로)
        String strltName = "JAVA교육자료01";
        lmsS1.searchEmail(strltName);

        // 기타
        System.out.print("[파이썬교육자료01] 수강자는 ");
        for (int i=0; i<ltRecordArrayList.size(); i++) {
            if (ltRecordArrayList.get(i).getLtID().equals("LT24030002")) {
                System.out.print(ltRecordArrayList.get(i).getUserId() + " ");
            }
        }
        System.out.print("입니다.");
        System.out.println();
        System.out.println();



    }
}
