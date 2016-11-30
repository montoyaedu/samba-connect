package edu.sambaconnect;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;

public class SambaConnect {
    public SambaConnect() {
    }

    public void connectTo(String user, String password, String shareUrl) throws Exception {
        NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, user, password);
        SmbFile dir = new SmbFile(shareUrl, auth);
        for (SmbFile f : dir.listFiles())
        {
            System.out.println(f.getName());
        }
    }
}
