package timf.hw.model.enums;

public enum AttributableCode {
    EMPTY(0), Customer(1), Carrier(2);

    private int attributableCode;

    AttributableCode(int attributableCode) {
        this.attributableCode = attributableCode;
    }

    public int getValue(){
        return attributableCode;
    }
}
