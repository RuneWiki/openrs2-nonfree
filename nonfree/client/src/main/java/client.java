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

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private static int anInt834;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private static int anInt840;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!MTFZASIN;")
	public static Class5_Sub1_Sub1_Sub3_Sub2 aClass5_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private static int anInt848;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
	private static boolean aBoolean238;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
	private static boolean aBoolean243;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private static int anInt906;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private static int anInt916;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private static int anInt919;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Z")
	private static boolean aBoolean247;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private static int anInt925;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private static int anInt939;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	public static int anInt988;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
	private static boolean aBoolean258;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private static int anInt991;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private static boolean aBoolean262;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private static int anInt1007;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private static int anInt1008;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	public static int anInt1022;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private static int anInt1031;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private static int anInt1033;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private static int anInt1043;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private static int anInt1047;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private static int anInt838 = -891;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private static int anInt839 = -551;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private static int anInt841 = 5;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "B")
	private static byte aByte32 = 74;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Ljava/lang/String;")
	private static String aString20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[I")
	public static int[] anIntArray236 = new int[32];

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
	public static final int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private static int anInt987;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Z")
	private static boolean aBoolean257;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Z")
	private static boolean aBoolean261;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private static int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private static int anInt1035;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!LAQKYZGL;")
	private Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Lclient!MJLXHQTQ;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!AAVSEYUK;")
	private Class1 aClass1_1;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Lclient!ENXSCLLS;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!YDQEOBYY;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2 aClass5_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3[] aClass5_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_3;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_4;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_5;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_6;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_7;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_8;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_9;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_10;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_11;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!OQEOESGS;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_12;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_13;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_14;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_15;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_16;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_17;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_18;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3 aClass5_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_19;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_20;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_21;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_22;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_23;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_24;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_25;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_26;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Lclient!BVMYRJQC;")
	private Class10 aClass10_27;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "Lclient!KGPDNFPL;")
	private Class5_Sub1_Sub2_Sub1 aClass5_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Lclient!KGPDNFPL;")
	private Class5_Sub1_Sub2_Sub1 aClass5_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Lclient!KGPDNFPL;")
	private Class5_Sub1_Sub2_Sub1 aClass5_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Lclient!KGPDNFPL;")
	private Class5_Sub1_Sub2_Sub1 aClass5_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt843 = -1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray212 = new int[5];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
	private int[] anIntArray213 = new int[Class40.anInt590];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!XGRGMPUQ;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_6 = new Class5_Sub1_Sub4(new byte[5000], -82);

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[Lclient!DLMOHDFX;")
	private Class5_Sub1_Sub1_Sub3_Sub1[] aClass5_Sub1_Sub1_Sub3_Sub1Array1 = new Class5_Sub1_Sub1_Sub3_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray214 = new int[16384];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "B")
	private byte aByte31 = 7;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray215 = new int[7];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt857 = -17431;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray216 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray217 = new int[50];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!VYAVYWNE;")
	private Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray218 = new int[Class40.anInt590];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt867 = -1;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt868 = 7759444;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray219 = new int[100];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Lclient!XGRGMPUQ;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_7 = Class5_Sub1_Sub4.method425(aByte32);

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt876 = 1;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
	private int[] anIntArray222 = new int[33];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt878 = -1;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt887 = 2;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private final int anInt888 = 100;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
	private int[] anIntArray223 = new int[100];

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt889 = -1;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt890 = -1;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray228 = new int[50];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray229 = new int[200];

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt898 = -1;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray230 = new int[5];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2[] aClass5_Sub1_Sub2_Sub2Array4 = new Class5_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "B")
	private byte aByte33 = 4;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!VLUKUYNM;")
	private Class42 aClass42_10 = new Class42((byte) 0);

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt909 = 2301979;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	public int[] anIntArray231 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private final int[] anIntArray232 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2[] aClass5_Sub1_Sub2_Sub2Array5 = new Class5_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt918 = -1;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3[] aClass5_Sub1_Sub2_Sub3Array2 = new Class5_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private boolean aBoolean248 = true;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt924 = -1;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	private int[] anIntArray233 = new int[50];

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "[[[Lclient!VLUKUYNM;")
	private Class42[][][] aClass42ArrayArrayArray1 = new Class42[4][104][104];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[Lclient!GQSCEHQI;")
	private Class16[] aClass16Array1 = new Class16[4];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt929 = 2;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
	private int[] anIntArray234 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt930 = 3353893;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[I")
	private int[] anIntArray235 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt932 = 128;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt936 = 4006;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Z")
	private volatile boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt938 = 1;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3[] aClass5_Sub1_Sub2_Sub3Array3 = new Class5_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Z")
	private boolean aBoolean251 = true;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2[] aClass5_Sub1_Sub2_Sub2Array6 = new Class5_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt940 = -1;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt943 = 1;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray241 = new int[5];

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt951 = -1;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!XGRGMPUQ;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_8 = Class5_Sub1_Sub4.method425(aByte32);

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Z")
	private volatile boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray246 = new int[1000];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray247 = new int[1000];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "B")
	private byte aByte34 = -49;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt966 = -1;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt967 = 3;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt968 = 19939;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	private int[] anIntArray248 = new int[5];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt973 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "B")
	private byte aByte35 = 3;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!VLUKUYNM;")
	private Class42 aClass42_11 = new Class42((byte) 0);

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2[] aClass5_Sub1_Sub2_Sub2Array7 = new Class5_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2[] aClass5_Sub1_Sub2_Sub2Array8 = new Class5_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt990 = -1;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "B")
	private byte aByte36 = 3;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray251 = new int[256];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray252 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
	private int[] anIntArray253 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2[] aClass5_Sub1_Sub2_Sub2Array9 = new Class5_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt993 = 2;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!XGRGMPUQ;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_9 = Class5_Sub1_Sub4.method425(aByte32);

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt994 = 1;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray254 = new int[5];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt999 = 44451;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "B")
	private byte aByte37 = 6;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1001 = 831;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	private int[] anIntArray255 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "B")
	private byte aByte38 = 1;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Z")
	private volatile boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1013 = -1;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1014 = 5063219;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray256 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1019 = 78;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1021 = 50;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[I")
	private int[] anIntArray257 = new int[this.anInt1021];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
	private int[] anIntArray258 = new int[this.anInt1021];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[I")
	private int[] anIntArray259 = new int[this.anInt1021];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray260 = new int[this.anInt1021];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	private int[] anIntArray261 = new int[this.anInt1021];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
	private int[] anIntArray262 = new int[this.anInt1021];

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray263 = new int[this.anInt1021];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[this.anInt1021];

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1023 = 2048;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1024 = 2047;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[Lclient!MTFZASIN;")
	private Class5_Sub1_Sub1_Sub3_Sub2[] aClass5_Sub1_Sub1_Sub3_Sub2Array1 = new Class5_Sub1_Sub1_Sub3_Sub2[this.anInt1023];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray264 = new int[this.anInt1023];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray265 = new int[this.anInt1023];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[Lclient!XGRGMPUQ;")
	private Class5_Sub1_Sub4[] aClass5_Sub1_Sub4Array1 = new Class5_Sub1_Sub4[this.anInt1023];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!VLUKUYNM;")
	private Class42 aClass42_12 = new Class42((byte) 0);

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[Lclient!VSJQVIFL;")
	private Class5_Sub1_Sub2_Sub3[] aClass5_Sub1_Sub2_Sub3Array5 = new Class5_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
	private boolean aBoolean270 = true;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "B")
	private byte aByte39 = -70;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private boolean aBoolean272 = false;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[I")
	private int[] anIntArray267 = new int[9];

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "[Lclient!PDMJJHOP;")
	private Class5_Sub1_Sub2_Sub2[] aClass5_Sub1_Sub2_Sub2Array10 = new Class5_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "[I")
	private int[] anIntArray268 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1038 = 1;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1039 = -1;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1041 = -1;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1042 = -601;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "[I")
	private int[] anIntArray269 = new int[151];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
	private int[] anIntArray270 = new int[Class40.anInt590];

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
	private int[] anIntArray271 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
	private int[] anIntArray272 = new int[500];

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
	private int[] anIntArray273 = new int[500];

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[I")
	private int[] anIntArray274 = new int[500];

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
	private int[] anIntArray275 = new int[500];

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[Lclient!IJFFCIDM;")
	public Class19[] aClass19Array1 = new Class19[5];

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1051 = 2;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "Z")
	private boolean aBoolean273 = true;

	static {
		@Pc(279) int local279 = 2;
		@Pc(281) int local281;
		for (local281 = 0; local281 < 32; local281++) {
			anIntArray236[local281] = local279 - 1;
			local279 += local279;
		}
		anIntArray240 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt987 = 10;
		aBoolean257 = true;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aBoolean261 = true;
		anIntArray266 = new int[99];
		local279 = 0;
		for (local281 = 0; local281 < 99; local281++) {
			@Pc(386) int local386 = local281 + 1;
			@Pc(399) int local399 = (int) ((double) local386 + Math.pow(2.0D, (double) local386 / 7.0D) * 300.0D);
			local279 += local399;
			anIntArray266[local281] = local279 / 4;
		}
		anInt1035 = -12;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private static void method587() {
		try {
			Class48.aBoolean218 = true;
			Class5_Sub1_Sub2_Sub4.aBoolean178 = true;
			aBoolean258 = true;
			Class46.aBoolean202 = true;
			Class8.aBoolean36 = true;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("5239, " + -34690 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private static void method589() {
		try {
			Class48.aBoolean218 = false;
			Class5_Sub1_Sub2_Sub4.aBoolean178 = false;
			aBoolean258 = false;
			Class46.aBoolean202 = false;
			Class8.aBoolean36 = false;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("38043, " + -693 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method624(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) String local9 = String.valueOf(arg0);
			for (@Pc(14) int local14 = local9.length() - 3; local14 > 0; local14 -= 3) {
				local9 = local9.substring(0, local14) + "," + local9.substring(local14);
			}
			if (local9.length() > 8) {
				local9 = "@gre@" + local9.substring(0, local9.length() - 8) + " million @whi@(" + local9 + ")";
			} else if (local9.length() > 4) {
				local9 = "@cya@" + local9.substring(0, local9.length() - 4) + "K @whi@(" + local9 + ")";
			}
			return " " + local9;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("93512, " + arg0 + ", " + -40187 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) int local9 = arg0 - arg1;
			if (local9 < -9) {
				return "@red@";
			} else if (local9 < -6) {
				return "@or3@";
			} else if (local9 < -3) {
				return "@or2@";
			} else if (local9 < 0) {
				return "@or1@";
			} else if (local9 > 9) {
				return "@gre@";
			} else if (local9 > 6) {
				return "@gr3@";
			} else if (local9 > 3) {
				return "@gr2@";
			} else if (local9 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("89982, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 347);
			if (arg0.length == 5) {
				anInt987 = Integer.parseInt(arg0[0]);
				anInt988 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method587();
				} else if (arg0[2].equals("highmem")) {
					method589();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean257 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean257 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1054 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method571((byte) 6);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private static String method689(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("19192, " + 0 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method584(@OriginalArg(0) int arg0) {
		try {
			Class45.method364(arg0);
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("1965, " + arg0 + ", " + 0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method585() {
		try {
			if (this.aClass10_15 == null) {
				this.method721();
				super.aClass10_2 = null;
				this.aClass10_19 = null;
				this.aClass10_20 = null;
				this.aClass10_21 = null;
				this.aClass10_22 = null;
				this.aClass10_23 = null;
				this.aClass10_24 = null;
				this.aClass10_25 = null;
				this.aClass10_26 = null;
				this.aClass10_27 = null;
				this.aClass10_15 = new Class10(96, this.method581(), false, 479);
				this.aClass10_13 = new Class10(156, this.method581(), false, 172);
				Class5_Sub1_Sub2.method333();
				this.aClass5_Sub1_Sub2_Sub3_17.method326(0, 0);
				this.aClass10_12 = new Class10(261, this.method581(), false, 190);
				this.aClass10_14 = new Class10(334, this.method581(), false, 512);
				Class5_Sub1_Sub2.method333();
				this.aClass10_16 = new Class10(50, this.method581(), false, 496);
				this.aClass10_17 = new Class10(37, this.method581(), false, 269);
				this.aClass10_18 = new Class10(45, this.method581(), false, 249);
				this.aBoolean249 = true;
				this.aClass10_14.method44();
				Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("59569, " + false + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method586() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt1025; local3++) {
				if (local3 == -1) {
					local11 = this.anInt1024;
				} else {
					local11 = this.anIntArray264[local3];
				}
				@Pc(23) Class5_Sub1_Sub1_Sub3_Sub2 local23 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null && local23.anInt462 > 0) {
					local23.anInt462--;
					if (local23.anInt462 == 0) {
						local23.aString9 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt849; local11++) {
				@Pc(65) int local65 = this.anIntArray214[local11];
				@Pc(70) Class5_Sub1_Sub1_Sub3_Sub1 local70 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local65];
				if (local70 != null && local70.anInt462 > 0) {
					local70.anInt462--;
					if (local70.anInt462 == 0) {
						local70.aString9 = null;
					}
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("87537, " + 3 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method582(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method582(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method588() {
		try {
			this.anInt959 += 0;
			Class8.aClass12_3.method80();
			Class8.aClass12_2.method80();
			Class24.aClass12_6.method80();
			Class17.aClass12_4.method80();
			Class17.aClass12_5.method80();
			Class5_Sub1_Sub1_Sub3_Sub2.aClass12_7.method80();
			Class6.aClass12_1.method80();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("39135, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method590(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				if (this.anInt845 >= 100 && this.anInt996 != 1) {
					this.method668(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt845 >= 200) {
					this.method668(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(39) String local39 = Class11.method51(Class11.method48(this.anInt993, arg1));
					for (@Pc(41) int local41 = 0; local41 < this.anInt845; local41++) {
						if (this.aLongArray3[local41] == arg1) {
							this.method668(0, "", local39 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(71) int local71 = 0; local71 < this.anInt880; local71++) {
						if (this.aLongArray4[local71] == arg1) {
							this.method668(0, "", "Please remove " + local39 + " from your ignore list first");
							return;
						}
					}
					if (!local39.equals(aClass5_Sub1_Sub1_Sub3_Sub2_1.aString10)) {
						this.aStringArray11[this.anInt845] = local39;
						this.aLongArray3[this.anInt845] = arg1;
						if (arg0 != 0) {
							this.aBoolean268 = !this.aBoolean268;
						}
						this.anIntArray229[this.anInt845] = 0;
						this.anInt845++;
						this.aBoolean264 = true;
						this.aClass5_Sub1_Sub4_8.method426(229);
						this.aClass5_Sub1_Sub4_8.method433(this.aByte37, arg1);
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("77260, " + arg0 + ", " + arg1 + ", " + local156.toString());
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
				return new URL("http://127.0.0.1:" + (anInt988 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!XGRGMPUQ;I)V")
	private void method591(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt1026; local1++) {
				@Pc(8) int local8 = this.anIntArray265[local1];
				@Pc(13) Class5_Sub1_Sub1_Sub3_Sub2 local13 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method437();
				if ((local16 & 0x40) != 0) {
					local16 += arg1.method437() << 8;
				}
				this.method682(local13, local16, local8, arg1);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("71275, " + arg0 + ", " + arg1 + ", " + -24634 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!VYAVYWNE;)Z")
	private boolean method592(@OriginalArg(1) Class45 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt670;
			if (local10 >= 1 && local10 <= 200 || !(local10 < 701 || local10 > 900)) {
				if (local10 >= 801) {
					local10 -= 701;
				} else if (local10 >= 701) {
					local10 -= 601;
				} else if (local10 >= 101) {
					local10 -= 101;
				} else {
					local10--;
				}
				this.aStringArray13[this.anInt881] = "Remove @whi@" + this.aStringArray11[local10];
				this.anIntArray274[this.anInt881] = 633;
				this.anInt881++;
				this.aStringArray13[this.anInt881] = "Message @whi@" + this.aStringArray11[local10];
				this.anIntArray274[this.anInt881] = 144;
				this.anInt881++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray13[this.anInt881] = "Remove @whi@" + arg0.aString13;
				this.anIntArray274[this.anInt881] = 663;
				this.anInt881++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("35893, " + true + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method578() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass1_1 != null) {
					this.aClass1_1.method1();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass1_1 = null;
			this.method669();
			if (this.aClass37_1 != null) {
				this.aClass37_1.aBoolean150 = false;
			}
			this.aClass37_1 = null;
			this.aClass26_Sub1_1.method205();
			this.aClass26_Sub1_1 = null;
			this.aClass5_Sub1_Sub4_6 = null;
			this.aClass5_Sub1_Sub4_8 = null;
			this.aClass5_Sub1_Sub4_9 = null;
			this.aClass5_Sub1_Sub4_7 = null;
			this.anIntArray237 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass48_1 = null;
			this.aClass16Array1 = null;
			this.anIntArrayArray23 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.aByteArray21 = null;
			this.aClass10_12 = null;
			this.aClass10_13 = null;
			this.aClass10_14 = null;
			this.aClass10_15 = null;
			this.aClass10_16 = null;
			this.aClass10_17 = null;
			this.aClass10_18 = null;
			this.aClass10_3 = null;
			this.aClass10_4 = null;
			this.aClass10_5 = null;
			this.aClass10_6 = null;
			this.aClass10_7 = null;
			this.aClass10_8 = null;
			this.aClass10_9 = null;
			this.aClass10_10 = null;
			this.aClass10_11 = null;
			this.aClass5_Sub1_Sub2_Sub3_16 = null;
			this.aClass5_Sub1_Sub2_Sub3_17 = null;
			this.aClass5_Sub1_Sub2_Sub3_18 = null;
			this.aClass5_Sub1_Sub2_Sub3_8 = null;
			this.aClass5_Sub1_Sub2_Sub3_9 = null;
			this.aClass5_Sub1_Sub2_Sub3_10 = null;
			this.aClass5_Sub1_Sub2_Sub3Array2 = null;
			this.aClass5_Sub1_Sub2_Sub3_3 = null;
			this.aClass5_Sub1_Sub2_Sub3_4 = null;
			this.aClass5_Sub1_Sub2_Sub3_5 = null;
			this.aClass5_Sub1_Sub2_Sub3_6 = null;
			this.aClass5_Sub1_Sub2_Sub3_7 = null;
			this.aClass5_Sub1_Sub2_Sub3_11 = null;
			this.aClass5_Sub1_Sub2_Sub3_12 = null;
			this.aClass5_Sub1_Sub2_Sub3_13 = null;
			this.aClass5_Sub1_Sub2_Sub3_14 = null;
			this.aClass5_Sub1_Sub2_Sub3_15 = null;
			this.aClass5_Sub1_Sub2_Sub2_10 = null;
			this.aClass5_Sub1_Sub2_Sub2Array6 = null;
			this.aClass5_Sub1_Sub2_Sub2Array4 = null;
			this.aClass5_Sub1_Sub2_Sub2Array5 = null;
			this.aClass5_Sub1_Sub2_Sub2Array7 = null;
			this.aClass5_Sub1_Sub2_Sub2Array10 = null;
			this.aClass5_Sub1_Sub2_Sub2_7 = null;
			this.aClass5_Sub1_Sub2_Sub2_13 = null;
			this.aClass5_Sub1_Sub2_Sub2_14 = null;
			this.aClass5_Sub1_Sub2_Sub2_15 = null;
			this.aClass5_Sub1_Sub2_Sub2_16 = null;
			this.aClass5_Sub1_Sub2_Sub2_17 = null;
			this.aClass5_Sub1_Sub2_Sub3Array5 = null;
			this.aClass5_Sub1_Sub2_Sub2Array8 = null;
			this.anIntArrayArray25 = null;
			this.aClass5_Sub1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray264 = null;
			this.anIntArray265 = null;
			this.aClass5_Sub1_Sub4Array1 = null;
			this.anIntArray256 = null;
			this.aClass5_Sub1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray214 = null;
			this.aClass42ArrayArrayArray1 = null;
			this.aClass42_12 = null;
			this.aClass42_11 = null;
			this.aClass42_10 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArray274 = null;
			this.anIntArray275 = null;
			this.aStringArray13 = null;
			this.anIntArray231 = null;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.aClass5_Sub1_Sub2_Sub2Array9 = null;
			this.aClass5_Sub1_Sub2_Sub2_3 = null;
			this.aStringArray11 = null;
			this.aLongArray3 = null;
			this.anIntArray229 = null;
			this.aClass10_22 = null;
			this.aClass10_23 = null;
			this.aClass10_19 = null;
			this.aClass10_20 = null;
			this.aClass10_21 = null;
			this.aClass10_24 = null;
			this.aClass10_25 = null;
			this.aClass10_26 = null;
			this.aClass10_27 = null;
			this.method721();
			Class8.method41();
			Class24.method162();
			Class17.method123();
			Class45.method362();
			Class36.aClass36Array1 = null;
			Class7.aClass7Array1 = null;
			Class4.aClass4Array1 = null;
			Class32.aClass32Array1 = null;
			Class6.aClass6Array1 = null;
			Class6.aClass12_1 = null;
			Class25.aClass25Array1 = null;
			super.aClass10_2 = null;
			Class5_Sub1_Sub1_Sub3_Sub2.aClass12_7 = null;
			Class5_Sub1_Sub2_Sub4.method342();
			Class48.method473();
			Class5_Sub1_Sub1_Sub6.method373();
			Class2.method9();
			System.gc();
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("2635, " + -615 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method593() {
		try {
			if (super.aClass10_2 == null) {
				this.method721();
				this.aClass10_19 = null;
				this.aClass10_20 = null;
				this.aClass10_21 = null;
				this.aClass10_22 = null;
				this.aClass10_23 = null;
				this.aClass10_24 = null;
				this.aClass10_25 = null;
				this.aClass10_26 = null;
				this.aClass10_27 = null;
				this.aClass10_15 = null;
				this.aClass10_13 = null;
				this.aClass10_12 = null;
				this.aClass10_14 = null;
				this.aClass10_16 = null;
				this.aClass10_17 = null;
				this.aClass10_18 = null;
				super.aClass10_2 = new Class10(503, this.method581(), false, 765);
				this.aBoolean249 = true;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("9195, " + false + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(16) int local16 = this.aClass48_1.method500(arg2, arg0, arg1);
			@Pc(26) int local26;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(38) int local38;
			@Pc(60) int local60;
			@Pc(66) int local66;
			if (local16 != 0) {
				local26 = this.aClass48_1.method504(arg2, arg0, arg1, local16);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = arg4;
				if (local16 > 0) {
					local38 = arg3;
				}
				@Pc(46) int[] local46 = this.aClass5_Sub1_Sub2_Sub2_3.anIntArray112;
				local60 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local66 = local16 >> 14 & 0x7FFF;
				@Pc(69) Class8 local69 = Class8.method40(local66);
				if (local69.anInt48 == -1) {
					if (local36 == 0 || local36 == 2) {
						if (local32 == 0) {
							local46[local60] = local38;
							local46[local60 + 512] = local38;
							local46[local60 + 1024] = local38;
							local46[local60 + 1536] = local38;
						} else if (local32 == 1) {
							local46[local60] = local38;
							local46[local60 + 1] = local38;
							local46[local60 + 2] = local38;
							local46[local60 + 3] = local38;
						} else if (local32 == 2) {
							local46[local60 + 3] = local38;
							local46[local60 + 3 + 512] = local38;
							local46[local60 + 3 + 1024] = local38;
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 3) {
							local46[local60 + 1536] = local38;
							local46[local60 + 1536 + 1] = local38;
							local46[local60 + 1536 + 2] = local38;
							local46[local60 + 1536 + 3] = local38;
						}
					}
					if (local36 == 3) {
						if (local32 == 0) {
							local46[local60] = local38;
						} else if (local32 == 1) {
							local46[local60 + 3] = local38;
						} else if (local32 == 2) {
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 3) {
							local46[local60 + 1536] = local38;
						}
					}
					if (local36 == 2) {
						if (local32 == 3) {
							local46[local60] = local38;
							local46[local60 + 512] = local38;
							local46[local60 + 1024] = local38;
							local46[local60 + 1536] = local38;
						} else if (local32 == 0) {
							local46[local60] = local38;
							local46[local60 + 1] = local38;
							local46[local60 + 2] = local38;
							local46[local60 + 3] = local38;
						} else if (local32 == 1) {
							local46[local60 + 3] = local38;
							local46[local60 + 3 + 512] = local38;
							local46[local60 + 3 + 1024] = local38;
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 2) {
							local46[local60 + 1536] = local38;
							local46[local60 + 1536 + 1] = local38;
							local46[local60 + 1536 + 2] = local38;
							local46[local60 + 1536 + 3] = local38;
						}
					}
				} else {
					@Pc(79) Class5_Sub1_Sub2_Sub3 local79 = this.aClass5_Sub1_Sub2_Sub3Array5[local69.anInt48];
					if (local79 != null) {
						@Pc(91) int local91 = (local69.anInt45 * 4 - local79.anInt613) / 2;
						@Pc(101) int local101 = (local69.anInt53 * 4 - local79.anInt614) / 2;
						local79.method326((104 - arg1 - local69.anInt53) * 4 + local101 + 48, arg0 * 4 + 48 + local91);
					}
				}
			}
			local16 = this.aClass48_1.method502(arg2, arg0, arg1);
			if (local16 != 0) {
				local26 = this.aClass48_1.method504(arg2, arg0, arg1, local16);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = local16 >> 14 & 0x7FFF;
				@Pc(455) Class8 local455 = Class8.method40(local38);
				@Pc(487) int local487;
				if (local455.anInt48 != -1) {
					@Pc(465) Class5_Sub1_Sub2_Sub3 local465 = this.aClass5_Sub1_Sub2_Sub3Array5[local455.anInt48];
					if (local465 != null) {
						local66 = (local455.anInt45 * 4 - local465.anInt613) / 2;
						local487 = (local455.anInt53 * 4 - local465.anInt614) / 2;
						local465.method326((104 - arg1 - local455.anInt53) * 4 + local487 + 48, arg0 * 4 + 48 + local66);
					}
				} else if (local36 == 9) {
					local60 = 15658734;
					if (local16 > 0) {
						local60 = 15597568;
					}
					@Pc(524) int[] local524 = this.aClass5_Sub1_Sub2_Sub2_3.anIntArray112;
					local487 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local32 == 0 || local32 == 2) {
						local524[local487 + 1536] = local60;
						local524[local487 + 1024 + 1] = local60;
						local524[local487 + 512 + 2] = local60;
						local524[local487 + 3] = local60;
					} else {
						local524[local487] = local60;
						local524[local487 + 512 + 1] = local60;
						local524[local487 + 1024 + 2] = local60;
						local524[local487 + 1536 + 3] = local60;
					}
				}
			}
			local16 = this.aClass48_1.method503(arg2, arg0, arg1);
			if (local16 != 0) {
				local26 = local16 >> 14 & 0x7FFF;
				@Pc(619) Class8 local619 = Class8.method40(local26);
				if (local619.anInt48 != -1) {
					@Pc(629) Class5_Sub1_Sub2_Sub3 local629 = this.aClass5_Sub1_Sub2_Sub3Array5[local619.anInt48];
					if (local629 != null) {
						local38 = (local619.anInt45 * 4 - local629.anInt613) / 2;
						@Pc(651) int local651 = (local619.anInt53 * 4 - local629.anInt614) / 2;
						local629.method326((104 - arg1 - local619.anInt53) * 4 + local651 + 48, arg0 * 4 + 48 + local38);
						return;
					}
				}
			}
		} catch (@Pc(675) RuntimeException local675) {
			signlink.reporterror("28847, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -429 + ", " + arg3 + ", " + arg4 + ", " + local675.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method595(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anInt849; local11++) {
				@Pc(21) Class5_Sub1_Sub1_Sub3_Sub1 local21 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray214[local11]];
				@Pc(30) int local30 = (this.anIntArray214[local11] << 14) + 536870912;
				if (local21 != null && local21.method236() && local21.aClass24_1.aBoolean98 == arg0 && local21.aClass24_1.method161()) {
					@Pc(51) int local51 = local21.anInt501 >> 7;
					@Pc(56) int local56 = local21.anInt502 >> 7;
					if (local51 >= 0 && local51 < 104 && local56 >= 0 && local56 < 104) {
						if (local21.anInt471 == 1 && (local21.anInt501 & 0x7F) == 64 && (local21.anInt502 & 0x7F) == 64) {
							if (this.anIntArrayArray25[local51][local56] == this.anInt1018) {
								continue;
							}
							this.anIntArrayArray25[local51][local56] = this.anInt1018;
						}
						if (!local21.aClass24_1.aBoolean101) {
							local30 += Integer.MIN_VALUE;
						}
						this.aClass48_1.method485(this.anInt902, local21.anInt501, this.method631(local21.anInt501, local21.anInt502, this.anInt948), (local21.anInt471 - 1) * 64 + 60, local30, local21.anInt502, this.anInt948, local21, local21.anInt503, local21.aBoolean137);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("35857, " + arg0 + ", " + false + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method596() {
		try {
			anInt991++;
			if (anInt991 > 92) {
				anInt991 = 0;
				this.aClass5_Sub1_Sub4_8.method426(15);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt849; local15++) {
				@Pc(22) int local22 = this.anIntArray214[local15];
				@Pc(27) Class5_Sub1_Sub1_Sub3_Sub1 local27 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local22];
				if (local27 != null) {
					this.method597(local27, local27.aClass24_1.aByte13);
				}
			}
			this.anInt959 += 0;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("33849, " + 0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DSYLCNKR;II)V")
	private void method597(@OriginalArg(0) Class5_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt501 < 128 || arg0.anInt502 < 128 || arg0.anInt501 >= 13184 || arg0.anInt502 >= 13184) {
				arg0.anInt463 = -1;
				arg0.anInt487 = -1;
				arg0.anInt481 = 0;
				arg0.anInt482 = 0;
				arg0.anInt501 = arg0.anIntArray104[0] * 128 + arg0.anInt471 * 64;
				arg0.anInt502 = arg0.anIntArray105[0] * 128 + arg0.anInt471 * 64;
				arg0.method235();
			}
			if (arg0 == aClass5_Sub1_Sub1_Sub3_Sub2_1 && (arg0.anInt501 < 1536 || arg0.anInt502 < 1536 || arg0.anInt501 >= 11776 || arg0.anInt502 >= 11776)) {
				arg0.anInt463 = -1;
				arg0.anInt487 = -1;
				arg0.anInt481 = 0;
				arg0.anInt482 = 0;
				arg0.anInt501 = arg0.anIntArray104[0] * 128 + arg0.anInt471 * 64;
				arg0.anInt502 = arg0.anIntArray105[0] * 128 + arg0.anInt471 * 64;
				arg0.method235();
			}
			if (arg0.anInt481 > anInt1022) {
				this.method598((byte) 4, arg0);
			} else if (arg0.anInt482 >= anInt1022) {
				this.method599(arg0);
			} else {
				this.method600(arg0);
			}
			this.method601(arg0);
			this.method602(arg0);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("9096, " + arg0 + ", " + 676 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!DSYLCNKR;)V")
	private void method598(@OriginalArg(0) byte arg0, @OriginalArg(1) Class5_Sub1_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt481 - anInt1022;
			@Pc(14) int local14 = arg1.anInt477 * 128 + arg1.anInt471 * 64;
			@Pc(24) int local24 = arg1.anInt479 * 128 + arg1.anInt471 * 64;
			arg1.anInt501 += (local14 - arg1.anInt501) / local4;
			@Pc(40) boolean local40 = false;
			arg1.anInt502 += (local24 - arg1.anInt502) / local4;
			arg1.anInt496 = 0;
			if (arg1.anInt483 == 0) {
				arg1.anInt486 = 1024;
			}
			if (arg1.anInt483 == 1) {
				arg1.anInt486 = 1536;
			}
			if (arg1.anInt483 == 2) {
				arg1.anInt486 = 0;
			}
			if (arg1.anInt483 == 3) {
				arg1.anInt486 = 512;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("58929, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DSYLCNKR;)V")
	private void method599(@OriginalArg(1) Class5_Sub1_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt482 == anInt1022 || arg0.anInt463 == -1 || arg0.anInt466 != 0 || arg0.anInt465 + 1 > Class32.aClass32Array1[arg0.anInt463].method229(arg0.anInt464, this.aByte35)) {
				@Pc(30) int local30 = arg0.anInt482 - arg0.anInt481;
				@Pc(35) int local35 = anInt1022 - arg0.anInt481;
				@Pc(45) int local45 = arg0.anInt477 * 128 + arg0.anInt471 * 64;
				@Pc(55) int local55 = arg0.anInt479 * 128 + arg0.anInt471 * 64;
				@Pc(65) int local65 = arg0.anInt478 * 128 + arg0.anInt471 * 64;
				@Pc(75) int local75 = arg0.anInt480 * 128 + arg0.anInt471 * 64;
				arg0.anInt501 = (local45 * (local30 - local35) + local65 * local35) / local30;
				arg0.anInt502 = (local55 * (local30 - local35) + local75 * local35) / local30;
			}
			arg0.anInt496 = 0;
			if (arg0.anInt483 == 0) {
				arg0.anInt486 = 1024;
			}
			if (arg0.anInt483 == 1) {
				arg0.anInt486 = 1536;
			}
			if (arg0.anInt483 == 2) {
				arg0.anInt486 = 0;
			}
			if (arg0.anInt483 == 3) {
				arg0.anInt486 = 512;
			}
			arg0.anInt503 = arg0.anInt486;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("2346, " + 37678 + ", " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DSYLCNKR;B)V")
	private void method600(@OriginalArg(0) Class5_Sub1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt493 = arg0.anInt506;
			if (arg0.anInt498 == 0) {
				arg0.anInt496 = 0;
			} else {
				if (arg0.anInt463 != -1 && arg0.anInt466 == 0) {
					@Pc(24) Class32 local24 = Class32.aClass32Array1[arg0.anInt463];
					if (arg0.anInt485 > 0 && local24.anInt447 == 0) {
						arg0.anInt496++;
						return;
					}
					if (arg0.anInt485 <= 0 && local24.anInt448 == 0) {
						arg0.anInt496++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt501;
				@Pc(56) int local56 = arg0.anInt502;
				@Pc(78) int local78 = arg0.anIntArray104[arg0.anInt498 - 1] * 128 + arg0.anInt471 * 64;
				@Pc(93) int local93 = arg0.anIntArray105[arg0.anInt498 - 1] * 128 + arg0.anInt471 * 64;
				if (local78 - local53 <= 256 && local78 - local53 >= -256 && local93 - local56 <= 256 && local93 - local56 >= -256) {
					if (local53 < local78) {
						if (local56 < local93) {
							arg0.anInt486 = 1280;
						} else if (local56 > local93) {
							arg0.anInt486 = 1792;
						} else {
							arg0.anInt486 = 1536;
						}
					} else if (local53 > local78) {
						if (local56 < local93) {
							arg0.anInt486 = 768;
						} else if (local56 > local93) {
							arg0.anInt486 = 256;
						} else {
							arg0.anInt486 = 512;
						}
					} else if (local56 < local93) {
						arg0.anInt486 = 1024;
					} else {
						arg0.anInt486 = 0;
					}
					@Pc(187) int local187 = arg0.anInt486 - arg0.anInt503 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt474;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt473;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt476;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt475;
					}
					if (local194 == -1) {
						local194 = arg0.anInt473;
					}
					arg0.anInt493 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt503 != arg0.anInt486 && arg0.anInt484 == -1 && arg0.anInt497 != 0) {
						local236 = 2;
					}
					if (arg0.anInt498 > 2) {
						local236 = 6;
					}
					if (arg0.anInt498 > 3) {
						local236 = 8;
					}
					if (arg0.anInt496 > 0 && arg0.anInt498 > 1) {
						local236 = 8;
						arg0.anInt496--;
					}
					if (arg0.aBooleanArray4[arg0.anInt498 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt493 == arg0.anInt473 && arg0.anInt505 != -1) {
						arg0.anInt493 = arg0.anInt505;
					}
					if (local53 < local78) {
						arg0.anInt501 += local236;
						if (arg0.anInt501 > local78) {
							arg0.anInt501 = local78;
						}
					} else if (local53 > local78) {
						arg0.anInt501 -= local236;
						if (arg0.anInt501 < local78) {
							arg0.anInt501 = local78;
						}
					}
					if (local56 < local93) {
						arg0.anInt502 += local236;
						if (arg0.anInt502 > local93) {
							arg0.anInt502 = local93;
						}
					} else if (local56 > local93) {
						arg0.anInt502 -= local236;
						if (arg0.anInt502 < local93) {
							arg0.anInt502 = local93;
						}
					}
					if (arg0.anInt501 == local78 && arg0.anInt502 == local93) {
						arg0.anInt498--;
						if (arg0.anInt485 > 0) {
							arg0.anInt485--;
							return;
						}
					}
				} else {
					arg0.anInt501 = local78;
					arg0.anInt502 = local93;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("73154, " + arg0 + ", " + 101 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DSYLCNKR;I)V")
	private void method601(@OriginalArg(0) Class5_Sub1_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt497 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt484 != -1 && arg0.anInt484 < 32768) {
					@Pc(26) Class5_Sub1_Sub1_Sub3_Sub1 local26 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt484];
					if (local26 != null) {
						local34 = arg0.anInt501 - local26.anInt501;
						local40 = arg0.anInt502 - local26.anInt502;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt486 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt484 >= 32768) {
					local65 = arg0.anInt484 - 32768;
					if (local65 == this.anInt898) {
						local65 = this.anInt1024;
					}
					@Pc(77) Class5_Sub1_Sub1_Sub3_Sub2 local77 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt501 - local77.anInt501;
						@Pc(91) int local91 = arg0.anInt502 - local77.anInt502;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt486 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt499 != 0 || arg0.anInt500 != 0) && (arg0.anInt498 == 0 || arg0.anInt496 > 0)) {
					local65 = arg0.anInt501 - (arg0.anInt499 - this.anInt983 - this.anInt983) * 64;
					local34 = arg0.anInt502 - (arg0.anInt500 - this.anInt984 - this.anInt984) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt486 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt499 = 0;
					arg0.anInt500 = 0;
				}
				local65 = arg0.anInt486 - arg0.anInt503 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt497 || local65 > 2048 - arg0.anInt497) {
						arg0.anInt503 = arg0.anInt486;
					} else if (local65 > 1024) {
						arg0.anInt503 -= arg0.anInt497;
					} else {
						arg0.anInt503 += arg0.anInt497;
					}
					arg0.anInt503 &= 0x7FF;
					if (arg0.anInt493 == arg0.anInt506 && arg0.anInt503 != arg0.anInt486) {
						if (arg0.anInt507 != -1) {
							arg0.anInt493 = arg0.anInt507;
							return;
						}
						arg0.anInt493 = arg0.anInt473;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("59932, " + arg0 + ", " + -37625 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!DSYLCNKR;)V")
	private void method602(@OriginalArg(1) Class5_Sub1_Sub1_Sub3 arg0) {
		try {
			arg0.aBoolean137 = false;
			@Pc(22) Class32 local22;
			if (arg0.anInt493 != -1) {
				local22 = Class32.aClass32Array1[arg0.anInt493];
				arg0.anInt495++;
				if (arg0.anInt494 < local22.anInt441 && arg0.anInt495 > local22.method229(arg0.anInt494, this.aByte35)) {
					arg0.anInt495 = 0;
					arg0.anInt494++;
				}
				if (arg0.anInt494 >= local22.anInt441) {
					arg0.anInt495 = 0;
					arg0.anInt494 = 0;
				}
			}
			if (arg0.anInt487 != -1 && anInt1022 >= arg0.anInt490) {
				if (arg0.anInt488 < 0) {
					arg0.anInt488 = 0;
				}
				local22 = Class6.aClass6Array1[arg0.anInt487].aClass32_2;
				arg0.anInt489++;
				while (arg0.anInt488 < local22.anInt441 && arg0.anInt489 > local22.method229(arg0.anInt488, this.aByte35)) {
					arg0.anInt489 -= local22.method229(arg0.anInt488, this.aByte35);
					arg0.anInt488++;
				}
				if (arg0.anInt488 >= local22.anInt441 && (arg0.anInt488 < 0 || arg0.anInt488 >= local22.anInt441)) {
					arg0.anInt487 = -1;
				}
			}
			if (arg0.anInt463 != -1 && arg0.anInt466 <= 1) {
				local22 = Class32.aClass32Array1[arg0.anInt463];
				if (local22.anInt447 == 1 && arg0.anInt485 > 0 && arg0.anInt481 <= anInt1022 && arg0.anInt482 < anInt1022) {
					arg0.anInt466 = 1;
					return;
				}
			}
			if (arg0.anInt463 != -1 && arg0.anInt466 == 0) {
				local22 = Class32.aClass32Array1[arg0.anInt463];
				arg0.anInt465++;
				while (arg0.anInt464 < local22.anInt441 && arg0.anInt465 > local22.method229(arg0.anInt464, this.aByte35)) {
					arg0.anInt465 -= local22.method229(arg0.anInt464, this.aByte35);
					arg0.anInt464++;
				}
				if (arg0.anInt464 >= local22.anInt441) {
					arg0.anInt464 -= local22.anInt442;
					arg0.anInt467++;
					if (arg0.anInt467 >= local22.anInt446) {
						arg0.anInt463 = -1;
					}
					if (arg0.anInt464 < 0 || arg0.anInt464 >= local22.anInt441) {
						arg0.anInt463 = -1;
					}
				}
				arg0.aBoolean137 = local22.aBoolean133;
			}
			if (arg0.anInt466 > 0) {
				arg0.anInt466--;
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("86006, " + 5 + ", " + arg0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method603(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -49) {
				aBoolean261 = !aBoolean261;
			}
			if (this.anInt924 == -1 || this.anInt1034 != 2 && super.aClass10_2 == null) {
				if (this.aBoolean249) {
					this.method585();
					this.aBoolean249 = false;
					this.aClass10_3.method45(super.aGraphics2, 0, 4, this.anInt999);
					this.aClass10_4.method45(super.aGraphics2, 0, 357, this.anInt999);
					this.aClass10_5.method45(super.aGraphics2, 722, 4, this.anInt999);
					this.aClass10_6.method45(super.aGraphics2, 743, 205, this.anInt999);
					this.aClass10_7.method45(super.aGraphics2, 0, 0, this.anInt999);
					this.aClass10_8.method45(super.aGraphics2, 516, 4, this.anInt999);
					this.aClass10_9.method45(super.aGraphics2, 516, 205, this.anInt999);
					this.aClass10_10.method45(super.aGraphics2, 496, 357, this.anInt999);
					this.aClass10_11.method45(super.aGraphics2, 0, 338, this.anInt999);
					this.aBoolean264 = true;
					this.aBoolean246 = true;
					this.aBoolean241 = true;
					this.aBoolean256 = true;
					if (this.anInt1034 != 2) {
						this.aClass10_14.method45(super.aGraphics2, 4, 4, this.anInt999);
						this.aClass10_13.method45(super.aGraphics2, 550, 4, this.anInt999);
					}
				}
				if (this.anInt1034 == 2) {
					this.method676();
				}
				if (this.aBoolean242 && this.anInt852 == 1) {
					this.aBoolean264 = true;
				}
				@Pc(298) boolean local298;
				if (this.anInt951 != -1) {
					local298 = this.method696(this.anInt951, this.anInt975);
					if (local298) {
						this.aBoolean264 = true;
					}
				}
				if (this.anInt958 == 2) {
					this.aBoolean264 = true;
				}
				if (this.anInt828 == 2) {
					this.aBoolean264 = true;
				}
				if (this.aBoolean264) {
					this.method688();
					this.aBoolean264 = false;
				}
				if (this.anInt990 == -1) {
					this.aClass45_1.anInt676 = this.anInt1019 - this.anInt1027 - 77;
					if (super.anInt815 > 448 && super.anInt815 < 560 && super.anInt816 > 332) {
						this.method653(super.anInt816 - 357, super.anInt815 - 17, this.anInt1019, 0, 77, 463, this.aClass45_1, -1);
					}
					@Pc(380) int local380 = this.anInt1019 - this.aClass45_1.anInt676 - 77;
					if (local380 < 0) {
						local380 = 0;
					}
					if (local380 > this.anInt1019 - 77) {
						local380 = this.anInt1019 - 77;
					}
					if (this.anInt1027 != local380) {
						this.anInt1027 = local380;
						this.aBoolean246 = true;
					}
				}
				if (this.anInt990 != -1) {
					local298 = this.method696(this.anInt990, this.anInt975);
					if (local298) {
						this.aBoolean246 = true;
					}
				}
				if (this.anInt958 == 3) {
					this.aBoolean246 = true;
				}
				if (this.anInt828 == 3) {
					this.aBoolean246 = true;
				}
				if (this.aString23 != null) {
					this.aBoolean246 = true;
				}
				if (this.aBoolean242 && this.anInt852 == 2) {
					this.aBoolean246 = true;
				}
				if (this.aBoolean246) {
					this.method641();
					this.aBoolean246 = false;
				}
				if (this.anInt1034 == 2) {
					this.method606(this.aByte31);
					this.aClass10_13.method45(super.aGraphics2, 550, 4, this.anInt999);
				}
				if (this.anInt1039 != -1) {
					this.aBoolean241 = true;
				}
				if (this.aBoolean241) {
					if (this.anInt1039 != -1 && this.anInt1039 == this.anInt967) {
						this.anInt1039 = -1;
						this.aClass5_Sub1_Sub4_8.method426(113);
						this.aClass5_Sub1_Sub4_8.method427(this.anInt967);
					}
					this.aBoolean241 = false;
					this.aClass10_18.method44();
					this.aClass5_Sub1_Sub2_Sub3_10.method326(0, 0);
					if (this.anInt951 == -1) {
						if (this.anIntArray255[this.anInt967] != -1) {
							if (this.anInt967 == 0) {
								this.aClass5_Sub1_Sub2_Sub3_3.method326(10, 22);
							}
							if (this.anInt967 == 1) {
								this.aClass5_Sub1_Sub2_Sub3_4.method326(8, 54);
							}
							if (this.anInt967 == 2) {
								this.aClass5_Sub1_Sub2_Sub3_4.method326(8, 82);
							}
							if (this.anInt967 == 3) {
								this.aClass5_Sub1_Sub2_Sub3_5.method326(8, 110);
							}
							if (this.anInt967 == 4) {
								this.aClass5_Sub1_Sub2_Sub3_7.method326(8, 153);
							}
							if (this.anInt967 == 5) {
								this.aClass5_Sub1_Sub2_Sub3_7.method326(8, 181);
							}
							if (this.anInt967 == 6) {
								this.aClass5_Sub1_Sub2_Sub3_6.method326(9, 209);
							}
						}
						if (this.anIntArray255[0] != -1 && (this.anInt1039 != 0 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[0].method326(13, 29);
						}
						if (this.anIntArray255[1] != -1 && (this.anInt1039 != 1 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[1].method326(11, 53);
						}
						if (this.anIntArray255[2] != -1 && (this.anInt1039 != 2 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[2].method326(11, 82);
						}
						if (this.anIntArray255[3] != -1 && (this.anInt1039 != 3 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[3].method326(12, 115);
						}
						if (this.anIntArray255[4] != -1 && (this.anInt1039 != 4 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[4].method326(13, 153);
						}
						if (this.anIntArray255[5] != -1 && (this.anInt1039 != 5 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[5].method326(11, 180);
						}
						if (this.anIntArray255[6] != -1 && (this.anInt1039 != 6 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[6].method326(13, 208);
						}
					}
					this.aClass10_18.method45(super.aGraphics2, 516, 160, this.anInt999);
					this.aClass10_17.method44();
					this.aClass5_Sub1_Sub2_Sub3_9.method326(0, 0);
					if (this.anInt951 == -1) {
						if (this.anIntArray255[this.anInt967] != -1) {
							if (this.anInt967 == 7) {
								this.aClass5_Sub1_Sub2_Sub3_11.method326(0, 42);
							}
							if (this.anInt967 == 8) {
								this.aClass5_Sub1_Sub2_Sub3_12.method326(0, 74);
							}
							if (this.anInt967 == 9) {
								this.aClass5_Sub1_Sub2_Sub3_12.method326(0, 102);
							}
							if (this.anInt967 == 10) {
								this.aClass5_Sub1_Sub2_Sub3_13.method326(1, 130);
							}
							if (this.anInt967 == 11) {
								this.aClass5_Sub1_Sub2_Sub3_15.method326(0, 173);
							}
							if (this.anInt967 == 12) {
								this.aClass5_Sub1_Sub2_Sub3_15.method326(0, 201);
							}
							if (this.anInt967 == 13) {
								this.aClass5_Sub1_Sub2_Sub3_14.method326(0, 229);
							}
						}
						if (this.anIntArray255[8] != -1 && (this.anInt1039 != 8 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[7].method326(2, 74);
						}
						if (this.anIntArray255[9] != -1 && (this.anInt1039 != 9 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[8].method326(3, 102);
						}
						if (this.anIntArray255[10] != -1 && (this.anInt1039 != 10 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[9].method326(4, 137);
						}
						if (this.anIntArray255[11] != -1 && (this.anInt1039 != 11 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[10].method326(2, 174);
						}
						if (this.anIntArray255[12] != -1 && (this.anInt1039 != 12 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[11].method326(2, 201);
						}
						if (this.anIntArray255[13] != -1 && (this.anInt1039 != 13 || anInt1022 % 20 < 10)) {
							this.aClass5_Sub1_Sub2_Sub3Array2[12].method326(2, 226);
						}
					}
					this.aClass10_17.method45(super.aGraphics2, 496, 466, this.anInt999);
					this.aClass10_14.method44();
					Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
				}
				if (this.aBoolean256) {
					this.aBoolean256 = false;
					this.aClass10_16.method44();
					this.aClass5_Sub1_Sub2_Sub3_8.method326(0, 0);
					this.aClass5_Sub1_Sub2_Sub1_3.method179(55, 28, "Public chat", 16777215, true);
					if (this.anInt833 == 0) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(55, 41, "On", 65280, true);
					}
					if (this.anInt833 == 1) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(55, 41, "Friends", 16776960, true);
					}
					if (this.anInt833 == 2) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(55, 41, "Off", 16711680, true);
					}
					if (this.anInt833 == 3) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(55, 41, "Hide", 65535, true);
					}
					this.aClass5_Sub1_Sub2_Sub1_3.method179(184, 28, "Private chat", 16777215, true);
					if (this.anInt950 == 0) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(184, 41, "On", 65280, true);
					}
					if (this.anInt950 == 1) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(184, 41, "Friends", 16776960, true);
					}
					if (this.anInt950 == 2) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(184, 41, "Off", 16711680, true);
					}
					this.aClass5_Sub1_Sub2_Sub1_3.method179(324, 28, "Trade/compete", 16777215, true);
					if (this.anInt908 == 0) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(324, 41, "On", 65280, true);
					}
					if (this.anInt908 == 1) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(324, 41, "Friends", 16776960, true);
					}
					if (this.anInt908 == 2) {
						this.aClass5_Sub1_Sub2_Sub1_3.method179(324, 41, "Off", 16711680, true);
					}
					this.aClass5_Sub1_Sub2_Sub1_3.method179(458, 33, "Report abuse", 16777215, true);
					this.aClass10_16.method45(super.aGraphics2, 0, 453, this.anInt999);
					this.aClass10_14.method44();
					Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
				}
				this.anInt975 = 0;
			} else {
				if (this.anInt1034 == 2) {
					this.method696(this.anInt924, this.anInt975);
					if (this.anInt878 != -1) {
						this.method696(this.anInt878, this.anInt975);
					}
					this.anInt975 = 0;
					this.method593();
					super.aClass10_2.method44();
					Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray245;
					Class5_Sub1_Sub2.method333();
					this.aBoolean249 = true;
					@Pc(65) Class45 local65 = Class45.method361(this.anInt924);
					if (local65.anInt647 == 512 && local65.anInt650 == 334 && local65.anInt675 == 0) {
						local65.anInt647 = 765;
						local65.anInt650 = 503;
					}
					this.method621(0, 0, local65, 0);
					if (this.anInt878 != -1) {
						local65 = Class45.method361(this.anInt878);
						if (local65.anInt647 == 512 && local65.anInt650 == 334 && local65.anInt675 == 0) {
							local65.anInt647 = 765;
							local65.anInt650 = 503;
						}
						this.method621(0, 0, local65, 0);
					}
					if (this.aBoolean242) {
						this.method683();
					} else {
						this.method667();
						this.method691();
					}
				}
				super.aClass10_2.method45(super.aGraphics2, 0, 0, this.anInt999);
			}
		} catch (@Pc(1217) RuntimeException local1217) {
			signlink.reporterror("89088, " + arg0 + ", " + local1217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZBI)V")
	private void method604(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1058 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("20411, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method605() {
		try {
			if (this.anInt828 == 0) {
				@Pc(8) int local8 = super.anInt820;
				if (this.anInt882 == 1 && super.anInt821 >= 516 && super.anInt822 >= 160 && super.anInt821 <= 765 && super.anInt822 <= 205) {
					local8 = 0;
				}
				@Pc(44) int local44;
				@Pc(47) int local47;
				@Pc(123) int local123;
				if (this.aBoolean242) {
					if (local8 != 1) {
						local44 = super.anInt815;
						local47 = super.anInt816;
						if (this.anInt852 == 0) {
							local44 -= 4;
							local47 -= 4;
						}
						if (this.anInt852 == 1) {
							local44 -= 553;
							local47 -= 205;
						}
						if (this.anInt852 == 2) {
							local44 -= 17;
							local47 -= 357;
						}
						if (local44 < this.anInt853 - 10 || local44 > this.anInt853 + this.anInt855 + 10 || local47 < this.anInt854 - 10 || local47 > this.anInt854 + this.anInt856 + 10) {
							this.aBoolean242 = false;
							if (this.anInt852 == 1) {
								this.aBoolean264 = true;
							}
							if (this.anInt852 == 2) {
								this.aBoolean246 = true;
							}
						}
					}
					if (local8 == 1) {
						local44 = this.anInt853;
						local47 = this.anInt854;
						local123 = this.anInt855;
						@Pc(126) int local126 = super.anInt821;
						@Pc(129) int local129 = super.anInt822;
						if (this.anInt852 == 0) {
							local126 -= 4;
							local129 -= 4;
						}
						if (this.anInt852 == 1) {
							local126 -= 553;
							local129 -= 205;
						}
						if (this.anInt852 == 2) {
							local126 -= 17;
							local129 -= 357;
						}
						@Pc(148) int local148 = -1;
						for (@Pc(150) int local150 = 0; local150 < this.anInt881; local150++) {
							@Pc(165) int local165 = local47 + (this.anInt881 - 1 - local150) * 15 + 31;
							if (local126 > local44 && local126 < local44 + local123 && local129 > local165 - 13 && local129 < local165 + 3) {
								local148 = local150;
							}
						}
						if (local148 != -1) {
							this.method628(local148);
						}
						this.aBoolean242 = false;
						if (this.anInt852 == 1) {
							this.aBoolean264 = true;
						}
						if (this.anInt852 == 2) {
							this.aBoolean246 = true;
							return;
						}
					}
				} else {
					if (local8 == 1 && this.anInt881 > 0) {
						local44 = this.anIntArray274[this.anInt881 - 1];
						if (local44 == 610 || local44 == 36 || local44 == 38 || local44 == 277 || local44 == 929 || local44 == 477 || local44 == 705 || local44 == 363 || local44 == 34 || local44 == 73 || local44 == 332 || local44 == 1205) {
							local47 = this.anIntArray272[this.anInt881 - 1];
							local123 = this.anIntArray273[this.anInt881 - 1];
							@Pc(284) Class45 local284 = Class45.method361(local123);
							if (local284.aBoolean186 || local284.aBoolean184) {
								this.aBoolean265 = false;
								this.anInt896 = 0;
								this.anInt826 = local123;
								this.anInt827 = local47;
								this.anInt828 = 2;
								this.anInt829 = super.anInt821;
								this.anInt830 = super.anInt822;
								if (Class45.method361(local123).anInt640 == this.anInt940) {
									this.anInt828 = 1;
								}
								if (Class45.method361(local123).anInt640 == this.anInt990) {
									this.anInt828 = 3;
								}
								return;
							}
						}
					}
					if (local8 == 1 && (this.anInt1000 == 1 || this.method623(this.anInt881 - 1)) && this.anInt881 > 2) {
						local8 = 2;
					}
					if (local8 == 1 && this.anInt881 > 0) {
						this.method628(this.anInt881 - 1);
					}
					if (local8 != 2 || this.anInt881 <= 0) {
						return;
					}
					this.method666();
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("14506, " + -551 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method606(@OriginalArg(0) byte arg0) {
		try {
			this.aClass10_13.method44();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt998 == 2) {
				@Pc(13) byte[] local13 = this.aClass5_Sub1_Sub2_Sub3_17.aByteArray13;
				@Pc(15) int[] local15 = Class5_Sub1_Sub2.anIntArray117;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass5_Sub1_Sub2_Sub2_10.method280(33, 25, 25, this.anIntArray235, 0, 33, 0, 256, this.anInt933, this.anIntArray222);
				this.aClass10_14.method44();
				Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
			} else {
				@Pc(67) int local67 = this.anInt933 + this.anInt886 & 0x7FF;
				@Pc(74) int local74 = aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32 + 48;
				local18 = 464 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
				this.aClass5_Sub1_Sub2_Sub2_3.method280(151, local18, local74, this.anIntArray269, 25, 146, 5, this.anInt937 + 256, local67, this.anIntArray271);
				if (arg0 == this.aByte31) {
					this.aClass5_Sub1_Sub2_Sub2_10.method280(33, 25, 25, this.anIntArray235, 0, 33, 0, 256, this.anInt933, this.anIntArray222);
					for (local20 = 0; local20 < this.anInt964; local20++) {
						local74 = this.anIntArray246[local20] * 4 + 2 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32;
						local18 = this.anIntArray247[local20] * 4 + 2 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
						this.method652(this.aClass5_Sub1_Sub2_Sub2Array9[local20], local18, local74);
					}
					@Pc(174) int local174;
					for (@Pc(170) int local170 = 0; local170 < 104; local170++) {
						for (local174 = 0; local174 < 104; local174++) {
							@Pc(186) Class42 local186 = this.aClass42ArrayArrayArray1[this.anInt948][local170][local174];
							if (local186 != null) {
								local74 = local170 * 4 + 2 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32;
								local18 = local174 * 4 + 2 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
								this.method652(this.aClass5_Sub1_Sub2_Sub2_13, local18, local74);
							}
						}
					}
					for (local174 = 0; local174 < this.anInt849; local174++) {
						@Pc(237) Class5_Sub1_Sub1_Sub3_Sub1 local237 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray214[local174]];
						if (local237 != null && local237.method236()) {
							@Pc(246) Class24 local246 = local237.aClass24_1;
							if (local246.anIntArray61 != null) {
								local246 = local246.method155((byte) 9);
							}
							if (local246 != null && local246.aBoolean100 && local246.aBoolean101) {
								local74 = local237.anInt501 / 32 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32;
								local18 = local237.anInt502 / 32 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
								this.method652(this.aClass5_Sub1_Sub2_Sub2_14, local18, local74);
							}
						}
					}
					@Pc(305) Class5_Sub1_Sub1_Sub3_Sub2 local305;
					for (@Pc(295) int local295 = 0; local295 < this.anInt1025; local295++) {
						local305 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray264[local295]];
						if (local305 != null && local305.method236()) {
							local74 = local305.anInt501 / 32 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32;
							local18 = local305.anInt502 / 32 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
							@Pc(333) boolean local333 = false;
							@Pc(337) long local337 = Class11.method47(local305.aString10);
							for (@Pc(339) int local339 = 0; local339 < this.anInt845; local339++) {
								if (local337 == this.aLongArray3[local339] && this.anIntArray229[local339] != 0) {
									local333 = true;
									break;
								}
							}
							@Pc(364) boolean local364 = false;
							if (aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt509 != 0 && local305.anInt509 != 0 && aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt509 == local305.anInt509) {
								local364 = true;
							}
							if (local333) {
								this.method652(this.aClass5_Sub1_Sub2_Sub2_16, local18, local74);
							} else if (local364) {
								this.method652(this.aClass5_Sub1_Sub2_Sub2_17, local18, local74);
							} else {
								this.method652(this.aClass5_Sub1_Sub2_Sub2_15, local18, local74);
							}
						}
					}
					if (this.anInt875 != 0 && anInt1022 % 20 < 10) {
						if (this.anInt875 == 1 && this.anInt851 >= 0 && this.anInt851 < this.aClass5_Sub1_Sub1_Sub3_Sub1Array1.length) {
							@Pc(438) Class5_Sub1_Sub1_Sub3_Sub1 local438 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[this.anInt851];
							if (local438 != null) {
								local74 = local438.anInt501 / 32 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32;
								local18 = local438.anInt502 / 32 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
								this.method622(this.aClass5_Sub1_Sub2_Sub2_9, local74, local18);
							}
						}
						if (this.anInt875 == 2) {
							local74 = (this.anInt1002 - this.anInt983) * 4 + 2 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32;
							local18 = (this.anInt1003 - this.anInt984) * 4 + 2 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
							this.method622(this.aClass5_Sub1_Sub2_Sub2_9, local74, local18);
						}
						if (this.anInt875 == 10 && this.anInt894 >= 0 && this.anInt894 < this.aClass5_Sub1_Sub1_Sub3_Sub2Array1.length) {
							local305 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anInt894];
							if (local305 != null) {
								local74 = local305.anInt501 / 32 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32;
								local18 = local305.anInt502 / 32 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
								this.method622(this.aClass5_Sub1_Sub2_Sub2_9, local74, local18);
							}
						}
					}
					if (this.anInt892 != 0) {
						local74 = this.anInt892 * 4 + 2 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 / 32;
						local18 = this.anInt893 * 4 + 2 - aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 / 32;
						this.method652(this.aClass5_Sub1_Sub2_Sub2_8, local18, local74);
					}
					Class5_Sub1_Sub2.method335(78, 16777215, 97, 3, 3);
					this.aClass10_14.method44();
					Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
				}
			}
		} catch (@Pc(606) RuntimeException local606) {
			signlink.reporterror("22665, " + arg0 + ", " + local606.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method607() {
		try {
			if (this.anInt900 > 1) {
				this.anInt900--;
			}
			if (this.anInt963 > 0) {
				this.anInt963--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method675(); local22++) {
			}
			if (this.aBoolean245) {
				@Pc(41) Object local41 = this.aClass37_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass37_1.anObject1) {
					if (!aBoolean262) {
						this.aClass37_1.anInt558 = 0;
					} else if (super.anInt820 != 0 || this.aClass37_1.anInt558 >= 40) {
						this.aClass5_Sub1_Sub4_8.method426(97);
						this.aClass5_Sub1_Sub4_8.method427(0);
						local66 = this.aClass5_Sub1_Sub4_8.anInt755;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass37_1.anInt558 && local66 - this.aClass5_Sub1_Sub4_8.anInt755 < 240; local70++) {
							local68++;
							local86 = this.aClass37_1.anIntArray109[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass37_1.anIntArray108[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass37_1.anIntArray109[local70] == -1 && this.aClass37_1.anIntArray108[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt831 || local86 != this.anInt832) {
								@Pc(165) int local165 = local103 - this.anInt831;
								this.anInt831 = local103;
								@Pc(173) int local173 = local86 - this.anInt832;
								this.anInt832 = local86;
								if (this.anInt895 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass5_Sub1_Sub4_8.method428((this.anInt895 << 12) + (local165 << 6) + local173);
									this.anInt895 = 0;
								} else if (this.anInt895 < 8) {
									this.aClass5_Sub1_Sub4_8.method430((this.anInt895 << 19) + local120 + 8388608);
									this.anInt895 = 0;
								} else {
									this.aClass5_Sub1_Sub4_8.method431((this.anInt895 << 19) + local120 - 1073741824);
									this.anInt895 = 0;
								}
							} else if (this.anInt895 < 2047) {
								this.anInt895++;
							}
						}
						this.aClass5_Sub1_Sub4_8.method436(this.aClass5_Sub1_Sub4_8.anInt755 - local66);
						if (local68 >= this.aClass37_1.anInt558) {
							this.aClass37_1.anInt558 = 0;
						} else {
							this.aClass37_1.anInt558 -= local68;
							for (local86 = 0; local86 < this.aClass37_1.anInt558; local86++) {
								this.aClass37_1.anIntArray108[local86] = this.aClass37_1.anIntArray108[local86 + local68];
								this.aClass37_1.anIntArray109[local86] = this.aClass37_1.anIntArray109[local86 + local68];
							}
						}
					}
				}
				if (super.anInt820 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong31) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong31 = super.aLong28;
					local66 = super.anInt822;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt821;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt820 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass5_Sub1_Sub4_8.method426(14);
					this.aClass5_Sub1_Sub4_8.method469((local103 << 20) + (local382 << 19) + local70, this.anInt836);
				}
				if (this.anInt946 > 0) {
					this.anInt946--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean253 = true;
				}
				if (this.aBoolean253 && this.anInt946 <= 0) {
					this.anInt946 = 20;
					this.aBoolean253 = false;
					this.aClass5_Sub1_Sub4_8.method426(124);
					this.aClass5_Sub1_Sub4_8.method462(this.anInt932);
					this.aClass5_Sub1_Sub4_8.method460(this.anInt933);
				}
				if (super.aBoolean230 && !this.aBoolean251) {
					this.aBoolean251 = true;
					this.aClass5_Sub1_Sub4_8.method426(57);
					this.aClass5_Sub1_Sub4_8.method427(1);
				}
				if (!super.aBoolean230 && this.aBoolean251) {
					this.aBoolean251 = false;
					this.aClass5_Sub1_Sub4_8.method426(57);
					this.aClass5_Sub1_Sub4_8.method427(0);
				}
				this.method650();
				this.method629();
				this.method680();
				this.anInt961++;
				if (this.anInt961 > 750) {
					this.method660();
				}
				this.method615();
				this.method596();
				this.method586();
				this.anInt975++;
				if (this.anInt972 != 0) {
					this.anInt971 += 20;
					if (this.anInt971 >= 400) {
						this.anInt972 = 0;
					}
				}
				if (this.anInt958 != 0) {
					this.anInt955++;
					if (this.anInt955 >= 15) {
						if (this.anInt958 == 2) {
							this.aBoolean264 = true;
						}
						if (this.anInt958 == 3) {
							this.aBoolean246 = true;
						}
						this.anInt958 = 0;
					}
				}
				if (this.anInt828 != 0) {
					this.anInt896++;
					if (super.anInt815 > this.anInt829 + 5 || super.anInt815 < this.anInt829 - 5 || super.anInt816 > this.anInt830 + 5 || super.anInt816 < this.anInt830 - 5) {
						this.aBoolean265 = true;
					}
					if (super.anInt814 == 0) {
						if (this.anInt828 == 2) {
							this.aBoolean264 = true;
						}
						if (this.anInt828 == 3) {
							this.aBoolean246 = true;
						}
						this.anInt828 = 0;
						if (this.aBoolean265 && this.anInt896 >= 5) {
							this.anInt904 = -1;
							this.method667();
							if (this.anInt904 == this.anInt826 && this.anInt903 != this.anInt827) {
								@Pc(685) Class45 local685 = Class45.method361(this.anInt826);
								@Pc(687) byte local687 = 0;
								if (this.anInt915 == 1 && local685.anInt670 == 206) {
									local687 = 1;
								}
								if (local685.anIntArray131[this.anInt903] <= 0) {
									local687 = 0;
								}
								if (local685.aBoolean184) {
									local66 = this.anInt827;
									local68 = this.anInt903;
									local685.anIntArray131[local68] = local685.anIntArray131[local66];
									local685.anIntArray126[local68] = local685.anIntArray126[local66];
									local685.anIntArray131[local66] = -1;
									local685.anIntArray126[local66] = 0;
								} else if (local687 == 1) {
									local66 = this.anInt827;
									local68 = this.anInt903;
									while (local66 != local68) {
										if (local66 > local68) {
											local685.method360(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local685.method360(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local685.method360(this.anInt903, this.anInt827);
								}
								this.aClass5_Sub1_Sub4_8.method426(202);
								this.aClass5_Sub1_Sub4_8.method428(this.anInt903);
								this.aClass5_Sub1_Sub4_8.method454(this.anInt968, local687);
								this.aClass5_Sub1_Sub4_8.method461(this.anInt827);
								this.aClass5_Sub1_Sub4_8.method428(this.anInt826);
							}
						} else if ((this.anInt1000 == 1 || this.method623(this.anInt881 - 1)) && this.anInt881 > 2) {
							this.method666();
						} else if (this.anInt881 > 0) {
							this.method628(this.anInt881 - 1);
						}
						this.anInt955 = 10;
						super.anInt820 = 0;
					}
				}
				@Pc(860) int local860;
				@Pc(862) int local862;
				if (Class48.anInt788 != -1) {
					local860 = Class48.anInt788;
					local862 = Class48.anInt789;
					@Pc(884) boolean local884 = this.method638(local862, this.anInt876, 0, 0, 0, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, true, local860, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					Class48.anInt788 = -1;
					if (local884) {
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 1;
						this.anInt971 = 0;
					}
				}
				if (super.anInt820 == 1 && this.aString23 != null) {
					this.aString23 = null;
					this.aBoolean246 = true;
					super.anInt820 = 0;
				}
				this.method605();
				if (this.anInt924 == -1) {
					this.method715();
					this.method714((byte) 4);
					this.method643();
				}
				if (super.anInt814 == 1 || super.anInt820 == 1) {
					this.anInt905++;
				}
				if (this.anInt947 == 0 && this.anInt877 == 0 && this.anInt897 == 0) {
					if (this.anInt850 > 0) {
						this.anInt850--;
					}
				} else if (this.anInt850 < 100) {
					this.anInt850++;
					if (this.anInt850 == 100) {
						if (this.anInt947 != 0) {
							this.aBoolean246 = true;
						}
						if (this.anInt877 != 0) {
							this.aBoolean264 = true;
						}
					}
				}
				if (this.anInt1034 == 2) {
					this.method692();
				}
				if (this.anInt1034 == 2 && this.aBoolean266) {
					this.method700();
				}
				for (local860 = 0; local860 < 5; local860++) {
					@Pc(1020) int local1020 = this.anIntArray248[local860]++;
				}
				this.method644();
				super.anInt813++;
				if (super.anInt813 > 4500) {
					this.anInt963 = 250;
					super.anInt813 -= 500;
					this.aClass5_Sub1_Sub4_8.method426(145);
				}
				this.anInt844++;
				if (this.anInt844 > 500) {
					this.anInt844 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt928 += this.anInt929;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt1050 += this.anInt1051;
					}
					if ((local862 & 0x4) == 4) {
						this.anInt942 += this.anInt943;
					}
				}
				if (this.anInt928 < -50) {
					this.anInt929 = 2;
				}
				if (this.anInt928 > 50) {
					this.anInt929 = -2;
				}
				if (this.anInt1050 < -55) {
					this.anInt1051 = 2;
				}
				if (this.anInt1050 > 55) {
					this.anInt1051 = -2;
				}
				if (this.anInt942 < -40) {
					this.anInt943 = 1;
				}
				if (this.anInt942 > 40) {
					this.anInt943 = -1;
				}
				this.anInt931++;
				if (this.anInt931 > 500) {
					this.anInt931 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt886 += this.anInt887;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt937 += this.anInt938;
					}
				}
				if (this.anInt886 < -60) {
					this.anInt887 = 2;
				}
				if (this.anInt886 > 60) {
					this.anInt887 = -2;
				}
				if (this.anInt937 < -20) {
					this.anInt938 = 1;
				}
				if (this.anInt937 > 10) {
					this.anInt938 = -1;
				}
				this.anInt962++;
				if (this.anInt962 > 50) {
					this.aClass5_Sub1_Sub4_8.method426(214);
				}
				try {
					if (this.aClass1_1 != null && this.aClass5_Sub1_Sub4_8.anInt755 > 0) {
						this.aClass1_1.method5(this.aClass5_Sub1_Sub4_8.anInt755, this.aClass5_Sub1_Sub4_8.aByteArray20);
						this.aClass5_Sub1_Sub4_8.anInt755 = 0;
						this.anInt962 = 0;
					}
				} catch (@Pc(1272) IOException local1272) {
					this.method660();
				} catch (@Pc(1277) Exception local1277) {
					this.method658();
				}
			}
		} catch (@Pc(1282) RuntimeException local1282) {
			signlink.reporterror("41614, " + -891 + ", " + local1282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method608(@OriginalArg(1) boolean arg0) {
		try {
			this.method632();
			this.aClass10_21.method44();
			this.aClass5_Sub1_Sub2_Sub3_19.method326(0, 0);
			@Pc(55) byte local55;
			@Pc(67) int local67;
			if (this.anInt835 == 0) {
				this.aClass5_Sub1_Sub2_Sub1_2.method179(180, 180, this.aClass26_Sub1_1.aString8, 7711145, true);
				local55 = 80;
				this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 80, "Welcome to RuneScape", 16776960, true);
				local67 = local55 + 30;
				this.aClass5_Sub1_Sub2_Sub3_20.method326(100, 27);
				this.aClass5_Sub1_Sub2_Sub1_4.method179(100, 125, "New User", 16777215, true);
				this.aClass5_Sub1_Sub2_Sub3_20.method326(100, 187);
				this.aClass5_Sub1_Sub2_Sub1_4.method179(260, 125, "Existing User", 16777215, true);
			}
			if (this.anInt835 == 2) {
				local55 = 60;
				if (this.aString28.length() > 0) {
					this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 45, this.aString28, 16776960, true);
					this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 60, this.aString29, 16776960, true);
					local67 = local55 + 30;
				} else {
					this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 53, this.aString29, 16776960, true);
					local67 = local55 + 30;
				}
				this.aClass5_Sub1_Sub2_Sub1_4.method186("Username: " + this.aString24 + (this.anInt982 == 0 & anInt1022 % 40 < 20 ? "@yel@|" : ""), 90, 16777215, true, 90);
				local67 += 15;
				this.aClass5_Sub1_Sub2_Sub1_4.method186("Password: " + Class11.method52(this.aString25) + (this.anInt982 == 1 & anInt1022 % 40 < 20 ? "@yel@|" : ""), 92, 16777215, true, 105);
				local67 += 15;
				if (!arg0) {
					this.aClass5_Sub1_Sub2_Sub3_20.method326(130, 27);
					this.aClass5_Sub1_Sub2_Sub1_4.method179(100, 155, "Login", 16777215, true);
					this.aClass5_Sub1_Sub2_Sub3_20.method326(130, 187);
					this.aClass5_Sub1_Sub2_Sub1_4.method179(260, 155, "Cancel", 16777215, true);
				}
			}
			if (this.anInt835 == 3) {
				this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 40, "Create a free account", 16776960, true);
				local55 = 65;
				this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 65, "To create a new account you need to", 16777215, true);
				local67 = local55 + 15;
				this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 80, "go back to the main RuneScape webpage", 16777215, true);
				local67 += 15;
				this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 95, "and choose the 'create account'", 16777215, true);
				local67 += 15;
				this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 110, "button near the top of that page.", 16777215, true);
				local67 += 15;
				this.aClass5_Sub1_Sub2_Sub3_20.method326(130, 107);
				this.aClass5_Sub1_Sub2_Sub1_4.method179(180, 155, "Cancel", 16777215, true);
			}
			this.aClass10_21.method45(super.aGraphics2, 202, 171, this.anInt999);
			if (this.aBoolean249) {
				this.aBoolean249 = false;
				this.aClass10_19.method45(super.aGraphics2, 128, 0, this.anInt999);
				this.aClass10_20.method45(super.aGraphics2, 202, 371, this.anInt999);
				this.aClass10_24.method45(super.aGraphics2, 0, 265, this.anInt999);
				this.aClass10_25.method45(super.aGraphics2, 562, 265, this.anInt999);
				this.aClass10_26.method45(super.aGraphics2, 128, 171, this.anInt999);
				this.aClass10_27.method45(super.aGraphics2, 562, 171, this.anInt999);
			}
		} catch (@Pc(507) RuntimeException local507) {
			signlink.reporterror("31339, " + 8 + ", " + arg0 + ", " + local507.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!XGRGMPUQ;I)V")
	private void method609(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1026; local3++) {
				@Pc(10) int local10 = this.anIntArray265[local3];
				@Pc(15) Class5_Sub1_Sub1_Sub3_Sub1 local15 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local10];
				@Pc(18) int local18 = arg1.method437();
				@Pc(25) int local25;
				@Pc(29) int local29;
				if ((local18 & 0x10) != 0) {
					local25 = arg1.method437();
					local29 = arg1.method456();
					local15.method238(local29, anInt1022, local25);
					local15.anInt468 = anInt1022 + 300;
					local15.anInt469 = arg1.method456();
					local15.anInt470 = arg1.method456();
				}
				if ((local18 & 0x40) != 0) {
					local15.anInt499 = arg1.method439();
					local15.anInt500 = arg1.method464();
				}
				if ((local18 & 0x80) != 0) {
					local15.anInt487 = arg1.method465();
					local25 = arg1.method471();
					local15.anInt491 = local25 >> 16;
					local15.anInt490 = anInt1022 + (local25 & 0xFFFF);
					local15.anInt488 = 0;
					local15.anInt489 = 0;
					if (local15.anInt490 > anInt1022) {
						local15.anInt488 = -1;
					}
					if (local15.anInt487 == 65535) {
						local15.anInt487 = -1;
					}
				}
				if ((local18 & 0x1) != 0) {
					local15.anInt484 = arg1.method464();
					if (local15.anInt484 == 65535) {
						local15.anInt484 = -1;
					}
				}
				if ((local18 & 0x20) != 0) {
					local25 = arg1.method439();
					if (local25 == 65535) {
						local25 = -1;
					}
					local29 = arg1.method457(this.aBoolean234);
					if (local25 == local15.anInt463 && local25 != -1) {
						@Pc(153) int local153 = Class32.aClass32Array1[local25].anInt449;
						if (local153 == 1) {
							local15.anInt464 = 0;
							local15.anInt465 = 0;
							local15.anInt466 = local29;
							local15.anInt467 = 0;
						}
						if (local153 == 2) {
							local15.anInt467 = 0;
						}
					} else if (local25 == -1 || local15.anInt463 == -1 || Class32.aClass32Array1[local25].anInt443 >= Class32.aClass32Array1[local15.anInt463].anInt443) {
						local15.anInt463 = local25;
						local15.anInt464 = 0;
						local15.anInt465 = 0;
						local15.anInt466 = local29;
						local15.anInt467 = 0;
						local15.anInt485 = local15.anInt498;
					}
				}
				if ((local18 & 0x8) != 0) {
					local15.aClass24_1 = Class24.method160(arg1.method465());
					local15.anInt471 = local15.aClass24_1.aByte13;
					local15.anInt497 = local15.aClass24_1.anInt342;
					local15.anInt473 = local15.aClass24_1.anInt349;
					local15.anInt474 = local15.aClass24_1.anInt343;
					local15.anInt475 = local15.aClass24_1.anInt333;
					local15.anInt476 = local15.aClass24_1.anInt341;
					local15.anInt506 = local15.aClass24_1.anInt347;
				}
				if ((local18 & 0x4) != 0) {
					local25 = arg1.method457(this.aBoolean234);
					local29 = arg1.method457(this.aBoolean234);
					local15.method238(local29, anInt1022, local25);
					local15.anInt468 = anInt1022 + 300;
					local15.anInt469 = arg1.method455();
					local15.anInt470 = arg1.method437();
				}
				if ((local18 & 0x2) != 0) {
					local15.aString9 = arg1.method444();
					local15.anInt462 = 100;
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("57007, " + arg0 + ", " + arg1 + ", " + 55 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method610() {
		try {
			@Pc(4) Graphics local4 = this.method581().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method574();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean255) {
				this.aBoolean254 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local41 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local47 = local41 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(56) int local56 = local47 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(73) int local73 = local56 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(79) int local79 = local73 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(85) int local85 = local79 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(91) int local91 = local85 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean244) {
				this.aBoolean254 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean252) {
				this.aBoolean254 = false;
				local4.setColor(Color.yellow);
				local41 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local47 = local41 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local47 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local47 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local47 += 30;
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("48512, " + -111 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method611() {
		try {
			@Pc(11) byte[] local11 = this.aClass31_2.method227("title.dat", null);
			@Pc(17) Class5_Sub1_Sub2_Sub2 local17 = new Class5_Sub1_Sub2_Sub2(local11, this);
			this.aClass10_22.method44();
			local17.method274(0, 0);
			this.aClass10_23.method44();
			local17.method274(0, -637);
			this.aClass10_19.method44();
			local17.method274(0, -128);
			this.aClass10_20.method44();
			local17.method274(-371, -202);
			this.aClass10_21.method44();
			local17.method274(-171, -202);
			this.aClass10_24.method44();
			local17.method274(-265, 0);
			this.aClass10_25.method44();
			local17.method274(-265, -562);
			this.aClass10_26.method44();
			local17.method274(-171, -128);
			this.aClass10_27.method44();
			local17.method274(-171, -562);
			@Pc(102) int[] local102 = new int[local17.anInt578];
			for (@Pc(104) int local104 = 0; local104 < local17.anInt579; local104++) {
				for (@Pc(108) int local108 = 0; local108 < local17.anInt578; local108++) {
					local102[local108] = local17.anIntArray112[local17.anInt578 + local17.anInt578 * local104 - local108 - 1];
				}
				for (@Pc(134) int local134 = 0; local134 < local17.anInt578; local134++) {
					local17.anIntArray112[local134 + local17.anInt578 * local104] = local102[local134];
				}
			}
			this.aClass10_22.method44();
			local17.method274(0, 382);
			this.aClass10_23.method44();
			local17.method274(0, -255);
			this.aClass10_19.method44();
			local17.method274(0, 254);
			this.aClass10_20.method44();
			local17.method274(-371, 180);
			this.aClass10_21.method44();
			local17.method274(-171, 180);
			this.aClass10_24.method44();
			local17.method274(-265, 382);
			this.aClass10_25.method44();
			local17.method274(-265, -180);
			this.aClass10_26.method44();
			local17.method274(-171, 254);
			this.aClass10_27.method44();
			local17.method274(-171, -180);
			local17 = new Class5_Sub1_Sub2_Sub2(this.aClass31_2, "logo", 0);
			this.aClass10_19.method44();
			local17.method276(18, 382 - local17.anInt578 / 2 - 128);
			System.gc();
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("17692, " + true + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method612(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) int local10 = Class25.aClass25Array1[arg0].anInt386;
			if (local10 != 0) {
				@Pc(18) int local18 = this.anIntArray231[arg0];
				if (local10 == 1) {
					if (local18 == 1) {
						Class5_Sub1_Sub2_Sub4.method351(0.9D, (byte) 5);
					}
					if (local18 == 2) {
						Class5_Sub1_Sub2_Sub4.method351(0.8D, (byte) 5);
					}
					if (local18 == 3) {
						Class5_Sub1_Sub2_Sub4.method351(0.7D, (byte) 5);
					}
					if (local18 == 4) {
						Class5_Sub1_Sub2_Sub4.method351(0.6D, (byte) 5);
					}
					Class17.aClass12_5.method80();
					this.aBoolean249 = true;
				}
				if (local10 == 3) {
					@Pc(56) boolean local56 = this.aBoolean273;
					if (local18 == 0) {
						this.method604(this.aBoolean273, 0);
						this.aBoolean273 = true;
					}
					if (local18 == 1) {
						this.method604(this.aBoolean273, -400);
						this.aBoolean273 = true;
					}
					if (local18 == 2) {
						this.method604(this.aBoolean273, -800);
						this.aBoolean273 = true;
					}
					if (local18 == 3) {
						this.method604(this.aBoolean273, -1200);
						this.aBoolean273 = true;
					}
					if (local18 == 4) {
						this.aBoolean273 = false;
					}
					if (this.aBoolean273 != local56 && !aBoolean258) {
						if (this.aBoolean273) {
							this.anInt923 = this.anInt867;
							this.aBoolean248 = true;
							this.aClass26_Sub1_1.method206(2, this.anInt923);
						} else {
							this.method669();
						}
						this.anInt873 = 0;
					}
				}
				if (local10 == 4) {
					if (local18 == 0) {
						this.aBoolean259 = true;
						this.method637(0);
					}
					if (local18 == 1) {
						this.aBoolean259 = true;
						this.method637(-400);
					}
					if (local18 == 2) {
						this.aBoolean259 = true;
						this.method637(-800);
					}
					if (local18 == 3) {
						this.aBoolean259 = true;
						this.method637(-1200);
					}
					if (local18 == 4) {
						this.aBoolean259 = false;
					}
				}
				if (local10 == 5) {
					this.anInt1000 = local18;
				}
				if (local10 == 6) {
					this.anInt941 = local18;
				}
				if (local10 == 8) {
					this.anInt837 = local18;
					this.aBoolean246 = true;
				}
				if (local10 == 9) {
					this.anInt915 = local18;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("85041, " + arg0 + ", " + 5 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class42 local9 = this.aClass42ArrayArrayArray1[this.anInt948][arg0][arg1];
		if (local9 == null) {
			this.aClass48_1.method495(this.anInt948, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class5_Sub1_Sub1_Sub5 local23 = null;
		@Pc(27) Class5_Sub1_Sub1_Sub5 local27;
		for (local27 = (Class5_Sub1_Sub1_Sub5) local9.method299(); local27 != null; local27 = (Class5_Sub1_Sub1_Sub5) local9.method301(this.anInt1001)) {
			@Pc(32) Class17 local32 = Class17.method130(local27.anInt557);
			@Pc(35) int local35 = local32.anInt243;
			if (local32.aBoolean84) {
				local35 *= local27.anInt556 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method297(local23);
		@Pc(66) Class5_Sub1_Sub1_Sub5 local66 = null;
		@Pc(68) Class5_Sub1_Sub1_Sub5 local68 = null;
		for (local27 = (Class5_Sub1_Sub1_Sub5) local9.method299(); local27 != null; local27 = (Class5_Sub1_Sub1_Sub5) local9.method301(this.anInt1001)) {
			if (local27.anInt557 != local23.anInt557 && local66 == null) {
				local66 = local27;
			}
			if (local27.anInt557 != local23.anInt557 && local27.anInt557 != local66.anInt557 && local68 == null) {
				local68 = local27;
			}
		}
		@Pc(112) int local112 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass48_1.method481(local66, local23, arg1, arg0, this.method631(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt948), local112, this.anInt948, local68);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method614() {
		try {
			if (this.anInt869 == 0 && this.anInt882 == 0) {
				this.aStringArray13[this.anInt881] = "Walk here";
				this.anIntArray274[this.anInt881] = 765;
				this.anIntArray272[this.anInt881] = super.anInt815;
				this.anIntArray273[this.anInt881] = super.anInt816;
				this.anInt881++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class5_Sub1_Sub1_Sub6.anInt702; local43++) {
				@Pc(49) int local49 = Class5_Sub1_Sub1_Sub6.anIntArray171[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass48_1.method504(this.anInt948, local53, local59, local49) >= 0) {
						@Pc(91) Class8 local91 = Class8.method40(local71);
						if (local91.anIntArray13 != null) {
							local91 = local91.method33();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt869 == 1) {
							this.aStringArray13[this.anInt881] = "Use " + this.aString18 + " with @cya@" + local91.aString1;
							this.anIntArray274[this.anInt881] = 906;
							this.anIntArray275[this.anInt881] = local49;
							this.anIntArray272[this.anInt881] = local53;
							this.anIntArray273[this.anInt881] = local59;
							this.anInt881++;
						} else if (this.anInt882 != 1) {
							if (local91.aStringArray1 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray1[local218] != null) {
										this.aStringArray13[this.anInt881] = local91.aStringArray1[local218] + " @cya@" + local91.aString1;
										if (local218 == 0) {
											this.anIntArray274[this.anInt881] = 579;
										}
										if (local218 == 1) {
											this.anIntArray274[this.anInt881] = 179;
										}
										if (local218 == 2) {
											this.anIntArray274[this.anInt881] = 109;
										}
										if (local218 == 3) {
											this.anIntArray274[this.anInt881] = 186;
										}
										if (local218 == 4) {
											this.anIntArray274[this.anInt881] = 1802;
										}
										this.anIntArray275[this.anInt881] = local49;
										this.anIntArray272[this.anInt881] = local53;
										this.anIntArray273[this.anInt881] = local59;
										this.anInt881++;
									}
								}
							}
							this.aStringArray13[this.anInt881] = "Examine @cya@" + local91.aString1;
							this.anIntArray274[this.anInt881] = 1836;
							this.anIntArray275[this.anInt881] = local91.anInt58 << 14;
							this.anIntArray272[this.anInt881] = local53;
							this.anIntArray273[this.anInt881] = local59;
							this.anInt881++;
						} else if ((this.anInt884 & 0x4) == 4) {
							this.aStringArray13[this.anInt881] = this.aString19 + " @cya@" + local91.aString1;
							this.anIntArray274[this.anInt881] = 450;
							this.anIntArray275[this.anInt881] = local49;
							this.anIntArray272[this.anInt881] = local53;
							this.anIntArray273[this.anInt881] = local59;
							this.anInt881++;
						}
					}
					@Pc(398) Class5_Sub1_Sub1_Sub3_Sub1 local398;
					@Pc(446) Class5_Sub1_Sub1_Sub3_Sub2 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class5_Sub1_Sub1_Sub3_Sub1 local369 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local71];
						if (local369.aClass24_1.aByte13 == 1 && (local369.anInt501 & 0x7F) == 64 && (local369.anInt502 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt849; local218++) {
								local398 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray214[local218]];
								if (local398 != null && local398 != local369 && local398.aClass24_1.aByte13 == 1 && local398.anInt501 == local369.anInt501 && local398.anInt502 == local369.anInt502) {
									this.method713(this.anIntArray214[local218], local53, local398.aClass24_1, 55, local59);
								}
							}
							for (local436 = 0; local436 < this.anInt1025; local436++) {
								local446 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray264[local436]];
								if (local446 != null && local446.anInt501 == local369.anInt501 && local446.anInt502 == local369.anInt502) {
									this.method677(local59, local53, this.anIntArray264[local436], local446);
								}
							}
						}
						this.method713(local71, local53, local369.aClass24_1, 55, local59);
					}
					if (local65 == 0) {
						@Pc(488) Class5_Sub1_Sub1_Sub3_Sub2 local488 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local71];
						if ((local488.anInt501 & 0x7F) == 64 && (local488.anInt502 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt849; local218++) {
								local398 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray214[local218]];
								if (local398 != null && local398.aClass24_1.aByte13 == 1 && local398.anInt501 == local488.anInt501 && local398.anInt502 == local488.anInt502) {
									this.method713(this.anIntArray214[local218], local53, local398.aClass24_1, 55, local59);
								}
							}
							for (local436 = 0; local436 < this.anInt1025; local436++) {
								local446 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray264[local436]];
								if (local446 != null && local446 != local488 && local446.anInt501 == local488.anInt501 && local446.anInt502 == local488.anInt502) {
									this.method677(local59, local53, this.anIntArray264[local436], local446);
								}
							}
						}
						this.method677(local59, local53, local71, local488);
					}
					if (local65 == 3) {
						@Pc(607) Class42 local607 = this.aClass42ArrayArrayArray1[this.anInt948][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class5_Sub1_Sub1_Sub5 local614 = (Class5_Sub1_Sub1_Sub5) local607.method300(); local614 != null; local614 = (Class5_Sub1_Sub1_Sub5) local607.method302()) {
								@Pc(620) Class17 local620 = Class17.method130(local614.anInt557);
								if (this.anInt869 == 1) {
									this.aStringArray13[this.anInt881] = "Use " + this.aString18 + " with @lre@" + local620.aString4;
									this.anIntArray274[this.anInt881] = 675;
									this.anIntArray275[this.anInt881] = local614.anInt557;
									this.anIntArray272[this.anInt881] = local53;
									this.anIntArray273[this.anInt881] = local59;
									this.anInt881++;
								} else if (this.anInt882 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray2 != null && local620.aStringArray2[local737] != null) {
											this.aStringArray13[this.anInt881] = local620.aStringArray2[local737] + " @lre@" + local620.aString4;
											if (local737 == 0) {
												this.anIntArray274[this.anInt881] = 228;
											}
											if (local737 == 1) {
												this.anIntArray274[this.anInt881] = 330;
											}
											if (local737 == 2) {
												this.anIntArray274[this.anInt881] = 162;
											}
											if (local737 == 3) {
												this.anIntArray274[this.anInt881] = 916;
											}
											if (local737 == 4) {
												this.anIntArray274[this.anInt881] = 790;
											}
											this.anIntArray275[this.anInt881] = local614.anInt557;
											this.anIntArray272[this.anInt881] = local53;
											this.anIntArray273[this.anInt881] = local59;
											this.anInt881++;
										} else if (local737 == 2) {
											this.aStringArray13[this.anInt881] = "Take @lre@" + local620.aString4;
											this.anIntArray274[this.anInt881] = 162;
											this.anIntArray275[this.anInt881] = local614.anInt557;
											this.anIntArray272[this.anInt881] = local53;
											this.anIntArray273[this.anInt881] = local59;
											this.anInt881++;
										}
									}
									this.aStringArray13[this.anInt881] = "Examine @lre@" + local620.aString4;
									this.anIntArray274[this.anInt881] = 1918;
									this.anIntArray275[this.anInt881] = local614.anInt557;
									this.anIntArray272[this.anInt881] = local53;
									this.anIntArray273[this.anInt881] = local59;
									this.anInt881++;
								} else if ((this.anInt884 & 0x1) == 1) {
									this.aStringArray13[this.anInt881] = this.aString19 + " @lre@" + local620.aString4;
									this.anIntArray274[this.anInt881] = 453;
									this.anIntArray275[this.anInt881] = local614.anInt557;
									this.anIntArray272[this.anInt881] = local53;
									this.anIntArray273[this.anInt881] = local59;
									this.anInt881++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(955) RuntimeException local955) {
			signlink.reporterror("91550, " + -883 + ", " + local955.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method615() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt1025; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt1024;
				} else {
					local11 = this.anIntArray264[local3];
				}
				@Pc(23) Class5_Sub1_Sub1_Sub3_Sub2 local23 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null) {
					this.method597(local23, 1);
				}
			}
			if (this.anInt857 != -17431) {
				this.aClass42ArrayArrayArray1 = null;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("63400, " + -17431 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method616() {
		try {
			this.anInt1020 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt1025 + this.anInt849; local6++) {
				@Pc(13) Class5_Sub1_Sub1_Sub3 local13;
				if (local6 == -1) {
					local13 = aClass5_Sub1_Sub1_Sub3_Sub2_1;
				} else if (local6 < this.anInt1025) {
					local13 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray264[local6]];
				} else {
					local13 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray214[local6 - this.anInt1025]];
				}
				if (local13 != null && local13.method236()) {
					@Pc(54) Class24 local54;
					if (local13 instanceof Class5_Sub1_Sub1_Sub3_Sub1) {
						local54 = ((Class5_Sub1_Sub1_Sub3_Sub1) local13).aClass24_1;
						if (local54.anIntArray61 != null) {
							local54 = local54.method155((byte) 9);
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt1025) {
						local54 = ((Class5_Sub1_Sub1_Sub3_Sub1) local13).aClass24_1;
						if (local54.anInt345 >= 0 && local54.anInt345 < this.aClass5_Sub1_Sub2_Sub2Array5.length) {
							this.method711(local13, local13.anInt508 + 15);
							if (this.anInt889 > -1) {
								this.aClass5_Sub1_Sub2_Sub2Array5[local54.anInt345].method276(this.anInt890 - 30, this.anInt889 - 12);
							}
						}
						if (this.anInt875 == 1 && this.anInt851 == this.anIntArray214[local6 - this.anInt1025] && anInt1022 % 20 < 10) {
							this.method711(local13, local13.anInt508 + 15);
							if (this.anInt889 > -1) {
								this.aClass5_Sub1_Sub2_Sub2Array7[0].method276(this.anInt890 - 28, this.anInt889 - 12);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class5_Sub1_Sub1_Sub3_Sub2 local73 = (Class5_Sub1_Sub1_Sub3_Sub2) local13;
						if (local73.anInt528 != -1 || local73.anInt527 != -1) {
							this.method711(local13, local13.anInt508 + 15);
							if (this.anInt889 > -1) {
								if (local73.anInt528 != -1) {
									this.aClass5_Sub1_Sub2_Sub2Array4[local73.anInt528].method276(this.anInt890 - 30, this.anInt889 - 12);
									local70 += 25;
								}
								if (local73.anInt527 != -1) {
									this.aClass5_Sub1_Sub2_Sub2Array5[local73.anInt527].method276(this.anInt890 - local70, this.anInt889 - 12);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt875 == 10 && this.anInt894 == this.anIntArray264[local6]) {
							this.method711(local13, local13.anInt508 + 15);
							if (this.anInt889 > -1) {
								this.aClass5_Sub1_Sub2_Sub2Array7[1].method276(this.anInt890 - local70, this.anInt889 - 12);
							}
						}
					}
					if (local13.aString9 != null && (local6 >= this.anInt1025 || this.anInt833 == 0 || this.anInt833 == 3 || this.anInt833 == 1 && this.method719(((Class5_Sub1_Sub1_Sub3_Sub2) local13).aString10))) {
						this.method711(local13, local13.anInt508);
						if (this.anInt889 > -1 && this.anInt1020 < this.anInt1021) {
							this.anIntArray260[this.anInt1020] = this.aClass5_Sub1_Sub2_Sub1_4.method181(local13.aString9) / 2;
							this.anIntArray259[this.anInt1020] = this.aClass5_Sub1_Sub2_Sub1_4.anInt369;
							this.anIntArray257[this.anInt1020] = this.anInt889;
							this.anIntArray258[this.anInt1020] = this.anInt890;
							this.anIntArray261[this.anInt1020] = local13.anInt492;
							this.anIntArray262[this.anInt1020] = local13.anInt504;
							this.anIntArray263[this.anInt1020] = local13.anInt462;
							this.aStringArray12[this.anInt1020++] = local13.aString9;
							if (this.anInt941 == 0 && local13.anInt504 >= 1 && local13.anInt504 <= 3) {
								this.anIntArray259[this.anInt1020] += 10;
								this.anIntArray258[this.anInt1020] += 5;
							}
							if (this.anInt941 == 0 && local13.anInt504 == 4) {
								this.anIntArray260[this.anInt1020] = 60;
							}
							if (this.anInt941 == 0 && local13.anInt504 == 5) {
								this.anIntArray259[this.anInt1020] += 5;
							}
						}
					}
					if (local13.anInt468 > anInt1022) {
						this.method711(local13, local13.anInt508 + 15);
						if (this.anInt889 > -1) {
							local70 = local13.anInt469 * 30 / local13.anInt470;
							if (local70 > 30) {
								local70 = 30;
							}
							Class5_Sub1_Sub2.method335(this.anInt890 - 3, 65280, this.anInt889 - 15, local70, 5);
							Class5_Sub1_Sub2.method335(this.anInt890 - 3, 16711680, this.anInt889 + local70 - 15, 30 - local70, 5);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray103[local70] > anInt1022) {
							this.method711(local13, local13.anInt508 / 2);
							if (this.anInt889 > -1) {
								if (local70 == 1) {
									this.anInt890 -= 20;
								}
								if (local70 == 2) {
									this.anInt889 -= 15;
									this.anInt890 -= 10;
								}
								if (local70 == 3) {
									this.anInt889 += 15;
									this.anInt890 -= 10;
								}
								this.aClass5_Sub1_Sub2_Sub2Array6[local13.anIntArray102[local70]].method276(this.anInt890 - 12, this.anInt889 - 12);
								this.aClass5_Sub1_Sub2_Sub1_2.method178(String.valueOf(local13.anIntArray101[local70]), 0, this.anInt890 + 4, this.anInt889);
								this.aClass5_Sub1_Sub2_Sub1_2.method178(String.valueOf(local13.anIntArray101[local70]), 16777215, this.anInt890 + 3, this.anInt889 - 1);
							}
						}
					}
				}
			}
			for (@Pc(610) int local610 = 0; local610 < this.anInt1020; local610++) {
				local70 = this.anIntArray257[local610];
				@Pc(622) int local622 = this.anIntArray258[local610];
				@Pc(627) int local627 = this.anIntArray260[local610];
				@Pc(632) int local632 = this.anIntArray259[local610];
				@Pc(634) boolean local634 = true;
				while (local634) {
					local634 = false;
					for (@Pc(640) int local640 = 0; local640 < local610; local640++) {
						if (local622 + 2 > this.anIntArray258[local640] - this.anIntArray259[local640] && local622 - local632 < this.anIntArray258[local640] + 2 && local70 - local627 < this.anIntArray257[local640] + this.anIntArray260[local640] && local70 + local627 > this.anIntArray257[local640] - this.anIntArray260[local640] && this.anIntArray258[local640] - this.anIntArray259[local640] < local622) {
							local622 = this.anIntArray258[local640] - this.anIntArray259[local640];
							local634 = true;
						}
					}
				}
				this.anInt889 = this.anIntArray257[local610];
				this.anInt890 = this.anIntArray258[local610] = local622;
				@Pc(739) String local739 = this.aStringArray12[local610];
				if (this.anInt941 == 0) {
					@Pc(744) int local744 = 16776960;
					if (this.anIntArray261[local610] < 6) {
						local744 = this.anIntArray216[this.anIntArray261[local610]];
					}
					if (this.anIntArray261[local610] == 6) {
						local744 = this.anInt1018 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray261[local610] == 7) {
						local744 = this.anInt1018 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray261[local610] == 8) {
						local744 = this.anInt1018 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(819) int local819;
					if (this.anIntArray261[local610] == 9) {
						local819 = 150 - this.anIntArray263[local610];
						if (local819 < 50) {
							local744 = local819 * 1280 + 16711680;
						} else if (local819 < 100) {
							local744 = 16776960 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray261[local610] == 10) {
						local819 = 150 - this.anIntArray263[local610];
						if (local819 < 50) {
							local744 = local819 * 5 + 16711680;
						} else if (local819 < 100) {
							local744 = 16711935 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 327680 + 255 - (local819 - 100) * 5;
						}
					}
					if (this.anIntArray261[local610] == 11) {
						local819 = 150 - this.anIntArray263[local610];
						if (local819 < 50) {
							local744 = 16777215 - local819 * 327685;
						} else if (local819 < 100) {
							local744 = (local819 - 50) * 327685 + 65280;
						} else if (local819 < 150) {
							local744 = 16777215 - (local819 - 100) * 327680;
						}
					}
					if (this.anIntArray262[local610] == 0) {
						this.aClass5_Sub1_Sub2_Sub1_4.method178(local739, 0, this.anInt890 + 1, this.anInt889);
						this.aClass5_Sub1_Sub2_Sub1_4.method178(local739, local744, this.anInt890, this.anInt889);
					}
					if (this.anIntArray262[local610] == 1) {
						this.aClass5_Sub1_Sub2_Sub1_4.method183(0, this.anInt1018, this.anInt889, local739, this.anInt890 + 1);
						this.aClass5_Sub1_Sub2_Sub1_4.method183(local744, this.anInt1018, this.anInt889, local739, this.anInt890);
					}
					if (this.anIntArray262[local610] == 2) {
						this.aClass5_Sub1_Sub2_Sub1_4.method184(local739, this.anInt889, 0, this.anInt1018, this.anInt890 + 1);
						this.aClass5_Sub1_Sub2_Sub1_4.method184(local739, this.anInt889, local744, this.anInt1018, this.anInt890);
					}
					if (this.anIntArray262[local610] == 3) {
						this.aClass5_Sub1_Sub2_Sub1_4.method185(this.anInt890 + 1, this.anInt1018, local739, this.anInt889, 0, 150 - this.anIntArray263[local610], (byte) 3);
						this.aClass5_Sub1_Sub2_Sub1_4.method185(this.anInt890, this.anInt1018, local739, this.anInt889, local744, 150 - this.anIntArray263[local610], (byte) 3);
					}
					@Pc(1116) int local1116;
					if (this.anIntArray262[local610] == 4) {
						local819 = this.aClass5_Sub1_Sub2_Sub1_4.method181(local739);
						local1116 = (150 - this.anIntArray263[local610]) * (local819 + 100) / 150;
						Class5_Sub1_Sub2.method332(this.anInt889 - 50, 334, 0, this.anInt889 + 50);
						this.aClass5_Sub1_Sub2_Sub1_4.method182(this.anInt890 + 1, this.anInt889 + 50 - local1116, 0, local739, (byte) 6);
						this.aClass5_Sub1_Sub2_Sub1_4.method182(this.anInt890, this.anInt889 + 50 - local1116, local744, local739, (byte) 6);
						Class5_Sub1_Sub2.method331();
					}
					if (this.anIntArray262[local610] == 5) {
						local819 = 150 - this.anIntArray263[local610];
						local1116 = 0;
						if (local819 < 25) {
							local1116 = local819 - 25;
						} else if (local819 > 125) {
							local1116 = local819 - 125;
						}
						Class5_Sub1_Sub2.method332(0, this.anInt890 + 5, this.anInt890 - this.aClass5_Sub1_Sub2_Sub1_4.anInt369 - 1, 512);
						this.aClass5_Sub1_Sub2_Sub1_4.method178(local739, 0, this.anInt890 + local1116 + 1, this.anInt889);
						this.aClass5_Sub1_Sub2_Sub1_4.method178(local739, local744, this.anInt890 + local1116, this.anInt889);
						Class5_Sub1_Sub2.method331();
					}
				} else {
					this.aClass5_Sub1_Sub2_Sub1_4.method178(local739, 0, this.anInt890 + 1, this.anInt889);
					this.aClass5_Sub1_Sub2_Sub1_4.method178(local739, 16776960, this.anInt890, this.anInt889);
				}
			}
		} catch (@Pc(1272) RuntimeException local1272) {
			signlink.reporterror("91592, " + 27355 + ", " + local1272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XGRGMPUQ;BI)V")
	private void method617(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) int local16;
			@Pc(20) int local20;
			@Pc(43) int local43;
			@Pc(50) int local50;
			@Pc(24) int local24;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (arg2 == 45) {
				local16 = arg0.method456();
				local20 = local16 >> 2;
				local24 = local16 & 0x3;
				local29 = this.anIntArray232[local20];
				local34 = arg0.method457(this.aBoolean234);
				local43 = this.anInt1015 + (local34 >> 4 & 0x7);
				local50 = this.anInt1016 + (local34 & 0x7);
				if (local43 >= 0 && local50 >= 0 && local43 < 104 && local50 < 104) {
					this.method636(-1, local20, this.anInt948, local43, local50, (byte) 2, 0, -1, local24, local29);
				}
			} else if (arg2 == 196) {
				local16 = arg0.method439();
				local20 = arg0.method465();
				local24 = arg0.method464();
				local29 = arg0.method457(this.aBoolean234);
				local34 = this.anInt1015 + (local29 >> 4 & 0x7);
				local43 = this.anInt1016 + (local29 & 0x7);
				if (local34 >= 0 && local43 >= 0 && local34 < 104 && local43 < 104 && local16 != this.anInt898) {
					@Pc(127) Class5_Sub1_Sub1_Sub5 local127 = new Class5_Sub1_Sub1_Sub5();
					local127.anInt557 = local24;
					local127.anInt556 = local20;
					if (this.aClass42ArrayArrayArray1[this.anInt948][local34][local43] == null) {
						this.aClass42ArrayArrayArray1[this.anInt948][local34][local43] = new Class42((byte) 0);
					}
					this.aClass42ArrayArrayArray1[this.anInt948][local34][local43].method296(local127);
					this.method613(local34, local43);
				}
			} else {
				@Pc(211) int local211;
				@Pc(218) int local218;
				@Pc(226) int local226;
				@Pc(229) int local229;
				@Pc(233) int local233;
				@Pc(237) int local237;
				if (arg2 == 157) {
					local16 = arg0.method463();
					local20 = arg0.method464();
					@Pc(186) byte local186 = arg0.method438();
					@Pc(190) byte local190 = arg0.method459();
					@Pc(194) byte local194 = arg0.method459();
					local43 = arg0.method464();
					local50 = arg0.method455();
					local211 = this.anInt1015 + (local50 >> 4 & 0x7);
					local218 = this.anInt1016 + (local50 & 0x7);
					@Pc(222) byte local222 = arg0.method458();
					local226 = arg0.method465();
					local229 = arg0.method437();
					local233 = local229 >> 2;
					local237 = local229 & 0x3;
					@Pc(242) int local242 = this.anIntArray232[local233];
					@Pc(248) Class5_Sub1_Sub1_Sub3_Sub2 local248;
					if (local16 == this.anInt898) {
						local248 = aClass5_Sub1_Sub1_Sub3_Sub2_1;
					} else {
						local248 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local16];
					}
					if (local248 != null) {
						@Pc(260) Class8 local260 = Class8.method40(local43);
						@Pc(270) int local270 = this.anIntArrayArrayArray7[this.anInt948][local211][local218];
						@Pc(282) int local282 = this.anIntArrayArrayArray7[this.anInt948][local211 + 1][local218];
						@Pc(296) int local296 = this.anIntArrayArrayArray7[this.anInt948][local211 + 1][local218 + 1];
						@Pc(308) int local308 = this.anIntArrayArrayArray7[this.anInt948][local211][local218 + 1];
						@Pc(318) Class5_Sub1_Sub1_Sub6 local318 = local260.method37(local233, local237, local270, local282, local296, local308, -1);
						if (local318 != null) {
							this.method636(-1, 0, this.anInt948, local211, local218, (byte) 2, local20 + 1, local226 + 1, 0, local242);
							local248.anInt525 = local20 + anInt1022;
							local248.anInt526 = local226 + anInt1022;
							local248.aClass5_Sub1_Sub1_Sub6_1 = local318;
							@Pc(353) int local353 = local260.anInt45;
							@Pc(356) int local356 = local260.anInt53;
							if (local237 == 1 || local237 == 3) {
								local353 = local260.anInt53;
								local356 = local260.anInt45;
							}
							local248.anInt520 = local211 * 128 + local353 * 64;
							local248.anInt522 = local218 * 128 + local356 * 64;
							local248.anInt521 = this.method631(local248.anInt520, local248.anInt522, this.anInt948);
							@Pc(402) byte local402;
							if (local190 > local222) {
								local402 = local190;
								local190 = local222;
								local222 = local402;
							}
							if (local194 > local186) {
								local402 = local194;
								local194 = local186;
								local186 = local402;
							}
							local248.anInt513 = local211 + local190;
							local248.anInt515 = local211 + local222;
							local248.anInt514 = local218 + local194;
							local248.anInt516 = local218 + local186;
						}
					}
				}
				if (arg2 == 81) {
					local16 = arg0.method437();
					local20 = this.anInt1015 + (local16 >> 4 & 0x7);
					local24 = this.anInt1016 + (local16 & 0x7);
					local29 = arg0.method439();
					local34 = arg0.method439();
					local43 = arg0.method439();
					if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
						@Pc(486) Class42 local486 = this.aClass42ArrayArrayArray1[this.anInt948][local20][local24];
						if (local486 != null) {
							for (@Pc(492) Class5_Sub1_Sub1_Sub5 local492 = (Class5_Sub1_Sub1_Sub5) local486.method299(); local492 != null; local492 = (Class5_Sub1_Sub1_Sub5) local486.method301(this.anInt1001)) {
								if (local492.anInt557 == (local29 & 0x7FFF) && local492.anInt556 == local34) {
									local492.anInt556 = local43;
									break;
								}
							}
							this.method613(local20, local24);
						}
					}
				} else {
					@Pc(597) int local597;
					if (arg2 == 163) {
						local16 = arg0.method439();
						local20 = arg0.method456();
						local24 = this.anInt1015 + (local20 >> 4 & 0x7);
						local29 = this.anInt1016 + (local20 & 0x7);
						local34 = arg0.method456();
						local43 = local34 >> 2;
						local50 = local34 & 0x3;
						local211 = this.anIntArray232[local43];
						if (local24 >= 0 && local29 >= 0 && local24 < 103 && local29 < 103) {
							local218 = this.anIntArrayArrayArray7[this.anInt948][local24][local29];
							local597 = this.anIntArrayArrayArray7[this.anInt948][local24 + 1][local29];
							local226 = this.anIntArrayArrayArray7[this.anInt948][local24 + 1][local29 + 1];
							local229 = this.anIntArrayArrayArray7[this.anInt948][local24][local29 + 1];
							if (local211 == 0) {
								@Pc(634) Class28 local634 = this.aClass48_1.method496(local29, this.anInt948, local24, 870);
								if (local634 != null) {
									local237 = local634.anInt417 >> 14 & 0x7FFF;
									if (local43 == 2) {
										local634.aClass5_Sub1_Sub1_5 = new Class5_Sub1_Sub1_Sub1(local226, local218, local237, local597, false, 2, 0, local50 + 4, local16, local229);
										local634.aClass5_Sub1_Sub1_6 = new Class5_Sub1_Sub1_Sub1(local226, local218, local237, local597, false, 2, 0, local50 + 1 & 0x3, local16, local229);
									} else {
										local634.aClass5_Sub1_Sub1_5 = new Class5_Sub1_Sub1_Sub1(local226, local218, local237, local597, false, local43, 0, local50, local16, local229);
									}
								}
							}
							if (local211 == 1) {
								@Pc(711) Class34 local711 = this.aClass48_1.method497(this.anInt948, local24, local29);
								if (local711 != null) {
									local711.aClass5_Sub1_Sub1_7 = new Class5_Sub1_Sub1_Sub1(local226, local218, local711.anInt458 >> 14 & 0x7FFF, local597, false, 4, 0, 0, local16, local229);
								}
							}
							if (local211 == 2) {
								@Pc(745) Class23 local745 = this.aClass48_1.method498(local29, this.anInt948, local24);
								if (local43 == 11) {
									local43 = 10;
								}
								if (local745 != null) {
									local745.aClass5_Sub1_Sub1_4 = new Class5_Sub1_Sub1_Sub1(local226, local218, local745.anInt332 >> 14 & 0x7FFF, local597, false, local43, 0, local50, local16, local229);
								}
							}
							if (local211 == 3) {
								@Pc(784) Class43 local784 = this.aClass48_1.method499(local29, this.anInt948, local24);
								if (local784 != null) {
									local784.aClass5_Sub1_Sub1_8 = new Class5_Sub1_Sub1_Sub1(local226, local218, local784.anInt597 >> 14 & 0x7FFF, local597, false, 22, 0, local50, local16, local229);
								}
							}
						}
					} else {
						@Pc(861) Class5_Sub1_Sub1_Sub5 local861;
						if (arg2 == 12) {
							local16 = arg0.method457(this.aBoolean234);
							local20 = this.anInt1015 + (local16 >> 4 & 0x7);
							local24 = this.anInt1016 + (local16 & 0x7);
							local29 = arg0.method464();
							if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
								@Pc(855) Class42 local855 = this.aClass42ArrayArrayArray1[this.anInt948][local20][local24];
								if (local855 != null) {
									for (local861 = (Class5_Sub1_Sub1_Sub5) local855.method299(); local861 != null; local861 = (Class5_Sub1_Sub1_Sub5) local855.method301(this.anInt1001)) {
										if (local861.anInt557 == (local29 & 0x7FFF)) {
											local861.method423();
											break;
										}
									}
									if (local855.method299() == null) {
										this.aClass42ArrayArrayArray1[this.anInt948][local20][local24] = null;
									}
									this.method613(local20, local24);
								}
							}
						} else if (arg2 == 129) {
							local16 = arg0.method464();
							local20 = arg0.method465();
							local24 = arg0.method437();
							local29 = this.anInt1015 + (local24 >> 4 & 0x7);
							local34 = this.anInt1016 + (local24 & 0x7);
							if (local29 >= 0 && local34 >= 0 && local29 < 104 && local34 < 104) {
								local861 = new Class5_Sub1_Sub1_Sub5();
								local861.anInt557 = local20;
								local861.anInt556 = local16;
								if (this.aClass42ArrayArrayArray1[this.anInt948][local29][local34] == null) {
									this.aClass42ArrayArrayArray1[this.anInt948][local29][local34] = new Class42((byte) 0);
								}
								this.aClass42ArrayArrayArray1[this.anInt948][local29][local34].method296(local861);
								this.method613(local29, local34);
							}
						} else {
							if (arg2 == 237) {
								local16 = arg0.method437();
								local20 = this.anInt1015 + (local16 >> 4 & 0x7);
								local24 = this.anInt1016 + (local16 & 0x7);
								local29 = arg0.method439();
								local34 = arg0.method437();
								local43 = local34 >> 4 & 0xF;
								local50 = local34 & 0x7;
								if (aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0] >= local20 - local43 && aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0] <= local20 + local43 && aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0] >= local24 - local43 && aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0] <= local24 + local43 && this.aBoolean259 && !aBoolean258 && this.anInt891 < 50) {
									this.anIntArray228[this.anInt891] = local29;
									this.anIntArray217[this.anInt891] = local50;
									this.anIntArray233[this.anInt891] = Class38.anIntArray110[local29];
									this.anInt891++;
								}
							}
							if (arg2 == 143) {
								local16 = arg0.method437();
								local20 = this.anInt1015 + (local16 >> 4 & 0x7);
								local24 = this.anInt1016 + (local16 & 0x7);
								local29 = local20 + arg0.method438();
								local34 = local24 + arg0.method438();
								local43 = arg0.method440();
								local50 = arg0.method439();
								local211 = arg0.method437() * 4;
								local218 = arg0.method437() * 4;
								local597 = arg0.method439();
								local226 = arg0.method439();
								local229 = arg0.method437();
								local233 = arg0.method437();
								if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104 && local29 >= 0 && local34 >= 0 && local29 < 104 && local34 < 104 && local50 != 65535) {
									local20 = local20 * 128 + 64;
									local24 = local24 * 128 + 64;
									local29 = local29 * 128 + 64;
									local34 = local34 * 128 + 64;
									@Pc(1229) Class5_Sub1_Sub1_Sub2 local1229 = new Class5_Sub1_Sub1_Sub2(local20, this.method631(local20, local24, this.anInt948) - local211, local229, 9330, local226 + anInt1022, local233, local43, local218, this.anInt948, local597 + anInt1022, local50, local24);
									local1229.method57(local29, this.method631(local29, local34, this.anInt948) - local218, local597 + anInt1022, local34);
									this.aClass42_11.method296(local1229);
								}
							} else if (arg2 == 180) {
								local16 = arg0.method437();
								local20 = this.anInt1015 + (local16 >> 4 & 0x7);
								local24 = this.anInt1016 + (local16 & 0x7);
								local29 = arg0.method439();
								local34 = arg0.method437();
								local43 = arg0.method439();
								if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
									local20 = local20 * 128 + 64;
									local24 = local24 * 128 + 64;
									@Pc(1325) Class5_Sub1_Sub1_Sub4 local1325 = new Class5_Sub1_Sub1_Sub4(this.anInt948, 680, local24, anInt1022, local20, local43, this.method631(local20, local24, this.anInt948) - local34, local29);
									this.aClass42_10.method296(local1325);
								}
							} else if (arg2 == 68) {
								local16 = arg0.method439();
								local20 = arg0.method437();
								local24 = local20 >> 2;
								local29 = local20 & 0x3;
								local34 = this.anIntArray232[local24];
								local43 = arg0.method455();
								local50 = this.anInt1015 + (local43 >> 4 & 0x7);
								local211 = this.anInt1016 + (local43 & 0x7);
								if (local50 >= 0 && local211 >= 0 && local50 < 104 && local211 < 104) {
									this.method636(local16, local24, this.anInt948, local50, local211, (byte) 2, 0, -1, local29, local34);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1397) RuntimeException local1397) {
			signlink.reporterror("22963, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!XGRGMPUQ;)V")
	private void method618(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			this.anInt1017 = 0;
			this.anInt1026 = 0;
			this.method626(arg1, arg0);
			this.method627(arg1, arg0);
			this.method609(arg0, arg1);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt1017; local28++) {
				local35 = this.anIntArray256[local28];
				if (this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local35].anInt461 != anInt1022) {
					this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local35].aClass24_1 = null;
					this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local35] = null;
				}
			}
			if (arg1.anInt755 != arg0) {
				signlink.reporterror(this.aString24 + " size mismatch in getnpcpos - pos:" + arg1.anInt755 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt849; local35++) {
				if (this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray214[local35]] == null) {
					signlink.reporterror(this.aString24 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt849);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("31393, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method619(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) Class5_Sub1_Sub1_Sub2 local6 = (Class5_Sub1_Sub1_Sub2) this.aClass42_11.method299();
			@Pc(10) boolean local10 = false;
			while (local6 != null) {
				if (local6.anInt86 != this.anInt948 || anInt1022 > local6.anInt77) {
					local6.method423();
				} else if (anInt1022 >= local6.anInt76) {
					if (local6.anInt89 > 0) {
						@Pc(40) Class5_Sub1_Sub1_Sub3_Sub1 local40 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local6.anInt89 - 1];
						if (local40 != null && local40.anInt501 >= 0 && local40.anInt501 < 13312 && local40.anInt502 >= 0 && local40.anInt502 < 13312) {
							local6.method57(local40.anInt501, this.method631(local40.anInt501, local40.anInt502, local6.anInt86) - local6.anInt81, anInt1022, local40.anInt502);
						}
					}
					if (local6.anInt89 < 0) {
						@Pc(85) int local85 = -local6.anInt89 - 1;
						@Pc(91) Class5_Sub1_Sub1_Sub3_Sub2 local91;
						if (local85 == this.anInt898) {
							local91 = aClass5_Sub1_Sub1_Sub3_Sub2_1;
						} else {
							local91 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local85];
						}
						if (local91 != null && local91.anInt501 >= 0 && local91.anInt501 < 13312 && local91.anInt502 >= 0 && local91.anInt502 < 13312) {
							local6.method57(local91.anInt501, this.method631(local91.anInt501, local91.anInt502, local6.anInt86) - local6.anInt81, anInt1022, local91.anInt502);
						}
					}
					local6.method58(this.anInt975);
					this.aClass48_1.method485(this.anInt902, (int) local6.aDouble1, (int) local6.aDouble3, 60, -1, (int) local6.aDouble2, this.anInt948, local6, local6.anInt84, false);
				}
				local6 = (Class5_Sub1_Sub1_Sub2) this.aClass42_11.method301(this.anInt1001);
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("17725, " + arg0 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method576() {
		this.method583(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt809 = 5;
		}
		if (aBoolean238) {
			this.aBoolean252 = true;
			return;
		}
		aBoolean238 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method718();
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
			this.aBoolean244 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass19Array1[local101] = new Class19((byte) -113, 500000, signlink.aRandomAccessFileArray1[local101], signlink.aRandomAccessFile3, local101 + 1);
			}
		}
		try {
			this.method710(aBoolean261);
			this.aClass31_2 = this.method697(25, this.anIntArray267[1], "title", 1, "title screen");
			this.aClass5_Sub1_Sub2_Sub1_2 = new Class5_Sub1_Sub2_Sub1("p11_full", false, this.aClass31_2, false);
			this.aClass5_Sub1_Sub2_Sub1_3 = new Class5_Sub1_Sub2_Sub1("p12_full", false, this.aClass31_2, false);
			this.aClass5_Sub1_Sub2_Sub1_4 = new Class5_Sub1_Sub2_Sub1("b12_full", false, this.aClass31_2, false);
			this.aClass5_Sub1_Sub2_Sub1_5 = new Class5_Sub1_Sub2_Sub1("q8_full", false, this.aClass31_2, true);
			this.method611();
			this.method709();
			@Pc(197) Class31 local197 = this.method697(30, this.anIntArray267[2], "config", 2, "config");
			@Pc(209) Class31 local209 = this.method697(35, this.anIntArray267[3], "interface", 3, "interface");
			@Pc(221) Class31 local221 = this.method697(40, this.anIntArray267[4], "media", 4, "2d graphics");
			@Pc(233) Class31 local233 = this.method697(45, this.anIntArray267[6], "textures", 6, "textures");
			@Pc(245) Class31 local245 = this.method697(50, this.anIntArray267[7], "wordenc", 7, "chat system");
			@Pc(257) Class31 local257 = this.method697(55, this.anIntArray267[8], "sounds", 8, "sound effects");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass48_1 = new Class48(104, this.anIntArrayArrayArray7, (byte) -68, 4, 104);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass16Array1[local282] = new Class16(104, 104, -44659);
			}
			this.aClass5_Sub1_Sub2_Sub2_3 = new Class5_Sub1_Sub2_Sub2(512, 512);
			@Pc(317) Class31 local317 = this.method697(60, this.anIntArray267[5], "versionlist", 5, "update list");
			this.method583(60, "Connecting to update server");
			this.aClass26_Sub1_1 = new Class26_Sub1();
			this.aClass26_Sub1_1.method215(local317, this);
			Class2.method7(this.aClass26_Sub1_1.method217());
			Class5_Sub1_Sub1_Sub6.method374(this.aClass26_Sub1_1.method212(0, aBoolean243), this.aClass26_Sub1_1);
			if (!aBoolean258) {
				this.anInt923 = 0;
				this.aBoolean248 = true;
				this.aClass26_Sub1_1.method206(2, this.anInt923);
				while (this.aClass26_Sub1_1.method211() > 0) {
					this.method674();
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass26_Sub1_1.anInt396 > 3) {
						this.method681("ondemand");
						return;
					}
				}
			}
			this.method583(65, "Requesting animations");
			@Pc(392) int local392 = this.aClass26_Sub1_1.method212(1, aBoolean243);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass26_Sub1_1.method206(1, local394);
			}
			@Pc(413) int local413;
			while (this.aClass26_Sub1_1.method211() > 0) {
				local413 = local392 - this.aClass26_Sub1_1.method211();
				if (local413 > 0) {
					this.method583(65, "Loading animations - " + local413 * 100 / local392 + "%");
				}
				this.method674();
				try {
					Thread.sleep(100L);
				} catch (@Pc(439) Exception local439) {
				}
				if (this.aClass26_Sub1_1.anInt396 > 3) {
					this.method681("ondemand");
					return;
				}
			}
			this.method583(70, "Requesting models");
			local392 = this.aClass26_Sub1_1.method212(0, aBoolean243);
			@Pc(473) int local473;
			for (local413 = 0; local413 < local392; local413++) {
				local473 = this.aClass26_Sub1_1.method204(local413, anInt1035);
				if ((local473 & 0x1) != 0) {
					this.aClass26_Sub1_1.method206(0, local413);
				}
			}
			local392 = this.aClass26_Sub1_1.method211();
			while (this.aClass26_Sub1_1.method211() > 0) {
				local473 = local392 - this.aClass26_Sub1_1.method211();
				if (local473 > 0) {
					this.method583(70, "Loading models - " + local473 * 100 / local392 + "%");
				}
				this.method674();
				try {
					Thread.sleep(100L);
				} catch (@Pc(524) Exception local524) {
				}
			}
			if (this.aClass19Array1[0] != null) {
				this.method583(75, "Requesting maps");
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(47, 48, 0));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(47, 48, 1));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(48, 48, 0));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(48, 48, 1));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(49, 48, 0));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(49, 48, 1));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(47, 47, 0));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(47, 47, 1));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(48, 47, 0));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(48, 47, 1));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(48, 148, 0));
				this.aClass26_Sub1_1.method206(3, this.aClass26_Sub1_1.method208(48, 148, 1));
				local392 = this.aClass26_Sub1_1.method211();
				while (this.aClass26_Sub1_1.method211() > 0) {
					local473 = local392 - this.aClass26_Sub1_1.method211();
					if (local473 > 0) {
						this.method583(75, "Loading maps - " + local473 * 100 / local392 + "%");
					}
					this.method674();
					try {
						Thread.sleep(100L);
					} catch (@Pc(709) Exception local709) {
					}
				}
			}
			local392 = this.aClass26_Sub1_1.method212(0, aBoolean243);
			@Pc(730) int local730;
			for (local473 = 0; local473 < local392; local473++) {
				local730 = this.aClass26_Sub1_1.method204(local473, anInt1035);
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
					this.aClass26_Sub1_1.method209(0, local732, local473, 161);
				}
			}
			this.aClass26_Sub1_1.method213(aBoolean257);
			if (!aBoolean258) {
				local392 = this.aClass26_Sub1_1.method212(2, aBoolean243);
				for (local730 = 1; local730 < local392; local730++) {
					if (this.aClass26_Sub1_1.method201(local730)) {
						this.aClass26_Sub1_1.method209(2, (byte) 1, local730, 161);
					}
				}
			}
			this.method583(80, "Unpacking media");
			this.aClass5_Sub1_Sub2_Sub3_16 = new Class5_Sub1_Sub2_Sub3(local221, "invback", 0);
			this.aClass5_Sub1_Sub2_Sub3_18 = new Class5_Sub1_Sub2_Sub3(local221, "chatback", 0);
			this.aClass5_Sub1_Sub2_Sub3_17 = new Class5_Sub1_Sub2_Sub3(local221, "mapback", 0);
			this.aClass5_Sub1_Sub2_Sub3_8 = new Class5_Sub1_Sub2_Sub3(local221, "backbase1", 0);
			this.aClass5_Sub1_Sub2_Sub3_9 = new Class5_Sub1_Sub2_Sub3(local221, "backbase2", 0);
			this.aClass5_Sub1_Sub2_Sub3_10 = new Class5_Sub1_Sub2_Sub3(local221, "backhmid1", 0);
			for (local730 = 0; local730 < 13; local730++) {
				this.aClass5_Sub1_Sub2_Sub3Array2[local730] = new Class5_Sub1_Sub2_Sub3(local221, "sideicons", local730);
			}
			this.aClass5_Sub1_Sub2_Sub2_10 = new Class5_Sub1_Sub2_Sub2(local221, "compass", 0);
			this.aClass5_Sub1_Sub2_Sub2_4 = new Class5_Sub1_Sub2_Sub2(local221, "mapedge", 0);
			this.aClass5_Sub1_Sub2_Sub2_4.method273();
			for (@Pc(932) int local932 = 0; local932 < 72; local932++) {
				this.aClass5_Sub1_Sub2_Sub3Array5[local932] = new Class5_Sub1_Sub2_Sub3(local221, "mapscene", local932);
			}
			for (@Pc(950) int local950 = 0; local950 < 63; local950++) {
				this.aClass5_Sub1_Sub2_Sub2Array8[local950] = new Class5_Sub1_Sub2_Sub2(local221, "mapfunction", local950);
			}
			for (@Pc(968) int local968 = 0; local968 < 5; local968++) {
				this.aClass5_Sub1_Sub2_Sub2Array6[local968] = new Class5_Sub1_Sub2_Sub2(local221, "hitmarks", local968);
			}
			for (@Pc(986) int local986 = 0; local986 < 6; local986++) {
				this.aClass5_Sub1_Sub2_Sub2Array4[local986] = new Class5_Sub1_Sub2_Sub2(local221, "headicons_pk", local986);
			}
			for (@Pc(1004) int local1004 = 0; local1004 < 9; local1004++) {
				this.aClass5_Sub1_Sub2_Sub2Array5[local1004] = new Class5_Sub1_Sub2_Sub2(local221, "headicons_prayer", local1004);
			}
			for (@Pc(1022) int local1022 = 0; local1022 < 6; local1022++) {
				this.aClass5_Sub1_Sub2_Sub2Array7[local1022] = new Class5_Sub1_Sub2_Sub2(local221, "headicons_hint", local1022);
			}
			this.aClass5_Sub1_Sub2_Sub2_7 = new Class5_Sub1_Sub2_Sub2(local221, "overlay_multiway", 0);
			this.aClass5_Sub1_Sub2_Sub2_8 = new Class5_Sub1_Sub2_Sub2(local221, "mapmarker", 0);
			this.aClass5_Sub1_Sub2_Sub2_9 = new Class5_Sub1_Sub2_Sub2(local221, "mapmarker", 1);
			for (@Pc(1064) int local1064 = 0; local1064 < 8; local1064++) {
				this.aClass5_Sub1_Sub2_Sub2Array10[local1064] = new Class5_Sub1_Sub2_Sub2(local221, "cross", local1064);
			}
			this.aClass5_Sub1_Sub2_Sub2_13 = new Class5_Sub1_Sub2_Sub2(local221, "mapdots", 0);
			this.aClass5_Sub1_Sub2_Sub2_14 = new Class5_Sub1_Sub2_Sub2(local221, "mapdots", 1);
			this.aClass5_Sub1_Sub2_Sub2_15 = new Class5_Sub1_Sub2_Sub2(local221, "mapdots", 2);
			this.aClass5_Sub1_Sub2_Sub2_16 = new Class5_Sub1_Sub2_Sub2(local221, "mapdots", 3);
			this.aClass5_Sub1_Sub2_Sub2_17 = new Class5_Sub1_Sub2_Sub2(local221, "mapdots", 4);
			this.aClass5_Sub1_Sub2_Sub3_1 = new Class5_Sub1_Sub2_Sub3(local221, "scrollbar", 0);
			this.aClass5_Sub1_Sub2_Sub3_2 = new Class5_Sub1_Sub2_Sub3(local221, "scrollbar", 1);
			this.aClass5_Sub1_Sub2_Sub3_3 = new Class5_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass5_Sub1_Sub2_Sub3_4 = new Class5_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass5_Sub1_Sub2_Sub3_5 = new Class5_Sub1_Sub2_Sub3(local221, "redstone3", 0);
			this.aClass5_Sub1_Sub2_Sub3_6 = new Class5_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass5_Sub1_Sub2_Sub3_6.method323();
			this.aClass5_Sub1_Sub2_Sub3_7 = new Class5_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass5_Sub1_Sub2_Sub3_7.method323();
			this.aClass5_Sub1_Sub2_Sub3_11 = new Class5_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass5_Sub1_Sub2_Sub3_11.method324();
			this.aClass5_Sub1_Sub2_Sub3_12 = new Class5_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass5_Sub1_Sub2_Sub3_12.method324();
			this.aClass5_Sub1_Sub2_Sub3_13 = new Class5_Sub1_Sub2_Sub3(local221, "redstone3", 0);
			this.aClass5_Sub1_Sub2_Sub3_13.method324();
			this.aClass5_Sub1_Sub2_Sub3_14 = new Class5_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass5_Sub1_Sub2_Sub3_14.method323();
			this.aClass5_Sub1_Sub2_Sub3_14.method324();
			this.aClass5_Sub1_Sub2_Sub3_15 = new Class5_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass5_Sub1_Sub2_Sub3_15.method323();
			this.aClass5_Sub1_Sub2_Sub3_15.method324();
			for (@Pc(1254) int local1254 = 0; local1254 < 2; local1254++) {
				this.aClass5_Sub1_Sub2_Sub3Array3[local1254] = new Class5_Sub1_Sub2_Sub3(local221, "mod_icons", local1254);
			}
			@Pc(1277) Class5_Sub1_Sub2_Sub2 local1277 = new Class5_Sub1_Sub2_Sub2(local221, "backleft1", 0);
			this.aClass10_3 = new Class10(local1277.anInt579, this.method581(), false, local1277.anInt578);
			local1277.method274(0, 0);
			@Pc(1302) Class5_Sub1_Sub2_Sub2 local1302 = new Class5_Sub1_Sub2_Sub2(local221, "backleft2", 0);
			this.aClass10_4 = new Class10(local1302.anInt579, this.method581(), false, local1302.anInt578);
			local1302.method274(0, 0);
			@Pc(1327) Class5_Sub1_Sub2_Sub2 local1327 = new Class5_Sub1_Sub2_Sub2(local221, "backright1", 0);
			this.aClass10_5 = new Class10(local1327.anInt579, this.method581(), false, local1327.anInt578);
			local1327.method274(0, 0);
			@Pc(1352) Class5_Sub1_Sub2_Sub2 local1352 = new Class5_Sub1_Sub2_Sub2(local221, "backright2", 0);
			this.aClass10_6 = new Class10(local1352.anInt579, this.method581(), false, local1352.anInt578);
			local1352.method274(0, 0);
			@Pc(1377) Class5_Sub1_Sub2_Sub2 local1377 = new Class5_Sub1_Sub2_Sub2(local221, "backtop1", 0);
			this.aClass10_7 = new Class10(local1377.anInt579, this.method581(), false, local1377.anInt578);
			local1377.method274(0, 0);
			@Pc(1402) Class5_Sub1_Sub2_Sub2 local1402 = new Class5_Sub1_Sub2_Sub2(local221, "backvmid1", 0);
			this.aClass10_8 = new Class10(local1402.anInt579, this.method581(), false, local1402.anInt578);
			local1402.method274(0, 0);
			@Pc(1427) Class5_Sub1_Sub2_Sub2 local1427 = new Class5_Sub1_Sub2_Sub2(local221, "backvmid2", 0);
			this.aClass10_9 = new Class10(local1427.anInt579, this.method581(), false, local1427.anInt578);
			local1427.method274(0, 0);
			@Pc(1452) Class5_Sub1_Sub2_Sub2 local1452 = new Class5_Sub1_Sub2_Sub2(local221, "backvmid3", 0);
			this.aClass10_10 = new Class10(local1452.anInt579, this.method581(), false, local1452.anInt578);
			local1452.method274(0, 0);
			@Pc(1477) Class5_Sub1_Sub2_Sub2 local1477 = new Class5_Sub1_Sub2_Sub2(local221, "backhmid2", 0);
			this.aClass10_11 = new Class10(local1477.anInt579, this.method581(), false, local1477.anInt578);
			local1477.method274(0, 0);
			@Pc(1502) int local1502 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1509) int local1509 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1525) int local1525 = 0; local1525 < 100; local1525++) {
				if (this.aClass5_Sub1_Sub2_Sub2Array8[local1525] != null) {
					this.aClass5_Sub1_Sub2_Sub2Array8[local1525].method272(local1516 + local1523, local1502 + local1523, local1509 + local1523);
				}
				if (this.aClass5_Sub1_Sub2_Sub3Array5[local1525] != null) {
					this.aClass5_Sub1_Sub2_Sub3Array5[local1525].method325(local1516 + local1523, local1502 + local1523, local1509 + local1523);
				}
			}
			this.method583(83, "Unpacking textures");
			Class5_Sub1_Sub2_Sub4.method347(local233);
			Class5_Sub1_Sub2_Sub4.method351(0.8D, (byte) 5);
			Class5_Sub1_Sub2_Sub4.method346();
			this.method583(86, "Unpacking config");
			Class32.method228(local197);
			Class8.method36(local197);
			Class36.method243(local197);
			Class17.method120(local197);
			Class24.method159(local197);
			Class7.method27(local197);
			Class6.method24(local197);
			Class25.method194(local197);
			Class18.method131(local197);
			Class17.aBoolean82 = aBoolean257;
			if (!aBoolean258) {
				this.method583(90, "Unpacking sounds");
				@Pc(1628) byte[] local1628 = local257.method227("sounds.dat", null);
				@Pc(1634) Class5_Sub1_Sub4 local1634 = new Class5_Sub1_Sub4(local1628, -82);
				Class38.method251(local1634);
			}
			this.method583(95, "Unpacking interfaces");
			@Pc(1665) Class5_Sub1_Sub2_Sub1[] local1665 = new Class5_Sub1_Sub2_Sub1[] { this.aClass5_Sub1_Sub2_Sub1_2, this.aClass5_Sub1_Sub2_Sub1_3, this.aClass5_Sub1_Sub2_Sub1_4, this.aClass5_Sub1_Sub2_Sub1_5 };
			Class45.method367(local221, local209, local1665);
			this.method583(100, "Preparing game engine");
			@Pc(1681) int local1681;
			@Pc(1683) int local1683;
			@Pc(1685) int local1685;
			for (@Pc(1677) int local1677 = 0; local1677 < 33; local1677++) {
				local1681 = 999;
				local1683 = 0;
				for (local1685 = 0; local1685 < 34; local1685++) {
					if (this.aClass5_Sub1_Sub2_Sub3_17.aByteArray13[local1685 + local1677 * this.aClass5_Sub1_Sub2_Sub3_17.anInt613] == 0) {
						if (local1681 == 999) {
							local1681 = local1685;
						}
					} else if (local1681 != 999) {
						local1683 = local1685;
						break;
					}
				}
				this.anIntArray235[local1677] = local1681;
				this.anIntArray222[local1677] = local1683 - local1681;
			}
			@Pc(1743) int local1743;
			for (local1681 = 5; local1681 < 156; local1681++) {
				local1683 = 999;
				local1685 = 0;
				for (local1743 = 25; local1743 < 172; local1743++) {
					if (this.aClass5_Sub1_Sub2_Sub3_17.aByteArray13[local1743 + local1681 * this.aClass5_Sub1_Sub2_Sub3_17.anInt613] == 0 && (local1743 > 34 || local1681 > 34)) {
						if (local1683 == 999) {
							local1683 = local1743;
						}
					} else if (local1683 != 999) {
						local1685 = local1743;
						break;
					}
				}
				this.anIntArray269[local1681 - 5] = local1683 - 25;
				this.anIntArray271[local1681 - 5] = local1685 - local1683;
			}
			Class5_Sub1_Sub2_Sub4.method344(503, 765);
			this.anIntArray245 = Class5_Sub1_Sub2_Sub4.anIntArray122;
			Class5_Sub1_Sub2_Sub4.method344(96, 479);
			this.anIntArray242 = Class5_Sub1_Sub2_Sub4.anIntArray122;
			Class5_Sub1_Sub2_Sub4.method344(261, 190);
			this.anIntArray243 = Class5_Sub1_Sub2_Sub4.anIntArray122;
			Class5_Sub1_Sub2_Sub4.method344(334, 512);
			this.anIntArray244 = Class5_Sub1_Sub2_Sub4.anIntArray122;
			@Pc(1834) int[] local1834 = new int[9];
			for (local1685 = 0; local1685 < 9; local1685++) {
				local1743 = local1685 * 32 + 128 + 15;
				@Pc(1852) int local1852 = local1743 * 3 + 600;
				@Pc(1856) int local1856 = Class5_Sub1_Sub2_Sub4.anIntArray120[local1743];
				local1834[local1685] = local1852 * local1856 >> 16;
			}
			Class48.method510(local1834);
			Class50.method533(local245);
			this.aClass37_1 = new Class37(this, (byte) -116);
			this.method582(this.aClass37_1, 10);
			Class5_Sub1_Sub1_Sub1.aClient1 = this;
			Class8.aClient2 = this;
			Class24.aClient3 = this;
		} catch (@Pc(1897) Exception local1897) {
			signlink.reporterror("loaderror " + this.aString21 + " " + this.anInt866);
			this.aBoolean255 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!XGRGMPUQ;)V")
	private void method620(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			while (true) {
				if (arg1.anInt756 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method448(11);
					if (local12 != 2047) {
						if (this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local12] == null) {
							this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local12] = new Class5_Sub1_Sub1_Sub3_Sub2();
							if (this.aClass5_Sub1_Sub4Array1[local12] != null) {
								this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local12].method241(this.aClass5_Sub1_Sub4Array1[local12]);
							}
						}
						this.anIntArray264[this.anInt1025++] = local12;
						@Pc(58) Class5_Sub1_Sub1_Sub3_Sub2 local58 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local12];
						local58.anInt461 = anInt1022;
						@Pc(66) int local66 = arg1.method448(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method448(1);
						if (local75 == 1) {
							this.anIntArray265[this.anInt1026++] = local12;
						}
						@Pc(94) int local94 = arg1.method448(1);
						@Pc(99) int local99 = arg1.method448(5);
						if (local99 > 15) {
							local99 -= 32;
						}
						local58.method239(local94 == 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0] + local66, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0] + local99);
						continue;
					}
				}
				arg1.method449();
				return;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("82402, " + -49893 + ", " + arg0 + ", " + arg1 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!VYAVYWNE;I)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class45 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt675 == 0 && arg2.anIntArray132 != null && (!arg2.aBoolean191 || this.anInt1046 == arg2.anInt642 || this.anInt899 == arg2.anInt642 || this.anInt989 == arg2.anInt642)) {
				@Pc(29) int local29 = Class5_Sub1_Sub2.anInt626;
				@Pc(31) int local31 = Class5_Sub1_Sub2.anInt624;
				@Pc(33) int local33 = Class5_Sub1_Sub2.anInt627;
				@Pc(35) int local35 = Class5_Sub1_Sub2.anInt625;
				Class5_Sub1_Sub2.method332(arg0, arg3 + arg2.anInt650, arg3, arg0 + arg2.anInt647);
				@Pc(64) int local64 = arg2.anIntArray132.length;
				for (@Pc(66) int local66 = 0; local66 < local64; local66++) {
					@Pc(75) int local75 = arg2.anIntArray128[local66] + arg0;
					@Pc(84) int local84 = arg2.anIntArray133[local66] + arg3 - arg1;
					@Pc(90) Class45 local90 = Class45.method361(arg2.anIntArray132[local66]);
					@Pc(95) int local95 = local75 + local90.anInt645;
					@Pc(100) int local100 = local84 + local90.anInt649;
					if (local90.anInt670 > 0) {
						this.method654(local90, (byte) 3);
					}
					if (local90.anInt675 == 0) {
						if (local90.anInt676 > local90.anInt641 - local90.anInt650) {
							local90.anInt676 = local90.anInt641 - local90.anInt650;
						}
						if (local90.anInt676 < 0) {
							local90.anInt676 = 0;
						}
						this.method621(local95, local90.anInt676, local90, local100);
						if (local90.anInt641 > local90.anInt650) {
							this.method703(local90.anInt641, local90.anInt676, local90.anInt650, (byte) 8, local95 + local90.anInt647, local100);
						}
					} else if (local90.anInt675 != 1) {
						@Pc(172) int local172;
						@Pc(176) int local176;
						@Pc(187) int local187;
						@Pc(222) int local222;
						@Pc(229) int local229;
						@Pc(254) int local254;
						@Pc(170) int local170;
						@Pc(220) int local220;
						if (local90.anInt675 == 2) {
							local170 = 0;
							for (local172 = 0; local172 < local90.anInt650; local172++) {
								for (local176 = 0; local176 < local90.anInt647; local176++) {
									local187 = local95 + local176 * (local90.anInt661 + 32);
									@Pc(196) int local196 = local100 + local172 * (local90.anInt677 + 32);
									if (local170 < 20) {
										local187 += local90.anIntArray129[local170];
										local196 += local90.anIntArray127[local170];
									}
									if (local90.anIntArray131[local170] > 0) {
										local220 = 0;
										local222 = 0;
										local229 = local90.anIntArray131[local170] - 1;
										if (local187 > Class5_Sub1_Sub2.anInt626 - 32 && local187 < Class5_Sub1_Sub2.anInt627 && local196 > Class5_Sub1_Sub2.anInt624 - 32 && local196 < Class5_Sub1_Sub2.anInt625 || this.anInt828 != 0 && this.anInt827 == local170) {
											local254 = 0;
											if (this.anInt869 == 1 && this.anInt870 == local170 && this.anInt871 == local90.anInt642) {
												local254 = 16777215;
											}
											@Pc(278) Class5_Sub1_Sub2_Sub2 local278 = Class17.method122(local229, local254, local90.anIntArray126[local170]);
											if (local278 != null) {
												@Pc(357) int local357;
												if (this.anInt828 != 0 && this.anInt827 == local170 && this.anInt826 == local90.anInt642) {
													local220 = super.anInt815 - this.anInt829;
													local222 = super.anInt816 - this.anInt830;
													if (local220 < 5 && local220 > -5) {
														local220 = 0;
													}
													if (local222 < 5 && local222 > -5) {
														local222 = 0;
													}
													if (this.anInt896 < 5) {
														local220 = 0;
														local222 = 0;
													}
													local278.method278(local196 + local222, 156, local187 + local220);
													if (local196 + local222 < Class5_Sub1_Sub2.anInt624 && arg2.anInt676 > 0) {
														local357 = this.anInt975 * (Class5_Sub1_Sub2.anInt624 - local196 - local222) / 3;
														if (local357 > this.anInt975 * 10) {
															local357 = this.anInt975 * 10;
														}
														if (local357 > arg2.anInt676) {
															local357 = arg2.anInt676;
														}
														arg2.anInt676 -= local357;
														this.anInt830 += local357;
													}
													if (local196 + local222 + 32 > Class5_Sub1_Sub2.anInt625 && arg2.anInt676 < arg2.anInt641 - arg2.anInt650) {
														local357 = this.anInt975 * (local196 + local222 + 32 - Class5_Sub1_Sub2.anInt625) / 3;
														if (local357 > this.anInt975 * 10) {
															local357 = this.anInt975 * 10;
														}
														if (local357 > arg2.anInt641 - arg2.anInt650 - arg2.anInt676) {
															local357 = arg2.anInt641 - arg2.anInt650 - arg2.anInt676;
														}
														arg2.anInt676 += local357;
														this.anInt830 -= local357;
													}
												} else if (this.anInt958 != 0 && this.anInt957 == local170 && this.anInt956 == local90.anInt642) {
													local278.method278(local196, 156, local187);
												} else {
													local278.method276(local196, local187);
												}
												if (local278.anInt582 == 33 || local90.anIntArray126[local170] != 1) {
													local357 = local90.anIntArray126[local170];
													this.aClass5_Sub1_Sub2_Sub1_2.method182(local196 + local222 + 10, local187 + 1 + local220, 0, method689(local357), (byte) 6);
													this.aClass5_Sub1_Sub2_Sub1_2.method182(local196 + local222 + 9, local187 + local220, 16776960, method689(local357), (byte) 6);
												}
											}
										}
									} else if (local90.aClass5_Sub1_Sub2_Sub2Array2 != null && local170 < 20) {
										@Pc(546) Class5_Sub1_Sub2_Sub2 local546 = local90.aClass5_Sub1_Sub2_Sub2Array2[local170];
										if (local546 != null) {
											local546.method276(local196, local187);
										}
									}
									local170++;
								}
							}
						} else if (local90.anInt675 == 3) {
							@Pc(572) boolean local572 = false;
							if (this.anInt989 == local90.anInt642 || this.anInt899 == local90.anInt642 || this.anInt1046 == local90.anInt642) {
								local572 = true;
							}
							if (this.method635(local90)) {
								local170 = local90.anInt655;
								if (local572 && local90.anInt659 != 0) {
									local170 = local90.anInt659;
								}
							} else {
								local170 = local90.anInt668;
								if (local572 && local90.anInt669 != 0) {
									local170 = local90.anInt669;
								}
							}
							if (local90.aByte23 == 0) {
								if (local90.aBoolean182) {
									Class5_Sub1_Sub2.method335(local100, local170, local95, local90.anInt647, local90.anInt650);
								} else {
									Class5_Sub1_Sub2.method336(local170, local100, local90.anInt647, local95, local90.anInt650);
								}
							} else if (local90.aBoolean182) {
								Class5_Sub1_Sub2.method334(local170, local95, 256 - (local90.aByte23 & 0xFF), local90.anInt647, local90.anInt650, local100);
							} else {
								Class5_Sub1_Sub2.method337(256 - (local90.aByte23 & 0xFF), local100, local170, local95, local90.anInt647, local90.anInt650);
							}
						} else {
							@Pc(690) Class5_Sub1_Sub2_Sub1 local690;
							@Pc(967) String local967;
							if (local90.anInt675 == 4) {
								local690 = local90.aClass5_Sub1_Sub2_Sub1_1;
								@Pc(693) String local693 = local90.aString13;
								@Pc(695) boolean local695 = false;
								if (this.anInt989 == local90.anInt642 || this.anInt899 == local90.anInt642 || this.anInt1046 == local90.anInt642) {
									local695 = true;
								}
								if (this.method635(local90)) {
									local172 = local90.anInt655;
									if (local695 && local90.anInt659 != 0) {
										local172 = local90.anInt659;
									}
									if (local90.aString16.length() > 0) {
										local693 = local90.aString16;
									}
								} else {
									local172 = local90.anInt668;
									if (local695 && local90.anInt669 != 0) {
										local172 = local90.anInt669;
									}
								}
								if (local90.anInt654 == 6 && this.aBoolean239) {
									local693 = "Please wait...";
									local172 = local90.anInt668;
								}
								if (Class5_Sub1_Sub2.anInt622 == 479) {
									if (local172 == 16776960) {
										local172 = 255;
									}
									if (local172 == 49152) {
										local172 = 16777215;
									}
								}
								local220 = local100 + local690.anInt369;
								while (local693.length() > 0) {
									if (local693.indexOf("%") != -1) {
										label386: while (true) {
											local222 = local693.indexOf("%1");
											if (local222 == -1) {
												while (true) {
													local222 = local693.indexOf("%2");
													if (local222 == -1) {
														while (true) {
															local222 = local693.indexOf("%3");
															if (local222 == -1) {
																while (true) {
																	local222 = local693.indexOf("%4");
																	if (local222 == -1) {
																		while (true) {
																			local222 = local693.indexOf("%5");
																			if (local222 == -1) {
																				break label386;
																			}
																			local693 = local693.substring(0, local222) + this.method693(this.method640(4, local90)) + local693.substring(local222 + 2);
																		}
																	}
																	local693 = local693.substring(0, local222) + this.method693(this.method640(3, local90)) + local693.substring(local222 + 2);
																}
															}
															local693 = local693.substring(0, local222) + this.method693(this.method640(2, local90)) + local693.substring(local222 + 2);
														}
													}
													local693 = local693.substring(0, local222) + this.method693(this.method640(1, local90)) + local693.substring(local222 + 2);
												}
											}
											local693 = local693.substring(0, local222) + this.method693(this.method640(0, local90)) + local693.substring(local222 + 2);
										}
									}
									local222 = local693.indexOf("\\n");
									if (local222 == -1) {
										local967 = local693;
										local693 = "";
									} else {
										local967 = local693.substring(0, local222);
										local693 = local693.substring(local222 + 2);
									}
									if (local90.aBoolean187) {
										local690.method179(local95 + local90.anInt647 / 2, local220, local967, local172, local90.aBoolean189);
									} else {
										local690.method186(local967, local95, local172, local90.aBoolean189, local220);
									}
									local220 += local690.anInt369;
								}
							} else if (local90.anInt675 == 5) {
								@Pc(1029) Class5_Sub1_Sub2_Sub2 local1029;
								if (this.method635(local90)) {
									local1029 = local90.aClass5_Sub1_Sub2_Sub2_1;
								} else {
									local1029 = local90.aClass5_Sub1_Sub2_Sub2_2;
								}
								if (local1029 != null) {
									local1029.method276(local100, local95);
								}
							} else if (local90.anInt675 == 6) {
								local170 = Class5_Sub1_Sub2_Sub4.anInt635;
								local172 = Class5_Sub1_Sub2_Sub4.anInt636;
								Class5_Sub1_Sub2_Sub4.anInt635 = local95 + local90.anInt647 / 2;
								Class5_Sub1_Sub2_Sub4.anInt636 = local100 + local90.anInt650 / 2;
								local176 = Class5_Sub1_Sub2_Sub4.anIntArray120[local90.anInt652] * local90.anInt651 >> 16;
								local187 = Class5_Sub1_Sub2_Sub4.anIntArray121[local90.anInt652] * local90.anInt651 >> 16;
								@Pc(1090) boolean local1090 = this.method635(local90);
								if (local1090) {
									local220 = local90.anInt644;
								} else {
									local220 = local90.anInt643;
								}
								@Pc(1110) Class5_Sub1_Sub1_Sub6 local1110;
								if (local220 == -1) {
									local1110 = local90.method359(-1, local1090, -1);
								} else {
									@Pc(1116) Class32 local1116 = Class32.aClass32Array1[local220];
									local1110 = local90.method359(local1116.anIntArray96[local90.anInt667], local1090, local1116.anIntArray97[local90.anInt667]);
								}
								if (local1110 != null) {
									local1110.method397(local90.anInt653, 0, local90.anInt652, 0, local176, local187);
								}
								Class5_Sub1_Sub2_Sub4.anInt635 = local170;
								Class5_Sub1_Sub2_Sub4.anInt636 = local172;
							} else {
								if (local90.anInt675 == 7) {
									local690 = local90.aClass5_Sub1_Sub2_Sub1_1;
									local172 = 0;
									for (local176 = 0; local176 < local90.anInt650; local176++) {
										for (local187 = 0; local187 < local90.anInt647; local187++) {
											if (local90.anIntArray131[local172] > 0) {
												@Pc(1180) Class17 local1180 = Class17.method130(local90.anIntArray131[local172] - 1);
												@Pc(1183) String local1183 = local1180.aString4;
												if (local1180.aBoolean84 || local90.anIntArray126[local172] != 1) {
													local1183 = local1183 + " x" + method624(local90.anIntArray126[local172]);
												}
												local222 = local95 + local187 * (local90.anInt661 + 115);
												local229 = local100 + local176 * (local90.anInt677 + 12);
												if (local90.aBoolean187) {
													local690.method179(local222 + local90.anInt647 / 2, local229, local1183, local90.anInt668, local90.aBoolean189);
												} else {
													local690.method186(local1183, local222, local90.anInt668, local90.aBoolean189, local229);
												}
											}
											local172++;
										}
									}
								}
								if (local90.anInt675 == 8 && (this.anInt947 == local90.anInt642 || this.anInt877 == local90.anInt642 || this.anInt897 == local90.anInt642) && this.anInt850 == 100) {
									local170 = 0;
									local172 = 0;
									@Pc(1297) Class5_Sub1_Sub2_Sub1 local1297 = this.aClass5_Sub1_Sub2_Sub1_3;
									@Pc(1300) String local1300 = local90.aString13;
									while (local1300.length() > 0) {
										local220 = local1300.indexOf("\\n");
										if (local220 == -1) {
											local967 = local1300;
											local1300 = "";
										} else {
											local967 = local1300.substring(0, local220);
											local1300 = local1300.substring(local220 + 2);
										}
										local222 = local1297.method180(local967);
										if (local222 > local170) {
											local170 = local222;
										}
										local172 += local1297.anInt369 + 1;
									}
									local170 += 6;
									local172 += 7;
									local220 = local95 + local90.anInt647 - local170 - 5;
									local222 = local100 + local90.anInt650 + 5;
									if (local220 < local95 + 5) {
										local220 = local95 + 5;
									}
									if (local220 + local170 > arg0 + arg2.anInt647) {
										local220 = arg0 + arg2.anInt647 - local170;
									}
									Class5_Sub1_Sub2.method335(local222, 16777120, local220, local170, local172);
									Class5_Sub1_Sub2.method336(0, local222, local170, local220, local172);
									local1300 = local90.aString13;
									local229 = local222 + local1297.anInt369 + 2;
									while (local1300.length() > 0) {
										local254 = local1300.indexOf("\\n");
										if (local254 == -1) {
											local967 = local1300;
											local1300 = "";
										} else {
											local967 = local1300.substring(0, local254);
											local1300 = local1300.substring(local254 + 2);
										}
										local1297.method186(local967, local220 + 3, 0, false, local229);
										local229 += local1297.anInt369 + 1;
									}
								}
							}
						}
					}
				}
				Class5_Sub1_Sub2.method332(local29, local35, local31, local33);
			}
		} catch (@Pc(1470) RuntimeException local1470) {
			signlink.reporterror("20512, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PDMJJHOP;BII)V")
	private void method622(@OriginalArg(0) Class5_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) int local12 = arg1 * arg1 + arg2 * arg2;
			if (local12 > 4225 && local12 < 90000) {
				@Pc(26) int local26 = this.anInt933 + this.anInt886 & 0x7FF;
				@Pc(30) int local30 = Class5_Sub1_Sub1_Sub6.anIntArray172[local26];
				@Pc(34) int local34 = Class5_Sub1_Sub1_Sub6.anIntArray173[local26];
				@Pc(43) int local43 = local30 * 256 / (this.anInt937 + 256);
				@Pc(52) int local52 = local34 * 256 / (this.anInt937 + 256);
				@Pc(62) int local62 = arg2 * local43 + arg1 * local52 >> 16;
				@Pc(72) int local72 = arg2 * local52 - arg1 * local43 >> 16;
				@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
				@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
				@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
				this.aClass5_Sub1_Sub2_Sub2_4.method281(83 - local90 - 20, local84 + 94 + 4 - 10, local78);
			} else {
				this.method652(arg0, arg2, arg1);
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("19405, " + arg0 + ", " + -103 + ", " + arg1 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt987 = Integer.parseInt(this.getParameter("nodeid"));
		anInt988 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method587();
		} else {
			method589();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean257 = false;
		} else {
			aBoolean257 = true;
		}
		this.method572();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Z")
	private boolean method623(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(14) int local14 = this.anIntArray274[arg0];
			if (local14 >= 2000) {
				local14 -= 2000;
			}
			return local14 == 678;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("94099, " + 8 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method625() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray220[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray220[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray221[local54] = (this.anIntArray220[local54 - 1] + this.anIntArray220[local54 + 1] + this.anIntArray220[local54 - 128] + this.anIntArray220[local54 + 128]) / 4;
				}
			}
			this.anInt917 += 128;
			if (this.anInt917 > this.anIntArray249.length) {
				this.anInt917 -= this.anIntArray249.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method657(this.aClass5_Sub1_Sub2_Sub3Array4[local48]);
			}
			@Pc(177) int local177;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local177 = local54 + (local48 << 7);
					@Pc(200) int local200 = this.anIntArray221[local177 + 128] - this.anIntArray249[local177 + this.anInt917 & this.anIntArray249.length - 1] / 5;
					if (local200 < 0) {
						local200 = 0;
					}
					this.anIntArray220[local177] = local200;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray251[local54] = this.anIntArray251[local54 + 1];
			}
			this.anIntArray251[255] = (int) (Math.sin((double) anInt1022 / 14.0D) * 16.0D + Math.sin((double) anInt1022 / 15.0D) * 14.0D + Math.sin((double) anInt1022 / 16.0D) * 12.0D);
			if (this.anInt926 > 0) {
				this.anInt926 -= 4;
			}
			if (this.anInt927 > 0) {
				this.anInt927 -= 4;
			}
			if (this.anInt926 == 0 && this.anInt927 == 0) {
				local177 = (int) (Math.random() * 2000.0D);
				if (local177 == 0) {
					this.anInt926 = 1024;
				}
				if (local177 == 1) {
					this.anInt927 = 1024;
					return;
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("75728, " + 58 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XGRGMPUQ;II)V")
	private void method626(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method447();
			@Pc(18) int local18 = arg0.method448(8);
			@Pc(24) int local24;
			if (local18 < this.anInt849) {
				for (local24 = local18; local24 < this.anInt849; local24++) {
					this.anIntArray256[this.anInt1017++] = this.anIntArray214[local24];
				}
			}
			if (local18 > this.anInt849) {
				signlink.reporterror(this.aString24 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt849 = 0;
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(76) int local76 = this.anIntArray214[local24];
				@Pc(81) Class5_Sub1_Sub1_Sub3_Sub1 local81 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local76];
				@Pc(86) int local86 = arg0.method448(1);
				if (local86 == 0) {
					this.anIntArray214[this.anInt849++] = local76;
					local81.anInt461 = anInt1022;
				} else {
					@Pc(109) int local109 = arg0.method448(2);
					if (local109 == 0) {
						this.anIntArray214[this.anInt849++] = local76;
						local81.anInt461 = anInt1022;
						this.anIntArray265[this.anInt1026++] = local76;
					} else {
						@Pc(160) int local160;
						@Pc(170) int local170;
						if (local109 == 1) {
							this.anIntArray214[this.anInt849++] = local76;
							local81.anInt461 = anInt1022;
							local160 = arg0.method448(3);
							local81.method237(local160, false);
							local170 = arg0.method448(1);
							if (local170 == 1) {
								this.anIntArray265[this.anInt1026++] = local76;
							}
						} else if (local109 == 2) {
							this.anIntArray214[this.anInt849++] = local76;
							local81.anInt461 = anInt1022;
							local160 = arg0.method448(3);
							local81.method237(local160, true);
							local170 = arg0.method448(3);
							local81.method237(local170, true);
							@Pc(228) int local228 = arg0.method448(1);
							if (local228 == 1) {
								this.anIntArray265[this.anInt1026++] = local76;
							}
						} else if (local109 == 3) {
							this.anIntArray256[this.anInt1017++] = local76;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("74262, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!XGRGMPUQ;I)V")
	private void method627(@OriginalArg(1) Class5_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt756 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method448(14);
					if (local12 != 16383) {
						if (this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local12] == null) {
							this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local12] = new Class5_Sub1_Sub1_Sub3_Sub1();
						}
						@Pc(32) Class5_Sub1_Sub1_Sub3_Sub1 local32 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local12];
						this.anIntArray214[this.anInt849++] = local12;
						local32.anInt461 = anInt1022;
						local32.aClass24_1 = Class24.method160(arg0.method448(13));
						@Pc(58) int local58 = arg0.method448(1);
						@Pc(63) int local63 = arg0.method448(1);
						if (local63 == 1) {
							this.anIntArray265[this.anInt1026++] = local12;
						}
						@Pc(82) int local82 = arg0.method448(5);
						if (local82 > 15) {
							local82 -= 32;
						}
						@Pc(91) int local91 = arg0.method448(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						local32.anInt471 = local32.aClass24_1.aByte13;
						local32.anInt497 = local32.aClass24_1.anInt342;
						local32.anInt473 = local32.aClass24_1.anInt349;
						local32.anInt474 = local32.aClass24_1.anInt343;
						local32.anInt475 = local32.aClass24_1.anInt333;
						local32.anInt476 = local32.aClass24_1.anInt341;
						local32.anInt506 = local32.aClass24_1.anInt347;
						local32.method239(local58 == 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0] + local82, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0] + local91);
						continue;
					}
				}
				arg0.method449();
				return;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("54359, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method628(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt1030 != 0) {
					this.anInt1030 = 0;
					this.aBoolean246 = true;
				}
				@Pc(18) int local18 = this.anIntArray272[arg0];
				@Pc(23) int local23 = this.anIntArray273[arg0];
				@Pc(28) int local28 = this.anIntArray274[arg0];
				@Pc(33) int local33 = this.anIntArray275[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 818 && !this.aBoolean239) {
					this.aClass5_Sub1_Sub4_8.method426(36);
					this.aClass5_Sub1_Sub4_8.method428(local23);
					this.aBoolean239 = true;
				}
				@Pc(74) String local74;
				@Pc(78) int local78;
				@Pc(96) String local96;
				@Pc(100) int local100;
				if (local28 == 178 || local28 == 830) {
					local74 = this.aStringArray13[arg0];
					local78 = local74.indexOf("@whi@");
					if (local78 != -1) {
						local74 = local74.substring(local78 + 5).trim();
						local96 = Class11.method51(Class11.method48(this.anInt993, Class11.method47(local74)));
						@Pc(98) boolean local98 = false;
						for (local100 = 0; local100 < this.anInt1025; local100++) {
							@Pc(110) Class5_Sub1_Sub1_Sub3_Sub2 local110 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray264[local100]];
							if (local110 != null && local110.aString10 != null && local110.aString10.equalsIgnoreCase(local96)) {
								this.method638(local110.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local110.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
								if (local28 == 178) {
									this.aClass5_Sub1_Sub4_8.method426(59);
									this.aClass5_Sub1_Sub4_8.method428(this.anIntArray264[local100]);
								}
								if (local28 == 830) {
									this.aClass5_Sub1_Sub4_8.method426(212);
									this.aClass5_Sub1_Sub4_8.method460(this.anIntArray264[local100]);
								}
								local98 = true;
								break;
							}
						}
						if (!local98) {
							this.method668(0, "", "Unable to find " + local96);
						}
					}
				}
				@Pc(210) Class5_Sub1_Sub1_Sub3_Sub1 local210;
				if (local28 == 157) {
					local210 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local33];
					if (local210 != null) {
						this.method638(local210.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local210.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						this.aClass5_Sub1_Sub4_8.method426(98);
						this.aClass5_Sub1_Sub4_8.method428(local33);
					}
				}
				@Pc(269) Class17 local269;
				@Pc(295) String local295;
				if (local28 == 1205) {
					local269 = Class17.method130(local33);
					@Pc(272) Class45 local272 = Class45.method361(local23);
					if (local272 != null && local272.anIntArray126[local18] >= 100000) {
						local295 = local272.anIntArray126[local18] + " x " + local269.aString4;
					} else if (local269.aByteArray3 == null) {
						local295 = "It's a " + local269.aString4 + ".";
					} else {
						local295 = new String(local269.aByteArray3);
					}
					this.method668(0, "", local295);
				}
				@Pc(350) boolean local350;
				if (local28 == 453) {
					local350 = this.method638(local23, this.anInt876, 0, 0, 2, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					if (!local350) {
						this.method638(local23, this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					}
					this.anInt969 = super.anInt821;
					this.anInt970 = super.anInt822;
					this.anInt972 = 2;
					this.anInt971 = 0;
					this.aClass5_Sub1_Sub4_8.method426(196);
					this.aClass5_Sub1_Sub4_8.method428(local33);
					this.aClass5_Sub1_Sub4_8.method462(this.anInt883);
					this.aClass5_Sub1_Sub4_8.method428(local23 + this.anInt984);
					this.aClass5_Sub1_Sub4_8.method461(local18 + this.anInt983);
				}
				if (local28 == 708) {
					local210 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local33];
					if (local210 != null) {
						this.method638(local210.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local210.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						anInt925++;
						if (anInt925 >= 103) {
							this.aClass5_Sub1_Sub4_8.method426(99);
							this.aClass5_Sub1_Sub4_8.method427(180);
							anInt925 = 0;
						}
						this.aClass5_Sub1_Sub4_8.method426(100);
						this.aClass5_Sub1_Sub4_8.method461(local33);
					}
				}
				if (local28 == 1802) {
					this.method634(local23, (byte) 4, local18, local33);
					this.aClass5_Sub1_Sub4_8.method426(245);
					this.aClass5_Sub1_Sub4_8.method462(local18 + this.anInt983);
					this.aClass5_Sub1_Sub4_8.method462(local33 >> 14 & 0x7FFF);
					this.aClass5_Sub1_Sub4_8.method462(local23 + this.anInt984);
				}
				if (local28 == 36) {
					this.aClass5_Sub1_Sub4_8.method426(216);
					this.aClass5_Sub1_Sub4_8.method428(local33);
					this.aClass5_Sub1_Sub4_8.method461(local23);
					this.aClass5_Sub1_Sub4_8.method460(local18);
					this.anInt955 = 0;
					this.anInt956 = local23;
					this.anInt957 = local18;
					this.anInt958 = 2;
					if (Class45.method361(local23).anInt640 == this.anInt940) {
						this.anInt958 = 1;
					}
					if (Class45.method361(local23).anInt640 == this.anInt990) {
						this.anInt958 = 3;
					}
				}
				if (local28 == 821) {
					this.method694();
				}
				if (local28 == 1918) {
					local269 = Class17.method130(local33);
					if (local269.aByteArray3 == null) {
						local295 = "It's a " + local269.aString4 + ".";
					} else {
						local295 = new String(local269.aByteArray3);
					}
					this.method668(0, "", local295);
				}
				if (local28 == 330) {
					local350 = this.method638(local23, this.anInt876, 0, 0, 2, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					if (!local350) {
						this.method638(local23, this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					}
					this.anInt969 = super.anInt821;
					this.anInt970 = super.anInt822;
					this.anInt972 = 2;
					this.anInt971 = 0;
					this.aClass5_Sub1_Sub4_8.method426(37);
					this.aClass5_Sub1_Sub4_8.method462(local18 + this.anInt983);
					this.aClass5_Sub1_Sub4_8.method460(local33);
					this.aClass5_Sub1_Sub4_8.method461(local23 + this.anInt984);
				}
				@Pc(725) Class45 local725;
				if (local28 == 214) {
					local725 = Class45.method361(local23);
					@Pc(727) boolean local727 = true;
					if (local725.anInt670 > 0) {
						local727 = this.method706(local725);
					}
					if (local727) {
						this.aClass5_Sub1_Sub4_8.method426(27);
						this.aClass5_Sub1_Sub4_8.method428(local23);
					}
				}
				if (local28 == 916) {
					local350 = this.method638(local23, this.anInt876, 0, 0, 2, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					if (!local350) {
						this.method638(local23, this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					}
					this.anInt969 = super.anInt821;
					this.anInt970 = super.anInt822;
					this.anInt972 = 2;
					this.anInt971 = 0;
					this.aClass5_Sub1_Sub4_8.method426(227);
					this.aClass5_Sub1_Sub4_8.method460(local33);
					this.aClass5_Sub1_Sub4_8.method462(local18 + this.anInt983);
					this.aClass5_Sub1_Sub4_8.method428(local23 + this.anInt984);
				}
				if (local28 == 675) {
					local350 = this.method638(local23, this.anInt876, 0, 0, 2, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					if (!local350) {
						this.method638(local23, this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					}
					this.anInt969 = super.anInt821;
					this.anInt970 = super.anInt822;
					this.anInt972 = 2;
					this.anInt971 = 0;
					this.aClass5_Sub1_Sub4_8.method426(103);
					this.aClass5_Sub1_Sub4_8.method460(local18 + this.anInt983);
					this.aClass5_Sub1_Sub4_8.method460(this.anInt870);
					this.aClass5_Sub1_Sub4_8.method428(this.anInt871);
					this.aClass5_Sub1_Sub4_8.method428(local23 + this.anInt984);
					this.aClass5_Sub1_Sub4_8.method428(local33);
					this.aClass5_Sub1_Sub4_8.method462(this.anInt872);
				}
				if (local28 == 1958) {
					local210 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local33];
					if (local210 != null) {
						@Pc(951) Class24 local951 = local210.aClass24_1;
						if (local951.anIntArray61 != null) {
							local951 = local951.method155((byte) 9);
						}
						if (local951 != null) {
							if (local951.aByteArray5 == null) {
								local96 = "It's a " + local951.aString6 + ".";
							} else {
								local96 = new String(local951.aByteArray5);
							}
							this.method668(0, "", local96);
						}
					}
				}
				@Pc(996) Class5_Sub1_Sub1_Sub3_Sub2 local996;
				if (local28 == 843) {
					local996 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local33];
					if (local996 != null) {
						this.method638(local996.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local996.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						this.aClass5_Sub1_Sub4_8.method426(130);
						this.aClass5_Sub1_Sub4_8.method428(this.anInt883);
						this.aClass5_Sub1_Sub4_8.method460(local33);
					}
				}
				if (local28 == 940) {
					local996 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local33];
					if (local996 != null) {
						this.method638(local996.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local996.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						this.aClass5_Sub1_Sub4_8.method426(212);
						this.aClass5_Sub1_Sub4_8.method460(local33);
					}
				}
				if (local28 == 1836) {
					@Pc(1126) int local1126 = local33 >> 14 & 0x7FFF;
					@Pc(1129) Class8 local1129 = Class8.method40(local1126);
					if (local1129.aByteArray2 == null) {
						local96 = "It's a " + local1129.aString1 + ".";
					} else {
						local96 = new String(local1129.aByteArray2);
					}
					this.method668(0, "", local96);
				}
				if (local28 == 31) {
					local210 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local33];
					if (local210 != null) {
						this.method638(local210.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local210.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						this.aClass5_Sub1_Sub4_8.method426(184);
						this.aClass5_Sub1_Sub4_8.method462(local33);
						this.aClass5_Sub1_Sub4_8.method462(this.anInt883);
					}
				}
				if (local28 == 73) {
					this.aClass5_Sub1_Sub4_8.method426(87);
					this.aClass5_Sub1_Sub4_8.method428(local33);
					this.aClass5_Sub1_Sub4_8.method461(local18);
					this.aClass5_Sub1_Sub4_8.method462(local23);
					this.anInt955 = 0;
					this.anInt956 = local23;
					this.anInt957 = local18;
					this.anInt958 = 2;
					if (Class45.method361(local23).anInt640 == this.anInt940) {
						this.anInt958 = 1;
					}
					if (Class45.method361(local23).anInt640 == this.anInt990) {
						this.anInt958 = 3;
					}
				}
				if (local28 == 705) {
					this.aClass5_Sub1_Sub4_8.method426(205);
					this.aClass5_Sub1_Sub4_8.method428(local23);
					this.aClass5_Sub1_Sub4_8.method462(local18);
					this.aClass5_Sub1_Sub4_8.method460(local33);
					this.anInt955 = 0;
					this.anInt956 = local23;
					this.anInt957 = local18;
					this.anInt958 = 2;
					if (Class45.method361(local23).anInt640 == this.anInt940) {
						this.anInt958 = 1;
					}
					if (Class45.method361(local23).anInt640 == this.anInt990) {
						this.anInt958 = 3;
					}
				}
				if (local28 == 109) {
					this.method634(local23, (byte) 4, local18, local33);
					this.aClass5_Sub1_Sub4_8.method426(201);
					this.aClass5_Sub1_Sub4_8.method462(local33 >> 14 & 0x7FFF);
					this.aClass5_Sub1_Sub4_8.method460(local23 + this.anInt984);
					this.aClass5_Sub1_Sub4_8.method460(local18 + this.anInt983);
				}
				if (local28 == 477) {
					this.aClass5_Sub1_Sub4_8.method426(171);
					this.aClass5_Sub1_Sub4_8.method428(local23);
					this.aClass5_Sub1_Sub4_8.method460(local33);
					this.aClass5_Sub1_Sub4_8.method461(local18);
					this.anInt955 = 0;
					this.anInt956 = local23;
					this.anInt957 = local18;
					this.anInt958 = 2;
					if (Class45.method361(local23).anInt640 == this.anInt940) {
						this.anInt958 = 1;
					}
					if (Class45.method361(local23).anInt640 == this.anInt990) {
						this.anInt958 = 3;
					}
				}
				if (local28 == 657) {
					this.aClass5_Sub1_Sub4_8.method426(88);
					this.aClass5_Sub1_Sub4_8.method460(local18);
					this.aClass5_Sub1_Sub4_8.method460(local23);
					this.aClass5_Sub1_Sub4_8.method460(local33);
					this.aClass5_Sub1_Sub4_8.method460(this.anInt883);
					this.anInt955 = 0;
					this.anInt956 = local23;
					this.anInt957 = local18;
					this.anInt958 = 2;
					if (Class45.method361(local23).anInt640 == this.anInt940) {
						this.anInt958 = 1;
					}
					if (Class45.method361(local23).anInt640 == this.anInt990) {
						this.anInt958 = 3;
					}
				}
				if (local28 == 576) {
					local996 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local33];
					if (local996 != null) {
						this.method638(local996.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local996.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						this.aClass5_Sub1_Sub4_8.method426(79);
						this.aClass5_Sub1_Sub4_8.method460(local33);
					}
				}
				if (local28 == 277) {
					this.aClass5_Sub1_Sub4_8.method426(131);
					this.aClass5_Sub1_Sub4_8.method460(local18);
					this.aClass5_Sub1_Sub4_8.method460(local33);
					this.aClass5_Sub1_Sub4_8.method428(local23);
					this.anInt955 = 0;
					this.anInt956 = local23;
					this.anInt957 = local18;
					this.anInt958 = 2;
					if (Class45.method361(local23).anInt640 == this.anInt940) {
						this.anInt958 = 1;
					}
					if (Class45.method361(local23).anInt640 == this.anInt990) {
						this.anInt958 = 3;
					}
				}
				if (local28 == 726) {
					local74 = this.aStringArray13[arg0];
					local78 = local74.indexOf("@whi@");
					if (local78 != -1) {
						if (this.anInt940 == -1) {
							this.method694();
							this.aString22 = local74.substring(local78 + 5).trim();
							this.aBoolean271 = false;
							this.anInt1013 = this.anInt940 = Class45.anInt671;
						} else {
							this.method668(0, "", "Please close the interface you have open before using 'report abuse'");
						}
					}
				}
				if (local28 == 529) {
					this.method584(this.anInt918);
					this.anInt918 = -1;
					this.aBoolean246 = true;
				}
				if (local28 == 534) {
					local996 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local33];
					if (local996 != null) {
						this.method638(local996.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local996.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						anInt848 += local33;
						if (anInt848 >= 145) {
							this.aClass5_Sub1_Sub4_8.method426(19);
							this.aClass5_Sub1_Sub4_8.method431(0);
							anInt848 = 0;
						}
						this.aClass5_Sub1_Sub4_8.method426(78);
						this.aClass5_Sub1_Sub4_8.method462(local33);
					}
				}
				@Pc(1758) long local1758;
				if (local28 == 144) {
					local74 = this.aStringArray13[arg0];
					local78 = local74.indexOf("@whi@");
					if (local78 != -1) {
						local1758 = Class11.method47(local74.substring(local78 + 5).trim());
						local100 = -1;
						for (@Pc(1762) int local1762 = 0; local1762 < this.anInt845; local1762++) {
							if (this.aLongArray3[local1762] == local1758) {
								local100 = local1762;
								break;
							}
						}
						if (local100 != -1 && this.anIntArray229[local100] > 0) {
							this.aBoolean246 = true;
							this.anInt1030 = 0;
							this.aBoolean269 = true;
							this.aString26 = "";
							this.anInt847 = 3;
							this.aLong29 = this.aLongArray3[local100];
							this.aString30 = "Enter message to send to " + this.aStringArray11[local100];
						}
					}
				}
				if (local28 == 982) {
					local210 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local33];
					if (local210 != null) {
						this.method638(local210.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local210.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						anInt1043 += local33;
						if (anInt1043 >= 116) {
							this.aClass5_Sub1_Sub4_8.method426(69);
							anInt1043 = 0;
						}
						this.aClass5_Sub1_Sub4_8.method426(235);
						this.aClass5_Sub1_Sub4_8.method462(local33);
					}
				}
				if (local28 == 34) {
					this.aClass5_Sub1_Sub4_8.method426(93);
					this.aClass5_Sub1_Sub4_8.method461(local18);
					this.aClass5_Sub1_Sub4_8.method460(local33);
					this.aClass5_Sub1_Sub4_8.method428(local23);
					this.anInt955 = 0;
					this.anInt956 = local23;
					this.anInt957 = local18;
					this.anInt958 = 2;
					if (Class45.method361(local23).anInt640 == this.anInt940) {
						this.anInt958 = 1;
					}
					if (Class45.method361(local23).anInt640 == this.anInt990) {
						this.anInt958 = 3;
					}
				}
				if (local28 == 332) {
					this.anInt869 = 1;
					this.anInt870 = local18;
					this.anInt871 = local23;
					this.anInt872 = local33;
					this.aString18 = Class17.method130(local33).aString4;
					this.anInt882 = 0;
					this.aBoolean264 = true;
				} else {
					if (local28 == 168) {
						local210 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local33];
						if (local210 != null) {
							this.method638(local210.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local210.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
							this.anInt969 = super.anInt821;
							this.anInt970 = super.anInt822;
							this.anInt972 = 2;
							this.anInt971 = 0;
							if ((local33 & 0x3) == 0) {
								anInt1047++;
							}
							if (anInt1047 >= 84) {
								this.aClass5_Sub1_Sub4_8.method426(39);
								this.aClass5_Sub1_Sub4_8.method430(6583216);
								anInt1047 = 0;
							}
							this.aClass5_Sub1_Sub4_8.method426(53);
							this.aClass5_Sub1_Sub4_8.method462(local33);
						}
					}
					if (local28 == 790) {
						local350 = this.method638(local23, this.anInt876, 0, 0, 2, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						if (!local350) {
							this.method638(local23, this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						}
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						this.aClass5_Sub1_Sub4_8.method426(94);
						this.aClass5_Sub1_Sub4_8.method462(local18 + this.anInt983);
						this.aClass5_Sub1_Sub4_8.method460(local23 + this.anInt984);
						this.aClass5_Sub1_Sub4_8.method460(local33);
					}
					if (local28 == 228) {
						local350 = this.method638(local23, this.anInt876, 0, 0, 2, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						if (!local350) {
							this.method638(local23, this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
						}
						this.anInt969 = super.anInt821;
						this.anInt970 = super.anInt822;
						this.anInt972 = 2;
						this.anInt971 = 0;
						if ((local18 & 0x3) == 0) {
							anInt1031++;
						}
						if (anInt1031 >= 93) {
							this.aClass5_Sub1_Sub4_8.method426(22);
							this.aClass5_Sub1_Sub4_8.method430(4706572);
							anInt1031 = 0;
						}
						this.aClass5_Sub1_Sub4_8.method426(1);
						this.aClass5_Sub1_Sub4_8.method461(local18 + this.anInt983);
						this.aClass5_Sub1_Sub4_8.method428(local23 + this.anInt984);
						this.aClass5_Sub1_Sub4_8.method460(local33);
					}
					if (local28 == 363) {
						this.aClass5_Sub1_Sub4_8.method426(43);
						this.aClass5_Sub1_Sub4_8.method461(local33);
						this.aClass5_Sub1_Sub4_8.method428(local18);
						this.aClass5_Sub1_Sub4_8.method428(local23);
						this.anInt955 = 0;
						this.anInt956 = local23;
						this.anInt957 = local18;
						this.anInt958 = 2;
						if (Class45.method361(local23).anInt640 == this.anInt940) {
							this.anInt958 = 1;
						}
						if (Class45.method361(local23).anInt640 == this.anInt990) {
							this.anInt958 = 3;
						}
					}
					if (local28 == 211) {
						this.aClass5_Sub1_Sub4_8.method426(27);
						this.aClass5_Sub1_Sub4_8.method428(local23);
						local725 = Class45.method361(local23);
						if (local725.anIntArrayArray11 != null && local725.anIntArrayArray11[0][0] == 5) {
							local78 = local725.anIntArrayArray11[0][1];
							if (this.anIntArray231[local78] != local725.anIntArray130[0]) {
								this.anIntArray231[local78] = local725.anIntArray130[0];
								this.method612(local78);
								this.aBoolean264 = true;
							}
						}
					}
					if (local28 == 854) {
						local725 = Class45.method361(local23);
						this.anInt882 = 1;
						this.anInt883 = local23;
						this.anInt884 = local725.anInt656;
						this.anInt869 = 0;
						this.aBoolean264 = true;
						local295 = local725.aString12;
						if (local295.indexOf(" ") != -1) {
							local295 = local295.substring(0, local295.indexOf(" "));
						}
						local96 = local725.aString12;
						if (local96.indexOf(" ") != -1) {
							local96 = local96.substring(local96.indexOf(" ") + 1);
						}
						this.aString19 = local295 + " " + local725.aString15 + " " + local96;
						if (this.anInt884 == 16) {
							this.aBoolean264 = true;
							this.anInt967 = 3;
							this.aBoolean241 = true;
						}
					} else {
						if (local28 == 38) {
							this.aClass5_Sub1_Sub4_8.method426(209);
							this.aClass5_Sub1_Sub4_8.method461(local18);
							this.aClass5_Sub1_Sub4_8.method428(local33);
							this.aClass5_Sub1_Sub4_8.method428(local23);
							this.anInt955 = 0;
							this.anInt956 = local23;
							this.anInt957 = local18;
							this.anInt958 = 2;
							if (Class45.method361(local23).anInt640 == this.anInt940) {
								this.anInt958 = 1;
							}
							if (Class45.method361(local23).anInt640 == this.anInt990) {
								this.anInt958 = 3;
							}
						}
						if (local28 == 579) {
							anInt906 += local23;
							if (anInt906 >= 112) {
								this.aClass5_Sub1_Sub4_8.method426(192);
								this.aClass5_Sub1_Sub4_8.method431(0);
								anInt906 = 0;
							}
							this.method634(local23, (byte) 4, local18, local33);
							this.aClass5_Sub1_Sub4_8.method426(71);
							this.aClass5_Sub1_Sub4_8.method461(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_8.method462(local23 + this.anInt984);
							this.aClass5_Sub1_Sub4_8.method462(local18 + this.anInt983);
						}
						if (local28 == 678 || local28 == 495 || local28 == 633 || local28 == 663) {
							local74 = this.aStringArray13[arg0];
							local78 = local74.indexOf("@whi@");
							if (local78 != -1) {
								local1758 = Class11.method47(local74.substring(local78 + 5).trim());
								if (local28 == 678) {
									this.method590(this.anInt1040, local1758);
								}
								if (local28 == 495) {
									this.method708(local1758);
								}
								if (local28 == 633) {
									this.method701(local1758);
								}
								if (local28 == 663) {
									this.method673(local1758);
								}
							}
						}
						if (local28 == 906 && this.method634(local23, (byte) 4, local18, local33)) {
							this.aClass5_Sub1_Sub4_8.method426(38);
							this.aClass5_Sub1_Sub4_8.method462(local18 + this.anInt983);
							this.aClass5_Sub1_Sub4_8.method460(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_8.method460(local23 + this.anInt984);
							this.aClass5_Sub1_Sub4_8.method462(this.anInt870);
							this.aClass5_Sub1_Sub4_8.method428(this.anInt872);
							this.aClass5_Sub1_Sub4_8.method428(this.anInt871);
						}
						if (local28 == 269) {
							local996 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local33];
							if (local996 != null) {
								this.method638(local996.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local996.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
								this.anInt969 = super.anInt821;
								this.anInt970 = super.anInt822;
								this.anInt972 = 2;
								this.anInt971 = 0;
								this.aClass5_Sub1_Sub4_8.method426(59);
								this.aClass5_Sub1_Sub4_8.method428(local33);
							}
						}
						if (local28 == 610) {
							this.aClass5_Sub1_Sub4_8.method426(117);
							this.aClass5_Sub1_Sub4_8.method460(local23);
							this.aClass5_Sub1_Sub4_8.method461(local33);
							this.aClass5_Sub1_Sub4_8.method460(local18);
							this.anInt955 = 0;
							this.anInt956 = local23;
							this.anInt957 = local18;
							this.anInt958 = 2;
							if (Class45.method361(local23).anInt640 == this.anInt940) {
								this.anInt958 = 1;
							}
							if (Class45.method361(local23).anInt640 == this.anInt990) {
								this.anInt958 = 3;
							}
						}
						if (local28 == 250) {
							local996 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local33];
							if (local996 != null) {
								this.method638(local996.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local996.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
								this.anInt969 = super.anInt821;
								this.anInt970 = super.anInt822;
								this.anInt972 = 2;
								this.anInt971 = 0;
								this.aClass5_Sub1_Sub4_8.method426(151);
								this.aClass5_Sub1_Sub4_8.method462(local33);
							}
						}
						if (local28 == 765) {
							if (this.aBoolean242) {
								this.aClass48_1.method512(local23 - 4, local18 - 4);
							} else {
								this.aClass48_1.method512(super.anInt822 - 4, super.anInt821 - 4);
							}
						}
						if (local28 == 856) {
							this.aClass5_Sub1_Sub4_8.method426(27);
							this.aClass5_Sub1_Sub4_8.method428(local23);
							local725 = Class45.method361(local23);
							if (local725.anIntArrayArray11 != null && local725.anIntArrayArray11[0][0] == 5) {
								local78 = local725.anIntArrayArray11[0][1];
								this.anIntArray231[local78] = 1 - this.anIntArray231[local78];
								this.method612(local78);
								this.aBoolean264 = true;
							}
						}
						if (local28 == 929) {
							this.aClass5_Sub1_Sub4_8.method426(254);
							this.aClass5_Sub1_Sub4_8.method461(local33);
							this.aClass5_Sub1_Sub4_8.method461(local23);
							this.aClass5_Sub1_Sub4_8.method460(local18);
							this.anInt955 = 0;
							this.anInt956 = local23;
							this.anInt957 = local18;
							this.anInt958 = 2;
							if (Class45.method361(local23).anInt640 == this.anInt940) {
								this.anInt958 = 1;
							}
							if (Class45.method361(local23).anInt640 == this.anInt990) {
								this.anInt958 = 3;
							}
						}
						if (local28 == 186) {
							anInt1033++;
							if (anInt1033 >= 112) {
								this.aClass5_Sub1_Sub4_8.method426(178);
								this.aClass5_Sub1_Sub4_8.method431(0);
								anInt1033 = 0;
							}
							this.method634(local23, (byte) 4, local18, local33);
							this.aClass5_Sub1_Sub4_8.method426(215);
							this.aClass5_Sub1_Sub4_8.method462(local18 + this.anInt983);
							this.aClass5_Sub1_Sub4_8.method428(local23 + this.anInt984);
							this.aClass5_Sub1_Sub4_8.method462(local33 >> 14 & 0x7FFF);
						}
						if (local28 == 179) {
							this.method634(local23, (byte) 4, local18, local33);
							this.aClass5_Sub1_Sub4_8.method426(75);
							this.aClass5_Sub1_Sub4_8.method461(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_8.method462(local18 + this.anInt983);
							this.aClass5_Sub1_Sub4_8.method460(local23 + this.anInt984);
						}
						if (local28 == 441) {
							local996 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local33];
							if (local996 != null) {
								this.method638(local996.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local996.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
								this.anInt969 = super.anInt821;
								this.anInt970 = super.anInt822;
								this.anInt972 = 2;
								this.anInt971 = 0;
								this.aClass5_Sub1_Sub4_8.method426(55);
								this.aClass5_Sub1_Sub4_8.method428(this.anInt871);
								this.aClass5_Sub1_Sub4_8.method428(this.anInt872);
								this.aClass5_Sub1_Sub4_8.method462(this.anInt870);
								this.aClass5_Sub1_Sub4_8.method462(local33);
							}
						}
						if (local28 == 450 && this.method634(local23, (byte) 4, local18, local33)) {
							this.aClass5_Sub1_Sub4_8.method426(84);
							this.aClass5_Sub1_Sub4_8.method461(local18 + this.anInt983);
							this.aClass5_Sub1_Sub4_8.method460(local23 + this.anInt984);
							this.aClass5_Sub1_Sub4_8.method460(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_8.method428(this.anInt883);
						}
						if (local28 == 372) {
							local210 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local33];
							if (local210 != null) {
								this.method638(local210.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local210.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
								this.anInt969 = super.anInt821;
								this.anInt970 = super.anInt822;
								this.anInt972 = 2;
								this.anInt971 = 0;
								this.aClass5_Sub1_Sub4_8.method426(199);
								this.aClass5_Sub1_Sub4_8.method462(local33);
							}
						}
						if (local28 == 162) {
							local350 = this.method638(local23, this.anInt876, 0, 0, 2, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
							if (!local350) {
								this.method638(local23, this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local18, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
							}
							this.anInt969 = super.anInt821;
							this.anInt970 = super.anInt822;
							this.anInt972 = 2;
							this.anInt971 = 0;
							this.aClass5_Sub1_Sub4_8.method426(115);
							this.aClass5_Sub1_Sub4_8.method461(local33);
							this.aClass5_Sub1_Sub4_8.method460(local23 + this.anInt984);
							this.aClass5_Sub1_Sub4_8.method461(local18 + this.anInt983);
						}
						if (local28 == 754) {
							local210 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local33];
							if (local210 != null) {
								this.method638(local210.anIntArray105[0], this.anInt876, 1, 0, 2, 1, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, local210.anIntArray104[0], aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
								this.anInt969 = super.anInt821;
								this.anInt970 = super.anInt822;
								this.anInt972 = 2;
								this.anInt971 = 0;
								this.aClass5_Sub1_Sub4_8.method426(250);
								this.aClass5_Sub1_Sub4_8.method462(this.anInt870);
								this.aClass5_Sub1_Sub4_8.method462(this.anInt872);
								this.aClass5_Sub1_Sub4_8.method460(local33);
								this.aClass5_Sub1_Sub4_8.method462(this.anInt871);
							}
						}
						if (local28 == 131) {
							this.aClass5_Sub1_Sub4_8.method426(200);
							this.aClass5_Sub1_Sub4_8.method460(local18);
							this.aClass5_Sub1_Sub4_8.method461(this.anInt870);
							this.aClass5_Sub1_Sub4_8.method461(this.anInt872);
							this.aClass5_Sub1_Sub4_8.method460(this.anInt871);
							this.aClass5_Sub1_Sub4_8.method462(local23);
							this.aClass5_Sub1_Sub4_8.method428(local33);
							this.anInt955 = 0;
							this.anInt956 = local23;
							this.anInt957 = local18;
							this.anInt958 = 2;
							if (Class45.method361(local23).anInt640 == this.anInt940) {
								this.anInt958 = 1;
							}
							if (Class45.method361(local23).anInt640 == this.anInt990) {
								this.anInt958 = 3;
							}
						}
						this.anInt869 = 0;
						this.anInt882 = 0;
						this.aBoolean264 = true;
					}
				}
			}
		} catch (@Pc(3518) RuntimeException local3518) {
			signlink.reporterror("9304, " + arg0 + ", " + 51 + ", " + local3518.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method580() {
		try {
			this.aBoolean249 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("30058, " + -8 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method577() {
		try {
			if (!this.aBoolean252 && !this.aBoolean255 && !this.aBoolean244) {
				anInt1022++;
				if (this.aBoolean245) {
					this.method607();
				} else {
					this.method679(this.aByte38);
				}
				this.method674();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("83319, " + 9 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method629() {
		try {
			if (this.anInt1034 == 2) {
				for (@Pc(20) Class5_Sub2 local20 = (Class5_Sub2) this.aClass42_12.method299(); local20 != null; local20 = (Class5_Sub2) this.aClass42_12.method301(this.anInt1001)) {
					if (local20.anInt370 > 0) {
						local20.anInt370--;
					}
					if (local20.anInt370 != 0) {
						if (local20.anInt378 > 0) {
							local20.anInt378--;
						}
						if (local20.anInt378 == 0 && local20.anInt373 >= 1 && local20.anInt374 >= 1 && local20.anInt373 <= 102 && local20.anInt374 <= 102 && (local20.anInt375 < 0 || Class46.method415(local20.anInt377, local20.anInt375))) {
							this.method716(local20.anInt376, local20.anInt371, local20.anInt373, local20.anInt372, local20.anInt374, local20.anInt377, local20.anInt375);
							local20.anInt378 = -1;
							if (local20.anInt375 == local20.anInt379 && local20.anInt379 == -1) {
								local20.method423();
							} else if (local20.anInt375 == local20.anInt379 && local20.anInt376 == local20.anInt380 && local20.anInt377 == local20.anInt381) {
								local20.method423();
							}
						}
					} else if (local20.anInt379 < 0 || Class46.method415(local20.anInt381, local20.anInt379)) {
						this.method716(local20.anInt380, local20.anInt371, local20.anInt373, local20.anInt372, local20.anInt374, local20.anInt381, local20.anInt379);
						local20.method423();
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("4266, " + true + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIIII)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg5 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg6;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class5_Sub1_Sub1_Sub6.anIntArray172[local5];
				local27 = Class5_Sub1_Sub1_Sub6.anIntArray173[local5];
				local37 = local27 * 0 - arg6 * local23 >> 16;
				local17 = local23 * 0 + arg6 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class5_Sub1_Sub1_Sub6.anIntArray172[local11];
				local27 = Class5_Sub1_Sub1_Sub6.anIntArray173[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt976 = arg0 - local13;
			this.anInt977 = arg1 - local15;
			@Pc(96) boolean local96 = false;
			this.anInt978 = arg3 - local17;
			this.anInt979 = arg4;
			this.anInt980 = arg5;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("50726, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			@Pc(77) int local77 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local77 * (128 - local45) + local109 * local45 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("50921, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -738 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method632() {
		try {
			if (this.aClass10_19 == null) {
				super.aClass10_2 = null;
				this.aClass10_15 = null;
				this.aClass10_13 = null;
				this.aClass10_12 = null;
				this.aClass10_14 = null;
				this.aClass10_16 = null;
				this.aClass10_17 = null;
				this.aClass10_18 = null;
				this.aClass10_22 = new Class10(265, this.method581(), false, 128);
				Class5_Sub1_Sub2.method333();
				this.aClass10_23 = new Class10(265, this.method581(), false, 128);
				Class5_Sub1_Sub2.method333();
				this.aClass10_19 = new Class10(171, this.method581(), false, 509);
				Class5_Sub1_Sub2.method333();
				this.aClass10_20 = new Class10(132, this.method581(), false, 360);
				Class5_Sub1_Sub2.method333();
				this.aClass10_21 = new Class10(200, this.method581(), false, 360);
				Class5_Sub1_Sub2.method333();
				this.aClass10_24 = new Class10(238, this.method581(), false, 202);
				Class5_Sub1_Sub2.method333();
				this.aClass10_25 = new Class10(238, this.method581(), false, 203);
				Class5_Sub1_Sub2.method333();
				this.aClass10_26 = new Class10(94, this.method581(), false, 74);
				Class5_Sub1_Sub2.method333();
				this.aClass10_27 = new Class10(94, this.method581(), false, 75);
				Class5_Sub1_Sub2.method333();
				if (this.aClass31_2 != null) {
					this.method611();
					this.method709();
				}
				this.aBoolean249 = true;
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("35835, " + 9 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method633(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean273) {
				signlink.anInt1059 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("43033, " + arg0 + ", " + arg1 + ", " + -3220 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)Z")
	private boolean method634(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass48_1.method504(this.anInt948, arg2, arg0, arg3);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class8 local43 = Class8.method40(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt45;
					local54 = local43.anInt53;
				} else {
					local51 = local43.anInt53;
					local54 = local43.anInt45;
				}
				@Pc(65) int local65 = local43.anInt42;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method638(arg0, this.anInt876, local51, local65, 2, local54, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, false, arg2, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
			} else {
				this.method638(arg0, this.anInt876, 0, 0, 2, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], local31, false, arg2, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], local25 + 1);
			}
			anInt1007++;
			if (anInt1007 > 173) {
				anInt1007 = 0;
				this.aClass5_Sub1_Sub4_8.method426(230);
				this.aClass5_Sub1_Sub4_8.method428(2704);
			}
			this.anInt969 = super.anInt821;
			this.anInt970 = super.anInt822;
			this.anInt972 = 2;
			@Pc(161) boolean local161 = false;
			this.anInt971 = 0;
			return true;
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("93267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VYAVYWNE;B)Z")
	private boolean method635(@OriginalArg(0) Class45 arg0) {
		try {
			if (arg0.anIntArray134 == null) {
				return false;
			}
			for (@Pc(13) int local13 = 0; local13 < arg0.anIntArray134.length; local13++) {
				@Pc(21) int local21 = this.method640(local13, arg0);
				@Pc(26) int local26 = arg0.anIntArray130[local13];
				if (arg0.anIntArray134[local13] == 2) {
					if (local21 >= local26) {
						return false;
					}
				} else if (arg0.anIntArray134[local13] == 3) {
					if (local21 <= local26) {
						return false;
					}
				} else if (arg0.anIntArray134[local13] == 4) {
					if (local21 == local26) {
						return false;
					}
				} else if (local21 != local26) {
					return false;
				}
			}
			return true;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("86883, " + arg0 + ", " + 7 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBIIII)V")
	private void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(3) Class5_Sub2 local3 = null;
			for (@Pc(8) Class5_Sub2 local8 = (Class5_Sub2) this.aClass42_12.method299(); local8 != null; local8 = (Class5_Sub2) this.aClass42_12.method301(this.anInt1001)) {
				if (local8.anInt371 == arg2 && local8.anInt373 == arg3 && local8.anInt374 == arg4 && local8.anInt372 == arg9) {
					local3 = local8;
					break;
				}
			}
			if (local3 == null) {
				local3 = new Class5_Sub2();
				local3.anInt371 = arg2;
				local3.anInt372 = arg9;
				local3.anInt373 = arg3;
				local3.anInt374 = arg4;
				this.method646(local3);
				this.aClass42_12.method296(local3);
			}
			local3.anInt375 = arg0;
			@Pc(72) boolean local72 = false;
			local3.anInt377 = arg1;
			local3.anInt376 = arg8;
			local3.anInt378 = arg6;
			local3.anInt370 = arg7;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("54557, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method637(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1061 = arg0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("54700, " + -109 + ", " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	private boolean method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray23[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			if (arg1 < 1 || arg1 > 1) {
				this.aBoolean268 = !this.aBoolean268;
			}
			local11 = arg6;
			@Pc(53) int local53 = arg10;
			this.anIntArrayArray23[arg6][arg10] = 99;
			this.anIntArrayArray24[arg6][arg10] = 0;
			@Pc(69) byte local69 = 0;
			@Pc(71) int local71 = 0;
			this.anIntArray252[0] = arg6;
			@Pc(80) int local80 = local69 + 1;
			this.anIntArray253[0] = arg10;
			@Pc(84) boolean local84 = false;
			@Pc(88) int local88 = this.anIntArray252.length;
			@Pc(95) int[][] local95 = this.aClass16Array1[this.anInt948].anIntArrayArray3;
			@Pc(206) int local206;
			while (local71 != local80) {
				local11 = this.anIntArray252[local71];
				local53 = this.anIntArray253[local71];
				local71 = (local71 + 1) % local88;
				if (local11 == arg9 && local53 == arg0) {
					local84 = true;
					break;
				}
				if (arg11 != 0) {
					if ((arg11 < 5 || arg11 == 10) && this.aClass16Array1[this.anInt948].method115(arg9, arg0, local11, arg7, arg11 - 1, local53)) {
						local84 = true;
						break;
					}
					if (arg11 < 10 && this.aClass16Array1[this.anInt948].method116(local53, arg11 - 1, arg7, local11, arg0, arg9)) {
						local84 = true;
						break;
					}
				}
				if (arg2 != 0 && arg5 != 0 && this.aClass16Array1[this.anInt948].method117(local53, arg5, arg3, arg0, arg9, arg2, local11)) {
					local84 = true;
					break;
				}
				local206 = this.anIntArrayArray24[local11][local53] + 1;
				if (local11 > 0 && this.anIntArrayArray23[local11 - 1][local53] == 0 && (local95[local11 - 1][local53] & 0x1280108) == 0) {
					this.anIntArray252[local80] = local11 - 1;
					this.anIntArray253[local80] = local53;
					local80 = (local80 + 1) % local88;
					this.anIntArrayArray23[local11 - 1][local53] = 2;
					this.anIntArrayArray24[local11 - 1][local53] = local206;
				}
				if (local11 < 103 && this.anIntArrayArray23[local11 + 1][local53] == 0 && (local95[local11 + 1][local53] & 0x1280180) == 0) {
					this.anIntArray252[local80] = local11 + 1;
					this.anIntArray253[local80] = local53;
					local80 = (local80 + 1) % local88;
					this.anIntArrayArray23[local11 + 1][local53] = 8;
					this.anIntArrayArray24[local11 + 1][local53] = local206;
				}
				if (local53 > 0 && this.anIntArrayArray23[local11][local53 - 1] == 0 && (local95[local11][local53 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local80] = local11;
					this.anIntArray253[local80] = local53 - 1;
					local80 = (local80 + 1) % local88;
					this.anIntArrayArray23[local11][local53 - 1] = 1;
					this.anIntArrayArray24[local11][local53 - 1] = local206;
				}
				if (local53 < 103 && this.anIntArrayArray23[local11][local53 + 1] == 0 && (local95[local11][local53 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local80] = local11;
					this.anIntArray253[local80] = local53 + 1;
					local80 = (local80 + 1) % local88;
					this.anIntArrayArray23[local11][local53 + 1] = 4;
					this.anIntArrayArray24[local11][local53 + 1] = local206;
				}
				if (local11 > 0 && local53 > 0 && this.anIntArrayArray23[local11 - 1][local53 - 1] == 0 && (local95[local11 - 1][local53 - 1] & 0x128010E) == 0 && (local95[local11 - 1][local53] & 0x1280108) == 0 && (local95[local11][local53 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local80] = local11 - 1;
					this.anIntArray253[local80] = local53 - 1;
					local80 = (local80 + 1) % local88;
					this.anIntArrayArray23[local11 - 1][local53 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local53 - 1] = local206;
				}
				if (local11 < 103 && local53 > 0 && this.anIntArrayArray23[local11 + 1][local53 - 1] == 0 && (local95[local11 + 1][local53 - 1] & 0x1280183) == 0 && (local95[local11 + 1][local53] & 0x1280180) == 0 && (local95[local11][local53 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local80] = local11 + 1;
					this.anIntArray253[local80] = local53 - 1;
					local80 = (local80 + 1) % local88;
					this.anIntArrayArray23[local11 + 1][local53 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local53 - 1] = local206;
				}
				if (local11 > 0 && local53 < 103 && this.anIntArrayArray23[local11 - 1][local53 + 1] == 0 && (local95[local11 - 1][local53 + 1] & 0x1280138) == 0 && (local95[local11 - 1][local53] & 0x1280108) == 0 && (local95[local11][local53 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local80] = local11 - 1;
					this.anIntArray253[local80] = local53 + 1;
					local80 = (local80 + 1) % local88;
					this.anIntArrayArray23[local11 - 1][local53 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local53 + 1] = local206;
				}
				if (local11 < 103 && local53 < 103 && this.anIntArrayArray23[local11 + 1][local53 + 1] == 0 && (local95[local11 + 1][local53 + 1] & 0x12801E0) == 0 && (local95[local11 + 1][local53] & 0x1280180) == 0 && (local95[local11][local53 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local80] = local11 + 1;
					this.anIntArray253[local80] = local53 + 1;
					local80 = (local80 + 1) % local88;
					this.anIntArrayArray23[local11 + 1][local53 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local53 + 1] = local206;
				}
			}
			this.anInt1012 = 0;
			@Pc(822) int local822;
			@Pc(828) int local828;
			@Pc(834) int local834;
			if (!local84) {
				if (arg8) {
					local206 = 100;
					for (local822 = 1; local822 < 2; local822++) {
						for (local828 = arg9 - local822; local828 <= arg9 + local822; local828++) {
							for (local834 = arg0 - local822; local834 <= arg0 + local822; local834++) {
								if (local828 >= 0 && local834 >= 0 && local828 < 104 && local834 < 104 && this.anIntArrayArray24[local828][local834] < local206) {
									local206 = this.anIntArrayArray24[local828][local834];
									local11 = local828;
									local53 = local834;
									this.anInt1012 = 1;
									local84 = true;
								}
							}
						}
						if (local84) {
							break;
						}
					}
				}
				if (!local84) {
					return false;
				}
			}
			@Pc(895) byte local895 = 0;
			this.anIntArray252[0] = local11;
			local71 = local895 + 1;
			this.anIntArray253[0] = local53;
			local206 = local822 = this.anIntArrayArray23[local11][local53];
			while (local11 != arg6 || local53 != arg10) {
				if (local206 != local822) {
					local822 = local206;
					this.anIntArray252[local71] = local11;
					this.anIntArray253[local71++] = local53;
				}
				if ((local206 & 0x2) != 0) {
					local11++;
				} else if ((local206 & 0x8) != 0) {
					local11--;
				}
				if ((local206 & 0x1) != 0) {
					local53++;
				} else if ((local206 & 0x4) != 0) {
					local53--;
				}
				local206 = this.anIntArrayArray23[local11][local53];
			}
			if (local71 > 0) {
				local88 = local71;
				if (local71 > 25) {
					local88 = 25;
				}
				local71--;
				local828 = this.anIntArray252[local71];
				local834 = this.anIntArray253[local71];
				if (arg4 == 0) {
					this.aClass5_Sub1_Sub4_8.method426(217);
					this.aClass5_Sub1_Sub4_8.method427(local88 + local88 + 3);
				}
				if (arg4 == 1) {
					this.aClass5_Sub1_Sub4_8.method426(180);
					this.aClass5_Sub1_Sub4_8.method427(local88 + local88 + 3 + 14);
				}
				if (arg4 == 2) {
					this.aClass5_Sub1_Sub4_8.method426(222);
					this.aClass5_Sub1_Sub4_8.method427(local88 + local88 + 3);
				}
				this.aClass5_Sub1_Sub4_8.method453(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass5_Sub1_Sub4_8.method462(local828 + this.anInt983);
				this.aClass5_Sub1_Sub4_8.method428(local834 + this.anInt984);
				this.anInt892 = this.anIntArray252[0];
				this.anInt893 = this.anIntArray253[0];
				for (@Pc(1081) int local1081 = 1; local1081 < local88; local1081++) {
					local71--;
					this.aClass5_Sub1_Sub4_8.method453(this.anIntArray252[local71] - local828);
					this.aClass5_Sub1_Sub4_8.method454(this.anInt968, this.anIntArray253[local71] - local834);
				}
				return true;
			} else if (arg4 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1119) RuntimeException local1119) {
			signlink.reporterror("56178, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!VYAVYWNE;)I")
	private int method640(@OriginalArg(1) int arg0, @OriginalArg(2) Class45 arg1) {
		try {
			if (arg1.anIntArrayArray11 == null || arg0 >= arg1.anIntArrayArray11.length) {
				return -2;
			}
			try {
				@Pc(25) int[] local25 = arg1.anIntArrayArray11[arg0];
				@Pc(27) int local27 = 0;
				@Pc(29) int local29 = 0;
				@Pc(31) byte local31 = 0;
				while (true) {
					@Pc(36) int local36 = local25[local29++];
					@Pc(38) int local38 = 0;
					@Pc(40) byte local40 = 0;
					if (local36 == 0) {
						return local27;
					}
					if (local36 == 1) {
						local38 = this.anIntArray218[local25[local29++]];
					}
					if (local36 == 2) {
						local38 = this.anIntArray213[local25[local29++]];
					}
					if (local36 == 3) {
						local38 = this.anIntArray270[local25[local29++]];
					}
					@Pc(86) Class45 local86;
					@Pc(91) int local91;
					@Pc(104) int local104;
					if (local36 == 4) {
						local86 = Class45.method361(local25[local29++]);
						local91 = local25[local29++];
						if (local91 >= 0 && local91 < Class17.anInt255 && (!Class17.method130(local91).aBoolean87 || aBoolean257)) {
							for (local104 = 0; local104 < local86.anIntArray131.length; local104++) {
								if (local86.anIntArray131[local104] == local91 + 1) {
									local38 += local86.anIntArray126[local104];
								}
							}
						}
					}
					if (local36 == 5) {
						local38 = this.anIntArray231[local25[local29++]];
					}
					if (local36 == 6) {
						local38 = anIntArray266[this.anIntArray213[local25[local29++]] - 1];
					}
					if (local36 == 7) {
						local38 = this.anIntArray231[local25[local29++]] * 100 / 46875;
					}
					if (local36 == 8) {
						local38 = aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt517;
					}
					@Pc(179) int local179;
					if (local36 == 9) {
						for (local179 = 0; local179 < Class40.anInt590; local179++) {
							if (Class40.aBooleanArray5[local179]) {
								local38 += this.anIntArray213[local179];
							}
						}
					}
					if (local36 == 10) {
						local86 = Class45.method361(local25[local29++]);
						local91 = local25[local29++] + 1;
						if (local91 >= 0 && local91 < Class17.anInt255 && (!Class17.method130(local91).aBoolean87 || aBoolean257)) {
							for (local104 = 0; local104 < local86.anIntArray131.length; local104++) {
								if (local86.anIntArray131[local104] == local91) {
									local38 = 999999999;
									break;
								}
							}
						}
					}
					if (local36 == 11) {
						local38 = this.anInt1032;
					}
					if (local36 == 12) {
						local38 = this.anInt995;
					}
					if (local36 == 13) {
						local179 = this.anIntArray231[local25[local29++]];
						local91 = local25[local29++];
						local38 = (local179 & 0x1 << local91) == 0 ? 0 : 1;
					}
					if (local36 == 14) {
						local179 = local25[local29++];
						@Pc(293) Class18 local293 = Class18.aClass18Array1[local179];
						local104 = local293.anInt273;
						@Pc(299) int local299 = local293.anInt274;
						@Pc(302) int local302 = local293.anInt275;
						@Pc(308) int local308 = anIntArray236[local302 - local299];
						local38 = this.anIntArray231[local104] >> local299 & local308;
					}
					if (local36 == 15) {
						local40 = 1;
					}
					if (local36 == 16) {
						local40 = 2;
					}
					if (local36 == 17) {
						local40 = 3;
					}
					if (local36 == 18) {
						local38 = (aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 >> 7) + this.anInt983;
					}
					if (local36 == 19) {
						local38 = (aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 >> 7) + this.anInt984;
					}
					if (local36 == 20) {
						local38 = local25[local29++];
					}
					if (local40 == 0) {
						if (local31 == 0) {
							local27 += local38;
						}
						if (local31 == 1) {
							local27 -= local38;
						}
						if (local31 == 2 && local38 != 0) {
							local27 /= local38;
						}
						if (local31 == 3) {
							local27 *= local38;
						}
						local31 = 0;
					} else {
						local31 = local40;
					}
				}
			} catch (@Pc(401) Exception local401) {
				return -1;
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("59116, " + false + ", " + arg0 + ", " + arg1 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method641() {
		try {
			this.aClass10_15.method44();
			Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray242;
			this.aClass5_Sub1_Sub2_Sub3_18.method326(0, 0);
			if (this.aBoolean269) {
				this.aClass5_Sub1_Sub2_Sub1_4.method178(this.aString30, 0, 40, 239);
				this.aClass5_Sub1_Sub2_Sub1_4.method178(this.aString26 + "*", 128, 60, 239);
			} else if (this.anInt1030 == 1) {
				this.aClass5_Sub1_Sub2_Sub1_4.method178("Enter amount:", 0, 40, 239);
				this.aClass5_Sub1_Sub2_Sub1_4.method178(this.aString17 + "*", 128, 60, 239);
			} else if (this.anInt1030 == 2) {
				this.aClass5_Sub1_Sub2_Sub1_4.method178("Enter name:", 0, 40, 239);
				this.aClass5_Sub1_Sub2_Sub1_4.method178(this.aString17 + "*", 128, 60, 239);
			} else if (this.aString23 != null) {
				this.aClass5_Sub1_Sub2_Sub1_4.method178(this.aString23, 0, 40, 239);
				this.aClass5_Sub1_Sub2_Sub1_4.method178("Click to continue", 128, 60, 239);
			} else if (this.anInt990 != -1) {
				this.method621(0, 0, Class45.method361(this.anInt990), 0);
			} else if (this.anInt918 == -1) {
				@Pc(170) Class5_Sub1_Sub2_Sub1 local170 = this.aClass5_Sub1_Sub2_Sub1_3;
				@Pc(172) int local172 = 0;
				Class5_Sub1_Sub2.method332(0, 77, 0, 463);
				for (@Pc(180) int local180 = 0; local180 < 100; local180++) {
					if (this.aStringArray9[local180] != null) {
						@Pc(192) int local192 = this.anIntArray219[local180];
						@Pc(201) int local201 = this.anInt1027 + 70 - local172 * 14;
						@Pc(206) String local206 = this.aStringArray8[local180];
						@Pc(208) byte local208 = 0;
						if (local206 != null && local206.startsWith("@cr1@")) {
							local206 = local206.substring(5);
							local208 = 1;
						}
						if (local206 != null && local206.startsWith("@cr2@")) {
							local206 = local206.substring(5);
							local208 = 2;
						}
						if (local192 == 0) {
							if (local201 > 0 && local201 < 110) {
								local170.method182(local201, 4, 0, this.aStringArray9[local180], (byte) 6);
							}
							local172++;
						}
						@Pc(278) int local278;
						if ((local192 == 1 || local192 == 2) && (local192 == 1 || this.anInt833 == 0 || this.anInt833 == 1 && this.method719(local206))) {
							if (local201 > 0 && local201 < 110) {
								local278 = 4;
								if (local208 == 1) {
									this.aClass5_Sub1_Sub2_Sub3Array3[0].method326(local201 - 12, 4);
									local278 += 14;
								}
								if (local208 == 2) {
									this.aClass5_Sub1_Sub2_Sub3Array3[1].method326(local201 - 12, local278);
									local278 += 14;
								}
								local170.method182(local201, local278, 0, local206 + ":", (byte) 6);
								local278 += local170.method180(local206) + 8;
								local170.method182(local201, local278, 255, this.aStringArray9[local180], (byte) 6);
							}
							local172++;
						}
						if ((local192 == 3 || local192 == 7) && this.anInt837 == 0 && (local192 == 7 || this.anInt950 == 0 || this.anInt950 == 1 && this.method719(local206))) {
							if (local201 > 0 && local201 < 110) {
								local170.method182(local201, 4, 0, "From", (byte) 6);
								local278 = local170.method180("From ") + 4;
								if (local208 == 1) {
									this.aClass5_Sub1_Sub2_Sub3Array3[0].method326(local201 - 12, local278);
									local278 += 14;
								}
								if (local208 == 2) {
									this.aClass5_Sub1_Sub2_Sub3Array3[1].method326(local201 - 12, local278);
									local278 += 14;
								}
								local170.method182(local201, local278, 0, local206 + ":", (byte) 6);
								local278 += local170.method180(local206) + 8;
								local170.method182(local201, local278, 8388608, this.aStringArray9[local180], (byte) 6);
							}
							local172++;
						}
						if (local192 == 4 && (this.anInt908 == 0 || this.anInt908 == 1 && this.method719(local206))) {
							if (local201 > 0 && local201 < 110) {
								local170.method182(local201, 4, 8388736, local206 + " " + this.aStringArray9[local180], (byte) 6);
							}
							local172++;
						}
						if (local192 == 5 && this.anInt837 == 0 && this.anInt950 < 2) {
							if (local201 > 0 && local201 < 110) {
								local170.method182(local201, 4, 8388608, this.aStringArray9[local180], (byte) 6);
							}
							local172++;
						}
						if (local192 == 6 && this.anInt837 == 0 && this.anInt950 < 2) {
							if (local201 > 0 && local201 < 110) {
								local170.method182(local201, 4, 0, "To " + local206 + ":", (byte) 6);
								local170.method182(local201, local170.method180("To " + local206) + 12, 8388608, this.aStringArray9[local180], (byte) 6);
							}
							local172++;
						}
						if (local192 == 8 && (this.anInt908 == 0 || this.anInt908 == 1 && this.method719(local206))) {
							if (local201 > 0 && local201 < 110) {
								local170.method182(local201, 4, 8270336, local206 + " " + this.aStringArray9[local180], (byte) 6);
							}
							local172++;
						}
					}
				}
				Class5_Sub1_Sub2.method331();
				this.anInt1019 = local172 * 14 + 7;
				if (this.anInt1019 < 78) {
					this.anInt1019 = 78;
				}
				this.method703(this.anInt1019, this.anInt1019 - this.anInt1027 - 77, 77, (byte) 8, 463, 0);
				@Pc(648) String local648;
				if (aClass5_Sub1_Sub1_Sub3_Sub2_1 == null || aClass5_Sub1_Sub1_Sub3_Sub2_1.aString10 == null) {
					local648 = Class11.method51(this.aString24);
				} else {
					local648 = aClass5_Sub1_Sub1_Sub3_Sub2_1.aString10;
				}
				local170.method182(90, 4, 0, local648 + ":", (byte) 6);
				local170.method182(90, local170.method180(local648 + ": ") + 6, 255, this.aString27 + "*", (byte) 6);
				Class5_Sub1_Sub2.method338(0, 77, 479, 0);
			} else {
				this.method621(0, 0, Class45.method361(this.anInt918), 0);
			}
			if (this.aBoolean242 && this.anInt852 == 2) {
				this.method683();
			}
			this.aClass10_15.method45(super.aGraphics2, 17, 357, this.anInt999);
			this.aClass10_14.method44();
			Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
		} catch (@Pc(730) RuntimeException local730) {
			signlink.reporterror("20669, " + -91 + ", " + local730.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method642() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1045);
			if (this.aClass26_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass26_Sub1_1.anInt407);
			}
			System.out.println("loop-cycle:" + anInt1022);
			System.out.println("draw-cycle:" + anInt834);
			System.out.println("ptype:" + this.anInt960);
			System.out.println("psize:" + this.anInt959);
			if (this.aClass1_1 != null) {
				this.aClass1_1.method6();
			}
			super.aBoolean228 = true;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("5018, " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method581() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("56061, " + 4 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method643() {
		try {
			if (super.anInt820 == 1) {
				if (super.anInt821 >= 6 && super.anInt821 <= 106 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt833 = (this.anInt833 + 1) % 4;
					this.aBoolean256 = true;
					this.aBoolean246 = true;
					this.aClass5_Sub1_Sub4_8.method426(206);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt833);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt950);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt908);
				}
				if (super.anInt821 >= 135 && super.anInt821 <= 235 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt950 = (this.anInt950 + 1) % 3;
					this.aBoolean256 = true;
					this.aBoolean246 = true;
					this.aClass5_Sub1_Sub4_8.method426(206);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt833);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt950);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt908);
				}
				if (super.anInt821 >= 273 && super.anInt821 <= 373 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt908 = (this.anInt908 + 1) % 3;
					this.aBoolean256 = true;
					this.aBoolean246 = true;
					this.aClass5_Sub1_Sub4_8.method426(206);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt833);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt950);
					this.aClass5_Sub1_Sub4_8.method427(this.anInt908);
				}
				if (super.anInt821 >= 412 && super.anInt821 <= 512 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					if (this.anInt940 == -1) {
						this.method694();
						this.aString22 = "";
						this.aBoolean271 = false;
						this.anInt1013 = this.anInt940 = Class45.anInt671;
						return;
					}
					this.method668(0, "", "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("82715, " + 0 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method644() {
		try {
			while (true) {
				@Pc(11) int local11 = this.method575();
				if (local11 == -1) {
					return;
				}
				if (this.anInt940 != -1 && this.anInt940 == this.anInt1013) {
					if (local11 == 8 && this.aString22.length() > 0) {
						this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
					}
					if ((local11 >= 97 && local11 <= 122 || local11 >= 65 && local11 <= 90 || local11 >= 48 && local11 <= 57 || local11 == 32) && this.aString22.length() < 12) {
						this.aString22 = this.aString22 + (char) local11;
					}
				} else {
					@Pc(192) int local192;
					if (this.aBoolean269) {
						if (local11 >= 32 && local11 <= 122 && this.aString26.length() < 80) {
							this.aString26 = this.aString26 + (char) local11;
							this.aBoolean246 = true;
						}
						if (local11 == 8 && this.aString26.length() > 0) {
							this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							this.aBoolean246 = true;
						}
						if (local11 == 13 || local11 == 10) {
							this.aBoolean269 = false;
							this.aBoolean246 = true;
							@Pc(151) long local151;
							if (this.anInt847 == 1) {
								local151 = Class11.method47(this.aString26);
								this.method590(this.anInt1040, local151);
							}
							if (this.anInt847 == 2 && this.anInt845 > 0) {
								local151 = Class11.method47(this.aString26);
								this.method701(local151);
							}
							if (this.anInt847 == 3 && this.aString26.length() > 0) {
								this.aClass5_Sub1_Sub4_8.method426(220);
								this.aClass5_Sub1_Sub4_8.method427(0);
								local192 = this.aClass5_Sub1_Sub4_8.anInt755;
								this.aClass5_Sub1_Sub4_8.method433(this.aByte37, this.aLong29);
								Class44.method305(this.aString26, this.aClass5_Sub1_Sub4_8);
								this.aClass5_Sub1_Sub4_8.method436(this.aClass5_Sub1_Sub4_8.anInt755 - local192);
								this.aString26 = Class44.method306(this.aString26);
								this.aString26 = Class50.method543(this.aString26);
								this.method668(6, Class11.method51(Class11.method48(this.anInt993, this.aLong29)), this.aString26);
								if (this.anInt950 == 2) {
									this.anInt950 = 1;
									this.aBoolean256 = true;
									this.aClass5_Sub1_Sub4_8.method426(206);
									this.aClass5_Sub1_Sub4_8.method427(this.anInt833);
									this.aClass5_Sub1_Sub4_8.method427(this.anInt950);
									this.aClass5_Sub1_Sub4_8.method427(this.anInt908);
								}
							}
							if (this.anInt847 == 4 && this.anInt880 < 100) {
								local151 = Class11.method47(this.aString26);
								this.method708(local151);
							}
							if (this.anInt847 == 5 && this.anInt880 > 0) {
								local151 = Class11.method47(this.aString26);
								this.method673(local151);
							}
						}
					} else if (this.anInt1030 == 1) {
						if (local11 >= 48 && local11 <= 57 && this.aString17.length() < 10) {
							this.aString17 = this.aString17 + (char) local11;
							this.aBoolean246 = true;
						}
						if (local11 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean246 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString17.length() > 0) {
								local192 = 0;
								try {
									local192 = Integer.parseInt(this.aString17);
								} catch (@Pc(371) Exception local371) {
								}
								this.aClass5_Sub1_Sub4_8.method426(114);
								this.aClass5_Sub1_Sub4_8.method431(local192);
							}
							this.anInt1030 = 0;
							this.aBoolean246 = true;
						}
					} else if (this.anInt1030 == 2) {
						if (local11 >= 32 && local11 <= 122 && this.aString17.length() < 12) {
							this.aString17 = this.aString17 + (char) local11;
							this.aBoolean246 = true;
						}
						if (local11 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean246 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString17.length() > 0) {
								this.aClass5_Sub1_Sub4_8.method426(104);
								this.aClass5_Sub1_Sub4_8.method433(this.aByte37, Class11.method47(this.aString17));
							}
							this.anInt1030 = 0;
							this.aBoolean246 = true;
						}
					} else if (this.anInt990 == -1 && this.anInt924 == -1) {
						if (local11 >= 32 && local11 <= 122 && this.aString27.length() < 80) {
							this.aString27 = this.aString27 + (char) local11;
							this.aBoolean246 = true;
						}
						if (local11 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean246 = true;
						}
						if ((local11 == 13 || local11 == 10) && this.aString27.length() > 0) {
							if (this.anInt1029 == 2) {
								if (this.aString27.equals("::clientdrop")) {
									this.method660();
								}
								if (this.aString27.equals("::lag")) {
									this.method642();
								}
								if (this.aString27.equals("::prefetchmusic")) {
									for (local192 = 0; local192 < this.aClass26_Sub1_1.method212(2, aBoolean243); local192++) {
										this.aClass26_Sub1_1.method209(2, (byte) 1, local192, 161);
									}
								}
								if (this.aString27.equals("::fpson")) {
									aBoolean247 = true;
								}
								if (this.aString27.equals("::fpsoff")) {
									aBoolean247 = false;
								}
								if (this.aString27.equals("::noclip")) {
									for (local192 = 0; local192 < 4; local192++) {
										for (@Pc(604) int local604 = 1; local604 < 103; local604++) {
											for (@Pc(608) int local608 = 1; local608 < 103; local608++) {
												this.aClass16Array1[local192].anIntArrayArray3[local604][local608] = 0;
											}
										}
									}
								}
							}
							if (this.aString27.startsWith("::")) {
								this.aClass5_Sub1_Sub4_8.method426(188);
								this.aClass5_Sub1_Sub4_8.method427(this.aString27.length() - 1);
								this.aClass5_Sub1_Sub4_8.method434(this.aString27.substring(2));
							} else {
								@Pc(663) String local663 = this.aString27.toLowerCase();
								@Pc(665) byte local665 = 0;
								if (local663.startsWith("yellow:")) {
									local665 = 0;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("red:")) {
									local665 = 1;
									this.aString27 = this.aString27.substring(4);
								} else if (local663.startsWith("green:")) {
									local665 = 2;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("cyan:")) {
									local665 = 3;
									this.aString27 = this.aString27.substring(5);
								} else if (local663.startsWith("purple:")) {
									local665 = 4;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("white:")) {
									local665 = 5;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("flash1:")) {
									local665 = 6;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("flash2:")) {
									local665 = 7;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("flash3:")) {
									local665 = 8;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("glow1:")) {
									local665 = 9;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("glow2:")) {
									local665 = 10;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("glow3:")) {
									local665 = 11;
									this.aString27 = this.aString27.substring(6);
								}
								local663 = this.aString27.toLowerCase();
								@Pc(837) byte local837 = 0;
								if (local663.startsWith("wave:")) {
									local837 = 1;
									this.aString27 = this.aString27.substring(5);
								} else if (local663.startsWith("wave2:")) {
									local837 = 2;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("shake:")) {
									local837 = 3;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("scroll:")) {
									local837 = 4;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("slide:")) {
									local837 = 5;
									this.aString27 = this.aString27.substring(6);
								}
								this.aClass5_Sub1_Sub4_8.method426(144);
								this.aClass5_Sub1_Sub4_8.method427(0);
								@Pc(918) int local918 = this.aClass5_Sub1_Sub4_8.anInt755;
								this.aClass5_Sub1_Sub4_8.method453(local665);
								this.aClass5_Sub1_Sub4_8.method453(local837);
								this.aClass5_Sub1_Sub4_6.anInt755 = 0;
								Class44.method305(this.aString27, this.aClass5_Sub1_Sub4_6);
								this.aClass5_Sub1_Sub4_8.method472(this.aClass5_Sub1_Sub4_6.anInt755, this.aClass5_Sub1_Sub4_6.aByteArray20);
								this.aClass5_Sub1_Sub4_8.method436(this.aClass5_Sub1_Sub4_8.anInt755 - local918);
								this.aString27 = Class44.method306(this.aString27);
								this.aString27 = Class50.method543(this.aString27);
								aClass5_Sub1_Sub1_Sub3_Sub2_1.aString9 = this.aString27;
								aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt492 = local665;
								aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt504 = local837;
								aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt462 = 150;
								if (this.anInt1029 == 2) {
									this.method668(2, "@cr2@" + aClass5_Sub1_Sub1_Sub3_Sub2_1.aString10, aClass5_Sub1_Sub1_Sub3_Sub2_1.aString9);
								} else if (this.anInt1029 == 1) {
									this.method668(2, "@cr1@" + aClass5_Sub1_Sub1_Sub3_Sub2_1.aString10, aClass5_Sub1_Sub1_Sub3_Sub2_1.aString9);
								} else {
									this.method668(2, aClass5_Sub1_Sub1_Sub3_Sub2_1.aString10, aClass5_Sub1_Sub1_Sub3_Sub2_1.aString9);
								}
								if (this.anInt833 == 2) {
									this.anInt833 = 3;
									this.aBoolean256 = true;
									this.aClass5_Sub1_Sub4_8.method426(206);
									this.aClass5_Sub1_Sub4_8.method427(this.anInt833);
									this.aClass5_Sub1_Sub4_8.method427(this.anInt950);
									this.aClass5_Sub1_Sub4_8.method427(this.anInt908);
								}
							}
							this.aString27 = "";
							this.aBoolean246 = true;
						}
					}
				}
			}
		} catch (@Pc(1071) RuntimeException local1071) {
			signlink.reporterror("75615, " + 513 + ", " + local1071.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method645(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("29062, " + 31545 + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!KLVJVWGL;I)V")
	private void method646(@OriginalArg(0) Class5_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt372 == 0) {
				local1 = this.aClass48_1.method500(arg0.anInt371, arg0.anInt373, arg0.anInt374);
			}
			if (arg0.anInt372 == 1) {
				local1 = this.aClass48_1.method501(arg0.anInt371, arg0.anInt374, arg0.anInt373);
			}
			if (arg0.anInt372 == 2) {
				local1 = this.aClass48_1.method502(arg0.anInt371, arg0.anInt373, arg0.anInt374);
			}
			if (arg0.anInt372 == 3) {
				local1 = this.aClass48_1.method503(arg0.anInt371, arg0.anInt373, arg0.anInt374);
			}
			if (local1 != 0) {
				@Pc(83) int local83 = this.aClass48_1.method504(arg0.anInt371, arg0.anInt373, arg0.anInt374, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local83 & 0x1F;
				local7 = local83 >> 6;
			}
			arg0.anInt379 = local3;
			arg0.anInt381 = local5;
			arg0.anInt380 = local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("28012, " + arg0 + ", " + 5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!XGRGMPUQ;II)V")
	private void method647(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method447();
			@Pc(7) int local7 = arg0.method448(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg0.method448(2);
				if (local15 == 0) {
					this.anIntArray265[this.anInt1026++] = this.anInt1024;
				} else {
					@Pc(45) int local45;
					@Pc(55) int local55;
					if (local15 == 1) {
						local45 = arg0.method448(3);
						aClass5_Sub1_Sub1_Sub3_Sub2_1.method237(local45, false);
						local55 = arg0.method448(1);
						if (local55 == 1) {
							this.anIntArray265[this.anInt1026++] = this.anInt1024;
						}
					} else {
						@Pc(99) int local99;
						if (local15 == 2) {
							local45 = arg0.method448(3);
							aClass5_Sub1_Sub1_Sub3_Sub2_1.method237(local45, true);
							local55 = arg0.method448(3);
							aClass5_Sub1_Sub1_Sub3_Sub2_1.method237(local55, true);
							local99 = arg0.method448(1);
							if (local99 == 1) {
								this.anIntArray265[this.anInt1026++] = this.anInt1024;
							}
						} else if (local15 == 3) {
							local45 = arg0.method448(1);
							this.anInt948 = arg0.method448(2);
							local55 = arg0.method448(7);
							local99 = arg0.method448(7);
							@Pc(144) int local144 = arg0.method448(1);
							if (local144 == 1) {
								this.anIntArray265[this.anInt1026++] = this.anInt1024;
							}
							aClass5_Sub1_Sub1_Sub3_Sub2_1.method239(local45 == 1, local55, local99);
						}
					}
				}
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("20683, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method648(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		try {
			if (aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 >> 7 == this.anInt892 && aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 >> 7 == this.anInt893) {
				this.anInt892 = 0;
			}
			@Pc(21) int local21 = this.anInt1025;
			if (arg1 != 4) {
				this.aBoolean231 = !this.aBoolean231;
			}
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(38) int local38 = 0; local38 < local21; local38++) {
				@Pc(44) Class5_Sub1_Sub1_Sub3_Sub2 local44;
				@Pc(49) int local49;
				if (arg0) {
					local44 = aClass5_Sub1_Sub1_Sub3_Sub2_1;
					local49 = this.anInt1024 << 14;
				} else {
					local44 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray264[local38]];
					local49 = this.anIntArray264[local38] << 14;
				}
				if (local44 != null && local44.method236()) {
					local44.aBoolean141 = false;
					if ((aBoolean258 && this.anInt1025 > 50 || this.anInt1025 > 200) && !arg0 && local44.anInt493 == local44.anInt506) {
						local44.aBoolean141 = true;
					}
					@Pc(100) int local100 = local44.anInt501 >> 7;
					@Pc(105) int local105 = local44.anInt502 >> 7;
					if (local100 >= 0 && local100 < 104 && local105 >= 0 && local105 < 104) {
						if (local44.aClass5_Sub1_Sub1_Sub6_1 == null || anInt1022 < local44.anInt525 || anInt1022 >= local44.anInt526) {
							if ((local44.anInt501 & 0x7F) == 64 && (local44.anInt502 & 0x7F) == 64) {
								if (this.anIntArrayArray25[local100][local105] == this.anInt1018) {
									continue;
								}
								this.anIntArrayArray25[local100][local105] = this.anInt1018;
							}
							local44.anInt519 = this.method631(local44.anInt501, local44.anInt502, this.anInt948);
							this.aClass48_1.method485(this.anInt902, local44.anInt501, local44.anInt519, 60, local49, local44.anInt502, this.anInt948, local44, local44.anInt503, local44.aBoolean137);
						} else {
							local44.aBoolean141 = false;
							local44.anInt519 = this.method631(local44.anInt501, local44.anInt502, this.anInt948);
							this.aClass48_1.method486(local44, local44.anInt501, local44.anInt513, local44.anInt519, this.anInt948, local49, local44.anInt503, local44.anInt514, local44.anInt502, local44.anInt516, local44.anInt515);
						}
					}
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("6536, " + arg0 + ", " + arg1 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!XGRGMPUQ;I)V")
	private void method649(@OriginalArg(1) Class5_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1017 = 0;
			this.anInt1026 = 0;
			this.method647(arg0, arg1);
			this.method717(arg1, arg0);
			this.method620(arg1, arg0);
			this.method591(arg1, arg0);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt1017; local34++) {
				local41 = this.anIntArray256[local34];
				if (this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local41].anInt461 != anInt1022) {
					this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local41] = null;
				}
			}
			if (arg0.anInt755 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt755 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt1025; local41++) {
				if (this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray264[local41]] == null) {
					signlink.reporterror(this.aString24 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt1025);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("58014, " + true + ", " + arg0 + ", " + arg1 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method650() {
		try {
			if (aBoolean258 && this.anInt1034 == 2 && Class46.anInt704 != this.anInt948) {
				this.method659(null, "Loading - please wait.");
				this.anInt1034 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt1034 == 1) {
				@Pc(32) int local32 = this.method651();
				if (local32 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString24 + " glcfb " + this.aLong33 + "," + local32 + "," + aBoolean258 + "," + this.aClass19Array1[0] + "," + this.aClass26_Sub1_1.method211() + "," + this.anInt948 + "," + this.anInt1048 + "," + this.anInt1049);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt1034 == 2 && this.anInt948 != this.anInt973) {
				this.anInt973 = this.anInt948;
				this.method664(this.anInt948);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("49770, " + false + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)I")
	private int method651() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray238[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray239[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray237[local41] >> 8) * 64 - this.anInt983;
					@Pc(74) int local74 = (this.anIntArray237[local41] & 0xFF) * 64 - this.anInt984;
					if (this.aBoolean240) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class46.method403(local62, local74, local48);
				}
			}
			this.aBoolean245 &= true;
			if (!local39) {
				return -3;
			} else if (this.aBoolean236) {
				return -4;
			} else {
				this.anInt1034 = 2;
				Class46.anInt704 = this.anInt948;
				this.method704();
				this.aClass5_Sub1_Sub4_8.method426(231);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("60976, " + true + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PDMJJHOP;IBI)V")
	private void method652(@OriginalArg(0) Class5_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt933 + this.anInt886 & 0x7FF;
			@Pc(15) int local15 = arg2 * arg2 + arg1 * arg1;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class5_Sub1_Sub1_Sub6.anIntArray172[local7];
				@Pc(27) int local27 = Class5_Sub1_Sub1_Sub6.anIntArray173[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt937 + 256);
				@Pc(55) int local55 = local27 * 256 / (this.anInt937 + 256);
				@Pc(65) int local65 = arg1 * local36 + arg2 * local55 >> 16;
				@Pc(75) int local75 = arg1 * local55 - arg2 * local36 >> 16;
				if (local15 > 2500) {
					arg0.method282(83 - local75 - arg0.anInt583 / 2 - 4, this.aClass5_Sub1_Sub2_Sub3_17, local65 + 94 + 4 - arg0.anInt582 / 2);
				} else {
					arg0.method276(83 - local75 - arg0.anInt583 / 2 - 4, local65 + 94 - arg0.anInt582 / 2 + 4);
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("3452, " + arg0 + ", " + arg1 + ", " + -26 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZLclient!VYAVYWNE;I)V")
	private void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class45 arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean272) {
				this.anInt842 = 32;
			} else {
				this.anInt842 = 0;
			}
			this.aBoolean272 = false;
			if (arg1 >= arg5 && arg1 < arg5 + 16 && arg0 >= arg3 && arg0 < arg3 + 16) {
				arg6.anInt676 -= this.anInt905 * 4;
				if (arg7 == 1) {
					this.aBoolean264 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean246 = true;
				}
			} else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg0 >= arg3 + arg4 - 16 && arg0 < arg3 + arg4) {
				arg6.anInt676 += this.anInt905 * 4;
				if (arg7 == 1) {
					this.aBoolean264 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean246 = true;
				}
			} else if (arg1 >= arg5 - this.anInt842 && arg1 < arg5 + this.anInt842 + 16 && arg0 >= arg3 + 16 && arg0 < arg3 + arg4 - 16 && this.anInt905 > 0) {
				@Pc(139) int local139 = (arg4 - 32) * arg4 / arg2;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(154) int local154 = arg0 - arg3 - local139 / 2 - 16;
				@Pc(160) int local160 = arg4 - local139 - 32;
				arg6.anInt676 = (arg2 - arg4) * local154 / local160;
				if (arg7 == 1) {
					this.aBoolean264 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean246 = true;
				}
				this.aBoolean272 = true;
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("28214, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + arg7 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!VYAVYWNE;B)V")
	private void method654(@OriginalArg(0) Class45 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt670;
			@Pc(9) boolean local9 = false;
			@Pc(72) int local72;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local72 = this.anInt845;
					if (this.anInt846 != 2) {
						local72 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local72) {
						arg0.aString13 = "";
						arg0.anInt654 = 0;
					} else {
						if (this.anIntArray229[local4] == 0) {
							arg0.aString13 = "@red@Offline";
						} else if (this.anIntArray229[local4] < 200) {
							if (this.anIntArray229[local4] == anInt987) {
								arg0.aString13 = "@gre@World" + (this.anIntArray229[local4] - 9);
							} else {
								arg0.aString13 = "@yel@World" + (this.anIntArray229[local4] - 9);
							}
						} else if (this.anIntArray229[local4] == anInt987) {
							arg0.aString13 = "@gre@Classic" + (this.anIntArray229[local4] - 219);
						} else {
							arg0.aString13 = "@yel@Classic" + (this.anIntArray229[local4] - 219);
						}
						arg0.anInt654 = 1;
					}
				} else if (local4 == 203) {
					local72 = this.anInt845;
					if (this.anInt846 != 2) {
						local72 = 0;
					}
					arg0.anInt641 = local72 * 15 + 20;
					if (arg0.anInt641 <= arg0.anInt650) {
						arg0.anInt641 = arg0.anInt650 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt846 == 0) {
						arg0.aString13 = "Loading ignore list";
						arg0.anInt654 = 0;
					} else if (local4 == 1 && this.anInt846 == 0) {
						arg0.aString13 = "Please wait...";
						arg0.anInt654 = 0;
					} else {
						local72 = this.anInt880;
						if (this.anInt846 == 0) {
							local72 = 0;
						}
						if (local4 >= local72) {
							arg0.aString13 = "";
							arg0.anInt654 = 0;
						} else {
							arg0.aString13 = Class11.method51(Class11.method48(this.anInt993, this.aLongArray4[local4]));
							arg0.anInt654 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt641 = this.anInt880 * 15 + 20;
					if (arg0.anInt641 <= arg0.anInt650) {
						arg0.anInt641 = arg0.anInt650 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt652 = 150;
					arg0.anInt653 = (int) (Math.sin((double) anInt1022 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean263) {
						for (local72 = 0; local72 < 7; local72++) {
							@Pc(386) int local386 = this.anIntArray215[local72];
							if (local386 >= 0 && !Class7.aClass7Array1[local386].method29(this.anInt874)) {
								return;
							}
						}
						this.aBoolean263 = false;
						@Pc(406) Class5_Sub1_Sub1_Sub6[] local406 = new Class5_Sub1_Sub1_Sub6[7];
						@Pc(408) int local408 = 0;
						for (@Pc(410) int local410 = 0; local410 < 7; local410++) {
							@Pc(417) int local417 = this.anIntArray215[local410];
							if (local417 >= 0) {
								local406[local408++] = Class7.aClass7Array1[local417].method30((byte) 7);
							}
						}
						@Pc(440) Class5_Sub1_Sub1_Sub6 local440 = new Class5_Sub1_Sub1_Sub6(local406, this.anInt936, local408);
						for (@Pc(442) int local442 = 0; local442 < 5; local442++) {
							if (this.anIntArray230[local442] != 0) {
								local440.method391(anIntArrayArray22[local442][0], anIntArrayArray22[local442][this.anIntArray230[local442]]);
								if (local442 == 1) {
									local440.method391(anIntArray240[0], anIntArray240[this.anIntArray230[local442]]);
								}
							}
						}
						local440.method384();
						local440.method385(Class32.aClass32Array1[aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt506].anIntArray96[0]);
						local440.method394(64, 850, -30, -50, -30, true);
						arg0.anInt662 = 5;
						arg0.anInt663 = 0;
						Class45.method366(local440);
					}
				} else if (local4 == 324) {
					if (this.aClass5_Sub1_Sub2_Sub2_5 == null) {
						this.aClass5_Sub1_Sub2_Sub2_5 = arg0.aClass5_Sub1_Sub2_Sub2_2;
						this.aClass5_Sub1_Sub2_Sub2_6 = arg0.aClass5_Sub1_Sub2_Sub2_1;
					}
					if (this.aBoolean270) {
						arg0.aClass5_Sub1_Sub2_Sub2_2 = this.aClass5_Sub1_Sub2_Sub2_6;
					} else {
						arg0.aClass5_Sub1_Sub2_Sub2_2 = this.aClass5_Sub1_Sub2_Sub2_5;
					}
				} else if (local4 == 325) {
					if (this.aClass5_Sub1_Sub2_Sub2_5 == null) {
						this.aClass5_Sub1_Sub2_Sub2_5 = arg0.aClass5_Sub1_Sub2_Sub2_2;
						this.aClass5_Sub1_Sub2_Sub2_6 = arg0.aClass5_Sub1_Sub2_Sub2_1;
					}
					if (this.aBoolean270) {
						arg0.aClass5_Sub1_Sub2_Sub2_2 = this.aClass5_Sub1_Sub2_Sub2_5;
					} else {
						arg0.aClass5_Sub1_Sub2_Sub2_2 = this.aClass5_Sub1_Sub2_Sub2_6;
					}
				} else if (local4 == 600) {
					arg0.aString13 = this.aString22;
					if (anInt1022 % 20 < 10) {
						arg0.aString13 = arg0.aString13 + "|";
					} else {
						arg0.aString13 = arg0.aString13 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt1029 < 1) {
							arg0.aString13 = "";
						} else if (this.aBoolean271) {
							arg0.anInt668 = 16711680;
							arg0.aString13 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt668 = 16777215;
							arg0.aString13 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(647) String local647;
					if (local4 == 660) {
						local72 = this.anInt954 - this.anInt922;
						if (local72 <= 0) {
							local647 = "earlier today";
						} else if (local72 == 1) {
							local647 = "yesterday";
						} else {
							local647 = local72 + " days ago";
						}
						arg0.aString13 = "You last logged in @red@" + local647 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt965 == 0) {
							arg0.aString13 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt965 <= this.anInt954) {
							arg0.aString13 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method655(this.anInt965);
						} else {
							local72 = this.anInt954 + 14 - this.anInt965;
							if (local72 <= 0) {
								local647 = "Earlier today";
							} else if (local72 == 1) {
								local647 = "Yesterday";
							} else {
								local647 = local72 + " days ago";
							}
							arg0.aString13 = local647 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method655(this.anInt965) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(765) String local765;
						if (this.anInt921 == 0) {
							local765 = "@yel@0 unread messages";
						} else if (this.anInt921 == 1) {
							local765 = "@gre@1 unread message";
						} else {
							local765 = "@gre@" + this.anInt921 + " unread messages";
						}
						arg0.aString13 = "You have " + local765 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt907 > 0 && this.anInt907 <= this.anInt954 + 10) {
							arg0.aString13 = "Last password change:\\n@gre@" + this.method655(this.anInt907);
						} else {
							arg0.aString13 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 664) {
						if (this.anInt992 == 0) {
							arg0.aString13 = "You have not yet set\\nany contact details.";
						}
						if (this.anInt992 == 1) {
							arg0.aString13 = "Contact Details Last Set:\\n@gre@" + this.method655(this.anInt953);
						}
						if (this.anInt992 == 2) {
							arg0.aString13 = "You need to set\\nnew contact details.";
						}
					}
					if (local4 == 665) {
						if (this.anInt1037 > 2 && !aBoolean257) {
							arg0.aString13 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt1037 > 2) {
							arg0.aString13 = "\\n\\nYou have @gre@" + this.anInt1037 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt1037 > 0) {
							arg0.aString13 = "You have @gre@" + this.anInt1037 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString13 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt1037 > 2 && !aBoolean257) {
							arg0.aString13 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt1037 > 0) {
							arg0.aString13 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString13 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt965 > this.anInt954) {
							arg0.aString13 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString13 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt846 == 0) {
				arg0.aString13 = "Loading friend list";
				arg0.anInt654 = 0;
			} else if (local4 == 1 && this.anInt846 == 1) {
				arg0.aString13 = "Connecting to friendserver";
				arg0.anInt654 = 0;
			} else if (local4 == 2 && this.anInt846 != 2) {
				arg0.aString13 = "Please wait...";
				arg0.anInt654 = 0;
			} else {
				local72 = this.anInt845;
				if (this.anInt846 != 2) {
					local72 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local72) {
					arg0.aString13 = "";
					arg0.anInt654 = 0;
				} else {
					arg0.aString13 = this.aStringArray11[local4];
					arg0.anInt654 = 1;
				}
			}
		} catch (@Pc(955) RuntimeException local955) {
			signlink.reporterror("56122, " + arg0 + ", " + arg1 + ", " + local955.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private String method655(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt954 + 10) {
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
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("83586, " + 34211 + ", " + arg0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method656(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString28 = "";
				this.aString29 = "Connecting to server...";
				this.method608(true);
			}
			this.aClass1_1 = new Class1(this, this.method678(anInt988 + 43594), (byte) -45);
			@Pc(30) long local30 = Class11.method47(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass5_Sub1_Sub4_8.anInt755 = 0;
			this.aClass5_Sub1_Sub4_8.method427(14);
			this.aClass5_Sub1_Sub4_8.method427(local37);
			this.aClass1_1.method5(2, this.aClass5_Sub1_Sub4_8.aByteArray20);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass1_1.method2();
			}
			@Pc(74) int local74 = this.aClass1_1.method2();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass1_1.method4(this.aClass5_Sub1_Sub4_7.aByteArray20, 0, 8);
				this.aClass5_Sub1_Sub4_7.anInt755 = 0;
				this.aLong33 = this.aClass5_Sub1_Sub4_7.method443();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong33 >> 32), (int) this.aLong33 };
				this.aClass5_Sub1_Sub4_8.anInt755 = 0;
				this.aClass5_Sub1_Sub4_8.method427(10);
				this.aClass5_Sub1_Sub4_8.method431(local99[0]);
				this.aClass5_Sub1_Sub4_8.method431(local99[1]);
				this.aClass5_Sub1_Sub4_8.method431(local99[2]);
				this.aClass5_Sub1_Sub4_8.method431(local99[3]);
				this.aClass5_Sub1_Sub4_8.method431(signlink.anInt1053);
				this.aClass5_Sub1_Sub4_8.method434(arg0);
				this.aClass5_Sub1_Sub4_8.method434(arg1);
				this.aClass5_Sub1_Sub4_8.method452(aBigInteger1, aBigInteger2);
				this.aClass5_Sub1_Sub4_9.anInt755 = 0;
				if (arg2) {
					this.aClass5_Sub1_Sub4_9.method427(18);
				} else {
					this.aClass5_Sub1_Sub4_9.method427(16);
				}
				this.aClass5_Sub1_Sub4_9.method427(this.aClass5_Sub1_Sub4_8.anInt755 + 36 + 1 + 1 + 2);
				this.aClass5_Sub1_Sub4_9.method427(255);
				this.aClass5_Sub1_Sub4_9.method428(347);
				this.aClass5_Sub1_Sub4_9.method427(aBoolean258 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass5_Sub1_Sub4_9.method431(this.anIntArray267[local225]);
				}
				this.aClass5_Sub1_Sub4_9.method435(this.aClass5_Sub1_Sub4_8.aByteArray20, this.aClass5_Sub1_Sub4_8.anInt755);
				this.aClass5_Sub1_Sub4_8.aClass13_1 = new Class13(-36942, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass13_2 = new Class13(-36942, local99);
				this.aClass1_1.method5(this.aClass5_Sub1_Sub4_9.anInt755, this.aClass5_Sub1_Sub4_9.aByteArray20);
				local74 = this.aClass1_1.method2();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method656(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt1029 = this.aClass1_1.method2();
					aBoolean262 = this.aClass1_1.method2() == 1;
					this.aLong31 = 0L;
					this.anInt895 = 0;
					this.aClass37_1.anInt558 = 0;
					super.aBoolean230 = true;
					this.aBoolean251 = true;
					this.aBoolean245 = true;
					this.aClass5_Sub1_Sub4_8.anInt755 = 0;
					this.aClass5_Sub1_Sub4_7.anInt755 = 0;
					this.anInt960 = -1;
					this.anInt1009 = -1;
					this.anInt1010 = -1;
					this.anInt1011 = -1;
					this.anInt959 = 0;
					this.anInt961 = 0;
					this.anInt900 = 0;
					this.anInt963 = 0;
					this.anInt875 = 0;
					this.anInt881 = 0;
					this.aBoolean242 = false;
					super.anInt813 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray9[local389] = null;
					}
					this.anInt869 = 0;
					this.anInt882 = 0;
					this.anInt1034 = 0;
					this.anInt891 = 0;
					this.anInt928 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1050 = (int) (Math.random() * 110.0D) - 55;
					this.anInt942 = (int) (Math.random() * 80.0D) - 40;
					this.anInt886 = (int) (Math.random() * 120.0D) - 60;
					this.anInt937 = (int) (Math.random() * 30.0D) - 20;
					this.anInt933 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt998 = 0;
					this.anInt973 = -1;
					this.anInt892 = 0;
					this.anInt893 = 0;
					this.anInt1025 = 0;
					this.anInt849 = 0;
					for (local225 = 0; local225 < this.anInt1023; local225++) {
						this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local225] = null;
						this.aClass5_Sub1_Sub4Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local259] = null;
					}
					aClass5_Sub1_Sub1_Sub3_Sub2_1 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[this.anInt1024] = new Class5_Sub1_Sub1_Sub3_Sub2();
					this.aClass42_11.method303();
					this.aClass42_10.method303();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass42ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass42_12 = new Class42((byte) 0);
					this.anInt846 = 0;
					this.anInt845 = 0;
					this.method584(this.anInt918);
					this.anInt918 = -1;
					this.method584(this.anInt990);
					this.anInt990 = -1;
					this.method584(this.anInt940);
					this.anInt940 = -1;
					this.method584(this.anInt924);
					this.anInt924 = -1;
					this.method584(this.anInt878);
					this.anInt878 = -1;
					this.method584(this.anInt951);
					this.anInt951 = -1;
					this.method584(this.anInt843);
					this.anInt843 = -1;
					this.aBoolean239 = false;
					this.anInt967 = 3;
					this.anInt1030 = 0;
					this.aBoolean242 = false;
					this.aBoolean269 = false;
					this.aString23 = null;
					this.anInt920 = 0;
					this.anInt1039 = -1;
					this.aBoolean270 = true;
					this.method695();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray230[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray10[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt925 = 0;
					anInt848 = 0;
					anInt1047 = 0;
					anInt1031 = 0;
					anInt1043 = 0;
					anInt906 = 0;
					anInt1033 = 0;
					this.method585();
				} else if (local74 == 3) {
					this.aString28 = "";
					this.aString29 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString28 = "Your account has been disabled.";
					this.aString29 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString28 = "Your account is already logged in.";
					this.aString29 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString28 = "RuneScape has been updated!";
					this.aString29 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString28 = "This world is full.";
					this.aString29 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString28 = "Unable to connect.";
					this.aString29 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString28 = "Login limit exceeded.";
					this.aString29 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString28 = "Unable to connect.";
					this.aString29 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString28 = "Login server rejected session.";
					this.aString29 = "Please try again.";
				} else if (local74 == 12) {
					this.aString28 = "You need a members account to login to this world.";
					this.aString29 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString28 = "Could not complete login.";
					this.aString29 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString28 = "The server is being updated.";
					this.aString29 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean245 = true;
					this.aClass5_Sub1_Sub4_8.anInt755 = 0;
					this.aClass5_Sub1_Sub4_7.anInt755 = 0;
					this.anInt960 = -1;
					this.anInt1009 = -1;
					this.anInt1010 = -1;
					this.anInt1011 = -1;
					this.anInt959 = 0;
					this.anInt961 = 0;
					this.anInt900 = 0;
					this.anInt881 = 0;
					this.aBoolean242 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString28 = "Login attempts exceeded.";
					this.aString29 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString28 = "You are standing in a members-only area.";
					this.aString29 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString28 = "Invalid loginserver requested";
					this.aString29 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass1_1.method2();
					for (@Pc(917) int local917 = local389 + 3; local917 >= 0; local917--) {
						this.aString28 = "You have only just left another world";
						this.aString29 = "Your profile will be transferred in: " + local917;
						this.method608(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(939) Exception local939) {
						}
					}
					this.method656(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString28 = "Malformed login packet.";
					this.aString29 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString28 = "Unexpected server response";
					this.aString29 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString28 = "No response from server";
					this.aString29 = "Please try using a different world.";
				} else if (this.anInt949 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(971) Exception local971) {
					}
					this.anInt949++;
					this.method656(arg0, arg1, arg2);
				} else {
					this.aString28 = "No response from loginserver";
					this.aString29 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1014) IOException local1014) {
			this.aString28 = "";
			this.aString29 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VSJQVIFL;I)V")
	private void method657(@OriginalArg(0) Class5_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray249.length; local10++) {
				this.anIntArray249[local10] = 0;
			}
			@Pc(35) int local35;
			for (@Pc(25) int local25 = 0; local25 < 5000; local25++) {
				local35 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray249[local35] = (int) (Math.random() * 256.0D);
			}
			@Pc(53) int local53;
			@Pc(57) int local57;
			@Pc(65) int local65;
			for (local35 = 0; local35 < 20; local35++) {
				for (local53 = 1; local53 < 255; local53++) {
					for (local57 = 1; local57 < 127; local57++) {
						local65 = local57 + (local53 << 7);
						this.anIntArray250[local65] = (this.anIntArray249[local65 - 1] + this.anIntArray249[local65 + 1] + this.anIntArray249[local65 - 128] + this.anIntArray249[local65 + 128]) / 4;
					}
				}
				@Pc(111) int[] local111 = this.anIntArray249;
				this.anIntArray249 = this.anIntArray250;
				this.anIntArray250 = local111;
			}
			if (arg0 != null) {
				local53 = 0;
				for (local57 = 0; local57 < arg0.anInt614; local57++) {
					for (local65 = 0; local65 < arg0.anInt613; local65++) {
						if (arg0.aByteArray13[local53++] != 0) {
							@Pc(147) int local147 = local65 + arg0.anInt615 + 16;
							@Pc(154) int local154 = local57 + arg0.anInt616 + 16;
							@Pc(160) int local160 = local147 + (local154 << 7);
							this.anIntArray249[local160] = 0;
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("86095, " + arg0 + ", " + 40149 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method658() {
		try {
			try {
				if (this.aClass1_1 != null) {
					this.aClass1_1.method1();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass1_1 = null;
			this.aBoolean245 = false;
			this.anInt835 = 0;
			this.aString24 = "";
			this.aString25 = "";
			this.method588();
			this.aClass48_1.method474();
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass16Array1[local36].method106();
			}
			System.gc();
			this.method669();
			this.anInt867 = -1;
			this.anInt923 = -1;
			this.anInt873 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("95569, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method659(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		try {
			this.aBoolean245 &= true;
			@Pc(17) int local17;
			if (this.aClass10_14 != null) {
				this.aClass10_14.method44();
				Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
				local17 = 151;
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass5_Sub1_Sub2_Sub1_3.method178(arg1, 0, local17, 257);
				this.aClass5_Sub1_Sub2_Sub1_3.method178(arg1, 16777215, local17 - 1, 256);
				local17 += 15;
				if (arg0 != null) {
					this.aClass5_Sub1_Sub2_Sub1_3.method178(arg0, 0, local17, 257);
					this.aClass5_Sub1_Sub2_Sub1_3.method178(arg0, 16777215, local17 - 1, 256);
				}
				this.aClass10_14.method45(super.aGraphics2, 4, 4, this.anInt999);
			} else if (super.aClass10_2 != null) {
				super.aClass10_2.method44();
				Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray245;
				local17 = 251;
				Class5_Sub1_Sub2.method335(221, 0, 233, 300, 50);
				Class5_Sub1_Sub2.method336(16777215, 221, 300, 233, 50);
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass5_Sub1_Sub2_Sub1_3.method178(arg1, 0, local17, 383);
				this.aClass5_Sub1_Sub2_Sub1_3.method178(arg1, 16777215, local17 - 1, 382);
				local17 += 15;
				if (arg0 != null) {
					this.aClass5_Sub1_Sub2_Sub1_3.method178(arg0, 0, local17, 383);
					this.aClass5_Sub1_Sub2_Sub1_3.method178(arg0, 16777215, local17 - 1, 382);
				}
				super.aClass10_2.method45(super.aGraphics2, 0, 0, this.anInt999);
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("36005, " + arg0 + ", " + arg1 + ", " + true + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method660() {
		try {
			if (this.anInt963 > 0) {
				this.method658();
			} else {
				this.method659("Please wait - attempting to reestablish", "Connection lost");
				this.anInt998 = 0;
				this.anInt892 = 0;
				@Pc(20) Class1 local20 = this.aClass1_1;
				this.aBoolean245 = false;
				this.anInt949 = 0;
				this.method656(this.aString24, this.aString25, true);
				if (!this.aBoolean245) {
					this.method658();
				}
				try {
					local20.method1();
				} catch (@Pc(53) Exception local53) {
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("95131, " + 18674 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)I")
	private int method661() {
		try {
			@Pc(8) int local8 = 3;
			if (this.anInt979 < 310) {
				@Pc(17) int local17 = this.anInt976 >> 7;
				@Pc(22) int local22 = this.anInt978 >> 7;
				@Pc(27) int local27 = aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 >> 7;
				@Pc(32) int local32 = aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt948][local17][local22] & 0x4) != 0) {
					local8 = this.anInt948;
				}
				@Pc(54) int local54;
				if (local27 > local17) {
					local54 = local27 - local17;
				} else {
					local54 = local17 - local27;
				}
				@Pc(67) int local67;
				if (local32 > local22) {
					local67 = local32 - local22;
				} else {
					local67 = local22 - local32;
				}
				@Pc(82) int local82;
				@Pc(84) int local84;
				if (local54 > local67) {
					local82 = local67 * 65536 / local54;
					local84 = 32768;
					while (local17 != local27) {
						if (local17 < local27) {
							local17++;
						} else if (local17 > local27) {
							local17--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt948][local17][local22] & 0x4) != 0) {
							local8 = this.anInt948;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt948][local17][local22] & 0x4) != 0) {
								local8 = this.anInt948;
							}
						}
					}
				} else {
					local82 = local54 * 65536 / local67;
					local84 = 32768;
					while (local22 != local32) {
						if (local22 < local32) {
							local22++;
						} else if (local22 > local32) {
							local22--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt948][local17][local22] & 0x4) != 0) {
							local8 = this.anInt948;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt948][local17][local22] & 0x4) != 0) {
								local8 = this.anInt948;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt948][aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 >> 7][aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 >> 7] & 0x4) != 0) {
				local8 = this.anInt948;
			}
			return local8;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("96663, " + -167 + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)I")
	private int method662() {
		try {
			@Pc(9) int local9 = this.method631(this.anInt976, this.anInt978, this.anInt948);
			return local9 - this.anInt977 >= 800 || (this.aByteArrayArrayArray8[this.anInt948][this.anInt976 >> 7][this.anInt978 >> 7] & 0x4) == 0 ? 3 : this.anInt948;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("53741, " + 5 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method663(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class45 local2 = Class45.method361(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray132.length && local2.anIntArray132[local4] != -1; local4++) {
				@Pc(18) Class45 local18 = Class45.method361(local2.anIntArray132[local4]);
				if (local18.anInt675 == 1) {
					this.method663(local18.anInt642);
				}
				local18.anInt667 = 0;
				local18.anInt648 = 0;
			}
			this.aBoolean245 &= true;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("526, " + true + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method664(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass5_Sub1_Sub2_Sub2_3.anIntArray112;
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
						this.aClass48_1.method509(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass48_1.method509(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass5_Sub1_Sub2_Sub2_3.method271();
			@Pc(151) int local151;
			for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
				for (local151 = 1; local151 < 103; local151++) {
					if ((this.aByteArrayArrayArray8[arg0][local151][local147] & 0x18) == 0) {
						this.method594(local151, local147, arg0, local36, local34);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local151][local147] & 0x8) != 0) {
						this.method594(local151, local147, arg0 + 1, local36, local34);
					}
				}
			}
			if (this.aClass10_14 != null) {
				this.aClass10_14.method44();
				Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
			}
			anInt916++;
			if (anInt916 > 133) {
				anInt916 = 0;
				this.aClass5_Sub1_Sub4_8.method426(149);
				this.aClass5_Sub1_Sub4_8.method430(4428546);
			}
			this.anInt964 = 0;
			for (local151 = 0; local151 < 104; local151++) {
				for (@Pc(243) int local243 = 0; local243 < 104; local243++) {
					@Pc(253) int local253 = this.aClass48_1.method503(this.anInt948, local151, local243);
					if (local253 != 0) {
						local253 = local253 >> 14 & 0x7FFF;
						@Pc(265) int local265 = Class8.method40(local253).anInt49;
						if (local265 >= 0) {
							@Pc(269) int local269 = local151;
							@Pc(271) int local271 = local243;
							if (local265 != 22 && local265 != 29 && local265 != 34 && local265 != 36 && local265 != 46 && local265 != 47 && local265 != 48) {
								@Pc(303) int[][] local303 = this.aClass16Array1[this.anInt948].anIntArrayArray3;
								for (@Pc(305) int local305 = 0; local305 < 10; local305++) {
									@Pc(312) int local312 = (int) (Math.random() * 4.0D);
									if (local312 == 0 && local269 > 0 && local269 > local151 - 3 && (local303[local269 - 1][local271] & 0x1280108) == 0) {
										local269--;
									}
									if (local312 == 1 && local269 < 103 && local269 < local151 + 3 && (local303[local269 + 1][local271] & 0x1280180) == 0) {
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
							this.aClass5_Sub1_Sub2_Sub2Array9[this.anInt964] = this.aClass5_Sub1_Sub2_Sub2Array8[local265];
							this.anIntArray246[this.anInt964] = local269;
							this.anIntArray247[this.anInt964] = local271;
							this.anInt964++;
						}
					}
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("67548, " + false + ", " + arg0 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)Z")
	private boolean method665() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("55147, " + -821 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method666() {
		try {
			@Pc(7) int local7 = this.aClass5_Sub1_Sub2_Sub1_4.method180("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt881; local9++) {
				local20 = this.aClass5_Sub1_Sub2_Sub1_4.method180(this.aStringArray13[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt881 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt821 > 4 && super.anInt822 > 4 && super.anInt821 < 516 && super.anInt822 < 338) {
				local69 = super.anInt821 - local7 / 2 - 4;
				if (local69 + local7 > 512) {
					local69 = 512 - local7;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt822 - 4;
				if (local87 + local20 > 334) {
					local87 = 334 - local20;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean242 = true;
				this.anInt852 = 0;
				this.anInt853 = local69;
				this.anInt854 = local87;
				this.anInt855 = local7;
				this.anInt856 = this.anInt881 * 15 + 22;
			}
			if (super.anInt821 > 553 && super.anInt822 > 205 && super.anInt821 < 743 && super.anInt822 < 466) {
				local69 = super.anInt821 - local7 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 190) {
					local69 = 190 - local7;
				}
				local87 = super.anInt822 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 261) {
					local87 = 261 - local20;
				}
				this.aBoolean242 = true;
				this.anInt852 = 1;
				this.anInt853 = local69;
				this.anInt854 = local87;
				this.anInt855 = local7;
				this.anInt856 = this.anInt881 * 15 + 22;
			}
			if (super.anInt821 > 17 && super.anInt822 > 357 && super.anInt821 < 496 && super.anInt822 < 453) {
				local69 = super.anInt821 - local7 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 479) {
					local69 = 479 - local7;
				}
				local87 = super.anInt822 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 96) {
					local87 = 96 - local20;
				}
				this.aBoolean242 = true;
				this.anInt852 = 2;
				this.anInt853 = local69;
				this.anInt854 = local87;
				this.anInt855 = local7;
				this.anInt856 = this.anInt881 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("54269, " + 635 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean267) {
			this.method671();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method667() {
		try {
			if (this.anInt828 == 0) {
				this.aStringArray13[0] = "Cancel";
				this.anIntArray274[0] = 1027;
				this.anInt881 = 1;
				if (this.anInt924 == -1) {
					this.method690();
					this.anInt997 = 0;
					this.anInt1028 = 0;
					if (super.anInt815 > 4 && super.anInt816 > 4 && super.anInt815 < 516 && super.anInt816 < 338) {
						if (this.anInt940 == -1) {
							this.method614();
						} else {
							this.method687(Class45.method361(this.anInt940), super.anInt816, 4, super.anInt815, 0, 4, 0);
						}
					}
					if (this.anInt997 != this.anInt1046) {
						this.anInt1046 = this.anInt997;
					}
					if (this.anInt1028 != this.anInt897) {
						this.anInt897 = this.anInt1028;
					}
					this.anInt997 = 0;
					this.anInt1028 = 0;
					if (super.anInt815 > 553 && super.anInt816 > 205 && super.anInt815 < 743 && super.anInt816 < 466) {
						if (this.anInt951 != -1) {
							this.method687(Class45.method361(this.anInt951), super.anInt816, 553, super.anInt815, 0, 205, 1);
						} else if (this.anIntArray255[this.anInt967] != -1) {
							this.method687(Class45.method361(this.anIntArray255[this.anInt967]), super.anInt816, 553, super.anInt815, 0, 205, 1);
						}
					}
					if (this.anInt997 != this.anInt899) {
						this.aBoolean264 = true;
						this.anInt899 = this.anInt997;
					}
					if (this.anInt1028 != this.anInt877) {
						this.aBoolean264 = true;
						this.anInt877 = this.anInt1028;
					}
					this.anInt997 = 0;
					this.anInt1028 = 0;
					if (super.anInt815 > 17 && super.anInt816 > 357 && super.anInt815 < 496 && super.anInt816 < 453) {
						if (this.anInt990 != -1) {
							this.method687(Class45.method361(this.anInt990), super.anInt816, 17, super.anInt815, 0, 357, 2);
						} else if (this.anInt918 != -1) {
							this.method687(Class45.method361(this.anInt918), super.anInt816, 17, super.anInt815, 0, 357, 3);
						} else if (super.anInt816 < 434 && super.anInt815 < 426) {
							this.method720(super.anInt816 - 357, super.anInt815 - 17);
						}
					}
					if ((this.anInt990 != -1 || this.anInt918 != -1) && this.anInt997 != this.anInt989) {
						this.aBoolean246 = true;
						this.anInt989 = this.anInt997;
					}
					if ((this.anInt990 != -1 || this.anInt918 != -1) && this.anInt1028 != this.anInt947) {
						this.aBoolean246 = true;
						this.anInt947 = this.anInt1028;
					}
					@Pc(349) boolean local349 = false;
					while (!local349) {
						local349 = true;
						for (@Pc(355) int local355 = 0; local355 < this.anInt881 - 1; local355++) {
							if (this.anIntArray274[local355] < 1000 && this.anIntArray274[local355 + 1] > 1000) {
								@Pc(376) String local376 = this.aStringArray13[local355];
								this.aStringArray13[local355] = this.aStringArray13[local355 + 1];
								this.aStringArray13[local355 + 1] = local376;
								@Pc(398) int local398 = this.anIntArray274[local355];
								this.anIntArray274[local355] = this.anIntArray274[local355 + 1];
								this.anIntArray274[local355 + 1] = local398;
								@Pc(420) int local420 = this.anIntArray272[local355];
								this.anIntArray272[local355] = this.anIntArray272[local355 + 1];
								this.anIntArray272[local355 + 1] = local420;
								@Pc(442) int local442 = this.anIntArray273[local355];
								this.anIntArray273[local355] = this.anIntArray273[local355 + 1];
								this.anIntArray273[local355 + 1] = local442;
								@Pc(464) int local464 = this.anIntArray275[local355];
								this.anIntArray275[local355] = this.anIntArray275[local355 + 1];
								this.anIntArray275[local355 + 1] = local464;
								local349 = false;
							}
						}
					}
				} else {
					this.anInt997 = 0;
					this.anInt1028 = 0;
					this.method687(Class45.method361(this.anInt924), super.anInt816, 0, super.anInt815, 0, 0, 0);
					if (this.anInt997 != this.anInt1046) {
						this.anInt1046 = this.anInt997;
					}
					if (this.anInt1028 != this.anInt897) {
						this.anInt897 = this.anInt1028;
					}
				}
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("48645, " + true + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method668(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt918 != -1) {
				this.aString23 = arg2;
				super.anInt820 = 0;
			}
			if (this.anInt990 == -1) {
				this.aBoolean246 = true;
			}
			for (@Pc(27) int local27 = 99; local27 > 0; local27--) {
				this.anIntArray219[local27] = this.anIntArray219[local27 - 1];
				this.aStringArray8[local27] = this.aStringArray8[local27 - 1];
				this.aStringArray9[local27] = this.aStringArray9[local27 - 1];
			}
			this.anIntArray219[0] = arg0;
			this.aStringArray8[0] = arg1;
			this.aStringArray9[0] = arg2;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("20289, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method669() {
		try {
			signlink.aBoolean274 = false;
			signlink.anInt1059 = 0;
			signlink.midi = "stop";
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("79665, " + -30 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method670() {
		try {
			if (this.anInt837 != 0) {
				@Pc(6) Class5_Sub1_Sub2_Sub1 local6 = this.aClass5_Sub1_Sub2_Sub1_3;
				@Pc(8) int local8 = 0;
				if (this.anInt900 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray9[local15] != null) {
						@Pc(27) int local27 = this.anIntArray219[local15];
						@Pc(32) String local32 = this.aStringArray8[local15];
						@Pc(34) byte local34 = 0;
						if (local32 != null && local32.startsWith("@cr1@")) {
							local32 = local32.substring(5);
							local34 = 1;
						}
						if (local32 != null && local32.startsWith("@cr2@")) {
							local32 = local32.substring(5);
							local34 = 2;
						}
						@Pc(85) int local85;
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt950 == 0 || this.anInt950 == 1 && this.method719(local32))) {
							local85 = 329 - local8 * 13;
							local6.method182(local85, 4, 0, "From", (byte) 6);
							local6.method182(local85 - 1, 4, 65535, "From", (byte) 6);
							@Pc(110) int local110 = local6.method180("From ") + 4;
							if (local34 == 1) {
								this.aClass5_Sub1_Sub2_Sub3Array3[0].method326(local85 - 12, local110);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass5_Sub1_Sub2_Sub3Array3[1].method326(local85 - 12, local110);
								local110 += 14;
							}
							local6.method182(local85, local110, 0, local32 + ": " + this.aStringArray9[local15], (byte) 6);
							local6.method182(local85 - 1, local110, 65535, local32 + ": " + this.aStringArray9[local15], (byte) 6);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt950 < 2) {
							local85 = 329 - local8 * 13;
							local6.method182(local85, 4, 0, this.aStringArray9[local15], (byte) 6);
							local6.method182(local85 - 1, 4, 65535, this.aStringArray9[local15], (byte) 6);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt950 < 2) {
							local85 = 329 - local8 * 13;
							local6.method182(local85, 4, 0, "To " + local32 + ": " + this.aStringArray9[local15], (byte) 6);
							local6.method182(local85 - 1, 4, 65535, "To " + local32 + ": " + this.aStringArray9[local15], (byte) 6);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("64212, " + 2 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method671() {
		try {
			this.aBoolean250 = true;
			try {
				@Pc(13) long local13 = System.currentTimeMillis();
				@Pc(15) int local15 = 0;
				@Pc(17) int local17 = 20;
				while (this.aBoolean254) {
					this.anInt1045++;
					this.method625();
					this.method625();
					this.method699();
					local15++;
					if (local15 > 10) {
						@Pc(40) long local40 = System.currentTimeMillis();
						@Pc(49) int local49 = (int) (local40 - local13) / 10 - local17;
						local17 = 40 - local49;
						if (local17 < 5) {
							local17 = 5;
						}
						local15 = 0;
						local13 = local40;
					}
					try {
						Thread.sleep((long) local17);
					} catch (@Pc(67) Exception local67) {
					}
				}
			} catch (@Pc(73) Exception local73) {
			}
			this.aBoolean250 = false;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("54726, " + 6 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method672() {
		try {
			this.method670();
			if (this.anInt972 == 1) {
				this.aClass5_Sub1_Sub2_Sub2Array10[this.anInt971 / 100].method276(this.anInt970 - 8 - 4, this.anInt969 - 8 - 4);
				anInt1008++;
				if (anInt1008 > 83) {
					anInt1008 = 0;
					this.aClass5_Sub1_Sub4_8.method426(137);
				}
			}
			if (this.anInt972 == 2) {
				this.aClass5_Sub1_Sub2_Sub2Array10[this.anInt971 / 100 + 4].method276(this.anInt970 - 8 - 4, this.anInt969 - 8 - 4);
			}
			if (this.anInt843 != -1) {
				this.method696(this.anInt843, this.anInt975);
				this.method621(0, 0, Class45.method361(this.anInt843), 0);
			}
			if (this.anInt940 != -1) {
				this.method696(this.anInt940, this.anInt975);
				this.method621(0, 0, Class45.method361(this.anInt940), 0);
			}
			this.method685(this.anInt1038);
			if (!this.aBoolean242) {
				this.method667();
				this.method691();
			} else if (this.anInt852 == 0) {
				this.method683();
			}
			if (this.anInt920 == 1) {
				this.aClass5_Sub1_Sub2_Sub2_7.method276(296, 472);
			}
			@Pc(186) int local186;
			if (aBoolean247) {
				@Pc(152) byte local152 = 20;
				@Pc(154) int local154 = 16776960;
				if (super.anInt810 < 30 && aBoolean258) {
					local154 = 16711680;
				}
				if (super.anInt810 < 20 && !aBoolean258) {
					local154 = 16711680;
				}
				this.aClass5_Sub1_Sub2_Sub1_3.method177(20, "Fps:" + super.anInt810, local154);
				local186 = local152 + 15;
				@Pc(188) Runtime local188 = Runtime.getRuntime();
				@Pc(197) int local197 = (int) ((local188.totalMemory() - local188.freeMemory()) / 1024L);
				if (local197 > 33554432 && aBoolean258) {
				}
				if (local197 > 67108864 && !aBoolean258) {
				}
				this.aClass5_Sub1_Sub2_Sub1_3.method177(35, "Mem:" + local197 + "k", 16776960);
				local186 += 15;
			}
			if (this.anInt900 != 0) {
				@Pc(238) int local238 = this.anInt900 / 50;
				local186 = local238 / 60;
				@Pc(246) int local246 = local238 % 60;
				if (local246 < 10) {
					this.aClass5_Sub1_Sub2_Sub1_3.method182(329, 4, 16776960, "System update in: " + local186 + ":0" + local246, (byte) 6);
				} else {
					this.aClass5_Sub1_Sub2_Sub1_3.method182(329, 4, 16776960, "System update in: " + local186 + ":" + local246, (byte) 6);
				}
			}
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("62846, " + -785 + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method673(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt880; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt880--;
						this.aBoolean264 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt880; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass5_Sub1_Sub4_8.method426(135);
						this.aClass5_Sub1_Sub4_8.method433(this.aByte37, arg0);
						break;
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("84679, " + arg0 + ", " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method674() {
		try {
			while (true) {
				@Pc(13) Class5_Sub1_Sub3 local13 = this.aClass26_Sub1_1.method202();
				if (local13 == null) {
					return;
				}
				if (local13.anInt587 == 0) {
					Class5_Sub1_Sub1_Sub6.method375(local13.aByteArray12, 54, local13.anInt589);
					if ((this.aClass26_Sub1_1.method204(local13.anInt589, anInt1035) & 0x62) != 0) {
						this.aBoolean264 = true;
						if (this.anInt990 != -1 || this.anInt918 != -1) {
							this.aBoolean246 = true;
						}
					}
				}
				if (local13.anInt587 == 1 && local13.aByteArray12 != null) {
					Class2.method8(local13.aByteArray12);
				}
				if (local13.anInt587 == 2 && local13.anInt589 == this.anInt923 && local13.aByteArray12 != null) {
					this.method633(this.aBoolean248, local13.aByteArray12);
				}
				if (local13.anInt587 == 3 && this.anInt1034 == 1) {
					for (@Pc(88) int local88 = 0; local88 < this.aByteArrayArray5.length; local88++) {
						if (this.anIntArray238[local88] == local13.anInt589) {
							this.aByteArrayArray5[local88] = local13.aByteArray12;
							if (local13.aByteArray12 == null) {
								this.anIntArray238[local88] = -1;
							}
							break;
						}
						if (this.anIntArray239[local88] == local13.anInt589) {
							this.aByteArrayArray6[local88] = local13.aByteArray12;
							if (local13.aByteArray12 == null) {
								this.anIntArray239[local88] = -1;
							}
							break;
						}
					}
				}
				if (local13.anInt587 == 93 && this.aClass26_Sub1_1.method214(local13.anInt589)) {
					Class46.method406(new Class5_Sub1_Sub4(local13.aByteArray12, -82), this.aClass26_Sub1_1);
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("77042, " + 2 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)Z")
	private boolean method675() {
		try {
			if (this.aClass1_1 == null) {
				return false;
			}
			@Pc(1901) String local1901;
			@Pc(168) int local168;
			try {
				@Pc(18) int local18 = this.aClass1_1.method3();
				if (local18 == 0) {
					return false;
				}
				if (this.anInt960 == -1) {
					this.aClass1_1.method4(this.aClass5_Sub1_Sub4_7.aByteArray20, 0, 1);
					this.anInt960 = this.aClass5_Sub1_Sub4_7.aByteArray20[0] & 0xFF;
					if (this.aClass13_2 != null) {
						this.anInt960 = this.anInt960 - this.aClass13_2.method81() & 0xFF;
					}
					this.anInt959 = Class20.anIntArray58[this.anInt960];
					local18--;
				}
				if (this.anInt959 == -1) {
					if (local18 <= 0) {
						return false;
					}
					this.aClass1_1.method4(this.aClass5_Sub1_Sub4_7.aByteArray20, 0, 1);
					this.anInt959 = this.aClass5_Sub1_Sub4_7.aByteArray20[0] & 0xFF;
					local18--;
				}
				if (this.anInt959 == -2) {
					if (local18 <= 1) {
						return false;
					}
					this.aClass1_1.method4(this.aClass5_Sub1_Sub4_7.aByteArray20, 0, 2);
					this.aClass5_Sub1_Sub4_7.anInt755 = 0;
					this.anInt959 = this.aClass5_Sub1_Sub4_7.method439();
					local18 -= 2;
				}
				if (local18 < this.anInt959) {
					return false;
				}
				this.aClass5_Sub1_Sub4_7.anInt755 = 0;
				this.aClass1_1.method4(this.aClass5_Sub1_Sub4_7.aByteArray20, 0, this.anInt959);
				this.anInt961 = 0;
				this.anInt1011 = this.anInt1010;
				this.anInt1010 = this.anInt1009;
				this.anInt1009 = this.anInt960;
				@Pc(163) int local163;
				if (this.anInt960 == 169) {
					local163 = this.aClass5_Sub1_Sub4_7.method463();
					local168 = this.aClass5_Sub1_Sub4_7.method465();
					if (this.anInt990 != -1) {
						this.method584(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt924 != -1) {
						this.method584(this.anInt924);
						this.anInt924 = -1;
						this.aBoolean249 = true;
					}
					if (this.anInt878 != -1) {
						this.method584(this.anInt878);
						this.anInt878 = -1;
					}
					if (this.anInt940 != local163) {
						this.method584(this.anInt940);
						this.anInt940 = local163;
					}
					if (this.anInt951 != local168) {
						this.method584(this.anInt951);
						this.anInt951 = local168;
					}
					if (this.anInt1030 != 0) {
						this.anInt1030 = 0;
						this.aBoolean246 = true;
					}
					this.aBoolean264 = true;
					this.aBoolean241 = true;
					this.aBoolean239 = false;
					this.anInt960 = -1;
					return true;
				}
				@Pc(275) int local275;
				@Pc(280) int local280;
				if (this.anInt960 == 79) {
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					local168 = this.aClass5_Sub1_Sub4_7.method465();
					local275 = this.aClass5_Sub1_Sub4_7.method465();
					local280 = this.aClass5_Sub1_Sub4_7.method464();
					Class45.method361(local275).anInt652 = local163;
					Class45.method361(local275).anInt653 = local280;
					Class45.method361(local275).anInt651 = local168;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 30) {
					this.anInt1039 = this.aClass5_Sub1_Sub4_7.method437();
					if (this.anInt1039 == this.anInt967) {
						if (this.anInt1039 == 3) {
							this.anInt967 = 1;
						} else {
							this.anInt967 = 3;
						}
						this.aBoolean264 = true;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 170) {
					this.anInt898 = this.aClass5_Sub1_Sub4_7.method465();
					this.anInt996 = this.aClass5_Sub1_Sub4_7.method455();
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 9) {
					if (this.anInt967 == 12) {
						this.aBoolean264 = true;
					}
					this.anInt1032 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 149) {
					this.anInt954 = this.aClass5_Sub1_Sub4_7.method464();
					this.anInt953 = this.aClass5_Sub1_Sub4_7.method463();
					this.anInt952 = this.aClass5_Sub1_Sub4_7.method470();
					this.anInt992 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt1044 = this.aClass5_Sub1_Sub4_7.method465();
					this.anInt965 = this.aClass5_Sub1_Sub4_7.method465();
					this.anInt974 = this.aClass5_Sub1_Sub4_7.method465();
					this.anInt921 = this.aClass5_Sub1_Sub4_7.method439();
					this.anInt1037 = this.aClass5_Sub1_Sub4_7.method439();
					this.anInt922 = this.aClass5_Sub1_Sub4_7.method465();
					this.anInt907 = this.aClass5_Sub1_Sub4_7.method463();
					signlink.dnslookup(Class11.method50(this.anInt952));
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 155) {
					this.method658();
					this.anInt960 = -1;
					return false;
				}
				if (this.anInt960 == 105) {
					for (local163 = 0; local163 < this.aClass5_Sub1_Sub1_Sub3_Sub2Array1.length; local163++) {
						if (this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local163] != null) {
							this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local163].anInt463 = -1;
						}
					}
					for (local168 = 0; local168 < this.aClass5_Sub1_Sub1_Sub3_Sub1Array1.length; local168++) {
						if (this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local168] != null) {
							this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local168].anInt463 = -1;
						}
					}
					this.anInt960 = -1;
					return true;
				}
				@Pc(540) int local540;
				@Pc(527) Class45 local527;
				if (this.anInt960 == 64) {
					this.aBoolean264 = true;
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					local527 = Class45.method361(local163);
					local275 = this.aClass5_Sub1_Sub4_7.method439();
					for (local280 = 0; local280 < local275; local280++) {
						local540 = this.aClass5_Sub1_Sub4_7.method455();
						if (local540 == 255) {
							local540 = this.aClass5_Sub1_Sub4_7.method470();
						}
						local527.anIntArray131[local280] = this.aClass5_Sub1_Sub4_7.method463();
						local527.anIntArray126[local280] = local540;
					}
					for (local540 = local275; local540 < local527.anIntArray131.length; local540++) {
						local527.anIntArray131[local540] = 0;
						local527.anIntArray126[local540] = 0;
					}
					this.anInt960 = -1;
					return true;
				}
				@Pc(714) int local714;
				@Pc(747) int local747;
				@Pc(599) long local599;
				if (this.anInt960 == 142) {
					local599 = this.aClass5_Sub1_Sub4_7.method443();
					local275 = this.aClass5_Sub1_Sub4_7.method437();
					@Pc(610) String local610 = Class11.method51(Class11.method48(this.anInt993, local599));
					for (local540 = 0; local540 < this.anInt845; local540++) {
						if (local599 == this.aLongArray3[local540]) {
							if (this.anIntArray229[local540] != local275) {
								this.anIntArray229[local540] = local275;
								this.aBoolean264 = true;
								if (local275 > 0) {
									this.method668(5, "", local610 + " has logged in.");
								}
								if (local275 == 0) {
									this.method668(5, "", local610 + " has logged out.");
								}
							}
							local610 = null;
							break;
						}
					}
					if (local610 != null && this.anInt845 < 200) {
						this.aLongArray3[this.anInt845] = local599;
						this.aStringArray11[this.anInt845] = local610;
						this.anIntArray229[this.anInt845] = local275;
						this.anInt845++;
						this.aBoolean264 = true;
					}
					@Pc(708) boolean local708 = false;
					while (!local708) {
						local708 = true;
						for (local714 = 0; local714 < this.anInt845 - 1; local714++) {
							if (this.anIntArray229[local714] != anInt987 && this.anIntArray229[local714 + 1] == anInt987 || this.anIntArray229[local714] == 0 && this.anIntArray229[local714 + 1] != 0) {
								local747 = this.anIntArray229[local714];
								this.anIntArray229[local714] = this.anIntArray229[local714 + 1];
								this.anIntArray229[local714 + 1] = local747;
								@Pc(769) String local769 = this.aStringArray11[local714];
								this.aStringArray11[local714] = this.aStringArray11[local714 + 1];
								this.aStringArray11[local714 + 1] = local769;
								@Pc(791) long local791 = this.aLongArray3[local714];
								this.aLongArray3[local714] = this.aLongArray3[local714 + 1];
								this.aLongArray3[local714 + 1] = local791;
								this.aBoolean264 = true;
								local708 = false;
							}
						}
					}
					this.anInt960 = -1;
					return true;
				}
				@Pc(848) int local848;
				@Pc(846) boolean local846;
				@Pc(915) String local915;
				if (this.anInt960 == 210) {
					local599 = this.aClass5_Sub1_Sub4_7.method443();
					local275 = this.aClass5_Sub1_Sub4_7.method442();
					local280 = this.aClass5_Sub1_Sub4_7.method437();
					local846 = false;
					for (local848 = 0; local848 < 100; local848++) {
						if (this.anIntArray223[local848] == local275) {
							local846 = true;
							break;
						}
					}
					if (local280 <= 1) {
						for (local714 = 0; local714 < this.anInt880; local714++) {
							if (this.aLongArray4[local714] == local599) {
								local846 = true;
								break;
							}
						}
					}
					if (!local846 && this.anInt859 == 0) {
						try {
							this.anIntArray223[this.anInt879] = local275;
							this.anInt879 = (this.anInt879 + 1) % 100;
							local915 = Class44.method304(this.aClass5_Sub1_Sub4_7, 7, this.anInt959 - 13);
							if (local280 != 3) {
								local915 = Class50.method543(local915);
							}
							if (local280 == 2 || local280 == 3) {
								this.method668(7, "@cr2@" + Class11.method51(Class11.method48(this.anInt993, local599)), local915);
							} else if (local280 == 1) {
								this.method668(7, "@cr1@" + Class11.method51(Class11.method48(this.anInt993, local599)), local915);
							} else {
								this.method668(3, Class11.method51(Class11.method48(this.anInt993, local599)), local915);
							}
						} catch (@Pc(982) Exception local982) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 248) {
					local163 = this.aClass5_Sub1_Sub4_7.method463();
					this.method663(local163);
					if (this.anInt990 != -1) {
						this.method584(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt924 != -1) {
						this.method584(this.anInt924);
						this.anInt924 = -1;
						this.aBoolean249 = true;
					}
					if (this.anInt878 != -1) {
						this.method584(this.anInt878);
						this.anInt878 = -1;
					}
					if (this.anInt940 != -1) {
						this.method584(this.anInt940);
						this.anInt940 = -1;
					}
					if (this.anInt951 != local163) {
						this.method584(this.anInt951);
						this.anInt951 = local163;
					}
					if (this.anInt1030 != 0) {
						this.anInt1030 = 0;
						this.aBoolean246 = true;
					}
					this.aBoolean264 = true;
					this.aBoolean241 = true;
					this.aBoolean239 = false;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 172) {
					for (local163 = 0; local163 < this.anIntArray231.length; local163++) {
						if (this.anIntArray231[local163] != this.anIntArray234[local163]) {
							this.anIntArray231[local163] = this.anIntArray234[local163];
							this.method612(local163);
							this.aBoolean264 = true;
						}
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 244) {
					this.anInt875 = this.aClass5_Sub1_Sub4_7.method437();
					if (this.anInt875 == 1) {
						this.anInt851 = this.aClass5_Sub1_Sub4_7.method439();
					}
					if (this.anInt875 >= 2 && this.anInt875 <= 6) {
						if (this.anInt875 == 2) {
							this.anInt1005 = 64;
							this.anInt1006 = 64;
						}
						if (this.anInt875 == 3) {
							this.anInt1005 = 0;
							this.anInt1006 = 64;
						}
						if (this.anInt875 == 4) {
							this.anInt1005 = 128;
							this.anInt1006 = 64;
						}
						if (this.anInt875 == 5) {
							this.anInt1005 = 64;
							this.anInt1006 = 0;
						}
						if (this.anInt875 == 6) {
							this.anInt1005 = 64;
							this.anInt1006 = 128;
						}
						this.anInt875 = 2;
						this.anInt1002 = this.aClass5_Sub1_Sub4_7.method439();
						this.anInt1003 = this.aClass5_Sub1_Sub4_7.method439();
						this.anInt1004 = this.aClass5_Sub1_Sub4_7.method437();
					}
					if (this.anInt875 == 10) {
						this.anInt894 = this.aClass5_Sub1_Sub4_7.method439();
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 111) {
					if (this.anInt967 == 12) {
						this.aBoolean264 = true;
					}
					this.anInt995 = this.aClass5_Sub1_Sub4_7.method440();
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 224) {
					this.aBoolean266 = true;
					this.anInt910 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt911 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt912 = this.aClass5_Sub1_Sub4_7.method439();
					this.anInt913 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt914 = this.aClass5_Sub1_Sub4_7.method437();
					if (this.anInt914 >= 100) {
						local163 = this.anInt910 * 128 + 64;
						local168 = this.anInt911 * 128 + 64;
						local275 = this.method631(local163, local168, this.anInt948) - this.anInt912;
						local280 = local163 - this.anInt976;
						local540 = local275 - this.anInt977;
						local848 = local168 - this.anInt978;
						local714 = (int) Math.sqrt((double) (local280 * local280 + local848 * local848));
						this.anInt979 = (int) (Math.atan2((double) local540, (double) local714) * 325.949D) & 0x7FF;
						this.anInt980 = (int) (Math.atan2((double) local280, (double) local848) * -325.949D) & 0x7FF;
						if (this.anInt979 < 128) {
							this.anInt979 = 128;
						}
						if (this.anInt979 > 383) {
							this.anInt979 = 383;
						}
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 165) {
					local163 = this.aClass5_Sub1_Sub4_7.method467();
					if (local163 >= 0) {
						this.method663(local163);
					}
					if (local163 != this.anInt843) {
						this.method584(this.anInt843);
						this.anInt843 = local163;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 75) {
					this.anInt1016 = this.aClass5_Sub1_Sub4_7.method457(this.aBoolean234);
					this.anInt1015 = this.aClass5_Sub1_Sub4_7.method457(this.aBoolean234);
					for (local163 = this.anInt1015; local163 < this.anInt1015 + 8; local163++) {
						for (local168 = this.anInt1016; local168 < this.anInt1016 + 8; local168++) {
							if (this.aClass42ArrayArrayArray1[this.anInt948][local163][local168] != null) {
								this.aClass42ArrayArrayArray1[this.anInt948][local163][local168] = null;
								this.method613(local163, local168);
							}
						}
					}
					for (@Pc(1497) Class5_Sub2 local1497 = (Class5_Sub2) this.aClass42_12.method299(); local1497 != null; local1497 = (Class5_Sub2) this.aClass42_12.method301(this.anInt1001)) {
						if (local1497.anInt373 >= this.anInt1015 && local1497.anInt373 < this.anInt1015 + 8 && local1497.anInt374 >= this.anInt1016 && local1497.anInt374 < this.anInt1016 + 8 && local1497.anInt371 == this.anInt948) {
							local1497.anInt370 = 0;
						}
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 120) {
					this.anInt900 = this.aClass5_Sub1_Sub4_7.method463() * 30;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 89) {
					local163 = this.aClass5_Sub1_Sub4_7.method464();
					local168 = this.aClass5_Sub1_Sub4_7.method464();
					Class45.method361(local163).anInt662 = 2;
					Class45.method361(local163).anInt663 = local168;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 150) {
					this.anInt833 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt950 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt908 = this.aClass5_Sub1_Sub4_7.method437();
					this.aBoolean256 = true;
					this.aBoolean246 = true;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 104) {
					local163 = this.aClass5_Sub1_Sub4_7.method463();
					this.method663(local163);
					if (this.anInt951 != -1) {
						this.method584(this.anInt951);
						this.anInt951 = -1;
						this.aBoolean264 = true;
						this.aBoolean241 = true;
					}
					if (this.anInt990 != -1) {
						this.method584(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt924 != -1) {
						this.method584(this.anInt924);
						this.anInt924 = -1;
						this.aBoolean249 = true;
					}
					if (this.anInt878 != -1) {
						this.method584(this.anInt878);
						this.anInt878 = -1;
					}
					if (this.anInt940 != local163) {
						this.method584(this.anInt940);
						this.anInt940 = local163;
					}
					if (this.anInt1030 != 0) {
						this.anInt1030 = 0;
						this.aBoolean246 = true;
					}
					this.aBoolean239 = false;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 13) {
					if (this.anInt951 != -1) {
						this.method584(this.anInt951);
						this.anInt951 = -1;
						this.aBoolean264 = true;
						this.aBoolean241 = true;
					}
					if (this.anInt990 != -1) {
						this.method584(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt924 != -1) {
						this.method584(this.anInt924);
						this.anInt924 = -1;
						this.aBoolean249 = true;
					}
					if (this.anInt878 != -1) {
						this.method584(this.anInt878);
						this.anInt878 = -1;
					}
					if (this.anInt940 != -1) {
						this.method584(this.anInt940);
						this.anInt940 = -1;
					}
					if (this.anInt1030 != 0) {
						this.anInt1030 = 0;
						this.aBoolean246 = true;
					}
					this.aBoolean239 = false;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 118) {
					local163 = this.aClass5_Sub1_Sub4_7.method437();
					local168 = this.aClass5_Sub1_Sub4_7.method437();
					local275 = this.aClass5_Sub1_Sub4_7.method437();
					local280 = this.aClass5_Sub1_Sub4_7.method437();
					this.aBooleanArray11[local163] = true;
					this.anIntArray212[local163] = local168;
					this.anIntArray241[local163] = local275;
					this.anIntArray254[local163] = local280;
					this.anIntArray248[local163] = 0;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 154) {
					local163 = this.aClass5_Sub1_Sub4_7.method467();
					if (local163 != this.anInt918) {
						this.method584(this.anInt918);
						this.anInt918 = local163;
					}
					this.aBoolean246 = true;
					this.anInt960 = -1;
					return true;
				}
				@Pc(1912) String local1912;
				if (this.anInt960 == 166) {
					local1901 = this.aClass5_Sub1_Sub4_7.method444();
					@Pc(1915) long local1915;
					if (local1901.endsWith(":tradereq:")) {
						local1912 = local1901.substring(0, local1901.indexOf(":"));
						local1915 = Class11.method47(local1912);
						local846 = false;
						for (local848 = 0; local848 < this.anInt880; local848++) {
							if (this.aLongArray4[local848] == local1915) {
								local846 = true;
								break;
							}
						}
						if (!local846 && this.anInt859 == 0) {
							this.method668(4, local1912, "wishes to trade with you.");
						}
					} else if (local1901.endsWith(":duelreq:")) {
						local1912 = local1901.substring(0, local1901.indexOf(":"));
						local1915 = Class11.method47(local1912);
						local846 = false;
						for (local848 = 0; local848 < this.anInt880; local848++) {
							if (this.aLongArray4[local848] == local1915) {
								local846 = true;
								break;
							}
						}
						if (!local846 && this.anInt859 == 0) {
							this.method668(8, local1912, "wishes to duel with you.");
						}
					} else if (local1901.endsWith(":chalreq:")) {
						local1912 = local1901.substring(0, local1901.indexOf(":"));
						local1915 = Class11.method47(local1912);
						local846 = false;
						for (local848 = 0; local848 < this.anInt880; local848++) {
							if (this.aLongArray4[local848] == local1915) {
								local846 = true;
								break;
							}
						}
						if (!local846 && this.anInt859 == 0) {
							local915 = local1901.substring(local1901.indexOf(":") + 1, local1901.length() - 9);
							this.method668(8, local1912, local915);
						}
					} else {
						this.method668(0, "", local1901);
					}
					this.anInt960 = -1;
					return true;
				}
				@Pc(2088) Class45 local2088;
				if (this.anInt960 == 19) {
					local163 = this.aClass5_Sub1_Sub4_7.method463();
					local168 = this.aClass5_Sub1_Sub4_7.method464();
					local2088 = Class45.method361(local168);
					if (local2088 != null && local2088.anInt675 == 0) {
						if (local163 < 0) {
							local163 = 0;
						}
						if (local163 > local2088.anInt641 - local2088.anInt650) {
							local163 = local2088.anInt641 - local2088.anInt650;
						}
						local2088.anInt676 = local163;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 177) {
					this.aBoolean266 = true;
					this.anInt860 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt861 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt862 = this.aClass5_Sub1_Sub4_7.method439();
					this.anInt863 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt864 = this.aClass5_Sub1_Sub4_7.method437();
					if (this.anInt864 >= 100) {
						this.anInt976 = this.anInt860 * 128 + 64;
						this.anInt978 = this.anInt861 * 128 + 64;
						this.anInt977 = this.method631(this.anInt976, this.anInt978, this.anInt948) - this.anInt862;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 187) {
					local163 = this.aClass5_Sub1_Sub4_7.method466();
					local168 = this.aClass5_Sub1_Sub4_7.method467();
					local275 = this.aClass5_Sub1_Sub4_7.method439();
					@Pc(2210) Class45 local2210 = Class45.method361(local275);
					local2210.anInt645 = local168;
					local2210.anInt649 = local163;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 56) {
					local163 = this.aClass5_Sub1_Sub4_7.method463();
					local168 = this.aClass5_Sub1_Sub4_7.method471();
					this.anIntArray234[local163] = local168;
					if (this.anIntArray231[local163] != local168) {
						this.anIntArray231[local163] = local168;
						this.method612(local163);
						this.aBoolean264 = true;
						if (this.anInt918 != -1) {
							this.aBoolean246 = true;
						}
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 183 || this.anInt960 == 206) {
					local163 = this.anInt1048;
					local168 = this.anInt1049;
					if (this.anInt960 == 183) {
						local168 = this.aClass5_Sub1_Sub4_7.method464();
						local163 = this.aClass5_Sub1_Sub4_7.method463();
						this.aBoolean240 = false;
					}
					if (this.anInt960 == 206) {
						this.aClass5_Sub1_Sub4_7.method447();
						local275 = 0;
						while (true) {
							if (local275 >= 4) {
								this.aClass5_Sub1_Sub4_7.method449();
								local163 = this.aClass5_Sub1_Sub4_7.method465();
								local168 = this.aClass5_Sub1_Sub4_7.method439();
								this.aBoolean240 = true;
								break;
							}
							for (local280 = 0; local280 < 13; local280++) {
								for (local540 = 0; local540 < 13; local540++) {
									local848 = this.aClass5_Sub1_Sub4_7.method448(1);
									if (local848 == 1) {
										this.anIntArrayArrayArray8[local275][local280][local540] = this.aClass5_Sub1_Sub4_7.method448(26);
									} else {
										this.anIntArrayArrayArray8[local275][local280][local540] = -1;
									}
								}
							}
							local275++;
						}
					}
					if (this.anInt1048 == local163 && this.anInt1049 == local168 && this.anInt1034 == 2) {
						this.anInt960 = -1;
						return true;
					}
					this.anInt1048 = local163;
					this.anInt1049 = local168;
					this.anInt983 = (this.anInt1048 - 6) * 8;
					this.anInt984 = (this.anInt1049 - 6) * 8;
					this.aBoolean235 = false;
					if ((this.anInt1048 / 8 == 48 || this.anInt1048 / 8 == 49) && this.anInt1049 / 8 == 48) {
						this.aBoolean235 = true;
					}
					if (this.anInt1048 / 8 == 48 && this.anInt1049 / 8 == 148) {
						this.aBoolean235 = true;
					}
					this.anInt1034 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.method659(null, "Loading - please wait.");
					if (this.anInt960 == 183) {
						local275 = 0;
						local280 = (this.anInt1048 - 6) / 8;
						label1201: while (true) {
							if (local280 > (this.anInt1048 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local275][];
								this.aByteArrayArray6 = new byte[local275][];
								this.anIntArray237 = new int[local275];
								this.anIntArray238 = new int[local275];
								this.anIntArray239 = new int[local275];
								local275 = 0;
								local540 = (this.anInt1048 - 6) / 8;
								while (true) {
									if (local540 > (this.anInt1048 + 6) / 8) {
										break label1201;
									}
									for (local848 = (this.anInt1049 - 6) / 8; local848 <= (this.anInt1049 + 6) / 8; local848++) {
										this.anIntArray237[local275] = (local540 << 8) + local848;
										if (this.aBoolean235 && (local848 == 49 || local848 == 149 || local848 == 147 || local540 == 50 || local540 == 49 && local848 == 47)) {
											this.anIntArray238[local275] = -1;
											this.anIntArray239[local275] = -1;
											local275++;
										} else {
											local714 = this.anIntArray238[local275] = this.aClass26_Sub1_1.method208(local540, local848, 0);
											if (local714 != -1) {
												this.aClass26_Sub1_1.method206(3, local714);
											}
											local747 = this.anIntArray239[local275] = this.aClass26_Sub1_1.method208(local540, local848, 1);
											if (local747 != -1) {
												this.aClass26_Sub1_1.method206(3, local747);
											}
											local275++;
										}
									}
									local540++;
								}
							}
							for (local540 = (this.anInt1049 - 6) / 8; local540 <= (this.anInt1049 + 6) / 8; local540++) {
								local275++;
							}
							local280++;
						}
					}
					if (this.anInt960 == 206) {
						local275 = 0;
						@Pc(2667) int[] local2667 = new int[676];
						local540 = 0;
						label1162: while (true) {
							@Pc(2697) int local2697;
							@Pc(2703) int local2703;
							@Pc(2713) int local2713;
							if (local540 >= 4) {
								this.aByteArrayArray5 = new byte[local275][];
								this.aByteArrayArray6 = new byte[local275][];
								this.anIntArray237 = new int[local275];
								this.anIntArray238 = new int[local275];
								this.anIntArray239 = new int[local275];
								local848 = 0;
								while (true) {
									if (local848 >= local275) {
										break label1162;
									}
									local714 = this.anIntArray237[local848] = local2667[local848];
									local747 = local714 >> 8 & 0xFF;
									local2697 = local714 & 0xFF;
									local2703 = this.anIntArray238[local848] = this.aClass26_Sub1_1.method208(local747, local2697, 0);
									if (local2703 != -1) {
										this.aClass26_Sub1_1.method206(3, local2703);
									}
									local2713 = this.anIntArray239[local848] = this.aClass26_Sub1_1.method208(local747, local2697, 1);
									if (local2713 != -1) {
										this.aClass26_Sub1_1.method206(3, local2713);
									}
									local848++;
								}
							}
							for (local848 = 0; local848 < 13; local848++) {
								for (local714 = 0; local714 < 13; local714++) {
									local747 = this.anIntArrayArrayArray8[local540][local848][local714];
									if (local747 != -1) {
										local2697 = local747 >> 14 & 0x3FF;
										local2703 = local747 >> 3 & 0x7FF;
										local2713 = (local2697 / 8 << 8) + local2703 / 8;
										for (@Pc(2715) int local2715 = 0; local2715 < local275; local2715++) {
											if (local2667[local2715] == local2713) {
												local2713 = -1;
												break;
											}
										}
										if (local2713 != -1) {
											local2667[local275++] = local2713;
										}
									}
								}
							}
							local540++;
						}
					}
					local275 = this.anInt983 - this.anInt985;
					local280 = this.anInt984 - this.anInt986;
					this.anInt985 = this.anInt983;
					this.anInt986 = this.anInt984;
					for (local540 = 0; local540 < 16384; local540++) {
						@Pc(2868) Class5_Sub1_Sub1_Sub3_Sub1 local2868 = this.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local540];
						if (local2868 != null) {
							for (local714 = 0; local714 < 10; local714++) {
								local2868.anIntArray104[local714] -= local275;
								local2868.anIntArray105[local714] -= local280;
							}
							local2868.anInt501 -= local275 * 128;
							local2868.anInt502 -= local280 * 128;
						}
					}
					for (local848 = 0; local848 < this.anInt1023; local848++) {
						@Pc(2923) Class5_Sub1_Sub1_Sub3_Sub2 local2923 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local848];
						if (local2923 != null) {
							for (local747 = 0; local747 < 10; local747++) {
								local2923.anIntArray104[local747] -= local275;
								local2923.anIntArray105[local747] -= local280;
							}
							local2923.anInt501 -= local275 * 128;
							local2923.anInt502 -= local280 * 128;
						}
					}
					this.aBoolean236 = true;
					@Pc(2975) byte local2975 = 0;
					@Pc(2977) byte local2977 = 104;
					@Pc(2979) byte local2979 = 1;
					if (local275 < 0) {
						local2975 = 103;
						local2977 = -1;
						local2979 = -1;
					}
					@Pc(2989) byte local2989 = 0;
					@Pc(2991) byte local2991 = 104;
					@Pc(2993) byte local2993 = 1;
					if (local280 < 0) {
						local2989 = 103;
						local2991 = -1;
						local2993 = -1;
					}
					for (@Pc(3003) int local3003 = local2975; local3003 != local2977; local3003 += local2979) {
						for (@Pc(3007) int local3007 = local2989; local3007 != local2991; local3007 += local2993) {
							@Pc(3013) int local3013 = local3003 + local275;
							@Pc(3017) int local3017 = local3007 + local280;
							for (@Pc(3019) int local3019 = 0; local3019 < 4; local3019++) {
								if (local3013 >= 0 && local3017 >= 0 && local3013 < 104 && local3017 < 104) {
									this.aClass42ArrayArrayArray1[local3019][local3003][local3007] = this.aClass42ArrayArrayArray1[local3019][local3013][local3017];
								} else {
									this.aClass42ArrayArrayArray1[local3019][local3003][local3007] = null;
								}
							}
						}
					}
					for (@Pc(3081) Class5_Sub2 local3081 = (Class5_Sub2) this.aClass42_12.method299(); local3081 != null; local3081 = (Class5_Sub2) this.aClass42_12.method301(this.anInt1001)) {
						local3081.anInt373 -= local275;
						local3081.anInt374 -= local280;
						if (local3081.anInt373 < 0 || local3081.anInt374 < 0 || local3081.anInt373 >= 104 || local3081.anInt374 >= 104) {
							local3081.method423();
						}
					}
					if (this.anInt892 != 0) {
						this.anInt892 -= local275;
						this.anInt893 -= local280;
					}
					this.aBoolean266 = false;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 84) {
					local163 = this.aClass5_Sub1_Sub4_7.method465();
					local168 = this.aClass5_Sub1_Sub4_7.method457(this.aBoolean234);
					if (local163 == 65535) {
						local163 = -1;
					}
					if (this.anIntArray255[local168] != local163) {
						this.method584(this.anIntArray255[local168]);
						this.anIntArray255[local168] = local163;
					}
					this.aBoolean264 = true;
					this.aBoolean241 = true;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 131) {
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					local168 = this.aClass5_Sub1_Sub4_7.method437();
					local275 = this.aClass5_Sub1_Sub4_7.method439();
					if (this.aBoolean259 && !aBoolean258 && this.anInt891 < 50) {
						this.anIntArray228[this.anInt891] = local163;
						this.anIntArray217[this.anInt891] = local168;
						this.anIntArray233[this.anInt891] = local275 + Class38.anIntArray110[local163];
						this.anInt891++;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 41) {
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					local527 = Class45.method361(local163);
					for (local275 = 0; local275 < local527.anIntArray131.length; local275++) {
						local527.anIntArray131[local275] = -1;
						local527.anIntArray131[local275] = 0;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 83) {
					@Pc(3300) boolean local3300 = this.aClass5_Sub1_Sub4_7.method456() == 1;
					local168 = this.aClass5_Sub1_Sub4_7.method439();
					Class45.method361(local168).aBoolean191 = local3300;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 87) {
					this.anInt846 = this.aClass5_Sub1_Sub4_7.method437();
					this.aBoolean264 = true;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 80) {
					this.anInt1016 = this.aClass5_Sub1_Sub4_7.method455();
					this.anInt1015 = this.aClass5_Sub1_Sub4_7.method455();
					while (this.aClass5_Sub1_Sub4_7.anInt755 < this.anInt959) {
						local163 = this.aClass5_Sub1_Sub4_7.method437();
						this.method617(this.aClass5_Sub1_Sub4_7, (byte) 5, local163);
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 247) {
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					this.method663(local163);
					if (this.anInt951 != -1) {
						this.method584(this.anInt951);
						this.anInt951 = -1;
						this.aBoolean264 = true;
						this.aBoolean241 = true;
					}
					if (this.anInt924 != -1) {
						this.method584(this.anInt924);
						this.anInt924 = -1;
						this.aBoolean249 = true;
					}
					if (this.anInt878 != -1) {
						this.method584(this.anInt878);
						this.anInt878 = -1;
					}
					if (this.anInt940 != -1) {
						this.method584(this.anInt940);
						this.anInt940 = -1;
					}
					if (this.anInt990 != local163) {
						this.method584(this.anInt990);
						this.anInt990 = local163;
					}
					this.aBoolean239 = false;
					this.aBoolean246 = true;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 245) {
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					local168 = this.aClass5_Sub1_Sub4_7.method465();
					local275 = local168 >> 10 & 0x1F;
					local280 = local168 >> 5 & 0x1F;
					local540 = local168 & 0x1F;
					Class45.method361(local163).anInt668 = (local275 << 19) + (local280 << 11) + (local540 << 3);
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 46) {
					this.anInt967 = this.aClass5_Sub1_Sub4_7.method456();
					this.aBoolean264 = true;
					this.aBoolean241 = true;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 67) {
					local1901 = this.aClass5_Sub1_Sub4_7.method444();
					local168 = this.aClass5_Sub1_Sub4_7.method463();
					Class45.method361(local168).aString13 = local1901;
					@Pc(3555) int local3555 = this.anIntArray255[this.anInt967];
					if (Class45.method361(local168).anInt640 == local3555) {
						this.aBoolean264 = true;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 60) {
					this.anInt892 = 0;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 27) {
					local163 = this.aClass5_Sub1_Sub4_7.method464();
					local168 = this.aClass5_Sub1_Sub4_7.method439();
					local275 = this.aClass5_Sub1_Sub4_7.method464();
					Class45.method361(local163).anInt657 = (local275 << 16) + local168;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 140) {
					this.method618(this.anInt959, this.aClass5_Sub1_Sub4_7);
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 178) {
					local163 = this.aClass5_Sub1_Sub4_7.method463();
					local168 = this.aClass5_Sub1_Sub4_7.method465();
					Class45.method361(local168).anInt662 = 1;
					Class45.method361(local168).anInt663 = local163;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 134) {
					local163 = this.aClass5_Sub1_Sub4_7.method465();
					Class45.method361(local163).anInt662 = 3;
					if (aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass24_2 == null) {
						Class45.method361(local163).anInt663 = (aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray106[0] << 25) + (aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray106[4] << 20) + (aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray107[0] << 15) + (aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray107[8] << 10) + (aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray107[11] << 5) + aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray107[1];
					} else {
						Class45.method361(local163).anInt663 = (int) (aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass24_2.aLong12 + 305419896L);
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 237 || this.anInt960 == 81 || this.anInt960 == 157 || this.anInt960 == 196 || this.anInt960 == 180 || this.anInt960 == 143 || this.anInt960 == 12 || this.anInt960 == 129 || this.anInt960 == 163 || this.anInt960 == 45 || this.anInt960 == 68) {
					this.method617(this.aClass5_Sub1_Sub4_7, (byte) 5, this.anInt960);
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 220) {
					this.aBoolean269 = false;
					this.anInt1030 = 1;
					this.aString17 = "";
					this.aBoolean246 = true;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 33) {
					this.anInt1016 = this.aClass5_Sub1_Sub4_7.method455();
					this.anInt1015 = this.aClass5_Sub1_Sub4_7.method457(this.aBoolean234);
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 176) {
					this.aBoolean269 = false;
					this.anInt1030 = 2;
					this.aString17 = "";
					this.aBoolean246 = true;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 100) {
					this.aBoolean264 = true;
					local163 = this.aClass5_Sub1_Sub4_7.method457(this.aBoolean234);
					local168 = this.aClass5_Sub1_Sub4_7.method471();
					local275 = this.aClass5_Sub1_Sub4_7.method437();
					this.anIntArray270[local163] = local168;
					this.anIntArray218[local163] = local275;
					this.anIntArray213[local163] = 1;
					for (local280 = 0; local280 < 98; local280++) {
						if (local168 >= anIntArray266[local280]) {
							this.anIntArray213[local163] = local280 + 2;
						}
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 168) {
					@Pc(3915) byte local3915 = this.aClass5_Sub1_Sub4_7.method459();
					local168 = this.aClass5_Sub1_Sub4_7.method439();
					this.anIntArray234[local168] = local3915;
					if (this.anIntArray231[local168] != local3915) {
						this.anIntArray231[local168] = local3915;
						this.method612(local168);
						this.aBoolean264 = true;
						if (this.anInt918 != -1) {
							this.aBoolean246 = true;
						}
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 128) {
					this.aBoolean264 = true;
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					local527 = Class45.method361(local163);
					while (this.aClass5_Sub1_Sub4_7.anInt755 < this.anInt959) {
						local275 = this.aClass5_Sub1_Sub4_7.method451();
						local280 = this.aClass5_Sub1_Sub4_7.method439();
						local540 = this.aClass5_Sub1_Sub4_7.method437();
						if (local540 == 255) {
							local540 = this.aClass5_Sub1_Sub4_7.method442();
						}
						if (local275 >= 0 && local275 < local527.anIntArray131.length) {
							local527.anIntArray131[local275] = local280;
							local527.anIntArray126[local275] = local540;
						}
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 106) {
					this.method649(this.aClass5_Sub1_Sub4_7, this.anInt959);
					this.aBoolean236 = false;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 37) {
					this.anInt920 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 97) {
					this.anInt880 = this.anInt959 / 8;
					for (local163 = 0; local163 < this.anInt880; local163++) {
						this.aLongArray4[local163] = this.aClass5_Sub1_Sub4_7.method443();
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 235) {
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					local168 = this.aClass5_Sub1_Sub4_7.method465();
					this.method663(local168);
					if (local163 != -1) {
						this.method663(local163);
					}
					if (this.anInt940 != -1) {
						this.method584(this.anInt940);
						this.anInt940 = -1;
					}
					if (this.anInt951 != -1) {
						this.method584(this.anInt951);
						this.anInt951 = -1;
					}
					if (this.anInt990 != -1) {
						this.method584(this.anInt990);
						this.anInt990 = -1;
					}
					if (this.anInt924 != local168) {
						this.method584(this.anInt924);
						this.anInt924 = local168;
					}
					if (this.anInt878 != local168) {
						this.method584(this.anInt878);
						this.anInt878 = local163;
					}
					this.anInt1030 = 0;
					this.aBoolean239 = false;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 148) {
					this.aBoolean266 = false;
					for (local163 = 0; local163 < 5; local163++) {
						this.aBooleanArray11[local163] = false;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 146) {
					local163 = this.aClass5_Sub1_Sub4_7.method456();
					local1912 = this.aClass5_Sub1_Sub4_7.method444();
					local275 = this.aClass5_Sub1_Sub4_7.method456();
					if (local163 >= 1 && local163 <= 5) {
						if (local1912.equalsIgnoreCase("null")) {
							local1912 = null;
						}
						this.aStringArray10[local163 - 1] = local1912;
						this.aBooleanArray12[local163 - 1] = local275 == 0;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 28) {
					local163 = this.aClass5_Sub1_Sub4_7.method465();
					local168 = this.aClass5_Sub1_Sub4_7.method466();
					local2088 = Class45.method361(local163);
					if (local2088.anInt643 != local168 || local168 == -1) {
						local2088.anInt643 = local168;
						local2088.anInt667 = 0;
						local2088.anInt648 = 0;
					}
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 152) {
					local163 = this.aClass5_Sub1_Sub4_7.method464();
					local168 = this.aClass5_Sub1_Sub4_7.method465();
					local275 = this.aClass5_Sub1_Sub4_7.method465();
					if (local163 == 65535) {
						Class45.method361(local275).anInt662 = 0;
						this.anInt960 = -1;
						return true;
					}
					@Pc(4327) Class17 local4327 = Class17.method130(local163);
					Class45.method361(local275).anInt662 = 4;
					Class45.method361(local275).anInt663 = local163;
					Class45.method361(local275).anInt652 = local4327.anInt245;
					Class45.method361(local275).anInt653 = local4327.anInt252;
					Class45.method361(local275).anInt651 = local4327.anInt258 * 100 / local168;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 95) {
					this.anInt998 = this.aClass5_Sub1_Sub4_7.method437();
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 114) {
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					if (local163 == 65535) {
						local163 = -1;
					}
					if (local163 != this.anInt867 && this.aBoolean273 && !aBoolean258 && this.anInt873 == 0) {
						this.anInt923 = local163;
						this.aBoolean248 = true;
						this.aClass26_Sub1_1.method206(2, this.anInt923);
					}
					this.anInt867 = local163;
					this.anInt960 = -1;
					return true;
				}
				if (this.anInt960 == 31) {
					local163 = this.aClass5_Sub1_Sub4_7.method439();
					local168 = this.aClass5_Sub1_Sub4_7.method468();
					if (this.aBoolean273 && !aBoolean258) {
						this.anInt923 = local163;
						this.aBoolean248 = false;
						this.aClass26_Sub1_1.method206(2, this.anInt923);
						this.anInt873 = local168;
					}
					this.anInt960 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt960 + "," + this.anInt959 + " - " + this.anInt1010 + "," + this.anInt1011);
				this.method658();
			} catch (@Pc(4485) IOException local4485) {
				this.method660();
			} catch (@Pc(4490) Exception local4490) {
				local1901 = "T2 - " + this.anInt960 + "," + this.anInt1010 + "," + this.anInt1011 + " - " + this.anInt959 + "," + (this.anInt983 + aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0]) + "," + (this.anInt984 + aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0]) + " - ";
				for (local168 = 0; local168 < this.anInt959 && local168 < 50; local168++) {
					local1901 = local1901 + this.aClass5_Sub1_Sub4_7.aByteArray20[local168] + ",";
				}
				signlink.reporterror(local1901);
				this.method658();
			}
			return true;
		} catch (@Pc(4571) RuntimeException local4571) {
			signlink.reporterror("4438, " + 1 + ", " + local4571.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method676() {
		try {
			this.anInt1018++;
			this.method648(true, this.aByte33);
			this.method595(true);
			this.method648(false, this.aByte33);
			this.method595(false);
			this.method619(847);
			this.method702();
			@Pc(40) int local40;
			@Pc(79) int local79;
			if (!this.aBoolean266) {
				local40 = this.anInt932;
				if (this.anInt865 / 256 > local40) {
					local40 = this.anInt865 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray241[4] + 128 > local40) {
					local40 = this.anIntArray241[4] + 128;
				}
				local79 = this.anInt933 + this.anInt942 & 0x7FF;
				this.method630(this.anInt944, this.method631(aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501, aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502, this.anInt948) - 50, (byte) 9, this.anInt945, local40, local79, local40 * 3 + 600);
			}
			if (this.aBoolean266) {
				local40 = this.method662();
			} else {
				local40 = this.method661();
			}
			local79 = this.anInt976;
			@Pc(123) int local123 = this.anInt977;
			@Pc(126) int local126 = this.anInt978;
			@Pc(129) int local129 = this.anInt979;
			@Pc(132) int local132 = this.anInt980;
			@Pc(181) int local181;
			for (@Pc(134) int local134 = 0; local134 < 5; local134++) {
				if (this.aBooleanArray11[local134]) {
					local181 = (int) (Math.random() * (double) (this.anIntArray212[local134] * 2 + 1) - (double) this.anIntArray212[local134] + Math.sin((double) this.anIntArray248[local134] * ((double) this.anIntArray254[local134] / 100.0D)) * (double) this.anIntArray241[local134]);
					if (local134 == 0) {
						this.anInt976 += local181;
					}
					if (local134 == 1) {
						this.anInt977 += local181;
					}
					if (local134 == 2) {
						this.anInt978 += local181;
					}
					if (local134 == 3) {
						this.anInt980 = this.anInt980 + local181 & 0x7FF;
					}
					if (local134 == 4) {
						this.anInt979 += local181;
						if (this.anInt979 < 128) {
							this.anInt979 = 128;
						}
						if (this.anInt979 > 383) {
							this.anInt979 = 383;
						}
					}
				}
			}
			local181 = Class5_Sub1_Sub2_Sub4.anInt639;
			Class5_Sub1_Sub1_Sub6.aBoolean198 = true;
			Class5_Sub1_Sub1_Sub6.anInt702 = 0;
			Class5_Sub1_Sub1_Sub6.anInt700 = super.anInt815 - 4;
			Class5_Sub1_Sub1_Sub6.anInt701 = super.anInt816 - 4;
			Class5_Sub1_Sub2.method333();
			this.aClass48_1.method513(this.anInt980, this.anInt977, this.anInt979, local40, this.anInt978, this.anInt976);
			this.aClass48_1.method488();
			this.method616();
			this.method705();
			this.method707(local181);
			this.method672();
			this.aClass10_14.method45(super.aGraphics2, 4, 4, this.anInt999);
			this.anInt976 = local79;
			this.anInt977 = local123;
			this.anInt978 = local126;
			this.anInt979 = local129;
			this.anInt980 = local132;
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("27176, " + false + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method583(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt866 = arg0;
			this.aString21 = arg1;
			this.method632();
			if (this.aClass31_2 == null) {
				super.method583(arg0, arg1);
			} else {
				this.aClass10_21.method44();
				this.aClass5_Sub1_Sub2_Sub1_4.method178("RuneScape is loading - please wait...", 16777215, 54, 180);
				Class5_Sub1_Sub2.method336(9179409, 62, 304, 28, 34);
				Class5_Sub1_Sub2.method336(0, 63, 302, 29, 32);
				Class5_Sub1_Sub2.method335(64, 9179409, 30, arg0 * 3, 30);
				Class5_Sub1_Sub2.method335(64, 0, arg0 * 3 + 30, 300 - arg0 * 3, 30);
				this.aClass5_Sub1_Sub2_Sub1_4.method178(arg1, 16777215, 85, 180);
				this.aClass10_21.method45(super.aGraphics2, 202, 171, this.anInt999);
				if (this.aBoolean249) {
					this.aBoolean249 = false;
					if (!this.aBoolean254) {
						this.aClass10_22.method45(super.aGraphics2, 0, 0, this.anInt999);
						this.aClass10_23.method45(super.aGraphics2, 637, 0, this.anInt999);
					}
					this.aClass10_19.method45(super.aGraphics2, 128, 0, this.anInt999);
					this.aClass10_20.method45(super.aGraphics2, 202, 371, this.anInt999);
					this.aClass10_24.method45(super.aGraphics2, 0, 265, this.anInt999);
					this.aClass10_25.method45(super.aGraphics2, 562, 265, this.anInt999);
					this.aClass10_26.method45(super.aGraphics2, 128, 171, this.anInt999);
					this.aClass10_27.method45(super.aGraphics2, 562, 171, this.anInt999);
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("5145, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!MTFZASIN;)V")
	private void method677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub1_Sub1_Sub3_Sub2 arg3) {
		try {
			if (arg3 != aClass5_Sub1_Sub1_Sub3_Sub2_1 && this.anInt881 < 400) {
				@Pc(35) String local35;
				if (arg3.anInt510 == 0) {
					local35 = arg3.aString10 + method639(aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt517, arg3.anInt517) + " (level-" + arg3.anInt517 + ")";
				} else {
					local35 = arg3.aString10 + " (skill-" + arg3.anInt510 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt869 == 1) {
					this.aStringArray13[this.anInt881] = "Use " + this.aString18 + " with @whi@" + local35;
					this.anIntArray274[this.anInt881] = 441;
					this.anIntArray275[this.anInt881] = arg2;
					this.anIntArray272[this.anInt881] = arg1;
					this.anIntArray273[this.anInt881] = arg0;
					this.anInt881++;
				} else if (this.anInt882 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray10[local165] != null) {
							this.aStringArray13[this.anInt881] = this.aStringArray10[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray10[local165].equalsIgnoreCase("attack")) {
								if (arg3.anInt517 > aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt517) {
									local192 = 2000;
								}
								if (aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt509 != 0 && arg3.anInt509 != 0) {
									if (aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt509 == arg3.anInt509) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray12[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray274[this.anInt881] = local192 + 940;
							}
							if (local165 == 1) {
								this.anIntArray274[this.anInt881] = local192 + 250;
							}
							if (local165 == 2) {
								this.anIntArray274[this.anInt881] = local192 + 534;
							}
							if (local165 == 3) {
								this.anIntArray274[this.anInt881] = local192 + 269;
							}
							if (local165 == 4) {
								this.anIntArray274[this.anInt881] = local192 + 576;
							}
							this.anIntArray275[this.anInt881] = arg2;
							this.anIntArray272[this.anInt881] = arg1;
							this.anIntArray273[this.anInt881] = arg0;
							this.anInt881++;
						}
					}
				} else if ((this.anInt884 & 0x8) == 8) {
					this.aStringArray13[this.anInt881] = this.aString19 + " @whi@" + local35;
					this.anIntArray274[this.anInt881] = 843;
					this.anIntArray275[this.anInt881] = arg2;
					this.anIntArray272[this.anInt881] = arg1;
					this.anIntArray273[this.anInt881] = arg0;
					this.anInt881++;
				}
				for (local165 = 0; local165 < this.anInt881; local165++) {
					if (this.anIntArray274[local165] == 765) {
						this.aStringArray13[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("29068, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Ljava/net/Socket;")
	public Socket method678(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method679(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 1) {
				aBoolean243 = !aBoolean243;
			}
			@Pc(20) int local20;
			@Pc(27) int local27;
			if (this.anInt835 == 0) {
				local20 = super.anInt811 / 2 - 80;
				local27 = super.anInt812 / 2 + 20;
				@Pc(28) int local28 = local27 + 20;
				if (super.anInt820 == 1 && super.anInt821 >= local20 - 75 && super.anInt821 <= local20 + 75 && super.anInt822 >= local28 - 20 && super.anInt822 <= local28 + 20) {
					this.anInt835 = 3;
					this.anInt982 = 0;
				}
				local20 = super.anInt811 / 2 + 80;
				if (super.anInt820 == 1 && super.anInt821 >= local20 - 75 && super.anInt821 <= local20 + 75 && super.anInt822 >= local28 - 20 && super.anInt822 <= local28 + 20) {
					this.aString28 = "";
					this.aString29 = "Enter your username & password.";
					this.anInt835 = 2;
					this.anInt982 = 0;
					return;
				}
			} else {
				if (this.anInt835 == 2) {
					local20 = super.anInt812 / 2 - 40;
					local20 += 30;
					local20 += 25;
					if (super.anInt820 == 1 && super.anInt822 >= local20 - 15 && super.anInt822 < local20) {
						this.anInt982 = 0;
					}
					local20 += 15;
					if (super.anInt820 == 1 && super.anInt822 >= local20 - 15 && super.anInt822 < local20) {
						this.anInt982 = 1;
					}
					local20 += 15;
					local27 = super.anInt811 / 2 - 80;
					@Pc(173) int local173 = super.anInt812 / 2 + 50;
					@Pc(174) int local174 = local173 + 20;
					if (super.anInt820 == 1 && super.anInt821 >= local27 - 75 && super.anInt821 <= local27 + 75 && super.anInt822 >= local174 - 20 && super.anInt822 <= local174 + 20) {
						this.anInt949 = 0;
						this.method656(this.aString24, this.aString25, false);
						if (this.aBoolean245) {
							return;
						}
					}
					local27 = super.anInt811 / 2 + 80;
					if (super.anInt820 == 1 && super.anInt821 >= local27 - 75 && super.anInt821 <= local27 + 75 && super.anInt822 >= local174 - 20 && super.anInt822 <= local174 + 20) {
						this.anInt835 = 0;
						this.aString24 = "";
						this.aString25 = "";
					}
					while (true) {
						while (true) {
							@Pc(264) int local264 = this.method575();
							if (local264 == -1) {
								return;
							}
							@Pc(269) boolean local269 = false;
							for (@Pc(271) int local271 = 0; local271 < aString20.length(); local271++) {
								if (local264 == aString20.charAt(local271)) {
									local269 = true;
									break;
								}
							}
							if (this.anInt982 == 0) {
								if (local264 == 8 && this.aString24.length() > 0) {
									this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
								}
								if (local264 == 9 || local264 == 10 || local264 == 13) {
									this.anInt982 = 1;
								}
								if (local269) {
									this.aString24 = this.aString24 + (char) local264;
								}
								if (this.aString24.length() > 12) {
									this.aString24 = this.aString24.substring(0, 12);
								}
							} else if (this.anInt982 == 1) {
								if (local264 == 8 && this.aString25.length() > 0) {
									this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
								}
								if (local264 == 9 || local264 == 10 || local264 == 13) {
									this.anInt982 = 0;
								}
								if (local269) {
									this.aString25 = this.aString25 + (char) local264;
								}
								if (this.aString25.length() > 20) {
									this.aString25 = this.aString25.substring(0, 20);
								}
							}
						}
					}
				}
				if (this.anInt835 != 3) {
					return;
				}
				local20 = super.anInt811 / 2;
				local27 = super.anInt812 / 2 + 50;
				local27 += 20;
				if (super.anInt820 != 1 || super.anInt821 < local20 - 75 || super.anInt821 > local20 + 75 || super.anInt822 < local27 - 20 || super.anInt822 > local27 + 20) {
					return;
				}
				this.anInt835 = 0;
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("64122, " + arg0 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method680() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt891; local3++) {
				if (this.anIntArray233[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray228[local3] != this.anInt966 || this.anIntArray217[local3] != this.anInt1041) {
							@Pc(45) Class5_Sub1_Sub4 local45 = Class38.method252(this.anIntArray217[local3], this.anIntArray228[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt755 / 22) > this.aLong32 + (long) (this.anInt1036 / 22)) {
								this.anInt1036 = local45.anInt755;
								this.aLong32 = System.currentTimeMillis();
								if (this.method645(local45.anInt755, local45.aByteArray20)) {
									this.anInt966 = this.anIntArray228[local3];
									this.anInt1041 = this.anIntArray217[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method665()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray233[local3] != -5) {
						this.anIntArray233[local3] = -5;
					} else {
						this.anInt891--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt891; local111++) {
							this.anIntArray228[local111] = this.anIntArray228[local111 + 1];
							this.anIntArray217[local111] = this.anIntArray217[local111 + 1];
							this.anIntArray233[local111] = this.anIntArray233[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray233[local3]--;
				}
			}
			if (this.anInt873 > 0) {
				this.anInt873 -= 20;
				if (this.anInt873 < 0) {
					this.anInt873 = 0;
				}
				if (this.anInt873 == 0 && this.aBoolean273 && !aBoolean258) {
					this.anInt923 = this.anInt867;
					this.aBoolean248 = true;
					this.aClass26_Sub1_1.method206(2, this.anInt923);
					return;
				}
			}
		} catch (@Pc(212) RuntimeException local212) {
			signlink.reporterror("35769, " + false + ", " + local212.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method681(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MTFZASIN;IIILclient!XGRGMPUQ;)V")
	private void method682(@OriginalArg(0) Class5_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub1_Sub4 arg3) {
		try {
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(22) int local22;
			if ((arg1 & 0x10) != 0) {
				local14 = arg3.method439();
				local18 = arg3.method455();
				local22 = arg3.method456();
				@Pc(25) int local25 = arg3.anInt755;
				if (arg0.aString10 != null && arg0.aBoolean140) {
					@Pc(35) long local35 = Class11.method47(arg0.aString10);
					@Pc(37) boolean local37 = false;
					if (local18 <= 1) {
						for (@Pc(42) int local42 = 0; local42 < this.anInt880; local42++) {
							if (this.aLongArray4[local42] == local35) {
								local37 = true;
								break;
							}
						}
					}
					if (!local37 && this.anInt859 == 0) {
						try {
							this.aClass5_Sub1_Sub4_6.anInt755 = 0;
							arg3.method446(this.aClass5_Sub1_Sub4_6.aByteArray20, local22);
							this.aClass5_Sub1_Sub4_6.anInt755 = 0;
							@Pc(87) String local87 = Class44.method304(this.aClass5_Sub1_Sub4_6, 7, local22);
							@Pc(91) String local91 = Class50.method543(local87);
							arg0.aString9 = local91;
							arg0.anInt492 = local14 >> 8;
							arg0.anInt504 = local14 & 0xFF;
							arg0.anInt462 = 150;
							if (local18 == 2 || local18 == 3) {
								this.method668(1, "@cr2@" + arg0.aString10, local91);
							} else if (local18 == 1) {
								this.method668(1, "@cr1@" + arg0.aString10, local91);
							} else {
								this.method668(2, arg0.aString10, local91);
							}
						} catch (@Pc(155) Exception local155) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt755 = local25 + local22;
			}
			if ((arg1 & 0x20) != 0) {
				arg0.anInt499 = arg3.method464();
				arg0.anInt500 = arg3.method464();
			}
			if ((arg1 & 0x200) != 0) {
				arg0.anInt477 = arg3.method456();
				arg0.anInt479 = arg3.method437();
				arg0.anInt478 = arg3.method455();
				arg0.anInt480 = arg3.method437();
				arg0.anInt481 = arg3.method464() + anInt1022;
				arg0.anInt482 = arg3.method439() + anInt1022;
				arg0.anInt483 = arg3.method456();
				arg0.method235();
			}
			if ((arg1 & 0x2) != 0) {
				arg0.aString9 = arg3.method444();
				if (arg0.aString9.charAt(0) == '~') {
					arg0.aString9 = arg0.aString9.substring(1);
					this.method668(2, arg0.aString10, arg0.aString9);
				} else if (arg0 == aClass5_Sub1_Sub1_Sub3_Sub2_1) {
					this.method668(2, arg0.aString10, arg0.aString9);
				}
				arg0.anInt492 = 0;
				arg0.anInt504 = 0;
				arg0.anInt462 = 150;
			}
			if ((arg1 & 0x400) != 0) {
				arg0.anInt487 = arg3.method463();
				local14 = arg3.method471();
				arg0.anInt491 = local14 >> 16;
				arg0.anInt490 = anInt1022 + (local14 & 0xFFFF);
				arg0.anInt488 = 0;
				arg0.anInt489 = 0;
				if (arg0.anInt490 > anInt1022) {
					arg0.anInt488 = -1;
				}
				if (arg0.anInt487 == 65535) {
					arg0.anInt487 = -1;
				}
			}
			if ((arg1 & 0x100) != 0) {
				local14 = arg3.method455();
				local18 = arg3.method455();
				arg0.method238(local18, anInt1022, local14);
				arg0.anInt468 = anInt1022 + 300;
				arg0.anInt469 = arg3.method437();
				arg0.anInt470 = arg3.method455();
			}
			if ((arg1 & 0x1) != 0) {
				arg0.anInt484 = arg3.method463();
				if (arg0.anInt484 == 65535) {
					arg0.anInt484 = -1;
				}
			}
			if ((arg1 & 0x8) != 0) {
				local14 = arg3.method456();
				@Pc(374) byte[] local374 = new byte[local14];
				@Pc(380) Class5_Sub1_Sub4 local380 = new Class5_Sub1_Sub4(local374, -82);
				arg3.method446(local374, local14);
				this.aClass5_Sub1_Sub4Array1[arg2] = local380;
				arg0.method241(local380);
			}
			if ((arg1 & 0x80) != 0) {
				local14 = arg3.method439();
				if (local14 == 65535) {
					local14 = -1;
				}
				local18 = arg3.method437();
				if (local14 == arg0.anInt463 && local14 != -1) {
					local22 = Class32.aClass32Array1[local14].anInt449;
					if (local22 == 1) {
						arg0.anInt464 = 0;
						arg0.anInt465 = 0;
						arg0.anInt466 = local18;
						arg0.anInt467 = 0;
					}
					if (local22 == 2) {
						arg0.anInt467 = 0;
					}
				} else if (local14 == -1 || arg0.anInt463 == -1 || Class32.aClass32Array1[local14].anInt443 >= Class32.aClass32Array1[arg0.anInt463].anInt443) {
					arg0.anInt463 = local14;
					arg0.anInt464 = 0;
					arg0.anInt465 = 0;
					arg0.anInt466 = local18;
					arg0.anInt467 = 0;
					arg0.anInt485 = arg0.anInt498;
				}
			}
			if ((arg1 & 0x4) != 0) {
				local14 = arg3.method456();
				local18 = arg3.method457(this.aBoolean234);
				arg0.method238(local18, anInt1022, local14);
				arg0.anInt468 = anInt1022 + 300;
				arg0.anInt469 = arg3.method457(this.aBoolean234);
				arg0.anInt470 = arg3.method455();
			}
		} catch (@Pc(518) RuntimeException local518) {
			signlink.reporterror("60743, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local518.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method683() {
		try {
			@Pc(2) int local2 = this.anInt853;
			@Pc(5) int local5 = this.anInt854;
			@Pc(8) int local8 = this.anInt855;
			@Pc(11) int local11 = this.anInt856;
			Class5_Sub1_Sub2.method335(local5, 6116423, local2, local8, local11);
			Class5_Sub1_Sub2.method335(local5 + 1, 0, local2 + 1, local8 - 2, 16);
			Class5_Sub1_Sub2.method336(0, local5 + 18, local8 - 2, local2 + 1, local11 - 19);
			this.aClass5_Sub1_Sub2_Sub1_4.method182(local5 + 14, local2 + 3, 6116423, "Choose Option", (byte) 6);
			@Pc(69) int local69 = super.anInt815;
			@Pc(72) int local72 = super.anInt816;
			if (this.anInt852 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt852 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt852 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt881; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt881 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass5_Sub1_Sub2_Sub1_4.method186(this.aStringArray13[local91], local2 + 3, local108, true, local106);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("24413, " + 51 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method684(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean260) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method678(43595);
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

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method685(@OriginalArg(0) int arg0) {
		try {
			this.anInt859 = 0;
			if (arg0 != 1) {
				this.aClass5_Sub1_Sub4_8.method427(87);
			}
			@Pc(17) int local17 = (aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 >> 7) + this.anInt983;
			@Pc(25) int local25 = (aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 >> 7) + this.anInt984;
			if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
				this.anInt859 = 1;
			}
			if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
				this.anInt859 = 1;
			}
			if (this.anInt859 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
				this.anInt859 = 0;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("55359, " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method686() {
		try {
			for (@Pc(10) Class5_Sub2 local10 = (Class5_Sub2) this.aClass42_12.method299(); local10 != null; local10 = (Class5_Sub2) this.aClass42_12.method301(this.anInt1001)) {
				if (local10.anInt370 == -1) {
					local10.anInt378 = 0;
					this.method646(local10);
				} else {
					local10.method423();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("45877, " + false + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VYAVYWNE;IIIIIII)V")
	private void method687(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg0.anInt675 == 0 && arg0.anIntArray132 != null && !arg0.aBoolean191 && (arg3 >= arg2 && arg1 >= arg5 && arg3 <= arg2 + arg0.anInt647 && arg1 <= arg5 + arg0.anInt650)) {
				@Pc(34) int local34 = arg0.anIntArray132.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg0.anIntArray128[local36] + arg2;
					@Pc(54) int local54 = arg0.anIntArray133[local36] + arg5 - arg4;
					@Pc(60) Class45 local60 = Class45.method361(arg0.anIntArray132[local36]);
					@Pc(65) int local65 = local45 + local60.anInt645;
					@Pc(70) int local70 = local54 + local60.anInt649;
					if ((local60.anInt658 >= 0 || local60.anInt669 != 0) && arg3 >= local65 && arg1 >= local70 && arg3 < local65 + local60.anInt647 && arg1 < local70 + local60.anInt650) {
						if (local60.anInt658 >= 0) {
							this.anInt997 = local60.anInt658;
						} else {
							this.anInt997 = local60.anInt642;
						}
					}
					if (local60.anInt675 == 8 && arg3 >= local65 && arg1 >= local70 && arg3 < local65 + local60.anInt647 && arg1 < local70 + local60.anInt650) {
						this.anInt1028 = local60.anInt642;
					}
					if (local60.anInt675 == 0) {
						this.method687(local60, arg1, local65, arg3, local60.anInt676, local70, arg6);
						if (local60.anInt641 > local60.anInt650) {
							this.method653(arg1, arg3, local60.anInt641, local70, local60.anInt650, local65 + local60.anInt647, local60, arg6);
						}
					} else {
						if (local60.anInt654 == 1 && arg3 >= local65 && arg1 >= local70 && arg3 < local65 + local60.anInt647 && arg1 < local70 + local60.anInt650) {
							@Pc(194) boolean local194 = false;
							if (local60.anInt670 != 0) {
								local194 = this.method592(local60);
							}
							if (!local194) {
								this.aStringArray13[this.anInt881] = local60.aString14;
								this.anIntArray274[this.anInt881] = 214;
								this.anIntArray273[this.anInt881] = local60.anInt642;
								this.anInt881++;
							}
						}
						if (local60.anInt654 == 2 && this.anInt882 == 0 && arg3 >= local65 && arg1 >= local70 && arg3 < local65 + local60.anInt647 && arg1 < local70 + local60.anInt650) {
							@Pc(258) String local258 = local60.aString12;
							if (local258.indexOf(" ") != -1) {
								local258 = local258.substring(0, local258.indexOf(" "));
							}
							this.aStringArray13[this.anInt881] = local258 + " @gre@" + local60.aString15;
							this.anIntArray274[this.anInt881] = 854;
							this.anIntArray273[this.anInt881] = local60.anInt642;
							this.anInt881++;
						}
						if (local60.anInt654 == 3 && arg3 >= local65 && arg1 >= local70 && arg3 < local65 + local60.anInt647 && arg1 < local70 + local60.anInt650) {
							this.aStringArray13[this.anInt881] = "Close";
							if (arg6 == 3) {
								this.anIntArray274[this.anInt881] = 529;
							} else {
								this.anIntArray274[this.anInt881] = 821;
							}
							this.anIntArray273[this.anInt881] = local60.anInt642;
							this.anInt881++;
						}
						if (local60.anInt654 == 4 && arg3 >= local65 && arg1 >= local70 && arg3 < local65 + local60.anInt647 && arg1 < local70 + local60.anInt650) {
							this.aStringArray13[this.anInt881] = local60.aString14;
							this.anIntArray274[this.anInt881] = 856;
							this.anIntArray273[this.anInt881] = local60.anInt642;
							this.anInt881++;
						}
						if (local60.anInt654 == 5 && arg3 >= local65 && arg1 >= local70 && arg3 < local65 + local60.anInt647 && arg1 < local70 + local60.anInt650) {
							this.aStringArray13[this.anInt881] = local60.aString14;
							this.anIntArray274[this.anInt881] = 211;
							this.anIntArray273[this.anInt881] = local60.anInt642;
							this.anInt881++;
						}
						if (local60.anInt654 == 6 && !this.aBoolean239 && arg3 >= local65 && arg1 >= local70 && arg3 < local65 + local60.anInt647 && arg1 < local70 + local60.anInt650) {
							this.aStringArray13[this.anInt881] = local60.aString14;
							this.anIntArray274[this.anInt881] = 818;
							this.anIntArray273[this.anInt881] = local60.anInt642;
							this.anInt881++;
						}
						if (local60.anInt675 == 2) {
							@Pc(517) int local517 = 0;
							for (@Pc(519) int local519 = 0; local519 < local60.anInt650; local519++) {
								for (@Pc(523) int local523 = 0; local523 < local60.anInt647; local523++) {
									@Pc(534) int local534 = local65 + local523 * (local60.anInt661 + 32);
									@Pc(543) int local543 = local70 + local519 * (local60.anInt677 + 32);
									if (local517 < 20) {
										local534 += local60.anIntArray129[local517];
										local543 += local60.anIntArray127[local517];
									}
									if (arg3 >= local534 && arg1 >= local543 && arg3 < local534 + 32 && arg1 < local543 + 32) {
										this.anInt903 = local517;
										this.anInt904 = local60.anInt642;
										if (local60.anIntArray131[local517] > 0) {
											@Pc(596) Class17 local596 = Class17.method130(local60.anIntArray131[local517] - 1);
											if (this.anInt869 == 1 && local60.aBoolean185) {
												if (local60.anInt642 != this.anInt871 || local517 != this.anInt870) {
													this.aStringArray13[this.anInt881] = "Use " + this.aString18 + " with @lre@" + local596.aString4;
													this.anIntArray274[this.anInt881] = 131;
													this.anIntArray275[this.anInt881] = local596.anInt241;
													this.anIntArray272[this.anInt881] = local517;
													this.anIntArray273[this.anInt881] = local60.anInt642;
													this.anInt881++;
												}
											} else if (this.anInt882 != 1 || !local60.aBoolean185) {
												@Pc(733) int local733;
												if (local60.aBoolean185) {
													for (local733 = 4; local733 >= 3; local733--) {
														if (local596.aStringArray3 != null && local596.aStringArray3[local733] != null) {
															this.aStringArray13[this.anInt881] = local596.aStringArray3[local733] + " @lre@" + local596.aString4;
															if (local733 == 3) {
																this.anIntArray274[this.anInt881] = 34;
															}
															if (local733 == 4) {
																this.anIntArray274[this.anInt881] = 73;
															}
															this.anIntArray275[this.anInt881] = local596.anInt241;
															this.anIntArray272[this.anInt881] = local517;
															this.anIntArray273[this.anInt881] = local60.anInt642;
															this.anInt881++;
														} else if (local733 == 4) {
															this.aStringArray13[this.anInt881] = "Drop @lre@" + local596.aString4;
															this.anIntArray274[this.anInt881] = 73;
															this.anIntArray275[this.anInt881] = local596.anInt241;
															this.anIntArray272[this.anInt881] = local517;
															this.anIntArray273[this.anInt881] = local60.anInt642;
															this.anInt881++;
														}
													}
												}
												if (local60.aBoolean190) {
													this.aStringArray13[this.anInt881] = "Use @lre@" + local596.aString4;
													this.anIntArray274[this.anInt881] = 332;
													this.anIntArray275[this.anInt881] = local596.anInt241;
													this.anIntArray272[this.anInt881] = local517;
													this.anIntArray273[this.anInt881] = local60.anInt642;
													this.anInt881++;
												}
												if (local60.aBoolean185 && local596.aStringArray3 != null) {
													for (local733 = 2; local733 >= 0; local733--) {
														if (local596.aStringArray3[local733] != null) {
															this.aStringArray13[this.anInt881] = local596.aStringArray3[local733] + " @lre@" + local596.aString4;
															if (local733 == 0) {
																this.anIntArray274[this.anInt881] = 477;
															}
															if (local733 == 1) {
																this.anIntArray274[this.anInt881] = 705;
															}
															if (local733 == 2) {
																this.anIntArray274[this.anInt881] = 363;
															}
															this.anIntArray275[this.anInt881] = local596.anInt241;
															this.anIntArray272[this.anInt881] = local517;
															this.anIntArray273[this.anInt881] = local60.anInt642;
															this.anInt881++;
														}
													}
												}
												if (local60.aStringArray6 != null) {
													for (local733 = 4; local733 >= 0; local733--) {
														if (local60.aStringArray6[local733] != null) {
															this.aStringArray13[this.anInt881] = local60.aStringArray6[local733] + " @lre@" + local596.aString4;
															if (local733 == 0) {
																this.anIntArray274[this.anInt881] = 610;
															}
															if (local733 == 1) {
																this.anIntArray274[this.anInt881] = 36;
															}
															if (local733 == 2) {
																this.anIntArray274[this.anInt881] = 38;
															}
															if (local733 == 3) {
																this.anIntArray274[this.anInt881] = 277;
															}
															if (local733 == 4) {
																this.anIntArray274[this.anInt881] = 929;
															}
															this.anIntArray275[this.anInt881] = local596.anInt241;
															this.anIntArray272[this.anInt881] = local517;
															this.anIntArray273[this.anInt881] = local60.anInt642;
															this.anInt881++;
														}
													}
												}
												this.aStringArray13[this.anInt881] = "Examine @lre@" + local596.aString4;
												this.anIntArray274[this.anInt881] = 1205;
												this.anIntArray275[this.anInt881] = local596.anInt241;
												this.anIntArray272[this.anInt881] = local517;
												this.anIntArray273[this.anInt881] = local60.anInt642;
												this.anInt881++;
											} else if ((this.anInt884 & 0x10) == 16) {
												this.aStringArray13[this.anInt881] = this.aString19 + " @lre@" + local596.aString4;
												this.anIntArray274[this.anInt881] = 657;
												this.anIntArray275[this.anInt881] = local596.anInt241;
												this.anIntArray272[this.anInt881] = local517;
												this.anIntArray273[this.anInt881] = local60.anInt642;
												this.anInt881++;
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
		} catch (@Pc(1174) RuntimeException local1174) {
			signlink.reporterror("52911, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method688() {
		try {
			this.aClass10_12.method44();
			Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray243;
			this.aClass5_Sub1_Sub2_Sub3_16.method326(0, 0);
			if (this.anInt951 != -1) {
				this.method621(0, 0, Class45.method361(this.anInt951), 0);
			} else if (this.anIntArray255[this.anInt967] != -1) {
				this.method621(0, 0, Class45.method361(this.anIntArray255[this.anInt967]), 0);
			}
			if (this.aBoolean242 && this.anInt852 == 1) {
				this.method683();
			}
			this.aClass10_12.method45(super.aGraphics2, 553, 205, this.anInt999);
			this.aClass10_14.method44();
			Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("43510, " + 0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method690() {
		try {
			if (this.anInt837 != 0) {
				@Pc(10) int local10 = 0;
				if (this.anInt900 != 0) {
					local10 = 1;
				}
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray9[local17] != null) {
						@Pc(29) int local29 = this.anIntArray219[local17];
						@Pc(34) String local34 = this.aStringArray8[local17];
						if (local34 != null && local34.startsWith("@cr1@")) {
							local34 = local34.substring(5);
						}
						if (local34 != null && local34.startsWith("@cr2@")) {
							local34 = local34.substring(5);
						}
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt950 == 0 || this.anInt950 == 1 && this.method719(local34))) {
							@Pc(87) int local87 = 329 - local10 * 13;
							if (super.anInt815 > 4 && super.anInt816 - 4 > local87 - 10 && super.anInt816 - 4 <= local87 + 3) {
								@Pc(126) int local126 = this.aClass5_Sub1_Sub2_Sub1_3.method180("From:  " + local34 + this.aStringArray9[local17]) + 25;
								if (local126 > 450) {
									local126 = 450;
								}
								if (super.anInt815 < local126 + 4) {
									if (this.anInt1029 >= 1) {
										this.aStringArray13[this.anInt881] = "Report abuse @whi@" + local34;
										this.anIntArray274[this.anInt881] = 2726;
										this.anInt881++;
									}
									this.aStringArray13[this.anInt881] = "Add ignore @whi@" + local34;
									this.anIntArray274[this.anInt881] = 2495;
									this.anInt881++;
									this.aStringArray13[this.anInt881] = "Add friend @whi@" + local34;
									this.anIntArray274[this.anInt881] = 2678;
									this.anInt881++;
								}
							}
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if ((local29 == 5 || local29 == 6) && this.anInt950 < 2) {
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(239) RuntimeException local239) {
			signlink.reporterror("63729, " + 794 + ", " + local239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method691() {
		try {
			if (this.anInt881 >= 2 || this.anInt869 != 0 || this.anInt882 != 0) {
				@Pc(31) String local31;
				if (this.anInt869 == 1 && this.anInt881 < 2) {
					local31 = "Use " + this.aString18 + " with...";
				} else if (this.anInt882 == 1 && this.anInt881 < 2) {
					local31 = this.aString19 + "...";
				} else {
					local31 = this.aStringArray13[this.anInt881 - 1];
				}
				if (this.anInt881 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt881 - 2) + " more options";
				}
				this.aClass5_Sub1_Sub2_Sub1_4.method187(local31, anInt1022 / 1000, 16777215, 4, 15);
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("33455, " + -32751 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method692() {
		try {
			try {
				@Pc(16) int local16 = aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 + this.anInt928;
				@Pc(22) int local22 = aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 + this.anInt1050;
				if (this.anInt944 - local16 < -500 || this.anInt944 - local16 > 500 || this.anInt945 - local22 < -500 || this.anInt945 - local22 > 500) {
					this.anInt944 = local16;
					this.anInt945 = local22;
				}
				if (this.anInt944 != local16) {
					this.anInt944 += (local16 - this.anInt944) / 16;
				}
				if (this.anInt945 != local22) {
					this.anInt945 += (local22 - this.anInt945) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt934 += (-this.anInt934 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt934 += (24 - this.anInt934) / 2;
				} else {
					this.anInt934 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt935 += (12 - this.anInt935) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt935 += (-this.anInt935 - 12) / 2;
				} else {
					this.anInt935 /= 2;
				}
				this.anInt933 = this.anInt933 + this.anInt934 / 2 & 0x7FF;
				this.anInt932 += this.anInt935 / 2;
				if (this.anInt932 < 128) {
					this.anInt932 = 128;
				}
				if (this.anInt932 > 383) {
					this.anInt932 = 383;
				}
				@Pc(209) int local209 = this.anInt944 >> 7;
				@Pc(214) int local214 = this.anInt945 >> 7;
				@Pc(224) int local224 = this.method631(this.anInt944, this.anInt945, this.anInt948);
				@Pc(226) int local226 = 0;
				@Pc(242) int local242;
				if (local209 > 3 && local214 > 3 && local209 < 100 && local214 < 100) {
					for (local242 = local209 - 4; local242 <= local209 + 4; local242++) {
						for (@Pc(248) int local248 = local214 - 4; local248 <= local214 + 4; local248++) {
							@Pc(253) int local253 = this.anInt948;
							if (local253 < 3 && (this.aByteArrayArrayArray8[1][local242][local248] & 0x2) == 2) {
								local253++;
							}
							@Pc(280) int local280 = local224 - this.anIntArrayArrayArray7[local253][local242][local248];
							if (local280 > local226) {
								local226 = local280;
							}
						}
					}
				}
				local242 = local226 * 192;
				if (local242 > 98048) {
					local242 = 98048;
				}
				if (local242 < 32768) {
					local242 = 32768;
				}
				if (local242 > this.anInt865) {
					this.anInt865 += (local242 - this.anInt865) / 24;
				} else if (local242 < this.anInt865) {
					this.anInt865 += (local242 - this.anInt865) / 80;
				}
			} catch (@Pc(344) Exception local344) {
				signlink.reporterror("glfc_ex " + aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 + "," + aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 + "," + this.anInt944 + "," + this.anInt945 + "," + this.anInt1048 + "," + this.anInt1049 + "," + this.anInt983 + "," + this.anInt984);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("98049, " + 6 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
	private String method693(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("67790, " + -56 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method694() {
		try {
			this.aClass5_Sub1_Sub4_8.method426(189);
			if (this.anInt951 != -1) {
				this.method584(this.anInt951);
				this.anInt951 = -1;
				this.aBoolean264 = true;
				this.aBoolean239 = false;
				this.aBoolean241 = true;
			}
			if (this.anInt990 != -1) {
				this.method584(this.anInt990);
				this.anInt990 = -1;
				this.aBoolean246 = true;
				this.aBoolean239 = false;
			}
			if (this.anInt924 != -1) {
				this.method584(this.anInt924);
				this.anInt924 = -1;
				this.aBoolean249 = true;
			}
			if (this.anInt878 != -1) {
				this.method584(this.anInt878);
				this.anInt878 = -1;
			}
			if (this.anInt940 != -1) {
				this.method584(this.anInt940);
				this.anInt940 = -1;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("11875, " + -156 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method695() {
		try {
			if (this.aByte39 != -70) {
				this.anInt902 = -43;
			}
			this.aBoolean263 = true;
			for (@Pc(13) int local13 = 0; local13 < 7; local13++) {
				this.anIntArray215[local13] = -1;
				for (@Pc(22) int local22 = 0; local22 < Class7.anInt38; local22++) {
					if (!Class7.aClass7Array1[local22].aBoolean30 && Class7.aClass7Array1[local22].anInt39 == local13 + (this.aBoolean270 ? 0 : 7)) {
						this.anIntArray215[local13] = local22;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("39838, " + -70 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) boolean local12 = false;
			@Pc(15) Class45 local15 = Class45.method361(arg0);
			for (@Pc(17) int local17 = 0; local17 < local15.anIntArray132.length && local15.anIntArray132[local17] != -1; local17++) {
				@Pc(31) Class45 local31 = Class45.method361(local15.anIntArray132[local17]);
				if (local31.anInt675 == 1) {
					local12 |= this.method696(local31.anInt642, arg1);
				}
				@Pc(66) int local66;
				if (local31.anInt675 == 6 && (local31.anInt643 != -1 || local31.anInt644 != -1)) {
					@Pc(61) boolean local61 = this.method635(local31);
					if (local61) {
						local66 = local31.anInt644;
					} else {
						local66 = local31.anInt643;
					}
					if (local66 != -1) {
						@Pc(78) Class32 local78 = Class32.aClass32Array1[local66];
						local31.anInt648 += arg1;
						while (local31.anInt648 > local78.method229(local31.anInt667, this.aByte35)) {
							local31.anInt648 -= local78.method229(local31.anInt667, this.aByte35) + 1;
							local31.anInt667++;
							if (local31.anInt667 >= local78.anInt441) {
								local31.anInt667 -= local78.anInt442;
								if (local31.anInt667 < 0 || local31.anInt667 >= local78.anInt441) {
									local31.anInt667 = 0;
								}
							}
							local12 = true;
						}
					}
				}
				if (local31.anInt675 == 6 && local31.anInt657 != 0) {
					@Pc(151) int local151 = local31.anInt657 >> 16;
					local66 = local31.anInt657 << 16 >> 16;
					@Pc(162) int local162 = local151 * arg1;
					local66 *= arg1;
					local31.anInt652 = local31.anInt652 + local162 & 0x7FF;
					local31.anInt653 = local31.anInt653 + local66 & 0x7FF;
					local12 = true;
				}
			}
			return local12;
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("19369, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZLjava/lang/String;ILjava/lang/String;)Lclient!MJLXHQTQ;")
	private Class31 method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean245 &= true;
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass19Array1[0] != null) {
					local9 = this.aClass19Array1[0].method147(this.aBoolean233, arg3);
				}
			} catch (@Pc(27) Exception local27) {
			}
			@Pc(41) int local41;
			if (local9 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local9);
				local41 = (int) this.aCRC32_2.getValue();
				if (local41 != arg1) {
					local9 = null;
				}
			}
			if (local9 != null) {
				return new Class31(20305, local9);
			}
			local41 = 0;
			while (local9 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method583(arg0, "Requesting " + arg4);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method684(arg2 + arg1);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class5_Sub1_Sub4 local102 = new Class5_Sub1_Sub4(local91, -82);
					local102.anInt755 = 3;
					@Pc(110) int local110 = local102.method441() + 6;
					@Pc(112) int local112 = 6;
					local9 = new byte[local110];
					for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
						local9[local117] = local91[local117];
					}
					@Pc(134) int local134;
					while (local112 < local110) {
						local134 = local110 - local112;
						if (local134 > 1000) {
							local134 = 1000;
						}
						@Pc(145) int local145 = local88.read(local9, local112, local134);
						if (local145 < 0) {
							(new StringBuffer("Length error: ")).append(local112).append("/").append(local110).toString();
							throw new IOException("EOF");
						}
						local112 += local145;
						@Pc(174) int local174 = local112 * 100 / local110;
						if (local174 != local77) {
							this.method583(arg0, "Loading " + arg4 + " - " + local174 + "%");
						}
						local77 = local174;
					}
					local88.close();
					try {
						if (this.aClass19Array1[0] != null) {
							this.aClass19Array1[0].method148(local9.length, local9, arg3);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass19Array1[0] = null;
					}
					if (local9 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local9);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg1) {
							local9 = null;
							local41++;
							local62 = "Checksum error: " + local134;
						}
					}
				} catch (@Pc(254) IOException local254) {
					if (local62.equals("Unknown error")) {
						local62 = "Connection error";
					}
					local9 = null;
				} catch (@Pc(264) NullPointerException local264) {
					local62 = "Null error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(273) ArrayIndexOutOfBoundsException local273) {
					local62 = "Bounds error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(282) Exception local282) {
					local62 = "Unexpected error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local9 == null) {
					for (local77 = local11; local77 > 0; local77--) {
						if (local41 >= 3) {
							this.method583(arg0, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method583(arg0, local62 + " - Retrying in " + local77);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(326) Exception local326) {
						}
					}
					local11 *= 2;
					if (local11 > 60) {
						local11 = 60;
					}
					this.aBoolean260 = !this.aBoolean260;
				}
			}
			return new Class31(20305, local9);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("17621, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(10) int local10 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * local10 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * local10 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("54458, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 88 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method699() {
		try {
			@Pc(14) int local14;
			if (this.anInt926 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt926 > 768) {
						this.anIntArray224[local14] = this.method698(this.anIntArray226[local14], 1024 - this.anInt926, this.anIntArray225[local14]);
					} else if (this.anInt926 > 256) {
						this.anIntArray224[local14] = this.anIntArray226[local14];
					} else {
						this.anIntArray224[local14] = this.method698(this.anIntArray225[local14], 256 - this.anInt926, this.anIntArray226[local14]);
					}
				}
			} else if (this.anInt927 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt927 > 768) {
						this.anIntArray224[local14] = this.method698(this.anIntArray227[local14], 1024 - this.anInt927, this.anIntArray225[local14]);
					} else if (this.anInt927 > 256) {
						this.anIntArray224[local14] = this.anIntArray227[local14];
					} else {
						this.anIntArray224[local14] = this.method698(this.anIntArray225[local14], 256 - this.anInt927, this.anIntArray227[local14]);
					}
				}
			} else {
				for (local14 = 0; local14 < 256; local14++) {
					this.anIntArray224[local14] = this.anIntArray225[local14];
				}
			}
			for (local14 = 0; local14 < 33920; local14++) {
				this.aClass10_22.anIntArray18[local14] = this.aClass5_Sub1_Sub2_Sub2_11.anIntArray112[local14];
			}
			@Pc(185) int local185 = 0;
			@Pc(187) int local187 = 1152;
			@Pc(202) int local202;
			@Pc(206) int local206;
			@Pc(216) int local216;
			@Pc(224) int local224;
			@Pc(228) int local228;
			@Pc(232) int local232;
			@Pc(243) int local243;
			for (@Pc(189) int local189 = 1; local189 < 255; local189++) {
				local202 = this.anIntArray251[local189] * (256 - local189) / 256;
				local206 = local202 + 22;
				if (local206 < 0) {
					local206 = 0;
				}
				local185 += local206;
				for (local216 = local206; local216 < 128; local216++) {
					local224 = this.anIntArray220[local185++];
					if (local224 == 0) {
						local187++;
					} else {
						local228 = local224;
						local232 = 256 - local224;
						local224 = this.anIntArray224[local224];
						local243 = this.aClass10_22.anIntArray18[local187];
						this.aClass10_22.anIntArray18[local187++] = ((local224 & 0xFF00FF) * local228 + (local243 & 0xFF00FF) * local232 & 0xFF00FF00) + ((local224 & 0xFF00) * local228 + (local243 & 0xFF00) * local232 & 0xFF0000) >> 8;
					}
				}
				local187 += local206;
			}
			this.aClass10_22.method45(super.aGraphics2, 0, 0, this.anInt999);
			for (local202 = 0; local202 < 33920; local202++) {
				this.aClass10_23.anIntArray18[local202] = this.aClass5_Sub1_Sub2_Sub2_12.anIntArray112[local202];
			}
			local185 = 0;
			local187 = 1176;
			for (local206 = 1; local206 < 255; local206++) {
				local216 = this.anIntArray251[local206] * (256 - local206) / 256;
				local224 = 103 - local216;
				local187 += local216;
				for (local228 = 0; local228 < local224; local228++) {
					local232 = this.anIntArray220[local185++];
					if (local232 == 0) {
						local187++;
					} else {
						local243 = local232;
						@Pc(367) int local367 = 256 - local232;
						local232 = this.anIntArray224[local232];
						@Pc(378) int local378 = this.aClass10_23.anIntArray18[local187];
						this.aClass10_23.anIntArray18[local187++] = ((local232 & 0xFF00FF) * local243 + (local378 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local232 & 0xFF00) * local243 + (local378 & 0xFF00) * local367 & 0xFF0000) >> 8;
					}
				}
				local185 += 128 - local224;
				local187 += 128 - local224 - local216;
			}
			this.aClass10_23.method45(super.aGraphics2, 637, 0, this.anInt999);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("29012, " + false + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method700() {
		try {
			@Pc(6) int local6 = this.anInt860 * 128 + 64;
			@Pc(13) int local13 = this.anInt861 * 128 + 64;
			@Pc(24) int local24 = this.method631(local6, local13, this.anInt948) - this.anInt862;
			if (this.anInt976 < local6) {
				this.anInt976 += this.anInt863 + (local6 - this.anInt976) * this.anInt864 / 1000;
				if (this.anInt976 > local6) {
					this.anInt976 = local6;
				}
			}
			if (this.anInt976 > local6) {
				this.anInt976 -= this.anInt863 + (this.anInt976 - local6) * this.anInt864 / 1000;
				if (this.anInt976 < local6) {
					this.anInt976 = local6;
				}
			}
			if (this.anInt977 < local24) {
				this.anInt977 += this.anInt863 + (local24 - this.anInt977) * this.anInt864 / 1000;
				if (this.anInt977 > local24) {
					this.anInt977 = local24;
				}
			}
			if (this.anInt977 > local24) {
				this.anInt977 -= this.anInt863 + (this.anInt977 - local24) * this.anInt864 / 1000;
				if (this.anInt977 < local24) {
					this.anInt977 = local24;
				}
			}
			if (this.anInt978 < local13) {
				this.anInt978 += this.anInt863 + (local13 - this.anInt978) * this.anInt864 / 1000;
				if (this.anInt978 > local13) {
					this.anInt978 = local13;
				}
			}
			if (this.anInt978 > local13) {
				this.anInt978 -= this.anInt863 + (this.anInt978 - local13) * this.anInt864 / 1000;
				if (this.anInt978 < local13) {
					this.anInt978 = local13;
				}
			}
			anInt939++;
			if (anInt939 > 158) {
				anInt939 = 0;
				this.aClass5_Sub1_Sub4_8.method426(163);
				this.aClass5_Sub1_Sub4_8.method430(6260440);
			}
			local6 = this.anInt910 * 128 + 64;
			local13 = this.anInt911 * 128 + 64;
			local24 = this.method631(local6, local13, this.anInt948) - this.anInt912;
			@Pc(240) int local240 = local6 - this.anInt976;
			@Pc(245) int local245 = local24 - this.anInt977;
			@Pc(250) int local250 = local13 - this.anInt978;
			@Pc(261) int local261 = (int) Math.sqrt((double) (local240 * local240 + local250 * local250));
			@Pc(281) int local281 = (int) (Math.atan2((double) local245, (double) local261) * 325.949D) & 0x7FF;
			@Pc(292) int local292 = (int) (Math.atan2((double) local240, (double) local250) * -325.949D) & 0x7FF;
			if (local281 < 128) {
				local281 = 128;
			}
			if (local281 > 383) {
				local281 = 383;
			}
			if (this.anInt979 < local281) {
				this.anInt979 += this.anInt913 + (local281 - this.anInt979) * this.anInt914 / 1000;
				if (this.anInt979 > local281) {
					this.anInt979 = local281;
				}
			}
			if (this.anInt979 > local281) {
				this.anInt979 -= this.anInt913 + (this.anInt979 - local281) * this.anInt914 / 1000;
				if (this.anInt979 < local281) {
					this.anInt979 = local281;
				}
			}
			@Pc(363) int local363 = local292 - this.anInt980;
			if (local363 > 1024) {
				local363 -= 2048;
			}
			if (local363 < -1024) {
				local363 += 2048;
			}
			if (local363 > 0) {
				this.anInt980 += this.anInt913 + local363 * this.anInt914 / 1000;
				this.anInt980 &= 0x7FF;
			}
			if (local363 < 0) {
				this.anInt980 -= this.anInt913 + -local363 * this.anInt914 / 1000;
				this.anInt980 &= 0x7FF;
			}
			@Pc(421) int local421 = local292 - this.anInt980;
			if (local421 > 1024) {
				local421 -= 2048;
			}
			if (local421 < -1024) {
				local421 += 2048;
			}
			if (local421 < 0 && local363 > 0 || local421 > 0 && local363 < 0) {
				this.anInt980 = local292;
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("95891, " + -873 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method701(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt845; local17++) {
					if (this.aLongArray3[local17] == arg0) {
						this.anInt845--;
						this.aBoolean264 = true;
						for (@Pc(37) int local37 = local17; local37 < this.anInt845; local37++) {
							this.aStringArray11[local37] = this.aStringArray11[local37 + 1];
							this.anIntArray229[local37] = this.anIntArray229[local37 + 1];
							this.aLongArray3[local37] = this.aLongArray3[local37 + 1];
						}
						this.aClass5_Sub1_Sub4_8.method426(54);
						this.aClass5_Sub1_Sub4_8.method433(this.aByte37, arg0);
						return;
					}
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("11369, " + arg0 + ", " + 21174 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method702() {
		try {
			for (@Pc(6) Class5_Sub1_Sub1_Sub4 local6 = (Class5_Sub1_Sub1_Sub4) this.aClass42_10.method299(); local6 != null; local6 = (Class5_Sub1_Sub1_Sub4) this.aClass42_10.method301(this.anInt1001)) {
				if (local6.anInt223 != this.anInt948 || local6.aBoolean78) {
					local6.method423();
				} else if (anInt1022 >= local6.anInt227) {
					local6.method105(this.anInt975);
					if (local6.aBoolean78) {
						local6.method423();
					} else {
						this.aClass48_1.method485(this.anInt902, local6.anInt224, local6.anInt226, 60, -1, local6.anInt225, local6.anInt223, local6, 0, false);
					}
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("75267, " + 66 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBII)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass5_Sub1_Sub2_Sub3_1.method326(arg5, arg4);
			@Pc(10) boolean local10 = false;
			this.aClass5_Sub1_Sub2_Sub3_2.method326(arg5 + arg2 - 16, arg4);
			Class5_Sub1_Sub2.method335(arg5 + 16, this.anInt909, arg4, 16, arg2 - 32);
			@Pc(47) int local47 = (arg2 - 32) * arg2 / arg0;
			if (local47 < 8) {
				local47 = 8;
			}
			@Pc(64) int local64 = (arg2 - local47 - 32) * arg1 / (arg0 - arg2);
			Class5_Sub1_Sub2.method335(arg5 + local64 + 16, this.anInt1014, arg4, 16, local47);
			Class5_Sub1_Sub2.method340(local47, arg5 + local64 + 16, this.anInt868, arg4);
			Class5_Sub1_Sub2.method340(local47, arg5 + local64 + 16, this.anInt868, arg4 + 1);
			Class5_Sub1_Sub2.method338(this.anInt868, arg5 + local64 + 16, 16, arg4);
			Class5_Sub1_Sub2.method338(this.anInt868, arg5 + local64 + 17, 16, arg4);
			Class5_Sub1_Sub2.method340(local47, arg5 + local64 + 16, this.anInt930, arg4 + 15);
			Class5_Sub1_Sub2.method340(local47 - 1, arg5 + 17 + local64, this.anInt930, arg4 + 14);
			Class5_Sub1_Sub2.method338(this.anInt930, arg5 + local64 + local47 + 15, 16, arg4);
			Class5_Sub1_Sub2.method338(this.anInt930, arg5 + local64 + local47 + 14, 15, arg4 + 1);
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("45644, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method704() {
		try {
			@Pc(23) int local23;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(92) int local92;
			@Pc(106) int local106;
			@Pc(118) int local118;
			@Pc(177) int local177;
			try {
				this.anInt973 = -1;
				this.aClass42_10.method303();
				this.aClass42_11.method303();
				Class5_Sub1_Sub2_Sub4.method345(this.anInt994);
				this.method588();
				this.aClass48_1.method474();
				System.gc();
				for (local23 = 0; local23 < 4; local23++) {
					this.aClass16Array1[local23].method106();
				}
				for (local36 = 0; local36 < 4; local36++) {
					for (local40 = 0; local40 < 104; local40++) {
						for (local44 = 0; local44 < 104; local44++) {
							this.aByteArrayArrayArray8[local36][local40][local44] = 0;
						}
					}
				}
				@Pc(78) Class46 local78 = new Class46(104, this.anIntArrayArrayArray7, this.aByteArrayArrayArray8, false, 104);
				local44 = this.aByteArrayArray5.length;
				this.aClass5_Sub1_Sub4_8.method426(214);
				@Pc(239) int local239;
				@Pc(227) int local227;
				if (!this.aBoolean240) {
					@Pc(123) byte[] local123;
					for (local92 = 0; local92 < local44; local92++) {
						local106 = (this.anIntArray237[local92] >> 8) * 64 - this.anInt983;
						local118 = (this.anIntArray237[local92] & 0xFF) * 64 - this.anInt984;
						local123 = this.aByteArrayArray5[local92];
						if (local123 != null) {
							local78.method412(this.aClass16Array1, local106, local118, (byte) 6, (this.anInt1049 - 6) * 8, local123, (this.anInt1048 - 6) * 8);
						}
					}
					for (local106 = 0; local106 < local44; local106++) {
						local118 = (this.anIntArray237[local106] >> 8) * 64 - this.anInt983;
						local177 = (this.anIntArray237[local106] & 0xFF) * 64 - this.anInt984;
						@Pc(182) byte[] local182 = this.aByteArrayArray5[local106];
						if (local182 == null && this.anInt1049 < 800) {
							local78.method420(local118, 64, 64, local177);
						}
					}
					this.aClass5_Sub1_Sub4_8.method426(214);
					for (local118 = 0; local118 < local44; local118++) {
						local123 = this.aByteArrayArray6[local118];
						if (local123 != null) {
							local227 = (this.anIntArray237[local118] >> 8) * 64 - this.anInt983;
							local239 = (this.anIntArray237[local118] & 0xFF) * 64 - this.anInt984;
							local78.method418(local239, this.aClass16Array1, local227, local123, (byte) 3, this.aClass48_1);
						}
					}
				}
				if (this.aBoolean240) {
					local92 = 0;
					label251: while (true) {
						@Pc(298) int local298;
						@Pc(304) int local304;
						@Pc(314) int local314;
						@Pc(316) int local316;
						if (local92 >= 4) {
							for (local106 = 0; local106 < 13; local106++) {
								for (local118 = 0; local118 < 13; local118++) {
									local177 = this.anIntArrayArrayArray8[0][local106][local118];
									if (local177 == -1) {
										local78.method420(local106 * 8, 8, 8, local118 * 8);
									}
								}
							}
							this.aClass5_Sub1_Sub4_8.method426(214);
							local118 = 0;
							while (true) {
								if (local118 >= 4) {
									break label251;
								}
								for (local177 = 0; local177 < 13; local177++) {
									for (local227 = 0; local227 < 13; local227++) {
										local239 = this.anIntArrayArrayArray8[local118][local177][local227];
										if (local239 != -1) {
											local298 = local239 >> 24 & 0x3;
											local304 = local239 >> 1 & 0x3;
											local314 = local239 >> 14 & 0x3FF;
											local316 = local239 >> 3 & 0x7FF;
											@Pc(479) int local479 = (local314 / 8 << 8) + local316 / 8;
											for (@Pc(481) int local481 = 0; local481 < this.anIntArray237.length; local481++) {
												if (this.anIntArray237[local481] == local479 && this.aByteArrayArray6[local481] != null) {
													local78.method411(this.aByteArrayArray6[local481], local227 * 8, this.aClass16Array1, local177 * 8, this.aClass48_1, (local316 & 0x7) * 8, local298, (local314 & 0x7) * 8, local118, local304);
													break;
												}
											}
										}
									}
								}
								local118++;
							}
						}
						for (local106 = 0; local106 < 13; local106++) {
							for (local118 = 0; local118 < 13; local118++) {
								local177 = this.anIntArrayArrayArray8[local92][local106][local118];
								if (local177 != -1) {
									local227 = local177 >> 24 & 0x3;
									local239 = local177 >> 1 & 0x3;
									local298 = local177 >> 14 & 0x3FF;
									local304 = local177 >> 3 & 0x7FF;
									local314 = (local298 / 8 << 8) + local304 / 8;
									for (local316 = 0; local316 < this.anIntArray237.length; local316++) {
										if (this.anIntArray237[local316] == local314 && this.aByteArrayArray5[local316] != null) {
											local78.method416(local118 * 8, (local304 & 0x7) * 8, local106 * 8, this.aByteArrayArray5[local316], local227, (local298 & 0x7) * 8, local239, local92, this.aClass16Array1);
											break;
										}
									}
								}
							}
						}
						local92++;
					}
				}
				this.aClass5_Sub1_Sub4_8.method426(214);
				local78.method413(this.aClass16Array1, this.aClass48_1, this.aByte36);
				if (this.aClass10_14 != null) {
					this.aClass10_14.method44();
					Class5_Sub1_Sub2_Sub4.anIntArray122 = this.anIntArray244;
				}
				this.aClass5_Sub1_Sub4_8.method426(214);
				local92 = Class46.anInt709;
				if (local92 > this.anInt948) {
					local92 = this.anInt948;
				}
				if (local92 < this.anInt948 - 1) {
					local92 = this.anInt948 - 1;
				}
				if (aBoolean258) {
					this.aClass48_1.method475(Class46.anInt709);
				} else {
					this.aClass48_1.method475(0);
				}
				for (local106 = 0; local106 < 104; local106++) {
					for (local118 = 0; local118 < 104; local118++) {
						this.method613(local106, local118);
					}
				}
				this.method686();
			} catch (@Pc(631) Exception local631) {
			}
			Class8.aClass12_3.method80();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass5_Sub1_Sub4_8.method426(210);
				this.aClass5_Sub1_Sub4_8.method431(1057001181);
			}
			if (aBoolean258 && signlink.aRandomAccessFile3 != null) {
				local23 = this.aClass26_Sub1_1.method212(0, aBoolean243);
				for (local36 = 0; local36 < local23; local36++) {
					local40 = this.aClass26_Sub1_1.method204(local36, anInt1035);
					if ((local40 & 0x79) == 0) {
						Class5_Sub1_Sub1_Sub6.method376(local36);
					}
				}
			}
			System.gc();
			Class5_Sub1_Sub2_Sub4.method346();
			this.aClass26_Sub1_1.method216();
			local23 = (this.anInt1048 - 6) / 8 - 1;
			local36 = (this.anInt1048 + 6) / 8 + 1;
			local40 = (this.anInt1049 - 6) / 8 - 1;
			local44 = (this.anInt1049 + 6) / 8 + 1;
			if (this.aBoolean235) {
				local23 = 49;
				local36 = 50;
				local40 = 49;
				local44 = 50;
			}
			for (local92 = local23; local92 <= local36; local92++) {
				for (local106 = local40; local106 <= local44; local106++) {
					if (local92 == local23 || local92 == local36 || local106 == local40 || local106 == local44) {
						local118 = this.aClass26_Sub1_1.method208(local92, local106, 0);
						if (local118 != -1) {
							this.aClass26_Sub1_1.method210(local118, this.anInt858, 3);
						}
						local177 = this.aClass26_Sub1_1.method208(local92, local106, 1);
						if (local177 != -1) {
							this.aClass26_Sub1_1.method210(local177, this.anInt858, 3);
						}
					}
				}
			}
		} catch (@Pc(804) RuntimeException local804) {
			signlink.reporterror("16304, " + 0 + ", " + local804.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method705() {
		try {
			this.aBoolean245 &= true;
			if (this.anInt875 == 2) {
				this.method712((this.anInt1002 - this.anInt983 << 7) + this.anInt1005, (this.anInt1003 - this.anInt984 << 7) + this.anInt1006, this.anInt1004 * 2);
				if (this.anInt889 > -1 && anInt1022 % 20 < 10) {
					this.aClass5_Sub1_Sub2_Sub2Array7[0].method276(this.anInt890 - 28, this.anInt889 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("11571, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!VYAVYWNE;)Z")
	private boolean method706(@OriginalArg(1) Class45 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt670;
			this.aBoolean245 &= true;
			if (this.anInt846 == 2) {
				if (local4 == 201) {
					this.aBoolean246 = true;
					this.anInt1030 = 0;
					this.aBoolean269 = true;
					this.aString26 = "";
					this.anInt847 = 1;
					this.aString30 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean246 = true;
					this.anInt1030 = 0;
					this.aBoolean269 = true;
					this.aString26 = "";
					this.anInt847 = 2;
					this.aString30 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt963 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean246 = true;
				this.anInt1030 = 0;
				this.aBoolean269 = true;
				this.aString26 = "";
				this.anInt847 = 4;
				this.aString30 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean246 = true;
				this.anInt1030 = 0;
				this.aBoolean269 = true;
				this.aString26 = "";
				this.anInt847 = 5;
				this.aString30 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray215[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class7.anInt38 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class7.anInt38) {
								local127 = 0;
							}
						}
						if (!Class7.aClass7Array1[local127].aBoolean30 && Class7.aClass7Array1[local127].anInt39 == local118 + (this.aBoolean270 ? 0 : 7)) {
							this.anIntArray215[local118] = local127;
							this.aBoolean263 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray230[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray22[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray22[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray230[local118] = local127;
				this.aBoolean263 = true;
			}
			if (local4 == 324 && !this.aBoolean270) {
				this.aBoolean270 = true;
				this.method695();
			}
			if (local4 == 325 && this.aBoolean270) {
				this.aBoolean270 = false;
				this.method695();
			}
			if (local4 == 326) {
				this.aClass5_Sub1_Sub4_8.method426(29);
				this.aClass5_Sub1_Sub4_8.method427(this.aBoolean270 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass5_Sub1_Sub4_8.method427(this.anIntArray215[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass5_Sub1_Sub4_8.method427(this.anIntArray230[local122]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean271 = !this.aBoolean271;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method694();
				if (this.aString22.length() > 0) {
					this.aClass5_Sub1_Sub4_8.method426(91);
					this.aClass5_Sub1_Sub4_8.method433(this.aByte37, Class11.method47(this.aString22));
					this.aClass5_Sub1_Sub4_8.method427(local4 - 601);
					this.aClass5_Sub1_Sub4_8.method427(this.aBoolean271 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("24489, " + true + ", " + arg0 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
	private void method707(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean258) {
				for (@Pc(11) int local11 = 0; local11 < this.anIntArray268.length; local11++) {
					@Pc(18) int local18 = this.anIntArray268[local11];
					if (Class5_Sub1_Sub2_Sub4.anIntArray124[local18] >= arg0) {
						@Pc(27) Class5_Sub1_Sub2_Sub3 local27 = Class5_Sub1_Sub2_Sub4.aClass5_Sub1_Sub2_Sub3Array1[local18];
						@Pc(35) int local35 = local27.anInt613 * local27.anInt614 - 1;
						@Pc(43) int local43 = local27.anInt613 * this.anInt975 * 2;
						@Pc(46) byte[] local46 = local27.aByteArray13;
						@Pc(49) byte[] local49 = this.aByteArray21;
						for (@Pc(51) int local51 = 0; local51 <= local35; local51++) {
							local49[local51] = local46[local51 - local43 & local35];
						}
						local27.aByteArray13 = local49;
						this.aByteArray21 = local46;
						Class5_Sub1_Sub2_Sub4.method349(local18);
						anInt840++;
						if (anInt840 > 139) {
							anInt840 = 0;
							this.aClass5_Sub1_Sub4_8.method426(26);
							this.aClass5_Sub1_Sub4_8.method430(4647988);
						}
					}
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("9472, " + -13 + ", " + arg0 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method708(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt880 >= 100) {
					this.method668(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(24) String local24 = Class11.method51(Class11.method48(this.anInt993, arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt880; local26++) {
						if (this.aLongArray4[local26] == arg0) {
							this.method668(0, "", local24 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(56) int local56 = 0; local56 < this.anInt845; local56++) {
						if (this.aLongArray3[local56] == arg0) {
							this.method668(0, "", "Please remove " + local24 + " from your friend list first");
							return;
						}
					}
					this.aLongArray4[this.anInt880++] = arg0;
					this.aBoolean264 = true;
					this.aClass5_Sub1_Sub4_8.method426(150);
					this.aClass5_Sub1_Sub4_8.method433(this.aByte37, arg0);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("78909, " + arg0 + ", " + 0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method709() {
		try {
			this.aClass5_Sub1_Sub2_Sub3_19 = new Class5_Sub1_Sub2_Sub3(this.aClass31_2, "titlebox", 0);
			this.aClass5_Sub1_Sub2_Sub3_20 = new Class5_Sub1_Sub2_Sub3(this.aClass31_2, "titlebutton", 0);
			this.aClass5_Sub1_Sub2_Sub3Array4 = new Class5_Sub1_Sub2_Sub3[12];
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				this.aClass5_Sub1_Sub2_Sub3Array4[local29] = new Class5_Sub1_Sub2_Sub3(this.aClass31_2, "runes", local29);
			}
			this.aClass5_Sub1_Sub2_Sub2_11 = new Class5_Sub1_Sub2_Sub2(128, 265);
			this.aClass5_Sub1_Sub2_Sub2_12 = new Class5_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(62) int local62 = 0; local62 < 33920; local62++) {
				this.aClass5_Sub1_Sub2_Sub2_11.anIntArray112[local62] = this.aClass10_22.anIntArray18[local62];
			}
			for (@Pc(80) int local80 = 0; local80 < 33920; local80++) {
				this.aClass5_Sub1_Sub2_Sub2_12.anIntArray112[local80] = this.aClass10_23.anIntArray18[local80];
			}
			this.anIntArray225 = new int[256];
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				this.anIntArray225[local102] = local102 * 262144;
			}
			for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
				this.anIntArray225[local117 + 64] = local117 * 1024 + 16711680;
			}
			for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
				this.anIntArray225[local136 + 128] = local136 * 4 + 16776960;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray225[local155 + 192] = 16777215;
			}
			this.anIntArray226 = new int[256];
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray226[local174] = local174 * 1024;
			}
			for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
				this.anIntArray226[local189 + 64] = local189 * 4 + 65280;
			}
			for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
				this.anIntArray226[local208 + 128] = local208 * 262144 + 65535;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray226[local227 + 192] = 16777215;
			}
			this.anIntArray227 = new int[256];
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray227[local246] = local246 * 4;
			}
			for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
				this.anIntArray227[local261 + 64] = local261 * 262144 + 255;
			}
			for (@Pc(280) int local280 = 0; local280 < 64; local280++) {
				this.anIntArray227[local280 + 128] = local280 * 1024 + 16711935;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray227[local299 + 192] = 16777215;
			}
			this.anIntArray224 = new int[256];
			this.anIntArray249 = new int[32768];
			this.anIntArray250 = new int[32768];
			this.method657(null);
			this.anIntArray220 = new int[32768];
			this.anIntArray221 = new int[32768];
			this.method583(10, "Connecting to fileserver");
			if (!this.aBoolean254) {
				this.aBoolean267 = true;
				this.aBoolean254 = true;
				this.method582(this, 2);
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("25945, " + 8 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method710(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean245 &= arg0;
			@Pc(9) int local9 = 5;
			this.anIntArray267[8] = 0;
			@Pc(16) int local16 = 0;
			while (this.anIntArray267[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method583(20, "Connecting to web server");
				try {
					@Pc(42) DataInputStream local42 = this.method684("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 347);
					@Pc(49) Class5_Sub1_Sub4 local49 = new Class5_Sub1_Sub4(new byte[40], -82);
					local42.readFully(local49.aByteArray20, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray267[local59] = local49.method442();
					}
					@Pc(74) int local74 = local49.method442();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray267[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray267[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray267[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray267[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray267[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray267[8] == 0) {
					local16++;
					for (@Pc(141) int local141 = local9; local141 > 0; local141--) {
						if (local16 >= 10) {
							this.method583(10, "Game updated - please reload page");
							local141 = 10;
						} else {
							this.method583(10, local20 + " - Will retry in " + local141 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(175) Exception local175) {
						}
					}
					local9 *= 2;
					if (local9 > 60) {
						local9 = 60;
					}
					this.aBoolean260 = !this.aBoolean260;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("63049, " + arg0 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DSYLCNKR;I)V")
	private void method711(@OriginalArg(1) Class5_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method712(arg0.anInt501, arg0.anInt502, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("3330, " + -267 + ", " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method631(arg0, arg1, this.anInt948) - arg2;
				@Pc(33) int local33 = arg0 - this.anInt976;
				@Pc(38) int local38 = local28 - this.anInt977;
				@Pc(43) int local43 = arg1 - this.anInt978;
				@Pc(48) int local48 = Class5_Sub1_Sub1_Sub6.anIntArray172[this.anInt979];
				@Pc(53) int local53 = Class5_Sub1_Sub1_Sub6.anIntArray173[this.anInt979];
				@Pc(58) int local58 = Class5_Sub1_Sub1_Sub6.anIntArray172[this.anInt980];
				@Pc(63) int local63 = Class5_Sub1_Sub1_Sub6.anIntArray173[this.anInt980];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(89) int local89 = local43 * local63 - local33 * local58 >> 16;
				@Pc(91) int local91 = local73;
				@Pc(101) int local101 = local38 * local53 - local89 * local48 >> 16;
				@Pc(111) int local111 = local38 * local48 + local89 * local53 >> 16;
				if (local111 >= 50) {
					this.anInt889 = Class5_Sub1_Sub2_Sub4.anInt635 + (local91 << 9) / local111;
					this.anInt890 = Class5_Sub1_Sub2_Sub4.anInt636 + (local101 << 9) / local111;
				} else {
					this.anInt889 = -1;
					this.anInt890 = -1;
				}
			} else {
				this.anInt889 = -1;
				this.anInt890 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("17792, " + arg0 + ", " + -830 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!KFUEEJVZ;II)V")
	private void method713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (this.anInt881 < 400) {
				if (arg2.anIntArray61 != null) {
					arg2 = arg2.method155((byte) 9);
				}
				if (arg2 != null && arg2.aBoolean101) {
					@Pc(23) String local23 = arg2.aString6;
					@Pc(27) boolean local27 = false;
					if (arg2.anInt351 != 0) {
						local23 = local23 + method639(aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt517, arg2.anInt351) + " (level-" + arg2.anInt351 + ")";
					}
					if (this.anInt869 == 1) {
						this.aStringArray13[this.anInt881] = "Use " + this.aString18 + " with @yel@" + local23;
						this.anIntArray274[this.anInt881] = 754;
						this.anIntArray275[this.anInt881] = arg0;
						this.anIntArray272[this.anInt881] = arg1;
						this.anIntArray273[this.anInt881] = arg4;
						this.anInt881++;
					} else if (this.anInt882 != 1) {
						@Pc(165) int local165;
						if (arg2.aStringArray4 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg2.aStringArray4[local165] != null && !arg2.aStringArray4[local165].equalsIgnoreCase("attack")) {
									this.aStringArray13[this.anInt881] = arg2.aStringArray4[local165] + " @yel@" + local23;
									if (local165 == 0) {
										this.anIntArray274[this.anInt881] = 982;
									}
									if (local165 == 1) {
										this.anIntArray274[this.anInt881] = 708;
									}
									if (local165 == 2) {
										this.anIntArray274[this.anInt881] = 372;
									}
									if (local165 == 3) {
										this.anIntArray274[this.anInt881] = 168;
									}
									if (local165 == 4) {
										this.anIntArray274[this.anInt881] = 157;
									}
									this.anIntArray275[this.anInt881] = arg0;
									this.anIntArray272[this.anInt881] = arg1;
									this.anIntArray273[this.anInt881] = arg4;
									this.anInt881++;
								}
							}
						}
						if (arg2.aStringArray4 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg2.aStringArray4[local165] != null && arg2.aStringArray4[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg2.anInt351 > aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt517) {
										local289 = 2000;
									}
									this.aStringArray13[this.anInt881] = arg2.aStringArray4[local165] + " @yel@" + local23;
									if (local165 == 0) {
										this.anIntArray274[this.anInt881] = local289 + 982;
									}
									if (local165 == 1) {
										this.anIntArray274[this.anInt881] = local289 + 708;
									}
									if (local165 == 2) {
										this.anIntArray274[this.anInt881] = local289 + 372;
									}
									if (local165 == 3) {
										this.anIntArray274[this.anInt881] = local289 + 168;
									}
									if (local165 == 4) {
										this.anIntArray274[this.anInt881] = local289 + 157;
									}
									this.anIntArray275[this.anInt881] = arg0;
									this.anIntArray272[this.anInt881] = arg1;
									this.anIntArray273[this.anInt881] = arg4;
									this.anInt881++;
								}
							}
						}
						this.aStringArray13[this.anInt881] = "Examine @yel@" + local23;
						this.anIntArray274[this.anInt881] = 1958;
						this.anIntArray275[this.anInt881] = arg0;
						this.anIntArray272[this.anInt881] = arg1;
						this.anIntArray273[this.anInt881] = arg4;
						this.anInt881++;
					} else if ((this.anInt884 & 0x2) == 2) {
						this.aStringArray13[this.anInt881] = this.aString19 + " @yel@" + local23;
						this.anIntArray274[this.anInt881] = 31;
						this.anIntArray275[this.anInt881] = arg0;
						this.anIntArray272[this.anInt881] = arg1;
						this.anIntArray273[this.anInt881] = arg4;
						this.anInt881++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("4335, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method714(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (super.anInt820 == 1) {
				if (super.anInt821 >= 539 && super.anInt821 <= 573 && super.anInt822 >= 169 && super.anInt822 < 205 && this.anIntArray255[0] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 0;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 569 && super.anInt821 <= 599 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray255[1] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 1;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 597 && super.anInt821 <= 627 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray255[2] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 2;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 625 && super.anInt821 <= 669 && super.anInt822 >= 168 && super.anInt822 < 203 && this.anIntArray255[3] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 3;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 666 && super.anInt821 <= 696 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray255[4] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 4;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 694 && super.anInt821 <= 724 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray255[5] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 5;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 722 && super.anInt821 <= 756 && super.anInt822 >= 169 && super.anInt822 < 205 && this.anIntArray255[6] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 6;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 540 && super.anInt821 <= 574 && super.anInt822 >= 466 && super.anInt822 < 502 && this.anIntArray255[7] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 7;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 572 && super.anInt821 <= 602 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray255[8] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 8;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 599 && super.anInt821 <= 629 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray255[9] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 9;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 627 && super.anInt821 <= 671 && super.anInt822 >= 467 && super.anInt822 < 502 && this.anIntArray255[10] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 10;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 669 && super.anInt821 <= 699 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray255[11] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 11;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 696 && super.anInt821 <= 726 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray255[12] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 12;
					this.aBoolean241 = true;
				}
				if (super.anInt821 >= 724 && super.anInt821 <= 758 && super.anInt822 >= 466 && super.anInt822 < 502 && this.anIntArray255[13] != -1) {
					this.aBoolean264 = true;
					this.anInt967 = 13;
					this.aBoolean241 = true;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("95216, " + arg0 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method715() {
		try {
			if (this.anInt998 == 0 && super.anInt820 == 1) {
				@Pc(20) int local20 = super.anInt821 - 25 - 550;
				@Pc(27) int local27 = super.anInt822 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt933 + this.anInt886 & 0x7FF;
					@Pc(51) int local51 = Class5_Sub1_Sub2_Sub4.anIntArray120[local47];
					@Pc(55) int local55 = Class5_Sub1_Sub2_Sub4.anIntArray121[local47];
					@Pc(64) int local64 = local51 * (this.anInt937 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt937 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501 + local83 >> 7;
					@Pc(107) int local107 = aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502 - local93 >> 7;
					@Pc(129) boolean local129 = this.method638(local107, this.anInt876, 0, 0, 1, 0, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray104[0], 0, true, local100, aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray105[0], 0);
					if (local129) {
						this.aClass5_Sub1_Sub4_8.method427(local20);
						this.aClass5_Sub1_Sub4_8.method427(local27);
						this.aClass5_Sub1_Sub4_8.method428(this.anInt933);
						this.aClass5_Sub1_Sub4_8.method427(57);
						this.aClass5_Sub1_Sub4_8.method427(this.anInt886);
						this.aClass5_Sub1_Sub4_8.method427(this.anInt937);
						this.aClass5_Sub1_Sub4_8.method427(89);
						this.aClass5_Sub1_Sub4_8.method428(aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt501);
						this.aClass5_Sub1_Sub4_8.method428(aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt502);
						this.aClass5_Sub1_Sub4_8.method427(this.anInt1012);
						this.aClass5_Sub1_Sub4_8.method427(63);
					}
				}
				anInt919++;
				if (anInt919 > 90) {
					anInt919 = 0;
					this.aClass5_Sub1_Sub4_8.method426(45);
					return;
				}
			}
		} catch (@Pc(197) RuntimeException local197) {
			signlink.reporterror("66635, " + -44096 + ", " + local197.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method579() {
		try {
			if (this.aBoolean252 || this.aBoolean255 || this.aBoolean244) {
				this.method610();
			} else {
				anInt834++;
				if (this.aBoolean245) {
					this.method603(this.aByte34);
				} else {
					this.method608(false);
				}
				this.anInt905 = 0;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("55917, " + 5 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2 >= 1 && arg4 >= 1 && arg2 <= 102 && arg4 <= 102) {
				if (aBoolean258 && arg1 != this.anInt948) {
					return;
				}
				@Pc(29) int local29 = 0;
				if (arg3 == 0) {
					local29 = this.aClass48_1.method500(arg1, arg2, arg4);
				}
				if (arg3 == 1) {
					local29 = this.aClass48_1.method501(arg1, arg4, arg2);
				}
				if (arg3 == 2) {
					local29 = this.aClass48_1.method502(arg1, arg2, arg4);
				}
				if (arg3 == 3) {
					local29 = this.aClass48_1.method503(arg1, arg2, arg4);
				}
				@Pc(85) int local85;
				if (local29 != 0) {
					local85 = this.aClass48_1.method504(arg1, arg2, arg4, local29);
					@Pc(91) int local91 = local29 >> 14 & 0x7FFF;
					@Pc(95) int local95 = local85 & 0x1F;
					@Pc(99) int local99 = local85 >> 6;
					@Pc(111) Class8 local111;
					if (arg3 == 0) {
						this.aClass48_1.method491(arg4, 564, arg1, arg2);
						local111 = Class8.method40(local91);
						if (local111.aBoolean37) {
							this.aClass16Array1[arg1].method111(arg2, arg4, local111.aBoolean40, local99, local95);
						}
					}
					if (arg3 == 1) {
						this.aClass48_1.method492(arg1, arg2, arg4);
					}
					if (arg3 == 2) {
						this.aClass48_1.method493(arg1, arg4, arg2);
						local111 = Class8.method40(local91);
						if (arg2 + local111.anInt45 > 103 || arg4 + local111.anInt45 > 103 || arg2 + local111.anInt53 > 103 || arg4 + local111.anInt53 > 103) {
							return;
						}
						if (local111.aBoolean37) {
							this.aClass16Array1[arg1].method112(arg4, local111.anInt53, local99, arg2, local111.aBoolean40, local111.anInt45);
						}
					}
					if (arg3 == 3) {
						this.aClass48_1.method494(arg4, (byte) 8, arg1, arg2);
						local111 = Class8.method40(local91);
						if (local111.aBoolean37 && local111.aBoolean35) {
							this.aClass16Array1[arg1].method114(arg2, arg4);
						}
					}
				}
				if (arg6 >= 0) {
					local85 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg2][arg4] & 0x2) == 2) {
						local85 = arg1 + 1;
					}
					Class46.method417(arg1, arg2, arg5, arg6, local85, this.aClass48_1, this.aClass16Array1[arg1], arg0, this.anIntArrayArrayArray7, arg4);
					return;
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("38289, " + arg0 + ", " + arg1 + ", " + -39748 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!XGRGMPUQ;I)V")
	private void method717(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			@Pc(6) int local6 = arg1.method448(8);
			@Pc(21) int local21;
			if (local6 < this.anInt1025) {
				for (local21 = local6; local21 < this.anInt1025; local21++) {
					this.anIntArray256[this.anInt1017++] = this.anIntArray264[local21];
				}
			}
			if (local6 > this.anInt1025) {
				signlink.reporterror(this.aString24 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt1025 = 0;
			for (local21 = 0; local21 < local6; local21++) {
				@Pc(73) int local73 = this.anIntArray264[local21];
				@Pc(78) Class5_Sub1_Sub1_Sub3_Sub2 local78 = this.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local73];
				@Pc(83) int local83 = arg1.method448(1);
				if (local83 == 0) {
					this.anIntArray264[this.anInt1025++] = local73;
					local78.anInt461 = anInt1022;
				} else {
					@Pc(106) int local106 = arg1.method448(2);
					if (local106 == 0) {
						this.anIntArray264[this.anInt1025++] = local73;
						local78.anInt461 = anInt1022;
						this.anIntArray265[this.anInt1026++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray264[this.anInt1025++] = local73;
							local78.anInt461 = anInt1022;
							local157 = arg1.method448(3);
							local78.method237(local157, false);
							local167 = arg1.method448(1);
							if (local167 == 1) {
								this.anIntArray265[this.anInt1026++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray264[this.anInt1025++] = local73;
							local78.anInt461 = anInt1022;
							local157 = arg1.method448(3);
							local78.method237(local157, true);
							local167 = arg1.method448(3);
							local78.method237(local167, true);
							@Pc(225) int local225 = arg1.method448(1);
							if (local225 == 1) {
								this.anIntArray265[this.anInt1026++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray256[this.anInt1017++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("86404, " + arg0 + ", " + arg1 + ", " + 504 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)Ljava/lang/String;")
	private String method718() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("62301, " + 10 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
	private boolean method719(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt845; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray11[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass5_Sub1_Sub1_Sub3_Sub2_1.aString10);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("99051, " + 20 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) int local9 = 0;
			for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
				if (this.aStringArray9[local11] != null) {
					@Pc(23) int local23 = this.anIntArray219[local11];
					@Pc(34) int local34 = this.anInt1027 + 70 + 4 - local9 * 14;
					if (local34 < -20) {
						break;
					}
					@Pc(42) String local42 = this.aStringArray8[local11];
					if (local42 != null && local42.startsWith("@cr1@")) {
						local42 = local42.substring(5);
					}
					if (local42 != null && local42.startsWith("@cr2@")) {
						local42 = local42.substring(5);
					}
					if (local23 == 0) {
						local9++;
					}
					if ((local23 == 1 || local23 == 2) && (local23 == 1 || this.anInt833 == 0 || this.anInt833 == 1 && this.method719(local42))) {
						if (arg0 > local34 - 14 && arg0 <= local34 && !local42.equals(aClass5_Sub1_Sub1_Sub3_Sub2_1.aString10)) {
							if (this.anInt1029 >= 1) {
								this.aStringArray13[this.anInt881] = "Report abuse @whi@" + local42;
								this.anIntArray274[this.anInt881] = 726;
								this.anInt881++;
							}
							this.aStringArray13[this.anInt881] = "Add ignore @whi@" + local42;
							this.anIntArray274[this.anInt881] = 495;
							this.anInt881++;
							this.aStringArray13[this.anInt881] = "Add friend @whi@" + local42;
							this.anIntArray274[this.anInt881] = 678;
							this.anInt881++;
						}
						local9++;
					}
					if ((local23 == 3 || local23 == 7) && this.anInt837 == 0 && (local23 == 7 || this.anInt950 == 0 || this.anInt950 == 1 && this.method719(local42))) {
						if (arg0 > local34 - 14 && arg0 <= local34) {
							if (this.anInt1029 >= 1) {
								this.aStringArray13[this.anInt881] = "Report abuse @whi@" + local42;
								this.anIntArray274[this.anInt881] = 726;
								this.anInt881++;
							}
							this.aStringArray13[this.anInt881] = "Add ignore @whi@" + local42;
							this.anIntArray274[this.anInt881] = 495;
							this.anInt881++;
							this.aStringArray13[this.anInt881] = "Add friend @whi@" + local42;
							this.anIntArray274[this.anInt881] = 678;
							this.anInt881++;
						}
						local9++;
					}
					if (local23 == 4 && (this.anInt908 == 0 || this.anInt908 == 1 && this.method719(local42))) {
						if (arg0 > local34 - 14 && arg0 <= local34) {
							this.aStringArray13[this.anInt881] = "Accept trade @whi@" + local42;
							this.anIntArray274[this.anInt881] = 178;
							this.anInt881++;
						}
						local9++;
					}
					if ((local23 == 5 || local23 == 6) && this.anInt837 == 0 && this.anInt950 < 2) {
						local9++;
					}
					if (local23 == 8 && (this.anInt908 == 0 || this.anInt908 == 1 && this.method719(local42))) {
						if (arg0 > local34 - 14 && arg0 <= local34) {
							this.aStringArray13[this.anInt881] = "Accept challenge @whi@" + local42;
							this.anIntArray274[this.anInt881] = 830;
							this.anInt881++;
						}
						local9++;
					}
				}
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("92426, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method721() {
		try {
			this.aBoolean254 = false;
			while (this.aBoolean250) {
				this.aBoolean254 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass5_Sub1_Sub2_Sub3_19 = null;
			this.aClass5_Sub1_Sub2_Sub3_20 = null;
			this.aClass5_Sub1_Sub2_Sub3Array4 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.anIntArray220 = null;
			this.anIntArray221 = null;
			this.aClass5_Sub1_Sub2_Sub2_11 = null;
			this.aClass5_Sub1_Sub2_Sub2_12 = null;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("85735, " + -601 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
