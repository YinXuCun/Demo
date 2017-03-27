import org.apache.commons.net.ftp.*;

import java.io.*;

/**
 * Created by yinxu on 2017/3/21.
 */
public class FTPManager {


    private static final String TAG = "FTPManager";
    private static FTPManager mFtpManager;
    private FTPClient ftpClient;
    private FTPSClient mFtpsClient;
    private static FTPClientConfig ftpClientConfig;
    private boolean isFTPS = false;
    volatile boolean isLogin = false;
    volatile boolean isStopDownload = false;
    private FileInputStream in;
    private  FileOutputStream out;
    private  static FTPManager ftpManager;
    public  static FTPManager getmFtpManager(){
        return  new FTPManager();
    }
    private FTPManager(){}}