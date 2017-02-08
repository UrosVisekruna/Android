package uros.chemdry;

/**
 * Created by Uros on 2/7/2017.
 */
public class Musterija {

    public String imeMusterije;
    public String prezimeMusterije;
    public String adresaMusterije;
    public String brTelMusterije;
    public String uslugaMusteriji;

    public Musterija(String imeMusterije, String prezimeMusterije, String adresaMusterije, String brTelMusterije, String uslugaMusteriji) {
        this.imeMusterije = imeMusterije;
        this.prezimeMusterije = prezimeMusterije;
        this.adresaMusterije = adresaMusterije;
        this.brTelMusterije = brTelMusterije;
        this.uslugaMusteriji = uslugaMusteriji;
    }

    public String getUslugaMusteriji() {
        return uslugaMusteriji;
    }

    public void setUslugaMusteriji(String uslugaMusteriji) {
        this.uslugaMusteriji = uslugaMusteriji;
    }

    public String getImeMusterije() {
        return imeMusterije;
    }

    public void setImeMusterije(String imeMusterije) {
        this.imeMusterije = imeMusterije;
    }

    public String getPrezimeMusterije() {
        return prezimeMusterije;
    }

    public void setPrezimeMusterije(String prezimeMusterije) {
        this.prezimeMusterije = prezimeMusterije;
    }

    public String getBrTelMusterije() {
        return brTelMusterije;
    }

    public void setBrTelMusterije(String brTelMusterije) {
        this.brTelMusterije = brTelMusterije;
    }

    public String getAdresaMusterije() {
        return adresaMusterije;
    }

    public void setAdresaMusterije(String adresaMusterije) {
        this.adresaMusterije = adresaMusterije;
    }
}
