package Java240328;

public class Reply {
    // replyId, replyContent, loginId 필드 필수, 나머지 필요하다고 생각되는 필드는 각자 추가
    // 1-2) freeBoardId 필드 사용
    String replyId;
    String replyContent;
    String loginId;
    String freeBoardId;

    public Reply() {
    }

    public Reply(String replyId, String replyContent, String loginId, String freeBoardId) {
        this.replyId = replyId;
        this.replyContent = replyContent;
        this.loginId = loginId;
        this.freeBoardId = freeBoardId;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(String freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId='" + replyId + '\'' +
                ", replyContent='" + replyContent + '\'' +
                ", loginId='" + loginId + '\'' +
                ", freeBoardId='" + freeBoardId + '\'' +
                '}';
    }
}
