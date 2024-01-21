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
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private static int anInt862;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private static int anInt872;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private static int anInt877;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private static int anInt879;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private static int anInt883;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Z")
	private static boolean aBoolean201;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private static int anInt909;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private static int anInt910;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Z")
	private static boolean aBoolean208;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private static int anInt933;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private static int anInt936;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!OTTYZSZE;")
	public static Class1_Sub1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private static int anInt943;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	public static int anInt969;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private static int anInt970;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private static int anInt981;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private static int anInt1014;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private static int anInt1017;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private static int anInt1047;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private static int anInt1051;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private static int[] anIntArray212 = new int[99];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "B")
	private static byte aByte46;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private static int anInt967;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private static int anInt968;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
	private static boolean aBoolean221;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Ljava/lang/String;")
	private static String aString22;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Z")
	private static boolean aBoolean230;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private static int anInt991;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
	public static final int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!UMCYZJWP;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!UMCYZJWP;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!UMCYZJWP;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!UMCYZJWP;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_3;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_4;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_5;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!EUCYOSVT;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!ADZBQDSQ;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!KALHRUDX;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!JUGCSXVJ;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_6;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_7;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_8;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_9;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_10;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_11;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_12;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_13;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_14;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!SDLNXGIT;")
	private Class35_Sub1 aClass35_Sub1_1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_15;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_16;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_17;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_18;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array3;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_9;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_10;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!QKFGLETG;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_19;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_20;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_21;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_22;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_23;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_24;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_25;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_26;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!YQSLUNUN;")
	private Class50 aClass50_27;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_11;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_12;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_13;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_14;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_15;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_16;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_17;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_18;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_19;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_20;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1075;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1077;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
	private boolean aBoolean192 = true;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt864 = -27;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[[[Lclient!EWLVMFRK;")
	private Class13[][][] aClass13ArrayArrayArray1 = new Class13[4][104][104];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt866 = -1;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[Lclient!OPAHDXQS;")
	private Class31[] aClass31Array1 = new Class31[4];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt876 = 2;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray213 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt878 = -1;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
	private int[] anIntArray214 = new int[151];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "B")
	private byte aByte45 = -107;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[I")
	private int[] anIntArray215 = new int[33];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private volatile boolean aBoolean199 = false;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt894 = -1;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt897 = 5;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
	private int[] anIntArray219 = new int[Class25.anInt449];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt901 = -1;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array4 = new Class1_Sub1_Sub2_Sub4[20];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt902 = -615;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt903 = 128;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt908 = 284;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!EWLVMFRK;")
	private Class13 aClass13_10 = new Class13(aBoolean230);

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array2 = new Class1_Sub1_Sub2_Sub1[2];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt912 = 46314;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt914 = -393;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt919 = 2048;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt920 = 2047;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[Lclient!OTTYZSZE;")
	private Class1_Sub1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub1_Sub2_Sub2Array1 = new Class1_Sub1_Sub1_Sub2_Sub2[this.anInt919];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	private int[] anIntArray220 = new int[this.anInt919];

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray221 = new int[this.anInt919];

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[Lclient!XJCNBMKS;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt919];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray222 = new int[9];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray223 = new int[100];

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt925 = -1;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
	private int[] anIntArray228 = new int[2000];

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt926 = 3;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt934 = -1;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray232 = new int[33];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array5 = new Class1_Sub1_Sub2_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray233 = new int[5];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray234 = new int[500];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[I")
	private int[] anIntArray235 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray236 = new int[500];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray237 = new int[500];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt937 = -1;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "B")
	private byte aByte47 = 7;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "[I")
	private int[] anIntArray239 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt940 = -318;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray240 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray241 = new int[1000];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt944 = 284;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt954 = 1;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[I")
	private int[] anIntArray242 = new int[200];

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt960 = -1;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt961 = -1;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
	private int[] anIntArray243 = new int[5];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt962 = 3353893;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array6 = new Class1_Sub1_Sub2_Sub4[8];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!XJCNBMKS;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3((byte) 9, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "[Lclient!FSNLAIJY;")
	private Class1_Sub1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub1_Sub2_Sub1Array1 = new Class1_Sub1_Sub1_Sub2_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
	private int[] anIntArray244 = new int[16384];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "B")
	private byte aByte48 = -119;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Z")
	private volatile boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "B")
	private byte aByte49 = 7;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[I")
	private int[] anIntArray248 = new int[Class25.anInt449];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "B")
	private byte aByte50 = -18;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Z")
	private volatile boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "B")
	private byte aByte51 = -27;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt977 = -87;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt979 = -1;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[I")
	private int[] anIntArray249 = new int[50];

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	private int[] anIntArray250 = new int[4000];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray251 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt983 = 2301979;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!EWLVMFRK;")
	private Class13 aClass13_11 = new Class13(aBoolean230);

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt989 = 7759444;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt993 = 2;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt997 = 2;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt999 = 50;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[I")
	private int[] anIntArray254 = new int[this.anInt999];

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "[I")
	private int[] anIntArray255 = new int[this.anInt999];

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
	private int[] anIntArray256 = new int[this.anInt999];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	private int[] anIntArray257 = new int[this.anInt999];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray258 = new int[this.anInt999];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray259 = new int[this.anInt999];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray260 = new int[this.anInt999];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[this.anInt999];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray261 = new int[7];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!XJCNBMKS;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = Class1_Sub1_Sub3.method486();

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array7 = new Class1_Sub1_Sub2_Sub4[20];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Z")
	public boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private final int anInt1002 = 100;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[I")
	private int[] anIntArray263 = new int[100];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt1003 = 6;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!EWLVMFRK;")
	private Class13 aClass13_12 = new Class13(aBoolean230);

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray264 = new int[Class25.anInt449];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1019 = 5063219;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
	private int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray266 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1027 = 537;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[Lclient!OVNURGUS;")
	public Class33[] aClass33Array1 = new Class33[5];

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray267 = new int[5];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "B")
	private byte aByte52 = 32;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1041 = 1;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array4 = new Class1_Sub1_Sub2_Sub1[13];

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!RWLOYYVC;")
	private Class38 aClass38_1 = new Class38();

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1049 = -1;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray268 = new int[50];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1056 = 1;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1057 = 9;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1059 = -1;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private final int[] anIntArray269 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray270 = new int[151];

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1061 = 6;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1062 = -1;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1063 = 78;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!XJCNBMKS;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = Class1_Sub1_Sub3.method486();

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!XJCNBMKS;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9 = Class1_Sub1_Sub3.method486();

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "[I")
	private int[] anIntArray271 = new int[50];

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1068 = -1;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[I")
	private int[] anIntArray272 = new int[256];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[Lclient!DEITBGVL;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array5 = new Class1_Sub1_Sub2_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
	public int[] anIntArray273 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[Lclient!YGMSKJOQ;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array8 = new Class1_Sub1_Sub2_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	static {
		@Pc(4) int local4 = 0;
		@Pc(6) int local6;
		for (local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray212[local6] = local4 / 4;
		}
		aByte46 = -79;
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray229 = new int[32];
		local4 = 2;
		for (local6 = 0; local6 < 32; local6++) {
			anIntArray229[local6] = local4 - 1;
			local4 += local4;
		}
		anInt967 = 566;
		anInt968 = 10;
		aBoolean221 = true;
		aString22 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBoolean230 = true;
		anInt991 = 666;
		anIntArray262 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 321);
			if (arg0.length == 5) {
				anInt968 = Integer.parseInt(arg0[0]);
				anInt969 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method692(anInt967);
				} else if (arg0[2].equals("highmem")) {
					method643();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean221 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean221 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1080 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method567();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
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
			signlink.reporterror("99430, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private static void method643() {
		try {
			Class21.aBoolean84 = false;
			Class1_Sub1_Sub2_Sub2.aBoolean38 = false;
			aBoolean222 = false;
			Class45.aBoolean165 = false;
			Class42.aBoolean143 = false;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("89061, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method671(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(13) int local13 = local4.length() - 3; local13 > 0; local13 -= 3) {
				local4 = local4.substring(0, local13) + "," + local4.substring(local13);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("73264, " + arg0 + ", " + 0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private static void method692(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 38 / arg0;
			Class21.aBoolean84 = true;
			Class1_Sub1_Sub2_Sub2.aBoolean38 = true;
			aBoolean222 = true;
			Class45.aBoolean165 = true;
			Class42.aBoolean143 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("13518, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
	private static String method702(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("60542, " + true + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	private void method580() {
		try {
			Class42.aClass18_8.method218();
			Class42.aClass18_7.method218();
			Class27.aClass18_3.method218();
			Class5.aClass18_1.method218();
			Class5.aClass18_2.method218();
			Class1_Sub1_Sub1_Sub2_Sub2.aClass18_4.method218();
			Class48.aClass18_9.method218();
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("75185, " + -39695 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method581() {
		try {
			@Pc(20) int local20;
			for (@Pc(13) int local13 = 10; local13 < 117; local13++) {
				local20 = (int) (Math.random() * 100.0D);
				if (local20 < 50) {
					this.anIntArray252[local13 + 32512] = 255;
				}
			}
			@Pc(49) int local49;
			@Pc(56) int local56;
			@Pc(62) int local62;
			for (local20 = 0; local20 < 100; local20++) {
				local49 = (int) (Math.random() * 124.0D) + 2;
				local56 = (int) (Math.random() * 128.0D) + 128;
				local62 = local49 + (local56 << 7);
				this.anIntArray252[local62] = 192;
			}
			for (local49 = 1; local49 < 255; local49++) {
				for (local56 = 1; local56 < 127; local56++) {
					local62 = local56 + (local49 << 7);
					this.anIntArray253[local62] = (this.anIntArray252[local62 - 1] + this.anIntArray252[local62 + 1] + this.anIntArray252[local62 - 128] + this.anIntArray252[local62 + 128]) / 4;
				}
			}
			this.anInt935 += 128;
			if (this.anInt935 > this.anIntArray230.length) {
				this.anInt935 -= this.anIntArray230.length;
				local56 = (int) (Math.random() * 12.0D);
				this.method706(this.aClass1_Sub1_Sub2_Sub1Array3[local56]);
			}
			@Pc(174) int local174;
			for (local56 = 1; local56 < 255; local56++) {
				for (local62 = 1; local62 < 127; local62++) {
					local174 = local62 + (local56 << 7);
					@Pc(197) int local197 = this.anIntArray253[local174 + 128] - this.anIntArray230[local174 + this.anInt935 & this.anIntArray230.length - 1] / 5;
					if (local197 < 0) {
						local197 = 0;
					}
					this.anIntArray252[local174] = local197;
				}
			}
			for (local62 = 0; local62 < 255; local62++) {
				this.anIntArray272[local62] = this.anIntArray272[local62 + 1];
			}
			this.anIntArray272[255] = (int) (Math.sin((double) anInt987 / 14.0D) * 16.0D + Math.sin((double) anInt987 / 15.0D) * 14.0D + Math.sin((double) anInt987 / 16.0D) * 12.0D);
			if (this.anInt1070 > 0) {
				this.anInt1070 -= 4;
			}
			if (this.anInt1071 > 0) {
				this.anInt1071 -= 4;
			}
			if (this.anInt1070 == 0 && this.anInt1071 == 0) {
				local174 = (int) (Math.random() * 2000.0D);
				if (local174 == 0) {
					this.anInt1070 = 1024;
				}
				if (local174 == 1) {
					this.anInt1071 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("70949, " + 17 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method582(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			this.anInt998 = 0;
			@Pc(94) int local94;
			@Pc(74) int local74;
			for (@Pc(10) int local10 = -1; local10 < this.anInt921 + this.anInt963; local10++) {
				@Pc(17) Class1_Sub1_Sub1_Sub2 local17;
				if (local10 == -1) {
					local17 = aClass1_Sub1_Sub1_Sub2_Sub2_1;
				} else if (local10 < this.anInt921) {
					local17 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray220[local10]];
				} else {
					local17 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local10 - this.anInt921]];
				}
				if (local17 != null && local17.method322()) {
					@Pc(58) Class27 local58;
					if (local17 instanceof Class1_Sub1_Sub1_Sub2_Sub1) {
						local58 = ((Class1_Sub1_Sub1_Sub2_Sub1) local17).aClass27_1;
						if (local58.anIntArray131 != null) {
							local58 = local58.method290();
						}
						if (local58 == null) {
							continue;
						}
					}
					if (local10 >= this.anInt921) {
						local58 = ((Class1_Sub1_Sub1_Sub2_Sub1) local17).aClass27_1;
						if (local58.anInt473 >= 0 && local58.anInt473 < this.aClass1_Sub1_Sub2_Sub4Array7.length) {
							this.method625(local17, local17.anInt554 + 15);
							if (this.anInt960 > -1) {
								this.aClass1_Sub1_Sub2_Sub4Array7[local58.anInt473].method554(this.anInt961 - 30, this.anInt960 - 12);
							}
						}
						if (this.anInt985 == 1 && this.anInt870 == this.anIntArray244[local10 - this.anInt921] && anInt987 % 20 < 10) {
							this.method625(local17, local17.anInt554 + 15);
							if (this.anInt960 > -1) {
								this.aClass1_Sub1_Sub2_Sub4Array7[2].method554(this.anInt961 - 28, this.anInt960 - 12);
							}
						}
					} else {
						local74 = 30;
						@Pc(77) Class1_Sub1_Sub1_Sub2_Sub2 local77 = (Class1_Sub1_Sub1_Sub2_Sub2) local17;
						if (local77.anInt584 != 0) {
							this.method625(local17, local17.anInt554 + 15);
							if (this.anInt960 > -1) {
								for (local94 = 0; local94 < 8; local94++) {
									if ((local77.anInt584 & 0x1 << local94) != 0) {
										this.aClass1_Sub1_Sub2_Sub4Array7[local94].method554(this.anInt961 - local74, this.anInt960 - 12);
										local74 -= 25;
									}
								}
							}
						}
						if (local10 >= 0 && this.anInt985 == 10 && this.anInt907 == this.anIntArray220[local10]) {
							this.method625(local17, local17.anInt554 + 15);
							if (this.anInt960 > -1) {
								this.aClass1_Sub1_Sub2_Sub4Array7[7].method554(this.anInt961 - local74, this.anInt960 - 12);
							}
						}
					}
					if (local17.aString7 != null && (local10 >= this.anInt921 || this.anInt1050 == 0 || this.anInt1050 == 3 || this.anInt1050 == 1 && this.method627(((Class1_Sub1_Sub1_Sub2_Sub2) local17).aString8))) {
						this.method625(local17, local17.anInt554);
						if (this.anInt960 > -1 && this.anInt998 < this.anInt999) {
							this.anIntArray257[this.anInt998] = this.aClass1_Sub1_Sub2_Sub3_4.method423(local17.aString7) / 2;
							this.anIntArray256[this.anInt998] = this.aClass1_Sub1_Sub2_Sub3_4.anInt733;
							this.anIntArray254[this.anInt998] = this.anInt960;
							this.anIntArray255[this.anInt998] = this.anInt961;
							this.anIntArray258[this.anInt998] = local17.anInt531;
							this.anIntArray259[this.anInt998] = local17.anInt540;
							this.anIntArray260[this.anInt998] = local17.anInt541;
							this.aStringArray12[this.anInt998++] = local17.aString7;
							if (this.anInt938 == 0 && local17.anInt540 >= 1 && local17.anInt540 <= 3) {
								this.anIntArray256[this.anInt998] += 10;
								this.anIntArray255[this.anInt998] += 5;
							}
							if (this.anInt938 == 0 && local17.anInt540 == 4) {
								this.anIntArray257[this.anInt998] = 60;
							}
							if (this.anInt938 == 0 && local17.anInt540 == 5) {
								this.anIntArray256[this.anInt998] += 5;
							}
						}
					}
					if (local17.anInt520 > anInt987) {
						this.method625(local17, local17.anInt554 + 15);
						if (this.anInt960 > -1) {
							local74 = local17.anInt521 * 30 / local17.anInt522;
							if (local74 > 30) {
								local74 = 30;
							}
							Class1_Sub1_Sub2.method542(this.anInt960 - 15, this.anInt961 - 3, 65280, local74, 5);
							Class1_Sub1_Sub2.method542(this.anInt960 + local74 - 15, this.anInt961 - 3, 16711680, 30 - local74, 5);
						}
					}
					for (local74 = 0; local74 < 4; local74++) {
						if (local17.anIntArray144[local74] > anInt987) {
							this.method625(local17, local17.anInt554 / 2);
							if (this.anInt960 > -1) {
								if (local74 == 1) {
									this.anInt961 -= 20;
								}
								if (local74 == 2) {
									this.anInt960 -= 15;
									this.anInt961 -= 10;
								}
								if (local74 == 3) {
									this.anInt960 += 15;
									this.anInt961 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub4Array4[local17.anIntArray143[local74]].method554(this.anInt961 - 12, this.anInt960 - 12);
								this.aClass1_Sub1_Sub2_Sub3_2.method420(this.anInt961 + 4, String.valueOf(local17.anIntArray142[local74]), 0, this.anInt960);
								this.aClass1_Sub1_Sub2_Sub3_2.method420(this.anInt961 + 3, String.valueOf(local17.anIntArray142[local74]), 16777215, this.anInt960 - 1);
							}
						}
					}
				}
			}
			anInt1017++;
			if (anInt1017 > 78) {
				anInt1017 = 0;
				this.aClass1_Sub1_Sub3_7.method487(204);
			}
			for (@Pc(613) int local613 = 0; local613 < this.anInt998; local613++) {
				local74 = this.anIntArray254[local613];
				@Pc(625) int local625 = this.anIntArray255[local613];
				local94 = this.anIntArray257[local613];
				@Pc(635) int local635 = this.anIntArray256[local613];
				@Pc(637) boolean local637 = true;
				while (local637) {
					local637 = false;
					for (@Pc(643) int local643 = 0; local643 < local613; local643++) {
						if (local625 + 2 > this.anIntArray255[local643] - this.anIntArray256[local643] && local625 - local635 < this.anIntArray255[local643] + 2 && local74 - local94 < this.anIntArray254[local643] + this.anIntArray257[local643] && local74 + local94 > this.anIntArray254[local643] - this.anIntArray257[local643] && this.anIntArray255[local643] - this.anIntArray256[local643] < local625) {
							local625 = this.anIntArray255[local643] - this.anIntArray256[local643];
							local637 = true;
						}
					}
				}
				this.anInt960 = this.anIntArray254[local613];
				this.anInt961 = this.anIntArray255[local613] = local625;
				@Pc(742) String local742 = this.aStringArray12[local613];
				if (this.anInt938 == 0) {
					@Pc(747) int local747 = 16776960;
					if (this.anIntArray258[local613] < 6) {
						local747 = this.anIntArray239[this.anIntArray258[local613]];
					}
					if (this.anIntArray258[local613] == 6) {
						local747 = this.anInt1018 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray258[local613] == 7) {
						local747 = this.anInt1018 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray258[local613] == 8) {
						local747 = this.anInt1018 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(822) int local822;
					if (this.anIntArray258[local613] == 9) {
						local822 = 150 - this.anIntArray260[local613];
						if (local822 < 50) {
							local747 = local822 * 1280 + 16711680;
						} else if (local822 < 100) {
							local747 = 16776960 - (local822 - 50) * 327680;
						} else if (local822 < 150) {
							local747 = (local822 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray258[local613] == 10) {
						local822 = 150 - this.anIntArray260[local613];
						if (local822 < 50) {
							local747 = local822 * 5 + 16711680;
						} else if (local822 < 100) {
							local747 = 16711935 - (local822 - 50) * 327680;
						} else if (local822 < 150) {
							local747 = (local822 - 100) * 327680 + 255 - (local822 - 100) * 5;
						}
					}
					if (this.anIntArray258[local613] == 11) {
						local822 = 150 - this.anIntArray260[local613];
						if (local822 < 50) {
							local747 = 16777215 - local822 * 327685;
						} else if (local822 < 100) {
							local747 = (local822 - 50) * 327685 + 65280;
						} else if (local822 < 150) {
							local747 = 16777215 - (local822 - 100) * 327680;
						}
					}
					if (this.anIntArray259[local613] == 0) {
						this.aClass1_Sub1_Sub2_Sub3_4.method420(this.anInt961 + 1, local742, 0, this.anInt960);
						this.aClass1_Sub1_Sub2_Sub3_4.method420(this.anInt961, local742, local747, this.anInt960);
					}
					if (this.anIntArray259[local613] == 1) {
						this.aClass1_Sub1_Sub2_Sub3_4.method425(0, local742, this.anInt1018, this.anInt960, this.anInt961 + 1);
						this.aClass1_Sub1_Sub2_Sub3_4.method425(local747, local742, this.anInt1018, this.anInt960, this.anInt961);
					}
					if (this.anIntArray259[local613] == 2) {
						this.aClass1_Sub1_Sub2_Sub3_4.method426(local742, this.anInt961 + 1, this.anInt960, this.anInt1018, 0);
						this.aClass1_Sub1_Sub2_Sub3_4.method426(local742, this.anInt961, this.anInt960, this.anInt1018, local747);
					}
					if (this.anIntArray259[local613] == 3) {
						this.aClass1_Sub1_Sub2_Sub3_4.method427(this.anInt960, 150 - this.anIntArray260[local613], this.anInt1018, 0, local742, this.anInt961 + 1);
						this.aClass1_Sub1_Sub2_Sub3_4.method427(this.anInt960, 150 - this.anIntArray260[local613], this.anInt1018, local747, local742, this.anInt961);
					}
					@Pc(1119) int local1119;
					if (this.anIntArray259[local613] == 4) {
						local822 = this.aClass1_Sub1_Sub2_Sub3_4.method423(local742);
						local1119 = (150 - this.anIntArray260[local613]) * (local822 + 100) / 150;
						Class1_Sub1_Sub2.method539(this.anInt960 - 50, 0, this.anInt960 + 50, 334);
						this.aClass1_Sub1_Sub2_Sub3_4.method424(this.anInt960 + 50 - local1119, local742, 0, this.anInt961 + 1);
						this.aClass1_Sub1_Sub2_Sub3_4.method424(this.anInt960 + 50 - local1119, local742, local747, this.anInt961);
						Class1_Sub1_Sub2.method538();
					}
					if (this.anIntArray259[local613] == 5) {
						local822 = 150 - this.anIntArray260[local613];
						local1119 = 0;
						if (local822 < 25) {
							local1119 = local822 - 25;
						} else if (local822 > 125) {
							local1119 = local822 - 125;
						}
						Class1_Sub1_Sub2.method539(0, this.anInt961 - this.aClass1_Sub1_Sub2_Sub3_4.anInt733 - 1, 512, this.anInt961 + 5);
						this.aClass1_Sub1_Sub2_Sub3_4.method420(this.anInt961 + local1119 + 1, local742, 0, this.anInt960);
						this.aClass1_Sub1_Sub2_Sub3_4.method420(this.anInt961 + local1119, local742, local747, this.anInt960);
						Class1_Sub1_Sub2.method538();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub3_4.method420(this.anInt961 + 1, local742, 0, this.anInt960);
					this.aClass1_Sub1_Sub2_Sub3_4.method420(this.anInt961, local742, 16776960, this.anInt960);
				}
			}
		} catch (@Pc(1269) RuntimeException local1269) {
			signlink.reporterror("37391, " + arg0 + ", " + local1269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method583() {
		try {
			if (this.aClass50_6 == null) {
				super.aClass50_2 = null;
				this.aClass50_18 = null;
				this.aClass50_16 = null;
				this.aClass50_15 = null;
				this.aClass50_17 = null;
				this.aClass50_3 = null;
				this.aClass50_4 = null;
				this.aClass50_5 = null;
				this.aClass50_9 = new Class50(265, this.method577((byte) 7), 128, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_10 = new Class50(265, this.method577((byte) 7), 128, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_6 = new Class50(171, this.method577((byte) 7), 509, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_7 = new Class50(132, this.method577((byte) 7), 360, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_8 = new Class50(200, this.method577((byte) 7), 360, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_11 = new Class50(238, this.method577((byte) 7), 202, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_12 = new Class50(238, this.method577((byte) 7), 203, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_13 = new Class50(94, this.method577((byte) 7), 74, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_14 = new Class50(94, this.method577((byte) 7), 75, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				if (this.aClass36_1 != null) {
					this.method602();
					this.method628();
				}
				this.aBoolean231 = true;
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("95887, " + 6 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method584() {
		try {
			if (this.aClass50_18 == null) {
				this.method614();
				super.aClass50_2 = null;
				this.aClass50_6 = null;
				this.aClass50_7 = null;
				this.aClass50_8 = null;
				this.aClass50_9 = null;
				this.aClass50_10 = null;
				this.aClass50_11 = null;
				this.aClass50_12 = null;
				this.aClass50_13 = null;
				this.aClass50_14 = null;
				this.aClass50_18 = new Class50(96, this.method577((byte) 7), 479, (byte) 1);
				this.aClass50_16 = new Class50(156, this.method577((byte) 7), 172, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass1_Sub1_Sub2_Sub1_17.method62(0, 0);
				this.aClass50_15 = new Class50(261, this.method577((byte) 7), 190, (byte) 1);
				this.aClass50_17 = new Class50(334, this.method577((byte) 7), 512, (byte) 1);
				Class1_Sub1_Sub2.method540(this.anInt897);
				this.aClass50_3 = new Class50(50, this.method577((byte) 7), 496, (byte) 1);
				this.anInt955 += 0;
				this.aClass50_4 = new Class50(37, this.method577((byte) 7), 269, (byte) 1);
				this.aClass50_5 = new Class50(45, this.method577((byte) 7), 249, (byte) 1);
				this.aBoolean231 = true;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("46096, " + 0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method585() {
		try {
			for (@Pc(13) Class1_Sub1_Sub1_Sub4 local13 = (Class1_Sub1_Sub1_Sub4) this.aClass13_11.method111(); local13 != null; local13 = (Class1_Sub1_Sub1_Sub4) this.aClass13_11.method113()) {
				if (local13.anInt364 != this.anInt874 || local13.aBoolean77) {
					local13.method565();
				} else if (anInt987 >= local13.anInt359) {
					local13.method223(this.anInt939);
					if (local13.aBoolean77) {
						local13.method565();
					} else {
						this.aClass21_1.method240(0, local13.anInt364, local13.anInt365, local13.anInt366, 60, local13.anInt367, -1, local13, false);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("14765, " + 1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
	private boolean method586(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(13) int local13 = this.anIntArray236[arg0];
			if (local13 >= 2000) {
				local13 -= 2000;
			}
			return local13 == 554;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("80477, " + arg0 + ", " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	private void method587(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt1062 != -1) {
				this.aString30 = arg0;
				super.anInt856 = 0;
			}
			if (this.anInt925 == -1) {
				this.aBoolean239 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray223[local20] = this.anIntArray223[local20 - 1];
				this.aStringArray10[local20] = this.aStringArray10[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
			}
			this.anIntArray223[0] = arg2;
			this.aStringArray10[0] = arg1;
			this.aStringArray11[0] = arg0;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("57747, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method588() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1053);
			if (this.aClass35_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass35_Sub1_1.anInt690);
			}
			System.out.println("loop-cycle:" + anInt987);
			System.out.println("draw-cycle:" + anInt1014);
			System.out.println("ptype:" + this.anInt956);
			System.out.println("psize:" + this.anInt955);
			if (this.aClass12_1 != null) {
				this.aClass12_1.method107();
			}
			super.aBoolean189 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("58679, " + 0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method577(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("40489, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RWLOYYVC;IZIZIIII)V")
	private void method589(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean202) {
				this.anInt964 = 32;
			} else {
				this.anInt964 = 0;
			}
			this.aBoolean202 = false;
			if (arg7 >= arg1 && arg7 < arg1 + 16 && arg4 >= arg2 && arg4 < arg2 + 16) {
				arg0.anInt622 -= this.anInt1043 * 4;
				if (arg3) {
					this.aBoolean219 = true;
					return;
				}
			} else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg4 >= arg2 + arg5 - 16 && arg4 < arg2 + arg5) {
				arg0.anInt622 += this.anInt1043 * 4;
				if (arg3) {
					this.aBoolean219 = true;
					return;
				}
			} else if (arg7 >= arg1 - this.anInt964 && arg7 < arg1 + this.anInt964 + 16 && arg4 >= arg2 + 16 && arg4 < arg2 + arg5 - 16 && this.anInt1043 > 0) {
				@Pc(121) int local121 = (arg5 - 32) * arg5 / arg6;
				if (local121 < 8) {
					local121 = 8;
				}
				@Pc(136) int local136 = arg4 - arg2 - local121 / 2 - 16;
				@Pc(142) int local142 = arg5 - local121 - 32;
				arg0.anInt622 = (arg6 - arg5) * local136 / local142;
				if (arg3) {
					this.aBoolean219 = true;
				}
				this.aBoolean202 = true;
			} else {
				return;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("93584, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!XJCNBMKS;)V")
	private void method590(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method508((byte) 7);
			@Pc(12) int local12 = arg1.method509(1);
			if (local12 != 0) {
				@Pc(20) int local20 = arg1.method509(2);
				if (local20 == 0) {
					this.anIntArray221[this.anInt922++] = this.anInt920;
				} else {
					@Pc(43) int local43;
					@Pc(53) int local53;
					if (local20 == 1) {
						local43 = arg1.method509(3);
						aClass1_Sub1_Sub1_Sub2_Sub2_1.method320((byte) 9, false, local43);
						local53 = arg1.method509(1);
						if (local53 == 1) {
							this.anIntArray221[this.anInt922++] = this.anInt920;
						}
					} else {
						@Pc(97) int local97;
						if (local20 == 2) {
							local43 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub2_Sub2_1.method320((byte) 9, true, local43);
							local53 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub2_Sub2_1.method320((byte) 9, true, local53);
							local97 = arg1.method509(1);
							if (local97 == 1) {
								this.anIntArray221[this.anInt922++] = this.anInt920;
							}
						} else if (local20 == 3) {
							local43 = arg1.method509(7);
							local53 = arg1.method509(7);
							this.anInt874 = arg1.method509(2);
							local97 = arg1.method509(1);
							if (local97 == 1) {
								this.anIntArray221[this.anInt922++] = this.anInt920;
							}
							@Pc(157) int local157 = arg1.method509(1);
							aClass1_Sub1_Sub1_Sub2_Sub2_1.method321(local43, local53, local157 == 1);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("36520, " + 20585 + ", " + arg0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method591() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray222[8] = 0;
			this.anInt955 += 0;
			@Pc(16) int local16 = 0;
			while (this.anIntArray222[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method579(20, "Connecting to web server");
				try {
					@Pc(42) DataInputStream local42 = this.method690("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 321);
					@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3((byte) 9, new byte[40]);
					local42.readFully(local49.aByteArray19, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray222[local59] = local49.method503();
					}
					@Pc(74) int local74 = local49.method503();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray222[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray222[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray222[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray222[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray222[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray222[8] == 0) {
					local16++;
					for (@Pc(141) int local141 = local3; local141 > 0; local141--) {
						if (local16 >= 10) {
							this.method579(10, "Game updated - please reload page");
							local141 = 10;
						} else {
							this.method579(10, local20 + " - Will retry in " + local141 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(175) Exception local175) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean235 = !this.aBoolean235;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("6321, " + 0 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!XJCNBMKS;I)V")
	private void method592(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1025 = 0;
			this.anInt922 = 0;
			this.method620(arg1, arg0);
			this.method662(arg0, arg1);
			this.method660(arg0, arg1);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt1025; local28++) {
				local35 = this.anIntArray266[local28];
				if (this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local35].anInt532 != anInt987) {
					this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local35].aClass27_1 = null;
					this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local35] = null;
				}
			}
			if (arg0.anInt806 != arg1) {
				signlink.reporterror(this.aString20 + " size mismatch in getnpcpos - pos:" + arg0.anInt806 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt963; local35++) {
				if (this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local35]] == null) {
					signlink.reporterror(this.aString20 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt963);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("56312, " + 4289 + ", " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method593() {
		try {
			this.aBoolean199 = true;
			try {
				@Pc(9) long local9 = System.currentTimeMillis();
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 20;
				while (this.aBoolean220) {
					this.anInt1053++;
					this.method581();
					this.method581();
					this.method651();
					local11++;
					if (local11 > 10) {
						@Pc(36) long local36 = System.currentTimeMillis();
						@Pc(45) int local45 = (int) (local36 - local9) / 10 - local13;
						local13 = 40 - local45;
						if (local13 < 5) {
							local13 = 5;
						}
						local11 = 0;
						local9 = local36;
					}
					try {
						Thread.sleep((long) local13);
					} catch (@Pc(63) Exception local63) {
					}
				}
			} catch (@Pc(69) Exception local69) {
			}
			this.aBoolean199 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("24167, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method594(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.anInt1026 == 0 && super.anInt856 == 1) {
				@Pc(22) int local22 = super.anInt857 - 25 - 550;
				@Pc(29) int local29 = super.anInt858 - 5 - 4;
				if (local22 >= 0 && local29 >= 0 && local22 < 146 && local29 < 151) {
					local22 -= 73;
					local29 -= 75;
					@Pc(49) int local49 = this.anInt904 + this.anInt875 & 0x7FF;
					@Pc(53) int local53 = Class1_Sub1_Sub2_Sub2.anIntArray16[local49];
					@Pc(57) int local57 = Class1_Sub1_Sub2_Sub2.anIntArray17[local49];
					@Pc(66) int local66 = local53 * (this.anInt953 + 256) >> 8;
					@Pc(75) int local75 = local57 * (this.anInt953 + 256) >> 8;
					@Pc(85) int local85 = local29 * local66 + local22 * local75 >> 11;
					@Pc(95) int local95 = local29 * local75 - local22 * local66 >> 11;
					@Pc(102) int local102 = aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 + local85 >> 7;
					@Pc(109) int local109 = aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 - local95 >> 7;
					@Pc(130) boolean local130 = this.method639(0, 0, 1, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local102, true, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local109, 0, 0);
					if (local130) {
						this.aClass1_Sub1_Sub3_7.method488(local22);
						this.aClass1_Sub1_Sub3_7.method488(local29);
						this.aClass1_Sub1_Sub3_7.method489(this.anInt904);
						this.aClass1_Sub1_Sub3_7.method488(57);
						this.aClass1_Sub1_Sub3_7.method488(this.anInt875);
						this.aClass1_Sub1_Sub3_7.method488(this.anInt953);
						this.aClass1_Sub1_Sub3_7.method488(89);
						this.aClass1_Sub1_Sub3_7.method489(aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564);
						this.aClass1_Sub1_Sub3_7.method489(aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565);
						this.aClass1_Sub1_Sub3_7.method488(this.anInt890);
						this.aClass1_Sub1_Sub3_7.method488(63);
						return;
					}
				}
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("82303, " + arg0 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Ljava/lang/String;")
	private String method595() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("96225, " + 750 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method596(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method597(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt994 >= 100) {
					this.method587("Your ignore list is full. Max of 100 hit", "", 0);
				} else {
					@Pc(23) String local23 = Class44.method452(Class44.method449(arg0, (byte) 7));
					for (@Pc(25) int local25 = 0; local25 < this.anInt994; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method587(local23 + " is already on your ignore list", "", 0);
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt867; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method587("Please remove " + local23 + " from your friend list first", "", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt994++] = arg0;
					this.aBoolean219 = true;
					this.aClass1_Sub1_Sub3_7.method487(155);
					this.aClass1_Sub1_Sub3_7.method494(155, arg0);
					this.aBoolean237 &= true;
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("40721, " + true + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method598() {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt1060; local9++) {
				if (this.anIntArray271[local9] <= 0) {
					@Pc(18) boolean local18 = false;
					try {
						if (this.anIntArray249[local9] != this.anInt937 || this.anIntArray268[local9] != this.anInt1059) {
							@Pc(52) Class1_Sub1_Sub3 local52 = Class17.method211(this.anIntArray249[local9], this.anIntArray268[local9]);
							if (System.currentTimeMillis() + (long) (local52.anInt806 / 22) > this.aLong31 + (long) (this.anInt1065 / 22)) {
								this.anInt1065 = local52.anInt806;
								this.aLong31 = System.currentTimeMillis();
								if (this.method608(local52.aByteArray19, local52.anInt806)) {
									this.anInt937 = this.anIntArray249[local9];
									this.anInt1059 = this.anIntArray268[local9];
								} else {
									local18 = true;
								}
							}
						} else if (!this.method691(this.anInt930)) {
							local18 = true;
						}
					} catch (@Pc(102) Exception local102) {
					}
					if (local18 && this.anIntArray271[local9] != -5) {
						this.anIntArray271[local9] = -5;
					} else {
						this.anInt1060--;
						for (@Pc(118) int local118 = local9; local118 < this.anInt1060; local118++) {
							this.anIntArray249[local118] = this.anIntArray249[local118 + 1];
							this.anIntArray268[local118] = this.anIntArray268[local118 + 1];
							this.anIntArray271[local118] = this.anIntArray271[local118 + 1];
						}
						local9--;
					}
				} else {
					@Pc(170) int local170 = this.anIntArray271[local9]--;
				}
			}
			if (this.anInt1052 > 0) {
				this.anInt1052 -= 20;
				if (this.anInt1052 < 0) {
					this.anInt1052 = 0;
				}
				if (this.anInt1052 == 0 && this.aBoolean198 && !aBoolean222) {
					this.anInt988 = this.anInt1068;
					this.aBoolean232 = true;
					this.aClass35_Sub1_1.method370(2, this.anInt988);
					return;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("8999, " + false + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method599(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < this.anInt963; local5++) {
				@Pc(15) Class1_Sub1_Sub1_Sub2_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local5]];
				@Pc(24) int local24 = (this.anIntArray244[local5] << 14) + 536870912;
				if (local15 != null && local15.method322() && local15.aClass27_1.aBoolean94 == arg0) {
					@Pc(40) int local40 = local15.anInt564 >> 7;
					@Pc(45) int local45 = local15.anInt565 >> 7;
					if (local40 >= 0 && local40 < 104 && local45 >= 0 && local45 < 104) {
						if (local15.anInt558 == 1 && (local15.anInt564 & 0x7F) == 64 && (local15.anInt565 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local40][local45] == this.anInt1018) {
								continue;
							}
							this.anIntArrayArray23[local40][local45] = this.anInt1018;
						}
						if (!local15.aClass27_1.aBoolean95) {
							local24 += Integer.MIN_VALUE;
						}
						this.aClass21_1.method240(local15.anInt566, this.anInt874, local15.anInt564, local15.anInt565, (local15.anInt558 - 1) * 64 + 60, this.method648(local15.anInt565, this.anInt874, local15.anInt564), local24, local15, local15.aBoolean109);
					}
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("51873, " + arg0 + ", " + arg1 + ", " + local137.toString());
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
				return new URL("http://127.0.0.1:" + (anInt969 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method600() {
		try {
			this.aBoolean237 &= true;
			if (this.anInt950 == 0) {
				@Pc(12) int local12 = super.anInt856;
				if (this.anInt1044 == 1 && super.anInt857 >= 516 && super.anInt858 >= 160 && super.anInt857 <= 765 && super.anInt858 <= 205) {
					local12 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean217) {
					if (local12 != 1) {
						local43 = super.anInt851;
						local46 = super.anInt852;
						if (this.anInt1005 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt1005 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt1005 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt1006 - 10 || local43 > this.anInt1006 + this.anInt1008 + 10 || local46 < this.anInt1007 - 10 || local46 > this.anInt1007 + this.anInt1009 + 10) {
							this.aBoolean217 = false;
							if (this.anInt1005 == 1) {
								this.aBoolean219 = true;
							}
							if (this.anInt1005 == 2) {
								this.aBoolean239 = true;
							}
						}
					}
					if (local12 == 1) {
						local43 = this.anInt1006;
						local46 = this.anInt1007;
						local122 = this.anInt1008;
						@Pc(125) int local125 = super.anInt857;
						@Pc(128) int local128 = super.anInt858;
						if (this.anInt1005 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt1005 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt1005 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt863; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt863 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method681(local147);
						}
						this.aBoolean217 = false;
						if (this.anInt1005 == 1) {
							this.aBoolean219 = true;
						}
						if (this.anInt1005 == 2) {
							this.aBoolean239 = true;
							return;
						}
					}
				} else {
					if (local12 == 1 && this.anInt863 > 0) {
						local43 = this.anIntArray236[this.anInt863 - 1];
						if (local43 == 883 || local43 == 997 || local43 == 67 || local43 == 186 || local43 == 966 || local43 == 99 || local43 == 111 || local43 == 308 || local43 == 442 || local43 == 2 || local43 == 756 || local43 == 1298) {
							local46 = this.anIntArray234[this.anInt863 - 1];
							local122 = this.anIntArray235[this.anInt863 - 1];
							@Pc(284) Class38 local284 = Class38.aClass38Array1[local122];
							if (local284.aBoolean127 || local284.aBoolean128) {
								this.aBoolean214 = false;
								this.anInt900 = 0;
								this.anInt948 = local122;
								this.anInt949 = local46;
								this.anInt950 = 2;
								this.anInt951 = super.anInt857;
								this.anInt952 = super.anInt858;
								if (Class38.aClass38Array1[local122].anInt628 == this.anInt934) {
									this.anInt950 = 1;
								}
								if (Class38.aClass38Array1[local122].anInt628 == this.anInt925) {
									this.anInt950 = 3;
								}
								return;
							}
						}
					}
					if (local12 == 1 && (this.anInt1058 == 1 || this.method586(this.anInt863 - 1)) && this.anInt863 > 2) {
						local12 = 2;
					}
					if (local12 == 1 && this.anInt863 > 0) {
						this.method681(this.anInt863 - 1);
					}
					if (local12 != 2 || this.anInt863 <= 0) {
						return;
					}
					this.method605();
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("93374, " + true + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method601() {
		try {
			this.aClass50_16.method562();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt1026 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub1_17.aByteArray2;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray207;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub4_13.method558(25, this.anIntArray215, 256, 0, 0, 25, this.anIntArray232, this.anInt904, 33, 33);
				this.aClass50_17.method562();
			} else {
				@Pc(64) int local64 = this.anInt904 + this.anInt875 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
				this.aClass1_Sub1_Sub2_Sub4_14.method558(local18, this.anIntArray270, this.anInt953 + 256, 5, 25, local71, this.anIntArray214, local64, 151, 146);
				this.aClass1_Sub1_Sub2_Sub4_13.method558(25, this.anIntArray215, 256, 0, 0, 25, this.anIntArray232, this.anInt904, 33, 33);
				for (local20 = 0; local20 < this.anInt942; local20++) {
					local71 = this.anIntArray240[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32;
					local18 = this.anIntArray241[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
					this.method683(local18, local71, this.aClass1_Sub1_Sub2_Sub4Array5[local20]);
				}
				@Pc(170) int local170;
				for (@Pc(166) int local166 = 0; local166 < 104; local166++) {
					for (local170 = 0; local170 < 104; local170++) {
						@Pc(182) Class13 local182 = this.aClass13ArrayArrayArray1[this.anInt874][local166][local170];
						if (local182 != null) {
							local71 = local166 * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32;
							local18 = local170 * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
							this.method683(local18, local71, this.aClass1_Sub1_Sub2_Sub4_8);
						}
					}
				}
				for (local170 = 0; local170 < this.anInt963; local170++) {
					@Pc(233) Class1_Sub1_Sub1_Sub2_Sub1 local233 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local170]];
					if (local233 != null && local233.method322()) {
						@Pc(242) Class27 local242 = local233.aClass27_1;
						if (local242.anIntArray131 != null) {
							local242 = local242.method290();
						}
						if (local242 != null && local242.aBoolean93 && local242.aBoolean95) {
							local71 = local233.anInt564 / 32 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32;
							local18 = local233.anInt565 / 32 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
							this.method683(local18, local71, this.aClass1_Sub1_Sub2_Sub4_9);
						}
					}
				}
				@Pc(301) Class1_Sub1_Sub1_Sub2_Sub2 local301;
				for (@Pc(291) int local291 = 0; local291 < this.anInt921; local291++) {
					local301 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray220[local291]];
					if (local301 != null && local301.method322()) {
						local71 = local301.anInt564 / 32 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32;
						local18 = local301.anInt565 / 32 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
						@Pc(329) boolean local329 = false;
						@Pc(333) long local333 = Class44.method448(local301.aString8);
						for (@Pc(335) int local335 = 0; local335 < this.anInt867; local335++) {
							if (local333 == this.aLongArray4[local335] && this.anIntArray242[local335] != 0) {
								local329 = true;
								break;
							}
						}
						@Pc(360) boolean local360 = false;
						if (aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt574 != 0 && local301.anInt574 != 0 && aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt574 == local301.anInt574) {
							local360 = true;
						}
						if (local329) {
							this.method683(local18, local71, this.aClass1_Sub1_Sub2_Sub4_11);
						} else if (local360) {
							this.method683(local18, local71, this.aClass1_Sub1_Sub2_Sub4_12);
						} else {
							this.method683(local18, local71, this.aClass1_Sub1_Sub2_Sub4_10);
						}
					}
				}
				if (this.anInt985 != 0 && anInt987 % 20 < 10) {
					if (this.anInt985 == 1 && this.anInt870 >= 0 && this.anInt870 < this.aClass1_Sub1_Sub1_Sub2_Sub1Array1.length) {
						@Pc(434) Class1_Sub1_Sub1_Sub2_Sub1 local434 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anInt870];
						if (local434 != null) {
							local71 = local434.anInt564 / 32 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32;
							local18 = local434.anInt565 / 32 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
							this.method603(this.anInt908, this.aClass1_Sub1_Sub2_Sub4_7, local18, local71);
						}
					}
					if (this.anInt985 == 2) {
						local71 = (this.anInt1029 - this.anInt915) * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32;
						local18 = (this.anInt1030 - this.anInt916) * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
						this.method603(this.anInt908, this.aClass1_Sub1_Sub2_Sub4_7, local18, local71);
					}
					if (this.anInt985 == 10 && this.anInt907 >= 0 && this.anInt907 < this.aClass1_Sub1_Sub1_Sub2_Sub2Array1.length) {
						local301 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anInt907];
						if (local301 != null) {
							local71 = local301.anInt564 / 32 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32;
							local18 = local301.anInt565 / 32 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
							this.method603(this.anInt908, this.aClass1_Sub1_Sub2_Sub4_7, local18, local71);
						}
					}
				}
				if (this.anInt945 != 0) {
					local71 = this.anInt945 * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 / 32;
					local18 = this.anInt946 * 4 + 2 - aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 / 32;
					this.method683(local18, local71, this.aClass1_Sub1_Sub2_Sub4_6);
				}
				Class1_Sub1_Sub2.method542(97, 78, 16777215, 3, 3);
				this.aClass50_17.method562();
			}
		} catch (@Pc(602) RuntimeException local602) {
			signlink.reporterror("11756, " + true + ", " + local602.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method602() {
		try {
			@Pc(7) byte[] local7 = this.aClass36_1.method337("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub4 local13 = new Class1_Sub1_Sub2_Sub4(local7, this);
			this.aClass50_9.method562();
			local13.method552(0, 0);
			this.aClass50_10.method562();
			local13.method552(-637, 0);
			this.aClass50_6.method562();
			local13.method552(-128, 0);
			this.aClass50_7.method562();
			local13.method552(-202, -371);
			this.aClass50_8.method562();
			local13.method552(-202, -171);
			this.aClass50_11.method562();
			local13.method552(0, -265);
			this.aClass50_12.method562();
			local13.method552(-562, -265);
			this.aClass50_13.method562();
			local13.method552(-128, -171);
			this.aClass50_14.method562();
			local13.method552(-562, -171);
			@Pc(109) int[] local109 = new int[local13.anInt828];
			for (@Pc(111) int local111 = 0; local111 < local13.anInt829; local111++) {
				for (@Pc(115) int local115 = 0; local115 < local13.anInt828; local115++) {
					local109[local115] = local13.anIntArray208[local13.anInt828 + local13.anInt828 * local111 - local115 - 1];
				}
				for (@Pc(141) int local141 = 0; local141 < local13.anInt828; local141++) {
					local13.anIntArray208[local141 + local13.anInt828 * local111] = local109[local141];
				}
			}
			this.aClass50_9.method562();
			local13.method552(382, 0);
			this.aClass50_10.method562();
			local13.method552(-255, 0);
			this.aClass50_6.method562();
			local13.method552(254, 0);
			this.aClass50_7.method562();
			local13.method552(180, -371);
			this.aClass50_8.method562();
			local13.method552(180, -171);
			this.aClass50_11.method562();
			local13.method552(382, -265);
			this.aClass50_12.method562();
			local13.method552(-180, -265);
			this.aClass50_13.method562();
			local13.method552(254, -171);
			this.aClass50_14.method562();
			local13.method552(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub4(this.aClass36_1, "logo", 0);
			this.aClass50_6.method562();
			local13.method554(18, 382 - local13.anInt828 / 2 - 128);
			System.gc();
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("7403, " + -121 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!YGMSKJOQ;II)V")
	private void method603(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg3 * arg3 + arg2 * arg2;
			@Pc(11) int local11 = 21 / arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(25) int local25 = this.anInt904 + this.anInt875 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub3.anIntArray74[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub3.anIntArray75[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt953 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt953 + 256);
				@Pc(61) int local61 = arg2 * local42 + arg3 * local51 >> 16;
				@Pc(71) int local71 = arg2 * local51 - arg3 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub4_5.method559(local77, local83 + 94 + 4 - 10, 83 - local89 - 20);
			} else {
				this.method683(arg2, arg3, arg1);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("61915, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RWLOYYVC;ZIIIII)V")
	private void method604(@OriginalArg(0) Class38 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg0.anInt646 == 0 && arg0.anIntArray158 != null && !arg0.aBoolean123 && (arg2 >= arg5 && arg4 >= arg6 && arg2 <= arg5 + arg0.anInt639 && arg4 <= arg6 + arg0.anInt635)) {
				@Pc(34) int local34 = arg0.anIntArray158.length;
				if (arg1) {
					this.aBoolean194 = !this.aBoolean194;
				}
				for (@Pc(46) int local46 = 0; local46 < local34; local46++) {
					@Pc(55) int local55 = arg0.anIntArray157[local46] + arg5;
					@Pc(64) int local64 = arg0.anIntArray151[local46] + arg6 - arg3;
					@Pc(71) Class38 local71 = Class38.aClass38Array1[arg0.anIntArray158[local46]];
					@Pc(76) int local76 = local55 + local71.anInt634;
					@Pc(81) int local81 = local64 + local71.anInt633;
					if ((local71.anInt632 >= 0 || local71.anInt624 != 0) && arg2 >= local76 && arg4 >= local81 && arg2 < local76 + local71.anInt639 && arg4 < local81 + local71.anInt635) {
						if (local71.anInt632 >= 0) {
							this.anInt873 = local71.anInt632;
						} else {
							this.anInt873 = local71.anInt641;
						}
					}
					if (local71.anInt646 == 0) {
						this.method604(local71, this.aBoolean224, arg2, local71.anInt622, arg4, local76, local81);
						if (local71.anInt638 > local71.anInt635) {
							this.method589(local71, local76 + local71.anInt639, local81, true, arg4, local71.anInt635, local71.anInt638, arg2);
						}
					} else {
						if (local71.anInt644 == 1 && arg2 >= local76 && arg4 >= local81 && arg2 < local76 + local71.anInt639 && arg4 < local81 + local71.anInt635) {
							@Pc(179) boolean local179 = false;
							if (local71.anInt640 != 0) {
								local179 = this.method631(local71);
							}
							if (!local179) {
								this.aStringArray8[this.anInt863] = local71.aString10;
								this.anIntArray236[this.anInt863] = 539;
								this.anIntArray235[this.anInt863] = local71.anInt641;
								this.anInt863++;
							}
						}
						if (local71.anInt644 == 2 && this.anInt1044 == 0 && arg2 >= local76 && arg4 >= local81 && arg2 < local76 + local71.anInt639 && arg4 < local81 + local71.anInt635) {
							@Pc(243) String local243 = local71.aString9;
							if (local243.indexOf(" ") != -1) {
								local243 = local243.substring(0, local243.indexOf(" "));
							}
							this.aStringArray8[this.anInt863] = local243 + " @gre@" + local71.aString12;
							this.anIntArray236[this.anInt863] = 6;
							this.anIntArray235[this.anInt863] = local71.anInt641;
							this.anInt863++;
						}
						if (local71.anInt644 == 3 && arg2 >= local76 && arg4 >= local81 && arg2 < local76 + local71.anInt639 && arg4 < local81 + local71.anInt635) {
							this.aStringArray8[this.anInt863] = "Close";
							this.anIntArray236[this.anInt863] = 210;
							this.anIntArray235[this.anInt863] = local71.anInt641;
							this.anInt863++;
						}
						if (local71.anInt644 == 4 && arg2 >= local76 && arg4 >= local81 && arg2 < local76 + local71.anInt639 && arg4 < local81 + local71.anInt635) {
							this.aStringArray8[this.anInt863] = local71.aString10;
							this.anIntArray236[this.anInt863] = 522;
							this.anIntArray235[this.anInt863] = local71.anInt641;
							this.anInt863++;
						}
						if (local71.anInt644 == 5 && arg2 >= local76 && arg4 >= local81 && arg2 < local76 + local71.anInt639 && arg4 < local81 + local71.anInt635) {
							this.aStringArray8[this.anInt863] = local71.aString10;
							this.anIntArray236[this.anInt863] = 565;
							this.anIntArray235[this.anInt863] = local71.anInt641;
							this.anInt863++;
						}
						if (local71.anInt644 == 6 && !this.aBoolean228 && arg2 >= local76 && arg4 >= local81 && arg2 < local76 + local71.anInt639 && arg4 < local81 + local71.anInt635) {
							this.aStringArray8[this.anInt863] = local71.aString10;
							this.anIntArray236[this.anInt863] = 551;
							this.anIntArray235[this.anInt863] = local71.anInt641;
							this.anInt863++;
						}
						if (local71.anInt646 == 2) {
							@Pc(491) int local491 = 0;
							for (@Pc(493) int local493 = 0; local493 < local71.anInt635; local493++) {
								for (@Pc(497) int local497 = 0; local497 < local71.anInt639; local497++) {
									@Pc(508) int local508 = local76 + local497 * (local71.anInt623 + 32);
									@Pc(517) int local517 = local81 + local493 * (local71.anInt636 + 32);
									if (local491 < 20) {
										local508 += local71.anIntArray153[local491];
										local517 += local71.anIntArray155[local491];
									}
									if (arg2 >= local508 && arg4 >= local517 && arg2 < local508 + 32 && arg4 < local517 + 32) {
										this.anInt1072 = local491;
										this.anInt1073 = local71.anInt641;
										if (local71.anIntArray159[local491] > 0) {
											@Pc(570) Class5 local570 = Class5.method23(local71.anIntArray159[local491] - 1);
											if (this.anInt973 == 1 && local71.aBoolean129) {
												if (local71.anInt641 != this.anInt975 || local491 != this.anInt974) {
													this.aStringArray8[this.anInt863] = "Use " + this.aString23 + " with @lre@" + local570.aString1;
													this.anIntArray236[this.anInt863] = 373;
													this.anIntArray237[this.anInt863] = local570.anInt61;
													this.anIntArray234[this.anInt863] = local491;
													this.anIntArray235[this.anInt863] = local71.anInt641;
													this.anInt863++;
												}
											} else if (this.anInt1044 != 1 || !local71.aBoolean129) {
												@Pc(707) int local707;
												if (local71.aBoolean129) {
													for (local707 = 4; local707 >= 3; local707--) {
														if (local570.aStringArray2 != null && local570.aStringArray2[local707] != null) {
															this.aStringArray8[this.anInt863] = local570.aStringArray2[local707] + " @lre@" + local570.aString1;
															if (local707 == 3) {
																this.anIntArray236[this.anInt863] = 442;
															}
															if (local707 == 4) {
																this.anIntArray236[this.anInt863] = 2;
															}
															this.anIntArray237[this.anInt863] = local570.anInt61;
															this.anIntArray234[this.anInt863] = local491;
															this.anIntArray235[this.anInt863] = local71.anInt641;
															this.anInt863++;
														} else if (local707 == 4) {
															this.aStringArray8[this.anInt863] = "Drop @lre@" + local570.aString1;
															this.anIntArray236[this.anInt863] = 2;
															this.anIntArray237[this.anInt863] = local570.anInt61;
															this.anIntArray234[this.anInt863] = local491;
															this.anIntArray235[this.anInt863] = local71.anInt641;
															this.anInt863++;
														}
													}
												}
												if (local71.aBoolean121) {
													this.aStringArray8[this.anInt863] = "Use @lre@" + local570.aString1;
													this.anIntArray236[this.anInt863] = 756;
													this.anIntArray237[this.anInt863] = local570.anInt61;
													this.anIntArray234[this.anInt863] = local491;
													this.anIntArray235[this.anInt863] = local71.anInt641;
													this.anInt863++;
												}
												if (local71.aBoolean129 && local570.aStringArray2 != null) {
													for (local707 = 2; local707 >= 0; local707--) {
														if (local570.aStringArray2[local707] != null) {
															this.aStringArray8[this.anInt863] = local570.aStringArray2[local707] + " @lre@" + local570.aString1;
															if (local707 == 0) {
																this.anIntArray236[this.anInt863] = 99;
															}
															if (local707 == 1) {
																this.anIntArray236[this.anInt863] = 111;
															}
															if (local707 == 2) {
																this.anIntArray236[this.anInt863] = 308;
															}
															this.anIntArray237[this.anInt863] = local570.anInt61;
															this.anIntArray234[this.anInt863] = local491;
															this.anIntArray235[this.anInt863] = local71.anInt641;
															this.anInt863++;
														}
													}
												}
												if (local71.aStringArray6 != null) {
													for (local707 = 4; local707 >= 0; local707--) {
														if (local71.aStringArray6[local707] != null) {
															this.aStringArray8[this.anInt863] = local71.aStringArray6[local707] + " @lre@" + local570.aString1;
															if (local707 == 0) {
																this.anIntArray236[this.anInt863] = 883;
															}
															if (local707 == 1) {
																this.anIntArray236[this.anInt863] = 997;
															}
															if (local707 == 2) {
																this.anIntArray236[this.anInt863] = 67;
															}
															if (local707 == 3) {
																this.anIntArray236[this.anInt863] = 186;
															}
															if (local707 == 4) {
																this.anIntArray236[this.anInt863] = 966;
															}
															this.anIntArray237[this.anInt863] = local570.anInt61;
															this.anIntArray234[this.anInt863] = local491;
															this.anIntArray235[this.anInt863] = local71.anInt641;
															this.anInt863++;
														}
													}
												}
												this.aStringArray8[this.anInt863] = "Examine @lre@" + local570.aString1;
												this.anIntArray236[this.anInt863] = 1298;
												this.anIntArray237[this.anInt863] = local570.anInt61;
												this.anIntArray234[this.anInt863] = local491;
												this.anIntArray235[this.anInt863] = local71.anInt641;
												this.anInt863++;
											} else if ((this.anInt1046 & 0x10) == 16) {
												this.aStringArray8[this.anInt863] = this.aString29 + " @lre@" + local570.aString1;
												this.anIntArray236[this.anInt863] = 162;
												this.anIntArray237[this.anInt863] = local570.anInt61;
												this.anIntArray234[this.anInt863] = local491;
												this.anIntArray235[this.anInt863] = local71.anInt641;
												this.anInt863++;
											}
										}
									}
									local491++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1137) RuntimeException local1137) {
			signlink.reporterror("79060, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method605() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub3_4.method422("Choose Option");
			@Pc(29) int local29;
			for (@Pc(18) int local18 = 0; local18 < this.anInt863; local18++) {
				local29 = this.aClass1_Sub1_Sub2_Sub3_4.method422(this.aStringArray8[local18]);
				if (local29 > local7) {
					local7 = local29;
				}
			}
			local7 += 8;
			local29 = this.anInt863 * 15 + 21;
			@Pc(72) int local72;
			@Pc(90) int local90;
			if (super.anInt857 > 4 && super.anInt858 > 4 && super.anInt857 < 516 && super.anInt858 < 338) {
				local72 = super.anInt857 - local7 / 2 - 4;
				if (local72 + local7 > 512) {
					local72 = 512 - local7;
				}
				if (local72 < 0) {
					local72 = 0;
				}
				local90 = super.anInt858 - 4;
				if (local90 + local29 > 334) {
					local90 = 334 - local29;
				}
				if (local90 < 0) {
					local90 = 0;
				}
				this.aBoolean217 = true;
				this.anInt1005 = 0;
				this.anInt1006 = local72;
				this.anInt1007 = local90;
				this.anInt1008 = local7;
				this.anInt1009 = this.anInt863 * 15 + 22;
			}
			if (super.anInt857 > 553 && super.anInt858 > 205 && super.anInt857 < 743 && super.anInt858 < 466) {
				local72 = super.anInt857 - local7 / 2 - 553;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 190) {
					local72 = 190 - local7;
				}
				local90 = super.anInt858 - 205;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local29 > 261) {
					local90 = 261 - local29;
				}
				this.aBoolean217 = true;
				this.anInt1005 = 1;
				this.anInt1006 = local72;
				this.anInt1007 = local90;
				this.anInt1008 = local7;
				this.anInt1009 = this.anInt863 * 15 + 22;
			}
			if (super.anInt857 > 17 && super.anInt858 > 357 && super.anInt857 < 496 && super.anInt858 < 453) {
				local72 = super.anInt857 - local7 / 2 - 17;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 479) {
					local72 = 479 - local7;
				}
				local90 = super.anInt858 - 357;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local29 > 96) {
					local90 = 96 - local29;
				}
				this.aBoolean217 = true;
				this.anInt1005 = 2;
				this.anInt1006 = local72;
				this.anInt1007 = local90;
				this.anInt1008 = local7;
				this.anInt1009 = this.anInt863 * 15 + 22;
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("59765, " + true + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method572() {
		this.method579(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt845 = 5;
		}
		if (aBoolean201) {
			this.aBoolean216 = true;
			return;
		}
		aBoolean201 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method595();
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
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
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean229 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(83) int local83 = 0; local83 < 5; local83++) {
				this.aClass33Array1[local83] = new Class33(anInt936, signlink.aRandomAccessFileArray1[local83], signlink.aRandomAccessFile3, local83 + 1, 500000);
			}
		}
		try {
			this.method591();
			this.aClass36_1 = this.method640("title", 1, 25, "title screen", this.anIntArray222[1]);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3("p11_full", false, -525, this.aClass36_1);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3("p12_full", false, -525, this.aClass36_1);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3("b12_full", false, -525, this.aClass36_1);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3("q8_full", true, -525, this.aClass36_1);
			this.method602();
			this.method628();
			@Pc(179) Class36 local179 = this.method640("config", 2, 30, "config", this.anIntArray222[2]);
			@Pc(191) Class36 local191 = this.method640("interface", 3, 35, "interface", this.anIntArray222[3]);
			@Pc(203) Class36 local203 = this.method640("media", 4, 40, "2d graphics", this.anIntArray222[4]);
			@Pc(215) Class36 local215 = this.method640("textures", 6, 45, "textures", this.anIntArray222[6]);
			@Pc(227) Class36 local227 = this.method640("wordenc", 7, 50, "chat system", this.anIntArray222[7]);
			@Pc(239) Class36 local239 = this.method640("sounds", 8, 55, "sound effects", this.anIntArray222[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass21_1 = new Class21((byte) 6, 4, 104, this.anIntArrayArrayArray8, 104);
			for (@Pc(264) int local264 = 0; local264 < 4; local264++) {
				this.aClass31Array1[local264] = new Class31(104, (byte) 4, 104);
			}
			this.aClass1_Sub1_Sub2_Sub4_14 = new Class1_Sub1_Sub2_Sub4(512, 512);
			@Pc(299) Class36 local299 = this.method640("versionlist", 5, 60, "update list", this.anIntArray222[5]);
			this.method579(60, "Connecting to update server");
			this.aClass35_Sub1_1 = new Class35_Sub1();
			this.aClass35_Sub1_1.method388(local299, this);
			Class40.method363(this.aClass35_Sub1_1.method373());
			Class1_Sub1_Sub1_Sub3.method179(this.aClass35_Sub1_1.method369(0, 631), this.aClass35_Sub1_1);
			if (!aBoolean222) {
				this.anInt988 = 0;
				try {
					this.anInt988 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(340) Exception local340) {
				}
				this.aBoolean232 = true;
				this.aClass35_Sub1_1.method370(2, this.anInt988);
				while (this.aClass35_Sub1_1.method380() > 0) {
					this.method709();
					try {
						Thread.sleep(100L);
					} catch (@Pc(358) Exception local358) {
					}
					if (this.aClass35_Sub1_1.anInt688 > 3) {
						this.method596("ondemand");
						return;
					}
				}
			}
			this.method579(65, "Requesting animations");
			@Pc(382) int local382 = this.aClass35_Sub1_1.method369(1, 631);
			for (@Pc(384) int local384 = 0; local384 < local382; local384++) {
				this.aClass35_Sub1_1.method370(1, local384);
			}
			@Pc(403) int local403;
			while (this.aClass35_Sub1_1.method380() > 0) {
				local403 = local382 - this.aClass35_Sub1_1.method380();
				if (local403 > 0) {
					this.method579(65, "Loading animations - " + local403 * 100 / local382 + "%");
				}
				this.method709();
				try {
					Thread.sleep(100L);
				} catch (@Pc(429) Exception local429) {
				}
				if (this.aClass35_Sub1_1.anInt688 > 3) {
					this.method596("ondemand");
					return;
				}
			}
			this.method579(70, "Requesting models");
			local382 = this.aClass35_Sub1_1.method369(0, 631);
			@Pc(463) int local463;
			for (local403 = 0; local403 < local382; local403++) {
				local463 = this.aClass35_Sub1_1.method379(local403);
				if ((local463 & 0x1) != 0) {
					this.aClass35_Sub1_1.method370(0, local403);
				}
			}
			local382 = this.aClass35_Sub1_1.method380();
			while (this.aClass35_Sub1_1.method380() > 0) {
				local463 = local382 - this.aClass35_Sub1_1.method380();
				if (local463 > 0) {
					this.method579(70, "Loading models - " + local463 * 100 / local382 + "%");
				}
				this.method709();
				try {
					Thread.sleep(100L);
				} catch (@Pc(514) Exception local514) {
				}
			}
			if (this.aClass33Array1[0] != null) {
				this.method579(75, "Requesting maps");
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(0, 47, 48));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(1, 47, 48));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(0, 48, 48));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(1, 48, 48));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(0, 49, 48));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(1, 49, 48));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(0, 47, 47));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(1, 47, 47));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(0, 48, 47));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(1, 48, 47));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(0, 48, 148));
				this.aClass35_Sub1_1.method370(3, this.aClass35_Sub1_1.method378(1, 48, 148));
				local382 = this.aClass35_Sub1_1.method380();
				while (this.aClass35_Sub1_1.method380() > 0) {
					local463 = local382 - this.aClass35_Sub1_1.method380();
					if (local463 > 0) {
						this.method579(75, "Loading maps - " + local463 * 100 / local382 + "%");
					}
					this.method709();
					try {
						Thread.sleep(100L);
					} catch (@Pc(699) Exception local699) {
					}
				}
			}
			local382 = this.aClass35_Sub1_1.method369(0, 631);
			@Pc(720) int local720;
			for (local463 = 0; local463 < local382; local463++) {
				local720 = this.aClass35_Sub1_1.method379(local463);
				@Pc(722) byte local722 = 0;
				if ((local720 & 0x8) != 0) {
					local722 = 10;
				} else if ((local720 & 0x20) != 0) {
					local722 = 9;
				} else if ((local720 & 0x10) != 0) {
					local722 = 8;
				} else if ((local720 & 0x40) != 0) {
					local722 = 7;
				} else if ((local720 & 0x80) != 0) {
					local722 = 6;
				} else if ((local720 & 0x2) != 0) {
					local722 = 5;
				} else if ((local720 & 0x4) != 0) {
					local722 = 4;
				}
				if ((local720 & 0x1) != 0) {
					local722 = 3;
				}
				if (local722 != 0) {
					this.aClass35_Sub1_1.method386(0, local463, local722);
				}
			}
			this.aClass35_Sub1_1.method372(aBoolean215, aBoolean221);
			if (!aBoolean222) {
				local382 = this.aClass35_Sub1_1.method369(2, 631);
				for (local720 = 1; local720 < local382; local720++) {
					if (this.aClass35_Sub1_1.method389(local720)) {
						this.aClass35_Sub1_1.method386(2, local720, (byte) 1);
					}
				}
			}
			this.method579(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub1_16 = new Class1_Sub1_Sub2_Sub1(local203, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub1_18 = new Class1_Sub1_Sub2_Sub1(local203, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub1_17 = new Class1_Sub1_Sub2_Sub1(local203, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub1_8 = new Class1_Sub1_Sub2_Sub1(local203, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub1_9 = new Class1_Sub1_Sub2_Sub1(local203, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub1_10 = new Class1_Sub1_Sub2_Sub1(local203, "backhmid1", 0);
			for (local720 = 0; local720 < 13; local720++) {
				this.aClass1_Sub1_Sub2_Sub1Array4[local720] = new Class1_Sub1_Sub2_Sub1(local203, "sideicons", local720);
			}
			this.aClass1_Sub1_Sub2_Sub4_13 = new Class1_Sub1_Sub2_Sub4(local203, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub4_5 = new Class1_Sub1_Sub2_Sub4(local203, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub4_5.method551(793);
			@Pc(922) int local922;
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub2_Sub1Array5[local922] = new Class1_Sub1_Sub2_Sub1(local203, "mapscene", local922);
				}
			} catch (@Pc(940) Exception local940) {
			}
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub2_Sub4Array8[local922] = new Class1_Sub1_Sub2_Sub4(local203, "mapfunction", local922);
				}
			} catch (@Pc(960) Exception local960) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub2_Sub4Array4[local922] = new Class1_Sub1_Sub2_Sub4(local203, "hitmarks", local922);
				}
			} catch (@Pc(980) Exception local980) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub2_Sub4Array7[local922] = new Class1_Sub1_Sub2_Sub4(local203, "headicons", local922);
				}
			} catch (@Pc(1000) Exception local1000) {
			}
			this.aClass1_Sub1_Sub2_Sub4_6 = new Class1_Sub1_Sub2_Sub4(local203, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub4_7 = new Class1_Sub1_Sub2_Sub4(local203, "mapmarker", 1);
			for (local922 = 0; local922 < 8; local922++) {
				this.aClass1_Sub1_Sub2_Sub4Array6[local922] = new Class1_Sub1_Sub2_Sub4(local203, "cross", local922);
			}
			this.aClass1_Sub1_Sub2_Sub4_8 = new Class1_Sub1_Sub2_Sub4(local203, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub4_9 = new Class1_Sub1_Sub2_Sub4(local203, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub4_10 = new Class1_Sub1_Sub2_Sub4(local203, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub4_11 = new Class1_Sub1_Sub2_Sub4(local203, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub4_12 = new Class1_Sub1_Sub2_Sub4(local203, "mapdots", 4);
			this.aClass1_Sub1_Sub2_Sub1_19 = new Class1_Sub1_Sub2_Sub1(local203, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub1_20 = new Class1_Sub1_Sub2_Sub1(local203, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub1_1 = new Class1_Sub1_Sub2_Sub1(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub1_2 = new Class1_Sub1_Sub2_Sub1(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub1_3 = new Class1_Sub1_Sub2_Sub1(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub1_4 = new Class1_Sub1_Sub2_Sub1(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub1_4.method59();
			this.aClass1_Sub1_Sub2_Sub1_5 = new Class1_Sub1_Sub2_Sub1(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub1_5.method59();
			this.aClass1_Sub1_Sub2_Sub1_11 = new Class1_Sub1_Sub2_Sub1(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub1_11.method60();
			this.aClass1_Sub1_Sub2_Sub1_12 = new Class1_Sub1_Sub2_Sub1(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub1_12.method60();
			this.aClass1_Sub1_Sub2_Sub1_13 = new Class1_Sub1_Sub2_Sub1(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub1_13.method60();
			this.aClass1_Sub1_Sub2_Sub1_14 = new Class1_Sub1_Sub2_Sub1(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub1_14.method59();
			this.aClass1_Sub1_Sub2_Sub1_14.method60();
			this.aClass1_Sub1_Sub2_Sub1_15 = new Class1_Sub1_Sub2_Sub1(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub1_15.method59();
			this.aClass1_Sub1_Sub2_Sub1_15.method60();
			for (@Pc(1208) int local1208 = 0; local1208 < 2; local1208++) {
				this.aClass1_Sub1_Sub2_Sub1Array2[local1208] = new Class1_Sub1_Sub2_Sub1(local203, "mod_icons", local1208);
			}
			@Pc(1231) Class1_Sub1_Sub2_Sub4 local1231 = new Class1_Sub1_Sub2_Sub4(local203, "backleft1", 0);
			this.aClass50_19 = new Class50(local1231.anInt829, this.method577((byte) 7), local1231.anInt828, (byte) 1);
			local1231.method552(0, 0);
			@Pc(1256) Class1_Sub1_Sub2_Sub4 local1256 = new Class1_Sub1_Sub2_Sub4(local203, "backleft2", 0);
			this.aClass50_20 = new Class50(local1256.anInt829, this.method577((byte) 7), local1256.anInt828, (byte) 1);
			local1256.method552(0, 0);
			@Pc(1281) Class1_Sub1_Sub2_Sub4 local1281 = new Class1_Sub1_Sub2_Sub4(local203, "backright1", 0);
			this.aClass50_21 = new Class50(local1281.anInt829, this.method577((byte) 7), local1281.anInt828, (byte) 1);
			local1281.method552(0, 0);
			@Pc(1306) Class1_Sub1_Sub2_Sub4 local1306 = new Class1_Sub1_Sub2_Sub4(local203, "backright2", 0);
			this.aClass50_22 = new Class50(local1306.anInt829, this.method577((byte) 7), local1306.anInt828, (byte) 1);
			local1306.method552(0, 0);
			@Pc(1331) Class1_Sub1_Sub2_Sub4 local1331 = new Class1_Sub1_Sub2_Sub4(local203, "backtop1", 0);
			this.aClass50_23 = new Class50(local1331.anInt829, this.method577((byte) 7), local1331.anInt828, (byte) 1);
			local1331.method552(0, 0);
			@Pc(1356) Class1_Sub1_Sub2_Sub4 local1356 = new Class1_Sub1_Sub2_Sub4(local203, "backvmid1", 0);
			this.aClass50_24 = new Class50(local1356.anInt829, this.method577((byte) 7), local1356.anInt828, (byte) 1);
			local1356.method552(0, 0);
			@Pc(1381) Class1_Sub1_Sub2_Sub4 local1381 = new Class1_Sub1_Sub2_Sub4(local203, "backvmid2", 0);
			this.aClass50_25 = new Class50(local1381.anInt829, this.method577((byte) 7), local1381.anInt828, (byte) 1);
			local1381.method552(0, 0);
			@Pc(1406) Class1_Sub1_Sub2_Sub4 local1406 = new Class1_Sub1_Sub2_Sub4(local203, "backvmid3", 0);
			this.aClass50_26 = new Class50(local1406.anInt829, this.method577((byte) 7), local1406.anInt828, (byte) 1);
			local1406.method552(0, 0);
			@Pc(1431) Class1_Sub1_Sub2_Sub4 local1431 = new Class1_Sub1_Sub2_Sub4(local203, "backhmid2", 0);
			this.aClass50_27 = new Class50(local1431.anInt829, this.method577((byte) 7), local1431.anInt828, (byte) 1);
			local1431.method552(0, 0);
			@Pc(1456) int local1456 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1463) int local1463 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1470) int local1470 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1477) int local1477 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1479) int local1479 = 0; local1479 < 100; local1479++) {
				if (this.aClass1_Sub1_Sub2_Sub4Array8[local1479] != null) {
					this.aClass1_Sub1_Sub2_Sub4Array8[local1479].method550(local1470 + local1477, aByte46, local1456 + local1477, local1463 + local1477);
				}
				if (this.aClass1_Sub1_Sub2_Sub1Array5[local1479] != null) {
					this.aClass1_Sub1_Sub2_Sub1Array5[local1479].method61(local1470 + local1477, aByte46, local1456 + local1477, local1463 + local1477);
				}
			}
			this.method579(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub2.method85(local215);
			Class1_Sub1_Sub2_Sub2.method89(0.8D);
			Class1_Sub1_Sub2_Sub2.method84();
			this.method579(86, "Unpacking config");
			Class16.method207(local179);
			Class42.method391(local179);
			Class24.method284(local179);
			Class5.method16(local179);
			Class27.method291(local179);
			Class32.method310(local179);
			Class48.method479(local179);
			Class30.method295(local179);
			Class49.method482(local179);
			Class5.aBoolean17 = aBoolean221;
			if (!aBoolean222) {
				this.method579(90, "Unpacking sounds");
				@Pc(1582) byte[] local1582 = local239.method337("sounds.dat", null);
				@Pc(1588) Class1_Sub1_Sub3 local1588 = new Class1_Sub1_Sub3((byte) 9, local1582);
				Class17.method210(local1588);
			}
			this.method579(95, "Unpacking interfaces");
			@Pc(1619) Class1_Sub1_Sub2_Sub3[] local1619 = new Class1_Sub1_Sub2_Sub3[] { this.aClass1_Sub1_Sub2_Sub3_2, this.aClass1_Sub1_Sub2_Sub3_3, this.aClass1_Sub1_Sub2_Sub3_4, this.aClass1_Sub1_Sub2_Sub3_5 };
			Class38.method349(local191, local1619, (byte) 5, local203);
			this.method579(100, "Preparing game engine");
			@Pc(1635) int local1635;
			@Pc(1637) int local1637;
			@Pc(1639) int local1639;
			for (@Pc(1631) int local1631 = 0; local1631 < 33; local1631++) {
				local1635 = 999;
				local1637 = 0;
				for (local1639 = 0; local1639 < 34; local1639++) {
					if (this.aClass1_Sub1_Sub2_Sub1_17.aByteArray2[local1639 + local1631 * this.aClass1_Sub1_Sub2_Sub1_17.anInt126] == 0) {
						if (local1635 == 999) {
							local1635 = local1639;
						}
					} else if (local1635 != 999) {
						local1637 = local1639;
						break;
					}
				}
				this.anIntArray215[local1631] = local1635;
				this.anIntArray232[local1631] = local1637 - local1635;
			}
			@Pc(1697) int local1697;
			for (local1635 = 5; local1635 < 156; local1635++) {
				local1637 = 999;
				local1639 = 0;
				for (local1697 = 25; local1697 < 172; local1697++) {
					if (this.aClass1_Sub1_Sub2_Sub1_17.aByteArray2[local1697 + local1635 * this.aClass1_Sub1_Sub2_Sub1_17.anInt126] == 0 && (local1697 > 34 || local1635 > 34)) {
						if (local1637 == 999) {
							local1637 = local1697;
						}
					} else if (local1637 != 999) {
						local1639 = local1697;
						break;
					}
				}
				this.anIntArray270[local1635 - 5] = local1637 - 25;
				this.anIntArray214[local1635 - 5] = local1639 - local1637;
			}
			Class1_Sub1_Sub2_Sub2.method82(96, 479);
			this.anIntArray216 = Class1_Sub1_Sub2_Sub2.anIntArray18;
			Class1_Sub1_Sub2_Sub2.method82(261, 190);
			this.anIntArray217 = Class1_Sub1_Sub2_Sub2.anIntArray18;
			Class1_Sub1_Sub2_Sub2.method82(334, 512);
			this.anIntArray218 = Class1_Sub1_Sub2_Sub2.anIntArray18;
			@Pc(1781) int[] local1781 = new int[9];
			for (local1639 = 0; local1639 < 9; local1639++) {
				local1697 = local1639 * 32 + 128 + 15;
				@Pc(1799) int local1799 = local1697 * 3 + 600;
				@Pc(1803) int local1803 = Class1_Sub1_Sub2_Sub2.anIntArray16[local1697];
				local1781[local1639] = local1799 * local1803 >> 16;
			}
			Class21.method265(local1781, (byte) 7);
			Class14.method116(local227);
			this.aClass19_1 = new Class19(0, this);
			this.method578(this.aClass19_1, 10);
			Class1_Sub1_Sub1_Sub1.aClient1 = this;
			Class42.aClient5 = this;
			Class27.aClient3 = this;
		} catch (@Pc(1844) Exception local1844) {
			signlink.reporterror("loaderror " + this.aString17 + " " + this.anInt1040);
			this.aBoolean211 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method606() {
		try {
			this.aClass50_18.method562();
			Class1_Sub1_Sub2_Sub2.anIntArray18 = this.anIntArray216;
			this.aClass1_Sub1_Sub2_Sub1_18.method62(0, 0);
			if (this.aBoolean210) {
				this.aClass1_Sub1_Sub2_Sub3_4.method420(40, this.aString26, 0, 239);
				this.aClass1_Sub1_Sub2_Sub3_4.method420(60, this.aString24 + "*", 128, 239);
			} else if (this.anInt923 == 1) {
				this.aClass1_Sub1_Sub2_Sub3_4.method420(40, "Enter amount:", 0, 239);
				this.aClass1_Sub1_Sub2_Sub3_4.method420(60, this.aString18 + "*", 128, 239);
			} else if (this.anInt923 == 2) {
				this.aClass1_Sub1_Sub2_Sub3_4.method420(40, "Enter name:", 0, 239);
				this.aClass1_Sub1_Sub2_Sub3_4.method420(60, this.aString18 + "*", 128, 239);
			} else if (this.aString30 != null) {
				this.aClass1_Sub1_Sub2_Sub3_4.method420(40, this.aString30, 0, 239);
				this.aClass1_Sub1_Sub2_Sub3_4.method420(60, "Click to continue", 128, 239);
			} else if (this.anInt925 != -1) {
				this.method711(Class38.aClass38Array1[this.anInt925], 0, 0, 0, (byte) 7);
			} else if (this.anInt1062 == -1) {
				@Pc(167) Class1_Sub1_Sub2_Sub3 local167 = this.aClass1_Sub1_Sub2_Sub3_3;
				@Pc(169) int local169 = 0;
				Class1_Sub1_Sub2.method539(0, 0, 463, 77);
				for (@Pc(177) int local177 = 0; local177 < 100; local177++) {
					if (this.aStringArray11[local177] != null) {
						@Pc(189) int local189 = this.anIntArray223[local177];
						@Pc(198) int local198 = this.anInt869 + 70 - local169 * 14;
						@Pc(203) String local203 = this.aStringArray10[local177];
						@Pc(205) byte local205 = 0;
						if (local203 != null && local203.startsWith("@cr1@")) {
							local203 = local203.substring(5);
							local205 = 1;
						}
						if (local203 != null && local203.startsWith("@cr2@")) {
							local203 = local203.substring(5);
							local205 = 2;
						}
						if (local189 == 0) {
							if (local198 > 0 && local198 < 110) {
								local167.method424(4, this.aStringArray11[local177], 0, local198);
							}
							local169++;
						}
						@Pc(275) int local275;
						if ((local189 == 1 || local189 == 2) && (local189 == 1 || this.anInt1050 == 0 || this.anInt1050 == 1 && this.method627(local203))) {
							if (local198 > 0 && local198 < 110) {
								local275 = 4;
								if (local205 == 1) {
									this.aClass1_Sub1_Sub2_Sub1Array2[0].method62(local198 - 12, 4);
									local275 += 14;
								}
								if (local205 == 2) {
									this.aClass1_Sub1_Sub2_Sub1Array2[1].method62(local198 - 12, local275);
									local275 += 14;
								}
								local167.method424(local275, local203 + ":", 0, local198);
								local275 += local167.method422(local203) + 8;
								local167.method424(local275, this.aStringArray11[local177], 255, local198);
							}
							local169++;
						}
						if ((local189 == 3 || local189 == 7) && this.anInt1039 == 0 && (local189 == 7 || this.anInt982 == 0 || this.anInt982 == 1 && this.method627(local203))) {
							if (local198 > 0 && local198 < 110) {
								local167.method424(4, "From", 0, local198);
								local275 = local167.method422("From ") + 4;
								if (local205 == 1) {
									this.aClass1_Sub1_Sub2_Sub1Array2[0].method62(local198 - 12, local275);
									local275 += 14;
								}
								if (local205 == 2) {
									this.aClass1_Sub1_Sub2_Sub1Array2[1].method62(local198 - 12, local275);
									local275 += 14;
								}
								local167.method424(local275, local203 + ":", 0, local198);
								local275 += local167.method422(local203) + 8;
								local167.method424(local275, this.aStringArray11[local177], 8388608, local198);
							}
							local169++;
						}
						if (local189 == 4 && (this.anInt892 == 0 || this.anInt892 == 1 && this.method627(local203))) {
							if (local198 > 0 && local198 < 110) {
								local167.method424(4, local203 + " " + this.aStringArray11[local177], 8388736, local198);
							}
							local169++;
						}
						if (local189 == 5 && this.anInt1039 == 0 && this.anInt982 < 2) {
							if (local198 > 0 && local198 < 110) {
								local167.method424(4, this.aStringArray11[local177], 8388608, local198);
							}
							local169++;
						}
						if (local189 == 6 && this.anInt1039 == 0 && this.anInt982 < 2) {
							if (local198 > 0 && local198 < 110) {
								local167.method424(4, "To " + local203 + ":", 0, local198);
								local167.method424(local167.method422("To " + local203) + 12, this.aStringArray11[local177], 8388608, local198);
							}
							local169++;
						}
						if (local189 == 8 && (this.anInt892 == 0 || this.anInt892 == 1 && this.method627(local203))) {
							if (local198 > 0 && local198 < 110) {
								local167.method424(4, local203 + " " + this.aStringArray11[local177], 8270336, local198);
							}
							local169++;
						}
					}
				}
				Class1_Sub1_Sub2.method538();
				this.anInt1063 = local169 * 14 + 7;
				if (this.anInt1063 < 78) {
					this.anInt1063 = 78;
				}
				this.method621(this.anInt1063 - this.anInt869 - 77, 77, 463, 0, this.anInt1063);
				@Pc(645) String local645;
				if (aClass1_Sub1_Sub1_Sub2_Sub2_1 == null || aClass1_Sub1_Sub1_Sub2_Sub2_1.aString8 == null) {
					local645 = Class44.method452(this.aString20);
				} else {
					local645 = aClass1_Sub1_Sub1_Sub2_Sub2_1.aString8;
				}
				local167.method424(4, local645 + ":", 0, 90);
				local167.method424(local167.method422(local645 + ": ") + 6, this.aString19 + "*", 255, 90);
				Class1_Sub1_Sub2.method545(0, 77, 479, 0);
			} else {
				this.method711(Class38.aClass38Array1[this.anInt1062], 0, 0, 0, (byte) 7);
			}
			if (this.aBoolean217 && this.anInt1005 == 2) {
				this.method679();
			}
			this.aClass50_18.method563(357, super.aGraphics2, 418, 17);
			this.aClass50_17.method562();
			Class1_Sub1_Sub2_Sub2.anIntArray18 = this.anIntArray218;
		} catch (@Pc(726) RuntimeException local726) {
			signlink.reporterror("12419, " + false + ", " + local726.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!RWLOYYVC;)Z")
	private boolean method607(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt640;
			if (this.anInt868 == 2) {
				if (local4 == 201) {
					this.aBoolean239 = true;
					this.anInt923 = 0;
					this.aBoolean210 = true;
					this.aString24 = "";
					this.anInt990 = 1;
					this.aString26 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean239 = true;
					this.anInt923 = 0;
					this.aBoolean210 = true;
					this.aString24 = "";
					this.anInt990 = 2;
					this.aString26 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt959 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean239 = true;
				this.anInt923 = 0;
				this.aBoolean210 = true;
				this.aString24 = "";
				this.anInt990 = 4;
				this.aString26 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean239 = true;
				this.anInt923 = 0;
				this.aBoolean210 = true;
				this.aString24 = "";
				this.anInt990 = 5;
				this.aString26 = "Enter name of player to delete from list";
			}
			@Pc(122) int local122;
			@Pc(126) int local126;
			@Pc(131) int local131;
			if (local4 >= 300 && local4 <= 313) {
				local122 = (local4 - 300) / 2;
				local126 = local4 & 0x1;
				local131 = this.anIntArray261[local122];
				if (local131 != -1) {
					while (true) {
						if (local126 == 0) {
							local131--;
							if (local131 < 0) {
								local131 = Class32.anInt514 - 1;
							}
						}
						if (local126 == 1) {
							local131++;
							if (local131 >= Class32.anInt514) {
								local131 = 0;
							}
						}
						if (!Class32.aClass32Array1[local131].aBoolean105 && Class32.aClass32Array1[local131].anInt515 == local122 + (this.aBoolean196 ? 0 : 7)) {
							this.anIntArray261[local122] = local131;
							this.aBoolean223 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local122 = (local4 - 314) / 2;
				local126 = local4 & 0x1;
				local131 = this.anIntArray265[local122];
				if (local126 == 0) {
					local131--;
					if (local131 < 0) {
						local131 = anIntArrayArray25[local122].length - 1;
					}
				}
				if (local126 == 1) {
					local131++;
					if (local131 >= anIntArrayArray25[local122].length) {
						local131 = 0;
					}
				}
				this.anIntArray265[local122] = local131;
				this.aBoolean223 = true;
			}
			if (local4 == 324 && !this.aBoolean196) {
				this.aBoolean196 = true;
				this.method611();
			}
			if (local4 == 325 && this.aBoolean196) {
				this.aBoolean196 = false;
				this.method611();
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub3_7.method487(77);
				this.aClass1_Sub1_Sub3_7.method488(this.aBoolean196 ? 0 : 1);
				for (local122 = 0; local122 < 7; local122++) {
					this.aClass1_Sub1_Sub3_7.method488(this.anIntArray261[local122]);
				}
				for (local126 = 0; local126 < 5; local126++) {
					this.aClass1_Sub1_Sub3_7.method488(this.anIntArray265[local126]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean203 = !this.aBoolean203;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method622();
				if (this.aString25.length() > 0) {
					this.aClass1_Sub1_Sub3_7.method487(251);
					this.aClass1_Sub1_Sub3_7.method494(155, Class44.method448(this.aString25));
					this.aClass1_Sub1_Sub3_7.method488(local4 - 601);
					this.aClass1_Sub1_Sub3_7.method488(this.aBoolean203 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("63990, " + 67 + ", " + arg0 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method608(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("4424, " + arg0 + ", " + -30532 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub3 local1 = null;
			for (@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) this.aClass13_10.method111(); local6 != null; local6 = (Class1_Sub3) this.aClass13_10.method113()) {
				if (local6.anInt494 == arg3 && local6.anInt496 == arg0 && local6.anInt497 == arg8 && local6.anInt495 == arg5) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub3();
				local1.anInt494 = arg3;
				local1.anInt495 = arg5;
				local1.anInt496 = arg0;
				local1.anInt497 = arg8;
				this.method652(local1, this.aBoolean206);
				this.aClass13_10.method108(local1);
			}
			local1.anInt502 = arg6;
			local1.anInt504 = arg2;
			local1.anInt503 = arg1;
			local1.anInt501 = arg7;
			local1.anInt493 = arg4;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("13651, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method610(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt921; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt920;
				} else {
					local11 = this.anIntArray220[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub2_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local11];
				if (local23 != null) {
					this.method695(local23, 1, this.aByte52);
				}
			}
			if (!arg0) {
				anInt862++;
				if (anInt862 > 71) {
					anInt862 = 0;
					this.aClass1_Sub1_Sub3_7.method487(13);
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("18957, " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method611() {
		try {
			this.aBoolean223 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray261[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class32.anInt514; local15++) {
					if (!Class32.aClass32Array1[local15].aBoolean105 && Class32.aClass32Array1[local15].anInt515 == local6 + (this.aBoolean196 ? 0 : 7)) {
						this.anIntArray261[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("23819, " + -23057 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method612(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt994; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt994--;
						this.aBoolean219 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt994; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_7.method487(43);
						this.aClass1_Sub1_Sub3_7.method494(155, arg0);
						break;
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("41471, " + arg0 + ", " + false + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method613(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt867; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt867--;
						this.aBoolean219 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt867; local28++) {
							this.aStringArray9[local28] = this.aStringArray9[local28 + 1];
							this.anIntArray242[local28] = this.anIntArray242[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_7.method487(1);
						this.aClass1_Sub1_Sub3_7.method494(155, arg0);
						break;
					}
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("97437, " + arg0 + ", " + -26833 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method614() {
		try {
			this.aBoolean220 = false;
			while (this.aBoolean199) {
				this.aBoolean220 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub1_6 = null;
			this.aClass1_Sub1_Sub2_Sub1_7 = null;
			this.aClass1_Sub1_Sub2_Sub1Array3 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.anIntArray230 = null;
			this.anIntArray231 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.aClass1_Sub1_Sub2_Sub4_3 = null;
			this.aClass1_Sub1_Sub2_Sub4_4 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("53946, " + 74 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method615() {
		try {
			if (this.anInt985 == 2) {
				this.method626((this.anInt1029 - this.anInt915 << 7) + this.anInt1032, this.anInt1031 * 2, (this.anInt1030 - this.anInt916 << 7) + this.anInt1033);
				if (this.aByte50 != -18) {
					this.anInt897 = this.aClass2_2.method13();
				}
				if (this.anInt960 > -1 && anInt987 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub4Array7[2].method554(this.anInt961 - 28, this.anInt960 - 12);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("33083, " + -18 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Z")
	private boolean method616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class38 local12 = Class38.aClass38Array1[arg0];
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray158.length && local12.anIntArray158[local14] != -1; local14++) {
				@Pc(29) Class38 local29 = Class38.aClass38Array1[local12.anIntArray158[local14]];
				if (local29.anInt646 == 1) {
					local3 |= this.method616(local29.anInt641, arg1);
				}
				@Pc(64) int local64;
				if (local29.anInt646 == 6 && (local29.anInt629 != -1 || local29.anInt630 != -1)) {
					@Pc(59) boolean local59 = this.method712(local29);
					if (local59) {
						local64 = local29.anInt630;
					} else {
						local64 = local29.anInt629;
					}
					if (local64 != -1) {
						@Pc(76) Class16 local76 = Class16.aClass16Array1[local64];
						local29.anInt631 += arg1;
						while (local29.anInt631 > local76.method208(local29.anInt645)) {
							local29.anInt631 -= local76.method208(local29.anInt645) + 1;
							local29.anInt645++;
							if (local29.anInt645 >= local76.anInt333) {
								local29.anInt645 -= local76.anInt334;
								if (local29.anInt645 < 0 || local29.anInt645 >= local76.anInt333) {
									local29.anInt645 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local29.anInt646 == 6 && local29.anInt618 != 0) {
					@Pc(147) int local147 = local29.anInt618 >> 16;
					local64 = local29.anInt618 << 16 >> 16;
					@Pc(158) int local158 = local147 * arg1;
					local64 *= arg1;
					local29.anInt626 = local29.anInt626 + local158 & 0x7FF;
					local29.anInt627 = local29.anInt627 + local64 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("24614, " + arg0 + ", " + -217 + ", " + arg1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)Z")
	private boolean method617(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte47 != 7) {
				throw new NullPointerException();
			}
			@Pc(7) boolean local7 = false;
			if (this.aClass12_1 == null) {
				return false;
			}
			@Pc(370) String local370;
			@Pc(175) int local175;
			try {
				@Pc(22) int local22 = this.aClass12_1.method104();
				if (local22 == 0) {
					return false;
				}
				if (this.anInt956 == -1) {
					this.aClass12_1.method105(this.aClass1_Sub1_Sub3_8.aByteArray19, 0, 1);
					this.anInt956 = this.aClass1_Sub1_Sub3_8.aByteArray19[0] & 0xFF;
					if (this.aClass2_2 != null) {
						this.anInt956 = this.anInt956 - this.aClass2_2.method13() & 0xFF;
					}
					this.anInt955 = Class46.anIntArray200[this.anInt956];
					local22--;
				}
				if (this.anInt955 == -1) {
					if (local22 <= 0) {
						return false;
					}
					this.aClass12_1.method105(this.aClass1_Sub1_Sub3_8.aByteArray19, 0, 1);
					this.anInt955 = this.aClass1_Sub1_Sub3_8.aByteArray19[0] & 0xFF;
					local22--;
				}
				if (this.anInt955 == -2) {
					if (local22 <= 1) {
						return false;
					}
					this.aClass12_1.method105(this.aClass1_Sub1_Sub3_8.aByteArray19, 0, 2);
					this.aClass1_Sub1_Sub3_8.anInt806 = 0;
					this.anInt955 = this.aClass1_Sub1_Sub3_8.method500();
					local22 -= 2;
				}
				if (local22 < this.anInt955) {
					return false;
				}
				this.aClass1_Sub1_Sub3_8.anInt806 = 0;
				this.aClass12_1.method105(this.aClass1_Sub1_Sub3_8.aByteArray19, 0, this.anInt955);
				this.anInt957 = 0;
				this.anInt882 = this.anInt881;
				this.anInt881 = this.anInt880;
				this.anInt880 = this.anInt956;
				@Pc(180) int local180;
				@Pc(197) int local197;
				@Pc(170) int local170;
				if (this.anInt956 == 212) {
					this.aBoolean219 = true;
					local170 = this.aClass1_Sub1_Sub3_8.method530((byte) 1);
					local175 = this.aClass1_Sub1_Sub3_8.method517();
					local180 = this.aClass1_Sub1_Sub3_8.method516();
					this.anIntArray248[local175] = local170;
					this.anIntArray219[local175] = local180;
					this.anIntArray264[local175] = 1;
					for (local197 = 0; local197 < 98; local197++) {
						if (local170 >= anIntArray212[local197]) {
							this.anIntArray264[local175] = local197 + 2;
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 184) {
					if (this.anInt926 == 12) {
						this.aBoolean219 = true;
					}
					this.anInt889 = this.aClass1_Sub1_Sub3_8.method501();
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 113) {
					if (this.anInt878 != -1) {
						this.anInt878 = -1;
						this.aBoolean219 = true;
						this.aBoolean242 = true;
					}
					if (this.anInt925 != -1) {
						this.anInt925 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt923 != 0) {
						this.anInt923 = 0;
						this.aBoolean239 = true;
					}
					this.anInt934 = -1;
					this.aBoolean228 = false;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 36) {
					this.aBoolean193 = false;
					for (local170 = 0; local170 < 5; local170++) {
						this.aBooleanArray11[local170] = false;
					}
					this.anInt956 = -1;
					return true;
				}
				@Pc(342) int local342;
				if (this.anInt956 == 239) {
					local170 = this.aClass1_Sub1_Sub3_8.method525();
					local175 = this.aClass1_Sub1_Sub3_8.method500();
					local180 = local170 >> 10 & 0x1F;
					local197 = local170 >> 5 & 0x1F;
					local342 = local170 & 0x1F;
					Class38.aClass38Array1[local175].anInt617 = (local180 << 19) + (local197 << 11) + (local342 << 3);
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 204) {
					local370 = this.aClass1_Sub1_Sub3_8.method505();
					local175 = this.aClass1_Sub1_Sub3_8.method517();
					local180 = this.aClass1_Sub1_Sub3_8.method498();
					if (local175 >= 1 && local175 <= 5) {
						if (local370.equalsIgnoreCase("null")) {
							local370 = null;
						}
						this.aStringArray13[local175 - 1] = local370;
						this.aBooleanArray12[local175 - 1] = local180 == 0;
					}
					this.anInt956 = -1;
					return true;
				}
				@Pc(427) String local427;
				if (this.anInt956 == 171) {
					local170 = this.aClass1_Sub1_Sub3_8.method523();
					local427 = this.aClass1_Sub1_Sub3_8.method505();
					Class38.aClass38Array1[local170].aString11 = local427;
					if (Class38.aClass38Array1[local170].anInt628 == this.anIntArray213[this.anInt926]) {
						this.aBoolean219 = true;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 189) {
					this.anInt979 = this.aClass1_Sub1_Sub3_8.method500();
					this.anInt871 = this.aClass1_Sub1_Sub3_8.method517();
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 138) {
					this.method592(this.aClass1_Sub1_Sub3_8, this.anInt955);
					this.anInt956 = -1;
					return true;
				}
				@Pc(547) int local547;
				@Pc(849) int local849;
				@Pc(870) int local870;
				if (this.anInt956 == 211 || this.anInt956 == 152) {
					local170 = this.anInt895;
					local175 = this.anInt896;
					if (this.anInt956 == 211) {
						local170 = this.aClass1_Sub1_Sub3_8.method523();
						local175 = this.aClass1_Sub1_Sub3_8.method500();
						this.aBoolean218 = false;
					}
					if (this.anInt956 == 152) {
						local170 = this.aClass1_Sub1_Sub3_8.method523();
						this.aClass1_Sub1_Sub3_8.method508((byte) 7);
						local180 = 0;
						while (true) {
							if (local180 >= 4) {
								this.aClass1_Sub1_Sub3_8.method510();
								local175 = this.aClass1_Sub1_Sub3_8.method524();
								this.aBoolean218 = true;
								break;
							}
							for (local197 = 0; local197 < 13; local197++) {
								for (local342 = 0; local342 < 13; local342++) {
									local547 = this.aClass1_Sub1_Sub3_8.method509(1);
									if (local547 == 1) {
										this.anIntArrayArrayArray7[local180][local197][local342] = this.aClass1_Sub1_Sub3_8.method509(26);
									} else {
										this.anIntArrayArrayArray7[local180][local197][local342] = -1;
									}
								}
							}
							local180++;
						}
					}
					if (this.anInt895 == local170 && this.anInt896 == local175 && this.anInt913 == 2) {
						this.anInt956 = -1;
						return true;
					}
					this.anInt895 = local170;
					this.anInt896 = local175;
					this.anInt915 = (this.anInt895 - 6) * 8;
					this.anInt916 = (this.anInt896 - 6) * 8;
					this.aBoolean195 = false;
					if ((this.anInt895 / 8 == 48 || this.anInt895 / 8 == 49) && this.anInt896 / 8 == 48) {
						this.aBoolean195 = true;
					}
					if (this.anInt895 / 8 == 48 && this.anInt896 / 8 == 148) {
						this.aBoolean195 = true;
					}
					this.anInt913 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.aClass50_17.method562();
					this.aClass1_Sub1_Sub2_Sub3_3.method420(151, "Loading - please wait.", 0, 257);
					this.aClass1_Sub1_Sub2_Sub3_3.method420(150, "Loading - please wait.", 16777215, 256);
					this.aClass50_17.method563(4, super.aGraphics2, 418, 4);
					if (this.anInt956 == 211) {
						local180 = 0;
						local197 = (this.anInt895 - 6) / 8;
						label1146: while (true) {
							if (local197 > (this.anInt895 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local180][];
								this.aByteArrayArray4 = new byte[local180][];
								this.anIntArray245 = new int[local180];
								this.anIntArray246 = new int[local180];
								this.anIntArray247 = new int[local180];
								local180 = 0;
								local342 = (this.anInt895 - 6) / 8;
								while (true) {
									if (local342 > (this.anInt895 + 6) / 8) {
										break label1146;
									}
									for (local547 = (this.anInt896 - 6) / 8; local547 <= (this.anInt896 + 6) / 8; local547++) {
										this.anIntArray245[local180] = (local342 << 8) + local547;
										if (this.aBoolean195 && (local547 == 49 || local547 == 149 || local547 == 147 || local342 == 50 || local342 == 49 && local547 == 47)) {
											this.anIntArray246[local180] = -1;
											this.anIntArray247[local180] = -1;
											local180++;
										} else {
											local849 = this.anIntArray246[local180] = this.aClass35_Sub1_1.method378(0, local342, local547);
											if (local849 != -1) {
												this.aClass35_Sub1_1.method370(3, local849);
											}
											local870 = this.anIntArray247[local180] = this.aClass35_Sub1_1.method378(1, local342, local547);
											if (local870 != -1) {
												this.aClass35_Sub1_1.method370(3, local870);
											}
											local180++;
										}
									}
									local342++;
								}
							}
							for (local342 = (this.anInt896 - 6) / 8; local342 <= (this.anInt896 + 6) / 8; local342++) {
								local180++;
							}
							local197++;
						}
					}
					if (this.anInt956 == 152) {
						local180 = 0;
						@Pc(906) int[] local906 = new int[676];
						local342 = 0;
						label1107: while (true) {
							@Pc(952) int local952;
							@Pc(936) int local936;
							@Pc(942) int local942;
							if (local342 >= 4) {
								this.aByteArrayArray5 = new byte[local180][];
								this.aByteArrayArray4 = new byte[local180][];
								this.anIntArray245 = new int[local180];
								this.anIntArray246 = new int[local180];
								this.anIntArray247 = new int[local180];
								local547 = 0;
								while (true) {
									if (local547 >= local180) {
										break label1107;
									}
									local849 = this.anIntArray245[local547] = local906[local547];
									local870 = local849 >> 8 & 0xFF;
									local936 = local849 & 0xFF;
									local942 = this.anIntArray246[local547] = this.aClass35_Sub1_1.method378(0, local870, local936);
									if (local942 != -1) {
										this.aClass35_Sub1_1.method370(3, local942);
									}
									local952 = this.anIntArray247[local547] = this.aClass35_Sub1_1.method378(1, local870, local936);
									if (local952 != -1) {
										this.aClass35_Sub1_1.method370(3, local952);
									}
									local547++;
								}
							}
							for (local547 = 0; local547 < 13; local547++) {
								for (local849 = 0; local849 < 13; local849++) {
									local870 = this.anIntArrayArrayArray7[local342][local547][local849];
									if (local870 != -1) {
										local936 = local870 >> 14 & 0x3FF;
										local942 = local870 >> 3 & 0x7FF;
										local952 = (local936 / 8 << 8) + local942 / 8;
										for (@Pc(954) int local954 = 0; local954 < local180; local954++) {
											if (local906[local954] == local952) {
												local952 = -1;
												break;
											}
										}
										if (local952 != -1) {
											local906[local180++] = local952;
										}
									}
								}
							}
							local342++;
						}
					}
					local180 = this.anInt915 - this.anInt917;
					local197 = this.anInt916 - this.anInt918;
					this.anInt917 = this.anInt915;
					this.anInt918 = this.anInt916;
					for (local342 = 0; local342 < 16384; local342++) {
						@Pc(1107) Class1_Sub1_Sub1_Sub2_Sub1 local1107 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local342];
						if (local1107 != null) {
							for (local849 = 0; local849 < 10; local849++) {
								local1107.anIntArray140[local849] -= local180;
								local1107.anIntArray141[local849] -= local197;
							}
							local1107.anInt564 -= local180 * 128;
							local1107.anInt565 -= local197 * 128;
						}
					}
					for (local547 = 0; local547 < this.anInt919; local547++) {
						@Pc(1162) Class1_Sub1_Sub1_Sub2_Sub2 local1162 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local547];
						if (local1162 != null) {
							for (local870 = 0; local870 < 10; local870++) {
								local1162.anIntArray140[local870] -= local180;
								local1162.anIntArray141[local870] -= local197;
							}
							local1162.anInt564 -= local180 * 128;
							local1162.anInt565 -= local197 * 128;
						}
					}
					this.aBoolean225 = true;
					@Pc(1214) byte local1214 = 0;
					@Pc(1216) byte local1216 = 104;
					@Pc(1218) byte local1218 = 1;
					if (local180 < 0) {
						local1214 = 103;
						local1216 = -1;
						local1218 = -1;
					}
					@Pc(1228) byte local1228 = 0;
					@Pc(1230) byte local1230 = 104;
					@Pc(1232) byte local1232 = 1;
					if (local197 < 0) {
						local1228 = 103;
						local1230 = -1;
						local1232 = -1;
					}
					for (@Pc(1242) int local1242 = local1214; local1242 != local1216; local1242 += local1218) {
						for (@Pc(1246) int local1246 = local1228; local1246 != local1230; local1246 += local1232) {
							@Pc(1252) int local1252 = local1242 + local180;
							@Pc(1256) int local1256 = local1246 + local197;
							for (@Pc(1258) int local1258 = 0; local1258 < 4; local1258++) {
								if (local1252 >= 0 && local1256 >= 0 && local1252 < 104 && local1256 < 104) {
									this.aClass13ArrayArrayArray1[local1258][local1242][local1246] = this.aClass13ArrayArrayArray1[local1258][local1252][local1256];
								} else {
									this.aClass13ArrayArrayArray1[local1258][local1242][local1246] = null;
								}
							}
						}
					}
					for (@Pc(1320) Class1_Sub3 local1320 = (Class1_Sub3) this.aClass13_10.method111(); local1320 != null; local1320 = (Class1_Sub3) this.aClass13_10.method113()) {
						local1320.anInt496 -= local180;
						local1320.anInt497 -= local197;
						if (local1320.anInt496 < 0 || local1320.anInt497 < 0 || local1320.anInt496 >= 104 || local1320.anInt497 >= 104) {
							local1320.method565();
						}
					}
					if (this.anInt945 != 0) {
						this.anInt945 -= local180;
						this.anInt946 -= local197;
					}
					this.aBoolean193 = false;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 58) {
					this.anInt971 = this.aClass1_Sub1_Sub3_8.method500() * 30;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 101) {
					this.anInt1026 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 3) {
					this.method618(this.anInt955, 771, this.aClass1_Sub1_Sub3_8);
					this.aBoolean225 = false;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 217) {
					local170 = this.aClass1_Sub1_Sub3_8.method525();
					this.method686(local170);
					if (this.anInt878 != -1) {
						this.anInt878 = -1;
						this.aBoolean219 = true;
						this.aBoolean242 = true;
					}
					if (this.anInt925 != -1) {
						this.anInt925 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt923 != 0) {
						this.anInt923 = 0;
						this.aBoolean239 = true;
					}
					this.anInt934 = local170;
					this.aBoolean228 = false;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 132) {
					for (local170 = 0; local170 < this.anIntArray273.length; local170++) {
						if (this.anIntArray273[local170] != this.anIntArray228[local170]) {
							this.anIntArray273[local170] = this.anIntArray228[local170];
							this.method708(local170);
							this.aBoolean219 = true;
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 170) {
					this.anInt966 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 207) {
					local170 = this.aClass1_Sub1_Sub3_8.method500();
					@Pc(1555) byte local1555 = this.aClass1_Sub1_Sub3_8.method499();
					this.anIntArray228[local170] = local1555;
					if (this.anIntArray273[local170] != local1555) {
						this.anIntArray273[local170] = local1555;
						this.method708(local170);
						this.aBoolean219 = true;
						if (this.anInt1062 != -1) {
							this.aBoolean239 = true;
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 126) {
					this.anInt926 = this.aClass1_Sub1_Sub3_8.method516();
					this.aBoolean219 = true;
					this.aBoolean242 = true;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 135) {
					this.anInt994 = this.anInt955 / 8;
					for (local170 = 0; local170 < this.anInt994; local170++) {
						this.aLongArray3[local170] = this.aClass1_Sub1_Sub3_8.method504();
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 149) {
					local170 = this.aClass1_Sub1_Sub3_8.method518();
					local175 = this.aClass1_Sub1_Sub3_8.method500();
					if (local175 == 65535) {
						local175 = -1;
					}
					this.anIntArray213[local170] = local175;
					this.aBoolean219 = true;
					this.aBoolean242 = true;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 177) {
					this.anInt945 = 0;
					this.anInt956 = -1;
					return true;
				}
				@Pc(1704) Class38 local1704;
				if (this.anInt956 == 163) {
					this.aBoolean219 = true;
					local170 = this.aClass1_Sub1_Sub3_8.method500();
					local1704 = Class38.aClass38Array1[local170];
					while (this.aClass1_Sub1_Sub3_8.anInt806 < this.anInt955) {
						local180 = this.aClass1_Sub1_Sub3_8.method512();
						local197 = this.aClass1_Sub1_Sub3_8.method500();
						local342 = this.aClass1_Sub1_Sub3_8.method498();
						if (local342 == 255) {
							local342 = this.aClass1_Sub1_Sub3_8.method503();
						}
						if (local180 >= 0 && local180 < local1704.anIntArray159.length) {
							local1704.anIntArray159[local180] = local197;
							local1704.anIntArray156[local180] = local342;
						}
					}
					this.anInt956 = -1;
					return true;
				}
				@Pc(1772) boolean local1772;
				@Pc(1842) String local1842;
				@Pc(1762) long local1762;
				if (this.anInt956 == 70) {
					local1762 = this.aClass1_Sub1_Sub3_8.method504();
					local180 = this.aClass1_Sub1_Sub3_8.method503();
					local197 = this.aClass1_Sub1_Sub3_8.method498();
					local1772 = false;
					for (local547 = 0; local547 < 100; local547++) {
						if (this.anIntArray263[local547] == local180) {
							local1772 = true;
							break;
						}
					}
					if (local197 <= 1) {
						for (local849 = 0; local849 < this.anInt994; local849++) {
							if (this.aLongArray3[local849] == local1762) {
								local1772 = true;
								break;
							}
						}
					}
					if (!local1772 && this.anInt891 == 0) {
						try {
							this.anIntArray263[this.anInt1028] = local180;
							this.anInt1028 = (this.anInt1028 + 1) % 100;
							local1842 = Class34.method332(this.aBoolean207, this.anInt955 - 13, this.aClass1_Sub1_Sub3_8);
							if (local197 != 3) {
								local1842 = Class14.method126(local1842);
							}
							if (local197 == 2 || local197 == 3) {
								this.method587(local1842, "@cr2@" + Class44.method452(Class44.method449(local1762, (byte) 7)), 7);
							} else if (local197 == 1) {
								this.method587(local1842, "@cr1@" + Class44.method452(Class44.method449(local1762, (byte) 7)), 7);
							} else {
								this.method587(local1842, Class44.method452(Class44.method449(local1762, (byte) 7)), 3);
							}
						} catch (@Pc(1906) Exception local1906) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 245) {
					local170 = this.aClass1_Sub1_Sub3_8.method531();
					local175 = this.aClass1_Sub1_Sub3_8.method500();
					this.anIntArray228[local175] = local170;
					if (this.anIntArray273[local175] != local170) {
						this.anIntArray273[local175] = local170;
						this.method708(local175);
						this.aBoolean219 = true;
						if (this.anInt1062 != -1) {
							this.aBoolean239 = true;
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 60) {
					this.aBoolean219 = true;
					local170 = this.aClass1_Sub1_Sub3_8.method500();
					local1704 = Class38.aClass38Array1[local170];
					local180 = this.aClass1_Sub1_Sub3_8.method500();
					for (local197 = 0; local197 < local180; local197++) {
						local1704.anIntArray159[local197] = this.aClass1_Sub1_Sub3_8.method500();
						local342 = this.aClass1_Sub1_Sub3_8.method518();
						if (local342 == 255) {
							local342 = this.aClass1_Sub1_Sub3_8.method503();
						}
						local1704.anIntArray156[local197] = local342;
					}
					for (local342 = local180; local342 < local1704.anIntArray159.length; local342++) {
						local1704.anIntArray159[local342] = 0;
						local1704.anIntArray156[local342] = 0;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 230) {
					local370 = this.aClass1_Sub1_Sub3_8.method505();
					@Pc(2060) long local2060;
					if (local370.endsWith(":tradereq:")) {
						local427 = local370.substring(0, local370.indexOf(":"));
						local2060 = Class44.method448(local427);
						local1772 = false;
						for (local547 = 0; local547 < this.anInt994; local547++) {
							if (this.aLongArray3[local547] == local2060) {
								local1772 = true;
								break;
							}
						}
						if (!local1772 && this.anInt891 == 0) {
							this.method587("wishes to trade with you.", local427, 4);
						}
					} else if (local370.endsWith(":duelreq:")) {
						local427 = local370.substring(0, local370.indexOf(":"));
						local2060 = Class44.method448(local427);
						local1772 = false;
						for (local547 = 0; local547 < this.anInt994; local547++) {
							if (this.aLongArray3[local547] == local2060) {
								local1772 = true;
								break;
							}
						}
						if (!local1772 && this.anInt891 == 0) {
							this.method587("wishes to duel with you.", local427, 8);
						}
					} else if (local370.endsWith(":chalreq:")) {
						local427 = local370.substring(0, local370.indexOf(":"));
						local2060 = Class44.method448(local427);
						local1772 = false;
						for (local547 = 0; local547 < this.anInt994; local547++) {
							if (this.aLongArray3[local547] == local2060) {
								local1772 = true;
								break;
							}
						}
						if (!local1772 && this.anInt891 == 0) {
							local1842 = local370.substring(local370.indexOf(":") + 1, local370.length() - 9);
							this.method587(local1842, local427, 8);
						}
					} else {
						this.method587(local370, "", 0);
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 240 || this.anInt956 == 35 || this.anInt956 == 159 || this.anInt956 == 26 || this.anInt956 == 80 || this.anInt956 == 128 || this.anInt956 == 37 || this.anInt956 == 61 || this.anInt956 == 72 || this.anInt956 == 251 || this.anInt956 == 102) {
					this.method705(this.anInt956, this.aClass1_Sub1_Sub3_8);
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 52) {
					local170 = this.aClass1_Sub1_Sub3_8.method525();
					this.method686(local170);
					if (this.anInt878 != -1) {
						this.anInt878 = -1;
						this.aBoolean219 = true;
						this.aBoolean242 = true;
					}
					this.anInt925 = local170;
					this.aBoolean239 = true;
					this.anInt934 = -1;
					this.aBoolean228 = false;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 81) {
					local170 = this.aClass1_Sub1_Sub3_8.method500();
					local175 = this.aClass1_Sub1_Sub3_8.method523();
					local180 = this.aClass1_Sub1_Sub3_8.method500();
					if (local170 == 65535) {
						Class38.aClass38Array1[local175].anInt642 = 0;
						this.anInt956 = -1;
						return true;
					}
					@Pc(2348) Class5 local2348 = Class5.method23(local170);
					Class38.aClass38Array1[local175].anInt642 = 4;
					Class38.aClass38Array1[local175].anInt643 = local170;
					Class38.aClass38Array1[local175].anInt626 = local2348.anInt55;
					Class38.aClass38Array1[local175].anInt627 = local2348.anInt48;
					Class38.aClass38Array1[local175].anInt625 = local2348.anInt35 * 100 / local180;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 57) {
					if (this.anInt926 == 12) {
						this.aBoolean219 = true;
					}
					this.anInt865 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 220) {
					local170 = this.aClass1_Sub1_Sub3_8.method528();
					this.anInt1062 = local170;
					this.aBoolean239 = true;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 222) {
					local1762 = this.aClass1_Sub1_Sub3_8.method504();
					local180 = this.aClass1_Sub1_Sub3_8.method498();
					@Pc(2445) String local2445 = Class44.method452(Class44.method449(local1762, (byte) 7));
					for (local342 = 0; local342 < this.anInt867; local342++) {
						if (local1762 == this.aLongArray4[local342]) {
							if (this.anIntArray242[local342] != local180) {
								this.anIntArray242[local342] = local180;
								this.aBoolean219 = true;
								if (local180 > 0) {
									this.method587(local2445 + " has logged in.", "", 5);
								}
								if (local180 == 0) {
									this.method587(local2445 + " has logged out.", "", 5);
								}
							}
							local2445 = null;
							break;
						}
					}
					if (local2445 != null && this.anInt867 < 200) {
						this.aLongArray4[this.anInt867] = local1762;
						this.aStringArray9[this.anInt867] = local2445;
						this.anIntArray242[this.anInt867] = local180;
						this.anInt867++;
						this.aBoolean219 = true;
					}
					@Pc(2543) boolean local2543 = false;
					while (!local2543) {
						local2543 = true;
						for (local849 = 0; local849 < this.anInt867 - 1; local849++) {
							if (this.anIntArray242[local849] != anInt968 && this.anIntArray242[local849 + 1] == anInt968 || this.anIntArray242[local849] == 0 && this.anIntArray242[local849 + 1] != 0) {
								local870 = this.anIntArray242[local849];
								this.anIntArray242[local849] = this.anIntArray242[local849 + 1];
								this.anIntArray242[local849 + 1] = local870;
								@Pc(2604) String local2604 = this.aStringArray9[local849];
								this.aStringArray9[local849] = this.aStringArray9[local849 + 1];
								this.aStringArray9[local849 + 1] = local2604;
								@Pc(2626) long local2626 = this.aLongArray4[local849];
								this.aLongArray4[local849] = this.aLongArray4[local849 + 1];
								this.aLongArray4[local849 + 1] = local2626;
								this.aBoolean219 = true;
								local2543 = false;
							}
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 176) {
					this.anInt866 = this.aClass1_Sub1_Sub3_8.method516();
					if (this.anInt866 == this.anInt926) {
						if (this.anInt866 == 3) {
							this.anInt926 = 1;
						} else {
							this.anInt926 = 3;
						}
						this.aBoolean219 = true;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 183) {
					this.anInt932 = this.aClass1_Sub1_Sub3_8.method517();
					this.anInt931 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 140) {
					for (local170 = 0; local170 < this.aClass1_Sub1_Sub1_Sub2_Sub2Array1.length; local170++) {
						if (this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local170] != null) {
							this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local170].anInt546 = -1;
						}
					}
					for (local175 = 0; local175 < this.aClass1_Sub1_Sub1_Sub2_Sub1Array1.length; local175++) {
						if (this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local175] != null) {
							this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local175].anInt546 = -1;
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 7) {
					this.anInt985 = this.aClass1_Sub1_Sub3_8.method498();
					if (this.anInt985 == 1) {
						this.anInt870 = this.aClass1_Sub1_Sub3_8.method500();
					}
					if (this.anInt985 >= 2 && this.anInt985 <= 6) {
						if (this.anInt985 == 2) {
							this.anInt1032 = 64;
							this.anInt1033 = 64;
						}
						if (this.anInt985 == 3) {
							this.anInt1032 = 0;
							this.anInt1033 = 64;
						}
						if (this.anInt985 == 4) {
							this.anInt1032 = 128;
							this.anInt1033 = 64;
						}
						if (this.anInt985 == 5) {
							this.anInt1032 = 64;
							this.anInt1033 = 0;
						}
						if (this.anInt985 == 6) {
							this.anInt1032 = 64;
							this.anInt1033 = 128;
						}
						this.anInt985 = 2;
						this.anInt1029 = this.aClass1_Sub1_Sub3_8.method500();
						this.anInt1030 = this.aClass1_Sub1_Sub3_8.method500();
						this.anInt1031 = this.aClass1_Sub1_Sub3_8.method498();
					}
					if (this.anInt985 == 10) {
						this.anInt907 = this.aClass1_Sub1_Sub3_8.method500();
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 64) {
					local170 = this.aClass1_Sub1_Sub3_8.method501();
					if (local170 >= 0) {
						this.method686(local170);
					}
					this.anInt894 = local170;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 165) {
					local170 = this.aClass1_Sub1_Sub3_8.method498();
					local175 = this.aClass1_Sub1_Sub3_8.method498();
					local180 = this.aClass1_Sub1_Sub3_8.method498();
					local197 = this.aClass1_Sub1_Sub3_8.method498();
					this.aBooleanArray11[local170] = true;
					this.anIntArray267[local170] = local175;
					this.anIntArray243[local170] = local180;
					this.anIntArray233[local170] = local197;
					this.anIntArray238[local170] = 0;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 250) {
					this.anInt1050 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt982 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt892 = this.aClass1_Sub1_Sub3_8.method498();
					this.aBoolean197 = true;
					this.aBoolean239 = true;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 41) {
					this.anInt868 = this.aClass1_Sub1_Sub3_8.method498();
					this.aBoolean219 = true;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 157) {
					this.aBoolean210 = false;
					this.anInt923 = 1;
					this.aString18 = "";
					this.aBoolean239 = true;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 108) {
					this.aBoolean210 = false;
					this.anInt923 = 2;
					this.aString18 = "";
					this.aBoolean239 = true;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 116) {
					local170 = this.aClass1_Sub1_Sub3_8.method525();
					local175 = this.aClass1_Sub1_Sub3_8.method523();
					if (this.anInt925 != -1) {
						this.anInt925 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt923 != 0) {
						this.anInt923 = 0;
						this.aBoolean239 = true;
					}
					this.anInt934 = local175;
					this.anInt878 = local170;
					this.aBoolean219 = true;
					this.aBoolean242 = true;
					this.aBoolean228 = false;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 164) {
					local170 = this.aClass1_Sub1_Sub3_8.method525();
					local175 = this.aClass1_Sub1_Sub3_8.method524();
					local180 = this.aClass1_Sub1_Sub3_8.method500();
					local197 = this.aClass1_Sub1_Sub3_8.method524();
					Class38.aClass38Array1[local170].anInt626 = local175;
					Class38.aClass38Array1[local170].anInt627 = local180;
					Class38.aClass38Array1[local170].anInt625 = local197;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 56) {
					this.anInt931 = this.aClass1_Sub1_Sub3_8.method518();
					this.anInt932 = this.aClass1_Sub1_Sub3_8.method498();
					for (local170 = this.anInt931; local170 < this.anInt931 + 8; local170++) {
						for (local175 = this.anInt932; local175 < this.anInt932 + 8; local175++) {
							if (this.aClass13ArrayArrayArray1[this.anInt874][local170][local175] != null) {
								this.aClass13ArrayArrayArray1[this.anInt874][local170][local175] = null;
								this.method650(local170, local175);
							}
						}
					}
					for (@Pc(3201) Class1_Sub3 local3201 = (Class1_Sub3) this.aClass13_10.method111(); local3201 != null; local3201 = (Class1_Sub3) this.aClass13_10.method113()) {
						if (local3201.anInt496 >= this.anInt931 && local3201.anInt496 < this.anInt931 + 8 && local3201.anInt497 >= this.anInt932 && local3201.anInt497 < this.anInt932 + 8 && local3201.anInt494 == this.anInt874) {
							local3201.anInt493 = 0;
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 195) {
					local170 = this.aClass1_Sub1_Sub3_8.method500();
					Class38.aClass38Array1[local170].anInt642 = 3;
					if (aClass1_Sub1_Sub1_Sub2_Sub2_1.aClass27_2 == null) {
						Class38.aClass38Array1[local170].anInt643 = (aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray146[0] << 25) + (aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray146[4] << 20) + (aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray145[0] << 15) + (aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray145[8] << 10) + (aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray145[11] << 5) + aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray145[1];
					} else {
						Class38.aClass38Array1[local170].anInt643 = (int) (aClass1_Sub1_Sub1_Sub2_Sub2_1.aClass27_2.aLong14 + 305419896L);
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 216) {
					local170 = this.aClass1_Sub1_Sub3_8.method525();
					local175 = this.aClass1_Sub1_Sub3_8.method500();
					local180 = this.aClass1_Sub1_Sub3_8.method525();
					Class38.aClass38Array1[local180].anInt618 = (local170 << 16) + local175;
					this.anInt956 = -1;
					return true;
				}
				@Pc(3373) Class38 local3373;
				if (this.anInt956 == 93) {
					local170 = this.aClass1_Sub1_Sub3_8.method527();
					local175 = this.aClass1_Sub1_Sub3_8.method500();
					local3373 = Class38.aClass38Array1[local175];
					local3373.anInt629 = local170;
					if (local170 == -1) {
						local3373.anInt645 = 0;
						local3373.anInt631 = 0;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 118) {
					local170 = this.aClass1_Sub1_Sub3_8.method525();
					if (local170 == 65535) {
						local170 = -1;
					}
					if (local170 != this.anInt1068 && this.aBoolean198 && !aBoolean222 && this.anInt1052 == 0) {
						this.anInt988 = local170;
						this.aBoolean232 = true;
						this.aClass35_Sub1_1.method370(2, this.anInt988);
					}
					this.anInt1068 = local170;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 175) {
					local170 = this.aClass1_Sub1_Sub3_8.method524();
					local175 = this.aClass1_Sub1_Sub3_8.method502();
					if (this.aBoolean198 && !aBoolean222) {
						this.anInt988 = local170;
						this.aBoolean232 = false;
						this.aClass35_Sub1_1.method370(2, this.anInt988);
						this.anInt1052 = local175;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 30) {
					local170 = this.aClass1_Sub1_Sub3_8.method523();
					local175 = this.aClass1_Sub1_Sub3_8.method523();
					local3373 = Class38.aClass38Array1[local175];
					if (local3373 != null && local3373.anInt646 == 0) {
						if (local170 < 0) {
							local170 = 0;
						}
						if (local170 > local3373.anInt638 - local3373.anInt635) {
							local170 = local3373.anInt638 - local3373.anInt635;
						}
						local3373.anInt622 = local170;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 65) {
					this.anInt931 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt932 = this.aClass1_Sub1_Sub3_8.method517();
					while (this.aClass1_Sub1_Sub3_8.anInt806 < this.anInt955) {
						local170 = this.aClass1_Sub1_Sub3_8.method498();
						this.method705(local170, this.aClass1_Sub1_Sub3_8);
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 198) {
					this.method663();
					this.anInt956 = -1;
					return false;
				}
				if (this.anInt956 == 76) {
					local170 = this.aClass1_Sub1_Sub3_8.method524();
					local1704 = Class38.aClass38Array1[local170];
					for (local180 = 0; local180 < local1704.anIntArray159.length; local180++) {
						local1704.anIntArray159[local180] = -1;
						local1704.anIntArray159[local180] = 0;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 196) {
					local170 = this.aClass1_Sub1_Sub3_8.method500();
					local175 = this.aClass1_Sub1_Sub3_8.method498();
					local180 = this.aClass1_Sub1_Sub3_8.method500();
					if (this.aBoolean192 && !aBoolean222 && this.anInt1060 < 50) {
						this.anIntArray249[this.anInt1060] = local170;
						this.anIntArray268[this.anInt1060] = local175;
						this.anIntArray271[this.anInt1060] = local180 + Class17.anIntArray82[local170];
						this.anInt1060++;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 208) {
					local170 = this.aClass1_Sub1_Sub3_8.method523();
					this.method686(local170);
					if (this.anInt925 != -1) {
						this.anInt925 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt923 != 0) {
						this.anInt923 = 0;
						this.aBoolean239 = true;
					}
					this.anInt878 = local170;
					this.aBoolean219 = true;
					this.aBoolean242 = true;
					this.anInt934 = -1;
					this.aBoolean228 = false;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 13) {
					local170 = this.aClass1_Sub1_Sub3_8.method501();
					local175 = this.aClass1_Sub1_Sub3_8.method523();
					local180 = this.aClass1_Sub1_Sub3_8.method526();
					@Pc(3742) Class38 local3742 = Class38.aClass38Array1[local175];
					local3742.anInt634 = local180;
					local3742.anInt633 = local170;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 55) {
					this.aBoolean193 = true;
					this.anInt1020 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt1021 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt1022 = this.aClass1_Sub1_Sub3_8.method500();
					this.anInt1023 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt1024 = this.aClass1_Sub1_Sub3_8.method498();
					if (this.anInt1024 >= 100) {
						this.anInt1034 = this.anInt1020 * 128 + 64;
						this.anInt1036 = this.anInt1021 * 128 + 64;
						this.anInt1035 = this.method648(this.anInt1036, this.anInt874, this.anInt1034) - this.anInt1022;
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 11) {
					local170 = this.aClass1_Sub1_Sub3_8.method524();
					@Pc(3843) boolean local3843 = this.aClass1_Sub1_Sub3_8.method516() == 1;
					Class38.aClass38Array1[local170].aBoolean123 = local3843;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 62) {
					local170 = this.aClass1_Sub1_Sub3_8.method525();
					local175 = this.aClass1_Sub1_Sub3_8.method523();
					Class38.aClass38Array1[local175].anInt642 = 2;
					Class38.aClass38Array1[local175].anInt643 = local170;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 247) {
					local170 = this.aClass1_Sub1_Sub3_8.method524();
					local175 = this.aClass1_Sub1_Sub3_8.method525();
					Class38.aClass38Array1[local170].anInt642 = 1;
					Class38.aClass38Array1[local170].anInt643 = local175;
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 142) {
					this.aBoolean193 = true;
					this.anInt884 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt885 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt886 = this.aClass1_Sub1_Sub3_8.method500();
					this.anInt887 = this.aClass1_Sub1_Sub3_8.method498();
					this.anInt888 = this.aClass1_Sub1_Sub3_8.method498();
					if (this.anInt888 >= 100) {
						local170 = this.anInt884 * 128 + 64;
						local175 = this.anInt885 * 128 + 64;
						local180 = this.method648(local175, this.anInt874, local170) - this.anInt886;
						local197 = local170 - this.anInt1034;
						local342 = local180 - this.anInt1035;
						local547 = local175 - this.anInt1036;
						local849 = (int) Math.sqrt((double) (local197 * local197 + local547 * local547));
						this.anInt1037 = (int) (Math.atan2((double) local342, (double) local849) * 325.949D) & 0x7FF;
						this.anInt1038 = (int) (Math.atan2((double) local197, (double) local547) * -325.949D) & 0x7FF;
						if (this.anInt1037 < 128) {
							this.anInt1037 = 128;
						}
						if (this.anInt1037 > 383) {
							this.anInt1037 = 383;
						}
					}
					this.anInt956 = -1;
					return true;
				}
				if (this.anInt956 == 186) {
					this.anInt978 = this.aClass1_Sub1_Sub3_8.method525();
					this.anInt995 = this.aClass1_Sub1_Sub3_8.method531();
					this.anInt1001 = this.aClass1_Sub1_Sub3_8.method516();
					this.anInt1042 = this.aClass1_Sub1_Sub3_8.method517();
					this.anInt1004 = this.aClass1_Sub1_Sub3_8.method525();
					if (this.anInt995 != 0 && this.anInt934 == -1) {
						signlink.dnslookup(Class44.method451(this.anInt995));
						this.method622();
						@Pc(4092) short local4092 = 650;
						if (this.anInt1001 != 201 || this.anInt1042 == 1) {
							local4092 = 655;
						}
						this.aString25 = "";
						this.aBoolean203 = false;
						for (local175 = 0; local175 < Class38.aClass38Array1.length; local175++) {
							if (Class38.aClass38Array1[local175] != null && Class38.aClass38Array1[local175].anInt640 == local4092) {
								this.anInt934 = Class38.aClass38Array1[local175].anInt628;
								break;
							}
						}
					}
					this.anInt956 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt956 + "," + this.anInt955 + " - " + this.anInt881 + "," + this.anInt882);
				this.method663();
			} catch (@Pc(4169) IOException local4169) {
				this.method678(this.anInt914);
			} catch (@Pc(4175) Exception local4175) {
				local370 = "T2 - " + this.anInt956 + "," + this.anInt881 + "," + this.anInt882 + " - " + this.anInt955 + "," + (this.anInt915 + aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0]) + "," + (this.anInt916 + aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0]) + " - ";
				for (local175 = 0; local175 < this.anInt955 && local175 < 50; local175++) {
					local370 = local370 + this.aClass1_Sub1_Sub3_8.aByteArray19[local175] + ",";
				}
				signlink.reporterror(local370);
				this.method663();
			}
			return true;
		} catch (@Pc(4256) RuntimeException local4256) {
			signlink.reporterror("81881, " + arg0 + ", " + local4256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!XJCNBMKS;)V")
	private void method618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			this.anInt1025 = 0;
			this.anInt922 = 0;
			this.method590(arg0, arg2);
			this.method669(arg2, arg0);
			this.method675(arg2, arg0);
			this.method704(arg2, arg0);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt1025; local33++) {
				local40 = this.anIntArray266[local33];
				if (this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local40].anInt532 != anInt987) {
					this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local40] = null;
				}
			}
			if (arg2.anInt806 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.anInt806 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt921; local40++) {
				if (this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray220[local40]] == null) {
					signlink.reporterror(this.aString20 + " null entry in pl list - pos:" + local40 + " size:" + this.anInt921);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("65927, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean227) {
			this.method593();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!XJCNBMKS;)V")
	private void method620(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method508((byte) 7);
			@Pc(9) int local9 = arg1.method509(8);
			@Pc(15) int local15;
			if (local9 < this.anInt963) {
				for (local15 = local9; local15 < this.anInt963; local15++) {
					this.anIntArray266[this.anInt1025++] = this.anIntArray244[local15];
				}
			}
			if (local9 > this.anInt963) {
				signlink.reporterror(this.aString20 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt963 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(77) int local77 = this.anIntArray244[local15];
				@Pc(82) Class1_Sub1_Sub1_Sub2_Sub1 local82 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local77];
				@Pc(87) int local87 = arg1.method509(1);
				if (local87 == 0) {
					this.anIntArray244[this.anInt963++] = local77;
					local82.anInt532 = anInt987;
				} else {
					@Pc(110) int local110 = arg1.method509(2);
					if (local110 == 0) {
						this.anIntArray244[this.anInt963++] = local77;
						local82.anInt532 = anInt987;
						this.anIntArray221[this.anInt922++] = local77;
					} else {
						@Pc(161) int local161;
						@Pc(171) int local171;
						if (local110 == 1) {
							this.anIntArray244[this.anInt963++] = local77;
							local82.anInt532 = anInt987;
							local161 = arg1.method509(3);
							local82.method320((byte) 9, false, local161);
							local171 = arg1.method509(1);
							if (local171 == 1) {
								this.anIntArray221[this.anInt922++] = local77;
							}
						} else if (local110 == 2) {
							this.anIntArray244[this.anInt963++] = local77;
							local82.anInt532 = anInt987;
							local161 = arg1.method509(3);
							local82.method320((byte) 9, true, local161);
							local171 = arg1.method509(3);
							local82.method320((byte) 9, true, local171);
							@Pc(229) int local229 = arg1.method509(1);
							if (local229 == 1) {
								this.anIntArray221[this.anInt922++] = local77;
							}
						} else if (local110 == 3) {
							this.anIntArray266[this.anInt1025++] = local77;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("97431, " + arg0 + ", " + -27 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub1_19.method62(arg3, arg2);
			this.aClass1_Sub1_Sub2_Sub1_20.method62(arg3 + arg1 - 16, arg2);
			Class1_Sub1_Sub2.method542(arg2, arg3 + 16, this.anInt983, 16, arg1 - 32);
			@Pc(35) int local35 = (arg1 - 32) * arg1 / arg4;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg1 - local35 - 32) * arg0 / (arg4 - arg1);
			Class1_Sub1_Sub2.method542(arg2, arg3 + local52 + 16, this.anInt1019, 16, local35);
			Class1_Sub1_Sub2.method547(arg2, this.anInt989, arg3 + local52 + 16, local35);
			Class1_Sub1_Sub2.method547(arg2 + 1, this.anInt989, arg3 + local52 + 16, local35);
			Class1_Sub1_Sub2.method545(this.anInt989, arg3 + local52 + 16, 16, arg2);
			Class1_Sub1_Sub2.method545(this.anInt989, arg3 + local52 + 17, 16, arg2);
			Class1_Sub1_Sub2.method547(arg2 + 15, this.anInt962, arg3 + local52 + 16, local35);
			Class1_Sub1_Sub2.method547(arg2 + 14, this.anInt962, arg3 + local52 + 17, local35 - 1);
			Class1_Sub1_Sub2.method545(this.anInt962, arg3 + local52 + local35 + 15, 16, arg2);
			Class1_Sub1_Sub2.method545(this.anInt962, arg3 + local52 + local35 + 14, 15, arg2 + 1);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("88608, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -87 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method622() {
		try {
			this.aClass1_Sub1_Sub3_7.method487(252);
			if (this.anInt878 != -1) {
				this.anInt878 = -1;
				this.aBoolean219 = true;
				this.aBoolean228 = false;
				this.aBoolean242 = true;
			}
			if (this.anInt925 != -1) {
				this.anInt925 = -1;
				this.aBoolean239 = true;
				this.aBoolean228 = false;
			}
			this.anInt934 = -1;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("77605, " + 5 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method623() {
		try {
			@Pc(6) int local6 = this.anInt1020 * 128 + 64;
			@Pc(13) int local13 = this.anInt1021 * 128 + 64;
			@Pc(24) int local24 = this.method648(local13, this.anInt874, local6) - this.anInt1022;
			if (this.anInt1034 < local6) {
				this.anInt1034 += this.anInt1023 + (local6 - this.anInt1034) * this.anInt1024 / 1000;
				if (this.anInt1034 > local6) {
					this.anInt1034 = local6;
				}
			}
			if (this.anInt1034 > local6) {
				this.anInt1034 -= this.anInt1023 + (this.anInt1034 - local6) * this.anInt1024 / 1000;
				if (this.anInt1034 < local6) {
					this.anInt1034 = local6;
				}
			}
			if (this.anInt1035 < local24) {
				this.anInt1035 += this.anInt1023 + (local24 - this.anInt1035) * this.anInt1024 / 1000;
				if (this.anInt1035 > local24) {
					this.anInt1035 = local24;
				}
			}
			if (this.anInt1035 > local24) {
				this.anInt1035 -= this.anInt1023 + (this.anInt1035 - local24) * this.anInt1024 / 1000;
				if (this.anInt1035 < local24) {
					this.anInt1035 = local24;
				}
			}
			if (this.anInt1036 < local13) {
				this.anInt1036 += this.anInt1023 + (local13 - this.anInt1036) * this.anInt1024 / 1000;
				if (this.anInt1036 > local13) {
					this.anInt1036 = local13;
				}
			}
			if (this.anInt1036 > local13) {
				this.anInt1036 -= this.anInt1023 + (this.anInt1036 - local13) * this.anInt1024 / 1000;
				if (this.anInt1036 < local13) {
					this.anInt1036 = local13;
				}
			}
			local6 = this.anInt884 * 128 + 64;
			local13 = this.anInt885 * 128 + 64;
			local24 = this.method648(local13, this.anInt874, local6) - this.anInt886;
			@Pc(222) int local222 = local6 - this.anInt1034;
			@Pc(227) int local227 = local24 - this.anInt1035;
			@Pc(232) int local232 = local13 - this.anInt1036;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(265) int local265 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt1037 < local254) {
				this.anInt1037 += this.anInt887 + (local254 - this.anInt1037) * this.anInt888 / 1000;
				if (this.anInt1037 > local254) {
					this.anInt1037 = local254;
				}
			}
			if (this.anInt1037 > local254) {
				this.anInt1037 -= this.anInt887 + (this.anInt1037 - local254) * this.anInt888 / 1000;
				if (this.anInt1037 < local254) {
					this.anInt1037 = local254;
				}
			}
			@Pc(339) int local339 = local265 - this.anInt1038;
			if (local339 > 1024) {
				local339 -= 2048;
			}
			if (local339 < -1024) {
				local339 += 2048;
			}
			if (local339 > 0) {
				this.anInt1038 += this.anInt887 + local339 * this.anInt888 / 1000;
				this.anInt1038 &= 0x7FF;
			}
			if (local339 < 0) {
				this.anInt1038 -= this.anInt887 + -local339 * this.anInt888 / 1000;
				this.anInt1038 &= 0x7FF;
			}
			@Pc(397) int local397 = local265 - this.anInt1038;
			if (local397 > 1024) {
				local397 -= 2048;
			}
			if (local397 < -1024) {
				local397 += 2048;
			}
			if (local397 < 0 && local339 > 0 || local397 > 0 && local339 < 0) {
				this.anInt1038 = local265;
			}
		} catch (@Pc(418) RuntimeException local418) {
			signlink.reporterror("1465, " + 289 + ", " + local418.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method624() {
		try {
			this.anInt891 = 0;
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 >> 7) + this.anInt915;
			@Pc(26) int local26 = (aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 >> 7) + this.anInt916;
			if (local18 >= 3053 && local18 <= 3156 && local26 >= 3056 && local26 <= 3136) {
				this.anInt891 = 1;
			}
			if (local18 >= 3072 && local18 <= 3118 && local26 >= 9492 && local26 <= 9535) {
				this.anInt891 = 1;
			}
			if (this.anInt891 == 1 && local18 >= 3139 && local18 <= 3199 && local26 >= 3008 && local26 <= 3062) {
				this.anInt891 = 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("15549, " + -592 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!YHEHTOVP;I)V")
	private void method625(@OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method626(arg0.anInt564, arg1, arg0.anInt565);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("76776, " + 45 + ", " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method626(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method648(arg2, this.anInt874, arg0) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt1034;
				@Pc(38) int local38 = local28 - this.anInt1035;
				@Pc(43) int local43 = arg2 - this.anInt1036;
				@Pc(48) int local48 = Class1_Sub1_Sub1_Sub3.anIntArray74[this.anInt1037];
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub3.anIntArray75[this.anInt1037];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub3.anIntArray74[this.anInt1038];
				@Pc(68) int local68 = Class1_Sub1_Sub1_Sub3.anIntArray75[this.anInt1038];
				@Pc(78) int local78 = local43 * local63 + local33 * local68 >> 16;
				@Pc(88) int local88 = local43 * local68 - local33 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local38 * local53 - local88 * local48 >> 16;
				@Pc(110) int local110 = local38 * local48 + local88 * local53 >> 16;
				if (local110 >= 50) {
					this.anInt960 = Class1_Sub1_Sub2_Sub2.anInt159 + (local90 << 9) / local110;
					this.anInt961 = Class1_Sub1_Sub2_Sub2.anInt160 + (local100 << 9) / local110;
				} else {
					this.anInt960 = -1;
					this.anInt961 = -1;
				}
			} else {
				this.anInt960 = -1;
				this.anInt961 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("52114, " + -27 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method627(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt867; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray9[local5])) {
					return true;
				}
			}
			if (this.anInt912 != 46314) {
				this.method572();
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub2_Sub2_1.aString8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("43122, " + 46314 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method574() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass12_1 != null) {
					this.aClass12_1.method102();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass12_1 = null;
			this.method653();
			if (this.aClass19_1 != null) {
				this.aClass19_1.aBoolean78 = false;
			}
			this.aClass19_1 = null;
			this.aClass35_Sub1_1.method382();
			this.aClass35_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_6 = null;
			this.aClass1_Sub1_Sub3_7 = null;
			this.aClass1_Sub1_Sub3_9 = null;
			this.aClass1_Sub1_Sub3_8 = null;
			this.anIntArray245 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray4 = null;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass21_1 = null;
			this.aClass31Array1 = null;
			this.anIntArrayArray22 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.aByteArray21 = null;
			this.aClass50_15 = null;
			this.aClass50_16 = null;
			this.aClass50_17 = null;
			this.aClass50_18 = null;
			this.aClass50_3 = null;
			this.aClass50_4 = null;
			this.aClass50_5 = null;
			this.aClass50_19 = null;
			this.aClass50_20 = null;
			this.aClass50_21 = null;
			this.aClass50_22 = null;
			this.aClass50_23 = null;
			this.aClass50_24 = null;
			this.aClass50_25 = null;
			this.aClass50_26 = null;
			this.aClass50_27 = null;
			this.aClass1_Sub1_Sub2_Sub1_16 = null;
			this.aClass1_Sub1_Sub2_Sub1_17 = null;
			this.aClass1_Sub1_Sub2_Sub1_18 = null;
			this.aClass1_Sub1_Sub2_Sub1_8 = null;
			this.aClass1_Sub1_Sub2_Sub1_9 = null;
			this.aClass1_Sub1_Sub2_Sub1_10 = null;
			this.aClass1_Sub1_Sub2_Sub1Array4 = null;
			this.aClass1_Sub1_Sub2_Sub1_1 = null;
			this.aClass1_Sub1_Sub2_Sub1_2 = null;
			this.aClass1_Sub1_Sub2_Sub1_3 = null;
			this.aClass1_Sub1_Sub2_Sub1_4 = null;
			this.aClass1_Sub1_Sub2_Sub1_5 = null;
			this.aClass1_Sub1_Sub2_Sub1_11 = null;
			this.aClass1_Sub1_Sub2_Sub1_12 = null;
			this.aClass1_Sub1_Sub2_Sub1_13 = null;
			this.aClass1_Sub1_Sub2_Sub1_14 = null;
			this.aClass1_Sub1_Sub2_Sub1_15 = null;
			this.aClass1_Sub1_Sub2_Sub4_13 = null;
			this.aClass1_Sub1_Sub2_Sub4Array4 = null;
			this.aClass1_Sub1_Sub2_Sub4Array7 = null;
			this.aClass1_Sub1_Sub2_Sub4Array6 = null;
			this.aClass1_Sub1_Sub2_Sub4_8 = null;
			this.aClass1_Sub1_Sub2_Sub4_9 = null;
			this.aClass1_Sub1_Sub2_Sub4_10 = null;
			this.aClass1_Sub1_Sub2_Sub4_11 = null;
			this.aClass1_Sub1_Sub2_Sub4_12 = null;
			this.aClass1_Sub1_Sub2_Sub1Array5 = null;
			this.aClass1_Sub1_Sub2_Sub4Array8 = null;
			this.anIntArrayArray23 = null;
			this.aClass1_Sub1_Sub1_Sub2_Sub2Array1 = null;
			this.anIntArray220 = null;
			this.anIntArray221 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray266 = null;
			this.aClass1_Sub1_Sub1_Sub2_Sub1Array1 = null;
			this.anIntArray244 = null;
			this.aClass13ArrayArrayArray1 = null;
			this.aClass13_10 = null;
			this.aClass13_12 = null;
			this.aClass13_11 = null;
			this.anIntArray234 = null;
			this.anIntArray235 = null;
			this.anIntArray236 = null;
			this.anIntArray237 = null;
			this.aStringArray8 = null;
			this.anIntArray273 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.aClass1_Sub1_Sub2_Sub4Array5 = null;
			this.aClass1_Sub1_Sub2_Sub4_14 = null;
			this.aStringArray9 = null;
			this.aLongArray4 = null;
			this.anIntArray242 = null;
			this.aClass50_9 = null;
			this.aClass50_10 = null;
			this.aClass50_6 = null;
			this.aClass50_7 = null;
			this.aClass50_8 = null;
			this.aClass50_11 = null;
			this.aClass50_12 = null;
			this.aClass50_13 = null;
			this.aClass50_14 = null;
			this.method614();
			Class42.method392();
			Class27.method289();
			Class5.method22();
			Class24.aClass24Array1 = null;
			Class32.aClass32Array1 = null;
			Class38.aClass38Array1 = null;
			Class3.aClass3Array1 = null;
			Class16.aClass16Array1 = null;
			Class48.aClass48Array1 = null;
			Class48.aClass18_9 = null;
			Class30.aClass30Array1 = null;
			super.aClass50_2 = null;
			Class1_Sub1_Sub1_Sub2_Sub2.aClass18_4 = null;
			Class1_Sub1_Sub2_Sub2.method80();
			Class21.method228();
			Class1_Sub1_Sub1_Sub3.method178();
			Class40.method365();
			System.gc();
		} catch (@Pc(372) RuntimeException local372) {
			signlink.reporterror("81756, " + -318 + ", " + local372.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method628() {
		try {
			this.aClass1_Sub1_Sub2_Sub1_6 = new Class1_Sub1_Sub2_Sub1(this.aClass36_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub1_7 = new Class1_Sub1_Sub2_Sub1(this.aClass36_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub1Array3 = new Class1_Sub1_Sub2_Sub1[12];
			@Pc(36) int local36 = 0;
			try {
				local36 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(43) Exception local43) {
			}
			@Pc(47) int local47;
			if (local36 == 0) {
				for (local47 = 0; local47 < 12; local47++) {
					this.aClass1_Sub1_Sub2_Sub1Array3[local47] = new Class1_Sub1_Sub2_Sub1(this.aClass36_1, "runes", local47);
				}
			} else {
				for (local47 = 0; local47 < 12; local47++) {
					this.aClass1_Sub1_Sub2_Sub1Array3[local47] = new Class1_Sub1_Sub2_Sub1(this.aClass36_1, "runes", (local47 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(128, 265);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(128, 265);
			for (local47 = 0; local47 < 33920; local47++) {
				this.aClass1_Sub1_Sub2_Sub4_3.anIntArray208[local47] = this.aClass50_9.anIntArray209[local47];
			}
			for (@Pc(123) int local123 = 0; local123 < 33920; local123++) {
				this.aClass1_Sub1_Sub2_Sub4_4.anIntArray208[local123] = this.aClass50_10.anIntArray209[local123];
			}
			this.anIntArray225 = new int[256];
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				this.anIntArray225[local145] = local145 * 262144;
			}
			for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
				this.anIntArray225[local160 + 64] = local160 * 1024 + 16711680;
			}
			for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
				this.anIntArray225[local179 + 128] = local179 * 4 + 16776960;
			}
			for (@Pc(198) int local198 = 0; local198 < 64; local198++) {
				this.anIntArray225[local198 + 192] = 16777215;
			}
			this.anIntArray226 = new int[256];
			for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
				this.anIntArray226[local217] = local217 * 1024;
			}
			for (@Pc(232) int local232 = 0; local232 < 64; local232++) {
				this.anIntArray226[local232 + 64] = local232 * 4 + 65280;
			}
			for (@Pc(251) int local251 = 0; local251 < 64; local251++) {
				this.anIntArray226[local251 + 128] = local251 * 262144 + 65535;
			}
			for (@Pc(270) int local270 = 0; local270 < 64; local270++) {
				this.anIntArray226[local270 + 192] = 16777215;
			}
			this.anIntArray227 = new int[256];
			for (@Pc(289) int local289 = 0; local289 < 64; local289++) {
				this.anIntArray227[local289] = local289 * 4;
			}
			for (@Pc(304) int local304 = 0; local304 < 64; local304++) {
				this.anIntArray227[local304 + 64] = local304 * 262144 + 255;
			}
			for (@Pc(323) int local323 = 0; local323 < 64; local323++) {
				this.anIntArray227[local323 + 128] = local323 * 1024 + 16711935;
			}
			for (@Pc(342) int local342 = 0; local342 < 64; local342++) {
				this.anIntArray227[local342 + 192] = 16777215;
			}
			this.anIntArray224 = new int[256];
			this.anIntArray230 = new int[32768];
			this.anIntArray231 = new int[32768];
			this.method706(null);
			this.anIntArray252 = new int[32768];
			this.anIntArray253 = new int[32768];
			this.method579(10, "Connecting to fileserver");
			if (!this.aBoolean220) {
				this.aBoolean227 = true;
				this.aBoolean220 = true;
				this.method578(this, 2);
			}
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("2716, " + -78 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(18) int local18 = this.aClass21_1.method255(arg1, arg4, arg0);
			@Pc(28) int local28;
			@Pc(34) int local34;
			@Pc(38) int local38;
			@Pc(40) int local40;
			@Pc(62) int local62;
			@Pc(68) int local68;
			if (local18 != 0) {
				local28 = this.aClass21_1.method259(arg1, arg4, arg0, local18);
				local34 = local28 >> 6 & 0x3;
				local38 = local28 & 0x1F;
				local40 = arg3;
				if (local18 > 0) {
					local40 = arg2;
				}
				@Pc(48) int[] local48 = this.aClass1_Sub1_Sub2_Sub4_14.anIntArray208;
				local62 = arg4 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local68 = local18 >> 14 & 0x7FFF;
				@Pc(71) Class42 local71 = Class42.method395(local68);
				if (local71.anInt698 == -1) {
					if (local38 == 0 || local38 == 2) {
						if (local34 == 0) {
							local48[local62] = local40;
							local48[local62 + 512] = local40;
							local48[local62 + 1024] = local40;
							local48[local62 + 1536] = local40;
						} else if (local34 == 1) {
							local48[local62] = local40;
							local48[local62 + 1] = local40;
							local48[local62 + 2] = local40;
							local48[local62 + 3] = local40;
						} else if (local34 == 2) {
							local48[local62 + 3] = local40;
							local48[local62 + 3 + 512] = local40;
							local48[local62 + 3 + 1024] = local40;
							local48[local62 + 3 + 1536] = local40;
						} else if (local34 == 3) {
							local48[local62 + 1536] = local40;
							local48[local62 + 1536 + 1] = local40;
							local48[local62 + 1536 + 2] = local40;
							local48[local62 + 1536 + 3] = local40;
						}
					}
					if (local38 == 3) {
						if (local34 == 0) {
							local48[local62] = local40;
						} else if (local34 == 1) {
							local48[local62 + 3] = local40;
						} else if (local34 == 2) {
							local48[local62 + 3 + 1536] = local40;
						} else if (local34 == 3) {
							local48[local62 + 1536] = local40;
						}
					}
					if (local38 == 2) {
						if (local34 == 3) {
							local48[local62] = local40;
							local48[local62 + 512] = local40;
							local48[local62 + 1024] = local40;
							local48[local62 + 1536] = local40;
						} else if (local34 == 0) {
							local48[local62] = local40;
							local48[local62 + 1] = local40;
							local48[local62 + 2] = local40;
							local48[local62 + 3] = local40;
						} else if (local34 == 1) {
							local48[local62 + 3] = local40;
							local48[local62 + 3 + 512] = local40;
							local48[local62 + 3 + 1024] = local40;
							local48[local62 + 3 + 1536] = local40;
						} else if (local34 == 2) {
							local48[local62 + 1536] = local40;
							local48[local62 + 1536 + 1] = local40;
							local48[local62 + 1536 + 2] = local40;
							local48[local62 + 1536 + 3] = local40;
						}
					}
				} else {
					@Pc(81) Class1_Sub1_Sub2_Sub1 local81 = this.aClass1_Sub1_Sub2_Sub1Array5[local71.anInt698];
					if (local81 != null) {
						@Pc(93) int local93 = (local71.anInt697 * 4 - local81.anInt126) / 2;
						@Pc(103) int local103 = (local71.anInt692 * 4 - local81.anInt127) / 2;
						local81.method62((104 - arg0 - local71.anInt692) * 4 + local103 + 48, arg4 * 4 + 48 + local93);
					}
				}
			}
			local18 = this.aClass21_1.method257(arg1, arg4, arg0);
			if (local18 != 0) {
				local28 = this.aClass21_1.method259(arg1, arg4, arg0, local18);
				local34 = local28 >> 6 & 0x3;
				local38 = local28 & 0x1F;
				local40 = local18 >> 14 & 0x7FFF;
				@Pc(457) Class42 local457 = Class42.method395(local40);
				@Pc(489) int local489;
				if (local457.anInt698 != -1) {
					@Pc(467) Class1_Sub1_Sub2_Sub1 local467 = this.aClass1_Sub1_Sub2_Sub1Array5[local457.anInt698];
					if (local467 != null) {
						local68 = (local457.anInt697 * 4 - local467.anInt126) / 2;
						local489 = (local457.anInt692 * 4 - local467.anInt127) / 2;
						local467.method62((104 - arg0 - local457.anInt692) * 4 + local489 + 48, arg4 * 4 + 48 + local68);
					}
				} else if (local38 == 9) {
					local62 = 15658734;
					if (local18 > 0) {
						local62 = 15597568;
					}
					@Pc(526) int[] local526 = this.aClass1_Sub1_Sub2_Sub4_14.anIntArray208;
					local489 = arg4 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local34 == 0 || local34 == 2) {
						local526[local489 + 1536] = local62;
						local526[local489 + 1024 + 1] = local62;
						local526[local489 + 512 + 2] = local62;
						local526[local489 + 3] = local62;
					} else {
						local526[local489] = local62;
						local526[local489 + 512 + 1] = local62;
						local526[local489 + 1024 + 2] = local62;
						local526[local489 + 1536 + 3] = local62;
					}
				}
			}
			local18 = this.aClass21_1.method258(arg1, arg4, arg0);
			if (local18 != 0) {
				local28 = local18 >> 14 & 0x7FFF;
				@Pc(621) Class42 local621 = Class42.method395(local28);
				if (local621.anInt698 != -1) {
					@Pc(631) Class1_Sub1_Sub2_Sub1 local631 = this.aClass1_Sub1_Sub2_Sub1Array5[local621.anInt698];
					if (local631 != null) {
						local40 = (local621.anInt697 * 4 - local631.anInt126) / 2;
						@Pc(653) int local653 = (local621.anInt692 * 4 - local631.anInt127) / 2;
						local631.method62((104 - arg0 - local621.anInt692) * 4 + local653 + 48, arg4 * 4 + 48 + local40);
						return;
					}
				}
			}
		} catch (@Pc(677) RuntimeException local677) {
			signlink.reporterror("65871, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local677.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method630() {
		try {
			this.anInt955 += 0;
			if (super.anInt856 == 1) {
				if (super.anInt857 >= 539 && super.anInt857 <= 573 && super.anInt858 >= 169 && super.anInt858 < 205 && this.anIntArray213[0] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 0;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 569 && super.anInt857 <= 599 && super.anInt858 >= 168 && super.anInt858 < 205 && this.anIntArray213[1] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 1;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 597 && super.anInt857 <= 627 && super.anInt858 >= 168 && super.anInt858 < 205 && this.anIntArray213[2] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 2;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 625 && super.anInt857 <= 669 && super.anInt858 >= 168 && super.anInt858 < 203 && this.anIntArray213[3] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 3;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 666 && super.anInt857 <= 696 && super.anInt858 >= 168 && super.anInt858 < 205 && this.anIntArray213[4] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 4;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 694 && super.anInt857 <= 724 && super.anInt858 >= 168 && super.anInt858 < 205 && this.anIntArray213[5] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 5;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 722 && super.anInt857 <= 756 && super.anInt858 >= 169 && super.anInt858 < 205 && this.anIntArray213[6] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 6;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 540 && super.anInt857 <= 574 && super.anInt858 >= 466 && super.anInt858 < 502 && this.anIntArray213[7] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 7;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 572 && super.anInt857 <= 602 && super.anInt858 >= 466 && super.anInt858 < 503 && this.anIntArray213[8] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 8;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 599 && super.anInt857 <= 629 && super.anInt858 >= 466 && super.anInt858 < 503 && this.anIntArray213[9] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 9;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 627 && super.anInt857 <= 671 && super.anInt858 >= 467 && super.anInt858 < 502 && this.anIntArray213[10] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 10;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 669 && super.anInt857 <= 699 && super.anInt858 >= 466 && super.anInt858 < 503 && this.anIntArray213[11] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 11;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 696 && super.anInt857 <= 726 && super.anInt858 >= 466 && super.anInt858 < 503 && this.anIntArray213[12] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 12;
					this.aBoolean242 = true;
				}
				if (super.anInt857 >= 724 && super.anInt857 <= 758 && super.anInt858 >= 466 && super.anInt858 < 502 && this.anIntArray213[13] != -1) {
					this.aBoolean219 = true;
					this.anInt926 = 13;
					this.aBoolean242 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("54035, " + 0 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method573() {
		try {
			if (!this.aBoolean216 && !this.aBoolean211 && !this.aBoolean229) {
				anInt987++;
				if (this.aBoolean237) {
					this.method654();
				} else {
					this.method649();
				}
				this.method709();
				this.aBoolean237 &= true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("14127, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!RWLOYYVC;)Z")
	private boolean method631(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(8) int local8 = arg0.anInt640;
			if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
				if (local8 >= 801) {
					local8 -= 701;
				} else if (local8 >= 701) {
					local8 -= 601;
				} else if (local8 >= 101) {
					local8 -= 101;
				} else {
					local8--;
				}
				this.aStringArray8[this.anInt863] = "Remove @whi@" + this.aStringArray9[local8];
				this.anIntArray236[this.anInt863] = 163;
				this.anInt863++;
				this.aStringArray8[this.anInt863] = "Message @whi@" + this.aStringArray9[local8];
				this.anIntArray236[this.anInt863] = 643;
				this.anInt863++;
				return true;
			} else if (local8 >= 401 && local8 <= 500) {
				this.aStringArray8[this.anInt863] = "Remove @whi@" + arg0.aString11;
				this.anIntArray236[this.anInt863] = 355;
				this.anInt863++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("705, " + false + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method632() {
		try {
			this.aBoolean237 &= true;
			if (super.anInt856 == 1) {
				if (super.anInt857 >= 6 && super.anInt857 <= 106 && super.anInt858 >= 467 && super.anInt858 <= 499) {
					this.anInt1050 = (this.anInt1050 + 1) % 4;
					this.aBoolean197 = true;
					this.aBoolean239 = true;
					this.aClass1_Sub1_Sub3_7.method487(36);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt1050);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt982);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt892);
				}
				if (super.anInt857 >= 135 && super.anInt857 <= 235 && super.anInt858 >= 467 && super.anInt858 <= 499) {
					this.anInt982 = (this.anInt982 + 1) % 3;
					this.aBoolean197 = true;
					this.aBoolean239 = true;
					this.aClass1_Sub1_Sub3_7.method487(36);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt1050);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt982);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt892);
				}
				if (super.anInt857 >= 273 && super.anInt857 <= 373 && super.anInt858 >= 467 && super.anInt858 <= 499) {
					this.anInt892 = (this.anInt892 + 1) % 3;
					this.aBoolean197 = true;
					this.aBoolean239 = true;
					this.aClass1_Sub1_Sub3_7.method487(36);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt1050);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt982);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt892);
				}
				if (super.anInt857 >= 412 && super.anInt857 <= 512 && super.anInt858 >= 467 && super.anInt858 <= 499) {
					if (this.anInt934 == -1) {
						this.method622();
						this.aString25 = "";
						this.aBoolean203 = false;
						for (@Pc(190) int local190 = 0; local190 < Class38.aClass38Array1.length; local190++) {
							if (Class38.aClass38Array1[local190] != null && Class38.aClass38Array1[local190].anInt640 == 600) {
								this.anInt901 = this.anInt934 = Class38.aClass38Array1[local190].anInt628;
								return;
							}
						}
						return;
					}
					this.method587("Please close the interface you have open before using 'report abuse'", "", 0);
					return;
				}
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("2369, " + true + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method633() {
		try {
			if (this.anInt1039 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub3 local6 = this.aClass1_Sub1_Sub2_Sub3_3;
				@Pc(8) int local8 = 0;
				if (this.anInt971 != 0) {
					local8 = 1;
				}
				for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
					if (this.aStringArray11[local18] != null) {
						@Pc(30) int local30 = this.anIntArray223[local18];
						@Pc(35) String local35 = this.aStringArray10[local18];
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
						if ((local30 == 3 || local30 == 7) && (local30 == 7 || this.anInt982 == 0 || this.anInt982 == 1 && this.method627(local35))) {
							local88 = 329 - local8 * 13;
							local6.method424(4, "From", 0, local88);
							local6.method424(4, "From", 65535, local88 - 1);
							@Pc(113) int local113 = local6.method422("From ") + 4;
							if (local37 == 1) {
								this.aClass1_Sub1_Sub2_Sub1Array2[0].method62(local88 - 12, local113);
								local113 += 14;
							}
							if (local37 == 2) {
								this.aClass1_Sub1_Sub2_Sub1Array2[1].method62(local88 - 12, local113);
								local113 += 14;
							}
							local6.method424(local113, local35 + ": " + this.aStringArray11[local18], 0, local88);
							local6.method424(local113, local35 + ": " + this.aStringArray11[local18], 65535, local88 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local30 == 5 && this.anInt982 < 2) {
							local88 = 329 - local8 * 13;
							local6.method424(4, this.aStringArray11[local18], 0, local88);
							local6.method424(4, this.aStringArray11[local18], 65535, local88 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local30 == 6 && this.anInt982 < 2) {
							local88 = 329 - local8 * 13;
							local6.method424(4, "To " + local35 + ": " + this.aStringArray11[local18], 0, local88);
							local6.method424(4, "To " + local35 + ": " + this.aStringArray11[local18], 65535, local88 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("1355, " + 0 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!RWLOYYVC;)I")
	private int method634(@OriginalArg(0) int arg0, @OriginalArg(2) Class38 arg1) {
		try {
			if (arg1.anIntArrayArray15 == null || arg0 >= arg1.anIntArrayArray15.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg1.anIntArrayArray15[arg0];
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
						local34 = this.anIntArray219[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray264[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray248[local21[local25++]];
					}
					@Pc(83) Class38 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local32 == 4) {
						local83 = Class38.aClass38Array1[local21[local25++]];
						local88 = local21[local25++];
						if (local88 >= 0 && local88 < Class5.anInt39 && (!Class5.method23(local88).aBoolean19 || aBoolean221)) {
							for (local101 = 0; local101 < local83.anIntArray159.length; local101++) {
								if (local83.anIntArray159[local101] == local88 + 1) {
									local34 += local83.anIntArray156[local101];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray273[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray212[this.anIntArray264[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray273[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt573;
					}
					@Pc(176) int local176;
					if (local32 == 9) {
						for (local176 = 0; local176 < Class25.anInt449; local176++) {
							if (Class25.aBooleanArray6[local176]) {
								local34 += this.anIntArray264[local176];
							}
						}
					}
					if (local32 == 10) {
						local83 = Class38.aClass38Array1[local21[local25++]];
						local88 = local21[local25++] + 1;
						if (local88 >= 0 && local88 < Class5.anInt39 && (!Class5.method23(local88).aBoolean19 || aBoolean221)) {
							for (local101 = 0; local101 < local83.anIntArray159.length; local101++) {
								if (local83.anIntArray159[local101] == local88) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt865;
					}
					if (local32 == 12) {
						local34 = this.anInt889;
					}
					if (local32 == 13) {
						local176 = this.anIntArray273[local21[local25++]];
						local88 = local21[local25++];
						local34 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local176 = local21[local25++];
						@Pc(291) Class49 local291 = Class49.aClass49Array1[local176];
						local101 = local291.anInt791;
						@Pc(297) int local297 = local291.anInt792;
						@Pc(300) int local300 = local291.anInt793;
						@Pc(306) int local306 = anIntArray229[local300 - local297];
						local34 = this.anIntArray273[local101] >> local297 & local306;
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
						local34 = (aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 >> 7) + this.anInt915;
					}
					if (local32 == 19) {
						local34 = (aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 >> 7) + this.anInt916;
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
			} catch (@Pc(399) Exception local399) {
				return -1;
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("59657, " + arg0 + ", " + true + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method635() {
		try {
			try {
				@Pc(14) int local14 = aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 + this.anInt996;
				@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 + this.anInt992;
				if (this.anInt927 - local14 < -500 || this.anInt927 - local14 > 500 || this.anInt928 - local20 < -500 || this.anInt928 - local20 > 500) {
					this.anInt927 = local14;
					this.anInt928 = local20;
				}
				if (this.anInt927 != local14) {
					this.anInt927 += (local14 - this.anInt927) / 16;
				}
				if (this.anInt928 != local20) {
					this.anInt928 += (local20 - this.anInt928) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt905 += (-this.anInt905 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt905 += (24 - this.anInt905) / 2;
				} else {
					this.anInt905 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt906 += (12 - this.anInt906) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt906 += (-this.anInt906 - 12) / 2;
				} else {
					this.anInt906 /= 2;
				}
				this.anInt904 = this.anInt904 + this.anInt905 / 2 & 0x7FF;
				this.anInt903 += this.anInt906 / 2;
				if (this.anInt903 < 128) {
					this.anInt903 = 128;
				}
				if (this.anInt903 > 383) {
					this.anInt903 = 383;
				}
				anInt872++;
				if (anInt872 > 190) {
					anInt872 = 0;
					this.aClass1_Sub1_Sub3_7.method487(131);
					this.aClass1_Sub1_Sub3_7.method491(12235807);
				}
				@Pc(225) int local225 = this.anInt927 >> 7;
				@Pc(230) int local230 = this.anInt928 >> 7;
				@Pc(240) int local240 = this.method648(this.anInt928, this.anInt874, this.anInt927);
				@Pc(242) int local242 = 0;
				@Pc(258) int local258;
				if (local225 > 3 && local230 > 3 && local225 < 100 && local230 < 100) {
					for (local258 = local225 - 4; local258 <= local225 + 4; local258++) {
						for (@Pc(264) int local264 = local230 - 4; local264 <= local230 + 4; local264++) {
							@Pc(269) int local269 = this.anInt874;
							if (local269 < 3 && (this.aByteArrayArrayArray8[1][local258][local264] & 0x2) == 2) {
								local269++;
							}
							@Pc(296) int local296 = local240 - this.anIntArrayArrayArray8[local269][local258][local264];
							if (local296 > local242) {
								local242 = local296;
							}
						}
					}
				}
				local258 = local242 * 192;
				if (local258 > 98048) {
					local258 = 98048;
				}
				if (local258 < 32768) {
					local258 = 32768;
				}
				if (local258 > this.anInt1000) {
					this.anInt1000 += (local258 - this.anInt1000) / 24;
				} else if (local258 < this.anInt1000) {
					this.anInt1000 += (local258 - this.anInt1000) / 80;
				}
			} catch (@Pc(360) Exception local360) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 + "," + aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 + "," + this.anInt927 + "," + this.anInt928 + "," + this.anInt895 + "," + this.anInt896 + "," + this.anInt915 + "," + this.anInt916);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("42606, " + false + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method636() {
		try {
			this.method633();
			if (this.anInt1077 == 1) {
				this.aClass1_Sub1_Sub2_Sub4Array6[this.anInt1076 / 100].method554(this.anInt1075 - 8 - 4, this.anInt1074 - 8 - 4);
				anInt879++;
				if (anInt879 > 73) {
					anInt879 = 0;
					this.aClass1_Sub1_Sub3_7.method487(83);
				}
			}
			if (this.anInt1077 == 2) {
				this.aClass1_Sub1_Sub2_Sub4Array6[this.anInt1076 / 100 + 4].method554(this.anInt1075 - 8 - 4, this.anInt1074 - 8 - 4);
				anInt1051++;
				if (anInt1051 > 102) {
					anInt1051 = 0;
					this.aClass1_Sub1_Sub3_7.method487(148);
					this.aClass1_Sub1_Sub3_7.method488(197);
				}
			}
			if (this.anInt894 != -1) {
				this.method616(this.anInt894, this.anInt939);
				this.method711(Class38.aClass38Array1[this.anInt894], 0, 0, 0, (byte) 7);
			}
			if (this.anInt934 != -1) {
				this.method616(this.anInt934, this.anInt939);
				this.method711(Class38.aClass38Array1[this.anInt934], 0, 0, 0, (byte) 7);
			}
			this.method624();
			if (!this.aBoolean217) {
				this.method685();
				this.method638();
			} else if (this.anInt1005 == 0) {
				this.method679();
			}
			if (this.anInt966 == 1) {
				this.aClass1_Sub1_Sub2_Sub4Array7[1].method554(296, 472);
			}
			@Pc(199) int local199;
			if (aBoolean236) {
				@Pc(174) byte local174 = 20;
				@Pc(176) int local176 = 16776960;
				if (super.anInt846 < 15) {
					local176 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method419(local176, this.anInt972, 20, "Fps:" + super.anInt846);
				local199 = local174 + 15;
				@Pc(201) Runtime local201 = Runtime.getRuntime();
				@Pc(210) int local210 = (int) ((local201.totalMemory() - local201.freeMemory()) / 1024L);
				if (local210 > 33554432 && aBoolean222) {
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method419(16776960, this.anInt972, 35, "Mem:" + local210 + "k");
				local199 += 15;
			}
			if (this.anInt971 != 0) {
				@Pc(245) int local245 = this.anInt971 / 50;
				local199 = local245 / 60;
				@Pc(253) int local253 = local245 % 60;
				if (local253 < 10) {
					this.aClass1_Sub1_Sub2_Sub3_3.method424(4, "System update in: " + local199 + ":0" + local253, 16776960, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub3_3.method424(4, "System update in: " + local199 + ":" + local253, 16776960, 329);
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("6686, " + 2 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 >= 1 && arg2 >= 1 && arg5 <= 102 && arg2 <= 102) {
				if (aBoolean222 && arg1 != this.anInt874) {
					return;
				}
				@Pc(33) int local33 = 0;
				if (arg6 == 0) {
					local33 = this.aClass21_1.method255(arg1, arg5, arg2);
				}
				if (arg6 == 1) {
					local33 = this.aClass21_1.method256(arg2, arg5, arg1);
				}
				if (arg6 == 2) {
					local33 = this.aClass21_1.method257(arg1, arg5, arg2);
				}
				if (arg6 == 3) {
					local33 = this.aClass21_1.method258(arg1, arg5, arg2);
				}
				@Pc(89) int local89;
				if (local33 != 0) {
					local89 = this.aClass21_1.method259(arg1, arg5, arg2, local33);
					@Pc(95) int local95 = local33 >> 14 & 0x7FFF;
					@Pc(99) int local99 = local89 & 0x1F;
					@Pc(103) int local103 = local89 >> 6;
					@Pc(115) Class42 local115;
					if (arg6 == 0) {
						this.aClass21_1.method246(arg5, arg1, arg2);
						local115 = Class42.method395(local95);
						if (local115.aBoolean146) {
							this.aClass31Array1[arg1].method303(arg2, local115.aBoolean135, local99, arg5, local103);
						}
					}
					if (arg6 == 1) {
						this.aClass21_1.method247(arg2, arg5, arg1);
					}
					if (arg6 == 2) {
						this.aClass21_1.method248(arg2, arg5, arg1);
						local115 = Class42.method395(local95);
						if (arg5 + local115.anInt697 > 103 || arg2 + local115.anInt697 > 103 || arg5 + local115.anInt692 > 103 || arg2 + local115.anInt692 > 103) {
							return;
						}
						if (local115.aBoolean146) {
							this.aClass31Array1[arg1].method304(local115.aBoolean135, arg5, local115.anInt697, local115.anInt692, local103, arg2);
						}
					}
					if (arg6 == 3) {
						this.aClass21_1.method249(arg5, arg1, arg2);
						local115 = Class42.method395(local95);
						if (local115.aBoolean146 && local115.aBoolean137) {
							this.aClass31Array1[arg1].method306(arg5, 397, arg2);
						}
					}
				}
				if (arg0 >= 0) {
					local89 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg5][arg2] & 0x2) == 2) {
						local89 = arg1 + 1;
					}
					Class45.method472(arg2, arg1, arg3, arg5, this.aClass21_1, this.aClass31Array1[arg1], local89, arg4, this.anIntArrayArrayArray8, arg0);
					return;
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("42889, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -319 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method638() {
		try {
			if (this.anInt863 >= 2 || this.anInt973 != 0 || this.anInt1044 != 0) {
				@Pc(31) String local31;
				if (this.anInt973 == 1 && this.anInt863 < 2) {
					local31 = "Use " + this.aString23 + " with...";
				} else if (this.anInt1044 == 1 && this.anInt863 < 2) {
					local31 = this.aString29 + "...";
				} else {
					local31 = this.aStringArray8[this.anInt863 - 1];
				}
				if (this.anInt863 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt863 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub3_4.method429(local31, 16777215, 4, anInt987 / 1000, 15);
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("40564, " + -566 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZIIII)Z")
	private boolean method639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray22[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg4;
			@Pc(39) int local39 = arg7;
			this.anIntArrayArray22[arg4][arg7] = 99;
			this.anIntArrayArray24[arg4][arg7] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray250[0] = arg4;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray251[0] = arg7;
			@Pc(78) boolean local78 = false;
			@Pc(82) int local82 = this.anIntArray250.length;
			@Pc(89) int[][] local89 = this.aClass31Array1[this.anInt874].anIntArrayArray14;
			@Pc(200) int local200;
			while (local57 != local66) {
				local11 = this.anIntArray250[local57];
				local39 = this.anIntArray251[local57];
				local57 = (local57 + 1) % local82;
				if (local11 == arg5 && local39 == arg8) {
					local78 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass31Array1[this.anInt874].method307(local11, arg10 - 1, arg5, local39, arg9, arg8)) {
						local78 = true;
						break;
					}
					if (arg10 < 10 && this.aClass31Array1[this.anInt874].method308(arg9, arg10 - 1, arg8, local11, local39, arg5)) {
						local78 = true;
						break;
					}
				}
				if (arg0 != 0 && arg1 != 0 && this.aClass31Array1[this.anInt874].method309(arg0, arg8, local39, arg3, arg1, local11, arg5)) {
					local78 = true;
					break;
				}
				local200 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray22[local11 - 1][local39] == 0 && (local89[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray250[local66] = local11 - 1;
					this.anIntArray251[local66] = local39;
					local66 = (local66 + 1) % local82;
					this.anIntArrayArray22[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local200;
				}
				if (local11 < 103 && this.anIntArrayArray22[local11 + 1][local39] == 0 && (local89[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray250[local66] = local11 + 1;
					this.anIntArray251[local66] = local39;
					local66 = (local66 + 1) % local82;
					this.anIntArrayArray22[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local200;
				}
				if (local39 > 0 && this.anIntArrayArray22[local11][local39 - 1] == 0 && (local89[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray250[local66] = local11;
					this.anIntArray251[local66] = local39 - 1;
					local66 = (local66 + 1) % local82;
					this.anIntArrayArray22[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local200;
				}
				if (local39 < 103 && this.anIntArrayArray22[local11][local39 + 1] == 0 && (local89[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray250[local66] = local11;
					this.anIntArray251[local66] = local39 + 1;
					local66 = (local66 + 1) % local82;
					this.anIntArrayArray22[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local200;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray22[local11 - 1][local39 - 1] == 0 && (local89[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local89[local11 - 1][local39] & 0x1280108) == 0 && (local89[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray250[local66] = local11 - 1;
					this.anIntArray251[local66] = local39 - 1;
					local66 = (local66 + 1) % local82;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local200;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray22[local11 + 1][local39 - 1] == 0 && (local89[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local89[local11 + 1][local39] & 0x1280180) == 0 && (local89[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray250[local66] = local11 + 1;
					this.anIntArray251[local66] = local39 - 1;
					local66 = (local66 + 1) % local82;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local200;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray22[local11 - 1][local39 + 1] == 0 && (local89[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local89[local11 - 1][local39] & 0x1280108) == 0 && (local89[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray250[local66] = local11 - 1;
					this.anIntArray251[local66] = local39 + 1;
					local66 = (local66 + 1) % local82;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local200;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray22[local11 + 1][local39 + 1] == 0 && (local89[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local89[local11 + 1][local39] & 0x1280180) == 0 && (local89[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray250[local66] = local11 + 1;
					this.anIntArray251[local66] = local39 + 1;
					local66 = (local66 + 1) % local82;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local200;
				}
			}
			this.anInt890 = 0;
			@Pc(816) int local816;
			@Pc(822) int local822;
			@Pc(828) int local828;
			if (!local78) {
				if (arg6) {
					local200 = 100;
					for (local816 = 1; local816 < 2; local816++) {
						for (local822 = arg5 - local816; local822 <= arg5 + local816; local822++) {
							for (local828 = arg8 - local816; local828 <= arg8 + local816; local828++) {
								if (local822 >= 0 && local828 >= 0 && local822 < 104 && local828 < 104 && this.anIntArrayArray24[local822][local828] < local200) {
									local200 = this.anIntArrayArray24[local822][local828];
									local11 = local822;
									local39 = local828;
									this.anInt890 = 1;
									local78 = true;
								}
							}
						}
						if (local78) {
							break;
						}
					}
				}
				if (!local78) {
					return false;
				}
			}
			@Pc(889) byte local889 = 0;
			this.anIntArray250[0] = local11;
			local57 = local889 + 1;
			this.anIntArray251[0] = local39;
			local200 = local816 = this.anIntArrayArray22[local11][local39];
			while (local11 != arg4 || local39 != arg7) {
				if (local200 != local816) {
					local816 = local200;
					this.anIntArray250[local57] = local11;
					this.anIntArray251[local57++] = local39;
				}
				if ((local200 & 0x2) != 0) {
					local11++;
				} else if ((local200 & 0x8) != 0) {
					local11--;
				}
				if ((local200 & 0x1) != 0) {
					local39++;
				} else if ((local200 & 0x4) != 0) {
					local39--;
				}
				local200 = this.anIntArrayArray22[local11][local39];
			}
			if (local57 > 0) {
				local82 = local57;
				if (local57 > 25) {
					local82 = 25;
				}
				local57--;
				local822 = this.anIntArray250[local57];
				local828 = this.anIntArray251[local57];
				anInt933++;
				if (anInt933 >= 127) {
					this.aClass1_Sub1_Sub3_7.method487(142);
					this.aClass1_Sub1_Sub3_7.method491(84528);
					anInt933 = 0;
				}
				if (arg2 == 0) {
					this.aClass1_Sub1_Sub3_7.method487(249);
					this.aClass1_Sub1_Sub3_7.method488(local82 + local82 + 3);
				}
				if (arg2 == 1) {
					this.aClass1_Sub1_Sub3_7.method487(147);
					this.aClass1_Sub1_Sub3_7.method488(local82 + local82 + 3 + 14);
				}
				if (arg2 == 2) {
					this.aClass1_Sub1_Sub3_7.method487(162);
					this.aClass1_Sub1_Sub3_7.method488(local82 + local82 + 3);
				}
				this.aClass1_Sub1_Sub3_7.method514(this.anInt1003, super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass1_Sub1_Sub3_7.method489(local828 + this.anInt916);
				this.aClass1_Sub1_Sub3_7.method520(anInt991, local822 + this.anInt915);
				this.anInt945 = this.anIntArray250[0];
				this.anInt946 = this.anIntArray251[0];
				for (@Pc(1094) int local1094 = 1; local1094 < local82; local1094++) {
					local57--;
					this.aClass1_Sub1_Sub3_7.method515(this.anIntArray250[local57] - local822);
					this.aClass1_Sub1_Sub3_7.method514(this.anInt1003, this.anIntArray251[local57] - local828);
				}
				return true;
			} else if (arg2 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1132) RuntimeException local1132) {
			signlink.reporterror("967, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;I)Lclient!QKFGLETG;")
	private Class36 method640(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(10) int local10 = 5;
			try {
				if (this.aClass33Array1[0] != null) {
					local3 = this.aClass33Array1[0].method328(this.aByte51, arg1);
				}
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(40) int local40;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local40 = (int) this.aCRC32_2.getValue();
				if (local40 != arg4) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class36(local3, this.anInt1041);
			}
			local40 = 0;
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method579(arg2, "Requesting " + arg3);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method690(arg0 + arg4);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class1_Sub1_Sub3 local102 = new Class1_Sub1_Sub3((byte) 9, local91);
					local102.anInt806 = 3;
					@Pc(110) int local110 = local102.method502() + 6;
					@Pc(112) int local112 = 6;
					local3 = new byte[local110];
					for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
						local3[local117] = local91[local117];
					}
					@Pc(135) int local135;
					while (local112 < local110) {
						local135 = local110 - local112;
						if (local135 > 1000) {
							local135 = 1000;
						}
						@Pc(146) int local146 = local88.read(local3, local112, local135);
						if (local146 < 0) {
							(new StringBuffer("Length error: ")).append(local112).append("/").append(local110).toString();
							throw new IOException("EOF");
						}
						local112 += local146;
						@Pc(175) int local175 = local112 * 100 / local110;
						if (local175 != local77) {
							this.method579(arg2, "Loading " + arg3 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass33Array1[0] != null) {
							this.aClass33Array1[0].method329(local3, local3.length, arg1);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass33Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg4) {
							local3 = null;
							local40++;
							local62 = "Checksum error: " + local135;
						}
					}
				} catch (@Pc(255) IOException local255) {
					if (local62.equals("Unknown error")) {
						local62 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(265) NullPointerException local265) {
					local62 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(274) ArrayIndexOutOfBoundsException local274) {
					local62 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(283) Exception local283) {
					local62 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local77 = local10; local77 > 0; local77--) {
						if (local40 >= 3) {
							this.method579(arg2, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method579(arg2, local62 + " - Retrying in " + local77);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local10 *= 2;
					if (local10 > 60) {
						local10 = 60;
					}
					this.aBoolean235 = !this.aBoolean235;
				}
			}
			return new Class36(local3, this.anInt1041);
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("68701, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method641(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString27 = "";
				this.aString28 = "Connecting to server...";
				this.method707(true);
			}
			this.aClass12_1 = new Class12((byte) -115, this.method642(anInt969 + 43594), this);
			@Pc(30) long local30 = Class44.method448(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_7.anInt806 = 0;
			this.aClass1_Sub1_Sub3_7.method488(14);
			this.aClass1_Sub1_Sub3_7.method488(local37);
			this.aClass12_1.method106(2, this.aClass1_Sub1_Sub3_7.aByteArray19);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass12_1.method103();
			}
			@Pc(74) int local74 = this.aClass12_1.method103();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass12_1.method105(this.aClass1_Sub1_Sub3_8.aByteArray19, 0, 8);
				this.aClass1_Sub1_Sub3_8.anInt806 = 0;
				this.aLong33 = this.aClass1_Sub1_Sub3_8.method504();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong33 >> 32), (int) this.aLong33 };
				this.aClass1_Sub1_Sub3_7.anInt806 = 0;
				this.aClass1_Sub1_Sub3_7.method488(10);
				this.aClass1_Sub1_Sub3_7.method492(local99[0]);
				this.aClass1_Sub1_Sub3_7.method492(local99[1]);
				this.aClass1_Sub1_Sub3_7.method492(local99[2]);
				this.aClass1_Sub1_Sub3_7.method492(local99[3]);
				this.aClass1_Sub1_Sub3_7.method492(signlink.anInt1079);
				this.aClass1_Sub1_Sub3_7.method495(arg0);
				this.aClass1_Sub1_Sub3_7.method495(arg1);
				this.aClass1_Sub1_Sub3_7.method513(aBigInteger2, (byte) 8, aBigInteger1);
				this.aClass1_Sub1_Sub3_9.anInt806 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_9.method488(18);
				} else {
					this.aClass1_Sub1_Sub3_9.method488(16);
				}
				this.aClass1_Sub1_Sub3_9.method488(this.aClass1_Sub1_Sub3_7.anInt806 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_9.method488(255);
				this.aClass1_Sub1_Sub3_9.method489(321);
				this.aClass1_Sub1_Sub3_9.method488(aBoolean222 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_9.method492(this.anIntArray222[local225]);
				}
				this.aClass1_Sub1_Sub3_9.method496(this.aClass1_Sub1_Sub3_7.aByteArray19, this.aClass1_Sub1_Sub3_7.anInt806);
				this.aClass1_Sub1_Sub3_7.aClass2_1 = new Class2(local99, (byte) 0);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass2_2 = new Class2(local99, (byte) 0);
				this.aClass12_1.method106(this.aClass1_Sub1_Sub3_9.anInt806, this.aClass1_Sub1_Sub3_9.aByteArray19);
				local74 = this.aClass12_1.method103();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method641(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt1015 = this.aClass12_1.method103();
					aBoolean208 = this.aClass12_1.method103() == 1;
					this.aLong32 = 0L;
					this.anInt1016 = 0;
					this.aClass19_1.anInt368 = 0;
					super.aBoolean191 = true;
					this.aBoolean205 = true;
					this.aBoolean237 = true;
					this.aClass1_Sub1_Sub3_7.anInt806 = 0;
					this.aClass1_Sub1_Sub3_8.anInt806 = 0;
					this.anInt956 = -1;
					this.anInt880 = -1;
					this.anInt881 = -1;
					this.anInt882 = -1;
					this.anInt955 = 0;
					this.anInt957 = 0;
					this.anInt971 = 0;
					this.anInt959 = 0;
					this.anInt985 = 0;
					this.anInt863 = 0;
					this.aBoolean217 = false;
					super.anInt849 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray11[local389] = null;
					}
					this.anInt973 = 0;
					this.anInt1044 = 0;
					this.anInt913 = 0;
					this.anInt1060 = 0;
					this.anInt996 = (int) (Math.random() * 100.0D) - 50;
					this.anInt992 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1055 = (int) (Math.random() * 80.0D) - 40;
					this.anInt875 = (int) (Math.random() * 120.0D) - 60;
					this.anInt953 = (int) (Math.random() * 30.0D) - 20;
					this.anInt904 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1026 = 0;
					this.anInt1049 = -1;
					this.anInt945 = 0;
					this.anInt946 = 0;
					this.anInt921 = 0;
					this.anInt963 = 0;
					for (local225 = 0; local225 < this.anInt919; local225++) {
						this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local259] = null;
					}
					aClass1_Sub1_Sub1_Sub2_Sub2_1 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anInt920] = new Class1_Sub1_Sub1_Sub2_Sub2();
					this.aClass13_12.method115();
					this.aClass13_11.method115();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass13ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass13_10 = new Class13(aBoolean230);
					this.anInt868 = 0;
					this.anInt867 = 0;
					this.anInt1062 = -1;
					this.anInt925 = -1;
					this.anInt934 = -1;
					this.anInt878 = -1;
					this.anInt894 = -1;
					this.aBoolean228 = false;
					this.anInt926 = 3;
					this.anInt923 = 0;
					this.aBoolean217 = false;
					this.aBoolean210 = false;
					this.aString30 = null;
					this.anInt966 = 0;
					this.anInt866 = -1;
					this.aBoolean196 = true;
					this.method611();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray265[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray13[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt943 = 0;
					anInt1047 = 0;
					anInt933 = 0;
					anInt910 = 0;
					anInt877 = 0;
					anInt883 = 0;
					anInt970 = 0;
					this.method584();
				} else if (local74 == 3) {
					this.aString27 = "";
					this.aString28 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString27 = "Your account has been disabled.";
					this.aString28 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString27 = "Your account is already logged in.";
					this.aString28 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString27 = "RuneScape has been updated!";
					this.aString28 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString27 = "This world is full.";
					this.aString28 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString27 = "Unable to connect.";
					this.aString28 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString27 = "Login limit exceeded.";
					this.aString28 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString27 = "Unable to connect.";
					this.aString28 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString28 = "Login server rejected session.";
					this.aString28 = "Please try again.";
				} else if (local74 == 12) {
					this.aString27 = "You need a members account to login to this world.";
					this.aString28 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString27 = "Could not complete login.";
					this.aString28 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString27 = "The server is being updated.";
					this.aString28 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean237 = true;
					this.aClass1_Sub1_Sub3_7.anInt806 = 0;
					this.aClass1_Sub1_Sub3_8.anInt806 = 0;
					this.anInt956 = -1;
					this.anInt880 = -1;
					this.anInt881 = -1;
					this.anInt882 = -1;
					this.anInt955 = 0;
					this.anInt957 = 0;
					this.anInt971 = 0;
					this.anInt863 = 0;
					this.aBoolean217 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString27 = "Login attempts exceeded.";
					this.aString28 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString27 = "You are standing in a members-only area.";
					this.aString28 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString27 = "Invalid loginserver requested";
					this.aString28 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass12_1.method103();
					for (@Pc(876) int local876 = local389 + 3; local876 >= 0; local876--) {
						this.aString27 = "You have only just left another world";
						this.aString28 = "Your profile will be transferred in: " + local876;
						this.method707(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(898) Exception local898) {
						}
					}
					this.method641(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString27 = "Unexpected server response";
					this.aString28 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString27 = "No response from server";
					this.aString28 = "Please try using a different world.";
				} else if (this.anInt984 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(920) Exception local920) {
					}
					this.anInt984++;
					this.method641(arg0, arg1, arg2);
				} else {
					this.aString27 = "No response from loginserver";
					this.aString28 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(963) IOException local963) {
			this.aString27 = "";
			this.aString28 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)Ljava/net/Socket;")
	public Socket method642(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method644() {
		try {
			for (@Pc(17) Class1_Sub3 local17 = (Class1_Sub3) this.aClass13_10.method111(); local17 != null; local17 = (Class1_Sub3) this.aClass13_10.method113()) {
				if (local17.anInt493 == -1) {
					local17.anInt501 = 0;
					this.method652(local17, this.aBoolean206);
				} else {
					local17.method565();
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("21436, " + 3 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method645(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(13) int local13;
				do {
					while (true) {
						local13 = this.method571();
						if (local13 == -1) {
							return;
						}
						if (this.anInt934 != -1 && this.anInt934 == this.anInt901) {
							if (local13 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							}
							break;
						}
						@Pc(193) int local193;
						if (this.aBoolean210) {
							if (local13 >= 32 && local13 <= 122 && this.aString24.length() < 80) {
								this.aString24 = this.aString24 + (char) local13;
								this.aBoolean239 = true;
							}
							if (local13 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
								this.aBoolean239 = true;
							}
							if (local13 == 13 || local13 == 10) {
								this.aBoolean210 = false;
								this.aBoolean239 = true;
								@Pc(153) long local153;
								if (this.anInt990 == 1) {
									local153 = Class44.method448(this.aString24);
									this.method677(local153);
								}
								if (this.anInt990 == 2 && this.anInt867 > 0) {
									local153 = Class44.method448(this.aString24);
									this.method613(local153);
								}
								if (this.anInt990 == 3 && this.aString24.length() > 0) {
									this.aClass1_Sub1_Sub3_7.method487(192);
									this.aClass1_Sub1_Sub3_7.method488(0);
									local193 = this.aClass1_Sub1_Sub3_7.anInt806;
									this.aClass1_Sub1_Sub3_7.method494(155, this.aLong29);
									Class34.method333(this.aClass1_Sub1_Sub3_7, this.aBoolean194, this.aString24);
									this.aClass1_Sub1_Sub3_7.method497(this.aClass1_Sub1_Sub3_7.anInt806 - local193);
									this.aString24 = Class34.method334(this.aString24);
									this.aString24 = Class14.method126(this.aString24);
									this.method587(this.aString24, Class44.method452(Class44.method449(this.aLong29, (byte) 7)), 6);
									if (this.anInt982 == 2) {
										this.anInt982 = 1;
										this.aBoolean197 = true;
										this.aClass1_Sub1_Sub3_7.method487(36);
										this.aClass1_Sub1_Sub3_7.method488(this.anInt1050);
										this.aClass1_Sub1_Sub3_7.method488(this.anInt982);
										this.aClass1_Sub1_Sub3_7.method488(this.anInt892);
									}
								}
								if (this.anInt990 == 4 && this.anInt994 < 100) {
									local153 = Class44.method448(this.aString24);
									this.method597(local153);
								}
								if (this.anInt990 == 5 && this.anInt994 > 0) {
									local153 = Class44.method448(this.aString24);
									this.method612(local153);
								}
							}
						} else if (this.anInt923 == 1) {
							if (local13 >= 48 && local13 <= 57 && this.aString18.length() < 10) {
								this.aString18 = this.aString18 + (char) local13;
								this.aBoolean239 = true;
							}
							if (local13 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
								this.aBoolean239 = true;
							}
							if (local13 == 13 || local13 == 10) {
								if (this.aString18.length() > 0) {
									local193 = 0;
									try {
										local193 = Integer.parseInt(this.aString18);
									} catch (@Pc(371) Exception local371) {
									}
									this.aClass1_Sub1_Sub3_7.method487(128);
									this.aClass1_Sub1_Sub3_7.method492(local193);
								}
								this.anInt923 = 0;
								this.aBoolean239 = true;
							}
						} else if (this.anInt923 == 2) {
							if (local13 >= 32 && local13 <= 122 && this.aString18.length() < 12) {
								this.aString18 = this.aString18 + (char) local13;
								this.aBoolean239 = true;
							}
							if (local13 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
								this.aBoolean239 = true;
							}
							if (local13 == 13 || local13 == 10) {
								if (this.aString18.length() > 0) {
									this.aClass1_Sub1_Sub3_7.method487(209);
									this.aClass1_Sub1_Sub3_7.method494(155, Class44.method448(this.aString18));
								}
								this.anInt923 = 0;
								this.aBoolean239 = true;
							}
						} else if (this.anInt925 == -1) {
							if (local13 >= 32 && local13 <= 122 && this.aString19.length() < 80) {
								this.aString19 = this.aString19 + (char) local13;
								this.aBoolean239 = true;
							}
							if (local13 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
								this.aBoolean239 = true;
							}
							if ((local13 == 13 || local13 == 10) && this.aString19.length() > 0) {
								if (this.anInt1015 == 2) {
									if (this.aString19.equals("::clientdrop")) {
										this.method678(this.anInt914);
									}
									if (this.aString19.equals("::lag")) {
										this.method588();
									}
									if (this.aString19.equals("::prefetchmusic")) {
										for (local193 = 0; local193 < this.aClass35_Sub1_1.method369(2, 631); local193++) {
											this.aClass35_Sub1_1.method386(2, local193, (byte) 1);
										}
									}
									if (this.aString19.equals("::fpson")) {
										aBoolean236 = true;
									}
									if (this.aString19.equals("::fpsoff")) {
										aBoolean236 = false;
									}
									if (this.aString19.equals("::noclip")) {
										for (local193 = 0; local193 < 4; local193++) {
											for (@Pc(600) int local600 = 1; local600 < 103; local600++) {
												for (@Pc(604) int local604 = 1; local604 < 103; local604++) {
													this.aClass31Array1[local193].anIntArrayArray14[local600][local604] = 0;
												}
											}
										}
									}
								}
								if (this.aString19.startsWith("::")) {
									this.aClass1_Sub1_Sub3_7.method487(218);
									this.aClass1_Sub1_Sub3_7.method488(this.aString19.length() - 1);
									this.aClass1_Sub1_Sub3_7.method495(this.aString19.substring(2));
								} else {
									@Pc(659) String local659 = this.aString19.toLowerCase();
									@Pc(661) byte local661 = 0;
									if (local659.startsWith("yellow:")) {
										local661 = 0;
										this.aString19 = this.aString19.substring(7);
									} else if (local659.startsWith("red:")) {
										local661 = 1;
										this.aString19 = this.aString19.substring(4);
									} else if (local659.startsWith("green:")) {
										local661 = 2;
										this.aString19 = this.aString19.substring(6);
									} else if (local659.startsWith("cyan:")) {
										local661 = 3;
										this.aString19 = this.aString19.substring(5);
									} else if (local659.startsWith("purple:")) {
										local661 = 4;
										this.aString19 = this.aString19.substring(7);
									} else if (local659.startsWith("white:")) {
										local661 = 5;
										this.aString19 = this.aString19.substring(6);
									} else if (local659.startsWith("flash1:")) {
										local661 = 6;
										this.aString19 = this.aString19.substring(7);
									} else if (local659.startsWith("flash2:")) {
										local661 = 7;
										this.aString19 = this.aString19.substring(7);
									} else if (local659.startsWith("flash3:")) {
										local661 = 8;
										this.aString19 = this.aString19.substring(7);
									} else if (local659.startsWith("glow1:")) {
										local661 = 9;
										this.aString19 = this.aString19.substring(6);
									} else if (local659.startsWith("glow2:")) {
										local661 = 10;
										this.aString19 = this.aString19.substring(6);
									} else if (local659.startsWith("glow3:")) {
										local661 = 11;
										this.aString19 = this.aString19.substring(6);
									}
									local659 = this.aString19.toLowerCase();
									@Pc(833) byte local833 = 0;
									if (local659.startsWith("wave:")) {
										local833 = 1;
										this.aString19 = this.aString19.substring(5);
									} else if (local659.startsWith("wave2:")) {
										local833 = 2;
										this.aString19 = this.aString19.substring(6);
									} else if (local659.startsWith("shake:")) {
										local833 = 3;
										this.aString19 = this.aString19.substring(6);
									} else if (local659.startsWith("scroll:")) {
										local833 = 4;
										this.aString19 = this.aString19.substring(7);
									} else if (local659.startsWith("slide:")) {
										local833 = 5;
										this.aString19 = this.aString19.substring(6);
									}
									this.aClass1_Sub1_Sub3_7.method487(175);
									this.aClass1_Sub1_Sub3_7.method488(0);
									@Pc(914) int local914 = this.aClass1_Sub1_Sub3_7.anInt806;
									this.aClass1_Sub1_Sub3_7.method514(this.anInt1003, local833);
									this.aClass1_Sub1_Sub3_6.anInt806 = 0;
									Class34.method333(this.aClass1_Sub1_Sub3_6, this.aBoolean194, this.aString19);
									this.aClass1_Sub1_Sub3_7.method532(this.aClass1_Sub1_Sub3_6.aByteArray19, this.aClass1_Sub1_Sub3_6.anInt806);
									this.aClass1_Sub1_Sub3_7.method514(this.anInt1003, local661);
									this.aClass1_Sub1_Sub3_7.method497(this.aClass1_Sub1_Sub3_7.anInt806 - local914);
									this.aString19 = Class34.method334(this.aString19);
									this.aString19 = Class14.method126(this.aString19);
									aClass1_Sub1_Sub1_Sub2_Sub2_1.aString7 = this.aString19;
									aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt531 = local661;
									aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt540 = local833;
									aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt541 = 150;
									if (this.anInt1015 == 2) {
										this.method587(aClass1_Sub1_Sub1_Sub2_Sub2_1.aString7, "@cr2@" + aClass1_Sub1_Sub1_Sub2_Sub2_1.aString8, 2);
									} else if (this.anInt1015 == 1) {
										this.method587(aClass1_Sub1_Sub1_Sub2_Sub2_1.aString7, "@cr1@" + aClass1_Sub1_Sub1_Sub2_Sub2_1.aString8, 2);
									} else {
										this.method587(aClass1_Sub1_Sub1_Sub2_Sub2_1.aString7, aClass1_Sub1_Sub1_Sub2_Sub2_1.aString8, 2);
									}
									if (this.anInt1050 == 2) {
										this.anInt1050 = 3;
										this.aBoolean197 = true;
										this.aClass1_Sub1_Sub3_7.method487(36);
										this.aClass1_Sub1_Sub3_7.method488(this.anInt1050);
										this.aClass1_Sub1_Sub3_7.method488(this.anInt982);
										this.aClass1_Sub1_Sub3_7.method488(this.anInt892);
									}
								}
								this.aString19 = "";
								this.aBoolean239 = true;
							}
						}
					}
				} while ((local13 < 97 || local13 > 122) && (local13 < 65 || local13 > 90) && (local13 < 48 || local13 > 57) && local13 != 32);
				if (this.aString25.length() < 12) {
					this.aString25 = this.aString25 + (char) local13;
				}
			}
		} catch (@Pc(1070) RuntimeException local1070) {
			signlink.reporterror("19087, " + arg0 + ", " + local1070.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)I")
	private int method646() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt1037 < 310) {
				@Pc(17) int local17 = this.anInt1034 >> 7;
				@Pc(22) int local22 = this.anInt1036 >> 7;
				@Pc(27) int local27 = aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 >> 7;
				@Pc(32) int local32 = aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt874][local17][local22] & 0x4) != 0) {
					local3 = this.anInt874;
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
						if ((this.aByteArrayArrayArray8[this.anInt874][local17][local22] & 0x4) != 0) {
							local3 = this.anInt874;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt874][local17][local22] & 0x4) != 0) {
								local3 = this.anInt874;
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
						if ((this.aByteArrayArrayArray8[this.anInt874][local17][local22] & 0x4) != 0) {
							local3 = this.anInt874;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt874][local17][local22] & 0x4) != 0) {
								local3 = this.anInt874;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt874][aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 >> 7][aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 >> 7] & 0x4) != 0) {
				local3 = this.anInt874;
			}
			return local3;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("72303, " + 20823 + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)I")
	private int method647() {
		try {
			if (this.anInt1057 != 9) {
				this.anInt956 = -1;
			}
			@Pc(16) int local16 = this.method648(this.anInt1036, this.anInt874, this.anInt1034);
			return local16 - this.anInt1035 >= 800 || (this.aByteArrayArrayArray8[this.anInt874][this.anInt1034 >> 7][this.anInt1036 >> 7] & 0x4) == 0 ? 3 : this.anInt874;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("94400, " + 9 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 7;
			@Pc(11) int local11 = arg0 >> 7;
			if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
				return 0;
			}
			@Pc(25) int local25 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local7][local11] & 0x2) == 2) {
				local25 = arg1 + 1;
			}
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(49) int local49 = arg0 & 0x7F;
			@Pc(77) int local77 = this.anIntArrayArrayArray8[local25][local7][local11] * (128 - local45) + this.anIntArrayArrayArray8[local25][local7 + 1][local11] * local45 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray8[local25][local7][local11 + 1] * (128 - local45) + this.anIntArrayArrayArray8[local25][local7 + 1][local11 + 1] * local45 >> 7;
			return local77 * (128 - local49) + local109 * local49 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("53908, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method649() {
		try {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (this.anInt1064 == 0) {
				local21 = super.anInt847 / 2 - 80;
				local28 = super.anInt848 / 2 + 20;
				local28 += 20;
				if (super.anInt856 == 1 && super.anInt857 >= local21 - 75 && super.anInt857 <= local21 + 75 && super.anInt858 >= local28 - 20 && super.anInt858 <= local28 + 20) {
					this.anInt1064 = 3;
					this.anInt924 = 0;
				}
				local21 = super.anInt847 / 2 + 80;
				if (super.anInt856 == 1 && super.anInt857 >= local21 - 75 && super.anInt857 <= local21 + 75 && super.anInt858 >= local28 - 20 && super.anInt858 <= local28 + 20) {
					this.aString27 = "";
					this.aString28 = "Enter your username & password.";
					this.anInt1064 = 2;
					this.anInt924 = 0;
				}
			} else if (this.anInt1064 == 2) {
				local21 = super.anInt848 / 2 - 40;
				local21 += 30;
				local21 += 25;
				if (super.anInt856 == 1 && super.anInt858 >= local21 - 15 && super.anInt858 < local21) {
					this.anInt924 = 0;
				}
				local21 += 15;
				if (super.anInt856 == 1 && super.anInt858 >= local21 - 15 && super.anInt858 < local21) {
					this.anInt924 = 1;
				}
				local21 += 15;
				local28 = super.anInt847 / 2 - 80;
				@Pc(174) int local174 = super.anInt848 / 2 + 50;
				@Pc(175) int local175 = local174 + 20;
				if (super.anInt856 == 1 && super.anInt857 >= local28 - 75 && super.anInt857 <= local28 + 75 && super.anInt858 >= local175 - 20 && super.anInt858 <= local175 + 20) {
					this.anInt984 = 0;
					this.method641(this.aString20, this.aString21, false);
					if (this.aBoolean237) {
						return;
					}
				}
				local28 = super.anInt847 / 2 + 80;
				if (super.anInt856 == 1 && super.anInt857 >= local28 - 75 && super.anInt857 <= local28 + 75 && super.anInt858 >= local175 - 20 && super.anInt858 <= local175 + 20) {
					this.anInt1064 = 0;
					this.aString20 = "";
					this.aString21 = "";
				}
				while (true) {
					while (true) {
						@Pc(265) int local265 = this.method571();
						if (local265 == -1) {
							return;
						}
						@Pc(270) boolean local270 = false;
						for (@Pc(272) int local272 = 0; local272 < aString22.length(); local272++) {
							if (local265 == aString22.charAt(local272)) {
								local270 = true;
								break;
							}
						}
						if (this.anInt924 == 0) {
							if (local265 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt924 = 1;
							}
							if (local270) {
								this.aString20 = this.aString20 + (char) local265;
							}
							if (this.aString20.length() > 12) {
								this.aString20 = this.aString20.substring(0, 12);
							}
						} else if (this.anInt924 == 1) {
							if (local265 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt924 = 0;
							}
							if (local270) {
								this.aString21 = this.aString21 + (char) local265;
							}
							if (this.aString21.length() > 20) {
								this.aString21 = this.aString21.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1064 == 3) {
				local21 = super.anInt847 / 2;
				local28 = super.anInt848 / 2 + 50;
				@Pc(429) int local429 = local28 + 20;
				if (super.anInt856 == 1 && super.anInt857 >= local21 - 75 && super.anInt857 <= local21 + 75 && super.anInt858 >= local429 - 20 && super.anInt858 <= local429 + 20) {
					this.anInt1064 = 0;
					return;
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("46629, " + -172 + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class13 local9 = this.aClass13ArrayArrayArray1[this.anInt874][arg0][arg1];
		if (local9 == null) {
			this.aClass21_1.method250(this.anInt874, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub5 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub5 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub5) local9.method111(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub5) local9.method113()) {
			@Pc(32) Class5 local32 = Class5.method23(local27.anInt439);
			@Pc(35) int local35 = local32.anInt62;
			if (local32.aBoolean20) {
				local35 *= local27.anInt438 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method109(303, local23);
		@Pc(65) Class1_Sub1_Sub1_Sub5 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub5 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub5) local9.method111(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub5) local9.method113()) {
			if (local27.anInt439 != local23.anInt439 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt439 != local23.anInt439 && local27.anInt439 != local65.anInt439 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass21_1.method236(local23, arg1, this.method648(arg1 * 128 + 64, this.anInt874, arg0 * 128 + 64), local67, this.anInt874, arg0, local110, local65);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method651() {
		try {
			@Pc(8) int local8;
			if (this.anInt1070 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1070 > 768) {
						this.anIntArray224[local8] = this.method659(this.anIntArray225[local8], this.anIntArray226[local8], 1024 - this.anInt1070);
					} else if (this.anInt1070 > 256) {
						this.anIntArray224[local8] = this.anIntArray226[local8];
					} else {
						this.anIntArray224[local8] = this.method659(this.anIntArray226[local8], this.anIntArray225[local8], 256 - this.anInt1070);
					}
				}
			} else if (this.anInt1071 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1071 > 768) {
						this.anIntArray224[local8] = this.method659(this.anIntArray225[local8], this.anIntArray227[local8], 1024 - this.anInt1071);
					} else if (this.anInt1071 > 256) {
						this.anIntArray224[local8] = this.anIntArray227[local8];
					} else {
						this.anIntArray224[local8] = this.method659(this.anIntArray227[local8], this.anIntArray225[local8], 256 - this.anInt1071);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray224[local8] = this.anIntArray225[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass50_9.anIntArray209[local8] = this.aClass1_Sub1_Sub2_Sub4_3.anIntArray208[local8];
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
				local198 = this.anIntArray272[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray252[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray224[local220];
						local239 = this.aClass50_9.anIntArray209[local183];
						this.aClass50_9.anIntArray209[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass50_9.method563(0, super.aGraphics2, 418, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass50_10.anIntArray209[local198] = this.aClass1_Sub1_Sub2_Sub4_4.anIntArray208[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray272[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray252[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray224[local228];
						@Pc(373) int local373 = this.aClass50_10.anIntArray209[local183];
						this.aClass50_10.anIntArray209[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass50_10.method563(0, super.aGraphics2, 418, 637);
		} catch (@Pc(452) RuntimeException local452) {
			signlink.reporterror("96446, " + false + ", " + local452.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OCRHTPRV;Z)V")
	private void method652(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			this.aBoolean237 &= arg1;
			if (arg0.anInt495 == 0) {
				local1 = this.aClass21_1.method255(arg0.anInt494, arg0.anInt496, arg0.anInt497);
			}
			if (arg0.anInt495 == 1) {
				local1 = this.aClass21_1.method256(arg0.anInt497, arg0.anInt496, arg0.anInt494);
			}
			if (arg0.anInt495 == 2) {
				local1 = this.aClass21_1.method257(arg0.anInt494, arg0.anInt496, arg0.anInt497);
			}
			if (arg0.anInt495 == 3) {
				local1 = this.aClass21_1.method258(arg0.anInt494, arg0.anInt496, arg0.anInt497);
			}
			if (local1 != 0) {
				@Pc(82) int local82 = this.aClass21_1.method259(arg0.anInt494, arg0.anInt496, arg0.anInt497, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local82 & 0x1F;
				local7 = local82 >> 6;
			}
			arg0.anInt498 = local3;
			arg0.anInt500 = local5;
			arg0.anInt499 = local7;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("99501, " + arg0 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method653() {
		try {
			signlink.anInt1085 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("7859, " + 1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method654() {
		try {
			if (this.anInt971 > 1) {
				this.anInt971--;
			}
			if (this.anInt959 > 0) {
				this.anInt959--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method617((byte) 7); local22++) {
			}
			if (this.aBoolean237) {
				@Pc(47) Object local47 = this.aClass19_1.anObject1;
				@Pc(72) int local72;
				@Pc(74) int local74;
				@Pc(76) int local76;
				@Pc(109) int local109;
				synchronized (this.aClass19_1.anObject1) {
					if (!aBoolean208) {
						this.aClass19_1.anInt368 = 0;
					} else if (super.anInt856 != 0 || this.aClass19_1.anInt368 >= 40) {
						this.aClass1_Sub1_Sub3_7.method487(33);
						this.aClass1_Sub1_Sub3_7.method488(0);
						local72 = this.aClass1_Sub1_Sub3_7.anInt806;
						local74 = 0;
						@Pc(92) int local92;
						for (local76 = 0; local76 < this.aClass19_1.anInt368 && local72 - this.aClass1_Sub1_Sub3_7.anInt806 < 240; local76++) {
							local74++;
							local92 = this.aClass19_1.anIntArray84[local76];
							if (local92 < 0) {
								local92 = 0;
							} else if (local92 > 502) {
								local92 = 502;
							}
							local109 = this.aClass19_1.anIntArray83[local76];
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 > 764) {
								local109 = 764;
							}
							@Pc(126) int local126 = local92 * 765 + local109;
							if (this.aClass19_1.anIntArray84[local76] == -1 && this.aClass19_1.anIntArray83[local76] == -1) {
								local109 = -1;
								local92 = -1;
								local126 = 524287;
							}
							if (local109 != this.anInt1066 || local92 != this.anInt1067) {
								@Pc(171) int local171 = local109 - this.anInt1066;
								this.anInt1066 = local109;
								@Pc(179) int local179 = local92 - this.anInt1067;
								this.anInt1067 = local92;
								if (this.anInt1016 < 8 && local171 >= -32 && local171 <= 31 && local179 >= -32 && local179 <= 31) {
									local171 += 32;
									local179 += 32;
									this.aClass1_Sub1_Sub3_7.method489((this.anInt1016 << 12) + (local171 << 6) + local179);
									this.anInt1016 = 0;
								} else if (this.anInt1016 < 8) {
									this.aClass1_Sub1_Sub3_7.method491((this.anInt1016 << 19) + local126 + 8388608);
									this.anInt1016 = 0;
								} else {
									this.aClass1_Sub1_Sub3_7.method492((this.anInt1016 << 19) + local126 - 1073741824);
									this.anInt1016 = 0;
								}
							} else if (this.anInt1016 < 2047) {
								this.anInt1016++;
							}
						}
						this.aClass1_Sub1_Sub3_7.method497(this.aClass1_Sub1_Sub3_7.anInt806 - local72);
						if (local74 >= this.aClass19_1.anInt368) {
							this.aClass19_1.anInt368 = 0;
						} else {
							this.aClass19_1.anInt368 -= local74;
							for (local92 = 0; local92 < this.aClass19_1.anInt368; local92++) {
								this.aClass19_1.anIntArray83[local92] = this.aClass19_1.anIntArray83[local92 + local74];
								this.aClass19_1.anIntArray84[local92] = this.aClass19_1.anIntArray84[local92 + local74];
							}
						}
					}
				}
				if (super.anInt856 != 0) {
					@Pc(342) long local342 = (super.aLong28 - this.aLong32) / 50L;
					if (local342 > 4095L) {
						local342 = 4095L;
					}
					this.aLong32 = super.aLong28;
					local72 = super.anInt858;
					if (local72 < 0) {
						local72 = 0;
					} else if (local72 > 502) {
						local72 = 502;
					}
					local74 = super.anInt857;
					if (local74 < 0) {
						local74 = 0;
					} else if (local74 > 764) {
						local74 = 764;
					}
					local76 = local72 * 765 + local74;
					@Pc(388) byte local388 = 0;
					if (super.anInt856 == 2) {
						local388 = 1;
					}
					local109 = (int) local342;
					this.aClass1_Sub1_Sub3_7.method487(133);
					this.aClass1_Sub1_Sub3_7.method529((local109 << 20) + (local388 << 19) + local76);
				}
				if (this.anInt929 > 0) {
					this.anInt929--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean209 = true;
				}
				if (this.aBoolean209 && this.anInt929 <= 0) {
					this.anInt929 = 20;
					this.aBoolean209 = false;
					this.aClass1_Sub1_Sub3_7.method487(73);
					this.aClass1_Sub1_Sub3_7.method489(this.anInt903);
					this.aClass1_Sub1_Sub3_7.method489(this.anInt904);
				}
				if (super.aBoolean191 && !this.aBoolean205) {
					this.aBoolean205 = true;
					this.aClass1_Sub1_Sub3_7.method487(95);
					this.aClass1_Sub1_Sub3_7.method488(1);
				}
				if (!super.aBoolean191 && this.aBoolean205) {
					this.aBoolean205 = false;
					this.aClass1_Sub1_Sub3_7.method487(95);
					this.aClass1_Sub1_Sub3_7.method488(0);
				}
				this.method673(823);
				this.method676();
				this.method598();
				this.anInt957++;
				if (this.anInt957 > 750) {
					this.method678(this.anInt914);
				}
				this.method610(this.aBoolean234);
				this.method694();
				this.method684();
				this.anInt939++;
				if (this.anInt1077 != 0) {
					this.anInt1076 += 20;
					if (this.anInt1076 >= 400) {
						this.anInt1077 = 0;
					}
				}
				if (this.anInt1013 != 0) {
					this.anInt1010++;
					if (this.anInt1010 >= 15) {
						if (this.anInt1013 == 2) {
							this.aBoolean219 = true;
						}
						if (this.anInt1013 == 3) {
							this.aBoolean239 = true;
						}
						this.anInt1013 = 0;
					}
				}
				if (this.anInt950 != 0) {
					this.anInt900++;
					if (super.anInt851 > this.anInt951 + 5 || super.anInt851 < this.anInt951 - 5 || super.anInt852 > this.anInt952 + 5 || super.anInt852 < this.anInt952 - 5) {
						this.aBoolean214 = true;
					}
					if (super.anInt850 == 0) {
						if (this.anInt950 == 2) {
							this.aBoolean219 = true;
						}
						if (this.anInt950 == 3) {
							this.aBoolean239 = true;
						}
						this.anInt950 = 0;
						if (this.aBoolean214 && this.anInt900 >= 5) {
							this.anInt1073 = -1;
							this.method685();
							if (this.anInt1073 == this.anInt948 && this.anInt1072 != this.anInt949) {
								@Pc(691) Class38 local691 = Class38.aClass38Array1[this.anInt948];
								@Pc(693) byte local693 = 0;
								if (this.anInt911 == 1 && local691.anInt640 == 206) {
									local693 = 1;
								}
								if (local691.anIntArray159[this.anInt1072] <= 0) {
									local693 = 0;
								}
								if (local691.aBoolean128) {
									local72 = this.anInt949;
									local74 = this.anInt1072;
									local691.anIntArray159[local74] = local691.anIntArray159[local72];
									local691.anIntArray156[local74] = local691.anIntArray156[local72];
									local691.anIntArray159[local72] = -1;
									local691.anIntArray156[local72] = 0;
								} else if (local693 == 1) {
									local72 = this.anInt949;
									local74 = this.anInt1072;
									while (local72 != local74) {
										if (local72 > local74) {
											local691.method353(local72 - 1, local72);
											local72--;
										} else if (local72 < local74) {
											local691.method353(local72 + 1, local72);
											local72++;
										}
									}
								} else {
									local691.method353(this.anInt1072, this.anInt949);
								}
								this.aClass1_Sub1_Sub3_7.method487(248);
								this.aClass1_Sub1_Sub3_7.method488(local693);
								this.aClass1_Sub1_Sub3_7.method522(this.anInt1072);
								this.aClass1_Sub1_Sub3_7.method520(anInt991, this.anInt949);
								this.aClass1_Sub1_Sub3_7.method522(this.anInt948);
							}
						} else if ((this.anInt1058 == 1 || this.method586(this.anInt863 - 1)) && this.anInt863 > 2) {
							this.method605();
						} else if (this.anInt863 > 0) {
							this.method681(this.anInt863 - 1);
						}
						this.anInt1010 = 10;
						super.anInt856 = 0;
					}
				}
				@Pc(866) int local866;
				@Pc(868) int local868;
				if (Class21.anInt401 != -1) {
					local866 = Class21.anInt401;
					local868 = Class21.anInt402;
					@Pc(889) boolean local889 = this.method639(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local866, true, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local868, 0, 0);
					Class21.anInt401 = -1;
					if (local889) {
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 1;
						this.anInt1076 = 0;
					}
				}
				if (super.anInt856 == 1 && this.aString30 != null) {
					this.aString30 = null;
					this.aBoolean239 = true;
					super.anInt856 = 0;
				}
				this.method600();
				this.method594((byte) 1);
				this.method630();
				this.method632();
				if (super.anInt850 == 1 || super.anInt856 == 1) {
					this.anInt1043++;
				}
				if (this.anInt913 == 2) {
					this.method635();
				}
				if (this.anInt913 == 2 && this.aBoolean193) {
					this.method623();
				}
				for (local866 = 0; local866 < 5; local866++) {
					@Pc(975) int local975 = this.anIntArray238[local866]++;
				}
				this.method645((byte) 2);
				super.anInt849++;
				if (super.anInt849 > 4500) {
					this.anInt959 = 250;
					super.anInt849 -= 500;
					this.aClass1_Sub1_Sub3_7.method487(166);
				}
				this.anInt965++;
				if (this.anInt965 > 500) {
					this.anInt965 = 0;
					local868 = (int) (Math.random() * 8.0D);
					if ((local868 & 0x1) == 1) {
						this.anInt996 += this.anInt997;
					}
					if ((local868 & 0x2) == 2) {
						this.anInt992 += this.anInt993;
					}
					if ((local868 & 0x4) == 4) {
						this.anInt1055 += this.anInt1056;
					}
				}
				if (this.anInt996 < -50) {
					this.anInt997 = 2;
				}
				if (this.anInt996 > 50) {
					this.anInt997 = -2;
				}
				if (this.anInt992 < -55) {
					this.anInt993 = 2;
				}
				if (this.anInt992 > 55) {
					this.anInt993 = -2;
				}
				if (this.anInt1055 < -40) {
					this.anInt1056 = 1;
				}
				if (this.anInt1055 > 40) {
					this.anInt1056 = -1;
				}
				this.anInt986++;
				if (this.anInt986 > 500) {
					this.anInt986 = 0;
					local868 = (int) (Math.random() * 8.0D);
					if ((local868 & 0x1) == 1) {
						this.anInt875 += this.anInt876;
					}
					if ((local868 & 0x2) == 2) {
						this.anInt953 += this.anInt954;
					}
				}
				if (this.anInt875 < -60) {
					this.anInt876 = 2;
				}
				if (this.anInt875 > 60) {
					this.anInt876 = -2;
				}
				if (this.anInt953 < -20) {
					this.anInt954 = 1;
				}
				if (this.anInt953 > 10) {
					this.anInt954 = -1;
				}
				this.anInt958++;
				if (this.anInt958 > 50) {
					this.aClass1_Sub1_Sub3_7.method487(220);
				}
				try {
					if (this.aClass12_1 != null && this.aClass1_Sub1_Sub3_7.anInt806 > 0) {
						this.aClass12_1.method106(this.aClass1_Sub1_Sub3_7.anInt806, this.aClass1_Sub1_Sub3_7.aByteArray19);
						this.aClass1_Sub1_Sub3_7.anInt806 = 0;
						this.anInt958 = 0;
					}
				} catch (@Pc(1217) IOException local1217) {
					this.method678(this.anInt914);
				} catch (@Pc(1223) Exception local1223) {
					this.method663();
				}
			}
		} catch (@Pc(1228) RuntimeException local1228) {
			signlink.reporterror("29625, " + 18097 + ", " + local1228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method655() {
		try {
			for (@Pc(16) Class1_Sub1_Sub1_Sub6 local16 = (Class1_Sub1_Sub1_Sub6) this.aClass13_12.method111(); local16 != null; local16 = (Class1_Sub1_Sub1_Sub6) this.aClass13_12.method113()) {
				if (local16.anInt610 != this.anInt874 || anInt987 > local16.anInt602) {
					local16.method565();
				} else if (anInt987 >= local16.anInt601) {
					if (local16.anInt600 > 0) {
						@Pc(46) Class1_Sub1_Sub1_Sub2_Sub1 local46 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local16.anInt600 - 1];
						if (local46 != null && local46.anInt564 >= 0 && local46.anInt564 < 13312 && local46.anInt565 >= 0 && local46.anInt565 < 13312) {
							local16.method342(local46.anInt564, local46.anInt565, this.method648(local46.anInt565, local16.anInt610, local46.anInt564) - local16.anInt607, anInt987);
						}
					}
					if (local16.anInt600 < 0) {
						@Pc(91) int local91 = -local16.anInt600 - 1;
						@Pc(97) Class1_Sub1_Sub1_Sub2_Sub2 local97;
						if (local91 == this.anInt979) {
							local97 = aClass1_Sub1_Sub1_Sub2_Sub2_1;
						} else {
							local97 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local91];
						}
						if (local97 != null && local97.anInt564 >= 0 && local97.anInt564 < 13312 && local97.anInt565 >= 0 && local97.anInt565 < 13312) {
							local16.method342(local97.anInt564, local97.anInt565, this.method648(local97.anInt565, local16.anInt610, local97.anInt564) - local16.anInt607, anInt987);
						}
					}
					local16.method343(this.anInt939);
					this.aClass21_1.method240(local16.anInt608, this.anInt874, (int) local16.aDouble6, (int) local16.aDouble7, 60, (int) local16.aDouble8, -1, local16, false);
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("54820, " + 89 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method656(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub4_14.anIntArray208;
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
						this.aClass21_1.method264(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass21_1.method264(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub4_14.method549(823);
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method629(local142, arg0, local36, local34, local146);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method629(local142, arg0 + 1, local36, local34, local146);
					}
				}
			}
			this.aClass50_17.method562();
			anInt981++;
			if (anInt981 > 58) {
				anInt981 = 0;
				this.aClass1_Sub1_Sub3_7.method487(91);
			}
			this.anInt942 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(239) int local239 = 0; local239 < 104; local239++) {
					@Pc(249) int local249 = this.aClass21_1.method258(this.anInt874, local146, local239);
					if (local249 != 0) {
						local249 = local249 >> 14 & 0x7FFF;
						@Pc(261) int local261 = Class42.method395(local249).anInt696;
						if (local261 >= 0) {
							@Pc(265) int local265 = local146;
							@Pc(267) int local267 = local239;
							if (local261 != 22 && local261 != 29 && local261 != 34 && local261 != 36 && local261 != 46 && local261 != 47 && local261 != 48) {
								@Pc(299) int[][] local299 = this.aClass31Array1[this.anInt874].anIntArrayArray14;
								for (@Pc(301) int local301 = 0; local301 < 10; local301++) {
									@Pc(308) int local308 = (int) (Math.random() * 4.0D);
									if (local308 == 0 && local265 > 0 && local265 > local146 - 3 && (local299[local265 - 1][local267] & 0x1280108) == 0) {
										local265--;
									}
									if (local308 == 1 && local265 < 103 && local265 < local146 + 3 && (local299[local265 + 1][local267] & 0x1280180) == 0) {
										local265++;
									}
									if (local308 == 2 && local267 > 0 && local267 > local239 - 3 && (local299[local265][local267 - 1] & 0x1280102) == 0) {
										local267--;
									}
									if (local308 == 3 && local267 < 103 && local267 < local239 + 3 && (local299[local265][local267 + 1] & 0x1280120) == 0) {
										local267++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub4Array5[this.anInt942] = this.aClass1_Sub1_Sub2_Sub4Array8[local261];
							this.anIntArray240[this.anInt942] = local265;
							this.anIntArray241[this.anInt942] = local267;
							this.anInt942++;
						}
					}
				}
			}
		} catch (@Pc(438) RuntimeException local438) {
			signlink.reporterror("79934, " + 2 + ", " + arg0 + ", " + local438.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method657() {
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
				this.anInt1049 = -1;
				this.aClass13_11.method115();
				this.aClass13_12.method115();
				Class1_Sub1_Sub2_Sub2.method83();
				this.method580();
				this.aClass21_1.method229(818);
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass31Array1[local22].method298();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class45 local77 = new Class45(this.aByteArrayArrayArray8, 104, -239, 104, this.anIntArrayArrayArray8);
				local43 = this.aByteArrayArray5.length;
				this.aClass1_Sub1_Sub3_7.method487(220);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean218) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray245[local91] >> 8) * 64 - this.anInt915;
						local117 = (this.anIntArray245[local91] & 0xFF) * 64 - this.anInt916;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method471((this.anInt896 - 6) * 8, local117, local105, this.aClass31Array1, local122, (this.anInt895 - 6) * 8);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray245[local105] >> 8) * 64 - this.anInt915;
						local176 = (this.anIntArray245[local105] & 0xFF) * 64 - this.anInt916;
						@Pc(181) byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt896 < 800) {
							local77.method461(64, 64, local176, local117);
						}
					}
					this.aClass1_Sub1_Sub3_7.method487(220);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray4[local117];
						if (local122 != null) {
							local226 = (this.anIntArray245[local117] >> 8) * 64 - this.anInt915;
							local238 = (this.anIntArray245[local117] & 0xFF) * 64 - this.anInt916;
							local77.method456(this.aClass31Array1, local238, this.aClass21_1, local122, local226);
						}
					}
				}
				if (this.aBoolean218) {
					local91 = 0;
					label246: while (true) {
						@Pc(297) int local297;
						@Pc(303) int local303;
						@Pc(313) int local313;
						@Pc(315) int local315;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method461(8, 8, local117 * 8, local105 * 8);
									}
								}
							}
							this.aClass1_Sub1_Sub3_7.method487(220);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label246;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local226 = 0; local226 < 13; local226++) {
										local238 = this.anIntArrayArrayArray7[local117][local176][local226];
										if (local238 != -1) {
											local297 = local238 >> 24 & 0x3;
											local303 = local238 >> 1 & 0x3;
											local313 = local238 >> 14 & 0x3FF;
											local315 = local238 >> 3 & 0x7FF;
											@Pc(478) int local478 = (local313 / 8 << 8) + local315 / 8;
											for (@Pc(480) int local480 = 0; local480 < this.anIntArray245.length; local480++) {
												if (this.anIntArray245[local480] == local478 && this.aByteArrayArray4[local480] != null) {
													local77.method454((local315 & 0x7) * 8, this.aClass31Array1, local297, local117, this.aClass21_1, local303, local176 * 8, local226 * 8, (local313 & 0x7) * 8, this.aByteArrayArray4[local480]);
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
								local176 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local176 != -1) {
									local226 = local176 >> 24 & 0x3;
									local238 = local176 >> 1 & 0x3;
									local297 = local176 >> 14 & 0x3FF;
									local303 = local176 >> 3 & 0x7FF;
									local313 = (local297 / 8 << 8) + local303 / 8;
									for (local315 = 0; local315 < this.anIntArray245.length; local315++) {
										if (this.anIntArray245[local315] == local313 && this.aByteArrayArray5[local315] != null) {
											local77.method465(this.aClass31Array1, this.aByteArrayArray5[local315], local226, local105 * 8, local238, (local303 & 0x7) * 8, (local297 & 0x7) * 8, local91, local117 * 8);
											break;
										}
									}
								}
							}
						}
						local91++;
					}
				}
				this.aClass1_Sub1_Sub3_7.method487(220);
				local77.method473(this.aClass21_1, this.aClass31Array1);
				this.aClass50_17.method562();
				this.aClass1_Sub1_Sub3_7.method487(220);
				local91 = Class45.anInt761;
				if (local91 > this.anInt874) {
					local91 = this.anInt874;
				}
				if (local91 < this.anInt874 - 1) {
					local91 = this.anInt874 - 1;
				}
				if (aBoolean222) {
					this.aClass21_1.method230(Class45.anInt761);
				} else {
					this.aClass21_1.method230(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method650(local105, local117);
					}
				}
				this.method644();
			} catch (@Pc(623) Exception local623) {
			}
			Class42.aClass18_8.method218();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub3_7.method487(126);
				this.aClass1_Sub1_Sub3_7.method492(1057001181);
			}
			if (aBoolean222 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass35_Sub1_1.method369(0, 631);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass35_Sub1_1.method379(local35);
					if ((local39 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub3.method181(local35);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub2.method84();
			this.aClass35_Sub1_1.method385();
			local22 = (this.anInt895 - 6) / 8 - 1;
			local35 = (this.anInt895 + 6) / 8 + 1;
			local39 = (this.anInt896 - 6) / 8 - 1;
			local43 = (this.anInt896 + 6) / 8 + 1;
			if (this.aBoolean195) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass35_Sub1_1.method378(0, local91, local105);
						if (local117 != -1) {
							this.aClass35_Sub1_1.method381(this.anInt1027, 3, local117);
						}
						local176 = this.aClass35_Sub1_1.method378(1, local91, local105);
						if (local176 != -1) {
							this.aClass35_Sub1_1.method381(this.anInt1027, 3, local176);
						}
					}
				}
			}
		} catch (@Pc(794) RuntimeException local794) {
			signlink.reporterror("99955, " + false + ", " + local794.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RWLOYYVC;B)V")
	private void method658(@OriginalArg(0) Class38 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt640;
			@Pc(73) int local73;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local73 = this.anInt867;
					if (this.anInt868 != 2) {
						local73 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local73) {
						arg0.aString11 = "";
						arg0.anInt644 = 0;
					} else {
						if (this.anIntArray242[local4] == 0) {
							arg0.aString11 = "@red@Offline";
						} else if (this.anIntArray242[local4] == anInt968) {
							arg0.aString11 = "@gre@World-" + (this.anIntArray242[local4] - 9);
						} else {
							arg0.aString11 = "@yel@World-" + (this.anIntArray242[local4] - 9);
						}
						arg0.anInt644 = 1;
					}
				} else if (local4 == 203) {
					local73 = this.anInt867;
					if (this.anInt868 != 2) {
						local73 = 0;
					}
					arg0.anInt638 = local73 * 15 + 20;
					if (arg0.anInt638 <= arg0.anInt635) {
						arg0.anInt638 = arg0.anInt635 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt868 == 0) {
						arg0.aString11 = "Loading ignore list";
						arg0.anInt644 = 0;
					} else if (local4 == 1 && this.anInt868 == 0) {
						arg0.aString11 = "Please wait...";
						arg0.anInt644 = 0;
					} else {
						local73 = this.anInt994;
						if (this.anInt868 == 0) {
							local73 = 0;
						}
						if (local4 >= local73) {
							arg0.aString11 = "";
							arg0.anInt644 = 0;
						} else {
							arg0.aString11 = Class44.method452(Class44.method449(this.aLongArray3[local4], (byte) 7));
							arg0.anInt644 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt638 = this.anInt994 * 15 + 20;
					if (arg0.anInt638 <= arg0.anInt635) {
						arg0.anInt638 = arg0.anInt635 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt626 = 150;
					arg0.anInt627 = (int) (Math.sin((double) anInt987 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean223) {
						for (local73 = 0; local73 < 7; local73++) {
							@Pc(342) int local342 = this.anIntArray261[local73];
							if (local342 >= 0 && !Class32.aClass32Array1[local342].method312()) {
								return;
							}
						}
						this.aBoolean223 = false;
						@Pc(361) Class1_Sub1_Sub1_Sub3[] local361 = new Class1_Sub1_Sub1_Sub3[7];
						@Pc(363) int local363 = 0;
						for (@Pc(365) int local365 = 0; local365 < 7; local365++) {
							@Pc(372) int local372 = this.anIntArray261[local365];
							if (local372 >= 0) {
								local361[local363++] = Class32.aClass32Array1[local372].method313(893);
							}
						}
						@Pc(394) Class1_Sub1_Sub1_Sub3 local394 = new Class1_Sub1_Sub1_Sub3(local363, 221, local361);
						for (@Pc(396) int local396 = 0; local396 < 5; local396++) {
							if (this.anIntArray265[local396] != 0) {
								local394.method196(anIntArrayArray25[local396][0], anIntArrayArray25[local396][this.anIntArray265[local396]]);
								if (local396 == 1) {
									local394.method196(anIntArray262[0], anIntArray262[this.anIntArray265[local396]]);
								}
							}
						}
						local394.method189(284);
						local394.method190(Class16.aClass16Array1[aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt529].anIntArray78[0]);
						local394.method199(64, 850, -30, -50, -30, true);
						arg0.anInt642 = 5;
						arg0.anInt643 = 0;
						Class38.method352(local394);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub4_15 == null) {
						this.aClass1_Sub1_Sub2_Sub4_15 = arg0.aClass1_Sub1_Sub2_Sub4_2;
						this.aClass1_Sub1_Sub2_Sub4_16 = arg0.aClass1_Sub1_Sub2_Sub4_1;
					}
					if (this.aBoolean196) {
						arg0.aClass1_Sub1_Sub2_Sub4_2 = this.aClass1_Sub1_Sub2_Sub4_16;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub4_2 = this.aClass1_Sub1_Sub2_Sub4_15;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub4_15 == null) {
						this.aClass1_Sub1_Sub2_Sub4_15 = arg0.aClass1_Sub1_Sub2_Sub4_2;
						this.aClass1_Sub1_Sub2_Sub4_16 = arg0.aClass1_Sub1_Sub2_Sub4_1;
					}
					if (this.aBoolean196) {
						arg0.aClass1_Sub1_Sub2_Sub4_2 = this.aClass1_Sub1_Sub2_Sub4_15;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub4_2 = this.aClass1_Sub1_Sub2_Sub4_16;
					}
				} else if (local4 == 600) {
					arg0.aString11 = this.aString25;
					if (anInt987 % 20 < 10) {
						arg0.aString11 = arg0.aString11 + "|";
					} else {
						arg0.aString11 = arg0.aString11 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt1015 < 1) {
							arg0.aString11 = "";
						} else if (this.aBoolean203) {
							arg0.anInt617 = 16711680;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt617 = 16777215;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(602) String local602;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt995 == 0) {
							arg0.aString11 = "";
						} else {
							if (this.anInt978 == 0) {
								local602 = "earlier today";
							} else if (this.anInt978 == 1) {
								local602 = "yesterday";
							} else {
								local602 = this.anInt978 + " days ago";
							}
							arg0.aString11 = "You last logged in " + local602 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt1004 == 0) {
							arg0.aString11 = "0 unread messages";
							arg0.anInt617 = 16776960;
						}
						if (this.anInt1004 == 1) {
							arg0.aString11 = "1 unread message";
							arg0.anInt617 = 65280;
						}
						if (this.anInt1004 > 1) {
							arg0.aString11 = this.anInt1004 + " unread messages";
							arg0.anInt617 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt1001 == 201) {
							if (this.anInt1042 == 1) {
								arg0.aString11 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt1001 == 200) {
							arg0.aString11 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt1001 == 0) {
								local602 = "Earlier today";
							} else if (this.anInt1001 == 1) {
								local602 = "Yesterday";
							} else {
								local602 = this.anInt1001 + " days ago";
							}
							arg0.aString11 = local602 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt1001 == 201) {
							if (this.anInt1042 == 1) {
								arg0.aString11 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt1001 == 200) {
							arg0.aString11 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString11 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt1001 == 201) {
							if (this.anInt1042 == 1) {
								arg0.aString11 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt1001 == 200) {
							arg0.aString11 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString11 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt868 == 0) {
				arg0.aString11 = "Loading friend list";
				arg0.anInt644 = 0;
			} else if (local4 == 1 && this.anInt868 == 1) {
				arg0.aString11 = "Connecting to friendserver";
				arg0.anInt644 = 0;
			} else if (local4 == 2 && this.anInt868 != 2) {
				arg0.aString11 = "Please wait...";
				arg0.anInt644 = 0;
			} else {
				local73 = this.anInt867;
				if (this.anInt868 != 2) {
					local73 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local73) {
					arg0.aString11 = "";
					arg0.anInt644 = 0;
				} else {
					arg0.aString11 = this.aStringArray9[local4];
					arg0.anInt644 = 1;
				}
			}
		} catch (@Pc(810) RuntimeException local810) {
			signlink.reporterror("85936, " + arg0 + ", " + 0 + ", " + local810.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method575(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.aBoolean216 || this.aBoolean211 || this.aBoolean229) {
				this.method664(this.anInt1069);
			} else {
				anInt1014++;
				if (this.aBoolean237) {
					this.method701();
				} else {
					this.method707(false);
				}
				this.anInt1043 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("39539, " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("32394, " + arg0 + ", " + arg1 + ", " + -979 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XJCNBMKS;IZ)V")
	private void method660(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt922; local8++) {
				@Pc(15) int local15 = this.anIntArray221[local8];
				@Pc(20) Class1_Sub1_Sub1_Sub2_Sub1 local20 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local15];
				@Pc(23) int local23 = arg0.method498();
				if ((local23 & 0x2) != 0) {
					local20.aString7 = arg0.method505();
					local20.anInt541 = 100;
				}
				@Pc(42) int local42;
				@Pc(46) int local46;
				if ((local23 & 0x20) != 0) {
					local42 = arg0.method518();
					local46 = arg0.method517();
					local20.method323(anInt987, local46, local42);
					local20.anInt520 = anInt987 + 300;
					local20.anInt521 = arg0.method516();
					local20.anInt522 = arg0.method518();
				}
				if ((local23 & 0x8) != 0) {
					local20.anInt524 = arg0.method523();
					local42 = arg0.method531();
					local20.anInt528 = local42 >> 16;
					local20.anInt527 = anInt987 + (local42 & 0xFFFF);
					local20.anInt525 = 0;
					local20.anInt526 = 0;
					if (local20.anInt527 > anInt987) {
						local20.anInt525 = -1;
					}
					if (local20.anInt524 == 65535) {
						local20.anInt524 = -1;
					}
				}
				if ((local23 & 0x40) != 0) {
					local20.anInt555 = arg0.method524();
					if (local20.anInt555 == 65535) {
						local20.anInt555 = -1;
					}
				}
				if ((local23 & 0x10) != 0) {
					local20.aClass27_1 = Class27.method294(arg0.method525());
					local20.anInt558 = local20.aClass27_1.aByte17;
					local20.anInt552 = local20.aClass27_1.anInt460;
					local20.anInt559 = local20.aClass27_1.anInt458;
					local20.anInt560 = local20.aClass27_1.anInt461;
					local20.anInt561 = local20.aClass27_1.anInt457;
					local20.anInt562 = local20.aClass27_1.anInt469;
					local20.anInt529 = local20.aClass27_1.anInt466;
				}
				if ((local23 & 0x4) != 0) {
					local42 = arg0.method523();
					if (local42 == 65535) {
						local42 = -1;
					}
					local46 = arg0.method498();
					if (local42 == local20.anInt546 && local42 != -1) {
						@Pc(201) int local201 = Class16.aClass16Array1[local42].anInt341;
						if (local201 == 1) {
							local20.anInt547 = 0;
							local20.anInt548 = 0;
							local20.anInt549 = local46;
							local20.anInt550 = 0;
						}
						if (local201 == 2) {
							local20.anInt550 = 0;
						}
					} else if (local42 == -1 || local20.anInt546 == -1 || Class16.aClass16Array1[local42].anInt335 >= Class16.aClass16Array1[local20.anInt546].anInt335) {
						local20.anInt546 = local42;
						local20.anInt547 = 0;
						local20.anInt548 = 0;
						local20.anInt549 = local46;
						local20.anInt550 = 0;
						local20.anInt567 = local20.anInt551;
					}
				}
				if ((local23 & 0x80) != 0) {
					local20.anInt556 = arg0.method523();
					local20.anInt557 = arg0.method525();
				}
				if ((local23 & 0x1) != 0) {
					local42 = arg0.method518();
					local46 = arg0.method517();
					local20.method323(anInt987, local46, local42);
					local20.anInt520 = anInt987 + 300;
					local20.anInt521 = arg0.method498();
					local20.anInt522 = arg0.method517();
				}
			}
		} catch (@Pc(313) RuntimeException local313) {
			signlink.reporterror("77052, " + arg0 + ", " + arg1 + ", " + false + ", " + local313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OTTYZSZE;ILclient!XJCNBMKS;II)V")
	private void method661(@OriginalArg(0) Class1_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(16) int local16;
			@Pc(20) int local20;
			if ((arg2 & 0x2) != 0) {
				local16 = arg1.method518();
				local20 = arg1.method516();
				arg0.method323(anInt987, local20, local16);
				arg0.anInt520 = anInt987 + 300;
				arg0.anInt521 = arg1.method498();
				arg0.anInt522 = arg1.method516();
			}
			if ((arg2 & 0x200) != 0) {
				arg0.anInt533 = arg1.method518();
				arg0.anInt535 = arg1.method516();
				arg0.anInt534 = arg1.method517();
				arg0.anInt536 = arg1.method518();
				arg0.anInt537 = arg1.method525() + anInt987;
				arg0.anInt538 = arg1.method523() + anInt987;
				arg0.anInt539 = arg1.method518();
				arg0.method324();
			}
			if ((arg2 & 0x20) != 0) {
				arg0.anInt555 = arg1.method500();
				if (arg0.anInt555 == 65535) {
					arg0.anInt555 = -1;
				}
			}
			if ((arg2 & 0x8) != 0) {
				arg0.anInt556 = arg1.method523();
				arg0.anInt557 = arg1.method500();
			}
			if ((arg2 & 0x100) != 0) {
				local16 = arg1.method517();
				local20 = arg1.method518();
				arg0.method323(anInt987, local20, local16);
				arg0.anInt520 = anInt987 + 300;
				arg0.anInt521 = arg1.method498();
				arg0.anInt522 = arg1.method498();
			}
			if ((arg2 & 0x4) != 0) {
				local16 = arg1.method517();
				@Pc(156) byte[] local156 = new byte[local16];
				@Pc(162) Class1_Sub1_Sub3 local162 = new Class1_Sub1_Sub3((byte) 9, local156);
				arg1.method533(local156, local16);
				this.aClass1_Sub1_Sub3Array1[arg3] = local162;
				arg0.method326(this.aBoolean212, local162);
			}
			@Pc(193) int local193;
			if ((arg2 & 0x40) != 0) {
				local16 = arg1.method523();
				local20 = arg1.method517();
				local193 = arg1.method498();
				@Pc(196) int local196 = arg1.anInt806;
				if (arg0.aString8 != null && arg0.aBoolean111) {
					@Pc(206) long local206 = Class44.method448(arg0.aString8);
					@Pc(208) boolean local208 = false;
					if (local20 <= 1) {
						for (@Pc(213) int local213 = 0; local213 < this.anInt994; local213++) {
							if (this.aLongArray3[local213] == local206) {
								local208 = true;
								break;
							}
						}
					}
					if (!local208 && this.anInt891 == 0) {
						try {
							this.aClass1_Sub1_Sub3_6.anInt806 = 0;
							arg1.method534(this.aClass1_Sub1_Sub3_6.aByteArray19, local193);
							this.aClass1_Sub1_Sub3_6.anInt806 = 0;
							@Pc(259) String local259 = Class34.method332(this.aBoolean207, local193, this.aClass1_Sub1_Sub3_6);
							@Pc(263) String local263 = Class14.method126(local259);
							arg0.aString7 = local263;
							arg0.anInt531 = local16 >> 8;
							arg0.anInt540 = local16 & 0xFF;
							arg0.anInt541 = 150;
							if (local20 == 2 || local20 == 3) {
								this.method587(local263, "@cr2@" + arg0.aString8, 1);
							} else if (local20 == 1) {
								this.method587(local263, "@cr1@" + arg0.aString8, 1);
							} else {
								this.method587(local263, arg0.aString8, 2);
							}
						} catch (@Pc(327) Exception local327) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt806 = local196 + local193;
			}
			if ((arg2 & 0x400) != 0) {
				arg0.anInt524 = arg1.method525();
				local16 = arg1.method531();
				arg0.anInt528 = local16 >> 16;
				arg0.anInt527 = anInt987 + (local16 & 0xFFFF);
				arg0.anInt525 = 0;
				arg0.anInt526 = 0;
				if (arg0.anInt527 > anInt987) {
					arg0.anInt525 = -1;
				}
				if (arg0.anInt524 == 65535) {
					arg0.anInt524 = -1;
				}
			}
			if ((arg2 & 0x1) != 0) {
				local16 = arg1.method500();
				if (local16 == 65535) {
					local16 = -1;
				}
				local20 = arg1.method517();
				if (local16 == arg0.anInt546 && local16 != -1) {
					local193 = Class16.aClass16Array1[local16].anInt341;
					if (local193 == 1) {
						arg0.anInt547 = 0;
						arg0.anInt548 = 0;
						arg0.anInt549 = local20;
						arg0.anInt550 = 0;
					}
					if (local193 == 2) {
						arg0.anInt550 = 0;
					}
				} else if (local16 == -1 || arg0.anInt546 == -1 || Class16.aClass16Array1[local16].anInt335 >= Class16.aClass16Array1[arg0.anInt546].anInt335) {
					arg0.anInt546 = local16;
					arg0.anInt547 = 0;
					arg0.anInt548 = 0;
					arg0.anInt549 = local20;
					arg0.anInt550 = 0;
					arg0.anInt567 = arg0.anInt551;
				}
			}
			if ((arg2 & 0x80) != 0) {
				arg0.aString7 = arg1.method505();
				if (arg0.aString7.charAt(0) == '~') {
					arg0.aString7 = arg0.aString7.substring(1);
					this.method587(arg0.aString7, arg0.aString8, 2);
				} else if (arg0 == aClass1_Sub1_Sub1_Sub2_Sub2_1) {
					this.method587(arg0.aString7, arg0.aString8, 2);
				}
				arg0.anInt531 = 0;
				arg0.anInt540 = 0;
				arg0.anInt541 = 150;
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("96307, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method578(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method578(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLjava/lang/String;)V")
	@Override
	protected void method579(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt1040 = arg0;
			this.aString17 = arg1;
			this.method583();
			if (this.aClass36_1 == null) {
				super.method579(arg0, arg1);
			} else {
				this.aClass50_8.method562();
				this.aClass1_Sub1_Sub2_Sub3_4.method420(54, "RuneScape is loading - please wait...", 16777215, 180);
				Class1_Sub1_Sub2.method543(34, 9179409, 28, 304, 62);
				Class1_Sub1_Sub2.method543(32, 0, 29, 302, 63);
				Class1_Sub1_Sub2.method542(30, 64, 9179409, arg0 * 3, 30);
				Class1_Sub1_Sub2.method542(arg0 * 3 + 30, 64, 0, 300 - arg0 * 3, 30);
				this.aClass1_Sub1_Sub2_Sub3_4.method420(85, arg1, 16777215, 180);
				this.aClass50_8.method563(171, super.aGraphics2, 418, 202);
				if (this.aBoolean231) {
					this.aBoolean231 = false;
					if (!this.aBoolean220) {
						this.aClass50_9.method563(0, super.aGraphics2, 418, 0);
						this.aClass50_10.method563(0, super.aGraphics2, 418, 637);
					}
					this.aClass50_6.method563(0, super.aGraphics2, 418, 128);
					this.aClass50_7.method563(371, super.aGraphics2, 418, 202);
					this.aClass50_11.method563(265, super.aGraphics2, 418, 0);
					this.aClass50_12.method563(265, super.aGraphics2, 418, 562);
					this.aClass50_13.method563(171, super.aGraphics2, 418, 128);
					this.aClass50_14.method563(171, super.aGraphics2, 418, 562);
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("95727, " + arg0 + ", " + false + ", " + arg1 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XJCNBMKS;ZI)V")
	private void method662(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt807 + 21 < arg1 * 8) {
					@Pc(20) int local20 = arg0.method509(14);
					if (local20 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local20] == null) {
							this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local20] = new Class1_Sub1_Sub1_Sub2_Sub1();
						}
						@Pc(40) Class1_Sub1_Sub1_Sub2_Sub1 local40 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local20];
						this.anIntArray244[this.anInt963++] = local20;
						local40.anInt532 = anInt987;
						@Pc(59) int local59 = arg0.method509(1);
						if (local59 == 1) {
							this.anIntArray221[this.anInt922++] = local20;
						}
						@Pc(78) int local78 = arg0.method509(5);
						if (local78 > 15) {
							local78 -= 32;
						}
						@Pc(87) int local87 = arg0.method509(5);
						if (local87 > 15) {
							local87 -= 32;
						}
						local40.aClass27_1 = Class27.method294(arg0.method509(12));
						@Pc(103) int local103 = arg0.method509(1);
						local40.anInt558 = local40.aClass27_1.aByte17;
						local40.anInt552 = local40.aClass27_1.anInt460;
						local40.anInt559 = local40.aClass27_1.anInt458;
						local40.anInt560 = local40.aClass27_1.anInt461;
						local40.anInt561 = local40.aClass27_1.anInt457;
						local40.anInt562 = local40.aClass27_1.anInt469;
						local40.anInt529 = local40.aClass27_1.anInt466;
						local40.method321(aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0] + local87, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0] + local78, local103 == 1);
						continue;
					}
				}
				arg0.method510();
				return;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("89492, " + arg0 + ", " + false + ", " + arg1 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method663() {
		try {
			try {
				if (this.aClass12_1 != null) {
					this.aClass12_1.method102();
				}
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass12_1 = null;
			this.aBoolean237 = false;
			this.anInt1064 = 0;
			this.aString20 = "";
			this.aString21 = "";
			this.method580();
			this.aClass21_1.method229(818);
			for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
				this.aClass31Array1[local34].method298();
			}
			System.gc();
			this.method653();
			this.anInt1068 = -1;
			this.anInt988 = -1;
			this.anInt1052 = 0;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("67339, " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method664(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Graphics local4 = this.method577((byte) 7).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method570(702);
			this.anInt955 += arg0;
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean211) {
				this.aBoolean220 = false;
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
			if (this.aBoolean229) {
				this.aBoolean220 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean216) {
				this.aBoolean220 = false;
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
			signlink.reporterror("28511, " + arg0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IIII)Z")
	private boolean method665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass21_1.method259(this.anInt874, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class42 local43 = Class42.method395(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt697;
					local54 = local43.anInt692;
				} else {
					local51 = local43.anInt692;
					local54 = local43.anInt697;
				}
				@Pc(65) int local65 = local43.anInt702;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method639(local51, local54, 2, local65, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], arg1, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], arg2, 0, 0);
			} else {
				this.method639(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], arg1, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], arg2, local31, local25 + 1);
			}
			this.anInt1074 = super.anInt857;
			this.anInt1075 = super.anInt858;
			this.anInt1077 = 2;
			this.anInt1076 = 0;
			return true;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("33895, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private String method666(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != -119) {
				this.aBoolean213 = !this.aBoolean213;
			}
			return arg1 < 999999999 ? String.valueOf(arg1) : "*";
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("30273, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
				if (this.aStringArray11[local9] != null) {
					@Pc(21) int local21 = this.anIntArray223[local9];
					@Pc(32) int local32 = this.anInt869 + 70 + 4 - local1 * 14;
					if (local32 < -20) {
						break;
					}
					@Pc(40) String local40 = this.aStringArray10[local9];
					if (local40 != null && local40.startsWith("@cr1@")) {
						local40 = local40.substring(5);
					}
					if (local40 != null && local40.startsWith("@cr2@")) {
						local40 = local40.substring(5);
					}
					if (local21 == 0) {
						local1++;
					}
					if ((local21 == 1 || local21 == 2) && (local21 == 1 || this.anInt1050 == 0 || this.anInt1050 == 1 && this.method627(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32 && !local40.equals(aClass1_Sub1_Sub1_Sub2_Sub2_1.aString8)) {
							if (this.anInt1015 >= 1) {
								this.aStringArray8[this.anInt863] = "Report abuse @whi@" + local40;
								this.anIntArray236[this.anInt863] = 38;
								this.anInt863++;
							}
							this.aStringArray8[this.anInt863] = "Add ignore @whi@" + local40;
							this.anIntArray236[this.anInt863] = 376;
							this.anInt863++;
							this.aStringArray8[this.anInt863] = "Add friend @whi@" + local40;
							this.anIntArray236[this.anInt863] = 554;
							this.anInt863++;
						}
						local1++;
					}
					if ((local21 == 3 || local21 == 7) && this.anInt1039 == 0 && (local21 == 7 || this.anInt982 == 0 || this.anInt982 == 1 && this.method627(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							if (this.anInt1015 >= 1) {
								this.aStringArray8[this.anInt863] = "Report abuse @whi@" + local40;
								this.anIntArray236[this.anInt863] = 38;
								this.anInt863++;
							}
							this.aStringArray8[this.anInt863] = "Add ignore @whi@" + local40;
							this.anIntArray236[this.anInt863] = 376;
							this.anInt863++;
							this.aStringArray8[this.anInt863] = "Add friend @whi@" + local40;
							this.anIntArray236[this.anInt863] = 554;
							this.anInt863++;
						}
						local1++;
					}
					if (local21 == 4 && (this.anInt892 == 0 || this.anInt892 == 1 && this.method627(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							this.aStringArray8[this.anInt863] = "Accept trade @whi@" + local40;
							this.anIntArray236[this.anInt863] = 543;
							this.anInt863++;
						}
						local1++;
					}
					if ((local21 == 5 || local21 == 6) && this.anInt1039 == 0 && this.anInt982 < 2) {
						local1++;
					}
					if (local21 == 8 && (this.anInt892 == 0 || this.anInt892 == 1 && this.method627(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							this.aStringArray8[this.anInt863] = "Accept challenge @whi@" + local40;
							this.anIntArray236[this.anInt863] = 219;
							this.anInt863++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("21235, " + arg0 + ", " + arg1 + ", " + -433 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OTTYZSZE;ZIII)V")
	private void method668(@OriginalArg(0) Class1_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass1_Sub1_Sub1_Sub2_Sub2_1 && this.anInt863 < 400) {
				@Pc(40) String local40;
				if (arg0.anInt582 == 0) {
					local40 = arg0.aString8 + method619(arg0.anInt573, 505, aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt573) + " (level-" + arg0.anInt573 + ")";
				} else {
					local40 = arg0.aString8 + " (skill-" + arg0.anInt582 + ")";
				}
				@Pc(170) int local170;
				if (this.anInt973 == 1) {
					this.aStringArray8[this.anInt863] = "Use " + this.aString23 + " with @whi@" + local40;
					this.anIntArray236[this.anInt863] = 291;
					this.anIntArray237[this.anInt863] = arg2;
					this.anIntArray234[this.anInt863] = arg1;
					this.anIntArray235[this.anInt863] = arg3;
					this.anInt863++;
				} else if (this.anInt1044 != 1) {
					for (local170 = 4; local170 >= 0; local170--) {
						if (this.aStringArray13[local170] != null) {
							this.aStringArray8[this.anInt863] = this.aStringArray13[local170] + " @whi@" + local40;
							@Pc(197) short local197 = 0;
							if (this.aStringArray13[local170].equalsIgnoreCase("attack")) {
								if (arg0.anInt573 > aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt573) {
									local197 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt574 != 0 && arg0.anInt574 != 0) {
									if (aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt574 == arg0.anInt574) {
										local197 = 2000;
									} else {
										local197 = 0;
									}
								}
							} else if (this.aBooleanArray12[local170]) {
								local197 = 2000;
							}
							if (local170 == 0) {
								this.anIntArray236[this.anInt863] = local197 + 822;
							}
							if (local170 == 1) {
								this.anIntArray236[this.anInt863] = local197 + 986;
							}
							if (local170 == 2) {
								this.anIntArray236[this.anInt863] = local197 + 431;
							}
							if (local170 == 3) {
								this.anIntArray236[this.anInt863] = local197 + 916;
							}
							if (local170 == 4) {
								this.anIntArray236[this.anInt863] = local197 + 132;
							}
							this.anIntArray237[this.anInt863] = arg2;
							this.anIntArray234[this.anInt863] = arg1;
							this.anIntArray235[this.anInt863] = arg3;
							this.anInt863++;
						}
					}
				} else if ((this.anInt1046 & 0x8) == 8) {
					this.aStringArray8[this.anInt863] = this.aString29 + " @whi@" + local40;
					this.anIntArray236[this.anInt863] = 108;
					this.anIntArray237[this.anInt863] = arg2;
					this.anIntArray234[this.anInt863] = arg1;
					this.anIntArray235[this.anInt863] = arg3;
					this.anInt863++;
				}
				for (local170 = 0; local170 < this.anInt863; local170++) {
					if (this.anIntArray236[local170] == 746) {
						this.aStringArray8[local170] = "Walk here @whi@" + local40;
						return;
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("86567, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!XJCNBMKS;IZ)V")
	private void method669(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method509(8);
			@Pc(12) int local12;
			if (local6 < this.anInt921) {
				for (local12 = local6; local12 < this.anInt921; local12++) {
					this.anIntArray266[this.anInt1025++] = this.anIntArray220[local12];
				}
			}
			if (local6 > this.anInt921) {
				signlink.reporterror(this.aString20 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt921 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray220[local12];
				@Pc(69) Class1_Sub1_Sub1_Sub2_Sub2 local69 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local64];
				@Pc(74) int local74 = arg0.method509(1);
				if (local74 == 0) {
					this.anIntArray220[this.anInt921++] = local64;
					local69.anInt532 = anInt987;
				} else {
					@Pc(97) int local97 = arg0.method509(2);
					if (local97 == 0) {
						this.anIntArray220[this.anInt921++] = local64;
						local69.anInt532 = anInt987;
						this.anIntArray221[this.anInt922++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray220[this.anInt921++] = local64;
							local69.anInt532 = anInt987;
							local148 = arg0.method509(3);
							local69.method320((byte) 9, false, local148);
							local158 = arg0.method509(1);
							if (local158 == 1) {
								this.anIntArray221[this.anInt922++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray220[this.anInt921++] = local64;
							local69.anInt532 = anInt987;
							local148 = arg0.method509(3);
							local69.method320((byte) 9, true, local148);
							local158 = arg0.method509(3);
							local69.method320((byte) 9, true, local158);
							@Pc(216) int local216 = arg0.method509(1);
							if (local216 == 1) {
								this.anIntArray221[this.anInt922++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray266[this.anInt1025++] = local64;
						}
					}
				}
			}
			this.aBoolean237 &= true;
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("56159, " + arg0 + ", " + arg1 + ", " + true + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NHTDEVDA;IZI)V")
	private void method670(@OriginalArg(0) int arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.aBoolean237 &= true;
			if (this.anInt863 < 400) {
				if (arg1.anIntArray131 != null) {
					arg1 = arg1.method290();
				}
				if (arg1 != null && arg1.aBoolean95) {
					@Pc(29) String local29 = arg1.aString5;
					if (arg1.anInt455 != 0) {
						local29 = local29 + method619(arg1.anInt455, 505, aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt573) + " (level-" + arg1.anInt455 + ")";
					}
					if (this.anInt973 == 1) {
						this.aStringArray8[this.anInt863] = "Use " + this.aString23 + " with @yel@" + local29;
						this.anIntArray236[this.anInt863] = 450;
						this.anIntArray237[this.anInt863] = arg2;
						this.anIntArray234[this.anInt863] = arg3;
						this.anIntArray235[this.anInt863] = arg0;
						this.anInt863++;
					} else if (this.anInt1044 != 1) {
						@Pc(167) int local167;
						if (arg1.aStringArray5 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray5[local167] != null && !arg1.aStringArray5[local167].equalsIgnoreCase("attack")) {
									this.aStringArray8[this.anInt863] = arg1.aStringArray5[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray236[this.anInt863] = 173;
									}
									if (local167 == 1) {
										this.anIntArray236[this.anInt863] = 11;
									}
									if (local167 == 2) {
										this.anIntArray236[this.anInt863] = 567;
									}
									if (local167 == 3) {
										this.anIntArray236[this.anInt863] = 415;
									}
									if (local167 == 4) {
										this.anIntArray236[this.anInt863] = 246;
									}
									this.anIntArray237[this.anInt863] = arg2;
									this.anIntArray234[this.anInt863] = arg3;
									this.anIntArray235[this.anInt863] = arg0;
									this.anInt863++;
								}
							}
						}
						if (arg1.aStringArray5 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray5[local167] != null && arg1.aStringArray5[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg1.anInt455 > aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt573) {
										local291 = 2000;
									}
									this.aStringArray8[this.anInt863] = arg1.aStringArray5[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray236[this.anInt863] = local291 + 173;
									}
									if (local167 == 1) {
										this.anIntArray236[this.anInt863] = local291 + 11;
									}
									if (local167 == 2) {
										this.anIntArray236[this.anInt863] = local291 + 567;
									}
									if (local167 == 3) {
										this.anIntArray236[this.anInt863] = local291 + 415;
									}
									if (local167 == 4) {
										this.anIntArray236[this.anInt863] = local291 + 246;
									}
									this.anIntArray237[this.anInt863] = arg2;
									this.anIntArray234[this.anInt863] = arg3;
									this.anIntArray235[this.anInt863] = arg0;
									this.anInt863++;
								}
							}
						}
						this.aStringArray8[this.anInt863] = "Examine @yel@" + local29;
						this.anIntArray236[this.anInt863] = 1569;
						this.anIntArray237[this.anInt863] = arg2;
						this.anIntArray234[this.anInt863] = arg3;
						this.anIntArray235[this.anInt863] = arg0;
						this.anInt863++;
					} else if ((this.anInt1046 & 0x2) == 2) {
						this.aStringArray8[this.anInt863] = this.aString29 + " @yel@" + local29;
						this.anIntArray236[this.anInt863] = 902;
						this.anIntArray237[this.anInt863] = arg2;
						this.anIntArray234[this.anInt863] = arg3;
						this.anIntArray235[this.anInt863] = arg0;
						this.anInt863++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("15474, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method672() {
		try {
			if (this.anInt973 == 0 && this.anInt1044 == 0) {
				this.aStringArray8[this.anInt863] = "Walk here";
				this.anIntArray236[this.anInt863] = 746;
				this.anIntArray234[this.anInt863] = super.anInt851;
				this.anIntArray235[this.anInt863] = super.anInt852;
				this.anInt863++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub3.anInt318; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub3.anIntArray73[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass21_1.method259(this.anInt874, local53, local59, local49) >= 0) {
						@Pc(91) Class42 local91 = Class42.method395(local71);
						if (local91.anIntArray178 != null) {
							local91 = local91.method397();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt973 == 1) {
							this.aStringArray8[this.anInt863] = "Use " + this.aString23 + " with @cya@" + local91.aString15;
							this.anIntArray236[this.anInt863] = 31;
							this.anIntArray237[this.anInt863] = local49;
							this.anIntArray234[this.anInt863] = local53;
							this.anIntArray235[this.anInt863] = local59;
							this.anInt863++;
						} else if (this.anInt1044 != 1) {
							if (local91.aStringArray7 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray7[local218] != null) {
										this.aStringArray8[this.anInt863] = local91.aStringArray7[local218] + " @cya@" + local91.aString15;
										if (local218 == 0) {
											this.anIntArray236[this.anInt863] = 948;
										}
										if (local218 == 1) {
											this.anIntArray236[this.anInt863] = 957;
										}
										if (local218 == 2) {
											this.anIntArray236[this.anInt863] = 941;
										}
										if (local218 == 3) {
											this.anIntArray236[this.anInt863] = 947;
										}
										if (local218 == 4) {
											this.anIntArray236[this.anInt863] = 1555;
										}
										this.anIntArray237[this.anInt863] = local49;
										this.anIntArray234[this.anInt863] = local53;
										this.anIntArray235[this.anInt863] = local59;
										this.anInt863++;
									}
								}
							}
							this.aStringArray8[this.anInt863] = "Examine @cya@" + local91.aString15;
							this.anIntArray236[this.anInt863] = 1595;
							this.anIntArray237[this.anInt863] = local91.anInt699 << 14;
							this.anIntArray234[this.anInt863] = local53;
							this.anIntArray235[this.anInt863] = local59;
							this.anInt863++;
						} else if ((this.anInt1046 & 0x4) == 4) {
							this.aStringArray8[this.anInt863] = this.aString29 + " @cya@" + local91.aString15;
							this.anIntArray236[this.anInt863] = 591;
							this.anIntArray237[this.anInt863] = local49;
							this.anIntArray234[this.anInt863] = local53;
							this.anIntArray235[this.anInt863] = local59;
							this.anInt863++;
						}
					}
					@Pc(398) Class1_Sub1_Sub1_Sub2_Sub1 local398;
					@Pc(446) Class1_Sub1_Sub1_Sub2_Sub2 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class1_Sub1_Sub1_Sub2_Sub1 local369 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local71];
						if (local369.aClass27_1.aByte17 == 1 && (local369.anInt564 & 0x7F) == 64 && (local369.anInt565 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt963; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local218]];
								if (local398 != null && local398 != local369 && local398.aClass27_1.aByte17 == 1 && local398.anInt564 == local369.anInt564 && local398.anInt565 == local369.anInt565) {
									this.method670(local59, local398.aClass27_1, this.anIntArray244[local218], local53);
								}
							}
							for (local436 = 0; local436 < this.anInt921; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray220[local436]];
								if (local446 != null && local446.anInt564 == local369.anInt564 && local446.anInt565 == local369.anInt565) {
									this.method668(local446, local53, this.anIntArray220[local436], local59);
								}
							}
						}
						this.method670(local59, local369.aClass27_1, local71, local53);
					}
					if (local65 == 0) {
						@Pc(488) Class1_Sub1_Sub1_Sub2_Sub2 local488 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local71];
						if ((local488.anInt564 & 0x7F) == 64 && (local488.anInt565 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt963; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray244[local218]];
								if (local398 != null && local398.aClass27_1.aByte17 == 1 && local398.anInt564 == local488.anInt564 && local398.anInt565 == local488.anInt565) {
									this.method670(local59, local398.aClass27_1, this.anIntArray244[local218], local53);
								}
							}
							for (local436 = 0; local436 < this.anInt921; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray220[local436]];
								if (local446 != null && local446 != local488 && local446.anInt564 == local488.anInt564 && local446.anInt565 == local488.anInt565) {
									this.method668(local446, local53, this.anIntArray220[local436], local59);
								}
							}
						}
						this.method668(local488, local53, local71, local59);
					}
					if (local65 == 3) {
						@Pc(607) Class13 local607 = this.aClass13ArrayArrayArray1[this.anInt874][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class1_Sub1_Sub1_Sub5 local614 = (Class1_Sub1_Sub1_Sub5) local607.method112(); local614 != null; local614 = (Class1_Sub1_Sub1_Sub5) local607.method114()) {
								@Pc(620) Class5 local620 = Class5.method23(local614.anInt439);
								if (this.anInt973 == 1) {
									this.aStringArray8[this.anInt863] = "Use " + this.aString23 + " with @lre@" + local620.aString1;
									this.anIntArray236[this.anInt863] = 358;
									this.anIntArray237[this.anInt863] = local614.anInt439;
									this.anIntArray234[this.anInt863] = local53;
									this.anIntArray235[this.anInt863] = local59;
									this.anInt863++;
								} else if (this.anInt1044 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray1 != null && local620.aStringArray1[local737] != null) {
											this.aStringArray8[this.anInt863] = local620.aStringArray1[local737] + " @lre@" + local620.aString1;
											if (local737 == 0) {
												this.anIntArray236[this.anInt863] = 410;
											}
											if (local737 == 1) {
												this.anIntArray236[this.anInt863] = 129;
											}
											if (local737 == 2) {
												this.anIntArray236[this.anInt863] = 790;
											}
											if (local737 == 3) {
												this.anIntArray236[this.anInt863] = 922;
											}
											if (local737 == 4) {
												this.anIntArray236[this.anInt863] = 579;
											}
											this.anIntArray237[this.anInt863] = local614.anInt439;
											this.anIntArray234[this.anInt863] = local53;
											this.anIntArray235[this.anInt863] = local59;
											this.anInt863++;
										} else if (local737 == 2) {
											this.aStringArray8[this.anInt863] = "Take @lre@" + local620.aString1;
											this.anIntArray236[this.anInt863] = 790;
											this.anIntArray237[this.anInt863] = local614.anInt439;
											this.anIntArray234[this.anInt863] = local53;
											this.anIntArray235[this.anInt863] = local59;
											this.anInt863++;
										}
									}
									this.aStringArray8[this.anInt863] = "Examine @lre@" + local620.aString1;
									this.anIntArray236[this.anInt863] = 1070;
									this.anIntArray237[this.anInt863] = local614.anInt439;
									this.anIntArray234[this.anInt863] = local53;
									this.anIntArray235[this.anInt863] = local59;
									this.anInt863++;
								} else if ((this.anInt1046 & 0x1) == 1) {
									this.aStringArray8[this.anInt863] = this.aString29 + " @lre@" + local620.aString1;
									this.anIntArray236[this.anInt863] = 558;
									this.anIntArray237[this.anInt863] = local614.anInt439;
									this.anIntArray234[this.anInt863] = local53;
									this.anIntArray235[this.anInt863] = local59;
									this.anInt863++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(948) RuntimeException local948) {
			signlink.reporterror("75671, " + -297 + ", " + local948.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method673(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (aBoolean222 && this.anInt913 == 2 && Class45.anInt769 != this.anInt874) {
				this.aClass50_17.method562();
				this.aClass1_Sub1_Sub2_Sub3_3.method420(151, "Loading - please wait.", 0, 257);
				this.aClass1_Sub1_Sub2_Sub3_3.method420(150, "Loading - please wait.", 16777215, 256);
				this.aClass50_17.method563(4, super.aGraphics2, 418, 4);
				this.anInt913 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt913 == 1) {
				@Pc(55) int local55 = this.method674((byte) 9);
				if (local55 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString20 + " glcfb " + this.aLong33 + "," + local55 + "," + aBoolean222 + "," + this.aClass33Array1[0] + "," + this.aClass35_Sub1_1.method380() + "," + this.anInt874 + "," + this.anInt895 + "," + this.anInt896);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt913 == 2 && this.anInt874 != this.anInt1049) {
				this.anInt1049 = this.anInt874;
				this.method656(this.anInt874);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("12135, " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)I")
	private int method674(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray246[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray4[local3] == null && this.anIntArray247[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray4[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray245[local41] >> 8) * 64 - this.anInt915;
					@Pc(74) int local74 = (this.anIntArray245[local41] & 0xFF) * 64 - this.anInt916;
					if (this.aBoolean218) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class45.method460(local62, local74, local48);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean225) {
				return -4;
			} else {
				this.anInt913 = 2;
				Class45.anInt769 = this.anInt874;
				this.method657();
				@Pc(118) boolean local118 = false;
				this.aClass1_Sub1_Sub3_7.method487(255);
				return 0;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("86146, " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method576() {
		try {
			this.aBoolean231 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("46769, " + false + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!XJCNBMKS;IZ)V")
	private void method675(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt807 + 10 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method509(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub2_Sub2();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local12].method326(this.aBoolean212, this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray220[this.anInt921++] = local12;
						@Pc(59) Class1_Sub1_Sub1_Sub2_Sub2 local59 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local12];
						local59.anInt532 = anInt987;
						@Pc(67) int local67 = arg0.method509(1);
						@Pc(72) int local72 = arg0.method509(1);
						if (local72 == 1) {
							this.anIntArray221[this.anInt922++] = local12;
						}
						@Pc(91) int local91 = arg0.method509(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						@Pc(100) int local100 = arg0.method509(5);
						if (local100 > 15) {
							local100 -= 32;
						}
						local59.method321(aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0] + local91, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0] + local100, local67 == 1);
						continue;
					}
				}
				arg0.method510();
				return;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("5252, " + arg0 + ", " + arg1 + ", " + false + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method676() {
		try {
			if (this.anInt913 == 2) {
				for (@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) this.aClass13_10.method111(); local15 != null; local15 = (Class1_Sub3) this.aClass13_10.method113()) {
					if (local15.anInt493 > 0) {
						local15.anInt493--;
					}
					if (local15.anInt493 != 0) {
						if (local15.anInt501 > 0) {
							local15.anInt501--;
						}
						if (local15.anInt501 == 0 && local15.anInt496 >= 1 && local15.anInt497 >= 1 && local15.anInt496 <= 102 && local15.anInt497 <= 102 && (local15.anInt502 < 0 || Class45.method462(local15.anInt502, local15.anInt504))) {
							this.method637(local15.anInt502, local15.anInt494, local15.anInt497, local15.anInt504, local15.anInt503, local15.anInt496, local15.anInt495);
							local15.anInt501 = -1;
							if (local15.anInt502 == local15.anInt498 && local15.anInt498 == -1) {
								local15.method565();
							} else if (local15.anInt502 == local15.anInt498 && local15.anInt503 == local15.anInt499 && local15.anInt504 == local15.anInt500) {
								local15.method565();
							}
						}
					} else if (local15.anInt498 < 0 || Class45.method462(local15.anInt498, local15.anInt500)) {
						this.method637(local15.anInt498, local15.anInt494, local15.anInt497, local15.anInt500, local15.anInt499, local15.anInt496, local15.anInt495);
						local15.method565();
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("40246, " + 797 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method677(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt867 >= 100 && this.anInt871 != 1) {
					this.method587("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else if (this.anInt867 >= 200) {
					this.method587("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else {
					@Pc(38) String local38 = Class44.method452(Class44.method449(arg0, (byte) 7));
					for (@Pc(49) int local49 = 0; local49 < this.anInt867; local49++) {
						if (this.aLongArray4[local49] == arg0) {
							this.method587(local38 + " is already on your friend list", "", 0);
							return;
						}
					}
					for (@Pc(79) int local79 = 0; local79 < this.anInt994; local79++) {
						if (this.aLongArray3[local79] == arg0) {
							this.method587("Please remove " + local38 + " from your ignore list first", "", 0);
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub2_Sub2_1.aString8)) {
						this.aStringArray9[this.anInt867] = local38;
						this.aLongArray4[this.anInt867] = arg0;
						this.anIntArray242[this.anInt867] = 0;
						this.anInt867++;
						this.aBoolean219 = true;
						this.aClass1_Sub1_Sub3_7.method487(238);
						this.aClass1_Sub1_Sub3_7.method494(155, arg0);
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("65051, " + arg0 + ", " + -210 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method678(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt959 > 0) {
				this.method663();
			} else {
				this.aClass50_17.method562();
				this.aClass1_Sub1_Sub2_Sub3_3.method420(144, "Connection lost", 0, 257);
				this.aClass1_Sub1_Sub2_Sub3_3.method420(143, "Connection lost", 16777215, 256);
				this.aClass1_Sub1_Sub2_Sub3_3.method420(159, "Please wait - attempting to reestablish", 0, 257);
				this.aClass1_Sub1_Sub2_Sub3_3.method420(158, "Please wait - attempting to reestablish", 16777215, 256);
				this.aClass50_17.method563(4, super.aGraphics2, 418, 4);
				this.anInt1026 = 0;
				this.anInt945 = 0;
				@Pc(59) Class12 local59 = this.aClass12_1;
				if (arg0 < 0) {
					this.aBoolean237 = false;
					this.anInt984 = 0;
					this.method641(this.aString20, this.aString21, true);
					if (!this.aBoolean237) {
						this.method663();
					}
					try {
						local59.method102();
					} catch (@Pc(85) Exception local85) {
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("83217, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method679() {
		try {
			@Pc(2) int local2 = this.anInt1006;
			@Pc(5) int local5 = this.anInt1007;
			@Pc(8) int local8 = this.anInt1008;
			@Pc(11) int local11 = this.anInt1009;
			this.aBoolean237 &= true;
			Class1_Sub1_Sub2.method542(local2, local5, 6116423, local8, local11);
			Class1_Sub1_Sub2.method542(local2 + 1, local5 + 1, 0, local8 - 2, 16);
			Class1_Sub1_Sub2.method543(local11 - 19, 0, local2 + 1, local8 - 2, local5 + 18);
			this.aClass1_Sub1_Sub2_Sub3_4.method424(local2 + 3, "Choose Option", 6116423, local5 + 14);
			@Pc(69) int local69 = super.anInt851;
			@Pc(72) int local72 = super.anInt852;
			if (this.anInt1005 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt1005 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt1005 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt863; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt863 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub3_4.method428(local106, local108, this.aStringArray8[local91], true, local2 + 3);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("53036, " + true + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method680(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt1039 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt971 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray11[local12] != null) {
						@Pc(24) int local24 = this.anIntArray223[local12];
						@Pc(29) String local29 = this.aStringArray10[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt982 == 0 || this.anInt982 == 1 && this.method627(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt851 > 4 && super.anInt852 - 4 > local82 - 10 && super.anInt852 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass1_Sub1_Sub2_Sub3_3.method422("From:  " + local29 + this.aStringArray11[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt851 < local121 + 4) {
									if (this.anInt1015 >= 1) {
										this.aStringArray8[this.anInt863] = "Report abuse @whi@" + local29;
										this.anIntArray236[this.anInt863] = 2038;
										this.anInt863++;
									}
									this.aStringArray8[this.anInt863] = "Add ignore @whi@" + local29;
									this.anIntArray236[this.anInt863] = 2376;
									this.anInt863++;
									this.aStringArray8[this.anInt863] = "Add friend @whi@" + local29;
									this.anIntArray236[this.anInt863] = 2554;
									this.anInt863++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt982 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				@Pc(237) boolean local237 = false;
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("88354, " + arg0 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt968 = Integer.parseInt(this.getParameter("nodeid"));
		anInt969 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method692(anInt967);
		} else {
			method643();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean221 = false;
		} else {
			aBoolean221 = true;
		}
		this.method568();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method681(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt923 != 0) {
					this.anInt923 = 0;
					this.aBoolean239 = true;
				}
				@Pc(18) int local18 = this.anIntArray234[arg0];
				@Pc(23) int local23 = this.anIntArray235[arg0];
				@Pc(28) int local28 = this.anIntArray236[arg0];
				@Pc(33) int local33 = this.anIntArray237[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(53) Class38 local53;
				@Pc(71) int local71;
				if (local28 == 565) {
					this.aClass1_Sub1_Sub3_7.method487(129);
					this.aClass1_Sub1_Sub3_7.method489(local23);
					local53 = Class38.aClass38Array1[local23];
					if (local53.anIntArrayArray15 != null && local53.anIntArrayArray15[0][0] == 5) {
						local71 = local53.anIntArrayArray15[0][1];
						if (this.anIntArray273[local71] != local53.anIntArray152[0]) {
							this.anIntArray273[local71] = local53.anIntArray152[0];
							this.method708(local71);
							this.aBoolean219 = true;
						}
					}
				}
				@Pc(103) Class1_Sub1_Sub1_Sub2_Sub1 local103;
				if (local28 == 246) {
					local103 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local33];
					if (local103 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local103.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local103.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(39);
						this.aClass1_Sub1_Sub3_7.method489(local33);
					}
				}
				if (local28 == 450) {
					local103 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local33];
					if (local103 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local103.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local103.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(185);
						this.aClass1_Sub1_Sub3_7.method489(this.anInt974);
						this.aClass1_Sub1_Sub3_7.method521(this.anInt976);
						this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
						this.aClass1_Sub1_Sub3_7.method521(this.anInt975);
					}
				}
				if (local28 == 551 && !this.aBoolean228) {
					this.aClass1_Sub1_Sub3_7.method487(58);
					this.aClass1_Sub1_Sub3_7.method489(local23);
					this.aBoolean228 = true;
				}
				if (local28 == 539) {
					local53 = Class38.aClass38Array1[local23];
					@Pc(260) boolean local260 = true;
					if (local53.anInt640 > 0) {
						local260 = this.method607(local53);
					}
					if (local260) {
						this.aClass1_Sub1_Sub3_7.method487(129);
						this.aClass1_Sub1_Sub3_7.method489(local23);
					}
				}
				@Pc(287) Class1_Sub1_Sub1_Sub2_Sub2 local287;
				if (local28 == 916) {
					local287 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local33];
					if (local287 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local287.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local287.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(163);
						this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
					}
				}
				if (local28 == 1555) {
					this.method665(local33, local18, local23);
					this.aClass1_Sub1_Sub3_7.method487(59);
					this.aClass1_Sub1_Sub3_7.method521(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local18 + this.anInt915);
					this.aClass1_Sub1_Sub3_7.method522(local23 + this.anInt916);
				}
				if (local28 == 111) {
					this.aClass1_Sub1_Sub3_7.method487(122);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local23);
					this.aClass1_Sub1_Sub3_7.method521(local18);
					this.aClass1_Sub1_Sub3_7.method522(local33);
					this.anInt1010 = 0;
					this.anInt1011 = local23;
					this.anInt1012 = local18;
					this.anInt1013 = 2;
					if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
						this.anInt1013 = 1;
					}
					if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
						this.anInt1013 = 3;
					}
				}
				@Pc(466) String local466;
				if (local28 == 1569) {
					local103 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local33];
					if (local103 != null) {
						@Pc(448) Class27 local448 = local103.aClass27_1;
						if (local448.anIntArray131 != null) {
							local448 = local448.method290();
						}
						if (local448 != null) {
							if (local448.aByteArray6 == null) {
								local466 = "It's a " + local448.aString5 + ".";
							} else {
								local466 = new String(local448.aByteArray6);
							}
							this.method587(local466, "", 0);
						}
					}
				}
				@Pc(491) Class5 local491;
				@Pc(500) String local500;
				if (local28 == 1070) {
					local491 = Class5.method23(local33);
					if (local491.aByteArray1 == null) {
						local500 = "It's a " + local491.aString1 + ".";
					} else {
						local500 = new String(local491.aByteArray1);
					}
					this.method587(local500, "", 0);
				}
				if (local28 == 415) {
					local103 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local33];
					if (local103 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local103.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local103.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(134);
						this.aClass1_Sub1_Sub3_7.method521(local33);
					}
				}
				if (local28 == 11) {
					local103 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local33];
					if (local103 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local103.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local103.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(119);
						this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
					}
				}
				@Pc(658) String local658;
				@Pc(673) long local673;
				if (local28 == 554 || local28 == 376 || local28 == 163 || local28 == 355) {
					local658 = this.aStringArray8[arg0];
					local71 = local658.indexOf("@whi@");
					if (local71 != -1) {
						local673 = Class44.method448(local658.substring(local71 + 5).trim());
						if (local28 == 554) {
							this.method677(local673);
						}
						if (local28 == 376) {
							this.method597(local673);
						}
						if (local28 == 163) {
							this.method613(local673);
						}
						if (local28 == 355) {
							this.method612(local673);
						}
					}
				}
				if (local28 == 31 && this.method665(local33, local18, local23)) {
					this.aClass1_Sub1_Sub3_7.method487(149);
					this.aClass1_Sub1_Sub3_7.method522(this.anInt976);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local23 + this.anInt916);
					this.aClass1_Sub1_Sub3_7.method522(local18 + this.anInt915);
					this.aClass1_Sub1_Sub3_7.method489(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, this.anInt975);
					this.aClass1_Sub1_Sub3_7.method489(this.anInt974);
				}
				if (local28 == 431) {
					local287 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local33];
					if (local287 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local287.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local287.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(141);
						this.aClass1_Sub1_Sub3_7.method521(local33);
					}
				}
				if (local28 == 948) {
					this.method665(local33, local18, local23);
					this.aClass1_Sub1_Sub3_7.method487(130);
					this.aClass1_Sub1_Sub3_7.method521(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_7.method489(local18 + this.anInt915);
					this.aClass1_Sub1_Sub3_7.method522(local23 + this.anInt916);
				}
				@Pc(893) int local893;
				if (local28 == 543 || local28 == 219) {
					local658 = this.aStringArray8[arg0];
					local71 = local658.indexOf("@whi@");
					if (local71 != -1) {
						local658 = local658.substring(local71 + 5).trim();
						local466 = Class44.method452(Class44.method449(Class44.method448(local658), (byte) 7));
						@Pc(891) boolean local891 = false;
						for (local893 = 0; local893 < this.anInt921; local893++) {
							@Pc(903) Class1_Sub1_Sub1_Sub2_Sub2 local903 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray220[local893]];
							if (local903 != null && local903.aString8 != null && local903.aString8.equalsIgnoreCase(local466)) {
								this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local903.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local903.anIntArray141[0], 0, 0);
								if (local28 == 543) {
									this.aClass1_Sub1_Sub3_7.method487(163);
									this.aClass1_Sub1_Sub3_7.method520(anInt991, this.anIntArray220[local893]);
								}
								if (local28 == 219) {
									this.aClass1_Sub1_Sub3_7.method487(96);
									this.aClass1_Sub1_Sub3_7.method520(anInt991, this.anIntArray220[local893]);
								}
								local891 = true;
								break;
							}
						}
						if (!local891) {
							this.method587("Unable to find " + local466, "", 0);
						}
					}
				}
				if (local28 == 941) {
					this.method665(local33, local18, local23);
					this.aClass1_Sub1_Sub3_7.method487(243);
					this.aClass1_Sub1_Sub3_7.method522(local18 + this.anInt915);
					this.aClass1_Sub1_Sub3_7.method521(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_7.method489(local23 + this.anInt916);
				}
				if (local28 == 173) {
					local103 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local33];
					if (local103 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local103.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local103.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(200);
						this.aClass1_Sub1_Sub3_7.method489(local33);
					}
				}
				if (local28 == 308) {
					anInt910 += local18;
					if (anInt910 >= 51) {
						this.aClass1_Sub1_Sub3_7.method487(18);
						this.aClass1_Sub1_Sub3_7.method488(70);
						anInt910 = 0;
					}
					this.aClass1_Sub1_Sub3_7.method487(112);
					this.aClass1_Sub1_Sub3_7.method522(local18);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
					this.aClass1_Sub1_Sub3_7.method489(local23);
					this.anInt1010 = 0;
					this.anInt1011 = local23;
					this.anInt1012 = local18;
					this.anInt1013 = 2;
					if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
						this.anInt1013 = 1;
					}
					if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
						this.anInt1013 = 3;
					}
				}
				@Pc(1190) boolean local1190;
				if (local28 == 790) {
					local1190 = this.method639(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					if (!local1190) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					}
					this.anInt1074 = super.anInt857;
					this.anInt1075 = super.anInt858;
					this.anInt1077 = 2;
					this.anInt1076 = 0;
					if ((local18 & 0x3) == 0) {
						anInt1047++;
					}
					if (anInt1047 >= 79) {
						this.aClass1_Sub1_Sub3_7.method487(92);
						this.aClass1_Sub1_Sub3_7.method488(134);
						anInt1047 = 0;
					}
					this.aClass1_Sub1_Sub3_7.method487(115);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local18 + this.anInt915);
					this.aClass1_Sub1_Sub3_7.method489(local23 + this.anInt916);
					this.aClass1_Sub1_Sub3_7.method522(local33);
				}
				if (local28 == 902) {
					local103 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local33];
					if (local103 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local103.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local103.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(109);
						this.aClass1_Sub1_Sub3_7.method489(local33);
						this.aClass1_Sub1_Sub3_7.method522(this.anInt1045);
					}
				}
				if (local28 == 162) {
					this.aClass1_Sub1_Sub3_7.method487(34);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local23);
					this.aClass1_Sub1_Sub3_7.method522(local18);
					this.aClass1_Sub1_Sub3_7.method522(this.anInt1045);
					this.aClass1_Sub1_Sub3_7.method521(local33);
					this.anInt1010 = 0;
					this.anInt1011 = local23;
					this.anInt1012 = local18;
					this.anInt1013 = 2;
					if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
						this.anInt1013 = 1;
					}
					if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
						this.anInt1013 = 3;
					}
				}
				if (local28 == 410) {
					local1190 = this.method639(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					if (!local1190) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					}
					this.anInt1074 = super.anInt857;
					this.anInt1075 = super.anInt858;
					this.anInt1077 = 2;
					this.anInt1076 = 0;
					this.aClass1_Sub1_Sub3_7.method487(53);
					this.aClass1_Sub1_Sub3_7.method489(local23 + this.anInt916);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
					this.aClass1_Sub1_Sub3_7.method522(local18 + this.anInt915);
				}
				if (local28 == 291) {
					local287 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local33];
					if (local287 != null) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local287.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local287.anIntArray141[0], 0, 0);
						this.anInt1074 = super.anInt857;
						this.anInt1075 = super.anInt858;
						this.anInt1077 = 2;
						this.anInt1076 = 0;
						this.aClass1_Sub1_Sub3_7.method487(206);
						this.aClass1_Sub1_Sub3_7.method520(anInt991, this.anInt975);
						this.aClass1_Sub1_Sub3_7.method522(this.anInt974);
						this.aClass1_Sub1_Sub3_7.method522(this.anInt976);
						this.aClass1_Sub1_Sub3_7.method489(local33);
					}
				}
				if (local28 == 579) {
					local1190 = this.method639(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					if (!local1190) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					}
					this.anInt1074 = super.anInt857;
					this.anInt1075 = super.anInt858;
					this.anInt1077 = 2;
					this.anInt1076 = 0;
					anInt883++;
					if (anInt883 >= 96) {
						this.aClass1_Sub1_Sub3_7.method487(217);
						this.aClass1_Sub1_Sub3_7.method488(77);
						anInt883 = 0;
					}
					this.aClass1_Sub1_Sub3_7.method487(55);
					this.aClass1_Sub1_Sub3_7.method522(local23 + this.anInt916);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local18 + this.anInt915);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
				}
				if (local28 == 1298) {
					local491 = Class5.method23(local33);
					@Pc(1680) Class38 local1680 = Class38.aClass38Array1[local23];
					if (local1680 != null && local1680.anIntArray156[local18] >= 100000) {
						local500 = local1680.anIntArray156[local18] + " x " + local491.aString1;
					} else if (local491.aByteArray1 == null) {
						local500 = "It's a " + local491.aString1 + ".";
					} else {
						local500 = new String(local491.aByteArray1);
					}
					this.method587(local500, "", 0);
				}
				if (local28 == 558) {
					local1190 = this.method639(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					if (!local1190) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					}
					this.anInt1074 = super.anInt857;
					this.anInt1075 = super.anInt858;
					this.anInt1077 = 2;
					this.anInt1076 = 0;
					this.aClass1_Sub1_Sub3_7.method487(3);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, this.anInt1045);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
					this.aClass1_Sub1_Sub3_7.method521(local23 + this.anInt916);
					this.aClass1_Sub1_Sub3_7.method521(local18 + this.anInt915);
				}
				if (local28 == 129) {
					local1190 = this.method639(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					if (!local1190) {
						this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
					}
					this.anInt1074 = super.anInt857;
					this.anInt1075 = super.anInt858;
					this.anInt1077 = 2;
					this.anInt1076 = 0;
					this.aClass1_Sub1_Sub3_7.method487(38);
					this.aClass1_Sub1_Sub3_7.method521(local18 + this.anInt915);
					this.aClass1_Sub1_Sub3_7.method521(local33);
					this.aClass1_Sub1_Sub3_7.method521(local23 + this.anInt916);
				}
				if (local28 == 67) {
					this.aClass1_Sub1_Sub3_7.method487(145);
					this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
					this.aClass1_Sub1_Sub3_7.method521(local18);
					this.aClass1_Sub1_Sub3_7.method522(local23);
					this.anInt1010 = 0;
					this.anInt1011 = local23;
					this.anInt1012 = local18;
					this.anInt1013 = 2;
					if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
						this.anInt1013 = 1;
					}
					if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
						this.anInt1013 = 3;
					}
				}
				if (local28 == 746) {
					if (this.aBoolean217) {
						this.aClass21_1.method267(15, local23 - 4, local18 - 4);
					} else {
						this.aClass21_1.method267(15, super.anInt858 - 4, super.anInt857 - 4);
					}
				}
				if (local28 == 6) {
					local53 = Class38.aClass38Array1[local23];
					this.anInt1044 = 1;
					this.anInt1045 = local23;
					this.anInt1046 = local53.anInt637;
					this.anInt973 = 0;
					this.aBoolean219 = true;
					local500 = local53.aString9;
					if (local500.indexOf(" ") != -1) {
						local500 = local500.substring(0, local500.indexOf(" "));
					}
					local466 = local53.aString9;
					if (local466.indexOf(" ") != -1) {
						local466 = local466.substring(local466.indexOf(" ") + 1);
					}
					this.aString29 = local500 + " " + local53.aString12 + " " + local466;
					if (this.anInt1046 == 16) {
						this.aBoolean219 = true;
						this.anInt926 = 3;
						this.aBoolean242 = true;
					}
				} else {
					if (local28 == 38) {
						local658 = this.aStringArray8[arg0];
						local71 = local658.indexOf("@whi@");
						if (local71 != -1) {
							if (this.anInt934 == -1) {
								this.method622();
								this.aString25 = local658.substring(local71 + 5).trim();
								this.aBoolean203 = false;
								for (@Pc(2118) int local2118 = 0; local2118 < Class38.aClass38Array1.length; local2118++) {
									if (Class38.aClass38Array1[local2118] != null && Class38.aClass38Array1[local2118].anInt640 == 600) {
										this.anInt901 = this.anInt934 = Class38.aClass38Array1[local2118].anInt628;
										break;
									}
								}
							} else {
								this.method587("Please close the interface you have open before using 'report abuse'", "", 0);
							}
						}
					}
					if (local28 == 957) {
						this.method665(local33, local18, local23);
						this.aClass1_Sub1_Sub3_7.method487(54);
						this.aClass1_Sub1_Sub3_7.method520(anInt991, local23 + this.anInt916);
						this.aClass1_Sub1_Sub3_7.method520(anInt991, local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_7.method521(local18 + this.anInt915);
					}
					if (local28 == 986) {
						local287 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local33];
						if (local287 != null) {
							this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local287.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local287.anIntArray141[0], 0, 0);
							this.anInt1074 = super.anInt857;
							this.anInt1075 = super.anInt858;
							this.anInt1077 = 2;
							this.anInt1076 = 0;
							anInt943++;
							if (anInt943 >= 133) {
								this.aClass1_Sub1_Sub3_7.method487(2);
								this.aClass1_Sub1_Sub3_7.method492(0);
								anInt943 = 0;
							}
							this.aClass1_Sub1_Sub3_7.method487(114);
							this.aClass1_Sub1_Sub3_7.method489(local33);
						}
					}
					if (local28 == 567) {
						local103 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local33];
						if (local103 != null) {
							this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local103.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local103.anIntArray141[0], 0, 0);
							this.anInt1074 = super.anInt857;
							this.anInt1075 = super.anInt858;
							this.anInt1077 = 2;
							this.anInt1076 = 0;
							this.aClass1_Sub1_Sub3_7.method487(31);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
						}
					}
					if (local28 == 997) {
						this.aClass1_Sub1_Sub3_7.method487(136);
						this.aClass1_Sub1_Sub3_7.method522(local18);
						this.aClass1_Sub1_Sub3_7.method521(local33);
						this.aClass1_Sub1_Sub3_7.method522(local23);
						this.anInt1010 = 0;
						this.anInt1011 = local23;
						this.anInt1012 = local18;
						this.anInt1013 = 2;
						if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
							this.anInt1013 = 1;
						}
						if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
							this.anInt1013 = 3;
						}
					}
					if (local28 == 210) {
						this.method622();
					}
					if (local28 == 132) {
						local287 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local33];
						if (local287 != null) {
							this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local287.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local287.anIntArray141[0], 0, 0);
							this.anInt1074 = super.anInt857;
							this.anInt1075 = super.anInt858;
							this.anInt1077 = 2;
							this.anInt1076 = 0;
							this.aClass1_Sub1_Sub3_7.method487(48);
							this.aClass1_Sub1_Sub3_7.method489(local33);
						}
					}
					if (local28 == 822) {
						local287 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local33];
						if (local287 != null) {
							this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local287.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local287.anIntArray141[0], 0, 0);
							this.anInt1074 = super.anInt857;
							this.anInt1075 = super.anInt858;
							this.anInt1077 = 2;
							this.anInt1076 = 0;
							this.aClass1_Sub1_Sub3_7.method487(96);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
						}
					}
					if (local28 == 756) {
						this.anInt973 = 1;
						this.anInt974 = local18;
						this.anInt975 = local23;
						this.anInt976 = local33;
						this.aString23 = Class5.method23(local33).aString1;
						this.anInt1044 = 0;
						this.aBoolean219 = true;
					} else {
						if (local28 == 358) {
							local1190 = this.method639(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
							if (!local1190) {
								this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
							}
							this.anInt1074 = super.anInt857;
							this.anInt1075 = super.anInt858;
							this.anInt1077 = 2;
							this.anInt1076 = 0;
							this.aClass1_Sub1_Sub3_7.method487(102);
							this.aClass1_Sub1_Sub3_7.method489(this.anInt974);
							this.aClass1_Sub1_Sub3_7.method521(this.anInt975);
							this.aClass1_Sub1_Sub3_7.method489(this.anInt976);
							this.aClass1_Sub1_Sub3_7.method489(local23 + this.anInt916);
							this.aClass1_Sub1_Sub3_7.method522(local33);
							this.aClass1_Sub1_Sub3_7.method522(local18 + this.anInt915);
						}
						if (local28 == 922) {
							local1190 = this.method639(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
							if (!local1190) {
								this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local18, false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local23, 0, 0);
							}
							this.anInt1074 = super.anInt857;
							this.anInt1075 = super.anInt858;
							this.anInt1077 = 2;
							this.anInt1076 = 0;
							this.aClass1_Sub1_Sub3_7.method487(221);
							this.aClass1_Sub1_Sub3_7.method521(local33);
							this.aClass1_Sub1_Sub3_7.method489(local18 + this.anInt915);
							this.aClass1_Sub1_Sub3_7.method521(local23 + this.anInt916);
						}
						if (local28 == 186) {
							this.aClass1_Sub1_Sub3_7.method487(32);
							this.aClass1_Sub1_Sub3_7.method521(local33);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local23);
							this.aClass1_Sub1_Sub3_7.method489(local18);
							this.anInt1010 = 0;
							this.anInt1011 = local23;
							this.anInt1012 = local18;
							this.anInt1013 = 2;
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
								this.anInt1013 = 1;
							}
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
								this.anInt1013 = 3;
							}
						}
						if (local28 == 883) {
							if ((local18 & 0x3) == 0) {
								anInt970++;
							}
							if (anInt970 >= 69) {
								this.aClass1_Sub1_Sub3_7.method487(167);
								this.aClass1_Sub1_Sub3_7.method489(2525);
								anInt970 = 0;
							}
							this.aClass1_Sub1_Sub3_7.method487(237);
							this.aClass1_Sub1_Sub3_7.method522(local33);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local18);
							this.aClass1_Sub1_Sub3_7.method521(local23);
							this.anInt1010 = 0;
							this.anInt1011 = local23;
							this.anInt1012 = local18;
							this.anInt1013 = 2;
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
								this.anInt1013 = 1;
							}
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
								this.anInt1013 = 3;
							}
						}
						if (local28 == 591 && this.method665(local33, local18, local23)) {
							this.aClass1_Sub1_Sub3_7.method487(127);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, this.anInt1045);
							this.aClass1_Sub1_Sub3_7.method522(local23 + this.anInt916);
							this.aClass1_Sub1_Sub3_7.method521(local18 + this.anInt915);
							this.aClass1_Sub1_Sub3_7.method522(local33 >> 14 & 0x7FFF);
						}
						if (local28 == 2) {
							this.aClass1_Sub1_Sub3_7.method487(132);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local23);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local18);
							this.anInt1010 = 0;
							this.anInt1011 = local23;
							this.anInt1012 = local18;
							this.anInt1013 = 2;
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
								this.anInt1013 = 1;
							}
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
								this.anInt1013 = 3;
							}
						}
						if (local28 == 966) {
							this.aClass1_Sub1_Sub3_7.method487(124);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local23);
							this.aClass1_Sub1_Sub3_7.method520(anInt991, local18);
							this.aClass1_Sub1_Sub3_7.method521(local33);
							this.anInt1010 = 0;
							this.anInt1011 = local23;
							this.anInt1012 = local18;
							this.anInt1013 = 2;
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
								this.anInt1013 = 1;
							}
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
								this.anInt1013 = 3;
							}
						}
						if (local28 == 442) {
							this.aClass1_Sub1_Sub3_7.method487(172);
							this.aClass1_Sub1_Sub3_7.method522(local18);
							this.aClass1_Sub1_Sub3_7.method521(local33);
							this.aClass1_Sub1_Sub3_7.method522(local23);
							this.anInt1010 = 0;
							this.anInt1011 = local23;
							this.anInt1012 = local18;
							this.anInt1013 = 2;
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
								this.anInt1013 = 1;
							}
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
								this.anInt1013 = 3;
							}
						}
						if (local28 == 643) {
							local658 = this.aStringArray8[arg0];
							local71 = local658.indexOf("@whi@");
							if (local71 != -1) {
								local673 = Class44.method448(local658.substring(local71 + 5).trim());
								local893 = -1;
								for (@Pc(3099) int local3099 = 0; local3099 < this.anInt867; local3099++) {
									if (this.aLongArray4[local3099] == local673) {
										local893 = local3099;
										break;
									}
								}
								if (local893 != -1 && this.anIntArray242[local893] > 0) {
									this.aBoolean239 = true;
									this.anInt923 = 0;
									this.aBoolean210 = true;
									this.aString24 = "";
									this.anInt990 = 3;
									this.aLong29 = this.aLongArray4[local893];
									this.aString26 = "Enter message to send to " + this.aStringArray9[local893];
								}
							}
						}
						if (local28 == 373) {
							this.aClass1_Sub1_Sub3_7.method487(214);
							this.aClass1_Sub1_Sub3_7.method521(local33);
							this.aClass1_Sub1_Sub3_7.method522(local23);
							this.aClass1_Sub1_Sub3_7.method522(local18);
							this.aClass1_Sub1_Sub3_7.method489(this.anInt976);
							this.aClass1_Sub1_Sub3_7.method521(this.anInt975);
							this.aClass1_Sub1_Sub3_7.method522(this.anInt974);
							this.anInt1010 = 0;
							this.anInt1011 = local23;
							this.anInt1012 = local18;
							this.anInt1013 = 2;
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
								this.anInt1013 = 1;
							}
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
								this.anInt1013 = 3;
							}
						}
						if (local28 == 1595) {
							@Pc(3239) int local3239 = local33 >> 14 & 0x7FFF;
							@Pc(3242) Class42 local3242 = Class42.method395(local3239);
							if (local3242.aByteArray18 == null) {
								local466 = "It's a " + local3242.aString15 + ".";
							} else {
								local466 = new String(local3242.aByteArray18);
							}
							this.method587(local466, "", 0);
						}
						if (local28 == 947) {
							this.method665(local33, local18, local23);
							this.aClass1_Sub1_Sub3_7.method487(125);
							this.aClass1_Sub1_Sub3_7.method489(local23 + this.anInt916);
							this.aClass1_Sub1_Sub3_7.method489(local18 + this.anInt915);
							this.aClass1_Sub1_Sub3_7.method489(local33 >> 14 & 0x7FFF);
						}
						if (local28 == 522) {
							this.aClass1_Sub1_Sub3_7.method487(129);
							this.aClass1_Sub1_Sub3_7.method489(local23);
							local53 = Class38.aClass38Array1[local23];
							if (local53.anIntArrayArray15 != null && local53.anIntArrayArray15[0][0] == 5) {
								local71 = local53.anIntArrayArray15[0][1];
								this.anIntArray273[local71] = 1 - this.anIntArray273[local71];
								this.method708(local71);
								this.aBoolean219 = true;
							}
						}
						if (local28 == 108) {
							local287 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local33];
							if (local287 != null) {
								this.method639(1, 1, 2, 0, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0], local287.anIntArray140[0], false, aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0], local287.anIntArray141[0], 0, 0);
								this.anInt1074 = super.anInt857;
								this.anInt1075 = super.anInt858;
								this.anInt1077 = 2;
								this.anInt1076 = 0;
								this.aClass1_Sub1_Sub3_7.method487(84);
								this.aClass1_Sub1_Sub3_7.method520(anInt991, local33);
								this.aClass1_Sub1_Sub3_7.method522(this.anInt1045);
							}
						}
						if (local28 == 99) {
							if ((local33 & 0x3) == 0) {
								anInt877++;
							}
							if (anInt877 >= 117) {
								this.aClass1_Sub1_Sub3_7.method487(108);
								this.aClass1_Sub1_Sub3_7.method488(206);
								anInt877 = 0;
							}
							this.aClass1_Sub1_Sub3_7.method487(197);
							this.aClass1_Sub1_Sub3_7.method522(local18);
							this.aClass1_Sub1_Sub3_7.method522(local23);
							this.aClass1_Sub1_Sub3_7.method522(local33);
							this.anInt1010 = 0;
							this.anInt1011 = local23;
							this.anInt1012 = local18;
							this.anInt1013 = 2;
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt934) {
								this.anInt1013 = 1;
							}
							if (Class38.aClass38Array1[local23].anInt628 == this.anInt925) {
								this.anInt1013 = 3;
							}
						}
						this.anInt973 = 0;
						this.anInt955 += 0;
						this.anInt1044 = 0;
						this.aBoolean219 = true;
					}
				}
			}
		} catch (@Pc(3519) RuntimeException local3519) {
			signlink.reporterror("11758, " + arg0 + ", " + 0 + ", " + local3519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method682() {
		try {
			this.anInt1018++;
			this.method688(true);
			this.method599(true, 260);
			this.method688(false);
			this.method599(false, 260);
			this.method655();
			this.method585();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean193) {
				local35 = this.anInt903;
				if (this.anInt1000 / 256 > local35) {
					local35 = this.anInt1000 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray243[4] + 128 > local35) {
					local35 = this.anIntArray243[4] + 128;
				}
				local74 = this.anInt904 + this.anInt1055 & 0x7FF;
				this.method687(local74, this.anInt927, local35 * 3 + 600, this.anInt902, this.method648(aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565, this.anInt874, aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564) - 50, local35, this.anInt928);
			}
			if (this.aBoolean193) {
				local35 = this.method647();
			} else {
				local35 = this.method646();
			}
			local74 = this.anInt1034;
			@Pc(119) int local119 = this.anInt1035;
			@Pc(122) int local122 = this.anInt1036;
			@Pc(125) int local125 = this.anInt1037;
			@Pc(128) int local128 = this.anInt1038;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray11[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray267[local130] * 2 + 1) - (double) this.anIntArray267[local130] + Math.sin((double) this.anIntArray238[local130] * ((double) this.anIntArray233[local130] / 100.0D)) * (double) this.anIntArray243[local130]);
					if (local130 == 0) {
						this.anInt1034 += local177;
					}
					if (local130 == 1) {
						this.anInt1035 += local177;
					}
					if (local130 == 2) {
						this.anInt1036 += local177;
					}
					if (local130 == 3) {
						this.anInt1038 = this.anInt1038 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt1037 += local177;
						if (this.anInt1037 < 128) {
							this.anInt1037 = 128;
						}
						if (this.anInt1037 > 383) {
							this.anInt1037 = 383;
						}
					}
				}
			}
			local177 = Class1_Sub1_Sub2_Sub2.anInt163;
			Class1_Sub1_Sub1_Sub3.aBoolean71 = true;
			Class1_Sub1_Sub1_Sub3.anInt318 = 0;
			Class1_Sub1_Sub1_Sub3.anInt316 = super.anInt851 - 4;
			Class1_Sub1_Sub1_Sub3.anInt317 = super.anInt852 - 4;
			Class1_Sub1_Sub2.method540(this.anInt897);
			this.aClass21_1.method268(this.aBoolean233, local35, this.anInt1035, this.anInt1034, this.anInt1038, this.anInt1036, this.anInt1037);
			this.aClass21_1.method243();
			this.method582(121);
			this.method615();
			this.method713(local177);
			this.method636();
			this.aClass50_17.method563(4, super.aGraphics2, 418, 4);
			this.anInt1034 = local74;
			this.anInt1035 = local119;
			this.anInt1036 = local122;
			this.anInt1037 = local125;
			this.anInt1038 = local128;
		} catch (@Pc(323) RuntimeException local323) {
			signlink.reporterror("69417, " + -102 + ", " + local323.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!YGMSKJOQ;I)V")
	private void method683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub4 arg2) {
		try {
			@Pc(7) int local7 = this.anInt904 + this.anInt875 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub3.anIntArray74[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub3.anIntArray75[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt953 + 256);
				@Pc(49) int local49 = local27 * 256 / (this.anInt953 + 256);
				@Pc(59) int local59 = arg0 * local36 + arg1 * local49 >> 16;
				@Pc(69) int local69 = arg0 * local49 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method560(this.aClass1_Sub1_Sub2_Sub1_17, 83 - local69 - arg2.anInt833 / 2 - 4, local59 + 94 - arg2.anInt832 / 2 + 4);
				} else {
					arg2.method554(83 - local69 - arg2.anInt833 / 2 - 4, local59 + 94 - arg2.anInt832 / 2 + 4);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("6805, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -302 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method684() {
		try {
			@Pc(16) int local16;
			for (@Pc(8) int local8 = -1; local8 < this.anInt921; local8++) {
				if (local8 == -1) {
					local16 = this.anInt920;
				} else {
					local16 = this.anIntArray220[local8];
				}
				@Pc(28) Class1_Sub1_Sub1_Sub2_Sub2 local28 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local16];
				if (local28 != null && local28.anInt541 > 0) {
					local28.anInt541--;
					if (local28.anInt541 == 0) {
						local28.aString7 = null;
					}
				}
			}
			for (local16 = 0; local16 < this.anInt963; local16++) {
				@Pc(59) int local59 = this.anIntArray244[local16];
				@Pc(64) Class1_Sub1_Sub1_Sub2_Sub1 local64 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local59];
				if (local64 != null && local64.anInt541 > 0) {
					local64.anInt541--;
					if (local64.anInt541 == 0) {
						local64.aString7 = null;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("65325, " + false + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method685() {
		try {
			if (this.anInt950 == 0) {
				this.aStringArray8[0] = "Cancel";
				this.anIntArray236[0] = 1640;
				this.anInt863 = 1;
				this.method680((byte) 8);
				this.anInt873 = 0;
				if (super.anInt851 > 4 && super.anInt852 > 4 && super.anInt851 < 516 && super.anInt852 < 338) {
					if (this.anInt934 == -1) {
						this.method672();
					} else {
						this.method604(Class38.aClass38Array1[this.anInt934], this.aBoolean224, super.anInt851, 0, super.anInt852, 4, 4);
					}
				}
				if (this.anInt873 != this.anInt893) {
					this.anInt893 = this.anInt873;
				}
				this.anInt873 = 0;
				this.aBoolean237 &= true;
				if (super.anInt851 > 553 && super.anInt852 > 205 && super.anInt851 < 743 && super.anInt852 < 466) {
					if (this.anInt878 != -1) {
						this.method604(Class38.aClass38Array1[this.anInt878], this.aBoolean224, super.anInt851, 0, super.anInt852, 553, 205);
					} else if (this.anIntArray213[this.anInt926] != -1) {
						this.method604(Class38.aClass38Array1[this.anIntArray213[this.anInt926]], this.aBoolean224, super.anInt851, 0, super.anInt852, 553, 205);
					}
				}
				if (this.anInt873 != this.anInt898) {
					this.aBoolean219 = true;
					this.anInt898 = this.anInt873;
				}
				this.anInt873 = 0;
				if (super.anInt851 > 17 && super.anInt852 > 357 && super.anInt851 < 496 && super.anInt852 < 453) {
					if (this.anInt925 != -1) {
						this.method604(Class38.aClass38Array1[this.anInt925], this.aBoolean224, super.anInt851, 0, super.anInt852, 17, 357);
					} else if (super.anInt852 < 434 && super.anInt851 < 426) {
						this.method667(super.anInt851 - 17, super.anInt852 - 357);
					}
				}
				if (this.anInt925 != -1 && this.anInt873 != this.anInt941) {
					this.aBoolean239 = true;
					this.anInt941 = this.anInt873;
				}
				@Pc(233) boolean local233 = false;
				while (!local233) {
					local233 = true;
					for (@Pc(239) int local239 = 0; local239 < this.anInt863 - 1; local239++) {
						if (this.anIntArray236[local239] < 1000 && this.anIntArray236[local239 + 1] > 1000) {
							@Pc(260) String local260 = this.aStringArray8[local239];
							this.aStringArray8[local239] = this.aStringArray8[local239 + 1];
							this.aStringArray8[local239 + 1] = local260;
							@Pc(282) int local282 = this.anIntArray236[local239];
							this.anIntArray236[local239] = this.anIntArray236[local239 + 1];
							this.anIntArray236[local239 + 1] = local282;
							@Pc(304) int local304 = this.anIntArray234[local239];
							this.anIntArray234[local239] = this.anIntArray234[local239 + 1];
							this.anIntArray234[local239 + 1] = local304;
							@Pc(326) int local326 = this.anIntArray235[local239];
							this.anIntArray235[local239] = this.anIntArray235[local239 + 1];
							this.anIntArray235[local239 + 1] = local326;
							@Pc(348) int local348 = this.anIntArray237[local239];
							this.anIntArray237[local239] = this.anIntArray237[local239 + 1];
							this.anIntArray237[local239 + 1] = local348;
							local233 = false;
						}
					}
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("91469, " + true + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method686(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) Class38 local3 = Class38.aClass38Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray158.length && local3.anIntArray158[local5] != -1; local5++) {
				@Pc(20) Class38 local20 = Class38.aClass38Array1[local3.anIntArray158[local5]];
				if (local20.anInt646 == 1) {
					this.method686(local20.anInt641);
				}
				local20.anInt645 = 0;
				local20.anInt631 = 0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("3700, " + true + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg0 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg2;
			while (arg3 >= 0) {
				this.aClass13ArrayArrayArray1 = null;
			}
			@Pc(30) int local30;
			@Pc(34) int local34;
			@Pc(44) int local44;
			if (local5 != 0) {
				local30 = Class1_Sub1_Sub1_Sub3.anIntArray74[local5];
				local34 = Class1_Sub1_Sub1_Sub3.anIntArray75[local5];
				local44 = local34 * 0 - arg2 * local30 >> 16;
				local17 = local30 * 0 + arg2 * local34 >> 16;
				local15 = local44;
			}
			if (local11 != 0) {
				local30 = Class1_Sub1_Sub1_Sub3.anIntArray74[local11];
				local34 = Class1_Sub1_Sub1_Sub3.anIntArray75[local11];
				local44 = local17 * local30 + local34 * 0 >> 16;
				local17 = local17 * local34 - local30 * 0 >> 16;
				local13 = local44;
			}
			this.anInt1034 = arg1 - local13;
			this.anInt1035 = arg4 - local15;
			this.anInt1036 = arg6 - local17;
			this.anInt1037 = arg5;
			this.anInt1038 = arg0;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("17692, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method688(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt564 >> 7 == this.anInt945 && aClass1_Sub1_Sub1_Sub2_Sub2_1.anInt565 >> 7 == this.anInt946) {
				this.anInt945 = 0;
			}
			@Pc(21) int local21 = this.anInt921;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class1_Sub1_Sub1_Sub2_Sub2 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass1_Sub1_Sub1_Sub2_Sub2_1;
					local38 = this.anInt920 << 14;
				} else {
					local33 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray220[local27]];
					local38 = this.anIntArray220[local27] << 14;
				}
				if (local33 != null && local33.method322()) {
					local33.aBoolean110 = false;
					if ((aBoolean222 && this.anInt921 > 50 || this.anInt921 > 200) && !arg0 && local33.anInt542 == local33.anInt529) {
						local33.aBoolean110 = true;
					}
					@Pc(89) int local89 = local33.anInt564 >> 7;
					@Pc(94) int local94 = local33.anInt565 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass1_Sub1_Sub1_Sub3_2 == null || anInt987 < local33.anInt568 || anInt987 >= local33.anInt569) {
							if ((local33.anInt564 & 0x7F) == 64 && (local33.anInt565 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local89][local94] == this.anInt1018) {
									continue;
								}
								this.anIntArrayArray23[local89][local94] = this.anInt1018;
							}
							local33.anInt583 = this.method648(local33.anInt565, this.anInt874, local33.anInt564);
							this.aClass21_1.method240(local33.anInt566, this.anInt874, local33.anInt564, local33.anInt565, 60, local33.anInt583, local38, local33, local33.aBoolean109);
						} else {
							local33.aBoolean110 = false;
							local33.anInt583 = this.method648(local33.anInt565, this.anInt874, local33.anInt564);
							this.aClass21_1.method241(local33.anInt583, local33.anInt580, local33.anInt581, local33.anInt564, local38, local33, local33.anInt566, local33.anInt565, this.anInt874, local33.anInt578, local33.anInt579);
						}
					}
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("22005, " + 6 + ", " + arg0 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(Z)V")
	private void method689() {
		try {
			this.aClass50_15.method562();
			Class1_Sub1_Sub2_Sub2.anIntArray18 = this.anIntArray217;
			this.aBoolean237 &= true;
			this.aClass1_Sub1_Sub2_Sub1_16.method62(0, 0);
			if (this.anInt878 != -1) {
				this.method711(Class38.aClass38Array1[this.anInt878], 0, 0, 0, (byte) 7);
			} else if (this.anIntArray213[this.anInt926] != -1) {
				this.method711(Class38.aClass38Array1[this.anIntArray213[this.anInt926]], 0, 0, 0, (byte) 7);
			}
			if (this.aBoolean217 && this.anInt1005 == 1) {
				this.method679();
			}
			this.aClass50_15.method563(205, super.aGraphics2, 418, 553);
			this.aClass50_17.method562();
			Class1_Sub1_Sub2_Sub2.anIntArray18 = this.anIntArray218;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("34475, " + true + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method690(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean235) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method642(43595);
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

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Z")
	private boolean method691(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("59779, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZI)V")
	private void method693(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1084 = arg1;
			this.aBoolean237 &= true;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("56030, " + arg0 + ", " + true + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method694() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt963; local1++) {
				@Pc(8) int local8 = this.anIntArray244[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub2_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[local8];
				if (local13 != null) {
					this.method695(local13, local13.aClass27_1.aByte17, this.aByte52);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("13934, " + 2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!YHEHTOVP;IB)V")
	private void method695(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg0.anInt564 < 128 || arg0.anInt565 < 128 || arg0.anInt564 >= 13184 || arg0.anInt565 >= 13184) {
				arg0.anInt546 = -1;
				arg0.anInt524 = -1;
				arg0.anInt537 = 0;
				arg0.anInt538 = 0;
				arg0.anInt564 = arg0.anIntArray140[0] * 128 + arg0.anInt558 * 64;
				arg0.anInt565 = arg0.anIntArray141[0] * 128 + arg0.anInt558 * 64;
				arg0.method324();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub2_Sub2_1 && (arg0.anInt564 < 1536 || arg0.anInt565 < 1536 || arg0.anInt564 >= 11776 || arg0.anInt565 >= 11776)) {
				arg0.anInt546 = -1;
				arg0.anInt524 = -1;
				arg0.anInt537 = 0;
				arg0.anInt538 = 0;
				arg0.anInt564 = arg0.anIntArray140[0] * 128 + arg0.anInt558 * 64;
				arg0.anInt565 = arg0.anIntArray141[0] * 128 + arg0.anInt558 * 64;
				arg0.method324();
			}
			if (arg0.anInt537 > anInt987) {
				this.method696(arg0);
			} else if (arg0.anInt538 >= anInt987) {
				this.method697(arg0);
			} else {
				this.method698(arg0);
			}
			this.method699(arg0);
			this.method700(arg0);
			if (arg2 != 32) {
				this.aClass13ArrayArrayArray1 = null;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("58869, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!YHEHTOVP;B)V")
	private void method696(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt537 - anInt987;
			@Pc(14) int local14 = arg0.anInt533 * 128 + arg0.anInt558 * 64;
			@Pc(24) int local24 = arg0.anInt535 * 128 + arg0.anInt558 * 64;
			arg0.anInt564 += (local14 - arg0.anInt564) / local4;
			if (this.aByte45 != -107) {
				this.aBoolean234 = !this.aBoolean234;
			}
			arg0.anInt565 += (local24 - arg0.anInt565) / local4;
			arg0.anInt553 = 0;
			if (arg0.anInt539 == 0) {
				arg0.anInt545 = 1024;
			}
			if (arg0.anInt539 == 1) {
				arg0.anInt545 = 1536;
			}
			if (arg0.anInt539 == 2) {
				arg0.anInt545 = 0;
			}
			if (arg0.anInt539 == 3) {
				arg0.anInt545 = 512;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("62126, " + arg0 + ", " + -107 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!YHEHTOVP;I)V")
	private void method697(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			if (arg0.anInt538 == anInt987 || arg0.anInt546 == -1 || arg0.anInt549 != 0 || arg0.anInt548 + 1 > Class16.aClass16Array1[arg0.anInt546].method208(arg0.anInt547)) {
				@Pc(29) int local29 = arg0.anInt538 - arg0.anInt537;
				@Pc(34) int local34 = anInt987 - arg0.anInt537;
				@Pc(44) int local44 = arg0.anInt533 * 128 + arg0.anInt558 * 64;
				@Pc(54) int local54 = arg0.anInt535 * 128 + arg0.anInt558 * 64;
				@Pc(64) int local64 = arg0.anInt534 * 128 + arg0.anInt558 * 64;
				@Pc(74) int local74 = arg0.anInt536 * 128 + arg0.anInt558 * 64;
				arg0.anInt564 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt565 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt553 = 0;
			if (arg0.anInt539 == 0) {
				arg0.anInt545 = 1024;
			}
			if (arg0.anInt539 == 1) {
				arg0.anInt545 = 1536;
			}
			if (arg0.anInt539 == 2) {
				arg0.anInt545 = 0;
			}
			if (arg0.anInt539 == 3) {
				arg0.anInt545 = 512;
			}
			arg0.anInt566 = arg0.anInt545;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("92645, " + arg0 + ", " + 357 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!YHEHTOVP;)V")
	private void method698(@OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.anInt542 = arg0.anInt529;
			if (arg0.anInt551 == 0) {
				arg0.anInt553 = 0;
			} else {
				if (arg0.anInt546 != -1 && arg0.anInt549 == 0) {
					@Pc(24) Class16 local24 = Class16.aClass16Array1[arg0.anInt546];
					if (arg0.anInt567 > 0 && local24.anInt339 == 0) {
						arg0.anInt553++;
						return;
					}
					if (arg0.anInt567 <= 0 && local24.anInt340 == 0) {
						arg0.anInt553++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt564;
				@Pc(56) int local56 = arg0.anInt565;
				@Pc(71) int local71 = arg0.anIntArray140[arg0.anInt551 - 1] * 128 + arg0.anInt558 * 64;
				@Pc(86) int local86 = arg0.anIntArray141[arg0.anInt551 - 1] * 128 + arg0.anInt558 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt545 = 1280;
						} else if (local56 > local86) {
							arg0.anInt545 = 1792;
						} else {
							arg0.anInt545 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt545 = 768;
						} else if (local56 > local86) {
							arg0.anInt545 = 256;
						} else {
							arg0.anInt545 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt545 = 1024;
					} else {
						arg0.anInt545 = 0;
					}
					@Pc(187) int local187 = arg0.anInt545 - arg0.anInt566 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt560;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt559;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt562;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt561;
					}
					if (local194 == -1) {
						local194 = arg0.anInt559;
					}
					arg0.anInt542 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt566 != arg0.anInt545 && arg0.anInt555 == -1 && arg0.anInt552 != 0) {
						local236 = 2;
					}
					if (arg0.anInt551 > 2) {
						local236 = 6;
					}
					if (arg0.anInt551 > 3) {
						local236 = 8;
					}
					if (arg0.anInt553 > 0 && arg0.anInt551 > 1) {
						local236 = 8;
						arg0.anInt553--;
					}
					if (arg0.aBooleanArray7[arg0.anInt551 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt542 == arg0.anInt559 && arg0.anInt523 != -1) {
						arg0.anInt542 = arg0.anInt523;
					}
					if (local53 < local71) {
						arg0.anInt564 += local236;
						if (arg0.anInt564 > local71) {
							arg0.anInt564 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt564 -= local236;
						if (arg0.anInt564 < local71) {
							arg0.anInt564 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt565 += local236;
						if (arg0.anInt565 > local86) {
							arg0.anInt565 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt565 -= local236;
						if (arg0.anInt565 < local86) {
							arg0.anInt565 = local86;
						}
					}
					if (arg0.anInt564 == local71 && arg0.anInt565 == local86) {
						arg0.anInt551--;
						if (arg0.anInt567 > 0) {
							arg0.anInt567--;
							return;
						}
					}
				} else {
					arg0.anInt564 = local71;
					arg0.anInt565 = local86;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("15292, " + 0 + ", " + arg0 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!YHEHTOVP;I)V")
	private void method699(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			if (arg0.anInt552 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt555 != -1 && arg0.anInt555 < 32768) {
					@Pc(25) Class1_Sub1_Sub1_Sub2_Sub1 local25 = this.aClass1_Sub1_Sub1_Sub2_Sub1Array1[arg0.anInt555];
					if (local25 != null) {
						local33 = arg0.anInt564 - local25.anInt564;
						local39 = arg0.anInt565 - local25.anInt565;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt545 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt555 >= 32768) {
					local64 = arg0.anInt555 - 32768;
					if (local64 == this.anInt979) {
						local64 = this.anInt920;
					}
					@Pc(76) Class1_Sub1_Sub1_Sub2_Sub2 local76 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt564 - local76.anInt564;
						@Pc(90) int local90 = arg0.anInt565 - local76.anInt565;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt545 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt556 != 0 || arg0.anInt557 != 0) && (arg0.anInt551 == 0 || arg0.anInt553 > 0)) {
					local64 = arg0.anInt564 - (arg0.anInt556 - this.anInt915 - this.anInt915) * 64;
					local33 = arg0.anInt565 - (arg0.anInt557 - this.anInt916 - this.anInt916) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt545 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt556 = 0;
					arg0.anInt557 = 0;
				}
				local64 = arg0.anInt545 - arg0.anInt566 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt552 || local64 > 2048 - arg0.anInt552) {
						arg0.anInt566 = arg0.anInt545;
					} else if (local64 > 1024) {
						arg0.anInt566 -= arg0.anInt552;
					} else {
						arg0.anInt566 += arg0.anInt552;
					}
					arg0.anInt566 &= 0x7FF;
					if (arg0.anInt542 == arg0.anInt529 && arg0.anInt566 != arg0.anInt545) {
						if (arg0.anInt530 != -1) {
							arg0.anInt542 = arg0.anInt530;
							return;
						}
						arg0.anInt542 = arg0.anInt559;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("2214, " + arg0 + ", " + -43162 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!YHEHTOVP;)V")
	private void method700(@OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.aBoolean109 = false;
			@Pc(22) Class16 local22;
			if (arg0.anInt542 != -1) {
				local22 = Class16.aClass16Array1[arg0.anInt542];
				arg0.anInt544++;
				if (arg0.anInt543 < local22.anInt333 && arg0.anInt544 > local22.method208(arg0.anInt543)) {
					arg0.anInt544 = 0;
					arg0.anInt543++;
				}
				if (arg0.anInt543 >= local22.anInt333) {
					arg0.anInt544 = 0;
					arg0.anInt543 = 0;
				}
			}
			if (arg0.anInt524 != -1 && anInt987 >= arg0.anInt527) {
				if (arg0.anInt525 < 0) {
					arg0.anInt525 = 0;
				}
				local22 = Class48.aClass48Array1[arg0.anInt524].aClass16_2;
				arg0.anInt526++;
				while (arg0.anInt525 < local22.anInt333 && arg0.anInt526 > local22.method208(arg0.anInt525)) {
					arg0.anInt526 -= local22.method208(arg0.anInt525);
					arg0.anInt525++;
				}
				if (arg0.anInt525 >= local22.anInt333 && (arg0.anInt525 < 0 || arg0.anInt525 >= local22.anInt333)) {
					arg0.anInt524 = -1;
				}
			}
			if (arg0.anInt546 != -1 && arg0.anInt549 <= 1) {
				local22 = Class16.aClass16Array1[arg0.anInt546];
				if (local22.anInt339 == 1 && arg0.anInt567 > 0 && arg0.anInt537 <= anInt987 && arg0.anInt538 < anInt987) {
					arg0.anInt549 = 1;
					return;
				}
			}
			if (arg0.anInt546 != -1 && arg0.anInt549 == 0) {
				local22 = Class16.aClass16Array1[arg0.anInt546];
				arg0.anInt548++;
				while (arg0.anInt547 < local22.anInt333 && arg0.anInt548 > local22.method208(arg0.anInt547)) {
					arg0.anInt548 -= local22.method208(arg0.anInt547);
					arg0.anInt547++;
				}
				if (arg0.anInt547 >= local22.anInt333) {
					arg0.anInt547 -= local22.anInt334;
					arg0.anInt550++;
					if (arg0.anInt550 >= local22.anInt338) {
						arg0.anInt546 = -1;
					}
					if (arg0.anInt547 < 0 || arg0.anInt547 >= local22.anInt333) {
						arg0.anInt546 = -1;
					}
				}
				arg0.aBoolean109 = local22.aBoolean72;
			}
			if (arg0.anInt549 > 0) {
				arg0.anInt549--;
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("83641, " + -700 + ", " + arg0 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method701() {
		try {
			if (this.aBoolean231) {
				this.aBoolean231 = false;
				this.aClass50_19.method563(4, super.aGraphics2, 418, 0);
				this.aClass50_20.method563(357, super.aGraphics2, 418, 0);
				this.aClass50_21.method563(4, super.aGraphics2, 418, 722);
				this.aClass50_22.method563(205, super.aGraphics2, 418, 743);
				this.aClass50_23.method563(0, super.aGraphics2, 418, 0);
				this.aClass50_24.method563(4, super.aGraphics2, 418, 516);
				this.aClass50_25.method563(205, super.aGraphics2, 418, 516);
				this.aClass50_26.method563(357, super.aGraphics2, 418, 496);
				this.aClass50_27.method563(338, super.aGraphics2, 418, 0);
				this.aBoolean219 = true;
				this.aBoolean239 = true;
				this.aBoolean242 = true;
				this.aBoolean197 = true;
				if (this.anInt913 != 2) {
					this.aClass50_17.method563(4, super.aGraphics2, 418, 4);
					this.aClass50_16.method563(4, super.aGraphics2, 418, 550);
				}
			}
			if (this.anInt913 == 2) {
				this.method682();
			}
			if (this.aBoolean217 && this.anInt1005 == 1) {
				this.aBoolean219 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt878 != -1) {
				local138 = this.method616(this.anInt878, this.anInt939);
				if (local138) {
					this.aBoolean219 = true;
				}
			}
			if (this.anInt1013 == 2) {
				this.aBoolean219 = true;
			}
			if (this.anInt950 == 2) {
				this.aBoolean219 = true;
			}
			if (this.aBoolean219) {
				this.method689();
				this.aBoolean219 = false;
			}
			if (this.anInt925 == -1) {
				this.aClass38_1.anInt622 = this.anInt1063 - this.anInt869 - 77;
				if (super.anInt851 > 448 && super.anInt851 < 560 && super.anInt852 > 332) {
					this.method589(this.aClass38_1, 463, 0, false, super.anInt852 - 357, 77, this.anInt1063, super.anInt851 - 17);
				}
				@Pc(220) int local220 = this.anInt1063 - this.aClass38_1.anInt622 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt1063 - 77) {
					local220 = this.anInt1063 - 77;
				}
				if (this.anInt869 != local220) {
					this.anInt869 = local220;
					this.aBoolean239 = true;
				}
				anInt909++;
				if (anInt909 > 1297) {
					anInt909 = 0;
					this.aClass1_Sub1_Sub3_7.method487(116);
					this.aClass1_Sub1_Sub3_7.method488(0);
					@Pc(267) int local267 = this.aClass1_Sub1_Sub3_7.anInt806;
					this.aClass1_Sub1_Sub3_7.method488(174);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_7.method488(213);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_7.method489(35720);
					}
					this.aClass1_Sub1_Sub3_7.method489((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_7.method489((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_7.method488((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_7.method489(47094);
					this.aClass1_Sub1_Sub3_7.method488(200);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_7.method488(242);
					}
					this.aClass1_Sub1_Sub3_7.method489(13108);
					this.aClass1_Sub1_Sub3_7.method497(this.aClass1_Sub1_Sub3_7.anInt806 - local267);
				}
			}
			if (this.anInt925 != -1) {
				local138 = this.method616(this.anInt925, this.anInt939);
				if (local138) {
					this.aBoolean239 = true;
				}
			}
			if (this.anInt1013 == 3) {
				this.aBoolean239 = true;
			}
			if (this.anInt950 == 3) {
				this.aBoolean239 = true;
			}
			if (this.aString30 != null) {
				this.aBoolean239 = true;
			}
			if (this.aBoolean217 && this.anInt1005 == 2) {
				this.aBoolean239 = true;
			}
			if (this.aBoolean239) {
				this.method606();
				this.aBoolean239 = false;
			}
			if (this.anInt913 == 2) {
				this.method601();
				this.aClass50_16.method563(4, super.aGraphics2, 418, 550);
			}
			if (this.anInt866 != -1) {
				this.aBoolean242 = true;
			}
			if (this.aBoolean242) {
				if (this.anInt866 != -1 && this.anInt866 == this.anInt926) {
					this.anInt866 = -1;
					this.aClass1_Sub1_Sub3_7.method487(199);
					this.aClass1_Sub1_Sub3_7.method488(this.anInt926);
				}
				this.aBoolean242 = false;
				this.aClass50_5.method562();
				this.aClass1_Sub1_Sub2_Sub1_10.method62(0, 0);
				if (this.anInt878 == -1) {
					if (this.anIntArray213[this.anInt926] != -1) {
						if (this.anInt926 == 0) {
							this.aClass1_Sub1_Sub2_Sub1_1.method62(10, 22);
						}
						if (this.anInt926 == 1) {
							this.aClass1_Sub1_Sub2_Sub1_2.method62(8, 54);
						}
						if (this.anInt926 == 2) {
							this.aClass1_Sub1_Sub2_Sub1_2.method62(8, 82);
						}
						if (this.anInt926 == 3) {
							this.aClass1_Sub1_Sub2_Sub1_3.method62(8, 110);
						}
						if (this.anInt926 == 4) {
							this.aClass1_Sub1_Sub2_Sub1_5.method62(8, 153);
						}
						if (this.anInt926 == 5) {
							this.aClass1_Sub1_Sub2_Sub1_5.method62(8, 181);
						}
						if (this.anInt926 == 6) {
							this.aClass1_Sub1_Sub2_Sub1_4.method62(9, 209);
						}
					}
					if (this.anIntArray213[0] != -1 && (this.anInt866 != 0 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[0].method62(13, 29);
					}
					if (this.anIntArray213[1] != -1 && (this.anInt866 != 1 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[1].method62(11, 53);
					}
					if (this.anIntArray213[2] != -1 && (this.anInt866 != 2 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[2].method62(11, 82);
					}
					if (this.anIntArray213[3] != -1 && (this.anInt866 != 3 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[3].method62(12, 115);
					}
					if (this.anIntArray213[4] != -1 && (this.anInt866 != 4 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[4].method62(13, 153);
					}
					if (this.anIntArray213[5] != -1 && (this.anInt866 != 5 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[5].method62(11, 180);
					}
					if (this.anIntArray213[6] != -1 && (this.anInt866 != 6 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[6].method62(13, 208);
					}
				}
				this.aClass50_5.method563(160, super.aGraphics2, 418, 516);
				this.aClass50_4.method562();
				this.aClass1_Sub1_Sub2_Sub1_9.method62(0, 0);
				if (this.anInt878 == -1) {
					if (this.anIntArray213[this.anInt926] != -1) {
						if (this.anInt926 == 7) {
							this.aClass1_Sub1_Sub2_Sub1_11.method62(0, 42);
						}
						if (this.anInt926 == 8) {
							this.aClass1_Sub1_Sub2_Sub1_12.method62(0, 74);
						}
						if (this.anInt926 == 9) {
							this.aClass1_Sub1_Sub2_Sub1_12.method62(0, 102);
						}
						if (this.anInt926 == 10) {
							this.aClass1_Sub1_Sub2_Sub1_13.method62(1, 130);
						}
						if (this.anInt926 == 11) {
							this.aClass1_Sub1_Sub2_Sub1_15.method62(0, 173);
						}
						if (this.anInt926 == 12) {
							this.aClass1_Sub1_Sub2_Sub1_15.method62(0, 201);
						}
						if (this.anInt926 == 13) {
							this.aClass1_Sub1_Sub2_Sub1_14.method62(0, 229);
						}
					}
					if (this.anIntArray213[8] != -1 && (this.anInt866 != 8 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[7].method62(2, 74);
					}
					if (this.anIntArray213[9] != -1 && (this.anInt866 != 9 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[8].method62(3, 102);
					}
					if (this.anIntArray213[10] != -1 && (this.anInt866 != 10 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[9].method62(4, 137);
					}
					if (this.anIntArray213[11] != -1 && (this.anInt866 != 11 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[10].method62(2, 174);
					}
					if (this.anIntArray213[12] != -1 && (this.anInt866 != 12 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[11].method62(2, 201);
					}
					if (this.anIntArray213[13] != -1 && (this.anInt866 != 13 || anInt987 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub1Array4[12].method62(2, 226);
					}
				}
				this.aClass50_4.method563(466, super.aGraphics2, 418, 496);
				this.aClass50_17.method562();
			}
			if (this.aBoolean197) {
				this.aBoolean197 = false;
				this.aClass50_3.method562();
				this.aClass1_Sub1_Sub2_Sub1_8.method62(0, 0);
				this.aClass1_Sub1_Sub2_Sub3_3.method421(55, "Public chat", true, 16777215, 28);
				if (this.anInt1050 == 0) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(55, "On", true, 65280, 41);
				}
				if (this.anInt1050 == 1) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(55, "Friends", true, 16776960, 41);
				}
				if (this.anInt1050 == 2) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(55, "Off", true, 16711680, 41);
				}
				if (this.anInt1050 == 3) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(55, "Hide", true, 65535, 41);
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method421(184, "Private chat", true, 16777215, 28);
				if (this.anInt982 == 0) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(184, "On", true, 65280, 41);
				}
				if (this.anInt982 == 1) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(184, "Friends", true, 16776960, 41);
				}
				if (this.anInt982 == 2) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(184, "Off", true, 16711680, 41);
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method421(324, "Trade/compete", true, 16777215, 28);
				if (this.anInt892 == 0) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(324, "On", true, 65280, 41);
				}
				if (this.anInt892 == 1) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(324, "Friends", true, 16776960, 41);
				}
				if (this.anInt892 == 2) {
					this.aClass1_Sub1_Sub2_Sub3_3.method421(324, "Off", true, 16711680, 41);
				}
				this.aClass1_Sub1_Sub2_Sub3_3.method421(458, "Report abuse", true, 16777215, 33);
				this.aClass50_3.method563(453, super.aGraphics2, 418, 0);
				this.aClass50_17.method562();
			}
			this.anInt939 = 0;
		} catch (@Pc(1152) RuntimeException local1152) {
			signlink.reporterror("45994, " + -9 + ", " + local1152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BZ)V")
	private void method703(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			signlink.anInt1085 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("54624, " + arg0 + ", " + arg1 + ", " + true + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XJCNBMKS;II)V")
	private void method704(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anInt922; local11++) {
				@Pc(18) int local18 = this.anIntArray221[local11];
				@Pc(23) Class1_Sub1_Sub1_Sub2_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local18];
				@Pc(26) int local26 = arg0.method498();
				if ((local26 & 0x10) != 0) {
					local26 += arg0.method498() << 8;
				}
				this.method661(local23, arg0, local26, local18);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("51942, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!XJCNBMKS;I)V")
	private void method705(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(22) int local22;
			@Pc(30) int local30;
			@Pc(33) int local33;
			@Pc(42) int local42;
			@Pc(49) int local49;
			@Pc(69) int local69;
			@Pc(107) int local107;
			@Pc(27) int local27;
			@Pc(81) int local81;
			@Pc(95) int local95;
			if (arg0 == 72) {
				local14 = arg1.method516();
				local18 = local14 >> 2;
				local22 = local14 & 0x3;
				local27 = this.anIntArray269[local18];
				local30 = arg1.method500();
				local33 = arg1.method498();
				local42 = this.anInt931 + (local33 >> 4 & 0x7);
				local49 = this.anInt932 + (local33 & 0x7);
				if (local42 >= 0 && local49 >= 0 && local42 < 103 && local49 < 103) {
					local69 = this.anIntArrayArrayArray8[this.anInt874][local42][local49];
					local81 = this.anIntArrayArrayArray8[this.anInt874][local42 + 1][local49];
					local95 = this.anIntArrayArrayArray8[this.anInt874][local42 + 1][local49 + 1];
					local107 = this.anIntArrayArrayArray8[this.anInt874][local42][local49 + 1];
					if (local27 == 0) {
						@Pc(118) Class7 local118 = this.aClass21_1.method251(local42, local49, this.anInt874);
						if (local118 != null) {
							@Pc(127) int local127 = local118.anInt86 >> 14 & 0x7FFF;
							if (local18 == 2) {
								local118.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub1(local69, local81, local22 + 4, 2, local30, local127, local95, false, local107, this.anInt1061);
								local118.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub1(local69, local81, local22 + 1 & 0x3, 2, local30, local127, local95, false, local107, this.anInt1061);
							} else {
								local118.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub1(local69, local81, local22, local18, local30, local127, local95, false, local107, this.anInt1061);
							}
						}
					}
					if (local27 == 1) {
						@Pc(198) Class8 local198 = this.aClass21_1.method252(local49, this.anInt874, local42);
						if (local198 != null) {
							local198.aClass1_Sub1_Sub1_3 = new Class1_Sub1_Sub1_Sub1(local69, local81, 0, 4, local30, local198.anInt92 >> 14 & 0x7FFF, local95, false, local107, this.anInt1061);
						}
					}
					if (local27 == 2) {
						@Pc(234) Class15 local234 = this.aClass21_1.method253(this.anInt874, local42, local49, this.aByte49);
						if (local18 == 11) {
							local18 = 10;
						}
						if (local234 != null) {
							local234.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub1(local69, local81, local22, local18, local30, local234.anInt330 >> 14 & 0x7FFF, local95, false, local107, this.anInt1061);
						}
					}
					if (local27 == 3) {
						@Pc(274) Class29 local274 = this.aClass21_1.method254(local42, this.anInt874, (byte) 7, local49);
						if (local274 != null) {
							local274.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub1(local69, local81, local22, 22, local30, local274.anInt483 >> 14 & 0x7FFF, local95, false, local107, this.anInt1061);
						}
					}
				}
			} else if (arg0 == 35) {
				local14 = arg1.method498();
				local18 = this.anInt931 + (local14 >> 4 & 0x7);
				local22 = this.anInt932 + (local14 & 0x7);
				local27 = arg1.method500();
				local30 = arg1.method500();
				local33 = arg1.method500();
				if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
					@Pc(349) Class13 local349 = this.aClass13ArrayArrayArray1[this.anInt874][local18][local22];
					if (local349 != null) {
						for (@Pc(355) Class1_Sub1_Sub1_Sub5 local355 = (Class1_Sub1_Sub1_Sub5) local349.method111(); local355 != null; local355 = (Class1_Sub1_Sub1_Sub5) local349.method113()) {
							if (local355.anInt439 == (local27 & 0x7FFF) && local355.anInt438 == local30) {
								local355.anInt438 = local33;
								break;
							}
						}
						this.method650(local18, local22);
					}
				}
			} else {
				@Pc(447) int local447;
				if (arg0 == 159) {
					local14 = arg1.method498();
					local18 = this.anInt931 + (local14 >> 4 & 0x7);
					local22 = this.anInt932 + (local14 & 0x7);
					@Pc(411) byte local411 = arg1.method519(this.anInt899);
					local30 = arg1.method517();
					local33 = local30 >> 2;
					local42 = local30 & 0x3;
					local49 = this.anIntArray269[local33];
					local69 = arg1.method524();
					@Pc(437) byte local437 = arg1.method519(this.anInt899);
					@Pc(440) byte local440 = arg1.method499();
					local107 = arg1.method500();
					local447 = arg1.method525();
					@Pc(450) byte local450 = arg1.method499();
					@Pc(454) int local454 = arg1.method525();
					@Pc(460) Class1_Sub1_Sub1_Sub2_Sub2 local460;
					if (local454 == this.anInt979) {
						local460 = aClass1_Sub1_Sub1_Sub2_Sub2_1;
					} else {
						local460 = this.aClass1_Sub1_Sub1_Sub2_Sub2Array1[local454];
					}
					if (local460 != null) {
						@Pc(472) Class42 local472 = Class42.method395(local107);
						@Pc(482) int local482 = this.anIntArrayArrayArray8[this.anInt874][local18][local22];
						@Pc(494) int local494 = this.anIntArrayArrayArray8[this.anInt874][local18 + 1][local22];
						@Pc(508) int local508 = this.anIntArrayArrayArray8[this.anInt874][local18 + 1][local22 + 1];
						@Pc(520) int local520 = this.anIntArrayArrayArray8[this.anInt874][local18][local22 + 1];
						@Pc(530) Class1_Sub1_Sub1_Sub3 local530 = local472.method396(local33, local42, local482, local494, local508, local520, -1);
						if (local530 != null) {
							this.method609(local18, 0, 0, this.anInt874, local69 + 1, local49, -1, local447 + 1, local22);
							local460.anInt568 = local447 + anInt987;
							local460.anInt569 = local69 + anInt987;
							local460.aClass1_Sub1_Sub1_Sub3_2 = local530;
							@Pc(565) int local565 = local472.anInt697;
							@Pc(568) int local568 = local472.anInt692;
							if (local42 == 1 || local42 == 3) {
								local565 = local472.anInt692;
								local568 = local472.anInt697;
							}
							local460.anInt570 = local18 * 128 + local565 * 64;
							local460.anInt572 = local22 * 128 + local568 * 64;
							local460.anInt571 = this.method648(local460.anInt572, this.anInt874, local460.anInt570);
							@Pc(614) byte local614;
							if (local440 > local450) {
								local614 = local440;
								local440 = local450;
								local450 = local614;
							}
							if (local437 > local411) {
								local614 = local437;
								local437 = local411;
								local411 = local614;
							}
							local460.anInt578 = local18 + local440;
							local460.anInt580 = local18 + local450;
							local460.anInt579 = local22 + local437;
							local460.anInt581 = local22 + local411;
						}
					}
				}
				@Pc(691) Class1_Sub1_Sub1_Sub5 local691;
				if (arg0 == 61) {
					local14 = arg1.method498();
					local18 = this.anInt931 + (local14 >> 4 & 0x7);
					local22 = this.anInt932 + (local14 & 0x7);
					local27 = arg1.method524();
					local30 = arg1.method525();
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
						local691 = new Class1_Sub1_Sub1_Sub5();
						local691.anInt439 = local30;
						local691.anInt438 = local27;
						if (this.aClass13ArrayArrayArray1[this.anInt874][local18][local22] == null) {
							this.aClass13ArrayArrayArray1[this.anInt874][local18][local22] = new Class13(aBoolean230);
						}
						this.aClass13ArrayArrayArray1[this.anInt874][local18][local22].method108(local691);
						this.method650(local18, local22);
					}
				} else if (arg0 == 102) {
					local14 = arg1.method517();
					local18 = local14 >> 2;
					local22 = local14 & 0x3;
					local27 = this.anIntArray269[local18];
					local30 = arg1.method525();
					local33 = arg1.method517();
					local42 = this.anInt931 + (local33 >> 4 & 0x7);
					local49 = this.anInt932 + (local33 & 0x7);
					if (local42 >= 0 && local49 >= 0 && local42 < 104 && local49 < 104) {
						this.method609(local42, local22, local18, this.anInt874, -1, local27, local30, 0, local49);
					}
				} else if (arg0 == 128) {
					local14 = arg1.method498();
					local18 = this.anInt931 + (local14 >> 4 & 0x7);
					local22 = this.anInt932 + (local14 & 0x7);
					local27 = local18 + arg1.method499();
					local30 = local22 + arg1.method499();
					local33 = arg1.method501();
					local42 = arg1.method500();
					local49 = arg1.method498() * 4;
					local69 = arg1.method498() * 4;
					local81 = arg1.method500();
					local95 = arg1.method500();
					local107 = arg1.method498();
					local447 = arg1.method498();
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104 && local27 >= 0 && local30 >= 0 && local27 < 104 && local30 < 104 && local42 != 65535) {
						local18 = local18 * 128 + 64;
						local22 = local22 * 128 + 64;
						local27 = local27 * 128 + 64;
						local30 = local30 * 128 + 64;
						@Pc(940) Class1_Sub1_Sub1_Sub6 local940 = new Class1_Sub1_Sub1_Sub6(local447, local107, local81 + anInt987, local42, this.method648(local22, this.anInt874, local18) - local49, local33, local95 + anInt987, this.anInt874, local69, true, local22, local18);
						local940.method342(local27, local30, this.method648(local30, this.anInt874, local27) - local69, local81 + anInt987);
						this.aClass13_12.method108(local940);
					}
				} else if (arg0 == 26) {
					local14 = arg1.method500();
					local18 = arg1.method525();
					local22 = arg1.method518();
					local27 = this.anInt931 + (local22 >> 4 & 0x7);
					local30 = this.anInt932 + (local22 & 0x7);
					local33 = arg1.method523();
					if (local27 >= 0 && local30 >= 0 && local27 < 104 && local30 < 104 && local33 != this.anInt979) {
						@Pc(1014) Class1_Sub1_Sub1_Sub5 local1014 = new Class1_Sub1_Sub1_Sub5();
						local1014.anInt439 = local14;
						local1014.anInt438 = local18;
						if (this.aClass13ArrayArrayArray1[this.anInt874][local27][local30] == null) {
							this.aClass13ArrayArrayArray1[this.anInt874][local27][local30] = new Class13(aBoolean230);
						}
						this.aClass13ArrayArrayArray1[this.anInt874][local27][local30].method108(local1014);
						this.method650(local27, local30);
					}
				} else if (arg0 == 251) {
					local14 = arg1.method498();
					local18 = this.anInt931 + (local14 >> 4 & 0x7);
					local22 = this.anInt932 + (local14 & 0x7);
					local27 = arg1.method517();
					local30 = local27 >> 2;
					local33 = local27 & 0x3;
					local42 = this.anIntArray269[local30];
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
						this.method609(local18, local33, local30, this.anInt874, -1, local42, -1, 0, local22);
					}
				} else if (arg0 == 37) {
					local14 = arg1.method516();
					local18 = this.anInt931 + (local14 >> 4 & 0x7);
					local22 = this.anInt932 + (local14 & 0x7);
					local27 = arg1.method500();
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
						@Pc(1168) Class13 local1168 = this.aClass13ArrayArrayArray1[this.anInt874][local18][local22];
						if (local1168 != null) {
							for (local691 = (Class1_Sub1_Sub1_Sub5) local1168.method111(); local691 != null; local691 = (Class1_Sub1_Sub1_Sub5) local1168.method113()) {
								if (local691.anInt439 == (local27 & 0x7FFF)) {
									local691.method565();
									break;
								}
							}
							if (local1168.method111() == null) {
								this.aClass13ArrayArrayArray1[this.anInt874][local18][local22] = null;
							}
							this.method650(local18, local22);
						}
					}
				} else if (arg0 == 80) {
					local14 = arg1.method498();
					local18 = this.anInt931 + (local14 >> 4 & 0x7);
					local22 = this.anInt932 + (local14 & 0x7);
					local27 = arg1.method500();
					local30 = arg1.method498();
					local33 = arg1.method500();
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
						local18 = local18 * 128 + 64;
						local22 = local22 * 128 + 64;
						@Pc(1285) Class1_Sub1_Sub1_Sub4 local1285 = new Class1_Sub1_Sub1_Sub4(this.method648(local22, this.anInt874, local18) - local30, local33, 368, anInt987, local27, this.anInt874, local18, local22);
						this.aClass13_11.method108(local1285);
					}
				} else if (arg0 == 240) {
					local14 = arg1.method498();
					local18 = this.anInt931 + (local14 >> 4 & 0x7);
					local22 = this.anInt932 + (local14 & 0x7);
					local27 = arg1.method500();
					local30 = arg1.method498();
					local33 = local30 >> 4 & 0xF;
					local42 = local30 & 0x7;
					if (aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0] >= local18 - local33 && aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray140[0] <= local18 + local33 && aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0] >= local22 - local33 && aClass1_Sub1_Sub1_Sub2_Sub2_1.anIntArray141[0] <= local22 + local33 && this.aBoolean192 && !aBoolean222 && this.anInt1060 < 50) {
						this.anIntArray249[this.anInt1060] = local27;
						this.anIntArray268[this.anInt1060] = local42;
						this.anIntArray271[this.anInt1060] = Class17.anIntArray82[local27];
						this.anInt1060++;
						return;
					}
				}
			}
		} catch (@Pc(1397) RuntimeException local1397) {
			signlink.reporterror("53782, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local1397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DEITBGVL;)V")
	private void method706(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray230.length; local5++) {
				this.anIntArray230[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray230[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray231[local60] = (this.anIntArray230[local60 - 1] + this.anIntArray230[local60 + 1] + this.anIntArray230[local60 - 128] + this.anIntArray230[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray230;
				this.anIntArray230 = this.anIntArray231;
				this.anIntArray231 = local106;
			}
			this.anInt955 += 0;
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt127; local52++) {
					for (local60 = 0; local60 < arg0.anInt126; local60++) {
						if (arg0.aByteArray2[local48++] != 0) {
							@Pc(148) int local148 = local60 + arg0.anInt128 + 16;
							@Pc(155) int local155 = local52 + arg0.anInt129 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray230[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("94984, " + 0 + ", " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ZI)V")
	private void method707(@OriginalArg(0) boolean arg0) {
		try {
			this.method583();
			this.aClass50_8.method562();
			this.aClass1_Sub1_Sub2_Sub1_6.method62(0, 0);
			@Pc(44) byte local44;
			@Pc(56) int local56;
			if (this.anInt1064 == 0) {
				this.aClass1_Sub1_Sub2_Sub3_2.method421(180, this.aClass35_Sub1_1.aString14, true, 7711145, 180);
				local44 = 80;
				this.aClass1_Sub1_Sub2_Sub3_4.method421(180, "Welcome to RuneScape", true, 16776960, 80);
				local56 = local44 + 30;
				this.aClass1_Sub1_Sub2_Sub1_7.method62(100, 27);
				this.aClass1_Sub1_Sub2_Sub3_4.method421(100, "New User", true, 16777215, 125);
				this.aClass1_Sub1_Sub2_Sub1_7.method62(100, 187);
				this.aClass1_Sub1_Sub2_Sub3_4.method421(260, "Existing User", true, 16777215, 125);
			}
			if (this.anInt1064 == 2) {
				local44 = 60;
				if (this.aString27.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub3_4.method421(180, this.aString27, true, 16776960, 45);
					this.aClass1_Sub1_Sub2_Sub3_4.method421(180, this.aString28, true, 16776960, 60);
					local56 = local44 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub3_4.method421(180, this.aString28, true, 16776960, 53);
					local56 = local44 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub3_4.method428(90, 16777215, "Username: " + this.aString20 + (this.anInt924 == 0 & anInt987 % 40 < 20 ? "@yel@|" : ""), true, 90);
				local56 += 15;
				this.aClass1_Sub1_Sub2_Sub3_4.method428(105, 16777215, "Password: " + Class44.method453(this.aString21) + (this.anInt924 == 1 & anInt987 % 40 < 20 ? "@yel@|" : ""), true, 92);
				local56 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub1_7.method62(130, 27);
					this.aClass1_Sub1_Sub2_Sub3_4.method421(100, "Login", true, 16777215, 155);
					this.aClass1_Sub1_Sub2_Sub1_7.method62(130, 187);
					this.aClass1_Sub1_Sub2_Sub3_4.method421(260, "Cancel", true, 16777215, 155);
				}
			}
			if (this.anInt1064 == 3) {
				this.aClass1_Sub1_Sub2_Sub3_4.method421(180, "Create a free account", true, 16776960, 40);
				local44 = 65;
				this.aClass1_Sub1_Sub2_Sub3_4.method421(180, "To create a new account you need to", true, 16777215, 65);
				local56 = local44 + 15;
				this.aClass1_Sub1_Sub2_Sub3_4.method421(180, "go back to the main RuneScape webpage", true, 16777215, 80);
				local56 += 15;
				this.aClass1_Sub1_Sub2_Sub3_4.method421(180, "and choose the red 'create account'", true, 16777215, 95);
				local56 += 15;
				this.aClass1_Sub1_Sub2_Sub3_4.method421(180, "button at the top right of that page.", true, 16777215, 110);
				local56 += 15;
				this.aClass1_Sub1_Sub2_Sub1_7.method62(130, 107);
				this.aClass1_Sub1_Sub2_Sub3_4.method421(180, "Cancel", true, 16777215, 155);
			}
			this.aClass50_8.method563(171, super.aGraphics2, 418, 202);
			if (this.aBoolean231) {
				this.aBoolean231 = false;
				this.aClass50_6.method563(0, super.aGraphics2, 418, 128);
				this.aClass50_7.method563(371, super.aGraphics2, 418, 202);
				this.aClass50_11.method563(265, super.aGraphics2, 418, 0);
				this.aClass50_12.method563(265, super.aGraphics2, 418, 562);
				this.aClass50_13.method563(171, super.aGraphics2, 418, 128);
				this.aClass50_14.method563(171, super.aGraphics2, 418, 562);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("29718, " + arg0 + ", " + 8633 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method708(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class30.aClass30Array1[arg0].anInt488;
			if (local4 != 0) {
				@Pc(17) int local17 = this.anIntArray273[arg0];
				if (local4 == 1) {
					if (local17 == 1) {
						Class1_Sub1_Sub2_Sub2.method89(0.9D);
					}
					if (local17 == 2) {
						Class1_Sub1_Sub2_Sub2.method89(0.8D);
					}
					if (local17 == 3) {
						Class1_Sub1_Sub2_Sub2.method89(0.7D);
					}
					if (local17 == 4) {
						Class1_Sub1_Sub2_Sub2.method89(0.6D);
					}
					Class5.aClass18_2.method218();
					this.aBoolean231 = true;
				}
				if (local4 == 3) {
					@Pc(55) boolean local55 = this.aBoolean198;
					if (local17 == 0) {
						this.method693(this.aBoolean198, 0);
						this.aBoolean198 = true;
					}
					if (local17 == 1) {
						this.method693(this.aBoolean198, -400);
						this.aBoolean198 = true;
					}
					if (local17 == 2) {
						this.method693(this.aBoolean198, -800);
						this.aBoolean198 = true;
					}
					if (local17 == 3) {
						this.method693(this.aBoolean198, -1200);
						this.aBoolean198 = true;
					}
					if (local17 == 4) {
						this.aBoolean198 = false;
					}
					if (this.aBoolean198 != local55 && !aBoolean222) {
						if (this.aBoolean198) {
							this.anInt988 = this.anInt1068;
							this.aBoolean232 = true;
							this.aClass35_Sub1_1.method370(2, this.anInt988);
						} else {
							this.method653();
						}
						this.anInt1052 = 0;
					}
				}
				if (local4 == 4) {
					if (local17 == 0) {
						this.aBoolean192 = true;
						this.method710(0);
					}
					if (local17 == 1) {
						this.aBoolean192 = true;
						this.method710(-400);
					}
					if (local17 == 2) {
						this.aBoolean192 = true;
						this.method710(-800);
					}
					if (local17 == 3) {
						this.aBoolean192 = true;
						this.method710(-1200);
					}
					if (local17 == 4) {
						this.aBoolean192 = false;
					}
				}
				if (local4 == 5) {
					this.anInt1058 = local17;
				}
				if (local4 == 6) {
					this.anInt938 = local17;
				}
				if (local4 == 8) {
					this.anInt1039 = local17;
					this.aBoolean239 = true;
				}
				if (local4 == 9) {
					this.anInt911 = local17;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("74935, " + arg0 + ", " + 7 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(Z)V")
	private void method709() {
		try {
			while (true) {
				@Pc(10) Class1_Sub1_Sub4 local10 = this.aClass35_Sub1_1.method377();
				if (local10 == null) {
					return;
				}
				if (local10.anInt839 == 0) {
					Class1_Sub1_Sub1_Sub3.method180(local10.anInt840, local10.aByteArray20);
					if ((this.aClass35_Sub1_1.method379(local10.anInt840) & 0x62) != 0) {
						this.aBoolean219 = true;
						if (this.anInt925 != -1) {
							this.aBoolean239 = true;
						}
					}
				}
				if (local10.anInt839 == 1 && local10.aByteArray20 != null) {
					Class40.method364(local10.aByteArray20, this.anInt1048);
				}
				if (local10.anInt839 == 2 && local10.anInt840 == this.anInt988 && local10.aByteArray20 != null) {
					this.method703(this.aBoolean232, local10.aByteArray20);
				}
				if (local10.anInt839 == 3 && this.anInt913 == 1) {
					for (@Pc(82) int local82 = 0; local82 < this.aByteArrayArray5.length; local82++) {
						if (this.anIntArray246[local82] == local10.anInt840) {
							this.aByteArrayArray5[local82] = local10.aByteArray20;
							if (local10.aByteArray20 == null) {
								this.anIntArray246[local82] = -1;
							}
							break;
						}
						if (this.anIntArray247[local82] == local10.anInt840) {
							this.aByteArrayArray4[local82] = local10.aByteArray20;
							if (local10.aByteArray20 == null) {
								this.anIntArray247[local82] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt839 == 93 && this.aClass35_Sub1_1.method383(local10.anInt840)) {
					Class45.method468(this.aClass35_Sub1_1, new Class1_Sub1_Sub3((byte) 9, local10.aByteArray20), this.aBoolean226);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("69157, " + false + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(ZI)V")
	private void method710(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1087 = arg0;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("86715, " + false + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RWLOYYVC;IIIB)V")
	private void method711(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		try {
			if (arg0.anInt646 == 0 && arg0.anIntArray158 != null && (!arg0.aBoolean123 || this.anInt893 == arg0.anInt641 || this.anInt898 == arg0.anInt641 || this.anInt941 == arg0.anInt641)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt821;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt819;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt822;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt820;
				Class1_Sub1_Sub2.method539(arg2, arg3, arg2 + arg0.anInt639, arg3 + arg0.anInt635);
				@Pc(51) int local51 = arg0.anIntArray158.length;
				@Pc(56) boolean local56 = false;
				for (@Pc(62) int local62 = 0; local62 < local51; local62++) {
					@Pc(71) int local71 = arg0.anIntArray157[local62] + arg2;
					@Pc(80) int local80 = arg0.anIntArray151[local62] + arg3 - arg1;
					@Pc(87) Class38 local87 = Class38.aClass38Array1[arg0.anIntArray158[local62]];
					@Pc(92) int local92 = local71 + local87.anInt634;
					@Pc(97) int local97 = local80 + local87.anInt633;
					if (local87.anInt640 > 0) {
						this.method658(local87);
					}
					if (local87.anInt646 == 0) {
						if (local87.anInt622 > local87.anInt638 - local87.anInt635) {
							local87.anInt622 = local87.anInt638 - local87.anInt635;
						}
						if (local87.anInt622 < 0) {
							local87.anInt622 = 0;
						}
						this.method711(local87, local87.anInt622, local92, local97, (byte) 7);
						if (local87.anInt638 > local87.anInt635) {
							this.method621(local87.anInt622, local87.anInt635, local92 + local87.anInt639, local97, local87.anInt638);
						}
					} else if (local87.anInt646 != 1) {
						@Pc(169) int local169;
						@Pc(173) int local173;
						@Pc(184) int local184;
						@Pc(219) int local219;
						@Pc(226) int local226;
						@Pc(167) int local167;
						@Pc(217) int local217;
						if (local87.anInt646 == 2) {
							local167 = 0;
							for (local169 = 0; local169 < local87.anInt635; local169++) {
								for (local173 = 0; local173 < local87.anInt639; local173++) {
									local184 = local92 + local173 * (local87.anInt623 + 32);
									@Pc(193) int local193 = local97 + local169 * (local87.anInt636 + 32);
									if (local167 < 20) {
										local184 += local87.anIntArray153[local167];
										local193 += local87.anIntArray155[local167];
									}
									if (local87.anIntArray159[local167] > 0) {
										local217 = 0;
										local219 = 0;
										local226 = local87.anIntArray159[local167] - 1;
										if (local184 > Class1_Sub1_Sub2.anInt821 - 32 && local184 < Class1_Sub1_Sub2.anInt822 && local193 > Class1_Sub1_Sub2.anInt819 - 32 && local193 < Class1_Sub1_Sub2.anInt820 || this.anInt950 != 0 && this.anInt949 == local167) {
											@Pc(251) int local251 = 0;
											if (this.anInt973 == 1 && this.anInt974 == local167 && this.anInt975 == local87.anInt641) {
												local251 = 16777215;
											}
											@Pc(275) Class1_Sub1_Sub2_Sub4 local275 = Class5.method18((byte) 6, local226, local87.anIntArray156[local167], local251);
											if (local275 != null) {
												@Pc(354) int local354;
												if (this.anInt950 != 0 && this.anInt949 == local167 && this.anInt948 == local87.anInt641) {
													local217 = super.anInt851 - this.anInt951;
													local219 = super.anInt852 - this.anInt952;
													if (local217 < 5 && local217 > -5) {
														local217 = 0;
													}
													if (local219 < 5 && local219 > -5) {
														local219 = 0;
													}
													if (this.anInt900 < 5) {
														local217 = 0;
														local219 = 0;
													}
													local275.method556(local193 + local219, local184 + local217);
													if (local193 + local219 < Class1_Sub1_Sub2.anInt819 && arg0.anInt622 > 0) {
														local354 = this.anInt939 * (Class1_Sub1_Sub2.anInt819 - local193 - local219) / 3;
														if (local354 > this.anInt939 * 10) {
															local354 = this.anInt939 * 10;
														}
														if (local354 > arg0.anInt622) {
															local354 = arg0.anInt622;
														}
														arg0.anInt622 -= local354;
														this.anInt952 += local354;
													}
													if (local193 + local219 + 32 > Class1_Sub1_Sub2.anInt820 && arg0.anInt622 < arg0.anInt638 - arg0.anInt635) {
														local354 = this.anInt939 * (local193 + local219 + 32 - Class1_Sub1_Sub2.anInt820) / 3;
														if (local354 > this.anInt939 * 10) {
															local354 = this.anInt939 * 10;
														}
														if (local354 > arg0.anInt638 - arg0.anInt635 - arg0.anInt622) {
															local354 = arg0.anInt638 - arg0.anInt635 - arg0.anInt622;
														}
														arg0.anInt622 += local354;
														this.anInt952 -= local354;
													}
												} else if (this.anInt1013 != 0 && this.anInt1012 == local167 && this.anInt1011 == local87.anInt641) {
													local275.method556(local193, local184);
												} else {
													local275.method554(local193, local184);
												}
												if (local275.anInt832 == 33 || local87.anIntArray156[local167] != 1) {
													local354 = local87.anIntArray156[local167];
													this.aClass1_Sub1_Sub2_Sub3_2.method424(local184 + local217 + 1, method702(local354), 0, local193 + local219 + 10);
													this.aClass1_Sub1_Sub2_Sub3_2.method424(local184 + local217, method702(local354), 16776960, local193 + local219 + 9);
												}
											}
										}
									} else if (local87.aClass1_Sub1_Sub2_Sub4Array1 != null && local167 < 20) {
										@Pc(543) Class1_Sub1_Sub2_Sub4 local543 = local87.aClass1_Sub1_Sub2_Sub4Array1[local167];
										if (local543 != null) {
											local543.method554(local193, local184);
										}
									}
									local167++;
								}
							}
						} else if (local87.anInt646 == 3) {
							@Pc(568) boolean local568 = false;
							if (this.anInt941 == local87.anInt641 || this.anInt898 == local87.anInt641 || this.anInt893 == local87.anInt641) {
								local568 = true;
							}
							if (this.method712(local87)) {
								local167 = local87.anInt621;
								if (local568 && local87.anInt619 != 0) {
									local167 = local87.anInt619;
								}
							} else {
								local167 = local87.anInt617;
								if (local568 && local87.anInt624 != 0) {
									local167 = local87.anInt624;
								}
							}
							if (local87.aByte26 == 0) {
								if (local87.aBoolean130) {
									Class1_Sub1_Sub2.method542(local92, local97, local167, local87.anInt639, local87.anInt635);
								} else {
									Class1_Sub1_Sub2.method543(local87.anInt635, local167, local92, local87.anInt639, local97);
								}
							} else if (local87.aBoolean130) {
								Class1_Sub1_Sub2.method541(local167, local87.anInt639, local97, 256 - (local87.aByte26 & 0xFF), local92, local87.anInt635);
							} else {
								Class1_Sub1_Sub2.method544(local87.anInt635, local167, 256 - (local87.aByte26 & 0xFF), local87.anInt639, local97, local92);
							}
						} else {
							@Pc(686) Class1_Sub1_Sub2_Sub3 local686;
							if (local87.anInt646 == 4) {
								local686 = local87.aClass1_Sub1_Sub2_Sub3_1;
								@Pc(689) String local689 = local87.aString11;
								@Pc(691) boolean local691 = false;
								if (this.anInt941 == local87.anInt641 || this.anInt898 == local87.anInt641 || this.anInt893 == local87.anInt641) {
									local691 = true;
								}
								if (this.method712(local87)) {
									local169 = local87.anInt621;
									if (local691 && local87.anInt619 != 0) {
										local169 = local87.anInt619;
									}
									if (local87.aString13.length() > 0) {
										local689 = local87.aString13;
									}
								} else {
									local169 = local87.anInt617;
									if (local691 && local87.anInt624 != 0) {
										local169 = local87.anInt624;
									}
								}
								if (local87.anInt644 == 6 && this.aBoolean228) {
									local689 = "Please wait...";
									local169 = local87.anInt617;
								}
								if (Class1_Sub1_Sub2.anInt817 == 479) {
									if (local169 == 16776960) {
										local169 = 255;
									}
									if (local169 == 49152) {
										local169 = 16777215;
									}
								}
								local217 = local97 + local686.anInt733;
								while (local689.length() > 0) {
									if (local689.indexOf("%") != -1) {
										label348: while (true) {
											local219 = local689.indexOf("%1");
											if (local219 == -1) {
												while (true) {
													local219 = local689.indexOf("%2");
													if (local219 == -1) {
														while (true) {
															local219 = local689.indexOf("%3");
															if (local219 == -1) {
																while (true) {
																	local219 = local689.indexOf("%4");
																	if (local219 == -1) {
																		while (true) {
																			local219 = local689.indexOf("%5");
																			if (local219 == -1) {
																				break label348;
																			}
																			local689 = local689.substring(0, local219) + this.method666(this.aByte48, this.method634(4, local87)) + local689.substring(local219 + 2);
																		}
																	}
																	local689 = local689.substring(0, local219) + this.method666(this.aByte48, this.method634(3, local87)) + local689.substring(local219 + 2);
																}
															}
															local689 = local689.substring(0, local219) + this.method666(this.aByte48, this.method634(2, local87)) + local689.substring(local219 + 2);
														}
													}
													local689 = local689.substring(0, local219) + this.method666(this.aByte48, this.method634(1, local87)) + local689.substring(local219 + 2);
												}
											}
											local689 = local689.substring(0, local219) + this.method666(this.aByte48, this.method634(0, local87)) + local689.substring(local219 + 2);
										}
									}
									local219 = local689.indexOf("\\n");
									@Pc(968) String local968;
									if (local219 == -1) {
										local968 = local689;
										local689 = "";
									} else {
										local968 = local689.substring(0, local219);
										local689 = local689.substring(local219 + 2);
									}
									if (local87.aBoolean122) {
										local686.method421(local92 + local87.anInt639 / 2, local968, local87.aBoolean125, local169, local217);
									} else {
										local686.method428(local217, local169, local968, local87.aBoolean125, local92);
									}
									local217 += local686.anInt733;
								}
							} else if (local87.anInt646 == 5) {
								@Pc(1029) Class1_Sub1_Sub2_Sub4 local1029;
								if (this.method712(local87)) {
									local1029 = local87.aClass1_Sub1_Sub2_Sub4_1;
								} else {
									local1029 = local87.aClass1_Sub1_Sub2_Sub4_2;
								}
								if (local1029 != null) {
									local1029.method554(local97, local92);
								}
							} else if (local87.anInt646 == 6) {
								local167 = Class1_Sub1_Sub2_Sub2.anInt159;
								local169 = Class1_Sub1_Sub2_Sub2.anInt160;
								Class1_Sub1_Sub2_Sub2.anInt159 = local92 + local87.anInt639 / 2;
								Class1_Sub1_Sub2_Sub2.anInt160 = local97 + local87.anInt635 / 2;
								local173 = Class1_Sub1_Sub2_Sub2.anIntArray16[local87.anInt626] * local87.anInt625 >> 16;
								local184 = Class1_Sub1_Sub2_Sub2.anIntArray17[local87.anInt626] * local87.anInt625 >> 16;
								@Pc(1090) boolean local1090 = this.method712(local87);
								if (local1090) {
									local217 = local87.anInt630;
								} else {
									local217 = local87.anInt629;
								}
								@Pc(1110) Class1_Sub1_Sub1_Sub3 local1110;
								if (local217 == -1) {
									local1110 = local87.method354(local1090, -1, -1);
								} else {
									@Pc(1116) Class16 local1116 = Class16.aClass16Array1[local217];
									local1110 = local87.method354(local1090, local1116.anIntArray79[local87.anInt645], local1116.anIntArray78[local87.anInt645]);
								}
								if (local1110 != null) {
									local1110.method202(local87.anInt627, 0, local87.anInt626, 0, local173, local184);
								}
								Class1_Sub1_Sub2_Sub2.anInt159 = local167;
								Class1_Sub1_Sub2_Sub2.anInt160 = local169;
							} else if (local87.anInt646 == 7) {
								local686 = local87.aClass1_Sub1_Sub2_Sub3_1;
								local169 = 0;
								for (local173 = 0; local173 < local87.anInt635; local173++) {
									for (local184 = 0; local184 < local87.anInt639; local184++) {
										if (local87.anIntArray159[local169] > 0) {
											@Pc(1180) Class5 local1180 = Class5.method23(local87.anIntArray159[local169] - 1);
											@Pc(1183) String local1183 = local1180.aString1;
											if (local1180.aBoolean20 || local87.anIntArray156[local169] != 1) {
												local1183 = local1183 + " x" + method671(local87.anIntArray156[local169]);
											}
											local219 = local92 + local184 * (local87.anInt623 + 115);
											local226 = local97 + local173 * (local87.anInt636 + 12);
											if (local87.aBoolean122) {
												local686.method421(local219 + local87.anInt639 / 2, local1183, local87.aBoolean125, local87.anInt617, local226);
											} else {
												local686.method428(local226, local87.anInt617, local1183, local87.aBoolean125, local219);
											}
										}
										local169++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method539(local29, local31, local33, local35);
			}
		} catch (@Pc(1279) RuntimeException local1279) {
			signlink.reporterror("23732, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!RWLOYYVC;)Z")
	private boolean method712(@OriginalArg(1) Class38 arg0) {
		try {
			if (arg0.anIntArray154 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray154.length; local6++) {
				@Pc(14) int local14 = this.method634(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray152[local6];
				if (arg0.anIntArray154[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray154[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray154[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("59614, " + true + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method713(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean222) {
				@Pc(20) Class1_Sub1_Sub2_Sub1 local20;
				@Pc(28) int local28;
				@Pc(36) int local36;
				@Pc(39) byte[] local39;
				@Pc(42) byte[] local42;
				@Pc(44) int local44;
				if (Class1_Sub1_Sub2_Sub2.anIntArray20[17] >= arg0) {
					local20 = Class1_Sub1_Sub2_Sub2.aClass1_Sub1_Sub2_Sub1Array1[17];
					local28 = local20.anInt126 * local20.anInt127 - 1;
					local36 = local20.anInt126 * this.anInt939 * 2;
					local39 = local20.aByteArray2;
					local42 = this.aByteArray21;
					for (local44 = 0; local44 <= local28; local44++) {
						local42[local44] = local39[local44 - local36 & local28];
					}
					local20.aByteArray2 = local42;
					this.aByteArray21 = local39;
					Class1_Sub1_Sub2_Sub2.method87(17);
				}
				if (Class1_Sub1_Sub2_Sub2.anIntArray20[24] >= arg0) {
					local20 = Class1_Sub1_Sub2_Sub2.aClass1_Sub1_Sub2_Sub1Array1[24];
					local28 = local20.anInt126 * local20.anInt127 - 1;
					local36 = local20.anInt126 * this.anInt939 * 2;
					local39 = local20.aByteArray2;
					local42 = this.aByteArray21;
					for (local44 = 0; local44 <= local28; local44++) {
						local42[local44] = local39[local44 - local36 & local28];
					}
					local20.aByteArray2 = local42;
					this.aByteArray21 = local39;
					Class1_Sub1_Sub2_Sub2.method87(24);
				}
				if (Class1_Sub1_Sub2_Sub2.anIntArray20[34] >= arg0) {
					local20 = Class1_Sub1_Sub2_Sub2.aClass1_Sub1_Sub2_Sub1Array1[34];
					local28 = local20.anInt126 * local20.anInt127 - 1;
					local36 = local20.anInt126 * this.anInt939 * 2;
					local39 = local20.aByteArray2;
					local42 = this.aByteArray21;
					for (local44 = 0; local44 <= local28; local44++) {
						local42[local44] = local39[local44 - local36 & local28];
					}
					local20.aByteArray2 = local42;
					this.aByteArray21 = local39;
					Class1_Sub1_Sub2_Sub2.method87(34);
					return;
				}
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("67325, " + arg0 + ", " + 27188 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}
}
