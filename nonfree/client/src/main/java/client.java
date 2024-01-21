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

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private static int anInt865;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private static int anInt867;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private static int anInt896;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private static int anInt908;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Lclient!SRMWIYVM;")
	public static Class3_Sub3_Sub2_Sub1_Sub2 aClass3_Sub3_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private static int anInt917;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private static int anInt918;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	public static int anInt933;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
	private static boolean aBoolean226;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private static int anInt934;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private static int anInt948;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private static boolean aBoolean230;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private static boolean aBoolean231;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private static int anInt997;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private static int anInt1016;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private static int anInt1023;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private static int anInt1025;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private static int anInt1030;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	public static int anInt1032;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private static int anInt1048;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private static int anInt1050;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "B")
	private static byte aByte44;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "[I")
	public static int[] anIntArray218 = new int[32];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Ljava/lang/String;")
	private static String aString19;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "B")
	private static byte aByte34;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private static int[] anIntArray235;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[[I")
	public static final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private static int anInt932;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private static boolean aBoolean225;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
	public static final int[] anIntArray248;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private static int anInt995;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2[] aClass3_Sub3_Sub3_Sub2Array2;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!KMJQVYHB;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_3;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_4;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_5;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_6;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_7;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Lclient!QVSTBDDY;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_7;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_5;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!YCYYIGLM;")
	private Class3_Sub3_Sub3_Sub4 aClass3_Sub3_Sub3_Sub4_2;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!YCYYIGLM;")
	private Class3_Sub3_Sub3_Sub4 aClass3_Sub3_Sub3_Sub4_3;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!YCYYIGLM;")
	private Class3_Sub3_Sub3_Sub4 aClass3_Sub3_Sub3_Sub4_4;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!YCYYIGLM;")
	private Class3_Sub3_Sub3_Sub4 aClass3_Sub3_Sub3_Sub4_5;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_9;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_9;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_10;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_8;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_9;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_10;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_11;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_12;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_13;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_14;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_11;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_12;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_13;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_14;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_15;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_11;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_15;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_16;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_17;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_18;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_19;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_20;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_21;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_22;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_23;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_24;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_25;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_26;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!HGHKUVEK;")
	private Class17 aClass17_27;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Lclient!LKPVZAQN;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_12;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_13;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_14;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_15;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_16;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!QPWZYOZR;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_16;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_18;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Lclient!XAGUDWSZ;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_19;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2 aClass3_Sub3_Sub3_Sub2_20;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "Lclient!IBVXWOKK;")
	private Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_17;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt847 = -1;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt854 = -1;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!WBEWPIXO;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_6 = Class3_Sub3_Sub4.method456();

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt856 = -18411;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private final int anInt864 = 100;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	private int[] anIntArray212 = new int[100];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray213 = new int[Class42.anInt753];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	private int[] anIntArray214 = new int[151];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt870 = 7759444;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "B")
	private byte aByte32 = 55;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray215 = new int[200];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
	private boolean aBoolean202 = true;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray216 = new int[100];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private final int[] anIntArray217 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Z")
	private volatile boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt885 = 3;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt887 = -1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray219 = new int[500];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[I")
	private int[] anIntArray220 = new int[500];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
	private int[] anIntArray221 = new int[500];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	private int[] anIntArray222 = new int[500];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt888 = 1;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "B")
	private byte aByte33 = -40;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt890 = 2301979;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt893 = 2;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[500];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt895 = 3353893;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt897 = -1;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt898 = -817;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt899 = -1;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt901 = -1;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2[] aClass3_Sub3_Sub3_Sub2Array3 = new Class3_Sub3_Sub3_Sub2[13];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt903 = -1;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1[] aClass3_Sub3_Sub3_Sub1Array4 = new Class3_Sub3_Sub3_Sub1[8];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "B")
	private byte aByte35 = 7;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
	private int[] anIntArray223 = new int[9];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private int[] anIntArray224 = new int[7];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "B")
	private byte aByte36 = 5;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[Lclient!BBOYCGQQ;")
	private Class4[] aClass4Array1 = new Class4[4];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray225 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "B")
	private byte aByte37 = 8;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray228 = new int[33];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray229 = new int[1000];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray230 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1[] aClass3_Sub3_Sub3_Sub1Array5 = new Class3_Sub3_Sub3_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!NYZQPNXB;")
	private Class26 aClass26_10 = new Class26(2);

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt921 = 616;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1[] aClass3_Sub3_Sub3_Sub1Array6 = new Class3_Sub3_Sub3_Sub1[100];

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt929 = 3982;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!WBEWPIXO;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_7 = new Class3_Sub3_Sub4((byte) -115, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[Lclient!PVFNGMTQ;")
	private Class3_Sub3_Sub2_Sub1_Sub1[] aClass3_Sub3_Sub2_Sub1_Sub1Array1 = new Class3_Sub3_Sub2_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray239 = new int[16384];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[[[Lclient!NYZQPNXB;")
	private Class26[][][] aClass26ArrayArrayArray1 = new Class26[4][104][104];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray240 = new int[50];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!MRUJPFPS;")
	private Class23 aClass23_1 = new Class23();

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1[] aClass3_Sub3_Sub3_Sub1Array7 = new Class3_Sub3_Sub3_Sub1[32];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray243 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt935 = -3338;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt938 = -1;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1[] aClass3_Sub3_Sub3_Sub1Array8 = new Class3_Sub3_Sub3_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt940 = 1;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "B")
	private byte aByte38 = -43;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt941 = 5;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt956 = -1;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt967 = 2048;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt968 = 2047;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[Lclient!SRMWIYVM;")
	private Class3_Sub3_Sub2_Sub1_Sub2[] aClass3_Sub3_Sub2_Sub1_Sub2Array1 = new Class3_Sub3_Sub2_Sub1_Sub2[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray244 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[I")
	private int[] anIntArray245 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[Lclient!WBEWPIXO;")
	private Class3_Sub3_Sub4[] aClass3_Sub3_Sub4Array1 = new Class3_Sub3_Sub4[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt971 = -1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!NYZQPNXB;")
	private Class26 aClass26_11 = new Class26(2);

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt975 = -1;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray246 = new int[50];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt979 = 3;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt980 = 3;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt981 = 8;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt986 = 5063219;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[I")
	private int[] anIntArray247 = new int[1000];

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "B")
	private byte aByte39 = 2;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "B")
	private byte aByte40 = 0;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
	private int[] anIntArray249 = new int[151];

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt996 = -1;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
	private int[] anIntArray250 = new int[33];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray251 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1[] aClass3_Sub3_Sub3_Sub1Array9 = new Class3_Sub3_Sub3_Sub1[32];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1010 = 78;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
	private int[] anIntArray252 = new int[Class42.anInt753];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray253 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1017 = -1;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1019 = 128;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "B")
	private byte aByte41 = 19;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "B")
	private byte aByte42 = 7;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Lclient!WBEWPIXO;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_8 = Class3_Sub3_Sub4.method456();

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1027 = 1;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
	private volatile boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Lclient!NYZQPNXB;")
	private Class26 aClass26_12 = new Class26(2);

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2[] aClass3_Sub3_Sub3_Sub2Array4 = new Class3_Sub3_Sub3_Sub2[100];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[Lclient!OSRLSEOB;")
	private Class3_Sub3_Sub3_Sub2[] aClass3_Sub3_Sub3_Sub2Array5 = new Class3_Sub3_Sub3_Sub2[2];

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1036 = 50;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray254 = new int[this.anInt1036];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray255 = new int[this.anInt1036];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	private int[] anIntArray256 = new int[this.anInt1036];

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray257 = new int[this.anInt1036];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray258 = new int[this.anInt1036];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	private int[] anIntArray259 = new int[this.anInt1036];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray260 = new int[this.anInt1036];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[this.anInt1036];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
	private int[] anIntArray261 = new int[5];

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1042 = 8;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "B")
	private byte aByte43 = -82;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
	private int[] anIntArray262 = new int[5];

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1052 = -1;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1053 = -1;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1055 = 7;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[I")
	private int[] anIntArray267 = new int[5];

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "[Lclient!OGPNACTP;")
	private Class3_Sub3_Sub3_Sub1[] aClass3_Sub3_Sub3_Sub1Array10 = new Class3_Sub3_Sub3_Sub1[20];

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1058 = 1000;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1061 = -1;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
	private int[] anIntArray268 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1062 = 48;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1064 = 2;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1066 = -25;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1067 = 9784;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
	private int[] anIntArray269 = new int[256];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[Lclient!JXARNXDE;")
	public Class20[] aClass20Array1 = new Class20[5];

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "Z")
	private volatile boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
	private int[] anIntArray270 = new int[Class42.anInt753];

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[I")
	private int[] anIntArray271 = new int[50];

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
	public int[] anIntArray272 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
	private int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "Lclient!WBEWPIXO;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_9 = Class3_Sub3_Sub4.method456();

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "B")
	private byte aByte45 = 9;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "[I")
	private int[] anIntArray274 = new int[4000];

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "[I")
	private int[] anIntArray275 = new int[4000];

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1073 = 2;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "[I")
	private int[] anIntArray276 = new int[100];

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	static {
		@Pc(9) int local9 = 2;
		@Pc(11) int local11;
		for (local11 = 0; local11 < 32; local11++) {
			anIntArray218[local11] = local9 - 1;
			local9 += local9;
		}
		aString19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aByte34 = 8;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray235 = new int[99];
		local9 = 0;
		for (local11 = 0; local11 < 99; local11++) {
			@Pc(47) int local47 = local11 + 1;
			@Pc(60) int local60 = (int) ((double) local47 + Math.pow(2.0D, (double) local47 / 7.0D) * 300.0D);
			local9 += local60;
			anIntArray235[local11] = local9 / 4;
		}
		anIntArrayArray24 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt932 = 10;
		aBoolean225 = true;
		anIntArray248 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt995 = 615;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private static void method605() {
		try {
			Class31.aBoolean140 = true;
			Class3_Sub3_Sub3_Sub3.aBoolean122 = true;
			aBoolean226 = true;
			Class15.aBoolean62 = true;
			Class13.aBoolean60 = true;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("30838, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
	private static String method608(@OriginalArg(1) int arg0) {
		try {
			if (aByte44 != 0) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("45864, " + 0 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private static void method613() {
		try {
			Class31.aBoolean140 = false;
			Class3_Sub3_Sub3_Sub3.aBoolean122 = false;
			aBoolean226 = false;
			Class15.aBoolean62 = false;
			Class13.aBoolean60 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("39403, " + -8266 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) String local8 = String.valueOf(arg0);
			for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
				local8 = local8.substring(0, local13) + "," + local8.substring(local13);
			}
			if (local8.length() > 8) {
				local8 = "@gre@" + local8.substring(0, local8.length() - 8) + " million @whi@(" + local8 + ")";
			} else if (local8.length() > 4) {
				local8 = "@cya@" + local8.substring(0, local8.length() - 4) + "K @whi@(" + local8 + ")";
			}
			return " " + local8;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("70168, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 369);
			if (arg0.length == 5) {
				anInt932 = Integer.parseInt(arg0[0]);
				anInt933 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method605();
				} else if (arg0[2].equals("highmem")) {
					method613();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean225 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean225 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1076 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method575(805);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13 = arg0 - arg1;
			if (local13 < -9) {
				return "@red@";
			} else if (local13 < -6) {
				return "@or3@";
			} else if (local13 < -3) {
				return "@or2@";
			} else if (local13 < 0) {
				return "@or1@";
			} else if (local13 > 9) {
				return "@gre@";
			} else if (local13 > 6) {
				return "@gr3@";
			} else if (local13 > 3) {
				return "@gr2@";
			} else if (local13 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("28398, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method580() {
		this.method587(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt830 = 5;
		}
		if (aBoolean228) {
			this.aBoolean233 = true;
			return;
		}
		aBoolean228 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method652();
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
			this.aBoolean239 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass20Array1[local107] = new Class20(500000, 0, signlink.aRandomAccessFileArray1[local107], local107 + 1, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method708();
			this.aClass22_2 = this.method616(this.anIntArray223[1], 1, "title screen", 25, "title");
			this.aClass3_Sub3_Sub3_Sub4_2 = new Class3_Sub3_Sub3_Sub4(false, this.aClass22_2, "p11_full", (byte) 9);
			this.aClass3_Sub3_Sub3_Sub4_3 = new Class3_Sub3_Sub3_Sub4(false, this.aClass22_2, "p12_full", (byte) 9);
			this.aClass3_Sub3_Sub3_Sub4_4 = new Class3_Sub3_Sub3_Sub4(false, this.aClass22_2, "b12_full", (byte) 9);
			this.aClass3_Sub3_Sub3_Sub4_5 = new Class3_Sub3_Sub3_Sub4(true, this.aClass22_2, "q8_full", (byte) 9);
			this.method660();
			this.method693();
			@Pc(203) Class22 local203 = this.method616(this.anIntArray223[2], 2, "config", 30, "config");
			@Pc(215) Class22 local215 = this.method616(this.anIntArray223[3], 3, "interface", 35, "interface");
			@Pc(227) Class22 local227 = this.method616(this.anIntArray223[4], 4, "2d graphics", 40, "media");
			@Pc(239) Class22 local239 = this.method616(this.anIntArray223[6], 6, "textures", 45, "textures");
			@Pc(251) Class22 local251 = this.method616(this.anIntArray223[7], 7, "chat system", 50, "wordenc");
			@Pc(263) Class22 local263 = this.method616(this.anIntArray223[8], 8, "sound effects", 55, "sounds");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass31_1 = new Class31(104, 4, this.anIntArrayArrayArray8, 104, -30);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass4Array1[local288] = new Class4(104, 104, aByte34);
			}
			this.aClass3_Sub3_Sub3_Sub1_10 = new Class3_Sub3_Sub3_Sub1(512, 512);
			@Pc(323) Class22 local323 = this.method616(this.anIntArray223[5], 5, "update list", 60, "versionlist");
			this.method587(60, "Connecting to update server");
			this.aClass6_Sub1_1 = new Class6_Sub1();
			this.aClass6_Sub1_1.method177(local323, this);
			Class12.method112(this.aClass6_Sub1_1.method163(anInt995));
			Class3_Sub3_Sub2_Sub3.method77(this.aClass6_Sub1_1.method175(0), this.aClass6_Sub1_1);
			if (!aBoolean226) {
				this.anInt873 = 0;
				this.aBoolean202 = true;
				this.aClass6_Sub1_1.method174(2, this.anInt873);
				while (this.aClass6_Sub1_1.method173() > 0) {
					this.method595();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass6_Sub1_1.anInt296 > 3) {
						this.method721("ondemand");
						return;
					}
				}
			}
			this.method587(65, "Requesting animations");
			@Pc(398) int local398 = this.aClass6_Sub1_1.method175(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass6_Sub1_1.method174(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass6_Sub1_1.method173() > 0) {
				local419 = local398 - this.aClass6_Sub1_1.method173();
				if (local419 > 0) {
					this.method587(65, "Loading animations - " + local419 * 100 / local398 + "%");
				}
				this.method595();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass6_Sub1_1.anInt296 > 3) {
					this.method721("ondemand");
					return;
				}
			}
			this.method587(70, "Requesting models");
			local398 = this.aClass6_Sub1_1.method175(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass6_Sub1_1.method169(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass6_Sub1_1.method174(0, local419);
				}
			}
			local398 = this.aClass6_Sub1_1.method173();
			while (this.aClass6_Sub1_1.method173() > 0) {
				local479 = local398 - this.aClass6_Sub1_1.method173();
				if (local479 > 0) {
					this.method587(70, "Loading models - " + local479 * 100 / local398 + "%");
				}
				this.method595();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass20Array1[0] != null) {
				this.method587(75, "Requesting maps");
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(47, 48, 0));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(47, 48, 1));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(48, 48, 0));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(48, 48, 1));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(49, 48, 0));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(49, 48, 1));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(47, 47, 0));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(47, 47, 1));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(48, 47, 0));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(48, 47, 1));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(48, 148, 0));
				this.aClass6_Sub1_1.method174(3, this.aClass6_Sub1_1.method159(48, 148, 1));
				local398 = this.aClass6_Sub1_1.method173();
				while (this.aClass6_Sub1_1.method173() > 0) {
					local479 = local398 - this.aClass6_Sub1_1.method173();
					if (local479 > 0) {
						this.method587(75, "Loading maps - " + local479 * 100 / local398 + "%");
					}
					this.method595();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass6_Sub1_1.method175(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass6_Sub1_1.method169(local479);
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
					this.aClass6_Sub1_1.method166(0, local479, local738);
				}
			}
			this.aClass6_Sub1_1.method160(aBoolean225);
			if (!aBoolean226) {
				local398 = this.aClass6_Sub1_1.method175(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass6_Sub1_1.method178(local736)) {
						this.aClass6_Sub1_1.method166(2, local736, (byte) 1);
					}
				}
			}
			this.method587(80, "Unpacking media");
			this.aClass3_Sub3_Sub3_Sub2_8 = new Class3_Sub3_Sub3_Sub2(local227, "invback", 0);
			this.aClass3_Sub3_Sub3_Sub2_10 = new Class3_Sub3_Sub3_Sub2(local227, "chatback", 0);
			this.aClass3_Sub3_Sub3_Sub2_9 = new Class3_Sub3_Sub3_Sub2(local227, "mapback", 0);
			this.aClass3_Sub3_Sub3_Sub2_16 = new Class3_Sub3_Sub3_Sub2(local227, "backbase1", 0);
			this.aClass3_Sub3_Sub3_Sub2_17 = new Class3_Sub3_Sub3_Sub2(local227, "backbase2", 0);
			this.aClass3_Sub3_Sub3_Sub2_18 = new Class3_Sub3_Sub3_Sub2(local227, "backhmid1", 0);
			for (local736 = 0; local736 < 13; local736++) {
				this.aClass3_Sub3_Sub3_Sub2Array3[local736] = new Class3_Sub3_Sub3_Sub2(local227, "sideicons", local736);
			}
			this.aClass3_Sub3_Sub3_Sub1_11 = new Class3_Sub3_Sub3_Sub1(local227, "compass", 0);
			this.aClass3_Sub3_Sub3_Sub1_17 = new Class3_Sub3_Sub3_Sub1(local227, "mapedge", 0);
			this.aClass3_Sub3_Sub3_Sub1_17.method255();
			for (@Pc(938) int local938 = 0; local938 < 72; local938++) {
				this.aClass3_Sub3_Sub3_Sub2Array4[local938] = new Class3_Sub3_Sub3_Sub2(local227, "mapscene", local938);
			}
			for (@Pc(956) int local956 = 0; local956 < 70; local956++) {
				this.aClass3_Sub3_Sub3_Sub1Array6[local956] = new Class3_Sub3_Sub3_Sub1(local227, "mapfunction", local956);
			}
			for (@Pc(974) int local974 = 0; local974 < 5; local974++) {
				this.aClass3_Sub3_Sub3_Sub1Array10[local974] = new Class3_Sub3_Sub3_Sub1(local227, "hitmarks", local974);
			}
			for (@Pc(992) int local992 = 0; local992 < 6; local992++) {
				this.aClass3_Sub3_Sub3_Sub1Array9[local992] = new Class3_Sub3_Sub3_Sub1(local227, "headicons_pk", local992);
			}
			for (@Pc(1010) int local1010 = 0; local1010 < 9; local1010++) {
				this.aClass3_Sub3_Sub3_Sub1Array8[local1010] = new Class3_Sub3_Sub3_Sub1(local227, "headicons_prayer", local1010);
			}
			for (@Pc(1028) int local1028 = 0; local1028 < 6; local1028++) {
				this.aClass3_Sub3_Sub3_Sub1Array7[local1028] = new Class3_Sub3_Sub3_Sub1(local227, "headicons_hint", local1028);
			}
			this.aClass3_Sub3_Sub3_Sub1_5 = new Class3_Sub3_Sub3_Sub1(local227, "overlay_multiway", 0);
			this.aClass3_Sub3_Sub3_Sub1_8 = new Class3_Sub3_Sub3_Sub1(local227, "mapmarker", 0);
			this.aClass3_Sub3_Sub3_Sub1_9 = new Class3_Sub3_Sub3_Sub1(local227, "mapmarker", 1);
			for (@Pc(1070) int local1070 = 0; local1070 < 8; local1070++) {
				this.aClass3_Sub3_Sub3_Sub1Array4[local1070] = new Class3_Sub3_Sub3_Sub1(local227, "cross", local1070);
			}
			this.aClass3_Sub3_Sub3_Sub1_12 = new Class3_Sub3_Sub3_Sub1(local227, "mapdots", 0);
			this.aClass3_Sub3_Sub3_Sub1_13 = new Class3_Sub3_Sub3_Sub1(local227, "mapdots", 1);
			this.aClass3_Sub3_Sub3_Sub1_14 = new Class3_Sub3_Sub3_Sub1(local227, "mapdots", 2);
			this.aClass3_Sub3_Sub3_Sub1_15 = new Class3_Sub3_Sub3_Sub1(local227, "mapdots", 3);
			this.aClass3_Sub3_Sub3_Sub1_16 = new Class3_Sub3_Sub3_Sub1(local227, "mapdots", 4);
			this.aClass3_Sub3_Sub3_Sub2_1 = new Class3_Sub3_Sub3_Sub2(local227, "scrollbar", 0);
			this.aClass3_Sub3_Sub3_Sub2_2 = new Class3_Sub3_Sub3_Sub2(local227, "scrollbar", 1);
			this.aClass3_Sub3_Sub3_Sub2_11 = new Class3_Sub3_Sub3_Sub2(local227, "redstone1", 0);
			this.aClass3_Sub3_Sub3_Sub2_12 = new Class3_Sub3_Sub3_Sub2(local227, "redstone2", 0);
			this.aClass3_Sub3_Sub3_Sub2_13 = new Class3_Sub3_Sub3_Sub2(local227, "redstone3", 0);
			this.aClass3_Sub3_Sub3_Sub2_14 = new Class3_Sub3_Sub3_Sub2(local227, "redstone1", 0);
			this.aClass3_Sub3_Sub3_Sub2_14.method282();
			this.aClass3_Sub3_Sub3_Sub2_15 = new Class3_Sub3_Sub3_Sub2(local227, "redstone2", 0);
			this.aClass3_Sub3_Sub3_Sub2_15.method282();
			this.aClass3_Sub3_Sub3_Sub2_3 = new Class3_Sub3_Sub3_Sub2(local227, "redstone1", 0);
			this.aClass3_Sub3_Sub3_Sub2_3.method283();
			this.aClass3_Sub3_Sub3_Sub2_4 = new Class3_Sub3_Sub3_Sub2(local227, "redstone2", 0);
			this.aClass3_Sub3_Sub3_Sub2_4.method283();
			this.aClass3_Sub3_Sub3_Sub2_5 = new Class3_Sub3_Sub3_Sub2(local227, "redstone3", 0);
			this.aClass3_Sub3_Sub3_Sub2_5.method283();
			this.aClass3_Sub3_Sub3_Sub2_6 = new Class3_Sub3_Sub3_Sub2(local227, "redstone1", 0);
			this.aClass3_Sub3_Sub3_Sub2_6.method282();
			this.aClass3_Sub3_Sub3_Sub2_6.method283();
			this.aClass3_Sub3_Sub3_Sub2_7 = new Class3_Sub3_Sub3_Sub2(local227, "redstone2", 0);
			this.aClass3_Sub3_Sub3_Sub2_7.method282();
			this.aClass3_Sub3_Sub3_Sub2_7.method283();
			for (@Pc(1260) int local1260 = 0; local1260 < 2; local1260++) {
				this.aClass3_Sub3_Sub3_Sub2Array5[local1260] = new Class3_Sub3_Sub3_Sub2(local227, "mod_icons", local1260);
			}
			@Pc(1283) Class3_Sub3_Sub3_Sub1 local1283 = new Class3_Sub3_Sub3_Sub1(local227, "backleft1", 0);
			this.aClass17_6 = new Class17((byte) 9, this.method585(), local1283.anInt437, local1283.anInt438);
			local1283.method256(0, 0);
			@Pc(1308) Class3_Sub3_Sub3_Sub1 local1308 = new Class3_Sub3_Sub3_Sub1(local227, "backleft2", 0);
			this.aClass17_7 = new Class17((byte) 9, this.method585(), local1308.anInt437, local1308.anInt438);
			local1308.method256(0, 0);
			@Pc(1333) Class3_Sub3_Sub3_Sub1 local1333 = new Class3_Sub3_Sub3_Sub1(local227, "backright1", 0);
			this.aClass17_8 = new Class17((byte) 9, this.method585(), local1333.anInt437, local1333.anInt438);
			local1333.method256(0, 0);
			@Pc(1358) Class3_Sub3_Sub3_Sub1 local1358 = new Class3_Sub3_Sub3_Sub1(local227, "backright2", 0);
			this.aClass17_9 = new Class17((byte) 9, this.method585(), local1358.anInt437, local1358.anInt438);
			local1358.method256(0, 0);
			@Pc(1383) Class3_Sub3_Sub3_Sub1 local1383 = new Class3_Sub3_Sub3_Sub1(local227, "backtop1", 0);
			this.aClass17_10 = new Class17((byte) 9, this.method585(), local1383.anInt437, local1383.anInt438);
			local1383.method256(0, 0);
			@Pc(1408) Class3_Sub3_Sub3_Sub1 local1408 = new Class3_Sub3_Sub3_Sub1(local227, "backvmid1", 0);
			this.aClass17_11 = new Class17((byte) 9, this.method585(), local1408.anInt437, local1408.anInt438);
			local1408.method256(0, 0);
			@Pc(1433) Class3_Sub3_Sub3_Sub1 local1433 = new Class3_Sub3_Sub3_Sub1(local227, "backvmid2", 0);
			this.aClass17_12 = new Class17((byte) 9, this.method585(), local1433.anInt437, local1433.anInt438);
			local1433.method256(0, 0);
			@Pc(1458) Class3_Sub3_Sub3_Sub1 local1458 = new Class3_Sub3_Sub3_Sub1(local227, "backvmid3", 0);
			this.aClass17_13 = new Class17((byte) 9, this.method585(), local1458.anInt437, local1458.anInt438);
			local1458.method256(0, 0);
			@Pc(1483) Class3_Sub3_Sub3_Sub1 local1483 = new Class3_Sub3_Sub3_Sub1(local227, "backhmid2", 0);
			this.aClass17_14 = new Class17((byte) 9, this.method585(), local1483.anInt437, local1483.anInt438);
			local1483.method256(0, 0);
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1529) int local1529 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1531) int local1531 = 0; local1531 < 100; local1531++) {
				if (this.aClass3_Sub3_Sub3_Sub1Array6[local1531] != null) {
					this.aClass3_Sub3_Sub3_Sub1Array6[local1531].method254(local1508 + local1529, local1522 + local1529, (byte) 4, local1515 + local1529);
				}
				if (this.aClass3_Sub3_Sub3_Sub2Array4[local1531] != null) {
					this.aClass3_Sub3_Sub3_Sub2Array4[local1531].method284(local1508 + local1529, local1522 + local1529, (byte) 4, local1515 + local1529);
				}
			}
			this.method587(83, "Unpacking textures");
			Class3_Sub3_Sub3_Sub3.method306(local239);
			Class3_Sub3_Sub3_Sub3.method310(0.8D);
			Class3_Sub3_Sub3_Sub3.method305();
			this.method587(86, "Unpacking config");
			Class46.method519(local203, 713);
			Class13.method117(local203);
			Class32.method388(local203);
			Class1.method8(local203);
			Class30.method323(local203);
			Class11.method106(local203, 713);
			Class43.method514(local203, 713);
			Class44.method517(local203, 713);
			Class36.method446(local203, 713);
			Class1.aBoolean5 = aBoolean225;
			if (!aBoolean226) {
				this.method587(90, "Unpacking sounds");
				@Pc(1634) byte[] local1634 = local263.method207("sounds.dat", null);
				@Pc(1640) Class3_Sub3_Sub4 local1640 = new Class3_Sub3_Sub4((byte) -115, local1634);
				Class38.method448(local1640);
			}
			this.method587(95, "Unpacking interfaces");
			@Pc(1671) Class3_Sub3_Sub3_Sub4[] local1671 = new Class3_Sub3_Sub3_Sub4[] { this.aClass3_Sub3_Sub3_Sub4_2, this.aClass3_Sub3_Sub3_Sub4_3, this.aClass3_Sub3_Sub3_Sub4_4, this.aClass3_Sub3_Sub3_Sub4_5 };
			Class23.method212(local215, local227, local1671);
			this.method587(100, "Preparing game engine");
			@Pc(1687) int local1687;
			@Pc(1689) int local1689;
			@Pc(1691) int local1691;
			for (@Pc(1683) int local1683 = 0; local1683 < 33; local1683++) {
				local1687 = 999;
				local1689 = 0;
				for (local1691 = 0; local1691 < 34; local1691++) {
					if (this.aClass3_Sub3_Sub3_Sub2_9.aByteArray17[local1691 + local1683 * this.aClass3_Sub3_Sub3_Sub2_9.anInt458] == 0) {
						if (local1687 == 999) {
							local1687 = local1691;
						}
					} else if (local1687 != 999) {
						local1689 = local1691;
						break;
					}
				}
				this.anIntArray228[local1683] = local1687;
				this.anIntArray250[local1683] = local1689 - local1687;
			}
			@Pc(1749) int local1749;
			for (local1687 = 5; local1687 < 156; local1687++) {
				local1689 = 999;
				local1691 = 0;
				for (local1749 = 25; local1749 < 172; local1749++) {
					if (this.aClass3_Sub3_Sub3_Sub2_9.aByteArray17[local1749 + local1687 * this.aClass3_Sub3_Sub3_Sub2_9.anInt458] == 0 && (local1749 > 34 || local1687 > 34)) {
						if (local1689 == 999) {
							local1689 = local1749;
						}
					} else if (local1689 != 999) {
						local1691 = local1749;
						break;
					}
				}
				this.anIntArray214[local1687 - 5] = local1689 - 25;
				this.anIntArray249[local1687 - 5] = local1691 - local1689;
			}
			Class3_Sub3_Sub3_Sub3.method303(765, 503);
			this.anIntArray234 = Class3_Sub3_Sub3_Sub3.anIntArray145;
			Class3_Sub3_Sub3_Sub3.method303(479, 96);
			this.anIntArray231 = Class3_Sub3_Sub3_Sub3.anIntArray145;
			Class3_Sub3_Sub3_Sub3.method303(190, 261);
			this.anIntArray232 = Class3_Sub3_Sub3_Sub3.anIntArray145;
			Class3_Sub3_Sub3_Sub3.method303(512, 334);
			this.anIntArray233 = Class3_Sub3_Sub3_Sub3.anIntArray145;
			@Pc(1840) int[] local1840 = new int[9];
			for (local1691 = 0; local1691 < 9; local1691++) {
				local1749 = local1691 * 32 + 128 + 15;
				@Pc(1858) int local1858 = local1749 * 3 + 600;
				@Pc(1862) int local1862 = Class3_Sub3_Sub3_Sub3.anIntArray143[local1749];
				local1840[local1691] = local1858 * local1862 >> 16;
			}
			Class31.method373(local1840);
			Class35.method408(local251);
			this.aClass33_1 = new Class33(true, this);
			this.method586(this.aClass33_1, 10);
			Class3_Sub3_Sub2_Sub6.aClient5 = this;
			Class13.aClient1 = this;
			Class30.aClient3 = this;
		} catch (@Pc(1903) Exception local1903) {
			signlink.reporterror("loaderror " + this.aString17 + " " + this.anInt972);
			this.aBoolean219 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIII)V")
	private void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg3 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg1;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class3_Sub3_Sub2_Sub3.anIntArray51[local5];
				local27 = Class3_Sub3_Sub2_Sub3.anIntArray52[local5];
				local37 = local27 * 0 - arg1 * local23 >> 16;
				local17 = local23 * 0 + arg1 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class3_Sub3_Sub2_Sub3.anIntArray51[local11];
				local27 = Class3_Sub3_Sub2_Sub3.anIntArray52[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt1043 = arg5 - local13;
			this.anInt1044 = arg2 - local15;
			this.anInt1045 = arg0 - local17;
			this.anInt1046 = arg3;
			this.anInt1047 = arg4;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("36829, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method586(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method586(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!WBEWPIXO;)V")
	private void method589(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1) {
		try {
			while (true) {
				if (arg1.anInt739 + 21 < arg0 * 8) {
					@Pc(24) int local24 = arg1.method479(14);
					if (local24 != 16383) {
						if (this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24] == null) {
							this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24] = new Class3_Sub3_Sub2_Sub1_Sub1();
						}
						@Pc(44) Class3_Sub3_Sub2_Sub1_Sub1 local44 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
						this.anIntArray239[this.anInt930++] = local24;
						local44.anInt662 = anInt1032;
						@Pc(63) int local63 = arg1.method479(1);
						@Pc(68) int local68 = arg1.method479(1);
						if (local68 == 1) {
							this.anIntArray245[this.anInt970++] = local24;
						}
						@Pc(87) int local87 = arg1.method479(5);
						if (local87 > 15) {
							local87 -= 32;
						}
						@Pc(96) int local96 = arg1.method479(5);
						if (local96 > 15) {
							local96 -= 32;
						}
						local44.aClass30_1 = Class30.method322(arg1.method479(13));
						local44.anInt654 = local44.aClass30_1.aByte21;
						local44.anInt677 = local44.aClass30_1.anInt507;
						local44.anInt647 = local44.aClass30_1.anInt511;
						local44.anInt648 = local44.aClass30_1.anInt496;
						local44.anInt649 = local44.aClass30_1.anInt501;
						local44.anInt650 = local44.aClass30_1.anInt503;
						local44.anInt689 = local44.aClass30_1.anInt510;
						local44.method401(local63 == 1, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0] + local96, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0] + local87);
						continue;
					}
				}
				arg1.method480();
				return;
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("15508, " + 103 + ", " + arg0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SRMWIYVM;ZIII)V")
	private void method590(@OriginalArg(0) Class3_Sub3_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass3_Sub3_Sub2_Sub1_Sub2_1 && this.anInt1071 < 400) {
				@Pc(40) String local40;
				if (arg0.anInt696 == 0) {
					local40 = arg0.aString14 + method699(aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt701, arg0.anInt701) + " (level-" + arg0.anInt701 + ")";
				} else {
					local40 = arg0.aString14 + " (skill-" + arg0.anInt696 + ")";
				}
				@Pc(170) int local170;
				if (this.anInt910 == 1) {
					this.aStringArray9[this.anInt1071] = "Use " + this.aString20 + " with @whi@" + local40;
					this.anIntArray221[this.anInt1071] = 225;
					this.anIntArray222[this.anInt1071] = arg2;
					this.anIntArray219[this.anInt1071] = arg3;
					this.anIntArray220[this.anInt1071] = arg1;
					this.anInt1071++;
				} else if (this.anInt957 != 1) {
					for (local170 = 4; local170 >= 0; local170--) {
						if (this.aStringArray11[local170] != null) {
							this.aStringArray9[this.anInt1071] = this.aStringArray11[local170] + " @whi@" + local40;
							@Pc(197) short local197 = 0;
							if (this.aStringArray11[local170].equalsIgnoreCase("attack")) {
								if (arg0.anInt701 > aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt701) {
									local197 = 2000;
								}
								if (aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt709 != 0 && arg0.anInt709 != 0) {
									if (aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt709 == arg0.anInt709) {
										local197 = 2000;
									} else {
										local197 = 0;
									}
								}
							} else if (this.aBooleanArray11[local170]) {
								local197 = 2000;
							}
							if (local170 == 0) {
								this.anIntArray221[this.anInt1071] = local197 + 33;
							}
							if (local170 == 1) {
								this.anIntArray221[this.anInt1071] = local197 + 805;
							}
							if (local170 == 2) {
								this.anIntArray221[this.anInt1071] = local197 + 650;
							}
							if (local170 == 3) {
								this.anIntArray221[this.anInt1071] = local197 + 66;
							}
							if (local170 == 4) {
								this.anIntArray221[this.anInt1071] = local197 + 328;
							}
							this.anIntArray222[this.anInt1071] = arg2;
							this.anIntArray219[this.anInt1071] = arg3;
							this.anIntArray220[this.anInt1071] = arg1;
							this.anInt1071++;
						}
					}
				} else if ((this.anInt959 & 0x8) == 8) {
					this.aStringArray9[this.anInt1071] = this.aString23 + " @whi@" + local40;
					this.anIntArray221[this.anInt1071] = 771;
					this.anIntArray222[this.anInt1071] = arg2;
					this.anIntArray219[this.anInt1071] = arg3;
					this.anIntArray220[this.anInt1071] = arg1;
					this.anInt1071++;
				}
				for (local170 = 0; local170 < this.anInt1071; local170++) {
					if (this.anIntArray221[local170] == 238) {
						this.aStringArray9[local170] = "Walk here @whi@" + local40;
						return;
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("74869, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method591(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1033; local8++) {
					if (this.aLongArray3[local8] == arg1) {
						this.anInt1033--;
						this.aBoolean216 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1033; local28++) {
							this.aStringArray10[local28] = this.aStringArray10[local28 + 1];
							this.anIntArray215[local28] = this.anIntArray215[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass3_Sub3_Sub4_6.method457(161);
						this.aClass3_Sub3_Sub4_6.method464(arg1);
						break;
					}
				}
				@Pc(86) boolean local86 = false;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("87073, " + arg0 + ", " + arg1 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WBEWPIXO;II)V")
	private void method592(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			while (true) {
				if (arg0.anInt739 + 10 < arg2 * 8) {
					@Pc(12) int local12 = arg0.method479(11);
					if (local12 != 2047) {
						if (this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local12] == null) {
							this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local12] = new Class3_Sub3_Sub2_Sub1_Sub2();
							if (this.aClass3_Sub3_Sub4Array1[local12] != null) {
								this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local12].method405(this.anInt981, this.aClass3_Sub3_Sub4Array1[local12]);
							}
						}
						this.anIntArray244[this.anInt969++] = local12;
						@Pc(59) Class3_Sub3_Sub2_Sub1_Sub2 local59 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local12];
						local59.anInt662 = anInt1032;
						@Pc(67) int local67 = arg0.method479(5);
						if (local67 > 15) {
							local67 -= 32;
						}
						@Pc(76) int local76 = arg0.method479(5);
						if (local76 > 15) {
							local76 -= 32;
						}
						@Pc(85) int local85 = arg0.method479(1);
						@Pc(90) int local90 = arg0.method479(1);
						if (local90 == 1) {
							this.anIntArray245[this.anInt970++] = local12;
						}
						local59.method401(local85 == 1, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0] + local76, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0] + local67);
						continue;
					}
				}
				arg0.method480();
				@Pc(134) boolean local134 = false;
				return;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("41313, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method593() {
		try {
			this.aClass17_16.method154();
			@Pc(21) int local21;
			@Pc(23) int local23;
			if (this.anInt949 == 2) {
				@Pc(16) byte[] local16 = this.aClass3_Sub3_Sub3_Sub2_9.aByteArray17;
				@Pc(18) int[] local18 = Class3_Sub3_Sub3.anIntArray204;
				local21 = local16.length;
				for (local23 = 0; local23 < local21; local23++) {
					if (local16[local23] == 0) {
						local18[local23] = 0;
					}
				}
				this.aClass3_Sub3_Sub3_Sub1_11.method262(256, 0, this.anInt1020, 33, 25, this.anIntArray228, this.anIntArray250, 25, 33, 0);
				this.aClass17_17.method154();
				Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
			} else {
				@Pc(70) int local70 = this.anInt1020 + this.anInt892 & 0x7FF;
				@Pc(77) int local77 = aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32 + 48;
				local21 = 464 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
				this.aClass3_Sub3_Sub3_Sub1_10.method262(this.anInt1026 + 256, 25, local70, 146, local21, this.anIntArray214, this.anIntArray249, local77, 151, 5);
				this.aClass3_Sub3_Sub3_Sub1_11.method262(256, 0, this.anInt1020, 33, 25, this.anIntArray228, this.anIntArray250, 25, 33, 0);
				for (local23 = 0; local23 < this.anInt914; local23++) {
					local77 = this.anIntArray229[local23] * 4 + 2 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32;
					local21 = this.anIntArray230[local23] * 4 + 2 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
					this.method596(local21, this.aClass3_Sub3_Sub3_Sub1Array5[local23], local77);
				}
				@Pc(172) int local172;
				for (@Pc(168) int local168 = 0; local168 < 104; local168++) {
					for (local172 = 0; local172 < 104; local172++) {
						@Pc(184) Class26 local184 = this.aClass26ArrayArrayArray1[this.anInt1056][local168][local172];
						if (local184 != null) {
							local77 = local168 * 4 + 2 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32;
							local21 = local172 * 4 + 2 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
							this.method596(local21, this.aClass3_Sub3_Sub3_Sub1_12, local77);
						}
					}
				}
				for (local172 = 0; local172 < this.anInt930; local172++) {
					@Pc(235) Class3_Sub3_Sub2_Sub1_Sub1 local235 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[this.anIntArray239[local172]];
					if (local235 != null && local235.method400()) {
						@Pc(244) Class30 local244 = local235.aClass30_1;
						if (local244.anIntArray151 != null) {
							local244 = local244.method321();
						}
						if (local244 != null && local244.aBoolean130 && local244.aBoolean126) {
							local77 = local235.anInt685 / 32 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32;
							local21 = local235.anInt686 / 32 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
							this.method596(local21, this.aClass3_Sub3_Sub3_Sub1_13, local77);
						}
					}
				}
				@Pc(303) Class3_Sub3_Sub2_Sub1_Sub2 local303;
				for (@Pc(293) int local293 = 0; local293 < this.anInt969; local293++) {
					local303 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anIntArray244[local293]];
					if (local303 != null && local303.method400()) {
						local77 = local303.anInt685 / 32 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32;
						local21 = local303.anInt686 / 32 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
						@Pc(331) boolean local331 = false;
						@Pc(335) long local335 = Class48.method535(local303.aString14);
						for (@Pc(337) int local337 = 0; local337 < this.anInt1033; local337++) {
							if (local335 == this.aLongArray3[local337] && this.anIntArray215[local337] != 0) {
								local331 = true;
								break;
							}
						}
						@Pc(362) boolean local362 = false;
						if (aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt709 != 0 && local303.anInt709 != 0 && aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt709 == local303.anInt709) {
							local362 = true;
						}
						if (local331) {
							this.method596(local21, this.aClass3_Sub3_Sub3_Sub1_15, local77);
						} else if (local362) {
							this.method596(local21, this.aClass3_Sub3_Sub3_Sub1_16, local77);
						} else {
							this.method596(local21, this.aClass3_Sub3_Sub3_Sub1_14, local77);
						}
					}
				}
				if (this.anInt960 != 0 && anInt1032 % 20 < 10) {
					if (this.anInt960 == 1 && this.anInt961 >= 0 && this.anInt961 < this.aClass3_Sub3_Sub2_Sub1_Sub1Array1.length) {
						@Pc(436) Class3_Sub3_Sub2_Sub1_Sub1 local436 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[this.anInt961];
						if (local436 != null) {
							local77 = local436.anInt685 / 32 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32;
							local21 = local436.anInt686 / 32 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
							this.method620(local77, this.aClass3_Sub3_Sub3_Sub1_9, local21, 473);
						}
					}
					if (this.anInt960 == 2) {
						local77 = (this.anInt875 - this.anInt1003) * 4 + 2 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32;
						local21 = (this.anInt876 - this.anInt1004) * 4 + 2 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
						this.method620(local77, this.aClass3_Sub3_Sub3_Sub1_9, local21, 473);
					}
					if (this.anInt960 == 10 && this.anInt919 >= 0 && this.anInt919 < this.aClass3_Sub3_Sub2_Sub1_Sub2Array1.length) {
						local303 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anInt919];
						if (local303 != null) {
							local77 = local303.anInt685 / 32 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32;
							local21 = local303.anInt686 / 32 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
							this.method620(local77, this.aClass3_Sub3_Sub3_Sub1_9, local21, 473);
						}
					}
				}
				if (this.anInt988 != 0) {
					local77 = this.anInt988 * 4 + 2 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 / 32;
					local21 = this.anInt989 * 4 + 2 - aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 / 32;
					this.method596(local21, this.aClass3_Sub3_Sub3_Sub1_8, local77);
				}
				Class3_Sub3_Sub3.method552(16777215, this.aByte40, 97, 78, 3, 3);
				this.aClass17_17.method154();
				Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
			}
		} catch (@Pc(605) RuntimeException local605) {
			signlink.reporterror("28598, " + false + ", " + local605.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method594(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt1080 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("16895, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method595() {
		try {
			while (true) {
				@Pc(14) Class3_Sub3_Sub1 local14 = this.aClass6_Sub1_1.method165();
				if (local14 == null) {
					return;
				}
				if (local14.anInt101 == 0) {
					Class3_Sub3_Sub2_Sub3.method78(this.anInt935, local14.anInt100, local14.aByteArray2);
					if ((this.aClass6_Sub1_1.method169(local14.anInt100) & 0x62) != 0) {
						this.aBoolean216 = true;
						if (this.anInt903 != -1 || this.anInt996 != -1) {
							this.aBoolean237 = true;
						}
					}
				}
				if (local14.anInt101 == 1 && local14.aByteArray2 != null) {
					Class12.method113(local14.aByteArray2);
				}
				if (local14.anInt101 == 2 && local14.anInt100 == this.anInt873 && local14.aByteArray2 != null) {
					this.method629(this.aBoolean202, local14.aByteArray2);
				}
				if (local14.anInt101 == 3 && this.anInt1054 == 1) {
					for (@Pc(90) int local90 = 0; local90 < this.aByteArrayArray5.length; local90++) {
						if (this.anIntArray237[local90] == local14.anInt100) {
							this.aByteArrayArray5[local90] = local14.aByteArray2;
							if (local14.aByteArray2 == null) {
								this.anIntArray237[local90] = -1;
							}
							break;
						}
						if (this.anIntArray238[local90] == local14.anInt100) {
							this.aByteArrayArray6[local90] = local14.aByteArray2;
							if (local14.aByteArray2 == null) {
								this.anIntArray238[local90] = -1;
							}
							break;
						}
					}
				}
				if (local14.anInt101 == 93 && this.aClass6_Sub1_1.method158(local14.anInt100)) {
					Class15.method128(new Class3_Sub3_Sub4((byte) -115, local14.aByteArray2), this.aClass6_Sub1_1, this.anInt1067);
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("96369, " + 678 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!OGPNACTP;I)V")
	private void method596(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 != null) {
				@Pc(10) int local10 = this.anInt1020 + this.anInt892 & 0x7FF;
				@Pc(18) int local18 = arg2 * arg2 + arg0 * arg0;
				if (local18 <= 6400) {
					@Pc(32) int local32 = Class3_Sub3_Sub2_Sub3.anIntArray51[local10];
					@Pc(36) int local36 = Class3_Sub3_Sub2_Sub3.anIntArray52[local10];
					@Pc(45) int local45 = local32 * 256 / (this.anInt1026 + 256);
					@Pc(54) int local54 = local36 * 256 / (this.anInt1026 + 256);
					@Pc(64) int local64 = arg0 * local45 + arg2 * local54 >> 16;
					@Pc(74) int local74 = arg0 * local54 - arg2 * local45 >> 16;
					if (local18 > 2500) {
						arg1.method264(local64 + 94 + 4 - arg1.anInt441 / 2, 83 - local74 - arg1.anInt442 / 2 - 4, this.aClass3_Sub3_Sub3_Sub2_9);
					} else {
						arg1.method258(local64 + 94 + 4 - arg1.anInt441 / 2, 83 - local74 - arg1.anInt442 / 2 - 4);
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("66733, " + arg0 + ", " + -561 + ", " + arg1 + ", " + arg2 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!PJGEBWSY;)V")
	private void method597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3) {
		try {
			if (this.anInt1071 < 400) {
				if (arg3.anIntArray151 != null) {
					arg3 = arg3.method321();
				}
				if (arg3 != null && arg3.aBoolean126) {
					@Pc(23) String local23 = arg3.aString10;
					if (arg3.anInt502 != 0) {
						local23 = local23 + method699(aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt701, arg3.anInt502) + " (level-" + arg3.anInt502 + ")";
					}
					if (this.anInt910 == 1) {
						this.aStringArray9[this.anInt1071] = "Use " + this.aString20 + " with @yel@" + local23;
						this.anIntArray221[this.anInt1071] = 60;
						this.anIntArray222[this.anInt1071] = arg2;
						this.anIntArray219[this.anInt1071] = arg1;
						this.anIntArray220[this.anInt1071] = arg0;
						this.anInt1071++;
					} else if (this.anInt957 != 1) {
						@Pc(167) int local167;
						if (arg3.aStringArray5 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg3.aStringArray5[local167] != null && !arg3.aStringArray5[local167].equalsIgnoreCase("attack")) {
									this.aStringArray9[this.anInt1071] = arg3.aStringArray5[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray221[this.anInt1071] = 531;
									}
									if (local167 == 1) {
										this.anIntArray221[this.anInt1071] = 810;
									}
									if (local167 == 2) {
										this.anIntArray221[this.anInt1071] = 641;
									}
									if (local167 == 3) {
										this.anIntArray221[this.anInt1071] = 69;
									}
									if (local167 == 4) {
										this.anIntArray221[this.anInt1071] = 157;
									}
									this.anIntArray222[this.anInt1071] = arg2;
									this.anIntArray219[this.anInt1071] = arg1;
									this.anIntArray220[this.anInt1071] = arg0;
									this.anInt1071++;
								}
							}
						}
						if (arg3.aStringArray5 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg3.aStringArray5[local167] != null && arg3.aStringArray5[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg3.anInt502 > aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt701) {
										local291 = 2000;
									}
									this.aStringArray9[this.anInt1071] = arg3.aStringArray5[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray221[this.anInt1071] = local291 + 531;
									}
									if (local167 == 1) {
										this.anIntArray221[this.anInt1071] = local291 + 810;
									}
									if (local167 == 2) {
										this.anIntArray221[this.anInt1071] = local291 + 641;
									}
									if (local167 == 3) {
										this.anIntArray221[this.anInt1071] = local291 + 69;
									}
									if (local167 == 4) {
										this.anIntArray221[this.anInt1071] = local291 + 157;
									}
									this.anIntArray222[this.anInt1071] = arg2;
									this.anIntArray219[this.anInt1071] = arg1;
									this.anIntArray220[this.anInt1071] = arg0;
									this.anInt1071++;
								}
							}
						}
						this.aStringArray9[this.anInt1071] = "Examine @yel@" + local23;
						this.anIntArray221[this.anInt1071] = 1261;
						this.anIntArray222[this.anInt1071] = arg2;
						this.anIntArray219[this.anInt1071] = arg1;
						this.anIntArray220[this.anInt1071] = arg0;
						this.anInt1071++;
					} else if ((this.anInt959 & 0x2) == 2) {
						this.aStringArray9[this.anInt1071] = this.aString23 + " @yel@" + local23;
						this.anIntArray221[this.anInt1071] = 154;
						this.anIntArray222[this.anInt1071] = arg2;
						this.anIntArray219[this.anInt1071] = arg1;
						this.anIntArray220[this.anInt1071] = arg0;
						this.anInt1071++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("4576, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
	private boolean method598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class23 local12 = Class23.method208(arg1);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray104.length && local12.anIntArray104[local14] != -1; local14++) {
				@Pc(28) Class23 local28 = Class23.method208(local12.anIntArray104[local14]);
				if (local28.anInt355 == 0) {
					local3 |= this.method598(arg0, local28.anInt363);
				}
				@Pc(62) int local62;
				if (local28.anInt355 == 6 && (local28.anInt361 != -1 || local28.anInt362 != -1)) {
					@Pc(57) boolean local57 = this.method702(local28);
					if (local57) {
						local62 = local28.anInt362;
					} else {
						local62 = local28.anInt361;
					}
					if (local62 != -1) {
						@Pc(74) Class46 local74 = Class46.aClass46Array1[local62];
						local28.anInt337 += arg0;
						while (local28.anInt337 > local74.method520(local28.anInt372)) {
							local28.anInt337 -= local74.method520(local28.anInt372) + 1;
							local28.anInt372++;
							if (local28.anInt372 >= local74.anInt780) {
								local28.anInt372 -= local74.anInt781;
								if (local28.anInt372 < 0 || local28.anInt372 >= local74.anInt780) {
									local28.anInt372 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local28.anInt355 == 6 && local28.anInt357 != 0) {
					@Pc(145) int local145 = local28.anInt357 >> 16;
					local62 = local28.anInt357 << 16 >> 16;
					@Pc(156) int local156 = local145 * arg0;
					local62 *= arg0;
					local28.anInt341 = local28.anInt341 + local156 & 0x7FF;
					local28.anInt342 = local28.anInt342 + local62 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("34833, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MRUJPFPS;Z)V")
	private void method599(@OriginalArg(0) Class23 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt334;
			@Pc(65) int local65;
			if ((local9 < 1 || local9 > 100) && (local9 < 701 || local9 > 800)) {
				if (local9 >= 101 && local9 <= 200 || !(local9 < 801 || local9 > 900)) {
					local65 = this.anInt1033;
					if (this.anInt1034 != 2) {
						local65 = 0;
					}
					if (local9 > 800) {
						local9 -= 701;
					} else {
						local9 -= 101;
					}
					if (local9 >= local65) {
						arg0.aString5 = "";
						arg0.anInt369 = 0;
					} else {
						if (this.anIntArray215[local9] == 0) {
							arg0.aString5 = "@red@Offline";
						} else if (this.anIntArray215[local9] < 200) {
							if (this.anIntArray215[local9] == anInt932) {
								arg0.aString5 = "@gre@World" + (this.anIntArray215[local9] - 9);
							} else {
								arg0.aString5 = "@yel@World" + (this.anIntArray215[local9] - 9);
							}
						} else if (this.anIntArray215[local9] == anInt932) {
							arg0.aString5 = "@gre@Classic" + (this.anIntArray215[local9] - 219);
						} else {
							arg0.aString5 = "@yel@Classic" + (this.anIntArray215[local9] - 219);
						}
						arg0.anInt369 = 1;
					}
				} else if (local9 == 203) {
					local65 = this.anInt1033;
					if (this.anInt1034 != 2) {
						local65 = 0;
					}
					arg0.anInt370 = local65 * 15 + 20;
					if (arg0.anInt370 <= arg0.anInt348) {
						arg0.anInt370 = arg0.anInt348 + 1;
					}
				} else if (local9 >= 401 && local9 <= 500) {
					local9 -= 401;
					if (local9 == 0 && this.anInt1034 == 0) {
						arg0.aString5 = "Loading ignore list";
						arg0.anInt369 = 0;
					} else if (local9 == 1 && this.anInt1034 == 0) {
						arg0.aString5 = "Please wait...";
						arg0.anInt369 = 0;
					} else {
						local65 = this.anInt894;
						if (this.anInt1034 == 0) {
							local65 = 0;
						}
						if (local9 >= local65) {
							arg0.aString5 = "";
							arg0.anInt369 = 0;
						} else {
							arg0.aString5 = Class48.method539(Class48.method536(this.aBoolean224, this.aLongArray4[local9]));
							arg0.anInt369 = 1;
						}
					}
				} else if (local9 == 503) {
					arg0.anInt370 = this.anInt894 * 15 + 20;
					if (arg0.anInt370 <= arg0.anInt348) {
						arg0.anInt370 = arg0.anInt348 + 1;
					}
				} else if (local9 == 327) {
					arg0.anInt341 = 150;
					arg0.anInt342 = (int) (Math.sin((double) anInt1032 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean218) {
						for (local65 = 0; local65 < 7; local65++) {
							@Pc(379) int local379 = this.anIntArray224[local65];
							if (local379 >= 0 && !Class11.aClass11Array1[local379].method108(this.anInt929)) {
								return;
							}
						}
						this.aBoolean218 = false;
						@Pc(399) Class3_Sub3_Sub2_Sub3[] local399 = new Class3_Sub3_Sub2_Sub3[7];
						@Pc(401) int local401 = 0;
						for (@Pc(403) int local403 = 0; local403 < 7; local403++) {
							@Pc(410) int local410 = this.anIntArray224[local403];
							if (local410 >= 0) {
								local399[local401++] = Class11.aClass11Array1[local410].method109();
							}
						}
						@Pc(432) Class3_Sub3_Sub2_Sub3 local432 = new Class3_Sub3_Sub2_Sub3(local401, -23, local399);
						for (@Pc(434) int local434 = 0; local434 < 5; local434++) {
							if (this.anIntArray243[local434] != 0) {
								local432.method94(anIntArrayArray24[local434][0], anIntArrayArray24[local434][this.anIntArray243[local434]]);
								if (local434 == 1) {
									local432.method94(anIntArray248[0], anIntArray248[this.anIntArray243[local434]]);
								}
							}
						}
						local432.method87();
						local432.method88(Class46.aClass46Array1[aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt689].anIntArray198[0]);
						local432.method97(64, 850, -30, -50, -30, true);
						arg0.anInt345 = 5;
						arg0.anInt346 = 0;
						Class23.method213(local432);
					}
				} else if (local9 == 324) {
					if (this.aClass3_Sub3_Sub3_Sub1_6 == null) {
						this.aClass3_Sub3_Sub3_Sub1_6 = arg0.aClass3_Sub3_Sub3_Sub1_1;
						this.aClass3_Sub3_Sub3_Sub1_7 = arg0.aClass3_Sub3_Sub3_Sub1_2;
					}
					if (this.aBoolean240) {
						arg0.aClass3_Sub3_Sub3_Sub1_1 = this.aClass3_Sub3_Sub3_Sub1_7;
					} else {
						arg0.aClass3_Sub3_Sub3_Sub1_1 = this.aClass3_Sub3_Sub3_Sub1_6;
					}
				} else if (local9 == 325) {
					if (this.aClass3_Sub3_Sub3_Sub1_6 == null) {
						this.aClass3_Sub3_Sub3_Sub1_6 = arg0.aClass3_Sub3_Sub3_Sub1_1;
						this.aClass3_Sub3_Sub3_Sub1_7 = arg0.aClass3_Sub3_Sub3_Sub1_2;
					}
					if (this.aBoolean240) {
						arg0.aClass3_Sub3_Sub3_Sub1_1 = this.aClass3_Sub3_Sub3_Sub1_6;
					} else {
						arg0.aClass3_Sub3_Sub3_Sub1_1 = this.aClass3_Sub3_Sub3_Sub1_7;
					}
				} else if (local9 == 600) {
					arg0.aString5 = this.aString30;
					if (anInt1032 % 20 < 10) {
						arg0.aString5 = arg0.aString5 + "|";
					} else {
						arg0.aString5 = arg0.aString5 + " ";
					}
				} else {
					if (local9 == 620) {
						if (this.anInt990 < 1) {
							arg0.aString5 = "";
						} else if (this.aBoolean235) {
							arg0.anInt354 = 16711680;
							arg0.aString5 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt354 = 16777215;
							arg0.aString5 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(639) String local639;
					if (local9 == 660) {
						local65 = this.anInt904 - this.anInt907;
						if (local65 <= 0) {
							local639 = "earlier today";
						} else if (local65 == 1) {
							local639 = "yesterday";
						} else {
							local639 = local65 + " days ago";
						}
						arg0.aString5 = "You last logged in @red@" + local639 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local9 == 661) {
						if (this.anInt942 == 0) {
							arg0.aString5 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt942 <= this.anInt904) {
							arg0.aString5 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method600(this.aByte38, this.anInt942);
						} else {
							local65 = this.anInt904 + 14 - this.anInt942;
							if (local65 <= 0) {
								local639 = "Earlier today";
							} else if (local65 == 1) {
								local639 = "Yesterday";
							} else {
								local639 = local65 + " days ago";
							}
							arg0.aString5 = local639 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method600(this.aByte38, this.anInt942) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local9 == 662) {
						@Pc(759) String local759;
						if (this.anInt982 == 0) {
							local759 = "@yel@0 unread messages";
						} else if (this.anInt982 == 1) {
							local759 = "@gre@1 unread message";
						} else {
							local759 = "@gre@" + this.anInt982 + " unread messages";
						}
						arg0.aString5 = "You have " + local759 + "\\nin your message centre.";
					}
					if (local9 == 663) {
						if (this.anInt993 > 0 && this.anInt993 <= this.anInt904 + 10) {
							arg0.aString5 = "Last password change:\\n@gre@" + this.method600(this.aByte38, this.anInt993);
						} else {
							arg0.aString5 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local9 == 665) {
						if (this.anInt973 > 2 && !aBoolean225) {
							arg0.aString5 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt973 > 2) {
							arg0.aString5 = "\\n\\nYou have @gre@" + this.anInt973 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt973 > 0) {
							arg0.aString5 = "You have @gre@" + this.anInt973 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString5 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local9 == 667) {
						if (this.anInt973 > 2 && !aBoolean225) {
							arg0.aString5 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt973 > 0) {
							arg0.aString5 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString5 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local9 == 668) {
						if (this.anInt942 > this.anInt904) {
							arg0.aString5 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString5 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local9 == 1 && this.anInt1034 == 0) {
				arg0.aString5 = "Loading friend list";
				arg0.anInt369 = 0;
			} else if (local9 == 1 && this.anInt1034 == 1) {
				arg0.aString5 = "Connecting to friendserver";
				arg0.anInt369 = 0;
			} else if (local9 == 2 && this.anInt1034 != 2) {
				arg0.aString5 = "Please wait...";
				arg0.anInt369 = 0;
			} else {
				local65 = this.anInt1033;
				if (this.anInt1034 != 2) {
					local65 = 0;
				}
				if (local9 > 700) {
					local9 -= 601;
				} else {
					local9--;
				}
				if (local9 >= local65) {
					arg0.aString5 = "";
					arg0.anInt369 = 0;
				} else {
					arg0.aString5 = this.aStringArray10[local9];
					arg0.anInt369 = 1;
				}
			}
		} catch (@Pc(917) RuntimeException local917) {
			signlink.reporterror("24091, " + arg0 + ", " + false + ", " + local917.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private String method600(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 > this.anInt904 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg1 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(30) int local30 = local16.get(2);
			@Pc(34) int local34 = local16.get(1);
			if (arg0 != -43) {
				this.aClass3_Sub3_Sub4_6.method458(105);
			}
			@Pc(92) String[] local92 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local92[local30] + "-" + local34;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("23240, " + arg0 + ", " + arg1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!WBEWPIXO;I)V")
	private void method601(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub4 arg1, @OriginalArg(2) int arg2) {
		try {
			arg1.method478(616);
			if (arg0 != 0) {
				this.method580();
			}
			@Pc(11) int local11 = arg1.method479(1);
			if (local11 != 0) {
				@Pc(19) int local19 = arg1.method479(2);
				if (local19 == 0) {
					this.anIntArray245[this.anInt970++] = this.anInt968;
				} else {
					@Pc(42) int local42;
					@Pc(52) int local52;
					if (local19 == 1) {
						local42 = arg1.method479(3);
						aClass3_Sub3_Sub2_Sub1_Sub2_1.method403(false, local42);
						local52 = arg1.method479(1);
						if (local52 == 1) {
							this.anIntArray245[this.anInt970++] = this.anInt968;
						}
					} else {
						@Pc(96) int local96;
						if (local19 == 2) {
							local42 = arg1.method479(3);
							aClass3_Sub3_Sub2_Sub1_Sub2_1.method403(true, local42);
							local52 = arg1.method479(3);
							aClass3_Sub3_Sub2_Sub1_Sub2_1.method403(true, local52);
							local96 = arg1.method479(1);
							if (local96 == 1) {
								this.anIntArray245[this.anInt970++] = this.anInt968;
							}
						} else if (local19 == 3) {
							this.anInt1056 = arg1.method479(2);
							local42 = arg1.method479(1);
							if (local42 == 1) {
								this.anIntArray245[this.anInt970++] = this.anInt968;
							}
							local52 = arg1.method479(7);
							local96 = arg1.method479(1);
							@Pc(156) int local156 = arg1.method479(7);
							aClass3_Sub3_Sub2_Sub1_Sub2_1.method401(local96 == 1, local156, local52);
						}
					}
				}
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("7870, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!SRMWIYVM;IILclient!WBEWPIXO;)V")
	private void method602(@OriginalArg(1) Class3_Sub3_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub3_Sub4 arg3) {
		try {
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(22) int local22;
			if ((arg1 & 0x4) != 0) {
				local14 = arg3.method470();
				local18 = arg3.method486();
				local22 = arg3.method487();
				@Pc(25) int local25 = arg3.anInt738;
				if (arg0.aString14 != null && arg0.aBoolean158) {
					@Pc(35) long local35 = Class48.method535(arg0.aString14);
					@Pc(37) boolean local37 = false;
					if (local18 <= 1) {
						for (@Pc(42) int local42 = 0; local42 < this.anInt894; local42++) {
							if (this.aLongArray4[local42] == local35) {
								local37 = true;
								break;
							}
						}
					}
					if (!local37 && this.anInt1037 == 0) {
						try {
							this.aClass3_Sub3_Sub4_7.anInt738 = 0;
							arg3.method505(local22, this.aClass3_Sub3_Sub4_7.aByteArray20);
							this.aClass3_Sub3_Sub4_7.anInt738 = 0;
							@Pc(87) String local87 = Class19.method179(local22, this.aClass3_Sub3_Sub4_7);
							@Pc(91) String local91 = Class35.method418(local87);
							arg0.aString13 = local91;
							arg0.anInt673 = local14 >> 8;
							arg0.anInt671 = local14 & 0xFF;
							arg0.anInt670 = 150;
							if (local18 == 2 || local18 == 3) {
								this.method716((byte) 2, 1, local91, "@cr2@" + arg0.aString14);
							} else if (local18 == 1) {
								this.method716((byte) 2, 1, local91, "@cr1@" + arg0.aString14);
							} else {
								this.method716((byte) 2, 2, local91, arg0.aString14);
							}
						} catch (@Pc(155) Exception local155) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt738 = local25 + local22;
			}
			if ((arg1 & 0x8) != 0) {
				local14 = arg3.method494();
				if (local14 == 65535) {
					local14 = -1;
				}
				local18 = arg3.method485();
				if (local14 == arg0.anInt678 && local14 != -1) {
					local22 = Class46.aClass46Array1[local14].anInt788;
					if (local22 == 1) {
						arg0.anInt679 = 0;
						arg0.anInt680 = 0;
						arg0.anInt681 = local18;
						arg0.anInt682 = 0;
					}
					if (local22 == 2) {
						arg0.anInt682 = 0;
					}
				} else if (local14 == -1 || arg0.anInt678 == -1 || Class46.aClass46Array1[local14].anInt782 >= Class46.aClass46Array1[arg0.anInt678].anInt782) {
					arg0.anInt678 = local14;
					arg0.anInt679 = 0;
					arg0.anInt680 = 0;
					arg0.anInt681 = local18;
					arg0.anInt682 = 0;
					arg0.anInt672 = arg0.anInt668;
				}
			}
			if ((arg1 & 0x200) != 0) {
				local14 = arg3.method468();
				local18 = arg3.method468();
				arg0.method404(local14, local18, anInt1032);
				arg0.anInt674 = anInt1032 + 300;
				arg0.anInt675 = arg3.method486();
				arg0.anInt676 = arg3.method486();
			}
			if ((arg1 & 0x400) != 0) {
				arg0.anInt663 = arg3.method494();
				local14 = arg3.method473();
				arg0.anInt667 = local14 >> 16;
				arg0.anInt666 = anInt1032 + (local14 & 0xFFFF);
				arg0.anInt664 = 0;
				arg0.anInt665 = 0;
				if (arg0.anInt666 > anInt1032) {
					arg0.anInt664 = -1;
				}
				if (arg0.anInt663 == 65535) {
					arg0.anInt663 = -1;
				}
			}
			if ((arg1 & 0x2) != 0) {
				local14 = arg3.method487();
				local18 = arg3.method468();
				arg0.method404(local14, local18, anInt1032);
				arg0.anInt674 = anInt1032 + 300;
				arg0.anInt675 = arg3.method485();
				arg0.anInt676 = arg3.method468();
			}
			if ((arg1 & 0x100) != 0) {
				arg0.anInt655 = arg3.method487();
				arg0.anInt657 = arg3.method468();
				arg0.anInt656 = arg3.method487();
				arg0.anInt658 = arg3.method468();
				arg0.anInt659 = arg3.method494() + anInt1032;
				arg0.anInt660 = arg3.method495(this.anInt922) + anInt1032;
				arg0.anInt661 = arg3.method487();
				arg0.method402();
			}
			if ((arg1 & 0x40) != 0) {
				local14 = arg3.method486();
				@Pc(413) byte[] local413 = new byte[local14];
				@Pc(419) Class3_Sub3_Sub4 local419 = new Class3_Sub3_Sub4((byte) -115, local413);
				arg3.method505(local14, local413);
				this.aClass3_Sub3_Sub4Array1[arg2] = local419;
				arg0.method405(this.anInt981, local419);
			}
			if ((arg1 & 0x1) != 0) {
				arg0.anInt651 = arg3.method494();
				arg0.anInt652 = arg3.method495(this.anInt922);
			}
			if ((arg1 & 0x10) != 0) {
				arg0.anInt691 = arg3.method495(this.anInt922);
				if (arg0.anInt691 == 65535) {
					arg0.anInt691 = -1;
				}
			}
			if ((arg1 & 0x80) != 0) {
				arg0.aString13 = arg3.method475();
				if (arg0.aString13.charAt(0) == '~') {
					arg0.aString13 = arg0.aString13.substring(1);
					this.method716((byte) 2, 2, arg0.aString13, arg0.aString14);
				} else if (arg0 == aClass3_Sub3_Sub2_Sub1_Sub2_1) {
					this.method716((byte) 2, 2, arg0.aString13, arg0.aString14);
				}
				arg0.anInt673 = 0;
				arg0.anInt671 = 0;
				arg0.anInt670 = 150;
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("21329, " + -10985 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(1) Class3_Sub2 local1 = null;
			for (@Pc(6) Class3_Sub2 local6 = (Class3_Sub2) this.aClass26_10.method224(); local6 != null; local6 = (Class3_Sub2) this.aClass26_10.method226()) {
				if (local6.anInt89 == arg3 && local6.anInt91 == arg5 && local6.anInt92 == arg7 && local6.anInt90 == arg2) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class3_Sub2();
				local1.anInt89 = arg3;
				local1.anInt90 = arg2;
				local1.anInt91 = arg5;
				local1.anInt92 = arg7;
				this.method644(local1);
				this.aClass26_10.method221(local1);
			}
			local1.anInt93 = arg4;
			local1.anInt95 = arg8;
			local1.anInt94 = arg1;
			local1.anInt88 = arg6;
			local1.anInt87 = arg0;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("25939, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -46589 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method604(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt1033; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray10[local7])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass3_Sub3_Sub2_Sub1_Sub2_1.aString14);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("1898, " + arg0 + ", " + -222 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method606() {
		try {
			if (this.anInt947 > 0) {
				this.method711();
			} else {
				this.method712("Please wait - attempting to reestablish", "Connection lost");
				this.anInt949 = 0;
				this.anInt988 = 0;
				@Pc(20) Class21 local20 = this.aClass21_1;
				this.aBoolean241 = false;
				this.anInt855 = 0;
				this.method649(this.aString28, this.aString29, true);
				if (!this.aBoolean241) {
					this.method711();
				}
				try {
					local20.method186();
				} catch (@Pc(54) Exception local54) {
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("14121, " + 13228 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray14[local3] != null) {
					@Pc(15) int local15 = this.anIntArray276[local3];
					@Pc(26) int local26 = this.anInt1069 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray13[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt937 == 0 || this.anInt937 == 1 && this.method604(local34))) {
						if (arg0 > local26 - 14 && arg0 <= local26 && !local34.equals(aClass3_Sub3_Sub2_Sub1_Sub2_1.aString14)) {
							if (this.anInt990 >= 1) {
								this.aStringArray9[this.anInt1071] = "Report abuse @whi@" + local34;
								this.anIntArray221[this.anInt1071] = 674;
								this.anInt1071++;
							}
							this.aStringArray9[this.anInt1071] = "Add ignore @whi@" + local34;
							this.anIntArray221[this.anInt1071] = 478;
							this.anInt1071++;
							this.aStringArray9[this.anInt1071] = "Add friend @whi@" + local34;
							this.anIntArray221[this.anInt1071] = 50;
							this.anInt1071++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt978 == 0 && (local15 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method604(local34))) {
						if (arg0 > local26 - 14 && arg0 <= local26) {
							if (this.anInt990 >= 1) {
								this.aStringArray9[this.anInt1071] = "Report abuse @whi@" + local34;
								this.anIntArray221[this.anInt1071] = 674;
								this.anInt1071++;
							}
							this.aStringArray9[this.anInt1071] = "Add ignore @whi@" + local34;
							this.anIntArray221[this.anInt1071] = 478;
							this.anInt1071++;
							this.aStringArray9[this.anInt1071] = "Add friend @whi@" + local34;
							this.anIntArray221[this.anInt1071] = 50;
							this.anInt1071++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt1024 == 0 || this.anInt1024 == 1 && this.method604(local34))) {
						if (arg0 > local26 - 14 && arg0 <= local26) {
							this.aStringArray9[this.anInt1071] = "Accept trade @whi@" + local34;
							this.anIntArray221[this.anInt1071] = 504;
							this.anInt1071++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt978 == 0 && this.anInt900 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt1024 == 0 || this.anInt1024 == 1 && this.method604(local34))) {
						if (arg0 > local26 - 14 && arg0 <= local26) {
							this.aStringArray9[this.anInt1071] = "Accept challenge @whi@" + local34;
							this.anIntArray221[this.anInt1071] = 56;
							this.anInt1071++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("32720, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method609() {
		try {
			this.aClass3_Sub3_Sub4_6.method457(54);
			if (this.anInt899 != -1) {
				this.method614(this.anInt899);
				this.anInt899 = -1;
				this.aBoolean216 = true;
				this.aBoolean232 = false;
				this.aBoolean214 = true;
			}
			if (this.anInt903 != -1) {
				this.method614(this.anInt903);
				this.anInt903 = -1;
				this.aBoolean237 = true;
				this.aBoolean232 = false;
			}
			if (this.anInt1017 != -1) {
				this.method614(this.anInt1017);
				this.anInt1017 = -1;
				this.aBoolean244 = true;
			}
			if (this.anInt975 != -1) {
				this.method614(this.anInt975);
				this.anInt975 = -1;
			}
			if (this.anInt1061 != -1) {
				this.method614(this.anInt1061);
				this.anInt1061 = -1;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("65164, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method610() {
		try {
			if (this.aByte35 != 7) {
				this.anInt944 = -1;
			}
			for (@Pc(10) int local10 = 0; local10 < this.anInt1059; local10++) {
				if (this.anIntArray271[local10] <= 0) {
					@Pc(19) boolean local19 = false;
					try {
						if (this.anIntArray246[local10] != this.anInt854 || this.anIntArray240[local10] != this.anInt956) {
							@Pc(52) Class3_Sub3_Sub4 local52 = Class38.method449(this.anIntArray240[local10], this.anIntArray246[local10]);
							if (System.currentTimeMillis() + (long) (local52.anInt738 / 22) > this.aLong33 + (long) (this.anInt871 / 22)) {
								this.anInt871 = local52.anInt738;
								this.aLong33 = System.currentTimeMillis();
								if (this.method651(this.anInt1058, local52.aByteArray20, local52.anInt738)) {
									this.anInt854 = this.anIntArray246[local10];
									this.anInt956 = this.anIntArray240[local10];
								} else {
									local19 = true;
								}
							}
						} else if (!this.method692()) {
							local19 = true;
						}
					} catch (@Pc(103) Exception local103) {
						if (signlink.reporterror) {
							this.aClass3_Sub3_Sub4_6.method457(178);
							this.aClass3_Sub3_Sub4_6.method459(this.anIntArray246[local10] & 0x7FFF);
						} else {
							this.aClass3_Sub3_Sub4_6.method457(178);
							this.aClass3_Sub3_Sub4_6.method459(-1);
						}
					}
					if (local19 && this.anIntArray271[local10] != -5) {
						this.anIntArray271[local10] = -5;
					} else {
						this.anInt1059--;
						for (@Pc(146) int local146 = local10; local146 < this.anInt1059; local146++) {
							this.anIntArray246[local146] = this.anIntArray246[local146 + 1];
							this.anIntArray240[local146] = this.anIntArray240[local146 + 1];
							this.anIntArray271[local146] = this.anIntArray271[local146 + 1];
						}
						local10--;
					}
				} else {
					@Pc(198) int local198 = this.anIntArray271[local10]--;
				}
			}
			if (this.anInt966 > 0) {
				this.anInt966 -= 20;
				if (this.anInt966 < 0) {
					this.anInt966 = 0;
				}
				if (this.anInt966 == 0 && this.aBoolean221 && !aBoolean226) {
					this.anInt873 = this.anInt971;
					this.aBoolean202 = true;
					this.aClass6_Sub1_1.method174(2, this.anInt873);
					return;
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("75191, " + 7 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIIII)V")
	private void method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg1 >= 1 && arg6 >= 1 && arg1 <= 102 && arg6 <= 102) {
				if (aBoolean226 && arg2 != this.anInt1056) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg5 == 0) {
					local26 = this.aClass31_1.method363(arg2, arg1, arg6);
				}
				if (arg5 == 1) {
					local26 = this.aClass31_1.method364(arg2, arg6, arg1);
				}
				if (arg5 == 2) {
					local26 = this.aClass31_1.method365(arg2, arg1, arg6);
				}
				if (arg5 == 3) {
					local26 = this.aClass31_1.method366(arg2, arg1, arg6);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass31_1.method367(arg2, arg1, arg6, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class13 local108;
					if (arg5 == 0) {
						this.aClass31_1.method354(arg1, arg2, arg6);
						local108 = Class13.method127(local88);
						if (local108.aBoolean54) {
							this.aClass4Array1[arg2].method34(arg1, local92, arg6, local96, local108.aBoolean53);
						}
					}
					if (arg5 == 1) {
						this.aClass31_1.method355(arg2, arg1, arg6);
					}
					if (arg5 == 2) {
						this.aClass31_1.method356(arg1, arg2, arg6);
						local108 = Class13.method127(local88);
						if (arg1 + local108.anInt237 > 103 || arg6 + local108.anInt237 > 103 || arg1 + local108.anInt233 > 103 || arg6 + local108.anInt233 > 103) {
							return;
						}
						if (local108.aBoolean54) {
							this.aClass4Array1[arg2].method35(local108.aBoolean53, local96, local108.anInt237, arg1, local108.anInt233, arg6);
						}
					}
					if (arg5 == 3) {
						this.aClass31_1.method357(arg2, arg1, arg6, this.anInt898);
						local108 = Class13.method127(local88);
						if (local108.aBoolean54 && local108.aBoolean59) {
							this.aClass4Array1[arg2].method37(this.aByte41, arg6, arg1);
						}
					}
				}
				if (arg3 >= 0) {
					local82 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray8[1][arg1][arg6] & 0x2) == 2) {
						local82 = arg2 + 1;
					}
					Class15.method138(local82, arg4, arg6, arg3, this.aClass4Array1[arg2], arg2, arg1, arg0, this.aClass31_1, this.anIntArrayArrayArray8);
					return;
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("48226, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -28 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local257.toString());
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
				return new URL("http://127.0.0.1:" + (anInt933 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method612() {
		try {
			if (this.anInt1054 == 2) {
				for (@Pc(17) Class3_Sub2 local17 = (Class3_Sub2) this.aClass26_10.method224(); local17 != null; local17 = (Class3_Sub2) this.aClass26_10.method226()) {
					if (local17.anInt87 > 0) {
						local17.anInt87--;
					}
					if (local17.anInt87 != 0) {
						if (local17.anInt88 > 0) {
							local17.anInt88--;
						}
						if (local17.anInt88 == 0 && local17.anInt91 >= 1 && local17.anInt92 >= 1 && local17.anInt91 <= 102 && local17.anInt92 <= 102 && (local17.anInt93 < 0 || Class15.method135(local17.anInt93, local17.anInt95))) {
							this.method611(local17.anInt94, local17.anInt91, local17.anInt89, local17.anInt93, local17.anInt95, local17.anInt90, local17.anInt92);
							local17.anInt88 = -1;
							if (local17.anInt93 == local17.anInt84 && local17.anInt84 == -1) {
								local17.method545();
							} else if (local17.anInt93 == local17.anInt84 && local17.anInt94 == local17.anInt85 && local17.anInt95 == local17.anInt86) {
								local17.method545();
							}
						}
					} else if (local17.anInt84 < 0 || Class15.method135(local17.anInt84, local17.anInt86)) {
						this.method611(local17.anInt85, local17.anInt91, local17.anInt89, local17.anInt84, local17.anInt86, local17.anInt90, local17.anInt92);
						local17.method545();
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("91650, " + 0 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method614(@OriginalArg(1) int arg0) {
		try {
			Class23.method216(arg0);
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("46237, " + 0 + ", " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean206) {
			this.method676();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLjava/lang/String;ILjava/lang/String;)Lclient!LKPVZAQN;")
	private Class22 method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			if (this.aByte45 != 9) {
				this.aClass3_Sub3_Sub4_6.method458(179);
			}
			@Pc(13) int local13 = 5;
			try {
				if (this.aClass20Array1[0] != null) {
					local3 = this.aClass20Array1[0].method182(arg1);
				}
			} catch (@Pc(28) Exception local28) {
			}
			@Pc(42) int local42;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local42 = (int) this.aCRC32_2.getValue();
				if (local42 != arg0) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class22(local3, 0);
			}
			local42 = 0;
			while (local3 == null) {
				@Pc(63) String local63 = "Unknown error";
				this.method587(arg3, "Requesting " + arg2);
				@Pc(78) int local78;
				try {
					local78 = 0;
					@Pc(89) DataInputStream local89 = this.method657(arg4 + arg0);
					@Pc(92) byte[] local92 = new byte[6];
					local89.readFully(local92, 0, 6);
					@Pc(103) Class3_Sub3_Sub4 local103 = new Class3_Sub3_Sub4((byte) -115, local92);
					local103.anInt738 = 3;
					@Pc(111) int local111 = local103.method472() + 6;
					@Pc(113) int local113 = 6;
					local3 = new byte[local111];
					for (@Pc(118) int local118 = 0; local118 < 6; local118++) {
						local3[local118] = local92[local118];
					}
					@Pc(136) int local136;
					while (local113 < local111) {
						local136 = local111 - local113;
						if (local136 > 1000) {
							local136 = 1000;
						}
						@Pc(147) int local147 = local89.read(local3, local113, local136);
						if (local147 < 0) {
							(new StringBuffer("Length error: ")).append(local113).append("/").append(local111).toString();
							throw new IOException("EOF");
						}
						local113 += local147;
						@Pc(176) int local176 = local113 * 100 / local111;
						if (local176 != local78) {
							this.method587(arg3, "Loading " + arg2 + " - " + local176 + "%");
						}
						local78 = local176;
					}
					local89.close();
					try {
						if (this.aClass20Array1[0] != null) {
							this.aClass20Array1[0].method183(arg1, 697, local3.length, local3);
						}
					} catch (@Pc(221) Exception local221) {
						this.aClass20Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local136 = (int) this.aCRC32_2.getValue();
						if (local136 != arg0) {
							local3 = null;
							local42++;
							local63 = "Checksum error: " + local136;
						}
					}
				} catch (@Pc(256) IOException local256) {
					if (local63.equals("Unknown error")) {
						local63 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(266) NullPointerException local266) {
					local63 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(275) ArrayIndexOutOfBoundsException local275) {
					local63 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(284) Exception local284) {
					local63 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local78 = local13; local78 > 0; local78--) {
						if (local42 >= 3) {
							this.method587(arg3, "Game updated - please reload page");
							local78 = 10;
						} else {
							this.method587(arg3, local63 + " - Retrying in " + local78);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(328) Exception local328) {
						}
					}
					local13 *= 2;
					if (local13 > 60) {
						local13 = 60;
					}
					this.aBoolean215 = !this.aBoolean215;
				}
			}
			return new Class22(local3, 0);
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("7625, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method617() {
		try {
			if (super.anInt841 == 1) {
				if (super.anInt842 >= 539 && super.anInt842 <= 573 && super.anInt843 >= 169 && super.anInt843 < 205 && this.anIntArray251[0] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 0;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 569 && super.anInt842 <= 599 && super.anInt843 >= 168 && super.anInt843 < 205 && this.anIntArray251[1] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 1;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 597 && super.anInt842 <= 627 && super.anInt843 >= 168 && super.anInt843 < 205 && this.anIntArray251[2] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 2;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 625 && super.anInt842 <= 669 && super.anInt843 >= 168 && super.anInt843 < 203 && this.anIntArray251[3] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 3;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 666 && super.anInt842 <= 696 && super.anInt843 >= 168 && super.anInt843 < 205 && this.anIntArray251[4] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 4;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 694 && super.anInt842 <= 724 && super.anInt843 >= 168 && super.anInt843 < 205 && this.anIntArray251[5] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 5;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 722 && super.anInt842 <= 756 && super.anInt843 >= 169 && super.anInt843 < 205 && this.anIntArray251[6] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 6;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 540 && super.anInt842 <= 574 && super.anInt843 >= 466 && super.anInt843 < 502 && this.anIntArray251[7] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 7;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 572 && super.anInt842 <= 602 && super.anInt843 >= 466 && super.anInt843 < 503 && this.anIntArray251[8] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 8;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 599 && super.anInt842 <= 629 && super.anInt843 >= 466 && super.anInt843 < 503 && this.anIntArray251[9] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 9;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 627 && super.anInt842 <= 671 && super.anInt843 >= 467 && super.anInt843 < 502 && this.anIntArray251[10] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 10;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 669 && super.anInt842 <= 699 && super.anInt843 >= 466 && super.anInt843 < 503 && this.anIntArray251[11] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 11;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 696 && super.anInt842 <= 726 && super.anInt843 >= 466 && super.anInt843 < 503 && this.anIntArray251[12] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 12;
					this.aBoolean214 = true;
				}
				if (super.anInt842 >= 724 && super.anInt842 <= 758 && super.anInt843 >= 466 && super.anInt843 < 502 && this.anIntArray251[13] != -1) {
					this.aBoolean216 = true;
					this.anInt885 = 13;
					this.aBoolean214 = true;
					return;
				}
			}
		} catch (@Pc(446) RuntimeException local446) {
			signlink.reporterror("21844, " + 3 + ", " + local446.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method618() {
		try {
			Class13.aClass25_3.method220();
			Class13.aClass25_4.method220();
			Class30.aClass25_7.method220();
			Class1.aClass25_1.method220();
			Class1.aClass25_2.method220();
			Class3_Sub3_Sub2_Sub1_Sub2.aClass25_8.method220();
			Class43.aClass25_9.method220();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("3137, " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method619(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass3_Sub3_Sub3_Sub1_10.anIntArray119;
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
						this.aClass31_1.method372(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass31_1.method372(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass3_Sub3_Sub3_Sub1_10.method253();
			@Pc(151) int local151;
			for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
				for (local151 = 1; local151 < 103; local151++) {
					if ((this.aByteArrayArrayArray8[arg0][local151][local147] & 0x18) == 0) {
						this.method639(local34, local36, arg0, local147, local151);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local151][local147] & 0x8) != 0) {
						this.method639(local34, local36, arg0 + 1, local147, local151);
					}
				}
			}
			if (this.aClass17_17 != null) {
				this.aClass17_17.method154();
				Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
			}
			this.anInt914 = 0;
			for (local151 = 0; local151 < 104; local151++) {
				for (@Pc(225) int local225 = 0; local225 < 104; local225++) {
					@Pc(235) int local235 = this.aClass31_1.method366(this.anInt1056, local151, local225);
					if (local235 != 0) {
						local235 = local235 >> 14 & 0x7FFF;
						@Pc(247) int local247 = Class13.method127(local235).anInt226;
						if (local247 >= 0) {
							@Pc(251) int local251 = local151;
							@Pc(253) int local253 = local225;
							if (local247 != 22 && local247 != 29 && local247 != 34 && local247 != 36 && local247 != 46 && local247 != 47 && local247 != 48) {
								@Pc(285) int[][] local285 = this.aClass4Array1[this.anInt1056].anIntArrayArray1;
								for (@Pc(287) int local287 = 0; local287 < 10; local287++) {
									@Pc(294) int local294 = (int) (Math.random() * 4.0D);
									if (local294 == 0 && local251 > 0 && local251 > local151 - 3 && (local285[local251 - 1][local253] & 0x1280108) == 0) {
										local251--;
									}
									if (local294 == 1 && local251 < 103 && local251 < local151 + 3 && (local285[local251 + 1][local253] & 0x1280180) == 0) {
										local251++;
									}
									if (local294 == 2 && local253 > 0 && local253 > local225 - 3 && (local285[local251][local253 - 1] & 0x1280102) == 0) {
										local253--;
									}
									if (local294 == 3 && local253 < 103 && local253 < local225 + 3 && (local285[local251][local253 + 1] & 0x1280120) == 0) {
										local253++;
									}
								}
							}
							this.aClass3_Sub3_Sub3_Sub1Array5[this.anInt914] = this.aClass3_Sub3_Sub3_Sub1Array6[local247];
							this.anIntArray229[this.anInt914] = local251;
							this.anIntArray230[this.anInt914] = local253;
							this.anInt914++;
						}
					}
				}
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("22151, " + arg0 + ", " + 6 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OGPNACTP;II)V")
	private void method620(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub3_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(11) int local11 = arg0 * arg0 + arg2 * arg2;
			if (local11 > 4225 && local11 < 90000) {
				@Pc(25) int local25 = this.anInt1020 + this.anInt892 & 0x7FF;
				@Pc(29) int local29 = Class3_Sub3_Sub2_Sub3.anIntArray51[local25];
				@Pc(33) int local33 = Class3_Sub3_Sub2_Sub3.anIntArray52[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt1026 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt1026 + 256);
				@Pc(61) int local61 = arg2 * local42 + arg0 * local51 >> 16;
				@Pc(71) int local71 = arg2 * local51 - arg0 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass3_Sub3_Sub3_Sub1_17.method263(local83 + 94 + 4 - 10, local77, 83 - local89 - 20);
			} else {
				this.method596(arg2, arg1, arg0);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("72107, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method621() {
		try {
			if (this.aClass17_19 == null) {
				super.aClass17_2 = null;
				this.aClass17_18 = null;
				this.aClass17_16 = null;
				this.aClass17_15 = null;
				this.aClass17_17 = null;
				this.aClass17_3 = null;
				this.aClass17_4 = null;
				this.aClass17_5 = null;
				this.aClass17_22 = new Class17((byte) 9, this.method585(), 128, 265);
				Class3_Sub3_Sub3.method550();
				this.aClass17_23 = new Class17((byte) 9, this.method585(), 128, 265);
				Class3_Sub3_Sub3.method550();
				this.aClass17_19 = new Class17((byte) 9, this.method585(), 509, 171);
				Class3_Sub3_Sub3.method550();
				this.aClass17_20 = new Class17((byte) 9, this.method585(), 360, 132);
				Class3_Sub3_Sub3.method550();
				this.aClass17_21 = new Class17((byte) 9, this.method585(), 360, 200);
				Class3_Sub3_Sub3.method550();
				this.aClass17_24 = new Class17((byte) 9, this.method585(), 202, 238);
				Class3_Sub3_Sub3.method550();
				this.aClass17_25 = new Class17((byte) 9, this.method585(), 203, 238);
				Class3_Sub3_Sub3.method550();
				this.aClass17_26 = new Class17((byte) 9, this.method585(), 74, 94);
				this.anInt943 += 0;
				Class3_Sub3_Sub3.method550();
				this.aClass17_27 = new Class17((byte) 9, this.method585(), 75, 94);
				Class3_Sub3_Sub3.method550();
				if (this.aClass22_2 != null) {
					this.method660();
					this.method693();
				}
				this.aBoolean244 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("29318, " + 0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private String method622(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("53742, " + false + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt1083 = arg0;
			if (!arg1) {
				this.aBoolean238 = !this.aBoolean238;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("51909, " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method624() {
		try {
			if (aBoolean226 && this.anInt1054 == 2 && Class15.anInt248 != this.anInt1056) {
				this.method712(null, "Loading - please wait.");
				this.anInt1054 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt1054 == 1) {
				@Pc(34) int local34 = this.method625(this.aBoolean220);
				if (local34 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString28 + " glcfb " + this.aLong29 + "," + local34 + "," + aBoolean226 + "," + this.aClass20Array1[0] + "," + this.aClass6_Sub1_1.method173() + "," + this.anInt1056 + "," + this.anInt851 + "," + this.anInt852);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt1054 == 2 && this.anInt1056 != this.anInt847) {
				this.anInt847 = this.anInt1056;
				this.method619(this.anInt1056);
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("6870, " + 8 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)I")
	private int method625(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.anInt935 = 81;
			}
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArray5.length; local8++) {
				if (this.aByteArrayArray5[local8] == null && this.anIntArray237[local8] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local8] == null && this.anIntArray238[local8] != -1) {
					return -2;
				}
			}
			@Pc(44) boolean local44 = true;
			for (@Pc(46) int local46 = 0; local46 < this.aByteArrayArray5.length; local46++) {
				@Pc(53) byte[] local53 = this.aByteArrayArray6[local46];
				if (local53 != null) {
					@Pc(67) int local67 = (this.anIntArray236[local46] >> 8) * 64 - this.anInt1003;
					@Pc(79) int local79 = (this.anIntArray236[local46] & 0xFF) * 64 - this.anInt1004;
					if (this.aBoolean201) {
						local67 = 10;
						local79 = 10;
					}
					local44 &= Class15.method133(local53, local79, local67);
				}
			}
			if (!local44) {
				return -3;
			} else if (this.aBoolean200) {
				return -4;
			} else {
				this.anInt1054 = 2;
				Class15.anInt248 = this.anInt1056;
				this.method641();
				this.aClass3_Sub3_Sub4_6.method457(115);
				return 0;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("97700, " + arg0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLclient!MRUJPFPS;I)V")
	private void method626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Class23 arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3.anInt355 == 0 && arg3.anIntArray104 != null && (!arg3.aBoolean87 || this.anInt848 == arg3.anInt363 || this.anInt1007 == arg3.anInt363 || this.anInt1051 == arg3.anInt363)) {
				@Pc(29) int local29 = Class3_Sub3_Sub3.anInt819;
				@Pc(31) int local31 = Class3_Sub3_Sub3.anInt817;
				@Pc(33) int local33 = Class3_Sub3_Sub3.anInt820;
				@Pc(35) int local35 = Class3_Sub3_Sub3.anInt818;
				Class3_Sub3_Sub3.method549(arg0, arg0 + arg3.anInt348, arg4 + arg3.anInt335, arg4);
				@Pc(51) int local51 = arg3.anIntArray104.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg3.anIntArray102[local53] + arg4;
					@Pc(71) int local71 = arg3.anIntArray103[local53] + arg0 - arg1;
					@Pc(77) Class23 local77 = Class23.method208(arg3.anIntArray104[local53]);
					@Pc(82) int local82 = local62 + local77.anInt367;
					@Pc(87) int local87 = local71 + local77.anInt359;
					if (local77.anInt334 > 0) {
						this.method599(local77);
					}
					if (local77.anInt355 == 0) {
						if (local77.anInt336 > local77.anInt370 - local77.anInt348) {
							local77.anInt336 = local77.anInt370 - local77.anInt348;
						}
						if (local77.anInt336 < 0) {
							local77.anInt336 = 0;
						}
						this.method626(local87, local77.anInt336, this.aByte42, local77, local82);
						if (local77.anInt370 > local77.anInt348) {
							this.method680(local77.anInt370, local77.anInt336, this.anInt980, local87, local82 + local77.anInt335, local77.anInt348);
						}
					} else if (local77.anInt355 != 1) {
						@Pc(161) int local161;
						@Pc(165) int local165;
						@Pc(176) int local176;
						@Pc(211) int local211;
						@Pc(218) int local218;
						@Pc(243) int local243;
						@Pc(159) int local159;
						@Pc(209) int local209;
						if (local77.anInt355 == 2) {
							local159 = 0;
							for (local161 = 0; local161 < local77.anInt348; local161++) {
								for (local165 = 0; local165 < local77.anInt335; local165++) {
									local176 = local82 + local165 * (local77.anInt358 + 32);
									@Pc(185) int local185 = local87 + local161 * (local77.anInt352 + 32);
									if (local159 < 20) {
										local176 += local77.anIntArray106[local159];
										local185 += local77.anIntArray105[local159];
									}
									if (local77.anIntArray98[local159] > 0) {
										local209 = 0;
										local211 = 0;
										local218 = local77.anIntArray98[local159] - 1;
										if (local176 > Class3_Sub3_Sub3.anInt819 - 32 && local176 < Class3_Sub3_Sub3.anInt820 && local185 > Class3_Sub3_Sub3.anInt817 - 32 && local185 < Class3_Sub3_Sub3.anInt818 || this.anInt1000 != 0 && this.anInt999 == local159) {
											local243 = 0;
											if (this.anInt910 == 1 && this.anInt911 == local159 && this.anInt912 == local77.anInt363) {
												local243 = 16777215;
											}
											@Pc(267) Class3_Sub3_Sub3_Sub1 local267 = Class1.method4(local243, local218, local77.anIntArray100[local159], (byte) 1);
											if (local267 != null) {
												@Pc(346) int local346;
												if (this.anInt1000 != 0 && this.anInt999 == local159 && this.anInt998 == local77.anInt363) {
													local209 = super.anInt836 - this.anInt1001;
													local211 = super.anInt837 - this.anInt1002;
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (local211 < 5 && local211 > -5) {
														local211 = 0;
													}
													if (this.anInt905 < 5) {
														local209 = 0;
														local211 = 0;
													}
													local267.method260(local185 + local211, local176 + local209);
													if (local185 + local211 < Class3_Sub3_Sub3.anInt817 && arg3.anInt336 > 0) {
														local346 = this.anInt1008 * (Class3_Sub3_Sub3.anInt817 - local185 - local211) / 3;
														if (local346 > this.anInt1008 * 10) {
															local346 = this.anInt1008 * 10;
														}
														if (local346 > arg3.anInt336) {
															local346 = arg3.anInt336;
														}
														arg3.anInt336 -= local346;
														this.anInt1002 += local346;
													}
													if (local185 + local211 + 32 > Class3_Sub3_Sub3.anInt818 && arg3.anInt336 < arg3.anInt370 - arg3.anInt348) {
														local346 = this.anInt1008 * (local185 + local211 + 32 - Class3_Sub3_Sub3.anInt818) / 3;
														if (local346 > this.anInt1008 * 10) {
															local346 = this.anInt1008 * 10;
														}
														if (local346 > arg3.anInt370 - arg3.anInt348 - arg3.anInt336) {
															local346 = arg3.anInt370 - arg3.anInt348 - arg3.anInt336;
														}
														arg3.anInt336 += local346;
														this.anInt1002 -= local346;
													}
												} else if (this.anInt965 != 0 && this.anInt964 == local159 && this.anInt963 == local77.anInt363) {
													local267.method260(local185, local176);
												} else {
													local267.method258(local176, local185);
												}
												if (local267.anInt441 == 33 || local77.anIntArray100[local159] != 1) {
													local346 = local77.anIntArray100[local159];
													this.aClass3_Sub3_Sub3_Sub4_2.method564(0, local185 + local211 + 10, method608(local346), local176 + local209 + 1);
													this.aClass3_Sub3_Sub3_Sub4_2.method564(16776960, local185 + local211 + 9, method608(local346), local176 + local209);
												}
											}
										}
									} else if (local77.aClass3_Sub3_Sub3_Sub1Array2 != null && local159 < 20) {
										@Pc(535) Class3_Sub3_Sub3_Sub1 local535 = local77.aClass3_Sub3_Sub3_Sub1Array2[local159];
										if (local535 != null) {
											local535.method258(local176, local185);
										}
									}
									local159++;
								}
							}
						} else if (local77.anInt355 == 3) {
							@Pc(561) boolean local561 = false;
							if (this.anInt1051 == local77.anInt363 || this.anInt1007 == local77.anInt363 || this.anInt848 == local77.anInt363) {
								local561 = true;
							}
							if (this.method702(local77)) {
								local159 = local77.anInt344;
								if (local561 && local77.anInt371 != 0) {
									local159 = local77.anInt371;
								}
							} else {
								local159 = local77.anInt354;
								if (local561 && local77.anInt368 != 0) {
									local159 = local77.anInt368;
								}
							}
							if (local77.aByte17 == 0) {
								if (local77.aBoolean89) {
									Class3_Sub3_Sub3.method552(local159, this.aByte40, local82, local87, local77.anInt348, local77.anInt335);
								} else {
									Class3_Sub3_Sub3.method553(local77.anInt335, local87, local77.anInt348, local82, local159);
								}
							} else if (local77.aBoolean89) {
								Class3_Sub3_Sub3.method551(local159, local82, 256 - (local77.aByte17 & 0xFF), local77.anInt335, local77.anInt348, local87);
							} else {
								Class3_Sub3_Sub3.method554(local77.anInt348, local77.anInt335, local159, 256 - (local77.aByte17 & 0xFF), local82, local87);
							}
						} else {
							@Pc(680) Class3_Sub3_Sub3_Sub4 local680;
							@Pc(957) String local957;
							if (local77.anInt355 == 4) {
								local680 = local77.aClass3_Sub3_Sub3_Sub4_1;
								@Pc(683) String local683 = local77.aString5;
								@Pc(685) boolean local685 = false;
								if (this.anInt1051 == local77.anInt363 || this.anInt1007 == local77.anInt363 || this.anInt848 == local77.anInt363) {
									local685 = true;
								}
								if (this.method702(local77)) {
									local161 = local77.anInt344;
									if (local685 && local77.anInt371 != 0) {
										local161 = local77.anInt371;
									}
									if (local77.aString8.length() > 0) {
										local683 = local77.aString8;
									}
								} else {
									local161 = local77.anInt354;
									if (local685 && local77.anInt368 != 0) {
										local161 = local77.anInt368;
									}
								}
								if (local77.anInt369 == 6 && this.aBoolean232) {
									local683 = "Please wait...";
									local161 = local77.anInt354;
								}
								if (Class3_Sub3_Sub3.anInt815 == 479) {
									if (local161 == 16776960) {
										local161 = 255;
									}
									if (local161 == 49152) {
										local161 = 16777215;
									}
								}
								local209 = local87 + local680.anInt825;
								while (local683.length() > 0) {
									if (local683.indexOf("%") != -1) {
										label394: while (true) {
											local211 = local683.indexOf("%1");
											if (local211 == -1) {
												while (true) {
													local211 = local683.indexOf("%2");
													if (local211 == -1) {
														while (true) {
															local211 = local683.indexOf("%3");
															if (local211 == -1) {
																while (true) {
																	local211 = local683.indexOf("%4");
																	if (local211 == -1) {
																		while (true) {
																			local211 = local683.indexOf("%5");
																			if (local211 == -1) {
																				break label394;
																			}
																			local683 = local683.substring(0, local211) + this.method622(this.method705(local77, 4)) + local683.substring(local211 + 2);
																		}
																	}
																	local683 = local683.substring(0, local211) + this.method622(this.method705(local77, 3)) + local683.substring(local211 + 2);
																}
															}
															local683 = local683.substring(0, local211) + this.method622(this.method705(local77, 2)) + local683.substring(local211 + 2);
														}
													}
													local683 = local683.substring(0, local211) + this.method622(this.method705(local77, 1)) + local683.substring(local211 + 2);
												}
											}
											local683 = local683.substring(0, local211) + this.method622(this.method705(local77, 0)) + local683.substring(local211 + 2);
										}
									}
									local211 = local683.indexOf("\\n");
									if (local211 == -1) {
										local957 = local683;
										local683 = "";
									} else {
										local957 = local683.substring(0, local211);
										local683 = local683.substring(local211 + 2);
									}
									if (local77.aBoolean85) {
										local680.method561(local161, local77.aBoolean88, local957, local82 + local77.anInt335 / 2, local209);
									} else {
										local680.method568((byte) 3, local77.aBoolean88, local957, local82, local161, local209);
									}
									local209 += local680.anInt825;
								}
							} else if (local77.anInt355 == 5) {
								@Pc(1019) Class3_Sub3_Sub3_Sub1 local1019;
								if (this.method702(local77)) {
									local1019 = local77.aClass3_Sub3_Sub3_Sub1_2;
								} else {
									local1019 = local77.aClass3_Sub3_Sub3_Sub1_1;
								}
								if (local1019 != null) {
									local1019.method258(local82, local87);
								}
							} else if (local77.anInt355 == 6) {
								local159 = Class3_Sub3_Sub3_Sub3.anInt489;
								local161 = Class3_Sub3_Sub3_Sub3.anInt490;
								Class3_Sub3_Sub3_Sub3.anInt489 = local82 + local77.anInt335 / 2;
								Class3_Sub3_Sub3_Sub3.anInt490 = local87 + local77.anInt348 / 2;
								local165 = Class3_Sub3_Sub3_Sub3.anIntArray143[local77.anInt341] * local77.anInt340 >> 16;
								local176 = Class3_Sub3_Sub3_Sub3.anIntArray144[local77.anInt341] * local77.anInt340 >> 16;
								@Pc(1080) boolean local1080 = this.method702(local77);
								if (local1080) {
									local209 = local77.anInt362;
								} else {
									local209 = local77.anInt361;
								}
								@Pc(1100) Class3_Sub3_Sub2_Sub3 local1100;
								if (local209 == -1) {
									local1100 = local77.method210(local1080, -1, -1);
								} else {
									@Pc(1106) Class46 local1106 = Class46.aClass46Array1[local209];
									local1100 = local77.method210(local1080, local1106.anIntArray198[local77.anInt372], local1106.anIntArray199[local77.anInt372]);
								}
								if (local1100 != null) {
									local1100.method101(local77.anInt342, 0, local77.anInt341, 0, local165, local176);
								}
								Class3_Sub3_Sub3_Sub3.anInt489 = local159;
								Class3_Sub3_Sub3_Sub3.anInt490 = local161;
							} else {
								if (local77.anInt355 == 7) {
									local680 = local77.aClass3_Sub3_Sub3_Sub4_1;
									local161 = 0;
									for (local165 = 0; local165 < local77.anInt348; local165++) {
										for (local176 = 0; local176 < local77.anInt335; local176++) {
											if (local77.anIntArray98[local161] > 0) {
												@Pc(1170) Class1 local1170 = Class1.method7(local77.anIntArray98[local161] - 1);
												@Pc(1174) String local1174 = String.valueOf(local1170.aString1);
												if (local1170.aBoolean2 || local77.anIntArray100[local161] != 1) {
													local1174 = local1174 + " x" + method615(local77.anIntArray100[local161], 932);
												}
												local211 = local82 + local176 * (local77.anInt358 + 115);
												local218 = local87 + local165 * (local77.anInt352 + 12);
												if (local77.aBoolean85) {
													local680.method561(local77.anInt354, local77.aBoolean88, local1174, local211 + local77.anInt335 / 2, local218);
												} else {
													local680.method568((byte) 3, local77.aBoolean88, local1174, local211, local77.anInt354, local218);
												}
											}
											local161++;
										}
									}
								}
								if (local77.anInt355 == 8 && (this.anInt872 == local77.anInt363 || this.anInt906 == local77.anInt363 || this.anInt976 == local77.anInt363) && this.anInt1028 == 100) {
									local159 = 0;
									local161 = 0;
									@Pc(1288) Class3_Sub3_Sub3_Sub4 local1288 = this.aClass3_Sub3_Sub3_Sub4_3;
									@Pc(1291) String local1291 = local77.aString5;
									while (local1291.length() > 0) {
										local209 = local1291.indexOf("\\n");
										if (local209 == -1) {
											local957 = local1291;
											local1291 = "";
										} else {
											local957 = local1291.substring(0, local209);
											local1291 = local1291.substring(local209 + 2);
										}
										local211 = local1288.method562(local957);
										if (local211 > local159) {
											local159 = local211;
										}
										local161 += local1288.anInt825 + 1;
									}
									local159 += 6;
									local161 += 7;
									local209 = local82 + local77.anInt335 - local159 - 5;
									local211 = local87 + local77.anInt348 + 5;
									if (local209 < local82 + 5) {
										local209 = local82 + 5;
									}
									if (local209 + local159 > arg4 + arg3.anInt335) {
										local209 = arg4 + arg3.anInt335 - local159;
									}
									if (local211 + local161 > arg0 + arg3.anInt348) {
										local211 = arg0 + arg3.anInt348 - local161;
									}
									Class3_Sub3_Sub3.method552(16777120, this.aByte40, local209, local211, local161, local159);
									Class3_Sub3_Sub3.method553(local159, local211, local161, local209, 0);
									local1291 = local77.aString5;
									local218 = local211 + local1288.anInt825 + 2;
									while (local1291.length() > 0) {
										local243 = local1291.indexOf("\\n");
										if (local243 == -1) {
											local957 = local1291;
											local1291 = "";
										} else {
											local957 = local1291.substring(0, local243);
											local1291 = local1291.substring(local243 + 2);
										}
										local1288.method568((byte) 3, false, local957, local209 + 3, 0, local218);
										local218 += local1288.anInt825 + 1;
									}
								}
							}
						}
					}
				}
				Class3_Sub3_Sub3.method549(local31, local35, local33, local29);
				if (arg2 != 7) {
					this.anInt898 = 438;
				}
			}
		} catch (@Pc(1483) RuntimeException local1483) {
			signlink.reporterror("42798, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1483.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method627() {
		try {
			for (@Pc(12) Class3_Sub3_Sub2_Sub2 local12 = (Class3_Sub3_Sub2_Sub2) this.aClass26_11.method224(); local12 != null; local12 = (Class3_Sub3_Sub2_Sub2) this.aClass26_11.method226()) {
				if (local12.anInt164 != this.anInt1056 || local12.aBoolean35) {
					local12.method545();
				} else if (anInt1032 >= local12.anInt168) {
					local12.method65(this.anInt1008);
					if (local12.aBoolean35) {
						local12.method545();
					} else {
						this.aClass31_1.method348(local12.anInt164, -1, 60, local12, local12.anInt166, local12.anInt165, 0, local12.anInt167, false);
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("47868, " + 9 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method628(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null || arg1.length() == 0) {
				this.anInt880 = 0;
			} else {
				@Pc(12) String local12 = arg1;
				@Pc(16) boolean local16 = false;
				@Pc(19) String[] local19 = new String[100];
				@Pc(21) int local21 = 0;
				while (true) {
					@Pc(25) int local25 = local12.indexOf(" ");
					if (local25 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local19[local21++] = local12.toLowerCase();
						}
						this.anInt880 = 0;
						label49: for (local25 = 0; local25 < Class1.anInt9; local25++) {
							@Pc(74) Class1 local74 = Class1.method7(local25);
							if (local74.anInt21 == -1 && local74.aString1 != null) {
								@Pc(85) String local85 = local74.aString1.toLowerCase();
								for (@Pc(87) int local87 = 0; local87 < local21; local87++) {
									if (local85.indexOf(local19[local87]) == -1) {
										continue label49;
									}
								}
								this.aStringArray8[this.anInt880] = local85;
								this.anIntArray216[this.anInt880] = local25;
								this.anInt880++;
								if (this.anInt880 >= this.aStringArray8.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(34) String local34 = local12.substring(0, local25).trim();
					if (local34.length() > 0) {
						local19[local21++] = local34.toLowerCase();
					}
					local12 = local12.substring(local25 + 1);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("61441, " + arg0 + ", " + arg1 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)V")
	private void method629(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (this.aBoolean221) {
				signlink.anInt1081 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("54912, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method630() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt969; local3++) {
				if (local3 == -1) {
					local11 = this.anInt968;
				} else {
					local11 = this.anIntArray244[local3];
				}
				@Pc(23) Class3_Sub3_Sub2_Sub1_Sub2 local23 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method665(local23, 1);
				}
			}
			anInt1050++;
			if (anInt1050 > 1721) {
				anInt1050 = 0;
				this.aClass3_Sub3_Sub4_6.method457(165);
				this.aClass3_Sub3_Sub4_6.method458(0);
				local11 = this.aClass3_Sub3_Sub4_6.anInt738;
				this.aClass3_Sub3_Sub4_6.method458(224);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub3_Sub4_6.method458(216);
				}
				this.aClass3_Sub3_Sub4_6.method458(6);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub3_Sub4_6.method458(255);
				}
				this.aClass3_Sub3_Sub4_6.method459((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub3_Sub4_6.method459(11572);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub3_Sub4_6.method459(24447);
				}
				this.aClass3_Sub3_Sub4_6.method458(42);
				this.aClass3_Sub3_Sub4_6.method458((int) (Math.random() * 256.0D));
				this.aClass3_Sub3_Sub4_6.method459((int) (Math.random() * 65536.0D));
				this.aClass3_Sub3_Sub4_6.method467(this.aClass3_Sub3_Sub4_6.anInt738 - local11, 371);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("97095, " + -368 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method631() {
		try {
			this.method672(this.anInt1062);
			if (this.anInt1041 == 1) {
				this.aClass3_Sub3_Sub3_Sub1Array4[this.anInt1040 / 100].method258(this.anInt1038 - 8 - 4, this.anInt1039 - 8 - 4);
			}
			if (this.anInt1041 == 2) {
				this.aClass3_Sub3_Sub3_Sub1Array4[this.anInt1040 / 100 + 4].method258(this.anInt1038 - 8 - 4, this.anInt1039 - 8 - 4);
			}
			if (this.anInt901 != -1) {
				this.method598(this.anInt1008, this.anInt901);
				this.method626(0, 0, this.aByte42, Class23.method208(this.anInt901), 0);
			}
			if (this.anInt1061 != -1) {
				this.method598(this.anInt1008, this.anInt1061);
				this.method626(0, 0, this.aByte42, Class23.method208(this.anInt1061), 0);
			}
			this.method636();
			if (!this.aBoolean223) {
				this.method663(this.anInt1055);
				this.method707();
			} else if (this.anInt950 == 0) {
				this.method646();
			}
			if (this.anInt924 == 1) {
				this.aClass3_Sub3_Sub3_Sub1_5.method258(472, 296);
			}
			@Pc(182) int local182;
			if (aBoolean230) {
				@Pc(148) byte local148 = 20;
				@Pc(150) int local150 = 16776960;
				if (super.anInt831 < 30 && aBoolean226) {
					local150 = 16711680;
				}
				if (super.anInt831 < 20 && !aBoolean226) {
					local150 = 16711680;
				}
				this.aClass3_Sub3_Sub3_Sub4_3.method559(local150, "Fps:" + super.anInt831, 20);
				local182 = local148 + 15;
				@Pc(184) Runtime local184 = Runtime.getRuntime();
				@Pc(193) int local193 = (int) ((local184.totalMemory() - local184.freeMemory()) / 1024L);
				if (local193 > 33554432 && aBoolean226) {
				}
				if (local193 > 67108864 && !aBoolean226) {
				}
				this.aClass3_Sub3_Sub3_Sub4_3.method559(16776960, "Mem:" + local193 + "k", 35);
				local182 += 15;
			}
			if (this.anInt923 != 0) {
				@Pc(234) int local234 = this.anInt923 / 50;
				local182 = local234 / 60;
				@Pc(242) int local242 = local234 % 60;
				if (local242 < 10) {
					this.aClass3_Sub3_Sub3_Sub4_3.method564(16776960, 329, "System update in: " + local182 + ":0" + local242, 4);
				} else {
					this.aClass3_Sub3_Sub3_Sub4_3.method564(16776960, 329, "System update in: " + local182 + ":" + local242, 4);
				}
			}
		} catch (@Pc(284) RuntimeException local284) {
			signlink.reporterror("24206, " + 7484 + ", " + local284.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method632() {
		try {
			@Pc(6) int local6 = this.anInt1011 * 128 + 64;
			@Pc(13) int local13 = this.anInt1012 * 128 + 64;
			@Pc(24) int local24 = this.method695(this.anInt1056, local6, local13) - this.anInt1013;
			if (this.anInt1043 < local6) {
				this.anInt1043 += this.anInt1014 + (local6 - this.anInt1043) * this.anInt1015 / 1000;
				if (this.anInt1043 > local6) {
					this.anInt1043 = local6;
				}
			}
			if (this.anInt1043 > local6) {
				this.anInt1043 -= this.anInt1014 + (this.anInt1043 - local6) * this.anInt1015 / 1000;
				if (this.anInt1043 < local6) {
					this.anInt1043 = local6;
				}
			}
			if (this.anInt1044 < local24) {
				this.anInt1044 += this.anInt1014 + (local24 - this.anInt1044) * this.anInt1015 / 1000;
				if (this.anInt1044 > local24) {
					this.anInt1044 = local24;
				}
			}
			if (this.anInt1044 > local24) {
				this.anInt1044 -= this.anInt1014 + (this.anInt1044 - local24) * this.anInt1015 / 1000;
				if (this.anInt1044 < local24) {
					this.anInt1044 = local24;
				}
			}
			if (this.anInt1045 < local13) {
				this.anInt1045 += this.anInt1014 + (local13 - this.anInt1045) * this.anInt1015 / 1000;
				if (this.anInt1045 > local13) {
					this.anInt1045 = local13;
				}
			}
			if (this.anInt1045 > local13) {
				this.anInt1045 -= this.anInt1014 + (this.anInt1045 - local13) * this.anInt1015 / 1000;
				if (this.anInt1045 < local13) {
					this.anInt1045 = local13;
				}
			}
			local6 = this.anInt857 * 128 + 64;
			local13 = this.anInt858 * 128 + 64;
			local24 = this.method695(this.anInt1056, local6, local13) - this.anInt859;
			@Pc(228) int local228 = local6 - this.anInt1043;
			@Pc(233) int local233 = local24 - this.anInt1044;
			@Pc(238) int local238 = local13 - this.anInt1045;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt1046 < local260) {
				this.anInt1046 += this.anInt860 + (local260 - this.anInt1046) * this.anInt861 / 1000;
				if (this.anInt1046 > local260) {
					this.anInt1046 = local260;
				}
			}
			if (this.anInt1046 > local260) {
				this.anInt1046 -= this.anInt860 + (this.anInt1046 - local260) * this.anInt861 / 1000;
				if (this.anInt1046 < local260) {
					this.anInt1046 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt1047;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt1047 += this.anInt860 + local342 * this.anInt861 / 1000;
				this.anInt1047 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt1047 -= this.anInt860 + -local342 * this.anInt861 / 1000;
				this.anInt1047 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt1047;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt1047 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("32428, " + 5745 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method633(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1033 >= 100 && this.anInt955 != 1) {
					this.method716((byte) 2, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.anInt1033 >= 200) {
					this.method716((byte) 2, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					@Pc(39) String local39 = Class48.method539(Class48.method536(this.aBoolean224, arg0));
					for (@Pc(41) int local41 = 0; local41 < this.anInt1033; local41++) {
						if (this.aLongArray3[local41] == arg0) {
							this.method716((byte) 2, 0, local39 + " is already on your friend list", "");
							return;
						}
					}
					for (@Pc(71) int local71 = 0; local71 < this.anInt894; local71++) {
						if (this.aLongArray4[local71] == arg0) {
							this.method716((byte) 2, 0, "Please remove " + local39 + " from your ignore list first", "");
							return;
						}
					}
					if (!local39.equals(aClass3_Sub3_Sub2_Sub1_Sub2_1.aString14)) {
						this.aStringArray10[this.anInt1033] = local39;
						this.aBoolean241 &= true;
						this.aLongArray3[this.anInt1033] = arg0;
						this.anIntArray215[this.anInt1033] = 0;
						this.anInt1033++;
						this.aBoolean216 = true;
						this.aClass3_Sub3_Sub4_6.method457(186);
						this.aClass3_Sub3_Sub4_6.method464(arg0);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("66231, " + true + ", " + arg0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method634(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt894; local8++) {
					if (this.aLongArray4[local8] == arg1) {
						this.anInt894--;
						this.aBoolean216 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt894; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass3_Sub3_Sub4_6.method457(17);
						this.aClass3_Sub3_Sub4_6.method464(arg1);
						break;
					}
				}
				@Pc(67) boolean local67 = false;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("92639, " + arg0 + ", " + arg1 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!WBEWPIXO;)V")
	private void method635(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1) {
		try {
			this.anInt987 = 0;
			this.anInt970 = 0;
			this.method723(arg0, arg1);
			this.method589(arg0, arg1);
			this.method724(arg0, arg1);
			@Pc(34) int local34;
			for (@Pc(27) int local27 = 0; local27 < this.anInt987; local27++) {
				local34 = this.anIntArray247[local27];
				if (this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local34].anInt662 != anInt1032) {
					this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local34].aClass30_1 = null;
					this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local34] = null;
				}
			}
			if (arg1.anInt738 != arg0) {
				signlink.reporterror(this.aString28 + " size mismatch in getnpcpos - pos:" + arg1.anInt738 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local34 = 0; local34 < this.anInt930; local34++) {
				if (this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[this.anIntArray239[local34]] == null) {
					signlink.reporterror(this.aString28 + " null entry in npc list - pos:" + local34 + " size:" + this.anInt930);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("92115, " + arg0 + ", " + false + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method636() {
		try {
			this.anInt1037 = 0;
			@Pc(20) int local20 = (aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 >> 7) + this.anInt1003;
			@Pc(28) int local28 = (aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 >> 7) + this.anInt1004;
			if (local20 >= 3053 && local20 <= 3156 && local28 >= 3056 && local28 <= 3136) {
				this.anInt1037 = 1;
			}
			if (local20 >= 3072 && local20 <= 3118 && local28 >= 9492 && local28 <= 9535) {
				this.anInt1037 = 1;
			}
			if (this.anInt1037 == 1 && local20 >= 3139 && local20 <= 3199 && local28 >= 3008 && local28 <= 3062) {
				this.anInt1037 = 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("34888, " + 0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method637() {
		try {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (this.anInt874 == 0) {
				local21 = super.anInt832 / 2 - 80;
				local28 = super.anInt833 / 2 + 20;
				local28 += 20;
				if (super.anInt841 == 1 && super.anInt842 >= local21 - 75 && super.anInt842 <= local21 + 75 && super.anInt843 >= local28 - 20 && super.anInt843 <= local28 + 20) {
					this.anInt874 = 3;
					this.anInt931 = 0;
				}
				local21 = super.anInt832 / 2 + 80;
				if (super.anInt841 == 1 && super.anInt842 >= local21 - 75 && super.anInt842 <= local21 + 75 && super.anInt843 >= local28 - 20 && super.anInt843 <= local28 + 20) {
					this.aString21 = "";
					this.aString22 = "Enter your username & password.";
					this.anInt874 = 2;
					this.anInt931 = 0;
				}
			} else if (this.anInt874 == 2) {
				local21 = super.anInt833 / 2 - 40;
				local21 += 30;
				local21 += 25;
				if (super.anInt841 == 1 && super.anInt843 >= local21 - 15 && super.anInt843 < local21) {
					this.anInt931 = 0;
				}
				local21 += 15;
				if (super.anInt841 == 1 && super.anInt843 >= local21 - 15 && super.anInt843 < local21) {
					this.anInt931 = 1;
				}
				local21 += 15;
				local28 = super.anInt832 / 2 - 80;
				@Pc(174) int local174 = super.anInt833 / 2 + 50;
				@Pc(175) int local175 = local174 + 20;
				if (super.anInt841 == 1 && super.anInt842 >= local28 - 75 && super.anInt842 <= local28 + 75 && super.anInt843 >= local175 - 20 && super.anInt843 <= local175 + 20) {
					this.anInt855 = 0;
					this.method649(this.aString28, this.aString29, false);
					if (this.aBoolean241) {
						return;
					}
				}
				local28 = super.anInt832 / 2 + 80;
				if (super.anInt841 == 1 && super.anInt842 >= local28 - 75 && super.anInt842 <= local28 + 75 && super.anInt843 >= local175 - 20 && super.anInt843 <= local175 + 20) {
					this.anInt874 = 0;
					this.aString28 = "";
					this.aString29 = "";
				}
				while (true) {
					while (true) {
						@Pc(265) int local265 = this.method579();
						if (local265 == -1) {
							return;
						}
						@Pc(270) boolean local270 = false;
						for (@Pc(272) int local272 = 0; local272 < aString19.length(); local272++) {
							if (local265 == aString19.charAt(local272)) {
								local270 = true;
								break;
							}
						}
						if (this.anInt931 == 0) {
							if (local265 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt931 = 1;
							}
							if (local270) {
								this.aString28 = this.aString28 + (char) local265;
							}
							if (this.aString28.length() > 12) {
								this.aString28 = this.aString28.substring(0, 12);
							}
						} else if (this.anInt931 == 1) {
							if (local265 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt931 = 0;
							}
							if (local270) {
								this.aString29 = this.aString29 + (char) local265;
							}
							if (this.aString29.length() > 20) {
								this.aString29 = this.aString29.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt874 == 3) {
				local21 = super.anInt832 / 2;
				local28 = super.anInt833 / 2 + 50;
				@Pc(429) int local429 = local28 + 20;
				if (super.anInt841 == 1 && super.anInt842 >= local21 - 75 && super.anInt842 <= local21 + 75 && super.anInt843 >= local429 - 20 && super.anInt843 <= local429 + 20) {
					this.anInt874 = 0;
					return;
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("28865, " + 0 + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!MRUJPFPS;Z)Z")
	private boolean method638(@OriginalArg(0) Class23 arg0) {
		try {
			this.aBoolean241 &= true;
			@Pc(10) int local10 = arg0.anInt334;
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
				this.aStringArray9[this.anInt1071] = "Remove @whi@" + this.aStringArray10[local10];
				this.anIntArray221[this.anInt1071] = 169;
				this.anInt1071++;
				this.aStringArray9[this.anInt1071] = "Message @whi@" + this.aStringArray10[local10];
				this.anIntArray221[this.anInt1071] = 956;
				this.anInt1071++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray9[this.anInt1071] = "Remove @whi@" + arg0.aString5;
				this.anIntArray221[this.anInt1071] = 34;
				this.anInt1071++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("11692, " + arg0 + ", " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass31_1.method363(arg2, arg4, arg3);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass31_1.method367(arg2, arg4, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg0;
				if (local8 > 0) {
					local30 = arg1;
				}
				@Pc(38) int[] local38 = this.aClass3_Sub3_Sub3_Sub1_10.anIntArray119;
				local52 = arg4 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class13 local61 = Class13.method127(local58);
				if (local61.anInt227 == -1) {
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
					@Pc(71) Class3_Sub3_Sub3_Sub2 local71 = this.aClass3_Sub3_Sub3_Sub2Array4[local61.anInt227];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt237 * 4 - local71.anInt458) / 2;
						@Pc(93) int local93 = (local61.anInt233 * 4 - local71.anInt459) / 2;
						local71.method285(arg4 * 4 + local83 + 48, (104 - arg3 - local61.anInt233) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass31_1.method365(arg2, arg4, arg3);
			if (local8 != 0) {
				local18 = this.aClass31_1.method367(arg2, arg4, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class13 local447 = Class13.method127(local30);
				@Pc(479) int local479;
				if (local447.anInt227 != -1) {
					@Pc(457) Class3_Sub3_Sub3_Sub2 local457 = this.aClass3_Sub3_Sub3_Sub2Array4[local447.anInt227];
					if (local457 != null) {
						local58 = (local447.anInt237 * 4 - local457.anInt458) / 2;
						local479 = (local447.anInt233 * 4 - local457.anInt459) / 2;
						local457.method285(arg4 * 4 + local58 + 48, (104 - arg3 - local447.anInt233) * 4 + 48 + local479);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass3_Sub3_Sub3_Sub1_10.anIntArray119;
					local479 = arg4 * 4 + (103 - arg3) * 512 * 4 + 24624;
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
			local8 = this.aClass31_1.method366(arg2, arg4, arg3);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(618) Class13 local618 = Class13.method127(local18);
				if (local618.anInt227 != -1) {
					@Pc(628) Class3_Sub3_Sub3_Sub2 local628 = this.aClass3_Sub3_Sub3_Sub2Array4[local618.anInt227];
					if (local628 != null) {
						local30 = (local618.anInt237 * 4 - local628.anInt458) / 2;
						@Pc(650) int local650 = (local618.anInt233 * 4 - local628.anInt459) / 2;
						local628.method285(arg4 * 4 + local30 + 48, (104 - arg3 - local618.anInt233) * 4 + 48 + local650);
						return;
					}
				}
			}
		} catch (@Pc(674) RuntimeException local674) {
			signlink.reporterror("664, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 48544 + ", " + arg3 + ", " + arg4 + ", " + local674.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!MRUJPFPS;IIIII)V")
	private void method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean227) {
				this.anInt1018 = 32;
			} else {
				this.anInt1018 = 0;
			}
			this.aBoolean227 = false;
			if (arg3 >= arg1 && arg3 < arg1 + 16 && arg4 >= arg5 && arg4 < arg5 + 16) {
				arg2.anInt336 -= this.anInt1029 * 4;
				if (arg7 == 1) {
					this.aBoolean216 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean237 = true;
				}
			} else if (arg3 >= arg1 && arg3 < arg1 + 16 && arg4 >= arg5 + arg0 - 16 && arg4 < arg5 + arg0) {
				arg2.anInt336 += this.anInt1029 * 4;
				if (arg7 == 1) {
					this.aBoolean216 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean237 = true;
				}
			} else if (arg3 >= arg1 - this.anInt1018 && arg3 < arg1 + this.anInt1018 + 16 && arg4 >= arg5 + 16 && arg4 < arg5 + arg0 - 16 && this.anInt1029 > 0) {
				@Pc(141) int local141 = (arg0 - 32) * arg0 / arg6;
				if (local141 < 8) {
					local141 = 8;
				}
				@Pc(156) int local156 = arg4 - arg5 - local141 / 2 - 16;
				@Pc(162) int local162 = arg0 - local141 - 32;
				arg2.anInt336 = (arg6 - arg0) * local156 / local162;
				if (arg7 == 1) {
					this.aBoolean216 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean237 = true;
				}
				this.aBoolean227 = true;
			}
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("85045, " + arg0 + ", " + arg1 + ", " + -31429 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method641() {
		try {
			@Pc(22) int local22;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(91) int local91;
			@Pc(105) int local105;
			@Pc(117) int local117;
			@Pc(176) int local176;
			try {
				this.anInt847 = -1;
				this.aClass26_11.method228();
				this.aClass26_12.method228();
				Class3_Sub3_Sub3_Sub3.method304();
				this.method618();
				this.aClass31_1.method337();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass4Array1[local22].method29();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class15 local77 = new Class15(104, this.aByteArrayArrayArray8, 214, 104, this.anIntArrayArrayArray8);
				local43 = this.aByteArrayArray5.length;
				this.aClass3_Sub3_Sub4_6.method457(44);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean201) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray236[local91] >> 8) * 64 - this.anInt1003;
						local117 = (this.anIntArray236[local91] & 0xFF) * 64 - this.anInt1004;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method147(local117, (this.anInt852 - 6) * 8, local105, this.aClass4Array1, local122, (this.anInt851 - 6) * 8);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray236[local105] >> 8) * 64 - this.anInt1003;
						local176 = (this.anIntArray236[local105] & 0xFF) * 64 - this.anInt1004;
						@Pc(181) byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt852 < 800) {
							local77.method145(64, local176, local117, 64);
						}
					}
					this.aClass3_Sub3_Sub4_6.method457(44);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray6[local117];
						if (local122 != null) {
							local226 = (this.anIntArray236[local117] >> 8) * 64 - this.anInt1003;
							local238 = (this.anIntArray236[local117] & 0xFF) * 64 - this.anInt1004;
							local77.method148(this.aClass31_1, local238, this.aClass4Array1, local226, local122);
						}
					}
				}
				if (this.aBoolean201) {
					local91 = 0;
					label254: while (true) {
						@Pc(293) int local293;
						@Pc(299) int local299;
						@Pc(305) int local305;
						@Pc(315) int local315;
						@Pc(317) int local317;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method145(8, local117 * 8, local105 * 8, 8);
									}
								}
							}
							this.aClass3_Sub3_Sub4_6.method457(44);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label254;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local226 = 0; local226 < 13; local226++) {
										local238 = this.anIntArrayArrayArray7[local117][local176][local226];
										if (local238 != -1) {
											local293 = local238 >> 24 & 0x3;
											local299 = local238 >> 1 & 0x3;
											local305 = local238 >> 14 & 0x3FF;
											local315 = local238 >> 3 & 0x7FF;
											local317 = (local305 / 8 << 8) + local315 / 8;
											for (@Pc(496) int local496 = 0; local496 < this.anIntArray236.length; local496++) {
												if (this.anIntArray236[local496] == local317 && this.aByteArrayArray6[local496] != null) {
													local77.method129(local299, (local305 & 0x7) * 8, local226 * 8, local117, this.aClass4Array1, (byte) 9, local176 * 8, (local315 & 0x7) * 8, this.aByteArrayArray6[local496], local293, this.aClass31_1);
													break;
												}
											}
										}
									}
								}
								local117++;
							}
						}
						for (local105 = 0; local105 < 13; local105++) {
							for (local117 = 0; local117 < 13; local117++) {
								@Pc(269) boolean local269 = false;
								local226 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local226 != -1) {
									local238 = local226 >> 24 & 0x3;
									local293 = local226 >> 1 & 0x3;
									local299 = local226 >> 14 & 0x3FF;
									local305 = local226 >> 3 & 0x7FF;
									local315 = (local299 / 8 << 8) + local305 / 8;
									for (local317 = 0; local317 < this.anIntArray236.length; local317++) {
										if (this.anIntArray236[local317] == local315 && this.aByteArrayArray5[local317] != null) {
											local77.method149(local238, (local305 & 0x7) * 8, (local299 & 0x7) * 8, local91, local105 * 8, local293, this.aByteArrayArray5[local317], local117 * 8, this.aClass4Array1);
											local269 = true;
											break;
										}
									}
								}
								if (!local269) {
									local77.method146(local117 * 8, local105 * 8, local91);
								}
							}
						}
						local91++;
					}
				}
				this.aClass3_Sub3_Sub4_6.method457(44);
				local77.method144(this.aClass4Array1, this.aClass31_1);
				if (this.aClass17_17 != null) {
					this.aClass17_17.method154();
					Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
				}
				this.aClass3_Sub3_Sub4_6.method457(44);
				local91 = Class15.anInt244;
				if (local91 > this.anInt1056) {
					local91 = this.anInt1056;
				}
				if (local91 < this.anInt1056 - 1) {
					local91 = this.anInt1056 - 1;
				}
				if (aBoolean226) {
					this.aClass31_1.method338(Class15.anInt244);
				} else {
					this.aClass31_1.method338(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method653(local105, local117);
					}
				}
				this.method713(this.aBoolean210);
			} catch (@Pc(646) Exception local646) {
			}
			Class13.aClass25_3.method220();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass3_Sub3_Sub4_6.method457(56);
				this.aClass3_Sub3_Sub4_6.method462(1057001181);
			}
			if (aBoolean226 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass6_Sub1_1.method175(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass6_Sub1_1.method169(local35);
					if ((local39 & 0x79) == 0) {
						Class3_Sub3_Sub2_Sub3.method79(local35);
					}
				}
			}
			System.gc();
			Class3_Sub3_Sub3_Sub3.method305();
			this.aClass6_Sub1_1.method167(564);
			local22 = (this.anInt851 - 6) / 8 - 1;
			local35 = (this.anInt851 + 6) / 8 + 1;
			local39 = (this.anInt852 - 6) / 8 - 1;
			local43 = (this.anInt852 + 6) / 8 + 1;
			if (this.aBoolean207) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass6_Sub1_1.method159(local91, local105, 0);
						if (local117 != -1) {
							this.aClass6_Sub1_1.method162(3, local117);
						}
						local176 = this.aClass6_Sub1_1.method159(local91, local105, 1);
						if (local176 != -1) {
							this.aClass6_Sub1_1.method162(3, local176);
						}
					}
				}
			}
		} catch (@Pc(813) RuntimeException local813) {
			signlink.reporterror("44107, " + false + ", " + local813.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
	private boolean method642(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			this.anInt943 += 0;
			@Pc(17) int local17;
			for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
				for (local17 = 0; local17 < 104; local17++) {
					this.anIntArrayArray25[local13][local17] = 0;
					this.anIntArrayArray23[local13][local17] = 99999999;
				}
			}
			local17 = arg7;
			@Pc(45) int local45 = arg4;
			this.anIntArrayArray25[arg7][arg4] = 99;
			this.anIntArrayArray23[arg7][arg4] = 0;
			@Pc(61) byte local61 = 0;
			@Pc(63) int local63 = 0;
			this.anIntArray274[0] = arg7;
			@Pc(72) int local72 = local61 + 1;
			this.anIntArray275[0] = arg4;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray274.length;
			@Pc(87) int[][] local87 = this.aClass4Array1[this.anInt1056].anIntArrayArray1;
			@Pc(198) int local198;
			while (local63 != local72) {
				local17 = this.anIntArray274[local63];
				local45 = this.anIntArray275[local63];
				local63 = (local63 + 1) % local80;
				if (local17 == arg5 && local45 == arg8) {
					local76 = true;
					break;
				}
				if (arg0 != 0) {
					if ((arg0 < 5 || arg0 == 10) && this.aClass4Array1[this.anInt1056].method38(arg5, arg8, arg0 - 1, local17, local45, arg3)) {
						local76 = true;
						break;
					}
					if (arg0 < 10 && this.aClass4Array1[this.anInt1056].method39(arg3, arg0 - 1, local17, arg5, arg8, local45)) {
						local76 = true;
						break;
					}
				}
				if (arg9 != 0 && arg2 != 0 && this.aClass4Array1[this.anInt1056].method40(arg10, local45, arg5, arg2, arg9, local17, arg8)) {
					local76 = true;
					break;
				}
				local198 = this.anIntArrayArray23[local17][local45] + 1;
				if (local17 > 0 && this.anIntArrayArray25[local17 - 1][local45] == 0 && (local87[local17 - 1][local45] & 0x1280108) == 0) {
					this.anIntArray274[local72] = local17 - 1;
					this.anIntArray275[local72] = local45;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local17 - 1][local45] = 2;
					this.anIntArrayArray23[local17 - 1][local45] = local198;
				}
				if (local17 < 103 && this.anIntArrayArray25[local17 + 1][local45] == 0 && (local87[local17 + 1][local45] & 0x1280180) == 0) {
					this.anIntArray274[local72] = local17 + 1;
					this.anIntArray275[local72] = local45;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local17 + 1][local45] = 8;
					this.anIntArrayArray23[local17 + 1][local45] = local198;
				}
				if (local45 > 0 && this.anIntArrayArray25[local17][local45 - 1] == 0 && (local87[local17][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local72] = local17;
					this.anIntArray275[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local17][local45 - 1] = 1;
					this.anIntArrayArray23[local17][local45 - 1] = local198;
				}
				if (local45 < 103 && this.anIntArrayArray25[local17][local45 + 1] == 0 && (local87[local17][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local72] = local17;
					this.anIntArray275[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local17][local45 + 1] = 4;
					this.anIntArrayArray23[local17][local45 + 1] = local198;
				}
				if (local17 > 0 && local45 > 0 && this.anIntArrayArray25[local17 - 1][local45 - 1] == 0 && (local87[local17 - 1][local45 - 1] & 0x128010E) == 0 && (local87[local17 - 1][local45] & 0x1280108) == 0 && (local87[local17][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local72] = local17 - 1;
					this.anIntArray275[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local17 - 1][local45 - 1] = 3;
					this.anIntArrayArray23[local17 - 1][local45 - 1] = local198;
				}
				if (local17 < 103 && local45 > 0 && this.anIntArrayArray25[local17 + 1][local45 - 1] == 0 && (local87[local17 + 1][local45 - 1] & 0x1280183) == 0 && (local87[local17 + 1][local45] & 0x1280180) == 0 && (local87[local17][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local72] = local17 + 1;
					this.anIntArray275[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local17 + 1][local45 - 1] = 9;
					this.anIntArrayArray23[local17 + 1][local45 - 1] = local198;
				}
				if (local17 > 0 && local45 < 103 && this.anIntArrayArray25[local17 - 1][local45 + 1] == 0 && (local87[local17 - 1][local45 + 1] & 0x1280138) == 0 && (local87[local17 - 1][local45] & 0x1280108) == 0 && (local87[local17][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local72] = local17 - 1;
					this.anIntArray275[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local17 - 1][local45 + 1] = 6;
					this.anIntArrayArray23[local17 - 1][local45 + 1] = local198;
				}
				if (local17 < 103 && local45 < 103 && this.anIntArrayArray25[local17 + 1][local45 + 1] == 0 && (local87[local17 + 1][local45 + 1] & 0x12801E0) == 0 && (local87[local17 + 1][local45] & 0x1280180) == 0 && (local87[local17][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local72] = local17 + 1;
					this.anIntArray275[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local17 + 1][local45 + 1] = 12;
					this.anIntArrayArray23[local17 + 1][local45 + 1] = local198;
				}
			}
			this.anInt1065 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local76) {
				if (!arg1) {
					return false;
				}
				local198 = 1000;
				local814 = 100;
				for (local820 = arg5 - 10; local820 <= arg5 + 10; local820++) {
					for (local826 = arg8 - 10; local826 <= arg8 + 10; local826++) {
						if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray23[local820][local826] < 100) {
							@Pc(848) int local848 = 0;
							if (local820 < arg5) {
								local848 = arg5 - local820;
							} else if (local820 > arg5 + arg9 - 1) {
								local848 = local820 + 1 - arg5 - arg9;
							}
							@Pc(874) int local874 = 0;
							if (local826 < arg8) {
								local874 = arg8 - local826;
							} else if (local826 > arg8 + arg2 - 1) {
								local874 = local826 + 1 - arg8 - arg2;
							}
							@Pc(906) int local906 = local848 * local848 + local874 * local874;
							if (local906 < local198 || local906 == local198 && this.anIntArrayArray23[local820][local826] < local814) {
								local198 = local906;
								local814 = this.anIntArrayArray23[local820][local826];
								local17 = local820;
								local45 = local826;
							}
						}
					}
				}
				if (local198 == 1000) {
					return false;
				}
				if (local17 == arg7 && local45 == arg4) {
					return false;
				}
				this.anInt1065 = 1;
			}
			@Pc(967) byte local967 = 0;
			this.anIntArray274[0] = local17;
			local63 = local967 + 1;
			this.anIntArray275[0] = local45;
			local198 = local814 = this.anIntArrayArray25[local17][local45];
			while (local17 != arg7 || local45 != arg4) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray274[local63] = local17;
					this.anIntArray275[local63++] = local45;
				}
				if ((local198 & 0x2) != 0) {
					local17++;
				} else if ((local198 & 0x8) != 0) {
					local17--;
				}
				if ((local198 & 0x1) != 0) {
					local45++;
				} else if ((local198 & 0x4) != 0) {
					local45--;
				}
				local198 = this.anIntArrayArray25[local17][local45];
			}
			if (local63 > 0) {
				local80 = local63;
				if (local63 > 25) {
					local80 = 25;
				}
				local63--;
				@Pc(1057) int local1057 = this.anIntArray274[local63];
				local820 = this.anIntArray275[local63];
				if (arg6 == 0) {
					this.aClass3_Sub3_Sub4_6.method457(72);
					this.aClass3_Sub3_Sub4_6.method458(local80 + local80 + 3);
				}
				if (arg6 == 1) {
					this.aClass3_Sub3_Sub4_6.method457(79);
					this.aClass3_Sub3_Sub4_6.method458(local80 + local80 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass3_Sub3_Sub4_6.method457(4);
					this.aClass3_Sub3_Sub4_6.method458(local80 + local80 + 3);
				}
				this.anInt988 = this.anIntArray274[0];
				this.anInt989 = this.anIntArray275[0];
				for (local826 = 1; local826 < local80; local826++) {
					local63--;
					this.aClass3_Sub3_Sub4_6.method458(this.anIntArray274[local63] - local1057);
					this.aClass3_Sub3_Sub4_6.method458(this.anIntArray275[local63] - local820);
				}
				this.aClass3_Sub3_Sub4_6.method458(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass3_Sub3_Sub4_6.method459(local1057 + this.anInt1003);
				this.aClass3_Sub3_Sub4_6.method492(local820 + this.anInt1004);
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1187) RuntimeException local1187) {
			signlink.reporterror("16079, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method643() {
		try {
			if (this.anInt923 > 1) {
				this.anInt923--;
			}
			if (this.anInt947 > 0) {
				this.anInt947--;
			}
			for (@Pc(35) int local35 = 0; local35 < 5 && this.method650(); local35++) {
			}
			if (this.aBoolean241) {
				@Pc(54) Object local54 = this.aClass33_1.anObject1;
				@Pc(79) int local79;
				@Pc(81) int local81;
				@Pc(83) int local83;
				@Pc(116) int local116;
				synchronized (this.aClass33_1.anObject1) {
					if (!aBoolean231) {
						this.aClass33_1.anInt617 = 0;
					} else if (super.anInt841 != 0 || this.aClass33_1.anInt617 >= 40) {
						this.aClass3_Sub3_Sub4_6.method457(57);
						this.aClass3_Sub3_Sub4_6.method458(0);
						local79 = this.aClass3_Sub3_Sub4_6.anInt738;
						local81 = 0;
						@Pc(99) int local99;
						for (local83 = 0; local83 < this.aClass33_1.anInt617 && local79 - this.aClass3_Sub3_Sub4_6.anInt738 < 240; local83++) {
							local81++;
							local99 = this.aClass33_1.anIntArray176[local83];
							if (local99 < 0) {
								local99 = 0;
							} else if (local99 > 502) {
								local99 = 502;
							}
							local116 = this.aClass33_1.anIntArray175[local83];
							if (local116 < 0) {
								local116 = 0;
							} else if (local116 > 764) {
								local116 = 764;
							}
							@Pc(133) int local133 = local99 * 765 + local116;
							if (this.aClass33_1.anIntArray176[local83] == -1 && this.aClass33_1.anIntArray175[local83] == -1) {
								local116 = -1;
								local99 = -1;
								local133 = 524287;
							}
							if (local116 != this.anInt868 || local99 != this.anInt869) {
								@Pc(178) int local178 = local116 - this.anInt868;
								this.anInt868 = local116;
								@Pc(186) int local186 = local99 - this.anInt869;
								this.anInt869 = local99;
								if (this.anInt1009 < 8 && local178 >= -32 && local178 <= 31 && local186 >= -32 && local186 <= 31) {
									local178 += 32;
									local186 += 32;
									this.aClass3_Sub3_Sub4_6.method459((this.anInt1009 << 12) + (local178 << 6) + local186);
									this.anInt1009 = 0;
								} else if (this.anInt1009 < 8) {
									this.aClass3_Sub3_Sub4_6.method461((this.anInt1009 << 19) + local133 + 8388608);
									this.anInt1009 = 0;
								} else {
									this.aClass3_Sub3_Sub4_6.method462((this.anInt1009 << 19) + local133 - 1073741824);
									this.anInt1009 = 0;
								}
							} else if (this.anInt1009 < 2047) {
								this.anInt1009++;
							}
						}
						this.aClass3_Sub3_Sub4_6.method467(this.aClass3_Sub3_Sub4_6.anInt738 - local79, 371);
						if (local81 >= this.aClass33_1.anInt617) {
							this.aClass33_1.anInt617 = 0;
						} else {
							this.aClass33_1.anInt617 -= local81;
							for (local99 = 0; local99 < this.aClass33_1.anInt617; local99++) {
								this.aClass33_1.anIntArray175[local99] = this.aClass33_1.anIntArray175[local99 + local81];
								this.aClass33_1.anIntArray176[local99] = this.aClass33_1.anIntArray176[local99 + local81];
							}
						}
					}
				}
				if (super.anInt841 != 0) {
					@Pc(349) long local349 = (super.aLong28 - this.aLong30) / 50L;
					if (local349 > 4095L) {
						local349 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local79 = super.anInt843;
					if (local79 < 0) {
						local79 = 0;
					} else if (local79 > 502) {
						local79 = 502;
					}
					local81 = super.anInt842;
					if (local81 < 0) {
						local81 = 0;
					} else if (local81 > 764) {
						local81 = 764;
					}
					local83 = local79 * 765 + local81;
					@Pc(395) byte local395 = 0;
					if (super.anInt841 == 2) {
						local395 = 1;
					}
					local116 = (int) local349;
					this.aClass3_Sub3_Sub4_6.method457(184);
					this.aClass3_Sub3_Sub4_6.method500((local116 << 20) + (local395 << 19) + local83);
				}
				if (this.anInt884 > 0) {
					this.anInt884--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean205 = true;
				}
				if (this.aBoolean205 && this.anInt884 <= 0) {
					this.anInt884 = 20;
					this.aBoolean205 = false;
					this.aClass3_Sub3_Sub4_6.method457(136);
					this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt1020);
					this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt1019);
				}
				if (super.aBoolean199 && !this.aBoolean222) {
					this.aBoolean222 = true;
					this.aClass3_Sub3_Sub4_6.method457(251);
					this.aClass3_Sub3_Sub4_6.method458(1);
				}
				if (!super.aBoolean199 && this.aBoolean222) {
					this.aBoolean222 = false;
					this.aClass3_Sub3_Sub4_6.method457(251);
					this.aClass3_Sub3_Sub4_6.method458(0);
				}
				this.method624();
				this.method612();
				this.method610();
				this.anInt945++;
				if (this.anInt945 > 750) {
					this.method606();
				}
				this.method630();
				this.method664();
				this.method681();
				this.anInt1008++;
				if (this.anInt1041 != 0) {
					this.anInt1040 += 20;
					if (this.anInt1040 >= 400) {
						this.anInt1041 = 0;
					}
				}
				if (this.anInt965 != 0) {
					this.anInt962++;
					if (this.anInt962 >= 15) {
						if (this.anInt965 == 2) {
							this.aBoolean216 = true;
						}
						if (this.anInt965 == 3) {
							this.aBoolean237 = true;
						}
						this.anInt965 = 0;
					}
				}
				if (this.anInt1000 != 0) {
					this.anInt905++;
					if (super.anInt836 > this.anInt1001 + 5 || super.anInt836 < this.anInt1001 - 5 || super.anInt837 > this.anInt1002 + 5 || super.anInt837 < this.anInt1002 - 5) {
						this.aBoolean203 = true;
					}
					if (super.anInt835 == 0) {
						if (this.anInt1000 == 2) {
							this.aBoolean216 = true;
						}
						if (this.anInt1000 == 3) {
							this.aBoolean237 = true;
						}
						this.anInt1000 = 0;
						if (this.aBoolean203 && this.anInt905 >= 5) {
							this.anInt984 = -1;
							this.method663(this.anInt1055);
							if (this.anInt984 == this.anInt998 && this.anInt983 != this.anInt999) {
								@Pc(700) Class23 local700 = Class23.method208(this.anInt998);
								@Pc(702) byte local702 = 0;
								if (this.anInt974 == 1 && local700.anInt334 == 206) {
									local702 = 1;
								}
								if (local700.anIntArray98[this.anInt983] <= 0) {
									local702 = 0;
								}
								if (local700.aBoolean84) {
									local79 = this.anInt999;
									local81 = this.anInt983;
									local700.anIntArray98[local81] = local700.anIntArray98[local79];
									local700.anIntArray100[local81] = local700.anIntArray100[local79];
									local700.anIntArray98[local79] = -1;
									local700.anIntArray100[local79] = 0;
								} else if (local702 == 1) {
									local79 = this.anInt999;
									local81 = this.anInt983;
									while (local79 != local81) {
										if (local79 > local81) {
											local700.method211(local79 - 1, 797, local79);
											local79--;
										} else if (local79 < local81) {
											local700.method211(local79 + 1, 797, local79);
											local79++;
										}
									}
								} else {
									local700.method211(this.anInt983, 797, this.anInt999);
								}
								this.aClass3_Sub3_Sub4_6.method457(194);
								this.aClass3_Sub3_Sub4_6.method459(this.anInt999);
								this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt998);
								this.aClass3_Sub3_Sub4_6.method492(this.anInt983);
								this.aClass3_Sub3_Sub4_6.method458(local702);
							}
						} else if ((this.anInt994 == 1 || this.method694(this.anInt1071 - 1)) && this.anInt1071 > 2) {
							this.method674();
						} else if (this.anInt1071 > 0) {
							this.method718(this.anInt1071 - 1);
						}
						this.anInt962 = 10;
						super.anInt841 = 0;
					}
				}
				@Pc(875) int local875;
				@Pc(877) int local877;
				if (Class31.anInt596 != -1) {
					local875 = Class31.anInt596;
					local877 = Class31.anInt597;
					@Pc(898) boolean local898 = this.method642(0, true, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local875, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local877, 0, 0);
					Class31.anInt596 = -1;
					if (local898) {
						this.anInt1038 = super.anInt842;
						this.anInt1039 = super.anInt843;
						this.anInt1041 = 1;
						this.anInt1040 = 0;
					}
				}
				if (super.anInt841 == 1 && this.aString31 != null) {
					this.aString31 = null;
					this.aBoolean237 = true;
					super.anInt841 = 0;
				}
				this.method715();
				if (this.anInt1017 == -1) {
					this.method704(247);
					this.method617();
					this.method700();
				}
				if (super.anInt835 == 1 || super.anInt841 == 1) {
					this.anInt1029++;
				}
				if (this.anInt872 == 0 && this.anInt906 == 0 && this.anInt976 == 0) {
					if (this.anInt1028 > 0) {
						this.anInt1028--;
					}
				} else if (this.anInt1028 < 100) {
					this.anInt1028++;
					if (this.anInt1028 == 100) {
						if (this.anInt872 != 0) {
							this.aBoolean237 = true;
						}
						if (this.anInt906 != 0) {
							this.aBoolean216 = true;
						}
					}
				}
				if (this.anInt1054 == 2) {
					this.method673();
				}
				if (this.anInt1054 == 2 && this.aBoolean242) {
					this.method632();
				}
				for (local875 = 0; local875 < 5; local875++) {
					@Pc(1034) int local1034 = this.anIntArray261[local875]++;
				}
				this.method678();
				super.anInt834++;
				if (super.anInt834 > 4500) {
					this.anInt947 = 250;
					super.anInt834 -= 500;
					this.aClass3_Sub3_Sub4_6.method457(84);
				}
				this.anInt977++;
				if (this.anInt977 > 500) {
					this.anInt977 = 0;
					local877 = (int) (Math.random() * 8.0D);
					if ((local877 & 0x1) == 1) {
						this.anInt1072 += this.anInt1073;
					}
					if ((local877 & 0x2) == 2) {
						this.anInt1063 += this.anInt1064;
					}
					if ((local877 & 0x4) == 4) {
						this.anInt939 += this.anInt940;
					}
				}
				if (this.anInt1072 < -50) {
					this.anInt1073 = 2;
				}
				if (this.anInt1072 > 50) {
					this.anInt1073 = -2;
				}
				if (this.anInt1063 < -55) {
					this.anInt1064 = 2;
				}
				if (this.anInt1063 > 55) {
					this.anInt1064 = -2;
				}
				if (this.anInt939 < -40) {
					this.anInt940 = 1;
				}
				if (this.anInt939 > 40) {
					this.anInt940 = -1;
				}
				this.anInt1070++;
				if (this.anInt1070 > 500) {
					this.anInt1070 = 0;
					local877 = (int) (Math.random() * 8.0D);
					if ((local877 & 0x1) == 1) {
						this.anInt892 += this.anInt893;
					}
					if ((local877 & 0x2) == 2) {
						this.anInt1026 += this.anInt1027;
					}
				}
				if (this.anInt892 < -60) {
					this.anInt893 = 2;
				}
				if (this.anInt892 > 60) {
					this.anInt893 = -2;
				}
				if (this.anInt1026 < -20) {
					this.anInt1027 = 1;
				}
				if (this.anInt1026 > 10) {
					this.anInt1027 = -1;
				}
				this.anInt946++;
				if (this.anInt946 > 50) {
					this.aClass3_Sub3_Sub4_6.method457(44);
				}
				try {
					if (this.aClass21_1 != null && this.aClass3_Sub3_Sub4_6.anInt738 > 0) {
						this.aClass21_1.method190(this.aClass3_Sub3_Sub4_6.anInt738, this.aClass3_Sub3_Sub4_6.aByteArray20);
						this.aClass3_Sub3_Sub4_6.anInt738 = 0;
						this.anInt946 = 0;
					}
				} catch (@Pc(1276) IOException local1276) {
					this.method606();
				} catch (@Pc(1281) Exception local1281) {
					this.method711();
				}
			}
		} catch (@Pc(1286) RuntimeException local1286) {
			signlink.reporterror("13023, " + 4 + ", " + local1286.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BIWICTTN;)V")
	private void method644(@OriginalArg(1) Class3_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt90 == 0) {
				local1 = this.aClass31_1.method363(arg0.anInt89, arg0.anInt91, arg0.anInt92);
			}
			if (arg0.anInt90 == 1) {
				local1 = this.aClass31_1.method364(arg0.anInt89, arg0.anInt92, arg0.anInt91);
			}
			if (arg0.anInt90 == 2) {
				local1 = this.aClass31_1.method365(arg0.anInt89, arg0.anInt91, arg0.anInt92);
			}
			if (arg0.anInt90 == 3) {
				local1 = this.aClass31_1.method366(arg0.anInt89, arg0.anInt91, arg0.anInt92);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass31_1.method367(arg0.anInt89, arg0.anInt91, arg0.anInt92, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt84 = local3;
			arg0.anInt86 = local5;
			arg0.anInt85 = local7;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("16719, " + -840 + ", " + arg0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!MRUJPFPS;IIII)V")
	private void method645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2.anInt355 == 0 && arg2.anIntArray104 != null && !arg2.aBoolean87 && (arg4 >= arg0 && arg3 >= arg6 && arg4 <= arg0 + arg2.anInt335 && arg3 <= arg6 + arg2.anInt348)) {
				@Pc(34) int local34 = arg2.anIntArray104.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg2.anIntArray102[local36] + arg0;
					@Pc(54) int local54 = arg2.anIntArray103[local36] + arg6 - arg5;
					@Pc(60) Class23 local60 = Class23.method208(arg2.anIntArray104[local36]);
					@Pc(65) int local65 = local45 + local60.anInt367;
					@Pc(70) int local70 = local54 + local60.anInt359;
					if ((local60.anInt360 >= 0 || local60.anInt368 != 0) && arg4 >= local65 && arg3 >= local70 && arg4 < local65 + local60.anInt335 && arg3 < local70 + local60.anInt348) {
						if (local60.anInt360 >= 0) {
							this.anInt925 = local60.anInt360;
						} else {
							this.anInt925 = local60.anInt363;
						}
					}
					if (local60.anInt355 == 8 && arg4 >= local65 && arg3 >= local70 && arg4 < local65 + local60.anInt335 && arg3 < local70 + local60.anInt348) {
						this.anInt1068 = local60.anInt363;
					}
					if (local60.anInt355 == 0) {
						this.method645(local65, arg1, local60, arg3, arg4, local60.anInt336, local70);
						if (local60.anInt370 > local60.anInt348) {
							this.method640(local60.anInt348, local65 + local60.anInt335, local60, arg4, arg3, local70, local60.anInt370, arg1);
						}
					} else {
						if (local60.anInt369 == 1 && arg4 >= local65 && arg3 >= local70 && arg4 < local65 + local60.anInt335 && arg3 < local70 + local60.anInt348) {
							@Pc(194) boolean local194 = false;
							if (local60.anInt334 != 0) {
								local194 = this.method638(local60);
							}
							if (!local194) {
								this.aStringArray9[this.anInt1071] = local60.aString6;
								this.anIntArray221[this.anInt1071] = 120;
								this.anIntArray220[this.anInt1071] = local60.anInt363;
								this.anInt1071++;
							}
						}
						if (local60.anInt369 == 2 && this.anInt957 == 0 && arg4 >= local65 && arg3 >= local70 && arg4 < local65 + local60.anInt335 && arg3 < local70 + local60.anInt348) {
							@Pc(258) String local258 = local60.aString7;
							if (local258.indexOf(" ") != -1) {
								local258 = local258.substring(0, local258.indexOf(" "));
							}
							this.aStringArray9[this.anInt1071] = local258 + " @gre@" + local60.aString9;
							this.anIntArray221[this.anInt1071] = 457;
							this.anIntArray220[this.anInt1071] = local60.anInt363;
							this.anInt1071++;
						}
						if (local60.anInt369 == 3 && arg4 >= local65 && arg3 >= local70 && arg4 < local65 + local60.anInt335 && arg3 < local70 + local60.anInt348) {
							this.aStringArray9[this.anInt1071] = "Close";
							if (arg1 == 3) {
								this.anIntArray221[this.anInt1071] = 431;
							} else {
								this.anIntArray221[this.anInt1071] = 542;
							}
							this.anIntArray220[this.anInt1071] = local60.anInt363;
							this.anInt1071++;
						}
						if (local60.anInt369 == 4 && arg4 >= local65 && arg3 >= local70 && arg4 < local65 + local60.anInt335 && arg3 < local70 + local60.anInt348) {
							this.aStringArray9[this.anInt1071] = local60.aString6;
							this.anIntArray221[this.anInt1071] = 878;
							this.anIntArray220[this.anInt1071] = local60.anInt363;
							this.anInt1071++;
						}
						if (local60.anInt369 == 5 && arg4 >= local65 && arg3 >= local70 && arg4 < local65 + local60.anInt335 && arg3 < local70 + local60.anInt348) {
							this.aStringArray9[this.anInt1071] = local60.aString6;
							this.anIntArray221[this.anInt1071] = 917;
							this.anIntArray220[this.anInt1071] = local60.anInt363;
							this.anInt1071++;
						}
						if (local60.anInt369 == 6 && !this.aBoolean232 && arg4 >= local65 && arg3 >= local70 && arg4 < local65 + local60.anInt335 && arg3 < local70 + local60.anInt348) {
							this.aStringArray9[this.anInt1071] = local60.aString6;
							this.anIntArray221[this.anInt1071] = 293;
							this.anIntArray220[this.anInt1071] = local60.anInt363;
							this.anInt1071++;
						}
						if (local60.anInt355 == 2) {
							@Pc(517) int local517 = 0;
							for (@Pc(519) int local519 = 0; local519 < local60.anInt348; local519++) {
								for (@Pc(523) int local523 = 0; local523 < local60.anInt335; local523++) {
									@Pc(534) int local534 = local65 + local523 * (local60.anInt358 + 32);
									@Pc(543) int local543 = local70 + local519 * (local60.anInt352 + 32);
									if (local517 < 20) {
										local534 += local60.anIntArray106[local517];
										local543 += local60.anIntArray105[local517];
									}
									if (arg4 >= local534 && arg3 >= local543 && arg4 < local534 + 32 && arg3 < local543 + 32) {
										this.anInt983 = local517;
										this.anInt984 = local60.anInt363;
										if (local60.anIntArray98[local517] > 0) {
											@Pc(596) Class1 local596 = Class1.method7(local60.anIntArray98[local517] - 1);
											if (this.anInt910 == 1 && local60.aBoolean86) {
												if (local60.anInt363 != this.anInt912 || local517 != this.anInt911) {
													this.aStringArray9[this.anInt1071] = "Use " + this.aString20 + " with @lre@" + local596.aString1;
													this.anIntArray221[this.anInt1071] = 576;
													this.anIntArray222[this.anInt1071] = local596.anInt7;
													this.anIntArray219[this.anInt1071] = local517;
													this.anIntArray220[this.anInt1071] = local60.anInt363;
													this.anInt1071++;
												}
											} else if (this.anInt957 != 1 || !local60.aBoolean86) {
												@Pc(733) int local733;
												if (local60.aBoolean86) {
													for (local733 = 4; local733 >= 3; local733--) {
														if (local596.aStringArray2 != null && local596.aStringArray2[local733] != null) {
															this.aStringArray9[this.anInt1071] = local596.aStringArray2[local733] + " @lre@" + local596.aString1;
															if (local733 == 3) {
																this.anIntArray221[this.anInt1071] = 501;
															}
															if (local733 == 4) {
																this.anIntArray221[this.anInt1071] = 837;
															}
															this.anIntArray222[this.anInt1071] = local596.anInt7;
															this.anIntArray219[this.anInt1071] = local517;
															this.anIntArray220[this.anInt1071] = local60.anInt363;
															this.anInt1071++;
														} else if (local733 == 4) {
															this.aStringArray9[this.anInt1071] = "Drop @lre@" + local596.aString1;
															this.anIntArray221[this.anInt1071] = 837;
															this.anIntArray222[this.anInt1071] = local596.anInt7;
															this.anIntArray219[this.anInt1071] = local517;
															this.anIntArray220[this.anInt1071] = local60.anInt363;
															this.anInt1071++;
														}
													}
												}
												if (local60.aBoolean92) {
													this.aStringArray9[this.anInt1071] = "Use @lre@" + local596.aString1;
													this.anIntArray221[this.anInt1071] = 888;
													this.anIntArray222[this.anInt1071] = local596.anInt7;
													this.anIntArray219[this.anInt1071] = local517;
													this.anIntArray220[this.anInt1071] = local60.anInt363;
													this.anInt1071++;
												}
												if (local60.aBoolean86 && local596.aStringArray2 != null) {
													for (local733 = 2; local733 >= 0; local733--) {
														if (local596.aStringArray2[local733] != null) {
															this.aStringArray9[this.anInt1071] = local596.aStringArray2[local733] + " @lre@" + local596.aString1;
															if (local733 == 0) {
																this.anIntArray221[this.anInt1071] = 620;
															}
															if (local733 == 1) {
																this.anIntArray221[this.anInt1071] = 5;
															}
															if (local733 == 2) {
																this.anIntArray221[this.anInt1071] = 121;
															}
															this.anIntArray222[this.anInt1071] = local596.anInt7;
															this.anIntArray219[this.anInt1071] = local517;
															this.anIntArray220[this.anInt1071] = local60.anInt363;
															this.anInt1071++;
														}
													}
												}
												if (local60.aStringArray4 != null) {
													for (local733 = 4; local733 >= 0; local733--) {
														if (local60.aStringArray4[local733] != null) {
															this.aStringArray9[this.anInt1071] = local60.aStringArray4[local733] + " @lre@" + local596.aString1;
															if (local733 == 0) {
																this.anIntArray221[this.anInt1071] = 219;
															}
															if (local733 == 1) {
																this.anIntArray221[this.anInt1071] = 915;
															}
															if (local733 == 2) {
																this.anIntArray221[this.anInt1071] = 486;
															}
															if (local733 == 3) {
																this.anIntArray221[this.anInt1071] = 463;
															}
															if (local733 == 4) {
																this.anIntArray221[this.anInt1071] = 343;
															}
															this.anIntArray222[this.anInt1071] = local596.anInt7;
															this.anIntArray219[this.anInt1071] = local517;
															this.anIntArray220[this.anInt1071] = local60.anInt363;
															this.anInt1071++;
														}
													}
												}
												this.aStringArray9[this.anInt1071] = "Examine @lre@" + local596.aString1;
												this.anIntArray221[this.anInt1071] = 1940;
												this.anIntArray222[this.anInt1071] = local596.anInt7;
												this.anIntArray219[this.anInt1071] = local517;
												this.anIntArray220[this.anInt1071] = local60.anInt363;
												this.anInt1071++;
											} else if ((this.anInt959 & 0x10) == 16) {
												this.aStringArray9[this.anInt1071] = this.aString23 + " @lre@" + local596.aString1;
												this.anIntArray221[this.anInt1071] = 974;
												this.anIntArray222[this.anInt1071] = local596.anInt7;
												this.anIntArray219[this.anInt1071] = local517;
												this.anIntArray220[this.anInt1071] = local60.anInt363;
												this.anInt1071++;
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
		} catch (@Pc(1169) RuntimeException local1169) {
			signlink.reporterror("32101, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method646() {
		try {
			@Pc(5) int local5 = this.anInt951;
			@Pc(8) int local8 = this.anInt952;
			@Pc(11) int local11 = this.anInt953;
			@Pc(14) int local14 = this.anInt954;
			Class3_Sub3_Sub3.method552(6116423, this.aByte40, local5, local8, local14, local11);
			Class3_Sub3_Sub3.method552(0, this.aByte40, local5 + 1, local8 + 1, 16, local11 - 2);
			Class3_Sub3_Sub3.method553(local11 - 2, local8 + 18, local14 - 19, local5 + 1, 0);
			this.aClass3_Sub3_Sub3_Sub4_4.method564(6116423, local8 + 14, "Choose Option", local5 + 3);
			@Pc(68) int local68 = super.anInt836;
			@Pc(71) int local71 = super.anInt837;
			if (this.anInt950 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt950 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt950 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt1071; local90++) {
				@Pc(105) int local105 = local8 + (this.anInt1071 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local5 && local68 < local5 + local11 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass3_Sub3_Sub3_Sub4_4.method568((byte) 3, true, this.aStringArray9[local90], local5 + 3, local107, local105);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("93685, " + true + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)Z")
	private boolean method647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass31_1.method367(this.anInt1056, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt934++;
			if (anInt934 > 103) {
				anInt934 = 0;
				this.aClass3_Sub3_Sub4_6.method457(208);
				this.aClass3_Sub3_Sub4_6.method458(55);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(61) Class13 local61 = Class13.method127(local7);
				@Pc(69) int local69;
				@Pc(72) int local72;
				if (local31 == 0 || local31 == 2) {
					local69 = local61.anInt237;
					local72 = local61.anInt233;
				} else {
					local69 = local61.anInt233;
					local72 = local61.anInt237;
				}
				@Pc(83) int local83 = local61.anInt225;
				if (local31 != 0) {
					local83 = (local83 << local31 & 0xF) + (local83 >> 4 - local31);
				}
				this.method642(0, true, local72, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], arg1, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], arg2, local69, local83);
			} else {
				this.method642(local25 + 1, true, 0, local31, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], arg1, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], arg2, 0, 0);
			}
			this.anInt1038 = super.anInt842;
			this.anInt1039 = super.anInt843;
			this.anInt1041 = 2;
			this.anInt1040 = 0;
			if (this.aByte33 != -40) {
				this.anInt1067 = this.aClass41_2.method511();
			}
			return true;
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("21624, " + arg0 + ", " + arg1 + ", " + -40 + ", " + arg2 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method648(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt941 != 5) {
				this.aClass3_Sub3_Sub4_6.method458(204);
			}
			if (aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 >> 7 == this.anInt988 && aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 >> 7 == this.anInt989) {
				this.anInt988 = 0;
			}
			@Pc(29) int local29 = this.anInt969;
			if (arg0) {
				local29 = 1;
			}
			for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
				@Pc(41) Class3_Sub3_Sub2_Sub1_Sub2 local41;
				@Pc(46) int local46;
				if (arg0) {
					local41 = aClass3_Sub3_Sub2_Sub1_Sub2_1;
					local46 = this.anInt968 << 14;
				} else {
					local41 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anIntArray244[local35]];
					local46 = this.anIntArray244[local35] << 14;
				}
				if (local41 != null && local41.method400()) {
					local41.aBoolean156 = false;
					if ((aBoolean226 && this.anInt969 > 50 || this.anInt969 > 200) && !arg0 && local41.anInt644 == local41.anInt689) {
						local41.aBoolean156 = true;
					}
					@Pc(97) int local97 = local41.anInt685 >> 7;
					@Pc(102) int local102 = local41.anInt686 >> 7;
					if (local97 >= 0 && local97 < 104 && local102 >= 0 && local102 < 104) {
						if (local41.aClass3_Sub3_Sub2_Sub3_2 == null || anInt1032 < local41.anInt699 || anInt1032 >= local41.anInt700) {
							if ((local41.anInt685 & 0x7F) == 64 && (local41.anInt686 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local97][local102] == this.anInt936) {
									continue;
								}
								this.anIntArrayArray22[local97][local102] = this.anInt936;
							}
							local41.anInt704 = this.method695(this.anInt1056, local41.anInt685, local41.anInt686);
							this.aClass31_1.method348(this.anInt1056, local46, 60, local41, local41.anInt686, local41.anInt685, local41.anInt687, local41.anInt704, local41.aBoolean154);
						} else {
							local41.aBoolean156 = false;
							local41.anInt704 = this.method695(this.anInt1056, local41.anInt685, local41.anInt686);
							this.aClass31_1.method349(local41.anInt693, local41.anInt695, local41, local46, local41.anInt692, local41.anInt694, local41.anInt687, local41.anInt686, local41.anInt704, local41.anInt685, this.anInt1056);
						}
					}
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("72090, " + arg0 + ", " + 5 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method649(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString21 = "";
				this.aString22 = "Connecting to server...";
				this.method697((byte) 8, true);
			}
			this.aClass21_1 = new Class21(this.method686(anInt933 + 43594), 2, this);
			@Pc(30) long local30 = Class48.method535(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass3_Sub3_Sub4_6.anInt738 = 0;
			this.aClass3_Sub3_Sub4_6.method458(14);
			this.aClass3_Sub3_Sub4_6.method458(local37);
			this.aClass21_1.method190(2, this.aClass3_Sub3_Sub4_6.aByteArray20);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass21_1.method187();
			}
			@Pc(74) int local74 = this.aClass21_1.method187();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass21_1.method189(this.aClass3_Sub3_Sub4_9.aByteArray20, 0, 8);
				this.aClass3_Sub3_Sub4_9.anInt738 = 0;
				this.aLong29 = this.aClass3_Sub3_Sub4_9.method474();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass3_Sub3_Sub4_6.anInt738 = 0;
				this.aClass3_Sub3_Sub4_6.method458(10);
				this.aClass3_Sub3_Sub4_6.method462(local99[0]);
				this.aClass3_Sub3_Sub4_6.method462(local99[1]);
				this.aClass3_Sub3_Sub4_6.method462(local99[2]);
				this.aClass3_Sub3_Sub4_6.method462(local99[3]);
				this.aClass3_Sub3_Sub4_6.method462(signlink.anInt1075);
				this.aClass3_Sub3_Sub4_6.method465(arg0);
				this.aClass3_Sub3_Sub4_6.method465(arg1);
				this.aClass3_Sub3_Sub4_6.method483(aBigInteger1, aBigInteger2);
				this.aClass3_Sub3_Sub4_8.anInt738 = 0;
				if (arg2) {
					this.aClass3_Sub3_Sub4_8.method458(18);
				} else {
					this.aClass3_Sub3_Sub4_8.method458(16);
				}
				this.aClass3_Sub3_Sub4_8.method458(this.aClass3_Sub3_Sub4_6.anInt738 + 36 + 1 + 1 + 2);
				this.aClass3_Sub3_Sub4_8.method458(255);
				this.aClass3_Sub3_Sub4_8.method459(369);
				this.aClass3_Sub3_Sub4_8.method458(aBoolean226 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass3_Sub3_Sub4_8.method462(this.anIntArray223[local225]);
				}
				this.aClass3_Sub3_Sub4_8.method466(this.aClass3_Sub3_Sub4_6.anInt738, this.aClass3_Sub3_Sub4_6.aByteArray20);
				this.aClass3_Sub3_Sub4_6.aClass41_1 = new Class41((byte) -9, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass41_2 = new Class41((byte) -9, local99);
				this.aClass21_1.method190(this.aClass3_Sub3_Sub4_8.anInt738, this.aClass3_Sub3_Sub4_8.aByteArray20);
				local74 = this.aClass21_1.method187();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method649(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt990 = this.aClass21_1.method187();
					aBoolean231 = this.aClass21_1.method187() == 1;
					this.aLong30 = 0L;
					this.anInt1009 = 0;
					this.aClass33_1.anInt617 = 0;
					super.aBoolean199 = true;
					this.aBoolean222 = true;
					this.aBoolean241 = true;
					this.aClass3_Sub3_Sub4_6.anInt738 = 0;
					this.aClass3_Sub3_Sub4_9.anInt738 = 0;
					this.anInt944 = -1;
					this.anInt926 = -1;
					this.anInt927 = -1;
					this.anInt928 = -1;
					this.anInt943 = 0;
					this.anInt945 = 0;
					this.anInt923 = 0;
					this.anInt947 = 0;
					this.anInt960 = 0;
					this.anInt1071 = 0;
					this.aBoolean223 = false;
					super.anInt834 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray14[local389] = null;
					}
					this.anInt910 = 0;
					this.anInt957 = 0;
					this.anInt1054 = 0;
					this.anInt1059 = 0;
					this.anInt1072 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1063 = (int) (Math.random() * 110.0D) - 55;
					this.anInt939 = (int) (Math.random() * 80.0D) - 40;
					this.anInt892 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1026 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1020 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt949 = 0;
					this.anInt847 = -1;
					this.anInt988 = 0;
					this.anInt989 = 0;
					this.anInt969 = 0;
					this.anInt930 = 0;
					for (local225 = 0; local225 < this.anInt967; local225++) {
						this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local225] = null;
						this.aClass3_Sub3_Sub4Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local259] = null;
					}
					aClass3_Sub3_Sub2_Sub1_Sub2_1 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anInt968] = new Class3_Sub3_Sub2_Sub1_Sub2();
					this.aClass26_12.method228();
					this.aClass26_11.method228();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass26ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass26_10 = new Class26(2);
					this.anInt1034 = 0;
					this.anInt1033 = 0;
					this.method614(this.anInt996);
					this.anInt996 = -1;
					this.method614(this.anInt903);
					this.anInt903 = -1;
					this.method614(this.anInt1061);
					this.anInt1061 = -1;
					this.method614(this.anInt1017);
					this.anInt1017 = -1;
					this.method614(this.anInt975);
					this.anInt975 = -1;
					this.method614(this.anInt899);
					this.anInt899 = -1;
					this.method614(this.anInt901);
					this.anInt901 = -1;
					this.aBoolean232 = false;
					this.anInt885 = 3;
					this.anInt985 = 0;
					this.aBoolean223 = false;
					this.aBoolean204 = false;
					this.aString31 = null;
					this.anInt924 = 0;
					this.anInt897 = -1;
					this.aBoolean240 = true;
					this.method720(this.aByte32);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray243[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray11[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt867 = 0;
					anInt948 = 0;
					anInt908 = 0;
					anInt1048 = 0;
					anInt997 = 0;
					anInt896 = 0;
					anInt889 = 0;
					anInt1030 = 0;
					this.method662();
				} else if (local74 == 3) {
					this.aString21 = "";
					this.aString22 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString21 = "Your account has been disabled.";
					this.aString22 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString21 = "Your account is already logged in.";
					this.aString22 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString21 = "RuneScape has been updated!";
					this.aString22 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString21 = "This world is full.";
					this.aString22 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString21 = "Unable to connect.";
					this.aString22 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString21 = "Login limit exceeded.";
					this.aString22 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString21 = "Unable to connect.";
					this.aString22 = "Bad session id.";
				} else if (local74 == 12) {
					this.aString21 = "You need a members account to login to this world.";
					this.aString22 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString21 = "Could not complete login.";
					this.aString22 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString21 = "The server is being updated.";
					this.aString22 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean241 = true;
					this.aClass3_Sub3_Sub4_6.anInt738 = 0;
					this.aClass3_Sub3_Sub4_9.anInt738 = 0;
					this.anInt944 = -1;
					this.anInt926 = -1;
					this.anInt927 = -1;
					this.anInt928 = -1;
					this.anInt943 = 0;
					this.anInt945 = 0;
					this.anInt923 = 0;
					this.anInt1071 = 0;
					this.aBoolean223 = false;
					this.aLong32 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString21 = "Login attempts exceeded.";
					this.aString22 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString21 = "You are standing in a members-only area.";
					this.aString22 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString21 = "Invalid loginserver requested";
					this.aString22 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass21_1.method187();
					for (@Pc(908) int local908 = local389 + 3; local908 >= 0; local908--) {
						this.aString21 = "You have only just left another world";
						this.aString22 = "Your profile will be transferred in: " + local908;
						this.method697((byte) 8, true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(930) Exception local930) {
						}
					}
					this.method649(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString21 = "Malformed login packet.";
					this.aString22 = "Please try again.";
				} else if (local74 == 23) {
					this.aString21 = "No reply from loginserver.";
					this.aString22 = "Please try again.";
				} else if (local74 == 24) {
					this.aString21 = "Error loading your profile.";
					this.aString22 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString21 = "Unexpected loginserver response.";
					this.aString22 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString21 = "This computers address has been blocked";
					this.aString22 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString21 = "Unexpected server response";
					this.aString22 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString21 = "No response from server";
					this.aString22 = "Please try using a different world.";
				} else if (this.anInt855 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1002) Exception local1002) {
					}
					this.anInt855++;
					this.method649(arg0, arg1, arg2);
				} else {
					this.aString21 = "No response from loginserver";
					this.aString22 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1045) IOException local1045) {
			this.aString21 = "";
			this.aString22 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			if (this.aBoolean233 || this.aBoolean219 || this.aBoolean239) {
				this.method698();
			} else {
				anInt918++;
				if (this.aBoolean241) {
					this.method671();
				} else {
					this.method697((byte) 8, false);
				}
				this.anInt1029 = 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("68377, " + 9 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)Z")
	private boolean method650() {
		try {
			if (this.aClass21_1 == null) {
				return false;
			}
			@Pc(164) String local164;
			@Pc(350) int local350;
			try {
				@Pc(20) int local20 = this.aClass21_1.method188();
				if (local20 == 0) {
					return false;
				}
				if (this.anInt944 == -1) {
					this.aClass21_1.method189(this.aClass3_Sub3_Sub4_9.aByteArray20, 0, 1);
					this.anInt944 = this.aClass3_Sub3_Sub4_9.aByteArray20[0] & 0xFF;
					if (this.aClass41_2 != null) {
						this.anInt944 = this.anInt944 - this.aClass41_2.method511() & 0xFF;
					}
					this.anInt943 = Class37.anIntArray187[this.anInt944];
					local20--;
				}
				if (this.anInt943 == -1) {
					if (local20 <= 0) {
						return false;
					}
					this.aClass21_1.method189(this.aClass3_Sub3_Sub4_9.aByteArray20, 0, 1);
					this.anInt943 = this.aClass3_Sub3_Sub4_9.aByteArray20[0] & 0xFF;
					local20--;
				}
				if (this.anInt943 == -2) {
					if (local20 <= 1) {
						return false;
					}
					this.aClass21_1.method189(this.aClass3_Sub3_Sub4_9.aByteArray20, 0, 2);
					this.aClass3_Sub3_Sub4_9.anInt738 = 0;
					this.anInt943 = this.aClass3_Sub3_Sub4_9.method470();
					local20 -= 2;
				}
				if (local20 < this.anInt943) {
					return false;
				}
				this.aClass3_Sub3_Sub4_9.anInt738 = 0;
				this.aClass21_1.method189(this.aClass3_Sub3_Sub4_9.aByteArray20, 0, this.anInt943);
				this.anInt945 = 0;
				this.anInt928 = this.anInt927;
				this.anInt927 = this.anInt926;
				this.anInt926 = this.anInt944;
				@Pc(182) int local182;
				@Pc(175) String local175;
				@Pc(180) boolean local180;
				@Pc(315) String local315;
				if (this.anInt944 == 144) {
					local164 = this.aClass3_Sub3_Sub4_9.method475();
					@Pc(178) long local178;
					if (local164.endsWith(":tradereq:")) {
						local175 = local164.substring(0, local164.indexOf(":"));
						local178 = Class48.method535(local175);
						local180 = false;
						for (local182 = 0; local182 < this.anInt894; local182++) {
							if (this.aLongArray4[local182] == local178) {
								local180 = true;
								break;
							}
						}
						if (!local180 && this.anInt1037 == 0) {
							this.method716((byte) 2, 4, "wishes to trade with you.", local175);
						}
					} else if (local164.endsWith(":duelreq:")) {
						local175 = local164.substring(0, local164.indexOf(":"));
						local178 = Class48.method535(local175);
						local180 = false;
						for (local182 = 0; local182 < this.anInt894; local182++) {
							if (this.aLongArray4[local182] == local178) {
								local180 = true;
								break;
							}
						}
						if (!local180 && this.anInt1037 == 0) {
							this.method716((byte) 2, 8, "wishes to duel with you.", local175);
						}
					} else if (local164.endsWith(":chalreq:")) {
						local175 = local164.substring(0, local164.indexOf(":"));
						local178 = Class48.method535(local175);
						local180 = false;
						for (local182 = 0; local182 < this.anInt894; local182++) {
							if (this.aLongArray4[local182] == local178) {
								local180 = true;
								break;
							}
						}
						if (!local180 && this.anInt1037 == 0) {
							local315 = local164.substring(local164.indexOf(":") + 1, local164.length() - 9);
							this.method716((byte) 2, 8, local315, local175);
						}
					} else {
						this.method716((byte) 2, 0, local164, "");
					}
					this.anInt944 = -1;
					return true;
				}
				@Pc(356) int local356;
				@Pc(362) int local362;
				@Pc(344) int local344;
				if (this.anInt944 == 75) {
					local344 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					local350 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					local356 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					local362 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					Class23.method208(local350).anInt341 = local344;
					Class23.method208(local350).anInt342 = local356;
					Class23.method208(local350).anInt340 = local362;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 64) {
					this.anInt1034 = this.aClass3_Sub3_Sub4_9.method468();
					this.aBoolean216 = true;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 217) {
					local344 = this.aClass3_Sub3_Sub4_9.method499();
					local350 = this.aClass3_Sub3_Sub4_9.method496();
					local356 = this.aClass3_Sub3_Sub4_9.method498();
					@Pc(418) Class23 local418 = Class23.method208(local350);
					local418.anInt367 = local356;
					local418.anInt359 = local344;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 113) {
					local344 = this.aClass3_Sub3_Sub4_9.method485();
					local175 = this.aClass3_Sub3_Sub4_9.method475();
					local356 = this.aClass3_Sub3_Sub4_9.method468();
					if (local344 >= 1 && local344 <= 5) {
						if (local175.equalsIgnoreCase("null")) {
							local175 = null;
						}
						this.aStringArray11[local344 - 1] = local175;
						this.aBooleanArray11[local344 - 1] = local356 == 0;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 164) {
					local344 = this.aClass3_Sub3_Sub4_9.method470();
					@Pc(499) boolean local499 = this.aClass3_Sub3_Sub4_9.method486() == 1;
					Class23.method208(local344).aBoolean87 = local499;
					this.anInt944 = -1;
					return true;
				}
				@Pc(523) Class23 local523;
				if (this.anInt944 == 154) {
					local344 = this.aClass3_Sub3_Sub4_9.method470();
					local350 = this.aClass3_Sub3_Sub4_9.method470();
					local523 = Class23.method208(local344);
					if (local523 != null && local523.anInt355 == 0) {
						if (local350 < 0) {
							local350 = 0;
						}
						if (local350 > local523.anInt370 - local523.anInt348) {
							local350 = local523.anInt370 - local523.anInt348;
						}
						local523.anInt336 = local350;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 208) {
					this.anInt955 = this.aClass3_Sub3_Sub4_9.method487();
					this.anInt887 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 28) {
					local344 = this.aClass3_Sub3_Sub4_9.method499();
					local350 = this.aClass3_Sub3_Sub4_9.method496();
					local523 = Class23.method208(local350);
					if (local523.anInt361 != local344 || local344 == -1) {
						local523.anInt361 = local344;
						local523.anInt372 = 0;
						local523.anInt337 = 0;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 124) {
					local344 = this.aClass3_Sub3_Sub4_9.method496();
					local350 = this.aClass3_Sub3_Sub4_9.method494();
					if (this.anInt903 != -1) {
						this.method614(this.anInt903);
						this.anInt903 = -1;
						this.aBoolean237 = true;
					}
					if (this.anInt1017 != -1) {
						this.method614(this.anInt1017);
						this.anInt1017 = -1;
						this.aBoolean244 = true;
					}
					if (this.anInt975 != -1) {
						this.method614(this.anInt975);
						this.anInt975 = -1;
					}
					if (this.anInt1061 != local344) {
						this.method614(this.anInt1061);
						this.anInt1061 = local344;
					}
					if (this.anInt899 != local350) {
						this.method614(this.anInt899);
						this.anInt899 = local350;
					}
					if (this.anInt985 != 0) {
						this.anInt985 = 0;
						this.aBoolean237 = true;
					}
					this.aBoolean216 = true;
					this.aBoolean214 = true;
					this.aBoolean232 = false;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 72) {
					this.aBoolean242 = false;
					for (local344 = 0; local344 < 5; local344++) {
						this.aBooleanArray12[local344] = false;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 18) {
					this.anInt850 = this.aClass3_Sub3_Sub4_9.method486();
					this.anInt849 = this.aClass3_Sub3_Sub4_9.method485();
					for (local344 = this.anInt849; local344 < this.anInt849 + 8; local344++) {
						for (local350 = this.anInt850; local350 < this.anInt850 + 8; local350++) {
							if (this.aClass26ArrayArrayArray1[this.anInt1056][local344][local350] != null) {
								this.aClass26ArrayArrayArray1[this.anInt1056][local344][local350] = null;
								this.method653(local344, local350);
							}
						}
					}
					for (@Pc(810) Class3_Sub2 local810 = (Class3_Sub2) this.aClass26_10.method224(); local810 != null; local810 = (Class3_Sub2) this.aClass26_10.method226()) {
						if (local810.anInt91 >= this.anInt849 && local810.anInt91 < this.anInt849 + 8 && local810.anInt92 >= this.anInt850 && local810.anInt92 < this.anInt850 + 8 && local810.anInt89 == this.anInt1056) {
							local810.anInt87 = 0;
						}
					}
					this.anInt944 = -1;
					return true;
				}
				@Pc(928) int local928;
				@Pc(944) int local944;
				if (this.anInt944 == 184) {
					this.aBoolean242 = true;
					this.anInt857 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt858 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt859 = this.aClass3_Sub3_Sub4_9.method470();
					this.anInt860 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt861 = this.aClass3_Sub3_Sub4_9.method468();
					if (this.anInt861 >= 100) {
						local344 = this.anInt857 * 128 + 64;
						local350 = this.anInt858 * 128 + 64;
						local356 = this.method695(this.anInt1056, local344, local350) - this.anInt859;
						local362 = local344 - this.anInt1043;
						local928 = local356 - this.anInt1044;
						local182 = local350 - this.anInt1045;
						local944 = (int) Math.sqrt((double) (local362 * local362 + local182 * local182));
						this.anInt1046 = (int) (Math.atan2((double) local928, (double) local944) * 325.949D) & 0x7FF;
						this.anInt1047 = (int) (Math.atan2((double) local362, (double) local182) * -325.949D) & 0x7FF;
						if (this.anInt1046 < 128) {
							this.anInt1046 = 128;
						}
						if (this.anInt1046 > 383) {
							this.anInt1046 = 383;
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 188) {
					local344 = this.aClass3_Sub3_Sub4_9.method470();
					local350 = this.aClass3_Sub3_Sub4_9.method468();
					local356 = this.aClass3_Sub3_Sub4_9.method470();
					if (local356 == 65535) {
						if (this.anInt1059 < 50) {
							this.anIntArray246[this.anInt1059] = (short) local344;
							this.anIntArray240[this.anInt1059] = local350;
							this.anIntArray271[this.anInt1059] = 0;
							this.anInt1059++;
						}
					} else if (this.aBoolean212 && !aBoolean226 && this.anInt1059 < 50) {
						this.anIntArray246[this.anInt1059] = local344;
						this.anIntArray240[this.anInt1059] = local350;
						this.anIntArray271[this.anInt1059] = local356 + Class38.anIntArray188[local344];
						this.anInt1059++;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 52) {
					this.anInt923 = this.aClass3_Sub3_Sub4_9.method496() * 30;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 195) {
					local344 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					this.method675(local344);
					if (this.anInt899 != -1) {
						this.method614(this.anInt899);
						this.anInt899 = -1;
						this.aBoolean216 = true;
						this.aBoolean214 = true;
					}
					if (this.anInt1017 != -1) {
						this.method614(this.anInt1017);
						this.anInt1017 = -1;
						this.aBoolean244 = true;
					}
					if (this.anInt975 != -1) {
						this.method614(this.anInt975);
						this.anInt975 = -1;
					}
					if (this.anInt1061 != -1) {
						this.method614(this.anInt1061);
						this.anInt1061 = -1;
					}
					if (this.anInt903 != local344) {
						this.method614(this.anInt903);
						this.anInt903 = local344;
					}
					this.aBoolean232 = false;
					this.aBoolean237 = true;
					this.anInt944 = -1;
					return true;
				}
				@Pc(1347) int local1347;
				@Pc(1199) long local1199;
				if (this.anInt944 == 70) {
					local1199 = this.aClass3_Sub3_Sub4_9.method474();
					local356 = this.aClass3_Sub3_Sub4_9.method468();
					@Pc(1210) String local1210 = Class48.method539(Class48.method536(this.aBoolean224, local1199));
					for (local928 = 0; local928 < this.anInt1033; local928++) {
						if (local1199 == this.aLongArray3[local928]) {
							if (this.anIntArray215[local928] != local356) {
								this.anIntArray215[local928] = local356;
								this.aBoolean216 = true;
								if (local356 > 0) {
									this.method716((byte) 2, 5, local1210 + " has logged in.", "");
								}
								if (local356 == 0) {
									this.method716((byte) 2, 5, local1210 + " has logged out.", "");
								}
							}
							local1210 = null;
							break;
						}
					}
					if (local1210 != null && this.anInt1033 < 200) {
						this.aLongArray3[this.anInt1033] = local1199;
						this.aStringArray10[this.anInt1033] = local1210;
						this.anIntArray215[this.anInt1033] = local356;
						this.anInt1033++;
						this.aBoolean216 = true;
					}
					@Pc(1308) boolean local1308 = false;
					while (!local1308) {
						local1308 = true;
						for (local944 = 0; local944 < this.anInt1033 - 1; local944++) {
							if (this.anIntArray215[local944] != anInt932 && this.anIntArray215[local944 + 1] == anInt932 || this.anIntArray215[local944] == 0 && this.anIntArray215[local944 + 1] != 0) {
								local1347 = this.anIntArray215[local944];
								this.anIntArray215[local944] = this.anIntArray215[local944 + 1];
								this.anIntArray215[local944 + 1] = local1347;
								@Pc(1369) String local1369 = this.aStringArray10[local944];
								this.aStringArray10[local944] = this.aStringArray10[local944 + 1];
								this.aStringArray10[local944 + 1] = local1369;
								@Pc(1391) long local1391 = this.aLongArray3[local944];
								this.aLongArray3[local944] = this.aLongArray3[local944 + 1];
								this.aLongArray3[local944 + 1] = local1391;
								this.aBoolean216 = true;
								local1308 = false;
							}
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 239) {
					local344 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					local350 = this.aClass3_Sub3_Sub4_9.method487();
					if (local344 == 65535) {
						local344 = -1;
					}
					if (this.anIntArray251[local350] != local344) {
						this.method614(this.anIntArray251[local350]);
						this.anIntArray251[local350] = local344;
					}
					this.aBoolean216 = true;
					this.aBoolean214 = true;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 42) {
					this.method711();
					this.anInt944 = -1;
					return false;
				}
				@Pc(1502) Class23 local1502;
				if (this.anInt944 == 247) {
					this.aBoolean216 = true;
					local344 = this.aClass3_Sub3_Sub4_9.method470();
					local1502 = Class23.method208(local344);
					while (this.aClass3_Sub3_Sub4_9.anInt738 < this.anInt943) {
						local356 = this.aClass3_Sub3_Sub4_9.method482();
						local362 = this.aClass3_Sub3_Sub4_9.method470();
						local928 = this.aClass3_Sub3_Sub4_9.method468();
						if (local928 == 255) {
							local928 = this.aClass3_Sub3_Sub4_9.method473();
						}
						if (local356 >= 0 && local356 < local1502.anIntArray98.length) {
							local1502.anIntArray98[local356] = local362;
							local1502.anIntArray100[local356] = local928;
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 19) {
					local344 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					local350 = this.aClass3_Sub3_Sub4_9.method496();
					Class23.method208(local344).anInt345 = 1;
					Class23.method208(local344).anInt346 = local350;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 174) {
					local344 = this.aClass3_Sub3_Sub4_9.method494();
					local350 = this.aClass3_Sub3_Sub4_9.method494();
					Class23.method208(local350).anInt345 = 2;
					Class23.method208(local350).anInt346 = local344;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 172) {
					this.anInt937 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt900 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt1024 = this.aClass3_Sub3_Sub4_9.method468();
					this.aBoolean234 = true;
					this.aBoolean237 = true;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 237) {
					local344 = this.aClass3_Sub3_Sub4_9.method494();
					local1502 = Class23.method208(local344);
					for (local356 = 0; local356 < local1502.anIntArray98.length; local356++) {
						local1502.anIntArray98[local356] = -1;
						local1502.anIntArray98[local356] = 0;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 169) {
					this.anInt924 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 15) {
					this.aBoolean204 = false;
					this.anInt985 = 2;
					this.aString25 = "";
					this.aBoolean237 = true;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 224) {
					this.anInt897 = this.aClass3_Sub3_Sub4_9.method487();
					if (this.anInt897 == this.anInt885) {
						if (this.anInt897 == 3) {
							this.anInt885 = 1;
						} else {
							this.anInt885 = 3;
						}
						this.aBoolean216 = true;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 20) {
					local344 = this.aClass3_Sub3_Sub4_9.method494();
					local350 = this.aClass3_Sub3_Sub4_9.method496();
					local356 = this.aClass3_Sub3_Sub4_9.method470();
					Class23.method208(local344).anInt357 = (local356 << 16) + local350;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 243) {
					this.aBoolean216 = true;
					local344 = this.aClass3_Sub3_Sub4_9.method487();
					local350 = this.aClass3_Sub3_Sub4_9.method487();
					local356 = this.aClass3_Sub3_Sub4_9.method503();
					this.anIntArray270[local350] = local356;
					this.anIntArray213[local350] = local344;
					this.anIntArray252[local350] = 1;
					for (local362 = 0; local362 < 98; local362++) {
						if (local356 >= anIntArray235[local362]) {
							this.anIntArray252[local350] = local362 + 2;
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 30) {
					local344 = this.aClass3_Sub3_Sub4_9.method470();
					this.method675(local344);
					if (this.anInt903 != -1) {
						this.method614(this.anInt903);
						this.anInt903 = -1;
						this.aBoolean237 = true;
					}
					if (this.anInt1017 != -1) {
						this.method614(this.anInt1017);
						this.anInt1017 = -1;
						this.aBoolean244 = true;
					}
					if (this.anInt975 != -1) {
						this.method614(this.anInt975);
						this.anInt975 = -1;
					}
					if (this.anInt1061 != -1) {
						this.method614(this.anInt1061);
						this.anInt1061 = -1;
					}
					if (this.anInt899 != local344) {
						this.method614(this.anInt899);
						this.anInt899 = local344;
					}
					if (this.anInt985 != 0) {
						this.anInt985 = 0;
						this.aBoolean237 = true;
					}
					this.aBoolean216 = true;
					this.aBoolean214 = true;
					this.aBoolean232 = false;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 142) {
					if (this.anInt885 == 12) {
						this.aBoolean216 = true;
					}
					this.anInt886 = this.aClass3_Sub3_Sub4_9.method471();
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 83 || this.anInt944 == 35) {
					local344 = this.anInt851;
					local350 = this.anInt852;
					if (this.anInt944 == 83) {
						local350 = this.aClass3_Sub3_Sub4_9.method496();
						local344 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
						this.aBoolean201 = false;
					}
					if (this.anInt944 == 35) {
						this.aClass3_Sub3_Sub4_9.method478(616);
						local356 = 0;
						while (true) {
							if (local356 >= 4) {
								this.aClass3_Sub3_Sub4_9.method480();
								local344 = this.aClass3_Sub3_Sub4_9.method494();
								local350 = this.aClass3_Sub3_Sub4_9.method496();
								this.aBoolean201 = true;
								break;
							}
							for (local362 = 0; local362 < 13; local362++) {
								for (local928 = 0; local928 < 13; local928++) {
									local182 = this.aClass3_Sub3_Sub4_9.method479(1);
									if (local182 == 1) {
										this.anIntArrayArrayArray7[local356][local362][local928] = this.aClass3_Sub3_Sub4_9.method479(26);
									} else {
										this.anIntArrayArrayArray7[local356][local362][local928] = -1;
									}
								}
							}
							local356++;
						}
					}
					if (this.anInt851 == local344 && this.anInt852 == local350 && this.anInt1054 == 2) {
						this.anInt944 = -1;
						return true;
					}
					this.anInt851 = local344;
					this.anInt852 = local350;
					this.anInt1003 = (this.anInt851 - 6) * 8;
					this.anInt1004 = (this.anInt852 - 6) * 8;
					this.aBoolean207 = false;
					if ((this.anInt851 / 8 == 48 || this.anInt851 / 8 == 49) && this.anInt852 / 8 == 48) {
						this.aBoolean207 = true;
					}
					if (this.anInt851 / 8 == 48 && this.anInt852 / 8 == 148) {
						this.aBoolean207 = true;
					}
					this.anInt1054 = 1;
					this.aLong32 = System.currentTimeMillis();
					this.method712(null, "Loading - please wait.");
					if (this.anInt944 == 83) {
						local356 = 0;
						local362 = (this.anInt851 - 6) / 8;
						label1225: while (true) {
							if (local362 > (this.anInt851 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local356][];
								this.aByteArrayArray6 = new byte[local356][];
								this.anIntArray236 = new int[local356];
								this.anIntArray237 = new int[local356];
								this.anIntArray238 = new int[local356];
								local356 = 0;
								local928 = (this.anInt851 - 6) / 8;
								while (true) {
									if (local928 > (this.anInt851 + 6) / 8) {
										break label1225;
									}
									for (local182 = (this.anInt852 - 6) / 8; local182 <= (this.anInt852 + 6) / 8; local182++) {
										this.anIntArray236[local356] = (local928 << 8) + local182;
										if (this.aBoolean207 && (local182 == 49 || local182 == 149 || local182 == 147 || local928 == 50 || local928 == 49 && local182 == 47)) {
											this.anIntArray237[local356] = -1;
											this.anIntArray238[local356] = -1;
											local356++;
										} else {
											local944 = this.anIntArray237[local356] = this.aClass6_Sub1_1.method159(local928, local182, 0);
											if (local944 != -1) {
												this.aClass6_Sub1_1.method174(3, local944);
											}
											local1347 = this.anIntArray238[local356] = this.aClass6_Sub1_1.method159(local928, local182, 1);
											if (local1347 != -1) {
												this.aClass6_Sub1_1.method174(3, local1347);
											}
											local356++;
										}
									}
									local928++;
								}
							}
							for (local928 = (this.anInt852 - 6) / 8; local928 <= (this.anInt852 + 6) / 8; local928++) {
								local356++;
							}
							local362++;
						}
					}
					if (this.anInt944 == 35) {
						local356 = 0;
						@Pc(2357) int[] local2357 = new int[676];
						local928 = 0;
						label1186: while (true) {
							@Pc(2387) int local2387;
							@Pc(2393) int local2393;
							@Pc(2403) int local2403;
							if (local928 >= 4) {
								this.aByteArrayArray5 = new byte[local356][];
								this.aByteArrayArray6 = new byte[local356][];
								this.anIntArray236 = new int[local356];
								this.anIntArray237 = new int[local356];
								this.anIntArray238 = new int[local356];
								local182 = 0;
								while (true) {
									if (local182 >= local356) {
										break label1186;
									}
									local944 = this.anIntArray236[local182] = local2357[local182];
									local1347 = local944 >> 8 & 0xFF;
									local2387 = local944 & 0xFF;
									local2393 = this.anIntArray237[local182] = this.aClass6_Sub1_1.method159(local1347, local2387, 0);
									if (local2393 != -1) {
										this.aClass6_Sub1_1.method174(3, local2393);
									}
									local2403 = this.anIntArray238[local182] = this.aClass6_Sub1_1.method159(local1347, local2387, 1);
									if (local2403 != -1) {
										this.aClass6_Sub1_1.method174(3, local2403);
									}
									local182++;
								}
							}
							for (local182 = 0; local182 < 13; local182++) {
								for (local944 = 0; local944 < 13; local944++) {
									local1347 = this.anIntArrayArrayArray7[local928][local182][local944];
									if (local1347 != -1) {
										local2387 = local1347 >> 14 & 0x3FF;
										local2393 = local1347 >> 3 & 0x7FF;
										local2403 = (local2387 / 8 << 8) + local2393 / 8;
										for (@Pc(2405) int local2405 = 0; local2405 < local356; local2405++) {
											if (local2357[local2405] == local2403) {
												local2403 = -1;
												break;
											}
										}
										if (local2403 != -1) {
											local2357[local356++] = local2403;
										}
									}
								}
							}
							local928++;
						}
					}
					local356 = this.anInt1003 - this.anInt1005;
					local362 = this.anInt1004 - this.anInt1006;
					this.anInt1005 = this.anInt1003;
					this.anInt1006 = this.anInt1004;
					for (local928 = 0; local928 < 16384; local928++) {
						@Pc(2558) Class3_Sub3_Sub2_Sub1_Sub1 local2558 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local928];
						if (local2558 != null) {
							for (local944 = 0; local944 < 10; local944++) {
								local2558.anIntArray177[local944] -= local356;
								local2558.anIntArray178[local944] -= local362;
							}
							local2558.anInt685 -= local356 * 128;
							local2558.anInt686 -= local362 * 128;
						}
					}
					for (local182 = 0; local182 < this.anInt967; local182++) {
						@Pc(2613) Class3_Sub3_Sub2_Sub1_Sub2 local2613 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local182];
						if (local2613 != null) {
							for (local1347 = 0; local1347 < 10; local1347++) {
								local2613.anIntArray177[local1347] -= local356;
								local2613.anIntArray178[local1347] -= local362;
							}
							local2613.anInt685 -= local356 * 128;
							local2613.anInt686 -= local362 * 128;
						}
					}
					this.aBoolean200 = true;
					@Pc(2665) byte local2665 = 0;
					@Pc(2667) byte local2667 = 104;
					@Pc(2669) byte local2669 = 1;
					if (local356 < 0) {
						local2665 = 103;
						local2667 = -1;
						local2669 = -1;
					}
					@Pc(2679) byte local2679 = 0;
					@Pc(2681) byte local2681 = 104;
					@Pc(2683) byte local2683 = 1;
					if (local362 < 0) {
						local2679 = 103;
						local2681 = -1;
						local2683 = -1;
					}
					for (@Pc(2693) int local2693 = local2665; local2693 != local2667; local2693 += local2669) {
						for (@Pc(2697) int local2697 = local2679; local2697 != local2681; local2697 += local2683) {
							@Pc(2703) int local2703 = local2693 + local356;
							@Pc(2707) int local2707 = local2697 + local362;
							for (@Pc(2709) int local2709 = 0; local2709 < 4; local2709++) {
								if (local2703 >= 0 && local2707 >= 0 && local2703 < 104 && local2707 < 104) {
									this.aClass26ArrayArrayArray1[local2709][local2693][local2697] = this.aClass26ArrayArrayArray1[local2709][local2703][local2707];
								} else {
									this.aClass26ArrayArrayArray1[local2709][local2693][local2697] = null;
								}
							}
						}
					}
					for (@Pc(2771) Class3_Sub2 local2771 = (Class3_Sub2) this.aClass26_10.method224(); local2771 != null; local2771 = (Class3_Sub2) this.aClass26_10.method226()) {
						local2771.anInt91 -= local356;
						local2771.anInt92 -= local362;
						if (local2771.anInt91 < 0 || local2771.anInt92 < 0 || local2771.anInt91 >= 104 || local2771.anInt92 >= 104) {
							local2771.method545();
						}
					}
					if (this.anInt988 != 0) {
						this.anInt988 -= local356;
						this.anInt989 -= local362;
					}
					this.aBoolean242 = false;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 138 || this.anInt944 == 119 || this.anInt944 == 149 || this.anInt944 == 225 || this.anInt944 == 250 || this.anInt944 == 190 || this.anInt944 == 210 || this.anInt944 == 141 || this.anInt944 == 135 || this.anInt944 == 150 || this.anInt944 == 205) {
					this.method683(this.anInt944, this.aClass3_Sub3_Sub4_9);
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 43) {
					for (local344 = 0; local344 < this.anIntArray272.length; local344++) {
						if (this.anIntArray272[local344] != this.anIntArray225[local344]) {
							this.anIntArray272[local344] = this.anIntArray225[local344];
							this.method714(local344);
							this.aBoolean216 = true;
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 39) {
					this.anInt850 = this.aClass3_Sub3_Sub4_9.method487();
					this.anInt849 = this.aClass3_Sub3_Sub4_9.method468();
					while (this.aClass3_Sub3_Sub4_9.anInt738 < this.anInt943) {
						local344 = this.aClass3_Sub3_Sub4_9.method468();
						this.method683(local344, this.aClass3_Sub3_Sub4_9);
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 189) {
					local344 = this.aClass3_Sub3_Sub4_9.method498();
					if (local344 >= 0) {
						this.method675(local344);
					}
					if (local344 != this.anInt901) {
						this.method614(this.anInt901);
						this.anInt901 = local344;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 13) {
					if (this.anInt899 != -1) {
						this.method614(this.anInt899);
						this.anInt899 = -1;
						this.aBoolean216 = true;
						this.aBoolean214 = true;
					}
					if (this.anInt903 != -1) {
						this.method614(this.anInt903);
						this.anInt903 = -1;
						this.aBoolean237 = true;
					}
					if (this.anInt1017 != -1) {
						this.method614(this.anInt1017);
						this.anInt1017 = -1;
						this.aBoolean244 = true;
					}
					if (this.anInt975 != -1) {
						this.method614(this.anInt975);
						this.anInt975 = -1;
					}
					if (this.anInt1061 != -1) {
						this.method614(this.anInt1061);
						this.anInt1061 = -1;
					}
					if (this.anInt985 != 0) {
						this.anInt985 = 0;
						this.aBoolean237 = true;
					}
					this.aBoolean232 = false;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 11) {
					this.anInt885 = this.aClass3_Sub3_Sub4_9.method485();
					this.aBoolean216 = true;
					this.aBoolean214 = true;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 156) {
					local344 = this.aClass3_Sub3_Sub4_9.method496();
					local350 = this.aClass3_Sub3_Sub4_9.method494();
					local356 = local350 >> 10 & 0x1F;
					local362 = local350 >> 5 & 0x1F;
					local928 = local350 & 0x1F;
					Class23.method208(local344).anInt354 = (local356 << 19) + (local362 << 11) + (local928 << 3);
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 118) {
					local344 = this.aClass3_Sub3_Sub4_9.method503();
					local350 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					this.anIntArray225[local350] = local344;
					if (this.anIntArray272[local350] != local344) {
						this.anIntArray272[local350] = local344;
						this.method714(local350);
						this.aBoolean216 = true;
						if (this.anInt996 != -1) {
							this.aBoolean237 = true;
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 207) {
					this.anInt849 = this.aClass3_Sub3_Sub4_9.method486();
					this.anInt850 = this.aClass3_Sub3_Sub4_9.method486();
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 73) {
					local344 = this.aClass3_Sub3_Sub4_9.method494();
					this.method675(local344);
					if (this.anInt899 != -1) {
						this.method614(this.anInt899);
						this.anInt899 = -1;
						this.aBoolean216 = true;
						this.aBoolean214 = true;
					}
					if (this.anInt903 != -1) {
						this.method614(this.anInt903);
						this.anInt903 = -1;
						this.aBoolean237 = true;
					}
					if (this.anInt1017 != -1) {
						this.method614(this.anInt1017);
						this.anInt1017 = -1;
						this.aBoolean244 = true;
					}
					if (this.anInt975 != -1) {
						this.method614(this.anInt975);
						this.anInt975 = -1;
					}
					if (this.anInt1061 != local344) {
						this.method614(this.anInt1061);
						this.anInt1061 = local344;
					}
					if (this.anInt985 != 0) {
						this.anInt985 = 0;
						this.aBoolean237 = true;
					}
					this.aBoolean232 = false;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 125) {
					this.anInt949 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 69) {
					this.method725(this.anInt943, this.aClass3_Sub3_Sub4_9);
					this.aBoolean200 = false;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 1) {
					this.method635(this.anInt943, this.aClass3_Sub3_Sub4_9);
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 181) {
					local344 = this.aClass3_Sub3_Sub4_9.method497(965);
					if (local344 != this.anInt996) {
						this.method614(this.anInt996);
						this.anInt996 = local344;
					}
					this.aBoolean237 = true;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 132) {
					local344 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					local350 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					this.method675(local344);
					if (local350 != -1) {
						this.method675(local350);
					}
					if (this.anInt1061 != -1) {
						this.method614(this.anInt1061);
						this.anInt1061 = -1;
					}
					if (this.anInt899 != -1) {
						this.method614(this.anInt899);
						this.anInt899 = -1;
					}
					if (this.anInt903 != -1) {
						this.method614(this.anInt903);
						this.anInt903 = -1;
					}
					if (this.anInt1017 != local344) {
						this.method614(this.anInt1017);
						this.anInt1017 = local344;
					}
					if (this.anInt975 != local344) {
						this.method614(this.anInt975);
						this.anInt975 = local350;
					}
					this.anInt985 = 0;
					this.aBoolean232 = false;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 162) {
					this.aBoolean204 = false;
					this.anInt985 = 1;
					this.aString25 = "";
					this.aBoolean237 = true;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 100) {
					if (this.anInt885 == 12) {
						this.aBoolean216 = true;
					}
					this.anInt915 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 187) {
					this.aBoolean242 = true;
					this.anInt1011 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt1012 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt1013 = this.aClass3_Sub3_Sub4_9.method470();
					this.anInt1014 = this.aClass3_Sub3_Sub4_9.method468();
					this.anInt1015 = this.aClass3_Sub3_Sub4_9.method468();
					if (this.anInt1015 >= 100) {
						this.anInt1043 = this.anInt1011 * 128 + 64;
						this.anInt1045 = this.anInt1012 * 128 + 64;
						this.anInt1044 = this.method695(this.anInt1056, this.anInt1043, this.anInt1045) - this.anInt1013;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 110) {
					local344 = this.aClass3_Sub3_Sub4_9.method494();
					local350 = this.aClass3_Sub3_Sub4_9.method496();
					local356 = this.aClass3_Sub3_Sub4_9.method494();
					if (local356 == 65535) {
						Class23.method208(local350).anInt345 = 0;
						this.anInt944 = -1;
						return true;
					}
					@Pc(3660) Class1 local3660 = Class1.method7(local356);
					Class23.method208(local350).anInt345 = 4;
					Class23.method208(local350).anInt346 = local356;
					Class23.method208(local350).anInt341 = local3660.anInt31;
					Class23.method208(local350).anInt342 = local3660.anInt26;
					Class23.method208(local350).anInt340 = local3660.anInt4 * 100 / local344;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 236) {
					local344 = this.aClass3_Sub3_Sub4_9.method468();
					local350 = this.aClass3_Sub3_Sub4_9.method468();
					local356 = this.aClass3_Sub3_Sub4_9.method468();
					local362 = this.aClass3_Sub3_Sub4_9.method468();
					this.aBooleanArray12[local344] = true;
					this.anIntArray273[local344] = local350;
					this.anIntArray262[local344] = local356;
					this.anIntArray267[local344] = local362;
					this.anIntArray261[local344] = 0;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 231) {
					this.anInt894 = this.anInt943 / 8;
					for (local344 = 0; local344 < this.anInt894; local344++) {
						this.aLongArray4[local344] = this.aClass3_Sub3_Sub4_9.method474();
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 186) {
					local1199 = this.aClass3_Sub3_Sub4_9.method474();
					local356 = this.aClass3_Sub3_Sub4_9.method473();
					local362 = this.aClass3_Sub3_Sub4_9.method468();
					local180 = false;
					for (local182 = 0; local182 < 100; local182++) {
						if (this.anIntArray212[local182] == local356) {
							local180 = true;
							break;
						}
					}
					if (local362 <= 1) {
						for (local944 = 0; local944 < this.anInt894; local944++) {
							if (this.aLongArray4[local944] == local1199) {
								local180 = true;
								break;
							}
						}
					}
					if (!local180 && this.anInt1037 == 0) {
						try {
							this.anIntArray212[this.anInt853] = local356;
							this.anInt853 = (this.anInt853 + 1) % 100;
							local315 = Class19.method179(this.anInt943 - 13, this.aClass3_Sub3_Sub4_9);
							if (local362 != 3) {
								local315 = Class35.method418(local315);
							}
							if (local362 == 2 || local362 == 3) {
								this.method716((byte) 2, 7, local315, "@cr2@" + Class48.method539(Class48.method536(this.aBoolean224, local1199)));
							} else if (local362 == 1) {
								this.method716((byte) 2, 7, local315, "@cr1@" + Class48.method539(Class48.method536(this.aBoolean224, local1199)));
							} else {
								this.method716((byte) 2, 3, local315, Class48.method539(Class48.method536(this.aBoolean224, local1199)));
							}
						} catch (@Pc(3929) Exception local3929) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 204) {
					@Pc(3946) byte local3946 = this.aClass3_Sub3_Sub4_9.method489();
					local350 = this.aClass3_Sub3_Sub4_9.method496();
					this.anIntArray225[local350] = local3946;
					if (this.anIntArray272[local350] != local3946) {
						this.anIntArray272[local350] = local3946;
						this.method714(local350);
						this.aBoolean216 = true;
						if (this.anInt996 != -1) {
							this.aBoolean237 = true;
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 92) {
					for (local344 = 0; local344 < this.aClass3_Sub3_Sub2_Sub1_Sub2Array1.length; local344++) {
						if (this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local344] != null) {
							this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local344].anInt678 = -1;
						}
					}
					for (local350 = 0; local350 < this.aClass3_Sub3_Sub2_Sub1_Sub1Array1.length; local350++) {
						if (this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local350] != null) {
							this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local350].anInt678 = -1;
						}
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 197) {
					local344 = this.aClass3_Sub3_Sub4_9.method496();
					if (local344 == 65535) {
						local344 = -1;
					}
					if (local344 != this.anInt971 && this.aBoolean221 && !aBoolean226 && this.anInt966 == 0) {
						this.anInt873 = local344;
						this.aBoolean202 = true;
						this.aClass6_Sub1_1.method174(2, this.anInt873);
					}
					this.anInt971 = local344;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 171) {
					local344 = this.aClass3_Sub3_Sub4_9.method472();
					local350 = this.aClass3_Sub3_Sub4_9.method470();
					if (this.aBoolean221 && !aBoolean226) {
						this.anInt873 = local350;
						this.aBoolean202 = false;
						this.aClass6_Sub1_1.method174(2, this.anInt873);
						this.anInt966 = local344;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 193) {
					this.anInt988 = 0;
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 5) {
					local344 = this.aClass3_Sub3_Sub4_9.method494();
					local175 = this.aClass3_Sub3_Sub4_9.method475();
					Class23.method208(local344).aString5 = local175;
					@Pc(4157) int local4157 = this.anIntArray251[this.anInt885];
					if (Class23.method208(local344).anInt351 == local4157) {
						this.aBoolean216 = true;
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 40) {
					this.anInt1049 = this.aClass3_Sub3_Sub4_9.method496();
					this.anInt907 = this.aClass3_Sub3_Sub4_9.method496();
					this.anInt942 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					this.aClass3_Sub3_Sub4_9.method468();
					this.anInt866 = this.aClass3_Sub3_Sub4_9.method501();
					this.anInt904 = this.aClass3_Sub3_Sub4_9.method495(this.anInt922);
					this.anInt891 = this.aClass3_Sub3_Sub4_9.method494();
					this.anInt973 = this.aClass3_Sub3_Sub4_9.method470();
					this.anInt982 = this.aClass3_Sub3_Sub4_9.method494();
					this.anInt993 = this.aClass3_Sub3_Sub4_9.method494();
					this.aClass3_Sub3_Sub4_9.method496();
					signlink.dnslookup(Class48.method538(this.anInt866));
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 202) {
					this.anInt960 = this.aClass3_Sub3_Sub4_9.method468();
					if (this.anInt960 == 1) {
						this.anInt961 = this.aClass3_Sub3_Sub4_9.method470();
					}
					if (this.anInt960 >= 2 && this.anInt960 <= 6) {
						if (this.anInt960 == 2) {
							this.anInt878 = 64;
							this.anInt879 = 64;
						}
						if (this.anInt960 == 3) {
							this.anInt878 = 0;
							this.anInt879 = 64;
						}
						if (this.anInt960 == 4) {
							this.anInt878 = 128;
							this.anInt879 = 64;
						}
						if (this.anInt960 == 5) {
							this.anInt878 = 64;
							this.anInt879 = 0;
						}
						if (this.anInt960 == 6) {
							this.anInt878 = 64;
							this.anInt879 = 128;
						}
						this.anInt960 = 2;
						this.anInt875 = this.aClass3_Sub3_Sub4_9.method470();
						this.anInt876 = this.aClass3_Sub3_Sub4_9.method470();
						this.anInt877 = this.aClass3_Sub3_Sub4_9.method468();
					}
					if (this.anInt960 == 10) {
						this.anInt919 = this.aClass3_Sub3_Sub4_9.method470();
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 24) {
					local344 = this.aClass3_Sub3_Sub4_9.method494();
					Class23.method208(local344).anInt345 = 3;
					if (aClass3_Sub3_Sub2_Sub1_Sub2_1.aClass30_2 == null) {
						Class23.method208(local344).anInt346 = (aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray182[0] << 25) + (aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray182[4] << 20) + (aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray183[0] << 15) + (aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray183[8] << 10) + (aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray183[11] << 5) + aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray183[1];
					} else {
						Class23.method208(local344).anInt346 = (int) (aClass3_Sub3_Sub2_Sub1_Sub2_1.aClass30_2.aLong18 + 305419896L);
					}
					this.anInt944 = -1;
					return true;
				}
				if (this.anInt944 == 152) {
					this.aBoolean216 = true;
					local344 = this.aClass3_Sub3_Sub4_9.method470();
					local1502 = Class23.method208(local344);
					local356 = this.aClass3_Sub3_Sub4_9.method470();
					for (local362 = 0; local362 < local356; local362++) {
						local1502.anIntArray98[local362] = this.aClass3_Sub3_Sub4_9.method496();
						local928 = this.aClass3_Sub3_Sub4_9.method485();
						if (local928 == 255) {
							local928 = this.aClass3_Sub3_Sub4_9.method501();
						}
						local1502.anIntArray100[local362] = local928;
					}
					for (local928 = local356; local928 < local1502.anIntArray98.length; local928++) {
						local1502.anIntArray98[local928] = 0;
						local1502.anIntArray100[local928] = 0;
					}
					this.anInt944 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt944 + "," + this.anInt943 + " - " + this.anInt927 + "," + this.anInt928);
				this.method711();
			} catch (@Pc(4532) IOException local4532) {
				this.method606();
			} catch (@Pc(4537) Exception local4537) {
				local164 = "T2 - " + this.anInt944 + "," + this.anInt927 + "," + this.anInt928 + " - " + this.anInt943 + "," + (this.anInt1003 + aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0]) + "," + (this.anInt1004 + aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0]) + " - ";
				for (local350 = 0; local350 < this.anInt943 && local350 < 50; local350++) {
					local164 = local164 + this.aClass3_Sub3_Sub4_9.aByteArray20[local350] + ",";
				}
				signlink.reporterror(local164);
				this.method711();
			}
			return true;
		} catch (@Pc(4618) RuntimeException local4618) {
			signlink.reporterror("83194, " + 0 + ", " + local4618.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method651(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 45 / arg0;
			return arg1 == null ? true : signlink.wavesave(arg1, arg2);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("99759, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Ljava/lang/String;")
	private String method652() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("45884, " + 40981 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class26 local9 = this.aClass26ArrayArrayArray1[this.anInt1056][arg0][arg1];
		if (local9 == null) {
			this.aClass31_1.method358(this.anInt1056, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class3_Sub3_Sub2_Sub5 local23 = null;
		@Pc(27) Class3_Sub3_Sub2_Sub5 local27;
		for (local27 = (Class3_Sub3_Sub2_Sub5) local9.method224(); local27 != null; local27 = (Class3_Sub3_Sub2_Sub5) local9.method226()) {
			@Pc(32) Class1 local32 = Class1.method7(local27.anInt622);
			@Pc(35) int local35 = local32.anInt28;
			if (local32.aBoolean2) {
				local35 *= local27.anInt621 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method222(local23);
		@Pc(65) Class3_Sub3_Sub2_Sub5 local65 = null;
		@Pc(67) Class3_Sub3_Sub2_Sub5 local67 = null;
		for (local27 = (Class3_Sub3_Sub2_Sub5) local9.method224(); local27 != null; local27 = (Class3_Sub3_Sub2_Sub5) local9.method226()) {
			if (local27.anInt622 != local23.anInt622 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt622 != local23.anInt622 && local27.anInt622 != local65.anInt622 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass31_1.method344(arg1, this.method695(this.anInt1056, arg0 * 128 + 64, arg1 * 128 + 64), arg0, local65, this.anInt1056, local23, local110, local67);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method654() {
		try {
			this.aBoolean241 &= true;
			signlink.aBoolean246 = false;
			signlink.anInt1081 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("7015, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method655() {
		try {
			if (this.anInt978 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt923 != 0) {
					local5 = 1;
				}
				for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
					if (this.aStringArray14[local22] != null) {
						@Pc(34) int local34 = this.anIntArray276[local22];
						@Pc(39) String local39 = this.aStringArray13[local22];
						if (local39 != null && local39.startsWith("@cr1@")) {
							local39 = local39.substring(5);
						}
						if (local39 != null && local39.startsWith("@cr2@")) {
							local39 = local39.substring(5);
						}
						if ((local34 == 3 || local34 == 7) && (local34 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method604(local39))) {
							@Pc(92) int local92 = 329 - local5 * 13;
							if (super.anInt836 > 4 && super.anInt837 - 4 > local92 - 10 && super.anInt837 - 4 <= local92 + 3) {
								@Pc(131) int local131 = this.aClass3_Sub3_Sub3_Sub4_3.method562("From:  " + local39 + this.aStringArray14[local22]) + 25;
								if (local131 > 450) {
									local131 = 450;
								}
								if (super.anInt836 < local131 + 4) {
									if (this.anInt990 >= 1) {
										this.aStringArray9[this.anInt1071] = "Report abuse @whi@" + local39;
										this.anIntArray221[this.anInt1071] = 2674;
										this.anInt1071++;
									}
									this.aStringArray9[this.anInt1071] = "Add ignore @whi@" + local39;
									this.anIntArray221[this.anInt1071] = 2478;
									this.anInt1071++;
									this.aStringArray9[this.anInt1071] = "Add friend @whi@" + local39;
									this.anIntArray221[this.anInt1071] = 2050;
									this.anInt1071++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local34 == 5 || local34 == 6) && this.anInt900 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("30974, " + true + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!MRUJPFPS;)Z")
	private boolean method656(@OriginalArg(0) byte arg0, @OriginalArg(1) Class23 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(15) int local15 = arg1.anInt334;
			if (this.anInt1034 == 2) {
				if (local15 == 201) {
					this.aBoolean237 = true;
					this.anInt985 = 0;
					this.aBoolean204 = true;
					this.aString27 = "";
					this.anInt1031 = 1;
					this.aString26 = "Enter name of friend to add to list";
				}
				if (local15 == 202) {
					this.aBoolean237 = true;
					this.anInt985 = 0;
					this.aBoolean204 = true;
					this.aString27 = "";
					this.anInt1031 = 2;
					this.aString26 = "Enter name of friend to delete from list";
				}
			}
			if (local15 == 205) {
				this.anInt947 = 250;
				return true;
			}
			if (local15 == 501) {
				this.aBoolean237 = true;
				this.anInt985 = 0;
				this.aBoolean204 = true;
				this.aString27 = "";
				this.anInt1031 = 4;
				this.aString26 = "Enter name of player to add to list";
			}
			if (local15 == 502) {
				this.aBoolean237 = true;
				this.anInt985 = 0;
				this.aBoolean204 = true;
				this.aString27 = "";
				this.anInt1031 = 5;
				this.aString26 = "Enter name of player to delete from list";
			}
			@Pc(123) int local123;
			@Pc(127) int local127;
			@Pc(132) int local132;
			if (local15 >= 300 && local15 <= 313) {
				local123 = (local15 - 300) / 2;
				local127 = local15 & 0x1;
				local132 = this.anIntArray224[local123];
				if (local132 != -1) {
					while (true) {
						if (local127 == 0) {
							local132--;
							if (local132 < 0) {
								local132 = Class11.anInt215 - 1;
							}
						}
						if (local127 == 1) {
							local132++;
							if (local132 >= Class11.anInt215) {
								local132 = 0;
							}
						}
						if (!Class11.aClass11Array1[local132].aBoolean47 && Class11.aClass11Array1[local132].anInt216 == local123 + (this.aBoolean240 ? 0 : 7)) {
							this.anIntArray224[local123] = local132;
							this.aBoolean218 = true;
							break;
						}
					}
				}
			}
			if (local15 >= 314 && local15 <= 323) {
				local123 = (local15 - 314) / 2;
				local127 = local15 & 0x1;
				local132 = this.anIntArray243[local123];
				if (local127 == 0) {
					local132--;
					if (local132 < 0) {
						local132 = anIntArrayArray24[local123].length - 1;
					}
				}
				if (local127 == 1) {
					local132++;
					if (local132 >= anIntArrayArray24[local123].length) {
						local132 = 0;
					}
				}
				this.anIntArray243[local123] = local132;
				this.aBoolean218 = true;
			}
			if (local15 == 324 && !this.aBoolean240) {
				this.aBoolean240 = true;
				this.method720(this.aByte32);
			}
			if (local15 == 325 && this.aBoolean240) {
				this.aBoolean240 = false;
				this.method720(this.aByte32);
			}
			if (local15 == 326) {
				this.aClass3_Sub3_Sub4_6.method457(162);
				this.aClass3_Sub3_Sub4_6.method458(this.aBoolean240 ? 0 : 1);
				for (local123 = 0; local123 < 7; local123++) {
					this.aClass3_Sub3_Sub4_6.method458(this.anIntArray224[local123]);
				}
				for (local127 = 0; local127 < 5; local127++) {
					this.aClass3_Sub3_Sub4_6.method458(this.anIntArray243[local127]);
				}
				return true;
			}
			if (local15 == 620) {
				this.aBoolean235 = !this.aBoolean235;
			}
			if (local15 >= 601 && local15 <= 613) {
				this.method609();
				if (this.aString30.length() > 0) {
					this.aClass3_Sub3_Sub4_6.method457(16);
					this.aClass3_Sub3_Sub4_6.method464(Class48.method535(this.aString30));
					this.aClass3_Sub3_Sub4_6.method458(local15 - 601);
					this.aClass3_Sub3_Sub4_6.method458(this.aBoolean235 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("65593, " + arg0 + ", " + arg1 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt932 = Integer.parseInt(this.getParameter("nodeid"));
		anInt933 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method605();
		} else {
			method613();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean225 = false;
		} else {
			aBoolean225 = true;
		}
		this.method576();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method657(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean215) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method686(43595);
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

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)I")
	private int method658(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 3;
			if (arg0 != 0) {
				this.anInt856 = -109;
			}
			if (this.anInt1046 < 310) {
				anInt917++;
				if (anInt917 > 151) {
					anInt917 = 0;
					this.aClass3_Sub3_Sub4_6.method457(83);
					this.aClass3_Sub3_Sub4_6.method461(933039);
				}
				@Pc(35) int local35 = this.anInt1043 >> 7;
				@Pc(40) int local40 = this.anInt1045 >> 7;
				@Pc(45) int local45 = aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 >> 7;
				@Pc(50) int local50 = aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1056][local35][local40] & 0x4) != 0) {
					local3 = this.anInt1056;
				}
				@Pc(72) int local72;
				if (local45 > local35) {
					local72 = local45 - local35;
				} else {
					local72 = local35 - local45;
				}
				@Pc(85) int local85;
				if (local50 > local40) {
					local85 = local50 - local40;
				} else {
					local85 = local40 - local50;
				}
				@Pc(100) int local100;
				@Pc(102) int local102;
				if (local72 > local85) {
					local100 = local85 * 65536 / local72;
					local102 = 32768;
					while (local35 != local45) {
						if (local35 < local45) {
							local35++;
						} else if (local35 > local45) {
							local35--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1056][local35][local40] & 0x4) != 0) {
							local3 = this.anInt1056;
						}
						local102 += local100;
						if (local102 >= 65536) {
							local102 -= 65536;
							if (local40 < local50) {
								local40++;
							} else if (local40 > local50) {
								local40--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1056][local35][local40] & 0x4) != 0) {
								local3 = this.anInt1056;
							}
						}
					}
				} else {
					local100 = local72 * 65536 / local85;
					local102 = 32768;
					while (local40 != local50) {
						if (local40 < local50) {
							local40++;
						} else if (local40 > local50) {
							local40--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1056][local35][local40] & 0x4) != 0) {
							local3 = this.anInt1056;
						}
						local102 += local100;
						if (local102 >= 65536) {
							local102 -= 65536;
							if (local35 < local45) {
								local35++;
							} else if (local35 > local45) {
								local35--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1056][local35][local40] & 0x4) != 0) {
								local3 = this.anInt1056;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1056][aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 >> 7][aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 >> 7] & 0x4) != 0) {
				local3 = this.anInt1056;
			}
			return local3;
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("41105, " + arg0 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)I")
	private int method659() {
		try {
			@Pc(9) int local9 = this.method695(this.anInt1056, this.anInt1043, this.anInt1045);
			return local9 - this.anInt1044 >= 800 || (this.aByteArrayArrayArray8[this.anInt1056][this.anInt1043 >> 7][this.anInt1045 >> 7] & 0x4) == 0 ? 3 : this.anInt1056;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("8069, " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method660() {
		try {
			@Pc(7) byte[] local7 = this.aClass22_2.method207("title.dat", null);
			@Pc(13) Class3_Sub3_Sub3_Sub1 local13 = new Class3_Sub3_Sub3_Sub1(local7, this);
			this.aClass17_22.method154();
			local13.method256(0, 0);
			this.aClass17_23.method154();
			local13.method256(-637, 0);
			this.aClass17_19.method154();
			local13.method256(-128, 0);
			this.aClass17_20.method154();
			local13.method256(-202, -371);
			this.aClass17_21.method154();
			local13.method256(-202, -171);
			this.aClass17_24.method154();
			local13.method256(0, -265);
			this.aClass17_25.method154();
			local13.method256(-562, -265);
			this.aClass17_26.method154();
			local13.method256(-128, -171);
			this.aClass17_27.method154();
			local13.method256(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt437];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt438; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt437; local104++) {
					local98[local104] = local13.anIntArray119[local13.anInt437 + local13.anInt437 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt437; local130++) {
					local13.anIntArray119[local130 + local13.anInt437 * local100] = local98[local130];
				}
			}
			this.aClass17_22.method154();
			local13.method256(382, 0);
			this.aClass17_23.method154();
			local13.method256(-255, 0);
			this.aClass17_19.method154();
			local13.method256(254, 0);
			this.aClass17_20.method154();
			this.anInt943 += 0;
			local13.method256(180, -371);
			this.aClass17_21.method154();
			local13.method256(180, -171);
			this.aClass17_24.method154();
			local13.method256(382, -265);
			this.aClass17_25.method154();
			local13.method256(-180, -265);
			this.aClass17_26.method154();
			local13.method256(254, -171);
			this.aClass17_27.method154();
			local13.method256(-180, -171);
			local13 = new Class3_Sub3_Sub3_Sub1(this.aClass22_2, "logo", 0);
			this.aClass17_19.method154();
			local13.method258(382 - local13.anInt437 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("32851, " + 0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method661(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean226) {
				for (@Pc(8) int local8 = 0; local8 < this.anIntArray268.length; local8++) {
					@Pc(15) int local15 = this.anIntArray268[local8];
					if (Class3_Sub3_Sub3_Sub3.anIntArray147[local15] >= arg0) {
						@Pc(24) Class3_Sub3_Sub3_Sub2 local24 = Class3_Sub3_Sub3_Sub3.aClass3_Sub3_Sub3_Sub2Array1[local15];
						@Pc(32) int local32 = local24.anInt458 * local24.anInt459 - 1;
						@Pc(40) int local40 = local24.anInt458 * this.anInt1008 * 2;
						@Pc(43) byte[] local43 = local24.aByteArray17;
						@Pc(46) byte[] local46 = this.aByteArray21;
						for (@Pc(48) int local48 = 0; local48 <= local32; local48++) {
							local46[local48] = local43[local48 - local40 & local32];
						}
						local24.aByteArray17 = local46;
						this.aByteArray21 = local43;
						Class3_Sub3_Sub3_Sub3.method308(local15);
						anInt1023++;
						if (anInt1023 > 196) {
							anInt1023 = 0;
							this.aClass3_Sub3_Sub4_6.method457(67);
							this.aClass3_Sub3_Sub4_6.method459(20956);
						}
					}
				}
				anInt1016++;
				if (anInt1016 > 84) {
					anInt1016 = 0;
					this.aClass3_Sub3_Sub4_6.method457(227);
					return;
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("64974, " + arg0 + ", " + true + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method662() {
		try {
			if (this.aClass17_18 == null) {
				this.method703();
				super.aClass17_2 = null;
				this.aClass17_19 = null;
				this.aClass17_20 = null;
				this.aClass17_21 = null;
				this.aClass17_22 = null;
				this.aClass17_23 = null;
				this.aClass17_24 = null;
				this.aClass17_25 = null;
				this.aClass17_26 = null;
				this.aClass17_27 = null;
				this.aClass17_18 = new Class17((byte) 9, this.method585(), 479, 96);
				this.aClass17_16 = new Class17((byte) 9, this.method585(), 172, 156);
				Class3_Sub3_Sub3.method550();
				this.aClass3_Sub3_Sub3_Sub2_9.method285(0, 0);
				this.aClass17_15 = new Class17((byte) 9, this.method585(), 190, 261);
				this.aClass17_17 = new Class17((byte) 9, this.method585(), 512, 334);
				Class3_Sub3_Sub3.method550();
				this.aClass17_3 = new Class17((byte) 9, this.method585(), 496, 50);
				this.aClass17_4 = new Class17((byte) 9, this.method585(), 269, 37);
				this.aClass17_5 = new Class17((byte) 9, this.method585(), 249, 45);
				this.aBoolean244 = true;
				this.aClass17_17.method154();
				Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("67966, " + 0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method663(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt1000 == 0) {
				this.aStringArray9[0] = "Cancel";
				this.anIntArray221[0] = 1442;
				this.anInt1071 = 1;
				if (this.anInt1017 == -1) {
					this.method655();
					this.anInt925 = 0;
					this.anInt1068 = 0;
					if (super.anInt836 > 4 && super.anInt837 > 4 && super.anInt836 < 516 && super.anInt837 < 338) {
						if (this.anInt1061 == -1) {
							this.method684((byte) 9);
						} else {
							this.method645(4, 0, Class23.method208(this.anInt1061), super.anInt837, super.anInt836, 0, 4);
						}
					}
					if (this.anInt925 != this.anInt848) {
						this.anInt848 = this.anInt925;
					}
					if (this.anInt1068 != this.anInt976) {
						this.anInt976 = this.anInt1068;
					}
					this.anInt925 = 0;
					if (arg0 != 7) {
						this.anInt944 = this.aClass3_Sub3_Sub4_9.method468();
					}
					this.anInt1068 = 0;
					if (super.anInt836 > 553 && super.anInt837 > 205 && super.anInt836 < 743 && super.anInt837 < 466) {
						if (this.anInt899 != -1) {
							this.method645(553, 1, Class23.method208(this.anInt899), super.anInt837, super.anInt836, 0, 205);
						} else if (this.anIntArray251[this.anInt885] != -1) {
							this.method645(553, 1, Class23.method208(this.anIntArray251[this.anInt885]), super.anInt837, super.anInt836, 0, 205);
						}
					}
					if (this.anInt925 != this.anInt1007) {
						this.aBoolean216 = true;
						this.anInt1007 = this.anInt925;
					}
					if (this.anInt1068 != this.anInt906) {
						this.aBoolean216 = true;
						this.anInt906 = this.anInt1068;
					}
					this.anInt925 = 0;
					this.anInt1068 = 0;
					if (super.anInt836 > 17 && super.anInt837 > 357 && super.anInt836 < 496 && super.anInt837 < 453) {
						if (this.anInt903 != -1) {
							this.method645(17, 2, Class23.method208(this.anInt903), super.anInt837, super.anInt836, 0, 357);
						} else if (this.anInt996 != -1) {
							this.method645(17, 3, Class23.method208(this.anInt996), super.anInt837, super.anInt836, 0, 357);
						} else if (super.anInt837 < 434 && super.anInt836 < 426 && this.anInt985 == 0) {
							this.method607(super.anInt837 - 357, super.anInt836 - 17);
						}
					}
					if ((this.anInt903 != -1 || this.anInt996 != -1) && this.anInt925 != this.anInt1051) {
						this.aBoolean237 = true;
						this.anInt1051 = this.anInt925;
					}
					if ((this.anInt903 != -1 || this.anInt996 != -1) && this.anInt1068 != this.anInt872) {
						this.aBoolean237 = true;
						this.anInt872 = this.anInt1068;
					}
					@Pc(351) boolean local351 = false;
					while (!local351) {
						local351 = true;
						for (@Pc(357) int local357 = 0; local357 < this.anInt1071 - 1; local357++) {
							if (this.anIntArray221[local357] < 1000 && this.anIntArray221[local357 + 1] > 1000) {
								@Pc(378) String local378 = this.aStringArray9[local357];
								this.aStringArray9[local357] = this.aStringArray9[local357 + 1];
								this.aStringArray9[local357 + 1] = local378;
								@Pc(400) int local400 = this.anIntArray221[local357];
								this.anIntArray221[local357] = this.anIntArray221[local357 + 1];
								this.anIntArray221[local357 + 1] = local400;
								@Pc(422) int local422 = this.anIntArray219[local357];
								this.anIntArray219[local357] = this.anIntArray219[local357 + 1];
								this.anIntArray219[local357 + 1] = local422;
								@Pc(444) int local444 = this.anIntArray220[local357];
								this.anIntArray220[local357] = this.anIntArray220[local357 + 1];
								this.anIntArray220[local357 + 1] = local444;
								@Pc(466) int local466 = this.anIntArray222[local357];
								this.anIntArray222[local357] = this.anIntArray222[local357 + 1];
								this.anIntArray222[local357 + 1] = local466;
								local351 = false;
							}
						}
					}
				} else {
					this.anInt925 = 0;
					this.anInt1068 = 0;
					this.method645(0, 0, Class23.method208(this.anInt1017), super.anInt837, super.anInt836, 0, 0);
					if (this.anInt925 != this.anInt848) {
						this.anInt848 = this.anInt925;
					}
					if (this.anInt1068 != this.anInt976) {
						this.anInt976 = this.anInt1068;
					}
				}
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("70300, " + arg0 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method664() {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt930; local5++) {
				@Pc(12) int local12 = this.anIntArray239[local5];
				@Pc(17) Class3_Sub3_Sub2_Sub1_Sub1 local17 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local12];
				if (local17 != null) {
					this.method665(local17, local17.aClass30_1.aByte21);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("88305, " + 28319 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CELKGLWS;ZI)V")
	private void method665(@OriginalArg(0) Class3_Sub3_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt685 < 128 || arg0.anInt686 < 128 || arg0.anInt685 >= 13184 || arg0.anInt686 >= 13184) {
				arg0.anInt678 = -1;
				arg0.anInt663 = -1;
				arg0.anInt659 = 0;
				arg0.anInt660 = 0;
				arg0.anInt685 = arg0.anIntArray177[0] * 128 + arg0.anInt654 * 64;
				arg0.anInt686 = arg0.anIntArray178[0] * 128 + arg0.anInt654 * 64;
				arg0.method402();
			}
			if (arg0 == aClass3_Sub3_Sub2_Sub1_Sub2_1 && (arg0.anInt685 < 1536 || arg0.anInt686 < 1536 || arg0.anInt685 >= 11776 || arg0.anInt686 >= 11776)) {
				arg0.anInt678 = -1;
				arg0.anInt663 = -1;
				arg0.anInt659 = 0;
				arg0.anInt660 = 0;
				arg0.anInt685 = arg0.anIntArray177[0] * 128 + arg0.anInt654 * 64;
				arg0.anInt686 = arg0.anIntArray178[0] * 128 + arg0.anInt654 * 64;
				arg0.method402();
			}
			if (arg0.anInt659 > anInt1032) {
				this.method666(arg0);
			} else if (arg0.anInt660 >= anInt1032) {
				this.method667(arg0);
			} else {
				this.method668(arg0);
			}
			this.method669(arg0);
			this.method670(arg0);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("72227, " + arg0 + ", " + false + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CELKGLWS;Z)V")
	private void method666(@OriginalArg(0) Class3_Sub3_Sub2_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt659 - anInt1032;
			@Pc(14) int local14 = arg0.anInt655 * 128 + arg0.anInt654 * 64;
			@Pc(24) int local24 = arg0.anInt657 * 128 + arg0.anInt654 * 64;
			arg0.anInt685 += (local14 - arg0.anInt685) / local4;
			arg0.anInt686 += (local24 - arg0.anInt686) / local4;
			arg0.anInt653 = 0;
			if (arg0.anInt661 == 0) {
				arg0.anInt688 = 1024;
			}
			if (arg0.anInt661 == 1) {
				arg0.anInt688 = 1536;
			}
			if (arg0.anInt661 == 2) {
				arg0.anInt688 = 0;
			}
			if (arg0.anInt661 == 3) {
				arg0.anInt688 = 512;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("97505, " + arg0 + ", " + true + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!CELKGLWS;)V")
	private void method667(@OriginalArg(1) Class3_Sub3_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt660 == anInt1032 || arg0.anInt678 == -1 || arg0.anInt681 != 0 || arg0.anInt680 + 1 > Class46.aClass46Array1[arg0.anInt678].method520(arg0.anInt679)) {
				@Pc(37) int local37 = arg0.anInt660 - arg0.anInt659;
				@Pc(42) int local42 = anInt1032 - arg0.anInt659;
				@Pc(52) int local52 = arg0.anInt655 * 128 + arg0.anInt654 * 64;
				@Pc(62) int local62 = arg0.anInt657 * 128 + arg0.anInt654 * 64;
				@Pc(72) int local72 = arg0.anInt656 * 128 + arg0.anInt654 * 64;
				@Pc(82) int local82 = arg0.anInt658 * 128 + arg0.anInt654 * 64;
				arg0.anInt685 = (local52 * (local37 - local42) + local72 * local42) / local37;
				arg0.anInt686 = (local62 * (local37 - local42) + local82 * local42) / local37;
			}
			arg0.anInt653 = 0;
			if (arg0.anInt661 == 0) {
				arg0.anInt688 = 1024;
			}
			if (arg0.anInt661 == 1) {
				arg0.anInt688 = 1536;
			}
			if (arg0.anInt661 == 2) {
				arg0.anInt688 = 0;
			}
			if (arg0.anInt661 == 3) {
				arg0.anInt688 = 512;
			}
			arg0.anInt687 = arg0.anInt688;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("58252, " + 6 + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CELKGLWS;I)V")
	private void method668(@OriginalArg(0) Class3_Sub3_Sub2_Sub1 arg0) {
		try {
			arg0.anInt644 = arg0.anInt689;
			if (arg0.anInt668 == 0) {
				arg0.anInt653 = 0;
			} else {
				if (arg0.anInt678 != -1 && arg0.anInt681 == 0) {
					@Pc(24) Class46 local24 = Class46.aClass46Array1[arg0.anInt678];
					if (arg0.anInt672 > 0 && local24.anInt786 == 0) {
						arg0.anInt653++;
						return;
					}
					if (arg0.anInt672 <= 0 && local24.anInt787 == 0) {
						arg0.anInt653++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt685;
				@Pc(56) int local56 = arg0.anInt686;
				@Pc(71) int local71 = arg0.anIntArray177[arg0.anInt668 - 1] * 128 + arg0.anInt654 * 64;
				@Pc(86) int local86 = arg0.anIntArray178[arg0.anInt668 - 1] * 128 + arg0.anInt654 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt688 = 1280;
						} else if (local56 > local86) {
							arg0.anInt688 = 1792;
						} else {
							arg0.anInt688 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt688 = 768;
						} else if (local56 > local86) {
							arg0.anInt688 = 256;
						} else {
							arg0.anInt688 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt688 = 1024;
					} else {
						arg0.anInt688 = 0;
					}
					@Pc(180) int local180 = arg0.anInt688 - arg0.anInt687 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt648;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt647;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt650;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt649;
					}
					if (local187 == -1) {
						local187 = arg0.anInt647;
					}
					arg0.anInt644 = local187;
					@Pc(240) int local240 = 4;
					if (arg0.anInt687 != arg0.anInt688 && arg0.anInt691 == -1 && arg0.anInt677 != 0) {
						local240 = 2;
					}
					if (arg0.anInt668 > 2) {
						local240 = 6;
					}
					if (arg0.anInt668 > 3) {
						local240 = 8;
					}
					if (arg0.anInt653 > 0 && arg0.anInt668 > 1) {
						local240 = 8;
						arg0.anInt653--;
					}
					if (arg0.aBooleanArray9[arg0.anInt668 - 1]) {
						local240 <<= 0x1;
					}
					if (local240 >= 8 && arg0.anInt644 == arg0.anInt647 && arg0.anInt683 != -1) {
						arg0.anInt644 = arg0.anInt683;
					}
					if (local53 < local71) {
						arg0.anInt685 += local240;
						if (arg0.anInt685 > local71) {
							arg0.anInt685 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt685 -= local240;
						if (arg0.anInt685 < local71) {
							arg0.anInt685 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt686 += local240;
						if (arg0.anInt686 > local86) {
							arg0.anInt686 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt686 -= local240;
						if (arg0.anInt686 < local86) {
							arg0.anInt686 = local86;
						}
					}
					if (arg0.anInt685 == local71 && arg0.anInt686 == local86) {
						arg0.anInt668--;
						if (arg0.anInt672 > 0) {
							arg0.anInt672--;
							return;
						}
					}
				} else {
					arg0.anInt685 = local71;
					arg0.anInt686 = local86;
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("30218, " + arg0 + ", " + -42323 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CELKGLWS;)V")
	private void method669(@OriginalArg(1) Class3_Sub3_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt677 != 0) {
				@Pc(37) int local37;
				@Pc(43) int local43;
				if (arg0.anInt691 != -1 && arg0.anInt691 < 32768) {
					@Pc(29) Class3_Sub3_Sub2_Sub1_Sub1 local29 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[arg0.anInt691];
					if (local29 != null) {
						local37 = arg0.anInt685 - local29.anInt685;
						local43 = arg0.anInt686 - local29.anInt686;
						if (local37 != 0 || local43 != 0) {
							arg0.anInt688 = (int) (Math.atan2((double) local37, (double) local43) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(68) int local68;
				if (arg0.anInt691 >= 32768) {
					local68 = arg0.anInt691 - 32768;
					if (local68 == this.anInt887) {
						local68 = this.anInt968;
					}
					@Pc(80) Class3_Sub3_Sub2_Sub1_Sub2 local80 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local68];
					if (local80 != null) {
						local43 = arg0.anInt685 - local80.anInt685;
						@Pc(94) int local94 = arg0.anInt686 - local80.anInt686;
						if (local43 != 0 || local94 != 0) {
							arg0.anInt688 = (int) (Math.atan2((double) local43, (double) local94) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt651 != 0 || arg0.anInt652 != 0) && (arg0.anInt668 == 0 || arg0.anInt653 > 0)) {
					local68 = arg0.anInt685 - (arg0.anInt651 - this.anInt1003 - this.anInt1003) * 64;
					local37 = arg0.anInt686 - (arg0.anInt652 - this.anInt1004 - this.anInt1004) * 64;
					if (local68 != 0 || local37 != 0) {
						arg0.anInt688 = (int) (Math.atan2((double) local68, (double) local37) * 325.949D) & 0x7FF;
					}
					arg0.anInt651 = 0;
					arg0.anInt652 = 0;
				}
				local68 = arg0.anInt688 - arg0.anInt687 & 0x7FF;
				if (local68 != 0) {
					if (local68 < arg0.anInt677 || local68 > 2048 - arg0.anInt677) {
						arg0.anInt687 = arg0.anInt688;
					} else if (local68 > 1024) {
						arg0.anInt687 -= arg0.anInt677;
					} else {
						arg0.anInt687 += arg0.anInt677;
					}
					arg0.anInt687 &= 0x7FF;
					if (arg0.anInt644 == arg0.anInt689 && arg0.anInt687 != arg0.anInt688) {
						if (arg0.anInt690 != -1) {
							arg0.anInt644 = arg0.anInt690;
							return;
						}
						arg0.anInt644 = arg0.anInt647;
						return;
					}
				}
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("13435, " + 0 + ", " + arg0 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!CELKGLWS;)V")
	private void method670(@OriginalArg(1) Class3_Sub3_Sub2_Sub1 arg0) {
		try {
			arg0.aBoolean154 = false;
			@Pc(24) Class46 local24;
			if (arg0.anInt644 != -1) {
				local24 = Class46.aClass46Array1[arg0.anInt644];
				arg0.anInt646++;
				if (arg0.anInt645 < local24.anInt780 && arg0.anInt646 > local24.method520(arg0.anInt645)) {
					arg0.anInt646 = 0;
					arg0.anInt645++;
				}
				if (arg0.anInt645 >= local24.anInt780) {
					arg0.anInt646 = 0;
					arg0.anInt645 = 0;
				}
			}
			if (arg0.anInt663 != -1 && anInt1032 >= arg0.anInt666) {
				if (arg0.anInt664 < 0) {
					arg0.anInt664 = 0;
				}
				local24 = Class43.aClass43Array1[arg0.anInt663].aClass46_1;
				arg0.anInt665++;
				while (arg0.anInt664 < local24.anInt780 && arg0.anInt665 > local24.method520(arg0.anInt664)) {
					arg0.anInt665 -= local24.method520(arg0.anInt664);
					arg0.anInt664++;
				}
				if (arg0.anInt664 >= local24.anInt780 && (arg0.anInt664 < 0 || arg0.anInt664 >= local24.anInt780)) {
					arg0.anInt663 = -1;
				}
			}
			if (arg0.anInt678 != -1 && arg0.anInt681 <= 1) {
				local24 = Class46.aClass46Array1[arg0.anInt678];
				if (local24.anInt786 == 1 && arg0.anInt672 > 0 && arg0.anInt659 <= anInt1032 && arg0.anInt660 < anInt1032) {
					arg0.anInt681 = 1;
					return;
				}
			}
			if (arg0.anInt678 != -1 && arg0.anInt681 == 0) {
				local24 = Class46.aClass46Array1[arg0.anInt678];
				arg0.anInt680++;
				while (arg0.anInt679 < local24.anInt780 && arg0.anInt680 > local24.method520(arg0.anInt679)) {
					arg0.anInt680 -= local24.method520(arg0.anInt679);
					arg0.anInt679++;
				}
				if (arg0.anInt679 >= local24.anInt780) {
					arg0.anInt679 -= local24.anInt781;
					arg0.anInt682++;
					if (arg0.anInt682 >= local24.anInt785) {
						arg0.anInt678 = -1;
					}
					if (arg0.anInt679 < 0 || arg0.anInt679 >= local24.anInt780) {
						arg0.anInt678 = -1;
					}
				}
				arg0.aBoolean154 = local24.aBoolean177;
			}
			if (arg0.anInt681 > 0) {
				arg0.anInt681--;
			}
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("75448, " + 4 + ", " + arg0 + ", " + local269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method671() {
		try {
			this.aBoolean241 &= true;
			if (this.anInt1017 == -1 || this.anInt1054 != 2 && super.aClass17_2 == null) {
				if (this.aBoolean244) {
					this.method662();
					this.aBoolean244 = false;
					this.aClass17_6.method155(super.aGraphics2, 0, 4);
					this.aClass17_7.method155(super.aGraphics2, 0, 357);
					this.aClass17_8.method155(super.aGraphics2, 722, 4);
					this.aClass17_9.method155(super.aGraphics2, 743, 205);
					this.aClass17_10.method155(super.aGraphics2, 0, 0);
					this.aClass17_11.method155(super.aGraphics2, 516, 4);
					this.aClass17_12.method155(super.aGraphics2, 516, 205);
					this.aClass17_13.method155(super.aGraphics2, 496, 357);
					this.aClass17_14.method155(super.aGraphics2, 0, 338);
					this.aBoolean216 = true;
					this.aBoolean237 = true;
					this.aBoolean214 = true;
					this.aBoolean234 = true;
					if (this.anInt1054 != 2) {
						this.aClass17_17.method155(super.aGraphics2, 4, 4);
						this.aClass17_16.method155(super.aGraphics2, 550, 4);
					}
				}
				if (this.anInt1054 == 2) {
					this.method685();
				}
				if (this.aBoolean223 && this.anInt950 == 1) {
					this.aBoolean216 = true;
				}
				@Pc(286) boolean local286;
				if (this.anInt899 != -1) {
					local286 = this.method598(this.anInt1008, this.anInt899);
					if (local286) {
						this.aBoolean216 = true;
					}
				}
				if (this.anInt965 == 2) {
					this.aBoolean216 = true;
				}
				if (this.anInt1000 == 2) {
					this.aBoolean216 = true;
				}
				if (this.aBoolean216) {
					this.method701(this.aBoolean209);
					this.aBoolean216 = false;
				}
				@Pc(372) int local372;
				if (this.anInt903 == -1 && this.anInt985 == 0) {
					this.aClass23_1.anInt336 = this.anInt1010 - this.anInt1069 - 77;
					if (super.anInt836 > 448 && super.anInt836 < 560 && super.anInt837 > 332) {
						this.method640(77, 463, this.aClass23_1, super.anInt836 - 17, super.anInt837 - 357, 0, this.anInt1010, -1);
					}
					local372 = this.anInt1010 - this.aClass23_1.anInt336 - 77;
					if (local372 < 0) {
						local372 = 0;
					}
					if (local372 > this.anInt1010 - 77) {
						local372 = this.anInt1010 - 77;
					}
					if (this.anInt1069 != local372) {
						this.anInt1069 = local372;
						this.aBoolean237 = true;
					}
				}
				if (this.anInt903 == -1 && this.anInt985 == 3) {
					local372 = this.anInt880 * 14 + 7;
					this.aClass23_1.anInt336 = this.anInt881;
					if (super.anInt836 > 448 && super.anInt836 < 560 && super.anInt837 > 332) {
						this.method640(77, 463, this.aClass23_1, super.anInt836 - 17, super.anInt837 - 357, 0, local372, -1);
					}
					@Pc(451) int local451 = this.aClass23_1.anInt336;
					if (local451 < 0) {
						local451 = 0;
					}
					if (local451 > local372 - 77) {
						local451 = local372 - 77;
					}
					if (this.anInt881 != local451) {
						this.anInt881 = local451;
						this.aBoolean237 = true;
					}
				}
				if (this.anInt903 != -1) {
					local286 = this.method598(this.anInt1008, this.anInt903);
					if (local286) {
						this.aBoolean237 = true;
					}
				}
				if (this.anInt965 == 3) {
					this.aBoolean237 = true;
				}
				if (this.anInt1000 == 3) {
					this.aBoolean237 = true;
				}
				if (this.aString31 != null) {
					this.aBoolean237 = true;
				}
				if (this.aBoolean223 && this.anInt950 == 2) {
					this.aBoolean237 = true;
				}
				if (this.aBoolean237) {
					this.method689();
					this.aBoolean237 = false;
				}
				if (this.anInt1054 == 2) {
					this.method593();
					this.aClass17_16.method155(super.aGraphics2, 550, 4);
				}
				if (this.anInt897 != -1) {
					this.aBoolean214 = true;
				}
				if (this.aBoolean214) {
					if (this.anInt897 != -1 && this.anInt897 == this.anInt885) {
						this.anInt897 = -1;
						this.aClass3_Sub3_Sub4_6.method457(22);
						this.aClass3_Sub3_Sub4_6.method458(this.anInt885);
					}
					this.aBoolean214 = false;
					this.aClass17_5.method154();
					this.aClass3_Sub3_Sub3_Sub2_18.method285(0, 0);
					if (this.anInt899 == -1) {
						if (this.anIntArray251[this.anInt885] != -1) {
							if (this.anInt885 == 0) {
								this.aClass3_Sub3_Sub3_Sub2_11.method285(22, 10);
							}
							if (this.anInt885 == 1) {
								this.aClass3_Sub3_Sub3_Sub2_12.method285(54, 8);
							}
							if (this.anInt885 == 2) {
								this.aClass3_Sub3_Sub3_Sub2_12.method285(82, 8);
							}
							if (this.anInt885 == 3) {
								this.aClass3_Sub3_Sub3_Sub2_13.method285(110, 8);
							}
							if (this.anInt885 == 4) {
								this.aClass3_Sub3_Sub3_Sub2_15.method285(153, 8);
							}
							if (this.anInt885 == 5) {
								this.aClass3_Sub3_Sub3_Sub2_15.method285(181, 8);
							}
							if (this.anInt885 == 6) {
								this.aClass3_Sub3_Sub3_Sub2_14.method285(209, 9);
							}
						}
						if (this.anIntArray251[0] != -1 && (this.anInt897 != 0 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[0].method285(29, 13);
						}
						if (this.anIntArray251[1] != -1 && (this.anInt897 != 1 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[1].method285(53, 11);
						}
						if (this.anIntArray251[2] != -1 && (this.anInt897 != 2 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[2].method285(82, 11);
						}
						if (this.anIntArray251[3] != -1 && (this.anInt897 != 3 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[3].method285(115, 12);
						}
						if (this.anIntArray251[4] != -1 && (this.anInt897 != 4 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[4].method285(153, 13);
						}
						if (this.anIntArray251[5] != -1 && (this.anInt897 != 5 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[5].method285(180, 11);
						}
						if (this.anIntArray251[6] != -1 && (this.anInt897 != 6 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[6].method285(208, 13);
						}
					}
					this.aClass17_5.method155(super.aGraphics2, 516, 160);
					anInt1025++;
					if (anInt1025 > 1132) {
						anInt1025 = 0;
						this.aClass3_Sub3_Sub4_6.method457(138);
						this.aClass3_Sub3_Sub4_6.method458(0);
						local372 = this.aClass3_Sub3_Sub4_6.anInt738;
						this.aClass3_Sub3_Sub4_6.method459(39349);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass3_Sub3_Sub4_6.method459(14942);
						}
						this.aClass3_Sub3_Sub4_6.method459((int) (Math.random() * 65536.0D));
						this.aClass3_Sub3_Sub4_6.method459((int) (Math.random() * 65536.0D));
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass3_Sub3_Sub4_6.method458(75);
						}
						this.aClass3_Sub3_Sub4_6.method459(61516);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass3_Sub3_Sub4_6.method459(4375);
						}
						this.aClass3_Sub3_Sub4_6.method458(97);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass3_Sub3_Sub4_6.method459(29661);
						}
						this.aClass3_Sub3_Sub4_6.method459(5785);
						this.aClass3_Sub3_Sub4_6.method467(this.aClass3_Sub3_Sub4_6.anInt738 - local372, 371);
					}
					this.aClass17_4.method154();
					this.aClass3_Sub3_Sub3_Sub2_17.method285(0, 0);
					if (this.anInt899 == -1) {
						if (this.anIntArray251[this.anInt885] != -1) {
							if (this.anInt885 == 7) {
								this.aClass3_Sub3_Sub3_Sub2_3.method285(42, 0);
							}
							if (this.anInt885 == 8) {
								this.aClass3_Sub3_Sub3_Sub2_4.method285(74, 0);
							}
							if (this.anInt885 == 9) {
								this.aClass3_Sub3_Sub3_Sub2_4.method285(102, 0);
							}
							if (this.anInt885 == 10) {
								this.aClass3_Sub3_Sub3_Sub2_5.method285(130, 1);
							}
							if (this.anInt885 == 11) {
								this.aClass3_Sub3_Sub3_Sub2_7.method285(173, 0);
							}
							if (this.anInt885 == 12) {
								this.aClass3_Sub3_Sub3_Sub2_7.method285(201, 0);
							}
							if (this.anInt885 == 13) {
								this.aClass3_Sub3_Sub3_Sub2_6.method285(229, 0);
							}
						}
						if (this.anIntArray251[8] != -1 && (this.anInt897 != 8 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[7].method285(74, 2);
						}
						if (this.anIntArray251[9] != -1 && (this.anInt897 != 9 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[8].method285(102, 3);
						}
						if (this.anIntArray251[10] != -1 && (this.anInt897 != 10 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[9].method285(137, 4);
						}
						if (this.anIntArray251[11] != -1 && (this.anInt897 != 11 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[10].method285(174, 2);
						}
						if (this.anIntArray251[12] != -1 && (this.anInt897 != 12 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[11].method285(201, 2);
						}
						if (this.anIntArray251[13] != -1 && (this.anInt897 != 13 || anInt1032 % 20 < 10)) {
							this.aClass3_Sub3_Sub3_Sub2Array3[12].method285(226, 2);
						}
					}
					this.aClass17_4.method155(super.aGraphics2, 496, 466);
					this.aClass17_17.method154();
					Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
				}
				if (this.aBoolean234) {
					this.aBoolean234 = false;
					this.aClass17_3.method154();
					this.aClass3_Sub3_Sub3_Sub2_16.method285(0, 0);
					this.aClass3_Sub3_Sub3_Sub4_3.method561(16777215, true, "Public chat", 55, 28);
					if (this.anInt937 == 0) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(65280, true, "On", 55, 41);
					}
					if (this.anInt937 == 1) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(16776960, true, "Friends", 55, 41);
					}
					if (this.anInt937 == 2) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(16711680, true, "Off", 55, 41);
					}
					if (this.anInt937 == 3) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(65535, true, "Hide", 55, 41);
					}
					this.aClass3_Sub3_Sub3_Sub4_3.method561(16777215, true, "Private chat", 184, 28);
					if (this.anInt900 == 0) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(65280, true, "On", 184, 41);
					}
					if (this.anInt900 == 1) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(16776960, true, "Friends", 184, 41);
					}
					if (this.anInt900 == 2) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(16711680, true, "Off", 184, 41);
					}
					this.aClass3_Sub3_Sub3_Sub4_3.method561(16777215, true, "Trade/compete", 324, 28);
					if (this.anInt1024 == 0) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(65280, true, "On", 324, 41);
					}
					if (this.anInt1024 == 1) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(16776960, true, "Friends", 324, 41);
					}
					if (this.anInt1024 == 2) {
						this.aClass3_Sub3_Sub3_Sub4_3.method561(16711680, true, "Off", 324, 41);
					}
					this.aClass3_Sub3_Sub3_Sub4_3.method561(16777215, true, "Report abuse", 458, 33);
					this.aClass17_3.method155(super.aGraphics2, 0, 453);
					this.aClass17_17.method154();
					Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
				}
				this.anInt1008 = 0;
			} else {
				if (this.anInt1054 == 2) {
					this.method598(this.anInt1008, this.anInt1017);
					if (this.anInt975 != -1) {
						this.method598(this.anInt1008, this.anInt975);
					}
					this.anInt1008 = 0;
					this.method719();
					super.aClass17_2.method154();
					Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray234;
					Class3_Sub3_Sub3.method550();
					this.aBoolean244 = true;
					@Pc(62) Class23 local62 = Class23.method208(this.anInt1017);
					if (local62.anInt335 == 512 && local62.anInt348 == 334 && local62.anInt355 == 0) {
						local62.anInt335 = 765;
						local62.anInt348 = 503;
					}
					this.method626(0, 0, this.aByte42, local62, 0);
					if (this.anInt975 != -1) {
						local62 = Class23.method208(this.anInt975);
						if (local62.anInt335 == 512 && local62.anInt348 == 334 && local62.anInt355 == 0) {
							local62.anInt335 = 765;
							local62.anInt348 = 503;
						}
						this.method626(0, 0, this.aByte42, local62, 0);
					}
					if (this.aBoolean223) {
						this.method646();
					} else {
						this.method663(this.anInt1055);
						this.method707();
					}
				}
				super.aClass17_2.method155(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(1378) RuntimeException local1378) {
			signlink.reporterror("15186, " + true + ", " + local1378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method672(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt978 != 0) {
				@Pc(6) Class3_Sub3_Sub3_Sub4 local6 = this.aClass3_Sub3_Sub3_Sub4_3;
				@Pc(8) int local8 = 0;
				if (this.anInt923 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray14[local15] != null) {
						@Pc(27) int local27 = this.anIntArray276[local15];
						@Pc(32) String local32 = this.aStringArray13[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method604(local32))) {
							local85 = 329 - local8 * 13;
							local6.method564(0, local85, "From", 4);
							local6.method564(65535, local85 - 1, "From", 4);
							@Pc(110) int local110 = local6.method562("From ") + 4;
							if (local34 == 1) {
								this.aClass3_Sub3_Sub3_Sub2Array5[0].method285(local110, local85 - 12);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass3_Sub3_Sub3_Sub2Array5[1].method285(local110, local85 - 12);
								local110 += 14;
							}
							local6.method564(0, local85, local32 + ": " + this.aStringArray14[local15], local110);
							local6.method564(65535, local85 - 1, local32 + ": " + this.aStringArray14[local15], local110);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt900 < 2) {
							local85 = 329 - local8 * 13;
							local6.method564(0, local85, this.aStringArray14[local15], 4);
							local6.method564(65535, local85 - 1, this.aStringArray14[local15], 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt900 < 2) {
							local85 = 329 - local8 * 13;
							local6.method564(0, local85, "To " + local32 + ": " + this.aStringArray14[local15], 4);
							local6.method564(65535, local85 - 1, "To " + local32 + ": " + this.aStringArray14[local15], 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				if (arg0 > 0) {
					;
				}
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("51396, " + arg0 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method673() {
		try {
			try {
				@Pc(16) int local16 = aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 + this.anInt1072;
				@Pc(22) int local22 = aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 + this.anInt1063;
				if (this.anInt882 - local16 < -500 || this.anInt882 - local16 > 500 || this.anInt883 - local22 < -500 || this.anInt883 - local22 > 500) {
					this.anInt882 = local16;
					this.anInt883 = local22;
				}
				if (this.anInt882 != local16) {
					this.anInt882 += (local16 - this.anInt882) / 16;
				}
				if (this.anInt883 != local22) {
					this.anInt883 += (local22 - this.anInt883) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1021 += (-this.anInt1021 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1021 += (24 - this.anInt1021) / 2;
				} else {
					this.anInt1021 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1022 += (12 - this.anInt1022) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1022 += (-this.anInt1022 - 12) / 2;
				} else {
					this.anInt1022 /= 2;
				}
				this.anInt1020 = this.anInt1020 + this.anInt1021 / 2 & 0x7FF;
				this.anInt1019 += this.anInt1022 / 2;
				if (this.anInt1019 < 128) {
					this.anInt1019 = 128;
				}
				if (this.anInt1019 > 383) {
					this.anInt1019 = 383;
				}
				anInt865++;
				@Pc(226) int local226;
				if (anInt865 > 1275) {
					anInt865 = 0;
					this.aClass3_Sub3_Sub4_6.method457(248);
					this.aClass3_Sub3_Sub4_6.method458(0);
					local226 = this.aClass3_Sub3_Sub4_6.anInt738;
					this.aClass3_Sub3_Sub4_6.method458(67);
					this.aClass3_Sub3_Sub4_6.method459((int) (Math.random() * 65536.0D));
					this.aClass3_Sub3_Sub4_6.method458(218);
					this.aClass3_Sub3_Sub4_6.method459(61710);
					this.aClass3_Sub3_Sub4_6.method459(50460);
					this.aClass3_Sub3_Sub4_6.method459((int) (Math.random() * 65536.0D));
					this.aClass3_Sub3_Sub4_6.method458(212);
					this.aClass3_Sub3_Sub4_6.method458((int) (Math.random() * 256.0D));
					this.aClass3_Sub3_Sub4_6.method458(223);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub3_Sub4_6.method459(26572);
					}
					this.aClass3_Sub3_Sub4_6.method467(this.aClass3_Sub3_Sub4_6.anInt738 - local226, 371);
				}
				local226 = this.anInt882 >> 7;
				@Pc(299) int local299 = this.anInt883 >> 7;
				@Pc(309) int local309 = this.method695(this.anInt1056, this.anInt882, this.anInt883);
				@Pc(311) int local311 = 0;
				@Pc(327) int local327;
				if (local226 > 3 && local299 > 3 && local226 < 100 && local299 < 100) {
					for (local327 = local226 - 4; local327 <= local226 + 4; local327++) {
						for (@Pc(333) int local333 = local299 - 4; local333 <= local299 + 4; local333++) {
							@Pc(338) int local338 = this.anInt1056;
							if (local338 < 3 && (this.aByteArrayArrayArray8[1][local327][local333] & 0x2) == 2) {
								local338++;
							}
							@Pc(365) int local365 = local309 - this.anIntArrayArrayArray8[local338][local327][local333];
							if (local365 > local311) {
								local311 = local365;
							}
						}
					}
				}
				local327 = local311 * 192;
				if (local327 > 98048) {
					local327 = 98048;
				}
				if (local327 < 32768) {
					local327 = 32768;
				}
				if (local327 > this.anInt1057) {
					this.anInt1057 += (local327 - this.anInt1057) / 24;
				} else if (local327 < this.anInt1057) {
					this.anInt1057 += (local327 - this.anInt1057) / 80;
				}
			} catch (@Pc(429) Exception local429) {
				signlink.reporterror("glfc_ex " + aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 + "," + aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 + "," + this.anInt882 + "," + this.anInt883 + "," + this.anInt851 + "," + this.anInt852 + "," + this.anInt1003 + "," + this.anInt1004);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(479) RuntimeException local479) {
			signlink.reporterror("25627, " + -806 + ", " + local479.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method674() {
		try {
			@Pc(7) int local7 = this.aClass3_Sub3_Sub3_Sub4_4.method562("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt1071; local9++) {
				local20 = this.aClass3_Sub3_Sub3_Sub4_4.method562(this.aStringArray9[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt1071 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt842 > 4 && super.anInt843 > 4 && super.anInt842 < 516 && super.anInt843 < 338) {
				local70 = super.anInt842 - local7 / 2 - 4;
				if (local70 + local7 > 512) {
					local70 = 512 - local7;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt843 - 4;
				if (local88 + local20 > 334) {
					local88 = 334 - local20;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean223 = true;
				this.anInt950 = 0;
				this.anInt951 = local70;
				this.anInt952 = local88;
				this.anInt953 = local7;
				this.anInt954 = this.anInt1071 * 15 + 22;
			}
			if (super.anInt842 > 553 && super.anInt843 > 205 && super.anInt842 < 743 && super.anInt843 < 466) {
				local70 = super.anInt842 - local7 / 2 - 553;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 190) {
					local70 = 190 - local7;
				}
				local88 = super.anInt843 - 205;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 261) {
					local88 = 261 - local20;
				}
				this.aBoolean223 = true;
				this.anInt950 = 1;
				this.anInt951 = local70;
				this.anInt952 = local88;
				this.anInt953 = local7;
				this.anInt954 = this.anInt1071 * 15 + 22;
			}
			if (super.anInt842 > 17 && super.anInt843 > 357 && super.anInt842 < 496 && super.anInt843 < 453) {
				local70 = super.anInt842 - local7 / 2 - 17;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 479) {
					local70 = 479 - local7;
				}
				local88 = super.anInt843 - 357;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 96) {
					local88 = 96 - local20;
				}
				this.aBoolean223 = true;
				this.anInt950 = 2;
				this.anInt951 = local70;
				this.anInt952 = local88;
				this.anInt953 = local7;
				this.anInt954 = this.anInt1071 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("63634, " + 8 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method675(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) Class23 local6 = Class23.method208(arg0);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray104.length && local6.anIntArray104[local8] != -1; local8++) {
				@Pc(22) Class23 local22 = Class23.method208(local6.anIntArray104[local8]);
				if (local22.anInt355 == 1) {
					this.method675(local22.anInt363);
				}
				local22.anInt372 = 0;
				local22.anInt337 = 0;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("58767, " + arg0 + ", " + 1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method676() {
		try {
			this.aBoolean236 = true;
			try {
				@Pc(16) long local16 = System.currentTimeMillis();
				@Pc(18) int local18 = 0;
				@Pc(20) int local20 = 20;
				while (this.aBoolean243) {
					this.anInt862++;
					this.method706();
					this.method706();
					this.method688();
					local18++;
					if (local18 > 10) {
						@Pc(43) long local43 = System.currentTimeMillis();
						@Pc(52) int local52 = (int) (local43 - local16) / 10 - local20;
						local20 = 40 - local52;
						if (local20 < 5) {
							local20 = 5;
						}
						local18 = 0;
						local16 = local43;
					}
					try {
						Thread.sleep((long) local20);
					} catch (@Pc(70) Exception local70) {
					}
				}
			} catch (@Pc(76) Exception local76) {
			}
			this.aBoolean236 = false;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("43687, " + -8090 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method677() {
		try {
			for (@Pc(12) Class3_Sub3_Sub2_Sub4 local12 = (Class3_Sub3_Sub2_Sub4) this.aClass26_12.method224(); local12 != null; local12 = (Class3_Sub3_Sub2_Sub4) this.aClass26_12.method226()) {
				if (local12.anInt408 != this.anInt1056 || anInt1032 > local12.anInt405) {
					local12.method545();
				} else if (anInt1032 >= local12.anInt404) {
					if (local12.anInt403 > 0) {
						@Pc(42) Class3_Sub3_Sub2_Sub1_Sub1 local42 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local12.anInt403 - 1];
						if (local42 != null && local42.anInt685 >= 0 && local42.anInt685 < 13312 && local42.anInt686 >= 0 && local42.anInt686 < 13312) {
							local12.method233(anInt1032, this.method695(local12.anInt408, local42.anInt685, local42.anInt686) - local12.anInt412, local42.anInt686, local42.anInt685);
						}
					}
					if (local12.anInt403 < 0) {
						@Pc(87) int local87 = -local12.anInt403 - 1;
						@Pc(93) Class3_Sub3_Sub2_Sub1_Sub2 local93;
						if (local87 == this.anInt887) {
							local93 = aClass3_Sub3_Sub2_Sub1_Sub2_1;
						} else {
							local93 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local87];
						}
						if (local93 != null && local93.anInt685 >= 0 && local93.anInt685 < 13312 && local93.anInt686 >= 0 && local93.anInt686 < 13312) {
							local12.method233(anInt1032, this.method695(local12.anInt408, local93.anInt685, local93.anInt686) - local12.anInt412, local93.anInt686, local93.anInt685);
						}
					}
					local12.method234(this.anInt1008);
					this.aClass31_1.method348(this.anInt1056, -1, 60, local12, (int) local12.aDouble2, (int) local12.aDouble1, local12.anInt399, (int) local12.aDouble3, false);
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("10012, " + -80 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method678() {
		try {
			while (true) {
				@Pc(9) int local9 = this.method579();
				if (local9 == -1) {
					return;
				}
				if (this.anInt1061 != -1 && this.anInt1061 == this.anInt938) {
					if (local9 == 8 && this.aString30.length() > 0) {
						this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
					}
					if ((local9 >= 97 && local9 <= 122 || local9 >= 65 && local9 <= 90 || local9 >= 48 && local9 <= 57 || local9 == 32) && this.aString30.length() < 12) {
						this.aString30 = this.aString30 + (char) local9;
					}
				} else {
					@Pc(189) int local189;
					if (this.aBoolean204) {
						if (local9 >= 32 && local9 <= 122 && this.aString27.length() < 80) {
							this.aString27 = this.aString27 + (char) local9;
							this.aBoolean237 = true;
						}
						if (local9 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean237 = true;
						}
						if (local9 == 13 || local9 == 10) {
							this.aBoolean204 = false;
							this.aBoolean237 = true;
							@Pc(149) long local149;
							if (this.anInt1031 == 1) {
								local149 = Class48.method535(this.aString27);
								this.method633(local149);
							}
							if (this.anInt1031 == 2 && this.anInt1033 > 0) {
								local149 = Class48.method535(this.aString27);
								this.method591(438, local149);
							}
							if (this.anInt1031 == 3 && this.aString27.length() > 0) {
								this.aClass3_Sub3_Sub4_6.method457(39);
								this.aClass3_Sub3_Sub4_6.method458(0);
								local189 = this.aClass3_Sub3_Sub4_6.anInt738;
								this.aClass3_Sub3_Sub4_6.method464(this.aLong31);
								Class19.method180(this.anInt856, this.aClass3_Sub3_Sub4_6, this.aString27);
								this.aClass3_Sub3_Sub4_6.method467(this.aClass3_Sub3_Sub4_6.anInt738 - local189, 371);
								this.aString27 = Class19.method181(this.aString27);
								this.aString27 = Class35.method418(this.aString27);
								this.method716((byte) 2, 6, this.aString27, Class48.method539(Class48.method536(this.aBoolean224, this.aLong31)));
								if (this.anInt900 == 2) {
									this.anInt900 = 1;
									this.aBoolean234 = true;
									this.aClass3_Sub3_Sub4_6.method457(102);
									this.aClass3_Sub3_Sub4_6.method458(this.anInt937);
									this.aClass3_Sub3_Sub4_6.method458(this.anInt900);
									this.aClass3_Sub3_Sub4_6.method458(this.anInt1024);
								}
							}
							if (this.anInt1031 == 4 && this.anInt894 < 100) {
								local149 = Class48.method535(this.aString27);
								this.method682(local149);
							}
							if (this.anInt1031 == 5 && this.anInt894 > 0) {
								local149 = Class48.method535(this.aString27);
								this.method634((byte) 6, local149);
							}
						}
					} else if (this.anInt985 == 1) {
						if (local9 >= 48 && local9 <= 57 && this.aString25.length() < 10) {
							this.aString25 = this.aString25 + (char) local9;
							this.aBoolean237 = true;
						}
						if (local9 == 8 && this.aString25.length() > 0) {
							this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							this.aBoolean237 = true;
						}
						if (local9 == 13 || local9 == 10) {
							if (this.aString25.length() > 0) {
								local189 = 0;
								try {
									local189 = Integer.parseInt(this.aString25);
								} catch (@Pc(368) Exception local368) {
								}
								this.aClass3_Sub3_Sub4_6.method457(245);
								this.aClass3_Sub3_Sub4_6.method462(local189);
							}
							this.anInt985 = 0;
							this.aBoolean237 = true;
						}
					} else if (this.anInt985 == 2) {
						if (local9 >= 32 && local9 <= 122 && this.aString25.length() < 12) {
							this.aString25 = this.aString25 + (char) local9;
							this.aBoolean237 = true;
						}
						if (local9 == 8 && this.aString25.length() > 0) {
							this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							this.aBoolean237 = true;
						}
						if (local9 == 13 || local9 == 10) {
							if (this.aString25.length() > 0) {
								this.aClass3_Sub3_Sub4_6.method457(188);
								this.aClass3_Sub3_Sub4_6.method464(Class48.method535(this.aString25));
							}
							this.anInt985 = 0;
							this.aBoolean237 = true;
						}
					} else if (this.anInt985 == 3) {
						if (local9 >= 32 && local9 <= 122 && this.aString25.length() < 40) {
							this.aString25 = this.aString25 + (char) local9;
							this.aBoolean237 = true;
						}
						if (local9 == 8 && this.aString25.length() > 0) {
							this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							this.aBoolean237 = true;
						}
					} else if (this.anInt903 == -1 && this.anInt1017 == -1) {
						if (local9 >= 32 && local9 <= 122 && this.aString24.length() < 80) {
							this.aString24 = this.aString24 + (char) local9;
							this.aBoolean237 = true;
						}
						if (local9 == 8 && this.aString24.length() > 0) {
							this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
							this.aBoolean237 = true;
						}
						if ((local9 == 13 || local9 == 10) && this.aString24.length() > 0) {
							if (this.anInt990 == 2) {
								if (this.aString24.equals("::clientdrop")) {
									this.method606();
								}
								if (this.aString24.equals("::lag")) {
									this.method709();
								}
								if (this.aString24.equals("::prefetchmusic")) {
									for (local189 = 0; local189 < this.aClass6_Sub1_1.method175(2); local189++) {
										this.aClass6_Sub1_1.method166(2, local189, (byte) 1);
									}
								}
								if (this.aString24.equals("::fpson")) {
									aBoolean230 = true;
								}
								if (this.aString24.equals("::fpsoff")) {
									aBoolean230 = false;
								}
								if (this.aString24.equals("::noclip")) {
									for (local189 = 0; local189 < 4; local189++) {
										for (@Pc(653) int local653 = 1; local653 < 103; local653++) {
											for (@Pc(657) int local657 = 1; local657 < 103; local657++) {
												this.aClass4Array1[local189].anIntArrayArray1[local653][local657] = 0;
											}
										}
									}
								}
							}
							if (this.aString24.startsWith("::")) {
								this.aClass3_Sub3_Sub4_6.method457(200);
								this.aClass3_Sub3_Sub4_6.method458(this.aString24.length() - 1);
								this.aClass3_Sub3_Sub4_6.method465(this.aString24.substring(2));
							} else {
								@Pc(712) String local712 = this.aString24.toLowerCase();
								@Pc(714) byte local714 = 0;
								if (local712.startsWith("yellow:")) {
									local714 = 0;
									this.aString24 = this.aString24.substring(7);
								} else if (local712.startsWith("red:")) {
									local714 = 1;
									this.aString24 = this.aString24.substring(4);
								} else if (local712.startsWith("green:")) {
									local714 = 2;
									this.aString24 = this.aString24.substring(6);
								} else if (local712.startsWith("cyan:")) {
									local714 = 3;
									this.aString24 = this.aString24.substring(5);
								} else if (local712.startsWith("purple:")) {
									local714 = 4;
									this.aString24 = this.aString24.substring(7);
								} else if (local712.startsWith("white:")) {
									local714 = 5;
									this.aString24 = this.aString24.substring(6);
								} else if (local712.startsWith("flash1:")) {
									local714 = 6;
									this.aString24 = this.aString24.substring(7);
								} else if (local712.startsWith("flash2:")) {
									local714 = 7;
									this.aString24 = this.aString24.substring(7);
								} else if (local712.startsWith("flash3:")) {
									local714 = 8;
									this.aString24 = this.aString24.substring(7);
								} else if (local712.startsWith("glow1:")) {
									local714 = 9;
									this.aString24 = this.aString24.substring(6);
								} else if (local712.startsWith("glow2:")) {
									local714 = 10;
									this.aString24 = this.aString24.substring(6);
								} else if (local712.startsWith("glow3:")) {
									local714 = 11;
									this.aString24 = this.aString24.substring(6);
								}
								local712 = this.aString24.toLowerCase();
								@Pc(886) byte local886 = 0;
								if (local712.startsWith("wave:")) {
									local886 = 1;
									this.aString24 = this.aString24.substring(5);
								} else if (local712.startsWith("wave2:")) {
									local886 = 2;
									this.aString24 = this.aString24.substring(6);
								} else if (local712.startsWith("shake:")) {
									local886 = 3;
									this.aString24 = this.aString24.substring(6);
								} else if (local712.startsWith("scroll:")) {
									local886 = 4;
									this.aString24 = this.aString24.substring(7);
								} else if (local712.startsWith("slide:")) {
									local886 = 5;
									this.aString24 = this.aString24.substring(6);
								}
								this.aClass3_Sub3_Sub4_6.method457(7);
								this.aClass3_Sub3_Sub4_6.method458(0);
								@Pc(967) int local967 = this.aClass3_Sub3_Sub4_6.anInt738;
								this.aClass3_Sub3_Sub4_7.anInt738 = 0;
								Class19.method180(this.anInt856, this.aClass3_Sub3_Sub4_7, this.aString24);
								this.aClass3_Sub3_Sub4_6.method504(this.aClass3_Sub3_Sub4_7.aByteArray20, this.aClass3_Sub3_Sub4_7.anInt738);
								this.aClass3_Sub3_Sub4_6.method484(local886);
								this.aClass3_Sub3_Sub4_6.method484(local714);
								this.aClass3_Sub3_Sub4_6.method467(this.aClass3_Sub3_Sub4_6.anInt738 - local967, 371);
								this.aString24 = Class19.method181(this.aString24);
								this.aString24 = Class35.method418(this.aString24);
								aClass3_Sub3_Sub2_Sub1_Sub2_1.aString13 = this.aString24;
								aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt673 = local714;
								aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt671 = local886;
								aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt670 = 150;
								if (this.anInt990 == 2) {
									this.method716((byte) 2, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.aString13, "@cr2@" + aClass3_Sub3_Sub2_Sub1_Sub2_1.aString14);
								} else if (this.anInt990 == 1) {
									this.method716((byte) 2, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.aString13, "@cr1@" + aClass3_Sub3_Sub2_Sub1_Sub2_1.aString14);
								} else {
									this.method716((byte) 2, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.aString13, aClass3_Sub3_Sub2_Sub1_Sub2_1.aString14);
								}
								if (this.anInt937 == 2) {
									this.anInt937 = 3;
									this.aBoolean234 = true;
									this.aClass3_Sub3_Sub4_6.method457(102);
									this.aClass3_Sub3_Sub4_6.method458(this.anInt937);
									this.aClass3_Sub3_Sub4_6.method458(this.anInt900);
									this.aClass3_Sub3_Sub4_6.method458(this.anInt1024);
								}
							}
							this.aString24 = "";
							this.aBoolean237 = true;
						}
					}
				}
			}
		} catch (@Pc(1121) RuntimeException local1121) {
			signlink.reporterror("32871, " + false + ", " + local1121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method587(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt972 = arg0;
			this.aString17 = arg1;
			this.method621();
			if (this.aClass22_2 == null) {
				super.method587(arg0, arg1);
			} else {
				this.aClass17_21.method154();
				this.aClass3_Sub3_Sub3_Sub4_4.method560(54, 16777215, 180, "RuneScape is loading - please wait...");
				Class3_Sub3_Sub3.method553(304, 62, 34, 28, 9179409);
				Class3_Sub3_Sub3.method553(302, 63, 32, 29, 0);
				Class3_Sub3_Sub3.method552(9179409, this.aByte40, 30, 64, 30, arg0 * 3);
				Class3_Sub3_Sub3.method552(0, this.aByte40, arg0 * 3 + 30, 64, 30, 300 - arg0 * 3);
				this.aClass3_Sub3_Sub3_Sub4_4.method560(85, 16777215, 180, arg1);
				this.aClass17_21.method155(super.aGraphics2, 202, 171);
				if (this.aBoolean244) {
					this.aBoolean244 = false;
					if (!this.aBoolean243) {
						this.aClass17_22.method155(super.aGraphics2, 0, 0);
						this.aClass17_23.method155(super.aGraphics2, 637, 0);
					}
					this.aClass17_19.method155(super.aGraphics2, 128, 0);
					this.aClass17_20.method155(super.aGraphics2, 202, 371);
					this.aClass17_24.method155(super.aGraphics2, 0, 265);
					this.aClass17_25.method155(super.aGraphics2, 562, 265);
					this.aClass17_26.method155(super.aGraphics2, 128, 171);
					this.aClass17_27.method155(super.aGraphics2, 562, 171);
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("64188, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OSRLSEOB;I)V")
	private void method679(@OriginalArg(0) Class3_Sub3_Sub3_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray241.length; local5++) {
				this.anIntArray241[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray241[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray242[local60] = (this.anIntArray241[local60 - 1] + this.anIntArray241[local60 + 1] + this.anIntArray241[local60 - 128] + this.anIntArray241[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray241;
				this.anIntArray241 = this.anIntArray242;
				this.anIntArray242 = local106;
			}
			if (arg1 == 8 && arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt459; local52++) {
					for (local60 = 0; local60 < arg0.anInt458; local60++) {
						if (arg0.aByteArray17[local48++] != 0) {
							@Pc(146) int local146 = local60 + arg0.anInt460 + 16;
							@Pc(153) int local153 = local52 + arg0.anInt461 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray241[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("73700, " + arg0 + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass3_Sub3_Sub3_Sub2_1.method285(arg4, arg3);
			this.aClass3_Sub3_Sub3_Sub2_2.method285(arg4, arg3 + arg5 - 16);
			Class3_Sub3_Sub3.method552(this.anInt890, this.aByte40, arg4, arg3 + 16, arg5 - 32, 16);
			@Pc(36) int local36 = (arg5 - 32) * arg5 / arg0;
			if (local36 < 8) {
				local36 = 8;
			}
			@Pc(53) int local53 = (arg5 - local36 - 32) * arg1 / (arg0 - arg5);
			Class3_Sub3_Sub3.method552(this.anInt986, this.aByte40, arg4, arg3 + local53 + 16, local36, 16);
			if (arg2 >= 3 && arg2 <= 3) {
				Class3_Sub3_Sub3.method557(arg4, this.anInt870, arg3 + local53 + 16, local36);
				Class3_Sub3_Sub3.method557(arg4 + 1, this.anInt870, arg3 + local53 + 16, local36);
				Class3_Sub3_Sub3.method555(arg3 + local53 + 16, 16, arg4, this.anInt870);
				Class3_Sub3_Sub3.method555(arg3 + local53 + 17, 16, arg4, this.anInt870);
				Class3_Sub3_Sub3.method557(arg4 + 15, this.anInt895, arg3 + local53 + 16, local36);
				Class3_Sub3_Sub3.method557(arg4 + 14, this.anInt895, arg3 + local53 + 17, local36 - 1);
				Class3_Sub3_Sub3.method555(arg3 + local53 + local36 + 15, 16, arg4, this.anInt895);
				Class3_Sub3_Sub3.method555(arg3 + local53 + local36 + 14, 15, arg4 + 1, this.anInt895);
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("69770, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method681() {
		try {
			@Pc(17) int local17;
			for (@Pc(9) int local9 = -1; local9 < this.anInt969; local9++) {
				if (local9 == -1) {
					local17 = this.anInt968;
				} else {
					local17 = this.anIntArray244[local9];
				}
				@Pc(29) Class3_Sub3_Sub2_Sub1_Sub2 local29 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local17];
				if (local29 != null && local29.anInt670 > 0) {
					local29.anInt670--;
					if (local29.anInt670 == 0) {
						local29.aString13 = null;
					}
				}
			}
			for (local17 = 0; local17 < this.anInt930; local17++) {
				@Pc(60) int local60 = this.anIntArray239[local17];
				@Pc(65) Class3_Sub3_Sub2_Sub1_Sub1 local65 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local60];
				if (local65 != null && local65.anInt670 > 0) {
					local65.anInt670--;
					if (local65.anInt670 == 0) {
						local65.aString13 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("26808, " + 9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method682(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt894 >= 100) {
					this.method716((byte) 2, 0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					@Pc(24) String local24 = Class48.method539(Class48.method536(this.aBoolean224, arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt894; local26++) {
						if (this.aLongArray4[local26] == arg0) {
							this.method716((byte) 2, 0, local24 + " is already on your ignore list", "");
							return;
						}
					}
					for (@Pc(56) int local56 = 0; local56 < this.anInt1033; local56++) {
						if (this.aLongArray3[local56] == arg0) {
							this.method716((byte) 2, 0, "Please remove " + local24 + " from your friend list first", "");
							return;
						}
					}
					this.aLongArray4[this.anInt894++] = arg0;
					this.aBoolean216 = true;
					this.aClass3_Sub3_Sub4_6.method457(108);
					this.aClass3_Sub3_Sub4_6.method464(arg0);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("60531, " + true + ", " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!WBEWPIXO;)V")
	private void method683(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1) {
		try {
			@Pc(14) int local14;
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(33) int local33;
			@Pc(36) int local36;
			@Pc(42) int local42;
			@Pc(46) int local46;
			if (arg0 == 138) {
				local14 = arg1.method468();
				local23 = this.anInt849 + (local14 >> 4 & 0x7);
				local30 = this.anInt850 + (local14 & 0x7);
				local33 = arg1.method470();
				local36 = arg1.method468();
				local42 = local36 >> 4 & 0xF;
				local46 = local36 & 0x7;
				if (aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0] >= local23 - local42 && aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0] <= local23 + local42 && aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0] >= local30 - local42 && aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0] <= local30 + local42 && this.aBoolean212 && !aBoolean226 && this.anInt1059 < 50) {
					this.anIntArray246[this.anInt1059] = local33;
					this.anIntArray240[this.anInt1059] = local46;
					this.anIntArray271[this.anInt1059] = Class38.anIntArray188[local33];
					this.anInt1059++;
				}
			}
			if (arg0 == 225) {
				local14 = arg1.method470();
				local23 = arg1.method496();
				local30 = arg1.method487();
				local33 = this.anInt849 + (local30 >> 4 & 0x7);
				local36 = this.anInt850 + (local30 & 0x7);
				local42 = arg1.method470();
				if (local33 >= 0 && local36 >= 0 && local33 < 104 && local36 < 104 && local14 != this.anInt887) {
					@Pc(164) Class3_Sub3_Sub2_Sub5 local164 = new Class3_Sub3_Sub2_Sub5();
					local164.anInt622 = local42;
					local164.anInt621 = local23;
					if (this.aClass26ArrayArrayArray1[this.anInt1056][local33][local36] == null) {
						this.aClass26ArrayArrayArray1[this.anInt1056][local33][local36] = new Class26(2);
					}
					this.aClass26ArrayArrayArray1[this.anInt1056][local33][local36].method221(local164);
					this.method653(local33, local36);
				}
			} else if (arg0 == 119) {
				local14 = arg1.method468();
				local23 = this.anInt849 + (local14 >> 4 & 0x7);
				local30 = this.anInt850 + (local14 & 0x7);
				local33 = arg1.method470();
				local36 = arg1.method470();
				local42 = arg1.method470();
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					@Pc(260) Class26 local260 = this.aClass26ArrayArrayArray1[this.anInt1056][local23][local30];
					if (local260 != null) {
						for (@Pc(266) Class3_Sub3_Sub2_Sub5 local266 = (Class3_Sub3_Sub2_Sub5) local260.method224(); local266 != null; local266 = (Class3_Sub3_Sub2_Sub5) local260.method226()) {
							if (local266.anInt622 == (local33 & 0x7FFF) && local266.anInt621 == local36) {
								local266.anInt621 = local42;
								break;
							}
						}
						this.method653(local23, local30);
					}
				}
			} else if (arg0 == 250) {
				local14 = arg1.method468();
				local23 = this.anInt849 + (local14 >> 4 & 0x7);
				local30 = this.anInt850 + (local14 & 0x7);
				local33 = arg1.method470();
				local36 = arg1.method468();
				local42 = arg1.method470();
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					local23 = local23 * 128 + 64;
					local30 = local30 * 128 + 64;
					@Pc(369) Class3_Sub3_Sub2_Sub2 local369 = new Class3_Sub3_Sub2_Sub2(this.method695(this.anInt1056, local23, local30) - local36, local23, anInt1032, 207, local33, this.anInt1056, local42, local30);
					this.aClass26_11.method221(local369);
				}
			} else {
				@Pc(427) Class3_Sub3_Sub2_Sub5 local427;
				if (arg0 == 210) {
					local14 = arg1.method496();
					local23 = arg1.method486();
					local30 = this.anInt849 + (local23 >> 4 & 0x7);
					local33 = this.anInt850 + (local23 & 0x7);
					if (local30 >= 0 && local33 >= 0 && local30 < 104 && local33 < 104) {
						@Pc(421) Class26 local421 = this.aClass26ArrayArrayArray1[this.anInt1056][local30][local33];
						if (local421 != null) {
							for (local427 = (Class3_Sub3_Sub2_Sub5) local421.method224(); local427 != null; local427 = (Class3_Sub3_Sub2_Sub5) local421.method226()) {
								if (local427.anInt622 == (local14 & 0x7FFF)) {
									local427.method545();
									break;
								}
							}
							if (local421.method224() == null) {
								this.aClass26ArrayArrayArray1[this.anInt1056][local30][local33] = null;
							}
							this.method653(local30, local33);
						}
					}
				} else if (arg0 == 150) {
					local14 = arg1.method468();
					local23 = this.anInt849 + (local14 >> 4 & 0x7);
					local30 = this.anInt850 + (local14 & 0x7);
					local33 = arg1.method487();
					local36 = local33 >> 2;
					local42 = local33 & 0x3;
					local46 = this.anIntArray217[local36];
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						this.method603(-1, local42, local46, this.anInt1056, -1, local23, 0, local30, local36);
					}
				} else {
					@Pc(570) int local570;
					@Pc(575) int local575;
					@Pc(578) int local578;
					@Pc(581) int local581;
					@Pc(584) int local584;
					@Pc(587) int local587;
					if (arg0 == 190) {
						local14 = arg1.method468();
						local23 = this.anInt849 + (local14 >> 4 & 0x7);
						local30 = this.anInt850 + (local14 & 0x7);
						local33 = local23 + arg1.method469();
						local36 = local30 + arg1.method469();
						local42 = arg1.method471();
						local46 = arg1.method470();
						local570 = arg1.method468() * 4;
						local575 = arg1.method468() * 4;
						local578 = arg1.method470();
						local581 = arg1.method470();
						local584 = arg1.method468();
						local587 = arg1.method468();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local33 >= 0 && local36 >= 0 && local33 < 104 && local36 < 104 && local46 != 65535) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							local33 = local33 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(663) Class3_Sub3_Sub2_Sub4 local663 = new Class3_Sub3_Sub2_Sub4(local584, local581 + anInt1032, this.anInt1056, local46, local42, local30, local575, this.method695(this.anInt1056, local23, local30) - local570, local23, local578 + anInt1032, local587, (byte) 22);
							local663.method233(local578 + anInt1032, this.method695(this.anInt1056, local33, local36) - local575, local36, local33);
							this.aClass26_12.method221(local663);
						}
					} else if (arg0 == 205) {
						local14 = arg1.method485();
						local23 = local14 >> 2;
						local30 = local14 & 0x3;
						local33 = this.anIntArray217[local23];
						local36 = arg1.method487();
						local42 = this.anInt849 + (local36 >> 4 & 0x7);
						local46 = this.anInt850 + (local36 & 0x7);
						local570 = arg1.method496();
						if (local42 >= 0 && local46 >= 0 && local42 < 104 && local46 < 104) {
							this.method603(-1, local30, local33, this.anInt1056, local570, local42, 0, local46, local23);
						}
					} else {
						if (arg0 == 149) {
							@Pc(760) byte local760 = arg1.method490();
							@Pc(764) byte local764 = arg1.method490();
							local30 = arg1.method470();
							local33 = arg1.method495(this.anInt922);
							@Pc(775) byte local775 = arg1.method469();
							local42 = arg1.method485();
							local46 = local42 >> 2;
							local570 = local42 & 0x3;
							local575 = this.anIntArray217[local46];
							local578 = arg1.method496();
							local581 = arg1.method468();
							local584 = this.anInt849 + (local581 >> 4 & 0x7);
							local587 = this.anInt850 + (local581 & 0x7);
							@Pc(819) byte local819 = arg1.method488();
							@Pc(822) int local822 = arg1.method470();
							@Pc(828) Class3_Sub3_Sub2_Sub1_Sub2 local828;
							if (local30 == this.anInt887) {
								local828 = aClass3_Sub3_Sub2_Sub1_Sub2_1;
							} else {
								local828 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local30];
							}
							if (local828 != null) {
								@Pc(840) Class13 local840 = Class13.method127(local822);
								@Pc(850) int local850 = this.anIntArrayArrayArray8[this.anInt1056][local584][local587];
								@Pc(862) int local862 = this.anIntArrayArrayArray8[this.anInt1056][local584 + 1][local587];
								@Pc(876) int local876 = this.anIntArrayArrayArray8[this.anInt1056][local584 + 1][local587 + 1];
								@Pc(888) int local888 = this.anIntArrayArrayArray8[this.anInt1056][local584][local587 + 1];
								@Pc(898) Class3_Sub3_Sub2_Sub3 local898 = local840.method125(local46, local570, local850, local862, local876, local888, -1);
								if (local898 != null) {
									this.method603(local578 + 1, 0, local575, this.anInt1056, -1, local584, local33 + 1, local587, 0);
									local828.anInt699 = local33 + anInt1032;
									local828.anInt700 = local578 + anInt1032;
									local828.aClass3_Sub3_Sub2_Sub3_2 = local898;
									@Pc(933) int local933 = local840.anInt237;
									@Pc(936) int local936 = local840.anInt233;
									if (local570 == 1 || local570 == 3) {
										local933 = local840.anInt233;
										local936 = local840.anInt237;
									}
									local828.anInt705 = local584 * 128 + local933 * 64;
									local828.anInt707 = local587 * 128 + local936 * 64;
									local828.anInt706 = this.method695(this.anInt1056, local828.anInt705, local828.anInt707);
									@Pc(982) byte local982;
									if (local760 > local775) {
										local982 = local760;
										local760 = local775;
										local775 = local982;
									}
									if (local764 > local819) {
										local982 = local764;
										local764 = local819;
										local819 = local982;
									}
									local828.anInt692 = local584 + local760;
									local828.anInt694 = local584 + local775;
									local828.anInt693 = local587 + local764;
									local828.anInt695 = local587 + local819;
								}
							}
						}
						if (arg0 == 135) {
							local14 = arg1.method487();
							local23 = this.anInt849 + (local14 >> 4 & 0x7);
							local30 = this.anInt850 + (local14 & 0x7);
							local33 = arg1.method487();
							local36 = local33 >> 2;
							local42 = local33 & 0x3;
							local46 = this.anIntArray217[local36];
							local570 = arg1.method470();
							if (local23 >= 0 && local30 >= 0 && local23 < 103 && local30 < 103) {
								local575 = this.anIntArrayArrayArray8[this.anInt1056][local23][local30];
								local578 = this.anIntArrayArrayArray8[this.anInt1056][local23 + 1][local30];
								local581 = this.anIntArrayArrayArray8[this.anInt1056][local23 + 1][local30 + 1];
								local584 = this.anIntArrayArrayArray8[this.anInt1056][local23][local30 + 1];
								if (local46 == 0) {
									@Pc(1127) Class45 local1127 = this.aClass31_1.method359(local30, this.anInt1056, local23);
									if (local1127 != null) {
										@Pc(1136) int local1136 = local1127.anInt777 >> 14 & 0x7FFF;
										if (local36 == 2) {
											local1127.aClass3_Sub3_Sub2_7 = new Class3_Sub3_Sub2_Sub6(local578, false, local1136, (byte) 8, local570, local584, local575, local42 + 4, local581, 2);
											local1127.aClass3_Sub3_Sub2_8 = new Class3_Sub3_Sub2_Sub6(local578, false, local1136, (byte) 8, local570, local584, local575, local42 + 1 & 0x3, local581, 2);
										} else {
											local1127.aClass3_Sub3_Sub2_7 = new Class3_Sub3_Sub2_Sub6(local578, false, local1136, (byte) 8, local570, local584, local575, local42, local581, local36);
										}
									}
								}
								if (local46 == 1) {
									@Pc(1204) Class9 local1204 = this.aClass31_1.method360(local23, this.anInt1056, local30);
									if (local1204 != null) {
										local1204.aClass3_Sub3_Sub2_5 = new Class3_Sub3_Sub2_Sub6(local578, false, local1204.anInt186 >> 14 & 0x7FFF, (byte) 8, local570, local584, local575, 0, local581, 4);
									}
								}
								if (local46 == 2) {
									@Pc(1238) Class2 local1238 = this.aClass31_1.method361(local23, local30, this.anInt1056);
									if (local36 == 11) {
										local36 = 10;
									}
									if (local1238 != null) {
										local1238.aClass3_Sub3_Sub2_1 = new Class3_Sub3_Sub2_Sub6(local578, false, local1238.anInt43 >> 14 & 0x7FFF, (byte) 8, local570, local584, local575, local42, local581, local36);
									}
								}
								if (local46 == 3) {
									@Pc(1277) Class14 local1277 = this.aClass31_1.method362(local30, local23, this.anInt1056);
									if (local1277 != null) {
										local1277.aClass3_Sub3_Sub2_6 = new Class3_Sub3_Sub2_Sub6(local578, false, local1277.anInt241 >> 14 & 0x7FFF, (byte) 8, local570, local584, local575, local42, local581, 22);
									}
								}
							}
						} else if (arg0 == 141) {
							local14 = arg1.method470();
							local23 = arg1.method470();
							local30 = arg1.method468();
							local33 = this.anInt849 + (local30 >> 4 & 0x7);
							local36 = this.anInt850 + (local30 & 0x7);
							if (local33 >= 0 && local36 >= 0 && local33 < 104 && local36 < 104) {
								local427 = new Class3_Sub3_Sub2_Sub5();
								local427.anInt622 = local14;
								local427.anInt621 = local23;
								if (this.aClass26ArrayArrayArray1[this.anInt1056][local33][local36] == null) {
									this.aClass26ArrayArrayArray1[this.anInt1056][local33][local36] = new Class26(2);
								}
								this.aClass26ArrayArrayArray1[this.anInt1056][local33][local36].method221(local427);
								this.method653(local33, local36);
							}
						}
					}
				}
			}
		} catch (@Pc(1388) RuntimeException local1388) {
			signlink.reporterror("7548, " + arg0 + ", " + 110 + ", " + arg1 + ", " + local1388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method684(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt910 == 0 && this.anInt957 == 0) {
				this.aStringArray9[this.anInt1071] = "Walk here";
				this.anIntArray221[this.anInt1071] = 238;
				this.anIntArray219[this.anInt1071] = super.anInt836;
				this.anIntArray220[this.anInt1071] = super.anInt837;
				this.anInt1071++;
			}
			@Pc(53) int local53 = -1;
			for (@Pc(55) int local55 = 0; local55 < Class3_Sub3_Sub2_Sub3.anInt212; local55++) {
				@Pc(61) int local61 = Class3_Sub3_Sub2_Sub3.anIntArray50[local55];
				@Pc(65) int local65 = local61 & 0x7F;
				@Pc(71) int local71 = local61 >> 7 & 0x7F;
				@Pc(77) int local77 = local61 >> 29 & 0x3;
				@Pc(83) int local83 = local61 >> 14 & 0x7FFF;
				if (local61 != local53) {
					local53 = local61;
					@Pc(230) int local230;
					if (local77 == 2 && this.aClass31_1.method367(this.anInt1056, local65, local71, local61) >= 0) {
						@Pc(103) Class13 local103 = Class13.method127(local83);
						if (local103.anIntArray63 != null) {
							local103 = local103.method119();
						}
						if (local103 == null) {
							continue;
						}
						if (this.anInt910 == 1) {
							this.aStringArray9[this.anInt1071] = "Use " + this.aString20 + " with @cya@" + local103.aString3;
							this.anIntArray221[this.anInt1071] = 544;
							this.anIntArray222[this.anInt1071] = local61;
							this.anIntArray219[this.anInt1071] = local65;
							this.anIntArray220[this.anInt1071] = local71;
							this.anInt1071++;
						} else if (this.anInt957 != 1) {
							if (local103.aStringArray3 != null) {
								for (local230 = 4; local230 >= 0; local230--) {
									if (local103.aStringArray3[local230] != null) {
										this.aStringArray9[this.anInt1071] = local103.aStringArray3[local230] + " @cya@" + local103.aString3;
										if (local230 == 0) {
											this.anIntArray221[this.anInt1071] = 87;
										}
										if (local230 == 1) {
											this.anIntArray221[this.anInt1071] = 570;
										}
										if (local230 == 2) {
											this.anIntArray221[this.anInt1071] = 198;
										}
										if (local230 == 3) {
											this.anIntArray221[this.anInt1071] = 334;
										}
										if (local230 == 4) {
											this.anIntArray221[this.anInt1071] = 1313;
										}
										this.anIntArray222[this.anInt1071] = local61;
										this.anIntArray219[this.anInt1071] = local65;
										this.anIntArray220[this.anInt1071] = local71;
										this.anInt1071++;
									}
								}
							}
							this.aStringArray9[this.anInt1071] = "Examine @cya@" + local103.aString3;
							this.anIntArray221[this.anInt1071] = 1764;
							this.anIntArray222[this.anInt1071] = local103.anInt231 << 14;
							this.anIntArray219[this.anInt1071] = local65;
							this.anIntArray220[this.anInt1071] = local71;
							this.anInt1071++;
						} else if ((this.anInt959 & 0x4) == 4) {
							this.aStringArray9[this.anInt1071] = this.aString23 + " @cya@" + local103.aString3;
							this.anIntArray221[this.anInt1071] = 689;
							this.anIntArray222[this.anInt1071] = local61;
							this.anIntArray219[this.anInt1071] = local65;
							this.anIntArray220[this.anInt1071] = local71;
							this.anInt1071++;
						}
					}
					@Pc(410) Class3_Sub3_Sub2_Sub1_Sub1 local410;
					@Pc(458) Class3_Sub3_Sub2_Sub1_Sub2 local458;
					@Pc(448) int local448;
					if (local77 == 1) {
						@Pc(381) Class3_Sub3_Sub2_Sub1_Sub1 local381 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local83];
						if (local381.aClass30_1.aByte21 == 1 && (local381.anInt685 & 0x7F) == 64 && (local381.anInt686 & 0x7F) == 64) {
							for (local230 = 0; local230 < this.anInt930; local230++) {
								local410 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[this.anIntArray239[local230]];
								if (local410 != null && local410 != local381 && local410.aClass30_1.aByte21 == 1 && local410.anInt685 == local381.anInt685 && local410.anInt686 == local381.anInt686) {
									this.method597(local71, local65, this.anIntArray239[local230], local410.aClass30_1);
								}
							}
							for (local448 = 0; local448 < this.anInt969; local448++) {
								local458 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anIntArray244[local448]];
								if (local458 != null && local458.anInt685 == local381.anInt685 && local458.anInt686 == local381.anInt686) {
									this.method590(local458, local71, this.anIntArray244[local448], local65);
								}
							}
						}
						this.method597(local71, local65, local83, local381.aClass30_1);
					}
					if (local77 == 0) {
						@Pc(500) Class3_Sub3_Sub2_Sub1_Sub2 local500 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local83];
						if ((local500.anInt685 & 0x7F) == 64 && (local500.anInt686 & 0x7F) == 64) {
							for (local230 = 0; local230 < this.anInt930; local230++) {
								local410 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[this.anIntArray239[local230]];
								if (local410 != null && local410.aClass30_1.aByte21 == 1 && local410.anInt685 == local500.anInt685 && local410.anInt686 == local500.anInt686) {
									this.method597(local71, local65, this.anIntArray239[local230], local410.aClass30_1);
								}
							}
							for (local448 = 0; local448 < this.anInt969; local448++) {
								local458 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anIntArray244[local448]];
								if (local458 != null && local458 != local500 && local458.anInt685 == local500.anInt685 && local458.anInt686 == local500.anInt686) {
									this.method590(local458, local71, this.anIntArray244[local448], local65);
								}
							}
						}
						this.method590(local500, local71, local83, local65);
					}
					if (local77 == 3) {
						@Pc(619) Class26 local619 = this.aClass26ArrayArrayArray1[this.anInt1056][local65][local71];
						if (local619 != null) {
							for (@Pc(626) Class3_Sub3_Sub2_Sub5 local626 = (Class3_Sub3_Sub2_Sub5) local619.method225(); local626 != null; local626 = (Class3_Sub3_Sub2_Sub5) local619.method227()) {
								@Pc(632) Class1 local632 = Class1.method7(local626.anInt622);
								if (this.anInt910 == 1) {
									this.aStringArray9[this.anInt1071] = "Use " + this.aString20 + " with @lre@" + local632.aString1;
									this.anIntArray221[this.anInt1071] = 555;
									this.anIntArray222[this.anInt1071] = local626.anInt622;
									this.anIntArray219[this.anInt1071] = local65;
									this.anIntArray220[this.anInt1071] = local71;
									this.anInt1071++;
								} else if (this.anInt957 != 1) {
									for (@Pc(749) int local749 = 4; local749 >= 0; local749--) {
										if (local632.aStringArray1 != null && local632.aStringArray1[local749] != null) {
											this.aStringArray9[this.anInt1071] = local632.aStringArray1[local749] + " @lre@" + local632.aString1;
											if (local749 == 0) {
												this.anIntArray221[this.anInt1071] = 48;
											}
											if (local749 == 1) {
												this.anIntArray221[this.anInt1071] = 639;
											}
											if (local749 == 2) {
												this.anIntArray221[this.anInt1071] = 209;
											}
											if (local749 == 3) {
												this.anIntArray221[this.anInt1071] = 624;
											}
											if (local749 == 4) {
												this.anIntArray221[this.anInt1071] = 746;
											}
											this.anIntArray222[this.anInt1071] = local626.anInt622;
											this.anIntArray219[this.anInt1071] = local65;
											this.anIntArray220[this.anInt1071] = local71;
											this.anInt1071++;
										} else if (local749 == 2) {
											this.aStringArray9[this.anInt1071] = "Take @lre@" + local632.aString1;
											this.anIntArray221[this.anInt1071] = 209;
											this.anIntArray222[this.anInt1071] = local626.anInt622;
											this.anIntArray219[this.anInt1071] = local65;
											this.anIntArray220[this.anInt1071] = local71;
											this.anInt1071++;
										}
									}
									this.aStringArray9[this.anInt1071] = "Examine @lre@" + local632.aString1;
									this.anIntArray221[this.anInt1071] = 1805;
									this.anIntArray222[this.anInt1071] = local626.anInt622;
									this.anIntArray219[this.anInt1071] = local65;
									this.anIntArray220[this.anInt1071] = local71;
									this.anInt1071++;
								} else if ((this.anInt959 & 0x1) == 1) {
									this.aStringArray9[this.anInt1071] = this.aString23 + " @lre@" + local632.aString1;
									this.anIntArray221[this.anInt1071] = 57;
									this.anIntArray222[this.anInt1071] = local626.anInt622;
									this.anIntArray219[this.anInt1071] = local65;
									this.anIntArray220[this.anInt1071] = local71;
									this.anInt1071++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(956) RuntimeException local956) {
			signlink.reporterror("33864, " + arg0 + ", " + local956.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method685() {
		try {
			this.anInt936++;
			this.method648(true);
			this.method717(true);
			this.method648(false);
			this.method717(false);
			this.method677();
			this.method627();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean242) {
				local35 = this.anInt1019;
				if (this.anInt1057 / 256 > local35) {
					local35 = this.anInt1057 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray262[4] + 128 > local35) {
					local35 = this.anIntArray262[4] + 128;
				}
				local74 = this.anInt1020 + this.anInt939 & 0x7FF;
				this.method588(this.anInt883, local35 * 3 + 600, this.method695(this.anInt1056, aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685, aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686) - 50, local35, local74, this.anInt882);
			}
			if (this.aBoolean242) {
				local35 = this.method659();
			} else {
				local35 = this.method658(this.anInt902);
			}
			local74 = this.anInt1043;
			@Pc(119) int local119 = this.anInt1044;
			@Pc(122) int local122 = this.anInt1045;
			@Pc(125) int local125 = this.anInt1046;
			@Pc(128) int local128 = this.anInt1047;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray12[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray273[local130] * 2 + 1) - (double) this.anIntArray273[local130] + Math.sin((double) this.anIntArray261[local130] * ((double) this.anIntArray267[local130] / 100.0D)) * (double) this.anIntArray262[local130]);
					if (local130 == 0) {
						this.anInt1043 += local177;
					}
					if (local130 == 1) {
						this.anInt1044 += local177;
					}
					if (local130 == 2) {
						this.anInt1045 += local177;
					}
					if (local130 == 3) {
						this.anInt1047 = this.anInt1047 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt1046 += local177;
						if (this.anInt1046 < 128) {
							this.anInt1046 = 128;
						}
						if (this.anInt1046 > 383) {
							this.anInt1046 = 383;
						}
					}
				}
			}
			local177 = Class3_Sub3_Sub3_Sub3.anInt493;
			Class3_Sub3_Sub2_Sub3.aBoolean45 = true;
			Class3_Sub3_Sub2_Sub3.anInt212 = 0;
			Class3_Sub3_Sub2_Sub3.anInt210 = super.anInt836 - 4;
			Class3_Sub3_Sub2_Sub3.anInt211 = super.anInt837 - 4;
			Class3_Sub3_Sub3.method550();
			this.aClass31_1.method376(this.anInt1047, this.anInt1044, this.anInt1045, local35, this.anInt1043, this.anInt1046);
			this.aClass31_1.method351();
			this.method722(this.aBoolean229);
			this.method710();
			this.method661(local177);
			this.method631();
			this.aClass17_17.method155(super.aGraphics2, 4, 4);
			this.anInt1043 = local74;
			this.anInt1044 = local119;
			this.anInt1045 = local122;
			this.anInt1046 = local125;
			this.anInt1047 = local128;
		} catch (@Pc(322) RuntimeException local322) {
			signlink.reporterror("85407, " + -917 + ", " + local322.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)Ljava/net/Socket;")
	public Socket method686(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(9) int local9 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local9 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local9 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("38761, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -45946 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method688() {
		try {
			@Pc(16) int local16;
			if (this.anInt991 > 0) {
				for (local16 = 0; local16 < 256; local16++) {
					if (this.anInt991 > 768) {
						this.anIntArray263[local16] = this.method687(1024 - this.anInt991, this.anIntArray265[local16], this.anIntArray264[local16]);
					} else if (this.anInt991 > 256) {
						this.anIntArray263[local16] = this.anIntArray265[local16];
					} else {
						this.anIntArray263[local16] = this.method687(256 - this.anInt991, this.anIntArray264[local16], this.anIntArray265[local16]);
					}
				}
			} else if (this.anInt992 > 0) {
				for (local16 = 0; local16 < 256; local16++) {
					if (this.anInt992 > 768) {
						this.anIntArray263[local16] = this.method687(1024 - this.anInt992, this.anIntArray266[local16], this.anIntArray264[local16]);
					} else if (this.anInt992 > 256) {
						this.anIntArray263[local16] = this.anIntArray266[local16];
					} else {
						this.anIntArray263[local16] = this.method687(256 - this.anInt992, this.anIntArray264[local16], this.anIntArray266[local16]);
					}
				}
			} else {
				for (local16 = 0; local16 < 256; local16++) {
					this.anIntArray263[local16] = this.anIntArray264[local16];
				}
			}
			for (local16 = 0; local16 < 33920; local16++) {
				this.aClass17_22.anIntArray80[local16] = this.aClass3_Sub3_Sub3_Sub1_3.anIntArray119[local16];
			}
			@Pc(189) int local189 = 0;
			@Pc(191) int local191 = 1152;
			@Pc(206) int local206;
			@Pc(210) int local210;
			@Pc(220) int local220;
			@Pc(228) int local228;
			@Pc(232) int local232;
			@Pc(236) int local236;
			@Pc(247) int local247;
			for (@Pc(193) int local193 = 1; local193 < 255; local193++) {
				local206 = this.anIntArray269[local193] * (256 - local193) / 256;
				local210 = local206 + 22;
				if (local210 < 0) {
					local210 = 0;
				}
				local189 += local210;
				for (local220 = local210; local220 < 128; local220++) {
					local228 = this.anIntArray226[local189++];
					if (local228 == 0) {
						local191++;
					} else {
						local232 = local228;
						local236 = 256 - local228;
						local228 = this.anIntArray263[local228];
						local247 = this.aClass17_22.anIntArray80[local191];
						this.aClass17_22.anIntArray80[local191++] = ((local228 & 0xFF00FF) * local232 + (local247 & 0xFF00FF) * local236 & 0xFF00FF00) + ((local228 & 0xFF00) * local232 + (local247 & 0xFF00) * local236 & 0xFF0000) >> 8;
					}
				}
				local191 += local210;
			}
			this.aClass17_22.method155(super.aGraphics2, 0, 0);
			for (local206 = 0; local206 < 33920; local206++) {
				this.aClass17_23.anIntArray80[local206] = this.aClass3_Sub3_Sub3_Sub1_4.anIntArray119[local206];
			}
			local189 = 0;
			local191 = 1176;
			for (local210 = 1; local210 < 255; local210++) {
				local220 = this.anIntArray269[local210] * (256 - local210) / 256;
				local228 = 103 - local220;
				local191 += local220;
				for (local232 = 0; local232 < local228; local232++) {
					local236 = this.anIntArray226[local189++];
					if (local236 == 0) {
						local191++;
					} else {
						local247 = local236;
						@Pc(370) int local370 = 256 - local236;
						local236 = this.anIntArray263[local236];
						@Pc(381) int local381 = this.aClass17_23.anIntArray80[local191];
						this.aClass17_23.anIntArray80[local191++] = ((local236 & 0xFF00FF) * local247 + (local381 & 0xFF00FF) * local370 & 0xFF00FF00) + ((local236 & 0xFF00) * local247 + (local381 & 0xFF00) * local370 & 0xFF0000) >> 8;
					}
				}
				local189 += 128 - local228;
				local191 += 128 - local228 - local220;
			}
			this.aClass17_23.method155(super.aGraphics2, 637, 0);
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("33045, " + 3 + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method689() {
		try {
			this.aClass17_18.method154();
			Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray231;
			this.aClass3_Sub3_Sub3_Sub2_10.method285(0, 0);
			if (this.aBoolean204) {
				this.aClass3_Sub3_Sub3_Sub4_4.method560(40, 0, 239, this.aString26);
				this.aClass3_Sub3_Sub3_Sub4_4.method560(60, 128, 239, this.aString27 + "*");
			} else if (this.anInt985 == 1) {
				this.aClass3_Sub3_Sub3_Sub4_4.method560(40, 0, 239, "Enter amount:");
				this.aClass3_Sub3_Sub3_Sub4_4.method560(60, 128, 239, this.aString25 + "*");
			} else if (this.anInt985 == 2) {
				this.aClass3_Sub3_Sub3_Sub4_4.method560(40, 0, 239, "Enter name:");
				this.aClass3_Sub3_Sub3_Sub4_4.method560(60, 128, 239, this.aString25 + "*");
			} else {
				@Pc(131) Class3_Sub3_Sub3_Sub4 local131;
				@Pc(139) int local139;
				@Pc(150) int local150;
				if (this.anInt985 == 3) {
					if (this.aString25 != this.aString18) {
						this.method628(616, this.aString25);
						this.aString18 = this.aString25;
					}
					local131 = this.aClass3_Sub3_Sub3_Sub4_3;
					Class3_Sub3_Sub3.method549(0, 77, 463, 0);
					for (local139 = 0; local139 < this.anInt880; local139++) {
						local150 = local139 * 14 + 18 - this.anInt881;
						if (local150 > 0 && local150 < 110) {
							local131.method560(local150, 0, 239, this.aStringArray8[local139]);
						}
					}
					Class3_Sub3_Sub3.method548();
					if (this.anInt880 > 5) {
						this.method680(this.anInt880 * 14 + 7, this.anInt881, this.anInt980, 0, 463, 77);
					}
					if (this.aString25.length() == 0) {
						this.aClass3_Sub3_Sub3_Sub4_4.method560(40, 255, 239, "Enter object name");
					} else if (this.anInt880 == 0) {
						this.aClass3_Sub3_Sub3_Sub4_4.method560(40, 0, 239, "No matching objects found, please shorten search");
					}
					local131.method560(90, 0, 239, this.aString25 + "*");
					Class3_Sub3_Sub3.method555(77, 479, 0, 0);
				} else if (this.aString31 != null) {
					this.aClass3_Sub3_Sub3_Sub4_4.method560(40, 0, 239, this.aString31);
					this.aClass3_Sub3_Sub3_Sub4_4.method560(60, 128, 239, "Click to continue");
				} else if (this.anInt903 != -1) {
					this.method626(0, 0, this.aByte42, Class23.method208(this.anInt903), 0);
				} else if (this.anInt996 == -1) {
					local131 = this.aClass3_Sub3_Sub3_Sub4_3;
					local139 = 0;
					Class3_Sub3_Sub3.method549(0, 77, 463, 0);
					for (local150 = 0; local150 < 100; local150++) {
						if (this.aStringArray14[local150] != null) {
							@Pc(318) int local318 = this.anIntArray276[local150];
							@Pc(327) int local327 = this.anInt1069 + 70 - local139 * 14;
							@Pc(332) String local332 = this.aStringArray13[local150];
							@Pc(334) byte local334 = 0;
							if (local332 != null && local332.startsWith("@cr1@")) {
								local332 = local332.substring(5);
								local334 = 1;
							}
							if (local332 != null && local332.startsWith("@cr2@")) {
								local332 = local332.substring(5);
								local334 = 2;
							}
							if (local318 == 0) {
								if (local327 > 0 && local327 < 110) {
									local131.method564(0, local327, this.aStringArray14[local150], 4);
								}
								local139++;
							}
							@Pc(404) int local404;
							if ((local318 == 1 || local318 == 2) && (local318 == 1 || this.anInt937 == 0 || this.anInt937 == 1 && this.method604(local332))) {
								if (local327 > 0 && local327 < 110) {
									local404 = 4;
									if (local334 == 1) {
										this.aClass3_Sub3_Sub3_Sub2Array5[0].method285(4, local327 - 12);
										local404 += 14;
									}
									if (local334 == 2) {
										this.aClass3_Sub3_Sub3_Sub2Array5[1].method285(local404, local327 - 12);
										local404 += 14;
									}
									local131.method564(0, local327, local332 + ":", local404);
									local404 += local131.method562(local332) + 8;
									local131.method564(255, local327, this.aStringArray14[local150], local404);
								}
								local139++;
							}
							if ((local318 == 3 || local318 == 7) && this.anInt978 == 0 && (local318 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method604(local332))) {
								if (local327 > 0 && local327 < 110) {
									local131.method564(0, local327, "From", 4);
									local404 = local131.method562("From ") + 4;
									if (local334 == 1) {
										this.aClass3_Sub3_Sub3_Sub2Array5[0].method285(local404, local327 - 12);
										local404 += 14;
									}
									if (local334 == 2) {
										this.aClass3_Sub3_Sub3_Sub2Array5[1].method285(local404, local327 - 12);
										local404 += 14;
									}
									local131.method564(0, local327, local332 + ":", local404);
									local404 += local131.method562(local332) + 8;
									local131.method564(8388608, local327, this.aStringArray14[local150], local404);
								}
								local139++;
							}
							if (local318 == 4 && (this.anInt1024 == 0 || this.anInt1024 == 1 && this.method604(local332))) {
								if (local327 > 0 && local327 < 110) {
									local131.method564(8388736, local327, local332 + " " + this.aStringArray14[local150], 4);
								}
								local139++;
							}
							if (local318 == 5 && this.anInt978 == 0 && this.anInt900 < 2) {
								if (local327 > 0 && local327 < 110) {
									local131.method564(8388608, local327, this.aStringArray14[local150], 4);
								}
								local139++;
							}
							if (local318 == 6 && this.anInt978 == 0 && this.anInt900 < 2) {
								if (local327 > 0 && local327 < 110) {
									local131.method564(0, local327, "To " + local332 + ":", 4);
									local131.method564(8388608, local327, this.aStringArray14[local150], local131.method562("To " + local332) + 12);
								}
								local139++;
							}
							if (local318 == 8 && (this.anInt1024 == 0 || this.anInt1024 == 1 && this.method604(local332))) {
								if (local327 > 0 && local327 < 110) {
									local131.method564(8270336, local327, local332 + " " + this.aStringArray14[local150], 4);
								}
								local139++;
							}
						}
					}
					Class3_Sub3_Sub3.method548();
					this.anInt1010 = local139 * 14 + 7;
					if (this.anInt1010 < 78) {
						this.anInt1010 = 78;
					}
					this.method680(this.anInt1010, this.anInt1010 - this.anInt1069 - 77, this.anInt980, 0, 463, 77);
					@Pc(775) String local775;
					if (aClass3_Sub3_Sub2_Sub1_Sub2_1 == null || aClass3_Sub3_Sub2_Sub1_Sub2_1.aString14 == null) {
						local775 = Class48.method539(this.aString28);
					} else {
						local775 = aClass3_Sub3_Sub2_Sub1_Sub2_1.aString14;
					}
					local131.method564(0, 90, local775 + ":", 4);
					local131.method564(255, 90, this.aString24 + "*", local131.method562(local775 + ": ") + 6);
					Class3_Sub3_Sub3.method555(77, 479, 0, 0);
				} else {
					this.method626(0, 0, this.aByte42, Class23.method208(this.anInt996), 0);
				}
			}
			if (this.aBoolean223 && this.anInt950 == 2) {
				this.method646();
			}
			this.aClass17_18.method155(super.aGraphics2, 17, 357);
			this.aClass17_17.method154();
			Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
		} catch (@Pc(856) RuntimeException local856) {
			signlink.reporterror("61662, " + -32 + ", " + local856.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CELKGLWS;BI)V")
	private void method690(@OriginalArg(0) Class3_Sub3_Sub2_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == 5) {
				@Pc(4) boolean local4 = false;
			} else {
				this.anInt1055 = -350;
			}
			this.method691(arg2, arg0.anInt686, arg0.anInt685);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("89986, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method695(this.anInt1056, arg2, arg1) - arg0;
				@Pc(33) int local33 = arg2 - this.anInt1043;
				@Pc(38) int local38 = local28 - this.anInt1044;
				@Pc(43) int local43 = arg1 - this.anInt1045;
				@Pc(48) int local48 = Class3_Sub3_Sub2_Sub3.anIntArray51[this.anInt1046];
				@Pc(53) int local53 = Class3_Sub3_Sub2_Sub3.anIntArray52[this.anInt1046];
				@Pc(58) int local58 = Class3_Sub3_Sub2_Sub3.anIntArray51[this.anInt1047];
				@Pc(63) int local63 = Class3_Sub3_Sub2_Sub3.anIntArray52[this.anInt1047];
				@Pc(81) int local81 = local43 * local58 + local33 * local63 >> 16;
				@Pc(91) int local91 = local43 * local63 - local33 * local58 >> 16;
				@Pc(93) int local93 = local81;
				@Pc(103) int local103 = local38 * local53 - local91 * local48 >> 16;
				@Pc(113) int local113 = local38 * local48 + local91 * local53 >> 16;
				if (local113 >= 50) {
					this.anInt1052 = Class3_Sub3_Sub3_Sub3.anInt489 + (local93 << 9) / local113;
					this.anInt1053 = Class3_Sub3_Sub3_Sub3.anInt490 + (local103 << 9) / local113;
				} else {
					this.anInt1052 = -1;
					this.anInt1053 = -1;
				}
			} else {
				this.anInt1052 = -1;
				this.anInt1053 = -1;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("58996, " + -19415 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Z")
	private boolean method692() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("79893, " + false + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method693() {
		try {
			this.aClass3_Sub3_Sub3_Sub2_19 = new Class3_Sub3_Sub3_Sub2(this.aClass22_2, "titlebox", 0);
			this.aClass3_Sub3_Sub3_Sub2_20 = new Class3_Sub3_Sub3_Sub2(this.aClass22_2, "titlebutton", 0);
			this.aClass3_Sub3_Sub3_Sub2Array2 = new Class3_Sub3_Sub3_Sub2[12];
			for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
				this.aClass3_Sub3_Sub3_Sub2Array2[local36] = new Class3_Sub3_Sub3_Sub2(this.aClass22_2, "runes", local36);
			}
			this.aClass3_Sub3_Sub3_Sub1_3 = new Class3_Sub3_Sub3_Sub1(128, 265);
			this.aClass3_Sub3_Sub3_Sub1_4 = new Class3_Sub3_Sub3_Sub1(128, 265);
			for (@Pc(69) int local69 = 0; local69 < 33920; local69++) {
				this.aClass3_Sub3_Sub3_Sub1_3.anIntArray119[local69] = this.aClass17_22.anIntArray80[local69];
			}
			for (@Pc(87) int local87 = 0; local87 < 33920; local87++) {
				this.aClass3_Sub3_Sub3_Sub1_4.anIntArray119[local87] = this.aClass17_23.anIntArray80[local87];
			}
			this.anIntArray264 = new int[256];
			for (@Pc(109) int local109 = 0; local109 < 64; local109++) {
				this.anIntArray264[local109] = local109 * 262144;
			}
			for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
				this.anIntArray264[local124 + 64] = local124 * 1024 + 16711680;
			}
			for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
				this.anIntArray264[local143 + 128] = local143 * 4 + 16776960;
			}
			for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
				this.anIntArray264[local162 + 192] = 16777215;
			}
			this.anIntArray265 = new int[256];
			for (@Pc(181) int local181 = 0; local181 < 64; local181++) {
				this.anIntArray265[local181] = local181 * 1024;
			}
			for (@Pc(196) int local196 = 0; local196 < 64; local196++) {
				this.anIntArray265[local196 + 64] = local196 * 4 + 65280;
			}
			for (@Pc(215) int local215 = 0; local215 < 64; local215++) {
				this.anIntArray265[local215 + 128] = local215 * 262144 + 65535;
			}
			for (@Pc(234) int local234 = 0; local234 < 64; local234++) {
				this.anIntArray265[local234 + 192] = 16777215;
			}
			this.anIntArray266 = new int[256];
			for (@Pc(253) int local253 = 0; local253 < 64; local253++) {
				this.anIntArray266[local253] = local253 * 4;
			}
			for (@Pc(268) int local268 = 0; local268 < 64; local268++) {
				this.anIntArray266[local268 + 64] = local268 * 262144 + 255;
			}
			for (@Pc(287) int local287 = 0; local287 < 64; local287++) {
				this.anIntArray266[local287 + 128] = local287 * 1024 + 16711935;
			}
			for (@Pc(306) int local306 = 0; local306 < 64; local306++) {
				this.anIntArray266[local306 + 192] = 16777215;
			}
			this.anIntArray263 = new int[256];
			this.anIntArray241 = new int[32768];
			this.anIntArray242 = new int[32768];
			this.method679(null, this.anInt1042);
			this.anIntArray226 = new int[32768];
			this.anIntArray227 = new int[32768];
			this.method587(10, "Connecting to fileserver");
			if (!this.aBoolean243) {
				this.aBoolean206 = true;
				this.aBoolean243 = true;
				this.method586(this, 2);
			}
		} catch (@Pc(364) RuntimeException local364) {
			signlink.reporterror("5181, " + 38021 + ", " + local364.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Z")
	private boolean method694(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(13) int local13 = this.anIntArray221[arg0];
			if (local13 >= 2000) {
				local13 -= 2000;
			}
			return local13 == 50;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("96017, " + arg0 + ", " + -212 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			@Pc(41) int local41 = arg1 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(82) int local82 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(114) int local114 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local82 * (128 - local45) + local114 * local45 >> 7;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("12134, " + -760 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!WBEWPIXO;I)V")
	private void method696(@OriginalArg(1) Class3_Sub3_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method479(8);
			@Pc(12) int local12;
			if (local6 < this.anInt969) {
				for (local12 = local6; local12 < this.anInt969; local12++) {
					this.anIntArray247[this.anInt987++] = this.anIntArray244[local12];
				}
			}
			if (local6 > this.anInt969) {
				signlink.reporterror(this.aString28 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt969 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(71) int local71 = this.anIntArray244[local12];
				@Pc(76) Class3_Sub3_Sub2_Sub1_Sub2 local76 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local71];
				@Pc(81) int local81 = arg0.method479(1);
				if (local81 == 0) {
					this.anIntArray244[this.anInt969++] = local71;
					local76.anInt662 = anInt1032;
				} else {
					@Pc(104) int local104 = arg0.method479(2);
					if (local104 == 0) {
						this.anIntArray244[this.anInt969++] = local71;
						local76.anInt662 = anInt1032;
						this.anIntArray245[this.anInt970++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray244[this.anInt969++] = local71;
							local76.anInt662 = anInt1032;
							local155 = arg0.method479(3);
							local76.method403(false, local155);
							local165 = arg0.method479(1);
							if (local165 == 1) {
								this.anIntArray245[this.anInt970++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray244[this.anInt969++] = local71;
							local76.anInt662 = anInt1032;
							local155 = arg0.method479(3);
							local76.method403(true, local155);
							local165 = arg0.method479(3);
							local76.method403(true, local165);
							@Pc(223) int local223 = arg0.method479(1);
							if (local223 == 1) {
								this.anIntArray245[this.anInt970++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray247[this.anInt987++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("60842, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method697(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (this.aByte37 == 8) {
				@Pc(7) boolean local7 = false;
				this.method621();
				this.aClass17_21.method154();
				this.aClass3_Sub3_Sub3_Sub2_19.method285(0, 0);
				@Pc(55) byte local55;
				@Pc(67) int local67;
				if (this.anInt874 == 0) {
					this.aClass3_Sub3_Sub3_Sub4_2.method561(7711145, true, this.aClass6_Sub1_1.aString4, 180, 180);
					local55 = 80;
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16776960, true, "Welcome to RuneScape", 180, 80);
					local67 = local55 + 30;
					this.aClass3_Sub3_Sub3_Sub2_20.method285(27, 100);
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "New User", 100, 125);
					this.aClass3_Sub3_Sub3_Sub2_20.method285(187, 100);
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "Existing User", 260, 125);
				}
				if (this.anInt874 == 2) {
					local55 = 60;
					if (this.aString21.length() > 0) {
						this.aClass3_Sub3_Sub3_Sub4_4.method561(16776960, true, this.aString21, 180, 45);
						this.aClass3_Sub3_Sub3_Sub4_4.method561(16776960, true, this.aString22, 180, 60);
						local67 = local55 + 30;
					} else {
						this.aClass3_Sub3_Sub3_Sub4_4.method561(16776960, true, this.aString22, 180, 53);
						local67 = local55 + 30;
					}
					this.aClass3_Sub3_Sub3_Sub4_4.method568((byte) 3, true, "Username: " + this.aString28 + (this.anInt931 == 0 & anInt1032 % 40 < 20 ? "@yel@|" : ""), 90, 16777215, 90);
					local67 += 15;
					this.aClass3_Sub3_Sub3_Sub4_4.method568((byte) 3, true, "Password: " + Class48.method540(this.aString29) + (this.anInt931 == 1 & anInt1032 % 40 < 20 ? "@yel@|" : ""), 92, 16777215, 105);
					local67 += 15;
					if (!arg1) {
						this.aClass3_Sub3_Sub3_Sub2_20.method285(27, 130);
						this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "Login", 100, 155);
						this.aClass3_Sub3_Sub3_Sub2_20.method285(187, 130);
						this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "Cancel", 260, 155);
					}
				}
				if (this.anInt874 == 3) {
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16776960, true, "Create a free account", 180, 40);
					local55 = 65;
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "To create a new account you need to", 180, 65);
					local67 = local55 + 15;
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "go back to the main RuneScape webpage", 180, 80);
					local67 += 15;
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "and choose the 'create account'", 180, 95);
					local67 += 15;
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "button near the top of that page.", 180, 110);
					local67 += 15;
					this.aClass3_Sub3_Sub3_Sub2_20.method285(107, 130);
					this.aClass3_Sub3_Sub3_Sub4_4.method561(16777215, true, "Cancel", 180, 155);
				}
				this.aClass17_21.method155(super.aGraphics2, 202, 171);
				if (this.aBoolean244) {
					this.aBoolean244 = false;
					this.aClass17_19.method155(super.aGraphics2, 128, 0);
					this.aClass17_20.method155(super.aGraphics2, 202, 371);
					this.aClass17_24.method155(super.aGraphics2, 0, 265);
					this.aClass17_25.method155(super.aGraphics2, 562, 265);
					this.aClass17_26.method155(super.aGraphics2, 128, 171);
					this.aClass17_27.method155(super.aGraphics2, 562, 171);
				}
			}
		} catch (@Pc(500) RuntimeException local500) {
			signlink.reporterror("36340, " + arg0 + ", " + arg1 + ", " + local500.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method698() {
		try {
			@Pc(4) Graphics local4 = this.method585().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method578();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean219) {
				this.aBoolean243 = false;
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
			if (this.aBoolean239) {
				this.aBoolean243 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean233) {
				this.aBoolean243 = false;
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
			signlink.reporterror("59515, " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method700() {
		try {
			if (super.anInt841 == 1) {
				if (super.anInt842 >= 6 && super.anInt842 <= 106 && super.anInt843 >= 467 && super.anInt843 <= 499) {
					this.anInt937 = (this.anInt937 + 1) % 4;
					this.aBoolean234 = true;
					this.aBoolean237 = true;
					this.aClass3_Sub3_Sub4_6.method457(102);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt937);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt900);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt1024);
				}
				if (super.anInt842 >= 135 && super.anInt842 <= 235 && super.anInt843 >= 467 && super.anInt843 <= 499) {
					this.anInt900 = (this.anInt900 + 1) % 3;
					this.aBoolean234 = true;
					this.aBoolean237 = true;
					this.aClass3_Sub3_Sub4_6.method457(102);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt937);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt900);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt1024);
				}
				if (super.anInt842 >= 273 && super.anInt842 <= 373 && super.anInt843 >= 467 && super.anInt843 <= 499) {
					this.anInt1024 = (this.anInt1024 + 1) % 3;
					this.aBoolean234 = true;
					this.aBoolean237 = true;
					this.aClass3_Sub3_Sub4_6.method457(102);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt937);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt900);
					this.aClass3_Sub3_Sub4_6.method458(this.anInt1024);
				}
				if (super.anInt842 >= 412 && super.anInt842 <= 512 && super.anInt843 >= 467 && super.anInt843 <= 499) {
					if (this.anInt1061 == -1) {
						this.method609();
						this.aString30 = "";
						this.aBoolean235 = false;
						this.anInt938 = this.anInt1061 = Class23.anInt343;
						return;
					}
					this.method716((byte) 2, 0, "Please close the interface you have open before using 'report abuse'", "");
					return;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("9881, " + 3 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method701(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.aBoolean208 = !this.aBoolean208;
			}
			this.aClass17_15.method154();
			Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray232;
			this.aClass3_Sub3_Sub3_Sub2_8.method285(0, 0);
			if (this.anInt899 != -1) {
				this.method626(0, 0, this.aByte42, Class23.method208(this.anInt899), 0);
			} else if (this.anIntArray251[this.anInt885] != -1) {
				this.method626(0, 0, this.aByte42, Class23.method208(this.anIntArray251[this.anInt885]), 0);
			}
			if (this.aBoolean223 && this.anInt950 == 1) {
				this.method646();
			}
			this.aClass17_15.method155(super.aGraphics2, 553, 205);
			this.aClass17_17.method154();
			Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("13294, " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!MRUJPFPS;Z)Z")
	private boolean method702(@OriginalArg(0) Class23 arg0) {
		try {
			if (arg0.anIntArray99 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < arg0.anIntArray99.length; local11++) {
				@Pc(19) int local19 = this.method705(arg0, local11);
				@Pc(24) int local24 = arg0.anIntArray101[local11];
				if (arg0.anIntArray99[local11] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg0.anIntArray99[local11] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg0.anIntArray99[local11] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("17892, " + arg0 + ", " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method703() {
		try {
			this.aBoolean243 = false;
			while (this.aBoolean236) {
				this.aBoolean243 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass3_Sub3_Sub3_Sub2_19 = null;
			this.aClass3_Sub3_Sub3_Sub2_20 = null;
			this.aClass3_Sub3_Sub3_Sub2Array2 = null;
			this.anIntArray263 = null;
			this.anIntArray264 = null;
			this.anIntArray265 = null;
			this.anIntArray266 = null;
			this.anIntArray241 = null;
			this.anIntArray242 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.aClass3_Sub3_Sub3_Sub1_3 = null;
			this.aClass3_Sub3_Sub3_Sub1_4 = null;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("3116, " + -789 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method704(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt949 == 0 && super.anInt841 == 1) {
				@Pc(18) int local18 = super.anInt842 - 25 - 550;
				@Pc(25) int local25 = super.anInt843 - 5 - 4;
				if (local18 >= 0 && local25 >= 0 && local18 < 146 && local25 < 151) {
					local18 -= 73;
					local25 -= 75;
					@Pc(45) int local45 = this.anInt1020 + this.anInt892 & 0x7FF;
					@Pc(49) int local49 = Class3_Sub3_Sub3_Sub3.anIntArray143[local45];
					@Pc(53) int local53 = Class3_Sub3_Sub3_Sub3.anIntArray144[local45];
					@Pc(62) int local62 = local49 * (this.anInt1026 + 256) >> 8;
					@Pc(71) int local71 = local53 * (this.anInt1026 + 256) >> 8;
					@Pc(81) int local81 = local25 * local62 + local18 * local71 >> 11;
					@Pc(91) int local91 = local25 * local71 - local18 * local62 >> 11;
					@Pc(98) int local98 = aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 + local81 >> 7;
					@Pc(105) int local105 = aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 - local91 >> 7;
					@Pc(126) boolean local126 = this.method642(0, true, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local98, 1, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local105, 0, 0);
					if (local126) {
						this.aClass3_Sub3_Sub4_6.method458(local18);
						this.aClass3_Sub3_Sub4_6.method458(local25);
						this.aClass3_Sub3_Sub4_6.method459(this.anInt1020);
						this.aClass3_Sub3_Sub4_6.method458(57);
						this.aClass3_Sub3_Sub4_6.method458(this.anInt892);
						this.aClass3_Sub3_Sub4_6.method458(this.anInt1026);
						this.aClass3_Sub3_Sub4_6.method458(89);
						this.aClass3_Sub3_Sub4_6.method459(aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685);
						this.aClass3_Sub3_Sub4_6.method459(aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686);
						this.aClass3_Sub3_Sub4_6.method458(this.anInt1065);
						this.aClass3_Sub3_Sub4_6.method458(63);
						return;
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("81124, " + arg0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MRUJPFPS;II)I")
	private int method705(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray12 == null || arg1 >= arg0.anIntArrayArray12.length) {
				return -2;
			}
			try {
				@Pc(23) int[] local23 = arg0.anIntArrayArray12[arg1];
				@Pc(25) int local25 = 0;
				@Pc(27) int local27 = 0;
				@Pc(29) byte local29 = 0;
				while (true) {
					@Pc(34) int local34 = local23[local27++];
					@Pc(36) int local36 = 0;
					@Pc(38) byte local38 = 0;
					if (local34 == 0) {
						return local25;
					}
					if (local34 == 1) {
						local36 = this.anIntArray213[local23[local27++]];
					}
					if (local34 == 2) {
						local36 = this.anIntArray252[local23[local27++]];
					}
					if (local34 == 3) {
						local36 = this.anIntArray270[local23[local27++]];
					}
					@Pc(84) Class23 local84;
					@Pc(89) int local89;
					@Pc(102) int local102;
					if (local34 == 4) {
						local84 = Class23.method208(local23[local27++]);
						local89 = local23[local27++];
						if (local89 >= 0 && local89 < Class1.anInt9 && (!Class1.method7(local89).aBoolean4 || aBoolean225)) {
							for (local102 = 0; local102 < local84.anIntArray98.length; local102++) {
								if (local84.anIntArray98[local102] == local89 + 1) {
									local36 += local84.anIntArray100[local102];
								}
							}
						}
					}
					if (local34 == 5) {
						local36 = this.anIntArray272[local23[local27++]];
					}
					if (local34 == 6) {
						local36 = anIntArray235[this.anIntArray252[local23[local27++]] - 1];
					}
					if (local34 == 7) {
						local36 = this.anIntArray272[local23[local27++]] * 100 / 46875;
					}
					if (local34 == 8) {
						local36 = aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt701;
					}
					@Pc(177) int local177;
					if (local34 == 9) {
						for (local177 = 0; local177 < Class42.anInt753; local177++) {
							if (Class42.aBooleanArray10[local177]) {
								local36 += this.anIntArray252[local177];
							}
						}
					}
					if (local34 == 10) {
						local84 = Class23.method208(local23[local27++]);
						local89 = local23[local27++] + 1;
						if (local89 >= 0 && local89 < Class1.anInt9 && (!Class1.method7(local89).aBoolean4 || aBoolean225)) {
							for (local102 = 0; local102 < local84.anIntArray98.length; local102++) {
								if (local84.anIntArray98[local102] == local89) {
									local36 = 999999999;
									break;
								}
							}
						}
					}
					if (local34 == 11) {
						local36 = this.anInt915;
					}
					if (local34 == 12) {
						local36 = this.anInt886;
					}
					if (local34 == 13) {
						local177 = this.anIntArray272[local23[local27++]];
						local89 = local23[local27++];
						local36 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
					}
					if (local34 == 14) {
						local177 = local23[local27++];
						@Pc(291) Class36 local291 = Class36.aClass36Array1[local177];
						local102 = local291.anInt721;
						@Pc(297) int local297 = local291.anInt722;
						@Pc(300) int local300 = local291.anInt723;
						@Pc(306) int local306 = anIntArray218[local300 - local297];
						local36 = this.anIntArray272[local102] >> local297 & local306;
					}
					if (local34 == 15) {
						local38 = 1;
					}
					if (local34 == 16) {
						local38 = 2;
					}
					if (local34 == 17) {
						local38 = 3;
					}
					if (local34 == 18) {
						local36 = (aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt685 >> 7) + this.anInt1003;
					}
					if (local34 == 19) {
						local36 = (aClass3_Sub3_Sub2_Sub1_Sub2_1.anInt686 >> 7) + this.anInt1004;
					}
					if (local34 == 20) {
						local36 = local23[local27++];
					}
					if (local38 == 0) {
						if (local29 == 0) {
							local25 += local36;
						}
						if (local29 == 1) {
							local25 -= local36;
						}
						if (local29 == 2 && local36 != 0) {
							local25 /= local36;
						}
						if (local29 == 3) {
							local25 *= local36;
						}
						local29 = 0;
					} else {
						local29 = local38;
					}
				}
			} catch (@Pc(399) Exception local399) {
				return -1;
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("9181, " + arg0 + ", " + 827 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method706() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray226[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray226[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray227[local54] = (this.anIntArray226[local54 - 1] + this.anIntArray226[local54 + 1] + this.anIntArray226[local54 - 128] + this.anIntArray226[local54 + 128]) / 4;
				}
			}
			this.anInt920 += 128;
			if (this.anInt920 > this.anIntArray241.length) {
				this.anInt920 -= this.anIntArray241.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method679(this.aClass3_Sub3_Sub3_Sub2Array2[local48], this.anInt1042);
			}
			@Pc(167) int local167;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local167 = local54 + (local48 << 7);
					@Pc(190) int local190 = this.anIntArray227[local167 + 128] - this.anIntArray241[local167 + this.anInt920 & this.anIntArray241.length - 1] / 5;
					if (local190 < 0) {
						local190 = 0;
					}
					this.anIntArray226[local167] = local190;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray269[local54] = this.anIntArray269[local54 + 1];
			}
			this.anIntArray269[255] = (int) (Math.sin((double) anInt1032 / 14.0D) * 16.0D + Math.sin((double) anInt1032 / 15.0D) * 14.0D + Math.sin((double) anInt1032 / 16.0D) * 12.0D);
			if (this.anInt991 > 0) {
				this.anInt991 -= 4;
			}
			if (this.anInt992 > 0) {
				this.anInt992 -= 4;
			}
			if (this.anInt991 == 0 && this.anInt992 == 0) {
				local167 = (int) (Math.random() * 2000.0D);
				if (local167 == 0) {
					this.anInt991 = 1024;
				}
				if (local167 == 1) {
					this.anInt992 = 1024;
					return;
				}
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("27507, " + false + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method581() {
		try {
			if (!this.aBoolean233 && !this.aBoolean219 && !this.aBoolean239) {
				anInt1032++;
				if (this.aBoolean241) {
					this.method643();
				} else {
					this.method637();
				}
				this.method595();
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("35107, " + 10962 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method707() {
		try {
			if (this.anInt1071 >= 2 || this.anInt910 != 0 || this.anInt957 != 0) {
				@Pc(31) String local31;
				if (this.anInt910 == 1 && this.anInt1071 < 2) {
					local31 = "Use " + this.aString20 + " with...";
				} else if (this.anInt957 == 1 && this.anInt1071 < 2) {
					local31 = this.aString23 + "...";
				} else {
					local31 = this.aStringArray9[this.anInt1071 - 1];
				}
				if (this.anInt1071 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt1071 - 2) + " more options";
				}
				this.aClass3_Sub3_Sub3_Sub4_4.method569(local31, 4, 15, 16777215, anInt1032 / 1000);
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("75023, " + 47975 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method708() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray223[8] = 0;
			@Pc(10) int local10 = 0;
			while (this.anIntArray223[8] == 0) {
				@Pc(18) String local18 = "Unknown problem";
				this.method587(20, "Connecting to web server");
				try {
					@Pc(40) DataInputStream local40 = this.method657("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 369);
					@Pc(47) Class3_Sub3_Sub4 local47 = new Class3_Sub3_Sub4((byte) -115, new byte[40]);
					local40.readFully(local47.aByteArray20, 0, 40);
					local40.close();
					for (@Pc(57) int local57 = 0; local57 < 9; local57++) {
						this.anIntArray223[local57] = local47.method473();
					}
					@Pc(72) int local72 = local47.method473();
					@Pc(74) int local74 = 1234;
					for (@Pc(76) int local76 = 0; local76 < 9; local76++) {
						local74 = (local74 << 1) + this.anIntArray223[local76];
					}
					if (local72 != local74) {
						local18 = "checksum problem";
						this.anIntArray223[8] = 0;
					}
				} catch (@Pc(103) EOFException local103) {
					local18 = "EOF problem";
					this.anIntArray223[8] = 0;
				} catch (@Pc(112) IOException local112) {
					local18 = "connection problem";
					this.anIntArray223[8] = 0;
				} catch (@Pc(121) Exception local121) {
					local18 = "logic problem";
					this.anIntArray223[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray223[8] == 0) {
					local10++;
					for (@Pc(139) int local139 = local3; local139 > 0; local139--) {
						if (local10 >= 10) {
							this.method587(10, "Game updated - please reload page");
							local139 = 10;
						} else {
							this.method587(10, local18 + " - Will retry in " + local139 + " secs.");
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
					this.aBoolean215 = !this.aBoolean215;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("61838, " + false + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
	private void method709() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt862);
			if (this.aClass6_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass6_Sub1_1.anInt295);
			}
			System.out.println("loop-cycle:" + anInt1032);
			System.out.println("draw-cycle:" + anInt918);
			System.out.println("ptype:" + this.anInt944);
			System.out.println("psize:" + this.anInt943);
			if (this.aClass21_1 != null) {
				this.aClass21_1.method191();
			}
			super.aBoolean197 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("36653, " + -26491 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method585() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("51888, " + 731 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method710() {
		try {
			if (this.anInt960 == 2) {
				this.method691(this.anInt877 * 2, (this.anInt876 - this.anInt1004 << 7) + this.anInt879, (this.anInt875 - this.anInt1003 << 7) + this.anInt878);
				this.aBoolean241 &= true;
				if (this.anInt1052 > -1 && anInt1032 % 20 < 10) {
					this.aClass3_Sub3_Sub3_Sub1Array7[0].method258(this.anInt1052 - 12, this.anInt1053 - 28);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("99621, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method711() {
		try {
			try {
				if (this.aClass21_1 != null) {
					this.aClass21_1.method186();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass21_1 = null;
			this.aBoolean241 = false;
			this.anInt874 = 0;
			this.aString28 = "";
			this.aString29 = "";
			this.method618();
			this.aClass31_1.method337();
			for (@Pc(39) int local39 = 0; local39 < 4; local39++) {
				this.aClass4Array1[local39].method29();
			}
			System.gc();
			this.method654();
			this.anInt971 = -1;
			this.anInt873 = -1;
			this.anInt966 = 0;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("8672, " + 8 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	private void method712(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(21) int local21;
			if (this.aClass17_17 != null) {
				this.aClass17_17.method154();
				Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray233;
				local21 = 151;
				if (arg0 != null) {
					local21 -= 7;
				}
				this.aClass3_Sub3_Sub3_Sub4_3.method560(local21, 0, 257, arg1);
				this.aClass3_Sub3_Sub3_Sub4_3.method560(local21 - 1, 16777215, 256, arg1);
				local21 += 15;
				if (arg0 != null) {
					this.aClass3_Sub3_Sub3_Sub4_3.method560(local21, 0, 257, arg0);
					this.aClass3_Sub3_Sub3_Sub4_3.method560(local21 - 1, 16777215, 256, arg0);
				}
				this.aClass17_17.method155(super.aGraphics2, 4, 4);
			} else if (super.aClass17_2 != null) {
				super.aClass17_2.method154();
				Class3_Sub3_Sub3_Sub3.anIntArray145 = this.anIntArray234;
				local21 = 251;
				Class3_Sub3_Sub3.method552(0, this.aByte40, 233, 221, 50, 300);
				Class3_Sub3_Sub3.method553(300, 221, 50, 233, 16777215);
				if (arg0 != null) {
					local21 -= 7;
				}
				this.aClass3_Sub3_Sub3_Sub4_3.method560(local21, 0, 383, arg1);
				this.aClass3_Sub3_Sub3_Sub4_3.method560(local21 - 1, 16777215, 382, arg1);
				local21 += 15;
				if (arg0 != null) {
					this.aClass3_Sub3_Sub3_Sub4_3.method560(local21, 0, 383, arg0);
					this.aClass3_Sub3_Sub3_Sub4_3.method560(local21 - 1, 16777215, 382, arg0);
				}
				super.aClass17_2.method155(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("68367, " + -43 + ", " + arg0 + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method713(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.anInt935 = this.aClass41_2.method511();
			}
			for (@Pc(13) Class3_Sub2 local13 = (Class3_Sub2) this.aClass26_10.method224(); local13 != null; local13 = (Class3_Sub2) this.aClass26_10.method226()) {
				if (local13.anInt87 == -1) {
					local13.anInt88 = 0;
					this.method644(local13);
				} else {
					local13.method545();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("29073, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method714(@OriginalArg(0) int arg0) {
		try {
			@Pc(15) int local15 = Class44.aClass44Array1[arg0].anInt768;
			if (local15 != 0) {
				@Pc(23) int local23 = this.anIntArray272[arg0];
				if (local15 == 1) {
					if (local23 == 1) {
						Class3_Sub3_Sub3_Sub3.method310(0.9D);
					}
					if (local23 == 2) {
						Class3_Sub3_Sub3_Sub3.method310(0.8D);
					}
					if (local23 == 3) {
						Class3_Sub3_Sub3_Sub3.method310(0.7D);
					}
					if (local23 == 4) {
						Class3_Sub3_Sub3_Sub3.method310(0.6D);
					}
					Class1.aClass25_2.method220();
					this.aBoolean244 = true;
				}
				if (local15 == 3) {
					@Pc(61) boolean local61 = this.aBoolean221;
					if (local23 == 0) {
						this.method594(0, this.aBoolean221);
						this.aBoolean221 = true;
					}
					if (local23 == 1) {
						this.method594(-400, this.aBoolean221);
						this.aBoolean221 = true;
					}
					if (local23 == 2) {
						this.method594(-800, this.aBoolean221);
						this.aBoolean221 = true;
					}
					if (local23 == 3) {
						this.method594(-1200, this.aBoolean221);
						this.aBoolean221 = true;
					}
					if (local23 == 4) {
						this.aBoolean221 = false;
					}
					if (this.aBoolean221 != local61 && !aBoolean226) {
						if (this.aBoolean221) {
							this.anInt873 = this.anInt971;
							this.aBoolean202 = true;
							this.aClass6_Sub1_1.method174(2, this.anInt873);
						} else {
							this.method654();
						}
						this.anInt966 = 0;
					}
				}
				if (local15 == 4) {
					if (local23 == 0) {
						this.aBoolean212 = true;
						this.method623(0, this.aBoolean211);
					}
					if (local23 == 1) {
						this.aBoolean212 = true;
						this.method623(-400, this.aBoolean211);
					}
					if (local23 == 2) {
						this.aBoolean212 = true;
						this.method623(-800, this.aBoolean211);
					}
					if (local23 == 3) {
						this.aBoolean212 = true;
						this.method623(-1200, this.aBoolean211);
					}
					if (local23 == 4) {
						this.aBoolean212 = false;
					}
				}
				if (local15 == 5) {
					this.anInt994 = local23;
				}
				if (local15 == 6) {
					this.anInt909 = local23;
				}
				if (local15 == 8) {
					this.anInt978 = local23;
					this.aBoolean237 = true;
				}
				if (local15 == 9) {
					this.anInt974 = local23;
				}
			}
		} catch (@Pc(225) RuntimeException local225) {
			signlink.reporterror("10061, " + arg0 + ", " + -120 + ", " + local225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method715() {
		try {
			if (this.anInt1000 == 0) {
				@Pc(10) int local10 = super.anInt841;
				if (this.anInt957 == 1 && super.anInt842 >= 516 && super.anInt843 >= 160 && super.anInt842 <= 765 && super.anInt843 <= 205) {
					local10 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean223) {
					if (local10 != 1) {
						local41 = super.anInt836;
						local44 = super.anInt837;
						if (this.anInt950 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt950 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt950 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt951 - 10 || local41 > this.anInt951 + this.anInt953 + 10 || local44 < this.anInt952 - 10 || local44 > this.anInt952 + this.anInt954 + 10) {
							this.aBoolean223 = false;
							if (this.anInt950 == 1) {
								this.aBoolean216 = true;
							}
							if (this.anInt950 == 2) {
								this.aBoolean237 = true;
							}
						}
					}
					if (local10 == 1) {
						local41 = this.anInt951;
						local44 = this.anInt952;
						local120 = this.anInt953;
						@Pc(123) int local123 = super.anInt842;
						@Pc(126) int local126 = super.anInt843;
						if (this.anInt950 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt950 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt950 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt1071; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt1071 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method718(local145);
						}
						this.aBoolean223 = false;
						if (this.anInt950 == 1) {
							this.aBoolean216 = true;
						}
						if (this.anInt950 == 2) {
							this.aBoolean237 = true;
							return;
						}
					}
				} else {
					if (local10 == 1 && this.anInt1071 > 0) {
						local41 = this.anIntArray221[this.anInt1071 - 1];
						if (local41 == 219 || local41 == 915 || local41 == 486 || local41 == 463 || local41 == 343 || local41 == 620 || local41 == 5 || local41 == 121 || local41 == 501 || local41 == 837 || local41 == 888 || local41 == 1940) {
							local44 = this.anIntArray219[this.anInt1071 - 1];
							local120 = this.anIntArray220[this.anInt1071 - 1];
							@Pc(281) Class23 local281 = Class23.method208(local120);
							if (local281.aBoolean90 || local281.aBoolean84) {
								this.aBoolean203 = false;
								this.anInt905 = 0;
								this.anInt998 = local120;
								this.anInt999 = local44;
								this.anInt1000 = 2;
								this.anInt1001 = super.anInt842;
								this.anInt1002 = super.anInt843;
								if (Class23.method208(local120).anInt351 == this.anInt1061) {
									this.anInt1000 = 1;
								}
								if (Class23.method208(local120).anInt351 == this.anInt903) {
									this.anInt1000 = 3;
								}
								return;
							}
						}
					}
					if (local10 == 1 && (this.anInt994 == 1 || this.method694(this.anInt1071 - 1)) && this.anInt1071 > 2) {
						local10 = 2;
					}
					if (local10 == 1 && this.anInt1071 > 0) {
						this.method718(this.anInt1071 - 1);
					}
					if (local10 != 2 || this.anInt1071 <= 0) {
						return;
					}
					this.method674();
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("49348, " + 6 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
	private void method716(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		try {
			if (arg1 == 0 && this.anInt996 != -1) {
				this.aString31 = arg2;
				super.anInt841 = 0;
			}
			if (this.anInt903 == -1) {
				this.aBoolean237 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray276[local22] = this.anIntArray276[local22 - 1];
				this.aStringArray13[local22] = this.aStringArray13[local22 - 1];
				this.aStringArray14[local22] = this.aStringArray14[local22 - 1];
			}
			if (this.aByte39 == 2) {
				@Pc(63) boolean local63 = false;
			} else {
				for (@Pc(67) int local67 = 1; local67 > 0; local67++) {
				}
			}
			this.anIntArray276[0] = arg1;
			this.aStringArray13[0] = arg3;
			this.aStringArray14[0] = arg2;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("24549, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method717(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt930; local7++) {
				@Pc(17) Class3_Sub3_Sub2_Sub1_Sub1 local17 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[this.anIntArray239[local7]];
				@Pc(26) int local26 = (this.anIntArray239[local7] << 14) + 536870912;
				if (local17 != null && local17.method400() && local17.aClass30_1.aBoolean128 == arg0 && local17.aClass30_1.method318(767)) {
					@Pc(47) int local47 = local17.anInt685 >> 7;
					@Pc(52) int local52 = local17.anInt686 >> 7;
					if (local47 >= 0 && local47 < 104 && local52 >= 0 && local52 < 104) {
						if (local17.anInt654 == 1 && (local17.anInt685 & 0x7F) == 64 && (local17.anInt686 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local47][local52] == this.anInt936) {
								continue;
							}
							this.anIntArrayArray22[local47][local52] = this.anInt936;
						}
						if (!local17.aClass30_1.aBoolean126) {
							local26 += Integer.MIN_VALUE;
						}
						this.aClass31_1.method348(this.anInt1056, local26, (local17.anInt654 - 1) * 64 + 60, local17, local17.anInt686, local17.anInt685, local17.anInt687, this.method695(this.anInt1056, local17.anInt685, local17.anInt686), local17.aBoolean154);
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("75017, " + arg0 + ", " + 8 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method718(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray219[arg0];
				@Pc(14) int local14 = this.anIntArray220[arg0];
				@Pc(19) int local19 = this.anIntArray221[arg0];
				@Pc(24) int local24 = this.anIntArray222[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt985 != 0 && local19 != 1442) {
					this.anInt985 = 0;
					this.aBoolean237 = true;
				}
				if (local19 == 1313) {
					this.method647(local24, local9, local14);
					this.aClass3_Sub3_Sub4_6.method457(218);
					this.aClass3_Sub3_Sub4_6.method492(local14 + this.anInt1004);
					this.aClass3_Sub3_Sub4_6.method492(local9 + this.anInt1003);
					this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24 >> 14 & 0x7FFF);
				}
				@Pc(89) String local89;
				@Pc(93) int local93;
				@Pc(104) long local104;
				@Pc(106) int local106;
				if (local19 == 956) {
					local89 = this.aStringArray9[arg0];
					local93 = local89.indexOf("@whi@");
					if (local93 != -1) {
						local104 = Class48.method535(local89.substring(local93 + 5).trim());
						local106 = -1;
						for (@Pc(108) int local108 = 0; local108 < this.anInt1033; local108++) {
							if (this.aLongArray3[local108] == local104) {
								local106 = local108;
								break;
							}
						}
						if (local106 != -1 && this.anIntArray215[local106] > 0) {
							this.aBoolean237 = true;
							this.anInt985 = 0;
							this.aBoolean204 = true;
							this.aString27 = "";
							this.anInt1031 = 3;
							this.aLong31 = this.aLongArray3[local106];
							this.aString26 = "Enter message to send to " + this.aStringArray10[local106];
						}
					}
				}
				@Pc(173) Class1 local173;
				@Pc(199) String local199;
				if (local19 == 1940) {
					local173 = Class1.method7(local24);
					@Pc(176) Class23 local176 = Class23.method208(local14);
					if (local176 != null && local176.anIntArray100[local9] >= 100000) {
						local199 = local176.anIntArray100[local9] + " x " + local173.aString1;
					} else if (local173.aByteArray1 == null) {
						local199 = "It's a " + local173.aString1 + ".";
					} else {
						local199 = new String(local173.aByteArray1);
					}
					this.method716((byte) 2, 0, local199, "");
				}
				if (local19 == 431) {
					this.method614(this.anInt996);
					this.anInt996 = -1;
					this.aBoolean237 = true;
				}
				@Pc(267) boolean local267;
				if (local19 == 48) {
					local267 = this.method642(0, false, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 0, 0);
					if (!local267) {
						this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 1, 0);
					}
					this.anInt1038 = super.anInt842;
					this.anInt1039 = super.anInt843;
					this.anInt1041 = 2;
					this.anInt1040 = 0;
					if ((local9 & 0x3) == 0) {
						anInt889++;
					}
					if (anInt889 >= 107) {
						this.aClass3_Sub3_Sub4_6.method457(166);
						anInt889 = 0;
					}
					this.aClass3_Sub3_Sub4_6.method457(0);
					this.aClass3_Sub3_Sub4_6.method492(local9 + this.anInt1003);
					this.aClass3_Sub3_Sub4_6.method491(local24);
					this.aClass3_Sub3_Sub4_6.method459(local14 + this.anInt1004);
				}
				if (local19 == 343) {
					anInt948 += local9;
					if (anInt948 >= 73) {
						this.aClass3_Sub3_Sub4_6.method457(32);
						this.aClass3_Sub3_Sub4_6.method462(0);
						anInt948 = 0;
					}
					this.aClass3_Sub3_Sub4_6.method457(174);
					this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local9);
					this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24);
					this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local14);
					this.anInt962 = 0;
					this.anInt963 = local14;
					this.anInt964 = local9;
					this.anInt965 = 2;
					if (Class23.method208(local14).anInt351 == this.anInt1061) {
						this.anInt965 = 1;
					}
					if (Class23.method208(local14).anInt351 == this.anInt903) {
						this.anInt965 = 3;
					}
				}
				if (local19 == 837) {
					this.aClass3_Sub3_Sub4_6.method457(202);
					this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local14);
					this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local9);
					this.aClass3_Sub3_Sub4_6.method492(local24);
					this.anInt962 = 0;
					this.anInt963 = local14;
					this.anInt964 = local9;
					this.anInt965 = 2;
					if (Class23.method208(local14).anInt351 == this.anInt1061) {
						this.anInt965 = 1;
					}
					if (Class23.method208(local14).anInt351 == this.anInt903) {
						this.anInt965 = 3;
					}
				}
				if (local19 == 486) {
					this.aClass3_Sub3_Sub4_6.method457(135);
					this.aClass3_Sub3_Sub4_6.method491(local24);
					this.aClass3_Sub3_Sub4_6.method492(local14);
					this.aClass3_Sub3_Sub4_6.method459(local9);
					this.anInt962 = 0;
					this.anInt963 = local14;
					this.anInt964 = local9;
					this.anInt965 = 2;
					if (Class23.method208(local14).anInt351 == this.anInt1061) {
						this.anInt965 = 1;
					}
					if (Class23.method208(local14).anInt351 == this.anInt903) {
						this.anInt965 = 3;
					}
				}
				@Pc(534) Class23 local534;
				if (local19 == 120) {
					local534 = Class23.method208(local14);
					@Pc(536) boolean local536 = true;
					if (local534.anInt334 > 0) {
						local536 = this.method656((byte) 9, local534);
					}
					if (local536) {
						this.aClass3_Sub3_Sub4_6.method457(124);
						this.aClass3_Sub3_Sub4_6.method459(local14);
					}
				}
				if (local19 == 209) {
					local267 = this.method642(0, false, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 0, 0);
					if (!local267) {
						this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 1, 0);
					}
					this.anInt1038 = super.anInt842;
					this.anInt1039 = super.anInt843;
					this.anInt1041 = 2;
					this.anInt1040 = 0;
					this.aClass3_Sub3_Sub4_6.method457(172);
					this.aClass3_Sub3_Sub4_6.method492(local9 + this.anInt1003);
					this.aClass3_Sub3_Sub4_6.method492(local24);
					this.aClass3_Sub3_Sub4_6.method459(local14 + this.anInt1004);
				}
				@Pc(681) String local681;
				if (local19 == 457) {
					local534 = Class23.method208(local14);
					this.anInt957 = 1;
					this.anInt958 = local14;
					this.anInt959 = local534.anInt366;
					this.anInt910 = 0;
					this.aBoolean216 = true;
					local199 = local534.aString7;
					if (local199.indexOf(" ") != -1) {
						local199 = local199.substring(0, local199.indexOf(" "));
					}
					local681 = local534.aString7;
					if (local681.indexOf(" ") != -1) {
						local681 = local681.substring(local681.indexOf(" ") + 1);
					}
					this.aString23 = local199 + " " + local534.aString9 + " " + local681;
					if (this.anInt959 == 16) {
						this.aBoolean216 = true;
						this.anInt885 = 3;
						this.aBoolean214 = true;
					}
				} else {
					if (local19 == 542) {
						this.method609();
					}
					if (local19 == 50 || local19 == 478 || local19 == 169 || local19 == 34) {
						local89 = this.aStringArray9[arg0];
						local93 = local89.indexOf("@whi@");
						if (local93 != -1) {
							local104 = Class48.method535(local89.substring(local93 + 5).trim());
							if (local19 == 50) {
								this.method633(local104);
							}
							if (local19 == 478) {
								this.method682(local104);
							}
							if (local19 == 169) {
								this.method591(438, local104);
							}
							if (local19 == 34) {
								this.method634((byte) 6, local104);
							}
						}
					}
					@Pc(799) Class3_Sub3_Sub2_Sub1_Sub2 local799;
					if (local19 == 66) {
						local799 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local24];
						if (local799 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local799.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local799.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(224);
							this.aClass3_Sub3_Sub4_6.method459(local24);
						}
					}
					@Pc(859) Class3_Sub3_Sub2_Sub1_Sub1 local859;
					if (local19 == 531) {
						local859 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
						if (local859 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local859.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local859.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(242);
							this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24);
						}
					}
					if (local19 == 501) {
						anInt867 += local24;
						if (anInt867 >= 70) {
							this.aClass3_Sub3_Sub4_6.method457(177);
							this.aClass3_Sub3_Sub4_6.method462(0);
							anInt867 = 0;
						}
						this.aClass3_Sub3_Sub4_6.method457(107);
						this.aClass3_Sub3_Sub4_6.method492(local14);
						this.aClass3_Sub3_Sub4_6.method491(local9);
						this.aClass3_Sub3_Sub4_6.method491(local24);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 576) {
						this.aClass3_Sub3_Sub4_6.method457(168);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt911);
						this.aClass3_Sub3_Sub4_6.method459(local14);
						this.aClass3_Sub3_Sub4_6.method459(local24);
						this.aClass3_Sub3_Sub4_6.method492(this.anInt913);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt912);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local9);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 974) {
						this.aClass3_Sub3_Sub4_6.method457(98);
						this.aClass3_Sub3_Sub4_6.method492(local9);
						this.aClass3_Sub3_Sub4_6.method459(local14);
						this.aClass3_Sub3_Sub4_6.method459(local24);
						this.aClass3_Sub3_Sub4_6.method459(this.anInt958);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 219) {
						this.aClass3_Sub3_Sub4_6.method457(220);
						this.aClass3_Sub3_Sub4_6.method491(local24);
						this.aClass3_Sub3_Sub4_6.method491(local14);
						this.aClass3_Sub3_Sub4_6.method492(local9);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 915) {
						this.aClass3_Sub3_Sub4_6.method457(151);
						this.aClass3_Sub3_Sub4_6.method491(local24);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local9);
						this.aClass3_Sub3_Sub4_6.method459(local14);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 624) {
						local267 = this.method642(0, false, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 0, 0);
						if (!local267) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 1, 0);
						}
						this.anInt1038 = super.anInt842;
						this.anInt1039 = super.anInt843;
						this.anInt1041 = 2;
						this.anInt1040 = 0;
						this.aClass3_Sub3_Sub4_6.method457(209);
						this.aClass3_Sub3_Sub4_6.method459(local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method459(local9 + this.anInt1003);
						this.aClass3_Sub3_Sub4_6.method459(local24);
					}
					if (local19 == 878) {
						this.aClass3_Sub3_Sub4_6.method457(124);
						this.aClass3_Sub3_Sub4_6.method459(local14);
						local534 = Class23.method208(local14);
						if (local534.anIntArrayArray12 != null && local534.anIntArrayArray12[0][0] == 5) {
							local93 = local534.anIntArrayArray12[0][1];
							this.anIntArray272[local93] = 1 - this.anIntArray272[local93];
							this.method714(local93);
							this.aBoolean216 = true;
						}
					}
					if (local19 == 746) {
						local267 = this.method642(0, false, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 0, 0);
						if (!local267) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 1, 0);
						}
						this.anInt1038 = super.anInt842;
						this.anInt1039 = super.anInt843;
						this.anInt1041 = 2;
						this.anInt1040 = 0;
						this.aClass3_Sub3_Sub4_6.method457(150);
						this.aClass3_Sub3_Sub4_6.method492(local24);
						this.aClass3_Sub3_Sub4_6.method491(local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method459(local9 + this.anInt1003);
					}
					if (local19 == 771) {
						local799 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local24];
						if (local799 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local799.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local799.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(8);
							this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24);
							this.aClass3_Sub3_Sub4_6.method492(this.anInt958);
						}
					}
					if (local19 == 60) {
						local859 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
						if (local859 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local859.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local859.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(3);
							this.aClass3_Sub3_Sub4_6.method459(this.anInt912);
							this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24);
							this.aClass3_Sub3_Sub4_6.method491(this.anInt913);
							this.aClass3_Sub3_Sub4_6.method492(this.anInt911);
						}
					}
					if (local19 == 917) {
						this.aClass3_Sub3_Sub4_6.method457(124);
						this.aClass3_Sub3_Sub4_6.method459(local14);
						local534 = Class23.method208(local14);
						if (local534.anIntArrayArray12 != null && local534.anIntArrayArray12[0][0] == 5) {
							local93 = local534.anIntArrayArray12[0][1];
							if (this.anIntArray272[local93] != local534.anIntArray101[0]) {
								this.anIntArray272[local93] = local534.anIntArray101[0];
								this.method714(local93);
								this.aBoolean216 = true;
							}
						}
					}
					if (local19 == 504 || local19 == 56) {
						local89 = this.aStringArray9[arg0];
						local93 = local89.indexOf("@whi@");
						if (local93 != -1) {
							local89 = local89.substring(local93 + 5).trim();
							local681 = Class48.method539(Class48.method536(this.aBoolean224, Class48.method535(local89)));
							@Pc(1677) boolean local1677 = false;
							for (local106 = 0; local106 < this.anInt969; local106++) {
								@Pc(1689) Class3_Sub3_Sub2_Sub1_Sub2 local1689 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anIntArray244[local106]];
								if (local1689 != null && local1689.aString14 != null && local1689.aString14.equalsIgnoreCase(local681)) {
									this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local1689.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local1689.anIntArray178[0], 1, 0);
									if (local19 == 504) {
										this.aClass3_Sub3_Sub4_6.method457(224);
										this.aClass3_Sub3_Sub4_6.method459(this.anIntArray244[local106]);
									}
									if (local19 == 56) {
										this.aClass3_Sub3_Sub4_6.method457(21);
										this.aClass3_Sub3_Sub4_6.method459(this.anIntArray244[local106]);
									}
									local1677 = true;
									break;
								}
							}
							if (!local1677) {
								this.method716((byte) 2, 0, "Unable to find " + local681, "");
							}
						}
					}
					if (local19 == 87) {
						if ((this.anInt1004 & 0x3) == 0) {
							anInt896++;
						}
						if (anInt896 >= 112) {
							this.aClass3_Sub3_Sub4_6.method457(90);
							anInt896 = 0;
						}
						this.method647(local24, local9, local14);
						this.aClass3_Sub3_Sub4_6.method457(43);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24 >> 14 & 0x7FFF);
						this.aClass3_Sub3_Sub4_6.method491(local9 + this.anInt1003);
						this.aClass3_Sub3_Sub4_6.method491(local14 + this.anInt1004);
					}
					if (local19 == 5) {
						this.aClass3_Sub3_Sub4_6.method457(33);
						this.aClass3_Sub3_Sub4_6.method459(local14);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local9);
						this.aClass3_Sub3_Sub4_6.method459(local24);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 674) {
						local89 = this.aStringArray9[arg0];
						local93 = local89.indexOf("@whi@");
						if (local93 != -1) {
							if (this.anInt1061 == -1) {
								this.method609();
								this.aString30 = local89.substring(local93 + 5).trim();
								this.aBoolean235 = false;
								this.anInt938 = this.anInt1061 = Class23.anInt343;
							} else {
								this.method716((byte) 2, 0, "Please close the interface you have open before using 'report abuse'", "");
							}
						}
					}
					if (local19 == 198) {
						this.method647(local24, local9, local14);
						this.aClass3_Sub3_Sub4_6.method457(131);
						this.aClass3_Sub3_Sub4_6.method491(local24 >> 14 & 0x7FFF);
						this.aClass3_Sub3_Sub4_6.method491(local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method491(local9 + this.anInt1003);
					}
					if (local19 == 639) {
						local267 = this.method642(0, false, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 0, 0);
						if (!local267) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 1, 0);
						}
						this.anInt1038 = super.anInt842;
						this.anInt1039 = super.anInt843;
						this.anInt1041 = 2;
						this.anInt1040 = 0;
						this.aClass3_Sub3_Sub4_6.method457(45);
						this.aClass3_Sub3_Sub4_6.method459(local9 + this.anInt1003);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method491(local24);
					}
					if (local19 == 650) {
						local799 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local24];
						if (local799 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local799.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local799.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(148);
							this.aClass3_Sub3_Sub4_6.method492(local24);
						}
					}
					if (local19 == 1764) {
						@Pc(2135) int local2135 = local24 >> 14 & 0x7FFF;
						@Pc(2138) Class13 local2138 = Class13.method127(local2135);
						if (local2138.aByteArray3 == null) {
							local681 = "It's a " + local2138.aString3 + ".";
						} else {
							local681 = new String(local2138.aByteArray3);
						}
						this.method716((byte) 2, 0, local681, "");
					}
					if (local19 == 69) {
						local859 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
						if (local859 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local859.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local859.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							anInt997++;
							if (anInt997 >= 51) {
								this.aClass3_Sub3_Sub4_6.method457(229);
								this.aClass3_Sub3_Sub4_6.method462(0);
								anInt997 = 0;
							}
							this.aClass3_Sub3_Sub4_6.method457(147);
							this.aClass3_Sub3_Sub4_6.method491(local24);
						}
					}
					if (local19 == 33) {
						local799 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local24];
						if (local799 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local799.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local799.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(21);
							this.aClass3_Sub3_Sub4_6.method459(local24);
						}
					}
					if (local19 == 544 && this.method647(local24, local9, local14)) {
						this.aClass3_Sub3_Sub4_6.method457(74);
						this.aClass3_Sub3_Sub4_6.method491(local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt913);
						this.aClass3_Sub3_Sub4_6.method491(this.anInt912);
						this.aClass3_Sub3_Sub4_6.method491(this.anInt911);
						this.aClass3_Sub3_Sub4_6.method459(local9 + this.anInt1003);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24 >> 14 & 0x7FFF);
					}
					if (local19 == 293 && !this.aBoolean232) {
						this.aClass3_Sub3_Sub4_6.method457(241);
						this.aClass3_Sub3_Sub4_6.method459(local14);
						this.aBoolean232 = true;
					}
					if (local19 == 555) {
						local267 = this.method642(0, false, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 0, 0);
						if (!local267) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 1, 0);
						}
						this.anInt1038 = super.anInt842;
						this.anInt1039 = super.anInt843;
						this.anInt1041 = 2;
						this.anInt1040 = 0;
						this.aClass3_Sub3_Sub4_6.method457(69);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24);
						this.aClass3_Sub3_Sub4_6.method459(local9 + this.anInt1003);
						this.aClass3_Sub3_Sub4_6.method459(this.anInt912);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt911);
						this.aClass3_Sub3_Sub4_6.method492(this.anInt913);
						this.aClass3_Sub3_Sub4_6.method492(local14 + this.anInt1004);
					}
					if (local19 == 689 && this.method647(local24, local9, local14)) {
						this.aClass3_Sub3_Sub4_6.method457(193);
						this.aClass3_Sub3_Sub4_6.method491(local24 >> 14 & 0x7FFF);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method492(this.anInt958);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local9 + this.anInt1003);
					}
					if (local19 == 57) {
						local267 = this.method642(0, false, 0, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 0, 0);
						if (!local267) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local9, 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local14, 1, 0);
						}
						this.anInt1038 = super.anInt842;
						this.anInt1039 = super.anInt843;
						this.anInt1041 = 2;
						this.anInt1040 = 0;
						this.aClass3_Sub3_Sub4_6.method457(109);
						this.aClass3_Sub3_Sub4_6.method491(local24);
						this.aClass3_Sub3_Sub4_6.method459(local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method459(local9 + this.anInt1003);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt958);
					}
					if (local19 == 805) {
						local799 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local24];
						if (local799 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local799.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local799.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(75);
							this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24);
						}
					}
					if (local19 == 121) {
						if ((local24 & 0x3) == 0) {
							anInt908++;
						}
						if (anInt908 >= 98) {
							this.aClass3_Sub3_Sub4_6.method457(127);
							this.aClass3_Sub3_Sub4_6.method462(0);
							anInt908 = 0;
						}
						this.aClass3_Sub3_Sub4_6.method457(144);
						this.aClass3_Sub3_Sub4_6.method491(local14);
						this.aClass3_Sub3_Sub4_6.method459(local24);
						this.aClass3_Sub3_Sub4_6.method459(local9);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 154) {
						local859 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
						if (local859 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local859.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local859.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(52);
							this.aClass3_Sub3_Sub4_6.method492(this.anInt958);
							this.aClass3_Sub3_Sub4_6.method491(local24);
						}
					}
					if (local19 == 641) {
						local859 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
						if (local859 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local859.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local859.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(158);
							this.aClass3_Sub3_Sub4_6.method491(local24);
						}
					}
					if (local19 == 225) {
						local799 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local24];
						if (local799 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local799.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local799.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(30);
							this.aClass3_Sub3_Sub4_6.method492(this.anInt913);
							this.aClass3_Sub3_Sub4_6.method493(this.aByte43, this.anInt911);
							this.aClass3_Sub3_Sub4_6.method491(local24);
							this.aClass3_Sub3_Sub4_6.method491(this.anInt912);
						}
					}
					if (local19 == 1261) {
						local859 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
						if (local859 != null) {
							@Pc(2983) Class30 local2983 = local859.aClass30_1;
							if (local2983.anIntArray151 != null) {
								local2983 = local2983.method321();
							}
							if (local2983 != null) {
								if (local2983.aByteArray18 == null) {
									local681 = "It's a " + local2983.aString10 + ".";
								} else {
									local681 = new String(local2983.aByteArray18);
								}
								this.method716((byte) 2, 0, local681, "");
							}
						}
					}
					if (local19 == 570) {
						this.method647(local24, local9, local14);
						this.aClass3_Sub3_Sub4_6.method457(36);
						this.aClass3_Sub3_Sub4_6.method459(local9 + this.anInt1003);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method492(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 463) {
						this.aClass3_Sub3_Sub4_6.method457(46);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local9);
						this.aClass3_Sub3_Sub4_6.method491(local24);
						this.aClass3_Sub3_Sub4_6.method491(local14);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 157) {
						local859 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
						if (local859 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local859.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local859.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							this.aClass3_Sub3_Sub4_6.method457(103);
							this.aClass3_Sub3_Sub4_6.method459(local24);
						}
					}
					if (local19 == 334) {
						if ((local24 & 0x3) == 0) {
							anInt1048++;
						}
						if (anInt1048 >= 61) {
							this.aClass3_Sub3_Sub4_6.method457(145);
							this.aClass3_Sub3_Sub4_6.method459(581);
							anInt1048 = 0;
						}
						this.method647(local24, local9, local14);
						this.aClass3_Sub3_Sub4_6.method457(139);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local14 + this.anInt1004);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24 >> 14 & 0x7FFF);
						this.aClass3_Sub3_Sub4_6.method492(local9 + this.anInt1003);
					}
					if (local19 == 328) {
						local799 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local24];
						if (local799 != null) {
							this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local799.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local799.anIntArray178[0], 1, 0);
							this.anInt1038 = super.anInt842;
							this.anInt1039 = super.anInt843;
							this.anInt1041 = 2;
							this.anInt1040 = 0;
							if ((local24 & 0x3) == 0) {
								anInt1030++;
							}
							if (anInt1030 >= 123) {
								this.aClass3_Sub3_Sub4_6.method457(206);
								anInt1030 = 0;
							}
							this.aClass3_Sub3_Sub4_6.method457(87);
							this.aClass3_Sub3_Sub4_6.method459(local24);
						}
					}
					if (local19 == 1805) {
						local173 = Class1.method7(local24);
						if (local173.aByteArray1 == null) {
							local199 = "It's a " + local173.aString1 + ".";
						} else {
							local199 = new String(local173.aByteArray1);
						}
						this.method716((byte) 2, 0, local199, "");
					}
					if (local19 == 620) {
						this.aClass3_Sub3_Sub4_6.method457(40);
						this.aClass3_Sub3_Sub4_6.method493(this.aByte43, local24);
						this.aClass3_Sub3_Sub4_6.method459(local9);
						this.aClass3_Sub3_Sub4_6.method491(local14);
						this.anInt962 = 0;
						this.anInt963 = local14;
						this.anInt964 = local9;
						this.anInt965 = 2;
						if (Class23.method208(local14).anInt351 == this.anInt1061) {
							this.anInt965 = 1;
						}
						if (Class23.method208(local14).anInt351 == this.anInt903) {
							this.anInt965 = 3;
						}
					}
					if (local19 == 888) {
						this.anInt910 = 1;
						this.anInt911 = local9;
						this.anInt912 = local14;
						this.anInt913 = local24;
						this.aString20 = String.valueOf(Class1.method7(local24).aString1);
						this.anInt957 = 0;
						this.aBoolean216 = true;
					} else {
						if (local19 == 238) {
							if (this.aBoolean223) {
								this.aClass31_1.method375(local14 - 4, local9 - 4);
							} else {
								this.aClass31_1.method375(super.anInt843 - 4, super.anInt842 - 4);
							}
						}
						if (local19 == 810) {
							local859 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local24];
							if (local859 != null) {
								this.method642(0, false, 1, 0, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray178[0], local859.anIntArray177[0], 2, aClass3_Sub3_Sub2_Sub1_Sub2_1.anIntArray177[0], local859.anIntArray178[0], 1, 0);
								this.anInt1038 = super.anInt842;
								this.anInt1039 = super.anInt843;
								this.anInt1041 = 2;
								this.anInt1040 = 0;
								this.aClass3_Sub3_Sub4_6.method457(157);
								this.aClass3_Sub3_Sub4_6.method459(local24);
							}
						}
						this.anInt910 = 0;
						this.anInt957 = 0;
						this.aBoolean241 &= true;
						this.aBoolean216 = true;
					}
				}
			}
		} catch (@Pc(3538) RuntimeException local3538) {
			signlink.reporterror("85024, " + true + ", " + arg0 + ", " + local3538.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
	private void method719() {
		try {
			if (super.aClass17_2 == null) {
				this.method703();
				this.aClass17_19 = null;
				this.aClass17_20 = null;
				this.aClass17_21 = null;
				this.aClass17_22 = null;
				this.aClass17_23 = null;
				this.aClass17_24 = null;
				this.aClass17_25 = null;
				this.aClass17_26 = null;
				this.aClass17_27 = null;
				this.aClass17_18 = null;
				this.aClass17_16 = null;
				this.aClass17_15 = null;
				this.aClass17_17 = null;
				this.aClass17_3 = null;
				this.aClass17_4 = null;
				this.aClass17_5 = null;
				super.aClass17_2 = new Class17((byte) 9, this.method585(), 765, 503);
				this.aBoolean244 = true;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("14301, " + -483 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method720(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean218 = true;
			if (arg0 != this.aByte32) {
				this.method580();
			}
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				this.anIntArray224[local12] = -1;
				for (@Pc(21) int local21 = 0; local21 < Class11.anInt215; local21++) {
					if (!Class11.aClass11Array1[local21].aBoolean47 && Class11.aClass11Array1[local21].anInt216 == local12 + (this.aBoolean240 ? 0 : 7)) {
						this.anIntArray224[local12] = local21;
						break;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("44779, " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method721(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method722(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt1035 = 0;
			if (arg0) {
				this.anInt1058 = 342;
			}
			@Pc(75) int local75;
			for (@Pc(11) int local11 = -1; local11 < this.anInt969 + this.anInt930; local11++) {
				@Pc(18) Class3_Sub3_Sub2_Sub1 local18;
				if (local11 == -1) {
					local18 = aClass3_Sub3_Sub2_Sub1_Sub2_1;
				} else if (local11 < this.anInt969) {
					local18 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anIntArray244[local11]];
				} else {
					local18 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[this.anIntArray239[local11 - this.anInt969]];
				}
				if (local18 != null && local18.method400()) {
					@Pc(59) Class30 local59;
					if (local18 instanceof Class3_Sub3_Sub2_Sub1_Sub1) {
						local59 = ((Class3_Sub3_Sub2_Sub1_Sub1) local18).aClass30_1;
						if (local59.anIntArray151 != null) {
							local59 = local59.method321();
						}
						if (local59 == null) {
							continue;
						}
					}
					if (local11 >= this.anInt969) {
						local59 = ((Class3_Sub3_Sub2_Sub1_Sub1) local18).aClass30_1;
						if (local59.anInt509 >= 0 && local59.anInt509 < this.aClass3_Sub3_Sub3_Sub1Array8.length) {
							this.method690(local18, this.aByte36, local18.anInt684 + 15);
							if (this.anInt1052 > -1) {
								this.aClass3_Sub3_Sub3_Sub1Array8[local59.anInt509].method258(this.anInt1052 - 12, this.anInt1053 - 30);
							}
						}
						if (this.anInt960 == 1 && this.anInt961 == this.anIntArray239[local11 - this.anInt969] && anInt1032 % 20 < 10) {
							this.method690(local18, this.aByte36, local18.anInt684 + 15);
							if (this.anInt1052 > -1) {
								this.aClass3_Sub3_Sub3_Sub1Array7[0].method258(this.anInt1052 - 12, this.anInt1053 - 28);
							}
						}
					} else {
						local75 = 30;
						@Pc(78) Class3_Sub3_Sub2_Sub1_Sub2 local78 = (Class3_Sub3_Sub2_Sub1_Sub2) local18;
						if (local78.anInt702 != -1 || local78.anInt708 != -1) {
							this.method690(local18, this.aByte36, local18.anInt684 + 15);
							if (this.anInt1052 > -1) {
								if (local78.anInt702 != -1) {
									this.aClass3_Sub3_Sub3_Sub1Array9[local78.anInt702].method258(this.anInt1052 - 12, this.anInt1053 - 30);
									local75 += 25;
								}
								if (local78.anInt708 != -1) {
									this.aClass3_Sub3_Sub3_Sub1Array8[local78.anInt708].method258(this.anInt1052 - 12, this.anInt1053 - local75);
									local75 += 25;
								}
							}
						}
						if (local11 >= 0 && this.anInt960 == 10 && this.anInt919 == this.anIntArray244[local11]) {
							this.method690(local18, this.aByte36, local18.anInt684 + 15);
							if (this.anInt1052 > -1) {
								this.aClass3_Sub3_Sub3_Sub1Array7[1].method258(this.anInt1052 - 12, this.anInt1053 - local75);
							}
						}
					}
					if (local18.aString13 != null && (local11 >= this.anInt969 || this.anInt937 == 0 || this.anInt937 == 3 || this.anInt937 == 1 && this.method604(((Class3_Sub3_Sub2_Sub1_Sub2) local18).aString14))) {
						this.method690(local18, this.aByte36, local18.anInt684);
						if (this.anInt1052 > -1 && this.anInt1035 < this.anInt1036) {
							this.anIntArray257[this.anInt1035] = this.aClass3_Sub3_Sub3_Sub4_4.method563(local18.aString13) / 2;
							this.anIntArray256[this.anInt1035] = this.aClass3_Sub3_Sub3_Sub4_4.anInt825;
							this.anIntArray254[this.anInt1035] = this.anInt1052;
							this.anIntArray255[this.anInt1035] = this.anInt1053;
							this.anIntArray258[this.anInt1035] = local18.anInt673;
							this.anIntArray259[this.anInt1035] = local18.anInt671;
							this.anIntArray260[this.anInt1035] = local18.anInt670;
							this.aStringArray12[this.anInt1035++] = local18.aString13;
							if (this.anInt909 == 0 && local18.anInt671 >= 1 && local18.anInt671 <= 3) {
								this.anIntArray256[this.anInt1035] += 10;
								this.anIntArray255[this.anInt1035] += 5;
							}
							if (this.anInt909 == 0 && local18.anInt671 == 4) {
								this.anIntArray257[this.anInt1035] = 60;
							}
							if (this.anInt909 == 0 && local18.anInt671 == 5) {
								this.anIntArray256[this.anInt1035] += 5;
							}
						}
					}
					if (local18.anInt674 > anInt1032) {
						this.method690(local18, this.aByte36, local18.anInt684 + 15);
						if (this.anInt1052 > -1) {
							local75 = local18.anInt675 * 30 / local18.anInt676;
							if (local75 > 30) {
								local75 = 30;
							}
							Class3_Sub3_Sub3.method552(65280, this.aByte40, this.anInt1052 - 15, this.anInt1053 - 3, 5, local75);
							Class3_Sub3_Sub3.method552(16711680, this.aByte40, this.anInt1052 + local75 - 15, this.anInt1053 - 3, 5, 30 - local75);
						}
					}
					for (local75 = 0; local75 < 4; local75++) {
						if (local18.anIntArray181[local75] > anInt1032) {
							this.method690(local18, this.aByte36, local18.anInt684 / 2);
							if (this.anInt1052 > -1) {
								if (local75 == 1) {
									this.anInt1053 -= 20;
								}
								if (local75 == 2) {
									this.anInt1052 -= 15;
									this.anInt1053 -= 10;
								}
								if (local75 == 3) {
									this.anInt1052 += 15;
									this.anInt1053 -= 10;
								}
								this.aClass3_Sub3_Sub3_Sub1Array10[local18.anIntArray180[local75]].method258(this.anInt1052 - 12, this.anInt1053 - 12);
								this.aClass3_Sub3_Sub3_Sub4_2.method560(this.anInt1053 + 4, 0, this.anInt1052, String.valueOf(local18.anIntArray179[local75]));
								this.aClass3_Sub3_Sub3_Sub4_2.method560(this.anInt1053 + 3, 16777215, this.anInt1052 - 1, String.valueOf(local18.anIntArray179[local75]));
							}
						}
					}
				}
			}
			for (@Pc(624) int local624 = 0; local624 < this.anInt1035; local624++) {
				local75 = this.anIntArray254[local624];
				@Pc(636) int local636 = this.anIntArray255[local624];
				@Pc(641) int local641 = this.anIntArray257[local624];
				@Pc(646) int local646 = this.anIntArray256[local624];
				@Pc(648) boolean local648 = true;
				while (local648) {
					local648 = false;
					for (@Pc(654) int local654 = 0; local654 < local624; local654++) {
						if (local636 + 2 > this.anIntArray255[local654] - this.anIntArray256[local654] && local636 - local646 < this.anIntArray255[local654] + 2 && local75 - local641 < this.anIntArray254[local654] + this.anIntArray257[local654] && local75 + local641 > this.anIntArray254[local654] - this.anIntArray257[local654] && this.anIntArray255[local654] - this.anIntArray256[local654] < local636) {
							local636 = this.anIntArray255[local654] - this.anIntArray256[local654];
							local648 = true;
						}
					}
				}
				this.anInt1052 = this.anIntArray254[local624];
				this.anInt1053 = this.anIntArray255[local624] = local636;
				@Pc(753) String local753 = this.aStringArray12[local624];
				if (this.anInt909 == 0) {
					@Pc(758) int local758 = 16776960;
					if (this.anIntArray258[local624] < 6) {
						local758 = this.anIntArray253[this.anIntArray258[local624]];
					}
					if (this.anIntArray258[local624] == 6) {
						local758 = this.anInt936 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray258[local624] == 7) {
						local758 = this.anInt936 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray258[local624] == 8) {
						local758 = this.anInt936 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(833) int local833;
					if (this.anIntArray258[local624] == 9) {
						local833 = 150 - this.anIntArray260[local624];
						if (local833 < 50) {
							local758 = local833 * 1280 + 16711680;
						} else if (local833 < 100) {
							local758 = 16776960 - (local833 - 50) * 327680;
						} else if (local833 < 150) {
							local758 = (local833 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray258[local624] == 10) {
						local833 = 150 - this.anIntArray260[local624];
						if (local833 < 50) {
							local758 = local833 * 5 + 16711680;
						} else if (local833 < 100) {
							local758 = 16711935 - (local833 - 50) * 327680;
						} else if (local833 < 150) {
							local758 = (local833 - 100) * 327680 + 255 - (local833 - 100) * 5;
						}
					}
					if (this.anIntArray258[local624] == 11) {
						local833 = 150 - this.anIntArray260[local624];
						if (local833 < 50) {
							local758 = 16777215 - local833 * 327685;
						} else if (local833 < 100) {
							local758 = (local833 - 50) * 327685 + 65280;
						} else if (local833 < 150) {
							local758 = 16777215 - (local833 - 100) * 327680;
						}
					}
					if (this.anIntArray259[local624] == 0) {
						this.aClass3_Sub3_Sub3_Sub4_4.method560(this.anInt1053 + 1, 0, this.anInt1052, local753);
						this.aClass3_Sub3_Sub3_Sub4_4.method560(this.anInt1053, local758, this.anInt1052, local753);
					}
					if (this.anIntArray259[local624] == 1) {
						this.aClass3_Sub3_Sub3_Sub4_4.method565(local753, this.anInt1053 + 1, this.anInt936, this.anInt1052, 0);
						this.aClass3_Sub3_Sub3_Sub4_4.method565(local753, this.anInt1053, this.anInt936, this.anInt1052, local758);
					}
					if (this.anIntArray259[local624] == 2) {
						this.aClass3_Sub3_Sub3_Sub4_4.method566(0, this.anInt1052, this.anInt1053 + 1, this.anInt936, local753);
						this.aClass3_Sub3_Sub3_Sub4_4.method566(local758, this.anInt1052, this.anInt1053, this.anInt936, local753);
					}
					if (this.anIntArray259[local624] == 3) {
						this.aClass3_Sub3_Sub3_Sub4_4.method567(0, this.anInt1053 + 1, this.anInt936, this.anInt1052, 150 - this.anIntArray260[local624], local753);
						this.aClass3_Sub3_Sub3_Sub4_4.method567(local758, this.anInt1053, this.anInt936, this.anInt1052, 150 - this.anIntArray260[local624], local753);
					}
					@Pc(1130) int local1130;
					if (this.anIntArray259[local624] == 4) {
						local833 = this.aClass3_Sub3_Sub3_Sub4_4.method563(local753);
						local1130 = (150 - this.anIntArray260[local624]) * (local833 + 100) / 150;
						Class3_Sub3_Sub3.method549(0, 334, this.anInt1052 + 50, this.anInt1052 - 50);
						this.aClass3_Sub3_Sub3_Sub4_4.method564(0, this.anInt1053 + 1, local753, this.anInt1052 + 50 - local1130);
						this.aClass3_Sub3_Sub3_Sub4_4.method564(local758, this.anInt1053, local753, this.anInt1052 + 50 - local1130);
						Class3_Sub3_Sub3.method548();
					}
					if (this.anIntArray259[local624] == 5) {
						local833 = 150 - this.anIntArray260[local624];
						local1130 = 0;
						if (local833 < 25) {
							local1130 = local833 - 25;
						} else if (local833 > 125) {
							local1130 = local833 - 125;
						}
						Class3_Sub3_Sub3.method549(this.anInt1053 - this.aClass3_Sub3_Sub3_Sub4_4.anInt825 - 1, this.anInt1053 + 5, 512, 0);
						this.aClass3_Sub3_Sub3_Sub4_4.method560(this.anInt1053 + local1130 + 1, 0, this.anInt1052, local753);
						this.aClass3_Sub3_Sub3_Sub4_4.method560(this.anInt1053 + local1130, local758, this.anInt1052, local753);
						Class3_Sub3_Sub3.method548();
					}
				} else {
					this.aClass3_Sub3_Sub3_Sub4_4.method560(this.anInt1053 + 1, 0, this.anInt1052, local753);
					this.aClass3_Sub3_Sub3_Sub4_4.method560(this.anInt1053, 16776960, this.anInt1052, local753);
				}
			}
		} catch (@Pc(1280) RuntimeException local1280) {
			signlink.reporterror("23190, " + arg0 + ", " + local1280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!WBEWPIXO;)V")
	private void method723(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1) {
		try {
			arg1.method478(616);
			@Pc(9) int local9 = arg1.method479(8);
			if (this.anInt979 != 3) {
				this.anInt1042 = this.aClass41_2.method511();
			}
			@Pc(24) int local24;
			if (local9 < this.anInt930) {
				for (local24 = local9; local24 < this.anInt930; local24++) {
					this.anIntArray247[this.anInt987++] = this.anIntArray239[local24];
				}
			}
			if (local9 > this.anInt930) {
				signlink.reporterror(this.aString28 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt930 = 0;
			for (local24 = 0; local24 < local9; local24++) {
				@Pc(76) int local76 = this.anIntArray239[local24];
				@Pc(81) Class3_Sub3_Sub2_Sub1_Sub1 local81 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local76];
				@Pc(86) int local86 = arg1.method479(1);
				if (local86 == 0) {
					this.anIntArray239[this.anInt930++] = local76;
					local81.anInt662 = anInt1032;
				} else {
					@Pc(109) int local109 = arg1.method479(2);
					if (local109 == 0) {
						this.anIntArray239[this.anInt930++] = local76;
						local81.anInt662 = anInt1032;
						this.anIntArray245[this.anInt970++] = local76;
					} else {
						@Pc(160) int local160;
						@Pc(170) int local170;
						if (local109 == 1) {
							this.anIntArray239[this.anInt930++] = local76;
							local81.anInt662 = anInt1032;
							local160 = arg1.method479(3);
							local81.method403(false, local160);
							local170 = arg1.method479(1);
							if (local170 == 1) {
								this.anIntArray245[this.anInt970++] = local76;
							}
						} else if (local109 == 2) {
							this.anIntArray239[this.anInt930++] = local76;
							local81.anInt662 = anInt1032;
							local160 = arg1.method479(3);
							local81.method403(true, local160);
							local170 = arg1.method479(3);
							local81.method403(true, local170);
							@Pc(228) int local228 = arg1.method479(1);
							if (local228 == 1) {
								this.anIntArray245[this.anInt970++] = local76;
							}
						} else if (local109 == 3) {
							this.anIntArray247[this.anInt987++] = local76;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("79643, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BILclient!WBEWPIXO;)V")
	private void method724(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt970; local3++) {
				@Pc(10) int local10 = this.anIntArray245[local3];
				@Pc(15) Class3_Sub3_Sub2_Sub1_Sub1 local15 = this.aClass3_Sub3_Sub2_Sub1_Sub1Array1[local10];
				@Pc(18) int local18 = arg1.method468();
				if ((local18 & 0x1) != 0) {
					local15.anInt651 = arg1.method494();
					local15.anInt652 = arg1.method496();
				}
				@Pc(40) int local40;
				@Pc(49) int local49;
				if ((local18 & 0x10) != 0) {
					local40 = arg1.method496();
					if (local40 == 65535) {
						local40 = -1;
					}
					local49 = arg1.method486();
					if (local40 == local15.anInt678 && local40 != -1) {
						@Pc(61) int local61 = Class46.aClass46Array1[local40].anInt788;
						if (local61 == 1) {
							local15.anInt679 = 0;
							local15.anInt680 = 0;
							local15.anInt681 = local49;
							local15.anInt682 = 0;
						}
						if (local61 == 2) {
							local15.anInt682 = 0;
						}
					} else if (local40 == -1 || local15.anInt678 == -1 || Class46.aClass46Array1[local40].anInt782 >= Class46.aClass46Array1[local15.anInt678].anInt782) {
						local15.anInt678 = local40;
						local15.anInt679 = 0;
						local15.anInt680 = 0;
						local15.anInt681 = local49;
						local15.anInt682 = 0;
						local15.anInt672 = local15.anInt668;
					}
				}
				if ((local18 & 0x2) != 0) {
					local40 = arg1.method486();
					local49 = arg1.method486();
					local15.method404(local40, local49, anInt1032);
					local15.anInt674 = anInt1032 + 300;
					local15.anInt675 = arg1.method486();
					local15.anInt676 = arg1.method487();
				}
				if ((local18 & 0x20) != 0) {
					local40 = arg1.method486();
					local49 = arg1.method468();
					local15.method404(local40, local49, anInt1032);
					local15.anInt674 = anInt1032 + 300;
					local15.anInt675 = arg1.method487();
					local15.anInt676 = arg1.method485();
				}
				if ((local18 & 0x80) != 0) {
					local15.aClass30_1 = Class30.method322(arg1.method494());
					local15.anInt654 = local15.aClass30_1.aByte21;
					local15.anInt677 = local15.aClass30_1.anInt507;
					local15.anInt647 = local15.aClass30_1.anInt511;
					local15.anInt648 = local15.aClass30_1.anInt496;
					local15.anInt649 = local15.aClass30_1.anInt501;
					local15.anInt650 = local15.aClass30_1.anInt503;
					local15.anInt689 = local15.aClass30_1.anInt510;
				}
				if ((local18 & 0x40) != 0) {
					local15.anInt663 = arg1.method470();
					local40 = arg1.method502();
					local15.anInt667 = local40 >> 16;
					local15.anInt666 = anInt1032 + (local40 & 0xFFFF);
					local15.anInt664 = 0;
					local15.anInt665 = 0;
					if (local15.anInt666 > anInt1032) {
						local15.anInt664 = -1;
					}
					if (local15.anInt663 == 65535) {
						local15.anInt663 = -1;
					}
				}
				if ((local18 & 0x4) != 0) {
					local15.aString13 = arg1.method475();
					local15.anInt670 = 100;
				}
				if ((local18 & 0x8) != 0) {
					local15.anInt691 = arg1.method470();
					if (local15.anInt691 == 65535) {
						local15.anInt691 = -1;
					}
				}
			}
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("51719, " + -25 + ", " + arg0 + ", " + arg1 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!WBEWPIXO;)V")
	private void method725(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1) {
		try {
			this.anInt987 = 0;
			this.anInt970 = 0;
			this.method601(this.anInt1060, arg1, arg0);
			this.method696(arg1, arg0);
			this.method592(arg1, 329, arg0);
			this.method726(arg0, arg1);
			@Pc(44) int local44;
			for (@Pc(37) int local37 = 0; local37 < this.anInt987; local37++) {
				local44 = this.anIntArray247[local37];
				if (this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local44].anInt662 != anInt1032) {
					this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local44] = null;
				}
			}
			if (arg1.anInt738 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt738 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local44 = 0; local44 < this.anInt969; local44++) {
				if (this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[this.anIntArray244[local44]] == null) {
					signlink.reporterror(this.aString28 + " null entry in pl list - pos:" + local44 + " size:" + this.anInt969);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("80504, " + arg0 + ", " + -683 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBLclient!WBEWPIXO;)V")
	private void method726(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt970; local1++) {
				@Pc(8) int local8 = this.anIntArray245[local1];
				@Pc(13) Class3_Sub3_Sub2_Sub1_Sub2 local13 = this.aClass3_Sub3_Sub2_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method468();
				if ((local16 & 0x20) != 0) {
					local16 += arg1.method468() << 8;
				}
				this.method602(local13, local16, local8, arg1);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("14433, " + arg0 + ", " + -16 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method582(@OriginalArg(0) int arg0) {
		try {
			this.aClass3_Sub3_Sub3_Sub1_11 = null;
			this.aClass3_Sub3_Sub3_Sub1Array10 = null;
			this.aClass3_Sub3_Sub3_Sub1Array9 = null;
			this.aClass3_Sub3_Sub3_Sub1Array8 = null;
			this.aClass3_Sub3_Sub3_Sub1Array7 = null;
			this.aClass3_Sub3_Sub3_Sub1Array4 = null;
			if (this.aClass6_Sub1_1 != null) {
				this.aClass6_Sub1_1.method168();
			}
			this.aClass6_Sub1_1 = null;
			this.aClass26_12 = null;
			this.aClass26_11 = null;
			this.aClass3_Sub3_Sub3_Sub1_12 = null;
			this.aClass3_Sub3_Sub3_Sub1_13 = null;
			this.aClass3_Sub3_Sub3_Sub1_14 = null;
			this.aClass3_Sub3_Sub3_Sub1_15 = null;
			this.aClass3_Sub3_Sub3_Sub1_16 = null;
			this.aClass3_Sub3_Sub3_Sub2_3 = null;
			this.aClass3_Sub3_Sub3_Sub2_4 = null;
			this.aClass3_Sub3_Sub3_Sub2_5 = null;
			this.aClass3_Sub3_Sub3_Sub2_6 = null;
			this.aClass3_Sub3_Sub3_Sub2_7 = null;
			if (this.aClass33_1 != null) {
				this.aClass33_1.aBoolean146 = false;
			}
			this.aClass33_1 = null;
			try {
				if (this.aClass21_1 != null) {
					this.aClass21_1.method186();
				}
			} catch (@Pc(82) Exception local82) {
			}
			this.aClass21_1 = null;
			this.aClass3_Sub3_Sub3_Sub2_11 = null;
			this.aClass3_Sub3_Sub3_Sub2_12 = null;
			this.aClass3_Sub3_Sub3_Sub2_13 = null;
			this.aClass3_Sub3_Sub3_Sub2_14 = null;
			this.aClass3_Sub3_Sub3_Sub2_15 = null;
			this.anIntArrayArray22 = null;
			this.aClass3_Sub3_Sub3_Sub2Array4 = null;
			this.aClass3_Sub3_Sub3_Sub1Array6 = null;
			this.aClass3_Sub3_Sub2_Sub1_Sub2Array1 = null;
			this.anIntArray244 = null;
			this.anIntArray245 = null;
			this.aClass3_Sub3_Sub4Array1 = null;
			this.anIntArray247 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass31_1 = null;
			this.aClass4Array1 = null;
			this.aClass26ArrayArrayArray1 = null;
			this.aClass26_10 = null;
			this.method654();
			this.aClass17_15 = null;
			this.aClass17_16 = null;
			this.aClass17_17 = null;
			this.aClass17_18 = null;
			this.aClass17_22 = null;
			this.aClass17_23 = null;
			this.aClass17_19 = null;
			this.aClass17_20 = null;
			this.aClass17_21 = null;
			this.aClass17_10 = null;
			this.aClass17_11 = null;
			this.aClass17_12 = null;
			this.aClass17_13 = null;
			this.aClass17_14 = null;
			this.aClass3_Sub3_Sub3_Sub1_5 = null;
			this.aStringArray10 = null;
			this.aLongArray3 = null;
			this.anIntArray215 = null;
			this.anIntArray236 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray237 = null;
			this.anIntArray238 = null;
			if (arg0 != 0) {
				this.aClass3_Sub3_Sub4_6.method458(210);
			}
			this.aClass17_24 = null;
			this.aClass17_25 = null;
			this.aClass17_26 = null;
			this.aClass17_27 = null;
			this.aClass3_Sub3_Sub3_Sub1_10 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray274 = null;
			this.anIntArray275 = null;
			this.aClass3_Sub3_Sub2_Sub1_Sub1Array1 = null;
			this.anIntArray239 = null;
			this.aClass3_Sub3_Sub4_6 = null;
			this.aClass3_Sub3_Sub4_8 = null;
			this.aClass3_Sub3_Sub4_9 = null;
			this.aClass3_Sub3_Sub3_Sub2Array3 = null;
			this.aClass3_Sub3_Sub3_Sub2_8 = null;
			this.aClass3_Sub3_Sub3_Sub2_9 = null;
			this.aClass3_Sub3_Sub3_Sub2_10 = null;
			this.aClass3_Sub3_Sub4_7 = null;
			this.aClass17_6 = null;
			this.aClass17_7 = null;
			this.aClass17_8 = null;
			this.aClass17_9 = null;
			this.aClass3_Sub3_Sub3_Sub2_16 = null;
			this.aClass3_Sub3_Sub3_Sub2_17 = null;
			this.aClass3_Sub3_Sub3_Sub2_18 = null;
			this.anIntArray272 = null;
			this.aClass17_3 = null;
			this.aClass17_4 = null;
			this.aClass17_5 = null;
			this.aByteArray21 = null;
			this.anIntArray219 = null;
			this.anIntArray220 = null;
			this.anIntArray221 = null;
			this.anIntArray222 = null;
			this.aStringArray9 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.aClass3_Sub3_Sub3_Sub1Array5 = null;
			this.method703();
			Class13.method118();
			Class30.method319();
			Class1.method5();
			Class23.method217();
			Class32.aClass32Array1 = null;
			Class11.aClass11Array1 = null;
			Class28.aClass28Array1 = null;
			Class46.aClass46Array1 = null;
			Class43.aClass43Array1 = null;
			Class43.aClass25_9 = null;
			Class44.aClass44Array1 = null;
			super.aClass17_2 = null;
			Class3_Sub3_Sub2_Sub1_Sub2.aClass25_8 = null;
			Class3_Sub3_Sub3_Sub3.method301();
			Class31.method336();
			Class3_Sub3_Sub2_Sub3.method76();
			Class12.method114();
			System.gc();
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("18839, " + arg0 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method584() {
		try {
			this.aBoolean244 = true;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("39723, " + 7066 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}
}
