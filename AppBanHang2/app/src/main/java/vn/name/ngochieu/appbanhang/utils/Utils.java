package vn.name.ngochieu.appbanhang.utils;

import java.util.ArrayList;
import java.util.List;

import vn.name.ngochieu.appbanhang.model.GioHang;
import vn.name.ngochieu.appbanhang.model.User;

public class Utils {
    public  static  final  String BASE_URL="http://10.21.66.21/banhang/";
    public  static List<GioHang> manggiohang;
    public  static List<GioHang> mangmuahang = new ArrayList<>();
    public  static User user_current = new User();
    public  static  String ID_RECEIVED;
    public  static final String SENDID = "idsend";
    public  static final String RECEIVEDID="idreceived";
    public  static final String MESS="message";
    public  static final String DATETIME="datetime";
    public  static final String PATH_CHAT="chat";
}
