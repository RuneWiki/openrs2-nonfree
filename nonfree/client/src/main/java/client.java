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

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private static int anInt873;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	public static int anInt887;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Z")
	private static boolean aBoolean191;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private static int anInt891;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!BPHJJPRI;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private static int anInt914;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private static int anInt922;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private static int anInt940;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private static int anInt944;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private static int anInt953;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private static int anInt958;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private static int anInt959;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Z")
	private static boolean aBoolean204;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private static int anInt967;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private static int anInt978;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private static int anInt985;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private static boolean aBoolean217;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Z")
	private static boolean aBoolean220;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private static int anInt1070;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private static int anInt1078;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private static int anInt1084;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
	public static int[] anIntArray212 = new int[32];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[[I")
	public static final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private static int anInt872;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private static int anInt886;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private static boolean aBoolean190;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private static int anInt901;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	private static int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "B")
	private static byte aByte27;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Ljava/lang/String;")
	private static String aString27;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "[I")
	public static final int[] anIntArray276;

	@OriginalMember(owner = "client!client", name = "H", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_4;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_5;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_6;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_7;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_8;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_9;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_10;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_11;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!TXNIKMNQ;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!FKUDHMAZ;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!HBJEXSJX;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_12;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_13;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_14;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_15;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_16;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_17;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_18;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_19;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_20;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!OUOWXDXZ;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!XQFIPMSR;")
	private Class12_Sub1 aClass12_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!FTIYCDAU;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Lclient!FTIYCDAU;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Lclient!FTIYCDAU;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Lclient!FTIYCDAU;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!SAMFSOGS;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_21;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_22;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_23;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_24;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1077;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1081;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1082;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1083;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_17;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_18;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_19;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_20;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1088;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1089;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_25;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_26;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "Lclient!YZGYDKDO;")
	private Class48 aClass48_27;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private int anInt1092;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1093;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1095;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Z")
	private volatile boolean aBoolean185 = false;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray213 = new int[200];

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "B")
	private byte aByte25 = -47;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt870 = -1;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt871 = 537;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!DMMTBJKZ;")
	private Class6 aClass6_10 = new Class6((byte) 5);

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[I")
	private int[] anIntArray214 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
	private int[] anIntArray215 = new int[500];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	private int[] anIntArray216 = new int[500];

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
	private int[] anIntArray217 = new int[500];

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
	private int[] anIntArray218 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private int[] anIntArray219 = new int[50];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
	private int[] anIntArray220 = new int[151];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt876 = 2;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt877 = 2301979;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt879 = 2;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt882 = -1;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt892 = 964;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[500];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt894 = -1;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
	private int[] anIntArray221 = new int[7];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
	private int[] anIntArray222 = new int[5];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt904 = 2048;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt905 = 2047;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[Lclient!BPHJJPRI;")
	private Class1_Sub1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub1_Sub2_Sub1Array1 = new Class1_Sub1_Sub1_Sub2_Sub1[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray223 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray224 = new int[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[Lclient!EYMNCFMK;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt904];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray226 = new int[33];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt911 = -1;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt912 = 5063219;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt917 = 39858;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Z")
	private boolean aBoolean197 = true;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!EYMNCFMK;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(new byte[5000], 0);

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[Lclient!KLQFDPHO;")
	private Class1_Sub1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub1_Sub2_Sub2Array1 = new Class1_Sub1_Sub1_Sub2_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray227 = new int[16384];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt930 = 50;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray232 = new int[this.anInt930];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
	private int[] anIntArray233 = new int[this.anInt930];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray234 = new int[this.anInt930];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray235 = new int[this.anInt930];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray236 = new int[this.anInt930];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray237 = new int[this.anInt930];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray238 = new int[this.anInt930];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[this.anInt930];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array3 = new Class1_Sub1_Sub2_Sub4[13];

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!EYMNCFMK;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = Class1_Sub1_Sub3.method143();

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[I")
	private int[] anIntArray239 = new int[5];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt941 = -1;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "B")
	private byte aByte26 = 39;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[I")
	private int[] anIntArray240 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	public int[] anIntArray241 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private final int anInt942 = 100;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
	private int[] anIntArray242 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	private int[] anIntArray247 = new int[100];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt949 = 6;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt954 = -1;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt957 = -391;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt960 = 7759444;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt962 = 510;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[I")
	private int[] anIntArray248 = new int[151];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt963 = 693;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt965 = 3;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray252 = new int[Class21.anInt509];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray253 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
	private int[] anIntArray254 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt971 = -2948;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array8 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[Lclient!ENNRILHF;")
	public Class8[] aClass8Array1 = new Class8[5];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray255 = new int[5];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt981 = 78;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt982 = -29787;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt984 = 6;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	private int[] anIntArray256 = new int[100];

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt990 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "B")
	private byte aByte28 = 47;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt996 = -1;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt998 = -1;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt999 = 128;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "B")
	private byte aByte29 = -47;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt1013 = 2;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt1014 = -1;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt1015 = -1;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt1016 = -903;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
	private int[] anIntArray259 = new int[Class21.anInt509];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
	private int[] anIntArray260 = new int[2000];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt1017 = 3353893;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!EYMNCFMK;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = Class1_Sub1_Sub3.method143();

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "B")
	private byte aByte30 = 88;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private final int[] anIntArray261 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[I")
	private int[] anIntArray262 = new int[50];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
	private int[] anIntArray263 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray264 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!EYMNCFMK;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9 = Class1_Sub1_Sub3.method143();

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1043 = 1;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1046 = -1;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
	private int[] anIntArray265 = new int[9];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!DMMTBJKZ;")
	private Class6 aClass6_11 = new Class6((byte) 5);

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1047 = 6;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array9 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private volatile boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
	private volatile boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1056 = -21200;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
	private int[] anIntArray266 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!DMMTBJKZ;")
	private Class6 aClass6_12 = new Class6((byte) 5);

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1058 = 6;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1065 = 46534;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1067 = 1;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[Lclient!EFVUNBHT;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array10 = new Class1_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1068 = -236;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[[[Lclient!DMMTBJKZ;")
	private Class6[][][] aClass6ArrayArrayArray1 = new Class6[4][104][104];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1069 = -1;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1071 = 520;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1072 = -1;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!VTUPBFSN;")
	private Class43 aClass43_1 = new Class43();

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1075 = 856;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
	private int[] anIntArray267 = new int[1000];

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
	private int[] anIntArray268 = new int[5];

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "[I")
	private int[] anIntArray269 = new int[5];

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "B")
	private byte aByte31 = 4;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray270 = new int[50];

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1080 = -1;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1085 = -1;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
	private int[] anIntArray273 = new int[256];

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1087 = 7;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
	private int[] anIntArray274 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[Lclient!ZGDLGUZR;")
	private Class50[] aClass50Array1 = new Class50[4];

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "[Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array4 = new Class1_Sub1_Sub2_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "[I")
	private int[] anIntArray275 = new int[Class21.anInt509];

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1090 = 2;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[Lclient!MRCVLIXG;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array5 = new Class1_Sub1_Sub2_Sub4[2];

	static {
		@Pc(4) int local4 = 2;
		@Pc(6) int local6;
		for (local6 = 0; local6 < 32; local6++) {
			anIntArray212[local6] = local4 - 1;
			local4 += local4;
		}
		anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt872 = -32457;
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt886 = 10;
		aBoolean190 = true;
		anInt901 = 313;
		anIntArray225 = new int[99];
		local4 = 0;
		for (local6 = 0; local6 < 99; local6++) {
			@Pc(306) int local306 = local6 + 1;
			@Pc(319) int local319 = (int) ((double) local306 + Math.pow(2.0D, (double) local306 / 7.0D) * 300.0D);
			local4 += local319;
			anIntArray225[local6] = local4 / 4;
		}
		aByte27 = 12;
		aString27 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArray276 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private static void method630() {
		try {
			Class9.aBoolean62 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean17 = false;
			aBoolean191 = false;
			Class29.aBoolean123 = false;
			Class44.aBoolean158 = false;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("80815, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 371);
			if (arg0.length == 5) {
				anInt886 = Integer.parseInt(arg0[0]);
				anInt887 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method714();
				} else if (arg0[2].equals("highmem")) {
					method630();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean190 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean190 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1098 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private static String method688(@OriginalArg(1) int arg0) {
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
			signlink.reporterror("20263, " + 1 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method694(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("78763, " + arg0 + ", " + -8 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
	private static void method714() {
		try {
			Class9.aBoolean62 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean17 = true;
			aBoolean191 = true;
			Class29.aBoolean123 = true;
			Class44.aBoolean158 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("13240, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	private static String method722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) int local10 = arg1 - arg0;
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
			signlink.reporterror("64160, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;BI)Lclient!HBJEXSJX;")
	private Class13 method589(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(13) byte[] local13 = null;
			@Pc(15) int local15 = 5;
			try {
				if (this.aClass8Array1[0] != null) {
					local13 = this.aClass8Array1[0].method137(arg2);
				}
			} catch (@Pc(30) Exception local30) {
			}
			@Pc(44) int local44;
			if (local13 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local13);
				local44 = (int) this.aCRC32_2.getValue();
				if (local44 != arg0) {
					local13 = null;
				}
			}
			if (local13 != null) {
				return new Class13(true, local13);
			}
			local44 = 0;
			while (local13 == null) {
				@Pc(65) String local65 = "Unknown error";
				this.method588(arg5, "Requesting " + arg3, (byte) 1);
				@Pc(80) int local80;
				try {
					local80 = 0;
					@Pc(91) DataInputStream local91 = this.method593(arg1 + arg0);
					@Pc(94) byte[] local94 = new byte[6];
					local91.readFully(local94, 0, 6);
					@Pc(105) Class1_Sub1_Sub3 local105 = new Class1_Sub1_Sub3(local94, 0);
					local105.anInt301 = 3;
					@Pc(113) int local113 = local105.method159() + 6;
					@Pc(115) int local115 = 6;
					local13 = new byte[local113];
					for (@Pc(120) int local120 = 0; local120 < 6; local120++) {
						local13[local120] = local94[local120];
					}
					@Pc(138) int local138;
					while (local115 < local113) {
						local138 = local113 - local115;
						if (local138 > 1000) {
							local138 = 1000;
						}
						@Pc(149) int local149 = local91.read(local13, local115, local138);
						if (local149 < 0) {
							(new StringBuffer("Length error: ")).append(local115).append("/").append(local113).toString();
							throw new IOException("EOF");
						}
						local115 += local149;
						@Pc(178) int local178 = local115 * 100 / local113;
						if (local178 != local80) {
							this.method588(arg5, "Loading " + arg3 + " - " + local178 + "%", (byte) 1);
						}
						local80 = local178;
					}
					local91.close();
					try {
						if (this.aClass8Array1[0] != null) {
							this.aClass8Array1[0].method138(local13.length, arg2, local13);
						}
					} catch (@Pc(223) Exception local223) {
						this.aClass8Array1[0] = null;
					}
					if (local13 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local13);
						local138 = (int) this.aCRC32_2.getValue();
						if (local138 != arg0) {
							local13 = null;
							local44++;
							local65 = "Checksum error: " + local138;
						}
					}
				} catch (@Pc(258) IOException local258) {
					if (local65.equals("Unknown error")) {
						local65 = "Connection error";
					}
					local13 = null;
				} catch (@Pc(268) NullPointerException local268) {
					local65 = "Null error";
					local13 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(277) ArrayIndexOutOfBoundsException local277) {
					local65 = "Bounds error";
					local13 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(286) Exception local286) {
					local65 = "Unexpected error";
					local13 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local13 == null) {
					for (local80 = local15; local80 > 0; local80--) {
						if (local44 >= 3) {
							this.method588(arg5, "Game updated - please reload page", (byte) 1);
							local80 = 10;
						} else {
							this.method588(arg5, local65 + " - Retrying in " + local80, (byte) 1);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(330) Exception local330) {
						}
					}
					local15 *= 2;
					if (local15 > 60) {
						local15 = 60;
					}
					this.aBoolean215 = !this.aBoolean215;
				}
			}
			return new Class13(true, local13);
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("95345, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method590() {
		try {
			this.method615();
			if (this.anInt1009 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array4[this.anInt1008 / 100].method129(this.anInt1006 - 8 - 4, this.anInt1007 - 8 - 4);
			}
			if (this.anInt1009 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array4[this.anInt1008 / 100 + 4].method129(this.anInt1006 - 8 - 4, this.anInt1007 - 8 - 4);
			}
			if (this.anInt996 != -1) {
				this.method648(this.anInt866, this.anInt996);
				this.method664(0, 0, 0, Class43.method515(this.anInt996), 726);
			}
			if (this.anInt998 != -1) {
				this.method648(this.anInt866, this.anInt998);
				this.method664(0, 0, 0, Class43.method515(this.anInt998), 726);
			}
			this.method684();
			if (!this.aBoolean225) {
				this.method675();
				this.method676(86);
			} else if (this.anInt1025 == 0) {
				this.method592();
			}
			if (this.anInt938 == 1) {
				this.aClass1_Sub1_Sub2_Sub2_10.method129(472, 296);
			}
			@Pc(173) int local173;
			if (aBoolean217) {
				@Pc(139) byte local139 = 20;
				@Pc(141) int local141 = 16776960;
				if (super.anInt843 < 30 && aBoolean191) {
					local141 = 16711680;
				}
				if (super.anInt843 < 20 && !aBoolean191) {
					local141 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method260("Fps:" + super.anInt843, 207, 20, local141);
				local173 = local139 + 15;
				@Pc(175) Runtime local175 = Runtime.getRuntime();
				@Pc(184) int local184 = (int) ((local175.totalMemory() - local175.freeMemory()) / 1024L);
				if (local184 > 33554432 && aBoolean191) {
				}
				if (local184 > 67108864 && !aBoolean191) {
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method260("Mem:" + local184 + "k", 207, 35, 16776960);
				local173 += 15;
			}
			if (this.anInt1023 != 0) {
				@Pc(225) int local225 = this.anInt1023 / 50;
				local173 = local225 / 60;
				@Pc(233) int local233 = local225 % 60;
				if (local233 < 10) {
					this.aClass1_Sub1_Sub2_Sub3_3.method265(4, 329, "System update in: " + local173 + ":0" + local233, 16776960);
				} else {
					this.aClass1_Sub1_Sub2_Sub3_3.method265(4, 329, "System update in: " + local173 + ":" + local233, 16776960);
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("37465, " + false + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method591() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray265[8] = 0;
			@Pc(20) int local20 = 0;
			while (this.anIntArray265[8] == 0) {
				@Pc(24) String local24 = "Unknown problem";
				this.method588(20, "Connecting to web server", (byte) 1);
				try {
					@Pc(46) DataInputStream local46 = this.method593("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 371);
					@Pc(53) Class1_Sub1_Sub3 local53 = new Class1_Sub1_Sub3(new byte[40], 0);
					local46.readFully(local53.aByteArray2, 0, 40);
					local46.close();
					for (@Pc(63) int local63 = 0; local63 < 9; local63++) {
						this.anIntArray265[local63] = local53.method160();
					}
					@Pc(78) int local78 = local53.method160();
					@Pc(80) int local80 = 1234;
					for (@Pc(82) int local82 = 0; local82 < 9; local82++) {
						local80 = (local80 << 1) + this.anIntArray265[local82];
					}
					if (local78 != local80) {
						local24 = "checksum problem";
						this.anIntArray265[8] = 0;
					}
				} catch (@Pc(109) EOFException local109) {
					local24 = "EOF problem";
					this.anIntArray265[8] = 0;
				} catch (@Pc(118) IOException local118) {
					local24 = "connection problem";
					this.anIntArray265[8] = 0;
				} catch (@Pc(127) Exception local127) {
					local24 = "logic problem";
					this.anIntArray265[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray265[8] == 0) {
					local20++;
					for (@Pc(145) int local145 = local3; local145 > 0; local145--) {
						if (local20 >= 10) {
							this.method588(10, "Game updated - please reload page", (byte) 1);
							local145 = 10;
						} else {
							this.method588(10, local24 + " - Will retry in " + local145 + " secs.", (byte) 1);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(179) Exception local179) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean215 = !this.aBoolean215;
				}
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("62950, " + 0 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method592() {
		try {
			@Pc(2) int local2 = this.anInt1026;
			@Pc(5) int local5 = this.anInt1027;
			@Pc(8) int local8 = this.anInt1028;
			@Pc(11) int local11 = this.anInt1029;
			Class1_Sub1_Sub2.method351(local2, local8, 6116423, local5, local11);
			Class1_Sub1_Sub2.method351(local2 + 1, local8 - 2, 0, local5 + 1, 16);
			Class1_Sub1_Sub2.method352(local8 - 2, 0, local2 + 1, local11 - 19, local5 + 18);
			this.aClass1_Sub1_Sub2_Sub3_4.method265(local2 + 3, local5 + 14, "Choose Option", 6116423);
			@Pc(67) int local67 = super.anInt848;
			@Pc(70) int local70 = super.anInt849;
			if (this.anInt1025 == 0) {
				local67 -= 4;
				local70 -= 4;
			}
			if (this.anInt1025 == 1) {
				local67 -= 553;
				local70 -= 205;
			}
			if (this.anInt1025 == 2) {
				local67 -= 17;
				local70 -= 357;
			}
			for (@Pc(89) int local89 = 0; local89 < this.anInt1054; local89++) {
				@Pc(104) int local104 = local5 + (this.anInt1054 - 1 - local89) * 15 + 31;
				@Pc(106) int local106 = 16777215;
				if (local67 > local2 && local67 < local2 + local8 && local70 > local104 - 13 && local70 < local104 + 3) {
					local106 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub3_4.method269(true, this.aStringArray9[local89], local104, local106, local2 + 3);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("66851, " + 114 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method593(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean215) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method671(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!VTUPBFSN;IIIIII)V")
	private void method594(@OriginalArg(0) int arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean186) {
				this.anInt979 = 32;
			} else {
				this.anInt979 = 0;
			}
			this.aBoolean186 = false;
			if (arg3 >= arg6 && arg3 < arg6 + 16 && arg2 >= arg0 && arg2 < arg0 + 16) {
				arg1.anInt738 -= this.anInt1088 * 4;
				if (arg4 == 1) {
					this.aBoolean200 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean194 = true;
				}
			} else if (arg3 >= arg6 && arg3 < arg6 + 16 && arg2 >= arg0 + arg7 - 16 && arg2 < arg0 + arg7) {
				arg1.anInt738 += this.anInt1088 * 4;
				if (arg4 == 1) {
					this.aBoolean200 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean194 = true;
				}
			} else if (arg3 >= arg6 - this.anInt979 && arg3 < arg6 + this.anInt979 + 16 && arg2 >= arg0 + 16 && arg2 < arg0 + arg7 - 16 && this.anInt1088 > 0) {
				@Pc(148) int local148 = (arg7 - 32) * arg7 / arg5;
				if (local148 < 8) {
					local148 = 8;
				}
				@Pc(163) int local163 = arg2 - arg0 - local148 / 2 - 16;
				@Pc(169) int local169 = arg7 - local148 - 32;
				arg1.anInt738 = (arg5 - arg7) * local163 / local169;
				if (arg4 == 1) {
					this.aBoolean200 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean194 = true;
				}
				this.aBoolean186 = true;
			}
		} catch (@Pc(198) RuntimeException local198) {
			signlink.reporterror("77896, " + arg0 + ", " + 76 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local198.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIILclient!BPHJJPRI;)V")
	private void method595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub2_Sub1 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub2_Sub1_1 && this.anInt1054 < 400) {
				@Pc(43) String local43;
				if (arg3.anInt178 == 0) {
					local43 = arg3.aString3 + method722(arg3.anInt189, aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt189) + " (level-" + arg3.anInt189 + ")";
				} else {
					local43 = arg3.aString3 + " (skill-" + arg3.anInt178 + ")";
				}
				@Pc(173) int local173;
				if (this.anInt862 == 1) {
					this.aStringArray9[this.anInt1054] = "Use " + this.aString18 + " with @whi@" + local43;
					this.anIntArray216[this.anInt1054] = 149;
					this.anIntArray217[this.anInt1054] = arg1;
					this.anIntArray214[this.anInt1054] = arg2;
					this.anIntArray215[this.anInt1054] = arg0;
					this.anInt1054++;
				} else if (this.anInt1091 != 1) {
					for (local173 = 4; local173 >= 0; local173--) {
						if (this.aStringArray8[local173] != null) {
							this.aStringArray9[this.anInt1054] = this.aStringArray8[local173] + " @whi@" + local43;
							@Pc(200) short local200 = 0;
							if (this.aStringArray8[local173].equalsIgnoreCase("attack")) {
								if (arg3.anInt189 > aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt189) {
									local200 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt193 != 0 && arg3.anInt193 != 0) {
									if (aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt193 == arg3.anInt193) {
										local200 = 2000;
									} else {
										local200 = 0;
									}
								}
							} else if (this.aBooleanArray11[local173]) {
								local200 = 2000;
							}
							if (local173 == 0) {
								this.anIntArray216[this.anInt1054] = local200 + 564;
							}
							if (local173 == 1) {
								this.anIntArray216[this.anInt1054] = local200 + 734;
							}
							if (local173 == 2) {
								this.anIntArray216[this.anInt1054] = local200 + 370;
							}
							if (local173 == 3) {
								this.anIntArray216[this.anInt1054] = local200 + 170;
							}
							if (local173 == 4) {
								this.anIntArray216[this.anInt1054] = local200 + 248;
							}
							this.anIntArray217[this.anInt1054] = arg1;
							this.anIntArray214[this.anInt1054] = arg2;
							this.anIntArray215[this.anInt1054] = arg0;
							this.anInt1054++;
						}
					}
				} else if ((this.anInt1093 & 0x8) == 8) {
					this.aStringArray9[this.anInt1054] = this.aString30 + " @whi@" + local43;
					this.anIntArray216[this.anInt1054] = 959;
					this.anIntArray217[this.anInt1054] = arg1;
					this.anIntArray214[this.anInt1054] = arg2;
					this.anIntArray215[this.anInt1054] = arg0;
					this.anInt1054++;
				}
				for (local173 = 0; local173 < this.anInt1054; local173++) {
					if (this.anIntArray216[local173] == 842) {
						this.aStringArray9[local173] = "Walk here @whi@" + local43;
						return;
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("97617, " + -45 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method596() {
		try {
			this.aBoolean218 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean185) {
					this.anInt1005++;
					this.method641();
					this.method641();
					this.method699();
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
			this.aBoolean218 = false;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("58383, " + 2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method597(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt988 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(18) String[] local18 = new String[100];
				@Pc(20) int local20 = 0;
				while (true) {
					@Pc(24) int local24 = local12.indexOf(" ");
					if (local24 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local18[local20++] = local12.toLowerCase();
						}
						this.anInt988 = 0;
						label49: for (local24 = 0; local24 < Class19.anInt497; local24++) {
							@Pc(73) Class19 local73 = Class19.method315(local24);
							if (local73.anInt484 == -1 && local73.aString7 != null) {
								@Pc(84) String local84 = local73.aString7.toLowerCase();
								for (@Pc(86) int local86 = 0; local86 < local20; local86++) {
									if (local84.indexOf(local18[local86]) == -1) {
										continue label49;
									}
								}
								this.aStringArray13[this.anInt988] = local84;
								this.anIntArray256[this.anInt988] = local24;
								this.anInt988++;
								if (this.anInt988 >= this.aStringArray13.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(33) String local33 = local12.substring(0, local24).trim();
					if (local33.length() > 0) {
						local18[local20++] = local33.toLowerCase();
					}
					local12 = local12.substring(local24 + 1);
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("26006, " + false + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBIII)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg3 >= 1 && arg7 >= 1 && arg3 <= 102 && arg7 <= 102) {
				if (aBoolean191 && arg0 != this.anInt918) {
					return;
				}
				@Pc(30) int local30 = 0;
				if (arg2 == 0) {
					local30 = this.aClass9_1.method221(arg0, arg3, arg7);
				}
				if (arg2 == 1) {
					local30 = this.aClass9_1.method222(arg7, arg3, arg0);
				}
				if (arg2 == 2) {
					local30 = this.aClass9_1.method223(arg0, arg3, arg7);
				}
				if (arg2 == 3) {
					local30 = this.aClass9_1.method224(arg0, arg3, arg7);
				}
				@Pc(86) int local86;
				if (local30 != 0) {
					local86 = this.aClass9_1.method225(arg0, arg3, arg7, local30);
					@Pc(92) int local92 = local30 >> 14 & 0x7FFF;
					@Pc(96) int local96 = local86 & 0x1F;
					@Pc(100) int local100 = local86 >> 6;
					@Pc(112) Class44 local112;
					if (arg2 == 0) {
						this.aClass9_1.method212(arg3, arg7, arg0);
						local112 = Class44.method519(local92);
						if (local112.aBoolean166) {
							this.aClass50Array1[arg0].method569(arg7, local96, local112.aBoolean168, (byte) 8, arg3, local100);
						}
					}
					if (arg2 == 1) {
						this.aClass9_1.method213(arg3, arg0, this.aBoolean188, arg7);
					}
					if (arg2 == 2) {
						this.aClass9_1.method214(arg7, arg0, arg3);
						local112 = Class44.method519(local92);
						if (arg3 + local112.anInt773 > 103 || arg7 + local112.anInt773 > 103 || arg3 + local112.anInt777 > 103 || arg7 + local112.anInt777 > 103) {
							return;
						}
						if (local112.aBoolean166) {
							this.aClass50Array1[arg0].method570(local112.aBoolean168, local112.anInt777, local100, arg3, local112.anInt773, arg7);
						}
					}
					if (arg2 == 3) {
						this.aClass9_1.method215(arg0, arg7, arg3);
						local112 = Class44.method519(local92);
						if (local112.aBoolean166 && local112.aBoolean163) {
							this.aClass50Array1[arg0].method572(arg7, arg3);
						}
					}
				}
				if (arg1 >= 0) {
					local86 = arg0;
					if (arg0 < 3 && (this.aByteArrayArrayArray8[1][arg3][arg7] & 0x2) == 2) {
						local86 = arg0 + 1;
					}
					Class29.method435(this.anIntArrayArrayArray8, this.aClass9_1, arg1, local86, arg5, this.aClass50Array1[arg0], arg7, arg3, arg0, arg6);
					return;
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("28847, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method599() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1005);
			if (this.aClass12_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass12_Sub1_1.anInt810);
			}
			System.out.println("loop-cycle:" + anInt1079);
			System.out.println("draw-cycle:" + anInt944);
			System.out.println("ptype:" + this.anInt992);
			System.out.println("psize:" + this.anInt991);
			if (this.aClass33_1 != null) {
				this.aClass33_1.method488();
			}
			super.aBoolean181 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("92939, " + 1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method586() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("68326, " + -5092 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method600() {
		try {
			if (this.anInt966 == 2) {
				this.method614((this.anInt932 - this.anInt946 << 7) + this.anInt935, (this.anInt931 - this.anInt945 << 7) + this.anInt934, this.anInt933 * 2);
				if (this.anInt1014 > -1 && anInt1079 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array10[0].method129(this.anInt1014 - 12, this.anInt1015 - 28);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("75036, " + 8 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method601() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt920; local1++) {
				@Pc(8) int local8 = this.anIntArray227[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub2_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local8];
				if (local13 != null) {
					this.method602(local13.aClass31_2.aByte18, local13, 820);
				}
			}
			if (this.anInt984 != 6) {
				this.anInt992 = -1;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("59336, " + 6 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CUSCNWAC;I)V")
	private void method602(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1.anInt428 < 128 || arg1.anInt429 < 128 || arg1.anInt428 >= 13184 || arg1.anInt429 >= 13184) {
				arg1.anInt451 = -1;
				arg1.anInt422 = -1;
				arg1.anInt443 = 0;
				arg1.anInt444 = 0;
				arg1.anInt428 = arg1.anIntArray72[0] * 128 + arg1.anInt448 * 64;
				arg1.anInt429 = arg1.anIntArray73[0] * 128 + arg1.anInt448 * 64;
				arg1.method300();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub2_Sub1_1 && (arg1.anInt428 < 1536 || arg1.anInt429 < 1536 || arg1.anInt428 >= 11776 || arg1.anInt429 >= 11776)) {
				arg1.anInt451 = -1;
				arg1.anInt422 = -1;
				arg1.anInt443 = 0;
				arg1.anInt444 = 0;
				arg1.anInt428 = arg1.anIntArray72[0] * 128 + arg1.anInt448 * 64;
				arg1.anInt429 = arg1.anIntArray73[0] * 128 + arg1.anInt448 * 64;
				arg1.method300();
			}
			if (arg1.anInt443 > anInt1079) {
				this.method603(arg1);
			} else if (arg1.anInt444 >= anInt1079) {
				this.method604(arg1);
			} else {
				this.method605(arg1);
			}
			this.method606(arg1);
			@Pc(150) boolean local150 = false;
			this.method607(arg1);
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("39088, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CUSCNWAC;B)V")
	private void method603(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt443 - anInt1079;
			@Pc(14) int local14 = arg0.anInt439 * 128 + arg0.anInt448 * 64;
			@Pc(24) int local24 = arg0.anInt441 * 128 + arg0.anInt448 * 64;
			arg0.anInt428 += (local14 - arg0.anInt428) / local4;
			arg0.anInt429 += (local24 - arg0.anInt429) / local4;
			arg0.anInt447 = 0;
			if (arg0.anInt445 == 0) {
				arg0.anInt446 = 1024;
			}
			if (arg0.anInt445 == 1) {
				arg0.anInt446 = 1536;
			}
			if (arg0.anInt445 == 2) {
				arg0.anInt446 = 0;
			}
			if (arg0.anInt445 == 3) {
				arg0.anInt446 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("8292, " + arg0 + ", " + 9 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!CUSCNWAC;B)V")
	private void method604(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			if (this.aByte26 != 39) {
				this.anInt982 = -137;
			}
			if (arg0.anInt444 == anInt1079 || arg0.anInt451 == -1 || arg0.anInt454 != 0 || arg0.anInt453 + 1 > Class7.aClass7Array1[arg0.anInt451].method103((byte) 6, arg0.anInt452)) {
				@Pc(36) int local36 = arg0.anInt444 - arg0.anInt443;
				@Pc(41) int local41 = anInt1079 - arg0.anInt443;
				@Pc(51) int local51 = arg0.anInt439 * 128 + arg0.anInt448 * 64;
				@Pc(61) int local61 = arg0.anInt441 * 128 + arg0.anInt448 * 64;
				@Pc(71) int local71 = arg0.anInt440 * 128 + arg0.anInt448 * 64;
				@Pc(81) int local81 = arg0.anInt442 * 128 + arg0.anInt448 * 64;
				arg0.anInt428 = (local51 * (local36 - local41) + local71 * local41) / local36;
				arg0.anInt429 = (local61 * (local36 - local41) + local81 * local41) / local36;
			}
			arg0.anInt447 = 0;
			if (arg0.anInt445 == 0) {
				arg0.anInt446 = 1024;
			}
			if (arg0.anInt445 == 1) {
				arg0.anInt446 = 1536;
			}
			if (arg0.anInt445 == 2) {
				arg0.anInt446 = 0;
			}
			if (arg0.anInt445 == 3) {
				arg0.anInt446 = 512;
			}
			arg0.anInt430 = arg0.anInt446;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("79115, " + arg0 + ", " + 39 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!CUSCNWAC;)V")
	private void method605(@OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.anInt463 = arg0.anInt461;
			if (arg0.anInt427 == 0) {
				arg0.anInt447 = 0;
			} else {
				if (arg0.anInt451 != -1 && arg0.anInt454 == 0) {
					@Pc(24) Class7 local24 = Class7.aClass7Array1[arg0.anInt451];
					if (arg0.anInt458 > 0 && local24.anInt243 == 0) {
						arg0.anInt447++;
						return;
					}
					if (arg0.anInt458 <= 0 && local24.anInt244 == 0) {
						arg0.anInt447++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt428;
				@Pc(56) int local56 = arg0.anInt429;
				@Pc(71) int local71 = arg0.anIntArray72[arg0.anInt427 - 1] * 128 + arg0.anInt448 * 64;
				@Pc(86) int local86 = arg0.anIntArray73[arg0.anInt427 - 1] * 128 + arg0.anInt448 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt446 = 1280;
						} else if (local56 > local86) {
							arg0.anInt446 = 1792;
						} else {
							arg0.anInt446 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt446 = 768;
						} else if (local56 > local86) {
							arg0.anInt446 = 256;
						} else {
							arg0.anInt446 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt446 = 1024;
					} else {
						arg0.anInt446 = 0;
					}
					@Pc(180) int local180 = arg0.anInt446 - arg0.anInt430 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt433;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt432;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt435;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt434;
					}
					if (local187 == -1) {
						local187 = arg0.anInt432;
					}
					arg0.anInt463 = local187;
					@Pc(229) int local229 = 4;
					if (arg0.anInt430 != arg0.anInt446 && arg0.anInt459 == -1 && arg0.anInt460 != 0) {
						local229 = 2;
					}
					if (arg0.anInt427 > 2) {
						local229 = 6;
					}
					if (arg0.anInt427 > 3) {
						local229 = 8;
					}
					if (arg0.anInt447 > 0 && arg0.anInt427 > 1) {
						local229 = 8;
						arg0.anInt447--;
					}
					if (arg0.aBooleanArray6[arg0.anInt427 - 1]) {
						local229 <<= 0x1;
					}
					if (local229 >= 8 && arg0.anInt463 == arg0.anInt432 && arg0.anInt456 != -1) {
						arg0.anInt463 = arg0.anInt456;
					}
					if (local53 < local71) {
						arg0.anInt428 += local229;
						if (arg0.anInt428 > local71) {
							arg0.anInt428 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt428 -= local229;
						if (arg0.anInt428 < local71) {
							arg0.anInt428 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt429 += local229;
						if (arg0.anInt429 > local86) {
							arg0.anInt429 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt429 -= local229;
						if (arg0.anInt429 < local86) {
							arg0.anInt429 = local86;
						}
					}
					if (arg0.anInt428 == local71 && arg0.anInt429 == local86) {
						arg0.anInt427--;
						if (arg0.anInt458 > 0) {
							arg0.anInt458--;
							return;
						}
					}
				} else {
					arg0.anInt428 = local71;
					arg0.anInt429 = local86;
				}
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("73737, " + false + ", " + arg0 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!CUSCNWAC;)V")
	private void method606(@OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			if (arg0.anInt460 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt459 != -1 && arg0.anInt459 < 32768) {
					@Pc(25) Class1_Sub1_Sub1_Sub2_Sub2 local25 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[arg0.anInt459];
					if (local25 != null) {
						local33 = arg0.anInt428 - local25.anInt428;
						local39 = arg0.anInt429 - local25.anInt429;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt446 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt459 >= 32768) {
					local64 = arg0.anInt459 - 32768;
					if (local64 == this.anInt1046) {
						local64 = this.anInt905;
					}
					@Pc(76) Class1_Sub1_Sub1_Sub2_Sub1 local76 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt428 - local76.anInt428;
						@Pc(90) int local90 = arg0.anInt429 - local76.anInt429;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt446 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt466 != 0 || arg0.anInt467 != 0) && (arg0.anInt427 == 0 || arg0.anInt447 > 0)) {
					local64 = arg0.anInt428 - (arg0.anInt466 - this.anInt945 - this.anInt945) * 64;
					local33 = arg0.anInt429 - (arg0.anInt467 - this.anInt946 - this.anInt946) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt446 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt466 = 0;
					arg0.anInt467 = 0;
				}
				local64 = arg0.anInt446 - arg0.anInt430 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt460 || local64 > 2048 - arg0.anInt460) {
						arg0.anInt430 = arg0.anInt446;
					} else if (local64 > 1024) {
						arg0.anInt430 -= arg0.anInt460;
					} else {
						arg0.anInt430 += arg0.anInt460;
					}
					arg0.anInt430 &= 0x7FF;
					if (arg0.anInt463 == arg0.anInt461 && arg0.anInt430 != arg0.anInt446) {
						if (arg0.anInt462 != -1) {
							arg0.anInt463 = arg0.anInt462;
							return;
						}
						arg0.anInt463 = arg0.anInt432;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("36849, " + 4 + ", " + arg0 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!CUSCNWAC;)V")
	private void method607(@OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.aBoolean79 = false;
			@Pc(14) Class7 local14;
			if (arg0.anInt463 != -1) {
				local14 = Class7.aClass7Array1[arg0.anInt463];
				arg0.anInt465++;
				if (arg0.anInt464 < local14.anInt237 && arg0.anInt465 > local14.method103((byte) 6, arg0.anInt464)) {
					arg0.anInt465 = 1;
					arg0.anInt464++;
				}
				if (arg0.anInt464 >= local14.anInt237) {
					arg0.anInt465 = 1;
					arg0.anInt464 = 0;
				}
			}
			if (arg0.anInt422 != -1 && anInt1079 >= arg0.anInt425) {
				if (arg0.anInt423 < 0) {
					arg0.anInt423 = 0;
				}
				local14 = Class46.aClass46Array1[arg0.anInt422].aClass7_2;
				arg0.anInt424++;
				if (arg0.anInt423 < local14.anInt237 && arg0.anInt424 > local14.method103((byte) 6, arg0.anInt423)) {
					arg0.anInt424 = 1;
					arg0.anInt423++;
				}
				if (arg0.anInt423 >= local14.anInt237 && (arg0.anInt423 < 0 || arg0.anInt423 >= local14.anInt237)) {
					arg0.anInt422 = -1;
				}
			}
			if (arg0.anInt451 != -1 && arg0.anInt454 <= 1) {
				local14 = Class7.aClass7Array1[arg0.anInt451];
				if (local14.anInt243 == 1 && arg0.anInt458 > 0 && arg0.anInt443 <= anInt1079 && arg0.anInt444 < anInt1079) {
					arg0.anInt454 = 1;
					return;
				}
			}
			if (arg0.anInt451 != -1 && arg0.anInt454 == 0) {
				local14 = Class7.aClass7Array1[arg0.anInt451];
				arg0.anInt453++;
				if (arg0.anInt452 < local14.anInt237 && arg0.anInt453 > local14.method103((byte) 6, arg0.anInt452)) {
					arg0.anInt453 = 1;
					arg0.anInt452++;
				}
				if (arg0.anInt452 >= local14.anInt237) {
					arg0.anInt452 -= local14.anInt238;
					arg0.anInt455++;
					if (arg0.anInt455 >= local14.anInt242) {
						arg0.anInt451 = -1;
					}
					if (arg0.anInt452 < 0 || arg0.anInt452 >= local14.anInt237) {
						arg0.anInt451 = -1;
					}
				}
				arg0.aBoolean79 = local14.aBoolean40;
			}
			if (arg0.anInt454 > 0) {
				arg0.anInt454--;
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("43933, " + false + ", " + arg0 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method608() {
		try {
			if (this.anInt1085 == -1 || this.anInt928 != 2 && super.aClass48_2 == null) {
				if (this.aBoolean184) {
					this.method646((byte) 9);
					this.aBoolean184 = false;
					this.aClass48_3.method556(super.aGraphics2, 4, 904, 0);
					this.aClass48_4.method556(super.aGraphics2, 357, 904, 0);
					this.aClass48_5.method556(super.aGraphics2, 4, 904, 722);
					this.aClass48_6.method556(super.aGraphics2, 205, 904, 743);
					this.aClass48_7.method556(super.aGraphics2, 0, 904, 0);
					this.aClass48_8.method556(super.aGraphics2, 4, 904, 516);
					this.aClass48_9.method556(super.aGraphics2, 205, 904, 516);
					this.aClass48_10.method556(super.aGraphics2, 357, 904, 496);
					this.aClass48_11.method556(super.aGraphics2, 338, 904, 0);
					this.aBoolean200 = true;
					this.aBoolean194 = true;
					this.aBoolean192 = true;
					this.aBoolean206 = true;
					if (this.anInt928 != 2) {
						this.aClass48_23.method556(super.aGraphics2, 4, 904, 4);
						this.aClass48_22.method556(super.aGraphics2, 4, 904, 550);
					}
				}
				if (this.anInt928 == 2) {
					this.method666();
				}
				if (this.aBoolean225 && this.anInt1025 == 1) {
					this.aBoolean200 = true;
				}
				@Pc(277) boolean local277;
				if (this.anInt954 != -1) {
					local277 = this.method648(this.anInt866, this.anInt954);
					if (local277) {
						this.aBoolean200 = true;
					}
				}
				if (this.anInt1033 == 2) {
					this.aBoolean200 = true;
				}
				if (this.anInt975 == 2) {
					this.aBoolean200 = true;
				}
				if (this.aBoolean200) {
					this.method680((byte) 5);
					this.aBoolean200 = false;
				}
				@Pc(362) int local362;
				if (this.anInt911 == -1 && this.anInt1041 == 0) {
					this.aClass43_1.anInt738 = this.anInt981 - this.anInt910 - 77;
					if (super.anInt848 > 448 && super.anInt848 < 560 && super.anInt849 > 332) {
						this.method594(0, this.aClass43_1, super.anInt849 - 357, super.anInt848 - 17, -1, this.anInt981, 463, 77);
					}
					local362 = this.anInt981 - this.aClass43_1.anInt738 - 77;
					if (local362 < 0) {
						local362 = 0;
					}
					if (local362 > this.anInt981 - 77) {
						local362 = this.anInt981 - 77;
					}
					if (this.anInt910 != local362) {
						this.anInt910 = local362;
						this.aBoolean194 = true;
					}
					anInt873++;
					if (anInt873 > 93) {
						anInt873 = 0;
						this.aClass1_Sub1_Sub3_7.method144(158);
					}
				}
				if (this.anInt911 == -1 && this.anInt1041 == 3) {
					local362 = this.anInt988 * 14 + 7;
					this.aClass43_1.anInt738 = this.anInt989;
					if (super.anInt848 > 448 && super.anInt848 < 560 && super.anInt849 > 332) {
						this.method594(0, this.aClass43_1, super.anInt849 - 357, super.anInt848 - 17, -1, local362, 463, 77);
					}
					@Pc(455) int local455 = this.aClass43_1.anInt738;
					if (local455 < 0) {
						local455 = 0;
					}
					if (local455 > local362 - 77) {
						local455 = local362 - 77;
					}
					if (this.anInt989 != local455) {
						this.anInt989 = local455;
						this.aBoolean194 = true;
					}
				}
				if (this.anInt911 != -1) {
					local277 = this.method648(this.anInt866, this.anInt911);
					if (local277) {
						this.aBoolean194 = true;
					}
				}
				if (this.anInt1033 == 3) {
					this.aBoolean194 = true;
				}
				if (this.anInt975 == 3) {
					this.aBoolean194 = true;
				}
				if (this.aString17 != null) {
					this.aBoolean194 = true;
				}
				if (this.aBoolean225 && this.anInt1025 == 2) {
					this.aBoolean194 = true;
				}
				if (this.aBoolean194) {
					this.method629();
					this.aBoolean194 = false;
				}
				if (this.anInt928 == 2) {
					this.method718();
					this.aClass48_22.method556(super.aGraphics2, 4, 904, 550);
				}
				if (this.anInt894 != -1) {
					this.aBoolean192 = true;
				}
				if (this.aBoolean192) {
					if (this.anInt894 != -1 && this.anInt894 == this.anInt965) {
						this.anInt894 = -1;
						this.aClass1_Sub1_Sub3_7.method144(26);
						this.aClass1_Sub1_Sub3_7.method145(this.anInt965);
					}
					this.aBoolean192 = false;
					this.aClass48_27.method555();
					this.aClass1_Sub1_Sub2_Sub4_3.method363(0, 0);
					if (this.anInt954 == -1) {
						if (this.anIntArray274[this.anInt965] != -1) {
							if (this.anInt965 == 0) {
								this.aClass1_Sub1_Sub2_Sub4_16.method363(22, 10);
							}
							if (this.anInt965 == 1) {
								this.aClass1_Sub1_Sub2_Sub4_17.method363(54, 8);
							}
							if (this.anInt965 == 2) {
								this.aClass1_Sub1_Sub2_Sub4_17.method363(82, 8);
							}
							if (this.anInt965 == 3) {
								this.aClass1_Sub1_Sub2_Sub4_18.method363(110, 8);
							}
							if (this.anInt965 == 4) {
								this.aClass1_Sub1_Sub2_Sub4_20.method363(153, 8);
							}
							if (this.anInt965 == 5) {
								this.aClass1_Sub1_Sub2_Sub4_20.method363(181, 8);
							}
							if (this.anInt965 == 6) {
								this.aClass1_Sub1_Sub2_Sub4_19.method363(209, 9);
							}
						}
						if (this.anIntArray274[0] != -1 && (this.anInt894 != 0 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[0].method363(29, 13);
						}
						if (this.anIntArray274[1] != -1 && (this.anInt894 != 1 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[1].method363(53, 11);
						}
						if (this.anIntArray274[2] != -1 && (this.anInt894 != 2 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[2].method363(82, 11);
						}
						if (this.anIntArray274[3] != -1 && (this.anInt894 != 3 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[3].method363(115, 12);
						}
						if (this.anIntArray274[4] != -1 && (this.anInt894 != 4 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[4].method363(153, 13);
						}
						if (this.anIntArray274[5] != -1 && (this.anInt894 != 5 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[5].method363(180, 11);
						}
						if (this.anIntArray274[6] != -1 && (this.anInt894 != 6 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[6].method363(208, 13);
						}
					}
					this.aClass48_27.method556(super.aGraphics2, 160, 904, 516);
					this.aClass48_26.method555();
					this.aClass1_Sub1_Sub2_Sub4_2.method363(0, 0);
					if (this.anInt954 == -1) {
						if (this.anIntArray274[this.anInt965] != -1) {
							if (this.anInt965 == 7) {
								this.aClass1_Sub1_Sub2_Sub4_4.method363(42, 0);
							}
							if (this.anInt965 == 8) {
								this.aClass1_Sub1_Sub2_Sub4_5.method363(74, 0);
							}
							if (this.anInt965 == 9) {
								this.aClass1_Sub1_Sub2_Sub4_5.method363(102, 0);
							}
							if (this.anInt965 == 10) {
								this.aClass1_Sub1_Sub2_Sub4_6.method363(130, 1);
							}
							if (this.anInt965 == 11) {
								this.aClass1_Sub1_Sub2_Sub4_8.method363(173, 0);
							}
							if (this.anInt965 == 12) {
								this.aClass1_Sub1_Sub2_Sub4_8.method363(201, 0);
							}
							if (this.anInt965 == 13) {
								this.aClass1_Sub1_Sub2_Sub4_7.method363(229, 0);
							}
						}
						if (this.anIntArray274[8] != -1 && (this.anInt894 != 8 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[7].method363(74, 2);
						}
						if (this.anIntArray274[9] != -1 && (this.anInt894 != 9 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[8].method363(102, 3);
						}
						if (this.anIntArray274[10] != -1 && (this.anInt894 != 10 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[9].method363(137, 4);
						}
						if (this.anIntArray274[11] != -1 && (this.anInt894 != 11 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[10].method363(174, 2);
						}
						if (this.anIntArray274[12] != -1 && (this.anInt894 != 12 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[11].method363(201, 2);
						}
						if (this.anIntArray274[13] != -1 && (this.anInt894 != 13 || anInt1079 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array3[12].method363(226, 2);
						}
					}
					this.aClass48_26.method556(super.aGraphics2, 466, 904, 496);
					this.aClass48_23.method555();
					Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
				}
				if (this.aBoolean206) {
					this.aBoolean206 = false;
					this.aClass48_25.method555();
					this.aClass1_Sub1_Sub2_Sub4_1.method363(0, 0);
					this.aClass1_Sub1_Sub2_Sub3_3.method262(16777215, true, 28, 55, "Public chat");
					if (this.anInt888 == 0) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(65280, true, 41, 55, "On");
					}
					if (this.anInt888 == 1) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(16776960, true, 41, 55, "Friends");
					}
					if (this.anInt888 == 2) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(16711680, true, 41, 55, "Off");
					}
					if (this.anInt888 == 3) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(65535, true, 41, 55, "Hide");
					}
					this.aClass1_Sub1_Sub2_Sub3_3.method262(16777215, true, 28, 184, "Private chat");
					if (this.anInt1074 == 0) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(65280, true, 41, 184, "On");
					}
					if (this.anInt1074 == 1) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(16776960, true, 41, 184, "Friends");
					}
					if (this.anInt1074 == 2) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(16711680, true, 41, 184, "Off");
					}
					this.aClass1_Sub1_Sub2_Sub3_3.method262(16777215, true, 28, 324, "Trade/compete");
					if (this.anInt961 == 0) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(65280, true, 41, 324, "On");
					}
					if (this.anInt961 == 1) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(16776960, true, 41, 324, "Friends");
					}
					if (this.anInt961 == 2) {
						this.aClass1_Sub1_Sub2_Sub3_3.method262(16711680, true, 41, 324, "Off");
					}
					this.aClass1_Sub1_Sub2_Sub3_3.method262(16777215, true, 33, 458, "Report abuse");
					this.aClass48_25.method556(super.aGraphics2, 453, 904, 0);
					this.aClass48_23.method555();
					Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
				}
				this.anInt866 = 0;
			} else {
				if (this.anInt928 == 2) {
					this.method648(this.anInt866, this.anInt1085);
					if (this.anInt882 != -1) {
						this.method648(this.anInt866, this.anInt882);
					}
					this.anInt866 = 0;
					this.method636();
					super.aClass48_2.method555();
					Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray246;
					Class1_Sub1_Sub2.method349(468);
					this.aBoolean184 = true;
					@Pc(56) Class43 local56 = Class43.method515(this.anInt1085);
					if (local56.anInt742 == 512 && local56.anInt727 == 334 && local56.anInt759 == 0) {
						local56.anInt742 = 765;
						local56.anInt727 = 503;
					}
					this.method664(0, 0, 0, local56, 726);
					if (this.anInt882 != -1) {
						local56 = Class43.method515(this.anInt882);
						if (local56.anInt742 == 512 && local56.anInt727 == 334 && local56.anInt759 == 0) {
							local56.anInt742 = 765;
							local56.anInt727 = 503;
						}
						this.method664(0, 0, 0, local56, 726);
					}
					if (this.aBoolean225) {
						this.method592();
					} else {
						this.method675();
						this.method676(86);
					}
				}
				super.aClass48_2.method556(super.aGraphics2, 0, 904, 0);
			}
		} catch (@Pc(1292) RuntimeException local1292) {
			signlink.reporterror("94457, " + 6 + ", " + local1292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)Z")
	private boolean method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass9_1.method225(this.anInt918, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(31) int local31 = local16 & 0x1F;
			@Pc(37) int local37 = local16 >> 6 & 0x3;
			if (local31 == 10 || local31 == 11 || local31 == 22) {
				@Pc(49) Class44 local49 = Class44.method519(local7);
				@Pc(57) int local57;
				@Pc(60) int local60;
				if (local37 == 0 || local37 == 2) {
					local57 = local49.anInt773;
					local60 = local49.anInt777;
				} else {
					local57 = local49.anInt777;
					local60 = local49.anInt773;
				}
				@Pc(71) int local71 = local49.anInt771;
				if (local37 != 0) {
					local71 = (local71 << local37 & 0xF) + (local71 >> 4 - local37);
				}
				this.method695(local57, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, local60, 0, arg2, 0, local71, this.anInt1090, arg1, true, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
			} else {
				this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 0, local37, arg2, local31 + 1, 0, this.anInt1090, arg1, true, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
			}
			this.anInt1006 = super.anInt854;
			this.anInt1007 = super.anInt855;
			this.anInt1009 = 2;
			this.anInt1008 = 0;
			return true;
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("53747, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method610(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class43 local2 = Class43.method515(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray184.length && local2.anIntArray184[local4] != -1; local4++) {
				@Pc(18) Class43 local18 = Class43.method515(local2.anIntArray184[local4]);
				if (local18.anInt759 == 1) {
					this.method610(local18.anInt755);
				}
				local18.anInt749 = 0;
				local18.anInt736 = 0;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("89336, " + -41851 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6 local9 = this.aClass6ArrayArrayArray1[this.anInt918][arg0][arg1];
		if (local9 == null) {
			this.aClass9_1.method216(this.anInt918, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub6 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub6 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub6) local9.method97(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub6) local9.method99(569)) {
			@Pc(32) Class19 local32 = Class19.method315(local27.anInt719);
			@Pc(35) int local35 = local32.anInt482;
			if (local32.aBoolean83) {
				local35 *= local27.anInt717 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method95(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub6 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub6 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub6) local9.method97(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub6) local9.method99(569)) {
			if (local27.anInt719 != local23.anInt719 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt719 != local23.anInt719 && local27.anInt719 != local65.anInt719 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass9_1.method202(this.anInt918, local110, local23, local65, local67, arg0, arg1, this.method719(this.anInt918, arg0 * 128 + 64, arg1 * 128 + 64));
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method612() {
		try {
			if (this.anInt1023 > 1) {
				this.anInt1023--;
			}
			if (this.anInt995 > 0) {
				this.anInt995--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method703(this.anInt962); local22++) {
			}
			if (this.aBoolean216) {
				@Pc(42) Object local42 = this.aClass26_1.anObject1;
				@Pc(67) int local67;
				@Pc(69) int local69;
				@Pc(71) int local71;
				@Pc(104) int local104;
				synchronized (this.aClass26_1.anObject1) {
					if (!aBoolean220) {
						this.aClass26_1.anInt614 = 0;
					} else if (super.anInt853 != 0 || this.aClass26_1.anInt614 >= 40) {
						this.aClass1_Sub1_Sub3_7.method144(19);
						this.aClass1_Sub1_Sub3_7.method145(0);
						local67 = this.aClass1_Sub1_Sub3_7.anInt301;
						local69 = 0;
						@Pc(87) int local87;
						for (local71 = 0; local71 < this.aClass26_1.anInt614 && local67 - this.aClass1_Sub1_Sub3_7.anInt301 < 240; local71++) {
							local69++;
							local87 = this.aClass26_1.anIntArray131[local71];
							if (local87 < 0) {
								local87 = 0;
							} else if (local87 > 502) {
								local87 = 502;
							}
							local104 = this.aClass26_1.anIntArray130[local71];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > 764) {
								local104 = 764;
							}
							@Pc(121) int local121 = local87 * 765 + local104;
							if (this.aClass26_1.anIntArray131[local71] == -1 && this.aClass26_1.anIntArray130[local71] == -1) {
								local104 = -1;
								local87 = -1;
								local121 = 524287;
							}
							if (local104 != this.anInt955 || local87 != this.anInt956) {
								@Pc(166) int local166 = local104 - this.anInt955;
								this.anInt955 = local104;
								@Pc(174) int local174 = local87 - this.anInt956;
								this.anInt956 = local87;
								if (this.anInt1011 < 8 && local166 >= -32 && local166 <= 31 && local174 >= -32 && local174 <= 31) {
									local166 += 32;
									local174 += 32;
									this.aClass1_Sub1_Sub3_7.method146((this.anInt1011 << 12) + (local166 << 6) + local174);
									this.anInt1011 = 0;
								} else if (this.anInt1011 < 8) {
									this.aClass1_Sub1_Sub3_7.method148((this.anInt1011 << 19) + local121 + 8388608);
									this.anInt1011 = 0;
								} else {
									this.aClass1_Sub1_Sub3_7.method149((this.anInt1011 << 19) + local121 - 1073741824);
									this.anInt1011 = 0;
								}
							} else if (this.anInt1011 < 2047) {
								this.anInt1011++;
							}
						}
						this.aClass1_Sub1_Sub3_7.method154(this.aClass1_Sub1_Sub3_7.anInt301 - local67);
						if (local69 >= this.aClass26_1.anInt614) {
							this.aClass26_1.anInt614 = 0;
						} else {
							this.aClass26_1.anInt614 -= local69;
							for (local87 = 0; local87 < this.aClass26_1.anInt614; local87++) {
								this.aClass26_1.anIntArray130[local87] = this.aClass26_1.anIntArray130[local87 + local69];
								this.aClass26_1.anIntArray131[local87] = this.aClass26_1.anIntArray131[local87 + local69];
							}
						}
					}
				}
				if (super.anInt853 != 0) {
					@Pc(337) long local337 = (super.aLong28 - this.aLong30) / 50L;
					if (local337 > 4095L) {
						local337 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local67 = super.anInt855;
					if (local67 < 0) {
						local67 = 0;
					} else if (local67 > 502) {
						local67 = 502;
					}
					local69 = super.anInt854;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 764) {
						local69 = 764;
					}
					local71 = local67 * 765 + local69;
					@Pc(383) byte local383 = 0;
					if (super.anInt853 == 2) {
						local383 = 1;
					}
					local104 = (int) local337;
					this.aClass1_Sub1_Sub3_7.method144(204);
					this.aClass1_Sub1_Sub3_7.method189((local104 << 20) + (local383 << 19) + local71);
				}
				if (this.anInt927 > 0) {
					this.anInt927--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean198 = true;
				}
				if (this.aBoolean198 && this.anInt927 <= 0) {
					this.anInt927 = 20;
					this.aBoolean198 = false;
					this.aClass1_Sub1_Sub3_7.method144(176);
					this.aClass1_Sub1_Sub3_7.method180(this.anInt999);
					this.aClass1_Sub1_Sub3_7.method180(this.anInt1000);
				}
				if (super.aBoolean183 && !this.aBoolean209) {
					this.aBoolean209 = true;
					this.aClass1_Sub1_Sub3_7.method144(244);
					this.aClass1_Sub1_Sub3_7.method145(1);
				}
				if (!super.aBoolean183 && this.aBoolean209) {
					this.aBoolean209 = false;
					this.aClass1_Sub1_Sub3_7.method144(244);
					this.aClass1_Sub1_Sub3_7.method145(0);
				}
				this.method726();
				this.method685();
				this.method698();
				this.anInt993++;
				if (this.anInt993 > 750) {
					this.method710();
				}
				this.method700();
				this.method601();
				this.method647();
				anInt922++;
				if (anInt922 > 153) {
					anInt922 = 0;
					this.aClass1_Sub1_Sub3_7.method144(137);
					this.aClass1_Sub1_Sub3_7.method149(0);
				}
				this.anInt866++;
				if (this.anInt1009 != 0) {
					this.anInt1008 += 20;
					if (this.anInt1008 >= 400) {
						this.anInt1009 = 0;
					}
				}
				if (this.anInt1033 != 0) {
					this.anInt1030++;
					if (this.anInt1030 >= 15) {
						if (this.anInt1033 == 2) {
							this.aBoolean200 = true;
						}
						if (this.anInt1033 == 3) {
							this.aBoolean194 = true;
						}
						this.anInt1033 = 0;
					}
				}
				if (this.anInt975 != 0) {
					this.anInt943++;
					if (super.anInt848 > this.anInt976 + 5 || super.anInt848 < this.anInt976 - 5 || super.anInt849 > this.anInt977 + 5 || super.anInt849 < this.anInt977 - 5) {
						this.aBoolean210 = true;
					}
					if (super.anInt847 == 0) {
						if (this.anInt975 == 2) {
							this.aBoolean200 = true;
						}
						if (this.anInt975 == 3) {
							this.aBoolean194 = true;
						}
						this.anInt975 = 0;
						if (this.aBoolean210 && this.anInt943 >= 5) {
							this.anInt970 = -1;
							this.method675();
							if (this.anInt970 == this.anInt973 && this.anInt969 != this.anInt974) {
								@Pc(707) Class43 local707 = Class43.method515(this.anInt973);
								@Pc(709) byte local709 = 0;
								if (this.anInt1095 == 1 && local707.anInt725 == 206) {
									local709 = 1;
								}
								if (local707.anIntArray190[this.anInt969] <= 0) {
									local709 = 0;
								}
								if (local707.aBoolean152) {
									local67 = this.anInt974;
									local69 = this.anInt969;
									local707.anIntArray190[local69] = local707.anIntArray190[local67];
									local707.anIntArray189[local69] = local707.anIntArray189[local67];
									local707.anIntArray190[local67] = -1;
									local707.anIntArray189[local67] = 0;
								} else if (local709 == 1) {
									local67 = this.anInt974;
									local69 = this.anInt969;
									while (local67 != local69) {
										if (local67 > local69) {
											local707.method514(local67 - 1, local67, 492);
											local67--;
										} else if (local67 < local69) {
											local707.method514(local67 + 1, local67, 492);
											local67++;
										}
									}
								} else {
									local707.method514(this.anInt969, this.anInt974, 492);
								}
								this.aClass1_Sub1_Sub3_7.method144(159);
								this.aClass1_Sub1_Sub3_7.method146(this.anInt969);
								this.aClass1_Sub1_Sub3_7.method172(local709, this.aBoolean211);
								this.aClass1_Sub1_Sub3_7.method146(this.anInt974);
								this.aClass1_Sub1_Sub3_7.method182(this.anInt973);
							}
						} else if ((this.anInt1064 == 1 || this.method631(this.anInt1054 - 1)) && this.anInt1054 > 2) {
							this.method645();
						} else if (this.anInt1054 > 0) {
							this.method672(this.anInt1054 - 1);
						}
						this.anInt1030 = 10;
						super.anInt853 = 0;
					}
				}
				@Pc(882) int local882;
				@Pc(884) int local884;
				if (Class9.anInt335 != -1) {
					local882 = Class9.anInt335;
					local884 = Class9.anInt336;
					@Pc(906) boolean local906 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 0, 0, 0, local884, 0, 0, this.anInt1090, local882, true, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
					Class9.anInt335 = -1;
					if (local906) {
						this.anInt1006 = super.anInt854;
						this.anInt1007 = super.anInt855;
						this.anInt1009 = 1;
						this.anInt1008 = 0;
					}
				}
				if (super.anInt853 == 1 && this.aString17 != null) {
					this.aString17 = null;
					this.aBoolean194 = true;
					super.anInt853 = 0;
				}
				this.method709();
				if (this.anInt1085 == -1) {
					this.method624();
					this.method643();
					this.method696();
				}
				if (super.anInt847 == 1 || super.anInt853 == 1) {
					this.anInt1088++;
				}
				if (this.anInt1051 == 0 && this.anInt1077 == 0 && this.anInt867 == 0) {
					if (this.anInt968 > 0) {
						this.anInt968--;
					}
				} else if (this.anInt968 < 100) {
					this.anInt968++;
					if (this.anInt968 == 100) {
						if (this.anInt1051 != 0) {
							this.aBoolean194 = true;
						}
						if (this.anInt1077 != 0) {
							this.aBoolean200 = true;
						}
					}
				}
				if (this.anInt928 == 2) {
					this.method724(this.anInt1081);
				}
				if (this.anInt928 == 2 && this.aBoolean214) {
					this.method632();
				}
				for (local882 = 0; local882 < 5; local882++) {
					@Pc(1043) int local1043 = this.anIntArray268[local882]++;
				}
				this.method644();
				super.anInt846++;
				if (super.anInt846 > 4500) {
					this.anInt995 = 250;
					super.anInt846 -= 500;
					this.aClass1_Sub1_Sub3_7.method144(120);
				}
				this.anInt923++;
				if (this.anInt923 > 500) {
					this.anInt923 = 0;
					local884 = (int) (Math.random() * 8.0D);
					if ((local884 & 0x1) == 1) {
						this.anInt1012 += this.anInt1013;
					}
					if ((local884 & 0x2) == 2) {
						this.anInt875 += this.anInt876;
					}
					if ((local884 & 0x4) == 4) {
						this.anInt1066 += this.anInt1067;
					}
				}
				if (this.anInt1012 < -50) {
					this.anInt1013 = 2;
				}
				if (this.anInt1012 > 50) {
					this.anInt1013 = -2;
				}
				if (this.anInt875 < -55) {
					this.anInt876 = 2;
				}
				if (this.anInt875 > 55) {
					this.anInt876 = -2;
				}
				if (this.anInt1066 < -40) {
					this.anInt1067 = 1;
				}
				if (this.anInt1066 > 40) {
					this.anInt1067 = -1;
				}
				this.anInt860++;
				if (this.anInt860 > 500) {
					this.anInt860 = 0;
					local884 = (int) (Math.random() * 8.0D);
					if ((local884 & 0x1) == 1) {
						this.anInt878 += this.anInt879;
					}
					if ((local884 & 0x2) == 2) {
						this.anInt1042 += this.anInt1043;
					}
				}
				if (this.anInt878 < -60) {
					this.anInt879 = 2;
				}
				if (this.anInt878 > 60) {
					this.anInt879 = -2;
				}
				if (this.anInt1042 < -20) {
					this.anInt1043 = 1;
				}
				if (this.anInt1042 > 10) {
					this.anInt1043 = -1;
				}
				anInt891++;
				if (anInt891 > 69) {
					anInt891 = 0;
					this.aClass1_Sub1_Sub3_7.method144(36);
				}
				this.anInt994++;
				if (this.anInt994 > 50) {
					this.aClass1_Sub1_Sub3_7.method144(110);
				}
				try {
					if (this.aClass33_1 != null && this.aClass1_Sub1_Sub3_7.anInt301 > 0) {
						this.aClass33_1.method487(this.aClass1_Sub1_Sub3_7.anInt301, this.aClass1_Sub1_Sub3_7.aByteArray2);
						this.aClass1_Sub1_Sub3_7.anInt301 = 0;
						this.anInt994 = 0;
					}
				} catch (@Pc(1299) IOException local1299) {
					this.method710();
				} catch (@Pc(1304) Exception local1304) {
					this.method626(this.anInt1071);
				}
			}
		} catch (@Pc(1310) RuntimeException local1310) {
			signlink.reporterror("35202, " + 13 + ", " + local1310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CUSCNWAC;BI)V")
	private void method613(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method614(arg0.anInt429, arg0.anInt428, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("3371, " + arg0 + ", " + -102 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method719(this.anInt918, arg1, arg0) - arg2;
				@Pc(33) int local33 = arg1 - this.anInt1059;
				@Pc(38) int local38 = local28 - this.anInt1060;
				@Pc(43) int local43 = arg0 - this.anInt1061;
				@Pc(48) int local48 = Class1_Sub1_Sub1_Sub5.anIntArray126[this.anInt1062];
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray127[this.anInt1062];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray126[this.anInt1063];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub5.anIntArray127[this.anInt1063];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(103) int local103 = local38 * local53 - local83 * local48 >> 16;
				@Pc(113) int local113 = local38 * local48 + local83 * local53 >> 16;
				if (local113 >= 50) {
					this.anInt1014 = Class1_Sub1_Sub2_Sub1.anInt63 + (local85 << 9) / local113;
					this.anInt1015 = Class1_Sub1_Sub2_Sub1.anInt64 + (local103 << 9) / local113;
				} else {
					this.anInt1014 = -1;
					this.anInt1015 = -1;
				}
			} else {
				this.anInt1014 = -1;
				this.anInt1015 = -1;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("86079, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -928 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method615() {
		try {
			if (this.anInt986 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub3 local6 = this.aClass1_Sub1_Sub2_Sub3_3;
				@Pc(18) int local18 = 0;
				if (this.anInt1023 != 0) {
					local18 = 1;
				}
				for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
					if (this.aStringArray12[local25] != null) {
						@Pc(37) int local37 = this.anIntArray247[local25];
						@Pc(42) String local42 = this.aStringArray11[local25];
						@Pc(44) byte local44 = 0;
						if (local42 != null && local42.startsWith("@cr1@")) {
							local42 = local42.substring(5);
							local44 = 1;
						}
						if (local42 != null && local42.startsWith("@cr2@")) {
							local42 = local42.substring(5);
							local44 = 2;
						}
						@Pc(95) int local95;
						if ((local37 == 3 || local37 == 7) && (local37 == 7 || this.anInt1074 == 0 || this.anInt1074 == 1 && this.method663(7, local42))) {
							local95 = 329 - local18 * 13;
							local6.method265(4, local95, "From", 0);
							local6.method265(4, local95 - 1, "From", 65535);
							@Pc(120) int local120 = local6.method263("From ") + 4;
							if (local44 == 1) {
								this.aClass1_Sub1_Sub2_Sub4Array5[0].method363(local120, local95 - 12);
								local120 += 14;
							}
							if (local44 == 2) {
								this.aClass1_Sub1_Sub2_Sub4Array5[1].method363(local120, local95 - 12);
								local120 += 14;
							}
							local6.method265(local120, local95, local42 + ": " + this.aStringArray12[local25], 0);
							local6.method265(local120, local95 - 1, local42 + ": " + this.aStringArray12[local25], 65535);
							local18++;
							if (local18 >= 5) {
								return;
							}
						}
						if (local37 == 5 && this.anInt1074 < 2) {
							local95 = 329 - local18 * 13;
							local6.method265(4, local95, this.aStringArray12[local25], 0);
							local6.method265(4, local95 - 1, this.aStringArray12[local25], 65535);
							local18++;
							if (local18 >= 5) {
								return;
							}
						}
						if (local37 == 6 && this.anInt1074 < 2) {
							local95 = 329 - local18 * 13;
							local6.method265(4, local95, "To " + local42 + ": " + this.aStringArray12[local25], 0);
							local6.method265(4, local95 - 1, "To " + local42 + ": " + this.aStringArray12[local25], 65535);
							local18++;
							if (local18 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(299) RuntimeException local299) {
			signlink.reporterror("59350, " + 0 + ", " + local299.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VTUPBFSN;Z)Z")
	private boolean method616(@OriginalArg(0) Class43 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt725;
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
				this.aStringArray9[this.anInt1054] = "Remove @whi@" + this.aStringArray14[local4];
				this.anIntArray216[this.anInt1054] = 968;
				this.anInt1054++;
				this.aStringArray9[this.anInt1054] = "Message @whi@" + this.aStringArray14[local4];
				this.anIntArray216[this.anInt1054] = 109;
				this.anInt1054++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray9[this.anInt1054] = "Remove @whi@" + arg0.aString13;
				this.anIntArray216[this.anInt1054] = 397;
				this.anInt1054++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("57987, " + arg0 + ", " + false + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method617(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 >> 7 == this.anInt1052 && aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 >> 7 == this.anInt1053) {
				this.anInt1052 = 0;
				anInt958++;
				if (anInt958 > 190) {
					anInt958 = 0;
					this.aClass1_Sub1_Sub3_7.method144(0);
					this.aClass1_Sub1_Sub3_7.method148(10211198);
				}
			}
			@Pc(39) int local39 = this.anInt906;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
				@Pc(51) Class1_Sub1_Sub1_Sub2_Sub1 local51;
				@Pc(56) int local56;
				if (arg0) {
					local51 = aClass1_Sub1_Sub1_Sub2_Sub1_1;
					local56 = this.anInt905 << 14;
				} else {
					local51 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray223[local45]];
					local56 = this.anIntArray223[local45] << 14;
				}
				if (local51 != null && local51.method302(772)) {
					local51.aBoolean32 = false;
					if ((aBoolean191 && this.anInt906 > 50 || this.anInt906 > 200) && !arg0 && local51.anInt463 == local51.anInt461) {
						local51.aBoolean32 = true;
					}
					@Pc(107) int local107 = local51.anInt428 >> 7;
					@Pc(112) int local112 = local51.anInt429 >> 7;
					if (local107 >= 0 && local107 < 104 && local112 >= 0 && local112 < 104) {
						if (local51.aClass1_Sub1_Sub1_Sub5_1 == null || anInt1079 < local51.anInt176 || anInt1079 >= local51.anInt177) {
							if ((local51.anInt428 & 0x7F) == 64 && (local51.anInt429 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local107][local112] == this.anInt1039) {
									continue;
								}
								this.anIntArrayArray23[local107][local112] = this.anInt1039;
							}
							local51.anInt196 = this.method719(this.anInt918, local51.anInt428, local51.anInt429);
							this.aClass9_1.method206(60, this.anInt1089, local51.anInt430, this.anInt918, local51.anInt429, local51.aBoolean79, local51.anInt196, local56, local51, local51.anInt428);
						} else {
							local51.aBoolean32 = false;
							local51.anInt196 = this.method719(this.anInt918, local51.anInt428, local51.anInt429);
							this.aClass9_1.method207(local51.anInt185, local51.anInt428, local51.anInt430, local56, local51.anInt183, local51, local51.anInt196, local51.anInt186, this.anInt918, local51.anInt184, local51.anInt429);
						}
					}
				}
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("3015, " + 29921 + ", " + arg0 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method618() {
		try {
			@Pc(7) byte[] local7 = this.aClass13_2.method278("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass48_15.method555();
			local13.method127(0, 0);
			this.aClass48_16.method555();
			local13.method127(0, -637);
			this.aClass48_12.method555();
			local13.method127(0, -128);
			this.aClass48_13.method555();
			local13.method127(-371, -202);
			this.aClass48_14.method555();
			local13.method127(-171, -202);
			this.aClass48_17.method555();
			local13.method127(-265, 0);
			this.aClass48_18.method555();
			local13.method127(-265, -562);
			this.aClass48_19.method555();
			local13.method127(-171, -128);
			this.aClass48_20.method555();
			local13.method127(-171, -562);
			@Pc(108) int[] local108 = new int[local13.anInt282];
			for (@Pc(110) int local110 = 0; local110 < local13.anInt283; local110++) {
				for (@Pc(114) int local114 = 0; local114 < local13.anInt282; local114++) {
					local108[local114] = local13.anIntArray33[local13.anInt282 + local13.anInt282 * local110 - local114 - 1];
				}
				for (@Pc(140) int local140 = 0; local140 < local13.anInt282; local140++) {
					local13.anIntArray33[local140 + local13.anInt282 * local110] = local108[local140];
				}
			}
			this.aClass48_15.method555();
			local13.method127(0, 382);
			this.aClass48_16.method555();
			local13.method127(0, -255);
			this.aClass48_12.method555();
			local13.method127(0, 254);
			this.aClass48_13.method555();
			local13.method127(-371, 180);
			this.aClass48_14.method555();
			local13.method127(-171, 180);
			this.aClass48_17.method555();
			local13.method127(-265, 382);
			this.aClass48_18.method555();
			local13.method127(-265, -180);
			this.aClass48_19.method555();
			local13.method127(-171, 254);
			this.aClass48_20.method555();
			local13.method127(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass13_2, "logo", 0);
			this.aClass48_12.method555();
			local13.method129(382 - local13.anInt282 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("86081, " + 5 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method619(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean191) {
				for (@Pc(9) int local9 = 0; local9 < this.anIntArray218.length; local9++) {
					@Pc(16) int local16 = this.anIntArray218[local9];
					if (Class1_Sub1_Sub2_Sub1.anIntArray11[local16] >= arg0) {
						@Pc(25) Class1_Sub1_Sub2_Sub4 local25 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub4Array1[local16];
						@Pc(33) int local33 = local25.anInt561 * local25.anInt562 - 1;
						@Pc(41) int local41 = local25.anInt561 * this.anInt866 * 2;
						@Pc(44) byte[] local44 = local25.aByteArray11;
						@Pc(47) byte[] local47 = this.aByteArray21;
						for (@Pc(49) int local49 = 0; local49 <= local33; local49++) {
							local47[local49] = local44[local49 - local41 & local33];
						}
						local25.aByteArray11 = local47;
						this.aByteArray21 = local44;
						Class1_Sub1_Sub2_Sub1.method52(local16);
						anInt940++;
						if (anInt940 > 1575) {
							anInt940 = 0;
							this.aClass1_Sub1_Sub3_7.method144(25);
							this.aClass1_Sub1_Sub3_7.method145(0);
							@Pc(96) int local96 = this.aClass1_Sub1_Sub3_7.anInt301;
							this.aClass1_Sub1_Sub3_7.method146((int) (Math.random() * 65536.0D));
							this.aClass1_Sub1_Sub3_7.method146(22390);
							this.aClass1_Sub1_Sub3_7.method146((int) (Math.random() * 65536.0D));
							this.aClass1_Sub1_Sub3_7.method146(39392);
							this.aClass1_Sub1_Sub3_7.method146(28881);
							this.aClass1_Sub1_Sub3_7.method146(23643);
							this.aClass1_Sub1_Sub3_7.method145(41);
							this.aClass1_Sub1_Sub3_7.method145(39);
							this.aClass1_Sub1_Sub3_7.method145(92);
							this.aClass1_Sub1_Sub3_7.method146(38971);
							this.aClass1_Sub1_Sub3_7.method154(this.aClass1_Sub1_Sub3_7.anInt301 - local96);
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("88442, " + arg0 + ", " + true + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method620() {
		try {
			signlink.aBoolean228 = false;
			signlink.anInt1103 = 0;
			signlink.midi = "stop";
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("52414, " + 6 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method621() {
		try {
			this.anInt991 += 0;
			this.aBoolean185 = false;
			while (this.aBoolean218) {
				this.aBoolean185 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(17) Exception local17) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub4_9 = null;
			this.aClass1_Sub1_Sub2_Sub4_10 = null;
			this.aClass1_Sub1_Sub2_Sub4Array2 = null;
			this.anIntArray228 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.anIntArray231 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.anIntArray257 = null;
			this.anIntArray258 = null;
			this.aClass1_Sub1_Sub2_Sub2_14 = null;
			this.aClass1_Sub1_Sub2_Sub2_15 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("26965, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method622() {
		try {
			@Pc(6) Class1_Sub1_Sub1_Sub3 local6 = (Class1_Sub1_Sub1_Sub3) this.aClass6_12.method97();
			if (this.aByte28 != 47) {
				this.aClass1_Sub1_Sub3_7.method145(50);
			}
			while (local6 != null) {
				if (local6.anInt205 != this.anInt918 || anInt1079 > local6.anInt207) {
					local6.method501();
				} else if (anInt1079 >= local6.anInt206) {
					if (local6.anInt203 > 0) {
						@Pc(44) Class1_Sub1_Sub1_Sub2_Sub2 local44 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local6.anInt203 - 1];
						if (local44 != null && local44.anInt428 >= 0 && local44.anInt428 < 13312 && local44.anInt429 >= 0 && local44.anInt429 < 13312) {
							local6.method90(local44.anInt429, this.method719(local6.anInt205, local44.anInt428, local44.anInt429) - local6.anInt213, anInt1079, local44.anInt428);
						}
					}
					if (local6.anInt203 < 0) {
						@Pc(89) int local89 = -local6.anInt203 - 1;
						@Pc(95) Class1_Sub1_Sub1_Sub2_Sub1 local95;
						if (local89 == this.anInt1046) {
							local95 = aClass1_Sub1_Sub1_Sub2_Sub1_1;
						} else {
							local95 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local89];
						}
						if (local95 != null && local95.anInt428 >= 0 && local95.anInt428 < 13312 && local95.anInt429 >= 0 && local95.anInt429 < 13312) {
							local6.method90(local95.anInt429, this.method719(local6.anInt205, local95.anInt428, local95.anInt429) - local6.anInt213, anInt1079, local95.anInt428);
						}
					}
					local6.method89(this.anInt866);
					this.aClass9_1.method206(60, this.anInt1089, local6.anInt208, this.anInt918, (int) local6.aDouble2, false, (int) local6.aDouble3, -1, local6, (int) local6.aDouble1);
				}
				local6 = (Class1_Sub1_Sub1_Sub3) this.aClass6_12.method99(569);
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("97102, " + 47 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean205 || this.aBoolean222 || this.aBoolean199) {
				this.method635();
			} else {
				anInt944++;
				if (this.aBoolean216) {
					this.method608();
				} else {
					this.method660(false);
				}
				this.anInt1088 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("70073, " + false + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!VTUPBFSN;Z)Z")
	private boolean method623(@OriginalArg(0) Class43 arg0) {
		try {
			if (arg0.anIntArray183 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray183.length; local6++) {
				@Pc(14) int local14 = this.method704(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray182[local6];
				if (arg0.anIntArray183[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray183[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray183[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("30134, " + arg0 + ", " + true + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method624() {
		try {
			if (this.anInt895 == 0 && super.anInt853 == 1) {
				@Pc(21) int local21 = super.anInt854 - 25 - 550;
				@Pc(28) int local28 = super.anInt855 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt1000 + this.anInt878 & 0x7FF;
					@Pc(52) int local52 = Class1_Sub1_Sub2_Sub1.anIntArray7[local48];
					@Pc(56) int local56 = Class1_Sub1_Sub2_Sub1.anIntArray8[local48];
					@Pc(65) int local65 = local52 * (this.anInt1042 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt1042 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 + local84 >> 7;
					@Pc(108) int local108 = aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 - local94 >> 7;
					@Pc(130) boolean local130 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 1, 0, 0, local108, 0, 0, this.anInt1090, local101, true, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
					if (local130) {
						this.aClass1_Sub1_Sub3_7.method145(local21);
						this.aClass1_Sub1_Sub3_7.method145(local28);
						this.aClass1_Sub1_Sub3_7.method146(this.anInt1000);
						this.aClass1_Sub1_Sub3_7.method145(57);
						this.aClass1_Sub1_Sub3_7.method145(this.anInt878);
						this.aClass1_Sub1_Sub3_7.method145(this.anInt1042);
						this.aClass1_Sub1_Sub3_7.method145(89);
						this.aClass1_Sub1_Sub3_7.method146(aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428);
						this.aClass1_Sub1_Sub3_7.method146(aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429);
						this.aClass1_Sub1_Sub3_7.method145(this.anInt937);
						this.aClass1_Sub1_Sub3_7.method145(63);
						return;
					}
				}
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("94783, " + -608 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean184 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("24501, " + 277 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method625() {
		try {
			this.aClass1_Sub1_Sub2_Sub4_9 = new Class1_Sub1_Sub2_Sub4(this.aClass13_2, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub4_10 = new Class1_Sub1_Sub2_Sub4(this.aClass13_2, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub4Array2 = new Class1_Sub1_Sub2_Sub4[12];
			for (@Pc(34) int local34 = 0; local34 < 12; local34++) {
				this.aClass1_Sub1_Sub2_Sub4Array2[local34] = new Class1_Sub1_Sub2_Sub4(this.aClass13_2, "runes", local34);
			}
			this.aClass1_Sub1_Sub2_Sub2_14 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_15 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(67) int local67 = 0; local67 < 33920; local67++) {
				this.aClass1_Sub1_Sub2_Sub2_14.anIntArray33[local67] = this.aClass48_15.anIntArray205[local67];
			}
			for (@Pc(85) int local85 = 0; local85 < 33920; local85++) {
				this.aClass1_Sub1_Sub2_Sub2_15.anIntArray33[local85] = this.aClass48_16.anIntArray205[local85];
			}
			this.anIntArray229 = new int[256];
			for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
				this.anIntArray229[local107] = local107 * 262144;
			}
			for (@Pc(122) int local122 = 0; local122 < 64; local122++) {
				this.anIntArray229[local122 + 64] = local122 * 1024 + 16711680;
			}
			for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
				this.anIntArray229[local141 + 128] = local141 * 4 + 16776960;
			}
			for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
				this.anIntArray229[local160 + 192] = 16777215;
			}
			this.anIntArray230 = new int[256];
			for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
				this.anIntArray230[local179] = local179 * 1024;
			}
			for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
				this.anIntArray230[local194 + 64] = local194 * 4 + 65280;
			}
			for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
				this.anIntArray230[local213 + 128] = local213 * 262144 + 65535;
			}
			for (@Pc(232) int local232 = 0; local232 < 64; local232++) {
				this.anIntArray230[local232 + 192] = 16777215;
			}
			this.anIntArray231 = new int[256];
			for (@Pc(251) int local251 = 0; local251 < 64; local251++) {
				this.anIntArray231[local251] = local251 * 4;
			}
			for (@Pc(266) int local266 = 0; local266 < 64; local266++) {
				this.anIntArray231[local266 + 64] = local266 * 262144 + 255;
			}
			for (@Pc(285) int local285 = 0; local285 < 64; local285++) {
				this.anIntArray231[local285 + 128] = local285 * 1024 + 16711935;
			}
			for (@Pc(304) int local304 = 0; local304 < 64; local304++) {
				this.anIntArray231[local304 + 192] = 16777215;
			}
			this.anIntArray228 = new int[256];
			this.anIntArray271 = new int[32768];
			this.anIntArray272 = new int[32768];
			this.method637(null);
			this.anIntArray257 = new int[32768];
			this.anIntArray258 = new int[32768];
			this.method588(10, "Connecting to fileserver", (byte) 1);
			if (!this.aBoolean185) {
				this.aBoolean219 = true;
				this.aBoolean185 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("68441, " + true + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method626(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.aClass1_Sub1_Sub3_7.method145(13);
			}
			try {
				if (this.aClass33_1 != null) {
					this.aClass33_1.method483();
				}
			} catch (@Pc(13) Exception local13) {
			}
			this.aClass33_1 = null;
			this.aBoolean216 = false;
			this.anInt919 = 0;
			this.aString19 = "";
			this.aString20 = "";
			this.method674();
			this.aClass9_1.method195();
			for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
				this.aClass50Array1[local37].method564();
			}
			System.gc();
			this.method620();
			this.anInt941 = -1;
			this.anInt964 = -1;
			this.anInt983 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("52163, " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
	private void method627(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			this.aBoolean216 &= true;
			@Pc(17) int local17;
			if (this.aClass48_23 != null) {
				this.aClass48_23.method555();
				Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
				local17 = 151;
				if (arg1 != null) {
					local17 -= 7;
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method261((byte) 3, local17, 0, arg0, 257);
				this.aClass1_Sub1_Sub2_Sub3_3.method261((byte) 3, local17 - 1, 16777215, arg0, 256);
				local17 += 15;
				if (arg1 != null) {
					this.aClass1_Sub1_Sub2_Sub3_3.method261((byte) 3, local17, 0, arg1, 257);
					this.aClass1_Sub1_Sub2_Sub3_3.method261((byte) 3, local17 - 1, 16777215, arg1, 256);
				}
				this.aClass48_23.method556(super.aGraphics2, 4, 904, 4);
			} else if (super.aClass48_2 != null) {
				super.aClass48_2.method555();
				Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray246;
				local17 = 251;
				Class1_Sub1_Sub2.method351(233, 300, 0, 221, 50);
				Class1_Sub1_Sub2.method352(300, 16777215, 233, 50, 221);
				if (arg1 != null) {
					local17 -= 7;
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method261((byte) 3, local17, 0, arg0, 383);
				this.aClass1_Sub1_Sub2_Sub3_3.method261((byte) 3, local17 - 1, 16777215, arg0, 382);
				local17 += 15;
				if (arg1 != null) {
					this.aClass1_Sub1_Sub2_Sub3_3.method261((byte) 3, local17, 0, arg1, 383);
					this.aClass1_Sub1_Sub2_Sub3_3.method261((byte) 3, local17 - 1, 16777215, arg1, 382);
				}
				super.aClass48_2.method556(super.aGraphics2, 0, 904, 0);
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("40179, " + arg0 + ", " + true + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EYMNCFMK;IB)V")
	private void method628(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt1076 = 0;
			this.anInt907 = 0;
			this.method681(arg0, arg1);
			this.method653(arg1, arg0);
			this.method693(arg1, arg0);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt1076; local29++) {
				local36 = this.anIntArray267[local29];
				if (this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local36].anInt449 != anInt1079) {
					this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local36].aClass31_2 = null;
					this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local36] = null;
				}
			}
			if (arg0.anInt301 != arg1) {
				signlink.reporterror(this.aString19 + " size mismatch in getnpcpos - pos:" + arg0.anInt301 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt920; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray227[local36]] == null) {
					signlink.reporterror(this.aString19 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt920);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("67664, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method629() {
		try {
			this.aBoolean216 &= true;
			this.aClass48_24.method555();
			Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray243;
			this.aClass1_Sub1_Sub2_Sub4_15.method363(0, 0);
			if (this.aBoolean208) {
				this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 40, 0, this.aString31, 239);
				this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 60, 128, this.aString25 + "*", 239);
			} else if (this.anInt1041 == 1) {
				this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 40, 0, "Enter amount:", 239);
				this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 60, 128, this.aString21 + "*", 239);
			} else if (this.anInt1041 == 2) {
				this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 40, 0, "Enter name:", 239);
				this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 60, 128, this.aString21 + "*", 239);
			} else {
				@Pc(131) Class1_Sub1_Sub2_Sub3 local131;
				@Pc(139) int local139;
				@Pc(150) int local150;
				if (this.anInt1041 == 3) {
					if (this.aString21 != this.aString26) {
						this.method597(this.aString21);
						this.aString26 = this.aString21;
					}
					local131 = this.aClass1_Sub1_Sub2_Sub3_3;
					Class1_Sub1_Sub2.method348(0, 463, 77, 0);
					for (local139 = 0; local139 < this.anInt988; local139++) {
						local150 = local139 * 14 + 18 - this.anInt989;
						if (local150 > 0 && local150 < 110) {
							local131.method261((byte) 3, local150, 0, this.aStringArray13[local139], 239);
						}
					}
					Class1_Sub1_Sub2.method347(this.anInt892);
					if (this.anInt988 > 5) {
						this.method662(0, 463, this.anInt989, this.anInt988 * 14 + 7, 77);
					}
					if (this.aString21.length() == 0) {
						this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 40, 255, "Enter object name", 239);
					} else if (this.anInt988 == 0) {
						this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 40, 0, "No matching objects found, please shorten search", 239);
					}
					local131.method261((byte) 3, 90, 0, this.aString21 + "*", 239);
					Class1_Sub1_Sub2.method354(77, 0, 0, this.anInt1056, 479);
				} else if (this.aString17 != null) {
					this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 40, 0, this.aString17, 239);
					this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 60, 128, "Click to continue", 239);
				} else if (this.anInt911 != -1) {
					this.method664(0, 0, 0, Class43.method515(this.anInt911), 726);
				} else if (this.anInt990 == -1) {
					local131 = this.aClass1_Sub1_Sub2_Sub3_3;
					local139 = 0;
					Class1_Sub1_Sub2.method348(0, 463, 77, 0);
					for (local150 = 0; local150 < 100; local150++) {
						if (this.aStringArray12[local150] != null) {
							@Pc(317) int local317 = this.anIntArray247[local150];
							@Pc(326) int local326 = this.anInt910 + 70 - local139 * 14;
							@Pc(331) String local331 = this.aStringArray11[local150];
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
									local131.method265(4, local326, this.aStringArray12[local150], 0);
								}
								local139++;
							}
							@Pc(403) int local403;
							if ((local317 == 1 || local317 == 2) && (local317 == 1 || this.anInt888 == 0 || this.anInt888 == 1 && this.method663(7, local331))) {
								if (local326 > 0 && local326 < 110) {
									local403 = 4;
									if (local333 == 1) {
										this.aClass1_Sub1_Sub2_Sub4Array5[0].method363(4, local326 - 12);
										local403 += 14;
									}
									if (local333 == 2) {
										this.aClass1_Sub1_Sub2_Sub4Array5[1].method363(local403, local326 - 12);
										local403 += 14;
									}
									local131.method265(local403, local326, local331 + ":", 0);
									local403 += local131.method263(local331) + 8;
									local131.method265(local403, local326, this.aStringArray12[local150], 255);
								}
								local139++;
							}
							if ((local317 == 3 || local317 == 7) && this.anInt986 == 0 && (local317 == 7 || this.anInt1074 == 0 || this.anInt1074 == 1 && this.method663(7, local331))) {
								if (local326 > 0 && local326 < 110) {
									local131.method265(4, local326, "From", 0);
									local403 = local131.method263("From ") + 4;
									if (local333 == 1) {
										this.aClass1_Sub1_Sub2_Sub4Array5[0].method363(local403, local326 - 12);
										local403 += 14;
									}
									if (local333 == 2) {
										this.aClass1_Sub1_Sub2_Sub4Array5[1].method363(local403, local326 - 12);
										local403 += 14;
									}
									local131.method265(local403, local326, local331 + ":", 0);
									local403 += local131.method263(local331) + 8;
									local131.method265(local403, local326, this.aStringArray12[local150], 8388608);
								}
								local139++;
							}
							if (local317 == 4 && (this.anInt961 == 0 || this.anInt961 == 1 && this.method663(7, local331))) {
								if (local326 > 0 && local326 < 110) {
									local131.method265(4, local326, local331 + " " + this.aStringArray12[local150], 8388736);
								}
								local139++;
							}
							if (local317 == 5 && this.anInt986 == 0 && this.anInt1074 < 2) {
								if (local326 > 0 && local326 < 110) {
									local131.method265(4, local326, this.aStringArray12[local150], 8388608);
								}
								local139++;
							}
							if (local317 == 6 && this.anInt986 == 0 && this.anInt1074 < 2) {
								if (local326 > 0 && local326 < 110) {
									local131.method265(4, local326, "To " + local331 + ":", 0);
									local131.method265(local131.method263("To " + local331) + 12, local326, this.aStringArray12[local150], 8388608);
								}
								local139++;
							}
							if (local317 == 8 && (this.anInt961 == 0 || this.anInt961 == 1 && this.method663(7, local331))) {
								if (local326 > 0 && local326 < 110) {
									local131.method265(4, local326, local331 + " " + this.aStringArray12[local150], 8270336);
								}
								local139++;
							}
						}
					}
					Class1_Sub1_Sub2.method347(this.anInt892);
					this.anInt981 = local139 * 14 + 7;
					if (this.anInt981 < 78) {
						this.anInt981 = 78;
					}
					this.method662(0, 463, this.anInt981 - this.anInt910 - 77, this.anInt981, 77);
					@Pc(774) String local774;
					if (aClass1_Sub1_Sub1_Sub2_Sub1_1 == null || aClass1_Sub1_Sub1_Sub2_Sub1_1.aString3 == null) {
						local774 = Class20.method323(this.aBoolean201, this.aString19);
					} else {
						local774 = aClass1_Sub1_Sub1_Sub2_Sub1_1.aString3;
					}
					local131.method265(4, 90, local774 + ":", 0);
					local131.method265(local131.method263(local774 + ": ") + 6, 90, this.aString23 + "*", 255);
					Class1_Sub1_Sub2.method354(77, 0, 0, this.anInt1056, 479);
				} else {
					this.method664(0, 0, 0, Class43.method515(this.anInt990), 726);
				}
			}
			if (this.aBoolean225 && this.anInt1025 == 2) {
				this.method592();
			}
			this.aClass48_24.method556(super.aGraphics2, 357, 904, 17);
			this.aClass48_23.method555();
			Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
		} catch (@Pc(857) RuntimeException local857) {
			signlink.reporterror("45249, " + true + ", " + local857.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
	private boolean method631(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(21) int local21 = this.anIntArray216[arg0];
			if (local21 >= 2000) {
				local21 -= 2000;
			}
			return local21 == 465;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("83823, " + 6 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method632() {
		try {
			@Pc(14) int local14 = this.anInt896 * 128 + 64;
			@Pc(21) int local21 = this.anInt897 * 128 + 64;
			@Pc(32) int local32 = this.method719(this.anInt918, local14, local21) - this.anInt898;
			if (this.anInt1059 < local14) {
				this.anInt1059 += this.anInt899 + (local14 - this.anInt1059) * this.anInt900 / 1000;
				if (this.anInt1059 > local14) {
					this.anInt1059 = local14;
				}
			}
			if (this.anInt1059 > local14) {
				this.anInt1059 -= this.anInt899 + (this.anInt1059 - local14) * this.anInt900 / 1000;
				if (this.anInt1059 < local14) {
					this.anInt1059 = local14;
				}
			}
			if (this.anInt1060 < local32) {
				this.anInt1060 += this.anInt899 + (local32 - this.anInt1060) * this.anInt900 / 1000;
				if (this.anInt1060 > local32) {
					this.anInt1060 = local32;
				}
			}
			if (this.anInt1060 > local32) {
				this.anInt1060 -= this.anInt899 + (this.anInt1060 - local32) * this.anInt900 / 1000;
				if (this.anInt1060 < local32) {
					this.anInt1060 = local32;
				}
			}
			if (this.anInt1061 < local21) {
				this.anInt1061 += this.anInt899 + (local21 - this.anInt1061) * this.anInt900 / 1000;
				if (this.anInt1061 > local21) {
					this.anInt1061 = local21;
				}
			}
			if (this.anInt1061 > local21) {
				this.anInt1061 -= this.anInt899 + (this.anInt1061 - local21) * this.anInt900 / 1000;
				if (this.anInt1061 < local21) {
					this.anInt1061 = local21;
				}
			}
			local14 = this.anInt1018 * 128 + 64;
			local21 = this.anInt1019 * 128 + 64;
			local32 = this.method719(this.anInt918, local14, local21) - this.anInt1020;
			@Pc(230) int local230 = local14 - this.anInt1059;
			@Pc(235) int local235 = local32 - this.anInt1060;
			@Pc(240) int local240 = local21 - this.anInt1061;
			@Pc(251) int local251 = (int) Math.sqrt((double) (local230 * local230 + local240 * local240));
			@Pc(262) int local262 = (int) (Math.atan2((double) local235, (double) local251) * 325.949D) & 0x7FF;
			@Pc(273) int local273 = (int) (Math.atan2((double) local230, (double) local240) * -325.949D) & 0x7FF;
			if (local262 < 128) {
				local262 = 128;
			}
			if (local262 > 383) {
				local262 = 383;
			}
			if (this.anInt1062 < local262) {
				this.anInt1062 += this.anInt1021 + (local262 - this.anInt1062) * this.anInt1022 / 1000;
				if (this.anInt1062 > local262) {
					this.anInt1062 = local262;
				}
			}
			if (this.anInt1062 > local262) {
				this.anInt1062 -= this.anInt1021 + (this.anInt1062 - local262) * this.anInt1022 / 1000;
				if (this.anInt1062 < local262) {
					this.anInt1062 = local262;
				}
			}
			@Pc(344) int local344 = local273 - this.anInt1063;
			if (local344 > 1024) {
				local344 -= 2048;
			}
			if (local344 < -1024) {
				local344 += 2048;
			}
			if (local344 > 0) {
				this.anInt1063 += this.anInt1021 + local344 * this.anInt1022 / 1000;
				this.anInt1063 &= 0x7FF;
			}
			if (local344 < 0) {
				this.anInt1063 -= this.anInt1021 + -local344 * this.anInt1022 / 1000;
				this.anInt1063 &= 0x7FF;
			}
			@Pc(402) int local402 = local273 - this.anInt1063;
			if (local402 > 1024) {
				local402 -= 2048;
			}
			if (local402 < -1024) {
				local402 += 2048;
			}
			if (local402 < 0 && local344 > 0 || local402 > 0 && local344 < 0) {
				this.anInt1063 = local273;
			}
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("60608, " + 18662 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method633(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class34.aClass34Array1[arg0].anInt672;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray241[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub1_Sub2_Sub1.method54(0.9D, 250);
					}
					if (local12 == 2) {
						Class1_Sub1_Sub2_Sub1.method54(0.8D, 250);
					}
					if (local12 == 3) {
						Class1_Sub1_Sub2_Sub1.method54(0.7D, 250);
					}
					if (local12 == 4) {
						Class1_Sub1_Sub2_Sub1.method54(0.6D, 250);
					}
					Class19.aClass41_2.method500();
					this.aBoolean184 = true;
				}
				if (local4 == 3) {
					@Pc(57) boolean local57 = this.aBoolean212;
					if (local12 == 0) {
						this.method689(0, this.aBoolean212);
						this.aBoolean212 = true;
					}
					if (local12 == 1) {
						this.method689(-400, this.aBoolean212);
						this.aBoolean212 = true;
					}
					if (local12 == 2) {
						this.method689(-800, this.aBoolean212);
						this.aBoolean212 = true;
					}
					if (local12 == 3) {
						this.method689(-1200, this.aBoolean212);
						this.aBoolean212 = true;
					}
					if (local12 == 4) {
						this.aBoolean212 = false;
					}
					if (this.aBoolean212 != local57 && !aBoolean191) {
						if (this.aBoolean212) {
							this.anInt964 = this.anInt941;
							this.aBoolean203 = true;
							this.aClass12_Sub1_1.method549(2, this.anInt964);
						} else {
							this.method620();
						}
						this.anInt983 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean197 = true;
						this.method656(0);
					}
					if (local12 == 1) {
						this.aBoolean197 = true;
						this.method656(-400);
					}
					if (local12 == 2) {
						this.aBoolean197 = true;
						this.method656(-800);
					}
					if (local12 == 3) {
						this.aBoolean197 = true;
						this.method656(-1200);
					}
					if (local12 == 4) {
						this.aBoolean197 = false;
					}
				}
				if (local4 == 5) {
					this.anInt1064 = local12;
				}
				if (local4 == 6) {
					this.anInt890 = local12;
				}
				if (local4 == 8) {
					this.anInt986 = local12;
					this.aBoolean194 = true;
				}
				if (local4 == 9) {
					this.anInt1095 = local12;
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("9097, " + arg0 + ", " + true + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method634(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt920; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub2_Sub2 local11 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray227[local1]];
				@Pc(20) int local20 = (this.anIntArray227[local1] << 14) + 536870912;
				if (local11 != null && local11.method302(772) && local11.aClass31_2.aBoolean133 == arg0 && local11.aClass31_2.method482(this.anInt963)) {
					@Pc(42) int local42 = local11.anInt428 >> 7;
					@Pc(47) int local47 = local11.anInt429 >> 7;
					if (local42 >= 0 && local42 < 104 && local47 >= 0 && local47 < 104) {
						if (local11.anInt448 == 1 && (local11.anInt428 & 0x7F) == 64 && (local11.anInt429 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local42][local47] == this.anInt1039) {
								continue;
							}
							this.anIntArrayArray23[local42][local47] = this.anInt1039;
						}
						if (!local11.aClass31_2.aBoolean132) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass9_1.method206((local11.anInt448 - 1) * 64 + 60, this.anInt1089, local11.anInt430, this.anInt918, local11.anInt429, local11.aBoolean79, this.method719(this.anInt918, local11.anInt428, local11.anInt429), local20, local11, local11.anInt428);
					}
				}
			}
			@Pc(142) int local142 = 18 / arg1;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("79705, " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method635() {
		try {
			@Pc(4) Graphics local4 = this.method586().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method579(621);
			@Pc(40) byte local40;
			@Pc(46) int local46;
			if (this.aBoolean222) {
				this.aBoolean185 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local40 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local46 = local40 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(55) int local55 = local46 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(72) int local72 = local55 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(78) int local78 = local72 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(84) int local84 = local78 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(90) int local90 = local84 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean199) {
				this.aBoolean185 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean205) {
				this.aBoolean185 = false;
				local4.setColor(Color.yellow);
				local40 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local46 = local40 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local46 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local46 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local46 += 30;
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("70359, " + -31435 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method636() {
		try {
			if (super.aClass48_2 == null) {
				this.method621();
				this.aClass48_12 = null;
				this.aClass48_13 = null;
				this.aClass48_14 = null;
				this.aClass48_15 = null;
				this.aClass48_16 = null;
				this.aClass48_17 = null;
				this.aClass48_18 = null;
				this.aClass48_19 = null;
				this.aClass48_20 = null;
				this.aClass48_24 = null;
				this.aClass48_22 = null;
				this.aClass48_21 = null;
				this.aClass48_23 = null;
				this.aClass48_25 = null;
				this.aClass48_26 = null;
				this.aClass48_27 = null;
				super.aClass48_2 = new Class48(this.method586(), 765, 503, (byte) 52);
				this.aBoolean184 = true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("32874, " + -19177 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MRCVLIXG;)V")
	private void method637(@OriginalArg(1) Class1_Sub1_Sub2_Sub4 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray271.length; local5++) {
				this.anIntArray271[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray271[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local30 = 0; local30 < 20; local30++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray272[local67] = (this.anIntArray271[local67 - 1] + this.anIntArray271[local67 + 1] + this.anIntArray271[local67 - 128] + this.anIntArray271[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray271;
				this.anIntArray271 = this.anIntArray272;
				this.anIntArray272 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt562; local59++) {
					for (local67 = 0; local67 < arg0.anInt561; local67++) {
						if (arg0.aByteArray11[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt563 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt564 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray271[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("20859, " + 0 + ", " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;B)V")
	@Override
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt913 = arg0;
			this.aString24 = arg1;
			this.method661();
			if (this.aClass13_2 == null) {
				super.method588(arg0, arg1, (byte) 1);
			} else {
				this.aClass48_14.method555();
				this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 54, 16777215, "RuneScape is loading - please wait...", 180);
				Class1_Sub1_Sub2.method352(304, 9179409, 28, 34, 62);
				Class1_Sub1_Sub2.method352(302, 0, 29, 32, 63);
				Class1_Sub1_Sub2.method351(30, arg0 * 3, 9179409, 64, 30);
				Class1_Sub1_Sub2.method351(arg0 * 3 + 30, 300 - arg0 * 3, 0, 64, 30);
				this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, 85, 16777215, arg1, 180);
				this.aClass48_14.method556(super.aGraphics2, 171, 904, 202);
				if (this.aBoolean184) {
					this.aBoolean184 = false;
					if (!this.aBoolean185) {
						this.aClass48_15.method556(super.aGraphics2, 0, 904, 0);
						this.aClass48_16.method556(super.aGraphics2, 0, 904, 637);
					}
					this.aClass48_12.method556(super.aGraphics2, 0, 904, 128);
					this.aClass48_13.method556(super.aGraphics2, 371, 904, 202);
					this.aClass48_17.method556(super.aGraphics2, 265, 904, 0);
					this.aClass48_18.method556(super.aGraphics2, 265, 904, 562);
					this.aClass48_19.method556(super.aGraphics2, 171, 904, 128);
					this.aClass48_20.method556(super.aGraphics2, 171, 904, 562);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("66305, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method638() {
		try {
			this.anInt929 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt906 + this.anInt920; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub2 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub2_Sub1_1;
				} else if (local6 < this.anInt906) {
					local13 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray223[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray227[local6 - this.anInt906]];
				}
				if (local13 != null && local13.method302(772)) {
					@Pc(54) Class31 local54;
					if (local13 instanceof Class1_Sub1_Sub1_Sub2_Sub2) {
						local54 = ((Class1_Sub1_Sub1_Sub2_Sub2) local13).aClass31_2;
						if (local54.anIntArray147 != null) {
							local54 = local54.method475(863);
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt906) {
						local54 = ((Class1_Sub1_Sub1_Sub2_Sub2) local13).aClass31_2;
						if (local54.anInt652 >= 0 && local54.anInt652 < this.aClass1_Sub1_Sub2_Sub2Array6.length) {
							this.method613(local13, local13.anInt468 + 15);
							if (this.anInt1014 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array6[local54.anInt652].method129(this.anInt1014 - 12, this.anInt1015 - 30);
							}
						}
						if (this.anInt966 == 1 && this.anInt939 == this.anIntArray227[local6 - this.anInt906] && anInt1079 % 20 < 10) {
							this.method613(local13, local13.anInt468 + 15);
							if (this.anInt1014 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array10[0].method129(this.anInt1014 - 12, this.anInt1015 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class1_Sub1_Sub1_Sub2_Sub1 local73 = (Class1_Sub1_Sub1_Sub2_Sub1) local13;
						if (local73.anInt180 != -1 || local73.anInt188 != -1) {
							this.method613(local13, local13.anInt468 + 15);
							if (this.anInt1014 > -1) {
								if (local73.anInt180 != -1) {
									this.aClass1_Sub1_Sub2_Sub2Array7[local73.anInt180].method129(this.anInt1014 - 12, this.anInt1015 - 30);
									local70 += 25;
								}
								if (local73.anInt188 != -1) {
									this.aClass1_Sub1_Sub2_Sub2Array6[local73.anInt188].method129(this.anInt1014 - 12, this.anInt1015 - local70);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt966 == 10 && this.anInt874 == this.anIntArray223[local6]) {
							this.method613(local13, local13.anInt468 + 15);
							if (this.anInt1014 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array10[1].method129(this.anInt1014 - 12, this.anInt1015 - local70);
							}
						}
					}
					if (local13.aString6 != null && (local6 >= this.anInt906 || this.anInt888 == 0 || this.anInt888 == 3 || this.anInt888 == 1 && this.method663(7, ((Class1_Sub1_Sub1_Sub2_Sub1) local13).aString3))) {
						this.method613(local13, local13.anInt468);
						if (this.anInt1014 > -1 && this.anInt929 < this.anInt930) {
							this.anIntArray235[this.anInt929] = this.aClass1_Sub1_Sub2_Sub3_4.method264(local13.aString6) / 2;
							this.anIntArray234[this.anInt929] = this.aClass1_Sub1_Sub2_Sub3_4.anInt364;
							this.anIntArray232[this.anInt929] = this.anInt1014;
							this.anIntArray233[this.anInt929] = this.anInt1015;
							this.anIntArray236[this.anInt929] = local13.anInt457;
							this.anIntArray237[this.anInt929] = local13.anInt431;
							this.anIntArray238[this.anInt929] = local13.anInt470;
							this.aStringArray10[this.anInt929++] = local13.aString6;
							if (this.anInt890 == 0 && local13.anInt431 >= 1 && local13.anInt431 <= 3) {
								this.anIntArray234[this.anInt929] += 10;
								this.anIntArray233[this.anInt929] += 5;
							}
							if (this.anInt890 == 0 && local13.anInt431 == 4) {
								this.anIntArray235[this.anInt929] = 60;
							}
							if (this.anInt890 == 0 && local13.anInt431 == 5) {
								this.anIntArray234[this.anInt929] += 5;
							}
						}
					}
					if (local13.anInt436 > anInt1079) {
						this.method613(local13, local13.anInt468 + 15);
						if (this.anInt1014 > -1) {
							local70 = local13.anInt437 * 30 / local13.anInt438;
							if (local70 > 30) {
								local70 = 30;
							}
							Class1_Sub1_Sub2.method351(this.anInt1014 - 15, local70, 65280, this.anInt1015 - 3, 5);
							Class1_Sub1_Sub2.method351(this.anInt1014 + local70 - 15, 30 - local70, 16711680, this.anInt1015 - 3, 5);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray71[local70] > anInt1079) {
							this.method613(local13, local13.anInt468 / 2);
							if (this.anInt1014 > -1) {
								if (local70 == 1) {
									this.anInt1015 -= 20;
								}
								if (local70 == 2) {
									this.anInt1014 -= 15;
									this.anInt1015 -= 10;
								}
								if (local70 == 3) {
									this.anInt1014 += 15;
									this.anInt1015 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array8[local13.anIntArray70[local70]].method129(this.anInt1014 - 12, this.anInt1015 - 12);
								this.aClass1_Sub1_Sub2_Sub3_2.method261((byte) 3, this.anInt1015 + 4, 0, String.valueOf(local13.anIntArray69[local70]), this.anInt1014);
								this.aClass1_Sub1_Sub2_Sub3_2.method261((byte) 3, this.anInt1015 + 3, 16777215, String.valueOf(local13.anIntArray69[local70]), this.anInt1014 - 1);
							}
						}
					}
				}
			}
			for (@Pc(614) int local614 = 0; local614 < this.anInt929; local614++) {
				local70 = this.anIntArray232[local614];
				@Pc(626) int local626 = this.anIntArray233[local614];
				@Pc(631) int local631 = this.anIntArray235[local614];
				@Pc(636) int local636 = this.anIntArray234[local614];
				@Pc(638) boolean local638 = true;
				while (local638) {
					local638 = false;
					for (@Pc(644) int local644 = 0; local644 < local614; local644++) {
						if (local626 + 2 > this.anIntArray233[local644] - this.anIntArray234[local644] && local626 - local636 < this.anIntArray233[local644] + 2 && local70 - local631 < this.anIntArray232[local644] + this.anIntArray235[local644] && local70 + local631 > this.anIntArray232[local644] - this.anIntArray235[local644] && this.anIntArray233[local644] - this.anIntArray234[local644] < local626) {
							local626 = this.anIntArray233[local644] - this.anIntArray234[local644];
							local638 = true;
						}
					}
				}
				this.anInt1014 = this.anIntArray232[local614];
				this.anInt1015 = this.anIntArray233[local614] = local626;
				@Pc(743) String local743 = this.aStringArray10[local614];
				if (this.anInt890 == 0) {
					@Pc(748) int local748 = 16776960;
					if (this.anIntArray236[local614] < 6) {
						local748 = this.anIntArray266[this.anIntArray236[local614]];
					}
					if (this.anIntArray236[local614] == 6) {
						local748 = this.anInt1039 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray236[local614] == 7) {
						local748 = this.anInt1039 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray236[local614] == 8) {
						local748 = this.anInt1039 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(823) int local823;
					if (this.anIntArray236[local614] == 9) {
						local823 = 150 - this.anIntArray238[local614];
						if (local823 < 50) {
							local748 = local823 * 1280 + 16711680;
						} else if (local823 < 100) {
							local748 = 16776960 - (local823 - 50) * 327680;
						} else if (local823 < 150) {
							local748 = (local823 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray236[local614] == 10) {
						local823 = 150 - this.anIntArray238[local614];
						if (local823 < 50) {
							local748 = local823 * 5 + 16711680;
						} else if (local823 < 100) {
							local748 = 16711935 - (local823 - 50) * 327680;
						} else if (local823 < 150) {
							local748 = (local823 - 100) * 327680 + 255 - (local823 - 100) * 5;
						}
					}
					if (this.anIntArray236[local614] == 11) {
						local823 = 150 - this.anIntArray238[local614];
						if (local823 < 50) {
							local748 = 16777215 - local823 * 327685;
						} else if (local823 < 100) {
							local748 = (local823 - 50) * 327685 + 65280;
						} else if (local823 < 150) {
							local748 = 16777215 - (local823 - 100) * 327680;
						}
					}
					if (this.anIntArray237[local614] == 0) {
						this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, this.anInt1015 + 1, 0, local743, this.anInt1014);
						this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, this.anInt1015, local748, local743, this.anInt1014);
					}
					if (this.anIntArray237[local614] == 1) {
						this.aClass1_Sub1_Sub2_Sub3_4.method266(0, this.anInt1004, local743, this.anInt1039, this.anInt1015 + 1, this.anInt1014);
						this.aClass1_Sub1_Sub2_Sub3_4.method266(local748, this.anInt1004, local743, this.anInt1039, this.anInt1015, this.anInt1014);
					}
					if (this.anIntArray237[local614] == 2) {
						this.aClass1_Sub1_Sub2_Sub3_4.method267(666, this.anInt1039, local743, this.anInt1015 + 1, this.anInt1014, 0);
						this.aClass1_Sub1_Sub2_Sub3_4.method267(666, this.anInt1039, local743, this.anInt1015, this.anInt1014, local748);
					}
					if (this.anIntArray237[local614] == 3) {
						this.aClass1_Sub1_Sub2_Sub3_4.method268(local743, 0, this.anInt1015 + 1, this.anInt1014, this.anInt1039, 150 - this.anIntArray238[local614]);
						this.aClass1_Sub1_Sub2_Sub3_4.method268(local743, local748, this.anInt1015, this.anInt1014, this.anInt1039, 150 - this.anIntArray238[local614]);
					}
					@Pc(1122) int local1122;
					if (this.anIntArray237[local614] == 4) {
						local823 = this.aClass1_Sub1_Sub2_Sub3_4.method264(local743);
						local1122 = (150 - this.anIntArray238[local614]) * (local823 + 100) / 150;
						Class1_Sub1_Sub2.method348(0, this.anInt1014 + 50, 334, this.anInt1014 - 50);
						this.aClass1_Sub1_Sub2_Sub3_4.method265(this.anInt1014 + 50 - local1122, this.anInt1015 + 1, local743, 0);
						this.aClass1_Sub1_Sub2_Sub3_4.method265(this.anInt1014 + 50 - local1122, this.anInt1015, local743, local748);
						Class1_Sub1_Sub2.method347(this.anInt892);
					}
					if (this.anIntArray237[local614] == 5) {
						local823 = 150 - this.anIntArray238[local614];
						local1122 = 0;
						if (local823 < 25) {
							local1122 = local823 - 25;
						} else if (local823 > 125) {
							local1122 = local823 - 125;
						}
						Class1_Sub1_Sub2.method348(this.anInt1015 - this.aClass1_Sub1_Sub2_Sub3_4.anInt364 - 1, 512, this.anInt1015 + 5, 0);
						this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, this.anInt1015 + local1122 + 1, 0, local743, this.anInt1014);
						this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, this.anInt1015 + local1122, local748, local743, this.anInt1014);
						Class1_Sub1_Sub2.method347(this.anInt892);
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, this.anInt1015 + 1, 0, local743, this.anInt1014);
					this.aClass1_Sub1_Sub2_Sub3_4.method261((byte) 3, this.anInt1015, 16776960, local743, this.anInt1014);
				}
			}
		} catch (@Pc(1274) RuntimeException local1274) {
			signlink.reporterror("77614, " + -247 + ", " + local1274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EYMNCFMK;Z)V")
	private void method639(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt1076 = 0;
			this.anInt907 = 0;
			this.method655((byte) 9, arg0, arg1);
			this.method650(arg0, arg1);
			this.method677(arg1, arg0);
			this.method707(arg1, arg0);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt1076; local29++) {
				local36 = this.anIntArray267[local29];
				if (this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local36].anInt449 != anInt1079) {
					this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local36] = null;
				}
			}
			if (arg1.anInt301 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt301 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt906; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray223[local36]] == null) {
					signlink.reporterror(this.aString19 + " null entry in pl list - pos:" + local36 + " size:" + this.anInt906);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("1141, " + arg0 + ", " + arg1 + ", " + false + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!CUNQMRTU;)V")
	private void method640(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt224 == 0) {
				local1 = this.aClass9_1.method221(arg0.anInt223, arg0.anInt225, arg0.anInt226);
			}
			if (arg0.anInt224 == 1) {
				local1 = this.aClass9_1.method222(arg0.anInt226, arg0.anInt225, arg0.anInt223);
			}
			if (arg0.anInt224 == 2) {
				local1 = this.aClass9_1.method223(arg0.anInt223, arg0.anInt225, arg0.anInt226);
			}
			if (arg0.anInt224 == 3) {
				local1 = this.aClass9_1.method224(arg0.anInt223, arg0.anInt225, arg0.anInt226);
			}
			if (local1 != 0) {
				@Pc(83) int local83 = this.aClass9_1.method225(arg0.anInt223, arg0.anInt225, arg0.anInt226, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local83 & 0x1F;
				local7 = local83 >> 6;
			}
			arg0.anInt232 = local3;
			arg0.anInt234 = local5;
			arg0.anInt233 = local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("34929, " + false + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method641() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray257[local5 + 32512] = 255;
				}
			}
			@Pc(46) int local46;
			@Pc(53) int local53;
			@Pc(59) int local59;
			for (local12 = 0; local12 < 100; local12++) {
				local46 = (int) (Math.random() * 124.0D) + 2;
				local53 = (int) (Math.random() * 128.0D) + 128;
				local59 = local46 + (local53 << 7);
				this.anIntArray257[local59] = 192;
			}
			for (local46 = 1; local46 < 255; local46++) {
				for (local53 = 1; local53 < 127; local53++) {
					local59 = local53 + (local46 << 7);
					this.anIntArray258[local59] = (this.anIntArray257[local59 - 1] + this.anIntArray257[local59 + 1] + this.anIntArray257[local59 - 128] + this.anIntArray257[local59 + 128]) / 4;
				}
			}
			this.anInt1057 += 128;
			if (this.anInt1057 > this.anIntArray271.length) {
				this.anInt1057 -= this.anIntArray271.length;
				local53 = (int) (Math.random() * 12.0D);
				this.method637(this.aClass1_Sub1_Sub2_Sub4Array2[local53]);
			}
			@Pc(171) int local171;
			for (local53 = 1; local53 < 255; local53++) {
				for (local59 = 1; local59 < 127; local59++) {
					local171 = local59 + (local53 << 7);
					@Pc(194) int local194 = this.anIntArray258[local171 + 128] - this.anIntArray271[local171 + this.anInt1057 & this.anIntArray271.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray257[local171] = local194;
				}
			}
			for (local59 = 0; local59 < 255; local59++) {
				this.anIntArray273[local59] = this.anIntArray273[local59 + 1];
			}
			this.anIntArray273[255] = (int) (Math.sin((double) anInt1079 / 14.0D) * 16.0D + Math.sin((double) anInt1079 / 15.0D) * 14.0D + Math.sin((double) anInt1079 / 16.0D) * 12.0D);
			if (this.anInt880 > 0) {
				this.anInt880 -= 4;
			}
			if (this.anInt881 > 0) {
				this.anInt881 -= 4;
			}
			if (this.anInt880 == 0 && this.anInt881 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt880 = 1024;
				}
				if (local171 == 1) {
					this.anInt881 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("45804, " + 0 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ[B)V")
	private void method642(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (this.aBoolean212) {
				signlink.anInt1103 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("78158, " + arg0 + ", " + false + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt886 = Integer.parseInt(this.getParameter("nodeid"));
		anInt887 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method714();
		} else {
			method630();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean190 = false;
		} else {
			aBoolean190 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method643() {
		try {
			if (super.anInt853 == 1) {
				if (super.anInt854 >= 539 && super.anInt854 <= 573 && super.anInt855 >= 169 && super.anInt855 < 205 && this.anIntArray274[0] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 0;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 569 && super.anInt854 <= 599 && super.anInt855 >= 168 && super.anInt855 < 205 && this.anIntArray274[1] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 1;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 597 && super.anInt854 <= 627 && super.anInt855 >= 168 && super.anInt855 < 205 && this.anIntArray274[2] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 2;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 625 && super.anInt854 <= 669 && super.anInt855 >= 168 && super.anInt855 < 203 && this.anIntArray274[3] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 3;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 666 && super.anInt854 <= 696 && super.anInt855 >= 168 && super.anInt855 < 205 && this.anIntArray274[4] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 4;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 694 && super.anInt854 <= 724 && super.anInt855 >= 168 && super.anInt855 < 205 && this.anIntArray274[5] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 5;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 722 && super.anInt854 <= 756 && super.anInt855 >= 169 && super.anInt855 < 205 && this.anIntArray274[6] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 6;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 540 && super.anInt854 <= 574 && super.anInt855 >= 466 && super.anInt855 < 502 && this.anIntArray274[7] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 7;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 572 && super.anInt854 <= 602 && super.anInt855 >= 466 && super.anInt855 < 503 && this.anIntArray274[8] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 8;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 599 && super.anInt854 <= 629 && super.anInt855 >= 466 && super.anInt855 < 503 && this.anIntArray274[9] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 9;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 627 && super.anInt854 <= 671 && super.anInt855 >= 467 && super.anInt855 < 502 && this.anIntArray274[10] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 10;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 669 && super.anInt854 <= 699 && super.anInt855 >= 466 && super.anInt855 < 503 && this.anIntArray274[11] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 11;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 696 && super.anInt854 <= 726 && super.anInt855 >= 466 && super.anInt855 < 503 && this.anIntArray274[12] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 12;
					this.aBoolean192 = true;
				}
				if (super.anInt854 >= 724 && super.anInt854 <= 758 && super.anInt855 >= 466 && super.anInt855 < 502 && this.anIntArray274[13] != -1) {
					this.aBoolean200 = true;
					this.anInt965 = 13;
					this.aBoolean192 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("55836, " + 0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method644() {
		try {
			this.aBoolean216 &= true;
			while (true) {
				@Pc(11) int local11;
				do {
					while (true) {
						local11 = this.method580();
						if (local11 == -1) {
							return;
						}
						if (this.anInt998 != -1 && this.anInt998 == this.anInt1072) {
							if (local11 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							}
							break;
						}
						@Pc(191) int local191;
						if (this.aBoolean208) {
							if (local11 >= 32 && local11 <= 122 && this.aString25.length() < 80) {
								this.aString25 = this.aString25 + (char) local11;
								this.aBoolean194 = true;
							}
							if (local11 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
								this.aBoolean194 = true;
							}
							if (local11 == 13 || local11 == 10) {
								this.aBoolean208 = false;
								this.aBoolean194 = true;
								@Pc(151) long local151;
								if (this.anInt997 == 1) {
									local151 = Class20.method319(this.aString25);
									this.method723(local151);
								}
								if (this.anInt997 == 2 && this.anInt951 > 0) {
									local151 = Class20.method319(this.aString25);
									this.method702(local151);
								}
								if (this.anInt997 == 3 && this.aString25.length() > 0) {
									this.aClass1_Sub1_Sub3_7.method144(228);
									this.aClass1_Sub1_Sub3_7.method145(0);
									local191 = this.aClass1_Sub1_Sub3_7.anInt301;
									this.aClass1_Sub1_Sub3_7.method151(this.aLong33);
									Class15.method284(this.aClass1_Sub1_Sub3_7, this.aString25);
									this.aClass1_Sub1_Sub3_7.method154(this.aClass1_Sub1_Sub3_7.anInt301 - local191);
									this.aString25 = Class15.method285(this.aString25);
									this.aString25 = Class30.method447(this.aString25);
									this.method649(6, Class20.method323(this.aBoolean201, Class20.method320(this.aLong33)), this.aString25);
									if (this.anInt1074 == 2) {
										this.anInt1074 = 1;
										this.aBoolean206 = true;
										this.aClass1_Sub1_Sub3_7.method144(225);
										this.aClass1_Sub1_Sub3_7.method145(this.anInt888);
										this.aClass1_Sub1_Sub3_7.method145(this.anInt1074);
										this.aClass1_Sub1_Sub3_7.method145(this.anInt961);
									}
								}
								if (this.anInt997 == 4 && this.anInt893 < 100) {
									local151 = Class20.method319(this.aString25);
									this.method659(local151);
								}
								if (this.anInt997 == 5 && this.anInt893 > 0) {
									local151 = Class20.method319(this.aString25);
									this.method667(local151);
								}
							}
						} else if (this.anInt1041 == 1) {
							if (local11 >= 48 && local11 <= 57 && this.aString21.length() < 10) {
								this.aString21 = this.aString21 + (char) local11;
								this.aBoolean194 = true;
							}
							if (local11 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
								this.aBoolean194 = true;
							}
							if (local11 == 13 || local11 == 10) {
								if (this.aString21.length() > 0) {
									local191 = 0;
									try {
										local191 = Integer.parseInt(this.aString21);
									} catch (@Pc(369) Exception local369) {
									}
									this.aClass1_Sub1_Sub3_7.method144(144);
									this.aClass1_Sub1_Sub3_7.method149(local191);
								}
								this.anInt1041 = 0;
								this.aBoolean194 = true;
							}
						} else if (this.anInt1041 == 2) {
							if (local11 >= 32 && local11 <= 122 && this.aString21.length() < 12) {
								this.aString21 = this.aString21 + (char) local11;
								this.aBoolean194 = true;
							}
							if (local11 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
								this.aBoolean194 = true;
							}
							if (local11 == 13 || local11 == 10) {
								if (this.aString21.length() > 0) {
									this.aClass1_Sub1_Sub3_7.method144(60);
									this.aClass1_Sub1_Sub3_7.method151(Class20.method319(this.aString21));
								}
								this.anInt1041 = 0;
								this.aBoolean194 = true;
							}
						} else if (this.anInt1041 == 3) {
							if (local11 >= 32 && local11 <= 122 && this.aString21.length() < 40) {
								this.aString21 = this.aString21 + (char) local11;
								this.aBoolean194 = true;
							}
							if (local11 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
								this.aBoolean194 = true;
							}
						} else if (this.anInt911 == -1 && this.anInt1085 == -1) {
							if (local11 >= 32 && local11 <= 122 && this.aString23.length() < 80) {
								this.aString23 = this.aString23 + (char) local11;
								this.aBoolean194 = true;
							}
							if (local11 == 8 && this.aString23.length() > 0) {
								this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
								this.aBoolean194 = true;
							}
							if ((local11 == 13 || local11 == 10) && this.aString23.length() > 0) {
								if (this.anInt1049 == 2) {
									if (this.aString23.equals("::clientdrop")) {
										this.method710();
									}
									if (this.aString23.equals("::lag")) {
										this.method599();
									}
									if (this.aString23.equals("::prefetchmusic")) {
										for (local191 = 0; local191 < this.aClass12_Sub1_1.method532(2); local191++) {
											this.aClass12_Sub1_1.method535(2, (byte) 1, (byte) 8, local191);
										}
									}
									if (this.aString23.equals("::fpson")) {
										aBoolean217 = true;
									}
									if (this.aString23.equals("::fpsoff")) {
										aBoolean217 = false;
									}
									if (this.aString23.equals("::noclip")) {
										for (local191 = 0; local191 < 4; local191++) {
											for (@Pc(654) int local654 = 1; local654 < 103; local654++) {
												for (@Pc(658) int local658 = 1; local658 < 103; local658++) {
													this.aClass50Array1[local191].anIntArrayArray21[local654][local658] = 0;
												}
											}
										}
									}
								}
								if (this.aString23.startsWith("::")) {
									this.aClass1_Sub1_Sub3_7.method144(200);
									this.aClass1_Sub1_Sub3_7.method145(this.aString23.length() - 1);
									this.aClass1_Sub1_Sub3_7.method152(this.aString23.substring(2));
								} else {
									@Pc(713) String local713 = this.aString23.toLowerCase();
									@Pc(715) byte local715 = 0;
									if (local713.startsWith("yellow:")) {
										local715 = 0;
										this.aString23 = this.aString23.substring(7);
									} else if (local713.startsWith("red:")) {
										local715 = 1;
										this.aString23 = this.aString23.substring(4);
									} else if (local713.startsWith("green:")) {
										local715 = 2;
										this.aString23 = this.aString23.substring(6);
									} else if (local713.startsWith("cyan:")) {
										local715 = 3;
										this.aString23 = this.aString23.substring(5);
									} else if (local713.startsWith("purple:")) {
										local715 = 4;
										this.aString23 = this.aString23.substring(7);
									} else if (local713.startsWith("white:")) {
										local715 = 5;
										this.aString23 = this.aString23.substring(6);
									} else if (local713.startsWith("flash1:")) {
										local715 = 6;
										this.aString23 = this.aString23.substring(7);
									} else if (local713.startsWith("flash2:")) {
										local715 = 7;
										this.aString23 = this.aString23.substring(7);
									} else if (local713.startsWith("flash3:")) {
										local715 = 8;
										this.aString23 = this.aString23.substring(7);
									} else if (local713.startsWith("glow1:")) {
										local715 = 9;
										this.aString23 = this.aString23.substring(6);
									} else if (local713.startsWith("glow2:")) {
										local715 = 10;
										this.aString23 = this.aString23.substring(6);
									} else if (local713.startsWith("glow3:")) {
										local715 = 11;
										this.aString23 = this.aString23.substring(6);
									}
									local713 = this.aString23.toLowerCase();
									@Pc(887) byte local887 = 0;
									if (local713.startsWith("wave:")) {
										local887 = 1;
										this.aString23 = this.aString23.substring(5);
									} else if (local713.startsWith("wave2:")) {
										local887 = 2;
										this.aString23 = this.aString23.substring(6);
									} else if (local713.startsWith("shake:")) {
										local887 = 3;
										this.aString23 = this.aString23.substring(6);
									} else if (local713.startsWith("scroll:")) {
										local887 = 4;
										this.aString23 = this.aString23.substring(7);
									} else if (local713.startsWith("slide:")) {
										local887 = 5;
										this.aString23 = this.aString23.substring(6);
									}
									this.aClass1_Sub1_Sub3_7.method144(8);
									this.aClass1_Sub1_Sub3_7.method145(0);
									@Pc(968) int local968 = this.aClass1_Sub1_Sub3_7.anInt301;
									this.aClass1_Sub1_Sub3_6.anInt301 = 0;
									Class15.method284(this.aClass1_Sub1_Sub3_6, this.aString23);
									this.aClass1_Sub1_Sub3_7.method192(this.aClass1_Sub1_Sub3_6.anInt301, this.aClass1_Sub1_Sub3_6.aByteArray2);
									this.aClass1_Sub1_Sub3_7.method173(local887);
									this.aClass1_Sub1_Sub3_7.method172(local715, this.aBoolean211);
									this.aClass1_Sub1_Sub3_7.method154(this.aClass1_Sub1_Sub3_7.anInt301 - local968);
									this.aString23 = Class15.method285(this.aString23);
									this.aString23 = Class30.method447(this.aString23);
									aClass1_Sub1_Sub1_Sub2_Sub1_1.aString6 = this.aString23;
									aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt457 = local715;
									aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt431 = local887;
									aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt470 = 150;
									if (this.anInt1049 == 2) {
										this.method649(2, "@cr2@" + aClass1_Sub1_Sub1_Sub2_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub2_Sub1_1.aString6);
									} else if (this.anInt1049 == 1) {
										this.method649(2, "@cr1@" + aClass1_Sub1_Sub1_Sub2_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub2_Sub1_1.aString6);
									} else {
										this.method649(2, aClass1_Sub1_Sub1_Sub2_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub2_Sub1_1.aString6);
									}
									if (this.anInt888 == 2) {
										this.anInt888 = 3;
										this.aBoolean206 = true;
										this.aClass1_Sub1_Sub3_7.method144(225);
										this.aClass1_Sub1_Sub3_7.method145(this.anInt888);
										this.aClass1_Sub1_Sub3_7.method145(this.anInt1074);
										this.aClass1_Sub1_Sub3_7.method145(this.anInt961);
									}
								}
								this.aString23 = "";
								this.aBoolean194 = true;
							}
						}
					}
				} while ((local11 < 97 || local11 > 122) && (local11 < 65 || local11 > 90) && (local11 < 48 || local11 > 57) && local11 != 32);
				if (this.aString22.length() < 12) {
					this.aString22 = this.aString22 + (char) local11;
				}
			}
		} catch (@Pc(1122) RuntimeException local1122) {
			signlink.reporterror("43636, " + true + ", " + local1122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method645() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub3_4.method263("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt1054; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub3_4.method263(this.aStringArray9[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt1054 * 15 + 21;
			@Pc(71) int local71;
			@Pc(89) int local89;
			if (super.anInt854 > 4 && super.anInt855 > 4 && super.anInt854 < 516 && super.anInt855 < 338) {
				local71 = super.anInt854 - local7 / 2 - 4;
				if (local71 + local7 > 512) {
					local71 = 512 - local7;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt855 - 4;
				if (local89 + local20 > 334) {
					local89 = 334 - local20;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.aBoolean225 = true;
				this.anInt1025 = 0;
				this.anInt1026 = local71;
				this.anInt1027 = local89;
				this.anInt1028 = local7;
				this.anInt1029 = this.anInt1054 * 15 + 22;
			}
			if (super.anInt854 > 553 && super.anInt855 > 205 && super.anInt854 < 743 && super.anInt855 < 466) {
				local71 = super.anInt854 - local7 / 2 - 553;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 190) {
					local71 = 190 - local7;
				}
				local89 = super.anInt855 - 205;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 261) {
					local89 = 261 - local20;
				}
				this.aBoolean225 = true;
				this.anInt1025 = 1;
				this.anInt1026 = local71;
				this.anInt1027 = local89;
				this.anInt1028 = local7;
				this.anInt1029 = this.anInt1054 * 15 + 22;
			}
			if (super.anInt854 > 17 && super.anInt855 > 357 && super.anInt854 < 496 && super.anInt855 < 453) {
				local71 = super.anInt854 - local7 / 2 - 17;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 479) {
					local71 = 479 - local7;
				}
				local89 = super.anInt855 - 357;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 96) {
					local89 = 96 - local20;
				}
				this.aBoolean225 = true;
				this.anInt1025 = 2;
				this.anInt1026 = local71;
				this.anInt1027 = local89;
				this.anInt1028 = local7;
				this.anInt1029 = this.anInt1054 * 15 + 22;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("23673, " + -44689 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method646(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass48_24 == null) {
				this.method621();
				super.aClass48_2 = null;
				this.aClass48_12 = null;
				this.aClass48_13 = null;
				this.aClass48_14 = null;
				this.aClass48_15 = null;
				@Pc(26) boolean local26 = false;
				this.aClass48_16 = null;
				this.aClass48_17 = null;
				this.aClass48_18 = null;
				this.aClass48_19 = null;
				this.aClass48_20 = null;
				this.aClass48_24 = new Class48(this.method586(), 479, 96, (byte) 52);
				this.aClass48_22 = new Class48(this.method586(), 172, 156, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass1_Sub1_Sub2_Sub4_14.method363(0, 0);
				this.aClass48_21 = new Class48(this.method586(), 190, 261, (byte) 52);
				this.aClass48_23 = new Class48(this.method586(), 512, 334, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_25 = new Class48(this.method586(), 496, 50, (byte) 52);
				this.aClass48_26 = new Class48(this.method586(), 269, 37, (byte) 52);
				this.aClass48_27 = new Class48(this.method586(), 249, 45, (byte) 52);
				this.aBoolean184 = true;
				this.aClass48_23.method555();
				Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("81234, " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method647() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt906; local3++) {
				if (local3 == -1) {
					local11 = this.anInt905;
				} else {
					local11 = this.anIntArray223[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub2_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local11];
				if (local23 != null && local23.anInt470 > 0) {
					local23.anInt470--;
					if (local23.anInt470 == 0) {
						local23.aString6 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt920; local11++) {
				@Pc(54) int local54 = this.anIntArray227[local11];
				@Pc(59) Class1_Sub1_Sub1_Sub2_Sub2 local59 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local54];
				if (local59 != null && local59.anInt470 > 0) {
					local59.anInt470--;
					if (local59.anInt470 == 0) {
						local59.aString6 = null;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("42690, " + -903 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class43 local6 = Class43.method515(arg1);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray184.length && local6.anIntArray184[local8] != -1; local8++) {
				@Pc(22) Class43 local22 = Class43.method515(local6.anIntArray184[local8]);
				if (local22.anInt759 == 0) {
					local3 |= this.method648(arg0, local22.anInt755);
				}
				@Pc(56) int local56;
				if (local22.anInt759 == 6 && (local22.anInt743 != -1 || local22.anInt744 != -1)) {
					@Pc(51) boolean local51 = this.method623(local22);
					if (local51) {
						local56 = local22.anInt744;
					} else {
						local56 = local22.anInt743;
					}
					if (local56 != -1) {
						@Pc(68) Class7 local68 = Class7.aClass7Array1[local56];
						local22.anInt736 += arg0;
						while (local22.anInt736 > local68.method103((byte) 6, local22.anInt749)) {
							local22.anInt736 -= local68.method103((byte) 6, local22.anInt749);
							local22.anInt749++;
							if (local22.anInt749 >= local68.anInt237) {
								local22.anInt749 -= local68.anInt238;
								if (local22.anInt749 < 0 || local22.anInt749 >= local68.anInt237) {
									local22.anInt749 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local22.anInt759 == 6 && local22.anInt748 != 0) {
					@Pc(137) int local137 = local22.anInt748 >> 16;
					local56 = local22.anInt748 << 16 >> 16;
					@Pc(148) int local148 = local137 * arg0;
					local56 *= arg0;
					local22.anInt753 = local22.anInt753 + local148 & 0x7FF;
					local22.anInt754 = local22.anInt754 + local56 & 0x7FF;
					local3 = true;
				}
			}
			this.anInt991 += 0;
			return local3;
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("63998, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method649(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt990 != -1) {
				this.aString17 = arg2;
				super.anInt853 = 0;
			}
			if (this.anInt911 == -1) {
				this.aBoolean194 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray247[local20] = this.anIntArray247[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
			}
			this.anIntArray247[0] = arg0;
			this.anInt991 += 0;
			this.aStringArray11[0] = arg1;
			this.aStringArray12[0] = arg2;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("49064, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!EYMNCFMK;)V")
	private void method650(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method166(8);
			@Pc(25) int local25;
			if (local6 < this.anInt906) {
				for (local25 = local6; local25 < this.anInt906; local25++) {
					this.anIntArray267[this.anInt1076++] = this.anIntArray223[local25];
				}
			}
			if (local6 > this.anInt906) {
				signlink.reporterror(this.aString19 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt906 = 0;
			for (local25 = 0; local25 < local6; local25++) {
				@Pc(77) int local77 = this.anIntArray223[local25];
				@Pc(82) Class1_Sub1_Sub1_Sub2_Sub1 local82 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local77];
				@Pc(87) int local87 = arg1.method166(1);
				if (local87 == 0) {
					this.anIntArray223[this.anInt906++] = local77;
					local82.anInt449 = anInt1079;
				} else {
					@Pc(110) int local110 = arg1.method166(2);
					if (local110 == 0) {
						this.anIntArray223[this.anInt906++] = local77;
						local82.anInt449 = anInt1079;
						this.anIntArray224[this.anInt907++] = local77;
					} else {
						@Pc(161) int local161;
						@Pc(171) int local171;
						if (local110 == 1) {
							this.anIntArray223[this.anInt906++] = local77;
							local82.anInt449 = anInt1079;
							local161 = arg1.method166(3);
							local82.method304(false, local161);
							local171 = arg1.method166(1);
							if (local171 == 1) {
								this.anIntArray224[this.anInt907++] = local77;
							}
						} else if (local110 == 2) {
							this.anIntArray223[this.anInt906++] = local77;
							local82.anInt449 = anInt1079;
							local161 = arg1.method166(3);
							local82.method304(true, local161);
							local171 = arg1.method166(3);
							local82.method304(true, local171);
							@Pc(229) int local229 = arg1.method166(1);
							if (local229 == 1) {
								this.anIntArray224[this.anInt907++] = local77;
							}
						} else if (local110 == 3) {
							this.anIntArray267[this.anInt1076++] = local77;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("44530, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method651() {
		try {
			if (this.anInt862 == 0 && this.anInt1091 == 0) {
				this.aStringArray9[this.anInt1054] = "Walk here";
				this.anIntArray216[this.anInt1054] = 842;
				this.anIntArray214[this.anInt1054] = super.anInt848;
				this.anIntArray215[this.anInt1054] = super.anInt849;
				this.anInt1054++;
			}
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < Class1_Sub1_Sub1_Sub5.anInt613; local52++) {
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray125[local52];
				@Pc(62) int local62 = local58 & 0x7F;
				@Pc(68) int local68 = local58 >> 7 & 0x7F;
				@Pc(74) int local74 = local58 >> 29 & 0x3;
				@Pc(80) int local80 = local58 >> 14 & 0x7FFF;
				if (local58 != local50) {
					local50 = local58;
					@Pc(227) int local227;
					if (local74 == 2 && this.aClass9_1.method225(this.anInt918, local62, local68, local58) >= 0) {
						@Pc(100) Class44 local100 = Class44.method519(local80);
						if (local100.anIntArray193 != null) {
							local100 = local100.method523();
						}
						if (local100 == null) {
							continue;
						}
						if (this.anInt862 == 1) {
							this.aStringArray9[this.anInt1054] = "Use " + this.aString18 + " with @cya@" + local100.aString15;
							this.anIntArray216[this.anInt1054] = 82;
							this.anIntArray217[this.anInt1054] = local58;
							this.anIntArray214[this.anInt1054] = local62;
							this.anIntArray215[this.anInt1054] = local68;
							this.anInt1054++;
						} else if (this.anInt1091 != 1) {
							if (local100.aStringArray7 != null) {
								for (local227 = 4; local227 >= 0; local227--) {
									if (local100.aStringArray7[local227] != null) {
										this.aStringArray9[this.anInt1054] = local100.aStringArray7[local227] + " @cya@" + local100.aString15;
										if (local227 == 0) {
											this.anIntArray216[this.anInt1054] = 26;
										}
										if (local227 == 1) {
											this.anIntArray216[this.anInt1054] = 534;
										}
										if (local227 == 2) {
											this.anIntArray216[this.anInt1054] = 400;
										}
										if (local227 == 3) {
											this.anIntArray216[this.anInt1054] = 744;
										}
										if (local227 == 4) {
											this.anIntArray216[this.anInt1054] = 1039;
										}
										this.anIntArray217[this.anInt1054] = local58;
										this.anIntArray214[this.anInt1054] = local62;
										this.anIntArray215[this.anInt1054] = local68;
										this.anInt1054++;
									}
								}
							}
							this.aStringArray9[this.anInt1054] = "Examine @cya@" + local100.aString15;
							this.anIntArray216[this.anInt1054] = 1498;
							this.anIntArray217[this.anInt1054] = local100.anInt762 << 14;
							this.anIntArray214[this.anInt1054] = local62;
							this.anIntArray215[this.anInt1054] = local68;
							this.anInt1054++;
						} else if ((this.anInt1093 & 0x4) == 4) {
							this.aStringArray9[this.anInt1054] = this.aString30 + " @cya@" + local100.aString15;
							this.anIntArray216[this.anInt1054] = 499;
							this.anIntArray217[this.anInt1054] = local58;
							this.anIntArray214[this.anInt1054] = local62;
							this.anIntArray215[this.anInt1054] = local68;
							this.anInt1054++;
						}
					}
					@Pc(407) Class1_Sub1_Sub1_Sub2_Sub2 local407;
					@Pc(455) Class1_Sub1_Sub1_Sub2_Sub1 local455;
					@Pc(445) int local445;
					if (local74 == 1) {
						@Pc(378) Class1_Sub1_Sub1_Sub2_Sub2 local378 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local80];
						if (local378.aClass31_2.aByte18 == 1 && (local378.anInt428 & 0x7F) == 64 && (local378.anInt429 & 0x7F) == 64) {
							for (local227 = 0; local227 < this.anInt920; local227++) {
								local407 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray227[local227]];
								if (local407 != null && local407 != local378 && local407.aClass31_2.aByte18 == 1 && local407.anInt428 == local378.anInt428 && local407.anInt429 == local378.anInt429) {
									this.method705(this.anIntArray227[local227], local68, local62, local407.aClass31_2);
								}
							}
							for (local445 = 0; local445 < this.anInt906; local445++) {
								local455 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray223[local445]];
								if (local455 != null && local455.anInt428 == local378.anInt428 && local455.anInt429 == local378.anInt429) {
									this.method595(local68, this.anIntArray223[local445], local62, local455);
								}
							}
						}
						this.method705(local80, local68, local62, local378.aClass31_2);
					}
					if (local74 == 0) {
						@Pc(497) Class1_Sub1_Sub1_Sub2_Sub1 local497 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local80];
						if ((local497.anInt428 & 0x7F) == 64 && (local497.anInt429 & 0x7F) == 64) {
							for (local227 = 0; local227 < this.anInt920; local227++) {
								local407 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray227[local227]];
								if (local407 != null && local407.aClass31_2.aByte18 == 1 && local407.anInt428 == local497.anInt428 && local407.anInt429 == local497.anInt429) {
									this.method705(this.anIntArray227[local227], local68, local62, local407.aClass31_2);
								}
							}
							for (local445 = 0; local445 < this.anInt906; local445++) {
								local455 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray223[local445]];
								if (local455 != null && local455 != local497 && local455.anInt428 == local497.anInt428 && local455.anInt429 == local497.anInt429) {
									this.method595(local68, this.anIntArray223[local445], local62, local455);
								}
							}
						}
						this.method595(local68, local80, local62, local497);
					}
					if (local74 == 3) {
						@Pc(616) Class6 local616 = this.aClass6ArrayArrayArray1[this.anInt918][local62][local68];
						if (local616 != null) {
							for (@Pc(623) Class1_Sub1_Sub1_Sub6 local623 = (Class1_Sub1_Sub1_Sub6) local616.method98(); local623 != null; local623 = (Class1_Sub1_Sub1_Sub6) local616.method100()) {
								@Pc(629) Class19 local629 = Class19.method315(local623.anInt719);
								if (this.anInt862 == 1) {
									this.aStringArray9[this.anInt1054] = "Use " + this.aString18 + " with @lre@" + local629.aString7;
									this.anIntArray216[this.anInt1054] = 823;
									this.anIntArray217[this.anInt1054] = local623.anInt719;
									this.anIntArray214[this.anInt1054] = local62;
									this.anIntArray215[this.anInt1054] = local68;
									this.anInt1054++;
								} else if (this.anInt1091 != 1) {
									for (@Pc(746) int local746 = 4; local746 >= 0; local746--) {
										if (local629.aStringArray1 != null && local629.aStringArray1[local746] != null) {
											this.aStringArray9[this.anInt1054] = local629.aStringArray1[local746] + " @lre@" + local629.aString7;
											if (local746 == 0) {
												this.anIntArray216[this.anInt1054] = 642;
											}
											if (local746 == 1) {
												this.anIntArray216[this.anInt1054] = 868;
											}
											if (local746 == 2) {
												this.anIntArray216[this.anInt1054] = 10;
											}
											if (local746 == 3) {
												this.anIntArray216[this.anInt1054] = 87;
											}
											if (local746 == 4) {
												this.anIntArray216[this.anInt1054] = 705;
											}
											this.anIntArray217[this.anInt1054] = local623.anInt719;
											this.anIntArray214[this.anInt1054] = local62;
											this.anIntArray215[this.anInt1054] = local68;
											this.anInt1054++;
										} else if (local746 == 2) {
											this.aStringArray9[this.anInt1054] = "Take @lre@" + local629.aString7;
											this.anIntArray216[this.anInt1054] = 10;
											this.anIntArray217[this.anInt1054] = local623.anInt719;
											this.anIntArray214[this.anInt1054] = local62;
											this.anIntArray215[this.anInt1054] = local68;
											this.anInt1054++;
										}
									}
									this.aStringArray9[this.anInt1054] = "Examine @lre@" + local629.aString7;
									this.anIntArray216[this.anInt1054] = 1937;
									this.anIntArray217[this.anInt1054] = local623.anInt719;
									this.anIntArray214[this.anInt1054] = local62;
									this.anIntArray215[this.anInt1054] = local68;
									this.anInt1054++;
								} else if ((this.anInt1093 & 0x1) == 1) {
									this.aStringArray9[this.anInt1054] = this.aString30 + " @lre@" + local629.aString7;
									this.anIntArray216[this.anInt1054] = 652;
									this.anIntArray217[this.anInt1054] = local623.anInt719;
									this.anIntArray214[this.anInt1054] = local62;
									this.anIntArray215[this.anInt1054] = local68;
									this.anInt1054++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(953) RuntimeException local953) {
			signlink.reporterror("59902, " + -82 + ", " + local953.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method652(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!EYMNCFMK;)V")
	private void method653(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt302 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method166(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub2_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub2_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local12];
						this.anIntArray227[this.anInt920++] = local12;
						local32.anInt449 = anInt1079;
						@Pc(51) int local51 = arg1.method166(1);
						local32.aClass31_2 = Class31.method479(arg1.method166(13));
						@Pc(63) int local63 = arg1.method166(5);
						if (local63 > 15) {
							local63 -= 32;
						}
						@Pc(72) int local72 = arg1.method166(1);
						if (local72 == 1) {
							this.anIntArray224[this.anInt907++] = local12;
						}
						@Pc(91) int local91 = arg1.method166(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						local32.anInt448 = local32.aClass31_2.aByte18;
						local32.anInt460 = local32.aClass31_2.anInt655;
						local32.anInt432 = local32.aClass31_2.anInt651;
						local32.anInt433 = local32.aClass31_2.anInt656;
						local32.anInt434 = local32.aClass31_2.anInt657;
						local32.anInt435 = local32.aClass31_2.anInt659;
						local32.anInt461 = local32.aClass31_2.anInt653;
						local32.method303(local51 == 1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0] + local63, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0] + local91);
						continue;
					}
				}
				arg1.method167(this.aByte31);
				return;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("11731, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 46534) {
				this.aClass1_Sub1_Sub3_7.method145(250);
			}
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("65902, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!EYMNCFMK;)V")
	private void method655(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(4) boolean local4 = false;
			arg2.method165((byte) 9);
			@Pc(18) int local18 = arg2.method166(1);
			if (local18 != 0) {
				@Pc(26) int local26 = arg2.method166(2);
				if (local26 == 0) {
					this.anIntArray224[this.anInt907++] = this.anInt905;
				} else {
					@Pc(49) int local49;
					@Pc(59) int local59;
					if (local26 == 1) {
						local49 = arg2.method166(3);
						aClass1_Sub1_Sub1_Sub2_Sub1_1.method304(false, local49);
						local59 = arg2.method166(1);
						if (local59 == 1) {
							this.anIntArray224[this.anInt907++] = this.anInt905;
						}
					} else {
						@Pc(103) int local103;
						if (local26 == 2) {
							local49 = arg2.method166(3);
							aClass1_Sub1_Sub1_Sub2_Sub1_1.method304(true, local49);
							local59 = arg2.method166(3);
							aClass1_Sub1_Sub1_Sub2_Sub1_1.method304(true, local59);
							local103 = arg2.method166(1);
							if (local103 == 1) {
								this.anIntArray224[this.anInt907++] = this.anInt905;
							}
						} else if (local26 == 3) {
							local49 = arg2.method166(1);
							if (local49 == 1) {
								this.anIntArray224[this.anInt907++] = this.anInt905;
							}
							local59 = arg2.method166(7);
							this.anInt918 = arg2.method166(2);
							local103 = arg2.method166(7);
							@Pc(163) int local163 = arg2.method166(1);
							aClass1_Sub1_Sub1_Sub2_Sub1_1.method303(local163 == 1, local103, local59);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("12489, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
	private void method656(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1105 = arg0;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("80976, " + arg0 + ", " + false + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method657() {
		try {
			this.aClass1_Sub1_Sub3_7.method144(64);
			if (this.anInt954 != -1) {
				this.method716(this.anInt954);
				this.anInt954 = -1;
				this.aBoolean200 = true;
				this.aBoolean224 = false;
				this.aBoolean192 = true;
			}
			if (this.anInt911 != -1) {
				this.method716(this.anInt911);
				this.anInt911 = -1;
				this.aBoolean194 = true;
				this.aBoolean224 = false;
			}
			if (this.anInt1085 != -1) {
				this.method716(this.anInt1085);
				this.anInt1085 = -1;
				this.aBoolean184 = true;
			}
			if (this.anInt882 != -1) {
				this.method716(this.anInt882);
				this.anInt882 = -1;
			}
			if (this.anInt998 != -1) {
				this.method716(this.anInt998);
				this.anInt998 = -1;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("19932, " + false + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method658() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub1 local6 = (Class1_Sub1_Sub1_Sub1) this.aClass6_10.method97(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub1) this.aClass6_10.method99(569)) {
				if (local6.anInt13 != this.anInt918 || local6.aBoolean7) {
					local6.method501();
				} else if (anInt1079 >= local6.anInt17) {
					local6.method12(759, this.anInt866);
					if (local6.aBoolean7) {
						local6.method501();
					} else {
						this.aClass9_1.method206(60, this.anInt1089, 0, local6.anInt13, local6.anInt15, false, local6.anInt16, -1, local6, local6.anInt14);
					}
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("20042, " + -724 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method659(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt893 >= 100) {
					this.method649(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(24) String local24 = Class20.method323(this.aBoolean201, Class20.method320(arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt893; local26++) {
						if (this.aLongArray4[local26] == arg0) {
							this.method649(0, "", local24 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(56) int local56 = 0; local56 < this.anInt951; local56++) {
						if (this.aLongArray3[local56] == arg0) {
							this.method649(0, "", "Please remove " + local24 + " from your friend list first");
							return;
						}
					}
					this.aLongArray4[this.anInt893++] = arg0;
					this.aBoolean200 = true;
					this.aClass1_Sub1_Sub3_7.method144(74);
					this.aClass1_Sub1_Sub3_7.method151(arg0);
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("41090, " + arg0 + ", " + 9 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(IZ)V")
	private void method660(@OriginalArg(1) boolean arg0) {
		try {
			this.method661();
			this.aClass48_14.method555();
			this.aClass1_Sub1_Sub2_Sub4_9.method363(0, 0);
			@Pc(47) byte local47;
			@Pc(59) int local59;
			if (this.anInt919 == 0) {
				this.aClass1_Sub1_Sub2_Sub3_2.method262(7711145, true, 180, 180, this.aClass12_Sub1_1.aString16);
				local47 = 80;
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16776960, true, 80, 180, "Welcome to RuneScape");
				local59 = local47 + 30;
				this.aClass1_Sub1_Sub2_Sub4_10.method363(27, 100);
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 125, 100, "New User");
				this.aClass1_Sub1_Sub2_Sub4_10.method363(187, 100);
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 125, 260, "Existing User");
			}
			if (this.anInt919 == 2) {
				local47 = 60;
				if (this.aString28.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub3_4.method262(16776960, true, 45, 180, this.aString28);
					this.aClass1_Sub1_Sub2_Sub3_4.method262(16776960, true, 60, 180, this.aString29);
					local59 = local47 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub3_4.method262(16776960, true, 53, 180, this.aString29);
					local59 = local47 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub3_4.method269(true, "Username: " + this.aString19 + (this.anInt909 == 0 & anInt1079 % 40 < 20 ? "@yel@|" : ""), 90, 16777215, 90);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub3_4.method269(true, "Password: " + Class20.method324(this.aString20) + (this.anInt909 == 1 & anInt1079 % 40 < 20 ? "@yel@|" : ""), 105, 16777215, 92);
				local59 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub4_10.method363(27, 130);
					this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 155, 100, "Login");
					this.aClass1_Sub1_Sub2_Sub4_10.method363(187, 130);
					this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 155, 260, "Cancel");
				}
			}
			if (this.anInt919 == 3) {
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16776960, true, 40, 180, "Create a free account");
				local47 = 65;
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 65, 180, "To create a new account you need to");
				local59 = local47 + 15;
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 80, 180, "go back to the main RuneScape webpage");
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 95, 180, "and choose the 'create account'");
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 110, 180, "button near the top of that page.");
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub4_10.method363(107, 130);
				this.aClass1_Sub1_Sub2_Sub3_4.method262(16777215, true, 155, 180, "Cancel");
			}
			this.aClass48_14.method556(super.aGraphics2, 171, 904, 202);
			if (this.aBoolean184) {
				this.aBoolean184 = false;
				this.aClass48_12.method556(super.aGraphics2, 0, 904, 128);
				this.aClass48_13.method556(super.aGraphics2, 371, 904, 202);
				this.aClass48_17.method556(super.aGraphics2, 265, 904, 0);
				this.aClass48_18.method556(super.aGraphics2, 265, 904, 562);
				this.aClass48_19.method556(super.aGraphics2, 171, 904, 128);
				this.aClass48_20.method556(super.aGraphics2, 171, 904, 562);
			}
		} catch (@Pc(492) RuntimeException local492) {
			signlink.reporterror("94252, " + 0 + ", " + arg0 + ", " + local492.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method661() {
		try {
			if (this.aClass48_12 == null) {
				super.aClass48_2 = null;
				this.aClass48_24 = null;
				this.aClass48_22 = null;
				this.aClass48_21 = null;
				this.aClass48_23 = null;
				this.aClass48_25 = null;
				this.aClass48_26 = null;
				this.aClass48_27 = null;
				this.aClass48_15 = new Class48(this.method586(), 128, 265, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_16 = new Class48(this.method586(), 128, 265, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_12 = new Class48(this.method586(), 509, 171, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_13 = new Class48(this.method586(), 360, 132, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_14 = new Class48(this.method586(), 360, 200, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_17 = new Class48(this.method586(), 202, 238, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_18 = new Class48(this.method586(), 203, 238, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_19 = new Class48(this.method586(), 74, 94, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				this.aClass48_20 = new Class48(this.method586(), 75, 94, (byte) 52);
				Class1_Sub1_Sub2.method349(468);
				if (this.aClass13_2 != null) {
					this.method618();
					this.method625();
				}
				this.aBoolean184 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("4393, " + -505 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub4_11.method363(arg1, arg0);
			this.aClass1_Sub1_Sub2_Sub4_12.method363(arg1, arg0 + arg4 - 16);
			Class1_Sub1_Sub2.method351(arg1, 16, this.anInt877, arg0 + 16, arg4 - 32);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg3;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg2 / (arg3 - arg4);
			Class1_Sub1_Sub2.method351(arg1, 16, this.anInt912, arg0 + local52 + 16, local35);
			Class1_Sub1_Sub2.method356(this.anInt960, arg0 + local52 + 16, arg1, local35);
			this.anInt991 += 0;
			Class1_Sub1_Sub2.method356(this.anInt960, arg0 + local52 + 16, arg1 + 1, local35);
			Class1_Sub1_Sub2.method354(arg0 + local52 + 16, this.anInt960, arg1, this.anInt1056, 16);
			Class1_Sub1_Sub2.method354(arg0 + local52 + 17, this.anInt960, arg1, this.anInt1056, 16);
			Class1_Sub1_Sub2.method356(this.anInt1017, arg0 + local52 + 16, arg1 + 15, local35);
			Class1_Sub1_Sub2.method356(this.anInt1017, arg0 + local52 + 17, arg1 + 14, local35 - 1);
			Class1_Sub1_Sub2.method354(arg0 + local52 + local35 + 15, this.anInt1017, arg1, this.anInt1056, 16);
			Class1_Sub1_Sub2.method354(arg0 + local52 + local35 + 14, this.anInt1017, arg1 + 1, this.anInt1056, 15);
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("8629, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method663(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt951; local5++) {
				if (arg1.equalsIgnoreCase(this.aStringArray14[local5])) {
					return true;
				}
			}
			@Pc(25) boolean local25 = true;
			return arg1.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub2_Sub1_1.aString3);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("25532, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!VTUPBFSN;I)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class43 arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg3.anInt759 == 0 && arg3.anIntArray184 != null && (!arg3.aBoolean148 || this.anInt915 == arg3.anInt755 || this.anInt987 == arg3.anInt755 || this.anInt1048 == arg3.anInt755)) {
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt554;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt552;
				@Pc(37) int local37 = Class1_Sub1_Sub2.anInt555;
				@Pc(39) int local39 = Class1_Sub1_Sub2.anInt553;
				Class1_Sub1_Sub2.method348(arg1, arg0 + arg3.anInt742, arg1 + arg3.anInt727, arg0);
				@Pc(55) int local55 = arg3.anIntArray184.length;
				for (@Pc(57) int local57 = 0; local57 < local55; local57++) {
					@Pc(66) int local66 = arg3.anIntArray186[local57] + arg0;
					@Pc(75) int local75 = arg3.anIntArray187[local57] + arg1 - arg2;
					@Pc(81) Class43 local81 = Class43.method515(arg3.anIntArray184[local57]);
					@Pc(86) int local86 = local66 + local81.anInt745;
					@Pc(91) int local91 = local75 + local81.anInt737;
					if (local81.anInt725 > 0) {
						this.method690(local81);
					}
					if (local81.anInt759 == 0) {
						if (local81.anInt738 > local81.anInt724 - local81.anInt727) {
							local81.anInt738 = local81.anInt724 - local81.anInt727;
						}
						if (local81.anInt738 < 0) {
							local81.anInt738 = 0;
						}
						this.method664(local86, local91, local81.anInt738, local81, 726);
						if (local81.anInt724 > local81.anInt727) {
							this.method662(local91, local86 + local81.anInt742, local81.anInt738, local81.anInt724, local81.anInt727);
						}
					} else if (local81.anInt759 != 1) {
						@Pc(163) int local163;
						@Pc(167) int local167;
						@Pc(178) int local178;
						@Pc(213) int local213;
						@Pc(220) int local220;
						@Pc(245) int local245;
						@Pc(161) int local161;
						@Pc(211) int local211;
						if (local81.anInt759 == 2) {
							local161 = 0;
							for (local163 = 0; local163 < local81.anInt727; local163++) {
								for (local167 = 0; local167 < local81.anInt742; local167++) {
									local178 = local86 + local167 * (local81.anInt760 + 32);
									@Pc(187) int local187 = local91 + local163 * (local81.anInt739 + 32);
									if (local161 < 20) {
										local178 += local81.anIntArray188[local161];
										local187 += local81.anIntArray185[local161];
									}
									if (local81.anIntArray190[local161] > 0) {
										local211 = 0;
										local213 = 0;
										local220 = local81.anIntArray190[local161] - 1;
										if (local178 > Class1_Sub1_Sub2.anInt554 - 32 && local178 < Class1_Sub1_Sub2.anInt555 && local187 > Class1_Sub1_Sub2.anInt552 - 32 && local187 < Class1_Sub1_Sub2.anInt553 || this.anInt975 != 0 && this.anInt974 == local161) {
											local245 = 0;
											if (this.anInt862 == 1 && this.anInt863 == local161 && this.anInt864 == local81.anInt755) {
												local245 = 16777215;
											}
											@Pc(269) Class1_Sub1_Sub2_Sub2 local269 = Class19.method312(local245, local81.anIntArray189[local161], local220);
											if (local269 != null) {
												@Pc(348) int local348;
												if (this.anInt975 != 0 && this.anInt974 == local161 && this.anInt973 == local81.anInt755) {
													local211 = super.anInt848 - this.anInt976;
													local213 = super.anInt849 - this.anInt977;
													if (local211 < 5 && local211 > -5) {
														local211 = 0;
													}
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (this.anInt943 < 5) {
														local211 = 0;
														local213 = 0;
													}
													local269.method131(local187 + local213, local178 + local211);
													if (local187 + local213 < Class1_Sub1_Sub2.anInt552 && arg3.anInt738 > 0) {
														local348 = this.anInt866 * (Class1_Sub1_Sub2.anInt552 - local187 - local213) / 3;
														if (local348 > this.anInt866 * 10) {
															local348 = this.anInt866 * 10;
														}
														if (local348 > arg3.anInt738) {
															local348 = arg3.anInt738;
														}
														arg3.anInt738 -= local348;
														this.anInt977 += local348;
													}
													if (local187 + local213 + 32 > Class1_Sub1_Sub2.anInt553 && arg3.anInt738 < arg3.anInt724 - arg3.anInt727) {
														local348 = this.anInt866 * (local187 + local213 + 32 - Class1_Sub1_Sub2.anInt553) / 3;
														if (local348 > this.anInt866 * 10) {
															local348 = this.anInt866 * 10;
														}
														if (local348 > arg3.anInt724 - arg3.anInt727 - arg3.anInt738) {
															local348 = arg3.anInt724 - arg3.anInt727 - arg3.anInt738;
														}
														arg3.anInt738 += local348;
														this.anInt977 -= local348;
													}
												} else if (this.anInt1033 != 0 && this.anInt1032 == local161 && this.anInt1031 == local81.anInt755) {
													local269.method131(local187, local178);
												} else {
													local269.method129(local178, local187);
												}
												if (local269.anInt286 == 33 || local81.anIntArray189[local161] != 1) {
													local348 = local81.anIntArray189[local161];
													this.aClass1_Sub1_Sub2_Sub3_2.method265(local178 + local211 + 1, local187 + 10 + local213, method694(local348), 0);
													this.aClass1_Sub1_Sub2_Sub3_2.method265(local178 + local211, local187 + 9 + local213, method694(local348), 16776960);
												}
											}
										}
									} else if (local81.aClass1_Sub1_Sub2_Sub2Array2 != null && local161 < 20) {
										@Pc(537) Class1_Sub1_Sub2_Sub2 local537 = local81.aClass1_Sub1_Sub2_Sub2Array2[local161];
										if (local537 != null) {
											local537.method129(local178, local187);
										}
									}
									local161++;
								}
							}
						} else if (local81.anInt759 == 3) {
							@Pc(563) boolean local563 = false;
							if (this.anInt1048 == local81.anInt755 || this.anInt987 == local81.anInt755 || this.anInt915 == local81.anInt755) {
								local563 = true;
							}
							if (this.method623(local81)) {
								local161 = local81.anInt729;
								if (local563 && local81.anInt735 != 0) {
									local161 = local81.anInt735;
								}
							} else {
								local161 = local81.anInt732;
								if (local563 && local81.anInt758 != 0) {
									local161 = local81.anInt758;
								}
							}
							if (local81.aByte21 == 0) {
								if (local81.aBoolean154) {
									Class1_Sub1_Sub2.method351(local86, local81.anInt742, local161, local91, local81.anInt727);
								} else {
									Class1_Sub1_Sub2.method352(local81.anInt742, local161, local86, local81.anInt727, local91);
								}
							} else if (local81.aBoolean154) {
								Class1_Sub1_Sub2.method350(local86, local81.anInt742, local161, local91, local81.anInt727, 256 - (local81.aByte21 & 0xFF));
							} else {
								Class1_Sub1_Sub2.method353(256 - (local81.aByte21 & 0xFF), local161, local91, local86, local81.anInt727, local81.anInt742);
							}
						} else {
							@Pc(681) Class1_Sub1_Sub2_Sub3 local681;
							@Pc(963) String local963;
							if (local81.anInt759 == 4) {
								local681 = local81.aClass1_Sub1_Sub2_Sub3_1;
								@Pc(684) String local684 = local81.aString13;
								@Pc(686) boolean local686 = false;
								if (this.anInt1048 == local81.anInt755 || this.anInt987 == local81.anInt755 || this.anInt915 == local81.anInt755) {
									local686 = true;
								}
								if (this.method623(local81)) {
									local163 = local81.anInt729;
									if (local686 && local81.anInt735 != 0) {
										local163 = local81.anInt735;
									}
									if (local81.aString11.length() > 0) {
										local684 = local81.aString11;
									}
								} else {
									local163 = local81.anInt732;
									if (local686 && local81.anInt758 != 0) {
										local163 = local81.anInt758;
									}
								}
								if (local81.anInt723 == 6 && this.aBoolean224) {
									local684 = "Please wait...";
									local163 = local81.anInt732;
								}
								if (Class1_Sub1_Sub2.anInt550 == 479) {
									if (local163 == 16776960) {
										local163 = 255;
									}
									if (local163 == 49152) {
										local163 = 16777215;
									}
								}
								local211 = local91 + local681.anInt364;
								while (local684.length() > 0) {
									if (local684.indexOf("%") != -1) {
										label390: while (true) {
											local213 = local684.indexOf("%1");
											if (local213 == -1) {
												while (true) {
													local213 = local684.indexOf("%2");
													if (local213 == -1) {
														while (true) {
															local213 = local684.indexOf("%3");
															if (local213 == -1) {
																while (true) {
																	local213 = local684.indexOf("%4");
																	if (local213 == -1) {
																		while (true) {
																			local213 = local684.indexOf("%5");
																			if (local213 == -1) {
																				break label390;
																			}
																			local684 = local684.substring(0, local213) + this.method654(this.method704(4, local81), this.anInt1065) + local684.substring(local213 + 2);
																		}
																	}
																	local684 = local684.substring(0, local213) + this.method654(this.method704(3, local81), this.anInt1065) + local684.substring(local213 + 2);
																}
															}
															local684 = local684.substring(0, local213) + this.method654(this.method704(2, local81), this.anInt1065) + local684.substring(local213 + 2);
														}
													}
													local684 = local684.substring(0, local213) + this.method654(this.method704(1, local81), this.anInt1065) + local684.substring(local213 + 2);
												}
											}
											local684 = local684.substring(0, local213) + this.method654(this.method704(0, local81), this.anInt1065) + local684.substring(local213 + 2);
										}
									}
									local213 = local684.indexOf("\\n");
									if (local213 == -1) {
										local963 = local684;
										local684 = "";
									} else {
										local963 = local684.substring(0, local213);
										local684 = local684.substring(local213 + 2);
									}
									if (local81.aBoolean150) {
										local681.method262(local163, local81.aBoolean151, local211, local86 + local81.anInt742 / 2, local963);
									} else {
										local681.method269(local81.aBoolean151, local963, local211, local163, local86);
									}
									local211 += local681.anInt364;
								}
							} else if (local81.anInt759 == 5) {
								@Pc(1025) Class1_Sub1_Sub2_Sub2 local1025;
								if (this.method623(local81)) {
									local1025 = local81.aClass1_Sub1_Sub2_Sub2_2;
								} else {
									local1025 = local81.aClass1_Sub1_Sub2_Sub2_1;
								}
								if (local1025 != null) {
									local1025.method129(local86, local91);
								}
							} else if (local81.anInt759 == 6) {
								local161 = Class1_Sub1_Sub2_Sub1.anInt63;
								local163 = Class1_Sub1_Sub2_Sub1.anInt64;
								Class1_Sub1_Sub2_Sub1.anInt63 = local86 + local81.anInt742 / 2;
								Class1_Sub1_Sub2_Sub1.anInt64 = local91 + local81.anInt727 / 2;
								local167 = Class1_Sub1_Sub2_Sub1.anIntArray7[local81.anInt753] * local81.anInt752 >> 16;
								local178 = Class1_Sub1_Sub2_Sub1.anIntArray8[local81.anInt753] * local81.anInt752 >> 16;
								@Pc(1086) boolean local1086 = this.method623(local81);
								if (local1086) {
									local211 = local81.anInt744;
								} else {
									local211 = local81.anInt743;
								}
								@Pc(1106) Class1_Sub1_Sub1_Sub5 local1106;
								if (local211 == -1) {
									local1106 = local81.method510(local1086, -1, -1);
								} else {
									@Pc(1112) Class7 local1112 = Class7.aClass7Array1[local211];
									local1106 = local81.method510(local1086, local1112.anIntArray27[local81.anInt749], local1112.anIntArray28[local81.anInt749]);
								}
								if (local1106 != null) {
									local1106.method400(local81.anInt754, 0, local81.anInt753, 0, local167, local178);
								}
								Class1_Sub1_Sub2_Sub1.anInt63 = local161;
								Class1_Sub1_Sub2_Sub1.anInt64 = local163;
							} else {
								if (local81.anInt759 == 7) {
									local681 = local81.aClass1_Sub1_Sub2_Sub3_1;
									local163 = 0;
									for (local167 = 0; local167 < local81.anInt727; local167++) {
										for (local178 = 0; local178 < local81.anInt742; local178++) {
											if (local81.anIntArray190[local163] > 0) {
												@Pc(1176) Class19 local1176 = Class19.method315(local81.anIntArray190[local163] - 1);
												@Pc(1180) String local1180 = String.valueOf(local1176.aString7);
												if (local1176.aBoolean83 || local81.anIntArray189[local163] != 1) {
													local1180 = local1180 + " x" + method688(local81.anIntArray189[local163]);
												}
												local213 = local86 + local178 * (local81.anInt760 + 115);
												local220 = local91 + local167 * (local81.anInt739 + 12);
												if (local81.aBoolean150) {
													local681.method262(local81.anInt732, local81.aBoolean151, local220, local213 + local81.anInt742 / 2, local1180);
												} else {
													local681.method269(local81.aBoolean151, local1180, local220, local81.anInt732, local213);
												}
											}
											local163++;
										}
									}
								}
								if (local81.anInt759 == 8 && (this.anInt1051 == local81.anInt755 || this.anInt1077 == local81.anInt755 || this.anInt867 == local81.anInt755) && this.anInt968 == 100) {
									local161 = 0;
									local163 = 0;
									@Pc(1294) Class1_Sub1_Sub2_Sub3 local1294 = this.aClass1_Sub1_Sub2_Sub3_3;
									@Pc(1297) String local1297 = local81.aString13;
									while (local1297.length() > 0) {
										local211 = local1297.indexOf("\\n");
										if (local211 == -1) {
											local963 = local1297;
											local1297 = "";
										} else {
											local963 = local1297.substring(0, local211);
											local1297 = local1297.substring(local211 + 2);
										}
										local213 = local1294.method263(local963);
										if (local213 > local161) {
											local161 = local213;
										}
										local163 += local1294.anInt364 + 1;
									}
									local161 += 6;
									local163 += 7;
									local211 = local86 + local81.anInt742 - local161 - 5;
									local213 = local91 + local81.anInt727 + 5;
									if (local211 < local86 + 5) {
										local211 = local86 + 5;
									}
									if (local211 + local161 > arg0 + arg3.anInt742) {
										local211 = arg0 + arg3.anInt742 - local161;
									}
									if (local213 + local163 > arg1 + arg3.anInt727) {
										local213 = arg1 + arg3.anInt727 - local163;
									}
									Class1_Sub1_Sub2.method351(local211, local161, 16777120, local213, local163);
									Class1_Sub1_Sub2.method352(local161, 0, local211, local163, local213);
									local1297 = local81.aString13;
									local220 = local213 + local1294.anInt364 + 2;
									while (local1297.length() > 0) {
										local245 = local1297.indexOf("\\n");
										if (local245 == -1) {
											local963 = local1297;
											local1297 = "";
										} else {
											local963 = local1297.substring(0, local245);
											local1297 = local1297.substring(local245 + 2);
										}
										local1294.method269(false, local963, local220, 0, local211 + 3);
										local220 += local1294.anInt364 + 1;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method348(local35, local37, local39, local33);
			}
		} catch (@Pc(1482) RuntimeException local1482) {
			signlink.reporterror("96208, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1482.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method665(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte25) {
				this.aClass1_Sub1_Sub3_7.method145(52);
			}
			if (this.anInt986 != 0) {
				@Pc(13) int local13 = 0;
				if (this.anInt1023 != 0) {
					local13 = 1;
				}
				for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
					if (this.aStringArray12[local20] != null) {
						@Pc(32) int local32 = this.anIntArray247[local20];
						@Pc(37) String local37 = this.aStringArray11[local20];
						if (local37 != null && local37.startsWith("@cr1@")) {
							local37 = local37.substring(5);
						}
						if (local37 != null && local37.startsWith("@cr2@")) {
							local37 = local37.substring(5);
						}
						if ((local32 == 3 || local32 == 7) && (local32 == 7 || this.anInt1074 == 0 || this.anInt1074 == 1 && this.method663(7, local37))) {
							@Pc(90) int local90 = 329 - local13 * 13;
							if (super.anInt848 > 4 && super.anInt849 - 4 > local90 - 10 && super.anInt849 - 4 <= local90 + 3) {
								@Pc(129) int local129 = this.aClass1_Sub1_Sub2_Sub3_3.method263("From:  " + local37 + this.aStringArray12[local20]) + 25;
								if (local129 > 450) {
									local129 = 450;
								}
								if (super.anInt848 < local129 + 4) {
									if (this.anInt1049 >= 1) {
										this.aStringArray9[this.anInt1054] = "Report abuse @whi@" + local37;
										this.anIntArray216[this.anInt1054] = 2214;
										this.anInt1054++;
									}
									this.aStringArray9[this.anInt1054] = "Add ignore @whi@" + local37;
									this.anIntArray216[this.anInt1054] = 2816;
									this.anInt1054++;
									this.aStringArray9[this.anInt1054] = "Add friend @whi@" + local37;
									this.anIntArray216[this.anInt1054] = 2465;
									this.anInt1054++;
								}
							}
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if ((local32 == 5 || local32 == 6) && this.anInt1074 < 2) {
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("85293, " + arg0 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method666() {
		try {
			this.anInt1039++;
			this.method617(true);
			this.method634(true, this.anInt871);
			this.method617(false);
			this.method634(false, this.anInt871);
			this.method622();
			this.method658();
			@Pc(37) int local37;
			@Pc(76) int local76;
			if (!this.aBoolean214) {
				local37 = this.anInt999;
				if (this.anInt1035 / 256 > local37) {
					local37 = this.anInt1035 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray255[4] + 128 > local37) {
					local37 = this.anIntArray255[4] + 128;
				}
				local76 = this.anInt1000 + this.anInt1066 & 0x7FF;
				this.method686(local37 * 3 + 600, local76, this.anInt925, this.method719(this.anInt918, aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428, aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429) - 50, this.anInt926, local37);
				anInt978++;
				if (anInt978 > 90) {
					anInt978 = 0;
					this.aClass1_Sub1_Sub3_7.method144(13);
				}
			}
			if (this.aBoolean214) {
				local37 = this.method683();
			} else {
				local37 = this.method682();
			}
			local76 = this.anInt1059;
			@Pc(134) int local134 = this.anInt1060;
			@Pc(137) int local137 = this.anInt1061;
			@Pc(140) int local140 = this.anInt1062;
			@Pc(143) int local143 = this.anInt1063;
			@Pc(192) int local192;
			for (@Pc(145) int local145 = 0; local145 < 5; local145++) {
				if (this.aBooleanArray12[local145]) {
					local192 = (int) (Math.random() * (double) (this.anIntArray239[local145] * 2 + 1) - (double) this.anIntArray239[local145] + Math.sin((double) this.anIntArray268[local145] * ((double) this.anIntArray269[local145] / 100.0D)) * (double) this.anIntArray255[local145]);
					if (local145 == 0) {
						this.anInt1059 += local192;
					}
					if (local145 == 1) {
						this.anInt1060 += local192;
					}
					if (local145 == 2) {
						this.anInt1061 += local192;
					}
					if (local145 == 3) {
						this.anInt1063 = this.anInt1063 + local192 & 0x7FF;
					}
					if (local145 == 4) {
						this.anInt1062 += local192;
						if (this.anInt1062 < 128) {
							this.anInt1062 = 128;
						}
						if (this.anInt1062 > 383) {
							this.anInt1062 = 383;
						}
					}
				}
			}
			local192 = Class1_Sub1_Sub2_Sub1.anInt67;
			Class1_Sub1_Sub1_Sub5.aBoolean117 = true;
			Class1_Sub1_Sub1_Sub5.anInt613 = 0;
			Class1_Sub1_Sub1_Sub5.anInt611 = super.anInt848 - 4;
			Class1_Sub1_Sub1_Sub5.anInt612 = super.anInt849 - 4;
			Class1_Sub1_Sub2.method349(468);
			this.aClass9_1.method234(this.anInt1061, local37, this.anInt1063, this.anInt1059, this.anInt1060, this.anInt1062);
			this.aClass9_1.method209();
			this.method638();
			this.method600();
			this.method619(local192);
			this.method590();
			this.aClass48_23.method556(super.aGraphics2, 4, 904, 4);
			this.anInt1059 = local76;
			this.anInt1060 = local134;
			this.anInt1061 = local137;
			this.anInt1062 = local140;
			this.anInt1063 = local143;
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("98179, " + 458 + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method667(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(12) int local12 = 0; local12 < this.anInt893; local12++) {
					if (this.aLongArray4[local12] == arg0) {
						this.anInt893--;
						this.aBoolean200 = true;
						for (@Pc(32) int local32 = local12; local32 < this.anInt893; local32++) {
							this.aLongArray4[local32] = this.aLongArray4[local32 + 1];
						}
						this.aClass1_Sub1_Sub3_7.method144(209);
						this.aClass1_Sub1_Sub3_7.method151(arg0);
						return;
					}
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("41831, " + 2 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)Ljava/lang/String;")
	private String method668() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("37106, " + 5 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			this.aClass1_Sub1_Sub2_Sub4_1 = null;
			this.aClass1_Sub1_Sub2_Sub4_2 = null;
			this.aClass1_Sub1_Sub2_Sub4_3 = null;
			this.aClass1_Sub1_Sub1_Sub2_Sub1Array1 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray267 = null;
			this.aClass1_Sub1_Sub2_Sub4_13 = null;
			this.aClass1_Sub1_Sub2_Sub4_14 = null;
			this.aClass1_Sub1_Sub2_Sub4_15 = null;
			if (this.aClass12_Sub1_1 != null) {
				this.aClass12_Sub1_1.method536();
			}
			this.aClass12_Sub1_1 = null;
			this.anIntArray249 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.aClass6_12 = null;
			this.aClass6_10 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass9_1 = null;
			this.aClass50Array1 = null;
			this.aClass48_3 = null;
			this.aClass48_4 = null;
			this.aClass48_5 = null;
			this.aClass48_6 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
			this.anIntArray263 = null;
			this.anIntArray264 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aByteArray21 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			try {
				if (this.aClass33_1 != null) {
					this.aClass33_1.method483();
				}
			} catch (@Pc(126) Exception local126) {
			}
			this.aClass33_1 = null;
			this.aClass48_15 = null;
			this.aClass48_16 = null;
			this.aClass48_12 = null;
			this.aClass48_13 = null;
			this.aClass48_14 = null;
			this.aClass48_7 = null;
			this.aClass48_8 = null;
			this.aClass48_9 = null;
			this.aClass48_10 = null;
			this.aClass48_11 = null;
			this.aClass1_Sub1_Sub2_Sub4Array3 = null;
			if (this.aClass26_1 != null) {
				this.aClass26_1.aBoolean118 = false;
			}
			this.aClass26_1 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass48_21 = null;
			this.aClass48_22 = null;
			this.aClass48_23 = null;
			this.aClass48_24 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray214 = null;
			this.anIntArray215 = null;
			this.anIntArray216 = null;
			this.anIntArray217 = null;
			this.aStringArray9 = null;
			this.aClass1_Sub1_Sub3_7 = null;
			this.aClass1_Sub1_Sub3_9 = null;
			this.aClass1_Sub1_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub4Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array9 = null;
			this.anIntArray241 = null;
			this.aStringArray14 = null;
			this.aLongArray3 = null;
			this.anIntArray213 = null;
			this.aClass1_Sub1_Sub1_Sub2_Sub2Array1 = null;
			this.anIntArray227 = null;
			this.aClass1_Sub1_Sub3_6 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray253 = null;
			this.anIntArray254 = null;
			this.method620();
			this.aClass48_25 = null;
			this.aClass48_26 = null;
			this.aClass48_27 = null;
			this.aClass1_Sub1_Sub2_Sub4_16 = null;
			this.aClass1_Sub1_Sub2_Sub4_17 = null;
			this.aClass1_Sub1_Sub2_Sub4_18 = null;
			this.aClass1_Sub1_Sub2_Sub4_19 = null;
			this.aClass1_Sub1_Sub2_Sub4_20 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2Array8 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array10 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub4_4 = null;
			this.aClass1_Sub1_Sub2_Sub4_5 = null;
			this.aClass1_Sub1_Sub2_Sub4_6 = null;
			this.aClass1_Sub1_Sub2_Sub4_7 = null;
			this.aClass1_Sub1_Sub2_Sub4_8 = null;
			this.aClass6ArrayArrayArray1 = null;
			this.aClass6_11 = null;
			this.aClass48_17 = null;
			this.aClass48_18 = null;
			this.aClass48_19 = null;
			this.aClass48_20 = null;
			this.method621();
			Class44.method528(this.anInt1087);
			Class31.method477(this.anInt1087);
			Class19.method313(this.anInt1087);
			Class43.method518(this.anInt1087);
			Class14.aClass14Array1 = null;
			Class49.aClass49Array1 = null;
			Class22.aClass22Array1 = null;
			Class7.aClass7Array1 = null;
			Class46.aClass46Array1 = null;
			Class46.aClass41_9 = null;
			Class34.aClass34Array1 = null;
			super.aClass48_2 = null;
			Class1_Sub1_Sub1_Sub2_Sub1.aClass41_1 = null;
			Class1_Sub1_Sub2_Sub1.method45(this.anInt1087);
			Class9.method194(this.anInt1087);
			Class1_Sub1_Sub1_Sub5.method375(this.anInt1087);
			Class23.method341(this.anInt1087);
			System.gc();
		} catch (@Pc(390) RuntimeException local390) {
			signlink.reporterror("14042, " + 0 + ", " + local390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VTUPBFSN;I)Z")
	private boolean method669(@OriginalArg(0) Class43 arg0) {
		try {
			@Pc(16) int local16 = arg0.anInt725;
			if (this.anInt952 == 2) {
				if (local16 == 201) {
					this.aBoolean194 = true;
					this.anInt1041 = 0;
					this.aBoolean208 = true;
					this.aString25 = "";
					this.anInt997 = 1;
					this.aString31 = "Enter name of friend to add to list";
				}
				if (local16 == 202) {
					this.aBoolean194 = true;
					this.anInt1041 = 0;
					this.aBoolean208 = true;
					this.aString25 = "";
					this.anInt997 = 2;
					this.aString31 = "Enter name of friend to delete from list";
				}
			}
			if (local16 == 205) {
				this.anInt995 = 250;
				return true;
			}
			if (local16 == 501) {
				this.aBoolean194 = true;
				this.anInt1041 = 0;
				this.aBoolean208 = true;
				this.aString25 = "";
				this.anInt997 = 4;
				this.aString31 = "Enter name of player to add to list";
			}
			if (local16 == 502) {
				this.aBoolean194 = true;
				this.anInt1041 = 0;
				this.aBoolean208 = true;
				this.aString25 = "";
				this.anInt997 = 5;
				this.aString31 = "Enter name of player to delete from list";
			}
			@Pc(124) int local124;
			@Pc(128) int local128;
			@Pc(133) int local133;
			if (local16 >= 300 && local16 <= 313) {
				local124 = (local16 - 300) / 2;
				local128 = local16 & 0x1;
				local133 = this.anIntArray221[local124];
				if (local133 != -1) {
					while (true) {
						if (local128 == 0) {
							local133--;
							if (local133 < 0) {
								local133 = Class49.anInt832 - 1;
							}
						}
						if (local128 == 1) {
							local133++;
							if (local133 >= Class49.anInt832) {
								local133 = 0;
							}
						}
						if (!Class49.aClass49Array1[local133].aBoolean176 && Class49.aClass49Array1[local133].anInt833 == local124 + (this.aBoolean226 ? 0 : 7)) {
							this.anIntArray221[local124] = local133;
							this.aBoolean207 = true;
							break;
						}
					}
				}
			}
			if (local16 >= 314 && local16 <= 323) {
				local124 = (local16 - 314) / 2;
				local128 = local16 & 0x1;
				local133 = this.anIntArray222[local124];
				if (local128 == 0) {
					local133--;
					if (local133 < 0) {
						local133 = anIntArrayArray22[local124].length - 1;
					}
				}
				if (local128 == 1) {
					local133++;
					if (local133 >= anIntArrayArray22[local124].length) {
						local133 = 0;
					}
				}
				this.anIntArray222[local124] = local133;
				this.aBoolean207 = true;
			}
			if (local16 == 324 && !this.aBoolean226) {
				this.aBoolean226 = true;
				this.method715((byte) 1);
			}
			if (local16 == 325 && this.aBoolean226) {
				this.aBoolean226 = false;
				this.method715((byte) 1);
			}
			if (local16 == 326) {
				this.aClass1_Sub1_Sub3_7.method144(194);
				this.aClass1_Sub1_Sub3_7.method145(this.aBoolean226 ? 0 : 1);
				for (local124 = 0; local124 < 7; local124++) {
					this.aClass1_Sub1_Sub3_7.method145(this.anIntArray221[local124]);
				}
				for (local128 = 0; local128 < 5; local128++) {
					this.aClass1_Sub1_Sub3_7.method145(this.anIntArray222[local128]);
				}
				return true;
			}
			if (local16 == 620) {
				this.aBoolean227 = !this.aBoolean227;
			}
			if (local16 >= 601 && local16 <= 613) {
				this.method657();
				if (this.aString22.length() > 0) {
					this.aClass1_Sub1_Sub3_7.method144(153);
					this.aClass1_Sub1_Sub3_7.method151(Class20.method319(this.aString22));
					this.aClass1_Sub1_Sub3_7.method145(local16 - 601);
					this.aClass1_Sub1_Sub3_7.method145(this.aBoolean227 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("54843, " + arg0 + ", " + -4 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method670() {
		try {
			while (true) {
				@Pc(8) Class1_Sub1_Sub4 local8 = this.aClass12_Sub1_1.method543();
				if (local8 == null) {
					return;
				}
				if (local8.anInt625 == 0) {
					Class1_Sub1_Sub1_Sub5.method377(local8.aByteArray13, local8.anInt623);
					if ((this.aClass12_Sub1_1.method542(local8.anInt623) & 0x62) != 0) {
						this.aBoolean200 = true;
						if (this.anInt911 != -1 || this.anInt990 != -1) {
							this.aBoolean194 = true;
						}
					}
				}
				if (local8.anInt625 == 1 && local8.aByteArray13 != null) {
					Class23.method340(local8.aByteArray13);
				}
				if (local8.anInt625 == 2 && local8.anInt623 == this.anInt964 && local8.aByteArray13 != null) {
					this.method642(this.aBoolean203, local8.aByteArray13);
				}
				if (local8.anInt625 == 3 && this.anInt928 == 1) {
					for (@Pc(83) int local83 = 0; local83 < this.aByteArrayArray6.length; local83++) {
						if (this.anIntArray250[local83] == local8.anInt623) {
							this.aByteArrayArray6[local83] = local8.aByteArray13;
							if (local8.aByteArray13 == null) {
								this.anIntArray250[local83] = -1;
							}
							break;
						}
						if (this.anIntArray251[local83] == local8.anInt623) {
							this.aByteArrayArray5[local83] = local8.aByteArray13;
							if (local8.aByteArray13 == null) {
								this.anIntArray251[local83] = -1;
							}
							break;
						}
					}
				}
				if (local8.anInt625 == 93 && this.aClass12_Sub1_1.method537(local8.anInt623)) {
					Class29.method432(new Class1_Sub1_Sub3(local8.aByteArray13, 0), this.aClass12_Sub1_1);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("50221, " + 0 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588(20, "Starting up", (byte) 1);
		if (signlink.sunjava) {
			super.anInt842 = 5;
		}
		if (aBoolean204) {
			this.aBoolean205 = true;
			return;
		}
		aBoolean204 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method668();
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
			this.aBoolean199 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass8Array1[local107] = new Class8(signlink.aRandomAccessFile3, local107 + 1, signlink.aRandomAccessFileArray1[local107], 600000, -573);
			}
		}
		try {
			this.method591();
			this.aClass13_2 = this.method589(this.anIntArray265[1], "title", 1, "title screen", (byte) 1, 25);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3("p11_full", 79, this.aClass13_2, false);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3("p12_full", 79, this.aClass13_2, false);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3("b12_full", 79, this.aClass13_2, false);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3("q8_full", 79, this.aClass13_2, true);
			this.method618();
			this.method625();
			@Pc(203) Class13 local203 = this.method589(this.anIntArray265[2], "config", 2, "config", (byte) 1, 30);
			@Pc(215) Class13 local215 = this.method589(this.anIntArray265[3], "interface", 3, "interface", (byte) 1, 35);
			@Pc(227) Class13 local227 = this.method589(this.anIntArray265[4], "media", 4, "2d graphics", (byte) 1, 40);
			@Pc(239) Class13 local239 = this.method589(this.anIntArray265[6], "textures", 6, "textures", (byte) 1, 45);
			@Pc(251) Class13 local251 = this.method589(this.anIntArray265[7], "wordenc", 7, "chat system", (byte) 1, 50);
			@Pc(263) Class13 local263 = this.method589(this.anIntArray265[8], "sounds", 8, "sound effects", (byte) 1, 55);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass9_1 = new Class9(4, 104, this.anIntArrayArrayArray8, 0, 104);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass50Array1[local288] = new Class50(104, 8, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(323) Class13 local323 = this.method589(this.anIntArray265[5], "versionlist", 5, "update list", (byte) 1, 60);
			this.method588(60, "Connecting to update server", (byte) 1);
			this.aClass12_Sub1_1 = new Class12_Sub1();
			this.aClass12_Sub1_1.method541(local323, this);
			Class23.method339(this.aClass12_Sub1_1.method545());
			Class1_Sub1_Sub1_Sub5.method376(this.aClass12_Sub1_1.method532(0), this.aClass12_Sub1_1);
			if (!aBoolean191) {
				this.anInt964 = 0;
				this.aBoolean203 = true;
				this.aClass12_Sub1_1.method549(2, this.anInt964);
				while (this.aClass12_Sub1_1.method547() > 0) {
					this.method670();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass12_Sub1_1.anInt799 > 3) {
						this.method652("ondemand");
						return;
					}
				}
			}
			this.method588(65, "Requesting animations", (byte) 1);
			@Pc(398) int local398 = this.aClass12_Sub1_1.method532(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass12_Sub1_1.method549(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass12_Sub1_1.method547() > 0) {
				local419 = local398 - this.aClass12_Sub1_1.method547();
				if (local419 > 0) {
					this.method588(65, "Loading animations - " + local419 * 100 / local398 + "%", (byte) 1);
				}
				this.method670();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass12_Sub1_1.anInt799 > 3) {
					this.method652("ondemand");
					return;
				}
			}
			this.method588(70, "Requesting models", (byte) 1);
			local398 = this.aClass12_Sub1_1.method532(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass12_Sub1_1.method542(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass12_Sub1_1.method549(0, local419);
				}
			}
			local398 = this.aClass12_Sub1_1.method547();
			while (this.aClass12_Sub1_1.method547() > 0) {
				local479 = local398 - this.aClass12_Sub1_1.method547();
				if (local479 > 0) {
					this.method588(70, "Loading models - " + local479 * 100 / local398 + "%", (byte) 1);
				}
				this.method670();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass8Array1[0] != null) {
				this.method588(75, "Requesting maps", (byte) 1);
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 48, 0, 47));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 48, 1, 47));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 48, 0, 48));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 48, 1, 48));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 48, 0, 49));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 48, 1, 49));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 47, 0, 47));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 47, 1, 47));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 47, 0, 48));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 47, 1, 48));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 148, 0, 48));
				this.aClass12_Sub1_1.method549(3, this.aClass12_Sub1_1.method546(aByte27, 148, 1, 48));
				local398 = this.aClass12_Sub1_1.method547();
				while (this.aClass12_Sub1_1.method547() > 0) {
					local479 = local398 - this.aClass12_Sub1_1.method547();
					if (local479 > 0) {
						this.method588(75, "Loading maps - " + local479 * 100 / local398 + "%", (byte) 1);
					}
					this.method670();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass12_Sub1_1.method532(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass12_Sub1_1.method542(local479);
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
					this.aClass12_Sub1_1.method535(0, local738, (byte) 8, local479);
				}
			}
			this.aClass12_Sub1_1.method540(aBoolean190);
			if (!aBoolean191) {
				local398 = this.aClass12_Sub1_1.method532(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass12_Sub1_1.method551(local736)) {
						this.aClass12_Sub1_1.method535(2, (byte) 1, (byte) 8, local736);
					}
				}
			}
			local398 = this.aClass12_Sub1_1.method532(0);
			@Pc(861) int local861;
			for (local736 = 0; local736 < local398; local736++) {
				local861 = this.aClass12_Sub1_1.method542(local736);
				if (local861 == 0 && this.aClass12_Sub1_1.anInt801 < 100) {
					this.aClass12_Sub1_1.method535(0, (byte) 1, (byte) 8, local736);
				}
			}
			this.method588(80, "Unpacking media", (byte) 1);
			this.aClass1_Sub1_Sub2_Sub4_13 = new Class1_Sub1_Sub2_Sub4(local227, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub4_15 = new Class1_Sub1_Sub2_Sub4(local227, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub4_14 = new Class1_Sub1_Sub2_Sub4(local227, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(local227, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(local227, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(local227, "backhmid1", 0);
			for (local861 = 0; local861 < 13; local861++) {
				this.aClass1_Sub1_Sub2_Sub4Array3[local861] = new Class1_Sub1_Sub2_Sub4(local227, "sideicons", local861);
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local227, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local227, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_9.method126(anInt872);
			for (@Pc(972) int local972 = 0; local972 < 72; local972++) {
				this.aClass1_Sub1_Sub2_Sub4Array4[local972] = new Class1_Sub1_Sub2_Sub4(local227, "mapscene", local972);
			}
			for (@Pc(990) int local990 = 0; local990 < 70; local990++) {
				this.aClass1_Sub1_Sub2_Sub2Array9[local990] = new Class1_Sub1_Sub2_Sub2(local227, "mapfunction", local990);
			}
			for (@Pc(1008) int local1008 = 0; local1008 < 5; local1008++) {
				this.aClass1_Sub1_Sub2_Sub2Array8[local1008] = new Class1_Sub1_Sub2_Sub2(local227, "hitmarks", local1008);
			}
			for (@Pc(1026) int local1026 = 0; local1026 < 6; local1026++) {
				this.aClass1_Sub1_Sub2_Sub2Array7[local1026] = new Class1_Sub1_Sub2_Sub2(local227, "headicons_pk", local1026);
			}
			for (@Pc(1044) int local1044 = 0; local1044 < 9; local1044++) {
				this.aClass1_Sub1_Sub2_Sub2Array6[local1044] = new Class1_Sub1_Sub2_Sub2(local227, "headicons_prayer", local1044);
			}
			for (@Pc(1062) int local1062 = 0; local1062 < 6; local1062++) {
				this.aClass1_Sub1_Sub2_Sub2Array10[local1062] = new Class1_Sub1_Sub2_Sub2(local227, "headicons_hint", local1062);
			}
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local227, "overlay_multiway", 0);
			this.aClass1_Sub1_Sub2_Sub2_16 = new Class1_Sub1_Sub2_Sub2(local227, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_17 = new Class1_Sub1_Sub2_Sub2(local227, "mapmarker", 1);
			for (@Pc(1104) int local1104 = 0; local1104 < 8; local1104++) {
				this.aClass1_Sub1_Sub2_Sub2Array4[local1104] = new Class1_Sub1_Sub2_Sub2(local227, "cross", local1104);
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local227, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local227, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local227, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local227, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local227, "mapdots", 4);
			this.aClass1_Sub1_Sub2_Sub4_11 = new Class1_Sub1_Sub2_Sub4(local227, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub4_12 = new Class1_Sub1_Sub2_Sub4(local227, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub4_16 = new Class1_Sub1_Sub2_Sub4(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_17 = new Class1_Sub1_Sub2_Sub4(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_18 = new Class1_Sub1_Sub2_Sub4(local227, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub4_19 = new Class1_Sub1_Sub2_Sub4(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_19.method360();
			this.aClass1_Sub1_Sub2_Sub4_20 = new Class1_Sub1_Sub2_Sub4(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_20.method360();
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_4.method361();
			this.aClass1_Sub1_Sub2_Sub4_5 = new Class1_Sub1_Sub2_Sub4(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_5.method361();
			this.aClass1_Sub1_Sub2_Sub4_6 = new Class1_Sub1_Sub2_Sub4(local227, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub4_6.method361();
			this.aClass1_Sub1_Sub2_Sub4_7 = new Class1_Sub1_Sub2_Sub4(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_7.method360();
			this.aClass1_Sub1_Sub2_Sub4_7.method361();
			this.aClass1_Sub1_Sub2_Sub4_8 = new Class1_Sub1_Sub2_Sub4(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_8.method360();
			this.aClass1_Sub1_Sub2_Sub4_8.method361();
			for (@Pc(1294) int local1294 = 0; local1294 < 2; local1294++) {
				this.aClass1_Sub1_Sub2_Sub4Array5[local1294] = new Class1_Sub1_Sub2_Sub4(local227, "mod_icons", local1294);
			}
			@Pc(1317) Class1_Sub1_Sub2_Sub2 local1317 = new Class1_Sub1_Sub2_Sub2(local227, "backleft1", 0);
			this.aClass48_3 = new Class48(this.method586(), local1317.anInt282, local1317.anInt283, (byte) 52);
			local1317.method127(0, 0);
			@Pc(1342) Class1_Sub1_Sub2_Sub2 local1342 = new Class1_Sub1_Sub2_Sub2(local227, "backleft2", 0);
			this.aClass48_4 = new Class48(this.method586(), local1342.anInt282, local1342.anInt283, (byte) 52);
			local1342.method127(0, 0);
			@Pc(1367) Class1_Sub1_Sub2_Sub2 local1367 = new Class1_Sub1_Sub2_Sub2(local227, "backright1", 0);
			this.aClass48_5 = new Class48(this.method586(), local1367.anInt282, local1367.anInt283, (byte) 52);
			local1367.method127(0, 0);
			@Pc(1392) Class1_Sub1_Sub2_Sub2 local1392 = new Class1_Sub1_Sub2_Sub2(local227, "backright2", 0);
			this.aClass48_6 = new Class48(this.method586(), local1392.anInt282, local1392.anInt283, (byte) 52);
			local1392.method127(0, 0);
			@Pc(1417) Class1_Sub1_Sub2_Sub2 local1417 = new Class1_Sub1_Sub2_Sub2(local227, "backtop1", 0);
			this.aClass48_7 = new Class48(this.method586(), local1417.anInt282, local1417.anInt283, (byte) 52);
			local1417.method127(0, 0);
			@Pc(1442) Class1_Sub1_Sub2_Sub2 local1442 = new Class1_Sub1_Sub2_Sub2(local227, "backvmid1", 0);
			this.aClass48_8 = new Class48(this.method586(), local1442.anInt282, local1442.anInt283, (byte) 52);
			local1442.method127(0, 0);
			@Pc(1467) Class1_Sub1_Sub2_Sub2 local1467 = new Class1_Sub1_Sub2_Sub2(local227, "backvmid2", 0);
			this.aClass48_9 = new Class48(this.method586(), local1467.anInt282, local1467.anInt283, (byte) 52);
			local1467.method127(0, 0);
			@Pc(1492) Class1_Sub1_Sub2_Sub2 local1492 = new Class1_Sub1_Sub2_Sub2(local227, "backvmid3", 0);
			this.aClass48_10 = new Class48(this.method586(), local1492.anInt282, local1492.anInt283, (byte) 52);
			local1492.method127(0, 0);
			@Pc(1517) Class1_Sub1_Sub2_Sub2 local1517 = new Class1_Sub1_Sub2_Sub2(local227, "backhmid2", 0);
			this.aClass48_11 = new Class48(this.method586(), local1517.anInt282, local1517.anInt283, (byte) 52);
			local1517.method127(0, 0);
			@Pc(1542) int local1542 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1549) int local1549 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1556) int local1556 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1563) int local1563 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1565) int local1565 = 0; local1565 < 100; local1565++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array9[local1565] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array9[local1565].method125(local1549 + local1563, local1556 + local1563, local1542 + local1563);
				}
				if (this.aClass1_Sub1_Sub2_Sub4Array4[local1565] != null) {
					this.aClass1_Sub1_Sub2_Sub4Array4[local1565].method362(local1549 + local1563, local1556 + local1563, local1542 + local1563);
				}
			}
			this.method588(83, "Unpacking textures", (byte) 1);
			Class1_Sub1_Sub2_Sub1.method50(local239);
			Class1_Sub1_Sub2_Sub1.method54(0.8D, 250);
			Class1_Sub1_Sub2_Sub1.method49();
			this.method588(86, "Unpacking config", (byte) 1);
			Class7.method102(local203);
			Class44.method527(local203);
			Class14.method279(local203);
			Class19.method318(local203);
			Class31.method476(local203);
			Class49.method558(local203);
			Class46.method552(local203);
			Class34.method489(local203);
			Class5.method91(local203);
			Class19.aBoolean81 = aBoolean190;
			if (!aBoolean191) {
				this.method588(90, "Unpacking sounds", (byte) 1);
				@Pc(1668) byte[] local1668 = local263.method278("sounds.dat", null);
				@Pc(1674) Class1_Sub1_Sub3 local1674 = new Class1_Sub1_Sub3(local1668, 0);
				Class24.method365(local1674);
			}
			this.method588(95, "Unpacking interfaces", (byte) 1);
			@Pc(1705) Class1_Sub1_Sub2_Sub3[] local1705 = new Class1_Sub1_Sub2_Sub3[] { this.aClass1_Sub1_Sub2_Sub3_2, this.aClass1_Sub1_Sub2_Sub3_3, this.aClass1_Sub1_Sub2_Sub3_4, this.aClass1_Sub1_Sub2_Sub3_5 };
			Class43.method512(local215, local227, local1705);
			this.method588(100, "Preparing game engine", (byte) 1);
			@Pc(1721) int local1721;
			@Pc(1723) int local1723;
			@Pc(1725) int local1725;
			for (@Pc(1717) int local1717 = 0; local1717 < 33; local1717++) {
				local1721 = 999;
				local1723 = 0;
				for (local1725 = 0; local1725 < 34; local1725++) {
					if (this.aClass1_Sub1_Sub2_Sub4_14.aByteArray11[local1725 + local1717 * this.aClass1_Sub1_Sub2_Sub4_14.anInt561] == 0) {
						if (local1721 == 999) {
							local1721 = local1725;
						}
					} else if (local1721 != 999) {
						local1723 = local1725;
						break;
					}
				}
				this.anIntArray240[local1717] = local1721;
				this.anIntArray226[local1717] = local1723 - local1721;
			}
			@Pc(1783) int local1783;
			for (local1721 = 5; local1721 < 156; local1721++) {
				local1723 = 999;
				local1725 = 0;
				for (local1783 = 25; local1783 < 172; local1783++) {
					if (this.aClass1_Sub1_Sub2_Sub4_14.aByteArray11[local1783 + local1721 * this.aClass1_Sub1_Sub2_Sub4_14.anInt561] == 0 && (local1783 > 34 || local1721 > 34)) {
						if (local1723 == 999) {
							local1723 = local1783;
						}
					} else if (local1723 != 999) {
						local1725 = local1783;
						break;
					}
				}
				this.anIntArray248[local1721 - 5] = local1723 - 25;
				this.anIntArray220[local1721 - 5] = local1725 - local1723;
			}
			Class1_Sub1_Sub2_Sub1.method47(765, 503);
			this.anIntArray246 = Class1_Sub1_Sub2_Sub1.anIntArray9;
			Class1_Sub1_Sub2_Sub1.method47(479, 96);
			this.anIntArray243 = Class1_Sub1_Sub2_Sub1.anIntArray9;
			Class1_Sub1_Sub2_Sub1.method47(190, 261);
			this.anIntArray244 = Class1_Sub1_Sub2_Sub1.anIntArray9;
			Class1_Sub1_Sub2_Sub1.method47(512, 334);
			this.anIntArray245 = Class1_Sub1_Sub2_Sub1.anIntArray9;
			@Pc(1874) int[] local1874 = new int[9];
			for (local1725 = 0; local1725 < 9; local1725++) {
				local1783 = local1725 * 32 + 128 + 15;
				@Pc(1892) int local1892 = local1783 * 3 + 600;
				@Pc(1896) int local1896 = Class1_Sub1_Sub2_Sub1.anIntArray7[local1783];
				local1874[local1725] = local1892 * local1896 >> 16;
			}
			Class9.method231(local1874);
			Class30.method437(local251);
			this.aClass26_1 = new Class26(6, this);
			this.method587(this.aClass26_1, 10);
			Class1_Sub1_Sub1_Sub4.aClient1 = this;
			Class44.aClient4 = this;
			Class31.aClient3 = this;
		} catch (@Pc(1937) Exception local1937) {
			signlink.reporterror("loaderror " + this.aString24 + " " + this.anInt913);
			this.aBoolean222 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Ljava/net/Socket;")
	public Socket method671(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method672(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray214[arg0];
				@Pc(14) int local14 = this.anIntArray215[arg0];
				@Pc(19) int local19 = this.anIntArray216[arg0];
				@Pc(24) int local24 = this.anIntArray217[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt1041 != 0 && local19 != 1472) {
					this.anInt1041 = 0;
					this.aBoolean194 = true;
				}
				if (local19 == 689) {
					this.aClass1_Sub1_Sub3_7.method144(84);
					this.aClass1_Sub1_Sub3_7.method180(local9);
					this.aClass1_Sub1_Sub3_7.method180(local24);
					this.aClass1_Sub1_Sub3_7.method182(local14);
					this.anInt1030 = 0;
					this.anInt1031 = local14;
					this.anInt1032 = local9;
					this.anInt1033 = 2;
					if (Class43.method515(local14).anInt728 == this.anInt998) {
						this.anInt1033 = 1;
					}
					if (Class43.method515(local14).anInt728 == this.anInt911) {
						this.anInt1033 = 3;
					}
				}
				@Pc(111) Class43 local111;
				@Pc(129) int local129;
				if (local19 == 80) {
					this.aClass1_Sub1_Sub3_7.method144(146);
					this.aClass1_Sub1_Sub3_7.method146(local14);
					local111 = Class43.method515(local14);
					if (local111.anIntArrayArray18 != null && local111.anIntArrayArray18[0][0] == 5) {
						local129 = local111.anIntArrayArray18[0][1];
						if (this.anIntArray241[local129] != local111.anIntArray182[0]) {
							this.anIntArray241[local129] = local111.anIntArray182[0];
							this.method633(local129);
							this.aBoolean200 = true;
						}
					}
				}
				if (local19 == 229) {
					this.aClass1_Sub1_Sub3_7.method144(146);
					this.aClass1_Sub1_Sub3_7.method146(local14);
					local111 = Class43.method515(local14);
					if (local111.anIntArrayArray18 != null && local111.anIntArrayArray18[0][0] == 5) {
						local129 = local111.anIntArrayArray18[0][1];
						this.anIntArray241[local129] = 1 - this.anIntArray241[local129];
						this.method633(local129);
						this.aBoolean200 = true;
					}
				}
				@Pc(228) boolean local228;
				if (local19 == 87) {
					local228 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 0, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
					if (!local228) {
						this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
					}
					this.anInt1006 = super.anInt854;
					this.anInt1007 = super.anInt855;
					this.anInt1009 = 2;
					this.anInt1008 = 0;
					this.aClass1_Sub1_Sub3_7.method144(127);
					this.aClass1_Sub1_Sub3_7.method181(local9 + this.anInt945);
					this.aClass1_Sub1_Sub3_7.method146(local24);
					this.aClass1_Sub1_Sub3_7.method182(local14 + this.anInt946);
				}
				@Pc(331) String local331;
				@Pc(316) String local316;
				if (local19 == 925) {
					local111 = Class43.method515(local14);
					this.anInt1091 = 1;
					this.anInt1092 = local14;
					this.anInt1093 = local111.anInt726;
					this.anInt862 = 0;
					this.aBoolean200 = true;
					local316 = local111.aString12;
					if (local316.indexOf(" ") != -1) {
						local316 = local316.substring(0, local316.indexOf(" "));
					}
					local331 = local111.aString12;
					if (local331.indexOf(" ") != -1) {
						local331 = local331.substring(local331.indexOf(" ") + 1);
					}
					this.aString30 = local316 + " " + local111.aString14 + " " + local331;
					if (this.anInt1093 == 16) {
						this.aBoolean200 = true;
						this.anInt965 = 3;
						this.aBoolean192 = true;
					}
				} else {
					if (local19 == 22) {
						this.aClass1_Sub1_Sub3_7.method144(245);
						this.aClass1_Sub1_Sub3_7.method180(local14);
						this.aClass1_Sub1_Sub3_7.method182(local9);
						this.aClass1_Sub1_Sub3_7.method182(local24);
						this.anInt1030 = 0;
						this.anInt1031 = local14;
						this.anInt1032 = local9;
						this.anInt1033 = 2;
						if (Class43.method515(local14).anInt728 == this.anInt998) {
							this.anInt1033 = 1;
						}
						if (Class43.method515(local14).anInt728 == this.anInt911) {
							this.anInt1033 = 3;
						}
					}
					if (local19 == 937) {
						this.method716(this.anInt990);
						this.anInt990 = -1;
						this.aBoolean194 = true;
					}
					if (local19 == 868) {
						local228 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 0, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
						if (!local228) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
						}
						this.anInt1006 = super.anInt854;
						this.anInt1007 = super.anInt855;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass1_Sub1_Sub3_7.method144(183);
						this.aClass1_Sub1_Sub3_7.method182(local14 + this.anInt946);
						this.aClass1_Sub1_Sub3_7.method182(local24);
						this.aClass1_Sub1_Sub3_7.method182(local9 + this.anInt945);
					}
					@Pc(539) Class1_Sub1_Sub1_Sub2_Sub1 local539;
					if (local19 == 734) {
						local539 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local539 != null) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local539.anIntArray73[0], 0, 0, this.anInt1090, local539.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							anInt985 += local24;
							if (anInt985 >= 131) {
								this.aClass1_Sub1_Sub3_7.method144(222);
								this.aClass1_Sub1_Sub3_7.method149(0);
								anInt985 = 0;
							}
							this.aClass1_Sub1_Sub3_7.method144(107);
							this.aClass1_Sub1_Sub3_7.method146(local24);
						}
					}
					if (local19 == 82 && this.method609(local24, local9, local14)) {
						this.aClass1_Sub1_Sub3_7.method144(191);
						this.aClass1_Sub1_Sub3_7.method181(local9 + this.anInt945);
						this.aClass1_Sub1_Sub3_7.method181(this.anInt864);
						this.aClass1_Sub1_Sub3_7.method146(this.anInt865);
						this.aClass1_Sub1_Sub3_7.method181(local14 + this.anInt946);
						this.aClass1_Sub1_Sub3_7.method181(local24 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_7.method180(this.anInt863);
					}
					if (local19 == 652) {
						local228 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 0, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
						if (!local228) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
						}
						this.anInt1006 = super.anInt854;
						this.anInt1007 = super.anInt855;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass1_Sub1_Sub3_7.method144(227);
						this.aClass1_Sub1_Sub3_7.method181(this.anInt1092);
						this.aClass1_Sub1_Sub3_7.method146(local14 + this.anInt946);
						this.aClass1_Sub1_Sub3_7.method182(local24);
						this.aClass1_Sub1_Sub3_7.method182(local9 + this.anInt945);
					}
					if (local19 == 10) {
						local228 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 0, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
						if (!local228) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
						}
						this.anInt1006 = super.anInt854;
						this.anInt1007 = super.anInt855;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass1_Sub1_Sub3_7.method144(111);
						this.aClass1_Sub1_Sub3_7.method146(local24);
						this.aClass1_Sub1_Sub3_7.method181(local9 + this.anInt945);
						this.aClass1_Sub1_Sub3_7.method180(local14 + this.anInt946);
					}
					if (local19 == 858) {
						this.aClass1_Sub1_Sub3_7.method144(68);
						this.aClass1_Sub1_Sub3_7.method180(local24);
						this.aClass1_Sub1_Sub3_7.method182(local14);
						this.aClass1_Sub1_Sub3_7.method181(local9);
						this.anInt1030 = 0;
						this.anInt1031 = local14;
						this.anInt1032 = local9;
						this.anInt1033 = 2;
						if (Class43.method515(local14).anInt728 == this.anInt998) {
							this.anInt1033 = 1;
						}
						if (Class43.method515(local14).anInt728 == this.anInt911) {
							this.anInt1033 = 3;
						}
					}
					@Pc(910) Class1_Sub1_Sub1_Sub2_Sub2 local910;
					if (local19 == 2) {
						local910 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local910 != null) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local910.anIntArray73[0], 0, 0, this.anInt1090, local910.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass1_Sub1_Sub3_7.method144(189);
							this.aClass1_Sub1_Sub3_7.method181(local24);
						}
					}
					if (local19 == 384) {
						local910 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local910 != null) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local910.anIntArray73[0], 0, 0, this.anInt1090, local910.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass1_Sub1_Sub3_7.method144(224);
							this.aClass1_Sub1_Sub3_7.method181(this.anInt864);
							this.aClass1_Sub1_Sub3_7.method146(this.anInt865);
							this.aClass1_Sub1_Sub3_7.method180(local24);
							this.aClass1_Sub1_Sub3_7.method146(this.anInt863);
						}
					}
					if (local19 == 842) {
						if (this.aBoolean225) {
							this.aClass9_1.method233(local14 - 4, local9 - 4);
						} else {
							this.aClass9_1.method233(super.anInt855 - 4, super.anInt854 - 4);
						}
					}
					if (local19 == 744) {
						if ((this.anInt945 & 0x3) == 0) {
							anInt1070++;
						}
						if (anInt1070 >= 117) {
							this.aClass1_Sub1_Sub3_7.method144(219);
							this.aClass1_Sub1_Sub3_7.method149(0);
							anInt1070 = 0;
						}
						this.method609(local24, local9, local14);
						this.aClass1_Sub1_Sub3_7.method144(106);
						this.aClass1_Sub1_Sub3_7.method182(local24 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_7.method181(local14 + this.anInt946);
						this.aClass1_Sub1_Sub3_7.method181(local9 + this.anInt945);
					}
					if (local19 == 546) {
						local910 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local910 != null) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local910.anIntArray73[0], 0, 0, this.anInt1090, local910.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass1_Sub1_Sub3_7.method144(248);
							this.aClass1_Sub1_Sub3_7.method181(local24);
						}
					}
					if (local19 == 959) {
						local539 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local539 != null) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local539.anIntArray73[0], 0, 0, this.anInt1090, local539.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass1_Sub1_Sub3_7.method144(220);
							this.aClass1_Sub1_Sub3_7.method182(this.anInt1092);
							this.aClass1_Sub1_Sub3_7.method181(local24);
						}
					}
					if (local19 == 1498) {
						@Pc(1274) int local1274 = local24 >> 14 & 0x7FFF;
						@Pc(1277) Class44 local1277 = Class44.method519(local1274);
						if (local1277.aByteArray16 == null) {
							local331 = "It's a " + local1277.aString15 + ".";
						} else {
							local331 = new String(local1277.aByteArray16);
						}
						this.method649(0, "", local331);
					}
					if (local19 == 767) {
						this.aClass1_Sub1_Sub3_7.method144(135);
						this.aClass1_Sub1_Sub3_7.method182(local24);
						this.aClass1_Sub1_Sub3_7.method181(local14);
						this.aClass1_Sub1_Sub3_7.method146(local9);
						this.anInt1030 = 0;
						this.anInt1031 = local14;
						this.anInt1032 = local9;
						this.anInt1033 = 2;
						if (Class43.method515(local14).anInt728 == this.anInt998) {
							this.anInt1033 = 1;
						}
						if (Class43.method515(local14).anInt728 == this.anInt911) {
							this.anInt1033 = 3;
						}
					}
					if (local19 == 149) {
						local539 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local539 != null) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local539.anIntArray73[0], 0, 0, this.anInt1090, local539.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass1_Sub1_Sub3_7.method144(216);
							this.aClass1_Sub1_Sub3_7.method182(this.anInt864);
							this.aClass1_Sub1_Sub3_7.method181(this.anInt865);
							this.aClass1_Sub1_Sub3_7.method146(local24);
							this.aClass1_Sub1_Sub3_7.method182(this.anInt863);
						}
					}
					if (local19 == 248) {
						local539 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local539 != null) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local539.anIntArray73[0], 0, 0, this.anInt1090, local539.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							anInt889 += local24;
							if (anInt889 >= 107) {
								this.aClass1_Sub1_Sub3_7.method144(103);
								this.aClass1_Sub1_Sub3_7.method146(43334);
								anInt889 = 0;
							}
							this.aClass1_Sub1_Sub3_7.method144(81);
							this.aClass1_Sub1_Sub3_7.method180(local24);
						}
					}
					if (local19 == 840) {
						local910 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local910 != null) {
							this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local910.anIntArray73[0], 0, 0, this.anInt1090, local910.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							anInt953++;
							if (anInt953 >= 143) {
								this.aClass1_Sub1_Sub3_7.method144(122);
								anInt953 = 0;
							}
							this.aClass1_Sub1_Sub3_7.method144(163);
							this.aClass1_Sub1_Sub3_7.method181(local24);
						}
					}
					if (local19 == 974) {
						if ((local9 & 0x3) == 0) {
							anInt959++;
						}
						if (anInt959 >= 83) {
							this.aClass1_Sub1_Sub3_7.method144(193);
							anInt959 = 0;
						}
						this.aClass1_Sub1_Sub3_7.method144(90);
						this.aClass1_Sub1_Sub3_7.method181(local14);
						this.aClass1_Sub1_Sub3_7.method181(local9);
						this.aClass1_Sub1_Sub3_7.method182(local24);
						this.anInt1030 = 0;
						this.anInt1031 = local14;
						this.anInt1032 = local9;
						this.anInt1033 = 2;
						if (Class43.method515(local14).anInt728 == this.anInt998) {
							this.anInt1033 = 1;
						}
						if (Class43.method515(local14).anInt728 == this.anInt911) {
							this.anInt1033 = 3;
						}
					}
					@Pc(1669) Class19 local1669;
					if (local19 == 1695) {
						local1669 = Class19.method315(local24);
						@Pc(1672) Class43 local1672 = Class43.method515(local14);
						if (local1672 != null && local1672.anIntArray189[local9] >= 100000) {
							local316 = local1672.anIntArray189[local9] + " x " + local1669.aString7;
						} else if (local1669.aByteArray10 == null) {
							local316 = "It's a " + local1669.aString7 + ".";
						} else {
							local316 = new String(local1669.aByteArray10);
						}
						this.method649(0, "", local316);
					}
					if (local19 == 499 && this.method609(local24, local9, local14)) {
						this.aClass1_Sub1_Sub3_7.method144(78);
						this.aClass1_Sub1_Sub3_7.method182(local14 + this.anInt946);
						this.aClass1_Sub1_Sub3_7.method181(local9 + this.anInt945);
						this.aClass1_Sub1_Sub3_7.method180(local24 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_7.method181(this.anInt1092);
					}
					@Pc(1803) long local1803;
					@Pc(1788) String local1788;
					if (local19 == 465 || local19 == 816 || local19 == 968 || local19 == 397) {
						local1788 = this.aStringArray9[arg0];
						local129 = local1788.indexOf("@whi@");
						if (local129 != -1) {
							local1803 = Class20.method319(local1788.substring(local129 + 5).trim());
							if (local19 == 465) {
								this.method723(local1803);
							}
							if (local19 == 816) {
								this.method659(local1803);
							}
							if (local19 == 968) {
								this.method702(local1803);
							}
							if (local19 == 397) {
								this.method667(local1803);
							}
						}
					}
					if (local19 == 892) {
						this.method657();
					}
					if (local19 == 988) {
						this.anInt862 = 1;
						this.anInt863 = local9;
						this.anInt864 = local14;
						this.anInt865 = local24;
						this.aString18 = String.valueOf(Class19.method315(local24).aString7);
						this.anInt1091 = 0;
						this.aBoolean200 = true;
					} else {
						if (local19 == 254) {
							this.aClass1_Sub1_Sub3_7.method144(160);
							this.aClass1_Sub1_Sub3_7.method181(local9);
							this.aClass1_Sub1_Sub3_7.method146(local14);
							this.aClass1_Sub1_Sub3_7.method180(local24);
							this.anInt1030 = 0;
							this.anInt1031 = local14;
							this.anInt1032 = local9;
							this.anInt1033 = 2;
							if (Class43.method515(local14).anInt728 == this.anInt998) {
								this.anInt1033 = 1;
							}
							if (Class43.method515(local14).anInt728 == this.anInt911) {
								this.anInt1033 = 3;
							}
						}
						if (local19 == 403) {
							this.aClass1_Sub1_Sub3_7.method144(46);
							this.aClass1_Sub1_Sub3_7.method181(this.anInt865);
							this.aClass1_Sub1_Sub3_7.method146(local14);
							this.aClass1_Sub1_Sub3_7.method182(this.anInt864);
							this.aClass1_Sub1_Sub3_7.method181(this.anInt863);
							this.aClass1_Sub1_Sub3_7.method180(local9);
							this.aClass1_Sub1_Sub3_7.method180(local24);
							this.anInt1030 = 0;
							this.anInt1031 = local14;
							this.anInt1032 = local9;
							this.anInt1033 = 2;
							if (Class43.method515(local14).anInt728 == this.anInt998) {
								this.anInt1033 = 1;
							}
							if (Class43.method515(local14).anInt728 == this.anInt911) {
								this.anInt1033 = 3;
							}
						}
						if (local19 == 214) {
							local1788 = this.aStringArray9[arg0];
							local129 = local1788.indexOf("@whi@");
							if (local129 != -1) {
								if (this.anInt998 == -1) {
									this.method657();
									this.aString22 = local1788.substring(local129 + 5).trim();
									this.aBoolean227 = false;
									this.anInt1072 = this.anInt998 = Class43.anInt731;
								} else {
									this.method649(0, "", "Please close the interface you have open before using 'report abuse'");
								}
							}
						}
						if (local19 == 599) {
							this.aClass1_Sub1_Sub3_7.method144(69);
							this.aClass1_Sub1_Sub3_7.method146(local9);
							this.aClass1_Sub1_Sub3_7.method181(local14);
							this.aClass1_Sub1_Sub3_7.method182(local24);
							this.anInt1030 = 0;
							this.anInt1031 = local14;
							this.anInt1032 = local9;
							this.anInt1033 = 2;
							if (Class43.method515(local14).anInt728 == this.anInt998) {
								this.anInt1033 = 1;
							}
							if (Class43.method515(local14).anInt728 == this.anInt911) {
								this.anInt1033 = 3;
							}
						}
						if (local19 == 484) {
							if ((local9 & 0x3) == 0) {
								anInt972++;
							}
							if (anInt972 >= 63) {
								this.aClass1_Sub1_Sub3_7.method144(190);
								this.aClass1_Sub1_Sub3_7.method149(0);
								anInt972 = 0;
							}
							this.aClass1_Sub1_Sub3_7.method144(52);
							this.aClass1_Sub1_Sub3_7.method182(local9);
							this.aClass1_Sub1_Sub3_7.method180(local24);
							this.aClass1_Sub1_Sub3_7.method146(local14);
							this.anInt1030 = 0;
							this.anInt1031 = local14;
							this.anInt1032 = local9;
							this.anInt1033 = 2;
							if (Class43.method515(local14).anInt728 == this.anInt998) {
								this.anInt1033 = 1;
							}
							if (Class43.method515(local14).anInt728 == this.anInt911) {
								this.anInt1033 = 3;
							}
						}
						@Pc(2185) int local2185;
						if (local19 == 109) {
							local1788 = this.aStringArray9[arg0];
							local129 = local1788.indexOf("@whi@");
							if (local129 != -1) {
								local1803 = Class20.method319(local1788.substring(local129 + 5).trim());
								local2185 = -1;
								for (@Pc(2187) int local2187 = 0; local2187 < this.anInt951; local2187++) {
									if (this.aLongArray3[local2187] == local1803) {
										local2185 = local2187;
										break;
									}
								}
								if (local2185 != -1 && this.anIntArray213[local2185] > 0) {
									this.aBoolean194 = true;
									this.anInt1041 = 0;
									this.aBoolean208 = true;
									this.aString25 = "";
									this.anInt997 = 3;
									this.aLong33 = this.aLongArray3[local2185];
									this.aString31 = "Enter message to send to " + this.aStringArray14[local2185];
								}
							}
						}
						if (local19 == 743 || local19 == 485) {
							local1788 = this.aStringArray9[arg0];
							local129 = local1788.indexOf("@whi@");
							if (local129 != -1) {
								local1788 = local1788.substring(local129 + 5).trim();
								local331 = Class20.method323(this.aBoolean201, Class20.method320(Class20.method319(local1788)));
								@Pc(2281) boolean local2281 = false;
								for (local2185 = 0; local2185 < this.anInt906; local2185++) {
									@Pc(2293) Class1_Sub1_Sub1_Sub2_Sub1 local2293 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray223[local2185]];
									if (local2293 != null && local2293.aString3 != null && local2293.aString3.equalsIgnoreCase(local331)) {
										this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local2293.anIntArray73[0], 0, 0, this.anInt1090, local2293.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
										if (local19 == 743) {
											this.aClass1_Sub1_Sub3_7.method144(32);
											this.aClass1_Sub1_Sub3_7.method181(this.anIntArray223[local2185]);
										}
										if (local19 == 485) {
											this.aClass1_Sub1_Sub3_7.method144(182);
											this.aClass1_Sub1_Sub3_7.method181(this.anIntArray223[local2185]);
										}
										local2281 = true;
										break;
									}
								}
								if (!local2281) {
									this.method649(0, "", "Unable to find " + local331);
								}
							}
						}
						if (local19 == 26) {
							this.method609(local24, local9, local14);
							this.aClass1_Sub1_Sub3_7.method144(131);
							this.aClass1_Sub1_Sub3_7.method181(local9 + this.anInt945);
							this.aClass1_Sub1_Sub3_7.method180(local14 + this.anInt946);
							this.aClass1_Sub1_Sub3_7.method146(local24 >> 14 & 0x7FFF);
						}
						if (local19 == 131) {
							local910 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local24];
							if (local910 != null) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local910.anIntArray73[0], 0, 0, this.anInt1090, local910.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
								this.anInt1006 = super.anInt854;
								this.anInt1007 = super.anInt855;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass1_Sub1_Sub3_7.method144(149);
								this.aClass1_Sub1_Sub3_7.method180(local24);
							}
						}
						if (local19 == 705) {
							local228 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 0, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							if (!local228) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							}
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass1_Sub1_Sub3_7.method144(58);
							this.aClass1_Sub1_Sub3_7.method146(local9 + this.anInt945);
							this.aClass1_Sub1_Sub3_7.method181(local14 + this.anInt946);
							this.aClass1_Sub1_Sub3_7.method182(local24);
						}
						if (local19 == 823) {
							local228 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 0, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							if (!local228) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							}
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass1_Sub1_Sub3_7.method144(42);
							this.aClass1_Sub1_Sub3_7.method146(this.anInt864);
							this.aClass1_Sub1_Sub3_7.method182(local24);
							this.aClass1_Sub1_Sub3_7.method181(this.anInt865);
							this.aClass1_Sub1_Sub3_7.method180(local14 + this.anInt946);
							this.aClass1_Sub1_Sub3_7.method182(this.anInt863);
							this.aClass1_Sub1_Sub3_7.method146(local9 + this.anInt945);
						}
						if (local19 == 534) {
							anInt914++;
							if (anInt914 >= 82) {
								this.aClass1_Sub1_Sub3_7.method144(179);
								this.aClass1_Sub1_Sub3_7.method148(5085002);
								anInt914 = 0;
							}
							this.method609(local24, local9, local14);
							this.aClass1_Sub1_Sub3_7.method144(28);
							this.aClass1_Sub1_Sub3_7.method180(local14 + this.anInt946);
							this.aClass1_Sub1_Sub3_7.method180(local24 >> 14 & 0x7FFF);
							this.aClass1_Sub1_Sub3_7.method182(local9 + this.anInt945);
						}
						if (local19 == 370) {
							local539 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local24];
							if (local539 != null) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local539.anIntArray73[0], 0, 0, this.anInt1090, local539.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
								this.anInt1006 = super.anInt854;
								this.anInt1007 = super.anInt855;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass1_Sub1_Sub3_7.method144(82);
								this.aClass1_Sub1_Sub3_7.method146(local24);
							}
						}
						if (local19 == 170) {
							local539 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local24];
							if (local539 != null) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local539.anIntArray73[0], 0, 0, this.anInt1090, local539.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
								this.anInt1006 = super.anInt854;
								this.anInt1007 = super.anInt855;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass1_Sub1_Sub3_7.method144(32);
								this.aClass1_Sub1_Sub3_7.method181(local24);
							}
						}
						if (local19 == 1163) {
							local910 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local24];
							if (local910 != null) {
								@Pc(2874) Class31 local2874 = local910.aClass31_2;
								if (local2874.anIntArray147 != null) {
									local2874 = local2874.method475(863);
								}
								if (local2874 != null) {
									if (local2874.aByteArray14 == null) {
										local331 = "It's a " + local2874.aString8 + ".";
									} else {
										local331 = new String(local2874.aByteArray14);
									}
									this.method649(0, "", local331);
								}
							}
						}
						if (local19 == 588) {
							local910 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local24];
							if (local910 != null) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local910.anIntArray73[0], 0, 0, this.anInt1090, local910.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
								this.anInt1006 = super.anInt854;
								this.anInt1007 = super.anInt855;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass1_Sub1_Sub3_7.method144(238);
								this.aClass1_Sub1_Sub3_7.method181(local24);
							}
						}
						if (local19 == 139) {
							this.aClass1_Sub1_Sub3_7.method144(62);
							this.aClass1_Sub1_Sub3_7.method180(local14);
							this.aClass1_Sub1_Sub3_7.method181(this.anInt1092);
							this.aClass1_Sub1_Sub3_7.method181(local9);
							this.aClass1_Sub1_Sub3_7.method181(local24);
							this.anInt1030 = 0;
							this.anInt1031 = local14;
							this.anInt1032 = local9;
							this.anInt1033 = 2;
							if (Class43.method515(local14).anInt728 == this.anInt998) {
								this.anInt1033 = 1;
							}
							if (Class43.method515(local14).anInt728 == this.anInt911) {
								this.anInt1033 = 3;
							}
						}
						if (local19 == 715) {
							local111 = Class43.method515(local14);
							@Pc(3040) boolean local3040 = true;
							if (local111.anInt725 > 0) {
								local3040 = this.method669(local111);
							}
							if (local3040) {
								this.aClass1_Sub1_Sub3_7.method144(146);
								this.aClass1_Sub1_Sub3_7.method146(local14);
							}
						}
						if (local19 == 564) {
							local539 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local24];
							if (local539 != null) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local539.anIntArray73[0], 0, 0, this.anInt1090, local539.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
								this.anInt1006 = super.anInt854;
								this.anInt1007 = super.anInt855;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass1_Sub1_Sub3_7.method144(182);
								this.aClass1_Sub1_Sub3_7.method181(local24);
							}
						}
						if (local19 == 1937) {
							local1669 = Class19.method315(local24);
							if (local1669.aByteArray10 == null) {
								local316 = "It's a " + local1669.aString7 + ".";
							} else {
								local316 = new String(local1669.aByteArray10);
							}
							this.method649(0, "", local316);
						}
						if (local19 == 642) {
							local228 = this.method695(0, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 0, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							if (!local228) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local14, 0, 0, this.anInt1090, local9, false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
							}
							this.anInt1006 = super.anInt854;
							this.anInt1007 = super.anInt855;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass1_Sub1_Sub3_7.method144(252);
							this.aClass1_Sub1_Sub3_7.method182(local14 + this.anInt946);
							this.aClass1_Sub1_Sub3_7.method180(local9 + this.anInt945);
							this.aClass1_Sub1_Sub3_7.method180(local24);
						}
						if (local19 == 328 && !this.aBoolean224) {
							this.aClass1_Sub1_Sub3_7.method144(95);
							this.aClass1_Sub1_Sub3_7.method146(local14);
							this.aBoolean224 = true;
						}
						if (local19 == 533) {
							this.aClass1_Sub1_Sub3_7.method144(192);
							this.aClass1_Sub1_Sub3_7.method146(local14);
							this.aClass1_Sub1_Sub3_7.method180(local9);
							this.aClass1_Sub1_Sub3_7.method146(local24);
							this.anInt1030 = 0;
							this.anInt1031 = local14;
							this.anInt1032 = local9;
							this.anInt1033 = 2;
							if (Class43.method515(local14).anInt728 == this.anInt998) {
								this.anInt1033 = 1;
							}
							if (Class43.method515(local14).anInt728 == this.anInt911) {
								this.anInt1033 = 3;
							}
						}
						if (local19 == 400) {
							this.method609(local24, local9, local14);
							this.aClass1_Sub1_Sub3_7.method144(143);
							this.aClass1_Sub1_Sub3_7.method181(local14 + this.anInt946);
							this.aClass1_Sub1_Sub3_7.method182(local24 >> 14 & 0x7FFF);
							this.aClass1_Sub1_Sub3_7.method181(local9 + this.anInt945);
						}
						if (local19 == 471) {
							local910 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local24];
							if (local910 != null) {
								this.method695(1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0], 2, 1, 0, local910.anIntArray73[0], 0, 0, this.anInt1090, local910.anIntArray72[0], false, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]);
								this.anInt1006 = super.anInt854;
								this.anInt1007 = super.anInt855;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass1_Sub1_Sub3_7.method144(180);
								this.aClass1_Sub1_Sub3_7.method180(this.anInt1092);
								this.aClass1_Sub1_Sub3_7.method180(local24);
							}
						}
						if (local19 == 851) {
							this.aClass1_Sub1_Sub3_7.method144(242);
							this.aClass1_Sub1_Sub3_7.method182(local9);
							this.aClass1_Sub1_Sub3_7.method146(local24);
							this.aClass1_Sub1_Sub3_7.method146(local14);
							this.anInt1030 = 0;
							this.anInt1031 = local14;
							this.anInt1032 = local9;
							this.anInt1033 = 2;
							if (Class43.method515(local14).anInt728 == this.anInt998) {
								this.anInt1033 = 1;
							}
							if (Class43.method515(local14).anInt728 == this.anInt911) {
								this.anInt1033 = 3;
							}
						}
						if (local19 == 1039) {
							this.method609(local24, local9, local14);
							this.aClass1_Sub1_Sub3_7.method144(1);
							this.aClass1_Sub1_Sub3_7.method181(local14 + this.anInt946);
							this.aClass1_Sub1_Sub3_7.method180(local24 >> 14 & 0x7FFF);
							this.aClass1_Sub1_Sub3_7.method182(local9 + this.anInt945);
						}
						this.anInt862 = 0;
						this.anInt1091 = 0;
						this.aBoolean200 = true;
					}
				}
			}
		} catch (@Pc(3523) RuntimeException local3523) {
			signlink.reporterror("22587, " + -287 + ", " + arg0 + ", " + local3523.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				if (this.aStringArray12[local14] != null) {
					@Pc(26) int local26 = this.anIntArray247[local14];
					@Pc(37) int local37 = this.anInt910 + 70 + 4 - local12 * 14;
					if (local37 < -20) {
						break;
					}
					@Pc(45) String local45 = this.aStringArray11[local14];
					if (local45 != null && local45.startsWith("@cr1@")) {
						local45 = local45.substring(5);
					}
					if (local45 != null && local45.startsWith("@cr2@")) {
						local45 = local45.substring(5);
					}
					if (local26 == 0) {
						local12++;
					}
					if ((local26 == 1 || local26 == 2) && (local26 == 1 || this.anInt888 == 0 || this.anInt888 == 1 && this.method663(7, local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37 && !local45.equals(aClass1_Sub1_Sub1_Sub2_Sub1_1.aString3)) {
							if (this.anInt1049 >= 1) {
								this.aStringArray9[this.anInt1054] = "Report abuse @whi@" + local45;
								this.anIntArray216[this.anInt1054] = 214;
								this.anInt1054++;
							}
							this.aStringArray9[this.anInt1054] = "Add ignore @whi@" + local45;
							this.anIntArray216[this.anInt1054] = 816;
							this.anInt1054++;
							this.aStringArray9[this.anInt1054] = "Add friend @whi@" + local45;
							this.anIntArray216[this.anInt1054] = 465;
							this.anInt1054++;
						}
						local12++;
					}
					if ((local26 == 3 || local26 == 7) && this.anInt986 == 0 && (local26 == 7 || this.anInt1074 == 0 || this.anInt1074 == 1 && this.method663(7, local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							if (this.anInt1049 >= 1) {
								this.aStringArray9[this.anInt1054] = "Report abuse @whi@" + local45;
								this.anIntArray216[this.anInt1054] = 214;
								this.anInt1054++;
							}
							this.aStringArray9[this.anInt1054] = "Add ignore @whi@" + local45;
							this.anIntArray216[this.anInt1054] = 816;
							this.anInt1054++;
							this.aStringArray9[this.anInt1054] = "Add friend @whi@" + local45;
							this.anIntArray216[this.anInt1054] = 465;
							this.anInt1054++;
						}
						local12++;
					}
					if (local26 == 4 && (this.anInt961 == 0 || this.anInt961 == 1 && this.method663(7, local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							this.aStringArray9[this.anInt1054] = "Accept trade @whi@" + local45;
							this.anIntArray216[this.anInt1054] = 743;
							this.anInt1054++;
						}
						local12++;
					}
					if ((local26 == 5 || local26 == 6) && this.anInt986 == 0 && this.anInt1074 < 2) {
						local12++;
					}
					if (local26 == 8 && (this.anInt961 == 0 || this.anInt961 == 1 && this.method663(7, local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							this.aStringArray9[this.anInt1054] = "Accept challenge @whi@" + local45;
							this.anIntArray216[this.anInt1054] = 485;
							this.anInt1054++;
						}
						local12++;
					}
				}
			}
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("94104, " + -413 + ", " + arg0 + ", " + arg1 + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method674() {
		try {
			Class44.aClass41_7.method500();
			Class44.aClass41_8.method500();
			Class31.aClass41_4.method500();
			Class19.aClass41_3.method500();
			Class19.aClass41_2.method500();
			Class1_Sub1_Sub1_Sub2_Sub1.aClass41_1.method500();
			Class46.aClass41_9.method500();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("84226, " + 345 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method675() {
		try {
			if (this.anInt975 == 0) {
				this.aStringArray9[0] = "Cancel";
				this.anIntArray216[0] = 1472;
				this.anInt1054 = 1;
				if (this.anInt1085 == -1) {
					this.method665(this.aByte29);
					this.anInt1037 = 0;
					this.anInt1082 = 0;
					if (super.anInt848 > 4 && super.anInt849 > 4 && super.anInt848 < 516 && super.anInt849 < 338) {
						if (this.anInt998 == -1) {
							this.method651();
						} else {
							this.method717(0, 0, super.anInt848, Class43.method515(this.anInt998), (byte) 4, 4, super.anInt849, 4);
						}
					}
					if (this.anInt1037 != this.anInt915) {
						this.anInt915 = this.anInt1037;
					}
					if (this.anInt1082 != this.anInt867) {
						this.anInt867 = this.anInt1082;
					}
					this.anInt1037 = 0;
					this.anInt1082 = 0;
					if (super.anInt848 > 553 && super.anInt849 > 205 && super.anInt848 < 743 && super.anInt849 < 466) {
						if (this.anInt954 != -1) {
							this.method717(1, 0, super.anInt848, Class43.method515(this.anInt954), (byte) 4, 553, super.anInt849, 205);
						} else if (this.anIntArray274[this.anInt965] != -1) {
							this.method717(1, 0, super.anInt848, Class43.method515(this.anIntArray274[this.anInt965]), (byte) 4, 553, super.anInt849, 205);
						}
					}
					if (this.anInt1037 != this.anInt987) {
						this.aBoolean200 = true;
						this.anInt987 = this.anInt1037;
					}
					if (this.anInt1082 != this.anInt1077) {
						this.aBoolean200 = true;
						this.anInt1077 = this.anInt1082;
					}
					this.anInt1037 = 0;
					this.anInt1082 = 0;
					if (super.anInt848 > 17 && super.anInt849 > 357 && super.anInt848 < 496 && super.anInt849 < 453) {
						if (this.anInt911 != -1) {
							this.method717(2, 0, super.anInt848, Class43.method515(this.anInt911), (byte) 4, 17, super.anInt849, 357);
						} else if (this.anInt990 != -1) {
							this.method717(3, 0, super.anInt848, Class43.method515(this.anInt990), (byte) 4, 17, super.anInt849, 357);
						} else if (super.anInt849 < 434 && super.anInt848 < 426 && this.anInt1041 == 0) {
							this.method673(super.anInt849 - 357, super.anInt848 - 17);
						}
					}
					if ((this.anInt911 != -1 || this.anInt990 != -1) && this.anInt1037 != this.anInt1048) {
						this.aBoolean194 = true;
						this.anInt1048 = this.anInt1037;
					}
					if ((this.anInt911 != -1 || this.anInt990 != -1) && this.anInt1082 != this.anInt1051) {
						this.aBoolean194 = true;
						this.anInt1051 = this.anInt1082;
					}
					@Pc(347) boolean local347 = false;
					while (!local347) {
						local347 = true;
						for (@Pc(353) int local353 = 0; local353 < this.anInt1054 - 1; local353++) {
							if (this.anIntArray216[local353] < 1000 && this.anIntArray216[local353 + 1] > 1000) {
								@Pc(374) String local374 = this.aStringArray9[local353];
								this.aStringArray9[local353] = this.aStringArray9[local353 + 1];
								this.aStringArray9[local353 + 1] = local374;
								@Pc(396) int local396 = this.anIntArray216[local353];
								this.anIntArray216[local353] = this.anIntArray216[local353 + 1];
								this.anIntArray216[local353 + 1] = local396;
								@Pc(418) int local418 = this.anIntArray214[local353];
								this.anIntArray214[local353] = this.anIntArray214[local353 + 1];
								this.anIntArray214[local353 + 1] = local418;
								@Pc(440) int local440 = this.anIntArray215[local353];
								this.anIntArray215[local353] = this.anIntArray215[local353 + 1];
								this.anIntArray215[local353 + 1] = local440;
								@Pc(462) int local462 = this.anIntArray217[local353];
								this.anIntArray217[local353] = this.anIntArray217[local353 + 1];
								this.anIntArray217[local353 + 1] = local462;
								local347 = false;
							}
						}
					}
				} else {
					this.anInt1037 = 0;
					this.anInt1082 = 0;
					this.method717(0, 0, super.anInt848, Class43.method515(this.anInt1085), (byte) 4, 0, super.anInt849, 0);
					if (this.anInt1037 != this.anInt915) {
						this.anInt915 = this.anInt1037;
					}
					if (this.anInt1082 != this.anInt867) {
						this.anInt867 = this.anInt1082;
					}
				}
			}
		} catch (@Pc(492) RuntimeException local492) {
			signlink.reporterror("77105, " + 544 + ", " + local492.toString());
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

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method676(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt1054 >= 2 || this.anInt862 != 0 || this.anInt1091 != 0) {
				@Pc(16) boolean local16 = false;
				@Pc(35) String local35;
				if (this.anInt862 == 1 && this.anInt1054 < 2) {
					local35 = "Use " + this.aString18 + " with...";
				} else if (this.anInt1091 == 1 && this.anInt1054 < 2) {
					local35 = this.aString30 + "...";
				} else {
					local35 = this.aStringArray9[this.anInt1054 - 1];
				}
				if (this.anInt1054 > 2) {
					local35 = local35 + "@whi@ / " + (this.anInt1054 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub3_4.method270(local35, 15, 16777215, 4, anInt1079 / 1000);
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("92486, " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EYMNCFMK;I)V")
	private void method677(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt302 + 10 < arg1 * 8) {
					@Pc(25) int local25 = arg0.method166(11);
					if (local25 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local25] == null) {
							this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local25] = new Class1_Sub1_Sub1_Sub2_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local25] != null) {
								this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local25].method83(this.aClass1_Sub1_Sub3Array1[local25]);
							}
						}
						this.anIntArray223[this.anInt906++] = local25;
						@Pc(71) Class1_Sub1_Sub1_Sub2_Sub1 local71 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local25];
						local71.anInt449 = anInt1079;
						@Pc(79) int local79 = arg0.method166(1);
						if (local79 == 1) {
							this.anIntArray224[this.anInt907++] = local25;
						}
						@Pc(98) int local98 = arg0.method166(1);
						@Pc(103) int local103 = arg0.method166(5);
						if (local103 > 15) {
							local103 -= 32;
						}
						@Pc(112) int local112 = arg0.method166(5);
						if (local112 > 15) {
							local112 -= 32;
						}
						local71.method303(local98 == 1, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0] + local103, aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0] + local112);
						continue;
					}
				}
				arg0.method167(this.aByte31);
				return;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("43950, " + -488 + ", " + arg0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EFVUNBHT;IIB)V")
	private void method678(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg1 * arg1 + arg2 * arg2;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(26) int local26 = this.anInt1000 + this.anInt878 & 0x7FF;
				@Pc(30) int local30 = Class1_Sub1_Sub1_Sub5.anIntArray126[local26];
				@Pc(34) int local34 = Class1_Sub1_Sub1_Sub5.anIntArray127[local26];
				@Pc(43) int local43 = local30 * 256 / (this.anInt1042 + 256);
				@Pc(52) int local52 = local34 * 256 / (this.anInt1042 + 256);
				@Pc(62) int local62 = arg2 * local43 + arg1 * local52 >> 16;
				@Pc(72) int local72 = arg2 * local52 - arg1 * local43 >> 16;
				@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
				@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
				@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_9.method134(850, local78, 83 - local90 - 20, local84 + 94 + 4 - 10);
			} else {
				this.method721(arg2, arg1, arg0);
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("21032, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!EYMNCFMK;I)V")
	private void method679(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt991 += 0;
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(22) int local22;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(40) int local40;
			@Pc(47) int local47;
			@Pc(71) int local71;
			@Pc(97) int local97;
			@Pc(109) int local109;
			@Pc(129) int local129;
			@Pc(51) int local51;
			@Pc(83) int local83;
			if (arg0 == 213) {
				local14 = arg1.method175();
				local18 = local14 >> 2;
				local22 = local14 & 0x3;
				local27 = this.anIntArray261[local18];
				local31 = arg1.method174();
				local40 = this.anInt902 + (local31 >> 4 & 0x7);
				local47 = this.anInt903 + (local31 & 0x7);
				local51 = arg1.method184();
				if (local40 >= 0 && local47 >= 0 && local40 < 103 && local47 < 103) {
					local71 = this.anIntArrayArrayArray8[this.anInt918][local40][local47];
					local83 = this.anIntArrayArrayArray8[this.anInt918][local40 + 1][local47];
					local97 = this.anIntArrayArrayArray8[this.anInt918][local40 + 1][local47 + 1];
					local109 = this.anIntArrayArrayArray8[this.anInt918][local40][local47 + 1];
					if (local27 == 0) {
						@Pc(120) Class27 local120 = this.aClass9_1.method217(this.anInt918, local47, local40);
						if (local120 != null) {
							local129 = local120.anInt620 >> 14 & 0x7FFF;
							if (local18 == 2) {
								local120.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub4(723, local109, local97, local51, local83, local71, local22 + 4, local129, false, 2);
								local120.aClass1_Sub1_Sub1_3 = new Class1_Sub1_Sub1_Sub4(723, local109, local97, local51, local83, local71, local22 + 1 & 0x3, local129, false, 2);
							} else {
								local120.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub4(723, local109, local97, local51, local83, local71, local22, local129, false, local18);
							}
						}
					}
					if (local27 == 1) {
						@Pc(197) Class36 local197 = this.aClass9_1.method218((byte) 3, this.anInt918, local47, local40);
						if (local197 != null) {
							local197.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub4(723, local109, local97, local51, local83, local71, 0, local197.anInt687 >> 14 & 0x7FFF, false, 4);
						}
					}
					if (local27 == 2) {
						@Pc(231) Class37 local231 = this.aClass9_1.method219(this.anInt918, local40, local47);
						if (local18 == 11) {
							local18 = 10;
						}
						if (local231 != null) {
							local231.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub4(723, local109, local97, local51, local83, local71, local22, local231.anInt699 >> 14 & 0x7FFF, false, local18);
						}
					}
					if (local27 == 3) {
						@Pc(270) Class17 local270 = this.aClass9_1.method220(local40, this.anInt918, local47);
						if (local270 != null) {
							local270.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub4(723, local109, local97, local51, local83, local71, local22, local270.anInt413 >> 14 & 0x7FFF, false, 22);
						}
					}
				}
			} else if (arg0 == 22) {
				local14 = arg1.method155();
				local18 = this.anInt902 + (local14 >> 4 & 0x7);
				local22 = this.anInt903 + (local14 & 0x7);
				local27 = arg1.method157();
				local31 = arg1.method157();
				local40 = arg1.method157();
				if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
					@Pc(344) Class6 local344 = this.aClass6ArrayArrayArray1[this.anInt918][local18][local22];
					if (local344 != null) {
						for (@Pc(350) Class1_Sub1_Sub1_Sub6 local350 = (Class1_Sub1_Sub1_Sub6) local344.method97(); local350 != null; local350 = (Class1_Sub1_Sub1_Sub6) local344.method99(569)) {
							if (local350.anInt719 == (local27 & 0x7FFF) && local350.anInt717 == local31) {
								local350.anInt717 = local40;
								break;
							}
						}
						this.method611(local18, local22);
					}
				}
			} else {
				if (arg0 == 8) {
					local14 = arg1.method155();
					local18 = this.anInt902 + (local14 >> 4 & 0x7);
					local22 = this.anInt903 + (local14 & 0x7);
					local27 = arg1.method157();
					local31 = arg1.method155();
					local40 = local31 >> 4 & 0xF;
					local47 = local31 & 0x7;
					if (aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0] >= local18 - local40 && aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0] <= local18 + local40 && aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0] >= local22 - local40 && aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0] <= local22 + local40 && this.aBoolean197 && !aBoolean191 && this.anInt1040 < 50) {
						this.anIntArray219[this.anInt1040] = local27;
						this.anIntArray270[this.anInt1040] = local47;
						this.anIntArray262[this.anInt1040] = Class24.anIntArray88[local27];
						this.anInt1040++;
					}
				}
				@Pc(544) int local544;
				if (arg0 == 102) {
					local14 = arg1.method155();
					local18 = this.anInt902 + (local14 >> 4 & 0x7);
					local22 = this.anInt903 + (local14 & 0x7);
					local27 = local18 + arg1.method156();
					local31 = local22 + arg1.method156();
					local40 = arg1.method158();
					local47 = arg1.method157();
					local51 = arg1.method155() * 4;
					local71 = arg1.method155() * 4;
					local83 = arg1.method157();
					local97 = arg1.method157();
					local109 = arg1.method155();
					local544 = arg1.method155();
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104 && local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104 && local47 != 65535) {
						local18 = local18 * 128 + 64;
						local22 = local22 * 128 + 64;
						local27 = local27 * 128 + 64;
						local31 = local31 * 128 + 64;
						@Pc(620) Class1_Sub1_Sub1_Sub3 local620 = new Class1_Sub1_Sub1_Sub3(local40, local71, local83 + anInt1079, this.anInt918, local47, local18, local22, local97 + anInt1079, local544, local109, this.method719(this.anInt918, local18, local22) - local51, 0);
						local620.method90(local31, this.method719(this.anInt918, local27, local31) - local71, local83 + anInt1079, local27);
						this.aClass6_12.method94(local620);
					}
				} else if (arg0 == 61) {
					local14 = arg1.method155();
					local18 = this.anInt902 + (local14 >> 4 & 0x7);
					local22 = this.anInt903 + (local14 & 0x7);
					local27 = arg1.method174();
					local31 = local27 >> 2;
					local40 = local27 & 0x3;
					local47 = this.anIntArray261[local31];
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
						this.method708(local18, local31, local22, 0, (byte) 9, local40, local47, this.anInt918, -1, -1);
					}
				} else {
					@Pc(758) Class1_Sub1_Sub1_Sub6 local758;
					if (arg0 == 212) {
						local14 = arg1.method184();
						local18 = arg1.method175();
						local22 = this.anInt902 + (local18 >> 4 & 0x7);
						local27 = this.anInt903 + (local18 & 0x7);
						if (local22 >= 0 && local27 >= 0 && local22 < 104 && local27 < 104) {
							@Pc(752) Class6 local752 = this.aClass6ArrayArrayArray1[this.anInt918][local22][local27];
							if (local752 != null) {
								for (local758 = (Class1_Sub1_Sub1_Sub6) local752.method97(); local758 != null; local758 = (Class1_Sub1_Sub1_Sub6) local752.method99(569)) {
									if (local758.anInt719 == (local14 & 0x7FFF)) {
										local758.method501();
										break;
									}
								}
								if (local752.method97() == null) {
									this.aClass6ArrayArrayArray1[this.anInt918][local22][local27] = null;
								}
								this.method611(local22, local27);
							}
						}
					} else if (arg0 == 197) {
						local14 = arg1.method155();
						local18 = this.anInt902 + (local14 >> 4 & 0x7);
						local22 = this.anInt903 + (local14 & 0x7);
						local27 = arg1.method157();
						local31 = arg1.method155();
						local40 = arg1.method157();
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
							local18 = local18 * 128 + 64;
							local22 = local22 * 128 + 64;
							@Pc(869) Class1_Sub1_Sub1_Sub1 local869 = new Class1_Sub1_Sub1_Sub1(local18, (byte) 112, this.anInt918, local27, local40, anInt1079, local22, this.method719(this.anInt918, local18, local22) - local31);
							this.aClass6_10.method94(local869);
						}
					} else if (arg0 == 222) {
						local14 = arg1.method184();
						local18 = arg1.method174();
						local22 = this.anInt902 + (local18 >> 4 & 0x7);
						local27 = this.anInt903 + (local18 & 0x7);
						local31 = arg1.method185();
						if (local22 >= 0 && local27 >= 0 && local22 < 104 && local27 < 104) {
							local758 = new Class1_Sub1_Sub1_Sub6();
							local758.anInt719 = local14;
							local758.anInt717 = local31;
							if (this.aClass6ArrayArrayArray1[this.anInt918][local22][local27] == null) {
								this.aClass6ArrayArrayArray1[this.anInt918][local22][local27] = new Class6((byte) 5);
							}
							this.aClass6ArrayArrayArray1[this.anInt918][local22][local27].method94(local758);
							this.method611(local22, local27);
						}
					} else if (arg0 == 225) {
						local14 = arg1.method176();
						local18 = local14 >> 2;
						local22 = local14 & 0x3;
						local27 = this.anIntArray261[local18];
						local31 = arg1.method185();
						local40 = arg1.method155();
						local47 = this.anInt902 + (local40 >> 4 & 0x7);
						local51 = this.anInt903 + (local40 & 0x7);
						if (local47 >= 0 && local51 >= 0 && local47 < 104 && local51 < 104) {
							this.method708(local47, local18, local51, 0, (byte) 9, local22, local27, this.anInt918, -1, local31);
						}
					} else if (arg0 == 255) {
						local14 = arg1.method185();
						local18 = arg1.method155();
						local22 = this.anInt902 + (local18 >> 4 & 0x7);
						local27 = this.anInt903 + (local18 & 0x7);
						local31 = arg1.method157();
						local40 = arg1.method184();
						if (local22 >= 0 && local27 >= 0 && local22 < 104 && local27 < 104 && local31 != this.anInt1046) {
							@Pc(1082) Class1_Sub1_Sub1_Sub6 local1082 = new Class1_Sub1_Sub1_Sub6();
							local1082.anInt719 = local14;
							local1082.anInt717 = local40;
							if (this.aClass6ArrayArrayArray1[this.anInt918][local22][local27] == null) {
								this.aClass6ArrayArrayArray1[this.anInt918][local22][local27] = new Class6((byte) 5);
							}
							this.aClass6ArrayArrayArray1[this.anInt918][local22][local27].method94(local1082);
							this.method611(local22, local27);
						}
					} else if (arg0 == 99) {
						local14 = arg1.method157();
						@Pc(1137) byte local1137 = arg1.method177();
						local22 = arg1.method174();
						local27 = local22 >> 2;
						local31 = local22 & 0x3;
						local40 = this.anIntArray261[local27];
						local47 = arg1.method184();
						@Pc(1162) byte local1162 = arg1.method179();
						local71 = arg1.method185();
						@Pc(1170) byte local1170 = arg1.method178();
						local97 = arg1.method183();
						local109 = arg1.method155();
						local544 = this.anInt902 + (local109 >> 4 & 0x7);
						local129 = this.anInt903 + (local109 & 0x7);
						@Pc(1197) byte local1197 = arg1.method177();
						@Pc(1203) Class1_Sub1_Sub1_Sub2_Sub1 local1203;
						if (local97 == this.anInt1046) {
							local1203 = aClass1_Sub1_Sub1_Sub2_Sub1_1;
						} else {
							local1203 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local97];
						}
						if (local1203 != null) {
							@Pc(1215) Class44 local1215 = Class44.method519(local71);
							@Pc(1225) int local1225 = this.anIntArrayArrayArray8[this.anInt918][local544][local129];
							@Pc(1237) int local1237 = this.anIntArrayArrayArray8[this.anInt918][local544 + 1][local129];
							@Pc(1251) int local1251 = this.anIntArrayArrayArray8[this.anInt918][local544 + 1][local129 + 1];
							@Pc(1263) int local1263 = this.anIntArrayArrayArray8[this.anInt918][local544][local129 + 1];
							@Pc(1273) Class1_Sub1_Sub1_Sub5 local1273 = local1215.method520(local27, local31, local1225, local1237, local1251, local1263, -1);
							if (local1273 != null) {
								this.method708(local544, 0, local129, local47 + 1, (byte) 9, 0, local40, this.anInt918, local14 + 1, -1);
								local1203.anInt176 = local47 + anInt1079;
								local1203.anInt177 = local14 + anInt1079;
								local1203.aClass1_Sub1_Sub1_Sub5_1 = local1273;
								@Pc(1308) int local1308 = local1215.anInt773;
								@Pc(1311) int local1311 = local1215.anInt777;
								if (local31 == 1 || local31 == 3) {
									local1308 = local1215.anInt777;
									local1311 = local1215.anInt773;
								}
								local1203.anInt190 = local544 * 128 + local1308 * 64;
								local1203.anInt192 = local129 * 128 + local1311 * 64;
								local1203.anInt191 = this.method719(this.anInt918, local1203.anInt190, local1203.anInt192);
								@Pc(1357) byte local1357;
								if (local1137 > local1170) {
									local1357 = local1137;
									local1137 = local1170;
									local1170 = local1357;
								}
								if (local1197 > local1162) {
									local1357 = local1197;
									local1197 = local1162;
									local1162 = local1357;
								}
								local1203.anInt183 = local544 + local1137;
								local1203.anInt185 = local544 + local1170;
								local1203.anInt184 = local129 + local1197;
								local1203.anInt186 = local129 + local1162;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1392) RuntimeException local1392) {
			signlink.reporterror("21394, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local1392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method680(@OriginalArg(0) byte arg0) {
		try {
			this.aClass48_21.method555();
			Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray244;
			@Pc(13) boolean local13 = false;
			this.aClass1_Sub1_Sub2_Sub4_13.method363(0, 0);
			if (this.anInt954 != -1) {
				this.method664(0, 0, 0, Class43.method515(this.anInt954), 726);
			} else if (this.anIntArray274[this.anInt965] != -1) {
				this.method664(0, 0, 0, Class43.method515(this.anIntArray274[this.anInt965]), 726);
			}
			if (this.aBoolean225 && this.anInt1025 == 1) {
				this.method592();
			}
			this.aClass48_21.method556(super.aGraphics2, 205, 904, 553);
			this.aClass48_23.method555();
			Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("4359, " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!EYMNCFMK;I)V")
	private void method681(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method165((byte) 9);
			@Pc(9) int local9 = arg0.method166(8);
			@Pc(15) int local15;
			if (local9 < this.anInt920) {
				for (local15 = local9; local15 < this.anInt920; local15++) {
					this.anIntArray267[this.anInt1076++] = this.anIntArray227[local15];
				}
			}
			if (local9 > this.anInt920) {
				signlink.reporterror(this.aString19 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt920 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(67) int local67 = this.anIntArray227[local15];
				@Pc(72) Class1_Sub1_Sub1_Sub2_Sub2 local72 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local67];
				@Pc(77) int local77 = arg0.method166(1);
				if (local77 == 0) {
					this.anIntArray227[this.anInt920++] = local67;
					local72.anInt449 = anInt1079;
				} else {
					@Pc(100) int local100 = arg0.method166(2);
					if (local100 == 0) {
						this.anIntArray227[this.anInt920++] = local67;
						local72.anInt449 = anInt1079;
						this.anIntArray224[this.anInt907++] = local67;
					} else {
						@Pc(151) int local151;
						@Pc(161) int local161;
						if (local100 == 1) {
							this.anIntArray227[this.anInt920++] = local67;
							local72.anInt449 = anInt1079;
							local151 = arg0.method166(3);
							local72.method304(false, local151);
							local161 = arg0.method166(1);
							if (local161 == 1) {
								this.anIntArray224[this.anInt907++] = local67;
							}
						} else if (local100 == 2) {
							this.anIntArray227[this.anInt920++] = local67;
							local72.anInt449 = anInt1079;
							local151 = arg0.method166(3);
							local72.method304(true, local151);
							local161 = arg0.method166(3);
							local72.method304(true, local161);
							@Pc(219) int local219 = arg0.method166(1);
							if (local219 == 1) {
								this.anIntArray224[this.anInt907++] = local67;
							}
						} else if (local100 == 3) {
							this.anIntArray267[this.anInt1076++] = local67;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("67991, " + -419 + ", " + arg0 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)I")
	private int method682() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt1062 < 310) {
				@Pc(17) int local17 = this.anInt1059 >> 7;
				@Pc(22) int local22 = this.anInt1061 >> 7;
				@Pc(27) int local27 = aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 >> 7;
				@Pc(32) int local32 = aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt918][local17][local22] & 0x4) != 0) {
					local3 = this.anInt918;
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
						if ((this.aByteArrayArrayArray8[this.anInt918][local17][local22] & 0x4) != 0) {
							local3 = this.anInt918;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt918][local17][local22] & 0x4) != 0) {
								local3 = this.anInt918;
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
						if ((this.aByteArrayArrayArray8[this.anInt918][local17][local22] & 0x4) != 0) {
							local3 = this.anInt918;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt918][local17][local22] & 0x4) != 0) {
								local3 = this.anInt918;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt918][aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 >> 7][aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 >> 7] & 0x4) != 0) {
				local3 = this.anInt918;
			}
			return local3;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("67811, " + 475 + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)I")
	private int method683() {
		try {
			@Pc(9) int local9 = this.method719(this.anInt918, this.anInt1059, this.anInt1061);
			return local9 - this.anInt1060 >= 800 || (this.aByteArrayArrayArray8[this.anInt918][this.anInt1059 >> 7][this.anInt1061 >> 7] & 0x4) == 0 ? 3 : this.anInt918;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("70865, " + -1399 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method684() {
		try {
			this.anInt980 = 0;
			@Pc(10) int local10 = (aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 >> 7) + this.anInt945;
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 >> 7) + this.anInt946;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt980 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt980 = 1;
			}
			if (this.anInt980 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt980 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("40763, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method685() {
		try {
			if (this.anInt928 == 2) {
				for (@Pc(19) Class1_Sub2 local19 = (Class1_Sub2) this.aClass6_11.method97(); local19 != null; local19 = (Class1_Sub2) this.aClass6_11.method99(569)) {
					if (local19.anInt227 > 0) {
						local19.anInt227--;
					}
					if (local19.anInt227 != 0) {
						if (local19.anInt231 > 0) {
							local19.anInt231--;
						}
						if (local19.anInt231 == 0 && local19.anInt225 >= 1 && local19.anInt226 >= 1 && local19.anInt225 <= 102 && local19.anInt226 <= 102 && (local19.anInt228 < 0 || Class29.method429(local19.anInt230, local19.anInt228))) {
							this.method598(local19.anInt223, local19.anInt228, local19.anInt224, local19.anInt225, (byte) 3, local19.anInt230, local19.anInt229, local19.anInt226);
							local19.anInt231 = -1;
							if (local19.anInt228 == local19.anInt232 && local19.anInt232 == -1) {
								local19.method501();
							} else if (local19.anInt228 == local19.anInt232 && local19.anInt229 == local19.anInt233 && local19.anInt230 == local19.anInt234) {
								local19.method501();
							}
						}
					} else if (local19.anInt232 < 0 || Class29.method429(local19.anInt234, local19.anInt232)) {
						this.method598(local19.anInt223, local19.anInt232, local19.anInt224, local19.anInt225, (byte) 3, local19.anInt234, local19.anInt233, local19.anInt226);
						local19.method501();
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("31213, " + true + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg0;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray126[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray127[local5];
				local37 = local27 * 0 - arg0 * local23 >> 16;
				local17 = local23 * 0 + arg0 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray126[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray127[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt1059 = arg2 - local13;
			this.anInt1060 = arg3 - local15;
			this.anInt1061 = arg4 - local17;
			this.anInt1062 = arg5;
			this.anInt1063 = arg1;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("36009, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass9_1.method221(arg1, arg2, arg3);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass9_1.method225(arg1, arg2, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg0;
				if (local8 > 0) {
					local30 = arg4;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray33;
				local52 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class44 local61 = Class44.method519(local58);
				if (local61.anInt766 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub4 local71 = this.aClass1_Sub1_Sub2_Sub4Array4[local61.anInt766];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt773 * 4 - local71.anInt561) / 2;
						@Pc(93) int local93 = (local61.anInt777 * 4 - local71.anInt562) / 2;
						local71.method363(arg2 * 4 + local83 + 48, (104 - arg3 - local61.anInt777) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass9_1.method223(arg1, arg2, arg3);
			if (local8 != 0) {
				local18 = this.aClass9_1.method225(arg1, arg2, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(450) Class44 local450 = Class44.method519(local30);
				@Pc(482) int local482;
				if (local450.anInt766 != -1) {
					@Pc(460) Class1_Sub1_Sub2_Sub4 local460 = this.aClass1_Sub1_Sub2_Sub4Array4[local450.anInt766];
					if (local460 != null) {
						local58 = (local450.anInt773 * 4 - local460.anInt561) / 2;
						local482 = (local450.anInt777 * 4 - local460.anInt562) / 2;
						local460.method363(arg2 * 4 + local58 + 48, (104 - arg3 - local450.anInt777) * 4 + 48 + local482);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(519) int[] local519 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray33;
					local482 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local519[local482 + 1536] = local52;
						local519[local482 + 1024 + 1] = local52;
						local519[local482 + 512 + 2] = local52;
						local519[local482 + 3] = local52;
					} else {
						local519[local482] = local52;
						local519[local482 + 512 + 1] = local52;
						local519[local482 + 1024 + 2] = local52;
						local519[local482 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass9_1.method224(arg1, arg2, arg3);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(614) Class44 local614 = Class44.method519(local18);
				if (local614.anInt766 != -1) {
					@Pc(624) Class1_Sub1_Sub2_Sub4 local624 = this.aClass1_Sub1_Sub2_Sub4Array4[local614.anInt766];
					if (local624 != null) {
						local30 = (local614.anInt773 * 4 - local624.anInt561) / 2;
						@Pc(646) int local646 = (local614.anInt777 * 4 - local624.anInt562) / 2;
						local624.method363(arg2 * 4 + local30 + 48, (104 - arg3 - local614.anInt777) * 4 + 48 + local646);
						return;
					}
				}
			}
		} catch (@Pc(670) RuntimeException local670) {
			signlink.reporterror("14378, " + arg0 + ", " + 419 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local670.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZZ)V")
	private void method689(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aBoolean216 &= true;
			signlink.anInt1102 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("71200, " + arg0 + ", " + arg1 + ", " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!VTUPBFSN;)V")
	private void method690(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt725;
			this.anInt991 += 0;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local66 = this.anInt951;
					if (this.anInt952 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString13 = "";
						arg0.anInt723 = 0;
					} else {
						if (this.anIntArray213[local4] == 0) {
							arg0.aString13 = "@red@Offline";
						} else if (this.anIntArray213[local4] < 200) {
							if (this.anIntArray213[local4] == anInt886) {
								arg0.aString13 = "@gre@World" + (this.anIntArray213[local4] - 9);
							} else {
								arg0.aString13 = "@yel@World" + (this.anIntArray213[local4] - 9);
							}
						} else if (this.anIntArray213[local4] == anInt886) {
							arg0.aString13 = "@gre@Classic" + (this.anIntArray213[local4] - 219);
						} else {
							arg0.aString13 = "@yel@Classic" + (this.anIntArray213[local4] - 219);
						}
						arg0.anInt723 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt951;
					if (this.anInt952 != 2) {
						local66 = 0;
					}
					arg0.anInt724 = local66 * 15 + 20;
					if (arg0.anInt724 <= arg0.anInt727) {
						arg0.anInt724 = arg0.anInt727 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt952 == 0) {
						arg0.aString13 = "Loading ignore list";
						arg0.anInt723 = 0;
					} else if (local4 == 1 && this.anInt952 == 0) {
						arg0.aString13 = "Please wait...";
						arg0.anInt723 = 0;
					} else {
						local66 = this.anInt893;
						if (this.anInt952 == 0) {
							local66 = 0;
						}
						if (local4 >= local66) {
							arg0.aString13 = "";
							arg0.anInt723 = 0;
						} else {
							arg0.aString13 = Class20.method323(this.aBoolean201, Class20.method320(this.aLongArray4[local4]));
							arg0.anInt723 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt724 = this.anInt893 * 15 + 20;
					if (arg0.anInt724 <= arg0.anInt727) {
						arg0.anInt724 = arg0.anInt727 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt753 = 150;
					arg0.anInt754 = (int) (Math.sin((double) anInt1079 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean207) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(380) int local380 = this.anIntArray221[local66];
							if (local380 >= 0 && !Class49.aClass49Array1[local380].method560()) {
								return;
							}
						}
						this.aBoolean207 = false;
						@Pc(399) Class1_Sub1_Sub1_Sub5[] local399 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(401) int local401 = 0;
						for (@Pc(403) int local403 = 0; local403 < 7; local403++) {
							@Pc(410) int local410 = this.anIntArray221[local403];
							if (local410 >= 0) {
								local399[local401++] = Class49.aClass49Array1[local410].method561();
							}
						}
						@Pc(432) Class1_Sub1_Sub1_Sub5 local432 = new Class1_Sub1_Sub1_Sub5(local401, (byte) 112, local399);
						for (@Pc(434) int local434 = 0; local434 < 5; local434++) {
							if (this.anIntArray222[local434] != 0) {
								local432.method393(anIntArrayArray22[local434][0], anIntArrayArray22[local434][this.anIntArray222[local434]]);
								if (local434 == 1) {
									local432.method393(anIntArray276[0], anIntArray276[this.anIntArray222[local434]]);
								}
							}
						}
						local432.method386(this.anInt1050);
						local432.method387(Class7.aClass7Array1[aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt461].anIntArray27[0]);
						local432.method396(64, 850, -30, -50, -30, true);
						arg0.anInt750 = 5;
						arg0.anInt751 = 0;
						Class43.method511(local432);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_11 == null) {
						this.aClass1_Sub1_Sub2_Sub2_11 = arg0.aClass1_Sub1_Sub2_Sub2_1;
						this.aClass1_Sub1_Sub2_Sub2_12 = arg0.aClass1_Sub1_Sub2_Sub2_2;
					}
					if (this.aBoolean226) {
						arg0.aClass1_Sub1_Sub2_Sub2_1 = this.aClass1_Sub1_Sub2_Sub2_12;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_1 = this.aClass1_Sub1_Sub2_Sub2_11;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_11 == null) {
						this.aClass1_Sub1_Sub2_Sub2_11 = arg0.aClass1_Sub1_Sub2_Sub2_1;
						this.aClass1_Sub1_Sub2_Sub2_12 = arg0.aClass1_Sub1_Sub2_Sub2_2;
					}
					if (this.aBoolean226) {
						arg0.aClass1_Sub1_Sub2_Sub2_1 = this.aClass1_Sub1_Sub2_Sub2_11;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_1 = this.aClass1_Sub1_Sub2_Sub2_12;
					}
				} else if (local4 == 600) {
					arg0.aString13 = this.aString22;
					if (anInt1079 % 20 < 10) {
						arg0.aString13 = arg0.aString13 + "|";
					} else {
						arg0.aString13 = arg0.aString13 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt1049 < 1) {
							arg0.aString13 = "";
						} else if (this.aBoolean227) {
							arg0.anInt732 = 16711680;
							arg0.aString13 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt732 = 16777215;
							arg0.aString13 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(640) String local640;
					if (local4 == 660) {
						local66 = this.anInt1055 - this.anInt924;
						if (local66 <= 0) {
							local640 = "earlier today";
						} else if (local66 == 1) {
							local640 = "yesterday";
						} else {
							local640 = local66 + " days ago";
						}
						arg0.aString13 = "You last logged in @red@" + local640 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt859 == 0) {
							arg0.aString13 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt859 <= this.anInt1055) {
							arg0.aString13 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method691(this.anInt859);
						} else {
							local66 = this.anInt1055 + 14 - this.anInt859;
							if (local66 <= 0) {
								local640 = "Earlier today";
							} else if (local66 == 1) {
								local640 = "Yesterday";
							} else {
								local640 = local66 + " days ago";
							}
							arg0.aString13 = local640 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method691(this.anInt859) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(758) String local758;
						if (this.anInt921 == 0) {
							local758 = "@yel@0 unread messages";
						} else if (this.anInt921 == 1) {
							local758 = "@gre@1 unread message";
						} else {
							local758 = "@gre@" + this.anInt921 + " unread messages";
						}
						arg0.aString13 = "You have " + local758 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt1073 > 0 && this.anInt1073 <= this.anInt1055 + 10) {
							arg0.aString13 = "Last password change:\\n@gre@" + this.method691(this.anInt1073);
						} else {
							arg0.aString13 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt1036 > 2 && !aBoolean190) {
							arg0.aString13 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt1036 > 2) {
							arg0.aString13 = "\\n\\nYou have @gre@" + this.anInt1036 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt1036 > 0) {
							arg0.aString13 = "You have @gre@" + this.anInt1036 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString13 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt1036 > 2 && !aBoolean190) {
							arg0.aString13 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt1036 > 0) {
							arg0.aString13 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString13 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt859 > this.anInt1055) {
							arg0.aString13 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString13 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt952 == 0) {
				arg0.aString13 = "Loading friend list";
				arg0.anInt723 = 0;
			} else if (local4 == 1 && this.anInt952 == 1) {
				arg0.aString13 = "Connecting to friendserver";
				arg0.anInt723 = 0;
			} else if (local4 == 2 && this.anInt952 != 2) {
				arg0.aString13 = "Please wait...";
				arg0.anInt723 = 0;
			} else {
				local66 = this.anInt951;
				if (this.anInt952 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString13 = "";
					arg0.anInt723 = 0;
				} else {
					arg0.aString13 = this.aStringArray14[local4];
					arg0.anInt723 = 1;
				}
			}
		} catch (@Pc(915) RuntimeException local915) {
			signlink.reporterror("63142, " + 0 + ", " + arg0 + ", " + local915.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private String method691(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt1055 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			if (this.anInt949 > 6 || this.anInt949 < 6) {
				throw new NullPointerException();
			}
			@Pc(38) int local38 = local16.get(5);
			@Pc(42) int local42 = local16.get(2);
			@Pc(46) int local46 = local16.get(1);
			@Pc(97) String[] local97 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local38 + "-" + local97[local42] + "-" + local46;
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("71398, " + arg0 + ", " + 6 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method692(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray33;
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
						this.aClass9_1.method230(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass9_1.method230(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_13.method124();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method687(local34, arg0, local146, local142, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method687(local34, arg0 + 1, local146, local142, local36);
					}
				}
			}
			if (this.aClass48_23 != null) {
				this.aClass48_23.method555();
				Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
			}
			this.anInt1024 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass9_1.method224(this.anInt918, local146, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class44.method519(local230).anInt765;
						if (local242 >= 0) {
							@Pc(246) int local246 = local146;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass50Array1[this.anInt918].anIntArrayArray21;
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
							this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt1024] = this.aClass1_Sub1_Sub2_Sub2Array9[local242];
							this.anIntArray263[this.anInt1024] = local246;
							this.anIntArray264[this.anInt1024] = local248;
							this.anInt1024++;
						}
					}
				}
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("41340, " + 467 + ", " + arg0 + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!EYMNCFMK;)V")
	private void method693(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt907; local6++) {
				@Pc(13) int local13 = this.anIntArray224[local6];
				@Pc(18) Class1_Sub1_Sub1_Sub2_Sub2 local18 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local13];
				@Pc(21) int local21 = arg1.method155();
				@Pc(28) int local28;
				@Pc(32) int local32;
				if ((local21 & 0x40) != 0) {
					local28 = arg1.method155();
					local32 = arg1.method174();
					local18.method301(anInt1079, local32, local28);
					local18.anInt436 = anInt1079 + 300;
					local18.anInt437 = arg1.method176();
					local18.anInt438 = arg1.method155();
				}
				if ((local21 & 0x20) != 0) {
					local18.aClass31_2 = Class31.method479(arg1.method185());
					local18.anInt448 = local18.aClass31_2.aByte18;
					local18.anInt460 = local18.aClass31_2.anInt655;
					local18.anInt432 = local18.aClass31_2.anInt651;
					local18.anInt433 = local18.aClass31_2.anInt656;
					local18.anInt434 = local18.aClass31_2.anInt657;
					local18.anInt435 = local18.aClass31_2.anInt659;
					local18.anInt461 = local18.aClass31_2.anInt653;
				}
				if ((local21 & 0x2) != 0) {
					local18.anInt466 = arg1.method185();
					local18.anInt467 = arg1.method185();
				}
				if ((local21 & 0x80) != 0) {
					local18.anInt422 = arg1.method184();
					local28 = arg1.method191(360);
					local18.anInt426 = local28 >> 16;
					local18.anInt425 = anInt1079 + (local28 & 0xFFFF);
					local18.anInt423 = 0;
					local18.anInt424 = 0;
					if (local18.anInt425 > anInt1079) {
						local18.anInt423 = -1;
					}
					if (local18.anInt422 == 65535) {
						local18.anInt422 = -1;
					}
				}
				if ((local21 & 0x4) != 0) {
					local18.aString6 = arg1.method162();
					local18.anInt470 = 100;
				}
				if ((local21 & 0x10) != 0) {
					local18.anInt459 = arg1.method183();
					if (local18.anInt459 == 65535) {
						local18.anInt459 = -1;
					}
				}
				if ((local21 & 0x1) != 0) {
					local28 = arg1.method176();
					local32 = arg1.method176();
					local18.method301(anInt1079, local32, local28);
					local18.anInt436 = anInt1079 + 300;
					local18.anInt437 = arg1.method174();
					local18.anInt438 = arg1.method174();
				}
				if ((local21 & 0x8) != 0) {
					local28 = arg1.method185();
					if (local28 == 65535) {
						local28 = -1;
					}
					local32 = arg1.method175();
					if (local28 == local18.anInt451 && local28 != -1) {
						@Pc(245) int local245 = Class7.aClass7Array1[local28].anInt245;
						if (local245 == 1) {
							local18.anInt452 = 0;
							local18.anInt453 = 0;
							local18.anInt454 = local32;
							local18.anInt455 = 0;
						}
						if (local245 == 2) {
							local18.anInt455 = 0;
						}
					} else if (local28 == -1 || local18.anInt451 == -1 || Class7.aClass7Array1[local28].anInt239 >= Class7.aClass7Array1[local18.anInt451].anInt239) {
						local18.anInt451 = local28;
						local18.anInt452 = 0;
						local18.anInt453 = 0;
						local18.anInt454 = local32;
						local18.anInt455 = 0;
						local18.anInt458 = local18.anInt427;
					}
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("58671, " + arg0 + ", " + -391 + ", " + arg1 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			if (!this.aBoolean205 && !this.aBoolean222 && !this.aBoolean199) {
				anInt1079++;
				if (this.aBoolean216) {
					this.method612();
				} else {
					this.method712();
				}
				this.method670();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("98898, " + 9800 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
	private boolean method695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg11;
			@Pc(39) int local39 = arg1;
			this.anIntArrayArray25[arg11][arg1] = 99;
			this.anIntArrayArray24[arg11][arg1] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray253[0] = arg11;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray254[0] = arg1;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray253.length;
			@Pc(81) int[][] local81 = this.aClass50Array1[this.anInt918].anIntArrayArray21;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray253[local57];
				local39 = this.anIntArray254[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg9 && local39 == arg5) {
					local70 = true;
					break;
				}
				if (arg6 != 0) {
					if ((arg6 < 5 || arg6 == 10) && this.aClass50Array1[this.anInt918].method573(arg6 - 1, arg4, arg9, arg5, local11, local39)) {
						local70 = true;
						break;
					}
					if (arg6 < 10 && this.aClass50Array1[this.anInt918].method574(arg9, arg5, arg6 - 1, local11, local39, arg4)) {
						local70 = true;
						break;
					}
				}
				if (arg0 != 0 && arg3 != 0 && this.aClass50Array1[this.anInt918].method575(arg0, local39, arg3, local11, arg7, arg9, arg5)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray253[local66] = local11 - 1;
					this.anIntArray254[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray253[local66] = local11 + 1;
					this.anIntArray254[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray253[local66] = local11;
					this.anIntArray254[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray253[local66] = local11;
					this.anIntArray254[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray253[local66] = local11 - 1;
					this.anIntArray254[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray253[local66] = local11 + 1;
					this.anIntArray254[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray253[local66] = local11 - 1;
					this.anIntArray254[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray253[local66] = local11 + 1;
					this.anIntArray254[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt937 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (!arg10) {
					return false;
				}
				local192 = 1000;
				local808 = 100;
				for (local814 = arg9 - 10; local814 <= arg9 + 10; local814++) {
					for (local820 = arg5 - 10; local820 <= arg5 + 10; local820++) {
						if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray24[local814][local820] < 100) {
							@Pc(842) int local842 = 0;
							if (local814 < arg9) {
								local842 = arg9 - local814;
							} else if (local814 > arg9 + arg0 - 1) {
								local842 = local814 + 1 - arg9 - arg0;
							}
							@Pc(868) int local868 = 0;
							if (local820 < arg5) {
								local868 = arg5 - local820;
							} else if (local820 > arg5 + arg3 - 1) {
								local868 = local820 + 1 - arg5 - arg3;
							}
							@Pc(900) int local900 = local842 * local842 + local868 * local868;
							if (local900 < local192 || local900 == local192 && this.anIntArrayArray24[local814][local820] < local808) {
								local192 = local900;
								local808 = this.anIntArrayArray24[local814][local820];
								local11 = local814;
								local39 = local820;
							}
						}
					}
				}
				if (local192 == 1000) {
					return false;
				}
				if (local11 == arg11 && local39 == arg1) {
					return false;
				}
				this.anInt937 = 1;
			}
			@Pc(961) byte local961 = 0;
			this.anIntArray253[0] = local11;
			@Pc(974) int local974;
			if (arg8 < 2 || arg8 > 2) {
				for (local974 = 1; local974 > 0; local974++) {
				}
			}
			local57 = local961 + 1;
			this.anIntArray254[0] = local39;
			local192 = local808 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg11 || local39 != arg1) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray253[local57] = local11;
					this.anIntArray254[local57++] = local39;
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
				local974 = this.anIntArray253[local57];
				local814 = this.anIntArray254[local57];
				if (arg2 == 0) {
					this.aClass1_Sub1_Sub3_7.method144(185);
					this.aClass1_Sub1_Sub3_7.method145(local74 + local74 + 3);
				}
				if (arg2 == 1) {
					this.aClass1_Sub1_Sub3_7.method144(139);
					this.aClass1_Sub1_Sub3_7.method145(local74 + local74 + 3 + 14);
				}
				if (arg2 == 2) {
					this.aClass1_Sub1_Sub3_7.method144(134);
					this.aClass1_Sub1_Sub3_7.method145(local74 + local74 + 3);
				}
				this.aClass1_Sub1_Sub3_7.method173(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass1_Sub1_Sub3_7.method180(local974 + this.anInt945);
				this.aClass1_Sub1_Sub3_7.method180(local814 + this.anInt946);
				this.anInt1052 = this.anIntArray253[0];
				this.anInt1053 = this.anIntArray254[0];
				for (local820 = 1; local820 < local74; local820++) {
					local57--;
					this.aClass1_Sub1_Sub3_7.method171(this.anIntArray253[local57] - local974);
					this.aClass1_Sub1_Sub3_7.method172(this.anIntArray254[local57] - local814, this.aBoolean211);
				}
				return true;
			} else if (arg2 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1199) RuntimeException local1199) {
			signlink.reporterror("87372, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1199.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method696() {
		try {
			if (super.anInt853 == 1) {
				if (super.anInt854 >= 6 && super.anInt854 <= 106 && super.anInt855 >= 467 && super.anInt855 <= 499) {
					this.anInt888 = (this.anInt888 + 1) % 4;
					this.aBoolean206 = true;
					this.aBoolean194 = true;
					this.aClass1_Sub1_Sub3_7.method144(225);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt888);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt1074);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt961);
				}
				if (super.anInt854 >= 135 && super.anInt854 <= 235 && super.anInt855 >= 467 && super.anInt855 <= 499) {
					this.anInt1074 = (this.anInt1074 + 1) % 3;
					this.aBoolean206 = true;
					this.aBoolean194 = true;
					this.aClass1_Sub1_Sub3_7.method144(225);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt888);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt1074);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt961);
				}
				if (super.anInt854 >= 273 && super.anInt854 <= 373 && super.anInt855 >= 467 && super.anInt855 <= 499) {
					this.anInt961 = (this.anInt961 + 1) % 3;
					this.aBoolean206 = true;
					this.aBoolean194 = true;
					this.aClass1_Sub1_Sub3_7.method144(225);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt888);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt1074);
					this.aClass1_Sub1_Sub3_7.method145(this.anInt961);
				}
				if (super.anInt854 >= 412 && super.anInt854 <= 512 && super.anInt855 >= 467 && super.anInt855 <= 499) {
					if (this.anInt998 == -1) {
						this.method657();
						this.aString22 = "";
						this.aBoolean227 = false;
						this.anInt1072 = this.anInt998 = Class43.anInt731;
					} else {
						this.method649(0, "", "Please close the interface you have open before using 'report abuse'");
					}
				}
				anInt1078++;
				if (anInt1078 > 195) {
					anInt1078 = 0;
					this.aClass1_Sub1_Sub3_7.method144(156);
					this.aClass1_Sub1_Sub3_7.method146(51285);
					return;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("14687, " + -64 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			if (arg0 != this.anInt1047) {
				this.aClass6ArrayArrayArray1 = null;
			}
			return ((arg1 & 0xFF00FF) * local3 + (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg3 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("13519, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method698() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1040; local3++) {
				if (this.anIntArray262[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray219[local3] != this.anInt1069 || this.anIntArray270[local3] != this.anInt870) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class24.method366(this.anIntArray219[local3], this.anIntArray270[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt301 / 22) > this.aLong31 + (long) (this.anInt908 / 22)) {
								this.anInt908 = local45.anInt301;
								this.aLong31 = System.currentTimeMillis();
								if (this.method720(local45.aByteArray2, local45.anInt301)) {
									this.anInt1069 = this.anIntArray219[local3];
									this.anInt870 = this.anIntArray270[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method725()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
						if (signlink.reporterror) {
							this.aClass1_Sub1_Sub3_7.method144(3);
							this.aClass1_Sub1_Sub3_7.method146(this.anIntArray219[local3] & 0x7FFF);
						} else {
							this.aClass1_Sub1_Sub3_7.method144(3);
							this.aClass1_Sub1_Sub3_7.method146(-1);
						}
					}
					if (local12 && this.anIntArray262[local3] != -5) {
						this.anIntArray262[local3] = -5;
					} else {
						this.anInt1040--;
						for (@Pc(138) int local138 = local3; local138 < this.anInt1040; local138++) {
							this.anIntArray219[local138] = this.anIntArray219[local138 + 1];
							this.anIntArray270[local138] = this.anIntArray270[local138 + 1];
							this.anIntArray262[local138] = this.anIntArray262[local138 + 1];
						}
						local3--;
					}
				} else {
					@Pc(190) int local190 = this.anIntArray262[local3]--;
				}
			}
			this.aBoolean216 &= true;
			if (this.anInt983 > 0) {
				this.anInt983 -= 20;
				if (this.anInt983 < 0) {
					this.anInt983 = 0;
				}
				if (this.anInt983 == 0 && this.aBoolean212 && !aBoolean191) {
					this.anInt964 = this.anInt941;
					this.aBoolean203 = true;
					this.aClass12_Sub1_1.method549(2, this.anInt964);
					return;
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("48352, " + true + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method699() {
		try {
			@Pc(8) int local8;
			if (this.anInt880 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt880 > 768) {
						this.anIntArray228[local8] = this.method697(this.anInt1058, this.anIntArray229[local8], 1024 - this.anInt880, this.anIntArray230[local8]);
					} else if (this.anInt880 > 256) {
						this.anIntArray228[local8] = this.anIntArray230[local8];
					} else {
						this.anIntArray228[local8] = this.method697(this.anInt1058, this.anIntArray230[local8], 256 - this.anInt880, this.anIntArray229[local8]);
					}
				}
			} else if (this.anInt881 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt881 > 768) {
						this.anIntArray228[local8] = this.method697(this.anInt1058, this.anIntArray229[local8], 1024 - this.anInt881, this.anIntArray231[local8]);
					} else if (this.anInt881 > 256) {
						this.anIntArray228[local8] = this.anIntArray231[local8];
					} else {
						this.anIntArray228[local8] = this.method697(this.anInt1058, this.anIntArray231[local8], 256 - this.anInt881, this.anIntArray229[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray228[local8] = this.anIntArray229[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass48_15.anIntArray205[local8] = this.aClass1_Sub1_Sub2_Sub2_14.anIntArray33[local8];
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
				local202 = this.anIntArray273[local189] * (256 - local189) / 256;
				local206 = local202 + 22;
				if (local206 < 0) {
					local206 = 0;
				}
				local185 += local206;
				for (local216 = local206; local216 < 128; local216++) {
					local224 = this.anIntArray257[local185++];
					if (local224 == 0) {
						local187++;
					} else {
						local228 = local224;
						local232 = 256 - local224;
						local224 = this.anIntArray228[local224];
						local243 = this.aClass48_15.anIntArray205[local187];
						this.aClass48_15.anIntArray205[local187++] = ((local224 & 0xFF00FF) * local228 + (local243 & 0xFF00FF) * local232 & 0xFF00FF00) + ((local224 & 0xFF00) * local228 + (local243 & 0xFF00) * local232 & 0xFF0000) >> 8;
					}
				}
				local187 += local206;
			}
			this.aClass48_15.method556(super.aGraphics2, 0, 904, 0);
			for (local202 = 0; local202 < 33920; local202++) {
				this.aClass48_16.anIntArray205[local202] = this.aClass1_Sub1_Sub2_Sub2_15.anIntArray33[local202];
			}
			local185 = 0;
			local187 = 1176;
			for (local206 = 1; local206 < 255; local206++) {
				local216 = this.anIntArray273[local206] * (256 - local206) / 256;
				local224 = 103 - local216;
				local187 += local216;
				for (local228 = 0; local228 < local224; local228++) {
					local232 = this.anIntArray257[local185++];
					if (local232 == 0) {
						local187++;
					} else {
						local243 = local232;
						@Pc(366) int local366 = 256 - local232;
						local232 = this.anIntArray228[local232];
						@Pc(377) int local377 = this.aClass48_16.anIntArray205[local187];
						this.aClass48_16.anIntArray205[local187++] = ((local232 & 0xFF00FF) * local243 + (local377 & 0xFF00FF) * local366 & 0xFF00FF00) + ((local232 & 0xFF00) * local243 + (local377 & 0xFF00) * local366 & 0xFF0000) >> 8;
					}
				}
				local185 += 128 - local224;
				local187 += 128 - local224 - local216;
			}
			this.aClass48_16.method556(super.aGraphics2, 0, 904, 637);
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("10266, " + 32552 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method700() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt906; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt905;
				} else {
					local11 = this.anIntArray223[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub2_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local11];
				if (local23 != null) {
					this.method602(1, local23, 820);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("62886, " + -866 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method701() {
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
				this.anInt1080 = -1;
				this.aClass6_10.method101();
				this.aClass6_12.method101();
				Class1_Sub1_Sub2_Sub1.method48(this.anInt1068);
				this.method674();
				this.aClass9_1.method195();
				System.gc();
				for (local23 = 0; local23 < 4; local23++) {
					this.aClass50Array1[local23].method564();
				}
				for (local36 = 0; local36 < 4; local36++) {
					for (local40 = 0; local40 < 104; local40++) {
						for (local44 = 0; local44 < 104; local44++) {
							this.aByteArrayArrayArray8[local36][local40][local44] = 0;
						}
					}
				}
				@Pc(78) Class29 local78 = new Class29(this.aByteArrayArrayArray8, 104, 136, 104, this.anIntArrayArrayArray8);
				local44 = this.aByteArrayArray6.length;
				this.aClass1_Sub1_Sub3_7.method144(110);
				@Pc(239) int local239;
				@Pc(227) int local227;
				if (!this.aBoolean221) {
					@Pc(123) byte[] local123;
					for (local92 = 0; local92 < local44; local92++) {
						local106 = (this.anIntArray249[local92] >> 8) * 64 - this.anInt945;
						local118 = (this.anIntArray249[local92] & 0xFF) * 64 - this.anInt946;
						local123 = this.aByteArrayArray6[local92];
						if (local123 != null) {
							local78.method433(this.aClass50Array1, local106, local118, (this.anInt1045 - 6) * 8, (this.anInt1044 - 6) * 8, local123, (byte) 9);
						}
					}
					for (local106 = 0; local106 < local44; local106++) {
						local118 = (this.anIntArray249[local106] >> 8) * 64 - this.anInt945;
						local177 = (this.anIntArray249[local106] & 0xFF) * 64 - this.anInt946;
						@Pc(182) byte[] local182 = this.aByteArrayArray6[local106];
						if (local182 == null && this.anInt1045 < 800) {
							local78.method417(local118, local177, 64, 64);
						}
					}
					this.aClass1_Sub1_Sub3_7.method144(110);
					for (local118 = 0; local118 < local44; local118++) {
						local123 = this.aByteArrayArray5[local118];
						if (local123 != null) {
							local227 = (this.anIntArray249[local118] >> 8) * 64 - this.anInt945;
							local239 = (this.anIntArray249[local118] & 0xFF) * 64 - this.anInt946;
							local78.method415(local239, this.aClass9_1, local123, this.aClass50Array1, local227);
						}
					}
				}
				if (this.aBoolean221) {
					local92 = 0;
					label254: while (true) {
						@Pc(294) int local294;
						@Pc(300) int local300;
						@Pc(306) int local306;
						@Pc(316) int local316;
						@Pc(318) int local318;
						if (local92 >= 4) {
							for (local106 = 0; local106 < 13; local106++) {
								for (local118 = 0; local118 < 13; local118++) {
									local177 = this.anIntArrayArrayArray7[0][local106][local118];
									if (local177 == -1) {
										local78.method417(local106 * 8, local118 * 8, 8, 8);
									}
								}
							}
							this.aClass1_Sub1_Sub3_7.method144(110);
							local118 = 0;
							while (true) {
								if (local118 >= 4) {
									break label254;
								}
								for (local177 = 0; local177 < 13; local177++) {
									for (local227 = 0; local227 < 13; local227++) {
										local239 = this.anIntArrayArrayArray7[local118][local177][local227];
										if (local239 != -1) {
											local294 = local239 >> 24 & 0x3;
											local300 = local239 >> 1 & 0x3;
											local306 = local239 >> 14 & 0x3FF;
											local316 = local239 >> 3 & 0x7FF;
											local318 = (local306 / 8 << 8) + local316 / 8;
											for (@Pc(497) int local497 = 0; local497 < this.anIntArray249.length; local497++) {
												if (this.anIntArray249[local497] == local318 && this.aByteArrayArray5[local497] != null) {
													local78.method431(local294, local227 * 8, this.aByteArrayArray5[local497], local118, this.aClass9_1, (local306 & 0x7) * 8, local300, this.aClass50Array1, local177 * 8, (local316 & 0x7) * 8);
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
								@Pc(270) boolean local270 = false;
								local227 = this.anIntArrayArrayArray7[local92][local106][local118];
								if (local227 != -1) {
									local239 = local227 >> 24 & 0x3;
									local294 = local227 >> 1 & 0x3;
									local300 = local227 >> 14 & 0x3FF;
									local306 = local227 >> 3 & 0x7FF;
									local316 = (local300 / 8 << 8) + local306 / 8;
									for (local318 = 0; local318 < this.anIntArray249.length; local318++) {
										if (this.anIntArray249[local318] == local316 && this.aByteArrayArray6[local318] != null) {
											local78.method434(this.aClass50Array1, local118 * 8, local294, (local306 & 0x7) * 8, (local300 & 0x7) * 8, local239, local92, this.aByteArrayArray6[local318], local106 * 8);
											local270 = true;
											break;
										}
									}
								}
								if (!local270) {
									local78.method422(local118 * 8, local92, local106 * 8);
								}
							}
						}
						local92++;
					}
				}
				this.aClass1_Sub1_Sub3_7.method144(110);
				local78.method436(this.aClass9_1, this.aClass50Array1);
				if (this.aClass48_23 != null) {
					this.aClass48_23.method555();
					Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
				}
				this.aClass1_Sub1_Sub3_7.method144(110);
				local92 = Class29.anInt632;
				if (local92 > this.anInt918) {
					local92 = this.anInt918;
				}
				if (local92 < this.anInt918 - 1) {
					local92 = this.anInt918 - 1;
				}
				if (aBoolean191) {
					this.aClass9_1.method196(Class29.anInt632);
				} else {
					this.aClass9_1.method196(0);
				}
				for (local106 = 0; local106 < 104; local106++) {
					for (local118 = 0; local118 < 104; local118++) {
						this.method611(local106, local118);
					}
				}
				this.method706();
			} catch (@Pc(646) Exception local646) {
			}
			Class44.aClass41_7.method500();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub3_7.method144(136);
				this.aClass1_Sub1_Sub3_7.method149(1057001181);
			}
			if (aBoolean191 && signlink.aRandomAccessFile3 != null) {
				local23 = this.aClass12_Sub1_1.method532(0);
				for (local36 = 0; local36 < local23; local36++) {
					local40 = this.aClass12_Sub1_1.method542(local36);
					if ((local40 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method378(local36);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method49();
			this.aClass12_Sub1_1.method531(969);
			local23 = (this.anInt1044 - 6) / 8 - 1;
			local36 = (this.anInt1044 + 6) / 8 + 1;
			local40 = (this.anInt1045 - 6) / 8 - 1;
			local44 = (this.anInt1045 + 6) / 8 + 1;
			if (this.aBoolean195) {
				local23 = 49;
				local36 = 50;
				local40 = 49;
				local44 = 50;
			}
			for (local92 = local23; local92 <= local36; local92++) {
				for (local106 = local40; local106 <= local44; local106++) {
					if (local92 == local23 || local92 == local36 || local106 == local40 || local106 == local44) {
						local118 = this.aClass12_Sub1_1.method546(aByte27, local106, 0, local92);
						if (local118 != -1) {
							this.aClass12_Sub1_1.method538(local118, 3);
						}
						local177 = this.aClass12_Sub1_1.method546(aByte27, local106, 1, local92);
						if (local177 != -1) {
							this.aClass12_Sub1_1.method538(local177, 3);
						}
					}
				}
			}
		} catch (@Pc(817) RuntimeException local817) {
			signlink.reporterror("8983, " + -181 + ", " + local817.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method702(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt951; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt951--;
						this.aBoolean200 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt951; local34++) {
							this.aStringArray14[local34] = this.aStringArray14[local34 + 1];
							this.anIntArray213[local34] = this.anIntArray213[local34 + 1];
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass1_Sub1_Sub3_7.method144(67);
						this.aClass1_Sub1_Sub3_7.method151(arg0);
						return;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("67043, " + false + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)Z")
	private boolean method703(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.anInt992 = this.aClass1_Sub1_Sub3_8.method155();
			}
			if (this.aClass33_1 == null) {
				return false;
			}
			@Pc(444) String local444;
			@Pc(180) int local180;
			try {
				@Pc(17) int local17 = this.aClass33_1.method485();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt992 == -1) {
					this.aClass33_1.method486(this.aClass1_Sub1_Sub3_8.aByteArray2, 0, 1);
					this.anInt992 = this.aClass1_Sub1_Sub3_8.aByteArray2[0] & 0xFF;
					if (this.aClass39_2 != null) {
						this.anInt992 = this.anInt992 - this.aClass39_2.method491() & 0xFF;
					}
					this.anInt991 = Class3.anIntArray14[this.anInt992];
					local17--;
				}
				if (this.anInt991 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass33_1.method486(this.aClass1_Sub1_Sub3_8.aByteArray2, 0, 1);
					this.anInt991 = this.aClass1_Sub1_Sub3_8.aByteArray2[0] & 0xFF;
					local17--;
				}
				if (this.anInt991 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass33_1.method486(this.aClass1_Sub1_Sub3_8.aByteArray2, 0, 2);
					this.aClass1_Sub1_Sub3_8.anInt301 = 0;
					this.anInt991 = this.aClass1_Sub1_Sub3_8.method157();
					local17 -= 2;
				}
				if (local17 < this.anInt991) {
					return false;
				}
				this.aClass1_Sub1_Sub3_8.anInt301 = 0;
				this.aClass33_1.method486(this.aClass1_Sub1_Sub3_8.aByteArray2, 0, this.anInt991);
				this.anInt993 = 0;
				this.anInt885 = this.anInt884;
				this.anInt884 = this.anInt883;
				this.anInt883 = this.anInt992;
				if (this.anInt992 == 30) {
					this.anInt938 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt992 = -1;
					return true;
				}
				@Pc(184) int local184;
				@Pc(175) int local175;
				if (this.anInt992 == 247) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local180 = this.aClass1_Sub1_Sub3_8.method184();
					local184 = this.aClass1_Sub1_Sub3_8.method157();
					Class43.method515(local175).anInt748 = (local184 << 16) + local180;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 205) {
					this.anInt888 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt1074 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt961 = this.aClass1_Sub1_Sub3_8.method155();
					this.aBoolean206 = true;
					this.aBoolean194 = true;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 169) {
					this.anInt903 = this.aClass1_Sub1_Sub3_8.method174();
					this.anInt902 = this.aClass1_Sub1_Sub3_8.method174();
					for (local175 = this.anInt902; local175 < this.anInt902 + 8; local175++) {
						for (local180 = this.anInt903; local180 < this.anInt903 + 8; local180++) {
							if (this.aClass6ArrayArrayArray1[this.anInt918][local175][local180] != null) {
								this.aClass6ArrayArrayArray1[this.anInt918][local175][local180] = null;
								this.method611(local175, local180);
							}
						}
					}
					for (@Pc(296) Class1_Sub2 local296 = (Class1_Sub2) this.aClass6_11.method97(); local296 != null; local296 = (Class1_Sub2) this.aClass6_11.method99(569)) {
						if (local296.anInt225 >= this.anInt902 && local296.anInt225 < this.anInt902 + 8 && local296.anInt226 >= this.anInt903 && local296.anInt226 < this.anInt903 + 8 && local296.anInt223 == this.anInt918) {
							local296.anInt227 = 0;
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 42) {
					local175 = this.aClass1_Sub1_Sub3_8.method183();
					this.method610(local175);
					if (this.anInt954 != -1) {
						this.method716(this.anInt954);
						this.anInt954 = -1;
						this.aBoolean200 = true;
						this.aBoolean192 = true;
					}
					if (this.anInt1085 != -1) {
						this.method716(this.anInt1085);
						this.anInt1085 = -1;
						this.aBoolean184 = true;
					}
					if (this.anInt882 != -1) {
						this.method716(this.anInt882);
						this.anInt882 = -1;
					}
					if (this.anInt998 != -1) {
						this.method716(this.anInt998);
						this.anInt998 = -1;
					}
					if (this.anInt911 != local175) {
						this.method716(this.anInt911);
						this.anInt911 = local175;
					}
					this.aBoolean224 = false;
					this.aBoolean194 = true;
					this.anInt992 = -1;
					return true;
				}
				@Pc(462) int local462;
				@Pc(455) String local455;
				@Pc(460) boolean local460;
				@Pc(595) String local595;
				if (this.anInt992 == 174) {
					local444 = this.aClass1_Sub1_Sub3_8.method162();
					@Pc(458) long local458;
					if (local444.endsWith(":tradereq:")) {
						local455 = local444.substring(0, local444.indexOf(":"));
						local458 = Class20.method319(local455);
						local460 = false;
						for (local462 = 0; local462 < this.anInt893; local462++) {
							if (this.aLongArray4[local462] == local458) {
								local460 = true;
								break;
							}
						}
						if (!local460 && this.anInt980 == 0) {
							this.method649(4, local455, "wishes to trade with you.");
						}
					} else if (local444.endsWith(":duelreq:")) {
						local455 = local444.substring(0, local444.indexOf(":"));
						local458 = Class20.method319(local455);
						local460 = false;
						for (local462 = 0; local462 < this.anInt893; local462++) {
							if (this.aLongArray4[local462] == local458) {
								local460 = true;
								break;
							}
						}
						if (!local460 && this.anInt980 == 0) {
							this.method649(8, local455, "wishes to duel with you.");
						}
					} else if (local444.endsWith(":chalreq:")) {
						local455 = local444.substring(0, local444.indexOf(":"));
						local458 = Class20.method319(local455);
						local460 = false;
						for (local462 = 0; local462 < this.anInt893; local462++) {
							if (this.aLongArray4[local462] == local458) {
								local460 = true;
								break;
							}
						}
						if (!local460 && this.anInt980 == 0) {
							local595 = local444.substring(local444.indexOf(":") + 1, local444.length() - 9);
							this.method649(8, local455, local595);
						}
					} else {
						this.method649(0, "", local444);
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 9) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					Class43.method515(local175).anInt750 = 3;
					if (aClass1_Sub1_Sub1_Sub2_Sub1_1.aClass31_1 == null) {
						Class43.method515(local175).anInt751 = (aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray26[0] << 25) + (aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray26[4] << 20) + (aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray25[0] << 15) + (aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray25[8] << 10) + (aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray25[11] << 5) + aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray25[1];
					} else {
						Class43.method515(local175).anInt751 = (int) (aClass1_Sub1_Sub1_Sub2_Sub1_1.aClass31_1.aLong24 + 305419896L);
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 113) {
					this.anInt893 = this.anInt991 / 8;
					for (local175 = 0; local175 < this.anInt893; local175++) {
						this.aLongArray4[local175] = this.aClass1_Sub1_Sub3_8.method161(this.anInt1075);
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 145) {
					local175 = this.aClass1_Sub1_Sub3_8.method185();
					if (local175 == 65535) {
						local175 = -1;
					}
					if (local175 != this.anInt941 && this.aBoolean212 && !aBoolean191 && this.anInt983 == 0) {
						this.anInt964 = local175;
						this.aBoolean203 = true;
						this.aClass12_Sub1_1.method549(2, this.anInt964);
					}
					this.anInt941 = local175;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 253) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local180 = this.aClass1_Sub1_Sub3_8.method159();
					if (this.aBoolean212 && !aBoolean191) {
						this.anInt964 = local175;
						this.aBoolean203 = false;
						this.aClass12_Sub1_1.method549(2, this.anInt964);
						this.anInt983 = local180;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 147) {
					if (this.anInt965 == 12) {
						this.aBoolean200 = true;
					}
					this.anInt868 = this.aClass1_Sub1_Sub3_8.method158();
					this.anInt992 = -1;
					return true;
				}
				@Pc(836) Class43 local836;
				if (this.anInt992 == 179) {
					local175 = this.aClass1_Sub1_Sub3_8.method185();
					local836 = Class43.method515(local175);
					for (local184 = 0; local184 < local836.anIntArray190.length; local184++) {
						local836.anIntArray190[local184] = -1;
						local836.anIntArray190[local184] = 0;
					}
					this.anInt992 = -1;
					return true;
				}
				@Pc(881) int local881;
				@Pc(887) int local887;
				if (this.anInt992 == 52) {
					this.aBoolean200 = true;
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local836 = Class43.method515(local175);
					local184 = this.aClass1_Sub1_Sub3_8.method157();
					for (local881 = 0; local881 < local184; local881++) {
						local887 = this.aClass1_Sub1_Sub3_8.method155();
						if (local887 == 255) {
							local887 = this.aClass1_Sub1_Sub3_8.method160();
						}
						local836.anIntArray190[local881] = this.aClass1_Sub1_Sub3_8.method185();
						local836.anIntArray189[local881] = local887;
					}
					for (local887 = local184; local887 < local836.anIntArray190.length; local887++) {
						local836.anIntArray190[local887] = 0;
						local836.anIntArray189[local887] = 0;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 154) {
					for (local175 = 0; local175 < this.aClass1_Sub1_Sub1_Sub2_Sub1Array1.length; local175++) {
						if (this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local175] != null) {
							this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local175].anInt451 = -1;
						}
					}
					for (local180 = 0; local180 < this.aClass1_Sub1_Sub1_Sub2_Sub2Array1.length; local180++) {
						if (this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local180] != null) {
							this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local180].anInt451 = -1;
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 35) {
					this.aBoolean208 = false;
					this.anInt1041 = 2;
					this.aString21 = "";
					this.aBoolean194 = true;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 73) {
					this.aBoolean214 = false;
					for (local175 = 0; local175 < 5; local175++) {
						this.aBooleanArray12[local175] = false;
					}
					this.anInt992 = -1;
					return true;
				}
				@Pc(1049) Class43 local1049;
				if (this.anInt992 == 132) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local180 = this.aClass1_Sub1_Sub3_8.method183();
					local1049 = Class43.method515(local175);
					if (local1049 != null && local1049.anInt759 == 0) {
						if (local180 < 0) {
							local180 = 0;
						}
						if (local180 > local1049.anInt724 - local1049.anInt727) {
							local180 = local1049.anInt724 - local1049.anInt727;
						}
						local1049.anInt738 = local180;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 160) {
					local175 = this.aClass1_Sub1_Sub3_8.method188();
					local180 = this.aClass1_Sub1_Sub3_8.method157();
					local184 = this.aClass1_Sub1_Sub3_8.method186();
					@Pc(1100) Class43 local1100 = Class43.method515(local180);
					local1100.anInt745 = local184;
					local1100.anInt737 = local175;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 119) {
					local175 = this.aClass1_Sub1_Sub3_8.method158();
					if (local175 >= 0) {
						this.method610(local175);
					}
					if (local175 != this.anInt996) {
						this.method716(this.anInt996);
						this.anInt996 = local175;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 39) {
					this.anInt894 = this.aClass1_Sub1_Sub3_8.method174();
					if (this.anInt894 == this.anInt965) {
						if (this.anInt894 == 3) {
							this.anInt965 = 1;
						} else {
							this.anInt965 = 3;
						}
						this.aBoolean200 = true;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 108) {
					local175 = this.aClass1_Sub1_Sub3_8.method176();
					local180 = this.aClass1_Sub1_Sub3_8.method174();
					@Pc(1195) String local1195 = this.aClass1_Sub1_Sub3_8.method162();
					if (local175 >= 1 && local175 <= 5) {
						if (local1195.equalsIgnoreCase("null")) {
							local1195 = null;
						}
						this.aStringArray8[local175 - 1] = local1195;
						this.aBooleanArray11[local175 - 1] = local180 == 0;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 59) {
					local175 = this.aClass1_Sub1_Sub3_8.method183();
					local180 = this.aClass1_Sub1_Sub3_8.method155();
					if (local175 == 65535) {
						local175 = -1;
					}
					if (this.anIntArray274[local180] != local175) {
						this.method716(this.anIntArray274[local180]);
						this.anIntArray274[local180] = local175;
					}
					this.aBoolean200 = true;
					this.aBoolean192 = true;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 173) {
					this.anInt902 = this.aClass1_Sub1_Sub3_8.method175();
					this.anInt903 = this.aClass1_Sub1_Sub3_8.method175();
					while (this.aClass1_Sub1_Sub3_8.anInt301 < this.anInt991) {
						local175 = this.aClass1_Sub1_Sub3_8.method155();
						this.method679(local175, this.aClass1_Sub1_Sub3_8);
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 98) {
					@Pc(1325) byte local1325 = this.aClass1_Sub1_Sub3_8.method177();
					local180 = this.aClass1_Sub1_Sub3_8.method157();
					this.anIntArray260[local180] = local1325;
					if (this.anIntArray241[local180] != local1325) {
						this.anIntArray241[local180] = local1325;
						this.method633(local180);
						this.aBoolean200 = true;
						if (this.anInt990 != -1) {
							this.aBoolean194 = true;
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 198) {
					this.anInt952 = this.aClass1_Sub1_Sub3_8.method155();
					this.aBoolean200 = true;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 53) {
					this.anInt1052 = 0;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 7) {
					local175 = this.aClass1_Sub1_Sub3_8.method185();
					local180 = this.aClass1_Sub1_Sub3_8.method184();
					local184 = this.aClass1_Sub1_Sub3_8.method185();
					if (local180 == 65535) {
						Class43.method515(local175).anInt750 = 0;
						this.anInt992 = -1;
						return true;
					}
					@Pc(1427) Class19 local1427 = Class19.method315(local180);
					Class43.method515(local175).anInt750 = 4;
					Class43.method515(local175).anInt751 = local180;
					Class43.method515(local175).anInt753 = local1427.anInt499;
					Class43.method515(local175).anInt754 = local1427.anInt487;
					Class43.method515(local175).anInt752 = local1427.anInt478 * 100 / local184;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 115) {
					this.anInt895 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 112) {
					this.aBoolean200 = true;
					local175 = this.aClass1_Sub1_Sub3_8.method175();
					local180 = this.aClass1_Sub1_Sub3_8.method160();
					local184 = this.aClass1_Sub1_Sub3_8.method176();
					this.anIntArray275[local175] = local180;
					this.anIntArray259[local175] = local184;
					this.anIntArray252[local175] = 1;
					for (local881 = 0; local881 < 98; local881++) {
						if (local180 >= anIntArray225[local881]) {
							this.anIntArray252[local175] = local881 + 2;
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 150) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local180 = this.aClass1_Sub1_Sub3_8.method183();
					Class43.method515(local180).anInt750 = 2;
					Class43.method515(local180).anInt751 = local175;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 117) {
					this.anInt1023 = this.aClass1_Sub1_Sub3_8.method184() * 30;
					this.anInt992 = -1;
					return true;
				}
				@Pc(1620) int local1620;
				@Pc(1587) long local1587;
				if (this.anInt992 == 106) {
					local1587 = this.aClass1_Sub1_Sub3_8.method161(this.anInt1075);
					local184 = this.aClass1_Sub1_Sub3_8.method160();
					local881 = this.aClass1_Sub1_Sub3_8.method155();
					local460 = false;
					for (local462 = 0; local462 < 100; local462++) {
						if (this.anIntArray242[local462] == local184) {
							local460 = true;
							break;
						}
					}
					if (local881 <= 1) {
						for (local1620 = 0; local1620 < this.anInt893; local1620++) {
							if (this.aLongArray4[local1620] == local1587) {
								local460 = true;
								break;
							}
						}
					}
					if (!local460 && this.anInt980 == 0) {
						try {
							this.anIntArray242[this.anInt869] = local184;
							this.anInt869 = (this.anInt869 + 1) % 100;
							local595 = Class15.method283(anInt901, this.aClass1_Sub1_Sub3_8, this.anInt991 - 13);
							if (local881 != 3) {
								local595 = Class30.method447(local595);
							}
							if (local881 == 2 || local881 == 3) {
								this.method649(7, "@cr2@" + Class20.method323(this.aBoolean201, Class20.method320(local1587)), local595);
							} else if (local881 == 1) {
								this.method649(7, "@cr1@" + Class20.method323(this.aBoolean201, Class20.method320(local1587)), local595);
							} else {
								this.method649(3, Class20.method323(this.aBoolean201, Class20.method320(local1587)), local595);
							}
						} catch (@Pc(1733) Exception local1733) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 156) {
					this.aBoolean214 = true;
					this.anInt1018 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt1019 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt1020 = this.aClass1_Sub1_Sub3_8.method157();
					this.anInt1021 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt1022 = this.aClass1_Sub1_Sub3_8.method155();
					if (this.anInt1022 >= 100) {
						local175 = this.anInt1018 * 128 + 64;
						local180 = this.anInt1019 * 128 + 64;
						local184 = this.method719(this.anInt918, local175, local180) - this.anInt1020;
						local881 = local175 - this.anInt1059;
						local887 = local184 - this.anInt1060;
						local462 = local180 - this.anInt1061;
						local1620 = (int) Math.sqrt((double) (local881 * local881 + local462 * local462));
						this.anInt1062 = (int) (Math.atan2((double) local887, (double) local1620) * 325.949D) & 0x7FF;
						this.anInt1063 = (int) (Math.atan2((double) local881, (double) local462) * -325.949D) & 0x7FF;
						if (this.anInt1062 < 128) {
							this.anInt1062 = 128;
						}
						if (this.anInt1062 > 383) {
							this.anInt1062 = 383;
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 206) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local180 = this.aClass1_Sub1_Sub3_8.method155();
					local184 = this.aClass1_Sub1_Sub3_8.method157();
					if (local184 == 65535) {
						if (this.anInt1040 < 50) {
							this.anIntArray219[this.anInt1040] = (short) local175;
							this.anIntArray270[this.anInt1040] = local180;
							this.anIntArray262[this.anInt1040] = 0;
							this.anInt1040++;
						}
					} else if (this.aBoolean197 && !aBoolean191 && this.anInt1040 < 50) {
						this.anIntArray219[this.anInt1040] = local175;
						this.anIntArray270[this.anInt1040] = local180;
						this.anIntArray262[this.anInt1040] = local184 + Class24.anIntArray88[local175];
						this.anInt1040++;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 155) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local180 = this.aClass1_Sub1_Sub3_8.method184();
					local184 = this.aClass1_Sub1_Sub3_8.method185();
					local881 = this.aClass1_Sub1_Sub3_8.method185();
					Class43.method515(local184).anInt753 = local180;
					Class43.method515(local184).anInt754 = local175;
					Class43.method515(local184).anInt752 = local881;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 49) {
					local175 = this.aClass1_Sub1_Sub3_8.method183();
					this.method610(local175);
					if (this.anInt954 != -1) {
						this.method716(this.anInt954);
						this.anInt954 = -1;
						this.aBoolean200 = true;
						this.aBoolean192 = true;
					}
					if (this.anInt911 != -1) {
						this.method716(this.anInt911);
						this.anInt911 = -1;
						this.aBoolean194 = true;
					}
					if (this.anInt1085 != -1) {
						this.method716(this.anInt1085);
						this.anInt1085 = -1;
						this.aBoolean184 = true;
					}
					if (this.anInt882 != -1) {
						this.method716(this.anInt882);
						this.anInt882 = -1;
					}
					if (this.anInt998 != local175) {
						this.method716(this.anInt998);
						this.anInt998 = local175;
					}
					if (this.anInt1041 != 0) {
						this.anInt1041 = 0;
						this.aBoolean194 = true;
					}
					this.aBoolean224 = false;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 12) {
					this.anInt950 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt1046 = this.aClass1_Sub1_Sub3_8.method183();
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 230) {
					for (local175 = 0; local175 < this.anIntArray241.length; local175++) {
						if (this.anIntArray241[local175] != this.anIntArray260[local175]) {
							this.anIntArray241[local175] = this.anIntArray260[local175];
							this.method633(local175);
							this.aBoolean200 = true;
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 238) {
					this.method626(this.anInt1071);
					this.anInt992 = -1;
					return false;
				}
				if (this.anInt992 == 178) {
					local175 = this.aClass1_Sub1_Sub3_8.method187();
					local180 = this.aClass1_Sub1_Sub3_8.method157();
					local1049 = Class43.method515(local180);
					if (local1049.anInt743 != local175 || local175 == -1) {
						local1049.anInt743 = local175;
						local1049.anInt749 = 0;
						local1049.anInt736 = 0;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 219) {
					this.anInt965 = this.aClass1_Sub1_Sub3_8.method176();
					this.aBoolean200 = true;
					this.aBoolean192 = true;
					this.anInt992 = -1;
					return true;
				}
				@Pc(2397) int local2397;
				if (this.anInt992 == 167) {
					local1587 = this.aClass1_Sub1_Sub3_8.method161(this.anInt1075);
					local184 = this.aClass1_Sub1_Sub3_8.method155();
					@Pc(2260) String local2260 = Class20.method323(this.aBoolean201, Class20.method320(local1587));
					for (local887 = 0; local887 < this.anInt951; local887++) {
						if (local1587 == this.aLongArray3[local887]) {
							if (this.anIntArray213[local887] != local184) {
								this.anIntArray213[local887] = local184;
								this.aBoolean200 = true;
								if (local184 > 0) {
									this.method649(5, "", local2260 + " has logged in.");
								}
								if (local184 == 0) {
									this.method649(5, "", local2260 + " has logged out.");
								}
							}
							local2260 = null;
							break;
						}
					}
					if (local2260 != null && this.anInt951 < 200) {
						this.aLongArray3[this.anInt951] = local1587;
						this.aStringArray14[this.anInt951] = local2260;
						this.anIntArray213[this.anInt951] = local184;
						this.anInt951++;
						this.aBoolean200 = true;
					}
					@Pc(2358) boolean local2358 = false;
					while (!local2358) {
						local2358 = true;
						for (local1620 = 0; local1620 < this.anInt951 - 1; local1620++) {
							if (this.anIntArray213[local1620] != anInt886 && this.anIntArray213[local1620 + 1] == anInt886 || this.anIntArray213[local1620] == 0 && this.anIntArray213[local1620 + 1] != 0) {
								local2397 = this.anIntArray213[local1620];
								this.anIntArray213[local1620] = this.anIntArray213[local1620 + 1];
								this.anIntArray213[local1620 + 1] = local2397;
								@Pc(2419) String local2419 = this.aStringArray14[local1620];
								this.aStringArray14[local1620] = this.aStringArray14[local1620 + 1];
								this.aStringArray14[local1620 + 1] = local2419;
								@Pc(2441) long local2441 = this.aLongArray3[local1620];
								this.aLongArray3[local1620] = this.aLongArray3[local1620 + 1];
								this.aLongArray3[local1620 + 1] = local2441;
								this.aBoolean200 = true;
								local2358 = false;
							}
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 130) {
					this.aBoolean208 = false;
					this.anInt1041 = 1;
					this.aString21 = "";
					this.aBoolean194 = true;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 55) {
					local175 = this.aClass1_Sub1_Sub3_8.method183();
					local180 = this.aClass1_Sub1_Sub3_8.method185();
					Class43.method515(local175).anInt750 = 1;
					Class43.method515(local175).anInt751 = local180;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 190) {
					local175 = this.aClass1_Sub1_Sub3_8.method185();
					local180 = this.aClass1_Sub1_Sub3_8.method184();
					local184 = local175 >> 10 & 0x1F;
					local881 = local175 >> 5 & 0x1F;
					local887 = local175 & 0x1F;
					Class43.method515(local180).anInt732 = (local184 << 19) + (local881 << 11) + (local887 << 3);
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 84) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local180 = this.aClass1_Sub1_Sub3_8.method191(360);
					this.anIntArray260[local175] = local180;
					if (this.anIntArray241[local175] != local180) {
						this.anIntArray241[local175] = local180;
						this.method633(local175);
						this.aBoolean200 = true;
						if (this.anInt990 != -1) {
							this.aBoolean194 = true;
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 68 || this.anInt992 == 109) {
					local175 = this.anInt1044;
					local180 = this.anInt1045;
					if (this.anInt992 == 68) {
						local180 = this.aClass1_Sub1_Sub3_8.method185();
						local175 = this.aClass1_Sub1_Sub3_8.method183();
						this.aBoolean221 = false;
					}
					if (this.anInt992 == 109) {
						this.aClass1_Sub1_Sub3_8.method165((byte) 9);
						local184 = 0;
						while (true) {
							if (local184 >= 4) {
								this.aClass1_Sub1_Sub3_8.method167(this.aByte31);
								local180 = this.aClass1_Sub1_Sub3_8.method185();
								local175 = this.aClass1_Sub1_Sub3_8.method183();
								this.aBoolean221 = true;
								break;
							}
							for (local881 = 0; local881 < 13; local881++) {
								for (local887 = 0; local887 < 13; local887++) {
									local462 = this.aClass1_Sub1_Sub3_8.method166(1);
									if (local462 == 1) {
										this.anIntArrayArrayArray7[local184][local881][local887] = this.aClass1_Sub1_Sub3_8.method166(26);
									} else {
										this.anIntArrayArrayArray7[local184][local881][local887] = -1;
									}
								}
							}
							local184++;
						}
					}
					if (this.anInt1044 == local175 && this.anInt1045 == local180 && this.anInt928 == 2) {
						this.anInt992 = -1;
						return true;
					}
					this.anInt1044 = local175;
					this.anInt1045 = local180;
					this.anInt945 = (this.anInt1044 - 6) * 8;
					this.anInt946 = (this.anInt1045 - 6) * 8;
					this.aBoolean195 = false;
					if ((this.anInt1044 / 8 == 48 || this.anInt1044 / 8 == 49) && this.anInt1045 / 8 == 48) {
						this.aBoolean195 = true;
					}
					if (this.anInt1044 / 8 == 48 && this.anInt1045 / 8 == 148) {
						this.aBoolean195 = true;
					}
					this.anInt928 = 1;
					this.aLong32 = System.currentTimeMillis();
					this.method627("Loading - please wait.", null);
					if (this.anInt992 == 68) {
						local184 = 0;
						local881 = (this.anInt1044 - 6) / 8;
						label1190: while (true) {
							if (local881 > (this.anInt1044 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local184][];
								this.aByteArrayArray5 = new byte[local184][];
								this.anIntArray249 = new int[local184];
								this.anIntArray250 = new int[local184];
								this.anIntArray251 = new int[local184];
								local184 = 0;
								local887 = (this.anInt1044 - 6) / 8;
								while (true) {
									if (local887 > (this.anInt1044 + 6) / 8) {
										break label1190;
									}
									for (local462 = (this.anInt1045 - 6) / 8; local462 <= (this.anInt1045 + 6) / 8; local462++) {
										this.anIntArray249[local184] = (local887 << 8) + local462;
										if (this.aBoolean195 && (local462 == 49 || local462 == 149 || local462 == 147 || local887 == 50 || local887 == 49 && local462 == 47)) {
											this.anIntArray250[local184] = -1;
											this.anIntArray251[local184] = -1;
											local184++;
										} else {
											local1620 = this.anIntArray250[local184] = this.aClass12_Sub1_1.method546(aByte27, local462, 0, local887);
											if (local1620 != -1) {
												this.aClass12_Sub1_1.method549(3, local1620);
											}
											local2397 = this.anIntArray251[local184] = this.aClass12_Sub1_1.method546(aByte27, local462, 1, local887);
											if (local2397 != -1) {
												this.aClass12_Sub1_1.method549(3, local2397);
											}
											local184++;
										}
									}
									local887++;
								}
							}
							for (local887 = (this.anInt1045 - 6) / 8; local887 <= (this.anInt1045 + 6) / 8; local887++) {
								local184++;
							}
							local881++;
						}
					}
					if (this.anInt992 == 109) {
						local184 = 0;
						@Pc(3021) int[] local3021 = new int[676];
						local887 = 0;
						label1151: while (true) {
							@Pc(3051) int local3051;
							@Pc(3057) int local3057;
							@Pc(3067) int local3067;
							if (local887 >= 4) {
								this.aByteArrayArray6 = new byte[local184][];
								this.aByteArrayArray5 = new byte[local184][];
								this.anIntArray249 = new int[local184];
								this.anIntArray250 = new int[local184];
								this.anIntArray251 = new int[local184];
								local462 = 0;
								while (true) {
									if (local462 >= local184) {
										break label1151;
									}
									local1620 = this.anIntArray249[local462] = local3021[local462];
									local2397 = local1620 >> 8 & 0xFF;
									local3051 = local1620 & 0xFF;
									local3057 = this.anIntArray250[local462] = this.aClass12_Sub1_1.method546(aByte27, local3051, 0, local2397);
									if (local3057 != -1) {
										this.aClass12_Sub1_1.method549(3, local3057);
									}
									local3067 = this.anIntArray251[local462] = this.aClass12_Sub1_1.method546(aByte27, local3051, 1, local2397);
									if (local3067 != -1) {
										this.aClass12_Sub1_1.method549(3, local3067);
									}
									local462++;
								}
							}
							for (local462 = 0; local462 < 13; local462++) {
								for (local1620 = 0; local1620 < 13; local1620++) {
									local2397 = this.anIntArrayArrayArray7[local887][local462][local1620];
									if (local2397 != -1) {
										local3051 = local2397 >> 14 & 0x3FF;
										local3057 = local2397 >> 3 & 0x7FF;
										local3067 = (local3051 / 8 << 8) + local3057 / 8;
										for (@Pc(3069) int local3069 = 0; local3069 < local184; local3069++) {
											if (local3021[local3069] == local3067) {
												local3067 = -1;
												break;
											}
										}
										if (local3067 != -1) {
											local3021[local184++] = local3067;
										}
									}
								}
							}
							local887++;
						}
					}
					local184 = this.anInt945 - this.anInt947;
					local881 = this.anInt946 - this.anInt948;
					this.anInt947 = this.anInt945;
					this.anInt948 = this.anInt946;
					for (local887 = 0; local887 < 16384; local887++) {
						@Pc(3222) Class1_Sub1_Sub1_Sub2_Sub2 local3222 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local887];
						if (local3222 != null) {
							for (local1620 = 0; local1620 < 10; local1620++) {
								local3222.anIntArray72[local1620] -= local184;
								local3222.anIntArray73[local1620] -= local881;
							}
							local3222.anInt428 -= local184 * 128;
							local3222.anInt429 -= local881 * 128;
						}
					}
					for (local462 = 0; local462 < this.anInt904; local462++) {
						@Pc(3277) Class1_Sub1_Sub1_Sub2_Sub1 local3277 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local462];
						if (local3277 != null) {
							for (local2397 = 0; local2397 < 10; local2397++) {
								local3277.anIntArray72[local2397] -= local184;
								local3277.anIntArray73[local2397] -= local881;
							}
							local3277.anInt428 -= local184 * 128;
							local3277.anInt429 -= local881 * 128;
						}
					}
					this.aBoolean187 = true;
					@Pc(3329) byte local3329 = 0;
					@Pc(3331) byte local3331 = 104;
					@Pc(3333) byte local3333 = 1;
					if (local184 < 0) {
						local3329 = 103;
						local3331 = -1;
						local3333 = -1;
					}
					@Pc(3343) byte local3343 = 0;
					@Pc(3345) byte local3345 = 104;
					@Pc(3347) byte local3347 = 1;
					if (local881 < 0) {
						local3343 = 103;
						local3345 = -1;
						local3347 = -1;
					}
					for (@Pc(3357) int local3357 = local3329; local3357 != local3331; local3357 += local3333) {
						for (@Pc(3361) int local3361 = local3343; local3361 != local3345; local3361 += local3347) {
							@Pc(3367) int local3367 = local3357 + local184;
							@Pc(3371) int local3371 = local3361 + local881;
							for (@Pc(3373) int local3373 = 0; local3373 < 4; local3373++) {
								if (local3367 >= 0 && local3371 >= 0 && local3367 < 104 && local3371 < 104) {
									this.aClass6ArrayArrayArray1[local3373][local3357][local3361] = this.aClass6ArrayArrayArray1[local3373][local3367][local3371];
								} else {
									this.aClass6ArrayArrayArray1[local3373][local3357][local3361] = null;
								}
							}
						}
					}
					for (@Pc(3435) Class1_Sub2 local3435 = (Class1_Sub2) this.aClass6_11.method97(); local3435 != null; local3435 = (Class1_Sub2) this.aClass6_11.method99(569)) {
						local3435.anInt225 -= local184;
						local3435.anInt226 -= local881;
						if (local3435.anInt225 < 0 || local3435.anInt226 < 0 || local3435.anInt225 >= 104 || local3435.anInt226 >= 104) {
							local3435.method501();
						}
					}
					if (this.anInt1052 != 0) {
						this.anInt1052 -= local184;
						this.anInt1053 -= local881;
					}
					this.aBoolean214 = false;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 192) {
					this.method628(this.aClass1_Sub1_Sub3_8, this.anInt991);
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 149) {
					this.aClass1_Sub1_Sub3_8.method155();
					this.anInt921 = this.aClass1_Sub1_Sub3_8.method157();
					this.anInt924 = this.aClass1_Sub1_Sub3_8.method157();
					this.anInt859 = this.aClass1_Sub1_Sub3_8.method185();
					this.anInt1036 = this.aClass1_Sub1_Sub3_8.method184();
					this.anInt1055 = this.aClass1_Sub1_Sub3_8.method157();
					this.anInt1038 = this.aClass1_Sub1_Sub3_8.method191(360);
					this.aClass1_Sub1_Sub3_8.method183();
					this.anInt1010 = this.aClass1_Sub1_Sub3_8.method185();
					this.anInt1073 = this.aClass1_Sub1_Sub3_8.method183();
					this.anInt1083 = this.aClass1_Sub1_Sub3_8.method157();
					signlink.dnslookup(Class20.method322(this.anInt1038));
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 123) {
					this.aBoolean200 = true;
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local836 = Class43.method515(local175);
					while (this.aClass1_Sub1_Sub3_8.anInt301 < this.anInt991) {
						local184 = this.aClass1_Sub1_Sub3_8.method169();
						local881 = this.aClass1_Sub1_Sub3_8.method157();
						local887 = this.aClass1_Sub1_Sub3_8.method155();
						if (local887 == 255) {
							local887 = this.aClass1_Sub1_Sub3_8.method160();
						}
						if (local184 >= 0 && local184 < local836.anIntArray190.length) {
							local836.anIntArray190[local184] = local881;
							local836.anIntArray189[local184] = local887;
						}
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 216) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					local180 = this.aClass1_Sub1_Sub3_8.method184();
					if (this.anInt911 != -1) {
						this.method716(this.anInt911);
						this.anInt911 = -1;
						this.aBoolean194 = true;
					}
					if (this.anInt1085 != -1) {
						this.method716(this.anInt1085);
						this.anInt1085 = -1;
						this.aBoolean184 = true;
					}
					if (this.anInt882 != -1) {
						this.method716(this.anInt882);
						this.anInt882 = -1;
					}
					if (this.anInt998 != local180) {
						this.method716(this.anInt998);
						this.anInt998 = local180;
					}
					if (this.anInt954 != local175) {
						this.method716(this.anInt954);
						this.anInt954 = local175;
					}
					if (this.anInt1041 != 0) {
						this.anInt1041 = 0;
						this.aBoolean194 = true;
					}
					this.aBoolean200 = true;
					this.aBoolean192 = true;
					this.aBoolean224 = false;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 234) {
					local175 = this.aClass1_Sub1_Sub3_8.method183();
					local180 = this.aClass1_Sub1_Sub3_8.method184();
					this.method610(local175);
					if (local180 != -1) {
						this.method610(local180);
					}
					if (this.anInt998 != -1) {
						this.method716(this.anInt998);
						this.anInt998 = -1;
					}
					if (this.anInt954 != -1) {
						this.method716(this.anInt954);
						this.anInt954 = -1;
					}
					if (this.anInt911 != -1) {
						this.method716(this.anInt911);
						this.anInt911 = -1;
					}
					if (this.anInt1085 != local175) {
						this.method716(this.anInt1085);
						this.anInt1085 = local175;
					}
					if (this.anInt882 != local175) {
						this.method716(this.anInt882);
						this.anInt882 = local180;
					}
					this.anInt1041 = 0;
					this.aBoolean224 = false;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 57) {
					this.anInt966 = this.aClass1_Sub1_Sub3_8.method155();
					if (this.anInt966 == 1) {
						this.anInt939 = this.aClass1_Sub1_Sub3_8.method157();
					}
					if (this.anInt966 >= 2 && this.anInt966 <= 6) {
						if (this.anInt966 == 2) {
							this.anInt934 = 64;
							this.anInt935 = 64;
						}
						if (this.anInt966 == 3) {
							this.anInt934 = 0;
							this.anInt935 = 64;
						}
						if (this.anInt966 == 4) {
							this.anInt934 = 128;
							this.anInt935 = 64;
						}
						if (this.anInt966 == 5) {
							this.anInt934 = 64;
							this.anInt935 = 0;
						}
						if (this.anInt966 == 6) {
							this.anInt934 = 64;
							this.anInt935 = 128;
						}
						this.anInt966 = 2;
						this.anInt931 = this.aClass1_Sub1_Sub3_8.method157();
						this.anInt932 = this.aClass1_Sub1_Sub3_8.method157();
						this.anInt933 = this.aClass1_Sub1_Sub3_8.method155();
					}
					if (this.anInt966 == 10) {
						this.anInt874 = this.aClass1_Sub1_Sub3_8.method157();
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 58) {
					local175 = this.aClass1_Sub1_Sub3_8.method157();
					this.method610(local175);
					if (this.anInt911 != -1) {
						this.method716(this.anInt911);
						this.anInt911 = -1;
						this.aBoolean194 = true;
					}
					if (this.anInt1085 != -1) {
						this.method716(this.anInt1085);
						this.anInt1085 = -1;
						this.aBoolean184 = true;
					}
					if (this.anInt882 != -1) {
						this.method716(this.anInt882);
						this.anInt882 = -1;
					}
					if (this.anInt998 != -1) {
						this.method716(this.anInt998);
						this.anInt998 = -1;
					}
					if (this.anInt954 != local175) {
						this.method716(this.anInt954);
						this.anInt954 = local175;
					}
					if (this.anInt1041 != 0) {
						this.anInt1041 = 0;
						this.aBoolean194 = true;
					}
					this.aBoolean200 = true;
					this.aBoolean192 = true;
					this.aBoolean224 = false;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 221) {
					local175 = this.aClass1_Sub1_Sub3_8.method155();
					local180 = this.aClass1_Sub1_Sub3_8.method155();
					local184 = this.aClass1_Sub1_Sub3_8.method155();
					local881 = this.aClass1_Sub1_Sub3_8.method155();
					this.aBooleanArray12[local175] = true;
					this.anIntArray239[local175] = local180;
					this.anIntArray255[local175] = local184;
					this.anIntArray269[local175] = local881;
					this.anIntArray268[local175] = 0;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 67) {
					if (this.anInt954 != -1) {
						this.method716(this.anInt954);
						this.anInt954 = -1;
						this.aBoolean200 = true;
						this.aBoolean192 = true;
					}
					if (this.anInt911 != -1) {
						this.method716(this.anInt911);
						this.anInt911 = -1;
						this.aBoolean194 = true;
					}
					if (this.anInt1085 != -1) {
						this.method716(this.anInt1085);
						this.anInt1085 = -1;
						this.aBoolean184 = true;
					}
					if (this.anInt882 != -1) {
						this.method716(this.anInt882);
						this.anInt882 = -1;
					}
					if (this.anInt998 != -1) {
						this.method716(this.anInt998);
						this.anInt998 = -1;
					}
					if (this.anInt1041 != 0) {
						this.anInt1041 = 0;
						this.aBoolean194 = true;
					}
					this.aBoolean224 = false;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 46) {
					local175 = this.aClass1_Sub1_Sub3_8.method183();
					local455 = this.aClass1_Sub1_Sub3_8.method162();
					Class43.method515(local175).aString13 = local455;
					@Pc(4223) int local4223 = this.anIntArray274[this.anInt965];
					if (Class43.method515(local175).anInt728 == local4223) {
						this.aBoolean200 = true;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 228) {
					@Pc(4245) boolean local4245 = this.aClass1_Sub1_Sub3_8.method155() == 1;
					local180 = this.aClass1_Sub1_Sub3_8.method183();
					Class43.method515(local180).aBoolean148 = local4245;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 8 || this.anInt992 == 22 || this.anInt992 == 99 || this.anInt992 == 255 || this.anInt992 == 197 || this.anInt992 == 102 || this.anInt992 == 212 || this.anInt992 == 222 || this.anInt992 == 213 || this.anInt992 == 61 || this.anInt992 == 225) {
					this.method679(this.anInt992, this.aClass1_Sub1_Sub3_8);
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 163) {
					this.aBoolean214 = true;
					this.anInt896 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt897 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt898 = this.aClass1_Sub1_Sub3_8.method157();
					this.anInt899 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt900 = this.aClass1_Sub1_Sub3_8.method155();
					if (this.anInt900 >= 100) {
						this.anInt1059 = this.anInt896 * 128 + 64;
						this.anInt1061 = this.anInt897 * 128 + 64;
						this.anInt1060 = this.method719(this.anInt918, this.anInt1059, this.anInt1061) - this.anInt898;
					}
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 66) {
					this.anInt902 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt903 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 29) {
					this.method639(this.anInt991, this.aClass1_Sub1_Sub3_8);
					this.aBoolean187 = false;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 83) {
					local175 = this.aClass1_Sub1_Sub3_8.method158();
					if (local175 != this.anInt990) {
						this.method716(this.anInt990);
						this.anInt990 = local175;
					}
					this.aBoolean194 = true;
					this.anInt992 = -1;
					return true;
				}
				if (this.anInt992 == 95) {
					if (this.anInt965 == 12) {
						this.aBoolean200 = true;
					}
					this.anInt861 = this.aClass1_Sub1_Sub3_8.method155();
					this.anInt992 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt992 + "," + this.anInt991 + " - " + this.anInt884 + "," + this.anInt885);
				this.method626(this.anInt1071);
			} catch (@Pc(4503) IOException local4503) {
				this.method710();
			} catch (@Pc(4508) Exception local4508) {
				local444 = "T2 - " + this.anInt992 + "," + this.anInt884 + "," + this.anInt885 + " - " + this.anInt991 + "," + (this.anInt945 + aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray72[0]) + "," + (this.anInt946 + aClass1_Sub1_Sub1_Sub2_Sub1_1.anIntArray73[0]) + " - ";
				for (local180 = 0; local180 < this.anInt991 && local180 < 50; local180++) {
					local444 = local444 + this.aClass1_Sub1_Sub3_8.aByteArray2[local180] + ",";
				}
				signlink.reporterror(local444);
				this.method626(this.anInt1071);
			}
			return true;
		} catch (@Pc(4590) RuntimeException local4590) {
			signlink.reporterror("7719, " + arg0 + ", " + local4590.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!VTUPBFSN;)I")
	private int method704(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1) {
		try {
			if (arg1.anIntArrayArray18 == null || arg0 >= arg1.anIntArrayArray18.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg1.anIntArrayArray18[arg0];
				@Pc(22) int local22 = 0;
				@Pc(24) int local24 = 0;
				@Pc(26) byte local26 = 0;
				while (true) {
					@Pc(31) int local31 = local20[local24++];
					@Pc(33) int local33 = 0;
					@Pc(35) byte local35 = 0;
					if (local31 == 0) {
						return local22;
					}
					if (local31 == 1) {
						local33 = this.anIntArray259[local20[local24++]];
					}
					if (local31 == 2) {
						local33 = this.anIntArray252[local20[local24++]];
					}
					if (local31 == 3) {
						local33 = this.anIntArray275[local20[local24++]];
					}
					@Pc(81) Class43 local81;
					@Pc(86) int local86;
					@Pc(99) int local99;
					if (local31 == 4) {
						local81 = Class43.method515(local20[local24++]);
						local86 = local20[local24++];
						if (local86 >= 0 && local86 < Class19.anInt497 && (!Class19.method315(local86).aBoolean84 || aBoolean190)) {
							for (local99 = 0; local99 < local81.anIntArray190.length; local99++) {
								if (local81.anIntArray190[local99] == local86 + 1) {
									local33 += local81.anIntArray189[local99];
								}
							}
						}
					}
					if (local31 == 5) {
						local33 = this.anIntArray241[local20[local24++]];
					}
					if (local31 == 6) {
						local33 = anIntArray225[this.anIntArray252[local20[local24++]] - 1];
					}
					if (local31 == 7) {
						local33 = this.anIntArray241[local20[local24++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local33 = aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt189;
					}
					@Pc(174) int local174;
					if (local31 == 9) {
						for (local174 = 0; local174 < Class21.anInt509; local174++) {
							if (Class21.aBooleanArray7[local174]) {
								local33 += this.anIntArray252[local174];
							}
						}
					}
					if (local31 == 10) {
						local81 = Class43.method515(local20[local24++]);
						local86 = local20[local24++] + 1;
						if (local86 >= 0 && local86 < Class19.anInt497 && (!Class19.method315(local86).aBoolean84 || aBoolean190)) {
							for (local99 = 0; local99 < local81.anIntArray190.length; local99++) {
								if (local81.anIntArray190[local99] == local86) {
									local33 = 999999999;
									break;
								}
							}
						}
					}
					if (local31 == 11) {
						local33 = this.anInt861;
					}
					if (local31 == 12) {
						local33 = this.anInt868;
					}
					if (local31 == 13) {
						local174 = this.anIntArray241[local20[local24++]];
						local86 = local20[local24++];
						local33 = (local174 & 0x1 << local86) == 0 ? 0 : 1;
					}
					if (local31 == 14) {
						local174 = local20[local24++];
						@Pc(288) Class5 local288 = Class5.aClass5Array1[local174];
						local99 = local288.anInt218;
						@Pc(294) int local294 = local288.anInt219;
						@Pc(297) int local297 = local288.anInt220;
						@Pc(303) int local303 = anIntArray212[local297 - local294];
						local33 = this.anIntArray241[local99] >> local294 & local303;
					}
					if (local31 == 15) {
						local35 = 1;
					}
					if (local31 == 16) {
						local35 = 2;
					}
					if (local31 == 17) {
						local35 = 3;
					}
					if (local31 == 18) {
						local33 = (aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 >> 7) + this.anInt945;
					}
					if (local31 == 19) {
						local33 = (aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 >> 7) + this.anInt946;
					}
					if (local31 == 20) {
						local33 = local20[local24++];
					}
					if (local35 == 0) {
						if (local26 == 0) {
							local22 += local33;
						}
						if (local26 == 1) {
							local22 -= local33;
						}
						if (local26 == 2 && local33 != 0) {
							local22 /= local33;
						}
						if (local26 == 3) {
							local22 *= local33;
						}
						local26 = 0;
					} else {
						local26 = local35;
					}
				}
			} catch (@Pc(396) Exception local396) {
				return -1;
			}
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("17985, " + true + ", " + arg0 + ", " + arg1 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBILclient!QYNFXHXW;)V")
	private void method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3) {
		try {
			if (this.anInt1054 < 400) {
				if (arg3.anIntArray147 != null) {
					arg3 = arg3.method475(863);
				}
				if (arg3 != null && arg3.aBoolean132) {
					@Pc(27) String local27 = arg3.aString8;
					if (arg3.anInt641 != 0) {
						local27 = local27 + method722(arg3.anInt641, aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt189) + " (level-" + arg3.anInt641 + ")";
					}
					if (this.anInt862 == 1) {
						this.aStringArray9[this.anInt1054] = "Use " + this.aString18 + " with @yel@" + local27;
						this.anIntArray216[this.anInt1054] = 384;
						this.anIntArray217[this.anInt1054] = arg0;
						this.anIntArray214[this.anInt1054] = arg2;
						this.anIntArray215[this.anInt1054] = arg1;
						this.anInt1054++;
					} else if (this.anInt1091 != 1) {
						@Pc(165) int local165;
						if (arg3.aStringArray5 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg3.aStringArray5[local165] != null && !arg3.aStringArray5[local165].equalsIgnoreCase("attack")) {
									this.aStringArray9[this.anInt1054] = arg3.aStringArray5[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray216[this.anInt1054] = 840;
									}
									if (local165 == 1) {
										this.anIntArray216[this.anInt1054] = 2;
									}
									if (local165 == 2) {
										this.anIntArray216[this.anInt1054] = 131;
									}
									if (local165 == 3) {
										this.anIntArray216[this.anInt1054] = 546;
									}
									if (local165 == 4) {
										this.anIntArray216[this.anInt1054] = 588;
									}
									this.anIntArray217[this.anInt1054] = arg0;
									this.anIntArray214[this.anInt1054] = arg2;
									this.anIntArray215[this.anInt1054] = arg1;
									this.anInt1054++;
								}
							}
						}
						if (arg3.aStringArray5 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg3.aStringArray5[local165] != null && arg3.aStringArray5[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg3.anInt641 > aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt189) {
										local289 = 2000;
									}
									this.aStringArray9[this.anInt1054] = arg3.aStringArray5[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray216[this.anInt1054] = local289 + 840;
									}
									if (local165 == 1) {
										this.anIntArray216[this.anInt1054] = local289 + 2;
									}
									if (local165 == 2) {
										this.anIntArray216[this.anInt1054] = local289 + 131;
									}
									if (local165 == 3) {
										this.anIntArray216[this.anInt1054] = local289 + 546;
									}
									if (local165 == 4) {
										this.anIntArray216[this.anInt1054] = local289 + 588;
									}
									this.anIntArray217[this.anInt1054] = arg0;
									this.anIntArray214[this.anInt1054] = arg2;
									this.anIntArray215[this.anInt1054] = arg1;
									this.anInt1054++;
								}
							}
						}
						this.aStringArray9[this.anInt1054] = "Examine @yel@" + local27;
						this.anIntArray216[this.anInt1054] = 1163;
						this.anIntArray217[this.anInt1054] = arg0;
						this.anIntArray214[this.anInt1054] = arg2;
						this.anIntArray215[this.anInt1054] = arg1;
						this.anInt1054++;
					} else if ((this.anInt1093 & 0x2) == 2) {
						this.aStringArray9[this.anInt1054] = this.aString30 + " @yel@" + local27;
						this.anIntArray216[this.anInt1054] = 471;
						this.anIntArray217[this.anInt1054] = arg0;
						this.anIntArray214[this.anInt1054] = arg2;
						this.anIntArray215[this.anInt1054] = arg1;
						this.anInt1054++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("67505, " + arg0 + ", " + arg1 + ", " + -70 + ", " + arg2 + ", " + arg3 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method706() {
		try {
			this.aBoolean216 &= true;
			for (@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) this.aClass6_11.method97(); local12 != null; local12 = (Class1_Sub2) this.aClass6_11.method99(569)) {
				if (local12.anInt227 == -1) {
					local12.anInt231 = 0;
					this.method640(local12);
				} else {
					local12.method501();
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("17750, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EYMNCFMK;II)V")
	private void method707(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt907; local5++) {
				@Pc(12) int local12 = this.anIntArray224[local5];
				@Pc(17) Class1_Sub1_Sub1_Sub2_Sub1 local17 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local12];
				@Pc(20) int local20 = arg0.method155();
				if ((local20 & 0x20) != 0) {
					local20 += arg0.method155() << 8;
				}
				this.method711(local20, local17, (byte) 9, local12, arg0);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("98836, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBIIIII)V")
	private void method708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(3) Class1_Sub2 local3 = null;
			for (@Pc(8) Class1_Sub2 local8 = (Class1_Sub2) this.aClass6_11.method97(); local8 != null; local8 = (Class1_Sub2) this.aClass6_11.method99(569)) {
				if (local8.anInt223 == arg7 && local8.anInt225 == arg0 && local8.anInt226 == arg2 && local8.anInt224 == arg6) {
					local3 = local8;
					break;
				}
			}
			if (local3 == null) {
				local3 = new Class1_Sub2();
				local3.anInt223 = arg7;
				local3.anInt224 = arg6;
				local3.anInt225 = arg0;
				local3.anInt226 = arg2;
				this.method640(local3);
				this.aClass6_11.method94(local3);
			}
			local3.anInt228 = arg9;
			local3.anInt230 = arg1;
			local3.anInt229 = arg5;
			@Pc(77) boolean local77 = false;
			local3.anInt231 = arg3;
			local3.anInt227 = arg8;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("63903, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method709() {
		try {
			if (this.aByte30 != 88) {
				this.method581();
			}
			if (this.anInt975 == 0) {
				@Pc(12) int local12 = super.anInt853;
				if (this.anInt1091 == 1 && super.anInt854 >= 516 && super.anInt855 >= 160 && super.anInt854 <= 765 && super.anInt855 <= 205) {
					local12 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean225) {
					if (local12 != 1) {
						local43 = super.anInt848;
						local46 = super.anInt849;
						if (this.anInt1025 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt1025 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt1025 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt1026 - 10 || local43 > this.anInt1026 + this.anInt1028 + 10 || local46 < this.anInt1027 - 10 || local46 > this.anInt1027 + this.anInt1029 + 10) {
							this.aBoolean225 = false;
							if (this.anInt1025 == 1) {
								this.aBoolean200 = true;
							}
							if (this.anInt1025 == 2) {
								this.aBoolean194 = true;
							}
						}
					}
					if (local12 == 1) {
						local43 = this.anInt1026;
						local46 = this.anInt1027;
						local122 = this.anInt1028;
						@Pc(125) int local125 = super.anInt854;
						@Pc(128) int local128 = super.anInt855;
						if (this.anInt1025 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt1025 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt1025 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt1054; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt1054 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method672(local147);
						}
						this.aBoolean225 = false;
						if (this.anInt1025 == 1) {
							this.aBoolean200 = true;
						}
						if (this.anInt1025 == 2) {
							this.aBoolean194 = true;
							return;
						}
					}
				} else {
					if (local12 == 1 && this.anInt1054 > 0) {
						local43 = this.anIntArray216[this.anInt1054 - 1];
						if (local43 == 254 || local43 == 767 || local43 == 858 || local43 == 22 || local43 == 974 || local43 == 599 || local43 == 689 || local43 == 533 || local43 == 484 || local43 == 851 || local43 == 988 || local43 == 1695) {
							local46 = this.anIntArray214[this.anInt1054 - 1];
							local122 = this.anIntArray215[this.anInt1054 - 1];
							@Pc(283) Class43 local283 = Class43.method515(local122);
							if (local283.aBoolean147 || local283.aBoolean152) {
								this.aBoolean210 = false;
								this.anInt943 = 0;
								this.anInt973 = local122;
								this.anInt974 = local46;
								this.anInt975 = 2;
								this.anInt976 = super.anInt854;
								this.anInt977 = super.anInt855;
								if (Class43.method515(local122).anInt728 == this.anInt998) {
									this.anInt975 = 1;
								}
								if (Class43.method515(local122).anInt728 == this.anInt911) {
									this.anInt975 = 3;
								}
								return;
							}
						}
					}
					if (local12 == 1 && (this.anInt1064 == 1 || this.method631(this.anInt1054 - 1)) && this.anInt1054 > 2) {
						local12 = 2;
					}
					if (local12 == 1 && this.anInt1054 > 0) {
						this.method672(this.anInt1054 - 1);
					}
					if (local12 != 2 || this.anInt1054 <= 0) {
						return;
					}
					this.method645();
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("48664, " + 88 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method710() {
		try {
			if (this.anInt995 > 0) {
				this.method626(this.anInt1071);
			} else {
				this.method627("Connection lost", "Please wait - attempting to reestablish");
				this.anInt895 = 0;
				this.anInt1052 = 0;
				@Pc(21) Class33 local21 = this.aClass33_1;
				this.aBoolean216 = false;
				this.anInt936 = 0;
				this.method713(this.aString19, this.aString20, true);
				if (!this.aBoolean216) {
					this.method626(this.anInt1071);
				}
				try {
					local21.method483();
				} catch (@Pc(49) Exception local49) {
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("43230, " + 0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BPHJJPRI;BILclient!EYMNCFMK;)V")
	private void method711(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub3 arg4) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(25) int local25;
			if ((arg0 & 0x400) != 0) {
				arg1.anInt422 = arg4.method185();
				local25 = arg4.method190();
				arg1.anInt426 = local25 >> 16;
				arg1.anInt425 = anInt1079 + (local25 & 0xFFFF);
				arg1.anInt423 = 0;
				arg1.anInt424 = 0;
				if (arg1.anInt425 > anInt1079) {
					arg1.anInt423 = -1;
				}
				if (arg1.anInt422 == 65535) {
					arg1.anInt422 = -1;
				}
			}
			if ((arg0 & 0x2) != 0) {
				arg1.aString6 = arg4.method162();
				if (arg1.aString6.charAt(0) == '~') {
					arg1.aString6 = arg1.aString6.substring(1);
					this.method649(2, arg1.aString3, arg1.aString6);
				} else if (arg1 == aClass1_Sub1_Sub1_Sub2_Sub1_1) {
					this.method649(2, arg1.aString3, arg1.aString6);
				}
				arg1.anInt457 = 0;
				arg1.anInt431 = 0;
				arg1.anInt470 = 150;
			}
			@Pc(118) int local118;
			if ((arg0 & 0x80) != 0) {
				local25 = arg4.method176();
				local118 = arg4.method155();
				arg1.method301(anInt1079, local118, local25);
				arg1.anInt436 = anInt1079 + 300;
				arg1.anInt437 = arg4.method174();
				arg1.anInt438 = arg4.method174();
			}
			@Pc(168) int local168;
			if ((arg0 & 0x40) != 0) {
				local25 = arg4.method183();
				if (local25 == 65535) {
					local25 = -1;
				}
				local118 = arg4.method175();
				if (local25 == arg1.anInt451 && local25 != -1) {
					local168 = Class7.aClass7Array1[local25].anInt245;
					if (local168 == 1) {
						arg1.anInt452 = 0;
						arg1.anInt453 = 0;
						arg1.anInt454 = local118;
						arg1.anInt455 = 0;
					}
					if (local168 == 2) {
						arg1.anInt455 = 0;
					}
				} else if (local25 == -1 || arg1.anInt451 == -1 || Class7.aClass7Array1[local25].anInt239 >= Class7.aClass7Array1[arg1.anInt451].anInt239) {
					arg1.anInt451 = local25;
					arg1.anInt452 = 0;
					arg1.anInt453 = 0;
					arg1.anInt454 = local118;
					arg1.anInt455 = 0;
					arg1.anInt458 = arg1.anInt427;
				}
			}
			if ((arg0 & 0x8) != 0) {
				local25 = arg4.method176();
				@Pc(238) byte[] local238 = new byte[local25];
				@Pc(244) Class1_Sub1_Sub3 local244 = new Class1_Sub1_Sub3(local238, 0);
				arg4.method193(local238, local25);
				this.aClass1_Sub1_Sub3Array1[arg3] = local244;
				arg1.method83(local244);
			}
			if ((arg0 & 0x200) != 0) {
				arg1.anInt439 = arg4.method175();
				arg1.anInt441 = arg4.method174();
				arg1.anInt440 = arg4.method175();
				arg1.anInt442 = arg4.method174();
				arg1.anInt443 = arg4.method157() + anInt1079;
				arg1.anInt444 = arg4.method183() + anInt1079;
				arg1.anInt445 = arg4.method174();
				arg1.method300();
			}
			if ((arg0 & 0x100) != 0) {
				local25 = arg4.method174();
				local118 = arg4.method155();
				arg1.method301(anInt1079, local118, local25);
				arg1.anInt436 = anInt1079 + 300;
				arg1.anInt437 = arg4.method174();
				arg1.anInt438 = arg4.method174();
			}
			if ((arg0 & 0x4) != 0) {
				local25 = arg4.method183();
				local118 = arg4.method155();
				local168 = arg4.method176();
				@Pc(354) int local354 = arg4.anInt301;
				if (arg1.aString3 != null && arg1.aBoolean31) {
					@Pc(364) long local364 = Class20.method319(arg1.aString3);
					@Pc(366) boolean local366 = false;
					if (local118 <= 1) {
						for (@Pc(371) int local371 = 0; local371 < this.anInt893; local371++) {
							if (this.aLongArray4[local371] == local364) {
								local366 = true;
								break;
							}
						}
					}
					if (!local366 && this.anInt980 == 0) {
						try {
							this.aClass1_Sub1_Sub3_6.anInt301 = 0;
							arg4.method164(this.anInt971, this.aClass1_Sub1_Sub3_6.aByteArray2, local168);
							this.aClass1_Sub1_Sub3_6.anInt301 = 0;
							@Pc(417) String local417 = Class15.method283(anInt901, this.aClass1_Sub1_Sub3_6, local168);
							@Pc(421) String local421 = Class30.method447(local417);
							arg1.aString6 = local421;
							arg1.anInt457 = local25 >> 8;
							arg1.anInt431 = local25 & 0xFF;
							arg1.anInt470 = 150;
							if (local118 == 2 || local118 == 3) {
								this.method649(1, "@cr2@" + arg1.aString3, local421);
							} else if (local118 == 1) {
								this.method649(1, "@cr1@" + arg1.aString3, local421);
							} else {
								this.method649(2, arg1.aString3, local421);
							}
						} catch (@Pc(485) Exception local485) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg4.anInt301 = local354 + local168;
			}
			if ((arg0 & 0x10) != 0) {
				arg1.anInt459 = arg4.method185();
				if (arg1.anInt459 == 65535) {
					arg1.anInt459 = -1;
				}
			}
			if ((arg0 & 0x1) != 0) {
				arg1.anInt466 = arg4.method184();
				arg1.anInt467 = arg4.method184();
			}
		} catch (@Pc(525) RuntimeException local525) {
			signlink.reporterror("13841, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local525.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean219) {
			this.method596();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method712() {
		try {
			@Pc(18) int local18;
			@Pc(25) int local25;
			if (this.anInt919 == 0) {
				local18 = super.anInt844 / 2 - 80;
				local25 = super.anInt845 / 2 + 20;
				local25 += 20;
				if (super.anInt853 == 1 && super.anInt854 >= local18 - 75 && super.anInt854 <= local18 + 75 && super.anInt855 >= local25 - 20 && super.anInt855 <= local25 + 20) {
					this.anInt919 = 3;
					this.anInt909 = 0;
				}
				local18 = super.anInt844 / 2 + 80;
				if (super.anInt853 == 1 && super.anInt854 >= local18 - 75 && super.anInt854 <= local18 + 75 && super.anInt855 >= local25 - 20 && super.anInt855 <= local25 + 20) {
					this.aString28 = "";
					this.aString29 = "Enter your username & password.";
					this.anInt919 = 2;
					this.anInt909 = 0;
				}
			} else if (this.anInt919 == 2) {
				local18 = super.anInt845 / 2 - 40;
				local18 += 30;
				local18 += 25;
				if (super.anInt853 == 1 && super.anInt855 >= local18 - 15 && super.anInt855 < local18) {
					this.anInt909 = 0;
				}
				local18 += 15;
				if (super.anInt853 == 1 && super.anInt855 >= local18 - 15 && super.anInt855 < local18) {
					this.anInt909 = 1;
				}
				local18 += 15;
				local25 = super.anInt844 / 2 - 80;
				@Pc(171) int local171 = super.anInt845 / 2 + 50;
				@Pc(172) int local172 = local171 + 20;
				if (super.anInt853 == 1 && super.anInt854 >= local25 - 75 && super.anInt854 <= local25 + 75 && super.anInt855 >= local172 - 20 && super.anInt855 <= local172 + 20) {
					this.anInt936 = 0;
					this.method713(this.aString19, this.aString20, false);
					if (this.aBoolean216) {
						return;
					}
				}
				local25 = super.anInt844 / 2 + 80;
				if (super.anInt853 == 1 && super.anInt854 >= local25 - 75 && super.anInt854 <= local25 + 75 && super.anInt855 >= local172 - 20 && super.anInt855 <= local172 + 20) {
					this.anInt919 = 0;
					this.aString19 = "";
					this.aString20 = "";
				}
				while (true) {
					while (true) {
						@Pc(262) int local262 = this.method580();
						if (local262 == -1) {
							return;
						}
						@Pc(267) boolean local267 = false;
						for (@Pc(269) int local269 = 0; local269 < aString27.length(); local269++) {
							if (local262 == aString27.charAt(local269)) {
								local267 = true;
								break;
							}
						}
						if (this.anInt909 == 0) {
							if (local262 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							}
							if (local262 == 9 || local262 == 10 || local262 == 13) {
								this.anInt909 = 1;
							}
							if (local267) {
								this.aString19 = this.aString19 + (char) local262;
							}
							if (this.aString19.length() > 12) {
								this.aString19 = this.aString19.substring(0, 12);
							}
						} else if (this.anInt909 == 1) {
							if (local262 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
							}
							if (local262 == 9 || local262 == 10 || local262 == 13) {
								this.anInt909 = 0;
							}
							if (local267) {
								this.aString20 = this.aString20 + (char) local262;
							}
							if (this.aString20.length() > 20) {
								this.aString20 = this.aString20.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt919 == 3) {
				local18 = super.anInt844 / 2;
				local25 = super.anInt845 / 2 + 50;
				@Pc(426) int local426 = local25 + 20;
				if (super.anInt853 == 1 && super.anInt854 >= local18 - 75 && super.anInt854 <= local18 + 75 && super.anInt855 >= local426 - 20 && super.anInt855 <= local426 + 20) {
					this.anInt919 = 0;
					return;
				}
			}
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("54019, " + 0 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method713(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString28 = "";
				this.aString29 = "Connecting to server...";
				this.method660(true);
			}
			this.aClass33_1 = new Class33(this, this.method671(anInt887 + 43594), 309);
			@Pc(30) long local30 = Class20.method319(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_7.anInt301 = 0;
			this.aClass1_Sub1_Sub3_7.method145(14);
			this.aClass1_Sub1_Sub3_7.method145(local37);
			this.aClass33_1.method487(2, this.aClass1_Sub1_Sub3_7.aByteArray2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass33_1.method484();
			}
			@Pc(74) int local74 = this.aClass33_1.method484();
			@Pc(76) int local76 = local74;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass33_1.method486(this.aClass1_Sub1_Sub3_8.aByteArray2, 0, 8);
				this.aClass1_Sub1_Sub3_8.anInt301 = 0;
				this.aLong29 = this.aClass1_Sub1_Sub3_8.method161(this.anInt1075);
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass1_Sub1_Sub3_7.anInt301 = 0;
				this.aClass1_Sub1_Sub3_7.method145(10);
				this.aClass1_Sub1_Sub3_7.method149(local100[0]);
				this.aClass1_Sub1_Sub3_7.method149(local100[1]);
				this.aClass1_Sub1_Sub3_7.method149(local100[2]);
				this.aClass1_Sub1_Sub3_7.method149(local100[3]);
				this.aClass1_Sub1_Sub3_7.method149(signlink.anInt1097);
				this.aClass1_Sub1_Sub3_7.method152(arg0);
				this.aClass1_Sub1_Sub3_7.method152(arg1);
				this.aClass1_Sub1_Sub3_7.method170(aBigInteger1, aBigInteger2);
				this.aClass1_Sub1_Sub3_9.anInt301 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_9.method145(18);
				} else {
					this.aClass1_Sub1_Sub3_9.method145(16);
				}
				this.aClass1_Sub1_Sub3_9.method145(this.aClass1_Sub1_Sub3_7.anInt301 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_9.method145(255);
				this.aClass1_Sub1_Sub3_9.method146(371);
				this.aClass1_Sub1_Sub3_9.method145(aBoolean191 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass1_Sub1_Sub3_9.method149(this.anIntArray265[local226]);
				}
				this.aClass1_Sub1_Sub3_9.method153(this.aClass1_Sub1_Sub3_7.aByteArray2, this.aClass1_Sub1_Sub3_7.anInt301);
				this.aClass1_Sub1_Sub3_7.aClass39_1 = new Class39(true, local100);
				for (local260 = 0; local260 < 4; local260++) {
					local100[local260] += 50;
				}
				this.aClass39_2 = new Class39(true, local100);
				this.aClass33_1.method487(this.aClass1_Sub1_Sub3_9.anInt301, this.aClass1_Sub1_Sub3_9.aByteArray2);
				local74 = this.aClass33_1.method484();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method713(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local74 == 2) {
					this.anInt1049 = this.aClass33_1.method484();
					aBoolean220 = this.aClass33_1.method484() == 1;
					this.aLong30 = 0L;
					this.anInt1011 = 0;
					this.aClass26_1.anInt614 = 0;
					super.aBoolean183 = true;
					this.aBoolean209 = true;
					this.aBoolean216 = true;
					this.aClass1_Sub1_Sub3_7.anInt301 = 0;
					this.aClass1_Sub1_Sub3_8.anInt301 = 0;
					this.anInt992 = -1;
					this.anInt883 = -1;
					this.anInt884 = -1;
					this.anInt885 = -1;
					this.anInt991 = 0;
					this.anInt993 = 0;
					this.anInt1023 = 0;
					this.anInt995 = 0;
					this.anInt966 = 0;
					this.anInt1054 = 0;
					this.aBoolean225 = false;
					super.anInt846 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray12[local390] = null;
					}
					this.anInt862 = 0;
					this.anInt1091 = 0;
					this.anInt928 = 0;
					this.anInt1040 = 0;
					this.anInt1012 = (int) (Math.random() * 100.0D) - 50;
					this.anInt875 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1066 = (int) (Math.random() * 80.0D) - 40;
					this.anInt878 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1042 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1000 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt895 = 0;
					this.anInt1080 = -1;
					this.anInt1052 = 0;
					this.anInt1053 = 0;
					this.anInt906 = 0;
					this.anInt920 = 0;
					for (local226 = 0; local226 < this.anInt904; local226++) {
						this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local226] = null;
						this.aClass1_Sub1_Sub3Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local260] = null;
					}
					aClass1_Sub1_Sub1_Sub2_Sub1_1 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anInt905] = new Class1_Sub1_Sub1_Sub2_Sub1();
					this.aClass6_12.method101();
					this.aClass6_10.method101();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass6ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass6_11 = new Class6((byte) 5);
					this.anInt952 = 0;
					this.anInt951 = 0;
					this.method716(this.anInt990);
					this.anInt990 = -1;
					this.method716(this.anInt911);
					this.anInt911 = -1;
					this.method716(this.anInt998);
					this.anInt998 = -1;
					this.method716(this.anInt1085);
					this.anInt1085 = -1;
					this.method716(this.anInt882);
					this.anInt882 = -1;
					this.method716(this.anInt954);
					this.anInt954 = -1;
					this.method716(this.anInt996);
					this.anInt996 = -1;
					this.aBoolean224 = false;
					this.anInt965 = 3;
					this.anInt1041 = 0;
					this.aBoolean225 = false;
					this.aBoolean208 = false;
					this.aString17 = null;
					this.anInt938 = 0;
					this.anInt894 = -1;
					this.aBoolean226 = true;
					this.method715((byte) 1);
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray222[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray8[local539] = null;
						this.aBooleanArray11[local539] = false;
					}
					anInt972 = 0;
					anInt953 = 0;
					anInt1070 = 0;
					anInt889 = 0;
					anInt914 = 0;
					anInt985 = 0;
					anInt959 = 0;
					this.method646((byte) 9);
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
					this.aBoolean216 = true;
					this.aClass1_Sub1_Sub3_7.anInt301 = 0;
					this.aClass1_Sub1_Sub3_8.anInt301 = 0;
					this.anInt992 = -1;
					this.anInt883 = -1;
					this.anInt884 = -1;
					this.anInt885 = -1;
					this.anInt991 = 0;
					this.anInt993 = 0;
					this.anInt1023 = 0;
					this.anInt1054 = 0;
					this.aBoolean225 = false;
					this.aLong32 = System.currentTimeMillis();
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
					local390 = this.aClass33_1.method484();
					for (@Pc(908) int local908 = local390 + 3; local908 >= 0; local908--) {
						this.aString28 = "You have only just left another world";
						this.aString29 = "Your profile will be transferred in: " + local908;
						this.method660(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(930) Exception local930) {
						}
					}
					this.method713(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString28 = "Malformed login packet.";
					this.aString29 = "Please try again.";
				} else if (local74 == 23) {
					this.aString28 = "No reply from loginserver.";
					this.aString29 = "Please try again.";
				} else if (local74 == 24) {
					this.aString28 = "Error loading your profile.";
					this.aString29 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString28 = "Unexpected loginserver response.";
					this.aString29 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString28 = "This computers address has been blocked";
					this.aString29 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString28 = "Unexpected server response";
					this.aString29 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString28 = "No response from server";
					this.aString29 = "Please try using a different world.";
				} else if (this.anInt936 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1002) Exception local1002) {
					}
					this.anInt936++;
					this.method713(arg0, arg1, arg2);
				} else {
					this.aString28 = "No response from loginserver";
					this.aString29 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1045) IOException local1045) {
			this.aString28 = "";
			this.aString29 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method715(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aBoolean207 = true;
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				this.anIntArray221[local16] = -1;
				for (@Pc(25) int local25 = 0; local25 < Class49.anInt832; local25++) {
					if (!Class49.aClass49Array1[local25].aBoolean176 && Class49.aClass49Array1[local25].anInt833 == local16 + (this.aBoolean226 ? 0 : 7)) {
						this.anIntArray221[local16] = local25;
						break;
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("99533, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method716(@OriginalArg(1) int arg0) {
		try {
			Class43.method509(arg0);
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("93832, " + false + ", " + arg0 + ", " + local7.toString());
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
				return new URL("http://127.0.0.1:" + (anInt887 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!VTUPBFSN;BIII)V")
	private void method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class43 arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (arg3.anInt759 == 0 && arg3.anIntArray184 != null && !arg3.aBoolean148 && (arg2 >= arg5 && arg6 >= arg7 && arg2 <= arg5 + arg3.anInt742 && arg6 <= arg7 + arg3.anInt727)) {
				@Pc(34) int local34 = arg3.anIntArray184.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg3.anIntArray186[local36] + arg5;
					@Pc(54) int local54 = arg3.anIntArray187[local36] + arg7 - arg1;
					@Pc(60) Class43 local60 = Class43.method515(arg3.anIntArray184[local36]);
					@Pc(65) int local65 = local45 + local60.anInt745;
					@Pc(70) int local70 = local54 + local60.anInt737;
					if ((local60.anInt730 >= 0 || local60.anInt758 != 0) && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt742 && arg6 < local70 + local60.anInt727) {
						if (local60.anInt730 >= 0) {
							this.anInt1037 = local60.anInt730;
						} else {
							this.anInt1037 = local60.anInt755;
						}
					}
					if (local60.anInt759 == 8 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt742 && arg6 < local70 + local60.anInt727) {
						this.anInt1082 = local60.anInt755;
					}
					if (local60.anInt759 == 0) {
						this.method717(arg0, local60.anInt738, arg2, local60, (byte) 4, local65, arg6, local70);
						if (local60.anInt724 > local60.anInt727) {
							this.method594(local70, local60, arg6, arg2, arg0, local60.anInt724, local65 + local60.anInt742, local60.anInt727);
						}
					} else {
						if (local60.anInt723 == 1 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt742 && arg6 < local70 + local60.anInt727) {
							@Pc(194) boolean local194 = false;
							if (local60.anInt725 != 0) {
								local194 = this.method616(local60);
							}
							if (!local194) {
								this.aStringArray9[this.anInt1054] = local60.aString10;
								this.anIntArray216[this.anInt1054] = 715;
								this.anIntArray215[this.anInt1054] = local60.anInt755;
								this.anInt1054++;
							}
						}
						if (local60.anInt723 == 2 && this.anInt1091 == 0 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt742 && arg6 < local70 + local60.anInt727) {
							@Pc(258) String local258 = local60.aString12;
							if (local258.indexOf(" ") != -1) {
								local258 = local258.substring(0, local258.indexOf(" "));
							}
							this.aStringArray9[this.anInt1054] = local258 + " @gre@" + local60.aString14;
							this.anIntArray216[this.anInt1054] = 925;
							this.anIntArray215[this.anInt1054] = local60.anInt755;
							this.anInt1054++;
						}
						if (local60.anInt723 == 3 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt742 && arg6 < local70 + local60.anInt727) {
							this.aStringArray9[this.anInt1054] = "Close";
							if (arg0 == 3) {
								this.anIntArray216[this.anInt1054] = 937;
							} else {
								this.anIntArray216[this.anInt1054] = 892;
							}
							this.anIntArray215[this.anInt1054] = local60.anInt755;
							this.anInt1054++;
						}
						if (local60.anInt723 == 4 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt742 && arg6 < local70 + local60.anInt727) {
							this.aStringArray9[this.anInt1054] = local60.aString10;
							this.anIntArray216[this.anInt1054] = 229;
							this.anIntArray215[this.anInt1054] = local60.anInt755;
							this.anInt1054++;
						}
						if (local60.anInt723 == 5 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt742 && arg6 < local70 + local60.anInt727) {
							this.aStringArray9[this.anInt1054] = local60.aString10;
							this.anIntArray216[this.anInt1054] = 80;
							this.anIntArray215[this.anInt1054] = local60.anInt755;
							this.anInt1054++;
						}
						if (local60.anInt723 == 6 && !this.aBoolean224 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt742 && arg6 < local70 + local60.anInt727) {
							this.aStringArray9[this.anInt1054] = local60.aString10;
							this.anIntArray216[this.anInt1054] = 328;
							this.anIntArray215[this.anInt1054] = local60.anInt755;
							this.anInt1054++;
						}
						if (local60.anInt759 == 2) {
							@Pc(517) int local517 = 0;
							for (@Pc(519) int local519 = 0; local519 < local60.anInt727; local519++) {
								for (@Pc(523) int local523 = 0; local523 < local60.anInt742; local523++) {
									@Pc(534) int local534 = local65 + local523 * (local60.anInt760 + 32);
									@Pc(543) int local543 = local70 + local519 * (local60.anInt739 + 32);
									if (local517 < 20) {
										local534 += local60.anIntArray188[local517];
										local543 += local60.anIntArray185[local517];
									}
									if (arg2 >= local534 && arg6 >= local543 && arg2 < local534 + 32 && arg6 < local543 + 32) {
										this.anInt969 = local517;
										this.anInt970 = local60.anInt755;
										if (local60.anIntArray190[local517] > 0) {
											@Pc(596) Class19 local596 = Class19.method315(local60.anIntArray190[local517] - 1);
											if (this.anInt862 == 1 && local60.aBoolean156) {
												if (local60.anInt755 != this.anInt864 || local517 != this.anInt863) {
													this.aStringArray9[this.anInt1054] = "Use " + this.aString18 + " with @lre@" + local596.aString7;
													this.anIntArray216[this.anInt1054] = 403;
													this.anIntArray217[this.anInt1054] = local596.anInt492;
													this.anIntArray214[this.anInt1054] = local517;
													this.anIntArray215[this.anInt1054] = local60.anInt755;
													this.anInt1054++;
												}
											} else if (this.anInt1091 != 1 || !local60.aBoolean156) {
												@Pc(733) int local733;
												if (local60.aBoolean156) {
													for (local733 = 4; local733 >= 3; local733--) {
														if (local596.aStringArray2 != null && local596.aStringArray2[local733] != null) {
															this.aStringArray9[this.anInt1054] = local596.aStringArray2[local733] + " @lre@" + local596.aString7;
															if (local733 == 3) {
																this.anIntArray216[this.anInt1054] = 484;
															}
															if (local733 == 4) {
																this.anIntArray216[this.anInt1054] = 851;
															}
															this.anIntArray217[this.anInt1054] = local596.anInt492;
															this.anIntArray214[this.anInt1054] = local517;
															this.anIntArray215[this.anInt1054] = local60.anInt755;
															this.anInt1054++;
														} else if (local733 == 4) {
															this.aStringArray9[this.anInt1054] = "Drop @lre@" + local596.aString7;
															this.anIntArray216[this.anInt1054] = 851;
															this.anIntArray217[this.anInt1054] = local596.anInt492;
															this.anIntArray214[this.anInt1054] = local517;
															this.anIntArray215[this.anInt1054] = local60.anInt755;
															this.anInt1054++;
														}
													}
												}
												if (local60.aBoolean149) {
													this.aStringArray9[this.anInt1054] = "Use @lre@" + local596.aString7;
													this.anIntArray216[this.anInt1054] = 988;
													this.anIntArray217[this.anInt1054] = local596.anInt492;
													this.anIntArray214[this.anInt1054] = local517;
													this.anIntArray215[this.anInt1054] = local60.anInt755;
													this.anInt1054++;
												}
												if (local60.aBoolean156 && local596.aStringArray2 != null) {
													for (local733 = 2; local733 >= 0; local733--) {
														if (local596.aStringArray2[local733] != null) {
															this.aStringArray9[this.anInt1054] = local596.aStringArray2[local733] + " @lre@" + local596.aString7;
															if (local733 == 0) {
																this.anIntArray216[this.anInt1054] = 599;
															}
															if (local733 == 1) {
																this.anIntArray216[this.anInt1054] = 689;
															}
															if (local733 == 2) {
																this.anIntArray216[this.anInt1054] = 533;
															}
															this.anIntArray217[this.anInt1054] = local596.anInt492;
															this.anIntArray214[this.anInt1054] = local517;
															this.anIntArray215[this.anInt1054] = local60.anInt755;
															this.anInt1054++;
														}
													}
												}
												if (local60.aStringArray6 != null) {
													for (local733 = 4; local733 >= 0; local733--) {
														if (local60.aStringArray6[local733] != null) {
															this.aStringArray9[this.anInt1054] = local60.aStringArray6[local733] + " @lre@" + local596.aString7;
															if (local733 == 0) {
																this.anIntArray216[this.anInt1054] = 254;
															}
															if (local733 == 1) {
																this.anIntArray216[this.anInt1054] = 767;
															}
															if (local733 == 2) {
																this.anIntArray216[this.anInt1054] = 858;
															}
															if (local733 == 3) {
																this.anIntArray216[this.anInt1054] = 22;
															}
															if (local733 == 4) {
																this.anIntArray216[this.anInt1054] = 974;
															}
															this.anIntArray217[this.anInt1054] = local596.anInt492;
															this.anIntArray214[this.anInt1054] = local517;
															this.anIntArray215[this.anInt1054] = local60.anInt755;
															this.anInt1054++;
														}
													}
												}
												this.aStringArray9[this.anInt1054] = "Examine @lre@" + local596.aString7;
												this.anIntArray216[this.anInt1054] = 1695;
												this.anIntArray217[this.anInt1054] = local596.anInt492;
												this.anIntArray214[this.anInt1054] = local517;
												this.anIntArray215[this.anInt1054] = local60.anInt755;
												this.anInt1054++;
											} else if ((this.anInt1093 & 0x10) == 16) {
												this.aStringArray9[this.anInt1054] = this.aString30 + " @lre@" + local596.aString7;
												this.anIntArray216[this.anInt1054] = 139;
												this.anIntArray217[this.anInt1054] = local596.anInt492;
												this.anIntArray214[this.anInt1054] = local517;
												this.anIntArray215[this.anInt1054] = local60.anInt755;
												this.anInt1054++;
											}
										}
									}
									local517++;
								}
							}
						}
					}
				}
				@Pc(1166) boolean local1166 = false;
			}
		} catch (@Pc(1172) RuntimeException local1172) {
			signlink.reporterror("21574, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
	private void method718() {
		try {
			this.aClass48_22.method555();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt895 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub4_14.aByteArray11;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray86;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_8.method133(33, this.anIntArray226, 0, 25, 33, this.anIntArray240, 256, 0, this.anInt1000, 25);
				this.aClass48_23.method555();
				Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
			} else {
				@Pc(67) int local67 = this.anInt1000 + this.anInt878 & 0x7FF;
				@Pc(74) int local74 = aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
				this.aClass1_Sub1_Sub2_Sub2_13.method133(146, this.anIntArray220, 25, local74, 151, this.anIntArray248, this.anInt1042 + 256, 5, local67, local18);
				this.aClass1_Sub1_Sub2_Sub2_8.method133(33, this.anIntArray226, 0, 25, 33, this.anIntArray240, 256, 0, this.anInt1000, 25);
				for (local20 = 0; local20 < this.anInt1024; local20++) {
					local74 = this.anIntArray263[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32;
					local18 = this.anIntArray264[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
					this.method721(local18, local74, this.aClass1_Sub1_Sub2_Sub2Array5[local20]);
				}
				@Pc(169) int local169;
				for (@Pc(165) int local165 = 0; local165 < 104; local165++) {
					for (local169 = 0; local169 < 104; local169++) {
						@Pc(181) Class6 local181 = this.aClass6ArrayArrayArray1[this.anInt918][local165][local169];
						if (local181 != null) {
							local74 = local165 * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32;
							local18 = local169 * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
							this.method721(local18, local74, this.aClass1_Sub1_Sub2_Sub2_3);
						}
					}
				}
				for (local169 = 0; local169 < this.anInt920; local169++) {
					@Pc(232) Class1_Sub1_Sub1_Sub2_Sub2 local232 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray227[local169]];
					if (local232 != null && local232.method302(772)) {
						@Pc(241) Class31 local241 = local232.aClass31_2;
						if (local241.anIntArray147 != null) {
							local241 = local241.method475(863);
						}
						if (local241 != null && local241.aBoolean131 && local241.aBoolean132) {
							local74 = local232.anInt428 / 32 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32;
							local18 = local232.anInt429 / 32 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
							this.method721(local18, local74, this.aClass1_Sub1_Sub2_Sub2_4);
						}
					}
				}
				@Pc(300) Class1_Sub1_Sub1_Sub2_Sub1 local300;
				for (@Pc(290) int local290 = 0; local290 < this.anInt906; local290++) {
					local300 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray223[local290]];
					if (local300 != null && local300.method302(772)) {
						local74 = local300.anInt428 / 32 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32;
						local18 = local300.anInt429 / 32 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
						@Pc(328) boolean local328 = false;
						@Pc(332) long local332 = Class20.method319(local300.aString3);
						for (@Pc(334) int local334 = 0; local334 < this.anInt951; local334++) {
							if (local332 == this.aLongArray3[local334] && this.anIntArray213[local334] != 0) {
								local328 = true;
								break;
							}
						}
						@Pc(359) boolean local359 = false;
						if (aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt193 != 0 && local300.anInt193 != 0 && aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt193 == local300.anInt193) {
							local359 = true;
						}
						if (local328) {
							this.method721(local18, local74, this.aClass1_Sub1_Sub2_Sub2_6);
						} else if (local359) {
							this.method721(local18, local74, this.aClass1_Sub1_Sub2_Sub2_7);
						} else {
							this.method721(local18, local74, this.aClass1_Sub1_Sub2_Sub2_5);
						}
					}
				}
				if (this.anInt966 != 0 && anInt1079 % 20 < 10) {
					if (this.anInt966 == 1 && this.anInt939 >= 0 && this.anInt939 < this.aClass1_Sub1_Sub1_Sub2_Sub2Array1.length) {
						@Pc(433) Class1_Sub1_Sub1_Sub2_Sub2 local433 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anInt939];
						if (local433 != null) {
							local74 = local433.anInt428 / 32 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32;
							local18 = local433.anInt429 / 32 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
							this.method678(this.aClass1_Sub1_Sub2_Sub2_17, local74, local18);
						}
					}
					if (this.anInt966 == 2) {
						local74 = (this.anInt931 - this.anInt945) * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32;
						local18 = (this.anInt932 - this.anInt946) * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
						this.method678(this.aClass1_Sub1_Sub2_Sub2_17, local74, local18);
					}
					if (this.anInt966 == 10 && this.anInt874 >= 0 && this.anInt874 < this.aClass1_Sub1_Sub1_Sub2_Sub1Array1.length) {
						local300 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anInt874];
						if (local300 != null) {
							local74 = local300.anInt428 / 32 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32;
							local18 = local300.anInt429 / 32 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
							this.method678(this.aClass1_Sub1_Sub2_Sub2_17, local74, local18);
						}
					}
				}
				if (this.anInt1052 != 0) {
					local74 = this.anInt1052 * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 / 32;
					local18 = this.anInt1053 * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 / 32;
					this.method721(local18, local74, this.aClass1_Sub1_Sub2_Sub2_16);
				}
				Class1_Sub1_Sub2.method351(97, 3, 16777215, 78, 3);
				this.aClass48_23.method555();
				Class1_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray245;
				this.anInt991 += 0;
			}
		} catch (@Pc(607) RuntimeException local607) {
			signlink.reporterror("29025, " + 0 + ", " + local607.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
	private int method719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) int local9 = arg1 >> 7;
			@Pc(13) int local13 = arg2 >> 7;
			if (local9 < 0 || local13 < 0 || local9 > 103 || local13 > 103) {
				return 0;
			}
			@Pc(27) int local27 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray8[1][local9][local13] & 0x2) == 2) {
				local27 = arg0 + 1;
			}
			@Pc(47) int local47 = arg1 & 0x7F;
			@Pc(51) int local51 = arg2 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray8[local27][local9][local13] * (128 - local47) + this.anIntArrayArrayArray8[local27][local9 + 1][local13] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray8[local27][local9][local13 + 1] * (128 - local47) + this.anIntArrayArrayArray8[local27][local9 + 1][local13 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("91701, " + -28 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method720(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("98392, " + arg0 + ", " + arg1 + ", " + -206 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!EFVUNBHT;I)V")
	private void method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg2) {
		try {
			if (arg2 != null) {
				@Pc(10) int local10 = this.anInt1000 + this.anInt878 & 0x7FF;
				@Pc(18) int local18 = arg1 * arg1 + arg0 * arg0;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class1_Sub1_Sub1_Sub5.anIntArray126[local10];
					@Pc(30) int local30 = Class1_Sub1_Sub1_Sub5.anIntArray127[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt1042 + 256);
					@Pc(57) int local57 = local30 * 256 / (this.anInt1042 + 256);
					@Pc(67) int local67 = arg0 * local39 + arg1 * local57 >> 16;
					@Pc(77) int local77 = arg0 * local57 - arg1 * local39 >> 16;
					if (local18 > 2500) {
						arg2.method135(this.aClass1_Sub1_Sub2_Sub4_14, local67 + 94 + 4 - arg2.anInt286 / 2, 83 - local77 - arg2.anInt287 / 2 - 4);
					} else {
						arg2.method129(local67 + 94 + 4 - arg2.anInt286 / 2, 83 - local77 - arg2.anInt287 / 2 - 4);
					}
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("52440, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 945 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method723(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt951 >= 100 && this.anInt950 != 1) {
					this.method649(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt951 >= 200) {
					this.method649(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(39) String local39 = Class20.method323(this.aBoolean201, Class20.method320(arg0));
					for (@Pc(41) int local41 = 0; local41 < this.anInt951; local41++) {
						if (this.aLongArray3[local41] == arg0) {
							this.method649(0, "", local39 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(71) int local71 = 0; local71 < this.anInt893; local71++) {
						if (this.aLongArray4[local71] == arg0) {
							this.method649(0, "", "Please remove " + local39 + " from your ignore list first");
							return;
						}
					}
					if (!local39.equals(aClass1_Sub1_Sub1_Sub2_Sub1_1.aString3)) {
						this.aStringArray14[this.anInt951] = local39;
						this.aLongArray3[this.anInt951] = arg0;
						this.anIntArray213[this.anInt951] = 0;
						this.anInt951++;
						this.aBoolean200 = true;
						this.aBoolean216 &= true;
						this.aClass1_Sub1_Sub3_7.method144(169);
						this.aClass1_Sub1_Sub3_7.method151(arg0);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("35975, " + true + ", " + arg0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "S", descriptor = "(I)V")
	private void method724(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt992 = -1;
			}
			try {
				@Pc(12) int local12 = aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 + this.anInt1012;
				@Pc(18) int local18 = aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 + this.anInt875;
				if (this.anInt925 - local12 < -500 || this.anInt925 - local12 > 500 || this.anInt926 - local18 < -500 || this.anInt926 - local18 > 500) {
					this.anInt925 = local12;
					this.anInt926 = local18;
				}
				if (this.anInt925 != local12) {
					this.anInt925 += (local12 - this.anInt925) / 16;
				}
				if (this.anInt926 != local18) {
					this.anInt926 += (local18 - this.anInt926) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1001 += (-this.anInt1001 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1001 += (24 - this.anInt1001) / 2;
				} else {
					this.anInt1001 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1002 += (12 - this.anInt1002) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1002 += (-this.anInt1002 - 12) / 2;
				} else {
					this.anInt1002 /= 2;
				}
				this.anInt1000 = this.anInt1000 + this.anInt1001 / 2 & 0x7FF;
				this.anInt999 += this.anInt1002 / 2;
				if (this.anInt999 < 128) {
					this.anInt999 = 128;
				}
				if (this.anInt999 > 383) {
					this.anInt999 = 383;
				}
				anInt967++;
				if (anInt967 > 87) {
					anInt967 = 0;
					this.aClass1_Sub1_Sub3_7.method144(126);
				}
				@Pc(219) int local219 = this.anInt925 >> 7;
				@Pc(224) int local224 = this.anInt926 >> 7;
				@Pc(234) int local234 = this.method719(this.anInt918, this.anInt925, this.anInt926);
				@Pc(236) int local236 = 0;
				@Pc(252) int local252;
				if (local219 > 3 && local224 > 3 && local219 < 100 && local224 < 100) {
					for (local252 = local219 - 4; local252 <= local219 + 4; local252++) {
						for (@Pc(258) int local258 = local224 - 4; local258 <= local224 + 4; local258++) {
							@Pc(263) int local263 = this.anInt918;
							if (local263 < 3 && (this.aByteArrayArrayArray8[1][local252][local258] & 0x2) == 2) {
								local263++;
							}
							@Pc(290) int local290 = local234 - this.anIntArrayArrayArray8[local263][local252][local258];
							if (local290 > local236) {
								local236 = local290;
							}
						}
					}
				}
				anInt1084++;
				if (anInt1084 > 1173) {
					anInt1084 = 0;
					this.aClass1_Sub1_Sub3_7.method144(51);
					this.aClass1_Sub1_Sub3_7.method145(0);
					local252 = this.aClass1_Sub1_Sub3_7.anInt301;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_7.method145(121);
					}
					this.aClass1_Sub1_Sub3_7.method146(18414);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_7.method146(40463);
					}
					this.aClass1_Sub1_Sub3_7.method145(204);
					this.aClass1_Sub1_Sub3_7.method146((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_7.method145(234);
					this.aClass1_Sub1_Sub3_7.method146(21482);
					this.aClass1_Sub1_Sub3_7.method145((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_7.method146(51762);
					this.aClass1_Sub1_Sub3_7.method145((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_7.method154(this.aClass1_Sub1_Sub3_7.anInt301 - local252);
				}
				local252 = local236 * 192;
				if (local252 > 98048) {
					local252 = 98048;
				}
				if (local252 < 32768) {
					local252 = 32768;
				}
				if (local252 > this.anInt1035) {
					this.anInt1035 += (local252 - this.anInt1035) / 24;
				} else if (local252 < this.anInt1035) {
					this.anInt1035 += (local252 - this.anInt1035) / 80;
				}
			} catch (@Pc(444) Exception local444) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt428 + "," + aClass1_Sub1_Sub1_Sub2_Sub1_1.anInt429 + "," + this.anInt925 + "," + this.anInt926 + "," + this.anInt1044 + "," + this.anInt1045 + "," + this.anInt945 + "," + this.anInt946);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("51703, " + arg0 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "T", descriptor = "(I)Z")
	private boolean method725() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("59862, " + 0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "U", descriptor = "(I)V")
	private void method726() {
		try {
			if (aBoolean191 && this.anInt928 == 2 && Class29.anInt629 != this.anInt918) {
				this.method627("Loading - please wait.", null);
				this.anInt928 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt928 == 1) {
				@Pc(37) int local37 = this.method727();
				if (local37 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString19 + " glcfb " + this.aLong29 + "," + local37 + "," + aBoolean191 + "," + this.aClass8Array1[0] + "," + this.aClass12_Sub1_1.method547() + "," + this.anInt918 + "," + this.anInt1044 + "," + this.anInt1045);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt928 == 2 && this.anInt918 != this.anInt1080) {
				this.anInt1080 = this.anInt918;
				this.method692(this.anInt918);
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("54498, " + -596 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "V", descriptor = "(I)I")
	private int method727() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray250[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray251[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray6.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray249[local41] >> 8) * 64 - this.anInt945;
					@Pc(74) int local74 = (this.anIntArray249[local41] & 0xFF) * 64 - this.anInt946;
					if (this.aBoolean221) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class29.method421(local62, local74, local48, this.anInt917);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean187) {
				return -4;
			} else {
				this.anInt928 = 2;
				Class29.anInt629 = this.anInt918;
				this.method701();
				this.aClass1_Sub1_Sub3_7.method144(18);
				return 0;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("46876, " + -831 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}
}
