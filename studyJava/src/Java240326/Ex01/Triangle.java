package Java240326.Ex01;

public class Triangle implements Shape{

    private double taBottomLength; // 밑변의 길이

    private double taHeight; // 높이의 길이

    private double taSideALength; // A side 길이

    private double taSideBLength; // B side 길이

    public Triangle() {
    }

    public Triangle(double taBottomLength, double taHeight, double taSideALength, double taSideBLength) {
        this.taBottomLength = taBottomLength;
        this.taHeight = taHeight;
        this.taSideALength = taSideALength;
        this.taSideBLength = taSideBLength;
    }

    public double getTaBottomLength() {
        return taBottomLength;
    }

    public void setTaBottomLength(double taBottomLength) {
        this.taBottomLength = taBottomLength;
    }

    public double getTaHeight() {
        return taHeight;
    }

    public void setTaHeight(double taHeight) {
        this.taHeight = taHeight;
    }

    public double getTaSideALength() {
        return taSideALength;
    }

    public void setTaSideALength(double taSideALength) {
        this.taSideALength = taSideALength;
    }

    public double getTaSideBLength() {
        return taSideBLength;
    }

    public void setTaSideBLength(double taSideBLength) {
        this.taSideBLength = taSideBLength;
    }

    @Override
    public double calculateArea() {
        return taBottomLength * taHeight / 2;
    }

    @Override
    public double calculatePerimeter() {
        return taBottomLength + taSideALength + taSideBLength;
    }
}
