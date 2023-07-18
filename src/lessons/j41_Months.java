package lessons;

public enum j41_Months {

    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKİM(31),
    KASIM(30),
    ARALIK(31);

    int days;
    j41_Months(int i) {
        days=i;
    }
    void setDays(){
        System.out.println("days"+days);
    }
}
