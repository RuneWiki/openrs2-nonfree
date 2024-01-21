import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private static int anInt846;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private static int anInt848;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private static int anInt850;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int anInt856;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	private static boolean aBoolean235;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private static int anInt857;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	public static int anInt866;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private static int anInt871;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
	private static boolean aBoolean243;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
	private static boolean aBoolean247;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private static int anInt897;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private static int anInt905;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!QAJCAYDZ;")
	public static Class4_Sub1_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private static int anInt913;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
	private static boolean aBoolean254;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private static int anInt961;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private static int anInt963;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private static boolean aBoolean257;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private static int anInt974;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private static int anInt979;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private static int anInt1008;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private static int anInt1040;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private static int anInt844 = -313;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private static int anInt855 = 10;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private static boolean aBoolean234 = true;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljava/lang/String;")
	private static String aString21 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private static int[] anIntArray218 = new int[99];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private static int anInt912;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private static boolean aBoolean252;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private static int anInt980;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Z")
	private static boolean aBoolean259;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	public static int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "B")
	private static byte aByte36;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	public static final int[] anIntArray267;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private static int anInt1042;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_3;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_4;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_5;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_6;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_7;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_8;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_9;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_10;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_11;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!RLQTDOAP;")
	private Class4_Sub1_Sub2_Sub4 aClass4_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!RLQTDOAP;")
	private Class4_Sub1_Sub2_Sub4 aClass4_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!RLQTDOAP;")
	private Class4_Sub1_Sub2_Sub4 aClass4_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!RLQTDOAP;")
	private Class4_Sub1_Sub2_Sub4 aClass4_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!KYNTOGBR;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_12;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_13;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_14;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!TKEGJSFV;")
	private Class38 aClass38_2;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!DHNAQSHE;")
	private Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!QHNACLRF;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!GAUMGPFH;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_15;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_16;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_17;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_18;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_6;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_8;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!UFCPVKNJ;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_9;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_10;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_11;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_12;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_13;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_19;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_20;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_21;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_22;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_23;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_24;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_25;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_26;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Lclient!YJGBGRIO;")
	private Class47 aClass47_27;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_14;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_15;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_16;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_17;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_18;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_19;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1 aClass4_Sub1_Sub2_Sub1_20;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "[Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1[] aClass4_Sub1_Sub2_Sub1Array5;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "B")
	private byte aByte29 = -40;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt843 = 2;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt845 = 9538;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	public int[] anIntArray212 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt852 = 7759444;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray213 = new int[50];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[Lclient!BXNXROZD;")
	private Class3[] aClass3Array1 = new Class3[4];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1[] aClass4_Sub1_Sub2_Sub1Array2 = new Class4_Sub1_Sub2_Sub1[2];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt854 = 3;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt864 = -1;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	private int[] anIntArray214 = new int[200];

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt865 = 1;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array4 = new Class4_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt868 = 1;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt869 = 4;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt870 = -1;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray215 = new int[Class30.anInt527];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray216 = new int[7];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray217 = new int[50];

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt875 = 2301979;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "B")
	private byte aByte30 = -71;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!EGCCHUZS;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_6 = Class4_Sub1_Sub3.method155();

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private int[] anIntArray219 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "B")
	private byte aByte31 = 5;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "B")
	private byte aByte32 = 2;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private volatile boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
	private int[] anIntArray220 = new int[33];

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt899 = 1;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt904 = 50;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray221 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray222 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray223 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
	private int[] anIntArray224 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray225 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
	private int[] anIntArray226 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	private int[] anIntArray227 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt906 = -1;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array5 = new Class4_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt907 = 2048;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt908 = 2047;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[Lclient!QAJCAYDZ;")
	private Class4_Sub1_Sub1_Sub1_Sub2[] aClass4_Sub1_Sub1_Sub1_Sub2Array1 = new Class4_Sub1_Sub1_Sub1_Sub2[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray228 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray229 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[Lclient!EGCCHUZS;")
	private Class4_Sub1_Sub3[] aClass4_Sub1_Sub3Array1 = new Class4_Sub1_Sub3[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray230 = new int[500];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray231 = new int[500];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
	private int[] anIntArray232 = new int[500];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray233 = new int[500];

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray234 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
	private int[] anIntArray235 = new int[1000];

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private final int[] anIntArray236 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
	private int[] anIntArray237 = new int[50];

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[I")
	private int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt920 = -39192;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt926 = 3353893;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array6 = new Class4_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt934 = -1;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	private int[] anIntArray241 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt944 = -253;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private final int anInt945 = 100;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
	private int[] anIntArray242 = new int[100];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Lclient!LORGYGVM;")
	private Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt946 = 5063219;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray243 = new int[5];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt958 = -1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt959 = -1;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
	private int[] anIntArray247 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "B")
	private byte aByte33 = -92;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!JQSVNFRT;")
	private Class23 aClass23_10 = new Class23(0);

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt964 = 2;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private volatile boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray248 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!JQSVNFRT;")
	private Class23 aClass23_11 = new Class23(0);

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray253 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1[] aClass4_Sub1_Sub2_Sub1Array3 = new Class4_Sub1_Sub2_Sub1[100];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt971 = -1;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	private int[] anIntArray254 = new int[9];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Z")
	private volatile boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "B")
	private byte aByte34 = -92;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt973 = 5;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[500];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt975 = 762;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray255 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt978 = -1;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray256 = new int[Class30.anInt527];

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!EGCCHUZS;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_7 = Class4_Sub1_Sub3.method155();

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt990 = -1;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Lclient!JQSVNFRT;")
	private Class23 aClass23_12 = new Class23(0);

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray257 = new int[5];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[Lclient!DGXCFOYI;")
	private Class4_Sub1_Sub2_Sub1[] aClass4_Sub1_Sub2_Sub1Array4 = new Class4_Sub1_Sub2_Sub1[13];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[I")
	private int[] anIntArray258 = new int[256];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array7 = new Class4_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private int[] anIntArray259 = new int[4000];

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
	private int[] anIntArray260 = new int[4000];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Z")
	private boolean aBoolean266 = true;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "B")
	private byte aByte35 = -88;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1005 = -1;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1006 = 78;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array8 = new Class4_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!EGCCHUZS;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_8 = new Class4_Sub1_Sub3(new byte[5000], false);

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[Lclient!CHUIKYUV;")
	private Class4_Sub1_Sub1_Sub1_Sub1[] aClass4_Sub1_Sub1_Sub1_Sub1Array1 = new Class4_Sub1_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray262 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt1010 = -11857;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1011 = 128;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array9 = new Class4_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1015 = -696;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray263 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[Lclient!HOSNGCXH;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array10 = new Class4_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "B")
	private byte aByte37 = 9;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1017 = -1;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1018 = -1;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Z")
	private boolean aBoolean268 = true;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "B")
	private byte aByte38 = 9;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	private int[] anIntArray266 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1035 = 2;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[[[Lclient!JQSVNFRT;")
	private Class23[][][] aClass23ArrayArrayArray1 = new Class23[4][104][104];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Z")
	public boolean aBoolean272 = false;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Lclient!EGCCHUZS;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_9 = Class4_Sub1_Sub3.method155();

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1043 = -1;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1044 = -1;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "B")
	private byte aByte39 = 5;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "B")
	private byte aByte40 = 3;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	private int[] anIntArray268 = new int[33];

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "B")
	private byte aByte41 = 8;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[Lclient!EEVNVHNQ;")
	public Class11[] aClass11Array1 = new Class11[5];

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1050 = -1;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "B")
	private byte aByte42 = 5;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
	private int[] anIntArray269 = new int[100];

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
	private boolean aBoolean273 = false;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray270 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Z")
	private boolean aBoolean274 = true;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1059 = 4;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
	private int[] anIntArray275 = new int[Class30.anInt527];

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1064 = 2;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "Z")
	private boolean aBoolean276 = false;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < 99; local14++) {
			@Pc(19) int local19 = local14 + 1;
			@Pc(32) int local32 = (int) ((double) local19 + Math.pow(2.0D, (double) local19 / 7.0D) * 300.0D);
			local12 += local32;
			anIntArray218[local14] = local12 / 4;
		}
		anInt912 = 64;
		aBoolean252 = true;
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt980 = 258;
		aBoolean259 = true;
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray261 = new int[32];
		local12 = 2;
		for (local14 = 0; local14 < 32; local14++) {
			anIntArray261[local14] = local12 - 1;
			local12 += local12;
		}
		aByte36 = 8;
		anIntArray267 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt1042 = 6;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private static String method597(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("92504, " + arg0 + ", " + false + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private static void method657() {
		try {
			Class25.aBoolean137 = true;
			Class4_Sub1_Sub2_Sub3.aBoolean165 = true;
			aBoolean235 = true;
			Class29.aBoolean150 = true;
			Class20.aBoolean86 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("40808, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 346);
			if (arg0.length == 5) {
				anInt855 = Integer.parseInt(arg0[0]);
				anInt856 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method657();
				} else if (arg0[2].equals("highmem")) {
					method694();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean234 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean234 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1067 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method573();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private static String method692(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(9) int local9 = local4.length() - 3; local9 > 0; local9 -= 3) {
				local4 = local4.substring(0, local9) + "," + local4.substring(local9);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("34307, " + 0 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private static void method694() {
		try {
			Class25.aBoolean137 = false;
			Class4_Sub1_Sub2_Sub3.aBoolean165 = false;
			aBoolean235 = false;
			Class29.aBoolean150 = false;
			Class20.aBoolean86 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("15732, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	private static String method696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg1 - arg0;
			if (local12 < -9) {
				return "@red@";
			} else if (local12 < -6) {
				return "@or3@";
			} else if (local12 < -3) {
				return "@or2@";
			} else if (local12 < 0) {
				return "@or1@";
			} else if (local12 > 9) {
				return "@gre@";
			} else if (local12 > 6) {
				return "@gr3@";
			} else if (local12 > 3) {
				return "@gr2@";
			} else if (local12 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("72450, " + arg0 + ", " + arg1 + ", " + 56 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!DGXCFOYI;)V")
	private void method586(@OriginalArg(1) Class4_Sub1_Sub2_Sub1 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray239.length; local5++) {
				this.anIntArray239[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray239[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray240[local60] = (this.anIntArray239[local60 - 1] + this.anIntArray239[local60 + 1] + this.anIntArray239[local60 - 128] + this.anIntArray239[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray239;
				this.anIntArray239 = this.anIntArray240;
				this.anIntArray240 = local106;
			}
			this.aBoolean272 &= true;
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt196; local52++) {
					for (local60 = 0; local60 < arg0.anInt195; local60++) {
						if (arg0.aByteArray2[local48++] != 0) {
							@Pc(148) int local148 = local60 + arg0.anInt197 + 16;
							@Pc(155) int local155 = local52 + arg0.anInt198 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray239[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("28055, " + true + ", " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method587(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = 256 - arg3;
			return arg0 ? 3 : ((arg2 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("97495, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class23 local9 = this.aClass23ArrayArrayArray1[this.anInt965][arg0][arg1];
		if (local9 == null) {
			this.aClass25_1.method363(this.anInt965, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class4_Sub1_Sub1_Sub4 local23 = null;
		@Pc(27) Class4_Sub1_Sub1_Sub4 local27;
		for (local27 = (Class4_Sub1_Sub1_Sub4) local9.method315(); local27 != null; local27 = (Class4_Sub1_Sub1_Sub4) local9.method317()) {
			@Pc(32) Class44 local32 = Class44.method536(local27.anInt391);
			@Pc(35) int local35 = local32.anInt794;
			if (local32.aBoolean217) {
				local35 *= local27.anInt390 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method313(local23);
		@Pc(65) Class4_Sub1_Sub1_Sub4 local65 = null;
		@Pc(67) Class4_Sub1_Sub1_Sub4 local67 = null;
		for (local27 = (Class4_Sub1_Sub1_Sub4) local9.method315(); local27 != null; local27 = (Class4_Sub1_Sub1_Sub4) local9.method317()) {
			if (local27.anInt391 != local23.anInt391 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt391 != local23.anInt391 && local27.anInt391 != local65.anInt391 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass25_1.method349(local65, local67, arg1, arg0, this.method699(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt965), local23, this.anInt965, local110);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZOMFWUWL;BI)V")
	private void method589(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			this.method590(arg2, arg0.anInt648, arg0.anInt649);
			@Pc(12) boolean local12 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("71944, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)V")
	private void method590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method699(arg1, arg2, this.anInt965) - arg0;
				@Pc(33) int local33 = arg1 - this.anInt983;
				@Pc(38) int local38 = local28 - this.anInt984;
				@Pc(43) int local43 = arg2 - this.anInt985;
				@Pc(48) int local48 = Class4_Sub1_Sub1_Sub3.anIntArray90[this.anInt986];
				@Pc(53) int local53 = Class4_Sub1_Sub1_Sub3.anIntArray91[this.anInt986];
				@Pc(58) int local58 = Class4_Sub1_Sub1_Sub3.anIntArray90[this.anInt987];
				@Pc(63) int local63 = Class4_Sub1_Sub1_Sub3.anIntArray91[this.anInt987];
				this.aBoolean272 &= true;
				@Pc(79) int local79 = local43 * local58 + local33 * local63 >> 16;
				@Pc(89) int local89 = local43 * local63 - local33 * local58 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local38 * local53 - local89 * local48 >> 16;
				@Pc(111) int local111 = local38 * local48 + local89 * local53 >> 16;
				if (local111 >= 50) {
					this.anInt1017 = Class4_Sub1_Sub2_Sub3.anInt578 + (local91 << 9) / local111;
					this.anInt1018 = Class4_Sub1_Sub2_Sub3.anInt579 + (local101 << 9) / local111;
				} else {
					this.anInt1017 = -1;
					this.anInt1018 = -1;
				}
			} else {
				this.anInt1017 = -1;
				this.anInt1018 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("5473, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method591(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray254[8] = 0;
			@Pc(12) boolean local12 = false;
			@Pc(14) int local14 = 0;
			while (this.anIntArray254[8] == 0) {
				@Pc(18) String local18 = "Unknown problem";
				this.method585("Connecting to web server", 20);
				try {
					@Pc(40) DataInputStream local40 = this.method652("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 346);
					@Pc(47) Class4_Sub1_Sub3 local47 = new Class4_Sub1_Sub3(new byte[40], false);
					local40.readFully(local47.aByteArray7, 0, 40);
					local40.close();
					for (@Pc(57) int local57 = 0; local57 < 9; local57++) {
						this.anIntArray254[local57] = local47.method172();
					}
					@Pc(72) int local72 = local47.method172();
					@Pc(74) int local74 = 1234;
					for (@Pc(76) int local76 = 0; local76 < 9; local76++) {
						local74 = (local74 << 1) + this.anIntArray254[local76];
					}
					if (local72 != local74) {
						local18 = "checksum problem";
						this.anIntArray254[8] = 0;
					}
				} catch (@Pc(103) EOFException local103) {
					local18 = "EOF problem";
					this.anIntArray254[8] = 0;
				} catch (@Pc(112) IOException local112) {
					local18 = "connection problem";
					this.anIntArray254[8] = 0;
				} catch (@Pc(121) Exception local121) {
					local18 = "logic problem";
					this.anIntArray254[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray254[8] == 0) {
					local14++;
					for (@Pc(139) int local139 = local3; local139 > 0; local139--) {
						if (local14 >= 10) {
							this.method585("Game updated - please reload page", 10);
							local139 = 10;
						} else {
							this.method585(local18 + " - Will retry in " + local139 + " secs.", 10);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(173) Exception local173) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean263 = !this.aBoolean263;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("76751, " + arg0 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method592(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt1009; local9++) {
				@Pc(19) Class4_Sub1_Sub1_Sub1_Sub1 local19 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray262[local9]];
				@Pc(28) int local28 = (this.anIntArray262[local9] << 14) + 536870912;
				if (local19 != null && local19.method469() && local19.aClass2_1.aBoolean3 == arg0 && local19.aClass2_1.method4(this.anInt944)) {
					@Pc(50) int local50 = local19.anInt648 >> 7;
					@Pc(55) int local55 = local19.anInt649 >> 7;
					if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
						if (local19.anInt644 == 1 && (local19.anInt648 & 0x7F) == 64 && (local19.anInt649 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local50][local55] == this.anInt1045) {
								continue;
							}
							this.anIntArrayArray24[local50][local55] = this.anInt1045;
						}
						if (!local19.aClass2_1.aBoolean2) {
							local28 += Integer.MIN_VALUE;
						}
						this.aClass25_1.method353((local19.anInt644 - 1) * 64 + 60, local19.aBoolean173, local19.anInt649, local19, this.method699(local19.anInt648, local19.anInt649, this.anInt965), local19.anInt648, this.anInt965, local28, local19.anInt650);
					}
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("60613, " + arg0 + ", " + 5 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QAJCAYDZ;IIB)V")
	private void method593(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != aClass4_Sub1_Sub1_Sub1_Sub2_1 && this.anInt1049 < 400) {
				@Pc(45) String local45;
				if (arg1.anInt686 == 0) {
					local45 = arg1.aString15 + method696(arg1.anInt689, aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt689) + " (level-" + arg1.anInt689 + ")";
				} else {
					local45 = arg1.aString15 + " (skill-" + arg1.anInt686 + ")";
				}
				@Pc(175) int local175;
				if (this.anInt885 == 1) {
					this.aStringArray10[this.anInt1049] = "Use " + this.aString25 + " with @whi@" + local45;
					this.anIntArray232[this.anInt1049] = 131;
					this.anIntArray233[this.anInt1049] = arg3;
					this.anIntArray230[this.anInt1049] = arg2;
					this.anIntArray231[this.anInt1049] = arg0;
					this.anInt1049++;
				} else if (this.anInt991 != 1) {
					for (local175 = 4; local175 >= 0; local175--) {
						if (this.aStringArray9[local175] != null) {
							this.aStringArray10[this.anInt1049] = this.aStringArray9[local175] + " @whi@" + local45;
							@Pc(202) short local202 = 0;
							if (this.aStringArray9[local175].equalsIgnoreCase("attack")) {
								if (arg1.anInt689 > aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt689) {
									local202 = 2000;
								}
								if (aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt690 != 0 && arg1.anInt690 != 0) {
									if (aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt690 == arg1.anInt690) {
										local202 = 2000;
									} else {
										local202 = 0;
									}
								}
							} else if (this.aBooleanArray12[local175]) {
								local202 = 2000;
							}
							if (local175 == 0) {
								this.anIntArray232[this.anInt1049] = local202 + 912;
							}
							if (local175 == 1) {
								this.anIntArray232[this.anInt1049] = local202 + 90;
							}
							if (local175 == 2) {
								this.anIntArray232[this.anInt1049] = local202 + 288;
							}
							if (local175 == 3) {
								this.anIntArray232[this.anInt1049] = local202 + 587;
							}
							if (local175 == 4) {
								this.anIntArray232[this.anInt1049] = local202 + 858;
							}
							this.anIntArray233[this.anInt1049] = arg3;
							this.anIntArray230[this.anInt1049] = arg2;
							this.anIntArray231[this.anInt1049] = arg0;
							this.anInt1049++;
						}
					}
				} else if ((this.anInt993 & 0x8) == 8) {
					this.aStringArray10[this.anInt1049] = this.aString29 + " @whi@" + local45;
					this.anIntArray232[this.anInt1049] = 673;
					this.anIntArray233[this.anInt1049] = arg3;
					this.anIntArray230[this.anInt1049] = arg2;
					this.anIntArray231[this.anInt1049] = arg0;
					this.anInt1049++;
				}
				for (local175 = 0; local175 < this.anInt1049; local175++) {
					if (this.anIntArray232[local175] == 506) {
						this.aStringArray10[local175] = "Walk here @whi@" + local45;
						return;
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("80157, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -77 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EGCCHUZS;I)V")
	private void method594(@OriginalArg(1) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1032 = 0;
			this.anInt910 = 0;
			this.method686(arg0, arg1);
			this.method662(arg1, arg0);
			this.method678(arg0, arg1);
			this.method668(arg1, arg0);
			@Pc(44) int local44;
			for (@Pc(37) int local37 = 0; local37 < this.anInt1032; local37++) {
				local44 = this.anIntArray266[local37];
				if (this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local44].anInt668 != anInt866) {
					this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local44] = null;
				}
			}
			if (arg0.anInt242 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt242 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local44 = 0; local44 < this.anInt909; local44++) {
				if (this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray228[local44]] == null) {
					signlink.reporterror(this.aString17 + " null entry in pl list - pos:" + local44 + " size:" + this.anInt909);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("36468, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LORGYGVM;I)Z")
	private boolean method595(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt480;
			if (this.anInt891 == 2) {
				if (local4 == 201) {
					this.aBoolean255 = true;
					this.anInt1020 = 0;
					this.aBoolean270 = true;
					this.aString27 = "";
					this.anInt1051 = 1;
					this.aString23 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean255 = true;
					this.anInt1020 = 0;
					this.aBoolean270 = true;
					this.aString27 = "";
					this.anInt1051 = 2;
					this.aString23 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt896 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean255 = true;
				this.anInt1020 = 0;
				this.aBoolean270 = true;
				this.aString27 = "";
				this.anInt1051 = 4;
				this.aString23 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean255 = true;
				this.anInt1020 = 0;
				this.aBoolean270 = true;
				this.aString27 = "";
				this.anInt1051 = 5;
				this.aString23 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray216[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class50.anInt815 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class50.anInt815) {
								local127 = 0;
							}
						}
						if (!Class50.aClass50Array1[local127].aBoolean228 && Class50.aClass50Array1[local127].anInt816 == local118 + (this.aBoolean250 ? 0 : 7)) {
							this.anIntArray216[local118] = local127;
							this.aBoolean237 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray257[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray25[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray25[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray257[local118] = local127;
				this.aBoolean237 = true;
			}
			if (local4 == 324 && !this.aBoolean250) {
				this.aBoolean250 = true;
				this.method717();
			}
			if (local4 == 325 && this.aBoolean250) {
				this.aBoolean250 = false;
				this.method717();
			}
			if (local4 == 326) {
				this.aClass4_Sub1_Sub3_9.method156(234);
				this.aClass4_Sub1_Sub3_9.method157(this.aBoolean250 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass4_Sub1_Sub3_9.method157(this.anIntArray216[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass4_Sub1_Sub3_9.method157(this.anIntArray257[local122]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean267 = !this.aBoolean267;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method706();
				if (this.aString24.length() > 0) {
					this.aClass4_Sub1_Sub3_9.method156(189);
					this.aClass4_Sub1_Sub3_9.method163(Class46.method550(this.aString24));
					this.aClass4_Sub1_Sub3_9.method157(local4 - 601);
					this.aClass4_Sub1_Sub3_9.method157(this.aBoolean267 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("44926, " + arg0 + ", " + 4 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method596(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt955 == 0) {
				this.aStringArray10[0] = "Cancel";
				this.anIntArray232[0] = 1761;
				this.anInt1049 = 1;
				if (this.anInt990 == -1) {
					this.method644();
					this.anInt917 = 0;
					this.anInt889 = 0;
					if (super.anInt826 > 4 && super.anInt827 > 4 && super.anInt826 < 516 && super.anInt827 < 338) {
						if (this.anInt906 == -1) {
							this.method600();
						} else {
							this.method712(super.anInt827, 0, Class27.method405(this.anInt906), 0, 4, 4, super.anInt826);
						}
					}
					if (this.anInt917 != this.anInt1041) {
						this.anInt1041 = this.anInt917;
					}
					if (this.anInt889 != this.anInt996) {
						this.anInt996 = this.anInt889;
					}
					this.anInt917 = 0;
					if (this.aByte38 == 9) {
						@Pc(136) boolean local136 = false;
					} else {
						this.aBoolean236 = !this.aBoolean236;
					}
					this.anInt889 = 0;
					if (super.anInt826 > 553 && super.anInt827 > 205 && super.anInt826 < 743 && super.anInt827 < 466) {
						if (this.anInt959 != -1) {
							this.method712(super.anInt827, 0, Class27.method405(this.anInt959), 1, 205, 553, super.anInt826);
						} else if (this.anIntArray253[this.anInt854] != -1) {
							this.method712(super.anInt827, 0, Class27.method405(this.anIntArray253[this.anInt854]), 1, 205, 553, super.anInt826);
						}
					}
					if (this.anInt917 != this.anInt938) {
						this.aBoolean251 = true;
						this.anInt938 = this.anInt917;
					}
					if (this.anInt889 != this.anInt1046) {
						this.aBoolean251 = true;
						this.anInt1046 = this.anInt889;
					}
					this.anInt917 = 0;
					this.anInt889 = 0;
					if (super.anInt826 > 17 && super.anInt827 > 357 && super.anInt826 < 496 && super.anInt827 < 453) {
						if (this.anInt935 != -1) {
							this.method712(super.anInt827, 0, Class27.method405(this.anInt935), 2, 357, 17, super.anInt826);
						} else if (this.anInt1005 != -1) {
							this.method712(super.anInt827, 0, Class27.method405(this.anInt1005), 3, 357, 17, super.anInt826);
						} else if (super.anInt827 < 434 && super.anInt826 < 426) {
							this.method700(super.anInt826 - 17, super.anInt827 - 357);
						}
					}
					if ((this.anInt935 != -1 || this.anInt1005 != -1) && this.anInt917 != this.anInt847) {
						this.aBoolean255 = true;
						this.anInt847 = this.anInt917;
					}
					if ((this.anInt935 != -1 || this.anInt1005 != -1) && this.anInt889 != this.anInt995) {
						this.aBoolean255 = true;
						this.anInt995 = this.anInt889;
					}
					@Pc(356) boolean local356 = false;
					while (!local356) {
						local356 = true;
						for (@Pc(362) int local362 = 0; local362 < this.anInt1049 - 1; local362++) {
							if (this.anIntArray232[local362] < 1000 && this.anIntArray232[local362 + 1] > 1000) {
								@Pc(383) String local383 = this.aStringArray10[local362];
								this.aStringArray10[local362] = this.aStringArray10[local362 + 1];
								this.aStringArray10[local362 + 1] = local383;
								@Pc(405) int local405 = this.anIntArray232[local362];
								this.anIntArray232[local362] = this.anIntArray232[local362 + 1];
								this.anIntArray232[local362 + 1] = local405;
								@Pc(427) int local427 = this.anIntArray230[local362];
								this.anIntArray230[local362] = this.anIntArray230[local362 + 1];
								this.anIntArray230[local362 + 1] = local427;
								@Pc(449) int local449 = this.anIntArray231[local362];
								this.anIntArray231[local362] = this.anIntArray231[local362 + 1];
								this.anIntArray231[local362 + 1] = local449;
								@Pc(471) int local471 = this.anIntArray233[local362];
								this.anIntArray233[local362] = this.anIntArray233[local362 + 1];
								this.anIntArray233[local362 + 1] = local471;
								local356 = false;
							}
						}
					}
				} else {
					this.anInt917 = 0;
					this.anInt889 = 0;
					this.method712(super.anInt827, 0, Class27.method405(this.anInt990), 0, 0, 0, super.anInt826);
					if (this.anInt917 != this.anInt1041) {
						this.anInt1041 = this.anInt917;
					}
					if (this.anInt889 != this.anInt996) {
						this.anInt996 = this.anInt889;
					}
				}
			}
		} catch (@Pc(501) RuntimeException local501) {
			signlink.reporterror("97735, " + arg0 + ", " + local501.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method598(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(25) int local25;
			@Pc(32) int local32;
			if (this.anInt900 == 0) {
				local25 = super.anInt822 / 2 - 80;
				local32 = super.anInt823 / 2 + 20;
				local32 += 20;
				if (super.anInt831 == 1 && super.anInt832 >= local25 - 75 && super.anInt832 <= local25 + 75 && super.anInt833 >= local32 - 20 && super.anInt833 <= local32 + 20) {
					this.anInt900 = 3;
					this.anInt861 = 0;
				}
				local25 = super.anInt822 / 2 + 80;
				if (super.anInt831 == 1 && super.anInt832 >= local25 - 75 && super.anInt832 <= local25 + 75 && super.anInt833 >= local32 - 20 && super.anInt833 <= local32 + 20) {
					this.aString19 = "";
					this.aString20 = "Enter your username & password.";
					this.anInt900 = 2;
					this.anInt861 = 0;
				}
			} else if (this.anInt900 == 2) {
				local25 = super.anInt823 / 2 - 40;
				local25 += 30;
				local25 += 25;
				if (super.anInt831 == 1 && super.anInt833 >= local25 - 15 && super.anInt833 < local25) {
					this.anInt861 = 0;
				}
				local25 += 15;
				if (super.anInt831 == 1 && super.anInt833 >= local25 - 15 && super.anInt833 < local25) {
					this.anInt861 = 1;
				}
				local25 += 15;
				local32 = super.anInt822 / 2 - 80;
				@Pc(178) int local178 = super.anInt823 / 2 + 50;
				@Pc(179) int local179 = local178 + 20;
				if (super.anInt831 == 1 && super.anInt832 >= local32 - 75 && super.anInt832 <= local32 + 75 && super.anInt833 >= local179 - 20 && super.anInt833 <= local179 + 20) {
					this.anInt972 = 0;
					this.method705(this.aString17, this.aString18, false);
					if (this.aBoolean272) {
						return;
					}
				}
				local32 = super.anInt822 / 2 + 80;
				if (super.anInt831 == 1 && super.anInt832 >= local32 - 75 && super.anInt832 <= local32 + 75 && super.anInt833 >= local179 - 20 && super.anInt833 <= local179 + 20) {
					this.anInt900 = 0;
					this.aString17 = "";
					this.aString18 = "";
				}
				while (true) {
					while (true) {
						@Pc(269) int local269 = this.method577();
						if (local269 == -1) {
							return;
						}
						@Pc(274) boolean local274 = false;
						for (@Pc(276) int local276 = 0; local276 < aString21.length(); local276++) {
							if (local269 == aString21.charAt(local276)) {
								local274 = true;
								break;
							}
						}
						if (this.anInt861 == 0) {
							if (local269 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							if (local269 == 9 || local269 == 10 || local269 == 13) {
								this.anInt861 = 1;
							}
							if (local274) {
								this.aString17 = this.aString17 + (char) local269;
							}
							if (this.aString17.length() > 12) {
								this.aString17 = this.aString17.substring(0, 12);
							}
						} else if (this.anInt861 == 1) {
							if (local269 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							if (local269 == 9 || local269 == 10 || local269 == 13) {
								this.anInt861 = 0;
							}
							if (local274) {
								this.aString18 = this.aString18 + (char) local269;
							}
							if (this.aString18.length() > 20) {
								this.aString18 = this.aString18.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt900 == 3) {
				local25 = super.anInt822 / 2;
				local32 = super.anInt823 / 2 + 50;
				@Pc(433) int local433 = local32 + 20;
				if (super.anInt831 == 1 && super.anInt832 >= local25 - 75 && super.anInt832 <= local25 + 75 && super.anInt833 >= local433 - 20 && super.anInt833 <= local433 + 20) {
					this.anInt900 = 0;
					return;
				}
			}
		} catch (@Pc(466) RuntimeException local466) {
			signlink.reporterror("55855, " + arg0 + ", " + local466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method599() {
		try {
			this.aClass47_15.method556();
			Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray272;
			this.aClass4_Sub1_Sub2_Sub1_6.method86(0, 0);
			if (this.anInt959 != -1) {
				this.method697(0, 0, 0, Class27.method405(this.anInt959));
			} else if (this.anIntArray253[this.anInt854] != -1) {
				this.method697(0, 0, 0, Class27.method405(this.anIntArray253[this.anInt854]));
			}
			if (this.aBoolean271 && this.anInt1000 == 1) {
				this.method612();
			}
			this.aClass47_15.method557(553, 205, super.aGraphics2);
			this.aClass47_17.method556();
			Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("58634, " + 5 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method600() {
		try {
			if (this.anInt885 == 0 && this.anInt991 == 0) {
				this.aStringArray10[this.anInt1049] = "Walk here";
				this.anIntArray232[this.anInt1049] = 506;
				this.anIntArray230[this.anInt1049] = super.anInt826;
				this.anIntArray231[this.anInt1049] = super.anInt827;
				this.anInt1049++;
			}
			@Pc(41) int local41 = -1;
			this.anInt892 += 0;
			for (@Pc(49) int local49 = 0; local49 < Class4_Sub1_Sub1_Sub3.anInt387; local49++) {
				@Pc(55) int local55 = Class4_Sub1_Sub1_Sub3.anIntArray89[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(224) int local224;
					if (local71 == 2 && this.aClass25_1.method372(this.anInt965, local59, local65, local55) >= 0) {
						@Pc(97) Class20 local97 = Class20.method236(local77);
						if (local97.anIntArray42 != null) {
							local97 = local97.method239();
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt885 == 1) {
							this.aStringArray10[this.anInt1049] = "Use " + this.aString25 + " with @cya@" + local97.aString8;
							this.anIntArray232[this.anInt1049] = 688;
							this.anIntArray233[this.anInt1049] = local55;
							this.anIntArray230[this.anInt1049] = local59;
							this.anIntArray231[this.anInt1049] = local65;
							this.anInt1049++;
						} else if (this.anInt991 != 1) {
							if (local97.aStringArray3 != null) {
								for (local224 = 4; local224 >= 0; local224--) {
									if (local97.aStringArray3[local224] != null) {
										this.aStringArray10[this.anInt1049] = local97.aStringArray3[local224] + " @cya@" + local97.aString8;
										if (local224 == 0) {
											this.anIntArray232[this.anInt1049] = 941;
										}
										if (local224 == 1) {
											this.anIntArray232[this.anInt1049] = 559;
										}
										if (local224 == 2) {
											this.anIntArray232[this.anInt1049] = 535;
										}
										if (local224 == 3) {
											this.anIntArray232[this.anInt1049] = 705;
										}
										if (local224 == 4) {
											this.anIntArray232[this.anInt1049] = 1258;
										}
										this.anIntArray233[this.anInt1049] = local55;
										this.anIntArray230[this.anInt1049] = local59;
										this.anIntArray231[this.anInt1049] = local65;
										this.anInt1049++;
									}
								}
							}
							this.aStringArray10[this.anInt1049] = "Examine @cya@" + local97.aString8;
							this.anIntArray232[this.anInt1049] = 1225;
							this.anIntArray233[this.anInt1049] = local97.anInt304 << 14;
							this.anIntArray230[this.anInt1049] = local59;
							this.anIntArray231[this.anInt1049] = local65;
							this.anInt1049++;
						} else if ((this.anInt993 & 0x4) == 4) {
							this.aStringArray10[this.anInt1049] = this.aString29 + " @cya@" + local97.aString8;
							this.anIntArray232[this.anInt1049] = 355;
							this.anIntArray233[this.anInt1049] = local55;
							this.anIntArray230[this.anInt1049] = local59;
							this.anIntArray231[this.anInt1049] = local65;
							this.anInt1049++;
						}
					}
					@Pc(404) Class4_Sub1_Sub1_Sub1_Sub1 local404;
					@Pc(452) Class4_Sub1_Sub1_Sub1_Sub2 local452;
					@Pc(442) int local442;
					if (local71 == 1) {
						@Pc(375) Class4_Sub1_Sub1_Sub1_Sub1 local375 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local77];
						if (local375.aClass2_1.aByte1 == 1 && (local375.anInt648 & 0x7F) == 64 && (local375.anInt649 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt1009; local224++) {
								local404 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray262[local224]];
								if (local404 != null && local404 != local375 && local404.aClass2_1.aByte1 == 1 && local404.anInt648 == local375.anInt648 && local404.anInt649 == local375.anInt649) {
									this.method703(this.anIntArray262[local224], local404.aClass2_1, local59, local65);
								}
							}
							for (local442 = 0; local442 < this.anInt909; local442++) {
								local452 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray228[local442]];
								if (local452 != null && local452.anInt648 == local375.anInt648 && local452.anInt649 == local375.anInt649) {
									this.method593(local65, local452, local59, this.anIntArray228[local442]);
								}
							}
						}
						this.method703(local77, local375.aClass2_1, local59, local65);
					}
					if (local71 == 0) {
						@Pc(494) Class4_Sub1_Sub1_Sub1_Sub2 local494 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local77];
						if ((local494.anInt648 & 0x7F) == 64 && (local494.anInt649 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt1009; local224++) {
								local404 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray262[local224]];
								if (local404 != null && local404.aClass2_1.aByte1 == 1 && local404.anInt648 == local494.anInt648 && local404.anInt649 == local494.anInt649) {
									this.method703(this.anIntArray262[local224], local404.aClass2_1, local59, local65);
								}
							}
							for (local442 = 0; local442 < this.anInt909; local442++) {
								local452 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray228[local442]];
								if (local452 != null && local452 != local494 && local452.anInt648 == local494.anInt648 && local452.anInt649 == local494.anInt649) {
									this.method593(local65, local452, local59, this.anIntArray228[local442]);
								}
							}
						}
						this.method593(local65, local494, local59, local77);
					}
					if (local71 == 3) {
						@Pc(613) Class23 local613 = this.aClass23ArrayArrayArray1[this.anInt965][local59][local65];
						if (local613 != null) {
							for (@Pc(620) Class4_Sub1_Sub1_Sub4 local620 = (Class4_Sub1_Sub1_Sub4) local613.method316(); local620 != null; local620 = (Class4_Sub1_Sub1_Sub4) local613.method318()) {
								@Pc(626) Class44 local626 = Class44.method536(local620.anInt391);
								if (this.anInt885 == 1) {
									this.aStringArray10[this.anInt1049] = "Use " + this.aString25 + " with @lre@" + local626.aString16;
									this.anIntArray232[this.anInt1049] = 819;
									this.anIntArray233[this.anInt1049] = local620.anInt391;
									this.anIntArray230[this.anInt1049] = local59;
									this.anIntArray231[this.anInt1049] = local65;
									this.anInt1049++;
								} else if (this.anInt991 != 1) {
									for (@Pc(743) int local743 = 4; local743 >= 0; local743--) {
										if (local626.aStringArray7 != null && local626.aStringArray7[local743] != null) {
											this.aStringArray10[this.anInt1049] = local626.aStringArray7[local743] + " @lre@" + local626.aString16;
											if (local743 == 0) {
												this.anIntArray232[this.anInt1049] = 100;
											}
											if (local743 == 1) {
												this.anIntArray232[this.anInt1049] = 485;
											}
											if (local743 == 2) {
												this.anIntArray232[this.anInt1049] = 613;
											}
											if (local743 == 3) {
												this.anIntArray232[this.anInt1049] = 583;
											}
											if (local743 == 4) {
												this.anIntArray232[this.anInt1049] = 46;
											}
											this.anIntArray233[this.anInt1049] = local620.anInt391;
											this.anIntArray230[this.anInt1049] = local59;
											this.anIntArray231[this.anInt1049] = local65;
											this.anInt1049++;
										} else if (local743 == 2) {
											this.aStringArray10[this.anInt1049] = "Take @lre@" + local626.aString16;
											this.anIntArray232[this.anInt1049] = 613;
											this.anIntArray233[this.anInt1049] = local620.anInt391;
											this.anIntArray230[this.anInt1049] = local59;
											this.anIntArray231[this.anInt1049] = local65;
											this.anInt1049++;
										}
									}
									this.aStringArray10[this.anInt1049] = "Examine @lre@" + local626.aString16;
									this.anIntArray232[this.anInt1049] = 1583;
									this.anIntArray233[this.anInt1049] = local620.anInt391;
									this.anIntArray230[this.anInt1049] = local59;
									this.anIntArray231[this.anInt1049] = local65;
									this.anInt1049++;
								} else if ((this.anInt993 & 0x1) == 1) {
									this.aStringArray10[this.anInt1049] = this.aString29 + " @lre@" + local626.aString16;
									this.anIntArray232[this.anInt1049] = 302;
									this.anIntArray233[this.anInt1049] = local620.anInt391;
									this.anIntArray230[this.anInt1049] = local59;
									this.anIntArray231[this.anInt1049] = local65;
									this.anInt1049++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("97363, " + 0 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass4_Sub1_Sub2_Sub1_1.method86(arg3, arg4);
			this.aClass4_Sub1_Sub2_Sub1_2.method86(arg3 + arg0 - 16, arg4);
			Class4_Sub1_Sub2.method487(arg3 + 16, 16, arg0 - 32, arg4, this.anInt875);
			@Pc(35) int local35 = (arg0 - 32) * arg0 / arg1;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg0 - local35 - 32) * arg2 / (arg1 - arg0);
			Class4_Sub1_Sub2.method487(arg3 + local52 + 16, 16, local35, arg4, this.anInt946);
			Class4_Sub1_Sub2.method492(arg3 + local52 + 16, arg4, this.anInt852, local35);
			Class4_Sub1_Sub2.method492(arg3 + local52 + 16, arg4 + 1, this.anInt852, local35);
			Class4_Sub1_Sub2.method490(arg3 + local52 + 16, arg4, 16, this.anInt852);
			Class4_Sub1_Sub2.method490(arg3 + local52 + 17, arg4, 16, this.anInt852);
			Class4_Sub1_Sub2.method492(arg3 + local52 + 16, arg4 + 15, this.anInt926, local35);
			Class4_Sub1_Sub2.method492(arg3 + local52 + 17, arg4 + 14, this.anInt926, local35 - 1);
			Class4_Sub1_Sub2.method490(arg3 + local52 + local35 + 15, arg4, 16, this.anInt926);
			Class4_Sub1_Sub2.method490(arg3 + local52 + local35 + 14, arg4 + 1, 15, this.anInt926);
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("25246, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/net/Socket;")
	public Socket method602(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method603(@OriginalArg(0) byte arg0) {
		try {
			this.anInt1025 = 0;
			@Pc(10) int local10 = (aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 >> 7) + this.anInt1036;
			@Pc(18) int local18 = (aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 >> 7) + this.anInt1037;
			if (arg0 != 8) {
				anInt912 = -253;
			}
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt1025 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt1025 = 1;
			}
			if (this.anInt1025 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt1025 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("17596, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Z")
	private boolean method604() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("64765, " + -775 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method605() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt909; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt908;
				} else {
					local11 = this.anIntArray228[local3];
				}
				@Pc(23) Class4_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method615(1, local23);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("56647, " + -104 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method584(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method584(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!LORGYGVM;IIIIIIB)V")
	private void method606(@OriginalArg(0) int arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (this.aBoolean262) {
				this.anInt918 = 32;
			} else {
				this.anInt918 = 0;
			}
			this.aBoolean262 = false;
			if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg2 && arg5 < arg2 + 16) {
				arg1.anInt461 -= this.anInt1021 * 4;
				if (arg4 == 1) {
					this.aBoolean251 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
			} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg2 + arg0 - 16 && arg5 < arg2 + arg0) {
				arg1.anInt461 += this.anInt1021 * 4;
				if (arg4 == 1) {
					this.aBoolean251 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
			} else if (arg6 >= arg7 - this.anInt918 && arg6 < arg7 + this.anInt918 + 16 && arg5 >= arg2 + 16 && arg5 < arg2 + arg0 - 16 && this.anInt1021 > 0) {
				@Pc(144) int local144 = (arg0 - 32) * arg0 / arg3;
				if (local144 < 8) {
					local144 = 8;
				}
				@Pc(159) int local159 = arg5 - arg2 - local144 / 2 - 16;
				@Pc(165) int local165 = arg0 - local144 - 32;
				arg1.anInt461 = (arg3 - arg0) * local159 / local165;
				if (arg4 == 1) {
					this.aBoolean251 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
				this.aBoolean262 = true;
			}
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("48644, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 125 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method607(@OriginalArg(0) int arg0) {
		try {
			Class27.method401(arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("91559, " + arg0 + ", " + -104 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method608() {
		try {
			if (super.aClass47_2 == null) {
				this.method720(this.aByte33);
				this.aClass47_19 = null;
				this.aClass47_20 = null;
				this.aClass47_21 = null;
				this.aClass47_22 = null;
				this.aClass47_23 = null;
				this.aClass47_24 = null;
				this.aClass47_25 = null;
				this.aClass47_26 = null;
				this.aClass47_27 = null;
				this.aClass47_18 = null;
				this.aClass47_16 = null;
				this.aClass47_15 = null;
				this.aClass47_17 = null;
				this.aClass47_12 = null;
				this.aClass47_13 = null;
				this.aClass47_14 = null;
				super.aClass47_2 = new Class47(this.method583(anInt1042), true, 765, 503);
				this.aBoolean242 = true;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("21161, " + -504 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/lang/String;")
	private String method609() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("33861, " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method610() {
		try {
			if (this.anInt955 == 0) {
				@Pc(6) int local6 = super.anInt831;
				if (this.anInt991 == 1 && super.anInt832 >= 516 && super.anInt833 >= 160 && super.anInt832 <= 765 && super.anInt833 <= 205) {
					local6 = 0;
				}
				@Pc(40) int local40;
				@Pc(43) int local43;
				@Pc(119) int local119;
				if (this.aBoolean271) {
					if (local6 != 1) {
						local40 = super.anInt826;
						local43 = super.anInt827;
						if (this.anInt1000 == 0) {
							local40 -= 4;
							local43 -= 4;
						}
						if (this.anInt1000 == 1) {
							local40 -= 553;
							local43 -= 205;
						}
						if (this.anInt1000 == 2) {
							local40 -= 17;
							local43 -= 357;
						}
						if (local40 < this.anInt1001 - 10 || local40 > this.anInt1001 + this.anInt1003 + 10 || local43 < this.anInt1002 - 10 || local43 > this.anInt1002 + this.anInt1004 + 10) {
							this.aBoolean271 = false;
							if (this.anInt1000 == 1) {
								this.aBoolean251 = true;
							}
							if (this.anInt1000 == 2) {
								this.aBoolean255 = true;
							}
						}
					}
					if (local6 == 1) {
						local40 = this.anInt1001;
						local43 = this.anInt1002;
						local119 = this.anInt1003;
						@Pc(122) int local122 = super.anInt832;
						@Pc(125) int local125 = super.anInt833;
						if (this.anInt1000 == 0) {
							local122 -= 4;
							local125 -= 4;
						}
						if (this.anInt1000 == 1) {
							local122 -= 553;
							local125 -= 205;
						}
						if (this.anInt1000 == 2) {
							local122 -= 17;
							local125 -= 357;
						}
						@Pc(144) int local144 = -1;
						for (@Pc(146) int local146 = 0; local146 < this.anInt1049; local146++) {
							@Pc(161) int local161 = local43 + (this.anInt1049 - 1 - local146) * 15 + 31;
							if (local122 > local40 && local122 < local40 + local119 && local125 > local161 - 13 && local125 < local161 + 3) {
								local144 = local146;
							}
						}
						if (local144 != -1) {
							this.method664(local144);
						}
						this.aBoolean271 = false;
						if (this.anInt1000 == 1) {
							this.aBoolean251 = true;
						}
						if (this.anInt1000 == 2) {
							this.aBoolean255 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt1049 > 0) {
						local40 = this.anIntArray232[this.anInt1049 - 1];
						if (local40 == 285 || local40 == 881 || local40 == 875 || local40 == 397 || local40 == 233 || local40 == 963 || local40 == 984 || local40 == 816 || local40 == 800 || local40 == 866 || local40 == 219 || local40 == 1948) {
							local43 = this.anIntArray230[this.anInt1049 - 1];
							local119 = this.anIntArray231[this.anInt1049 - 1];
							@Pc(280) Class27 local280 = Class27.method405(local119);
							if (local280.aBoolean145 || local280.aBoolean142) {
								this.aBoolean269 = false;
								this.anInt1048 = 0;
								this.anInt953 = local119;
								this.anInt954 = local43;
								this.anInt955 = 2;
								this.anInt956 = super.anInt832;
								this.anInt957 = super.anInt833;
								if (Class27.method405(local119).anInt476 == this.anInt906) {
									this.anInt955 = 1;
								}
								if (Class27.method405(local119).anInt476 == this.anInt935) {
									this.anInt955 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt902 == 1 || this.method631(this.anInt1049 - 1)) && this.anInt1049 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt1049 > 0) {
						this.method664(this.anInt1049 - 1);
					}
					if (local6 != 2 || this.anInt1049 <= 0) {
						return;
					}
					this.method701();
				}
			}
		} catch (@Pc(373) RuntimeException local373) {
			signlink.reporterror("42055, " + -599 + ", " + local373.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZI)V")
	private void method611(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (this.aBoolean268) {
				signlink.anInt1072 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("44120, " + arg0 + ", " + arg1 + ", " + -38594 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method612() {
		try {
			@Pc(2) int local2 = this.anInt1001;
			@Pc(5) int local5 = this.anInt1002;
			@Pc(8) int local8 = this.anInt1003;
			@Pc(11) int local11 = this.anInt1004;
			Class4_Sub1_Sub2.method487(local5, local8, local11, local2, 6116423);
			Class4_Sub1_Sub2.method487(local5 + 1, local8 - 2, 16, local2 + 1, 0);
			Class4_Sub1_Sub2.method488(local8 - 2, local11 - 19, this.anInt914, 0, local2 + 1, local5 + 18);
			this.aClass4_Sub1_Sub2_Sub4_4.method499(local5 + 14, "Choose Option", local2 + 3, 6116423);
			this.anInt892 += 0;
			@Pc(70) int local70 = super.anInt826;
			@Pc(73) int local73 = super.anInt827;
			if (this.anInt1000 == 0) {
				local70 -= 4;
				local73 -= 4;
			}
			if (this.anInt1000 == 1) {
				local70 -= 553;
				local73 -= 205;
			}
			if (this.anInt1000 == 2) {
				local70 -= 17;
				local73 -= 357;
			}
			for (@Pc(92) int local92 = 0; local92 < this.anInt1049; local92++) {
				@Pc(107) int local107 = local5 + (this.anInt1049 - 1 - local92) * 15 + 31;
				@Pc(109) int local109 = 16777215;
				if (local70 > local2 && local70 < local2 + local8 && local73 > local107 - 13 && local73 < local107 + 3) {
					local109 = 16776960;
				}
				this.aClass4_Sub1_Sub2_Sub4_4.method503(this.aStringArray10[local92], local109, local107, local2 + 3, true);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("49366, " + 0 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method613() {
		try {
			Class20.aClass1_3.method3();
			Class20.aClass1_2.method3();
			Class2.aClass1_1.method3();
			Class44.aClass1_9.method3();
			Class44.aClass1_8.method3();
			Class4_Sub1_Sub1_Sub1_Sub2.aClass1_6.method3();
			Class42.aClass1_7.method3();
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("19933, " + 17519 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method614() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt1009; local6++) {
				@Pc(13) int local13 = this.anIntArray262[local6];
				@Pc(18) Class4_Sub1_Sub1_Sub1_Sub1 local18 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local13];
				if (local18 != null) {
					this.method615(local18.aClass2_1.aByte1, local18);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("78922, " + -36 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!ZOMFWUWL;)V")
	private void method615(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt648 < 128 || arg1.anInt649 < 128 || arg1.anInt648 >= 13184 || arg1.anInt649 >= 13184) {
				arg1.anInt626 = -1;
				arg1.anInt669 = -1;
				arg1.anInt655 = 0;
				arg1.anInt656 = 0;
				arg1.anInt648 = arg1.anIntArray156[0] * 128 + arg1.anInt644 * 64;
				arg1.anInt649 = arg1.anIntArray157[0] * 128 + arg1.anInt644 * 64;
				arg1.method471();
			}
			if (arg1 == aClass4_Sub1_Sub1_Sub1_Sub2_1 && (arg1.anInt648 < 1536 || arg1.anInt649 < 1536 || arg1.anInt648 >= 11776 || arg1.anInt649 >= 11776)) {
				arg1.anInt626 = -1;
				arg1.anInt669 = -1;
				arg1.anInt655 = 0;
				arg1.anInt656 = 0;
				arg1.anInt648 = arg1.anIntArray156[0] * 128 + arg1.anInt644 * 64;
				arg1.anInt649 = arg1.anIntArray157[0] * 128 + arg1.anInt644 * 64;
				arg1.method471();
			}
			if (arg1.anInt655 > anInt866) {
				this.method616(arg1);
			} else if (arg1.anInt656 >= anInt866) {
				this.method617(arg1);
			} else {
				this.method618(arg1);
			}
			this.method619(arg1);
			this.method620(arg1, (byte) 5);
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("18382, " + arg0 + ", " + false + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZOMFWUWL;I)V")
	private void method616(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt655 - anInt866;
			@Pc(14) int local14 = arg0.anInt651 * 128 + arg0.anInt644 * 64;
			@Pc(24) int local24 = arg0.anInt653 * 128 + arg0.anInt644 * 64;
			arg0.anInt648 += (local14 - arg0.anInt648) / local4;
			arg0.anInt649 += (local24 - arg0.anInt649) / local4;
			arg0.anInt640 = 0;
			if (arg0.anInt657 == 0) {
				arg0.anInt647 = 1024;
			}
			if (arg0.anInt657 == 1) {
				arg0.anInt647 = 1536;
			}
			if (arg0.anInt657 == 2) {
				arg0.anInt647 = 0;
			}
			if (arg0.anInt657 == 3) {
				arg0.anInt647 = 512;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("87743, " + arg0 + ", " + 0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ZOMFWUWL;I)V")
	private void method617(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt656 == anInt866 || arg0.anInt626 == -1 || arg0.anInt629 != 0 || arg0.anInt628 + 1 > Class5.aClass5Array1[arg0.anInt626].method32(arg0.anInt627)) {
				@Pc(32) int local32 = arg0.anInt656 - arg0.anInt655;
				@Pc(37) int local37 = anInt866 - arg0.anInt655;
				@Pc(47) int local47 = arg0.anInt651 * 128 + arg0.anInt644 * 64;
				@Pc(57) int local57 = arg0.anInt653 * 128 + arg0.anInt644 * 64;
				@Pc(67) int local67 = arg0.anInt652 * 128 + arg0.anInt644 * 64;
				@Pc(77) int local77 = arg0.anInt654 * 128 + arg0.anInt644 * 64;
				arg0.anInt648 = (local47 * (local32 - local37) + local67 * local37) / local32;
				arg0.anInt649 = (local57 * (local32 - local37) + local77 * local37) / local32;
			}
			arg0.anInt640 = 0;
			if (arg0.anInt657 == 0) {
				arg0.anInt647 = 1024;
			}
			if (arg0.anInt657 == 1) {
				arg0.anInt647 = 1536;
			}
			if (arg0.anInt657 == 2) {
				arg0.anInt647 = 0;
			}
			if (arg0.anInt657 == 3) {
				arg0.anInt647 = 512;
			}
			arg0.anInt650 = arg0.anInt647;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("10486, " + arg0 + ", " + 0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZOMFWUWL;B)V")
	private void method618(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt664 = arg0.anInt645;
			if (arg0.anInt631 == 0) {
				arg0.anInt640 = 0;
			} else {
				if (arg0.anInt626 != -1 && arg0.anInt629 == 0) {
					@Pc(24) Class5 local24 = Class5.aClass5Array1[arg0.anInt626];
					if (arg0.anInt625 > 0 && local24.anInt45 == 0) {
						arg0.anInt640++;
						return;
					}
					if (arg0.anInt625 <= 0 && local24.anInt46 == 0) {
						arg0.anInt640++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt648;
				@Pc(56) int local56 = arg0.anInt649;
				@Pc(71) int local71 = arg0.anIntArray156[arg0.anInt631 - 1] * 128 + arg0.anInt644 * 64;
				@Pc(86) int local86 = arg0.anIntArray157[arg0.anInt631 - 1] * 128 + arg0.anInt644 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt647 = 1280;
						} else if (local56 > local86) {
							arg0.anInt647 = 1792;
						} else {
							arg0.anInt647 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt647 = 768;
						} else if (local56 > local86) {
							arg0.anInt647 = 256;
						} else {
							arg0.anInt647 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt647 = 1024;
					} else {
						arg0.anInt647 = 0;
					}
					@Pc(180) int local180 = arg0.anInt647 - arg0.anInt650 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt633;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt632;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt635;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt634;
					}
					if (local187 == -1) {
						local187 = arg0.anInt632;
					}
					arg0.anInt664 = local187;
					if (this.aByte32 == 2) {
						@Pc(234) int local234 = 4;
						if (arg0.anInt650 != arg0.anInt647 && arg0.anInt658 == -1 && arg0.anInt643 != 0) {
							local234 = 2;
						}
						if (arg0.anInt631 > 2) {
							local234 = 6;
						}
						if (arg0.anInt631 > 3) {
							local234 = 8;
						}
						if (arg0.anInt640 > 0 && arg0.anInt631 > 1) {
							local234 = 8;
							arg0.anInt640--;
						}
						if (arg0.aBooleanArray10[arg0.anInt631 - 1]) {
							local234 <<= 0x1;
						}
						if (local234 >= 8 && arg0.anInt664 == arg0.anInt632 && arg0.anInt659 != -1) {
							arg0.anInt664 = arg0.anInt659;
						}
						if (local53 < local71) {
							arg0.anInt648 += local234;
							if (arg0.anInt648 > local71) {
								arg0.anInt648 = local71;
							}
						} else if (local53 > local71) {
							arg0.anInt648 -= local234;
							if (arg0.anInt648 < local71) {
								arg0.anInt648 = local71;
							}
						}
						if (local56 < local86) {
							arg0.anInt649 += local234;
							if (arg0.anInt649 > local86) {
								arg0.anInt649 = local86;
							}
						} else if (local56 > local86) {
							arg0.anInt649 -= local234;
							if (arg0.anInt649 < local86) {
								arg0.anInt649 = local86;
							}
						}
						if (arg0.anInt648 == local71 && arg0.anInt649 == local86) {
							arg0.anInt631--;
							if (arg0.anInt625 > 0) {
								arg0.anInt625--;
								return;
							}
						}
					}
				} else {
					arg0.anInt648 = local71;
					arg0.anInt649 = local86;
				}
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("58633, " + arg0 + ", " + 2 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZOMFWUWL;Z)V")
	private void method619(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt643 != 0) {
				@Pc(36) int local36;
				@Pc(42) int local42;
				if (arg0.anInt658 != -1 && arg0.anInt658 < 32768) {
					@Pc(28) Class4_Sub1_Sub1_Sub1_Sub1 local28 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt658];
					if (local28 != null) {
						local36 = arg0.anInt648 - local28.anInt648;
						local42 = arg0.anInt649 - local28.anInt649;
						if (local36 != 0 || local42 != 0) {
							arg0.anInt647 = (int) (Math.atan2((double) local36, (double) local42) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(67) int local67;
				if (arg0.anInt658 >= 32768) {
					local67 = arg0.anInt658 - 32768;
					if (local67 == this.anInt971) {
						local67 = this.anInt908;
					}
					@Pc(79) Class4_Sub1_Sub1_Sub1_Sub2 local79 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local67];
					if (local79 != null) {
						local42 = arg0.anInt648 - local79.anInt648;
						@Pc(93) int local93 = arg0.anInt649 - local79.anInt649;
						if (local42 != 0 || local93 != 0) {
							arg0.anInt647 = (int) (Math.atan2((double) local42, (double) local93) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt660 != 0 || arg0.anInt661 != 0) && (arg0.anInt631 == 0 || arg0.anInt640 > 0)) {
					local67 = arg0.anInt648 - (arg0.anInt660 - this.anInt1036 - this.anInt1036) * 64;
					local36 = arg0.anInt649 - (arg0.anInt661 - this.anInt1037 - this.anInt1037) * 64;
					if (local67 != 0 || local36 != 0) {
						arg0.anInt647 = (int) (Math.atan2((double) local67, (double) local36) * 325.949D) & 0x7FF;
					}
					arg0.anInt660 = 0;
					arg0.anInt661 = 0;
				}
				local67 = arg0.anInt647 - arg0.anInt650 & 0x7FF;
				if (local67 != 0) {
					if (local67 < arg0.anInt643 || local67 > 2048 - arg0.anInt643) {
						arg0.anInt650 = arg0.anInt647;
					} else if (local67 > 1024) {
						arg0.anInt650 -= arg0.anInt643;
					} else {
						arg0.anInt650 += arg0.anInt643;
					}
					arg0.anInt650 &= 0x7FF;
					if (arg0.anInt664 == arg0.anInt645 && arg0.anInt650 != arg0.anInt647) {
						if (arg0.anInt646 != -1) {
							arg0.anInt664 = arg0.anInt646;
							return;
						}
						arg0.anInt664 = arg0.anInt632;
						return;
					}
				}
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("30050, " + arg0 + ", " + true + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ZOMFWUWL;B)V")
	private void method620(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			arg0.aBoolean173 = false;
			@Pc(21) Class5 local21;
			if (arg0.anInt664 != -1) {
				local21 = Class5.aClass5Array1[arg0.anInt664];
				arg0.anInt666++;
				if (arg0.anInt665 < local21.anInt39 && arg0.anInt666 > local21.method32(arg0.anInt665)) {
					arg0.anInt666 = 0;
					arg0.anInt665++;
				}
				if (arg0.anInt665 >= local21.anInt39) {
					arg0.anInt666 = 0;
					arg0.anInt665 = 0;
				}
			}
			if (arg0.anInt669 != -1 && anInt866 >= arg0.anInt672) {
				if (arg0.anInt670 < 0) {
					arg0.anInt670 = 0;
				}
				local21 = Class42.aClass42Array1[arg0.anInt669].aClass5_1;
				arg0.anInt671++;
				while (arg0.anInt670 < local21.anInt39 && arg0.anInt671 > local21.method32(arg0.anInt670)) {
					arg0.anInt671 -= local21.method32(arg0.anInt670);
					arg0.anInt670++;
				}
				if (arg0.anInt670 >= local21.anInt39 && (arg0.anInt670 < 0 || arg0.anInt670 >= local21.anInt39)) {
					arg0.anInt669 = -1;
				}
			}
			if (arg0.anInt626 != -1 && arg0.anInt629 <= 1) {
				local21 = Class5.aClass5Array1[arg0.anInt626];
				if (local21.anInt45 == 1 && arg0.anInt625 > 0 && arg0.anInt655 <= anInt866 && arg0.anInt656 < anInt866) {
					arg0.anInt629 = 1;
					return;
				}
			}
			if (arg0.anInt626 != -1 && arg0.anInt629 == 0) {
				local21 = Class5.aClass5Array1[arg0.anInt626];
				arg0.anInt628++;
				while (arg0.anInt627 < local21.anInt39 && arg0.anInt628 > local21.method32(arg0.anInt627)) {
					arg0.anInt628 -= local21.method32(arg0.anInt627);
					arg0.anInt627++;
				}
				if (arg0.anInt627 >= local21.anInt39) {
					arg0.anInt627 -= local21.anInt40;
					arg0.anInt630++;
					if (arg0.anInt630 >= local21.anInt44) {
						arg0.anInt626 = -1;
					}
					if (arg0.anInt627 < 0 || arg0.anInt627 >= local21.anInt39) {
						arg0.anInt626 = -1;
					}
				}
				arg0.aBoolean173 = local21.aBoolean15;
			}
			if (arg0.anInt629 > 0) {
				arg0.anInt629--;
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("6360, " + arg0 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method621() {
		try {
			this.aBoolean272 &= true;
			if (this.anInt990 == -1 || this.anInt874 != 2 && super.aClass47_2 == null) {
				if (this.aBoolean242) {
					this.method627(this.anInt964);
					this.aBoolean242 = false;
					this.aClass47_3.method557(0, 4, super.aGraphics2);
					this.aClass47_4.method557(0, 357, super.aGraphics2);
					this.aClass47_5.method557(722, 4, super.aGraphics2);
					this.aClass47_6.method557(743, 205, super.aGraphics2);
					this.aClass47_7.method557(0, 0, super.aGraphics2);
					this.aClass47_8.method557(516, 4, super.aGraphics2);
					this.aClass47_9.method557(516, 205, super.aGraphics2);
					this.aClass47_10.method557(496, 357, super.aGraphics2);
					this.aClass47_11.method557(0, 338, super.aGraphics2);
					this.aBoolean251 = true;
					this.aBoolean255 = true;
					this.aBoolean244 = true;
					this.aBoolean273 = true;
					if (this.anInt874 != 2) {
						this.aClass47_17.method557(4, 4, super.aGraphics2);
						this.aClass47_16.method557(550, 4, super.aGraphics2);
					}
				}
				if (this.anInt874 == 2) {
					this.method663();
				}
				if (this.aBoolean271 && this.anInt1000 == 1) {
					this.aBoolean251 = true;
				}
				@Pc(284) boolean local284;
				if (this.anInt959 != -1) {
					local284 = this.method661(this.anInt849, this.anInt959);
					if (local284) {
						this.aBoolean251 = true;
					}
				}
				if (this.anInt924 == 2) {
					this.aBoolean251 = true;
				}
				if (this.anInt955 == 2) {
					this.aBoolean251 = true;
				}
				if (this.aBoolean251) {
					this.method599();
					this.aBoolean251 = false;
				}
				if (this.anInt935 == -1) {
					this.aClass27_1.anInt461 = this.anInt1006 - this.anInt960 - 77;
					if (super.anInt826 > 448 && super.anInt826 < 560 && super.anInt827 > 332) {
						this.method606(77, this.aClass27_1, 0, this.anInt1006, -1, super.anInt827 - 357, super.anInt826 - 17, 463);
					}
					@Pc(366) int local366 = this.anInt1006 - this.aClass27_1.anInt461 - 77;
					if (local366 < 0) {
						local366 = 0;
					}
					if (local366 > this.anInt1006 - 77) {
						local366 = this.anInt1006 - 77;
					}
					if (this.anInt960 != local366) {
						this.anInt960 = local366;
						this.aBoolean255 = true;
					}
				}
				if (this.anInt935 != -1) {
					local284 = this.method661(this.anInt849, this.anInt935);
					if (local284) {
						this.aBoolean255 = true;
					}
				}
				if (this.anInt924 == 3) {
					this.aBoolean255 = true;
				}
				if (this.anInt955 == 3) {
					this.aBoolean255 = true;
				}
				if (this.aString30 != null) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean271 && this.anInt1000 == 2) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean255) {
					this.method718(this.aByte35);
					this.aBoolean255 = false;
				}
				if (this.anInt874 == 2) {
					this.method714();
					this.aClass47_16.method557(550, 4, super.aGraphics2);
				}
				if (this.anInt870 != -1) {
					this.aBoolean244 = true;
				}
				if (this.aBoolean244) {
					if (this.anInt870 != -1 && this.anInt870 == this.anInt854) {
						this.anInt870 = -1;
						this.aClass4_Sub1_Sub3_9.method156(125);
						this.aClass4_Sub1_Sub3_9.method157(this.anInt854);
					}
					this.aBoolean244 = false;
					this.aClass47_14.method556();
					this.aClass4_Sub1_Sub2_Sub1_5.method86(0, 0);
					if (this.anInt959 == -1) {
						if (this.anIntArray253[this.anInt854] != -1) {
							if (this.anInt854 == 0) {
								this.aClass4_Sub1_Sub2_Sub1_9.method86(10, 22);
							}
							if (this.anInt854 == 1) {
								this.aClass4_Sub1_Sub2_Sub1_10.method86(8, 54);
							}
							if (this.anInt854 == 2) {
								this.aClass4_Sub1_Sub2_Sub1_10.method86(8, 82);
							}
							if (this.anInt854 == 3) {
								this.aClass4_Sub1_Sub2_Sub1_11.method86(8, 110);
							}
							if (this.anInt854 == 4) {
								this.aClass4_Sub1_Sub2_Sub1_13.method86(8, 153);
							}
							if (this.anInt854 == 5) {
								this.aClass4_Sub1_Sub2_Sub1_13.method86(8, 181);
							}
							if (this.anInt854 == 6) {
								this.aClass4_Sub1_Sub2_Sub1_12.method86(9, 209);
							}
						}
						if (this.anIntArray253[0] != -1 && (this.anInt870 != 0 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[0].method86(13, 29);
						}
						if (this.anIntArray253[1] != -1 && (this.anInt870 != 1 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[1].method86(11, 53);
						}
						if (this.anIntArray253[2] != -1 && (this.anInt870 != 2 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[2].method86(11, 82);
						}
						if (this.anIntArray253[3] != -1 && (this.anInt870 != 3 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[3].method86(12, 115);
						}
						if (this.anIntArray253[4] != -1 && (this.anInt870 != 4 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[4].method86(13, 153);
						}
						if (this.anIntArray253[5] != -1 && (this.anInt870 != 5 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[5].method86(11, 180);
						}
						if (this.anIntArray253[6] != -1 && (this.anInt870 != 6 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[6].method86(13, 208);
						}
					}
					this.aClass47_14.method557(516, 160, super.aGraphics2);
					this.aClass47_13.method556();
					this.aClass4_Sub1_Sub2_Sub1_4.method86(0, 0);
					if (this.anInt959 == -1) {
						if (this.anIntArray253[this.anInt854] != -1) {
							if (this.anInt854 == 7) {
								this.aClass4_Sub1_Sub2_Sub1_14.method86(0, 42);
							}
							if (this.anInt854 == 8) {
								this.aClass4_Sub1_Sub2_Sub1_15.method86(0, 74);
							}
							if (this.anInt854 == 9) {
								this.aClass4_Sub1_Sub2_Sub1_15.method86(0, 102);
							}
							if (this.anInt854 == 10) {
								this.aClass4_Sub1_Sub2_Sub1_16.method86(1, 130);
							}
							if (this.anInt854 == 11) {
								this.aClass4_Sub1_Sub2_Sub1_18.method86(0, 173);
							}
							if (this.anInt854 == 12) {
								this.aClass4_Sub1_Sub2_Sub1_18.method86(0, 201);
							}
							if (this.anInt854 == 13) {
								this.aClass4_Sub1_Sub2_Sub1_17.method86(0, 229);
							}
						}
						if (this.anIntArray253[8] != -1 && (this.anInt870 != 8 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[7].method86(2, 74);
						}
						if (this.anIntArray253[9] != -1 && (this.anInt870 != 9 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[8].method86(3, 102);
						}
						if (this.anIntArray253[10] != -1 && (this.anInt870 != 10 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[9].method86(4, 137);
						}
						if (this.anIntArray253[11] != -1 && (this.anInt870 != 11 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[10].method86(2, 174);
						}
						if (this.anIntArray253[12] != -1 && (this.anInt870 != 12 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[11].method86(2, 201);
						}
						if (this.anIntArray253[13] != -1 && (this.anInt870 != 13 || anInt866 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub1Array4[12].method86(2, 226);
						}
					}
					this.aClass47_13.method557(496, 466, super.aGraphics2);
					this.aClass47_17.method556();
					Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
				}
				if (this.aBoolean273) {
					this.aBoolean273 = false;
					this.aClass47_12.method556();
					this.aClass4_Sub1_Sub2_Sub1_3.method86(0, 0);
					this.aClass4_Sub1_Sub2_Sub4_3.method496(28, 16777215, 55, true, "Public chat");
					if (this.anInt1019 == 0) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 65280, 55, true, "On");
					}
					if (this.anInt1019 == 1) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 16776960, 55, true, "Friends");
					}
					if (this.anInt1019 == 2) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 16711680, 55, true, "Off");
					}
					if (this.anInt1019 == 3) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 65535, 55, true, "Hide");
					}
					this.aClass4_Sub1_Sub2_Sub4_3.method496(28, 16777215, 184, true, "Private chat");
					if (this.anInt966 == 0) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 65280, 184, true, "On");
					}
					if (this.anInt966 == 1) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 16776960, 184, true, "Friends");
					}
					if (this.anInt966 == 2) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 16711680, 184, true, "Off");
					}
					this.aClass4_Sub1_Sub2_Sub4_3.method496(28, 16777215, 324, true, "Trade/compete");
					if (this.anInt970 == 0) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 65280, 324, true, "On");
					}
					if (this.anInt970 == 1) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 16776960, 324, true, "Friends");
					}
					if (this.anInt970 == 2) {
						this.aClass4_Sub1_Sub2_Sub4_3.method496(41, 16711680, 324, true, "Off");
					}
					this.aClass4_Sub1_Sub2_Sub4_3.method496(33, 16777215, 458, true, "Report abuse");
					this.aClass47_12.method557(0, 453, super.aGraphics2);
					this.aClass47_17.method556();
					Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
				}
				this.anInt849 = 0;
			} else {
				if (this.anInt874 == 2) {
					this.method661(this.anInt849, this.anInt990);
					if (this.anInt978 != -1) {
						this.method661(this.anInt849, this.anInt978);
					}
					this.anInt849 = 0;
					this.method608();
					super.aClass47_2.method556();
					Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray274;
					Class4_Sub1_Sub2.method485((byte) 6);
					this.aBoolean242 = true;
					@Pc(62) Class27 local62 = Class27.method405(this.anInt990);
					if (local62.anInt481 == 512 && local62.anInt494 == 334 && local62.anInt471 == 0) {
						local62.anInt481 = 765;
						local62.anInt494 = 503;
					}
					this.method697(0, 0, 0, local62);
					if (this.anInt978 != -1) {
						local62 = Class27.method405(this.anInt978);
						if (local62.anInt481 == 512 && local62.anInt494 == 334 && local62.anInt471 == 0) {
							local62.anInt481 = 765;
							local62.anInt494 = 503;
						}
						this.method697(0, 0, 0, local62);
					}
					if (this.aBoolean271) {
						this.method612();
					} else {
						this.method596((byte) 9);
						this.method658();
					}
				}
				super.aClass47_2.method557(0, 0, super.aGraphics2);
			}
		} catch (@Pc(1199) RuntimeException local1199) {
			signlink.reporterror("61376, " + true + ", " + local1199.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method622(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1074 = arg0;
			this.anInt892 += 0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("18303, " + arg0 + ", " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EGCCHUZS;II)V")
	private void method623(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt910; local6++) {
				@Pc(13) int local13 = this.anIntArray229[local6];
				@Pc(18) Class4_Sub1_Sub1_Sub1_Sub1 local18 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local13];
				@Pc(21) int local21 = arg0.method167();
				if ((local21 & 0x4) != 0) {
					local18.aString14 = arg0.method174();
					local18.anInt641 = 100;
				}
				if ((local21 & 0x80) != 0) {
					local18.anInt658 = arg0.method193();
					if (local18.anInt658 == 65535) {
						local18.anInt658 = -1;
					}
				}
				@Pc(55) int local55;
				@Pc(58) int local58;
				if ((local21 & 0x40) != 0) {
					local55 = arg0.method167();
					local58 = arg0.method167();
					local18.method472(anInt866, local58, local55);
					local18.anInt636 = anInt866 + 300;
					local18.anInt637 = arg0.method187();
					local18.anInt638 = arg0.method187();
				}
				if ((local21 & 0x10) != 0) {
					local18.anInt669 = arg0.method169();
					local55 = arg0.method201();
					local18.anInt673 = local55 >> 16;
					local18.anInt672 = anInt866 + (local55 & 0xFFFF);
					local18.anInt670 = 0;
					local18.anInt671 = 0;
					if (local18.anInt672 > anInt866) {
						local18.anInt670 = -1;
					}
					if (local18.anInt669 == 65535) {
						local18.anInt669 = -1;
					}
				}
				if ((local21 & 0x8) != 0) {
					local55 = arg0.method195();
					if (local55 == 65535) {
						local55 = -1;
					}
					local58 = arg0.method167();
					if (local55 == local18.anInt626 && local55 != -1) {
						@Pc(151) int local151 = Class5.aClass5Array1[local55].anInt47;
						if (local151 == 1) {
							local18.anInt627 = 0;
							local18.anInt628 = 0;
							local18.anInt629 = local58;
							local18.anInt630 = 0;
						}
						if (local151 == 2) {
							local18.anInt630 = 0;
						}
					} else if (local55 == -1 || local18.anInt626 == -1 || Class5.aClass5Array1[local55].anInt41 >= Class5.aClass5Array1[local18.anInt626].anInt41) {
						local18.anInt626 = local55;
						local18.anInt627 = 0;
						local18.anInt628 = 0;
						local18.anInt629 = local58;
						local18.anInt630 = 0;
						local18.anInt625 = local18.anInt631;
					}
				}
				if ((local21 & 0x20) != 0) {
					local55 = arg0.method167();
					local58 = arg0.method167();
					local18.method472(anInt866, local58, local55);
					local18.anInt636 = anInt866 + 300;
					local18.anInt637 = arg0.method186();
					local18.anInt638 = arg0.method167();
				}
				if ((local21 & 0x1) != 0) {
					local18.anInt660 = arg0.method195();
					local18.anInt661 = arg0.method194();
				}
				if ((local21 & 0x2) != 0) {
					local18.aClass2_1 = Class2.method9(arg0.method193());
					local18.anInt644 = local18.aClass2_1.aByte1;
					local18.anInt643 = local18.aClass2_1.anInt6;
					local18.anInt632 = local18.aClass2_1.anInt7;
					local18.anInt633 = local18.aClass2_1.anInt8;
					local18.anInt634 = local18.aClass2_1.anInt20;
					local18.anInt635 = local18.aClass2_1.anInt11;
					local18.anInt645 = local18.aClass2_1.anInt18;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("8834, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIII)V")
	private void method624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (arg4) {
				this.anInt981 = 89;
			}
			if (arg7 >= 1 && arg5 >= 1 && arg7 <= 102 && arg5 <= 102) {
				if (aBoolean235 && arg1 != this.anInt965) {
					return;
				}
				@Pc(25) int local25 = 0;
				if (arg3 == 0) {
					local25 = this.aClass25_1.method368(arg1, arg7, arg5);
				}
				if (arg3 == 1) {
					local25 = this.aClass25_1.method369(arg5, arg7, arg1);
				}
				if (arg3 == 2) {
					local25 = this.aClass25_1.method370(arg1, arg7, arg5);
				}
				if (arg3 == 3) {
					local25 = this.aClass25_1.method371(arg1, arg7, arg5);
				}
				@Pc(81) int local81;
				if (local25 != 0) {
					local81 = this.aClass25_1.method372(arg1, arg7, arg5, local25);
					@Pc(87) int local87 = local25 >> 14 & 0x7FFF;
					@Pc(91) int local91 = local81 & 0x1F;
					@Pc(95) int local95 = local81 >> 6;
					@Pc(107) Class20 local107;
					if (arg3 == 0) {
						this.aClass25_1.method359(arg1, arg5, arg7);
						local107 = Class20.method236(local87);
						if (local107.aBoolean89) {
							this.aClass3Array1[arg1].method17(this.anInt975, local91, arg5, arg7, local107.aBoolean91, local95);
						}
					}
					if (arg3 == 1) {
						this.aClass25_1.method360(arg5, arg1, arg7);
					}
					if (arg3 == 2) {
						this.aClass25_1.method361(this.anInt1010, arg5, arg1, arg7);
						local107 = Class20.method236(local87);
						if (arg7 + local107.anInt319 > 103 || arg5 + local107.anInt319 > 103 || arg7 + local107.anInt310 > 103 || arg5 + local107.anInt310 > 103) {
							return;
						}
						if (local107.aBoolean89) {
							this.aClass3Array1[arg1].method18(local107.anInt310, local107.aBoolean91, arg7, local107.anInt319, arg5, local95);
						}
					}
					if (arg3 == 3) {
						this.aClass25_1.method362(arg5, arg7, arg1);
						local107 = Class20.method236(local87);
						if (local107.aBoolean89 && local107.aBoolean85) {
							this.aClass3Array1[arg1].method20(arg7, arg5);
						}
					}
				}
				if (arg6 >= 0) {
					local81 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg7][arg5] & 0x2) == 2) {
						local81 = arg1 + 1;
					}
					Class29.method424(this.aClass25_1, this.anIntArrayArrayArray7, local81, arg0, arg6, this.aClass3Array1[arg1], arg7, arg5, arg1, arg2);
					return;
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("54802, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!EGCCHUZS;I)V")
	private void method625(@OriginalArg(1) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method177();
			@Pc(9) int local9 = arg0.method178(8);
			@Pc(15) int local15;
			if (local9 < this.anInt1009) {
				for (local15 = local9; local15 < this.anInt1009; local15++) {
					this.anIntArray266[this.anInt1032++] = this.anIntArray262[local15];
				}
			}
			if (local9 > this.anInt1009) {
				signlink.reporterror(this.aString17 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt1009 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(74) int local74 = this.anIntArray262[local15];
				@Pc(79) Class4_Sub1_Sub1_Sub1_Sub1 local79 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local74];
				@Pc(84) int local84 = arg0.method178(1);
				if (local84 == 0) {
					this.anIntArray262[this.anInt1009++] = local74;
					local79.anInt668 = anInt866;
				} else {
					@Pc(107) int local107 = arg0.method178(2);
					if (local107 == 0) {
						this.anIntArray262[this.anInt1009++] = local74;
						local79.anInt668 = anInt866;
						this.anIntArray229[this.anInt910++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(169) int local169;
						if (local107 == 1) {
							this.anIntArray262[this.anInt1009++] = local74;
							local79.anInt668 = anInt866;
							local158 = arg0.method178(3);
							local79.method473(this.anInt920, false, local158);
							local169 = arg0.method178(1);
							if (local169 == 1) {
								this.anIntArray229[this.anInt910++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray262[this.anInt1009++] = local74;
							local79.anInt668 = anInt866;
							local158 = arg0.method178(3);
							local79.method473(this.anInt920, true, local158);
							local169 = arg0.method178(3);
							local79.method473(this.anInt920, true, local169);
							@Pc(229) int local229 = arg0.method178(1);
							if (local229 == 1) {
								this.anIntArray229[this.anInt910++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray266[this.anInt1032++] = local74;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("79478, " + -696 + ", " + arg0 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private String method626(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("2920, " + arg0 + ", " + 42769 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method627(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass47_18 == null) {
				this.method720(this.aByte33);
				super.aClass47_2 = null;
				this.aClass47_19 = null;
				this.aClass47_20 = null;
				this.aClass47_21 = null;
				this.aClass47_22 = null;
				this.aClass47_23 = null;
				this.aClass47_24 = null;
				this.aClass47_25 = null;
				this.aClass47_26 = null;
				this.aClass47_27 = null;
				this.aClass47_18 = new Class47(this.method583(anInt1042), true, 479, 96);
				this.aClass47_16 = new Class47(this.method583(anInt1042), true, 172, 156);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass4_Sub1_Sub2_Sub1_7.method86(0, 0);
				this.aClass47_15 = new Class47(this.method583(anInt1042), true, 190, 261);
				this.aClass47_17 = new Class47(this.method583(anInt1042), true, 512, 334);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_12 = new Class47(this.method583(anInt1042), true, 496, 50);
				this.aClass47_13 = new Class47(this.method583(anInt1042), true, 269, 37);
				this.aClass47_14 = new Class47(this.method583(anInt1042), true, 249, 45);
				this.aBoolean242 = true;
				if (arg0 < 2 || arg0 > 2) {
					this.aClass4_Sub1_Sub3_9.method157(44);
				}
				this.aClass47_17.method556();
				Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("79297, " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
	private void method628(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg1 == 0 && this.anInt1005 != -1) {
				this.aString30 = arg2;
				super.anInt831 = 0;
			}
			if (this.anInt935 == -1) {
				this.aBoolean255 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray269[local20] = this.anIntArray269[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
			}
			this.anIntArray269[0] = arg1;
			this.aStringArray11[0] = arg0;
			this.aStringArray12[0] = arg2;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("58510, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method629(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1071 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("45758, " + arg0 + ", " + -28023 + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!EGCCHUZS;I)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			while (true) {
				if (arg1.anInt243 + 21 < arg2 * 8) {
					@Pc(12) int local12 = arg1.method178(14);
					if (local12 != 16383) {
						if (this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class4_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(32) Class4_Sub1_Sub1_Sub1_Sub1 local32 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local12];
						this.anIntArray262[this.anInt1009++] = local12;
						local32.anInt668 = anInt866;
						@Pc(51) int local51 = arg1.method178(1);
						local32.aClass2_1 = Class2.method9(arg1.method178(12));
						@Pc(63) int local63 = arg1.method178(1);
						if (local63 == 1) {
							this.anIntArray229[this.anInt910++] = local12;
						}
						@Pc(82) int local82 = arg1.method178(5);
						if (local82 > 15) {
							local82 -= 32;
						}
						@Pc(91) int local91 = arg1.method178(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						local32.anInt644 = local32.aClass2_1.aByte1;
						local32.anInt643 = local32.aClass2_1.anInt6;
						local32.anInt632 = local32.aClass2_1.anInt7;
						local32.anInt633 = local32.aClass2_1.anInt8;
						local32.anInt634 = local32.aClass2_1.anInt20;
						local32.anInt635 = local32.aClass2_1.anInt11;
						local32.anInt645 = local32.aClass2_1.anInt18;
						local32.method470(local51 == 1, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0] + local91, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0] + local82);
						continue;
					}
				}
				arg1.method179();
				@Pc(160) boolean local160 = false;
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("94674, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
	private boolean method631(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(17) int local17 = this.anIntArray232[arg0];
			if (local17 >= 2000) {
				local17 -= 2000;
			}
			return local17 == 342;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("40195, " + 357 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method632(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 >> 7 == this.anInt1053 && aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 >> 7 == this.anInt1054) {
				this.anInt1053 = 0;
			}
			@Pc(29) int local29 = this.anInt909;
			if (arg0) {
				local29 = 1;
			}
			for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
				@Pc(41) Class4_Sub1_Sub1_Sub1_Sub2 local41;
				@Pc(46) int local46;
				if (arg0) {
					local41 = aClass4_Sub1_Sub1_Sub1_Sub2_1;
					local46 = this.anInt908 << 14;
				} else {
					local41 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray228[local35]];
					local46 = this.anIntArray228[local35] << 14;
				}
				if (local41 != null && local41.method469()) {
					local41.aBoolean178 = false;
					if ((aBoolean235 && this.anInt909 > 50 || this.anInt909 > 200) && !arg0 && local41.anInt664 == local41.anInt645) {
						local41.aBoolean178 = true;
					}
					@Pc(97) int local97 = local41.anInt648 >> 7;
					@Pc(102) int local102 = local41.anInt649 >> 7;
					if (local97 >= 0 && local97 < 104 && local102 >= 0 && local102 < 104) {
						if (local41.aClass4_Sub1_Sub1_Sub3_2 == null || anInt866 < local41.anInt681 || anInt866 >= local41.anInt682) {
							if ((local41.anInt648 & 0x7F) == 64 && (local41.anInt649 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local97][local102] == this.anInt1045) {
									continue;
								}
								this.anIntArrayArray24[local97][local102] = this.anInt1045;
							}
							local41.anInt687 = this.method699(local41.anInt648, local41.anInt649, this.anInt965);
							this.aClass25_1.method353(60, local41.aBoolean173, local41.anInt649, local41, local41.anInt687, local41.anInt648, this.anInt965, local46, local41.anInt650);
						} else {
							local41.aBoolean178 = false;
							local41.anInt687 = this.method699(local41.anInt648, local41.anInt649, this.anInt965);
							this.aClass25_1.method354(local41.anInt677, local46, local41, local41.anInt649, this.anInt965, local41.anInt648, local41.anInt650, local41.anInt687, local41.anInt675, local41.anInt674, local41.anInt676);
						}
					}
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("43968, " + 59 + ", " + arg0 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!HOSNGCXH;B)V")
	private void method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub2_Sub2 arg2) {
		try {
			@Pc(7) int local7 = this.anInt1012 + this.anInt842 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class4_Sub1_Sub1_Sub3.anIntArray90[local7];
				@Pc(27) int local27 = Class4_Sub1_Sub1_Sub3.anIntArray91[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt867 + 256);
				@Pc(50) int local50 = local27 * 256 / (this.anInt867 + 256);
				@Pc(60) int local60 = arg0 * local36 + arg1 * local50 >> 16;
				@Pc(70) int local70 = arg0 * local50 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method265(local60 + 94 + 4 - arg2.anInt345 / 2, this.aClass4_Sub1_Sub2_Sub1_7, 83 - local70 - arg2.anInt346 / 2 - 4);
				} else {
					arg2.method259(83 - local70 - arg2.anInt346 / 2 - 4, local60 + 94 - arg2.anInt345 / 2 + 4);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("52014, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 87 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method634() {
		try {
			try {
				if (this.aClass40_1 != null) {
					this.aClass40_1.method515();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass40_1 = null;
			this.aBoolean272 = false;
			this.anInt900 = 0;
			this.aString17 = "";
			this.aBoolean272 &= true;
			this.aString18 = "";
			this.method613();
			this.aClass25_1.method342();
			for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
				this.aClass3Array1[local37].method12();
			}
			System.gc();
			this.method695(177);
			this.anInt958 = -1;
			this.anInt1052 = -1;
			this.anInt1023 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("38367, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method635(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt892 += 0;
			@Pc(17) int local17;
			if (this.aClass47_17 != null) {
				this.aClass47_17.method556();
				Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
				local17 = 151;
				if (arg1 != null) {
					local17 -= 7;
				}
				this.aClass4_Sub1_Sub2_Sub4_3.method495(0, local17, 257, arg0);
				this.aClass4_Sub1_Sub2_Sub4_3.method495(16777215, local17 - 1, 256, arg0);
				local17 += 15;
				if (arg1 != null) {
					this.aClass4_Sub1_Sub2_Sub4_3.method495(0, local17, 257, arg1);
					this.aClass4_Sub1_Sub2_Sub4_3.method495(16777215, local17 - 1, 256, arg1);
				}
				this.aClass47_17.method557(4, 4, super.aGraphics2);
			} else if (super.aClass47_2 != null) {
				super.aClass47_2.method556();
				Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray274;
				local17 = 251;
				Class4_Sub1_Sub2.method487(221, 300, 50, 233, 0);
				Class4_Sub1_Sub2.method488(300, 50, this.anInt914, 16777215, 233, 221);
				if (arg1 != null) {
					local17 -= 7;
				}
				this.aClass4_Sub1_Sub2_Sub4_3.method495(0, local17, 383, arg0);
				this.aClass4_Sub1_Sub2_Sub4_3.method495(16777215, local17 - 1, 382, arg0);
				local17 += 15;
				if (arg1 != null) {
					this.aClass4_Sub1_Sub2_Sub4_3.method495(0, local17, 383, arg1);
					this.aClass4_Sub1_Sub2_Sub4_3.method495(16777215, local17 - 1, 382, arg1);
				}
				super.aClass47_2.method557(0, 0, super.aGraphics2);
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("55029, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method636() {
		try {
			this.anInt892 += 0;
			@Pc(10) Graphics local10 = this.method583(anInt1042).getGraphics();
			local10.setColor(Color.black);
			local10.fillRect(0, 0, 765, 503);
			this.method576();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean238) {
				this.aBoolean249 = false;
				local10.setFont(new Font("Helvetica", 1, 16));
				local10.setColor(Color.yellow);
				local42 = 35;
				local10.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local48 = local42 + 50;
				local10.setColor(Color.white);
				local10.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(57) int local57 = local48 + 50;
				local10.setColor(Color.white);
				local10.setFont(new Font("Helvetica", 1, 12));
				local10.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(74) int local74 = local57 + 30;
				local10.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(80) int local80 = local74 + 30;
				local10.drawString("3: Try using a different game-world", 30, 195);
				@Pc(86) int local86 = local80 + 30;
				local10.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(92) int local92 = local86 + 30;
				local10.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean265) {
				this.aBoolean249 = false;
				local10.setFont(new Font("Helvetica", 1, 20));
				local10.setColor(Color.white);
				local10.drawString("Error - unable to load game!", 50, 50);
				local10.drawString("To play RuneScape make sure you play from", 50, 100);
				local10.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean253) {
				this.aBoolean249 = false;
				local10.setColor(Color.yellow);
				local42 = 35;
				local10.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local48 = local42 + 50;
				local10.setColor(Color.white);
				local10.drawString("To fix this try the following (in order):", 30, 85);
				local48 += 50;
				local10.setColor(Color.white);
				local10.setFont(new Font("Helvetica", 1, 12));
				local10.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local48 += 30;
				local10.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local48 += 30;
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("90922, " + 0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method637() {
		try {
			if (this.anInt936 != 0) {
				@Pc(6) Class4_Sub1_Sub2_Sub4 local6 = this.aClass4_Sub1_Sub2_Sub4_3;
				this.aBoolean272 &= true;
				@Pc(14) int local14 = 0;
				if (this.anInt1056 != 0) {
					local14 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray12[local21] != null) {
						@Pc(33) int local33 = this.anIntArray269[local21];
						@Pc(38) String local38 = this.aStringArray11[local21];
						@Pc(40) byte local40 = 0;
						if (local38 != null && local38.startsWith("@cr1@")) {
							local38 = local38.substring(5);
							local40 = 1;
						}
						if (local38 != null && local38.startsWith("@cr2@")) {
							local38 = local38.substring(5);
							local40 = 2;
						}
						@Pc(91) int local91;
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt966 == 0 || this.anInt966 == 1 && this.method645(local38))) {
							local91 = 329 - local14 * 13;
							local6.method499(local91, "From", 4, 0);
							local6.method499(local91 - 1, "From", 4, 65535);
							@Pc(116) int local116 = local6.method497("From ", 555) + 4;
							if (local40 == 1) {
								this.aClass4_Sub1_Sub2_Sub1Array2[0].method86(local91 - 12, local116);
								local116 += 14;
							}
							if (local40 == 2) {
								this.aClass4_Sub1_Sub2_Sub1Array2[1].method86(local91 - 12, local116);
								local116 += 14;
							}
							local6.method499(local91, local38 + ": " + this.aStringArray12[local21], local116, 0);
							local6.method499(local91 - 1, local38 + ": " + this.aStringArray12[local21], local116, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt966 < 2) {
							local91 = 329 - local14 * 13;
							local6.method499(local91, this.aStringArray12[local21], 4, 0);
							local6.method499(local91 - 1, this.aStringArray12[local21], 4, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt966 < 2) {
							local91 = 329 - local14 * 13;
							local6.method499(local91, "To " + local38 + ": " + this.aStringArray12[local21], 4, 0);
							local6.method499(local91 - 1, "To " + local38 + ": " + this.aStringArray12[local21], 4, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("12537, " + true + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LORGYGVM;B)V")
	private void method638(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt480;
			@Pc(70) int local70;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local70 = this.anInt890;
					if (this.anInt891 != 2) {
						local70 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local70) {
						arg0.aString13 = "";
						arg0.anInt483 = 0;
					} else {
						if (this.anIntArray214[local4] == 0) {
							arg0.aString13 = "@red@Offline";
						} else if (this.anIntArray214[local4] < 200) {
							if (this.anIntArray214[local4] == anInt855) {
								arg0.aString13 = "@gre@World-" + (this.anIntArray214[local4] - 9);
							} else {
								arg0.aString13 = "@yel@World-" + (this.anIntArray214[local4] - 9);
							}
						} else if (this.anIntArray214[local4] == anInt855) {
							arg0.aString13 = "@gre@Classic" + (this.anIntArray214[local4] - 219);
						} else {
							arg0.aString13 = "@yel@Classic" + (this.anIntArray214[local4] - 219);
						}
						arg0.anInt483 = 1;
					}
				} else if (local4 == 203) {
					local70 = this.anInt890;
					if (this.anInt891 != 2) {
						local70 = 0;
					}
					arg0.anInt473 = local70 * 15 + 20;
					if (arg0.anInt473 <= arg0.anInt494) {
						arg0.anInt473 = arg0.anInt494 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt891 == 0) {
						arg0.aString13 = "Loading ignore list";
						arg0.anInt483 = 0;
					} else if (local4 == 1 && this.anInt891 == 0) {
						arg0.aString13 = "Please wait...";
						arg0.anInt483 = 0;
					} else {
						local70 = this.anInt943;
						if (this.anInt891 == 0) {
							local70 = 0;
						}
						if (local4 >= local70) {
							arg0.aString13 = "";
							arg0.anInt483 = 0;
						} else {
							arg0.aString13 = Class46.method554(Class46.method551(this.aLongArray3[local4]));
							arg0.anInt483 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt473 = this.anInt943 * 15 + 20;
					if (arg0.anInt473 <= arg0.anInt494) {
						arg0.anInt473 = arg0.anInt494 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt467 = 150;
					arg0.anInt468 = (int) (Math.sin((double) anInt866 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean237) {
						for (local70 = 0; local70 < 7; local70++) {
							@Pc(383) int local383 = this.anIntArray216[local70];
							if (local383 >= 0 && !Class50.aClass50Array1[local383].method569()) {
								return;
							}
						}
						this.aBoolean237 = false;
						@Pc(402) Class4_Sub1_Sub1_Sub3[] local402 = new Class4_Sub1_Sub1_Sub3[7];
						@Pc(404) int local404 = 0;
						for (@Pc(406) int local406 = 0; local406 < 7; local406++) {
							@Pc(413) int local413 = this.anIntArray216[local406];
							if (local413 >= 0) {
								local402[local404++] = Class50.aClass50Array1[local413].method570(this.aByte31);
							}
						}
						@Pc(436) Class4_Sub1_Sub1_Sub3 local436 = new Class4_Sub1_Sub1_Sub3(true, local404, local402);
						for (@Pc(438) int local438 = 0; local438 < 5; local438++) {
							if (this.anIntArray257[local438] != 0) {
								local436.method297(anIntArrayArray25[local438][0], anIntArrayArray25[local438][this.anIntArray257[local438]]);
								if (local438 == 1) {
									local436.method297(anIntArray267[0], anIntArray267[this.anIntArray257[local438]]);
								}
							}
						}
						local436.method290();
						local436.method291(Class5.aClass5Array1[aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt645].anIntArray7[0]);
						local436.method300(64, 850, -30, -50, -30, true);
						arg0.anInt459 = 5;
						arg0.anInt460 = 0;
						Class27.method404(local436);
					}
				} else if (local4 == 324) {
					if (this.aClass4_Sub1_Sub2_Sub2_15 == null) {
						this.aClass4_Sub1_Sub2_Sub2_15 = arg0.aClass4_Sub1_Sub2_Sub2_2;
						this.aClass4_Sub1_Sub2_Sub2_16 = arg0.aClass4_Sub1_Sub2_Sub2_1;
					}
					if (this.aBoolean250) {
						arg0.aClass4_Sub1_Sub2_Sub2_2 = this.aClass4_Sub1_Sub2_Sub2_16;
					} else {
						arg0.aClass4_Sub1_Sub2_Sub2_2 = this.aClass4_Sub1_Sub2_Sub2_15;
					}
				} else if (local4 == 325) {
					if (this.aClass4_Sub1_Sub2_Sub2_15 == null) {
						this.aClass4_Sub1_Sub2_Sub2_15 = arg0.aClass4_Sub1_Sub2_Sub2_2;
						this.aClass4_Sub1_Sub2_Sub2_16 = arg0.aClass4_Sub1_Sub2_Sub2_1;
					}
					if (this.aBoolean250) {
						arg0.aClass4_Sub1_Sub2_Sub2_2 = this.aClass4_Sub1_Sub2_Sub2_15;
					} else {
						arg0.aClass4_Sub1_Sub2_Sub2_2 = this.aClass4_Sub1_Sub2_Sub2_16;
					}
				} else if (local4 == 600) {
					arg0.aString13 = this.aString24;
					if (anInt866 % 20 < 10) {
						arg0.aString13 = arg0.aString13 + "|";
					} else {
						arg0.aString13 = arg0.aString13 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt933 < 1) {
							arg0.aString13 = "";
						} else if (this.aBoolean267) {
							arg0.anInt488 = 16711680;
							arg0.aString13 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt488 = 16777215;
							arg0.aString13 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(643) String local643;
					if (local4 == 660) {
						local70 = this.anInt860 - this.anInt880;
						if (local70 <= 0) {
							local643 = "earlier today";
						} else if (local70 == 1) {
							local643 = "yesterday";
						} else {
							local643 = local70 + " days ago";
						}
						arg0.aString13 = "You last logged in @red@" + local643 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt862 == 0) {
							arg0.aString13 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt862 <= this.anInt860) {
							arg0.aString13 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method639(this.anInt862);
						} else {
							local70 = this.anInt860 + 14 - this.anInt862;
							if (local70 <= 0) {
								local643 = "Earlier today";
							} else if (local70 == 1) {
								local643 = "Yesterday";
							} else {
								local643 = local70 + " days ago";
							}
							arg0.aString13 = local643 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method639(this.anInt862) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(761) String local761;
						if (this.anInt989 == 0) {
							local761 = "@yel@0 unread messages";
						} else if (this.anInt989 == 1) {
							local761 = "@gre@1 unread message";
						} else {
							local761 = "@gre@" + this.anInt989 + " unread messages";
						}
						arg0.aString13 = "You have " + local761 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt927 > 0 && this.anInt927 <= this.anInt860 + 10) {
							arg0.aString13 = "Last password change:\\n@gre@" + this.method639(this.anInt927);
						} else {
							arg0.aString13 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 664) {
						if (this.anInt1047 == 0) {
							arg0.aString13 = "You have not yet set\\nany contact details.";
						}
						if (this.anInt1047 == 1) {
							arg0.aString13 = "Contact Details Last Set:\\n@gre@" + this.method639(this.anInt925);
						}
						if (this.anInt1047 == 2) {
							arg0.aString13 = "You need to set\\nnew contact details.";
						}
					}
					if (local4 == 665) {
						if (this.anInt879 > 2 && !aBoolean234) {
							arg0.aString13 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt879 > 2) {
							arg0.aString13 = "\\n\\nYou have @gre@" + this.anInt879 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt879 > 0) {
							arg0.aString13 = "You have @gre@" + this.anInt879 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString13 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt879 > 2 && !aBoolean234) {
							arg0.aString13 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt879 > 0) {
							arg0.aString13 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString13 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt862 > this.anInt860) {
							arg0.aString13 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString13 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt891 == 0) {
				arg0.aString13 = "Loading friend list";
				arg0.anInt483 = 0;
			} else if (local4 == 1 && this.anInt891 == 1) {
				arg0.aString13 = "Connecting to friendserver";
				arg0.anInt483 = 0;
			} else if (local4 == 2 && this.anInt891 != 2) {
				arg0.aString13 = "Please wait...";
				arg0.anInt483 = 0;
			} else {
				local70 = this.anInt890;
				if (this.anInt891 != 2) {
					local70 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local70) {
					arg0.aString13 = "";
					arg0.anInt483 = 0;
				} else {
					arg0.aString13 = this.aStringArray13[local4];
					arg0.anInt483 = 1;
				}
			}
		} catch (@Pc(951) RuntimeException local951) {
			signlink.reporterror("21554, " + arg0 + ", " + -22 + ", " + local951.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	private String method639(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt860 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(30) int local30 = local16.get(2);
			@Pc(34) int local34 = local16.get(1);
			@Pc(85) String[] local85 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local85[local30] + "-" + local34;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("427, " + arg0 + ", " + false + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)Z")
	private boolean method640() {
		try {
			if (this.aClass40_1 == null) {
				return false;
			}
			@Pc(2058) String local2058;
			@Pc(188) int local188;
			try {
				@Pc(16) int local16 = this.aClass40_1.method517();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt893 == -1) {
					this.aClass40_1.method518(this.aClass4_Sub1_Sub3_6.aByteArray7, 0, 1);
					this.anInt893 = this.aClass4_Sub1_Sub3_6.aByteArray7[0] & 0xFF;
					if (this.aClass37_2 != null) {
						this.anInt893 = this.anInt893 - this.aClass37_2.method477() & 0xFF;
					}
					this.anInt892 = Class19.anIntArray39[this.anInt893];
					local16--;
				}
				if (this.anInt892 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass40_1.method518(this.aClass4_Sub1_Sub3_6.aByteArray7, 0, 1);
					this.anInt892 = this.aClass4_Sub1_Sub3_6.aByteArray7[0] & 0xFF;
					local16--;
				}
				if (this.anInt892 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass40_1.method518(this.aClass4_Sub1_Sub3_6.aByteArray7, 0, 2);
					this.aClass4_Sub1_Sub3_6.anInt242 = 0;
					this.anInt892 = this.aClass4_Sub1_Sub3_6.method169();
					local16 -= 2;
				}
				if (local16 < this.anInt892) {
					return false;
				}
				this.aClass4_Sub1_Sub3_6.anInt242 = 0;
				this.aClass40_1.method518(this.aClass4_Sub1_Sub3_6.aByteArray7, 0, this.anInt892);
				this.anInt894 = 0;
				this.anInt878 = this.anInt877;
				this.anInt877 = this.anInt876;
				this.anInt876 = this.anInt893;
				if (this.anInt893 == 95) {
					this.anInt891 = this.aClass4_Sub1_Sub3_6.method167();
					this.aBoolean251 = true;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 21) {
					@Pc(183) boolean local183 = this.aClass4_Sub1_Sub3_6.method185() == 1;
					local188 = this.aClass4_Sub1_Sub3_6.method193();
					Class27.method405(local188).aBoolean141 = local183;
					this.anInt893 = -1;
					return true;
				}
				@Pc(206) int local206;
				@Pc(214) Class27 local214;
				if (this.anInt893 == 194) {
					local206 = this.aClass4_Sub1_Sub3_6.method195();
					local188 = this.aClass4_Sub1_Sub3_6.method193();
					local214 = Class27.method405(local188);
					if (local214 != null && local214.anInt471 == 0) {
						if (local206 < 0) {
							local206 = 0;
						}
						if (local206 > local214.anInt473 - local214.anInt494) {
							local206 = local214.anInt473 - local214.anInt494;
						}
						local214.anInt461 = local206;
					}
					this.anInt893 = -1;
					return true;
				}
				@Pc(260) int local260;
				if (this.anInt893 == 195) {
					local206 = this.aClass4_Sub1_Sub3_6.method169();
					local188 = this.aClass4_Sub1_Sub3_6.method167();
					local260 = this.aClass4_Sub1_Sub3_6.method169();
					if (this.aBoolean246 && !aBoolean235 && this.anInt969 < 50) {
						this.anIntArray237[this.anInt969] = local206;
						this.anIntArray217[this.anInt969] = local188;
						this.anIntArray213[this.anInt969] = local260 + Class14.anIntArray34[local206];
						this.anInt969++;
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 40) {
					this.anInt916 = this.aClass4_Sub1_Sub3_6.method167();
					this.anInt893 = -1;
					return true;
				}
				@Pc(328) String local328;
				if (this.anInt893 == 78) {
					local206 = this.aClass4_Sub1_Sub3_6.method167();
					local328 = this.aClass4_Sub1_Sub3_6.method174();
					local260 = this.aClass4_Sub1_Sub3_6.method187();
					if (local206 >= 1 && local206 <= 5) {
						if (local328.equalsIgnoreCase("null")) {
							local328 = null;
						}
						this.aStringArray9[local206 - 1] = local328;
						this.aBooleanArray12[local206 - 1] = local260 == 0;
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 50) {
					this.method634();
					this.anInt893 = -1;
					return false;
				}
				if (this.anInt893 == 60) {
					local206 = this.aClass4_Sub1_Sub3_6.method197();
					local188 = this.aClass4_Sub1_Sub3_6.method194();
					local214 = Class27.method405(local188);
					if (local214.anInt478 != local206 || local206 == -1) {
						local214.anInt478 = local206;
						local214.anInt465 = 0;
						local214.anInt496 = 0;
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 234) {
					local206 = this.aClass4_Sub1_Sub3_6.method195();
					local188 = this.aClass4_Sub1_Sub3_6.method201();
					this.anIntArray248[local206] = local188;
					if (this.anIntArray212[local206] != local188) {
						this.anIntArray212[local206] = local188;
						this.method642(local206);
						this.aBoolean251 = true;
						if (this.anInt1005 != -1) {
							this.aBoolean255 = true;
						}
					}
					this.anInt893 = -1;
					return true;
				}
				@Pc(491) int local491;
				if (this.anInt893 == 146) {
					local206 = this.aClass4_Sub1_Sub3_6.method195();
					local188 = this.aClass4_Sub1_Sub3_6.method193();
					local260 = this.aClass4_Sub1_Sub3_6.method194();
					local491 = this.aClass4_Sub1_Sub3_6.method193();
					Class27.method405(local188).anInt467 = local206;
					Class27.method405(local188).anInt468 = local491;
					Class27.method405(local188).anInt466 = local260;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 115) {
					local206 = this.aClass4_Sub1_Sub3_6.method194();
					@Pc(522) byte local522 = this.aClass4_Sub1_Sub3_6.method188();
					this.anIntArray248[local206] = local522;
					if (this.anIntArray212[local206] != local522) {
						this.anIntArray212[local206] = local522;
						this.method642(local206);
						this.aBoolean251 = true;
						if (this.anInt1005 != -1) {
							this.aBoolean255 = true;
						}
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 32) {
					this.anInt1053 = 0;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 149) {
					this.method594(this.aClass4_Sub1_Sub3_6, this.anInt892);
					this.aBoolean275 = false;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 215) {
					local206 = this.aClass4_Sub1_Sub3_6.method196();
					local188 = this.aClass4_Sub1_Sub3_6.method195();
					local260 = this.aClass4_Sub1_Sub3_6.method198();
					@Pc(610) Class27 local610 = Class27.method405(local188);
					local610.anInt495 = local260;
					local610.anInt489 = local206;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 180) {
					this.anInt870 = this.aClass4_Sub1_Sub3_6.method167();
					if (this.anInt870 == this.anInt854) {
						if (this.anInt870 == 3) {
							this.anInt854 = 1;
						} else {
							this.anInt854 = 3;
						}
						this.aBoolean251 = true;
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 57) {
					local206 = this.aClass4_Sub1_Sub3_6.method193();
					this.method676(local206);
					if (this.anInt959 != -1) {
						this.method607(this.anInt959);
						this.anInt959 = -1;
						this.aBoolean251 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt935 != -1) {
						this.method607(this.anInt935);
						this.anInt935 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt990 != -1) {
						this.method607(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean242 = true;
					}
					if (this.anInt978 != -1) {
						this.method607(this.anInt978);
						this.anInt978 = -1;
					}
					if (this.anInt906 != local206) {
						this.method607(this.anInt906);
						this.anInt906 = local206;
					}
					if (this.anInt1020 != 0) {
						this.anInt1020 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean233 = false;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 27) {
					if (this.anInt959 != -1) {
						this.method607(this.anInt959);
						this.anInt959 = -1;
						this.aBoolean251 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt935 != -1) {
						this.method607(this.anInt935);
						this.anInt935 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt990 != -1) {
						this.method607(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean242 = true;
					}
					if (this.anInt978 != -1) {
						this.method607(this.anInt978);
						this.anInt978 = -1;
					}
					if (this.anInt906 != -1) {
						this.method607(this.anInt906);
						this.anInt906 = -1;
					}
					if (this.anInt1020 != 0) {
						this.anInt1020 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean233 = false;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 58) {
					this.anInt854 = this.aClass4_Sub1_Sub3_6.method186();
					this.aBoolean251 = true;
					this.aBoolean244 = true;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 212) {
					local206 = this.aClass4_Sub1_Sub3_6.method194();
					local328 = this.aClass4_Sub1_Sub3_6.method174();
					Class27.method405(local206).aString13 = local328;
					@Pc(896) int local896 = this.anIntArray253[this.anInt854];
					if (Class27.method405(local206).anInt476 == local896) {
						this.aBoolean251 = true;
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 2) {
					local206 = this.aClass4_Sub1_Sub3_6.method195();
					local188 = this.aClass4_Sub1_Sub3_6.method195();
					this.method676(local188);
					if (local206 != -1) {
						this.method676(local206);
					}
					if (this.anInt906 != -1) {
						this.method607(this.anInt906);
						this.anInt906 = -1;
					}
					if (this.anInt959 != -1) {
						this.method607(this.anInt959);
						this.anInt959 = -1;
					}
					if (this.anInt935 != -1) {
						this.method607(this.anInt935);
						this.anInt935 = -1;
					}
					if (this.anInt990 != local188) {
						this.method607(this.anInt990);
						this.anInt990 = local188;
					}
					if (this.anInt978 != local188) {
						this.method607(this.anInt978);
						this.anInt978 = local206;
					}
					this.anInt1020 = 0;
					this.aBoolean233 = false;
					this.anInt893 = -1;
					return true;
				}
				@Pc(1077) int local1077;
				@Pc(1088) int local1088;
				@Pc(1072) int local1072;
				if (this.anInt893 == 33) {
					this.aBoolean261 = true;
					this.anInt1026 = this.aClass4_Sub1_Sub3_6.method167();
					this.anInt1027 = this.aClass4_Sub1_Sub3_6.method167();
					this.anInt1028 = this.aClass4_Sub1_Sub3_6.method169();
					this.anInt1029 = this.aClass4_Sub1_Sub3_6.method167();
					this.anInt1030 = this.aClass4_Sub1_Sub3_6.method167();
					if (this.anInt1030 >= 100) {
						local206 = this.anInt1026 * 128 + 64;
						local188 = this.anInt1027 * 128 + 64;
						local260 = this.method699(local206, local188, this.anInt965) - this.anInt1028;
						local491 = local206 - this.anInt983;
						local1072 = local260 - this.anInt984;
						local1077 = local188 - this.anInt985;
						local1088 = (int) Math.sqrt((double) (local491 * local491 + local1077 * local1077));
						this.anInt986 = (int) (Math.atan2((double) local1072, (double) local1088) * 325.949D) & 0x7FF;
						this.anInt987 = (int) (Math.atan2((double) local491, (double) local1077) * -325.949D) & 0x7FF;
						if (this.anInt986 < 128) {
							this.anInt986 = 128;
						}
						if (this.anInt986 > 383) {
							this.anInt986 = 383;
						}
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 138) {
					this.anInt882 = this.aClass4_Sub1_Sub3_6.method185();
					this.anInt883 = this.aClass4_Sub1_Sub3_6.method187();
					while (this.aClass4_Sub1_Sub3_6.anInt242 < this.anInt892) {
						local206 = this.aClass4_Sub1_Sub3_6.method167();
						this.method654(local206, this.aClass4_Sub1_Sub3_6);
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 44) {
					local206 = this.aClass4_Sub1_Sub3_6.method197();
					if (local206 >= 0) {
						this.method676(local206);
					}
					if (local206 != this.anInt1050) {
						this.method607(this.anInt1050);
						this.anInt1050 = local206;
					}
					this.anInt893 = -1;
					return true;
				}
				@Pc(1216) Class27 local1216;
				if (this.anInt893 == 36) {
					this.aBoolean251 = true;
					local206 = this.aClass4_Sub1_Sub3_6.method169();
					local1216 = Class27.method405(local206);
					local260 = this.aClass4_Sub1_Sub3_6.method169();
					for (local491 = 0; local491 < local260; local491++) {
						local1072 = this.aClass4_Sub1_Sub3_6.method167();
						if (local1072 == 255) {
							local1072 = this.aClass4_Sub1_Sub3_6.method202(this.anInt931);
						}
						local1216.anIntArray124[local491] = this.aClass4_Sub1_Sub3_6.method169();
						local1216.anIntArray128[local491] = local1072;
					}
					for (local1072 = local260; local1072 < local1216.anIntArray124.length; local1072++) {
						local1216.anIntArray124[local1072] = 0;
						local1216.anIntArray128[local1072] = 0;
					}
					this.anInt893 = -1;
					return true;
				}
				@Pc(1434) int local1434;
				@Pc(1287) long local1287;
				if (this.anInt893 == 209) {
					local1287 = this.aClass4_Sub1_Sub3_6.method173();
					local260 = this.aClass4_Sub1_Sub3_6.method167();
					@Pc(1297) String local1297 = Class46.method554(Class46.method551(local1287));
					for (local1072 = 0; local1072 < this.anInt890; local1072++) {
						if (local1287 == this.aLongArray4[local1072]) {
							if (this.anIntArray214[local1072] != local260) {
								this.anIntArray214[local1072] = local260;
								this.aBoolean251 = true;
								if (local260 > 0) {
									this.method628("", 5, local1297 + " has logged in.");
								}
								if (local260 == 0) {
									this.method628("", 5, local1297 + " has logged out.");
								}
							}
							local1297 = null;
							break;
						}
					}
					if (local1297 != null && this.anInt890 < 200) {
						this.aLongArray4[this.anInt890] = local1287;
						this.aStringArray13[this.anInt890] = local1297;
						this.anIntArray214[this.anInt890] = local260;
						this.anInt890++;
						this.aBoolean251 = true;
					}
					@Pc(1395) boolean local1395 = false;
					while (!local1395) {
						local1395 = true;
						for (local1088 = 0; local1088 < this.anInt890 - 1; local1088++) {
							if (this.anIntArray214[local1088] != anInt855 && this.anIntArray214[local1088 + 1] == anInt855 || this.anIntArray214[local1088] == 0 && this.anIntArray214[local1088 + 1] != 0) {
								local1434 = this.anIntArray214[local1088];
								this.anIntArray214[local1088] = this.anIntArray214[local1088 + 1];
								this.anIntArray214[local1088 + 1] = local1434;
								@Pc(1456) String local1456 = this.aStringArray13[local1088];
								this.aStringArray13[local1088] = this.aStringArray13[local1088 + 1];
								this.aStringArray13[local1088 + 1] = local1456;
								@Pc(1478) long local1478 = this.aLongArray4[local1088];
								this.aLongArray4[local1088] = this.aLongArray4[local1088 + 1];
								this.aLongArray4[local1088 + 1] = local1478;
								this.aBoolean251 = true;
								local1395 = false;
							}
						}
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 205) {
					this.aBoolean261 = false;
					for (local206 = 0; local206 < 5; local206++) {
						this.aBooleanArray11[local206] = false;
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 193) {
					if (this.anInt854 == 12) {
						this.aBoolean251 = true;
					}
					this.anInt863 = this.aClass4_Sub1_Sub3_6.method170();
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 135) {
					local206 = this.aClass4_Sub1_Sub3_6.method169();
					local1216 = Class27.method405(local206);
					for (local260 = 0; local260 < local1216.anIntArray124.length; local260++) {
						local1216.anIntArray124[local260] = -1;
						local1216.anIntArray124[local260] = 0;
					}
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 223) {
					local206 = this.aClass4_Sub1_Sub3_6.method169();
					local188 = this.aClass4_Sub1_Sub3_6.method193();
					local260 = local188 >> 10 & 0x1F;
					local491 = local188 >> 5 & 0x1F;
					local1072 = local188 & 0x1F;
					Class27.method405(local206).anInt488 = (local260 << 19) + (local491 << 11) + (local1072 << 3);
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 225) {
					this.anInt883 = this.aClass4_Sub1_Sub3_6.method186();
					this.anInt882 = this.aClass4_Sub1_Sub3_6.method185();
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 116) {
					local206 = this.aClass4_Sub1_Sub3_6.method195();
					local188 = this.aClass4_Sub1_Sub3_6.method193();
					Class27.method405(local206).anInt459 = 1;
					Class27.method405(local206).anInt460 = local188;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 == 185) {
					local206 = this.aClass4_Sub1_Sub3_6.method169();
					this.method676(local206);
					if (this.anInt935 != -1) {
						this.method607(this.anInt935);
						this.anInt935 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt990 != -1) {
						this.method607(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean242 = true;
					}
					if (this.anInt978 != -1) {
						this.method607(this.anInt978);
						this.anInt978 = -1;
					}
					if (this.anInt906 != -1) {
						this.method607(this.anInt906);
						this.anInt906 = -1;
					}
					if (this.anInt959 != local206) {
						this.method607(this.anInt959);
						this.anInt959 = local206;
					}
					if (this.anInt1020 != 0) {
						this.anInt1020 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean251 = true;
					this.aBoolean244 = true;
					this.aBoolean233 = false;
					this.anInt893 = -1;
					return true;
				}
				if (this.anInt893 != 86 && this.anInt893 != 199 && this.anInt893 != 3 && this.anInt893 != 147 && this.anInt893 != 188 && this.anInt893 != 237 && this.anInt893 != 69 && this.anInt893 != 99 && this.anInt893 != 246 && this.anInt893 != 52 && this.anInt893 != 198) {
					if (this.anInt893 == 68) {
						this.aBoolean251 = true;
						local206 = this.aClass4_Sub1_Sub3_6.method185();
						local188 = this.aClass4_Sub1_Sub3_6.method186();
						local260 = this.aClass4_Sub1_Sub3_6.method203();
						this.anIntArray256[local188] = local260;
						this.anIntArray275[local188] = local206;
						this.anIntArray215[local188] = 1;
						for (local491 = 0; local491 < 98; local491++) {
							if (local260 >= anIntArray218[local491]) {
								this.anIntArray215[local188] = local491 + 2;
							}
						}
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 178) {
						this.aBoolean270 = false;
						this.anInt1020 = 1;
						this.aString28 = "";
						this.aBoolean255 = true;
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 168) {
						this.aBoolean270 = false;
						this.anInt1020 = 2;
						this.aString28 = "";
						this.aBoolean255 = true;
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 192) {
						local206 = this.aClass4_Sub1_Sub3_6.method194();
						local188 = this.aClass4_Sub1_Sub3_6.method195();
						Class27.method405(local188).anInt459 = 2;
						Class27.method405(local188).anInt460 = local206;
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 0) {
						this.aBoolean261 = true;
						this.anInt837 = this.aClass4_Sub1_Sub3_6.method167();
						this.anInt838 = this.aClass4_Sub1_Sub3_6.method167();
						this.anInt839 = this.aClass4_Sub1_Sub3_6.method169();
						this.anInt840 = this.aClass4_Sub1_Sub3_6.method167();
						this.anInt841 = this.aClass4_Sub1_Sub3_6.method167();
						if (this.anInt841 >= 100) {
							this.anInt983 = this.anInt837 * 128 + 64;
							this.anInt985 = this.anInt838 * 128 + 64;
							this.anInt984 = this.method699(this.anInt983, this.anInt985, this.anInt965) - this.anInt839;
						}
						this.anInt893 = -1;
						return true;
					}
					@Pc(2074) boolean local2074;
					@Pc(2209) String local2209;
					if (this.anInt893 == 161) {
						local2058 = this.aClass4_Sub1_Sub3_6.method174();
						@Pc(2072) long local2072;
						if (local2058.endsWith(":tradereq:")) {
							local328 = local2058.substring(0, local2058.indexOf(":"));
							local2072 = Class46.method550(local328);
							local2074 = false;
							for (local1077 = 0; local1077 < this.anInt943; local1077++) {
								if (this.aLongArray3[local1077] == local2072) {
									local2074 = true;
									break;
								}
							}
							if (!local2074 && this.anInt1025 == 0) {
								this.method628(local328, 4, "wishes to trade with you.");
							}
						} else if (local2058.endsWith(":duelreq:")) {
							local328 = local2058.substring(0, local2058.indexOf(":"));
							local2072 = Class46.method550(local328);
							local2074 = false;
							for (local1077 = 0; local1077 < this.anInt943; local1077++) {
								if (this.aLongArray3[local1077] == local2072) {
									local2074 = true;
									break;
								}
							}
							if (!local2074 && this.anInt1025 == 0) {
								this.method628(local328, 8, "wishes to duel with you.");
							}
						} else if (local2058.endsWith(":chalreq:")) {
							local328 = local2058.substring(0, local2058.indexOf(":"));
							local2072 = Class46.method550(local328);
							local2074 = false;
							for (local1077 = 0; local1077 < this.anInt943; local1077++) {
								if (this.aLongArray3[local1077] == local2072) {
									local2074 = true;
									break;
								}
							}
							if (!local2074 && this.anInt1025 == 0) {
								local2209 = local2058.substring(local2058.indexOf(":") + 1, local2058.length() - 9);
								this.method628(local328, 8, local2209);
							}
						} else {
							this.method628("", 0, local2058);
						}
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 76) {
						local206 = this.aClass4_Sub1_Sub3_6.method193();
						if (local206 == 65535) {
							local206 = -1;
						}
						if (local206 != this.anInt958 && this.aBoolean268 && !aBoolean235 && this.anInt1023 == 0) {
							this.anInt1052 = local206;
							this.aBoolean274 = true;
							this.aClass10_Sub1_1.method133(2, this.anInt1052);
						}
						this.anInt958 = local206;
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 71) {
						local206 = this.aClass4_Sub1_Sub3_6.method199();
						local188 = this.aClass4_Sub1_Sub3_6.method193();
						if (this.aBoolean268 && !aBoolean235) {
							this.anInt1052 = local188;
							this.aBoolean274 = false;
							this.aClass10_Sub1_1.method133(2, this.anInt1052);
							this.anInt1023 = local206;
						}
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 238) {
						this.method669(this.aClass4_Sub1_Sub3_6, this.anInt892);
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 94) {
						local206 = this.aClass4_Sub1_Sub3_6.method193();
						local188 = this.aClass4_Sub1_Sub3_6.method187();
						if (local206 == 65535) {
							local206 = -1;
						}
						if (this.anIntArray253[local188] != local206) {
							this.method607(this.anIntArray253[local188]);
							this.anIntArray253[local188] = local206;
						}
						this.aBoolean251 = true;
						this.aBoolean244 = true;
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 20) {
						this.aBoolean251 = true;
						local206 = this.aClass4_Sub1_Sub3_6.method169();
						local1216 = Class27.method405(local206);
						while (this.aClass4_Sub1_Sub3_6.anInt242 < this.anInt892) {
							local260 = this.aClass4_Sub1_Sub3_6.method181();
							local491 = this.aClass4_Sub1_Sub3_6.method169();
							local1072 = this.aClass4_Sub1_Sub3_6.method167();
							if (local1072 == 255) {
								local1072 = this.aClass4_Sub1_Sub3_6.method172();
							}
							if (local260 >= 0 && local260 < local1216.anIntArray124.length) {
								local1216.anIntArray124[local260] = local491;
								local1216.anIntArray128[local260] = local1072;
							}
						}
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 171) {
						if (this.anInt854 == 12) {
							this.aBoolean251 = true;
						}
						this.anInt994 = this.aClass4_Sub1_Sub3_6.method167();
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 196) {
						this.anInt928 = this.aClass4_Sub1_Sub3_6.method167();
						if (this.anInt928 == 1) {
							this.anInt937 = this.aClass4_Sub1_Sub3_6.method169();
						}
						if (this.anInt928 >= 2 && this.anInt928 <= 6) {
							if (this.anInt928 == 2) {
								this.anInt950 = 64;
								this.anInt951 = 64;
							}
							if (this.anInt928 == 3) {
								this.anInt950 = 0;
								this.anInt951 = 64;
							}
							if (this.anInt928 == 4) {
								this.anInt950 = 128;
								this.anInt951 = 64;
							}
							if (this.anInt928 == 5) {
								this.anInt950 = 64;
								this.anInt951 = 0;
							}
							if (this.anInt928 == 6) {
								this.anInt950 = 64;
								this.anInt951 = 128;
							}
							this.anInt928 = 2;
							this.anInt947 = this.aClass4_Sub1_Sub3_6.method169();
							this.anInt948 = this.aClass4_Sub1_Sub3_6.method169();
							this.anInt949 = this.aClass4_Sub1_Sub3_6.method167();
						}
						if (this.anInt928 == 10) {
							this.anInt901 = this.aClass4_Sub1_Sub3_6.method169();
						}
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 141) {
						local206 = this.aClass4_Sub1_Sub3_6.method198();
						if (local206 != this.anInt1005) {
							this.method607(this.anInt1005);
							this.anInt1005 = local206;
						}
						this.aBoolean255 = true;
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 43) {
						this.anInt883 = this.aClass4_Sub1_Sub3_6.method167();
						this.anInt882 = this.aClass4_Sub1_Sub3_6.method186();
						for (local206 = this.anInt882; local206 < this.anInt882 + 8; local206++) {
							for (local188 = this.anInt883; local188 < this.anInt883 + 8; local188++) {
								if (this.aClass23ArrayArrayArray1[this.anInt965][local206][local188] != null) {
									this.aClass23ArrayArrayArray1[this.anInt965][local206][local188] = null;
									this.method588(local206, local188);
								}
							}
						}
						for (@Pc(2666) Class4_Sub3 local2666 = (Class4_Sub3) this.aClass23_10.method315(); local2666 != null; local2666 = (Class4_Sub3) this.aClass23_10.method317()) {
							if (local2666.anInt718 >= this.anInt882 && local2666.anInt718 < this.anInt882 + 8 && local2666.anInt719 >= this.anInt883 && local2666.anInt719 < this.anInt883 + 8 && local2666.anInt716 == this.anInt965) {
								local2666.anInt720 = 0;
							}
						}
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 == 11) {
						this.anInt1016 = this.aClass4_Sub1_Sub3_6.method185();
						this.anInt971 = this.aClass4_Sub1_Sub3_6.method169();
						this.anInt893 = -1;
						return true;
					}
					if (this.anInt893 != 83) {
						if (this.anInt893 == 131) {
							this.anInt927 = this.aClass4_Sub1_Sub3_6.method194();
							this.anInt989 = this.aClass4_Sub1_Sub3_6.method169();
							this.anInt853 = this.aClass4_Sub1_Sub3_6.method169();
							this.anInt884 = this.aClass4_Sub1_Sub3_6.method193();
							this.anInt860 = this.aClass4_Sub1_Sub3_6.method195();
							this.anInt880 = this.aClass4_Sub1_Sub3_6.method194();
							this.anInt862 = this.aClass4_Sub1_Sub3_6.method194();
							this.anInt1024 = this.aClass4_Sub1_Sub3_6.method203();
							this.anInt925 = this.aClass4_Sub1_Sub3_6.method193();
							this.anInt879 = this.aClass4_Sub1_Sub3_6.method169();
							this.anInt1047 = this.aClass4_Sub1_Sub3_6.method187();
							signlink.dnslookup(Class46.method553(this.anInt1024));
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 175 || this.anInt893 == 137) {
							local206 = this.anInt1057;
							local188 = this.anInt1058;
							if (this.anInt893 == 175) {
								local206 = this.aClass4_Sub1_Sub3_6.method194();
								local188 = this.aClass4_Sub1_Sub3_6.method193();
								this.aBoolean245 = false;
							}
							if (this.anInt893 == 137) {
								local188 = this.aClass4_Sub1_Sub3_6.method194();
								local206 = this.aClass4_Sub1_Sub3_6.method195();
								this.aClass4_Sub1_Sub3_6.method177();
								local260 = 0;
								while (true) {
									if (local260 >= 4) {
										this.aClass4_Sub1_Sub3_6.method179();
										this.aBoolean245 = true;
										break;
									}
									for (local491 = 0; local491 < 13; local491++) {
										for (local1072 = 0; local1072 < 13; local1072++) {
											local1077 = this.aClass4_Sub1_Sub3_6.method178(1);
											if (local1077 == 1) {
												this.anIntArrayArrayArray8[local260][local491][local1072] = this.aClass4_Sub1_Sub3_6.method178(26);
											} else {
												this.anIntArrayArrayArray8[local260][local491][local1072] = -1;
											}
										}
									}
									local260++;
								}
							}
							if (this.anInt1057 == local206 && this.anInt1058 == local188 && this.anInt874 == 2) {
								this.anInt893 = -1;
								return true;
							}
							this.anInt1057 = local206;
							this.anInt1058 = local188;
							this.anInt1036 = (this.anInt1057 - 6) * 8;
							this.anInt1037 = (this.anInt1058 - 6) * 8;
							this.aBoolean248 = false;
							if ((this.anInt1057 / 8 == 48 || this.anInt1057 / 8 == 49) && this.anInt1058 / 8 == 48) {
								this.aBoolean248 = true;
							}
							if (this.anInt1057 / 8 == 48 && this.anInt1058 / 8 == 148) {
								this.aBoolean248 = true;
							}
							this.anInt874 = 1;
							this.aLong29 = System.currentTimeMillis();
							this.method635("Loading - please wait.", null);
							if (this.anInt893 == 175) {
								local260 = 0;
								local491 = (this.anInt1057 - 6) / 8;
								label1193: while (true) {
									if (local491 > (this.anInt1057 + 6) / 8) {
										this.aByteArrayArray6 = new byte[local260][];
										this.aByteArrayArray5 = new byte[local260][];
										this.anIntArray244 = new int[local260];
										this.anIntArray245 = new int[local260];
										this.anIntArray246 = new int[local260];
										local260 = 0;
										local1072 = (this.anInt1057 - 6) / 8;
										while (true) {
											if (local1072 > (this.anInt1057 + 6) / 8) {
												break label1193;
											}
											for (local1077 = (this.anInt1058 - 6) / 8; local1077 <= (this.anInt1058 + 6) / 8; local1077++) {
												this.anIntArray244[local260] = (local1072 << 8) + local1077;
												if (this.aBoolean248 && (local1077 == 49 || local1077 == 149 || local1077 == 147 || local1072 == 50 || local1072 == 49 && local1077 == 47)) {
													this.anIntArray245[local260] = -1;
													this.anIntArray246[local260] = -1;
													local260++;
												} else {
													local1088 = this.anIntArray245[local260] = this.aClass10_Sub1_1.method132((byte) 9, 0, local1077, local1072);
													if (local1088 != -1) {
														this.aClass10_Sub1_1.method133(3, local1088);
													}
													local1434 = this.anIntArray246[local260] = this.aClass10_Sub1_1.method132((byte) 9, 1, local1077, local1072);
													if (local1434 != -1) {
														this.aClass10_Sub1_1.method133(3, local1434);
													}
													local260++;
												}
											}
											local1072++;
										}
									}
									for (local1072 = (this.anInt1058 - 6) / 8; local1072 <= (this.anInt1058 + 6) / 8; local1072++) {
										local260++;
									}
									local491++;
								}
							}
							if (this.anInt893 == 137) {
								local260 = 0;
								@Pc(3301) int[] local3301 = new int[676];
								local1072 = 0;
								label1152: while (true) {
									@Pc(3331) int local3331;
									@Pc(3337) int local3337;
									@Pc(3347) int local3347;
									if (local1072 >= 4) {
										this.aByteArrayArray6 = new byte[local260][];
										this.aByteArrayArray5 = new byte[local260][];
										this.anIntArray244 = new int[local260];
										this.anIntArray245 = new int[local260];
										this.anIntArray246 = new int[local260];
										local1077 = 0;
										while (true) {
											if (local1077 >= local260) {
												break label1152;
											}
											local1088 = this.anIntArray244[local1077] = local3301[local1077];
											local1434 = local1088 >> 8 & 0xFF;
											local3331 = local1088 & 0xFF;
											local3337 = this.anIntArray245[local1077] = this.aClass10_Sub1_1.method132((byte) 9, 0, local3331, local1434);
											if (local3337 != -1) {
												this.aClass10_Sub1_1.method133(3, local3337);
											}
											local3347 = this.anIntArray246[local1077] = this.aClass10_Sub1_1.method132((byte) 9, 1, local3331, local1434);
											if (local3347 != -1) {
												this.aClass10_Sub1_1.method133(3, local3347);
											}
											local1077++;
										}
									}
									for (local1077 = 0; local1077 < 13; local1077++) {
										for (local1088 = 0; local1088 < 13; local1088++) {
											local1434 = this.anIntArrayArrayArray8[local1072][local1077][local1088];
											if (local1434 != -1) {
												local3331 = local1434 >> 14 & 0x3FF;
												local3337 = local1434 >> 3 & 0x7FF;
												local3347 = (local3331 / 8 << 8) + local3337 / 8;
												for (@Pc(3349) int local3349 = 0; local3349 < local260; local3349++) {
													if (local3301[local3349] == local3347) {
														local3347 = -1;
														break;
													}
												}
												if (local3347 != -1) {
													local3301[local260++] = local3347;
												}
											}
										}
									}
									local1072++;
								}
							}
							local260 = this.anInt1036 - this.anInt1038;
							local491 = this.anInt1037 - this.anInt1039;
							this.anInt1038 = this.anInt1036;
							this.anInt1039 = this.anInt1037;
							for (local1072 = 0; local1072 < 16384; local1072++) {
								@Pc(3502) Class4_Sub1_Sub1_Sub1_Sub1 local3502 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local1072];
								if (local3502 != null) {
									for (local1088 = 0; local1088 < 10; local1088++) {
										local3502.anIntArray156[local1088] -= local260;
										local3502.anIntArray157[local1088] -= local491;
									}
									local3502.anInt648 -= local260 * 128;
									local3502.anInt649 -= local491 * 128;
								}
							}
							for (local1077 = 0; local1077 < this.anInt907; local1077++) {
								@Pc(3557) Class4_Sub1_Sub1_Sub1_Sub2 local3557 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local1077];
								if (local3557 != null) {
									for (local1434 = 0; local1434 < 10; local1434++) {
										local3557.anIntArray156[local1434] -= local260;
										local3557.anIntArray157[local1434] -= local491;
									}
									local3557.anInt648 -= local260 * 128;
									local3557.anInt649 -= local491 * 128;
								}
							}
							this.aBoolean275 = true;
							@Pc(3609) byte local3609 = 0;
							@Pc(3611) byte local3611 = 104;
							@Pc(3613) byte local3613 = 1;
							if (local260 < 0) {
								local3609 = 103;
								local3611 = -1;
								local3613 = -1;
							}
							@Pc(3623) byte local3623 = 0;
							@Pc(3625) byte local3625 = 104;
							@Pc(3627) byte local3627 = 1;
							if (local491 < 0) {
								local3623 = 103;
								local3625 = -1;
								local3627 = -1;
							}
							for (@Pc(3637) int local3637 = local3609; local3637 != local3611; local3637 += local3613) {
								for (@Pc(3641) int local3641 = local3623; local3641 != local3625; local3641 += local3627) {
									@Pc(3647) int local3647 = local3637 + local260;
									@Pc(3651) int local3651 = local3641 + local491;
									for (@Pc(3653) int local3653 = 0; local3653 < 4; local3653++) {
										if (local3647 >= 0 && local3651 >= 0 && local3647 < 104 && local3651 < 104) {
											this.aClass23ArrayArrayArray1[local3653][local3637][local3641] = this.aClass23ArrayArrayArray1[local3653][local3647][local3651];
										} else {
											this.aClass23ArrayArrayArray1[local3653][local3637][local3641] = null;
										}
									}
								}
							}
							for (@Pc(3715) Class4_Sub3 local3715 = (Class4_Sub3) this.aClass23_10.method315(); local3715 != null; local3715 = (Class4_Sub3) this.aClass23_10.method317()) {
								local3715.anInt718 -= local260;
								local3715.anInt719 -= local491;
								if (local3715.anInt718 < 0 || local3715.anInt719 < 0 || local3715.anInt718 >= 104 || local3715.anInt719 >= 104) {
									local3715.method528();
								}
							}
							if (this.anInt1053 != 0) {
								this.anInt1053 -= local260;
								this.anInt1054 -= local491;
							}
							this.aBoolean261 = false;
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 150) {
							local206 = this.aClass4_Sub1_Sub3_6.method194();
							local188 = this.aClass4_Sub1_Sub3_6.method193();
							local260 = this.aClass4_Sub1_Sub3_6.method193();
							if (local260 == 65535) {
								Class27.method405(local188).anInt459 = 0;
								this.anInt893 = -1;
								return true;
							}
							@Pc(3810) Class44 local3810 = Class44.method536(local260);
							Class27.method405(local188).anInt459 = 4;
							Class27.method405(local188).anInt460 = local260;
							Class27.method405(local188).anInt467 = local3810.anInt802;
							Class27.method405(local188).anInt468 = local3810.anInt792;
							Class27.method405(local188).anInt466 = local3810.anInt775 * 100 / local206;
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 73) {
							local206 = this.aClass4_Sub1_Sub3_6.method194();
							Class27.method405(local206).anInt459 = 3;
							if (aClass4_Sub1_Sub1_Sub1_Sub2_1.aClass2_2 == null) {
								Class27.method405(local206).anInt460 = (aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray162[0] << 25) + (aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray162[4] << 20) + (aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray161[0] << 15) + (aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray161[8] << 10) + (aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray161[11] << 5) + aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray161[1];
							} else {
								Class27.method405(local206).anInt460 = (int) (aClass4_Sub1_Sub1_Sub1_Sub2_1.aClass2_2.aLong1 + 305419896L);
							}
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 224) {
							this.anInt976 = this.aClass4_Sub1_Sub3_6.method167();
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 172) {
							this.anInt943 = this.anInt892 / 8;
							for (local206 = 0; local206 < this.anInt943; local206++) {
								this.aLongArray3[local206] = this.aClass4_Sub1_Sub3_6.method173();
							}
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 128) {
							local206 = this.aClass4_Sub1_Sub3_6.method195();
							local188 = this.aClass4_Sub1_Sub3_6.method195();
							local260 = this.aClass4_Sub1_Sub3_6.method169();
							Class27.method405(local206).anInt470 = (local260 << 16) + local188;
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 241) {
							for (local206 = 0; local206 < this.anIntArray212.length; local206++) {
								if (this.anIntArray212[local206] != this.anIntArray248[local206]) {
									this.anIntArray212[local206] = this.anIntArray248[local206];
									this.method642(local206);
									this.aBoolean251 = true;
								}
							}
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 220) {
							this.anInt1019 = this.aClass4_Sub1_Sub3_6.method167();
							this.anInt966 = this.aClass4_Sub1_Sub3_6.method167();
							this.anInt970 = this.aClass4_Sub1_Sub3_6.method167();
							this.aBoolean273 = true;
							this.aBoolean255 = true;
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 19) {
							for (local206 = 0; local206 < this.aClass4_Sub1_Sub1_Sub1_Sub2Array1.length; local206++) {
								if (this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local206] != null) {
									this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local206].anInt626 = -1;
								}
							}
							for (local188 = 0; local188 < this.aClass4_Sub1_Sub1_Sub1_Sub1Array1.length; local188++) {
								if (this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local188] != null) {
									this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local188].anInt626 = -1;
								}
							}
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 117) {
							this.anInt1056 = this.aClass4_Sub1_Sub3_6.method195() * 30;
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 93) {
							local1287 = this.aClass4_Sub1_Sub3_6.method173();
							local260 = this.aClass4_Sub1_Sub3_6.method172();
							local491 = this.aClass4_Sub1_Sub3_6.method167();
							local2074 = false;
							for (local1077 = 0; local1077 < 100; local1077++) {
								if (this.anIntArray242[local1077] == local260) {
									local2074 = true;
									break;
								}
							}
							if (local491 <= 1) {
								for (local1088 = 0; local1088 < this.anInt943; local1088++) {
									if (this.aLongArray3[local1088] == local1287) {
										local2074 = true;
										break;
									}
								}
							}
							if (!local2074 && this.anInt1025 == 0) {
								try {
									this.anIntArray242[this.anInt977] = local260;
									this.anInt977 = (this.anInt977 + 1) % 100;
									local2209 = Class49.method564(this.anInt892 - 13, this.aClass4_Sub1_Sub3_6);
									if (local491 != 3) {
										local2209 = Class9.method98(local2209);
									}
									if (local491 == 2 || local491 == 3) {
										this.method628("@cr2@" + Class46.method554(Class46.method551(local1287)), 7, local2209);
									} else if (local491 == 1) {
										this.method628("@cr1@" + Class46.method554(Class46.method551(local1287)), 7, local2209);
									} else {
										this.method628(Class46.method554(Class46.method551(local1287)), 3, local2209);
									}
								} catch (@Pc(4286) Exception local4286) {
									signlink.reporterror("cde1");
								}
							}
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 91) {
							local206 = this.aClass4_Sub1_Sub3_6.method193();
							local188 = this.aClass4_Sub1_Sub3_6.method194();
							if (this.anInt935 != -1) {
								this.method607(this.anInt935);
								this.anInt935 = -1;
								this.aBoolean255 = true;
							}
							if (this.anInt990 != -1) {
								this.method607(this.anInt990);
								this.anInt990 = -1;
								this.aBoolean242 = true;
							}
							if (this.anInt978 != -1) {
								this.method607(this.anInt978);
								this.anInt978 = -1;
							}
							if (this.anInt906 != local206) {
								this.method607(this.anInt906);
								this.anInt906 = local206;
							}
							if (this.anInt959 != local188) {
								this.method607(this.anInt959);
								this.anInt959 = local188;
							}
							if (this.anInt1020 != 0) {
								this.anInt1020 = 0;
								this.aBoolean255 = true;
							}
							this.aBoolean251 = true;
							this.aBoolean244 = true;
							this.aBoolean233 = false;
							this.anInt893 = -1;
							return true;
						}
						if (this.anInt893 == 228) {
							local206 = this.aClass4_Sub1_Sub3_6.method167();
							local188 = this.aClass4_Sub1_Sub3_6.method167();
							local260 = this.aClass4_Sub1_Sub3_6.method167();
							local491 = this.aClass4_Sub1_Sub3_6.method167();
							this.aBooleanArray11[local206] = true;
							this.anIntArray243[local206] = local188;
							this.anIntArray238[local206] = local260;
							this.anIntArray270[local206] = local491;
							this.anIntArray241[local206] = 0;
							this.anInt893 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt893 + "," + this.anInt892 + " - " + this.anInt877 + "," + this.anInt878);
						this.method634();
						return true;
					}
					local206 = this.aClass4_Sub1_Sub3_6.method194();
					this.method676(local206);
					if (this.anInt959 != -1) {
						this.method607(this.anInt959);
						this.anInt959 = -1;
						this.aBoolean251 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt990 != -1) {
						this.method607(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean242 = true;
					}
					if (this.anInt978 != -1) {
						this.method607(this.anInt978);
						this.anInt978 = -1;
					}
					if (this.anInt906 != -1) {
						this.method607(this.anInt906);
						this.anInt906 = -1;
					}
					if (this.anInt935 != local206) {
						this.method607(this.anInt935);
						this.anInt935 = local206;
					}
					this.aBoolean233 = false;
					this.aBoolean255 = true;
					this.anInt893 = -1;
					return true;
				}
				this.method654(this.anInt893, this.aClass4_Sub1_Sub3_6);
				this.anInt893 = -1;
				return true;
			} catch (@Pc(4476) IOException local4476) {
				this.method647();
			} catch (@Pc(4481) Exception local4481) {
				local2058 = "T2 - " + this.anInt893 + "," + this.anInt877 + "," + this.anInt878 + " - " + this.anInt892 + "," + (this.anInt1036 + aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0]) + "," + (this.anInt1037 + aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0]) + " - ";
				for (local188 = 0; local188 < this.anInt892 && local188 < 50; local188++) {
					local2058 = local2058 + this.aClass4_Sub1_Sub3_6.aByteArray7[local188] + ",";
				}
				signlink.reporterror(local2058);
				this.method634();
			}
			return true;
		} catch (@Pc(4562) RuntimeException local4562) {
			signlink.reporterror("55363, " + true + ", " + local4562.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method641(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt943; local18++) {
					if (this.aLongArray3[local18] == arg0) {
						this.anInt943--;
						this.aBoolean251 = true;
						for (@Pc(38) int local38 = local18; local38 < this.anInt943; local38++) {
							this.aLongArray3[local38] = this.aLongArray3[local38 + 1];
						}
						this.aClass4_Sub1_Sub3_9.method156(61);
						this.aClass4_Sub1_Sub3_9.method163(arg0);
						return;
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("5709, " + -33 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method642(@OriginalArg(1) int arg0) {
		try {
			@Pc(9) int local9 = Class17.aClass17Array1[arg0].anInt291;
			if (local9 != 0) {
				@Pc(17) int local17 = this.anIntArray212[arg0];
				if (local9 == 1) {
					if (local17 == 1) {
						Class4_Sub1_Sub2_Sub3.method457(0.9D);
					}
					if (local17 == 2) {
						Class4_Sub1_Sub2_Sub3.method457(0.8D);
					}
					if (local17 == 3) {
						Class4_Sub1_Sub2_Sub3.method457(0.7D);
					}
					if (local17 == 4) {
						Class4_Sub1_Sub2_Sub3.method457(0.6D);
					}
					Class44.aClass1_8.method3();
					this.aBoolean242 = true;
				}
				if (local9 == 3) {
					@Pc(55) boolean local55 = this.aBoolean268;
					if (local17 == 0) {
						this.method629(this.aBoolean268, 0);
						this.aBoolean268 = true;
					}
					if (local17 == 1) {
						this.method629(this.aBoolean268, -400);
						this.aBoolean268 = true;
					}
					if (local17 == 2) {
						this.method629(this.aBoolean268, -800);
						this.aBoolean268 = true;
					}
					if (local17 == 3) {
						this.method629(this.aBoolean268, -1200);
						this.aBoolean268 = true;
					}
					if (local17 == 4) {
						this.aBoolean268 = false;
					}
					if (this.aBoolean268 != local55 && !aBoolean235) {
						if (this.aBoolean268) {
							this.anInt1052 = this.anInt958;
							this.aBoolean274 = true;
							this.aClass10_Sub1_1.method133(2, this.anInt1052);
						} else {
							this.method695(177);
						}
						this.anInt1023 = 0;
					}
				}
				if (local9 == 4) {
					if (local17 == 0) {
						this.aBoolean246 = true;
						this.method622(0);
					}
					if (local17 == 1) {
						this.aBoolean246 = true;
						this.method622(-400);
					}
					if (local17 == 2) {
						this.aBoolean246 = true;
						this.method622(-800);
					}
					if (local17 == 3) {
						this.aBoolean246 = true;
						this.method622(-1200);
					}
					if (local17 == 4) {
						this.aBoolean246 = false;
					}
				}
				if (local9 == 5) {
					this.anInt902 = local17;
				}
				if (local9 == 6) {
					this.anInt872 = local17;
				}
				if (local9 == 8) {
					this.anInt936 = local17;
					this.aBoolean255 = true;
				}
				if (local9 == 9) {
					this.anInt858 = local17;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("71801, " + false + ", " + arg0 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method643() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt909; local3++) {
				if (local3 == -1) {
					local11 = this.anInt908;
				} else {
					local11 = this.anIntArray228[local3];
				}
				@Pc(23) Class4_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt641 > 0) {
					local23.anInt641--;
					if (local23.anInt641 == 0) {
						local23.aString14 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt1009; local11++) {
				@Pc(64) int local64 = this.anIntArray262[local11];
				@Pc(69) Class4_Sub1_Sub1_Sub1_Sub1 local69 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local64];
				if (local69 != null && local69.anInt641 > 0) {
					local69.anInt641--;
					if (local69.anInt641 == 0) {
						local69.aString14 = null;
					}
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("76894, " + 6 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method644() {
		try {
			if (this.anInt936 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt1056 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray12[local12] != null) {
						@Pc(24) int local24 = this.anIntArray269[local12];
						@Pc(29) String local29 = this.aStringArray11[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt966 == 0 || this.anInt966 == 1 && this.method645(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt826 > 4 && super.anInt827 - 4 > local82 - 10 && super.anInt827 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass4_Sub1_Sub2_Sub4_3.method497("From:  " + local29 + this.aStringArray12[local12], 555) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt826 < local121 + 4) {
									if (this.anInt933 >= 1) {
										this.aStringArray10[this.anInt1049] = "Report abuse @whi@" + local29;
										this.anIntArray232[this.anInt1049] = 2440;
										this.anInt1049++;
									}
									this.aStringArray10[this.anInt1049] = "Add ignore @whi@" + local29;
									this.anIntArray232[this.anInt1049] = 2539;
									this.anInt1049++;
									this.aStringArray10[this.anInt1049] = "Add friend @whi@" + local29;
									this.anIntArray232[this.anInt1049] = 2342;
									this.anInt1049++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt966 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				this.aBoolean272 &= true;
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("25138, " + true + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method645(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(13) int local13 = 0; local13 < this.anInt890; local13++) {
				if (arg0.equalsIgnoreCase(this.aStringArray13[local13])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass4_Sub1_Sub1_Sub1_Sub2_1.aString15);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("36388, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	@Override
	protected void method585(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt859 = arg1;
			this.aString22 = arg0;
			this.method651();
			if (this.aClass38_2 == null) {
				super.method585(arg0, arg1);
			} else {
				this.aClass47_21.method556();
				this.aClass4_Sub1_Sub2_Sub4_4.method495(16777215, 54, 180, "RuneScape is loading - please wait...");
				Class4_Sub1_Sub2.method488(304, 34, this.anInt914, 9179409, 28, 62);
				Class4_Sub1_Sub2.method488(302, 32, this.anInt914, 0, 29, 63);
				Class4_Sub1_Sub2.method487(64, arg1 * 3, 30, 30, 9179409);
				Class4_Sub1_Sub2.method487(64, 300 - arg1 * 3, 30, arg1 * 3 + 30, 0);
				this.aClass4_Sub1_Sub2_Sub4_4.method495(16777215, 85, 180, arg0);
				this.aClass47_21.method557(202, 171, super.aGraphics2);
				if (this.aBoolean242) {
					this.aBoolean242 = false;
					if (!this.aBoolean249) {
						this.aClass47_22.method557(0, 0, super.aGraphics2);
						this.aClass47_23.method557(637, 0, super.aGraphics2);
					}
					this.aClass47_19.method557(128, 0, super.aGraphics2);
					this.aClass47_20.method557(202, 371, super.aGraphics2);
					this.aClass47_24.method557(0, 265, super.aGraphics2);
					this.aClass47_25.method557(562, 265, super.aGraphics2);
					this.aClass47_26.method557(128, 171, super.aGraphics2);
					this.aClass47_27.method557(562, 171, super.aGraphics2);
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("52143, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method646(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.method651();
			this.aClass47_21.method556();
			this.aClass4_Sub1_Sub2_Sub1_19.method86(0, 0);
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt900 == 0) {
				this.aClass4_Sub1_Sub2_Sub4_2.method496(180, 7711145, 180, true, this.aClass10_Sub1_1.aString4);
				local48 = 80;
				this.aClass4_Sub1_Sub2_Sub4_4.method496(80, 16776960, 180, true, "Welcome to RuneScape");
				local60 = local48 + 30;
				this.aClass4_Sub1_Sub2_Sub1_20.method86(100, 27);
				this.aClass4_Sub1_Sub2_Sub4_4.method496(125, 16777215, 100, true, "New User");
				this.aClass4_Sub1_Sub2_Sub1_20.method86(100, 187);
				this.aClass4_Sub1_Sub2_Sub4_4.method496(125, 16777215, 260, true, "Existing User");
			}
			if (this.anInt900 == 2) {
				local48 = 60;
				if (this.aString19.length() > 0) {
					this.aClass4_Sub1_Sub2_Sub4_4.method496(45, 16776960, 180, true, this.aString19);
					this.aClass4_Sub1_Sub2_Sub4_4.method496(60, 16776960, 180, true, this.aString20);
					local60 = local48 + 30;
				} else {
					this.aClass4_Sub1_Sub2_Sub4_4.method496(53, 16776960, 180, true, this.aString20);
					local60 = local48 + 30;
				}
				this.aClass4_Sub1_Sub2_Sub4_4.method503("Username: " + this.aString17 + (this.anInt861 == 0 & anInt866 % 40 < 20 ? "@yel@|" : ""), 16777215, 90, 90, true);
				local60 += 15;
				this.aClass4_Sub1_Sub2_Sub4_4.method503("Password: " + Class46.method555(this.aString18) + (this.anInt861 == 1 & anInt866 % 40 < 20 ? "@yel@|" : ""), 16777215, 105, 92, true);
				local60 += 15;
				if (!arg0) {
					this.aClass4_Sub1_Sub2_Sub1_20.method86(130, 27);
					this.aClass4_Sub1_Sub2_Sub4_4.method496(155, 16777215, 100, true, "Login");
					this.aClass4_Sub1_Sub2_Sub1_20.method86(130, 187);
					this.aClass4_Sub1_Sub2_Sub4_4.method496(155, 16777215, 260, true, "Cancel");
				}
			}
			if (this.anInt900 == 3) {
				this.aClass4_Sub1_Sub2_Sub4_4.method496(40, 16776960, 180, true, "Create a free account");
				local48 = 65;
				this.aClass4_Sub1_Sub2_Sub4_4.method496(65, 16777215, 180, true, "To create a new account you need to");
				local60 = local48 + 15;
				this.aClass4_Sub1_Sub2_Sub4_4.method496(80, 16777215, 180, true, "go back to the main RuneScape webpage");
				local60 += 15;
				this.aClass4_Sub1_Sub2_Sub4_4.method496(95, 16777215, 180, true, "and choose the 'create account'");
				local60 += 15;
				this.aClass4_Sub1_Sub2_Sub4_4.method496(110, 16777215, 180, true, "button near the top of that page.");
				local60 += 15;
				this.aClass4_Sub1_Sub2_Sub1_20.method86(130, 107);
				this.aClass4_Sub1_Sub2_Sub4_4.method496(155, 16777215, 180, true, "Cancel");
			}
			this.aClass47_21.method557(202, 171, super.aGraphics2);
			if (this.aBoolean242) {
				this.aBoolean242 = false;
				this.aClass47_19.method557(128, 0, super.aGraphics2);
				this.aClass47_20.method557(202, 371, super.aGraphics2);
				this.aClass47_24.method557(0, 265, super.aGraphics2);
				this.aClass47_25.method557(562, 265, super.aGraphics2);
				this.aClass47_26.method557(128, 171, super.aGraphics2);
				this.aClass47_27.method557(562, 171, super.aGraphics2);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("79441, " + arg0 + ", " + arg1 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method647() {
		try {
			if (this.anInt896 > 0) {
				this.method634();
			} else {
				this.method635("Connection lost", "Please wait - attempting to reestablish");
				this.anInt976 = 0;
				this.anInt1053 = 0;
				if (this.aByte29 == -40) {
					@Pc(25) Class40 local25 = this.aClass40_1;
					this.aBoolean272 = false;
					this.anInt972 = 0;
					this.method705(this.aString17, this.aString18, true);
					if (!this.aBoolean272) {
						this.method634();
					}
					try {
						local25.method515();
					} catch (@Pc(48) Exception local48) {
					}
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("53894, " + -40 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EGCCHUZS;ILclient!QAJCAYDZ;II)V")
	private void method648(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(13) int local13;
			@Pc(16) int local16;
			if ((arg4 & 0x400) != 0) {
				local13 = arg0.method186();
				local16 = arg0.method167();
				arg2.method472(anInt866, local16, local13);
				arg2.anInt636 = anInt866 + 300;
				arg2.anInt637 = arg0.method185();
				arg2.anInt638 = arg0.method187();
			}
			if ((arg4 & 0x10) != 0) {
				local13 = arg0.method185();
				@Pc(48) byte[] local48 = new byte[local13];
				@Pc(54) Class4_Sub1_Sub3 local54 = new Class4_Sub1_Sub3(local48, false);
				arg0.method204(local48, local13);
				this.aClass4_Sub1_Sub3Array1[arg3] = local54;
				arg2.method476(local54, 352);
			}
			if ((arg4 & 0x2) != 0) {
				arg2.anInt660 = arg0.method194();
				arg2.anInt661 = arg0.method193();
			}
			if ((arg4 & 0x4) != 0) {
				local13 = arg0.method185();
				local16 = arg0.method167();
				arg2.method472(anInt866, local16, local13);
				arg2.anInt636 = anInt866 + 300;
				arg2.anInt637 = arg0.method187();
				arg2.anInt638 = arg0.method187();
			}
			@Pc(130) int local130;
			if ((arg4 & 0x1) != 0) {
				local13 = arg0.method169();
				local16 = arg0.method187();
				local130 = arg0.method187();
				@Pc(133) int local133 = arg0.anInt242;
				if (arg2.aString15 != null && arg2.aBoolean177) {
					@Pc(143) long local143 = Class46.method550(arg2.aString15);
					@Pc(145) boolean local145 = false;
					if (local16 <= 1) {
						for (@Pc(150) int local150 = 0; local150 < this.anInt943; local150++) {
							if (this.aLongArray3[local150] == local143) {
								local145 = true;
								break;
							}
						}
					}
					if (!local145 && this.anInt1025 == 0) {
						try {
							this.aClass4_Sub1_Sub3_8.anInt242 = 0;
							arg0.method176(local130, this.aClass4_Sub1_Sub3_8.aByteArray7);
							this.aClass4_Sub1_Sub3_8.anInt242 = 0;
							@Pc(195) String local195 = Class49.method564(local130, this.aClass4_Sub1_Sub3_8);
							@Pc(199) String local199 = Class9.method98(local195);
							arg2.aString14 = local199;
							arg2.anInt662 = local13 >> 8;
							arg2.anInt663 = local13 & 0xFF;
							arg2.anInt641 = 150;
							if (local16 == 2 || local16 == 3) {
								this.method628("@cr2@" + arg2.aString15, 1, local199);
							} else if (local16 == 1) {
								this.method628("@cr1@" + arg2.aString15, 1, local199);
							} else {
								this.method628(arg2.aString15, 2, local199);
							}
						} catch (@Pc(263) Exception local263) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt242 = local133 + local130;
			}
			if ((arg4 & 0x40) != 0) {
				arg2.aString14 = arg0.method174();
				if (arg2.aString14.charAt(0) == '~') {
					arg2.aString14 = arg2.aString14.substring(1);
					this.method628(arg2.aString15, 2, arg2.aString14);
				} else if (arg2 == aClass4_Sub1_Sub1_Sub1_Sub2_1) {
					this.method628(arg2.aString15, 2, arg2.aString14);
				}
				arg2.anInt662 = 0;
				arg2.anInt663 = 0;
				arg2.anInt641 = 150;
			}
			if ((arg4 & 0x200) != 0) {
				arg2.anInt651 = arg0.method187();
				arg2.anInt653 = arg0.method187();
				arg2.anInt652 = arg0.method167();
				arg2.anInt654 = arg0.method185();
				arg2.anInt655 = arg0.method194() + anInt866;
				arg2.anInt656 = arg0.method194() + anInt866;
				arg2.anInt657 = arg0.method187();
				arg2.method471();
			}
			if ((arg4 & 0x80) != 0) {
				local13 = arg0.method169();
				if (local13 == 65535) {
					local13 = -1;
				}
				local16 = arg0.method167();
				if (local13 == arg2.anInt626 && local13 != -1) {
					local130 = Class5.aClass5Array1[local13].anInt47;
					if (local130 == 1) {
						arg2.anInt627 = 0;
						arg2.anInt628 = 0;
						arg2.anInt629 = local16;
						arg2.anInt630 = 0;
					}
					if (local130 == 2) {
						arg2.anInt630 = 0;
					}
				} else if (local13 == -1 || arg2.anInt626 == -1 || Class5.aClass5Array1[local13].anInt41 >= Class5.aClass5Array1[arg2.anInt626].anInt41) {
					arg2.anInt626 = local13;
					arg2.anInt627 = 0;
					arg2.anInt628 = 0;
					arg2.anInt629 = local16;
					arg2.anInt630 = 0;
					arg2.anInt625 = arg2.anInt631;
				}
			}
			if ((arg4 & 0x100) != 0) {
				arg2.anInt669 = arg0.method193();
				local13 = arg0.method201();
				arg2.anInt673 = local13 >> 16;
				arg2.anInt672 = anInt866 + (local13 & 0xFFFF);
				arg2.anInt670 = 0;
				arg2.anInt671 = 0;
				if (arg2.anInt672 > anInt866) {
					arg2.anInt670 = -1;
				}
				if (arg2.anInt669 == 65535) {
					arg2.anInt669 = -1;
				}
			}
			if ((arg4 & 0x8) != 0) {
				arg2.anInt658 = arg0.method193();
				if (arg2.anInt658 == 65535) {
					arg2.anInt658 = -1;
					return;
				}
			}
		} catch (@Pc(515) RuntimeException local515) {
			signlink.reporterror("98052, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local515.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(23) int local23 = this.aClass25_1.method372(this.anInt965, arg0, arg1, arg2);
			if (local23 == -1) {
				return false;
			}
			@Pc(32) int local32 = local23 & 0x1F;
			@Pc(38) int local38 = local23 >> 6 & 0x3;
			if (local32 == 10 || local32 == 11 || local32 == 22) {
				@Pc(50) Class20 local50 = Class20.method236(local7);
				@Pc(58) int local58;
				@Pc(61) int local61;
				if (local38 == 0 || local38 == 2) {
					local58 = local50.anInt319;
					local61 = local50.anInt310;
				} else {
					local58 = local50.anInt310;
					local61 = local50.anInt319;
				}
				@Pc(72) int local72 = local50.anInt315;
				if (local38 != 0) {
					local72 = (local72 << local38 & 0xF) + (local72 >> 4 - local38);
				}
				this.method690(false, 0, local61, arg0, arg1, local58, local72, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
			} else {
				this.method690(false, local38, 0, arg0, arg1, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], local32 + 1);
			}
			this.anInt939 = super.anInt832;
			this.anInt940 = super.anInt833;
			this.anInt942 = 2;
			this.anInt941 = 0;
			return true;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("47198, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method650(@OriginalArg(0) String arg0) {
		System.out.println(arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch (@Pc(21) Exception local21) {
			local21.printStackTrace();
		}
		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(28) Exception local28) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method651() {
		try {
			if (this.aClass47_19 == null) {
				super.aClass47_2 = null;
				this.aClass47_18 = null;
				this.aClass47_16 = null;
				this.aClass47_15 = null;
				this.aClass47_17 = null;
				this.aClass47_12 = null;
				this.aClass47_13 = null;
				this.aClass47_14 = null;
				this.aClass47_22 = new Class47(this.method583(anInt1042), true, 128, 265);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_23 = new Class47(this.method583(anInt1042), true, 128, 265);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_19 = new Class47(this.method583(anInt1042), true, 509, 171);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_20 = new Class47(this.method583(anInt1042), true, 360, 132);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_21 = new Class47(this.method583(anInt1042), true, 360, 200);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_24 = new Class47(this.method583(anInt1042), true, 202, 238);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_25 = new Class47(this.method583(anInt1042), true, 203, 238);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_26 = new Class47(this.method583(anInt1042), true, 74, 94);
				Class4_Sub1_Sub2.method485((byte) 6);
				this.aClass47_27 = new Class47(this.method583(anInt1042), true, 75, 94);
				Class4_Sub1_Sub2.method485((byte) 6);
				if (this.aClass38_2 != null) {
					this.method702();
					this.method673();
				}
				this.aBoolean242 = true;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("19104, " + false + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method652(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean263) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method602(43595);
			this.aSocket3.setSoTimeout(10000);
			@Pc(42) InputStream local42 = this.aSocket3.getInputStream();
			@Pc(46) OutputStream local46 = this.aSocket3.getOutputStream();
			local46.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(local42);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method653() {
		try {
			if (this.anInt976 == 0 && super.anInt831 == 1) {
				@Pc(19) int local19 = super.anInt832 - 25 - 550;
				@Pc(26) int local26 = super.anInt833 - 5 - 4;
				if (local19 >= 0 && local26 >= 0 && local19 < 146 && local26 < 151) {
					local19 -= 73;
					local26 -= 75;
					@Pc(46) int local46 = this.anInt1012 + this.anInt842 & 0x7FF;
					@Pc(50) int local50 = Class4_Sub1_Sub2_Sub3.anIntArray144[local46];
					@Pc(54) int local54 = Class4_Sub1_Sub2_Sub3.anIntArray145[local46];
					@Pc(63) int local63 = local50 * (this.anInt867 + 256) >> 8;
					@Pc(72) int local72 = local54 * (this.anInt867 + 256) >> 8;
					@Pc(82) int local82 = local26 * local63 + local19 * local72 >> 11;
					@Pc(92) int local92 = local26 * local72 - local19 * local63 >> 11;
					@Pc(99) int local99 = aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 + local82 >> 7;
					@Pc(106) int local106 = aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 - local92 >> 7;
					@Pc(127) boolean local127 = this.method690(true, 0, 0, local99, local106, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 1, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
					if (local127) {
						this.aClass4_Sub1_Sub3_9.method157(local19);
						this.aClass4_Sub1_Sub3_9.method157(local26);
						this.aClass4_Sub1_Sub3_9.method158(this.anInt1012);
						this.aClass4_Sub1_Sub3_9.method157(57);
						this.aClass4_Sub1_Sub3_9.method157(this.anInt842);
						this.aClass4_Sub1_Sub3_9.method157(this.anInt867);
						this.aClass4_Sub1_Sub3_9.method157(89);
						this.aClass4_Sub1_Sub3_9.method158(aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648);
						this.aClass4_Sub1_Sub3_9.method158(aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649);
						this.aClass4_Sub1_Sub3_9.method157(this.anInt1031);
						this.aClass4_Sub1_Sub3_9.method157(63);
						return;
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("95289, " + true + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!EGCCHUZS;)V")
	private void method654(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
		try {
			@Pc(28) int local28;
			@Pc(37) int local37;
			@Pc(44) int local44;
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(55) int local55;
			@Pc(58) int local58;
			@Pc(61) int local61;
			@Pc(65) int local65;
			@Pc(69) int local69;
			if (arg0 == 3) {
				@Pc(13) byte local13 = arg1.method189();
				@Pc(17) byte local17 = arg1.method189();
				@Pc(20) byte local20 = arg1.method168();
				@Pc(24) byte local24 = arg1.method189();
				local28 = arg1.method186();
				local37 = this.anInt882 + (local28 >> 4 & 0x7);
				local44 = this.anInt883 + (local28 & 0x7);
				local48 = arg1.method195();
				local52 = arg1.method195();
				local55 = arg1.method169();
				local58 = arg1.method169();
				local61 = arg1.method167();
				local65 = local61 >> 2;
				local69 = local61 & 0x3;
				@Pc(74) int local74 = this.anIntArray236[local65];
				@Pc(80) Class4_Sub1_Sub1_Sub1_Sub2 local80;
				if (local48 == this.anInt971) {
					local80 = aClass4_Sub1_Sub1_Sub1_Sub2_1;
				} else {
					local80 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local48];
				}
				if (local80 != null) {
					@Pc(92) Class20 local92 = Class20.method236(local52);
					@Pc(102) int local102 = this.anIntArrayArrayArray7[this.anInt965][local37][local44];
					@Pc(114) int local114 = this.anIntArrayArrayArray7[this.anInt965][local37 + 1][local44];
					@Pc(128) int local128 = this.anIntArrayArrayArray7[this.anInt965][local37 + 1][local44 + 1];
					@Pc(140) int local140 = this.anIntArrayArrayArray7[this.anInt965][local37][local44 + 1];
					@Pc(150) Class4_Sub1_Sub1_Sub3 local150 = local92.method231(local65, local69, local102, local114, local128, local140, -1);
					if (local150 != null) {
						this.method715(local44, 0, -1, local74, 0, local37, 594, local58 + 1, this.anInt965, local55 + 1);
						local80.anInt681 = local55 + anInt866;
						local80.anInt682 = local58 + anInt866;
						local80.aClass4_Sub1_Sub1_Sub3_2 = local150;
						@Pc(185) int local185 = local92.anInt319;
						@Pc(188) int local188 = local92.anInt310;
						if (local69 == 1 || local69 == 3) {
							local185 = local92.anInt310;
							local188 = local92.anInt319;
						}
						local80.anInt683 = local37 * 128 + local185 * 64;
						local80.anInt685 = local44 * 128 + local188 * 64;
						local80.anInt684 = this.method699(local80.anInt683, local80.anInt685, this.anInt965);
						@Pc(234) byte local234;
						if (local17 > local24) {
							local234 = local17;
							local17 = local24;
							local24 = local234;
						}
						if (local13 > local20) {
							local234 = local13;
							local13 = local20;
							local20 = local234;
						}
						local80.anInt674 = local37 + local17;
						local80.anInt676 = local37 + local24;
						local80.anInt675 = local44 + local13;
						local80.anInt677 = local44 + local20;
					}
				}
			}
			@Pc(274) int local274;
			@Pc(278) int local278;
			@Pc(282) int local282;
			@Pc(287) int local287;
			if (arg0 == 246) {
				local274 = arg1.method186();
				local278 = local274 >> 2;
				local282 = local274 & 0x3;
				local287 = this.anIntArray236[local278];
				local28 = arg1.method193();
				local37 = arg1.method187();
				local44 = this.anInt882 + (local37 >> 4 & 0x7);
				local48 = this.anInt883 + (local37 & 0x7);
				if (local44 >= 0 && local48 >= 0 && local44 < 103 && local48 < 103) {
					local52 = this.anIntArrayArrayArray7[this.anInt965][local44][local48];
					local55 = this.anIntArrayArrayArray7[this.anInt965][local44 + 1][local48];
					local58 = this.anIntArrayArrayArray7[this.anInt965][local44 + 1][local48 + 1];
					local61 = this.anIntArrayArrayArray7[this.anInt965][local44][local48 + 1];
					if (local287 == 0) {
						@Pc(380) Class34 local380 = this.aClass25_1.method364(local48, this.anInt965, local44);
						if (local380 != null) {
							local69 = local380.anInt588 >> 14 & 0x7FFF;
							if (local278 == 2) {
								local380.aClass4_Sub1_Sub1_6 = new Class4_Sub1_Sub1_Sub6(local28, local52, local282 + 4, local55, local69, 2, false, local58, 18451, local61);
								local380.aClass4_Sub1_Sub1_7 = new Class4_Sub1_Sub1_Sub6(local28, local52, local282 + 1 & 0x3, local55, local69, 2, false, local58, 18451, local61);
							} else {
								local380.aClass4_Sub1_Sub1_6 = new Class4_Sub1_Sub1_Sub6(local28, local52, local282, local55, local69, local278, false, local58, 18451, local61);
							}
						}
					}
					if (local287 == 1) {
						@Pc(457) Class35 local457 = this.aClass25_1.method365(local44, local48, this.anInt965);
						if (local457 != null) {
							local457.aClass4_Sub1_Sub1_8 = new Class4_Sub1_Sub1_Sub6(local28, local52, 0, local55, local457.anInt594 >> 14 & 0x7FFF, 4, false, local58, 18451, local61);
						}
					}
					if (local287 == 2) {
						@Pc(491) Class33 local491 = this.aClass25_1.method366(local44, this.anInt965, local48);
						if (local278 == 11) {
							local278 = 10;
						}
						if (local491 != null) {
							local491.aClass4_Sub1_Sub1_5 = new Class4_Sub1_Sub1_Sub6(local28, local52, local282, local55, local491.anInt563 >> 14 & 0x7FFF, local278, false, local58, 18451, local61);
						}
					}
					if (local287 == 3) {
						@Pc(530) Class8 local530 = this.aClass25_1.method367(local44, local48, this.anInt965);
						if (local530 != null) {
							local530.aClass4_Sub1_Sub1_4 = new Class4_Sub1_Sub1_Sub6(local28, local52, local282, local55, local530.anInt165 >> 14 & 0x7FFF, 22, false, local58, 18451, local61);
						}
					}
				}
			} else if (arg0 == 237) {
				local274 = arg1.method167();
				local278 = this.anInt882 + (local274 >> 4 & 0x7);
				local282 = this.anInt883 + (local274 & 0x7);
				local287 = local278 + arg1.method168();
				local28 = local282 + arg1.method168();
				local37 = arg1.method170();
				local44 = arg1.method169();
				local48 = arg1.method167() * 4;
				local52 = arg1.method167() * 4;
				local55 = arg1.method169();
				local58 = arg1.method169();
				local61 = arg1.method167();
				local65 = arg1.method167();
				if (local278 >= 0 && local282 >= 0 && local278 < 104 && local282 < 104 && local287 >= 0 && local28 >= 0 && local287 < 104 && local28 < 104 && local44 != 65535) {
					local278 = local278 * 128 + 64;
					local282 = local282 * 128 + 64;
					local287 = local287 * 128 + 64;
					local28 = local28 * 128 + 64;
					@Pc(689) Class4_Sub1_Sub1_Sub5 local689 = new Class4_Sub1_Sub1_Sub5(local55 + anInt866, this.anInt965, local282, local65, local37, local278, this.method699(local278, local282, this.anInt965) - local48, local61, local44, local58 + anInt866, local52, 29);
					local689.method432(local55 + anInt866, local287, local28, this.method699(local287, local28, this.anInt965) - local52);
					this.aClass23_11.method312(local689);
				}
			} else if (arg0 == 147) {
				local274 = arg1.method194();
				local278 = arg1.method194();
				local282 = arg1.method193();
				local287 = arg1.method186();
				local28 = this.anInt882 + (local287 >> 4 & 0x7);
				local37 = this.anInt883 + (local287 & 0x7);
				if (local28 >= 0 && local37 >= 0 && local28 < 104 && local37 < 104 && local282 != this.anInt971) {
					@Pc(764) Class4_Sub1_Sub1_Sub4 local764 = new Class4_Sub1_Sub1_Sub4();
					local764.anInt391 = local274;
					local764.anInt390 = local278;
					if (this.aClass23ArrayArrayArray1[this.anInt965][local28][local37] == null) {
						this.aClass23ArrayArrayArray1[this.anInt965][local28][local37] = new Class23(0);
					}
					this.aClass23ArrayArrayArray1[this.anInt965][local28][local37].method312(local764);
					this.method588(local28, local37);
				}
			} else if (arg0 == 188) {
				local274 = arg1.method167();
				local278 = this.anInt882 + (local274 >> 4 & 0x7);
				local282 = this.anInt883 + (local274 & 0x7);
				local287 = arg1.method169();
				local28 = arg1.method167();
				local37 = arg1.method169();
				if (local278 >= 0 && local282 >= 0 && local278 < 104 && local282 < 104) {
					local278 = local278 * 128 + 64;
					local282 = local282 * 128 + 64;
					@Pc(883) Class4_Sub1_Sub1_Sub2 local883 = new Class4_Sub1_Sub1_Sub2(local287, local37, this.method699(local278, local282, this.anInt965) - local28, this.anInt965, 494, anInt866, local278, local282);
					this.aClass23_12.method312(local883);
				}
			} else if (arg0 == 199) {
				local274 = arg1.method167();
				local278 = this.anInt882 + (local274 >> 4 & 0x7);
				local282 = this.anInt883 + (local274 & 0x7);
				local287 = arg1.method169();
				local28 = arg1.method169();
				local37 = arg1.method169();
				if (local278 >= 0 && local282 >= 0 && local278 < 104 && local282 < 104) {
					@Pc(939) Class23 local939 = this.aClass23ArrayArrayArray1[this.anInt965][local278][local282];
					if (local939 != null) {
						for (@Pc(945) Class4_Sub1_Sub1_Sub4 local945 = (Class4_Sub1_Sub1_Sub4) local939.method315(); local945 != null; local945 = (Class4_Sub1_Sub1_Sub4) local939.method317()) {
							if (local945.anInt391 == (local287 & 0x7FFF) && local945.anInt390 == local28) {
								local945.anInt390 = local37;
								break;
							}
						}
						this.method588(local278, local282);
					}
				}
			} else if (arg0 == 198) {
				local274 = arg1.method167();
				local278 = local274 >> 2;
				local282 = local274 & 0x3;
				local287 = this.anIntArray236[local278];
				local28 = arg1.method167();
				local37 = this.anInt882 + (local28 >> 4 & 0x7);
				local44 = this.anInt883 + (local28 & 0x7);
				local48 = arg1.method195();
				if (local37 >= 0 && local44 >= 0 && local37 < 104 && local44 < 104) {
					this.method715(local44, local282, local48, local287, local278, local37, 594, -1, this.anInt965, 0);
				}
			} else if (arg0 == 52) {
				local274 = arg1.method186();
				local278 = this.anInt882 + (local274 >> 4 & 0x7);
				local282 = this.anInt883 + (local274 & 0x7);
				local287 = arg1.method186();
				local28 = local287 >> 2;
				local37 = local287 & 0x3;
				local44 = this.anIntArray236[local28];
				if (local278 >= 0 && local282 >= 0 && local278 < 104 && local282 < 104) {
					this.method715(local282, local37, -1, local44, local28, local278, 594, -1, this.anInt965, 0);
				}
			} else {
				@Pc(1155) Class4_Sub1_Sub1_Sub4 local1155;
				if (arg0 == 69) {
					local274 = arg1.method167();
					local278 = this.anInt882 + (local274 >> 4 & 0x7);
					local282 = this.anInt883 + (local274 & 0x7);
					local287 = arg1.method169();
					if (local278 >= 0 && local282 >= 0 && local278 < 104 && local282 < 104) {
						@Pc(1149) Class23 local1149 = this.aClass23ArrayArrayArray1[this.anInt965][local278][local282];
						if (local1149 != null) {
							for (local1155 = (Class4_Sub1_Sub1_Sub4) local1149.method315(); local1155 != null; local1155 = (Class4_Sub1_Sub1_Sub4) local1149.method317()) {
								if (local1155.anInt391 == (local287 & 0x7FFF)) {
									local1155.method528();
									break;
								}
							}
							if (local1149.method315() == null) {
								this.aClass23ArrayArrayArray1[this.anInt965][local278][local282] = null;
							}
							this.method588(local278, local282);
						}
					}
				} else if (arg0 == 99) {
					local274 = arg1.method194();
					local278 = arg1.method193();
					local282 = arg1.method186();
					local287 = this.anInt882 + (local282 >> 4 & 0x7);
					local28 = this.anInt883 + (local282 & 0x7);
					if (local287 >= 0 && local28 >= 0 && local287 < 104 && local28 < 104) {
						local1155 = new Class4_Sub1_Sub1_Sub4();
						local1155.anInt391 = local278;
						local1155.anInt390 = local274;
						if (this.aClass23ArrayArrayArray1[this.anInt965][local287][local28] == null) {
							this.aClass23ArrayArrayArray1[this.anInt965][local287][local28] = new Class23(0);
						}
						this.aClass23ArrayArrayArray1[this.anInt965][local287][local28].method312(local1155);
						this.method588(local287, local28);
					}
				} else if (arg0 == 86) {
					local274 = arg1.method167();
					local278 = this.anInt882 + (local274 >> 4 & 0x7);
					local282 = this.anInt883 + (local274 & 0x7);
					local287 = arg1.method169();
					local28 = arg1.method167();
					local37 = local28 >> 4 & 0xF;
					local44 = local28 & 0x7;
					if (aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0] >= local278 - local37 && aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0] <= local278 + local37 && aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0] >= local282 - local37 && aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0] <= local282 + local37 && this.aBoolean246 && !aBoolean235 && this.anInt969 < 50) {
						this.anIntArray237[this.anInt969] = local287;
						this.anIntArray217[this.anInt969] = local44;
						this.anIntArray213[this.anInt969] = Class14.anIntArray34[local287];
						this.anInt969++;
						return;
					}
				}
			}
		} catch (@Pc(1389) RuntimeException local1389) {
			signlink.reporterror("70162, " + arg0 + ", " + true + ", " + arg1 + ", " + local1389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method655() {
		try {
			this.method637();
			if (this.anInt942 == 1) {
				this.aClass4_Sub1_Sub2_Sub2Array6[this.anInt941 / 100].method259(this.anInt940 - 8 - 4, this.anInt939 - 8 - 4);
			}
			if (this.anInt942 == 2) {
				this.aClass4_Sub1_Sub2_Sub2Array6[this.anInt941 / 100 + 4].method259(this.anInt940 - 8 - 4, this.anInt939 - 8 - 4);
			}
			if (this.anInt1050 != -1) {
				this.method661(this.anInt849, this.anInt1050);
				this.method697(0, 0, 0, Class27.method405(this.anInt1050));
			}
			if (this.anInt906 != -1) {
				this.method661(this.anInt849, this.anInt906);
				this.method697(0, 0, 0, Class27.method405(this.anInt906));
			}
			this.method603(this.aByte41);
			if (!this.aBoolean271) {
				this.method596((byte) 9);
				this.method658();
			} else if (this.anInt1000 == 0) {
				this.method612();
			}
			if (this.anInt916 == 1) {
				this.aClass4_Sub1_Sub2_Sub2_10.method259(296, 472);
			}
			@Pc(174) int local174;
			if (aBoolean243) {
				@Pc(140) byte local140 = 20;
				@Pc(142) int local142 = 16776960;
				if (super.anInt821 < 30 && aBoolean235) {
					local142 = 16711680;
				}
				if (super.anInt821 < 20 && !aBoolean235) {
					local142 = 16711680;
				}
				this.aClass4_Sub1_Sub2_Sub4_3.method494("Fps:" + super.anInt821, 20, local142, 150);
				local174 = local140 + 15;
				@Pc(176) Runtime local176 = Runtime.getRuntime();
				@Pc(185) int local185 = (int) ((local176.totalMemory() - local176.freeMemory()) / 1024L);
				if (local185 > 33554432 && aBoolean235) {
				}
				if (local185 > 67108864 && !aBoolean235) {
				}
				this.aClass4_Sub1_Sub2_Sub4_3.method494("Mem:" + local185 + "k", 35, 16776960, 150);
				local174 += 15;
			}
			if (this.anInt1056 != 0) {
				@Pc(226) int local226 = this.anInt1056 / 50;
				local174 = local226 / 60;
				@Pc(234) int local234 = local226 % 60;
				if (local234 < 10) {
					this.aClass4_Sub1_Sub2_Sub4_3.method499(329, "System update in: " + local174 + ":0" + local234, 4, 16776960);
				} else {
					this.aClass4_Sub1_Sub2_Sub4_3.method499(329, "System update in: " + local174 + ":" + local234, 4, 16776960);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("98705, " + -24 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method656() {
		try {
			for (@Pc(12) Class4_Sub1_Sub1_Sub5 local12 = (Class4_Sub1_Sub1_Sub5) this.aClass23_11.method315(); local12 != null; local12 = (Class4_Sub1_Sub1_Sub5) this.aClass23_11.method317()) {
				if (local12.anInt547 != this.anInt965 || anInt866 > local12.anInt551) {
					local12.method528();
				} else if (anInt866 >= local12.anInt550) {
					if (local12.anInt546 > 0) {
						@Pc(42) Class4_Sub1_Sub1_Sub1_Sub1 local42 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local12.anInt546 - 1];
						if (local42 != null && local42.anInt648 >= 0 && local42.anInt648 < 13312 && local42.anInt649 >= 0 && local42.anInt649 < 13312) {
							local12.method432(anInt866, local42.anInt648, local42.anInt649, this.method699(local42.anInt648, local42.anInt649, local12.anInt547) - local12.anInt543);
						}
					}
					if (local12.anInt546 < 0) {
						@Pc(87) int local87 = -local12.anInt546 - 1;
						@Pc(93) Class4_Sub1_Sub1_Sub1_Sub2 local93;
						if (local87 == this.anInt971) {
							local93 = aClass4_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local93 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local87];
						}
						if (local93 != null && local93.anInt648 >= 0 && local93.anInt648 < 13312 && local93.anInt649 >= 0 && local93.anInt649 < 13312) {
							local12.method432(anInt866, local93.anInt648, local93.anInt649, this.method699(local93.anInt648, local93.anInt649, local12.anInt547) - local12.anInt543);
						}
					}
					local12.method433(this.anInt849, this.aByte37);
					this.aClass25_1.method353(60, false, (int) local12.aDouble2, local12, (int) local12.aDouble3, (int) local12.aDouble1, this.anInt965, -1, local12.anInt548);
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("19885, " + -7538 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method658() {
		try {
			if (this.anInt1049 >= 2 || this.anInt885 != 0 || this.anInt991 != 0) {
				@Pc(31) String local31;
				if (this.anInt885 == 1 && this.anInt1049 < 2) {
					local31 = "Use " + this.aString25 + " with...";
				} else if (this.anInt991 == 1 && this.anInt1049 < 2) {
					local31 = this.aString29 + "...";
				} else {
					local31 = this.aStringArray10[this.anInt1049 - 1];
				}
				if (this.anInt1049 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt1049 - 2) + " more options";
				}
				this.aClass4_Sub1_Sub2_Sub4_4.method504(16777215, anInt866 / 1000, local31, 15, 4);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("43451, " + 5 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method659() {
		try {
			if (this.anInt928 == 2) {
				this.method590(this.anInt949 * 2, (this.anInt947 - this.anInt1036 << 7) + this.anInt950, (this.anInt948 - this.anInt1037 << 7) + this.anInt951);
				if (this.anInt1017 > -1 && anInt866 % 20 < 10) {
					this.aClass4_Sub1_Sub2_Sub2Array9[0].method259(this.anInt1018 - 28, this.anInt1017 - 12);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("38830, " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method660() {
		try {
			if (super.anInt831 == 1) {
				if (super.anInt832 >= 539 && super.anInt832 <= 573 && super.anInt833 >= 169 && super.anInt833 < 205 && this.anIntArray253[0] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 0;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 569 && super.anInt832 <= 599 && super.anInt833 >= 168 && super.anInt833 < 205 && this.anIntArray253[1] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 1;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 597 && super.anInt832 <= 627 && super.anInt833 >= 168 && super.anInt833 < 205 && this.anIntArray253[2] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 2;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 625 && super.anInt832 <= 669 && super.anInt833 >= 168 && super.anInt833 < 203 && this.anIntArray253[3] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 3;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 666 && super.anInt832 <= 696 && super.anInt833 >= 168 && super.anInt833 < 205 && this.anIntArray253[4] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 4;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 694 && super.anInt832 <= 724 && super.anInt833 >= 168 && super.anInt833 < 205 && this.anIntArray253[5] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 5;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 722 && super.anInt832 <= 756 && super.anInt833 >= 169 && super.anInt833 < 205 && this.anIntArray253[6] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 6;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 540 && super.anInt832 <= 574 && super.anInt833 >= 466 && super.anInt833 < 502 && this.anIntArray253[7] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 7;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 572 && super.anInt832 <= 602 && super.anInt833 >= 466 && super.anInt833 < 503 && this.anIntArray253[8] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 8;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 599 && super.anInt832 <= 629 && super.anInt833 >= 466 && super.anInt833 < 503 && this.anIntArray253[9] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 9;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 627 && super.anInt832 <= 671 && super.anInt833 >= 467 && super.anInt833 < 502 && this.anIntArray253[10] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 10;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 669 && super.anInt832 <= 699 && super.anInt833 >= 466 && super.anInt833 < 503 && this.anIntArray253[11] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 11;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 696 && super.anInt832 <= 726 && super.anInt833 >= 466 && super.anInt833 < 503 && this.anIntArray253[12] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 12;
					this.aBoolean244 = true;
				}
				if (super.anInt832 >= 724 && super.anInt832 <= 758 && super.anInt833 >= 466 && super.anInt833 < 502 && this.anIntArray253[13] != -1) {
					this.aBoolean251 = true;
					this.anInt854 = 13;
					this.aBoolean244 = true;
				}
				anInt897++;
				if (anInt897 > 145) {
					anInt897 = 0;
					this.aClass4_Sub1_Sub3_9.method156(173);
					this.aClass4_Sub1_Sub3_9.method157(124);
					return;
				}
			}
		} catch (@Pc(463) RuntimeException local463) {
			signlink.reporterror("55550, " + 0 + ", " + local463.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Z")
	private boolean method661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class27 local12 = Class27.method405(arg1);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray129.length && local12.anIntArray129[local14] != -1; local14++) {
				@Pc(28) Class27 local28 = Class27.method405(local12.anIntArray129[local14]);
				if (local28.anInt471 == 1) {
					local3 |= this.method661(arg0, local28.anInt482);
				}
				@Pc(63) int local63;
				if (local28.anInt471 == 6 && (local28.anInt478 != -1 || local28.anInt479 != -1)) {
					@Pc(58) boolean local58 = this.method667(local28);
					if (local58) {
						local63 = local28.anInt479;
					} else {
						local63 = local28.anInt478;
					}
					if (local63 != -1) {
						@Pc(75) Class5 local75 = Class5.aClass5Array1[local63];
						local28.anInt496 += arg0;
						while (local28.anInt496 > local75.method32(local28.anInt465)) {
							local28.anInt496 -= local75.method32(local28.anInt465) + 1;
							local28.anInt465++;
							if (local28.anInt465 >= local75.anInt39) {
								local28.anInt465 -= local75.anInt40;
								if (local28.anInt465 < 0 || local28.anInt465 >= local75.anInt39) {
									local28.anInt465 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local28.anInt471 == 6 && local28.anInt470 != 0) {
					@Pc(146) int local146 = local28.anInt470 >> 16;
					local63 = local28.anInt470 << 16 >> 16;
					@Pc(157) int local157 = local146 * arg0;
					local63 *= arg0;
					local28.anInt467 = local28.anInt467 + local157 & 0x7FF;
					local28.anInt468 = local28.anInt468 + local63 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("36103, " + 375 + ", " + arg0 + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method582() {
		try {
			this.aBoolean242 = true;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("32229, " + 94 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!EGCCHUZS;)V")
	private void method662(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method178(8);
			@Pc(18) int local18;
			if (local6 < this.anInt909) {
				for (local18 = local6; local18 < this.anInt909; local18++) {
					this.anIntArray266[this.anInt1032++] = this.anIntArray228[local18];
				}
			}
			if (local6 > this.anInt909) {
				signlink.reporterror(this.aString17 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt909 = 0;
			for (local18 = 0; local18 < local6; local18++) {
				@Pc(70) int local70 = this.anIntArray228[local18];
				@Pc(75) Class4_Sub1_Sub1_Sub1_Sub2 local75 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local70];
				@Pc(80) int local80 = arg1.method178(1);
				if (local80 == 0) {
					this.anIntArray228[this.anInt909++] = local70;
					local75.anInt668 = anInt866;
				} else {
					@Pc(103) int local103 = arg1.method178(2);
					if (local103 == 0) {
						this.anIntArray228[this.anInt909++] = local70;
						local75.anInt668 = anInt866;
						this.anIntArray229[this.anInt910++] = local70;
					} else {
						@Pc(154) int local154;
						@Pc(165) int local165;
						if (local103 == 1) {
							this.anIntArray228[this.anInt909++] = local70;
							local75.anInt668 = anInt866;
							local154 = arg1.method178(3);
							local75.method473(this.anInt920, false, local154);
							local165 = arg1.method178(1);
							if (local165 == 1) {
								this.anIntArray229[this.anInt910++] = local70;
							}
						} else if (local103 == 2) {
							this.anIntArray228[this.anInt909++] = local70;
							local75.anInt668 = anInt866;
							local154 = arg1.method178(3);
							local75.method473(this.anInt920, true, local154);
							local165 = arg1.method178(3);
							local75.method473(this.anInt920, true, local165);
							@Pc(225) int local225 = arg1.method178(1);
							if (local225 == 1) {
								this.anIntArray229[this.anInt910++] = local70;
							}
						} else if (local103 == 3) {
							this.anIntArray266[this.anInt1032++] = local70;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("7111, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method663() {
		try {
			this.anInt1045++;
			this.method632(true);
			this.method592(true);
			this.method632(false);
			this.method592(false);
			this.method656();
			this.method688(271);
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean261) {
				local35 = this.anInt1011;
				if (this.anInt982 / 256 > local35) {
					local35 = this.anInt982 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray238[4] + 128 > local35) {
					local35 = this.anIntArray238[4] + 128;
				}
				local74 = this.anInt1012 + this.anInt898 & 0x7FF;
				this.method666(this.anInt997, local74, this.method699(aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648, aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649, this.anInt965) - 50, local35, local35 * 3 + 600, this.anInt998);
			}
			if (this.aBoolean261) {
				local35 = this.method682(389);
			} else {
				local35 = this.method681();
			}
			local74 = this.anInt983;
			@Pc(118) int local118 = this.anInt984;
			@Pc(121) int local121 = this.anInt985;
			@Pc(124) int local124 = this.anInt986;
			@Pc(127) int local127 = this.anInt987;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray11[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray243[local129] * 2 + 1) - (double) this.anIntArray243[local129] + Math.sin((double) this.anIntArray241[local129] * ((double) this.anIntArray270[local129] / 100.0D)) * (double) this.anIntArray238[local129]);
					if (local129 == 0) {
						this.anInt983 += local176;
					}
					if (local129 == 1) {
						this.anInt984 += local176;
					}
					if (local129 == 2) {
						this.anInt985 += local176;
					}
					if (local129 == 3) {
						this.anInt987 = this.anInt987 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt986 += local176;
						if (this.anInt986 < 128) {
							this.anInt986 = 128;
						}
						if (this.anInt986 > 383) {
							this.anInt986 = 383;
						}
					}
				}
			}
			local176 = Class4_Sub1_Sub2_Sub3.anInt582;
			Class4_Sub1_Sub1_Sub3.aBoolean121 = true;
			Class4_Sub1_Sub1_Sub3.anInt387 = 0;
			Class4_Sub1_Sub1_Sub3.anInt385 = super.anInt826 - 4;
			Class4_Sub1_Sub1_Sub3.anInt386 = super.anInt827 - 4;
			Class4_Sub1_Sub2.method485((byte) 6);
			this.aClass25_1.method381(this.anInt987, local35, this.anInt986, this.anInt984, this.anInt983, this.anInt985);
			this.aClass25_1.method356(this.anInt973);
			this.method680();
			this.method659();
			this.method723(local176);
			this.method655();
			this.aClass47_17.method557(4, 4, super.aGraphics2);
			this.anInt983 = local74;
			this.anInt984 = local118;
			this.anInt985 = local121;
			this.anInt986 = local124;
			this.anInt987 = local127;
		} catch (@Pc(323) RuntimeException local323) {
			signlink.reporterror("16734, " + 2 + ", " + local323.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method664(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt1020 != 0) {
					this.anInt1020 = 0;
					this.aBoolean255 = true;
				}
				@Pc(18) int local18 = this.anIntArray230[arg0];
				@Pc(23) int local23 = this.anIntArray231[arg0];
				@Pc(28) int local28 = this.anIntArray232[arg0];
				@Pc(33) int local33 = this.anIntArray233[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(56) Class4_Sub1_Sub1_Sub1_Sub2 local56;
				if (local28 == 912) {
					local56 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local56 != null) {
						this.method690(false, 0, 1, local56.anIntArray156[0], local56.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
						this.anInt939 = super.anInt832;
						this.anInt940 = super.anInt833;
						this.anInt942 = 2;
						this.anInt941 = 0;
						this.aClass4_Sub1_Sub3_9.method156(23);
						this.aClass4_Sub1_Sub3_9.method192(local33, (byte) 9);
					}
				}
				if (local28 == 587) {
					local56 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local56 != null) {
						this.method690(false, 0, 1, local56.anIntArray156[0], local56.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
						this.anInt939 = super.anInt832;
						this.anInt940 = super.anInt833;
						this.anInt942 = 2;
						this.anInt941 = 0;
						this.aClass4_Sub1_Sub3_9.method156(166);
						this.aClass4_Sub1_Sub3_9.method158(local33);
					}
				}
				if (local28 == 1258) {
					this.method649(local18, local23, local33);
					this.aClass4_Sub1_Sub3_9.method156(231);
					this.aClass4_Sub1_Sub3_9.method192(local33 >> 14 & 0x7FFF, (byte) 9);
					this.aClass4_Sub1_Sub3_9.method158(local23 + this.anInt1037);
					this.aClass4_Sub1_Sub3_9.method158(local18 + this.anInt1036);
				}
				if (local28 == 492) {
					this.aClass4_Sub1_Sub3_9.method156(229);
					this.aClass4_Sub1_Sub3_9.method191(local23);
					this.aClass4_Sub1_Sub3_9.method158(this.anInt992);
					this.aClass4_Sub1_Sub3_9.method192(local33, (byte) 9);
					this.aClass4_Sub1_Sub3_9.method190(local18);
					this.anInt921 = 0;
					this.anInt922 = local23;
					this.anInt923 = local18;
					this.anInt924 = 2;
					if (Class27.method405(local23).anInt476 == this.anInt906) {
						this.anInt924 = 1;
					}
					if (Class27.method405(local23).anInt476 == this.anInt935) {
						this.anInt924 = 3;
					}
				}
				@Pc(273) Class4_Sub1_Sub1_Sub1_Sub1 local273;
				if (local28 == 734) {
					local273 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local273 != null) {
						this.method690(false, 0, 1, local273.anIntArray156[0], local273.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
						this.anInt939 = super.anInt832;
						this.anInt940 = super.anInt833;
						this.anInt942 = 2;
						this.anInt941 = 0;
						this.aClass4_Sub1_Sub3_9.method156(180);
						this.aClass4_Sub1_Sub3_9.method192(this.anInt992, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method192(local33, (byte) 9);
					}
				}
				@Pc(356) boolean local356;
				if (local28 == 583) {
					local356 = this.method690(false, 0, 0, local18, local23, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
					if (!local356) {
						this.method690(false, 0, 1, local18, local23, 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
					}
					this.anInt939 = super.anInt832;
					this.anInt940 = super.anInt833;
					this.anInt942 = 2;
					this.anInt941 = 0;
					this.aClass4_Sub1_Sub3_9.method156(226);
					this.aClass4_Sub1_Sub3_9.method158(local18 + this.anInt1036);
					this.aClass4_Sub1_Sub3_9.method191(local23 + this.anInt1037);
					this.aClass4_Sub1_Sub3_9.method191(local33);
				}
				if (local28 == 211 && !this.aBoolean233) {
					this.aClass4_Sub1_Sub3_9.method156(163);
					this.aClass4_Sub1_Sub3_9.method158(local23);
					this.aBoolean233 = true;
				}
				@Pc(476) String local476;
				@Pc(461) String local461;
				@Pc(442) Class27 local442;
				if (local28 == 37) {
					local442 = Class27.method405(local23);
					this.anInt991 = 1;
					this.anInt992 = local23;
					this.anInt993 = local442.anInt464;
					this.anInt885 = 0;
					this.aBoolean251 = true;
					local461 = local442.aString12;
					if (local461.indexOf(" ") != -1) {
						local461 = local461.substring(0, local461.indexOf(" "));
					}
					local476 = local442.aString12;
					if (local476.indexOf(" ") != -1) {
						local476 = local476.substring(local476.indexOf(" ") + 1);
					}
					this.aString29 = local461 + " " + local442.aString9 + " " + local476;
					if (this.anInt993 == 16) {
						this.aBoolean251 = true;
						this.anInt854 = 3;
						this.aBoolean244 = true;
					}
				} else {
					if (local28 == 941) {
						this.method649(local18, local23, local33);
						this.aClass4_Sub1_Sub3_9.method156(105);
						this.aClass4_Sub1_Sub3_9.method191(local23 + this.anInt1037);
						this.aClass4_Sub1_Sub3_9.method192(local33 >> 14 & 0x7FFF, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method190(local18 + this.anInt1036);
					}
					@Pc(575) int local575;
					@Pc(596) int local596;
					@Pc(571) String local571;
					if (local28 == 768 || local28 == 443) {
						local571 = this.aStringArray10[arg0];
						local575 = local571.indexOf("@whi@");
						if (local575 != -1) {
							local571 = local571.substring(local575 + 5).trim();
							local476 = Class46.method554(Class46.method551(Class46.method550(local571)));
							@Pc(594) boolean local594 = false;
							for (local596 = 0; local596 < this.anInt909; local596++) {
								@Pc(606) Class4_Sub1_Sub1_Sub1_Sub2 local606 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray228[local596]];
								if (local606 != null && local606.aString15 != null && local606.aString15.equalsIgnoreCase(local476)) {
									this.method690(false, 0, 1, local606.anIntArray156[0], local606.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
									if (local28 == 768) {
										this.aClass4_Sub1_Sub3_9.method156(166);
										this.aClass4_Sub1_Sub3_9.method158(this.anIntArray228[local596]);
									}
									if (local28 == 443) {
										this.aClass4_Sub1_Sub3_9.method156(23);
										this.aClass4_Sub1_Sub3_9.method192(this.anIntArray228[local596], (byte) 9);
									}
									local594 = true;
									break;
								}
							}
							if (!local594) {
								this.method628("", 0, "Unable to find " + local476);
							}
						}
					}
					@Pc(703) Class44 local703;
					if (local28 == 1948) {
						local703 = Class44.method536(local33);
						@Pc(706) Class27 local706 = Class27.method405(local23);
						if (local706 != null && local706.anIntArray128[local18] >= 100000) {
							local461 = local706.anIntArray128[local18] + " x " + local703.aString16;
						} else if (local703.aByteArray20 == null) {
							local461 = "It's a " + local703.aString16 + ".";
						} else {
							local461 = new String(local703.aByteArray20);
						}
						this.method628("", 0, local461);
					}
					if (local28 == 786) {
						this.method706();
					}
					if (local28 == 1787) {
						local273 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local273 != null) {
							@Pc(778) Class2 local778 = local273.aClass2_1;
							if (local778.anIntArray3 != null) {
								local778 = local778.method6(this.aByte30);
							}
							if (local778 != null) {
								if (local778.aByteArray1 == null) {
									local476 = "It's a " + local778.aString1 + ".";
								} else {
									local476 = new String(local778.aByteArray1);
								}
								this.method628("", 0, local476);
							}
						}
					}
					if (local28 == 482) {
						this.aClass4_Sub1_Sub3_9.method156(73);
						this.aClass4_Sub1_Sub3_9.method190(local18);
						this.aClass4_Sub1_Sub3_9.method158(this.anInt888);
						this.aClass4_Sub1_Sub3_9.method158(local33);
						this.aClass4_Sub1_Sub3_9.method190(local23);
						this.aClass4_Sub1_Sub3_9.method192(this.anInt887, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method158(this.anInt886);
						this.anInt921 = 0;
						this.anInt922 = local23;
						this.anInt923 = local18;
						this.anInt924 = 2;
						if (Class27.method405(local23).anInt476 == this.anInt906) {
							this.anInt924 = 1;
						}
						if (Class27.method405(local23).anInt476 == this.anInt935) {
							this.anInt924 = 3;
						}
					}
					if (local28 == 355 && this.method649(local18, local23, local33)) {
						this.aClass4_Sub1_Sub3_9.method156(19);
						this.aClass4_Sub1_Sub3_9.method190(local33 >> 14 & 0x7FFF);
						this.aClass4_Sub1_Sub3_9.method190(local18 + this.anInt1036);
						this.aClass4_Sub1_Sub3_9.method190(local23 + this.anInt1037);
						this.aClass4_Sub1_Sub3_9.method192(this.anInt992, (byte) 9);
					}
					if (local28 == 673) {
						local56 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local56 != null) {
							this.method690(false, 0, 1, local56.anIntArray156[0], local56.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							this.anInt939 = super.anInt832;
							this.anInt940 = super.anInt833;
							this.anInt942 = 2;
							this.anInt941 = 0;
							this.aClass4_Sub1_Sub3_9.method156(118);
							this.aClass4_Sub1_Sub3_9.method190(local33);
							this.aClass4_Sub1_Sub3_9.method190(this.anInt992);
						}
					}
					if (local28 == 535) {
						this.method649(local18, local23, local33);
						this.aClass4_Sub1_Sub3_9.method156(162);
						this.aClass4_Sub1_Sub3_9.method192(local18 + this.anInt1036, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method192(local23 + this.anInt1037, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method158(local33 >> 14 & 0x7FFF);
					}
					if (local28 == 819) {
						local356 = this.method690(false, 0, 0, local18, local23, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
						if (!local356) {
							this.method690(false, 0, 1, local18, local23, 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
						}
						this.anInt939 = super.anInt832;
						this.anInt940 = super.anInt833;
						this.anInt942 = 2;
						this.anInt941 = 0;
						this.aClass4_Sub1_Sub3_9.method156(200);
						this.aClass4_Sub1_Sub3_9.method191(this.anInt888);
						this.aClass4_Sub1_Sub3_9.method192(local33, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method192(this.anInt887, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method158(this.anInt886);
						this.aClass4_Sub1_Sub3_9.method192(local23 + this.anInt1037, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method192(local18 + this.anInt1036, (byte) 9);
					}
					if (local28 == 963) {
						this.aClass4_Sub1_Sub3_9.method156(131);
						this.aClass4_Sub1_Sub3_9.method158(local18);
						this.aClass4_Sub1_Sub3_9.method190(local23);
						this.aClass4_Sub1_Sub3_9.method190(local33);
						this.anInt921 = 0;
						this.anInt922 = local23;
						this.anInt923 = local18;
						this.anInt924 = 2;
						if (Class27.method405(local23).anInt476 == this.anInt906) {
							this.anInt924 = 1;
						}
						if (Class27.method405(local23).anInt476 == this.anInt935) {
							this.anInt924 = 3;
						}
					}
					if (local28 == 280) {
						local273 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local273 != null) {
							this.method690(false, 0, 1, local273.anIntArray156[0], local273.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							this.anInt939 = super.anInt832;
							this.anInt940 = super.anInt833;
							this.anInt942 = 2;
							this.anInt941 = 0;
							this.aClass4_Sub1_Sub3_9.method156(161);
							this.aClass4_Sub1_Sub3_9.method192(this.anInt888, (byte) 9);
							this.aClass4_Sub1_Sub3_9.method191(local33);
							this.aClass4_Sub1_Sub3_9.method158(this.anInt886);
							this.aClass4_Sub1_Sub3_9.method158(this.anInt887);
						}
					}
					if (local28 == 688 && this.method649(local18, local23, local33)) {
						this.aClass4_Sub1_Sub3_9.method156(133);
						this.aClass4_Sub1_Sub3_9.method192(local33 >> 14 & 0x7FFF, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method192(local23 + this.anInt1037, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method158(this.anInt888);
						this.aClass4_Sub1_Sub3_9.method191(local18 + this.anInt1036);
						this.aClass4_Sub1_Sub3_9.method191(this.anInt886);
						this.aClass4_Sub1_Sub3_9.method158(this.anInt887);
					}
					if (local28 == 800) {
						this.aClass4_Sub1_Sub3_9.method156(241);
						this.aClass4_Sub1_Sub3_9.method191(local33);
						this.aClass4_Sub1_Sub3_9.method190(local18);
						this.aClass4_Sub1_Sub3_9.method158(local23);
						this.anInt921 = 0;
						this.anInt922 = local23;
						this.anInt923 = local18;
						this.anInt924 = 2;
						if (Class27.method405(local23).anInt476 == this.anInt906) {
							this.anInt924 = 1;
						}
						if (Class27.method405(local23).anInt476 == this.anInt935) {
							this.anInt924 = 3;
						}
					}
					if (local28 == 858) {
						local56 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local56 != null) {
							this.method690(false, 0, 1, local56.anIntArray156[0], local56.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							this.anInt939 = super.anInt832;
							this.anInt940 = super.anInt833;
							this.anInt942 = 2;
							this.anInt941 = 0;
							this.aClass4_Sub1_Sub3_9.method156(167);
							this.aClass4_Sub1_Sub3_9.method192(local33, (byte) 9);
						}
					}
					if (local28 == 1583) {
						local703 = Class44.method536(local33);
						if (local703.aByteArray20 == null) {
							local461 = "It's a " + local703.aString16 + ".";
						} else {
							local461 = new String(local703.aByteArray20);
						}
						this.method628("", 0, local461);
					}
					if (local28 == 9) {
						local273 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local273 != null) {
							this.method690(false, 0, 1, local273.anIntArray156[0], local273.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							this.anInt939 = super.anInt832;
							this.anInt940 = super.anInt833;
							this.anInt942 = 2;
							this.anInt941 = 0;
							this.aClass4_Sub1_Sub3_9.method156(253);
							this.aClass4_Sub1_Sub3_9.method192(local33, (byte) 9);
						}
					}
					if (local28 == 233) {
						this.aClass4_Sub1_Sub3_9.method156(222);
						this.aClass4_Sub1_Sub3_9.method190(local33);
						this.aClass4_Sub1_Sub3_9.method190(local23);
						this.aClass4_Sub1_Sub3_9.method191(local18);
						this.anInt921 = 0;
						this.anInt922 = local23;
						this.anInt923 = local18;
						this.anInt924 = 2;
						if (Class27.method405(local23).anInt476 == this.anInt906) {
							this.anInt924 = 1;
						}
						if (Class27.method405(local23).anInt476 == this.anInt935) {
							this.anInt924 = 3;
						}
					}
					if (local28 == 1225) {
						@Pc(1595) int local1595 = local33 >> 14 & 0x7FFF;
						@Pc(1598) Class20 local1598 = Class20.method236(local1595);
						if (local1598.aByteArray10 == null) {
							local476 = "It's a " + local1598.aString8 + ".";
						} else {
							local476 = new String(local1598.aByteArray10);
						}
						this.method628("", 0, local476);
					}
					if (local28 == 36) {
						local442 = Class27.method405(local23);
						@Pc(1634) boolean local1634 = true;
						if (local442.anInt480 > 0) {
							local1634 = this.method595(local442);
						}
						if (local1634) {
							this.aClass4_Sub1_Sub3_9.method156(47);
							this.aClass4_Sub1_Sub3_9.method158(local23);
						}
					}
					if (local28 == 100) {
						local356 = this.method690(false, 0, 0, local18, local23, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
						if (!local356) {
							this.method690(false, 0, 1, local18, local23, 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
						}
						this.anInt939 = super.anInt832;
						this.anInt940 = super.anInt833;
						this.anInt942 = 2;
						this.anInt941 = 0;
						this.aClass4_Sub1_Sub3_9.method156(34);
						this.aClass4_Sub1_Sub3_9.method192(local23 + this.anInt1037, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method190(local33);
						this.aClass4_Sub1_Sub3_9.method158(local18 + this.anInt1036);
					}
					if (local28 == 881) {
						this.aClass4_Sub1_Sub3_9.method156(82);
						this.aClass4_Sub1_Sub3_9.method192(local18, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method192(local23, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method158(local33);
						this.anInt921 = 0;
						this.anInt922 = local23;
						this.anInt923 = local18;
						this.anInt924 = 2;
						if (Class27.method405(local23).anInt476 == this.anInt906) {
							this.anInt924 = 1;
						}
						if (Class27.method405(local23).anInt476 == this.anInt935) {
							this.anInt924 = 3;
						}
					}
					if (local28 == 559) {
						this.method649(local18, local23, local33);
						this.aClass4_Sub1_Sub3_9.method156(179);
						this.aClass4_Sub1_Sub3_9.method192(local18 + this.anInt1036, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method191(local33 >> 14 & 0x7FFF);
						this.aClass4_Sub1_Sub3_9.method192(local23 + this.anInt1037, (byte) 9);
					}
					if (local28 == 397) {
						this.aClass4_Sub1_Sub3_9.method156(127);
						this.aClass4_Sub1_Sub3_9.method192(local18, (byte) 9);
						this.aClass4_Sub1_Sub3_9.method191(local33);
						this.aClass4_Sub1_Sub3_9.method191(local23);
						this.anInt921 = 0;
						this.anInt922 = local23;
						this.anInt923 = local18;
						this.anInt924 = 2;
						if (Class27.method405(local23).anInt476 == this.anInt906) {
							this.anInt924 = 1;
						}
						if (Class27.method405(local23).anInt476 == this.anInt935) {
							this.anInt924 = 3;
						}
					}
					if (local28 == 219) {
						this.anInt885 = 1;
						this.anInt886 = local18;
						this.anInt887 = local23;
						this.anInt888 = local33;
						this.aString25 = Class44.method536(local33).aString16;
						this.anInt991 = 0;
						this.aBoolean251 = true;
					} else {
						if (local28 == 58) {
							local273 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local273 != null) {
								this.method690(false, 0, 1, local273.anIntArray156[0], local273.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
								this.anInt939 = super.anInt832;
								this.anInt940 = super.anInt833;
								this.anInt942 = 2;
								this.anInt941 = 0;
								this.aClass4_Sub1_Sub3_9.method156(181);
								this.aClass4_Sub1_Sub3_9.method191(local33);
							}
						}
						if (local28 == 227) {
							this.aClass4_Sub1_Sub3_9.method156(47);
							this.aClass4_Sub1_Sub3_9.method158(local23);
							local442 = Class27.method405(local23);
							if (local442.anIntArrayArray10 != null && local442.anIntArrayArray10[0][0] == 5) {
								local575 = local442.anIntArrayArray10[0][1];
								this.anIntArray212[local575] = 1 - this.anIntArray212[local575];
								this.method642(local575);
								this.aBoolean251 = true;
							}
						}
						if (local28 == 288) {
							local56 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local56 != null) {
								this.method690(false, 0, 1, local56.anIntArray156[0], local56.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
								this.anInt939 = super.anInt832;
								this.anInt940 = super.anInt833;
								this.anInt942 = 2;
								this.anInt941 = 0;
								this.aClass4_Sub1_Sub3_9.method156(140);
								this.aClass4_Sub1_Sub3_9.method191(local33);
							}
						}
						if (local28 == 485) {
							local356 = this.method690(false, 0, 0, local18, local23, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							if (!local356) {
								this.method690(false, 0, 1, local18, local23, 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							}
							this.anInt939 = super.anInt832;
							this.anInt940 = super.anInt833;
							this.anInt942 = 2;
							this.anInt941 = 0;
							this.aClass4_Sub1_Sub3_9.method156(171);
							this.aClass4_Sub1_Sub3_9.method158(local33);
							this.aClass4_Sub1_Sub3_9.method191(local23 + this.anInt1037);
							this.aClass4_Sub1_Sub3_9.method191(local18 + this.anInt1036);
						}
						if (local28 == 302) {
							local356 = this.method690(false, 0, 0, local18, local23, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							if (!local356) {
								this.method690(false, 0, 1, local18, local23, 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							}
							this.anInt939 = super.anInt832;
							this.anInt940 = super.anInt833;
							this.anInt942 = 2;
							this.anInt941 = 0;
							this.aClass4_Sub1_Sub3_9.method156(60);
							this.aClass4_Sub1_Sub3_9.method158(local18 + this.anInt1036);
							this.aClass4_Sub1_Sub3_9.method191(this.anInt992);
							this.aClass4_Sub1_Sub3_9.method190(local33);
							this.aClass4_Sub1_Sub3_9.method192(local23 + this.anInt1037, (byte) 9);
						}
						if (local28 == 440) {
							local571 = this.aStringArray10[arg0];
							local575 = local571.indexOf("@whi@");
							if (local575 != -1) {
								if (this.anInt906 == -1) {
									this.method706();
									this.aString24 = local571.substring(local575 + 5).trim();
									this.aBoolean267 = false;
									this.anInt864 = this.anInt906 = Class27.anInt469;
								} else {
									this.method628("", 0, "Please close the interface you have open before using 'report abuse'");
								}
							}
						}
						if (local28 == 875) {
							this.aClass4_Sub1_Sub3_9.method156(104);
							this.aClass4_Sub1_Sub3_9.method190(local18);
							this.aClass4_Sub1_Sub3_9.method191(local23);
							this.aClass4_Sub1_Sub3_9.method158(local33);
							this.anInt921 = 0;
							this.anInt922 = local23;
							this.anInt923 = local18;
							this.anInt924 = 2;
							if (Class27.method405(local23).anInt476 == this.anInt906) {
								this.anInt924 = 1;
							}
							if (Class27.method405(local23).anInt476 == this.anInt935) {
								this.anInt924 = 3;
							}
						}
						if (local28 == 50) {
							local273 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local273 != null) {
								this.method690(false, 0, 1, local273.anIntArray156[0], local273.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
								this.anInt939 = super.anInt832;
								this.anInt940 = super.anInt833;
								this.anInt942 = 2;
								this.anInt941 = 0;
								anInt963++;
								if (anInt963 >= 94) {
									this.aClass4_Sub1_Sub3_9.method156(240);
									this.aClass4_Sub1_Sub3_9.method160(12002440);
									anInt963 = 0;
								}
								this.aClass4_Sub1_Sub3_9.method156(30);
								this.aClass4_Sub1_Sub3_9.method158(local33);
							}
						}
						if (local28 == 97) {
							local273 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local273 != null) {
								this.method690(false, 0, 1, local273.anIntArray156[0], local273.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
								this.anInt939 = super.anInt832;
								this.anInt940 = super.anInt833;
								this.anInt942 = 2;
								this.anInt941 = 0;
								if ((local33 & 0x3) == 0) {
									anInt974++;
								}
								if (anInt974 >= 93) {
									this.aClass4_Sub1_Sub3_9.method156(95);
									anInt974 = 0;
								}
								this.aClass4_Sub1_Sub3_9.method156(146);
								this.aClass4_Sub1_Sub3_9.method190(local33);
							}
						}
						if (local28 == 866) {
							this.aClass4_Sub1_Sub3_9.method156(214);
							this.aClass4_Sub1_Sub3_9.method190(local23);
							this.aClass4_Sub1_Sub3_9.method190(local33);
							this.aClass4_Sub1_Sub3_9.method158(local18);
							this.anInt921 = 0;
							this.anInt922 = local23;
							this.anInt923 = local18;
							this.anInt924 = 2;
							if (Class27.method405(local23).anInt476 == this.anInt906) {
								this.anInt924 = 1;
							}
							if (Class27.method405(local23).anInt476 == this.anInt935) {
								this.anInt924 = 3;
							}
						}
						if (local28 == 613) {
							local356 = this.method690(false, 0, 0, local18, local23, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							if (!local356) {
								this.method690(false, 0, 1, local18, local23, 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							}
							this.anInt939 = super.anInt832;
							this.anInt940 = super.anInt833;
							this.anInt942 = 2;
							this.anInt941 = 0;
							anInt1008 += local33;
							if (anInt1008 >= 114) {
								this.aClass4_Sub1_Sub3_9.method156(255);
								this.aClass4_Sub1_Sub3_9.method160(421994);
								anInt1008 = 0;
							}
							this.aClass4_Sub1_Sub3_9.method156(187);
							this.aClass4_Sub1_Sub3_9.method190(local18 + this.anInt1036);
							this.aClass4_Sub1_Sub3_9.method191(local33);
							this.aClass4_Sub1_Sub3_9.method158(local23 + this.anInt1037);
						}
						if (local28 == 984) {
							this.aClass4_Sub1_Sub3_9.method156(136);
							this.aClass4_Sub1_Sub3_9.method158(local23);
							this.aClass4_Sub1_Sub3_9.method190(local33);
							this.aClass4_Sub1_Sub3_9.method191(local18);
							this.anInt921 = 0;
							this.anInt922 = local23;
							this.anInt923 = local18;
							this.anInt924 = 2;
							if (Class27.method405(local23).anInt476 == this.anInt906) {
								this.anInt924 = 1;
							}
							if (Class27.method405(local23).anInt476 == this.anInt935) {
								this.anInt924 = 3;
							}
						}
						if (local28 == 285) {
							anInt857 += local23;
							if (anInt857 >= 112) {
								this.aClass4_Sub1_Sub3_9.method156(247);
								this.aClass4_Sub1_Sub3_9.method157(199);
								anInt857 = 0;
							}
							this.aClass4_Sub1_Sub3_9.method156(110);
							this.aClass4_Sub1_Sub3_9.method192(local18, (byte) 9);
							this.aClass4_Sub1_Sub3_9.method191(local33);
							this.aClass4_Sub1_Sub3_9.method192(local23, (byte) 9);
							this.anInt921 = 0;
							this.anInt922 = local23;
							this.anInt923 = local18;
							this.anInt924 = 2;
							if (Class27.method405(local23).anInt476 == this.anInt906) {
								this.anInt924 = 1;
							}
							if (Class27.method405(local23).anInt476 == this.anInt935) {
								this.anInt924 = 3;
							}
						}
						if (local28 == 90) {
							local56 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local56 != null) {
								this.method690(false, 0, 1, local56.anIntArray156[0], local56.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
								this.anInt939 = super.anInt832;
								this.anInt940 = super.anInt833;
								this.anInt942 = 2;
								this.anInt941 = 0;
								anInt848 += local33;
								if (anInt848 >= 68) {
									this.aClass4_Sub1_Sub3_9.method156(232);
									this.aClass4_Sub1_Sub3_9.method158(7862);
									anInt848 = 0;
								}
								this.aClass4_Sub1_Sub3_9.method156(152);
								this.aClass4_Sub1_Sub3_9.method158(local33);
							}
						}
						if (local28 == 703) {
							local273 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local273 != null) {
								this.method690(false, 0, 1, local273.anIntArray156[0], local273.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
								this.anInt939 = super.anInt832;
								this.anInt940 = super.anInt833;
								this.anInt942 = 2;
								this.anInt941 = 0;
								this.aClass4_Sub1_Sub3_9.method156(32);
								this.aClass4_Sub1_Sub3_9.method190(local33);
							}
						}
						if (local28 == 705) {
							this.method649(local18, local23, local33);
							this.aClass4_Sub1_Sub3_9.method156(139);
							this.aClass4_Sub1_Sub3_9.method190(local18 + this.anInt1036);
							this.aClass4_Sub1_Sub3_9.method158(local33 >> 14 & 0x7FFF);
							this.aClass4_Sub1_Sub3_9.method191(local23 + this.anInt1037);
						}
						if (local28 == 131) {
							local56 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local56 != null) {
								this.method690(false, 0, 1, local56.anIntArray156[0], local56.anIntArray157[0], 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
								this.anInt939 = super.anInt832;
								this.anInt940 = super.anInt833;
								this.anInt942 = 2;
								this.anInt941 = 0;
								this.aClass4_Sub1_Sub3_9.method156(8);
								this.aClass4_Sub1_Sub3_9.method158(local33);
								this.aClass4_Sub1_Sub3_9.method158(this.anInt888);
								this.aClass4_Sub1_Sub3_9.method192(this.anInt886, (byte) 9);
								this.aClass4_Sub1_Sub3_9.method190(this.anInt887);
							}
						}
						@Pc(3083) long local3083;
						if (local28 == 342 || local28 == 539 || local28 == 388 || local28 == 711) {
							local571 = this.aStringArray10[arg0];
							local575 = local571.indexOf("@whi@");
							if (local575 != -1) {
								local3083 = Class46.method550(local571.substring(local575 + 5).trim());
								if (local28 == 342) {
									this.method716(local3083, this.anInt1059);
								}
								if (local28 == 539) {
									this.method691(local3083);
								}
								if (local28 == 388) {
									this.method683(local3083);
								}
								if (local28 == 711) {
									this.method641(local3083);
								}
							}
						}
						if (local28 == 738) {
							this.aClass4_Sub1_Sub3_9.method156(47);
							this.aClass4_Sub1_Sub3_9.method158(local23);
							local442 = Class27.method405(local23);
							if (local442.anIntArrayArray10 != null && local442.anIntArrayArray10[0][0] == 5) {
								local575 = local442.anIntArrayArray10[0][1];
								if (this.anIntArray212[local575] != local442.anIntArray126[0]) {
									this.anIntArray212[local575] = local442.anIntArray126[0];
									this.method642(local575);
									this.aBoolean251 = true;
								}
							}
						}
						if (local28 == 17) {
							local571 = this.aStringArray10[arg0];
							local575 = local571.indexOf("@whi@");
							if (local575 != -1) {
								local3083 = Class46.method550(local571.substring(local575 + 5).trim());
								local596 = -1;
								for (@Pc(3196) int local3196 = 0; local3196 < this.anInt890; local3196++) {
									if (this.aLongArray4[local3196] == local3083) {
										local596 = local3196;
										break;
									}
								}
								if (local596 != -1 && this.anIntArray214[local596] > 0) {
									this.aBoolean255 = true;
									this.anInt1020 = 0;
									this.aBoolean270 = true;
									this.aString27 = "";
									this.anInt1051 = 3;
									this.aLong33 = this.aLongArray4[local596];
									this.aString23 = "Enter message to send to " + this.aStringArray13[local596];
								}
							}
						}
						if (local28 == 816) {
							this.aClass4_Sub1_Sub3_9.method156(244);
							this.aClass4_Sub1_Sub3_9.method191(local18);
							this.aClass4_Sub1_Sub3_9.method192(local23, (byte) 9);
							this.aClass4_Sub1_Sub3_9.method192(local33, (byte) 9);
							this.anInt921 = 0;
							this.anInt922 = local23;
							this.anInt923 = local18;
							this.anInt924 = 2;
							if (Class27.method405(local23).anInt476 == this.anInt906) {
								this.anInt924 = 1;
							}
							if (Class27.method405(local23).anInt476 == this.anInt935) {
								this.anInt924 = 3;
							}
						}
						if (local28 == 46) {
							local356 = this.method690(false, 0, 0, local18, local23, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							if (!local356) {
								this.method690(false, 0, 1, local18, local23, 1, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
							}
							this.anInt939 = super.anInt832;
							this.anInt940 = super.anInt833;
							this.anInt942 = 2;
							this.anInt941 = 0;
							this.aClass4_Sub1_Sub3_9.method156(176);
							this.aClass4_Sub1_Sub3_9.method192(local18 + this.anInt1036, (byte) 9);
							this.aClass4_Sub1_Sub3_9.method191(local23 + this.anInt1037);
							this.aClass4_Sub1_Sub3_9.method191(local33);
						}
						if (local28 == 506) {
							if (this.aBoolean271) {
								this.aClass25_1.method380(local23 - 4, local18 - 4);
							} else {
								this.aClass25_1.method380(super.anInt833 - 4, super.anInt832 - 4);
							}
						}
						if (local28 == 841) {
							this.method607(this.anInt1005);
							this.anInt1005 = -1;
							this.aBoolean255 = true;
						}
						this.anInt885 = 0;
						this.anInt991 = 0;
						this.aBoolean251 = true;
					}
				}
			}
		} catch (@Pc(3450) RuntimeException local3450) {
			signlink.reporterror("98704, " + -41187 + ", " + arg0 + ", " + local3450.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IIILjava/lang/String;)Lclient!TKEGJSFV;")
	private Class38 method665(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass11Array1[0] != null) {
					local3 = this.aClass11Array1[0].method149(arg3);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg1) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class38((byte) -74, local3);
			}
			local34 = 0;
			this.anInt892 += 0;
			while (local3 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method585("Requesting " + arg0, arg2);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method652(arg4 + arg1);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class4_Sub1_Sub3 local101 = new Class4_Sub1_Sub3(local90, false);
					local101.anInt242 = 3;
					@Pc(109) int local109 = local101.method171() + 6;
					@Pc(111) int local111 = 6;
					local3 = new byte[local109];
					for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
						local3[local116] = local90[local116];
					}
					@Pc(134) int local134;
					while (local111 < local109) {
						local134 = local109 - local111;
						if (local134 > 1000) {
							local134 = 1000;
						}
						@Pc(145) int local145 = local87.read(local3, local111, local134);
						if (local145 < 0) {
							(new StringBuffer("Length error: ")).append(local111).append("/").append(local109).toString();
							throw new IOException("EOF");
						}
						local111 += local145;
						@Pc(174) int local174 = local111 * 100 / local109;
						if (local174 != local76) {
							this.method585("Loading " + arg0 + " - " + local174 + "%", arg2);
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass11Array1[0] != null) {
							this.aClass11Array1[0].method150(local3, local3.length, arg3);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass11Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg1) {
							local3 = null;
							local34++;
							local61 = "Checksum error: " + local134;
						}
					}
				} catch (@Pc(254) IOException local254) {
					if (local61.equals("Unknown error")) {
						local61 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(264) NullPointerException local264) {
					local61 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(273) ArrayIndexOutOfBoundsException local273) {
					local61 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(282) Exception local282) {
					local61 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local76 = local5; local76 > 0; local76--) {
						if (local34 >= 3) {
							this.method585("Game updated - please reload page", arg2);
							local76 = 10;
						} else {
							this.method585(local61 + " - Retrying in " + local76, arg2);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(326) Exception local326) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean263 = !this.aBoolean263;
				}
			}
			return new Class38((byte) -74, local3);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("29648, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg3 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg4;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class4_Sub1_Sub1_Sub3.anIntArray90[local5];
				local27 = Class4_Sub1_Sub1_Sub3.anIntArray91[local5];
				local37 = local27 * 0 - arg4 * local23 >> 16;
				local17 = local23 * 0 + arg4 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class4_Sub1_Sub1_Sub3.anIntArray90[local11];
				local27 = Class4_Sub1_Sub1_Sub3.anIntArray91[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt983 = arg0 - local13;
			this.anInt984 = arg2 - local15;
			this.anInt985 = arg5 - local17;
			this.anInt986 = arg3;
			this.anInt987 = arg1;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("47689, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 38459 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!LORGYGVM;I)Z")
	private boolean method667(@OriginalArg(0) Class27 arg0) {
		try {
			if (arg0.anIntArray130 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray130.length; local6++) {
				@Pc(14) int local14 = this.method677(arg0, local6);
				@Pc(19) int local19 = arg0.anIntArray126[local6];
				if (arg0.anIntArray130[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray130[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray130[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("65657, " + arg0 + ", " + -434 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt855 = Integer.parseInt(this.getParameter("nodeid"));
		anInt856 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method657();
		} else {
			method694();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean234 = false;
		} else {
			aBoolean234 = true;
		}
		this.method574();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BILclient!EGCCHUZS;)V")
	private void method668(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt910; local1++) {
				@Pc(8) int local8 = this.anIntArray229[local1];
				@Pc(13) Class4_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method167();
				if ((local16 & 0x20) != 0) {
					local16 += arg1.method167() << 8;
				}
				this.method648(arg1, 590, local13, local8, local16);
			}
			if (this.aByte42 == 5) {
				;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("87716, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ILclient!EGCCHUZS;I)V")
	private void method669(@OriginalArg(1) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1032 = 0;
			this.anInt910 = 0;
			this.method625(arg0, arg1);
			this.method630(376, arg0, arg1);
			this.method623(arg0, arg1);
			@Pc(38) int local38;
			for (@Pc(31) int local31 = 0; local31 < this.anInt1032; local31++) {
				local38 = this.anIntArray266[local31];
				if (this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local38].anInt668 != anInt866) {
					this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local38].aClass2_1 = null;
					this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local38] = null;
				}
			}
			if (arg0.anInt242 != arg1) {
				signlink.reporterror(this.aString17 + " size mismatch in getnpcpos - pos:" + arg0.anInt242 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local38 = 0; local38 < this.anInt1009; local38++) {
				if (this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray262[local38]] == null) {
					signlink.reporterror(this.aString17 + " null entry in npc list - pos:" + local38 + " size:" + this.anInt1009);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("16826, " + -23633 + ", " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method670() {
		try {
			@Pc(6) int local6 = this.anInt837 * 128 + 64;
			@Pc(13) int local13 = this.anInt838 * 128 + 64;
			@Pc(24) int local24 = this.method699(local6, local13, this.anInt965) - this.anInt839;
			if (this.anInt983 < local6) {
				this.anInt983 += this.anInt840 + (local6 - this.anInt983) * this.anInt841 / 1000;
				if (this.anInt983 > local6) {
					this.anInt983 = local6;
				}
			}
			if (this.anInt983 > local6) {
				this.anInt983 -= this.anInt840 + (this.anInt983 - local6) * this.anInt841 / 1000;
				if (this.anInt983 < local6) {
					this.anInt983 = local6;
				}
			}
			if (this.anInt984 < local24) {
				this.anInt984 += this.anInt840 + (local24 - this.anInt984) * this.anInt841 / 1000;
				if (this.anInt984 > local24) {
					this.anInt984 = local24;
				}
			}
			if (this.anInt984 > local24) {
				this.anInt984 -= this.anInt840 + (this.anInt984 - local24) * this.anInt841 / 1000;
				if (this.anInt984 < local24) {
					this.anInt984 = local24;
				}
			}
			if (this.anInt985 < local13) {
				this.anInt985 += this.anInt840 + (local13 - this.anInt985) * this.anInt841 / 1000;
				if (this.anInt985 > local13) {
					this.anInt985 = local13;
				}
			}
			if (this.anInt985 > local13) {
				this.anInt985 -= this.anInt840 + (this.anInt985 - local13) * this.anInt841 / 1000;
				if (this.anInt985 < local13) {
					this.anInt985 = local13;
				}
			}
			anInt871++;
			if (anInt871 > 75) {
				anInt871 = 0;
				this.aClass4_Sub1_Sub3_9.method156(183);
			}
			local6 = this.anInt1026 * 128 + 64;
			local13 = this.anInt1027 * 128 + 64;
			local24 = this.method699(local6, local13, this.anInt965) - this.anInt1028;
			@Pc(246) int local246 = local6 - this.anInt983;
			@Pc(251) int local251 = local24 - this.anInt984;
			@Pc(256) int local256 = local13 - this.anInt985;
			@Pc(267) int local267 = (int) Math.sqrt((double) (local246 * local246 + local256 * local256));
			@Pc(278) int local278 = (int) (Math.atan2((double) local251, (double) local267) * 325.949D) & 0x7FF;
			@Pc(289) int local289 = (int) (Math.atan2((double) local246, (double) local256) * -325.949D) & 0x7FF;
			if (local278 < 128) {
				local278 = 128;
			}
			if (local278 > 383) {
				local278 = 383;
			}
			if (this.anInt986 < local278) {
				this.anInt986 += this.anInt1029 + (local278 - this.anInt986) * this.anInt1030 / 1000;
				if (this.anInt986 > local278) {
					this.anInt986 = local278;
				}
			}
			if (this.anInt986 > local278) {
				this.anInt986 -= this.anInt1029 + (this.anInt986 - local278) * this.anInt1030 / 1000;
				if (this.anInt986 < local278) {
					this.anInt986 = local278;
				}
			}
			@Pc(360) int local360 = local289 - this.anInt987;
			if (local360 > 1024) {
				local360 -= 2048;
			}
			if (local360 < -1024) {
				local360 += 2048;
			}
			if (local360 > 0) {
				this.anInt987 += this.anInt1029 + local360 * this.anInt1030 / 1000;
				this.anInt987 &= 0x7FF;
			}
			if (local360 < 0) {
				this.anInt987 -= this.anInt1029 + -local360 * this.anInt1030 / 1000;
				this.anInt987 &= 0x7FF;
			}
			@Pc(418) int local418 = local289 - this.anInt987;
			if (local418 > 1024) {
				local418 -= 2048;
			}
			if (local418 < -1024) {
				local418 += 2048;
			}
			if (local418 < 0 && local360 > 0 || local418 > 0 && local360 < 0) {
				this.anInt987 = local289;
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("84990, " + -9251 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method671(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(6) Class4_Sub3 local6 = (Class4_Sub3) this.aClass23_10.method315();
			this.aBoolean272 &= arg0;
			while (local6 != null) {
				if (local6.anInt720 == -1) {
					local6.anInt721 = 0;
					this.method707(local6);
				} else {
					local6.method528();
				}
				local6 = (Class4_Sub3) this.aClass23_10.method317();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("16830, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass25_1.method368(arg2, arg1, arg4);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass25_1.method372(arg2, arg1, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg3;
				if (local8 > 0) {
					local30 = arg0;
				}
				@Pc(38) int[] local38 = this.aClass4_Sub1_Sub2_Sub2_17.anIntArray47;
				local52 = arg1 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class20 local61 = Class20.method236(local58);
				if (local61.anInt312 == -1) {
					if (local28 == 0 || local28 == 2) {
						if (local24 == 0) {
							local38[local52] = local30;
							local38[local52 + 512] = local30;
							local38[local52 + 1024] = local30;
							local38[local52 + 1536] = local30;
						} else if (local24 == 1) {
							local38[local52] = local30;
							local38[local52 + 1] = local30;
							local38[local52 + 2] = local30;
							local38[local52 + 3] = local30;
						} else if (local24 == 2) {
							local38[local52 + 3] = local30;
							local38[local52 + 3 + 512] = local30;
							local38[local52 + 3 + 1024] = local30;
							local38[local52 + 3 + 1536] = local30;
						} else if (local24 == 3) {
							local38[local52 + 1536] = local30;
							local38[local52 + 1536 + 1] = local30;
							local38[local52 + 1536 + 2] = local30;
							local38[local52 + 1536 + 3] = local30;
						}
					}
					if (local28 == 3) {
						if (local24 == 0) {
							local38[local52] = local30;
						} else if (local24 == 1) {
							local38[local52 + 3] = local30;
						} else if (local24 == 2) {
							local38[local52 + 3 + 1536] = local30;
						} else if (local24 == 3) {
							local38[local52 + 1536] = local30;
						}
					}
					if (local28 == 2) {
						if (local24 == 3) {
							local38[local52] = local30;
							local38[local52 + 512] = local30;
							local38[local52 + 1024] = local30;
							local38[local52 + 1536] = local30;
						} else if (local24 == 0) {
							local38[local52] = local30;
							local38[local52 + 1] = local30;
							local38[local52 + 2] = local30;
							local38[local52 + 3] = local30;
						} else if (local24 == 1) {
							local38[local52 + 3] = local30;
							local38[local52 + 3 + 512] = local30;
							local38[local52 + 3 + 1024] = local30;
							local38[local52 + 3 + 1536] = local30;
						} else if (local24 == 2) {
							local38[local52 + 1536] = local30;
							local38[local52 + 1536 + 1] = local30;
							local38[local52 + 1536 + 2] = local30;
							local38[local52 + 1536 + 3] = local30;
						}
					}
				} else {
					@Pc(71) Class4_Sub1_Sub2_Sub1 local71 = this.aClass4_Sub1_Sub2_Sub1Array3[local61.anInt312];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt319 * 4 - local71.anInt195) / 2;
						@Pc(93) int local93 = (local61.anInt310 * 4 - local71.anInt196) / 2;
						local71.method86((104 - arg4 - local61.anInt310) * 4 + local93 + 48, arg1 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass25_1.method370(arg2, arg1, arg4);
			if (local8 != 0) {
				local18 = this.aClass25_1.method372(arg2, arg1, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class20 local447 = Class20.method236(local30);
				@Pc(479) int local479;
				if (local447.anInt312 != -1) {
					@Pc(457) Class4_Sub1_Sub2_Sub1 local457 = this.aClass4_Sub1_Sub2_Sub1Array3[local447.anInt312];
					if (local457 != null) {
						local58 = (local447.anInt319 * 4 - local457.anInt195) / 2;
						local479 = (local447.anInt310 * 4 - local457.anInt196) / 2;
						local457.method86((104 - arg4 - local447.anInt310) * 4 + local479 + 48, arg1 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass4_Sub1_Sub2_Sub2_17.anIntArray47;
					local479 = arg1 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local516[local479 + 1536] = local52;
						local516[local479 + 1024 + 1] = local52;
						local516[local479 + 512 + 2] = local52;
						local516[local479 + 3] = local52;
					} else {
						local516[local479] = local52;
						local516[local479 + 512 + 1] = local52;
						local516[local479 + 1024 + 2] = local52;
						local516[local479 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass25_1.method371(arg2, arg1, arg4);
			this.anInt892 += 0;
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(617) Class20 local617 = Class20.method236(local18);
				if (local617.anInt312 != -1) {
					@Pc(627) Class4_Sub1_Sub2_Sub1 local627 = this.aClass4_Sub1_Sub2_Sub1Array3[local617.anInt312];
					if (local627 != null) {
						local30 = (local617.anInt319 * 4 - local627.anInt195) / 2;
						@Pc(649) int local649 = (local617.anInt310 * 4 - local627.anInt196) / 2;
						local627.method86((104 - arg4 - local617.anInt310) * 4 + local649 + 48, arg1 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("46116, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method673() {
		try {
			this.aClass4_Sub1_Sub2_Sub1_19 = new Class4_Sub1_Sub2_Sub1(this.aClass38_2, "titlebox", 0);
			this.aClass4_Sub1_Sub2_Sub1_20 = new Class4_Sub1_Sub2_Sub1(this.aClass38_2, "titlebutton", 0);
			this.aClass4_Sub1_Sub2_Sub1Array5 = new Class4_Sub1_Sub2_Sub1[12];
			this.anInt892 += 0;
			for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
				this.aClass4_Sub1_Sub2_Sub1Array5[local31] = new Class4_Sub1_Sub2_Sub1(this.aClass38_2, "runes", local31);
			}
			this.aClass4_Sub1_Sub2_Sub2_11 = new Class4_Sub1_Sub2_Sub2(128, 265);
			this.aClass4_Sub1_Sub2_Sub2_12 = new Class4_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(64) int local64 = 0; local64 < 33920; local64++) {
				this.aClass4_Sub1_Sub2_Sub2_11.anIntArray47[local64] = this.aClass47_22.anIntArray203[local64];
			}
			for (@Pc(82) int local82 = 0; local82 < 33920; local82++) {
				this.aClass4_Sub1_Sub2_Sub2_12.anIntArray47[local82] = this.aClass47_23.anIntArray203[local82];
			}
			this.anIntArray250 = new int[256];
			for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
				this.anIntArray250[local104] = local104 * 262144;
			}
			for (@Pc(119) int local119 = 0; local119 < 64; local119++) {
				this.anIntArray250[local119 + 64] = local119 * 1024 + 16711680;
			}
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray250[local138 + 128] = local138 * 4 + 16776960;
			}
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				this.anIntArray250[local157 + 192] = 16777215;
			}
			this.anIntArray251 = new int[256];
			for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
				this.anIntArray251[local176] = local176 * 1024;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray251[local191 + 64] = local191 * 4 + 65280;
			}
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray251[local210 + 128] = local210 * 262144 + 65535;
			}
			for (@Pc(229) int local229 = 0; local229 < 64; local229++) {
				this.anIntArray251[local229 + 192] = 16777215;
			}
			this.anIntArray252 = new int[256];
			for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
				this.anIntArray252[local248] = local248 * 4;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray252[local263 + 64] = local263 * 262144 + 255;
			}
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray252[local282 + 128] = local282 * 1024 + 16711935;
			}
			for (@Pc(301) int local301 = 0; local301 < 64; local301++) {
				this.anIntArray252[local301 + 192] = 16777215;
			}
			this.anIntArray249 = new int[256];
			this.anIntArray239 = new int[32768];
			this.anIntArray240 = new int[32768];
			this.method586(null);
			this.anIntArray264 = new int[32768];
			this.anIntArray265 = new int[32768];
			this.method585("Connecting to fileserver", 10);
			if (!this.aBoolean249) {
				this.aBoolean258 = true;
				this.aBoolean249 = true;
				this.method584(this, 2);
			}
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("61145, " + 0 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method674() {
		try {
			if (aBoolean235 && this.anInt874 == 2 && Class29.anInt524 != this.anInt965) {
				this.method635("Loading - please wait.", null);
				this.anInt874 = 1;
				this.aLong29 = System.currentTimeMillis();
			}
			if (this.anInt874 == 1) {
				@Pc(37) int local37 = this.method675(824);
				if (local37 != 0 && System.currentTimeMillis() - this.aLong29 > 360000L) {
					signlink.reporterror(this.aString17 + " glcfb " + this.aLong30 + "," + local37 + "," + aBoolean235 + "," + this.aClass11Array1[0] + "," + this.aClass10_Sub1_1.method137() + "," + this.anInt965 + "," + this.anInt1057 + "," + this.anInt1058);
					this.aLong29 = System.currentTimeMillis();
				}
			}
			if (this.anInt874 == 2 && this.anInt965 != this.anInt934) {
				this.anInt934 = this.anInt965;
				this.method684(this.anInt965);
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("64967, " + -851 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)I")
	private int method675(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArray6.length; local7++) {
				if (this.aByteArrayArray6[local7] == null && this.anIntArray245[local7] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local7] == null && this.anIntArray246[local7] != -1) {
					return -2;
				}
			}
			@Pc(43) boolean local43 = true;
			for (@Pc(45) int local45 = 0; local45 < this.aByteArrayArray6.length; local45++) {
				@Pc(52) byte[] local52 = this.aByteArrayArray5[local45];
				if (local52 != null) {
					@Pc(66) int local66 = (this.anIntArray244[local45] >> 8) * 64 - this.anInt1036;
					@Pc(78) int local78 = (this.anIntArray244[local45] & 0xFF) * 64 - this.anInt1037;
					if (this.aBoolean245) {
						local66 = 10;
						local78 = 10;
					}
					local43 &= Class29.method419(local52, local66, local78);
				}
			}
			if (!local43) {
				return -3;
			} else if (this.aBoolean275) {
				return -4;
			} else {
				this.anInt874 = 2;
				Class29.anInt524 = this.anInt965;
				this.method708();
				this.aClass4_Sub1_Sub3_9.method156(209);
				return 0;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("43687, " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ZI)V")
	private void method676(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class27 local2 = Class27.method405(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray129.length && local2.anIntArray129[local4] != -1; local4++) {
				@Pc(18) Class27 local18 = Class27.method405(local2.anIntArray129[local4]);
				if (local18.anInt471 == 1) {
					this.method676(local18.anInt482);
				}
				local18.anInt465 = 0;
				local18.anInt496 = 0;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("90281, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!LORGYGVM;I)I")
	private int method677(@OriginalArg(1) Class27 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt892 += 0;
			if (arg0.anIntArrayArray10 == null || arg1 >= arg0.anIntArrayArray10.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg0.anIntArrayArray10[arg1];
				@Pc(24) int local24 = 0;
				@Pc(26) int local26 = 0;
				@Pc(28) byte local28 = 0;
				while (true) {
					@Pc(33) int local33 = local22[local26++];
					@Pc(35) int local35 = 0;
					@Pc(37) byte local37 = 0;
					if (local33 == 0) {
						return local24;
					}
					if (local33 == 1) {
						local35 = this.anIntArray275[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray215[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray256[local22[local26++]];
					}
					@Pc(83) Class27 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local33 == 4) {
						local83 = Class27.method405(local22[local26++]);
						local88 = local22[local26++];
						if (local88 >= 0 && local88 < Class44.anInt779 && (!Class44.method536(local88).aBoolean218 || aBoolean234)) {
							for (local101 = 0; local101 < local83.anIntArray124.length; local101++) {
								if (local83.anIntArray124[local101] == local88 + 1) {
									local35 += local83.anIntArray128[local101];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray212[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray218[this.anIntArray215[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray212[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt689;
					}
					@Pc(176) int local176;
					if (local33 == 9) {
						for (local176 = 0; local176 < Class30.anInt527; local176++) {
							if (Class30.aBooleanArray6[local176]) {
								local35 += this.anIntArray215[local176];
							}
						}
					}
					if (local33 == 10) {
						local83 = Class27.method405(local22[local26++]);
						local88 = local22[local26++] + 1;
						if (local88 >= 0 && local88 < Class44.anInt779 && (!Class44.method536(local88).aBoolean218 || aBoolean234)) {
							for (local101 = 0; local101 < local83.anIntArray124.length; local101++) {
								if (local83.anIntArray124[local101] == local88) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt994;
					}
					if (local33 == 12) {
						local35 = this.anInt863;
					}
					if (local33 == 13) {
						local176 = this.anIntArray212[local22[local26++]];
						local88 = local22[local26++];
						local35 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local176 = local22[local26++];
						@Pc(290) Class12 local290 = Class12.aClass12Array1[local176];
						local101 = local290.anInt248;
						@Pc(296) int local296 = local290.anInt249;
						@Pc(299) int local299 = local290.anInt250;
						@Pc(305) int local305 = anIntArray261[local299 - local296];
						local35 = this.anIntArray212[local101] >> local296 & local305;
					}
					if (local33 == 15) {
						local37 = 1;
					}
					if (local33 == 16) {
						local37 = 2;
					}
					if (local33 == 17) {
						local37 = 3;
					}
					if (local33 == 18) {
						local35 = (aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 >> 7) + this.anInt1036;
					}
					if (local33 == 19) {
						local35 = (aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 >> 7) + this.anInt1037;
					}
					if (local33 == 20) {
						local35 = local22[local26++];
					}
					if (local37 == 0) {
						if (local28 == 0) {
							local24 += local35;
						}
						if (local28 == 1) {
							local24 -= local35;
						}
						if (local28 == 2 && local35 != 0) {
							local24 /= local35;
						}
						if (local28 == 3) {
							local24 *= local35;
						}
						local28 = 0;
					} else {
						local28 = local37;
					}
				}
			} catch (@Pc(398) Exception local398) {
				return -1;
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("60036, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!EGCCHUZS;II)V")
	private void method678(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt243 + 10 < arg1 * 8) {
					@Pc(16) int local16 = arg0.method178(11);
					if (local16 != 2047) {
						if (this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local16] == null) {
							this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local16] = new Class4_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass4_Sub1_Sub3Array1[local16] != null) {
								this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local16].method476(this.aClass4_Sub1_Sub3Array1[local16], 352);
							}
						}
						this.anIntArray228[this.anInt909++] = local16;
						@Pc(62) Class4_Sub1_Sub1_Sub1_Sub2 local62 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local16];
						local62.anInt668 = anInt866;
						@Pc(70) int local70 = arg0.method178(1);
						@Pc(75) int local75 = arg0.method178(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg0.method178(1);
						if (local84 == 1) {
							this.anIntArray229[this.anInt910++] = local16;
						}
						@Pc(103) int local103 = arg0.method178(5);
						if (local103 > 15) {
							local103 -= 32;
						}
						local62.method470(local70 == 1, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0] + local75, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0] + local103);
						continue;
					}
				}
				arg0.method179();
				return;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("7770, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method579() {
		try {
			if (!this.aBoolean253 && !this.aBoolean238 && !this.aBoolean265) {
				anInt866++;
				if (this.aBoolean272) {
					this.method710();
				} else {
					this.method598((byte) 1);
				}
				this.method709();
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("43509, " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method679() {
		try {
			this.aBoolean256 = true;
			try {
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(13) int local13 = 0;
				@Pc(15) int local15 = 20;
				while (this.aBoolean249) {
					this.anInt881++;
					this.method704();
					this.method704();
					this.method721();
					local13++;
					if (local13 > 10) {
						@Pc(38) long local38 = System.currentTimeMillis();
						@Pc(47) int local47 = (int) (local38 - local11) / 10 - local15;
						local15 = 40 - local47;
						if (local15 < 5) {
							local15 = 5;
						}
						local13 = 0;
						local11 = local38;
					}
					try {
						Thread.sleep((long) local15);
					} catch (@Pc(65) Exception local65) {
					}
				}
			} catch (@Pc(71) Exception local71) {
			}
			this.aBoolean256 = false;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("75076, " + -80 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method680() {
		try {
			this.anInt903 = 0;
			@Pc(71) int local71;
			for (@Pc(6) int local6 = -1; local6 < this.anInt909 + this.anInt1009; local6++) {
				@Pc(13) Class4_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass4_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local6 < this.anInt909) {
					local13 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray228[local6]];
				} else {
					local13 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray262[local6 - this.anInt909]];
				}
				if (local13 != null && local13.method469()) {
					@Pc(54) Class2 local54;
					if (local13 instanceof Class4_Sub1_Sub1_Sub1_Sub1) {
						local54 = ((Class4_Sub1_Sub1_Sub1_Sub1) local13).aClass2_1;
						if (local54.anIntArray3 != null) {
							local54 = local54.method6(this.aByte30);
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt909) {
						local54 = ((Class4_Sub1_Sub1_Sub1_Sub1) local13).aClass2_1;
						if (local54.anInt17 >= 0 && local54.anInt17 < this.aClass4_Sub1_Sub2_Sub2Array10.length) {
							this.method589(local13, (byte) 5, local13.anInt642 + 15);
							if (this.anInt1017 > -1) {
								this.aClass4_Sub1_Sub2_Sub2Array10[local54.anInt17].method259(this.anInt1018 - 30, this.anInt1017 - 12);
							}
						}
						if (this.anInt928 == 1 && this.anInt937 == this.anIntArray262[local6 - this.anInt909] && anInt866 % 20 < 10) {
							this.method589(local13, (byte) 5, local13.anInt642 + 15);
							if (this.anInt1017 > -1) {
								this.aClass4_Sub1_Sub2_Sub2Array9[0].method259(this.anInt1018 - 28, this.anInt1017 - 12);
							}
						}
					} else {
						local71 = 30;
						@Pc(74) Class4_Sub1_Sub1_Sub1_Sub2 local74 = (Class4_Sub1_Sub1_Sub1_Sub2) local13;
						if (local74.anInt679 != -1 || local74.anInt680 != -1) {
							this.method589(local13, (byte) 5, local13.anInt642 + 15);
							if (this.anInt1017 > -1) {
								if (local74.anInt679 != -1) {
									this.aClass4_Sub1_Sub2_Sub2Array7[local74.anInt679].method259(this.anInt1018 - 30, this.anInt1017 - 12);
									local71 += 25;
								}
								if (local74.anInt680 != -1) {
									this.aClass4_Sub1_Sub2_Sub2Array10[local74.anInt680].method259(this.anInt1018 - local71, this.anInt1017 - 12);
									local71 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt928 == 10 && this.anInt901 == this.anIntArray228[local6]) {
							this.method589(local13, (byte) 5, local13.anInt642 + 15);
							if (this.anInt1017 > -1) {
								this.aClass4_Sub1_Sub2_Sub2Array9[1].method259(this.anInt1018 - local71, this.anInt1017 - 12);
							}
						}
					}
					if (local13.aString14 != null && (local6 >= this.anInt909 || this.anInt1019 == 0 || this.anInt1019 == 3 || this.anInt1019 == 1 && this.method645(((Class4_Sub1_Sub1_Sub1_Sub2) local13).aString15))) {
						this.method589(local13, (byte) 5, local13.anInt642);
						if (this.anInt1017 > -1 && this.anInt903 < this.anInt904) {
							this.anIntArray224[this.anInt903] = this.aClass4_Sub1_Sub2_Sub4_4.method498(local13.aString14) / 2;
							this.anIntArray223[this.anInt903] = this.aClass4_Sub1_Sub2_Sub4_4.anInt708;
							this.anIntArray221[this.anInt903] = this.anInt1017;
							this.anIntArray222[this.anInt903] = this.anInt1018;
							this.anIntArray225[this.anInt903] = local13.anInt662;
							this.anIntArray226[this.anInt903] = local13.anInt663;
							this.anIntArray227[this.anInt903] = local13.anInt641;
							this.aStringArray8[this.anInt903++] = local13.aString14;
							if (this.anInt872 == 0 && local13.anInt663 >= 1 && local13.anInt663 <= 3) {
								this.anIntArray223[this.anInt903] += 10;
								this.anIntArray222[this.anInt903] += 5;
							}
							if (this.anInt872 == 0 && local13.anInt663 == 4) {
								this.anIntArray224[this.anInt903] = 60;
							}
							if (this.anInt872 == 0 && local13.anInt663 == 5) {
								this.anIntArray223[this.anInt903] += 5;
							}
						}
					}
					if (local13.anInt636 > anInt866) {
						this.method589(local13, (byte) 5, local13.anInt642 + 15);
						if (this.anInt1017 > -1) {
							local71 = local13.anInt637 * 30 / local13.anInt638;
							if (local71 > 30) {
								local71 = 30;
							}
							Class4_Sub1_Sub2.method487(this.anInt1018 - 3, local71, 5, this.anInt1017 - 15, 65280);
							Class4_Sub1_Sub2.method487(this.anInt1018 - 3, 30 - local71, 5, this.anInt1017 + local71 - 15, 16711680);
						}
					}
					for (local71 = 0; local71 < 4; local71++) {
						if (local13.anIntArray160[local71] > anInt866) {
							this.method589(local13, (byte) 5, local13.anInt642 / 2);
							if (this.anInt1017 > -1) {
								if (local71 == 1) {
									this.anInt1018 -= 20;
								}
								if (local71 == 2) {
									this.anInt1017 -= 15;
									this.anInt1018 -= 10;
								}
								if (local71 == 3) {
									this.anInt1017 += 15;
									this.anInt1018 -= 10;
								}
								this.aClass4_Sub1_Sub2_Sub2Array8[local13.anIntArray159[local71]].method259(this.anInt1018 - 12, this.anInt1017 - 12);
								this.aClass4_Sub1_Sub2_Sub4_2.method495(0, this.anInt1018 + 4, this.anInt1017, String.valueOf(local13.anIntArray158[local71]));
								this.aClass4_Sub1_Sub2_Sub4_2.method495(16777215, this.anInt1018 + 3, this.anInt1017 - 1, String.valueOf(local13.anIntArray158[local71]));
							}
						}
					}
				}
			}
			anInt913++;
			if (anInt913 > 96) {
				anInt913 = 0;
				this.aClass4_Sub1_Sub3_9.method156(138);
			}
			for (@Pc(625) int local625 = 0; local625 < this.anInt903; local625++) {
				local71 = this.anIntArray221[local625];
				@Pc(637) int local637 = this.anIntArray222[local625];
				@Pc(642) int local642 = this.anIntArray224[local625];
				@Pc(647) int local647 = this.anIntArray223[local625];
				@Pc(649) boolean local649 = true;
				while (local649) {
					local649 = false;
					for (@Pc(655) int local655 = 0; local655 < local625; local655++) {
						if (local637 + 2 > this.anIntArray222[local655] - this.anIntArray223[local655] && local637 - local647 < this.anIntArray222[local655] + 2 && local71 - local642 < this.anIntArray221[local655] + this.anIntArray224[local655] && local71 + local642 > this.anIntArray221[local655] - this.anIntArray224[local655] && this.anIntArray222[local655] - this.anIntArray223[local655] < local637) {
							local637 = this.anIntArray222[local655] - this.anIntArray223[local655];
							local649 = true;
						}
					}
				}
				this.anInt1017 = this.anIntArray221[local625];
				this.anInt1018 = this.anIntArray222[local625] = local637;
				@Pc(754) String local754 = this.aStringArray8[local625];
				if (this.anInt872 == 0) {
					@Pc(759) int local759 = 16776960;
					if (this.anIntArray225[local625] < 6) {
						local759 = this.anIntArray263[this.anIntArray225[local625]];
					}
					if (this.anIntArray225[local625] == 6) {
						local759 = this.anInt1045 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray225[local625] == 7) {
						local759 = this.anInt1045 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray225[local625] == 8) {
						local759 = this.anInt1045 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(834) int local834;
					if (this.anIntArray225[local625] == 9) {
						local834 = 150 - this.anIntArray227[local625];
						if (local834 < 50) {
							local759 = local834 * 1280 + 16711680;
						} else if (local834 < 100) {
							local759 = 16776960 - (local834 - 50) * 327680;
						} else if (local834 < 150) {
							local759 = (local834 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray225[local625] == 10) {
						local834 = 150 - this.anIntArray227[local625];
						if (local834 < 50) {
							local759 = local834 * 5 + 16711680;
						} else if (local834 < 100) {
							local759 = 16711935 - (local834 - 50) * 327680;
						} else if (local834 < 150) {
							local759 = (local834 - 100) * 327680 + 255 - (local834 - 100) * 5;
						}
					}
					if (this.anIntArray225[local625] == 11) {
						local834 = 150 - this.anIntArray227[local625];
						if (local834 < 50) {
							local759 = 16777215 - local834 * 327685;
						} else if (local834 < 100) {
							local759 = (local834 - 50) * 327685 + 65280;
						} else if (local834 < 150) {
							local759 = 16777215 - (local834 - 100) * 327680;
						}
					}
					if (this.anIntArray226[local625] == 0) {
						this.aClass4_Sub1_Sub2_Sub4_4.method495(0, this.anInt1018 + 1, this.anInt1017, local754);
						this.aClass4_Sub1_Sub2_Sub4_4.method495(local759, this.anInt1018, this.anInt1017, local754);
					}
					if (this.anIntArray226[local625] == 1) {
						this.aClass4_Sub1_Sub2_Sub4_4.method500(this.anInt1045, 0, local754, this.anInt1017, this.anInt1018 + 1);
						this.aClass4_Sub1_Sub2_Sub4_4.method500(this.anInt1045, local759, local754, this.anInt1017, this.anInt1018);
					}
					if (this.anIntArray226[local625] == 2) {
						this.aClass4_Sub1_Sub2_Sub4_4.method501(local754, this.anInt1045, this.anInt1018 + 1, this.anInt1017, 0);
						this.aClass4_Sub1_Sub2_Sub4_4.method501(local754, this.anInt1045, this.anInt1018, this.anInt1017, local759);
					}
					if (this.anIntArray226[local625] == 3) {
						this.aClass4_Sub1_Sub2_Sub4_4.method502(this.anInt1018 + 1, 150 - this.anIntArray227[local625], 0, this.anInt1017, local754, this.anInt1045);
						this.aClass4_Sub1_Sub2_Sub4_4.method502(this.anInt1018, 150 - this.anIntArray227[local625], local759, this.anInt1017, local754, this.anInt1045);
					}
					@Pc(1131) int local1131;
					if (this.anIntArray226[local625] == 4) {
						local834 = this.aClass4_Sub1_Sub2_Sub4_4.method498(local754);
						local1131 = (150 - this.anIntArray227[local625]) * (local834 + 100) / 150;
						Class4_Sub1_Sub2.method484(this.anInt1017 + 50, this.anInt1017 - 50, 0, 334);
						this.aClass4_Sub1_Sub2_Sub4_4.method499(this.anInt1018 + 1, local754, this.anInt1017 + 50 - local1131, 0);
						this.aClass4_Sub1_Sub2_Sub4_4.method499(this.anInt1018, local754, this.anInt1017 + 50 - local1131, local759);
						Class4_Sub1_Sub2.method483((byte) 1);
					}
					if (this.anIntArray226[local625] == 5) {
						local834 = 150 - this.anIntArray227[local625];
						local1131 = 0;
						if (local834 < 25) {
							local1131 = local834 - 25;
						} else if (local834 > 125) {
							local1131 = local834 - 125;
						}
						Class4_Sub1_Sub2.method484(512, 0, this.anInt1018 - this.aClass4_Sub1_Sub2_Sub4_4.anInt708 - 1, this.anInt1018 + 5);
						this.aClass4_Sub1_Sub2_Sub4_4.method495(0, this.anInt1018 + local1131 + 1, this.anInt1017, local754);
						this.aClass4_Sub1_Sub2_Sub4_4.method495(local759, this.anInt1018 + local1131, this.anInt1017, local754);
						Class4_Sub1_Sub2.method483((byte) 1);
					}
				} else {
					this.aClass4_Sub1_Sub2_Sub4_4.method495(0, this.anInt1018 + 1, this.anInt1017, local754);
					this.aClass4_Sub1_Sub2_Sub4_4.method495(16776960, this.anInt1018, this.anInt1017, local754);
				}
			}
		} catch (@Pc(1288) RuntimeException local1288) {
			signlink.reporterror("26962, " + 15 + ", " + local1288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)I")
	private int method681() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt986 < 310) {
				@Pc(22) int local22 = this.anInt983 >> 7;
				@Pc(27) int local27 = this.anInt985 >> 7;
				@Pc(32) int local32 = aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 >> 7;
				@Pc(37) int local37 = aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt965][local22][local27] & 0x4) != 0) {
					local3 = this.anInt965;
				}
				@Pc(59) int local59;
				if (local32 > local22) {
					local59 = local32 - local22;
				} else {
					local59 = local22 - local32;
				}
				@Pc(72) int local72;
				if (local37 > local27) {
					local72 = local37 - local27;
				} else {
					local72 = local27 - local37;
				}
				@Pc(87) int local87;
				@Pc(89) int local89;
				if (local59 > local72) {
					local87 = local72 * 65536 / local59;
					local89 = 32768;
					while (local22 != local32) {
						if (local22 < local32) {
							local22++;
						} else if (local22 > local32) {
							local22--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt965][local22][local27] & 0x4) != 0) {
							local3 = this.anInt965;
						}
						local89 += local87;
						if (local89 >= 65536) {
							local89 -= 65536;
							if (local27 < local37) {
								local27++;
							} else if (local27 > local37) {
								local27--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt965][local22][local27] & 0x4) != 0) {
								local3 = this.anInt965;
							}
						}
					}
				} else {
					local87 = local59 * 65536 / local72;
					local89 = 32768;
					while (local27 != local37) {
						if (local27 < local37) {
							local27++;
						} else if (local27 > local37) {
							local27--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt965][local22][local27] & 0x4) != 0) {
							local3 = this.anInt965;
						}
						local89 += local87;
						if (local89 >= 65536) {
							local89 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt965][local22][local27] & 0x4) != 0) {
								local3 = this.anInt965;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt965][aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 >> 7][aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 >> 7] & 0x4) != 0) {
				local3 = this.anInt965;
			}
			return local3;
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("85140, " + -1904 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)I")
	private int method682(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) int local9 = this.method699(this.anInt983, this.anInt985, this.anInt965);
			@Pc(13) boolean local13 = false;
			return local9 - this.anInt984 >= 800 || (this.aByteArrayArrayArray8[this.anInt965][this.anInt983 >> 7][this.anInt985 >> 7] & 0x4) == 0 ? 3 : this.anInt965;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("53904, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method683(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(12) int local12 = 0; local12 < this.anInt890; local12++) {
					if (this.aLongArray4[local12] == arg0) {
						this.anInt890--;
						this.aBoolean251 = true;
						for (@Pc(32) int local32 = local12; local32 < this.anInt890; local32++) {
							this.aStringArray13[local32] = this.aStringArray13[local32 + 1];
							this.anIntArray214[local32] = this.anIntArray214[local32 + 1];
							this.aLongArray4[local32] = this.aLongArray4[local32 + 1];
						}
						this.aClass4_Sub1_Sub3_9.method156(48);
						this.aClass4_Sub1_Sub3_9.method163(arg0);
						return;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("89887, " + false + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method684(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass4_Sub1_Sub2_Sub2_17.anIntArray47;
			@Pc(8) int local8 = local5.length;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				local5[local10] = 0;
			}
			@Pc(34) int local34;
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 1; local22 < 103; local22++) {
				local34 = (103 - local22) * 512 * 4 + 24628;
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray8[arg0][local36][local22] & 0x18) == 0) {
						this.aClass25_1.method377(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass25_1.method377(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass4_Sub1_Sub2_Sub2_17.method254();
			@Pc(155) int local155;
			for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
				for (local155 = 1; local155 < 103; local155++) {
					if ((this.aByteArrayArrayArray8[arg0][local155][local151] & 0x18) == 0) {
						this.method672(local36, local155, arg0, local34, local151);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local155][local151] & 0x8) != 0) {
						this.method672(local36, local155, arg0 + 1, local34, local151);
					}
				}
			}
			if (this.aClass47_17 != null) {
				this.aClass47_17.method556();
				Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
			}
			anInt1040++;
			if (anInt1040 > 95) {
				anInt1040 = 0;
				this.aClass4_Sub1_Sub3_9.method156(142);
			}
			this.anInt911 = 0;
			for (local155 = 0; local155 < 104; local155++) {
				for (@Pc(243) int local243 = 0; local243 < 104; local243++) {
					@Pc(253) int local253 = this.aClass25_1.method371(this.anInt965, local155, local243);
					if (local253 != 0) {
						local253 = local253 >> 14 & 0x7FFF;
						@Pc(265) int local265 = Class20.method236(local253).anInt320;
						if (local265 >= 0) {
							@Pc(269) int local269 = local155;
							@Pc(271) int local271 = local243;
							if (local265 != 22 && local265 != 29 && local265 != 34 && local265 != 36 && local265 != 46 && local265 != 47 && local265 != 48) {
								@Pc(303) int[][] local303 = this.aClass3Array1[this.anInt965].anIntArrayArray1;
								for (@Pc(305) int local305 = 0; local305 < 10; local305++) {
									@Pc(312) int local312 = (int) (Math.random() * 4.0D);
									if (local312 == 0 && local269 > 0 && local269 > local155 - 3 && (local303[local269 - 1][local271] & 0x1280108) == 0) {
										local269--;
									}
									if (local312 == 1 && local269 < 103 && local269 < local155 + 3 && (local303[local269 + 1][local271] & 0x1280180) == 0) {
										local269++;
									}
									if (local312 == 2 && local271 > 0 && local271 > local243 - 3 && (local303[local269][local271 - 1] & 0x1280102) == 0) {
										local271--;
									}
									if (local312 == 3 && local271 < 103 && local271 < local243 + 3 && (local303[local269][local271 + 1] & 0x1280120) == 0) {
										local271++;
									}
								}
							}
							this.aClass4_Sub1_Sub2_Sub2Array4[this.anInt911] = this.aClass4_Sub1_Sub2_Sub2Array5[local265];
							this.anIntArray234[this.anInt911] = local269;
							this.anIntArray235[this.anInt911] = local271;
							this.anInt911++;
						}
					}
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("36803, " + arg0 + ", " + 1 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method685() {
		try {
			if (super.anInt831 == 1) {
				if (super.anInt832 >= 6 && super.anInt832 <= 106 && super.anInt833 >= 467 && super.anInt833 <= 499) {
					this.anInt1019 = (this.anInt1019 + 1) % 4;
					this.aBoolean273 = true;
					this.aBoolean255 = true;
					this.aClass4_Sub1_Sub3_9.method156(0);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt1019);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt966);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt970);
				}
				if (super.anInt832 >= 135 && super.anInt832 <= 235 && super.anInt833 >= 467 && super.anInt833 <= 499) {
					this.anInt966 = (this.anInt966 + 1) % 3;
					this.aBoolean273 = true;
					this.aBoolean255 = true;
					this.aClass4_Sub1_Sub3_9.method156(0);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt1019);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt966);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt970);
				}
				if (super.anInt832 >= 273 && super.anInt832 <= 373 && super.anInt833 >= 467 && super.anInt833 <= 499) {
					this.anInt970 = (this.anInt970 + 1) % 3;
					this.aBoolean273 = true;
					this.aBoolean255 = true;
					this.aClass4_Sub1_Sub3_9.method156(0);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt1019);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt966);
					this.aClass4_Sub1_Sub3_9.method157(this.anInt970);
				}
				if (super.anInt832 >= 412 && super.anInt832 <= 512 && super.anInt833 >= 467 && super.anInt833 <= 499) {
					if (this.anInt906 == -1) {
						this.method706();
						this.aString24 = "";
						this.aBoolean267 = false;
						this.anInt864 = this.anInt906 = Class27.anInt469;
						return;
					}
					this.method628("", 0, "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("18947, " + 15 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!EGCCHUZS;I)V")
	private void method686(@OriginalArg(1) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method177();
			@Pc(14) int local14 = arg0.method178(1);
			if (local14 != 0) {
				@Pc(22) int local22 = arg0.method178(2);
				if (local22 == 0) {
					this.anIntArray229[this.anInt910++] = this.anInt908;
				} else {
					@Pc(45) int local45;
					@Pc(56) int local56;
					if (local22 == 1) {
						local45 = arg0.method178(3);
						aClass4_Sub1_Sub1_Sub1_Sub2_1.method473(this.anInt920, false, local45);
						local56 = arg0.method178(1);
						if (local56 == 1) {
							this.anIntArray229[this.anInt910++] = this.anInt908;
						}
					} else {
						@Pc(102) int local102;
						if (local22 == 2) {
							local45 = arg0.method178(3);
							aClass4_Sub1_Sub1_Sub1_Sub2_1.method473(this.anInt920, true, local45);
							local56 = arg0.method178(3);
							aClass4_Sub1_Sub1_Sub1_Sub2_1.method473(this.anInt920, true, local56);
							local102 = arg0.method178(1);
							if (local102 == 1) {
								this.anIntArray229[this.anInt910++] = this.anInt908;
							}
						} else if (local22 == 3) {
							local45 = arg0.method178(7);
							local56 = arg0.method178(7);
							local102 = arg0.method178(1);
							if (local102 == 1) {
								this.anIntArray229[this.anInt910++] = this.anInt908;
							}
							@Pc(156) int local156 = arg0.method178(1);
							this.anInt965 = arg0.method178(2);
							aClass4_Sub1_Sub1_Sub1_Sub2_1.method470(local156 == 1, local45, local56);
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("29814, " + false + ", " + arg0 + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method687() {
		try {
			while (true) {
				@Pc(14) int local14 = this.method577();
				if (local14 == -1) {
					return;
				}
				if (this.anInt906 != -1 && this.anInt906 == this.anInt864) {
					if (local14 == 8 && this.aString24.length() > 0) {
						this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
					}
					if ((local14 >= 97 && local14 <= 122 || local14 >= 65 && local14 <= 90 || local14 >= 48 && local14 <= 57 || local14 == 32) && this.aString24.length() < 12) {
						this.aString24 = this.aString24 + (char) local14;
					}
				} else {
					@Pc(195) int local195;
					if (this.aBoolean270) {
						if (local14 >= 32 && local14 <= 122 && this.aString27.length() < 80) {
							this.aString27 = this.aString27 + (char) local14;
							this.aBoolean255 = true;
						}
						if (local14 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean255 = true;
						}
						if (local14 == 13 || local14 == 10) {
							this.aBoolean270 = false;
							this.aBoolean255 = true;
							@Pc(154) long local154;
							if (this.anInt1051 == 1) {
								local154 = Class46.method550(this.aString27);
								this.method716(local154, this.anInt1059);
							}
							if (this.anInt1051 == 2 && this.anInt890 > 0) {
								local154 = Class46.method550(this.aString27);
								this.method683(local154);
							}
							if (this.anInt1051 == 3 && this.aString27.length() > 0) {
								this.aClass4_Sub1_Sub3_9.method156(31);
								this.aClass4_Sub1_Sub3_9.method157(0);
								local195 = this.aClass4_Sub1_Sub3_9.anInt242;
								this.aClass4_Sub1_Sub3_9.method163(this.aLong33);
								Class49.method565(this.aClass4_Sub1_Sub3_9, this.aString27);
								this.aClass4_Sub1_Sub3_9.method166(this.aClass4_Sub1_Sub3_9.anInt242 - local195);
								this.aString27 = Class49.method566(this.aString27, 624);
								this.aString27 = Class9.method98(this.aString27);
								this.method628(Class46.method554(Class46.method551(this.aLong33)), 6, this.aString27);
								if (this.anInt966 == 2) {
									this.anInt966 = 1;
									this.aBoolean273 = true;
									this.aClass4_Sub1_Sub3_9.method156(0);
									this.aClass4_Sub1_Sub3_9.method157(this.anInt1019);
									this.aClass4_Sub1_Sub3_9.method157(this.anInt966);
									this.aClass4_Sub1_Sub3_9.method157(this.anInt970);
								}
							}
							if (this.anInt1051 == 4 && this.anInt943 < 100) {
								local154 = Class46.method550(this.aString27);
								this.method691(local154);
							}
							if (this.anInt1051 == 5 && this.anInt943 > 0) {
								local154 = Class46.method550(this.aString27);
								this.method641(local154);
							}
						}
					} else if (this.anInt1020 == 1) {
						if (local14 >= 48 && local14 <= 57 && this.aString28.length() < 10) {
							this.aString28 = this.aString28 + (char) local14;
							this.aBoolean255 = true;
						}
						if (local14 == 8 && this.aString28.length() > 0) {
							this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							this.aBoolean255 = true;
						}
						if (local14 == 13 || local14 == 10) {
							if (this.aString28.length() > 0) {
								local195 = 0;
								try {
									local195 = Integer.parseInt(this.aString28);
								} catch (@Pc(372) Exception local372) {
								}
								this.aClass4_Sub1_Sub3_9.method156(67);
								this.aClass4_Sub1_Sub3_9.method161(local195);
							}
							this.anInt1020 = 0;
							this.aBoolean255 = true;
						}
					} else if (this.anInt1020 == 2) {
						if (local14 >= 32 && local14 <= 122 && this.aString28.length() < 12) {
							this.aString28 = this.aString28 + (char) local14;
							this.aBoolean255 = true;
						}
						if (local14 == 8 && this.aString28.length() > 0) {
							this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							this.aBoolean255 = true;
						}
						if (local14 == 13 || local14 == 10) {
							if (this.aString28.length() > 0) {
								this.aClass4_Sub1_Sub3_9.method156(143);
								this.aClass4_Sub1_Sub3_9.method163(Class46.method550(this.aString28));
							}
							this.anInt1020 = 0;
							this.aBoolean255 = true;
						}
					} else if (this.anInt935 == -1 && this.anInt990 == -1) {
						if (local14 >= 32 && local14 <= 122 && this.aString26.length() < 80) {
							this.aString26 = this.aString26 + (char) local14;
							this.aBoolean255 = true;
						}
						if (local14 == 8 && this.aString26.length() > 0) {
							this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							this.aBoolean255 = true;
						}
						if ((local14 == 13 || local14 == 10) && this.aString26.length() > 0) {
							if (this.anInt933 == 2) {
								if (this.aString26.equals("::clientdrop")) {
									this.method647();
								}
								if (this.aString26.equals("::lag")) {
									this.method689(8);
								}
								if (this.aString26.equals("::prefetchmusic")) {
									for (local195 = 0; local195 < this.aClass10_Sub1_1.method143(anInt912, 2); local195++) {
										this.aClass10_Sub1_1.method135(2, local195, anInt980, (byte) 1);
									}
								}
								if (this.aString26.equals("::fpson")) {
									aBoolean243 = true;
								}
								if (this.aString26.equals("::fpsoff")) {
									aBoolean243 = false;
								}
								if (this.aString26.equals("::noclip")) {
									for (local195 = 0; local195 < 4; local195++) {
										for (@Pc(604) int local604 = 1; local604 < 103; local604++) {
											for (@Pc(608) int local608 = 1; local608 < 103; local608++) {
												this.aClass3Array1[local195].anIntArrayArray1[local604][local608] = 0;
											}
										}
									}
								}
							}
							if (this.aString26.startsWith("::")) {
								this.aClass4_Sub1_Sub3_9.method156(227);
								this.aClass4_Sub1_Sub3_9.method157(this.aString26.length() - 1);
								this.aClass4_Sub1_Sub3_9.method164(this.aString26.substring(2));
							} else {
								@Pc(663) String local663 = this.aString26.toLowerCase();
								@Pc(665) byte local665 = 0;
								if (local663.startsWith("yellow:")) {
									local665 = 0;
									this.aString26 = this.aString26.substring(7);
								} else if (local663.startsWith("red:")) {
									local665 = 1;
									this.aString26 = this.aString26.substring(4);
								} else if (local663.startsWith("green:")) {
									local665 = 2;
									this.aString26 = this.aString26.substring(6);
								} else if (local663.startsWith("cyan:")) {
									local665 = 3;
									this.aString26 = this.aString26.substring(5);
								} else if (local663.startsWith("purple:")) {
									local665 = 4;
									this.aString26 = this.aString26.substring(7);
								} else if (local663.startsWith("white:")) {
									local665 = 5;
									this.aString26 = this.aString26.substring(6);
								} else if (local663.startsWith("flash1:")) {
									local665 = 6;
									this.aString26 = this.aString26.substring(7);
								} else if (local663.startsWith("flash2:")) {
									local665 = 7;
									this.aString26 = this.aString26.substring(7);
								} else if (local663.startsWith("flash3:")) {
									local665 = 8;
									this.aString26 = this.aString26.substring(7);
								} else if (local663.startsWith("glow1:")) {
									local665 = 9;
									this.aString26 = this.aString26.substring(6);
								} else if (local663.startsWith("glow2:")) {
									local665 = 10;
									this.aString26 = this.aString26.substring(6);
								} else if (local663.startsWith("glow3:")) {
									local665 = 11;
									this.aString26 = this.aString26.substring(6);
								}
								local663 = this.aString26.toLowerCase();
								@Pc(837) byte local837 = 0;
								if (local663.startsWith("wave:")) {
									local837 = 1;
									this.aString26 = this.aString26.substring(5);
								} else if (local663.startsWith("wave2:")) {
									local837 = 2;
									this.aString26 = this.aString26.substring(6);
								} else if (local663.startsWith("shake:")) {
									local837 = 3;
									this.aString26 = this.aString26.substring(6);
								} else if (local663.startsWith("scroll:")) {
									local837 = 4;
									this.aString26 = this.aString26.substring(7);
								} else if (local663.startsWith("slide:")) {
									local837 = 5;
									this.aString26 = this.aString26.substring(6);
								}
								this.aClass4_Sub1_Sub3_9.method156(137);
								this.aClass4_Sub1_Sub3_9.method157(0);
								@Pc(918) int local918 = this.aClass4_Sub1_Sub3_9.anInt242;
								this.aClass4_Sub1_Sub3_9.method183(local665);
								this.aClass4_Sub1_Sub3_8.anInt242 = 0;
								Class49.method565(this.aClass4_Sub1_Sub3_8, this.aString26);
								this.aClass4_Sub1_Sub3_9.method165(this.aClass4_Sub1_Sub3_8.aByteArray7, this.aClass4_Sub1_Sub3_8.anInt242);
								this.aClass4_Sub1_Sub3_9.method157(local837);
								this.aClass4_Sub1_Sub3_9.method166(this.aClass4_Sub1_Sub3_9.anInt242 - local918);
								this.aString26 = Class49.method566(this.aString26, 624);
								this.aString26 = Class9.method98(this.aString26);
								aClass4_Sub1_Sub1_Sub1_Sub2_1.aString14 = this.aString26;
								aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt662 = local665;
								aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt663 = local837;
								aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt641 = 150;
								if (this.anInt933 == 2) {
									this.method628("@cr2@" + aClass4_Sub1_Sub1_Sub1_Sub2_1.aString15, 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.aString14);
								} else if (this.anInt933 == 1) {
									this.method628("@cr1@" + aClass4_Sub1_Sub1_Sub1_Sub2_1.aString15, 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.aString14);
								} else {
									this.method628(aClass4_Sub1_Sub1_Sub1_Sub2_1.aString15, 2, aClass4_Sub1_Sub1_Sub1_Sub2_1.aString14);
								}
								if (this.anInt1019 == 2) {
									this.anInt1019 = 3;
									this.aBoolean273 = true;
									this.aClass4_Sub1_Sub3_9.method156(0);
									this.aClass4_Sub1_Sub3_9.method157(this.anInt1019);
									this.aClass4_Sub1_Sub3_9.method157(this.anInt966);
									this.aClass4_Sub1_Sub3_9.method157(this.anInt970);
								}
							}
							this.aString26 = "";
							this.aBoolean255 = true;
						}
					}
				}
			}
		} catch (@Pc(1070) RuntimeException local1070) {
			signlink.reporterror("29441, " + false + ", " + local1070.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method688(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(10) Class4_Sub1_Sub1_Sub2 local10 = (Class4_Sub1_Sub1_Sub2) this.aClass23_12.method315(); local10 != null; local10 = (Class4_Sub1_Sub1_Sub2) this.aClass23_12.method317()) {
				if (local10.anInt256 != this.anInt965 || local10.aBoolean71) {
					local10.method528();
				} else if (anInt866 >= local10.anInt260) {
					local10.method211(this.anInt849);
					if (local10.aBoolean71) {
						local10.method528();
					} else {
						this.aClass25_1.method353(60, false, local10.anInt258, local10, local10.anInt259, local10.anInt257, local10.anInt256, -1, 0);
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("71282, " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method689(@OriginalArg(0) int arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt881);
			@Pc(16) boolean local16 = true;
			if (this.aClass10_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass10_Sub1_1.anInt225);
			}
			System.out.println("loop-cycle:" + anInt866);
			System.out.println("draw-cycle:" + anInt850);
			System.out.println("ptype:" + this.anInt893);
			System.out.println("psize:" + this.anInt892);
			if (this.aClass40_1 != null) {
				this.aClass40_1.method520();
			}
			super.aBoolean230 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("46496, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method583(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 6 || arg0 > 6) {
				this.aClass23ArrayArrayArray1 = null;
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("59467, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.aFrame_Sub1_2 != null) {
				return new URL("http://127.0.0.1:" + (anInt856 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	private boolean method690(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray23[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg7;
			@Pc(39) int local39 = arg9;
			this.anIntArrayArray23[arg7][arg9] = 99;
			this.anIntArrayArray22[arg7][arg9] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray259[0] = arg7;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray260[0] = arg9;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray259.length;
			@Pc(81) int[][] local81 = this.aClass3Array1[this.anInt965].anIntArrayArray1;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray259[local57];
				local39 = this.anIntArray260[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg3 && local39 == arg4) {
					local70 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass3Array1[this.anInt965].method21(arg4, arg3, local11, arg1, arg10 - 1, local39)) {
						local70 = true;
						break;
					}
					if (arg10 < 10 && this.aClass3Array1[this.anInt965].method22(local11, arg10 - 1, arg1, arg4, local39, arg3)) {
						local70 = true;
						break;
					}
				}
				if (arg5 != 0 && arg2 != 0 && this.aClass3Array1[this.anInt965].method23(arg2, arg5, arg3, arg4, arg6, local11, local39)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray23[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray259[local66] = local11 - 1;
					this.anIntArray260[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray23[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray259[local66] = local11 + 1;
					this.anIntArray260[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray23[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray259[local66] = local11;
					this.anIntArray260[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray23[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray259[local66] = local11;
					this.anIntArray260[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray23[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray259[local66] = local11 - 1;
					this.anIntArray260[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray23[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray259[local66] = local11 + 1;
					this.anIntArray260[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray23[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray259[local66] = local11 - 1;
					this.anIntArray260[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray23[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray259[local66] = local11 + 1;
					this.anIntArray260[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt1031 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local70) {
				if (arg0) {
					local192 = 100;
					for (local815 = 1; local815 < 2; local815++) {
						for (local821 = arg3 - local815; local821 <= arg3 + local815; local821++) {
							for (local827 = arg4 - local815; local827 <= arg4 + local815; local827++) {
								if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray22[local821][local827] < local192) {
									local192 = this.anIntArrayArray22[local821][local827];
									local11 = local821;
									local39 = local827;
									this.anInt1031 = 1;
									local70 = true;
								}
							}
						}
						if (local70) {
							break;
						}
					}
				}
				if (!local70) {
					return false;
				}
			}
			@Pc(888) byte local888 = 0;
			this.anIntArray259[0] = local11;
			local57 = local888 + 1;
			this.anIntArray260[0] = local39;
			local192 = local815 = this.anIntArrayArray23[local11][local39];
			while (local11 != arg7 || local39 != arg9) {
				if (local192 != local815) {
					local815 = local192;
					this.anIntArray259[local57] = local11;
					this.anIntArray260[local57++] = local39;
				}
				if ((local192 & 0x2) != 0) {
					local11++;
				} else if ((local192 & 0x8) != 0) {
					local11--;
				}
				if ((local192 & 0x1) != 0) {
					local39++;
				} else if ((local192 & 0x4) != 0) {
					local39--;
				}
				local192 = this.anIntArrayArray23[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local821 = this.anIntArray259[local57];
				local827 = this.anIntArray260[local57];
				if (arg8 == 0) {
					this.aClass4_Sub1_Sub3_9.method156(12);
					this.aClass4_Sub1_Sub3_9.method157(local74 + local74 + 3);
				}
				if (arg8 == 1) {
					this.aClass4_Sub1_Sub3_9.method156(221);
					this.aClass4_Sub1_Sub3_9.method157(local74 + local74 + 3 + 14);
				}
				if (arg8 == 2) {
					this.aClass4_Sub1_Sub3_9.method156(155);
					this.aClass4_Sub1_Sub3_9.method157(local74 + local74 + 3);
				}
				this.aClass4_Sub1_Sub3_9.method191(local827 + this.anInt1037);
				this.anInt1053 = this.anIntArray259[0];
				this.anInt1054 = this.anIntArray260[0];
				for (@Pc(1054) int local1054 = 1; local1054 < local74; local1054++) {
					local57--;
					this.aClass4_Sub1_Sub3_9.method183(this.anIntArray259[local57] - local821);
					this.aClass4_Sub1_Sub3_9.method183(this.anIntArray260[local57] - local827);
				}
				this.aClass4_Sub1_Sub3_9.method190(local821 + this.anInt1036);
				this.aClass4_Sub1_Sub3_9.method183(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg8 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1112) RuntimeException local1112) {
			signlink.reporterror("56376, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 5 + ", " + arg9 + ", " + arg10 + ", " + local1112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method691(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt943 >= 100) {
					this.method628("", 0, "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(30) String local30 = Class46.method554(Class46.method551(arg0));
					for (@Pc(32) int local32 = 0; local32 < this.anInt943; local32++) {
						if (this.aLongArray3[local32] == arg0) {
							this.method628("", 0, local30 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(62) int local62 = 0; local62 < this.anInt890; local62++) {
						if (this.aLongArray4[local62] == arg0) {
							this.method628("", 0, "Please remove " + local30 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt943++] = arg0;
					this.aBoolean251 = true;
					this.aClass4_Sub1_Sub3_9.method156(193);
					this.aClass4_Sub1_Sub3_9.method163(arg0);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("30226, " + 5 + ", " + arg0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method693() {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt969; local9++) {
				if (this.anIntArray213[local9] <= 0) {
					@Pc(18) boolean local18 = false;
					try {
						if (this.anIntArray237[local9] != this.anInt1043 || this.anIntArray217[local9] != this.anInt1044) {
							@Pc(51) Class4_Sub1_Sub3 local51 = Class14.method218(this.anIntArray237[local9], this.anIntArray217[local9]);
							if (System.currentTimeMillis() + (long) (local51.anInt242 / 22) > this.aLong31 + (long) (this.anInt1007 / 22)) {
								this.anInt1007 = local51.anInt242;
								this.aLong31 = System.currentTimeMillis();
								if (this.method719(local51.aByteArray7, local51.anInt242)) {
									this.anInt1043 = this.anIntArray237[local9];
									this.anInt1044 = this.anIntArray217[local9];
								} else {
									local18 = true;
								}
							}
						} else if (!this.method604()) {
							local18 = true;
						}
					} catch (@Pc(101) Exception local101) {
					}
					if (local18 && this.anIntArray213[local9] != -5) {
						this.anIntArray213[local9] = -5;
					} else {
						this.anInt969--;
						for (@Pc(117) int local117 = local9; local117 < this.anInt969; local117++) {
							this.anIntArray237[local117] = this.anIntArray237[local117 + 1];
							this.anIntArray217[local117] = this.anIntArray217[local117 + 1];
							this.anIntArray213[local117] = this.anIntArray213[local117 + 1];
						}
						local9--;
					}
				} else {
					@Pc(169) int local169 = this.anIntArray213[local9]--;
				}
			}
			if (this.anInt1023 > 0) {
				this.anInt1023 -= 20;
				if (this.anInt1023 < 0) {
					this.anInt1023 = 0;
				}
				if (this.anInt1023 == 0 && this.aBoolean268 && !aBoolean235) {
					this.anInt1052 = this.anInt958;
					this.aBoolean274 = true;
					this.aClass10_Sub1_1.method133(2, this.anInt1052);
					return;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("2082, " + -732 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method695(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			signlink.aBoolean277 = false;
			signlink.anInt1072 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("9158, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean258) {
			this.method679();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method580(@OriginalArg(0) byte arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass40_1 != null) {
					this.aClass40_1.method515();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass40_1 = null;
			this.method695(177);
			if (this.aClass16_1 != null) {
				this.aClass16_1.aBoolean72 = false;
			}
			this.aClass16_1 = null;
			this.aClass10_Sub1_1.method147();
			this.aClass10_Sub1_1 = null;
			this.aClass4_Sub1_Sub3_8 = null;
			this.aClass4_Sub1_Sub3_9 = null;
			this.aClass4_Sub1_Sub3_7 = null;
			this.aClass4_Sub1_Sub3_6 = null;
			this.anIntArray244 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray245 = null;
			this.anIntArray246 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass25_1 = null;
			this.aClass3Array1 = null;
			this.anIntArrayArray23 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray259 = null;
			this.anIntArray260 = null;
			this.aByteArray21 = null;
			@Pc(92) boolean local92 = false;
			this.aClass47_15 = null;
			this.aClass47_16 = null;
			this.aClass47_17 = null;
			this.aClass47_18 = null;
			this.aClass47_12 = null;
			this.aClass47_13 = null;
			this.aClass47_14 = null;
			this.aClass47_3 = null;
			this.aClass47_4 = null;
			this.aClass47_5 = null;
			this.aClass47_6 = null;
			this.aClass47_7 = null;
			this.aClass47_8 = null;
			this.aClass47_9 = null;
			this.aClass47_10 = null;
			this.aClass47_11 = null;
			this.aClass4_Sub1_Sub2_Sub1_6 = null;
			this.aClass4_Sub1_Sub2_Sub1_7 = null;
			this.aClass4_Sub1_Sub2_Sub1_8 = null;
			this.aClass4_Sub1_Sub2_Sub1_3 = null;
			this.aClass4_Sub1_Sub2_Sub1_4 = null;
			this.aClass4_Sub1_Sub2_Sub1_5 = null;
			this.aClass4_Sub1_Sub2_Sub1Array4 = null;
			this.aClass4_Sub1_Sub2_Sub1_9 = null;
			this.aClass4_Sub1_Sub2_Sub1_10 = null;
			this.aClass4_Sub1_Sub2_Sub1_11 = null;
			this.aClass4_Sub1_Sub2_Sub1_12 = null;
			this.aClass4_Sub1_Sub2_Sub1_13 = null;
			this.aClass4_Sub1_Sub2_Sub1_14 = null;
			this.aClass4_Sub1_Sub2_Sub1_15 = null;
			this.aClass4_Sub1_Sub2_Sub1_16 = null;
			this.aClass4_Sub1_Sub2_Sub1_17 = null;
			this.aClass4_Sub1_Sub2_Sub1_18 = null;
			this.aClass4_Sub1_Sub2_Sub2_3 = null;
			this.aClass4_Sub1_Sub2_Sub2Array8 = null;
			this.aClass4_Sub1_Sub2_Sub2Array7 = null;
			this.aClass4_Sub1_Sub2_Sub2Array10 = null;
			this.aClass4_Sub1_Sub2_Sub2Array9 = null;
			this.aClass4_Sub1_Sub2_Sub2Array6 = null;
			this.aClass4_Sub1_Sub2_Sub2_10 = null;
			this.aClass4_Sub1_Sub2_Sub2_4 = null;
			this.aClass4_Sub1_Sub2_Sub2_5 = null;
			this.aClass4_Sub1_Sub2_Sub2_6 = null;
			this.aClass4_Sub1_Sub2_Sub2_7 = null;
			this.aClass4_Sub1_Sub2_Sub2_8 = null;
			this.aClass4_Sub1_Sub2_Sub1Array3 = null;
			this.aClass4_Sub1_Sub2_Sub2Array5 = null;
			this.anIntArrayArray24 = null;
			this.aClass4_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray228 = null;
			this.anIntArray229 = null;
			this.aClass4_Sub1_Sub3Array1 = null;
			this.anIntArray266 = null;
			this.aClass4_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray262 = null;
			this.aClass23ArrayArrayArray1 = null;
			this.aClass23_10 = null;
			this.aClass23_11 = null;
			this.aClass23_12 = null;
			this.anIntArray230 = null;
			this.anIntArray231 = null;
			this.anIntArray232 = null;
			this.anIntArray233 = null;
			this.aStringArray10 = null;
			this.anIntArray212 = null;
			this.anIntArray234 = null;
			this.anIntArray235 = null;
			this.aClass4_Sub1_Sub2_Sub2Array4 = null;
			this.aClass4_Sub1_Sub2_Sub2_17 = null;
			this.aStringArray13 = null;
			this.aLongArray4 = null;
			this.anIntArray214 = null;
			this.aClass47_22 = null;
			this.aClass47_23 = null;
			this.aClass47_19 = null;
			this.aClass47_20 = null;
			this.aClass47_21 = null;
			this.aClass47_24 = null;
			this.aClass47_25 = null;
			this.aClass47_26 = null;
			this.aClass47_27 = null;
			this.method720(this.aByte33);
			Class20.method237((byte) 1);
			Class2.method10();
			Class44.method539();
			Class27.method398((byte) 1);
			Class18.aClass18Array1 = null;
			Class50.aClass50Array1 = null;
			Class43.aClass43Array1 = null;
			Class5.aClass5Array1 = null;
			Class42.aClass42Array1 = null;
			Class42.aClass1_7 = null;
			Class17.aClass17Array1 = null;
			super.aClass47_2 = null;
			Class4_Sub1_Sub1_Sub1_Sub2.aClass1_6 = null;
			Class4_Sub1_Sub2_Sub3.method448();
			Class25.method341();
			Class4_Sub1_Sub1_Sub3.method279((byte) 1);
			Class22.method272((byte) 1);
			System.gc();
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("20859, " + arg0 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!LORGYGVM;)V")
	private void method697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class27 arg3) {
		try {
			if (this.anInt845 != 9538) {
				this.method578();
			}
			if (arg3.anInt471 == 0 && arg3.anIntArray129 != null && (!arg3.aBoolean141 || this.anInt1041 == arg3.anInt482 || this.anInt938 == arg3.anInt482 || this.anInt847 == arg3.anInt482)) {
				@Pc(35) int local35 = Class4_Sub1_Sub2.anInt702;
				@Pc(37) int local37 = Class4_Sub1_Sub2.anInt700;
				@Pc(39) int local39 = Class4_Sub1_Sub2.anInt703;
				@Pc(41) int local41 = Class4_Sub1_Sub2.anInt701;
				Class4_Sub1_Sub2.method484(arg2 + arg3.anInt481, arg2, arg0, arg0 + arg3.anInt494);
				@Pc(57) int local57 = arg3.anIntArray129.length;
				for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
					@Pc(68) int local68 = arg3.anIntArray122[local59] + arg2;
					@Pc(77) int local77 = arg3.anIntArray123[local59] + arg0 - arg1;
					@Pc(83) Class27 local83 = Class27.method405(arg3.anIntArray129[local59]);
					@Pc(88) int local88 = local68 + local83.anInt495;
					@Pc(93) int local93 = local77 + local83.anInt489;
					if (local83.anInt480 > 0) {
						this.method638(local83);
					}
					if (local83.anInt471 == 0) {
						if (local83.anInt461 > local83.anInt473 - local83.anInt494) {
							local83.anInt461 = local83.anInt473 - local83.anInt494;
						}
						if (local83.anInt461 < 0) {
							local83.anInt461 = 0;
						}
						this.method697(local93, local83.anInt461, local88, local83);
						if (local83.anInt473 > local83.anInt494) {
							this.method601(local83.anInt494, local83.anInt473, local83.anInt461, local93, local88 + local83.anInt481);
						}
					} else if (local83.anInt471 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(247) int local247;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local83.anInt471 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt494; local165++) {
								for (local169 = 0; local169 < local83.anInt481; local169++) {
									local180 = local88 + local169 * (local83.anInt492 + 32);
									@Pc(189) int local189 = local93 + local165 * (local83.anInt491 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray127[local163];
										local189 += local83.anIntArray125[local163];
									}
									if (local83.anIntArray124[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray124[local163] - 1;
										if (local180 > Class4_Sub1_Sub2.anInt702 - 32 && local180 < Class4_Sub1_Sub2.anInt703 && local189 > Class4_Sub1_Sub2.anInt700 - 32 && local189 < Class4_Sub1_Sub2.anInt701 || this.anInt955 != 0 && this.anInt954 == local163) {
											local247 = 0;
											if (this.anInt885 == 1 && this.anInt886 == local163 && this.anInt887 == local83.anInt482) {
												local247 = 16777215;
											}
											@Pc(271) Class4_Sub1_Sub2_Sub2 local271 = Class44.method543(local247, local83.anIntArray128[local163], local222);
											if (local271 != null) {
												@Pc(351) int local351;
												if (this.anInt955 != 0 && this.anInt954 == local163 && this.anInt953 == local83.anInt482) {
													local213 = super.anInt826 - this.anInt956;
													local215 = super.anInt827 - this.anInt957;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt1048 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method261(local180 + local213, local189 + local215, this.aByte40);
													if (local189 + local215 < Class4_Sub1_Sub2.anInt700 && arg3.anInt461 > 0) {
														local351 = this.anInt849 * (Class4_Sub1_Sub2.anInt700 - local189 - local215) / 3;
														if (local351 > this.anInt849 * 10) {
															local351 = this.anInt849 * 10;
														}
														if (local351 > arg3.anInt461) {
															local351 = arg3.anInt461;
														}
														arg3.anInt461 -= local351;
														this.anInt957 += local351;
													}
													if (local189 + local215 + 32 > Class4_Sub1_Sub2.anInt701 && arg3.anInt461 < arg3.anInt473 - arg3.anInt494) {
														local351 = this.anInt849 * (local189 + local215 + 32 - Class4_Sub1_Sub2.anInt701) / 3;
														if (local351 > this.anInt849 * 10) {
															local351 = this.anInt849 * 10;
														}
														if (local351 > arg3.anInt473 - arg3.anInt494 - arg3.anInt461) {
															local351 = arg3.anInt473 - arg3.anInt494 - arg3.anInt461;
														}
														arg3.anInt461 += local351;
														this.anInt957 -= local351;
													}
												} else if (this.anInt924 != 0 && this.anInt923 == local163 && this.anInt922 == local83.anInt482) {
													local271.method261(local180, local189, this.aByte40);
												} else {
													local271.method259(local189, local180);
												}
												if (local271.anInt345 == 33 || local83.anIntArray128[local163] != 1) {
													local351 = local83.anIntArray128[local163];
													this.aClass4_Sub1_Sub2_Sub4_2.method499(local189 + local215 + 10, method597(local351), local180 + local213 + 1, 0);
													this.aClass4_Sub1_Sub2_Sub4_2.method499(local189 + local215 + 9, method597(local351), local180 + local213, 16776960);
												}
											}
										}
									} else if (local83.aClass4_Sub1_Sub2_Sub2Array2 != null && local163 < 20) {
										@Pc(541) Class4_Sub1_Sub2_Sub2 local541 = local83.aClass4_Sub1_Sub2_Sub2Array2[local163];
										if (local541 != null) {
											local541.method259(local189, local180);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt471 == 3) {
							@Pc(567) boolean local567 = false;
							if (this.anInt847 == local83.anInt482 || this.anInt938 == local83.anInt482 || this.anInt1041 == local83.anInt482) {
								local567 = true;
							}
							if (this.method667(local83)) {
								local163 = local83.anInt477;
								if (local567 && local83.anInt486 != 0) {
									local163 = local83.anInt486;
								}
							} else {
								local163 = local83.anInt488;
								if (local567 && local83.anInt462 != 0) {
									local163 = local83.anInt462;
								}
							}
							if (local83.aByte18 == 0) {
								if (local83.aBoolean146) {
									Class4_Sub1_Sub2.method487(local93, local83.anInt481, local83.anInt494, local88, local163);
								} else {
									Class4_Sub1_Sub2.method488(local83.anInt481, local83.anInt494, this.anInt914, local163, local88, local93);
								}
							} else if (local83.aBoolean146) {
								Class4_Sub1_Sub2.method486(256 - (local83.aByte18 & 0xFF), local83.anInt481, local93, local83.anInt494, local88, local163);
							} else {
								Class4_Sub1_Sub2.method489(local83.anInt494, local93, local163, local83.anInt481, 256 - (local83.aByte18 & 0xFF), local88);
							}
						} else {
							@Pc(686) Class4_Sub1_Sub2_Sub4 local686;
							@Pc(963) String local963;
							if (local83.anInt471 == 4) {
								local686 = local83.aClass4_Sub1_Sub2_Sub4_1;
								@Pc(689) String local689 = local83.aString13;
								@Pc(691) boolean local691 = false;
								if (this.anInt847 == local83.anInt482 || this.anInt938 == local83.anInt482 || this.anInt1041 == local83.anInt482) {
									local691 = true;
								}
								if (this.method667(local83)) {
									local165 = local83.anInt477;
									if (local691 && local83.anInt486 != 0) {
										local165 = local83.anInt486;
									}
									if (local83.aString10.length() > 0) {
										local689 = local83.aString10;
									}
								} else {
									local165 = local83.anInt488;
									if (local691 && local83.anInt462 != 0) {
										local165 = local83.anInt462;
									}
								}
								if (local83.anInt483 == 6 && this.aBoolean233) {
									local689 = "Please wait...";
									local165 = local83.anInt488;
								}
								if (Class4_Sub1_Sub2.anInt698 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local686.anInt708;
								while (local689.length() > 0) {
									if (local689.indexOf("%") != -1) {
										label389: while (true) {
											local215 = local689.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local689.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local689.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local689.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local689.indexOf("%5");
																			if (local215 == -1) {
																				break label389;
																			}
																			local689 = local689.substring(0, local215) + this.method626(this.method677(local83, 4)) + local689.substring(local215 + 2);
																		}
																	}
																	local689 = local689.substring(0, local215) + this.method626(this.method677(local83, 3)) + local689.substring(local215 + 2);
																}
															}
															local689 = local689.substring(0, local215) + this.method626(this.method677(local83, 2)) + local689.substring(local215 + 2);
														}
													}
													local689 = local689.substring(0, local215) + this.method626(this.method677(local83, 1)) + local689.substring(local215 + 2);
												}
											}
											local689 = local689.substring(0, local215) + this.method626(this.method677(local83, 0)) + local689.substring(local215 + 2);
										}
									}
									local215 = local689.indexOf("\\n");
									if (local215 == -1) {
										local963 = local689;
										local689 = "";
									} else {
										local963 = local689.substring(0, local215);
										local689 = local689.substring(local215 + 2);
									}
									if (local83.aBoolean140) {
										local686.method496(local213, local165, local88 + local83.anInt481 / 2, local83.aBoolean143, local963);
									} else {
										local686.method503(local963, local165, local213, local88, local83.aBoolean143);
									}
									local213 += local686.anInt708;
								}
							} else if (local83.anInt471 == 5) {
								@Pc(1025) Class4_Sub1_Sub2_Sub2 local1025;
								if (this.method667(local83)) {
									local1025 = local83.aClass4_Sub1_Sub2_Sub2_1;
								} else {
									local1025 = local83.aClass4_Sub1_Sub2_Sub2_2;
								}
								if (local1025 != null) {
									local1025.method259(local93, local88);
								}
							} else if (local83.anInt471 == 6) {
								local163 = Class4_Sub1_Sub2_Sub3.anInt578;
								local165 = Class4_Sub1_Sub2_Sub3.anInt579;
								Class4_Sub1_Sub2_Sub3.anInt578 = local88 + local83.anInt481 / 2;
								Class4_Sub1_Sub2_Sub3.anInt579 = local93 + local83.anInt494 / 2;
								local169 = Class4_Sub1_Sub2_Sub3.anIntArray144[local83.anInt467] * local83.anInt466 >> 16;
								local180 = Class4_Sub1_Sub2_Sub3.anIntArray145[local83.anInt467] * local83.anInt466 >> 16;
								@Pc(1086) boolean local1086 = this.method667(local83);
								if (local1086) {
									local213 = local83.anInt479;
								} else {
									local213 = local83.anInt478;
								}
								@Pc(1106) Class4_Sub1_Sub1_Sub3 local1106;
								if (local213 == -1) {
									local1106 = local83.method397(-1, -1, local1086);
								} else {
									@Pc(1112) Class5 local1112 = Class5.aClass5Array1[local213];
									local1106 = local83.method397(local1112.anIntArray8[local83.anInt465], local1112.anIntArray7[local83.anInt465], local1086);
								}
								if (local1106 != null) {
									local1106.method303(local83.anInt468, 0, local83.anInt467, 0, local169, local180);
								}
								Class4_Sub1_Sub2_Sub3.anInt578 = local163;
								Class4_Sub1_Sub2_Sub3.anInt579 = local165;
							} else {
								if (local83.anInt471 == 7) {
									local686 = local83.aClass4_Sub1_Sub2_Sub4_1;
									local165 = 0;
									for (local169 = 0; local169 < local83.anInt494; local169++) {
										for (local180 = 0; local180 < local83.anInt481; local180++) {
											if (local83.anIntArray124[local165] > 0) {
												@Pc(1176) Class44 local1176 = Class44.method536(local83.anIntArray124[local165] - 1);
												@Pc(1179) String local1179 = local1176.aString16;
												if (local1176.aBoolean217 || local83.anIntArray128[local165] != 1) {
													local1179 = local1179 + " x" + method692(local83.anIntArray128[local165]);
												}
												local215 = local88 + local180 * (local83.anInt492 + 115);
												local222 = local93 + local169 * (local83.anInt491 + 12);
												if (local83.aBoolean140) {
													local686.method496(local222, local83.anInt488, local215 + local83.anInt481 / 2, local83.aBoolean143, local1179);
												} else {
													local686.method503(local1179, local83.anInt488, local222, local215, local83.aBoolean143);
												}
											}
											local165++;
										}
									}
								}
								if (local83.anInt471 == 8 && (this.anInt995 == local83.anInt482 || this.anInt1046 == local83.anInt482 || this.anInt996 == local83.anInt482) && this.anInt1055 == 100) {
									local163 = 0;
									local165 = 0;
									@Pc(1293) Class4_Sub1_Sub2_Sub4 local1293 = this.aClass4_Sub1_Sub2_Sub4_3;
									@Pc(1296) String local1296 = local83.aString13;
									while (local1296.length() > 0) {
										local213 = local1296.indexOf("\\n");
										if (local213 == -1) {
											local963 = local1296;
											local1296 = "";
										} else {
											local963 = local1296.substring(0, local213);
											local1296 = local1296.substring(local213 + 2);
										}
										local215 = local1293.method497(local963, 555);
										if (local215 > local163) {
											local163 = local215;
										}
										local165 += local1293.anInt708 + 1;
									}
									local163 += 6;
									local165 += 7;
									local213 = local88 + local83.anInt481 - local163 - 5;
									local215 = local93 + local83.anInt494 + 5;
									if (local213 < local88 + 5) {
										local213 = local88 + 5;
									}
									if (local213 + local163 > arg2 + arg3.anInt481) {
										local213 = arg2 + arg3.anInt481 - local163;
									}
									Class4_Sub1_Sub2.method487(local215, local163, local165, local213, 16777120);
									Class4_Sub1_Sub2.method488(local163, local165, this.anInt914, 0, local213, local215);
									local1296 = local83.aString13;
									local222 = local215 + local1293.anInt708 + 2;
									while (local1296.length() > 0) {
										local247 = local1296.indexOf("\\n");
										if (local247 == -1) {
											local963 = local1296;
											local1296 = "";
										} else {
											local963 = local1296.substring(0, local247);
											local1296 = local1296.substring(local247 + 2);
										}
										local1293.method503(local963, 0, local222, local213 + 3, false);
										local222 += local1293.anInt708 + 1;
									}
								}
							}
						}
					}
				}
				Class4_Sub1_Sub2.method484(local39, local35, local37, local41);
			}
		} catch (@Pc(1467) RuntimeException local1467) {
			signlink.reporterror("87271, " + arg0 + ", " + 9538 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1467.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!HOSNGCXH;BI)V")
	private void method698(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) int local12 = arg0 * arg0 + arg2 * arg2;
			if (local12 > 4225 && local12 < 90000) {
				@Pc(26) int local26 = this.anInt1012 + this.anInt842 & 0x7FF;
				@Pc(30) int local30 = Class4_Sub1_Sub1_Sub3.anIntArray90[local26];
				@Pc(34) int local34 = Class4_Sub1_Sub1_Sub3.anIntArray91[local26];
				@Pc(43) int local43 = local30 * 256 / (this.anInt867 + 256);
				@Pc(52) int local52 = local34 * 256 / (this.anInt867 + 256);
				@Pc(62) int local62 = arg2 * local43 + arg0 * local52 >> 16;
				@Pc(72) int local72 = arg2 * local52 - arg0 * local43 >> 16;
				@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
				@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
				@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
				this.aClass4_Sub1_Sub2_Sub2_9.method264(local84 + 94 + 4 - 10, local78, (byte) 5, 83 - local90 - 20);
			} else {
				this.method633(arg2, arg0, arg1);
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("49126, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method581() {
		try {
			if (this.aBoolean253 || this.aBoolean238 || this.aBoolean265) {
				this.method636();
			} else {
				anInt850++;
				if (this.aBoolean272) {
					this.method621();
				} else {
					this.method646(false, 884);
				}
				this.anInt1021 = 0;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("51818, " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method578() {
		this.method585("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt820 = 5;
		}
		if (aBoolean257) {
			this.aBoolean253 = true;
			return;
		}
		aBoolean257 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method609();
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.231")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.229")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.228")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.227")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.226")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.224")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.223")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean265 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass11Array1[local101] = new Class11(true, local101 + 1, signlink.aRandomAccessFileArray1[local101], signlink.aRandomAccessFile3, 500000);
			}
		}
		try {
			this.method591(677);
			this.aClass38_2 = this.method665("title screen", this.anIntArray254[1], 25, 1, "title");
			this.aClass4_Sub1_Sub2_Sub4_2 = new Class4_Sub1_Sub2_Sub4(false, "p11_full", 0, this.aClass38_2);
			this.aClass4_Sub1_Sub2_Sub4_3 = new Class4_Sub1_Sub2_Sub4(false, "p12_full", 0, this.aClass38_2);
			this.aClass4_Sub1_Sub2_Sub4_4 = new Class4_Sub1_Sub2_Sub4(false, "b12_full", 0, this.aClass38_2);
			this.aClass4_Sub1_Sub2_Sub4_5 = new Class4_Sub1_Sub2_Sub4(true, "q8_full", 0, this.aClass38_2);
			this.method702();
			this.method673();
			@Pc(197) Class38 local197 = this.method665("config", this.anIntArray254[2], 30, 2, "config");
			@Pc(209) Class38 local209 = this.method665("interface", this.anIntArray254[3], 35, 3, "interface");
			@Pc(221) Class38 local221 = this.method665("2d graphics", this.anIntArray254[4], 40, 4, "media");
			@Pc(233) Class38 local233 = this.method665("textures", this.anIntArray254[6], 45, 6, "textures");
			@Pc(245) Class38 local245 = this.method665("chat system", this.anIntArray254[7], 50, 7, "wordenc");
			@Pc(257) Class38 local257 = this.method665("sound effects", this.anIntArray254[8], 55, 8, "sounds");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass25_1 = new Class25(this.anIntArrayArrayArray7, 104, 4, (byte) 0, 104);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass3Array1[local282] = new Class3(104, 104, 457);
			}
			this.aClass4_Sub1_Sub2_Sub2_17 = new Class4_Sub1_Sub2_Sub2(512, 512);
			@Pc(317) Class38 local317 = this.method665("update list", this.anIntArray254[5], 60, 5, "versionlist");
			this.method585("Connecting to update server", 60);
			this.aClass10_Sub1_1 = new Class10_Sub1();
			this.aClass10_Sub1_1.method134(local317, this);
			Class22.method270(this.aClass10_Sub1_1.method129());
			Class4_Sub1_Sub1_Sub3.method280(this.aClass10_Sub1_1.method143(anInt912, 0), this.aClass10_Sub1_1);
			if (!aBoolean235) {
				this.anInt1052 = 0;
				this.aBoolean274 = true;
				this.aClass10_Sub1_1.method133(2, this.anInt1052);
				while (this.aClass10_Sub1_1.method137() > 0) {
					this.method709();
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass10_Sub1_1.anInt223 > 3) {
						this.method650("ondemand");
						return;
					}
				}
			}
			this.method585("Requesting animations", 65);
			@Pc(392) int local392 = this.aClass10_Sub1_1.method143(anInt912, 1);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass10_Sub1_1.method133(1, local394);
			}
			@Pc(413) int local413;
			while (this.aClass10_Sub1_1.method137() > 0) {
				local413 = local392 - this.aClass10_Sub1_1.method137();
				if (local413 > 0) {
					this.method585("Loading animations - " + local413 * 100 / local392 + "%", 65);
				}
				this.method709();
				try {
					Thread.sleep(100L);
				} catch (@Pc(439) Exception local439) {
				}
				if (this.aClass10_Sub1_1.anInt223 > 3) {
					this.method650("ondemand");
					return;
				}
			}
			this.method585("Requesting models", 70);
			local392 = this.aClass10_Sub1_1.method143(anInt912, 0);
			@Pc(473) int local473;
			for (local413 = 0; local413 < local392; local413++) {
				local473 = this.aClass10_Sub1_1.method136(local413);
				if ((local473 & 0x1) != 0) {
					this.aClass10_Sub1_1.method133(0, local413);
				}
			}
			local392 = this.aClass10_Sub1_1.method137();
			while (this.aClass10_Sub1_1.method137() > 0) {
				local473 = local392 - this.aClass10_Sub1_1.method137();
				if (local473 > 0) {
					this.method585("Loading models - " + local473 * 100 / local392 + "%", 70);
				}
				this.method709();
				try {
					Thread.sleep(100L);
				} catch (@Pc(524) Exception local524) {
				}
			}
			if (this.aClass11Array1[0] != null) {
				this.method585("Requesting maps", 75);
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 0, 48, 47));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 1, 48, 47));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 0, 48, 48));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 1, 48, 48));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 0, 48, 49));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 1, 48, 49));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 0, 47, 47));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 1, 47, 47));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 0, 47, 48));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 1, 47, 48));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 0, 148, 48));
				this.aClass10_Sub1_1.method133(3, this.aClass10_Sub1_1.method132((byte) 9, 1, 148, 48));
				local392 = this.aClass10_Sub1_1.method137();
				while (this.aClass10_Sub1_1.method137() > 0) {
					local473 = local392 - this.aClass10_Sub1_1.method137();
					if (local473 > 0) {
						this.method585("Loading maps - " + local473 * 100 / local392 + "%", 75);
					}
					this.method709();
					try {
						Thread.sleep(100L);
					} catch (@Pc(709) Exception local709) {
					}
				}
			}
			local392 = this.aClass10_Sub1_1.method143(anInt912, 0);
			@Pc(730) int local730;
			for (local473 = 0; local473 < local392; local473++) {
				local730 = this.aClass10_Sub1_1.method136(local473);
				@Pc(732) byte local732 = 0;
				if ((local730 & 0x8) != 0) {
					local732 = 10;
				} else if ((local730 & 0x20) != 0) {
					local732 = 9;
				} else if ((local730 & 0x10) != 0) {
					local732 = 8;
				} else if ((local730 & 0x40) != 0) {
					local732 = 7;
				} else if ((local730 & 0x80) != 0) {
					local732 = 6;
				} else if ((local730 & 0x2) != 0) {
					local732 = 5;
				} else if ((local730 & 0x4) != 0) {
					local732 = 4;
				}
				if ((local730 & 0x1) != 0) {
					local732 = 3;
				}
				if (local732 != 0) {
					this.aClass10_Sub1_1.method135(0, local473, anInt980, local732);
				}
			}
			this.aClass10_Sub1_1.method145(aBoolean234);
			if (!aBoolean235) {
				local392 = this.aClass10_Sub1_1.method143(anInt912, 2);
				for (local730 = 1; local730 < local392; local730++) {
					if (this.aClass10_Sub1_1.method130(local730)) {
						this.aClass10_Sub1_1.method135(2, local730, anInt980, (byte) 1);
					}
				}
			}
			this.method585("Unpacking media", 80);
			this.aClass4_Sub1_Sub2_Sub1_6 = new Class4_Sub1_Sub2_Sub1(local221, "invback", 0);
			this.aClass4_Sub1_Sub2_Sub1_8 = new Class4_Sub1_Sub2_Sub1(local221, "chatback", 0);
			this.aClass4_Sub1_Sub2_Sub1_7 = new Class4_Sub1_Sub2_Sub1(local221, "mapback", 0);
			this.aClass4_Sub1_Sub2_Sub1_3 = new Class4_Sub1_Sub2_Sub1(local221, "backbase1", 0);
			this.aClass4_Sub1_Sub2_Sub1_4 = new Class4_Sub1_Sub2_Sub1(local221, "backbase2", 0);
			this.aClass4_Sub1_Sub2_Sub1_5 = new Class4_Sub1_Sub2_Sub1(local221, "backhmid1", 0);
			for (local730 = 0; local730 < 13; local730++) {
				this.aClass4_Sub1_Sub2_Sub1Array4[local730] = new Class4_Sub1_Sub2_Sub1(local221, "sideicons", local730);
			}
			this.aClass4_Sub1_Sub2_Sub2_3 = new Class4_Sub1_Sub2_Sub2(local221, "compass", 0);
			this.aClass4_Sub1_Sub2_Sub2_9 = new Class4_Sub1_Sub2_Sub2(local221, "mapedge", 0);
			this.aClass4_Sub1_Sub2_Sub2_9.method256();
			for (@Pc(932) int local932 = 0; local932 < 72; local932++) {
				this.aClass4_Sub1_Sub2_Sub1Array3[local932] = new Class4_Sub1_Sub2_Sub1(local221, "mapscene", local932);
			}
			for (@Pc(950) int local950 = 0; local950 < 63; local950++) {
				this.aClass4_Sub1_Sub2_Sub2Array5[local950] = new Class4_Sub1_Sub2_Sub2(local221, "mapfunction", local950);
			}
			for (@Pc(968) int local968 = 0; local968 < 5; local968++) {
				this.aClass4_Sub1_Sub2_Sub2Array8[local968] = new Class4_Sub1_Sub2_Sub2(local221, "hitmarks", local968);
			}
			for (@Pc(986) int local986 = 0; local986 < 6; local986++) {
				this.aClass4_Sub1_Sub2_Sub2Array7[local986] = new Class4_Sub1_Sub2_Sub2(local221, "headicons_pk", local986);
			}
			for (@Pc(1004) int local1004 = 0; local1004 < 9; local1004++) {
				this.aClass4_Sub1_Sub2_Sub2Array10[local1004] = new Class4_Sub1_Sub2_Sub2(local221, "headicons_prayer", local1004);
			}
			for (@Pc(1022) int local1022 = 0; local1022 < 6; local1022++) {
				this.aClass4_Sub1_Sub2_Sub2Array9[local1022] = new Class4_Sub1_Sub2_Sub2(local221, "headicons_hint", local1022);
			}
			this.aClass4_Sub1_Sub2_Sub2_10 = new Class4_Sub1_Sub2_Sub2(local221, "overlay_multiway", 0);
			this.aClass4_Sub1_Sub2_Sub2_13 = new Class4_Sub1_Sub2_Sub2(local221, "mapmarker", 0);
			this.aClass4_Sub1_Sub2_Sub2_14 = new Class4_Sub1_Sub2_Sub2(local221, "mapmarker", 1);
			for (@Pc(1064) int local1064 = 0; local1064 < 8; local1064++) {
				this.aClass4_Sub1_Sub2_Sub2Array6[local1064] = new Class4_Sub1_Sub2_Sub2(local221, "cross", local1064);
			}
			this.aClass4_Sub1_Sub2_Sub2_4 = new Class4_Sub1_Sub2_Sub2(local221, "mapdots", 0);
			this.aClass4_Sub1_Sub2_Sub2_5 = new Class4_Sub1_Sub2_Sub2(local221, "mapdots", 1);
			this.aClass4_Sub1_Sub2_Sub2_6 = new Class4_Sub1_Sub2_Sub2(local221, "mapdots", 2);
			this.aClass4_Sub1_Sub2_Sub2_7 = new Class4_Sub1_Sub2_Sub2(local221, "mapdots", 3);
			this.aClass4_Sub1_Sub2_Sub2_8 = new Class4_Sub1_Sub2_Sub2(local221, "mapdots", 4);
			this.aClass4_Sub1_Sub2_Sub1_1 = new Class4_Sub1_Sub2_Sub1(local221, "scrollbar", 0);
			this.aClass4_Sub1_Sub2_Sub1_2 = new Class4_Sub1_Sub2_Sub1(local221, "scrollbar", 1);
			this.aClass4_Sub1_Sub2_Sub1_9 = new Class4_Sub1_Sub2_Sub1(local221, "redstone1", 0);
			this.aClass4_Sub1_Sub2_Sub1_10 = new Class4_Sub1_Sub2_Sub1(local221, "redstone2", 0);
			this.aClass4_Sub1_Sub2_Sub1_11 = new Class4_Sub1_Sub2_Sub1(local221, "redstone3", 0);
			this.aClass4_Sub1_Sub2_Sub1_12 = new Class4_Sub1_Sub2_Sub1(local221, "redstone1", 0);
			this.aClass4_Sub1_Sub2_Sub1_12.method83();
			this.aClass4_Sub1_Sub2_Sub1_13 = new Class4_Sub1_Sub2_Sub1(local221, "redstone2", 0);
			this.aClass4_Sub1_Sub2_Sub1_13.method83();
			this.aClass4_Sub1_Sub2_Sub1_14 = new Class4_Sub1_Sub2_Sub1(local221, "redstone1", 0);
			this.aClass4_Sub1_Sub2_Sub1_14.method84(anInt844);
			this.aClass4_Sub1_Sub2_Sub1_15 = new Class4_Sub1_Sub2_Sub1(local221, "redstone2", 0);
			this.aClass4_Sub1_Sub2_Sub1_15.method84(anInt844);
			this.aClass4_Sub1_Sub2_Sub1_16 = new Class4_Sub1_Sub2_Sub1(local221, "redstone3", 0);
			this.aClass4_Sub1_Sub2_Sub1_16.method84(anInt844);
			this.aClass4_Sub1_Sub2_Sub1_17 = new Class4_Sub1_Sub2_Sub1(local221, "redstone1", 0);
			this.aClass4_Sub1_Sub2_Sub1_17.method83();
			this.aClass4_Sub1_Sub2_Sub1_17.method84(anInt844);
			this.aClass4_Sub1_Sub2_Sub1_18 = new Class4_Sub1_Sub2_Sub1(local221, "redstone2", 0);
			this.aClass4_Sub1_Sub2_Sub1_18.method83();
			this.aClass4_Sub1_Sub2_Sub1_18.method84(anInt844);
			for (@Pc(1254) int local1254 = 0; local1254 < 2; local1254++) {
				this.aClass4_Sub1_Sub2_Sub1Array2[local1254] = new Class4_Sub1_Sub2_Sub1(local221, "mod_icons", local1254);
			}
			@Pc(1277) Class4_Sub1_Sub2_Sub2 local1277 = new Class4_Sub1_Sub2_Sub2(local221, "backleft1", 0);
			this.aClass47_3 = new Class47(this.method583(anInt1042), true, local1277.anInt341, local1277.anInt342);
			local1277.method257(0, 0);
			@Pc(1302) Class4_Sub1_Sub2_Sub2 local1302 = new Class4_Sub1_Sub2_Sub2(local221, "backleft2", 0);
			this.aClass47_4 = new Class47(this.method583(anInt1042), true, local1302.anInt341, local1302.anInt342);
			local1302.method257(0, 0);
			@Pc(1327) Class4_Sub1_Sub2_Sub2 local1327 = new Class4_Sub1_Sub2_Sub2(local221, "backright1", 0);
			this.aClass47_5 = new Class47(this.method583(anInt1042), true, local1327.anInt341, local1327.anInt342);
			local1327.method257(0, 0);
			@Pc(1352) Class4_Sub1_Sub2_Sub2 local1352 = new Class4_Sub1_Sub2_Sub2(local221, "backright2", 0);
			this.aClass47_6 = new Class47(this.method583(anInt1042), true, local1352.anInt341, local1352.anInt342);
			local1352.method257(0, 0);
			@Pc(1377) Class4_Sub1_Sub2_Sub2 local1377 = new Class4_Sub1_Sub2_Sub2(local221, "backtop1", 0);
			this.aClass47_7 = new Class47(this.method583(anInt1042), true, local1377.anInt341, local1377.anInt342);
			local1377.method257(0, 0);
			@Pc(1402) Class4_Sub1_Sub2_Sub2 local1402 = new Class4_Sub1_Sub2_Sub2(local221, "backvmid1", 0);
			this.aClass47_8 = new Class47(this.method583(anInt1042), true, local1402.anInt341, local1402.anInt342);
			local1402.method257(0, 0);
			@Pc(1427) Class4_Sub1_Sub2_Sub2 local1427 = new Class4_Sub1_Sub2_Sub2(local221, "backvmid2", 0);
			this.aClass47_9 = new Class47(this.method583(anInt1042), true, local1427.anInt341, local1427.anInt342);
			local1427.method257(0, 0);
			@Pc(1452) Class4_Sub1_Sub2_Sub2 local1452 = new Class4_Sub1_Sub2_Sub2(local221, "backvmid3", 0);
			this.aClass47_10 = new Class47(this.method583(anInt1042), true, local1452.anInt341, local1452.anInt342);
			local1452.method257(0, 0);
			@Pc(1477) Class4_Sub1_Sub2_Sub2 local1477 = new Class4_Sub1_Sub2_Sub2(local221, "backhmid2", 0);
			this.aClass47_11 = new Class47(this.method583(anInt1042), true, local1477.anInt341, local1477.anInt342);
			local1477.method257(0, 0);
			@Pc(1502) int local1502 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1509) int local1509 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1525) int local1525 = 0; local1525 < 100; local1525++) {
				if (this.aClass4_Sub1_Sub2_Sub2Array5[local1525] != null) {
					this.aClass4_Sub1_Sub2_Sub2Array5[local1525].method255(local1509 + local1523, local1502 + local1523, (byte) 1, local1516 + local1523);
				}
				if (this.aClass4_Sub1_Sub2_Sub1Array3[local1525] != null) {
					this.aClass4_Sub1_Sub2_Sub1Array3[local1525].method85(local1509 + local1523, local1502 + local1523, local1516 + local1523);
				}
			}
			this.method585("Unpacking textures", 83);
			Class4_Sub1_Sub2_Sub3.method453(local233);
			Class4_Sub1_Sub2_Sub3.method457(0.8D);
			Class4_Sub1_Sub2_Sub3.method452();
			this.method585("Unpacking config", 86);
			Class5.method31(local197);
			Class20.method233(local197);
			Class18.method225(local197);
			Class44.method537(local197);
			Class2.method8(local197);
			Class50.method567(local197);
			Class42.method525(local197);
			Class17.method223(local197);
			Class12.method205(local197);
			Class44.aBoolean216 = aBoolean234;
			if (!aBoolean235) {
				this.method585("Unpacking sounds", 90);
				@Pc(1628) byte[] local1628 = local257.method514("sounds.dat", null);
				@Pc(1634) Class4_Sub1_Sub3 local1634 = new Class4_Sub1_Sub3(local1628, false);
				Class14.method217(local1634);
			}
			this.method585("Unpacking interfaces", 95);
			@Pc(1665) Class4_Sub1_Sub2_Sub4[] local1665 = new Class4_Sub1_Sub2_Sub4[] { this.aClass4_Sub1_Sub2_Sub4_2, this.aClass4_Sub1_Sub2_Sub4_3, this.aClass4_Sub1_Sub2_Sub4_4, this.aClass4_Sub1_Sub2_Sub4_5 };
			Class27.method403(local209, local221, local1665);
			this.method585("Preparing game engine", 100);
			@Pc(1681) int local1681;
			@Pc(1683) int local1683;
			@Pc(1685) int local1685;
			for (@Pc(1677) int local1677 = 0; local1677 < 33; local1677++) {
				local1681 = 999;
				local1683 = 0;
				for (local1685 = 0; local1685 < 34; local1685++) {
					if (this.aClass4_Sub1_Sub2_Sub1_7.aByteArray2[local1685 + local1677 * this.aClass4_Sub1_Sub2_Sub1_7.anInt195] == 0) {
						if (local1681 == 999) {
							local1681 = local1685;
						}
					} else if (local1681 != 999) {
						local1683 = local1685;
						break;
					}
				}
				this.anIntArray268[local1677] = local1681;
				this.anIntArray220[local1677] = local1683 - local1681;
			}
			@Pc(1743) int local1743;
			for (local1681 = 5; local1681 < 156; local1681++) {
				local1683 = 999;
				local1685 = 0;
				for (local1743 = 25; local1743 < 172; local1743++) {
					if (this.aClass4_Sub1_Sub2_Sub1_7.aByteArray2[local1743 + local1681 * this.aClass4_Sub1_Sub2_Sub1_7.anInt195] == 0 && (local1743 > 34 || local1681 > 34)) {
						if (local1683 == 999) {
							local1683 = local1743;
						}
					} else if (local1683 != 999) {
						local1685 = local1743;
						break;
					}
				}
				this.anIntArray255[local1681 - 5] = local1683 - 25;
				this.anIntArray247[local1681 - 5] = local1685 - local1683;
			}
			Class4_Sub1_Sub2_Sub3.method450(765, 503);
			this.anIntArray274 = Class4_Sub1_Sub2_Sub3.anIntArray146;
			Class4_Sub1_Sub2_Sub3.method450(479, 96);
			this.anIntArray271 = Class4_Sub1_Sub2_Sub3.anIntArray146;
			Class4_Sub1_Sub2_Sub3.method450(190, 261);
			this.anIntArray272 = Class4_Sub1_Sub2_Sub3.anIntArray146;
			Class4_Sub1_Sub2_Sub3.method450(512, 334);
			this.anIntArray273 = Class4_Sub1_Sub2_Sub3.anIntArray146;
			@Pc(1834) int[] local1834 = new int[9];
			for (local1685 = 0; local1685 < 9; local1685++) {
				local1743 = local1685 * 32 + 128 + 15;
				@Pc(1852) int local1852 = local1743 * 3 + 600;
				@Pc(1856) int local1856 = Class4_Sub1_Sub2_Sub3.anIntArray144[local1743];
				local1834[local1685] = local1852 * local1856 >> 16;
			}
			Class25.method378(local1834);
			Class9.method88(local245);
			this.aClass16_1 = new Class16(this, aByte36);
			this.method584(this.aClass16_1, 10);
			Class4_Sub1_Sub1_Sub6.aClient5 = this;
			Class20.aClient4 = this;
			Class2.aClient1 = this;
		} catch (@Pc(1897) Exception local1897) {
			signlink.reporterror("loaderror " + this.aString22 + " " + this.anInt859);
			this.aBoolean238 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg1 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg2 + 1;
			}
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg1 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(105) int local105 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local105 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("26368, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)V")
	private void method700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray12[local3] != null) {
					@Pc(15) int local15 = this.anIntArray269[local3];
					@Pc(26) int local26 = this.anInt960 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray11[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt1019 == 0 || this.anInt1019 == 1 && this.method645(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass4_Sub1_Sub1_Sub1_Sub2_1.aString15)) {
							if (this.anInt933 >= 1) {
								this.aStringArray10[this.anInt1049] = "Report abuse @whi@" + local34;
								this.anIntArray232[this.anInt1049] = 440;
								this.anInt1049++;
							}
							this.aStringArray10[this.anInt1049] = "Add ignore @whi@" + local34;
							this.anIntArray232[this.anInt1049] = 539;
							this.anInt1049++;
							this.aStringArray10[this.anInt1049] = "Add friend @whi@" + local34;
							this.anIntArray232[this.anInt1049] = 342;
							this.anInt1049++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt936 == 0 && (local15 == 7 || this.anInt966 == 0 || this.anInt966 == 1 && this.method645(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt933 >= 1) {
								this.aStringArray10[this.anInt1049] = "Report abuse @whi@" + local34;
								this.anIntArray232[this.anInt1049] = 440;
								this.anInt1049++;
							}
							this.aStringArray10[this.anInt1049] = "Add ignore @whi@" + local34;
							this.anIntArray232[this.anInt1049] = 539;
							this.anInt1049++;
							this.aStringArray10[this.anInt1049] = "Add friend @whi@" + local34;
							this.anIntArray232[this.anInt1049] = 342;
							this.anInt1049++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt970 == 0 || this.anInt970 == 1 && this.method645(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt1049] = "Accept trade @whi@" + local34;
							this.anIntArray232[this.anInt1049] = 768;
							this.anInt1049++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt936 == 0 && this.anInt966 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt970 == 0 || this.anInt970 == 1 && this.method645(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt1049] = "Accept challenge @whi@" + local34;
							this.anIntArray232[this.anInt1049] = 443;
							this.anInt1049++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("70989, " + -15 + ", " + arg0 + ", " + arg1 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method701() {
		try {
			@Pc(14) int local14 = this.aClass4_Sub1_Sub2_Sub4_4.method497("Choose Option", 555);
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < this.anInt1049; local16++) {
				local27 = this.aClass4_Sub1_Sub2_Sub4_4.method497(this.aStringArray10[local16], 555);
				if (local27 > local14) {
					local14 = local27;
				}
			}
			local14 += 8;
			local27 = this.anInt1049 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt832 > 4 && super.anInt833 > 4 && super.anInt832 < 516 && super.anInt833 < 338) {
				local70 = super.anInt832 - local14 / 2 - 4;
				if (local70 + local14 > 512) {
					local70 = 512 - local14;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt833 - 4;
				if (local88 + local27 > 334) {
					local88 = 334 - local27;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean271 = true;
				this.anInt1000 = 0;
				this.anInt1001 = local70;
				this.anInt1002 = local88;
				this.anInt1003 = local14;
				this.anInt1004 = this.anInt1049 * 15 + 22;
			}
			if (super.anInt832 > 553 && super.anInt833 > 205 && super.anInt832 < 743 && super.anInt833 < 466) {
				local70 = super.anInt832 - local14 / 2 - 553;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local14 > 190) {
					local70 = 190 - local14;
				}
				local88 = super.anInt833 - 205;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local27 > 261) {
					local88 = 261 - local27;
				}
				this.aBoolean271 = true;
				this.anInt1000 = 1;
				this.anInt1001 = local70;
				this.anInt1002 = local88;
				this.anInt1003 = local14;
				this.anInt1004 = this.anInt1049 * 15 + 22;
			}
			if (super.anInt832 > 17 && super.anInt833 > 357 && super.anInt832 < 496 && super.anInt833 < 453) {
				local70 = super.anInt832 - local14 / 2 - 17;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local14 > 479) {
					local70 = 479 - local14;
				}
				local88 = super.anInt833 - 357;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local27 > 96) {
					local88 = 96 - local27;
				}
				this.aBoolean271 = true;
				this.anInt1000 = 2;
				this.anInt1001 = local70;
				this.anInt1002 = local88;
				this.anInt1003 = local14;
				this.anInt1004 = this.anInt1049 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("85043, " + 0 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method702() {
		try {
			@Pc(7) byte[] local7 = this.aClass38_2.method514("title.dat", null);
			@Pc(13) Class4_Sub1_Sub2_Sub2 local13 = new Class4_Sub1_Sub2_Sub2(local7, this);
			this.aClass47_22.method556();
			local13.method257(0, 0);
			this.aClass47_23.method556();
			local13.method257(-637, 0);
			this.aClass47_19.method556();
			local13.method257(-128, 0);
			this.aClass47_20.method556();
			local13.method257(-202, -371);
			this.aClass47_21.method556();
			local13.method257(-202, -171);
			this.aClass47_24.method556();
			local13.method257(0, -265);
			this.aClass47_25.method556();
			local13.method257(-562, -265);
			this.aClass47_26.method556();
			local13.method257(-128, -171);
			this.aClass47_27.method556();
			local13.method257(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt341];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt342; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt341; local104++) {
					local98[local104] = local13.anIntArray47[local13.anInt341 + local13.anInt341 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt341; local130++) {
					local13.anIntArray47[local130 + local13.anInt341 * local100] = local98[local130];
				}
			}
			this.aClass47_22.method556();
			local13.method257(382, 0);
			this.aClass47_23.method556();
			local13.method257(-255, 0);
			this.aClass47_19.method556();
			local13.method257(254, 0);
			this.aClass47_20.method556();
			local13.method257(180, -371);
			this.aClass47_21.method556();
			local13.method257(180, -171);
			this.aClass47_24.method556();
			local13.method257(382, -265);
			this.aClass47_25.method556();
			local13.method257(-180, -265);
			this.aClass47_26.method556();
			local13.method257(254, -171);
			this.aClass47_27.method556();
			local13.method257(-180, -171);
			local13 = new Class4_Sub1_Sub2_Sub2(this.aClass38_2, "logo", 0);
			this.aClass47_19.method556();
			local13.method259(18, 382 - local13.anInt341 / 2 - 128);
			System.gc();
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("77217, " + -616 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!AUWOQLEO;IZI)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.aBoolean272 &= true;
			if (this.anInt1049 < 400) {
				if (arg1.anIntArray3 != null) {
					arg1 = arg1.method6(this.aByte30);
				}
				if (arg1 != null && arg1.aBoolean2) {
					@Pc(30) String local30 = arg1.aString1;
					if (arg1.anInt25 != 0) {
						local30 = local30 + method696(arg1.anInt25, aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt689) + " (level-" + arg1.anInt25 + ")";
					}
					if (this.anInt885 == 1) {
						this.aStringArray10[this.anInt1049] = "Use " + this.aString25 + " with @yel@" + local30;
						this.anIntArray232[this.anInt1049] = 280;
						this.anIntArray233[this.anInt1049] = arg0;
						this.anIntArray230[this.anInt1049] = arg2;
						this.anIntArray231[this.anInt1049] = arg3;
						this.anInt1049++;
					} else if (this.anInt991 != 1) {
						@Pc(168) int local168;
						if (arg1.aStringArray1 != null) {
							for (local168 = 4; local168 >= 0; local168--) {
								if (arg1.aStringArray1[local168] != null && !arg1.aStringArray1[local168].equalsIgnoreCase("attack")) {
									this.aStringArray10[this.anInt1049] = arg1.aStringArray1[local168] + " @yel@" + local30;
									if (local168 == 0) {
										this.anIntArray232[this.anInt1049] = 58;
									}
									if (local168 == 1) {
										this.anIntArray232[this.anInt1049] = 9;
									}
									if (local168 == 2) {
										this.anIntArray232[this.anInt1049] = 97;
									}
									if (local168 == 3) {
										this.anIntArray232[this.anInt1049] = 703;
									}
									if (local168 == 4) {
										this.anIntArray232[this.anInt1049] = 50;
									}
									this.anIntArray233[this.anInt1049] = arg0;
									this.anIntArray230[this.anInt1049] = arg2;
									this.anIntArray231[this.anInt1049] = arg3;
									this.anInt1049++;
								}
							}
						}
						if (arg1.aStringArray1 != null) {
							for (local168 = 4; local168 >= 0; local168--) {
								if (arg1.aStringArray1[local168] != null && arg1.aStringArray1[local168].equalsIgnoreCase("attack")) {
									@Pc(292) short local292 = 0;
									if (arg1.anInt25 > aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt689) {
										local292 = 2000;
									}
									this.aStringArray10[this.anInt1049] = arg1.aStringArray1[local168] + " @yel@" + local30;
									if (local168 == 0) {
										this.anIntArray232[this.anInt1049] = local292 + 58;
									}
									if (local168 == 1) {
										this.anIntArray232[this.anInt1049] = local292 + 9;
									}
									if (local168 == 2) {
										this.anIntArray232[this.anInt1049] = local292 + 97;
									}
									if (local168 == 3) {
										this.anIntArray232[this.anInt1049] = local292 + 703;
									}
									if (local168 == 4) {
										this.anIntArray232[this.anInt1049] = local292 + 50;
									}
									this.anIntArray233[this.anInt1049] = arg0;
									this.anIntArray230[this.anInt1049] = arg2;
									this.anIntArray231[this.anInt1049] = arg3;
									this.anInt1049++;
								}
							}
						}
						this.aStringArray10[this.anInt1049] = "Examine @yel@" + local30;
						this.anIntArray232[this.anInt1049] = 1787;
						this.anIntArray233[this.anInt1049] = arg0;
						this.anIntArray230[this.anInt1049] = arg2;
						this.anIntArray231[this.anInt1049] = arg3;
						this.anInt1049++;
					} else if ((this.anInt993 & 0x2) == 2) {
						this.aStringArray10[this.anInt1049] = this.aString29 + " @yel@" + local30;
						this.anIntArray232[this.anInt1049] = 734;
						this.anIntArray233[this.anInt1049] = arg0;
						this.anIntArray230[this.anInt1049] = arg2;
						this.anIntArray231[this.anInt1049] = arg3;
						this.anInt1049++;
						return;
					}
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("14801, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method704() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray264[local5 + 32512] = 255;
				}
			}
			@Pc(46) int local46;
			@Pc(53) int local53;
			@Pc(59) int local59;
			for (local12 = 0; local12 < 100; local12++) {
				local46 = (int) (Math.random() * 124.0D) + 2;
				local53 = (int) (Math.random() * 128.0D) + 128;
				local59 = local46 + (local53 << 7);
				this.anIntArray264[local59] = 192;
			}
			for (local46 = 1; local46 < 255; local46++) {
				for (local53 = 1; local53 < 127; local53++) {
					local59 = local53 + (local46 << 7);
					this.anIntArray265[local59] = (this.anIntArray264[local59 - 1] + this.anIntArray264[local59 + 1] + this.anIntArray264[local59 - 128] + this.anIntArray264[local59 + 128]) / 4;
				}
			}
			this.anInt1022 += 128;
			if (this.anInt1022 > this.anIntArray239.length) {
				this.anInt1022 -= this.anIntArray239.length;
				local53 = (int) (Math.random() * 12.0D);
				this.method586(this.aClass4_Sub1_Sub2_Sub1Array5[local53]);
			}
			@Pc(171) int local171;
			for (local53 = 1; local53 < 255; local53++) {
				for (local59 = 1; local59 < 127; local59++) {
					local171 = local59 + (local53 << 7);
					@Pc(194) int local194 = this.anIntArray265[local171 + 128] - this.anIntArray239[local171 + this.anInt1022 & this.anIntArray239.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray264[local171] = local194;
				}
			}
			for (local59 = 0; local59 < 255; local59++) {
				this.anIntArray258[local59] = this.anIntArray258[local59 + 1];
			}
			this.anIntArray258[255] = (int) (Math.sin((double) anInt866 / 14.0D) * 16.0D + Math.sin((double) anInt866 / 15.0D) * 14.0D + Math.sin((double) anInt866 / 16.0D) * 12.0D);
			if (this.anInt967 > 0) {
				this.anInt967 -= 4;
			}
			if (this.anInt968 > 0) {
				this.anInt968 -= 4;
			}
			if (this.anInt967 == 0 && this.anInt968 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt967 = 1024;
				}
				if (local171 == 1) {
					this.anInt968 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("36858, " + false + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method705(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString19 = "";
				this.aString20 = "Connecting to server...";
				this.method646(true, 884);
			}
			this.aClass40_1 = new Class40(5, this.method602(anInt856 + 43594), this);
			@Pc(30) long local30 = Class46.method550(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass4_Sub1_Sub3_9.anInt242 = 0;
			this.aClass4_Sub1_Sub3_9.method157(14);
			this.aClass4_Sub1_Sub3_9.method157(local37);
			this.aClass40_1.method519(this.aClass4_Sub1_Sub3_9.aByteArray7, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass40_1.method516();
			}
			@Pc(74) int local74 = this.aClass40_1.method516();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass40_1.method518(this.aClass4_Sub1_Sub3_6.aByteArray7, 0, 8);
				this.aClass4_Sub1_Sub3_6.anInt242 = 0;
				this.aLong30 = this.aClass4_Sub1_Sub3_6.method173();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong30 >> 32), (int) this.aLong30 };
				this.aClass4_Sub1_Sub3_9.anInt242 = 0;
				this.aClass4_Sub1_Sub3_9.method157(10);
				this.aClass4_Sub1_Sub3_9.method161(local99[0]);
				this.aClass4_Sub1_Sub3_9.method161(local99[1]);
				this.aClass4_Sub1_Sub3_9.method161(local99[2]);
				this.aClass4_Sub1_Sub3_9.method161(local99[3]);
				this.aClass4_Sub1_Sub3_9.method161(signlink.anInt1066);
				this.aClass4_Sub1_Sub3_9.method164(arg0);
				this.aClass4_Sub1_Sub3_9.method164(arg1);
				this.aClass4_Sub1_Sub3_9.method182(aBigInteger1, aBigInteger2);
				this.aClass4_Sub1_Sub3_7.anInt242 = 0;
				if (arg2) {
					this.aClass4_Sub1_Sub3_7.method157(18);
				} else {
					this.aClass4_Sub1_Sub3_7.method157(16);
				}
				this.aClass4_Sub1_Sub3_7.method157(this.aClass4_Sub1_Sub3_9.anInt242 + 36 + 1 + 1 + 2);
				this.aClass4_Sub1_Sub3_7.method157(255);
				this.aClass4_Sub1_Sub3_7.method158(346);
				this.aClass4_Sub1_Sub3_7.method157(aBoolean235 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass4_Sub1_Sub3_7.method161(this.anIntArray254[local225]);
				}
				this.aClass4_Sub1_Sub3_7.method165(this.aClass4_Sub1_Sub3_9.aByteArray7, this.aClass4_Sub1_Sub3_9.anInt242);
				this.aClass4_Sub1_Sub3_9.aClass37_1 = new Class37(local99, aBoolean259);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass37_2 = new Class37(local99, aBoolean259);
				this.aClass40_1.method519(this.aClass4_Sub1_Sub3_7.aByteArray7, this.aClass4_Sub1_Sub3_7.anInt242);
				local74 = this.aClass40_1.method516();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method705(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt933 = this.aClass40_1.method516();
					aBoolean247 = this.aClass40_1.method516() == 1;
					this.aLong32 = 0L;
					this.anInt962 = 0;
					this.aClass16_1.anInt286 = 0;
					super.aBoolean232 = true;
					this.aBoolean260 = true;
					this.aBoolean272 = true;
					this.aClass4_Sub1_Sub3_9.anInt242 = 0;
					this.aClass4_Sub1_Sub3_6.anInt242 = 0;
					this.anInt893 = -1;
					this.anInt876 = -1;
					this.anInt877 = -1;
					this.anInt878 = -1;
					this.anInt892 = 0;
					this.anInt894 = 0;
					this.anInt1056 = 0;
					this.anInt896 = 0;
					this.anInt928 = 0;
					this.anInt1049 = 0;
					this.aBoolean271 = false;
					super.anInt824 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray12[local389] = null;
					}
					this.anInt885 = 0;
					this.anInt991 = 0;
					this.anInt874 = 0;
					this.anInt969 = 0;
					this.anInt1034 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1063 = (int) (Math.random() * 110.0D) - 55;
					this.anInt898 = (int) (Math.random() * 80.0D) - 40;
					this.anInt842 = (int) (Math.random() * 120.0D) - 60;
					this.anInt867 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1012 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt976 = 0;
					this.anInt934 = -1;
					this.anInt1053 = 0;
					this.anInt1054 = 0;
					this.anInt909 = 0;
					this.anInt1009 = 0;
					for (local225 = 0; local225 < this.anInt907; local225++) {
						this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local225] = null;
						this.aClass4_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local259] = null;
					}
					aClass4_Sub1_Sub1_Sub1_Sub2_1 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anInt908] = new Class4_Sub1_Sub1_Sub1_Sub2();
					this.aClass23_11.method319();
					this.aClass23_12.method319();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass23ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass23_10 = new Class23(0);
					this.anInt891 = 0;
					this.anInt890 = 0;
					this.method607(this.anInt1005);
					this.anInt1005 = -1;
					this.method607(this.anInt935);
					this.anInt935 = -1;
					this.method607(this.anInt906);
					this.anInt906 = -1;
					this.method607(this.anInt990);
					this.anInt990 = -1;
					this.method607(this.anInt978);
					this.anInt978 = -1;
					this.method607(this.anInt959);
					this.anInt959 = -1;
					this.method607(this.anInt1050);
					this.anInt1050 = -1;
					this.aBoolean233 = false;
					this.anInt854 = 3;
					this.anInt1020 = 0;
					this.aBoolean271 = false;
					this.aBoolean270 = false;
					this.aString30 = null;
					this.anInt916 = 0;
					this.anInt870 = -1;
					this.aBoolean250 = true;
					this.method717();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray257[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray9[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt1008 = 0;
					anInt848 = 0;
					anInt974 = 0;
					anInt963 = 0;
					anInt857 = 0;
					this.method627(this.anInt964);
				} else if (local74 == 3) {
					this.aString19 = "";
					this.aString20 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString19 = "Your account has been disabled.";
					this.aString20 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString19 = "Your account is already logged in.";
					this.aString20 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString19 = "RuneScape has been updated!";
					this.aString20 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString19 = "This world is full.";
					this.aString20 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString19 = "Unable to connect.";
					this.aString20 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString19 = "Login limit exceeded.";
					this.aString20 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString19 = "Unable to connect.";
					this.aString20 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString19 = "Login server rejected session.";
					this.aString20 = "Please try again.";
				} else if (local74 == 12) {
					this.aString19 = "You need a members account to login to this world.";
					this.aString20 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString19 = "Could not complete login.";
					this.aString20 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString19 = "The server is being updated.";
					this.aString20 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean272 = true;
					this.aClass4_Sub1_Sub3_9.anInt242 = 0;
					this.aClass4_Sub1_Sub3_6.anInt242 = 0;
					this.anInt893 = -1;
					this.anInt876 = -1;
					this.anInt877 = -1;
					this.anInt878 = -1;
					this.anInt892 = 0;
					this.anInt894 = 0;
					this.anInt1056 = 0;
					this.anInt1049 = 0;
					this.aBoolean271 = false;
					this.aLong29 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString19 = "Login attempts exceeded.";
					this.aString20 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString19 = "You are standing in a members-only area.";
					this.aString20 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString19 = "Invalid loginserver requested";
					this.aString20 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass40_1.method516();
					for (@Pc(918) int local918 = local389 + 3; local918 >= 0; local918--) {
						this.aString19 = "You have only just left another world";
						this.aString20 = "Your profile will be transferred in: " + local918;
						this.method646(true, 884);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(940) Exception local940) {
						}
					}
					this.method705(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString19 = "Malformed login packet.";
					this.aString20 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString19 = "Unexpected server response";
					this.aString20 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString19 = "No response from server";
					this.aString20 = "Please try using a different world.";
				} else if (this.anInt972 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(972) Exception local972) {
					}
					this.anInt972++;
					this.method705(arg0, arg1, arg2);
				} else {
					this.aString19 = "No response from loginserver";
					this.aString20 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1015) IOException local1015) {
			this.aString19 = "";
			this.aString20 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method706() {
		try {
			this.anInt892 += 0;
			this.aClass4_Sub1_Sub3_9.method156(243);
			if (this.anInt959 != -1) {
				this.method607(this.anInt959);
				this.anInt959 = -1;
				this.aBoolean251 = true;
				this.aBoolean233 = false;
				this.aBoolean244 = true;
			}
			if (this.anInt935 != -1) {
				this.method607(this.anInt935);
				this.anInt935 = -1;
				this.aBoolean255 = true;
				this.aBoolean233 = false;
			}
			if (this.anInt990 != -1) {
				this.method607(this.anInt990);
				this.anInt990 = -1;
				this.aBoolean242 = true;
			}
			if (this.anInt978 != -1) {
				this.method607(this.anInt978);
				this.anInt978 = -1;
			}
			if (this.anInt906 != -1) {
				this.method607(this.anInt906);
				this.anInt906 = -1;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("61557, " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!SZJROHQV;)V")
	private void method707(@OriginalArg(1) Class4_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt717 == 0) {
				local1 = this.aClass25_1.method368(arg0.anInt716, arg0.anInt718, arg0.anInt719);
			}
			if (arg0.anInt717 == 1) {
				local1 = this.aClass25_1.method369(arg0.anInt719, arg0.anInt718, arg0.anInt716);
			}
			if (arg0.anInt717 == 2) {
				local1 = this.aClass25_1.method370(arg0.anInt716, arg0.anInt718, arg0.anInt719);
			}
			if (arg0.anInt717 == 3) {
				local1 = this.aClass25_1.method371(arg0.anInt716, arg0.anInt718, arg0.anInt719);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass25_1.method372(arg0.anInt716, arg0.anInt718, arg0.anInt719, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt713 = local3;
			arg0.anInt715 = local5;
			arg0.anInt714 = local7;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("92122, " + -31799 + ", " + arg0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method708() {
		try {
			@Pc(36) int local36;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(57) int local57;
			@Pc(105) int local105;
			@Pc(119) int local119;
			@Pc(131) int local131;
			@Pc(190) int local190;
			try {
				this.anInt934 = -1;
				this.aClass23_12.method319();
				this.aClass23_11.method319();
				anInt905++;
				if (anInt905 > 65) {
					anInt905 = 0;
					this.aClass4_Sub1_Sub3_9.method156(203);
				}
				Class4_Sub1_Sub2_Sub3.method451();
				this.method613();
				this.aClass25_1.method342();
				System.gc();
				for (local36 = 0; local36 < 4; local36++) {
					this.aClass3Array1[local36].method12();
				}
				for (local49 = 0; local49 < 4; local49++) {
					for (local53 = 0; local53 < 104; local53++) {
						for (local57 = 0; local57 < 104; local57++) {
							this.aByteArrayArrayArray8[local49][local53][local57] = 0;
						}
					}
				}
				@Pc(91) Class29 local91 = new Class29(this.anIntArrayArrayArray7, 0, 104, 104, this.aByteArrayArrayArray8);
				local57 = this.aByteArrayArray6.length;
				this.aClass4_Sub1_Sub3_9.method156(121);
				@Pc(266) int local266;
				@Pc(254) int local254;
				if (!this.aBoolean245) {
					@Pc(136) byte[] local136;
					for (local105 = 0; local105 < local57; local105++) {
						local119 = (this.anIntArray244[local105] >> 8) * 64 - this.anInt1036;
						local131 = (this.anIntArray244[local105] & 0xFF) * 64 - this.anInt1037;
						local136 = this.aByteArrayArray6[local105];
						if (local136 != null) {
							local91.method421(this.aClass3Array1, local119, local131, local136, (this.anInt1058 - 6) * 8, (this.anInt1057 - 6) * 8);
						}
					}
					for (local119 = 0; local119 < local57; local119++) {
						local131 = (this.anIntArray244[local119] >> 8) * 64 - this.anInt1036;
						local190 = (this.anIntArray244[local119] & 0xFF) * 64 - this.anInt1037;
						@Pc(195) byte[] local195 = this.aByteArrayArray6[local119];
						if (local195 == null && this.anInt1058 < 800) {
							local91.method411(local131, 64, 64, local190);
						}
					}
					anInt846++;
					if (anInt846 > 59) {
						anInt846 = 0;
						this.aClass4_Sub1_Sub3_9.method156(126);
					}
					this.aClass4_Sub1_Sub3_9.method156(121);
					for (local131 = 0; local131 < local57; local131++) {
						local136 = this.aByteArrayArray5[local131];
						if (local136 != null) {
							local254 = (this.anIntArray244[local131] >> 8) * 64 - this.anInt1036;
							local266 = (this.anIntArray244[local131] & 0xFF) * 64 - this.anInt1037;
							local91.method427(local266, this.aClass25_1, local136, this.aClass3Array1, local254);
						}
					}
				}
				if (this.aBoolean245) {
					local105 = 0;
					label258: while (true) {
						@Pc(325) int local325;
						@Pc(331) int local331;
						@Pc(341) int local341;
						@Pc(343) int local343;
						if (local105 >= 4) {
							for (local119 = 0; local119 < 13; local119++) {
								for (local131 = 0; local131 < 13; local131++) {
									local190 = this.anIntArrayArrayArray8[0][local119][local131];
									if (local190 == -1) {
										local91.method411(local119 * 8, 8, 8, local131 * 8);
									}
								}
							}
							this.aClass4_Sub1_Sub3_9.method156(121);
							local131 = 0;
							while (true) {
								if (local131 >= 4) {
									break label258;
								}
								for (local190 = 0; local190 < 13; local190++) {
									for (local254 = 0; local254 < 13; local254++) {
										local266 = this.anIntArrayArrayArray8[local131][local190][local254];
										if (local266 != -1) {
											local325 = local266 >> 24 & 0x3;
											local331 = local266 >> 1 & 0x3;
											local341 = local266 >> 14 & 0x3FF;
											local343 = local266 >> 3 & 0x7FF;
											@Pc(506) int local506 = (local341 / 8 << 8) + local343 / 8;
											for (@Pc(508) int local508 = 0; local508 < this.anIntArray244.length; local508++) {
												if (this.anIntArray244[local508] == local506 && this.aByteArrayArray5[local508] != null) {
													local91.method408(this.aByteArrayArray5[local508], this.aClass3Array1, (local343 & 0x7) * 8, local190 * 8, local331, local131, (local341 & 0x7) * 8, this.aClass25_1, local254 * 8, local325);
													break;
												}
											}
										}
									}
								}
								local131++;
							}
						}
						for (local119 = 0; local119 < 13; local119++) {
							for (local131 = 0; local131 < 13; local131++) {
								local190 = this.anIntArrayArrayArray8[local105][local119][local131];
								if (local190 != -1) {
									local254 = local190 >> 24 & 0x3;
									local266 = local190 >> 1 & 0x3;
									local325 = local190 >> 14 & 0x3FF;
									local331 = local190 >> 3 & 0x7FF;
									local341 = (local325 / 8 << 8) + local331 / 8;
									for (local343 = 0; local343 < this.anIntArray244.length; local343++) {
										if (this.anIntArray244[local343] == local341 && this.aByteArrayArray6[local343] != null) {
											local91.method418(local131 * 8, local254, (local331 & 0x7) * 8, 293, local119 * 8, local266, this.aByteArrayArray6[local343], this.aClass3Array1, local105, (local325 & 0x7) * 8);
											break;
										}
									}
								}
							}
						}
						local105++;
					}
				}
				this.aClass4_Sub1_Sub3_9.method156(121);
				local91.method422(this.aClass3Array1, this.aClass25_1, this.aBoolean266);
				if (this.aClass47_17 != null) {
					this.aClass47_17.method556();
					Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
				}
				this.aClass4_Sub1_Sub3_9.method156(121);
				local105 = Class29.anInt521;
				if (local105 > this.anInt965) {
					local105 = this.anInt965;
				}
				if (local105 < this.anInt965 - 1) {
					local105 = this.anInt965 - 1;
				}
				if (aBoolean235) {
					this.aClass25_1.method343(Class29.anInt521);
				} else {
					this.aClass25_1.method343(0);
				}
				for (local119 = 0; local119 < 104; local119++) {
					for (local131 = 0; local131 < 104; local131++) {
						this.method588(local119, local131);
					}
				}
				this.method671(this.aBoolean241);
			} catch (@Pc(659) Exception local659) {
			}
			Class20.aClass1_3.method3();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass4_Sub1_Sub3_9.method156(98);
				this.aClass4_Sub1_Sub3_9.method161(1057001181);
			}
			if (aBoolean235 && signlink.aRandomAccessFile3 != null) {
				local36 = this.aClass10_Sub1_1.method143(anInt912, 0);
				for (local49 = 0; local49 < local36; local49++) {
					local53 = this.aClass10_Sub1_1.method136(local49);
					if ((local53 & 0x79) == 0) {
						Class4_Sub1_Sub1_Sub3.method282(local49);
					}
				}
			}
			System.gc();
			Class4_Sub1_Sub2_Sub3.method452();
			this.aBoolean272 &= true;
			this.aClass10_Sub1_1.method141();
			local36 = (this.anInt1057 - 6) / 8 - 1;
			local49 = (this.anInt1057 + 6) / 8 + 1;
			local53 = (this.anInt1058 - 6) / 8 - 1;
			local57 = (this.anInt1058 + 6) / 8 + 1;
			if (this.aBoolean248) {
				local36 = 49;
				local49 = 50;
				local53 = 49;
				local57 = 50;
			}
			for (local105 = local36; local105 <= local49; local105++) {
				for (local119 = local53; local119 <= local57; local119++) {
					if (local105 == local36 || local105 == local49 || local119 == local53 || local119 == local57) {
						local131 = this.aClass10_Sub1_1.method132((byte) 9, 0, local119, local105);
						if (local131 != -1) {
							this.aClass10_Sub1_1.method138(3, local131);
						}
						local190 = this.aClass10_Sub1_1.method132((byte) 9, 1, local119, local105);
						if (local190 != -1) {
							this.aClass10_Sub1_1.method138(3, local190);
						}
					}
				}
			}
		} catch (@Pc(829) RuntimeException local829) {
			signlink.reporterror("86340, " + true + ", " + local829.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method709() {
		try {
			while (true) {
				@Pc(14) Class4_Sub1_Sub4 local14 = this.aClass10_Sub1_1.method128();
				if (local14 == null) {
					return;
				}
				if (local14.anInt711 == 0) {
					Class4_Sub1_Sub1_Sub3.method281(local14.aByteArray17, local14.anInt712);
					if ((this.aClass10_Sub1_1.method136(local14.anInt712) & 0x62) != 0) {
						this.aBoolean251 = true;
						if (this.anInt935 != -1 || this.anInt1005 != -1) {
							this.aBoolean255 = true;
						}
					}
				}
				if (local14.anInt711 == 1 && local14.aByteArray17 != null) {
					Class22.method271(930, local14.aByteArray17);
				}
				if (local14.anInt711 == 2 && local14.anInt712 == this.anInt1052 && local14.aByteArray17 != null) {
					this.method611(local14.aByteArray17, this.aBoolean274);
				}
				if (local14.anInt711 == 3 && this.anInt874 == 1) {
					for (@Pc(89) int local89 = 0; local89 < this.aByteArrayArray6.length; local89++) {
						if (this.anIntArray245[local89] == local14.anInt712) {
							this.aByteArrayArray6[local89] = local14.aByteArray17;
							if (local14.aByteArray17 == null) {
								this.anIntArray245[local89] = -1;
							}
							break;
						}
						if (this.anIntArray246[local89] == local14.anInt712) {
							this.aByteArrayArray5[local89] = local14.aByteArray17;
							if (local14.aByteArray17 == null) {
								this.anIntArray246[local89] = -1;
							}
							break;
						}
					}
				}
				if (local14.anInt711 == 93 && this.aClass10_Sub1_1.method140(223, local14.anInt712)) {
					Class29.method423(new Class4_Sub1_Sub3(local14.aByteArray17, false), this.aClass10_Sub1_1);
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("6262, " + 9 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method710() {
		try {
			if (this.anInt1056 > 1) {
				this.anInt1056--;
			}
			if (this.anInt896 > 0) {
				this.anInt896--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method640(); local22++) {
			}
			if (this.aBoolean272) {
				@Pc(41) Object local41 = this.aClass16_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass16_1.anObject1) {
					if (!aBoolean247) {
						this.aClass16_1.anInt286 = 0;
					} else if (super.anInt831 != 0 || this.aClass16_1.anInt286 >= 40) {
						this.aClass4_Sub1_Sub3_9.method156(93);
						this.aClass4_Sub1_Sub3_9.method157(0);
						local66 = this.aClass4_Sub1_Sub3_9.anInt242;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass16_1.anInt286 && local66 - this.aClass4_Sub1_Sub3_9.anInt242 < 240; local70++) {
							local68++;
							local86 = this.aClass16_1.anIntArray35[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass16_1.anIntArray36[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass16_1.anIntArray35[local70] == -1 && this.aClass16_1.anIntArray36[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt929 || local86 != this.anInt930) {
								@Pc(165) int local165 = local103 - this.anInt929;
								this.anInt929 = local103;
								@Pc(173) int local173 = local86 - this.anInt930;
								this.anInt930 = local86;
								if (this.anInt962 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass4_Sub1_Sub3_9.method158((this.anInt962 << 12) + (local165 << 6) + local173);
									this.anInt962 = 0;
								} else if (this.anInt962 < 8) {
									this.aClass4_Sub1_Sub3_9.method160((this.anInt962 << 19) + local120 + 8388608);
									this.anInt962 = 0;
								} else {
									this.aClass4_Sub1_Sub3_9.method161((this.anInt962 << 19) + local120 - 1073741824);
									this.anInt962 = 0;
								}
							} else if (this.anInt962 < 2047) {
								this.anInt962++;
							}
						}
						this.aClass4_Sub1_Sub3_9.method166(this.aClass4_Sub1_Sub3_9.anInt242 - local66);
						if (local68 >= this.aClass16_1.anInt286) {
							this.aClass16_1.anInt286 = 0;
						} else {
							this.aClass16_1.anInt286 -= local68;
							for (local86 = 0; local86 < this.aClass16_1.anInt286; local86++) {
								this.aClass16_1.anIntArray36[local86] = this.aClass16_1.anIntArray36[local86 + local68];
								this.aClass16_1.anIntArray35[local86] = this.aClass16_1.anIntArray35[local86 + local68];
							}
						}
					}
				}
				if (super.anInt831 != 0) {
					@Pc(335) long local335 = (super.aLong28 - this.aLong32) / 50L;
					if (local335 > 4095L) {
						local335 = 4095L;
					}
					this.aLong32 = super.aLong28;
					local66 = super.anInt833;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt832;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(381) byte local381 = 0;
					if (super.anInt831 == 2) {
						local381 = 1;
					}
					local103 = (int) local335;
					this.aClass4_Sub1_Sub3_9.method156(185);
					this.aClass4_Sub1_Sub3_9.method200((local103 << 20) + (local381 << 19) + local70, this.aBoolean239);
				}
				if (this.anInt999 > 0) {
					this.anInt999--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean264 = true;
				}
				if (this.aBoolean264 && this.anInt999 <= 0) {
					this.anInt999 = 20;
					this.aBoolean264 = false;
					this.aClass4_Sub1_Sub3_9.method156(218);
					this.aClass4_Sub1_Sub3_9.method192(this.anInt1012, (byte) 9);
					this.aClass4_Sub1_Sub3_9.method158(this.anInt1011);
				}
				if (super.aBoolean232 && !this.aBoolean260) {
					this.aBoolean260 = true;
					this.aClass4_Sub1_Sub3_9.method156(28);
					this.aClass4_Sub1_Sub3_9.method157(1);
				}
				if (!super.aBoolean232 && this.aBoolean260) {
					this.aBoolean260 = false;
					this.aClass4_Sub1_Sub3_9.method156(28);
					this.aClass4_Sub1_Sub3_9.method157(0);
				}
				this.method674();
				this.method722(337);
				this.method693();
				this.anInt894++;
				if (this.anInt894 > 750) {
					this.method647();
				}
				this.method605();
				this.method614();
				this.method643();
				this.anInt849++;
				if (this.anInt942 != 0) {
					this.anInt941 += 20;
					if (this.anInt941 >= 400) {
						this.anInt942 = 0;
					}
				}
				if (this.anInt924 != 0) {
					this.anInt921++;
					if (this.anInt921 >= 15) {
						if (this.anInt924 == 2) {
							this.aBoolean251 = true;
						}
						if (this.anInt924 == 3) {
							this.aBoolean255 = true;
						}
						this.anInt924 = 0;
					}
				}
				if (this.anInt955 != 0) {
					this.anInt1048++;
					if (super.anInt826 > this.anInt956 + 5 || super.anInt826 < this.anInt956 - 5 || super.anInt827 > this.anInt957 + 5 || super.anInt827 < this.anInt957 - 5) {
						this.aBoolean269 = true;
					}
					if (super.anInt825 == 0) {
						if (this.anInt955 == 2) {
							this.aBoolean251 = true;
						}
						if (this.anInt955 == 3) {
							this.aBoolean255 = true;
						}
						this.anInt955 = 0;
						if (this.aBoolean269 && this.anInt1048 >= 5) {
							this.anInt1061 = -1;
							this.method596((byte) 9);
							if (this.anInt1061 == this.anInt953 && this.anInt1060 != this.anInt954) {
								@Pc(683) Class27 local683 = Class27.method405(this.anInt953);
								@Pc(685) byte local685 = 0;
								if (this.anInt858 == 1 && local683.anInt480 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray124[this.anInt1060] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean142) {
									local66 = this.anInt954;
									local68 = this.anInt1060;
									local683.anIntArray124[local68] = local683.anIntArray124[local66];
									local683.anIntArray128[local68] = local683.anIntArray128[local66];
									local683.anIntArray124[local66] = -1;
									local683.anIntArray128[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt954;
									local68 = this.anInt1060;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method400(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local683.method400(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local683.method400(this.anInt1060, this.anInt954);
								}
								this.aClass4_Sub1_Sub3_9.method156(205);
								this.aClass4_Sub1_Sub3_9.method190(this.anInt954);
								this.aClass4_Sub1_Sub3_9.method184(this.aByte39, local685);
								this.aClass4_Sub1_Sub3_9.method190(this.anInt1060);
								this.aClass4_Sub1_Sub3_9.method191(this.anInt953);
							}
						} else if ((this.anInt902 == 1 || this.method631(this.anInt1049 - 1)) && this.anInt1049 > 2) {
							this.method701();
						} else if (this.anInt1049 > 0) {
							this.method664(this.anInt1049 - 1);
						}
						this.anInt921 = 10;
						super.anInt831 = 0;
					}
				}
				@Pc(859) int local859;
				@Pc(861) int local861;
				if (Class25.anInt443 != -1) {
					local859 = Class25.anInt443;
					local861 = Class25.anInt444;
					@Pc(882) boolean local882 = this.method690(true, 0, 0, local859, local861, 0, 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray156[0], 0, aClass4_Sub1_Sub1_Sub1_Sub2_1.anIntArray157[0], 0);
					Class25.anInt443 = -1;
					if (local882) {
						this.anInt939 = super.anInt832;
						this.anInt940 = super.anInt833;
						this.anInt942 = 1;
						this.anInt941 = 0;
					}
				}
				if (super.anInt831 == 1 && this.aString30 != null) {
					this.aString30 = null;
					this.aBoolean255 = true;
					super.anInt831 = 0;
				}
				this.method610();
				if (this.anInt990 == -1) {
					this.method653();
					this.method660();
					this.method685();
				}
				if (super.anInt825 == 1 || super.anInt831 == 1) {
					this.anInt1021++;
				}
				if (this.anInt995 == 0 && this.anInt1046 == 0 && this.anInt996 == 0) {
					if (this.anInt1055 > 0) {
						this.anInt1055--;
					}
				} else if (this.anInt1055 < 100) {
					this.anInt1055++;
					if (this.anInt1055 == 100) {
						if (this.anInt995 != 0) {
							this.aBoolean255 = true;
						}
						if (this.anInt1046 != 0) {
							this.aBoolean251 = true;
						}
					}
				}
				if (this.anInt874 == 2) {
					this.method713();
				}
				if (this.anInt874 == 2 && this.aBoolean261) {
					this.method670();
				}
				for (local859 = 0; local859 < 5; local859++) {
					@Pc(1018) int local1018 = this.anIntArray241[local859]++;
				}
				this.method687();
				super.anInt824++;
				if (super.anInt824 > 4500) {
					this.anInt896 = 250;
					super.anInt824 -= 500;
					this.aClass4_Sub1_Sub3_9.method156(54);
				}
				this.anInt919++;
				if (this.anInt865 > 1 || this.anInt865 < 1) {
					this.aBoolean236 = !this.aBoolean236;
				}
				if (this.anInt919 > 500) {
					this.anInt919 = 0;
					local861 = (int) (Math.random() * 8.0D);
					if ((local861 & 0x1) == 1) {
						this.anInt1034 += this.anInt1035;
					}
					if ((local861 & 0x2) == 2) {
						this.anInt1063 += this.anInt1064;
					}
					if ((local861 & 0x4) == 4) {
						this.anInt898 += this.anInt899;
					}
				}
				if (this.anInt1034 < -50) {
					this.anInt1035 = 2;
				}
				if (this.anInt1034 > 50) {
					this.anInt1035 = -2;
				}
				if (this.anInt1063 < -55) {
					this.anInt1064 = 2;
				}
				if (this.anInt1063 > 55) {
					this.anInt1064 = -2;
				}
				if (this.anInt898 < -40) {
					this.anInt899 = 1;
				}
				if (this.anInt898 > 40) {
					this.anInt899 = -1;
				}
				this.anInt873++;
				if (this.anInt873 > 500) {
					this.anInt873 = 0;
					local861 = (int) (Math.random() * 8.0D);
					if ((local861 & 0x1) == 1) {
						this.anInt842 += this.anInt843;
					}
					if ((local861 & 0x2) == 2) {
						this.anInt867 += this.anInt868;
					}
				}
				if (this.anInt842 < -60) {
					this.anInt843 = 2;
				}
				if (this.anInt842 > 60) {
					this.anInt843 = -2;
				}
				if (this.anInt867 < -20) {
					this.anInt868 = 1;
				}
				if (this.anInt867 > 10) {
					this.anInt868 = -1;
				}
				this.anInt895++;
				if (this.anInt895 > 50) {
					this.aClass4_Sub1_Sub3_9.method156(121);
				}
				try {
					if (this.aClass40_1 != null && this.aClass4_Sub1_Sub3_9.anInt242 > 0) {
						this.aClass40_1.method519(this.aClass4_Sub1_Sub3_9.aByteArray7, this.aClass4_Sub1_Sub3_9.anInt242);
						this.aClass4_Sub1_Sub3_9.anInt242 = 0;
						this.anInt895 = 0;
					}
				} catch (@Pc(1276) IOException local1276) {
					this.method647();
				} catch (@Pc(1281) Exception local1281) {
					this.method634();
				}
			}
		} catch (@Pc(1286) RuntimeException local1286) {
			signlink.reporterror("56049, " + 1 + ", " + local1286.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!LORGYGVM;)Z")
	private boolean method711(@OriginalArg(1) Class27 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt480;
			if (local4 >= 1 && local4 <= 200 || !(local4 < 701 || local4 > 900)) {
				if (local4 >= 801) {
					local4 -= 701;
				} else if (local4 >= 701) {
					local4 -= 601;
				} else if (local4 >= 101) {
					local4 -= 101;
				} else {
					local4--;
				}
				this.aStringArray10[this.anInt1049] = "Remove @whi@" + this.aStringArray13[local4];
				this.anIntArray232[this.anInt1049] = 388;
				this.anInt1049++;
				this.aStringArray10[this.anInt1049] = "Message @whi@" + this.aStringArray13[local4];
				this.anIntArray232[this.anInt1049] = 17;
				this.anInt1049++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray10[this.anInt1049] = "Remove @whi@" + arg0.aString13;
				this.anIntArray232[this.anInt1049] = 711;
				this.anInt1049++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("49375, " + -25839 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!LORGYGVM;IIIII)V")
	private void method712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class27 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2.anInt471 == 0 && arg2.anIntArray129 != null && !arg2.aBoolean141 && (arg6 >= arg5 && arg0 >= arg4 && arg6 <= arg5 + arg2.anInt481 && arg0 <= arg4 + arg2.anInt494)) {
				@Pc(34) int local34 = arg2.anIntArray129.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg2.anIntArray122[local36] + arg5;
					@Pc(54) int local54 = arg2.anIntArray123[local36] + arg4 - arg1;
					@Pc(60) Class27 local60 = Class27.method405(arg2.anIntArray129[local36]);
					@Pc(65) int local65 = local45 + local60.anInt495;
					@Pc(70) int local70 = local54 + local60.anInt489;
					if ((local60.anInt472 >= 0 || local60.anInt462 != 0) && arg6 >= local65 && arg0 >= local70 && arg6 < local65 + local60.anInt481 && arg0 < local70 + local60.anInt494) {
						if (local60.anInt472 >= 0) {
							this.anInt917 = local60.anInt472;
						} else {
							this.anInt917 = local60.anInt482;
						}
					}
					if (local60.anInt471 == 8 && arg6 >= local65 && arg0 >= local70 && arg6 < local65 + local60.anInt481 && arg0 < local70 + local60.anInt494) {
						this.anInt889 = local60.anInt482;
					}
					if (local60.anInt471 == 0) {
						this.method712(arg0, local60.anInt461, local60, arg3, local70, local65, arg6);
						if (local60.anInt473 > local60.anInt494) {
							this.method606(local60.anInt494, local60, local70, local60.anInt473, arg3, arg0, arg6, local65 + local60.anInt481);
						}
					} else {
						if (local60.anInt483 == 1 && arg6 >= local65 && arg0 >= local70 && arg6 < local65 + local60.anInt481 && arg0 < local70 + local60.anInt494) {
							@Pc(194) boolean local194 = false;
							if (local60.anInt480 != 0) {
								local194 = this.method711(local60);
							}
							if (!local194) {
								this.aStringArray10[this.anInt1049] = local60.aString11;
								this.anIntArray232[this.anInt1049] = 36;
								this.anIntArray231[this.anInt1049] = local60.anInt482;
								this.anInt1049++;
							}
						}
						if (local60.anInt483 == 2 && this.anInt991 == 0 && arg6 >= local65 && arg0 >= local70 && arg6 < local65 + local60.anInt481 && arg0 < local70 + local60.anInt494) {
							@Pc(258) String local258 = local60.aString12;
							if (local258.indexOf(" ") != -1) {
								local258 = local258.substring(0, local258.indexOf(" "));
							}
							this.aStringArray10[this.anInt1049] = local258 + " @gre@" + local60.aString9;
							this.anIntArray232[this.anInt1049] = 37;
							this.anIntArray231[this.anInt1049] = local60.anInt482;
							this.anInt1049++;
						}
						if (local60.anInt483 == 3 && arg6 >= local65 && arg0 >= local70 && arg6 < local65 + local60.anInt481 && arg0 < local70 + local60.anInt494) {
							this.aStringArray10[this.anInt1049] = "Close";
							if (arg3 == 3) {
								this.anIntArray232[this.anInt1049] = 841;
							} else {
								this.anIntArray232[this.anInt1049] = 786;
							}
							this.anIntArray231[this.anInt1049] = local60.anInt482;
							this.anInt1049++;
						}
						if (local60.anInt483 == 4 && arg6 >= local65 && arg0 >= local70 && arg6 < local65 + local60.anInt481 && arg0 < local70 + local60.anInt494) {
							this.aStringArray10[this.anInt1049] = local60.aString11;
							this.anIntArray232[this.anInt1049] = 227;
							this.anIntArray231[this.anInt1049] = local60.anInt482;
							this.anInt1049++;
						}
						if (local60.anInt483 == 5 && arg6 >= local65 && arg0 >= local70 && arg6 < local65 + local60.anInt481 && arg0 < local70 + local60.anInt494) {
							this.aStringArray10[this.anInt1049] = local60.aString11;
							this.anIntArray232[this.anInt1049] = 738;
							this.anIntArray231[this.anInt1049] = local60.anInt482;
							this.anInt1049++;
						}
						if (local60.anInt483 == 6 && !this.aBoolean233 && arg6 >= local65 && arg0 >= local70 && arg6 < local65 + local60.anInt481 && arg0 < local70 + local60.anInt494) {
							this.aStringArray10[this.anInt1049] = local60.aString11;
							this.anIntArray232[this.anInt1049] = 211;
							this.anIntArray231[this.anInt1049] = local60.anInt482;
							this.anInt1049++;
						}
						if (local60.anInt471 == 2) {
							@Pc(517) int local517 = 0;
							for (@Pc(519) int local519 = 0; local519 < local60.anInt494; local519++) {
								for (@Pc(523) int local523 = 0; local523 < local60.anInt481; local523++) {
									@Pc(534) int local534 = local65 + local523 * (local60.anInt492 + 32);
									@Pc(543) int local543 = local70 + local519 * (local60.anInt491 + 32);
									if (local517 < 20) {
										local534 += local60.anIntArray127[local517];
										local543 += local60.anIntArray125[local517];
									}
									if (arg6 >= local534 && arg0 >= local543 && arg6 < local534 + 32 && arg0 < local543 + 32) {
										this.anInt1060 = local517;
										this.anInt1061 = local60.anInt482;
										if (local60.anIntArray124[local517] > 0) {
											@Pc(596) Class44 local596 = Class44.method536(local60.anIntArray124[local517] - 1);
											if (this.anInt885 == 1 && local60.aBoolean149) {
												if (local60.anInt482 != this.anInt887 || local517 != this.anInt886) {
													this.aStringArray10[this.anInt1049] = "Use " + this.aString25 + " with @lre@" + local596.aString16;
													this.anIntArray232[this.anInt1049] = 482;
													this.anIntArray233[this.anInt1049] = local596.anInt799;
													this.anIntArray230[this.anInt1049] = local517;
													this.anIntArray231[this.anInt1049] = local60.anInt482;
													this.anInt1049++;
												}
											} else if (this.anInt991 != 1 || !local60.aBoolean149) {
												@Pc(733) int local733;
												if (local60.aBoolean149) {
													for (local733 = 4; local733 >= 3; local733--) {
														if (local596.aStringArray6 != null && local596.aStringArray6[local733] != null) {
															this.aStringArray10[this.anInt1049] = local596.aStringArray6[local733] + " @lre@" + local596.aString16;
															if (local733 == 3) {
																this.anIntArray232[this.anInt1049] = 800;
															}
															if (local733 == 4) {
																this.anIntArray232[this.anInt1049] = 866;
															}
															this.anIntArray233[this.anInt1049] = local596.anInt799;
															this.anIntArray230[this.anInt1049] = local517;
															this.anIntArray231[this.anInt1049] = local60.anInt482;
															this.anInt1049++;
														} else if (local733 == 4) {
															this.aStringArray10[this.anInt1049] = "Drop @lre@" + local596.aString16;
															this.anIntArray232[this.anInt1049] = 866;
															this.anIntArray233[this.anInt1049] = local596.anInt799;
															this.anIntArray230[this.anInt1049] = local517;
															this.anIntArray231[this.anInt1049] = local60.anInt482;
															this.anInt1049++;
														}
													}
												}
												if (local60.aBoolean147) {
													this.aStringArray10[this.anInt1049] = "Use @lre@" + local596.aString16;
													this.anIntArray232[this.anInt1049] = 219;
													this.anIntArray233[this.anInt1049] = local596.anInt799;
													this.anIntArray230[this.anInt1049] = local517;
													this.anIntArray231[this.anInt1049] = local60.anInt482;
													this.anInt1049++;
												}
												if (local60.aBoolean149 && local596.aStringArray6 != null) {
													for (local733 = 2; local733 >= 0; local733--) {
														if (local596.aStringArray6[local733] != null) {
															this.aStringArray10[this.anInt1049] = local596.aStringArray6[local733] + " @lre@" + local596.aString16;
															if (local733 == 0) {
																this.anIntArray232[this.anInt1049] = 963;
															}
															if (local733 == 1) {
																this.anIntArray232[this.anInt1049] = 984;
															}
															if (local733 == 2) {
																this.anIntArray232[this.anInt1049] = 816;
															}
															this.anIntArray233[this.anInt1049] = local596.anInt799;
															this.anIntArray230[this.anInt1049] = local517;
															this.anIntArray231[this.anInt1049] = local60.anInt482;
															this.anInt1049++;
														}
													}
												}
												if (local60.aStringArray4 != null) {
													for (local733 = 4; local733 >= 0; local733--) {
														if (local60.aStringArray4[local733] != null) {
															this.aStringArray10[this.anInt1049] = local60.aStringArray4[local733] + " @lre@" + local596.aString16;
															if (local733 == 0) {
																this.anIntArray232[this.anInt1049] = 285;
															}
															if (local733 == 1) {
																this.anIntArray232[this.anInt1049] = 881;
															}
															if (local733 == 2) {
																this.anIntArray232[this.anInt1049] = 875;
															}
															if (local733 == 3) {
																this.anIntArray232[this.anInt1049] = 397;
															}
															if (local733 == 4) {
																this.anIntArray232[this.anInt1049] = 233;
															}
															this.anIntArray233[this.anInt1049] = local596.anInt799;
															this.anIntArray230[this.anInt1049] = local517;
															this.anIntArray231[this.anInt1049] = local60.anInt482;
															this.anInt1049++;
														}
													}
												}
												this.aStringArray10[this.anInt1049] = "Examine @lre@" + local596.aString16;
												this.anIntArray232[this.anInt1049] = 1948;
												this.anIntArray233[this.anInt1049] = local596.anInt799;
												this.anIntArray230[this.anInt1049] = local517;
												this.anIntArray231[this.anInt1049] = local60.anInt482;
												this.anInt1049++;
											} else if ((this.anInt993 & 0x10) == 16) {
												this.aStringArray10[this.anInt1049] = this.aString29 + " @lre@" + local596.aString16;
												this.anIntArray232[this.anInt1049] = 492;
												this.anIntArray233[this.anInt1049] = local596.anInt799;
												this.anIntArray230[this.anInt1049] = local517;
												this.anIntArray231[this.anInt1049] = local60.anInt482;
												this.anInt1049++;
											}
										}
									}
									local517++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1165) RuntimeException local1165) {
			signlink.reporterror("73399, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 173 + ", " + arg5 + ", " + arg6 + ", " + local1165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method713() {
		try {
			try {
				@Pc(15) int local15 = aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 + this.anInt1034;
				@Pc(21) int local21 = aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 + this.anInt1063;
				if (this.anInt997 - local15 < -500 || this.anInt997 - local15 > 500 || this.anInt998 - local21 < -500 || this.anInt998 - local21 > 500) {
					this.anInt997 = local15;
					this.anInt998 = local21;
				}
				if (this.anInt997 != local15) {
					this.anInt997 += (local15 - this.anInt997) / 16;
				}
				if (this.anInt998 != local21) {
					this.anInt998 += (local21 - this.anInt998) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1013 += (-this.anInt1013 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1013 += (24 - this.anInt1013) / 2;
				} else {
					this.anInt1013 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1014 += (12 - this.anInt1014) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1014 += (-this.anInt1014 - 12) / 2;
				} else {
					this.anInt1014 /= 2;
				}
				this.anInt1012 = this.anInt1012 + this.anInt1013 / 2 & 0x7FF;
				this.anInt1011 += this.anInt1014 / 2;
				if (this.anInt1011 < 128) {
					this.anInt1011 = 128;
				}
				if (this.anInt1011 > 383) {
					this.anInt1011 = 383;
				}
				@Pc(208) int local208 = this.anInt997 >> 7;
				@Pc(213) int local213 = this.anInt998 >> 7;
				@Pc(223) int local223 = this.method699(this.anInt997, this.anInt998, this.anInt965);
				@Pc(225) int local225 = 0;
				@Pc(241) int local241;
				if (local208 > 3 && local213 > 3 && local208 < 100 && local213 < 100) {
					for (local241 = local208 - 4; local241 <= local208 + 4; local241++) {
						for (@Pc(247) int local247 = local213 - 4; local247 <= local213 + 4; local247++) {
							@Pc(252) int local252 = this.anInt965;
							if (local252 < 3 && (this.aByteArrayArrayArray8[1][local241][local247] & 0x2) == 2) {
								local252++;
							}
							@Pc(279) int local279 = local223 - this.anIntArrayArrayArray7[local252][local241][local247];
							if (local279 > local225) {
								local225 = local279;
							}
						}
					}
				}
				local241 = local225 * 192;
				if (local241 > 98048) {
					local241 = 98048;
				}
				if (local241 < 32768) {
					local241 = 32768;
				}
				if (local241 > this.anInt982) {
					this.anInt982 += (local241 - this.anInt982) / 24;
				} else if (local241 < this.anInt982) {
					this.anInt982 += (local241 - this.anInt982) / 80;
				}
			} catch (@Pc(343) Exception local343) {
				signlink.reporterror("glfc_ex " + aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 + "," + aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 + "," + this.anInt997 + "," + this.anInt998 + "," + this.anInt1057 + "," + this.anInt1058 + "," + this.anInt1036 + "," + this.anInt1037);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("99199, " + -103 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method714() {
		try {
			this.aClass47_16.method556();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt976 == 2) {
				@Pc(13) byte[] local13 = this.aClass4_Sub1_Sub2_Sub1_7.aByteArray2;
				@Pc(15) int[] local15 = Class4_Sub1_Sub2.anIntArray165;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass4_Sub1_Sub2_Sub2_3.method263(this.anInt1012, this.anIntArray220, 25, 25, this.anIntArray268, 33, 33, 0, 256, 0);
				this.aClass47_17.method556();
				Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
			} else {
				@Pc(67) int local67 = this.anInt1012 + this.anInt842 & 0x7FF;
				@Pc(74) int local74 = aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32 + 48;
				local18 = 464 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
				this.aClass4_Sub1_Sub2_Sub2_17.method263(local67, this.anIntArray247, local74, local18, this.anIntArray255, 146, 151, 25, this.anInt867 + 256, 5);
				this.aClass4_Sub1_Sub2_Sub2_3.method263(this.anInt1012, this.anIntArray220, 25, 25, this.anIntArray268, 33, 33, 0, 256, 0);
				for (local20 = 0; local20 < this.anInt911; local20++) {
					local74 = this.anIntArray234[local20] * 4 + 2 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32;
					local18 = this.anIntArray235[local20] * 4 + 2 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
					this.method633(local18, local74, this.aClass4_Sub1_Sub2_Sub2Array4[local20]);
				}
				@Pc(169) int local169;
				for (@Pc(165) int local165 = 0; local165 < 104; local165++) {
					for (local169 = 0; local169 < 104; local169++) {
						@Pc(181) Class23 local181 = this.aClass23ArrayArrayArray1[this.anInt965][local165][local169];
						if (local181 != null) {
							local74 = local165 * 4 + 2 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32;
							local18 = local169 * 4 + 2 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
							this.method633(local18, local74, this.aClass4_Sub1_Sub2_Sub2_4);
						}
					}
				}
				for (local169 = 0; local169 < this.anInt1009; local169++) {
					@Pc(232) Class4_Sub1_Sub1_Sub1_Sub1 local232 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray262[local169]];
					if (local232 != null && local232.method469()) {
						@Pc(241) Class2 local241 = local232.aClass2_1;
						if (local241.anIntArray3 != null) {
							local241 = local241.method6(this.aByte30);
						}
						if (local241 != null && local241.aBoolean4 && local241.aBoolean2) {
							local74 = local232.anInt648 / 32 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32;
							local18 = local232.anInt649 / 32 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
							this.method633(local18, local74, this.aClass4_Sub1_Sub2_Sub2_5);
						}
					}
				}
				@Pc(301) Class4_Sub1_Sub1_Sub1_Sub2 local301;
				for (@Pc(291) int local291 = 0; local291 < this.anInt909; local291++) {
					local301 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray228[local291]];
					if (local301 != null && local301.method469()) {
						local74 = local301.anInt648 / 32 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32;
						local18 = local301.anInt649 / 32 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
						@Pc(329) boolean local329 = false;
						@Pc(333) long local333 = Class46.method550(local301.aString15);
						for (@Pc(335) int local335 = 0; local335 < this.anInt890; local335++) {
							if (local333 == this.aLongArray4[local335] && this.anIntArray214[local335] != 0) {
								local329 = true;
								break;
							}
						}
						@Pc(360) boolean local360 = false;
						if (aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt690 != 0 && local301.anInt690 != 0 && aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt690 == local301.anInt690) {
							local360 = true;
						}
						if (local329) {
							this.method633(local18, local74, this.aClass4_Sub1_Sub2_Sub2_7);
						} else if (local360) {
							this.method633(local18, local74, this.aClass4_Sub1_Sub2_Sub2_8);
						} else {
							this.method633(local18, local74, this.aClass4_Sub1_Sub2_Sub2_6);
						}
					}
				}
				if (this.anInt928 != 0 && anInt866 % 20 < 10) {
					if (this.anInt928 == 1 && this.anInt937 >= 0 && this.anInt937 < this.aClass4_Sub1_Sub1_Sub1_Sub1Array1.length) {
						@Pc(434) Class4_Sub1_Sub1_Sub1_Sub1 local434 = this.aClass4_Sub1_Sub1_Sub1_Sub1Array1[this.anInt937];
						if (local434 != null) {
							local74 = local434.anInt648 / 32 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32;
							local18 = local434.anInt649 / 32 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
							this.method698(local74, this.aClass4_Sub1_Sub2_Sub2_14, local18);
						}
					}
					if (this.anInt928 == 2) {
						local74 = (this.anInt947 - this.anInt1036) * 4 + 2 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32;
						local18 = (this.anInt948 - this.anInt1037) * 4 + 2 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
						this.method698(local74, this.aClass4_Sub1_Sub2_Sub2_14, local18);
					}
					if (this.anInt928 == 10 && this.anInt901 >= 0 && this.anInt901 < this.aClass4_Sub1_Sub1_Sub1_Sub2Array1.length) {
						local301 = this.aClass4_Sub1_Sub1_Sub1_Sub2Array1[this.anInt901];
						if (local301 != null) {
							local74 = local301.anInt648 / 32 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32;
							local18 = local301.anInt649 / 32 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
							this.method698(local74, this.aClass4_Sub1_Sub2_Sub2_14, local18);
						}
					}
				}
				if (this.anInt1053 != 0) {
					local74 = this.anInt1053 * 4 + 2 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt648 / 32;
					local18 = this.anInt1054 * 4 + 2 - aClass4_Sub1_Sub1_Sub1_Sub2_1.anInt649 / 32;
					this.method633(local18, local74, this.aClass4_Sub1_Sub2_Sub2_13);
				}
				Class4_Sub1_Sub2.method487(78, 3, 3, 97, 16777215);
				this.aClass47_17.method556();
				Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
			}
		} catch (@Pc(605) RuntimeException local605) {
			signlink.reporterror("77094, " + true + ", " + local605.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class4_Sub3 local1 = null;
			for (@Pc(6) Class4_Sub3 local6 = (Class4_Sub3) this.aClass23_10.method315(); local6 != null; local6 = (Class4_Sub3) this.aClass23_10.method317()) {
				if (local6.anInt716 == arg8 && local6.anInt718 == arg5 && local6.anInt719 == arg0 && local6.anInt717 == arg3) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class4_Sub3();
				local1.anInt716 = arg8;
				local1.anInt717 = arg3;
				local1.anInt718 = arg5;
				local1.anInt719 = arg0;
				this.method707(local1);
				this.aClass23_10.method312(local1);
			}
			local1.anInt722 = arg2;
			local1.anInt724 = arg4;
			@Pc(71) boolean local71 = false;
			local1.anInt723 = arg1;
			local1.anInt721 = arg9;
			local1.anInt720 = arg7;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("7554, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method716(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt890 >= 100 && this.anInt1016 != 1) {
					this.method628("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt890 >= 200) {
					this.method628("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class46.method554(Class46.method551(arg0));
					if (arg1 != this.anInt869) {
						this.aClass4_Sub1_Sub3_9.method157(22);
					}
					for (@Pc(48) int local48 = 0; local48 < this.anInt890; local48++) {
						if (this.aLongArray4[local48] == arg0) {
							this.method628("", 0, local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(78) int local78 = 0; local78 < this.anInt943; local78++) {
						if (this.aLongArray3[local78] == arg0) {
							this.method628("", 0, "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass4_Sub1_Sub1_Sub1_Sub2_1.aString15)) {
						this.aStringArray13[this.anInt890] = local38;
						this.aLongArray4[this.anInt890] = arg0;
						this.anIntArray214[this.anInt890] = 0;
						this.anInt890++;
						this.aBoolean251 = true;
						this.aClass4_Sub1_Sub3_9.method156(217);
						this.aClass4_Sub1_Sub3_9.method163(arg0);
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("68510, " + arg0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method717() {
		try {
			this.aBoolean237 = true;
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				this.anIntArray216[local16] = -1;
				for (@Pc(25) int local25 = 0; local25 < Class50.anInt815; local25++) {
					if (!Class50.aClass50Array1[local25].aBoolean228 && Class50.aClass50Array1[local25].anInt816 == local16 + (this.aBoolean250 ? 0 : 7)) {
						this.anIntArray216[local16] = local25;
						break;
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("27312, " + 1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method718(@OriginalArg(0) byte arg0) {
		try {
			this.aClass47_18.method556();
			Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray271;
			this.aClass4_Sub1_Sub2_Sub1_8.method86(0, 0);
			if (this.aBoolean270) {
				this.aClass4_Sub1_Sub2_Sub4_4.method495(0, 40, 239, this.aString23);
				this.aClass4_Sub1_Sub2_Sub4_4.method495(128, 60, 239, this.aString27 + "*");
			} else if (this.anInt1020 == 1) {
				this.aClass4_Sub1_Sub2_Sub4_4.method495(0, 40, 239, "Enter amount:");
				this.aClass4_Sub1_Sub2_Sub4_4.method495(128, 60, 239, this.aString28 + "*");
			} else if (this.anInt1020 == 2) {
				this.aClass4_Sub1_Sub2_Sub4_4.method495(0, 40, 239, "Enter name:");
				this.aClass4_Sub1_Sub2_Sub4_4.method495(128, 60, 239, this.aString28 + "*");
			} else if (this.aString30 != null) {
				this.aClass4_Sub1_Sub2_Sub4_4.method495(0, 40, 239, this.aString30);
				this.aClass4_Sub1_Sub2_Sub4_4.method495(128, 60, 239, "Click to continue");
			} else if (this.anInt935 != -1) {
				this.method697(0, 0, 0, Class27.method405(this.anInt935));
			} else if (this.anInt1005 == -1) {
				@Pc(159) Class4_Sub1_Sub2_Sub4 local159 = this.aClass4_Sub1_Sub2_Sub4_3;
				@Pc(161) int local161 = 0;
				Class4_Sub1_Sub2.method484(463, 0, 0, 77);
				for (@Pc(169) int local169 = 0; local169 < 100; local169++) {
					if (this.aStringArray12[local169] != null) {
						@Pc(181) int local181 = this.anIntArray269[local169];
						@Pc(190) int local190 = this.anInt960 + 70 - local161 * 14;
						@Pc(195) String local195 = this.aStringArray11[local169];
						@Pc(197) byte local197 = 0;
						if (local195 != null && local195.startsWith("@cr1@")) {
							local195 = local195.substring(5);
							local197 = 1;
						}
						if (local195 != null && local195.startsWith("@cr2@")) {
							local195 = local195.substring(5);
							local197 = 2;
						}
						if (local181 == 0) {
							if (local190 > 0 && local190 < 110) {
								local159.method499(local190, this.aStringArray12[local169], 4, 0);
							}
							local161++;
						}
						@Pc(267) int local267;
						if ((local181 == 1 || local181 == 2) && (local181 == 1 || this.anInt1019 == 0 || this.anInt1019 == 1 && this.method645(local195))) {
							if (local190 > 0 && local190 < 110) {
								local267 = 4;
								if (local197 == 1) {
									this.aClass4_Sub1_Sub2_Sub1Array2[0].method86(local190 - 12, 4);
									local267 += 14;
								}
								if (local197 == 2) {
									this.aClass4_Sub1_Sub2_Sub1Array2[1].method86(local190 - 12, local267);
									local267 += 14;
								}
								local159.method499(local190, local195 + ":", local267, 0);
								local267 += local159.method497(local195, 555) + 8;
								local159.method499(local190, this.aStringArray12[local169], local267, 255);
							}
							local161++;
						}
						if ((local181 == 3 || local181 == 7) && this.anInt936 == 0 && (local181 == 7 || this.anInt966 == 0 || this.anInt966 == 1 && this.method645(local195))) {
							if (local190 > 0 && local190 < 110) {
								local159.method499(local190, "From", 4, 0);
								local267 = local159.method497("From ", 555) + 4;
								if (local197 == 1) {
									this.aClass4_Sub1_Sub2_Sub1Array2[0].method86(local190 - 12, local267);
									local267 += 14;
								}
								if (local197 == 2) {
									this.aClass4_Sub1_Sub2_Sub1Array2[1].method86(local190 - 12, local267);
									local267 += 14;
								}
								local159.method499(local190, local195 + ":", local267, 0);
								local267 += local159.method497(local195, 555) + 8;
								local159.method499(local190, this.aStringArray12[local169], local267, 8388608);
							}
							local161++;
						}
						if (local181 == 4 && (this.anInt970 == 0 || this.anInt970 == 1 && this.method645(local195))) {
							if (local190 > 0 && local190 < 110) {
								local159.method499(local190, local195 + " " + this.aStringArray12[local169], 4, 8388736);
							}
							local161++;
						}
						if (local181 == 5 && this.anInt936 == 0 && this.anInt966 < 2) {
							if (local190 > 0 && local190 < 110) {
								local159.method499(local190, this.aStringArray12[local169], 4, 8388608);
							}
							local161++;
						}
						if (local181 == 6 && this.anInt936 == 0 && this.anInt966 < 2) {
							if (local190 > 0 && local190 < 110) {
								local159.method499(local190, "To " + local195 + ":", 4, 0);
								local159.method499(local190, this.aStringArray12[local169], local159.method497("To " + local195, 555) + 12, 8388608);
							}
							local161++;
						}
						if (local181 == 8 && (this.anInt970 == 0 || this.anInt970 == 1 && this.method645(local195))) {
							if (local190 > 0 && local190 < 110) {
								local159.method499(local190, local195 + " " + this.aStringArray12[local169], 4, 8270336);
							}
							local161++;
						}
					}
				}
				Class4_Sub1_Sub2.method483((byte) 1);
				this.anInt1006 = local161 * 14 + 7;
				if (this.anInt1006 < 78) {
					this.anInt1006 = 78;
				}
				this.method601(77, this.anInt1006, this.anInt1006 - this.anInt960 - 77, 0, 463);
				@Pc(637) String local637;
				if (aClass4_Sub1_Sub1_Sub1_Sub2_1 == null || aClass4_Sub1_Sub1_Sub1_Sub2_1.aString15 == null) {
					local637 = Class46.method554(this.aString17);
				} else {
					local637 = aClass4_Sub1_Sub1_Sub1_Sub2_1.aString15;
				}
				local159.method499(90, local637 + ":", 4, 0);
				local159.method499(90, this.aString26 + "*", local159.method497(local637 + ": ", 555) + 6, 255);
				Class4_Sub1_Sub2.method490(77, 0, 479, 0);
			} else {
				this.method697(0, 0, 0, Class27.method405(this.anInt1005));
			}
			if (this.aBoolean271 && this.anInt1000 == 2) {
				this.method612();
			}
			this.aClass47_18.method557(17, 357, super.aGraphics2);
			this.aClass47_17.method556();
			if (arg0 != this.aByte35) {
				this.method578();
			}
			Class4_Sub1_Sub2_Sub3.anIntArray146 = this.anIntArray273;
		} catch (@Pc(724) RuntimeException local724) {
			signlink.reporterror("14014, " + arg0 + ", " + local724.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method719(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("52081, " + arg0 + ", " + arg1 + ", " + 10 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method720(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean249 = false;
			while (this.aBoolean256) {
				this.aBoolean249 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass4_Sub1_Sub2_Sub1_19 = null;
			this.aClass4_Sub1_Sub2_Sub1_20 = null;
			this.aClass4_Sub1_Sub2_Sub1Array5 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.anIntArray252 = null;
			this.anIntArray239 = null;
			this.anIntArray240 = null;
			this.anIntArray264 = null;
			this.anIntArray265 = null;
			this.aClass4_Sub1_Sub2_Sub2_11 = null;
			this.aClass4_Sub1_Sub2_Sub2_12 = null;
			if (arg0 != this.aByte34) {
				this.method578();
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("21357, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method721() {
		try {
			@Pc(8) int local8;
			if (this.anInt967 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt967 > 768) {
						this.anIntArray249[local8] = this.method587(this.aBoolean236, this.anIntArray251[local8], this.anIntArray250[local8], 1024 - this.anInt967);
					} else if (this.anInt967 > 256) {
						this.anIntArray249[local8] = this.anIntArray251[local8];
					} else {
						this.anIntArray249[local8] = this.method587(this.aBoolean236, this.anIntArray250[local8], this.anIntArray251[local8], 256 - this.anInt967);
					}
				}
			} else if (this.anInt968 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt968 > 768) {
						this.anIntArray249[local8] = this.method587(this.aBoolean236, this.anIntArray252[local8], this.anIntArray250[local8], 1024 - this.anInt968);
					} else if (this.anInt968 > 256) {
						this.anIntArray249[local8] = this.anIntArray252[local8];
					} else {
						this.anIntArray249[local8] = this.method587(this.aBoolean236, this.anIntArray250[local8], this.anIntArray252[local8], 256 - this.anInt968);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray249[local8] = this.anIntArray250[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass47_22.anIntArray203[local8] = this.aClass4_Sub1_Sub2_Sub2_11.anIntArray47[local8];
			}
			@Pc(183) int local183 = 0;
			@Pc(185) int local185 = 1152;
			@Pc(200) int local200;
			@Pc(204) int local204;
			@Pc(214) int local214;
			@Pc(222) int local222;
			@Pc(226) int local226;
			@Pc(230) int local230;
			@Pc(241) int local241;
			for (@Pc(187) int local187 = 1; local187 < 255; local187++) {
				local200 = this.anIntArray258[local187] * (256 - local187) / 256;
				local204 = local200 + 22;
				if (local204 < 0) {
					local204 = 0;
				}
				local183 += local204;
				for (local214 = local204; local214 < 128; local214++) {
					local222 = this.anIntArray264[local183++];
					if (local222 == 0) {
						local185++;
					} else {
						local226 = local222;
						local230 = 256 - local222;
						local222 = this.anIntArray249[local222];
						local241 = this.aClass47_22.anIntArray203[local185];
						this.aClass47_22.anIntArray203[local185++] = ((local222 & 0xFF00FF) * local226 + (local241 & 0xFF00FF) * local230 & 0xFF00FF00) + ((local222 & 0xFF00) * local226 + (local241 & 0xFF00) * local230 & 0xFF0000) >> 8;
					}
				}
				local185 += local204;
			}
			this.aClass47_22.method557(0, 0, super.aGraphics2);
			for (local200 = 0; local200 < 33920; local200++) {
				this.aClass47_23.anIntArray203[local200] = this.aClass4_Sub1_Sub2_Sub2_12.anIntArray47[local200];
			}
			local183 = 0;
			local185 = 1176;
			for (local204 = 1; local204 < 255; local204++) {
				local214 = this.anIntArray258[local204] * (256 - local204) / 256;
				local222 = 103 - local214;
				local185 += local214;
				for (local226 = 0; local226 < local222; local226++) {
					local230 = this.anIntArray264[local183++];
					if (local230 == 0) {
						local185++;
					} else {
						local241 = local230;
						@Pc(368) int local368 = 256 - local230;
						local230 = this.anIntArray249[local230];
						@Pc(379) int local379 = this.aClass47_23.anIntArray203[local185];
						this.aClass47_23.anIntArray203[local185++] = ((local230 & 0xFF00FF) * local241 + (local379 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local230 & 0xFF00) * local241 + (local379 & 0xFF00) * local368 & 0xFF0000) >> 8;
					}
				}
				local183 += 128 - local222;
				local185 += 128 - local222 - local214;
			}
			this.aClass47_23.method557(637, 0, super.aGraphics2);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("97658, " + 0 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method722(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt874 == 2) {
				for (@Pc(14) Class4_Sub3 local14 = (Class4_Sub3) this.aClass23_10.method315(); local14 != null; local14 = (Class4_Sub3) this.aClass23_10.method317()) {
					if (local14.anInt720 > 0) {
						local14.anInt720--;
					}
					if (local14.anInt720 != 0) {
						if (local14.anInt721 > 0) {
							local14.anInt721--;
						}
						if (local14.anInt721 == 0 && local14.anInt718 >= 1 && local14.anInt719 >= 1 && local14.anInt718 <= 102 && local14.anInt719 <= 102 && (local14.anInt722 < 0 || Class29.method425(local14.anInt724, local14.anInt722))) {
							this.method624(local14.anInt724, local14.anInt716, local14.anInt723, local14.anInt717, aBoolean254, local14.anInt719, local14.anInt722, local14.anInt718);
							local14.anInt721 = -1;
							if (local14.anInt722 == local14.anInt713 && local14.anInt713 == -1) {
								local14.method528();
							} else if (local14.anInt722 == local14.anInt713 && local14.anInt723 == local14.anInt714 && local14.anInt724 == local14.anInt715) {
								local14.method528();
							}
						}
					} else if (local14.anInt713 < 0 || Class29.method425(local14.anInt715, local14.anInt713)) {
						this.method624(local14.anInt715, local14.anInt716, local14.anInt714, local14.anInt717, aBoolean254, local14.anInt719, local14.anInt713, local14.anInt718);
						local14.method528();
					}
				}
				anInt979++;
				if (anInt979 > 141) {
					anInt979 = 0;
					this.aClass4_Sub1_Sub3_9.method156(25);
					this.aClass4_Sub1_Sub3_9.method160(7714495);
					return;
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("21686, " + arg0 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method723(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean235) {
				for (@Pc(10) int local10 = 0; local10 < this.anIntArray219.length; local10++) {
					@Pc(17) int local17 = this.anIntArray219[local10];
					if (Class4_Sub1_Sub2_Sub3.anIntArray148[local17] >= arg0) {
						@Pc(26) Class4_Sub1_Sub2_Sub1 local26 = Class4_Sub1_Sub2_Sub3.aClass4_Sub1_Sub2_Sub1Array1[local17];
						@Pc(34) int local34 = local26.anInt195 * local26.anInt196 - 1;
						@Pc(42) int local42 = local26.anInt195 * this.anInt849 * 2;
						@Pc(45) byte[] local45 = local26.aByteArray2;
						@Pc(48) byte[] local48 = this.aByteArray21;
						for (@Pc(50) int local50 = 0; local50 <= local34; local50++) {
							local48[local50] = local45[local50 - local42 & local34];
						}
						local26.aByteArray2 = local48;
						this.aByteArray21 = local45;
						Class4_Sub1_Sub2_Sub3.method455(518, local17);
						anInt961++;
						if (anInt961 > 1130) {
							anInt961 = 0;
							this.aClass4_Sub1_Sub3_9.method156(158);
							this.aClass4_Sub1_Sub3_9.method157(0);
							@Pc(97) int local97 = this.aClass4_Sub1_Sub3_9.anInt242;
							this.aClass4_Sub1_Sub3_9.method158(10252);
							if ((int) (Math.random() * 2.0D) == 0) {
								this.aClass4_Sub1_Sub3_9.method158(36403);
							}
							if ((int) (Math.random() * 2.0D) == 0) {
								this.aClass4_Sub1_Sub3_9.method158(32298);
							}
							this.aClass4_Sub1_Sub3_9.method157(172);
							this.aClass4_Sub1_Sub3_9.method158(23928);
							this.aClass4_Sub1_Sub3_9.method157(143);
							this.aClass4_Sub1_Sub3_9.method158((int) (Math.random() * 65536.0D));
							this.aClass4_Sub1_Sub3_9.method157(27);
							this.aClass4_Sub1_Sub3_9.method157(129);
							this.aClass4_Sub1_Sub3_9.method157(55);
							this.aClass4_Sub1_Sub3_9.method166(this.aClass4_Sub1_Sub3_9.anInt242 - local97);
						}
					}
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("90151, " + arg0 + ", " + -6907 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}
