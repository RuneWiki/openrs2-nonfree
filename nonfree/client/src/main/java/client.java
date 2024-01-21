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

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private static int anInt863;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private static int anInt866;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Z")
	private static boolean aBoolean234;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private static int anInt882;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private static int anInt903;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
	private static boolean aBoolean242;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private static int anInt912;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Lclient!IGCQCHAY;")
	public static Class6_Sub1_Sub2_Sub3_Sub1 aClass6_Sub1_Sub2_Sub3_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private static int anInt935;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	public static int anInt936;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	public static int anInt957;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Z")
	private static boolean aBoolean252;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private static int anInt1007;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private static int anInt1012;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private static int anInt1020;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private static int anInt1029;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private static int anInt1040;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private static boolean aBoolean267;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private static int anInt1049;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private static int anInt1067;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private static int anInt1072;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
	private static int anInt1088;

	@OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
	private static int anInt1095;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	public static int[] anIntArray225 = new int[32];

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[[I")
	public static final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private static int anInt956;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Z")
	private static boolean aBoolean251;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private static int anInt970;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[I")
	private static int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private static int anInt1037;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Ljava/lang/String;")
	private static String aString30;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private static int anInt1066;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "[I")
	public static final int[] anIntArray275;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_3;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_4;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_5;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_6;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!OUUKQIMK;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_6;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_7;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_8;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_7;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_8;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_9;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_10;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_11;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_12;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_13;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_14;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_15;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!ESUFCMYV;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!MGTPXZHY;")
	private Class6_Sub1_Sub1_Sub2 aClass6_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!MGTPXZHY;")
	private Class6_Sub1_Sub1_Sub2 aClass6_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!MGTPXZHY;")
	private Class6_Sub1_Sub1_Sub2 aClass6_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!MGTPXZHY;")
	private Class6_Sub1_Sub1_Sub2 aClass6_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!THBLNINF;")
	private Class41 aClass41_1;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!EKUSXTUB;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_13;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_16;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_17;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_18;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_19;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_20;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_21;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_22;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_23;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_24;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_25;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_26;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!HVBGFDBD;")
	private Class15 aClass15_27;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3[] aClass6_Sub1_Sub1_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_14;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_15;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_16;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4 aClass6_Sub1_Sub1_Sub4_17;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!NTGEPOMK;")
	private Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_16;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_17;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_18;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_19;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3 aClass6_Sub1_Sub1_Sub3_20;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1075;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1077;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1078;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1080;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Lclient!JLGPBSNA;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1082;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1083;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1084;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1085;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1086;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1087;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1089;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1090;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
	private int anInt1092;

	@OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
	private int anInt1093;

	@OriginalMember(owner = "client!client", name = "ok", descriptor = "I")
	private int anInt1094;

	@OriginalMember(owner = "client!client", name = "qk", descriptor = "I")
	private int anInt1096;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!RGCGKKUR;")
	private Class6_Sub1_Sub4 aClass6_Sub1_Sub4_6 = Class6_Sub1_Sub4.method399();

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt864 = -1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
	private int[] anIntArray212 = new int[50];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt865 = -1;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "B")
	private byte aByte26 = 5;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	private int[] anIntArray213 = new int[5];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray214 = new int[151];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt869 = 50;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	private int[] anIntArray215 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
	private int[] anIntArray216 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	private int[] anIntArray217 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray219 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray220 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	private int[] anIntArray221 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt869];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3[] aClass6_Sub1_Sub1_Sub3Array2 = new Class6_Sub1_Sub1_Sub3[13];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray222 = new int[2000];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt870 = 2048;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt871 = 2047;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[Lclient!IGCQCHAY;")
	private Class6_Sub1_Sub2_Sub3_Sub1[] aClass6_Sub1_Sub2_Sub3_Sub1Array1 = new Class6_Sub1_Sub2_Sub3_Sub1[this.anInt870];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray223 = new int[this.anInt870];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
	private int[] anIntArray224 = new int[this.anInt870];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[Lclient!RGCGKKUR;")
	private Class6_Sub1_Sub4[] aClass6_Sub1_Sub4Array1 = new Class6_Sub1_Sub4[this.anInt870];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt875 = 1;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt878 = 19817;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt879 = -124;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt880 = 672;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt881 = 793;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray226 = new int[33];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[I")
	private int[] anIntArray227 = new int[200];

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!RGCGKKUR;")
	private Class6_Sub1_Sub4 aClass6_Sub1_Sub4_7 = new Class6_Sub1_Sub4(new byte[5000], (byte) -17);

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[Lclient!NVHCJIOR;")
	private Class6_Sub1_Sub2_Sub3_Sub2[] aClass6_Sub1_Sub2_Sub3_Sub2Array1 = new Class6_Sub1_Sub2_Sub3_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
	private int[] anIntArray228 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt885 = 229;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4[] aClass6_Sub1_Sub1_Sub4Array4 = new Class6_Sub1_Sub1_Sub4[8];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt892 = 639;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[I")
	private int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "B")
	private byte aByte27 = -111;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt899 = 128;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt905 = -1;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt906 = -1;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	public int[] anIntArray236 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4[] aClass6_Sub1_Sub1_Sub4Array5 = new Class6_Sub1_Sub1_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private int[] anIntArray237 = new int[5];

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[[[Lclient!CEEJCAVA;")
	private Class5[][][] aClass5ArrayArrayArray1 = new Class5[4][104][104];

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt911 = -1;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "B")
	private byte aByte28 = 7;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[Lclient!ASFXKKJM;")
	private Class3[] aClass3Array1 = new Class3[4];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[500];

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt917 = 612;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt922 = 7759444;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt923 = 951;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "B")
	private byte aByte29 = 4;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!CEEJCAVA;")
	private Class5 aClass5_10 = new Class5(-7255);

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray238 = new int[100];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt937 = -26728;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt939 = -1;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private volatile boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt943 = -712;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt945 = -1;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[I")
	private int[] anIntArray243 = new int[33];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray244 = new int[Class40.anInt724];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt955 = -1;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt959 = 2;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray247 = new int[151];

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt961 = 3353893;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt965 = 987;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "B")
	private byte aByte30 = 2;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[Lclient!HOAULYFF;")
	public Class14[] aClass14Array1 = new Class14[5];

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
	private int[] anIntArray248 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
	private int[] anIntArray249 = new int[1000];

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray250 = new int[50];

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt972 = 23894;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt973 = 408;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4[] aClass6_Sub1_Sub1_Sub4Array6 = new Class6_Sub1_Sub1_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray251 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt978 = 2;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt979 = 17532;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[I")
	private int[] anIntArray252 = new int[Class40.anInt724];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt981 = -1;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray253 = new int[Class40.anInt724];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt985 = -1;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private final int[] anIntArray254 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
	private int[] anIntArray255 = new int[7];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt987 = 78;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4[] aClass6_Sub1_Sub1_Sub4Array7 = new Class6_Sub1_Sub1_Sub4[100];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
	private int[] anIntArray256 = new int[500];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[I")
	private int[] anIntArray257 = new int[500];

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	private int[] anIntArray258 = new int[500];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray259 = new int[500];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3[] aClass6_Sub1_Sub1_Sub3Array3 = new Class6_Sub1_Sub1_Sub3[2];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt988 = 2301979;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt990 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4[] aClass6_Sub1_Sub1_Sub4Array8 = new Class6_Sub1_Sub1_Sub4[32];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt1001 = -135;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Lclient!RGCGKKUR;")
	private Class6_Sub1_Sub4 aClass6_Sub1_Sub4_8 = Class6_Sub1_Sub4.method399();

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt1005 = -1;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt1006 = -1;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
	private volatile boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "B")
	private byte aByte31 = 2;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!QUBPQDMQ;")
	private Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "B")
	private byte aByte32 = 9;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray260 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt1021 = 18;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1022 = 8;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray261 = new int[100];

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "B")
	private byte aByte33 = 28;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
	private int[] anIntArray262 = new int[50];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4[] aClass6_Sub1_Sub1_Sub4Array9 = new Class6_Sub1_Sub1_Sub4[20];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray264 = new int[256];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1030 = -1;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
	private int[] anIntArray265 = new int[4000];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "[I")
	private int[] anIntArray266 = new int[4000];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1044 = 58;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "B")
	private byte aByte34 = 7;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1046 = 22761;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1048 = 2;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1051 = 5063219;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "B")
	private byte aByte35 = 87;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private int[] anIntArray267 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1061 = -43;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1062 = -1109;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1064 = 1;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1065 = 374;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1068 = -1;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private final int anInt1070 = 100;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray268 = new int[100];

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
	private boolean aBoolean268 = true;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Z")
	private boolean aBoolean269 = true;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!RGCGKKUR;")
	private Class6_Sub1_Sub4 aClass6_Sub1_Sub4_9 = Class6_Sub1_Sub4.method399();

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1071 = 3;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "B")
	private byte aByte36 = 4;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "B")
	private byte aByte37 = 0;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[Lclient!WGRALUSQ;")
	private Class6_Sub1_Sub1_Sub3[] aClass6_Sub1_Sub1_Sub3Array5 = new Class6_Sub1_Sub1_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Z")
	private volatile boolean aBoolean272 = false;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!CEEJCAVA;")
	private Class5 aClass5_11 = new Class5(-7255);

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1081 = -1;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
	private int[] anIntArray269 = new int[5];

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "[I")
	private int[] anIntArray270 = new int[9];

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Lclient!CEEJCAVA;")
	private Class5 aClass5_12 = new Class5(-7255);

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[Lclient!ZSWNSCUQ;")
	private Class6_Sub1_Sub1_Sub4[] aClass6_Sub1_Sub1_Sub4Array10 = new Class6_Sub1_Sub1_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
	private boolean aBoolean273 = false;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "Z")
	private boolean aBoolean274 = true;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "B")
	private byte aByte38 = 60;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
	private int[] anIntArray276 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	static {
		@Pc(4) int local4 = 2;
		@Pc(6) int local6;
		for (local6 = 0; local6 < 32; local6++) {
			anIntArray225[local6] = local4 - 1;
			local4 += local4;
		}
		anIntArrayArray24 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt956 = 10;
		aBoolean251 = true;
		anInt970 = 523;
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray263 = new int[99];
		local4 = 0;
		for (local6 = 0; local6 < 99; local6++) {
			@Pc(304) int local304 = local6 + 1;
			@Pc(317) int local317 = (int) ((double) local304 + Math.pow(2.0D, (double) local304 / 7.0D) * 300.0D);
			local4 += local317;
			anIntArray263[local6] = local4 / 4;
		}
		anInt1037 = 388;
		aString30 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt1066 = 9;
		anIntArray275 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) String local4 = String.valueOf(arg1);
			for (@Pc(9) int local9 = local4.length() - 3; local9 > 0; local9 -= 3) {
				local4 = local4.substring(0, local9) + "," + local4.substring(local9);
			}
			@Pc(34) boolean local34 = false;
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("28590, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method639(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("50958, " + arg0 + ", " + 27004 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private static void method685() {
		try {
			Class32.aBoolean155 = false;
			Class6_Sub1_Sub1_Sub1.aBoolean23 = false;
			aBoolean252 = false;
			Class23.aBoolean94 = false;
			Class28.aBoolean129 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("60003, " + 19662 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) int local10 = arg0 - arg1;
			if (local10 < -9) {
				return "@red@";
			} else if (local10 < -6) {
				return "@or3@";
			} else if (local10 < -3) {
				return "@or2@";
			} else if (local10 < 0) {
				return "@or1@";
			} else if (local10 > 9) {
				return "@gre@";
			} else if (local10 > 6) {
				return "@gr3@";
			} else if (local10 > 3) {
				return "@gr2@";
			} else if (local10 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("18132, " + 32572 + ", " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private static void method705() {
		try {
			Class32.aBoolean155 = true;
			Class6_Sub1_Sub1_Sub1.aBoolean23 = true;
			aBoolean252 = true;
			Class23.aBoolean94 = true;
			Class28.aBoolean129 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("31820, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 357);
			if (arg0.length == 5) {
				anInt956 = Integer.parseInt(arg0[0]);
				anInt957 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method705();
				} else if (arg0[2].equals("highmem")) {
					method685();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean251 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean251 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1099 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method575((byte) 3);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/net/Socket;")
	public Socket method588(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.aFrame_Sub1_2 != null) {
				return new URL("http://127.0.0.1:" + (anInt957 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method589(@OriginalArg(1) int arg0) {
		try {
			Class35.method390(arg0);
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("28119, " + 6 + ", " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!RGCGKKUR;I)V")
	private void method590(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		try {
			while (true) {
				if (arg1.anInt705 + 10 < arg2 * 8) {
					@Pc(12) int local12 = arg1.method422(11);
					if (local12 != 2047) {
						if (this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local12] == null) {
							this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local12] = new Class6_Sub1_Sub2_Sub3_Sub1();
							if (this.aClass6_Sub1_Sub4Array1[local12] != null) {
								this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local12].method142(this.aClass6_Sub1_Sub4Array1[local12]);
							}
						}
						this.anIntArray223[this.anInt872++] = local12;
						@Pc(58) Class6_Sub1_Sub2_Sub3_Sub1 local58 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local12];
						local58.anInt559 = anInt936;
						@Pc(66) int local66 = arg1.method422(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method422(1);
						if (local75 == 1) {
							this.anIntArray224[this.anInt873++] = local12;
						}
						@Pc(94) int local94 = arg1.method422(1);
						@Pc(99) int local99 = arg1.method422(5);
						if (local99 > 15) {
							local99 -= 32;
						}
						local58.method304(aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0] + local66, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0] + local99, local94 == 1);
						continue;
					}
				}
				arg1.method423();
				if (arg0 <= 0) {
					this.aClass6_Sub1_Sub4_9.method401(200);
					return;
				}
				return;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("70626, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!RGCGKKUR;Z)V")
	private void method591(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1) {
		try {
			arg1.method421(this.anInt923);
			@Pc(10) int local10 = arg1.method422(8);
			@Pc(22) int local22;
			if (local10 < this.anInt884) {
				for (local22 = local10; local22 < this.anInt884; local22++) {
					this.anIntArray231[this.anInt893++] = this.anIntArray228[local22];
				}
			}
			if (local10 > this.anInt884) {
				signlink.reporterror(this.aString27 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt884 = 0;
			for (local22 = 0; local22 < local10; local22++) {
				@Pc(74) int local74 = this.anIntArray228[local22];
				@Pc(79) Class6_Sub1_Sub2_Sub3_Sub2 local79 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local74];
				@Pc(84) int local84 = arg1.method422(1);
				if (local84 == 0) {
					this.anIntArray228[this.anInt884++] = local74;
					local79.anInt559 = anInt936;
				} else {
					@Pc(107) int local107 = arg1.method422(2);
					if (local107 == 0) {
						this.anIntArray228[this.anInt884++] = local74;
						local79.anInt559 = anInt936;
						this.anIntArray224[this.anInt873++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(169) int local169;
						if (local107 == 1) {
							this.anIntArray228[this.anInt884++] = local74;
							local79.anInt559 = anInt936;
							local158 = arg1.method422(3);
							local79.method305(local158, false, this.anInt979);
							local169 = arg1.method422(1);
							if (local169 == 1) {
								this.anIntArray224[this.anInt873++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray228[this.anInt884++] = local74;
							local79.anInt559 = anInt936;
							local158 = arg1.method422(3);
							local79.method305(local158, true, this.anInt979);
							local169 = arg1.method422(3);
							local79.method305(local169, true, this.anInt979);
							@Pc(229) int local229 = arg1.method422(1);
							if (local229 == 1) {
								this.anIntArray224[this.anInt873++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray231[this.anInt893++] = local74;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("45434, " + arg0 + ", " + arg1 + ", " + false + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method592() {
		try {
			@Pc(7) int local7 = this.aClass6_Sub1_Sub1_Sub2_4.method207("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt886; local9++) {
				local20 = this.aClass6_Sub1_Sub1_Sub2_4.method207(this.aStringArray9[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt886 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt858 > 4 && super.anInt859 > 4 && super.anInt858 < 516 && super.anInt859 < 338) {
				local70 = super.anInt858 - local7 / 2 - 4;
				if (local70 + local7 > 512) {
					local70 = 512 - local7;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt859 - 4;
				if (local88 + local20 > 334) {
					local88 = 334 - local20;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean270 = true;
				this.anInt1052 = 0;
				this.anInt1053 = local70;
				this.anInt1054 = local88;
				this.anInt1055 = local7;
				this.anInt1056 = this.anInt886 * 15 + 22;
			}
			if (super.anInt858 > 553 && super.anInt859 > 205 && super.anInt858 < 743 && super.anInt859 < 466) {
				local70 = super.anInt858 - local7 / 2 - 553;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 190) {
					local70 = 190 - local7;
				}
				local88 = super.anInt859 - 205;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 261) {
					local88 = 261 - local20;
				}
				this.aBoolean270 = true;
				this.anInt1052 = 1;
				this.anInt1053 = local70;
				this.anInt1054 = local88;
				this.anInt1055 = local7;
				this.anInt1056 = this.anInt886 * 15 + 22;
			}
			if (super.anInt858 > 17 && super.anInt859 > 357 && super.anInt858 < 496 && super.anInt859 < 453) {
				local70 = super.anInt858 - local7 / 2 - 17;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 479) {
					local70 = 479 - local7;
				}
				local88 = super.anInt859 - 357;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 96) {
					local88 = 96 - local20;
				}
				this.aBoolean270 = true;
				this.anInt1052 = 2;
				this.anInt1053 = local70;
				this.anInt1054 = local88;
				this.anInt1055 = local7;
				this.anInt1056 = this.anInt886 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("54371, " + -712 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method593() {
		try {
			if (super.anInt857 == 1) {
				if (super.anInt858 >= 539 && super.anInt858 <= 573 && super.anInt859 >= 169 && super.anInt859 < 205 && this.anIntArray276[0] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 0;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 569 && super.anInt858 <= 599 && super.anInt859 >= 168 && super.anInt859 < 205 && this.anIntArray276[1] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 1;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 597 && super.anInt858 <= 627 && super.anInt859 >= 168 && super.anInt859 < 205 && this.anIntArray276[2] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 2;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 625 && super.anInt858 <= 669 && super.anInt859 >= 168 && super.anInt859 < 203 && this.anIntArray276[3] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 3;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 666 && super.anInt858 <= 696 && super.anInt859 >= 168 && super.anInt859 < 205 && this.anIntArray276[4] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 4;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 694 && super.anInt858 <= 724 && super.anInt859 >= 168 && super.anInt859 < 205 && this.anIntArray276[5] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 5;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 722 && super.anInt858 <= 756 && super.anInt859 >= 169 && super.anInt859 < 205 && this.anIntArray276[6] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 6;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 540 && super.anInt858 <= 574 && super.anInt859 >= 466 && super.anInt859 < 502 && this.anIntArray276[7] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 7;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 572 && super.anInt858 <= 602 && super.anInt859 >= 466 && super.anInt859 < 503 && this.anIntArray276[8] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 8;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 599 && super.anInt858 <= 629 && super.anInt859 >= 466 && super.anInt859 < 503 && this.anIntArray276[9] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 9;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 627 && super.anInt858 <= 671 && super.anInt859 >= 467 && super.anInt859 < 502 && this.anIntArray276[10] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 10;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 669 && super.anInt858 <= 699 && super.anInt859 >= 466 && super.anInt859 < 503 && this.anIntArray276[11] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 11;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 696 && super.anInt858 <= 726 && super.anInt859 >= 466 && super.anInt859 < 503 && this.anIntArray276[12] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 12;
					this.aBoolean263 = true;
				}
				if (super.anInt858 >= 724 && super.anInt858 <= 758 && super.anInt859 >= 466 && super.anInt859 < 502 && this.anIntArray276[13] != -1) {
					this.aBoolean253 = true;
					this.anInt1071 = 13;
					this.aBoolean263 = true;
					return;
				}
			}
		} catch (@Pc(447) RuntimeException local447) {
			signlink.reporterror("27988, " + 6 + ", " + local447.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method594(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_Sub1_Sub1_Sub3_14 = new Class6_Sub1_Sub1_Sub3(this.aClass11_2, "titlebox", 0);
			this.aClass6_Sub1_Sub1_Sub3_15 = new Class6_Sub1_Sub1_Sub3(this.aClass11_2, "titlebutton", 0);
			@Pc(23) boolean local23 = false;
			this.aClass6_Sub1_Sub1_Sub3Array4 = new Class6_Sub1_Sub1_Sub3[12];
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				this.aClass6_Sub1_Sub1_Sub3Array4[local29] = new Class6_Sub1_Sub1_Sub3(this.aClass11_2, "runes", local29);
			}
			this.aClass6_Sub1_Sub1_Sub4_14 = new Class6_Sub1_Sub1_Sub4(128, 265);
			this.aClass6_Sub1_Sub1_Sub4_15 = new Class6_Sub1_Sub1_Sub4(128, 265);
			for (@Pc(62) int local62 = 0; local62 < 33920; local62++) {
				this.aClass6_Sub1_Sub1_Sub4_14.anIntArray209[local62] = this.aClass15_10.anIntArray43[local62];
			}
			for (@Pc(80) int local80 = 0; local80 < 33920; local80++) {
				this.aClass6_Sub1_Sub1_Sub4_15.anIntArray209[local80] = this.aClass15_11.anIntArray43[local80];
			}
			this.anIntArray240 = new int[256];
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				this.anIntArray240[local102] = local102 * 262144;
			}
			for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
				this.anIntArray240[local117 + 64] = local117 * 1024 + 16711680;
			}
			for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
				this.anIntArray240[local136 + 128] = local136 * 4 + 16776960;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray240[local155 + 192] = 16777215;
			}
			this.anIntArray241 = new int[256];
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray241[local174] = local174 * 1024;
			}
			for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
				this.anIntArray241[local189 + 64] = local189 * 4 + 65280;
			}
			for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
				this.anIntArray241[local208 + 128] = local208 * 262144 + 65535;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray241[local227 + 192] = 16777215;
			}
			this.anIntArray242 = new int[256];
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray242[local246] = local246 * 4;
			}
			for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
				this.anIntArray242[local261 + 64] = local261 * 262144 + 255;
			}
			for (@Pc(280) int local280 = 0; local280 < 64; local280++) {
				this.anIntArray242[local280 + 128] = local280 * 1024 + 16711935;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray242[local299 + 192] = 16777215;
			}
			this.anIntArray239 = new int[256];
			this.anIntArray229 = new int[32768];
			this.anIntArray230 = new int[32768];
			this.method610(null);
			this.anIntArray245 = new int[32768];
			this.anIntArray246 = new int[32768];
			this.method587("Connecting to fileserver", 10);
			if (!this.aBoolean248) {
				this.aBoolean272 = true;
				this.aBoolean248 = true;
				this.method586(this, 2);
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("54098, " + arg0 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(13) int local13 = arg0 >> 7;
			@Pc(17) int local17 = arg1 >> 7;
			if (local13 < 0 || local17 < 0 || local13 > 103 || local17 > 103) {
				return 0;
			}
			@Pc(31) int local31 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local13][local17] & 0x2) == 2) {
				local31 = arg2 + 1;
			}
			@Pc(51) int local51 = arg0 & 0x7F;
			@Pc(55) int local55 = arg1 & 0x7F;
			@Pc(83) int local83 = this.anIntArrayArrayArray8[local31][local13][local17] * (128 - local51) + this.anIntArrayArrayArray8[local31][local13 + 1][local17] * local51 >> 7;
			@Pc(115) int local115 = this.anIntArrayArrayArray8[local31][local13][local17 + 1] * (128 - local51) + this.anIntArrayArrayArray8[local31][local13 + 1][local17 + 1] * local51 >> 7;
			return local83 * (128 - local55) + local115 * local55 >> 7;
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("58022, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 43591 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method596() {
		try {
			this.anInt883 = 0;
			@Pc(15) int local15 = (aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 >> 7) + this.anInt928;
			@Pc(23) int local23 = (aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 >> 7) + this.anInt929;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt883 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt883 = 1;
			}
			if (this.anInt883 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt883 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("36902, " + 413 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!RGCGKKUR;I)V")
	private void method597(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt705 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method422(14);
					if (local12 != 16383) {
						if (this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local12] == null) {
							this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local12] = new Class6_Sub1_Sub2_Sub3_Sub2();
						}
						@Pc(32) Class6_Sub1_Sub2_Sub3_Sub2 local32 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local12];
						this.anIntArray228[this.anInt884++] = local12;
						local32.anInt559 = anInt936;
						@Pc(51) int local51 = arg0.method422(5);
						if (local51 > 15) {
							local51 -= 32;
						}
						@Pc(60) int local60 = arg0.method422(1);
						if (local60 == 1) {
							this.anIntArray224[this.anInt873++] = local12;
						}
						@Pc(79) int local79 = arg0.method422(5);
						if (local79 > 15) {
							local79 -= 32;
						}
						@Pc(88) int local88 = arg0.method422(1);
						local32.aClass47_2 = Class47.method542(arg0.method422(13));
						local32.anInt526 = local32.aClass47_2.aByte23;
						local32.anInt527 = local32.aClass47_2.anInt800;
						local32.anInt555 = local32.aClass47_2.anInt807;
						local32.anInt556 = local32.aClass47_2.anInt790;
						local32.anInt557 = local32.aClass47_2.anInt805;
						local32.anInt558 = local32.aClass47_2.anInt802;
						local32.anInt551 = local32.aClass47_2.anInt808;
						local32.method304(aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0] + local51, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0] + local79, local88 == 1);
						continue;
					}
				}
				arg0.method423();
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("73619, " + false + ", " + arg0 + ", " + arg1 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method598(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null || arg1.length() == 0) {
				this.anInt933 = 0;
			} else {
				@Pc(12) String local12 = arg1;
				@Pc(17) boolean local17 = false;
				@Pc(23) String[] local23 = new String[100];
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(29) int local29 = local12.indexOf(" ");
					if (local29 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local23[local25++] = local12.toLowerCase();
						}
						this.anInt933 = 0;
						label49: for (local29 = 0; local29 < Class4.anInt31; local29++) {
							@Pc(78) Class4 local78 = Class4.method22(local29);
							if (local78.anInt21 == -1 && local78.aString1 != null) {
								@Pc(89) String local89 = local78.aString1.toLowerCase();
								for (@Pc(91) int local91 = 0; local91 < local25; local91++) {
									if (local89.indexOf(local23[local91]) == -1) {
										continue label49;
									}
								}
								this.aStringArray11[this.anInt933] = local89;
								this.anIntArray238[this.anInt933] = local29;
								this.anInt933++;
								if (this.anInt933 >= this.aStringArray11.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(38) String local38 = local12.substring(0, local29).trim();
					if (local38.length() > 0) {
						local23[local25++] = local38.toLowerCase();
					}
					local12 = local12.substring(local29 + 1);
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("19304, " + arg0 + ", " + arg1 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Ljava/lang/String;")
	private String method599() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("20556, " + 243 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!QUBPQDMQ;III)V")
	private void method600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class35 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean264) {
				this.anInt1036 = 32;
			} else {
				this.anInt1036 = 0;
			}
			this.aBoolean264 = false;
			if (arg1 >= arg3 && arg1 < arg3 + 16 && arg5 >= arg6 && arg5 < arg6 + 16) {
				arg4.anInt666 -= this.anInt904 * 4;
				if (arg7 == 1) {
					this.aBoolean253 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean246 = true;
				}
			} else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg5 >= arg6 + arg0 - 16 && arg5 < arg6 + arg0) {
				arg4.anInt666 += this.anInt904 * 4;
				if (arg7 == 1) {
					this.aBoolean253 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean246 = true;
				}
			} else if (arg1 >= arg3 - this.anInt1036 && arg1 < arg3 + this.anInt1036 + 16 && arg5 >= arg6 + 16 && arg5 < arg6 + arg0 - 16 && this.anInt904 > 0) {
				@Pc(144) int local144 = (arg0 - 32) * arg0 / arg2;
				if (local144 < 8) {
					local144 = 8;
				}
				@Pc(159) int local159 = arg5 - arg6 - local144 / 2 - 16;
				@Pc(165) int local165 = arg0 - local144 - 32;
				arg4.anInt666 = (arg2 - arg0) * local159 / local165;
				if (arg7 == 1) {
					this.aBoolean253 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean246 = true;
				}
				this.aBoolean264 = true;
			}
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("16070, " + -333 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method601(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1103 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("78346, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method602(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(15) Class6_Sub1_Sub3 local15 = this.aClass22_Sub1_1.method293();
				if (local15 == null) {
					return;
				}
				if (local15.anInt160 == 0) {
					Class6_Sub1_Sub2_Sub5.method226(local15.aByteArray4, local15.anInt161);
					if ((this.aClass22_Sub1_1.method299(local15.anInt161) & 0x62) != 0) {
						this.aBoolean253 = true;
						if (this.anInt1030 != -1 || this.anInt981 != -1) {
							this.aBoolean246 = true;
						}
					}
				}
				if (local15.anInt160 == 1 && local15.aByteArray4 != null) {
					Class34.method375(local15.aByteArray4);
				}
				if (local15.anInt160 == 2 && local15.anInt161 == this.anInt907 && local15.aByteArray4 != null) {
					this.method668(local15.aByteArray4, this.aBoolean241);
				}
				if (local15.anInt160 == 3 && this.anInt1028 == 1) {
					for (@Pc(90) int local90 = 0; local90 < this.aByteArrayArray6.length; local90++) {
						if (this.anIntArray233[local90] == local15.anInt161) {
							this.aByteArrayArray6[local90] = local15.aByteArray4;
							if (local15.aByteArray4 == null) {
								this.anIntArray233[local90] = -1;
							}
							break;
						}
						if (this.anIntArray234[local90] == local15.anInt161) {
							this.aByteArrayArray5[local90] = local15.aByteArray4;
							if (local15.aByteArray4 == null) {
								this.anIntArray234[local90] = -1;
							}
							break;
						}
					}
				}
				if (local15.anInt160 == 93 && this.aClass22_Sub1_1.method295(local15.anInt161, (byte) 6)) {
					Class23.method170(new Class6_Sub1_Sub4(local15.aByteArray4, (byte) -17), this.aClass22_Sub1_1);
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("47145, " + arg0 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method603(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.anInt1061 = 476;
			}
			if (super.anInt857 == 1) {
				if (super.anInt858 >= 6 && super.anInt858 <= 106 && super.anInt859 >= 467 && super.anInt859 <= 499) {
					this.anInt932 = (this.anInt932 + 1) % 4;
					this.aBoolean233 = true;
					this.aBoolean246 = true;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 50);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt932);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt980);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt1025);
				}
				if (super.anInt858 >= 135 && super.anInt858 <= 235 && super.anInt859 >= 467 && super.anInt859 <= 499) {
					this.anInt980 = (this.anInt980 + 1) % 3;
					this.aBoolean233 = true;
					this.aBoolean246 = true;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 50);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt932);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt980);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt1025);
				}
				if (super.anInt858 >= 273 && super.anInt858 <= 373 && super.anInt859 >= 467 && super.anInt859 <= 499) {
					this.anInt1025 = (this.anInt1025 + 1) % 3;
					this.aBoolean233 = true;
					this.aBoolean246 = true;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 50);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt932);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt980);
					this.aClass6_Sub1_Sub4_9.method401(this.anInt1025);
				}
				if (super.anInt858 >= 412 && super.anInt858 <= 512 && super.anInt859 >= 467 && super.anInt859 <= 499) {
					if (this.anInt985 == -1) {
						this.method608();
						this.aString20 = "";
						this.aBoolean273 = false;
						this.anInt865 = this.anInt985 = Class35.anInt670;
						return;
					}
					this.method707("Please close the interface you have open before using 'report abuse'", 0, "");
					return;
				}
			}
		} catch (@Pc(205) RuntimeException local205) {
			signlink.reporterror("28557, " + arg0 + ", " + local205.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method604() {
		try {
			@Pc(6) int local6 = this.anInt947 * 128 + 64;
			@Pc(13) int local13 = this.anInt948 * 128 + 64;
			@Pc(24) int local24 = this.method595(local6, local13, this.anInt989) - this.anInt949;
			if (this.anInt1031 < local6) {
				this.anInt1031 += this.anInt950 + (local6 - this.anInt1031) * this.anInt951 / 1000;
				if (this.anInt1031 > local6) {
					this.anInt1031 = local6;
				}
			}
			if (this.anInt1031 > local6) {
				this.anInt1031 -= this.anInt950 + (this.anInt1031 - local6) * this.anInt951 / 1000;
				if (this.anInt1031 < local6) {
					this.anInt1031 = local6;
				}
			}
			if (this.anInt1032 < local24) {
				this.anInt1032 += this.anInt950 + (local24 - this.anInt1032) * this.anInt951 / 1000;
				if (this.anInt1032 > local24) {
					this.anInt1032 = local24;
				}
			}
			if (this.anInt1032 > local24) {
				this.anInt1032 -= this.anInt950 + (this.anInt1032 - local24) * this.anInt951 / 1000;
				if (this.anInt1032 < local24) {
					this.anInt1032 = local24;
				}
			}
			if (this.anInt1033 < local13) {
				this.anInt1033 += this.anInt950 + (local13 - this.anInt1033) * this.anInt951 / 1000;
				if (this.anInt1033 > local13) {
					this.anInt1033 = local13;
				}
			}
			if (this.anInt1033 > local13) {
				this.anInt1033 -= this.anInt950 + (this.anInt1033 - local13) * this.anInt951 / 1000;
				if (this.anInt1033 < local13) {
					this.anInt1033 = local13;
				}
			}
			anInt903++;
			if (anInt903 > 173) {
				anInt903 = 0;
				this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 132);
				this.aClass6_Sub1_Sub4_9.method404(1123312);
			}
			local6 = this.anInt1074 * 128 + 64;
			local13 = this.anInt1075 * 128 + 64;
			local24 = this.method595(local6, local13, this.anInt989) - this.anInt1076;
			@Pc(248) int local248 = local6 - this.anInt1031;
			@Pc(253) int local253 = local24 - this.anInt1032;
			@Pc(258) int local258 = local13 - this.anInt1033;
			@Pc(269) int local269 = (int) Math.sqrt((double) (local248 * local248 + local258 * local258));
			@Pc(280) int local280 = (int) (Math.atan2((double) local253, (double) local269) * 325.949D) & 0x7FF;
			@Pc(291) int local291 = (int) (Math.atan2((double) local248, (double) local258) * -325.949D) & 0x7FF;
			if (local280 < 128) {
				local280 = 128;
			}
			if (local280 > 383) {
				local280 = 383;
			}
			if (this.anInt1034 < local280) {
				this.anInt1034 += this.anInt1077 + (local280 - this.anInt1034) * this.anInt1078 / 1000;
				if (this.anInt1034 > local280) {
					this.anInt1034 = local280;
				}
			}
			if (this.anInt1034 > local280) {
				this.anInt1034 -= this.anInt1077 + (this.anInt1034 - local280) * this.anInt1078 / 1000;
				if (this.anInt1034 < local280) {
					this.anInt1034 = local280;
				}
			}
			@Pc(362) int local362 = local291 - this.anInt1035;
			if (local362 > 1024) {
				local362 -= 2048;
			}
			if (local362 < -1024) {
				local362 += 2048;
			}
			if (local362 > 0) {
				this.anInt1035 += this.anInt1077 + local362 * this.anInt1078 / 1000;
				this.anInt1035 &= 0x7FF;
			}
			if (local362 < 0) {
				this.anInt1035 -= this.anInt1077 + -local362 * this.anInt1078 / 1000;
				this.anInt1035 &= 0x7FF;
			}
			@Pc(420) int local420 = local291 - this.anInt1035;
			if (local420 > 1024) {
				local420 -= 2048;
			}
			if (local420 < -1024) {
				local420 += 2048;
			}
			if (local420 < 0 && local362 > 0 || local420 > 0 && local362 < 0) {
				this.anInt1035 = local291;
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("20102, " + -498 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method605() {
		try {
			try {
				@Pc(10) int local10 = aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 + this.anInt958;
				@Pc(16) int local16 = aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 + this.anInt977;
				if (this.anInt1041 - local10 < -500 || this.anInt1041 - local10 > 500 || this.anInt1042 - local16 < -500 || this.anInt1042 - local16 > 500) {
					this.anInt1041 = local10;
					this.anInt1042 = local16;
				}
				if (this.anInt1041 != local10) {
					this.anInt1041 += (local10 - this.anInt1041) / 16;
				}
				if (this.anInt1042 != local16) {
					this.anInt1042 += (local16 - this.anInt1042) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt901 += (-this.anInt901 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt901 += (24 - this.anInt901) / 2;
				} else {
					this.anInt901 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt902 += (12 - this.anInt902) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt902 += (-this.anInt902 - 12) / 2;
				} else {
					this.anInt902 /= 2;
				}
				this.anInt900 = this.anInt900 + this.anInt901 / 2 & 0x7FF;
				this.anInt899 += this.anInt902 / 2;
				if (this.anInt899 < 128) {
					this.anInt899 = 128;
				}
				if (this.anInt899 > 383) {
					this.anInt899 = 383;
				}
				@Pc(203) int local203 = this.anInt1041 >> 7;
				@Pc(208) int local208 = this.anInt1042 >> 7;
				@Pc(218) int local218 = this.method595(this.anInt1041, this.anInt1042, this.anInt989);
				@Pc(220) int local220 = 0;
				@Pc(236) int local236;
				if (local203 > 3 && local208 > 3 && local203 < 100 && local208 < 100) {
					for (local236 = local203 - 4; local236 <= local203 + 4; local236++) {
						for (@Pc(242) int local242 = local208 - 4; local242 <= local208 + 4; local242++) {
							@Pc(247) int local247 = this.anInt989;
							if (local247 < 3 && (this.aByteArrayArrayArray8[1][local236][local242] & 0x2) == 2) {
								local247++;
							}
							@Pc(274) int local274 = local218 - this.anIntArrayArrayArray8[local247][local236][local242];
							if (local274 > local220) {
								local220 = local274;
							}
						}
					}
				}
				local236 = local220 * 192;
				if (local236 > 98048) {
					local236 = 98048;
				}
				if (local236 < 32768) {
					local236 = 32768;
				}
				if (local236 > this.anInt938) {
					this.anInt938 += (local236 - this.anInt938) / 24;
				} else if (local236 < this.anInt938) {
					this.anInt938 += (local236 - this.anInt938) / 80;
				}
			} catch (@Pc(338) Exception local338) {
				signlink.reporterror("glfc_ex " + aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 + "," + aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 + "," + this.anInt1041 + "," + this.anInt1042 + "," + this.anInt974 + "," + this.anInt975 + "," + this.anInt928 + "," + this.anInt929);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("12632, " + 0 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method606() {
		try {
			this.aClass15_6.method121();
			Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray271;
			this.aClass6_Sub1_Sub1_Sub3_3.method535(0, 0);
			if (this.aBoolean247) {
				this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 0, this.aString26, 40);
				this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 128, this.aString21 + "*", 60);
			} else if (this.anInt1010 == 1) {
				this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 0, "Enter amount:", 40);
				this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 128, this.aString18 + "*", 60);
			} else if (this.anInt1010 == 2) {
				this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 0, "Enter name:", 40);
				this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 128, this.aString18 + "*", 60);
			} else {
				@Pc(128) Class6_Sub1_Sub1_Sub2 local128;
				@Pc(136) int local136;
				@Pc(147) int local147;
				if (this.anInt1010 == 3) {
					if (this.aString18 != this.aString19) {
						this.method598((byte) 9, this.aString18);
						this.aString19 = this.aString18;
					}
					local128 = this.aClass6_Sub1_Sub1_Sub2_3;
					Class6_Sub1_Sub1.method552(0, 77, 463, 0);
					for (local136 = 0; local136 < this.anInt933; local136++) {
						local147 = local136 * 14 + 18 - this.anInt934;
						if (local147 > 0 && local147 < 110) {
							local128.method205(239, 0, this.aStringArray11[local136], local147);
						}
					}
					Class6_Sub1_Sub1.method551();
					if (this.anInt933 > 5) {
						this.method637(this.anInt933 * 14 + 7, 77, 463, 0, this.anInt934);
					}
					if (this.aString18.length() == 0) {
						this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 255, "Enter object name", 40);
					} else if (this.anInt933 == 0) {
						this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 0, "No matching objects found, please shorten search", 40);
					}
					local128.method205(239, 0, this.aString18 + "*", 90);
					Class6_Sub1_Sub1.method558(0, 479, 893, 77, 0);
				} else if (this.aString25 != null) {
					this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 0, this.aString25, 40);
					this.aClass6_Sub1_Sub1_Sub2_4.method205(239, 128, "Click to continue", 60);
				} else if (this.anInt1030 != -1) {
					this.method675(0, 0, Class35.method389(this.anInt1030), 0);
				} else if (this.anInt981 == -1) {
					local128 = this.aClass6_Sub1_Sub1_Sub2_3;
					local136 = 0;
					Class6_Sub1_Sub1.method552(0, 77, 463, 0);
					for (local147 = 0; local147 < 100; local147++) {
						if (this.aStringArray13[local147] != null) {
							@Pc(312) int local312 = this.anIntArray261[local147];
							@Pc(321) int local321 = this.anInt909 + 70 - local136 * 14;
							@Pc(326) String local326 = this.aStringArray12[local147];
							@Pc(328) byte local328 = 0;
							if (local326 != null && local326.startsWith("@cr1@")) {
								local326 = local326.substring(5);
								local328 = 1;
							}
							if (local326 != null && local326.startsWith("@cr2@")) {
								local326 = local326.substring(5);
								local328 = 2;
							}
							if (local312 == 0) {
								if (local321 > 0 && local321 < 110) {
									local128.method209(0, this.aStringArray13[local147], local321, 4);
								}
								local136++;
							}
							@Pc(398) int local398;
							if ((local312 == 1 || local312 == 2) && (local312 == 1 || this.anInt932 == 0 || this.anInt932 == 1 && this.method640(local326))) {
								if (local321 > 0 && local321 < 110) {
									local398 = 4;
									if (local328 == 1) {
										this.aClass6_Sub1_Sub1_Sub3Array3[0].method535(4, local321 - 12);
										local398 += 14;
									}
									if (local328 == 2) {
										this.aClass6_Sub1_Sub1_Sub3Array3[1].method535(local398, local321 - 12);
										local398 += 14;
									}
									local128.method209(0, local326 + ":", local321, local398);
									local398 += local128.method207(local326) + 8;
									local128.method209(255, this.aStringArray13[local147], local321, local398);
								}
								local136++;
							}
							if ((local312 == 3 || local312 == 7) && this.anInt963 == 0 && (local312 == 7 || this.anInt980 == 0 || this.anInt980 == 1 && this.method640(local326))) {
								if (local321 > 0 && local321 < 110) {
									local128.method209(0, "From", local321, 4);
									local398 = local128.method207("From ") + 4;
									if (local328 == 1) {
										this.aClass6_Sub1_Sub1_Sub3Array3[0].method535(local398, local321 - 12);
										local398 += 14;
									}
									if (local328 == 2) {
										this.aClass6_Sub1_Sub1_Sub3Array3[1].method535(local398, local321 - 12);
										local398 += 14;
									}
									local128.method209(0, local326 + ":", local321, local398);
									local398 += local128.method207(local326) + 8;
									local128.method209(8388608, this.aStringArray13[local147], local321, local398);
								}
								local136++;
							}
							if (local312 == 4 && (this.anInt1025 == 0 || this.anInt1025 == 1 && this.method640(local326))) {
								if (local321 > 0 && local321 < 110) {
									local128.method209(8388736, local326 + " " + this.aStringArray13[local147], local321, 4);
								}
								local136++;
							}
							if (local312 == 5 && this.anInt963 == 0 && this.anInt980 < 2) {
								if (local321 > 0 && local321 < 110) {
									local128.method209(8388608, this.aStringArray13[local147], local321, 4);
								}
								local136++;
							}
							if (local312 == 6 && this.anInt963 == 0 && this.anInt980 < 2) {
								if (local321 > 0 && local321 < 110) {
									local128.method209(0, "To " + local326 + ":", local321, 4);
									local128.method209(8388608, this.aStringArray13[local147], local321, local128.method207("To " + local326) + 12);
								}
								local136++;
							}
							if (local312 == 8 && (this.anInt1025 == 0 || this.anInt1025 == 1 && this.method640(local326))) {
								if (local321 > 0 && local321 < 110) {
									local128.method209(8270336, local326 + " " + this.aStringArray13[local147], local321, 4);
								}
								local136++;
							}
						}
					}
					Class6_Sub1_Sub1.method551();
					this.anInt987 = local136 * 14 + 7;
					if (this.anInt987 < 78) {
						this.anInt987 = 78;
					}
					this.method637(this.anInt987, 77, 463, 0, this.anInt987 - this.anInt909 - 77);
					@Pc(768) String local768;
					if (aClass6_Sub1_Sub2_Sub3_Sub1_1 == null || aClass6_Sub1_Sub2_Sub3_Sub1_1.aString5 == null) {
						local768 = Class38.method457(this.aString27);
					} else {
						local768 = aClass6_Sub1_Sub2_Sub3_Sub1_1.aString5;
					}
					local128.method209(0, local768 + ":", 90, 4);
					local128.method209(255, this.aString24 + "*", 90, local128.method207(local768 + ": ") + 6);
					Class6_Sub1_Sub1.method558(0, 479, 893, 77, 0);
				} else {
					this.method675(0, 0, Class35.method389(this.anInt981), 0);
				}
			}
			if (this.aBoolean270 && this.anInt1052 == 2) {
				this.method700();
			}
			this.aClass15_6.method122(super.aGraphics2, 966, 357, 17);
			this.aClass15_5.method121();
			Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
		} catch (@Pc(849) RuntimeException local849) {
			signlink.reporterror("25919, " + 0 + ", " + local849.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method607() {
		try {
			if (this.anInt1017 > 0) {
				this.method644((byte) 9);
			} else {
				this.method645("Please wait - attempting to reestablish", "Connection lost");
				this.anInt898 = 0;
				this.anInt1038 = 0;
				@Pc(25) Class41 local25 = this.aClass41_1;
				this.aBoolean243 = false;
				this.anInt1059 = 0;
				this.method693(this.aString27, this.aString28, true);
				if (!this.aBoolean243) {
					this.method644((byte) 9);
				}
				try {
					local25.method461();
				} catch (@Pc(48) Exception local48) {
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("4195, " + 31790 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method608() {
		try {
			this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 245);
			if (this.anInt911 != -1) {
				this.method589(this.anInt911);
				this.anInt911 = -1;
				this.aBoolean253 = true;
				this.aBoolean237 = false;
				this.aBoolean263 = true;
			}
			if (this.anInt1030 != -1) {
				this.method589(this.anInt1030);
				this.anInt1030 = -1;
				this.aBoolean246 = true;
				this.aBoolean237 = false;
			}
			if (this.anInt1006 != -1) {
				this.method589(this.anInt1006);
				this.anInt1006 = -1;
				this.aBoolean259 = true;
			}
			if (this.anInt864 != -1) {
				this.method589(this.anInt864);
				this.anInt864 = -1;
			}
			if (this.anInt985 != -1) {
				this.method589(this.anInt985);
				this.anInt985 = -1;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("21971, " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Z")
	private boolean method609() {
		try {
			this.anInt1013 += 0;
			if (this.aClass41_1 == null) {
				return false;
			}
			@Pc(1846) String local1846;
			@Pc(292) int local292;
			try {
				@Pc(16) int local16 = this.aClass41_1.method463();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt1014 == -1) {
					this.aClass41_1.method464(this.aClass6_Sub1_Sub4_8.aByteArray17, 0, 1);
					this.anInt1014 = this.aClass6_Sub1_Sub4_8.aByteArray17[0] & 0xFF;
					if (this.aClass18_2 != null) {
						this.anInt1014 = this.anInt1014 - this.aClass18_2.method155() & 0xFF;
					}
					this.anInt1013 = Class20.anIntArray63[this.anInt1014];
					local16--;
				}
				if (this.anInt1013 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass41_1.method464(this.aClass6_Sub1_Sub4_8.aByteArray17, 0, 1);
					this.anInt1013 = this.aClass6_Sub1_Sub4_8.aByteArray17[0] & 0xFF;
					local16--;
				}
				if (this.anInt1013 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass41_1.method464(this.aClass6_Sub1_Sub4_8.aByteArray17, 0, 2);
					this.aClass6_Sub1_Sub4_8.anInt704 = 0;
					this.anInt1013 = this.aClass6_Sub1_Sub4_8.method413();
					local16 -= 2;
				}
				if (local16 < this.anInt1013) {
					return false;
				}
				this.aClass6_Sub1_Sub4_8.anInt704 = 0;
				this.aClass41_1.method464(this.aClass6_Sub1_Sub4_8.aByteArray17, 0, this.anInt1013);
				this.anInt1015 = 0;
				this.anInt921 = this.anInt920;
				this.anInt920 = this.anInt919;
				this.anInt919 = this.anInt1014;
				if (this.anInt1014 == 228) {
					this.aBoolean247 = false;
					this.anInt1010 = 2;
					this.aString18 = "";
					this.aBoolean246 = true;
					this.anInt1014 = -1;
					return true;
				}
				if (this.anInt1014 == 25) {
					this.aBoolean247 = false;
					this.anInt1010 = 1;
					this.aString18 = "";
					this.aBoolean246 = true;
					this.anInt1014 = -1;
					return true;
				}
				@Pc(212) int local212;
				@Pc(214) int local214;
				@Pc(220) int local220;
				@Pc(205) int local205;
				@Pc(208) Class35 local208;
				if (this.anInt1014 == 141) {
					this.aBoolean253 = true;
					local205 = this.aClass6_Sub1_Sub4_8.method413();
					local208 = Class35.method389(local205);
					local212 = this.aClass6_Sub1_Sub4_8.method413();
					for (local214 = 0; local214 < local212; local214++) {
						local220 = this.aClass6_Sub1_Sub4_8.method411();
						if (local220 == 255) {
							local220 = this.aClass6_Sub1_Sub4_8.method446();
						}
						local208.anIntArray185[local214] = this.aClass6_Sub1_Sub4_8.method413();
						local208.anIntArray184[local214] = local220;
					}
					for (local220 = local212; local220 < local208.anIntArray185.length; local220++) {
						local208.anIntArray185[local220] = 0;
						local208.anIntArray184[local220] = 0;
					}
					this.anInt1014 = -1;
					return true;
				}
				if (this.anInt1014 == 169) {
					this.anInt1083 = this.aClass6_Sub1_Sub4_8.method429();
					this.anInt1084 = this.aClass6_Sub1_Sub4_8.method411();
					for (local205 = this.anInt1083; local205 < this.anInt1083 + 8; local205++) {
						for (local292 = this.anInt1084; local292 < this.anInt1084 + 8; local292++) {
							if (this.aClass5ArrayArrayArray1[this.anInt989][local205][local292] != null) {
								this.aClass5ArrayArrayArray1[this.anInt989][local205][local292] = null;
								this.method673(local205, local292);
							}
						}
					}
					for (@Pc(337) Class6_Sub2 local337 = (Class6_Sub2) this.aClass5_10.method33(); local337 != null; local337 = (Class6_Sub2) this.aClass5_10.method35((byte) 8)) {
						if (local337.anInt169 >= this.anInt1083 && local337.anInt169 < this.anInt1083 + 8 && local337.anInt170 >= this.anInt1084 && local337.anInt170 < this.anInt1084 + 8 && local337.anInt167 == this.anInt989) {
							local337.anInt171 = 0;
						}
					}
					this.anInt1014 = -1;
					return true;
				}
				if (this.anInt1014 == 156) {
					this.aBoolean231 = true;
					this.anInt947 = this.aClass6_Sub1_Sub4_8.method411();
					this.anInt948 = this.aClass6_Sub1_Sub4_8.method411();
					this.anInt949 = this.aClass6_Sub1_Sub4_8.method413();
					this.anInt950 = this.aClass6_Sub1_Sub4_8.method411();
					this.anInt951 = this.aClass6_Sub1_Sub4_8.method411();
					if (this.anInt951 >= 100) {
						this.anInt1031 = this.anInt947 * 128 + 64;
						this.anInt1033 = this.anInt948 * 128 + 64;
						this.anInt1032 = this.method595(this.anInt1031, this.anInt1033, this.anInt989) - this.anInt949;
					}
					this.anInt1014 = -1;
					return true;
				}
				@Pc(513) int local513;
				@Pc(796) int local796;
				@Pc(817) int local817;
				if (this.anInt1014 != 121 && this.anInt1014 != 30) {
					if (this.anInt1014 != 163) {
						if (this.anInt1014 == 166) {
							this.method679(this.anInt1013, this.aClass6_Sub1_Sub4_8);
							this.aBoolean262 = false;
							this.anInt1014 = -1;
							return true;
						}
						@Pc(1411) Class35 local1411;
						if (this.anInt1014 == 193) {
							local205 = this.aClass6_Sub1_Sub4_8.method441();
							local292 = this.aClass6_Sub1_Sub4_8.method438();
							local1411 = Class35.method389(local292);
							if (local1411.anInt656 != local205 || local205 == -1) {
								local1411.anInt656 = local205;
								local1411.anInt690 = 0;
								local1411.anInt655 = 0;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 36) {
							this.anInt999 = this.aClass6_Sub1_Sub4_8.method411();
							if (this.anInt999 == 1) {
								this.anInt876 = this.aClass6_Sub1_Sub4_8.method413();
							}
							if (this.anInt999 >= 2 && this.anInt999 <= 6) {
								if (this.anInt999 == 2) {
									this.anInt994 = 64;
									this.anInt995 = 64;
								}
								if (this.anInt999 == 3) {
									this.anInt994 = 0;
									this.anInt995 = 64;
								}
								if (this.anInt999 == 4) {
									this.anInt994 = 128;
									this.anInt995 = 64;
								}
								if (this.anInt999 == 5) {
									this.anInt994 = 64;
									this.anInt995 = 0;
								}
								if (this.anInt999 == 6) {
									this.anInt994 = 64;
									this.anInt995 = 128;
								}
								this.anInt999 = 2;
								this.anInt991 = this.aClass6_Sub1_Sub4_8.method413();
								this.anInt992 = this.aClass6_Sub1_Sub4_8.method413();
								this.anInt993 = this.aClass6_Sub1_Sub4_8.method411();
							}
							if (this.anInt999 == 10) {
								this.anInt944 = this.aClass6_Sub1_Sub4_8.method413();
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 107) {
							local205 = this.aClass6_Sub1_Sub4_8.method437();
							local208 = Class35.method389(local205);
							for (local212 = 0; local212 < local208.anIntArray185.length; local212++) {
								local208.anIntArray185[local212] = -1;
								local208.anIntArray185[local212] = 0;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 232) {
							this.anInt1096 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 235) {
							local205 = this.aClass6_Sub1_Sub4_8.method438();
							local292 = this.aClass6_Sub1_Sub4_8.method413();
							if (this.anInt1030 != -1) {
								this.method589(this.anInt1030);
								this.anInt1030 = -1;
								this.aBoolean246 = true;
							}
							if (this.anInt1006 != -1) {
								this.method589(this.anInt1006);
								this.anInt1006 = -1;
								this.aBoolean259 = true;
							}
							if (this.anInt864 != -1) {
								this.method589(this.anInt864);
								this.anInt864 = -1;
							}
							if (this.anInt985 != local292) {
								this.method589(this.anInt985);
								this.anInt985 = local292;
							}
							if (this.anInt911 != local205) {
								this.method589(this.anInt911);
								this.anInt911 = local205;
							}
							if (this.anInt1010 != 0) {
								this.anInt1010 = 0;
								this.aBoolean246 = true;
							}
							this.aBoolean253 = true;
							this.aBoolean263 = true;
							this.aBoolean237 = false;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 251) {
							@Pc(1701) byte local1701 = this.aClass6_Sub1_Sub4_8.method412();
							local292 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							this.anIntArray222[local292] = local1701;
							if (this.anIntArray236[local292] != local1701) {
								this.anIntArray236[local292] = local1701;
								this.method671(local292, this.aByte35);
								this.aBoolean253 = true;
								if (this.anInt981 != -1) {
									this.aBoolean246 = true;
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 34) {
							local205 = this.aClass6_Sub1_Sub4_8.method437();
							Class35.method389(local205).anInt685 = 3;
							if (aClass6_Sub1_Sub2_Sub3_Sub1_1.aClass47_1 == null) {
								Class35.method389(local205).anInt686 = (aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray54[0] << 25) + (aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray54[4] << 20) + (aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray55[0] << 15) + (aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray55[8] << 10) + (aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray55[11] << 5) + aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray55[1];
							} else {
								Class35.method389(local205).anInt686 = (int) (aClass6_Sub1_Sub2_Sub3_Sub1_1.aClass47_1.aLong25 + 305419896L);
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 154) {
							if (this.anInt1071 == 12) {
								this.aBoolean253 = true;
							}
							this.anInt1000 = this.aClass6_Sub1_Sub4_8.method414();
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 26) {
							local1846 = this.aClass6_Sub1_Sub4_8.method418();
							local292 = this.aClass6_Sub1_Sub4_8.method431();
							local212 = this.aClass6_Sub1_Sub4_8.method430();
							if (local212 >= 1 && local212 <= 5) {
								if (local1846.equalsIgnoreCase("null")) {
									local1846 = null;
								}
								this.aStringArray10[local212 - 1] = local1846;
								this.aBooleanArray11[local212 - 1] = local292 == 0;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 52) {
							this.anInt1009 = this.anInt1013 / 8;
							for (local205 = 0; local205 < this.anInt1009; local205++) {
								this.aLongArray3[local205] = this.aClass6_Sub1_Sub4_8.method417();
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 151) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							local292 = this.aClass6_Sub1_Sub4_8.method413();
							local212 = local205 >> 10 & 0x1F;
							local214 = local205 >> 5 & 0x1F;
							local220 = local205 & 0x1F;
							Class35.method389(local292).anInt659 = (local212 << 19) + (local214 << 11) + (local220 << 3);
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 18) {
							local205 = this.aClass6_Sub1_Sub4_8.method438();
							local292 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							Class35.method389(local205).anInt685 = 2;
							Class35.method389(local205).anInt686 = local292;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 146) {
							this.anInt1045 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1068 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 152) {
							this.anInt1071 = this.aClass6_Sub1_Sub4_8.method411();
							this.aBoolean253 = true;
							this.aBoolean263 = true;
							this.anInt1014 = -1;
							return true;
						}
						@Pc(2058) String local2058;
						@Pc(2063) boolean local2063;
						@Pc(2198) String local2198;
						if (this.anInt1014 == 31) {
							local1846 = this.aClass6_Sub1_Sub4_8.method418();
							@Pc(2061) long local2061;
							if (local1846.endsWith(":tradereq:")) {
								local2058 = local1846.substring(0, local1846.indexOf(":"));
								local2061 = Class38.method453(local2058);
								local2063 = false;
								for (local513 = 0; local513 < this.anInt1009; local513++) {
									if (this.aLongArray3[local513] == local2061) {
										local2063 = true;
										break;
									}
								}
								if (!local2063 && this.anInt883 == 0) {
									this.method707("wishes to trade with you.", 4, local2058);
								}
							} else if (local1846.endsWith(":duelreq:")) {
								local2058 = local1846.substring(0, local1846.indexOf(":"));
								local2061 = Class38.method453(local2058);
								local2063 = false;
								for (local513 = 0; local513 < this.anInt1009; local513++) {
									if (this.aLongArray3[local513] == local2061) {
										local2063 = true;
										break;
									}
								}
								if (!local2063 && this.anInt883 == 0) {
									this.method707("wishes to duel with you.", 8, local2058);
								}
							} else if (local1846.endsWith(":chalreq:")) {
								local2058 = local1846.substring(0, local1846.indexOf(":"));
								local2061 = Class38.method453(local2058);
								local2063 = false;
								for (local513 = 0; local513 < this.anInt1009; local513++) {
									if (this.aLongArray3[local513] == local2061) {
										local2063 = true;
										break;
									}
								}
								if (!local2063 && this.anInt883 == 0) {
									local2198 = local1846.substring(local1846.indexOf(":") + 1, local1846.length() - 9);
									this.method707(local2198, 8, local2058);
								}
							} else {
								this.method707(local1846, 0, "");
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 161) {
							this.method644((byte) 9);
							this.anInt1014 = -1;
							return false;
						}
						if (this.anInt1014 == 110) {
							local205 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							local292 = this.aClass6_Sub1_Sub4_8.method413();
							local1411 = Class35.method389(local292);
							if (local1411 != null && local1411.anInt687 == 0) {
								if (local205 < 0) {
									local205 = 0;
								}
								if (local205 > local1411.anInt664 - local1411.anInt667) {
									local205 = local1411.anInt664 - local1411.anInt667;
								}
								local1411.anInt666 = local205;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 85) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							local292 = this.aClass6_Sub1_Sub4_8.method438();
							local212 = this.aClass6_Sub1_Sub4_8.method438();
							local214 = this.aClass6_Sub1_Sub4_8.method413();
							Class35.method389(local205).anInt672 = local292;
							Class35.method389(local205).anInt673 = local212;
							Class35.method389(local205).anInt671 = local214;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 4) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							if (local205 == 65535) {
								local205 = -1;
							}
							if (local205 != this.anInt939 && this.aBoolean239 && !aBoolean252 && this.anInt1004 == 0) {
								this.anInt907 = local205;
								this.aBoolean241 = true;
								this.aClass22_Sub1_1.method283(2, this.anInt907);
							}
							this.anInt939 = local205;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 233) {
							local205 = this.aClass6_Sub1_Sub4_8.method442();
							local292 = this.aClass6_Sub1_Sub4_8.method413();
							if (this.aBoolean239 && !aBoolean252) {
								this.anInt907 = local292;
								this.aBoolean241 = false;
								this.aClass22_Sub1_1.method283(2, this.anInt907);
								this.anInt1004 = local205;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 102) {
							this.anInt1083 = this.aClass6_Sub1_Sub4_8.method430();
							this.anInt1084 = this.aClass6_Sub1_Sub4_8.method431();
							this.anInt1014 = -1;
							return true;
						}
						@Pc(2428) long local2428;
						if (this.anInt1014 == 97) {
							local2428 = this.aClass6_Sub1_Sub4_8.method417();
							local212 = this.aClass6_Sub1_Sub4_8.method416();
							local214 = this.aClass6_Sub1_Sub4_8.method411();
							local2063 = false;
							for (local513 = 0; local513 < 100; local513++) {
								if (this.anIntArray268[local513] == local212) {
									local2063 = true;
									break;
								}
							}
							if (local214 <= 1) {
								for (local796 = 0; local796 < this.anInt1009; local796++) {
									if (this.aLongArray3[local796] == local2428) {
										local2063 = true;
										break;
									}
								}
							}
							if (!local2063 && this.anInt883 == 0) {
								try {
									this.anIntArray268[this.anInt1069] = local212;
									this.anInt1069 = (this.anInt1069 + 1) % 100;
									local2198 = Class50.method545(this.aClass6_Sub1_Sub4_8, this.anInt1013 - 13);
									if (local214 != 3) {
										local2198 = Class44.method479(local2198);
									}
									if (local214 == 2 || local214 == 3) {
										this.method707(local2198, 7, "@cr2@" + Class38.method457(Class38.method454(local2428)));
									} else if (local214 == 1) {
										this.method707(local2198, 7, "@cr1@" + Class38.method457(Class38.method454(local2428)));
									} else {
										this.method707(local2198, 3, Class38.method457(Class38.method454(local2428)));
									}
								} catch (@Pc(2571) Exception local2571) {
									signlink.reporterror("cde1");
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 119) {
							local205 = this.aClass6_Sub1_Sub4_8.method411();
							local292 = this.aClass6_Sub1_Sub4_8.method411();
							local212 = this.aClass6_Sub1_Sub4_8.method411();
							local214 = this.aClass6_Sub1_Sub4_8.method411();
							this.aBooleanArray12[local205] = true;
							this.anIntArray269[local205] = local292;
							this.anIntArray237[local205] = local212;
							this.anIntArray235[local205] = local214;
							this.anIntArray251[local205] = 0;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 69 || this.anInt1014 == 194 || this.anInt1014 == 1 || this.anInt1014 == 173 || this.anInt1014 == 137 || this.anInt1014 == 100 || this.anInt1014 == 220 || this.anInt1014 == 51 || this.anInt1014 == 128 || this.anInt1014 == 57 || this.anInt1014 == 241) {
							this.method677(this.aClass6_Sub1_Sub4_8, this.anInt1014);
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 124) {
							local205 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							this.method717(local205);
							if (this.anInt911 != -1) {
								this.method589(this.anInt911);
								this.anInt911 = -1;
								this.aBoolean253 = true;
								this.aBoolean263 = true;
							}
							if (this.anInt1006 != -1) {
								this.method589(this.anInt1006);
								this.anInt1006 = -1;
								this.aBoolean259 = true;
							}
							if (this.anInt864 != -1) {
								this.method589(this.anInt864);
								this.anInt864 = -1;
							}
							if (this.anInt985 != -1) {
								this.method589(this.anInt985);
								this.anInt985 = -1;
							}
							if (this.anInt1030 != local205) {
								this.method589(this.anInt1030);
								this.anInt1030 = local205;
							}
							this.aBoolean237 = false;
							this.aBoolean246 = true;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 200) {
							this.aBoolean253 = true;
							local205 = this.aClass6_Sub1_Sub4_8.method430();
							local292 = this.aClass6_Sub1_Sub4_8.method431();
							local212 = this.aClass6_Sub1_Sub4_8.method444();
							this.anIntArray252[local205] = local212;
							this.anIntArray253[local205] = local292;
							this.anIntArray244[local205] = 1;
							for (local214 = 0; local214 < 98; local214++) {
								if (local212 >= anIntArray263[local214]) {
									this.anIntArray244[local205] = local214 + 2;
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 217) {
							local205 = this.aClass6_Sub1_Sub4_8.method441();
							if (local205 >= 0) {
								this.method717(local205);
							}
							if (local205 != this.anInt990) {
								this.method589(this.anInt990);
								this.anInt990 = local205;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 174) {
							for (local205 = 0; local205 < this.anIntArray236.length; local205++) {
								if (this.anIntArray236[local205] != this.anIntArray222[local205]) {
									this.anIntArray236[local205] = this.anIntArray222[local205];
									this.method671(local205, this.aByte35);
									this.aBoolean253 = true;
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 236) {
							this.anInt945 = this.aClass6_Sub1_Sub4_8.method429();
							if (this.anInt945 == this.anInt1071) {
								if (this.anInt945 == 3) {
									this.anInt1071 = 1;
								} else {
									this.anInt1071 = 3;
								}
								this.aBoolean253 = true;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 208) {
							this.method643(this.anInt1013, this.aClass6_Sub1_Sub4_8);
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 136) {
							this.anInt1083 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1084 = this.aClass6_Sub1_Sub4_8.method431();
							while (this.aClass6_Sub1_Sub4_8.anInt704 < this.anInt1013) {
								local205 = this.aClass6_Sub1_Sub4_8.method411();
								this.method677(this.aClass6_Sub1_Sub4_8, local205);
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 120) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							@Pc(3024) boolean local3024 = this.aClass6_Sub1_Sub4_8.method431() == 1;
							Class35.method389(local205).aBoolean168 = local3024;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 167) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							local292 = this.aClass6_Sub1_Sub4_8.method411();
							local212 = this.aClass6_Sub1_Sub4_8.method413();
							if (local212 == 65535) {
								if (this.anInt925 < 50) {
									this.anIntArray262[this.anInt925] = (short) local205;
									this.anIntArray250[this.anInt925] = local292;
									this.anIntArray212[this.anInt925] = 0;
									this.anInt925++;
								}
							} else if (this.aBoolean274 && !aBoolean252 && this.anInt925 < 50) {
								this.anIntArray262[this.anInt925] = local205;
								this.anIntArray250[this.anInt925] = local292;
								this.anIntArray212[this.anInt925] = local212 + Class13.anIntArray42[local205];
								this.anInt925++;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 58) {
							this.aBoolean231 = true;
							this.anInt1074 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1075 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1076 = this.aClass6_Sub1_Sub4_8.method413();
							this.anInt1077 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1078 = this.aClass6_Sub1_Sub4_8.method411();
							if (this.anInt1078 >= 100) {
								local205 = this.anInt1074 * 128 + 64;
								local292 = this.anInt1075 * 128 + 64;
								local212 = this.method595(local205, local292, this.anInt989) - this.anInt1076;
								local214 = local205 - this.anInt1031;
								local220 = local212 - this.anInt1032;
								local513 = local292 - this.anInt1033;
								local796 = (int) Math.sqrt((double) (local214 * local214 + local513 * local513));
								this.anInt1034 = (int) (Math.atan2((double) local220, (double) local796) * 325.949D) & 0x7FF;
								this.anInt1035 = (int) (Math.atan2((double) local214, (double) local513) * -325.949D) & 0x7FF;
								if (this.anInt1034 < 128) {
									this.anInt1034 = 128;
								}
								if (this.anInt1034 > 383) {
									this.anInt1034 = 383;
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 132) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							this.method717(local205);
							if (this.anInt1030 != -1) {
								this.method589(this.anInt1030);
								this.anInt1030 = -1;
								this.aBoolean246 = true;
							}
							if (this.anInt1006 != -1) {
								this.method589(this.anInt1006);
								this.anInt1006 = -1;
								this.aBoolean259 = true;
							}
							if (this.anInt864 != -1) {
								this.method589(this.anInt864);
								this.anInt864 = -1;
							}
							if (this.anInt985 != -1) {
								this.method589(this.anInt985);
								this.anInt985 = -1;
							}
							if (this.anInt911 != local205) {
								this.method589(this.anInt911);
								this.anInt911 = local205;
							}
							if (this.anInt1010 != 0) {
								this.anInt1010 = 0;
								this.aBoolean246 = true;
							}
							this.aBoolean253 = true;
							this.aBoolean263 = true;
							this.aBoolean237 = false;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 10) {
							this.anInt1050 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892) * 30;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 175) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							local292 = this.aClass6_Sub1_Sub4_8.method438();
							Class35.method389(local205).anInt685 = 1;
							Class35.method389(local205).anInt686 = local292;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 245) {
							if (this.anInt1071 == 12) {
								this.aBoolean253 = true;
							}
							this.anInt1080 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 239) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							local2058 = this.aClass6_Sub1_Sub4_8.method418();
							Class35.method389(local205).aString11 = local2058;
							@Pc(3445) int local3445 = this.anIntArray276[this.anInt1071];
							if (Class35.method389(local205).anInt663 == local3445) {
								this.aBoolean253 = true;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 39) {
							this.anInt960 = this.aClass6_Sub1_Sub4_8.method438();
							this.anInt968 = this.aClass6_Sub1_Sub4_8.method438();
							this.anInt1057 = this.aClass6_Sub1_Sub4_8.method437();
							this.anInt1011 = this.aClass6_Sub1_Sub4_8.method413();
							this.anInt1089 = this.aClass6_Sub1_Sub4_8.method438();
							this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							this.anInt940 = this.aClass6_Sub1_Sub4_8.method444();
							this.anInt924 = this.aClass6_Sub1_Sub4_8.method413();
							this.anInt1079 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							this.anInt952 = this.aClass6_Sub1_Sub4_8.method437();
							this.aClass6_Sub1_Sub4_8.method430();
							signlink.dnslookup(Class38.method456(this.anInt940, this.aByte36));
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 9) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							local292 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							this.method717(local205);
							if (local292 != -1) {
								this.method717(local292);
							}
							if (this.anInt985 != -1) {
								this.method589(this.anInt985);
								this.anInt985 = -1;
							}
							if (this.anInt911 != -1) {
								this.method589(this.anInt911);
								this.anInt911 = -1;
							}
							if (this.anInt1030 != -1) {
								this.method589(this.anInt1030);
								this.anInt1030 = -1;
							}
							if (this.anInt1006 != local205) {
								this.method589(this.anInt1006);
								this.anInt1006 = local205;
							}
							if (this.anInt864 != local205) {
								this.method589(this.anInt864);
								this.anInt864 = local292;
							}
							this.anInt1010 = 0;
							this.aBoolean237 = false;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 98) {
							this.anInt932 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt980 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1025 = this.aClass6_Sub1_Sub4_8.method411();
							this.aBoolean233 = true;
							this.aBoolean246 = true;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 255) {
							local205 = this.aClass6_Sub1_Sub4_8.method437();
							this.method717(local205);
							if (this.anInt911 != -1) {
								this.method589(this.anInt911);
								this.anInt911 = -1;
								this.aBoolean253 = true;
								this.aBoolean263 = true;
							}
							if (this.anInt1030 != -1) {
								this.method589(this.anInt1030);
								this.anInt1030 = -1;
								this.aBoolean246 = true;
							}
							if (this.anInt1006 != -1) {
								this.method589(this.anInt1006);
								this.anInt1006 = -1;
								this.aBoolean259 = true;
							}
							if (this.anInt864 != -1) {
								this.method589(this.anInt864);
								this.anInt864 = -1;
							}
							if (this.anInt985 != local205) {
								this.method589(this.anInt985);
								this.anInt985 = local205;
							}
							if (this.anInt1010 != 0) {
								this.anInt1010 = 0;
								this.aBoolean246 = true;
							}
							this.aBoolean237 = false;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 29) {
							this.anInt1038 = 0;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 179) {
							for (local205 = 0; local205 < this.aClass6_Sub1_Sub2_Sub3_Sub1Array1.length; local205++) {
								if (this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local205] != null) {
									this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local205].anInt529 = -1;
								}
							}
							for (local292 = 0; local292 < this.aClass6_Sub1_Sub2_Sub3_Sub2Array1.length; local292++) {
								if (this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local292] != null) {
									this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local292].anInt529 = -1;
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 109) {
							local205 = this.aClass6_Sub1_Sub4_8.method437();
							local292 = this.aClass6_Sub1_Sub4_8.method444();
							this.anIntArray222[local205] = local292;
							if (this.anIntArray236[local205] != local292) {
								this.anIntArray236[local205] = local292;
								this.method671(local205, this.aByte35);
								this.aBoolean253 = true;
								if (this.anInt981 != -1) {
									this.aBoolean246 = true;
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 24) {
							local2428 = this.aClass6_Sub1_Sub4_8.method417();
							local212 = this.aClass6_Sub1_Sub4_8.method411();
							@Pc(3893) String local3893 = Class38.method457(Class38.method454(local2428));
							for (local220 = 0; local220 < this.anInt1023; local220++) {
								if (local2428 == this.aLongArray4[local220]) {
									if (this.anIntArray227[local220] != local212) {
										this.anIntArray227[local220] = local212;
										this.aBoolean253 = true;
										if (local212 > 0) {
											this.method707(local3893 + " has logged in.", 5, "");
										}
										if (local212 == 0) {
											this.method707(local3893 + " has logged out.", 5, "");
										}
									}
									local3893 = null;
									break;
								}
							}
							if (local3893 != null && this.anInt1023 < 200) {
								this.aLongArray4[this.anInt1023] = local2428;
								this.aStringArray14[this.anInt1023] = local3893;
								this.anIntArray227[this.anInt1023] = local212;
								this.anInt1023++;
								this.aBoolean253 = true;
							}
							@Pc(3991) boolean local3991 = false;
							while (!local3991) {
								local3991 = true;
								for (local796 = 0; local796 < this.anInt1023 - 1; local796++) {
									if (this.anIntArray227[local796] != anInt956 && this.anIntArray227[local796 + 1] == anInt956 || this.anIntArray227[local796] == 0 && this.anIntArray227[local796 + 1] != 0) {
										local817 = this.anIntArray227[local796];
										this.anIntArray227[local796] = this.anIntArray227[local796 + 1];
										this.anIntArray227[local796 + 1] = local817;
										@Pc(4052) String local4052 = this.aStringArray14[local796];
										this.aStringArray14[local796] = this.aStringArray14[local796 + 1];
										this.aStringArray14[local796 + 1] = local4052;
										@Pc(4074) long local4074 = this.aLongArray4[local796];
										this.aLongArray4[local796] = this.aLongArray4[local796 + 1];
										this.aLongArray4[local796 + 1] = local4074;
										this.aBoolean253 = true;
										local3991 = false;
									}
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 6) {
							local205 = this.aClass6_Sub1_Sub4_8.method414();
							if (local205 != this.anInt981) {
								this.method589(this.anInt981);
								this.anInt981 = local205;
							}
							this.aBoolean246 = true;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 96) {
							this.aBoolean253 = true;
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							local208 = Class35.method389(local205);
							while (this.aClass6_Sub1_Sub4_8.anInt704 < this.anInt1013) {
								local212 = this.aClass6_Sub1_Sub4_8.method425();
								local214 = this.aClass6_Sub1_Sub4_8.method413();
								local220 = this.aClass6_Sub1_Sub4_8.method411();
								if (local220 == 255) {
									local220 = this.aClass6_Sub1_Sub4_8.method416();
								}
								if (local212 >= 0 && local212 < local208.anIntArray185.length) {
									local208.anIntArray185[local212] = local214;
									local208.anIntArray184[local212] = local220;
								}
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 247) {
							local205 = this.aClass6_Sub1_Sub4_8.method437();
							local292 = this.aClass6_Sub1_Sub4_8.method413();
							local212 = this.aClass6_Sub1_Sub4_8.method437();
							if (local205 == 65535) {
								Class35.method389(local292).anInt685 = 0;
								this.anInt1014 = -1;
								return true;
							}
							@Pc(4234) Class4 local4234 = Class4.method22(local205);
							Class35.method389(local292).anInt685 = 4;
							Class35.method389(local292).anInt686 = local205;
							Class35.method389(local292).anInt672 = local4234.anInt36;
							Class35.method389(local292).anInt673 = local4234.anInt47;
							Class35.method389(local292).anInt671 = local4234.anInt25 * 100 / local212;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 76) {
							if (this.anInt911 != -1) {
								this.method589(this.anInt911);
								this.anInt911 = -1;
								this.aBoolean253 = true;
								this.aBoolean263 = true;
							}
							if (this.anInt1030 != -1) {
								this.method589(this.anInt1030);
								this.anInt1030 = -1;
								this.aBoolean246 = true;
							}
							if (this.anInt1006 != -1) {
								this.method589(this.anInt1006);
								this.anInt1006 = -1;
								this.aBoolean259 = true;
							}
							if (this.anInt864 != -1) {
								this.method589(this.anInt864);
								this.anInt864 = -1;
							}
							if (this.anInt985 != -1) {
								this.method589(this.anInt985);
								this.anInt985 = -1;
							}
							if (this.anInt1010 != 0) {
								this.anInt1010 = 0;
								this.aBoolean246 = true;
							}
							this.aBoolean237 = false;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 243) {
							local205 = this.aClass6_Sub1_Sub4_8.method413();
							local292 = this.aClass6_Sub1_Sub4_8.method438();
							local212 = this.aClass6_Sub1_Sub4_8.method437();
							Class35.method389(local292).anInt684 = (local205 << 16) + local212;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 41) {
							this.aBoolean231 = false;
							for (local205 = 0; local205 < 5; local205++) {
								this.aBooleanArray12[local205] = false;
							}
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 64) {
							this.anInt1024 = this.aClass6_Sub1_Sub4_8.method411();
							this.aBoolean253 = true;
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 113) {
							this.anInt898 = this.aClass6_Sub1_Sub4_8.method411();
							this.anInt1014 = -1;
							return true;
						}
						if (this.anInt1014 == 246) {
							local205 = this.aClass6_Sub1_Sub4_8.method440();
							local292 = this.aClass6_Sub1_Sub4_8.method439(this.anInt892);
							local212 = this.aClass6_Sub1_Sub4_8.method441();
							@Pc(4469) Class35 local4469 = Class35.method389(local292);
							local4469.anInt681 = local212;
							local4469.anInt654 = local205;
							this.anInt1014 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt1014 + "," + this.anInt1013 + " - " + this.anInt920 + "," + this.anInt921);
						this.method644((byte) 9);
						return true;
					}
					local205 = this.aClass6_Sub1_Sub4_8.method413();
					local292 = this.aClass6_Sub1_Sub4_8.method431();
					if (local205 == 65535) {
						local205 = -1;
					}
					if (this.anIntArray276[local292] != local205) {
						this.method589(this.anIntArray276[local292]);
						this.anIntArray276[local292] = local205;
					}
					this.aBoolean253 = true;
					this.aBoolean263 = true;
					this.anInt1014 = -1;
					return true;
				}
				local205 = this.anInt974;
				local292 = this.anInt975;
				if (this.anInt1014 == 121) {
					local292 = this.aClass6_Sub1_Sub4_8.method437();
					local205 = this.aClass6_Sub1_Sub4_8.method438();
					this.aBoolean255 = false;
				}
				if (this.anInt1014 == 30) {
					this.aClass6_Sub1_Sub4_8.method421(this.anInt923);
					local212 = 0;
					while (true) {
						if (local212 >= 4) {
							this.aClass6_Sub1_Sub4_8.method423();
							local292 = this.aClass6_Sub1_Sub4_8.method413();
							local205 = this.aClass6_Sub1_Sub4_8.method437();
							this.aBoolean255 = true;
							break;
						}
						for (local214 = 0; local214 < 13; local214++) {
							for (local220 = 0; local220 < 13; local220++) {
								local513 = this.aClass6_Sub1_Sub4_8.method422(1);
								if (local513 == 1) {
									this.anIntArrayArrayArray7[local212][local214][local220] = this.aClass6_Sub1_Sub4_8.method422(26);
								} else {
									this.anIntArrayArrayArray7[local212][local214][local220] = -1;
								}
							}
						}
						local212++;
					}
				}
				if (this.anInt974 == local205 && this.anInt975 == local292 && this.anInt1028 == 2) {
					this.anInt1014 = -1;
					return true;
				}
				this.anInt974 = local205;
				this.anInt975 = local292;
				this.anInt928 = (this.anInt974 - 6) * 8;
				this.anInt929 = (this.anInt975 - 6) * 8;
				this.aBoolean260 = false;
				if ((this.anInt974 / 8 == 48 || this.anInt974 / 8 == 49) && this.anInt975 / 8 == 48) {
					this.aBoolean260 = true;
				}
				if (this.anInt974 / 8 == 48 && this.anInt975 / 8 == 148) {
					this.aBoolean260 = true;
				}
				this.anInt1028 = 1;
				this.aLong31 = System.currentTimeMillis();
				this.method645(null, "Loading - please wait.");
				if (this.anInt1014 == 121) {
					local212 = 0;
					local214 = (this.anInt974 - 6) / 8;
					label1228: while (true) {
						if (local214 > (this.anInt974 + 6) / 8) {
							this.aByteArrayArray6 = new byte[local212][];
							this.aByteArrayArray5 = new byte[local212][];
							this.anIntArray232 = new int[local212];
							this.anIntArray233 = new int[local212];
							this.anIntArray234 = new int[local212];
							local212 = 0;
							local220 = (this.anInt974 - 6) / 8;
							while (true) {
								if (local220 > (this.anInt974 + 6) / 8) {
									break label1228;
								}
								for (local513 = (this.anInt975 - 6) / 8; local513 <= (this.anInt975 + 6) / 8; local513++) {
									this.anIntArray232[local212] = (local220 << 8) + local513;
									if (this.aBoolean260 && (local513 == 49 || local513 == 149 || local513 == 147 || local220 == 50 || local220 == 49 && local513 == 47)) {
										this.anIntArray233[local212] = -1;
										this.anIntArray234[local212] = -1;
										local212++;
									} else {
										local796 = this.anIntArray233[local212] = this.aClass22_Sub1_1.method298(local513, local220, 0);
										if (local796 != -1) {
											this.aClass22_Sub1_1.method283(3, local796);
										}
										local817 = this.anIntArray234[local212] = this.aClass22_Sub1_1.method298(local513, local220, 1);
										if (local817 != -1) {
											this.aClass22_Sub1_1.method283(3, local817);
										}
										local212++;
									}
								}
								local220++;
							}
						}
						for (local220 = (this.anInt975 - 6) / 8; local220 <= (this.anInt975 + 6) / 8; local220++) {
							local212++;
						}
						local214++;
					}
				}
				if (this.anInt1014 == 30) {
					local212 = 0;
					@Pc(853) int[] local853 = new int[676];
					local220 = 0;
					label1189: while (true) {
						@Pc(883) int local883;
						@Pc(889) int local889;
						@Pc(899) int local899;
						if (local220 >= 4) {
							this.aByteArrayArray6 = new byte[local212][];
							this.aByteArrayArray5 = new byte[local212][];
							this.anIntArray232 = new int[local212];
							this.anIntArray233 = new int[local212];
							this.anIntArray234 = new int[local212];
							local513 = 0;
							while (true) {
								if (local513 >= local212) {
									break label1189;
								}
								local796 = this.anIntArray232[local513] = local853[local513];
								local817 = local796 >> 8 & 0xFF;
								local883 = local796 & 0xFF;
								local889 = this.anIntArray233[local513] = this.aClass22_Sub1_1.method298(local883, local817, 0);
								if (local889 != -1) {
									this.aClass22_Sub1_1.method283(3, local889);
								}
								local899 = this.anIntArray234[local513] = this.aClass22_Sub1_1.method298(local883, local817, 1);
								if (local899 != -1) {
									this.aClass22_Sub1_1.method283(3, local899);
								}
								local513++;
							}
						}
						for (local513 = 0; local513 < 13; local513++) {
							for (local796 = 0; local796 < 13; local796++) {
								local817 = this.anIntArrayArrayArray7[local220][local513][local796];
								if (local817 != -1) {
									local883 = local817 >> 14 & 0x3FF;
									local889 = local817 >> 3 & 0x7FF;
									local899 = (local883 / 8 << 8) + local889 / 8;
									for (@Pc(901) int local901 = 0; local901 < local212; local901++) {
										if (local853[local901] == local899) {
											local899 = -1;
											break;
										}
									}
									if (local899 != -1) {
										local853[local212++] = local899;
									}
								}
							}
						}
						local220++;
					}
				}
				local212 = this.anInt928 - this.anInt930;
				local214 = this.anInt929 - this.anInt931;
				this.anInt930 = this.anInt928;
				this.anInt931 = this.anInt929;
				for (local220 = 0; local220 < 16384; local220++) {
					@Pc(1054) Class6_Sub1_Sub2_Sub3_Sub2 local1054 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local220];
					if (local1054 != null) {
						for (local796 = 0; local796 < 10; local796++) {
							local1054.anIntArray142[local796] -= local212;
							local1054.anIntArray143[local796] -= local214;
						}
						local1054.anInt535 -= local212 * 128;
						local1054.anInt536 -= local214 * 128;
					}
				}
				for (local513 = 0; local513 < this.anInt870; local513++) {
					@Pc(1109) Class6_Sub1_Sub2_Sub3_Sub1 local1109 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local513];
					if (local1109 != null) {
						for (local817 = 0; local817 < 10; local817++) {
							local1109.anIntArray142[local817] -= local212;
							local1109.anIntArray143[local817] -= local214;
						}
						local1109.anInt535 -= local212 * 128;
						local1109.anInt536 -= local214 * 128;
					}
				}
				this.aBoolean262 = true;
				@Pc(1161) byte local1161 = 0;
				@Pc(1163) byte local1163 = 104;
				@Pc(1165) byte local1165 = 1;
				if (local212 < 0) {
					local1161 = 103;
					local1163 = -1;
					local1165 = -1;
				}
				@Pc(1175) byte local1175 = 0;
				@Pc(1177) byte local1177 = 104;
				@Pc(1179) byte local1179 = 1;
				if (local214 < 0) {
					local1175 = 103;
					local1177 = -1;
					local1179 = -1;
				}
				for (@Pc(1189) int local1189 = local1161; local1189 != local1163; local1189 += local1165) {
					for (@Pc(1193) int local1193 = local1175; local1193 != local1177; local1193 += local1179) {
						@Pc(1199) int local1199 = local1189 + local212;
						@Pc(1203) int local1203 = local1193 + local214;
						for (@Pc(1205) int local1205 = 0; local1205 < 4; local1205++) {
							if (local1199 >= 0 && local1203 >= 0 && local1199 < 104 && local1203 < 104) {
								this.aClass5ArrayArrayArray1[local1205][local1189][local1193] = this.aClass5ArrayArrayArray1[local1205][local1199][local1203];
							} else {
								this.aClass5ArrayArrayArray1[local1205][local1189][local1193] = null;
							}
						}
					}
				}
				for (@Pc(1267) Class6_Sub2 local1267 = (Class6_Sub2) this.aClass5_10.method33(); local1267 != null; local1267 = (Class6_Sub2) this.aClass5_10.method35((byte) 8)) {
					local1267.anInt169 -= local212;
					local1267.anInt170 -= local214;
					if (local1267.anInt169 < 0 || local1267.anInt170 < 0 || local1267.anInt169 >= 104 || local1267.anInt170 >= 104) {
						local1267.method548();
					}
				}
				if (this.anInt1038 != 0) {
					this.anInt1038 -= local212;
					this.anInt1039 -= local214;
				}
				this.aBoolean231 = false;
				this.anInt1014 = -1;
				return true;
			} catch (@Pc(4509) IOException local4509) {
				this.method607();
			} catch (@Pc(4514) Exception local4514) {
				local1846 = "T2 - " + this.anInt1014 + "," + this.anInt920 + "," + this.anInt921 + " - " + this.anInt1013 + "," + (this.anInt928 + aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0]) + "," + (this.anInt929 + aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0]) + " - ";
				for (local292 = 0; local292 < this.anInt1013 && local292 < 50; local292++) {
					local1846 = local1846 + this.aClass6_Sub1_Sub4_8.aByteArray17[local292] + ",";
				}
				signlink.reporterror(local1846);
				this.method644((byte) 9);
			}
			return true;
		} catch (@Pc(4595) RuntimeException local4595) {
			signlink.reporterror("49285, " + 0 + ", " + local4595.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!WGRALUSQ;)V")
	private void method610(@OriginalArg(1) Class6_Sub1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray229.length; local16++) {
				this.anIntArray229[local16] = 0;
			}
			@Pc(41) int local41;
			for (@Pc(31) int local31 = 0; local31 < 5000; local31++) {
				local41 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray229[local41] = (int) (Math.random() * 256.0D);
			}
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(71) int local71;
			for (local41 = 0; local41 < 20; local41++) {
				for (local59 = 1; local59 < 255; local59++) {
					for (local63 = 1; local63 < 127; local63++) {
						local71 = local63 + (local59 << 7);
						this.anIntArray230[local71] = (this.anIntArray229[local71 - 1] + this.anIntArray229[local71 + 1] + this.anIntArray229[local71 - 128] + this.anIntArray229[local71 + 128]) / 4;
					}
				}
				@Pc(117) int[] local117 = this.anIntArray229;
				this.anIntArray229 = this.anIntArray230;
				this.anIntArray230 = local117;
			}
			if (arg0 != null) {
				local59 = 0;
				for (local63 = 0; local63 < arg0.anInt780; local63++) {
					for (local71 = 0; local71 < arg0.anInt779; local71++) {
						if (arg0.aByteArray19[local59++] != 0) {
							@Pc(153) int local153 = local71 + arg0.anInt781 + 16;
							@Pc(160) int local160 = local63 + arg0.anInt782 + 16;
							@Pc(166) int local166 = local153 + (local160 << 7);
							this.anIntArray229[local166] = 0;
						}
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("58133, " + 6718 + ", " + arg0 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!QUBPQDMQ;)I")
	private int method611(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1) {
		try {
			if (this.aByte38 != 60) {
				return this.anInt943;
			} else if (arg1.anIntArrayArray19 == null || arg0 >= arg1.anIntArrayArray19.length) {
				return -2;
			} else {
				try {
					@Pc(23) int[] local23 = arg1.anIntArrayArray19[arg0];
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
							local36 = this.anIntArray253[local23[local27++]];
						}
						if (local34 == 2) {
							local36 = this.anIntArray244[local23[local27++]];
						}
						if (local34 == 3) {
							local36 = this.anIntArray252[local23[local27++]];
						}
						@Pc(84) Class35 local84;
						@Pc(89) int local89;
						@Pc(102) int local102;
						if (local34 == 4) {
							local84 = Class35.method389(local23[local27++]);
							local89 = local23[local27++];
							if (local89 >= 0 && local89 < Class4.anInt31 && (!Class4.method22(local89).aBoolean5 || aBoolean251)) {
								for (local102 = 0; local102 < local84.anIntArray185.length; local102++) {
									if (local84.anIntArray185[local102] == local89 + 1) {
										local36 += local84.anIntArray184[local102];
									}
								}
							}
						}
						if (local34 == 5) {
							local36 = this.anIntArray236[local23[local27++]];
						}
						if (local34 == 6) {
							local36 = anIntArray263[this.anIntArray244[local23[local27++]] - 1];
						}
						if (local34 == 7) {
							local36 = this.anIntArray236[local23[local27++]] * 100 / 46875;
						}
						if (local34 == 8) {
							local36 = aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt305;
						}
						@Pc(177) int local177;
						if (local34 == 9) {
							for (local177 = 0; local177 < Class40.anInt724; local177++) {
								if (Class40.aBooleanArray10[local177]) {
									local36 += this.anIntArray244[local177];
								}
							}
						}
						if (local34 == 10) {
							local84 = Class35.method389(local23[local27++]);
							local89 = local23[local27++] + 1;
							if (local89 >= 0 && local89 < Class4.anInt31 && (!Class4.method22(local89).aBoolean5 || aBoolean251)) {
								for (local102 = 0; local102 < local84.anIntArray185.length; local102++) {
									if (local84.anIntArray185[local102] == local89) {
										local36 = 999999999;
										break;
									}
								}
							}
						}
						if (local34 == 11) {
							local36 = this.anInt1080;
						}
						if (local34 == 12) {
							local36 = this.anInt1000;
						}
						if (local34 == 13) {
							local177 = this.anIntArray236[local23[local27++]];
							local89 = local23[local27++];
							local36 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
						}
						if (local34 == 14) {
							local177 = local23[local27++];
							@Pc(291) Class7 local291 = Class7.aClass7Array1[local177];
							local102 = local291.anInt90;
							@Pc(297) int local297 = local291.anInt91;
							@Pc(300) int local300 = local291.anInt92;
							@Pc(306) int local306 = anIntArray225[local300 - local297];
							local36 = this.anIntArray236[local102] >> local297 & local306;
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
							local36 = (aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 >> 7) + this.anInt928;
						}
						if (local34 == 19) {
							local36 = (aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 >> 7) + this.anInt929;
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
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("18289, " + arg0 + ", " + 60 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method612() {
		try {
			@Pc(7) byte[] local7 = this.aClass11_2.method89("title.dat", null);
			@Pc(13) Class6_Sub1_Sub1_Sub4 local13 = new Class6_Sub1_Sub1_Sub4(local7, this);
			this.aClass15_10.method121();
			local13.method565(0, 0);
			this.aClass15_11.method121();
			local13.method565(-637, 0);
			this.aClass15_7.method121();
			local13.method565(-128, 0);
			this.aClass15_8.method121();
			local13.method565(-202, -371);
			this.aClass15_9.method121();
			local13.method565(-202, -171);
			this.aClass15_12.method121();
			local13.method565(0, -265);
			this.aClass15_13.method121();
			local13.method565(-562, -265);
			this.aClass15_14.method121();
			local13.method565(-128, -171);
			this.aClass15_15.method121();
			local13.method565(-562, -171);
			@Pc(106) int[] local106 = new int[local13.anInt834];
			for (@Pc(108) int local108 = 0; local108 < local13.anInt835; local108++) {
				for (@Pc(112) int local112 = 0; local112 < local13.anInt834; local112++) {
					local106[local112] = local13.anIntArray209[local13.anInt834 + local13.anInt834 * local108 - local112 - 1];
				}
				for (@Pc(138) int local138 = 0; local138 < local13.anInt834; local138++) {
					local13.anIntArray209[local138 + local13.anInt834 * local108] = local106[local138];
				}
			}
			this.aClass15_10.method121();
			local13.method565(382, 0);
			this.aClass15_11.method121();
			local13.method565(-255, 0);
			this.aClass15_7.method121();
			local13.method565(254, 0);
			this.aClass15_8.method121();
			local13.method565(180, -371);
			this.aClass15_9.method121();
			local13.method565(180, -171);
			this.aClass15_12.method121();
			local13.method565(382, -265);
			this.aClass15_13.method121();
			local13.method565(-180, -265);
			this.aClass15_14.method121();
			local13.method565(254, -171);
			this.aClass15_15.method121();
			local13.method565(-180, -171);
			local13 = new Class6_Sub1_Sub1_Sub4(this.aClass11_2, "logo", 0);
			this.aClass15_7.method121();
			local13.method567(382 - local13.anInt834 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("98040, " + -21339 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RGCGKKUR;IB)V")
	private void method614(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt873; local7++) {
				@Pc(14) int local14 = this.anIntArray224[local7];
				@Pc(19) Class6_Sub1_Sub2_Sub3_Sub2 local19 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local14];
				@Pc(22) int local22 = arg0.method411();
				if ((local22 & 0x40) != 0) {
					local19.anInt560 = arg0.method439(this.anInt892);
					local19.anInt561 = arg0.method437();
				}
				@Pc(44) int local44;
				@Pc(48) int local48;
				if ((local22 & 0x10) != 0) {
					local44 = arg0.method411();
					local48 = arg0.method431();
					local19.method307(anInt936, local44, local48);
					local19.anInt513 = anInt936 + 300;
					local19.anInt514 = arg0.method411();
					local19.anInt515 = arg0.method431();
				}
				if ((local22 & 0x4) != 0) {
					local19.aClass47_2 = Class47.method542(arg0.method437());
					local19.anInt526 = local19.aClass47_2.aByte23;
					local19.anInt527 = local19.aClass47_2.anInt800;
					local19.anInt555 = local19.aClass47_2.anInt807;
					local19.anInt556 = local19.aClass47_2.anInt790;
					local19.anInt557 = local19.aClass47_2.anInt805;
					local19.anInt558 = local19.aClass47_2.anInt802;
					local19.anInt551 = local19.aClass47_2.anInt808;
				}
				if ((local22 & 0x80) != 0) {
					local19.anInt534 = arg0.method413();
					if (local19.anInt534 == 65535) {
						local19.anInt534 = -1;
					}
				}
				if ((local22 & 0x8) != 0) {
					local44 = arg0.method437();
					if (local44 == 65535) {
						local44 = -1;
					}
					local48 = arg0.method430();
					if (local44 == local19.anInt529 && local44 != -1) {
						@Pc(157) int local157 = Class21.aClass21Array1[local44].anInt351;
						if (local157 == 1) {
							local19.anInt530 = 0;
							local19.anInt531 = 0;
							local19.anInt532 = local48;
							local19.anInt533 = 0;
						}
						if (local157 == 2) {
							local19.anInt533 = 0;
						}
					} else if (local44 == -1 || local19.anInt529 == -1 || Class21.aClass21Array1[local44].anInt345 >= Class21.aClass21Array1[local19.anInt529].anInt345) {
						local19.anInt529 = local44;
						local19.anInt530 = 0;
						local19.anInt531 = 0;
						local19.anInt532 = local48;
						local19.anInt533 = 0;
						local19.anInt528 = local19.anInt523;
					}
				}
				if ((local22 & 0x1) != 0) {
					local19.aString8 = arg0.method418();
					local19.anInt542 = 100;
				}
				if ((local22 & 0x2) != 0) {
					local44 = arg0.method431();
					local48 = arg0.method411();
					local19.method307(anInt936, local44, local48);
					local19.anInt513 = anInt936 + 300;
					local19.anInt514 = arg0.method430();
					local19.anInt515 = arg0.method431();
				}
				if ((local22 & 0x20) != 0) {
					local19.anInt516 = arg0.method437();
					local44 = arg0.method445();
					local19.anInt520 = local44 >> 16;
					local19.anInt519 = anInt936 + (local44 & 0xFFFF);
					local19.anInt517 = 0;
					local19.anInt518 = 0;
					if (local19.anInt519 > anInt936) {
						local19.anInt517 = -1;
					}
					if (local19.anInt516 == 65535) {
						local19.anInt516 = -1;
					}
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("69135, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method615() {
		try {
			if (this.anInt1092 == 0) {
				this.aStringArray9[0] = "Cancel";
				this.anIntArray258[0] = 1033;
				this.anInt886 = 1;
				if (this.anInt1006 == -1) {
					this.method616((byte) 5);
					this.anInt1019 = 0;
					this.anInt927 = 0;
					if (super.anInt852 > 4 && super.anInt853 > 4 && super.anInt852 < 516 && super.anInt853 < 338) {
						if (this.anInt985 == -1) {
							this.method711(this.anInt879);
						} else {
							this.method713(super.anInt853, 4, 0, 4, 0, super.anInt852, Class35.method389(this.anInt985));
						}
					}
					if (this.anInt1019 != this.anInt887) {
						this.anInt887 = this.anInt1019;
					}
					if (this.anInt927 != this.anInt996) {
						this.anInt996 = this.anInt927;
					}
					this.anInt1019 = 0;
					this.anInt927 = 0;
					if (super.anInt852 > 553 && super.anInt853 > 205 && super.anInt852 < 743 && super.anInt853 < 466) {
						if (this.anInt911 != -1) {
							this.method713(super.anInt853, 553, 0, 205, 1, super.anInt852, Class35.method389(this.anInt911));
						} else if (this.anIntArray276[this.anInt1071] != -1) {
							this.method713(super.anInt853, 553, 0, 205, 1, super.anInt852, Class35.method389(this.anIntArray276[this.anInt1071]));
						}
					}
					if (this.anInt1019 != this.anInt997) {
						this.aBoolean253 = true;
						this.anInt997 = this.anInt1019;
					}
					if (this.anInt927 != this.anInt1058) {
						this.aBoolean253 = true;
						this.anInt1058 = this.anInt927;
					}
					this.anInt1019 = 0;
					this.anInt927 = 0;
					if (super.anInt852 > 17 && super.anInt853 > 357 && super.anInt852 < 496 && super.anInt853 < 453) {
						if (this.anInt1030 != -1) {
							this.method713(super.anInt853, 17, 0, 357, 2, super.anInt852, Class35.method389(this.anInt1030));
						} else if (this.anInt981 != -1) {
							this.method713(super.anInt853, 17, 0, 357, 3, super.anInt852, Class35.method389(this.anInt981));
						} else if (super.anInt853 < 434 && super.anInt852 < 426 && this.anInt1010 == 0) {
							this.method653(super.anInt853 - 357, (byte) 2, super.anInt852 - 17);
						}
					}
					if ((this.anInt1030 != -1 || this.anInt981 != -1) && this.anInt1019 != this.anInt1002) {
						this.aBoolean246 = true;
						this.anInt1002 = this.anInt1019;
					}
					if ((this.anInt1030 != -1 || this.anInt981 != -1) && this.anInt927 != this.anInt1060) {
						this.aBoolean246 = true;
						this.anInt1060 = this.anInt927;
					}
					@Pc(348) boolean local348 = false;
					while (!local348) {
						local348 = true;
						for (@Pc(354) int local354 = 0; local354 < this.anInt886 - 1; local354++) {
							if (this.anIntArray258[local354] < 1000 && this.anIntArray258[local354 + 1] > 1000) {
								@Pc(375) String local375 = this.aStringArray9[local354];
								this.aStringArray9[local354] = this.aStringArray9[local354 + 1];
								this.aStringArray9[local354 + 1] = local375;
								@Pc(397) int local397 = this.anIntArray258[local354];
								this.anIntArray258[local354] = this.anIntArray258[local354 + 1];
								this.anIntArray258[local354 + 1] = local397;
								@Pc(419) int local419 = this.anIntArray256[local354];
								this.anIntArray256[local354] = this.anIntArray256[local354 + 1];
								this.anIntArray256[local354 + 1] = local419;
								@Pc(441) int local441 = this.anIntArray257[local354];
								this.anIntArray257[local354] = this.anIntArray257[local354 + 1];
								this.anIntArray257[local354 + 1] = local441;
								@Pc(463) int local463 = this.anIntArray259[local354];
								this.anIntArray259[local354] = this.anIntArray259[local354 + 1];
								this.anIntArray259[local354 + 1] = local463;
								local348 = false;
							}
						}
					}
				} else {
					this.anInt1019 = 0;
					this.anInt927 = 0;
					this.method713(super.anInt853, 0, 0, 0, 0, super.anInt852, Class35.method389(this.anInt1006));
					if (this.anInt1019 != this.anInt887) {
						this.anInt887 = this.anInt1019;
					}
					if (this.anInt927 != this.anInt996) {
						this.anInt996 = this.anInt927;
					}
				}
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("70867, " + false + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method616(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte26 == 5) {
				@Pc(7) boolean local7 = false;
			} else {
				this.anInt917 = this.aClass18_2.method155();
			}
			if (this.anInt963 != 0) {
				@Pc(20) int local20 = 0;
				if (this.anInt1050 != 0) {
					local20 = 1;
				}
				for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
					if (this.aStringArray13[local27] != null) {
						@Pc(39) int local39 = this.anIntArray261[local27];
						@Pc(44) String local44 = this.aStringArray12[local27];
						if (local44 != null && local44.startsWith("@cr1@")) {
							local44 = local44.substring(5);
						}
						if (local44 != null && local44.startsWith("@cr2@")) {
							local44 = local44.substring(5);
						}
						if ((local39 == 3 || local39 == 7) && (local39 == 7 || this.anInt980 == 0 || this.anInt980 == 1 && this.method640(local44))) {
							@Pc(97) int local97 = 329 - local20 * 13;
							if (super.anInt852 > 4 && super.anInt853 - 4 > local97 - 10 && super.anInt853 - 4 <= local97 + 3) {
								@Pc(136) int local136 = this.aClass6_Sub1_Sub1_Sub2_3.method207("From:  " + local44 + this.aStringArray13[local27]) + 25;
								if (local136 > 450) {
									local136 = 450;
								}
								if (super.anInt852 < local136 + 4) {
									if (this.anInt1003 >= 1) {
										this.aStringArray9[this.anInt886] = "Report abuse @whi@" + local44;
										this.anIntArray258[this.anInt886] = 2541;
										this.anInt886++;
									}
									this.aStringArray9[this.anInt886] = "Add ignore @whi@" + local44;
									this.anIntArray258[this.anInt886] = 2997;
									this.anInt886++;
									this.aStringArray9[this.anInt886] = "Add friend @whi@" + local44;
									this.anIntArray258[this.anInt886] = 2138;
									this.anInt886++;
								}
							}
							local20++;
							if (local20 >= 5) {
								return;
							}
						}
						if ((local39 == 5 || local39 == 6) && this.anInt980 < 2) {
							local20++;
							if (local20 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("90824, " + arg0 + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method617(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 2) {
				this.anInt972 = this.aClass18_2.method155();
			}
			for (@Pc(9) int local9 = 0; local9 < this.anInt884; local9++) {
				@Pc(16) int local16 = this.anIntArray228[local9];
				@Pc(21) Class6_Sub1_Sub2_Sub3_Sub2 local21 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local16];
				if (local21 != null) {
					this.method618(local21.aClass47_2.aByte23, local21);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("21518, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OZYWPVDM;I)V")
	private void method618(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub2_Sub3 arg1) {
		try {
			if (arg1.anInt535 < 128 || arg1.anInt536 < 128 || arg1.anInt535 >= 13184 || arg1.anInt536 >= 13184) {
				arg1.anInt529 = -1;
				arg1.anInt516 = -1;
				arg1.anInt547 = 0;
				arg1.anInt548 = 0;
				arg1.anInt535 = arg1.anIntArray142[0] * 128 + arg1.anInt526 * 64;
				arg1.anInt536 = arg1.anIntArray143[0] * 128 + arg1.anInt526 * 64;
				arg1.method308();
			}
			if (arg1 == aClass6_Sub1_Sub2_Sub3_Sub1_1 && (arg1.anInt535 < 1536 || arg1.anInt536 < 1536 || arg1.anInt535 >= 11776 || arg1.anInt536 >= 11776)) {
				arg1.anInt529 = -1;
				arg1.anInt516 = -1;
				arg1.anInt547 = 0;
				arg1.anInt548 = 0;
				arg1.anInt535 = arg1.anIntArray142[0] * 128 + arg1.anInt526 * 64;
				arg1.anInt536 = arg1.anIntArray143[0] * 128 + arg1.anInt526 * 64;
				arg1.method308();
			}
			if (arg1.anInt547 > anInt936) {
				this.method619(arg1);
			} else if (arg1.anInt548 >= anInt936) {
				this.method620(arg1);
			} else {
				this.method621(arg1);
			}
			this.method622(arg1);
			this.method623(arg1);
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("76831, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!OZYWPVDM;)V")
	private void method619(@OriginalArg(1) Class6_Sub1_Sub2_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt547 - anInt936;
			this.aBoolean243 &= true;
			@Pc(20) int local20 = arg0.anInt543 * 128 + arg0.anInt526 * 64;
			@Pc(30) int local30 = arg0.anInt545 * 128 + arg0.anInt526 * 64;
			arg0.anInt535 += (local20 - arg0.anInt535) / local4;
			arg0.anInt536 += (local30 - arg0.anInt536) / local4;
			arg0.anInt521 = 0;
			if (arg0.anInt549 == 0) {
				arg0.anInt541 = 1024;
			}
			if (arg0.anInt549 == 1) {
				arg0.anInt541 = 1536;
			}
			if (arg0.anInt549 == 2) {
				arg0.anInt541 = 0;
			}
			if (arg0.anInt549 == 3) {
				arg0.anInt541 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("1874, " + true + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!OZYWPVDM;)V")
	private void method620(@OriginalArg(1) Class6_Sub1_Sub2_Sub3 arg0) {
		try {
			if (arg0.anInt548 == anInt936 || arg0.anInt529 == -1 || arg0.anInt532 != 0 || arg0.anInt531 + 1 > Class21.aClass21Array1[arg0.anInt529].method159(arg0.anInt530)) {
				@Pc(29) int local29 = arg0.anInt548 - arg0.anInt547;
				@Pc(34) int local34 = anInt936 - arg0.anInt547;
				@Pc(44) int local44 = arg0.anInt543 * 128 + arg0.anInt526 * 64;
				@Pc(54) int local54 = arg0.anInt545 * 128 + arg0.anInt526 * 64;
				@Pc(64) int local64 = arg0.anInt544 * 128 + arg0.anInt526 * 64;
				@Pc(74) int local74 = arg0.anInt546 * 128 + arg0.anInt526 * 64;
				arg0.anInt535 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt536 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt521 = 0;
			if (arg0.anInt549 == 0) {
				arg0.anInt541 = 1024;
			}
			if (arg0.anInt549 == 1) {
				arg0.anInt541 = 1536;
			}
			if (arg0.anInt549 == 2) {
				arg0.anInt541 = 0;
			}
			if (arg0.anInt549 == 3) {
				arg0.anInt541 = 512;
			}
			arg0.anInt537 = arg0.anInt541;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("47707, " + -36 + ", " + arg0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!OZYWPVDM;)V")
	private void method621(@OriginalArg(1) Class6_Sub1_Sub2_Sub3 arg0) {
		try {
			arg0.anInt538 = arg0.anInt551;
			if (arg0.anInt523 == 0) {
				arg0.anInt521 = 0;
			} else {
				if (arg0.anInt529 != -1 && arg0.anInt532 == 0) {
					@Pc(24) Class21 local24 = Class21.aClass21Array1[arg0.anInt529];
					if (arg0.anInt528 > 0 && local24.anInt349 == 0) {
						arg0.anInt521++;
						return;
					}
					if (arg0.anInt528 <= 0 && local24.anInt350 == 0) {
						arg0.anInt521++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt535;
				@Pc(56) int local56 = arg0.anInt536;
				@Pc(71) int local71 = arg0.anIntArray142[arg0.anInt523 - 1] * 128 + arg0.anInt526 * 64;
				@Pc(86) int local86 = arg0.anIntArray143[arg0.anInt523 - 1] * 128 + arg0.anInt526 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt541 = 1280;
						} else if (local56 > local86) {
							arg0.anInt541 = 1792;
						} else {
							arg0.anInt541 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt541 = 768;
						} else if (local56 > local86) {
							arg0.anInt541 = 256;
						} else {
							arg0.anInt541 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt541 = 1024;
					} else {
						arg0.anInt541 = 0;
					}
					@Pc(180) int local180 = arg0.anInt541 - arg0.anInt537 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt556;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt555;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt558;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt557;
					}
					if (local187 == -1) {
						local187 = arg0.anInt555;
					}
					arg0.anInt538 = local187;
					@Pc(234) int local234 = 4;
					if (arg0.anInt537 != arg0.anInt541 && arg0.anInt534 == -1 && arg0.anInt527 != 0) {
						local234 = 2;
					}
					if (arg0.anInt523 > 2) {
						local234 = 6;
					}
					if (arg0.anInt523 > 3) {
						local234 = 8;
					}
					if (arg0.anInt521 > 0 && arg0.anInt523 > 1) {
						local234 = 8;
						arg0.anInt521--;
					}
					if (arg0.aBooleanArray6[arg0.anInt523 - 1]) {
						local234 <<= 0x1;
					}
					if (local234 >= 8 && arg0.anInt538 == arg0.anInt555 && arg0.anInt522 != -1) {
						arg0.anInt538 = arg0.anInt522;
					}
					if (local53 < local71) {
						arg0.anInt535 += local234;
						if (arg0.anInt535 > local71) {
							arg0.anInt535 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt535 -= local234;
						if (arg0.anInt535 < local71) {
							arg0.anInt535 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt536 += local234;
						if (arg0.anInt536 > local86) {
							arg0.anInt536 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt536 -= local234;
						if (arg0.anInt536 < local86) {
							arg0.anInt536 = local86;
						}
					}
					if (arg0.anInt535 == local71 && arg0.anInt536 == local86) {
						arg0.anInt523--;
						if (arg0.anInt528 > 0) {
							arg0.anInt528--;
							return;
						}
					}
				} else {
					arg0.anInt535 = local71;
					arg0.anInt536 = local86;
				}
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("89607, " + false + ", " + arg0 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!OZYWPVDM;)V")
	private void method622(@OriginalArg(1) Class6_Sub1_Sub2_Sub3 arg0) {
		try {
			if (28 == this.aByte33 && arg0.anInt527 != 0) {
				@Pc(32) int local32;
				@Pc(38) int local38;
				if (arg0.anInt534 != -1 && arg0.anInt534 < 32768) {
					@Pc(24) Class6_Sub1_Sub2_Sub3_Sub2 local24 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[arg0.anInt534];
					if (local24 != null) {
						local32 = arg0.anInt535 - local24.anInt535;
						local38 = arg0.anInt536 - local24.anInt536;
						if (local32 != 0 || local38 != 0) {
							arg0.anInt541 = (int) (Math.atan2((double) local32, (double) local38) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(63) int local63;
				if (arg0.anInt534 >= 32768) {
					local63 = arg0.anInt534 - 32768;
					if (local63 == this.anInt1068) {
						local63 = this.anInt871;
					}
					@Pc(75) Class6_Sub1_Sub2_Sub3_Sub1 local75 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local63];
					if (local75 != null) {
						local38 = arg0.anInt535 - local75.anInt535;
						@Pc(89) int local89 = arg0.anInt536 - local75.anInt536;
						if (local38 != 0 || local89 != 0) {
							arg0.anInt541 = (int) (Math.atan2((double) local38, (double) local89) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt560 != 0 || arg0.anInt561 != 0) && (arg0.anInt523 == 0 || arg0.anInt521 > 0)) {
					local63 = arg0.anInt535 - (arg0.anInt560 - this.anInt928 - this.anInt928) * 64;
					local32 = arg0.anInt536 - (arg0.anInt561 - this.anInt929 - this.anInt929) * 64;
					if (local63 != 0 || local32 != 0) {
						arg0.anInt541 = (int) (Math.atan2((double) local63, (double) local32) * 325.949D) & 0x7FF;
					}
					arg0.anInt560 = 0;
					arg0.anInt561 = 0;
				}
				local63 = arg0.anInt541 - arg0.anInt537 & 0x7FF;
				if (local63 != 0) {
					if (local63 < arg0.anInt527 || local63 > 2048 - arg0.anInt527) {
						arg0.anInt537 = arg0.anInt541;
					} else if (local63 > 1024) {
						arg0.anInt537 -= arg0.anInt527;
					} else {
						arg0.anInt537 += arg0.anInt527;
					}
					arg0.anInt537 &= 0x7FF;
					if (arg0.anInt538 == arg0.anInt551 && arg0.anInt537 != arg0.anInt541) {
						if (arg0.anInt552 != -1) {
							arg0.anInt538 = arg0.anInt552;
							return;
						}
						arg0.anInt538 = arg0.anInt555;
						return;
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("99245, " + 28 + ", " + arg0 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OZYWPVDM;)V")
	private void method623(@OriginalArg(1) Class6_Sub1_Sub2_Sub3 arg0) {
		try {
			this.anInt1013 += 0;
			arg0.aBoolean145 = false;
			@Pc(19) Class21 local19;
			if (arg0.anInt538 != -1) {
				local19 = Class21.aClass21Array1[arg0.anInt538];
				arg0.anInt540++;
				if (arg0.anInt539 < local19.anInt343 && arg0.anInt540 > local19.method159(arg0.anInt539)) {
					arg0.anInt540 = 0;
					arg0.anInt539++;
				}
				if (arg0.anInt539 >= local19.anInt343) {
					arg0.anInt540 = 0;
					arg0.anInt539 = 0;
				}
			}
			if (arg0.anInt516 != -1 && anInt936 >= arg0.anInt519) {
				if (arg0.anInt517 < 0) {
					arg0.anInt517 = 0;
				}
				local19 = Class12.aClass12Array1[arg0.anInt516].aClass21_1;
				arg0.anInt518++;
				while (arg0.anInt517 < local19.anInt343 && arg0.anInt518 > local19.method159(arg0.anInt517)) {
					arg0.anInt518 -= local19.method159(arg0.anInt517);
					arg0.anInt517++;
				}
				if (arg0.anInt517 >= local19.anInt343 && (arg0.anInt517 < 0 || arg0.anInt517 >= local19.anInt343)) {
					arg0.anInt516 = -1;
				}
			}
			if (arg0.anInt529 != -1 && arg0.anInt532 <= 1) {
				local19 = Class21.aClass21Array1[arg0.anInt529];
				if (local19.anInt349 == 1 && arg0.anInt528 > 0 && arg0.anInt547 <= anInt936 && arg0.anInt548 < anInt936) {
					arg0.anInt532 = 1;
					return;
				}
			}
			if (arg0.anInt529 != -1 && arg0.anInt532 == 0) {
				local19 = Class21.aClass21Array1[arg0.anInt529];
				arg0.anInt531++;
				while (arg0.anInt530 < local19.anInt343 && arg0.anInt531 > local19.method159(arg0.anInt530)) {
					arg0.anInt531 -= local19.method159(arg0.anInt530);
					arg0.anInt530++;
				}
				if (arg0.anInt530 >= local19.anInt343) {
					arg0.anInt530 -= local19.anInt344;
					arg0.anInt533++;
					if (arg0.anInt533 >= local19.anInt348) {
						arg0.anInt529 = -1;
					}
					if (arg0.anInt530 < 0 || arg0.anInt530 >= local19.anInt343) {
						arg0.anInt529 = -1;
					}
				}
				arg0.aBoolean145 = local19.aBoolean84;
			}
			if (arg0.anInt532 > 0) {
				arg0.anInt532--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("19245, " + 0 + ", " + arg0 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method624(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt1006 == -1 || this.anInt1028 != 2 && super.aClass15_2 == null) {
				if (this.aBoolean259) {
					this.method663();
					this.aBoolean259 = false;
					this.aClass15_19.method122(super.aGraphics2, 966, 4, 0);
					this.aClass15_20.method122(super.aGraphics2, 966, 357, 0);
					this.aClass15_21.method122(super.aGraphics2, 966, 4, 722);
					this.aClass15_22.method122(super.aGraphics2, 966, 205, 743);
					this.aClass15_23.method122(super.aGraphics2, 966, 0, 0);
					this.aClass15_24.method122(super.aGraphics2, 966, 4, 516);
					this.aClass15_25.method122(super.aGraphics2, 966, 205, 516);
					this.aClass15_26.method122(super.aGraphics2, 966, 357, 496);
					this.aClass15_27.method122(super.aGraphics2, 966, 338, 0);
					this.aBoolean253 = true;
					this.aBoolean246 = true;
					this.aBoolean263 = true;
					this.aBoolean233 = true;
					if (this.anInt1028 != 2) {
						this.aClass15_5.method122(super.aGraphics2, 966, 4, 4);
						this.aClass15_4.method122(super.aGraphics2, 966, 4, 550);
					}
				}
				if (this.anInt1028 == 2) {
					this.method670();
				}
				if (this.aBoolean270 && this.anInt1052 == 1) {
					this.aBoolean253 = true;
				}
				@Pc(281) boolean local281;
				if (this.anInt911 != -1) {
					local281 = this.method625(this.anInt984, this.anInt911, this.anInt1062);
					if (local281) {
						this.aBoolean253 = true;
					}
				}
				if (this.anInt916 == 2) {
					this.aBoolean253 = true;
				}
				if (this.anInt1092 == 2) {
					this.aBoolean253 = true;
				}
				if (this.aBoolean253) {
					this.method723();
					this.aBoolean253 = false;
				}
				@Pc(366) int local366;
				if (this.anInt1030 == -1 && this.anInt1010 == 0) {
					this.aClass35_1.anInt666 = this.anInt987 - this.anInt909 - 77;
					if (super.anInt852 > 448 && super.anInt852 < 560 && super.anInt853 > 332) {
						this.method600(77, super.anInt852 - 17, this.anInt987, 463, this.aClass35_1, super.anInt853 - 357, 0, -1);
					}
					local366 = this.anInt987 - this.aClass35_1.anInt666 - 77;
					if (local366 < 0) {
						local366 = 0;
					}
					if (local366 > this.anInt987 - 77) {
						local366 = this.anInt987 - 77;
					}
					if (this.anInt909 != local366) {
						this.anInt909 = local366;
						this.aBoolean246 = true;
					}
				}
				if (this.anInt1030 == -1 && this.anInt1010 == 3) {
					local366 = this.anInt933 * 14 + 7;
					this.aClass35_1.anInt666 = this.anInt934;
					if (super.anInt852 > 448 && super.anInt852 < 560 && super.anInt853 > 332) {
						this.method600(77, super.anInt852 - 17, local366, 463, this.aClass35_1, super.anInt853 - 357, 0, -1);
					}
					@Pc(445) int local445 = this.aClass35_1.anInt666;
					if (local445 < 0) {
						local445 = 0;
					}
					if (local445 > local366 - 77) {
						local445 = local366 - 77;
					}
					if (this.anInt934 != local445) {
						this.anInt934 = local445;
						this.aBoolean246 = true;
					}
				}
				if (this.anInt1030 != -1) {
					local281 = this.method625(this.anInt984, this.anInt1030, this.anInt1062);
					if (local281) {
						this.aBoolean246 = true;
					}
				}
				if (this.anInt916 == 3) {
					this.aBoolean246 = true;
				}
				if (this.anInt1092 == 3) {
					this.aBoolean246 = true;
				}
				if (this.aString25 != null) {
					this.aBoolean246 = true;
				}
				if (this.aBoolean270 && this.anInt1052 == 2) {
					this.aBoolean246 = true;
				}
				if (this.aBoolean246) {
					this.method606();
					this.aBoolean246 = false;
				}
				if (this.anInt1028 == 2) {
					this.method669((byte) 9);
					this.aClass15_4.method122(super.aGraphics2, 966, 4, 550);
				}
				if (this.anInt945 != -1) {
					this.aBoolean263 = true;
				}
				if (this.aBoolean263) {
					if (this.anInt945 != -1 && this.anInt945 == this.anInt1071) {
						this.anInt945 = -1;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 218);
						this.aClass6_Sub1_Sub4_9.method401(this.anInt1071);
					}
					this.aBoolean263 = false;
					this.aClass15_18.method121();
					this.aClass6_Sub1_Sub1_Sub3_8.method535(0, 0);
					if (this.anInt911 == -1) {
						if (this.anIntArray276[this.anInt1071] != -1) {
							if (this.anInt1071 == 0) {
								this.aClass6_Sub1_Sub1_Sub3_9.method535(22, 10);
							}
							if (this.anInt1071 == 1) {
								this.aClass6_Sub1_Sub1_Sub3_10.method535(54, 8);
							}
							if (this.anInt1071 == 2) {
								this.aClass6_Sub1_Sub1_Sub3_10.method535(82, 8);
							}
							if (this.anInt1071 == 3) {
								this.aClass6_Sub1_Sub1_Sub3_11.method535(110, 8);
							}
							if (this.anInt1071 == 4) {
								this.aClass6_Sub1_Sub1_Sub3_13.method535(153, 8);
							}
							if (this.anInt1071 == 5) {
								this.aClass6_Sub1_Sub1_Sub3_13.method535(181, 8);
							}
							if (this.anInt1071 == 6) {
								this.aClass6_Sub1_Sub1_Sub3_12.method535(209, 9);
							}
						}
						if (this.anIntArray276[0] != -1 && (this.anInt945 != 0 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[0].method535(29, 13);
						}
						if (this.anIntArray276[1] != -1 && (this.anInt945 != 1 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[1].method535(53, 11);
						}
						if (this.anIntArray276[2] != -1 && (this.anInt945 != 2 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[2].method535(82, 11);
						}
						if (this.anIntArray276[3] != -1 && (this.anInt945 != 3 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[3].method535(115, 12);
						}
						if (this.anIntArray276[4] != -1 && (this.anInt945 != 4 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[4].method535(153, 13);
						}
						if (this.anIntArray276[5] != -1 && (this.anInt945 != 5 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[5].method535(180, 11);
						}
						if (this.anIntArray276[6] != -1 && (this.anInt945 != 6 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[6].method535(208, 13);
						}
					}
					this.aClass15_18.method122(super.aGraphics2, 966, 160, 516);
					this.aClass15_17.method121();
					this.aClass6_Sub1_Sub1_Sub3_7.method535(0, 0);
					if (this.anInt911 == -1) {
						if (this.anIntArray276[this.anInt1071] != -1) {
							if (this.anInt1071 == 7) {
								this.aClass6_Sub1_Sub1_Sub3_16.method535(42, 0);
							}
							if (this.anInt1071 == 8) {
								this.aClass6_Sub1_Sub1_Sub3_17.method535(74, 0);
							}
							if (this.anInt1071 == 9) {
								this.aClass6_Sub1_Sub1_Sub3_17.method535(102, 0);
							}
							if (this.anInt1071 == 10) {
								this.aClass6_Sub1_Sub1_Sub3_18.method535(130, 1);
							}
							if (this.anInt1071 == 11) {
								this.aClass6_Sub1_Sub1_Sub3_20.method535(173, 0);
							}
							if (this.anInt1071 == 12) {
								this.aClass6_Sub1_Sub1_Sub3_20.method535(201, 0);
							}
							if (this.anInt1071 == 13) {
								this.aClass6_Sub1_Sub1_Sub3_19.method535(229, 0);
							}
						}
						if (this.anIntArray276[8] != -1 && (this.anInt945 != 8 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[7].method535(74, 2);
						}
						if (this.anIntArray276[9] != -1 && (this.anInt945 != 9 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[8].method535(102, 3);
						}
						if (this.anIntArray276[10] != -1 && (this.anInt945 != 10 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[9].method535(137, 4);
						}
						if (this.anIntArray276[11] != -1 && (this.anInt945 != 11 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[10].method535(174, 2);
						}
						if (this.anIntArray276[12] != -1 && (this.anInt945 != 12 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[11].method535(201, 2);
						}
						if (this.anIntArray276[13] != -1 && (this.anInt945 != 13 || anInt936 % 20 < 10)) {
							this.aClass6_Sub1_Sub1_Sub3Array2[12].method535(226, 2);
						}
					}
					this.aClass15_17.method122(super.aGraphics2, 966, 466, 496);
					this.aClass15_5.method121();
					Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
				}
				if (this.aBoolean233) {
					this.aBoolean233 = false;
					this.aClass15_16.method121();
					this.aClass6_Sub1_Sub1_Sub3_6.method535(0, 0);
					this.aClass6_Sub1_Sub1_Sub2_3.method206(28, 16777215, true, 55, "Public chat");
					if (this.anInt932 == 0) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 65280, true, 55, "On");
					}
					if (this.anInt932 == 1) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 16776960, true, 55, "Friends");
					}
					if (this.anInt932 == 2) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 16711680, true, 55, "Off");
					}
					if (this.anInt932 == 3) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 65535, true, 55, "Hide");
					}
					this.aClass6_Sub1_Sub1_Sub2_3.method206(28, 16777215, true, 184, "Private chat");
					if (this.anInt980 == 0) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 65280, true, 184, "On");
					}
					if (this.anInt980 == 1) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 16776960, true, 184, "Friends");
					}
					if (this.anInt980 == 2) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 16711680, true, 184, "Off");
					}
					this.aClass6_Sub1_Sub1_Sub2_3.method206(28, 16777215, true, 324, "Trade/compete");
					if (this.anInt1025 == 0) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 65280, true, 324, "On");
					}
					if (this.anInt1025 == 1) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 16776960, true, 324, "Friends");
					}
					if (this.anInt1025 == 2) {
						this.aClass6_Sub1_Sub1_Sub2_3.method206(41, 16711680, true, 324, "Off");
					}
					this.aClass6_Sub1_Sub1_Sub2_3.method206(33, 16777215, true, 458, "Report abuse");
					this.aClass15_16.method122(super.aGraphics2, 966, 453, 0);
					this.aClass15_5.method121();
					Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
				}
				this.anInt984 = 0;
				@Pc(1280) boolean local1280 = false;
			} else {
				if (this.anInt1028 == 2) {
					this.method625(this.anInt984, this.anInt1006, this.anInt1062);
					if (this.anInt864 != -1) {
						this.method625(this.anInt984, this.anInt864, this.anInt1062);
					}
					this.anInt984 = 0;
					this.method661();
					super.aClass15_2.method121();
					Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray274;
					Class6_Sub1_Sub1.method553();
					this.aBoolean259 = true;
					@Pc(58) Class35 local58 = Class35.method389(this.anInt1006);
					if (local58.anInt660 == 512 && local58.anInt667 == 334 && local58.anInt687 == 0) {
						local58.anInt660 = 765;
						local58.anInt667 = 503;
					}
					this.method675(0, 0, local58, 0);
					if (this.anInt864 != -1) {
						local58 = Class35.method389(this.anInt864);
						if (local58.anInt660 == 512 && local58.anInt667 == 334 && local58.anInt687 == 0) {
							local58.anInt660 = 765;
							local58.anInt667 = 503;
						}
						this.method675(0, 0, local58, 0);
					}
					if (this.aBoolean270) {
						this.method700();
					} else {
						this.method615();
						this.method651(this.aByte34);
					}
				}
				super.aClass15_2.method122(super.aGraphics2, 966, 0, 0);
			}
		} catch (@Pc(1288) RuntimeException local1288) {
			signlink.reporterror("54601, " + arg0 + ", " + local1288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Z")
	private boolean method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class35 local6 = Class35.method389(arg1);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray188.length && local6.anIntArray188[local8] != -1; local8++) {
				@Pc(22) Class35 local22 = Class35.method389(local6.anIntArray188[local8]);
				if (local22.anInt687 == 0) {
					local3 |= this.method625(arg0, local22.anInt674, this.anInt1062);
				}
				@Pc(57) int local57;
				if (local22.anInt687 == 6 && (local22.anInt656 != -1 || local22.anInt657 != -1)) {
					@Pc(52) boolean local52 = this.method709(285, local22);
					if (local52) {
						local57 = local22.anInt657;
					} else {
						local57 = local22.anInt656;
					}
					if (local57 != -1) {
						@Pc(69) Class21 local69 = Class21.aClass21Array1[local57];
						local22.anInt655 += arg0;
						while (local22.anInt655 > local69.method159(local22.anInt690)) {
							local22.anInt655 -= local69.method159(local22.anInt690) + 1;
							local22.anInt690++;
							if (local22.anInt690 >= local69.anInt343) {
								local22.anInt690 -= local69.anInt344;
								if (local22.anInt690 < 0 || local22.anInt690 >= local69.anInt343) {
									local22.anInt690 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local22.anInt687 == 6 && local22.anInt684 != 0) {
					@Pc(140) int local140 = local22.anInt684 >> 16;
					local57 = local22.anInt684 << 16 >> 16;
					@Pc(151) int local151 = local140 * arg0;
					local57 *= arg0;
					local22.anInt672 = local22.anInt672 + local151 & 0x7FF;
					local22.anInt673 = local22.anInt673 + local57 & 0x7FF;
					local3 = true;
				}
			}
			if (arg2 != -1109) {
				this.anInt1014 = -1;
			}
			return local3;
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("22482, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method626() {
		try {
			for (@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) this.aClass5_10.method33(); local6 != null; local6 = (Class6_Sub2) this.aClass5_10.method35((byte) 8)) {
				if (local6.anInt171 == -1) {
					local6.anInt172 = 0;
					this.method690(local6);
				} else {
					local6.method548();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("16648, " + 29760 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method627(@OriginalArg(0) byte arg0) {
		try {
			@Pc(41) int local41;
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(62) int local62;
			@Pc(111) int local111;
			@Pc(125) int local125;
			@Pc(137) int local137;
			@Pc(196) int local196;
			try {
				this.anInt1081 = -1;
				this.aClass5_11.method37();
				this.aClass5_12.method37();
				anInt1029++;
				if (anInt1029 > 118) {
					anInt1029 = 0;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 110);
					this.aClass6_Sub1_Sub4_9.method401(183);
				}
				Class6_Sub1_Sub1_Sub1.method72();
				this.method657();
				this.aClass32_1.method319();
				System.gc();
				for (local41 = 0; local41 < 4; local41++) {
					this.aClass3Array1[local41].method5();
				}
				for (local54 = 0; local54 < 4; local54++) {
					for (local58 = 0; local58 < 104; local58++) {
						for (local62 = 0; local62 < 104; local62++) {
							this.aByteArrayArrayArray8[local54][local58][local62] = 0;
						}
					}
				}
				@Pc(96) Class23 local96 = new Class23((byte) 102, 104, 104, this.aByteArrayArrayArray8, this.anIntArrayArrayArray8);
				local62 = this.aByteArrayArray6.length;
				this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 30);
				@Pc(278) int local278;
				@Pc(266) int local266;
				if (!this.aBoolean255) {
					@Pc(142) byte[] local142;
					for (local111 = 0; local111 < local62; local111++) {
						local125 = (this.anIntArray232[local111] >> 8) * 64 - this.anInt928;
						local137 = (this.anIntArray232[local111] & 0xFF) * 64 - this.anInt929;
						local142 = this.aByteArrayArray6[local111];
						if (local142 != null) {
							local96.method181(local125, (this.anInt975 - 6) * 8, local137, this.aClass3Array1, local142, (this.anInt974 - 6) * 8);
						}
					}
					for (local125 = 0; local125 < local62; local125++) {
						local137 = (this.anIntArray232[local125] >> 8) * 64 - this.anInt928;
						local196 = (this.anIntArray232[local125] & 0xFF) * 64 - this.anInt929;
						@Pc(201) byte[] local201 = this.aByteArrayArray6[local125];
						if (local201 == null && this.anInt975 < 800) {
							local96.method176(64, local196, 64, (byte) 1, local137);
						}
					}
					anInt882++;
					if (anInt882 > 155) {
						anInt882 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 160);
						this.aClass6_Sub1_Sub4_9.method404(1254944);
					}
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 30);
					for (local137 = 0; local137 < local62; local137++) {
						local142 = this.aByteArrayArray5[local137];
						if (local142 != null) {
							local266 = (this.anIntArray232[local137] >> 8) * 64 - this.anInt928;
							local278 = (this.anIntArray232[local137] & 0xFF) * 64 - this.anInt929;
							local96.method171(local142, local278, local266, this.aClass32_1, this.aClass3Array1);
						}
					}
				}
				if (this.aBoolean255) {
					local111 = 0;
					label267: while (true) {
						@Pc(333) int local333;
						@Pc(339) int local339;
						@Pc(345) int local345;
						@Pc(355) int local355;
						@Pc(357) int local357;
						if (local111 >= 4) {
							for (local125 = 0; local125 < 13; local125++) {
								for (local137 = 0; local137 < 13; local137++) {
									local196 = this.anIntArrayArrayArray7[0][local125][local137];
									if (local196 == -1) {
										local96.method176(8, local137 * 8, 8, (byte) 1, local125 * 8);
									}
								}
							}
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 30);
							local137 = 0;
							while (true) {
								if (local137 >= 4) {
									break label267;
								}
								for (local196 = 0; local196 < 13; local196++) {
									for (local266 = 0; local266 < 13; local266++) {
										local278 = this.anIntArrayArrayArray7[local137][local196][local266];
										if (local278 != -1) {
											local333 = local278 >> 24 & 0x3;
											local339 = local278 >> 1 & 0x3;
											local345 = local278 >> 14 & 0x3FF;
											local355 = local278 >> 3 & 0x7FF;
											local357 = (local345 / 8 << 8) + local355 / 8;
											for (@Pc(538) int local538 = 0; local538 < this.anIntArray232.length; local538++) {
												if (this.anIntArray232[local538] == local357 && this.aByteArrayArray5[local538] != null) {
													local96.method165(this.aClass3Array1, this.aByteArrayArray5[local538], (local345 & 0x7) * 8, (local355 & 0x7) * 8, local333, local196 * 8, local137, local266 * 8, local339, this.aClass32_1);
													break;
												}
											}
										}
									}
								}
								local137++;
							}
						}
						for (local125 = 0; local125 < 13; local125++) {
							for (local137 = 0; local137 < 13; local137++) {
								@Pc(309) boolean local309 = false;
								local266 = this.anIntArrayArrayArray7[local111][local125][local137];
								if (local266 != -1) {
									local278 = local266 >> 24 & 0x3;
									local333 = local266 >> 1 & 0x3;
									local339 = local266 >> 14 & 0x3FF;
									local345 = local266 >> 3 & 0x7FF;
									local355 = (local339 / 8 << 8) + local345 / 8;
									for (local357 = 0; local357 < this.anIntArray232.length; local357++) {
										if (this.anIntArray232[local357] == local355 && this.aByteArrayArray6[local357] != null) {
											local96.method164(local125 * 8, local333, (local339 & 0x7) * 8, (local345 & 0x7) * 8, local137 * 8, this.aByte27, local111, this.aByteArrayArray6[local357], this.aClass3Array1, local278);
											local309 = true;
											break;
										}
									}
								}
								if (!local309) {
									local96.method175(local125 * 8, local137 * 8, local111, (byte) 7);
								}
							}
						}
						local111++;
					}
				}
				this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 30);
				local96.method179(this.aClass3Array1, this.aClass32_1);
				if (this.aClass15_5 != null) {
					this.aClass15_5.method121();
					Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
				}
				this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 30);
				local111 = Class23.anInt368;
				if (local111 > this.anInt989) {
					local111 = this.anInt989;
				}
				if (local111 < this.anInt989 - 1) {
					local111 = this.anInt989 - 1;
				}
				if (aBoolean252) {
					this.aClass32_1.method320(Class23.anInt368);
				} else {
					this.aClass32_1.method320(0);
				}
				for (local125 = 0; local125 < 104; local125++) {
					for (local137 = 0; local137 < 104; local137++) {
						this.method673(local125, local137);
					}
				}
				this.method626();
			} catch (@Pc(689) Exception local689) {
			}
			Class28.aClass36_6.method396();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 239);
				this.aClass6_Sub1_Sub4_9.method405(1057001181);
			}
			if (aBoolean252 && signlink.aRandomAccessFile3 != null) {
				local41 = this.aClass22_Sub1_1.method294(0);
				for (local54 = 0; local54 < local41; local54++) {
					local58 = this.aClass22_Sub1_1.method299(local54);
					if ((local58 & 0x79) == 0) {
						Class6_Sub1_Sub2_Sub5.method227(local54);
					}
				}
			}
			System.gc();
			Class6_Sub1_Sub1_Sub1.method73();
			this.aClass22_Sub1_1.method289();
			if (arg0 == 7) {
				@Pc(748) boolean local748 = false;
			} else {
				this.anInt908 = this.aClass18_2.method155();
			}
			local41 = (this.anInt974 - 6) / 8 - 1;
			local54 = (this.anInt974 + 6) / 8 + 1;
			local58 = (this.anInt975 - 6) / 8 - 1;
			local62 = (this.anInt975 + 6) / 8 + 1;
			if (this.aBoolean260) {
				local41 = 49;
				local54 = 50;
				local58 = 49;
				local62 = 50;
			}
			for (local111 = local41; local111 <= local54; local111++) {
				for (local125 = local58; local125 <= local62; local125++) {
					if (local111 == local41 || local111 == local54 || local125 == local58 || local125 == local62) {
						local137 = this.aClass22_Sub1_1.method298(local125, local111, 0);
						if (local137 != -1) {
							this.aClass22_Sub1_1.method284(local137, 3);
						}
						local196 = this.aClass22_Sub1_1.method298(local125, local111, 1);
						if (local196 != -1) {
							this.aClass22_Sub1_1.method284(local196, 3);
						}
					}
				}
			}
		} catch (@Pc(866) RuntimeException local866) {
			signlink.reporterror("30841, " + arg0 + ", " + local866.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local7 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local7 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("19965, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method629(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt999 == 2) {
				this.method683((this.anInt992 - this.anInt929 << 7) + this.anInt995, this.anInt993 * 2, (this.anInt991 - this.anInt928 << 7) + this.anInt994);
				if (arg0 == 4 && (this.anInt905 > -1 && anInt936 % 20 < 10)) {
					this.aClass6_Sub1_Sub1_Sub4Array5[0].method567(this.anInt905 - 12, this.anInt906 - 28);
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("19906, " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method630() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt925; local6++) {
				if (this.anIntArray212[local6] <= 0) {
					@Pc(15) boolean local15 = false;
					try {
						if (this.anIntArray262[local6] != this.anInt955 || this.anIntArray250[local6] != this.anInt1005) {
							@Pc(48) Class6_Sub1_Sub4 local48 = Class13.method103(this.anIntArray262[local6], this.anIntArray250[local6]);
							if (System.currentTimeMillis() + (long) (local48.anInt704 / 22) > this.aLong30 + (long) (this.anInt1082 / 22)) {
								this.anInt1082 = local48.anInt704;
								this.aLong30 = System.currentTimeMillis();
								if (this.method654(local48.anInt704, local48.aByteArray17)) {
									this.anInt955 = this.anIntArray262[local6];
									this.anInt1005 = this.anIntArray250[local6];
								} else {
									local15 = true;
								}
							}
						} else if (!this.method660()) {
							local15 = true;
						}
					} catch (@Pc(98) Exception local98) {
						if (signlink.reporterror) {
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 142);
							this.aClass6_Sub1_Sub4_9.method402(this.anIntArray262[local6] & 0x7FFF);
						} else {
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 142);
							this.aClass6_Sub1_Sub4_9.method402(-1);
						}
					}
					if (local15 && this.anIntArray212[local6] != -5) {
						this.anIntArray212[local6] = -5;
					} else {
						this.anInt925--;
						for (@Pc(143) int local143 = local6; local143 < this.anInt925; local143++) {
							this.anIntArray262[local143] = this.anIntArray262[local143 + 1];
							this.anIntArray250[local143] = this.anIntArray250[local143 + 1];
							this.anIntArray212[local143] = this.anIntArray212[local143 + 1];
						}
						local6--;
					}
				} else {
					@Pc(195) int local195 = this.anIntArray212[local6]--;
				}
			}
			if (this.anInt1004 > 0) {
				this.anInt1004 -= 20;
				if (this.anInt1004 < 0) {
					this.anInt1004 = 0;
				}
				if (this.anInt1004 == 0 && this.aBoolean239 && !aBoolean252) {
					this.anInt907 = this.anInt939;
					this.aBoolean241 = true;
					this.aClass22_Sub1_1.method283(2, this.anInt907);
					return;
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("56784, " + -607 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method631(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean256) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method588(43595);
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

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method632() {
		try {
			this.anInt1013 += 0;
			for (@Pc(9) int local9 = -1; local9 < this.anInt872; local9++) {
				@Pc(17) int local17;
				if (local9 == -1) {
					local17 = this.anInt871;
				} else {
					local17 = this.anIntArray223[local9];
				}
				@Pc(29) Class6_Sub1_Sub2_Sub3_Sub1 local29 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local17];
				if (local29 != null) {
					this.method618(1, local29);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("41232, " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IGCQCHAY;Lclient!RGCGKKUR;III)V")
	private void method633(@OriginalArg(0) Class6_Sub1_Sub2_Sub3_Sub1 arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(15) int local15;
			@Pc(19) int local19;
			@Pc(23) int local23;
			if ((arg3 & 0x40) != 0) {
				local15 = arg1.method438();
				local19 = arg1.method430();
				local23 = arg1.method429();
				@Pc(26) int local26 = arg1.anInt704;
				if (arg0.aString5 != null && arg0.aBoolean73) {
					@Pc(36) long local36 = Class38.method453(arg0.aString5);
					@Pc(38) boolean local38 = false;
					if (local19 <= 1) {
						for (@Pc(43) int local43 = 0; local43 < this.anInt1009; local43++) {
							if (this.aLongArray3[local43] == local36) {
								local38 = true;
								break;
							}
						}
					}
					if (!local38 && this.anInt883 == 0) {
						try {
							this.aClass6_Sub1_Sub4_7.anInt704 = 0;
							arg1.method448(this.aClass6_Sub1_Sub4_7.aByteArray17, local23);
							this.aClass6_Sub1_Sub4_7.anInt704 = 0;
							@Pc(88) String local88 = Class50.method545(this.aClass6_Sub1_Sub4_7, local23);
							@Pc(92) String local92 = Class44.method479(local88);
							arg0.aString8 = local92;
							arg0.anInt525 = local15 >> 8;
							arg0.anInt554 = local15 & 0xFF;
							arg0.anInt542 = 150;
							if (local19 == 2 || local19 == 3) {
								this.method707(local92, 1, "@cr2@" + arg0.aString5);
							} else if (local19 == 1) {
								this.method707(local92, 1, "@cr1@" + arg0.aString5);
							} else {
								this.method707(local92, 2, arg0.aString5);
							}
						} catch (@Pc(156) Exception local156) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt704 = local26 + local23;
			}
			if ((arg3 & 0x80) != 0) {
				local15 = arg1.method430();
				@Pc(175) byte[] local175 = new byte[local15];
				@Pc(181) Class6_Sub1_Sub4 local181 = new Class6_Sub1_Sub4(local175, (byte) -17);
				arg1.method448(local175, local15);
				this.aClass6_Sub1_Sub4Array1[arg2] = local181;
				arg0.method142(local181);
			}
			if ((arg3 & 0x400) != 0) {
				arg0.anInt516 = arg1.method439(this.anInt892);
				local15 = arg1.method446();
				arg0.anInt520 = local15 >> 16;
				arg0.anInt519 = anInt936 + (local15 & 0xFFFF);
				arg0.anInt517 = 0;
				arg0.anInt518 = 0;
				if (arg0.anInt519 > anInt936) {
					arg0.anInt517 = -1;
				}
				if (arg0.anInt516 == 65535) {
					arg0.anInt516 = -1;
				}
			}
			if ((arg3 & 0x1) != 0) {
				local15 = arg1.method437();
				if (local15 == 65535) {
					local15 = -1;
				}
				local19 = arg1.method429();
				if (local15 == arg0.anInt529 && local15 != -1) {
					local23 = Class21.aClass21Array1[local15].anInt351;
					if (local23 == 1) {
						arg0.anInt530 = 0;
						arg0.anInt531 = 0;
						arg0.anInt532 = local19;
						arg0.anInt533 = 0;
					}
					if (local23 == 2) {
						arg0.anInt533 = 0;
					}
				} else if (local15 == -1 || arg0.anInt529 == -1 || Class21.aClass21Array1[local15].anInt345 >= Class21.aClass21Array1[arg0.anInt529].anInt345) {
					arg0.anInt529 = local15;
					arg0.anInt530 = 0;
					arg0.anInt531 = 0;
					arg0.anInt532 = local19;
					arg0.anInt533 = 0;
					arg0.anInt528 = arg0.anInt523;
				}
			}
			if ((arg3 & 0x100) != 0) {
				local15 = arg1.method411();
				local19 = arg1.method411();
				arg0.method307(anInt936, local15, local19);
				arg0.anInt513 = anInt936 + 300;
				arg0.anInt514 = arg1.method431();
				arg0.anInt515 = arg1.method429();
			}
			if ((arg3 & 0x200) != 0) {
				arg0.anInt543 = arg1.method431();
				arg0.anInt545 = arg1.method430();
				arg0.anInt544 = arg1.method411();
				arg0.anInt546 = arg1.method430();
				arg0.anInt547 = arg1.method439(this.anInt892) + anInt936;
				arg0.anInt548 = arg1.method438() + anInt936;
				arg0.anInt549 = arg1.method431();
				arg0.method308();
			}
			if ((arg3 & 0x4) != 0) {
				arg0.anInt534 = arg1.method438();
				if (arg0.anInt534 == 65535) {
					arg0.anInt534 = -1;
				}
			}
			if ((arg3 & 0x2) != 0) {
				arg0.anInt560 = arg1.method439(this.anInt892);
				arg0.anInt561 = arg1.method437();
			}
			if ((arg3 & 0x10) != 0) {
				local15 = arg1.method429();
				local19 = arg1.method430();
				arg0.method307(anInt936, local15, local19);
				arg0.anInt513 = anInt936 + 300;
				arg0.anInt514 = arg1.method430();
				arg0.anInt515 = arg1.method430();
			}
			if ((arg3 & 0x8) != 0) {
				arg0.aString8 = arg1.method418();
				if (arg0.aString8.charAt(0) == '~') {
					arg0.aString8 = arg0.aString8.substring(1);
					this.method707(arg0.aString8, 2, arg0.aString5);
				} else if (arg0 == aClass6_Sub1_Sub2_Sub3_Sub1_1) {
					this.method707(arg0.aString8, 2, arg0.aString5);
				}
				arg0.anInt525 = 0;
				arg0.anInt554 = 0;
				arg0.anInt542 = 150;
			}
		} catch (@Pc(523) RuntimeException local523) {
			signlink.reporterror("95601, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local523.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QUBPQDMQ;I)V")
	private void method634(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(8) int local8 = arg0.anInt682;
			@Pc(64) int local64;
			if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
				if (local8 >= 101 && local8 <= 200 || !(local8 < 801 || local8 > 900)) {
					local64 = this.anInt1023;
					if (this.anInt1024 != 2) {
						local64 = 0;
					}
					if (local8 > 800) {
						local8 -= 701;
					} else {
						local8 -= 101;
					}
					if (local8 >= local64) {
						arg0.aString11 = "";
						arg0.anInt675 = 0;
					} else {
						if (this.anIntArray227[local8] == 0) {
							arg0.aString11 = "@red@Offline";
						} else if (this.anIntArray227[local8] < 200) {
							if (this.anIntArray227[local8] == anInt956) {
								arg0.aString11 = "@gre@World" + (this.anIntArray227[local8] - 9);
							} else {
								arg0.aString11 = "@yel@World" + (this.anIntArray227[local8] - 9);
							}
						} else if (this.anIntArray227[local8] == anInt956) {
							arg0.aString11 = "@gre@Classic" + (this.anIntArray227[local8] - 219);
						} else {
							arg0.aString11 = "@yel@Classic" + (this.anIntArray227[local8] - 219);
						}
						arg0.anInt675 = 1;
					}
				} else if (local8 == 203) {
					local64 = this.anInt1023;
					if (this.anInt1024 != 2) {
						local64 = 0;
					}
					arg0.anInt664 = local64 * 15 + 20;
					if (arg0.anInt664 <= arg0.anInt667) {
						arg0.anInt664 = arg0.anInt667 + 1;
					}
				} else if (local8 >= 401 && local8 <= 500) {
					local8 -= 401;
					if (local8 == 0 && this.anInt1024 == 0) {
						arg0.aString11 = "Loading ignore list";
						arg0.anInt675 = 0;
					} else if (local8 == 1 && this.anInt1024 == 0) {
						arg0.aString11 = "Please wait...";
						arg0.anInt675 = 0;
					} else {
						local64 = this.anInt1009;
						if (this.anInt1024 == 0) {
							local64 = 0;
						}
						if (local8 >= local64) {
							arg0.aString11 = "";
							arg0.anInt675 = 0;
						} else {
							arg0.aString11 = Class38.method457(Class38.method454(this.aLongArray3[local8]));
							arg0.anInt675 = 1;
						}
					}
				} else if (local8 == 503) {
					arg0.anInt664 = this.anInt1009 * 15 + 20;
					if (arg0.anInt664 <= arg0.anInt667) {
						arg0.anInt664 = arg0.anInt667 + 1;
					}
				} else if (local8 == 327) {
					arg0.anInt672 = 150;
					arg0.anInt673 = (int) (Math.sin((double) anInt936 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean265) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(377) int local377 = this.anIntArray255[local64];
							if (local377 >= 0 && !Class16.aClass16Array1[local377].method147()) {
								return;
							}
						}
						this.aBoolean265 = false;
						@Pc(396) Class6_Sub1_Sub2_Sub5[] local396 = new Class6_Sub1_Sub2_Sub5[7];
						@Pc(398) int local398 = 0;
						for (@Pc(400) int local400 = 0; local400 < 7; local400++) {
							@Pc(407) int local407 = this.anIntArray255[local400];
							if (local407 >= 0) {
								local396[local398++] = Class16.aClass16Array1[local407].method148();
							}
						}
						@Pc(429) Class6_Sub1_Sub2_Sub5 local429 = new Class6_Sub1_Sub2_Sub5(183, local396, local398);
						for (@Pc(431) int local431 = 0; local431 < 5; local431++) {
							if (this.anIntArray213[local431] != 0) {
								local429.method242(anIntArrayArray24[local431][0], anIntArrayArray24[local431][this.anIntArray213[local431]]);
								if (local431 == 1) {
									local429.method242(anIntArray275[0], anIntArray275[this.anIntArray213[local431]]);
								}
							}
						}
						local429.method235();
						local429.method236(Class21.aClass21Array1[aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt551].anIntArray64[0]);
						local429.method245(64, 850, -30, -50, -30, true);
						arg0.anInt685 = 5;
						arg0.anInt686 = 0;
						Class35.method384(local429);
					}
				} else if (local8 == 324) {
					if (this.aClass6_Sub1_Sub1_Sub4_16 == null) {
						this.aClass6_Sub1_Sub1_Sub4_16 = arg0.aClass6_Sub1_Sub1_Sub4_2;
						this.aClass6_Sub1_Sub1_Sub4_17 = arg0.aClass6_Sub1_Sub1_Sub4_1;
					}
					if (this.aBoolean268) {
						arg0.aClass6_Sub1_Sub1_Sub4_2 = this.aClass6_Sub1_Sub1_Sub4_17;
					} else {
						arg0.aClass6_Sub1_Sub1_Sub4_2 = this.aClass6_Sub1_Sub1_Sub4_16;
					}
				} else if (local8 == 325) {
					if (this.aClass6_Sub1_Sub1_Sub4_16 == null) {
						this.aClass6_Sub1_Sub1_Sub4_16 = arg0.aClass6_Sub1_Sub1_Sub4_2;
						this.aClass6_Sub1_Sub1_Sub4_17 = arg0.aClass6_Sub1_Sub1_Sub4_1;
					}
					if (this.aBoolean268) {
						arg0.aClass6_Sub1_Sub1_Sub4_2 = this.aClass6_Sub1_Sub1_Sub4_16;
					} else {
						arg0.aClass6_Sub1_Sub1_Sub4_2 = this.aClass6_Sub1_Sub1_Sub4_17;
					}
				} else if (local8 == 600) {
					arg0.aString11 = this.aString20;
					if (anInt936 % 20 < 10) {
						arg0.aString11 = arg0.aString11 + "|";
					} else {
						arg0.aString11 = arg0.aString11 + " ";
					}
				} else {
					if (local8 == 620) {
						if (this.anInt1003 < 1) {
							arg0.aString11 = "";
						} else if (this.aBoolean273) {
							arg0.anInt659 = 16711680;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt659 = 16777215;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(636) String local636;
					if (local8 == 660) {
						local64 = this.anInt960 - this.anInt1011;
						if (local64 <= 0) {
							local636 = "earlier today";
						} else if (local64 == 1) {
							local636 = "yesterday";
						} else {
							local636 = local64 + " days ago";
						}
						arg0.aString11 = "You last logged in @red@" + local636 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local8 == 661) {
						if (this.anInt968 == 0) {
							arg0.aString11 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt968 <= this.anInt960) {
							arg0.aString11 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method635(this.anInt968);
						} else {
							local64 = this.anInt960 + 14 - this.anInt968;
							if (local64 <= 0) {
								local636 = "Earlier today";
							} else if (local64 == 1) {
								local636 = "Yesterday";
							} else {
								local636 = local64 + " days ago";
							}
							arg0.aString11 = local636 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method635(this.anInt968) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local8 == 662) {
						@Pc(754) String local754;
						if (this.anInt1057 == 0) {
							local754 = "@yel@0 unread messages";
						} else if (this.anInt1057 == 1) {
							local754 = "@gre@1 unread message";
						} else {
							local754 = "@gre@" + this.anInt1057 + " unread messages";
						}
						arg0.aString11 = "You have " + local754 + "\\nin your message centre.";
					}
					if (local8 == 663) {
						if (this.anInt1079 > 0 && this.anInt1079 <= this.anInt960 + 10) {
							arg0.aString11 = "Last password change:\\n@gre@" + this.method635(this.anInt1079);
						} else {
							arg0.aString11 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local8 == 665) {
						if (this.anInt1089 > 2 && !aBoolean251) {
							arg0.aString11 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt1089 > 2) {
							arg0.aString11 = "\\n\\nYou have @gre@" + this.anInt1089 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt1089 > 0) {
							arg0.aString11 = "You have @gre@" + this.anInt1089 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString11 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local8 == 667) {
						if (this.anInt1089 > 2 && !aBoolean251) {
							arg0.aString11 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt1089 > 0) {
							arg0.aString11 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString11 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local8 == 668) {
						if (this.anInt968 > this.anInt960) {
							arg0.aString11 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString11 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local8 == 1 && this.anInt1024 == 0) {
				arg0.aString11 = "Loading friend list";
				arg0.anInt675 = 0;
			} else if (local8 == 1 && this.anInt1024 == 1) {
				arg0.aString11 = "Connecting to friendserver";
				arg0.anInt675 = 0;
			} else if (local8 == 2 && this.anInt1024 != 2) {
				arg0.aString11 = "Please wait...";
				arg0.anInt675 = 0;
			} else {
				local64 = this.anInt1023;
				if (this.anInt1024 != 2) {
					local64 = 0;
				}
				if (local8 > 700) {
					local8 -= 601;
				} else {
					local8--;
				}
				if (local8 >= local64) {
					arg0.aString11 = "";
					arg0.anInt675 = 0;
				} else {
					arg0.aString11 = this.aStringArray14[local8];
					arg0.anInt675 = 1;
				}
			}
		} catch (@Pc(911) RuntimeException local911) {
			signlink.reporterror("6842, " + arg0 + ", " + 0 + ", " + local911.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private String method635(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt960 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(30) int local30 = local16.get(2);
			@Pc(34) int local34 = local16.get(1);
			@Pc(94) String[] local94 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local94[local30] + "-" + local34;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("11621, " + 5 + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method636() {
		try {
			for (@Pc(13) Class6_Sub1_Sub2_Sub1 local13 = (Class6_Sub1_Sub2_Sub1) this.aClass5_11.method33(); local13 != null; local13 = (Class6_Sub1_Sub2_Sub1) this.aClass5_11.method35((byte) 8)) {
				if (local13.anInt120 != this.anInt989 || local13.aBoolean44) {
					local13.method548();
				} else if (anInt936 >= local13.anInt119) {
					local13.method98(this.anInt984);
					if (local13.aBoolean44) {
						local13.method548();
					} else {
						this.aClass32_1.method330(local13.anInt122, local13.anInt123, -1, 0, local13.anInt120, false, local13.anInt121, local13, 60);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("29898, " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIII)V")
	private void method637(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass6_Sub1_Sub1_Sub3_4.method535(arg2, arg3);
			this.aClass6_Sub1_Sub1_Sub3_5.method535(arg2, arg3 + arg1 - 16);
			Class6_Sub1_Sub1.method555((byte) 4, arg3 + 16, arg2, this.anInt988, arg1 - 32, 16);
			@Pc(35) int local35 = (arg1 - 32) * arg1 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(62) int local62 = (arg1 - local35 - 32) * arg4 / (arg0 - arg1);
			Class6_Sub1_Sub1.method555((byte) 4, arg3 + local62 + 16, arg2, this.anInt1051, local35, 16);
			Class6_Sub1_Sub1.method560(this.anInt926, this.anInt922, local35, arg3 + local62 + 16, arg2);
			Class6_Sub1_Sub1.method560(this.anInt926, this.anInt922, local35, arg3 + local62 + 16, arg2 + 1);
			Class6_Sub1_Sub1.method558(arg2, 16, 893, arg3 + local62 + 16, this.anInt922);
			Class6_Sub1_Sub1.method558(arg2, 16, 893, arg3 + local62 + 17, this.anInt922);
			Class6_Sub1_Sub1.method560(this.anInt926, this.anInt961, local35, arg3 + local62 + 16, arg2 + 15);
			Class6_Sub1_Sub1.method560(this.anInt926, this.anInt961, local35 - 1, arg3 + 17 + local62, arg2 + 14);
			Class6_Sub1_Sub1.method558(arg2, 16, 893, arg3 + local62 + local35 + 15, this.anInt961);
			Class6_Sub1_Sub1.method558(arg2 + 1, 15, 893, arg3 + local62 + local35 + 14, this.anInt961);
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("61499, " + arg0 + ", " + 89 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method638() {
		try {
			@Pc(8) int local8;
			if (this.anInt982 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt982 > 768) {
						this.anIntArray239[local8] = this.method628(1024 - this.anInt982, this.anIntArray241[local8], this.anIntArray240[local8]);
					} else if (this.anInt982 > 256) {
						this.anIntArray239[local8] = this.anIntArray241[local8];
					} else {
						this.anIntArray239[local8] = this.method628(256 - this.anInt982, this.anIntArray240[local8], this.anIntArray241[local8]);
					}
				}
			} else if (this.anInt983 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt983 > 768) {
						this.anIntArray239[local8] = this.method628(1024 - this.anInt983, this.anIntArray242[local8], this.anIntArray240[local8]);
					} else if (this.anInt983 > 256) {
						this.anIntArray239[local8] = this.anIntArray242[local8];
					} else {
						this.anIntArray239[local8] = this.method628(256 - this.anInt983, this.anIntArray240[local8], this.anIntArray242[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray239[local8] = this.anIntArray240[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass15_10.anIntArray43[local8] = this.aClass6_Sub1_Sub1_Sub4_14.anIntArray209[local8];
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
				local198 = this.anIntArray264[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray245[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray239[local220];
						local239 = this.aClass15_10.anIntArray43[local183];
						this.aClass15_10.anIntArray43[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass15_10.method122(super.aGraphics2, 966, 0, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass15_11.anIntArray43[local198] = this.aClass6_Sub1_Sub1_Sub4_15.anIntArray209[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray264[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray245[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray239[local228];
						@Pc(373) int local373 = this.aClass15_11.anIntArray43[local183];
						this.aClass15_11.anIntArray43[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass15_11.method122(super.aGraphics2, 966, 0, 637);
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("60596, " + 3 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method640(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt1023; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray14[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass6_Sub1_Sub2_Sub3_Sub1_1.aString5);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("35795, " + true + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method641(@OriginalArg(1) boolean arg0) {
		try {
			this.method658();
			this.aClass15_9.method121();
			this.aClass6_Sub1_Sub1_Sub3_14.method535(0, 0);
			@Pc(50) byte local50;
			@Pc(62) int local62;
			if (this.anInt986 == 0) {
				this.aClass6_Sub1_Sub1_Sub2_2.method206(180, 7711145, true, 180, this.aClass22_Sub1_1.aString7);
				local50 = 80;
				this.aClass6_Sub1_Sub1_Sub2_4.method206(80, 16776960, true, 180, "Welcome to RuneScape");
				local62 = local50 + 30;
				this.aClass6_Sub1_Sub1_Sub3_15.method535(27, 100);
				this.aClass6_Sub1_Sub1_Sub2_4.method206(125, 16777215, true, 100, "New User");
				this.aClass6_Sub1_Sub1_Sub3_15.method535(187, 100);
				this.aClass6_Sub1_Sub1_Sub2_4.method206(125, 16777215, true, 260, "Existing User");
			}
			if (this.anInt986 == 2) {
				local50 = 60;
				if (this.aString22.length() > 0) {
					this.aClass6_Sub1_Sub1_Sub2_4.method206(45, 16776960, true, 180, this.aString22);
					this.aClass6_Sub1_Sub1_Sub2_4.method206(60, 16776960, true, 180, this.aString23);
					local62 = local50 + 30;
				} else {
					this.aClass6_Sub1_Sub1_Sub2_4.method206(53, 16776960, true, 180, this.aString23);
					local62 = local50 + 30;
				}
				this.aClass6_Sub1_Sub1_Sub2_4.method213("Username: " + this.aString27 + (this.anInt1073 == 0 & anInt936 % 40 < 20 ? "@yel@|" : ""), 90, 90, true, 16777215);
				local62 += 15;
				this.aClass6_Sub1_Sub1_Sub2_4.method213("Password: " + Class38.method458(this.aString28) + (this.anInt1073 == 1 & anInt936 % 40 < 20 ? "@yel@|" : ""), 92, 105, true, 16777215);
				local62 += 15;
				if (!arg0) {
					this.aClass6_Sub1_Sub1_Sub3_15.method535(27, 130);
					this.aClass6_Sub1_Sub1_Sub2_4.method206(155, 16777215, true, 100, "Login");
					this.aClass6_Sub1_Sub1_Sub3_15.method535(187, 130);
					this.aClass6_Sub1_Sub1_Sub2_4.method206(155, 16777215, true, 260, "Cancel");
				}
			}
			if (this.anInt986 == 3) {
				this.aClass6_Sub1_Sub1_Sub2_4.method206(40, 16776960, true, 180, "Create a free account");
				local50 = 65;
				this.aClass6_Sub1_Sub1_Sub2_4.method206(65, 16777215, true, 180, "To create a new account you need to");
				local62 = local50 + 15;
				this.aClass6_Sub1_Sub1_Sub2_4.method206(80, 16777215, true, 180, "go back to the main RuneScape webpage");
				local62 += 15;
				this.aClass6_Sub1_Sub1_Sub2_4.method206(95, 16777215, true, 180, "and choose the 'create account'");
				local62 += 15;
				this.aClass6_Sub1_Sub1_Sub2_4.method206(110, 16777215, true, 180, "button near the top of that page.");
				local62 += 15;
				this.aClass6_Sub1_Sub1_Sub3_15.method535(107, 130);
				this.aClass6_Sub1_Sub1_Sub2_4.method206(155, 16777215, true, 180, "Cancel");
			}
			this.aClass15_9.method122(super.aGraphics2, 966, 171, 202);
			if (this.aBoolean259) {
				this.aBoolean259 = false;
				this.aClass15_7.method122(super.aGraphics2, 966, 0, 128);
				this.aClass15_8.method122(super.aGraphics2, 966, 371, 202);
				this.aClass15_12.method122(super.aGraphics2, 966, 265, 0);
				this.aClass15_13.method122(super.aGraphics2, 966, 265, 562);
				this.aClass15_14.method122(super.aGraphics2, 966, 171, 128);
				this.aClass15_15.method122(super.aGraphics2, 966, 171, 562);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("62673, " + 6 + ", " + arg0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method642() {
		try {
			this.aBoolean261 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean248) {
					this.anInt1008++;
					this.method691();
					this.method691();
					this.method638();
					local6++;
					if (local6 > 10) {
						@Pc(31) long local31 = System.currentTimeMillis();
						@Pc(40) int local40 = (int) (local31 - local4) / 10 - local8;
						local8 = 40 - local40;
						if (local8 < 5) {
							local8 = 5;
						}
						local6 = 0;
						local4 = local31;
					}
					try {
						Thread.sleep((long) local8);
					} catch (@Pc(58) Exception local58) {
					}
				}
			} catch (@Pc(64) Exception local64) {
			}
			this.aBoolean261 = false;
			this.anInt1013 += 0;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("86266, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!RGCGKKUR;)V")
	private void method643(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1_Sub4 arg1) {
		try {
			this.anInt893 = 0;
			this.anInt873 = 0;
			this.method591(arg0, arg1);
			this.method597(arg1, arg0);
			this.method614(arg1, arg0);
			@Pc(45) int local45;
			for (@Pc(38) int local38 = 0; local38 < this.anInt893; local38++) {
				local45 = this.anIntArray231[local38];
				if (this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local45].anInt559 != anInt936) {
					this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local45].aClass47_2 = null;
					this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local45] = null;
				}
			}
			if (arg1.anInt704 != arg0) {
				signlink.reporterror(this.aString27 + " size mismatch in getnpcpos - pos:" + arg1.anInt704 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local45 = 0; local45 < this.anInt884; local45++) {
				if (this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray228[local45]] == null) {
					signlink.reporterror(this.aString27 + " null entry in npc list - pos:" + local45 + " size:" + this.anInt884);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("33026, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method644(@OriginalArg(0) byte arg0) {
		try {
			try {
				if (this.aClass41_1 != null) {
					this.aClass41_1.method461();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass41_1 = null;
			@Pc(17) boolean local17 = false;
			this.aBoolean243 = false;
			this.anInt986 = 0;
			this.aString27 = "";
			this.aString28 = "";
			this.method657();
			this.aClass32_1.method319();
			for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
				this.aClass3Array1[local48].method5();
			}
			System.gc();
			this.method710();
			this.anInt939 = -1;
			this.anInt907 = -1;
			this.anInt1004 = 0;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("15672, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	private void method645(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		try {
			if (this.anInt1046 != 22761) {
				this.anInt1014 = -1;
			}
			@Pc(18) int local18;
			if (this.aClass15_5 != null) {
				this.aClass15_5.method121();
				Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
				local18 = 151;
				if (arg0 != null) {
					local18 -= 7;
				}
				this.aClass6_Sub1_Sub1_Sub2_3.method205(257, 0, arg1, local18);
				this.aClass6_Sub1_Sub1_Sub2_3.method205(256, 16777215, arg1, local18 - 1);
				local18 += 15;
				if (arg0 != null) {
					this.aClass6_Sub1_Sub1_Sub2_3.method205(257, 0, arg0, local18);
					this.aClass6_Sub1_Sub1_Sub2_3.method205(256, 16777215, arg0, local18 - 1);
				}
				this.aClass15_5.method122(super.aGraphics2, 966, 4, 4);
			} else if (super.aClass15_2 != null) {
				super.aClass15_2.method121();
				Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray274;
				local18 = 251;
				Class6_Sub1_Sub1.method555((byte) 4, 221, 233, 0, 50, 300);
				Class6_Sub1_Sub1.method556(50, 221, 606, 233, 16777215, 300);
				if (arg0 != null) {
					local18 -= 7;
				}
				this.aClass6_Sub1_Sub1_Sub2_3.method205(383, 0, arg1, local18);
				this.aClass6_Sub1_Sub1_Sub2_3.method205(382, 16777215, arg1, local18 - 1);
				local18 += 15;
				if (arg0 != null) {
					this.aClass6_Sub1_Sub1_Sub2_3.method205(383, 0, arg0, local18);
					this.aClass6_Sub1_Sub1_Sub2_3.method205(382, 16777215, arg0, local18 - 1);
				}
				super.aClass15_2.method122(super.aGraphics2, 966, 0, 0);
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("99734, " + arg0 + ", " + arg1 + ", " + 22761 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RGCGKKUR;II)V")
	private void method646(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0.method421(this.anInt923);
			@Pc(7) boolean local7 = false;
			@Pc(12) int local12 = arg0.method422(1);
			if (local12 != 0) {
				@Pc(20) int local20 = arg0.method422(2);
				if (local20 == 0) {
					this.anIntArray224[this.anInt873++] = this.anInt871;
				} else {
					@Pc(43) int local43;
					@Pc(54) int local54;
					if (local20 == 1) {
						local43 = arg0.method422(3);
						aClass6_Sub1_Sub2_Sub3_Sub1_1.method305(local43, false, this.anInt979);
						local54 = arg0.method422(1);
						if (local54 == 1) {
							this.anIntArray224[this.anInt873++] = this.anInt871;
						}
					} else {
						@Pc(100) int local100;
						if (local20 == 2) {
							local43 = arg0.method422(3);
							aClass6_Sub1_Sub2_Sub3_Sub1_1.method305(local43, true, this.anInt979);
							local54 = arg0.method422(3);
							aClass6_Sub1_Sub2_Sub3_Sub1_1.method305(local54, true, this.anInt979);
							local100 = arg0.method422(1);
							if (local100 == 1) {
								this.anIntArray224[this.anInt873++] = this.anInt871;
							}
						} else if (local20 == 3) {
							this.anInt989 = arg0.method422(2);
							local43 = arg0.method422(7);
							local54 = arg0.method422(1);
							if (local54 == 1) {
								this.anIntArray224[this.anInt873++] = this.anInt871;
							}
							local100 = arg0.method422(7);
							@Pc(160) int local160 = arg0.method422(1);
							aClass6_Sub1_Sub2_Sub3_Sub1_1.method304(local43, local100, local160 == 1);
						}
					}
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("61026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method647(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt963 != 0) {
				@Pc(6) Class6_Sub1_Sub1_Sub2 local6 = this.aClass6_Sub1_Sub1_Sub2_3;
				@Pc(8) int local8 = 0;
				if (this.anInt1050 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray13[local15] != null) {
						@Pc(27) int local27 = this.anIntArray261[local15];
						@Pc(32) String local32 = this.aStringArray12[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt980 == 0 || this.anInt980 == 1 && this.method640(local32))) {
							local85 = 329 - local8 * 13;
							local6.method209(0, "From", local85, 4);
							local6.method209(65535, "From", local85 - 1, 4);
							@Pc(110) int local110 = local6.method207("From ") + 4;
							if (local34 == 1) {
								this.aClass6_Sub1_Sub1_Sub3Array3[0].method535(local110, local85 - 12);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass6_Sub1_Sub1_Sub3Array3[1].method535(local110, local85 - 12);
								local110 += 14;
							}
							local6.method209(0, local32 + ": " + this.aStringArray13[local15], local85, local110);
							local6.method209(65535, local32 + ": " + this.aStringArray13[local15], local85 - 1, local110);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt980 < 2) {
							local85 = 329 - local8 * 13;
							local6.method209(0, this.aStringArray13[local15], local85, 4);
							local6.method209(65535, this.aStringArray13[local15], local85 - 1, 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt980 < 2) {
							local85 = 329 - local8 * 13;
							local6.method209(0, "To " + local32 + ": " + this.aStringArray13[local15], local85, 4);
							local6.method209(65535, "To " + local32 + ": " + this.aStringArray13[local15], local85 - 1, 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				@Pc(291) int local291 = 68 / arg0;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("7479, " + arg0 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIII)V")
	private void method648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(3) Class6_Sub2 local3 = null;
			for (@Pc(8) Class6_Sub2 local8 = (Class6_Sub2) this.aClass5_10.method33(); local8 != null; local8 = (Class6_Sub2) this.aClass5_10.method35((byte) 8)) {
				if (local8.anInt167 == arg7 && local8.anInt169 == arg2 && local8.anInt170 == arg3 && local8.anInt168 == arg6) {
					local3 = local8;
					break;
				}
			}
			if (local3 == null) {
				local3 = new Class6_Sub2();
				local3.anInt167 = arg7;
				local3.anInt168 = arg6;
				local3.anInt169 = arg2;
				local3.anInt170 = arg3;
				this.method690(local3);
				this.aClass5_10.method30(local3);
			}
			local3.anInt173 = arg1;
			local3.anInt175 = arg5;
			local3.anInt174 = arg4;
			local3.anInt172 = arg0;
			local3.anInt171 = arg8;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("41341, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method649(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean252) {
				for (@Pc(10) int local10 = 0; local10 < this.anIntArray267.length; local10++) {
					@Pc(17) int local17 = this.anIntArray267[local10];
					if (Class6_Sub1_Sub1_Sub1.anIntArray14[local17] >= arg0) {
						@Pc(26) Class6_Sub1_Sub1_Sub3 local26 = Class6_Sub1_Sub1_Sub1.aClass6_Sub1_Sub1_Sub3Array1[local17];
						@Pc(34) int local34 = local26.anInt779 * local26.anInt780 - 1;
						@Pc(42) int local42 = local26.anInt779 * this.anInt984 * 2;
						@Pc(45) byte[] local45 = local26.aByteArray19;
						@Pc(48) byte[] local48 = this.aByteArray21;
						for (@Pc(50) int local50 = 0; local50 <= local34; local50++) {
							local48[local50] = local45[local50 - local42 & local34];
						}
						local26.aByteArray19 = local48;
						this.aByteArray21 = local45;
						Class6_Sub1_Sub1_Sub1.method76(local17);
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("60865, " + false + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method650(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			this.aBoolean265 = true;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray255[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class16.anInt308; local19++) {
					if (!Class16.aClass16Array1[local19].aBoolean76 && Class16.aClass16Array1[local19].anInt309 == local10 + (this.aBoolean268 ? 0 : 7)) {
						this.anIntArray255[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("42209, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method584() {
		try {
			this.aBoolean259 = true;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("84948, " + false + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method651(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt886 >= 2 || this.anInt888 != 0 || this.anInt1085 != 0) {
				@Pc(31) String local31;
				if (this.anInt888 == 1 && this.anInt886 < 2) {
					local31 = "Use " + this.aString17 + " with...";
				} else if (this.anInt1085 == 1 && this.anInt886 < 2) {
					local31 = this.aString31 + "...";
				} else {
					local31 = this.aStringArray9[this.anInt886 - 1];
				}
				if (this.anInt886 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt886 - 2) + " more options";
				}
				this.aClass6_Sub1_Sub1_Sub2_4.method214(15, local31, 856, 4, 16777215, anInt936 / 1000);
				if (arg0 == 7) {
					@Pc(98) boolean local98 = false;
				} else {
					this.anInt1046 = this.aClass18_2.method155();
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("58476, " + arg0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method652() {
		try {
			@Pc(21) int local21;
			for (@Pc(13) int local13 = -1; local13 < this.anInt872; local13++) {
				if (local13 == -1) {
					local21 = this.anInt871;
				} else {
					local21 = this.anIntArray223[local13];
				}
				@Pc(33) Class6_Sub1_Sub2_Sub3_Sub1 local33 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local21];
				if (local33 != null && local33.anInt542 > 0) {
					local33.anInt542--;
					if (local33.anInt542 == 0) {
						local33.aString8 = null;
					}
				}
			}
			for (local21 = 0; local21 < this.anInt884; local21++) {
				@Pc(64) int local64 = this.anIntArray228[local21];
				@Pc(69) Class6_Sub1_Sub2_Sub3_Sub2 local69 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local64];
				if (local69 != null && local69.anInt542 > 0) {
					local69.anInt542--;
					if (local69.anInt542 == 0) {
						local69.aString8 = null;
					}
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("8869, " + 6 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)V")
	private void method653(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				if (this.aStringArray13[local14] != null) {
					@Pc(26) int local26 = this.anIntArray261[local14];
					@Pc(37) int local37 = this.anInt909 + 70 + 4 - local12 * 14;
					if (local37 < -20) {
						break;
					}
					@Pc(45) String local45 = this.aStringArray12[local14];
					if (local45 != null && local45.startsWith("@cr1@")) {
						local45 = local45.substring(5);
					}
					if (local45 != null && local45.startsWith("@cr2@")) {
						local45 = local45.substring(5);
					}
					if (local26 == 0) {
						local12++;
					}
					if ((local26 == 1 || local26 == 2) && (local26 == 1 || this.anInt932 == 0 || this.anInt932 == 1 && this.method640(local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37 && !local45.equals(aClass6_Sub1_Sub2_Sub3_Sub1_1.aString5)) {
							if (this.anInt1003 >= 1) {
								this.aStringArray9[this.anInt886] = "Report abuse @whi@" + local45;
								this.anIntArray258[this.anInt886] = 541;
								this.anInt886++;
							}
							this.aStringArray9[this.anInt886] = "Add ignore @whi@" + local45;
							this.anIntArray258[this.anInt886] = 997;
							this.anInt886++;
							this.aStringArray9[this.anInt886] = "Add friend @whi@" + local45;
							this.anIntArray258[this.anInt886] = 138;
							this.anInt886++;
						}
						local12++;
					}
					if ((local26 == 3 || local26 == 7) && this.anInt963 == 0 && (local26 == 7 || this.anInt980 == 0 || this.anInt980 == 1 && this.method640(local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							if (this.anInt1003 >= 1) {
								this.aStringArray9[this.anInt886] = "Report abuse @whi@" + local45;
								this.anIntArray258[this.anInt886] = 541;
								this.anInt886++;
							}
							this.aStringArray9[this.anInt886] = "Add ignore @whi@" + local45;
							this.anIntArray258[this.anInt886] = 997;
							this.anInt886++;
							this.aStringArray9[this.anInt886] = "Add friend @whi@" + local45;
							this.anIntArray258[this.anInt886] = 138;
							this.anInt886++;
						}
						local12++;
					}
					if (local26 == 4 && (this.anInt1025 == 0 || this.anInt1025 == 1 && this.method640(local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							this.aStringArray9[this.anInt886] = "Accept trade @whi@" + local45;
							this.anIntArray258[this.anInt886] = 119;
							this.anInt886++;
						}
						local12++;
					}
					if ((local26 == 5 || local26 == 6) && this.anInt963 == 0 && this.anInt980 < 2) {
						local12++;
					}
					if (local26 == 8 && (this.anInt1025 == 0 || this.anInt1025 == 1 && this.method640(local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							this.aStringArray9[this.anInt886] = "Accept challenge @whi@" + local45;
							this.anIntArray258[this.anInt886] = 875;
							this.anInt886++;
						}
						local12++;
					}
				}
			}
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("22621, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)Z")
	private boolean method654(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("73518, " + arg0 + ", " + true + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method655() {
		try {
			@Pc(4) Graphics local4 = this.method585().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method578();
			@Pc(44) byte local44;
			@Pc(50) int local50;
			if (this.aBoolean258) {
				this.aBoolean248 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local44 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local50 = local44 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(59) int local59 = local50 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(76) int local76 = local59 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(82) int local82 = local76 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(88) int local88 = local82 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(94) int local94 = local88 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean254) {
				this.aBoolean248 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean229) {
				this.aBoolean248 = false;
				local4.setColor(Color.yellow);
				local44 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local50 = local44 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local50 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local50 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local50 += 30;
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("17203, " + 1 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!RGCGKKUR;)V")
	private void method656(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1_Sub4 arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt873; local12++) {
				@Pc(19) int local19 = this.anIntArray224[local12];
				@Pc(24) Class6_Sub1_Sub2_Sub3_Sub1 local24 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local19];
				@Pc(27) int local27 = arg1.method411();
				if ((local27 & 0x20) != 0) {
					local27 += arg1.method411() << 8;
				}
				this.method633(local24, arg1, local19, local27);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("14531, " + -26716 + ", " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method657() {
		try {
			Class28.aClass36_6.method396();
			Class28.aClass36_5.method396();
			Class47.aClass36_9.method396();
			Class4.aClass36_1.method396();
			Class4.aClass36_2.method396();
			Class6_Sub1_Sub2_Sub3_Sub1.aClass36_4.method396();
			Class12.aClass36_3.method396();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("46553, " + -751 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method658() {
		try {
			if (this.aClass15_7 == null) {
				super.aClass15_2 = null;
				this.aClass15_6 = null;
				this.aClass15_4 = null;
				this.aClass15_3 = null;
				this.aClass15_5 = null;
				this.aClass15_16 = null;
				this.aClass15_17 = null;
				this.aClass15_18 = null;
				this.aClass15_10 = new Class15(this.method585(), 265, 45981, 128);
				Class6_Sub1_Sub1.method553();
				this.aClass15_11 = new Class15(this.method585(), 265, 45981, 128);
				Class6_Sub1_Sub1.method553();
				this.aClass15_7 = new Class15(this.method585(), 171, 45981, 509);
				Class6_Sub1_Sub1.method553();
				this.aClass15_8 = new Class15(this.method585(), 132, 45981, 360);
				Class6_Sub1_Sub1.method553();
				this.aClass15_9 = new Class15(this.method585(), 200, 45981, 360);
				Class6_Sub1_Sub1.method553();
				this.aClass15_12 = new Class15(this.method585(), 238, 45981, 202);
				Class6_Sub1_Sub1.method553();
				this.aClass15_13 = new Class15(this.method585(), 238, 45981, 203);
				Class6_Sub1_Sub1.method553();
				this.aClass15_14 = new Class15(this.method585(), 94, 45981, 74);
				Class6_Sub1_Sub1.method553();
				this.aClass15_15 = new Class15(this.method585(), 94, 45981, 75);
				Class6_Sub1_Sub1.method553();
				if (this.aClass11_2 != null) {
					this.method612();
					this.method594(180);
				}
				this.aBoolean259 = true;
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("90642, " + -453 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method659(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt884; local4++) {
				@Pc(14) Class6_Sub1_Sub2_Sub3_Sub2 local14 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray228[local4]];
				@Pc(23) int local23 = (this.anIntArray228[local4] << 14) + 536870912;
				if (local14 != null && local14.method306() && local14.aClass47_2.aBoolean212 == arg0 && local14.aClass47_2.method543((byte) 4)) {
					@Pc(44) int local44 = local14.anInt535 >> 7;
					@Pc(49) int local49 = local14.anInt536 >> 7;
					if (local44 >= 0 && local44 < 104 && local49 >= 0 && local49 < 104) {
						if (local14.anInt526 == 1 && (local14.anInt535 & 0x7F) == 64 && (local14.anInt536 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local44][local49] == this.anInt1027) {
								continue;
							}
							this.anIntArrayArray22[local44][local49] = this.anInt1027;
						}
						if (!local14.aClass47_2.aBoolean211) {
							local23 += Integer.MIN_VALUE;
						}
						this.aClass32_1.method330(local14.anInt536, this.method595(local14.anInt535, local14.anInt536, this.anInt989), local23, local14.anInt537, this.anInt989, local14.aBoolean145, local14.anInt535, local14, (local14.anInt526 - 1) * 64 + 60);
					}
				}
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("47821, " + arg0 + ", " + 229 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)Z")
	private boolean method660() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("46309, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method661() {
		try {
			if (super.aClass15_2 == null) {
				this.method704();
				this.aClass15_7 = null;
				this.aClass15_8 = null;
				this.aClass15_9 = null;
				this.aClass15_10 = null;
				this.aClass15_11 = null;
				this.aClass15_12 = null;
				this.aClass15_13 = null;
				this.aClass15_14 = null;
				this.aClass15_15 = null;
				this.aClass15_6 = null;
				this.aClass15_4 = null;
				this.aClass15_3 = null;
				this.aClass15_5 = null;
				this.aClass15_16 = null;
				this.aClass15_17 = null;
				this.aClass15_18 = null;
				super.aClass15_2 = new Class15(this.method585(), 503, 45981, 765);
				this.aBoolean259 = true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("15833, " + 226 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method580() {
		this.method587("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt846 = 5;
		}
		if (aBoolean242) {
			this.aBoolean229 = true;
			return;
		}
		aBoolean242 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method599();
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
			this.aBoolean254 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass14Array1[local101] = new Class14(500000, local101 + 1, (byte) 7, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local101]);
			}
		}
		try {
			this.method721();
			this.aClass11_2 = this.method725(1, "title screen", 25, "title", this.anIntArray270[1]);
			this.aClass6_Sub1_Sub1_Sub2_2 = new Class6_Sub1_Sub1_Sub2("p11_full", (byte) -40, false, this.aClass11_2);
			this.aClass6_Sub1_Sub1_Sub2_3 = new Class6_Sub1_Sub1_Sub2("p12_full", (byte) -40, false, this.aClass11_2);
			this.aClass6_Sub1_Sub1_Sub2_4 = new Class6_Sub1_Sub1_Sub2("b12_full", (byte) -40, false, this.aClass11_2);
			this.aClass6_Sub1_Sub1_Sub2_5 = new Class6_Sub1_Sub1_Sub2("q8_full", (byte) -40, true, this.aClass11_2);
			this.method612();
			this.method594(180);
			@Pc(197) Class11 local197 = this.method725(2, "config", 30, "config", this.anIntArray270[2]);
			@Pc(209) Class11 local209 = this.method725(3, "interface", 35, "interface", this.anIntArray270[3]);
			@Pc(221) Class11 local221 = this.method725(4, "2d graphics", 40, "media", this.anIntArray270[4]);
			@Pc(233) Class11 local233 = this.method725(6, "textures", 45, "textures", this.anIntArray270[6]);
			@Pc(245) Class11 local245 = this.method725(7, "chat system", 50, "wordenc", this.anIntArray270[7]);
			@Pc(257) Class11 local257 = this.method725(8, "sound effects", 55, "sounds", this.anIntArray270[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass32_1 = new Class32(this.anIntArrayArrayArray8, 104, 4, (byte) 72, 104);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass3Array1[local282] = new Class3(0, 104, 104);
			}
			this.aClass6_Sub1_Sub1_Sub4_13 = new Class6_Sub1_Sub1_Sub4(512, 512);
			@Pc(317) Class11 local317 = this.method725(5, "update list", 60, "versionlist", this.anIntArray270[5]);
			this.method587("Connecting to update server", 60);
			this.aClass22_Sub1_1 = new Class22_Sub1();
			this.aClass22_Sub1_1.method288(local317, this);
			Class34.method374(this.aClass22_Sub1_1.method287());
			Class6_Sub1_Sub2_Sub5.method225(this.aClass22_Sub1_1.method294(0), this.aClass22_Sub1_1);
			if (!aBoolean252) {
				this.anInt907 = 0;
				this.aBoolean241 = true;
				this.aClass22_Sub1_1.method283(2, this.anInt907);
				while (this.aClass22_Sub1_1.method285() > 0) {
					this.method602((byte) 3);
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass22_Sub1_1.anInt497 > 3) {
						this.method702("ondemand");
						return;
					}
				}
			}
			this.method587("Requesting animations", 65);
			@Pc(392) int local392 = this.aClass22_Sub1_1.method294(1);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass22_Sub1_1.method283(1, local394);
			}
			@Pc(413) int local413;
			while (this.aClass22_Sub1_1.method285() > 0) {
				local413 = local392 - this.aClass22_Sub1_1.method285();
				if (local413 > 0) {
					this.method587("Loading animations - " + local413 * 100 / local392 + "%", 65);
				}
				this.method602((byte) 3);
				try {
					Thread.sleep(100L);
				} catch (@Pc(439) Exception local439) {
				}
				if (this.aClass22_Sub1_1.anInt497 > 3) {
					this.method702("ondemand");
					return;
				}
			}
			this.method587("Requesting models", 70);
			local392 = this.aClass22_Sub1_1.method294(0);
			@Pc(473) int local473;
			for (local413 = 0; local413 < local392; local413++) {
				local473 = this.aClass22_Sub1_1.method299(local413);
				if ((local473 & 0x1) != 0) {
					this.aClass22_Sub1_1.method283(0, local413);
				}
			}
			local392 = this.aClass22_Sub1_1.method285();
			while (this.aClass22_Sub1_1.method285() > 0) {
				local473 = local392 - this.aClass22_Sub1_1.method285();
				if (local473 > 0) {
					this.method587("Loading models - " + local473 * 100 / local392 + "%", 70);
				}
				this.method602((byte) 3);
				try {
					Thread.sleep(100L);
				} catch (@Pc(524) Exception local524) {
				}
			}
			if (this.aClass14Array1[0] != null) {
				this.method587("Requesting maps", 75);
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(48, 47, 0));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(48, 47, 1));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(48, 48, 0));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(48, 48, 1));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(48, 49, 0));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(48, 49, 1));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(47, 47, 0));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(47, 47, 1));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(47, 48, 0));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(47, 48, 1));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(148, 48, 0));
				this.aClass22_Sub1_1.method283(3, this.aClass22_Sub1_1.method298(148, 48, 1));
				local392 = this.aClass22_Sub1_1.method285();
				while (this.aClass22_Sub1_1.method285() > 0) {
					local473 = local392 - this.aClass22_Sub1_1.method285();
					if (local473 > 0) {
						this.method587("Loading maps - " + local473 * 100 / local392 + "%", 75);
					}
					this.method602((byte) 3);
					try {
						Thread.sleep(100L);
					} catch (@Pc(709) Exception local709) {
					}
				}
			}
			local392 = this.aClass22_Sub1_1.method294(0);
			@Pc(730) int local730;
			for (local473 = 0; local473 < local392; local473++) {
				local730 = this.aClass22_Sub1_1.method299(local473);
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
					this.aClass22_Sub1_1.method291(0, local732, local473);
				}
			}
			this.aClass22_Sub1_1.method282(aBoolean251, anInt1066);
			if (!aBoolean252) {
				local392 = this.aClass22_Sub1_1.method294(2);
				for (local730 = 1; local730 < local392; local730++) {
					if (this.aClass22_Sub1_1.method286(local730)) {
						this.aClass22_Sub1_1.method291(2, (byte) 1, local730);
					}
				}
			}
			this.method587("Unpacking media", 80);
			this.aClass6_Sub1_Sub1_Sub3_1 = new Class6_Sub1_Sub1_Sub3(local221, "invback", 0);
			this.aClass6_Sub1_Sub1_Sub3_3 = new Class6_Sub1_Sub1_Sub3(local221, "chatback", 0);
			this.aClass6_Sub1_Sub1_Sub3_2 = new Class6_Sub1_Sub1_Sub3(local221, "mapback", 0);
			this.aClass6_Sub1_Sub1_Sub3_6 = new Class6_Sub1_Sub1_Sub3(local221, "backbase1", 0);
			this.aClass6_Sub1_Sub1_Sub3_7 = new Class6_Sub1_Sub1_Sub3(local221, "backbase2", 0);
			this.aClass6_Sub1_Sub1_Sub3_8 = new Class6_Sub1_Sub1_Sub3(local221, "backhmid1", 0);
			for (local730 = 0; local730 < 13; local730++) {
				this.aClass6_Sub1_Sub1_Sub3Array2[local730] = new Class6_Sub1_Sub1_Sub3(local221, "sideicons", local730);
			}
			this.aClass6_Sub1_Sub1_Sub4_12 = new Class6_Sub1_Sub1_Sub4(local221, "compass", 0);
			this.aClass6_Sub1_Sub1_Sub4_6 = new Class6_Sub1_Sub1_Sub4(local221, "mapedge", 0);
			this.aClass6_Sub1_Sub1_Sub4_6.method564();
			for (@Pc(932) int local932 = 0; local932 < 72; local932++) {
				this.aClass6_Sub1_Sub1_Sub3Array5[local932] = new Class6_Sub1_Sub1_Sub3(local221, "mapscene", local932);
			}
			for (@Pc(950) int local950 = 0; local950 < 63; local950++) {
				this.aClass6_Sub1_Sub1_Sub4Array7[local950] = new Class6_Sub1_Sub1_Sub4(local221, "mapfunction", local950);
			}
			for (@Pc(968) int local968 = 0; local968 < 5; local968++) {
				this.aClass6_Sub1_Sub1_Sub4Array9[local968] = new Class6_Sub1_Sub1_Sub4(local221, "hitmarks", local968);
			}
			for (@Pc(986) int local986 = 0; local986 < 6; local986++) {
				this.aClass6_Sub1_Sub1_Sub4Array6[local986] = new Class6_Sub1_Sub1_Sub4(local221, "headicons_pk", local986);
			}
			for (@Pc(1004) int local1004 = 0; local1004 < 9; local1004++) {
				this.aClass6_Sub1_Sub1_Sub4Array8[local1004] = new Class6_Sub1_Sub1_Sub4(local221, "headicons_prayer", local1004);
			}
			for (@Pc(1022) int local1022 = 0; local1022 < 6; local1022++) {
				this.aClass6_Sub1_Sub1_Sub4Array5[local1022] = new Class6_Sub1_Sub1_Sub4(local221, "headicons_hint", local1022);
			}
			this.aClass6_Sub1_Sub1_Sub4_5 = new Class6_Sub1_Sub1_Sub4(local221, "overlay_multiway", 0);
			this.aClass6_Sub1_Sub1_Sub4_3 = new Class6_Sub1_Sub1_Sub4(local221, "mapmarker", 0);
			this.aClass6_Sub1_Sub1_Sub4_4 = new Class6_Sub1_Sub1_Sub4(local221, "mapmarker", 1);
			for (@Pc(1064) int local1064 = 0; local1064 < 8; local1064++) {
				this.aClass6_Sub1_Sub1_Sub4Array4[local1064] = new Class6_Sub1_Sub1_Sub4(local221, "cross", local1064);
			}
			this.aClass6_Sub1_Sub1_Sub4_7 = new Class6_Sub1_Sub1_Sub4(local221, "mapdots", 0);
			this.aClass6_Sub1_Sub1_Sub4_8 = new Class6_Sub1_Sub1_Sub4(local221, "mapdots", 1);
			this.aClass6_Sub1_Sub1_Sub4_9 = new Class6_Sub1_Sub1_Sub4(local221, "mapdots", 2);
			this.aClass6_Sub1_Sub1_Sub4_10 = new Class6_Sub1_Sub1_Sub4(local221, "mapdots", 3);
			this.aClass6_Sub1_Sub1_Sub4_11 = new Class6_Sub1_Sub1_Sub4(local221, "mapdots", 4);
			this.aClass6_Sub1_Sub1_Sub3_4 = new Class6_Sub1_Sub1_Sub3(local221, "scrollbar", 0);
			this.aClass6_Sub1_Sub1_Sub3_5 = new Class6_Sub1_Sub1_Sub3(local221, "scrollbar", 1);
			this.aClass6_Sub1_Sub1_Sub3_9 = new Class6_Sub1_Sub1_Sub3(local221, "redstone1", 0);
			this.aClass6_Sub1_Sub1_Sub3_10 = new Class6_Sub1_Sub1_Sub3(local221, "redstone2", 0);
			this.aClass6_Sub1_Sub1_Sub3_11 = new Class6_Sub1_Sub1_Sub3(local221, "redstone3", 0);
			this.aClass6_Sub1_Sub1_Sub3_12 = new Class6_Sub1_Sub1_Sub3(local221, "redstone1", 0);
			this.aClass6_Sub1_Sub1_Sub3_12.method532(anInt970);
			this.aClass6_Sub1_Sub1_Sub3_13 = new Class6_Sub1_Sub1_Sub3(local221, "redstone2", 0);
			this.aClass6_Sub1_Sub1_Sub3_13.method532(anInt970);
			this.aClass6_Sub1_Sub1_Sub3_16 = new Class6_Sub1_Sub1_Sub3(local221, "redstone1", 0);
			this.aClass6_Sub1_Sub1_Sub3_16.method533();
			this.aClass6_Sub1_Sub1_Sub3_17 = new Class6_Sub1_Sub1_Sub3(local221, "redstone2", 0);
			this.aClass6_Sub1_Sub1_Sub3_17.method533();
			this.aClass6_Sub1_Sub1_Sub3_18 = new Class6_Sub1_Sub1_Sub3(local221, "redstone3", 0);
			this.aClass6_Sub1_Sub1_Sub3_18.method533();
			this.aClass6_Sub1_Sub1_Sub3_19 = new Class6_Sub1_Sub1_Sub3(local221, "redstone1", 0);
			this.aClass6_Sub1_Sub1_Sub3_19.method532(anInt970);
			this.aClass6_Sub1_Sub1_Sub3_19.method533();
			this.aClass6_Sub1_Sub1_Sub3_20 = new Class6_Sub1_Sub1_Sub3(local221, "redstone2", 0);
			this.aClass6_Sub1_Sub1_Sub3_20.method532(anInt970);
			this.aClass6_Sub1_Sub1_Sub3_20.method533();
			for (@Pc(1254) int local1254 = 0; local1254 < 2; local1254++) {
				this.aClass6_Sub1_Sub1_Sub3Array3[local1254] = new Class6_Sub1_Sub1_Sub3(local221, "mod_icons", local1254);
			}
			@Pc(1277) Class6_Sub1_Sub1_Sub4 local1277 = new Class6_Sub1_Sub1_Sub4(local221, "backleft1", 0);
			this.aClass15_19 = new Class15(this.method585(), local1277.anInt835, 45981, local1277.anInt834);
			local1277.method565(0, 0);
			@Pc(1302) Class6_Sub1_Sub1_Sub4 local1302 = new Class6_Sub1_Sub1_Sub4(local221, "backleft2", 0);
			this.aClass15_20 = new Class15(this.method585(), local1302.anInt835, 45981, local1302.anInt834);
			local1302.method565(0, 0);
			@Pc(1327) Class6_Sub1_Sub1_Sub4 local1327 = new Class6_Sub1_Sub1_Sub4(local221, "backright1", 0);
			this.aClass15_21 = new Class15(this.method585(), local1327.anInt835, 45981, local1327.anInt834);
			local1327.method565(0, 0);
			@Pc(1352) Class6_Sub1_Sub1_Sub4 local1352 = new Class6_Sub1_Sub1_Sub4(local221, "backright2", 0);
			this.aClass15_22 = new Class15(this.method585(), local1352.anInt835, 45981, local1352.anInt834);
			local1352.method565(0, 0);
			@Pc(1377) Class6_Sub1_Sub1_Sub4 local1377 = new Class6_Sub1_Sub1_Sub4(local221, "backtop1", 0);
			this.aClass15_23 = new Class15(this.method585(), local1377.anInt835, 45981, local1377.anInt834);
			local1377.method565(0, 0);
			@Pc(1402) Class6_Sub1_Sub1_Sub4 local1402 = new Class6_Sub1_Sub1_Sub4(local221, "backvmid1", 0);
			this.aClass15_24 = new Class15(this.method585(), local1402.anInt835, 45981, local1402.anInt834);
			local1402.method565(0, 0);
			@Pc(1427) Class6_Sub1_Sub1_Sub4 local1427 = new Class6_Sub1_Sub1_Sub4(local221, "backvmid2", 0);
			this.aClass15_25 = new Class15(this.method585(), local1427.anInt835, 45981, local1427.anInt834);
			local1427.method565(0, 0);
			@Pc(1452) Class6_Sub1_Sub1_Sub4 local1452 = new Class6_Sub1_Sub1_Sub4(local221, "backvmid3", 0);
			this.aClass15_26 = new Class15(this.method585(), local1452.anInt835, 45981, local1452.anInt834);
			local1452.method565(0, 0);
			@Pc(1477) Class6_Sub1_Sub1_Sub4 local1477 = new Class6_Sub1_Sub1_Sub4(local221, "backhmid2", 0);
			this.aClass15_27 = new Class15(this.method585(), local1477.anInt835, 45981, local1477.anInt834);
			local1477.method565(0, 0);
			@Pc(1502) int local1502 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1509) int local1509 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1525) int local1525 = 0; local1525 < 100; local1525++) {
				if (this.aClass6_Sub1_Sub1_Sub4Array7[local1525] != null) {
					this.aClass6_Sub1_Sub1_Sub4Array7[local1525].method563(local1509 + local1523, local1516 + local1523, anInt1037, local1502 + local1523);
				}
				if (this.aClass6_Sub1_Sub1_Sub3Array5[local1525] != null) {
					this.aClass6_Sub1_Sub1_Sub3Array5[local1525].method534(local1509 + local1523, local1516 + local1523, anInt1037, local1502 + local1523);
				}
			}
			this.method587("Unpacking textures", 83);
			Class6_Sub1_Sub1_Sub1.method74(local233);
			Class6_Sub1_Sub1_Sub1.method78(0.8D);
			Class6_Sub1_Sub1_Sub1.method73();
			this.method587("Unpacking config", 86);
			Class21.method158(local197);
			Class28.method267(local197);
			Class45.method507(local197);
			Class4.method25(local197);
			Class47.method540(local197);
			Class16.method145(local197);
			Class12.method99((byte) 6, local197);
			Class42.method467(local197);
			Class7.method86((byte) 6, local197);
			Class4.aBoolean6 = aBoolean251;
			if (!aBoolean252) {
				this.method587("Unpacking sounds", 90);
				@Pc(1628) byte[] local1628 = local257.method89("sounds.dat", null);
				@Pc(1634) Class6_Sub1_Sub4 local1634 = new Class6_Sub1_Sub4(local1628, (byte) -17);
				Class13.method102(local1634);
			}
			this.method587("Unpacking interfaces", 95);
			@Pc(1665) Class6_Sub1_Sub1_Sub2[] local1665 = new Class6_Sub1_Sub1_Sub2[] { this.aClass6_Sub1_Sub1_Sub2_2, this.aClass6_Sub1_Sub1_Sub2_3, this.aClass6_Sub1_Sub1_Sub2_4, this.aClass6_Sub1_Sub1_Sub2_5 };
			Class35.method392(local221, local1665, local209);
			this.method587("Preparing game engine", 100);
			@Pc(1681) int local1681;
			@Pc(1683) int local1683;
			@Pc(1685) int local1685;
			for (@Pc(1677) int local1677 = 0; local1677 < 33; local1677++) {
				local1681 = 999;
				local1683 = 0;
				for (local1685 = 0; local1685 < 34; local1685++) {
					if (this.aClass6_Sub1_Sub1_Sub3_2.aByteArray19[local1685 + local1677 * this.aClass6_Sub1_Sub1_Sub3_2.anInt779] == 0) {
						if (local1681 == 999) {
							local1681 = local1685;
						}
					} else if (local1681 != 999) {
						local1683 = local1685;
						break;
					}
				}
				this.anIntArray226[local1677] = local1681;
				this.anIntArray243[local1677] = local1683 - local1681;
			}
			@Pc(1743) int local1743;
			for (local1681 = 5; local1681 < 156; local1681++) {
				local1683 = 999;
				local1685 = 0;
				for (local1743 = 25; local1743 < 172; local1743++) {
					if (this.aClass6_Sub1_Sub1_Sub3_2.aByteArray19[local1743 + local1681 * this.aClass6_Sub1_Sub1_Sub3_2.anInt779] == 0 && (local1743 > 34 || local1681 > 34)) {
						if (local1683 == 999) {
							local1683 = local1743;
						}
					} else if (local1683 != 999) {
						local1685 = local1743;
						break;
					}
				}
				this.anIntArray214[local1681 - 5] = local1683 - 25;
				this.anIntArray247[local1681 - 5] = local1685 - local1683;
			}
			Class6_Sub1_Sub1_Sub1.method71(503, 765);
			this.anIntArray274 = Class6_Sub1_Sub1_Sub1.anIntArray12;
			Class6_Sub1_Sub1_Sub1.method71(96, 479);
			this.anIntArray271 = Class6_Sub1_Sub1_Sub1.anIntArray12;
			Class6_Sub1_Sub1_Sub1.method71(261, 190);
			this.anIntArray272 = Class6_Sub1_Sub1_Sub1.anIntArray12;
			Class6_Sub1_Sub1_Sub1.method71(334, 512);
			this.anIntArray273 = Class6_Sub1_Sub1_Sub1.anIntArray12;
			@Pc(1834) int[] local1834 = new int[9];
			for (local1685 = 0; local1685 < 9; local1685++) {
				local1743 = local1685 * 32 + 128 + 15;
				@Pc(1852) int local1852 = local1743 * 3 + 600;
				@Pc(1856) int local1856 = Class6_Sub1_Sub1_Sub1.anIntArray10[local1743];
				local1834[local1685] = local1852 * local1856 >> 16;
			}
			Class32.method355(local1834);
			Class44.method469(local245);
			this.aClass9_1 = new Class9(this, true);
			this.method586(this.aClass9_1, 10);
			Class6_Sub1_Sub2_Sub6.aClient4 = this;
			Class28.aClient2 = this;
			Class47.aClient5 = this;
		} catch (@Pc(1897) Exception local1897) {
			signlink.reporterror("loaderror " + this.aString29 + " " + this.anInt946);
			this.aBoolean258 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method662() {
		try {
			@Pc(14) int local14;
			@Pc(21) int local21;
			if (this.anInt986 == 0) {
				local14 = super.anInt848 / 2 - 80;
				local21 = super.anInt849 / 2 + 20;
				local21 += 20;
				if (super.anInt857 == 1 && super.anInt858 >= local14 - 75 && super.anInt858 <= local14 + 75 && super.anInt859 >= local21 - 20 && super.anInt859 <= local21 + 20) {
					this.anInt986 = 3;
					this.anInt1073 = 0;
				}
				local14 = super.anInt848 / 2 + 80;
				if (super.anInt857 == 1 && super.anInt858 >= local14 - 75 && super.anInt858 <= local14 + 75 && super.anInt859 >= local21 - 20 && super.anInt859 <= local21 + 20) {
					this.aString22 = "";
					this.aString23 = "Enter your username & password.";
					this.anInt986 = 2;
					this.anInt1073 = 0;
				}
			} else if (this.anInt986 == 2) {
				local14 = super.anInt849 / 2 - 40;
				local14 += 30;
				local14 += 25;
				if (super.anInt857 == 1 && super.anInt859 >= local14 - 15 && super.anInt859 < local14) {
					this.anInt1073 = 0;
				}
				local14 += 15;
				if (super.anInt857 == 1 && super.anInt859 >= local14 - 15 && super.anInt859 < local14) {
					this.anInt1073 = 1;
				}
				local14 += 15;
				local21 = super.anInt848 / 2 - 80;
				@Pc(167) int local167 = super.anInt849 / 2 + 50;
				@Pc(168) int local168 = local167 + 20;
				if (super.anInt857 == 1 && super.anInt858 >= local21 - 75 && super.anInt858 <= local21 + 75 && super.anInt859 >= local168 - 20 && super.anInt859 <= local168 + 20) {
					this.anInt1059 = 0;
					this.method693(this.aString27, this.aString28, false);
					if (this.aBoolean243) {
						return;
					}
				}
				local21 = super.anInt848 / 2 + 80;
				if (super.anInt857 == 1 && super.anInt858 >= local21 - 75 && super.anInt858 <= local21 + 75 && super.anInt859 >= local168 - 20 && super.anInt859 <= local168 + 20) {
					this.anInt986 = 0;
					this.aString27 = "";
					this.aString28 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method579(this.aByte32);
						if (local259 == -1) {
							return;
						}
						@Pc(264) boolean local264 = false;
						for (@Pc(266) int local266 = 0; local266 < aString30.length(); local266++) {
							if (local259 == aString30.charAt(local266)) {
								local264 = true;
								break;
							}
						}
						if (this.anInt1073 == 0) {
							if (local259 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt1073 = 1;
							}
							if (local264) {
								this.aString27 = this.aString27 + (char) local259;
							}
							if (this.aString27.length() > 12) {
								this.aString27 = this.aString27.substring(0, 12);
							}
						} else if (this.anInt1073 == 1) {
							if (local259 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt1073 = 0;
							}
							if (local264) {
								this.aString28 = this.aString28 + (char) local259;
							}
							if (this.aString28.length() > 20) {
								this.aString28 = this.aString28.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt986 == 3) {
				local14 = super.anInt848 / 2;
				local21 = super.anInt849 / 2 + 50;
				@Pc(423) int local423 = local21 + 20;
				if (super.anInt857 == 1 && super.anInt858 >= local14 - 75 && super.anInt858 <= local14 + 75 && super.anInt859 >= local423 - 20 && super.anInt859 <= local423 + 20) {
					this.anInt986 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("66175, " + false + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method663() {
		try {
			if (this.aClass15_6 == null) {
				this.method704();
				super.aClass15_2 = null;
				this.aClass15_7 = null;
				this.aClass15_8 = null;
				this.aClass15_9 = null;
				this.aClass15_10 = null;
				this.aClass15_11 = null;
				this.aClass15_12 = null;
				this.aClass15_13 = null;
				this.aClass15_14 = null;
				this.aClass15_15 = null;
				this.aClass15_6 = new Class15(this.method585(), 96, 45981, 479);
				this.aClass15_4 = new Class15(this.method585(), 156, 45981, 172);
				Class6_Sub1_Sub1.method553();
				this.aClass6_Sub1_Sub1_Sub3_2.method535(0, 0);
				this.aClass15_3 = new Class15(this.method585(), 261, 45981, 190);
				this.aClass15_5 = new Class15(this.method585(), 334, 45981, 512);
				Class6_Sub1_Sub1.method553();
				this.aClass15_16 = new Class15(this.method585(), 50, 45981, 496);
				this.aClass15_17 = new Class15(this.method585(), 37, 45981, 269);
				this.aClass15_18 = new Class15(this.method585(), 45, 45981, 249);
				this.aBoolean259 = true;
				this.aClass15_5.method121();
				Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("79570, " + 358 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method664(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 0) {
				this.aBoolean245 = !this.aBoolean245;
			}
			if (this.anInt1028 == 2) {
				for (@Pc(20) Class6_Sub2 local20 = (Class6_Sub2) this.aClass5_10.method33(); local20 != null; local20 = (Class6_Sub2) this.aClass5_10.method35((byte) 8)) {
					if (local20.anInt171 > 0) {
						local20.anInt171--;
					}
					if (local20.anInt171 != 0) {
						if (local20.anInt172 > 0) {
							local20.anInt172--;
						}
						if (local20.anInt172 == 0 && local20.anInt169 >= 1 && local20.anInt170 >= 1 && local20.anInt169 <= 102 && local20.anInt170 <= 102 && (local20.anInt173 < 0 || Class23.method167(local20.anInt173, local20.anInt175))) {
							this.method672(local20.anInt168, local20.anInt170, local20.anInt174, local20.anInt175, local20.anInt169, local20.anInt173, local20.anInt167);
							local20.anInt172 = -1;
							if (local20.anInt173 == local20.anInt164 && local20.anInt164 == -1) {
								local20.method548();
							} else if (local20.anInt173 == local20.anInt164 && local20.anInt174 == local20.anInt165 && local20.anInt175 == local20.anInt166) {
								local20.method548();
							}
						}
					} else if (local20.anInt164 < 0 || Class23.method167(local20.anInt164, local20.anInt166)) {
						this.method672(local20.anInt168, local20.anInt170, local20.anInt165, local20.anInt166, local20.anInt169, local20.anInt164, local20.anInt167);
						local20.method548();
					}
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("94260, " + arg0 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method665(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1009; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt1009--;
						this.aBoolean253 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1009; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 202);
						this.aClass6_Sub1_Sub4_9.method407(arg0);
						break;
					}
				}
				if (arg1 >= 0) {
					;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("97420, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method666() {
		try {
			if (aBoolean252 && this.anInt1028 == 2 && Class23.anInt372 != this.anInt989) {
				this.method645(null, "Loading - please wait.");
				this.anInt1028 = 1;
				this.aLong31 = System.currentTimeMillis();
			}
			if (this.anInt1028 == 1) {
				@Pc(31) int local31 = this.method667((byte) 8);
				if (local31 != 0 && System.currentTimeMillis() - this.aLong31 > 360000L) {
					signlink.reporterror(this.aString27 + " glcfb " + this.aLong32 + "," + local31 + "," + aBoolean252 + "," + this.aClass14Array1[0] + "," + this.aClass22_Sub1_1.method285() + "," + this.anInt989 + "," + this.anInt974 + "," + this.anInt975);
					this.aLong31 = System.currentTimeMillis();
				}
			}
			if (this.anInt1028 == 2 && this.anInt989 != this.anInt1081) {
				this.anInt1081 = this.anInt989;
				this.method701(this.anInt989);
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("63749, " + -14 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)I")
	private int method667(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray233[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray234[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray6.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray232[local41] >> 8) * 64 - this.anInt928;
					@Pc(74) int local74 = (this.anIntArray232[local41] & 0xFF) * 64 - this.anInt929;
					if (this.aBoolean255) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class23.method183(local48, local74, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean262) {
				return -4;
			} else {
				this.anInt1028 = 2;
				Class23.anInt372 = this.anInt989;
				this.method627(this.aByte28);
				this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 92);
				@Pc(125) boolean local125 = false;
				return 0;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("92131, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt956 = Integer.parseInt(this.getParameter("nodeid"));
		anInt957 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method705();
		} else {
			method685();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean251 = false;
		} else {
			aBoolean251 = true;
		}
		this.method576();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZI)V")
	private void method668(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (this.aBoolean239) {
				signlink.anInt1104 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("93732, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method669(@OriginalArg(0) byte arg0) {
		try {
			this.aClass15_4.method121();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt898 == 2) {
				@Pc(13) byte[] local13 = this.aClass6_Sub1_Sub1_Sub3_2.aByteArray19;
				@Pc(15) int[] local15 = Class6_Sub1_Sub1.anIntArray208;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass6_Sub1_Sub1_Sub4_12.method571(0, this.anIntArray243, 25, 0, 25, 256, 33, 33, this.anInt900, this.anIntArray226);
				this.aClass15_5.method121();
				Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
			} else {
				@Pc(67) int local67 = this.anInt900 + this.anInt1047 & 0x7FF;
				@Pc(74) int local74 = aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32 + 48;
				@Pc(79) boolean local79 = false;
				local18 = 464 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
				this.aClass6_Sub1_Sub1_Sub4_13.method571(5, this.anIntArray247, local74, 25, local18, this.anInt874 + 256, 146, 151, local67, this.anIntArray214);
				this.aClass6_Sub1_Sub1_Sub4_12.method571(0, this.anIntArray243, 25, 0, 25, 256, 33, 33, this.anInt900, this.anIntArray226);
				for (local20 = 0; local20 < this.anInt967; local20++) {
					local74 = this.anIntArray248[local20] * 4 + 2 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32;
					local18 = this.anIntArray249[local20] * 4 + 2 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
					this.method714(local18, local74, this.aClass6_Sub1_Sub1_Sub4Array10[local20]);
				}
				@Pc(181) int local181;
				for (@Pc(177) int local177 = 0; local177 < 104; local177++) {
					for (local181 = 0; local181 < 104; local181++) {
						@Pc(193) Class5 local193 = this.aClass5ArrayArrayArray1[this.anInt989][local177][local181];
						if (local193 != null) {
							local74 = local177 * 4 + 2 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32;
							local18 = local181 * 4 + 2 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
							this.method714(local18, local74, this.aClass6_Sub1_Sub1_Sub4_7);
						}
					}
				}
				for (local181 = 0; local181 < this.anInt884; local181++) {
					@Pc(244) Class6_Sub1_Sub2_Sub3_Sub2 local244 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray228[local181]];
					if (local244 != null && local244.method306()) {
						@Pc(253) Class47 local253 = local244.aClass47_2;
						if (local253.anIntArray201 != null) {
							local253 = local253.method537();
						}
						if (local253 != null && local253.aBoolean213 && local253.aBoolean211) {
							local74 = local244.anInt535 / 32 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32;
							local18 = local244.anInt536 / 32 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
							this.method714(local18, local74, this.aClass6_Sub1_Sub1_Sub4_8);
						}
					}
				}
				@Pc(312) Class6_Sub1_Sub2_Sub3_Sub1 local312;
				for (@Pc(302) int local302 = 0; local302 < this.anInt872; local302++) {
					local312 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray223[local302]];
					if (local312 != null && local312.method306()) {
						local74 = local312.anInt535 / 32 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32;
						local18 = local312.anInt536 / 32 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
						@Pc(340) boolean local340 = false;
						@Pc(344) long local344 = Class38.method453(local312.aString5);
						for (@Pc(346) int local346 = 0; local346 < this.anInt1023; local346++) {
							if (local344 == this.aLongArray4[local346] && this.anIntArray227[local346] != 0) {
								local340 = true;
								break;
							}
						}
						@Pc(371) boolean local371 = false;
						if (aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt298 != 0 && local312.anInt298 != 0 && aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt298 == local312.anInt298) {
							local371 = true;
						}
						if (local340) {
							this.method714(local18, local74, this.aClass6_Sub1_Sub1_Sub4_10);
						} else if (local371) {
							this.method714(local18, local74, this.aClass6_Sub1_Sub1_Sub4_11);
						} else {
							this.method714(local18, local74, this.aClass6_Sub1_Sub1_Sub4_9);
						}
					}
				}
				if (this.anInt999 != 0 && anInt936 % 20 < 10) {
					if (this.anInt999 == 1 && this.anInt876 >= 0 && this.anInt876 < this.aClass6_Sub1_Sub2_Sub3_Sub2Array1.length) {
						@Pc(445) Class6_Sub1_Sub2_Sub3_Sub2 local445 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[this.anInt876];
						if (local445 != null) {
							local74 = local445.anInt535 / 32 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32;
							local18 = local445.anInt536 / 32 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
							this.method684(this.aClass6_Sub1_Sub1_Sub4_4, this.aBoolean236, local74, local18);
						}
					}
					if (this.anInt999 == 2) {
						local74 = (this.anInt991 - this.anInt928) * 4 + 2 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32;
						local18 = (this.anInt992 - this.anInt929) * 4 + 2 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
						this.method684(this.aClass6_Sub1_Sub1_Sub4_4, this.aBoolean236, local74, local18);
					}
					if (this.anInt999 == 10 && this.anInt944 >= 0 && this.anInt944 < this.aClass6_Sub1_Sub2_Sub3_Sub1Array1.length) {
						local312 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anInt944];
						if (local312 != null) {
							local74 = local312.anInt535 / 32 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32;
							local18 = local312.anInt536 / 32 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
							this.method684(this.aClass6_Sub1_Sub1_Sub4_4, this.aBoolean236, local74, local18);
						}
					}
				}
				if (this.anInt1038 != 0) {
					local74 = this.anInt1038 * 4 + 2 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 / 32;
					local18 = this.anInt1039 * 4 + 2 - aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 / 32;
					this.method714(local18, local74, this.aClass6_Sub1_Sub1_Sub4_3);
				}
				Class6_Sub1_Sub1.method555((byte) 4, 78, 97, 16777215, 3, 3);
				this.aClass15_5.method121();
				Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
			}
		} catch (@Pc(616) RuntimeException local616) {
			signlink.reporterror("45607, " + arg0 + ", " + local616.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method670() {
		try {
			this.anInt1027++;
			this.method720(true);
			this.method659(true);
			this.method720(false);
			this.method659(false);
			this.method678();
			this.method636();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean231) {
				local35 = this.anInt899;
				if (this.anInt938 / 256 > local35) {
					local35 = this.anInt938 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray237[4] + 128 > local35) {
					local35 = this.anIntArray237[4] + 128;
				}
				local74 = this.anInt900 + this.anInt1063 & 0x7FF;
				this.method716(this.method595(aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535, aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536, this.anInt989) - 50, local74, this.anInt1041, local35, this.anInt1042, local35 * 3 + 600);
			}
			if (this.aBoolean231) {
				local35 = this.method689();
			} else {
				local35 = this.method688();
			}
			local74 = this.anInt1031;
			@Pc(118) int local118 = this.anInt1032;
			@Pc(121) int local121 = this.anInt1033;
			@Pc(124) int local124 = this.anInt1034;
			@Pc(127) int local127 = this.anInt1035;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray12[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray269[local129] * 2 + 1) - (double) this.anIntArray269[local129] + Math.sin((double) this.anIntArray251[local129] * ((double) this.anIntArray235[local129] / 100.0D)) * (double) this.anIntArray237[local129]);
					if (local129 == 0) {
						this.anInt1031 += local176;
					}
					if (local129 == 1) {
						this.anInt1032 += local176;
					}
					if (local129 == 2) {
						this.anInt1033 += local176;
					}
					if (local129 == 3) {
						this.anInt1035 = this.anInt1035 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt1034 += local176;
						if (this.anInt1034 < 128) {
							this.anInt1034 = 128;
						}
						if (this.anInt1034 > 383) {
							this.anInt1034 = 383;
						}
					}
				}
			}
			local176 = Class6_Sub1_Sub1_Sub1.anInt87;
			Class6_Sub1_Sub2_Sub5.aBoolean119 = true;
			Class6_Sub1_Sub2_Sub5.anInt444 = 0;
			Class6_Sub1_Sub2_Sub5.anInt442 = super.anInt852 - 4;
			Class6_Sub1_Sub2_Sub5.anInt443 = super.anInt853 - 4;
			Class6_Sub1_Sub1.method553();
			this.aClass32_1.method358(this.anInt1033, this.anInt1032, this.anInt1031, this.anInt1035, this.anInt1034, local35);
			this.aClass32_1.method333();
			this.method706();
			this.method629(this.aByte29);
			this.method649(local176);
			this.method694();
			this.aClass15_5.method122(super.aGraphics2, 966, 4, 4);
			this.anInt1031 = local74;
			this.anInt1032 = local118;
			this.anInt1033 = local121;
			this.anInt1034 = local124;
			this.anInt1035 = local127;
		} catch (@Pc(320) RuntimeException local320) {
			signlink.reporterror("70763, " + -15737 + ", " + local320.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method671(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) int local4 = Class42.aClass42Array1[arg0].anInt735;
			if (arg1 != 87) {
				this.anInt1065 = this.aClass18_2.method155();
			}
			if (local4 != 0) {
				@Pc(20) int local20 = this.anIntArray236[arg0];
				if (local4 == 1) {
					if (local20 == 1) {
						Class6_Sub1_Sub1_Sub1.method78(0.9D);
					}
					if (local20 == 2) {
						Class6_Sub1_Sub1_Sub1.method78(0.8D);
					}
					if (local20 == 3) {
						Class6_Sub1_Sub1_Sub1.method78(0.7D);
					}
					if (local20 == 4) {
						Class6_Sub1_Sub1_Sub1.method78(0.6D);
					}
					Class4.aClass36_2.method396();
					this.aBoolean259 = true;
				}
				if (local4 == 3) {
					@Pc(58) boolean local58 = this.aBoolean239;
					if (local20 == 0) {
						this.method601(0, this.aBoolean239);
						this.aBoolean239 = true;
					}
					if (local20 == 1) {
						this.method601(-400, this.aBoolean239);
						this.aBoolean239 = true;
					}
					if (local20 == 2) {
						this.method601(-800, this.aBoolean239);
						this.aBoolean239 = true;
					}
					if (local20 == 3) {
						this.method601(-1200, this.aBoolean239);
						this.aBoolean239 = true;
					}
					if (local20 == 4) {
						this.aBoolean239 = false;
					}
					if (this.aBoolean239 != local58 && !aBoolean252) {
						if (this.aBoolean239) {
							this.anInt907 = this.anInt939;
							this.aBoolean241 = true;
							this.aClass22_Sub1_1.method283(2, this.anInt907);
						} else {
							this.method710();
						}
						this.anInt1004 = 0;
					}
				}
				if (local4 == 4) {
					if (local20 == 0) {
						this.aBoolean274 = true;
						this.method722(0);
					}
					if (local20 == 1) {
						this.aBoolean274 = true;
						this.method722(-400);
					}
					if (local20 == 2) {
						this.aBoolean274 = true;
						this.method722(-800);
					}
					if (local20 == 3) {
						this.aBoolean274 = true;
						this.method722(-1200);
					}
					if (local20 == 4) {
						this.aBoolean274 = false;
					}
				}
				if (local4 == 5) {
					this.anInt969 = local20;
				}
				if (local4 == 6) {
					this.anInt1026 = local20;
				}
				if (local4 == 8) {
					this.anInt963 = local20;
					this.aBoolean246 = true;
				}
				if (local4 == 9) {
					this.anInt962 = local20;
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("45338, " + arg0 + ", " + arg1 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIII)V")
	private void method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4 >= 1 && arg1 >= 1 && arg4 <= 102 && arg1 <= 102) {
				if (aBoolean252 && arg6 != this.anInt989) {
					return;
				}
				@Pc(23) int local23 = 0;
				if (arg0 == 0) {
					local23 = this.aClass32_1.method345(arg6, arg4, arg1);
				}
				if (arg0 == 1) {
					local23 = this.aClass32_1.method346(arg6, arg4, arg1);
				}
				if (arg0 == 2) {
					local23 = this.aClass32_1.method347(arg6, arg4, arg1);
				}
				if (arg0 == 3) {
					local23 = this.aClass32_1.method348(arg6, arg4, arg1);
				}
				@Pc(79) int local79;
				if (local23 != 0) {
					local79 = this.aClass32_1.method349(arg6, arg4, arg1, local23);
					@Pc(85) int local85 = local23 >> 14 & 0x7FFF;
					@Pc(89) int local89 = local79 & 0x1F;
					@Pc(93) int local93 = local79 >> 6;
					@Pc(105) Class28 local105;
					if (arg0 == 0) {
						this.aClass32_1.method336(arg1, arg6, arg4);
						local105 = Class28.method268(local85);
						if (local105.aBoolean135) {
							this.aClass3Array1[arg6].method10(arg1, local89, local105.aBoolean127, arg4, local93);
						}
					}
					if (arg0 == 1) {
						this.aClass32_1.method337(arg4, arg6, arg1);
					}
					if (arg0 == 2) {
						this.aClass32_1.method338(arg4, arg6, arg1);
						local105 = Class28.method268(local85);
						if (arg4 + local105.anInt489 > 103 || arg1 + local105.anInt489 > 103 || arg4 + local105.anInt483 > 103 || arg1 + local105.anInt483 > 103) {
							return;
						}
						if (local105.aBoolean135) {
							this.aClass3Array1[arg6].method11(local105.anInt489, arg4, local93, arg1, local105.aBoolean127, local105.anInt483);
						}
					}
					if (arg0 == 3) {
						this.aClass32_1.method339(arg4, arg1, arg6);
						local105 = Class28.method268(local85);
						if (local105.aBoolean135 && local105.aBoolean130) {
							this.aClass3Array1[arg6].method13(arg1, arg4);
						}
					}
				}
				if (arg5 >= 0) {
					local79 = arg6;
					if (arg6 < 3 && (this.aByteArrayArrayArray8[1][arg4][arg1] & 0x2) == 2) {
						local79 = arg6 + 1;
					}
					Class23.method173(this.aClass32_1, local79, arg6, arg3, this.aClass3Array1[arg6], arg2, this.anInt917, this.anIntArrayArrayArray8, arg5, arg1, arg4);
					return;
				}
			}
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("78155, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5 local9 = this.aClass5ArrayArrayArray1[this.anInt989][arg0][arg1];
		if (local9 == null) {
			this.aClass32_1.method340(this.anInt989, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class6_Sub1_Sub2_Sub4 local23 = null;
		@Pc(27) Class6_Sub1_Sub2_Sub4 local27;
		for (local27 = (Class6_Sub1_Sub2_Sub4) local9.method33(); local27 != null; local27 = (Class6_Sub1_Sub2_Sub4) local9.method35((byte) 8)) {
			@Pc(32) Class4 local32 = Class4.method22(local27.anInt314);
			@Pc(35) int local35 = local32.anInt43;
			if (local32.aBoolean7) {
				local35 *= local27.anInt313 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method31(local23, (byte) 1);
		@Pc(65) Class6_Sub1_Sub2_Sub4 local65 = null;
		@Pc(67) Class6_Sub1_Sub2_Sub4 local67 = null;
		for (local27 = (Class6_Sub1_Sub2_Sub4) local9.method33(); local27 != null; local27 = (Class6_Sub1_Sub2_Sub4) local9.method35((byte) 8)) {
			if (local27.anInt314 != local23.anInt314 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt314 != local23.anInt314 && local27.anInt314 != local65.anInt314 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass32_1.method326(local110, local23, local65, local67, arg0, this.anInt989, this.method595(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt989), arg1);
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method674() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1008);
			if (this.aClass22_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass22_Sub1_1.anInt507);
			}
			System.out.println("loop-cycle:" + anInt936);
			System.out.println("draw-cycle:" + anInt912);
			System.out.println("ptype:" + this.anInt1014);
			System.out.println("psize:" + this.anInt1013);
			if (this.anInt937 != -26728) {
				for (@Pc(70) int local70 = 1; local70 > 0; local70++) {
				}
			}
			if (this.aClass41_1 != null) {
				this.aClass41_1.method466();
			}
			super.aBoolean226 = true;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("74573, " + -26728 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method585() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("70276, " + -489 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!QUBPQDMQ;I)V")
	private void method675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt687 == 0 && arg2.anIntArray188 != null && (!arg2.aBoolean168 || this.anInt887 == arg2.anInt674 || this.anInt997 == arg2.anInt674 || this.anInt1002 == arg2.anInt674)) {
				@Pc(29) int local29 = Class6_Sub1_Sub1.anInt825;
				@Pc(31) int local31 = Class6_Sub1_Sub1.anInt823;
				@Pc(33) int local33 = Class6_Sub1_Sub1.anInt826;
				@Pc(35) int local35 = Class6_Sub1_Sub1.anInt824;
				Class6_Sub1_Sub1.method552(arg0, arg3 + arg2.anInt667, arg0 + arg2.anInt660, arg3);
				@Pc(51) int local51 = arg2.anIntArray188.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray182[local53] + arg0;
					@Pc(71) int local71 = arg2.anIntArray187[local53] + arg3 - arg1;
					@Pc(77) Class35 local77 = Class35.method389(arg2.anIntArray188[local53]);
					@Pc(82) int local82 = local62 + local77.anInt681;
					@Pc(87) int local87 = local71 + local77.anInt654;
					if (local77.anInt682 > 0) {
						this.method634(local77);
					}
					if (local77.anInt687 == 0) {
						if (local77.anInt666 > local77.anInt664 - local77.anInt667) {
							local77.anInt666 = local77.anInt664 - local77.anInt667;
						}
						if (local77.anInt666 < 0) {
							local77.anInt666 = 0;
						}
						this.method675(local82, local77.anInt666, local77, local87);
						if (local77.anInt664 > local77.anInt667) {
							this.method637(local77.anInt664, local77.anInt667, local82 + local77.anInt660, local87, local77.anInt666);
						}
					} else if (local77.anInt687 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt687 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt667; local159++) {
								for (local163 = 0; local163 < local77.anInt660; local163++) {
									local174 = local82 + local163 * (local77.anInt669 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt679 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray183[local157];
										local183 += local77.anIntArray181[local157];
									}
									if (local77.anIntArray185[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray185[local157] - 1;
										if (local174 > Class6_Sub1_Sub1.anInt825 - 32 && local174 < Class6_Sub1_Sub1.anInt826 && local183 > Class6_Sub1_Sub1.anInt823 - 32 && local183 < Class6_Sub1_Sub1.anInt824 || this.anInt1092 != 0 && this.anInt1091 == local157) {
											local241 = 0;
											if (this.anInt888 == 1 && this.anInt889 == local157 && this.anInt890 == local77.anInt674) {
												local241 = 16777215;
											}
											@Pc(265) Class6_Sub1_Sub1_Sub4 local265 = Class4.method26(local77.anIntArray184[local157], local241, local216);
											if (local265 != null) {
												@Pc(344) int local344;
												if (this.anInt1092 != 0 && this.anInt1091 == local157 && this.anInt1090 == local77.anInt674) {
													local207 = super.anInt852 - this.anInt1093;
													local209 = super.anInt853 - this.anInt1094;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt918 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local265.method569(local183 + local209, local174 + local207);
													if (local183 + local209 < Class6_Sub1_Sub1.anInt823 && arg2.anInt666 > 0) {
														local344 = this.anInt984 * (Class6_Sub1_Sub1.anInt823 - local183 - local209) / 3;
														if (local344 > this.anInt984 * 10) {
															local344 = this.anInt984 * 10;
														}
														if (local344 > arg2.anInt666) {
															local344 = arg2.anInt666;
														}
														arg2.anInt666 -= local344;
														this.anInt1094 += local344;
													}
													if (local183 + local209 + 32 > Class6_Sub1_Sub1.anInt824 && arg2.anInt666 < arg2.anInt664 - arg2.anInt667) {
														local344 = this.anInt984 * (local183 + local209 + 32 - Class6_Sub1_Sub1.anInt824) / 3;
														if (local344 > this.anInt984 * 10) {
															local344 = this.anInt984 * 10;
														}
														if (local344 > arg2.anInt664 - arg2.anInt667 - arg2.anInt666) {
															local344 = arg2.anInt664 - arg2.anInt667 - arg2.anInt666;
														}
														arg2.anInt666 += local344;
														this.anInt1094 -= local344;
													}
												} else if (this.anInt916 != 0 && this.anInt915 == local157 && this.anInt914 == local77.anInt674) {
													local265.method569(local183, local174);
												} else {
													local265.method567(local174, local183);
												}
												if (local265.anInt838 == 33 || local77.anIntArray184[local157] != 1) {
													local344 = local77.anIntArray184[local157];
													this.aClass6_Sub1_Sub1_Sub2_2.method209(0, method639(local344), local183 + local209 + 10, local174 + 1 + local207);
													this.aClass6_Sub1_Sub1_Sub2_2.method209(16776960, method639(local344), local183 + local209 + 9, local174 + local207);
												}
											}
										}
									} else if (local77.aClass6_Sub1_Sub1_Sub4Array2 != null && local157 < 20) {
										@Pc(533) Class6_Sub1_Sub1_Sub4 local533 = local77.aClass6_Sub1_Sub1_Sub4Array2[local157];
										if (local533 != null) {
											local533.method567(local174, local183);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt687 == 3) {
							@Pc(559) boolean local559 = false;
							if (this.anInt1002 == local77.anInt674 || this.anInt997 == local77.anInt674 || this.anInt887 == local77.anInt674) {
								local559 = true;
							}
							if (this.method709(285, local77)) {
								local157 = local77.anInt652;
								if (local559 && local77.anInt676 != 0) {
									local157 = local77.anInt676;
								}
							} else {
								local157 = local77.anInt659;
								if (local559 && local77.anInt662 != 0) {
									local157 = local77.anInt662;
								}
							}
							if (local77.aByte16 == 0) {
								if (local77.aBoolean172) {
									Class6_Sub1_Sub1.method555((byte) 4, local87, local82, local157, local77.anInt667, local77.anInt660);
								} else {
									Class6_Sub1_Sub1.method556(local77.anInt667, local87, 606, local82, local157, local77.anInt660);
								}
							} else if (local77.aBoolean172) {
								Class6_Sub1_Sub1.method554(local77.anInt667, 256 - (local77.aByte16 & 0xFF), local87, local77.anInt660, local82, (byte) 6, local157);
							} else {
								Class6_Sub1_Sub1.method557(local77.anInt660, local77.anInt667, local82, 256 - (local77.aByte16 & 0xFF), local87, local157);
							}
						} else {
							@Pc(677) Class6_Sub1_Sub1_Sub2 local677;
							@Pc(954) String local954;
							if (local77.anInt687 == 4) {
								local677 = local77.aClass6_Sub1_Sub1_Sub2_1;
								@Pc(680) String local680 = local77.aString11;
								@Pc(682) boolean local682 = false;
								if (this.anInt1002 == local77.anInt674 || this.anInt997 == local77.anInt674 || this.anInt887 == local77.anInt674) {
									local682 = true;
								}
								if (this.method709(285, local77)) {
									local159 = local77.anInt652;
									if (local682 && local77.anInt676 != 0) {
										local159 = local77.anInt676;
									}
									if (local77.aString10.length() > 0) {
										local680 = local77.aString10;
									}
								} else {
									local159 = local77.anInt659;
									if (local682 && local77.anInt662 != 0) {
										local159 = local77.anInt662;
									}
								}
								if (local77.anInt675 == 6 && this.aBoolean237) {
									local680 = "Please wait...";
									local159 = local77.anInt659;
								}
								if (Class6_Sub1_Sub1.anInt821 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local677.anInt397;
								while (local680.length() > 0) {
									if (local680.indexOf("%") != -1) {
										label390: while (true) {
											local209 = local680.indexOf("%1");
											if (local209 == -1) {
												while (true) {
													local209 = local680.indexOf("%2");
													if (local209 == -1) {
														while (true) {
															local209 = local680.indexOf("%3");
															if (local209 == -1) {
																while (true) {
																	local209 = local680.indexOf("%4");
																	if (local209 == -1) {
																		while (true) {
																			local209 = local680.indexOf("%5");
																			if (local209 == -1) {
																				break label390;
																			}
																			local680 = local680.substring(0, local209) + this.method718(this.method611(4, local77)) + local680.substring(local209 + 2);
																		}
																	}
																	local680 = local680.substring(0, local209) + this.method718(this.method611(3, local77)) + local680.substring(local209 + 2);
																}
															}
															local680 = local680.substring(0, local209) + this.method718(this.method611(2, local77)) + local680.substring(local209 + 2);
														}
													}
													local680 = local680.substring(0, local209) + this.method718(this.method611(1, local77)) + local680.substring(local209 + 2);
												}
											}
											local680 = local680.substring(0, local209) + this.method718(this.method611(0, local77)) + local680.substring(local209 + 2);
										}
									}
									local209 = local680.indexOf("\\n");
									if (local209 == -1) {
										local954 = local680;
										local680 = "";
									} else {
										local954 = local680.substring(0, local209);
										local680 = local680.substring(local209 + 2);
									}
									if (local77.aBoolean173) {
										local677.method206(local207, local159, local77.aBoolean170, local82 + local77.anInt660 / 2, local954);
									} else {
										local677.method213(local954, local82, local207, local77.aBoolean170, local159);
									}
									local207 += local677.anInt397;
								}
							} else if (local77.anInt687 == 5) {
								@Pc(1016) Class6_Sub1_Sub1_Sub4 local1016;
								if (this.method709(285, local77)) {
									local1016 = local77.aClass6_Sub1_Sub1_Sub4_1;
								} else {
									local1016 = local77.aClass6_Sub1_Sub1_Sub4_2;
								}
								if (local1016 != null) {
									local1016.method567(local82, local87);
								}
							} else if (local77.anInt687 == 6) {
								local157 = Class6_Sub1_Sub1_Sub1.anInt83;
								local159 = Class6_Sub1_Sub1_Sub1.anInt84;
								Class6_Sub1_Sub1_Sub1.anInt83 = local82 + local77.anInt660 / 2;
								Class6_Sub1_Sub1_Sub1.anInt84 = local87 + local77.anInt667 / 2;
								local163 = Class6_Sub1_Sub1_Sub1.anIntArray10[local77.anInt672] * local77.anInt671 >> 16;
								local174 = Class6_Sub1_Sub1_Sub1.anIntArray11[local77.anInt672] * local77.anInt671 >> 16;
								@Pc(1077) boolean local1077 = this.method709(285, local77);
								if (local1077) {
									local207 = local77.anInt657;
								} else {
									local207 = local77.anInt656;
								}
								@Pc(1098) Class6_Sub1_Sub2_Sub5 local1098;
								if (local207 == -1) {
									local1098 = local77.method393(-1, -1, this.anInt1022, local1077);
								} else {
									@Pc(1104) Class21 local1104 = Class21.aClass21Array1[local207];
									local1098 = local77.method393(local1104.anIntArray65[local77.anInt690], local1104.anIntArray64[local77.anInt690], this.anInt1022, local1077);
								}
								if (local1098 != null) {
									local1098.method249(local77.anInt673, 0, local77.anInt672, 0, local163, local174);
								}
								Class6_Sub1_Sub1_Sub1.anInt83 = local157;
								Class6_Sub1_Sub1_Sub1.anInt84 = local159;
							} else {
								if (local77.anInt687 == 7) {
									local677 = local77.aClass6_Sub1_Sub1_Sub2_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt667; local163++) {
										for (local174 = 0; local174 < local77.anInt660; local174++) {
											if (local77.anIntArray185[local159] > 0) {
												@Pc(1169) Class4 local1169 = Class4.method22(local77.anIntArray185[local159] - 1);
												@Pc(1173) String local1173 = String.valueOf(local1169.aString1);
												if (local1169.aBoolean7 || local77.anIntArray184[local159] != 1) {
													local1173 = local1173 + " x" + method613(866, local77.anIntArray184[local159]);
												}
												local209 = local82 + local174 * (local77.anInt669 + 115);
												local216 = local87 + local163 * (local77.anInt679 + 12);
												if (local77.aBoolean173) {
													local677.method206(local216, local77.anInt659, local77.aBoolean170, local209 + local77.anInt660 / 2, local1173);
												} else {
													local677.method213(local1173, local209, local216, local77.aBoolean170, local77.anInt659);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt687 == 8 && (this.anInt1060 == local77.anInt674 || this.anInt1058 == local77.anInt674 || this.anInt996 == local77.anInt674) && this.anInt964 == 100) {
									local157 = 0;
									local159 = 0;
									@Pc(1287) Class6_Sub1_Sub1_Sub2 local1287 = this.aClass6_Sub1_Sub1_Sub2_3;
									@Pc(1290) String local1290 = local77.aString11;
									while (local1290.length() > 0) {
										local207 = local1290.indexOf("\\n");
										if (local207 == -1) {
											local954 = local1290;
											local1290 = "";
										} else {
											local954 = local1290.substring(0, local207);
											local1290 = local1290.substring(local207 + 2);
										}
										local209 = local1287.method207(local954);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1287.anInt397 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt660 - local157 - 5;
									local209 = local87 + local77.anInt667 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg0 + arg2.anInt660) {
										local207 = arg0 + arg2.anInt660 - local157;
									}
									if (local209 + local159 > arg3 + arg2.anInt667) {
										local209 = arg3 + arg2.anInt667 - local159;
									}
									Class6_Sub1_Sub1.method555((byte) 4, local209, local207, 16777120, local159, local157);
									Class6_Sub1_Sub1.method556(local159, local209, 606, local207, 0, local157);
									local1290 = local77.aString11;
									local216 = local209 + local1287.anInt397 + 2;
									while (local1290.length() > 0) {
										local241 = local1290.indexOf("\\n");
										if (local241 == -1) {
											local954 = local1290;
											local1290 = "";
										} else {
											local954 = local1290.substring(0, local241);
											local1290 = local1290.substring(local241 + 2);
										}
										local1287.method213(local954, local207 + 3, local216, false, 0);
										local216 += local1287.anInt397 + 1;
									}
								}
							}
						}
					}
				}
				Class6_Sub1_Sub1.method552(local29, local35, local33, local31);
			}
		} catch (@Pc(1481) RuntimeException local1481) {
			signlink.reporterror("49501, " + -7410 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1481.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method676() {
		try {
			if (this.anInt898 == 0 && super.anInt857 == 1) {
				@Pc(20) int local20 = super.anInt858 - 25 - 550;
				@Pc(27) int local27 = super.anInt859 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt900 + this.anInt1047 & 0x7FF;
					@Pc(51) int local51 = Class6_Sub1_Sub1_Sub1.anIntArray10[local47];
					@Pc(55) int local55 = Class6_Sub1_Sub1_Sub1.anIntArray11[local47];
					@Pc(64) int local64 = local51 * (this.anInt874 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt874 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 + local83 >> 7;
					@Pc(107) int local107 = aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 - local93 >> 7;
					@Pc(128) boolean local128 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, true, 1, local100, local107);
					if (local128) {
						this.aClass6_Sub1_Sub4_9.method401(local20);
						this.aClass6_Sub1_Sub4_9.method401(local27);
						this.aClass6_Sub1_Sub4_9.method402(this.anInt900);
						this.aClass6_Sub1_Sub4_9.method401(57);
						this.aClass6_Sub1_Sub4_9.method401(this.anInt1047);
						this.aClass6_Sub1_Sub4_9.method401(this.anInt874);
						this.aClass6_Sub1_Sub4_9.method401(89);
						this.aClass6_Sub1_Sub4_9.method402(aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535);
						this.aClass6_Sub1_Sub4_9.method402(aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536);
						this.aClass6_Sub1_Sub4_9.method401(this.anInt971);
						this.aClass6_Sub1_Sub4_9.method401(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("70080, " + -872 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RGCGKKUR;ZI)V")
	private void method677(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) int local11;
			@Pc(20) int local20;
			@Pc(32) int local32;
			@Pc(37) int local37;
			@Pc(40) int local40;
			@Pc(43) int local43;
			@Pc(53) int local53;
			@Pc(56) int local56;
			@Pc(65) int local65;
			@Pc(27) int local27;
			@Pc(48) int local48;
			@Pc(59) int local59;
			@Pc(62) int local62;
			if (arg1 == 100) {
				local11 = arg0.method411();
				local20 = this.anInt1083 + (local11 >> 4 & 0x7);
				local27 = this.anInt1084 + (local11 & 0x7);
				local32 = local20 + arg0.method412();
				local37 = local27 + arg0.method412();
				local40 = arg0.method414();
				local43 = arg0.method413();
				local48 = arg0.method411() * 4;
				local53 = arg0.method411() * 4;
				local56 = arg0.method413();
				local59 = arg0.method413();
				local62 = arg0.method411();
				local65 = arg0.method411();
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104 && local32 >= 0 && local37 >= 0 && local32 < 104 && local37 < 104 && local43 != 65535) {
					local20 = local20 * 128 + 64;
					local27 = local27 * 128 + 64;
					local32 = local32 * 128 + 64;
					local37 = local37 * 128 + 64;
					@Pc(141) Class6_Sub1_Sub2_Sub2 local141 = new Class6_Sub1_Sub2_Sub2(local20, local53, local27, local62, -40800, local65, local40, this.method595(local20, local27, this.anInt989) - local48, local43, local59 + anInt936, local56 + anInt936, this.anInt989);
					local141.method112((byte) 7, local32, this.method595(local32, local37, this.anInt989) - local53, local37, local56 + anInt936);
					this.aClass5_12.method30(local141);
				}
			} else if (arg1 == 173) {
				local11 = arg0.method439(this.anInt892);
				local20 = arg0.method438();
				local27 = arg0.method430();
				local32 = this.anInt1083 + (local27 >> 4 & 0x7);
				local37 = this.anInt1084 + (local27 & 0x7);
				local40 = arg0.method438();
				if (local32 >= 0 && local37 >= 0 && local32 < 104 && local37 < 104 && local40 != this.anInt1068) {
					@Pc(217) Class6_Sub1_Sub2_Sub4 local217 = new Class6_Sub1_Sub2_Sub4();
					local217.anInt314 = local20;
					local217.anInt313 = local11;
					if (this.aClass5ArrayArrayArray1[this.anInt989][local32][local37] == null) {
						this.aClass5ArrayArrayArray1[this.anInt989][local32][local37] = new Class5(-7255);
					}
					this.aClass5ArrayArrayArray1[this.anInt989][local32][local37].method30(local217);
					this.method673(local32, local37);
				}
			} else if (arg1 == 241) {
				local11 = arg0.method439(this.anInt892);
				local20 = arg0.method411();
				local27 = this.anInt1083 + (local20 >> 4 & 0x7);
				local32 = this.anInt1084 + (local20 & 0x7);
				local37 = arg0.method411();
				local40 = local37 >> 2;
				local43 = local37 & 0x3;
				local48 = this.anIntArray254[local40];
				if (local27 >= 0 && local32 >= 0 && local27 < 104 && local32 < 104) {
					this.method648(0, local11, local27, local32, local43, local40, local48, this.anInt989, -1);
				}
			} else {
				@Pc(394) int local394;
				if (arg1 == 1) {
					local11 = arg0.method438();
					local20 = arg0.method437();
					@Pc(344) byte local344 = arg0.method432();
					local32 = arg0.method431();
					local37 = local32 >> 2;
					local40 = local32 & 0x3;
					local43 = this.anIntArray254[local37];
					@Pc(365) byte local365 = arg0.method433();
					local53 = arg0.method438();
					local56 = arg0.method438();
					@Pc(377) byte local377 = arg0.method432();
					@Pc(381) byte local381 = arg0.method432();
					local65 = arg0.method430();
					local394 = this.anInt1083 + (local65 >> 4 & 0x7);
					@Pc(401) int local401 = this.anInt1084 + (local65 & 0x7);
					@Pc(407) Class6_Sub1_Sub2_Sub3_Sub1 local407;
					if (local56 == this.anInt1068) {
						local407 = aClass6_Sub1_Sub2_Sub3_Sub1_1;
					} else {
						local407 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local56];
					}
					if (local407 != null) {
						@Pc(419) Class28 local419 = Class28.method268(local53);
						@Pc(429) int local429 = this.anIntArrayArrayArray8[this.anInt989][local394][local401];
						@Pc(441) int local441 = this.anIntArrayArrayArray8[this.anInt989][local394 + 1][local401];
						@Pc(455) int local455 = this.anIntArrayArrayArray8[this.anInt989][local394 + 1][local401 + 1];
						@Pc(467) int local467 = this.anIntArrayArrayArray8[this.anInt989][local394][local401 + 1];
						@Pc(477) Class6_Sub1_Sub2_Sub5 local477 = local419.method273(local37, local40, local429, local441, local455, local467, -1);
						if (local477 != null) {
							this.method648(local11 + 1, -1, local394, local401, 0, 0, local43, this.anInt989, local20 + 1);
							local407.anInt286 = local11 + anInt936;
							local407.anInt287 = local20 + anInt936;
							local407.aClass6_Sub1_Sub2_Sub5_1 = local477;
							@Pc(512) int local512 = local419.anInt489;
							@Pc(515) int local515 = local419.anInt483;
							if (local40 == 1 || local40 == 3) {
								local512 = local419.anInt483;
								local515 = local419.anInt489;
							}
							local407.anInt288 = local394 * 128 + local512 * 64;
							local407.anInt290 = local401 * 128 + local515 * 64;
							local407.anInt289 = this.method595(local407.anInt288, local407.anInt290, this.anInt989);
							@Pc(561) byte local561;
							if (local344 > local365) {
								local561 = local344;
								local344 = local365;
								local365 = local561;
							}
							if (local377 > local381) {
								local561 = local377;
								local377 = local381;
								local381 = local561;
							}
							local407.anInt294 = local394 + local344;
							local407.anInt296 = local394 + local365;
							local407.anInt295 = local401 + local377;
							local407.anInt297 = local401 + local381;
						}
					}
				}
				if (arg1 == 69) {
					local11 = arg0.method411();
					local20 = this.anInt1083 + (local11 >> 4 & 0x7);
					local27 = this.anInt1084 + (local11 & 0x7);
					local32 = arg0.method413();
					local37 = arg0.method411();
					local40 = local37 >> 4 & 0xF;
					local43 = local37 & 0x7;
					if (aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0] >= local20 - local40 && aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0] <= local20 + local40 && aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0] >= local27 - local40 && aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0] <= local27 + local40 && this.aBoolean274 && !aBoolean252 && this.anInt925 < 50) {
						this.anIntArray262[this.anInt925] = local32;
						this.anIntArray250[this.anInt925] = local43;
						this.anIntArray212[this.anInt925] = Class13.anIntArray42[local32];
						this.anInt925++;
					}
				}
				if (arg1 == 57) {
					local11 = arg0.method411();
					local20 = local11 >> 2;
					local27 = local11 & 0x3;
					local32 = this.anIntArray254[local20];
					local37 = arg0.method431();
					local40 = this.anInt1083 + (local37 >> 4 & 0x7);
					local43 = this.anInt1084 + (local37 & 0x7);
					if (local40 >= 0 && local43 >= 0 && local40 < 104 && local43 < 104) {
						this.method648(0, -1, local40, local43, local27, local20, local32, this.anInt989, -1);
					}
				} else {
					@Pc(815) Class6_Sub1_Sub2_Sub4 local815;
					if (arg1 == 220) {
						local11 = arg0.method431();
						local20 = this.anInt1083 + (local11 >> 4 & 0x7);
						local27 = this.anInt1084 + (local11 & 0x7);
						local32 = arg0.method437();
						if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
							@Pc(809) Class5 local809 = this.aClass5ArrayArrayArray1[this.anInt989][local20][local27];
							if (local809 != null) {
								for (local815 = (Class6_Sub1_Sub2_Sub4) local809.method33(); local815 != null; local815 = (Class6_Sub1_Sub2_Sub4) local809.method35((byte) 8)) {
									if (local815.anInt314 == (local32 & 0x7FFF)) {
										local815.method548();
										break;
									}
								}
								if (local809.method33() == null) {
									this.aClass5ArrayArrayArray1[this.anInt989][local20][local27] = null;
								}
								this.method673(local20, local27);
							}
						}
					} else if (arg1 == 194) {
						local11 = arg0.method411();
						local20 = this.anInt1083 + (local11 >> 4 & 0x7);
						local27 = this.anInt1084 + (local11 & 0x7);
						local32 = arg0.method413();
						local37 = arg0.method413();
						local40 = arg0.method413();
						if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
							@Pc(903) Class5 local903 = this.aClass5ArrayArrayArray1[this.anInt989][local20][local27];
							if (local903 != null) {
								for (@Pc(909) Class6_Sub1_Sub2_Sub4 local909 = (Class6_Sub1_Sub2_Sub4) local903.method33(); local909 != null; local909 = (Class6_Sub1_Sub2_Sub4) local903.method35((byte) 8)) {
									if (local909.anInt314 == (local32 & 0x7FFF) && local909.anInt313 == local37) {
										local909.anInt313 = local40;
										break;
									}
								}
								this.method673(local20, local27);
							}
						}
					} else if (arg1 == 137) {
						local11 = arg0.method411();
						local20 = this.anInt1083 + (local11 >> 4 & 0x7);
						local27 = this.anInt1084 + (local11 & 0x7);
						local32 = arg0.method413();
						local37 = arg0.method411();
						local40 = arg0.method413();
						if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
							local20 = local20 * 128 + 64;
							local27 = local27 * 128 + 64;
							@Pc(1012) Class6_Sub1_Sub2_Sub1 local1012 = new Class6_Sub1_Sub2_Sub1(anInt936, local32, this.method595(local20, local27, this.anInt989) - local37, local27, local40, this.anInt989, local20, (byte) -126);
							this.aClass5_11.method30(local1012);
						}
					} else if (arg1 == 128) {
						local11 = arg0.method413();
						local20 = arg0.method411();
						local27 = this.anInt1083 + (local20 >> 4 & 0x7);
						local32 = this.anInt1084 + (local20 & 0x7);
						local37 = arg0.method411();
						local40 = local37 >> 2;
						local43 = local37 & 0x3;
						local48 = this.anIntArray254[local40];
						if (local27 >= 0 && local32 >= 0 && local27 < 103 && local32 < 103) {
							local53 = this.anIntArrayArrayArray8[this.anInt989][local27][local32];
							local56 = this.anIntArrayArrayArray8[this.anInt989][local27 + 1][local32];
							local59 = this.anIntArrayArrayArray8[this.anInt989][local27 + 1][local32 + 1];
							local62 = this.anIntArrayArrayArray8[this.anInt989][local27][local32 + 1];
							if (local48 == 0) {
								@Pc(1127) Class29 local1127 = this.aClass32_1.method341(this.anInt989, local32, local27);
								if (local1127 != null) {
									local394 = local1127.anInt495 >> 14 & 0x7FFF;
									if (local40 == 2) {
										local1127.aClass6_Sub1_Sub2_6 = new Class6_Sub1_Sub2_Sub6(local56, local43 + 4, local59, local62, 2, local53, local11, true, false, local394);
										local1127.aClass6_Sub1_Sub2_7 = new Class6_Sub1_Sub2_Sub6(local56, local43 + 1 & 0x3, local59, local62, 2, local53, local11, true, false, local394);
									} else {
										local1127.aClass6_Sub1_Sub2_6 = new Class6_Sub1_Sub2_Sub6(local56, local43, local59, local62, local40, local53, local11, true, false, local394);
									}
								}
							}
							if (local48 == 1) {
								@Pc(1204) Class27 local1204 = this.aClass32_1.method342(local27, (byte) 6, local32, this.anInt989);
								if (local1204 != null) {
									local1204.aClass6_Sub1_Sub2_5 = new Class6_Sub1_Sub2_Sub6(local56, 0, local59, local62, 4, local53, local11, true, false, local1204.anInt419 >> 14 & 0x7FFF);
								}
							}
							if (local48 == 2) {
								@Pc(1238) Class10 local1238 = this.aClass32_1.method343(local27, local32, this.anInt989);
								if (local40 == 11) {
									local40 = 10;
								}
								if (local1238 != null) {
									local1238.aClass6_Sub1_Sub2_4 = new Class6_Sub1_Sub2_Sub6(local56, local43, local59, local62, local40, local53, local11, true, false, local1238.anInt111 >> 14 & 0x7FFF);
								}
							}
							if (local48 == 3) {
								@Pc(1277) Class48 local1277 = this.aClass32_1.method344(this.anInt989, local32, local27);
								if (local1277 != null) {
									local1277.aClass6_Sub1_Sub2_8 = new Class6_Sub1_Sub2_Sub6(local56, local43, local59, local62, 22, local53, local11, true, false, local1277.anInt813 >> 14 & 0x7FFF);
								}
							}
						}
					} else if (arg1 == 51) {
						local11 = arg0.method439(this.anInt892);
						local20 = arg0.method430();
						local27 = this.anInt1083 + (local20 >> 4 & 0x7);
						local32 = this.anInt1084 + (local20 & 0x7);
						local37 = arg0.method413();
						if (local27 >= 0 && local32 >= 0 && local27 < 104 && local32 < 104) {
							local815 = new Class6_Sub1_Sub2_Sub4();
							local815.anInt314 = local11;
							local815.anInt313 = local37;
							if (this.aClass5ArrayArrayArray1[this.anInt989][local27][local32] == null) {
								this.aClass5ArrayArrayArray1[this.anInt989][local27][local32] = new Class5(-7255);
							}
							this.aClass5ArrayArrayArray1[this.anInt989][local27][local32].method30(local815);
							this.method673(local27, local32);
						}
					}
				}
			}
		} catch (@Pc(1391) RuntimeException local1391) {
			signlink.reporterror("44855, " + arg0 + ", " + false + ", " + arg1 + ", " + local1391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method678() {
		try {
			@Pc(6) Class6_Sub1_Sub2_Sub2 local6 = (Class6_Sub1_Sub2_Sub2) this.aClass5_12.method33();
			this.anInt1013 += 0;
			while (local6 != null) {
				if (local6.anInt154 != this.anInt989 || anInt936 > local6.anInt146) {
					local6.method548();
				} else if (anInt936 >= local6.anInt145) {
					if (local6.anInt153 > 0) {
						@Pc(42) Class6_Sub1_Sub2_Sub3_Sub2 local42 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local6.anInt153 - 1];
						if (local42 != null && local42.anInt535 >= 0 && local42.anInt535 < 13312 && local42.anInt536 >= 0 && local42.anInt536 < 13312) {
							local6.method112((byte) 7, local42.anInt535, this.method595(local42.anInt535, local42.anInt536, local6.anInt154) - local6.anInt150, local42.anInt536, anInt936);
						}
					}
					if (local6.anInt153 < 0) {
						@Pc(87) int local87 = -local6.anInt153 - 1;
						@Pc(93) Class6_Sub1_Sub2_Sub3_Sub1 local93;
						if (local87 == this.anInt1068) {
							local93 = aClass6_Sub1_Sub2_Sub3_Sub1_1;
						} else {
							local93 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local87];
						}
						if (local93 != null && local93.anInt535 >= 0 && local93.anInt535 < 13312 && local93.anInt536 >= 0 && local93.anInt536 < 13312) {
							local6.method112((byte) 7, local93.anInt535, this.method595(local93.anInt535, local93.anInt536, local6.anInt154) - local6.anInt150, local93.anInt536, anInt936);
						}
					}
					local6.method113(this.anInt984);
					this.aClass32_1.method330((int) local6.aDouble6, (int) local6.aDouble7, -1, local6.anInt156, this.anInt989, false, (int) local6.aDouble5, local6, 60);
				}
				local6 = (Class6_Sub1_Sub2_Sub2) this.aClass5_12.method35((byte) 8);
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("47458, " + 0 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!RGCGKKUR;I)V")
	private void method679(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1) {
		try {
			this.anInt893 = 0;
			this.anInt873 = 0;
			this.method646(arg1, arg0, 566);
			this.method697(arg1, arg0);
			this.method590(this.anInt965, arg1, arg0);
			this.method656(arg0, arg1);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt893; local33++) {
				local40 = this.anIntArray231[local33];
				if (this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local40].anInt559 != anInt936) {
					this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local40] = null;
				}
			}
			if (arg1.anInt704 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt704 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt872; local40++) {
				if (this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray223[local40]] == null) {
					signlink.reporterror(this.aString27 + " null entry in pl list - pos:" + local40 + " size:" + this.anInt872);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("37627, " + arg0 + ", " + arg1 + ", " + -523 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method680(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1023 >= 100 && this.anInt1045 != 1) {
					this.method707("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else if (this.anInt1023 >= 200) {
					this.method707("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else {
					@Pc(38) String local38 = Class38.method457(Class38.method454(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1023; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method707(local38 + " is already on your friend list", 0, "");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt1009; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method707("Please remove " + local38 + " from your ignore list first", 0, "");
							return;
						}
					}
					if (!local38.equals(aClass6_Sub1_Sub2_Sub3_Sub1_1.aString5)) {
						this.aStringArray14[this.anInt1023] = local38;
						this.aLongArray4[this.anInt1023] = arg0;
						this.anIntArray227[this.anInt1023] = 0;
						this.anInt1023++;
						this.aBoolean253 = true;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 73);
						this.aClass6_Sub1_Sub4_9.method407(arg0);
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("8652, " + 842 + ", " + arg0 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!QUBPQDMQ;I)Z")
	private boolean method681(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(14) int local14 = arg0.anInt682;
			if (this.anInt1024 == 2) {
				if (local14 == 201) {
					this.aBoolean246 = true;
					this.anInt1010 = 0;
					this.aBoolean247 = true;
					this.aString21 = "";
					this.anInt1018 = 1;
					this.aString26 = "Enter name of friend to add to list";
				}
				if (local14 == 202) {
					this.aBoolean246 = true;
					this.anInt1010 = 0;
					this.aBoolean247 = true;
					this.aString21 = "";
					this.anInt1018 = 2;
					this.aString26 = "Enter name of friend to delete from list";
				}
			}
			if (local14 == 205) {
				this.anInt1017 = 250;
				return true;
			}
			if (local14 == 501) {
				this.aBoolean246 = true;
				this.anInt1010 = 0;
				this.aBoolean247 = true;
				this.aString21 = "";
				this.anInt1018 = 4;
				this.aString26 = "Enter name of player to add to list";
			}
			if (local14 == 502) {
				this.aBoolean246 = true;
				this.anInt1010 = 0;
				this.aBoolean247 = true;
				this.aString21 = "";
				this.anInt1018 = 5;
				this.aString26 = "Enter name of player to delete from list";
			}
			@Pc(122) int local122;
			@Pc(126) int local126;
			@Pc(131) int local131;
			if (local14 >= 300 && local14 <= 313) {
				local122 = (local14 - 300) / 2;
				local126 = local14 & 0x1;
				local131 = this.anIntArray255[local122];
				if (local131 != -1) {
					while (true) {
						if (local126 == 0) {
							local131--;
							if (local131 < 0) {
								local131 = Class16.anInt308 - 1;
							}
						}
						if (local126 == 1) {
							local131++;
							if (local131 >= Class16.anInt308) {
								local131 = 0;
							}
						}
						if (!Class16.aClass16Array1[local131].aBoolean76 && Class16.aClass16Array1[local131].anInt309 == local122 + (this.aBoolean268 ? 0 : 7)) {
							this.anIntArray255[local122] = local131;
							this.aBoolean265 = true;
							break;
						}
					}
				}
			}
			if (local14 >= 314 && local14 <= 323) {
				local122 = (local14 - 314) / 2;
				local126 = local14 & 0x1;
				local131 = this.anIntArray213[local122];
				if (local126 == 0) {
					local131--;
					if (local131 < 0) {
						local131 = anIntArrayArray24[local122].length - 1;
					}
				}
				if (local126 == 1) {
					local131++;
					if (local131 >= anIntArrayArray24[local122].length) {
						local131 = 0;
					}
				}
				this.anIntArray213[local122] = local131;
				this.aBoolean265 = true;
			}
			if (local14 == 324 && !this.aBoolean268) {
				this.aBoolean268 = true;
				this.method650(268);
			}
			if (local14 == 325 && this.aBoolean268) {
				this.aBoolean268 = false;
				this.method650(268);
			}
			if (local14 == 326) {
				this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 140);
				this.aClass6_Sub1_Sub4_9.method401(this.aBoolean268 ? 0 : 1);
				for (local122 = 0; local122 < 7; local122++) {
					this.aClass6_Sub1_Sub4_9.method401(this.anIntArray255[local122]);
				}
				for (local126 = 0; local126 < 5; local126++) {
					this.aClass6_Sub1_Sub4_9.method401(this.anIntArray213[local126]);
				}
				return true;
			}
			if (local14 == 620) {
				this.aBoolean273 = !this.aBoolean273;
			}
			if (local14 >= 601 && local14 <= 613) {
				this.method608();
				if (this.aString20.length() > 0) {
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 187);
					this.aClass6_Sub1_Sub4_9.method407(Class38.method453(this.aString20));
					this.aClass6_Sub1_Sub4_9.method401(local14 - 601);
					this.aClass6_Sub1_Sub4_9.method401(this.aBoolean273 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("20297, " + arg0 + ", " + 1203 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!OZYWPVDM;I)V")
	private void method682(@OriginalArg(1) Class6_Sub1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method683(arg0.anInt536, arg1, arg0.anInt535);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("26900, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)V")
	private void method683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method595(arg2, arg0, this.anInt989) - arg1;
				@Pc(33) int local33 = arg2 - this.anInt1031;
				@Pc(38) int local38 = local28 - this.anInt1032;
				@Pc(43) int local43 = arg0 - this.anInt1033;
				@Pc(48) int local48 = Class6_Sub1_Sub2_Sub5.anIntArray121[this.anInt1034];
				@Pc(53) int local53 = Class6_Sub1_Sub2_Sub5.anIntArray122[this.anInt1034];
				@Pc(58) int local58 = Class6_Sub1_Sub2_Sub5.anIntArray121[this.anInt1035];
				@Pc(63) int local63 = Class6_Sub1_Sub2_Sub5.anIntArray122[this.anInt1035];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(105) int local105 = local38 * local48 + local83 * local53 >> 16;
				if (local105 >= 50) {
					this.anInt905 = Class6_Sub1_Sub1_Sub1.anInt83 + (local85 << 9) / local105;
					this.anInt906 = Class6_Sub1_Sub1_Sub1.anInt84 + (local95 << 9) / local105;
				} else {
					this.anInt905 = -1;
					this.anInt906 = -1;
				}
			} else {
				this.anInt905 = -1;
				this.anInt906 = -1;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("2364, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZSWNSCUQ;ZII)V")
	private void method684(@OriginalArg(0) Class6_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (!arg1) {
				this.method580();
			}
			@Pc(11) int local11 = arg2 * arg2 + arg3 * arg3;
			if (local11 > 4225 && local11 < 90000) {
				@Pc(25) int local25 = this.anInt900 + this.anInt1047 & 0x7FF;
				@Pc(29) int local29 = Class6_Sub1_Sub2_Sub5.anIntArray121[local25];
				@Pc(33) int local33 = Class6_Sub1_Sub2_Sub5.anIntArray122[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt874 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt874 + 256);
				@Pc(61) int local61 = arg3 * local42 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg3 * local51 - arg2 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass6_Sub1_Sub1_Sub4_6.method572(local77, 83 - local89 - 20, local83 + 94 + 4 - 10);
			} else {
				this.method714(arg3, arg2, arg0);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("53226, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean272) {
			this.method642();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray256[arg0];
				@Pc(14) int local14 = this.anIntArray257[arg0];
				@Pc(19) int local19 = this.anIntArray258[arg0];
				@Pc(24) int local24 = this.anIntArray259[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt1010 != 0 && local19 != 1033) {
					this.anInt1010 = 0;
					this.aBoolean246 = true;
				}
				if (local19 == 695 && this.method698(local14, local24, local9)) {
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 106);
					this.aClass6_Sub1_Sub4_9.method436(this.anInt972, this.anInt891);
					this.aClass6_Sub1_Sub4_9.method402(local14 + this.anInt929);
					this.aClass6_Sub1_Sub4_9.method434(local9 + this.anInt928);
					this.aClass6_Sub1_Sub4_9.method435(this.anInt890);
					this.aClass6_Sub1_Sub4_9.method434(this.anInt889);
					this.aClass6_Sub1_Sub4_9.method435(local24 >> 14 & 0x7FFF);
				}
				@Pc(107) Class6_Sub1_Sub2_Sub3_Sub1 local107;
				if (local19 == 822) {
					local107 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local24];
					if (local107 != null) {
						this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local107.anIntArray142[0], local107.anIntArray143[0]);
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 190);
						this.aClass6_Sub1_Sub4_9.method435(this.anInt1086);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
					}
				}
				if (local19 == 716) {
					local107 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local24];
					if (local107 != null) {
						this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local107.anIntArray142[0], local107.anIntArray143[0]);
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 169);
						this.aClass6_Sub1_Sub4_9.method434(local24);
					}
				}
				if (local19 == 549) {
					if (this.aBoolean270) {
						this.aClass32_1.method357(local14 - 4, local9 - 4);
					} else {
						this.aClass32_1.method357(super.anInt859 - 4, super.anInt858 - 4);
					}
				}
				@Pc(285) String local285;
				@Pc(300) String local300;
				@Pc(266) Class35 local266;
				if (local19 == 598) {
					local266 = Class35.method389(local14);
					this.anInt1085 = 1;
					this.anInt1086 = local14;
					this.anInt1087 = local266.anInt680;
					this.anInt888 = 0;
					this.aBoolean253 = true;
					local285 = local266.aString12;
					if (local285.indexOf(" ") != -1) {
						local285 = local285.substring(0, local285.indexOf(" "));
					}
					local300 = local266.aString12;
					if (local300.indexOf(" ") != -1) {
						local300 = local300.substring(local300.indexOf(" ") + 1);
					}
					this.aString31 = local285 + " " + local266.aString9 + " " + local300;
					if (this.anInt1087 == 16) {
						this.aBoolean253 = true;
						this.anInt1071 = 3;
						this.aBoolean263 = true;
					}
				} else if (local19 == 960) {
					this.anInt888 = 1;
					this.anInt889 = local9;
					this.anInt890 = local14;
					this.anInt891 = local24;
					this.aString17 = String.valueOf(Class4.method22(local24).aString1);
					this.anInt1085 = 0;
					this.aBoolean253 = true;
				} else {
					@Pc(380) Class6_Sub1_Sub2_Sub3_Sub2 local380;
					if (local19 == 144) {
						local380 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local380 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local380.anIntArray142[0], local380.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							if ((local24 & 0x3) == 0) {
								anInt1012++;
							}
							if (anInt1012 >= 106) {
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 32);
								this.aClass6_Sub1_Sub4_9.method402(55586);
								anInt1012 = 0;
							}
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 18);
							this.aClass6_Sub1_Sub4_9.method435(local24);
						}
					}
					if (local19 == 480) {
						local107 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local107 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local107.anIntArray142[0], local107.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							anInt1095 += local24;
							if (anInt1095 >= 89) {
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 85);
								this.aClass6_Sub1_Sub4_9.method405(0);
								anInt1095 = 0;
							}
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 113);
							this.aClass6_Sub1_Sub4_9.method402(local24);
						}
					}
					if (local19 == 744) {
						local380 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local380 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local380.anIntArray142[0], local380.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 105);
							this.aClass6_Sub1_Sub4_9.method402(local24);
						}
					}
					if (local19 == 651) {
						local107 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local107 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local107.anIntArray142[0], local107.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 138);
							this.aClass6_Sub1_Sub4_9.method434(local24);
						}
					}
					@Pc(672) int local672;
					@Pc(668) String local668;
					if (local19 == 541) {
						local668 = this.aStringArray9[arg0];
						local672 = local668.indexOf("@whi@");
						if (local672 != -1) {
							if (this.anInt985 == -1) {
								this.method608();
								this.aString20 = local668.substring(local672 + 5).trim();
								this.aBoolean273 = false;
								this.anInt865 = this.anInt985 = Class35.anInt670;
							} else {
								this.method707("Please close the interface you have open before using 'report abuse'", 0, "");
							}
						}
					}
					if (local19 == 881) {
						local380 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local380 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local380.anIntArray142[0], local380.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							anInt1072 += local24;
							if (anInt1072 >= 132) {
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 20);
								this.aClass6_Sub1_Sub4_9.method405(0);
								anInt1072 = 0;
							}
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 148);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
						}
					}
					if (local19 == 125) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 90);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
						this.aClass6_Sub1_Sub4_9.method434(local9);
						this.aClass6_Sub1_Sub4_9.method434(local14);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 579) {
						this.method608();
					}
					if (local19 == 183 && this.method698(local14, local24, local9)) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 55);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24 >> 14 & 0x7FFF);
						this.aClass6_Sub1_Sub4_9.method402(local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
						this.aClass6_Sub1_Sub4_9.method435(this.anInt1086);
					}
					@Pc(929) long local929;
					if (local19 == 138 || local19 == 997 || local19 == 154 || local19 == 837) {
						local668 = this.aStringArray9[arg0];
						local672 = local668.indexOf("@whi@");
						if (local672 != -1) {
							local929 = Class38.method453(local668.substring(local672 + 5).trim());
							if (local19 == 138) {
								this.method680(local929);
							}
							if (local19 == 997) {
								this.method719(local929);
							}
							if (local19 == 154) {
								this.method696(local929);
							}
							if (local19 == 837) {
								this.method665(local929, this.anInt1001);
							}
						}
					}
					if (local19 == 322 && !this.aBoolean237) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 185);
						this.aClass6_Sub1_Sub4_9.method402(local14);
						this.aBoolean237 = true;
					}
					@Pc(1001) boolean local1001;
					if (local19 == 669) {
						local1001 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, false, 2, local9, local14);
						if (!local1001) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local9, local14);
						}
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 172);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method402(local14 + this.anInt929);
					}
					if (local19 == 551) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 8);
						this.aClass6_Sub1_Sub4_9.method435(local24);
						this.aClass6_Sub1_Sub4_9.method434(local9);
						this.aClass6_Sub1_Sub4_9.method402(local14);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 559) {
						this.method589(this.anInt981);
						this.anInt981 = -1;
						this.aBoolean246 = true;
					}
					if (local19 == 264) {
						local107 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local107 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local107.anIntArray142[0], local107.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 75);
							this.aClass6_Sub1_Sub4_9.method434(local24);
						}
					}
					if (local19 == 78) {
						local1001 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, false, 2, local9, local14);
						if (!local1001) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local9, local14);
						}
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 119);
						this.aClass6_Sub1_Sub4_9.method435(local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local14 + this.anInt929);
					}
					if (local19 == 59) {
						local380 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local380 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local380.anIntArray142[0], local380.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 57);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
						}
					}
					if (local19 == 1103) {
						this.method698(local14, local24, local9);
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 109);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
						this.aClass6_Sub1_Sub4_9.method434(local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method435(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 354) {
						local380 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local380 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local380.anIntArray142[0], local380.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 49);
							this.aClass6_Sub1_Sub4_9.method435(local24);
						}
					}
					@Pc(1457) Class4 local1457;
					if (local19 == 1977) {
						local1457 = Class4.method22(local24);
						if (local1457.aByteArray1 == null) {
							local285 = "It's a " + local1457.aString1 + ".";
						} else {
							local285 = new String(local1457.aByteArray1);
						}
						this.method707(local285, 0, "");
					}
					if (local19 == 891) {
						local266 = Class35.method389(local14);
						@Pc(1493) boolean local1493 = true;
						if (local266.anInt682 > 0) {
							local1493 = this.method681(local266);
						}
						if (local1493) {
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 211);
							this.aClass6_Sub1_Sub4_9.method402(local14);
						}
					}
					if (local19 == 163) {
						local1001 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, false, 2, local9, local14);
						if (!local1001) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local9, local14);
						}
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 86);
						this.aClass6_Sub1_Sub4_9.method402(this.anInt889);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
						this.aClass6_Sub1_Sub4_9.method434(this.anInt891);
						this.aClass6_Sub1_Sub4_9.method402(this.anInt890);
						this.aClass6_Sub1_Sub4_9.method434(local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
					}
					if (local19 == 288) {
						if ((this.anInt928 & 0x3) == 0) {
							anInt1067++;
						}
						if (anInt1067 >= 107) {
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 156);
							this.aClass6_Sub1_Sub4_9.method405(0);
							anInt1067 = 0;
						}
						this.method698(local14, local24, local9);
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 7);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
						this.aClass6_Sub1_Sub4_9.method434(local24 >> 14 & 0x7FFF);
						this.aClass6_Sub1_Sub4_9.method402(local9 + this.anInt928);
					}
					if (local19 == 405) {
						local107 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local107 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local107.anIntArray142[0], local107.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 130);
							this.aClass6_Sub1_Sub4_9.method402(this.anInt890);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, this.anInt891);
							this.aClass6_Sub1_Sub4_9.method434(this.anInt889);
						}
					}
					if (local19 == 740) {
						local1001 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, false, 2, local9, local14);
						if (!local1001) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local9, local14);
						}
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 192);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local14 + this.anInt929);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
					}
					if (local19 == 708) {
						local380 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local380 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local380.anIntArray142[0], local380.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 235);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, this.anInt890);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, this.anInt889);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
							this.aClass6_Sub1_Sub4_9.method402(this.anInt891);
						}
					}
					if (local19 == 840) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 131);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local9);
						this.aClass6_Sub1_Sub4_9.method402(local14);
						this.aClass6_Sub1_Sub4_9.method435(local24);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 1219) {
						local380 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local380 != null) {
							@Pc(2003) Class47 local2003 = local380.aClass47_2;
							if (local2003.anIntArray201 != null) {
								local2003 = local2003.method537();
							}
							if (local2003 != null) {
								if (local2003.aByteArray20 == null) {
									local300 = "It's a " + local2003.aString16 + ".";
								} else {
									local300 = new String(local2003.aByteArray20);
								}
								this.method707(local300, 0, "");
							}
						}
					}
					if (local19 == 769) {
						anInt1007 += local14;
						if (anInt1007 >= 97) {
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 16);
							this.aClass6_Sub1_Sub4_9.method402(43274);
							anInt1007 = 0;
						}
						this.method698(local14, local24, local9);
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 145);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
						this.aClass6_Sub1_Sub4_9.method434(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 682) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 211);
						this.aClass6_Sub1_Sub4_9.method402(local14);
						local266 = Class35.method389(local14);
						if (local266.anIntArrayArray19 != null && local266.anIntArrayArray19[0][0] == 5) {
							local672 = local266.anIntArrayArray19[0][1];
							this.anIntArray236[local672] = 1 - this.anIntArray236[local672];
							this.method671(local672, this.aByte35);
							this.aBoolean253 = true;
						}
					}
					if (local19 == 330) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 78);
						this.aClass6_Sub1_Sub4_9.method402(local24);
						this.aClass6_Sub1_Sub4_9.method434(local14);
						this.aClass6_Sub1_Sub4_9.method402(local9);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 283) {
						local107 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local107 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local107.anIntArray142[0], local107.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							anInt935 += local24;
							if (anInt935 >= 88) {
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 163);
								this.aClass6_Sub1_Sub4_9.method402(5996);
								anInt935 = 0;
							}
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 99);
							this.aClass6_Sub1_Sub4_9.method402(local24);
						}
					}
					if (local19 == 688) {
						anInt1049 += local24;
						if (anInt1049 >= 119) {
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 205);
							this.aClass6_Sub1_Sub4_9.method402(11544);
							anInt1049 = 0;
						}
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 242);
						this.aClass6_Sub1_Sub4_9.method435(local9);
						this.aClass6_Sub1_Sub4_9.method434(local24);
						this.aClass6_Sub1_Sub4_9.method434(local14);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 261) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 183);
						this.aClass6_Sub1_Sub4_9.method435(local9);
						this.aClass6_Sub1_Sub4_9.method435(local14);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
						this.aClass6_Sub1_Sub4_9.method434(this.anInt1086);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					@Pc(2444) int local2444;
					if (local19 == 946) {
						local668 = this.aStringArray9[arg0];
						local672 = local668.indexOf("@whi@");
						if (local672 != -1) {
							local929 = Class38.method453(local668.substring(local672 + 5).trim());
							local2444 = -1;
							for (@Pc(2446) int local2446 = 0; local2446 < this.anInt1023; local2446++) {
								if (this.aLongArray4[local2446] == local929) {
									local2444 = local2446;
									break;
								}
							}
							if (local2444 != -1 && this.anIntArray227[local2444] > 0) {
								this.aBoolean246 = true;
								this.anInt1010 = 0;
								this.aBoolean247 = true;
								this.aString21 = "";
								this.anInt1018 = 3;
								this.aLong29 = this.aLongArray4[local2444];
								this.aString26 = "Enter message to send to " + this.aStringArray14[local2444];
							}
						}
					}
					if (local19 == 459) {
						if ((local14 & 0x3) == 0) {
							anInt1040++;
						}
						if (anInt1040 >= 78) {
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 72);
							this.aClass6_Sub1_Sub4_9.method401(127);
							anInt1040 = 0;
						}
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 28);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local14);
						this.aClass6_Sub1_Sub4_9.method434(local24);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local9);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 550) {
						local1001 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, false, 2, local9, local14);
						if (!local1001) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local9, local14);
						}
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 250);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, this.anInt1086);
						this.aClass6_Sub1_Sub4_9.method434(local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
					}
					if (local19 == 1415) {
						@Pc(2689) int local2689 = local24 >> 14 & 0x7FFF;
						@Pc(2692) Class28 local2692 = Class28.method268(local2689);
						if (local2692.aByteArray7 == null) {
							local300 = "It's a " + local2692.aString6 + ".";
						} else {
							local300 = new String(local2692.aByteArray7);
						}
						this.method707(local300, 0, "");
					}
					if (local19 == 119 || local19 == 875) {
						local668 = this.aStringArray9[arg0];
						local672 = local668.indexOf("@whi@");
						if (local672 != -1) {
							local668 = local668.substring(local672 + 5).trim();
							local300 = Class38.method457(Class38.method454(Class38.method453(local668)));
							@Pc(2754) boolean local2754 = false;
							for (local2444 = 0; local2444 < this.anInt872; local2444++) {
								@Pc(2766) Class6_Sub1_Sub2_Sub3_Sub1 local2766 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray223[local2444]];
								if (local2766 != null && local2766.aString5 != null && local2766.aString5.equalsIgnoreCase(local300)) {
									this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local2766.anIntArray142[0], local2766.anIntArray143[0]);
									if (local19 == 119) {
										anInt935 += local24;
										if (anInt935 >= 88) {
											this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 163);
											this.aClass6_Sub1_Sub4_9.method402(5996);
											anInt935 = 0;
										}
										this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 99);
										this.aClass6_Sub1_Sub4_9.method402(this.anIntArray223[local2444]);
									}
									if (local19 == 875) {
										this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 75);
										this.aClass6_Sub1_Sub4_9.method434(this.anIntArray223[local2444]);
									}
									local2754 = true;
									break;
								}
							}
							if (!local2754) {
								this.method707("Unable to find " + local300, 0, "");
							}
						}
					}
					if (local19 == 813) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 243);
						this.aClass6_Sub1_Sub4_9.method402(local14);
						this.aClass6_Sub1_Sub4_9.method435(local9);
						this.aClass6_Sub1_Sub4_9.method435(local24);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 1985) {
						local1457 = Class4.method22(local24);
						@Pc(2940) Class35 local2940 = Class35.method389(local14);
						if (local2940 != null && local2940.anIntArray184[local9] >= 100000) {
							local285 = local2940.anIntArray184[local9] + " x " + local1457.aString1;
						} else if (local1457.aByteArray1 == null) {
							local285 = "It's a " + local1457.aString1 + ".";
						} else {
							local285 = new String(local1457.aByteArray1);
						}
						this.method707(local285, 0, "");
					}
					if (local19 == 548) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 211);
						this.aClass6_Sub1_Sub4_9.method402(local14);
						local266 = Class35.method389(local14);
						if (local266.anIntArrayArray19 != null && local266.anIntArrayArray19[0][0] == 5) {
							local672 = local266.anIntArrayArray19[0][1];
							if (this.anIntArray236[local672] != local266.anIntArray186[0]) {
								this.anIntArray236[local672] = local266.anIntArray186[0];
								this.method671(local672, this.aByte35);
								this.aBoolean253 = true;
							}
						}
					}
					if (local19 == 301) {
						this.method698(local14, local24, local9);
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 41);
						this.aClass6_Sub1_Sub4_9.method435(local24 >> 14 & 0x7FFF);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
						this.aClass6_Sub1_Sub4_9.method435(local9 + this.anInt928);
					}
					if (local19 == 773) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 35);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local9);
						this.aClass6_Sub1_Sub4_9.method434(local14);
						this.aClass6_Sub1_Sub4_9.method435(local24);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 6) {
						if ((local24 & 0x3) == 0) {
							anInt1088++;
						}
						if (anInt1088 >= 93) {
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 144);
							this.aClass6_Sub1_Sub4_9.method405(0);
							anInt1088 = 0;
						}
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 33);
						this.aClass6_Sub1_Sub4_9.method434(local24);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local9);
						this.aClass6_Sub1_Sub4_9.method402(local14);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 126) {
						local1001 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, false, 2, local9, local14);
						if (!local1001) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local9, local14);
						}
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 27);
						this.aClass6_Sub1_Sub4_9.method434(local24);
						this.aClass6_Sub1_Sub4_9.method434(local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
					}
					if (local19 == 652) {
						this.method698(local14, local24, local9);
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 189);
						this.aClass6_Sub1_Sub4_9.method434(local24 >> 14 & 0x7FFF);
						this.aClass6_Sub1_Sub4_9.method402(local14 + this.anInt929);
						this.aClass6_Sub1_Sub4_9.method434(local9 + this.anInt928);
					}
					if (local19 == 612) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 69);
						this.aClass6_Sub1_Sub4_9.method434(this.anInt891);
						this.aClass6_Sub1_Sub4_9.method434(local14);
						this.aClass6_Sub1_Sub4_9.method434(this.anInt889);
						this.aClass6_Sub1_Sub4_9.method435(local24);
						this.aClass6_Sub1_Sub4_9.method435(this.anInt890);
						this.aClass6_Sub1_Sub4_9.method435(local9);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					if (local19 == 834) {
						local380 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local380 != null) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local380.anIntArray142[0], local380.anIntArray143[0]);
							this.anInt894 = super.anInt858;
							this.anInt895 = super.anInt859;
							this.anInt897 = 2;
							this.anInt896 = 0;
							this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 83);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
							this.aClass6_Sub1_Sub4_9.method436(this.anInt972, this.anInt1086);
						}
					}
					if (local19 == 922) {
						local1001 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, false, 2, local9, local14);
						if (!local1001) {
							this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 1, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 1, 0, false, 2, local9, local14);
						}
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 2;
						this.anInt896 = 0;
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 100);
						this.aClass6_Sub1_Sub4_9.method402(local24);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local9 + this.anInt928);
						this.aClass6_Sub1_Sub4_9.method434(local14 + this.anInt929);
					}
					if (local19 == 616) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 24);
						this.aClass6_Sub1_Sub4_9.method436(this.anInt972, local24);
						this.aClass6_Sub1_Sub4_9.method434(local9);
						this.aClass6_Sub1_Sub4_9.method434(local14);
						this.anInt913 = 0;
						this.anInt914 = local14;
						this.anInt915 = local9;
						this.anInt916 = 2;
						if (Class35.method389(local14).anInt663 == this.anInt985) {
							this.anInt916 = 1;
						}
						if (Class35.method389(local14).anInt663 == this.anInt1030) {
							this.anInt916 = 3;
						}
					}
					this.anInt888 = 0;
					this.anInt1085 = 0;
					this.aBoolean253 = true;
					if (arg1 != 19817) {
						this.anInt1021 = 160;
					}
				}
			}
		} catch (@Pc(3655) RuntimeException local3655) {
			signlink.reporterror("18680, " + arg0 + ", " + arg1 + ", " + local3655.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method687() {
		try {
			if (this.anInt1050 > 1) {
				this.anInt1050--;
			}
			if (this.anInt1017 > 0) {
				this.anInt1017--;
			}
			for (@Pc(34) int local34 = 0; local34 < 5 && this.method609(); local34++) {
			}
			if (this.aBoolean243) {
				@Pc(53) Object local53 = this.aClass9_1.anObject1;
				@Pc(79) int local79;
				@Pc(81) int local81;
				@Pc(83) int local83;
				@Pc(116) int local116;
				synchronized (this.aClass9_1.anObject1) {
					if (!aBoolean267) {
						this.aClass9_1.anInt99 = 0;
					} else if (super.anInt857 != 0 || this.aClass9_1.anInt99 >= 40) {
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 80);
						this.aClass6_Sub1_Sub4_9.method401(0);
						local79 = this.aClass6_Sub1_Sub4_9.anInt704;
						local81 = 0;
						@Pc(99) int local99;
						for (local83 = 0; local83 < this.aClass9_1.anInt99 && local79 - this.aClass6_Sub1_Sub4_9.anInt704 < 240; local83++) {
							local81++;
							local99 = this.aClass9_1.anIntArray35[local83];
							if (local99 < 0) {
								local99 = 0;
							} else if (local99 > 502) {
								local99 = 502;
							}
							local116 = this.aClass9_1.anIntArray34[local83];
							if (local116 < 0) {
								local116 = 0;
							} else if (local116 > 764) {
								local116 = 764;
							}
							@Pc(133) int local133 = local99 * 765 + local116;
							if (this.aClass9_1.anIntArray35[local83] == -1 && this.aClass9_1.anIntArray34[local83] == -1) {
								local116 = -1;
								local99 = -1;
								local133 = 524287;
							}
							if (local116 != this.anInt953 || local99 != this.anInt954) {
								@Pc(178) int local178 = local116 - this.anInt953;
								this.anInt953 = local116;
								@Pc(186) int local186 = local99 - this.anInt954;
								this.anInt954 = local99;
								if (this.anInt867 < 8 && local178 >= -32 && local178 <= 31 && local186 >= -32 && local186 <= 31) {
									local178 += 32;
									local186 += 32;
									this.aClass6_Sub1_Sub4_9.method402((this.anInt867 << 12) + (local178 << 6) + local186);
									this.anInt867 = 0;
								} else if (this.anInt867 < 8) {
									this.aClass6_Sub1_Sub4_9.method404((this.anInt867 << 19) + local133 + 8388608);
									this.anInt867 = 0;
								} else {
									this.aClass6_Sub1_Sub4_9.method405((this.anInt867 << 19) + local133 - 1073741824);
									this.anInt867 = 0;
								}
							} else if (this.anInt867 < 2047) {
								this.anInt867++;
							}
						}
						this.aClass6_Sub1_Sub4_9.method410(this.aClass6_Sub1_Sub4_9.anInt704 - local79);
						if (local81 >= this.aClass9_1.anInt99) {
							this.aClass9_1.anInt99 = 0;
						} else {
							this.aClass9_1.anInt99 -= local81;
							for (local99 = 0; local99 < this.aClass9_1.anInt99; local99++) {
								this.aClass9_1.anIntArray34[local99] = this.aClass9_1.anIntArray34[local99 + local81];
								this.aClass9_1.anIntArray35[local99] = this.aClass9_1.anIntArray35[local99 + local81];
							}
						}
					}
				}
				if (super.anInt857 != 0) {
					@Pc(349) long local349 = (super.aLong28 - this.aLong33) / 50L;
					if (local349 > 4095L) {
						local349 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local79 = super.anInt859;
					if (local79 < 0) {
						local79 = 0;
					} else if (local79 > 502) {
						local79 = 502;
					}
					local81 = super.anInt858;
					if (local81 < 0) {
						local81 = 0;
					} else if (local81 > 764) {
						local81 = 764;
					}
					local83 = local79 * 765 + local81;
					@Pc(395) byte local395 = 0;
					if (super.anInt857 == 2) {
						local395 = 1;
					}
					local116 = (int) local349;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 48);
					this.aClass6_Sub1_Sub4_9.method443((local116 << 20) + (local395 << 19) + local83);
				}
				if (this.anInt1043 > 0) {
					this.anInt1043--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean266 = true;
				}
				if (this.aBoolean266 && this.anInt1043 <= 0) {
					this.anInt1043 = 20;
					this.aBoolean266 = false;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 23);
					this.aClass6_Sub1_Sub4_9.method434(this.anInt900);
					this.aClass6_Sub1_Sub4_9.method436(this.anInt972, this.anInt899);
				}
				if (super.aBoolean228 && !this.aBoolean269) {
					this.aBoolean269 = true;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 240);
					this.aClass6_Sub1_Sub4_9.method401(1);
				}
				if (!super.aBoolean228 && this.aBoolean269) {
					this.aBoolean269 = false;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 240);
					this.aClass6_Sub1_Sub4_9.method401(0);
				}
				this.method666();
				this.method664(this.aByte37);
				this.method630();
				this.anInt1015++;
				if (this.anInt1015 > 750) {
					this.method607();
				}
				this.method632();
				this.method617(this.aByte30);
				this.method652();
				anInt1020++;
				@Pc(588) int local588;
				if (anInt1020 > 1465) {
					anInt1020 = 0;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 2);
					this.aClass6_Sub1_Sub4_9.method401(0);
					local588 = this.aClass6_Sub1_Sub4_9.anInt704;
					this.aClass6_Sub1_Sub4_9.method401(49);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub1_Sub4_9.method402(39379);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub1_Sub4_9.method402(41943);
					}
					this.aClass6_Sub1_Sub4_9.method402(58974);
					this.aClass6_Sub1_Sub4_9.method401((int) (Math.random() * 256.0D));
					this.aClass6_Sub1_Sub4_9.method401((int) (Math.random() * 256.0D));
					this.aClass6_Sub1_Sub4_9.method402((int) (Math.random() * 65536.0D));
					this.aClass6_Sub1_Sub4_9.method402(51515);
					this.aClass6_Sub1_Sub4_9.method401(17);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub1_Sub4_9.method401(167);
					}
					this.aClass6_Sub1_Sub4_9.method410(this.aClass6_Sub1_Sub4_9.anInt704 - local588);
				}
				this.anInt984++;
				if (this.anInt897 != 0) {
					this.anInt896 += 20;
					if (this.anInt896 >= 400) {
						this.anInt897 = 0;
					}
				}
				if (this.anInt916 != 0) {
					this.anInt913++;
					if (this.anInt913 >= 15) {
						if (this.anInt916 == 2) {
							this.aBoolean253 = true;
						}
						if (this.anInt916 == 3) {
							this.aBoolean246 = true;
						}
						this.anInt916 = 0;
					}
				}
				if (this.anInt1092 != 0) {
					this.anInt918++;
					if (super.anInt852 > this.anInt1093 + 5 || super.anInt852 < this.anInt1093 - 5 || super.anInt853 > this.anInt1094 + 5 || super.anInt853 < this.anInt1094 - 5) {
						this.aBoolean249 = true;
					}
					if (super.anInt851 == 0) {
						if (this.anInt1092 == 2) {
							this.aBoolean253 = true;
						}
						if (this.anInt1092 == 3) {
							this.aBoolean246 = true;
						}
						this.anInt1092 = 0;
						if (this.aBoolean249 && this.anInt918 >= 5) {
							this.anInt942 = -1;
							this.method615();
							if (this.anInt942 == this.anInt1090 && this.anInt941 != this.anInt1091) {
								@Pc(800) Class35 local800 = Class35.method389(this.anInt1090);
								@Pc(802) byte local802 = 0;
								if (this.anInt962 == 1 && local800.anInt682 == 206) {
									local802 = 1;
								}
								if (local800.anIntArray185[this.anInt941] <= 0) {
									local802 = 0;
								}
								if (local800.aBoolean169) {
									local79 = this.anInt1091;
									local81 = this.anInt941;
									local800.anIntArray185[local81] = local800.anIntArray185[local79];
									local800.anIntArray184[local81] = local800.anIntArray184[local79];
									local800.anIntArray185[local79] = -1;
									local800.anIntArray184[local79] = 0;
								} else if (local802 == 1) {
									local79 = this.anInt1091;
									local81 = this.anInt941;
									while (local79 != local81) {
										if (local79 > local81) {
											local800.method388(local79 - 1, local79);
											local79--;
										} else if (local79 < local81) {
											local800.method388(local79 + 1, local79);
											local79++;
										}
									}
								} else {
									local800.method388(this.anInt941, this.anInt1091);
								}
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 207);
								this.aClass6_Sub1_Sub4_9.method402(this.anInt941);
								this.aClass6_Sub1_Sub4_9.method435(this.anInt1091);
								this.aClass6_Sub1_Sub4_9.method401(local802);
								this.aClass6_Sub1_Sub4_9.method434(this.anInt1090);
							}
						} else if ((this.anInt969 == 1 || this.method695(this.anInt886 - 1)) && this.anInt886 > 2) {
							this.method592();
						} else if (this.anInt886 > 0) {
							this.method686(this.anInt886 - 1, this.anInt878);
						}
						this.anInt913 = 10;
						super.anInt857 = 0;
					}
				}
				anInt863++;
				if (anInt863 > 61) {
					anInt863 = 0;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 166);
				}
				@Pc(993) int local993;
				if (Class32.anInt618 != -1) {
					local588 = Class32.anInt618;
					local993 = Class32.anInt619;
					@Pc(1014) boolean local1014 = this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, 0, true, 0, local588, local993);
					Class32.anInt618 = -1;
					if (local1014) {
						this.anInt894 = super.anInt858;
						this.anInt895 = super.anInt859;
						this.anInt897 = 1;
						this.anInt896 = 0;
					}
				}
				if (super.anInt857 == 1 && this.aString25 != null) {
					this.aString25 = null;
					this.aBoolean246 = true;
					super.anInt857 = 0;
				}
				this.method712();
				if (this.anInt1006 == -1) {
					this.method676();
					this.method593();
					this.method603(this.aBoolean238);
				}
				if (super.anInt851 == 1 || super.anInt857 == 1) {
					this.anInt904++;
				}
				if (this.anInt1060 == 0 && this.anInt1058 == 0 && this.anInt996 == 0) {
					if (this.anInt964 > 0) {
						this.anInt964--;
					}
				} else if (this.anInt964 < 100) {
					this.anInt964++;
					if (this.anInt964 == 100) {
						if (this.anInt1060 != 0) {
							this.aBoolean246 = true;
						}
						if (this.anInt1058 != 0) {
							this.aBoolean253 = true;
						}
					}
				}
				if (this.anInt1028 == 2) {
					this.method605();
				}
				if (this.anInt1028 == 2 && this.aBoolean231) {
					this.method604();
				}
				for (local588 = 0; local588 < 5; local588++) {
					@Pc(1151) int local1151 = this.anIntArray251[local588]++;
				}
				this.method715();
				super.anInt850++;
				if (super.anInt850 > 4500) {
					this.anInt1017 = 250;
					super.anInt850 -= 500;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 46);
				}
				this.anInt966++;
				if (this.anInt966 > 500) {
					this.anInt966 = 0;
					local993 = (int) (Math.random() * 8.0D);
					if ((local993 & 0x1) == 1) {
						this.anInt958 += this.anInt959;
					}
					if ((local993 & 0x2) == 2) {
						this.anInt977 += this.anInt978;
					}
					if ((local993 & 0x4) == 4) {
						this.anInt1063 += this.anInt1064;
					}
				}
				if (this.anInt958 < -50) {
					this.anInt959 = 2;
				}
				if (this.anInt958 > 50) {
					this.anInt959 = -2;
				}
				if (this.anInt977 < -55) {
					this.anInt978 = 2;
				}
				if (this.anInt977 > 55) {
					this.anInt978 = -2;
				}
				if (this.anInt1063 < -40) {
					this.anInt1064 = 1;
				}
				if (this.anInt1063 > 40) {
					this.anInt1064 = -1;
				}
				this.anInt998++;
				if (this.anInt998 > 500) {
					this.anInt998 = 0;
					local993 = (int) (Math.random() * 8.0D);
					if ((local993 & 0x1) == 1) {
						this.anInt1047 += this.anInt1048;
					}
					if ((local993 & 0x2) == 2) {
						this.anInt874 += this.anInt875;
					}
				}
				if (this.anInt1047 < -60) {
					this.anInt1048 = 2;
				}
				if (this.anInt1047 > 60) {
					this.anInt1048 = -2;
				}
				if (this.anInt874 < -20) {
					this.anInt875 = 1;
				}
				if (this.anInt874 > 10) {
					this.anInt875 = -1;
				}
				this.anInt1016++;
				if (this.anInt1016 > 50) {
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 30);
				}
				try {
					if (this.aClass41_1 != null && this.aClass6_Sub1_Sub4_9.anInt704 > 0) {
						this.aClass41_1.method465(this.aClass6_Sub1_Sub4_9.anInt704, this.aClass6_Sub1_Sub4_9.aByteArray17);
						this.aClass6_Sub1_Sub4_9.anInt704 = 0;
						this.anInt1016 = 0;
					}
				} catch (@Pc(1395) IOException local1395) {
					this.method607();
				} catch (@Pc(1400) Exception local1400) {
					this.method644((byte) 9);
				}
			}
		} catch (@Pc(1405) RuntimeException local1405) {
			signlink.reporterror("12844, " + -43 + ", " + local1405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)I")
	private int method688() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt1034 < 310) {
				@Pc(17) int local17 = this.anInt1031 >> 7;
				@Pc(22) int local22 = this.anInt1033 >> 7;
				@Pc(27) int local27 = aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 >> 7;
				@Pc(32) int local32 = aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt989][local17][local22] & 0x4) != 0) {
					local3 = this.anInt989;
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
						if ((this.aByteArrayArrayArray8[this.anInt989][local17][local22] & 0x4) != 0) {
							local3 = this.anInt989;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt989][local17][local22] & 0x4) != 0) {
								local3 = this.anInt989;
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
						if ((this.aByteArrayArrayArray8[this.anInt989][local17][local22] & 0x4) != 0) {
							local3 = this.anInt989;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt989][local17][local22] & 0x4) != 0) {
								local3 = this.anInt989;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt989][aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 >> 7][aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 >> 7] & 0x4) != 0) {
				local3 = this.anInt989;
			}
			return local3;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("15691, " + false + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)I")
	private int method689() {
		try {
			@Pc(9) int local9 = this.method595(this.anInt1031, this.anInt1033, this.anInt989);
			this.aBoolean243 &= true;
			return local9 - this.anInt1032 >= 800 || (this.aByteArrayArrayArray8[this.anInt989][this.anInt1031 >> 7][this.anInt1033 >> 7] & 0x4) == 0 ? 3 : this.anInt989;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("57412, " + true + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!HHSKUOEZ;I)V")
	private void method690(@OriginalArg(0) Class6_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt168 == 0) {
				local1 = this.aClass32_1.method345(arg0.anInt167, arg0.anInt169, arg0.anInt170);
			}
			if (arg0.anInt168 == 1) {
				local1 = this.aClass32_1.method346(arg0.anInt167, arg0.anInt169, arg0.anInt170);
			}
			if (arg0.anInt168 == 2) {
				local1 = this.aClass32_1.method347(arg0.anInt167, arg0.anInt169, arg0.anInt170);
			}
			if (arg0.anInt168 == 3) {
				local1 = this.aClass32_1.method348(arg0.anInt167, arg0.anInt169, arg0.anInt170);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass32_1.method349(arg0.anInt167, arg0.anInt169, arg0.anInt170, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt164 = local3;
			arg0.anInt166 = local5;
			arg0.anInt165 = local7;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("9597, " + arg0 + ", " + 0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method691() {
		try {
			if (this.aByte31 != 2) {
				this.anInt1014 = -1;
			}
			@Pc(19) int local19;
			for (@Pc(12) int local12 = 10; local12 < 117; local12++) {
				local19 = (int) (Math.random() * 100.0D);
				if (local19 < 50) {
					this.anIntArray245[local12 + 32512] = 255;
				}
			}
			@Pc(48) int local48;
			@Pc(55) int local55;
			@Pc(61) int local61;
			for (local19 = 0; local19 < 100; local19++) {
				local48 = (int) (Math.random() * 124.0D) + 2;
				local55 = (int) (Math.random() * 128.0D) + 128;
				local61 = local48 + (local55 << 7);
				this.anIntArray245[local61] = 192;
			}
			for (local48 = 1; local48 < 255; local48++) {
				for (local55 = 1; local55 < 127; local55++) {
					local61 = local55 + (local48 << 7);
					this.anIntArray246[local61] = (this.anIntArray245[local61 - 1] + this.anIntArray245[local61 + 1] + this.anIntArray245[local61 - 128] + this.anIntArray245[local61 + 128]) / 4;
				}
			}
			this.anInt910 += 128;
			if (this.anInt910 > this.anIntArray229.length) {
				this.anInt910 -= this.anIntArray229.length;
				local55 = (int) (Math.random() * 12.0D);
				this.method610(this.aClass6_Sub1_Sub1_Sub3Array4[local55]);
			}
			@Pc(173) int local173;
			for (local55 = 1; local55 < 255; local55++) {
				for (local61 = 1; local61 < 127; local61++) {
					local173 = local61 + (local55 << 7);
					@Pc(196) int local196 = this.anIntArray246[local173 + 128] - this.anIntArray229[local173 + this.anInt910 & this.anIntArray229.length - 1] / 5;
					if (local196 < 0) {
						local196 = 0;
					}
					this.anIntArray245[local173] = local196;
				}
			}
			for (local61 = 0; local61 < 255; local61++) {
				this.anIntArray264[local61] = this.anIntArray264[local61 + 1];
			}
			this.anIntArray264[255] = (int) (Math.sin((double) anInt936 / 14.0D) * 16.0D + Math.sin((double) anInt936 / 15.0D) * 14.0D + Math.sin((double) anInt936 / 16.0D) * 12.0D);
			if (this.anInt982 > 0) {
				this.anInt982 -= 4;
			}
			if (this.anInt983 > 0) {
				this.anInt983 -= 4;
			}
			if (this.anInt982 == 0 && this.anInt983 == 0) {
				local173 = (int) (Math.random() * 2000.0D);
				if (local173 == 0) {
					this.anInt982 = 1024;
				}
				if (local173 == 1) {
					this.anInt983 = 1024;
					return;
				}
			}
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("39235, " + 2 + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method693(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString22 = "";
				this.aString23 = "Connecting to server...";
				this.method641(true);
			}
			this.aClass41_1 = new Class41(this, -499, this.method588(anInt957 + 43594));
			@Pc(30) long local30 = Class38.method453(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass6_Sub1_Sub4_9.anInt704 = 0;
			this.aClass6_Sub1_Sub4_9.method401(14);
			this.aClass6_Sub1_Sub4_9.method401(local37);
			this.aClass41_1.method465(2, this.aClass6_Sub1_Sub4_9.aByteArray17);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass41_1.method462();
			}
			@Pc(74) int local74 = this.aClass41_1.method462();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass41_1.method464(this.aClass6_Sub1_Sub4_8.aByteArray17, 0, 8);
				this.aClass6_Sub1_Sub4_8.anInt704 = 0;
				this.aLong32 = this.aClass6_Sub1_Sub4_8.method417();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong32 >> 32), (int) this.aLong32 };
				this.aClass6_Sub1_Sub4_9.anInt704 = 0;
				this.aClass6_Sub1_Sub4_9.method401(10);
				this.aClass6_Sub1_Sub4_9.method405(local99[0]);
				this.aClass6_Sub1_Sub4_9.method405(local99[1]);
				this.aClass6_Sub1_Sub4_9.method405(local99[2]);
				this.aClass6_Sub1_Sub4_9.method405(local99[3]);
				this.aClass6_Sub1_Sub4_9.method405(signlink.anInt1098);
				this.aClass6_Sub1_Sub4_9.method408(arg0);
				this.aClass6_Sub1_Sub4_9.method408(arg1);
				this.aClass6_Sub1_Sub4_9.method426(aBigInteger2, aBigInteger1);
				this.aClass6_Sub1_Sub4_6.anInt704 = 0;
				if (arg2) {
					this.aClass6_Sub1_Sub4_6.method401(18);
				} else {
					this.aClass6_Sub1_Sub4_6.method401(16);
				}
				this.aClass6_Sub1_Sub4_6.method401(this.aClass6_Sub1_Sub4_9.anInt704 + 36 + 1 + 1 + 2);
				this.aClass6_Sub1_Sub4_6.method401(255);
				this.aClass6_Sub1_Sub4_6.method402(357);
				this.aClass6_Sub1_Sub4_6.method401(aBoolean252 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass6_Sub1_Sub4_6.method405(this.anIntArray270[local225]);
				}
				this.aClass6_Sub1_Sub4_6.method409(this.aClass6_Sub1_Sub4_9.aByteArray17, this.aClass6_Sub1_Sub4_9.anInt704);
				this.aClass6_Sub1_Sub4_9.aClass18_1 = new Class18(local99, 0);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass18_2 = new Class18(local99, 0);
				this.aClass41_1.method465(this.aClass6_Sub1_Sub4_6.anInt704, this.aClass6_Sub1_Sub4_6.aByteArray17);
				local74 = this.aClass41_1.method462();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method693(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt1003 = this.aClass41_1.method462();
					aBoolean267 = this.aClass41_1.method462() == 1;
					this.aLong33 = 0L;
					this.anInt867 = 0;
					this.aClass9_1.anInt99 = 0;
					super.aBoolean228 = true;
					this.aBoolean269 = true;
					this.aBoolean243 = true;
					this.aClass6_Sub1_Sub4_9.anInt704 = 0;
					this.aClass6_Sub1_Sub4_8.anInt704 = 0;
					this.anInt1014 = -1;
					this.anInt919 = -1;
					this.anInt920 = -1;
					this.anInt921 = -1;
					this.anInt1013 = 0;
					this.anInt1015 = 0;
					this.anInt1050 = 0;
					this.anInt1017 = 0;
					this.anInt999 = 0;
					this.anInt886 = 0;
					this.aBoolean270 = false;
					super.anInt850 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray13[local389] = null;
					}
					this.anInt888 = 0;
					this.anInt1085 = 0;
					this.anInt1028 = 0;
					this.anInt925 = 0;
					this.anInt958 = (int) (Math.random() * 100.0D) - 50;
					this.anInt977 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1063 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1047 = (int) (Math.random() * 120.0D) - 60;
					this.anInt874 = (int) (Math.random() * 30.0D) - 20;
					this.anInt900 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt898 = 0;
					this.anInt1081 = -1;
					this.anInt1038 = 0;
					this.anInt1039 = 0;
					this.anInt872 = 0;
					this.anInt884 = 0;
					for (local225 = 0; local225 < this.anInt870; local225++) {
						this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local225] = null;
						this.aClass6_Sub1_Sub4Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local259] = null;
					}
					aClass6_Sub1_Sub2_Sub3_Sub1_1 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anInt871] = new Class6_Sub1_Sub2_Sub3_Sub1();
					this.aClass5_12.method37();
					this.aClass5_11.method37();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass5ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass5_10 = new Class5(-7255);
					this.anInt1024 = 0;
					this.anInt1023 = 0;
					this.method589(this.anInt981);
					this.anInt981 = -1;
					this.method589(this.anInt1030);
					this.anInt1030 = -1;
					this.method589(this.anInt985);
					this.anInt985 = -1;
					this.method589(this.anInt1006);
					this.anInt1006 = -1;
					this.method589(this.anInt864);
					this.anInt864 = -1;
					this.method589(this.anInt911);
					this.anInt911 = -1;
					this.method589(this.anInt990);
					this.anInt990 = -1;
					this.aBoolean237 = false;
					this.anInt1071 = 3;
					this.anInt1010 = 0;
					this.aBoolean270 = false;
					this.aBoolean247 = false;
					this.aString25 = null;
					this.anInt1096 = 0;
					this.anInt945 = -1;
					this.aBoolean268 = true;
					this.method650(268);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray213[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray10[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt1012 = 0;
					anInt935 = 0;
					anInt1095 = 0;
					anInt1007 = 0;
					anInt1072 = 0;
					anInt1088 = 0;
					anInt1067 = 0;
					anInt1049 = 0;
					anInt1040 = 0;
					this.method663();
				} else if (local74 == 3) {
					this.aString22 = "";
					this.aString23 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString22 = "Your account has been disabled.";
					this.aString23 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString22 = "Your account is already logged in.";
					this.aString23 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString22 = "RuneScape has been updated!";
					this.aString23 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString22 = "This world is full.";
					this.aString23 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString22 = "Unable to connect.";
					this.aString23 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString22 = "Login limit exceeded.";
					this.aString23 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString22 = "Unable to connect.";
					this.aString23 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString22 = "Login server rejected session.";
					this.aString23 = "Please try again.";
				} else if (local74 == 12) {
					this.aString22 = "You need a members account to login to this world.";
					this.aString23 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString22 = "Could not complete login.";
					this.aString23 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString22 = "The server is being updated.";
					this.aString23 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean243 = true;
					this.aClass6_Sub1_Sub4_9.anInt704 = 0;
					this.aClass6_Sub1_Sub4_8.anInt704 = 0;
					this.anInt1014 = -1;
					this.anInt919 = -1;
					this.anInt920 = -1;
					this.anInt921 = -1;
					this.anInt1013 = 0;
					this.anInt1015 = 0;
					this.anInt1050 = 0;
					this.anInt886 = 0;
					this.aBoolean270 = false;
					this.aLong31 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString22 = "Login attempts exceeded.";
					this.aString23 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString22 = "You are standing in a members-only area.";
					this.aString23 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString22 = "Invalid loginserver requested";
					this.aString23 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass41_1.method462();
					for (@Pc(917) int local917 = local389 + 3; local917 >= 0; local917--) {
						this.aString22 = "You have only just left another world";
						this.aString23 = "Your profile will be transferred in: " + local917;
						this.method641(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(939) Exception local939) {
						}
					}
					this.method693(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString22 = "Malformed login packet.";
					this.aString23 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString22 = "Unexpected server response";
					this.aString23 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString22 = "No response from server";
					this.aString23 = "Please try using a different world.";
				} else if (this.anInt1059 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(971) Exception local971) {
					}
					this.anInt1059++;
					this.method693(arg0, arg1, arg2);
				} else {
					this.aString22 = "No response from loginserver";
					this.aString23 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1014) IOException local1014) {
			this.aString22 = "";
			this.aString23 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method582(@OriginalArg(0) int arg0) {
		try {
			this.aClass5ArrayArrayArray1 = null;
			this.aClass5_10 = null;
			this.aClass6_Sub1_Sub4_9 = null;
			this.aClass6_Sub1_Sub4_6 = null;
			this.aClass6_Sub1_Sub4_8 = null;
			@Pc(20) boolean local20 = false;
			this.aClass6_Sub1_Sub1_Sub3_1 = null;
			this.aClass6_Sub1_Sub1_Sub3_2 = null;
			this.aClass6_Sub1_Sub1_Sub3_3 = null;
			this.aClass15_10 = null;
			this.aClass15_11 = null;
			this.aClass15_7 = null;
			this.aClass15_8 = null;
			this.aClass15_9 = null;
			this.aClass15_3 = null;
			this.aClass15_4 = null;
			this.aClass15_5 = null;
			this.aClass15_6 = null;
			this.aClass15_23 = null;
			this.aClass15_24 = null;
			this.aClass15_25 = null;
			this.aClass15_26 = null;
			this.aClass15_27 = null;
			this.anIntArray236 = null;
			if (this.aClass9_1 != null) {
				this.aClass9_1.aBoolean32 = false;
			}
			this.aClass9_1 = null;
			this.aClass6_Sub1_Sub2_Sub3_Sub1Array1 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.aClass6_Sub1_Sub4Array1 = null;
			this.anIntArray231 = null;
			this.aClass6_Sub1_Sub1_Sub4_7 = null;
			this.aClass6_Sub1_Sub1_Sub4_8 = null;
			this.aClass6_Sub1_Sub1_Sub4_9 = null;
			this.aClass6_Sub1_Sub1_Sub4_10 = null;
			this.aClass6_Sub1_Sub1_Sub4_11 = null;
			try {
				if (this.aClass41_1 != null) {
					this.aClass41_1.method461();
				}
			} catch (@Pc(122) Exception local122) {
			}
			this.aClass41_1 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass32_1 = null;
			this.aClass3Array1 = null;
			this.aClass6_Sub1_Sub4_7 = null;
			this.aClass5_12 = null;
			this.aClass5_11 = null;
			this.aClass6_Sub1_Sub1_Sub3_6 = null;
			this.aClass6_Sub1_Sub1_Sub3_7 = null;
			this.aClass6_Sub1_Sub1_Sub3_8 = null;
			this.anIntArrayArray22 = null;
			this.aClass15_16 = null;
			this.aClass15_17 = null;
			this.aClass15_18 = null;
			this.anIntArray232 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray233 = null;
			this.anIntArray234 = null;
			this.aStringArray14 = null;
			this.aLongArray4 = null;
			this.anIntArray227 = null;
			this.aClass6_Sub1_Sub1_Sub3_9 = null;
			this.aClass6_Sub1_Sub1_Sub3_10 = null;
			this.aClass6_Sub1_Sub1_Sub3_11 = null;
			this.aClass6_Sub1_Sub1_Sub3_12 = null;
			this.aClass6_Sub1_Sub1_Sub3_13 = null;
			this.aClass6_Sub1_Sub1_Sub3Array2 = null;
			this.aClass15_19 = null;
			this.aClass15_20 = null;
			this.aClass15_21 = null;
			this.aClass15_22 = null;
			this.aClass6_Sub1_Sub1_Sub4_12 = null;
			this.aClass6_Sub1_Sub1_Sub4Array9 = null;
			this.aClass6_Sub1_Sub1_Sub4Array6 = null;
			this.aClass6_Sub1_Sub1_Sub4Array8 = null;
			this.aClass6_Sub1_Sub1_Sub4Array5 = null;
			this.aClass6_Sub1_Sub1_Sub4Array4 = null;
			if (this.aClass22_Sub1_1 != null) {
				this.aClass22_Sub1_1.method279();
			}
			this.aClass22_Sub1_1 = null;
			this.anIntArray248 = null;
			this.anIntArray249 = null;
			this.aClass6_Sub1_Sub1_Sub4Array10 = null;
			this.aClass6_Sub1_Sub1_Sub4_5 = null;
			this.anIntArray256 = null;
			this.anIntArray257 = null;
			this.anIntArray258 = null;
			this.anIntArray259 = null;
			this.aStringArray9 = null;
			this.aByteArray21 = null;
			this.aClass15_12 = null;
			this.aClass15_13 = null;
			this.aClass15_14 = null;
			this.aClass15_15 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray265 = null;
			this.anIntArray266 = null;
			this.method710();
			this.aClass6_Sub1_Sub2_Sub3_Sub2Array1 = null;
			this.anIntArray228 = null;
			this.aClass6_Sub1_Sub1_Sub4_13 = null;
			this.aClass6_Sub1_Sub1_Sub3_16 = null;
			this.aClass6_Sub1_Sub1_Sub3_17 = null;
			this.aClass6_Sub1_Sub1_Sub3_18 = null;
			this.aClass6_Sub1_Sub1_Sub3_19 = null;
			this.aClass6_Sub1_Sub1_Sub3_20 = null;
			this.aClass6_Sub1_Sub1_Sub3Array5 = null;
			this.aClass6_Sub1_Sub1_Sub4Array7 = null;
			this.method704();
			Class28.method276();
			Class47.method539();
			Class4.method29();
			Class35.method391();
			Class45.aClass45Array1 = null;
			Class16.aClass16Array1 = null;
			Class25.aClass25Array1 = null;
			Class21.aClass21Array1 = null;
			Class12.aClass12Array1 = null;
			Class12.aClass36_3 = null;
			Class42.aClass42Array1 = null;
			super.aClass15_2 = null;
			Class6_Sub1_Sub2_Sub3_Sub1.aClass36_4 = null;
			Class6_Sub1_Sub1_Sub1.method69();
			Class32.method318();
			Class6_Sub1_Sub2_Sub5.method224();
			Class34.method376();
			System.gc();
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("70300, " + arg0 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method694() {
		try {
			this.method647(this.anInt1044);
			if (this.anInt897 == 1) {
				this.aClass6_Sub1_Sub1_Sub4Array4[this.anInt896 / 100].method567(this.anInt894 - 8 - 4, this.anInt895 - 8 - 4);
			}
			if (this.anInt897 == 2) {
				this.aClass6_Sub1_Sub1_Sub4Array4[this.anInt896 / 100 + 4].method567(this.anInt894 - 8 - 4, this.anInt895 - 8 - 4);
			}
			if (this.anInt990 != -1) {
				this.method625(this.anInt984, this.anInt990, this.anInt1062);
				this.method675(0, 0, Class35.method389(this.anInt990), 0);
			}
			if (this.anInt985 != -1) {
				this.method625(this.anInt984, this.anInt985, this.anInt1062);
				this.method675(0, 0, Class35.method389(this.anInt985), 0);
			}
			this.method596();
			if (!this.aBoolean270) {
				this.method615();
				this.method651(this.aByte34);
			} else if (this.anInt1052 == 0) {
				this.method700();
			}
			if (this.anInt1096 == 1) {
				this.aClass6_Sub1_Sub1_Sub4_5.method567(472, 296);
			}
			@Pc(177) int local177;
			if (aBoolean234) {
				@Pc(143) byte local143 = 20;
				@Pc(145) int local145 = 16776960;
				if (super.anInt847 < 30 && aBoolean252) {
					local145 = 16711680;
				}
				if (super.anInt847 < 20 && !aBoolean252) {
					local145 = 16711680;
				}
				this.aClass6_Sub1_Sub1_Sub2_3.method204(20, "Fps:" + super.anInt847, local145);
				local177 = local143 + 15;
				@Pc(179) Runtime local179 = Runtime.getRuntime();
				@Pc(188) int local188 = (int) ((local179.totalMemory() - local179.freeMemory()) / 1024L);
				if (local188 > 33554432 && aBoolean252) {
				}
				if (local188 > 67108864 && !aBoolean252) {
				}
				this.aClass6_Sub1_Sub1_Sub2_3.method204(35, "Mem:" + local188 + "k", 16776960);
				local177 += 15;
			}
			if (this.anInt1050 != 0) {
				@Pc(229) int local229 = this.anInt1050 / 50;
				local177 = local229 / 60;
				@Pc(237) int local237 = local229 % 60;
				if (local237 < 10) {
					this.aClass6_Sub1_Sub1_Sub2_3.method209(16776960, "System update in: " + local177 + ":0" + local237, 329, 4);
				} else {
					this.aClass6_Sub1_Sub1_Sub2_3.method209(16776960, "System update in: " + local177 + ":" + local237, 329, 4);
				}
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("85331, " + false + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
	private boolean method695(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray258[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 138;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("51645, " + arg0 + ", " + 33356 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method696(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1023; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt1023--;
						this.aBoolean253 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1023; local28++) {
							this.aStringArray14[local28] = this.aStringArray14[local28 + 1];
							this.anIntArray227[local28] = this.anIntArray227[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 176);
						this.aClass6_Sub1_Sub4_9.method407(arg0);
						break;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("44197, " + arg0 + ", " + false + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!RGCGKKUR;ZI)V")
	private void method697(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) int local9 = arg0.method422(8);
			@Pc(15) int local15;
			if (local9 < this.anInt872) {
				for (local15 = local9; local15 < this.anInt872; local15++) {
					this.anIntArray231[this.anInt893++] = this.anIntArray223[local15];
				}
			}
			if (local9 > this.anInt872) {
				signlink.reporterror(this.aString27 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt872 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(67) int local67 = this.anIntArray223[local15];
				@Pc(72) Class6_Sub1_Sub2_Sub3_Sub1 local72 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local67];
				@Pc(77) int local77 = arg0.method422(1);
				if (local77 == 0) {
					this.anIntArray223[this.anInt872++] = local67;
					local72.anInt559 = anInt936;
				} else {
					@Pc(100) int local100 = arg0.method422(2);
					if (local100 == 0) {
						this.anIntArray223[this.anInt872++] = local67;
						local72.anInt559 = anInt936;
						this.anIntArray224[this.anInt873++] = local67;
					} else {
						@Pc(151) int local151;
						@Pc(162) int local162;
						if (local100 == 1) {
							this.anIntArray223[this.anInt872++] = local67;
							local72.anInt559 = anInt936;
							local151 = arg0.method422(3);
							local72.method305(local151, false, this.anInt979);
							local162 = arg0.method422(1);
							if (local162 == 1) {
								this.anIntArray224[this.anInt873++] = local67;
							}
						} else if (local100 == 2) {
							this.anIntArray223[this.anInt872++] = local67;
							local72.anInt559 = anInt936;
							local151 = arg0.method422(3);
							local72.method305(local151, true, this.anInt979);
							local162 = arg0.method422(3);
							local72.method305(local162, true, this.anInt979);
							@Pc(222) int local222 = arg0.method422(1);
							if (local222 == 1) {
								this.anIntArray224[this.anInt873++] = local67;
							}
						} else if (local100 == 3) {
							this.anIntArray231[this.anInt893++] = local67;
						}
					}
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("52310, " + arg0 + ", " + false + ", " + arg1 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
	private boolean method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(14) int local14 = arg1 >> 14 & 0x7FFF;
			@Pc(23) int local23 = this.aClass32_1.method349(this.anInt989, arg2, arg0, arg1);
			if (local23 == -1) {
				return false;
			}
			@Pc(32) int local32 = local23 & 0x1F;
			@Pc(38) int local38 = local23 >> 6 & 0x3;
			if (local32 == 10 || local32 == 11 || local32 == 22) {
				@Pc(50) Class28 local50 = Class28.method268(local14);
				@Pc(58) int local58;
				@Pc(61) int local61;
				if (local38 == 0 || local38 == 2) {
					local58 = local50.anInt489;
					local61 = local50.anInt483;
				} else {
					local58 = local50.anInt483;
					local61 = local50.anInt489;
				}
				@Pc(72) int local72 = local50.anInt486;
				if (local38 != 0) {
					local72 = (local72 << local38 & 0xF) + (local72 >> 4 - local38);
				}
				this.method708(0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], local58, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], local72, local61, 0, false, 2, arg2, arg0);
			} else {
				this.method708(local38, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray143[0], 0, aClass6_Sub1_Sub2_Sub3_Sub1_1.anIntArray142[0], 0, 0, local32 + 1, false, 2, arg2, arg0);
			}
			this.anInt894 = super.anInt858;
			this.anInt895 = super.anInt859;
			this.anInt897 = 2;
			this.anInt896 = 0;
			return true;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("40704, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -41819 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(8) int local8 = this.aClass32_1.method345(arg1, arg0, arg3);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass32_1.method349(arg1, arg0, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg2;
				if (local8 > 0) {
					local30 = arg5;
				}
				@Pc(38) int[] local38 = this.aClass6_Sub1_Sub1_Sub4_13.anIntArray209;
				local52 = arg0 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class28 local61 = Class28.method268(local58);
				if (local61.anInt482 == -1) {
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
					@Pc(71) Class6_Sub1_Sub1_Sub3 local71 = this.aClass6_Sub1_Sub1_Sub3Array5[local61.anInt482];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt489 * 4 - local71.anInt779) / 2;
						@Pc(93) int local93 = (local61.anInt483 * 4 - local71.anInt780) / 2;
						local71.method535(arg0 * 4 + local83 + 48, (104 - arg3 - local61.anInt483) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass32_1.method347(arg1, arg0, arg3);
			if (arg4 <= 0) {
				this.method580();
			}
			if (local8 != 0) {
				local18 = this.aClass32_1.method349(arg1, arg0, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(451) Class28 local451 = Class28.method268(local30);
				@Pc(483) int local483;
				if (local451.anInt482 != -1) {
					@Pc(461) Class6_Sub1_Sub1_Sub3 local461 = this.aClass6_Sub1_Sub1_Sub3Array5[local451.anInt482];
					if (local461 != null) {
						local58 = (local451.anInt489 * 4 - local461.anInt779) / 2;
						local483 = (local451.anInt483 * 4 - local461.anInt780) / 2;
						local461.method535(arg0 * 4 + local58 + 48, (104 - arg3 - local451.anInt483) * 4 + 48 + local483);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(520) int[] local520 = this.aClass6_Sub1_Sub1_Sub4_13.anIntArray209;
					local483 = arg0 * 4 + (103 - arg3) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local520[local483 + 1536] = local52;
						local520[local483 + 1024 + 1] = local52;
						local520[local483 + 512 + 2] = local52;
						local520[local483 + 3] = local52;
					} else {
						local520[local483] = local52;
						local520[local483 + 512 + 1] = local52;
						local520[local483 + 1024 + 2] = local52;
						local520[local483 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass32_1.method348(arg1, arg0, arg3);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(615) Class28 local615 = Class28.method268(local18);
				if (local615.anInt482 != -1) {
					@Pc(625) Class6_Sub1_Sub1_Sub3 local625 = this.aClass6_Sub1_Sub1_Sub3Array5[local615.anInt482];
					if (local625 != null) {
						local30 = (local615.anInt489 * 4 - local625.anInt779) / 2;
						@Pc(647) int local647 = (local615.anInt483 * 4 - local625.anInt780) / 2;
						local625.method535(arg0 * 4 + local30 + 48, (104 - arg3 - local615.anInt483) * 4 + 48 + local647);
						return;
					}
				}
			}
		} catch (@Pc(671) RuntimeException local671) {
			signlink.reporterror("2187, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local671.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method700() {
		try {
			@Pc(2) int local2 = this.anInt1053;
			@Pc(5) int local5 = this.anInt1054;
			@Pc(8) int local8 = this.anInt1055;
			@Pc(11) int local11 = this.anInt1056;
			Class6_Sub1_Sub1.method555((byte) 4, local5, local2, 6116423, local11, local8);
			Class6_Sub1_Sub1.method555((byte) 4, local5 + 1, local2 + 1, 0, 16, local8 - 2);
			Class6_Sub1_Sub1.method556(local11 - 19, local5 + 18, 606, local2 + 1, 0, local8 - 2);
			this.aClass6_Sub1_Sub1_Sub2_4.method209(6116423, "Choose Option", local5 + 14, local2 + 3);
			@Pc(68) int local68 = super.anInt852;
			@Pc(71) int local71 = super.anInt853;
			if (this.anInt1052 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt1052 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt1052 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt886; local90++) {
				@Pc(105) int local105 = local5 + (this.anInt886 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local2 && local68 < local2 + local8 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass6_Sub1_Sub1_Sub2_4.method213(this.aStringArray9[local90], local2 + 3, local105, true, local107);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("84722, " + true + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method701(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass6_Sub1_Sub1_Sub4_13.anIntArray209;
			@Pc(15) int local15 = local5.length;
			for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
				local5[local17] = 0;
			}
			@Pc(41) int local41;
			@Pc(43) int local43;
			for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
				local41 = (103 - local29) * 512 * 4 + 24628;
				for (local43 = 1; local43 < 103; local43++) {
					if ((this.aByteArrayArrayArray8[arg0][local43][local29] & 0x18) == 0) {
						this.aClass32_1.method354(local5, local41, arg0, local43, local29);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local43][local29] & 0x8) != 0) {
						this.aClass32_1.method354(local5, local41, arg0 + 1, local43, local29);
					}
					local41 += 4;
				}
			}
			anInt866++;
			if (anInt866 > 1496) {
				anInt866 = 0;
				this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 26);
				this.aClass6_Sub1_Sub4_9.method401(0);
				local41 = this.aClass6_Sub1_Sub4_9.anInt704;
				this.aClass6_Sub1_Sub4_9.method402((int) (Math.random() * 65536.0D));
				this.aClass6_Sub1_Sub4_9.method401(189);
				this.aClass6_Sub1_Sub4_9.method402(45212);
				this.aClass6_Sub1_Sub4_9.method402((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub1_Sub4_9.method401(89);
				}
				this.aClass6_Sub1_Sub4_9.method401(94);
				this.aClass6_Sub1_Sub4_9.method401(10);
				this.aClass6_Sub1_Sub4_9.method402(54243);
				this.aClass6_Sub1_Sub4_9.method401(88);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub1_Sub4_9.method401(32);
				}
				this.aClass6_Sub1_Sub4_9.method410(this.aClass6_Sub1_Sub4_9.anInt704 - local41);
			}
			local41 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local43 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass6_Sub1_Sub1_Sub4_13.method562();
			@Pc(241) int local241;
			for (@Pc(237) int local237 = 1; local237 < 103; local237++) {
				for (local241 = 1; local241 < 103; local241++) {
					if ((this.aByteArrayArrayArray8[arg0][local241][local237] & 0x18) == 0) {
						this.method699(local241, arg0, local41, local237, this.anInt973, local43);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local241][local237] & 0x8) != 0) {
						this.method699(local241, arg0 + 1, local41, local237, this.anInt973, local43);
					}
				}
			}
			if (this.aClass15_5 != null) {
				this.aClass15_5.method121();
				Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
			}
			this.anInt967 = 0;
			for (local241 = 0; local241 < 104; local241++) {
				for (@Pc(317) int local317 = 0; local317 < 104; local317++) {
					@Pc(327) int local327 = this.aClass32_1.method348(this.anInt989, local241, local317);
					if (local327 != 0) {
						local327 = local327 >> 14 & 0x7FFF;
						@Pc(339) int local339 = Class28.method268(local327).anInt485;
						if (local339 >= 0) {
							@Pc(343) int local343 = local241;
							@Pc(345) int local345 = local317;
							if (local339 != 22 && local339 != 29 && local339 != 34 && local339 != 36 && local339 != 46 && local339 != 47 && local339 != 48) {
								@Pc(377) int[][] local377 = this.aClass3Array1[this.anInt989].anIntArrayArray1;
								for (@Pc(379) int local379 = 0; local379 < 10; local379++) {
									@Pc(386) int local386 = (int) (Math.random() * 4.0D);
									if (local386 == 0 && local343 > 0 && local343 > local241 - 3 && (local377[local343 - 1][local345] & 0x1280108) == 0) {
										local343--;
									}
									if (local386 == 1 && local343 < 103 && local343 < local241 + 3 && (local377[local343 + 1][local345] & 0x1280180) == 0) {
										local343++;
									}
									if (local386 == 2 && local345 > 0 && local345 > local317 - 3 && (local377[local343][local345 - 1] & 0x1280102) == 0) {
										local345--;
									}
									if (local386 == 3 && local345 < 103 && local345 < local317 + 3 && (local377[local343][local345 + 1] & 0x1280120) == 0) {
										local345++;
									}
								}
							}
							this.aClass6_Sub1_Sub1_Sub4Array10[this.anInt967] = this.aClass6_Sub1_Sub1_Sub4Array7[local339];
							this.anIntArray248[this.anInt967] = local343;
							this.anIntArray249[this.anInt967] = local345;
							this.anInt967++;
						}
					}
				}
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("911, " + arg0 + ", " + 0 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method702(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!XDDMQHDR;II)V")
	private void method703(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.anInt1013 += 0;
			if (this.anInt886 < 400) {
				if (arg1.anIntArray201 != null) {
					arg1 = arg1.method537();
				}
				if (arg1 != null && arg1.aBoolean211) {
					@Pc(29) String local29 = arg1.aString16;
					if (arg1.anInt801 != 0) {
						local29 = local29 + method692(aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt305, arg1.anInt801) + " (level-" + arg1.anInt801 + ")";
					}
					if (this.anInt888 == 1) {
						this.aStringArray9[this.anInt886] = "Use " + this.aString17 + " with @yel@" + local29;
						this.anIntArray258[this.anInt886] = 708;
						this.anIntArray259[this.anInt886] = arg0;
						this.anIntArray256[this.anInt886] = arg3;
						this.anIntArray257[this.anInt886] = arg2;
						this.anInt886++;
					} else if (this.anInt1085 != 1) {
						@Pc(167) int local167;
						if (arg1.aStringArray7 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray7[local167] != null && !arg1.aStringArray7[local167].equalsIgnoreCase("attack")) {
									this.aStringArray9[this.anInt886] = arg1.aStringArray7[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray258[this.anInt886] = 744;
									}
									if (local167 == 1) {
										this.anIntArray258[this.anInt886] = 354;
									}
									if (local167 == 2) {
										this.anIntArray258[this.anInt886] = 59;
									}
									if (local167 == 3) {
										this.anIntArray258[this.anInt886] = 881;
									}
									if (local167 == 4) {
										this.anIntArray258[this.anInt886] = 144;
									}
									this.anIntArray259[this.anInt886] = arg0;
									this.anIntArray256[this.anInt886] = arg3;
									this.anIntArray257[this.anInt886] = arg2;
									this.anInt886++;
								}
							}
						}
						if (arg1.aStringArray7 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray7[local167] != null && arg1.aStringArray7[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg1.anInt801 > aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt305) {
										local291 = 2000;
									}
									this.aStringArray9[this.anInt886] = arg1.aStringArray7[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray258[this.anInt886] = local291 + 744;
									}
									if (local167 == 1) {
										this.anIntArray258[this.anInt886] = local291 + 354;
									}
									if (local167 == 2) {
										this.anIntArray258[this.anInt886] = local291 + 59;
									}
									if (local167 == 3) {
										this.anIntArray258[this.anInt886] = local291 + 881;
									}
									if (local167 == 4) {
										this.anIntArray258[this.anInt886] = local291 + 144;
									}
									this.anIntArray259[this.anInt886] = arg0;
									this.anIntArray256[this.anInt886] = arg3;
									this.anIntArray257[this.anInt886] = arg2;
									this.anInt886++;
								}
							}
						}
						this.aStringArray9[this.anInt886] = "Examine @yel@" + local29;
						this.anIntArray258[this.anInt886] = 1219;
						this.anIntArray259[this.anInt886] = arg0;
						this.anIntArray256[this.anInt886] = arg3;
						this.anIntArray257[this.anInt886] = arg2;
						this.anInt886++;
					} else if ((this.anInt1087 & 0x2) == 2) {
						this.aStringArray9[this.anInt886] = this.aString31 + " @yel@" + local29;
						this.anIntArray258[this.anInt886] = 834;
						this.anIntArray259[this.anInt886] = arg0;
						this.anIntArray256[this.anInt886] = arg3;
						this.anIntArray257[this.anInt886] = arg2;
						this.anInt886++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("42412, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method704() {
		try {
			this.aBoolean248 = false;
			while (this.aBoolean261) {
				this.aBoolean248 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass6_Sub1_Sub1_Sub3_14 = null;
			this.aClass6_Sub1_Sub1_Sub3_15 = null;
			this.aClass6_Sub1_Sub1_Sub3Array4 = null;
			this.anIntArray239 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.anIntArray242 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.anIntArray245 = null;
			this.anIntArray246 = null;
			this.aClass6_Sub1_Sub1_Sub4_14 = null;
			this.aClass6_Sub1_Sub1_Sub4_15 = null;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("93041, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean229 || this.aBoolean258 || this.aBoolean254) {
				this.method655();
			} else {
				anInt912++;
				if (this.aBoolean243) {
					this.method624((byte) 4);
				} else {
					this.method641(false);
				}
				this.anInt904 = 0;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("20020, " + 672 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method706() {
		try {
			this.anInt868 = 0;
			@Pc(74) int local74;
			for (@Pc(10) int local10 = -1; local10 < this.anInt872 + this.anInt884; local10++) {
				@Pc(17) Class6_Sub1_Sub2_Sub3 local17;
				if (local10 == -1) {
					local17 = aClass6_Sub1_Sub2_Sub3_Sub1_1;
				} else if (local10 < this.anInt872) {
					local17 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray223[local10]];
				} else {
					local17 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray228[local10 - this.anInt872]];
				}
				if (local17 != null && local17.method306()) {
					@Pc(58) Class47 local58;
					if (local17 instanceof Class6_Sub1_Sub2_Sub3_Sub2) {
						local58 = ((Class6_Sub1_Sub2_Sub3_Sub2) local17).aClass47_2;
						if (local58.anIntArray201 != null) {
							local58 = local58.method537();
						}
						if (local58 == null) {
							continue;
						}
					}
					if (local10 >= this.anInt872) {
						local58 = ((Class6_Sub1_Sub2_Sub3_Sub2) local17).aClass47_2;
						if (local58.anInt798 >= 0 && local58.anInt798 < this.aClass6_Sub1_Sub1_Sub4Array8.length) {
							this.method682(local17, local17.anInt524 + 15);
							if (this.anInt905 > -1) {
								this.aClass6_Sub1_Sub1_Sub4Array8[local58.anInt798].method567(this.anInt905 - 12, this.anInt906 - 30);
							}
						}
						if (this.anInt999 == 1 && this.anInt876 == this.anIntArray228[local10 - this.anInt872] && anInt936 % 20 < 10) {
							this.method682(local17, local17.anInt524 + 15);
							if (this.anInt905 > -1) {
								this.aClass6_Sub1_Sub1_Sub4Array5[0].method567(this.anInt905 - 12, this.anInt906 - 28);
							}
						}
					} else {
						local74 = 30;
						@Pc(77) Class6_Sub1_Sub2_Sub3_Sub1 local77 = (Class6_Sub1_Sub2_Sub3_Sub1) local17;
						if (local77.anInt302 != -1 || local77.anInt301 != -1) {
							this.method682(local17, local17.anInt524 + 15);
							if (this.anInt905 > -1) {
								if (local77.anInt302 != -1) {
									this.aClass6_Sub1_Sub1_Sub4Array6[local77.anInt302].method567(this.anInt905 - 12, this.anInt906 - 30);
									local74 += 25;
								}
								if (local77.anInt301 != -1) {
									this.aClass6_Sub1_Sub1_Sub4Array8[local77.anInt301].method567(this.anInt905 - 12, this.anInt906 - local74);
									local74 += 25;
								}
							}
						}
						if (local10 >= 0 && this.anInt999 == 10 && this.anInt944 == this.anIntArray223[local10]) {
							this.method682(local17, local17.anInt524 + 15);
							if (this.anInt905 > -1) {
								this.aClass6_Sub1_Sub1_Sub4Array5[1].method567(this.anInt905 - 12, this.anInt906 - local74);
							}
						}
					}
					if (local17.aString8 != null && (local10 >= this.anInt872 || this.anInt932 == 0 || this.anInt932 == 3 || this.anInt932 == 1 && this.method640(((Class6_Sub1_Sub2_Sub3_Sub1) local17).aString5))) {
						this.method682(local17, local17.anInt524);
						if (this.anInt905 > -1 && this.anInt868 < this.anInt869) {
							this.anIntArray218[this.anInt868] = this.aClass6_Sub1_Sub1_Sub2_4.method208(local17.aString8) / 2;
							this.anIntArray217[this.anInt868] = this.aClass6_Sub1_Sub1_Sub2_4.anInt397;
							this.anIntArray215[this.anInt868] = this.anInt905;
							this.anIntArray216[this.anInt868] = this.anInt906;
							this.anIntArray219[this.anInt868] = local17.anInt525;
							this.anIntArray220[this.anInt868] = local17.anInt554;
							this.anIntArray221[this.anInt868] = local17.anInt542;
							this.aStringArray8[this.anInt868++] = local17.aString8;
							if (this.anInt1026 == 0 && local17.anInt554 >= 1 && local17.anInt554 <= 3) {
								this.anIntArray217[this.anInt868] += 10;
								this.anIntArray216[this.anInt868] += 5;
							}
							if (this.anInt1026 == 0 && local17.anInt554 == 4) {
								this.anIntArray218[this.anInt868] = 60;
							}
							if (this.anInt1026 == 0 && local17.anInt554 == 5) {
								this.anIntArray217[this.anInt868] += 5;
							}
						}
					}
					if (local17.anInt513 > anInt936) {
						this.method682(local17, local17.anInt524 + 15);
						if (this.anInt905 > -1) {
							local74 = local17.anInt514 * 30 / local17.anInt515;
							if (local74 > 30) {
								local74 = 30;
							}
							Class6_Sub1_Sub1.method555((byte) 4, this.anInt906 - 3, this.anInt905 - 15, 65280, 5, local74);
							Class6_Sub1_Sub1.method555((byte) 4, this.anInt906 - 3, this.anInt905 - 15 + local74, 16711680, 5, 30 - local74);
						}
					}
					for (local74 = 0; local74 < 4; local74++) {
						if (local17.anIntArray141[local74] > anInt936) {
							this.method682(local17, local17.anInt524 / 2);
							if (this.anInt905 > -1) {
								if (local74 == 1) {
									this.anInt906 -= 20;
								}
								if (local74 == 2) {
									this.anInt905 -= 15;
									this.anInt906 -= 10;
								}
								if (local74 == 3) {
									this.anInt905 += 15;
									this.anInt906 -= 10;
								}
								this.aClass6_Sub1_Sub1_Sub4Array9[local17.anIntArray140[local74]].method567(this.anInt905 - 12, this.anInt906 - 12);
								this.aClass6_Sub1_Sub1_Sub2_2.method205(this.anInt905, 0, String.valueOf(local17.anIntArray139[local74]), this.anInt906 + 4);
								this.aClass6_Sub1_Sub1_Sub2_2.method205(this.anInt905 - 1, 16777215, String.valueOf(local17.anIntArray139[local74]), this.anInt906 + 3);
							}
						}
					}
				}
			}
			for (@Pc(614) int local614 = 0; local614 < this.anInt868; local614++) {
				local74 = this.anIntArray215[local614];
				@Pc(626) int local626 = this.anIntArray216[local614];
				@Pc(631) int local631 = this.anIntArray218[local614];
				@Pc(636) int local636 = this.anIntArray217[local614];
				@Pc(638) boolean local638 = true;
				while (local638) {
					local638 = false;
					for (@Pc(644) int local644 = 0; local644 < local614; local644++) {
						if (local626 + 2 > this.anIntArray216[local644] - this.anIntArray217[local644] && local626 - local636 < this.anIntArray216[local644] + 2 && local74 - local631 < this.anIntArray215[local644] + this.anIntArray218[local644] && local74 + local631 > this.anIntArray215[local644] - this.anIntArray218[local644] && this.anIntArray216[local644] - this.anIntArray217[local644] < local626) {
							local626 = this.anIntArray216[local644] - this.anIntArray217[local644];
							local638 = true;
						}
					}
				}
				this.anInt905 = this.anIntArray215[local614];
				this.anInt906 = this.anIntArray216[local614] = local626;
				@Pc(743) String local743 = this.aStringArray8[local614];
				if (this.anInt1026 == 0) {
					@Pc(748) int local748 = 16776960;
					if (this.anIntArray219[local614] < 6) {
						local748 = this.anIntArray260[this.anIntArray219[local614]];
					}
					if (this.anIntArray219[local614] == 6) {
						local748 = this.anInt1027 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray219[local614] == 7) {
						local748 = this.anInt1027 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray219[local614] == 8) {
						local748 = this.anInt1027 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(823) int local823;
					if (this.anIntArray219[local614] == 9) {
						local823 = 150 - this.anIntArray221[local614];
						if (local823 < 50) {
							local748 = local823 * 1280 + 16711680;
						} else if (local823 < 100) {
							local748 = 16776960 - (local823 - 50) * 327680;
						} else if (local823 < 150) {
							local748 = (local823 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray219[local614] == 10) {
						local823 = 150 - this.anIntArray221[local614];
						if (local823 < 50) {
							local748 = local823 * 5 + 16711680;
						} else if (local823 < 100) {
							local748 = 16711935 - (local823 - 50) * 327680;
						} else if (local823 < 150) {
							local748 = (local823 - 100) * 327680 + 255 - (local823 - 100) * 5;
						}
					}
					if (this.anIntArray219[local614] == 11) {
						local823 = 150 - this.anIntArray221[local614];
						if (local823 < 50) {
							local748 = 16777215 - local823 * 327685;
						} else if (local823 < 100) {
							local748 = (local823 - 50) * 327685 + 65280;
						} else if (local823 < 150) {
							local748 = 16777215 - (local823 - 100) * 327680;
						}
					}
					if (this.anIntArray220[local614] == 0) {
						this.aClass6_Sub1_Sub1_Sub2_4.method205(this.anInt905, 0, local743, this.anInt906 + 1);
						this.aClass6_Sub1_Sub1_Sub2_4.method205(this.anInt905, local748, local743, this.anInt906);
					}
					if (this.anIntArray220[local614] == 1) {
						this.aClass6_Sub1_Sub1_Sub2_4.method210(local743, 0, this.anInt905, this.anInt906 + 1, (byte) 1, this.anInt1027);
						this.aClass6_Sub1_Sub1_Sub2_4.method210(local743, local748, this.anInt905, this.anInt906, (byte) 1, this.anInt1027);
					}
					if (this.anIntArray220[local614] == 2) {
						this.aClass6_Sub1_Sub1_Sub2_4.method211(this.anInt906 + 1, this.anInt905, this.anInt1027, this.anInt1021, local743, 0);
						this.aClass6_Sub1_Sub1_Sub2_4.method211(this.anInt906, this.anInt905, this.anInt1027, this.anInt1021, local743, local748);
					}
					if (this.anIntArray220[local614] == 3) {
						this.aClass6_Sub1_Sub1_Sub2_4.method212(150 - this.anIntArray221[local614], 0, this.anInt906 + 1, this.anInt905, this.anInt1027, local743);
						this.aClass6_Sub1_Sub1_Sub2_4.method212(150 - this.anIntArray221[local614], local748, this.anInt906, this.anInt905, this.anInt1027, local743);
					}
					@Pc(1122) int local1122;
					if (this.anIntArray220[local614] == 4) {
						local823 = this.aClass6_Sub1_Sub1_Sub2_4.method208(local743);
						local1122 = (150 - this.anIntArray221[local614]) * (local823 + 100) / 150;
						Class6_Sub1_Sub1.method552(this.anInt905 - 50, 334, this.anInt905 + 50, 0);
						this.aClass6_Sub1_Sub1_Sub2_4.method209(0, local743, this.anInt906 + 1, this.anInt905 + 50 - local1122);
						this.aClass6_Sub1_Sub1_Sub2_4.method209(local748, local743, this.anInt906, this.anInt905 + 50 - local1122);
						Class6_Sub1_Sub1.method551();
					}
					if (this.anIntArray220[local614] == 5) {
						local823 = 150 - this.anIntArray221[local614];
						local1122 = 0;
						if (local823 < 25) {
							local1122 = local823 - 25;
						} else if (local823 > 125) {
							local1122 = local823 - 125;
						}
						Class6_Sub1_Sub1.method552(0, this.anInt906 + 5, 512, this.anInt906 - this.aClass6_Sub1_Sub1_Sub2_4.anInt397 - 1);
						this.aClass6_Sub1_Sub1_Sub2_4.method205(this.anInt905, 0, local743, this.anInt906 + local1122 + 1);
						this.aClass6_Sub1_Sub1_Sub2_4.method205(this.anInt905, local748, local743, this.anInt906 + local1122);
						Class6_Sub1_Sub1.method551();
					}
				} else {
					this.aClass6_Sub1_Sub1_Sub2_4.method205(this.anInt905, 0, local743, this.anInt906 + 1);
					this.aClass6_Sub1_Sub1_Sub2_4.method205(this.anInt905, 16776960, local743, this.anInt906);
				}
			}
		} catch (@Pc(1272) RuntimeException local1272) {
			signlink.reporterror("44083, " + -376 + ", " + local1272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
	private void method707(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt981 != -1) {
				this.aString25 = arg0;
				super.anInt857 = 0;
			}
			if (this.anInt1030 == -1) {
				this.aBoolean246 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray261[local20] = this.anIntArray261[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
				this.aStringArray13[local20] = this.aStringArray13[local20 - 1];
			}
			this.anIntArray261[0] = arg1;
			this.aStringArray12[0] = arg2;
			this.aStringArray13[0] = arg0;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("63108, " + -83 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	private boolean method708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray23[local7][local11] = 99999999;
				}
			}
			local11 = arg3;
			@Pc(39) int local39 = arg1;
			this.anIntArrayArray25[arg3][arg1] = 99;
			this.anIntArrayArray23[arg3][arg1] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray265[0] = arg3;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray266[0] = arg1;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray265.length;
			@Pc(90) int[][] local90 = this.aClass3Array1[this.anInt989].anIntArrayArray1;
			@Pc(202) int local202;
			while (local57 != local66) {
				local11 = this.anIntArray265[local57];
				local39 = this.anIntArray266[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg9 && local39 == arg10) {
					local70 = true;
					break;
				}
				if (arg6 != 0) {
					if ((arg6 < 5 || arg6 == 10) && this.aClass3Array1[this.anInt989].method14(arg10, arg0, local39, arg6 - 1, local11, this.anInt881, arg9)) {
						local70 = true;
						break;
					}
					if (arg6 < 10 && this.aClass3Array1[this.anInt989].method15(local39, arg10, arg6 - 1, arg9, local11, arg0)) {
						local70 = true;
						break;
					}
				}
				if (arg2 != 0 && arg5 != 0 && this.aClass3Array1[this.anInt989].method16(local39, arg5, arg4, arg2, arg10, local11, arg9)) {
					local70 = true;
					break;
				}
				local202 = this.anIntArrayArray23[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local90[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray265[local66] = local11 - 1;
					this.anIntArray266[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray23[local11 - 1][local39] = local202;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local90[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray265[local66] = local11 + 1;
					this.anIntArray266[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray23[local11 + 1][local39] = local202;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local90[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray265[local66] = local11;
					this.anIntArray266[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray23[local11][local39 - 1] = local202;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local90[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray265[local66] = local11;
					this.anIntArray266[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray23[local11][local39 + 1] = local202;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local90[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local90[local11 - 1][local39] & 0x1280108) == 0 && (local90[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray265[local66] = local11 - 1;
					this.anIntArray266[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = local202;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local90[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local90[local11 + 1][local39] & 0x1280180) == 0 && (local90[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray265[local66] = local11 + 1;
					this.anIntArray266[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = local202;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local90[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local90[local11 - 1][local39] & 0x1280108) == 0 && (local90[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray265[local66] = local11 - 1;
					this.anIntArray266[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = local202;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local90[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local90[local11 + 1][local39] & 0x1280180) == 0 && (local90[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray265[local66] = local11 + 1;
					this.anIntArray266[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = local202;
				}
			}
			this.anInt971 = 0;
			@Pc(818) int local818;
			@Pc(824) int local824;
			@Pc(830) int local830;
			if (!local70) {
				if (arg7) {
					local202 = 100;
					for (local818 = 1; local818 < 2; local818++) {
						for (local824 = arg9 - local818; local824 <= arg9 + local818; local824++) {
							for (local830 = arg10 - local818; local830 <= arg10 + local818; local830++) {
								if (local824 >= 0 && local830 >= 0 && local824 < 104 && local830 < 104 && this.anIntArrayArray23[local824][local830] < local202) {
									local202 = this.anIntArrayArray23[local824][local830];
									local11 = local824;
									local39 = local830;
									this.anInt971 = 1;
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
			@Pc(891) byte local891 = 0;
			this.anIntArray265[0] = local11;
			local57 = local891 + 1;
			this.anIntArray266[0] = local39;
			local202 = local818 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg3 || local39 != arg1) {
				if (local202 != local818) {
					local818 = local202;
					this.anIntArray265[local57] = local11;
					this.anIntArray266[local57++] = local39;
				}
				if ((local202 & 0x2) != 0) {
					local11++;
				} else if ((local202 & 0x8) != 0) {
					local11--;
				}
				if ((local202 & 0x1) != 0) {
					local39++;
				} else if ((local202 & 0x4) != 0) {
					local39--;
				}
				local202 = this.anIntArrayArray25[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local824 = this.anIntArray265[local57];
				local830 = this.anIntArray266[local57];
				if (arg8 == 0) {
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 66);
					this.aClass6_Sub1_Sub4_9.method401(local74 + local74 + 3);
				}
				if (arg8 == 1) {
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 77);
					this.aClass6_Sub1_Sub4_9.method401(local74 + local74 + 3 + 14);
				}
				if (arg8 == 2) {
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 213);
					this.aClass6_Sub1_Sub4_9.method401(local74 + local74 + 3);
				}
				this.anInt1038 = this.anIntArray265[0];
				this.anInt1039 = this.anIntArray266[0];
				for (@Pc(1052) int local1052 = 1; local1052 < local74; local1052++) {
					local57--;
					this.aClass6_Sub1_Sub4_9.method401(this.anIntArray265[local57] - local824);
					this.aClass6_Sub1_Sub4_9.method427(this.anIntArray266[local57] - local830);
				}
				this.aClass6_Sub1_Sub4_9.method435(local824 + this.anInt928);
				this.aClass6_Sub1_Sub4_9.method434(local830 + this.anInt929);
				this.aClass6_Sub1_Sub4_9.method401(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg8 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1116) RuntimeException local1116) {
			signlink.reporterror("10874, " + 584 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QUBPQDMQ;)Z")
	private boolean method709(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1) {
		try {
			if (arg1.anIntArray189 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg1.anIntArray189.length; local6++) {
				@Pc(14) int local14 = this.method611(local6, arg1);
				@Pc(19) int local19 = arg1.anIntArray186[local6];
				if (arg1.anIntArray189[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg1.anIntArray189[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg1.anIntArray189[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			@Pc(67) boolean local67 = false;
			return true;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("36486, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method710() {
		try {
			signlink.aBoolean275 = false;
			signlink.anInt1104 = 0;
			signlink.midi = "stop";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("62938, " + 2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method711(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt888 == 0 && this.anInt1085 == 0) {
				this.aStringArray9[this.anInt886] = "Walk here";
				this.anIntArray258[this.anInt886] = 549;
				this.anIntArray256[this.anInt886] = super.anInt852;
				this.anIntArray257[this.anInt886] = super.anInt853;
				this.anInt886++;
			}
			@Pc(41) int local41 = -1;
			while (arg0 >= 0) {
				this.method580();
			}
			for (@Pc(49) int local49 = 0; local49 < Class6_Sub1_Sub2_Sub5.anInt444; local49++) {
				@Pc(55) int local55 = Class6_Sub1_Sub2_Sub5.anIntArray120[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(224) int local224;
					if (local71 == 2 && this.aClass32_1.method349(this.anInt989, local59, local65, local55) >= 0) {
						@Pc(97) Class28 local97 = Class28.method268(local77);
						if (local97.anIntArray127 != null) {
							local97 = local97.method275();
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt888 == 1) {
							this.aStringArray9[this.anInt886] = "Use " + this.aString17 + " with @cya@" + local97.aString6;
							this.anIntArray258[this.anInt886] = 695;
							this.anIntArray259[this.anInt886] = local55;
							this.anIntArray256[this.anInt886] = local59;
							this.anIntArray257[this.anInt886] = local65;
							this.anInt886++;
						} else if (this.anInt1085 != 1) {
							if (local97.aStringArray3 != null) {
								for (local224 = 4; local224 >= 0; local224--) {
									if (local97.aStringArray3[local224] != null) {
										this.aStringArray9[this.anInt886] = local97.aStringArray3[local224] + " @cya@" + local97.aString6;
										if (local224 == 0) {
											this.anIntArray258[this.anInt886] = 652;
										}
										if (local224 == 1) {
											this.anIntArray258[this.anInt886] = 769;
										}
										if (local224 == 2) {
											this.anIntArray258[this.anInt886] = 288;
										}
										if (local224 == 3) {
											this.anIntArray258[this.anInt886] = 301;
										}
										if (local224 == 4) {
											this.anIntArray258[this.anInt886] = 1103;
										}
										this.anIntArray259[this.anInt886] = local55;
										this.anIntArray256[this.anInt886] = local59;
										this.anIntArray257[this.anInt886] = local65;
										this.anInt886++;
									}
								}
							}
							this.aStringArray9[this.anInt886] = "Examine @cya@" + local97.aString6;
							this.anIntArray258[this.anInt886] = 1415;
							this.anIntArray259[this.anInt886] = local97.anInt470 << 14;
							this.anIntArray256[this.anInt886] = local59;
							this.anIntArray257[this.anInt886] = local65;
							this.anInt886++;
						} else if ((this.anInt1087 & 0x4) == 4) {
							this.aStringArray9[this.anInt886] = this.aString31 + " @cya@" + local97.aString6;
							this.anIntArray258[this.anInt886] = 183;
							this.anIntArray259[this.anInt886] = local55;
							this.anIntArray256[this.anInt886] = local59;
							this.anIntArray257[this.anInt886] = local65;
							this.anInt886++;
						}
					}
					@Pc(404) Class6_Sub1_Sub2_Sub3_Sub2 local404;
					@Pc(452) Class6_Sub1_Sub2_Sub3_Sub1 local452;
					@Pc(442) int local442;
					if (local71 == 1) {
						@Pc(375) Class6_Sub1_Sub2_Sub3_Sub2 local375 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[local77];
						if (local375.aClass47_2.aByte23 == 1 && (local375.anInt535 & 0x7F) == 64 && (local375.anInt536 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt884; local224++) {
								local404 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray228[local224]];
								if (local404 != null && local404 != local375 && local404.aClass47_2.aByte23 == 1 && local404.anInt535 == local375.anInt535 && local404.anInt536 == local375.anInt536) {
									this.method703(this.anIntArray228[local224], local404.aClass47_2, local65, local59);
								}
							}
							for (local442 = 0; local442 < this.anInt872; local442++) {
								local452 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray223[local442]];
								if (local452 != null && local452.anInt535 == local375.anInt535 && local452.anInt536 == local375.anInt536) {
									this.method724(local59, local65, this.anIntArray223[local442], local452);
								}
							}
						}
						this.method703(local77, local375.aClass47_2, local65, local59);
					}
					if (local71 == 0) {
						@Pc(494) Class6_Sub1_Sub2_Sub3_Sub1 local494 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[local77];
						if ((local494.anInt535 & 0x7F) == 64 && (local494.anInt536 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt884; local224++) {
								local404 = this.aClass6_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray228[local224]];
								if (local404 != null && local404.aClass47_2.aByte23 == 1 && local404.anInt535 == local494.anInt535 && local404.anInt536 == local494.anInt536) {
									this.method703(this.anIntArray228[local224], local404.aClass47_2, local65, local59);
								}
							}
							for (local442 = 0; local442 < this.anInt872; local442++) {
								local452 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray223[local442]];
								if (local452 != null && local452 != local494 && local452.anInt535 == local494.anInt535 && local452.anInt536 == local494.anInt536) {
									this.method724(local59, local65, this.anIntArray223[local442], local452);
								}
							}
						}
						this.method724(local59, local65, local77, local494);
					}
					if (local71 == 3) {
						@Pc(613) Class5 local613 = this.aClass5ArrayArrayArray1[this.anInt989][local59][local65];
						if (local613 != null) {
							for (@Pc(620) Class6_Sub1_Sub2_Sub4 local620 = (Class6_Sub1_Sub2_Sub4) local613.method34(); local620 != null; local620 = (Class6_Sub1_Sub2_Sub4) local613.method36()) {
								@Pc(626) Class4 local626 = Class4.method22(local620.anInt314);
								if (this.anInt888 == 1) {
									this.aStringArray9[this.anInt886] = "Use " + this.aString17 + " with @lre@" + local626.aString1;
									this.anIntArray258[this.anInt886] = 163;
									this.anIntArray259[this.anInt886] = local620.anInt314;
									this.anIntArray256[this.anInt886] = local59;
									this.anIntArray257[this.anInt886] = local65;
									this.anInt886++;
								} else if (this.anInt1085 != 1) {
									for (@Pc(743) int local743 = 4; local743 >= 0; local743--) {
										if (local626.aStringArray1 != null && local626.aStringArray1[local743] != null) {
											this.aStringArray9[this.anInt886] = local626.aStringArray1[local743] + " @lre@" + local626.aString1;
											if (local743 == 0) {
												this.anIntArray258[this.anInt886] = 740;
											}
											if (local743 == 1) {
												this.anIntArray258[this.anInt886] = 126;
											}
											if (local743 == 2) {
												this.anIntArray258[this.anInt886] = 669;
											}
											if (local743 == 3) {
												this.anIntArray258[this.anInt886] = 922;
											}
											if (local743 == 4) {
												this.anIntArray258[this.anInt886] = 78;
											}
											this.anIntArray259[this.anInt886] = local620.anInt314;
											this.anIntArray256[this.anInt886] = local59;
											this.anIntArray257[this.anInt886] = local65;
											this.anInt886++;
										} else if (local743 == 2) {
											this.aStringArray9[this.anInt886] = "Take @lre@" + local626.aString1;
											this.anIntArray258[this.anInt886] = 669;
											this.anIntArray259[this.anInt886] = local620.anInt314;
											this.anIntArray256[this.anInt886] = local59;
											this.anIntArray257[this.anInt886] = local65;
											this.anInt886++;
										}
									}
									this.aStringArray9[this.anInt886] = "Examine @lre@" + local626.aString1;
									this.anIntArray258[this.anInt886] = 1977;
									this.anIntArray259[this.anInt886] = local620.anInt314;
									this.anIntArray256[this.anInt886] = local59;
									this.anIntArray257[this.anInt886] = local65;
									this.anInt886++;
								} else if ((this.anInt1087 & 0x1) == 1) {
									this.aStringArray9[this.anInt886] = this.aString31 + " @lre@" + local626.aString1;
									this.anIntArray258[this.anInt886] = 550;
									this.anIntArray259[this.anInt886] = local620.anInt314;
									this.anIntArray256[this.anInt886] = local59;
									this.anIntArray257[this.anInt886] = local65;
									this.anInt886++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("97628, " + arg0 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method712() {
		try {
			if (this.anInt1092 == 0) {
				@Pc(12) int local12 = super.anInt857;
				if (this.anInt1085 == 1 && super.anInt858 >= 516 && super.anInt859 >= 160 && super.anInt858 <= 765 && super.anInt859 <= 205) {
					local12 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean270) {
					if (local12 != 1) {
						local43 = super.anInt852;
						local46 = super.anInt853;
						if (this.anInt1052 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt1052 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt1052 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt1053 - 10 || local43 > this.anInt1053 + this.anInt1055 + 10 || local46 < this.anInt1054 - 10 || local46 > this.anInt1054 + this.anInt1056 + 10) {
							this.aBoolean270 = false;
							if (this.anInt1052 == 1) {
								this.aBoolean253 = true;
							}
							if (this.anInt1052 == 2) {
								this.aBoolean246 = true;
							}
						}
					}
					if (local12 == 1) {
						local43 = this.anInt1053;
						local46 = this.anInt1054;
						local122 = this.anInt1055;
						@Pc(125) int local125 = super.anInt858;
						@Pc(128) int local128 = super.anInt859;
						if (this.anInt1052 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt1052 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt1052 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt886; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt886 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method686(local147, this.anInt878);
						}
						this.aBoolean270 = false;
						if (this.anInt1052 == 1) {
							this.aBoolean253 = true;
						}
						if (this.anInt1052 == 2) {
							this.aBoolean246 = true;
							return;
						}
					}
				} else {
					if (local12 == 1 && this.anInt886 > 0) {
						local43 = this.anIntArray258[this.anInt886 - 1];
						if (local43 == 551 || local43 == 688 || local43 == 125 || local43 == 459 || local43 == 6 || local43 == 616 || local43 == 330 || local43 == 840 || local43 == 773 || local43 == 813 || local43 == 960 || local43 == 1985) {
							local46 = this.anIntArray256[this.anInt886 - 1];
							local122 = this.anIntArray257[this.anInt886 - 1];
							@Pc(284) Class35 local284 = Class35.method389(local122);
							if (local284.aBoolean163 || local284.aBoolean169) {
								this.aBoolean249 = false;
								this.anInt918 = 0;
								this.anInt1090 = local122;
								this.anInt1091 = local46;
								this.anInt1092 = 2;
								this.anInt1093 = super.anInt858;
								this.anInt1094 = super.anInt859;
								if (Class35.method389(local122).anInt663 == this.anInt985) {
									this.anInt1092 = 1;
								}
								if (Class35.method389(local122).anInt663 == this.anInt1030) {
									this.anInt1092 = 3;
								}
								return;
							}
						}
					}
					if (local12 == 1 && (this.anInt969 == 1 || this.method695(this.anInt886 - 1)) && this.anInt886 > 2) {
						local12 = 2;
					}
					if (local12 == 1 && this.anInt886 > 0) {
						this.method686(this.anInt886 - 1, this.anInt878);
					}
					if (local12 != 2 || this.anInt886 <= 0) {
						return;
					}
					this.method592();
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("16148, " + 3 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIILclient!QUBPQDMQ;)V")
	private void method713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class35 arg6) {
		try {
			this.anInt1013 += 0;
			if (arg6.anInt687 == 0 && arg6.anIntArray188 != null && !arg6.aBoolean168 && (arg5 >= arg1 && arg0 >= arg3 && arg5 <= arg1 + arg6.anInt660 && arg0 <= arg3 + arg6.anInt667)) {
				@Pc(40) int local40 = arg6.anIntArray188.length;
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(51) int local51 = arg6.anIntArray182[local42] + arg1;
					@Pc(60) int local60 = arg6.anIntArray187[local42] + arg3 - arg2;
					@Pc(66) Class35 local66 = Class35.method389(arg6.anIntArray188[local42]);
					@Pc(71) int local71 = local51 + local66.anInt681;
					@Pc(76) int local76 = local60 + local66.anInt654;
					if ((local66.anInt668 >= 0 || local66.anInt662 != 0) && arg5 >= local71 && arg0 >= local76 && arg5 < local71 + local66.anInt660 && arg0 < local76 + local66.anInt667) {
						if (local66.anInt668 >= 0) {
							this.anInt1019 = local66.anInt668;
						} else {
							this.anInt1019 = local66.anInt674;
						}
					}
					if (local66.anInt687 == 8 && arg5 >= local71 && arg0 >= local76 && arg5 < local71 + local66.anInt660 && arg0 < local76 + local66.anInt667) {
						this.anInt927 = local66.anInt674;
					}
					if (local66.anInt687 == 0) {
						this.method713(arg0, local71, local66.anInt666, local76, arg4, arg5, local66);
						if (local66.anInt664 > local66.anInt667) {
							this.method600(local66.anInt667, arg5, local66.anInt664, local71 + local66.anInt660, local66, arg0, local76, arg4);
						}
					} else {
						if (local66.anInt675 == 1 && arg5 >= local71 && arg0 >= local76 && arg5 < local71 + local66.anInt660 && arg0 < local76 + local66.anInt667) {
							@Pc(200) boolean local200 = false;
							if (local66.anInt682 != 0) {
								local200 = this.method726(local66);
							}
							if (!local200) {
								this.aStringArray9[this.anInt886] = local66.aString13;
								this.anIntArray258[this.anInt886] = 891;
								this.anIntArray257[this.anInt886] = local66.anInt674;
								this.anInt886++;
							}
						}
						if (local66.anInt675 == 2 && this.anInt1085 == 0 && arg5 >= local71 && arg0 >= local76 && arg5 < local71 + local66.anInt660 && arg0 < local76 + local66.anInt667) {
							@Pc(264) String local264 = local66.aString12;
							if (local264.indexOf(" ") != -1) {
								local264 = local264.substring(0, local264.indexOf(" "));
							}
							this.aStringArray9[this.anInt886] = local264 + " @gre@" + local66.aString9;
							this.anIntArray258[this.anInt886] = 598;
							this.anIntArray257[this.anInt886] = local66.anInt674;
							this.anInt886++;
						}
						if (local66.anInt675 == 3 && arg5 >= local71 && arg0 >= local76 && arg5 < local71 + local66.anInt660 && arg0 < local76 + local66.anInt667) {
							this.aStringArray9[this.anInt886] = "Close";
							if (arg4 == 3) {
								this.anIntArray258[this.anInt886] = 559;
							} else {
								this.anIntArray258[this.anInt886] = 579;
							}
							this.anIntArray257[this.anInt886] = local66.anInt674;
							this.anInt886++;
						}
						if (local66.anInt675 == 4 && arg5 >= local71 && arg0 >= local76 && arg5 < local71 + local66.anInt660 && arg0 < local76 + local66.anInt667) {
							this.aStringArray9[this.anInt886] = local66.aString13;
							this.anIntArray258[this.anInt886] = 682;
							this.anIntArray257[this.anInt886] = local66.anInt674;
							this.anInt886++;
						}
						if (local66.anInt675 == 5 && arg5 >= local71 && arg0 >= local76 && arg5 < local71 + local66.anInt660 && arg0 < local76 + local66.anInt667) {
							this.aStringArray9[this.anInt886] = local66.aString13;
							this.anIntArray258[this.anInt886] = 548;
							this.anIntArray257[this.anInt886] = local66.anInt674;
							this.anInt886++;
						}
						if (local66.anInt675 == 6 && !this.aBoolean237 && arg5 >= local71 && arg0 >= local76 && arg5 < local71 + local66.anInt660 && arg0 < local76 + local66.anInt667) {
							this.aStringArray9[this.anInt886] = local66.aString13;
							this.anIntArray258[this.anInt886] = 322;
							this.anIntArray257[this.anInt886] = local66.anInt674;
							this.anInt886++;
						}
						if (local66.anInt687 == 2) {
							@Pc(523) int local523 = 0;
							for (@Pc(525) int local525 = 0; local525 < local66.anInt667; local525++) {
								for (@Pc(529) int local529 = 0; local529 < local66.anInt660; local529++) {
									@Pc(540) int local540 = local71 + local529 * (local66.anInt669 + 32);
									@Pc(549) int local549 = local76 + local525 * (local66.anInt679 + 32);
									if (local523 < 20) {
										local540 += local66.anIntArray183[local523];
										local549 += local66.anIntArray181[local523];
									}
									if (arg5 >= local540 && arg0 >= local549 && arg5 < local540 + 32 && arg0 < local549 + 32) {
										this.anInt941 = local523;
										this.anInt942 = local66.anInt674;
										if (local66.anIntArray185[local523] > 0) {
											@Pc(602) Class4 local602 = Class4.method22(local66.anIntArray185[local523] - 1);
											if (this.anInt888 == 1 && local66.aBoolean171) {
												if (local66.anInt674 != this.anInt890 || local523 != this.anInt889) {
													this.aStringArray9[this.anInt886] = "Use " + this.aString17 + " with @lre@" + local602.aString1;
													this.anIntArray258[this.anInt886] = 612;
													this.anIntArray259[this.anInt886] = local602.anInt29;
													this.anIntArray256[this.anInt886] = local523;
													this.anIntArray257[this.anInt886] = local66.anInt674;
													this.anInt886++;
												}
											} else if (this.anInt1085 != 1 || !local66.aBoolean171) {
												@Pc(739) int local739;
												if (local66.aBoolean171) {
													for (local739 = 4; local739 >= 3; local739--) {
														if (local602.aStringArray2 != null && local602.aStringArray2[local739] != null) {
															this.aStringArray9[this.anInt886] = local602.aStringArray2[local739] + " @lre@" + local602.aString1;
															if (local739 == 3) {
																this.anIntArray258[this.anInt886] = 773;
															}
															if (local739 == 4) {
																this.anIntArray258[this.anInt886] = 813;
															}
															this.anIntArray259[this.anInt886] = local602.anInt29;
															this.anIntArray256[this.anInt886] = local523;
															this.anIntArray257[this.anInt886] = local66.anInt674;
															this.anInt886++;
														} else if (local739 == 4) {
															this.aStringArray9[this.anInt886] = "Drop @lre@" + local602.aString1;
															this.anIntArray258[this.anInt886] = 813;
															this.anIntArray259[this.anInt886] = local602.anInt29;
															this.anIntArray256[this.anInt886] = local523;
															this.anIntArray257[this.anInt886] = local66.anInt674;
															this.anInt886++;
														}
													}
												}
												if (local66.aBoolean164) {
													this.aStringArray9[this.anInt886] = "Use @lre@" + local602.aString1;
													this.anIntArray258[this.anInt886] = 960;
													this.anIntArray259[this.anInt886] = local602.anInt29;
													this.anIntArray256[this.anInt886] = local523;
													this.anIntArray257[this.anInt886] = local66.anInt674;
													this.anInt886++;
												}
												if (local66.aBoolean171 && local602.aStringArray2 != null) {
													for (local739 = 2; local739 >= 0; local739--) {
														if (local602.aStringArray2[local739] != null) {
															this.aStringArray9[this.anInt886] = local602.aStringArray2[local739] + " @lre@" + local602.aString1;
															if (local739 == 0) {
																this.anIntArray258[this.anInt886] = 616;
															}
															if (local739 == 1) {
																this.anIntArray258[this.anInt886] = 330;
															}
															if (local739 == 2) {
																this.anIntArray258[this.anInt886] = 840;
															}
															this.anIntArray259[this.anInt886] = local602.anInt29;
															this.anIntArray256[this.anInt886] = local523;
															this.anIntArray257[this.anInt886] = local66.anInt674;
															this.anInt886++;
														}
													}
												}
												if (local66.aStringArray4 != null) {
													for (local739 = 4; local739 >= 0; local739--) {
														if (local66.aStringArray4[local739] != null) {
															this.aStringArray9[this.anInt886] = local66.aStringArray4[local739] + " @lre@" + local602.aString1;
															if (local739 == 0) {
																this.anIntArray258[this.anInt886] = 551;
															}
															if (local739 == 1) {
																this.anIntArray258[this.anInt886] = 688;
															}
															if (local739 == 2) {
																this.anIntArray258[this.anInt886] = 125;
															}
															if (local739 == 3) {
																this.anIntArray258[this.anInt886] = 459;
															}
															if (local739 == 4) {
																this.anIntArray258[this.anInt886] = 6;
															}
															this.anIntArray259[this.anInt886] = local602.anInt29;
															this.anIntArray256[this.anInt886] = local523;
															this.anIntArray257[this.anInt886] = local66.anInt674;
															this.anInt886++;
														}
													}
												}
												this.aStringArray9[this.anInt886] = "Examine @lre@" + local602.aString1;
												this.anIntArray258[this.anInt886] = 1985;
												this.anIntArray259[this.anInt886] = local602.anInt29;
												this.anIntArray256[this.anInt886] = local523;
												this.anIntArray257[this.anInt886] = local66.anInt674;
												this.anInt886++;
											} else if ((this.anInt1087 & 0x10) == 16) {
												this.aStringArray9[this.anInt886] = this.aString31 + " @lre@" + local602.aString1;
												this.anIntArray258[this.anInt886] = 261;
												this.anIntArray259[this.anInt886] = local602.anInt29;
												this.anIntArray256[this.anInt886] = local523;
												this.anIntArray257[this.anInt886] = local66.anInt674;
												this.anInt886++;
											}
										}
									}
									local523++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1169) RuntimeException local1169) {
			signlink.reporterror("25115, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ZSWNSCUQ;)V")
	private void method714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub1_Sub1_Sub4 arg2) {
		try {
			@Pc(7) int local7 = this.anInt900 + this.anInt1047 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class6_Sub1_Sub2_Sub5.anIntArray121[local7];
				@Pc(27) int local27 = Class6_Sub1_Sub2_Sub5.anIntArray122[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt874 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt874 + 256);
				@Pc(59) int local59 = arg0 * local36 + arg1 * local45 >> 16;
				@Pc(69) int local69 = arg0 * local45 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method573(this.aClass6_Sub1_Sub1_Sub3_2, local59 + 94 + 4 - arg2.anInt838 / 2, 83 - local69 - arg2.anInt839 / 2 - 4);
				} else {
					arg2.method567(local59 + 94 + 4 - arg2.anInt838 / 2, 83 - local69 - arg2.anInt839 / 2 - 4);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("49511, " + 46599 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
	private void method715() {
		try {
			while (true) {
				@Pc(9) int local9 = this.method579(this.aByte32);
				if (local9 == -1) {
					return;
				}
				if (this.anInt985 != -1 && this.anInt985 == this.anInt865) {
					if (local9 == 8 && this.aString20.length() > 0) {
						this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
					}
					if ((local9 >= 97 && local9 <= 122 || local9 >= 65 && local9 <= 90 || local9 >= 48 && local9 <= 57 || local9 == 32) && this.aString20.length() < 12) {
						this.aString20 = this.aString20 + (char) local9;
					}
				} else {
					@Pc(190) int local190;
					if (this.aBoolean247) {
						if (local9 >= 32 && local9 <= 122 && this.aString21.length() < 80) {
							this.aString21 = this.aString21 + (char) local9;
							this.aBoolean246 = true;
						}
						if (local9 == 8 && this.aString21.length() > 0) {
							this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							this.aBoolean246 = true;
						}
						if (local9 == 13 || local9 == 10) {
							this.aBoolean247 = false;
							this.aBoolean246 = true;
							@Pc(149) long local149;
							if (this.anInt1018 == 1) {
								local149 = Class38.method453(this.aString21);
								this.method680(local149);
							}
							if (this.anInt1018 == 2 && this.anInt1023 > 0) {
								local149 = Class38.method453(this.aString21);
								this.method696(local149);
							}
							if (this.anInt1018 == 3 && this.aString21.length() > 0) {
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 56);
								this.aClass6_Sub1_Sub4_9.method401(0);
								local190 = this.aClass6_Sub1_Sub4_9.anInt704;
								this.aClass6_Sub1_Sub4_9.method407(this.aLong29);
								Class50.method546(this.aClass6_Sub1_Sub4_9, this.aString21);
								this.aClass6_Sub1_Sub4_9.method410(this.aClass6_Sub1_Sub4_9.anInt704 - local190);
								this.aString21 = Class50.method547(this.aString21);
								this.aString21 = Class44.method479(this.aString21);
								this.method707(this.aString21, 6, Class38.method457(Class38.method454(this.aLong29)));
								if (this.anInt980 == 2) {
									this.anInt980 = 1;
									this.aBoolean233 = true;
									this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 50);
									this.aClass6_Sub1_Sub4_9.method401(this.anInt932);
									this.aClass6_Sub1_Sub4_9.method401(this.anInt980);
									this.aClass6_Sub1_Sub4_9.method401(this.anInt1025);
								}
							}
							if (this.anInt1018 == 4 && this.anInt1009 < 100) {
								local149 = Class38.method453(this.aString21);
								this.method719(local149);
							}
							if (this.anInt1018 == 5 && this.anInt1009 > 0) {
								local149 = Class38.method453(this.aString21);
								this.method665(local149, this.anInt1001);
							}
						}
					} else if (this.anInt1010 == 1) {
						if (local9 >= 48 && local9 <= 57 && this.aString18.length() < 10) {
							this.aString18 = this.aString18 + (char) local9;
							this.aBoolean246 = true;
						}
						if (local9 == 8 && this.aString18.length() > 0) {
							this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							this.aBoolean246 = true;
						}
						if (local9 == 13 || local9 == 10) {
							if (this.aString18.length() > 0) {
								local190 = 0;
								try {
									local190 = Integer.parseInt(this.aString18);
								} catch (@Pc(369) Exception local369) {
								}
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 175);
								this.aClass6_Sub1_Sub4_9.method405(local190);
							}
							this.anInt1010 = 0;
							this.aBoolean246 = true;
						}
					} else if (this.anInt1010 == 2) {
						if (local9 >= 32 && local9 <= 122 && this.aString18.length() < 12) {
							this.aString18 = this.aString18 + (char) local9;
							this.aBoolean246 = true;
						}
						if (local9 == 8 && this.aString18.length() > 0) {
							this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							this.aBoolean246 = true;
						}
						if (local9 == 13 || local9 == 10) {
							if (this.aString18.length() > 0) {
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 147);
								this.aClass6_Sub1_Sub4_9.method407(Class38.method453(this.aString18));
							}
							this.anInt1010 = 0;
							this.aBoolean246 = true;
						}
					} else if (this.anInt1010 == 3) {
						if (local9 >= 32 && local9 <= 122 && this.aString18.length() < 40) {
							this.aString18 = this.aString18 + (char) local9;
							this.aBoolean246 = true;
						}
						if (local9 == 8 && this.aString18.length() > 0) {
							this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							this.aBoolean246 = true;
						}
					} else if (this.anInt1030 == -1 && this.anInt1006 == -1) {
						if (local9 >= 32 && local9 <= 122 && this.aString24.length() < 80) {
							this.aString24 = this.aString24 + (char) local9;
							this.aBoolean246 = true;
						}
						if (local9 == 8 && this.aString24.length() > 0) {
							this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
							this.aBoolean246 = true;
						}
						if ((local9 == 13 || local9 == 10) && this.aString24.length() > 0) {
							if (this.anInt1003 == 2) {
								if (this.aString24.equals("::clientdrop")) {
									this.method607();
								}
								if (this.aString24.equals("::lag")) {
									this.method674();
								}
								if (this.aString24.equals("::prefetchmusic")) {
									for (local190 = 0; local190 < this.aClass22_Sub1_1.method294(2); local190++) {
										this.aClass22_Sub1_1.method291(2, (byte) 1, local190);
									}
								}
								if (this.aString24.equals("::fpson")) {
									aBoolean234 = true;
								}
								if (this.aString24.equals("::fpsoff")) {
									aBoolean234 = false;
								}
								if (this.aString24.equals("::noclip")) {
									for (local190 = 0; local190 < 4; local190++) {
										for (@Pc(656) int local656 = 1; local656 < 103; local656++) {
											for (@Pc(660) int local660 = 1; local660 < 103; local660++) {
												this.aClass3Array1[local190].anIntArrayArray1[local656][local660] = 0;
											}
										}
									}
								}
							}
							if (this.aString24.startsWith("::")) {
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 225);
								this.aClass6_Sub1_Sub4_9.method401(this.aString24.length() - 1);
								this.aClass6_Sub1_Sub4_9.method408(this.aString24.substring(2));
							} else {
								@Pc(716) String local716 = this.aString24.toLowerCase();
								@Pc(718) byte local718 = 0;
								if (local716.startsWith("yellow:")) {
									local718 = 0;
									this.aString24 = this.aString24.substring(7);
								} else if (local716.startsWith("red:")) {
									local718 = 1;
									this.aString24 = this.aString24.substring(4);
								} else if (local716.startsWith("green:")) {
									local718 = 2;
									this.aString24 = this.aString24.substring(6);
								} else if (local716.startsWith("cyan:")) {
									local718 = 3;
									this.aString24 = this.aString24.substring(5);
								} else if (local716.startsWith("purple:")) {
									local718 = 4;
									this.aString24 = this.aString24.substring(7);
								} else if (local716.startsWith("white:")) {
									local718 = 5;
									this.aString24 = this.aString24.substring(6);
								} else if (local716.startsWith("flash1:")) {
									local718 = 6;
									this.aString24 = this.aString24.substring(7);
								} else if (local716.startsWith("flash2:")) {
									local718 = 7;
									this.aString24 = this.aString24.substring(7);
								} else if (local716.startsWith("flash3:")) {
									local718 = 8;
									this.aString24 = this.aString24.substring(7);
								} else if (local716.startsWith("glow1:")) {
									local718 = 9;
									this.aString24 = this.aString24.substring(6);
								} else if (local716.startsWith("glow2:")) {
									local718 = 10;
									this.aString24 = this.aString24.substring(6);
								} else if (local716.startsWith("glow3:")) {
									local718 = 11;
									this.aString24 = this.aString24.substring(6);
								}
								local716 = this.aString24.toLowerCase();
								@Pc(890) byte local890 = 0;
								if (local716.startsWith("wave:")) {
									local890 = 1;
									this.aString24 = this.aString24.substring(5);
								} else if (local716.startsWith("wave2:")) {
									local890 = 2;
									this.aString24 = this.aString24.substring(6);
								} else if (local716.startsWith("shake:")) {
									local890 = 3;
									this.aString24 = this.aString24.substring(6);
								} else if (local716.startsWith("scroll:")) {
									local890 = 4;
									this.aString24 = this.aString24.substring(7);
								} else if (local716.startsWith("slide:")) {
									local890 = 5;
									this.aString24 = this.aString24.substring(6);
								}
								this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 91);
								this.aClass6_Sub1_Sub4_9.method401(0);
								@Pc(972) int local972 = this.aClass6_Sub1_Sub4_9.anInt704;
								this.aClass6_Sub1_Sub4_9.method427(local890);
								this.aClass6_Sub1_Sub4_7.anInt704 = 0;
								Class50.method546(this.aClass6_Sub1_Sub4_7, this.aString24);
								this.aClass6_Sub1_Sub4_9.method447(this.aClass6_Sub1_Sub4_7.aByteArray17, this.aClass6_Sub1_Sub4_7.anInt704);
								this.aClass6_Sub1_Sub4_9.method428(local718);
								this.aClass6_Sub1_Sub4_9.method410(this.aClass6_Sub1_Sub4_9.anInt704 - local972);
								this.aString24 = Class50.method547(this.aString24);
								this.aString24 = Class44.method479(this.aString24);
								aClass6_Sub1_Sub2_Sub3_Sub1_1.aString8 = this.aString24;
								aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt525 = local718;
								aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt554 = local890;
								aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt542 = 150;
								if (this.anInt1003 == 2) {
									this.method707(aClass6_Sub1_Sub2_Sub3_Sub1_1.aString8, 2, "@cr2@" + aClass6_Sub1_Sub2_Sub3_Sub1_1.aString5);
								} else if (this.anInt1003 == 1) {
									this.method707(aClass6_Sub1_Sub2_Sub3_Sub1_1.aString8, 2, "@cr1@" + aClass6_Sub1_Sub2_Sub3_Sub1_1.aString5);
								} else {
									this.method707(aClass6_Sub1_Sub2_Sub3_Sub1_1.aString8, 2, aClass6_Sub1_Sub2_Sub3_Sub1_1.aString5);
								}
								if (this.anInt932 == 2) {
									this.anInt932 = 3;
									this.aBoolean233 = true;
									this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 50);
									this.aClass6_Sub1_Sub4_9.method401(this.anInt932);
									this.aClass6_Sub1_Sub4_9.method401(this.anInt980);
									this.aClass6_Sub1_Sub4_9.method401(this.anInt1025);
								}
							}
							this.aString24 = "";
							this.aBoolean246 = true;
						}
					}
				}
			}
		} catch (@Pc(1126) RuntimeException local1126) {
			signlink.reporterror("22386, " + -536 + ", " + local1126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(8) int local8 = 2048 - arg3 & 0x7FF;
			@Pc(14) int local14 = 2048 - arg1 & 0x7FF;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = arg5;
			@Pc(26) int local26;
			@Pc(30) int local30;
			@Pc(40) int local40;
			if (local8 != 0) {
				local26 = Class6_Sub1_Sub2_Sub5.anIntArray121[local8];
				local30 = Class6_Sub1_Sub2_Sub5.anIntArray122[local8];
				local40 = local30 * 0 - arg5 * local26 >> 16;
				local20 = local26 * 0 + arg5 * local30 >> 16;
				local18 = local40;
			}
			if (local14 != 0) {
				local26 = Class6_Sub1_Sub2_Sub5.anIntArray121[local14];
				local30 = Class6_Sub1_Sub2_Sub5.anIntArray122[local14];
				local40 = local20 * local26 + local30 * 0 >> 16;
				local20 = local20 * local30 - local26 * 0 >> 16;
				local16 = local40;
			}
			this.anInt1031 = arg2 - local16;
			this.anInt1032 = arg0 - local18;
			this.anInt1033 = arg4 - local20;
			this.anInt1034 = arg3;
			this.anInt1035 = arg1;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("69179, " + arg0 + ", " + -727 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method717(@OriginalArg(0) int arg0) {
		try {
			@Pc(16) Class35 local16 = Class35.method389(arg0);
			for (@Pc(18) int local18 = 0; local18 < local16.anIntArray188.length && local16.anIntArray188[local18] != -1; local18++) {
				@Pc(32) Class35 local32 = Class35.method389(local16.anIntArray188[local18]);
				if (local32.anInt687 == 1) {
					this.method717(local32.anInt674);
				}
				local32.anInt690 = 0;
				local32.anInt655 = 0;
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("96034, " + arg0 + ", " + 1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
	@Override
	protected void method587(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt946 = arg1;
			this.aString29 = arg0;
			this.method658();
			if (this.aClass11_2 == null) {
				super.method587(arg0, arg1);
			} else {
				this.aClass15_9.method121();
				this.aClass6_Sub1_Sub1_Sub2_4.method205(180, 16777215, "RuneScape is loading - please wait...", 54);
				Class6_Sub1_Sub1.method556(34, 62, 606, 28, 9179409, 304);
				Class6_Sub1_Sub1.method556(32, 63, 606, 29, 0, 302);
				Class6_Sub1_Sub1.method555((byte) 4, 64, 30, 9179409, 30, arg1 * 3);
				Class6_Sub1_Sub1.method555((byte) 4, 64, arg1 * 3 + 30, 0, 30, 300 - arg1 * 3);
				this.aClass6_Sub1_Sub1_Sub2_4.method205(180, 16777215, arg0, 85);
				this.aClass15_9.method122(super.aGraphics2, 966, 171, 202);
				if (this.aBoolean259) {
					this.aBoolean259 = false;
					if (!this.aBoolean248) {
						this.aClass15_10.method122(super.aGraphics2, 966, 0, 0);
						this.aClass15_11.method122(super.aGraphics2, 966, 0, 637);
					}
					this.aClass15_7.method122(super.aGraphics2, 966, 0, 128);
					this.aClass15_8.method122(super.aGraphics2, 966, 371, 202);
					this.aClass15_12.method122(super.aGraphics2, 966, 265, 0);
					this.aClass15_13.method122(super.aGraphics2, 966, 265, 562);
					this.aClass15_14.method122(super.aGraphics2, 966, 171, 128);
					this.aClass15_15.method122(super.aGraphics2, 966, 171, 562);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("79839, " + arg0 + ", " + 27936 + ", " + arg1 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)Ljava/lang/String;")
	private String method718(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("83914, " + arg0 + ", " + 7 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method719(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1009 >= 100) {
					this.method707("Your ignore list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(23) String local23 = Class38.method457(Class38.method454(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt1009; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method707(local23 + " is already on your ignore list", 0, "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt1023; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method707("Please remove " + local23 + " from your friend list first", 0, "");
							return;
						}
					}
					this.aLongArray3[this.anInt1009++] = arg0;
					this.aBoolean253 = true;
					this.aClass6_Sub1_Sub4_9.method400(this.aBoolean235, 195);
					this.aClass6_Sub1_Sub4_9.method407(arg0);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("4898, " + 0 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method720(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt535 >> 7 == this.anInt1038 && aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt536 >> 7 == this.anInt1039) {
				this.anInt1038 = 0;
			}
			@Pc(21) int local21 = this.anInt872;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(33) int local33 = 0; local33 < local21; local33++) {
				@Pc(39) Class6_Sub1_Sub2_Sub3_Sub1 local39;
				@Pc(44) int local44;
				if (arg0) {
					local39 = aClass6_Sub1_Sub2_Sub3_Sub1_1;
					local44 = this.anInt871 << 14;
				} else {
					local39 = this.aClass6_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray223[local33]];
					local44 = this.anIntArray223[local33] << 14;
				}
				if (local39 != null && local39.method306()) {
					local39.aBoolean74 = false;
					if ((aBoolean252 && this.anInt872 > 50 || this.anInt872 > 200) && !arg0 && local39.anInt538 == local39.anInt551) {
						local39.aBoolean74 = true;
					}
					@Pc(95) int local95 = local39.anInt535 >> 7;
					@Pc(100) int local100 = local39.anInt536 >> 7;
					if (local95 >= 0 && local95 < 104 && local100 >= 0 && local100 < 104) {
						if (local39.aClass6_Sub1_Sub2_Sub5_1 == null || anInt936 < local39.anInt286 || anInt936 >= local39.anInt287) {
							if ((local39.anInt535 & 0x7F) == 64 && (local39.anInt536 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local95][local100] == this.anInt1027) {
									continue;
								}
								this.anIntArrayArray22[local95][local100] = this.anInt1027;
							}
							local39.anInt300 = this.method595(local39.anInt535, local39.anInt536, this.anInt989);
							this.aClass32_1.method330(local39.anInt536, local39.anInt300, local44, local39.anInt537, this.anInt989, local39.aBoolean145, local39.anInt535, local39, 60);
						} else {
							local39.aBoolean74 = false;
							local39.anInt300 = this.method595(local39.anInt535, local39.anInt536, this.anInt989);
							this.aClass32_1.method331(local39.anInt297, local39, local39.anInt294, this.anInt989, local39.anInt536, local39.anInt537, local44, local39.anInt296, local39.anInt295, local39.anInt300, local39.anInt535);
						}
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("55125, " + arg0 + ", " + 0 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
	private void method721() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray270[8] = 0;
			@Pc(10) int local10 = 0;
			while (this.anIntArray270[8] == 0) {
				@Pc(23) String local23 = "Unknown problem";
				this.method587("Connecting to web server", 20);
				try {
					@Pc(45) DataInputStream local45 = this.method631("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 357);
					@Pc(52) Class6_Sub1_Sub4 local52 = new Class6_Sub1_Sub4(new byte[40], (byte) -17);
					local45.readFully(local52.aByteArray17, 0, 40);
					local45.close();
					for (@Pc(62) int local62 = 0; local62 < 9; local62++) {
						this.anIntArray270[local62] = local52.method416();
					}
					@Pc(77) int local77 = local52.method416();
					@Pc(79) int local79 = 1234;
					for (@Pc(81) int local81 = 0; local81 < 9; local81++) {
						local79 = (local79 << 1) + this.anIntArray270[local81];
					}
					if (local77 != local79) {
						local23 = "checksum problem";
						this.anIntArray270[8] = 0;
					}
				} catch (@Pc(108) EOFException local108) {
					local23 = "EOF problem";
					this.anIntArray270[8] = 0;
				} catch (@Pc(117) IOException local117) {
					local23 = "connection problem";
					this.anIntArray270[8] = 0;
				} catch (@Pc(126) Exception local126) {
					local23 = "logic problem";
					this.anIntArray270[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray270[8] == 0) {
					local10++;
					for (@Pc(144) int local144 = local3; local144 > 0; local144--) {
						if (local10 >= 10) {
							this.method587("Game updated - please reload page", 10);
							local144 = 10;
						} else {
							this.method587(local23 + " - Will retry in " + local144 + " secs.", 10);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(178) Exception local178) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean256 = !this.aBoolean256;
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("74192, " + -31374 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(II)V")
	private void method722(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1106 = arg0;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("99049, " + -676 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method581() {
		try {
			if (!this.aBoolean229 && !this.aBoolean258 && !this.aBoolean254) {
				anInt936++;
				if (this.aBoolean243) {
					this.method687();
				} else {
					this.method662();
				}
				this.method602((byte) 3);
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("24166, " + -872 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "S", descriptor = "(I)V")
	private void method723() {
		try {
			this.aClass15_3.method121();
			Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray272;
			this.aClass6_Sub1_Sub1_Sub3_1.method535(0, 0);
			if (this.anInt911 != -1) {
				this.method675(0, 0, Class35.method389(this.anInt911), 0);
			} else if (this.anIntArray276[this.anInt1071] != -1) {
				this.method675(0, 0, Class35.method389(this.anIntArray276[this.anInt1071]), 0);
			}
			if (this.aBoolean270 && this.anInt1052 == 1) {
				this.method700();
			}
			this.aClass15_3.method122(super.aGraphics2, 966, 205, 553);
			this.aClass15_5.method121();
			Class6_Sub1_Sub1_Sub1.anIntArray12 = this.anIntArray273;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("45545, " + 42590 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!IGCQCHAY;)V")
	private void method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6_Sub1_Sub2_Sub3_Sub1 arg3) {
		try {
			if (arg3 != aClass6_Sub1_Sub2_Sub3_Sub1_1 && this.anInt886 < 400) {
				@Pc(40) String local40;
				if (arg3.anInt299 == 0) {
					local40 = arg3.aString5 + method692(aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt305, arg3.anInt305) + " (level-" + arg3.anInt305 + ")";
				} else {
					local40 = arg3.aString5 + " (skill-" + arg3.anInt299 + ")";
				}
				@Pc(170) int local170;
				if (this.anInt888 == 1) {
					this.aStringArray9[this.anInt886] = "Use " + this.aString17 + " with @whi@" + local40;
					this.anIntArray258[this.anInt886] = 405;
					this.anIntArray259[this.anInt886] = arg2;
					this.anIntArray256[this.anInt886] = arg0;
					this.anIntArray257[this.anInt886] = arg1;
					this.anInt886++;
				} else if (this.anInt1085 != 1) {
					for (local170 = 4; local170 >= 0; local170--) {
						if (this.aStringArray10[local170] != null) {
							this.aStringArray9[this.anInt886] = this.aStringArray10[local170] + " @whi@" + local40;
							@Pc(197) short local197 = 0;
							if (this.aStringArray10[local170].equalsIgnoreCase("attack")) {
								if (arg3.anInt305 > aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt305) {
									local197 = 2000;
								}
								if (aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt298 != 0 && arg3.anInt298 != 0) {
									if (aClass6_Sub1_Sub2_Sub3_Sub1_1.anInt298 == arg3.anInt298) {
										local197 = 2000;
									} else {
										local197 = 0;
									}
								}
							} else if (this.aBooleanArray11[local170]) {
								local197 = 2000;
							}
							if (local170 == 0) {
								this.anIntArray258[this.anInt886] = local197 + 264;
							}
							if (local170 == 1) {
								this.anIntArray258[this.anInt886] = local197 + 480;
							}
							if (local170 == 2) {
								this.anIntArray258[this.anInt886] = local197 + 651;
							}
							if (local170 == 3) {
								this.anIntArray258[this.anInt886] = local197 + 283;
							}
							if (local170 == 4) {
								this.anIntArray258[this.anInt886] = local197 + 716;
							}
							this.anIntArray259[this.anInt886] = arg2;
							this.anIntArray256[this.anInt886] = arg0;
							this.anIntArray257[this.anInt886] = arg1;
							this.anInt886++;
						}
					}
				} else if ((this.anInt1087 & 0x8) == 8) {
					this.aStringArray9[this.anInt886] = this.aString31 + " @whi@" + local40;
					this.anIntArray258[this.anInt886] = 822;
					this.anIntArray259[this.anInt886] = arg2;
					this.anIntArray256[this.anInt886] = arg0;
					this.anIntArray257[this.anInt886] = arg1;
					this.anInt886++;
				}
				for (local170 = 0; local170 < this.anInt886; local170++) {
					if (this.anIntArray258[local170] == 549) {
						this.aStringArray9[local170] = "Walk here @whi@" + local40;
						return;
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("57865, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -810 + ", " + arg3 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;BI)Lclient!ESUFCMYV;")
	private Class11 method725(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass14Array1[0] != null) {
					local9 = this.aClass14Array1[0].method117(arg0);
				}
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(40) int local40;
			if (local9 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local9);
				local40 = (int) this.aCRC32_2.getValue();
				if (local40 != arg4) {
					local9 = null;
				}
			}
			if (local9 != null) {
				return new Class11((byte) 6, local9);
			}
			local40 = 0;
			while (local9 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method587("Requesting " + arg1, arg2);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method631(arg3 + arg4);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class6_Sub1_Sub4 local101 = new Class6_Sub1_Sub4(local90, (byte) -17);
					local101.anInt704 = 3;
					@Pc(109) int local109 = local101.method415() + 6;
					@Pc(111) int local111 = 6;
					local9 = new byte[local109];
					for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
						local9[local116] = local90[local116];
					}
					@Pc(133) int local133;
					while (local111 < local109) {
						local133 = local109 - local111;
						if (local133 > 1000) {
							local133 = 1000;
						}
						@Pc(144) int local144 = local87.read(local9, local111, local133);
						if (local144 < 0) {
							(new StringBuffer("Length error: ")).append(local111).append("/").append(local109).toString();
							throw new IOException("EOF");
						}
						local111 += local144;
						@Pc(173) int local173 = local111 * 100 / local109;
						if (local173 != local76) {
							this.method587("Loading " + arg1 + " - " + local173 + "%", arg2);
						}
						local76 = local173;
					}
					local87.close();
					try {
						if (this.aClass14Array1[0] != null) {
							this.aClass14Array1[0].method118(local9.length, arg0, local9);
						}
					} catch (@Pc(218) Exception local218) {
						this.aClass14Array1[0] = null;
					}
					if (local9 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local9);
						local133 = (int) this.aCRC32_2.getValue();
						if (local133 != arg4) {
							local9 = null;
							local40++;
							local61 = "Checksum error: " + local133;
						}
					}
				} catch (@Pc(253) IOException local253) {
					if (local61.equals("Unknown error")) {
						local61 = "Connection error";
					}
					local9 = null;
				} catch (@Pc(263) NullPointerException local263) {
					local61 = "Null error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(272) ArrayIndexOutOfBoundsException local272) {
					local61 = "Bounds error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(281) Exception local281) {
					local61 = "Unexpected error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local9 == null) {
					for (local76 = local11; local76 > 0; local76--) {
						if (local40 >= 3) {
							this.method587("Game updated - please reload page", arg2);
							local76 = 10;
						} else {
							this.method587(local61 + " - Retrying in " + local76, arg2);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(325) Exception local325) {
						}
					}
					local11 *= 2;
					if (local11 > 60) {
						local11 = 60;
					}
					this.aBoolean256 = !this.aBoolean256;
				}
			}
			return new Class11((byte) 6, local9);
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("75791, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -83 + ", " + arg4 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QUBPQDMQ;Z)Z")
	private boolean method726(@OriginalArg(0) Class35 arg0) {
		try {
			this.aBoolean243 &= true;
			@Pc(10) int local10 = arg0.anInt682;
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
				this.aStringArray9[this.anInt886] = "Remove @whi@" + this.aStringArray14[local10];
				this.anIntArray258[this.anInt886] = 154;
				this.anInt886++;
				this.aStringArray9[this.anInt886] = "Message @whi@" + this.aStringArray14[local10];
				this.anIntArray258[this.anInt886] = 946;
				this.anInt886++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray9[this.anInt886] = "Remove @whi@" + arg0.aString11;
				this.anIntArray258[this.anInt886] = 837;
				this.anInt886++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("17492, " + arg0 + ", " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}
}
