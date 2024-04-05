package Java240328;

import java.util.ArrayList;
import java.util.List;

class LMSSearch {
    LMSSearch(){
    };

    void getLoginIDByLTId(String ltID) {

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

    void getLTNameByUserId(String userID) {

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

    void getEmailByLTName(String strName) {

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

    public String getTeacherByLectureId(String LTId){
        String teacherName = "";
        String teacherId = "";

        System.out.println("getTeacherByLectureId : " + LTId); // LT24030001

        //System.out.println(Main.ltTeacherArrayList.toString());

        // ltTeacherArrayList (강의 & 선생님 클래스)
        for (int i=0; i<Main.ltTeacherArrayList.size(); i++) {
            if (Main.ltTeacherArrayList.get(i).getLtID().equals(LTId)) {
                teacherId = Main.ltTeacherArrayList.get(i).getTeacherId();
                System.out.println("Teacher Id : "+ teacherId);
                for (int j=0; j<Main.teacherArrayList.size(); j++) {
                    if (Main.teacherArrayList.get(j).getteacherId().equals(teacherId)) {
                        teacherName = teacherName + Main.teacherArrayList.get(j).getteacherName() + " ";
                        break; // 선생님 ID의 이름은 1개
                    }
                }
            }
        }
        return teacherName;
    }

    public List<String> getLectureTitleListByTeacherId(String teacherId){
        List<String> lectureTitle = new ArrayList<>();
        String strLTId;

        System.out.println("getLectureTitleListByTeacherId : " + teacherId); // T2403001

        //System.out.println(Main.ltTeacherArrayList.toString());

        // ltTeacherArrayList (강의 & 선생님 클래스)
        for (int i=0; i<Main.ltTeacherArrayList.size(); i++) {
            if (Main.ltTeacherArrayList.get(i).getTeacherId().equals(teacherId)) {
                strLTId = Main.ltTeacherArrayList.get(i).getLtID();
                System.out.println("Lecture Id : "+ strLTId);
                for (int j=0; j<Main.ltArrayList.size(); j++) { // Lecture ArrayList
                    if (Main.ltArrayList.get(j).getLtID().equals(strLTId)) {
                        lectureTitle.add(Main.ltArrayList.get(j).getLtName());
                        break; // 강의 이름 1개
                    }
                }
            }
        }
        return lectureTitle;
    }

    public boolean replaceFreeBoard(String freeBoardID, List<Reply> replies) {
        boolean checkData = false;

        return checkData;
    }

}

public class Main {

    static ArrayList<User> userArrayList;
    static ArrayList<Teacher> teacherArrayList;
    static ArrayList<Lecture> ltArrayList;
    static ArrayList<LectureTeacher> ltTeacherArrayList;
    static ArrayList<LectureRecord> ltRecordArrayList;
    static ArrayList<Review> ltReviewArrayList;

    static ArrayList<FreeBoard> freeboardArrayList;
    static ArrayList<Reply> replyArrayList;

    public static void main(String[] args) {

        // 정보 초기화
        InfoCreate.createInfors();

        LMSSearch lmsS1 = new LMSSearch();

        // 2번 (강의1번 ID 수강생의 Login ID 찾기)
        String strltNum = "LT24030001";
        lmsS1.getLoginIDByLTId(strltNum);

        // 3번 (유저의 Login ID로 강의명 찾기 -> 배열로)
        String strUserID = "24030002";
        lmsS1.getLTNameByUserId(strUserID);

        // 4번 (강의명으로 수강생들의 이메일 찾기 -> 배열로)
        String strltName = "JAVA교육자료01";
        lmsS1.getEmailByLTName(strltName);

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

        Main.ltReviewArrayList = new ArrayList<>();

        System.out.println("Review 관리 체크 시작!!!===========================================================");

        String strReviewID1     = "R240329001"; // ReviewID
        String strReviewLogin1  = "24030001"; // 24030001 ~ 24030005
        String strReviewLTID1   = "LT24030001"; // LT24030001 ~ LT24030003
        int    strReviewRating1 = 10; // 1 ~ 10
        String strReviewText1   = "좋은 강의였어요."; // "좋은 강의였어요."

        String strReviewID2     = "R240329002"; // ReviewID
        String strReviewLogin2  = "24030001"; // 24030001 ~ 24030005
        String strReviewLTID2   = "LT24030001"; // LT24030001 ~ LT24030003
        int    strReviewRating2 = 10; // 1 ~ 10
        String strReviewText2   = "좋은 강의였어요."; // "좋은 강의였어요."

        Review rev1 = new Review(strReviewID1,strReviewLogin1,strReviewLTID1,strReviewRating1,strReviewText1);
        Review rev2 = new Review(strReviewID2,strReviewLogin2,strReviewLTID2,strReviewRating2,strReviewText2);
        System.out.println(rev1.toString());
        System.out.println(rev2.toString());
        System.out.println();

        // Review Class Test
        boolean checkData;

        checkData = false;
        checkData = rev1.createReview(strReviewLogin1, strReviewLTID1, strReviewRating1, strReviewText1);
        System.out.println("[InforCreate] rev1 의 결과는: "+checkData);
        if (checkData == true) {
            Main.ltReviewArrayList.add(rev1);
        }
        System.out.println("[InforCreate] "+Main.ltReviewArrayList.toString());

        checkData = false;
        checkData = rev2.createReview(strReviewLogin2, strReviewLTID2, strReviewRating2, strReviewText2);
        System.out.println("[InforCreate] rev2 의 결과는: "+checkData);
        if (checkData == true) {
            Main.ltReviewArrayList.add(rev2);
        }

        System.out.println(Main.ltReviewArrayList.toString());
        System.out.println("Review 관리 체크 종료!!!=======================================================");

//        System.out.println(Main.userArrayList.toString());     // 유저 ArrayList
//        System.out.println(Main.ltArrayList.toString());       // 강의 ArrayList
//        System.out.println(Main.ltRecordArrayList.toString()); // 강의관리 ArrayList
//        System.out.println(Main.ltReviewArrayList.toString()); // 강의 Review ArrayList
        System.out.println();

        // Main.ltReviewArrayList

        // 240402
        // 1) Teacher 클래스
        //    - User 의 로그인 ID 처럼 teacherId 필요
        //    - 이름필드 필요
        //    - 기타 필요한 필드는 각자 만들어주세요
        //
        // 2) LectureTeacher 클래스
        //    - 어느 teacher 가 어느 과목을 가르치는지 관계를 저장하는 클래스
        //
        // 3) 관련 메서드 만들기
        //    3-1) getTeacherByLectureId : 특정 과목ID로 해당 과목을 가르치는 teacher의 이름 출력
        //    3-2) getLectureTitleListByTeacherId : 특정 teacher가 가르치는 과목명 리스트 출력
        //                                          (반드시 String[] 또는 List<String> 에 담아서 리턴)

        String strLTId = "LT24030001";
        System.out.println(lmsS1.getTeacherByLectureId(strLTId)); // 특정과목 ID 로 해당 과목을 가르치는 teacher 의 이름 출력
        System.out.println();

        List<String> ltNameArrayList = new ArrayList<>();

        String teacherId = "T2403001";
        ltNameArrayList = lmsS1.getLectureTitleListByTeacherId(teacherId);
        System.out.println(ltNameArrayList.toString());

        // 1. FreeBoard 클래스 (자유게시판 엔티티)
        //    1-1) FBId, FBTitle, FBContent, loginId 필드 필수, 나머지 필요하다고 생각되는 필드는 각자 추가
        //    1-2) List<Reply> replies 필드 사용
        //         : Reply 클래스와의 관계를 따로 외부 클래스로 작성하지 않고 내부에 List 타입으로 저장
        //
        // 2. Reply 클래스 (답글 엔티티)
        //    1-1) RPid, RPContent, loginId 필드 필수, 나머지 필요하다고 생각되는 필드는 각자 추가
        //    1-2) freeBoardId 필드 사용
        //         : 댓글이 자유게시판의 어느 글의 댓글인지 저장
        //    1-3) Reply 객체가 생성될때 1-2의 해당 글의 객체에 있는 replies 에 등록이 되어야 한다.
        //         : 해결하기 위한 단계별 예시
        //         - freeBoardId 를 이용하여 해당 FreeBoard 객체를 찾는다.
        //         - 위에서 찾은 FreeBoard 객체내에 setReplies 메서드를 이용하여 Reply 객체를
        //           Freeboard 객체의 replies 에 추가한다.
        //           => 이때 setReplies 메서드의 내용을 변경할 필요가 있을 수 있음!!

        Main.freeboardArrayList = new ArrayList<>();
        Main.replyArrayList = new ArrayList<>();

        FreeBoard freeBoard1 = new FreeBoard("FB24040001","게시판01","게시판 내용 1입니다.","24030001",null);
        FreeBoard freeBoard2 = new FreeBoard("FB24040002","게시판02","게시판 내용 2입니다.","24030001",null);
        FreeBoard freeBoard3 = new FreeBoard("FB24040003","게시판03","게시판 내용 3입니다.","24030001",null);

        String freeBoardId = "FB24040001";
        String freeBoardTitle = "";
        String freeBoardContent = "";
        String loginId = "";

        Reply reply1 = new Reply("RP24040001","게시판01의 Reply01", "24030002", freeBoardId);
        List<Reply> replies1 = new ArrayList<>();
        replies1.add(reply1);
        for (int i=0; i<Main.freeboardArrayList.size(); i++) {
            if (Main.freeboardArrayList.get(i).getFreeBoardId().equals(freeBoardId)) {
                freeBoardTitle = Main.freeboardArrayList.get(i).getFreeBoardTitle();
                freeBoardContent = Main.freeboardArrayList.get(i).getFreeBoardContent();
                loginId = Main.freeboardArrayList.get(i).getLoginId();

                Main.freeboardArrayList.set(i, new FreeBoard(freeBoardId,freeBoardTitle,freeBoardContent,loginId,replies1));
            }
        }

        Reply reply2 = new Reply("RP24040002","게시판01의 Reply02", "24030003", freeBoardId);
        Reply reply3 = new Reply("RP24040003","게시판01의 Reply03", "24030004", freeBoardId);
        Reply reply4 = new Reply("RP24040004","게시판01의 Reply04", "24030005", freeBoardId);



    }
}
