package br.com.lapic.thomas.syncplayer.utils;

import android.os.Environment;

import java.io.File;

/**
 * Created by thomas on 26/08/17.
 */

public class AppConstants {

    public static String MEDIAS_PARCEL = "medias_parcel";
    public static File FILE_PATH_DOWNLOADS = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    public static String PATH_APP = "app/";
    public static String PATH_METADATA_FILE = "app/main.json";
    public static String VIDEO = "video";
    public static String IMAGE = "image";
    public static String AUDIO = "audio";
    public static String URL = "url";
    public static String MEDIAS = "medias";
    public static String ID = "id";
    public static String SRC = "src";
    public static String TYPE = "type";
    public static String GROUPS = "groups";
    public static String ANCHORS = "anchors";
    public static String BEGIN = "begin";
    public static String END = "end";
    public static String DUR = "dur";

    public static String GET_AMOUNT_GROUPS = "get_amount_groups";
    public static String TOTAL_GROUPS = "total_groups=";
    public static String DEVICE = "device=";

    public static String MY_GROUP = "my_group";

    public static String DOWNLOAD_MULTCAST_IP = "230.192.0.11";
    public static String CONFIG_MULTICAST_IP = "230.192.0.12";
    public static int CONFIG_MULTICAST_PORT = 1026;
    public static int DOWNLOAD_MULTICAST_PORT = 1025;

    public static int DOWNLOAD_SOCKET_PORT = 8080;

    public static final String BROADCAST_ACTION = "com.example.android.threadsample.BROADCAST";
    public static final String EXTENDED_DATA_STATUS = "com.example.android.threadsample.STATUS";

    public static String GROUP_CONFIG = "GROUP_CONFIG";
    public static String TO_DOWNLOAD = "TO_DOWNLOAD";
    public static String ACTION = "ACTION";
    public static String START = "START";
    public static String STOP = "STOP";
    public static String TIMESTAMP = "timestamp";

    public static final int CONTENT_VIEW_ID = 10101010;

    public static String APP_PARCEL = "app_parcel";
}
