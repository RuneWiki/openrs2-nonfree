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

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private static int anInt910;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private static int anInt916;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private static int anInt917;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private static int anInt919;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private static int anInt934;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	public static int anInt936;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private static boolean aBoolean237;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private static int anInt941;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private static int anInt945;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private static int anInt974;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
	private static boolean aBoolean249;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private static int anInt979;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private static int anInt988;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	private static boolean aBoolean252;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!CHKMTWJC;")
	public static Class3_Sub1_Sub1_Sub2_Sub1 aClass3_Sub1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	public static int anInt1000;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private static int anInt1025;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private static int anInt1027;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private static int anInt1048;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private static int anInt1049;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private static int[] anIntArray212 = new int[99];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Ljava/lang/String;")
	private static String aString17;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private static int anInt876;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private static int anInt895;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private static int anInt908;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[[I")
	public static final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private static int anInt935;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
	public static final int[] anIntArray243;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private static int anInt982;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private static boolean aBoolean254;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_3;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_3;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_4;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_5;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!GWOEELWB;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!FJSXIAWX;")
	private Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array3;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_6;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_7;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_8;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_7;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_9;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_10;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_11;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_12;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_13;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_14;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_15;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!SSVSGKGT;")
	private Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!SSVSGKGT;")
	private Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_3;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!SSVSGKGT;")
	private Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_4;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!SSVSGKGT;")
	private Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_5;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_16;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_17;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_18;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_6;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_7;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!TAWLWNCF;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_9;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_10;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_11;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_12;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_13;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_14;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_15;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Lclient!YBAERVYW;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_17;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_18;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_8;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!SSCDCBAC;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_9;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_10;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_19;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_20;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_14;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_15;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_19;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_20;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_21;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_22;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_23;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_24;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_25;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_26;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!WOKQCNXG;")
	private Class42 aClass42_27;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_16;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!KPIQNZMJ;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_17;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt844 = -1;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array4 = new Class3_Sub1_Sub4_Sub4[20];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "B")
	private byte aByte41 = 55;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	private int[] anIntArray214 = new int[5];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!MLYYHULT;")
	private Class3_Sub1_Sub2 aClass3_Sub1_Sub2_6 = Class3_Sub1_Sub2.method188();

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!ZWZXPJNQ;")
	private Class50 aClass50_10 = new Class50(708);

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array2 = new Class3_Sub1_Sub4_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
	private int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
	private volatile boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt868 = -1;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt871 = 1;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt872 = 128;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt877 = -1;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt878 = -1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array5 = new Class3_Sub1_Sub4_Sub4[100];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	private int[] anIntArray216 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray217 = new int[500];

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[I")
	private int[] anIntArray218 = new int[500];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[I")
	private int[] anIntArray219 = new int[500];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
	private int[] anIntArray220 = new int[500];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt886 = 3;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt887 = 8;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
	private final int[] anIntArray225 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
	private int[] anIntArray226 = new int[50];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt889 = 490;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array6 = new Class3_Sub1_Sub4_Sub4[32];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
	private int[] anIntArray227 = new int[33];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray228 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt900 = 78;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!MLYYHULT;")
	private Class3_Sub1_Sub2 aClass3_Sub1_Sub2_7 = new Class3_Sub1_Sub2(true, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[Lclient!JMUIRIHZ;")
	private Class3_Sub1_Sub1_Sub2_Sub2[] aClass3_Sub1_Sub1_Sub2_Sub2Array1 = new Class3_Sub1_Sub1_Sub2_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	private int[] anIntArray229 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
	private int[] anIntArray230 = new int[7];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray231 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt903 = -303;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
	private volatile boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
	public int[] anIntArray232 = new int[2000];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Lclient!HWEMRKQZ;")
	private Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array4 = new Class3_Sub1_Sub4_Sub1[2];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray233 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array7 = new Class3_Sub1_Sub4_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
	private int[] anIntArray234 = new int[151];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[Lclient!RRDZGTNX;")
	public Class29[] aClass29Array1 = new Class29[5];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt918 = 7;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Z")
	public boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt920 = -1;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt922 = 2;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt925 = 7759444;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt928 = -1;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!ZWZXPJNQ;")
	private Class50 aClass50_11 = new Class50(708);

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt929 = -38190;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray237 = new int[1000];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt931 = 935;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt939 = 5;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "B")
	private byte aByte42 = 45;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt942 = -1;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray239 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray240 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt943 = -1;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt944 = -1;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!ZWZXPJNQ;")
	private Class50 aClass50_12 = new Class50(708);

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array8 = new Class3_Sub1_Sub4_Sub4[32];

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt958 = 2;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!MLYYHULT;")
	private Class3_Sub1_Sub2 aClass3_Sub1_Sub2_8 = Class3_Sub1_Sub2.method188();

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray241 = new int[100];

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "B")
	private byte aByte43 = 33;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt962 = 1;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
	private int[] anIntArray242 = new int[100];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt966 = -258;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt967 = 2048;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt968 = 2047;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[Lclient!CHKMTWJC;")
	private Class3_Sub1_Sub1_Sub2_Sub1[] aClass3_Sub1_Sub1_Sub2_Sub1Array1 = new Class3_Sub1_Sub1_Sub2_Sub1[this.anInt967];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
	private int[] anIntArray244 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
	private int[] anIntArray245 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[Lclient!MLYYHULT;")
	private Class3_Sub1_Sub2[] aClass3_Sub1_Sub2Array1 = new Class3_Sub1_Sub2[this.anInt967];

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!MLYYHULT;")
	private Class3_Sub1_Sub2 aClass3_Sub1_Sub2_9 = Class3_Sub1_Sub2.method188();

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
	private int[] anIntArray246 = new int[151];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
	private volatile boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt975 = 336;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt981 = 50;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[I")
	private int[] anIntArray247 = new int[this.anInt981];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[I")
	private int[] anIntArray248 = new int[this.anInt981];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray249 = new int[this.anInt981];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private int[] anIntArray250 = new int[this.anInt981];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray251 = new int[this.anInt981];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[I")
	private int[] anIntArray252 = new int[this.anInt981];

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
	private int[] anIntArray253 = new int[this.anInt981];

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[this.anInt981];

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array9 = new Class3_Sub1_Sub4_Sub4[8];

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "B")
	private byte aByte44 = 3;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt987 = -1;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[Lclient!NUXLZYAZ;")
	private Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array5 = new Class3_Sub1_Sub4_Sub1[13];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[Lclient!SWNASVGQ;")
	private Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array10 = new Class3_Sub1_Sub4_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt990 = -6346;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray254 = new int[256];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt992 = -578;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[I")
	private int[] anIntArray255 = new int[Class14.anInt270];

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[I")
	private int[] anIntArray256 = new int[Class14.anInt270];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt997 = -1;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt998 = 187;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt999 = 3353893;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt1002 = -1;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt1005 = 43943;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1011 = -1;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1022 = 2301979;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1024 = 1;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray262 = new int[2000];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[I")
	private int[] anIntArray263 = new int[33];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1030 = -228;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[Lclient!OTPPFNKL;")
	private Class22[] aClass22Array1 = new Class22[4];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1040 = 2;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "B")
	private byte aByte45 = 25;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1041 = -1;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray264 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
	private int[] anIntArray265 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "B")
	private byte aByte46 = -85;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray266 = new int[50];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
	private int[] anIntArray267 = new int[9];

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1046 = -1;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[I")
	private int[] anIntArray268 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray269 = new int[5];

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[500];

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1054 = 32;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1058 = 47691;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1060 = -1;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[[[Lclient!ZWZXPJNQ;")
	private Class50[][][] aClass50ArrayArrayArray1 = new Class50[4][104][104];

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private final int anInt1066 = 100;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[I")
	private int[] anIntArray270 = new int[100];

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
	private int[] anIntArray271 = new int[Class14.anInt270];

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "[I")
	private int[] anIntArray272 = new int[50];

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1067 = 5063219;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "B")
	private byte aByte47 = 24;

	static {
		@Pc(4) int local4 = 0;
		@Pc(6) int local6;
		for (local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray212[local6] = local4 / 4;
		}
		anIntArray213 = new int[32];
		local4 = 2;
		for (local6 = 0; local6 < 32; local6++) {
			anIntArray213[local6] = local4 - 1;
			local4 += local4;
		}
		aString17 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt876 = 495;
		anInt895 = -896;
		anInt908 = -151;
		anIntArrayArray24 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt935 = 10;
		aBoolean236 = true;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArray243 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt982 = 885;
		aBoolean254 = true;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("28904, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private static String method639(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("13230, " + arg0 + ", " + true + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)Ljava/lang/String;")
	private static String method640(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1) {
				anInt908 = -303;
			}
			@Pc(7) int local7 = arg2 - arg0;
			if (local7 < -9) {
				return "@red@";
			} else if (local7 < -6) {
				return "@or3@";
			} else if (local7 < -3) {
				return "@or2@";
			} else if (local7 < 0) {
				return "@or1@";
			} else if (local7 > 9) {
				return "@gre@";
			} else if (local7 > 6) {
				return "@gr3@";
			} else if (local7 > 3) {
				return "@gr2@";
			} else if (local7 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("5460, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 350);
			if (arg0.length == 5) {
				anInt935 = Integer.parseInt(arg0[0]);
				anInt936 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method683();
				} else if (arg0[2].equals("highmem")) {
					method651((byte) 4);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean236 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean236 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1075 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private static void method651(@OriginalArg(0) byte arg0) {
		try {
			Class34.aBoolean181 = false;
			Class3_Sub1_Sub4_Sub2.aBoolean147 = false;
			@Pc(8) boolean local8 = false;
			aBoolean237 = false;
			Class4.aBoolean32 = false;
			Class19.aBoolean87 = false;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("20708, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private static void method683() {
		try {
			Class34.aBoolean181 = true;
			Class3_Sub1_Sub4_Sub2.aBoolean147 = true;
			aBoolean237 = true;
			Class4.aBoolean32 = true;
			Class19.aBoolean87 = true;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("6215, " + -896 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean250) {
			this.method597(aBoolean254);
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIIIIIIII)Z")
	private boolean method589(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray23[local7][local11] = 99999999;
				}
			}
			local11 = arg8;
			@Pc(39) int local39 = arg9;
			this.anIntArrayArray25[arg8][arg9] = 99;
			this.anIntArrayArray23[arg8][arg9] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray239[0] = arg8;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray240[0] = arg9;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray239.length;
			@Pc(81) int[][] local81 = this.aClass22Array1[this.anInt1052].anIntArrayArray15;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray239[local57];
				local39 = this.anIntArray240[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg4 && local39 == arg7) {
					local70 = true;
					break;
				}
				if (arg2 != 0) {
					if ((arg2 < 5 || arg2 == 10) && this.aClass22Array1[this.anInt1052].method292(arg6, arg7, arg4, local39, arg2 - 1, local11)) {
						local70 = true;
						break;
					}
					if (arg2 < 10 && this.aClass22Array1[this.anInt1052].method293(arg4, arg2 - 1, arg7, arg6, local11, local39)) {
						local70 = true;
						break;
					}
				}
				if (arg3 != 0 && arg5 != 0 && this.aClass22Array1[this.anInt1052].method294(arg5, local39, local11, arg4, arg3, arg7, arg10)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray23[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray239[local66] = local11 - 1;
					this.anIntArray240[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray23[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray239[local66] = local11 + 1;
					this.anIntArray240[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray23[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray239[local66] = local11;
					this.anIntArray240[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray23[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray239[local66] = local11;
					this.anIntArray240[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray23[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray239[local66] = local11 - 1;
					this.anIntArray240[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray239[local66] = local11 + 1;
					this.anIntArray240[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray239[local66] = local11 - 1;
					this.anIntArray240[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray239[local66] = local11 + 1;
					this.anIntArray240[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt1053 = 0;
			this.anInt845 += 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local70) {
				if (arg1) {
					local192 = 100;
					for (local814 = 1; local814 < 2; local814++) {
						for (local820 = arg4 - local814; local820 <= arg4 + local814; local820++) {
							for (local826 = arg7 - local814; local826 <= arg7 + local814; local826++) {
								if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray23[local820][local826] < local192) {
									local192 = this.anIntArrayArray23[local820][local826];
									local11 = local820;
									local39 = local826;
									this.anInt1053 = 1;
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
			@Pc(887) byte local887 = 0;
			this.anIntArray239[0] = local11;
			local57 = local887 + 1;
			this.anIntArray240[0] = local39;
			local192 = local814 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg8 || local39 != arg9) {
				if (local192 != local814) {
					local814 = local192;
					this.anIntArray239[local57] = local11;
					this.anIntArray240[local57++] = local39;
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
				local192 = this.anIntArrayArray25[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local820 = this.anIntArray239[local57];
				local826 = this.anIntArray240[local57];
				if (arg0 == 0) {
					this.aClass3_Sub1_Sub2_8.method189(246, 132);
					this.aClass3_Sub1_Sub2_8.method190(local74 + local74 + 3);
				}
				if (arg0 == 1) {
					this.aClass3_Sub1_Sub2_8.method189(147, 132);
					this.aClass3_Sub1_Sub2_8.method190(local74 + local74 + 3 + 14);
				}
				if (arg0 == 2) {
					this.aClass3_Sub1_Sub2_8.method189(216, 132);
					this.aClass3_Sub1_Sub2_8.method190(local74 + local74 + 3);
				}
				this.aClass3_Sub1_Sub2_8.method216(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass3_Sub1_Sub2_8.method225(local826 + this.anInt897);
				this.anInt994 = this.anIntArray239[0];
				this.anInt995 = this.anIntArray240[0];
				for (@Pc(1066) int local1066 = 1; local1066 < local74; local1066++) {
					local57--;
					this.aClass3_Sub1_Sub2_8.method216(this.anIntArray239[local57] - local820);
					this.aClass3_Sub1_Sub2_8.method217(this.anIntArray240[local57] - local826);
				}
				this.aClass3_Sub1_Sub2_8.method225(local820 + this.anInt896);
				return true;
			} else if (arg0 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1111) RuntimeException local1111) {
			signlink.reporterror("864, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)Z")
	private boolean method590(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			if (arg1 != 24) {
				throw new NullPointerException();
			}
			@Pc(23) int local23 = this.aClass34_1.method492(this.anInt1052, arg0, arg2, arg3);
			if (local23 == -1) {
				return false;
			}
			@Pc(32) int local32 = local23 & 0x1F;
			@Pc(38) int local38 = local23 >> 6 & 0x3;
			anInt979++;
			if (anInt979 > 1184) {
				anInt979 = 0;
				this.aClass3_Sub1_Sub2_8.method189(127, 132);
				this.aClass3_Sub1_Sub2_8.method190(0);
				@Pc(60) int local60 = this.aClass3_Sub1_Sub2_8.anInt429;
				this.aClass3_Sub1_Sub2_8.method191(8709);
				this.aClass3_Sub1_Sub2_8.method191(18795);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_8.method190(235);
				}
				this.aClass3_Sub1_Sub2_8.method190(38);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_8.method191(55800);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_8.method191(42667);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_8.method190(1);
				}
				this.aClass3_Sub1_Sub2_8.method190(163);
				this.aClass3_Sub1_Sub2_8.method191(42960);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_8.method190(194);
				}
				this.aClass3_Sub1_Sub2_8.method199(this.aClass3_Sub1_Sub2_8.anInt429 - local60);
			}
			if (local32 == 10 || local32 == 11 || local32 == 22) {
				@Pc(146) Class19 local146 = Class19.method182(local7);
				@Pc(154) int local154;
				@Pc(157) int local157;
				if (local38 == 0 || local38 == 2) {
					local154 = local146.anInt375;
					local157 = local146.anInt381;
				} else {
					local154 = local146.anInt381;
					local157 = local146.anInt375;
				}
				@Pc(168) int local168 = local146.anInt382;
				if (local38 != 0) {
					local168 = (local168 << local38 & 0xF) + (local168 >> 4 - local38);
				}
				this.method589(2, false, 0, local154, arg0, local157, 0, arg2, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], local168);
			} else {
				this.method589(2, false, local32 + 1, 0, arg0, 0, local38, arg2, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
			}
			this.anInt1031 = super.anInt839;
			this.anInt1032 = super.anInt840;
			this.anInt1034 = 2;
			this.anInt1033 = 0;
			return true;
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("24667, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method591() {
		try {
			this.aBoolean257 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray230[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class20.anInt440; local15++) {
					if (!Class20.aClass20Array1[local15].aBoolean118 && Class20.aClass20Array1[local15].anInt441 == local6 + (this.aBoolean225 ? 0 : 7)) {
						this.anIntArray230[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("58801, " + -245 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MLYYHULT;B)V")
	private void method592(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt930 = 0;
			this.anInt970 = 0;
			this.method641(arg0, arg1);
			@Pc(17) boolean local17 = false;
			this.method682(arg1, arg0);
			this.method665(this.anInt889, arg0, arg1);
			this.method646(arg1, arg0);
			@Pc(47) int local47;
			for (@Pc(40) int local40 = 0; local40 < this.anInt930; local40++) {
				local47 = this.anIntArray237[local40];
				if (this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local47].anInt343 != anInt1000) {
					this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local47] = null;
				}
			}
			if (arg1.anInt429 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt429 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local47 = 0; local47 < this.anInt969; local47++) {
				if (this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local47]] == null) {
					signlink.reporterror(this.aString28 + " null entry in pl list - pos:" + local47 + " size:" + this.anInt969);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("97291, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method593() {
		try {
			@Pc(8) int local8;
			if (this.anInt1068 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1068 > 768) {
						this.anIntArray221[local8] = this.method690(1024 - this.anInt1068, this.anIntArray222[local8], this.anIntArray223[local8]);
					} else if (this.anInt1068 > 256) {
						this.anIntArray221[local8] = this.anIntArray223[local8];
					} else {
						this.anIntArray221[local8] = this.method690(256 - this.anInt1068, this.anIntArray223[local8], this.anIntArray222[local8]);
					}
				}
			} else if (this.anInt1069 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1069 > 768) {
						this.anIntArray221[local8] = this.method690(1024 - this.anInt1069, this.anIntArray222[local8], this.anIntArray224[local8]);
					} else if (this.anInt1069 > 256) {
						this.anIntArray221[local8] = this.anIntArray224[local8];
					} else {
						this.anIntArray221[local8] = this.method690(256 - this.anInt1069, this.anIntArray224[local8], this.anIntArray222[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray221[local8] = this.anIntArray222[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass42_22.anIntArray203[local8] = this.aClass3_Sub1_Sub4_Sub4_6.anIntArray175[local8];
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
				local198 = this.anIntArray254[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray260[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray221[local220];
						local239 = this.aClass42_22.anIntArray203[local183];
						this.aClass42_22.anIntArray203[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass42_22.method542(0, super.aGraphics2, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass42_23.anIntArray203[local198] = this.aClass3_Sub1_Sub4_Sub4_7.anIntArray175[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray254[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray260[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray221[local228];
						@Pc(373) int local373 = this.aClass42_23.anIntArray203[local183];
						this.aClass42_23.anIntArray203[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass42_23.method542(0, super.aGraphics2, 637);
		} catch (@Pc(450) RuntimeException local450) {
			signlink.reporterror("50825, " + 0 + ", " + local450.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	private void method594(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg0 == 0 && this.anInt1060 != -1) {
				this.aString18 = arg2;
				super.anInt838 = 0;
			}
			if (this.anInt1046 == -1) {
				this.aBoolean255 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray242[local20] = this.anIntArray242[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
			}
			this.anIntArray242[0] = arg0;
			this.aStringArray11[0] = arg1;
			this.aStringArray12[0] = arg2;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("25325, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -113 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Z")
	private boolean method595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class15 local6 = Class15.method147(arg0);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray109.length && local6.anIntArray109[local8] != -1; local8++) {
				@Pc(22) Class15 local22 = Class15.method147(local6.anIntArray109[local8]);
				if (local22.anInt280 == 1) {
					local3 |= this.method595(local22.anInt287, arg1);
				}
				@Pc(57) int local57;
				if (local22.anInt280 == 6 && (local22.anInt281 != -1 || local22.anInt282 != -1)) {
					@Pc(52) boolean local52 = this.method598(local22);
					if (local52) {
						local57 = local22.anInt282;
					} else {
						local57 = local22.anInt281;
					}
					if (local57 != -1) {
						@Pc(69) Class38 local69 = Class38.aClass38Array1[local57];
						local22.anInt293 += arg1;
						while (local22.anInt293 > local69.method525((byte) 5, local22.anInt303)) {
							local22.anInt293 -= local69.method525((byte) 5, local22.anInt303) + 1;
							local22.anInt303++;
							if (local22.anInt303 >= local69.anInt707) {
								local22.anInt303 -= local69.anInt708;
								if (local22.anInt303 < 0 || local22.anInt303 >= local69.anInt707) {
									local22.anInt303 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local22.anInt280 == 6 && local22.anInt295 != 0) {
					@Pc(140) int local140 = local22.anInt295 >> 16;
					local57 = local22.anInt295 << 16 >> 16;
					@Pc(151) int local151 = local140 * arg1;
					local57 *= arg1;
					local22.anInt272 = local22.anInt272 + local151 & 0x7FF;
					local22.anInt273 = local22.anInt273 + local57 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("63596, " + arg0 + ", " + -187 + ", " + arg1 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method596(@OriginalArg(1) int arg0) {
		try {
			@Pc(18) int local18 = Class17.aClass17Array1[arg0].anInt369;
			if (local18 != 0) {
				@Pc(26) int local26 = this.anIntArray232[arg0];
				if (local18 == 1) {
					if (local26 == 1) {
						Class3_Sub1_Sub4_Sub2.method371(0.9D);
					}
					if (local26 == 2) {
						Class3_Sub1_Sub4_Sub2.method371(0.8D);
					}
					if (local26 == 3) {
						Class3_Sub1_Sub4_Sub2.method371(0.7D);
					}
					if (local26 == 4) {
						Class3_Sub1_Sub4_Sub2.method371(0.6D);
					}
					Class25.aClass36_6.method515();
					this.aBoolean248 = true;
				}
				if (local18 == 3) {
					@Pc(64) boolean local64 = this.aBoolean221;
					if (local26 == 0) {
						this.method725(this.aBoolean221, 0);
						this.aBoolean221 = true;
					}
					if (local26 == 1) {
						this.method725(this.aBoolean221, -400);
						this.aBoolean221 = true;
					}
					if (local26 == 2) {
						this.method725(this.aBoolean221, -800);
						this.aBoolean221 = true;
					}
					if (local26 == 3) {
						this.method725(this.aBoolean221, -1200);
						this.aBoolean221 = true;
					}
					if (local26 == 4) {
						this.aBoolean221 = false;
					}
					if (this.aBoolean221 != local64 && !aBoolean237) {
						if (this.aBoolean221) {
							this.anInt855 = this.anInt1041;
							this.aBoolean218 = true;
							this.aClass8_Sub1_1.method128(2, this.anInt855);
						} else {
							this.method726();
						}
						this.anInt978 = 0;
					}
				}
				if (local18 == 4) {
					if (local26 == 0) {
						this.aBoolean240 = true;
						this.method675(0);
					}
					if (local26 == 1) {
						this.aBoolean240 = true;
						this.method675(-400);
					}
					if (local26 == 2) {
						this.aBoolean240 = true;
						this.method675(-800);
					}
					if (local26 == 3) {
						this.aBoolean240 = true;
						this.method675(-1200);
					}
					if (local26 == 4) {
						this.aBoolean240 = false;
					}
				}
				if (local18 == 5) {
					this.anInt1044 = local26;
				}
				if (local18 == 6) {
					this.anInt927 = local26;
				}
				if (local18 == 8) {
					this.anInt993 = local26;
					this.aBoolean255 = true;
				}
				if (local18 == 9) {
					this.anInt938 = local26;
				}
			}
		} catch (@Pc(224) RuntimeException local224) {
			signlink.reporterror("48686, " + 7 + ", " + arg0 + ", " + local224.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method597(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean219 = true;
			this.aBoolean233 &= arg0;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean226) {
					this.anInt976++;
					this.method668();
					this.method668();
					this.method593();
					local12++;
					if (local12 > 10) {
						@Pc(37) long local37 = System.currentTimeMillis();
						@Pc(46) int local46 = (int) (local37 - local10) / 10 - local14;
						local14 = 40 - local46;
						if (local14 < 5) {
							local14 = 5;
						}
						local12 = 0;
						local10 = local37;
					}
					try {
						Thread.sleep((long) local14);
					} catch (@Pc(64) Exception local64) {
					}
				}
			} catch (@Pc(70) Exception local70) {
			}
			this.aBoolean219 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("71318, " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!HWEMRKQZ;I)Z")
	private boolean method598(@OriginalArg(0) Class15 arg0) {
		try {
			if (arg0.anIntArray113 == null) {
				return false;
			}
			for (@Pc(14) int local14 = 0; local14 < arg0.anIntArray113.length; local14++) {
				@Pc(22) int local22 = this.method648(local14, arg0);
				@Pc(27) int local27 = arg0.anIntArray108[local14];
				if (arg0.anIntArray113[local14] == 2) {
					if (local22 >= local27) {
						return false;
					}
				} else if (arg0.anIntArray113[local14] == 3) {
					if (local22 <= local27) {
						return false;
					}
				} else if (arg0.anIntArray113[local14] == 4) {
					if (local22 == local27) {
						return false;
					}
				} else if (local22 != local27) {
					return false;
				}
			}
			return true;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("52723, " + arg0 + ", " + 8 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NXRPKSXU;ZI)V")
	private void method599(@OriginalArg(0) Class3_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method600(arg0.anInt331, arg0.anInt330, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("36856, " + arg0 + ", " + false + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method605(this.anInt1052, arg1, arg0) - arg2;
				@Pc(33) int local33 = arg1 - this.anInt1061;
				@Pc(43) int local43 = local28 - this.anInt1062;
				@Pc(48) int local48 = arg0 - this.anInt1063;
				@Pc(53) int local53 = Class3_Sub1_Sub1_Sub1.anIntArray40[this.anInt1064];
				@Pc(58) int local58 = Class3_Sub1_Sub1_Sub1.anIntArray41[this.anInt1064];
				@Pc(63) int local63 = Class3_Sub1_Sub1_Sub1.anIntArray40[this.anInt1065];
				@Pc(68) int local68 = Class3_Sub1_Sub1_Sub1.anIntArray41[this.anInt1065];
				@Pc(78) int local78 = local48 * local63 + local33 * local68 >> 16;
				@Pc(88) int local88 = local48 * local68 - local33 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local43 * local58 - local88 * local53 >> 16;
				@Pc(110) int local110 = local43 * local53 + local88 * local58 >> 16;
				if (local110 >= 50) {
					this.anInt943 = Class3_Sub1_Sub4_Sub2.anInt552 + (local90 << 9) / local110;
					this.anInt944 = Class3_Sub1_Sub4_Sub2.anInt553 + (local100 << 9) / local110;
				} else {
					this.anInt943 = -1;
					this.anInt944 = -1;
				}
			} else {
				this.anInt943 = -1;
				this.anInt944 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("53898, " + -435 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method601() {
		try {
			this.aClass42_4.method541();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt1050 == 2) {
				@Pc(13) byte[] local13 = this.aClass3_Sub1_Sub4_Sub1_7.aByteArray16;
				@Pc(15) int[] local15 = Class3_Sub1_Sub4.anIntArray174;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass3_Sub1_Sub4_Sub4_17.method453(this.anIntArray227, this.anIntArray263, 0, 256, 0, 25, 25, 33, this.anInt873, 33);
				this.aClass42_5.method541();
				Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
			} else {
				@Pc(67) int local67 = this.anInt873 + this.anInt921 & 0x7FF;
				@Pc(74) int local74 = aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32 + 48;
				if (this.aByte41 != 55) {
					for (local18 = 1; local18 > 0; local18++) {
					}
				}
				local18 = 464 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
				this.aClass3_Sub1_Sub4_Sub4_8.method453(this.anIntArray246, this.anIntArray234, 5, this.anInt870 + 256, 25, local74, local18, 146, local67, 151);
				this.aClass3_Sub1_Sub4_Sub4_17.method453(this.anIntArray227, this.anIntArray263, 0, 256, 0, 25, 25, 33, this.anInt873, 33);
				for (local20 = 0; local20 < this.anInt1042; local20++) {
					local74 = this.anIntArray264[local20] * 4 + 2 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32;
					local18 = this.anIntArray265[local20] * 4 + 2 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
					this.method662(local74, local18, this.aClass3_Sub1_Sub4_Sub4Array10[local20]);
				}
				@Pc(180) int local180;
				for (@Pc(176) int local176 = 0; local176 < 104; local176++) {
					for (local180 = 0; local180 < 104; local180++) {
						@Pc(192) Class50 local192 = this.aClass50ArrayArrayArray1[this.anInt1052][local176][local180];
						if (local192 != null) {
							local74 = local176 * 4 + 2 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32;
							local18 = local180 * 4 + 2 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
							this.method662(local74, local18, this.aClass3_Sub1_Sub4_Sub4_11);
						}
					}
				}
				for (local180 = 0; local180 < this.anInt901; local180++) {
					@Pc(243) Class3_Sub1_Sub1_Sub2_Sub2 local243 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray229[local180]];
					if (local243 != null && local243.method157()) {
						@Pc(252) Class40 local252 = local243.aClass40_2;
						if (local252.anIntArray200 != null) {
							local252 = local252.method533();
						}
						if (local252 != null && local252.aBoolean192 && local252.aBoolean193) {
							local74 = local243.anInt330 / 32 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32;
							local18 = local243.anInt331 / 32 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
							this.method662(local74, local18, this.aClass3_Sub1_Sub4_Sub4_12);
						}
					}
				}
				@Pc(311) Class3_Sub1_Sub1_Sub2_Sub1 local311;
				for (@Pc(301) int local301 = 0; local301 < this.anInt969; local301++) {
					local311 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local301]];
					if (local311 != null && local311.method157()) {
						local74 = local311.anInt330 / 32 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32;
						local18 = local311.anInt331 / 32 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
						@Pc(339) boolean local339 = false;
						@Pc(343) long local343 = Class43.method544(local311.aString3);
						for (@Pc(345) int local345 = 0; local345 < this.anInt1056; local345++) {
							if (local343 == this.aLongArray3[local345] && this.anIntArray233[local345] != 0) {
								local339 = true;
								break;
							}
						}
						@Pc(370) boolean local370 = false;
						if (aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt147 != 0 && local311.anInt147 != 0 && aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt147 == local311.anInt147) {
							local370 = true;
						}
						if (local339) {
							this.method662(local74, local18, this.aClass3_Sub1_Sub4_Sub4_14);
						} else if (local370) {
							this.method662(local74, local18, this.aClass3_Sub1_Sub4_Sub4_15);
						} else {
							this.method662(local74, local18, this.aClass3_Sub1_Sub4_Sub4_13);
						}
					}
				}
				if (this.anInt865 != 0 && anInt1000 % 20 < 10) {
					if (this.anInt865 == 1 && this.anInt985 >= 0 && this.anInt985 < this.aClass3_Sub1_Sub1_Sub2_Sub2Array1.length) {
						@Pc(444) Class3_Sub1_Sub1_Sub2_Sub2 local444 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[this.anInt985];
						if (local444 != null) {
							local74 = local444.anInt330 / 32 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32;
							local18 = local444.anInt331 / 32 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
							this.method630(this.aClass3_Sub1_Sub4_Sub4_5, local74, local18);
						}
					}
					if (this.anInt865 == 2) {
						local74 = (this.anInt890 - this.anInt896) * 4 + 2 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32;
						local18 = (this.anInt891 - this.anInt897) * 4 + 2 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
						this.method630(this.aClass3_Sub1_Sub4_Sub4_5, local74, local18);
					}
					if (this.anInt865 == 10 && this.anInt1023 >= 0 && this.anInt1023 < this.aClass3_Sub1_Sub1_Sub2_Sub1Array1.length) {
						local311 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anInt1023];
						if (local311 != null) {
							local74 = local311.anInt330 / 32 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32;
							local18 = local311.anInt331 / 32 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
							this.method630(this.aClass3_Sub1_Sub4_Sub4_5, local74, local18);
						}
					}
				}
				if (this.anInt994 != 0) {
					local74 = this.anInt994 * 4 + 2 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 / 32;
					local18 = this.anInt995 * 4 + 2 - aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 / 32;
					this.method662(local74, local18, this.aClass3_Sub1_Sub4_Sub4_4);
				}
				Class3_Sub1_Sub4.method437(16777215, 97, 78, 3, 3);
				this.aClass42_5.method541();
				Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
			}
		} catch (@Pc(612) RuntimeException local612) {
			signlink.reporterror("33626, " + 55 + ", " + local612.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NUXLZYAZ;I)V")
	private void method602(@OriginalArg(0) Class3_Sub1_Sub4_Sub1 arg0) {
		try {
			if (this.anInt939 != 5) {
				this.aClass50ArrayArrayArray1 = null;
			}
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray235.length; local12++) {
				this.anIntArray235[local12] = 0;
			}
			@Pc(37) int local37;
			for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
				local37 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray235[local37] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local37 = 0; local37 < 20; local37++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray236[local67] = (this.anIntArray235[local67 - 1] + this.anIntArray235[local67 + 1] + this.anIntArray235[local67 - 128] + this.anIntArray235[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray235;
				this.anIntArray235 = this.anIntArray236;
				this.anIntArray236 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt469; local59++) {
					for (local67 = 0; local67 < arg0.anInt468; local67++) {
						if (arg0.aByteArray16[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt470 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt471 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray235[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("98700, " + arg0 + ", " + 5 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method603() {
		try {
			if (this.anInt849 > 0) {
				this.method695();
			} else {
				this.method696("Connection lost", "Please wait - attempting to reestablish");
				this.anInt1050 = 0;
				this.anInt994 = 0;
				@Pc(24) Class16 local24 = this.aClass16_1;
				this.aBoolean233 = false;
				this.anInt924 = 0;
				this.method710(this.aString28, this.aString29, true);
				if (!this.aBoolean233) {
					this.method695();
				}
				try {
					local24.method161();
				} catch (@Pc(47) Exception local47) {
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("66440, " + 33 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method604() {
		try {
			Class19.aClass36_4.method515();
			Class19.aClass36_5.method515();
			Class40.aClass36_8.method515();
			Class25.aClass36_7.method515();
			Class25.aClass36_6.method515();
			Class3_Sub1_Sub1_Sub2_Sub1.aClass36_1.method515();
			Class44.aClass36_9.method515();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("95473, " + 2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg0 + 1;
			}
			@Pc(47) int local47 = arg1 & 0x7F;
			@Pc(51) int local51 = arg2 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local47) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local47) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("16137, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass3_Sub1_Sub4_Sub1_19.method281(arg1, arg0);
			this.aClass3_Sub1_Sub4_Sub1_20.method281(arg1, arg0 + arg3 - 16);
			Class3_Sub1_Sub4.method437(this.anInt1022, arg1, arg0 + 16, 16, arg3 - 32);
			@Pc(35) int local35 = (arg3 - 32) * arg3 / arg4;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg3 - local35 - 32) * arg5 / (arg4 - arg3);
			Class3_Sub1_Sub4.method437(this.anInt1067, arg1, arg0 + local52 + 16, 16, local35);
			Class3_Sub1_Sub4.method442(this.anInt925, local35, arg1, arg0 + local52 + 16);
			Class3_Sub1_Sub4.method442(this.anInt925, local35, arg1 + 1, arg0 + 16 + local52);
			Class3_Sub1_Sub4.method440(this.anInt925, arg0 + local52 + 16, 16, arg1);
			@Pc(103) boolean local103 = false;
			Class3_Sub1_Sub4.method440(this.anInt925, arg0 + local52 + 17, 16, arg1);
			Class3_Sub1_Sub4.method442(this.anInt999, local35, arg1 + 15, arg0 + 16 + local52);
			Class3_Sub1_Sub4.method442(this.anInt999, local35 - 1, arg1 + 14, arg0 + local52 + 17);
			Class3_Sub1_Sub4.method440(this.anInt999, arg0 + local52 + local35 + 15, 16, arg1);
			Class3_Sub1_Sub4.method440(this.anInt999, arg0 + local52 + local35 + 14, 15, arg1 + 1);
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("9688, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method607() {
		try {
			if (this.anInt1047 >= 2 || this.anInt953 != 0 || this.anInt963 != 0) {
				@Pc(31) String local31;
				if (this.anInt953 == 1 && this.anInt1047 < 2) {
					local31 = "Use " + this.aString22 + " with...";
				} else if (this.anInt963 == 1 && this.anInt1047 < 2) {
					local31 = this.aString24 + "...";
				} else {
					local31 = this.aStringArray14[this.anInt1047 - 1];
				}
				if (this.anInt1047 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt1047 - 2) + " more options";
				}
				this.aClass3_Sub1_Sub4_Sub3_4.method424(local31, 4, 15, anInt1000 / 1000, 16777215);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("85810, " + true + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method608(@OriginalArg(0) int arg0) {
		try {
			this.anInt1029++;
			this.method614(true);
			this.method654(true);
			this.method614(false);
			this.method654(false);
			this.method676();
			this.method623();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean217) {
				local35 = this.anInt872;
				if (this.anInt926 / 256 > local35) {
					local35 = this.anInt926 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray238[4] + 128 > local35) {
					local35 = this.anIntArray238[4] + 128;
				}
				local74 = this.anInt873 + this.anInt961 & 0x7FF;
				this.method659(local74, this.anInt1019, this.method605(this.anInt1052, aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330, aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331) - 50, local35 * 3 + 600, this.anInt1020, local35);
			}
			if (this.aBoolean217) {
				local35 = this.method616();
			} else {
				local35 = this.method615();
			}
			local74 = this.anInt1061;
			@Pc(118) int local118 = this.anInt1062;
			@Pc(121) int local121 = this.anInt1063;
			@Pc(124) int local124 = this.anInt1064;
			@Pc(127) int local127 = this.anInt1065;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray11[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray215[local129] * 2 + 1) - (double) this.anIntArray215[local129] + Math.sin((double) this.anIntArray214[local129] * ((double) this.anIntArray269[local129] / 100.0D)) * (double) this.anIntArray238[local129]);
					if (local129 == 0) {
						this.anInt1061 += local176;
					}
					if (local129 == 1) {
						this.anInt1062 += local176;
					}
					if (local129 == 2) {
						this.anInt1063 += local176;
					}
					if (local129 == 3) {
						this.anInt1065 = this.anInt1065 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt1064 += local176;
						if (this.anInt1064 < 128) {
							this.anInt1064 = 128;
						}
						if (this.anInt1064 > 383) {
							this.anInt1064 = 383;
						}
					}
				}
			}
			local176 = Class3_Sub1_Sub4_Sub2.anInt556;
			Class3_Sub1_Sub1_Sub1.aBoolean16 = true;
			Class3_Sub1_Sub1_Sub1.anInt36 = 0;
			Class3_Sub1_Sub1_Sub1.anInt34 = super.anInt833 - 4;
			Class3_Sub1_Sub1_Sub1.anInt35 = super.anInt834 - 4;
			Class3_Sub1_Sub4.method435();
			this.aClass34_1.method501(local35, this.anInt1063, this.anInt1061, this.anInt1062, this.anInt1064, this.anInt1065);
			if (arg0 != 0) {
				for (@Pc(277) int local277 = 1; local277 > 0; local277++) {
				}
			}
			this.aClass34_1.method476();
			this.method716();
			this.method670();
			this.method611(local176, 151);
			this.method649(this.anInt1005);
			this.aClass42_5.method542(4, super.aGraphics2, 4);
			this.anInt1061 = local74;
			this.anInt1062 = local118;
			this.anInt1063 = local121;
			this.anInt1064 = local124;
			this.anInt1065 = local127;
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("84925, " + arg0 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method609(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean226 = false;
			while (this.aBoolean219) {
				this.aBoolean226 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass3_Sub1_Sub4_Sub1_17 = null;
			this.aClass3_Sub1_Sub4_Sub1_18 = null;
			this.aClass3_Sub1_Sub4_Sub1Array3 = null;
			this.anIntArray221 = null;
			this.anIntArray222 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.anIntArray235 = null;
			@Pc(46) boolean local46 = false;
			this.anIntArray236 = null;
			this.anIntArray260 = null;
			this.anIntArray261 = null;
			this.aClass3_Sub1_Sub4_Sub4_6 = null;
			this.aClass3_Sub1_Sub4_Sub4_7 = null;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("3858, " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method610() {
		try {
			for (@Pc(11) int local11 = -1; local11 < this.anInt969; local11++) {
				@Pc(19) int local19;
				if (local11 == -1) {
					local19 = this.anInt968;
				} else {
					local19 = this.anIntArray244[local11];
				}
				@Pc(31) Class3_Sub1_Sub1_Sub2_Sub1 local31 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local19];
				if (local31 != null) {
					this.method703(1, 825, local31);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("14744, " + 318 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (!aBoolean237) {
				for (@Pc(9) int local9 = 0; local9 < this.anIntArray228.length; local9++) {
					@Pc(16) int local16 = this.anIntArray228[local9];
					if (Class3_Sub1_Sub4_Sub2.anIntArray151[local16] >= arg0) {
						@Pc(25) Class3_Sub1_Sub4_Sub1 local25 = Class3_Sub1_Sub4_Sub2.aClass3_Sub1_Sub4_Sub1Array1[local16];
						@Pc(33) int local33 = local25.anInt468 * local25.anInt469 - 1;
						@Pc(41) int local41 = local25.anInt468 * this.anInt907 * 2;
						@Pc(44) byte[] local44 = local25.aByteArray16;
						@Pc(47) byte[] local47 = this.aByteArray21;
						for (@Pc(49) int local49 = 0; local49 <= local33; local49++) {
							local47[local49] = local44[local49 - local41 & local33];
						}
						local25.aByteArray16 = local47;
						this.aByteArray21 = local44;
						Class3_Sub1_Sub4_Sub2.method369(local16);
					}
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("58340, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method612() {
		try {
			if (this.anInt1050 == 0 && super.anInt838 == 1) {
				@Pc(21) int local21 = super.anInt839 - 25 - 550;
				@Pc(28) int local28 = super.anInt840 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt873 + this.anInt921 & 0x7FF;
					@Pc(52) int local52 = Class3_Sub1_Sub4_Sub2.anIntArray147[local48];
					@Pc(56) int local56 = Class3_Sub1_Sub4_Sub2.anIntArray148[local48];
					@Pc(65) int local65 = local52 * (this.anInt870 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt870 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 + local84 >> 7;
					@Pc(108) int local108 = aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 - local94 >> 7;
					@Pc(129) boolean local129 = this.method589(1, true, 0, 0, local101, 0, 0, local108, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
					if (local129) {
						this.aClass3_Sub1_Sub2_8.method190(local21);
						this.aClass3_Sub1_Sub2_8.method190(local28);
						this.aClass3_Sub1_Sub2_8.method191(this.anInt873);
						this.aClass3_Sub1_Sub2_8.method190(57);
						this.aClass3_Sub1_Sub2_8.method190(this.anInt921);
						this.aClass3_Sub1_Sub2_8.method190(this.anInt870);
						this.aClass3_Sub1_Sub2_8.method190(89);
						this.aClass3_Sub1_Sub2_8.method191(aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330);
						this.aClass3_Sub1_Sub2_8.method191(aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331);
						this.aClass3_Sub1_Sub2_8.method190(this.anInt1053);
						this.aClass3_Sub1_Sub2_8.method190(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("97580, " + false + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)Ljava/lang/String;")
	private String method613() {
		try {
			this.aBoolean233 &= true;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("32396, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method614(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt845 += 0;
			if (aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 >> 7 == this.anInt994 && aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 >> 7 == this.anInt995) {
				this.anInt994 = 0;
				anInt1025++;
				if (anInt1025 > 96) {
					anInt1025 = 0;
					this.aClass3_Sub1_Sub2_8.method189(35, 132);
				}
			}
			@Pc(41) int local41 = this.anInt969;
			if (arg0) {
				local41 = 1;
			}
			for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
				@Pc(53) Class3_Sub1_Sub1_Sub2_Sub1 local53;
				@Pc(58) int local58;
				if (arg0) {
					local53 = aClass3_Sub1_Sub1_Sub2_Sub1_1;
					local58 = this.anInt968 << 14;
				} else {
					local53 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local47]];
					local58 = this.anIntArray244[local47] << 14;
				}
				if (local53 != null && local53.method157()) {
					local53.aBoolean30 = false;
					if ((aBoolean237 && this.anInt969 > 50 || this.anInt969 > 200) && !arg0 && local53.anInt333 == local53.anInt327) {
						local53.aBoolean30 = true;
					}
					@Pc(109) int local109 = local53.anInt330 >> 7;
					@Pc(114) int local114 = local53.anInt331 >> 7;
					if (local109 >= 0 && local109 < 104 && local114 >= 0 && local114 < 104) {
						if (local53.aClass3_Sub1_Sub1_Sub1_2 == null || anInt1000 < local53.anInt150 || anInt1000 >= local53.anInt151) {
							if ((local53.anInt330 & 0x7F) == 64 && (local53.anInt331 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local109][local114] == this.anInt1029) {
									continue;
								}
								this.anIntArrayArray22[local109][local114] = this.anInt1029;
							}
							local53.anInt140 = this.method605(this.anInt1052, local53.anInt330, local53.anInt331);
							this.aClass34_1.method473(local53.anInt332, local53.anInt331, local53.aBoolean71, 60, local53, this.anInt1052, local53.anInt140, local53.anInt330, local58);
						} else {
							local53.aBoolean30 = false;
							local53.anInt140 = this.method605(this.anInt1052, local53.anInt330, local53.anInt331);
							this.aClass34_1.method474(local58, this.anInt1052, local53.anInt332, local53.anInt330, local53.anInt143, local53.anInt144, local53.anInt140, local53.anInt145, local53.anInt146, local53.anInt331, local53);
						}
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("99315, " + arg0 + ", " + 0 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)I")
	private int method615() {
		try {
			@Pc(3) int local3 = 3;
			this.anInt845 += 0;
			if (this.anInt1064 < 310) {
				@Pc(18) int local18 = this.anInt1061 >> 7;
				@Pc(23) int local23 = this.anInt1063 >> 7;
				@Pc(28) int local28 = aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 >> 7;
				@Pc(33) int local33 = aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1052][local18][local23] & 0x4) != 0) {
					local3 = this.anInt1052;
				}
				@Pc(55) int local55;
				if (local28 > local18) {
					local55 = local28 - local18;
				} else {
					local55 = local18 - local28;
				}
				@Pc(68) int local68;
				if (local33 > local23) {
					local68 = local33 - local23;
				} else {
					local68 = local23 - local33;
				}
				@Pc(83) int local83;
				@Pc(85) int local85;
				if (local55 > local68) {
					local83 = local68 * 65536 / local55;
					local85 = 32768;
					while (local18 != local28) {
						if (local18 < local28) {
							local18++;
						} else if (local18 > local28) {
							local18--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1052][local18][local23] & 0x4) != 0) {
							local3 = this.anInt1052;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1052][local18][local23] & 0x4) != 0) {
								local3 = this.anInt1052;
							}
						}
					}
				} else {
					local83 = local55 * 65536 / local68;
					local85 = 32768;
					while (local23 != local33) {
						if (local23 < local33) {
							local23++;
						} else if (local23 > local33) {
							local23--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1052][local18][local23] & 0x4) != 0) {
							local3 = this.anInt1052;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1052][local18][local23] & 0x4) != 0) {
								local3 = this.anInt1052;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1052][aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 >> 7][aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 >> 7] & 0x4) != 0) {
				local3 = this.anInt1052;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("24139, " + 0 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)I")
	private int method616() {
		try {
			@Pc(9) int local9 = this.method605(this.anInt1052, this.anInt1061, this.anInt1063);
			if (this.anInt1058 != 47691) {
				this.anInt846 = -1;
			}
			return local9 - this.anInt1062 >= 800 || (this.aByteArrayArrayArray8[this.anInt1052][this.anInt1061 >> 7][this.anInt1063 >> 7] & 0x4) == 0 ? 3 : this.anInt1052;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("79098, " + 47691 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method617() {
		try {
			if (this.aClass42_19 == null) {
				super.aClass42_2 = null;
				this.aClass42_6 = null;
				this.aClass42_4 = null;
				this.aClass42_3 = null;
				this.aClass42_5 = null;
				this.aClass42_16 = null;
				this.aClass42_17 = null;
				this.aClass42_18 = null;
				this.aClass42_22 = new Class42(128, 265, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_23 = new Class42(128, 265, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_19 = new Class42(509, 171, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_20 = new Class42(360, 132, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_21 = new Class42(360, 200, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_24 = new Class42(202, 238, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_25 = new Class42(203, 238, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_26 = new Class42(74, 94, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_27 = new Class42(75, 94, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				if (this.aClass13_2 != null) {
					this.method717();
					this.method712();
				}
				this.aBoolean248 = true;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("36258, " + 2484 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method582(@OriginalArg(0) boolean arg0) {
		try {
			if (!this.aBoolean229 && !this.aBoolean232 && !this.aBoolean227) {
				anInt1000++;
				this.aBoolean233 &= arg0;
				if (this.aBoolean233) {
					this.method720();
				} else {
					this.method647();
				}
				this.method657();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("29250, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method618() {
		try {
			@Pc(29) int local29;
			@Pc(42) int local42;
			@Pc(46) int local46;
			@Pc(50) int local50;
			@Pc(98) int local98;
			@Pc(112) int local112;
			@Pc(124) int local124;
			@Pc(183) int local183;
			try {
				this.anInt878 = -1;
				this.aClass50_12.method575();
				this.aClass50_10.method575();
				Class3_Sub1_Sub4_Sub2.method365();
				this.method604();
				this.aClass34_1.method462();
				System.gc();
				for (local29 = 0; local29 < 4; local29++) {
					this.aClass22Array1[local29].method283();
				}
				for (local42 = 0; local42 < 4; local42++) {
					for (local46 = 0; local46 < 104; local46++) {
						for (local50 = 0; local50 < 104; local50++) {
							this.aByteArrayArrayArray8[local42][local46][local50] = 0;
						}
					}
				}
				@Pc(84) Class4 local84 = new Class4(104, this.anIntArrayArrayArray7, false, this.aByteArrayArrayArray8, 104);
				local50 = this.aByteArrayArray5.length;
				this.aClass3_Sub1_Sub2_8.method189(58, 132);
				@Pc(245) int local245;
				@Pc(233) int local233;
				if (!this.aBoolean234) {
					@Pc(129) byte[] local129;
					for (local98 = 0; local98 < local50; local98++) {
						local112 = (this.anIntArray257[local98] >> 8) * 64 - this.anInt896;
						local124 = (this.anIntArray257[local98] & 0xFF) * 64 - this.anInt897;
						local129 = this.aByteArrayArray5[local98];
						if (local129 != null) {
							local84.method81(local129, local112, this.aClass22Array1, local124, (this.anInt854 - 6) * 8, (this.anInt853 - 6) * 8);
						}
					}
					for (local112 = 0; local112 < local50; local112++) {
						local124 = (this.anIntArray257[local112] >> 8) * 64 - this.anInt896;
						local183 = (this.anIntArray257[local112] & 0xFF) * 64 - this.anInt897;
						@Pc(188) byte[] local188 = this.aByteArrayArray5[local112];
						if (local188 == null && this.anInt854 < 800) {
							local84.method89(64, 719, local124, local183, 64);
						}
					}
					this.aClass3_Sub1_Sub2_8.method189(58, 132);
					for (local124 = 0; local124 < local50; local124++) {
						local129 = this.aByteArrayArray6[local124];
						if (local129 != null) {
							local233 = (this.anIntArray257[local124] >> 8) * 64 - this.anInt896;
							local245 = (this.anIntArray257[local124] & 0xFF) * 64 - this.anInt897;
							local84.method73(local245, this.aClass22Array1, this.aClass34_1, local233, local129);
						}
					}
				}
				if (this.aBoolean234) {
					local98 = 0;
					label250: while (true) {
						@Pc(304) int local304;
						@Pc(310) int local310;
						@Pc(320) int local320;
						@Pc(322) int local322;
						if (local98 >= 4) {
							for (local112 = 0; local112 < 13; local112++) {
								for (local124 = 0; local124 < 13; local124++) {
									local183 = this.anIntArrayArrayArray8[0][local112][local124];
									if (local183 == -1) {
										local84.method89(8, 719, local112 * 8, local124 * 8, 8);
									}
								}
							}
							this.aClass3_Sub1_Sub2_8.method189(58, 132);
							local124 = 0;
							while (true) {
								if (local124 >= 4) {
									break label250;
								}
								for (local183 = 0; local183 < 13; local183++) {
									for (local233 = 0; local233 < 13; local233++) {
										local245 = this.anIntArrayArrayArray8[local124][local183][local233];
										if (local245 != -1) {
											local304 = local245 >> 24 & 0x3;
											local310 = local245 >> 1 & 0x3;
											local320 = local245 >> 14 & 0x3FF;
											local322 = local245 >> 3 & 0x7FF;
											@Pc(485) int local485 = (local320 / 8 << 8) + local322 / 8;
											for (@Pc(487) int local487 = 0; local487 < this.anIntArray257.length; local487++) {
												if (this.anIntArray257[local487] == local485 && this.aByteArrayArray6[local487] != null) {
													local84.method74(local304, local233 * 8, (local322 & 0x7) * 8, local183 * 8, this.aClass22Array1, local310, (local320 & 0x7) * 8, (byte) 3, this.aClass34_1, this.aByteArrayArray6[local487], local124);
													break;
												}
											}
										}
									}
								}
								local124++;
							}
						}
						for (local112 = 0; local112 < 13; local112++) {
							for (local124 = 0; local124 < 13; local124++) {
								local183 = this.anIntArrayArrayArray8[local98][local112][local124];
								if (local183 != -1) {
									local233 = local183 >> 24 & 0x3;
									local245 = local183 >> 1 & 0x3;
									local304 = local183 >> 14 & 0x3FF;
									local310 = local183 >> 3 & 0x7FF;
									local320 = (local304 / 8 << 8) + local310 / 8;
									for (local322 = 0; local322 < this.anIntArray257.length; local322++) {
										if (this.anIntArray257[local322] == local320 && this.aByteArrayArray5[local322] != null) {
											local84.method82((local310 & 0x7) * 8, local233, this.aClass22Array1, local124 * 8, local112 * 8, this.aByteArrayArray5[local322], local98, local245, (local304 & 0x7) * 8);
											break;
										}
									}
								}
							}
						}
						local98++;
					}
				}
				this.aClass3_Sub1_Sub2_8.method189(58, 132);
				local84.method88(this.aClass22Array1, this.aClass34_1);
				if (this.aClass42_5 != null) {
					this.aClass42_5.method541();
					Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
				}
				this.aClass3_Sub1_Sub2_8.method189(58, 132);
				local98 = Class4.anInt161;
				if (local98 > this.anInt1052) {
					local98 = this.anInt1052;
				}
				if (local98 < this.anInt1052 - 1) {
					local98 = this.anInt1052 - 1;
				}
				if (aBoolean237) {
					this.aClass34_1.method463(Class4.anInt161);
				} else {
					this.aClass34_1.method463(0);
				}
				for (local112 = 0; local112 < 104; local112++) {
					for (local124 = 0; local124 < 104; local124++) {
						this.method718(local112, local124);
					}
				}
				this.method619();
			} catch (@Pc(636) Exception local636) {
			}
			Class19.aClass36_4.method515();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass3_Sub1_Sub2_8.method189(173, 132);
				this.aClass3_Sub1_Sub2_8.method194(1057001181);
			}
			if (aBoolean237 && signlink.aRandomAccessFile3 != null) {
				local29 = this.aClass8_Sub1_1.method130(anInt876, 0);
				for (local42 = 0; local42 < local29; local42++) {
					local46 = this.aClass8_Sub1_1.method125(local42);
					if ((local46 & 0x79) == 0) {
						Class3_Sub1_Sub1_Sub1.method21(local42);
					}
				}
			}
			System.gc();
			Class3_Sub1_Sub4_Sub2.method366();
			this.aClass8_Sub1_1.method129(this.anInt1054);
			local29 = (this.anInt853 - 6) / 8 - 1;
			local42 = (this.anInt853 + 6) / 8 + 1;
			local46 = (this.anInt854 - 6) / 8 - 1;
			local50 = (this.anInt854 + 6) / 8 + 1;
			if (this.aBoolean231) {
				local29 = 49;
				local42 = 50;
				local46 = 49;
				local50 = 50;
			}
			for (local98 = local29; local98 <= local42; local98++) {
				for (local112 = local46; local112 <= local50; local112++) {
					if (local98 == local29 || local98 == local42 || local112 == local46 || local112 == local50) {
						local124 = this.aClass8_Sub1_1.method126(local112, local98, 0, 949);
						if (local124 != -1) {
							this.aClass8_Sub1_1.method121(3, local124);
						}
						local183 = this.aClass8_Sub1_1.method126(local112, local98, 1, 949);
						if (local183 != -1) {
							this.aClass8_Sub1_1.method121(3, local183);
						}
					}
				}
			}
		} catch (@Pc(801) RuntimeException local801) {
			signlink.reporterror("35492, " + false + ", " + local801.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method619() {
		try {
			if (this.aByte43 != 33) {
				this.anInt846 = -1;
			}
			for (@Pc(13) Class3_Sub3 local13 = (Class3_Sub3) this.aClass50_11.method571(); local13 != null; local13 = (Class3_Sub3) this.aClass50_11.method573((byte) 3)) {
				if (local13.anInt415 == -1) {
					local13.anInt419 = 0;
					this.method678(local13);
				} else {
					local13.method559();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("49916, " + 33 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(17) int local17 = this.aClass34_1.method488(arg0, arg1, arg4);
			@Pc(27) int local27;
			@Pc(33) int local33;
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(61) int local61;
			@Pc(67) int local67;
			if (local17 != 0) {
				local27 = this.aClass34_1.method492(arg0, arg1, arg4, local17);
				local33 = local27 >> 6 & 0x3;
				local37 = local27 & 0x1F;
				local39 = arg3;
				if (local17 > 0) {
					local39 = arg2;
				}
				@Pc(47) int[] local47 = this.aClass3_Sub1_Sub4_Sub4_8.anIntArray175;
				local61 = arg1 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local67 = local17 >> 14 & 0x7FFF;
				@Pc(70) Class19 local70 = Class19.method182(local67);
				if (local70.anInt391 == -1) {
					if (local37 == 0 || local37 == 2) {
						if (local33 == 0) {
							local47[local61] = local39;
							local47[local61 + 512] = local39;
							local47[local61 + 1024] = local39;
							local47[local61 + 1536] = local39;
						} else if (local33 == 1) {
							local47[local61] = local39;
							local47[local61 + 1] = local39;
							local47[local61 + 2] = local39;
							local47[local61 + 3] = local39;
						} else if (local33 == 2) {
							local47[local61 + 3] = local39;
							local47[local61 + 3 + 512] = local39;
							local47[local61 + 3 + 1024] = local39;
							local47[local61 + 3 + 1536] = local39;
						} else if (local33 == 3) {
							local47[local61 + 1536] = local39;
							local47[local61 + 1536 + 1] = local39;
							local47[local61 + 1536 + 2] = local39;
							local47[local61 + 1536 + 3] = local39;
						}
					}
					if (local37 == 3) {
						if (local33 == 0) {
							local47[local61] = local39;
						} else if (local33 == 1) {
							local47[local61 + 3] = local39;
						} else if (local33 == 2) {
							local47[local61 + 3 + 1536] = local39;
						} else if (local33 == 3) {
							local47[local61 + 1536] = local39;
						}
					}
					if (local37 == 2) {
						if (local33 == 3) {
							local47[local61] = local39;
							local47[local61 + 512] = local39;
							local47[local61 + 1024] = local39;
							local47[local61 + 1536] = local39;
						} else if (local33 == 0) {
							local47[local61] = local39;
							local47[local61 + 1] = local39;
							local47[local61 + 2] = local39;
							local47[local61 + 3] = local39;
						} else if (local33 == 1) {
							local47[local61 + 3] = local39;
							local47[local61 + 3 + 512] = local39;
							local47[local61 + 3 + 1024] = local39;
							local47[local61 + 3 + 1536] = local39;
						} else if (local33 == 2) {
							local47[local61 + 1536] = local39;
							local47[local61 + 1536 + 1] = local39;
							local47[local61 + 1536 + 2] = local39;
							local47[local61 + 1536 + 3] = local39;
						}
					}
				} else {
					@Pc(80) Class3_Sub1_Sub4_Sub1 local80 = this.aClass3_Sub1_Sub4_Sub1Array2[local70.anInt391];
					if (local80 != null) {
						@Pc(92) int local92 = (local70.anInt375 * 4 - local80.anInt468) / 2;
						@Pc(102) int local102 = (local70.anInt381 * 4 - local80.anInt469) / 2;
						local80.method281(arg1 * 4 + local92 + 48, (104 - arg4 - local70.anInt381) * 4 + 48 + local102);
					}
				}
			}
			local17 = this.aClass34_1.method490(arg0, arg1, arg4);
			if (local17 != 0) {
				local27 = this.aClass34_1.method492(arg0, arg1, arg4, local17);
				local33 = local27 >> 6 & 0x3;
				local37 = local27 & 0x1F;
				local39 = local17 >> 14 & 0x7FFF;
				@Pc(456) Class19 local456 = Class19.method182(local39);
				@Pc(488) int local488;
				if (local456.anInt391 != -1) {
					@Pc(466) Class3_Sub1_Sub4_Sub1 local466 = this.aClass3_Sub1_Sub4_Sub1Array2[local456.anInt391];
					if (local466 != null) {
						local67 = (local456.anInt375 * 4 - local466.anInt468) / 2;
						local488 = (local456.anInt381 * 4 - local466.anInt469) / 2;
						local466.method281(arg1 * 4 + local67 + 48, (104 - arg4 - local456.anInt381) * 4 + 48 + local488);
					}
				} else if (local37 == 9) {
					local61 = 15658734;
					if (local17 > 0) {
						local61 = 15597568;
					}
					@Pc(525) int[] local525 = this.aClass3_Sub1_Sub4_Sub4_8.anIntArray175;
					local488 = arg1 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local33 == 0 || local33 == 2) {
						local525[local488 + 1536] = local61;
						local525[local488 + 1024 + 1] = local61;
						local525[local488 + 512 + 2] = local61;
						local525[local488 + 3] = local61;
					} else {
						local525[local488] = local61;
						local525[local488 + 512 + 1] = local61;
						local525[local488 + 1024 + 2] = local61;
						local525[local488 + 1536 + 3] = local61;
					}
				}
			}
			local17 = this.aClass34_1.method491(arg0, arg1, arg4);
			if (local17 != 0) {
				local27 = local17 >> 14 & 0x7FFF;
				@Pc(620) Class19 local620 = Class19.method182(local27);
				if (local620.anInt391 != -1) {
					@Pc(630) Class3_Sub1_Sub4_Sub1 local630 = this.aClass3_Sub1_Sub4_Sub1Array2[local620.anInt391];
					if (local630 != null) {
						local39 = (local620.anInt375 * 4 - local630.anInt468) / 2;
						@Pc(652) int local652 = (local620.anInt381 * 4 - local630.anInt469) / 2;
						local630.method281(arg1 * 4 + local39 + 48, (104 - arg4 - local620.anInt381) * 4 + 48 + local652);
						return;
					}
				}
			}
		} catch (@Pc(676) RuntimeException local676) {
			signlink.reporterror("94358, " + arg0 + ", " + arg1 + ", " + 586 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local676.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method621() {
		try {
			if (this.anInt1028 == 2) {
				for (@Pc(15) Class3_Sub3 local15 = (Class3_Sub3) this.aClass50_11.method571(); local15 != null; local15 = (Class3_Sub3) this.aClass50_11.method573((byte) 3)) {
					if (local15.anInt415 > 0) {
						local15.anInt415--;
					}
					if (local15.anInt415 != 0) {
						if (local15.anInt419 > 0) {
							local15.anInt419--;
						}
						if (local15.anInt419 == 0 && local15.anInt413 >= 1 && local15.anInt414 >= 1 && local15.anInt413 <= 102 && local15.anInt414 <= 102 && (local15.anInt416 < 0 || Class4.method75(local15.anInt418, local15.anInt416))) {
							this.method698(local15.anInt417, local15.anInt412, local15.anInt413, local15.anInt418, local15.anInt411, local15.anInt414, local15.anInt416);
							local15.anInt419 = -1;
							if (local15.anInt416 == local15.anInt408 && local15.anInt408 == -1) {
								local15.method559();
							} else if (local15.anInt416 == local15.anInt408 && local15.anInt417 == local15.anInt409 && local15.anInt418 == local15.anInt410) {
								local15.method559();
							}
						}
					} else if (local15.anInt408 < 0 || Class4.method75(local15.anInt410, local15.anInt408)) {
						this.method698(local15.anInt409, local15.anInt412, local15.anInt413, local15.anInt410, local15.anInt411, local15.anInt414, local15.anInt408);
						local15.method559();
					}
				}
				anInt917++;
				if (anInt917 > 1896) {
					anInt917 = 0;
					this.aClass3_Sub1_Sub2_8.method189(119, 132);
					this.aClass3_Sub1_Sub2_8.method190(0);
					@Pc(178) int local178 = this.aClass3_Sub1_Sub2_8.anInt429;
					this.aClass3_Sub1_Sub2_8.method191((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub2_8.method191((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub2_8.method190(245);
					this.aClass3_Sub1_Sub2_8.method191(25901);
					this.aClass3_Sub1_Sub2_8.method190((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub2_8.method190(130);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub2_8.method190(74);
					}
					this.aClass3_Sub1_Sub2_8.method191(64410);
					this.aClass3_Sub1_Sub2_8.method190(239);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub2_8.method191(62571);
					}
					this.aClass3_Sub1_Sub2_8.method199(this.aClass3_Sub1_Sub2_8.anInt429 - local178);
					return;
				}
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("55881, " + 8 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method585(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean248 = true;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("70749, " + 856 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method622() {
		try {
			if (super.anInt838 == 1) {
				if (super.anInt839 >= 6 && super.anInt839 <= 106 && super.anInt840 >= 467 && super.anInt840 <= 499) {
					this.anInt991 = (this.anInt991 + 1) % 4;
					this.aBoolean243 = true;
					this.aBoolean255 = true;
					this.aClass3_Sub1_Sub2_8.method189(124, 132);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt991);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt905);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt1070);
				}
				if (super.anInt839 >= 135 && super.anInt839 <= 235 && super.anInt840 >= 467 && super.anInt840 <= 499) {
					this.anInt905 = (this.anInt905 + 1) % 3;
					this.aBoolean243 = true;
					this.aBoolean255 = true;
					this.aClass3_Sub1_Sub2_8.method189(124, 132);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt991);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt905);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt1070);
				}
				if (super.anInt839 >= 273 && super.anInt839 <= 373 && super.anInt840 >= 467 && super.anInt840 <= 499) {
					this.anInt1070 = (this.anInt1070 + 1) % 3;
					this.aBoolean243 = true;
					this.aBoolean255 = true;
					this.aClass3_Sub1_Sub2_8.method189(124, 132);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt991);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt905);
					this.aClass3_Sub1_Sub2_8.method190(this.anInt1070);
				}
				if (super.anInt839 >= 412 && super.anInt839 <= 512 && super.anInt840 >= 467 && super.anInt840 <= 499) {
					if (this.anInt868 == -1) {
						this.method629((byte) 6);
						this.aString30 = "";
						this.aBoolean235 = false;
						this.anInt1002 = this.anInt868 = Class15.anInt286;
						return;
					}
					this.method594(0, "", "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("69064, " + 6 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean229 || this.aBoolean232 || this.aBoolean227) {
				this.method638();
			} else {
				anInt945++;
				if (this.aBoolean233) {
					this.method709();
				} else {
					this.method626(false);
				}
				this.anInt1004 = 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("55471, " + 725 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method623() {
		try {
			for (@Pc(6) Class3_Sub1_Sub1_Sub4 local6 = (Class3_Sub1_Sub1_Sub4) this.aClass50_12.method571(); local6 != null; local6 = (Class3_Sub1_Sub1_Sub4) this.aClass50_12.method573((byte) 3)) {
				if (local6.anInt589 != this.anInt1052 || local6.aBoolean156) {
					local6.method559();
				} else if (anInt1000 >= local6.anInt586) {
					local6.method392(this.anInt907);
					if (local6.aBoolean156) {
						local6.method559();
					} else {
						this.aClass34_1.method473(0, local6.anInt591, false, 60, local6, local6.anInt589, local6.anInt592, local6.anInt590, -1);
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("30232, " + -1669 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method624(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(15) int local15 = 0; local15 < this.anInt1056; local15++) {
					if (this.aLongArray3[local15] == arg0) {
						this.anInt1056--;
						this.aBoolean253 = true;
						for (@Pc(35) int local35 = local15; local35 < this.anInt1056; local35++) {
							this.aStringArray9[local35] = this.aStringArray9[local35 + 1];
							this.anIntArray233[local35] = this.anIntArray233[local35 + 1];
							this.aLongArray3[local35] = this.aLongArray3[local35 + 1];
						}
						this.aClass3_Sub1_Sub2_8.method189(223, 132);
						this.aClass3_Sub1_Sub2_8.method196(arg0, this.aByte42);
						return;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("82644, " + 0 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method625() {
		try {
			try {
				@Pc(16) int local16 = aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 + this.anInt957;
				@Pc(22) int local22 = aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 + this.anInt1039;
				if (this.anInt1019 - local16 < -500 || this.anInt1019 - local16 > 500 || this.anInt1020 - local22 < -500 || this.anInt1020 - local22 > 500) {
					this.anInt1019 = local16;
					this.anInt1020 = local22;
				}
				if (this.anInt1019 != local16) {
					this.anInt1019 += (local16 - this.anInt1019) / 16;
				}
				if (this.anInt1020 != local22) {
					this.anInt1020 += (local22 - this.anInt1020) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt874 += (-this.anInt874 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt874 += (24 - this.anInt874) / 2;
				} else {
					this.anInt874 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt875 += (12 - this.anInt875) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt875 += (-this.anInt875 - 12) / 2;
				} else {
					this.anInt875 /= 2;
				}
				this.anInt873 = this.anInt873 + this.anInt874 / 2 & 0x7FF;
				this.anInt872 += this.anInt875 / 2;
				if (this.anInt872 < 128) {
					this.anInt872 = 128;
				}
				if (this.anInt872 > 383) {
					this.anInt872 = 383;
				}
				@Pc(209) int local209 = this.anInt1019 >> 7;
				@Pc(214) int local214 = this.anInt1020 >> 7;
				@Pc(224) int local224 = this.method605(this.anInt1052, this.anInt1019, this.anInt1020);
				@Pc(226) int local226 = 0;
				@Pc(242) int local242;
				if (local209 > 3 && local214 > 3 && local209 < 100 && local214 < 100) {
					for (local242 = local209 - 4; local242 <= local209 + 4; local242++) {
						for (@Pc(248) int local248 = local214 - 4; local248 <= local214 + 4; local248++) {
							@Pc(253) int local253 = this.anInt1052;
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
				if (local242 > this.anInt926) {
					this.anInt926 += (local242 - this.anInt926) / 24;
				} else if (local242 < this.anInt926) {
					this.anInt926 += (local242 - this.anInt926) / 80;
				}
			} catch (@Pc(344) Exception local344) {
				signlink.reporterror("glfc_ex " + aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 + "," + aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 + "," + this.anInt1019 + "," + this.anInt1020 + "," + this.anInt853 + "," + this.anInt854 + "," + this.anInt896 + "," + this.anInt897);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("88357, " + -800 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method626(@OriginalArg(0) boolean arg0) {
		try {
			this.method617();
			this.aClass42_21.method541();
			this.aClass3_Sub1_Sub4_Sub1_17.method281(0, 0);
			@Pc(53) byte local53;
			@Pc(65) int local65;
			if (this.anInt1026 == 0) {
				this.aClass3_Sub1_Sub4_Sub3_2.method416(this.aClass8_Sub1_1.aString4, 180, true, 180, 7711145);
				local53 = 80;
				this.aClass3_Sub1_Sub4_Sub3_4.method416("Welcome to RuneScape", 80, true, 180, 16776960);
				local65 = local53 + 30;
				this.aClass3_Sub1_Sub4_Sub1_18.method281(27, 100);
				this.aClass3_Sub1_Sub4_Sub3_4.method416("New User", 125, true, 100, 16777215);
				this.aClass3_Sub1_Sub4_Sub1_18.method281(187, 100);
				this.aClass3_Sub1_Sub4_Sub3_4.method416("Existing User", 125, true, 260, 16777215);
			}
			if (this.anInt1026 == 2) {
				local53 = 60;
				if (this.aString26.length() > 0) {
					this.aClass3_Sub1_Sub4_Sub3_4.method416(this.aString26, 45, true, 180, 16776960);
					this.aClass3_Sub1_Sub4_Sub3_4.method416(this.aString27, 60, true, 180, 16776960);
					local65 = local53 + 30;
				} else {
					this.aClass3_Sub1_Sub4_Sub3_4.method416(this.aString27, 53, true, 180, 16776960);
					local65 = local53 + 30;
				}
				this.aClass3_Sub1_Sub4_Sub3_4.method423(90, 16777215, true, "Username: " + this.aString28 + (this.anInt937 == 0 & anInt1000 % 40 < 20 ? "@yel@|" : ""), 90);
				local65 += 15;
				this.aClass3_Sub1_Sub4_Sub3_4.method423(92, 16777215, true, "Password: " + Class43.method549(this.anInt966, this.aString29) + (this.anInt937 == 1 & anInt1000 % 40 < 20 ? "@yel@|" : ""), 105);
				local65 += 15;
				if (!arg0) {
					this.aClass3_Sub1_Sub4_Sub1_18.method281(27, 130);
					this.aClass3_Sub1_Sub4_Sub3_4.method416("Login", 155, true, 100, 16777215);
					this.aClass3_Sub1_Sub4_Sub1_18.method281(187, 130);
					this.aClass3_Sub1_Sub4_Sub3_4.method416("Cancel", 155, true, 260, 16777215);
				}
			}
			if (this.anInt1026 == 3) {
				this.aClass3_Sub1_Sub4_Sub3_4.method416("Create a free account", 40, true, 180, 16776960);
				local53 = 65;
				this.aClass3_Sub1_Sub4_Sub3_4.method416("To create a new account you need to", 65, true, 180, 16777215);
				local65 = local53 + 15;
				this.aClass3_Sub1_Sub4_Sub3_4.method416("go back to the main RuneScape webpage", 80, true, 180, 16777215);
				local65 += 15;
				this.aClass3_Sub1_Sub4_Sub3_4.method416("and choose the 'create account'", 95, true, 180, 16777215);
				local65 += 15;
				this.aClass3_Sub1_Sub4_Sub3_4.method416("button near the top of that page.", 110, true, 180, 16777215);
				local65 += 15;
				this.aClass3_Sub1_Sub4_Sub1_18.method281(107, 130);
				this.aClass3_Sub1_Sub4_Sub3_4.method416("Cancel", 155, true, 180, 16777215);
			}
			this.aClass42_21.method542(171, super.aGraphics2, 202);
			if (this.aBoolean248) {
				this.aBoolean248 = false;
				this.aClass42_19.method542(0, super.aGraphics2, 128);
				this.aClass42_20.method542(371, super.aGraphics2, 202);
				this.aClass42_24.method542(265, super.aGraphics2, 0);
				this.aClass42_25.method542(265, super.aGraphics2, 562);
				this.aClass42_26.method542(171, super.aGraphics2, 128);
				this.aClass42_27.method542(171, super.aGraphics2, 562);
			}
		} catch (@Pc(499) RuntimeException local499) {
			signlink.reporterror("33054, " + arg0 + ", " + -474 + ", " + local499.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method627(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1 && arg0 != 0L) {
				for (@Pc(11) int local11 = 0; local11 < this.anInt864; local11++) {
					if (this.aLongArray4[local11] == arg0) {
						this.anInt864--;
						this.aBoolean253 = true;
						for (@Pc(31) int local31 = local11; local31 < this.anInt864; local31++) {
							this.aLongArray4[local31] = this.aLongArray4[local31 + 1];
						}
						this.aClass3_Sub1_Sub2_8.method189(146, 132);
						this.aClass3_Sub1_Sub2_8.method196(arg0, this.aByte42);
						return;
					}
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("73730, " + arg0 + ", " + arg1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CHKMTWJC;ILclient!MLYYHULT;B)V")
	private void method628(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub2 arg3) {
		try {
			@Pc(14) int local14;
			if ((arg0 & 0x20) != 0) {
				local14 = arg3.method219();
				@Pc(17) byte[] local17 = new byte[local14];
				@Pc(23) Class3_Sub1_Sub2 local23 = new Class3_Sub1_Sub2(true, local17);
				arg3.method209(local14, local17);
				this.aClass3_Sub1_Sub2Array1[arg2] = local23;
				arg1.method68(local23);
			}
			if ((arg0 & 0x100) != 0) {
				arg1.anInt315 = arg3.method230(anInt908);
				local14 = arg3.method236();
				arg1.anInt319 = local14 >> 16;
				arg1.anInt318 = anInt1000 + (local14 & 0xFFFF);
				arg1.anInt316 = 0;
				arg1.anInt317 = 0;
				if (arg1.anInt318 > anInt1000) {
					arg1.anInt316 = -1;
				}
				if (arg1.anInt315 == 65535) {
					arg1.anInt315 = -1;
				}
			}
			@Pc(100) int local100;
			@Pc(112) int local112;
			if ((arg0 & 0x1) != 0) {
				local14 = arg3.method228();
				if (local14 == 65535) {
					local14 = -1;
				}
				local100 = arg3.method219();
				if (local14 == arg1.anInt356 && local14 != -1) {
					local112 = Class38.aClass38Array1[local14].anInt715;
					if (local112 == 1) {
						arg1.anInt357 = 0;
						arg1.anInt358 = 0;
						arg1.anInt359 = local100;
						arg1.anInt360 = 0;
					}
					if (local112 == 2) {
						arg1.anInt360 = 0;
					}
				} else if (local14 == -1 || arg1.anInt356 == -1 || Class38.aClass38Array1[local14].anInt709 >= Class38.aClass38Array1[arg1.anInt356].anInt709) {
					arg1.anInt356 = local14;
					arg1.anInt357 = 0;
					arg1.anInt358 = 0;
					arg1.anInt359 = local100;
					arg1.anInt360 = 0;
					arg1.anInt322 = arg1.anInt344;
				}
			}
			if ((arg0 & 0x2) != 0) {
				arg1.anInt353 = arg3.method202();
				arg1.anInt354 = arg3.method228();
			}
			if ((arg0 & 0x400) != 0) {
				arg1.anInt345 = arg3.method220();
				arg1.anInt347 = arg3.method221();
				arg1.anInt346 = arg3.method219();
				arg1.anInt348 = arg3.method219();
				arg1.anInt349 = arg3.method228() + anInt1000;
				arg1.anInt350 = arg3.method229() + anInt1000;
				arg1.anInt351 = arg3.method200();
				arg1.method156();
			}
			if ((arg0 & 0x8) != 0) {
				arg1.aString10 = arg3.method207();
				if (arg1.aString10.charAt(0) == '~') {
					arg1.aString10 = arg1.aString10.substring(1);
					this.method594(2, arg1.aString3, arg1.aString10);
				} else if (arg1 == aClass3_Sub1_Sub1_Sub2_Sub1_1) {
					this.method594(2, arg1.aString3, arg1.aString10);
				}
				arg1.anInt329 = 0;
				arg1.anInt321 = 0;
				arg1.anInt352 = 150;
			}
			if ((arg0 & 0x80) != 0) {
				arg1.anInt341 = arg3.method202();
				if (arg1.anInt341 == 65535) {
					arg1.anInt341 = -1;
				}
			}
			if ((arg0 & 0x200) != 0) {
				local14 = arg3.method200();
				local100 = arg3.method221();
				arg1.method155(local100, local14, anInt1000);
				arg1.anInt324 = anInt1000 + 300;
				arg1.anInt325 = arg3.method220();
				arg1.anInt326 = arg3.method221();
			}
			if ((arg0 & 0x40) != 0) {
				local14 = arg3.method230(anInt908);
				local100 = arg3.method200();
				local112 = arg3.method221();
				@Pc(344) int local344 = arg3.anInt429;
				if (arg1.aString3 != null && arg1.aBoolean28) {
					@Pc(354) long local354 = Class43.method544(arg1.aString3);
					@Pc(356) boolean local356 = false;
					if (local100 <= 1) {
						for (@Pc(361) int local361 = 0; local361 < this.anInt864; local361++) {
							if (this.aLongArray4[local361] == local354) {
								local356 = true;
								break;
							}
						}
					}
					if (!local356 && this.anInt951 == 0) {
						try {
							this.aClass3_Sub1_Sub2_7.anInt429 = 0;
							arg3.method239(this.aClass3_Sub1_Sub2_7.aByteArray14, local112);
							this.aClass3_Sub1_Sub2_7.anInt429 = 0;
							@Pc(406) String local406 = Class12.method136(this.aClass3_Sub1_Sub2_7, local112);
							@Pc(410) String local410 = Class24.method307(local406);
							arg1.aString10 = local410;
							arg1.anInt329 = local14 >> 8;
							arg1.anInt321 = local14 & 0xFF;
							arg1.anInt352 = 150;
							if (local100 == 2 || local100 == 3) {
								this.method594(1, "@cr2@" + arg1.aString3, local410);
							} else if (local100 == 1) {
								this.method594(1, "@cr1@" + arg1.aString3, local410);
							} else {
								this.method594(2, arg1.aString3, local410);
							}
						} catch (@Pc(474) Exception local474) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt429 = local344 + local112;
			}
			if ((arg0 & 0x10) != 0) {
				local14 = arg3.method221();
				local100 = arg3.method219();
				arg1.method155(local100, local14, anInt1000);
				arg1.anInt324 = anInt1000 + 300;
				arg1.anInt325 = arg3.method200();
				arg1.anInt326 = arg3.method221();
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("61680, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 51 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method629(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.aClass3_Sub1_Sub2_8.method189(211, 132);
			if (this.anInt1011 != -1) {
				this.method677(this.anInt1011);
				this.anInt1011 = -1;
				this.aBoolean253 = true;
				this.aBoolean247 = false;
				this.aBoolean251 = true;
			}
			if (this.anInt1046 != -1) {
				this.method677(this.anInt1046);
				this.anInt1046 = -1;
				this.aBoolean255 = true;
				this.aBoolean247 = false;
			}
			if (this.anInt942 != -1) {
				this.method677(this.anInt942);
				this.anInt942 = -1;
				this.aBoolean248 = true;
			}
			if (this.anInt877 != -1) {
				this.method677(this.anInt877);
				this.anInt877 = -1;
			}
			if (this.anInt868 != -1) {
				this.method677(this.anInt868);
				this.anInt868 = -1;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("1234, " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SWNASVGQ;III)V")
	private void method630(@OriginalArg(0) Class3_Sub1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = arg1 * arg1 + arg2 * arg2;
			if (local13 > 4225 && local13 < 90000) {
				@Pc(27) int local27 = this.anInt873 + this.anInt921 & 0x7FF;
				@Pc(31) int local31 = Class3_Sub1_Sub1_Sub1.anIntArray40[local27];
				@Pc(35) int local35 = Class3_Sub1_Sub1_Sub1.anIntArray41[local27];
				@Pc(44) int local44 = local31 * 256 / (this.anInt870 + 256);
				@Pc(53) int local53 = local35 * 256 / (this.anInt870 + 256);
				@Pc(63) int local63 = arg2 * local44 + arg1 * local53 >> 16;
				@Pc(73) int local73 = arg2 * local53 - arg1 * local44 >> 16;
				@Pc(79) double local79 = Math.atan2((double) local63, (double) local73);
				@Pc(85) int local85 = (int) (Math.sin(local79) * 63.0D);
				@Pc(91) int local91 = (int) (Math.cos(local79) * 57.0D);
				this.aClass3_Sub1_Sub4_Sub4_3.method454(local85 + 94 + 4 - 10, local79, (byte) 8, 83 - local91 - 20);
			} else {
				this.method662(arg1, arg2, arg0);
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("73574, " + arg0 + ", " + arg1 + ", " + -43513 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!HWEMRKQZ;)Z")
	private boolean method631(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt304;
			if (local11 >= 1 && local11 <= 200 || !(local11 < 701 || local11 > 900)) {
				if (local11 >= 801) {
					local11 -= 701;
				} else if (local11 >= 701) {
					local11 -= 601;
				} else if (local11 >= 101) {
					local11 -= 101;
				} else {
					local11--;
				}
				this.aStringArray14[this.anInt1047] = "Remove @whi@" + this.aStringArray9[local11];
				this.anIntArray219[this.anInt1047] = 526;
				this.anInt1047++;
				this.aStringArray14[this.anInt1047] = "Message @whi@" + this.aStringArray9[local11];
				this.anIntArray219[this.anInt1047] = 247;
				this.anInt1047++;
				return true;
			} else if (local11 >= 401 && local11 <= 500) {
				this.aStringArray14[this.anInt1047] = "Remove @whi@" + arg0.aString8;
				this.anIntArray219[this.anInt1047] = 212;
				this.anInt1047++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("12645, " + 7 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method632() {
		try {
			if (this.anInt993 != 0) {
				@Pc(9) Class3_Sub1_Sub4_Sub3 local9 = this.aClass3_Sub1_Sub4_Sub3_3;
				@Pc(11) int local11 = 0;
				if (this.anInt947 != 0) {
					local11 = 1;
				}
				for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
					if (this.aStringArray12[local18] != null) {
						@Pc(30) int local30 = this.anIntArray242[local18];
						@Pc(35) String local35 = this.aStringArray11[local18];
						@Pc(37) byte local37 = 0;
						if (local35 != null && local35.startsWith("@cr1@")) {
							local35 = local35.substring(5);
							local37 = 1;
						}
						if (local35 != null && local35.startsWith("@cr2@")) {
							local35 = local35.substring(5);
							local37 = 2;
						}
						@Pc(88) int local88;
						if ((local30 == 3 || local30 == 7) && (local30 == 7 || this.anInt905 == 0 || this.anInt905 == 1 && this.method652((byte) 8, local35))) {
							local88 = 329 - local11 * 13;
							local9.method419(0, 4, local88, "From");
							local9.method419(65535, 4, local88 - 1, "From");
							@Pc(113) int local113 = local9.method417("From ") + 4;
							if (local37 == 1) {
								this.aClass3_Sub1_Sub4_Sub1Array4[0].method281(local113, local88 - 12);
								local113 += 14;
							}
							if (local37 == 2) {
								this.aClass3_Sub1_Sub4_Sub1Array4[1].method281(local113, local88 - 12);
								local113 += 14;
							}
							local9.method419(0, local113, local88, local35 + ": " + this.aStringArray12[local18]);
							local9.method419(65535, local113, local88 - 1, local35 + ": " + this.aStringArray12[local18]);
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
						if (local30 == 5 && this.anInt905 < 2) {
							local88 = 329 - local11 * 13;
							local9.method419(0, 4, local88, this.aStringArray12[local18]);
							local9.method419(65535, 4, local88 - 1, this.aStringArray12[local18]);
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
						if (local30 == 6 && this.anInt905 < 2) {
							local88 = 329 - local11 * 13;
							local9.method419(0, 4, local88, "To " + local35 + ": " + this.aStringArray12[local18]);
							local9.method419(65535, 4, local88 - 1, "To " + local35 + ": " + this.aStringArray12[local18]);
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("68745, " + -415 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!HWEMRKQZ;I)V")
	private void method633(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt304;
			@Pc(8) int local8 = 76 / arg1;
			@Pc(64) int local64;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local64 = this.anInt1056;
					if (this.anInt1057 != 2) {
						local64 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local64) {
						arg0.aString8 = "";
						arg0.anInt283 = 0;
					} else {
						if (this.anIntArray233[local4] == 0) {
							arg0.aString8 = "@red@Offline";
						} else if (this.anIntArray233[local4] < 200) {
							if (this.anIntArray233[local4] == anInt935) {
								arg0.aString8 = "@gre@World" + (this.anIntArray233[local4] - 9);
							} else {
								arg0.aString8 = "@yel@World" + (this.anIntArray233[local4] - 9);
							}
						} else if (this.anIntArray233[local4] == anInt935) {
							arg0.aString8 = "@gre@Classic" + (this.anIntArray233[local4] - 219);
						} else {
							arg0.aString8 = "@yel@Classic" + (this.anIntArray233[local4] - 219);
						}
						arg0.anInt283 = 1;
					}
				} else if (local4 == 203) {
					local64 = this.anInt1056;
					if (this.anInt1057 != 2) {
						local64 = 0;
					}
					arg0.anInt279 = local64 * 15 + 20;
					if (arg0.anInt279 <= arg0.anInt291) {
						arg0.anInt279 = arg0.anInt291 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt1057 == 0) {
						arg0.aString8 = "Loading ignore list";
						arg0.anInt283 = 0;
					} else if (local4 == 1 && this.anInt1057 == 0) {
						arg0.aString8 = "Please wait...";
						arg0.anInt283 = 0;
					} else {
						local64 = this.anInt864;
						if (this.anInt1057 == 0) {
							local64 = 0;
						}
						if (local4 >= local64) {
							arg0.aString8 = "";
							arg0.anInt283 = 0;
						} else {
							arg0.aString8 = Class43.method548(Class43.method545(this.aLongArray4[local4]));
							arg0.anInt283 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt279 = this.anInt864 * 15 + 20;
					if (arg0.anInt279 <= arg0.anInt291) {
						arg0.anInt279 = arg0.anInt291 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt272 = 150;
					arg0.anInt273 = (int) (Math.sin((double) anInt1000 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean257) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(377) int local377 = this.anIntArray230[local64];
							if (local377 >= 0 && !Class20.aClass20Array1[local377].method244()) {
								return;
							}
						}
						this.aBoolean257 = false;
						@Pc(396) Class3_Sub1_Sub1_Sub1[] local396 = new Class3_Sub1_Sub1_Sub1[7];
						@Pc(398) int local398 = 0;
						for (@Pc(400) int local400 = 0; local400 < 7; local400++) {
							@Pc(407) int local407 = this.anIntArray230[local400];
							if (local407 >= 0) {
								local396[local398++] = Class20.aClass20Array1[local407].method245();
							}
						}
						@Pc(429) Class3_Sub1_Sub1_Sub1 local429 = new Class3_Sub1_Sub1_Sub1(local396, local398, 337);
						for (@Pc(431) int local431 = 0; local431 < 5; local431++) {
							if (this.anIntArray231[local431] != 0) {
								local429.method36(anIntArrayArray24[local431][0], anIntArrayArray24[local431][this.anIntArray231[local431]]);
								if (local431 == 1) {
									local429.method36(anIntArray243[0], anIntArray243[this.anIntArray231[local431]]);
								}
							}
						}
						local429.method29();
						local429.method30(Class38.aClass38Array1[aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt327].anIntArray191[0]);
						local429.method39(64, 850, -30, -50, -30, true);
						arg0.anInt309 = 5;
						arg0.anInt310 = 0;
						Class15.method150(local429);
					}
				} else if (local4 == 324) {
					if (this.aClass3_Sub1_Sub4_Sub4_9 == null) {
						this.aClass3_Sub1_Sub4_Sub4_9 = arg0.aClass3_Sub1_Sub4_Sub4_1;
						this.aClass3_Sub1_Sub4_Sub4_10 = arg0.aClass3_Sub1_Sub4_Sub4_2;
					}
					if (this.aBoolean225) {
						arg0.aClass3_Sub1_Sub4_Sub4_1 = this.aClass3_Sub1_Sub4_Sub4_10;
					} else {
						arg0.aClass3_Sub1_Sub4_Sub4_1 = this.aClass3_Sub1_Sub4_Sub4_9;
					}
				} else if (local4 == 325) {
					if (this.aClass3_Sub1_Sub4_Sub4_9 == null) {
						this.aClass3_Sub1_Sub4_Sub4_9 = arg0.aClass3_Sub1_Sub4_Sub4_1;
						this.aClass3_Sub1_Sub4_Sub4_10 = arg0.aClass3_Sub1_Sub4_Sub4_2;
					}
					if (this.aBoolean225) {
						arg0.aClass3_Sub1_Sub4_Sub4_1 = this.aClass3_Sub1_Sub4_Sub4_9;
					} else {
						arg0.aClass3_Sub1_Sub4_Sub4_1 = this.aClass3_Sub1_Sub4_Sub4_10;
					}
				} else if (local4 == 600) {
					arg0.aString8 = this.aString30;
					if (anInt1000 % 20 < 10) {
						arg0.aString8 = arg0.aString8 + "|";
					} else {
						arg0.aString8 = arg0.aString8 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt1035 < 1) {
							arg0.aString8 = "";
						} else if (this.aBoolean235) {
							arg0.anInt305 = 16711680;
							arg0.aString8 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt305 = 16777215;
							arg0.aString8 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(636) String local636;
					if (local4 == 660) {
						local64 = this.anInt1006 - this.anInt952;
						if (local64 <= 0) {
							local636 = "earlier today";
						} else if (local64 == 1) {
							local636 = "yesterday";
						} else {
							local636 = local64 + " days ago";
						}
						arg0.aString8 = "You last logged in @red@" + local636 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt902 == 0) {
							arg0.aString8 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt902 <= this.anInt1006) {
							arg0.aString8 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method634(this.anInt902);
						} else {
							local64 = this.anInt1006 + 14 - this.anInt902;
							if (local64 <= 0) {
								local636 = "Earlier today";
							} else if (local64 == 1) {
								local636 = "Yesterday";
							} else {
								local636 = local64 + " days ago";
							}
							arg0.aString8 = local636 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method634(this.anInt902) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(754) String local754;
						if (this.anInt1072 == 0) {
							local754 = "@yel@0 unread messages";
						} else if (this.anInt1072 == 1) {
							local754 = "@gre@1 unread message";
						} else {
							local754 = "@gre@" + this.anInt1072 + " unread messages";
						}
						arg0.aString8 = "You have " + local754 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt1017 > 0 && this.anInt1017 <= this.anInt1006 + 10) {
							arg0.aString8 = "Last password change:\\n@gre@" + this.method634(this.anInt1017);
						} else {
							arg0.aString8 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt946 > 2 && !aBoolean236) {
							arg0.aString8 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt946 > 2) {
							arg0.aString8 = "\\n\\nYou have @gre@" + this.anInt946 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt946 > 0) {
							arg0.aString8 = "You have @gre@" + this.anInt946 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString8 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt946 > 2 && !aBoolean236) {
							arg0.aString8 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt946 > 0) {
							arg0.aString8 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString8 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt902 > this.anInt1006) {
							arg0.aString8 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString8 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt1057 == 0) {
				arg0.aString8 = "Loading friend list";
				arg0.anInt283 = 0;
			} else if (local4 == 1 && this.anInt1057 == 1) {
				arg0.aString8 = "Connecting to friendserver";
				arg0.anInt283 = 0;
			} else if (local4 == 2 && this.anInt1057 != 2) {
				arg0.aString8 = "Please wait...";
				arg0.anInt283 = 0;
			} else {
				local64 = this.anInt1056;
				if (this.anInt1057 != 2) {
					local64 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local64) {
					arg0.aString8 = "";
					arg0.anInt283 = 0;
				} else {
					arg0.aString8 = this.aStringArray9[local4];
					arg0.anInt283 = 1;
				}
			}
		} catch (@Pc(911) RuntimeException local911) {
			signlink.reporterror("73853, " + arg0 + ", " + arg1 + ", " + local911.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
	private String method634(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt1006 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(30) int local30 = local16.get(2);
			@Pc(34) int local34 = local16.get(1);
			@Pc(90) String[] local90 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local90[local30] + "-" + local34;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("35894, " + true + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIIIIII)V")
	private void method635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class3_Sub3 local1 = null;
			for (@Pc(6) Class3_Sub3 local6 = (Class3_Sub3) this.aClass50_11.method571(); local6 != null; local6 = (Class3_Sub3) this.aClass50_11.method573((byte) 3)) {
				if (local6.anInt411 == arg8 && local6.anInt413 == arg3 && local6.anInt414 == arg4 && local6.anInt412 == arg6) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class3_Sub3();
				local1.anInt411 = arg8;
				local1.anInt412 = arg6;
				local1.anInt413 = arg3;
				local1.anInt414 = arg4;
				this.method678(local1);
				this.aClass50_11.method568(local1);
			}
			local1.anInt416 = arg1;
			local1.anInt418 = arg0;
			local1.anInt417 = arg5;
			local1.anInt419 = arg7;
			local1.anInt415 = arg2;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("82513, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method637(@OriginalArg(0) int arg0) {
		try {
			this.anInt951 = 0;
			@Pc(10) int local10 = (aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 >> 7) + this.anInt896;
			@Pc(18) int local18 = (aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 >> 7) + this.anInt897;
			@Pc(22) boolean local22 = false;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt951 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt951 = 1;
			}
			if (this.anInt951 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt951 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("65294, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method638() {
		try {
			@Pc(4) Graphics local4 = this.method586().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method579();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean232) {
				this.aBoolean226 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local42 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local48 = local42 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(57) int local57 = local48 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(74) int local74 = local57 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(80) int local80 = local74 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(86) int local86 = local80 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(92) int local92 = local86 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean227) {
				this.aBoolean226 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean229) {
				this.aBoolean226 = false;
				local4.setColor(Color.yellow);
				local42 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local48 = local42 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local48 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local48 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local48 += 30;
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("90930, " + 49719 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!MLYYHULT;)V")
	private void method641(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			arg1.method210();
			@Pc(15) int local15 = arg1.method211(1);
			if (local15 != 0) {
				@Pc(23) int local23 = arg1.method211(2);
				if (local23 == 0) {
					this.anIntArray245[this.anInt970++] = this.anInt968;
				} else {
					@Pc(46) int local46;
					@Pc(56) int local56;
					if (local23 == 1) {
						local46 = arg1.method211(3);
						aClass3_Sub1_Sub1_Sub2_Sub1_1.method158(local46, false);
						local56 = arg1.method211(1);
						if (local56 == 1) {
							this.anIntArray245[this.anInt970++] = this.anInt968;
						}
					} else {
						@Pc(100) int local100;
						if (local23 == 2) {
							local46 = arg1.method211(3);
							aClass3_Sub1_Sub1_Sub2_Sub1_1.method158(local46, true);
							local56 = arg1.method211(3);
							aClass3_Sub1_Sub1_Sub2_Sub1_1.method158(local56, true);
							local100 = arg1.method211(1);
							if (local100 == 1) {
								this.anIntArray245[this.anInt970++] = this.anInt968;
							}
						} else if (local23 == 3) {
							local46 = arg1.method211(7);
							local56 = arg1.method211(7);
							this.anInt1052 = arg1.method211(2);
							local100 = arg1.method211(1);
							@Pc(145) int local145 = arg1.method211(1);
							if (local145 == 1) {
								this.anIntArray245[this.anInt970++] = this.anInt968;
							}
							aClass3_Sub1_Sub1_Sub2_Sub1_1.method159(local46, local56, local100 == 1);
						}
					}
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("17849, " + arg0 + ", " + -198 + ", " + arg1 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method642() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1036; local3++) {
				if (this.anIntArray272[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray226[local3] != this.anInt928 || this.anIntArray266[local3] != this.anInt920) {
							@Pc(45) Class3_Sub1_Sub2 local45 = Class2.method2((byte) 9, this.anIntArray266[local3], this.anIntArray226[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt429 / 22) > this.aLong33 + (long) (this.anInt983 / 22)) {
								this.anInt983 = local45.anInt429;
								this.aLong33 = System.currentTimeMillis();
								if (this.method700(local45.anInt429, local45.aByteArray14)) {
									this.anInt928 = this.anIntArray226[local3];
									this.anInt920 = this.anIntArray266[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method714()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray272[local3] != -5) {
						this.anIntArray272[local3] = -5;
					} else {
						this.anInt1036--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt1036; local111++) {
							this.anIntArray226[local111] = this.anIntArray226[local111 + 1];
							this.anIntArray266[local111] = this.anIntArray266[local111 + 1];
							this.anIntArray272[local111] = this.anIntArray272[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray272[local3]--;
				}
			}
			if (this.anInt978 > 0) {
				this.anInt978 -= 20;
				if (this.anInt978 < 0) {
					this.anInt978 = 0;
				}
				if (this.anInt978 == 0 && this.aBoolean221 && !aBoolean237) {
					this.anInt855 = this.anInt1041;
					this.aBoolean218 = true;
					this.aClass8_Sub1_1.method128(2, this.anInt855);
					return;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("69000, " + true + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method643() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt976);
			if (this.aClass8_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass8_Sub1_1.anInt227);
			}
			System.out.println("loop-cycle:" + anInt1000);
			System.out.println("draw-cycle:" + anInt945);
			System.out.println("ptype:" + this.anInt846);
			System.out.println("psize:" + this.anInt845);
			if (this.aClass16_1 != null) {
				this.aClass16_1.method166();
			}
			super.aBoolean214 = true;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("7564, " + -36 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method586() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("43543, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)Z")
	private boolean method644() {
		try {
			this.aBoolean233 &= true;
			if (this.aClass16_1 == null) {
				return false;
			}
			@Pc(2790) String local2790;
			@Pc(225) int local225;
			try {
				@Pc(16) int local16 = this.aClass16_1.method163();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt846 == -1) {
					this.aClass16_1.method164(this.aClass3_Sub1_Sub2_6.aByteArray14, 0, 1);
					this.anInt846 = this.aClass3_Sub1_Sub2_6.aByteArray14[0] & 0xFF;
					if (this.aClass32_2 != null) {
						this.anInt846 = this.anInt846 - this.aClass32_2.method397() & 0xFF;
					}
					this.anInt845 = Class47.anIntArray209[this.anInt846];
					local16--;
				}
				if (this.anInt845 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass16_1.method164(this.aClass3_Sub1_Sub2_6.aByteArray14, 0, 1);
					this.anInt845 = this.aClass3_Sub1_Sub2_6.aByteArray14[0] & 0xFF;
					local16--;
				}
				if (this.anInt845 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass16_1.method164(this.aClass3_Sub1_Sub2_6.aByteArray14, 0, 2);
					this.aClass3_Sub1_Sub2_6.anInt429 = 0;
					this.anInt845 = this.aClass3_Sub1_Sub2_6.method202();
					local16 -= 2;
				}
				if (local16 < this.anInt845) {
					return false;
				}
				this.aClass3_Sub1_Sub2_6.anInt429 = 0;
				this.aClass16_1.method164(this.aClass3_Sub1_Sub2_6.aByteArray14, 0, this.anInt845);
				this.anInt847 = 0;
				this.anInt950 = this.anInt949;
				this.anInt949 = this.anInt948;
				this.anInt948 = this.anInt846;
				if (this.anInt846 == 100) {
					this.anInt869 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt846 = -1;
					return true;
				}
				@Pc(174) int local174;
				if (this.anInt846 == 229) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					if (local174 == 65535) {
						local174 = -1;
					}
					if (local174 != this.anInt1041 && this.aBoolean221 && !aBoolean237 && this.anInt978 == 0) {
						this.anInt855 = local174;
						this.aBoolean218 = true;
						this.aClass8_Sub1_1.method128(2, this.anInt855);
					}
					this.anInt1041 = local174;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 22) {
					local174 = this.aClass3_Sub1_Sub2_6.method234();
					local225 = this.aClass3_Sub1_Sub2_6.method228();
					if (this.aBoolean221 && !aBoolean237) {
						this.anInt855 = local225;
						this.aBoolean218 = false;
						this.aClass8_Sub1_1.method128(2, this.anInt855);
						this.anInt978 = local174;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 192) {
					for (local174 = 0; local174 < this.anIntArray232.length; local174++) {
						if (this.anIntArray232[local174] != this.anIntArray262[local174]) {
							this.anIntArray232[local174] = this.anIntArray262[local174];
							this.method596(local174);
							this.aBoolean253 = true;
						}
					}
					this.anInt846 = -1;
					return true;
				}
				@Pc(311) int local311;
				@Pc(316) int local316;
				if (this.anInt846 == 56) {
					local174 = this.aClass3_Sub1_Sub2_6.method229();
					local225 = this.aClass3_Sub1_Sub2_6.method228();
					local311 = this.aClass3_Sub1_Sub2_6.method202();
					local316 = this.aClass3_Sub1_Sub2_6.method230(anInt908);
					Class15.method147(local311).anInt272 = local225;
					Class15.method147(local311).anInt273 = local174;
					Class15.method147(local311).anInt271 = local316;
					this.anInt846 = -1;
					return true;
				}
				@Pc(361) int local361;
				@Pc(347) Class15 local347;
				if (this.anInt846 == 89) {
					this.aBoolean253 = true;
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local347 = Class15.method147(local174);
					while (this.aClass3_Sub1_Sub2_6.anInt429 < this.anInt845) {
						local311 = this.aClass3_Sub1_Sub2_6.method214();
						local316 = this.aClass3_Sub1_Sub2_6.method202();
						local361 = this.aClass3_Sub1_Sub2_6.method200();
						if (local361 == 255) {
							local361 = this.aClass3_Sub1_Sub2_6.method205();
						}
						if (local311 >= 0 && local311 < local347.anIntArray106.length) {
							local347.anIntArray106[local311] = local316;
							local347.anIntArray112[local311] = local361;
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 190) {
					this.anInt947 = this.aClass3_Sub1_Sub2_6.method230(anInt908) * 30;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 40 || this.anInt846 == 2 || this.anInt846 == 255 || this.anInt846 == 65 || this.anInt846 == 175 || this.anInt846 == 146 || this.anInt846 == 121 || this.anInt846 == 250 || this.anInt846 == 126 || this.anInt846 == 164 || this.anInt846 == 198) {
					this.method650(this.anInt846, this.aClass3_Sub1_Sub2_6);
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 136) {
					@Pc(483) boolean local483 = this.aClass3_Sub1_Sub2_6.method221() == 1;
					local225 = this.aClass3_Sub1_Sub2_6.method202();
					Class15.method147(local225).aBoolean58 = local483;
					this.anInt846 = -1;
					return true;
				}
				@Pc(553) int local553;
				@Pc(836) int local836;
				@Pc(857) int local857;
				if (this.anInt846 == 152 || this.anInt846 == 20) {
					local174 = this.anInt853;
					local225 = this.anInt854;
					if (this.anInt846 == 152) {
						local225 = this.aClass3_Sub1_Sub2_6.method230(anInt908);
						local174 = this.aClass3_Sub1_Sub2_6.method230(anInt908);
						this.aBoolean234 = false;
					}
					if (this.anInt846 == 20) {
						this.aClass3_Sub1_Sub2_6.method210();
						local311 = 0;
						while (true) {
							if (local311 >= 4) {
								this.aClass3_Sub1_Sub2_6.method212();
								local174 = this.aClass3_Sub1_Sub2_6.method202();
								local225 = this.aClass3_Sub1_Sub2_6.method228();
								this.aBoolean234 = true;
								break;
							}
							for (local316 = 0; local316 < 13; local316++) {
								for (local361 = 0; local361 < 13; local361++) {
									local553 = this.aClass3_Sub1_Sub2_6.method211(1);
									if (local553 == 1) {
										this.anIntArrayArrayArray8[local311][local316][local361] = this.aClass3_Sub1_Sub2_6.method211(26);
									} else {
										this.anIntArrayArrayArray8[local311][local316][local361] = -1;
									}
								}
							}
							local311++;
						}
					}
					if (this.anInt853 == local174 && this.anInt854 == local225 && this.anInt1028 == 2) {
						this.anInt846 = -1;
						return true;
					}
					this.anInt853 = local174;
					this.anInt854 = local225;
					this.anInt896 = (this.anInt853 - 6) * 8;
					this.anInt897 = (this.anInt854 - 6) * 8;
					this.aBoolean231 = false;
					if ((this.anInt853 / 8 == 48 || this.anInt853 / 8 == 49) && this.anInt854 / 8 == 48) {
						this.aBoolean231 = true;
					}
					if (this.anInt853 / 8 == 48 && this.anInt854 / 8 == 148) {
						this.aBoolean231 = true;
					}
					this.anInt1028 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.method696("Loading - please wait.", null);
					if (this.anInt846 == 152) {
						local311 = 0;
						local316 = (this.anInt853 - 6) / 8;
						label1253: while (true) {
							if (local316 > (this.anInt853 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local311][];
								this.aByteArrayArray6 = new byte[local311][];
								this.anIntArray257 = new int[local311];
								this.anIntArray258 = new int[local311];
								this.anIntArray259 = new int[local311];
								local311 = 0;
								local361 = (this.anInt853 - 6) / 8;
								while (true) {
									if (local361 > (this.anInt853 + 6) / 8) {
										break label1253;
									}
									for (local553 = (this.anInt854 - 6) / 8; local553 <= (this.anInt854 + 6) / 8; local553++) {
										this.anIntArray257[local311] = (local361 << 8) + local553;
										if (this.aBoolean231 && (local553 == 49 || local553 == 149 || local553 == 147 || local361 == 50 || local361 == 49 && local553 == 47)) {
											this.anIntArray258[local311] = -1;
											this.anIntArray259[local311] = -1;
											local311++;
										} else {
											local836 = this.anIntArray258[local311] = this.aClass8_Sub1_1.method126(local553, local361, 0, 949);
											if (local836 != -1) {
												this.aClass8_Sub1_1.method128(3, local836);
											}
											local857 = this.anIntArray259[local311] = this.aClass8_Sub1_1.method126(local553, local361, 1, 949);
											if (local857 != -1) {
												this.aClass8_Sub1_1.method128(3, local857);
											}
											local311++;
										}
									}
									local361++;
								}
							}
							for (local361 = (this.anInt854 - 6) / 8; local361 <= (this.anInt854 + 6) / 8; local361++) {
								local311++;
							}
							local316++;
						}
					}
					if (this.anInt846 == 20) {
						local311 = 0;
						@Pc(893) int[] local893 = new int[676];
						local361 = 0;
						label1212: while (true) {
							@Pc(939) int local939;
							@Pc(923) int local923;
							@Pc(929) int local929;
							if (local361 >= 4) {
								this.aByteArrayArray5 = new byte[local311][];
								this.aByteArrayArray6 = new byte[local311][];
								this.anIntArray257 = new int[local311];
								this.anIntArray258 = new int[local311];
								this.anIntArray259 = new int[local311];
								local553 = 0;
								while (true) {
									if (local553 >= local311) {
										break label1212;
									}
									local836 = this.anIntArray257[local553] = local893[local553];
									local857 = local836 >> 8 & 0xFF;
									local923 = local836 & 0xFF;
									local929 = this.anIntArray258[local553] = this.aClass8_Sub1_1.method126(local923, local857, 0, 949);
									if (local929 != -1) {
										this.aClass8_Sub1_1.method128(3, local929);
									}
									local939 = this.anIntArray259[local553] = this.aClass8_Sub1_1.method126(local923, local857, 1, 949);
									if (local939 != -1) {
										this.aClass8_Sub1_1.method128(3, local939);
									}
									local553++;
								}
							}
							for (local553 = 0; local553 < 13; local553++) {
								for (local836 = 0; local836 < 13; local836++) {
									local857 = this.anIntArrayArrayArray8[local361][local553][local836];
									if (local857 != -1) {
										local923 = local857 >> 14 & 0x3FF;
										local929 = local857 >> 3 & 0x7FF;
										local939 = (local923 / 8 << 8) + local929 / 8;
										for (@Pc(941) int local941 = 0; local941 < local311; local941++) {
											if (local893[local941] == local939) {
												local939 = -1;
												break;
											}
										}
										if (local939 != -1) {
											local893[local311++] = local939;
										}
									}
								}
							}
							local361++;
						}
					}
					local311 = this.anInt896 - this.anInt898;
					local316 = this.anInt897 - this.anInt899;
					this.anInt898 = this.anInt896;
					this.anInt899 = this.anInt897;
					for (local361 = 0; local361 < 16384; local361++) {
						@Pc(1094) Class3_Sub1_Sub1_Sub2_Sub2 local1094 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local361];
						if (local1094 != null) {
							for (local836 = 0; local836 < 10; local836++) {
								local1094.anIntArray115[local836] -= local311;
								local1094.anIntArray116[local836] -= local316;
							}
							local1094.anInt330 -= local311 * 128;
							local1094.anInt331 -= local316 * 128;
						}
					}
					for (local553 = 0; local553 < this.anInt967; local553++) {
						@Pc(1149) Class3_Sub1_Sub1_Sub2_Sub1 local1149 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local553];
						if (local1149 != null) {
							for (local857 = 0; local857 < 10; local857++) {
								local1149.anIntArray115[local857] -= local311;
								local1149.anIntArray116[local857] -= local316;
							}
							local1149.anInt330 -= local311 * 128;
							local1149.anInt331 -= local316 * 128;
						}
					}
					this.aBoolean258 = true;
					@Pc(1201) byte local1201 = 0;
					@Pc(1203) byte local1203 = 104;
					@Pc(1205) byte local1205 = 1;
					if (local311 < 0) {
						local1201 = 103;
						local1203 = -1;
						local1205 = -1;
					}
					@Pc(1215) byte local1215 = 0;
					@Pc(1217) byte local1217 = 104;
					@Pc(1219) byte local1219 = 1;
					if (local316 < 0) {
						local1215 = 103;
						local1217 = -1;
						local1219 = -1;
					}
					for (@Pc(1229) int local1229 = local1201; local1229 != local1203; local1229 += local1205) {
						for (@Pc(1233) int local1233 = local1215; local1233 != local1217; local1233 += local1219) {
							@Pc(1239) int local1239 = local1229 + local311;
							@Pc(1243) int local1243 = local1233 + local316;
							for (@Pc(1245) int local1245 = 0; local1245 < 4; local1245++) {
								if (local1239 >= 0 && local1243 >= 0 && local1239 < 104 && local1243 < 104) {
									this.aClass50ArrayArrayArray1[local1245][local1229][local1233] = this.aClass50ArrayArrayArray1[local1245][local1239][local1243];
								} else {
									this.aClass50ArrayArrayArray1[local1245][local1229][local1233] = null;
								}
							}
						}
					}
					for (@Pc(1307) Class3_Sub3 local1307 = (Class3_Sub3) this.aClass50_11.method571(); local1307 != null; local1307 = (Class3_Sub3) this.aClass50_11.method573((byte) 3)) {
						local1307.anInt413 -= local311;
						local1307.anInt414 -= local316;
						if (local1307.anInt413 < 0 || local1307.anInt414 < 0 || local1307.anInt413 >= 104 || local1307.anInt414 >= 104) {
							local1307.method559();
						}
					}
					if (this.anInt994 != 0) {
						this.anInt994 -= local311;
						this.anInt995 -= local316;
					}
					this.aBoolean217 = false;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 62) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local225 = this.aClass3_Sub1_Sub2_6.method229();
					if (this.anInt1046 != -1) {
						this.method677(this.anInt1046);
						this.anInt1046 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt942 != -1) {
						this.method677(this.anInt942);
						this.anInt942 = -1;
						this.aBoolean248 = true;
					}
					if (this.anInt877 != -1) {
						this.method677(this.anInt877);
						this.anInt877 = -1;
					}
					if (this.anInt868 != local225) {
						this.method677(this.anInt868);
						this.anInt868 = local225;
					}
					if (this.anInt1011 != local174) {
						this.method677(this.anInt1011);
						this.anInt1011 = local174;
					}
					if (this.anInt933 != 0) {
						this.anInt933 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean253 = true;
					this.aBoolean251 = true;
					this.aBoolean247 = false;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 181) {
					this.aBoolean217 = true;
					this.anInt858 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt859 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt860 = this.aClass3_Sub1_Sub2_6.method202();
					this.anInt861 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt862 = this.aClass3_Sub1_Sub2_6.method200();
					if (this.anInt862 >= 100) {
						this.anInt1061 = this.anInt858 * 128 + 64;
						this.anInt1063 = this.anInt859 * 128 + 64;
						this.anInt1062 = this.method605(this.anInt1052, this.anInt1061, this.anInt1063) - this.anInt860;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 53) {
					local174 = this.aClass3_Sub1_Sub2_6.method230(anInt908);
					local225 = this.aClass3_Sub1_Sub2_6.method228();
					Class15.method147(local225).anInt309 = 2;
					Class15.method147(local225).anInt310 = local174;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 49) {
					local174 = this.aClass3_Sub1_Sub2_6.method219();
					local225 = this.aClass3_Sub1_Sub2_6.method202();
					if (local225 == 65535) {
						local225 = -1;
					}
					if (this.anIntArray268[local174] != local225) {
						this.method677(this.anIntArray268[local174]);
						this.anIntArray268[local174] = local225;
					}
					this.aBoolean253 = true;
					this.aBoolean251 = true;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 150) {
					@Pc(1623) byte local1623 = this.aClass3_Sub1_Sub2_6.method201();
					local225 = this.aClass3_Sub1_Sub2_6.method202();
					this.anIntArray262[local225] = local1623;
					if (this.anIntArray232[local225] != local1623) {
						this.anIntArray232[local225] = local1623;
						this.method596(local225);
						this.aBoolean253 = true;
						if (this.anInt1060 != -1) {
							this.aBoolean255 = true;
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 58) {
					this.anInt864 = this.anInt845 / 8;
					for (local174 = 0; local174 < this.anInt864; local174++) {
						this.aLongArray4[local174] = this.aClass3_Sub1_Sub2_6.method206((byte) 2);
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 128) {
					this.aBoolean253 = true;
					local174 = this.aClass3_Sub1_Sub2_6.method235();
					local225 = this.aClass3_Sub1_Sub2_6.method219();
					local311 = this.aClass3_Sub1_Sub2_6.method221();
					this.anIntArray256[local311] = local174;
					this.anIntArray255[local311] = local225;
					this.anIntArray271[local311] = 1;
					for (local316 = 0; local316 < 98; local316++) {
						if (local174 >= anIntArray212[local316]) {
							this.anIntArray271[local311] = local316 + 2;
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 137) {
					this.aBoolean217 = false;
					for (local174 = 0; local174 < 5; local174++) {
						this.aBooleanArray11[local174] = false;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 148) {
					this.anInt991 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt905 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt1070 = this.aClass3_Sub1_Sub2_6.method200();
					this.aBoolean243 = true;
					this.aBoolean255 = true;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 216) {
					local174 = this.aClass3_Sub1_Sub2_6.method200();
					local225 = this.aClass3_Sub1_Sub2_6.method221();
					@Pc(1828) String local1828 = this.aClass3_Sub1_Sub2_6.method207();
					if (local174 >= 1 && local174 <= 5) {
						if (local1828.equalsIgnoreCase("null")) {
							local1828 = null;
						}
						this.aStringArray8[local174 - 1] = local1828;
						this.aBooleanArray12[local174 - 1] = local225 == 0;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 86) {
					local174 = this.aClass3_Sub1_Sub2_6.method200();
					local225 = this.aClass3_Sub1_Sub2_6.method200();
					local311 = this.aClass3_Sub1_Sub2_6.method200();
					local316 = this.aClass3_Sub1_Sub2_6.method200();
					this.aBooleanArray11[local174] = true;
					this.anIntArray215[local174] = local225;
					this.anIntArray238[local174] = local311;
					this.anIntArray269[local174] = local316;
					this.anIntArray214[local174] = 0;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 60) {
					local174 = this.aClass3_Sub1_Sub2_6.method232();
					if (local174 >= 0) {
						this.method674(local174);
					}
					if (local174 != this.anInt997) {
						this.method677(this.anInt997);
						this.anInt997 = local174;
					}
					this.anInt846 = -1;
					return true;
				}
				@Pc(1961) Class15 local1961;
				if (this.anInt846 == 35) {
					local174 = this.aClass3_Sub1_Sub2_6.method229();
					local225 = this.aClass3_Sub1_Sub2_6.method202();
					local1961 = Class15.method147(local225);
					if (local1961 != null && local1961.anInt280 == 0) {
						if (local174 < 0) {
							local174 = 0;
						}
						if (local174 > local1961.anInt279 - local1961.anInt291) {
							local174 = local1961.anInt279 - local1961.anInt291;
						}
						local1961.anInt298 = local174;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 64) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local225 = this.aClass3_Sub1_Sub2_6.method231();
					local311 = this.aClass3_Sub1_Sub2_6.method233();
					@Pc(2012) Class15 local2012 = Class15.method147(local174);
					local2012.anInt278 = local225;
					local2012.anInt307 = local311;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 251) {
					this.anInt987 = this.aClass3_Sub1_Sub2_6.method228();
					this.anInt1001 = this.aClass3_Sub1_Sub2_6.method221();
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 25) {
					this.anInt1057 = this.aClass3_Sub1_Sub2_6.method200();
					this.aBoolean253 = true;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 205) {
					this.anInt984 = this.aClass3_Sub1_Sub2_6.method235();
					this.anInt952 = this.aClass3_Sub1_Sub2_6.method202();
					this.anInt1006 = this.aClass3_Sub1_Sub2_6.method228();
					this.anInt1072 = this.aClass3_Sub1_Sub2_6.method202();
					this.anInt856 = this.aClass3_Sub1_Sub2_6.method230(anInt908);
					this.aClass3_Sub1_Sub2_6.method219();
					this.anInt1017 = this.aClass3_Sub1_Sub2_6.method228();
					this.aClass3_Sub1_Sub2_6.method202();
					this.anInt946 = this.aClass3_Sub1_Sub2_6.method230(anInt908);
					this.anInt902 = this.aClass3_Sub1_Sub2_6.method229();
					this.anInt1018 = this.aClass3_Sub1_Sub2_6.method202();
					signlink.dnslookup(Class43.method547(this.anInt984));
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 106) {
					local174 = this.aClass3_Sub1_Sub2_6.method228();
					local225 = this.aClass3_Sub1_Sub2_6.method202();
					local311 = this.aClass3_Sub1_Sub2_6.method202();
					if (local174 == 65535) {
						Class15.method147(local225).anInt309 = 0;
						this.anInt846 = -1;
						return true;
					}
					@Pc(2167) Class25 local2167 = Class25.method347(local174);
					Class15.method147(local225).anInt309 = 4;
					Class15.method147(local225).anInt310 = local174;
					Class15.method147(local225).anInt272 = local2167.anInt505;
					Class15.method147(local225).anInt273 = local2167.anInt520;
					Class15.method147(local225).anInt271 = local2167.anInt512 * 100 / local311;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 15) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local225 = this.aClass3_Sub1_Sub2_6.method229();
					this.method674(local174);
					if (local225 != -1) {
						this.method674(local225);
					}
					if (this.anInt868 != -1) {
						this.method677(this.anInt868);
						this.anInt868 = -1;
					}
					if (this.anInt1011 != -1) {
						this.method677(this.anInt1011);
						this.anInt1011 = -1;
					}
					if (this.anInt1046 != -1) {
						this.method677(this.anInt1046);
						this.anInt1046 = -1;
					}
					if (this.anInt942 != local174) {
						this.method677(this.anInt942);
						this.anInt942 = local174;
					}
					if (this.anInt877 != local174) {
						this.method677(this.anInt877);
						this.anInt877 = local225;
					}
					this.anInt933 = 0;
					this.aBoolean247 = false;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 219) {
					this.anInt1050 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 172) {
					this.method660(this.anInt845, this.aClass3_Sub1_Sub2_6);
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 66) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local347 = Class15.method147(local174);
					for (local311 = 0; local311 < local347.anIntArray106.length; local311++) {
						local347.anIntArray106[local311] = -1;
						local347.anIntArray106[local311] = 0;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 84) {
					local174 = this.aClass3_Sub1_Sub2_6.method229();
					local225 = this.aClass3_Sub1_Sub2_6.method202();
					Class15.method147(local225).anInt309 = 1;
					Class15.method147(local225).anInt310 = local174;
					this.anInt846 = -1;
					return true;
				}
				@Pc(2405) boolean local2405;
				@Pc(2474) String local2474;
				@Pc(2395) long local2395;
				if (this.anInt846 == 176) {
					local2395 = this.aClass3_Sub1_Sub2_6.method206((byte) 2);
					local311 = this.aClass3_Sub1_Sub2_6.method205();
					local316 = this.aClass3_Sub1_Sub2_6.method200();
					local2405 = false;
					for (local553 = 0; local553 < 100; local553++) {
						if (this.anIntArray270[local553] == local311) {
							local2405 = true;
							break;
						}
					}
					if (local316 <= 1) {
						for (local836 = 0; local836 < this.anInt864; local836++) {
							if (this.aLongArray4[local836] == local2395) {
								local2405 = true;
								break;
							}
						}
					}
					if (!local2405 && this.anInt951 == 0) {
						try {
							this.anIntArray270[this.anInt977] = local311;
							this.anInt977 = (this.anInt977 + 1) % 100;
							local2474 = Class12.method136(this.aClass3_Sub1_Sub2_6, this.anInt845 - 13);
							if (local316 != 3) {
								local2474 = Class24.method307(local2474);
							}
							if (local316 == 2 || local316 == 3) {
								this.method594(7, "@cr2@" + Class43.method548(Class43.method545(local2395)), local2474);
							} else if (local316 == 1) {
								this.method594(7, "@cr1@" + Class43.method548(Class43.method545(local2395)), local2474);
							} else {
								this.method594(3, Class43.method548(Class43.method545(local2395)), local2474);
							}
						} catch (@Pc(2538) Exception local2538) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 197) {
					local2395 = this.aClass3_Sub1_Sub2_6.method206((byte) 2);
					local311 = this.aClass3_Sub1_Sub2_6.method200();
					@Pc(2565) String local2565 = Class43.method548(Class43.method545(local2395));
					for (local361 = 0; local361 < this.anInt1056; local361++) {
						if (local2395 == this.aLongArray3[local361]) {
							if (this.anIntArray233[local361] != local311) {
								this.anIntArray233[local361] = local311;
								this.aBoolean253 = true;
								if (local311 > 0) {
									this.method594(5, "", local2565 + " has logged in.");
								}
								if (local311 == 0) {
									this.method594(5, "", local2565 + " has logged out.");
								}
							}
							local2565 = null;
							break;
						}
					}
					if (local2565 != null && this.anInt1056 < 200) {
						this.aLongArray3[this.anInt1056] = local2395;
						this.aStringArray9[this.anInt1056] = local2565;
						this.anIntArray233[this.anInt1056] = local311;
						this.anInt1056++;
						this.aBoolean253 = true;
					}
					@Pc(2663) boolean local2663 = false;
					while (!local2663) {
						local2663 = true;
						for (local836 = 0; local836 < this.anInt1056 - 1; local836++) {
							if (this.anIntArray233[local836] != anInt935 && this.anIntArray233[local836 + 1] == anInt935 || this.anIntArray233[local836] == 0 && this.anIntArray233[local836 + 1] != 0) {
								local857 = this.anIntArray233[local836];
								this.anIntArray233[local836] = this.anIntArray233[local836 + 1];
								this.anIntArray233[local836 + 1] = local857;
								@Pc(2724) String local2724 = this.aStringArray9[local836];
								this.aStringArray9[local836] = this.aStringArray9[local836 + 1];
								this.aStringArray9[local836 + 1] = local2724;
								@Pc(2746) long local2746 = this.aLongArray3[local836];
								this.aLongArray3[local836] = this.aLongArray3[local836 + 1];
								this.aLongArray3[local836 + 1] = local2746;
								this.aBoolean253 = true;
								local2663 = false;
							}
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 223) {
					local2790 = this.aClass3_Sub1_Sub2_6.method207();
					local225 = this.aClass3_Sub1_Sub2_6.method228();
					Class15.method147(local225).aString8 = local2790;
					@Pc(2807) int local2807 = this.anIntArray268[this.anInt886];
					if (Class15.method147(local225).anInt299 == local2807) {
						this.aBoolean253 = true;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 37) {
					this.method592(this.anInt845, this.aClass3_Sub1_Sub2_6, (byte) 4);
					this.aBoolean258 = false;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 158) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local225 = this.aClass3_Sub1_Sub2_6.method230(anInt908);
					local311 = this.aClass3_Sub1_Sub2_6.method228();
					Class15.method147(local174).anInt295 = (local311 << 16) + local225;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 46) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local225 = this.aClass3_Sub1_Sub2_6.method228();
					local311 = local174 >> 10 & 0x1F;
					local316 = local174 >> 5 & 0x1F;
					local361 = local174 & 0x1F;
					Class15.method147(local225).anInt305 = (local311 << 19) + (local316 << 11) + (local361 << 3);
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 1) {
					local174 = this.aClass3_Sub1_Sub2_6.method231();
					local225 = this.aClass3_Sub1_Sub2_6.method228();
					local1961 = Class15.method147(local225);
					if (local1961.anInt281 != local174 || local174 == -1) {
						local1961.anInt281 = local174;
						local1961.anInt303 = 0;
						local1961.anInt293 = 0;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 168) {
					for (local174 = 0; local174 < this.aClass3_Sub1_Sub1_Sub2_Sub1Array1.length; local174++) {
						if (this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local174] != null) {
							this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local174].anInt356 = -1;
						}
					}
					for (local225 = 0; local225 < this.aClass3_Sub1_Sub1_Sub2_Sub2Array1.length; local225++) {
						if (this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local225] != null) {
							this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local225].anInt356 = -1;
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 165) {
					if (this.anInt886 == 12) {
						this.aBoolean253 = true;
					}
					this.anInt857 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 129) {
					this.anInt844 = this.aClass3_Sub1_Sub2_6.method200();
					if (this.anInt844 == this.anInt886) {
						if (this.anInt844 == 3) {
							this.anInt886 = 1;
						} else {
							this.anInt886 = 3;
						}
						this.aBoolean253 = true;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 144) {
					local174 = this.aClass3_Sub1_Sub2_6.method231();
					if (local174 != this.anInt1060) {
						this.method677(this.anInt1060);
						this.anInt1060 = local174;
					}
					this.aBoolean255 = true;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 104) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local225 = this.aClass3_Sub1_Sub2_6.method200();
					local311 = this.aClass3_Sub1_Sub2_6.method202();
					if (this.aBoolean240 && !aBoolean237 && this.anInt1036 < 50) {
						this.anIntArray226[this.anInt1036] = local174;
						this.anIntArray266[this.anInt1036] = local225;
						this.anIntArray272[this.anInt1036] = local311 + Class2.anIntArray2[local174];
						this.anInt1036++;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 52) {
					this.anInt994 = 0;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 124) {
					this.aBoolean244 = false;
					this.anInt933 = 2;
					this.aString21 = "";
					this.aBoolean255 = true;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 118) {
					local174 = this.aClass3_Sub1_Sub2_6.method229();
					this.method674(local174);
					if (this.anInt1011 != -1) {
						this.method677(this.anInt1011);
						this.anInt1011 = -1;
						this.aBoolean253 = true;
						this.aBoolean251 = true;
					}
					if (this.anInt942 != -1) {
						this.method677(this.anInt942);
						this.anInt942 = -1;
						this.aBoolean248 = true;
					}
					if (this.anInt877 != -1) {
						this.method677(this.anInt877);
						this.anInt877 = -1;
					}
					if (this.anInt868 != -1) {
						this.method677(this.anInt868);
						this.anInt868 = -1;
					}
					if (this.anInt1046 != local174) {
						this.method677(this.anInt1046);
						this.anInt1046 = local174;
					}
					this.aBoolean247 = false;
					this.aBoolean255 = true;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 242) {
					local2790 = this.aClass3_Sub1_Sub2_6.method207();
					@Pc(3293) long local3293;
					@Pc(3290) String local3290;
					if (local2790.endsWith(":tradereq:")) {
						local3290 = local2790.substring(0, local2790.indexOf(":"));
						local3293 = Class43.method544(local3290);
						local2405 = false;
						for (local553 = 0; local553 < this.anInt864; local553++) {
							if (this.aLongArray4[local553] == local3293) {
								local2405 = true;
								break;
							}
						}
						if (!local2405 && this.anInt951 == 0) {
							this.method594(4, local3290, "wishes to trade with you.");
						}
					} else if (local2790.endsWith(":duelreq:")) {
						local3290 = local2790.substring(0, local2790.indexOf(":"));
						local3293 = Class43.method544(local3290);
						local2405 = false;
						for (local553 = 0; local553 < this.anInt864; local553++) {
							if (this.aLongArray4[local553] == local3293) {
								local2405 = true;
								break;
							}
						}
						if (!local2405 && this.anInt951 == 0) {
							this.method594(8, local3290, "wishes to duel with you.");
						}
					} else if (local2790.endsWith(":chalreq:")) {
						local3290 = local2790.substring(0, local2790.indexOf(":"));
						local3293 = Class43.method544(local3290);
						local2405 = false;
						for (local553 = 0; local553 < this.anInt864; local553++) {
							if (this.aLongArray4[local553] == local3293) {
								local2405 = true;
								break;
							}
						}
						if (!local2405 && this.anInt951 == 0) {
							local2474 = local2790.substring(local2790.indexOf(":") + 1, local2790.length() - 9);
							this.method594(8, local3290, local2474);
						}
					} else {
						this.method594(0, "", local2790);
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 14) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					this.method674(local174);
					if (this.anInt1011 != -1) {
						this.method677(this.anInt1011);
						this.anInt1011 = -1;
						this.aBoolean253 = true;
						this.aBoolean251 = true;
					}
					if (this.anInt1046 != -1) {
						this.method677(this.anInt1046);
						this.anInt1046 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt942 != -1) {
						this.method677(this.anInt942);
						this.anInt942 = -1;
						this.aBoolean248 = true;
					}
					if (this.anInt877 != -1) {
						this.method677(this.anInt877);
						this.anInt877 = -1;
					}
					if (this.anInt868 != local174) {
						this.method677(this.anInt868);
						this.anInt868 = local174;
					}
					if (this.anInt933 != 0) {
						this.anInt933 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean247 = false;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 241) {
					this.anInt1037 = this.aClass3_Sub1_Sub2_6.method220();
					this.anInt1038 = this.aClass3_Sub1_Sub2_6.method220();
					for (local174 = this.anInt1037; local174 < this.anInt1037 + 8; local174++) {
						for (local225 = this.anInt1038; local225 < this.anInt1038 + 8; local225++) {
							if (this.aClass50ArrayArrayArray1[this.anInt1052][local174][local225] != null) {
								this.aClass50ArrayArrayArray1[this.anInt1052][local174][local225] = null;
								this.method718(local174, local225);
							}
						}
					}
					for (@Pc(3619) Class3_Sub3 local3619 = (Class3_Sub3) this.aClass50_11.method571(); local3619 != null; local3619 = (Class3_Sub3) this.aClass50_11.method573((byte) 3)) {
						if (local3619.anInt413 >= this.anInt1037 && local3619.anInt413 < this.anInt1037 + 8 && local3619.anInt414 >= this.anInt1038 && local3619.anInt414 < this.anInt1038 + 8 && local3619.anInt411 == this.anInt1052) {
							local3619.anInt415 = 0;
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 71) {
					local174 = this.aClass3_Sub1_Sub2_6.method228();
					this.method674(local174);
					if (this.anInt1046 != -1) {
						this.method677(this.anInt1046);
						this.anInt1046 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt942 != -1) {
						this.method677(this.anInt942);
						this.anInt942 = -1;
						this.aBoolean248 = true;
					}
					if (this.anInt877 != -1) {
						this.method677(this.anInt877);
						this.anInt877 = -1;
					}
					if (this.anInt868 != -1) {
						this.method677(this.anInt868);
						this.anInt868 = -1;
					}
					if (this.anInt1011 != local174) {
						this.method677(this.anInt1011);
						this.anInt1011 = local174;
					}
					if (this.anInt933 != 0) {
						this.anInt933 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean253 = true;
					this.aBoolean251 = true;
					this.aBoolean247 = false;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 253) {
					if (this.anInt1011 != -1) {
						this.method677(this.anInt1011);
						this.anInt1011 = -1;
						this.aBoolean253 = true;
						this.aBoolean251 = true;
					}
					if (this.anInt1046 != -1) {
						this.method677(this.anInt1046);
						this.anInt1046 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt942 != -1) {
						this.method677(this.anInt942);
						this.anInt942 = -1;
						this.aBoolean248 = true;
					}
					if (this.anInt877 != -1) {
						this.method677(this.anInt877);
						this.anInt877 = -1;
					}
					if (this.anInt868 != -1) {
						this.method677(this.anInt868);
						this.anInt868 = -1;
					}
					if (this.anInt933 != 0) {
						this.anInt933 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean247 = false;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 153) {
					this.anInt865 = this.aClass3_Sub1_Sub2_6.method200();
					if (this.anInt865 == 1) {
						this.anInt985 = this.aClass3_Sub1_Sub2_6.method202();
					}
					if (this.anInt865 >= 2 && this.anInt865 <= 6) {
						if (this.anInt865 == 2) {
							this.anInt893 = 64;
							this.anInt894 = 64;
						}
						if (this.anInt865 == 3) {
							this.anInt893 = 0;
							this.anInt894 = 64;
						}
						if (this.anInt865 == 4) {
							this.anInt893 = 128;
							this.anInt894 = 64;
						}
						if (this.anInt865 == 5) {
							this.anInt893 = 64;
							this.anInt894 = 0;
						}
						if (this.anInt865 == 6) {
							this.anInt893 = 64;
							this.anInt894 = 128;
						}
						this.anInt865 = 2;
						this.anInt890 = this.aClass3_Sub1_Sub2_6.method202();
						this.anInt891 = this.aClass3_Sub1_Sub2_6.method202();
						this.anInt892 = this.aClass3_Sub1_Sub2_6.method200();
					}
					if (this.anInt865 == 10) {
						this.anInt1023 = this.aClass3_Sub1_Sub2_6.method202();
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 243) {
					this.anInt1038 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt1037 = this.aClass3_Sub1_Sub2_6.method219();
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 16) {
					this.anInt1038 = this.aClass3_Sub1_Sub2_6.method219();
					this.anInt1037 = this.aClass3_Sub1_Sub2_6.method221();
					while (this.aClass3_Sub1_Sub2_6.anInt429 < this.anInt845) {
						local174 = this.aClass3_Sub1_Sub2_6.method200();
						this.method650(local174, this.aClass3_Sub1_Sub2_6);
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 179) {
					if (this.anInt886 == 12) {
						this.aBoolean253 = true;
					}
					this.anInt971 = this.aClass3_Sub1_Sub2_6.method203();
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 125) {
					this.anInt886 = this.aClass3_Sub1_Sub2_6.method219();
					this.aBoolean253 = true;
					this.aBoolean251 = true;
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 5) {
					this.method695();
					this.anInt846 = -1;
					return false;
				}
				if (this.anInt846 == 32) {
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local225 = this.aClass3_Sub1_Sub2_6.method237();
					this.anIntArray262[local174] = local225;
					if (this.anIntArray232[local174] != local225) {
						this.anIntArray232[local174] = local225;
						this.method596(local174);
						this.aBoolean253 = true;
						if (this.anInt1060 != -1) {
							this.aBoolean255 = true;
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 96) {
					this.aBoolean217 = true;
					this.anInt911 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt912 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt913 = this.aClass3_Sub1_Sub2_6.method202();
					this.anInt914 = this.aClass3_Sub1_Sub2_6.method200();
					this.anInt915 = this.aClass3_Sub1_Sub2_6.method200();
					if (this.anInt915 >= 100) {
						local174 = this.anInt911 * 128 + 64;
						local225 = this.anInt912 * 128 + 64;
						local311 = this.method605(this.anInt1052, local174, local225) - this.anInt913;
						local316 = local174 - this.anInt1061;
						local361 = local311 - this.anInt1062;
						local553 = local225 - this.anInt1063;
						local836 = (int) Math.sqrt((double) (local316 * local316 + local553 * local553));
						this.anInt1064 = (int) (Math.atan2((double) local361, (double) local836) * 325.949D) & 0x7FF;
						this.anInt1065 = (int) (Math.atan2((double) local316, (double) local553) * -325.949D) & 0x7FF;
						if (this.anInt1064 < 128) {
							this.anInt1064 = 128;
						}
						if (this.anInt1064 > 383) {
							this.anInt1064 = 383;
						}
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 30) {
					local174 = this.aClass3_Sub1_Sub2_6.method229();
					Class15.method147(local174).anInt309 = 3;
					if (aClass3_Sub1_Sub1_Sub2_Sub1_1.aClass40_1 == null) {
						Class15.method147(local174).anInt310 = (aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray55[0] << 25) + (aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray55[4] << 20) + (aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray54[0] << 15) + (aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray54[8] << 10) + (aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray54[11] << 5) + aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray54[1];
					} else {
						Class15.method147(local174).anInt310 = (int) (aClass3_Sub1_Sub1_Sub2_Sub1_1.aClass40_1.aLong24 + 305419896L);
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 206) {
					this.aBoolean253 = true;
					local174 = this.aClass3_Sub1_Sub2_6.method202();
					local347 = Class15.method147(local174);
					local311 = this.aClass3_Sub1_Sub2_6.method202();
					for (local316 = 0; local316 < local311; local316++) {
						local347.anIntArray106[local316] = this.aClass3_Sub1_Sub2_6.method202();
						local361 = this.aClass3_Sub1_Sub2_6.method219();
						if (local361 == 255) {
							local361 = this.aClass3_Sub1_Sub2_6.method205();
						}
						local347.anIntArray112[local316] = local361;
					}
					for (local361 = local311; local361 < local347.anIntArray106.length; local361++) {
						local347.anIntArray106[local361] = 0;
						local347.anIntArray112[local361] = 0;
					}
					this.anInt846 = -1;
					return true;
				}
				if (this.anInt846 == 114) {
					this.aBoolean244 = false;
					this.anInt933 = 1;
					this.aString21 = "";
					this.aBoolean255 = true;
					this.anInt846 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt846 + "," + this.anInt845 + " - " + this.anInt949 + "," + this.anInt950);
				this.method695();
			} catch (@Pc(4459) IOException local4459) {
				this.method603();
			} catch (@Pc(4464) Exception local4464) {
				local2790 = "T2 - " + this.anInt846 + "," + this.anInt949 + "," + this.anInt950 + " - " + this.anInt845 + "," + (this.anInt896 + aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0]) + "," + (this.anInt897 + aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0]) + " - ";
				for (local225 = 0; local225 < this.anInt845 && local225 < 50; local225++) {
					local2790 = local2790 + this.aClass3_Sub1_Sub2_6.aByteArray14[local225] + ",";
				}
				signlink.reporterror(local2790);
				this.method695();
			}
			return true;
		} catch (@Pc(4545) RuntimeException local4545) {
			signlink.reporterror("73566, " + true + ", " + local4545.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method645(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray217[arg0];
				@Pc(14) int local14 = this.anIntArray218[arg0];
				@Pc(19) int local19 = this.anIntArray219[arg0];
				@Pc(24) int local24 = this.anIntArray220[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt933 != 0 && local19 != 1921) {
					this.anInt933 = 0;
					this.aBoolean255 = true;
				}
				if (local19 == 766) {
					this.method590(local9, this.aByte47, local14, local24);
					this.aClass3_Sub1_Sub2_8.method189(217, 132);
					this.aClass3_Sub1_Sub2_8.method227(local9 + this.anInt896);
					this.aClass3_Sub1_Sub2_8.method225(local14 + this.anInt897);
					this.aClass3_Sub1_Sub2_8.method225(local24 >> 14 & 0x7FFF);
				}
				@Pc(96) Class15 local96;
				@Pc(114) int local114;
				if (local19 == 790) {
					this.aClass3_Sub1_Sub2_8.method189(208, 132);
					this.aClass3_Sub1_Sub2_8.method191(local14);
					local96 = Class15.method147(local14);
					if (local96.anIntArrayArray14 != null && local96.anIntArrayArray14[0][0] == 5) {
						local114 = local96.anIntArrayArray14[0][1];
						this.anIntArray232[local114] = 1 - this.anIntArray232[local114];
						this.method596(local114);
						this.aBoolean253 = true;
					}
				}
				@Pc(139) Class3_Sub1_Sub1_Sub2_Sub2 local139;
				if (local19 == 24) {
					local139 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local24];
					if (local139 != null) {
						this.method589(2, false, 0, 1, local139.anIntArray115[0], 1, 0, local139.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						this.anInt1031 = super.anInt839;
						this.anInt1032 = super.anInt840;
						this.anInt1034 = 2;
						this.anInt1033 = 0;
						this.aClass3_Sub1_Sub2_8.method189(76, 132);
						this.aClass3_Sub1_Sub2_8.method227(local24);
					}
				}
				if (local19 == 951) {
					this.aClass3_Sub1_Sub2_8.method189(208, 132);
					this.aClass3_Sub1_Sub2_8.method191(local14);
					local96 = Class15.method147(local14);
					if (local96.anIntArrayArray14 != null && local96.anIntArrayArray14[0][0] == 5) {
						local114 = local96.anIntArrayArray14[0][1];
						if (this.anIntArray232[local114] != local96.anIntArray108[0]) {
							this.anIntArray232[local114] = local96.anIntArray108[0];
							this.method596(local114);
							this.aBoolean253 = true;
						}
					}
				}
				if (local19 == 1577) {
					this.method590(local9, this.aByte47, local14, local24);
					this.aClass3_Sub1_Sub2_8.method189(206, 132);
					this.aClass3_Sub1_Sub2_8.method227(local9 + this.anInt896);
					this.aClass3_Sub1_Sub2_8.method225(local14 + this.anInt897);
					this.aClass3_Sub1_Sub2_8.method191(local24 >> 14 & 0x7FFF);
				}
				if (local19 == 208) {
					this.method629((byte) 6);
				}
				@Pc(326) String local326;
				if (local19 == 1335) {
					local139 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local24];
					if (local139 != null) {
						@Pc(308) Class40 local308 = local139.aClass40_2;
						if (local308.anIntArray200 != null) {
							local308 = local308.method533();
						}
						if (local308 != null) {
							if (local308.aByteArray19 == null) {
								local326 = "It's a " + local308.aString15 + ".";
							} else {
								local326 = new String(local308.aByteArray19);
							}
							this.method594(0, "", local326);
						}
					}
				}
				@Pc(362) String local362;
				@Pc(377) long local377;
				if (local19 == 696 || local19 == 379 || local19 == 526 || local19 == 212) {
					local362 = this.aStringArray14[arg0];
					local114 = local362.indexOf("@whi@");
					if (local114 != -1) {
						local377 = Class43.method544(local362.substring(local114 + 5).trim());
						if (local19 == 696) {
							this.method673((byte) 6, local377);
						}
						if (local19 == 379) {
							this.method686(local377);
						}
						if (local19 == 526) {
							this.method624(local377);
						}
						if (local19 == 212) {
							this.method627(local377, this.aBoolean241);
						}
					}
				}
				@Pc(431) String local431;
				if (local19 == 582) {
					local96 = Class15.method147(local14);
					this.anInt963 = 1;
					this.anInt964 = local14;
					this.anInt965 = local96.anInt302;
					this.anInt953 = 0;
					this.aBoolean253 = true;
					local431 = local96.aString9;
					if (local431.indexOf(" ") != -1) {
						local431 = local431.substring(0, local431.indexOf(" "));
					}
					local326 = local96.aString9;
					if (local326.indexOf(" ") != -1) {
						local326 = local326.substring(local326.indexOf(" ") + 1);
					}
					this.aString24 = local431 + " " + local96.aString7 + " " + local326;
					if (this.anInt965 == 16) {
						this.aBoolean253 = true;
						this.anInt886 = 3;
						this.aBoolean251 = true;
					}
				} else {
					@Pc(498) Class3_Sub1_Sub1_Sub2_Sub1 local498;
					if (local19 == 621) {
						local498 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local498 != null) {
							this.method589(2, false, 0, 1, local498.anIntArray115[0], 1, 0, local498.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(170, 132);
							this.aClass3_Sub1_Sub2_8.method226(this.anInt964);
							this.aClass3_Sub1_Sub2_8.method191(local24);
						}
					}
					@Pc(580) boolean local580;
					if (local19 == 184) {
						local580 = this.method589(2, false, 0, 0, local9, 0, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						if (!local580) {
							this.method589(2, false, 0, 1, local9, 1, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						}
						this.anInt1031 = super.anInt839;
						this.anInt1032 = super.anInt840;
						this.anInt1034 = 2;
						this.anInt1033 = 0;
						this.aClass3_Sub1_Sub2_8.method189(41, 132);
						this.aClass3_Sub1_Sub2_8.method191(local24);
						this.aClass3_Sub1_Sub2_8.method227(local14 + this.anInt897);
						this.aClass3_Sub1_Sub2_8.method191(local9 + this.anInt896);
					}
					if (local19 == 851) {
						local139 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local139 != null) {
							this.method589(2, false, 0, 1, local139.anIntArray115[0], 1, 0, local139.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							if ((local24 & 0x3) == 0) {
								anInt934++;
							}
							if (anInt934 >= 111) {
								this.aClass3_Sub1_Sub2_8.method189(199, 132);
								this.aClass3_Sub1_Sub2_8.method194(0);
								anInt934 = 0;
							}
							this.aClass3_Sub1_Sub2_8.method189(37, 132);
							this.aClass3_Sub1_Sub2_8.method191(local24);
						}
					}
					@Pc(759) int local759;
					if (local19 == 940 || local19 == 113) {
						local362 = this.aStringArray14[arg0];
						local114 = local362.indexOf("@whi@");
						if (local114 != -1) {
							local362 = local362.substring(local114 + 5).trim();
							local326 = Class43.method548(Class43.method545(Class43.method544(local362)));
							@Pc(757) boolean local757 = false;
							for (local759 = 0; local759 < this.anInt969; local759++) {
								@Pc(769) Class3_Sub1_Sub1_Sub2_Sub1 local769 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local759]];
								if (local769 != null && local769.aString3 != null && local769.aString3.equalsIgnoreCase(local326)) {
									this.method589(2, false, 0, 1, local769.anIntArray115[0], 1, 0, local769.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
									if (local19 == 940) {
										this.aClass3_Sub1_Sub2_8.method189(162, 132);
										this.aClass3_Sub1_Sub2_8.method191(this.anIntArray244[local759]);
									}
									if (local19 == 113) {
										this.aClass3_Sub1_Sub2_8.method189(99, 132);
										this.aClass3_Sub1_Sub2_8.method227(this.anIntArray244[local759]);
									}
									local757 = true;
									break;
								}
							}
							if (!local757) {
								this.method594(0, "", "Unable to find " + local326);
							}
						}
					}
					if (local19 == 1327) {
						@Pc(869) int local869 = local24 >> 14 & 0x7FFF;
						@Pc(872) Class19 local872 = Class19.method182(local869);
						if (local872.aByteArray13 == null) {
							local326 = "It's a " + local872.aString12 + ".";
						} else {
							local326 = new String(local872.aByteArray13);
						}
						this.method594(0, "", local326);
					}
					if (local19 == 277) {
						anInt988++;
						if (anInt988 >= 132) {
							this.aClass3_Sub1_Sub2_8.method189(95, 132);
							this.aClass3_Sub1_Sub2_8.method194(0);
							anInt988 = 0;
						}
						this.aClass3_Sub1_Sub2_8.method189(93, 132);
						this.aClass3_Sub1_Sub2_8.method226(local14);
						this.aClass3_Sub1_Sub2_8.method226(local9);
						this.aClass3_Sub1_Sub2_8.method191(local24);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					@Pc(976) Class25 local976;
					if (local19 == 1184) {
						local976 = Class25.method347(local24);
						if (local976.aByteArray17 == null) {
							local431 = "It's a " + local976.aString13 + ".";
						} else {
							local431 = new String(local976.aByteArray17);
						}
						this.method594(0, "", local431);
					}
					if (local19 == 1) {
						this.aClass3_Sub1_Sub2_8.method189(73, 132);
						this.aClass3_Sub1_Sub2_8.method226(local14);
						this.aClass3_Sub1_Sub2_8.method226(local24);
						this.aClass3_Sub1_Sub2_8.method191(local9);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 482) {
						this.method677(this.anInt1060);
						this.anInt1060 = -1;
						this.aBoolean255 = true;
					}
					if (local19 == 946) {
						this.aClass3_Sub1_Sub2_8.method189(17, 132);
						this.aClass3_Sub1_Sub2_8.method226(local9);
						this.aClass3_Sub1_Sub2_8.method226(local24);
						this.aClass3_Sub1_Sub2_8.method191(local14);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 391) {
						this.aClass3_Sub1_Sub2_8.method189(174, 132);
						this.aClass3_Sub1_Sub2_8.method226(local9);
						this.aClass3_Sub1_Sub2_8.method227(local24);
						this.aClass3_Sub1_Sub2_8.method225(local14);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 426) {
						local96 = Class15.method147(local14);
						@Pc(1183) boolean local1183 = true;
						if (local96.anInt304 > 0) {
							local1183 = this.method653(local96, this.anInt931);
						}
						if (local1183) {
							this.aClass3_Sub1_Sub2_8.method189(208, 132);
							this.aClass3_Sub1_Sub2_8.method191(local14);
						}
					}
					if (local19 == 896) {
						local498 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local498 != null) {
							this.method589(2, false, 0, 1, local498.anIntArray115[0], 1, 0, local498.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(162, 132);
							this.aClass3_Sub1_Sub2_8.method191(local24);
						}
					}
					if (local19 == 247) {
						local362 = this.aStringArray14[arg0];
						local114 = local362.indexOf("@whi@");
						if (local114 != -1) {
							local377 = Class43.method544(local362.substring(local114 + 5).trim());
							local759 = -1;
							for (@Pc(1290) int local1290 = 0; local1290 < this.anInt1056; local1290++) {
								if (this.aLongArray3[local1290] == local377) {
									local759 = local1290;
									break;
								}
							}
							if (local759 != -1 && this.anIntArray233[local759] > 0) {
								this.aBoolean255 = true;
								this.anInt933 = 0;
								this.aBoolean244 = true;
								this.aString25 = "";
								this.anInt932 = 3;
								this.aLong29 = this.aLongArray3[local759];
								this.aString19 = "Enter message to send to " + this.aStringArray9[local759];
							}
						}
					}
					if (local19 == 985) {
						anInt1049 += local14;
						if (anInt1049 >= 145) {
							this.aClass3_Sub1_Sub2_8.method189(100, 132);
							anInt1049 = 0;
						}
						this.method590(local9, this.aByte47, local14, local24);
						this.aClass3_Sub1_Sub2_8.method189(59, 132);
						this.aClass3_Sub1_Sub2_8.method191(local24 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub2_8.method225(local14 + this.anInt897);
						this.aClass3_Sub1_Sub2_8.method226(local9 + this.anInt896);
					}
					if (local19 == 62) {
						local580 = this.method589(2, false, 0, 0, local9, 0, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						if (!local580) {
							this.method589(2, false, 0, 1, local9, 1, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						}
						this.anInt1031 = super.anInt839;
						this.anInt1032 = super.anInt840;
						this.anInt1034 = 2;
						this.anInt1033 = 0;
						this.aClass3_Sub1_Sub2_8.method189(113, 132);
						this.aClass3_Sub1_Sub2_8.method226(this.anInt954);
						this.aClass3_Sub1_Sub2_8.method225(local14 + this.anInt897);
						this.aClass3_Sub1_Sub2_8.method226(this.anInt956);
						this.aClass3_Sub1_Sub2_8.method227(this.anInt955);
						this.aClass3_Sub1_Sub2_8.method191(local9 + this.anInt896);
						this.aClass3_Sub1_Sub2_8.method191(local24);
					}
					if (local19 == 81) {
						local580 = this.method589(2, false, 0, 0, local9, 0, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						if (!local580) {
							this.method589(2, false, 0, 1, local9, 1, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						}
						this.anInt1031 = super.anInt839;
						this.anInt1032 = super.anInt840;
						this.anInt1034 = 2;
						this.anInt1033 = 0;
						this.aClass3_Sub1_Sub2_8.method189(12, 132);
						this.aClass3_Sub1_Sub2_8.method226(local24);
						this.aClass3_Sub1_Sub2_8.method191(local14 + this.anInt897);
						this.aClass3_Sub1_Sub2_8.method227(local9 + this.anInt896);
					}
					if (local19 == 281) {
						anInt919 += local14;
						if (anInt919 >= 82) {
							this.aClass3_Sub1_Sub2_8.method189(182, 132);
							anInt919 = 0;
						}
						this.aClass3_Sub1_Sub2_8.method189(255, 132);
						this.aClass3_Sub1_Sub2_8.method191(local9);
						this.aClass3_Sub1_Sub2_8.method226(local24);
						this.aClass3_Sub1_Sub2_8.method226(local14);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 256) {
						this.method590(local9, this.aByte47, local14, local24);
						this.aClass3_Sub1_Sub2_8.method189(102, 132);
						this.aClass3_Sub1_Sub2_8.method225(local9 + this.anInt896);
						this.aClass3_Sub1_Sub2_8.method226(local14 + this.anInt897);
						this.aClass3_Sub1_Sub2_8.method226(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 157 && this.method590(local9, this.aByte47, local14, local24)) {
						this.aClass3_Sub1_Sub2_8.method189(90, 132);
						this.aClass3_Sub1_Sub2_8.method191(local14 + this.anInt897);
						this.aClass3_Sub1_Sub2_8.method226(local24 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub2_8.method191(local9 + this.anInt896);
						this.aClass3_Sub1_Sub2_8.method227(this.anInt964);
					}
					if (local19 == 883) {
						local498 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local498 != null) {
							this.method589(2, false, 0, 1, local498.anIntArray115[0], 1, 0, local498.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(99, 132);
							this.aClass3_Sub1_Sub2_8.method227(local24);
						}
					}
					if (local19 == 233) {
						local498 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local498 != null) {
							this.method589(2, false, 0, 1, local498.anIntArray115[0], 1, 0, local498.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(190, 132);
							this.aClass3_Sub1_Sub2_8.method191(local24);
						}
					}
					if (local19 == 1870) {
						local976 = Class25.method347(local24);
						@Pc(1874) Class15 local1874 = Class15.method147(local14);
						if (local1874 != null && local1874.anIntArray112[local9] >= 100000) {
							local431 = local1874.anIntArray112[local9] + " x " + local976.aString13;
						} else if (local976.aByteArray17 == null) {
							local431 = "It's a " + local976.aString13 + ".";
						} else {
							local431 = new String(local976.aByteArray17);
						}
						this.method594(0, "", local431);
					}
					if (local19 == 789) {
						this.aClass3_Sub1_Sub2_8.method189(14, 132);
						this.aClass3_Sub1_Sub2_8.method227(this.anInt964);
						this.aClass3_Sub1_Sub2_8.method191(local24);
						this.aClass3_Sub1_Sub2_8.method225(local14);
						this.aClass3_Sub1_Sub2_8.method226(local9);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 145) {
						local498 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local498 != null) {
							this.method589(2, false, 0, 1, local498.anIntArray115[0], 1, 0, local498.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							anInt916 += local24;
							if (anInt916 >= 50) {
								this.aClass3_Sub1_Sub2_8.method189(164, 132);
								this.aClass3_Sub1_Sub2_8.method193(3839761);
								anInt916 = 0;
							}
							this.aClass3_Sub1_Sub2_8.method189(54, 132);
							this.aClass3_Sub1_Sub2_8.method226(local24);
						}
					}
					if (local19 == 983) {
						local139 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local139 != null) {
							this.method589(2, false, 0, 1, local139.anIntArray115[0], 1, 0, local139.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(158, 132);
							this.aClass3_Sub1_Sub2_8.method225(local24);
						}
					}
					if (local19 == 703) {
						local498 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local498 != null) {
							this.method589(2, false, 0, 1, local498.anIntArray115[0], 1, 0, local498.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(189, 132);
							this.aClass3_Sub1_Sub2_8.method226(local24);
							this.aClass3_Sub1_Sub2_8.method191(this.anInt955);
							this.aClass3_Sub1_Sub2_8.method226(this.anInt954);
							this.aClass3_Sub1_Sub2_8.method225(this.anInt956);
						}
					}
					if (local19 == 275) {
						local580 = this.method589(2, false, 0, 0, local9, 0, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						if (!local580) {
							this.method589(2, false, 0, 1, local9, 1, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
						}
						this.anInt1031 = super.anInt839;
						this.anInt1032 = super.anInt840;
						this.anInt1034 = 2;
						this.anInt1033 = 0;
						this.aClass3_Sub1_Sub2_8.method189(143, 132);
						this.aClass3_Sub1_Sub2_8.method225(local14 + this.anInt897);
						this.aClass3_Sub1_Sub2_8.method226(local24);
						this.aClass3_Sub1_Sub2_8.method225(local9 + this.anInt896);
					}
					if (local19 == 530) {
						this.aClass3_Sub1_Sub2_8.method189(19, 132);
						this.aClass3_Sub1_Sub2_8.method225(local14);
						this.aClass3_Sub1_Sub2_8.method225(local9);
						this.aClass3_Sub1_Sub2_8.method227(local24);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 646) {
						local139 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local139 != null) {
							this.method589(2, false, 0, 1, local139.anIntArray115[0], 1, 0, local139.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(48, 132);
							this.aClass3_Sub1_Sub2_8.method191(this.anInt955);
							this.aClass3_Sub1_Sub2_8.method225(this.anInt956);
							this.aClass3_Sub1_Sub2_8.method225(local24);
							this.aClass3_Sub1_Sub2_8.method225(this.anInt954);
						}
					}
					if (local19 == 447) {
						local139 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local139 != null) {
							this.method589(2, false, 0, 1, local139.anIntArray115[0], 1, 0, local139.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(163, 132);
							this.aClass3_Sub1_Sub2_8.method226(local24);
						}
					}
					if (local19 == 485) {
						this.aClass3_Sub1_Sub2_8.method189(117, 132);
						this.aClass3_Sub1_Sub2_8.method227(local24);
						this.aClass3_Sub1_Sub2_8.method225(local9);
						this.aClass3_Sub1_Sub2_8.method227(local14);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 377) {
						this.aClass3_Sub1_Sub2_8.method189(226, 132);
						this.aClass3_Sub1_Sub2_8.method227(local9);
						this.aClass3_Sub1_Sub2_8.method191(local24);
						this.aClass3_Sub1_Sub2_8.method225(local14);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 181) {
						this.aClass3_Sub1_Sub2_8.method189(140, 132);
						this.aClass3_Sub1_Sub2_8.method225(local9);
						this.aClass3_Sub1_Sub2_8.method226(local14);
						this.aClass3_Sub1_Sub2_8.method227(local24);
						this.anInt1007 = 0;
						this.anInt1008 = local14;
						this.anInt1009 = local9;
						this.anInt1010 = 2;
						if (Class15.method147(local14).anInt299 == this.anInt868) {
							this.anInt1010 = 1;
						}
						if (Class15.method147(local14).anInt299 == this.anInt1046) {
							this.anInt1010 = 3;
						}
					}
					if (local19 == 359) {
						local498 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local498 != null) {
							this.method589(2, false, 0, 1, local498.anIntArray115[0], 1, 0, local498.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(134, 132);
							this.aClass3_Sub1_Sub2_8.method225(local24);
						}
					}
					if (local19 == 403) {
						local139 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local139 != null) {
							this.method589(2, false, 0, 1, local139.anIntArray115[0], 1, 0, local139.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(21, 132);
							this.aClass3_Sub1_Sub2_8.method225(local24);
							this.aClass3_Sub1_Sub2_8.method225(this.anInt964);
						}
					}
					if (local19 == 588) {
						this.method590(local9, this.aByte47, local14, local24);
						this.aClass3_Sub1_Sub2_8.method189(9, 132);
						this.aClass3_Sub1_Sub2_8.method225(local14 + this.anInt897);
						this.aClass3_Sub1_Sub2_8.method226(local24 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub2_8.method227(local9 + this.anInt896);
					}
					if (local19 == 405 && !this.aBoolean247) {
						this.aClass3_Sub1_Sub2_8.method189(154, 132);
						this.aClass3_Sub1_Sub2_8.method191(local14);
						this.aBoolean247 = true;
					}
					if (local19 == 963) {
						this.anInt953 = 1;
						this.anInt954 = local9;
						this.anInt955 = local14;
						this.anInt956 = local24;
						this.aString22 = Class25.method347(local24).aString13;
						this.anInt963 = 0;
						this.aBoolean253 = true;
					} else {
						if (local19 == 98) {
							local580 = this.method589(2, false, 0, 0, local9, 0, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							if (!local580) {
								this.method589(2, false, 0, 1, local9, 1, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							}
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(105, 132);
							this.aClass3_Sub1_Sub2_8.method227(local14 + this.anInt897);
							this.aClass3_Sub1_Sub2_8.method225(local24);
							this.aClass3_Sub1_Sub2_8.method226(local9 + this.anInt896);
						}
						if (local19 == 16) {
							if (this.aBoolean230) {
								this.aClass34_1.method500((byte) 3, local14 - 4, local9 - 4);
							} else {
								this.aClass34_1.method500((byte) 3, super.anInt840 - 4, super.anInt839 - 4);
							}
						}
						if (local19 == 538) {
							local580 = this.method589(2, false, 0, 0, local9, 0, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							if (!local580) {
								this.method589(2, false, 0, 1, local9, 1, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							}
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							this.aClass3_Sub1_Sub2_8.method189(104, 132);
							this.aClass3_Sub1_Sub2_8.method226(local9 + this.anInt896);
							this.aClass3_Sub1_Sub2_8.method191(local14 + this.anInt897);
							this.aClass3_Sub1_Sub2_8.method225(this.anInt964);
							this.aClass3_Sub1_Sub2_8.method191(local24);
						}
						if (local19 == 689) {
							local580 = this.method589(2, false, 0, 0, local9, 0, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							if (!local580) {
								this.method589(2, false, 0, 1, local9, 1, 0, local14, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
							}
							this.anInt1031 = super.anInt839;
							this.anInt1032 = super.anInt840;
							this.anInt1034 = 2;
							this.anInt1033 = 0;
							anInt941 += local14;
							if (anInt941 >= 102) {
								this.aClass3_Sub1_Sub2_8.method189(30, 132);
								this.aClass3_Sub1_Sub2_8.method194(0);
								anInt941 = 0;
							}
							this.aClass3_Sub1_Sub2_8.method189(57, 132);
							this.aClass3_Sub1_Sub2_8.method191(local24);
							this.aClass3_Sub1_Sub2_8.method191(local9 + this.anInt896);
							this.aClass3_Sub1_Sub2_8.method226(local14 + this.anInt897);
						}
						if (local19 == 787) {
							local362 = this.aStringArray14[arg0];
							local114 = local362.indexOf("@whi@");
							if (local114 != -1) {
								if (this.anInt868 == -1) {
									this.method629((byte) 6);
									this.aString30 = local362.substring(local114 + 5).trim();
									this.aBoolean235 = false;
									this.anInt1002 = this.anInt868 = Class15.anInt286;
								} else {
									this.method594(0, "", "Please close the interface you have open before using 'report abuse'");
								}
							}
						}
						if (local19 == 515) {
							local139 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local24];
							if (local139 != null) {
								this.method589(2, false, 0, 1, local139.anIntArray115[0], 1, 0, local139.anIntArray116[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
								this.anInt1031 = super.anInt839;
								this.anInt1032 = super.anInt840;
								this.anInt1034 = 2;
								this.anInt1033 = 0;
								this.aClass3_Sub1_Sub2_8.method189(16, 132);
								this.aClass3_Sub1_Sub2_8.method226(local24);
							}
						}
						if (local19 == 395) {
							this.aClass3_Sub1_Sub2_8.method189(137, 132);
							this.aClass3_Sub1_Sub2_8.method225(local14);
							this.aClass3_Sub1_Sub2_8.method191(this.anInt955);
							this.aClass3_Sub1_Sub2_8.method225(this.anInt956);
							this.aClass3_Sub1_Sub2_8.method226(this.anInt954);
							this.aClass3_Sub1_Sub2_8.method226(local9);
							this.aClass3_Sub1_Sub2_8.method225(local24);
							this.anInt1007 = 0;
							this.anInt1008 = local14;
							this.anInt1009 = local9;
							this.anInt1010 = 2;
							if (Class15.method147(local14).anInt299 == this.anInt868) {
								this.anInt1010 = 1;
							}
							if (Class15.method147(local14).anInt299 == this.anInt1046) {
								this.anInt1010 = 3;
							}
						}
						if (local19 == 152) {
							if ((local9 & 0x3) == 0) {
								anInt910++;
							}
							if (anInt910 >= 129) {
								this.aClass3_Sub1_Sub2_8.method189(87, 132);
								this.aClass3_Sub1_Sub2_8.method191(37562);
								anInt910 = 0;
							}
							this.aClass3_Sub1_Sub2_8.method189(176, 132);
							this.aClass3_Sub1_Sub2_8.method191(local14);
							this.aClass3_Sub1_Sub2_8.method191(local9);
							this.aClass3_Sub1_Sub2_8.method191(local24);
							this.anInt1007 = 0;
							this.anInt1008 = local14;
							this.anInt1009 = local9;
							this.anInt1010 = 2;
							if (Class15.method147(local14).anInt299 == this.anInt868) {
								this.anInt1010 = 1;
							}
							if (Class15.method147(local14).anInt299 == this.anInt1046) {
								this.anInt1010 = 3;
							}
						}
						if (local19 == 419 && this.method590(local9, this.aByte47, local14, local24)) {
							this.aClass3_Sub1_Sub2_8.method189(18, 132);
							this.aClass3_Sub1_Sub2_8.method227(this.anInt956);
							this.aClass3_Sub1_Sub2_8.method226(local24 >> 14 & 0x7FFF);
							this.aClass3_Sub1_Sub2_8.method191(this.anInt954);
							this.aClass3_Sub1_Sub2_8.method225(local9 + this.anInt896);
							this.aClass3_Sub1_Sub2_8.method227(this.anInt955);
							this.aClass3_Sub1_Sub2_8.method191(local14 + this.anInt897);
						}
						this.anInt953 = 0;
						this.anInt963 = 0;
						this.aBoolean253 = true;
					}
				}
			}
		} catch (@Pc(3489) RuntimeException local3489) {
			signlink.reporterror("35095, " + -415 + ", " + arg0 + ", " + local3489.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!MLYYHULT;I)V")
	private void method646(@OriginalArg(1) Class3_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt970; local1++) {
				@Pc(8) int local8 = this.anIntArray245[local1];
				@Pc(13) Class3_Sub1_Sub1_Sub2_Sub1 local13 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local8];
				@Pc(16) int local16 = arg0.method200();
				if ((local16 & 0x4) != 0) {
					local16 += arg0.method200() << 8;
				}
				this.method628(local16, local13, local8, arg0);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("96050, " + -8 + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method647() {
		try {
			@Pc(14) int local14;
			@Pc(21) int local21;
			if (this.anInt1026 == 0) {
				local14 = super.anInt829 / 2 - 80;
				local21 = super.anInt830 / 2 + 20;
				local21 += 20;
				if (super.anInt838 == 1 && super.anInt839 >= local14 - 75 && super.anInt839 <= local14 + 75 && super.anInt840 >= local21 - 20 && super.anInt840 <= local21 + 20) {
					this.anInt1026 = 3;
					this.anInt937 = 0;
				}
				local14 = super.anInt829 / 2 + 80;
				if (super.anInt838 == 1 && super.anInt839 >= local14 - 75 && super.anInt839 <= local14 + 75 && super.anInt840 >= local21 - 20 && super.anInt840 <= local21 + 20) {
					this.aString26 = "";
					this.aString27 = "Enter your username & password.";
					this.anInt1026 = 2;
					this.anInt937 = 0;
				}
			} else if (this.anInt1026 == 2) {
				local14 = super.anInt830 / 2 - 40;
				local14 += 30;
				local14 += 25;
				if (super.anInt838 == 1 && super.anInt840 >= local14 - 15 && super.anInt840 < local14) {
					this.anInt937 = 0;
				}
				local14 += 15;
				if (super.anInt838 == 1 && super.anInt840 >= local14 - 15 && super.anInt840 < local14) {
					this.anInt937 = 1;
				}
				local14 += 15;
				local21 = super.anInt829 / 2 - 80;
				@Pc(167) int local167 = super.anInt830 / 2 + 50;
				@Pc(168) int local168 = local167 + 20;
				if (super.anInt838 == 1 && super.anInt839 >= local21 - 75 && super.anInt839 <= local21 + 75 && super.anInt840 >= local168 - 20 && super.anInt840 <= local168 + 20) {
					this.anInt924 = 0;
					this.method710(this.aString28, this.aString29, false);
					if (this.aBoolean233) {
						return;
					}
				}
				local21 = super.anInt829 / 2 + 80;
				if (super.anInt838 == 1 && super.anInt839 >= local21 - 75 && super.anInt839 <= local21 + 75 && super.anInt840 >= local168 - 20 && super.anInt840 <= local168 + 20) {
					this.anInt1026 = 0;
					this.aString28 = "";
					this.aString29 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method580((byte) 6);
						if (local258 == -1) {
							return;
						}
						@Pc(263) boolean local263 = false;
						for (@Pc(265) int local265 = 0; local265 < aString17.length(); local265++) {
							if (local258 == aString17.charAt(local265)) {
								local263 = true;
								break;
							}
						}
						if (this.anInt937 == 0) {
							if (local258 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt937 = 1;
							}
							if (local263) {
								this.aString28 = this.aString28 + (char) local258;
							}
							if (this.aString28.length() > 12) {
								this.aString28 = this.aString28.substring(0, 12);
							}
						} else if (this.anInt937 == 1) {
							if (local258 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt937 = 0;
							}
							if (local263) {
								this.aString29 = this.aString29 + (char) local258;
							}
							if (this.aString29.length() > 20) {
								this.aString29 = this.aString29.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1026 == 3) {
				local14 = super.anInt829 / 2;
				local21 = super.anInt830 / 2 + 50;
				@Pc(422) int local422 = local21 + 20;
				if (super.anInt838 == 1 && super.anInt839 >= local14 - 75 && super.anInt839 <= local14 + 75 && super.anInt840 >= local422 - 20 && super.anInt840 <= local422 + 20) {
					this.anInt1026 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("44590, " + -599 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!HWEMRKQZ;)I")
	private int method648(@OriginalArg(0) int arg0, @OriginalArg(2) Class15 arg1) {
		try {
			if (arg1.anIntArrayArray14 == null || arg0 >= arg1.anIntArrayArray14.length) {
				return -2;
			}
			try {
				@Pc(26) int[] local26 = arg1.anIntArrayArray14[arg0];
				@Pc(28) int local28 = 0;
				@Pc(30) int local30 = 0;
				@Pc(32) byte local32 = 0;
				while (true) {
					@Pc(37) int local37 = local26[local30++];
					@Pc(39) int local39 = 0;
					@Pc(41) byte local41 = 0;
					if (local37 == 0) {
						return local28;
					}
					if (local37 == 1) {
						local39 = this.anIntArray255[local26[local30++]];
					}
					if (local37 == 2) {
						local39 = this.anIntArray271[local26[local30++]];
					}
					if (local37 == 3) {
						local39 = this.anIntArray256[local26[local30++]];
					}
					@Pc(87) Class15 local87;
					@Pc(92) int local92;
					@Pc(105) int local105;
					if (local37 == 4) {
						local87 = Class15.method147(local26[local30++]);
						local92 = local26[local30++];
						if (local92 >= 0 && local92 < Class25.anInt513 && (!Class25.method347(local92).aBoolean140 || aBoolean236)) {
							for (local105 = 0; local105 < local87.anIntArray106.length; local105++) {
								if (local87.anIntArray106[local105] == local92 + 1) {
									local39 += local87.anIntArray112[local105];
								}
							}
						}
					}
					if (local37 == 5) {
						local39 = this.anIntArray232[local26[local30++]];
					}
					if (local37 == 6) {
						local39 = anIntArray212[this.anIntArray271[local26[local30++]] - 1];
					}
					if (local37 == 7) {
						local39 = this.anIntArray232[local26[local30++]] * 100 / 46875;
					}
					if (local37 == 8) {
						local39 = aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt148;
					}
					@Pc(180) int local180;
					if (local37 == 9) {
						for (local180 = 0; local180 < Class14.anInt270; local180++) {
							if (Class14.aBooleanArray8[local180]) {
								local39 += this.anIntArray271[local180];
							}
						}
					}
					if (local37 == 10) {
						local87 = Class15.method147(local26[local30++]);
						local92 = local26[local30++] + 1;
						if (local92 >= 0 && local92 < Class25.anInt513 && (!Class25.method347(local92).aBoolean140 || aBoolean236)) {
							for (local105 = 0; local105 < local87.anIntArray106.length; local105++) {
								if (local87.anIntArray106[local105] == local92) {
									local39 = 999999999;
									break;
								}
							}
						}
					}
					if (local37 == 11) {
						local39 = this.anInt857;
					}
					if (local37 == 12) {
						local39 = this.anInt971;
					}
					if (local37 == 13) {
						local180 = this.anIntArray232[local26[local30++]];
						local92 = local26[local30++];
						local39 = (local180 & 0x1 << local92) == 0 ? 0 : 1;
					}
					if (local37 == 14) {
						local180 = local26[local30++];
						@Pc(294) Class41 local294 = Class41.aClass41Array1[local180];
						local105 = local294.anInt750;
						@Pc(300) int local300 = local294.anInt751;
						@Pc(303) int local303 = local294.anInt752;
						@Pc(309) int local309 = anIntArray213[local303 - local300];
						local39 = this.anIntArray232[local105] >> local300 & local309;
					}
					if (local37 == 15) {
						local41 = 1;
					}
					if (local37 == 16) {
						local41 = 2;
					}
					if (local37 == 17) {
						local41 = 3;
					}
					if (local37 == 18) {
						local39 = (aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt330 >> 7) + this.anInt896;
					}
					if (local37 == 19) {
						local39 = (aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt331 >> 7) + this.anInt897;
					}
					if (local37 == 20) {
						local39 = local26[local30++];
					}
					if (local41 == 0) {
						if (local32 == 0) {
							local28 += local39;
						}
						if (local32 == 1) {
							local28 -= local39;
						}
						if (local32 == 2 && local39 != 0) {
							local28 /= local39;
						}
						if (local32 == 3) {
							local28 *= local39;
						}
						local32 = 0;
					} else {
						local32 = local41;
					}
				}
			} catch (@Pc(402) Exception local402) {
				return -1;
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("95333, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local405.toString());
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
				return new URL("http://127.0.0.1:" + (anInt936 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method649(@OriginalArg(0) int arg0) {
		try {
			this.method632();
			if (this.anInt1034 == 1) {
				this.aClass3_Sub1_Sub4_Sub4Array9[this.anInt1033 / 100].method449(this.anInt1031 - 8 - 4, this.anInt1032 - 8 - 4, (byte) 2);
			}
			if (this.anInt1034 == 2) {
				this.aClass3_Sub1_Sub4_Sub4Array9[this.anInt1033 / 100 + 4].method449(this.anInt1031 - 8 - 4, this.anInt1032 - 8 - 4, (byte) 2);
			}
			if (this.anInt997 != -1) {
				this.method595(this.anInt997, this.anInt907);
				this.method667((byte) 3, 0, 0, 0, Class15.method147(this.anInt997));
			}
			if (this.anInt868 != -1) {
				this.method595(this.anInt868, this.anInt907);
				this.method667((byte) 3, 0, 0, 0, Class15.method147(this.anInt868));
			}
			this.method637(477);
			@Pc(107) int local107;
			if (arg0 != this.anInt1005) {
				for (local107 = 1; local107 > 0; local107++) {
				}
			}
			if (!this.aBoolean230) {
				this.method722();
				this.method607();
			} else if (this.anInt1012 == 0) {
				this.method666(aBoolean223);
			}
			if (this.anInt869 == 1) {
				this.aClass3_Sub1_Sub4_Sub4_16.method449(472, 296, (byte) 2);
			}
			@Pc(179) int local179;
			if (aBoolean252) {
				@Pc(145) byte local145 = 20;
				@Pc(147) int local147 = 16776960;
				if (super.anInt828 < 30 && aBoolean237) {
					local147 = 16711680;
				}
				if (super.anInt828 < 20 && !aBoolean237) {
					local147 = 16711680;
				}
				this.aClass3_Sub1_Sub4_Sub3_3.method414(20, local147, "Fps:" + super.anInt828);
				local179 = local145 + 15;
				@Pc(181) Runtime local181 = Runtime.getRuntime();
				@Pc(190) int local190 = (int) ((local181.totalMemory() - local181.freeMemory()) / 1024L);
				if (local190 > 33554432 && aBoolean237) {
				}
				if (local190 > 67108864 && !aBoolean237) {
				}
				this.aClass3_Sub1_Sub4_Sub3_3.method414(35, 16776960, "Mem:" + local190 + "k");
				local179 += 15;
			}
			if (this.anInt947 != 0) {
				local107 = this.anInt947 / 50;
				local179 = local107 / 60;
				local107 %= 60;
				if (local107 < 10) {
					this.aClass3_Sub1_Sub4_Sub3_3.method419(16776960, 4, 329, "System update in: " + local179 + ":0" + local107);
				} else {
					this.aClass3_Sub1_Sub4_Sub3_3.method419(16776960, 4, 329, "System update in: " + local179 + ":" + local107);
				}
			}
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("37110, " + arg0 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!MLYYHULT;)V")
	private void method650(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			@Pc(16) int local16;
			@Pc(20) int local20;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(33) int local33;
			@Pc(37) int local37;
			@Pc(46) int local46;
			@Pc(53) int local53;
			@Pc(73) int local73;
			@Pc(85) int local85;
			@Pc(99) int local99;
			@Pc(111) int local111;
			if (arg0 == 126) {
				local16 = arg1.method202();
				local20 = arg1.method220();
				local24 = local20 >> 2;
				local28 = local20 & 0x3;
				local33 = this.anIntArray225[local24];
				local37 = arg1.method219();
				local46 = this.anInt1037 + (local37 >> 4 & 0x7);
				local53 = this.anInt1038 + (local37 & 0x7);
				if (local46 >= 0 && local53 >= 0 && local46 < 103 && local53 < 103) {
					local73 = this.anIntArrayArrayArray7[this.anInt1052][local46][local53];
					local85 = this.anIntArrayArrayArray7[this.anInt1052][local46 + 1][local53];
					local99 = this.anIntArrayArrayArray7[this.anInt1052][local46 + 1][local53 + 1];
					local111 = this.anIntArrayArrayArray7[this.anInt1052][local46][local53 + 1];
					if (local33 == 0) {
						@Pc(122) Class45 local122 = this.aClass34_1.method484(this.anInt1052, local53, local46);
						if (local122 != null) {
							@Pc(131) int local131 = local122.anInt774 >> 14 & 0x7FFF;
							if (local24 == 2) {
								local122.aClass3_Sub1_Sub1_7 = new Class3_Sub1_Sub1_Sub3(false, local28 + 4, local131, (byte) 6, 2, local73, local85, local99, local16, local111);
								local122.aClass3_Sub1_Sub1_8 = new Class3_Sub1_Sub1_Sub3(false, local28 + 1 & 0x3, local131, (byte) 6, 2, local73, local85, local99, local16, local111);
							} else {
								local122.aClass3_Sub1_Sub1_7 = new Class3_Sub1_Sub1_Sub3(false, local28, local131, (byte) 6, local24, local73, local85, local99, local16, local111);
							}
						}
					}
					if (local33 == 1) {
						@Pc(199) Class31 local199 = this.aClass34_1.method485(this.anInt1052, local46, local53);
						if (local199 != null) {
							local199.aClass3_Sub1_Sub1_6 = new Class3_Sub1_Sub1_Sub3(false, 0, local199.anInt607 >> 14 & 0x7FFF, (byte) 6, 4, local73, local85, local99, local16, local111);
						}
					}
					if (local33 == 2) {
						@Pc(233) Class21 local233 = this.aClass34_1.method486(this.anInt1052, local53, local46);
						if (local24 == 11) {
							local24 = 10;
						}
						if (local233 != null) {
							local233.aClass3_Sub1_Sub1_5 = new Class3_Sub1_Sub1_Sub3(false, local28, local233.anInt485 >> 14 & 0x7FFF, (byte) 6, local24, local73, local85, local99, local16, local111);
						}
					}
					if (local33 == 3) {
						@Pc(272) Class9 local272 = this.aClass34_1.method487(local46, local53, 344, this.anInt1052);
						if (local272 != null) {
							local272.aClass3_Sub1_Sub1_4 = new Class3_Sub1_Sub1_Sub3(false, local28, local272.anInt217 >> 14 & 0x7FFF, (byte) 6, 22, local73, local85, local99, local16, local111);
						}
					}
				}
			} else if (arg0 == 175) {
				local16 = arg1.method200();
				local20 = this.anInt1037 + (local16 >> 4 & 0x7);
				local24 = this.anInt1038 + (local16 & 0x7);
				local28 = arg1.method202();
				local33 = arg1.method200();
				local37 = arg1.method202();
				if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
					local20 = local20 * 128 + 64;
					local24 = local24 * 128 + 64;
					@Pc(369) Class3_Sub1_Sub1_Sub4 local369 = new Class3_Sub1_Sub1_Sub4(local37, local24, this.method605(this.anInt1052, local20, local24) - local33, local28, this.anInt1052, false, anInt1000, local20);
					this.aClass50_12.method568(local369);
				}
			} else {
				if (arg0 == 40) {
					local16 = arg1.method200();
					local20 = this.anInt1037 + (local16 >> 4 & 0x7);
					local24 = this.anInt1038 + (local16 & 0x7);
					local28 = arg1.method202();
					local33 = arg1.method200();
					local37 = local33 >> 4 & 0xF;
					local46 = local33 & 0x7;
					if (aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0] >= local20 - local37 && aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0] <= local20 + local37 && aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0] >= local24 - local37 && aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0] <= local24 + local37 && this.aBoolean240 && !aBoolean237 && this.anInt1036 < 50) {
						this.anIntArray226[this.anInt1036] = local28;
						this.anIntArray266[this.anInt1036] = local46;
						this.anIntArray272[this.anInt1036] = Class2.anIntArray2[local28];
						this.anInt1036++;
					}
				}
				if (arg0 == 164) {
					local16 = arg1.method220();
					local20 = this.anInt1037 + (local16 >> 4 & 0x7);
					local24 = this.anInt1038 + (local16 & 0x7);
					local28 = arg1.method200();
					local33 = local28 >> 2;
					local37 = local28 & 0x3;
					local46 = this.anIntArray225[local33];
					if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
						this.method635(local33, -1, -1, local20, local24, local37, local46, 0, this.anInt1052);
					}
				} else {
					@Pc(605) int local605;
					if (arg0 == 255) {
						local16 = arg1.method228();
						@Pc(553) byte local553 = arg1.method223();
						local24 = arg1.method229();
						@Pc(561) byte local561 = arg1.method224();
						@Pc(565) byte local565 = arg1.method224();
						local37 = arg1.method200();
						local46 = this.anInt1037 + (local37 >> 4 & 0x7);
						local53 = this.anInt1038 + (local37 & 0x7);
						local73 = arg1.method230(anInt908);
						local85 = arg1.method221();
						local99 = local85 >> 2;
						local111 = local85 & 0x3;
						local605 = this.anIntArray225[local99];
						@Pc(609) byte local609 = arg1.method222();
						@Pc(613) int local613 = arg1.method230(anInt908);
						@Pc(619) Class3_Sub1_Sub1_Sub2_Sub1 local619;
						if (local16 == this.anInt987) {
							local619 = aClass3_Sub1_Sub1_Sub2_Sub1_1;
						} else {
							local619 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local16];
						}
						if (local619 != null) {
							@Pc(631) Class19 local631 = Class19.method182(local613);
							@Pc(641) int local641 = this.anIntArrayArrayArray7[this.anInt1052][local46][local53];
							@Pc(653) int local653 = this.anIntArrayArrayArray7[this.anInt1052][local46 + 1][local53];
							@Pc(667) int local667 = this.anIntArrayArrayArray7[this.anInt1052][local46 + 1][local53 + 1];
							@Pc(679) int local679 = this.anIntArrayArrayArray7[this.anInt1052][local46][local53 + 1];
							@Pc(689) Class3_Sub1_Sub1_Sub1 local689 = local631.method183(local99, local111, local641, local653, local667, local679, -1);
							if (local689 != null) {
								this.method635(0, -1, local73 + 1, local46, local53, 0, local605, local24 + 1, this.anInt1052);
								local619.anInt150 = local24 + anInt1000;
								local619.anInt151 = local73 + anInt1000;
								local619.aClass3_Sub1_Sub1_Sub1_2 = local689;
								@Pc(724) int local724 = local631.anInt375;
								@Pc(727) int local727 = local631.anInt381;
								if (local111 == 1 || local111 == 3) {
									local724 = local631.anInt381;
									local727 = local631.anInt375;
								}
								local619.anInt152 = local46 * 128 + local724 * 64;
								local619.anInt154 = local53 * 128 + local727 * 64;
								local619.anInt153 = this.method605(this.anInt1052, local619.anInt152, local619.anInt154);
								@Pc(773) byte local773;
								if (local565 > local561) {
									local773 = local565;
									local565 = local561;
									local561 = local773;
								}
								if (local609 > local553) {
									local773 = local609;
									local609 = local553;
									local553 = local773;
								}
								local619.anInt143 = local46 + local565;
								local619.anInt145 = local46 + local561;
								local619.anInt144 = local53 + local609;
								local619.anInt146 = local53 + local553;
							}
						}
					}
					if (arg0 == 198) {
						local16 = arg1.method221();
						local20 = this.anInt1037 + (local16 >> 4 & 0x7);
						local24 = this.anInt1038 + (local16 & 0x7);
						local28 = arg1.method202();
						local33 = arg1.method220();
						local37 = local33 >> 2;
						local46 = local33 & 0x3;
						local53 = this.anIntArray225[local37];
						if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
							this.method635(local37, local28, -1, local20, local24, local46, local53, 0, this.anInt1052);
						}
					} else if (arg0 == 146) {
						local16 = arg1.method200();
						local20 = this.anInt1037 + (local16 >> 4 & 0x7);
						local24 = this.anInt1038 + (local16 & 0x7);
						local28 = local20 + arg1.method201();
						local33 = local24 + arg1.method201();
						local37 = arg1.method203();
						local46 = arg1.method202();
						local53 = arg1.method200() * 4;
						local73 = arg1.method200() * 4;
						local85 = arg1.method202();
						local99 = arg1.method202();
						local111 = arg1.method200();
						local605 = arg1.method200();
						if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104 && local28 >= 0 && local33 >= 0 && local28 < 104 && local33 < 104 && local46 != 65535) {
							local20 = local20 * 128 + 64;
							local24 = local24 * 128 + 64;
							local28 = local28 * 128 + 64;
							local33 = local33 * 128 + 64;
							@Pc(1009) Class3_Sub1_Sub1_Sub5 local1009 = new Class3_Sub1_Sub1_Sub5(local46, local85 + anInt1000, local99 + anInt1000, local37, local24, local111, local20, this.anInt1052, (byte) -53, local605, local73, this.method605(this.anInt1052, local20, local24) - local53);
							local1009.method558(local33, local85 + anInt1000, this.method605(this.anInt1052, local28, local33) - local73, local28);
							this.aClass50_10.method568(local1009);
						}
					} else if (arg0 == 2) {
						local16 = arg1.method200();
						local20 = this.anInt1037 + (local16 >> 4 & 0x7);
						local24 = this.anInt1038 + (local16 & 0x7);
						local28 = arg1.method202();
						local33 = arg1.method202();
						local37 = arg1.method202();
						if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
							@Pc(1082) Class50 local1082 = this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24];
							if (local1082 != null) {
								for (@Pc(1088) Class3_Sub1_Sub1_Sub6 local1088 = (Class3_Sub1_Sub1_Sub6) local1082.method571(); local1088 != null; local1088 = (Class3_Sub1_Sub1_Sub6) local1082.method573((byte) 3)) {
									if (local1088.anInt801 == (local28 & 0x7FFF) && local1088.anInt800 == local33) {
										local1088.anInt800 = local37;
										break;
									}
								}
								this.method718(local20, local24);
							}
						}
					} else if (arg0 == 65) {
						local16 = arg1.method200();
						local20 = this.anInt1037 + (local16 >> 4 & 0x7);
						local24 = this.anInt1038 + (local16 & 0x7);
						local28 = arg1.method229();
						local33 = arg1.method202();
						local37 = arg1.method202();
						if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104 && local33 != this.anInt987) {
							@Pc(1167) Class3_Sub1_Sub1_Sub6 local1167 = new Class3_Sub1_Sub1_Sub6();
							local1167.anInt801 = local37;
							local1167.anInt800 = local28;
							if (this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24] == null) {
								this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24] = new Class50(708);
							}
							this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24].method568(local1167);
							this.method718(local20, local24);
						}
					} else {
						@Pc(1265) Class3_Sub1_Sub1_Sub6 local1265;
						if (arg0 == 121) {
							local16 = arg1.method221();
							local20 = this.anInt1037 + (local16 >> 4 & 0x7);
							local24 = this.anInt1038 + (local16 & 0x7);
							local28 = arg1.method230(anInt908);
							if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
								@Pc(1259) Class50 local1259 = this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24];
								if (local1259 != null) {
									for (local1265 = (Class3_Sub1_Sub1_Sub6) local1259.method571(); local1265 != null; local1265 = (Class3_Sub1_Sub1_Sub6) local1259.method573((byte) 3)) {
										if (local1265.anInt801 == (local28 & 0x7FFF)) {
											local1265.method559();
											break;
										}
									}
									if (local1259.method571() == null) {
										this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24] = null;
									}
									this.method718(local20, local24);
								}
							}
						} else if (arg0 == 250) {
							local16 = arg1.method200();
							local20 = this.anInt1037 + (local16 >> 4 & 0x7);
							local24 = this.anInt1038 + (local16 & 0x7);
							local28 = arg1.method229();
							local33 = arg1.method230(anInt908);
							if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
								local1265 = new Class3_Sub1_Sub1_Sub6();
								local1265.anInt801 = local28;
								local1265.anInt800 = local33;
								if (this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24] == null) {
									this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24] = new Class50(708);
								}
								this.aClass50ArrayArrayArray1[this.anInt1052][local20][local24].method568(local1265);
								this.method718(local20, local24);
							}
						}
					}
				}
			}
		} catch (@Pc(1392) RuntimeException local1392) {
			signlink.reporterror("87503, " + arg0 + ", " + 47935 + ", " + arg1 + ", " + local1392.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
	private boolean method652(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt1056; local7++) {
				if (arg1.equalsIgnoreCase(this.aStringArray9[local7])) {
					return true;
				}
			}
			@Pc(28) boolean local28 = false;
			return arg1.equalsIgnoreCase(aClass3_Sub1_Sub1_Sub2_Sub1_1.aString3);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("39709, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!HWEMRKQZ;I)Z")
	private boolean method653(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				this.aClass3_Sub1_Sub2_8.method190(252);
			}
			@Pc(10) int local10 = arg0.anInt304;
			if (this.anInt1057 == 2) {
				if (local10 == 201) {
					this.aBoolean255 = true;
					this.anInt933 = 0;
					this.aBoolean244 = true;
					this.aString25 = "";
					this.anInt932 = 1;
					this.aString19 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean255 = true;
					this.anInt933 = 0;
					this.aBoolean244 = true;
					this.aString25 = "";
					this.anInt932 = 2;
					this.aString19 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt849 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean255 = true;
				this.anInt933 = 0;
				this.aBoolean244 = true;
				this.aString25 = "";
				this.anInt932 = 4;
				this.aString19 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean255 = true;
				this.anInt933 = 0;
				this.aBoolean244 = true;
				this.aString25 = "";
				this.anInt932 = 5;
				this.aString19 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray230[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class20.anInt440 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class20.anInt440) {
								local127 = 0;
							}
						}
						if (!Class20.aClass20Array1[local127].aBoolean118 && Class20.aClass20Array1[local127].anInt441 == local118 + (this.aBoolean225 ? 0 : 7)) {
							this.anIntArray230[local118] = local127;
							this.aBoolean257 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray231[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray24[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray24[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray231[local118] = local127;
				this.aBoolean257 = true;
			}
			if (local10 == 324 && !this.aBoolean225) {
				this.aBoolean225 = true;
				this.method591();
			}
			if (local10 == 325 && this.aBoolean225) {
				this.aBoolean225 = false;
				this.method591();
			}
			if (local10 == 326) {
				this.aClass3_Sub1_Sub2_8.method189(205, 132);
				this.aClass3_Sub1_Sub2_8.method190(this.aBoolean225 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass3_Sub1_Sub2_8.method190(this.anIntArray230[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass3_Sub1_Sub2_8.method190(this.anIntArray231[local122]);
				}
				return true;
			}
			if (local10 == 620) {
				this.aBoolean235 = !this.aBoolean235;
			}
			if (local10 >= 601 && local10 <= 613) {
				this.method629((byte) 6);
				if (this.aString30.length() > 0) {
					this.aClass3_Sub1_Sub2_8.method189(3, 132);
					this.aClass3_Sub1_Sub2_8.method196(Class43.method544(this.aString30), this.aByte42);
					this.aClass3_Sub1_Sub2_8.method190(local10 - 601);
					this.aClass3_Sub1_Sub2_8.method190(this.aBoolean235 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("65424, " + arg0 + ", " + arg1 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method654(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt901; local6++) {
				@Pc(16) Class3_Sub1_Sub1_Sub2_Sub2 local16 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray229[local6]];
				@Pc(25) int local25 = (this.anIntArray229[local6] << 14) + 536870912;
				if (local16 != null && local16.method157() && local16.aClass40_2.aBoolean194 == arg0 && local16.aClass40_2.method532()) {
					@Pc(46) int local46 = local16.anInt330 >> 7;
					@Pc(51) int local51 = local16.anInt331 >> 7;
					if (local46 >= 0 && local46 < 104 && local51 >= 0 && local51 < 104) {
						if (local16.anInt323 == 1 && (local16.anInt330 & 0x7F) == 64 && (local16.anInt331 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local46][local51] == this.anInt1029) {
								continue;
							}
							this.anIntArrayArray22[local46][local51] = this.anInt1029;
						}
						if (!local16.aClass40_2.aBoolean193) {
							local25 += Integer.MIN_VALUE;
						}
						this.aClass34_1.method473(local16.anInt332, local16.anInt331, local16.aBoolean71, (local16.anInt323 - 1) * 64 + 60, local16, this.anInt1052, this.method605(this.anInt1052, local16.anInt330, local16.anInt331), local16.anInt330, local25);
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("89838, " + 1 + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Z")
	private boolean method655(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray219[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 696;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("66928, " + -86 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
	private void method656(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (this.aBoolean221) {
				signlink.anInt1080 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("62914, " + arg0 + ", " + 36 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method657() {
		try {
			this.anInt845 += 0;
			while (true) {
				@Pc(11) Class3_Sub1_Sub3 local11 = this.aClass8_Sub1_1.method134();
				if (local11 == null) {
					return;
				}
				if (local11.anInt435 == 0) {
					Class3_Sub1_Sub1_Sub1.method20(local11.anInt436, local11.aByteArray15);
					if ((this.aClass8_Sub1_1.method125(local11.anInt436) & 0x62) != 0) {
						this.aBoolean253 = true;
						if (this.anInt1046 != -1 || this.anInt1060 != -1) {
							this.aBoolean255 = true;
						}
					}
				}
				if (local11.anInt435 == 1 && local11.aByteArray15 != null) {
					Class7.method91(792, local11.aByteArray15);
				}
				if (local11.anInt435 == 2 && local11.anInt436 == this.anInt855 && local11.aByteArray15 != null) {
					this.method656(local11.aByteArray15, this.aBoolean218);
				}
				if (local11.anInt435 == 3 && this.anInt1028 == 1) {
					for (@Pc(86) int local86 = 0; local86 < this.aByteArrayArray5.length; local86++) {
						if (this.anIntArray258[local86] == local11.anInt436) {
							this.aByteArrayArray5[local86] = local11.aByteArray15;
							if (local11.aByteArray15 == null) {
								this.anIntArray258[local86] = -1;
							}
							break;
						}
						if (this.anIntArray259[local86] == local11.anInt436) {
							this.aByteArrayArray6[local86] = local11.aByteArray15;
							if (local11.aByteArray15 == null) {
								this.anIntArray259[local86] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt435 == 93 && this.aClass8_Sub1_1.method119((byte) 2, local11.anInt436)) {
					Class4.method77(this.aClass8_Sub1_1, new Class3_Sub1_Sub2(true, local11.aByteArray15));
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("85521, " + 0 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!VWKJSKWX;III)V")
	private void method658(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt1047 < 400) {
				if (arg0.anIntArray200 != null) {
					arg0 = arg0.method533();
				}
				if (arg0 != null && arg0.aBoolean193) {
					@Pc(23) String local23 = arg0.aString15;
					@Pc(29) int local29;
					if (this.aByte45 != 25) {
						for (local29 = 1; local29 > 0; local29++) {
						}
					}
					if (arg0.anInt743 != 0) {
						local23 = local23 + method640(arg0.anInt743, this.aBoolean238, aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt148) + " (level-" + arg0.anInt743 + ")";
					}
					if (this.anInt953 == 1) {
						this.aStringArray14[this.anInt1047] = "Use " + this.aString22 + " with @yel@" + local23;
						this.anIntArray219[this.anInt1047] = 646;
						this.anIntArray220[this.anInt1047] = arg3;
						this.anIntArray217[this.anInt1047] = arg2;
						this.anIntArray218[this.anInt1047] = arg1;
						this.anInt1047++;
					} else if (this.anInt963 != 1) {
						if (arg0.aStringArray7 != null) {
							for (local29 = 4; local29 >= 0; local29--) {
								if (arg0.aStringArray7[local29] != null && !arg0.aStringArray7[local29].equalsIgnoreCase("attack")) {
									this.aStringArray14[this.anInt1047] = arg0.aStringArray7[local29] + " @yel@" + local23;
									if (local29 == 0) {
										this.anIntArray219[this.anInt1047] = 447;
									}
									if (local29 == 1) {
										this.anIntArray219[this.anInt1047] = 24;
									}
									if (local29 == 2) {
										this.anIntArray219[this.anInt1047] = 851;
									}
									if (local29 == 3) {
										this.anIntArray219[this.anInt1047] = 515;
									}
									if (local29 == 4) {
										this.anIntArray219[this.anInt1047] = 983;
									}
									this.anIntArray220[this.anInt1047] = arg3;
									this.anIntArray217[this.anInt1047] = arg2;
									this.anIntArray218[this.anInt1047] = arg1;
									this.anInt1047++;
								}
							}
						}
						if (arg0.aStringArray7 != null) {
							for (local29 = 4; local29 >= 0; local29--) {
								if (arg0.aStringArray7[local29] != null && arg0.aStringArray7[local29].equalsIgnoreCase("attack")) {
									@Pc(297) short local297 = 0;
									if (arg0.anInt743 > aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt148) {
										local297 = 2000;
									}
									this.aStringArray14[this.anInt1047] = arg0.aStringArray7[local29] + " @yel@" + local23;
									if (local29 == 0) {
										this.anIntArray219[this.anInt1047] = local297 + 447;
									}
									if (local29 == 1) {
										this.anIntArray219[this.anInt1047] = local297 + 24;
									}
									if (local29 == 2) {
										this.anIntArray219[this.anInt1047] = local297 + 851;
									}
									if (local29 == 3) {
										this.anIntArray219[this.anInt1047] = local297 + 515;
									}
									if (local29 == 4) {
										this.anIntArray219[this.anInt1047] = local297 + 983;
									}
									this.anIntArray220[this.anInt1047] = arg3;
									this.anIntArray217[this.anInt1047] = arg2;
									this.anIntArray218[this.anInt1047] = arg1;
									this.anInt1047++;
								}
							}
						}
						this.aStringArray14[this.anInt1047] = "Examine @yel@" + local23;
						this.anIntArray219[this.anInt1047] = 1335;
						this.anIntArray220[this.anInt1047] = arg3;
						this.anIntArray217[this.anInt1047] = arg2;
						this.anIntArray218[this.anInt1047] = arg1;
						this.anInt1047++;
					} else if ((this.anInt965 & 0x2) == 2) {
						this.aStringArray14[this.anInt1047] = this.aString24 + " @yel@" + local23;
						this.anIntArray219[this.anInt1047] = 403;
						this.anIntArray220[this.anInt1047] = arg3;
						this.anIntArray217[this.anInt1047] = arg2;
						this.anIntArray218[this.anInt1047] = arg1;
						this.anInt1047++;
						return;
					}
				}
			}
		} catch (@Pc(447) RuntimeException local447) {
			signlink.reporterror("87542, " + 25 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local447.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg0 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg3;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class3_Sub1_Sub1_Sub1.anIntArray40[local5];
				local27 = Class3_Sub1_Sub1_Sub1.anIntArray41[local5];
				local37 = local27 * 0 - arg3 * local23 >> 16;
				local17 = local23 * 0 + arg3 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class3_Sub1_Sub1_Sub1.anIntArray40[local11];
				local27 = Class3_Sub1_Sub1_Sub1.anIntArray41[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt1061 = arg1 - local13;
			this.anInt1062 = arg2 - local15;
			this.anInt1063 = arg4 - local17;
			this.anInt1064 = arg5;
			this.anInt1065 = arg0;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("85366, " + arg0 + ", " + arg1 + ", " + 3823 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MLYYHULT;Z)V")
	private void method660(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1) {
		try {
			this.anInt930 = 0;
			this.anInt970 = 0;
			this.method713(arg0, arg1);
			this.method727(arg0, arg1);
			this.method680(arg1, arg0);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt930; local30++) {
				local37 = this.anIntArray237[local30];
				if (this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local37].anInt343 != anInt1000) {
					this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local37].aClass40_2 = null;
					this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local37] = null;
				}
			}
			if (arg1.anInt429 != arg0) {
				signlink.reporterror(this.aString28 + " size mismatch in getnpcpos - pos:" + arg1.anInt429 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt901; local37++) {
				if (this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray229[local37]] == null) {
					signlink.reporterror(this.aString28 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt901);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("76596, " + arg0 + ", " + arg1 + ", " + false + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!HWEMRKQZ;IIIIZII)V")
	private void method661(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg0.anInt280 == 0 && arg0.anIntArray109 != null && !arg0.aBoolean58 && (arg4 >= arg3 && arg1 >= arg6 && arg4 <= arg3 + arg0.anInt297 && arg1 <= arg6 + arg0.anInt291)) {
				@Pc(41) int local41 = arg0.anIntArray109.length;
				for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
					@Pc(52) int local52 = arg0.anIntArray111[local43] + arg3;
					@Pc(61) int local61 = arg0.anIntArray107[local43] + arg6 - arg5;
					@Pc(67) Class15 local67 = Class15.method147(arg0.anIntArray109[local43]);
					@Pc(72) int local72 = local52 + local67.anInt278;
					@Pc(77) int local77 = local61 + local67.anInt307;
					if ((local67.anInt276 >= 0 || local67.anInt296 != 0) && arg4 >= local72 && arg1 >= local77 && arg4 < local72 + local67.anInt297 && arg1 < local77 + local67.anInt291) {
						if (local67.anInt276 >= 0) {
							this.anInt940 = local67.anInt276;
						} else {
							this.anInt940 = local67.anInt287;
						}
					}
					if (local67.anInt280 == 8 && arg4 >= local72 && arg1 >= local77 && arg4 < local72 + local67.anInt297 && arg1 < local77 + local67.anInt291) {
						this.anInt1003 = local67.anInt287;
					}
					if (local67.anInt280 == 0) {
						this.method661(local67, arg1, arg2, local72, arg4, local67.anInt298, local77);
						if (local67.anInt279 > local67.anInt291) {
							this.method664(local67.anInt279, local77, local72 + local67.anInt297, arg4, arg2, local67, arg1, local67.anInt291);
						}
					} else {
						if (local67.anInt283 == 1 && arg4 >= local72 && arg1 >= local77 && arg4 < local72 + local67.anInt297 && arg1 < local77 + local67.anInt291) {
							@Pc(201) boolean local201 = false;
							if (local67.anInt304 != 0) {
								local201 = this.method631(local67);
							}
							if (!local201) {
								this.aStringArray14[this.anInt1047] = local67.aString5;
								this.anIntArray219[this.anInt1047] = 426;
								this.anIntArray218[this.anInt1047] = local67.anInt287;
								this.anInt1047++;
							}
						}
						if (local67.anInt283 == 2 && this.anInt963 == 0 && arg4 >= local72 && arg1 >= local77 && arg4 < local72 + local67.anInt297 && arg1 < local77 + local67.anInt291) {
							@Pc(265) String local265 = local67.aString9;
							if (local265.indexOf(" ") != -1) {
								local265 = local265.substring(0, local265.indexOf(" "));
							}
							this.aStringArray14[this.anInt1047] = local265 + " @gre@" + local67.aString7;
							this.anIntArray219[this.anInt1047] = 582;
							this.anIntArray218[this.anInt1047] = local67.anInt287;
							this.anInt1047++;
						}
						if (local67.anInt283 == 3 && arg4 >= local72 && arg1 >= local77 && arg4 < local72 + local67.anInt297 && arg1 < local77 + local67.anInt291) {
							this.aStringArray14[this.anInt1047] = "Close";
							if (arg2 == 3) {
								this.anIntArray219[this.anInt1047] = 482;
							} else {
								this.anIntArray219[this.anInt1047] = 208;
							}
							this.anIntArray218[this.anInt1047] = local67.anInt287;
							this.anInt1047++;
						}
						if (local67.anInt283 == 4 && arg4 >= local72 && arg1 >= local77 && arg4 < local72 + local67.anInt297 && arg1 < local77 + local67.anInt291) {
							this.aStringArray14[this.anInt1047] = local67.aString5;
							this.anIntArray219[this.anInt1047] = 790;
							this.anIntArray218[this.anInt1047] = local67.anInt287;
							this.anInt1047++;
						}
						if (local67.anInt283 == 5 && arg4 >= local72 && arg1 >= local77 && arg4 < local72 + local67.anInt297 && arg1 < local77 + local67.anInt291) {
							this.aStringArray14[this.anInt1047] = local67.aString5;
							this.anIntArray219[this.anInt1047] = 951;
							this.anIntArray218[this.anInt1047] = local67.anInt287;
							this.anInt1047++;
						}
						if (local67.anInt283 == 6 && !this.aBoolean247 && arg4 >= local72 && arg1 >= local77 && arg4 < local72 + local67.anInt297 && arg1 < local77 + local67.anInt291) {
							this.aStringArray14[this.anInt1047] = local67.aString5;
							this.anIntArray219[this.anInt1047] = 405;
							this.anIntArray218[this.anInt1047] = local67.anInt287;
							this.anInt1047++;
						}
						if (local67.anInt280 == 2) {
							@Pc(524) int local524 = 0;
							for (@Pc(526) int local526 = 0; local526 < local67.anInt291; local526++) {
								for (@Pc(530) int local530 = 0; local530 < local67.anInt297; local530++) {
									@Pc(541) int local541 = local72 + local530 * (local67.anInt301 + 32);
									@Pc(550) int local550 = local77 + local526 * (local67.anInt308 + 32);
									if (local524 < 20) {
										local541 += local67.anIntArray110[local524];
										local550 += local67.anIntArray114[local524];
									}
									if (arg4 >= local541 && arg1 >= local550 && arg4 < local541 + 32 && arg1 < local550 + 32) {
										this.anInt866 = local524;
										this.anInt867 = local67.anInt287;
										if (local67.anIntArray106[local524] > 0) {
											@Pc(603) Class25 local603 = Class25.method347(local67.anIntArray106[local524] - 1);
											if (this.anInt953 == 1 && local67.aBoolean63) {
												if (local67.anInt287 != this.anInt955 || local524 != this.anInt954) {
													this.aStringArray14[this.anInt1047] = "Use " + this.aString22 + " with @lre@" + local603.aString13;
													this.anIntArray219[this.anInt1047] = 395;
													this.anIntArray220[this.anInt1047] = local603.anInt519;
													this.anIntArray217[this.anInt1047] = local524;
													this.anIntArray218[this.anInt1047] = local67.anInt287;
													this.anInt1047++;
												}
											} else if (this.anInt963 != 1 || !local67.aBoolean63) {
												@Pc(740) int local740;
												if (local67.aBoolean63) {
													for (local740 = 4; local740 >= 3; local740--) {
														if (local603.aStringArray5 != null && local603.aStringArray5[local740] != null) {
															this.aStringArray14[this.anInt1047] = local603.aStringArray5[local740] + " @lre@" + local603.aString13;
															if (local740 == 3) {
																this.anIntArray219[this.anInt1047] = 1;
															}
															if (local740 == 4) {
																this.anIntArray219[this.anInt1047] = 530;
															}
															this.anIntArray220[this.anInt1047] = local603.anInt519;
															this.anIntArray217[this.anInt1047] = local524;
															this.anIntArray218[this.anInt1047] = local67.anInt287;
															this.anInt1047++;
														} else if (local740 == 4) {
															this.aStringArray14[this.anInt1047] = "Drop @lre@" + local603.aString13;
															this.anIntArray219[this.anInt1047] = 530;
															this.anIntArray220[this.anInt1047] = local603.anInt519;
															this.anIntArray217[this.anInt1047] = local524;
															this.anIntArray218[this.anInt1047] = local67.anInt287;
															this.anInt1047++;
														}
													}
												}
												if (local67.aBoolean60) {
													this.aStringArray14[this.anInt1047] = "Use @lre@" + local603.aString13;
													this.anIntArray219[this.anInt1047] = 963;
													this.anIntArray220[this.anInt1047] = local603.anInt519;
													this.anIntArray217[this.anInt1047] = local524;
													this.anIntArray218[this.anInt1047] = local67.anInt287;
													this.anInt1047++;
												}
												if (local67.aBoolean63 && local603.aStringArray5 != null) {
													for (local740 = 2; local740 >= 0; local740--) {
														if (local603.aStringArray5[local740] != null) {
															this.aStringArray14[this.anInt1047] = local603.aStringArray5[local740] + " @lre@" + local603.aString13;
															if (local740 == 0) {
																this.anIntArray219[this.anInt1047] = 181;
															}
															if (local740 == 1) {
																this.anIntArray219[this.anInt1047] = 946;
															}
															if (local740 == 2) {
																this.anIntArray219[this.anInt1047] = 152;
															}
															this.anIntArray220[this.anInt1047] = local603.anInt519;
															this.anIntArray217[this.anInt1047] = local524;
															this.anIntArray218[this.anInt1047] = local67.anInt287;
															this.anInt1047++;
														}
													}
												}
												if (local67.aStringArray2 != null) {
													for (local740 = 4; local740 >= 0; local740--) {
														if (local67.aStringArray2[local740] != null) {
															this.aStringArray14[this.anInt1047] = local67.aStringArray2[local740] + " @lre@" + local603.aString13;
															if (local740 == 0) {
																this.anIntArray219[this.anInt1047] = 391;
															}
															if (local740 == 1) {
																this.anIntArray219[this.anInt1047] = 377;
															}
															if (local740 == 2) {
																this.anIntArray219[this.anInt1047] = 277;
															}
															if (local740 == 3) {
																this.anIntArray219[this.anInt1047] = 281;
															}
															if (local740 == 4) {
																this.anIntArray219[this.anInt1047] = 485;
															}
															this.anIntArray220[this.anInt1047] = local603.anInt519;
															this.anIntArray217[this.anInt1047] = local524;
															this.anIntArray218[this.anInt1047] = local67.anInt287;
															this.anInt1047++;
														}
													}
												}
												this.aStringArray14[this.anInt1047] = "Examine @lre@" + local603.aString13;
												this.anIntArray219[this.anInt1047] = 1870;
												this.anIntArray220[this.anInt1047] = local603.anInt519;
												this.anIntArray217[this.anInt1047] = local524;
												this.anIntArray218[this.anInt1047] = local67.anInt287;
												this.anInt1047++;
											} else if ((this.anInt965 & 0x10) == 16) {
												this.aStringArray14[this.anInt1047] = this.aString24 + " @lre@" + local603.aString13;
												this.anIntArray219[this.anInt1047] = 789;
												this.anIntArray220[this.anInt1047] = local603.anInt519;
												this.anIntArray217[this.anInt1047] = local524;
												this.anIntArray218[this.anInt1047] = local67.anInt287;
												this.anInt1047++;
											}
										}
									}
									local524++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1170) RuntimeException local1170) {
			signlink.reporterror("57548, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + local1170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	@Override
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt1059 = arg0;
			this.aString20 = arg1;
			this.method617();
			if (this.aClass13_2 == null) {
				super.method588(arg0, arg1);
			} else {
				this.aClass42_21.method541();
				this.aClass3_Sub1_Sub4_Sub3_4.method415(16777215, 54, 180, "RuneScape is loading - please wait...");
				Class3_Sub1_Sub4.method438(62, 34, 28, 9179409, 304);
				Class3_Sub1_Sub4.method438(63, 32, 29, 0, 302);
				Class3_Sub1_Sub4.method437(9179409, 30, 64, arg0 * 3, 30);
				this.aBoolean233 &= true;
				Class3_Sub1_Sub4.method437(0, arg0 * 3 + 30, 64, 300 - arg0 * 3, 30);
				this.aClass3_Sub1_Sub4_Sub3_4.method415(16777215, 85, 180, arg1);
				this.aClass42_21.method542(171, super.aGraphics2, 202);
				if (this.aBoolean248) {
					this.aBoolean248 = false;
					if (!this.aBoolean226) {
						this.aClass42_22.method542(0, super.aGraphics2, 0);
						this.aClass42_23.method542(0, super.aGraphics2, 637);
					}
					this.aClass42_19.method542(0, super.aGraphics2, 128);
					this.aClass42_20.method542(371, super.aGraphics2, 202);
					this.aClass42_24.method542(265, super.aGraphics2, 0);
					this.aClass42_25.method542(265, super.aGraphics2, 562);
					this.aClass42_26.method542(171, super.aGraphics2, 128);
					this.aClass42_27.method542(171, super.aGraphics2, 562);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("59013, " + arg0 + ", " + arg1 + ", " + true + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZLclient!SWNASVGQ;)V")
	private void method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub4_Sub4 arg2) {
		try {
			@Pc(7) int local7 = this.anInt873 + this.anInt921 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg1 * arg1;
			this.aBoolean233 &= true;
			if (local15 <= 6400) {
				@Pc(29) int local29 = Class3_Sub1_Sub1_Sub1.anIntArray40[local7];
				@Pc(33) int local33 = Class3_Sub1_Sub1_Sub1.anIntArray41[local7];
				@Pc(42) int local42 = local29 * 256 / (this.anInt870 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt870 + 256);
				@Pc(61) int local61 = arg1 * local42 + arg0 * local51 >> 16;
				@Pc(71) int local71 = arg1 * local51 - arg0 * local42 >> 16;
				if (local15 > 2500) {
					arg2.method455(83 - local71 - arg2.anInt648 / 2 - 4, local61 + 94 - arg2.anInt647 / 2 + 4, this.aClass3_Sub1_Sub4_Sub1_7);
				} else {
					arg2.method449(local61 + 94 + 4 - arg2.anInt647 / 2, 83 - local71 - arg2.anInt648 / 2 - 4, (byte) 2);
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("41615, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!CHKMTWJC;I)V")
	private void method663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub1_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != aClass3_Sub1_Sub1_Sub2_Sub1_1 && this.anInt1047 < 400) {
				@Pc(43) String local43;
				if (arg2.anInt142 == 0) {
					local43 = arg2.aString3 + method640(arg2.anInt148, this.aBoolean238, aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt148) + " (level-" + arg2.anInt148 + ")";
				} else {
					local43 = arg2.aString3 + " (skill-" + arg2.anInt142 + ")";
				}
				@Pc(173) int local173;
				if (this.anInt953 == 1) {
					this.aStringArray14[this.anInt1047] = "Use " + this.aString22 + " with @whi@" + local43;
					this.anIntArray219[this.anInt1047] = 703;
					this.anIntArray220[this.anInt1047] = arg1;
					this.anIntArray217[this.anInt1047] = arg3;
					this.anIntArray218[this.anInt1047] = arg0;
					this.anInt1047++;
				} else if (this.anInt963 != 1) {
					for (local173 = 4; local173 >= 0; local173--) {
						if (this.aStringArray8[local173] != null) {
							this.aStringArray14[this.anInt1047] = this.aStringArray8[local173] + " @whi@" + local43;
							@Pc(200) short local200 = 0;
							if (this.aStringArray8[local173].equalsIgnoreCase("attack")) {
								if (arg2.anInt148 > aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt148) {
									local200 = 2000;
								}
								if (aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt147 != 0 && arg2.anInt147 != 0) {
									if (aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt147 == arg2.anInt147) {
										local200 = 2000;
									} else {
										local200 = 0;
									}
								}
							} else if (this.aBooleanArray12[local173]) {
								local200 = 2000;
							}
							if (local173 == 0) {
								this.anIntArray219[this.anInt1047] = local200 + 883;
							}
							if (local173 == 1) {
								this.anIntArray219[this.anInt1047] = local200 + 145;
							}
							if (local173 == 2) {
								this.anIntArray219[this.anInt1047] = local200 + 359;
							}
							if (local173 == 3) {
								this.anIntArray219[this.anInt1047] = local200 + 896;
							}
							if (local173 == 4) {
								this.anIntArray219[this.anInt1047] = local200 + 233;
							}
							this.anIntArray220[this.anInt1047] = arg1;
							this.anIntArray217[this.anInt1047] = arg3;
							this.anIntArray218[this.anInt1047] = arg0;
							this.anInt1047++;
						}
					}
				} else if ((this.anInt965 & 0x8) == 8) {
					this.aStringArray14[this.anInt1047] = this.aString24 + " @whi@" + local43;
					this.anIntArray219[this.anInt1047] = 621;
					this.anIntArray220[this.anInt1047] = arg1;
					this.anIntArray217[this.anInt1047] = arg3;
					this.anIntArray218[this.anInt1047] = arg0;
					this.anInt1047++;
				}
				for (local173 = 0; local173 < this.anInt1047; local173++) {
					if (this.anIntArray219[local173] == 16) {
						this.aStringArray14[local173] = "Walk here @whi@" + local43;
						return;
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("41193, " + -578 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!HWEMRKQZ;III)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (this.aBoolean222) {
				this.anInt888 = 32;
			} else {
				this.anInt888 = 0;
			}
			this.aBoolean222 = false;
			if (arg3 >= arg2 && arg3 < arg2 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
				arg5.anInt298 -= this.anInt1004 * 4;
				if (arg4 == 1) {
					this.aBoolean253 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
			} else if (arg3 >= arg2 && arg3 < arg2 + 16 && arg6 >= arg1 + arg7 - 16 && arg6 < arg1 + arg7) {
				arg5.anInt298 += this.anInt1004 * 4;
				if (arg4 == 1) {
					this.aBoolean253 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
			} else if (arg3 >= arg2 - this.anInt888 && arg3 < arg2 + this.anInt888 + 16 && arg6 >= arg1 + 16 && arg6 < arg1 + arg7 - 16 && this.anInt1004 > 0) {
				@Pc(140) int local140 = (arg7 - 32) * arg7 / arg0;
				if (local140 < 8) {
					local140 = 8;
				}
				@Pc(155) int local155 = arg6 - arg1 - local140 / 2 - 16;
				@Pc(161) int local161 = arg7 - local140 - 32;
				arg5.anInt298 = (arg0 - arg7) * local155 / local161;
				if (arg4 == 1) {
					this.aBoolean253 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
				this.aBoolean222 = true;
			}
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("70588, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!MLYYHULT;)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub2 arg2) {
		try {
			while (true) {
				if (arg2.anInt430 + 10 < arg1 * 8) {
					@Pc(12) int local12 = arg2.method211(11);
					if (local12 != 2047) {
						if (this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local12] == null) {
							this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local12] = new Class3_Sub1_Sub1_Sub2_Sub1();
							if (this.aClass3_Sub1_Sub2Array1[local12] != null) {
								this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local12].method68(this.aClass3_Sub1_Sub2Array1[local12]);
							}
						}
						this.anIntArray244[this.anInt969++] = local12;
						@Pc(58) Class3_Sub1_Sub1_Sub2_Sub1 local58 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local12];
						local58.anInt343 = anInt1000;
						@Pc(66) int local66 = arg2.method211(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg2.method211(1);
						if (local75 == 1) {
							this.anIntArray245[this.anInt970++] = local12;
						}
						@Pc(94) int local94 = arg2.method211(5);
						if (local94 > 15) {
							local94 -= 32;
						}
						@Pc(103) int local103 = arg2.method211(1);
						local58.method159(aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0] + local94, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0] + local66, local103 == 1);
						continue;
					}
				}
				arg2.method212();
				@Pc(133) int local133 = 69 / arg0;
				return;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("42451, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method666(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(2) int local2 = this.anInt1013;
			@Pc(5) int local5 = this.anInt1014;
			@Pc(8) int local8 = this.anInt1015;
			@Pc(11) int local11 = this.anInt1016;
			Class3_Sub1_Sub4.method437(6116423, local2, local5, local8, local11);
			Class3_Sub1_Sub4.method437(0, local2 + 1, local5 + 1, local8 - 2, 16);
			Class3_Sub1_Sub4.method438(local5 + 18, local11 - 19, local2 + 1, 0, local8 - 2);
			if (arg0) {
				this.method581();
			}
			this.aClass3_Sub1_Sub4_Sub3_4.method419(6116423, local2 + 3, local5 + 14, "Choose Option");
			@Pc(67) int local67 = super.anInt833;
			@Pc(70) int local70 = super.anInt834;
			if (this.anInt1012 == 0) {
				local67 -= 4;
				local70 -= 4;
			}
			if (this.anInt1012 == 1) {
				local67 -= 553;
				local70 -= 205;
			}
			if (this.anInt1012 == 2) {
				local67 -= 17;
				local70 -= 357;
			}
			for (@Pc(89) int local89 = 0; local89 < this.anInt1047; local89++) {
				@Pc(104) int local104 = local5 + (this.anInt1047 - 1 - local89) * 15 + 31;
				@Pc(106) int local106 = 16777215;
				if (local67 > local2 && local67 < local2 + local8 && local70 > local104 - 13 && local70 < local104 + 3) {
					local106 = 16776960;
				}
				this.aClass3_Sub1_Sub4_Sub3_4.method423(local2 + 3, local106, true, this.aStringArray14[local89], local104);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("35311, " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt935 = Integer.parseInt(this.getParameter("nodeid"));
		anInt936 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method683();
		} else {
			method651((byte) 4);
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean236 = false;
		} else {
			aBoolean236 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIILclient!HWEMRKQZ;)V")
	private void method667(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4) {
		try {
			if (arg4.anInt280 == 0 && arg4.anIntArray109 != null && (!arg4.aBoolean58 || this.anInt852 == arg4.anInt287 || this.anInt850 == arg4.anInt287 || this.anInt1043 == arg4.anInt287)) {
				@Pc(29) int local29 = Class3_Sub1_Sub4.anInt635;
				@Pc(31) int local31 = Class3_Sub1_Sub4.anInt633;
				@Pc(33) int local33 = Class3_Sub1_Sub4.anInt636;
				@Pc(35) int local35 = Class3_Sub1_Sub4.anInt634;
				Class3_Sub1_Sub4.method434(arg1, arg2, arg1 + arg4.anInt297, 134, arg2 + arg4.anInt291);
				@Pc(51) int local51 = arg4.anIntArray109.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg4.anIntArray111[local53] + arg1;
					@Pc(71) int local71 = arg4.anIntArray107[local53] + arg2 - arg3;
					@Pc(77) Class15 local77 = Class15.method147(arg4.anIntArray109[local53]);
					@Pc(82) int local82 = local62 + local77.anInt278;
					@Pc(87) int local87 = local71 + local77.anInt307;
					if (local77.anInt304 > 0) {
						this.method633(local77, this.anInt998);
					}
					if (local77.anInt280 == 0) {
						if (local77.anInt298 > local77.anInt279 - local77.anInt291) {
							local77.anInt298 = local77.anInt279 - local77.anInt291;
						}
						if (local77.anInt298 < 0) {
							local77.anInt298 = 0;
						}
						this.method667((byte) 3, local82, local87, local77.anInt298, local77);
						if (local77.anInt279 > local77.anInt291) {
							this.method606(local87, local82 + local77.anInt297, 382, local77.anInt291, local77.anInt279, local77.anInt298);
						}
					} else if (local77.anInt280 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(242) int local242;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local77.anInt280 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local77.anInt291; local160++) {
								for (local164 = 0; local164 < local77.anInt297; local164++) {
									local175 = local82 + local164 * (local77.anInt301 + 32);
									@Pc(184) int local184 = local87 + local160 * (local77.anInt308 + 32);
									if (local158 < 20) {
										local175 += local77.anIntArray110[local158];
										local184 += local77.anIntArray114[local158];
									}
									if (local77.anIntArray106[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local77.anIntArray106[local158] - 1;
										if (local175 > Class3_Sub1_Sub4.anInt635 - 32 && local175 < Class3_Sub1_Sub4.anInt636 && local184 > Class3_Sub1_Sub4.anInt633 - 32 && local184 < Class3_Sub1_Sub4.anInt634 || this.anInt881 != 0 && this.anInt880 == local158) {
											local242 = 0;
											if (this.anInt953 == 1 && this.anInt954 == local158 && this.anInt955 == local77.anInt287) {
												local242 = 16777215;
											}
											@Pc(266) Class3_Sub1_Sub4_Sub4 local266 = Class25.method341(local77.anIntArray112[local158], local242, local217);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt881 != 0 && this.anInt880 == local158 && this.anInt879 == local77.anInt287) {
													local208 = super.anInt833 - this.anInt882;
													local210 = super.anInt834 - this.anInt883;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt1055 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local266.method451(local175 + local208, local184 + local210);
													if (local184 + local210 < Class3_Sub1_Sub4.anInt633 && arg4.anInt298 > 0) {
														local345 = this.anInt907 * (Class3_Sub1_Sub4.anInt633 - local184 - local210) / 3;
														if (local345 > this.anInt907 * 10) {
															local345 = this.anInt907 * 10;
														}
														if (local345 > arg4.anInt298) {
															local345 = arg4.anInt298;
														}
														arg4.anInt298 -= local345;
														this.anInt883 += local345;
													}
													if (local184 + local210 + 32 > Class3_Sub1_Sub4.anInt634 && arg4.anInt298 < arg4.anInt279 - arg4.anInt291) {
														local345 = this.anInt907 * (local184 + local210 + 32 - Class3_Sub1_Sub4.anInt634) / 3;
														if (local345 > this.anInt907 * 10) {
															local345 = this.anInt907 * 10;
														}
														if (local345 > arg4.anInt279 - arg4.anInt291 - arg4.anInt298) {
															local345 = arg4.anInt279 - arg4.anInt291 - arg4.anInt298;
														}
														arg4.anInt298 += local345;
														this.anInt883 -= local345;
													}
												} else if (this.anInt1010 != 0 && this.anInt1009 == local158 && this.anInt1008 == local77.anInt287) {
													local266.method451(local175, local184);
												} else {
													local266.method449(local175, local184, (byte) 2);
												}
												if (local266.anInt647 == 33 || local77.anIntArray112[local158] != 1) {
													local345 = local77.anIntArray112[local158];
													this.aClass3_Sub1_Sub4_Sub3_2.method419(0, local175 + local208 + 1, local184 + 10 + local210, method636(local345, 806));
													this.aClass3_Sub1_Sub4_Sub3_2.method419(16776960, local175 + local208, local184 + 9 + local210, method636(local345, 806));
												}
											}
										}
									} else if (local77.aClass3_Sub1_Sub4_Sub4Array2 != null && local158 < 20) {
										@Pc(534) Class3_Sub1_Sub4_Sub4 local534 = local77.aClass3_Sub1_Sub4_Sub4Array2[local158];
										if (local534 != null) {
											local534.method449(local175, local184, (byte) 2);
										}
									}
									local158++;
								}
							}
						} else if (local77.anInt280 == 3) {
							@Pc(560) boolean local560 = false;
							if (this.anInt1043 == local77.anInt287 || this.anInt850 == local77.anInt287 || this.anInt852 == local77.anInt287) {
								local560 = true;
							}
							if (this.method598(local77)) {
								local158 = local77.anInt277;
								if (local560 && local77.anInt300 != 0) {
									local158 = local77.anInt300;
								}
							} else {
								local158 = local77.anInt305;
								if (local560 && local77.anInt296 != 0) {
									local158 = local77.anInt296;
								}
							}
							if (local77.aByte6 == 0) {
								if (local77.aBoolean55) {
									Class3_Sub1_Sub4.method437(local158, local82, local87, local77.anInt297, local77.anInt291);
								} else {
									Class3_Sub1_Sub4.method438(local87, local77.anInt291, local82, local158, local77.anInt297);
								}
							} else if (local77.aBoolean55) {
								Class3_Sub1_Sub4.method436(local82, local87, local158, 256 - (local77.aByte6 & 0xFF), local77.anInt291, local77.anInt297);
							} else {
								Class3_Sub1_Sub4.method439(local87, local77.anInt297, local82, 256 - (local77.aByte6 & 0xFF), local77.anInt291, local158);
							}
						} else {
							@Pc(678) Class3_Sub1_Sub4_Sub3 local678;
							@Pc(955) String local955;
							if (local77.anInt280 == 4) {
								local678 = local77.aClass3_Sub1_Sub4_Sub3_1;
								@Pc(681) String local681 = local77.aString8;
								@Pc(683) boolean local683 = false;
								if (this.anInt1043 == local77.anInt287 || this.anInt850 == local77.anInt287 || this.anInt852 == local77.anInt287) {
									local683 = true;
								}
								if (this.method598(local77)) {
									local160 = local77.anInt277;
									if (local683 && local77.anInt300 != 0) {
										local160 = local77.anInt300;
									}
									if (local77.aString6.length() > 0) {
										local681 = local77.aString6;
									}
								} else {
									local160 = local77.anInt305;
									if (local683 && local77.anInt296 != 0) {
										local160 = local77.anInt296;
									}
								}
								if (local77.anInt283 == 6 && this.aBoolean247) {
									local681 = "Please wait...";
									local160 = local77.anInt305;
								}
								if (Class3_Sub1_Sub4.anInt631 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local87 + local678.anInt627;
								while (local681.length() > 0) {
									if (local681.indexOf("%") != -1) {
										label391: while (true) {
											local210 = local681.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local681.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local681.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local681.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local681.indexOf("%5");
																			if (local210 == -1) {
																				break label391;
																			}
																			local681 = local681.substring(0, local210) + this.method719(this.method648(4, local77)) + local681.substring(local210 + 2);
																		}
																	}
																	local681 = local681.substring(0, local210) + this.method719(this.method648(3, local77)) + local681.substring(local210 + 2);
																}
															}
															local681 = local681.substring(0, local210) + this.method719(this.method648(2, local77)) + local681.substring(local210 + 2);
														}
													}
													local681 = local681.substring(0, local210) + this.method719(this.method648(1, local77)) + local681.substring(local210 + 2);
												}
											}
											local681 = local681.substring(0, local210) + this.method719(this.method648(0, local77)) + local681.substring(local210 + 2);
										}
									}
									local210 = local681.indexOf("\\n");
									if (local210 == -1) {
										local955 = local681;
										local681 = "";
									} else {
										local955 = local681.substring(0, local210);
										local681 = local681.substring(local210 + 2);
									}
									if (local77.aBoolean65) {
										local678.method416(local955, local208, local77.aBoolean61, local82 + local77.anInt297 / 2, local160);
									} else {
										local678.method423(local82, local160, local77.aBoolean61, local955, local208);
									}
									local208 += local678.anInt627;
								}
							} else if (local77.anInt280 == 5) {
								@Pc(1017) Class3_Sub1_Sub4_Sub4 local1017;
								if (this.method598(local77)) {
									local1017 = local77.aClass3_Sub1_Sub4_Sub4_2;
								} else {
									local1017 = local77.aClass3_Sub1_Sub4_Sub4_1;
								}
								if (local1017 != null) {
									local1017.method449(local82, local87, (byte) 2);
								}
							} else if (local77.anInt280 == 6) {
								local158 = Class3_Sub1_Sub4_Sub2.anInt552;
								local160 = Class3_Sub1_Sub4_Sub2.anInt553;
								Class3_Sub1_Sub4_Sub2.anInt552 = local82 + local77.anInt297 / 2;
								Class3_Sub1_Sub4_Sub2.anInt553 = local87 + local77.anInt291 / 2;
								local164 = Class3_Sub1_Sub4_Sub2.anIntArray147[local77.anInt272] * local77.anInt271 >> 16;
								local175 = Class3_Sub1_Sub4_Sub2.anIntArray148[local77.anInt272] * local77.anInt271 >> 16;
								@Pc(1078) boolean local1078 = this.method598(local77);
								if (local1078) {
									local208 = local77.anInt282;
								} else {
									local208 = local77.anInt281;
								}
								@Pc(1098) Class3_Sub1_Sub1_Sub1 local1098;
								if (local208 == -1) {
									local1098 = local77.method143(119, -1, -1, local1078);
								} else {
									@Pc(1104) Class38 local1104 = Class38.aClass38Array1[local208];
									local1098 = local77.method143(119, local1104.anIntArray192[local77.anInt303], local1104.anIntArray191[local77.anInt303], local1078);
								}
								if (local1098 != null) {
									local1098.method43(local77.anInt273, 0, local77.anInt272, 0, local164, local175);
								}
								Class3_Sub1_Sub4_Sub2.anInt552 = local158;
								Class3_Sub1_Sub4_Sub2.anInt553 = local160;
							} else {
								if (local77.anInt280 == 7) {
									local678 = local77.aClass3_Sub1_Sub4_Sub3_1;
									local160 = 0;
									for (local164 = 0; local164 < local77.anInt291; local164++) {
										for (local175 = 0; local175 < local77.anInt297; local175++) {
											if (local77.anIntArray106[local160] > 0) {
												@Pc(1168) Class25 local1168 = Class25.method347(local77.anIntArray106[local160] - 1);
												@Pc(1171) String local1171 = local1168.aString13;
												if (local1168.aBoolean139 || local77.anIntArray112[local160] != 1) {
													local1171 = local1171 + " x" + method639(local77.anIntArray112[local160]);
												}
												local210 = local82 + local175 * (local77.anInt301 + 115);
												local217 = local87 + local164 * (local77.anInt308 + 12);
												if (local77.aBoolean65) {
													local678.method416(local1171, local217, local77.aBoolean61, local210 + local77.anInt297 / 2, local77.anInt305);
												} else {
													local678.method423(local210, local77.anInt305, local77.aBoolean61, local1171, local217);
												}
											}
											local160++;
										}
									}
								}
								if (local77.anInt280 == 8 && (this.anInt906 == local77.anInt287 || this.anInt863 == local77.anInt287 || this.anInt904 == local77.anInt287) && this.anInt1051 == 100) {
									local158 = 0;
									local160 = 0;
									@Pc(1285) Class3_Sub1_Sub4_Sub3 local1285 = this.aClass3_Sub1_Sub4_Sub3_3;
									@Pc(1288) String local1288 = local77.aString8;
									while (local1288.length() > 0) {
										local208 = local1288.indexOf("\\n");
										if (local208 == -1) {
											local955 = local1288;
											local1288 = "";
										} else {
											local955 = local1288.substring(0, local208);
											local1288 = local1288.substring(local208 + 2);
										}
										local210 = local1285.method417(local955);
										if (local210 > local158) {
											local158 = local210;
										}
										local160 += local1285.anInt627 + 1;
									}
									local158 += 6;
									local160 += 7;
									local208 = local82 + local77.anInt297 - local158 - 5;
									local210 = local87 + local77.anInt291 + 5;
									if (local208 < local82 + 5) {
										local208 = local82 + 5;
									}
									if (local208 + local158 > arg1 + arg4.anInt297) {
										local208 = arg1 + arg4.anInt297 - local158;
									}
									Class3_Sub1_Sub4.method437(16777120, local208, local210, local158, local160);
									Class3_Sub1_Sub4.method438(local210, local160, local208, 0, local158);
									local1288 = local77.aString8;
									local217 = local210 + local1285.anInt627 + 2;
									while (local1288.length() > 0) {
										local242 = local1288.indexOf("\\n");
										if (local242 == -1) {
											local955 = local1288;
											local1288 = "";
										} else {
											local955 = local1288.substring(0, local242);
											local1288 = local1288.substring(local242 + 2);
										}
										local1285.method423(local208 + 3, 0, false, local955, local217);
										local217 += local1285.anInt627 + 1;
									}
								}
							}
						}
					}
				}
				if (this.aByte44 == 3) {
					@Pc(1456) boolean local1456 = false;
				} else {
					this.anInt846 = -1;
				}
				Class3_Sub1_Sub4.method434(local29, local31, local33, 134, local35);
			}
		} catch (@Pc(1469) RuntimeException local1469) {
			signlink.reporterror("16781, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1469.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method668() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray260[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray260[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray261[local54] = (this.anIntArray260[local54 - 1] + this.anIntArray260[local54 + 1] + this.anIntArray260[local54 - 128] + this.anIntArray260[local54 + 128]) / 4;
				}
			}
			this.anInt1071 += 128;
			if (this.anInt1071 > this.anIntArray235.length) {
				this.anInt1071 -= this.anIntArray235.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method602(this.aClass3_Sub1_Sub4_Sub1Array3[local48]);
			}
			@Pc(172) int local172;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local172 = local54 + (local48 << 7);
					@Pc(195) int local195 = this.anIntArray261[local172 + 128] - this.anIntArray235[local172 + this.anInt1071 & this.anIntArray235.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray260[local172] = local195;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray254[local54] = this.anIntArray254[local54 + 1];
			}
			this.anIntArray254[255] = (int) (Math.sin((double) anInt1000 / 14.0D) * 16.0D + Math.sin((double) anInt1000 / 15.0D) * 14.0D + Math.sin((double) anInt1000 / 16.0D) * 12.0D);
			if (this.anInt1068 > 0) {
				this.anInt1068 -= 4;
			}
			if (this.anInt1069 > 0) {
				this.anInt1069 -= 4;
			}
			if (this.anInt1068 == 0 && this.anInt1069 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt1068 = 1024;
				}
				if (local172 == 1) {
					this.anInt1069 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("94365, " + 769 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method669() {
		try {
			while (true) {
				@Pc(12) int local12 = this.method580((byte) 6);
				if (local12 == -1) {
					return;
				}
				if (this.anInt868 != -1 && this.anInt868 == this.anInt1002) {
					if (local12 == 8 && this.aString30.length() > 0) {
						this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
					}
					if ((local12 >= 97 && local12 <= 122 || local12 >= 65 && local12 <= 90 || local12 >= 48 && local12 <= 57 || local12 == 32) && this.aString30.length() < 12) {
						this.aString30 = this.aString30 + (char) local12;
					}
				} else {
					@Pc(192) int local192;
					if (this.aBoolean244) {
						if (local12 >= 32 && local12 <= 122 && this.aString25.length() < 80) {
							this.aString25 = this.aString25 + (char) local12;
							this.aBoolean255 = true;
						}
						if (local12 == 8 && this.aString25.length() > 0) {
							this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							this.aBoolean255 = true;
						}
						if (local12 == 13 || local12 == 10) {
							this.aBoolean244 = false;
							this.aBoolean255 = true;
							@Pc(152) long local152;
							if (this.anInt932 == 1) {
								local152 = Class43.method544(this.aString25);
								this.method673((byte) 6, local152);
							}
							if (this.anInt932 == 2 && this.anInt1056 > 0) {
								local152 = Class43.method544(this.aString25);
								this.method624(local152);
							}
							if (this.anInt932 == 3 && this.aString25.length() > 0) {
								this.aClass3_Sub1_Sub2_8.method189(168, 132);
								this.aClass3_Sub1_Sub2_8.method190(0);
								local192 = this.aClass3_Sub1_Sub2_8.anInt429;
								this.aClass3_Sub1_Sub2_8.method196(this.aLong29, this.aByte42);
								Class12.method137(this.aString25, this.aClass3_Sub1_Sub2_8);
								this.aClass3_Sub1_Sub2_8.method199(this.aClass3_Sub1_Sub2_8.anInt429 - local192);
								this.aString25 = Class12.method138(this.aString25);
								this.aString25 = Class24.method307(this.aString25);
								this.method594(6, Class43.method548(Class43.method545(this.aLong29)), this.aString25);
								if (this.anInt905 == 2) {
									this.anInt905 = 1;
									this.aBoolean243 = true;
									this.aClass3_Sub1_Sub2_8.method189(124, 132);
									this.aClass3_Sub1_Sub2_8.method190(this.anInt991);
									this.aClass3_Sub1_Sub2_8.method190(this.anInt905);
									this.aClass3_Sub1_Sub2_8.method190(this.anInt1070);
								}
							}
							if (this.anInt932 == 4 && this.anInt864 < 100) {
								local152 = Class43.method544(this.aString25);
								this.method686(local152);
							}
							if (this.anInt932 == 5 && this.anInt864 > 0) {
								local152 = Class43.method544(this.aString25);
								this.method627(local152, this.aBoolean241);
							}
						}
					} else if (this.anInt933 == 1) {
						if (local12 >= 48 && local12 <= 57 && this.aString21.length() < 10) {
							this.aString21 = this.aString21 + (char) local12;
							this.aBoolean255 = true;
						}
						if (local12 == 8 && this.aString21.length() > 0) {
							this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							this.aBoolean255 = true;
						}
						if (local12 == 13 || local12 == 10) {
							if (this.aString21.length() > 0) {
								local192 = 0;
								try {
									local192 = Integer.parseInt(this.aString21);
								} catch (@Pc(371) Exception local371) {
								}
								this.aClass3_Sub1_Sub2_8.method189(86, 132);
								this.aClass3_Sub1_Sub2_8.method194(local192);
							}
							this.anInt933 = 0;
							this.aBoolean255 = true;
						}
					} else if (this.anInt933 == 2) {
						if (local12 >= 32 && local12 <= 122 && this.aString21.length() < 12) {
							this.aString21 = this.aString21 + (char) local12;
							this.aBoolean255 = true;
						}
						if (local12 == 8 && this.aString21.length() > 0) {
							this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							this.aBoolean255 = true;
						}
						if (local12 == 13 || local12 == 10) {
							if (this.aString21.length() > 0) {
								this.aClass3_Sub1_Sub2_8.method189(200, 132);
								this.aClass3_Sub1_Sub2_8.method196(Class43.method544(this.aString21), this.aByte42);
							}
							this.anInt933 = 0;
							this.aBoolean255 = true;
						}
					} else if (this.anInt933 == 3) {
						if (local12 >= 32 && local12 <= 122 && this.aString21.length() < 40) {
							this.aString21 = this.aString21 + (char) local12;
							this.aBoolean255 = true;
						}
						if (local12 == 8 && this.aString21.length() > 0) {
							this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							this.aBoolean255 = true;
						}
					} else if (this.anInt1046 == -1 && this.anInt942 == -1) {
						if (local12 >= 32 && local12 <= 122 && this.aString31.length() < 80) {
							this.aString31 = this.aString31 + (char) local12;
							this.aBoolean255 = true;
						}
						if (local12 == 8 && this.aString31.length() > 0) {
							this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
							this.aBoolean255 = true;
						}
						if ((local12 == 13 || local12 == 10) && this.aString31.length() > 0) {
							if (this.anInt1035 == 2) {
								if (this.aString31.equals("::clientdrop")) {
									this.method603();
								}
								if (this.aString31.equals("::lag")) {
									this.method643();
								}
								if (this.aString31.equals("::prefetchmusic")) {
									for (local192 = 0; local192 < this.aClass8_Sub1_1.method130(anInt876, 2); local192++) {
										this.aClass8_Sub1_1.method118(2, local192, (byte) 1);
									}
								}
								if (this.aString31.equals("::fpson")) {
									aBoolean252 = true;
								}
								if (this.aString31.equals("::fpsoff")) {
									aBoolean252 = false;
								}
								if (this.aString31.equals("::noclip")) {
									for (local192 = 0; local192 < 4; local192++) {
										for (@Pc(657) int local657 = 1; local657 < 103; local657++) {
											for (@Pc(661) int local661 = 1; local661 < 103; local661++) {
												this.aClass22Array1[local192].anIntArrayArray15[local657][local661] = 0;
											}
										}
									}
								}
							}
							if (this.aString31.startsWith("::")) {
								this.aClass3_Sub1_Sub2_8.method189(230, 132);
								this.aClass3_Sub1_Sub2_8.method190(this.aString31.length() - 1);
								this.aClass3_Sub1_Sub2_8.method197(this.aString31.substring(2));
							} else {
								@Pc(716) String local716 = this.aString31.toLowerCase();
								@Pc(718) byte local718 = 0;
								if (local716.startsWith("yellow:")) {
									local718 = 0;
									this.aString31 = this.aString31.substring(7);
								} else if (local716.startsWith("red:")) {
									local718 = 1;
									this.aString31 = this.aString31.substring(4);
								} else if (local716.startsWith("green:")) {
									local718 = 2;
									this.aString31 = this.aString31.substring(6);
								} else if (local716.startsWith("cyan:")) {
									local718 = 3;
									this.aString31 = this.aString31.substring(5);
								} else if (local716.startsWith("purple:")) {
									local718 = 4;
									this.aString31 = this.aString31.substring(7);
								} else if (local716.startsWith("white:")) {
									local718 = 5;
									this.aString31 = this.aString31.substring(6);
								} else if (local716.startsWith("flash1:")) {
									local718 = 6;
									this.aString31 = this.aString31.substring(7);
								} else if (local716.startsWith("flash2:")) {
									local718 = 7;
									this.aString31 = this.aString31.substring(7);
								} else if (local716.startsWith("flash3:")) {
									local718 = 8;
									this.aString31 = this.aString31.substring(7);
								} else if (local716.startsWith("glow1:")) {
									local718 = 9;
									this.aString31 = this.aString31.substring(6);
								} else if (local716.startsWith("glow2:")) {
									local718 = 10;
									this.aString31 = this.aString31.substring(6);
								} else if (local716.startsWith("glow3:")) {
									local718 = 11;
									this.aString31 = this.aString31.substring(6);
								}
								local716 = this.aString31.toLowerCase();
								@Pc(890) byte local890 = 0;
								if (local716.startsWith("wave:")) {
									local890 = 1;
									this.aString31 = this.aString31.substring(5);
								} else if (local716.startsWith("wave2:")) {
									local890 = 2;
									this.aString31 = this.aString31.substring(6);
								} else if (local716.startsWith("shake:")) {
									local890 = 3;
									this.aString31 = this.aString31.substring(6);
								} else if (local716.startsWith("scroll:")) {
									local890 = 4;
									this.aString31 = this.aString31.substring(7);
								} else if (local716.startsWith("slide:")) {
									local890 = 5;
									this.aString31 = this.aString31.substring(6);
								}
								this.aClass3_Sub1_Sub2_8.method189(169, 132);
								this.aClass3_Sub1_Sub2_8.method190(0);
								@Pc(971) int local971 = this.aClass3_Sub1_Sub2_8.anInt429;
								this.aClass3_Sub1_Sub2_7.anInt429 = 0;
								Class12.method137(this.aString31, this.aClass3_Sub1_Sub2_7);
								this.aClass3_Sub1_Sub2_8.method238(this.aClass3_Sub1_Sub2_7.aByteArray14, this.aClass3_Sub1_Sub2_7.anInt429);
								this.aClass3_Sub1_Sub2_8.method218(local890);
								this.aClass3_Sub1_Sub2_8.method190(local718);
								this.aClass3_Sub1_Sub2_8.method199(this.aClass3_Sub1_Sub2_8.anInt429 - local971);
								this.aString31 = Class12.method138(this.aString31);
								this.aString31 = Class24.method307(this.aString31);
								aClass3_Sub1_Sub1_Sub2_Sub1_1.aString10 = this.aString31;
								aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt329 = local718;
								aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt321 = local890;
								aClass3_Sub1_Sub1_Sub2_Sub1_1.anInt352 = 150;
								if (this.anInt1035 == 2) {
									this.method594(2, "@cr2@" + aClass3_Sub1_Sub1_Sub2_Sub1_1.aString3, aClass3_Sub1_Sub1_Sub2_Sub1_1.aString10);
								} else if (this.anInt1035 == 1) {
									this.method594(2, "@cr1@" + aClass3_Sub1_Sub1_Sub2_Sub1_1.aString3, aClass3_Sub1_Sub1_Sub2_Sub1_1.aString10);
								} else {
									this.method594(2, aClass3_Sub1_Sub1_Sub2_Sub1_1.aString3, aClass3_Sub1_Sub1_Sub2_Sub1_1.aString10);
								}
								if (this.anInt991 == 2) {
									this.anInt991 = 3;
									this.aBoolean243 = true;
									this.aClass3_Sub1_Sub2_8.method189(124, 132);
									this.aClass3_Sub1_Sub2_8.method190(this.anInt991);
									this.aClass3_Sub1_Sub2_8.method190(this.anInt905);
									this.aClass3_Sub1_Sub2_8.method190(this.anInt1070);
								}
							}
							this.aString31 = "";
							this.aBoolean255 = true;
						}
					}
				}
			}
		} catch (@Pc(1123) RuntimeException local1123) {
			signlink.reporterror("25639, " + 4 + ", " + local1123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method670() {
		try {
			if (this.anInt865 == 2) {
				this.method600((this.anInt891 - this.anInt897 << 7) + this.anInt894, (this.anInt890 - this.anInt896 << 7) + this.anInt893, this.anInt892 * 2);
				if (this.anInt943 > -1 && anInt1000 % 20 < 10) {
					this.aClass3_Sub1_Sub4_Sub4Array7[0].method449(this.anInt943 - 12, this.anInt944 - 28, (byte) 2);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("24834, " + 27294 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method671() {
		try {
			if (aBoolean237 && this.anInt1028 == 2 && Class4.anInt164 != this.anInt1052) {
				this.method696("Loading - please wait.", null);
				this.anInt1028 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt1028 == 1) {
				@Pc(35) int local35 = this.method672();
				if (local35 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString28 + " glcfb " + this.aLong32 + "," + local35 + "," + aBoolean237 + "," + this.aClass29Array1[0] + "," + this.aClass8_Sub1_1.method116() + "," + this.anInt1052 + "," + this.anInt853 + "," + this.anInt854);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt1028 == 2 && this.anInt1052 != this.anInt878) {
				this.anInt878 = this.anInt1052;
				this.method684(this.anInt1052);
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("51609, " + -412 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)I")
	private int method672() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray258[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray259[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray257[local41] >> 8) * 64 - this.anInt896;
					@Pc(74) int local74 = (this.anIntArray257[local41] & 0xFF) * 64 - this.anInt897;
					if (this.aBoolean234) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class4.method76(local48, local62, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean258) {
				return -4;
			} else {
				this.anInt1028 = 2;
				Class4.anInt164 = this.anInt1052;
				this.method618();
				this.aClass3_Sub1_Sub2_8.method189(210, 132);
				return 0;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("58782, " + -45921 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BJ)V")
	private void method673(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				if (this.anInt1056 >= 100 && this.anInt1001 != 1) {
					this.method594(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt1056 >= 200) {
					this.method594(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class43.method548(Class43.method545(arg1));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1056; local40++) {
						if (this.aLongArray3[local40] == arg1) {
							this.method594(0, "", local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt864; local70++) {
						if (this.aLongArray4[local70] == arg1) {
							this.method594(0, "", "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass3_Sub1_Sub1_Sub2_Sub1_1.aString3)) {
						this.aStringArray9[this.anInt1056] = local38;
						@Pc(116) boolean local116 = false;
						this.aLongArray3[this.anInt1056] = arg1;
						this.anIntArray233[this.anInt1056] = 0;
						this.anInt1056++;
						this.aBoolean253 = true;
						this.aClass3_Sub1_Sub2_8.method189(167, 132);
						this.aClass3_Sub1_Sub2_8.method196(arg1, this.aByte42);
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("10175, " + arg0 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method674(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class15 local2 = Class15.method147(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray109.length && local2.anIntArray109[local4] != -1; local4++) {
				@Pc(18) Class15 local18 = Class15.method147(local2.anIntArray109[local4]);
				if (local18.anInt280 == 1) {
					this.method674(local18.anInt287);
				}
				local18.anInt303 = 0;
				local18.anInt293 = 0;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("89495, " + 20489 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
	private void method675(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1082 = arg0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("80881, " + 0 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method676() {
		try {
			this.aBoolean233 &= true;
			for (@Pc(12) Class3_Sub1_Sub1_Sub5 local12 = (Class3_Sub1_Sub1_Sub5) this.aClass50_10.method571(); local12 != null; local12 = (Class3_Sub1_Sub1_Sub5) this.aClass50_10.method573((byte) 3)) {
				if (local12.anInt782 != this.anInt1052 || anInt1000 > local12.anInt789) {
					local12.method559();
				} else if (anInt1000 >= local12.anInt788) {
					if (local12.anInt787 > 0) {
						@Pc(42) Class3_Sub1_Sub1_Sub2_Sub2 local42 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local12.anInt787 - 1];
						if (local42 != null && local42.anInt330 >= 0 && local42.anInt330 < 13312 && local42.anInt331 >= 0 && local42.anInt331 < 13312) {
							local12.method558(local42.anInt331, anInt1000, this.method605(local12.anInt782, local42.anInt330, local42.anInt331) - local12.anInt793, local42.anInt330);
						}
					}
					if (local12.anInt787 < 0) {
						@Pc(87) int local87 = -local12.anInt787 - 1;
						@Pc(93) Class3_Sub1_Sub1_Sub2_Sub1 local93;
						if (local87 == this.anInt987) {
							local93 = aClass3_Sub1_Sub1_Sub2_Sub1_1;
						} else {
							local93 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local87];
						}
						if (local93 != null && local93.anInt330 >= 0 && local93.anInt330 < 13312 && local93.anInt331 >= 0 && local93.anInt331 < 13312) {
							local12.method558(local93.anInt331, anInt1000, this.method605(local12.anInt782, local93.anInt330, local93.anInt331) - local12.anInt793, local93.anInt330);
						}
					}
					local12.method557(this.anInt907);
					this.aClass34_1.method473(local12.anInt783, (int) local12.aDouble2, false, 60, local12, this.anInt1052, (int) local12.aDouble3, (int) local12.aDouble1, -1);
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("33997, " + true + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method677(@OriginalArg(0) int arg0) {
		try {
			Class15.method148(arg0);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("81506, " + arg0 + ", " + 35928 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MLLEEKZP;B)V")
	private void method678(@OriginalArg(0) Class3_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt412 == 0) {
				local1 = this.aClass34_1.method488(arg0.anInt411, arg0.anInt413, arg0.anInt414);
			}
			if (arg0.anInt412 == 1) {
				local1 = this.aClass34_1.method489(arg0.anInt413, arg0.anInt411, arg0.anInt414);
			}
			if (arg0.anInt412 == 2) {
				local1 = this.aClass34_1.method490(arg0.anInt411, arg0.anInt413, arg0.anInt414);
			}
			if (arg0.anInt412 == 3) {
				local1 = this.aClass34_1.method491(arg0.anInt411, arg0.anInt413, arg0.anInt414);
			}
			if (local1 != 0) {
				@Pc(83) int local83 = this.aClass34_1.method492(arg0.anInt411, arg0.anInt413, arg0.anInt414, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local83 & 0x1F;
				local7 = local83 >> 6;
			}
			arg0.anInt408 = local3;
			arg0.anInt410 = local5;
			arg0.anInt409 = local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("13003, " + arg0 + ", " + 8 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method679(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (super.anInt838 == 1) {
				if (super.anInt839 >= 539 && super.anInt839 <= 573 && super.anInt840 >= 169 && super.anInt840 < 205 && this.anIntArray268[0] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 0;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 569 && super.anInt839 <= 599 && super.anInt840 >= 168 && super.anInt840 < 205 && this.anIntArray268[1] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 1;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 597 && super.anInt839 <= 627 && super.anInt840 >= 168 && super.anInt840 < 205 && this.anIntArray268[2] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 2;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 625 && super.anInt839 <= 669 && super.anInt840 >= 168 && super.anInt840 < 203 && this.anIntArray268[3] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 3;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 666 && super.anInt839 <= 696 && super.anInt840 >= 168 && super.anInt840 < 205 && this.anIntArray268[4] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 4;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 694 && super.anInt839 <= 724 && super.anInt840 >= 168 && super.anInt840 < 205 && this.anIntArray268[5] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 5;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 722 && super.anInt839 <= 756 && super.anInt840 >= 169 && super.anInt840 < 205 && this.anIntArray268[6] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 6;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 540 && super.anInt839 <= 574 && super.anInt840 >= 466 && super.anInt840 < 502 && this.anIntArray268[7] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 7;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 572 && super.anInt839 <= 602 && super.anInt840 >= 466 && super.anInt840 < 503 && this.anIntArray268[8] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 8;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 599 && super.anInt839 <= 629 && super.anInt840 >= 466 && super.anInt840 < 503 && this.anIntArray268[9] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 9;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 627 && super.anInt839 <= 671 && super.anInt840 >= 467 && super.anInt840 < 502 && this.anIntArray268[10] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 10;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 669 && super.anInt839 <= 699 && super.anInt840 >= 466 && super.anInt840 < 503 && this.anIntArray268[11] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 11;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 696 && super.anInt839 <= 726 && super.anInt840 >= 466 && super.anInt840 < 503 && this.anIntArray268[12] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 12;
					this.aBoolean251 = true;
				}
				if (super.anInt839 >= 724 && super.anInt839 <= 758 && super.anInt840 >= 466 && super.anInt840 < 502 && this.anIntArray268[13] != -1) {
					this.aBoolean253 = true;
					this.anInt886 = 13;
					this.aBoolean251 = true;
					return;
				}
			}
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("2230, " + arg0 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MLYYHULT;IZ)V")
	private void method680(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt970; local3++) {
				@Pc(10) int local10 = this.anIntArray245[local3];
				@Pc(15) Class3_Sub1_Sub1_Sub2_Sub2 local15 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local10];
				@Pc(18) int local18 = arg0.method200();
				if ((local18 & 0x40) != 0) {
					local15.aString10 = arg0.method207();
					local15.anInt352 = 100;
				}
				if ((local18 & 0x20) != 0) {
					local15.anInt353 = arg0.method228();
					local15.anInt354 = arg0.method202();
				}
				@Pc(50) int local50;
				@Pc(54) int local54;
				if ((local18 & 0x1) != 0) {
					local50 = arg0.method220();
					local54 = arg0.method220();
					local15.method155(local54, local50, anInt1000);
					local15.anInt324 = anInt1000 + 300;
					local15.anInt325 = arg0.method220();
					local15.anInt326 = arg0.method219();
				}
				if ((local18 & 0x2) != 0) {
					local50 = arg0.method220();
					local54 = arg0.method219();
					local15.method155(local54, local50, anInt1000);
					local15.anInt324 = anInt1000 + 300;
					local15.anInt325 = arg0.method221();
					local15.anInt326 = arg0.method200();
				}
				if ((local18 & 0x80) != 0) {
					local15.anInt315 = arg0.method229();
					local50 = arg0.method236();
					local15.anInt319 = local50 >> 16;
					local15.anInt318 = anInt1000 + (local50 & 0xFFFF);
					local15.anInt316 = 0;
					local15.anInt317 = 0;
					if (local15.anInt318 > anInt1000) {
						local15.anInt316 = -1;
					}
					if (local15.anInt315 == 65535) {
						local15.anInt315 = -1;
					}
				}
				if ((local18 & 0x10) != 0) {
					local15.aClass40_2 = Class40.method537(arg0.method230(anInt908));
					local15.anInt323 = local15.aClass40_2.aByte37;
					local15.anInt320 = local15.aClass40_2.anInt739;
					local15.anInt337 = local15.aClass40_2.anInt729;
					local15.anInt338 = local15.aClass40_2.anInt737;
					local15.anInt339 = local15.aClass40_2.anInt733;
					local15.anInt340 = local15.aClass40_2.anInt741;
					local15.anInt327 = local15.aClass40_2.anInt740;
				}
				if ((local18 & 0x4) != 0) {
					local15.anInt341 = arg0.method229();
					if (local15.anInt341 == 65535) {
						local15.anInt341 = -1;
					}
				}
				if ((local18 & 0x8) != 0) {
					local50 = arg0.method228();
					if (local50 == 65535) {
						local50 = -1;
					}
					local54 = arg0.method220();
					if (local50 == local15.anInt356 && local50 != -1) {
						@Pc(242) int local242 = Class38.aClass38Array1[local50].anInt715;
						if (local242 == 1) {
							local15.anInt357 = 0;
							local15.anInt358 = 0;
							local15.anInt359 = local54;
							local15.anInt360 = 0;
						}
						if (local242 == 2) {
							local15.anInt360 = 0;
						}
					} else if (local50 == -1 || local15.anInt356 == -1 || Class38.aClass38Array1[local50].anInt709 >= Class38.aClass38Array1[local15.anInt356].anInt709) {
						local15.anInt356 = local50;
						local15.anInt357 = 0;
						local15.anInt358 = 0;
						local15.anInt359 = local54;
						local15.anInt360 = 0;
						local15.anInt322 = local15.anInt344;
					}
				}
			}
		} catch (@Pc(313) RuntimeException local313) {
			signlink.reporterror("2196, " + arg0 + ", " + arg1 + ", " + false + ", " + local313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BIIILjava/lang/String;)Lclient!GWOEELWB;")
	private Class13 method681(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass29Array1[0] != null) {
					local9 = this.aClass29Array1[0].method393(arg2);
				}
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(40) int local40;
			if (local9 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local9);
				local40 = (int) this.aCRC32_2.getValue();
				if (local40 != arg1) {
					local9 = null;
				}
			}
			if (local9 != null) {
				return new Class13(local9, 8);
			}
			local40 = 0;
			while (local9 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method588(arg3, "Requesting " + arg4);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method724(arg0 + arg1);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class3_Sub1_Sub2 local101 = new Class3_Sub1_Sub2(true, local90);
					local101.anInt429 = 3;
					@Pc(109) int local109 = local101.method204() + 6;
					@Pc(111) int local111 = 6;
					local9 = new byte[local109];
					for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
						local9[local116] = local90[local116];
					}
					@Pc(134) int local134;
					while (local111 < local109) {
						local134 = local109 - local111;
						if (local134 > 1000) {
							local134 = 1000;
						}
						@Pc(145) int local145 = local87.read(local9, local111, local134);
						if (local145 < 0) {
							(new StringBuffer("Length error: ")).append(local111).append("/").append(local109).toString();
							throw new IOException("EOF");
						}
						local111 += local145;
						@Pc(174) int local174 = local111 * 100 / local109;
						if (local174 != local76) {
							this.method588(arg3, "Loading " + arg4 + " - " + local174 + "%");
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass29Array1[0] != null) {
							this.aClass29Array1[0].method394(arg2, local9, local9.length);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass29Array1[0] = null;
					}
					if (local9 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local9);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg1) {
							local9 = null;
							local40++;
							local61 = "Checksum error: " + local134;
						}
					}
				} catch (@Pc(254) IOException local254) {
					if (local61.equals("Unknown error")) {
						local61 = "Connection error";
					}
					local9 = null;
				} catch (@Pc(264) NullPointerException local264) {
					local61 = "Null error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(273) ArrayIndexOutOfBoundsException local273) {
					local61 = "Bounds error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(282) Exception local282) {
					local61 = "Unexpected error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local9 == null) {
					for (local76 = local11; local76 > 0; local76--) {
						if (local40 >= 3) {
							this.method588(arg3, "Game updated - please reload page");
							local76 = 10;
						} else {
							this.method588(arg3, local61 + " - Retrying in " + local76);
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
					this.aBoolean220 = !this.aBoolean220;
				}
			}
			return new Class13(local9, 8);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("93372, " + arg0 + ", " + -79 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MLYYHULT;II)V")
	private void method682(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method211(8);
			@Pc(12) int local12;
			if (local6 < this.anInt969) {
				for (local12 = local6; local12 < this.anInt969; local12++) {
					this.anIntArray237[this.anInt930++] = this.anIntArray244[local12];
				}
			}
			if (local6 > this.anInt969) {
				signlink.reporterror(this.aString28 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt969 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(68) int local68 = this.anIntArray244[local12];
				@Pc(73) Class3_Sub1_Sub1_Sub2_Sub1 local73 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local68];
				@Pc(78) int local78 = arg0.method211(1);
				if (local78 == 0) {
					this.anIntArray244[this.anInt969++] = local68;
					local73.anInt343 = anInt1000;
				} else {
					@Pc(101) int local101 = arg0.method211(2);
					if (local101 == 0) {
						this.anIntArray244[this.anInt969++] = local68;
						local73.anInt343 = anInt1000;
						this.anIntArray245[this.anInt970++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray244[this.anInt969++] = local68;
							local73.anInt343 = anInt1000;
							local152 = arg0.method211(3);
							local73.method158(local152, false);
							local162 = arg0.method211(1);
							if (local162 == 1) {
								this.anIntArray245[this.anInt970++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray244[this.anInt969++] = local68;
							local73.anInt343 = anInt1000;
							local152 = arg0.method211(3);
							local73.method158(local152, true);
							local162 = arg0.method211(3);
							local73.method158(local162, true);
							@Pc(220) int local220 = arg0.method211(1);
							if (local220 == 1) {
								this.anIntArray245[this.anInt970++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray237[this.anInt930++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("73290, " + arg0 + ", " + -228 + ", " + arg1 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method684(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass3_Sub1_Sub4_Sub4_8.anIntArray175;
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
						this.aClass34_1.method497(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass34_1.method497(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass3_Sub1_Sub4_Sub4_8.method444();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method620(arg0, local146, local36, local34, local142);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method620(arg0 + 1, local146, local36, local34, local142);
					}
				}
			}
			if (this.aClass42_5 != null) {
				this.aClass42_5.method541();
				Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
			}
			this.anInt1042 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass34_1.method491(this.anInt1052, local146, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class19.method182(local230).anInt379;
						if (local242 >= 0) {
							@Pc(246) int local246 = local146;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass22Array1[this.anInt1052].anIntArrayArray15;
								for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
									@Pc(289) int local289 = (int) (Math.random() * 4.0D);
									if (local289 == 0 && local246 > 0 && local246 > local146 - 3 && (local280[local246 - 1][local248] & 0x1280108) == 0) {
										local246--;
									}
									if (local289 == 1 && local246 < 103 && local246 < local146 + 3 && (local280[local246 + 1][local248] & 0x1280180) == 0) {
										local246++;
									}
									if (local289 == 2 && local248 > 0 && local248 > local220 - 3 && (local280[local246][local248 - 1] & 0x1280102) == 0) {
										local248--;
									}
									if (local289 == 3 && local248 < 103 && local248 < local220 + 3 && (local280[local246][local248 + 1] & 0x1280120) == 0) {
										local248++;
									}
								}
							}
							this.aClass3_Sub1_Sub4_Sub4Array10[this.anInt1042] = this.aClass3_Sub1_Sub4_Sub4Array5[local242];
							this.anIntArray264[this.anInt1042] = local246;
							this.anIntArray265[this.anInt1042] = local248;
							this.anInt1042++;
						}
					}
				}
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("88612, " + arg0 + ", " + -427 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method685() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt969; local3++) {
				if (local3 == -1) {
					local11 = this.anInt968;
				} else {
					local11 = this.anIntArray244[local3];
				}
				@Pc(23) Class3_Sub1_Sub1_Sub2_Sub1 local23 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local11];
				if (local23 != null && local23.anInt352 > 0) {
					local23.anInt352--;
					if (local23.anInt352 == 0) {
						local23.aString10 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt901; local11++) {
				@Pc(54) int local54 = this.anIntArray229[local11];
				@Pc(59) Class3_Sub1_Sub1_Sub2_Sub2 local59 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local54];
				if (local59 != null && local59.anInt352 > 0) {
					local59.anInt352--;
					if (local59.anInt352 == 0) {
						local59.aString10 = null;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("17577, " + 0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method686(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt864 >= 100) {
					this.method594(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class43.method548(Class43.method545(arg0));
					for (@Pc(28) int local28 = 0; local28 < this.anInt864; local28++) {
						if (this.aLongArray4[local28] == arg0) {
							this.method594(0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(58) int local58 = 0; local58 < this.anInt1056; local58++) {
						if (this.aLongArray3[local58] == arg0) {
							this.method594(0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray4[this.anInt864++] = arg0;
					this.aBoolean253 = true;
					this.aClass3_Sub1_Sub2_8.method189(71, 132);
					this.aClass3_Sub1_Sub2_8.method196(arg0, this.aByte42);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("52541, " + 465 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method687() {
		try {
			this.aClass42_3.method541();
			Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray274;
			this.aClass3_Sub1_Sub4_Sub1_6.method281(0, 0);
			if (this.anInt1011 != -1) {
				this.method667((byte) 3, 0, 0, 0, Class15.method147(this.anInt1011));
			} else if (this.anIntArray268[this.anInt886] != -1) {
				this.method667((byte) 3, 0, 0, 0, Class15.method147(this.anIntArray268[this.anInt886]));
			}
			if (this.aBoolean230 && this.anInt1012 == 1) {
				this.method666(aBoolean223);
			}
			this.aClass42_3.method542(205, super.aGraphics2, 553);
			this.aClass42_5.method541();
			Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("55373, " + 37 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method688(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt993 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt947 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray12[local12] != null) {
						@Pc(24) int local24 = this.anIntArray242[local12];
						@Pc(29) String local29 = this.aStringArray11[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt905 == 0 || this.anInt905 == 1 && this.method652((byte) 8, local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt833 > 4 && super.anInt834 - 4 > local82 - 10 && super.anInt834 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass3_Sub1_Sub4_Sub3_3.method417("From:  " + local29 + this.aStringArray12[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt833 < local121 + 4) {
									if (this.anInt1035 >= 1) {
										this.aStringArray14[this.anInt1047] = "Report abuse @whi@" + local29;
										this.anIntArray219[this.anInt1047] = 2787;
										this.anInt1047++;
									}
									this.aStringArray14[this.anInt1047] = "Add ignore @whi@" + local29;
									this.anIntArray219[this.anInt1047] = 2379;
									this.anInt1047++;
									this.aStringArray14[this.anInt1047] = "Add friend @whi@" + local29;
									this.anIntArray219[this.anInt1047] = 2696;
									this.anInt1047++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt905 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				@Pc(236) boolean local236 = false;
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("28739, " + arg0 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method689() {
		try {
			this.aClass42_6.method541();
			Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray273;
			this.aClass3_Sub1_Sub4_Sub1_8.method281(0, 0);
			if (this.aBoolean244) {
				this.aClass3_Sub1_Sub4_Sub3_4.method415(0, 40, 239, this.aString19);
				this.aClass3_Sub1_Sub4_Sub3_4.method415(128, 60, 239, this.aString25 + "*");
			} else if (this.anInt933 == 1) {
				this.aClass3_Sub1_Sub4_Sub3_4.method415(0, 40, 239, "Enter amount:");
				this.aClass3_Sub1_Sub4_Sub3_4.method415(128, 60, 239, this.aString21 + "*");
			} else if (this.anInt933 == 2) {
				this.aClass3_Sub1_Sub4_Sub3_4.method415(0, 40, 239, "Enter name:");
				this.aClass3_Sub1_Sub4_Sub3_4.method415(128, 60, 239, this.aString21 + "*");
			} else {
				@Pc(133) Class3_Sub1_Sub4_Sub3 local133;
				@Pc(141) int local141;
				@Pc(152) int local152;
				if (this.anInt933 == 3) {
					if (this.aString21 != this.aString23) {
						this.method711(this.aString21);
						this.aString23 = this.aString21;
					}
					local133 = this.aClass3_Sub1_Sub4_Sub3_3;
					Class3_Sub1_Sub4.method434(0, 0, 463, 134, 77);
					for (local141 = 0; local141 < this.anInt959; local141++) {
						local152 = local141 * 14 + 18 - this.anInt960;
						if (local152 > 0 && local152 < 110) {
							local133.method415(0, local152, 239, this.aStringArray10[local141]);
						}
					}
					Class3_Sub1_Sub4.method433();
					if (this.anInt959 > 5) {
						this.method606(0, 463, 382, 77, this.anInt959 * 14 + 7, this.anInt960);
					}
					if (this.aString21.length() == 0) {
						this.aClass3_Sub1_Sub4_Sub3_4.method415(255, 40, 239, "Enter object name");
					} else if (this.anInt959 == 0) {
						this.aClass3_Sub1_Sub4_Sub3_4.method415(0, 40, 239, "No matching objects found, please shorten search");
					}
					local133.method415(0, 90, 239, this.aString21 + "*");
					Class3_Sub1_Sub4.method440(0, 77, 479, 0);
				} else if (this.aString18 != null) {
					this.aClass3_Sub1_Sub4_Sub3_4.method415(0, 40, 239, this.aString18);
					this.aClass3_Sub1_Sub4_Sub3_4.method415(128, 60, 239, "Click to continue");
				} else if (this.anInt1046 != -1) {
					this.method667((byte) 3, 0, 0, 0, Class15.method147(this.anInt1046));
				} else if (this.anInt1060 == -1) {
					local133 = this.aClass3_Sub1_Sub4_Sub3_3;
					local141 = 0;
					Class3_Sub1_Sub4.method434(0, 0, 463, 134, 77);
					for (local152 = 0; local152 < 100; local152++) {
						if (this.aStringArray12[local152] != null) {
							@Pc(317) int local317 = this.anIntArray242[local152];
							@Pc(326) int local326 = this.anInt923 + 70 - local141 * 14;
							@Pc(331) String local331 = this.aStringArray11[local152];
							@Pc(333) byte local333 = 0;
							if (local331 != null && local331.startsWith("@cr1@")) {
								local331 = local331.substring(5);
								local333 = 1;
							}
							if (local331 != null && local331.startsWith("@cr2@")) {
								local331 = local331.substring(5);
								local333 = 2;
							}
							if (local317 == 0) {
								if (local326 > 0 && local326 < 110) {
									local133.method419(0, 4, local326, this.aStringArray12[local152]);
								}
								local141++;
							}
							@Pc(403) int local403;
							if ((local317 == 1 || local317 == 2) && (local317 == 1 || this.anInt991 == 0 || this.anInt991 == 1 && this.method652((byte) 8, local331))) {
								if (local326 > 0 && local326 < 110) {
									local403 = 4;
									if (local333 == 1) {
										this.aClass3_Sub1_Sub4_Sub1Array4[0].method281(4, local326 - 12);
										local403 += 14;
									}
									if (local333 == 2) {
										this.aClass3_Sub1_Sub4_Sub1Array4[1].method281(local403, local326 - 12);
										local403 += 14;
									}
									local133.method419(0, local403, local326, local331 + ":");
									local403 += local133.method417(local331) + 8;
									local133.method419(255, local403, local326, this.aStringArray12[local152]);
								}
								local141++;
							}
							if ((local317 == 3 || local317 == 7) && this.anInt993 == 0 && (local317 == 7 || this.anInt905 == 0 || this.anInt905 == 1 && this.method652((byte) 8, local331))) {
								if (local326 > 0 && local326 < 110) {
									local133.method419(0, 4, local326, "From");
									local403 = local133.method417("From ") + 4;
									if (local333 == 1) {
										this.aClass3_Sub1_Sub4_Sub1Array4[0].method281(local403, local326 - 12);
										local403 += 14;
									}
									if (local333 == 2) {
										this.aClass3_Sub1_Sub4_Sub1Array4[1].method281(local403, local326 - 12);
										local403 += 14;
									}
									local133.method419(0, local403, local326, local331 + ":");
									local403 += local133.method417(local331) + 8;
									local133.method419(8388608, local403, local326, this.aStringArray12[local152]);
								}
								local141++;
							}
							if (local317 == 4 && (this.anInt1070 == 0 || this.anInt1070 == 1 && this.method652((byte) 8, local331))) {
								if (local326 > 0 && local326 < 110) {
									local133.method419(8388736, 4, local326, local331 + " " + this.aStringArray12[local152]);
								}
								local141++;
							}
							if (local317 == 5 && this.anInt993 == 0 && this.anInt905 < 2) {
								if (local326 > 0 && local326 < 110) {
									local133.method419(8388608, 4, local326, this.aStringArray12[local152]);
								}
								local141++;
							}
							if (local317 == 6 && this.anInt993 == 0 && this.anInt905 < 2) {
								if (local326 > 0 && local326 < 110) {
									local133.method419(0, 4, local326, "To " + local331 + ":");
									local133.method419(8388608, local133.method417("To " + local331) + 12, local326, this.aStringArray12[local152]);
								}
								local141++;
							}
							if (local317 == 8 && (this.anInt1070 == 0 || this.anInt1070 == 1 && this.method652((byte) 8, local331))) {
								if (local326 > 0 && local326 < 110) {
									local133.method419(8270336, 4, local326, local331 + " " + this.aStringArray12[local152]);
								}
								local141++;
							}
						}
					}
					Class3_Sub1_Sub4.method433();
					this.anInt900 = local141 * 14 + 7;
					if (this.anInt900 < 78) {
						this.anInt900 = 78;
					}
					this.method606(0, 463, 382, 77, this.anInt900, this.anInt900 - this.anInt923 - 77);
					@Pc(773) String local773;
					if (aClass3_Sub1_Sub1_Sub2_Sub1_1 == null || aClass3_Sub1_Sub1_Sub2_Sub1_1.aString3 == null) {
						local773 = Class43.method548(this.aString28);
					} else {
						local773 = aClass3_Sub1_Sub1_Sub2_Sub1_1.aString3;
					}
					local133.method419(0, 4, 90, local773 + ":");
					local133.method419(255, local133.method417(local773 + ": ") + 6, 90, this.aString31 + "*");
					Class3_Sub1_Sub4.method440(0, 77, 479, 0);
				} else {
					this.method667((byte) 3, 0, 0, 0, Class15.method147(this.anInt1060));
				}
			}
			if (this.aBoolean230 && this.anInt1012 == 2) {
				this.method666(aBoolean223);
			}
			this.aClass42_6.method542(357, super.aGraphics2, 17);
			this.aClass42_5.method541();
			Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
		} catch (@Pc(854) RuntimeException local854) {
			signlink.reporterror("35484, " + 42 + ", " + local854.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anInt887 > 8 || this.anInt887 < 8) {
				this.anInt846 = -1;
			}
			@Pc(14) int local14 = 256 - arg0;
			return ((arg1 & 0xFF00FF) * local14 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * local14 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("32864, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method691() {
		try {
			@Pc(7) int local7 = this.aClass3_Sub1_Sub4_Sub3_4.method417("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt1047; local9++) {
				local20 = this.aClass3_Sub1_Sub4_Sub3_4.method417(this.aStringArray14[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt1047 * 15 + 21;
			@Pc(72) int local72;
			@Pc(90) int local90;
			if (super.anInt839 > 4 && super.anInt840 > 4 && super.anInt839 < 516 && super.anInt840 < 338) {
				local72 = super.anInt839 - local7 / 2 - 4;
				if (local72 + local7 > 512) {
					local72 = 512 - local7;
				}
				if (local72 < 0) {
					local72 = 0;
				}
				local90 = super.anInt840 - 4;
				if (local90 + local20 > 334) {
					local90 = 334 - local20;
				}
				if (local90 < 0) {
					local90 = 0;
				}
				this.aBoolean230 = true;
				this.anInt1012 = 0;
				this.anInt1013 = local72;
				this.anInt1014 = local90;
				this.anInt1015 = local7;
				this.anInt1016 = this.anInt1047 * 15 + 22;
			}
			if (super.anInt839 > 553 && super.anInt840 > 205 && super.anInt839 < 743 && super.anInt840 < 466) {
				local72 = super.anInt839 - local7 / 2 - 553;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 190) {
					local72 = 190 - local7;
				}
				local90 = super.anInt840 - 205;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local20 > 261) {
					local90 = 261 - local20;
				}
				this.aBoolean230 = true;
				this.anInt1012 = 1;
				this.anInt1013 = local72;
				this.anInt1014 = local90;
				this.anInt1015 = local7;
				this.anInt1016 = this.anInt1047 * 15 + 22;
			}
			if (super.anInt839 > 17 && super.anInt840 > 357 && super.anInt839 < 496 && super.anInt840 < 453) {
				local72 = super.anInt839 - local7 / 2 - 17;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 479) {
					local72 = 479 - local7;
				}
				local90 = super.anInt840 - 357;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local20 > 96) {
					local90 = 96 - local20;
				}
				this.aBoolean230 = true;
				this.anInt1012 = 2;
				this.anInt1013 = local72;
				this.anInt1014 = local90;
				this.anInt1015 = local7;
				this.anInt1016 = this.anInt1047 * 15 + 22;
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("30645, " + false + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method692() {
		try {
			if (this.anInt881 == 0) {
				@Pc(8) int local8 = super.anInt838;
				if (this.anInt963 == 1 && super.anInt839 >= 516 && super.anInt840 >= 160 && super.anInt839 <= 765 && super.anInt840 <= 205) {
					local8 = 0;
				}
				@Pc(46) int local46;
				@Pc(49) int local49;
				@Pc(125) int local125;
				if (this.aBoolean230) {
					if (local8 != 1) {
						local46 = super.anInt833;
						local49 = super.anInt834;
						if (this.anInt1012 == 0) {
							local46 -= 4;
							local49 -= 4;
						}
						if (this.anInt1012 == 1) {
							local46 -= 553;
							local49 -= 205;
						}
						if (this.anInt1012 == 2) {
							local46 -= 17;
							local49 -= 357;
						}
						if (local46 < this.anInt1013 - 10 || local46 > this.anInt1013 + this.anInt1015 + 10 || local49 < this.anInt1014 - 10 || local49 > this.anInt1014 + this.anInt1016 + 10) {
							this.aBoolean230 = false;
							if (this.anInt1012 == 1) {
								this.aBoolean253 = true;
							}
							if (this.anInt1012 == 2) {
								this.aBoolean255 = true;
							}
						}
					}
					if (local8 == 1) {
						local46 = this.anInt1013;
						local49 = this.anInt1014;
						local125 = this.anInt1015;
						@Pc(128) int local128 = super.anInt839;
						@Pc(131) int local131 = super.anInt840;
						if (this.anInt1012 == 0) {
							local128 -= 4;
							local131 -= 4;
						}
						if (this.anInt1012 == 1) {
							local128 -= 553;
							local131 -= 205;
						}
						if (this.anInt1012 == 2) {
							local128 -= 17;
							local131 -= 357;
						}
						@Pc(150) int local150 = -1;
						for (@Pc(152) int local152 = 0; local152 < this.anInt1047; local152++) {
							@Pc(167) int local167 = local49 + (this.anInt1047 - 1 - local152) * 15 + 31;
							if (local128 > local46 && local128 < local46 + local125 && local131 > local167 - 13 && local131 < local167 + 3) {
								local150 = local152;
							}
						}
						if (local150 != -1) {
							this.method645(local150);
						}
						this.aBoolean230 = false;
						if (this.anInt1012 == 1) {
							this.aBoolean253 = true;
						}
						if (this.anInt1012 == 2) {
							this.aBoolean255 = true;
							return;
						}
					}
				} else {
					if (local8 == 1 && this.anInt1047 > 0) {
						local46 = this.anIntArray219[this.anInt1047 - 1];
						if (local46 == 391 || local46 == 377 || local46 == 277 || local46 == 281 || local46 == 485 || local46 == 181 || local46 == 946 || local46 == 152 || local46 == 1 || local46 == 530 || local46 == 963 || local46 == 1870) {
							local49 = this.anIntArray217[this.anInt1047 - 1];
							local125 = this.anIntArray218[this.anInt1047 - 1];
							@Pc(286) Class15 local286 = Class15.method147(local125);
							if (local286.aBoolean64 || local286.aBoolean56) {
								this.aBoolean242 = false;
								this.anInt1055 = 0;
								this.anInt879 = local125;
								this.anInt880 = local49;
								this.anInt881 = 2;
								this.anInt882 = super.anInt839;
								this.anInt883 = super.anInt840;
								if (Class15.method147(local125).anInt299 == this.anInt868) {
									this.anInt881 = 1;
								}
								if (Class15.method147(local125).anInt299 == this.anInt1046) {
									this.anInt881 = 3;
								}
								return;
							}
						}
					}
					if (local8 == 1 && (this.anInt1044 == 1 || this.method655(this.anInt1047 - 1)) && this.anInt1047 > 2) {
						local8 = 2;
					}
					if (local8 == 1 && this.anInt1047 > 0) {
						this.method645(this.anInt1047 - 1);
					}
					if (local8 != 2 || this.anInt1047 <= 0) {
						return;
					}
					this.method691();
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("55032, " + -303 + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray12[local3] != null) {
					@Pc(15) int local15 = this.anIntArray242[local3];
					@Pc(26) int local26 = this.anInt923 + 70 + 4 - local1 * 14;
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
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt991 == 0 || this.anInt991 == 1 && this.method652((byte) 8, local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass3_Sub1_Sub1_Sub2_Sub1_1.aString3)) {
							if (this.anInt1035 >= 1) {
								this.aStringArray14[this.anInt1047] = "Report abuse @whi@" + local34;
								this.anIntArray219[this.anInt1047] = 787;
								this.anInt1047++;
							}
							this.aStringArray14[this.anInt1047] = "Add ignore @whi@" + local34;
							this.anIntArray219[this.anInt1047] = 379;
							this.anInt1047++;
							this.aStringArray14[this.anInt1047] = "Add friend @whi@" + local34;
							this.anIntArray219[this.anInt1047] = 696;
							this.anInt1047++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt993 == 0 && (local15 == 7 || this.anInt905 == 0 || this.anInt905 == 1 && this.method652((byte) 8, local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt1035 >= 1) {
								this.aStringArray14[this.anInt1047] = "Report abuse @whi@" + local34;
								this.anIntArray219[this.anInt1047] = 787;
								this.anInt1047++;
							}
							this.aStringArray14[this.anInt1047] = "Add ignore @whi@" + local34;
							this.anIntArray219[this.anInt1047] = 379;
							this.anInt1047++;
							this.aStringArray14[this.anInt1047] = "Add friend @whi@" + local34;
							this.anIntArray219[this.anInt1047] = 696;
							this.anInt1047++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt1070 == 0 || this.anInt1070 == 1 && this.method652((byte) 8, local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray14[this.anInt1047] = "Accept trade @whi@" + local34;
							this.anIntArray219[this.anInt1047] = 940;
							this.anInt1047++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt993 == 0 && this.anInt905 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt1070 == 0 || this.anInt1070 == 1 && this.method652((byte) 8, local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray14[this.anInt1047] = "Accept challenge @whi@" + local34;
							this.anIntArray219[this.anInt1047] = 113;
							this.anInt1047++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(409) RuntimeException local409) {
			signlink.reporterror("998, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local409.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)Ljava/net/Socket;")
	public Socket method694(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method695() {
		try {
			try {
				if (this.aClass16_1 != null) {
					this.aClass16_1.method161();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass16_1 = null;
			this.aBoolean233 = false;
			this.anInt1026 = 0;
			this.aString28 = "";
			this.aString29 = "";
			this.method604();
			this.aClass34_1.method462();
			for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
				this.aClass22Array1[local35].method283();
			}
			System.gc();
			this.method726();
			this.anInt1041 = -1;
			this.anInt855 = -1;
			this.anInt978 = 0;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("8414, " + 2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
	private void method696(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(14) int local14;
			if (this.aClass42_5 != null) {
				this.aClass42_5.method541();
				Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
				local14 = 151;
				if (arg1 != null) {
					local14 -= 7;
				}
				this.aClass3_Sub1_Sub4_Sub3_3.method415(0, local14, 257, arg0);
				this.aClass3_Sub1_Sub4_Sub3_3.method415(16777215, local14 - 1, 256, arg0);
				local14 += 15;
				if (arg1 != null) {
					this.aClass3_Sub1_Sub4_Sub3_3.method415(0, local14, 257, arg1);
					this.aClass3_Sub1_Sub4_Sub3_3.method415(16777215, local14 - 1, 256, arg1);
				}
				this.aClass42_5.method542(4, super.aGraphics2, 4);
			} else if (super.aClass42_2 != null) {
				super.aClass42_2.method541();
				Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray276;
				local14 = 251;
				Class3_Sub1_Sub4.method437(0, 233, 221, 300, 50);
				Class3_Sub1_Sub4.method438(221, 50, 233, 16777215, 300);
				if (arg1 != null) {
					local14 -= 7;
				}
				this.aClass3_Sub1_Sub4_Sub3_3.method415(0, local14, 383, arg0);
				this.aClass3_Sub1_Sub4_Sub3_3.method415(16777215, local14 - 1, 382, arg0);
				local14 += 15;
				if (arg1 != null) {
					this.aClass3_Sub1_Sub4_Sub3_3.method415(0, local14, 383, arg1);
					this.aClass3_Sub1_Sub4_Sub3_3.method415(16777215, local14 - 1, 382, arg1);
				}
				super.aClass42_2.method542(0, super.aGraphics2, 0);
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("44253, " + arg0 + ", " + false + ", " + arg1 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method697(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) int local6 = this.anInt858 * 128 + 64;
			@Pc(13) int local13 = this.anInt859 * 128 + 64;
			@Pc(24) int local24 = this.method605(this.anInt1052, local6, local13) - this.anInt860;
			if (this.anInt1061 < local6) {
				this.anInt1061 += this.anInt861 + (local6 - this.anInt1061) * this.anInt862 / 1000;
				if (this.anInt1061 > local6) {
					this.anInt1061 = local6;
				}
			}
			if (this.anInt1061 > local6) {
				this.anInt1061 -= this.anInt861 + (this.anInt1061 - local6) * this.anInt862 / 1000;
				if (this.anInt1061 < local6) {
					this.anInt1061 = local6;
				}
			}
			if (this.anInt1062 < local24) {
				this.anInt1062 += this.anInt861 + (local24 - this.anInt1062) * this.anInt862 / 1000;
				if (this.anInt1062 > local24) {
					this.anInt1062 = local24;
				}
			}
			if (this.anInt1062 > local24) {
				this.anInt1062 -= this.anInt861 + (this.anInt1062 - local24) * this.anInt862 / 1000;
				if (this.anInt1062 < local24) {
					this.anInt1062 = local24;
				}
			}
			if (this.anInt1063 < local13) {
				this.anInt1063 += this.anInt861 + (local13 - this.anInt1063) * this.anInt862 / 1000;
				if (this.anInt1063 > local13) {
					this.anInt1063 = local13;
				}
			}
			if (this.anInt1063 > local13) {
				this.anInt1063 -= this.anInt861 + (this.anInt1063 - local13) * this.anInt862 / 1000;
				if (this.anInt1063 < local13) {
					this.anInt1063 = local13;
				}
			}
			local6 = this.anInt911 * 128 + 64;
			local13 = this.anInt912 * 128 + 64;
			if (arg0 == this.aByte46) {
				local24 = this.method605(this.anInt1052, local6, local13) - this.anInt913;
				@Pc(227) int local227 = local6 - this.anInt1061;
				@Pc(232) int local232 = local24 - this.anInt1062;
				@Pc(237) int local237 = local13 - this.anInt1063;
				@Pc(248) int local248 = (int) Math.sqrt((double) (local227 * local227 + local237 * local237));
				@Pc(259) int local259 = (int) (Math.atan2((double) local232, (double) local248) * 325.949D) & 0x7FF;
				@Pc(270) int local270 = (int) (Math.atan2((double) local227, (double) local237) * -325.949D) & 0x7FF;
				if (local259 < 128) {
					local259 = 128;
				}
				if (local259 > 383) {
					local259 = 383;
				}
				if (this.anInt1064 < local259) {
					this.anInt1064 += this.anInt914 + (local259 - this.anInt1064) * this.anInt915 / 1000;
					if (this.anInt1064 > local259) {
						this.anInt1064 = local259;
					}
				}
				if (this.anInt1064 > local259) {
					this.anInt1064 -= this.anInt914 + (this.anInt1064 - local259) * this.anInt915 / 1000;
					if (this.anInt1064 < local259) {
						this.anInt1064 = local259;
					}
				}
				@Pc(341) int local341 = local270 - this.anInt1065;
				if (local341 > 1024) {
					local341 -= 2048;
				}
				if (local341 < -1024) {
					local341 += 2048;
				}
				if (local341 > 0) {
					this.anInt1065 += this.anInt914 + local341 * this.anInt915 / 1000;
					this.anInt1065 &= 0x7FF;
				}
				if (local341 < 0) {
					this.anInt1065 -= this.anInt914 + -local341 * this.anInt915 / 1000;
					this.anInt1065 &= 0x7FF;
				}
				@Pc(399) int local399 = local270 - this.anInt1065;
				if (local399 > 1024) {
					local399 -= 2048;
				}
				if (local399 < -1024) {
					local399 += 2048;
				}
				if (local399 < 0 && local341 > 0 || local399 > 0 && local341 < 0) {
					this.anInt1065 = local270;
				}
			}
		} catch (@Pc(420) RuntimeException local420) {
			signlink.reporterror("25298, " + arg0 + ", " + local420.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
				if (aBoolean237 && arg4 != this.anInt1052) {
					return;
				}
				@Pc(25) int local25 = 0;
				if (arg1 == 0) {
					local25 = this.aClass34_1.method488(arg4, arg2, arg5);
				}
				if (arg1 == 1) {
					local25 = this.aClass34_1.method489(arg2, arg4, arg5);
				}
				if (arg1 == 2) {
					local25 = this.aClass34_1.method490(arg4, arg2, arg5);
				}
				if (arg1 == 3) {
					local25 = this.aClass34_1.method491(arg4, arg2, arg5);
				}
				@Pc(81) int local81;
				if (local25 != 0) {
					local81 = this.aClass34_1.method492(arg4, arg2, arg5, local25);
					@Pc(87) int local87 = local25 >> 14 & 0x7FFF;
					@Pc(91) int local91 = local81 & 0x1F;
					@Pc(95) int local95 = local81 >> 6;
					@Pc(107) Class19 local107;
					if (arg1 == 0) {
						this.aClass34_1.method479(arg4, 334, arg5, arg2);
						local107 = Class19.method182(local87);
						if (local107.aBoolean92) {
							this.aClass22Array1[arg4].method288(arg2, arg5, local107.aBoolean96, local95, local91);
						}
					}
					if (arg1 == 1) {
						this.aClass34_1.method480(arg2, arg5, arg4);
					}
					if (arg1 == 2) {
						this.aClass34_1.method481(arg2, arg5, arg4);
						local107 = Class19.method182(local87);
						if (arg2 + local107.anInt375 > 103 || arg5 + local107.anInt375 > 103 || arg2 + local107.anInt381 > 103 || arg5 + local107.anInt381 > 103) {
							return;
						}
						if (local107.aBoolean92) {
							this.aClass22Array1[arg4].method289(local107.anInt375, arg2, local107.anInt381, local95, local107.aBoolean96, arg5);
						}
					}
					if (arg1 == 3) {
						this.aClass34_1.method482(arg2, arg5, (byte) 9, arg4);
						local107 = Class19.method182(local87);
						if (local107.aBoolean92 && local107.aBoolean86) {
							this.aClass22Array1[arg4].method291(arg2, arg5);
						}
					}
				}
				if (arg6 >= 0) {
					local81 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray8[1][arg2][arg5] & 0x2) == 2) {
						local81 = arg4 + 1;
					}
					Class4.method84(local81, arg0, arg2, this.aClass34_1, arg4, this.anIntArrayArrayArray7, this.anInt990, arg5, this.aClass22Array1[arg4], arg3, arg6);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("98885, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -36 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method699(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method700(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("75648, " + -482 + ", " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method701() {
		try {
			this.anInt845 += 0;
			if (super.aClass42_2 == null) {
				this.method609((byte) 9);
				this.aClass42_19 = null;
				this.aClass42_20 = null;
				this.aClass42_21 = null;
				this.aClass42_22 = null;
				this.aClass42_23 = null;
				this.aClass42_24 = null;
				this.aClass42_25 = null;
				this.aClass42_26 = null;
				this.aClass42_27 = null;
				this.aClass42_6 = null;
				this.aClass42_4 = null;
				this.aClass42_3 = null;
				this.aClass42_5 = null;
				this.aClass42_16 = null;
				this.aClass42_17 = null;
				this.aClass42_18 = null;
				super.aClass42_2 = new Class42(765, 503, 462, this.method586());
				this.aBoolean248 = true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("95127, " + 0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method702() {
		try {
			anInt1027++;
			if (this.anInt918 > 7 || this.anInt918 < 7) {
				this.aClass50ArrayArrayArray1 = null;
			}
			if (anInt1027 > 179) {
				anInt1027 = 0;
				this.aClass3_Sub1_Sub2_8.method189(193, 132);
				this.aClass3_Sub1_Sub2_8.method194(0);
			}
			for (@Pc(30) int local30 = 0; local30 < this.anInt901; local30++) {
				@Pc(37) int local37 = this.anIntArray229[local30];
				@Pc(42) Class3_Sub1_Sub1_Sub2_Sub2 local42 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local37];
				if (local42 != null) {
					this.method703(local42.aClass40_2.aByte37, 825, local42);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("85493, " + 7 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!NXRPKSXU;)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub1_Sub2 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg2.anInt330 < 128 || arg2.anInt331 < 128 || arg2.anInt330 >= 13184 || arg2.anInt331 >= 13184) {
				arg2.anInt356 = -1;
				arg2.anInt315 = -1;
				arg2.anInt349 = 0;
				arg2.anInt350 = 0;
				arg2.anInt330 = arg2.anIntArray115[0] * 128 + arg2.anInt323 * 64;
				arg2.anInt331 = arg2.anIntArray116[0] * 128 + arg2.anInt323 * 64;
				arg2.method156();
			}
			if (arg2 == aClass3_Sub1_Sub1_Sub2_Sub1_1 && (arg2.anInt330 < 1536 || arg2.anInt331 < 1536 || arg2.anInt330 >= 11776 || arg2.anInt331 >= 11776)) {
				arg2.anInt356 = -1;
				arg2.anInt315 = -1;
				arg2.anInt349 = 0;
				arg2.anInt350 = 0;
				arg2.anInt330 = arg2.anIntArray115[0] * 128 + arg2.anInt323 * 64;
				arg2.anInt331 = arg2.anIntArray116[0] * 128 + arg2.anInt323 * 64;
				arg2.method156();
			}
			if (arg2.anInt349 > anInt1000) {
				this.method704(arg2);
			} else if (arg2.anInt350 >= anInt1000) {
				this.method705(arg2);
			} else {
				this.method706(arg2);
			}
			this.method707(arg2);
			this.method708(100, arg2);
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("92259, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NXRPKSXU;)V")
	private void method704(@OriginalArg(1) Class3_Sub1_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt349 - anInt1000;
			@Pc(14) int local14 = arg0.anInt345 * 128 + arg0.anInt323 * 64;
			@Pc(24) int local24 = arg0.anInt347 * 128 + arg0.anInt323 * 64;
			arg0.anInt330 += (local14 - arg0.anInt330) / local4;
			arg0.anInt331 += (local24 - arg0.anInt331) / local4;
			arg0.anInt342 = 0;
			if (arg0.anInt351 == 0) {
				arg0.anInt336 = 1024;
			}
			if (arg0.anInt351 == 1) {
				arg0.anInt336 = 1536;
			}
			if (arg0.anInt351 == 2) {
				arg0.anInt336 = 0;
			}
			if (arg0.anInt351 == 3) {
				arg0.anInt336 = 512;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("21515, " + -169 + ", " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!NXRPKSXU;)V")
	private void method705(@OriginalArg(1) Class3_Sub1_Sub1_Sub2 arg0) {
		try {
			if (arg0.anInt350 == anInt1000 || arg0.anInt356 == -1 || arg0.anInt359 != 0 || arg0.anInt358 + 1 > Class38.aClass38Array1[arg0.anInt356].method525((byte) 5, arg0.anInt357)) {
				@Pc(29) int local29 = arg0.anInt350 - arg0.anInt349;
				@Pc(34) int local34 = anInt1000 - arg0.anInt349;
				@Pc(44) int local44 = arg0.anInt345 * 128 + arg0.anInt323 * 64;
				@Pc(54) int local54 = arg0.anInt347 * 128 + arg0.anInt323 * 64;
				@Pc(64) int local64 = arg0.anInt346 * 128 + arg0.anInt323 * 64;
				@Pc(74) int local74 = arg0.anInt348 * 128 + arg0.anInt323 * 64;
				arg0.anInt330 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt331 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt342 = 0;
			if (arg0.anInt351 == 0) {
				arg0.anInt336 = 1024;
			}
			if (arg0.anInt351 == 1) {
				arg0.anInt336 = 1536;
			}
			if (arg0.anInt351 == 2) {
				arg0.anInt336 = 0;
			}
			if (arg0.anInt351 == 3) {
				arg0.anInt336 = 512;
			}
			arg0.anInt332 = arg0.anInt336;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("73543, " + -119 + ", " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NXRPKSXU;I)V")
	private void method706(@OriginalArg(0) Class3_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.anInt333 = arg0.anInt327;
			if (arg0.anInt344 == 0) {
				arg0.anInt342 = 0;
			} else {
				if (arg0.anInt356 != -1 && arg0.anInt359 == 0) {
					@Pc(24) Class38 local24 = Class38.aClass38Array1[arg0.anInt356];
					if (arg0.anInt322 > 0 && local24.anInt713 == 0) {
						arg0.anInt342++;
						return;
					}
					if (arg0.anInt322 <= 0 && local24.anInt714 == 0) {
						arg0.anInt342++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt330;
				@Pc(56) int local56 = arg0.anInt331;
				@Pc(71) int local71 = arg0.anIntArray115[arg0.anInt344 - 1] * 128 + arg0.anInt323 * 64;
				@Pc(86) int local86 = arg0.anIntArray116[arg0.anInt344 - 1] * 128 + arg0.anInt323 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt336 = 1280;
						} else if (local56 > local86) {
							arg0.anInt336 = 1792;
						} else {
							arg0.anInt336 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt336 = 768;
						} else if (local56 > local86) {
							arg0.anInt336 = 256;
						} else {
							arg0.anInt336 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt336 = 1024;
					} else {
						arg0.anInt336 = 0;
					}
					@Pc(180) int local180 = arg0.anInt336 - arg0.anInt332 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt338;
					this.anInt845 += 0;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt337;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt340;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt339;
					}
					if (local187 == -1) {
						local187 = arg0.anInt337;
					}
					arg0.anInt333 = local187;
					@Pc(235) int local235 = 4;
					if (arg0.anInt332 != arg0.anInt336 && arg0.anInt341 == -1 && arg0.anInt320 != 0) {
						local235 = 2;
					}
					if (arg0.anInt344 > 2) {
						local235 = 6;
					}
					if (arg0.anInt344 > 3) {
						local235 = 8;
					}
					if (arg0.anInt342 > 0 && arg0.anInt344 > 1) {
						local235 = 8;
						arg0.anInt342--;
					}
					if (arg0.aBooleanArray9[arg0.anInt344 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt333 == arg0.anInt337 && arg0.anInt355 != -1) {
						arg0.anInt333 = arg0.anInt355;
					}
					if (local53 < local71) {
						arg0.anInt330 += local235;
						if (arg0.anInt330 > local71) {
							arg0.anInt330 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt330 -= local235;
						if (arg0.anInt330 < local71) {
							arg0.anInt330 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt331 += local235;
						if (arg0.anInt331 > local86) {
							arg0.anInt331 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt331 -= local235;
						if (arg0.anInt331 < local86) {
							arg0.anInt331 = local86;
						}
					}
					if (arg0.anInt330 == local71 && arg0.anInt331 == local86) {
						arg0.anInt344--;
						if (arg0.anInt322 > 0) {
							arg0.anInt322--;
							return;
						}
					}
				} else {
					arg0.anInt330 = local71;
					arg0.anInt331 = local86;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("35978, " + arg0 + ", " + 0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!NXRPKSXU;)V")
	private void method707(@OriginalArg(1) Class3_Sub1_Sub1_Sub2 arg0) {
		try {
			if (arg0.anInt320 != 0) {
				@Pc(31) int local31;
				@Pc(37) int local37;
				if (arg0.anInt341 != -1 && arg0.anInt341 < 32768) {
					@Pc(23) Class3_Sub1_Sub1_Sub2_Sub2 local23 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[arg0.anInt341];
					if (local23 != null) {
						local31 = arg0.anInt330 - local23.anInt330;
						local37 = arg0.anInt331 - local23.anInt331;
						if (local31 != 0 || local37 != 0) {
							arg0.anInt336 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(62) int local62;
				if (arg0.anInt341 >= 32768) {
					local62 = arg0.anInt341 - 32768;
					if (local62 == this.anInt987) {
						local62 = this.anInt968;
					}
					@Pc(74) Class3_Sub1_Sub1_Sub2_Sub1 local74 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local62];
					if (local74 != null) {
						local37 = arg0.anInt330 - local74.anInt330;
						@Pc(88) int local88 = arg0.anInt331 - local74.anInt331;
						if (local37 != 0 || local88 != 0) {
							arg0.anInt336 = (int) (Math.atan2((double) local37, (double) local88) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt353 != 0 || arg0.anInt354 != 0) && (arg0.anInt344 == 0 || arg0.anInt342 > 0)) {
					local62 = arg0.anInt330 - (arg0.anInt353 - this.anInt896 - this.anInt896) * 64;
					local31 = arg0.anInt331 - (arg0.anInt354 - this.anInt897 - this.anInt897) * 64;
					if (local62 != 0 || local31 != 0) {
						arg0.anInt336 = (int) (Math.atan2((double) local62, (double) local31) * 325.949D) & 0x7FF;
					}
					arg0.anInt353 = 0;
					arg0.anInt354 = 0;
				}
				local62 = arg0.anInt336 - arg0.anInt332 & 0x7FF;
				if (local62 != 0) {
					if (local62 < arg0.anInt320 || local62 > 2048 - arg0.anInt320) {
						arg0.anInt332 = arg0.anInt336;
					} else if (local62 > 1024) {
						arg0.anInt332 -= arg0.anInt320;
					} else {
						arg0.anInt332 += arg0.anInt320;
					}
					arg0.anInt332 &= 0x7FF;
					if (arg0.anInt333 == arg0.anInt327 && arg0.anInt332 != arg0.anInt336) {
						if (arg0.anInt328 != -1) {
							arg0.anInt333 = arg0.anInt328;
							return;
						}
						arg0.anInt333 = arg0.anInt337;
						return;
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("43635, " + true + ", " + arg0 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!NXRPKSXU;)V")
	private void method708(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub2 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			arg1.aBoolean71 = false;
			@Pc(17) Class38 local17;
			if (arg1.anInt333 != -1) {
				local17 = Class38.aClass38Array1[arg1.anInt333];
				arg1.anInt335++;
				if (arg1.anInt334 < local17.anInt707 && arg1.anInt335 > local17.method525((byte) 5, arg1.anInt334)) {
					arg1.anInt335 = 0;
					arg1.anInt334++;
				}
				if (arg1.anInt334 >= local17.anInt707) {
					arg1.anInt335 = 0;
					arg1.anInt334 = 0;
				}
			}
			if (arg1.anInt315 != -1 && anInt1000 >= arg1.anInt318) {
				if (arg1.anInt316 < 0) {
					arg1.anInt316 = 0;
				}
				local17 = Class44.aClass44Array1[arg1.anInt315].aClass38_2;
				arg1.anInt317++;
				while (arg1.anInt316 < local17.anInt707 && arg1.anInt317 > local17.method525((byte) 5, arg1.anInt316)) {
					arg1.anInt317 -= local17.method525((byte) 5, arg1.anInt316);
					arg1.anInt316++;
				}
				if (arg1.anInt316 >= local17.anInt707 && (arg1.anInt316 < 0 || arg1.anInt316 >= local17.anInt707)) {
					arg1.anInt315 = -1;
				}
			}
			if (arg1.anInt356 != -1 && arg1.anInt359 <= 1) {
				local17 = Class38.aClass38Array1[arg1.anInt356];
				if (local17.anInt713 == 1 && arg1.anInt322 > 0 && arg1.anInt349 <= anInt1000 && arg1.anInt350 < anInt1000) {
					arg1.anInt359 = 1;
					return;
				}
			}
			if (arg1.anInt356 != -1 && arg1.anInt359 == 0) {
				local17 = Class38.aClass38Array1[arg1.anInt356];
				arg1.anInt358++;
				while (arg1.anInt357 < local17.anInt707 && arg1.anInt358 > local17.method525((byte) 5, arg1.anInt357)) {
					arg1.anInt358 -= local17.method525((byte) 5, arg1.anInt357);
					arg1.anInt357++;
				}
				if (arg1.anInt357 >= local17.anInt707) {
					arg1.anInt357 -= local17.anInt708;
					arg1.anInt360++;
					if (arg1.anInt360 >= local17.anInt712) {
						arg1.anInt356 = -1;
					}
					if (arg1.anInt357 < 0 || arg1.anInt357 >= local17.anInt707) {
						arg1.anInt356 = -1;
					}
				}
				arg1.aBoolean71 = local17.aBoolean190;
			}
			if (arg1.anInt359 > 0) {
				arg1.anInt359--;
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("15861, " + arg0 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method709() {
		try {
			if (this.anInt942 == -1 || this.anInt1028 != 2 && super.aClass42_2 == null) {
				if (this.aBoolean248) {
					this.method721((byte) 3);
					this.aBoolean248 = false;
					this.aClass42_7.method542(4, super.aGraphics2, 0);
					this.aClass42_8.method542(357, super.aGraphics2, 0);
					this.aClass42_9.method542(4, super.aGraphics2, 722);
					this.aClass42_10.method542(205, super.aGraphics2, 743);
					this.aClass42_11.method542(0, super.aGraphics2, 0);
					this.aClass42_12.method542(4, super.aGraphics2, 516);
					this.aClass42_13.method542(205, super.aGraphics2, 516);
					this.aClass42_14.method542(357, super.aGraphics2, 496);
					this.aClass42_15.method542(338, super.aGraphics2, 0);
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.aBoolean251 = true;
					this.aBoolean243 = true;
					if (this.anInt1028 != 2) {
						this.aClass42_5.method542(4, super.aGraphics2, 4);
						this.aClass42_4.method542(4, super.aGraphics2, 550);
					}
					anInt1048++;
					if (anInt1048 > 131) {
						anInt1048 = 0;
						this.aClass3_Sub1_Sub2_8.method189(84, 132);
						this.aClass3_Sub1_Sub2_8.method194(0);
					}
				}
				if (this.anInt1028 == 2) {
					this.method608(this.anInt989);
				}
				if (this.aBoolean230 && this.anInt1012 == 1) {
					this.aBoolean253 = true;
				}
				@Pc(296) boolean local296;
				if (this.anInt1011 != -1) {
					local296 = this.method595(this.anInt1011, this.anInt907);
					if (local296) {
						this.aBoolean253 = true;
					}
				}
				if (this.anInt1010 == 2) {
					this.aBoolean253 = true;
				}
				if (this.anInt881 == 2) {
					this.aBoolean253 = true;
				}
				if (this.aBoolean253) {
					this.method687();
					this.aBoolean253 = false;
				}
				@Pc(381) int local381;
				if (this.anInt1046 == -1 && this.anInt933 == 0) {
					this.aClass15_1.anInt298 = this.anInt900 - this.anInt923 - 77;
					if (super.anInt833 > 448 && super.anInt833 < 560 && super.anInt834 > 332) {
						this.method664(this.anInt900, 0, 463, super.anInt833 - 17, -1, this.aClass15_1, super.anInt834 - 357, 77);
					}
					local381 = this.anInt900 - this.aClass15_1.anInt298 - 77;
					if (local381 < 0) {
						local381 = 0;
					}
					if (local381 > this.anInt900 - 77) {
						local381 = this.anInt900 - 77;
					}
					if (this.anInt923 != local381) {
						this.anInt923 = local381;
						this.aBoolean255 = true;
					}
				}
				if (this.anInt1046 == -1 && this.anInt933 == 3) {
					local381 = this.anInt959 * 14 + 7;
					this.aClass15_1.anInt298 = this.anInt960;
					if (super.anInt833 > 448 && super.anInt833 < 560 && super.anInt834 > 332) {
						this.method664(local381, 0, 463, super.anInt833 - 17, -1, this.aClass15_1, super.anInt834 - 357, 77);
					}
					@Pc(460) int local460 = this.aClass15_1.anInt298;
					if (local460 < 0) {
						local460 = 0;
					}
					if (local460 > local381 - 77) {
						local460 = local381 - 77;
					}
					if (this.anInt960 != local460) {
						this.anInt960 = local460;
						this.aBoolean255 = true;
					}
				}
				if (this.anInt1046 != -1) {
					local296 = this.method595(this.anInt1046, this.anInt907);
					if (local296) {
						this.aBoolean255 = true;
					}
				}
				if (this.anInt1010 == 3) {
					this.aBoolean255 = true;
				}
				if (this.anInt881 == 3) {
					this.aBoolean255 = true;
				}
				if (this.aString18 != null) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean230 && this.anInt1012 == 2) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean255) {
					this.method689();
					this.aBoolean255 = false;
				}
				if (this.anInt1028 == 2) {
					this.method601();
					this.aClass42_4.method542(4, super.aGraphics2, 550);
				}
				if (this.anInt844 != -1) {
					this.aBoolean251 = true;
				}
				if (this.aBoolean251) {
					if (this.anInt844 != -1 && this.anInt844 == this.anInt886) {
						this.anInt844 = -1;
						this.aClass3_Sub1_Sub2_8.method189(225, 132);
						this.aClass3_Sub1_Sub2_8.method190(this.anInt886);
					}
					this.aBoolean251 = false;
					this.aClass42_18.method541();
					this.aClass3_Sub1_Sub4_Sub1_11.method281(0, 0);
					if (this.anInt1011 == -1) {
						if (this.anIntArray268[this.anInt886] != -1) {
							if (this.anInt886 == 0) {
								this.aClass3_Sub1_Sub4_Sub1_1.method281(22, 10);
							}
							if (this.anInt886 == 1) {
								this.aClass3_Sub1_Sub4_Sub1_2.method281(54, 8);
							}
							if (this.anInt886 == 2) {
								this.aClass3_Sub1_Sub4_Sub1_2.method281(82, 8);
							}
							if (this.anInt886 == 3) {
								this.aClass3_Sub1_Sub4_Sub1_3.method281(110, 8);
							}
							if (this.anInt886 == 4) {
								this.aClass3_Sub1_Sub4_Sub1_5.method281(153, 8);
							}
							if (this.anInt886 == 5) {
								this.aClass3_Sub1_Sub4_Sub1_5.method281(181, 8);
							}
							if (this.anInt886 == 6) {
								this.aClass3_Sub1_Sub4_Sub1_4.method281(209, 9);
							}
						}
						if (this.anIntArray268[0] != -1 && (this.anInt844 != 0 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[0].method281(29, 13);
						}
						if (this.anIntArray268[1] != -1 && (this.anInt844 != 1 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[1].method281(53, 11);
						}
						if (this.anIntArray268[2] != -1 && (this.anInt844 != 2 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[2].method281(82, 11);
						}
						if (this.anIntArray268[3] != -1 && (this.anInt844 != 3 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[3].method281(115, 12);
						}
						if (this.anIntArray268[4] != -1 && (this.anInt844 != 4 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[4].method281(153, 13);
						}
						if (this.anIntArray268[5] != -1 && (this.anInt844 != 5 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[5].method281(180, 11);
						}
						if (this.anIntArray268[6] != -1 && (this.anInt844 != 6 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[6].method281(208, 13);
						}
					}
					this.aClass42_18.method542(160, super.aGraphics2, 516);
					this.aClass42_17.method541();
					this.aClass3_Sub1_Sub4_Sub1_10.method281(0, 0);
					if (this.anInt1011 == -1) {
						if (this.anIntArray268[this.anInt886] != -1) {
							if (this.anInt886 == 7) {
								this.aClass3_Sub1_Sub4_Sub1_12.method281(42, 0);
							}
							if (this.anInt886 == 8) {
								this.aClass3_Sub1_Sub4_Sub1_13.method281(74, 0);
							}
							if (this.anInt886 == 9) {
								this.aClass3_Sub1_Sub4_Sub1_13.method281(102, 0);
							}
							if (this.anInt886 == 10) {
								this.aClass3_Sub1_Sub4_Sub1_14.method281(130, 1);
							}
							if (this.anInt886 == 11) {
								this.aClass3_Sub1_Sub4_Sub1_16.method281(173, 0);
							}
							if (this.anInt886 == 12) {
								this.aClass3_Sub1_Sub4_Sub1_16.method281(201, 0);
							}
							if (this.anInt886 == 13) {
								this.aClass3_Sub1_Sub4_Sub1_15.method281(229, 0);
							}
						}
						if (this.anIntArray268[8] != -1 && (this.anInt844 != 8 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[7].method281(74, 2);
						}
						if (this.anIntArray268[9] != -1 && (this.anInt844 != 9 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[8].method281(102, 3);
						}
						if (this.anIntArray268[10] != -1 && (this.anInt844 != 10 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[9].method281(137, 4);
						}
						if (this.anIntArray268[11] != -1 && (this.anInt844 != 11 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[10].method281(174, 2);
						}
						if (this.anIntArray268[12] != -1 && (this.anInt844 != 12 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[11].method281(201, 2);
						}
						if (this.anIntArray268[13] != -1 && (this.anInt844 != 13 || anInt1000 % 20 < 10)) {
							this.aClass3_Sub1_Sub4_Sub1Array5[12].method281(226, 2);
						}
					}
					this.aClass42_17.method542(466, super.aGraphics2, 496);
					this.aClass42_5.method541();
					Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
				}
				if (this.aBoolean243) {
					this.aBoolean243 = false;
					this.aClass42_16.method541();
					this.aClass3_Sub1_Sub4_Sub1_9.method281(0, 0);
					this.aClass3_Sub1_Sub4_Sub3_3.method416("Public chat", 28, true, 55, 16777215);
					if (this.anInt991 == 0) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("On", 41, true, 55, 65280);
					}
					if (this.anInt991 == 1) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("Friends", 41, true, 55, 16776960);
					}
					if (this.anInt991 == 2) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("Off", 41, true, 55, 16711680);
					}
					if (this.anInt991 == 3) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("Hide", 41, true, 55, 65535);
					}
					this.aClass3_Sub1_Sub4_Sub3_3.method416("Private chat", 28, true, 184, 16777215);
					if (this.anInt905 == 0) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("On", 41, true, 184, 65280);
					}
					if (this.anInt905 == 1) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("Friends", 41, true, 184, 16776960);
					}
					if (this.anInt905 == 2) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("Off", 41, true, 184, 16711680);
					}
					this.aClass3_Sub1_Sub4_Sub3_3.method416("Trade/compete", 28, true, 324, 16777215);
					if (this.anInt1070 == 0) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("On", 41, true, 324, 65280);
					}
					if (this.anInt1070 == 1) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("Friends", 41, true, 324, 16776960);
					}
					if (this.anInt1070 == 2) {
						this.aClass3_Sub1_Sub4_Sub3_3.method416("Off", 41, true, 324, 16711680);
					}
					this.aClass3_Sub1_Sub4_Sub3_3.method416("Report abuse", 33, true, 458, 16777215);
					this.aClass42_16.method542(453, super.aGraphics2, 0);
					this.aClass42_5.method541();
					Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
				}
				this.anInt907 = 0;
			} else {
				if (this.anInt1028 == 2) {
					this.method595(this.anInt942, this.anInt907);
					if (this.anInt877 != -1) {
						this.method595(this.anInt877, this.anInt907);
					}
					this.anInt907 = 0;
					this.method701();
					super.aClass42_2.method541();
					Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray276;
					Class3_Sub1_Sub4.method435();
					this.aBoolean248 = true;
					@Pc(56) Class15 local56 = Class15.method147(this.anInt942);
					if (local56.anInt297 == 512 && local56.anInt291 == 334 && local56.anInt280 == 0) {
						local56.anInt297 = 765;
						local56.anInt291 = 503;
					}
					this.method667((byte) 3, 0, 0, 0, local56);
					if (this.anInt877 != -1) {
						local56 = Class15.method147(this.anInt877);
						if (local56.anInt297 == 512 && local56.anInt291 == 334 && local56.anInt280 == 0) {
							local56.anInt297 = 765;
							local56.anInt291 = 503;
						}
						this.method667((byte) 3, 0, 0, 0, local56);
					}
					if (this.aBoolean230) {
						this.method666(aBoolean223);
					} else {
						this.method722();
						this.method607();
					}
				}
				super.aClass42_2.method542(0, super.aGraphics2, 0);
			}
		} catch (@Pc(1296) RuntimeException local1296) {
			signlink.reporterror("44977, " + -911 + ", " + local1296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method710(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString26 = "";
				this.aString27 = "Connecting to server...";
				this.method626(true);
			}
			this.aClass16_1 = new Class16((byte) 3, this.method694(anInt936 + 43594), this);
			@Pc(30) long local30 = Class43.method544(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass3_Sub1_Sub2_8.anInt429 = 0;
			this.aClass3_Sub1_Sub2_8.method190(14);
			this.aClass3_Sub1_Sub2_8.method190(local37);
			this.aClass16_1.method165(2, this.aClass3_Sub1_Sub2_8.aByteArray14);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass16_1.method162();
			}
			@Pc(74) int local74 = this.aClass16_1.method162();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass16_1.method164(this.aClass3_Sub1_Sub2_6.aByteArray14, 0, 8);
				this.aClass3_Sub1_Sub2_6.anInt429 = 0;
				this.aLong32 = this.aClass3_Sub1_Sub2_6.method206((byte) 2);
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong32 >> 32), (int) this.aLong32 };
				this.aClass3_Sub1_Sub2_8.anInt429 = 0;
				this.aClass3_Sub1_Sub2_8.method190(10);
				this.aClass3_Sub1_Sub2_8.method194(local99[0]);
				this.aClass3_Sub1_Sub2_8.method194(local99[1]);
				this.aClass3_Sub1_Sub2_8.method194(local99[2]);
				this.aClass3_Sub1_Sub2_8.method194(local99[3]);
				this.aClass3_Sub1_Sub2_8.method194(signlink.anInt1074);
				this.aClass3_Sub1_Sub2_8.method197(arg0);
				this.aClass3_Sub1_Sub2_8.method197(arg1);
				this.aClass3_Sub1_Sub2_8.method215(aBigInteger2, aBigInteger1);
				this.aClass3_Sub1_Sub2_9.anInt429 = 0;
				if (arg2) {
					this.aClass3_Sub1_Sub2_9.method190(18);
				} else {
					this.aClass3_Sub1_Sub2_9.method190(16);
				}
				this.aClass3_Sub1_Sub2_9.method190(this.aClass3_Sub1_Sub2_8.anInt429 + 36 + 1 + 1 + 2);
				this.aClass3_Sub1_Sub2_9.method190(255);
				this.aClass3_Sub1_Sub2_9.method191(350);
				this.aClass3_Sub1_Sub2_9.method190(aBoolean237 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass3_Sub1_Sub2_9.method194(this.anIntArray267[local225]);
				}
				this.aClass3_Sub1_Sub2_9.method198(this.aClass3_Sub1_Sub2_8.aByteArray14, this.aClass3_Sub1_Sub2_8.anInt429);
				this.aClass3_Sub1_Sub2_8.aClass32_1 = new Class32(local99, false);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass32_2 = new Class32(local99, false);
				this.aClass16_1.method165(this.aClass3_Sub1_Sub2_9.anInt429, this.aClass3_Sub1_Sub2_9.aByteArray14);
				local74 = this.aClass16_1.method162();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method710(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt1035 = this.aClass16_1.method162();
					aBoolean249 = this.aClass16_1.method162() == 1;
					this.aLong31 = 0L;
					this.anInt909 = 0;
					this.aClass46_1.anInt776 = 0;
					super.aBoolean216 = true;
					this.aBoolean224 = true;
					this.aBoolean233 = true;
					this.aClass3_Sub1_Sub2_8.anInt429 = 0;
					this.aClass3_Sub1_Sub2_6.anInt429 = 0;
					this.anInt846 = -1;
					this.anInt948 = -1;
					this.anInt949 = -1;
					this.anInt950 = -1;
					this.anInt845 = 0;
					this.anInt847 = 0;
					this.anInt947 = 0;
					this.anInt849 = 0;
					this.anInt865 = 0;
					this.anInt1047 = 0;
					this.aBoolean230 = false;
					super.anInt831 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray12[local389] = null;
					}
					this.anInt953 = 0;
					this.anInt963 = 0;
					this.anInt1028 = 0;
					this.anInt1036 = 0;
					this.anInt957 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1039 = (int) (Math.random() * 110.0D) - 55;
					this.anInt961 = (int) (Math.random() * 80.0D) - 40;
					this.anInt921 = (int) (Math.random() * 120.0D) - 60;
					this.anInt870 = (int) (Math.random() * 30.0D) - 20;
					this.anInt873 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1050 = 0;
					this.anInt878 = -1;
					this.anInt994 = 0;
					this.anInt995 = 0;
					this.anInt969 = 0;
					this.anInt901 = 0;
					for (local225 = 0; local225 < this.anInt967; local225++) {
						this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local225] = null;
						this.aClass3_Sub1_Sub2Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local259] = null;
					}
					aClass3_Sub1_Sub1_Sub2_Sub1_1 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anInt968] = new Class3_Sub1_Sub1_Sub2_Sub1();
					this.aClass50_10.method575();
					this.aClass50_12.method575();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass50ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass50_11 = new Class50(708);
					this.anInt1057 = 0;
					this.anInt1056 = 0;
					this.method677(this.anInt1060);
					this.anInt1060 = -1;
					this.method677(this.anInt1046);
					this.anInt1046 = -1;
					this.method677(this.anInt868);
					this.anInt868 = -1;
					this.method677(this.anInt942);
					this.anInt942 = -1;
					this.method677(this.anInt877);
					this.anInt877 = -1;
					this.method677(this.anInt1011);
					this.anInt1011 = -1;
					this.method677(this.anInt997);
					this.anInt997 = -1;
					this.aBoolean247 = false;
					this.anInt886 = 3;
					this.anInt933 = 0;
					this.aBoolean230 = false;
					this.aBoolean244 = false;
					this.aString18 = null;
					this.anInt869 = 0;
					this.anInt844 = -1;
					this.aBoolean225 = true;
					this.method591();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray231[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray8[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt910 = 0;
					anInt934 = 0;
					anInt988 = 0;
					anInt916 = 0;
					anInt941 = 0;
					anInt1049 = 0;
					anInt919 = 0;
					this.method721((byte) 3);
				} else if (local74 == 3) {
					this.aString26 = "";
					this.aString27 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString26 = "Your account has been disabled.";
					this.aString27 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString26 = "Your account is already logged in.";
					this.aString27 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString26 = "RuneScape has been updated!";
					this.aString27 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString26 = "This world is full.";
					this.aString27 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString26 = "Unable to connect.";
					this.aString27 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString26 = "Login limit exceeded.";
					this.aString27 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString26 = "Unable to connect.";
					this.aString27 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString26 = "Login server rejected session.";
					this.aString27 = "Please try again.";
				} else if (local74 == 12) {
					this.aString26 = "You need a members account to login to this world.";
					this.aString27 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString26 = "Could not complete login.";
					this.aString27 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString26 = "The server is being updated.";
					this.aString27 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean233 = true;
					this.aClass3_Sub1_Sub2_8.anInt429 = 0;
					this.aClass3_Sub1_Sub2_6.anInt429 = 0;
					this.anInt846 = -1;
					this.anInt948 = -1;
					this.anInt949 = -1;
					this.anInt950 = -1;
					this.anInt845 = 0;
					this.anInt847 = 0;
					this.anInt947 = 0;
					this.anInt1047 = 0;
					this.aBoolean230 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString26 = "Login attempts exceeded.";
					this.aString27 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString26 = "You are standing in a members-only area.";
					this.aString27 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString26 = "Invalid loginserver requested";
					this.aString27 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass16_1.method162();
					for (@Pc(917) int local917 = local389 + 3; local917 >= 0; local917--) {
						this.aString26 = "You have only just left another world";
						this.aString27 = "Your profile will be transferred in: " + local917;
						this.method626(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(939) Exception local939) {
						}
					}
					this.method710(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString26 = "Malformed login packet.";
					this.aString27 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString26 = "Unexpected server response";
					this.aString27 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString26 = "No response from server";
					this.aString27 = "Please try using a different world.";
				} else if (this.anInt924 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(971) Exception local971) {
					}
					this.anInt924++;
					this.method710(arg0, arg1, arg2);
				} else {
					this.aString26 = "No response from loginserver";
					this.aString27 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1014) IOException local1014) {
			this.aString26 = "";
			this.aString27 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method711(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt959 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(15) String[] local15 = new String[100];
				@Pc(17) int local17 = 0;
				while (true) {
					@Pc(30) int local30 = local12.indexOf(" ");
					if (local30 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local17++] = local12.toLowerCase();
						}
						this.anInt959 = 0;
						label49: for (local30 = 0; local30 < Class25.anInt513; local30++) {
							@Pc(79) Class25 local79 = Class25.method347(local30);
							if (local79.anInt524 == -1 && local79.aString13 != null) {
								@Pc(90) String local90 = local79.aString13.toLowerCase();
								for (@Pc(92) int local92 = 0; local92 < local17; local92++) {
									if (local90.indexOf(local15[local92]) == -1) {
										continue label49;
									}
								}
								this.aStringArray10[this.anInt959] = local90;
								this.anIntArray241[this.anInt959] = local30;
								this.anInt959++;
								if (this.anInt959 >= this.aStringArray10.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(39) String local39 = local12.substring(0, local30).trim();
					if (local39.length() > 0) {
						local15[local17++] = local39.toLowerCase();
					}
					local12 = local12.substring(local30 + 1);
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("37305, " + arg0 + ", " + -351 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method712() {
		try {
			this.aClass3_Sub1_Sub4_Sub1_17 = new Class3_Sub1_Sub4_Sub1(this.aClass13_2, "titlebox", 0);
			this.aClass3_Sub1_Sub4_Sub1_18 = new Class3_Sub1_Sub4_Sub1(this.aClass13_2, "titlebutton", 0);
			this.aClass3_Sub1_Sub4_Sub1Array3 = new Class3_Sub1_Sub4_Sub1[12];
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				this.aClass3_Sub1_Sub4_Sub1Array3[local29] = new Class3_Sub1_Sub4_Sub1(this.aClass13_2, "runes", local29);
			}
			this.aClass3_Sub1_Sub4_Sub4_6 = new Class3_Sub1_Sub4_Sub4(128, 265);
			this.aClass3_Sub1_Sub4_Sub4_7 = new Class3_Sub1_Sub4_Sub4(128, 265);
			for (@Pc(62) int local62 = 0; local62 < 33920; local62++) {
				this.aClass3_Sub1_Sub4_Sub4_6.anIntArray175[local62] = this.aClass42_22.anIntArray203[local62];
			}
			for (@Pc(80) int local80 = 0; local80 < 33920; local80++) {
				this.aClass3_Sub1_Sub4_Sub4_7.anIntArray175[local80] = this.aClass42_23.anIntArray203[local80];
			}
			this.anIntArray222 = new int[256];
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				this.anIntArray222[local102] = local102 * 262144;
			}
			for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
				this.anIntArray222[local117 + 64] = local117 * 1024 + 16711680;
			}
			for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
				this.anIntArray222[local136 + 128] = local136 * 4 + 16776960;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray222[local155 + 192] = 16777215;
			}
			this.anIntArray223 = new int[256];
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray223[local174] = local174 * 1024;
			}
			for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
				this.anIntArray223[local189 + 64] = local189 * 4 + 65280;
			}
			for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
				this.anIntArray223[local208 + 128] = local208 * 262144 + 65535;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray223[local227 + 192] = 16777215;
			}
			this.anIntArray224 = new int[256];
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray224[local246] = local246 * 4;
			}
			for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
				this.anIntArray224[local261 + 64] = local261 * 262144 + 255;
			}
			for (@Pc(280) int local280 = 0; local280 < 64; local280++) {
				this.anIntArray224[local280 + 128] = local280 * 1024 + 16711935;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray224[local299 + 192] = 16777215;
			}
			this.anIntArray221 = new int[256];
			this.anIntArray235 = new int[32768];
			this.anIntArray236 = new int[32768];
			this.method602(null);
			this.anIntArray260 = new int[32768];
			this.anIntArray261 = new int[32768];
			this.method588(10, "Connecting to fileserver");
			if (!this.aBoolean226) {
				this.aBoolean250 = true;
				this.aBoolean226 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("19456, " + true + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IILclient!MLYYHULT;)V")
	private void method713(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			arg1.method210();
			@Pc(9) int local9 = arg1.method211(8);
			@Pc(15) int local15;
			if (local9 < this.anInt901) {
				for (local15 = local9; local15 < this.anInt901; local15++) {
					this.anIntArray237[this.anInt930++] = this.anIntArray229[local15];
				}
			}
			if (local9 > this.anInt901) {
				signlink.reporterror(this.aString28 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt901 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(75) int local75 = this.anIntArray229[local15];
				@Pc(80) Class3_Sub1_Sub1_Sub2_Sub2 local80 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local75];
				@Pc(85) int local85 = arg1.method211(1);
				if (local85 == 0) {
					this.anIntArray229[this.anInt901++] = local75;
					local80.anInt343 = anInt1000;
				} else {
					@Pc(108) int local108 = arg1.method211(2);
					if (local108 == 0) {
						this.anIntArray229[this.anInt901++] = local75;
						local80.anInt343 = anInt1000;
						this.anIntArray245[this.anInt970++] = local75;
					} else {
						@Pc(159) int local159;
						@Pc(169) int local169;
						if (local108 == 1) {
							this.anIntArray229[this.anInt901++] = local75;
							local80.anInt343 = anInt1000;
							local159 = arg1.method211(3);
							local80.method158(local159, false);
							local169 = arg1.method211(1);
							if (local169 == 1) {
								this.anIntArray245[this.anInt970++] = local75;
							}
						} else if (local108 == 2) {
							this.anIntArray229[this.anInt901++] = local75;
							local80.anInt343 = anInt1000;
							local159 = arg1.method211(3);
							local80.method158(local159, true);
							local169 = arg1.method211(3);
							local80.method158(local169, true);
							@Pc(227) int local227 = arg1.method211(1);
							if (local227 == 1) {
								this.anIntArray245[this.anInt970++] = local75;
							}
						} else if (local108 == 3) {
							this.anIntArray237[this.anInt930++] = local75;
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("47193, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)Z")
	private boolean method714() {
		try {
			this.aBoolean233 &= true;
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("48503, " + true + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method715() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray267[8] = 0;
			@Pc(10) int local10 = 0;
			while (this.anIntArray267[8] == 0) {
				@Pc(25) String local25 = "Unknown problem";
				this.method588(20, "Connecting to web server");
				try {
					@Pc(47) DataInputStream local47 = this.method724("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 350);
					@Pc(54) Class3_Sub1_Sub2 local54 = new Class3_Sub1_Sub2(true, new byte[40]);
					local47.readFully(local54.aByteArray14, 0, 40);
					local47.close();
					for (@Pc(64) int local64 = 0; local64 < 9; local64++) {
						this.anIntArray267[local64] = local54.method205();
					}
					@Pc(79) int local79 = local54.method205();
					@Pc(81) int local81 = 1234;
					for (@Pc(83) int local83 = 0; local83 < 9; local83++) {
						local81 = (local81 << 1) + this.anIntArray267[local83];
					}
					if (local79 != local81) {
						local25 = "checksum problem";
						this.anIntArray267[8] = 0;
					}
				} catch (@Pc(110) EOFException local110) {
					local25 = "EOF problem";
					this.anIntArray267[8] = 0;
				} catch (@Pc(119) IOException local119) {
					local25 = "connection problem";
					this.anIntArray267[8] = 0;
				} catch (@Pc(128) Exception local128) {
					local25 = "logic problem";
					this.anIntArray267[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray267[8] == 0) {
					local10++;
					for (@Pc(146) int local146 = local3; local146 > 0; local146--) {
						if (local10 >= 10) {
							this.method588(10, "Game updated - please reload page");
							local146 = 10;
						} else {
							this.method588(10, local25 + " - Will retry in " + local146 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(180) Exception local180) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean220 = !this.aBoolean220;
				}
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("54288, " + 7 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method716() {
		try {
			this.anInt980 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt969 + this.anInt901; local6++) {
				@Pc(13) Class3_Sub1_Sub1_Sub2 local13;
				if (local6 == -1) {
					local13 = aClass3_Sub1_Sub1_Sub2_Sub1_1;
				} else if (local6 < this.anInt969) {
					local13 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local6]];
				} else {
					local13 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray229[local6 - this.anInt969]];
				}
				if (local13 != null && local13.method157()) {
					@Pc(54) Class40 local54;
					if (local13 instanceof Class3_Sub1_Sub1_Sub2_Sub2) {
						local54 = ((Class3_Sub1_Sub1_Sub2_Sub2) local13).aClass40_2;
						if (local54.anIntArray200 != null) {
							local54 = local54.method533();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt969) {
						local54 = ((Class3_Sub1_Sub1_Sub2_Sub2) local13).aClass40_2;
						if (local54.anInt731 >= 0 && local54.anInt731 < this.aClass3_Sub1_Sub4_Sub4Array6.length) {
							this.method599(local13, local13.anInt361 + 15);
							if (this.anInt943 > -1) {
								this.aClass3_Sub1_Sub4_Sub4Array6[local54.anInt731].method449(this.anInt943 - 12, this.anInt944 - 30, (byte) 2);
							}
						}
						if (this.anInt865 == 1 && this.anInt985 == this.anIntArray229[local6 - this.anInt969] && anInt1000 % 20 < 10) {
							this.method599(local13, local13.anInt361 + 15);
							if (this.anInt943 > -1) {
								this.aClass3_Sub1_Sub4_Sub4Array7[0].method449(this.anInt943 - 12, this.anInt944 - 28, (byte) 2);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class3_Sub1_Sub1_Sub2_Sub1 local73 = (Class3_Sub1_Sub1_Sub2_Sub1) local13;
						if (local73.anInt141 != -1 || local73.anInt139 != -1) {
							this.method599(local13, local13.anInt361 + 15);
							if (this.anInt943 > -1) {
								if (local73.anInt141 != -1) {
									this.aClass3_Sub1_Sub4_Sub4Array8[local73.anInt141].method449(this.anInt943 - 12, this.anInt944 - 30, (byte) 2);
									local70 += 25;
								}
								if (local73.anInt139 != -1) {
									this.aClass3_Sub1_Sub4_Sub4Array6[local73.anInt139].method449(this.anInt943 - 12, this.anInt944 - local70, (byte) 2);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt865 == 10 && this.anInt1023 == this.anIntArray244[local6]) {
							this.method599(local13, local13.anInt361 + 15);
							if (this.anInt943 > -1) {
								this.aClass3_Sub1_Sub4_Sub4Array7[1].method449(this.anInt943 - 12, this.anInt944 - local70, (byte) 2);
							}
						}
					}
					if (local13.aString10 != null && (local6 >= this.anInt969 || this.anInt991 == 0 || this.anInt991 == 3 || this.anInt991 == 1 && this.method652((byte) 8, ((Class3_Sub1_Sub1_Sub2_Sub1) local13).aString3))) {
						this.method599(local13, local13.anInt361);
						if (this.anInt943 > -1 && this.anInt980 < this.anInt981) {
							this.anIntArray250[this.anInt980] = this.aClass3_Sub1_Sub4_Sub3_4.method418(local13.aString10, 106) / 2;
							this.anIntArray249[this.anInt980] = this.aClass3_Sub1_Sub4_Sub3_4.anInt627;
							this.anIntArray247[this.anInt980] = this.anInt943;
							this.anIntArray248[this.anInt980] = this.anInt944;
							this.anIntArray251[this.anInt980] = local13.anInt329;
							this.anIntArray252[this.anInt980] = local13.anInt321;
							this.anIntArray253[this.anInt980] = local13.anInt352;
							this.aStringArray13[this.anInt980++] = local13.aString10;
							if (this.anInt927 == 0 && local13.anInt321 >= 1 && local13.anInt321 <= 3) {
								this.anIntArray249[this.anInt980] += 10;
								this.anIntArray248[this.anInt980] += 5;
							}
							if (this.anInt927 == 0 && local13.anInt321 == 4) {
								this.anIntArray250[this.anInt980] = 60;
							}
							if (this.anInt927 == 0 && local13.anInt321 == 5) {
								this.anIntArray249[this.anInt980] += 5;
							}
						}
					}
					if (local13.anInt324 > anInt1000) {
						this.method599(local13, local13.anInt361 + 15);
						if (this.anInt943 > -1) {
							local70 = local13.anInt325 * 30 / local13.anInt326;
							if (local70 > 30) {
								local70 = 30;
							}
							Class3_Sub1_Sub4.method437(65280, this.anInt943 - 15, this.anInt944 - 3, local70, 5);
							Class3_Sub1_Sub4.method437(16711680, this.anInt943 + local70 - 15, this.anInt944 - 3, 30 - local70, 5);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray119[local70] > anInt1000) {
							this.method599(local13, local13.anInt361 / 2);
							if (this.anInt943 > -1) {
								if (local70 == 1) {
									this.anInt944 -= 20;
								}
								if (local70 == 2) {
									this.anInt943 -= 15;
									this.anInt944 -= 10;
								}
								if (local70 == 3) {
									this.anInt943 += 15;
									this.anInt944 -= 10;
								}
								this.aClass3_Sub1_Sub4_Sub4Array4[local13.anIntArray118[local70]].method449(this.anInt943 - 12, this.anInt944 - 12, (byte) 2);
								this.aClass3_Sub1_Sub4_Sub3_2.method415(0, this.anInt944 + 4, this.anInt943, String.valueOf(local13.anIntArray117[local70]));
								this.aClass3_Sub1_Sub4_Sub3_2.method415(16777215, this.anInt944 + 3, this.anInt943 - 1, String.valueOf(local13.anIntArray117[local70]));
							}
						}
					}
				}
			}
			for (@Pc(619) int local619 = 0; local619 < this.anInt980; local619++) {
				local70 = this.anIntArray247[local619];
				@Pc(631) int local631 = this.anIntArray248[local619];
				@Pc(636) int local636 = this.anIntArray250[local619];
				@Pc(641) int local641 = this.anIntArray249[local619];
				@Pc(643) boolean local643 = true;
				while (local643) {
					local643 = false;
					for (@Pc(649) int local649 = 0; local649 < local619; local649++) {
						if (local631 + 2 > this.anIntArray248[local649] - this.anIntArray249[local649] && local631 - local641 < this.anIntArray248[local649] + 2 && local70 - local636 < this.anIntArray247[local649] + this.anIntArray250[local649] && local70 + local636 > this.anIntArray247[local649] - this.anIntArray250[local649] && this.anIntArray248[local649] - this.anIntArray249[local649] < local631) {
							local631 = this.anIntArray248[local649] - this.anIntArray249[local649];
							local643 = true;
						}
					}
				}
				this.anInt943 = this.anIntArray247[local619];
				this.anInt944 = this.anIntArray248[local619] = local631;
				@Pc(748) String local748 = this.aStringArray13[local619];
				if (this.anInt927 == 0) {
					@Pc(753) int local753 = 16776960;
					if (this.anIntArray251[local619] < 6) {
						local753 = this.anIntArray216[this.anIntArray251[local619]];
					}
					if (this.anIntArray251[local619] == 6) {
						local753 = this.anInt1029 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray251[local619] == 7) {
						local753 = this.anInt1029 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray251[local619] == 8) {
						local753 = this.anInt1029 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(828) int local828;
					if (this.anIntArray251[local619] == 9) {
						local828 = 150 - this.anIntArray253[local619];
						if (local828 < 50) {
							local753 = local828 * 1280 + 16711680;
						} else if (local828 < 100) {
							local753 = 16776960 - (local828 - 50) * 327680;
						} else if (local828 < 150) {
							local753 = (local828 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray251[local619] == 10) {
						local828 = 150 - this.anIntArray253[local619];
						if (local828 < 50) {
							local753 = local828 * 5 + 16711680;
						} else if (local828 < 100) {
							local753 = 16711935 - (local828 - 50) * 327680;
						} else if (local828 < 150) {
							local753 = (local828 - 100) * 327680 + 255 - (local828 - 100) * 5;
						}
					}
					if (this.anIntArray251[local619] == 11) {
						local828 = 150 - this.anIntArray253[local619];
						if (local828 < 50) {
							local753 = 16777215 - local828 * 327685;
						} else if (local828 < 100) {
							local753 = (local828 - 50) * 327685 + 65280;
						} else if (local828 < 150) {
							local753 = 16777215 - (local828 - 100) * 327680;
						}
					}
					if (this.anIntArray252[local619] == 0) {
						this.aClass3_Sub1_Sub4_Sub3_4.method415(0, this.anInt944 + 1, this.anInt943, local748);
						this.aClass3_Sub1_Sub4_Sub3_4.method415(local753, this.anInt944, this.anInt943, local748);
					}
					if (this.anIntArray252[local619] == 1) {
						this.aClass3_Sub1_Sub4_Sub3_4.method420(this.anInt1029, this.anInt944 + 1, 0, this.anInt943, local748);
						this.aClass3_Sub1_Sub4_Sub3_4.method420(this.anInt1029, this.anInt944, local753, this.anInt943, local748);
					}
					if (this.anIntArray252[local619] == 2) {
						this.aClass3_Sub1_Sub4_Sub3_4.method421(this.anInt944 + 1, 0, this.anInt943, local748, this.anInt1029);
						this.aClass3_Sub1_Sub4_Sub3_4.method421(this.anInt944, local753, this.anInt943, local748, this.anInt1029);
					}
					if (this.anIntArray252[local619] == 3) {
						this.aClass3_Sub1_Sub4_Sub3_4.method422(0, local748, 150 - this.anIntArray253[local619], this.anInt944 + 1, this.anInt1029, this.anInt943);
						this.aClass3_Sub1_Sub4_Sub3_4.method422(local753, local748, 150 - this.anIntArray253[local619], this.anInt944, this.anInt1029, this.anInt943);
					}
					@Pc(1125) int local1125;
					if (this.anIntArray252[local619] == 4) {
						local828 = this.aClass3_Sub1_Sub4_Sub3_4.method418(local748, 106);
						local1125 = (150 - this.anIntArray253[local619]) * (local828 + 100) / 150;
						Class3_Sub1_Sub4.method434(this.anInt943 - 50, 0, this.anInt943 + 50, 134, 334);
						this.aClass3_Sub1_Sub4_Sub3_4.method419(0, this.anInt943 + 50 - local1125, this.anInt944 + 1, local748);
						this.aClass3_Sub1_Sub4_Sub3_4.method419(local753, this.anInt943 + 50 - local1125, this.anInt944, local748);
						Class3_Sub1_Sub4.method433();
					}
					if (this.anIntArray252[local619] == 5) {
						local828 = 150 - this.anIntArray253[local619];
						local1125 = 0;
						if (local828 < 25) {
							local1125 = local828 - 25;
						} else if (local828 > 125) {
							local1125 = local828 - 125;
						}
						Class3_Sub1_Sub4.method434(0, this.anInt944 - this.aClass3_Sub1_Sub4_Sub3_4.anInt627 - 1, 512, 134, this.anInt944 + 5);
						this.aClass3_Sub1_Sub4_Sub3_4.method415(0, this.anInt944 + local1125 + 1, this.anInt943, local748);
						this.aClass3_Sub1_Sub4_Sub3_4.method415(local753, this.anInt944 + local1125, this.anInt943, local748);
						Class3_Sub1_Sub4.method433();
					}
				} else {
					this.aClass3_Sub1_Sub4_Sub3_4.method415(0, this.anInt944 + 1, this.anInt943, local748);
					this.aClass3_Sub1_Sub4_Sub3_4.method415(16776960, this.anInt944, this.anInt943, local748);
				}
			}
		} catch (@Pc(1275) RuntimeException local1275) {
			signlink.reporterror("80749, " + 4 + ", " + local1275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method717() {
		try {
			@Pc(7) byte[] local7 = this.aClass13_2.method140("title.dat", null);
			@Pc(13) Class3_Sub1_Sub4_Sub4 local13 = new Class3_Sub1_Sub4_Sub4(local7, this);
			this.aClass42_22.method541();
			local13.method447(0, 0);
			this.aClass42_23.method541();
			local13.method447(-637, 0);
			this.aClass42_19.method541();
			local13.method447(-128, 0);
			this.aClass42_20.method541();
			local13.method447(-202, -371);
			this.aClass42_21.method541();
			local13.method447(-202, -171);
			this.aClass42_24.method541();
			local13.method447(0, -265);
			this.aClass42_25.method541();
			local13.method447(-562, -265);
			this.aClass42_26.method541();
			local13.method447(-128, -171);
			this.aClass42_27.method541();
			local13.method447(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt643];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt644; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt643; local104++) {
					local98[local104] = local13.anIntArray175[local13.anInt643 + local13.anInt643 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt643; local130++) {
					local13.anIntArray175[local130 + local13.anInt643 * local100] = local98[local130];
				}
			}
			this.aClass42_22.method541();
			local13.method447(382, 0);
			this.aClass42_23.method541();
			local13.method447(-255, 0);
			this.aClass42_19.method541();
			local13.method447(254, 0);
			this.aClass42_20.method541();
			local13.method447(180, -371);
			this.aClass42_21.method541();
			local13.method447(180, -171);
			this.aClass42_24.method541();
			local13.method447(382, -265);
			this.aClass42_25.method541();
			local13.method447(-180, -265);
			this.aClass42_26.method541();
			local13.method447(254, -171);
			this.aClass42_27.method541();
			local13.method447(-180, -171);
			local13 = new Class3_Sub1_Sub4_Sub4(this.aClass13_2, "logo", 0);
			this.aClass42_19.method541();
			local13.method449(382 - local13.anInt643 / 2 - 128, 18, (byte) 2);
			System.gc();
		} catch (@Pc(280) RuntimeException local280) {
			signlink.reporterror("66460, " + 1 + ", " + local280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class50 local9 = this.aClass50ArrayArrayArray1[this.anInt1052][arg0][arg1];
		if (local9 == null) {
			this.aClass34_1.method483(this.anInt1052, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class3_Sub1_Sub1_Sub6 local23 = null;
		@Pc(27) Class3_Sub1_Sub1_Sub6 local27;
		for (local27 = (Class3_Sub1_Sub1_Sub6) local9.method571(); local27 != null; local27 = (Class3_Sub1_Sub1_Sub6) local9.method573((byte) 3)) {
			@Pc(32) Class25 local32 = Class25.method347(local27.anInt801);
			@Pc(35) int local35 = local32.anInt508;
			if (local32.aBoolean139) {
				local35 *= local27.anInt800 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method569(local23);
		@Pc(65) Class3_Sub1_Sub1_Sub6 local65 = null;
		@Pc(67) Class3_Sub1_Sub1_Sub6 local67 = null;
		for (local27 = (Class3_Sub1_Sub1_Sub6) local9.method571(); local27 != null; local27 = (Class3_Sub1_Sub1_Sub6) local9.method573((byte) 3)) {
			if (local27.anInt801 != local23.anInt801 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt801 != local23.anInt801 && local27.anInt801 != local65.anInt801 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass34_1.method469(local65, local67, this.method605(this.anInt1052, arg0 * 128 + 64, arg1 * 128 + 64), this.anInt1052, arg1, arg0, local23, local110);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(BI)Ljava/lang/String;")
	private String method719(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("50795, " + -42 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method720() {
		try {
			if (this.anInt947 > 1) {
				this.anInt947--;
			}
			if (this.anInt849 > 0) {
				this.anInt849--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method644(); local22++) {
			}
			if (this.aBoolean233) {
				@Pc(41) Object local41 = this.aClass46_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass46_1.anObject1) {
					if (!aBoolean249) {
						this.aClass46_1.anInt776 = 0;
					} else if (super.anInt838 != 0 || this.aClass46_1.anInt776 >= 40) {
						this.aClass3_Sub1_Sub2_8.method189(224, 132);
						this.aClass3_Sub1_Sub2_8.method190(0);
						local66 = this.aClass3_Sub1_Sub2_8.anInt429;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass46_1.anInt776 && local66 - this.aClass3_Sub1_Sub2_8.anInt429 < 240; local70++) {
							local68++;
							local86 = this.aClass46_1.anIntArray206[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass46_1.anIntArray207[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass46_1.anIntArray206[local70] == -1 && this.aClass46_1.anIntArray207[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt884 || local86 != this.anInt885) {
								@Pc(165) int local165 = local103 - this.anInt884;
								this.anInt884 = local103;
								@Pc(173) int local173 = local86 - this.anInt885;
								this.anInt885 = local86;
								if (this.anInt909 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass3_Sub1_Sub2_8.method191((this.anInt909 << 12) + (local165 << 6) + local173);
									this.anInt909 = 0;
								} else if (this.anInt909 < 8) {
									this.aClass3_Sub1_Sub2_8.method193((this.anInt909 << 19) + local120 + 8388608);
									this.anInt909 = 0;
								} else {
									this.aClass3_Sub1_Sub2_8.method194((this.anInt909 << 19) + local120 - 1073741824);
									this.anInt909 = 0;
								}
							} else if (this.anInt909 < 2047) {
								this.anInt909++;
							}
						}
						this.aClass3_Sub1_Sub2_8.method199(this.aClass3_Sub1_Sub2_8.anInt429 - local66);
						if (local68 >= this.aClass46_1.anInt776) {
							this.aClass46_1.anInt776 = 0;
						} else {
							this.aClass46_1.anInt776 -= local68;
							for (local86 = 0; local86 < this.aClass46_1.anInt776; local86++) {
								this.aClass46_1.anIntArray207[local86] = this.aClass46_1.anIntArray207[local86 + local68];
								this.aClass46_1.anIntArray206[local86] = this.aClass46_1.anIntArray206[local86 + local68];
							}
						}
					}
				}
				if (super.anInt838 != 0) {
					@Pc(335) long local335 = (super.aLong28 - this.aLong31) / 50L;
					if (local335 > 4095L) {
						local335 = 4095L;
					}
					this.aLong31 = super.aLong28;
					local66 = super.anInt840;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt839;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(381) byte local381 = 0;
					if (super.anInt838 == 2) {
						local381 = 1;
					}
					local103 = (int) local335;
					this.aClass3_Sub1_Sub2_8.method189(150, 132);
					this.aClass3_Sub1_Sub2_8.method194((local103 << 20) + (local381 << 19) + local70);
				}
				if (this.anInt1021 > 0) {
					this.anInt1021--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean256 = true;
				}
				if (this.aBoolean256 && this.anInt1021 <= 0) {
					this.anInt1021 = 20;
					this.aBoolean256 = false;
					this.aClass3_Sub1_Sub2_8.method189(130, 132);
					this.aClass3_Sub1_Sub2_8.method227(this.anInt872);
					this.aClass3_Sub1_Sub2_8.method191(this.anInt873);
				}
				if (super.aBoolean216 && !this.aBoolean224) {
					this.aBoolean224 = true;
					this.aClass3_Sub1_Sub2_8.method189(139, 132);
					this.aClass3_Sub1_Sub2_8.method190(1);
				}
				if (!super.aBoolean216 && this.aBoolean224) {
					this.aBoolean224 = false;
					this.aClass3_Sub1_Sub2_8.method189(139, 132);
					this.aClass3_Sub1_Sub2_8.method190(0);
				}
				this.method671();
				this.method621();
				this.method642();
				this.anInt847++;
				if (this.anInt847 > 750) {
					this.method603();
				}
				this.method610();
				this.method702();
				this.method685();
				this.anInt907++;
				if (this.anInt1034 != 0) {
					this.anInt1033 += 20;
					if (this.anInt1033 >= 400) {
						this.anInt1034 = 0;
					}
				}
				if (this.anInt1010 != 0) {
					this.anInt1007++;
					if (this.anInt1007 >= 15) {
						if (this.anInt1010 == 2) {
							this.aBoolean253 = true;
						}
						if (this.anInt1010 == 3) {
							this.aBoolean255 = true;
						}
						this.anInt1010 = 0;
					}
				}
				if (this.anInt881 != 0) {
					this.anInt1055++;
					if (super.anInt833 > this.anInt882 + 5 || super.anInt833 < this.anInt882 - 5 || super.anInt834 > this.anInt883 + 5 || super.anInt834 < this.anInt883 - 5) {
						this.aBoolean242 = true;
					}
					if (super.anInt832 == 0) {
						if (this.anInt881 == 2) {
							this.aBoolean253 = true;
						}
						if (this.anInt881 == 3) {
							this.aBoolean255 = true;
						}
						this.anInt881 = 0;
						if (this.aBoolean242 && this.anInt1055 >= 5) {
							this.anInt867 = -1;
							this.method722();
							if (this.anInt867 == this.anInt879 && this.anInt866 != this.anInt880) {
								@Pc(681) Class15 local681 = Class15.method147(this.anInt879);
								@Pc(683) byte local683 = 0;
								if (this.anInt938 == 1 && local681.anInt304 == 206) {
									local683 = 1;
								}
								if (local681.anIntArray106[this.anInt866] <= 0) {
									local683 = 0;
								}
								if (local681.aBoolean56) {
									local66 = this.anInt880;
									local68 = this.anInt866;
									local681.anIntArray106[local68] = local681.anIntArray106[local66];
									local681.anIntArray112[local68] = local681.anIntArray112[local66];
									local681.anIntArray106[local66] = -1;
									local681.anIntArray112[local66] = 0;
								} else if (local683 == 1) {
									local66 = this.anInt880;
									local68 = this.anInt866;
									while (local66 != local68) {
										if (local66 > local68) {
											local681.method144(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local681.method144(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local681.method144(this.anInt866, this.anInt880);
								}
								this.aClass3_Sub1_Sub2_8.method189(109, 132);
								this.aClass3_Sub1_Sub2_8.method190(local683);
								this.aClass3_Sub1_Sub2_8.method226(this.anInt879);
								this.aClass3_Sub1_Sub2_8.method226(this.anInt866);
								this.aClass3_Sub1_Sub2_8.method225(this.anInt880);
							}
						} else if ((this.anInt1044 == 1 || this.method655(this.anInt1047 - 1)) && this.anInt1047 > 2) {
							this.method691();
						} else if (this.anInt1047 > 0) {
							this.method645(this.anInt1047 - 1);
						}
						this.anInt1007 = 10;
						super.anInt838 = 0;
					}
				}
				@Pc(855) int local855;
				@Pc(857) int local857;
				if (Class34.anInt685 != -1) {
					local855 = Class34.anInt685;
					local857 = Class34.anInt686;
					@Pc(878) boolean local878 = this.method589(0, true, 0, 0, local855, 0, 0, local857, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0], aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0], 0);
					Class34.anInt685 = -1;
					if (local878) {
						this.anInt1031 = super.anInt839;
						this.anInt1032 = super.anInt840;
						this.anInt1034 = 1;
						this.anInt1033 = 0;
					}
				}
				if (super.anInt838 == 1 && this.aString18 != null) {
					this.aString18 = null;
					this.aBoolean255 = true;
					super.anInt838 = 0;
				}
				this.method692();
				if (this.anInt942 == -1) {
					this.method612();
					this.method679((byte) 6);
					this.method622();
				}
				if (super.anInt832 == 1 || super.anInt838 == 1) {
					this.anInt1004++;
				}
				if (this.anInt906 == 0 && this.anInt863 == 0 && this.anInt904 == 0) {
					if (this.anInt1051 > 0) {
						this.anInt1051--;
					}
				} else if (this.anInt1051 < 100) {
					this.anInt1051++;
					if (this.anInt1051 == 100) {
						if (this.anInt906 != 0) {
							this.aBoolean255 = true;
						}
						if (this.anInt863 != 0) {
							this.aBoolean253 = true;
						}
					}
				}
				if (this.anInt1028 == 2) {
					this.method625();
				}
				if (this.anInt1028 == 2 && this.aBoolean217) {
					this.method697(this.aByte46);
				}
				for (local855 = 0; local855 < 5; local855++) {
					@Pc(1015) int local1015 = this.anIntArray214[local855]++;
				}
				this.method669();
				anInt974++;
				if (anInt974 > 153) {
					anInt974 = 0;
					this.aClass3_Sub1_Sub2_8.method189(1, 132);
					this.aClass3_Sub1_Sub2_8.method191(26173);
				}
				super.anInt831++;
				if (super.anInt831 > 4500) {
					this.anInt849 = 250;
					super.anInt831 -= 500;
					this.aClass3_Sub1_Sub2_8.method189(63, 132);
				}
				this.anInt1045++;
				if (this.anInt1045 > 500) {
					this.anInt1045 = 0;
					local857 = (int) (Math.random() * 8.0D);
					if ((local857 & 0x1) == 1) {
						this.anInt957 += this.anInt958;
					}
					if ((local857 & 0x2) == 2) {
						this.anInt1039 += this.anInt1040;
					}
					if ((local857 & 0x4) == 4) {
						this.anInt961 += this.anInt962;
					}
				}
				if (this.anInt957 < -50) {
					this.anInt958 = 2;
				}
				if (this.anInt957 > 50) {
					this.anInt958 = -2;
				}
				if (this.anInt1039 < -55) {
					this.anInt1040 = 2;
				}
				if (this.anInt1039 > 55) {
					this.anInt1040 = -2;
				}
				if (this.anInt961 < -40) {
					this.anInt962 = 1;
				}
				if (this.anInt961 > 40) {
					this.anInt962 = -1;
				}
				this.anInt973++;
				if (this.anInt973 > 500) {
					this.anInt973 = 0;
					local857 = (int) (Math.random() * 8.0D);
					if ((local857 & 0x1) == 1) {
						this.anInt921 += this.anInt922;
					}
					if ((local857 & 0x2) == 2) {
						this.anInt870 += this.anInt871;
					}
				}
				if (this.anInt921 < -60) {
					this.anInt922 = 2;
				}
				if (this.anInt921 > 60) {
					this.anInt922 = -2;
				}
				if (this.anInt870 < -20) {
					this.anInt871 = 1;
				}
				if (this.anInt870 > 10) {
					this.anInt871 = -1;
				}
				this.anInt848++;
				if (this.anInt848 > 50) {
					this.aClass3_Sub1_Sub2_8.method189(58, 132);
				}
				try {
					if (this.aClass16_1 != null && this.aClass3_Sub1_Sub2_8.anInt429 > 0) {
						this.aClass16_1.method165(this.aClass3_Sub1_Sub2_8.anInt429, this.aClass3_Sub1_Sub2_8.aByteArray14);
						this.aClass3_Sub1_Sub2_8.anInt429 = 0;
						this.anInt848 = 0;
					}
				} catch (@Pc(1281) IOException local1281) {
					this.method603();
				} catch (@Pc(1286) Exception local1286) {
					this.method695();
				}
			}
		} catch (@Pc(1291) RuntimeException local1291) {
			signlink.reporterror("30677, " + 1 + ", " + local1291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method721(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.aClass42_6 == null) {
				this.method609((byte) 9);
				super.aClass42_2 = null;
				this.aClass42_19 = null;
				this.aClass42_20 = null;
				this.aClass42_21 = null;
				this.aClass42_22 = null;
				this.aClass42_23 = null;
				this.aClass42_24 = null;
				this.aClass42_25 = null;
				this.aClass42_26 = null;
				this.aClass42_27 = null;
				this.aClass42_6 = new Class42(479, 96, 462, this.method586());
				this.aClass42_4 = new Class42(172, 156, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass3_Sub1_Sub4_Sub1_7.method281(0, 0);
				this.aClass42_3 = new Class42(190, 261, 462, this.method586());
				this.aClass42_5 = new Class42(512, 334, 462, this.method586());
				Class3_Sub1_Sub4.method435();
				this.aClass42_16 = new Class42(496, 50, 462, this.method586());
				this.aClass42_17 = new Class42(269, 37, 462, this.method586());
				this.aClass42_18 = new Class42(249, 45, 462, this.method586());
				this.aBoolean248 = true;
				this.aClass42_5.method541();
				Class3_Sub1_Sub4_Sub2.anIntArray149 = this.anIntArray275;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("9454, " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method722() {
		try {
			if (this.anInt881 == 0) {
				this.aStringArray14[0] = "Cancel";
				this.anIntArray219[0] = 1921;
				this.anInt1047 = 1;
				if (this.anInt942 == -1) {
					this.method688(336);
					this.anInt940 = 0;
					this.anInt1003 = 0;
					if (super.anInt833 > 4 && super.anInt834 > 4 && super.anInt833 < 516 && super.anInt834 < 338) {
						if (this.anInt868 == -1) {
							this.method723();
						} else {
							this.method661(Class15.method147(this.anInt868), super.anInt834, 0, 4, super.anInt833, 0, 4);
						}
					}
					if (this.anInt940 != this.anInt852) {
						this.anInt852 = this.anInt940;
					}
					if (this.anInt1003 != this.anInt904) {
						this.anInt904 = this.anInt1003;
					}
					this.anInt940 = 0;
					this.anInt1003 = 0;
					if (super.anInt833 > 553 && super.anInt834 > 205 && super.anInt833 < 743 && super.anInt834 < 466) {
						if (this.anInt1011 != -1) {
							this.method661(Class15.method147(this.anInt1011), super.anInt834, 1, 553, super.anInt833, 0, 205);
						} else if (this.anIntArray268[this.anInt886] != -1) {
							this.method661(Class15.method147(this.anIntArray268[this.anInt886]), super.anInt834, 1, 553, super.anInt833, 0, 205);
						}
					}
					if (this.anInt940 != this.anInt850) {
						this.aBoolean253 = true;
						this.anInt850 = this.anInt940;
					}
					if (this.anInt1003 != this.anInt863) {
						this.aBoolean253 = true;
						this.anInt863 = this.anInt1003;
					}
					this.anInt940 = 0;
					this.anInt1003 = 0;
					if (super.anInt833 > 17 && super.anInt834 > 357 && super.anInt833 < 496 && super.anInt834 < 453) {
						if (this.anInt1046 != -1) {
							this.method661(Class15.method147(this.anInt1046), super.anInt834, 2, 17, super.anInt833, 0, 357);
						} else if (this.anInt1060 != -1) {
							this.method661(Class15.method147(this.anInt1060), super.anInt834, 3, 17, super.anInt833, 0, 357);
						} else if (super.anInt834 < 434 && super.anInt833 < 426 && this.anInt933 == 0) {
							this.method693(super.anInt833 - 17, super.anInt834 - 357);
						}
					}
					if ((this.anInt1046 != -1 || this.anInt1060 != -1) && this.anInt940 != this.anInt1043) {
						this.aBoolean255 = true;
						this.anInt1043 = this.anInt940;
					}
					if ((this.anInt1046 != -1 || this.anInt1060 != -1) && this.anInt1003 != this.anInt906) {
						this.aBoolean255 = true;
						this.anInt906 = this.anInt1003;
					}
					@Pc(349) boolean local349 = false;
					while (!local349) {
						local349 = true;
						for (@Pc(355) int local355 = 0; local355 < this.anInt1047 - 1; local355++) {
							if (this.anIntArray219[local355] < 1000 && this.anIntArray219[local355 + 1] > 1000) {
								@Pc(376) String local376 = this.aStringArray14[local355];
								this.aStringArray14[local355] = this.aStringArray14[local355 + 1];
								this.aStringArray14[local355 + 1] = local376;
								@Pc(398) int local398 = this.anIntArray219[local355];
								this.anIntArray219[local355] = this.anIntArray219[local355 + 1];
								this.anIntArray219[local355 + 1] = local398;
								@Pc(420) int local420 = this.anIntArray217[local355];
								this.anIntArray217[local355] = this.anIntArray217[local355 + 1];
								this.anIntArray217[local355 + 1] = local420;
								@Pc(442) int local442 = this.anIntArray218[local355];
								this.anIntArray218[local355] = this.anIntArray218[local355 + 1];
								this.anIntArray218[local355 + 1] = local442;
								@Pc(464) int local464 = this.anIntArray220[local355];
								this.anIntArray220[local355] = this.anIntArray220[local355 + 1];
								this.anIntArray220[local355 + 1] = local464;
								local349 = false;
							}
						}
					}
				} else {
					this.anInt940 = 0;
					this.anInt1003 = 0;
					this.method661(Class15.method147(this.anInt942), super.anInt834, 0, 0, super.anInt833, 0, 0);
					if (this.anInt940 != this.anInt852) {
						this.anInt852 = this.anInt940;
					}
					if (this.anInt1003 != this.anInt904) {
						this.anInt904 = this.anInt1003;
					}
				}
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("19274, " + 7 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass16_1 != null) {
					this.aClass16_1.method161();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass16_1 = null;
			this.method726();
			if (this.aClass46_1 != null) {
				this.aClass46_1.aBoolean200 = false;
			}
			this.aClass46_1 = null;
			this.aClass8_Sub1_1.method122();
			this.aClass8_Sub1_1 = null;
			this.aClass3_Sub1_Sub2_7 = null;
			this.aClass3_Sub1_Sub2_8 = null;
			this.aClass3_Sub1_Sub2_9 = null;
			this.aClass3_Sub1_Sub2_6 = null;
			this.anIntArray257 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray258 = null;
			this.anIntArray259 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass34_1 = null;
			this.aClass22Array1 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray239 = null;
			this.anIntArray240 = null;
			this.aByteArray21 = null;
			this.aClass42_3 = null;
			this.aClass42_4 = null;
			this.aClass42_5 = null;
			this.aClass42_6 = null;
			this.aClass42_16 = null;
			this.aClass42_17 = null;
			this.aClass42_18 = null;
			this.aClass42_7 = null;
			this.aClass42_8 = null;
			this.aClass42_9 = null;
			this.aClass42_10 = null;
			this.aClass42_11 = null;
			this.aClass42_12 = null;
			this.aClass42_13 = null;
			this.aClass42_14 = null;
			this.aClass42_15 = null;
			this.aClass3_Sub1_Sub4_Sub1_6 = null;
			this.aClass3_Sub1_Sub4_Sub1_7 = null;
			this.aClass3_Sub1_Sub4_Sub1_8 = null;
			this.aClass3_Sub1_Sub4_Sub1_9 = null;
			this.aClass3_Sub1_Sub4_Sub1_10 = null;
			this.aClass3_Sub1_Sub4_Sub1_11 = null;
			this.aClass3_Sub1_Sub4_Sub1Array5 = null;
			this.aClass3_Sub1_Sub4_Sub1_1 = null;
			this.aClass3_Sub1_Sub4_Sub1_2 = null;
			this.aClass3_Sub1_Sub4_Sub1_3 = null;
			this.aClass3_Sub1_Sub4_Sub1_4 = null;
			this.aClass3_Sub1_Sub4_Sub1_5 = null;
			this.aClass3_Sub1_Sub4_Sub1_12 = null;
			this.aClass3_Sub1_Sub4_Sub1_13 = null;
			this.aClass3_Sub1_Sub4_Sub1_14 = null;
			this.aClass3_Sub1_Sub4_Sub1_15 = null;
			this.aClass3_Sub1_Sub4_Sub1_16 = null;
			this.aClass3_Sub1_Sub4_Sub4_17 = null;
			this.aClass3_Sub1_Sub4_Sub4Array4 = null;
			this.aClass3_Sub1_Sub4_Sub4Array8 = null;
			this.aClass3_Sub1_Sub4_Sub4Array6 = null;
			this.aClass3_Sub1_Sub4_Sub4Array7 = null;
			this.aClass3_Sub1_Sub4_Sub4Array9 = null;
			this.aClass3_Sub1_Sub4_Sub4_16 = null;
			this.aClass3_Sub1_Sub4_Sub4_11 = null;
			this.aClass3_Sub1_Sub4_Sub4_12 = null;
			this.aClass3_Sub1_Sub4_Sub4_13 = null;
			this.aClass3_Sub1_Sub4_Sub4_14 = null;
			this.aClass3_Sub1_Sub4_Sub4_15 = null;
			this.aClass3_Sub1_Sub4_Sub1Array2 = null;
			this.aClass3_Sub1_Sub4_Sub4Array5 = null;
			this.anIntArrayArray22 = null;
			this.aClass3_Sub1_Sub1_Sub2_Sub1Array1 = null;
			this.anIntArray244 = null;
			this.anIntArray245 = null;
			this.aClass3_Sub1_Sub2Array1 = null;
			this.anIntArray237 = null;
			this.aClass3_Sub1_Sub1_Sub2_Sub2Array1 = null;
			this.anIntArray229 = null;
			this.aClass50ArrayArrayArray1 = null;
			this.aClass50_11 = null;
			this.aClass50_10 = null;
			this.aClass50_12 = null;
			this.anIntArray217 = null;
			this.anIntArray218 = null;
			this.anIntArray219 = null;
			this.anIntArray220 = null;
			this.aStringArray14 = null;
			this.anIntArray232 = null;
			this.anIntArray264 = null;
			this.anIntArray265 = null;
			this.aClass3_Sub1_Sub4_Sub4Array10 = null;
			this.aClass3_Sub1_Sub4_Sub4_8 = null;
			this.aStringArray9 = null;
			this.aLongArray3 = null;
			this.anIntArray233 = null;
			this.aClass42_22 = null;
			this.aClass42_23 = null;
			this.aClass42_19 = null;
			this.aClass42_20 = null;
			this.aClass42_21 = null;
			this.aClass42_24 = null;
			this.aClass42_25 = null;
			this.aClass42_26 = null;
			this.aClass42_27 = null;
			this.method609((byte) 9);
			Class19.method181(this.anInt929);
			Class40.method534(this.anInt929);
			Class25.method343(this.anInt929);
			Class15.method142(this.anInt929);
			Class33.aClass33Array1 = null;
			Class20.aClass20Array1 = null;
			Class35.aClass35Array1 = null;
			Class38.aClass38Array1 = null;
			Class44.aClass44Array1 = null;
			Class44.aClass36_9 = null;
			Class17.aClass17Array1 = null;
			super.aClass42_2 = null;
			Class3_Sub1_Sub1_Sub2_Sub1.aClass36_1 = null;
			Class3_Sub1_Sub4_Sub2.method362(this.anInt929);
			Class34.method461(this.anInt929);
			Class3_Sub1_Sub1_Sub1.method18(this.anInt929);
			Class7.method92(this.anInt929);
			System.gc();
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("48713, " + 24755 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method723() {
		try {
			if (this.anInt953 == 0 && this.anInt963 == 0) {
				this.aStringArray14[this.anInt1047] = "Walk here";
				this.anIntArray219[this.anInt1047] = 16;
				this.anIntArray217[this.anInt1047] = super.anInt833;
				this.anIntArray218[this.anInt1047] = super.anInt834;
				this.anInt1047++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class3_Sub1_Sub1_Sub1.anInt36; local43++) {
				@Pc(49) int local49 = Class3_Sub1_Sub1_Sub1.anIntArray39[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass34_1.method492(this.anInt1052, local53, local59, local49) >= 0) {
						@Pc(91) Class19 local91 = Class19.method182(local71);
						if (local91.anIntArray124 != null) {
							local91 = local91.method178();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt953 == 1) {
							this.aStringArray14[this.anInt1047] = "Use " + this.aString22 + " with @cya@" + local91.aString12;
							this.anIntArray219[this.anInt1047] = 419;
							this.anIntArray220[this.anInt1047] = local49;
							this.anIntArray217[this.anInt1047] = local53;
							this.anIntArray218[this.anInt1047] = local59;
							this.anInt1047++;
						} else if (this.anInt963 != 1) {
							if (local91.aStringArray3 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray3[local218] != null) {
										this.aStringArray14[this.anInt1047] = local91.aStringArray3[local218] + " @cya@" + local91.aString12;
										if (local218 == 0) {
											this.anIntArray219[this.anInt1047] = 588;
										}
										if (local218 == 1) {
											this.anIntArray219[this.anInt1047] = 256;
										}
										if (local218 == 2) {
											this.anIntArray219[this.anInt1047] = 766;
										}
										if (local218 == 3) {
											this.anIntArray219[this.anInt1047] = 985;
										}
										if (local218 == 4) {
											this.anIntArray219[this.anInt1047] = 1577;
										}
										this.anIntArray220[this.anInt1047] = local49;
										this.anIntArray217[this.anInt1047] = local53;
										this.anIntArray218[this.anInt1047] = local59;
										this.anInt1047++;
									}
								}
							}
							this.aStringArray14[this.anInt1047] = "Examine @cya@" + local91.aString12;
							this.anIntArray219[this.anInt1047] = 1327;
							this.anIntArray220[this.anInt1047] = local91.anInt389 << 14;
							this.anIntArray217[this.anInt1047] = local53;
							this.anIntArray218[this.anInt1047] = local59;
							this.anInt1047++;
						} else if ((this.anInt965 & 0x4) == 4) {
							this.aStringArray14[this.anInt1047] = this.aString24 + " @cya@" + local91.aString12;
							this.anIntArray219[this.anInt1047] = 157;
							this.anIntArray220[this.anInt1047] = local49;
							this.anIntArray217[this.anInt1047] = local53;
							this.anIntArray218[this.anInt1047] = local59;
							this.anInt1047++;
						}
					}
					@Pc(398) Class3_Sub1_Sub1_Sub2_Sub2 local398;
					@Pc(446) Class3_Sub1_Sub1_Sub2_Sub1 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class3_Sub1_Sub1_Sub2_Sub2 local369 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local71];
						if (local369.aClass40_2.aByte37 == 1 && (local369.anInt330 & 0x7F) == 64 && (local369.anInt331 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt901; local218++) {
								local398 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray229[local218]];
								if (local398 != null && local398 != local369 && local398.aClass40_2.aByte37 == 1 && local398.anInt330 == local369.anInt330 && local398.anInt331 == local369.anInt331) {
									this.method658(local398.aClass40_2, local59, local53, this.anIntArray229[local218]);
								}
							}
							for (local436 = 0; local436 < this.anInt969; local436++) {
								local446 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local436]];
								if (local446 != null && local446.anInt330 == local369.anInt330 && local446.anInt331 == local369.anInt331) {
									this.method663(local59, this.anIntArray244[local436], local446, local53);
								}
							}
						}
						this.method658(local369.aClass40_2, local59, local53, local71);
					}
					if (local65 == 0) {
						@Pc(488) Class3_Sub1_Sub1_Sub2_Sub1 local488 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[local71];
						if ((local488.anInt330 & 0x7F) == 64 && (local488.anInt331 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt901; local218++) {
								local398 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray229[local218]];
								if (local398 != null && local398.aClass40_2.aByte37 == 1 && local398.anInt330 == local488.anInt330 && local398.anInt331 == local488.anInt331) {
									this.method658(local398.aClass40_2, local59, local53, this.anIntArray229[local218]);
								}
							}
							for (local436 = 0; local436 < this.anInt969; local436++) {
								local446 = this.aClass3_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local436]];
								if (local446 != null && local446 != local488 && local446.anInt330 == local488.anInt330 && local446.anInt331 == local488.anInt331) {
									this.method663(local59, this.anIntArray244[local436], local446, local53);
								}
							}
						}
						this.method663(local59, local71, local488, local53);
					}
					if (local65 == 3) {
						@Pc(607) Class50 local607 = this.aClass50ArrayArrayArray1[this.anInt1052][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class3_Sub1_Sub1_Sub6 local614 = (Class3_Sub1_Sub1_Sub6) local607.method572(); local614 != null; local614 = (Class3_Sub1_Sub1_Sub6) local607.method574()) {
								@Pc(620) Class25 local620 = Class25.method347(local614.anInt801);
								if (this.anInt953 == 1) {
									this.aStringArray14[this.anInt1047] = "Use " + this.aString22 + " with @lre@" + local620.aString13;
									this.anIntArray219[this.anInt1047] = 62;
									this.anIntArray220[this.anInt1047] = local614.anInt801;
									this.anIntArray217[this.anInt1047] = local53;
									this.anIntArray218[this.anInt1047] = local59;
									this.anInt1047++;
								} else if (this.anInt963 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray6 != null && local620.aStringArray6[local737] != null) {
											this.aStringArray14[this.anInt1047] = local620.aStringArray6[local737] + " @lre@" + local620.aString13;
											if (local737 == 0) {
												this.anIntArray219[this.anInt1047] = 184;
											}
											if (local737 == 1) {
												this.anIntArray219[this.anInt1047] = 81;
											}
											if (local737 == 2) {
												this.anIntArray219[this.anInt1047] = 98;
											}
											if (local737 == 3) {
												this.anIntArray219[this.anInt1047] = 275;
											}
											if (local737 == 4) {
												this.anIntArray219[this.anInt1047] = 689;
											}
											this.anIntArray220[this.anInt1047] = local614.anInt801;
											this.anIntArray217[this.anInt1047] = local53;
											this.anIntArray218[this.anInt1047] = local59;
											this.anInt1047++;
										} else if (local737 == 2) {
											this.aStringArray14[this.anInt1047] = "Take @lre@" + local620.aString13;
											this.anIntArray219[this.anInt1047] = 98;
											this.anIntArray220[this.anInt1047] = local614.anInt801;
											this.anIntArray217[this.anInt1047] = local53;
											this.anIntArray218[this.anInt1047] = local59;
											this.anInt1047++;
										}
									}
									this.aStringArray14[this.anInt1047] = "Examine @lre@" + local620.aString13;
									this.anIntArray219[this.anInt1047] = 1184;
									this.anIntArray220[this.anInt1047] = local614.anInt801;
									this.anIntArray217[this.anInt1047] = local53;
									this.anIntArray218[this.anInt1047] = local59;
									this.anInt1047++;
								} else if ((this.anInt965 & 0x1) == 1) {
									this.aStringArray14[this.anInt1047] = this.aString24 + " @lre@" + local620.aString13;
									this.anIntArray219[this.anInt1047] = 538;
									this.anIntArray220[this.anInt1047] = local614.anInt801;
									this.anIntArray217[this.anInt1047] = local53;
									this.anIntArray218[this.anInt1047] = local59;
									this.anInt1047++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(953) RuntimeException local953) {
			signlink.reporterror("42969, " + true + ", " + local953.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method724(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean220) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method694(43595);
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

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZI)V")
	private void method725(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1079 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("18993, " + -971 + ", " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt827 = 5;
		}
		if (aBoolean228) {
			this.aBoolean229 = true;
			return;
		}
		aBoolean228 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method613();
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
			this.aBoolean227 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass29Array1[local101] = new Class29(local101 + 1, -10687, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local101], 500000);
			}
		}
		try {
			this.method715();
			this.aClass13_2 = this.method681("title", this.anIntArray267[1], 1, 25, "title screen");
			this.aClass3_Sub1_Sub4_Sub3_2 = new Class3_Sub1_Sub4_Sub3(0, "p11_full", false, this.aClass13_2);
			this.aClass3_Sub1_Sub4_Sub3_3 = new Class3_Sub1_Sub4_Sub3(0, "p12_full", false, this.aClass13_2);
			this.aClass3_Sub1_Sub4_Sub3_4 = new Class3_Sub1_Sub4_Sub3(0, "b12_full", false, this.aClass13_2);
			this.aClass3_Sub1_Sub4_Sub3_5 = new Class3_Sub1_Sub4_Sub3(0, "q8_full", true, this.aClass13_2);
			this.method717();
			this.method712();
			@Pc(197) Class13 local197 = this.method681("config", this.anIntArray267[2], 2, 30, "config");
			@Pc(209) Class13 local209 = this.method681("interface", this.anIntArray267[3], 3, 35, "interface");
			@Pc(221) Class13 local221 = this.method681("media", this.anIntArray267[4], 4, 40, "2d graphics");
			@Pc(233) Class13 local233 = this.method681("textures", this.anIntArray267[6], 6, 45, "textures");
			@Pc(245) Class13 local245 = this.method681("wordenc", this.anIntArray267[7], 7, 50, "chat system");
			@Pc(257) Class13 local257 = this.method681("sounds", this.anIntArray267[8], 8, 55, "sound effects");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass34_1 = new Class34(false, 4, 104, this.anIntArrayArrayArray7, 104);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass22Array1[local282] = new Class22(104, false, 104);
			}
			this.aClass3_Sub1_Sub4_Sub4_8 = new Class3_Sub1_Sub4_Sub4(512, 512);
			@Pc(317) Class13 local317 = this.method681("versionlist", this.anIntArray267[5], 5, 60, "update list");
			this.method588(60, "Connecting to update server");
			this.aClass8_Sub1_1 = new Class8_Sub1();
			this.aClass8_Sub1_1.method124(local317, this);
			Class7.method90(this.aClass8_Sub1_1.method127());
			Class3_Sub1_Sub1_Sub1.method19(this.aClass8_Sub1_1.method130(anInt876, 0), this.aClass8_Sub1_1);
			if (!aBoolean237) {
				this.anInt855 = 0;
				this.aBoolean218 = true;
				this.aClass8_Sub1_1.method128(2, this.anInt855);
				while (this.aClass8_Sub1_1.method116() > 0) {
					this.method657();
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass8_Sub1_1.anInt221 > 3) {
						this.method699("ondemand");
						return;
					}
				}
			}
			this.method588(65, "Requesting animations");
			@Pc(392) int local392 = this.aClass8_Sub1_1.method130(anInt876, 1);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass8_Sub1_1.method128(1, local394);
			}
			@Pc(412) int local412;
			while (this.aClass8_Sub1_1.method116() > 0) {
				local412 = local392 - this.aClass8_Sub1_1.method116();
				if (local412 > 0) {
					this.method588(65, "Loading animations - " + local412 * 100 / local392 + "%");
				}
				this.method657();
				try {
					Thread.sleep(100L);
				} catch (@Pc(438) Exception local438) {
				}
				if (this.aClass8_Sub1_1.anInt221 > 3) {
					this.method699("ondemand");
					return;
				}
			}
			this.method588(70, "Requesting models");
			local392 = this.aClass8_Sub1_1.method130(anInt876, 0);
			@Pc(472) int local472;
			for (local412 = 0; local412 < local392; local412++) {
				local472 = this.aClass8_Sub1_1.method125(local412);
				if ((local472 & 0x1) != 0) {
					this.aClass8_Sub1_1.method128(0, local412);
				}
			}
			local392 = this.aClass8_Sub1_1.method116();
			while (this.aClass8_Sub1_1.method116() > 0) {
				local472 = local392 - this.aClass8_Sub1_1.method116();
				if (local472 > 0) {
					this.method588(70, "Loading models - " + local472 * 100 / local392 + "%");
				}
				this.method657();
				try {
					Thread.sleep(100L);
				} catch (@Pc(523) Exception local523) {
				}
			}
			if (this.aClass29Array1[0] != null) {
				this.method588(75, "Requesting maps");
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(48, 47, 0, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(48, 47, 1, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(48, 48, 0, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(48, 48, 1, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(48, 49, 0, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(48, 49, 1, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(47, 47, 0, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(47, 47, 1, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(47, 48, 0, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(47, 48, 1, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(148, 48, 0, 949));
				this.aClass8_Sub1_1.method128(3, this.aClass8_Sub1_1.method126(148, 48, 1, 949));
				local392 = this.aClass8_Sub1_1.method116();
				while (this.aClass8_Sub1_1.method116() > 0) {
					local472 = local392 - this.aClass8_Sub1_1.method116();
					if (local472 > 0) {
						this.method588(75, "Loading maps - " + local472 * 100 / local392 + "%");
					}
					this.method657();
					try {
						Thread.sleep(100L);
					} catch (@Pc(708) Exception local708) {
					}
				}
			}
			local392 = this.aClass8_Sub1_1.method130(anInt876, 0);
			@Pc(729) int local729;
			for (local472 = 0; local472 < local392; local472++) {
				local729 = this.aClass8_Sub1_1.method125(local472);
				@Pc(731) byte local731 = 0;
				if ((local729 & 0x8) != 0) {
					local731 = 10;
				} else if ((local729 & 0x20) != 0) {
					local731 = 9;
				} else if ((local729 & 0x10) != 0) {
					local731 = 8;
				} else if ((local729 & 0x40) != 0) {
					local731 = 7;
				} else if ((local729 & 0x80) != 0) {
					local731 = 6;
				} else if ((local729 & 0x2) != 0) {
					local731 = 5;
				} else if ((local729 & 0x4) != 0) {
					local731 = 4;
				}
				if ((local729 & 0x1) != 0) {
					local731 = 3;
				}
				if (local731 != 0) {
					this.aClass8_Sub1_1.method118(0, local472, local731);
				}
			}
			this.aClass8_Sub1_1.method123(aBoolean236);
			if (!aBoolean237) {
				local392 = this.aClass8_Sub1_1.method130(anInt876, 2);
				for (local729 = 1; local729 < local392; local729++) {
					if (this.aClass8_Sub1_1.method131(local729)) {
						this.aClass8_Sub1_1.method118(2, local729, (byte) 1);
					}
				}
			}
			this.method588(80, "Unpacking media");
			this.aClass3_Sub1_Sub4_Sub1_6 = new Class3_Sub1_Sub4_Sub1(local221, "invback", 0);
			this.aClass3_Sub1_Sub4_Sub1_8 = new Class3_Sub1_Sub4_Sub1(local221, "chatback", 0);
			this.aClass3_Sub1_Sub4_Sub1_7 = new Class3_Sub1_Sub4_Sub1(local221, "mapback", 0);
			this.aClass3_Sub1_Sub4_Sub1_9 = new Class3_Sub1_Sub4_Sub1(local221, "backbase1", 0);
			this.aClass3_Sub1_Sub4_Sub1_10 = new Class3_Sub1_Sub4_Sub1(local221, "backbase2", 0);
			this.aClass3_Sub1_Sub4_Sub1_11 = new Class3_Sub1_Sub4_Sub1(local221, "backhmid1", 0);
			for (local729 = 0; local729 < 13; local729++) {
				this.aClass3_Sub1_Sub4_Sub1Array5[local729] = new Class3_Sub1_Sub4_Sub1(local221, "sideicons", local729);
			}
			this.aClass3_Sub1_Sub4_Sub4_17 = new Class3_Sub1_Sub4_Sub4(local221, "compass", 0);
			this.aClass3_Sub1_Sub4_Sub4_3 = new Class3_Sub1_Sub4_Sub4(local221, "mapedge", 0);
			this.aClass3_Sub1_Sub4_Sub4_3.method446();
			for (@Pc(931) int local931 = 0; local931 < 72; local931++) {
				this.aClass3_Sub1_Sub4_Sub1Array2[local931] = new Class3_Sub1_Sub4_Sub1(local221, "mapscene", local931);
			}
			for (@Pc(949) int local949 = 0; local949 < 63; local949++) {
				this.aClass3_Sub1_Sub4_Sub4Array5[local949] = new Class3_Sub1_Sub4_Sub4(local221, "mapfunction", local949);
			}
			for (@Pc(967) int local967 = 0; local967 < 5; local967++) {
				this.aClass3_Sub1_Sub4_Sub4Array4[local967] = new Class3_Sub1_Sub4_Sub4(local221, "hitmarks", local967);
			}
			for (@Pc(985) int local985 = 0; local985 < 6; local985++) {
				this.aClass3_Sub1_Sub4_Sub4Array8[local985] = new Class3_Sub1_Sub4_Sub4(local221, "headicons_pk", local985);
			}
			for (@Pc(1003) int local1003 = 0; local1003 < 9; local1003++) {
				this.aClass3_Sub1_Sub4_Sub4Array6[local1003] = new Class3_Sub1_Sub4_Sub4(local221, "headicons_prayer", local1003);
			}
			for (@Pc(1021) int local1021 = 0; local1021 < 6; local1021++) {
				this.aClass3_Sub1_Sub4_Sub4Array7[local1021] = new Class3_Sub1_Sub4_Sub4(local221, "headicons_hint", local1021);
			}
			this.aClass3_Sub1_Sub4_Sub4_16 = new Class3_Sub1_Sub4_Sub4(local221, "overlay_multiway", 0);
			this.aClass3_Sub1_Sub4_Sub4_4 = new Class3_Sub1_Sub4_Sub4(local221, "mapmarker", 0);
			this.aClass3_Sub1_Sub4_Sub4_5 = new Class3_Sub1_Sub4_Sub4(local221, "mapmarker", 1);
			for (@Pc(1063) int local1063 = 0; local1063 < 8; local1063++) {
				this.aClass3_Sub1_Sub4_Sub4Array9[local1063] = new Class3_Sub1_Sub4_Sub4(local221, "cross", local1063);
			}
			this.aClass3_Sub1_Sub4_Sub4_11 = new Class3_Sub1_Sub4_Sub4(local221, "mapdots", 0);
			this.aClass3_Sub1_Sub4_Sub4_12 = new Class3_Sub1_Sub4_Sub4(local221, "mapdots", 1);
			this.aClass3_Sub1_Sub4_Sub4_13 = new Class3_Sub1_Sub4_Sub4(local221, "mapdots", 2);
			this.aClass3_Sub1_Sub4_Sub4_14 = new Class3_Sub1_Sub4_Sub4(local221, "mapdots", 3);
			this.aClass3_Sub1_Sub4_Sub4_15 = new Class3_Sub1_Sub4_Sub4(local221, "mapdots", 4);
			this.aClass3_Sub1_Sub4_Sub1_19 = new Class3_Sub1_Sub4_Sub1(local221, "scrollbar", 0);
			this.aClass3_Sub1_Sub4_Sub1_20 = new Class3_Sub1_Sub4_Sub1(local221, "scrollbar", 1);
			this.aClass3_Sub1_Sub4_Sub1_1 = new Class3_Sub1_Sub4_Sub1(local221, "redstone1", 0);
			this.aClass3_Sub1_Sub4_Sub1_2 = new Class3_Sub1_Sub4_Sub1(local221, "redstone2", 0);
			this.aClass3_Sub1_Sub4_Sub1_3 = new Class3_Sub1_Sub4_Sub1(local221, "redstone3", 0);
			this.aClass3_Sub1_Sub4_Sub1_4 = new Class3_Sub1_Sub4_Sub1(local221, "redstone1", 0);
			this.aClass3_Sub1_Sub4_Sub1_4.method278();
			this.aClass3_Sub1_Sub4_Sub1_5 = new Class3_Sub1_Sub4_Sub1(local221, "redstone2", 0);
			this.aClass3_Sub1_Sub4_Sub1_5.method278();
			this.aClass3_Sub1_Sub4_Sub1_12 = new Class3_Sub1_Sub4_Sub1(local221, "redstone1", 0);
			this.aClass3_Sub1_Sub4_Sub1_12.method279();
			this.aClass3_Sub1_Sub4_Sub1_13 = new Class3_Sub1_Sub4_Sub1(local221, "redstone2", 0);
			this.aClass3_Sub1_Sub4_Sub1_13.method279();
			this.aClass3_Sub1_Sub4_Sub1_14 = new Class3_Sub1_Sub4_Sub1(local221, "redstone3", 0);
			this.aClass3_Sub1_Sub4_Sub1_14.method279();
			this.aClass3_Sub1_Sub4_Sub1_15 = new Class3_Sub1_Sub4_Sub1(local221, "redstone1", 0);
			this.aClass3_Sub1_Sub4_Sub1_15.method278();
			this.aClass3_Sub1_Sub4_Sub1_15.method279();
			this.aClass3_Sub1_Sub4_Sub1_16 = new Class3_Sub1_Sub4_Sub1(local221, "redstone2", 0);
			this.aClass3_Sub1_Sub4_Sub1_16.method278();
			this.aClass3_Sub1_Sub4_Sub1_16.method279();
			for (@Pc(1253) int local1253 = 0; local1253 < 2; local1253++) {
				this.aClass3_Sub1_Sub4_Sub1Array4[local1253] = new Class3_Sub1_Sub4_Sub1(local221, "mod_icons", local1253);
			}
			@Pc(1276) Class3_Sub1_Sub4_Sub4 local1276 = new Class3_Sub1_Sub4_Sub4(local221, "backleft1", 0);
			this.aClass42_7 = new Class42(local1276.anInt643, local1276.anInt644, 462, this.method586());
			local1276.method447(0, 0);
			@Pc(1301) Class3_Sub1_Sub4_Sub4 local1301 = new Class3_Sub1_Sub4_Sub4(local221, "backleft2", 0);
			this.aClass42_8 = new Class42(local1301.anInt643, local1301.anInt644, 462, this.method586());
			local1301.method447(0, 0);
			@Pc(1326) Class3_Sub1_Sub4_Sub4 local1326 = new Class3_Sub1_Sub4_Sub4(local221, "backright1", 0);
			this.aClass42_9 = new Class42(local1326.anInt643, local1326.anInt644, 462, this.method586());
			local1326.method447(0, 0);
			@Pc(1351) Class3_Sub1_Sub4_Sub4 local1351 = new Class3_Sub1_Sub4_Sub4(local221, "backright2", 0);
			this.aClass42_10 = new Class42(local1351.anInt643, local1351.anInt644, 462, this.method586());
			local1351.method447(0, 0);
			@Pc(1376) Class3_Sub1_Sub4_Sub4 local1376 = new Class3_Sub1_Sub4_Sub4(local221, "backtop1", 0);
			this.aClass42_11 = new Class42(local1376.anInt643, local1376.anInt644, 462, this.method586());
			local1376.method447(0, 0);
			@Pc(1401) Class3_Sub1_Sub4_Sub4 local1401 = new Class3_Sub1_Sub4_Sub4(local221, "backvmid1", 0);
			this.aClass42_12 = new Class42(local1401.anInt643, local1401.anInt644, 462, this.method586());
			local1401.method447(0, 0);
			@Pc(1426) Class3_Sub1_Sub4_Sub4 local1426 = new Class3_Sub1_Sub4_Sub4(local221, "backvmid2", 0);
			this.aClass42_13 = new Class42(local1426.anInt643, local1426.anInt644, 462, this.method586());
			local1426.method447(0, 0);
			@Pc(1451) Class3_Sub1_Sub4_Sub4 local1451 = new Class3_Sub1_Sub4_Sub4(local221, "backvmid3", 0);
			this.aClass42_14 = new Class42(local1451.anInt643, local1451.anInt644, 462, this.method586());
			local1451.method447(0, 0);
			@Pc(1476) Class3_Sub1_Sub4_Sub4 local1476 = new Class3_Sub1_Sub4_Sub4(local221, "backhmid2", 0);
			this.aClass42_15 = new Class42(local1476.anInt643, local1476.anInt644, 462, this.method586());
			local1476.method447(0, 0);
			@Pc(1501) int local1501 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1524) int local1524 = 0; local1524 < 100; local1524++) {
				if (this.aClass3_Sub1_Sub4_Sub4Array5[local1524] != null) {
					this.aClass3_Sub1_Sub4_Sub4Array5[local1524].method445(local1515 + local1522, 106, local1508 + local1522, local1501 + local1522);
				}
				if (this.aClass3_Sub1_Sub4_Sub1Array2[local1524] != null) {
					this.aClass3_Sub1_Sub4_Sub1Array2[local1524].method280(local1515 + local1522, local1508 + local1522, local1501 + local1522);
				}
			}
			this.method588(83, "Unpacking textures");
			Class3_Sub1_Sub4_Sub2.method367(local233);
			Class3_Sub1_Sub4_Sub2.method371(0.8D);
			Class3_Sub1_Sub4_Sub2.method366();
			this.method588(86, "Unpacking config");
			Class38.method524(local197);
			Class19.method174(local197);
			Class33.method457(local197);
			Class25.method346(local197);
			Class40.method536(local197);
			Class20.method242(local197);
			Class44.method550(local197, (byte) 3);
			Class17.method167(local197);
			Class41.method539(local197, (byte) 3);
			Class25.aBoolean138 = aBoolean236;
			if (!aBoolean237) {
				this.method588(90, "Unpacking sounds");
				@Pc(1627) byte[] local1627 = local257.method140("sounds.dat", null);
				@Pc(1633) Class3_Sub1_Sub2 local1633 = new Class3_Sub1_Sub2(true, local1627);
				Class2.method1(local1633, (byte) 3);
			}
			this.method588(95, "Unpacking interfaces");
			@Pc(1664) Class3_Sub1_Sub4_Sub3[] local1664 = new Class3_Sub1_Sub4_Sub3[] { this.aClass3_Sub1_Sub4_Sub3_2, this.aClass3_Sub1_Sub4_Sub3_3, this.aClass3_Sub1_Sub4_Sub3_4, this.aClass3_Sub1_Sub4_Sub3_5 };
			Class15.method146(local221, local1664, local209);
			this.method588(100, "Preparing game engine");
			@Pc(1680) int local1680;
			@Pc(1682) int local1682;
			@Pc(1684) int local1684;
			for (@Pc(1676) int local1676 = 0; local1676 < 33; local1676++) {
				local1680 = 999;
				local1682 = 0;
				for (local1684 = 0; local1684 < 34; local1684++) {
					if (this.aClass3_Sub1_Sub4_Sub1_7.aByteArray16[local1684 + local1676 * this.aClass3_Sub1_Sub4_Sub1_7.anInt468] == 0) {
						if (local1680 == 999) {
							local1680 = local1684;
						}
					} else if (local1680 != 999) {
						local1682 = local1684;
						break;
					}
				}
				this.anIntArray227[local1676] = local1680;
				this.anIntArray263[local1676] = local1682 - local1680;
			}
			@Pc(1742) int local1742;
			for (local1680 = 5; local1680 < 156; local1680++) {
				local1682 = 999;
				local1684 = 0;
				for (local1742 = 25; local1742 < 172; local1742++) {
					if (this.aClass3_Sub1_Sub4_Sub1_7.aByteArray16[local1742 + local1680 * this.aClass3_Sub1_Sub4_Sub1_7.anInt468] == 0 && (local1742 > 34 || local1680 > 34)) {
						if (local1682 == 999) {
							local1682 = local1742;
						}
					} else if (local1682 != 999) {
						local1684 = local1742;
						break;
					}
				}
				this.anIntArray246[local1680 - 5] = local1682 - 25;
				this.anIntArray234[local1680 - 5] = local1684 - local1682;
			}
			Class3_Sub1_Sub4_Sub2.method364(503, 765);
			this.anIntArray276 = Class3_Sub1_Sub4_Sub2.anIntArray149;
			Class3_Sub1_Sub4_Sub2.method364(96, 479);
			this.anIntArray273 = Class3_Sub1_Sub4_Sub2.anIntArray149;
			Class3_Sub1_Sub4_Sub2.method364(261, 190);
			this.anIntArray274 = Class3_Sub1_Sub4_Sub2.anIntArray149;
			Class3_Sub1_Sub4_Sub2.method364(334, 512);
			this.anIntArray275 = Class3_Sub1_Sub4_Sub2.anIntArray149;
			@Pc(1833) int[] local1833 = new int[9];
			for (local1684 = 0; local1684 < 9; local1684++) {
				local1742 = local1684 * 32 + 128 + 15;
				@Pc(1851) int local1851 = local1742 * 3 + 600;
				@Pc(1855) int local1855 = Class3_Sub1_Sub4_Sub2.anIntArray147[local1742];
				local1833[local1684] = local1851 * local1855 >> 16;
			}
			Class34.method498(local1833);
			Class24.method297(local245);
			this.aClass46_1 = new Class46(anInt982, this);
			this.method587(this.aClass46_1, 10);
			Class3_Sub1_Sub1_Sub3.aClient1 = this;
			Class19.aClient3 = this;
			Class40.aClient4 = this;
		} catch (@Pc(1896) Exception local1896) {
			signlink.reporterror("loaderror " + this.aString20 + " " + this.anInt1059);
			this.aBoolean232 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method726() {
		try {
			signlink.aBoolean260 = false;
			signlink.anInt1080 = 0;
			signlink.midi = "stop";
			if (this.anInt1024 != 1) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("90052, " + 1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!MLYYHULT;)V")
	private void method727(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			while (true) {
				if (arg1.anInt430 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method211(14);
					if (local12 != 16383) {
						if (this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local12] == null) {
							this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local12] = new Class3_Sub1_Sub1_Sub2_Sub2();
						}
						@Pc(32) Class3_Sub1_Sub1_Sub2_Sub2 local32 = this.aClass3_Sub1_Sub1_Sub2_Sub2Array1[local12];
						this.anIntArray229[this.anInt901++] = local12;
						local32.anInt343 = anInt1000;
						@Pc(51) int local51 = arg1.method211(1);
						local32.aClass40_2 = Class40.method537(arg1.method211(13));
						@Pc(63) int local63 = arg1.method211(1);
						if (local63 == 1) {
							this.anIntArray245[this.anInt970++] = local12;
						}
						@Pc(82) int local82 = arg1.method211(5);
						if (local82 > 15) {
							local82 -= 32;
						}
						@Pc(91) int local91 = arg1.method211(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						local32.anInt323 = local32.aClass40_2.aByte37;
						local32.anInt320 = local32.aClass40_2.anInt739;
						local32.anInt337 = local32.aClass40_2.anInt729;
						local32.anInt338 = local32.aClass40_2.anInt737;
						local32.anInt339 = local32.aClass40_2.anInt733;
						local32.anInt340 = local32.aClass40_2.anInt741;
						local32.anInt327 = local32.aClass40_2.anInt740;
						local32.method159(aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray115[0] + local91, aClass3_Sub1_Sub1_Sub2_Sub1_1.anIntArray116[0] + local82, local51 == 1);
						continue;
					}
				}
				arg1.method212();
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("98568, " + true + ", " + arg0 + ", " + arg1 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}
}
