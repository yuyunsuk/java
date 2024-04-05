package Java240328;

import java.util.List;

public class FreeBoard {
    String FreeBoardId;
    String FreeBoardTitle;
    String FreeBoardContent;
    String loginId;
    List<Reply> replies;

    public FreeBoard() {
    }

    public FreeBoard(String freeBoardId, String freeBoardTitle, String freeBoardContent, String loginId, List<Reply> replies) {
        FreeBoardId = freeBoardId;
        FreeBoardTitle = freeBoardTitle;
        FreeBoardContent = freeBoardContent;
        this.loginId = loginId;
        this.replies = replies;
    }

    public String getFreeBoardId() {
        return FreeBoardId;
    }

    public void setFreeBoardId(String freeBoardId) {
        FreeBoardId = freeBoardId;
    }

    public String getFreeBoardTitle() {
        return FreeBoardTitle;
    }

    public void setFreeBoardTitle(String freeBoardTitle) {
        FreeBoardTitle = freeBoardTitle;
    }

    public String getFreeBoardContent() {
        return FreeBoardContent;
    }

    public void setFreeBoardContent(String freeBoardContent) {
        FreeBoardContent = freeBoardContent;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public void setReplies(Reply reply) {
        replies.add(reply);
    } // FreeBoard 의 setReplies (세터)의 오버로딩, List add 로 사용

    @Override
    public String toString() {
        return "FreeBoard{" +
                "FreeBoardId='" + FreeBoardId + '\'' +
                ", FreeBoardTitle='" + FreeBoardTitle + '\'' +
                ", FreeBoardContent='" + FreeBoardContent + '\'' +
                ", loginId='" + loginId + '\'' +
                ", replies=" + replies +
                '}';
    }
}
