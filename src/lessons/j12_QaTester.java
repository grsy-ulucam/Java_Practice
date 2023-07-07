package lessons;

public class j12_QaTester extends j11_Clarusway {

    int offer = 99;

    int batch = 3;

    j12_QaTester() {
        Clarusswayy2();
        System.out.println(this.offer);
        System.out.println(super.name);
        System.out.println(super.offer);
        System.out.println(super.cohort);
        System.out.println(this.batch);
    }

    public static void main(String[] args) {
        j12_QaTester qaTesterr = new j12_QaTester();
    }

}
