package LicentaTurism.clase;

public class LicentaDeTurism implements AbstractTourismLicense{
    private static LicentaDeTurism instance;
    private String licenseNumber;
    private boolean isLicenseNumberChanged;

    private LicentaDeTurism(){
        this.licenseNumber = "";
        this.isLicenseNumberChanged = false;
    }

    public static synchronized LicentaDeTurism getInstance(){
        if(instance == null){
            instance = new LicentaDeTurism();
        }
        return instance;
    }
    @Override
    public void setLicenseNumber(String newLicenseNumber) throws TooManyChangeLicenseRequests {
        if(this.isLicenseNumberChanged){
            throw new TooManyChangeLicenseRequests("The license number has already been changed.");
        } else {
            this.licenseNumber = newLicenseNumber;
            this.isLicenseNumberChanged = true;
            System.out.println("Licence number changed to: " + this.licenseNumber);
        }
    }
}
