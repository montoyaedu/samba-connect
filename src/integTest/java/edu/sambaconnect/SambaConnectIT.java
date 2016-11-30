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
        String user = System.getProperty("share.user");
        String password = System.getProperty("share.password");
        String url = System.getProperty("share.url");
        try {
            sambaConnect.connectTo(user, password, url);
        } catch (Exception e) {
            fail("should not throw an exception. instead it thrown " + e);
        }
    }
}
