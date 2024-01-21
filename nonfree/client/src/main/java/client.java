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

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private static int anInt835;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private static int anInt854;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Z")
	private static boolean aBoolean196;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private static int anInt867;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private static int anInt873;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private static int anInt906;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!CQCDOTXO;")
	public static Class1_Sub2_Sub2_Sub1_Sub1 aClass1_Sub2_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private static int anInt908;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private static int anInt916;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private static boolean aBoolean204;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
	private static boolean aBoolean206;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private static int anInt935;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private static int anInt948;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	public static int anInt973;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Z")
	private static boolean aBoolean215;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private static int anInt976;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Z")
	private static boolean aBoolean219;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private static int anInt995;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private static int anInt1002;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private static int anInt1003;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private static int anInt1005;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private static int anInt1009;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Z")
	private static boolean aBoolean226;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private static int anInt1039;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private static int anInt1044;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	public static int anInt1045;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
	public static final int[] anIntArray239 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private static int anInt918 = 437;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private static int anInt920 = 8;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private static int anInt972 = 10;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Z")
	private static boolean aBoolean214 = true;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Ljava/lang/String;")
	private static String aString24 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	public static int[] anIntArray262 = new int[32];

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private static int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!UWINSVPX;")
	private Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!UVSYUCDF;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_3;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_4;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_5;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_6;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_4;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_5;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!HFSXIPFN;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_7;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_8;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_9;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_10;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_11;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_12;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_13;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_14;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_15;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!XFJQTFBV;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1[] aClass1_Sub2_Sub1_Sub1Array4;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_7;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_8;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_9;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_10;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_11;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_12;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_13;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_14;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_15;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_18;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_19;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_20;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_16;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_17;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_18;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_19;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_20;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_21;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_22;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_23;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_24;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_7;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_8;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_25;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_26;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!MEXICRKY;")
	private Class26 aClass26_27;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!OIFRHCSO;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_14;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_15;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_16;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!NXFIIFAD;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!XZMPLIVN;")
	private Class1_Sub2_Sub1_Sub4 aClass1_Sub2_Sub1_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!XZMPLIVN;")
	private Class1_Sub2_Sub1_Sub4 aClass1_Sub2_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!XZMPLIVN;")
	private Class1_Sub2_Sub1_Sub4 aClass1_Sub2_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "Lclient!XZMPLIVN;")
	private Class1_Sub2_Sub1_Sub4 aClass1_Sub2_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "ok", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "qk", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "rk", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray212 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub1_Sub2Array4 = new Class1_Sub2_Sub1_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private volatile boolean aBoolean188 = false;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray213 = new int[5];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray214 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "B")
	private byte aByte38 = -48;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub1_Sub2Array5 = new Class1_Sub2_Sub1_Sub2[8];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt842 = 2;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!IJOSTBQT;")
	private Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[[[Lclient!WOVRPCGT;")
	private Class42[][][] aClass42ArrayArrayArray1 = new Class42[4][104][104];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1[] aClass1_Sub2_Sub1_Sub1Array2 = new Class1_Sub2_Sub1_Sub1[13];

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "B")
	private byte aByte39 = 114;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt853 = -430;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "B")
	private byte aByte40 = -60;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1[] aClass1_Sub2_Sub1_Sub1Array3 = new Class1_Sub2_Sub1_Sub1[100];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub1_Sub2Array6 = new Class1_Sub2_Sub1_Sub2[32];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt858 = 969;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray221 = new int[100];

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!WOVRPCGT;")
	private Class42 aClass42_10 = new Class42(-270);

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	private int[] anIntArray222 = new int[5];

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[I")
	private int[] anIntArray223 = new int[Class50.anInt804];

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt862 = 10685;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
	private int[] anIntArray224 = new int[7];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt864 = 50;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray225 = new int[this.anInt864];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[I")
	private int[] anIntArray226 = new int[this.anInt864];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
	private int[] anIntArray227 = new int[this.anInt864];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
	private int[] anIntArray228 = new int[this.anInt864];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
	private int[] anIntArray229 = new int[this.anInt864];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[I")
	private int[] anIntArray230 = new int[this.anInt864];

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "[I")
	private int[] anIntArray231 = new int[this.anInt864];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[this.anInt864];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt865 = 186;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray232 = new int[5];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt868 = 5063219;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt870 = -582;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt871 = 2301979;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
	private int[] anIntArray233 = new int[151];

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray234 = new int[5];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt878 = 2;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt884 = -926;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt885 = 21302;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt889 = 7759444;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private final int[] anIntArray240 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt890 = 78;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt891 = 1;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt896 = -1;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt897 = -1;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
	private int[] anIntArray241 = new int[151];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Lclient!MNKDCXXG;")
	private Class1_Sub2_Sub3 aClass1_Sub2_Sub3_6 = Class1_Sub2_Sub3.method295();

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt902 = -1;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt903 = 3353893;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub1_Sub2Array7 = new Class1_Sub2_Sub1_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt904 = 503;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub1_Sub2Array8 = new Class1_Sub2_Sub1_Sub2[20];

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt907 = -494;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "[I")
	private int[] anIntArray242 = new int[500];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
	private int[] anIntArray243 = new int[500];

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private int[] anIntArray244 = new int[500];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
	private int[] anIntArray245 = new int[500];

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt909 = 40071;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "re", descriptor = "B")
	private byte aByte41 = 5;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt913 = 3;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	private int[] anIntArray246 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub1_Sub2Array9 = new Class1_Sub2_Sub1_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt921 = 2048;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt922 = 2047;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[Lclient!CQCDOTXO;")
	private Class1_Sub2_Sub2_Sub1_Sub1[] aClass1_Sub2_Sub2_Sub1_Sub1Array1 = new Class1_Sub2_Sub2_Sub1_Sub1[this.anInt921];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[I")
	private int[] anIntArray247 = new int[this.anInt921];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[I")
	private int[] anIntArray248 = new int[this.anInt921];

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[Lclient!MNKDCXXG;")
	private Class1_Sub2_Sub3[] aClass1_Sub2_Sub3Array1 = new Class1_Sub2_Sub3[this.anInt921];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt926 = 586;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[I")
	private int[] anIntArray249 = new int[50];

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt931 = -1;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt932 = -1;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray250 = new int[33];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "B")
	private byte aByte42 = -82;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt936 = -1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "B")
	private byte aByte43 = -47;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt943 = -1;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
	private int[] anIntArray251 = new int[50];

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt944 = -617;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt945 = -1;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray252 = new int[Class50.anInt804];

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt956 = -1;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "B")
	private byte aByte44 = 114;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[Lclient!QEHNWGKD;")
	private Class1_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub1_Sub2Array10 = new Class1_Sub2_Sub1_Sub2[32];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "B")
	private byte aByte45 = 1;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt957 = -1;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt964 = -16571;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt965 = -1;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt966 = -1;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt969 = 813;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray255 = new int[33];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt971 = 802;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!MNKDCXXG;")
	private Class1_Sub2_Sub3 aClass1_Sub2_Sub3_7 = new Class1_Sub2_Sub3(new byte[5000], -670);

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[Lclient!YQBVAFEO;")
	private Class1_Sub2_Sub2_Sub1_Sub2[] aClass1_Sub2_Sub2_Sub1_Sub2Array1 = new Class1_Sub2_Sub2_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray256 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "B")
	private byte aByte46 = 5;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray257 = new int[256];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray258 = new int[200];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private volatile boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray259 = new int[1000];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray260 = new int[1000];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
	private volatile boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray261 = new int[9];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!WOVRPCGT;")
	private Class42 aClass42_11 = new Class42(-270);

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt994 = 1;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!WOVRPCGT;")
	private Class42 aClass42_12 = new Class42(-270);

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!MNKDCXXG;")
	private Class1_Sub2_Sub3 aClass1_Sub2_Sub3_8 = Class1_Sub2_Sub3.method295();

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
	private int[] anIntArray263 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!MNKDCXXG;")
	private Class1_Sub2_Sub3 aClass1_Sub2_Sub3_9 = Class1_Sub2_Sub3.method295();

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[Lclient!WSLQJCTU;")
	public Class43[] aClass43Array1 = new Class43[5];

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1007 = 2;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1008 = -1;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray267 = new int[Class50.anInt804];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1018 = 6;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1019 = -1;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
	public int[] anIntArray268 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray269 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1020 = -1;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[Lclient!BVXAXAEI;")
	private Class1_Sub2_Sub1_Sub1[] aClass1_Sub2_Sub1_Sub1Array5 = new Class1_Sub2_Sub1_Sub1[2];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1023 = -16571;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1029 = 1;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1030 = 128;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1034 = 649;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1035 = 503;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1036 = -46103;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
	private int[] anIntArray271 = new int[1000];

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "B")
	private byte aByte47 = 9;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "B")
	private byte aByte48 = -63;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "[I")
	private int[] anIntArray272 = new int[100];

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1050 = 27382;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private final int anInt1051 = 100;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
	private int[] anIntArray273 = new int[100];

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "[I")
	private int[] anIntArray274 = new int[4000];

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "[I")
	private int[] anIntArray275 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1052 = -953;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1053 = -46257;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "[Lclient!EKHWFCYP;")
	private Class10[] aClass10Array1 = new Class10[4];

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
	private int anInt1056 = -1;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "nk", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "sk", descriptor = "[I")
	private int[] anIntArray276 = new int[5];

	static {
		@Pc(351) int local351 = 2;
		@Pc(353) int local353;
		for (local353 = 0; local353 < 32; local353++) {
			anIntArray262[local353] = local351 - 1;
			local351 += local351;
		}
		anIntArray270 = new int[99];
		local351 = 0;
		for (local353 = 0; local353 < 99; local353++) {
			@Pc(380) int local380 = local353 + 1;
			@Pc(393) int local393 = (int) ((double) local380 + Math.pow(2.0D, (double) local380 / 7.0D) * 300.0D);
			local351 += local393;
			anIntArray270[local353] = local351 / 4;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method618(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("46397, " + arg0 + ", " + -419 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)Ljava/lang/String;")
	private static String method687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) int local11 = arg0 - arg1;
			if (local11 < -9) {
				return "@red@";
			} else if (local11 < -6) {
				return "@or3@";
			} else if (local11 < -3) {
				return "@or2@";
			} else if (local11 < 0) {
				return "@or1@";
			} else if (local11 > 9) {
				return "@gre@";
			} else if (local11 > 6) {
				return "@gr3@";
			} else if (local11 > 3) {
				return "@gr2@";
			} else if (local11 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("92832, " + arg0 + ", " + false + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method696(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("65827, " + arg0 + ", " + 113 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private static void method718(@OriginalArg(0) int arg0) {
		try {
			Class16.aBoolean52 = false;
			Class1_Sub2_Sub1_Sub3.aBoolean136 = false;
			aBoolean215 = false;
			@Pc(9) int local9 = 5 / arg0;
			Class46.aBoolean163 = false;
			Class27.aBoolean95 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("83165, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private static void method726() {
		try {
			Class16.aBoolean52 = true;
			Class1_Sub2_Sub1_Sub3.aBoolean136 = true;
			aBoolean215 = true;
			Class46.aBoolean163 = true;
			Class27.aBoolean95 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("58737, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 368);
			if (arg0.length == 5) {
				anInt972 = Integer.parseInt(arg0[0]);
				anInt973 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method726();
				} else if (arg0[2].equals("highmem")) {
					method718(anInt918);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean214 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean214 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1063 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
				if (this.aStringArray11[local6] != null) {
					@Pc(18) int local18 = this.anIntArray221[local6];
					@Pc(29) int local29 = this.anInt910 + 70 + 4 - local1 * 14;
					if (local29 < -20) {
						break;
					}
					@Pc(37) String local37 = this.aStringArray10[local6];
					if (local37 != null && local37.startsWith("@cr1@")) {
						local37 = local37.substring(5);
					}
					if (local37 != null && local37.startsWith("@cr2@")) {
						local37 = local37.substring(5);
					}
					if (local18 == 0) {
						local1++;
					}
					if ((local18 == 1 || local18 == 2) && (local18 == 1 || this.anInt869 == 0 || this.anInt869 == 1 && this.method592(426, local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29 && !local37.equals(aClass1_Sub2_Sub2_Sub1_Sub1_1.aString3)) {
							if (this.anInt856 >= 1) {
								this.aStringArray8[this.anInt1041] = "Report abuse @whi@" + local37;
								this.anIntArray244[this.anInt1041] = 989;
								this.anInt1041++;
							}
							this.aStringArray8[this.anInt1041] = "Add ignore @whi@" + local37;
							this.anIntArray244[this.anInt1041] = 405;
							this.anInt1041++;
							this.aStringArray8[this.anInt1041] = "Add friend @whi@" + local37;
							this.anIntArray244[this.anInt1041] = 9;
							this.anInt1041++;
						}
						local1++;
					}
					if ((local18 == 3 || local18 == 7) && this.anInt855 == 0 && (local18 == 7 || this.anInt1042 == 0 || this.anInt1042 == 1 && this.method592(426, local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							if (this.anInt856 >= 1) {
								this.aStringArray8[this.anInt1041] = "Report abuse @whi@" + local37;
								this.anIntArray244[this.anInt1041] = 989;
								this.anInt1041++;
							}
							this.aStringArray8[this.anInt1041] = "Add ignore @whi@" + local37;
							this.anIntArray244[this.anInt1041] = 405;
							this.anInt1041++;
							this.aStringArray8[this.anInt1041] = "Add friend @whi@" + local37;
							this.anIntArray244[this.anInt1041] = 9;
							this.anInt1041++;
						}
						local1++;
					}
					if (local18 == 4 && (this.anInt852 == 0 || this.anInt852 == 1 && this.method592(426, local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray8[this.anInt1041] = "Accept trade @whi@" + local37;
							this.anIntArray244[this.anInt1041] = 386;
							this.anInt1041++;
						}
						local1++;
					}
					if ((local18 == 5 || local18 == 6) && this.anInt855 == 0 && this.anInt1042 < 2) {
						local1++;
					}
					if (local18 == 8 && (this.anInt852 == 0 || this.anInt852 == 1 && this.method592(426, local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray8[this.anInt1041] = "Accept challenge @whi@" + local37;
							this.anIntArray244[this.anInt1041] = 679;
							this.anInt1041++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("12785, " + arg0 + ", " + arg1 + ", " + false + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!IJOSTBQT;II)V")
	private void method590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class18 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4.anInt348 == 0 && arg4.anIntArray57 != null && !arg4.aBoolean63 && (arg5 >= arg3 && arg2 >= arg0 && arg5 <= arg3 + arg4.anInt333 && arg2 <= arg0 + arg4.anInt349)) {
				@Pc(34) int local34 = arg4.anIntArray57.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg4.anIntArray53[local36] + arg3;
					@Pc(54) int local54 = arg4.anIntArray51[local36] + arg0 - arg6;
					@Pc(60) Class18 local60 = Class18.method187(arg4.anIntArray57[local36]);
					@Pc(65) int local65 = local45 + local60.anInt342;
					@Pc(70) int local70 = local54 + local60.anInt357;
					if ((local60.anInt331 >= 0 || local60.anInt332 != 0) && arg5 >= local65 && arg2 >= local70 && arg5 < local65 + local60.anInt333 && arg2 < local70 + local60.anInt349) {
						if (local60.anInt331 >= 0) {
							this.anInt919 = local60.anInt331;
						} else {
							this.anInt919 = local60.anInt340;
						}
					}
					if (local60.anInt348 == 8 && arg5 >= local65 && arg2 >= local70 && arg5 < local65 + local60.anInt333 && arg2 < local70 + local60.anInt349) {
						this.anInt946 = local60.anInt340;
					}
					if (local60.anInt348 == 0) {
						this.method590(local70, arg1, arg2, local65, local60, arg5, local60.anInt321);
						if (local60.anInt336 > local60.anInt349) {
							this.method679(local60.anInt336, arg2, local60.anInt349, arg1, local70, local60, arg5, local65 + local60.anInt333, this.anInt886);
						}
					} else {
						if (local60.anInt354 == 1 && arg5 >= local65 && arg2 >= local70 && arg5 < local65 + local60.anInt333 && arg2 < local70 + local60.anInt349) {
							@Pc(195) boolean local195 = false;
							if (local60.anInt343 != 0) {
								local195 = this.method617(local60);
							}
							if (!local195) {
								this.aStringArray8[this.anInt1041] = local60.aString7;
								this.anIntArray244[this.anInt1041] = 781;
								this.anIntArray243[this.anInt1041] = local60.anInt340;
								this.anInt1041++;
							}
						}
						if (local60.anInt354 == 2 && this.anInt977 == 0 && arg5 >= local65 && arg2 >= local70 && arg5 < local65 + local60.anInt333 && arg2 < local70 + local60.anInt349) {
							@Pc(259) String local259 = local60.aString10;
							if (local259.indexOf(" ") != -1) {
								local259 = local259.substring(0, local259.indexOf(" "));
							}
							this.aStringArray8[this.anInt1041] = local259 + " @gre@" + local60.aString9;
							this.anIntArray244[this.anInt1041] = 758;
							this.anIntArray243[this.anInt1041] = local60.anInt340;
							this.anInt1041++;
						}
						if (local60.anInt354 == 3 && arg5 >= local65 && arg2 >= local70 && arg5 < local65 + local60.anInt333 && arg2 < local70 + local60.anInt349) {
							this.aStringArray8[this.anInt1041] = "Close";
							if (arg1 == 3) {
								this.anIntArray244[this.anInt1041] = 720;
							} else {
								this.anIntArray244[this.anInt1041] = 252;
							}
							this.anIntArray243[this.anInt1041] = local60.anInt340;
							this.anInt1041++;
						}
						if (local60.anInt354 == 4 && arg5 >= local65 && arg2 >= local70 && arg5 < local65 + local60.anInt333 && arg2 < local70 + local60.anInt349) {
							this.aStringArray8[this.anInt1041] = local60.aString7;
							this.anIntArray244[this.anInt1041] = 392;
							this.anIntArray243[this.anInt1041] = local60.anInt340;
							this.anInt1041++;
						}
						if (local60.anInt354 == 5 && arg5 >= local65 && arg2 >= local70 && arg5 < local65 + local60.anInt333 && arg2 < local70 + local60.anInt349) {
							this.aStringArray8[this.anInt1041] = local60.aString7;
							this.anIntArray244[this.anInt1041] = 569;
							this.anIntArray243[this.anInt1041] = local60.anInt340;
							this.anInt1041++;
						}
						if (local60.anInt354 == 6 && !this.aBoolean229 && arg5 >= local65 && arg2 >= local70 && arg5 < local65 + local60.anInt333 && arg2 < local70 + local60.anInt349) {
							this.aStringArray8[this.anInt1041] = local60.aString7;
							this.anIntArray244[this.anInt1041] = 198;
							this.anIntArray243[this.anInt1041] = local60.anInt340;
							this.anInt1041++;
						}
						if (local60.anInt348 == 2) {
							@Pc(518) int local518 = 0;
							for (@Pc(520) int local520 = 0; local520 < local60.anInt349; local520++) {
								for (@Pc(524) int local524 = 0; local524 < local60.anInt333; local524++) {
									@Pc(535) int local535 = local65 + local524 * (local60.anInt337 + 32);
									@Pc(544) int local544 = local70 + local520 * (local60.anInt344 + 32);
									if (local518 < 20) {
										local535 += local60.anIntArray50[local518];
										local544 += local60.anIntArray58[local518];
									}
									if (arg5 >= local535 && arg2 >= local544 && arg5 < local535 + 32 && arg2 < local544 + 32) {
										this.anInt962 = local518;
										this.anInt963 = local60.anInt340;
										if (local60.anIntArray56[local518] > 0) {
											@Pc(597) Class38 local597 = Class38.method409(local60.anIntArray56[local518] - 1);
											if (this.anInt939 == 1 && local60.aBoolean62) {
												if (local60.anInt340 != this.anInt941 || local518 != this.anInt940) {
													this.aStringArray8[this.anInt1041] = "Use " + this.aString22 + " with @lre@" + local597.aString14;
													this.anIntArray244[this.anInt1041] = 858;
													this.anIntArray245[this.anInt1041] = local597.anInt588;
													this.anIntArray242[this.anInt1041] = local518;
													this.anIntArray243[this.anInt1041] = local60.anInt340;
													this.anInt1041++;
												}
											} else if (this.anInt977 != 1 || !local60.aBoolean62) {
												@Pc(734) int local734;
												if (local60.aBoolean62) {
													for (local734 = 4; local734 >= 3; local734--) {
														if (local597.aStringArray5 != null && local597.aStringArray5[local734] != null) {
															this.aStringArray8[this.anInt1041] = local597.aStringArray5[local734] + " @lre@" + local597.aString14;
															if (local734 == 3) {
																this.anIntArray244[this.anInt1041] = 459;
															}
															if (local734 == 4) {
																this.anIntArray244[this.anInt1041] = 257;
															}
															this.anIntArray245[this.anInt1041] = local597.anInt588;
															this.anIntArray242[this.anInt1041] = local518;
															this.anIntArray243[this.anInt1041] = local60.anInt340;
															this.anInt1041++;
														} else if (local734 == 4) {
															this.aStringArray8[this.anInt1041] = "Drop @lre@" + local597.aString14;
															this.anIntArray244[this.anInt1041] = 257;
															this.anIntArray245[this.anInt1041] = local597.anInt588;
															this.anIntArray242[this.anInt1041] = local518;
															this.anIntArray243[this.anInt1041] = local60.anInt340;
															this.anInt1041++;
														}
													}
												}
												if (local60.aBoolean61) {
													this.aStringArray8[this.anInt1041] = "Use @lre@" + local597.aString14;
													this.anIntArray244[this.anInt1041] = 108;
													this.anIntArray245[this.anInt1041] = local597.anInt588;
													this.anIntArray242[this.anInt1041] = local518;
													this.anIntArray243[this.anInt1041] = local60.anInt340;
													this.anInt1041++;
												}
												if (local60.aBoolean62 && local597.aStringArray5 != null) {
													for (local734 = 2; local734 >= 0; local734--) {
														if (local597.aStringArray5[local734] != null) {
															this.aStringArray8[this.anInt1041] = local597.aStringArray5[local734] + " @lre@" + local597.aString14;
															if (local734 == 0) {
																this.anIntArray244[this.anInt1041] = 524;
															}
															if (local734 == 1) {
																this.anIntArray244[this.anInt1041] = 239;
															}
															if (local734 == 2) {
																this.anIntArray244[this.anInt1041] = 518;
															}
															this.anIntArray245[this.anInt1041] = local597.anInt588;
															this.anIntArray242[this.anInt1041] = local518;
															this.anIntArray243[this.anInt1041] = local60.anInt340;
															this.anInt1041++;
														}
													}
												}
												if (local60.aStringArray1 != null) {
													for (local734 = 4; local734 >= 0; local734--) {
														if (local60.aStringArray1[local734] != null) {
															this.aStringArray8[this.anInt1041] = local60.aStringArray1[local734] + " @lre@" + local597.aString14;
															if (local734 == 0) {
																this.anIntArray244[this.anInt1041] = 627;
															}
															if (local734 == 1) {
																this.anIntArray244[this.anInt1041] = 734;
															}
															if (local734 == 2) {
																this.anIntArray244[this.anInt1041] = 304;
															}
															if (local734 == 3) {
																this.anIntArray244[this.anInt1041] = 974;
															}
															if (local734 == 4) {
																this.anIntArray244[this.anInt1041] = 380;
															}
															this.anIntArray245[this.anInt1041] = local597.anInt588;
															this.anIntArray242[this.anInt1041] = local518;
															this.anIntArray243[this.anInt1041] = local60.anInt340;
															this.anInt1041++;
														}
													}
												}
												this.aStringArray8[this.anInt1041] = "Examine @lre@" + local597.aString14;
												this.anIntArray244[this.anInt1041] = 1194;
												this.anIntArray245[this.anInt1041] = local597.anInt588;
												this.anIntArray242[this.anInt1041] = local518;
												this.anIntArray243[this.anInt1041] = local60.anInt340;
												this.anInt1041++;
											} else if ((this.anInt979 & 0x10) == 16) {
												this.aStringArray8[this.anInt1041] = this.aString23 + " @lre@" + local597.aString14;
												this.anIntArray244[this.anInt1041] = 308;
												this.anIntArray245[this.anInt1041] = local597.anInt588;
												this.anIntArray242[this.anInt1041] = local518;
												this.anIntArray243[this.anInt1041] = local60.anInt340;
												this.anInt1041++;
											}
										}
									}
									local518++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1171) RuntimeException local1171) {
			signlink.reporterror("13453, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/net/Socket;")
	public Socket method591(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method592(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt875; local5++) {
				if (arg1.equalsIgnoreCase(this.aStringArray9[local5])) {
					return true;
				}
			}
			@Pc(25) boolean local25 = false;
			return arg1.equalsIgnoreCase(aClass1_Sub2_Sub2_Sub1_Sub1_1.aString3);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("21792, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method593(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0 && this.anInt937 == 2) {
				for (@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) this.aClass42_10.method487(); local15 != null; local15 = (Class1_Sub1) this.aClass42_10.method489()) {
					if (local15.anInt12 > 0) {
						local15.anInt12--;
					}
					if (local15.anInt12 != 0) {
						if (local15.anInt1 > 0) {
							local15.anInt1--;
						}
						if (local15.anInt1 == 0 && local15.anInt4 >= 1 && local15.anInt5 >= 1 && local15.anInt4 <= 102 && local15.anInt5 <= 102 && (local15.anInt6 < 0 || Class46.method518(local15.anInt6, local15.anInt8, 939))) {
							this.method670(this.anInt944, local15.anInt3, local15.anInt4, local15.anInt2, local15.anInt6, local15.anInt7, local15.anInt8, local15.anInt5);
							local15.anInt1 = -1;
							if (local15.anInt6 == local15.anInt9 && local15.anInt9 == -1) {
								local15.method571();
							} else if (local15.anInt6 == local15.anInt9 && local15.anInt7 == local15.anInt10 && local15.anInt8 == local15.anInt11) {
								local15.method571();
							}
						}
					} else if (local15.anInt9 < 0 || Class46.method518(local15.anInt9, local15.anInt11, 939)) {
						this.method670(this.anInt944, local15.anInt3, local15.anInt4, local15.anInt2, local15.anInt9, local15.anInt10, local15.anInt11, local15.anInt5);
						local15.method571();
					}
				}
				anInt1009++;
				if (anInt1009 > 1691) {
					anInt1009 = 0;
					this.aClass1_Sub2_Sub3_9.method296(121, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(0);
					@Pc(181) int local181 = this.aClass1_Sub2_Sub3_9.anInt474;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub2_Sub3_9.method298(39382);
					}
					this.aClass1_Sub2_Sub3_9.method297(22);
					this.aClass1_Sub2_Sub3_9.method298(7771);
					this.aClass1_Sub2_Sub3_9.method298(31532);
					this.aClass1_Sub2_Sub3_9.method298(3548);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub2_Sub3_9.method297(45);
					}
					this.aClass1_Sub2_Sub3_9.method298(19292);
					this.aClass1_Sub2_Sub3_9.method297((int) (Math.random() * 256.0D));
					this.aClass1_Sub2_Sub3_9.method297(208);
					this.aClass1_Sub2_Sub3_9.method297(18);
					this.aClass1_Sub2_Sub3_9.method306(this.aClass1_Sub2_Sub3_9.anInt474 - local181);
					return;
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("63116, " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method594() {
		try {
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt840 == 0) {
				local15 = super.anInt811 / 2 - 80;
				local22 = super.anInt812 / 2 + 20;
				local22 += 20;
				if (super.anInt820 == 1 && super.anInt821 >= local15 - 75 && super.anInt821 <= local15 + 75 && super.anInt822 >= local22 - 20 && super.anInt822 <= local22 + 20) {
					this.anInt840 = 3;
					this.anInt1057 = 0;
				}
				local15 = super.anInt811 / 2 + 80;
				if (super.anInt820 == 1 && super.anInt821 >= local15 - 75 && super.anInt821 <= local15 + 75 && super.anInt822 >= local22 - 20 && super.anInt822 <= local22 + 20) {
					this.aString25 = "";
					this.aString26 = "Enter your username & password.";
					this.anInt840 = 2;
					this.anInt1057 = 0;
				}
			} else if (this.anInt840 == 2) {
				local15 = super.anInt812 / 2 - 40;
				local15 += 30;
				local15 += 25;
				if (super.anInt820 == 1 && super.anInt822 >= local15 - 15 && super.anInt822 < local15) {
					this.anInt1057 = 0;
				}
				local15 += 15;
				if (super.anInt820 == 1 && super.anInt822 >= local15 - 15 && super.anInt822 < local15) {
					this.anInt1057 = 1;
				}
				local15 += 15;
				local22 = super.anInt811 / 2 - 80;
				@Pc(168) int local168 = super.anInt812 / 2 + 50;
				@Pc(169) int local169 = local168 + 20;
				if (super.anInt820 == 1 && super.anInt821 >= local22 - 75 && super.anInt821 <= local22 + 75 && super.anInt822 >= local169 - 20 && super.anInt822 <= local169 + 20) {
					this.anInt828 = 0;
					this.method646(this.aString20, this.aString21, false);
					if (this.aBoolean217) {
						return;
					}
				}
				local22 = super.anInt811 / 2 + 80;
				if (super.anInt820 == 1 && super.anInt821 >= local22 - 75 && super.anInt821 <= local22 + 75 && super.anInt822 >= local169 - 20 && super.anInt822 <= local169 + 20) {
					this.anInt840 = 0;
					this.aString20 = "";
					this.aString21 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method580();
						if (local259 == -1) {
							return;
						}
						@Pc(264) boolean local264 = false;
						for (@Pc(266) int local266 = 0; local266 < aString24.length(); local266++) {
							if (local259 == aString24.charAt(local266)) {
								local264 = true;
								break;
							}
						}
						if (this.anInt1057 == 0) {
							if (local259 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt1057 = 1;
							}
							if (local264) {
								this.aString20 = this.aString20 + (char) local259;
							}
							if (this.aString20.length() > 12) {
								this.aString20 = this.aString20.substring(0, 12);
							}
						} else if (this.anInt1057 == 1) {
							if (local259 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt1057 = 0;
							}
							if (local264) {
								this.aString21 = this.aString21 + (char) local259;
							}
							if (this.aString21.length() > 20) {
								this.aString21 = this.aString21.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt840 == 3) {
				local15 = super.anInt811 / 2;
				local22 = super.anInt812 / 2 + 50;
				@Pc(423) int local423 = local22 + 20;
				if (super.anInt820 == 1 && super.anInt821 >= local15 - 75 && super.anInt821 <= local15 + 75 && super.anInt822 >= local423 - 20 && super.anInt822 <= local423 + 20) {
					this.anInt840 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("71531, " + 87 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method595() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt980; local3++) {
				if (this.anIntArray251[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray249[local3] != this.anInt1019 || this.anIntArray269[local3] != this.anInt957) {
							@Pc(45) Class1_Sub2_Sub3 local45 = Class3.method84(this.anIntArray249[local3], this.anIntArray269[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt474 / 22) > this.aLong32 + (long) (this.anInt917 / 22)) {
								this.anInt917 = local45.anInt474;
								this.aLong32 = System.currentTimeMillis();
								if (this.method684(this.anInt969, local45.anInt474, local45.aByteArray10)) {
									this.anInt1019 = this.anIntArray249[local3];
									this.anInt957 = this.anIntArray269[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method676()) {
							local12 = true;
						}
					} catch (@Pc(96) Exception local96) {
						if (signlink.reporterror) {
							this.aClass1_Sub2_Sub3_9.method296(60, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method298(this.anIntArray249[local3] & 0x7FFF);
						} else {
							this.aClass1_Sub2_Sub3_9.method296(60, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method298(-1);
						}
					}
					if (local12 && this.anIntArray251[local3] != -5) {
						this.anIntArray251[local3] = -5;
					} else {
						this.anInt980--;
						for (@Pc(141) int local141 = local3; local141 < this.anInt980; local141++) {
							this.anIntArray249[local141] = this.anIntArray249[local141 + 1];
							this.anIntArray269[local141] = this.anIntArray269[local141 + 1];
							this.anIntArray251[local141] = this.anIntArray251[local141 + 1];
						}
						local3--;
					}
				} else {
					@Pc(193) int local193 = this.anIntArray251[local3]--;
				}
			}
			anInt1039++;
			if (anInt1039 > 70) {
				anInt1039 = 0;
				this.aClass1_Sub2_Sub3_9.method296(36, this.anInt1018);
			}
			if (this.anInt1043 > 0) {
				this.anInt1043 -= 20;
				if (this.anInt1043 < 0) {
					this.anInt1043 = 0;
				}
				if (this.anInt1043 == 0 && this.aBoolean234 && !aBoolean215) {
					this.anInt1038 = this.anInt936;
					this.aBoolean228 = true;
					this.aClass22_Sub1_1.method470(2, this.anInt1038);
					return;
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("88995, " + false + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!MNKDCXXG;)V")
	private void method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub3 arg2) {
		try {
			@Pc(6) int local6 = arg2.method318(8);
			@Pc(12) int local12;
			if (local6 < this.anInt923) {
				for (local12 = local6; local12 < this.anInt923; local12++) {
					this.anIntArray271[this.anInt1040++] = this.anIntArray247[local12];
				}
			}
			if (local6 > this.anInt923) {
				signlink.reporterror(this.aString20 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt923 = 0;
			@Pc(59) boolean local59 = false;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(68) int local68 = this.anIntArray247[local12];
				@Pc(73) Class1_Sub2_Sub2_Sub1_Sub1 local73 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local68];
				@Pc(78) int local78 = arg2.method318(1);
				if (local78 == 0) {
					this.anIntArray247[this.anInt923++] = local68;
					local73.anInt769 = anInt1045;
				} else {
					@Pc(101) int local101 = arg2.method318(2);
					if (local101 == 0) {
						this.anIntArray247[this.anInt923++] = local68;
						local73.anInt769 = anInt1045;
						this.anIntArray248[this.anInt924++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray247[this.anInt923++] = local68;
							local73.anInt769 = anInt1045;
							local152 = arg2.method318(3);
							local73.method569(local152, false);
							local162 = arg2.method318(1);
							if (local162 == 1) {
								this.anIntArray248[this.anInt924++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray247[this.anInt923++] = local68;
							local73.anInt769 = anInt1045;
							local152 = arg2.method318(3);
							local73.method569(local152, true);
							local162 = arg2.method318(3);
							local73.method569(local162, true);
							@Pc(220) int local220 = arg2.method318(1);
							if (local220 == 1) {
								this.anIntArray248[this.anInt924++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray271[this.anInt1040++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("88408, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MNKDCXXG;I)V")
	private void method597(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt924; local1++) {
				@Pc(8) int local8 = this.anIntArray248[local1];
				@Pc(13) Class1_Sub2_Sub2_Sub1_Sub1 local13 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local8];
				@Pc(16) int local16 = arg1.method307();
				if ((local16 & 0x1) != 0) {
					local16 += arg1.method307() << 8;
				}
				this.method636(local13, local16, arg1, local8);
			}
			@Pc(43) boolean local43 = false;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("93529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!MNKDCXXG;I)V")
	private void method598(@OriginalArg(1) Class1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt475 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method318(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local12] = new Class1_Sub2_Sub2_Sub1_Sub2();
						}
						@Pc(32) Class1_Sub2_Sub2_Sub1_Sub2 local32 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local12];
						this.anIntArray256[this.anInt975++] = local12;
						local32.anInt769 = anInt1045;
						@Pc(51) int local51 = arg0.method318(1);
						@Pc(56) int local56 = arg0.method318(5);
						if (local56 > 15) {
							local56 -= 32;
						}
						@Pc(65) int local65 = arg0.method318(1);
						if (local65 == 1) {
							this.anIntArray248[this.anInt924++] = local12;
						}
						@Pc(84) int local84 = arg0.method318(5);
						if (local84 > 15) {
							local84 -= 32;
						}
						local32.aClass34_2 = Class34.method362(arg0.method318(13));
						local32.anInt754 = local32.aClass34_2.aByte24;
						local32.anInt772 = local32.aClass34_2.anInt516;
						local32.anInt758 = local32.aClass34_2.anInt509;
						local32.anInt759 = local32.aClass34_2.anInt506;
						local32.anInt760 = local32.aClass34_2.anInt517;
						local32.anInt761 = local32.aClass34_2.anInt518;
						local32.anInt786 = local32.aClass34_2.anInt524;
						local32.method566(aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0] + local56, local51 == 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0] + local84);
						continue;
					}
				}
				arg0.method319();
				return;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("23242, " + false + ", " + arg0 + ", " + arg1 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method599() {
		try {
			this.anInt950 += 0;
			if (aBoolean215 && this.anInt937 == 2 && Class46.anInt697 != this.anInt1001) {
				this.method681(null, this.aByte46, "Loading - please wait.");
				this.anInt937 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt937 == 1) {
				@Pc(35) int local35 = this.method600();
				if (local35 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString20 + " glcfb " + this.aLong33 + "," + local35 + "," + aBoolean215 + "," + this.aClass43Array1[0] + "," + this.aClass22_Sub1_1.method463() + "," + this.anInt1001 + "," + this.anInt1059 + "," + this.anInt1060);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt937 == 2 && this.anInt1001 != this.anInt902) {
				this.anInt902 = this.anInt1001;
				this.method649(this.anInt1001);
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("53989, " + 0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)I")
	private int method600() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray265[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray266[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(46) int local46 = 0; local46 < this.aByteArrayArray6.length; local46++) {
				@Pc(53) byte[] local53 = this.aByteArrayArray5[local46];
				if (local53 != null) {
					@Pc(67) int local67 = (this.anIntArray264[local46] >> 8) * 64 - this.anInt958;
					@Pc(79) int local79 = (this.anIntArray264[local46] & 0xFF) * 64 - this.anInt959;
					if (this.aBoolean186) {
						local67 = 10;
						local79 = 10;
					}
					local39 &= Class46.method514(local79, local53, local67);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean208) {
				return -4;
			} else {
				this.anInt937 = 2;
				Class46.anInt697 = this.anInt1001;
				this.method620();
				this.aClass1_Sub2_Sub3_9.method296(95, this.anInt1018);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("13689, " + false + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method601() {
		try {
			anInt1044++;
			if (anInt1044 > 170) {
				anInt1044 = 0;
				this.aClass1_Sub2_Sub3_9.method296(127, this.anInt1018);
				this.aClass1_Sub2_Sub3_9.method301(0);
			}
			for (@Pc(20) int local20 = 0; local20 < this.anInt975; local20++) {
				@Pc(27) int local27 = this.anIntArray256[local20];
				@Pc(32) Class1_Sub2_Sub2_Sub1_Sub2 local32 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local27];
				if (local32 != null) {
					this.method602(local32.aClass34_2.aByte24, local32);
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("95592, " + -1632 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!FHOAYGUJ;)V")
	private void method602(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub2_Sub1 arg1) {
		try {
			if (arg1.anInt776 < 128 || arg1.anInt777 < 128 || arg1.anInt776 >= 13184 || arg1.anInt777 >= 13184) {
				arg1.anInt764 = -1;
				arg1.anInt780 = -1;
				arg1.anInt751 = 0;
				arg1.anInt752 = 0;
				arg1.anInt776 = arg1.anIntArray204[0] * 128 + arg1.anInt754 * 64;
				arg1.anInt777 = arg1.anIntArray205[0] * 128 + arg1.anInt754 * 64;
				arg1.method565();
			}
			if (arg1 == aClass1_Sub2_Sub2_Sub1_Sub1_1 && (arg1.anInt776 < 1536 || arg1.anInt777 < 1536 || arg1.anInt776 >= 11776 || arg1.anInt777 >= 11776)) {
				arg1.anInt764 = -1;
				arg1.anInt780 = -1;
				arg1.anInt751 = 0;
				arg1.anInt752 = 0;
				arg1.anInt776 = arg1.anIntArray204[0] * 128 + arg1.anInt754 * 64;
				arg1.anInt777 = arg1.anIntArray205[0] * 128 + arg1.anInt754 * 64;
				arg1.method565();
			}
			if (arg1.anInt751 > anInt1045) {
				this.method603(arg1);
			} else if (arg1.anInt752 >= anInt1045) {
				this.method604(arg1);
			} else {
				this.method605(arg1);
			}
			this.method606(arg1);
			this.method607(arg1, this.aBoolean187);
			if (this.anInt1036 != -46103) {
				this.method581();
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("39128, " + arg0 + ", " + -46103 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!FHOAYGUJ;)V")
	private void method603(@OriginalArg(1) Class1_Sub2_Sub2_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt751 - anInt1045;
			@Pc(14) int local14 = arg0.anInt747 * 128 + arg0.anInt754 * 64;
			@Pc(24) int local24 = arg0.anInt749 * 128 + arg0.anInt754 * 64;
			arg0.anInt776 += (local14 - arg0.anInt776) / local4;
			arg0.anInt777 += (local24 - arg0.anInt777) / local4;
			arg0.anInt742 = 0;
			if (arg0.anInt753 == 0) {
				arg0.anInt779 = 1024;
			}
			if (arg0.anInt753 == 1) {
				arg0.anInt779 = 1536;
			}
			if (arg0.anInt753 == 2) {
				arg0.anInt779 = 0;
			}
			if (arg0.anInt753 == 3) {
				arg0.anInt779 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("91323, " + -62 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FHOAYGUJ;I)V")
	private void method604(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt752 == anInt1045 || arg0.anInt764 == -1 || arg0.anInt767 != 0 || arg0.anInt766 + 1 > Class36.aClass36Array1[arg0.anInt764].method371(arg0.anInt765)) {
				@Pc(38) int local38 = arg0.anInt752 - arg0.anInt751;
				@Pc(43) int local43 = anInt1045 - arg0.anInt751;
				@Pc(53) int local53 = arg0.anInt747 * 128 + arg0.anInt754 * 64;
				@Pc(63) int local63 = arg0.anInt749 * 128 + arg0.anInt754 * 64;
				@Pc(73) int local73 = arg0.anInt748 * 128 + arg0.anInt754 * 64;
				@Pc(83) int local83 = arg0.anInt750 * 128 + arg0.anInt754 * 64;
				arg0.anInt776 = (local53 * (local38 - local43) + local73 * local43) / local38;
				arg0.anInt777 = (local63 * (local38 - local43) + local83 * local43) / local38;
			}
			arg0.anInt742 = 0;
			if (arg0.anInt753 == 0) {
				arg0.anInt779 = 1024;
			}
			if (arg0.anInt753 == 1) {
				arg0.anInt779 = 1536;
			}
			if (arg0.anInt753 == 2) {
				arg0.anInt779 = 0;
			}
			if (arg0.anInt753 == 3) {
				arg0.anInt779 = 512;
			}
			arg0.anInt778 = arg0.anInt779;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("87274, " + arg0 + ", " + -907 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FHOAYGUJ;B)V")
	private void method605(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0) {
		try {
			arg0.anInt744 = arg0.anInt786;
			if (arg0.anInt785 == 0) {
				arg0.anInt742 = 0;
			} else {
				if (arg0.anInt764 != -1 && arg0.anInt767 == 0) {
					@Pc(24) Class36 local24 = Class36.aClass36Array1[arg0.anInt764];
					if (arg0.anInt763 > 0 && local24.anInt538 == 0) {
						arg0.anInt742++;
						return;
					}
					if (arg0.anInt763 <= 0 && local24.anInt539 == 0) {
						arg0.anInt742++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt776;
				@Pc(56) int local56 = arg0.anInt777;
				@Pc(75) int local75 = arg0.anIntArray204[arg0.anInt785 - 1] * 128 + arg0.anInt754 * 64;
				@Pc(90) int local90 = arg0.anIntArray205[arg0.anInt785 - 1] * 128 + arg0.anInt754 * 64;
				if (local75 - local53 <= 256 && local75 - local53 >= -256 && local90 - local56 <= 256 && local90 - local56 >= -256) {
					if (local53 < local75) {
						if (local56 < local90) {
							arg0.anInt779 = 1280;
						} else if (local56 > local90) {
							arg0.anInt779 = 1792;
						} else {
							arg0.anInt779 = 1536;
						}
					} else if (local53 > local75) {
						if (local56 < local90) {
							arg0.anInt779 = 768;
						} else if (local56 > local90) {
							arg0.anInt779 = 256;
						} else {
							arg0.anInt779 = 512;
						}
					} else if (local56 < local90) {
						arg0.anInt779 = 1024;
					} else {
						arg0.anInt779 = 0;
					}
					@Pc(184) int local184 = arg0.anInt779 - arg0.anInt778 & 0x7FF;
					if (local184 > 1024) {
						local184 -= 2048;
					}
					@Pc(191) int local191 = arg0.anInt759;
					if (local184 >= -256 && local184 <= 256) {
						local191 = arg0.anInt758;
					} else if (local184 >= 256 && local184 < 768) {
						local191 = arg0.anInt761;
					} else if (local184 >= -768 && local184 <= -256) {
						local191 = arg0.anInt760;
					}
					if (local191 == -1) {
						local191 = arg0.anInt758;
					}
					arg0.anInt744 = local191;
					@Pc(233) int local233 = 4;
					if (arg0.anInt778 != arg0.anInt779 && arg0.anInt762 == -1 && arg0.anInt772 != 0) {
						local233 = 2;
					}
					if (arg0.anInt785 > 2) {
						local233 = 6;
					}
					if (arg0.anInt785 > 3) {
						local233 = 8;
					}
					if (arg0.anInt742 > 0 && arg0.anInt785 > 1) {
						local233 = 8;
						arg0.anInt742--;
					}
					if (arg0.aBooleanArray9[arg0.anInt785 - 1]) {
						local233 <<= 0x1;
					}
					if (local233 >= 8 && arg0.anInt744 == arg0.anInt758 && arg0.anInt757 != -1) {
						arg0.anInt744 = arg0.anInt757;
					}
					if (local53 < local75) {
						arg0.anInt776 += local233;
						if (arg0.anInt776 > local75) {
							arg0.anInt776 = local75;
						}
					} else if (local53 > local75) {
						arg0.anInt776 -= local233;
						if (arg0.anInt776 < local75) {
							arg0.anInt776 = local75;
						}
					}
					if (local56 < local90) {
						arg0.anInt777 += local233;
						if (arg0.anInt777 > local90) {
							arg0.anInt777 = local90;
						}
					} else if (local56 > local90) {
						arg0.anInt777 -= local233;
						if (arg0.anInt777 < local90) {
							arg0.anInt777 = local90;
						}
					}
					if (arg0.anInt776 == local75 && arg0.anInt777 == local90) {
						arg0.anInt785--;
						if (arg0.anInt763 > 0) {
							arg0.anInt763--;
							return;
						}
					}
				} else {
					arg0.anInt776 = local75;
					arg0.anInt777 = local90;
				}
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("35715, " + arg0 + ", " + 3 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!FHOAYGUJ;)V")
	private void method606(@OriginalArg(1) Class1_Sub2_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt772 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt762 != -1 && arg0.anInt762 < 32768) {
					@Pc(26) Class1_Sub2_Sub2_Sub1_Sub2 local26 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[arg0.anInt762];
					if (local26 != null) {
						local34 = arg0.anInt776 - local26.anInt776;
						local40 = arg0.anInt777 - local26.anInt777;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt779 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt762 >= 32768) {
					local65 = arg0.anInt762 - 32768;
					if (local65 == this.anInt965) {
						local65 = this.anInt922;
					}
					@Pc(77) Class1_Sub2_Sub2_Sub1_Sub1 local77 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt776 - local77.anInt776;
						@Pc(91) int local91 = arg0.anInt777 - local77.anInt777;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt779 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt770 != 0 || arg0.anInt771 != 0) && (arg0.anInt785 == 0 || arg0.anInt742 > 0)) {
					local65 = arg0.anInt776 - (arg0.anInt770 - this.anInt958 - this.anInt958) * 64;
					local34 = arg0.anInt777 - (arg0.anInt771 - this.anInt959 - this.anInt959) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt779 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt770 = 0;
					arg0.anInt771 = 0;
				}
				local65 = arg0.anInt779 - arg0.anInt778 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt772 || local65 > 2048 - arg0.anInt772) {
						arg0.anInt778 = arg0.anInt779;
					} else if (local65 > 1024) {
						arg0.anInt778 -= arg0.anInt772;
					} else {
						arg0.anInt778 += arg0.anInt772;
					}
					arg0.anInt778 &= 0x7FF;
					if (arg0.anInt744 == arg0.anInt786 && arg0.anInt778 != arg0.anInt779) {
						if (arg0.anInt787 != -1) {
							arg0.anInt744 = arg0.anInt787;
							return;
						}
						arg0.anInt744 = arg0.anInt758;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("90677, " + false + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FHOAYGUJ;Z)V")
	private void method607(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aBoolean217 &= arg1;
			arg0.aBoolean175 = false;
			@Pc(19) Class36 local19;
			if (arg0.anInt744 != -1) {
				local19 = Class36.aClass36Array1[arg0.anInt744];
				arg0.anInt746++;
				if (arg0.anInt745 < local19.anInt532 && arg0.anInt746 > local19.method371(arg0.anInt745)) {
					arg0.anInt746 = 0;
					arg0.anInt745++;
				}
				if (arg0.anInt745 >= local19.anInt532) {
					arg0.anInt746 = 0;
					arg0.anInt745 = 0;
				}
			}
			if (arg0.anInt780 != -1 && anInt1045 >= arg0.anInt783) {
				if (arg0.anInt781 < 0) {
					arg0.anInt781 = 0;
				}
				local19 = Class33.aClass33Array1[arg0.anInt780].aClass36_1;
				arg0.anInt782++;
				while (arg0.anInt781 < local19.anInt532 && arg0.anInt782 > local19.method371(arg0.anInt781)) {
					arg0.anInt782 -= local19.method371(arg0.anInt781);
					arg0.anInt781++;
				}
				if (arg0.anInt781 >= local19.anInt532 && (arg0.anInt781 < 0 || arg0.anInt781 >= local19.anInt532)) {
					arg0.anInt780 = -1;
				}
			}
			if (arg0.anInt764 != -1 && arg0.anInt767 <= 1) {
				local19 = Class36.aClass36Array1[arg0.anInt764];
				if (local19.anInt538 == 1 && arg0.anInt763 > 0 && arg0.anInt751 <= anInt1045 && arg0.anInt752 < anInt1045) {
					arg0.anInt767 = 1;
					return;
				}
			}
			if (arg0.anInt764 != -1 && arg0.anInt767 == 0) {
				local19 = Class36.aClass36Array1[arg0.anInt764];
				arg0.anInt766++;
				while (arg0.anInt765 < local19.anInt532 && arg0.anInt766 > local19.method371(arg0.anInt765)) {
					arg0.anInt766 -= local19.method371(arg0.anInt765);
					arg0.anInt765++;
				}
				if (arg0.anInt765 >= local19.anInt532) {
					arg0.anInt765 -= local19.anInt533;
					arg0.anInt768++;
					if (arg0.anInt768 >= local19.anInt537) {
						arg0.anInt764 = -1;
					}
					if (arg0.anInt765 < 0 || arg0.anInt765 >= local19.anInt532) {
						arg0.anInt764 = -1;
					}
				}
				arg0.aBoolean175 = local19.aBoolean114;
			}
			if (arg0.anInt767 > 0) {
				arg0.anInt767--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("64487, " + arg0 + ", " + arg1 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method608() {
		try {
			if (this.anInt1008 == -1 || this.anInt937 != 2 && super.aClass26_2 == null) {
				if (this.aBoolean212) {
					this.method704();
					this.aBoolean212 = false;
					this.aClass26_16.method280(super.aGraphics2, 0, 4, (byte) 1);
					this.aClass26_17.method280(super.aGraphics2, 0, 357, (byte) 1);
					this.aClass26_18.method280(super.aGraphics2, 722, 4, (byte) 1);
					this.aClass26_19.method280(super.aGraphics2, 743, 205, (byte) 1);
					this.aClass26_20.method280(super.aGraphics2, 0, 0, (byte) 1);
					this.aClass26_21.method280(super.aGraphics2, 516, 4, (byte) 1);
					this.aClass26_22.method280(super.aGraphics2, 516, 205, (byte) 1);
					this.aClass26_23.method280(super.aGraphics2, 496, 357, (byte) 1);
					this.aClass26_24.method280(super.aGraphics2, 0, 338, (byte) 1);
					this.aBoolean202 = true;
					this.aBoolean209 = true;
					this.aBoolean185 = true;
					this.aBoolean200 = true;
					if (this.anInt937 != 2) {
						this.aClass26_5.method280(super.aGraphics2, 4, 4, (byte) 1);
						this.aClass26_4.method280(super.aGraphics2, 550, 4, (byte) 1);
					}
				}
				if (this.anInt937 == 2) {
					this.method711(704);
				}
				if (this.aBoolean218 && this.anInt829 == 1) {
					this.aBoolean202 = true;
				}
				@Pc(285) boolean local285;
				if (this.anInt896 != -1) {
					local285 = this.method716(this.anInt934, this.anInt896);
					if (local285) {
						this.aBoolean202 = true;
					}
				}
				if (this.anInt1027 == 2) {
					this.aBoolean202 = true;
				}
				if (this.anInt998 == 2) {
					this.aBoolean202 = true;
				}
				if (this.aBoolean202) {
					this.method666();
					this.aBoolean202 = false;
				}
				@Pc(419) int local419;
				@Pc(371) int local371;
				if (this.anInt956 == -1 && this.anInt861 == 0) {
					this.aClass18_1.anInt321 = this.anInt890 - this.anInt910 - 77;
					if (super.anInt815 > 448 && super.anInt815 < 560 && super.anInt816 > 332) {
						this.method679(this.anInt890, super.anInt816 - 357, 77, -1, 0, this.aClass18_1, super.anInt815 - 17, 463, this.anInt886);
					}
					local371 = this.anInt890 - this.aClass18_1.anInt321 - 77;
					if (local371 < 0) {
						local371 = 0;
					}
					if (local371 > this.anInt890 - 77) {
						local371 = this.anInt890 - 77;
					}
					if (this.anInt910 != local371) {
						this.anInt910 = local371;
						this.aBoolean209 = true;
					}
					anInt948++;
					if (anInt948 > 1669) {
						anInt948 = 0;
						this.aClass1_Sub2_Sub3_9.method296(231, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method297(0);
						local419 = this.aClass1_Sub2_Sub3_9.anInt474;
						this.aClass1_Sub2_Sub3_9.method297((int) (Math.random() * 256.0D));
						this.aClass1_Sub2_Sub3_9.method298(48380);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub2_Sub3_9.method297(16);
						}
						this.aClass1_Sub2_Sub3_9.method298((int) (Math.random() * 65536.0D));
						this.aClass1_Sub2_Sub3_9.method297(185);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub2_Sub3_9.method297(239);
						}
						this.aClass1_Sub2_Sub3_9.method298(62945);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub2_Sub3_9.method298(14921);
						}
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub2_Sub3_9.method298(5088);
						}
						this.aClass1_Sub2_Sub3_9.method298(14155);
						this.aClass1_Sub2_Sub3_9.method306(this.aClass1_Sub2_Sub3_9.anInt474 - local419);
					}
				}
				if (this.anInt956 == -1 && this.anInt861 == 3) {
					local371 = this.anInt1048 * 14 + 7;
					this.aClass18_1.anInt321 = this.anInt1049;
					if (super.anInt815 > 448 && super.anInt815 < 560 && super.anInt816 > 332) {
						this.method679(local371, super.anInt816 - 357, 77, -1, 0, this.aClass18_1, super.anInt815 - 17, 463, this.anInt886);
					}
					local419 = this.aClass18_1.anInt321;
					if (local419 < 0) {
						local419 = 0;
					}
					if (local419 > local371 - 77) {
						local419 = local371 - 77;
					}
					if (this.anInt1049 != local419) {
						this.anInt1049 = local419;
						this.aBoolean209 = true;
					}
				}
				if (this.anInt956 != -1) {
					local285 = this.method716(this.anInt934, this.anInt956);
					if (local285) {
						this.aBoolean209 = true;
					}
				}
				if (this.anInt1027 == 3) {
					this.aBoolean209 = true;
				}
				if (this.anInt998 == 3) {
					this.aBoolean209 = true;
				}
				if (this.aString19 != null) {
					this.aBoolean209 = true;
				}
				if (this.aBoolean218 && this.anInt829 == 2) {
					this.aBoolean209 = true;
				}
				if (this.aBoolean209) {
					this.method727();
					this.aBoolean209 = false;
				}
				if (this.anInt937 == 2) {
					this.method708();
					this.aClass26_4.method280(super.aGraphics2, 550, 4, (byte) 1);
				}
				if (this.anInt966 != -1) {
					this.aBoolean185 = true;
				}
				if (this.aBoolean185) {
					if (this.anInt966 != -1 && this.anInt966 == this.anInt913) {
						this.anInt966 = -1;
						this.aClass1_Sub2_Sub3_9.method296(244, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method297(this.anInt913);
					}
					this.aBoolean185 = false;
					this.aClass26_27.method279();
					this.aClass1_Sub2_Sub1_Sub1_10.method51(0, 0);
					if (this.anInt896 == -1) {
						if (this.anIntArray246[this.anInt913] != -1) {
							if (this.anInt913 == 0) {
								this.aClass1_Sub2_Sub1_Sub1_11.method51(10, 22);
							}
							if (this.anInt913 == 1) {
								this.aClass1_Sub2_Sub1_Sub1_12.method51(8, 54);
							}
							if (this.anInt913 == 2) {
								this.aClass1_Sub2_Sub1_Sub1_12.method51(8, 82);
							}
							if (this.anInt913 == 3) {
								this.aClass1_Sub2_Sub1_Sub1_13.method51(8, 110);
							}
							if (this.anInt913 == 4) {
								this.aClass1_Sub2_Sub1_Sub1_15.method51(8, 153);
							}
							if (this.anInt913 == 5) {
								this.aClass1_Sub2_Sub1_Sub1_15.method51(8, 181);
							}
							if (this.anInt913 == 6) {
								this.aClass1_Sub2_Sub1_Sub1_14.method51(9, 209);
							}
						}
						if (this.anIntArray246[0] != -1 && (this.anInt966 != 0 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[0].method51(13, 29);
						}
						if (this.anIntArray246[1] != -1 && (this.anInt966 != 1 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[1].method51(11, 53);
						}
						if (this.anIntArray246[2] != -1 && (this.anInt966 != 2 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[2].method51(11, 82);
						}
						if (this.anIntArray246[3] != -1 && (this.anInt966 != 3 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[3].method51(12, 115);
						}
						if (this.anIntArray246[4] != -1 && (this.anInt966 != 4 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[4].method51(13, 153);
						}
						if (this.anIntArray246[5] != -1 && (this.anInt966 != 5 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[5].method51(11, 180);
						}
						if (this.anIntArray246[6] != -1 && (this.anInt966 != 6 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[6].method51(13, 208);
						}
					}
					this.aClass26_27.method280(super.aGraphics2, 516, 160, (byte) 1);
					this.aClass26_26.method279();
					this.aClass1_Sub2_Sub1_Sub1_9.method51(0, 0);
					if (this.anInt896 == -1) {
						if (this.anIntArray246[this.anInt913] != -1) {
							if (this.anInt913 == 7) {
								this.aClass1_Sub2_Sub1_Sub1_16.method51(0, 42);
							}
							if (this.anInt913 == 8) {
								this.aClass1_Sub2_Sub1_Sub1_17.method51(0, 74);
							}
							if (this.anInt913 == 9) {
								this.aClass1_Sub2_Sub1_Sub1_17.method51(0, 102);
							}
							if (this.anInt913 == 10) {
								this.aClass1_Sub2_Sub1_Sub1_18.method51(1, 130);
							}
							if (this.anInt913 == 11) {
								this.aClass1_Sub2_Sub1_Sub1_20.method51(0, 173);
							}
							if (this.anInt913 == 12) {
								this.aClass1_Sub2_Sub1_Sub1_20.method51(0, 201);
							}
							if (this.anInt913 == 13) {
								this.aClass1_Sub2_Sub1_Sub1_19.method51(0, 229);
							}
						}
						if (this.anIntArray246[8] != -1 && (this.anInt966 != 8 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[7].method51(2, 74);
						}
						if (this.anIntArray246[9] != -1 && (this.anInt966 != 9 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[8].method51(3, 102);
						}
						if (this.anIntArray246[10] != -1 && (this.anInt966 != 10 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[9].method51(4, 137);
						}
						if (this.anIntArray246[11] != -1 && (this.anInt966 != 11 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[10].method51(2, 174);
						}
						if (this.anIntArray246[12] != -1 && (this.anInt966 != 12 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[11].method51(2, 201);
						}
						if (this.anIntArray246[13] != -1 && (this.anInt966 != 13 || anInt1045 % 20 < 10)) {
							this.aClass1_Sub2_Sub1_Sub1Array2[12].method51(2, 226);
						}
					}
					this.aClass26_26.method280(super.aGraphics2, 496, 466, (byte) 1);
					this.aClass26_5.method279();
					Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
				}
				if (this.aBoolean200) {
					this.aBoolean200 = false;
					this.aClass26_25.method279();
					this.aClass1_Sub2_Sub1_Sub1_8.method51(0, 0);
					this.aClass1_Sub2_Sub1_Sub4_3.method544(16777215, true, 28, 55, "Public chat");
					if (this.anInt869 == 0) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(65280, true, 41, 55, "On");
					}
					if (this.anInt869 == 1) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(16776960, true, 41, 55, "Friends");
					}
					if (this.anInt869 == 2) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(16711680, true, 41, 55, "Off");
					}
					if (this.anInt869 == 3) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(65535, true, 41, 55, "Hide");
					}
					this.aClass1_Sub2_Sub1_Sub4_3.method544(16777215, true, 28, 184, "Private chat");
					if (this.anInt1042 == 0) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(65280, true, 41, 184, "On");
					}
					if (this.anInt1042 == 1) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(16776960, true, 41, 184, "Friends");
					}
					if (this.anInt1042 == 2) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(16711680, true, 41, 184, "Off");
					}
					this.aClass1_Sub2_Sub1_Sub4_3.method544(16777215, true, 28, 324, "Trade/compete");
					if (this.anInt852 == 0) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(65280, true, 41, 324, "On");
					}
					if (this.anInt852 == 1) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(16776960, true, 41, 324, "Friends");
					}
					if (this.anInt852 == 2) {
						this.aClass1_Sub2_Sub1_Sub4_3.method544(16711680, true, 41, 324, "Off");
					}
					this.aClass1_Sub2_Sub1_Sub4_3.method544(16777215, true, 33, 458, "Report abuse");
					this.aClass26_25.method280(super.aGraphics2, 0, 453, (byte) 1);
					this.aClass26_5.method279();
					Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
				}
				this.anInt934 = 0;
			} else {
				if (this.anInt937 == 2) {
					this.method716(this.anInt934, this.anInt1008);
					if (this.anInt945 != -1) {
						this.method716(this.anInt934, this.anInt945);
					}
					this.anInt934 = 0;
					this.method615(this.anInt1035);
					super.aClass26_2.method279();
					Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray238;
					Class1_Sub2_Sub1.method533();
					this.aBoolean212 = true;
					@Pc(63) Class18 local63 = Class18.method187(this.anInt1008);
					if (local63.anInt333 == 512 && local63.anInt349 == 334 && local63.anInt348 == 0) {
						local63.anInt333 = 765;
						local63.anInt349 = 503;
					}
					this.method667(0, local63, 0, 0);
					if (this.anInt945 != -1) {
						local63 = Class18.method187(this.anInt945);
						if (local63.anInt333 == 512 && local63.anInt349 == 334 && local63.anInt348 == 0) {
							local63.anInt333 = 765;
							local63.anInt349 = 503;
						}
						this.method667(0, local63, 0, 0);
					}
					if (this.aBoolean218) {
						this.method622();
					} else {
						this.method690((byte) 4);
						this.method662(this.aByte48);
					}
				}
				super.aClass26_2.method280(super.aGraphics2, 0, 0, (byte) 1);
			}
		} catch (@Pc(1380) RuntimeException local1380) {
			signlink.reporterror("31963, " + 74 + ", " + local1380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method609() {
		try {
			@Pc(6) int local6 = this.anInt879 * 128 + 64;
			@Pc(13) int local13 = this.anInt880 * 128 + 64;
			@Pc(24) int local24 = this.method715(local13, local6, this.anInt1001) - this.anInt881;
			if (this.anInt1011 < local6) {
				this.anInt1011 += this.anInt882 + (local6 - this.anInt1011) * this.anInt883 / 1000;
				if (this.anInt1011 > local6) {
					this.anInt1011 = local6;
				}
			}
			if (this.anInt1011 > local6) {
				this.anInt1011 -= this.anInt882 + (this.anInt1011 - local6) * this.anInt883 / 1000;
				if (this.anInt1011 < local6) {
					this.anInt1011 = local6;
				}
			}
			if (this.anInt1012 < local24) {
				this.anInt1012 += this.anInt882 + (local24 - this.anInt1012) * this.anInt883 / 1000;
				if (this.anInt1012 > local24) {
					this.anInt1012 = local24;
				}
			}
			if (this.anInt1012 > local24) {
				this.anInt1012 -= this.anInt882 + (this.anInt1012 - local24) * this.anInt883 / 1000;
				if (this.anInt1012 < local24) {
					this.anInt1012 = local24;
				}
			}
			if (this.anInt1013 < local13) {
				this.anInt1013 += this.anInt882 + (local13 - this.anInt1013) * this.anInt883 / 1000;
				if (this.anInt1013 > local13) {
					this.anInt1013 = local13;
				}
			}
			if (this.anInt1013 > local13) {
				this.anInt1013 -= this.anInt882 + (this.anInt1013 - local13) * this.anInt883 / 1000;
				if (this.anInt1013 < local13) {
					this.anInt1013 = local13;
				}
			}
			local6 = this.anInt984 * 128 + 64;
			local13 = this.anInt985 * 128 + 64;
			local24 = this.method715(local13, local6, this.anInt1001) - this.anInt986;
			@Pc(222) int local222 = local6 - this.anInt1011;
			@Pc(227) int local227 = local24 - this.anInt1012;
			@Pc(232) int local232 = local13 - this.anInt1013;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			if (this.aByte47 != 9) {
				this.anInt951 = this.aClass1_Sub2_Sub3_8.method307();
			}
			@Pc(274) int local274 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt1014 < local254) {
				this.anInt1014 += this.anInt987 + (local254 - this.anInt1014) * this.anInt988 / 1000;
				if (this.anInt1014 > local254) {
					this.anInt1014 = local254;
				}
			}
			if (this.anInt1014 > local254) {
				this.anInt1014 -= this.anInt987 + (this.anInt1014 - local254) * this.anInt988 / 1000;
				if (this.anInt1014 < local254) {
					this.anInt1014 = local254;
				}
			}
			@Pc(345) int local345 = local274 - this.anInt1015;
			if (local345 > 1024) {
				local345 -= 2048;
			}
			if (local345 < -1024) {
				local345 += 2048;
			}
			if (local345 > 0) {
				this.anInt1015 += this.anInt987 + local345 * this.anInt988 / 1000;
				this.anInt1015 &= 0x7FF;
			}
			if (local345 < 0) {
				this.anInt1015 -= this.anInt987 + -local345 * this.anInt988 / 1000;
				this.anInt1015 &= 0x7FF;
			}
			@Pc(403) int local403 = local274 - this.anInt1015;
			if (local403 > 1024) {
				local403 -= 2048;
			}
			if (local403 < -1024) {
				local403 += 2048;
			}
			if (local403 < 0 && local345 > 0 || local403 > 0 && local345 < 0) {
				this.anInt1015 = local274;
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("61045, " + 9 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IJOSTBQT;B)Z")
	private boolean method610(@OriginalArg(0) Class18 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt343;
			if (this.anInt876 == 2) {
				if (local4 == 201) {
					this.aBoolean209 = true;
					this.anInt861 = 0;
					this.aBoolean233 = true;
					this.aString30 = "";
					this.anInt927 = 1;
					this.aString27 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean209 = true;
					this.anInt861 = 0;
					this.aBoolean233 = true;
					this.aString30 = "";
					this.anInt927 = 2;
					this.aString27 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt954 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean209 = true;
				this.anInt861 = 0;
				this.aBoolean233 = true;
				this.aString30 = "";
				this.anInt927 = 4;
				this.aString27 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean209 = true;
				this.anInt861 = 0;
				this.aBoolean233 = true;
				this.aString30 = "";
				this.anInt927 = 5;
				this.aString27 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray224[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class35.anInt528 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class35.anInt528) {
								local127 = 0;
							}
						}
						if (!Class35.aClass35Array1[local127].aBoolean112 && Class35.aClass35Array1[local127].anInt529 == local118 + (this.aBoolean193 ? 0 : 7)) {
							this.anIntArray224[local118] = local127;
							this.aBoolean222 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray234[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray23[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray23[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray234[local118] = local127;
				this.aBoolean222 = true;
			}
			if (local4 == 324 && !this.aBoolean193) {
				this.aBoolean193 = true;
				this.method611(649);
			}
			if (local4 == 325 && this.aBoolean193) {
				this.aBoolean193 = false;
				this.method611(649);
			}
			if (local4 == 326) {
				this.aClass1_Sub2_Sub3_9.method296(219, this.anInt1018);
				this.aClass1_Sub2_Sub3_9.method297(this.aBoolean193 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub2_Sub3_9.method297(this.anIntArray224[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub2_Sub3_9.method297(this.anIntArray234[local122]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean216 = !this.aBoolean216;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method614();
				if (this.aString31.length() > 0) {
					this.aClass1_Sub2_Sub3_9.method296(153, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method303(Class40.method413(this.aString31), this.anInt907);
					this.aClass1_Sub2_Sub3_9.method297(local4 - 601);
					this.aClass1_Sub2_Sub3_9.method297(this.aBoolean216 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("77040, " + arg0 + ", " + 56 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method611(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean222 = true;
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray224[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class35.anInt528; local19++) {
					if (!Class35.aClass35Array1[local19].aBoolean112 && Class35.aClass35Array1[local19].anInt529 == local10 + (this.aBoolean193 ? 0 : 7)) {
						this.anIntArray224[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("28036, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method612(@OriginalArg(1) int arg0) {
		try {
			if (anInt920 > 8 || anInt920 < 8) {
				aBoolean192 = true;
			}
			Class18.method186(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("63599, " + 8 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg1 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg2 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg4;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub2_Sub2_Sub3.anIntArray96[local5];
				local27 = Class1_Sub2_Sub2_Sub3.anIntArray97[local5];
				local37 = local27 * 0 - arg4 * local23 >> 16;
				local17 = local23 * 0 + arg4 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub2_Sub2_Sub3.anIntArray96[local11];
				local27 = Class1_Sub2_Sub2_Sub3.anIntArray97[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt1011 = arg3 - local13;
			this.anInt1012 = arg0 - local15;
			this.anInt1013 = arg5 - local17;
			this.anInt1014 = arg1;
			this.anInt1015 = arg2;
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("21758, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 8 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method614() {
		try {
			this.aClass1_Sub2_Sub3_9.method296(232, this.anInt1018);
			if (this.anInt896 != -1) {
				this.method612(this.anInt896);
				this.anInt896 = -1;
				this.aBoolean202 = true;
				this.aBoolean229 = false;
				this.aBoolean185 = true;
			}
			if (this.anInt956 != -1) {
				this.method612(this.anInt956);
				this.anInt956 = -1;
				this.aBoolean209 = true;
				this.aBoolean229 = false;
			}
			if (this.anInt1008 != -1) {
				this.method612(this.anInt1008);
				this.anInt1008 = -1;
				this.aBoolean212 = true;
			}
			if (this.anInt945 != -1) {
				this.method612(this.anInt945);
				this.anInt945 = -1;
			}
			if (this.anInt1056 != -1) {
				this.method612(this.anInt1056);
				this.anInt1056 = -1;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("88142, " + 927 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method615(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 79 / arg0;
			if (super.aClass26_2 == null) {
				this.method677();
				this.aClass26_7 = null;
				this.aClass26_8 = null;
				this.aClass26_9 = null;
				this.aClass26_10 = null;
				this.aClass26_11 = null;
				this.aClass26_12 = null;
				this.aClass26_13 = null;
				this.aClass26_14 = null;
				this.aClass26_15 = null;
				this.aClass26_6 = null;
				this.aClass26_4 = null;
				this.aClass26_3 = null;
				this.aClass26_5 = null;
				this.aClass26_25 = null;
				this.aClass26_26 = null;
				this.aClass26_27 = null;
				super.aClass26_2 = new Class26(503, 0, 765, this.method586(735));
				this.aBoolean212 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("36440, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method616(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 >> 7 == this.anInt989 && aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 >> 7 == this.anInt990) {
				this.anInt989 = 0;
			}
			@Pc(21) int local21 = this.anInt923;
			if (arg1) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class1_Sub2_Sub2_Sub1_Sub1 local33;
				@Pc(38) int local38;
				if (arg1) {
					local33 = aClass1_Sub2_Sub2_Sub1_Sub1_1;
					local38 = this.anInt922 << 14;
				} else {
					local33 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anIntArray247[local27]];
					local38 = this.anIntArray247[local27] << 14;
				}
				if (local33 != null && local33.method568()) {
					local33.aBoolean27 = false;
					if ((aBoolean215 && this.anInt923 > 50 || this.anInt923 > 200) && !arg1 && local33.anInt744 == local33.anInt786) {
						local33.aBoolean27 = true;
					}
					@Pc(89) int local89 = local33.anInt776 >> 7;
					@Pc(94) int local94 = local33.anInt777 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass1_Sub2_Sub2_Sub3_1 == null || anInt1045 < local33.anInt187 || anInt1045 >= local33.anInt188) {
							if ((local33.anInt776 & 0x7F) == 64 && (local33.anInt777 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local89][local94] == this.anInt928) {
									continue;
								}
								this.anIntArrayArray24[local89][local94] = this.anInt928;
							}
							local33.anInt181 = this.method715(local33.anInt777, local33.anInt776, this.anInt1001);
							this.aClass16_1.method138(60, local33.anInt778, this.anInt1001, local33.aBoolean175, local33.anInt776, local33, local33.anInt181, local33.anInt777, local38);
						} else {
							local33.aBoolean27 = false;
							local33.anInt181 = this.method715(local33.anInt777, local33.anInt776, this.anInt1001);
							this.aClass16_1.method139(local33.anInt777, local33.anInt175, local33.anInt776, this.anInt1001, local33.anInt172, local33.anInt173, local33.anInt174, local38, local33.anInt181, local33.anInt778, local33);
						}
					}
				}
			}
			if (arg0 != -82) {
				this.method581();
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("59101, " + arg0 + ", " + arg1 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!IJOSTBQT;B)Z")
	private boolean method617(@OriginalArg(0) Class18 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt343;
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
				this.aStringArray8[this.anInt1041] = "Remove @whi@" + this.aStringArray9[local4];
				this.anIntArray244[this.anInt1041] = 953;
				this.anInt1041++;
				this.aStringArray8[this.anInt1041] = "Message @whi@" + this.aStringArray9[local4];
				this.anIntArray244[this.anInt1041] = 503;
				this.anInt1041++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray8[this.anInt1041] = "Remove @whi@" + arg0.aString8;
				this.anIntArray244[this.anInt1041] = 305;
				this.anInt1041++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("22409, " + arg0 + ", " + 0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class42 local9 = this.aClass42ArrayArrayArray1[this.anInt1001][arg0][arg1];
		if (local9 == null) {
			this.aClass16_1.method148(this.anInt1001, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub2_Sub2_Sub2 local23 = null;
		@Pc(27) Class1_Sub2_Sub2_Sub2 local27;
		for (local27 = (Class1_Sub2_Sub2_Sub2) local9.method487(); local27 != null; local27 = (Class1_Sub2_Sub2_Sub2) local9.method489()) {
			@Pc(32) Class38 local32 = Class38.method409(local27.anInt224);
			@Pc(35) int local35 = local32.anInt577;
			if (local32.aBoolean123) {
				local35 *= local27.anInt223 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method485(this.anInt909, local23);
		@Pc(66) Class1_Sub2_Sub2_Sub2 local66 = null;
		@Pc(68) Class1_Sub2_Sub2_Sub2 local68 = null;
		for (local27 = (Class1_Sub2_Sub2_Sub2) local9.method487(); local27 != null; local27 = (Class1_Sub2_Sub2_Sub2) local9.method489()) {
			if (local27.anInt224 != local23.anInt224 && local66 == null) {
				local66 = local27;
			}
			if (local27.anInt224 != local23.anInt224 && local27.anInt224 != local66.anInt224 && local68 == null) {
				local68 = local27;
			}
		}
		@Pc(111) int local111 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass16_1.method134(local66, this.anInt1001, local68, local111, arg1, arg0, local23, this.method715(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt1001));
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method620() {
		try {
			@Pc(42) int local42;
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(112) int local112;
			@Pc(126) int local126;
			@Pc(138) int local138;
			@Pc(198) int local198;
			try {
				this.anInt902 = -1;
				this.aClass42_12.method491();
				this.aClass42_11.method491();
				anInt976++;
				if (anInt976 > 142) {
					anInt976 = 0;
					this.aClass1_Sub2_Sub3_9.method296(140, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(232);
				}
				Class1_Sub2_Sub1_Sub3.method436(this.aBoolean198);
				this.method634();
				this.aClass16_1.method127();
				System.gc();
				for (local42 = 0; local42 < 4; local42++) {
					this.aClass10Array1[local42].method103();
				}
				for (local55 = 0; local55 < 4; local55++) {
					for (local59 = 0; local59 < 104; local59++) {
						for (local63 = 0; local63 < 104; local63++) {
							this.aByteArrayArrayArray8[local55][local59][local63] = 0;
						}
					}
				}
				@Pc(97) Class46 local97 = new Class46(this.anIntArrayArrayArray8, 104, this.aByteArrayArrayArray8, 104, true);
				local63 = this.aByteArrayArray6.length;
				this.aClass1_Sub2_Sub3_9.method296(71, this.anInt1018);
				@Pc(261) int local261;
				@Pc(249) int local249;
				if (!this.aBoolean186) {
					@Pc(143) byte[] local143;
					for (local112 = 0; local112 < local63; local112++) {
						local126 = (this.anIntArray264[local112] >> 8) * 64 - this.anInt958;
						local138 = (this.anIntArray264[local112] & 0xFF) * 64 - this.anInt959;
						local143 = this.aByteArrayArray6[local112];
						if (local143 != null) {
							local97.method509(local126, (this.anInt1059 - 6) * 8, local143, this.aClass10Array1, this.anInt891, (this.anInt1060 - 6) * 8, local138);
						}
					}
					for (local126 = 0; local126 < local63; local126++) {
						local138 = (this.anIntArray264[local126] >> 8) * 64 - this.anInt958;
						local198 = (this.anIntArray264[local126] & 0xFF) * 64 - this.anInt959;
						@Pc(203) byte[] local203 = this.aByteArrayArray6[local126];
						if (local203 == null && this.anInt1060 < 800) {
							local97.method507(local198, 64, local138, 64);
						}
					}
					this.aClass1_Sub2_Sub3_9.method296(71, this.anInt1018);
					for (local138 = 0; local138 < local63; local138++) {
						local143 = this.aByteArrayArray5[local138];
						if (local143 != null) {
							local249 = (this.anIntArray264[local138] >> 8) * 64 - this.anInt958;
							local261 = (this.anIntArray264[local138] & 0xFF) * 64 - this.anInt959;
							local97.method508(local261, local143, this.aClass16_1, this.aClass10Array1, local249);
						}
					}
				}
				if (this.aBoolean186) {
					local112 = 0;
					label258: while (true) {
						@Pc(316) int local316;
						@Pc(322) int local322;
						@Pc(328) int local328;
						@Pc(338) int local338;
						@Pc(340) int local340;
						if (local112 >= 4) {
							for (local126 = 0; local126 < 13; local126++) {
								for (local138 = 0; local138 < 13; local138++) {
									local198 = this.anIntArrayArrayArray7[0][local126][local138];
									if (local198 == -1) {
										local97.method507(local138 * 8, 8, local126 * 8, 8);
									}
								}
							}
							this.aClass1_Sub2_Sub3_9.method296(71, this.anInt1018);
							local138 = 0;
							while (true) {
								if (local138 >= 4) {
									break label258;
								}
								for (local198 = 0; local198 < 13; local198++) {
									for (local249 = 0; local249 < 13; local249++) {
										local261 = this.anIntArrayArrayArray7[local138][local198][local249];
										if (local261 != -1) {
											local316 = local261 >> 24 & 0x3;
											local322 = local261 >> 1 & 0x3;
											local328 = local261 >> 14 & 0x3FF;
											local338 = local261 >> 3 & 0x7FF;
											local340 = (local328 / 8 << 8) + local338 / 8;
											for (@Pc(520) int local520 = 0; local520 < this.anIntArray264.length; local520++) {
												if (this.anIntArray264[local520] == local340 && this.aByteArrayArray5[local520] != null) {
													local97.method521(local249 * 8, this.aClass10Array1, local198 * 8, (local328 & 0x7) * 8, local138, local316, (local338 & 0x7) * 8, this.aByteArrayArray5[local520], this.aBoolean225, this.aClass16_1, local322);
													break;
												}
											}
										}
									}
								}
								local138++;
							}
						}
						for (local126 = 0; local126 < 13; local126++) {
							for (local138 = 0; local138 < 13; local138++) {
								@Pc(292) boolean local292 = false;
								local249 = this.anIntArrayArrayArray7[local112][local126][local138];
								if (local249 != -1) {
									local261 = local249 >> 24 & 0x3;
									local316 = local249 >> 1 & 0x3;
									local322 = local249 >> 14 & 0x3FF;
									local328 = local249 >> 3 & 0x7FF;
									local338 = (local322 / 8 << 8) + local328 / 8;
									for (local340 = 0; local340 < this.anIntArray264.length; local340++) {
										if (this.anIntArray264[local340] == local338 && this.aByteArrayArray6[local340] != null) {
											local97.method516(local112, local138 * 8, this.aClass10Array1, this.aByteArrayArray6[local340], local261, (local328 & 0x7) * 8, (local322 & 0x7) * 8, local126 * 8, local316);
											local292 = true;
											break;
										}
									}
								}
								if (!local292) {
									local97.method526(local126 * 8, local112, local138 * 8);
								}
							}
						}
						local112++;
					}
				}
				this.aClass1_Sub2_Sub3_9.method296(71, this.anInt1018);
				local97.method511(this.aClass16_1, this.aClass10Array1);
				if (this.aClass26_5 != null) {
					this.aClass26_5.method279();
					Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
				}
				this.aClass1_Sub2_Sub3_9.method296(71, this.anInt1018);
				local112 = Class46.anInt698;
				if (local112 > this.anInt1001) {
					local112 = this.anInt1001;
				}
				if (local112 < this.anInt1001 - 1) {
					local112 = this.anInt1001 - 1;
				}
				if (aBoolean215) {
					this.aClass16_1.method128(Class46.anInt698);
				} else {
					this.aClass16_1.method128(0);
				}
				for (local126 = 0; local126 < 104; local126++) {
					for (local138 = 0; local138 < 104; local138++) {
						this.method619(local126, local138);
					}
				}
				this.method627(this.aByte38);
			} catch (@Pc(673) Exception local673) {
			}
			Class27.aClass30_4.method350();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub2_Sub3_9.method296(63, this.anInt1018);
				this.aClass1_Sub2_Sub3_9.method301(1057001181);
			}
			if (aBoolean215 && signlink.aRandomAccessFile3 != null) {
				local42 = this.aClass22_Sub1_1.method468(0);
				for (local55 = 0; local55 < local42; local55++) {
					local59 = this.aClass22_Sub1_1.method462(local55);
					if ((local59 & 0x79) == 0) {
						Class1_Sub2_Sub2_Sub3.method195(local55);
					}
				}
			}
			System.gc();
			Class1_Sub2_Sub1_Sub3.method437((byte) 2);
			this.aClass22_Sub1_1.method454();
			local42 = (this.anInt1059 - 6) / 8 - 1;
			local55 = (this.anInt1059 + 6) / 8 + 1;
			local59 = (this.anInt1060 - 6) / 8 - 1;
			local63 = (this.anInt1060 + 6) / 8 + 1;
			if (this.aBoolean207) {
				local42 = 49;
				local55 = 50;
				local59 = 49;
				local63 = 50;
			}
			for (local112 = local42; local112 <= local55; local112++) {
				for (local126 = local59; local126 <= local63; local126++) {
					if (local112 == local42 || local112 == local55 || local126 == local59 || local126 == local63) {
						local138 = this.aClass22_Sub1_1.method456(local112, local126, 0);
						if (local138 != -1) {
							this.aClass22_Sub1_1.method464(local138, 3);
						}
						local198 = this.aClass22_Sub1_1.method456(local112, local126, 1);
						if (local198 != -1) {
							this.aClass22_Sub1_1.method464(local198, 3);
						}
					}
				}
			}
		} catch (@Pc(848) RuntimeException local848) {
			signlink.reporterror("81261, " + false + ", " + local848.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method621(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt975; local4++) {
				@Pc(14) Class1_Sub2_Sub2_Sub1_Sub2 local14 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[this.anIntArray256[local4]];
				@Pc(23) int local23 = (this.anIntArray256[local4] << 14) + 536870912;
				if (local14 != null && local14.method568() && local14.aClass34_2.aBoolean109 == arg0 && local14.aClass34_2.method361(712)) {
					@Pc(44) int local44 = local14.anInt776 >> 7;
					@Pc(49) int local49 = local14.anInt777 >> 7;
					if (local44 >= 0 && local44 < 104 && local49 >= 0 && local49 < 104) {
						if (local14.anInt754 == 1 && (local14.anInt776 & 0x7F) == 64 && (local14.anInt777 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local44][local49] == this.anInt928) {
								continue;
							}
							this.anIntArrayArray24[local44][local49] = this.anInt928;
						}
						if (!local14.aClass34_2.aBoolean107) {
							local23 += Integer.MIN_VALUE;
						}
						this.aClass16_1.method138((local14.anInt754 - 1) * 64 + 60, local14.anInt778, this.anInt1001, local14.aBoolean175, local14.anInt776, local14, this.method715(local14.anInt777, local14.anInt776, this.anInt1001), local14.anInt777, local23);
					}
				}
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("9599, " + 599 + ", " + arg0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method622() {
		try {
			@Pc(4) int local4 = this.anInt830;
			@Pc(7) int local7 = this.anInt831;
			@Pc(10) int local10 = this.anInt832;
			@Pc(13) int local13 = this.anInt833;
			Class1_Sub2_Sub1.method535(6116423, local4, local7, local13, local10);
			Class1_Sub2_Sub1.method535(0, local4 + 1, local7 + 1, 16, local10 - 2);
			Class1_Sub2_Sub1.method536(local7 + 18, local10 - 2, local4 + 1, 0, local13 - 19);
			this.aClass1_Sub2_Sub1_Sub4_4.method547(6116423, "Choose Option", local4 + 3, local7 + 14);
			@Pc(74) int local74 = super.anInt815;
			@Pc(77) int local77 = super.anInt816;
			if (this.anInt829 == 0) {
				local74 -= 4;
				local77 -= 4;
			}
			if (this.anInt829 == 1) {
				local74 -= 553;
				local77 -= 205;
			}
			if (this.anInt829 == 2) {
				local74 -= 17;
				local77 -= 357;
			}
			for (@Pc(96) int local96 = 0; local96 < this.anInt1041; local96++) {
				@Pc(111) int local111 = local7 + (this.anInt1041 - 1 - local96) * 15 + 31;
				@Pc(113) int local113 = 16777215;
				if (local74 > local4 && local74 < local4 + local10 && local77 > local111 - 13 && local77 < local111 + 3) {
					local113 = 16776960;
				}
				this.aClass1_Sub2_Sub1_Sub4_4.method551(local113, local4 + 3, true, local111, this.aStringArray8[local96]);
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("46867, " + 0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MNKDCXXG;II)V")
	private void method623(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt1040 = 0;
			this.anInt924 = 0;
			this.method675(arg1, arg0);
			this.method598(arg0, arg1);
			this.method653(arg1, arg0);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt1040; local35++) {
				local42 = this.anIntArray271[local35];
				if (this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local42].anInt769 != anInt1045) {
					this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local42].aClass34_2 = null;
					this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local42] = null;
				}
			}
			if (arg0.anInt474 != arg1) {
				signlink.reporterror(this.aString20 + " size mismatch in getnpcpos - pos:" + arg0.anInt474 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt975; local42++) {
				if (this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[this.anIntArray256[local42]] == null) {
					signlink.reporterror(this.aString20 + " null entry in npc list - pos:" + local42 + " size:" + this.anInt975);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("72822, " + arg0 + ", " + arg1 + ", " + -12171 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method624() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt923; local3++) {
				if (local3 == -1) {
					local11 = this.anInt922;
				} else {
					local11 = this.anIntArray247[local3];
				}
				@Pc(23) Class1_Sub2_Sub2_Sub1_Sub1 local23 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt788 > 0) {
					local23.anInt788--;
					if (local23.anInt788 == 0) {
						local23.aString16 = null;
					}
				}
			}
			this.aBoolean217 &= true;
			for (local11 = 0; local11 < this.anInt975; local11++) {
				@Pc(60) int local60 = this.anIntArray256[local11];
				@Pc(65) Class1_Sub2_Sub2_Sub1_Sub2 local65 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local60];
				if (local65 != null && local65.anInt788 > 0) {
					local65.anInt788--;
					if (local65.anInt788 == 0) {
						local65.aString16 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("97288, " + true + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method625() {
		try {
			@Pc(8) int local8;
			if (this.anInt1016 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1016 > 768) {
						this.anIntArray217[local8] = this.method682(1024 - this.anInt1016, this.anIntArray219[local8], this.anIntArray218[local8]);
					} else if (this.anInt1016 > 256) {
						this.anIntArray217[local8] = this.anIntArray219[local8];
					} else {
						this.anIntArray217[local8] = this.method682(256 - this.anInt1016, this.anIntArray218[local8], this.anIntArray219[local8]);
					}
				}
			} else if (this.anInt1017 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1017 > 768) {
						this.anIntArray217[local8] = this.method682(1024 - this.anInt1017, this.anIntArray220[local8], this.anIntArray218[local8]);
					} else if (this.anInt1017 > 256) {
						this.anIntArray217[local8] = this.anIntArray220[local8];
					} else {
						this.anIntArray217[local8] = this.method682(256 - this.anInt1017, this.anIntArray218[local8], this.anIntArray220[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray217[local8] = this.anIntArray218[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass26_10.anIntArray104[local8] = this.aClass1_Sub2_Sub1_Sub2_16.anIntArray136[local8];
			}
			@Pc(181) int local181 = 0;
			@Pc(183) int local183 = 1152;
			@Pc(198) int local198;
			@Pc(202) int local202;
			@Pc(212) int local212;
			@Pc(220) int local220;
			@Pc(224) int local224;
			@Pc(228) int local228;
			@Pc(239) int local239;
			for (@Pc(185) int local185 = 1; local185 < 255; local185++) {
				local198 = this.anIntArray257[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray253[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray217[local220];
						local239 = this.aClass26_10.anIntArray104[local183];
						this.aClass26_10.anIntArray104[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass26_10.method280(super.aGraphics2, 0, 0, (byte) 1);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass26_11.anIntArray104[local198] = this.aClass1_Sub2_Sub1_Sub2_17.anIntArray136[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray257[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray253[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(371) int local371 = 256 - local228;
						local228 = this.anIntArray217[local228];
						@Pc(382) int local382 = this.aClass26_11.anIntArray104[local183];
						this.aClass26_11.anIntArray104[local183++] = ((local228 & 0xFF00FF) * local239 + (local382 & 0xFF00FF) * local371 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local382 & 0xFF00) * local371 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass26_11.method280(super.aGraphics2, 637, 0, (byte) 1);
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("29473, " + 3 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method626(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("69363, " + arg0 + ", " + 38990 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method627(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -48) {
				this.anInt951 = -1;
			}
			for (@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) this.aClass42_10.method487(); local12 != null; local12 = (Class1_Sub1) this.aClass42_10.method489()) {
				if (local12.anInt12 == -1) {
					local12.anInt1 = 0;
					this.method691(this.aByte39, local12);
				} else {
					local12.method571();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("95525, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method628() {
		try {
			if (this.anInt849 == 2) {
				this.method656((this.anInt844 - this.anInt958 << 7) + this.anInt847, this.anInt846 * 2, (this.anInt845 - this.anInt959 << 7) + this.anInt848);
				if (this.anInt931 > -1 && anInt1045 % 20 < 10) {
					this.aClass1_Sub2_Sub1_Sub2Array10[0].method392(this.anInt932 - 28, this.anInt931 - 12);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("18821, " + 42137 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BVXAXAEI;Z)V")
	private void method629(@OriginalArg(0) Class1_Sub2_Sub1_Sub1 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray215.length; local5++) {
				this.anIntArray215[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray215[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray216[local60] = (this.anIntArray215[local60 - 1] + this.anIntArray215[local60 + 1] + this.anIntArray215[local60 - 128] + this.anIntArray215[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray215;
				this.anIntArray215 = this.anIntArray216;
				this.anIntArray216 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt63; local52++) {
					for (local60 = 0; local60 < arg0.anInt62; local60++) {
						if (arg0.aByteArray1[local48++] != 0) {
							@Pc(145) int local145 = local60 + arg0.anInt64 + 16;
							@Pc(152) int local152 = local52 + arg0.anInt65 + 16;
							@Pc(158) int local158 = local145 + (local152 << 7);
							this.anIntArray215[local158] = 0;
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("47936, " + arg0 + ", " + false + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method583() {
		try {
			if (this.aClass22_Sub1_1 != null) {
				this.aClass22_Sub1_1.method466();
			}
			this.aClass22_Sub1_1 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass16_1 = null;
			this.aClass10Array1 = null;
			try {
				if (this.aClass45_1 != null) {
					this.aClass45_1.method500();
				}
			} catch (@Pc(30) Exception local30) {
			}
			this.aClass45_1 = null;
			this.aClass26_10 = null;
			this.aClass26_11 = null;
			this.aClass26_7 = null;
			this.aClass26_8 = null;
			this.aClass26_9 = null;
			this.aByteArray21 = null;
			this.aClass26_25 = null;
			this.aClass26_26 = null;
			this.aClass26_27 = null;
			this.aClass26_16 = null;
			this.aClass26_17 = null;
			this.aClass26_18 = null;
			this.aClass26_19 = null;
			this.aClass26_3 = null;
			this.aClass26_4 = null;
			this.aClass26_5 = null;
			this.aClass26_6 = null;
			this.aClass1_Sub2_Sub1_Sub1_16 = null;
			this.aClass1_Sub2_Sub1_Sub1_17 = null;
			this.aClass1_Sub2_Sub1_Sub1_18 = null;
			this.aClass1_Sub2_Sub1_Sub1_19 = null;
			this.aClass1_Sub2_Sub1_Sub1_20 = null;
			this.aClass1_Sub2_Sub1_Sub2_10 = null;
			this.aClass1_Sub2_Sub2_Sub1_Sub1Array1 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.aClass1_Sub2_Sub3Array1 = null;
			this.anIntArray271 = null;
			if (this.aClass32_1 != null) {
				this.aClass32_1.aBoolean106 = false;
			}
			this.aClass32_1 = null;
			this.aClass26_20 = null;
			this.aClass26_21 = null;
			this.aClass26_22 = null;
			this.aClass26_23 = null;
			this.aClass26_24 = null;
			this.aClass1_Sub2_Sub1_Sub1Array3 = null;
			this.aClass1_Sub2_Sub1_Sub2Array7 = null;
			this.aClass1_Sub2_Sub1_Sub1_8 = null;
			this.aClass1_Sub2_Sub1_Sub1_9 = null;
			this.aClass1_Sub2_Sub1_Sub1_10 = null;
			this.method703();
			this.aClass1_Sub2_Sub1_Sub2_9 = null;
			this.anIntArray259 = null;
			this.anIntArray260 = null;
			this.aClass1_Sub2_Sub1_Sub2Array4 = null;
			this.anIntArray264 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray265 = null;
			this.anIntArray266 = null;
			this.aClass1_Sub2_Sub3_7 = null;
			this.aClass1_Sub2_Sub3_9 = null;
			this.aClass1_Sub2_Sub3_6 = null;
			this.aClass1_Sub2_Sub3_8 = null;
			this.aClass1_Sub2_Sub2_Sub1_Sub2Array1 = null;
			this.anIntArray256 = null;
			this.aClass1_Sub2_Sub1_Sub2_11 = null;
			this.aClass1_Sub2_Sub1_Sub2_12 = null;
			this.aClass1_Sub2_Sub1_Sub2_13 = null;
			this.aClass1_Sub2_Sub1_Sub2_14 = null;
			this.aClass1_Sub2_Sub1_Sub2_15 = null;
			this.aClass1_Sub2_Sub1_Sub1_11 = null;
			this.aClass1_Sub2_Sub1_Sub1_12 = null;
			this.aClass1_Sub2_Sub1_Sub1_13 = null;
			this.aClass1_Sub2_Sub1_Sub1_14 = null;
			this.aClass1_Sub2_Sub1_Sub1_15 = null;
			this.anIntArray268 = null;
			this.aClass1_Sub2_Sub1_Sub2_3 = null;
			this.aClass1_Sub2_Sub1_Sub2Array8 = null;
			this.aClass1_Sub2_Sub1_Sub2Array9 = null;
			this.aClass1_Sub2_Sub1_Sub2Array6 = null;
			this.aClass1_Sub2_Sub1_Sub2Array10 = null;
			this.aClass1_Sub2_Sub1_Sub2Array5 = null;
			this.aClass1_Sub2_Sub1_Sub1_3 = null;
			this.aClass1_Sub2_Sub1_Sub1_4 = null;
			this.aClass1_Sub2_Sub1_Sub1_5 = null;
			this.aClass1_Sub2_Sub1_Sub1Array2 = null;
			this.anIntArray242 = null;
			this.anIntArray243 = null;
			this.anIntArray244 = null;
			this.anIntArray245 = null;
			this.aStringArray8 = null;
			this.aClass26_12 = null;
			this.aClass26_13 = null;
			this.aClass26_14 = null;
			this.aClass26_15 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray274 = null;
			this.anIntArray275 = null;
			this.aClass42ArrayArrayArray1 = null;
			this.aClass42_10 = null;
			this.anIntArrayArray24 = null;
			this.aClass42_11 = null;
			this.aClass42_12 = null;
			this.aStringArray9 = null;
			this.aLongArray3 = null;
			this.anIntArray258 = null;
			this.method677();
			Class27.method288();
			Class34.method363();
			Class38.method412();
			Class18.method180();
			Class9.aClass9Array1 = null;
			Class35.aClass35Array1 = null;
			Class14.aClass14Array1 = null;
			Class36.aClass36Array1 = null;
			Class33.aClass33Array1 = null;
			Class33.aClass30_6 = null;
			Class15.aClass15Array1 = null;
			super.aClass26_2 = null;
			Class1_Sub2_Sub2_Sub1_Sub1.aClass30_1 = null;
			Class1_Sub2_Sub1_Sub3.method433();
			Class16.method126();
			Class1_Sub2_Sub2_Sub3.method192();
			Class11.method121();
			System.gc();
		} catch (@Pc(380) RuntimeException local380) {
			signlink.reporterror("31793, " + false + ", " + local380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
	private void method630(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 >= 0) {
				this.anInt1053 = -119;
			}
			if (this.aBoolean234) {
				signlink.anInt1068 = arg2 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("36042, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method631() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub2_Sub1_Sub4_4.method545("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt1041; local9++) {
				local20 = this.aClass1_Sub2_Sub1_Sub4_4.method545(this.aStringArray8[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt1041 * 15 + 21;
			@Pc(67) int local67;
			@Pc(85) int local85;
			if (super.anInt821 > 4 && super.anInt822 > 4 && super.anInt821 < 516 && super.anInt822 < 338) {
				local67 = super.anInt821 - local7 / 2 - 4;
				if (local67 + local7 > 512) {
					local67 = 512 - local7;
				}
				if (local67 < 0) {
					local67 = 0;
				}
				local85 = super.anInt822 - 4;
				if (local85 + local20 > 334) {
					local85 = 334 - local20;
				}
				if (local85 < 0) {
					local85 = 0;
				}
				this.aBoolean218 = true;
				this.anInt829 = 0;
				this.anInt830 = local67;
				this.anInt831 = local85;
				this.anInt832 = local7;
				this.anInt833 = this.anInt1041 * 15 + 22;
			}
			if (super.anInt821 > 553 && super.anInt822 > 205 && super.anInt821 < 743 && super.anInt822 < 466) {
				local67 = super.anInt821 - local7 / 2 - 553;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 190) {
					local67 = 190 - local7;
				}
				local85 = super.anInt822 - 205;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 261) {
					local85 = 261 - local20;
				}
				this.aBoolean218 = true;
				this.anInt829 = 1;
				this.anInt830 = local67;
				this.anInt831 = local85;
				this.anInt832 = local7;
				this.anInt833 = this.anInt1041 * 15 + 22;
			}
			if (super.anInt821 > 17 && super.anInt822 > 357 && super.anInt821 < 496 && super.anInt822 < 453) {
				local67 = super.anInt821 - local7 / 2 - 17;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 479) {
					local67 = 479 - local7;
				}
				local85 = super.anInt822 - 357;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 96) {
					local85 = 96 - local20;
				}
				this.aBoolean218 = true;
				this.anInt829 = 2;
				this.anInt830 = local67;
				this.anInt831 = local85;
				this.anInt832 = local7;
				this.anInt833 = this.anInt1041 * 15 + 22;
			}
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("5637, " + 7 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method632() {
		try {
			for (@Pc(8) int local8 = -1; local8 < this.anInt923; local8++) {
				@Pc(16) int local16;
				if (local8 == -1) {
					local16 = this.anInt922;
				} else {
					local16 = this.anIntArray247[local8];
				}
				@Pc(28) Class1_Sub2_Sub2_Sub1_Sub1 local28 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local16];
				if (local28 != null) {
					this.method602(1, local28);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("92295, " + 321 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BZ)V")
	private void method633(@OriginalArg(1) boolean arg0) {
		try {
			this.method712();
			this.aClass26_9.method279();
			this.aClass1_Sub2_Sub1_Sub1_6.method51(0, 0);
			@Pc(52) byte local52;
			@Pc(64) int local64;
			if (this.anInt840 == 0) {
				this.aClass1_Sub2_Sub1_Sub4_2.method544(7711145, true, 180, 180, this.aClass22_Sub1_1.aString15);
				local52 = 80;
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16776960, true, 80, 180, "Welcome to RuneScape");
				local64 = local52 + 30;
				this.aClass1_Sub2_Sub1_Sub1_7.method51(100, 27);
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 125, 100, "New User");
				this.aClass1_Sub2_Sub1_Sub1_7.method51(100, 187);
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 125, 260, "Existing User");
			}
			if (this.anInt840 == 2) {
				local52 = 60;
				if (this.aString25.length() > 0) {
					this.aClass1_Sub2_Sub1_Sub4_4.method544(16776960, true, 45, 180, this.aString25);
					this.aClass1_Sub2_Sub1_Sub4_4.method544(16776960, true, 60, 180, this.aString26);
					local64 = local52 + 30;
				} else {
					this.aClass1_Sub2_Sub1_Sub4_4.method544(16776960, true, 53, 180, this.aString26);
					local64 = local52 + 30;
				}
				this.aClass1_Sub2_Sub1_Sub4_4.method551(16777215, 90, true, 90, "Username: " + this.aString20 + (this.anInt1057 == 0 & anInt1045 % 40 < 20 ? "@yel@|" : ""));
				local64 += 15;
				this.aClass1_Sub2_Sub1_Sub4_4.method551(16777215, 92, true, 105, "Password: " + Class40.method418(this.aString21) + (this.anInt1057 == 1 & anInt1045 % 40 < 20 ? "@yel@|" : ""));
				local64 += 15;
				if (!arg0) {
					this.aClass1_Sub2_Sub1_Sub1_7.method51(130, 27);
					this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 155, 100, "Login");
					this.aClass1_Sub2_Sub1_Sub1_7.method51(130, 187);
					this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 155, 260, "Cancel");
				}
			}
			if (this.anInt840 == 3) {
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16776960, true, 40, 180, "Create a free account");
				local52 = 65;
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 65, 180, "To create a new account you need to");
				local64 = local52 + 15;
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 80, 180, "go back to the main RuneScape webpage");
				local64 += 15;
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 95, 180, "and choose the 'create account'");
				local64 += 15;
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 110, 180, "button near the top of that page.");
				local64 += 15;
				this.aClass1_Sub2_Sub1_Sub1_7.method51(130, 107);
				this.aClass1_Sub2_Sub1_Sub4_4.method544(16777215, true, 155, 180, "Cancel");
			}
			this.aClass26_9.method280(super.aGraphics2, 202, 171, (byte) 1);
			if (this.aBoolean212) {
				this.aBoolean212 = false;
				this.aClass26_7.method280(super.aGraphics2, 128, 0, (byte) 1);
				this.aClass26_8.method280(super.aGraphics2, 202, 371, (byte) 1);
				this.aClass26_12.method280(super.aGraphics2, 0, 265, (byte) 1);
				this.aClass26_13.method280(super.aGraphics2, 562, 265, (byte) 1);
				this.aClass26_14.method280(super.aGraphics2, 128, 171, (byte) 1);
				this.aClass26_15.method280(super.aGraphics2, 562, 171, (byte) 1);
			}
		} catch (@Pc(497) RuntimeException local497) {
			signlink.reporterror("1199, " + 20 + ", " + arg0 + ", " + local497.toString());
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
				return new URL("http://127.0.0.1:" + (anInt973 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method634() {
		try {
			Class27.aClass30_4.method350();
			Class27.aClass30_5.method350();
			Class34.aClass30_7.method350();
			Class38.aClass30_8.method350();
			Class38.aClass30_9.method350();
			Class1_Sub2_Sub2_Sub1_Sub1.aClass30_1.method350();
			Class33.aClass30_6.method350();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("37746, " + 103 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;)V")
	@Override
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		try {
			this.anInt938 = arg0;
			this.aString28 = arg2;
			this.method712();
			if (this.aClass31_2 == null) {
				super.method588(arg0, (byte) 6, arg2);
			} else {
				this.aClass26_9.method279();
				this.aClass1_Sub2_Sub1_Sub4_4.method543(16777215, 54, 180, "RuneScape is loading - please wait...");
				Class1_Sub2_Sub1.method536(62, 304, 28, 9179409, 34);
				@Pc(67) boolean local67 = false;
				Class1_Sub2_Sub1.method536(63, 302, 29, 0, 32);
				Class1_Sub2_Sub1.method535(9179409, 30, 64, 30, arg0 * 3);
				Class1_Sub2_Sub1.method535(0, arg0 * 3 + 30, 64, 30, 300 - arg0 * 3);
				this.aClass1_Sub2_Sub1_Sub4_4.method543(16777215, 85, 180, arg2);
				this.aClass26_9.method280(super.aGraphics2, 202, 171, (byte) 1);
				if (this.aBoolean212) {
					this.aBoolean212 = false;
					if (!this.aBoolean223) {
						this.aClass26_10.method280(super.aGraphics2, 0, 0, (byte) 1);
						this.aClass26_11.method280(super.aGraphics2, 637, 0, (byte) 1);
					}
					this.aClass26_7.method280(super.aGraphics2, 128, 0, (byte) 1);
					this.aClass26_8.method280(super.aGraphics2, 202, 371, (byte) 1);
					this.aClass26_12.method280(super.aGraphics2, 0, 265, (byte) 1);
					this.aClass26_13.method280(super.aGraphics2, 562, 265, (byte) 1);
					this.aClass26_14.method280(super.aGraphics2, 128, 171, (byte) 1);
					this.aClass26_15.method280(super.aGraphics2, 562, 171, (byte) 1);
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("99655, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method635(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CQCDOTXO;ILclient!MNKDCXXG;I)V")
	private void method636(@OriginalArg(1) Class1_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub3 arg2, @OriginalArg(4) int arg3) {
		try {
			if ((arg1 & 0x4) != 0) {
				arg0.anInt762 = arg2.method335();
				if (arg0.anInt762 == 65535) {
					arg0.anInt762 = -1;
				}
			}
			@Pc(32) int local32;
			if ((arg1 & 0x40) != 0) {
				local32 = arg2.method326(this.anInt853);
				@Pc(35) byte[] local35 = new byte[local32];
				@Pc(41) Class1_Sub2_Sub3 local41 = new Class1_Sub2_Sub3(local35, -670);
				arg2.method345(local35, this.anInt1053, local32);
				this.aClass1_Sub2_Sub3Array1[arg3] = local41;
				arg0.method82(local41);
			}
			if ((arg1 & 0x20) != 0) {
				arg0.anInt770 = arg2.method309();
				arg0.anInt771 = arg2.method309();
			}
			@Pc(81) int local81;
			if ((arg1 & 0x8) != 0) {
				local32 = arg2.method307();
				local81 = arg2.method326(this.anInt853);
				arg0.method567(anInt1045, local81, local32);
				arg0.anInt773 = anInt1045 + 300;
				arg0.anInt774 = arg2.method328();
				arg0.anInt775 = arg2.method326(this.anInt853);
			}
			if ((arg1 & 0x100) != 0) {
				arg0.anInt780 = arg2.method309();
				local32 = arg2.method344();
				arg0.anInt784 = local32 >> 16;
				arg0.anInt783 = anInt1045 + (local32 & 0xFFFF);
				arg0.anInt781 = 0;
				arg0.anInt782 = 0;
				if (arg0.anInt783 > anInt1045) {
					arg0.anInt781 = -1;
				}
				if (arg0.anInt780 == 65535) {
					arg0.anInt780 = -1;
				}
			}
			@Pc(175) int local175;
			if ((arg1 & 0x10) != 0) {
				local32 = arg2.method335();
				if (local32 == 65535) {
					local32 = -1;
				}
				local81 = arg2.method307();
				if (local32 == arg0.anInt764 && local32 != -1) {
					local175 = Class36.aClass36Array1[local32].anInt540;
					if (local175 == 1) {
						arg0.anInt765 = 0;
						arg0.anInt766 = 0;
						arg0.anInt767 = local81;
						arg0.anInt768 = 0;
					}
					if (local175 == 2) {
						arg0.anInt768 = 0;
					}
				} else if (local32 == -1 || arg0.anInt764 == -1 || Class36.aClass36Array1[local32].anInt534 >= Class36.aClass36Array1[arg0.anInt764].anInt534) {
					arg0.anInt764 = local32;
					arg0.anInt765 = 0;
					arg0.anInt766 = 0;
					arg0.anInt767 = local81;
					arg0.anInt768 = 0;
					arg0.anInt763 = arg0.anInt785;
				}
			}
			if ((arg1 & 0x2) != 0) {
				local32 = arg2.method335();
				local81 = arg2.method327();
				local175 = arg2.method327();
				@Pc(253) int local253 = arg2.anInt474;
				if (arg0.aString3 != null && arg0.aBoolean26) {
					@Pc(263) long local263 = Class40.method413(arg0.aString3);
					@Pc(265) boolean local265 = false;
					if (local81 <= 1) {
						for (@Pc(270) int local270 = 0; local270 < this.anInt947; local270++) {
							if (this.aLongArray4[local270] == local263) {
								local265 = true;
								break;
							}
						}
					}
					if (!local265 && this.anInt930 == 0) {
						try {
							this.aClass1_Sub2_Sub3_7.anInt474 = 0;
							arg2.method345(this.aClass1_Sub2_Sub3_7.aByteArray10, this.anInt1053, local175);
							this.aClass1_Sub2_Sub3_7.anInt474 = 0;
							@Pc(316) String local316 = Class49.method558(local175, this.aClass1_Sub2_Sub3_7);
							@Pc(321) String local321 = Class24.method247(this.anInt885, local316);
							arg0.aString16 = local321;
							arg0.anInt743 = local32 >> 8;
							arg0.anInt755 = local32 & 0xFF;
							arg0.anInt788 = 150;
							if (local81 == 2 || local81 == 3) {
								this.method683(local321, 1, "@cr2@" + arg0.aString3);
							} else if (local81 == 1) {
								this.method683(local321, 1, "@cr1@" + arg0.aString3);
							} else {
								this.method683(local321, 2, arg0.aString3);
							}
						} catch (@Pc(385) Exception local385) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt474 = local253 + local175;
			}
			if ((arg1 & 0x200) != 0) {
				arg0.anInt747 = arg2.method326(this.anInt853);
				arg0.anInt749 = arg2.method326(this.anInt853);
				arg0.anInt748 = arg2.method307();
				arg0.anInt750 = arg2.method326(this.anInt853);
				arg0.anInt751 = arg2.method336() + anInt1045;
				arg0.anInt752 = arg2.method336() + anInt1045;
				arg0.anInt753 = arg2.method326(this.anInt853);
				arg0.method565();
			}
			if ((arg1 & 0x80) != 0) {
				arg0.aString16 = arg2.method314();
				if (arg0.aString16.charAt(0) == '~') {
					arg0.aString16 = arg0.aString16.substring(1);
					this.method683(arg0.aString16, 2, arg0.aString3);
				} else if (arg0 == aClass1_Sub2_Sub2_Sub1_Sub1_1) {
					this.method683(arg0.aString16, 2, arg0.aString3);
				}
				arg0.anInt743 = 0;
				arg0.anInt755 = 0;
				arg0.anInt788 = 150;
			}
			if ((arg1 & 0x400) != 0) {
				local32 = arg2.method328();
				local81 = arg2.method307();
				arg0.method567(anInt1045, local81, local32);
				arg0.anInt773 = anInt1045 + 300;
				arg0.anInt774 = arg2.method328();
				arg0.anInt775 = arg2.method327();
			}
		} catch (@Pc(526) RuntimeException local526) {
			signlink.reporterror("48727, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local526.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method637(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0 != this.anInt964) {
				this.aClass42ArrayArrayArray1 = null;
			}
			if (arg1 != 0L) {
				for (@Pc(15) int local15 = 0; local15 < this.anInt875; local15++) {
					if (this.aLongArray3[local15] == arg1) {
						this.anInt875--;
						this.aBoolean202 = true;
						for (@Pc(35) int local35 = local15; local35 < this.anInt875; local35++) {
							this.aStringArray9[local35] = this.aStringArray9[local35 + 1];
							this.anIntArray258[local35] = this.anIntArray258[local35 + 1];
							this.aLongArray3[local35] = this.aLongArray3[local35 + 1];
						}
						this.aClass1_Sub2_Sub3_9.method296(230, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method303(arg1, this.anInt907);
						return;
					}
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("83874, " + arg0 + ", " + arg1 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean189 || this.aBoolean231 || this.aBoolean201) {
				this.method697();
			} else {
				anInt835++;
				if (this.aBoolean217) {
					this.method608();
				} else {
					this.method633(false);
				}
				this.anInt874 = 0;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("45271, " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method638(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt875 >= 100 && this.anInt1054 != 1) {
					this.method683("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else if (this.anInt875 >= 200) {
					this.method683("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else {
					@Pc(38) String local38 = Class40.method417(Class40.method414(arg0));
					for (@Pc(44) int local44 = 0; local44 < this.anInt875; local44++) {
						if (this.aLongArray3[local44] == arg0) {
							this.method683(local38 + " is already on your friend list", 0, "");
							return;
						}
					}
					for (@Pc(74) int local74 = 0; local74 < this.anInt947; local74++) {
						if (this.aLongArray4[local74] == arg0) {
							this.method683("Please remove " + local38 + " from your ignore list first", 0, "");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub2_Sub2_Sub1_Sub1_1.aString3)) {
						this.aStringArray9[this.anInt875] = local38;
						this.aLongArray3[this.anInt875] = arg0;
						this.anIntArray258[this.anInt875] = 0;
						this.anInt875++;
						this.aBoolean202 = true;
						this.aClass1_Sub2_Sub3_9.method296(40, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method303(arg0, this.anInt907);
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("68939, " + false + ", " + arg0 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method639() {
		try {
			this.method707();
			if (this.anInt895 == 1) {
				this.aClass1_Sub2_Sub1_Sub2Array5[this.anInt894 / 100].method392(this.anInt893 - 8 - 4, this.anInt892 - 8 - 4);
			}
			if (this.anInt895 == 2) {
				this.aClass1_Sub2_Sub1_Sub2Array5[this.anInt894 / 100 + 4].method392(this.anInt893 - 8 - 4, this.anInt892 - 8 - 4);
			}
			if (this.anInt897 != -1) {
				this.method716(this.anInt934, this.anInt897);
				this.method667(0, Class18.method187(this.anInt897), 0, 0);
			}
			if (this.anInt1056 != -1) {
				this.method716(this.anInt934, this.anInt1056);
				this.method667(0, Class18.method187(this.anInt1056), 0, 0);
			}
			this.method659();
			if (!this.aBoolean218) {
				this.method690((byte) 4);
				this.method662(this.aByte48);
			} else if (this.anInt829 == 0) {
				this.method622();
			}
			if (this.anInt836 == 1) {
				this.aClass1_Sub2_Sub1_Sub2_10.method392(296, 472);
			}
			@Pc(171) int local171;
			if (aBoolean204) {
				@Pc(137) byte local137 = 20;
				@Pc(139) int local139 = 16776960;
				if (super.anInt810 < 30 && aBoolean215) {
					local139 = 16711680;
				}
				if (super.anInt810 < 20 && !aBoolean215) {
					local139 = 16711680;
				}
				this.aClass1_Sub2_Sub1_Sub4_3.method542(20, "Fps:" + super.anInt810, local139);
				local171 = local137 + 15;
				@Pc(173) Runtime local173 = Runtime.getRuntime();
				@Pc(182) int local182 = (int) ((local173.totalMemory() - local173.freeMemory()) / 1024L);
				if (local182 > 33554432 && aBoolean215) {
				}
				if (local182 > 67108864 && !aBoolean215) {
				}
				this.aClass1_Sub2_Sub1_Sub4_3.method542(35, "Mem:" + local182 + "k", 16776960);
				local171 += 15;
			}
			if (this.anInt898 != 0) {
				@Pc(223) int local223 = this.anInt898 / 50;
				local171 = local223 / 60;
				@Pc(231) int local231 = local223 % 60;
				if (local231 < 10) {
					this.aClass1_Sub2_Sub1_Sub4_3.method547(16776960, "System update in: " + local171 + ":0" + local231, 4, 329);
				} else {
					this.aClass1_Sub2_Sub1_Sub4_3.method547(16776960, "System update in: " + local171 + ":" + local231, 4, 329);
				}
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("78025, " + true + ", " + local273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method640(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt947 >= 100) {
					this.method683("Your ignore list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(30) String local30 = Class40.method417(Class40.method414(arg0));
					for (@Pc(32) int local32 = 0; local32 < this.anInt947; local32++) {
						if (this.aLongArray4[local32] == arg0) {
							this.method683(local30 + " is already on your ignore list", 0, "");
							return;
						}
					}
					for (@Pc(62) int local62 = 0; local62 < this.anInt875; local62++) {
						if (this.aLongArray3[local62] == arg0) {
							this.method683("Please remove " + local30 + " from your friend list first", 0, "");
							return;
						}
					}
					this.aLongArray4[this.anInt947++] = arg0;
					this.aBoolean202 = true;
					this.aClass1_Sub2_Sub3_9.method296(226, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method303(arg0, this.anInt907);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("87773, " + true + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZI)V")
	private void method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub1 local1 = null;
			for (@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) this.aClass42_10.method487(); local6 != null; local6 = (Class1_Sub1) this.aClass42_10.method489()) {
				if (local6.anInt2 == arg7 && local6.anInt4 == arg4 && local6.anInt5 == arg1 && local6.anInt3 == arg8) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub1();
				local1.anInt2 = arg7;
				local1.anInt3 = arg8;
				local1.anInt4 = arg4;
				local1.anInt5 = arg1;
				this.method691(this.aByte39, local1);
				this.aClass42_10.method484(local1);
			}
			local1.anInt6 = arg5;
			local1.anInt8 = arg2;
			local1.anInt7 = arg0;
			local1.anInt1 = arg6;
			local1.anInt12 = arg3;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("3048, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZII)V")
	private void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass1_Sub2_Sub1_Sub1_1.method51(arg5, arg1);
			this.aClass1_Sub2_Sub1_Sub1_2.method51(arg5 + arg2 - 16, arg1);
			Class1_Sub2_Sub1.method535(this.anInt871, arg1, arg5 + 16, arg2 - 32, 16);
			@Pc(35) int local35 = (arg2 - 32) * arg2 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg2 - local35 - 32) * arg4 / (arg0 - arg2);
			Class1_Sub2_Sub1.method535(this.anInt868, arg1, arg5 + local52 + 16, local35, 16);
			Class1_Sub2_Sub1.method540(this.anInt889, this.aByte43, arg1, local35, arg5 + local52 + 16);
			if (arg3) {
				this.anInt951 = -1;
			}
			Class1_Sub2_Sub1.method540(this.anInt889, this.aByte43, arg1 + 1, local35, arg5 + local52 + 16);
			Class1_Sub2_Sub1.method538(arg1, this.anInt889, 16, arg5 + local52 + 16);
			Class1_Sub2_Sub1.method538(arg1, this.anInt889, 16, arg5 + local52 + 17);
			Class1_Sub2_Sub1.method540(this.anInt903, this.aByte43, arg1 + 15, local35, arg5 + local52 + 16);
			Class1_Sub2_Sub1.method540(this.anInt903, this.aByte43, arg1 + 14, local35 - 1, arg5 + local52 + 17);
			Class1_Sub2_Sub1.method538(arg1, this.anInt903, 16, arg5 + local52 + local35 + 15);
			Class1_Sub2_Sub1.method538(arg1 + 1, this.anInt903, 15, arg5 + local52 + local35 + 14);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("32270, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MNKDCXXG;BI)V")
	private void method643(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13;
			@Pc(34) int local34;
			@Pc(39) int local39;
			@Pc(42) int local42;
			@Pc(45) int local45;
			@Pc(50) int local50;
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(22) int local22;
			@Pc(29) int local29;
			@Pc(55) int local55;
			@Pc(61) int local61;
			if (arg1 == 239) {
				local13 = arg0.method307();
				local22 = this.anInt991 + (local13 >> 4 & 0x7);
				local29 = this.anInt992 + (local13 & 0x7);
				local34 = local22 + arg0.method308();
				local39 = local29 + arg0.method308();
				local42 = arg0.method310();
				local45 = arg0.method309();
				local50 = arg0.method307() * 4;
				local55 = arg0.method307() * 4;
				local58 = arg0.method309();
				local61 = arg0.method309();
				local64 = arg0.method307();
				local67 = arg0.method307();
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local34 >= 0 && local39 >= 0 && local34 < 104 && local39 < 104 && local45 != 65535) {
					local22 = local22 * 128 + 64;
					local29 = local29 * 128 + 64;
					local34 = local34 * 128 + 64;
					local39 = local39 * 128 + 64;
					@Pc(143) Class1_Sub2_Sub2_Sub5 local143 = new Class1_Sub2_Sub2_Sub5(this.anInt1001, local61 + anInt1045, this.method715(local29, local22, this.anInt1001) - local50, local22, local67, local64, local55, local29, local58 + anInt1045, -33265, local42, local45);
					local143.method482(local39, local34, local58 + anInt1045, this.method715(local39, local34, this.anInt1001) - local55);
					this.aClass42_11.method484(local143);
				}
			} else if (arg1 == 197) {
				local13 = arg0.method336();
				local22 = arg0.method326(this.anInt853);
				local29 = local22 >> 2;
				local34 = local22 & 0x3;
				local39 = this.anIntArray240[local29];
				local42 = arg0.method328();
				local45 = this.anInt991 + (local42 >> 4 & 0x7);
				local50 = this.anInt992 + (local42 & 0x7);
				if (local45 >= 0 && local50 >= 0 && local45 < 104 && local50 < 104) {
					this.method641(local34, local50, local29, -1, local45, local13, 0, this.anInt1001, local39);
				}
			} else if (arg1 == 109) {
				local13 = arg0.method307();
				local22 = this.anInt991 + (local13 >> 4 & 0x7);
				local29 = this.anInt992 + (local13 & 0x7);
				local34 = arg0.method309();
				local39 = arg0.method307();
				local42 = arg0.method309();
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
					local22 = local22 * 128 + 64;
					local29 = local29 * 128 + 64;
					@Pc(308) Class1_Sub2_Sub2_Sub4 local308 = new Class1_Sub2_Sub2_Sub4(local34, local29, local22, this.method715(local29, local22, this.anInt1001) - local39, anInt1045, this.anInt1001, false, local42);
					this.aClass42_12.method484(local308);
				}
			} else {
				@Pc(380) int local380;
				if (arg1 == 49) {
					local13 = arg0.method309();
					@Pc(323) byte local323 = arg0.method329();
					@Pc(327) byte local327 = arg0.method330((byte) 4);
					local34 = arg0.method328();
					local39 = local34 >> 2;
					local42 = local34 & 0x3;
					local45 = this.anIntArray240[local39];
					local50 = arg0.method334();
					@Pc(352) byte local352 = arg0.method330((byte) 4);
					local58 = arg0.method334();
					@Pc(359) byte local359 = arg0.method308();
					local64 = arg0.method326(this.anInt853);
					local67 = this.anInt991 + (local64 >> 4 & 0x7);
					local380 = this.anInt992 + (local64 & 0x7);
					@Pc(384) int local384 = arg0.method335();
					@Pc(390) Class1_Sub2_Sub2_Sub1_Sub1 local390;
					if (local13 == this.anInt965) {
						local390 = aClass1_Sub2_Sub2_Sub1_Sub1_1;
					} else {
						local390 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local13];
					}
					if (local390 != null) {
						@Pc(402) Class27 local402 = Class27.method282(local384);
						@Pc(412) int local412 = this.anIntArrayArrayArray8[this.anInt1001][local67][local380];
						@Pc(424) int local424 = this.anIntArrayArrayArray8[this.anInt1001][local67 + 1][local380];
						@Pc(438) int local438 = this.anIntArrayArrayArray8[this.anInt1001][local67 + 1][local380 + 1];
						@Pc(450) int local450 = this.anIntArrayArrayArray8[this.anInt1001][local67][local380 + 1];
						@Pc(460) Class1_Sub2_Sub2_Sub3 local460 = local402.method284(local39, local42, local412, local424, local438, local450, -1);
						if (local460 != null) {
							this.method641(0, local380, 0, local50 + 1, local67, -1, local58 + 1, this.anInt1001, local45);
							local390.anInt187 = local58 + anInt1045;
							local390.anInt188 = local50 + anInt1045;
							local390.aClass1_Sub2_Sub2_Sub3_1 = local460;
							@Pc(495) int local495 = local402.anInt447;
							@Pc(498) int local498 = local402.anInt450;
							if (local42 == 1 || local42 == 3) {
								local495 = local402.anInt450;
								local498 = local402.anInt447;
							}
							local390.anInt182 = local67 * 128 + local495 * 64;
							local390.anInt184 = local380 * 128 + local498 * 64;
							local390.anInt183 = this.method715(local390.anInt184, local390.anInt182, this.anInt1001);
							@Pc(544) byte local544;
							if (local327 > local323) {
								local544 = local327;
								local327 = local323;
								local323 = local544;
							}
							if (local352 > local359) {
								local544 = local352;
								local352 = local359;
								local359 = local544;
							}
							local390.anInt172 = local67 + local327;
							local390.anInt174 = local67 + local323;
							local390.anInt173 = local380 + local352;
							local390.anInt175 = local380 + local359;
						}
					}
				}
				if (arg1 == 150) {
					local13 = arg0.method309();
					local22 = arg0.method326(this.anInt853);
					local29 = this.anInt991 + (local22 >> 4 & 0x7);
					local34 = this.anInt992 + (local22 & 0x7);
					local39 = arg0.method336();
					local42 = arg0.method334();
					if (local29 >= 0 && local34 >= 0 && local29 < 104 && local34 < 104 && local39 != this.anInt965) {
						@Pc(630) Class1_Sub2_Sub2_Sub2 local630 = new Class1_Sub2_Sub2_Sub2();
						local630.anInt224 = local13;
						local630.anInt223 = local42;
						if (this.aClass42ArrayArrayArray1[this.anInt1001][local29][local34] == null) {
							this.aClass42ArrayArrayArray1[this.anInt1001][local29][local34] = new Class42(-270);
						}
						this.aClass42ArrayArrayArray1[this.anInt1001][local29][local34].method484(local630);
						this.method619(local29, local34);
					}
				} else if (arg1 == 188) {
					local13 = arg0.method307();
					local22 = this.anInt991 + (local13 >> 4 & 0x7);
					local29 = this.anInt992 + (local13 & 0x7);
					local34 = arg0.method309();
					local39 = arg0.method309();
					local42 = arg0.method309();
					if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
						@Pc(726) Class42 local726 = this.aClass42ArrayArrayArray1[this.anInt1001][local22][local29];
						if (local726 != null) {
							for (@Pc(732) Class1_Sub2_Sub2_Sub2 local732 = (Class1_Sub2_Sub2_Sub2) local726.method487(); local732 != null; local732 = (Class1_Sub2_Sub2_Sub2) local726.method489()) {
								if (local732.anInt224 == (local34 & 0x7FFF) && local732.anInt223 == local39) {
									local732.anInt223 = local42;
									break;
								}
							}
							this.method619(local22, local29);
						}
					}
				} else {
					@Pc(806) Class1_Sub2_Sub2_Sub2 local806;
					if (arg1 == 127) {
						local13 = arg0.method328();
						local22 = this.anInt991 + (local13 >> 4 & 0x7);
						local29 = this.anInt992 + (local13 & 0x7);
						local34 = arg0.method335();
						local39 = arg0.method336();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local806 = new Class1_Sub2_Sub2_Sub2();
							local806.anInt224 = local34;
							local806.anInt223 = local39;
							if (this.aClass42ArrayArrayArray1[this.anInt1001][local22][local29] == null) {
								this.aClass42ArrayArrayArray1[this.anInt1001][local22][local29] = new Class42(-270);
							}
							this.aClass42ArrayArrayArray1[this.anInt1001][local22][local29].method484(local806);
							this.method619(local22, local29);
						}
					} else if (arg1 == 27) {
						local13 = arg0.method327();
						local22 = this.anInt991 + (local13 >> 4 & 0x7);
						local29 = this.anInt992 + (local13 & 0x7);
						local34 = arg0.method336();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							@Pc(898) Class42 local898 = this.aClass42ArrayArrayArray1[this.anInt1001][local22][local29];
							if (local898 != null) {
								for (local806 = (Class1_Sub2_Sub2_Sub2) local898.method487(); local806 != null; local806 = (Class1_Sub2_Sub2_Sub2) local898.method489()) {
									if (local806.anInt224 == (local34 & 0x7FFF)) {
										local806.method571();
										break;
									}
								}
								if (local898.method487() == null) {
									this.aClass42ArrayArrayArray1[this.anInt1001][local22][local29] = null;
								}
								this.method619(local22, local29);
							}
						}
					} else if (arg1 == 113) {
						local13 = arg0.method327();
						local22 = local13 >> 2;
						local29 = local13 & 0x3;
						local34 = this.anIntArray240[local22];
						local39 = arg0.method307();
						local42 = this.anInt991 + (local39 >> 4 & 0x7);
						local45 = this.anInt992 + (local39 & 0x7);
						if (local42 >= 0 && local45 >= 0 && local42 < 104 && local45 < 104) {
							this.method641(local29, local45, local22, -1, local42, -1, 0, this.anInt1001, local34);
						}
					} else {
						if (arg1 == 128) {
							local13 = arg0.method307();
							local22 = this.anInt991 + (local13 >> 4 & 0x7);
							local29 = this.anInt992 + (local13 & 0x7);
							local34 = arg0.method309();
							local39 = arg0.method307();
							local42 = local39 >> 4 & 0xF;
							local45 = local39 & 0x7;
							if (aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0] >= local22 - local42 && aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0] <= local22 + local42 && aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0] >= local29 - local42 && aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0] <= local29 + local42 && this.aBoolean227 && !aBoolean215 && this.anInt980 < 50) {
								this.anIntArray249[this.anInt980] = local34;
								this.anIntArray269[this.anInt980] = local45;
								this.anIntArray251[this.anInt980] = Class3.anIntArray20[local34];
								this.anInt980++;
							}
						}
						if (arg1 == 205) {
							local13 = arg0.method327();
							local22 = local13 >> 2;
							local29 = local13 & 0x3;
							local34 = this.anIntArray240[local22];
							local39 = arg0.method335();
							local42 = arg0.method326(this.anInt853);
							local45 = this.anInt991 + (local42 >> 4 & 0x7);
							local50 = this.anInt992 + (local42 & 0x7);
							if (local45 >= 0 && local50 >= 0 && local45 < 103 && local50 < 103) {
								local55 = this.anIntArrayArrayArray8[this.anInt1001][local45][local50];
								local58 = this.anIntArrayArrayArray8[this.anInt1001][local45 + 1][local50];
								local61 = this.anIntArrayArrayArray8[this.anInt1001][local45 + 1][local50 + 1];
								local64 = this.anIntArrayArrayArray8[this.anInt1001][local45][local50 + 1];
								if (local34 == 0) {
									@Pc(1223) Class23 local1223 = this.aClass16_1.method149(local45, local50, this.anInt1001);
									if (local1223 != null) {
										local380 = local1223.anInt421 >> 14 & 0x7FFF;
										if (local22 == 2) {
											local1223.aClass1_Sub2_Sub2_5 = new Class1_Sub2_Sub2_Sub6(2, local58, local39, local29 + 4, (byte) 116, local55, local61, local380, local64, false);
											local1223.aClass1_Sub2_Sub2_6 = new Class1_Sub2_Sub2_Sub6(2, local58, local39, local29 + 1 & 0x3, (byte) 116, local55, local61, local380, local64, false);
										} else {
											local1223.aClass1_Sub2_Sub2_5 = new Class1_Sub2_Sub2_Sub6(local22, local58, local39, local29, (byte) 116, local55, local61, local380, local64, false);
										}
									}
								}
								if (local34 == 1) {
									@Pc(1300) Class39 local1300 = this.aClass16_1.method150(local50, this.anInt1001, local45);
									if (local1300 != null) {
										local1300.aClass1_Sub2_Sub2_8 = new Class1_Sub2_Sub2_Sub6(4, local58, local39, 0, (byte) 116, local55, local61, local1300.anInt606 >> 14 & 0x7FFF, local64, false);
									}
								}
								if (local34 == 2) {
									@Pc(1334) Class13 local1334 = this.aClass16_1.method151(this.anInt1001, local45, local50, 67);
									if (local22 == 11) {
										local22 = 10;
									}
									if (local1334 != null) {
										local1334.aClass1_Sub2_Sub2_1 = new Class1_Sub2_Sub2_Sub6(local22, local58, local39, local29, (byte) 116, local55, local61, local1334.anInt267 >> 14 & 0x7FFF, local64, false);
									}
								}
								if (local34 == 3) {
									@Pc(1373) Class28 local1373 = this.aClass16_1.method152(this.anInt1001, local50, local45);
									if (local1373 != null) {
										local1373.aClass1_Sub2_Sub2_7 = new Class1_Sub2_Sub2_Sub6(22, local58, local39, local29, (byte) 116, local55, local61, local1373.anInt482 >> 14 & 0x7FFF, local64, false);
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1397) RuntimeException local1397) {
			signlink.reporterror("26576, " + arg0 + ", " + -77 + ", " + arg1 + ", " + local1397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method644() {
		try {
			if (this.anInt998 == 0) {
				@Pc(14) int local14 = super.anInt820;
				if (this.anInt977 == 1 && super.anInt821 >= 516 && super.anInt822 >= 160 && super.anInt821 <= 765 && super.anInt822 <= 205) {
					local14 = 0;
				}
				@Pc(45) int local45;
				@Pc(48) int local48;
				@Pc(124) int local124;
				if (this.aBoolean218) {
					if (local14 != 1) {
						local45 = super.anInt815;
						local48 = super.anInt816;
						if (this.anInt829 == 0) {
							local45 -= 4;
							local48 -= 4;
						}
						if (this.anInt829 == 1) {
							local45 -= 553;
							local48 -= 205;
						}
						if (this.anInt829 == 2) {
							local45 -= 17;
							local48 -= 357;
						}
						if (local45 < this.anInt830 - 10 || local45 > this.anInt830 + this.anInt832 + 10 || local48 < this.anInt831 - 10 || local48 > this.anInt831 + this.anInt833 + 10) {
							this.aBoolean218 = false;
							if (this.anInt829 == 1) {
								this.aBoolean202 = true;
							}
							if (this.anInt829 == 2) {
								this.aBoolean209 = true;
							}
						}
					}
					if (local14 == 1) {
						local45 = this.anInt830;
						local48 = this.anInt831;
						local124 = this.anInt832;
						@Pc(127) int local127 = super.anInt821;
						@Pc(130) int local130 = super.anInt822;
						if (this.anInt829 == 0) {
							local127 -= 4;
							local130 -= 4;
						}
						if (this.anInt829 == 1) {
							local127 -= 553;
							local130 -= 205;
						}
						if (this.anInt829 == 2) {
							local127 -= 17;
							local130 -= 357;
						}
						@Pc(149) int local149 = -1;
						for (@Pc(151) int local151 = 0; local151 < this.anInt1041; local151++) {
							@Pc(166) int local166 = local48 + (this.anInt1041 - 1 - local151) * 15 + 31;
							if (local127 > local45 && local127 < local45 + local124 && local130 > local166 - 13 && local130 < local166 + 3) {
								local149 = local151;
							}
						}
						if (local149 != -1) {
							this.method710(local149);
						}
						this.aBoolean218 = false;
						if (this.anInt829 == 1) {
							this.aBoolean202 = true;
						}
						if (this.anInt829 == 2) {
							this.aBoolean209 = true;
							return;
						}
					}
				} else {
					if (local14 == 1 && this.anInt1041 > 0) {
						local45 = this.anIntArray244[this.anInt1041 - 1];
						if (local45 == 627 || local45 == 734 || local45 == 304 || local45 == 974 || local45 == 380 || local45 == 524 || local45 == 239 || local45 == 518 || local45 == 459 || local45 == 257 || local45 == 108 || local45 == 1194) {
							local48 = this.anIntArray242[this.anInt1041 - 1];
							local124 = this.anIntArray243[this.anInt1041 - 1];
							@Pc(285) Class18 local285 = Class18.method187(local124);
							if (local285.aBoolean57 || local285.aBoolean55) {
								this.aBoolean205 = false;
								this.anInt872 = 0;
								this.anInt996 = local124;
								this.anInt997 = local48;
								this.anInt998 = 2;
								this.anInt999 = super.anInt821;
								this.anInt1000 = super.anInt822;
								if (Class18.method187(local124).anInt356 == this.anInt1056) {
									this.anInt998 = 1;
								}
								if (Class18.method187(local124).anInt356 == this.anInt956) {
									this.anInt998 = 3;
								}
								return;
							}
						}
					}
					if (local14 == 1 && (this.anInt905 == 1 || this.method706(70, this.anInt1041 - 1)) && this.anInt1041 > 2) {
						local14 = 2;
					}
					if (local14 == 1 && this.anInt1041 > 0) {
						this.method710(this.anInt1041 - 1);
					}
					if (local14 != 2 || this.anInt1041 <= 0) {
						return;
					}
					this.method631();
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("82757, " + false + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method645(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray261[8] = 0;
			@Pc(13) boolean local13 = false;
			@Pc(23) int local23 = 0;
			while (this.anIntArray261[8] == 0) {
				@Pc(27) String local27 = "Unknown problem";
				this.method588(20, (byte) 6, "Connecting to web server");
				try {
					@Pc(49) DataInputStream local49 = this.method717("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 368);
					@Pc(56) Class1_Sub2_Sub3 local56 = new Class1_Sub2_Sub3(new byte[40], -670);
					local49.readFully(local56.aByteArray10, 0, 40);
					local49.close();
					for (@Pc(66) int local66 = 0; local66 < 9; local66++) {
						this.anIntArray261[local66] = local56.method312();
					}
					@Pc(81) int local81 = local56.method312();
					@Pc(83) int local83 = 1234;
					for (@Pc(85) int local85 = 0; local85 < 9; local85++) {
						local83 = (local83 << 1) + this.anIntArray261[local85];
					}
					if (local81 != local83) {
						local27 = "checksum problem";
						this.anIntArray261[8] = 0;
					}
				} catch (@Pc(112) EOFException local112) {
					local27 = "EOF problem";
					this.anIntArray261[8] = 0;
				} catch (@Pc(121) IOException local121) {
					local27 = "connection problem";
					this.anIntArray261[8] = 0;
				} catch (@Pc(130) Exception local130) {
					local27 = "logic problem";
					this.anIntArray261[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray261[8] == 0) {
					local23++;
					for (@Pc(148) int local148 = local3; local148 > 0; local148--) {
						if (local23 >= 10) {
							this.method588(10, (byte) 6, "Game updated - please reload page");
							local148 = 10;
						} else {
							this.method588(10, (byte) 6, local27 + " - Will retry in " + local148 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(182) Exception local182) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean213 = !this.aBoolean213;
				}
			}
		} catch (@Pc(210) RuntimeException local210) {
			signlink.reporterror("65695, " + arg0 + ", " + local210.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method646(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString25 = "";
				this.aString26 = "Connecting to server...";
				this.method633(true);
			}
			this.aClass45_1 = new Class45(this.method591(anInt973 + 43594), this, true);
			@Pc(30) long local30 = Class40.method413(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub2_Sub3_9.anInt474 = 0;
			this.aClass1_Sub2_Sub3_9.method297(14);
			this.aClass1_Sub2_Sub3_9.method297(local37);
			this.aClass45_1.method504(this.aClass1_Sub2_Sub3_9.aByteArray10, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass45_1.method501();
			}
			@Pc(74) int local74 = this.aClass45_1.method501();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass45_1.method503(this.aClass1_Sub2_Sub3_8.aByteArray10, 0, 8);
				this.aClass1_Sub2_Sub3_8.anInt474 = 0;
				this.aLong33 = this.aClass1_Sub2_Sub3_8.method313();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong33 >> 32), (int) this.aLong33 };
				this.aClass1_Sub2_Sub3_9.anInt474 = 0;
				this.aClass1_Sub2_Sub3_9.method297(10);
				this.aClass1_Sub2_Sub3_9.method301(local99[0]);
				this.aClass1_Sub2_Sub3_9.method301(local99[1]);
				this.aClass1_Sub2_Sub3_9.method301(local99[2]);
				this.aClass1_Sub2_Sub3_9.method301(local99[3]);
				this.aClass1_Sub2_Sub3_9.method301(signlink.anInt1062);
				this.aClass1_Sub2_Sub3_9.method304(arg0);
				this.aClass1_Sub2_Sub3_9.method304(arg1);
				this.aClass1_Sub2_Sub3_9.method322(aBigInteger1, aBigInteger2);
				this.aClass1_Sub2_Sub3_6.anInt474 = 0;
				if (arg2) {
					this.aClass1_Sub2_Sub3_6.method297(18);
				} else {
					this.aClass1_Sub2_Sub3_6.method297(16);
				}
				this.aClass1_Sub2_Sub3_6.method297(this.aClass1_Sub2_Sub3_9.anInt474 + 36 + 1 + 1 + 2);
				this.aClass1_Sub2_Sub3_6.method297(255);
				this.aClass1_Sub2_Sub3_6.method298(368);
				this.aClass1_Sub2_Sub3_6.method297(aBoolean215 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub2_Sub3_6.method301(this.anIntArray261[local225]);
				}
				this.aClass1_Sub2_Sub3_6.method305(this.aClass1_Sub2_Sub3_9.anInt474, this.aClass1_Sub2_Sub3_9.aByteArray10);
				this.aClass1_Sub2_Sub3_9.aClass41_1 = new Class41(false, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass41_2 = new Class41(false, local99);
				this.aClass45_1.method504(this.aClass1_Sub2_Sub3_6.aByteArray10, this.aClass1_Sub2_Sub3_6.anInt474);
				local74 = this.aClass45_1.method501();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method646(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt856 = this.aClass45_1.method501();
					aBoolean219 = this.aClass45_1.method501() == 1;
					this.aLong31 = 0L;
					this.anInt955 = 0;
					this.aClass32_1.anInt496 = 0;
					super.aBoolean184 = true;
					this.aBoolean211 = true;
					this.aBoolean217 = true;
					this.aClass1_Sub2_Sub3_9.anInt474 = 0;
					this.aClass1_Sub2_Sub3_8.anInt474 = 0;
					this.anInt951 = -1;
					this.anInt899 = -1;
					this.anInt900 = -1;
					this.anInt901 = -1;
					this.anInt950 = 0;
					this.anInt952 = 0;
					this.anInt898 = 0;
					this.anInt954 = 0;
					this.anInt849 = 0;
					this.anInt1041 = 0;
					this.aBoolean218 = false;
					super.anInt813 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray11[local389] = null;
					}
					this.anInt939 = 0;
					this.anInt977 = 0;
					this.anInt937 = 0;
					this.anInt980 = 0;
					this.anInt841 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1006 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1028 = (int) (Math.random() * 80.0D) - 40;
					this.anInt877 = (int) (Math.random() * 120.0D) - 60;
					this.anInt993 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1031 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1046 = 0;
					this.anInt902 = -1;
					this.anInt989 = 0;
					this.anInt990 = 0;
					this.anInt923 = 0;
					this.anInt975 = 0;
					for (local225 = 0; local225 < this.anInt921; local225++) {
						this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local225] = null;
						this.aClass1_Sub2_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local259] = null;
					}
					aClass1_Sub2_Sub2_Sub1_Sub1_1 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anInt922] = new Class1_Sub2_Sub2_Sub1_Sub1();
					this.aClass42_11.method491();
					this.aClass42_12.method491();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass42ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass42_10 = new Class42(-270);
					this.anInt876 = 0;
					this.anInt875 = 0;
					this.method612(this.anInt1020);
					this.anInt1020 = -1;
					this.method612(this.anInt956);
					this.anInt956 = -1;
					this.method612(this.anInt1056);
					this.anInt1056 = -1;
					this.method612(this.anInt1008);
					this.anInt1008 = -1;
					this.method612(this.anInt945);
					this.anInt945 = -1;
					this.method612(this.anInt896);
					this.anInt896 = -1;
					this.method612(this.anInt897);
					this.anInt897 = -1;
					this.aBoolean229 = false;
					this.anInt913 = 3;
					this.anInt861 = 0;
					this.aBoolean218 = false;
					this.aBoolean233 = false;
					this.aString19 = null;
					this.anInt836 = 0;
					this.anInt966 = -1;
					this.aBoolean193 = true;
					this.method611(649);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray234[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray13[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt1005 = 0;
					anInt916 = 0;
					anInt995 = 0;
					anInt1002 = 0;
					anInt908 = 0;
					anInt873 = 0;
					anInt906 = 0;
					anInt1003 = 0;
					anInt867 = 0;
					this.method704();
				} else if (local74 == 3) {
					this.aString25 = "";
					this.aString26 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString25 = "Your account has been disabled.";
					this.aString26 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString25 = "Your account is already logged in.";
					this.aString26 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString25 = "RuneScape has been updated!";
					this.aString26 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString25 = "This world is full.";
					this.aString26 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString25 = "Unable to connect.";
					this.aString26 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString25 = "Login limit exceeded.";
					this.aString26 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString25 = "Unable to connect.";
					this.aString26 = "Bad session id.";
				} else if (local74 == 12) {
					this.aString25 = "You need a members account to login to this world.";
					this.aString26 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString25 = "Could not complete login.";
					this.aString26 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString25 = "The server is being updated.";
					this.aString26 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean217 = true;
					this.aClass1_Sub2_Sub3_9.anInt474 = 0;
					this.aClass1_Sub2_Sub3_8.anInt474 = 0;
					this.anInt951 = -1;
					this.anInt899 = -1;
					this.anInt900 = -1;
					this.anInt901 = -1;
					this.anInt950 = 0;
					this.anInt952 = 0;
					this.anInt898 = 0;
					this.anInt1041 = 0;
					this.aBoolean218 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString25 = "Login attempts exceeded.";
					this.aString26 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString25 = "You are standing in a members-only area.";
					this.aString26 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString25 = "Invalid loginserver requested";
					this.aString26 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass45_1.method501();
					for (@Pc(907) int local907 = local389 + 3; local907 >= 0; local907--) {
						this.aString25 = "You have only just left another world";
						this.aString26 = "Your profile will be transferred in: " + local907;
						this.method633(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(929) Exception local929) {
						}
					}
					this.method646(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString25 = "Malformed login packet.";
					this.aString26 = "Please try again.";
				} else if (local74 == 23) {
					this.aString25 = "No reply from loginserver.";
					this.aString26 = "Please try again.";
				} else if (local74 == 24) {
					this.aString25 = "Error loading your profile.";
					this.aString26 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString25 = "Unexpected loginserver response.";
					this.aString26 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString25 = "This computers address has been blocked";
					this.aString26 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString25 = "Unexpected server response";
					this.aString26 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString25 = "No response from server";
					this.aString26 = "Please try using a different world.";
				} else if (this.anInt828 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1001) Exception local1001) {
					}
					this.anInt828++;
					this.method646(arg0, arg1, arg2);
				} else {
					this.aString25 = "No response from loginserver";
					this.aString26 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1044) IOException local1044) {
			this.aString25 = "";
			this.aString26 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MNKDCXXG;Z)V")
	private void method647(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub3 arg1) {
		try {
			this.aBoolean217 &= true;
			arg1.method317((byte) 3);
			@Pc(13) int local13 = arg1.method318(1);
			if (local13 != 0) {
				@Pc(21) int local21 = arg1.method318(2);
				if (local21 == 0) {
					this.anIntArray248[this.anInt924++] = this.anInt922;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg1.method318(3);
						aClass1_Sub2_Sub2_Sub1_Sub1_1.method569(local44, false);
						local54 = arg1.method318(1);
						if (local54 == 1) {
							this.anIntArray248[this.anInt924++] = this.anInt922;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg1.method318(3);
							aClass1_Sub2_Sub2_Sub1_Sub1_1.method569(local44, true);
							local54 = arg1.method318(3);
							aClass1_Sub2_Sub2_Sub1_Sub1_1.method569(local54, true);
							local98 = arg1.method318(1);
							if (local98 == 1) {
								this.anIntArray248[this.anInt924++] = this.anInt922;
							}
						} else if (local21 == 3) {
							local44 = arg1.method318(7);
							local54 = arg1.method318(7);
							local98 = arg1.method318(1);
							@Pc(137) int local137 = arg1.method318(1);
							if (local137 == 1) {
								this.anIntArray248[this.anInt924++] = this.anInt922;
							}
							this.anInt1001 = arg1.method318(2);
							aClass1_Sub2_Sub2_Sub1_Sub1_1.method566(local54, local98 == 1, local44);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("68292, " + arg0 + ", " + arg1 + ", " + true + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(8) int local8 = this.aClass16_1.method153(arg5, arg3, arg2);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass16_1.method157(arg5, arg3, arg2, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg4;
				if (local8 > 0) {
					local30 = arg1;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub2_Sub1_Sub2_9.anIntArray136;
				local52 = arg3 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class27 local61 = Class27.method282(local58);
				if (local61.anInt453 == -1) {
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
					@Pc(71) Class1_Sub2_Sub1_Sub1 local71 = this.aClass1_Sub2_Sub1_Sub1Array3[local61.anInt453];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt447 * 4 - local71.anInt62) / 2;
						@Pc(93) int local93 = (local61.anInt450 * 4 - local71.anInt63) / 2;
						local71.method51((104 - arg2 - local61.anInt450) * 4 + local93 + 48, arg3 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass16_1.method155(arg5, arg3, arg2);
			if (local8 != 0) {
				local18 = this.aClass16_1.method157(arg5, arg3, arg2, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class27 local447 = Class27.method282(local30);
				@Pc(479) int local479;
				if (local447.anInt453 != -1) {
					@Pc(457) Class1_Sub2_Sub1_Sub1 local457 = this.aClass1_Sub2_Sub1_Sub1Array3[local447.anInt453];
					if (local457 != null) {
						local58 = (local447.anInt447 * 4 - local457.anInt62) / 2;
						local479 = (local447.anInt450 * 4 - local457.anInt63) / 2;
						local457.method51((104 - arg2 - local447.anInt450) * 4 + local479 + 48, arg3 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass1_Sub2_Sub1_Sub2_9.anIntArray136;
					local479 = arg3 * 4 + (103 - arg2) * 512 * 4 + 24624;
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
			local8 = this.aClass16_1.method156(arg5, arg3, arg2);
			@Pc(604) boolean local604 = false;
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(615) Class27 local615 = Class27.method282(local18);
				if (local615.anInt453 != -1) {
					@Pc(625) Class1_Sub2_Sub1_Sub1 local625 = this.aClass1_Sub2_Sub1_Sub1Array3[local615.anInt453];
					if (local625 != null) {
						local30 = (local615.anInt447 * 4 - local625.anInt62) / 2;
						@Pc(647) int local647 = (local615.anInt450 * 4 - local625.anInt63) / 2;
						local625.method51((104 - arg2 - local615.anInt450) * 4 + local647 + 48, arg3 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(671) RuntimeException local671) {
			signlink.reporterror("51204, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local671.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method649(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub2_Sub1_Sub2_9.anIntArray136;
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
						this.aClass16_1.method162(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass16_1.method162(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub2_Sub1_Sub2_9.method387();
			@Pc(153) int local153;
			for (@Pc(149) int local149 = 1; local149 < 103; local149++) {
				for (local153 = 1; local153 < 103; local153++) {
					if ((this.aByteArrayArrayArray8[arg0][local153][local149] & 0x18) == 0) {
						this.method648(120, local36, local149, local153, local34, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local153][local149] & 0x8) != 0) {
						this.method648(120, local36, local149, local153, local34, arg0 + 1);
					}
				}
			}
			if (this.aClass26_5 != null) {
				this.aClass26_5.method279();
				Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
			}
			anInt935++;
			if (anInt935 > 78) {
				anInt935 = 0;
				this.aClass1_Sub2_Sub3_9.method296(54, this.anInt1018);
			}
			this.anInt982 = 0;
			for (local153 = 0; local153 < 104; local153++) {
				for (@Pc(242) int local242 = 0; local242 < 104; local242++) {
					@Pc(252) int local252 = this.aClass16_1.method156(this.anInt1001, local153, local242);
					if (local252 != 0) {
						local252 = local252 >> 14 & 0x7FFF;
						@Pc(264) int local264 = Class27.method282(local252).anInt451;
						if (local264 >= 0) {
							@Pc(268) int local268 = local153;
							@Pc(270) int local270 = local242;
							if (local264 != 22 && local264 != 29 && local264 != 34 && local264 != 36 && local264 != 46 && local264 != 47 && local264 != 48) {
								@Pc(302) int[][] local302 = this.aClass10Array1[this.anInt1001].anIntArrayArray3;
								for (@Pc(304) int local304 = 0; local304 < 10; local304++) {
									@Pc(311) int local311 = (int) (Math.random() * 4.0D);
									if (local311 == 0 && local268 > 0 && local268 > local153 - 3 && (local302[local268 - 1][local270] & 0x1280108) == 0) {
										local268--;
									}
									if (local311 == 1 && local268 < 103 && local268 < local153 + 3 && (local302[local268 + 1][local270] & 0x1280180) == 0) {
										local268++;
									}
									if (local311 == 2 && local270 > 0 && local270 > local242 - 3 && (local302[local268][local270 - 1] & 0x1280102) == 0) {
										local270--;
									}
									if (local311 == 3 && local270 < 103 && local270 < local242 + 3 && (local302[local268][local270 + 1] & 0x1280120) == 0) {
										local270++;
									}
								}
							}
							this.aClass1_Sub2_Sub1_Sub2Array4[this.anInt982] = this.aClass1_Sub2_Sub1_Sub2Array7[local264];
							this.anIntArray259[this.anInt982] = local268;
							this.anIntArray260[this.anInt982] = local270;
							this.anInt982++;
						}
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("12087, " + arg0 + ", " + 0 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method650() {
		try {
			for (@Pc(6) Class1_Sub2_Sub2_Sub5 local6 = (Class1_Sub2_Sub2_Sub5) this.aClass42_11.method487(); local6 != null; local6 = (Class1_Sub2_Sub2_Sub5) this.aClass42_11.method489()) {
				if (local6.anInt673 != this.anInt1001 || anInt1045 > local6.anInt680) {
					local6.method571();
				} else if (anInt1045 >= local6.anInt679) {
					if (local6.anInt676 > 0) {
						@Pc(44) Class1_Sub2_Sub2_Sub1_Sub2 local44 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local6.anInt676 - 1];
						if (local44 != null && local44.anInt776 >= 0 && local44.anInt776 < 13312 && local44.anInt777 >= 0 && local44.anInt777 < 13312) {
							local6.method482(local44.anInt777, local44.anInt776, anInt1045, this.method715(local44.anInt777, local44.anInt776, local6.anInt673) - local6.anInt672);
						}
					}
					if (local6.anInt676 < 0) {
						@Pc(89) int local89 = -local6.anInt676 - 1;
						@Pc(95) Class1_Sub2_Sub2_Sub1_Sub1 local95;
						if (local89 == this.anInt965) {
							local95 = aClass1_Sub2_Sub2_Sub1_Sub1_1;
						} else {
							local95 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local89];
						}
						if (local95 != null && local95.anInt776 >= 0 && local95.anInt776 < 13312 && local95.anInt777 >= 0 && local95.anInt777 < 13312) {
							local6.method482(local95.anInt777, local95.anInt776, anInt1045, this.method715(local95.anInt777, local95.anInt776, local6.anInt673) - local6.anInt672);
						}
					}
					local6.method483(this.anInt934);
					this.aClass16_1.method138(60, local6.anInt681, this.anInt1001, false, (int) local6.aDouble6, local6, (int) local6.aDouble8, (int) local6.aDouble7, -1);
				}
			}
			anInt854++;
			if (anInt854 > 1651) {
				anInt854 = 0;
				this.aClass1_Sub2_Sub3_9.method296(53, this.anInt1018);
				this.aClass1_Sub2_Sub3_9.method297(0);
				@Pc(196) int local196 = this.aClass1_Sub2_Sub3_9.anInt474;
				this.aClass1_Sub2_Sub3_9.method297(23);
				this.aClass1_Sub2_Sub3_9.method297((int) (Math.random() * 256.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub2_Sub3_9.method298(20573);
				}
				this.aClass1_Sub2_Sub3_9.method298((int) (Math.random() * 65536.0D));
				this.aClass1_Sub2_Sub3_9.method298(6686);
				this.aClass1_Sub2_Sub3_9.method297(82);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub2_Sub3_9.method297(58);
				}
				this.aClass1_Sub2_Sub3_9.method298(26100);
				this.aClass1_Sub2_Sub3_9.method298(64639);
				this.aClass1_Sub2_Sub3_9.method297(230);
				this.aClass1_Sub2_Sub3_9.method306(this.aClass1_Sub2_Sub3_9.anInt474 - local196);
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("14024, " + 2 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIZ)V")
	private void method651(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			signlink.anInt1067 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("95123, " + arg0 + ", " + arg1 + ", " + false + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PFWIJTDA;IIIZ)V")
	private void method652(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.anInt1041 < 400) {
				if (arg0.anIntArray122 != null) {
					arg0 = arg0.method357();
				}
				if (arg0 != null && arg0.aBoolean107) {
					@Pc(23) String local23 = arg0.aString13;
					if (arg0.anInt519 != 0) {
						local23 = local23 + method687(aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt180, arg0.anInt519) + " (level-" + arg0.anInt519 + ")";
					}
					if (this.anInt939 == 1) {
						this.aStringArray8[this.anInt1041] = "Use " + this.aString22 + " with @yel@" + local23;
						this.anIntArray244[this.anInt1041] = 540;
						this.anIntArray245[this.anInt1041] = arg1;
						this.anIntArray242[this.anInt1041] = arg2;
						this.anIntArray243[this.anInt1041] = arg3;
						this.anInt1041++;
					} else if (this.anInt977 != 1) {
						@Pc(164) int local164;
						if (arg0.aStringArray4 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg0.aStringArray4[local164] != null && !arg0.aStringArray4[local164].equalsIgnoreCase("attack")) {
									this.aStringArray8[this.anInt1041] = arg0.aStringArray4[local164] + " @yel@" + local23;
									if (local164 == 0) {
										this.anIntArray244[this.anInt1041] = 642;
									}
									if (local164 == 1) {
										this.anIntArray244[this.anInt1041] = 418;
									}
									if (local164 == 2) {
										this.anIntArray244[this.anInt1041] = 848;
									}
									if (local164 == 3) {
										this.anIntArray244[this.anInt1041] = 462;
									}
									if (local164 == 4) {
										this.anIntArray244[this.anInt1041] = 148;
									}
									this.anIntArray245[this.anInt1041] = arg1;
									this.anIntArray242[this.anInt1041] = arg2;
									this.anIntArray243[this.anInt1041] = arg3;
									this.anInt1041++;
								}
							}
						}
						if (arg0.aStringArray4 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg0.aStringArray4[local164] != null && arg0.aStringArray4[local164].equalsIgnoreCase("attack")) {
									@Pc(288) short local288 = 0;
									if (arg0.anInt519 > aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt180) {
										local288 = 2000;
									}
									this.aStringArray8[this.anInt1041] = arg0.aStringArray4[local164] + " @yel@" + local23;
									if (local164 == 0) {
										this.anIntArray244[this.anInt1041] = local288 + 642;
									}
									if (local164 == 1) {
										this.anIntArray244[this.anInt1041] = local288 + 418;
									}
									if (local164 == 2) {
										this.anIntArray244[this.anInt1041] = local288 + 848;
									}
									if (local164 == 3) {
										this.anIntArray244[this.anInt1041] = local288 + 462;
									}
									if (local164 == 4) {
										this.anIntArray244[this.anInt1041] = local288 + 148;
									}
									this.anIntArray245[this.anInt1041] = arg1;
									this.anIntArray242[this.anInt1041] = arg2;
									this.anIntArray243[this.anInt1041] = arg3;
									this.anInt1041++;
								}
							}
						}
						this.aStringArray8[this.anInt1041] = "Examine @yel@" + local23;
						this.anIntArray244[this.anInt1041] = 1657;
						this.anIntArray245[this.anInt1041] = arg1;
						this.anIntArray242[this.anInt1041] = arg2;
						this.anIntArray243[this.anInt1041] = arg3;
						this.anInt1041++;
					} else if ((this.anInt979 & 0x2) == 2) {
						this.aStringArray8[this.anInt1041] = this.aString23 + " @yel@" + local23;
						this.anIntArray244[this.anInt1041] = 85;
						this.anIntArray245[this.anInt1041] = arg1;
						this.anIntArray242[this.anInt1041] = arg2;
						this.anIntArray243[this.anInt1041] = arg3;
						this.anInt1041++;
						return;
					}
				}
			}
		} catch (@Pc(438) RuntimeException local438) {
			signlink.reporterror("73402, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local438.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!MNKDCXXG;)V")
	private void method653(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub3 arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt924; local9++) {
				@Pc(16) int local16 = this.anIntArray248[local9];
				@Pc(21) Class1_Sub2_Sub2_Sub1_Sub2 local21 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local16];
				@Pc(24) int local24 = arg1.method307();
				if ((local24 & 0x80) != 0) {
					local21.anInt762 = arg1.method335();
					if (local21.anInt762 == 65535) {
						local21.anInt762 = -1;
					}
				}
				@Pc(52) int local52;
				if ((local24 & 0x1) != 0) {
					local21.anInt780 = arg1.method335();
					local52 = arg1.method312();
					local21.anInt784 = local52 >> 16;
					local21.anInt783 = anInt1045 + (local52 & 0xFFFF);
					local21.anInt781 = 0;
					local21.anInt782 = 0;
					if (local21.anInt783 > anInt1045) {
						local21.anInt781 = -1;
					}
					if (local21.anInt780 == 65535) {
						local21.anInt780 = -1;
					}
				}
				@Pc(95) int local95;
				if ((local24 & 0x2) != 0) {
					local52 = arg1.method307();
					local95 = arg1.method328();
					local21.method567(anInt1045, local95, local52);
					local21.anInt773 = anInt1045 + 300;
					local21.anInt774 = arg1.method326(this.anInt853);
					local21.anInt775 = arg1.method327();
				}
				if ((local24 & 0x4) != 0) {
					local21.aClass34_2 = Class34.method362(arg1.method335());
					local21.anInt754 = local21.aClass34_2.aByte24;
					local21.anInt772 = local21.aClass34_2.anInt516;
					local21.anInt758 = local21.aClass34_2.anInt509;
					local21.anInt759 = local21.aClass34_2.anInt506;
					local21.anInt760 = local21.aClass34_2.anInt517;
					local21.anInt761 = local21.aClass34_2.anInt518;
					local21.anInt786 = local21.aClass34_2.anInt524;
				}
				if ((local24 & 0x40) != 0) {
					local21.aString16 = arg1.method314();
					local21.anInt788 = 100;
				}
				if ((local24 & 0x8) != 0) {
					local52 = arg1.method336();
					if (local52 == 65535) {
						local52 = -1;
					}
					local95 = arg1.method328();
					if (local52 == local21.anInt764 && local52 != -1) {
						@Pc(202) int local202 = Class36.aClass36Array1[local52].anInt540;
						if (local202 == 1) {
							local21.anInt765 = 0;
							local21.anInt766 = 0;
							local21.anInt767 = local95;
							local21.anInt768 = 0;
						}
						if (local202 == 2) {
							local21.anInt768 = 0;
						}
					} else if (local52 == -1 || local21.anInt764 == -1 || Class36.aClass36Array1[local52].anInt534 >= Class36.aClass36Array1[local21.anInt764].anInt534) {
						local21.anInt764 = local52;
						local21.anInt765 = 0;
						local21.anInt766 = 0;
						local21.anInt767 = local95;
						local21.anInt768 = 0;
						local21.anInt763 = local21.anInt785;
					}
				}
				if ((local24 & 0x10) != 0) {
					local52 = arg1.method327();
					local95 = arg1.method326(this.anInt853);
					local21.method567(anInt1045, local95, local52);
					local21.anInt773 = anInt1045 + 300;
					local21.anInt774 = arg1.method326(this.anInt853);
					local21.anInt775 = arg1.method328();
				}
				if ((local24 & 0x20) != 0) {
					local21.anInt770 = arg1.method309();
					local21.anInt771 = arg1.method335();
				}
			}
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("83087, " + arg0 + ", " + 802 + ", " + arg1 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method654(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class18 local2 = Class18.method187(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray57.length && local2.anIntArray57[local4] != -1; local4++) {
				@Pc(18) Class18 local18 = Class18.method187(local2.anIntArray57[local4]);
				if (local18.anInt348 == 1) {
					this.method654(local18.anInt340);
				}
				local18.anInt334 = 0;
				local18.anInt330 = 0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("54558, " + 90 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean221) {
			this.method671();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FHOAYGUJ;II)V")
	private void method655(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			this.method656(arg0.anInt776, arg1, arg0.anInt777);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("86266, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)V")
	private void method656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method715(arg2, arg0, this.anInt1001) - arg1;
				@Pc(38) int local38 = arg0 - this.anInt1011;
				@Pc(43) int local43 = local28 - this.anInt1012;
				@Pc(48) int local48 = arg2 - this.anInt1013;
				@Pc(53) int local53 = Class1_Sub2_Sub2_Sub3.anIntArray96[this.anInt1014];
				@Pc(58) int local58 = Class1_Sub2_Sub2_Sub3.anIntArray97[this.anInt1014];
				@Pc(63) int local63 = Class1_Sub2_Sub2_Sub3.anIntArray96[this.anInt1015];
				@Pc(68) int local68 = Class1_Sub2_Sub2_Sub3.anIntArray97[this.anInt1015];
				@Pc(78) int local78 = local48 * local63 + local38 * local68 >> 16;
				@Pc(88) int local88 = local48 * local68 - local38 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local43 * local58 - local88 * local53 >> 16;
				@Pc(110) int local110 = local43 * local53 + local88 * local58 >> 16;
				if (local110 >= 50) {
					this.anInt931 = Class1_Sub2_Sub1_Sub3.anInt628 + (local90 << 9) / local110;
					this.anInt932 = Class1_Sub2_Sub1_Sub3.anInt629 + (local100 << 9) / local110;
				} else {
					this.anInt931 = -1;
					this.anInt932 = -1;
				}
			} else {
				this.anInt931 = -1;
				this.anInt932 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("10176, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method657() {
		try {
			this.anInt863 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt923 + this.anInt975; local6++) {
				@Pc(13) Class1_Sub2_Sub2_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub2_Sub2_Sub1_Sub1_1;
				} else if (local6 < this.anInt923) {
					local13 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anIntArray247[local6]];
				} else {
					local13 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[this.anIntArray256[local6 - this.anInt923]];
				}
				if (local13 != null && local13.method568()) {
					@Pc(54) Class34 local54;
					if (local13 instanceof Class1_Sub2_Sub2_Sub1_Sub2) {
						local54 = ((Class1_Sub2_Sub2_Sub1_Sub2) local13).aClass34_2;
						if (local54.anIntArray122 != null) {
							local54 = local54.method357();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt923) {
						local54 = ((Class1_Sub2_Sub2_Sub1_Sub2) local13).aClass34_2;
						if (local54.anInt525 >= 0 && local54.anInt525 < this.aClass1_Sub2_Sub1_Sub2Array6.length) {
							this.method655(local13, local13.anInt756 + 15);
							if (this.anInt931 > -1) {
								this.aClass1_Sub2_Sub1_Sub2Array6[local54.anInt525].method392(this.anInt932 - 30, this.anInt931 - 12);
							}
						}
						if (this.anInt849 == 1 && this.anInt827 == this.anIntArray256[local6 - this.anInt923] && anInt1045 % 20 < 10) {
							this.method655(local13, local13.anInt756 + 15);
							if (this.anInt931 > -1) {
								this.aClass1_Sub2_Sub1_Sub2Array10[0].method392(this.anInt932 - 28, this.anInt931 - 12);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class1_Sub2_Sub2_Sub1_Sub1 local73 = (Class1_Sub2_Sub2_Sub1_Sub1) local13;
						if (local73.anInt170 != -1 || local73.anInt171 != -1) {
							this.method655(local13, local13.anInt756 + 15);
							if (this.anInt931 > -1) {
								if (local73.anInt170 != -1) {
									this.aClass1_Sub2_Sub1_Sub2Array9[local73.anInt170].method392(this.anInt932 - 30, this.anInt931 - 12);
									local70 += 25;
								}
								if (local73.anInt171 != -1) {
									this.aClass1_Sub2_Sub1_Sub2Array6[local73.anInt171].method392(this.anInt932 - local70, this.anInt931 - 12);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt849 == 10 && this.anInt850 == this.anIntArray247[local6]) {
							this.method655(local13, local13.anInt756 + 15);
							if (this.anInt931 > -1) {
								this.aClass1_Sub2_Sub1_Sub2Array10[1].method392(this.anInt932 - local70, this.anInt931 - 12);
							}
						}
					}
					if (local13.aString16 != null && (local6 >= this.anInt923 || this.anInt869 == 0 || this.anInt869 == 3 || this.anInt869 == 1 && this.method592(426, ((Class1_Sub2_Sub2_Sub1_Sub1) local13).aString3))) {
						this.method655(local13, local13.anInt756);
						if (this.anInt931 > -1 && this.anInt863 < this.anInt864) {
							this.anIntArray228[this.anInt863] = this.aClass1_Sub2_Sub1_Sub4_4.method546(local13.aString16) / 2;
							this.anIntArray227[this.anInt863] = this.aClass1_Sub2_Sub1_Sub4_4.anInt722;
							this.anIntArray225[this.anInt863] = this.anInt931;
							this.anIntArray226[this.anInt863] = this.anInt932;
							this.anIntArray229[this.anInt863] = local13.anInt743;
							this.anIntArray230[this.anInt863] = local13.anInt755;
							this.anIntArray231[this.anInt863] = local13.anInt788;
							this.aStringArray12[this.anInt863++] = local13.aString16;
							if (this.anInt860 == 0 && local13.anInt755 >= 1 && local13.anInt755 <= 3) {
								this.anIntArray227[this.anInt863] += 10;
								this.anIntArray226[this.anInt863] += 5;
							}
							if (this.anInt860 == 0 && local13.anInt755 == 4) {
								this.anIntArray228[this.anInt863] = 60;
							}
							if (this.anInt860 == 0 && local13.anInt755 == 5) {
								this.anIntArray227[this.anInt863] += 5;
							}
						}
					}
					if (local13.anInt773 > anInt1045) {
						this.method655(local13, local13.anInt756 + 15);
						if (this.anInt931 > -1) {
							local70 = local13.anInt774 * 30 / local13.anInt775;
							if (local70 > 30) {
								local70 = 30;
							}
							Class1_Sub2_Sub1.method535(65280, this.anInt931 - 15, this.anInt932 - 3, 5, local70);
							Class1_Sub2_Sub1.method535(16711680, this.anInt931 + local70 - 15, this.anInt932 - 3, 5, 30 - local70);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray208[local70] > anInt1045) {
							this.method655(local13, local13.anInt756 / 2);
							if (this.anInt931 > -1) {
								if (local70 == 1) {
									this.anInt932 -= 20;
								}
								if (local70 == 2) {
									this.anInt931 -= 15;
									this.anInt932 -= 10;
								}
								if (local70 == 3) {
									this.anInt931 += 15;
									this.anInt932 -= 10;
								}
								this.aClass1_Sub2_Sub1_Sub2Array8[local13.anIntArray207[local70]].method392(this.anInt932 - 12, this.anInt931 - 12);
								this.aClass1_Sub2_Sub1_Sub4_2.method543(0, this.anInt932 + 4, this.anInt931, String.valueOf(local13.anIntArray206[local70]));
								this.aClass1_Sub2_Sub1_Sub4_2.method543(16777215, this.anInt932 + 3, this.anInt931 - 1, String.valueOf(local13.anIntArray206[local70]));
							}
						}
					}
				}
			}
			for (@Pc(610) int local610 = 0; local610 < this.anInt863; local610++) {
				local70 = this.anIntArray225[local610];
				@Pc(622) int local622 = this.anIntArray226[local610];
				@Pc(627) int local627 = this.anIntArray228[local610];
				@Pc(632) int local632 = this.anIntArray227[local610];
				@Pc(634) boolean local634 = true;
				while (local634) {
					local634 = false;
					for (@Pc(640) int local640 = 0; local640 < local610; local640++) {
						if (local622 + 2 > this.anIntArray226[local640] - this.anIntArray227[local640] && local622 - local632 < this.anIntArray226[local640] + 2 && local70 - local627 < this.anIntArray225[local640] + this.anIntArray228[local640] && local70 + local627 > this.anIntArray225[local640] - this.anIntArray228[local640] && this.anIntArray226[local640] - this.anIntArray227[local640] < local622) {
							local622 = this.anIntArray226[local640] - this.anIntArray227[local640];
							local634 = true;
						}
					}
				}
				this.anInt931 = this.anIntArray225[local610];
				this.anInt932 = this.anIntArray226[local610] = local622;
				@Pc(739) String local739 = this.aStringArray12[local610];
				if (this.anInt860 == 0) {
					@Pc(744) int local744 = 16776960;
					if (this.anIntArray229[local610] < 6) {
						local744 = this.anIntArray214[this.anIntArray229[local610]];
					}
					if (this.anIntArray229[local610] == 6) {
						local744 = this.anInt928 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray229[local610] == 7) {
						local744 = this.anInt928 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray229[local610] == 8) {
						local744 = this.anInt928 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(819) int local819;
					if (this.anIntArray229[local610] == 9) {
						local819 = 150 - this.anIntArray231[local610];
						if (local819 < 50) {
							local744 = local819 * 1280 + 16711680;
						} else if (local819 < 100) {
							local744 = 16776960 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray229[local610] == 10) {
						local819 = 150 - this.anIntArray231[local610];
						if (local819 < 50) {
							local744 = local819 * 5 + 16711680;
						} else if (local819 < 100) {
							local744 = 16711935 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 327680 + 255 - (local819 - 100) * 5;
						}
					}
					if (this.anIntArray229[local610] == 11) {
						local819 = 150 - this.anIntArray231[local610];
						if (local819 < 50) {
							local744 = 16777215 - local819 * 327685;
						} else if (local819 < 100) {
							local744 = (local819 - 50) * 327685 + 65280;
						} else if (local819 < 150) {
							local744 = 16777215 - (local819 - 100) * 327680;
						}
					}
					if (this.anIntArray230[local610] == 0) {
						this.aClass1_Sub2_Sub1_Sub4_4.method543(0, this.anInt932 + 1, this.anInt931, local739);
						this.aClass1_Sub2_Sub1_Sub4_4.method543(local744, this.anInt932, this.anInt931, local739);
					}
					if (this.anIntArray230[local610] == 1) {
						this.aClass1_Sub2_Sub1_Sub4_4.method548(this.anInt931, local739, 0, this.anInt928, 34, this.anInt932 + 1);
						this.aClass1_Sub2_Sub1_Sub4_4.method548(this.anInt931, local739, local744, this.anInt928, 34, this.anInt932);
					}
					if (this.anIntArray230[local610] == 2) {
						this.aClass1_Sub2_Sub1_Sub4_4.method549(this.anInt928, this.anInt931, 0, this.anInt932 + 1, local739);
						this.aClass1_Sub2_Sub1_Sub4_4.method549(this.anInt928, this.anInt931, local744, this.anInt932, local739);
					}
					if (this.anIntArray230[local610] == 3) {
						this.aClass1_Sub2_Sub1_Sub4_4.method550(0, 150 - this.anIntArray231[local610], this.aBoolean224, this.anInt932 + 1, this.anInt931, this.anInt928, local739);
						this.aClass1_Sub2_Sub1_Sub4_4.method550(local744, 150 - this.anIntArray231[local610], this.aBoolean224, this.anInt932, this.anInt931, this.anInt928, local739);
					}
					@Pc(1118) int local1118;
					if (this.anIntArray230[local610] == 4) {
						local819 = this.aClass1_Sub2_Sub1_Sub4_4.method546(local739);
						local1118 = (150 - this.anIntArray231[local610]) * (local819 + 100) / 150;
						Class1_Sub2_Sub1.method532(this.anInt931 - 50, 0, this.anInt931 + 50, 334);
						this.aClass1_Sub2_Sub1_Sub4_4.method547(0, local739, this.anInt931 + 50 - local1118, this.anInt932 + 1);
						this.aClass1_Sub2_Sub1_Sub4_4.method547(local744, local739, this.anInt931 + 50 - local1118, this.anInt932);
						Class1_Sub2_Sub1.method531();
					}
					if (this.anIntArray230[local610] == 5) {
						local819 = 150 - this.anIntArray231[local610];
						local1118 = 0;
						if (local819 < 25) {
							local1118 = local819 - 25;
						} else if (local819 > 125) {
							local1118 = local819 - 125;
						}
						Class1_Sub2_Sub1.method532(0, this.anInt932 - this.aClass1_Sub2_Sub1_Sub4_4.anInt722 - 1, 512, this.anInt932 + 5);
						this.aClass1_Sub2_Sub1_Sub4_4.method543(0, this.anInt932 + local1118 + 1, this.anInt931, local739);
						this.aClass1_Sub2_Sub1_Sub4_4.method543(local744, this.anInt932 + local1118, this.anInt931, local739);
						Class1_Sub2_Sub1.method531();
					}
				} else {
					this.aClass1_Sub2_Sub1_Sub4_4.method543(0, this.anInt932 + 1, this.anInt931, local739);
					this.aClass1_Sub2_Sub1_Sub4_4.method543(16776960, this.anInt932, this.anInt931, local739);
				}
			}
		} catch (@Pc(1273) RuntimeException local1273) {
			signlink.reporterror("67238, " + 979 + ", " + local1273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method658(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt947; local14++) {
					if (this.aLongArray4[local14] == arg0) {
						this.anInt947--;
						this.aBoolean202 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt947; local34++) {
							this.aLongArray4[local34] = this.aLongArray4[local34 + 1];
						}
						this.aClass1_Sub2_Sub3_9.method296(115, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method303(arg0, this.anInt907);
						return;
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("7468, " + 20382 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method659() {
		try {
			this.anInt930 = 0;
			@Pc(14) int local14 = (aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 >> 7) + this.anInt958;
			@Pc(22) int local22 = (aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 >> 7) + this.anInt959;
			if (local14 >= 3053 && local14 <= 3156 && local22 >= 3056 && local22 <= 3136) {
				this.anInt930 = 1;
			}
			if (local14 >= 3072 && local14 <= 3118 && local22 >= 9492 && local22 <= 9535) {
				this.anInt930 = 1;
			}
			if (this.anInt930 == 1 && local14 >= 3139 && local14 <= 3199 && local22 >= 3008 && local22 <= 3062) {
				this.anInt930 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("69329, " + 186 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
	private int method660() {
		try {
			@Pc(7) int local7 = 3;
			if (this.anInt1014 < 310) {
				@Pc(16) int local16 = this.anInt1011 >> 7;
				@Pc(21) int local21 = this.anInt1013 >> 7;
				@Pc(26) int local26 = aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 >> 7;
				@Pc(31) int local31 = aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1001][local16][local21] & 0x4) != 0) {
					local7 = this.anInt1001;
				}
				@Pc(53) int local53;
				if (local26 > local16) {
					local53 = local26 - local16;
				} else {
					local53 = local16 - local26;
				}
				@Pc(66) int local66;
				if (local31 > local21) {
					local66 = local31 - local21;
				} else {
					local66 = local21 - local31;
				}
				@Pc(81) int local81;
				@Pc(83) int local83;
				if (local53 > local66) {
					local81 = local66 * 65536 / local53;
					local83 = 32768;
					while (local16 != local26) {
						if (local16 < local26) {
							local16++;
						} else if (local16 > local26) {
							local16--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1001][local16][local21] & 0x4) != 0) {
							local7 = this.anInt1001;
						}
						local83 += local81;
						if (local83 >= 65536) {
							local83 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1001][local16][local21] & 0x4) != 0) {
								local7 = this.anInt1001;
							}
						}
					}
				} else {
					local81 = local53 * 65536 / local66;
					local83 = 32768;
					while (local21 != local31) {
						if (local21 < local31) {
							local21++;
						} else if (local21 > local31) {
							local21--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1001][local16][local21] & 0x4) != 0) {
							local7 = this.anInt1001;
						}
						local83 += local81;
						if (local83 >= 65536) {
							local83 -= 65536;
							if (local16 < local26) {
								local16++;
							} else if (local16 > local26) {
								local16--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1001][local16][local21] & 0x4) != 0) {
								local7 = this.anInt1001;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1001][aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 >> 7][aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 >> 7] & 0x4) != 0) {
				local7 = this.anInt1001;
			}
			return local7;
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("7878, " + true + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)I")
	private int method661() {
		try {
			@Pc(18) int local18 = this.method715(this.anInt1013, this.anInt1011, this.anInt1001);
			return local18 - this.anInt1012 >= 800 || (this.aByteArrayArrayArray8[this.anInt1001][this.anInt1011 >> 7][this.anInt1013 >> 7] & 0x4) == 0 ? 3 : this.anInt1001;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("46604, " + 0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method662(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt1041 >= 2 || this.anInt939 != 0 || this.anInt977 != 0) {
				@Pc(31) String local31;
				if (this.anInt939 == 1 && this.anInt1041 < 2) {
					local31 = "Use " + this.aString22 + " with...";
				} else if (this.anInt977 == 1 && this.anInt1041 < 2) {
					local31 = this.aString23 + "...";
				} else {
					local31 = this.aStringArray8[this.anInt1041 - 1];
				}
				if (this.anInt1041 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt1041 - 2) + " more options";
				}
				this.aClass1_Sub2_Sub1_Sub4_4.method552(4, local31, 16777215, anInt1045 / 1000, 15);
				if (arg0 != -63) {
					this.anInt1036 = 118;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("33976, " + arg0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean212 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("43043, " + 25399 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IIILjava/lang/String;)Lclient!NXFIIFAD;")
	private Class31 method663(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(8) byte[] local8 = null;
			@Pc(10) int local10 = 5;
			try {
				if (this.aClass43Array1[0] != null) {
					local8 = this.aClass43Array1[0].method492(arg0);
				}
			} catch (@Pc(25) Exception local25) {
			}
			@Pc(39) int local39;
			if (local8 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local8);
				local39 = (int) this.aCRC32_2.getValue();
				if (local39 != arg2) {
					local8 = null;
				}
			}
			if (local8 != null) {
				return new Class31(local8, this.aBoolean230);
			}
			local39 = 0;
			while (local8 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method588(arg3, (byte) 6, "Requesting " + arg1);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method717(arg4 + arg2);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class1_Sub2_Sub3 local101 = new Class1_Sub2_Sub3(local90, -670);
					local101.anInt474 = 3;
					@Pc(109) int local109 = local101.method311() + 6;
					@Pc(111) int local111 = 6;
					local8 = new byte[local109];
					for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
						local8[local116] = local90[local116];
					}
					@Pc(134) int local134;
					while (local111 < local109) {
						local134 = local109 - local111;
						if (local134 > 1000) {
							local134 = 1000;
						}
						@Pc(145) int local145 = local87.read(local8, local111, local134);
						if (local145 < 0) {
							(new StringBuffer("Length error: ")).append(local111).append("/").append(local109).toString();
							throw new IOException("EOF");
						}
						local111 += local145;
						@Pc(174) int local174 = local111 * 100 / local109;
						if (local174 != local76) {
							this.method588(arg3, (byte) 6, "Loading " + arg1 + " - " + local174 + "%");
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass43Array1[0] != null) {
							this.aClass43Array1[0].method493(local8, arg0, local8.length);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass43Array1[0] = null;
					}
					if (local8 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local8);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg2) {
							local8 = null;
							local39++;
							local61 = "Checksum error: " + local134;
						}
					}
				} catch (@Pc(254) IOException local254) {
					if (local61.equals("Unknown error")) {
						local61 = "Connection error";
					}
					local8 = null;
				} catch (@Pc(264) NullPointerException local264) {
					local61 = "Null error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(273) ArrayIndexOutOfBoundsException local273) {
					local61 = "Bounds error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(282) Exception local282) {
					local61 = "Unexpected error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local8 == null) {
					for (local76 = local10; local76 > 0; local76--) {
						if (local39 >= 3) {
							this.method588(arg3, (byte) 6, "Game updated - please reload page");
							local76 = 10;
						} else {
							this.method588(arg3, (byte) 6, local61 + " - Retrying in " + local76);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(326) Exception local326) {
						}
					}
					local10 *= 2;
					if (local10 > 60) {
						local10 = 60;
					}
					this.aBoolean213 = !this.aBoolean213;
				}
			}
			return new Class31(local8, this.aBoolean230);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("24835, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IJOSTBQT;)Z")
	private boolean method664(@OriginalArg(1) Class18 arg0) {
		try {
			if (arg0.anIntArray54 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray54.length; local6++) {
				@Pc(14) int local14 = this.method665(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray52[local6];
				if (arg0.anIntArray54[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray54[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray54[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("12625, " + 6 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!IJOSTBQT;)I")
	private int method665(@OriginalArg(1) int arg0, @OriginalArg(2) Class18 arg1) {
		try {
			if (arg1.anIntArrayArray9 == null || arg0 >= arg1.anIntArrayArray9.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg1.anIntArrayArray9[arg0];
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				@Pc(27) byte local27 = 0;
				while (true) {
					@Pc(32) int local32 = local21[local25++];
					@Pc(34) int local34 = 0;
					@Pc(36) byte local36 = 0;
					if (local32 == 0) {
						return local23;
					}
					if (local32 == 1) {
						local34 = this.anIntArray223[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray252[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray267[local21[local25++]];
					}
					@Pc(82) Class18 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local32 == 4) {
						local82 = Class18.method187(local21[local25++]);
						local87 = local21[local25++];
						if (local87 >= 0 && local87 < Class38.anInt572 && (!Class38.method409(local87).aBoolean122 || aBoolean214)) {
							for (local100 = 0; local100 < local82.anIntArray56.length; local100++) {
								if (local82.anIntArray56[local100] == local87 + 1) {
									local34 += local82.anIntArray55[local100];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray268[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray270[this.anIntArray252[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray268[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt180;
					}
					@Pc(175) int local175;
					if (local32 == 9) {
						for (local175 = 0; local175 < Class50.anInt804; local175++) {
							if (Class50.aBooleanArray10[local175]) {
								local34 += this.anIntArray252[local175];
							}
						}
					}
					if (local32 == 10) {
						local82 = Class18.method187(local21[local25++]);
						local87 = local21[local25++] + 1;
						if (local87 >= 0 && local87 < Class38.anInt572 && (!Class38.method409(local87).aBoolean122 || aBoolean214)) {
							for (local100 = 0; local100 < local82.anIntArray56.length; local100++) {
								if (local82.anIntArray56[local100] == local87) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt888;
					}
					if (local32 == 12) {
						local34 = this.anInt915;
					}
					if (local32 == 13) {
						local175 = this.anIntArray268[local21[local25++]];
						local87 = local21[local25++];
						local34 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local175 = local21[local25++];
						@Pc(289) Class29 local289 = Class29.aClass29Array1[local175];
						local100 = local289.anInt484;
						@Pc(295) int local295 = local289.anInt485;
						@Pc(298) int local298 = local289.anInt486;
						@Pc(304) int local304 = anIntArray262[local298 - local295];
						local34 = this.anIntArray268[local100] >> local295 & local304;
					}
					if (local32 == 15) {
						local36 = 1;
					}
					if (local32 == 16) {
						local36 = 2;
					}
					if (local32 == 17) {
						local36 = 3;
					}
					if (local32 == 18) {
						local34 = (aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 >> 7) + this.anInt958;
					}
					if (local32 == 19) {
						local34 = (aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 >> 7) + this.anInt959;
					}
					if (local32 == 20) {
						local34 = local21[local25++];
					}
					if (local36 == 0) {
						if (local27 == 0) {
							local23 += local34;
						}
						if (local27 == 1) {
							local23 -= local34;
						}
						if (local27 == 2 && local34 != 0) {
							local23 /= local34;
						}
						if (local27 == 3) {
							local23 *= local34;
						}
						local27 = 0;
					} else {
						local27 = local36;
					}
				}
			} catch (@Pc(397) Exception local397) {
				return -1;
			}
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("42187, " + 17208 + ", " + arg0 + ", " + arg1 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method666() {
		try {
			this.aClass26_3.method279();
			Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray236;
			this.aClass1_Sub2_Sub1_Sub1_3.method51(0, 0);
			if (this.anInt896 != -1) {
				this.method667(0, Class18.method187(this.anInt896), 0, 0);
			} else if (this.anIntArray246[this.anInt913] != -1) {
				this.method667(0, Class18.method187(this.anIntArray246[this.anInt913]), 0, 0);
			}
			if (this.aBoolean218 && this.anInt829 == 1) {
				this.method622();
			}
			this.aClass26_3.method280(super.aGraphics2, 553, 205, (byte) 1);
			this.aClass26_5.method279();
			Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("1266, " + 0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IJOSTBQT;IBI)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt348 == 0 && arg1.anIntArray57 != null && (!arg1.aBoolean63 || this.anInt1058 == arg1.anInt340 || this.anInt857 == arg1.anInt340 || this.anInt1022 == arg1.anInt340)) {
				@Pc(29) int local29 = Class1_Sub2_Sub1.anInt714;
				@Pc(31) int local31 = Class1_Sub2_Sub1.anInt712;
				@Pc(33) int local33 = Class1_Sub2_Sub1.anInt715;
				@Pc(35) int local35 = Class1_Sub2_Sub1.anInt713;
				Class1_Sub2_Sub1.method532(arg0, arg3, arg0 + arg1.anInt333, arg3 + arg1.anInt349);
				@Pc(57) int local57 = arg1.anIntArray57.length;
				for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
					@Pc(68) int local68 = arg1.anIntArray53[local59] + arg0;
					@Pc(77) int local77 = arg1.anIntArray51[local59] + arg3 - arg2;
					@Pc(83) Class18 local83 = Class18.method187(arg1.anIntArray57[local59]);
					@Pc(88) int local88 = local68 + local83.anInt342;
					@Pc(93) int local93 = local77 + local83.anInt357;
					if (local83.anInt343 > 0) {
						this.method720(local83);
					}
					if (local83.anInt348 == 0) {
						if (local83.anInt321 > local83.anInt336 - local83.anInt349) {
							local83.anInt321 = local83.anInt336 - local83.anInt349;
						}
						if (local83.anInt321 < 0) {
							local83.anInt321 = 0;
						}
						this.method667(local88, local83, local83.anInt321, local93);
						if (local83.anInt336 > local83.anInt349) {
							this.method642(local83.anInt336, local88 + local83.anInt333, local83.anInt349, this.aBoolean235, local83.anInt321, local93);
						}
					} else if (local83.anInt348 != 1) {
						@Pc(166) int local166;
						@Pc(170) int local170;
						@Pc(181) int local181;
						@Pc(216) int local216;
						@Pc(223) int local223;
						@Pc(248) int local248;
						@Pc(164) int local164;
						@Pc(214) int local214;
						if (local83.anInt348 == 2) {
							local164 = 0;
							for (local166 = 0; local166 < local83.anInt349; local166++) {
								for (local170 = 0; local170 < local83.anInt333; local170++) {
									local181 = local88 + local170 * (local83.anInt337 + 32);
									@Pc(190) int local190 = local93 + local166 * (local83.anInt344 + 32);
									if (local164 < 20) {
										local181 += local83.anIntArray50[local164];
										local190 += local83.anIntArray58[local164];
									}
									if (local83.anIntArray56[local164] > 0) {
										local214 = 0;
										local216 = 0;
										local223 = local83.anIntArray56[local164] - 1;
										if (local181 > Class1_Sub2_Sub1.anInt714 - 32 && local181 < Class1_Sub2_Sub1.anInt715 && local190 > Class1_Sub2_Sub1.anInt712 - 32 && local190 < Class1_Sub2_Sub1.anInt713 || this.anInt998 != 0 && this.anInt997 == local164) {
											local248 = 0;
											if (this.anInt939 == 1 && this.anInt940 == local164 && this.anInt941 == local83.anInt340) {
												local248 = 16777215;
											}
											@Pc(272) Class1_Sub2_Sub1_Sub2 local272 = Class38.method402(local248, local83.anIntArray55[local164], local223);
											if (local272 != null) {
												@Pc(351) int local351;
												if (this.anInt998 != 0 && this.anInt997 == local164 && this.anInt996 == local83.anInt340) {
													local214 = super.anInt815 - this.anInt999;
													local216 = super.anInt816 - this.anInt1000;
													if (local214 < 5 && local214 > -5) {
														local214 = 0;
													}
													if (local216 < 5 && local216 > -5) {
														local216 = 0;
													}
													if (this.anInt872 < 5) {
														local214 = 0;
														local216 = 0;
													}
													local272.method394(local181 + local214, local190 + local216);
													if (local190 + local216 < Class1_Sub2_Sub1.anInt712 && arg1.anInt321 > 0) {
														local351 = this.anInt934 * (Class1_Sub2_Sub1.anInt712 - local190 - local216) / 3;
														if (local351 > this.anInt934 * 10) {
															local351 = this.anInt934 * 10;
														}
														if (local351 > arg1.anInt321) {
															local351 = arg1.anInt321;
														}
														arg1.anInt321 -= local351;
														this.anInt1000 += local351;
													}
													if (local190 + local216 + 32 > Class1_Sub2_Sub1.anInt713 && arg1.anInt321 < arg1.anInt336 - arg1.anInt349) {
														local351 = this.anInt934 * (local190 + local216 + 32 - Class1_Sub2_Sub1.anInt713) / 3;
														if (local351 > this.anInt934 * 10) {
															local351 = this.anInt934 * 10;
														}
														if (local351 > arg1.anInt336 - arg1.anInt349 - arg1.anInt321) {
															local351 = arg1.anInt336 - arg1.anInt349 - arg1.anInt321;
														}
														arg1.anInt321 += local351;
														this.anInt1000 -= local351;
													}
												} else if (this.anInt1027 != 0 && this.anInt1026 == local164 && this.anInt1025 == local83.anInt340) {
													local272.method394(local181, local190);
												} else {
													local272.method392(local190, local181);
												}
												if (local272.anInt564 == 33 || local83.anIntArray55[local164] != 1) {
													local351 = local83.anIntArray55[local164];
													this.aClass1_Sub2_Sub1_Sub4_2.method547(0, method618(local351), local181 + local214 + 1, local190 + 10 + local216);
													this.aClass1_Sub2_Sub1_Sub4_2.method547(16776960, method618(local351), local181 + local214, local190 + 9 + local216);
												}
											}
										}
									} else if (local83.aClass1_Sub2_Sub1_Sub2Array2 != null && local164 < 20) {
										@Pc(540) Class1_Sub2_Sub1_Sub2 local540 = local83.aClass1_Sub2_Sub1_Sub2Array2[local164];
										if (local540 != null) {
											local540.method392(local190, local181);
										}
									}
									local164++;
								}
							}
						} else if (local83.anInt348 == 3) {
							@Pc(566) boolean local566 = false;
							if (this.anInt1022 == local83.anInt340 || this.anInt857 == local83.anInt340 || this.anInt1058 == local83.anInt340) {
								local566 = true;
							}
							if (this.method664(local83)) {
								local164 = local83.anInt335;
								if (local566 && local83.anInt355 != 0) {
									local164 = local83.anInt355;
								}
							} else {
								local164 = local83.anInt350;
								if (local566 && local83.anInt332 != 0) {
									local164 = local83.anInt332;
								}
							}
							if (local83.aByte11 == 0) {
								if (local83.aBoolean58) {
									Class1_Sub2_Sub1.method535(local164, local88, local93, local83.anInt349, local83.anInt333);
								} else {
									Class1_Sub2_Sub1.method536(local93, local83.anInt333, local88, local164, local83.anInt349);
								}
							} else if (local83.aBoolean58) {
								Class1_Sub2_Sub1.method534(local83.anInt349, local93, local88, 256 - (local83.aByte11 & 0xFF), local164, local83.anInt333);
							} else {
								Class1_Sub2_Sub1.method537(local164, local88, 256 - (local83.aByte11 & 0xFF), local93, local83.anInt349, local83.anInt333);
							}
						} else {
							@Pc(684) Class1_Sub2_Sub1_Sub4 local684;
							@Pc(961) String local961;
							if (local83.anInt348 == 4) {
								local684 = local83.aClass1_Sub2_Sub1_Sub4_1;
								@Pc(687) String local687 = local83.aString8;
								@Pc(689) boolean local689 = false;
								if (this.anInt1022 == local83.anInt340 || this.anInt857 == local83.anInt340 || this.anInt1058 == local83.anInt340) {
									local689 = true;
								}
								if (this.method664(local83)) {
									local166 = local83.anInt335;
									if (local689 && local83.anInt355 != 0) {
										local166 = local83.anInt355;
									}
									if (local83.aString6.length() > 0) {
										local687 = local83.aString6;
									}
								} else {
									local166 = local83.anInt350;
									if (local689 && local83.anInt332 != 0) {
										local166 = local83.anInt332;
									}
								}
								if (local83.anInt354 == 6 && this.aBoolean229) {
									local687 = "Please wait...";
									local166 = local83.anInt350;
								}
								if (Class1_Sub2_Sub1.anInt710 == 479) {
									if (local166 == 16776960) {
										local166 = 255;
									}
									if (local166 == 49152) {
										local166 = 16777215;
									}
								}
								local214 = local93 + local684.anInt722;
								while (local687.length() > 0) {
									if (local687.indexOf("%") != -1) {
										label390: while (true) {
											local216 = local687.indexOf("%1");
											if (local216 == -1) {
												while (true) {
													local216 = local687.indexOf("%2");
													if (local216 == -1) {
														while (true) {
															local216 = local687.indexOf("%3");
															if (local216 == -1) {
																while (true) {
																	local216 = local687.indexOf("%4");
																	if (local216 == -1) {
																		while (true) {
																			local216 = local687.indexOf("%5");
																			if (local216 == -1) {
																				break label390;
																			}
																			local687 = local687.substring(0, local216) + this.method626(this.method665(4, local83)) + local687.substring(local216 + 2);
																		}
																	}
																	local687 = local687.substring(0, local216) + this.method626(this.method665(3, local83)) + local687.substring(local216 + 2);
																}
															}
															local687 = local687.substring(0, local216) + this.method626(this.method665(2, local83)) + local687.substring(local216 + 2);
														}
													}
													local687 = local687.substring(0, local216) + this.method626(this.method665(1, local83)) + local687.substring(local216 + 2);
												}
											}
											local687 = local687.substring(0, local216) + this.method626(this.method665(0, local83)) + local687.substring(local216 + 2);
										}
									}
									local216 = local687.indexOf("\\n");
									if (local216 == -1) {
										local961 = local687;
										local687 = "";
									} else {
										local961 = local687.substring(0, local216);
										local687 = local687.substring(local216 + 2);
									}
									if (local83.aBoolean64) {
										local684.method544(local166, local83.aBoolean60, local214, local88 + local83.anInt333 / 2, local961);
									} else {
										local684.method551(local166, local88, local83.aBoolean60, local214, local961);
									}
									local214 += local684.anInt722;
								}
							} else if (local83.anInt348 == 5) {
								@Pc(1023) Class1_Sub2_Sub1_Sub2 local1023;
								if (this.method664(local83)) {
									local1023 = local83.aClass1_Sub2_Sub1_Sub2_1;
								} else {
									local1023 = local83.aClass1_Sub2_Sub1_Sub2_2;
								}
								if (local1023 != null) {
									local1023.method392(local93, local88);
								}
							} else if (local83.anInt348 == 6) {
								local164 = Class1_Sub2_Sub1_Sub3.anInt628;
								local166 = Class1_Sub2_Sub1_Sub3.anInt629;
								Class1_Sub2_Sub1_Sub3.anInt628 = local88 + local83.anInt333 / 2;
								Class1_Sub2_Sub1_Sub3.anInt629 = local93 + local83.anInt349 / 2;
								local170 = Class1_Sub2_Sub1_Sub3.anIntArray145[local83.anInt325] * local83.anInt324 >> 16;
								local181 = Class1_Sub2_Sub1_Sub3.anIntArray146[local83.anInt325] * local83.anInt324 >> 16;
								@Pc(1084) boolean local1084 = this.method664(local83);
								if (local1084) {
									local214 = local83.anInt339;
								} else {
									local214 = local83.anInt338;
								}
								@Pc(1104) Class1_Sub2_Sub2_Sub3 local1104;
								if (local214 == -1) {
									local1104 = local83.method179(local1084, -1, -1);
								} else {
									@Pc(1110) Class36 local1110 = Class36.aClass36Array1[local214];
									local1104 = local83.method179(local1084, local1110.anIntArray132[local83.anInt334], local1110.anIntArray131[local83.anInt334]);
								}
								if (local1104 != null) {
									local1104.method217(local83.anInt326, 0, local83.anInt325, 0, local170, local181);
								}
								Class1_Sub2_Sub1_Sub3.anInt628 = local164;
								Class1_Sub2_Sub1_Sub3.anInt629 = local166;
							} else {
								if (local83.anInt348 == 7) {
									local684 = local83.aClass1_Sub2_Sub1_Sub4_1;
									local166 = 0;
									for (local170 = 0; local170 < local83.anInt349; local170++) {
										for (local181 = 0; local181 < local83.anInt333; local181++) {
											if (local83.anIntArray56[local166] > 0) {
												@Pc(1174) Class38 local1174 = Class38.method409(local83.anIntArray56[local166] - 1);
												@Pc(1178) String local1178 = String.valueOf(local1174.aString14);
												if (local1174.aBoolean123 || local83.anIntArray55[local166] != 1) {
													local1178 = local1178 + " x" + method696(local83.anIntArray55[local166]);
												}
												local216 = local88 + local181 * (local83.anInt337 + 115);
												local223 = local93 + local170 * (local83.anInt344 + 12);
												if (local83.aBoolean64) {
													local684.method544(local83.anInt350, local83.aBoolean60, local223, local216 + local83.anInt333 / 2, local1178);
												} else {
													local684.method551(local83.anInt350, local216, local83.aBoolean60, local223, local1178);
												}
											}
											local166++;
										}
									}
								}
								if (local83.anInt348 == 8 && (this.anInt949 == local83.anInt340 || this.anInt983 == local83.anInt340 || this.anInt843 == local83.anInt340) && this.anInt912 == 100) {
									local164 = 0;
									local166 = 0;
									@Pc(1292) Class1_Sub2_Sub1_Sub4 local1292 = this.aClass1_Sub2_Sub1_Sub4_3;
									@Pc(1295) String local1295 = local83.aString8;
									while (local1295.length() > 0) {
										local214 = local1295.indexOf("\\n");
										if (local214 == -1) {
											local961 = local1295;
											local1295 = "";
										} else {
											local961 = local1295.substring(0, local214);
											local1295 = local1295.substring(local214 + 2);
										}
										local216 = local1292.method545(local961);
										if (local216 > local164) {
											local164 = local216;
										}
										local166 += local1292.anInt722 + 1;
									}
									local164 += 6;
									local166 += 7;
									local214 = local88 + local83.anInt333 - local164 - 5;
									local216 = local93 + local83.anInt349 + 5;
									if (local214 < local88 + 5) {
										local214 = local88 + 5;
									}
									if (local214 + local164 > arg0 + arg1.anInt333) {
										local214 = arg0 + arg1.anInt333 - local164;
									}
									if (local216 + local166 > arg3 + arg1.anInt349) {
										local216 = arg3 + arg1.anInt349 - local166;
									}
									Class1_Sub2_Sub1.method535(16777120, local214, local216, local166, local164);
									Class1_Sub2_Sub1.method536(local216, local164, local214, 0, local166);
									local1295 = local83.aString8;
									local223 = local216 + local1292.anInt722 + 2;
									while (local1295.length() > 0) {
										local248 = local1295.indexOf("\\n");
										if (local248 == -1) {
											local961 = local1295;
											local1295 = "";
										} else {
											local961 = local1295.substring(0, local248);
											local1295 = local1295.substring(local248 + 2);
										}
										local1292.method551(0, local214 + 3, false, local223, local961);
										local223 += local1292.anInt722 + 1;
									}
								}
							}
						}
					}
				}
				Class1_Sub2_Sub1.method532(local29, local31, local33, local35);
			}
		} catch (@Pc(1480) RuntimeException local1480) {
			signlink.reporterror("80206, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -21 + ", " + arg3 + ", " + local1480.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MNKDCXXG;B)V")
	private void method668(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub3 arg1) {
		try {
			this.anInt1040 = 0;
			this.anInt924 = 0;
			this.method647(arg0, arg1);
			this.method596(769, arg0, arg1);
			this.method695(arg0, arg1);
			this.method597(143, arg1, arg0);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt1040; local34++) {
				local41 = this.anIntArray271[local34];
				if (this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local41].anInt769 != anInt1045) {
					this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local41] = null;
				}
			}
			if (arg1.anInt474 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt474 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt923; local41++) {
				if (this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anIntArray247[local41]] == null) {
					signlink.reporterror(this.aString20 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt923);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("1448, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QEHNWGKD;III)V")
	private void method669(@OriginalArg(0) Class1_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg1 * arg1;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(31) int local31 = this.anInt1031 + this.anInt877 & 0x7FF;
				@Pc(35) int local35 = Class1_Sub2_Sub2_Sub3.anIntArray96[local31];
				@Pc(39) int local39 = Class1_Sub2_Sub2_Sub3.anIntArray97[local31];
				@Pc(48) int local48 = local35 * 256 / (this.anInt993 + 256);
				@Pc(57) int local57 = local39 * 256 / (this.anInt993 + 256);
				@Pc(67) int local67 = arg1 * local48 + arg2 * local57 >> 16;
				@Pc(77) int local77 = arg1 * local57 - arg2 * local48 >> 16;
				@Pc(83) double local83 = Math.atan2((double) local67, (double) local77);
				@Pc(89) int local89 = (int) (Math.sin(local83) * 63.0D);
				@Pc(95) int local95 = (int) (Math.cos(local83) * 57.0D);
				this.aClass1_Sub2_Sub1_Sub2_6.method397(83 - local95 - 20, local89 + 94 + 4 - 10, local83);
			} else {
				this.method713(arg2, arg0, arg1);
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("91769, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 13412 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(3) int local3;
			if (arg0 >= 0) {
				for (local3 = 1; local3 > 0; local3++) {
				}
			}
			if (arg2 >= 1 && arg7 >= 1 && arg2 <= 102 && arg7 <= 102) {
				if (aBoolean215 && arg3 != this.anInt1001) {
					return;
				}
				local3 = 0;
				if (arg1 == 0) {
					local3 = this.aClass16_1.method153(arg3, arg2, arg7);
				}
				if (arg1 == 1) {
					local3 = this.aClass16_1.method154(arg2, arg7, arg3);
				}
				if (arg1 == 2) {
					local3 = this.aClass16_1.method155(arg3, arg2, arg7);
				}
				if (arg1 == 3) {
					local3 = this.aClass16_1.method156(arg3, arg2, arg7);
				}
				@Pc(85) int local85;
				if (local3 != 0) {
					local85 = this.aClass16_1.method157(arg3, arg2, arg7, local3);
					@Pc(91) int local91 = local3 >> 14 & 0x7FFF;
					@Pc(95) int local95 = local85 & 0x1F;
					@Pc(99) int local99 = local85 >> 6;
					@Pc(111) Class27 local111;
					if (arg1 == 0) {
						this.aClass16_1.method144(arg3, arg7, arg2);
						local111 = Class27.method282(local91);
						if (local111.aBoolean93) {
							this.aClass10Array1[arg3].method108(arg2, local95, local99, arg7, local111.aBoolean84);
						}
					}
					if (arg1 == 1) {
						this.aClass16_1.method145(arg7, arg2, arg3);
					}
					if (arg1 == 2) {
						this.aClass16_1.method146(arg3, arg2, arg7);
						local111 = Class27.method282(local91);
						if (arg2 + local111.anInt447 > 103 || arg7 + local111.anInt447 > 103 || arg2 + local111.anInt450 > 103 || arg7 + local111.anInt450 > 103) {
							return;
						}
						if (local111.aBoolean93) {
							this.aClass10Array1[arg3].method109(arg2, 369, local99, local111.anInt447, arg7, local111.anInt450, local111.aBoolean84);
						}
					}
					if (arg1 == 3) {
						this.aClass16_1.method147(arg2, arg3, arg7);
						local111 = Class27.method282(local91);
						if (local111.aBoolean93 && local111.aBoolean88) {
							this.aClass10Array1[arg3].method111(arg7, arg2);
						}
					}
				}
				if (arg4 >= 0) {
					local85 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray8[1][arg2][arg7] & 0x2) == 2) {
						local85 = arg3 + 1;
					}
					Class46.method512(arg2, local85, arg3, arg4, arg5, arg6, this.aClass10Array1[arg3], this.aClass16_1, this.anIntArrayArrayArray8, arg7);
					return;
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("42446, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method671() {
		try {
			this.aBoolean188 = true;
			try {
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(13) int local13 = 0;
				@Pc(15) int local15 = 20;
				while (this.aBoolean223) {
					this.anInt929++;
					this.method694((byte) 5);
					this.method694((byte) 5);
					this.method625();
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
			this.aBoolean188 = false;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("27342, " + 15226 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method672(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt1048 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(15) String[] local15 = new String[100];
				@Pc(17) int local17 = 0;
				while (true) {
					@Pc(21) int local21 = local12.indexOf(" ");
					if (local21 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local17++] = local12.toLowerCase();
						}
						this.anInt1048 = 0;
						label49: for (local21 = 0; local21 < Class38.anInt572; local21++) {
							@Pc(77) Class38 local77 = Class38.method409(local21);
							if (local77.anInt578 == -1 && local77.aString14 != null) {
								@Pc(88) String local88 = local77.aString14.toLowerCase();
								for (@Pc(90) int local90 = 0; local90 < local17; local90++) {
									if (local88.indexOf(local15[local90]) == -1) {
										continue label49;
									}
								}
								this.aStringArray14[this.anInt1048] = local88;
								this.anIntArray272[this.anInt1048] = local21;
								this.anInt1048++;
								if (this.anInt1048 >= this.aStringArray14.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(30) String local30 = local12.substring(0, local21).trim();
					if (local30.length() > 0) {
						local15[local17++] = local30.toLowerCase();
					}
					local12 = local12.substring(local21 + 1);
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("61123, " + 7 + ", " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method673(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass31_2.method352("title.dat", null);
			@Pc(13) Class1_Sub2_Sub1_Sub2 local13 = new Class1_Sub2_Sub1_Sub2(local7, this);
			this.aClass26_10.method279();
			local13.method390(0, 0);
			this.aClass26_11.method279();
			local13.method390(-637, 0);
			this.aClass26_7.method279();
			local13.method390(-128, 0);
			this.aClass26_8.method279();
			local13.method390(-202, -371);
			this.aClass26_9.method279();
			local13.method390(-202, -171);
			this.aClass26_12.method279();
			local13.method390(0, -265);
			this.aClass26_13.method279();
			local13.method390(-562, -265);
			this.aClass26_14.method279();
			local13.method390(-128, -171);
			this.aClass26_15.method279();
			local13.method390(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt560];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt561; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt560; local104++) {
					local98[local104] = local13.anIntArray136[local13.anInt560 + local13.anInt560 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt560; local130++) {
					local13.anIntArray136[local130 + local13.anInt560 * local100] = local98[local130];
				}
			}
			this.aClass26_10.method279();
			if (arg0) {
				this.anInt926 = this.aClass41_2.method450();
			}
			local13.method390(382, 0);
			this.aClass26_11.method279();
			local13.method390(-255, 0);
			this.aClass26_7.method279();
			local13.method390(254, 0);
			this.aClass26_8.method279();
			local13.method390(180, -371);
			this.aClass26_9.method279();
			local13.method390(180, -171);
			this.aClass26_12.method279();
			local13.method390(382, -265);
			this.aClass26_13.method279();
			local13.method390(-180, -265);
			this.aClass26_14.method279();
			local13.method390(254, -171);
			this.aClass26_15.method279();
			local13.method390(-180, -171);
			local13 = new Class1_Sub2_Sub1_Sub2(this.aClass31_2, "logo", 0);
			this.aClass26_7.method279();
			local13.method392(18, 382 - local13.anInt560 / 2 - 128);
			System.gc();
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("89427, " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	private boolean method674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg1;
			@Pc(39) int local39 = arg3;
			this.anIntArrayArray25[arg1][arg3] = 99;
			this.anIntArrayArray22[arg1][arg3] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray274[0] = arg1;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray275[0] = arg3;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray274.length;
			@Pc(81) int[][] local81 = this.aClass10Array1[this.anInt1001].anIntArrayArray3;
			@Pc(199) int local199;
			while (local57 != local66) {
				local11 = this.anIntArray274[local57];
				local39 = this.anIntArray275[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg4 && local39 == arg7) {
					local70 = true;
					break;
				}
				if (arg9 != 0) {
					if ((arg9 < 5 || arg9 == 10) && this.aClass10Array1[this.anInt1001].method112(arg9 - 1, arg5, local11, arg7, local39, arg4)) {
						local70 = true;
						break;
					}
					if (arg9 < 10 && this.aClass10Array1[this.anInt1001].method113(arg7, arg9 - 1, arg5, arg4, local11, local39)) {
						local70 = true;
						break;
					}
				}
				if (arg0 != 0 && arg2 != 0 && this.aClass10Array1[this.anInt1001].method114(arg2, local39, local11, arg4, arg0, arg7, arg8)) {
					local70 = true;
					break;
				}
				local199 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray274[local66] = local11 - 1;
					this.anIntArray275[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local199;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray274[local66] = local11 + 1;
					this.anIntArray275[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local199;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local66] = local11;
					this.anIntArray275[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local199;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local66] = local11;
					this.anIntArray275[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local199;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local66] = local11 - 1;
					this.anIntArray275[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local199;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local66] = local11 + 1;
					this.anIntArray275[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local199;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local66] = local11 - 1;
					this.anIntArray275[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local199;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local66] = local11 + 1;
					this.anIntArray275[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local199;
				}
			}
			this.anInt974 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local70) {
				if (!arg10) {
					return false;
				}
				local199 = 1000;
				local815 = 100;
				for (local821 = arg4 - 10; local821 <= arg4 + 10; local821++) {
					for (local827 = arg7 - 10; local827 <= arg7 + 10; local827++) {
						if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray22[local821][local827] < 100) {
							@Pc(849) int local849 = 0;
							if (local821 < arg4) {
								local849 = arg4 - local821;
							} else if (local821 > arg4 + arg0 - 1) {
								local849 = local821 + 1 - arg4 - arg0;
							}
							@Pc(875) int local875 = 0;
							if (local827 < arg7) {
								local875 = arg7 - local827;
							} else if (local827 > arg7 + arg2 - 1) {
								local875 = local827 + 1 - arg7 - arg2;
							}
							@Pc(907) int local907 = local849 * local849 + local875 * local875;
							if (local907 < local199 || local907 == local199 && this.anIntArrayArray22[local821][local827] < local815) {
								local199 = local907;
								local815 = this.anIntArrayArray22[local821][local827];
								local11 = local821;
								local39 = local827;
							}
						}
					}
				}
				if (local199 == 1000) {
					return false;
				}
				if (local11 == arg1 && local39 == arg3) {
					return false;
				}
				this.anInt974 = 1;
			}
			@Pc(968) byte local968 = 0;
			this.anIntArray274[0] = local11;
			local57 = local968 + 1;
			this.anIntArray275[0] = local39;
			local199 = local815 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg1 || local39 != arg3) {
				if (local199 != local815) {
					local815 = local199;
					this.anIntArray274[local57] = local11;
					this.anIntArray275[local57++] = local39;
				}
				if ((local199 & 0x2) != 0) {
					local11++;
				} else if ((local199 & 0x8) != 0) {
					local11--;
				}
				if ((local199 & 0x1) != 0) {
					local39++;
				} else if ((local199 & 0x4) != 0) {
					local39--;
				}
				local199 = this.anIntArrayArray25[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				@Pc(1058) int local1058 = this.anIntArray274[local57];
				local821 = this.anIntArray275[local57];
				if (arg6 == 0) {
					this.aClass1_Sub2_Sub3_9.method296(100, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(local74 + local74 + 3);
				}
				if (arg6 == 1) {
					this.aClass1_Sub2_Sub3_9.method296(158, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(local74 + local74 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass1_Sub2_Sub3_9.method296(55, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(local74 + local74 + 3);
				}
				this.aClass1_Sub2_Sub3_9.method331(local821 + this.anInt959);
				this.aClass1_Sub2_Sub3_9.method298(local1058 + this.anInt958);
				this.anInt989 = this.anIntArray274[0];
				this.anInt990 = this.anIntArray275[0];
				for (local827 = 1; local827 < local74; local827++) {
					local57--;
					this.aClass1_Sub2_Sub3_9.method324(this.anIntArray274[local57] - local1058);
					this.aClass1_Sub2_Sub3_9.method325(this.anIntArray275[local57] - local821);
				}
				this.aClass1_Sub2_Sub3_9.method324(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1194) RuntimeException local1194) {
			signlink.reporterror("7381, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 988 + ", " + arg9 + ", " + arg10 + ", " + local1194.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!MNKDCXXG;)V")
	private void method675(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub3 arg1) {
		try {
			arg1.method317((byte) 3);
			@Pc(19) int local19 = arg1.method318(8);
			@Pc(25) int local25;
			if (local19 < this.anInt975) {
				for (local25 = local19; local25 < this.anInt975; local25++) {
					this.anIntArray271[this.anInt1040++] = this.anIntArray256[local25];
				}
			}
			if (local19 > this.anInt975) {
				signlink.reporterror(this.aString20 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt975 = 0;
			for (local25 = 0; local25 < local19; local25++) {
				@Pc(77) int local77 = this.anIntArray256[local25];
				@Pc(82) Class1_Sub2_Sub2_Sub1_Sub2 local82 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local77];
				@Pc(87) int local87 = arg1.method318(1);
				if (local87 == 0) {
					this.anIntArray256[this.anInt975++] = local77;
					local82.anInt769 = anInt1045;
				} else {
					@Pc(110) int local110 = arg1.method318(2);
					if (local110 == 0) {
						this.anIntArray256[this.anInt975++] = local77;
						local82.anInt769 = anInt1045;
						this.anIntArray248[this.anInt924++] = local77;
					} else {
						@Pc(161) int local161;
						@Pc(171) int local171;
						if (local110 == 1) {
							this.anIntArray256[this.anInt975++] = local77;
							local82.anInt769 = anInt1045;
							local161 = arg1.method318(3);
							local82.method569(local161, false);
							local171 = arg1.method318(1);
							if (local171 == 1) {
								this.anIntArray248[this.anInt924++] = local77;
							}
						} else if (local110 == 2) {
							this.anIntArray256[this.anInt975++] = local77;
							local82.anInt769 = anInt1045;
							local161 = arg1.method318(3);
							local82.method569(local161, true);
							local171 = arg1.method318(3);
							local82.method569(local171, true);
							@Pc(229) int local229 = arg1.method318(1);
							if (local229 == 1) {
								this.anIntArray248[this.anInt924++] = local77;
							}
						} else if (local110 == 3) {
							this.anIntArray271[this.anInt1040++] = local77;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("35704, " + arg0 + ", " + -121 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Z")
	private boolean method676() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("75082, " + -23841 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method677() {
		try {
			this.aBoolean223 = false;
			while (this.aBoolean188) {
				this.aBoolean223 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub2_Sub1_Sub1_6 = null;
			this.aClass1_Sub2_Sub1_Sub1_7 = null;
			this.aClass1_Sub2_Sub1_Sub1Array4 = null;
			this.anIntArray217 = null;
			this.anIntArray218 = null;
			this.anIntArray219 = null;
			this.anIntArray220 = null;
			this.anIntArray215 = null;
			this.anIntArray216 = null;
			this.anIntArray253 = null;
			this.aBoolean217 &= true;
			this.anIntArray254 = null;
			this.aClass1_Sub2_Sub1_Sub2_16 = null;
			this.aClass1_Sub2_Sub1_Sub2_17 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("80061, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method678() {
		try {
			try {
				@Pc(18) int local18 = aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 + this.anInt841;
				@Pc(24) int local24 = aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 + this.anInt1006;
				if (this.anInt837 - local18 < -500 || this.anInt837 - local18 > 500 || this.anInt838 - local24 < -500 || this.anInt838 - local24 > 500) {
					this.anInt837 = local18;
					this.anInt838 = local24;
				}
				if (this.anInt837 != local18) {
					this.anInt837 += (local18 - this.anInt837) / 16;
				}
				if (this.anInt838 != local24) {
					this.anInt838 += (local24 - this.anInt838) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1032 += (-this.anInt1032 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1032 += (24 - this.anInt1032) / 2;
				} else {
					this.anInt1032 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1033 += (12 - this.anInt1033) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1033 += (-this.anInt1033 - 12) / 2;
				} else {
					this.anInt1033 /= 2;
				}
				this.anInt1031 = this.anInt1031 + this.anInt1032 / 2 & 0x7FF;
				this.anInt1030 += this.anInt1033 / 2;
				if (this.anInt1030 < 128) {
					this.anInt1030 = 128;
				}
				if (this.anInt1030 > 383) {
					this.anInt1030 = 383;
				}
				@Pc(211) int local211 = this.anInt837 >> 7;
				@Pc(216) int local216 = this.anInt838 >> 7;
				@Pc(226) int local226 = this.method715(this.anInt838, this.anInt837, this.anInt1001);
				@Pc(228) int local228 = 0;
				@Pc(244) int local244;
				if (local211 > 3 && local216 > 3 && local211 < 100 && local216 < 100) {
					for (local244 = local211 - 4; local244 <= local211 + 4; local244++) {
						for (@Pc(250) int local250 = local216 - 4; local250 <= local216 + 4; local250++) {
							@Pc(255) int local255 = this.anInt1001;
							if (local255 < 3 && (this.aByteArrayArrayArray8[1][local244][local250] & 0x2) == 2) {
								local255++;
							}
							@Pc(282) int local282 = local226 - this.anIntArrayArrayArray8[local255][local244][local250];
							if (local282 > local228) {
								local228 = local282;
							}
						}
					}
				}
				local244 = local228 * 192;
				if (local244 > 98048) {
					local244 = 98048;
				}
				if (local244 < 32768) {
					local244 = 32768;
				}
				if (local244 > this.anInt933) {
					this.anInt933 += (local244 - this.anInt933) / 24;
				} else if (local244 < this.anInt933) {
					this.anInt933 += (local244 - this.anInt933) / 80;
				}
			} catch (@Pc(346) Exception local346) {
				signlink.reporterror("glfc_ex " + aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 + "," + aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 + "," + this.anInt837 + "," + this.anInt838 + "," + this.anInt1059 + "," + this.anInt1060 + "," + this.anInt958 + "," + this.anInt959);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("23679, " + -39 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!IJOSTBQT;III)V")
	private void method679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class18 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (arg8 != 0) {
				this.anInt886 = this.aClass41_2.method450();
			}
			if (this.aBoolean197) {
				this.anInt859 = 32;
			} else {
				this.anInt859 = 0;
			}
			this.aBoolean197 = false;
			if (arg6 >= arg7 && arg6 < arg7 + 16 && arg1 >= arg4 && arg1 < arg4 + 16) {
				arg5.anInt321 -= this.anInt874 * 4;
				if (arg3 == 1) {
					this.aBoolean202 = true;
				}
				if (arg3 == 2 || arg3 == 3) {
					this.aBoolean209 = true;
				}
			} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg1 >= arg4 + arg2 - 16 && arg1 < arg4 + arg2) {
				arg5.anInt321 += this.anInt874 * 4;
				if (arg3 == 1) {
					this.aBoolean202 = true;
				}
				if (arg3 == 2 || arg3 == 3) {
					this.aBoolean209 = true;
				}
			} else if (arg6 >= arg7 - this.anInt859 && arg6 < arg7 + this.anInt859 + 16 && arg1 >= arg4 + 16 && arg1 < arg4 + arg2 - 16 && this.anInt874 > 0) {
				@Pc(143) int local143 = (arg2 - 32) * arg2 / arg0;
				if (local143 < 8) {
					local143 = 8;
				}
				@Pc(158) int local158 = arg1 - arg4 - local143 / 2 - 16;
				@Pc(164) int local164 = arg2 - local143 - 32;
				arg5.anInt321 = (arg0 - arg2) * local158 / local164;
				if (arg3 == 1) {
					this.aBoolean202 = true;
				}
				if (arg3 == 2 || arg3 == 3) {
					this.aBoolean209 = true;
				}
				this.aBoolean197 = true;
			}
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("51012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method680() {
		try {
			try {
				if (this.aClass45_1 != null) {
					this.aClass45_1.method500();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass45_1 = null;
			this.aBoolean217 = false;
			this.anInt840 = 0;
			this.aString20 = "";
			this.aString21 = "";
			this.method634();
			this.aClass16_1.method127();
			for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
				this.aClass10Array1[local38].method103();
			}
			System.gc();
			this.method703();
			this.anInt936 = -1;
			this.anInt1038 = -1;
			this.anInt1043 = 0;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("92765, " + true + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	private void method681(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg1 == 5) {
				@Pc(4) boolean local4 = false;
			} else {
				this.method581();
			}
			@Pc(20) int local20;
			if (this.aClass26_5 != null) {
				this.aClass26_5.method279();
				Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
				local20 = 151;
				if (arg0 != null) {
					local20 -= 7;
				}
				this.aClass1_Sub2_Sub1_Sub4_3.method543(0, local20, 257, arg2);
				this.aClass1_Sub2_Sub1_Sub4_3.method543(16777215, local20 - 1, 256, arg2);
				local20 += 15;
				if (arg0 != null) {
					this.aClass1_Sub2_Sub1_Sub4_3.method543(0, local20, 257, arg0);
					this.aClass1_Sub2_Sub1_Sub4_3.method543(16777215, local20 - 1, 256, arg0);
				}
				this.aClass26_5.method280(super.aGraphics2, 4, 4, (byte) 1);
			} else if (super.aClass26_2 != null) {
				super.aClass26_2.method279();
				Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray238;
				local20 = 251;
				Class1_Sub2_Sub1.method535(0, 233, 221, 50, 300);
				Class1_Sub2_Sub1.method536(221, 300, 233, 16777215, 50);
				if (arg0 != null) {
					local20 -= 7;
				}
				this.aClass1_Sub2_Sub1_Sub4_3.method543(0, local20, 383, arg2);
				this.aClass1_Sub2_Sub1_Sub4_3.method543(16777215, local20 - 1, 382, arg2);
				local20 += 15;
				if (arg0 != null) {
					this.aClass1_Sub2_Sub1_Sub4_3.method543(0, local20, 383, arg0);
					this.aClass1_Sub2_Sub1_Sub4_3.method543(16777215, local20 - 1, 382, arg0);
				}
				super.aClass26_2.method280(super.aGraphics2, 0, 0, (byte) 1);
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("94316, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method587(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method682(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local11 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local11 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("4502, " + -750 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	private void method683(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg1 == 0 && this.anInt1020 != -1) {
				this.aString19 = arg0;
				super.anInt820 = 0;
			}
			if (this.anInt956 == -1) {
				this.aBoolean209 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray221[local20] = this.anIntArray221[local20 - 1];
				this.aStringArray10[local20] = this.aStringArray10[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
			}
			this.anIntArray221[0] = arg1;
			this.aStringArray10[0] = arg2;
			this.aStringArray11[0] = arg0;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("98958, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -212 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(3) int local3 = 31 / arg0;
			return arg2 == null ? true : signlink.wavesave(arg2, arg1);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("25999, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			if (10685 == this.anInt862 && (!this.aBoolean189 && !this.aBoolean231 && !this.aBoolean201)) {
				anInt1045++;
				if (this.aBoolean217) {
					this.method724();
				} else {
					this.method594();
				}
				this.method722();
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("76469, " + 10685 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method685(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			signlink.anInt1070 = arg1;
			if (!arg0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("34837, " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIILclient!CQCDOTXO;I)V")
	private void method686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		try {
			this.aBoolean217 &= true;
			if (arg2 != aClass1_Sub2_Sub2_Sub1_Sub1_1 && this.anInt1041 < 400) {
				@Pc(41) String local41;
				if (arg2.anInt185 == 0) {
					local41 = arg2.aString3 + method687(aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt180, arg2.anInt180) + " (level-" + arg2.anInt180 + ")";
				} else {
					local41 = arg2.aString3 + " (skill-" + arg2.anInt185 + ")";
				}
				@Pc(171) int local171;
				if (this.anInt939 == 1) {
					this.aStringArray8[this.anInt1041] = "Use " + this.aString22 + " with @whi@" + local41;
					this.anIntArray244[this.anInt1041] = 783;
					this.anIntArray245[this.anInt1041] = arg0;
					this.anIntArray242[this.anInt1041] = arg1;
					this.anIntArray243[this.anInt1041] = arg3;
					this.anInt1041++;
				} else if (this.anInt977 != 1) {
					for (local171 = 4; local171 >= 0; local171--) {
						if (this.aStringArray13[local171] != null) {
							this.aStringArray8[this.anInt1041] = this.aStringArray13[local171] + " @whi@" + local41;
							@Pc(198) short local198 = 0;
							if (this.aStringArray13[local171].equalsIgnoreCase("attack")) {
								if (arg2.anInt180 > aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt180) {
									local198 = 2000;
								}
								if (aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt176 != 0 && arg2.anInt176 != 0) {
									if (aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt176 == arg2.anInt176) {
										local198 = 2000;
									} else {
										local198 = 0;
									}
								}
							} else if (this.aBooleanArray11[local171]) {
								local198 = 2000;
							}
							if (local171 == 0) {
								this.anIntArray244[this.anInt1041] = local198 + 197;
							}
							if (local171 == 1) {
								this.anIntArray244[this.anInt1041] = local198 + 2;
							}
							if (local171 == 2) {
								this.anIntArray244[this.anInt1041] = local198 + 309;
							}
							if (local171 == 3) {
								this.anIntArray244[this.anInt1041] = local198 + 471;
							}
							if (local171 == 4) {
								this.anIntArray244[this.anInt1041] = local198 + 217;
							}
							this.anIntArray245[this.anInt1041] = arg0;
							this.anIntArray242[this.anInt1041] = arg1;
							this.anIntArray243[this.anInt1041] = arg3;
							this.anInt1041++;
						}
					}
				} else if ((this.anInt979 & 0x8) == 8) {
					this.aStringArray8[this.anInt1041] = this.aString23 + " @whi@" + local41;
					this.anIntArray244[this.anInt1041] = 359;
					this.anIntArray245[this.anInt1041] = arg0;
					this.anIntArray242[this.anInt1041] = arg1;
					this.anIntArray243[this.anInt1041] = arg3;
					this.anInt1041++;
				}
				for (local171 = 0; local171 < this.anInt1041; local171++) {
					if (this.anIntArray244[local171] == 957) {
						this.aStringArray8[local171] = "Walk here @whi@" + local41;
						return;
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("40163, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt972 = Integer.parseInt(this.getParameter("nodeid"));
		anInt973 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method726();
		} else {
			method718(anInt918);
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean214 = false;
		} else {
			aBoolean214 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method688() {
		try {
			if (this.anInt939 == 0 && this.anInt977 == 0) {
				this.aStringArray8[this.anInt1041] = "Walk here";
				this.anIntArray244[this.anInt1041] = 957;
				this.anIntArray242[this.anInt1041] = super.anInt815;
				this.anIntArray243[this.anInt1041] = super.anInt816;
				this.anInt1041++;
			}
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < Class1_Sub2_Sub2_Sub3.anInt384; local51++) {
				@Pc(57) int local57 = Class1_Sub2_Sub2_Sub3.anIntArray95[local51];
				@Pc(61) int local61 = local57 & 0x7F;
				@Pc(67) int local67 = local57 >> 7 & 0x7F;
				@Pc(73) int local73 = local57 >> 29 & 0x3;
				@Pc(79) int local79 = local57 >> 14 & 0x7FFF;
				if (local57 != local49) {
					local49 = local57;
					@Pc(226) int local226;
					if (local73 == 2 && this.aClass16_1.method157(this.anInt1001, local61, local67, local57) >= 0) {
						@Pc(99) Class27 local99 = Class27.method282(local79);
						if (local99.anIntArray105 != null) {
							local99 = local99.method287();
						}
						if (local99 == null) {
							continue;
						}
						if (this.anInt939 == 1) {
							this.aStringArray8[this.anInt1041] = "Use " + this.aString22 + " with @cya@" + local99.aString11;
							this.anIntArray244[this.anInt1041] = 230;
							this.anIntArray245[this.anInt1041] = local57;
							this.anIntArray242[this.anInt1041] = local61;
							this.anIntArray243[this.anInt1041] = local67;
							this.anInt1041++;
						} else if (this.anInt977 != 1) {
							if (local99.aStringArray3 != null) {
								for (local226 = 4; local226 >= 0; local226--) {
									if (local99.aStringArray3[local226] != null) {
										this.aStringArray8[this.anInt1041] = local99.aStringArray3[local226] + " @cya@" + local99.aString11;
										if (local226 == 0) {
											this.anIntArray244[this.anInt1041] = 641;
										}
										if (local226 == 1) {
											this.anIntArray244[this.anInt1041] = 204;
										}
										if (local226 == 2) {
											this.anIntArray244[this.anInt1041] = 181;
										}
										if (local226 == 3) {
											this.anIntArray244[this.anInt1041] = 929;
										}
										if (local226 == 4) {
											this.anIntArray244[this.anInt1041] = 1129;
										}
										this.anIntArray245[this.anInt1041] = local57;
										this.anIntArray242[this.anInt1041] = local61;
										this.anIntArray243[this.anInt1041] = local67;
										this.anInt1041++;
									}
								}
							}
							this.aStringArray8[this.anInt1041] = "Examine @cya@" + local99.aString11;
							this.anIntArray244[this.anInt1041] = 1927;
							this.anIntArray245[this.anInt1041] = local99.anInt461 << 14;
							this.anIntArray242[this.anInt1041] = local61;
							this.anIntArray243[this.anInt1041] = local67;
							this.anInt1041++;
						} else if ((this.anInt979 & 0x4) == 4) {
							this.aStringArray8[this.anInt1041] = this.aString23 + " @cya@" + local99.aString11;
							this.anIntArray244[this.anInt1041] = 370;
							this.anIntArray245[this.anInt1041] = local57;
							this.anIntArray242[this.anInt1041] = local61;
							this.anIntArray243[this.anInt1041] = local67;
							this.anInt1041++;
						}
					}
					@Pc(406) Class1_Sub2_Sub2_Sub1_Sub2 local406;
					@Pc(454) Class1_Sub2_Sub2_Sub1_Sub1 local454;
					@Pc(444) int local444;
					if (local73 == 1) {
						@Pc(377) Class1_Sub2_Sub2_Sub1_Sub2 local377 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local79];
						if (local377.aClass34_2.aByte24 == 1 && (local377.anInt776 & 0x7F) == 64 && (local377.anInt777 & 0x7F) == 64) {
							for (local226 = 0; local226 < this.anInt975; local226++) {
								local406 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[this.anIntArray256[local226]];
								if (local406 != null && local406 != local377 && local406.aClass34_2.aByte24 == 1 && local406.anInt776 == local377.anInt776 && local406.anInt777 == local377.anInt777) {
									this.method652(local406.aClass34_2, this.anIntArray256[local226], local61, local67);
								}
							}
							for (local444 = 0; local444 < this.anInt923; local444++) {
								local454 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anIntArray247[local444]];
								if (local454 != null && local454.anInt776 == local377.anInt776 && local454.anInt777 == local377.anInt777) {
									this.method686(this.anIntArray247[local444], local61, local454, local67);
								}
							}
						}
						this.method652(local377.aClass34_2, local79, local61, local67);
					}
					if (local73 == 0) {
						@Pc(496) Class1_Sub2_Sub2_Sub1_Sub1 local496 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local79];
						if ((local496.anInt776 & 0x7F) == 64 && (local496.anInt777 & 0x7F) == 64) {
							for (local226 = 0; local226 < this.anInt975; local226++) {
								local406 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[this.anIntArray256[local226]];
								if (local406 != null && local406.aClass34_2.aByte24 == 1 && local406.anInt776 == local496.anInt776 && local406.anInt777 == local496.anInt777) {
									this.method652(local406.aClass34_2, this.anIntArray256[local226], local61, local67);
								}
							}
							for (local444 = 0; local444 < this.anInt923; local444++) {
								local454 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anIntArray247[local444]];
								if (local454 != null && local454 != local496 && local454.anInt776 == local496.anInt776 && local454.anInt777 == local496.anInt777) {
									this.method686(this.anIntArray247[local444], local61, local454, local67);
								}
							}
						}
						this.method686(local79, local61, local496, local67);
					}
					if (local73 == 3) {
						@Pc(615) Class42 local615 = this.aClass42ArrayArrayArray1[this.anInt1001][local61][local67];
						if (local615 != null) {
							for (@Pc(622) Class1_Sub2_Sub2_Sub2 local622 = (Class1_Sub2_Sub2_Sub2) local615.method488(); local622 != null; local622 = (Class1_Sub2_Sub2_Sub2) local615.method490(this.anInt1050)) {
								@Pc(628) Class38 local628 = Class38.method409(local622.anInt224);
								if (this.anInt939 == 1) {
									this.aStringArray8[this.anInt1041] = "Use " + this.aString22 + " with @lre@" + local628.aString14;
									this.anIntArray244[this.anInt1041] = 271;
									this.anIntArray245[this.anInt1041] = local622.anInt224;
									this.anIntArray242[this.anInt1041] = local61;
									this.anIntArray243[this.anInt1041] = local67;
									this.anInt1041++;
								} else if (this.anInt977 != 1) {
									for (@Pc(745) int local745 = 4; local745 >= 0; local745--) {
										if (local628.aStringArray6 != null && local628.aStringArray6[local745] != null) {
											this.aStringArray8[this.anInt1041] = local628.aStringArray6[local745] + " @lre@" + local628.aString14;
											if (local745 == 0) {
												this.anIntArray244[this.anInt1041] = 42;
											}
											if (local745 == 1) {
												this.anIntArray244[this.anInt1041] = 895;
											}
											if (local745 == 2) {
												this.anIntArray244[this.anInt1041] = 852;
											}
											if (local745 == 3) {
												this.anIntArray244[this.anInt1041] = 172;
											}
											if (local745 == 4) {
												this.anIntArray244[this.anInt1041] = 493;
											}
											this.anIntArray245[this.anInt1041] = local622.anInt224;
											this.anIntArray242[this.anInt1041] = local61;
											this.anIntArray243[this.anInt1041] = local67;
											this.anInt1041++;
										} else if (local745 == 2) {
											this.aStringArray8[this.anInt1041] = "Take @lre@" + local628.aString14;
											this.anIntArray244[this.anInt1041] = 852;
											this.anIntArray245[this.anInt1041] = local622.anInt224;
											this.anIntArray242[this.anInt1041] = local61;
											this.anIntArray243[this.anInt1041] = local67;
											this.anInt1041++;
										}
									}
									this.aStringArray8[this.anInt1041] = "Examine @lre@" + local628.aString14;
									this.anIntArray244[this.anInt1041] = 1253;
									this.anIntArray245[this.anInt1041] = local622.anInt224;
									this.anIntArray242[this.anInt1041] = local61;
									this.anIntArray243[this.anInt1041] = local67;
									this.anInt1041++;
								} else if ((this.anInt979 & 0x1) == 1) {
									this.aStringArray8[this.anInt1041] = this.aString23 + " @lre@" + local628.aString14;
									this.anIntArray244[this.anInt1041] = 602;
									this.anIntArray245[this.anInt1041] = local622.anInt224;
									this.anIntArray242[this.anInt1041] = local61;
									this.anIntArray243[this.anInt1041] = local67;
									this.anInt1041++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(953) RuntimeException local953) {
			signlink.reporterror("16354, " + 48267 + ", " + local953.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)Ljava/lang/String;")
	private String method689() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("40497, " + -133 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method690(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt998 == 0) {
				this.aStringArray8[0] = "Cancel";
				this.anIntArray244[0] = 1086;
				this.anInt1041 = 1;
				if (this.anInt1008 == -1) {
					this.method702();
					this.anInt919 = 0;
					this.anInt946 = 0;
					if (super.anInt815 > 4 && super.anInt816 > 4 && super.anInt815 < 516 && super.anInt816 < 338) {
						if (this.anInt1056 == -1) {
							this.method688();
						} else {
							this.method590(4, 0, super.anInt816, 4, Class18.method187(this.anInt1056), super.anInt815, 0);
						}
					}
					if (this.anInt919 != this.anInt1058) {
						this.anInt1058 = this.anInt919;
					}
					if (this.anInt946 != this.anInt843) {
						this.anInt843 = this.anInt946;
					}
					this.anInt919 = 0;
					this.anInt946 = 0;
					if (super.anInt815 > 553 && super.anInt816 > 205 && super.anInt815 < 743 && super.anInt816 < 466) {
						if (this.anInt896 != -1) {
							this.method590(205, 1, super.anInt816, 553, Class18.method187(this.anInt896), super.anInt815, 0);
						} else if (this.anIntArray246[this.anInt913] != -1) {
							this.method590(205, 1, super.anInt816, 553, Class18.method187(this.anIntArray246[this.anInt913]), super.anInt815, 0);
						}
					}
					if (this.anInt919 != this.anInt857) {
						this.aBoolean202 = true;
						this.anInt857 = this.anInt919;
					}
					if (this.anInt946 != this.anInt983) {
						this.aBoolean202 = true;
						this.anInt983 = this.anInt946;
					}
					this.anInt919 = 0;
					this.anInt946 = 0;
					if (super.anInt815 > 17 && super.anInt816 > 357 && super.anInt815 < 496 && super.anInt816 < 453) {
						if (this.anInt956 != -1) {
							this.method590(357, 2, super.anInt816, 17, Class18.method187(this.anInt956), super.anInt815, 0);
						} else if (this.anInt1020 != -1) {
							this.method590(357, 3, super.anInt816, 17, Class18.method187(this.anInt1020), super.anInt815, 0);
						} else if (super.anInt816 < 434 && super.anInt815 < 426 && this.anInt861 == 0) {
							this.method589(super.anInt816 - 357, super.anInt815 - 17);
						}
					}
					if ((this.anInt956 != -1 || this.anInt1020 != -1) && this.anInt919 != this.anInt1022) {
						this.aBoolean209 = true;
						this.anInt1022 = this.anInt919;
					}
					if ((this.anInt956 != -1 || this.anInt1020 != -1) && this.anInt946 != this.anInt949) {
						this.aBoolean209 = true;
						this.anInt949 = this.anInt946;
					}
					@Pc(343) boolean local343 = false;
					@Pc(348) boolean local348 = false;
					while (!local343) {
						local343 = true;
						for (@Pc(359) int local359 = 0; local359 < this.anInt1041 - 1; local359++) {
							if (this.anIntArray244[local359] < 1000 && this.anIntArray244[local359 + 1] > 1000) {
								@Pc(380) String local380 = this.aStringArray8[local359];
								this.aStringArray8[local359] = this.aStringArray8[local359 + 1];
								this.aStringArray8[local359 + 1] = local380;
								@Pc(402) int local402 = this.anIntArray244[local359];
								this.anIntArray244[local359] = this.anIntArray244[local359 + 1];
								this.anIntArray244[local359 + 1] = local402;
								@Pc(424) int local424 = this.anIntArray242[local359];
								this.anIntArray242[local359] = this.anIntArray242[local359 + 1];
								this.anIntArray242[local359 + 1] = local424;
								@Pc(446) int local446 = this.anIntArray243[local359];
								this.anIntArray243[local359] = this.anIntArray243[local359 + 1];
								this.anIntArray243[local359 + 1] = local446;
								@Pc(468) int local468 = this.anIntArray245[local359];
								this.anIntArray245[local359] = this.anIntArray245[local359 + 1];
								this.anIntArray245[local359 + 1] = local468;
								local343 = false;
							}
						}
					}
				} else {
					this.anInt919 = 0;
					this.anInt946 = 0;
					this.method590(0, 0, super.anInt816, 0, Class18.method187(this.anInt1008), super.anInt815, 0);
					if (this.anInt919 != this.anInt1058) {
						this.anInt1058 = this.anInt919;
					}
					if (this.anInt946 != this.anInt843) {
						this.anInt843 = this.anInt946;
					}
				}
			}
		} catch (@Pc(498) RuntimeException local498) {
			signlink.reporterror("8282, " + arg0 + ", " + local498.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ATHECRQB;)V")
	private void method691(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg1.anInt3 == 0) {
				local1 = this.aClass16_1.method153(arg1.anInt2, arg1.anInt4, arg1.anInt5);
			}
			if (arg1.anInt3 == 1) {
				local1 = this.aClass16_1.method154(arg1.anInt4, arg1.anInt5, arg1.anInt2);
			}
			if (arg1.anInt3 == 2) {
				local1 = this.aClass16_1.method155(arg1.anInt2, arg1.anInt4, arg1.anInt5);
			}
			if (arg1.anInt3 == 3) {
				local1 = this.aClass16_1.method156(arg1.anInt2, arg1.anInt4, arg1.anInt5);
			}
			@Pc(76) int local76;
			if (local1 != 0) {
				local76 = this.aClass16_1.method157(arg1.anInt2, arg1.anInt4, arg1.anInt5, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg1.anInt9 = local3;
			arg1.anInt11 = local5;
			arg1.anInt10 = local7;
			if (arg0 != this.aByte44) {
				for (local76 = 1; local76 > 0; local76++) {
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("3140, " + arg0 + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method692(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) Class1_Sub2_Sub2_Sub4 local6 = (Class1_Sub2_Sub2_Sub4) this.aClass42_12.method487();
			if (arg0 == 1) {
				@Pc(11) boolean local11 = false;
				while (local6 != null) {
					if (local6.anInt409 != this.anInt1001 || local6.aBoolean75) {
						local6.method571();
					} else if (anInt1045 >= local6.anInt413) {
						local6.method236(this.anInt934);
						if (local6.aBoolean75) {
							local6.method571();
						} else {
							this.aClass16_1.method138(60, 0, local6.anInt409, false, local6.anInt410, local6, local6.anInt412, local6.anInt411, -1);
						}
					}
					local6 = (Class1_Sub2_Sub2_Sub4) this.aClass42_12.method489();
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("97880, " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method693() {
		try {
			this.aClass1_Sub2_Sub1_Sub1_6 = new Class1_Sub2_Sub1_Sub1(this.aClass31_2, "titlebox", 0);
			this.aClass1_Sub2_Sub1_Sub1_7 = new Class1_Sub2_Sub1_Sub1(this.aClass31_2, "titlebutton", 0);
			this.aClass1_Sub2_Sub1_Sub1Array4 = new Class1_Sub2_Sub1_Sub1[12];
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				this.aClass1_Sub2_Sub1_Sub1Array4[local30] = new Class1_Sub2_Sub1_Sub1(this.aClass31_2, "runes", local30);
			}
			this.aClass1_Sub2_Sub1_Sub2_16 = new Class1_Sub2_Sub1_Sub2(128, 265);
			this.aClass1_Sub2_Sub1_Sub2_17 = new Class1_Sub2_Sub1_Sub2(128, 265);
			for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
				this.aClass1_Sub2_Sub1_Sub2_16.anIntArray136[local63] = this.aClass26_10.anIntArray104[local63];
			}
			for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
				this.aClass1_Sub2_Sub1_Sub2_17.anIntArray136[local81] = this.aClass26_11.anIntArray104[local81];
			}
			this.anIntArray218 = new int[256];
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				this.anIntArray218[local103] = local103 * 262144;
			}
			for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
				this.anIntArray218[local118 + 64] = local118 * 1024 + 16711680;
			}
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray218[local137 + 128] = local137 * 4 + 16776960;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray218[local156 + 192] = 16777215;
			}
			this.anIntArray219 = new int[256];
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray219[local175] = local175 * 1024;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray219[local190 + 64] = local190 * 4 + 65280;
			}
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray219[local209 + 128] = local209 * 262144 + 65535;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray219[local228 + 192] = 16777215;
			}
			this.anIntArray220 = new int[256];
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray220[local247] = local247 * 4;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray220[local262 + 64] = local262 * 262144 + 255;
			}
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray220[local281 + 128] = local281 * 1024 + 16711935;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray220[local300 + 192] = 16777215;
			}
			this.anIntArray217 = new int[256];
			this.anIntArray215 = new int[32768];
			this.anIntArray216 = new int[32768];
			this.method629(null);
			this.anIntArray253 = new int[32768];
			this.anIntArray254 = new int[32768];
			this.method588(10, (byte) 6, "Connecting to fileserver");
			if (!this.aBoolean223) {
				this.aBoolean221 = true;
				this.aBoolean223 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("89948, " + false + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method694(@OriginalArg(0) byte arg0) {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray253[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray253[local54] = 192;
			}
			if (this.aByte41 == 5) {
				@Pc(69) boolean local69 = false;
				for (local41 = 1; local41 < 255; local41++) {
					for (local48 = 1; local48 < 127; local48++) {
						local54 = local48 + (local41 << 7);
						this.anIntArray254[local54] = (this.anIntArray253[local54 - 1] + this.anIntArray253[local54 + 1] + this.anIntArray253[local54 - 128] + this.anIntArray253[local54 + 128]) / 4;
					}
				}
				this.anInt887 += 128;
				if (this.anInt887 > this.anIntArray215.length) {
					this.anInt887 -= this.anIntArray215.length;
					local48 = (int) (Math.random() * 12.0D);
					this.method629(this.aClass1_Sub2_Sub1_Sub1Array4[local48]);
				}
				@Pc(175) int local175;
				for (local48 = 1; local48 < 255; local48++) {
					for (local54 = 1; local54 < 127; local54++) {
						local175 = local54 + (local48 << 7);
						@Pc(198) int local198 = this.anIntArray254[local175 + 128] - this.anIntArray215[local175 + this.anInt887 & this.anIntArray215.length - 1] / 5;
						if (local198 < 0) {
							local198 = 0;
						}
						this.anIntArray253[local175] = local198;
					}
				}
				for (local54 = 0; local54 < 255; local54++) {
					this.anIntArray257[local54] = this.anIntArray257[local54 + 1];
				}
				this.anIntArray257[255] = (int) (Math.sin((double) anInt1045 / 14.0D) * 16.0D + Math.sin((double) anInt1045 / 15.0D) * 14.0D + Math.sin((double) anInt1045 / 16.0D) * 12.0D);
				if (this.anInt1016 > 0) {
					this.anInt1016 -= 4;
				}
				if (this.anInt1017 > 0) {
					this.anInt1017 -= 4;
				}
				if (this.anInt1016 == 0 && this.anInt1017 == 0) {
					local175 = (int) (Math.random() * 2000.0D);
					if (local175 == 0) {
						this.anInt1016 = 1024;
					}
					if (local175 == 1) {
						this.anInt1017 = 1024;
						return;
					}
				}
			}
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("21197, " + arg0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!MNKDCXXG;Z)V")
	private void method695(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub3 arg1) {
		try {
			this.aBoolean217 &= true;
			while (arg1.anInt475 + 10 < arg0 * 8) {
				@Pc(18) int local18 = arg1.method318(11);
				if (local18 == 2047) {
					break;
				}
				if (this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local18] == null) {
					this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local18] = new Class1_Sub2_Sub2_Sub1_Sub1();
					if (this.aClass1_Sub2_Sub3Array1[local18] != null) {
						this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local18].method82(this.aClass1_Sub2_Sub3Array1[local18]);
					}
				}
				this.anIntArray247[this.anInt923++] = local18;
				@Pc(64) Class1_Sub2_Sub2_Sub1_Sub1 local64 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local18];
				local64.anInt769 = anInt1045;
				@Pc(72) int local72 = arg1.method318(5);
				if (local72 > 15) {
					local72 -= 32;
				}
				@Pc(81) int local81 = arg1.method318(5);
				if (local81 > 15) {
					local81 -= 32;
				}
				@Pc(90) int local90 = arg1.method318(1);
				@Pc(95) int local95 = arg1.method318(1);
				if (local95 == 1) {
					this.anIntArray248[this.anInt924++] = local18;
				}
				local64.method566(aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0] + local72, local90 == 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0] + local81);
			}
			arg1.method319();
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("56030, " + arg0 + ", " + arg1 + ", " + true + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method697() {
		try {
			@Pc(4) Graphics local4 = this.method586(735).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method579();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean231) {
				this.aBoolean223 = false;
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
			if (this.aBoolean201) {
				this.aBoolean223 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean189) {
				this.aBoolean223 = false;
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
			signlink.reporterror("17491, " + false + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method698() {
		try {
			if (this.anInt1046 == 0 && super.anInt820 == 1) {
				@Pc(19) int local19 = super.anInt821 - 25 - 550;
				@Pc(26) int local26 = super.anInt822 - 5 - 4;
				if (local19 >= 0 && local26 >= 0 && local19 < 146 && local26 < 151) {
					local19 -= 73;
					local26 -= 75;
					@Pc(46) int local46 = this.anInt1031 + this.anInt877 & 0x7FF;
					@Pc(50) int local50 = Class1_Sub2_Sub1_Sub3.anIntArray145[local46];
					@Pc(54) int local54 = Class1_Sub2_Sub1_Sub3.anIntArray146[local46];
					@Pc(63) int local63 = local50 * (this.anInt993 + 256) >> 8;
					@Pc(72) int local72 = local54 * (this.anInt993 + 256) >> 8;
					@Pc(82) int local82 = local26 * local63 + local19 * local72 >> 11;
					@Pc(92) int local92 = local26 * local72 - local19 * local63 >> 11;
					@Pc(99) int local99 = aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 + local82 >> 7;
					@Pc(106) int local106 = aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 - local92 >> 7;
					@Pc(127) boolean local127 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local99, 0, 1, local106, 0, 0, true);
					if (local127) {
						this.aClass1_Sub2_Sub3_9.method297(local19);
						this.aClass1_Sub2_Sub3_9.method297(local26);
						this.aClass1_Sub2_Sub3_9.method298(this.anInt1031);
						this.aClass1_Sub2_Sub3_9.method297(57);
						this.aClass1_Sub2_Sub3_9.method297(this.anInt877);
						this.aClass1_Sub2_Sub3_9.method297(this.anInt993);
						this.aClass1_Sub2_Sub3_9.method297(89);
						this.aClass1_Sub2_Sub3_9.method298(aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776);
						this.aClass1_Sub2_Sub3_9.method298(aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777);
						this.aClass1_Sub2_Sub3_9.method297(this.anInt974);
						this.aClass1_Sub2_Sub3_9.method297(63);
						return;
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("57253, " + -723 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method699(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class15.aClass15Array1[arg0].anInt275;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray268[arg0];
				this.aBoolean217 &= true;
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub2_Sub1_Sub3.method442(0.9D);
					}
					if (local12 == 2) {
						Class1_Sub2_Sub1_Sub3.method442(0.8D);
					}
					if (local12 == 3) {
						Class1_Sub2_Sub1_Sub3.method442(0.7D);
					}
					if (local12 == 4) {
						Class1_Sub2_Sub1_Sub3.method442(0.6D);
					}
					Class38.aClass30_9.method350();
					this.aBoolean212 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean234;
					if (local12 == 0) {
						this.method651(this.aBoolean234, 0);
						this.aBoolean234 = true;
					}
					if (local12 == 1) {
						this.method651(this.aBoolean234, -400);
						this.aBoolean234 = true;
					}
					if (local12 == 2) {
						this.method651(this.aBoolean234, -800);
						this.aBoolean234 = true;
					}
					if (local12 == 3) {
						this.method651(this.aBoolean234, -1200);
						this.aBoolean234 = true;
					}
					if (local12 == 4) {
						this.aBoolean234 = false;
					}
					if (this.aBoolean234 != local56 && !aBoolean215) {
						if (this.aBoolean234) {
							this.anInt1038 = this.anInt936;
							this.aBoolean228 = true;
							this.aClass22_Sub1_1.method470(2, this.anInt1038);
						} else {
							this.method703();
						}
						this.anInt1043 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean227 = true;
						this.method685(this.aBoolean194, 0);
					}
					if (local12 == 1) {
						this.aBoolean227 = true;
						this.method685(this.aBoolean194, -400);
					}
					if (local12 == 2) {
						this.aBoolean227 = true;
						this.method685(this.aBoolean194, -800);
					}
					if (local12 == 3) {
						this.aBoolean227 = true;
						this.method685(this.aBoolean194, -1200);
					}
					if (local12 == 4) {
						this.aBoolean227 = false;
					}
				}
				if (local4 == 5) {
					this.anInt905 = local12;
				}
				if (local4 == 6) {
					this.anInt860 = local12;
				}
				if (local4 == 8) {
					this.anInt855 = local12;
					this.aBoolean209 = true;
				}
				if (local4 == 9) {
					this.anInt925 = local12;
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("39707, " + true + ", " + arg0 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)Z")
	private boolean method700() {
		try {
			this.aBoolean217 &= true;
			if (this.aClass45_1 == null) {
				return false;
			}
			@Pc(2252) String local2252;
			@Pc(166) int local166;
			try {
				@Pc(16) int local16 = this.aClass45_1.method502();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt951 == -1) {
					this.aClass45_1.method503(this.aClass1_Sub2_Sub3_8.aByteArray10, 0, 1);
					this.anInt951 = this.aClass1_Sub2_Sub3_8.aByteArray10[0] & 0xFF;
					if (this.aClass41_2 != null) {
						this.anInt951 = this.anInt951 - this.aClass41_2.method450() & 0xFF;
					}
					this.anInt950 = Class4.anIntArray22[this.anInt951];
					local16--;
				}
				if (this.anInt950 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass45_1.method503(this.aClass1_Sub2_Sub3_8.aByteArray10, 0, 1);
					this.anInt950 = this.aClass1_Sub2_Sub3_8.aByteArray10[0] & 0xFF;
					local16--;
				}
				if (this.anInt950 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass45_1.method503(this.aClass1_Sub2_Sub3_8.aByteArray10, 0, 2);
					this.aClass1_Sub2_Sub3_8.anInt474 = 0;
					this.anInt950 = this.aClass1_Sub2_Sub3_8.method309();
					local16 -= 2;
				}
				if (local16 < this.anInt950) {
					return false;
				}
				this.aClass1_Sub2_Sub3_8.anInt474 = 0;
				this.aClass45_1.method503(this.aClass1_Sub2_Sub3_8.aByteArray10, 0, this.anInt950);
				this.anInt952 = 0;
				this.anInt901 = this.anInt900;
				this.anInt900 = this.anInt899;
				this.anInt899 = this.anInt951;
				@Pc(161) int local161;
				if (this.anInt951 == 159) {
					local161 = this.aClass1_Sub2_Sub3_8.method334();
					local166 = this.aClass1_Sub2_Sub3_8.method336();
					Class18.method187(local166).anInt322 = 2;
					Class18.method187(local166).anInt323 = local161;
					this.anInt951 = -1;
					return true;
				}
				@Pc(198) int local198;
				if (this.anInt951 == 89) {
					local161 = this.aClass1_Sub2_Sub3_8.method338();
					local166 = this.aClass1_Sub2_Sub3_8.method339();
					local198 = this.aClass1_Sub2_Sub3_8.method336();
					@Pc(201) Class18 local201 = Class18.method187(local198);
					local201.anInt342 = local166;
					local201.anInt357 = local161;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 123) {
					local161 = this.aClass1_Sub2_Sub3_8.method334();
					local166 = this.aClass1_Sub2_Sub3_8.method344();
					this.anIntArray212[local161] = local166;
					if (this.anIntArray268[local161] != local166) {
						this.anIntArray268[local161] = local166;
						this.method699(local161);
						this.aBoolean202 = true;
						if (this.anInt1020 != -1) {
							this.aBoolean209 = true;
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 152) {
					if (this.anInt896 != -1) {
						this.method612(this.anInt896);
						this.anInt896 = -1;
						this.aBoolean202 = true;
						this.aBoolean185 = true;
					}
					if (this.anInt956 != -1) {
						this.method612(this.anInt956);
						this.anInt956 = -1;
						this.aBoolean209 = true;
					}
					if (this.anInt1008 != -1) {
						this.method612(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt945 != -1) {
						this.method612(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt1056 != -1) {
						this.method612(this.anInt1056);
						this.anInt1056 = -1;
					}
					if (this.anInt861 != 0) {
						this.anInt861 = 0;
						this.aBoolean209 = true;
					}
					this.aBoolean229 = false;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 227) {
					this.method623(this.aClass1_Sub2_Sub3_8, this.anInt950);
					this.anInt951 = -1;
					return true;
				}
				@Pc(387) int local387;
				@Pc(391) int local391;
				@Pc(458) String local458;
				@Pc(389) boolean local389;
				@Pc(412) int local412;
				@Pc(379) long local379;
				if (this.anInt951 == 225) {
					local379 = this.aClass1_Sub2_Sub3_8.method313();
					local198 = this.aClass1_Sub2_Sub3_8.method312();
					local387 = this.aClass1_Sub2_Sub3_8.method307();
					local389 = false;
					for (local391 = 0; local391 < 100; local391++) {
						if (this.anIntArray273[local391] == local198) {
							local389 = true;
							break;
						}
					}
					if (local387 <= 1) {
						for (local412 = 0; local412 < this.anInt947; local412++) {
							if (this.aLongArray4[local412] == local379) {
								local389 = true;
								break;
							}
						}
					}
					if (!local389 && this.anInt930 == 0) {
						try {
							this.anIntArray273[this.anInt1037] = local198;
							this.anInt1037 = (this.anInt1037 + 1) % 100;
							local458 = Class49.method558(this.anInt950 - 13, this.aClass1_Sub2_Sub3_8);
							if (local387 != 3) {
								local458 = Class24.method247(this.anInt885, local458);
							}
							if (local387 == 2 || local387 == 3) {
								this.method683(local458, 7, "@cr2@" + Class40.method417(Class40.method414(local379)));
							} else if (local387 == 1) {
								this.method683(local458, 7, "@cr1@" + Class40.method417(Class40.method414(local379)));
							} else {
								this.method683(local458, 3, Class40.method417(Class40.method414(local379)));
							}
						} catch (@Pc(523) Exception local523) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 85) {
					this.anInt869 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt1042 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt852 = this.aClass1_Sub2_Sub3_8.method307();
					this.aBoolean200 = true;
					this.aBoolean209 = true;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 107) {
					@Pc(575) boolean local575 = this.aClass1_Sub2_Sub3_8.method327() == 1;
					local166 = this.aClass1_Sub2_Sub3_8.method309();
					Class18.method187(local166).aBoolean63 = local575;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 242) {
					this.anInt849 = this.aClass1_Sub2_Sub3_8.method307();
					if (this.anInt849 == 1) {
						this.anInt827 = this.aClass1_Sub2_Sub3_8.method309();
					}
					if (this.anInt849 >= 2 && this.anInt849 <= 6) {
						if (this.anInt849 == 2) {
							this.anInt847 = 64;
							this.anInt848 = 64;
						}
						if (this.anInt849 == 3) {
							this.anInt847 = 0;
							this.anInt848 = 64;
						}
						if (this.anInt849 == 4) {
							this.anInt847 = 128;
							this.anInt848 = 64;
						}
						if (this.anInt849 == 5) {
							this.anInt847 = 64;
							this.anInt848 = 0;
						}
						if (this.anInt849 == 6) {
							this.anInt847 = 64;
							this.anInt848 = 128;
						}
						this.anInt849 = 2;
						this.anInt844 = this.aClass1_Sub2_Sub3_8.method309();
						this.anInt845 = this.aClass1_Sub2_Sub3_8.method309();
						this.anInt846 = this.aClass1_Sub2_Sub3_8.method307();
					}
					if (this.anInt849 == 10) {
						this.anInt850 = this.aClass1_Sub2_Sub3_8.method309();
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 216) {
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					this.method654(local161);
					if (this.anInt896 != -1) {
						this.method612(this.anInt896);
						this.anInt896 = -1;
						this.aBoolean202 = true;
						this.aBoolean185 = true;
					}
					if (this.anInt956 != -1) {
						this.method612(this.anInt956);
						this.anInt956 = -1;
						this.aBoolean209 = true;
					}
					if (this.anInt1008 != -1) {
						this.method612(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt945 != -1) {
						this.method612(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt1056 != local161) {
						this.method612(this.anInt1056);
						this.anInt1056 = local161;
					}
					if (this.anInt861 != 0) {
						this.anInt861 = 0;
						this.aBoolean209 = true;
					}
					this.aBoolean229 = false;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 50) {
					this.anInt911 = this.aClass1_Sub2_Sub3_8.method335();
					this.anInt1047 = this.aClass1_Sub2_Sub3_8.method309();
					this.anInt1055 = this.aClass1_Sub2_Sub3_8.method336();
					this.anInt981 = this.aClass1_Sub2_Sub3_8.method343();
					this.aClass1_Sub2_Sub3_8.method328();
					this.anInt914 = this.aClass1_Sub2_Sub3_8.method336();
					this.anInt826 = this.aClass1_Sub2_Sub3_8.method309();
					this.anInt834 = this.aClass1_Sub2_Sub3_8.method334();
					this.anInt1010 = this.aClass1_Sub2_Sub3_8.method335();
					this.aClass1_Sub2_Sub3_8.method336();
					this.anInt1021 = this.aClass1_Sub2_Sub3_8.method335();
					signlink.dnslookup(Class40.method416(this.anInt981));
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 135) {
					this.anInt836 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt951 = -1;
					return true;
				}
				@Pc(915) int local915;
				@Pc(901) Class18 local901;
				if (this.anInt951 == 163) {
					this.aBoolean202 = true;
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					local901 = Class18.method187(local161);
					while (this.aClass1_Sub2_Sub3_8.anInt474 < this.anInt950) {
						local198 = this.aClass1_Sub2_Sub3_8.method321();
						local387 = this.aClass1_Sub2_Sub3_8.method309();
						local915 = this.aClass1_Sub2_Sub3_8.method307();
						if (local915 == 255) {
							local915 = this.aClass1_Sub2_Sub3_8.method312();
						}
						if (local198 >= 0 && local198 < local901.anIntArray56.length) {
							local901.anIntArray56[local198] = local387;
							local901.anIntArray55[local198] = local915;
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 3) {
					this.anInt966 = this.aClass1_Sub2_Sub3_8.method327();
					if (this.anInt966 == this.anInt913) {
						if (this.anInt966 == 3) {
							this.anInt913 = 1;
						} else {
							this.anInt913 = 3;
						}
						this.aBoolean202 = true;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 250) {
					this.anInt992 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt991 = this.aClass1_Sub2_Sub3_8.method326(this.anInt853);
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 10) {
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					local166 = this.aClass1_Sub2_Sub3_8.method336();
					if (this.anInt956 != -1) {
						this.method612(this.anInt956);
						this.anInt956 = -1;
						this.aBoolean209 = true;
					}
					if (this.anInt1008 != -1) {
						this.method612(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt945 != -1) {
						this.method612(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt1056 != local161) {
						this.method612(this.anInt1056);
						this.anInt1056 = local161;
					}
					if (this.anInt896 != local166) {
						this.method612(this.anInt896);
						this.anInt896 = local166;
					}
					if (this.anInt861 != 0) {
						this.anInt861 = 0;
						this.aBoolean209 = true;
					}
					this.aBoolean202 = true;
					this.aBoolean185 = true;
					this.aBoolean229 = false;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 38) {
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					this.method654(local161);
					if (this.anInt956 != -1) {
						this.method612(this.anInt956);
						this.anInt956 = -1;
						this.aBoolean209 = true;
					}
					if (this.anInt1008 != -1) {
						this.method612(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt945 != -1) {
						this.method612(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt1056 != -1) {
						this.method612(this.anInt1056);
						this.anInt1056 = -1;
					}
					if (this.anInt896 != local161) {
						this.method612(this.anInt896);
						this.anInt896 = local161;
					}
					if (this.anInt861 != 0) {
						this.anInt861 = 0;
						this.aBoolean209 = true;
					}
					this.aBoolean202 = true;
					this.aBoolean185 = true;
					this.aBoolean229 = false;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 139) {
					local161 = this.aClass1_Sub2_Sub3_8.method334();
					local901 = Class18.method187(local161);
					for (local198 = 0; local198 < local901.anIntArray56.length; local198++) {
						local901.anIntArray56[local198] = -1;
						local901.anIntArray56[local198] = 0;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 128 || this.anInt951 == 188 || this.anInt951 == 49 || this.anInt951 == 150 || this.anInt951 == 109 || this.anInt951 == 239 || this.anInt951 == 27 || this.anInt951 == 127 || this.anInt951 == 205 || this.anInt951 == 113 || this.anInt951 == 197) {
					this.method643(this.aClass1_Sub2_Sub3_8, this.anInt951);
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 124) {
					this.anInt898 = this.aClass1_Sub2_Sub3_8.method309() * 30;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 176) {
					this.method668(this.anInt950, this.aClass1_Sub2_Sub3_8);
					this.aBoolean208 = false;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 16) {
					local161 = this.aClass1_Sub2_Sub3_8.method307();
					local166 = this.aClass1_Sub2_Sub3_8.method307();
					local198 = this.aClass1_Sub2_Sub3_8.method307();
					local387 = this.aClass1_Sub2_Sub3_8.method307();
					this.aBooleanArray12[local161] = true;
					this.anIntArray213[local161] = local166;
					this.anIntArray276[local161] = local198;
					this.anIntArray222[local161] = local387;
					this.anIntArray232[local161] = 0;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 144) {
					local161 = this.aClass1_Sub2_Sub3_8.method334();
					Class18.method187(local161).anInt322 = 3;
					if (aClass1_Sub2_Sub2_Sub1_Sub1_1.aClass34_1 == null) {
						Class18.method187(local161).anInt323 = (aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray19[0] << 25) + (aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray19[4] << 20) + (aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray18[0] << 15) + (aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray18[8] << 10) + (aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray18[11] << 5) + aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray18[1];
					} else {
						Class18.method187(local161).anInt323 = (int) (aClass1_Sub2_Sub2_Sub1_Sub1_1.aClass34_1.aLong17 + 305419896L);
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 93) {
					local161 = this.aClass1_Sub2_Sub3_8.method337(this.aBoolean210);
					if (local161 >= 0) {
						this.method654(local161);
					}
					if (local161 != this.anInt897) {
						this.method612(this.anInt897);
						this.anInt897 = local161;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 115) {
					this.aBoolean233 = false;
					this.anInt861 = 2;
					this.aString17 = "";
					this.aBoolean209 = true;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 181) {
					this.anInt1046 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 96) {
					local161 = this.aClass1_Sub2_Sub3_8.method335();
					this.method654(local161);
					if (this.anInt896 != -1) {
						this.method612(this.anInt896);
						this.anInt896 = -1;
						this.aBoolean202 = true;
						this.aBoolean185 = true;
					}
					if (this.anInt1008 != -1) {
						this.method612(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt945 != -1) {
						this.method612(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt1056 != -1) {
						this.method612(this.anInt1056);
						this.anInt1056 = -1;
					}
					if (this.anInt956 != local161) {
						this.method612(this.anInt956);
						this.anInt956 = local161;
					}
					this.aBoolean229 = false;
					this.aBoolean209 = true;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 90) {
					local161 = this.aClass1_Sub2_Sub3_8.method338();
					if (local161 != this.anInt1020) {
						this.method612(this.anInt1020);
						this.anInt1020 = local161;
					}
					this.aBoolean209 = true;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 6) {
					local161 = this.aClass1_Sub2_Sub3_8.method336();
					if (local161 == 65535) {
						local161 = -1;
					}
					if (local161 != this.anInt936 && this.aBoolean234 && !aBoolean215 && this.anInt1043 == 0) {
						this.anInt1038 = local161;
						this.aBoolean228 = true;
						this.aClass22_Sub1_1.method470(2, this.anInt1038);
					}
					this.anInt936 = local161;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 147) {
					local161 = this.aClass1_Sub2_Sub3_8.method335();
					local166 = this.aClass1_Sub2_Sub3_8.method340();
					if (this.aBoolean234 && !aBoolean215) {
						this.anInt1038 = local161;
						this.aBoolean228 = false;
						this.aClass22_Sub1_1.method470(2, this.anInt1038);
						this.anInt1043 = local166;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 207) {
					this.aBoolean202 = true;
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					local901 = Class18.method187(local161);
					local198 = this.aClass1_Sub2_Sub3_8.method309();
					for (local387 = 0; local387 < local198; local387++) {
						local901.anIntArray56[local387] = this.aClass1_Sub2_Sub3_8.method336();
						local915 = this.aClass1_Sub2_Sub3_8.method326(this.anInt853);
						if (local915 == 255) {
							local915 = this.aClass1_Sub2_Sub3_8.method344();
						}
						local901.anIntArray55[local387] = local915;
					}
					for (local915 = local198; local915 < local901.anIntArray56.length; local915++) {
						local901.anIntArray56[local915] = 0;
						local901.anIntArray55[local915] = 0;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 232) {
					this.aBoolean190 = true;
					this.anInt984 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt985 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt986 = this.aClass1_Sub2_Sub3_8.method309();
					this.anInt987 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt988 = this.aClass1_Sub2_Sub3_8.method307();
					if (this.anInt988 >= 100) {
						local161 = this.anInt984 * 128 + 64;
						local166 = this.anInt985 * 128 + 64;
						local198 = this.method715(local166, local161, this.anInt1001) - this.anInt986;
						local387 = local161 - this.anInt1011;
						local915 = local198 - this.anInt1012;
						local391 = local166 - this.anInt1013;
						local412 = (int) Math.sqrt((double) (local387 * local387 + local391 * local391));
						this.anInt1014 = (int) (Math.atan2((double) local915, (double) local412) * 325.949D) & 0x7FF;
						this.anInt1015 = (int) (Math.atan2((double) local387, (double) local391) * -325.949D) & 0x7FF;
						if (this.anInt1014 < 128) {
							this.anInt1014 = 128;
						}
						if (this.anInt1014 > 383) {
							this.anInt1014 = 383;
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 177) {
					local161 = this.aClass1_Sub2_Sub3_8.method335();
					local166 = this.aClass1_Sub2_Sub3_8.method309();
					local198 = this.aClass1_Sub2_Sub3_8.method335();
					Class18.method187(local166).anInt327 = (local161 << 16) + local198;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 28) {
					local161 = this.aClass1_Sub2_Sub3_8.method334();
					local166 = this.aClass1_Sub2_Sub3_8.method327();
					if (local161 == 65535) {
						local161 = -1;
					}
					if (this.anIntArray246[local166] != local161) {
						this.method612(this.anIntArray246[local166]);
						this.anIntArray246[local166] = local161;
					}
					this.aBoolean202 = true;
					this.aBoolean185 = true;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 138) {
					this.aBoolean233 = false;
					this.anInt861 = 1;
					this.aString17 = "";
					this.aBoolean209 = true;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 98) {
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					local166 = this.aClass1_Sub2_Sub3_8.method307();
					local198 = this.aClass1_Sub2_Sub3_8.method309();
					if (local198 == 65535) {
						if (this.anInt980 < 50) {
							this.anIntArray249[this.anInt980] = (short) local161;
							this.anIntArray269[this.anInt980] = local166;
							this.anIntArray251[this.anInt980] = 0;
							this.anInt980++;
						}
					} else if (this.aBoolean227 && !aBoolean215 && this.anInt980 < 50) {
						this.anIntArray249[this.anInt980] = local161;
						this.anIntArray269[this.anInt980] = local166;
						this.anIntArray251[this.anInt980] = local198 + Class3.anIntArray20[local161];
						this.anInt980++;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 29) {
					this.method680();
					this.anInt951 = -1;
					return false;
				}
				if (this.anInt951 == 208) {
					local161 = this.aClass1_Sub2_Sub3_8.method335();
					local166 = this.aClass1_Sub2_Sub3_8.method336();
					this.method654(local166);
					if (local161 != -1) {
						this.method654(local161);
					}
					if (this.anInt1056 != -1) {
						this.method612(this.anInt1056);
						this.anInt1056 = -1;
					}
					if (this.anInt896 != -1) {
						this.method612(this.anInt896);
						this.anInt896 = -1;
					}
					if (this.anInt956 != -1) {
						this.method612(this.anInt956);
						this.anInt956 = -1;
					}
					if (this.anInt1008 != local166) {
						this.method612(this.anInt1008);
						this.anInt1008 = local166;
					}
					if (this.anInt945 != local166) {
						this.method612(this.anInt945);
						this.anInt945 = local161;
					}
					this.anInt861 = 0;
					this.aBoolean229 = false;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 212) {
					local2252 = this.aClass1_Sub2_Sub3_8.method314();
					local166 = this.aClass1_Sub2_Sub3_8.method336();
					Class18.method187(local166).aString8 = local2252;
					@Pc(2269) int local2269 = this.anIntArray246[this.anInt913];
					if (Class18.method187(local166).anInt356 == local2269) {
						this.aBoolean202 = true;
					}
					this.anInt951 = -1;
					return true;
				}
				@Pc(2641) int local2641;
				if (this.anInt951 == 221 || this.anInt951 == 164) {
					local161 = this.anInt1059;
					local166 = this.anInt1060;
					if (this.anInt951 == 221) {
						local166 = this.aClass1_Sub2_Sub3_8.method336();
						local161 = this.aClass1_Sub2_Sub3_8.method335();
						this.aBoolean186 = false;
					}
					if (this.anInt951 == 164) {
						this.aClass1_Sub2_Sub3_8.method317((byte) 3);
						local198 = 0;
						while (true) {
							if (local198 >= 4) {
								this.aClass1_Sub2_Sub3_8.method319();
								local166 = this.aClass1_Sub2_Sub3_8.method336();
								local161 = this.aClass1_Sub2_Sub3_8.method336();
								this.aBoolean186 = true;
								break;
							}
							for (local387 = 0; local387 < 13; local387++) {
								for (local915 = 0; local915 < 13; local915++) {
									local391 = this.aClass1_Sub2_Sub3_8.method318(1);
									if (local391 == 1) {
										this.anIntArrayArrayArray7[local198][local387][local915] = this.aClass1_Sub2_Sub3_8.method318(26);
									} else {
										this.anIntArrayArrayArray7[local198][local387][local915] = -1;
									}
								}
							}
							local198++;
						}
					}
					if (this.anInt1059 == local161 && this.anInt1060 == local166 && this.anInt937 == 2) {
						this.anInt951 = -1;
						return true;
					}
					this.anInt1059 = local161;
					this.anInt1060 = local166;
					this.anInt958 = (this.anInt1059 - 6) * 8;
					this.anInt959 = (this.anInt1060 - 6) * 8;
					this.aBoolean207 = false;
					if ((this.anInt1059 / 8 == 48 || this.anInt1059 / 8 == 49) && this.anInt1060 / 8 == 48) {
						this.aBoolean207 = true;
					}
					if (this.anInt1059 / 8 == 48 && this.anInt1060 / 8 == 148) {
						this.aBoolean207 = true;
					}
					this.anInt937 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.method681(null, this.aByte46, "Loading - please wait.");
					if (this.anInt951 == 221) {
						local198 = 0;
						local387 = (this.anInt1059 - 6) / 8;
						label1219: while (true) {
							if (local387 > (this.anInt1059 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local198][];
								this.aByteArrayArray5 = new byte[local198][];
								this.anIntArray264 = new int[local198];
								this.anIntArray265 = new int[local198];
								this.anIntArray266 = new int[local198];
								local198 = 0;
								local915 = (this.anInt1059 - 6) / 8;
								while (true) {
									if (local915 > (this.anInt1059 + 6) / 8) {
										break label1219;
									}
									for (local391 = (this.anInt1060 - 6) / 8; local391 <= (this.anInt1060 + 6) / 8; local391++) {
										this.anIntArray264[local198] = (local915 << 8) + local391;
										if (this.aBoolean207 && (local391 == 49 || local391 == 149 || local391 == 147 || local915 == 50 || local915 == 49 && local391 == 47)) {
											this.anIntArray265[local198] = -1;
											this.anIntArray266[local198] = -1;
											local198++;
										} else {
											local412 = this.anIntArray265[local198] = this.aClass22_Sub1_1.method456(local915, local391, 0);
											if (local412 != -1) {
												this.aClass22_Sub1_1.method470(3, local412);
											}
											local2641 = this.anIntArray266[local198] = this.aClass22_Sub1_1.method456(local915, local391, 1);
											if (local2641 != -1) {
												this.aClass22_Sub1_1.method470(3, local2641);
											}
											local198++;
										}
									}
									local915++;
								}
							}
							for (local915 = (this.anInt1060 - 6) / 8; local915 <= (this.anInt1060 + 6) / 8; local915++) {
								local198++;
							}
							local387++;
						}
					}
					if (this.anInt951 == 164) {
						local198 = 0;
						@Pc(2677) int[] local2677 = new int[676];
						local915 = 0;
						label1178: while (true) {
							@Pc(2723) int local2723;
							@Pc(2707) int local2707;
							@Pc(2713) int local2713;
							if (local915 >= 4) {
								this.aByteArrayArray6 = new byte[local198][];
								this.aByteArrayArray5 = new byte[local198][];
								this.anIntArray264 = new int[local198];
								this.anIntArray265 = new int[local198];
								this.anIntArray266 = new int[local198];
								local391 = 0;
								while (true) {
									if (local391 >= local198) {
										break label1178;
									}
									local412 = this.anIntArray264[local391] = local2677[local391];
									local2641 = local412 >> 8 & 0xFF;
									local2707 = local412 & 0xFF;
									local2713 = this.anIntArray265[local391] = this.aClass22_Sub1_1.method456(local2641, local2707, 0);
									if (local2713 != -1) {
										this.aClass22_Sub1_1.method470(3, local2713);
									}
									local2723 = this.anIntArray266[local391] = this.aClass22_Sub1_1.method456(local2641, local2707, 1);
									if (local2723 != -1) {
										this.aClass22_Sub1_1.method470(3, local2723);
									}
									local391++;
								}
							}
							for (local391 = 0; local391 < 13; local391++) {
								for (local412 = 0; local412 < 13; local412++) {
									local2641 = this.anIntArrayArrayArray7[local915][local391][local412];
									if (local2641 != -1) {
										local2707 = local2641 >> 14 & 0x3FF;
										local2713 = local2641 >> 3 & 0x7FF;
										local2723 = (local2707 / 8 << 8) + local2713 / 8;
										for (@Pc(2725) int local2725 = 0; local2725 < local198; local2725++) {
											if (local2677[local2725] == local2723) {
												local2723 = -1;
												break;
											}
										}
										if (local2723 != -1) {
											local2677[local198++] = local2723;
										}
									}
								}
							}
							local915++;
						}
					}
					local198 = this.anInt958 - this.anInt960;
					local387 = this.anInt959 - this.anInt961;
					this.anInt960 = this.anInt958;
					this.anInt961 = this.anInt959;
					for (local915 = 0; local915 < 16384; local915++) {
						@Pc(2878) Class1_Sub2_Sub2_Sub1_Sub2 local2878 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local915];
						if (local2878 != null) {
							for (local412 = 0; local412 < 10; local412++) {
								local2878.anIntArray204[local412] -= local198;
								local2878.anIntArray205[local412] -= local387;
							}
							local2878.anInt776 -= local198 * 128;
							local2878.anInt777 -= local387 * 128;
						}
					}
					for (local391 = 0; local391 < this.anInt921; local391++) {
						@Pc(2933) Class1_Sub2_Sub2_Sub1_Sub1 local2933 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local391];
						if (local2933 != null) {
							for (local2641 = 0; local2641 < 10; local2641++) {
								local2933.anIntArray204[local2641] -= local198;
								local2933.anIntArray205[local2641] -= local387;
							}
							local2933.anInt776 -= local198 * 128;
							local2933.anInt777 -= local387 * 128;
						}
					}
					this.aBoolean208 = true;
					@Pc(2985) byte local2985 = 0;
					@Pc(2987) byte local2987 = 104;
					@Pc(2989) byte local2989 = 1;
					if (local198 < 0) {
						local2985 = 103;
						local2987 = -1;
						local2989 = -1;
					}
					@Pc(2999) byte local2999 = 0;
					@Pc(3001) byte local3001 = 104;
					@Pc(3003) byte local3003 = 1;
					if (local387 < 0) {
						local2999 = 103;
						local3001 = -1;
						local3003 = -1;
					}
					for (@Pc(3013) int local3013 = local2985; local3013 != local2987; local3013 += local2989) {
						for (@Pc(3017) int local3017 = local2999; local3017 != local3001; local3017 += local3003) {
							@Pc(3023) int local3023 = local3013 + local198;
							@Pc(3027) int local3027 = local3017 + local387;
							for (@Pc(3029) int local3029 = 0; local3029 < 4; local3029++) {
								if (local3023 >= 0 && local3027 >= 0 && local3023 < 104 && local3027 < 104) {
									this.aClass42ArrayArrayArray1[local3029][local3013][local3017] = this.aClass42ArrayArrayArray1[local3029][local3023][local3027];
								} else {
									this.aClass42ArrayArrayArray1[local3029][local3013][local3017] = null;
								}
							}
						}
					}
					for (@Pc(3091) Class1_Sub1 local3091 = (Class1_Sub1) this.aClass42_10.method487(); local3091 != null; local3091 = (Class1_Sub1) this.aClass42_10.method489()) {
						local3091.anInt4 -= local198;
						local3091.anInt5 -= local387;
						if (local3091.anInt4 < 0 || local3091.anInt5 < 0 || local3091.anInt4 >= 104 || local3091.anInt5 >= 104) {
							local3091.method571();
						}
					}
					if (this.anInt989 != 0) {
						this.anInt989 -= local198;
						this.anInt990 -= local387;
					}
					this.aBoolean190 = false;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 120) {
					this.aBoolean190 = true;
					this.anInt879 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt880 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt881 = this.aClass1_Sub2_Sub3_8.method309();
					this.anInt882 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt883 = this.aClass1_Sub2_Sub3_8.method307();
					if (this.anInt883 >= 100) {
						this.anInt1011 = this.anInt879 * 128 + 64;
						this.anInt1013 = this.anInt880 * 128 + 64;
						this.anInt1012 = this.method715(this.anInt1013, this.anInt1011, this.anInt1001) - this.anInt881;
					}
					this.anInt951 = -1;
					return true;
				}
				@Pc(3241) Class18 local3241;
				if (this.anInt951 == 61) {
					local161 = this.aClass1_Sub2_Sub3_8.method334();
					local166 = this.aClass1_Sub2_Sub3_8.method337(this.aBoolean210);
					local3241 = Class18.method187(local161);
					if (local3241.anInt338 != local166 || local166 == -1) {
						local3241.anInt338 = local166;
						local3241.anInt334 = 0;
						local3241.anInt330 = 0;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 254) {
					if (this.anInt913 == 12) {
						this.aBoolean202 = true;
					}
					this.anInt888 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 193) {
					@Pc(3292) byte local3292 = this.aClass1_Sub2_Sub3_8.method330((byte) 4);
					local166 = this.aClass1_Sub2_Sub3_8.method336();
					this.anIntArray212[local166] = local3292;
					if (this.anIntArray268[local166] != local3292) {
						this.anIntArray268[local166] = local3292;
						this.method699(local166);
						this.aBoolean202 = true;
						if (this.anInt1020 != -1) {
							this.aBoolean209 = true;
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 52) {
					local379 = this.aClass1_Sub2_Sub3_8.method313();
					local198 = this.aClass1_Sub2_Sub3_8.method307();
					@Pc(3351) String local3351 = Class40.method417(Class40.method414(local379));
					for (local915 = 0; local915 < this.anInt875; local915++) {
						if (local379 == this.aLongArray3[local915]) {
							if (this.anIntArray258[local915] != local198) {
								this.anIntArray258[local915] = local198;
								this.aBoolean202 = true;
								if (local198 > 0) {
									this.method683(local3351 + " has logged in.", 5, "");
								}
								if (local198 == 0) {
									this.method683(local3351 + " has logged out.", 5, "");
								}
							}
							local3351 = null;
							break;
						}
					}
					if (local3351 != null && this.anInt875 < 200) {
						this.aLongArray3[this.anInt875] = local379;
						this.aStringArray9[this.anInt875] = local3351;
						this.anIntArray258[this.anInt875] = local198;
						this.anInt875++;
						this.aBoolean202 = true;
					}
					@Pc(3449) boolean local3449 = false;
					while (!local3449) {
						local3449 = true;
						for (local412 = 0; local412 < this.anInt875 - 1; local412++) {
							if (this.anIntArray258[local412] != anInt972 && this.anIntArray258[local412 + 1] == anInt972 || this.anIntArray258[local412] == 0 && this.anIntArray258[local412 + 1] != 0) {
								local2641 = this.anIntArray258[local412];
								this.anIntArray258[local412] = this.anIntArray258[local412 + 1];
								this.anIntArray258[local412 + 1] = local2641;
								@Pc(3510) String local3510 = this.aStringArray9[local412];
								this.aStringArray9[local412] = this.aStringArray9[local412 + 1];
								this.aStringArray9[local412 + 1] = local3510;
								@Pc(3532) long local3532 = this.aLongArray3[local412];
								this.aLongArray3[local412] = this.aLongArray3[local412 + 1];
								this.aLongArray3[local412 + 1] = local3532;
								this.aBoolean202 = true;
								local3449 = false;
							}
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 105) {
					this.anInt876 = this.aClass1_Sub2_Sub3_8.method307();
					this.aBoolean202 = true;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 129) {
					local2252 = this.aClass1_Sub2_Sub3_8.method314();
					@Pc(3607) long local3607;
					@Pc(3604) String local3604;
					if (local2252.endsWith(":tradereq:")) {
						local3604 = local2252.substring(0, local2252.indexOf(":"));
						local3607 = Class40.method413(local3604);
						local389 = false;
						for (local391 = 0; local391 < this.anInt947; local391++) {
							if (this.aLongArray4[local391] == local3607) {
								local389 = true;
								break;
							}
						}
						if (!local389 && this.anInt930 == 0) {
							this.method683("wishes to trade with you.", 4, local3604);
						}
					} else if (local2252.endsWith(":duelreq:")) {
						local3604 = local2252.substring(0, local2252.indexOf(":"));
						local3607 = Class40.method413(local3604);
						local389 = false;
						for (local391 = 0; local391 < this.anInt947; local391++) {
							if (this.aLongArray4[local391] == local3607) {
								local389 = true;
								break;
							}
						}
						if (!local389 && this.anInt930 == 0) {
							this.method683("wishes to duel with you.", 8, local3604);
						}
					} else if (local2252.endsWith(":chalreq:")) {
						local3604 = local2252.substring(0, local2252.indexOf(":"));
						local3607 = Class40.method413(local3604);
						local389 = false;
						for (local391 = 0; local391 < this.anInt947; local391++) {
							if (this.aLongArray4[local391] == local3607) {
								local389 = true;
								break;
							}
						}
						if (!local389 && this.anInt930 == 0) {
							local458 = local2252.substring(local2252.indexOf(":") + 1, local2252.length() - 9);
							this.method683(local458, 8, local3604);
						}
					} else {
						this.method683(local2252, 0, "");
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 230) {
					this.aBoolean190 = false;
					for (local161 = 0; local161 < 5; local161++) {
						this.aBooleanArray12[local161] = false;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 171) {
					this.aBoolean202 = true;
					local161 = this.aClass1_Sub2_Sub3_8.method327();
					local166 = this.aClass1_Sub2_Sub3_8.method342();
					local198 = this.aClass1_Sub2_Sub3_8.method307();
					this.anIntArray267[local198] = local166;
					this.anIntArray223[local198] = local161;
					this.anIntArray252[local198] = 1;
					for (local387 = 0; local387 < 98; local387++) {
						if (local166 >= anIntArray270[local387]) {
							this.anIntArray252[local198] = local387 + 2;
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 116) {
					local161 = this.aClass1_Sub2_Sub3_8.method326(this.anInt853);
					local166 = this.aClass1_Sub2_Sub3_8.method327();
					@Pc(3868) String local3868 = this.aClass1_Sub2_Sub3_8.method314();
					if (local161 >= 1 && local161 <= 5) {
						if (local3868.equalsIgnoreCase("null")) {
							local3868 = null;
						}
						this.aStringArray13[local161 - 1] = local3868;
						this.aBooleanArray11[local161 - 1] = local166 == 0;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 20) {
					if (this.anInt913 == 12) {
						this.aBoolean202 = true;
					}
					this.anInt915 = this.aClass1_Sub2_Sub3_8.method310();
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 194) {
					this.anInt991 = this.aClass1_Sub2_Sub3_8.method328();
					this.anInt992 = this.aClass1_Sub2_Sub3_8.method326(this.anInt853);
					while (this.aClass1_Sub2_Sub3_8.anInt474 < this.anInt950) {
						local161 = this.aClass1_Sub2_Sub3_8.method307();
						this.method643(this.aClass1_Sub2_Sub3_8, local161);
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 14) {
					for (local161 = 0; local161 < this.anIntArray268.length; local161++) {
						if (this.anIntArray268[local161] != this.anIntArray212[local161]) {
							this.anIntArray268[local161] = this.anIntArray212[local161];
							this.method699(local161);
							this.aBoolean202 = true;
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 103) {
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					local166 = this.aClass1_Sub2_Sub3_8.method309();
					local198 = local166 >> 10 & 0x1F;
					local387 = local166 >> 5 & 0x1F;
					local915 = local166 & 0x1F;
					Class18.method187(local161).anInt350 = (local198 << 19) + (local387 << 11) + (local915 << 3);
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 168) {
					this.anInt965 = this.aClass1_Sub2_Sub3_8.method336();
					this.anInt1054 = this.aClass1_Sub2_Sub3_8.method326(this.anInt853);
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 253) {
					this.anInt989 = 0;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 173) {
					local161 = this.aClass1_Sub2_Sub3_8.method334();
					local166 = this.aClass1_Sub2_Sub3_8.method309();
					local198 = this.aClass1_Sub2_Sub3_8.method334();
					if (local166 == 65535) {
						Class18.method187(local198).anInt322 = 0;
						this.anInt951 = -1;
						return true;
					}
					@Pc(4121) Class38 local4121 = Class38.method409(local166);
					Class18.method187(local198).anInt322 = 4;
					Class18.method187(local198).anInt323 = local166;
					Class18.method187(local198).anInt325 = local4121.anInt595;
					Class18.method187(local198).anInt326 = local4121.anInt587;
					Class18.method187(local198).anInt324 = local4121.anInt580 * 100 / local161;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 59) {
					this.anInt913 = this.aClass1_Sub2_Sub3_8.method328();
					this.aBoolean202 = true;
					this.aBoolean185 = true;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 32) {
					for (local161 = 0; local161 < this.aClass1_Sub2_Sub2_Sub1_Sub1Array1.length; local161++) {
						if (this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local161] != null) {
							this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local161].anInt764 = -1;
						}
					}
					for (local166 = 0; local166 < this.aClass1_Sub2_Sub2_Sub1_Sub2Array1.length; local166++) {
						if (this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local166] != null) {
							this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local166].anInt764 = -1;
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 40) {
					local161 = this.aClass1_Sub2_Sub3_8.method334();
					local166 = this.aClass1_Sub2_Sub3_8.method336();
					local3241 = Class18.method187(local166);
					if (local3241 != null && local3241.anInt348 == 0) {
						if (local161 < 0) {
							local161 = 0;
						}
						if (local161 > local3241.anInt336 - local3241.anInt349) {
							local161 = local3241.anInt336 - local3241.anInt349;
						}
						local3241.anInt321 = local161;
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 246) {
					this.anInt947 = this.anInt950 / 8;
					for (local161 = 0; local161 < this.anInt947; local161++) {
						this.aLongArray4[local161] = this.aClass1_Sub2_Sub3_8.method313();
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 201) {
					this.anInt992 = this.aClass1_Sub2_Sub3_8.method307();
					this.anInt991 = this.aClass1_Sub2_Sub3_8.method328();
					for (local161 = this.anInt991; local161 < this.anInt991 + 8; local161++) {
						for (local166 = this.anInt992; local166 < this.anInt992 + 8; local166++) {
							if (this.aClass42ArrayArrayArray1[this.anInt1001][local161][local166] != null) {
								this.aClass42ArrayArrayArray1[this.anInt1001][local161][local166] = null;
								this.method619(local161, local166);
							}
						}
					}
					for (@Pc(4372) Class1_Sub1 local4372 = (Class1_Sub1) this.aClass42_10.method487(); local4372 != null; local4372 = (Class1_Sub1) this.aClass42_10.method489()) {
						if (local4372.anInt4 >= this.anInt991 && local4372.anInt4 < this.anInt991 + 8 && local4372.anInt5 >= this.anInt992 && local4372.anInt5 < this.anInt992 + 8 && local4372.anInt2 == this.anInt1001) {
							local4372.anInt12 = 0;
						}
					}
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 80) {
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					local166 = this.aClass1_Sub2_Sub3_8.method334();
					local198 = this.aClass1_Sub2_Sub3_8.method334();
					local387 = this.aClass1_Sub2_Sub3_8.method335();
					Class18.method187(local166).anInt325 = local198;
					Class18.method187(local166).anInt326 = local387;
					Class18.method187(local166).anInt324 = local161;
					this.anInt951 = -1;
					return true;
				}
				if (this.anInt951 == 15) {
					local161 = this.aClass1_Sub2_Sub3_8.method309();
					local166 = this.aClass1_Sub2_Sub3_8.method334();
					Class18.method187(local161).anInt322 = 1;
					Class18.method187(local161).anInt323 = local166;
					this.anInt951 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt951 + "," + this.anInt950 + " - " + this.anInt900 + "," + this.anInt901);
				this.method680();
			} catch (@Pc(4514) IOException local4514) {
				this.method723(253);
			} catch (@Pc(4519) Exception local4519) {
				local2252 = "T2 - " + this.anInt951 + "," + this.anInt900 + "," + this.anInt901 + " - " + this.anInt950 + "," + (this.anInt958 + aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0]) + "," + (this.anInt959 + aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0]) + " - ";
				for (local166 = 0; local166 < this.anInt950 && local166 < 50; local166++) {
					local2252 = local2252 + this.aClass1_Sub2_Sub3_8.aByteArray10[local166] + ",";
				}
				signlink.reporterror(local2252);
				this.method680();
			}
			return true;
		} catch (@Pc(4600) RuntimeException local4600) {
			signlink.reporterror("53621, " + true + ", " + local4600.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588(20, (byte) 6, "Starting up");
		if (signlink.sunjava) {
			super.anInt809 = 5;
		}
		if (aBoolean196) {
			this.aBoolean189 = true;
			return;
		}
		aBoolean196 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method689();
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
		if (local25.endsWith("192.168.1.221")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean201 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass43Array1[local107] = new Class43(500000, signlink.aRandomAccessFileArray1[local107], local107 + 1, false, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method645((byte) 4);
			this.aClass31_2 = this.method663(1, "title screen", this.anIntArray261[1], 25, "title");
			this.aClass1_Sub2_Sub1_Sub4_2 = new Class1_Sub2_Sub1_Sub4(this.aClass31_2, false, 260, "p11_full");
			this.aClass1_Sub2_Sub1_Sub4_3 = new Class1_Sub2_Sub1_Sub4(this.aClass31_2, false, 260, "p12_full");
			this.aClass1_Sub2_Sub1_Sub4_4 = new Class1_Sub2_Sub1_Sub4(this.aClass31_2, false, 260, "b12_full");
			this.aClass1_Sub2_Sub1_Sub4_5 = new Class1_Sub2_Sub1_Sub4(this.aClass31_2, true, 260, "q8_full");
			this.method673(aBoolean192);
			this.method693();
			@Pc(203) Class31 local203 = this.method663(2, "config", this.anIntArray261[2], 30, "config");
			@Pc(215) Class31 local215 = this.method663(3, "interface", this.anIntArray261[3], 35, "interface");
			@Pc(227) Class31 local227 = this.method663(4, "2d graphics", this.anIntArray261[4], 40, "media");
			@Pc(239) Class31 local239 = this.method663(6, "textures", this.anIntArray261[6], 45, "textures");
			@Pc(251) Class31 local251 = this.method663(7, "chat system", this.anIntArray261[7], 50, "wordenc");
			@Pc(263) Class31 local263 = this.method663(8, "sound effects", this.anIntArray261[8], 55, "sounds");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass16_1 = new Class16(this.anIntArrayArrayArray8, 104, 4, 104, aBoolean199);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass10Array1[local288] = new Class10(104, 104, -18093);
			}
			this.aClass1_Sub2_Sub1_Sub2_9 = new Class1_Sub2_Sub1_Sub2(512, 512);
			@Pc(323) Class31 local323 = this.method663(5, "update list", this.anIntArray261[5], 60, "versionlist");
			this.method588(60, (byte) 6, "Connecting to update server");
			this.aClass22_Sub1_1 = new Class22_Sub1();
			this.aClass22_Sub1_1.method474(local323, this);
			Class11.method119(this.aClass22_Sub1_1.method465(50));
			Class1_Sub2_Sub2_Sub3.method193(this.aClass22_Sub1_1.method468(0), this.aClass22_Sub1_1);
			if (!aBoolean215) {
				this.anInt1038 = 0;
				this.aBoolean228 = true;
				this.aClass22_Sub1_1.method470(2, this.anInt1038);
				while (this.aClass22_Sub1_1.method463() > 0) {
					this.method722();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass22_Sub1_1.anInt648 > 3) {
						this.method635("ondemand");
						return;
					}
				}
			}
			this.method588(65, (byte) 6, "Requesting animations");
			@Pc(398) int local398 = this.aClass22_Sub1_1.method468(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass22_Sub1_1.method470(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass22_Sub1_1.method463() > 0) {
				local419 = local398 - this.aClass22_Sub1_1.method463();
				if (local419 > 0) {
					this.method588(65, (byte) 6, "Loading animations - " + local419 * 100 / local398 + "%");
				}
				this.method722();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass22_Sub1_1.anInt648 > 3) {
					this.method635("ondemand");
					return;
				}
			}
			this.method588(70, (byte) 6, "Requesting models");
			local398 = this.aClass22_Sub1_1.method468(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass22_Sub1_1.method462(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass22_Sub1_1.method470(0, local419);
				}
			}
			local398 = this.aClass22_Sub1_1.method463();
			while (this.aClass22_Sub1_1.method463() > 0) {
				local479 = local398 - this.aClass22_Sub1_1.method463();
				if (local479 > 0) {
					this.method588(70, (byte) 6, "Loading models - " + local479 * 100 / local398 + "%");
				}
				this.method722();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass43Array1[0] != null) {
				this.method588(75, (byte) 6, "Requesting maps");
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(47, 48, 0));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(47, 48, 1));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(48, 48, 0));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(48, 48, 1));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(49, 48, 0));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(49, 48, 1));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(47, 47, 0));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(47, 47, 1));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(48, 47, 0));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(48, 47, 1));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(48, 148, 0));
				this.aClass22_Sub1_1.method470(3, this.aClass22_Sub1_1.method456(48, 148, 1));
				local398 = this.aClass22_Sub1_1.method463();
				while (this.aClass22_Sub1_1.method463() > 0) {
					local479 = local398 - this.aClass22_Sub1_1.method463();
					if (local479 > 0) {
						this.method588(75, (byte) 6, "Loading maps - " + local479 * 100 / local398 + "%");
					}
					this.method722();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass22_Sub1_1.method468(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass22_Sub1_1.method462(local479);
				@Pc(738) byte local738 = 0;
				if ((local736 & 0x8) != 0) {
					local738 = 10;
				} else if ((local736 & 0x20) != 0) {
					local738 = 9;
				} else if ((local736 & 0x10) != 0) {
					local738 = 8;
				} else if ((local736 & 0x40) != 0) {
					local738 = 7;
				} else if ((local736 & 0x80) != 0) {
					local738 = 6;
				} else if ((local736 & 0x2) != 0) {
					local738 = 5;
				} else if ((local736 & 0x4) != 0) {
					local738 = 4;
				}
				if ((local736 & 0x1) != 0) {
					local738 = 3;
				}
				if (local738 != 0) {
					this.aClass22_Sub1_1.method473(0, local479, local738);
				}
			}
			this.aClass22_Sub1_1.method469(aBoolean214);
			if (!aBoolean215) {
				local398 = this.aClass22_Sub1_1.method468(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass22_Sub1_1.method459(local736)) {
						this.aClass22_Sub1_1.method473(2, local736, (byte) 1);
					}
				}
			}
			this.method588(80, (byte) 6, "Unpacking media");
			this.aClass1_Sub2_Sub1_Sub1_3 = new Class1_Sub2_Sub1_Sub1(local227, "invback", 0);
			this.aClass1_Sub2_Sub1_Sub1_5 = new Class1_Sub2_Sub1_Sub1(local227, "chatback", 0);
			this.aClass1_Sub2_Sub1_Sub1_4 = new Class1_Sub2_Sub1_Sub1(local227, "mapback", 0);
			this.aClass1_Sub2_Sub1_Sub1_8 = new Class1_Sub2_Sub1_Sub1(local227, "backbase1", 0);
			this.aClass1_Sub2_Sub1_Sub1_9 = new Class1_Sub2_Sub1_Sub1(local227, "backbase2", 0);
			this.aClass1_Sub2_Sub1_Sub1_10 = new Class1_Sub2_Sub1_Sub1(local227, "backhmid1", 0);
			for (local736 = 0; local736 < 13; local736++) {
				this.aClass1_Sub2_Sub1_Sub1Array2[local736] = new Class1_Sub2_Sub1_Sub1(local227, "sideicons", local736);
			}
			this.aClass1_Sub2_Sub1_Sub2_3 = new Class1_Sub2_Sub1_Sub2(local227, "compass", 0);
			this.aClass1_Sub2_Sub1_Sub2_6 = new Class1_Sub2_Sub1_Sub2(local227, "mapedge", 0);
			this.aClass1_Sub2_Sub1_Sub2_6.method389();
			for (@Pc(938) int local938 = 0; local938 < 72; local938++) {
				this.aClass1_Sub2_Sub1_Sub1Array3[local938] = new Class1_Sub2_Sub1_Sub1(local227, "mapscene", local938);
			}
			for (@Pc(956) int local956 = 0; local956 < 70; local956++) {
				this.aClass1_Sub2_Sub1_Sub2Array7[local956] = new Class1_Sub2_Sub1_Sub2(local227, "mapfunction", local956);
			}
			for (@Pc(974) int local974 = 0; local974 < 5; local974++) {
				this.aClass1_Sub2_Sub1_Sub2Array8[local974] = new Class1_Sub2_Sub1_Sub2(local227, "hitmarks", local974);
			}
			for (@Pc(992) int local992 = 0; local992 < 6; local992++) {
				this.aClass1_Sub2_Sub1_Sub2Array9[local992] = new Class1_Sub2_Sub1_Sub2(local227, "headicons_pk", local992);
			}
			for (@Pc(1010) int local1010 = 0; local1010 < 9; local1010++) {
				this.aClass1_Sub2_Sub1_Sub2Array6[local1010] = new Class1_Sub2_Sub1_Sub2(local227, "headicons_prayer", local1010);
			}
			for (@Pc(1028) int local1028 = 0; local1028 < 6; local1028++) {
				this.aClass1_Sub2_Sub1_Sub2Array10[local1028] = new Class1_Sub2_Sub1_Sub2(local227, "headicons_hint", local1028);
			}
			this.aClass1_Sub2_Sub1_Sub2_10 = new Class1_Sub2_Sub1_Sub2(local227, "overlay_multiway", 0);
			this.aClass1_Sub2_Sub1_Sub2_7 = new Class1_Sub2_Sub1_Sub2(local227, "mapmarker", 0);
			this.aClass1_Sub2_Sub1_Sub2_8 = new Class1_Sub2_Sub1_Sub2(local227, "mapmarker", 1);
			for (@Pc(1070) int local1070 = 0; local1070 < 8; local1070++) {
				this.aClass1_Sub2_Sub1_Sub2Array5[local1070] = new Class1_Sub2_Sub1_Sub2(local227, "cross", local1070);
			}
			this.aClass1_Sub2_Sub1_Sub2_11 = new Class1_Sub2_Sub1_Sub2(local227, "mapdots", 0);
			this.aClass1_Sub2_Sub1_Sub2_12 = new Class1_Sub2_Sub1_Sub2(local227, "mapdots", 1);
			this.aClass1_Sub2_Sub1_Sub2_13 = new Class1_Sub2_Sub1_Sub2(local227, "mapdots", 2);
			this.aClass1_Sub2_Sub1_Sub2_14 = new Class1_Sub2_Sub1_Sub2(local227, "mapdots", 3);
			this.aClass1_Sub2_Sub1_Sub2_15 = new Class1_Sub2_Sub1_Sub2(local227, "mapdots", 4);
			this.aClass1_Sub2_Sub1_Sub1_1 = new Class1_Sub2_Sub1_Sub1(local227, "scrollbar", 0);
			this.aClass1_Sub2_Sub1_Sub1_2 = new Class1_Sub2_Sub1_Sub1(local227, "scrollbar", 1);
			this.aClass1_Sub2_Sub1_Sub1_11 = new Class1_Sub2_Sub1_Sub1(local227, "redstone1", 0);
			this.aClass1_Sub2_Sub1_Sub1_12 = new Class1_Sub2_Sub1_Sub1(local227, "redstone2", 0);
			this.aClass1_Sub2_Sub1_Sub1_13 = new Class1_Sub2_Sub1_Sub1(local227, "redstone3", 0);
			this.aClass1_Sub2_Sub1_Sub1_14 = new Class1_Sub2_Sub1_Sub1(local227, "redstone1", 0);
			this.aClass1_Sub2_Sub1_Sub1_14.method48();
			this.aClass1_Sub2_Sub1_Sub1_15 = new Class1_Sub2_Sub1_Sub1(local227, "redstone2", 0);
			this.aClass1_Sub2_Sub1_Sub1_15.method48();
			this.aClass1_Sub2_Sub1_Sub1_16 = new Class1_Sub2_Sub1_Sub1(local227, "redstone1", 0);
			this.aClass1_Sub2_Sub1_Sub1_16.method49();
			this.aClass1_Sub2_Sub1_Sub1_17 = new Class1_Sub2_Sub1_Sub1(local227, "redstone2", 0);
			this.aClass1_Sub2_Sub1_Sub1_17.method49();
			this.aClass1_Sub2_Sub1_Sub1_18 = new Class1_Sub2_Sub1_Sub1(local227, "redstone3", 0);
			this.aClass1_Sub2_Sub1_Sub1_18.method49();
			this.aClass1_Sub2_Sub1_Sub1_19 = new Class1_Sub2_Sub1_Sub1(local227, "redstone1", 0);
			this.aClass1_Sub2_Sub1_Sub1_19.method48();
			this.aClass1_Sub2_Sub1_Sub1_19.method49();
			this.aClass1_Sub2_Sub1_Sub1_20 = new Class1_Sub2_Sub1_Sub1(local227, "redstone2", 0);
			this.aClass1_Sub2_Sub1_Sub1_20.method48();
			this.aClass1_Sub2_Sub1_Sub1_20.method49();
			for (@Pc(1260) int local1260 = 0; local1260 < 2; local1260++) {
				this.aClass1_Sub2_Sub1_Sub1Array5[local1260] = new Class1_Sub2_Sub1_Sub1(local227, "mod_icons", local1260);
			}
			@Pc(1283) Class1_Sub2_Sub1_Sub2 local1283 = new Class1_Sub2_Sub1_Sub2(local227, "backleft1", 0);
			this.aClass26_16 = new Class26(local1283.anInt561, 0, local1283.anInt560, this.method586(735));
			local1283.method390(0, 0);
			@Pc(1308) Class1_Sub2_Sub1_Sub2 local1308 = new Class1_Sub2_Sub1_Sub2(local227, "backleft2", 0);
			this.aClass26_17 = new Class26(local1308.anInt561, 0, local1308.anInt560, this.method586(735));
			local1308.method390(0, 0);
			@Pc(1333) Class1_Sub2_Sub1_Sub2 local1333 = new Class1_Sub2_Sub1_Sub2(local227, "backright1", 0);
			this.aClass26_18 = new Class26(local1333.anInt561, 0, local1333.anInt560, this.method586(735));
			local1333.method390(0, 0);
			@Pc(1358) Class1_Sub2_Sub1_Sub2 local1358 = new Class1_Sub2_Sub1_Sub2(local227, "backright2", 0);
			this.aClass26_19 = new Class26(local1358.anInt561, 0, local1358.anInt560, this.method586(735));
			local1358.method390(0, 0);
			@Pc(1383) Class1_Sub2_Sub1_Sub2 local1383 = new Class1_Sub2_Sub1_Sub2(local227, "backtop1", 0);
			this.aClass26_20 = new Class26(local1383.anInt561, 0, local1383.anInt560, this.method586(735));
			local1383.method390(0, 0);
			@Pc(1408) Class1_Sub2_Sub1_Sub2 local1408 = new Class1_Sub2_Sub1_Sub2(local227, "backvmid1", 0);
			this.aClass26_21 = new Class26(local1408.anInt561, 0, local1408.anInt560, this.method586(735));
			local1408.method390(0, 0);
			@Pc(1433) Class1_Sub2_Sub1_Sub2 local1433 = new Class1_Sub2_Sub1_Sub2(local227, "backvmid2", 0);
			this.aClass26_22 = new Class26(local1433.anInt561, 0, local1433.anInt560, this.method586(735));
			local1433.method390(0, 0);
			@Pc(1458) Class1_Sub2_Sub1_Sub2 local1458 = new Class1_Sub2_Sub1_Sub2(local227, "backvmid3", 0);
			this.aClass26_23 = new Class26(local1458.anInt561, 0, local1458.anInt560, this.method586(735));
			local1458.method390(0, 0);
			@Pc(1483) Class1_Sub2_Sub1_Sub2 local1483 = new Class1_Sub2_Sub1_Sub2(local227, "backhmid2", 0);
			this.aClass26_24 = new Class26(local1483.anInt561, 0, local1483.anInt560, this.method586(735));
			local1483.method390(0, 0);
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1529) int local1529 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1531) int local1531 = 0; local1531 < 100; local1531++) {
				if (this.aClass1_Sub2_Sub1_Sub2Array7[local1531] != null) {
					this.aClass1_Sub2_Sub1_Sub2Array7[local1531].method388(local1515 + local1529, local1508 + local1529, local1522 + local1529);
				}
				if (this.aClass1_Sub2_Sub1_Sub1Array3[local1531] != null) {
					this.aClass1_Sub2_Sub1_Sub1Array3[local1531].method50(local1515 + local1529, local1508 + local1529, local1522 + local1529);
				}
			}
			this.method588(83, (byte) 6, "Unpacking textures");
			Class1_Sub2_Sub1_Sub3.method438(929, local239);
			Class1_Sub2_Sub1_Sub3.method442(0.8D);
			Class1_Sub2_Sub1_Sub3.method437((byte) 2);
			this.method588(86, (byte) 6, "Unpacking config");
			Class36.method370(local203);
			Class27.method289(local203);
			Class9.method99(local203);
			Class38.method400(local203);
			Class34.method358(local203);
			Class35.method364(local203);
			Class33.method353(local203);
			Class15.method124(local203);
			Class29.method346(local203);
			Class38.aBoolean125 = aBoolean214;
			if (!aBoolean215) {
				this.method588(90, (byte) 6, "Unpacking sounds");
				@Pc(1634) byte[] local1634 = local263.method352("sounds.dat", null);
				@Pc(1640) Class1_Sub2_Sub3 local1640 = new Class1_Sub2_Sub3(local1634, -670);
				Class3.method83(local1640);
			}
			this.method588(95, (byte) 6, "Unpacking interfaces");
			@Pc(1671) Class1_Sub2_Sub1_Sub4[] local1671 = new Class1_Sub2_Sub1_Sub4[] { this.aClass1_Sub2_Sub1_Sub4_2, this.aClass1_Sub2_Sub1_Sub4_3, this.aClass1_Sub2_Sub1_Sub4_4, this.aClass1_Sub2_Sub1_Sub4_5 };
			Class18.method185(local1671, local215, local227, aBoolean206);
			this.method588(100, (byte) 6, "Preparing game engine");
			@Pc(1687) int local1687;
			@Pc(1689) int local1689;
			@Pc(1691) int local1691;
			for (@Pc(1683) int local1683 = 0; local1683 < 33; local1683++) {
				local1687 = 999;
				local1689 = 0;
				for (local1691 = 0; local1691 < 34; local1691++) {
					if (this.aClass1_Sub2_Sub1_Sub1_4.aByteArray1[local1691 + local1683 * this.aClass1_Sub2_Sub1_Sub1_4.anInt62] == 0) {
						if (local1687 == 999) {
							local1687 = local1691;
						}
					} else if (local1687 != 999) {
						local1689 = local1691;
						break;
					}
				}
				this.anIntArray255[local1683] = local1687;
				this.anIntArray250[local1683] = local1689 - local1687;
			}
			@Pc(1749) int local1749;
			for (local1687 = 5; local1687 < 156; local1687++) {
				local1689 = 999;
				local1691 = 0;
				for (local1749 = 25; local1749 < 172; local1749++) {
					if (this.aClass1_Sub2_Sub1_Sub1_4.aByteArray1[local1749 + local1687 * this.aClass1_Sub2_Sub1_Sub1_4.anInt62] == 0 && (local1749 > 34 || local1687 > 34)) {
						if (local1689 == 999) {
							local1689 = local1749;
						}
					} else if (local1689 != 999) {
						local1691 = local1749;
						break;
					}
				}
				this.anIntArray241[local1687 - 5] = local1689 - 25;
				this.anIntArray233[local1687 - 5] = local1691 - local1689;
			}
			Class1_Sub2_Sub1_Sub3.method435(765, 503);
			this.anIntArray238 = Class1_Sub2_Sub1_Sub3.anIntArray147;
			Class1_Sub2_Sub1_Sub3.method435(479, 96);
			this.anIntArray235 = Class1_Sub2_Sub1_Sub3.anIntArray147;
			Class1_Sub2_Sub1_Sub3.method435(190, 261);
			this.anIntArray236 = Class1_Sub2_Sub1_Sub3.anIntArray147;
			Class1_Sub2_Sub1_Sub3.method435(512, 334);
			this.anIntArray237 = Class1_Sub2_Sub1_Sub3.anIntArray147;
			@Pc(1840) int[] local1840 = new int[9];
			for (local1691 = 0; local1691 < 9; local1691++) {
				local1749 = local1691 * 32 + 128 + 15;
				@Pc(1858) int local1858 = local1749 * 3 + 600;
				@Pc(1862) int local1862 = Class1_Sub2_Sub1_Sub3.anIntArray145[local1749];
				local1840[local1691] = local1858 * local1862 >> 16;
			}
			Class16.method163(local1840);
			Class24.method237(local251);
			this.aClass32_1 = new Class32(474, this);
			this.method587(this.aClass32_1, 10);
			Class1_Sub2_Sub2_Sub6.aClient5 = this;
			Class27.aClient1 = this;
			Class34.aClient3 = this;
		} catch (@Pc(1903) Exception local1903) {
			signlink.reporterror("loaderror " + this.aString28 + " " + this.anInt938);
			this.aBoolean231 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method701() {
		try {
			while (true) {
				@Pc(15) int local15 = this.method580();
				if (local15 == -1) {
					return;
				}
				if (this.anInt1056 != -1 && this.anInt1056 == this.anInt943) {
					if (local15 == 8 && this.aString31.length() > 0) {
						this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
					}
					if ((local15 >= 97 && local15 <= 122 || local15 >= 65 && local15 <= 90 || local15 >= 48 && local15 <= 57 || local15 == 32) && this.aString31.length() < 12) {
						this.aString31 = this.aString31 + (char) local15;
					}
				} else {
					@Pc(197) int local197;
					if (this.aBoolean233) {
						if (local15 >= 32 && local15 <= 122 && this.aString30.length() < 80) {
							this.aString30 = this.aString30 + (char) local15;
							this.aBoolean209 = true;
						}
						if (local15 == 8 && this.aString30.length() > 0) {
							this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							this.aBoolean209 = true;
						}
						if (local15 == 13 || local15 == 10) {
							this.aBoolean233 = false;
							this.aBoolean209 = true;
							@Pc(155) long local155;
							if (this.anInt927 == 1) {
								local155 = Class40.method413(this.aString30);
								this.method638(local155);
							}
							if (this.anInt927 == 2 && this.anInt875 > 0) {
								local155 = Class40.method413(this.aString30);
								this.method637(this.anInt1023, local155);
							}
							if (this.anInt927 == 3 && this.aString30.length() > 0) {
								this.aClass1_Sub2_Sub3_9.method296(21, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method297(0);
								local197 = this.aClass1_Sub2_Sub3_9.anInt474;
								this.aClass1_Sub2_Sub3_9.method303(this.aLong29, this.anInt907);
								Class49.method559(this.aString30, this.aClass1_Sub2_Sub3_9);
								this.aClass1_Sub2_Sub3_9.method306(this.aClass1_Sub2_Sub3_9.anInt474 - local197);
								this.aString30 = Class49.method560(this.anInt885, this.aString30);
								this.aString30 = Class24.method247(this.anInt885, this.aString30);
								this.method683(this.aString30, 6, Class40.method417(Class40.method414(this.aLong29)));
								if (this.anInt1042 == 2) {
									this.anInt1042 = 1;
									this.aBoolean200 = true;
									this.aClass1_Sub2_Sub3_9.method296(34, this.anInt1018);
									this.aClass1_Sub2_Sub3_9.method297(this.anInt869);
									this.aClass1_Sub2_Sub3_9.method297(this.anInt1042);
									this.aClass1_Sub2_Sub3_9.method297(this.anInt852);
								}
							}
							if (this.anInt927 == 4 && this.anInt947 < 100) {
								local155 = Class40.method413(this.aString30);
								this.method640(local155);
							}
							if (this.anInt927 == 5 && this.anInt947 > 0) {
								local155 = Class40.method413(this.aString30);
								this.method658(local155);
							}
						}
					} else if (this.anInt861 == 1) {
						if (local15 >= 48 && local15 <= 57 && this.aString17.length() < 10) {
							this.aString17 = this.aString17 + (char) local15;
							this.aBoolean209 = true;
						}
						if (local15 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean209 = true;
						}
						if (local15 == 13 || local15 == 10) {
							if (this.aString17.length() > 0) {
								local197 = 0;
								try {
									local197 = Integer.parseInt(this.aString17);
								} catch (@Pc(378) Exception local378) {
								}
								this.aClass1_Sub2_Sub3_9.method296(227, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method301(local197);
							}
							this.anInt861 = 0;
							this.aBoolean209 = true;
						}
					} else if (this.anInt861 == 2) {
						if (local15 >= 32 && local15 <= 122 && this.aString17.length() < 12) {
							this.aString17 = this.aString17 + (char) local15;
							this.aBoolean209 = true;
						}
						if (local15 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean209 = true;
						}
						if (local15 == 13 || local15 == 10) {
							if (this.aString17.length() > 0) {
								this.aClass1_Sub2_Sub3_9.method296(99, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method303(Class40.method413(this.aString17), this.anInt907);
							}
							this.anInt861 = 0;
							this.aBoolean209 = true;
						}
					} else if (this.anInt861 == 3) {
						if (local15 >= 32 && local15 <= 122 && this.aString17.length() < 40) {
							this.aString17 = this.aString17 + (char) local15;
							this.aBoolean209 = true;
						}
						if (local15 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean209 = true;
						}
					} else if (this.anInt956 == -1 && this.anInt1008 == -1) {
						if (local15 >= 32 && local15 <= 122 && this.aString18.length() < 80) {
							this.aString18 = this.aString18 + (char) local15;
							this.aBoolean209 = true;
						}
						if (local15 == 8 && this.aString18.length() > 0) {
							this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							this.aBoolean209 = true;
						}
						if ((local15 == 13 || local15 == 10) && this.aString18.length() > 0) {
							if (this.anInt856 == 2) {
								if (this.aString18.equals("::clientdrop")) {
									this.method723(253);
								}
								if (this.aString18.equals("::lag")) {
									this.method709(969);
								}
								if (this.aString18.equals("::prefetchmusic")) {
									for (local197 = 0; local197 < this.aClass22_Sub1_1.method468(2); local197++) {
										this.aClass22_Sub1_1.method473(2, local197, (byte) 1);
									}
								}
								if (this.aString18.equals("::fpson")) {
									aBoolean204 = true;
								}
								if (this.aString18.equals("::fpsoff")) {
									aBoolean204 = false;
								}
								if (this.aString18.equals("::noclip")) {
									for (local197 = 0; local197 < 4; local197++) {
										for (@Pc(666) int local666 = 1; local666 < 103; local666++) {
											for (@Pc(670) int local670 = 1; local670 < 103; local670++) {
												this.aClass10Array1[local197].anIntArrayArray3[local666][local670] = 0;
											}
										}
									}
								}
							}
							if (this.aString18.startsWith("::")) {
								this.aClass1_Sub2_Sub3_9.method296(32, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method297(this.aString18.length() - 1);
								this.aClass1_Sub2_Sub3_9.method304(this.aString18.substring(2));
							} else {
								@Pc(726) String local726 = this.aString18.toLowerCase();
								@Pc(728) byte local728 = 0;
								if (local726.startsWith("yellow:")) {
									local728 = 0;
									this.aString18 = this.aString18.substring(7);
								} else if (local726.startsWith("red:")) {
									local728 = 1;
									this.aString18 = this.aString18.substring(4);
								} else if (local726.startsWith("green:")) {
									local728 = 2;
									this.aString18 = this.aString18.substring(6);
								} else if (local726.startsWith("cyan:")) {
									local728 = 3;
									this.aString18 = this.aString18.substring(5);
								} else if (local726.startsWith("purple:")) {
									local728 = 4;
									this.aString18 = this.aString18.substring(7);
								} else if (local726.startsWith("white:")) {
									local728 = 5;
									this.aString18 = this.aString18.substring(6);
								} else if (local726.startsWith("flash1:")) {
									local728 = 6;
									this.aString18 = this.aString18.substring(7);
								} else if (local726.startsWith("flash2:")) {
									local728 = 7;
									this.aString18 = this.aString18.substring(7);
								} else if (local726.startsWith("flash3:")) {
									local728 = 8;
									this.aString18 = this.aString18.substring(7);
								} else if (local726.startsWith("glow1:")) {
									local728 = 9;
									this.aString18 = this.aString18.substring(6);
								} else if (local726.startsWith("glow2:")) {
									local728 = 10;
									this.aString18 = this.aString18.substring(6);
								} else if (local726.startsWith("glow3:")) {
									local728 = 11;
									this.aString18 = this.aString18.substring(6);
								}
								local726 = this.aString18.toLowerCase();
								@Pc(900) byte local900 = 0;
								if (local726.startsWith("wave:")) {
									local900 = 1;
									this.aString18 = this.aString18.substring(5);
								} else if (local726.startsWith("wave2:")) {
									local900 = 2;
									this.aString18 = this.aString18.substring(6);
								} else if (local726.startsWith("shake:")) {
									local900 = 3;
									this.aString18 = this.aString18.substring(6);
								} else if (local726.startsWith("scroll:")) {
									local900 = 4;
									this.aString18 = this.aString18.substring(7);
								} else if (local726.startsWith("slide:")) {
									local900 = 5;
									this.aString18 = this.aString18.substring(6);
								}
								this.aClass1_Sub2_Sub3_9.method296(68, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method297(0);
								@Pc(982) int local982 = this.aClass1_Sub2_Sub3_9.anInt474;
								this.aClass1_Sub2_Sub3_9.method297(local728);
								this.aClass1_Sub2_Sub3_9.method323(this.aByte40, local900);
								this.aClass1_Sub2_Sub3_7.anInt474 = 0;
								Class49.method559(this.aString18, this.aClass1_Sub2_Sub3_7);
								this.aClass1_Sub2_Sub3_9.method305(this.aClass1_Sub2_Sub3_7.anInt474, this.aClass1_Sub2_Sub3_7.aByteArray10);
								this.aClass1_Sub2_Sub3_9.method306(this.aClass1_Sub2_Sub3_9.anInt474 - local982);
								this.aString18 = Class49.method560(this.anInt885, this.aString18);
								this.aString18 = Class24.method247(this.anInt885, this.aString18);
								aClass1_Sub2_Sub2_Sub1_Sub1_1.aString16 = this.aString18;
								aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt743 = local728;
								aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt755 = local900;
								aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt788 = 150;
								if (this.anInt856 == 2) {
									this.method683(aClass1_Sub2_Sub2_Sub1_Sub1_1.aString16, 2, "@cr2@" + aClass1_Sub2_Sub2_Sub1_Sub1_1.aString3);
								} else if (this.anInt856 == 1) {
									this.method683(aClass1_Sub2_Sub2_Sub1_Sub1_1.aString16, 2, "@cr1@" + aClass1_Sub2_Sub2_Sub1_Sub1_1.aString3);
								} else {
									this.method683(aClass1_Sub2_Sub2_Sub1_Sub1_1.aString16, 2, aClass1_Sub2_Sub2_Sub1_Sub1_1.aString3);
								}
								if (this.anInt869 == 2) {
									this.anInt869 = 3;
									this.aBoolean200 = true;
									this.aClass1_Sub2_Sub3_9.method296(34, this.anInt1018);
									this.aClass1_Sub2_Sub3_9.method297(this.anInt869);
									this.aClass1_Sub2_Sub3_9.method297(this.anInt1042);
									this.aClass1_Sub2_Sub3_9.method297(this.anInt852);
								}
							}
							this.aString18 = "";
							this.aBoolean209 = true;
						}
					}
				}
			}
		} catch (@Pc(1138) RuntimeException local1138) {
			signlink.reporterror("6193, " + 4 + ", " + local1138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method702() {
		try {
			if (this.anInt855 != 0) {
				@Pc(12) int local12 = 0;
				if (this.anInt898 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray11[local19] != null) {
						@Pc(31) int local31 = this.anIntArray221[local19];
						@Pc(36) String local36 = this.aStringArray10[local19];
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
						}
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt1042 == 0 || this.anInt1042 == 1 && this.method592(426, local36))) {
							@Pc(89) int local89 = 329 - local12 * 13;
							if (super.anInt815 > 4 && super.anInt816 - 4 > local89 - 10 && super.anInt816 - 4 <= local89 + 3) {
								@Pc(128) int local128 = this.aClass1_Sub2_Sub1_Sub4_3.method545("From:  " + local36 + this.aStringArray11[local19]) + 25;
								if (local128 > 450) {
									local128 = 450;
								}
								if (super.anInt815 < local128 + 4) {
									if (this.anInt856 >= 1) {
										this.aStringArray8[this.anInt1041] = "Report abuse @whi@" + local36;
										this.anIntArray244[this.anInt1041] = 2989;
										this.anInt1041++;
									}
									this.aStringArray8[this.anInt1041] = "Add ignore @whi@" + local36;
									this.anIntArray244[this.anInt1041] = 2405;
									this.anInt1041++;
									this.aStringArray8[this.anInt1041] = "Add friend @whi@" + local36;
									this.anIntArray244[this.anInt1041] = 2009;
									this.anInt1041++;
								}
							}
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if ((local31 == 5 || local31 == 6) && this.anInt1042 < 2) {
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("56278, " + true + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method703() {
		try {
			signlink.aBoolean236 = false;
			signlink.anInt1068 = 0;
			signlink.midi = "stop";
			this.anInt950 += 0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("12775, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method704() {
		try {
			if (this.aClass26_6 == null) {
				this.method677();
				super.aClass26_2 = null;
				this.aClass26_7 = null;
				this.aClass26_8 = null;
				this.aClass26_9 = null;
				this.aClass26_10 = null;
				this.aClass26_11 = null;
				this.aClass26_12 = null;
				this.aClass26_13 = null;
				this.aClass26_14 = null;
				this.aClass26_15 = null;
				this.aClass26_6 = new Class26(96, 0, 479, this.method586(735));
				this.aClass26_4 = new Class26(156, 0, 172, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass1_Sub2_Sub1_Sub1_4.method51(0, 0);
				this.anInt950 += 0;
				this.aClass26_3 = new Class26(261, 0, 190, this.method586(735));
				this.aClass26_5 = new Class26(334, 0, 512, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_25 = new Class26(50, 0, 496, this.method586(735));
				this.aClass26_26 = new Class26(37, 0, 269, this.method586(735));
				this.aClass26_27 = new Class26(45, 0, 249, this.method586(735));
				this.aBoolean212 = true;
				this.aClass26_5.method279();
				Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("57656, " + 0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method705() {
		try {
			this.anInt950 += 0;
			if (super.anInt820 == 1) {
				if (super.anInt821 >= 539 && super.anInt821 <= 573 && super.anInt822 >= 169 && super.anInt822 < 205 && this.anIntArray246[0] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 0;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 569 && super.anInt821 <= 599 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray246[1] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 1;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 597 && super.anInt821 <= 627 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray246[2] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 2;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 625 && super.anInt821 <= 669 && super.anInt822 >= 168 && super.anInt822 < 203 && this.anIntArray246[3] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 3;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 666 && super.anInt821 <= 696 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray246[4] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 4;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 694 && super.anInt821 <= 724 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray246[5] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 5;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 722 && super.anInt821 <= 756 && super.anInt822 >= 169 && super.anInt822 < 205 && this.anIntArray246[6] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 6;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 540 && super.anInt821 <= 574 && super.anInt822 >= 466 && super.anInt822 < 502 && this.anIntArray246[7] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 7;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 572 && super.anInt821 <= 602 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray246[8] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 8;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 599 && super.anInt821 <= 629 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray246[9] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 9;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 627 && super.anInt821 <= 671 && super.anInt822 >= 467 && super.anInt822 < 502 && this.anIntArray246[10] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 10;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 669 && super.anInt821 <= 699 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray246[11] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 11;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 696 && super.anInt821 <= 726 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray246[12] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 12;
					this.aBoolean185 = true;
				}
				if (super.anInt821 >= 724 && super.anInt821 <= 758 && super.anInt822 >= 466 && super.anInt822 < 502 && this.anIntArray246[13] != -1) {
					this.aBoolean202 = true;
					this.anInt913 = 13;
					this.aBoolean185 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("11911, " + 0 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
	private boolean method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray244[arg1];
			@Pc(12) boolean local12 = true;
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 9;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("62946, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method707() {
		try {
			if (this.anInt855 != 0) {
				@Pc(6) Class1_Sub2_Sub1_Sub4 local6 = this.aClass1_Sub2_Sub1_Sub4_3;
				this.aBoolean217 &= true;
				@Pc(14) int local14 = 0;
				if (this.anInt898 != 0) {
					local14 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray11[local21] != null) {
						@Pc(33) int local33 = this.anIntArray221[local21];
						@Pc(38) String local38 = this.aStringArray10[local21];
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
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt1042 == 0 || this.anInt1042 == 1 && this.method592(426, local38))) {
							local91 = 329 - local14 * 13;
							local6.method547(0, "From", 4, local91);
							local6.method547(65535, "From", 4, local91 - 1);
							@Pc(116) int local116 = local6.method545("From ") + 4;
							if (local40 == 1) {
								this.aClass1_Sub2_Sub1_Sub1Array5[0].method51(local91 - 12, local116);
								local116 += 14;
							}
							if (local40 == 2) {
								this.aClass1_Sub2_Sub1_Sub1Array5[1].method51(local91 - 12, local116);
								local116 += 14;
							}
							local6.method547(0, local38 + ": " + this.aStringArray11[local21], local116, local91);
							local6.method547(65535, local38 + ": " + this.aStringArray11[local21], local116, local91 - 1);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt1042 < 2) {
							local91 = 329 - local14 * 13;
							local6.method547(0, this.aStringArray11[local21], 4, local91);
							local6.method547(65535, this.aStringArray11[local21], 4, local91 - 1);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt1042 < 2) {
							local91 = 329 - local14 * 13;
							local6.method547(0, "To " + local38 + ": " + this.aStringArray11[local21], 4, local91);
							local6.method547(65535, "To " + local38 + ": " + this.aStringArray11[local21], 4, local91 - 1);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("96481, " + true + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method708() {
		try {
			this.aClass26_4.method279();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt1046 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub2_Sub1_Sub1_4.aByteArray1;
				@Pc(15) int[] local15 = Class1_Sub2_Sub1.anIntArray198;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub2_Sub1_Sub2_3.method396(33, 25, 25, 256, 0, this.anIntArray255, this.anInt1031, this.anIntArray250, 33, 0);
				this.aClass26_5.method279();
				Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
			} else {
				@Pc(67) int local67 = this.anInt1031 + this.anInt877 & 0x7FF;
				@Pc(74) int local74 = aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32 + 48;
				local18 = 464 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
				this.aClass1_Sub2_Sub1_Sub2_9.method396(146, local74, local18, this.anInt993 + 256, 5, this.anIntArray241, local67, this.anIntArray233, 151, 25);
				this.aClass1_Sub2_Sub1_Sub2_3.method396(33, 25, 25, 256, 0, this.anIntArray255, this.anInt1031, this.anIntArray250, 33, 0);
				for (local20 = 0; local20 < this.anInt982; local20++) {
					local74 = this.anIntArray259[local20] * 4 + 2 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32;
					local18 = this.anIntArray260[local20] * 4 + 2 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
					this.method713(local74, this.aClass1_Sub2_Sub1_Sub2Array4[local20], local18);
				}
				@Pc(169) int local169;
				for (@Pc(165) int local165 = 0; local165 < 104; local165++) {
					for (local169 = 0; local169 < 104; local169++) {
						@Pc(181) Class42 local181 = this.aClass42ArrayArrayArray1[this.anInt1001][local165][local169];
						if (local181 != null) {
							local74 = local165 * 4 + 2 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32;
							local18 = local169 * 4 + 2 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
							this.method713(local74, this.aClass1_Sub2_Sub1_Sub2_11, local18);
						}
					}
				}
				for (local169 = 0; local169 < this.anInt975; local169++) {
					@Pc(232) Class1_Sub2_Sub2_Sub1_Sub2 local232 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[this.anIntArray256[local169]];
					if (local232 != null && local232.method568()) {
						@Pc(241) Class34 local241 = local232.aClass34_2;
						if (local241.anIntArray122 != null) {
							local241 = local241.method357();
						}
						if (local241 != null && local241.aBoolean110 && local241.aBoolean107) {
							local74 = local232.anInt776 / 32 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32;
							local18 = local232.anInt777 / 32 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
							this.method713(local74, this.aClass1_Sub2_Sub1_Sub2_12, local18);
						}
					}
				}
				@Pc(300) Class1_Sub2_Sub2_Sub1_Sub1 local300;
				for (@Pc(290) int local290 = 0; local290 < this.anInt923; local290++) {
					local300 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anIntArray247[local290]];
					if (local300 != null && local300.method568()) {
						local74 = local300.anInt776 / 32 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32;
						local18 = local300.anInt777 / 32 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
						@Pc(328) boolean local328 = false;
						@Pc(332) long local332 = Class40.method413(local300.aString3);
						for (@Pc(334) int local334 = 0; local334 < this.anInt875; local334++) {
							if (local332 == this.aLongArray3[local334] && this.anIntArray258[local334] != 0) {
								local328 = true;
								break;
							}
						}
						@Pc(359) boolean local359 = false;
						if (aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt176 != 0 && local300.anInt176 != 0 && aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt176 == local300.anInt176) {
							local359 = true;
						}
						if (local328) {
							this.method713(local74, this.aClass1_Sub2_Sub1_Sub2_14, local18);
						} else if (local359) {
							this.method713(local74, this.aClass1_Sub2_Sub1_Sub2_15, local18);
						} else {
							this.method713(local74, this.aClass1_Sub2_Sub1_Sub2_13, local18);
						}
					}
				}
				if (this.anInt849 != 0 && anInt1045 % 20 < 10) {
					if (this.anInt849 == 1 && this.anInt827 >= 0 && this.anInt827 < this.aClass1_Sub2_Sub2_Sub1_Sub2Array1.length) {
						@Pc(433) Class1_Sub2_Sub2_Sub1_Sub2 local433 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[this.anInt827];
						if (local433 != null) {
							local74 = local433.anInt776 / 32 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32;
							local18 = local433.anInt777 / 32 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
							this.method669(this.aClass1_Sub2_Sub1_Sub2_8, local18, local74);
						}
					}
					if (this.anInt849 == 2) {
						local74 = (this.anInt844 - this.anInt958) * 4 + 2 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32;
						local18 = (this.anInt845 - this.anInt959) * 4 + 2 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
						this.method669(this.aClass1_Sub2_Sub1_Sub2_8, local18, local74);
					}
					if (this.anInt849 == 10 && this.anInt850 >= 0 && this.anInt850 < this.aClass1_Sub2_Sub2_Sub1_Sub1Array1.length) {
						local300 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anInt850];
						if (local300 != null) {
							local74 = local300.anInt776 / 32 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32;
							local18 = local300.anInt777 / 32 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
							this.method669(this.aClass1_Sub2_Sub1_Sub2_8, local18, local74);
						}
					}
				}
				if (this.anInt989 != 0) {
					local74 = this.anInt989 * 4 + 2 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776 / 32;
					local18 = this.anInt990 * 4 + 2 - aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777 / 32;
					this.method713(local74, this.aClass1_Sub2_Sub1_Sub2_7, local18);
				}
				Class1_Sub2_Sub1.method535(16777215, 97, 78, 3, 3);
				this.aClass26_5.method279();
				Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
			}
		} catch (@Pc(609) RuntimeException local609) {
			signlink.reporterror("46891, " + 51 + ", " + local609.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method709(@OriginalArg(0) int arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt929);
			if (this.aClass22_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass22_Sub1_1.anInt642);
			}
			System.out.println("loop-cycle:" + anInt1045);
			@Pc(39) boolean local39 = false;
			System.out.println("draw-cycle:" + anInt835);
			System.out.println("ptype:" + this.anInt951);
			System.out.println("psize:" + this.anInt950);
			if (this.aClass45_1 != null) {
				this.aClass45_1.method505(969);
			}
			super.aBoolean182 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("60610, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method586(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("97171, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method710(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(17) int local17 = this.anIntArray242[arg0];
				@Pc(22) int local22 = this.anIntArray243[arg0];
				@Pc(27) int local27 = this.anIntArray244[arg0];
				@Pc(32) int local32 = this.anIntArray245[arg0];
				if (local27 >= 2000) {
					local27 -= 2000;
				}
				if (this.anInt861 != 0 && local27 != 1086) {
					this.anInt861 = 0;
					this.aBoolean209 = true;
				}
				@Pc(56) String local56;
				@Pc(60) int local60;
				@Pc(71) long local71;
				@Pc(73) int local73;
				if (local27 == 503) {
					local56 = this.aStringArray8[arg0];
					local60 = local56.indexOf("@whi@");
					if (local60 != -1) {
						local71 = Class40.method413(local56.substring(local60 + 5).trim());
						local73 = -1;
						for (@Pc(75) int local75 = 0; local75 < this.anInt875; local75++) {
							if (this.aLongArray3[local75] == local71) {
								local73 = local75;
								break;
							}
						}
						if (local73 != -1 && this.anIntArray258[local73] > 0) {
							this.aBoolean209 = true;
							this.anInt861 = 0;
							this.aBoolean233 = true;
							this.aString30 = "";
							this.anInt927 = 3;
							this.aLong29 = this.aLongArray3[local73];
							this.aString27 = "Enter message to send to " + this.aStringArray9[local73];
						}
					}
				}
				if (local27 == 230 && this.method714(local22, local32, local17)) {
					this.aClass1_Sub2_Sub3_9.method296(29, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method331(this.anInt940);
					this.aClass1_Sub2_Sub3_9.method298(local22 + this.anInt959);
					this.aClass1_Sub2_Sub3_9.method331(local32 >> 14 & 0x7FFF);
					this.aClass1_Sub2_Sub3_9.method333(this.anInt942);
					this.aClass1_Sub2_Sub3_9.method331(local17 + this.anInt958);
					this.aClass1_Sub2_Sub3_9.method298(this.anInt941);
				}
				@Pc(197) Class38 local197;
				@Pc(206) String local206;
				if (local27 == 1253) {
					local197 = Class38.method409(local32);
					if (local197.aByteArray13 == null) {
						local206 = "It's a " + local197.aString14 + ".";
					} else {
						local206 = new String(local197.aByteArray13);
					}
					this.method683(local206, 0, "");
				}
				@Pc(233) Class1_Sub2_Sub2_Sub1_Sub2 local233;
				if (local27 == 85) {
					local233 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local32];
					if (local233 != null) {
						this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local233.anIntArray204[0], 0, 2, local233.anIntArray205[0], 0, 0, false);
						this.anInt892 = super.anInt821;
						this.anInt893 = super.anInt822;
						this.anInt895 = 2;
						this.anInt894 = 0;
						this.aClass1_Sub2_Sub3_9.method296(6, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method298(this.anInt978);
						this.aClass1_Sub2_Sub3_9.method333(local32);
					}
				}
				@Pc(316) boolean local316;
				if (local27 == 42) {
					local316 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
					if (!local316) {
						this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
					}
					this.anInt892 = super.anInt821;
					this.anInt893 = super.anInt822;
					this.anInt895 = 2;
					this.anInt894 = 0;
					anInt1005 += local22;
					if (anInt1005 >= 120) {
						this.aClass1_Sub2_Sub3_9.method296(83, this.anInt1018);
						anInt1005 = 0;
					}
					this.aClass1_Sub2_Sub3_9.method296(125, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method332(local17 + this.anInt958);
					this.aClass1_Sub2_Sub3_9.method331(local32);
					this.aClass1_Sub2_Sub3_9.method333(local22 + this.anInt959);
				}
				if (local27 == 271) {
					local316 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
					if (!local316) {
						this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
					}
					this.anInt892 = super.anInt821;
					this.anInt893 = super.anInt822;
					this.anInt895 = 2;
					this.anInt894 = 0;
					this.aClass1_Sub2_Sub3_9.method296(134, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method298(local32);
					this.aClass1_Sub2_Sub3_9.method332(this.anInt940);
					this.aClass1_Sub2_Sub3_9.method333(local17 + this.anInt958);
					this.aClass1_Sub2_Sub3_9.method332(this.anInt941);
					this.aClass1_Sub2_Sub3_9.method331(this.anInt942);
					this.aClass1_Sub2_Sub3_9.method298(local22 + this.anInt959);
				}
				@Pc(507) Class1_Sub2_Sub2_Sub1_Sub1 local507;
				if (local27 == 217) {
					local507 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local32];
					if (local507 != null) {
						this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local507.anIntArray204[0], 0, 2, local507.anIntArray205[0], 0, 0, false);
						this.anInt892 = super.anInt821;
						this.anInt893 = super.anInt822;
						this.anInt895 = 2;
						this.anInt894 = 0;
						anInt906 += local32;
						if (anInt906 >= 143) {
							this.aClass1_Sub2_Sub3_9.method296(1, this.anInt1018);
							anInt906 = 0;
						}
						this.aClass1_Sub2_Sub3_9.method296(234, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method331(local32);
					}
				}
				@Pc(582) Class18 local582;
				if (local27 == 781) {
					local582 = Class18.method187(local22);
					@Pc(584) boolean local584 = true;
					if (local582.anInt343 > 0) {
						local584 = this.method610(local582);
					}
					if (local584) {
						this.aClass1_Sub2_Sub3_9.method296(252, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method298(local22);
					}
				}
				if (local27 == 257) {
					this.aClass1_Sub2_Sub3_9.method296(155, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method332(local17);
					this.aClass1_Sub2_Sub3_9.method333(local22);
					this.aClass1_Sub2_Sub3_9.method298(local32);
					this.anInt1024 = 0;
					this.anInt1025 = local22;
					this.anInt1026 = local17;
					this.anInt1027 = 2;
					if (Class18.method187(local22).anInt356 == this.anInt1056) {
						this.anInt1027 = 1;
					}
					if (Class18.method187(local22).anInt356 == this.anInt956) {
						this.anInt1027 = 3;
					}
				}
				if (local27 == 198 && !this.aBoolean229) {
					this.aClass1_Sub2_Sub3_9.method296(154, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method298(local22);
					this.aBoolean229 = true;
				}
				if (local27 == 734) {
					this.aClass1_Sub2_Sub3_9.method296(128, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method331(local17);
					this.aClass1_Sub2_Sub3_9.method298(local22);
					this.aClass1_Sub2_Sub3_9.method331(local32);
					this.anInt1024 = 0;
					this.anInt1025 = local22;
					this.anInt1026 = local17;
					this.anInt1027 = 2;
					if (Class18.method187(local22).anInt356 == this.anInt1056) {
						this.anInt1027 = 1;
					}
					if (Class18.method187(local22).anInt356 == this.anInt956) {
						this.anInt1027 = 3;
					}
				}
				if (local27 == 204) {
					this.method714(local22, local32, local17);
					this.aClass1_Sub2_Sub3_9.method296(62, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method298(local32 >> 14 & 0x7FFF);
					this.aClass1_Sub2_Sub3_9.method333(local17 + this.anInt958);
					this.aClass1_Sub2_Sub3_9.method298(local22 + this.anInt959);
				}
				if (local27 == 642) {
					local233 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local32];
					if (local233 != null) {
						this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local233.anIntArray204[0], 0, 2, local233.anIntArray205[0], 0, 0, false);
						this.anInt892 = super.anInt821;
						this.anInt893 = super.anInt822;
						this.anInt895 = 2;
						this.anInt894 = 0;
						anInt916 += local32;
						if (anInt916 >= 149) {
							this.aClass1_Sub2_Sub3_9.method296(89, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method301(0);
							anInt916 = 0;
						}
						this.aClass1_Sub2_Sub3_9.method296(162, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method333(local32);
					}
				}
				@Pc(881) String local881;
				if (local27 == 386 || local27 == 679) {
					local56 = this.aStringArray8[arg0];
					local60 = local56.indexOf("@whi@");
					if (local60 != -1) {
						local56 = local56.substring(local60 + 5).trim();
						local881 = Class40.method417(Class40.method414(Class40.method413(local56)));
						@Pc(883) boolean local883 = false;
						for (local73 = 0; local73 < this.anInt923; local73++) {
							@Pc(895) Class1_Sub2_Sub2_Sub1_Sub1 local895 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[this.anIntArray247[local73]];
							if (local895 != null && local895.aString3 != null && local895.aString3.equalsIgnoreCase(local881)) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local895.anIntArray204[0], 0, 2, local895.anIntArray205[0], 0, 0, false);
								if (local27 == 386) {
									this.aClass1_Sub2_Sub3_9.method296(119, this.anInt1018);
									this.aClass1_Sub2_Sub3_9.method333(this.anIntArray247[local73]);
								}
								if (local27 == 679) {
									this.aClass1_Sub2_Sub3_9.method296(151, this.anInt1018);
									this.aClass1_Sub2_Sub3_9.method332(this.anIntArray247[local73]);
								}
								local883 = true;
								break;
							}
						}
						if (!local883) {
							this.method683("Unable to find " + local881, 0, "");
						}
					}
				}
				if (local27 == 641) {
					anInt873 += local17;
					if (anInt873 >= 118) {
						this.aClass1_Sub2_Sub3_9.method296(90, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method297(4);
						anInt873 = 0;
					}
					this.method714(local22, local32, local17);
					this.aClass1_Sub2_Sub3_9.method296(194, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method298(local22 + this.anInt959);
					this.aClass1_Sub2_Sub3_9.method332(local32 >> 14 & 0x7FFF);
					this.aClass1_Sub2_Sub3_9.method333(local17 + this.anInt958);
				}
				if (local27 == 783) {
					local507 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local32];
					if (local507 != null) {
						this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local507.anIntArray204[0], 0, 2, local507.anIntArray205[0], 0, 0, false);
						this.anInt892 = super.anInt821;
						this.anInt893 = super.anInt822;
						this.anInt895 = 2;
						this.anInt894 = 0;
						this.aClass1_Sub2_Sub3_9.method296(120, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method332(this.anInt941);
						this.aClass1_Sub2_Sub3_9.method298(this.anInt940);
						this.aClass1_Sub2_Sub3_9.method331(local32);
						this.aClass1_Sub2_Sub3_9.method333(this.anInt942);
					}
				}
				if (local27 == 108) {
					this.anInt939 = 1;
					this.anInt940 = local17;
					this.anInt941 = local22;
					this.anInt942 = local32;
					this.aString22 = String.valueOf(Class38.method409(local32).aString14);
					this.anInt977 = 0;
					this.aBoolean202 = true;
				} else {
					if (local27 == 858) {
						this.aClass1_Sub2_Sub3_9.method296(8, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method298(this.anInt940);
						this.aClass1_Sub2_Sub3_9.method298(local22);
						this.aClass1_Sub2_Sub3_9.method332(this.anInt942);
						this.aClass1_Sub2_Sub3_9.method331(local17);
						this.aClass1_Sub2_Sub3_9.method298(this.anInt941);
						this.aClass1_Sub2_Sub3_9.method332(local32);
						this.anInt1024 = 0;
						this.anInt1025 = local22;
						this.anInt1026 = local17;
						this.anInt1027 = 2;
						if (Class18.method187(local22).anInt356 == this.anInt1056) {
							this.anInt1027 = 1;
						}
						if (Class18.method187(local22).anInt356 == this.anInt956) {
							this.anInt1027 = 3;
						}
					}
					if (local27 == 540) {
						local233 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local32];
						if (local233 != null) {
							this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local233.anIntArray204[0], 0, 2, local233.anIntArray205[0], 0, 0, false);
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							this.aClass1_Sub2_Sub3_9.method296(65, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method298(this.anInt940);
							this.aClass1_Sub2_Sub3_9.method331(local32);
							this.aClass1_Sub2_Sub3_9.method331(this.anInt942);
							this.aClass1_Sub2_Sub3_9.method298(this.anInt941);
						}
					}
					if (local27 == 252) {
						this.method614();
					}
					if (local27 == 181) {
						if ((local22 & 0x3) == 0) {
							anInt995++;
						}
						if (anInt995 >= 80) {
							this.aClass1_Sub2_Sub3_9.method296(143, this.anInt1018);
							anInt995 = 0;
						}
						this.method714(local22, local32, local17);
						this.aClass1_Sub2_Sub3_9.method296(61, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method298(local22 + this.anInt959);
						this.aClass1_Sub2_Sub3_9.method331(local32 >> 14 & 0x7FFF);
						this.aClass1_Sub2_Sub3_9.method332(local17 + this.anInt958);
					}
					if (local27 == 172) {
						local316 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
						if (!local316) {
							this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
						}
						this.anInt892 = super.anInt821;
						this.anInt893 = super.anInt822;
						this.anInt895 = 2;
						this.anInt894 = 0;
						this.aClass1_Sub2_Sub3_9.method296(103, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method331(local22 + this.anInt959);
						this.aClass1_Sub2_Sub3_9.method332(local32);
						this.aClass1_Sub2_Sub3_9.method298(local17 + this.anInt958);
					}
					if (local27 == 1927) {
						@Pc(1463) int local1463 = local32 >> 14 & 0x7FFF;
						@Pc(1466) Class27 local1466 = Class27.method282(local1463);
						if (local1466.aByteArray9 == null) {
							local881 = "It's a " + local1466.aString11 + ".";
						} else {
							local881 = new String(local1466.aByteArray9);
						}
						this.method683(local881, 0, "");
					}
					if (local27 == 957) {
						if (this.aBoolean218) {
							this.aClass16_1.method165(local17 - 4, (byte) 7, local22 - 4);
						} else {
							this.aClass16_1.method165(super.anInt821 - 4, (byte) 7, super.anInt822 - 4);
						}
					}
					if (local27 == 720) {
						this.method612(this.anInt1020);
						this.anInt1020 = -1;
						this.aBoolean209 = true;
					}
					if (local27 == 1129) {
						this.method714(local22, local32, local17);
						this.aClass1_Sub2_Sub3_9.method296(85, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method331(local17 + this.anInt958);
						this.aClass1_Sub2_Sub3_9.method333(local22 + this.anInt959);
						this.aClass1_Sub2_Sub3_9.method332(local32 >> 14 & 0x7FFF);
					}
					if (local27 == 148) {
						local233 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local32];
						if (local233 != null) {
							this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local233.anIntArray204[0], 0, 2, local233.anIntArray205[0], 0, 0, false);
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							this.aClass1_Sub2_Sub3_9.method296(255, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method331(local32);
						}
					}
					if (local27 == 197) {
						local507 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local32];
						if (local507 != null) {
							this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local507.anIntArray204[0], 0, 2, local507.anIntArray205[0], 0, 0, false);
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							this.aClass1_Sub2_Sub3_9.method296(151, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method332(local32);
						}
					}
					if (local27 == 974) {
						this.aClass1_Sub2_Sub3_9.method296(192, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method331(local32);
						this.aClass1_Sub2_Sub3_9.method332(local17);
						this.aClass1_Sub2_Sub3_9.method332(local22);
						this.anInt1024 = 0;
						this.anInt1025 = local22;
						this.anInt1026 = local17;
						this.anInt1027 = 2;
						if (Class18.method187(local22).anInt356 == this.anInt1056) {
							this.anInt1027 = 1;
						}
						if (Class18.method187(local22).anInt356 == this.anInt956) {
							this.anInt1027 = 3;
						}
					}
					if (local27 == 989) {
						local56 = this.aStringArray8[arg0];
						local60 = local56.indexOf("@whi@");
						if (local60 != -1) {
							if (this.anInt1056 == -1) {
								this.method614();
								this.aString31 = local56.substring(local60 + 5).trim();
								this.aBoolean216 = false;
								this.anInt943 = this.anInt1056 = Class18.anInt346;
							} else {
								this.method683("Please close the interface you have open before using 'report abuse'", 0, "");
							}
						}
					}
					if (local27 == 309) {
						local507 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local32];
						if (local507 != null) {
							this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local507.anIntArray204[0], 0, 2, local507.anIntArray205[0], 0, 0, false);
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							this.aClass1_Sub2_Sub3_9.method296(132, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method331(local32);
						}
					}
					if (local27 == 462) {
						local233 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local32];
						if (local233 != null) {
							this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local233.anIntArray204[0], 0, 2, local233.anIntArray205[0], 0, 0, false);
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							this.aClass1_Sub2_Sub3_9.method296(22, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method331(local32);
						}
					}
					if (local27 == 758) {
						local582 = Class18.method187(local22);
						this.anInt977 = 1;
						this.anInt978 = local22;
						this.anInt979 = local582.anInt347;
						this.anInt939 = 0;
						this.aBoolean202 = true;
						local206 = local582.aString10;
						if (local206.indexOf(" ") != -1) {
							local206 = local206.substring(0, local206.indexOf(" "));
						}
						local881 = local582.aString10;
						if (local881.indexOf(" ") != -1) {
							local881 = local881.substring(local881.indexOf(" ") + 1);
						}
						this.aString23 = local206 + " " + local582.aString9 + " " + local881;
						if (this.anInt979 == 16) {
							this.aBoolean202 = true;
							this.anInt913 = 3;
							this.aBoolean185 = true;
						}
					} else {
						if (local27 == 627) {
							this.aClass1_Sub2_Sub3_9.method296(222, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method332(local32);
							this.aClass1_Sub2_Sub3_9.method298(local17);
							this.aClass1_Sub2_Sub3_9.method298(local22);
							this.anInt1024 = 0;
							this.anInt1025 = local22;
							this.anInt1026 = local17;
							this.anInt1027 = 2;
							if (Class18.method187(local22).anInt356 == this.anInt1056) {
								this.anInt1027 = 1;
							}
							if (Class18.method187(local22).anInt356 == this.anInt956) {
								this.anInt1027 = 3;
							}
						}
						if (local27 == 304) {
							this.aClass1_Sub2_Sub3_9.method296(204, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method333(local22);
							this.aClass1_Sub2_Sub3_9.method333(local32);
							this.aClass1_Sub2_Sub3_9.method298(local17);
							this.anInt1024 = 0;
							this.anInt1025 = local22;
							this.anInt1026 = local17;
							this.anInt1027 = 2;
							if (Class18.method187(local22).anInt356 == this.anInt1056) {
								this.anInt1027 = 1;
							}
							if (Class18.method187(local22).anInt356 == this.anInt956) {
								this.anInt1027 = 3;
							}
						}
						if (local27 == 459) {
							anInt867 += local17;
							if (anInt867 >= 85) {
								this.aClass1_Sub2_Sub3_9.method296(247, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method301(0);
								anInt867 = 0;
							}
							this.aClass1_Sub2_Sub3_9.method296(16, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method333(local32);
							this.aClass1_Sub2_Sub3_9.method333(local22);
							this.aClass1_Sub2_Sub3_9.method333(local17);
							this.anInt1024 = 0;
							this.anInt1025 = local22;
							this.anInt1026 = local17;
							this.anInt1027 = 2;
							if (Class18.method187(local22).anInt356 == this.anInt1056) {
								this.anInt1027 = 1;
							}
							if (Class18.method187(local22).anInt356 == this.anInt956) {
								this.anInt1027 = 3;
							}
						}
						if (local27 == 602) {
							local316 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
							if (!local316) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
							}
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							this.aClass1_Sub2_Sub3_9.method296(78, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method298(local32);
							this.aClass1_Sub2_Sub3_9.method331(this.anInt978);
							this.aClass1_Sub2_Sub3_9.method298(local17 + this.anInt958);
							this.aClass1_Sub2_Sub3_9.method331(local22 + this.anInt959);
						}
						if (local27 == 493) {
							local316 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
							if (!local316) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
							}
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							this.aClass1_Sub2_Sub3_9.method296(42, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method331(local22 + this.anInt959);
							this.aClass1_Sub2_Sub3_9.method332(local17 + this.anInt958);
							this.aClass1_Sub2_Sub3_9.method332(local32);
						}
						if (local27 == 1194) {
							local197 = Class38.method409(local32);
							@Pc(2379) Class18 local2379 = Class18.method187(local22);
							if (local2379 != null && local2379.anIntArray55[local17] >= 100000) {
								local206 = local2379.anIntArray55[local17] + " x " + local197.aString14;
							} else if (local197.aByteArray13 == null) {
								local206 = "It's a " + local197.aString14 + ".";
							} else {
								local206 = new String(local197.aByteArray13);
							}
							this.method683(local206, 0, "");
						}
						if (local27 == 929) {
							this.method714(local22, local32, local17);
							this.aClass1_Sub2_Sub3_9.method296(112, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method332(local22 + this.anInt959);
							this.aClass1_Sub2_Sub3_9.method298(local17 + this.anInt958);
							this.aClass1_Sub2_Sub3_9.method332(local32 >> 14 & 0x7FFF);
						}
						if (local27 == 370 && this.method714(local22, local32, local17)) {
							this.aClass1_Sub2_Sub3_9.method296(146, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method333(this.anInt978);
							this.aClass1_Sub2_Sub3_9.method298(local22 + this.anInt959);
							this.aClass1_Sub2_Sub3_9.method333(local17 + this.anInt958);
							this.aClass1_Sub2_Sub3_9.method298(local32 >> 14 & 0x7FFF);
						}
						if (local27 == 848) {
							local233 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local32];
							if (local233 != null) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local233.anIntArray204[0], 0, 2, local233.anIntArray205[0], 0, 0, false);
								this.anInt892 = super.anInt821;
								this.anInt893 = super.anInt822;
								this.anInt895 = 2;
								this.anInt894 = 0;
								this.aClass1_Sub2_Sub3_9.method296(239, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method331(local32);
							}
						}
						if (local27 == 524) {
							this.aClass1_Sub2_Sub3_9.method296(174, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method298(local32);
							this.aClass1_Sub2_Sub3_9.method331(local17);
							this.aClass1_Sub2_Sub3_9.method331(local22);
							this.anInt1024 = 0;
							this.anInt1025 = local22;
							this.anInt1026 = local17;
							this.anInt1027 = 2;
							if (Class18.method187(local22).anInt356 == this.anInt1056) {
								this.anInt1027 = 1;
							}
							if (Class18.method187(local22).anInt356 == this.anInt956) {
								this.anInt1027 = 3;
							}
						}
						if (local27 == 380) {
							this.aClass1_Sub2_Sub3_9.method296(30, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method333(local17);
							this.aClass1_Sub2_Sub3_9.method331(local32);
							this.aClass1_Sub2_Sub3_9.method332(local22);
							this.anInt1024 = 0;
							this.anInt1025 = local22;
							this.anInt1026 = local17;
							this.anInt1027 = 2;
							if (Class18.method187(local22).anInt356 == this.anInt1056) {
								this.anInt1027 = 1;
							}
							if (Class18.method187(local22).anInt356 == this.anInt956) {
								this.anInt1027 = 3;
							}
						}
						if (local27 == 392) {
							this.aClass1_Sub2_Sub3_9.method296(252, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method298(local22);
							local582 = Class18.method187(local22);
							if (local582.anIntArrayArray9 != null && local582.anIntArrayArray9[0][0] == 5) {
								local60 = local582.anIntArrayArray9[0][1];
								this.anIntArray268[local60] = 1 - this.anIntArray268[local60];
								this.method699(local60);
								this.aBoolean202 = true;
							}
						}
						if (local27 == 569) {
							this.aClass1_Sub2_Sub3_9.method296(252, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method298(local22);
							local582 = Class18.method187(local22);
							if (local582.anIntArrayArray9 != null && local582.anIntArrayArray9[0][0] == 5) {
								local60 = local582.anIntArrayArray9[0][1];
								if (this.anIntArray268[local60] != local582.anIntArray52[0]) {
									this.anIntArray268[local60] = local582.anIntArray52[0];
									this.method699(local60);
									this.aBoolean202 = true;
								}
							}
						}
						if (local27 == 1657) {
							local233 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local32];
							if (local233 != null) {
								@Pc(2808) Class34 local2808 = local233.aClass34_2;
								if (local2808.anIntArray122 != null) {
									local2808 = local2808.method357();
								}
								if (local2808 != null) {
									if (local2808.aByteArray12 == null) {
										local881 = "It's a " + local2808.aString13 + ".";
									} else {
										local881 = new String(local2808.aByteArray12);
									}
									this.method683(local881, 0, "");
								}
							}
						}
						if (local27 == 518) {
							this.aClass1_Sub2_Sub3_9.method296(136, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method332(local22);
							this.aClass1_Sub2_Sub3_9.method332(local17);
							this.aClass1_Sub2_Sub3_9.method298(local32);
							this.anInt1024 = 0;
							this.anInt1025 = local22;
							this.anInt1026 = local17;
							this.anInt1027 = 2;
							if (Class18.method187(local22).anInt356 == this.anInt1056) {
								this.anInt1027 = 1;
							}
							if (Class18.method187(local22).anInt356 == this.anInt956) {
								this.anInt1027 = 3;
							}
						}
						if (local27 == 2) {
							local507 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local32];
							if (local507 != null) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local507.anIntArray204[0], 0, 2, local507.anIntArray205[0], 0, 0, false);
								this.anInt892 = super.anInt821;
								this.anInt893 = super.anInt822;
								this.anInt895 = 2;
								this.anInt894 = 0;
								anInt908 += local32;
								if (anInt908 >= 141) {
									this.aClass1_Sub2_Sub3_9.method296(152, this.anInt1018);
									this.aClass1_Sub2_Sub3_9.method300(9316824);
									anInt908 = 0;
								}
								this.aClass1_Sub2_Sub3_9.method296(184, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method332(local32);
							}
						}
						if (local27 == 418) {
							local233 = this.aClass1_Sub2_Sub2_Sub1_Sub2Array1[local32];
							if (local233 != null) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local233.anIntArray204[0], 0, 2, local233.anIntArray205[0], 0, 0, false);
								this.anInt892 = super.anInt821;
								this.anInt893 = super.anInt822;
								this.anInt895 = 2;
								this.anInt894 = 0;
								this.aClass1_Sub2_Sub3_9.method296(44, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method298(local32);
							}
						}
						if (local27 == 308) {
							this.aClass1_Sub2_Sub3_9.method296(173, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method333(this.anInt978);
							this.aClass1_Sub2_Sub3_9.method298(local32);
							this.aClass1_Sub2_Sub3_9.method332(local17);
							this.aClass1_Sub2_Sub3_9.method332(local22);
							this.anInt1024 = 0;
							this.anInt1025 = local22;
							this.anInt1026 = local17;
							this.anInt1027 = 2;
							if (Class18.method187(local22).anInt356 == this.anInt1056) {
								this.anInt1027 = 1;
							}
							if (Class18.method187(local22).anInt356 == this.anInt956) {
								this.anInt1027 = 3;
							}
						}
						if (local27 == 852) {
							local316 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
							if (!local316) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
							}
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							anInt1002++;
							if (anInt1002 >= 112) {
								this.aClass1_Sub2_Sub3_9.method296(74, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method301(0);
								anInt1002 = 0;
							}
							this.aClass1_Sub2_Sub3_9.method296(23, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method331(local32);
							this.aClass1_Sub2_Sub3_9.method333(local22 + this.anInt959);
							this.aClass1_Sub2_Sub3_9.method331(local17 + this.anInt958);
						}
						if (local27 == 471) {
							local507 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local32];
							if (local507 != null) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local507.anIntArray204[0], 0, 2, local507.anIntArray205[0], 0, 0, false);
								this.anInt892 = super.anInt821;
								this.anInt893 = super.anInt822;
								this.anInt895 = 2;
								this.anInt894 = 0;
								this.aClass1_Sub2_Sub3_9.method296(119, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method333(local32);
							}
						}
						if (local27 == 9 || local27 == 405 || local27 == 953 || local27 == 305) {
							local56 = this.aStringArray8[arg0];
							local60 = local56.indexOf("@whi@");
							if (local60 != -1) {
								local71 = Class40.method413(local56.substring(local60 + 5).trim());
								if (local27 == 9) {
									this.method638(local71);
								}
								if (local27 == 405) {
									this.method640(local71);
								}
								if (local27 == 953) {
									this.method637(this.anInt1023, local71);
								}
								if (local27 == 305) {
									this.method658(local71);
								}
							}
						}
						if (local27 == 239) {
							this.aClass1_Sub2_Sub3_9.method296(215, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method331(local32);
							this.aClass1_Sub2_Sub3_9.method331(local22);
							this.aClass1_Sub2_Sub3_9.method331(local17);
							this.anInt1024 = 0;
							this.anInt1025 = local22;
							this.anInt1026 = local17;
							this.anInt1027 = 2;
							if (Class18.method187(local22).anInt356 == this.anInt1056) {
								this.anInt1027 = 1;
							}
							if (Class18.method187(local22).anInt356 == this.anInt956) {
								this.anInt1027 = 3;
							}
						}
						if (local27 == 359) {
							local507 = this.aClass1_Sub2_Sub2_Sub1_Sub1Array1[local32];
							if (local507 != null) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local507.anIntArray204[0], 0, 2, local507.anIntArray205[0], 0, 0, false);
								this.anInt892 = super.anInt821;
								this.anInt893 = super.anInt822;
								this.anInt895 = 2;
								this.anInt894 = 0;
								this.aClass1_Sub2_Sub3_9.method296(228, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method298(this.anInt978);
								this.aClass1_Sub2_Sub3_9.method332(local32);
							}
						}
						if (local27 == 895) {
							local316 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
							if (!local316) {
								this.method674(1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 1, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local17, 0, 2, local22, 0, 0, false);
							}
							this.anInt892 = super.anInt821;
							this.anInt893 = super.anInt822;
							this.anInt895 = 2;
							this.anInt894 = 0;
							anInt1003 += this.anInt959;
							if (anInt1003 >= 124) {
								this.aClass1_Sub2_Sub3_9.method296(212, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method297(253);
								anInt1003 = 0;
							}
							this.aClass1_Sub2_Sub3_9.method296(59, this.anInt1018);
							this.aClass1_Sub2_Sub3_9.method298(local17 + this.anInt958);
							this.aClass1_Sub2_Sub3_9.method298(local32);
							this.aClass1_Sub2_Sub3_9.method333(local22 + this.anInt959);
						}
						this.anInt939 = 0;
						this.anInt977 = 0;
						this.aBoolean202 = true;
					}
				}
			}
		} catch (@Pc(3567) RuntimeException local3567) {
			signlink.reporterror("45067, " + arg0 + ", " + false + ", " + local3567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method711(@OriginalArg(0) int arg0) {
		try {
			this.anInt928++;
			this.method616(this.aByte42, true);
			this.method621(true);
			this.method616(this.aByte42, false);
			this.method621(false);
			this.method650();
			this.method692(this.aByte45);
			@Pc(36) boolean local36 = false;
			@Pc(42) int local42;
			@Pc(81) int local81;
			if (!this.aBoolean190) {
				local42 = this.anInt1030;
				if (this.anInt933 / 256 > local42) {
					local42 = this.anInt933 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray276[4] + 128 > local42) {
					local42 = this.anIntArray276[4] + 128;
				}
				local81 = this.anInt1031 + this.anInt1028 & 0x7FF;
				this.method613(this.method715(aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt777, aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt776, this.anInt1001) - 50, local42, local81, this.anInt837, local42 * 3 + 600, this.anInt838);
			}
			if (this.aBoolean190) {
				local42 = this.method661();
			} else {
				local42 = this.method660();
			}
			local81 = this.anInt1011;
			@Pc(125) int local125 = this.anInt1012;
			@Pc(128) int local128 = this.anInt1013;
			@Pc(131) int local131 = this.anInt1014;
			@Pc(134) int local134 = this.anInt1015;
			@Pc(183) int local183;
			for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
				if (this.aBooleanArray12[local136]) {
					local183 = (int) (Math.random() * (double) (this.anIntArray213[local136] * 2 + 1) - (double) this.anIntArray213[local136] + Math.sin((double) this.anIntArray232[local136] * ((double) this.anIntArray222[local136] / 100.0D)) * (double) this.anIntArray276[local136]);
					if (local136 == 0) {
						this.anInt1011 += local183;
					}
					if (local136 == 1) {
						this.anInt1012 += local183;
					}
					if (local136 == 2) {
						this.anInt1013 += local183;
					}
					if (local136 == 3) {
						this.anInt1015 = this.anInt1015 + local183 & 0x7FF;
					}
					if (local136 == 4) {
						this.anInt1014 += local183;
						if (this.anInt1014 < 128) {
							this.anInt1014 = 128;
						}
						if (this.anInt1014 > 383) {
							this.anInt1014 = 383;
						}
					}
				}
			}
			local183 = Class1_Sub2_Sub1_Sub3.anInt632;
			Class1_Sub2_Sub2_Sub3.aBoolean70 = true;
			Class1_Sub2_Sub2_Sub3.anInt384 = 0;
			Class1_Sub2_Sub2_Sub3.anInt382 = super.anInt815 - 4;
			Class1_Sub2_Sub2_Sub3.anInt383 = super.anInt816 - 4;
			Class1_Sub2_Sub1.method533();
			this.aClass16_1.method166(this.anInt1012, this.anInt1015, this.anInt1013, this.anInt1011, local42, this.anInt1014);
			this.aClass16_1.method141();
			this.method657();
			this.method628();
			this.method725(local183);
			this.method639();
			this.aClass26_5.method280(super.aGraphics2, 4, 4, (byte) 1);
			this.anInt1011 = local81;
			this.anInt1012 = local125;
			this.anInt1013 = local128;
			this.anInt1014 = local131;
			this.anInt1015 = local134;
		} catch (@Pc(322) RuntimeException local322) {
			signlink.reporterror("93403, " + arg0 + ", " + local322.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method712() {
		try {
			if (this.aClass26_7 == null) {
				super.aClass26_2 = null;
				this.aClass26_6 = null;
				this.aClass26_4 = null;
				this.aClass26_3 = null;
				this.aClass26_5 = null;
				this.aClass26_25 = null;
				this.aClass26_26 = null;
				this.aClass26_27 = null;
				this.aClass26_10 = new Class26(265, 0, 128, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_11 = new Class26(265, 0, 128, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_7 = new Class26(171, 0, 509, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_8 = new Class26(132, 0, 360, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_9 = new Class26(200, 0, 360, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_12 = new Class26(238, 0, 202, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_13 = new Class26(238, 0, 203, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_14 = new Class26(94, 0, 74, this.method586(735));
				Class1_Sub2_Sub1.method533();
				this.aClass26_15 = new Class26(94, 0, 75, this.method586(735));
				Class1_Sub2_Sub1.method533();
				if (this.aClass31_2 != null) {
					this.method673(aBoolean192);
					this.method693();
				}
				this.aBoolean212 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("9153, " + -57 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QEHNWGKD;II)V")
	private void method713(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 != null) {
				@Pc(10) int local10 = this.anInt1031 + this.anInt877 & 0x7FF;
				@Pc(18) int local18 = arg0 * arg0 + arg2 * arg2;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class1_Sub2_Sub2_Sub3.anIntArray96[local10];
					@Pc(30) int local30 = Class1_Sub2_Sub2_Sub3.anIntArray97[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt993 + 256);
					@Pc(56) int local56 = local30 * 256 / (this.anInt993 + 256);
					@Pc(66) int local66 = arg2 * local39 + arg0 * local56 >> 16;
					@Pc(76) int local76 = arg2 * local56 - arg0 * local39 >> 16;
					if (local18 > 2500) {
						arg1.method398(this.aClass1_Sub2_Sub1_Sub1_4, local66 + 94 + 4 - arg1.anInt564 / 2, 83 - local76 - arg1.anInt565 / 2 - 4, this.aBoolean220);
					} else {
						arg1.method392(83 - local76 - arg1.anInt565 / 2 - 4, local66 + 94 - arg1.anInt564 / 2 + 4);
					}
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("70249, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -46517 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)Z")
	private boolean method714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass16_1.method157(this.anInt1001, arg2, arg0, arg1);
			this.aBoolean217 &= true;
			if (local16 == -1) {
				return false;
			}
			@Pc(31) int local31 = local16 & 0x1F;
			@Pc(37) int local37 = local16 >> 6 & 0x3;
			if (local31 == 10 || local31 == 11 || local31 == 22) {
				@Pc(49) Class27 local49 = Class27.method282(local7);
				@Pc(57) int local57;
				@Pc(60) int local60;
				if (local37 == 0 || local37 == 2) {
					local57 = local49.anInt447;
					local60 = local49.anInt450;
				} else {
					local57 = local49.anInt450;
					local60 = local49.anInt447;
				}
				@Pc(71) int local71 = local49.anInt464;
				if (local37 != 0) {
					local71 = (local71 << local37 & 0xF) + (local71 >> 4 - local37);
				}
				this.method674(local57, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], local60, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], arg2, 0, 2, arg0, local71, 0, true);
			} else {
				this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], arg2, local37, 2, arg0, 0, local31 + 1, true);
			}
			this.anInt892 = super.anInt821;
			this.anInt893 = super.anInt822;
			this.anInt895 = 2;
			this.anInt894 = 0;
			return true;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("46737, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(25) int local25 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local25 = arg2 + 1;
			}
			@Pc(45) int local45 = arg1 & 0x7F;
			@Pc(49) int local49 = arg0 & 0x7F;
			@Pc(77) int local77 = this.anIntArrayArrayArray8[local25][local3][local7] * (128 - local45) + this.anIntArrayArrayArray8[local25][local3 + 1][local7] * local45 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray8[local25][local3][local7 + 1] * (128 - local45) + this.anIntArrayArrayArray8[local25][local3 + 1][local7 + 1] * local45 >> 7;
			return local77 * (128 - local49) + local109 * local49 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("82540, " + arg0 + ", " + arg1 + ", " + -926 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	private boolean method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class18 local12 = Class18.method187(arg1);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray57.length && local12.anIntArray57[local14] != -1; local14++) {
				@Pc(28) Class18 local28 = Class18.method187(local12.anIntArray57[local14]);
				if (local28.anInt348 == 0) {
					local3 |= this.method716(arg0, local28.anInt340);
				}
				@Pc(62) int local62;
				if (local28.anInt348 == 6 && (local28.anInt338 != -1 || local28.anInt339 != -1)) {
					@Pc(57) boolean local57 = this.method664(local28);
					if (local57) {
						local62 = local28.anInt339;
					} else {
						local62 = local28.anInt338;
					}
					if (local62 != -1) {
						@Pc(74) Class36 local74 = Class36.aClass36Array1[local62];
						local28.anInt330 += arg0;
						while (local28.anInt330 > local74.method371(local28.anInt334)) {
							local28.anInt330 -= local74.method371(local28.anInt334) + 1;
							local28.anInt334++;
							if (local28.anInt334 >= local74.anInt532) {
								local28.anInt334 -= local74.anInt533;
								if (local28.anInt334 < 0 || local28.anInt334 >= local74.anInt532) {
									local28.anInt334 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local28.anInt348 == 6 && local28.anInt327 != 0) {
					@Pc(145) int local145 = local28.anInt327 >> 16;
					local62 = local28.anInt327 << 16 >> 16;
					@Pc(156) int local156 = local145 * arg0;
					local62 *= arg0;
					local28.anInt325 = local28.anInt325 + local156 & 0x7FF;
					local28.anInt326 = local28.anInt326 + local62 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("66022, " + arg0 + ", " + arg1 + ", " + 494 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method717(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean213) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method591(43595);
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

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method719() {
		try {
			if (super.anInt820 == 1) {
				if (super.anInt821 >= 6 && super.anInt821 <= 106 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt869 = (this.anInt869 + 1) % 4;
					this.aBoolean200 = true;
					this.aBoolean209 = true;
					this.aClass1_Sub2_Sub3_9.method296(34, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt869);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt1042);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt852);
				}
				if (super.anInt821 >= 135 && super.anInt821 <= 235 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt1042 = (this.anInt1042 + 1) % 3;
					this.aBoolean200 = true;
					this.aBoolean209 = true;
					this.aClass1_Sub2_Sub3_9.method296(34, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt869);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt1042);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt852);
				}
				if (super.anInt821 >= 273 && super.anInt821 <= 373 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt852 = (this.anInt852 + 1) % 3;
					this.aBoolean200 = true;
					this.aBoolean209 = true;
					this.aClass1_Sub2_Sub3_9.method296(34, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt869);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt1042);
					this.aClass1_Sub2_Sub3_9.method297(this.anInt852);
				}
				if (super.anInt821 >= 412 && super.anInt821 <= 512 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					if (this.anInt1056 == -1) {
						this.method614();
						this.aString31 = "";
						this.aBoolean216 = false;
						this.anInt943 = this.anInt1056 = Class18.anInt346;
						return;
					}
					this.method683("Please close the interface you have open before using 'report abuse'", 0, "");
					return;
				}
			}
		} catch (@Pc(211) RuntimeException local211) {
			signlink.reporterror("204, " + -117 + ", " + local211.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IJOSTBQT;I)V")
	private void method720(@OriginalArg(0) Class18 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt343;
			this.anInt950 += 0;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local66 = this.anInt875;
					if (this.anInt876 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString8 = "";
						arg0.anInt354 = 0;
					} else {
						if (this.anIntArray258[local4] == 0) {
							arg0.aString8 = "@red@Offline";
						} else if (this.anIntArray258[local4] < 200) {
							if (this.anIntArray258[local4] == anInt972) {
								arg0.aString8 = "@gre@World" + (this.anIntArray258[local4] - 9);
							} else {
								arg0.aString8 = "@yel@World" + (this.anIntArray258[local4] - 9);
							}
						} else if (this.anIntArray258[local4] == anInt972) {
							arg0.aString8 = "@gre@Classic" + (this.anIntArray258[local4] - 219);
						} else {
							arg0.aString8 = "@yel@Classic" + (this.anIntArray258[local4] - 219);
						}
						arg0.anInt354 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt875;
					if (this.anInt876 != 2) {
						local66 = 0;
					}
					arg0.anInt336 = local66 * 15 + 20;
					if (arg0.anInt336 <= arg0.anInt349) {
						arg0.anInt336 = arg0.anInt349 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt876 == 0) {
						arg0.aString8 = "Loading ignore list";
						arg0.anInt354 = 0;
					} else if (local4 == 1 && this.anInt876 == 0) {
						arg0.aString8 = "Please wait...";
						arg0.anInt354 = 0;
					} else {
						local66 = this.anInt947;
						if (this.anInt876 == 0) {
							local66 = 0;
						}
						if (local4 >= local66) {
							arg0.aString8 = "";
							arg0.anInt354 = 0;
						} else {
							arg0.aString8 = Class40.method417(Class40.method414(this.aLongArray4[local4]));
							arg0.anInt354 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt336 = this.anInt947 * 15 + 20;
					if (arg0.anInt336 <= arg0.anInt349) {
						arg0.anInt336 = arg0.anInt349 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt325 = 150;
					arg0.anInt326 = (int) (Math.sin((double) anInt1045 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean222) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(379) int local379 = this.anIntArray224[local66];
							if (local379 >= 0 && !Class35.aClass35Array1[local379].method366()) {
								return;
							}
						}
						this.aBoolean222 = false;
						@Pc(398) Class1_Sub2_Sub2_Sub3[] local398 = new Class1_Sub2_Sub2_Sub3[7];
						@Pc(400) int local400 = 0;
						for (@Pc(402) int local402 = 0; local402 < 7; local402++) {
							@Pc(409) int local409 = this.anIntArray224[local402];
							if (local409 >= 0) {
								local398[local400++] = Class35.aClass35Array1[local409].method367();
							}
						}
						@Pc(431) Class1_Sub2_Sub2_Sub3 local431 = new Class1_Sub2_Sub2_Sub3(local400, 473, local398);
						for (@Pc(433) int local433 = 0; local433 < 5; local433++) {
							if (this.anIntArray234[local433] != 0) {
								local431.method210(anIntArrayArray23[local433][0], anIntArrayArray23[local433][this.anIntArray234[local433]]);
								if (local433 == 1) {
									local431.method210(anIntArray239[0], anIntArray239[this.anIntArray234[local433]]);
								}
							}
						}
						local431.method203();
						local431.method204(Class36.aClass36Array1[aClass1_Sub2_Sub2_Sub1_Sub1_1.anInt786].anIntArray131[0]);
						local431.method213(64, 850, -30, -50, -30, true);
						arg0.anInt322 = 5;
						arg0.anInt323 = 0;
						Class18.method181(local431);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub2_Sub1_Sub2_4 == null) {
						this.aClass1_Sub2_Sub1_Sub2_4 = arg0.aClass1_Sub2_Sub1_Sub2_2;
						this.aClass1_Sub2_Sub1_Sub2_5 = arg0.aClass1_Sub2_Sub1_Sub2_1;
					}
					if (this.aBoolean193) {
						arg0.aClass1_Sub2_Sub1_Sub2_2 = this.aClass1_Sub2_Sub1_Sub2_5;
					} else {
						arg0.aClass1_Sub2_Sub1_Sub2_2 = this.aClass1_Sub2_Sub1_Sub2_4;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub2_Sub1_Sub2_4 == null) {
						this.aClass1_Sub2_Sub1_Sub2_4 = arg0.aClass1_Sub2_Sub1_Sub2_2;
						this.aClass1_Sub2_Sub1_Sub2_5 = arg0.aClass1_Sub2_Sub1_Sub2_1;
					}
					if (this.aBoolean193) {
						arg0.aClass1_Sub2_Sub1_Sub2_2 = this.aClass1_Sub2_Sub1_Sub2_4;
					} else {
						arg0.aClass1_Sub2_Sub1_Sub2_2 = this.aClass1_Sub2_Sub1_Sub2_5;
					}
				} else if (local4 == 600) {
					arg0.aString8 = this.aString31;
					if (anInt1045 % 20 < 10) {
						arg0.aString8 = arg0.aString8 + "|";
					} else {
						arg0.aString8 = arg0.aString8 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt856 < 1) {
							arg0.aString8 = "";
						} else if (this.aBoolean216) {
							arg0.anInt350 = 16711680;
							arg0.aString8 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt350 = 16777215;
							arg0.aString8 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(638) String local638;
					if (local4 == 660) {
						local66 = this.anInt1010 - this.anInt1047;
						if (local66 <= 0) {
							local638 = "earlier today";
						} else if (local66 == 1) {
							local638 = "yesterday";
						} else {
							local638 = local66 + " days ago";
						}
						arg0.aString8 = "You last logged in @red@" + local638 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt826 == 0) {
							arg0.aString8 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt826 <= this.anInt1010) {
							arg0.aString8 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method721(this.anInt826);
						} else {
							local66 = this.anInt1010 + 14 - this.anInt826;
							if (local66 <= 0) {
								local638 = "Earlier today";
							} else if (local66 == 1) {
								local638 = "Yesterday";
							} else {
								local638 = local66 + " days ago";
							}
							arg0.aString8 = local638 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method721(this.anInt826) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(756) String local756;
						if (this.anInt834 == 0) {
							local756 = "@yel@0 unread messages";
						} else if (this.anInt834 == 1) {
							local756 = "@gre@1 unread message";
						} else {
							local756 = "@gre@" + this.anInt834 + " unread messages";
						}
						arg0.aString8 = "You have " + local756 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt1021 > 0 && this.anInt1021 <= this.anInt1010 + 10) {
							arg0.aString8 = "Last password change:\\n@gre@" + this.method721(this.anInt1021);
						} else {
							arg0.aString8 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt911 > 2 && !aBoolean214) {
							arg0.aString8 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt911 > 2) {
							arg0.aString8 = "\\n\\nYou have @gre@" + this.anInt911 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt911 > 0) {
							arg0.aString8 = "You have @gre@" + this.anInt911 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString8 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt911 > 2 && !aBoolean214) {
							arg0.aString8 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt911 > 0) {
							arg0.aString8 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString8 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt826 > this.anInt1010) {
							arg0.aString8 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString8 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt876 == 0) {
				arg0.aString8 = "Loading friend list";
				arg0.anInt354 = 0;
			} else if (local4 == 1 && this.anInt876 == 1) {
				arg0.aString8 = "Connecting to friendserver";
				arg0.anInt354 = 0;
			} else if (local4 == 2 && this.anInt876 != 2) {
				arg0.aString8 = "Please wait...";
				arg0.anInt354 = 0;
			} else {
				local66 = this.anInt875;
				if (this.anInt876 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString8 = "";
					arg0.anInt354 = 0;
				} else {
					arg0.aString8 = this.aStringArray9[local4];
					arg0.anInt354 = 1;
				}
			}
		} catch (@Pc(913) RuntimeException local913) {
			signlink.reporterror("87892, " + arg0 + ", " + 0 + ", " + local913.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private String method721(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt1010 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(31) int local31 = local16.get(5);
			@Pc(35) int local35 = local16.get(2);
			@Pc(39) int local39 = local16.get(1);
			@Pc(90) String[] local90 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local31 + "-" + local90[local35] + "-" + local39;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("49426, " + arg0 + ", " + -7282 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method722() {
		try {
			this.aBoolean217 &= true;
			while (true) {
				@Pc(11) Class1_Sub2_Sub4 local11 = this.aClass22_Sub1_1.method471();
				if (local11 == null) {
					return;
				}
				if (local11.anInt665 == 0) {
					Class1_Sub2_Sub2_Sub3.method194(local11.anInt664, local11.aByteArray17);
					if ((this.aClass22_Sub1_1.method462(local11.anInt664) & 0x62) != 0) {
						this.aBoolean202 = true;
						if (this.anInt956 != -1 || this.anInt1020 != -1) {
							this.aBoolean209 = true;
						}
					}
				}
				if (local11.anInt665 == 1 && local11.aByteArray17 != null) {
					Class11.method120(local11.aByteArray17, (byte) 1);
				}
				if (local11.anInt665 == 2 && local11.anInt664 == this.anInt1038 && local11.aByteArray17 != null) {
					this.method630(local11.aByteArray17, this.anInt1052, this.aBoolean228);
				}
				if (local11.anInt665 == 3 && this.anInt937 == 1) {
					for (@Pc(87) int local87 = 0; local87 < this.aByteArrayArray6.length; local87++) {
						if (this.anIntArray265[local87] == local11.anInt664) {
							this.aByteArrayArray6[local87] = local11.aByteArray17;
							if (local11.aByteArray17 == null) {
								this.anIntArray265[local87] = -1;
							}
							break;
						}
						if (this.anIntArray266[local87] == local11.anInt664) {
							this.aByteArrayArray5[local87] = local11.aByteArray17;
							if (local11.aByteArray17 == null) {
								this.anIntArray266[local87] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt665 == 93 && this.aClass22_Sub1_1.method458(local11.anInt664)) {
					Class46.method523(new Class1_Sub2_Sub3(local11.aByteArray17, -670), this.aClass22_Sub1_1);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("78001, " + true + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method723(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt954 > 0) {
				this.method680();
			} else {
				this.method681("Please wait - attempting to reestablish", this.aByte46, "Connection lost");
				this.anInt1046 = 0;
				this.anInt989 = 0;
				@Pc(21) Class45 local21 = this.aClass45_1;
				this.aBoolean217 = false;
				this.anInt828 = 0;
				this.method646(this.aString20, this.aString21, true);
				@Pc(38) boolean local38 = false;
				if (!this.aBoolean217) {
					this.method680();
				}
				try {
					local21.method500();
				} catch (@Pc(48) Exception local48) {
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("47788, " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method724() {
		try {
			if (this.anInt898 > 1) {
				this.anInt898--;
			}
			if (this.anInt954 > 0) {
				this.anInt954--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method700(); local22++) {
			}
			if (this.aBoolean217) {
				@Pc(41) Object local41 = this.aClass32_1.anObject1;
				@Pc(67) int local67;
				@Pc(69) int local69;
				@Pc(71) int local71;
				@Pc(104) int local104;
				synchronized (this.aClass32_1.anObject1) {
					if (!aBoolean219) {
						this.aClass32_1.anInt496 = 0;
					} else if (super.anInt820 != 0 || this.aClass32_1.anInt496 >= 40) {
						this.aClass1_Sub2_Sub3_9.method296(13, this.anInt1018);
						this.aClass1_Sub2_Sub3_9.method297(0);
						local67 = this.aClass1_Sub2_Sub3_9.anInt474;
						local69 = 0;
						@Pc(87) int local87;
						for (local71 = 0; local71 < this.aClass32_1.anInt496 && local67 - this.aClass1_Sub2_Sub3_9.anInt474 < 240; local71++) {
							local69++;
							local87 = this.aClass32_1.anIntArray118[local71];
							if (local87 < 0) {
								local87 = 0;
							} else if (local87 > 502) {
								local87 = 502;
							}
							local104 = this.aClass32_1.anIntArray117[local71];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > 764) {
								local104 = 764;
							}
							@Pc(121) int local121 = local87 * 765 + local104;
							if (this.aClass32_1.anIntArray118[local71] == -1 && this.aClass32_1.anIntArray117[local71] == -1) {
								local104 = -1;
								local87 = -1;
								local121 = 524287;
							}
							if (local104 != this.anInt967 || local87 != this.anInt968) {
								@Pc(166) int local166 = local104 - this.anInt967;
								this.anInt967 = local104;
								@Pc(174) int local174 = local87 - this.anInt968;
								this.anInt968 = local87;
								if (this.anInt955 < 8 && local166 >= -32 && local166 <= 31 && local174 >= -32 && local174 <= 31) {
									local166 += 32;
									local174 += 32;
									this.aClass1_Sub2_Sub3_9.method298((this.anInt955 << 12) + (local166 << 6) + local174);
									this.anInt955 = 0;
								} else if (this.anInt955 < 8) {
									this.aClass1_Sub2_Sub3_9.method300((this.anInt955 << 19) + local121 + 8388608);
									this.anInt955 = 0;
								} else {
									this.aClass1_Sub2_Sub3_9.method301((this.anInt955 << 19) + local121 - 1073741824);
									this.anInt955 = 0;
								}
							} else if (this.anInt955 < 2047) {
								this.anInt955++;
							}
						}
						this.aClass1_Sub2_Sub3_9.method306(this.aClass1_Sub2_Sub3_9.anInt474 - local67);
						if (local69 >= this.aClass32_1.anInt496) {
							this.aClass32_1.anInt496 = 0;
						} else {
							this.aClass32_1.anInt496 -= local69;
							for (local87 = 0; local87 < this.aClass32_1.anInt496; local87++) {
								this.aClass32_1.anIntArray117[local87] = this.aClass32_1.anIntArray117[local87 + local69];
								this.aClass32_1.anIntArray118[local87] = this.aClass32_1.anIntArray118[local87 + local69];
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
					local67 = super.anInt822;
					if (local67 < 0) {
						local67 = 0;
					} else if (local67 > 502) {
						local67 = 502;
					}
					local69 = super.anInt821;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 764) {
						local69 = 764;
					}
					local71 = local67 * 765 + local69;
					@Pc(382) byte local382 = 0;
					if (super.anInt820 == 2) {
						local382 = 1;
					}
					local104 = (int) local336;
					this.aClass1_Sub2_Sub3_9.method296(209, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method341((local104 << 20) + (local382 << 19) + local71);
				}
				if (this.anInt839 > 0) {
					this.anInt839--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean191 = true;
				}
				if (this.aBoolean191 && this.anInt839 <= 0) {
					this.anInt839 = 20;
					this.aBoolean191 = false;
					this.aClass1_Sub2_Sub3_9.method296(107, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method332(this.anInt1030);
					this.aClass1_Sub2_Sub3_9.method332(this.anInt1031);
				}
				if (super.aBoolean184 && !this.aBoolean211) {
					this.aBoolean211 = true;
					this.aClass1_Sub2_Sub3_9.method296(12, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(1);
				}
				if (!super.aBoolean184 && this.aBoolean211) {
					this.aBoolean211 = false;
					this.aClass1_Sub2_Sub3_9.method296(12, this.anInt1018);
					this.aClass1_Sub2_Sub3_9.method297(0);
				}
				this.method599();
				this.method593(this.anInt870);
				this.method595();
				this.anInt952++;
				if (this.anInt952 > 750) {
					this.method723(253);
				}
				this.method632();
				this.method601();
				this.method624();
				this.anInt934++;
				if (this.anInt895 != 0) {
					this.anInt894 += 20;
					if (this.anInt894 >= 400) {
						this.anInt895 = 0;
					}
				}
				if (this.anInt1027 != 0) {
					this.anInt1024++;
					if (this.anInt1024 >= 15) {
						if (this.anInt1027 == 2) {
							this.aBoolean202 = true;
						}
						if (this.anInt1027 == 3) {
							this.aBoolean209 = true;
						}
						this.anInt1027 = 0;
					}
				}
				if (this.anInt998 != 0) {
					this.anInt872++;
					if (super.anInt815 > this.anInt999 + 5 || super.anInt815 < this.anInt999 - 5 || super.anInt816 > this.anInt1000 + 5 || super.anInt816 < this.anInt1000 - 5) {
						this.aBoolean205 = true;
					}
					if (super.anInt814 == 0) {
						if (this.anInt998 == 2) {
							this.aBoolean202 = true;
						}
						if (this.anInt998 == 3) {
							this.aBoolean209 = true;
						}
						this.anInt998 = 0;
						if (this.aBoolean205 && this.anInt872 >= 5) {
							this.anInt963 = -1;
							this.method690((byte) 4);
							if (this.anInt963 == this.anInt996 && this.anInt962 != this.anInt997) {
								@Pc(689) Class18 local689 = Class18.method187(this.anInt996);
								@Pc(691) byte local691 = 0;
								if (this.anInt925 == 1 && local689.anInt343 == 206) {
									local691 = 1;
								}
								if (local689.anIntArray56[this.anInt962] <= 0) {
									local691 = 0;
								}
								if (local689.aBoolean55) {
									local67 = this.anInt997;
									local69 = this.anInt962;
									local689.anIntArray56[local69] = local689.anIntArray56[local67];
									local689.anIntArray55[local69] = local689.anIntArray55[local67];
									local689.anIntArray56[local67] = -1;
									local689.anIntArray55[local67] = 0;
								} else if (local691 == 1) {
									local67 = this.anInt997;
									local69 = this.anInt962;
									while (local67 != local69) {
										if (local67 > local69) {
											local689.method183(local67 - 1, local67);
											local67--;
										} else if (local67 < local69) {
											local689.method183(local67 + 1, local67);
											local67++;
										}
									}
								} else {
									local689.method183(this.anInt962, this.anInt997);
								}
								this.aClass1_Sub2_Sub3_9.method296(216, this.anInt1018);
								this.aClass1_Sub2_Sub3_9.method333(this.anInt997);
								this.aClass1_Sub2_Sub3_9.method298(this.anInt962);
								this.aClass1_Sub2_Sub3_9.method325(local691);
								this.aClass1_Sub2_Sub3_9.method331(this.anInt996);
							}
						} else if ((this.anInt905 == 1 || this.method706(70, this.anInt1041 - 1)) && this.anInt1041 > 2) {
							this.method631();
						} else if (this.anInt1041 > 0) {
							this.method710(this.anInt1041 - 1);
						}
						this.anInt1024 = 10;
						super.anInt820 = 0;
					}
				}
				@Pc(864) int local864;
				@Pc(866) int local866;
				if (Class16.anInt305 != -1) {
					local864 = Class16.anInt305;
					local866 = Class16.anInt306;
					@Pc(887) boolean local887 = this.method674(0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray204[0], 0, aClass1_Sub2_Sub2_Sub1_Sub1_1.anIntArray205[0], local864, 0, 0, local866, 0, 0, true);
					Class16.anInt305 = -1;
					if (local887) {
						this.anInt892 = super.anInt821;
						this.anInt893 = super.anInt822;
						this.anInt895 = 1;
						this.anInt894 = 0;
					}
				}
				if (super.anInt820 == 1 && this.aString19 != null) {
					this.aString19 = null;
					this.aBoolean209 = true;
					super.anInt820 = 0;
				}
				this.method644();
				if (this.anInt1008 == -1) {
					this.method698();
					this.method705();
					this.method719();
				}
				if (super.anInt814 == 1 || super.anInt820 == 1) {
					this.anInt874++;
				}
				if (this.anInt949 == 0 && this.anInt983 == 0 && this.anInt843 == 0) {
					if (this.anInt912 > 0) {
						this.anInt912--;
					}
				} else if (this.anInt912 < 100) {
					this.anInt912++;
					if (this.anInt912 == 100) {
						if (this.anInt949 != 0) {
							this.aBoolean209 = true;
						}
						if (this.anInt983 != 0) {
							this.aBoolean202 = true;
						}
					}
				}
				if (this.anInt937 == 2) {
					this.method678();
				}
				if (this.anInt937 == 2 && this.aBoolean190) {
					this.method609();
				}
				for (local864 = 0; local864 < 5; local864++) {
					@Pc(1033) int local1033 = this.anIntArray232[local864]++;
				}
				this.method701();
				super.anInt813++;
				if (super.anInt813 > 4500) {
					this.anInt954 = 250;
					super.anInt813 -= 500;
					this.aClass1_Sub2_Sub3_9.method296(224, this.anInt1018);
				}
				this.anInt866++;
				if (this.anInt866 > 500) {
					this.anInt866 = 0;
					local866 = (int) (Math.random() * 8.0D);
					if ((local866 & 0x1) == 1) {
						this.anInt841 += this.anInt842;
					}
					if ((local866 & 0x2) == 2) {
						this.anInt1006 += this.anInt1007;
					}
					if ((local866 & 0x4) == 4) {
						this.anInt1028 += this.anInt1029;
					}
				}
				if (this.anInt841 < -50) {
					this.anInt842 = 2;
				}
				if (this.anInt841 > 50) {
					this.anInt842 = -2;
				}
				if (this.anInt1006 < -55) {
					this.anInt1007 = 2;
				}
				if (this.anInt1006 > 55) {
					this.anInt1007 = -2;
				}
				if (this.anInt1028 < -40) {
					this.anInt1029 = 1;
				}
				if (this.anInt1028 > 40) {
					this.anInt1029 = -1;
				}
				this.anInt970++;
				if (this.anInt970 > 500) {
					this.anInt970 = 0;
					local866 = (int) (Math.random() * 8.0D);
					if ((local866 & 0x1) == 1) {
						this.anInt877 += this.anInt878;
					}
					if ((local866 & 0x2) == 2) {
						this.anInt993 += this.anInt994;
					}
				}
				if (this.anInt877 < -60) {
					this.anInt878 = 2;
				}
				if (this.anInt877 > 60) {
					this.anInt878 = -2;
				}
				if (this.anInt993 < -20) {
					this.anInt994 = 1;
				}
				if (this.anInt993 > 10) {
					this.anInt994 = -1;
				}
				this.anInt953++;
				if (this.anInt953 > 50) {
					this.aClass1_Sub2_Sub3_9.method296(71, this.anInt1018);
				}
				try {
					if (this.aClass45_1 != null && this.aClass1_Sub2_Sub3_9.anInt474 > 0) {
						this.aClass45_1.method504(this.aClass1_Sub2_Sub3_9.aByteArray10, this.aClass1_Sub2_Sub3_9.anInt474);
						this.aClass1_Sub2_Sub3_9.anInt474 = 0;
						this.anInt953 = 0;
					}
				} catch (@Pc(1277) IOException local1277) {
					this.method723(253);
				} catch (@Pc(1282) Exception local1282) {
					this.method680();
				}
			}
		} catch (@Pc(1287) RuntimeException local1287) {
			signlink.reporterror("94446, " + 45 + ", " + local1287.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method725(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean215) {
				for (@Pc(11) int local11 = 0; local11 < this.anIntArray263.length; local11++) {
					@Pc(18) int local18 = this.anIntArray263[local11];
					if (Class1_Sub2_Sub1_Sub3.anIntArray149[local18] >= arg0) {
						@Pc(27) Class1_Sub2_Sub1_Sub1 local27 = Class1_Sub2_Sub1_Sub3.aClass1_Sub2_Sub1_Sub1Array1[local18];
						@Pc(35) int local35 = local27.anInt62 * local27.anInt63 - 1;
						@Pc(43) int local43 = local27.anInt62 * this.anInt934 * 2;
						@Pc(46) byte[] local46 = local27.aByteArray1;
						@Pc(49) byte[] local49 = this.aByteArray21;
						for (@Pc(51) int local51 = 0; local51 <= local35; local51++) {
							local49[local51] = local46[local51 - local43 & local35];
						}
						local27.aByteArray1 = local49;
						this.aByteArray21 = local46;
						Class1_Sub2_Sub1_Sub3.method440(local18, 735);
					}
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("2124, " + arg0 + ", " + 126 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(Z)V")
	private void method727() {
		try {
			this.aClass26_6.method279();
			Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray235;
			this.aClass1_Sub2_Sub1_Sub1_5.method51(0, 0);
			if (this.aBoolean233) {
				this.aClass1_Sub2_Sub1_Sub4_4.method543(0, 40, 239, this.aString27);
				this.aClass1_Sub2_Sub1_Sub4_4.method543(128, 60, 239, this.aString30 + "*");
			} else if (this.anInt861 == 1) {
				this.aClass1_Sub2_Sub1_Sub4_4.method543(0, 40, 239, "Enter amount:");
				this.aClass1_Sub2_Sub1_Sub4_4.method543(128, 60, 239, this.aString17 + "*");
			} else if (this.anInt861 == 2) {
				this.aClass1_Sub2_Sub1_Sub4_4.method543(0, 40, 239, "Enter name:");
				this.aClass1_Sub2_Sub1_Sub4_4.method543(128, 60, 239, this.aString17 + "*");
			} else {
				@Pc(131) Class1_Sub2_Sub1_Sub4 local131;
				@Pc(139) int local139;
				@Pc(150) int local150;
				if (this.anInt861 == 3) {
					if (this.aString17 != this.aString29) {
						this.method672(this.aString17);
						this.aString29 = this.aString17;
					}
					local131 = this.aClass1_Sub2_Sub1_Sub4_3;
					Class1_Sub2_Sub1.method532(0, 0, 463, 77);
					for (local139 = 0; local139 < this.anInt1048; local139++) {
						local150 = local139 * 14 + 18 - this.anInt1049;
						if (local150 > 0 && local150 < 110) {
							local131.method543(0, local150, 239, this.aStringArray14[local139]);
						}
					}
					Class1_Sub2_Sub1.method531();
					if (this.anInt1048 > 5) {
						this.method642(this.anInt1048 * 14 + 7, 463, 77, this.aBoolean235, this.anInt1049, 0);
					}
					if (this.aString17.length() == 0) {
						this.aClass1_Sub2_Sub1_Sub4_4.method543(255, 40, 239, "Enter object name");
					} else if (this.anInt1048 == 0) {
						this.aClass1_Sub2_Sub1_Sub4_4.method543(0, 40, 239, "No matching objects found, please shorten search");
					}
					local131.method543(0, 90, 239, this.aString17 + "*");
					Class1_Sub2_Sub1.method538(0, 0, 479, 77);
				} else if (this.aString19 != null) {
					this.aClass1_Sub2_Sub1_Sub4_4.method543(0, 40, 239, this.aString19);
					this.aClass1_Sub2_Sub1_Sub4_4.method543(128, 60, 239, "Click to continue");
				} else if (this.anInt956 != -1) {
					this.method667(0, Class18.method187(this.anInt956), 0, 0);
				} else if (this.anInt1020 == -1) {
					local131 = this.aClass1_Sub2_Sub1_Sub4_3;
					local139 = 0;
					Class1_Sub2_Sub1.method532(0, 0, 463, 77);
					for (local150 = 0; local150 < 100; local150++) {
						if (this.aStringArray11[local150] != null) {
							@Pc(316) int local316 = this.anIntArray221[local150];
							@Pc(325) int local325 = this.anInt910 + 70 - local139 * 14;
							@Pc(330) String local330 = this.aStringArray10[local150];
							@Pc(332) byte local332 = 0;
							if (local330 != null && local330.startsWith("@cr1@")) {
								local330 = local330.substring(5);
								local332 = 1;
							}
							if (local330 != null && local330.startsWith("@cr2@")) {
								local330 = local330.substring(5);
								local332 = 2;
							}
							if (local316 == 0) {
								if (local325 > 0 && local325 < 110) {
									local131.method547(0, this.aStringArray11[local150], 4, local325);
								}
								local139++;
							}
							@Pc(402) int local402;
							if ((local316 == 1 || local316 == 2) && (local316 == 1 || this.anInt869 == 0 || this.anInt869 == 1 && this.method592(426, local330))) {
								if (local325 > 0 && local325 < 110) {
									local402 = 4;
									if (local332 == 1) {
										this.aClass1_Sub2_Sub1_Sub1Array5[0].method51(local325 - 12, 4);
										local402 += 14;
									}
									if (local332 == 2) {
										this.aClass1_Sub2_Sub1_Sub1Array5[1].method51(local325 - 12, local402);
										local402 += 14;
									}
									local131.method547(0, local330 + ":", local402, local325);
									local402 += local131.method545(local330) + 8;
									local131.method547(255, this.aStringArray11[local150], local402, local325);
								}
								local139++;
							}
							if ((local316 == 3 || local316 == 7) && this.anInt855 == 0 && (local316 == 7 || this.anInt1042 == 0 || this.anInt1042 == 1 && this.method592(426, local330))) {
								if (local325 > 0 && local325 < 110) {
									local131.method547(0, "From", 4, local325);
									local402 = local131.method545("From ") + 4;
									if (local332 == 1) {
										this.aClass1_Sub2_Sub1_Sub1Array5[0].method51(local325 - 12, local402);
										local402 += 14;
									}
									if (local332 == 2) {
										this.aClass1_Sub2_Sub1_Sub1Array5[1].method51(local325 - 12, local402);
										local402 += 14;
									}
									local131.method547(0, local330 + ":", local402, local325);
									local402 += local131.method545(local330) + 8;
									local131.method547(8388608, this.aStringArray11[local150], local402, local325);
								}
								local139++;
							}
							if (local316 == 4 && (this.anInt852 == 0 || this.anInt852 == 1 && this.method592(426, local330))) {
								if (local325 > 0 && local325 < 110) {
									local131.method547(8388736, local330 + " " + this.aStringArray11[local150], 4, local325);
								}
								local139++;
							}
							if (local316 == 5 && this.anInt855 == 0 && this.anInt1042 < 2) {
								if (local325 > 0 && local325 < 110) {
									local131.method547(8388608, this.aStringArray11[local150], 4, local325);
								}
								local139++;
							}
							if (local316 == 6 && this.anInt855 == 0 && this.anInt1042 < 2) {
								if (local325 > 0 && local325 < 110) {
									local131.method547(0, "To " + local330 + ":", 4, local325);
									local131.method547(8388608, this.aStringArray11[local150], local131.method545("To " + local330) + 12, local325);
								}
								local139++;
							}
							if (local316 == 8 && (this.anInt852 == 0 || this.anInt852 == 1 && this.method592(426, local330))) {
								if (local325 > 0 && local325 < 110) {
									local131.method547(8270336, local330 + " " + this.aStringArray11[local150], 4, local325);
								}
								local139++;
							}
						}
					}
					Class1_Sub2_Sub1.method531();
					this.anInt890 = local139 * 14 + 7;
					if (this.anInt890 < 78) {
						this.anInt890 = 78;
					}
					this.method642(this.anInt890, 463, 77, this.aBoolean235, this.anInt890 - this.anInt910 - 77, 0);
					@Pc(773) String local773;
					if (aClass1_Sub2_Sub2_Sub1_Sub1_1 == null || aClass1_Sub2_Sub2_Sub1_Sub1_1.aString3 == null) {
						local773 = Class40.method417(this.aString20);
					} else {
						local773 = aClass1_Sub2_Sub2_Sub1_Sub1_1.aString3;
					}
					local131.method547(0, local773 + ":", 4, 90);
					local131.method547(255, this.aString18 + "*", local131.method545(local773 + ": ") + 6, 90);
					Class1_Sub2_Sub1.method538(0, 0, 479, 77);
				} else {
					this.method667(0, Class18.method187(this.anInt1020), 0, 0);
				}
			}
			if (this.aBoolean218 && this.anInt829 == 2) {
				this.method622();
			}
			this.aClass26_6.method280(super.aGraphics2, 17, 357, (byte) 1);
			this.aClass26_5.method279();
			Class1_Sub2_Sub1_Sub3.anIntArray147 = this.anIntArray237;
		} catch (@Pc(854) RuntimeException local854) {
			signlink.reporterror("50678, " + false + ", " + local854.toString());
			throw new RuntimeException();
		}
	}
}
