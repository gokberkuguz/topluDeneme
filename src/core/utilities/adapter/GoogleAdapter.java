package core.utilities.adapter;

import googleService.Google;

public class GoogleAdapter implements CheckIfMailExistService{
    @Override
    public void checkIfMailExists(String email) {
        Google google=new Google();
        google.checkIfGmailExists(email);
    }
}
