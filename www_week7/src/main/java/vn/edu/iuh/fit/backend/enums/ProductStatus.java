package vn.edu.iuh.fit.backend.enums;

public enum ProductStatus {
    ACTIVE(0),//đang kinh doanh
    IN_ACTIVE(1), //tam ngung
    TERMINATED(-1); //khong ban nua
    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
