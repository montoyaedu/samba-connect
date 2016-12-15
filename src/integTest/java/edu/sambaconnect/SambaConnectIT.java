package edu.sambaconnect;

import static org.junit.Assert.*;
import org.junit.Test;

public class SambaConnectIT {

    @Test public void
    thatCanCreateSambaConnectClient() {
        SambaConnect sambaConnect = new SambaConnect();
    }

    @Test public void
    thatCanConnectToKnownShare() {
        SambaConnect sambaConnect = new SambaConnect();
        String user = "example1";
        String password = "badpass";
        String url = "smb://127.0.0.1/example1/";
        try {
            sambaConnect.connectTo(user, password, url);
        } catch (Exception e) {
            fail("should not throw an exception. instead it thrown " + e);
        }
    }
}
