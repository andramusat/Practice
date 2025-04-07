package LicentaTurism.clase;

public interface AbstractTourismLicense {
    void setLicenseNumber(String newLicenseNumber) throws TooManyChangeLicenseRequests;
}
