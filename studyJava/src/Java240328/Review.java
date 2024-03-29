package Java240328;

public class Review {
    // 1~10점까지 점수와 간단한 텍스트로 리뷰를 남김
    String reviewID;
    String loginID; //userID
    String lectureID; // 강의 아이디
    int reviewRating;
    String reviewText;
    public Review() {
    }

    public Review(String loginID, String lectureID, int reviewRating, String reviewText) {
        this.loginID = loginID;
        this.lectureID = lectureID;
        this.reviewRating = reviewRating;
        this.reviewText = reviewText;
    }

    public Review(String reviewID, String loginID, String lectureID, int reviewRating, String reviewText) {
        this.reviewID = reviewID;
        this.loginID = loginID;
        this.lectureID = lectureID;
        this.reviewRating = reviewRating;
        this.reviewText = reviewText;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getLectureID() {
        return lectureID;
    }

    public void setLectureID(String lectureID) {
        this.lectureID = lectureID;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewID='" + reviewID + '\'' +
                ", loginID='" + loginID + '\'' +
                ", lectureID='" + lectureID + '\'' +
                ", reviewRating=" + reviewRating +
                ", reviewText='" + reviewText + '\'' +
                '}';
    }

    public boolean createReview(String userID, String lectureID, int reviewRating, String reviewText) { // 리뷰를 생성하는 메서드
        boolean checkCreate = false;
        // 단, 내부 기능이 필요 => 아래의 에러 경우에는 메서드가 false 를 리턴
        // Review 객체가 정상적으로 생성되는 경우에만 true 를 리턴함!!! => 생성객체는 ArrayList 로 관리
        // 2-1) 점수는 1~10점 사이, 점수는 필수(1~10을 벗어나면 false 리턴)
        // 2-2) 한명의 유저가 하나의 강의에 한번 리뷰를 남길 수 있음
        // 2-3) 수강하지 않은 과목에는 리뷰를 남길 수 없음
        // 예) createReview("hero11", 1, 10, "좋은 강의였어요"); // 객체생성하고 true 리턴
        //    createReview("hero11", 1, 100, "좋은 강의였어요"); // 점수 에러이므로 false 리턴
        //    createReview("tommy", 3, 5, "그저그럼"); // tommy는 3번 강의를 수강안하므로 false 리턴

        // user 가 강의를 수강했는지 체크 (ltRecordArrayList)
        boolean checkLT = false;
        for (int i=0; i<Main.ltRecordArrayList.size(); i++) {
            if (Main.ltRecordArrayList.get(i).getUserId().equals(userID) && Main.ltRecordArrayList.get(i).getLtID().equals(lectureID)) {
                checkLT = true;
            }
        }
        //System.out.println("User 강의 수강 체크: [" + checkLT + "]");

        // 기존에 Review 데이터가 있는지 체크 (ltReviewArrayList)
        System.out.println("[Review] 기존에 Review 데이터가 있는지 체크 함수:"+Main.ltReviewArrayList.toString());
        boolean checkReview = false;
        for (int i=0; i<Main.ltReviewArrayList.size(); i++) {
            if (Main.ltReviewArrayList.get(i).getLoginID().equals(userID) && Main.ltReviewArrayList.get(i).getLectureID().equals(lectureID)) {
                checkReview = true;
            } else {
                checkReview = false;
            }
        }
        System.out.println("[Review] 기존에 Review 데이터가 있는지 체크: [" + checkReview + "]");

        // 점수 범위 Check
        boolean checkRating = false;
        if (reviewRating < 1 || reviewRating > 10) {
            checkRating = false;
        } else {
            checkRating = true;
        }
        //System.out.println("점수 범위 Check: [" + checkRating + "]");

        if (checkLT == true && checkReview == false && checkRating == true) { // 강의를 수강했고(true), 기존에 데이터가 없고(false), Rating 이 true 면 true
            checkCreate = true;
        } else {
            checkCreate = false;
        }
        //System.out.println("저장 가능여부 Check: [" + checkCreate + "]");

        // 출력 체크
        if (checkCreate == false) {
            if (checkLT == false) {
                System.out.println("오류: 강의를 듣지 않았습니다!!!");
            } else if (checkReview == true) {
                System.out.println("오류: 이미 리뷰가 있습니다!!!");
            } else if (checkRating == false) {
                System.out.println("오류: 리뷰 점수의 범위가 벗어났습니다!!!");
            }
        }

        return checkCreate;
    }



}
