package pappco.emailcimgyujto;

public class Player {

    private String mName;
    private String mEmail;
    private int mEredmeny;
    private int mNap;
    private JatekTipus jatekTipus;

    public Player(String mName, String mEmail, int mEredmeny, int mNap, JatekTipus jatekTipus) {
        this.mName = mName;
        this.mEmail = mEmail;
        this.mEredmeny = mEredmeny;
        this.mNap = mNap;
        this.jatekTipus = jatekTipus;
    }


    public int getmNap() {
        return mNap;
    }

    public void setmNap(int mNap) {
        this.mNap = mNap;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public int getmEredmeny() {
        return mEredmeny;
    }

    public void setmEredmeny(int mEredmeny) {
        this.mEredmeny = mEredmeny;
    }

    @Override
    public String toString() {
        return "Player{" +
                "mName='" + mName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mEredmeny=" + mEredmeny +
                ", mNap=" + mNap +
                ", jatekTipus=" + jatekTipus +
                '}';
    }
}
