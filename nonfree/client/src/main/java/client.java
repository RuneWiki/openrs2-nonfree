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

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private static int anInt838;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private static int anInt839;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private static int anInt868;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private static int anInt876;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private static int anInt885;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
	private static boolean aBoolean211;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private static int anInt897;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!DEHYKQII;")
	public static Class8_Sub1_Sub1_Sub1_Sub1 aClass8_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private static int anInt928;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private static int anInt929;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private static int anInt935;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private static int anInt941;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private static int anInt954;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private static int anInt963;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
	private static boolean aBoolean227;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private static int anInt1005;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	public static int anInt1014;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private static int anInt1025;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private static int anInt1033;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private static int anInt1056;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private static int[] anIntArray233 = new int[99];

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private static int anInt906;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[[I")
	public static final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private static int anInt937;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "B")
	private static byte aByte42;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private static int anInt1010;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private static int anInt1013;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
	private static boolean aBoolean235;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private static int anInt1037;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
	public static final int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "Ljava/lang/String;")
	private static String aString31;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!LBXRBQZX;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_3;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_4;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_5;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_6;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_7;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_8;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_9;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_10;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_11;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!ZGPIKWUW;")
	private Class8_Sub1_Sub2_Sub4 aClass8_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!ZGPIKWUW;")
	private Class8_Sub1_Sub2_Sub4 aClass8_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!ZGPIKWUW;")
	private Class8_Sub1_Sub2_Sub4 aClass8_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!ZGPIKWUW;")
	private Class8_Sub1_Sub2_Sub4 aClass8_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!HJOZCGZH;")
	private Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3[] aClass8_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_12;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_13;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_14;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_15;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_16;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_17;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_18;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_19;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_20;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_21;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_22;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_23;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Lclient!SXKKBWPU;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!XSRHTFUZ;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!MPMWDRAA;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_24;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_25;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_26;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!VFZXUVTW;")
	private Class40 aClass40_27;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "ok", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "tk", descriptor = "Lclient!MRWOUQJV;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "B")
	private byte aByte31 = -27;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!TQYMAXSO;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_6 = Class8_Sub1_Sub3.method394((byte) 1);

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt826 = -782;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3[] aClass8_Sub1_Sub2_Sub3Array2 = new Class8_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt827 = -1;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray212 = new int[50];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!TQYMAXSO;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_7 = Class8_Sub1_Sub3.method394((byte) 1);

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt830 = 12272;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt831 = -1;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt832 = 1;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt833 = -1;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	private final int[] anIntArray213 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	private int[] anIntArray214 = new int[5];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array4 = new Class8_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!TQYMAXSO;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_8 = new Class8_Sub1_Sub3(new byte[5000], -631);

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[Lclient!GYKYBIID;")
	private Class8_Sub1_Sub1_Sub1_Sub2[] aClass8_Sub1_Sub1_Sub1_Sub2Array1 = new Class8_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray215 = new int[16384];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt841 = -1;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt842 = -1;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[I")
	private int[] anIntArray216 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array5 = new Class8_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt843 = -1;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
	private int[] anIntArray217 = new int[151];

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[[[Lclient!CRZPTUPR;")
	private Class7[][][] aClass7ArrayArrayArray1 = new Class7[4][104][104];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt845 = 1;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt848 = -1;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt850 = -10523;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3[] aClass8_Sub1_Sub2_Sub3Array3 = new Class8_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt856 = 4;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt858 = 2;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt861 = -1;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray218 = new int[4000];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[I")
	private int[] anIntArray219 = new int[4000];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
	private int[] anIntArray220 = new int[5];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
	private int[] anIntArray221 = new int[5];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "B")
	private byte aByte32 = -27;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt864 = -1;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt867 = -1;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Lclient!OMJBPTVL;")
	private Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "B")
	private byte aByte33 = 0;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt870 = 373;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "B")
	private byte aByte34 = 0;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "B")
	private byte aByte35 = -50;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt874 = 2301979;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray224 = new int[151];

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
	private int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt879 = 78;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt884 = 2;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt887 = 50;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
	private int[] anIntArray226 = new int[this.anInt887];

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	private int[] anIntArray227 = new int[this.anInt887];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
	private int[] anIntArray228 = new int[this.anInt887];

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
	private int[] anIntArray229 = new int[this.anInt887];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray230 = new int[this.anInt887];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
	private int[] anIntArray231 = new int[this.anInt887];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray232 = new int[this.anInt887];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt887];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!CRZPTUPR;")
	private Class7 aClass7_10 = new Class7((byte) 1);

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt899 = 2;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "B")
	private byte aByte36 = 7;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array6 = new Class8_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "de", descriptor = "B")
	private byte aByte37 = -34;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
	private int[] anIntArray237 = new int[Class10.anInt162];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt909 = 1;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt916 = -313;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt919 = 128;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt924 = 2;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "B")
	private byte aByte38 = 0;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt925 = 21413;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array7 = new Class8_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt927 = 4;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "B")
	private byte aByte39 = 9;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[I")
	private int[] anIntArray241 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[I")
	private int[] anIntArray242 = new int[5];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!TQYMAXSO;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_9 = Class8_Sub1_Sub3.method394((byte) 1);

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "B")
	private byte aByte40 = 0;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "B")
	private byte aByte41 = 19;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
	private volatile boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array8 = new Class8_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
	private int[] anIntArray243 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt942 = 4;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt943 = 5063219;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray244 = new int[Class10.anInt162];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt945 = 502;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt947 = -1;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	public int[] anIntArray245 = new int[2000];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
	private int[] anIntArray246 = new int[9];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!CRZPTUPR;")
	private Class7 aClass7_11 = new Class7((byte) 1);

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray247 = new int[100];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray248 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt966 = 3;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt969 = -1;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt971 = 680;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt973 = 2048;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt974 = 2047;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[Lclient!DEHYKQII;")
	private Class8_Sub1_Sub1_Sub1_Sub1[] aClass8_Sub1_Sub1_Sub1_Sub1Array1 = new Class8_Sub1_Sub1_Sub1_Sub1[this.anInt973];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray249 = new int[this.anInt973];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray250 = new int[this.anInt973];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[Lclient!TQYMAXSO;")
	private Class8_Sub1_Sub3[] aClass8_Sub1_Sub3Array1 = new Class8_Sub1_Sub3[this.anInt973];

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt977 = -931;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private final int anInt992 = 100;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray251 = new int[100];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
	private int[] anIntArray252 = new int[33];

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt993 = 7759444;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray257 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
	private int[] anIntArray258 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[Lclient!UEKAQTXH;")
	public Class39[] aClass39Array1 = new Class39[5];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
	private int[] anIntArray259 = new int[Class10.anInt162];

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1000 = -1;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1011 = -1;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1012 = -1;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[I")
	private int[] anIntArray260 = new int[7];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "B")
	private byte aByte43 = 123;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1016 = 4;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray265 = new int[50];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	private int[] anIntArray266 = new int[100];

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array9 = new Class8_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray267 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "B")
	private byte aByte44 = -118;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "[Lclient!UDXVXGJJ;")
	private Class38[] aClass38Array1 = new Class38[4];

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "[I")
	private int[] anIntArray268 = new int[500];

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	private int[] anIntArray269 = new int[500];

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[I")
	private int[] anIntArray270 = new int[500];

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray271 = new int[500];

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1029 = 7320;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1032 = -31502;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
	private int[] anIntArray272 = new int[50];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1035 = 1;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Z")
	private volatile boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "[I")
	private int[] anIntArray275 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "[Lclient!VCTXURSE;")
	private Class8_Sub1_Sub2_Sub3[] aClass8_Sub1_Sub2_Sub3Array5 = new Class8_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
	private int[] anIntArray276 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1049 = 373;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1055 = -1;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1057 = 42179;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "pk", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!client", name = "qk", descriptor = "[Lclient!TPUDHOHI;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array10 = new Class8_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "rk", descriptor = "I")
	private int anInt1060 = 3353893;

	@OriginalMember(owner = "client!client", name = "sk", descriptor = "Z")
	private volatile boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "uk", descriptor = "Lclient!CRZPTUPR;")
	private Class7 aClass7_12 = new Class7((byte) 1);

	static {
		@Pc(4) int local4 = 0;
		@Pc(6) int local6;
		for (local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray233[local6] = local4 / 4;
		}
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt906 = 43127;
		anIntArrayArray24 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray240 = new int[32];
		local4 = 2;
		for (local6 = 0; local6 < 32; local6++) {
			anIntArray240[local6] = local4 - 1;
			local4 += local4;
		}
		anInt937 = -975;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aByte42 = 4;
		anInt1010 = 166;
		anInt1013 = 10;
		aBoolean235 = true;
		anInt1037 = 216;
		anIntArray274 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aString31 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 363);
			if (arg0.length == 5) {
				anInt1013 = Integer.parseInt(arg0[0]);
				anInt1014 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method689(216);
				} else if (arg0[2].equals("highmem")) {
					method674(anInt937);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean235 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean235 = true;
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private static String method637(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(19) int local19 = local4.length() - 3; local19 > 0; local19 -= 3) {
				local4 = local4.substring(0, local19) + "," + local4.substring(local19);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("21956, " + -9 + ", " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(13) int local13 = arg1 - arg0;
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
			signlink.reporterror("91990, " + arg0 + ", " + arg1 + ", " + -27024 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = true;
			if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("47166, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private static void method674(@OriginalArg(0) int arg0) {
		try {
			Class21.aBoolean83 = false;
			Class8_Sub1_Sub2_Sub1.aBoolean128 = false;
			if (arg0 < 0) {
				aBoolean236 = false;
				Class2.aBoolean3 = false;
				Class42.aBoolean175 = false;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("35263, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private static void method689(@OriginalArg(0) int arg0) {
		try {
			Class21.aBoolean83 = true;
			Class8_Sub1_Sub2_Sub1.aBoolean128 = true;
			aBoolean236 = true;
			Class2.aBoolean3 = true;
			@Pc(11) boolean local11 = false;
			Class42.aBoolean175 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("12546, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method589() {
		try {
			@Pc(8) int local8;
			if (this.anInt1058 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1058 > 768) {
						this.anIntArray261[local8] = this.method611(this.anIntArray263[local8], this.anIntArray262[local8], 1024 - this.anInt1058);
					} else if (this.anInt1058 > 256) {
						this.anIntArray261[local8] = this.anIntArray263[local8];
					} else {
						this.anIntArray261[local8] = this.method611(this.anIntArray262[local8], this.anIntArray263[local8], 256 - this.anInt1058);
					}
				}
			} else if (this.anInt1059 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1059 > 768) {
						this.anIntArray261[local8] = this.method611(this.anIntArray264[local8], this.anIntArray262[local8], 1024 - this.anInt1059);
					} else if (this.anInt1059 > 256) {
						this.anIntArray261[local8] = this.anIntArray264[local8];
					} else {
						this.anIntArray261[local8] = this.method611(this.anIntArray262[local8], this.anIntArray264[local8], 256 - this.anInt1059);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray261[local8] = this.anIntArray262[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass40_6.anIntArray179[local8] = this.aClass8_Sub1_Sub2_Sub2_12.anIntArray174[local8];
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
				local198 = this.anIntArray225[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray222[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray261[local220];
						local239 = this.aClass40_6.anIntArray179[local183];
						this.aClass40_6.anIntArray179[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass40_6.method497(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass40_7.anIntArray179[local198] = this.aClass8_Sub1_Sub2_Sub2_13.anIntArray174[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray225[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray222[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(372) int local372 = 256 - local228;
						local228 = this.anIntArray261[local228];
						@Pc(383) int local383 = this.aClass40_7.anIntArray179[local183];
						this.aClass40_7.anIntArray179[local183++] = ((local228 & 0xFF00FF) * local239 + (local383 & 0xFF00FF) * local372 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local383 & 0xFF00) * local372 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass40_7.method497(0, 637, super.aGraphics2);
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("81700, " + false + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TQYMAXSO;II)V")
	private void method590(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt976; local12++) {
				@Pc(19) int local19 = this.anIntArray250[local12];
				@Pc(24) Class8_Sub1_Sub1_Sub1_Sub2 local24 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local19];
				@Pc(27) int local27 = arg0.method406();
				if ((local27 & 0x4) != 0) {
					local24.anInt188 = arg0.method435(this.anInt866);
					local24.anInt189 = arg0.method435(this.anInt866);
				}
				@Pc(56) int local56;
				if ((local27 & 0x80) != 0) {
					local24.anInt220 = arg0.method434((byte) 7);
					local56 = arg0.method440();
					local24.anInt224 = local56 >> 16;
					local24.anInt223 = anInt917 + (local56 & 0xFFFF);
					local24.anInt221 = 0;
					local24.anInt222 = 0;
					if (local24.anInt223 > anInt917) {
						local24.anInt221 = -1;
					}
					if (local24.anInt220 == 65535) {
						local24.anInt220 = -1;
					}
				}
				@Pc(105) int local105;
				if ((local27 & 0x1) != 0) {
					local56 = arg0.method436(this.aByte41);
					if (local56 == 65535) {
						local56 = -1;
					}
					local105 = arg0.method406();
					if (local56 == local24.anInt215 && local56 != -1) {
						@Pc(117) int local117 = Class20.aClass20Array1[local56].anInt333;
						if (local117 == 1) {
							local24.anInt216 = 0;
							local24.anInt217 = 0;
							local24.anInt218 = local105;
							local24.anInt219 = 0;
						}
						if (local117 == 2) {
							local24.anInt219 = 0;
						}
					} else if (local56 == -1 || local24.anInt215 == -1 || Class20.aClass20Array1[local56].anInt327 >= Class20.aClass20Array1[local24.anInt215].anInt327) {
						local24.anInt215 = local56;
						local24.anInt216 = 0;
						local24.anInt217 = 0;
						local24.anInt218 = local105;
						local24.anInt219 = 0;
						local24.anInt203 = local24.anInt214;
					}
				}
				if ((local27 & 0x20) != 0) {
					local24.anInt204 = arg0.method435(this.anInt866);
					if (local24.anInt204 == 65535) {
						local24.anInt204 = -1;
					}
				}
				if ((local27 & 0x8) != 0) {
					local24.aString5 = arg0.method413();
					local24.anInt186 = 100;
				}
				if ((local27 & 0x10) != 0) {
					local24.aClass45_2 = Class45.method520(arg0.method408());
					local24.anInt233 = local24.aClass45_2.aByte21;
					local24.anInt205 = local24.aClass45_2.anInt719;
					local24.anInt225 = local24.aClass45_2.anInt724;
					local24.anInt226 = local24.aClass45_2.anInt713;
					local24.anInt227 = local24.aClass45_2.anInt730;
					local24.anInt228 = local24.aClass45_2.anInt720;
					local24.anInt192 = local24.aClass45_2.anInt709;
				}
				if ((local27 & 0x40) != 0) {
					local56 = arg0.method425();
					local105 = arg0.method406();
					local24.method88(local56, anInt917, 155, local105);
					local24.anInt206 = anInt917 + 300;
					local24.anInt207 = arg0.method406();
					local24.anInt208 = arg0.method427();
				}
				if ((local27 & 0x2) != 0) {
					local56 = arg0.method427();
					local105 = arg0.method427();
					local24.method88(local56, anInt917, 155, local105);
					local24.anInt206 = anInt917 + 300;
					local24.anInt207 = arg0.method425();
					local24.anInt208 = arg0.method426();
				}
			}
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("71872, " + arg0 + ", " + arg1 + ", " + -889 + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DEHYKQII;IZII)V")
	private void method591(@OriginalArg(0) Class8_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass8_Sub1_Sub1_Sub1_Sub1_1 && this.anInt994 < 400) {
				@Pc(42) String local42;
				if (arg0.anInt140 == 0) {
					local42 = arg0.aString4 + method657(arg0.anInt143, aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt143) + " (level-" + arg0.anInt143 + ")";
				} else {
					local42 = arg0.aString4 + " (skill-" + arg0.anInt140 + ")";
				}
				@Pc(172) int local172;
				if (this.anInt978 == 1) {
					this.aStringArray13[this.anInt994] = "Use " + this.aString24 + " with @whi@" + local42;
					this.anIntArray270[this.anInt994] = 493;
					this.anIntArray271[this.anInt994] = arg1;
					this.anIntArray268[this.anInt994] = arg2;
					this.anIntArray269[this.anInt994] = arg3;
					this.anInt994++;
				} else if (this.anInt982 != 1) {
					for (local172 = 4; local172 >= 0; local172--) {
						if (this.aStringArray9[local172] != null) {
							this.aStringArray13[this.anInt994] = this.aStringArray9[local172] + " @whi@" + local42;
							@Pc(199) short local199 = 0;
							if (this.aStringArray9[local172].equalsIgnoreCase("attack")) {
								if (arg0.anInt143 > aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt143) {
									local199 = 2000;
								}
								if (aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt139 != 0 && arg0.anInt139 != 0) {
									if (aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt139 == arg0.anInt139) {
										local199 = 2000;
									} else {
										local199 = 0;
									}
								}
							} else if (this.aBooleanArray11[local172]) {
								local199 = 2000;
							}
							if (local172 == 0) {
								this.anIntArray270[this.anInt994] = local199 + 753;
							}
							if (local172 == 1) {
								this.anIntArray270[this.anInt994] = local199 + 148;
							}
							if (local172 == 2) {
								this.anIntArray270[this.anInt994] = local199 + 914;
							}
							if (local172 == 3) {
								this.anIntArray270[this.anInt994] = local199 + 772;
							}
							if (local172 == 4) {
								this.anIntArray270[this.anInt994] = local199 + 963;
							}
							this.anIntArray271[this.anInt994] = arg1;
							this.anIntArray268[this.anInt994] = arg2;
							this.anIntArray269[this.anInt994] = arg3;
							this.anInt994++;
						}
					}
				} else if ((this.anInt984 & 0x8) == 8) {
					this.aStringArray13[this.anInt994] = this.aString25 + " @whi@" + local42;
					this.anIntArray270[this.anInt994] = 452;
					this.anIntArray271[this.anInt994] = arg1;
					this.anIntArray268[this.anInt994] = arg2;
					this.anIntArray269[this.anInt994] = arg3;
					this.anInt994++;
				}
				for (local172 = 0; local172 < this.anInt994; local172++) {
					if (this.anIntArray270[local172] == 134) {
						this.aStringArray13[local172] = "Walk here @whi@" + local42;
						return;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("30825, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1013 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1014 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method689(216);
		} else {
			method674(anInt937);
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean235 = false;
		} else {
			aBoolean235 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method592() {
		try {
			@Pc(10) int local10 = 5;
			this.anIntArray246[8] = 0;
			@Pc(17) int local17 = 0;
			while (this.anIntArray246[8] == 0) {
				@Pc(21) String local21 = "Unknown problem";
				this.method588(20, "Connecting to web server");
				try {
					@Pc(43) DataInputStream local43 = this.method724("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 363);
					@Pc(50) Class8_Sub1_Sub3 local50 = new Class8_Sub1_Sub3(new byte[40], -631);
					local43.readFully(local50.aByteArray13, 0, 40);
					local43.close();
					for (@Pc(60) int local60 = 0; local60 < 9; local60++) {
						this.anIntArray246[local60] = local50.method411();
					}
					@Pc(75) int local75 = local50.method411();
					@Pc(77) int local77 = 1234;
					for (@Pc(79) int local79 = 0; local79 < 9; local79++) {
						local77 = (local77 << 1) + this.anIntArray246[local79];
					}
					if (local75 != local77) {
						local21 = "checksum problem";
						this.anIntArray246[8] = 0;
					}
				} catch (@Pc(106) EOFException local106) {
					local21 = "EOF problem";
					this.anIntArray246[8] = 0;
				} catch (@Pc(115) IOException local115) {
					local21 = "connection problem";
					this.anIntArray246[8] = 0;
				} catch (@Pc(124) Exception local124) {
					local21 = "logic problem";
					this.anIntArray246[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray246[8] == 0) {
					local17++;
					for (@Pc(142) int local142 = local10; local142 > 0; local142--) {
						if (local17 >= 10) {
							this.method588(10, "Game updated - please reload page");
							local142 = 10;
						} else {
							this.method588(10, local21 + " - Will retry in " + local142 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(176) Exception local176) {
						}
					}
					local10 *= 2;
					if (local10 > 60) {
						local10 = 60;
					}
					this.aBoolean242 = !this.aBoolean242;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("38370, " + 0 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method593() {
		try {
			signlink.aBoolean248 = false;
			signlink.anInt1068 = 0;
			signlink.midi = "stop";
			this.anInt900 += 0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("16628, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Z")
	private boolean method594() {
		try {
			if (this.aClass19_1 == null) {
				return false;
			}
			@Pc(2463) String local2463;
			@Pc(361) int local361;
			try {
				@Pc(16) int local16 = this.aClass19_1.method165();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt901 == -1) {
					this.aClass19_1.method166(this.aClass8_Sub1_Sub3_9.aByteArray13, 0, 1);
					this.anInt901 = this.aClass8_Sub1_Sub3_9.aByteArray13[0] & 0xFF;
					if (this.aClass22_2 != null) {
						this.anInt901 = this.anInt901 - this.aClass22_2.method229() & 0xFF;
					}
					this.anInt900 = Class43.anIntArray188[this.anInt901];
					local16--;
				}
				if (this.anInt900 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass19_1.method166(this.aClass8_Sub1_Sub3_9.aByteArray13, 0, 1);
					this.anInt900 = this.aClass8_Sub1_Sub3_9.aByteArray13[0] & 0xFF;
					local16--;
				}
				if (this.anInt900 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass19_1.method166(this.aClass8_Sub1_Sub3_9.aByteArray13, 0, 2);
					this.aClass8_Sub1_Sub3_9.anInt620 = 0;
					this.anInt900 = this.aClass8_Sub1_Sub3_9.method408();
					local16 -= 2;
				}
				if (local16 < this.anInt900) {
					return false;
				}
				this.aClass8_Sub1_Sub3_9.anInt620 = 0;
				this.aClass19_1.method166(this.aClass8_Sub1_Sub3_9.aByteArray13, 0, this.anInt900);
				this.anInt902 = 0;
				this.anInt882 = this.anInt881;
				this.anInt881 = this.anInt880;
				this.anInt880 = this.anInt901;
				if (this.anInt901 == 163) {
					this.method612((byte) 6);
					this.anInt901 = -1;
					return false;
				}
				if (this.anInt901 == 56) {
					this.method635(this.anInt900, this.aClass8_Sub1_Sub3_9);
					this.aBoolean207 = false;
					this.anInt901 = -1;
					return true;
				}
				@Pc(196) int local196;
				@Pc(200) int local200;
				@Pc(204) int local204;
				@Pc(225) int local225;
				@Pc(202) boolean local202;
				@Pc(271) String local271;
				@Pc(192) long local192;
				if (this.anInt901 == 183) {
					local192 = this.aClass8_Sub1_Sub3_9.method412();
					local196 = this.aClass8_Sub1_Sub3_9.method411();
					local200 = this.aClass8_Sub1_Sub3_9.method406();
					local202 = false;
					for (local204 = 0; local204 < 100; local204++) {
						if (this.anIntArray251[local204] == local196) {
							local202 = true;
							break;
						}
					}
					if (local200 <= 1) {
						for (local225 = 0; local225 < this.anInt855; local225++) {
							if (this.aLongArray4[local225] == local192) {
								local202 = true;
								break;
							}
						}
					}
					if (!local202 && this.anInt918 == 0) {
						try {
							this.anIntArray251[this.anInt997] = local196;
							this.anInt997 = (this.anInt997 + 1) % 100;
							local271 = Class6.method26(this.anInt900 - 13, this.aClass8_Sub1_Sub3_9);
							if (local200 != 3) {
								local271 = Class27.method277(local271, this.aByte40);
							}
							if (local200 == 2 || local200 == 3) {
								this.method688("@cr2@" + Class28.method309(Class28.method306(local192)), local271, 7);
							} else if (local200 == 1) {
								this.method688("@cr1@" + Class28.method309(Class28.method306(local192)), local271, 7);
							} else {
								this.method688(Class28.method309(Class28.method306(local192)), local271, 3);
							}
						} catch (@Pc(336) Exception local336) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt901 = -1;
					return true;
				}
				@Pc(356) int local356;
				if (this.anInt901 == 24) {
					this.aBoolean215 = true;
					local356 = this.aClass8_Sub1_Sub3_9.method427();
					local361 = this.aClass8_Sub1_Sub3_9.method442();
					local196 = this.aClass8_Sub1_Sub3_9.method406();
					this.anIntArray244[local356] = local361;
					this.anIntArray259[local356] = local196;
					this.anIntArray237[local356] = 1;
					for (local200 = 0; local200 < 98; local200++) {
						if (local361 >= anIntArray233[local200]) {
							this.anIntArray237[local356] = local200 + 2;
						}
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 245) {
					local356 = this.aClass8_Sub1_Sub3_9.method437(this.aBoolean209);
					if (local356 >= 0) {
						this.method697(local356);
					}
					if (local356 != this.anInt831) {
						this.method638(this.anInt831);
						this.anInt831 = local356;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 209) {
					if (this.anInt966 == 12) {
						this.aBoolean215 = true;
					}
					this.anInt1045 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 150) {
					this.anInt1047 = this.aClass8_Sub1_Sub3_9.method406();
					this.aBoolean215 = true;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 51) {
					this.anInt828 = this.aClass8_Sub1_Sub3_9.method426();
					this.anInt829 = this.aClass8_Sub1_Sub3_9.method426();
					while (this.aClass8_Sub1_Sub3_9.anInt620 < this.anInt900) {
						local356 = this.aClass8_Sub1_Sub3_9.method406();
						this.method669(local356, this.aClass8_Sub1_Sub3_9);
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 43) {
					local356 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					local361 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					this.method697(local361);
					if (local356 != -1) {
						this.method697(local356);
					}
					if (this.anInt827 != -1) {
						this.method638(this.anInt827);
						this.anInt827 = -1;
					}
					if (this.anInt843 != -1) {
						this.method638(this.anInt843);
						this.anInt843 = -1;
					}
					if (this.anInt833 != -1) {
						this.method638(this.anInt833);
						this.anInt833 = -1;
					}
					if (this.anInt947 != local361) {
						this.method638(this.anInt947);
						this.anInt947 = local361;
					}
					if (this.anInt1012 != local361) {
						this.method638(this.anInt1012);
						this.anInt1012 = local356;
					}
					this.anInt985 = 0;
					this.aBoolean237 = false;
					this.anInt901 = -1;
					return true;
				}
				@Pc(683) int local683;
				if (this.anInt901 == 242) {
					this.aBoolean200 = true;
					this.anInt910 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt911 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt912 = this.aClass8_Sub1_Sub3_9.method408();
					this.anInt913 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt914 = this.aClass8_Sub1_Sub3_9.method406();
					if (this.anInt914 >= 100) {
						local356 = this.anInt910 * 128 + 64;
						local361 = this.anInt911 * 128 + 64;
						local196 = this.method666(local361, local356, this.anInt891) - this.anInt912;
						local200 = local356 - this.anInt949;
						local683 = local196 - this.anInt950;
						local204 = local361 - this.anInt951;
						local225 = (int) Math.sqrt((double) (local200 * local200 + local204 * local204));
						this.anInt952 = (int) (Math.atan2((double) local683, (double) local225) * 325.949D) & 0x7FF;
						this.anInt953 = (int) (Math.atan2((double) local200, (double) local204) * -325.949D) & 0x7FF;
						if (this.anInt952 < 128) {
							this.anInt952 = 128;
						}
						if (this.anInt952 > 383) {
							this.anInt952 = 383;
						}
					}
					this.anInt901 = -1;
					return true;
				}
				@Pc(754) String local754;
				if (this.anInt901 == 87) {
					local356 = this.aClass8_Sub1_Sub3_9.method406();
					local754 = this.aClass8_Sub1_Sub3_9.method413();
					local196 = this.aClass8_Sub1_Sub3_9.method425();
					if (local196 >= 1 && local196 <= 5) {
						if (local754.equalsIgnoreCase("null")) {
							local754 = null;
						}
						this.aStringArray9[local196 - 1] = local754;
						this.aBooleanArray11[local196 - 1] = local356 == 0;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 110) {
					this.aBoolean240 = false;
					this.anInt985 = 1;
					this.aString22 = "";
					this.aBoolean206 = true;
					this.anInt901 = -1;
					return true;
				}
				@Pc(971) int local971;
				if (this.anInt901 == 18) {
					local192 = this.aClass8_Sub1_Sub3_9.method412();
					local196 = this.aClass8_Sub1_Sub3_9.method406();
					@Pc(834) String local834 = Class28.method309(Class28.method306(local192));
					for (local683 = 0; local683 < this.anInt1046; local683++) {
						if (local192 == this.aLongArray3[local683]) {
							if (this.anIntArray216[local683] != local196) {
								this.anIntArray216[local683] = local196;
								this.aBoolean215 = true;
								if (local196 > 0) {
									this.method688("", local834 + " has logged in.", 5);
								}
								if (local196 == 0) {
									this.method688("", local834 + " has logged out.", 5);
								}
							}
							local834 = null;
							break;
						}
					}
					if (local834 != null && this.anInt1046 < 200) {
						this.aLongArray3[this.anInt1046] = local192;
						this.aStringArray10[this.anInt1046] = local834;
						this.anIntArray216[this.anInt1046] = local196;
						this.anInt1046++;
						this.aBoolean215 = true;
					}
					@Pc(932) boolean local932 = false;
					while (!local932) {
						local932 = true;
						for (local225 = 0; local225 < this.anInt1046 - 1; local225++) {
							if (this.anIntArray216[local225] != anInt1013 && this.anIntArray216[local225 + 1] == anInt1013 || this.anIntArray216[local225] == 0 && this.anIntArray216[local225 + 1] != 0) {
								local971 = this.anIntArray216[local225];
								this.anIntArray216[local225] = this.anIntArray216[local225 + 1];
								this.anIntArray216[local225 + 1] = local971;
								@Pc(993) String local993 = this.aStringArray10[local225];
								this.aStringArray10[local225] = this.aStringArray10[local225 + 1];
								this.aStringArray10[local225 + 1] = local993;
								@Pc(1015) long local1015 = this.aLongArray3[local225];
								this.aLongArray3[local225] = this.aLongArray3[local225 + 1];
								this.aLongArray3[local225 + 1] = local1015;
								this.aBoolean215 = true;
								local932 = false;
							}
						}
					}
					this.anInt901 = -1;
					return true;
				}
				@Pc(1070) Class24 local1070;
				if (this.anInt901 == 138) {
					local356 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					local361 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					local1070 = Class24.method259(local356);
					if (local1070 != null && local1070.anInt425 == 0) {
						if (local361 < 0) {
							local361 = 0;
						}
						if (local361 > local1070.anInt450 - local1070.anInt440) {
							local361 = local1070.anInt450 - local1070.anInt440;
						}
						local1070.anInt451 = local361;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 37) {
					local356 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					local361 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					local196 = this.aClass8_Sub1_Sub3_9.method408();
					if (local196 == 65535) {
						Class24.method259(local361).anInt426 = 0;
						this.anInt901 = -1;
						return true;
					}
					@Pc(1134) Class46 local1134 = Class46.method532(local196);
					Class24.method259(local361).anInt426 = 4;
					Class24.method259(local361).anInt427 = local196;
					Class24.method259(local361).anInt430 = local1134.anInt764;
					Class24.method259(local361).anInt431 = local1134.anInt750;
					Class24.method259(local361).anInt429 = local1134.anInt732 * 100 / local356;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 169) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local361 = this.aClass8_Sub1_Sub3_9.method406();
					local196 = this.aClass8_Sub1_Sub3_9.method408();
					if (local196 == 65535) {
						if (this.anInt844 < 50) {
							this.anIntArray272[this.anInt844] = (short) local356;
							this.anIntArray265[this.anInt844] = local361;
							this.anIntArray212[this.anInt844] = 0;
							this.anInt844++;
						}
					} else if (this.aBoolean233 && !aBoolean236 && this.anInt844 < 50) {
						this.anIntArray272[this.anInt844] = local356;
						this.anIntArray265[this.anInt844] = local361;
						this.anIntArray212[this.anInt844] = local196 + Class41.anIntArray180[local356];
						this.anInt844++;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 7) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local361 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					local196 = local361 >> 10 & 0x1F;
					local200 = local361 >> 5 & 0x1F;
					local683 = local361 & 0x1F;
					Class24.method259(local356).anInt458 = (local196 << 19) + (local200 << 11) + (local683 << 3);
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 250) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local361 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					if (this.anInt833 != -1) {
						this.method638(this.anInt833);
						this.anInt833 = -1;
						this.aBoolean206 = true;
					}
					if (this.anInt947 != -1) {
						this.method638(this.anInt947);
						this.anInt947 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt1012 != -1) {
						this.method638(this.anInt1012);
						this.anInt1012 = -1;
					}
					if (this.anInt827 != local356) {
						this.method638(this.anInt827);
						this.anInt827 = local356;
					}
					if (this.anInt843 != local361) {
						this.method638(this.anInt843);
						this.anInt843 = local361;
					}
					if (this.anInt985 != 0) {
						this.anInt985 = 0;
						this.aBoolean206 = true;
					}
					this.aBoolean215 = true;
					this.aBoolean231 = true;
					this.aBoolean237 = false;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 237) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local361 = this.aClass8_Sub1_Sub3_9.method411();
					this.anIntArray243[local356] = local361;
					if (this.anIntArray245[local356] != local361) {
						this.anIntArray245[local356] = local361;
						this.method692(local356);
						this.aBoolean215 = true;
						if (this.anInt1055 != -1) {
							this.aBoolean206 = true;
						}
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 21) {
					@Pc(1466) byte local1466 = this.aClass8_Sub1_Sub3_9.method430();
					local361 = this.aClass8_Sub1_Sub3_9.method408();
					this.anIntArray243[local361] = local1466;
					if (this.anIntArray245[local361] != local1466) {
						this.anIntArray245[local361] = local1466;
						this.method692(local361);
						this.aBoolean215 = true;
						if (this.anInt1055 != -1) {
							this.aBoolean206 = true;
						}
					}
					this.anInt901 = -1;
					return true;
				}
				@Pc(1519) Class24 local1519;
				if (this.anInt901 == 71) {
					this.aBoolean215 = true;
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local1519 = Class24.method259(local356);
					local196 = this.aClass8_Sub1_Sub3_9.method408();
					for (local200 = 0; local200 < local196; local200++) {
						local683 = this.aClass8_Sub1_Sub3_9.method426();
						if (local683 == 255) {
							local683 = this.aClass8_Sub1_Sub3_9.method441();
						}
						local1519.anIntArray137[local200] = this.aClass8_Sub1_Sub3_9.method408();
						local1519.anIntArray142[local200] = local683;
					}
					for (local683 = local196; local683 < local1519.anIntArray137.length; local683++) {
						local1519.anIntArray137[local683] = 0;
						local1519.anIntArray142[local683] = 0;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 26) {
					this.anInt932 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					this.aClass8_Sub1_Sub3_9.method425();
					this.anInt849 = this.aClass8_Sub1_Sub3_9.method408();
					this.anInt872 = this.aClass8_Sub1_Sub3_9.method441();
					this.anInt890 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					this.anInt893 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					this.anInt1028 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					this.anInt944 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					this.anInt863 = this.aClass8_Sub1_Sub3_9.method408();
					this.anInt862 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					signlink.dnslookup(Class28.method308(this.anInt872));
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 146) {
					this.anInt966 = this.aClass8_Sub1_Sub3_9.method427();
					this.aBoolean215 = true;
					this.aBoolean231 = true;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 33) {
					local356 = this.aClass8_Sub1_Sub3_9.method406();
					local361 = this.aClass8_Sub1_Sub3_9.method406();
					local196 = this.aClass8_Sub1_Sub3_9.method406();
					local200 = this.aClass8_Sub1_Sub3_9.method406();
					this.aBooleanArray12[local356] = true;
					this.anIntArray273[local356] = local361;
					this.anIntArray242[local356] = local196;
					this.anIntArray221[local356] = local200;
					this.anIntArray214[local356] = 0;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 46) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					this.method697(local356);
					if (this.anInt833 != -1) {
						this.method638(this.anInt833);
						this.anInt833 = -1;
						this.aBoolean206 = true;
					}
					if (this.anInt947 != -1) {
						this.method638(this.anInt947);
						this.anInt947 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt1012 != -1) {
						this.method638(this.anInt1012);
						this.anInt1012 = -1;
					}
					if (this.anInt827 != -1) {
						this.method638(this.anInt827);
						this.anInt827 = -1;
					}
					if (this.anInt843 != local356) {
						this.method638(this.anInt843);
						this.anInt843 = local356;
					}
					if (this.anInt985 != 0) {
						this.anInt985 = 0;
						this.aBoolean206 = true;
					}
					this.aBoolean215 = true;
					this.aBoolean231 = true;
					this.aBoolean237 = false;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 90) {
					local356 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					this.method697(local356);
					if (this.anInt843 != -1) {
						this.method638(this.anInt843);
						this.anInt843 = -1;
						this.aBoolean215 = true;
						this.aBoolean231 = true;
					}
					if (this.anInt833 != -1) {
						this.method638(this.anInt833);
						this.anInt833 = -1;
						this.aBoolean206 = true;
					}
					if (this.anInt947 != -1) {
						this.method638(this.anInt947);
						this.anInt947 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt1012 != -1) {
						this.method638(this.anInt1012);
						this.anInt1012 = -1;
					}
					if (this.anInt827 != local356) {
						this.method638(this.anInt827);
						this.anInt827 = local356;
					}
					if (this.anInt985 != 0) {
						this.anInt985 = 0;
						this.aBoolean206 = true;
					}
					this.aBoolean237 = false;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 66) {
					this.anInt855 = this.anInt900 / 8;
					for (local356 = 0; local356 < this.anInt855; local356++) {
						this.aLongArray4[local356] = this.aClass8_Sub1_Sub3_9.method412();
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 104) {
					this.anInt829 = this.aClass8_Sub1_Sub3_9.method425();
					this.anInt828 = this.aClass8_Sub1_Sub3_9.method426();
					for (local356 = this.anInt828; local356 < this.anInt828 + 8; local356++) {
						for (local361 = this.anInt829; local361 < this.anInt829 + 8; local361++) {
							if (this.aClass7ArrayArrayArray1[this.anInt891][local356][local361] != null) {
								this.aClass7ArrayArrayArray1[this.anInt891][local356][local361] = null;
								this.method656(local356, local361);
							}
						}
					}
					for (@Pc(2037) Class8_Sub3 local2037 = (Class8_Sub3) this.aClass7_11.method32(); local2037 != null; local2037 = (Class8_Sub3) this.aClass7_11.method34()) {
						if (local2037.anInt318 >= this.anInt828 && local2037.anInt318 < this.anInt828 + 8 && local2037.anInt319 >= this.anInt829 && local2037.anInt319 < this.anInt829 + 8 && local2037.anInt316 == this.anInt891) {
							local2037.anInt312 = 0;
						}
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 94) {
					for (local356 = 0; local356 < this.anIntArray245.length; local356++) {
						if (this.anIntArray245[local356] != this.anIntArray243[local356]) {
							this.anIntArray245[local356] = this.anIntArray243[local356];
							this.method692(local356);
							this.aBoolean215 = true;
						}
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 123) {
					local356 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					@Pc(2147) boolean local2147 = this.aClass8_Sub1_Sub3_9.method427() == 1;
					Class24.method259(local356).aBoolean105 = local2147;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 177) {
					this.anInt864 = this.aClass8_Sub1_Sub3_9.method406();
					if (this.anInt864 == this.anInt966) {
						if (this.anInt864 == 3) {
							this.anInt966 = 1;
						} else {
							this.anInt966 = 3;
						}
						this.aBoolean215 = true;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 59) {
					this.aBoolean200 = false;
					for (local356 = 0; local356 < 5; local356++) {
						this.aBooleanArray12[local356] = false;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 225) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local361 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					Class24.method259(local361).anInt426 = 2;
					Class24.method259(local361).anInt427 = local356;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 189) {
					local356 = this.aClass8_Sub1_Sub3_9.method438();
					if (local356 != this.anInt1055) {
						this.method638(this.anInt1055);
						this.anInt1055 = local356;
					}
					this.aBoolean206 = true;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 188) {
					this.anInt828 = this.aClass8_Sub1_Sub3_9.method425();
					this.anInt829 = this.aClass8_Sub1_Sub3_9.method427();
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 25) {
					local356 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					local361 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					Class24.method259(local361).anInt426 = 1;
					Class24.method259(local361).anInt427 = local356;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 100) {
					this.aBoolean215 = true;
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local1519 = Class24.method259(local356);
					while (this.aClass8_Sub1_Sub3_9.anInt620 < this.anInt900) {
						local196 = this.aClass8_Sub1_Sub3_9.method420();
						local200 = this.aClass8_Sub1_Sub3_9.method408();
						local683 = this.aClass8_Sub1_Sub3_9.method406();
						if (local683 == 255) {
							local683 = this.aClass8_Sub1_Sub3_9.method411();
						}
						if (local196 >= 0 && local196 < local1519.anIntArray137.length) {
							local1519.anIntArray137[local196] = local200;
							local1519.anIntArray142[local196] = local683;
						}
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 190) {
					this.aBoolean200 = true;
					this.anInt1040 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt1041 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt1042 = this.aClass8_Sub1_Sub3_9.method408();
					this.anInt1043 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt1044 = this.aClass8_Sub1_Sub3_9.method406();
					if (this.anInt1044 >= 100) {
						this.anInt949 = this.anInt1040 * 128 + 64;
						this.anInt951 = this.anInt1041 * 128 + 64;
						this.anInt950 = this.method666(this.anInt951, this.anInt949, this.anInt891) - this.anInt1042;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 252) {
					local2463 = this.aClass8_Sub1_Sub3_9.method413();
					@Pc(2477) long local2477;
					if (local2463.endsWith(":tradereq:")) {
						local754 = local2463.substring(0, local2463.indexOf(":"));
						local2477 = Class28.method305(local754);
						local202 = false;
						for (local204 = 0; local204 < this.anInt855; local204++) {
							if (this.aLongArray4[local204] == local2477) {
								local202 = true;
								break;
							}
						}
						if (!local202 && this.anInt918 == 0) {
							this.method688(local754, "wishes to trade with you.", 4);
						}
					} else if (local2463.endsWith(":duelreq:")) {
						local754 = local2463.substring(0, local2463.indexOf(":"));
						local2477 = Class28.method305(local754);
						local202 = false;
						for (local204 = 0; local204 < this.anInt855; local204++) {
							if (this.aLongArray4[local204] == local2477) {
								local202 = true;
								break;
							}
						}
						if (!local202 && this.anInt918 == 0) {
							this.method688(local754, "wishes to duel with you.", 8);
						}
					} else if (local2463.endsWith(":chalreq:")) {
						local754 = local2463.substring(0, local2463.indexOf(":"));
						local2477 = Class28.method305(local754);
						local202 = false;
						for (local204 = 0; local204 < this.anInt855; local204++) {
							if (this.aLongArray4[local204] == local2477) {
								local202 = true;
								break;
							}
						}
						if (!local202 && this.anInt918 == 0) {
							local271 = local2463.substring(local2463.indexOf(":") + 1, local2463.length() - 9);
							this.method688(local754, local271, 8);
						}
					} else {
						this.method688("", local2463, 0);
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 8) {
					local356 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					local361 = this.aClass8_Sub1_Sub3_9.method438();
					local1070 = Class24.method259(local356);
					if (local1070.anInt448 != local361 || local361 == -1) {
						local1070.anInt448 = local361;
						local1070.anInt438 = 0;
						local1070.anInt434 = 0;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 127) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local754 = this.aClass8_Sub1_Sub3_9.method413();
					Class24.method259(local356).aString12 = local754;
					@Pc(2696) int local2696 = this.anIntArray275[this.anInt966];
					if (Class24.method259(local356).anInt445 == local2696) {
						this.aBoolean215 = true;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 93) {
					if (this.anInt843 != -1) {
						this.method638(this.anInt843);
						this.anInt843 = -1;
						this.aBoolean215 = true;
						this.aBoolean231 = true;
					}
					if (this.anInt833 != -1) {
						this.method638(this.anInt833);
						this.anInt833 = -1;
						this.aBoolean206 = true;
					}
					if (this.anInt947 != -1) {
						this.method638(this.anInt947);
						this.anInt947 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt1012 != -1) {
						this.method638(this.anInt1012);
						this.anInt1012 = -1;
					}
					if (this.anInt827 != -1) {
						this.method638(this.anInt827);
						this.anInt827 = -1;
					}
					if (this.anInt985 != 0) {
						this.anInt985 = 0;
						this.aBoolean206 = true;
					}
					this.aBoolean237 = false;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 243) {
					local356 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					local361 = this.aClass8_Sub1_Sub3_9.method438();
					local196 = this.aClass8_Sub1_Sub3_9.method409();
					@Pc(2820) Class24 local2820 = Class24.method259(local356);
					local2820.anInt428 = local196;
					local2820.anInt452 = local361;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 185 || this.anInt901 == 47 || this.anInt901 == 128 || this.anInt901 == 210 || this.anInt901 == 160 || this.anInt901 == 187 || this.anInt901 == 91 || this.anInt901 == 69 || this.anInt901 == 255 || this.anInt901 == 103 || this.anInt901 == 14) {
					this.method669(this.anInt901, this.aClass8_Sub1_Sub3_9);
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 113) {
					this.anInt907 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41) * 30;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 55) {
					local356 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					local361 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					local196 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					Class24.method259(local361).anInt435 = (local356 << 16) + local196;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 251) {
					local356 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					if (local356 == 65535) {
						local356 = -1;
					}
					if (local356 != this.anInt867 && this.aBoolean203 && !aBoolean236 && this.anInt915 == 0) {
						this.anInt846 = local356;
						this.aBoolean204 = true;
						this.aClass1_Sub1_1.method104(2, this.anInt846);
					}
					this.anInt867 = local356;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 41) {
					local356 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					local361 = this.aClass8_Sub1_Sub3_9.method410();
					if (this.aBoolean203 && !aBoolean236) {
						this.anInt846 = local356;
						this.aBoolean204 = false;
						this.aClass1_Sub1_1.method104(2, this.anInt846);
						this.anInt915 = local361;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 108) {
					local356 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					local361 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
					local196 = this.aClass8_Sub1_Sub3_9.method408();
					local200 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					Class24.method259(local361).anInt430 = local200;
					Class24.method259(local361).anInt431 = local356;
					Class24.method259(local361).anInt429 = local196;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 173) {
					for (local356 = 0; local356 < this.aClass8_Sub1_Sub1_Sub1_Sub1Array1.length; local356++) {
						if (this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local356] != null) {
							this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local356].anInt215 = -1;
						}
					}
					for (local361 = 0; local361 < this.aClass8_Sub1_Sub1_Sub1_Sub2Array1.length; local361++) {
						if (this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local361] != null) {
							this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local361].anInt215 = -1;
						}
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 99) {
					this.method721(this.aClass8_Sub1_Sub3_9, this.anInt900);
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 229) {
					local356 = this.aClass8_Sub1_Sub3_9.method434((byte) 7);
					this.method697(local356);
					if (this.anInt843 != -1) {
						this.method638(this.anInt843);
						this.anInt843 = -1;
						this.aBoolean215 = true;
						this.aBoolean231 = true;
					}
					if (this.anInt947 != -1) {
						this.method638(this.anInt947);
						this.anInt947 = -1;
						this.aBoolean212 = true;
					}
					if (this.anInt1012 != -1) {
						this.method638(this.anInt1012);
						this.anInt1012 = -1;
					}
					if (this.anInt827 != -1) {
						this.method638(this.anInt827);
						this.anInt827 = -1;
					}
					if (this.anInt833 != local356) {
						this.method638(this.anInt833);
						this.anInt833 = local356;
					}
					this.aBoolean237 = false;
					this.aBoolean206 = true;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 85) {
					this.anInt934 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt965 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt898 = this.aClass8_Sub1_Sub3_9.method406();
					this.aBoolean224 = true;
					this.aBoolean206 = true;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 171) {
					this.anInt848 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					this.anInt961 = this.aClass8_Sub1_Sub3_9.method426();
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 12) {
					if (this.anInt966 == 12) {
						this.aBoolean215 = true;
					}
					this.anInt854 = this.aClass8_Sub1_Sub3_9.method409();
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 95 || this.anInt901 == 81) {
					local356 = this.anInt834;
					local361 = this.anInt835;
					if (this.anInt901 == 95) {
						local361 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
						local356 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
						this.aBoolean202 = false;
					}
					if (this.anInt901 == 81) {
						local361 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
						this.aClass8_Sub1_Sub3_9.method416();
						local196 = 0;
						while (true) {
							if (local196 >= 4) {
								this.aClass8_Sub1_Sub3_9.method418();
								local356 = this.aClass8_Sub1_Sub3_9.method435(this.anInt866);
								this.aBoolean202 = true;
								break;
							}
							for (local200 = 0; local200 < 13; local200++) {
								for (local683 = 0; local683 < 13; local683++) {
									local204 = this.aClass8_Sub1_Sub3_9.method417(1);
									if (local204 == 1) {
										this.anIntArrayArrayArray7[local196][local200][local683] = this.aClass8_Sub1_Sub3_9.method417(26);
									} else {
										this.anIntArrayArrayArray7[local196][local200][local683] = -1;
									}
								}
							}
							local196++;
						}
					}
					if (this.anInt834 == local356 && this.anInt835 == local361 && this.anInt825 == 2) {
						this.anInt901 = -1;
						return true;
					}
					this.anInt834 = local356;
					this.anInt835 = local361;
					this.anInt1001 = (this.anInt834 - 6) * 8;
					this.anInt1002 = (this.anInt835 - 6) * 8;
					this.aBoolean213 = false;
					if ((this.anInt834 / 8 == 48 || this.anInt834 / 8 == 49) && this.anInt835 / 8 == 48) {
						this.aBoolean213 = true;
					}
					if (this.anInt834 / 8 == 48 && this.anInt835 / 8 == 148) {
						this.aBoolean213 = true;
					}
					this.anInt825 = 1;
					this.aLong32 = System.currentTimeMillis();
					this.method613("Loading - please wait.", 685, null);
					if (this.anInt901 == 95) {
						local196 = 0;
						local200 = (this.anInt834 - 6) / 8;
						label1194: while (true) {
							if (local200 > (this.anInt834 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local196][];
								this.aByteArrayArray5 = new byte[local196][];
								this.anIntArray234 = new int[local196];
								this.anIntArray235 = new int[local196];
								this.anIntArray236 = new int[local196];
								local196 = 0;
								local683 = (this.anInt834 - 6) / 8;
								while (true) {
									if (local683 > (this.anInt834 + 6) / 8) {
										break label1194;
									}
									for (local204 = (this.anInt835 - 6) / 8; local204 <= (this.anInt835 + 6) / 8; local204++) {
										this.anIntArray234[local196] = (local683 << 8) + local204;
										if (this.aBoolean213 && (local204 == 49 || local204 == 149 || local204 == 147 || local683 == 50 || local683 == 49 && local204 == 47)) {
											this.anIntArray235[local196] = -1;
											this.anIntArray236[local196] = -1;
											local196++;
										} else {
											local225 = this.anIntArray235[local196] = this.aClass1_Sub1_1.method98(local204, local683, 0, anInt906);
											if (local225 != -1) {
												this.aClass1_Sub1_1.method104(3, local225);
											}
											local971 = this.anIntArray236[local196] = this.aClass1_Sub1_1.method98(local204, local683, 1, anInt906);
											if (local971 != -1) {
												this.aClass1_Sub1_1.method104(3, local971);
											}
											local196++;
										}
									}
									local683++;
								}
							}
							for (local683 = (this.anInt835 - 6) / 8; local683 <= (this.anInt835 + 6) / 8; local683++) {
								local196++;
							}
							local200++;
						}
					}
					if (this.anInt901 == 81) {
						local196 = 0;
						@Pc(3701) int[] local3701 = new int[676];
						local683 = 0;
						label1155: while (true) {
							@Pc(3731) int local3731;
							@Pc(3737) int local3737;
							@Pc(3747) int local3747;
							if (local683 >= 4) {
								this.aByteArrayArray6 = new byte[local196][];
								this.aByteArrayArray5 = new byte[local196][];
								this.anIntArray234 = new int[local196];
								this.anIntArray235 = new int[local196];
								this.anIntArray236 = new int[local196];
								local204 = 0;
								while (true) {
									if (local204 >= local196) {
										break label1155;
									}
									local225 = this.anIntArray234[local204] = local3701[local204];
									local971 = local225 >> 8 & 0xFF;
									local3731 = local225 & 0xFF;
									local3737 = this.anIntArray235[local204] = this.aClass1_Sub1_1.method98(local3731, local971, 0, anInt906);
									if (local3737 != -1) {
										this.aClass1_Sub1_1.method104(3, local3737);
									}
									local3747 = this.anIntArray236[local204] = this.aClass1_Sub1_1.method98(local3731, local971, 1, anInt906);
									if (local3747 != -1) {
										this.aClass1_Sub1_1.method104(3, local3747);
									}
									local204++;
								}
							}
							for (local204 = 0; local204 < 13; local204++) {
								for (local225 = 0; local225 < 13; local225++) {
									local971 = this.anIntArrayArrayArray7[local683][local204][local225];
									if (local971 != -1) {
										local3731 = local971 >> 14 & 0x3FF;
										local3737 = local971 >> 3 & 0x7FF;
										local3747 = (local3731 / 8 << 8) + local3737 / 8;
										for (@Pc(3749) int local3749 = 0; local3749 < local196; local3749++) {
											if (local3701[local3749] == local3747) {
												local3747 = -1;
												break;
											}
										}
										if (local3747 != -1) {
											local3701[local196++] = local3747;
										}
									}
								}
							}
							local683++;
						}
					}
					local196 = this.anInt1001 - this.anInt1003;
					local200 = this.anInt1002 - this.anInt1004;
					this.anInt1003 = this.anInt1001;
					this.anInt1004 = this.anInt1002;
					for (local683 = 0; local683 < 16384; local683++) {
						@Pc(3902) Class8_Sub1_Sub1_Sub1_Sub2 local3902 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local683];
						if (local3902 != null) {
							for (local225 = 0; local225 < 10; local225++) {
								local3902.anIntArray59[local225] -= local196;
								local3902.anIntArray60[local225] -= local200;
							}
							local3902.anInt230 -= local196 * 128;
							local3902.anInt231 -= local200 * 128;
						}
					}
					for (local204 = 0; local204 < this.anInt973; local204++) {
						@Pc(3957) Class8_Sub1_Sub1_Sub1_Sub1 local3957 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local204];
						if (local3957 != null) {
							for (local971 = 0; local971 < 10; local971++) {
								local3957.anIntArray59[local971] -= local196;
								local3957.anIntArray60[local971] -= local200;
							}
							local3957.anInt230 -= local196 * 128;
							local3957.anInt231 -= local200 * 128;
						}
					}
					this.aBoolean207 = true;
					@Pc(4009) byte local4009 = 0;
					@Pc(4011) byte local4011 = 104;
					@Pc(4013) byte local4013 = 1;
					if (local196 < 0) {
						local4009 = 103;
						local4011 = -1;
						local4013 = -1;
					}
					@Pc(4023) byte local4023 = 0;
					@Pc(4025) byte local4025 = 104;
					@Pc(4027) byte local4027 = 1;
					if (local200 < 0) {
						local4023 = 103;
						local4025 = -1;
						local4027 = -1;
					}
					for (@Pc(4037) int local4037 = local4009; local4037 != local4011; local4037 += local4013) {
						for (@Pc(4041) int local4041 = local4023; local4041 != local4025; local4041 += local4027) {
							@Pc(4047) int local4047 = local4037 + local196;
							@Pc(4051) int local4051 = local4041 + local200;
							for (@Pc(4053) int local4053 = 0; local4053 < 4; local4053++) {
								if (local4047 >= 0 && local4051 >= 0 && local4047 < 104 && local4051 < 104) {
									this.aClass7ArrayArrayArray1[local4053][local4037][local4041] = this.aClass7ArrayArrayArray1[local4053][local4047][local4051];
								} else {
									this.aClass7ArrayArrayArray1[local4053][local4037][local4041] = null;
								}
							}
						}
					}
					for (@Pc(4115) Class8_Sub3 local4115 = (Class8_Sub3) this.aClass7_11.method32(); local4115 != null; local4115 = (Class8_Sub3) this.aClass7_11.method34()) {
						local4115.anInt318 -= local196;
						local4115.anInt319 -= local200;
						if (local4115.anInt318 < 0 || local4115.anInt319 < 0 || local4115.anInt318 >= 104 || local4115.anInt319 >= 104) {
							local4115.method546();
						}
					}
					if (this.anInt939 != 0) {
						this.anInt939 -= local196;
						this.anInt940 -= local200;
					}
					this.aBoolean200 = false;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 133) {
					this.anInt939 = 0;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 101) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local361 = this.aClass8_Sub1_Sub3_9.method426();
					if (local356 == 65535) {
						local356 = -1;
					}
					if (this.anIntArray275[local361] != local356) {
						this.method638(this.anIntArray275[local361]);
						this.anIntArray275[local361] = local356;
					}
					this.aBoolean215 = true;
					this.aBoolean231 = true;
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 220) {
					local356 = this.aClass8_Sub1_Sub3_9.method436(this.aByte41);
					Class24.method259(local356).anInt426 = 3;
					if (aClass8_Sub1_Sub1_Sub1_Sub1_1.aClass45_1 == null) {
						Class24.method259(local356).anInt427 = (aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray38[0] << 25) + (aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray38[4] << 20) + (aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray39[0] << 15) + (aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray39[8] << 10) + (aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray39[11] << 5) + aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray39[1];
					} else {
						Class24.method259(local356).anInt427 = (int) (aClass8_Sub1_Sub1_Sub1_Sub1_1.aClass45_1.aLong25 + 305419896L);
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 30) {
					this.anInt875 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 80) {
					this.anInt1048 = this.aClass8_Sub1_Sub3_9.method406();
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 155) {
					this.anInt877 = this.aClass8_Sub1_Sub3_9.method406();
					if (this.anInt877 == 1) {
						this.anInt896 = this.aClass8_Sub1_Sub3_9.method408();
					}
					if (this.anInt877 >= 2 && this.anInt877 <= 6) {
						if (this.anInt877 == 2) {
							this.anInt990 = 64;
							this.anInt991 = 64;
						}
						if (this.anInt877 == 3) {
							this.anInt990 = 0;
							this.anInt991 = 64;
						}
						if (this.anInt877 == 4) {
							this.anInt990 = 128;
							this.anInt991 = 64;
						}
						if (this.anInt877 == 5) {
							this.anInt990 = 64;
							this.anInt991 = 0;
						}
						if (this.anInt877 == 6) {
							this.anInt990 = 64;
							this.anInt991 = 128;
						}
						this.anInt877 = 2;
						this.anInt987 = this.aClass8_Sub1_Sub3_9.method408();
						this.anInt988 = this.aClass8_Sub1_Sub3_9.method408();
						this.anInt989 = this.aClass8_Sub1_Sub3_9.method406();
					}
					if (this.anInt877 == 10) {
						this.anInt1031 = this.aClass8_Sub1_Sub3_9.method408();
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 186) {
					local356 = this.aClass8_Sub1_Sub3_9.method408();
					local1519 = Class24.method259(local356);
					for (local196 = 0; local196 < local1519.anIntArray137.length; local196++) {
						local1519.anIntArray137[local196] = -1;
						local1519.anIntArray137[local196] = 0;
					}
					this.anInt901 = -1;
					return true;
				}
				if (this.anInt901 == 211) {
					this.aBoolean240 = false;
					this.anInt985 = 2;
					this.aString22 = "";
					this.aBoolean206 = true;
					this.anInt901 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt901 + "," + this.anInt900 + " - " + this.anInt881 + "," + this.anInt882);
				this.method612((byte) 6);
			} catch (@Pc(4532) IOException local4532) {
				this.method619();
			} catch (@Pc(4537) Exception local4537) {
				local2463 = "T2 - " + this.anInt901 + "," + this.anInt881 + "," + this.anInt882 + " - " + this.anInt900 + "," + (this.anInt1001 + aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]) + "," + (this.anInt1002 + aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0]) + " - ";
				for (local361 = 0; local361 < this.anInt900 && local361 < 50; local361++) {
					local2463 = local2463 + this.aClass8_Sub1_Sub3_9.aByteArray13[local361] + ",";
				}
				signlink.reporterror(local2463);
				this.method612((byte) 6);
			}
			return true;
		} catch (@Pc(4618) RuntimeException local4618) {
			signlink.reporterror("89657, " + 72 + ", " + local4618.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method595(@OriginalArg(0) int arg0) {
		try {
			this.anInt900 += arg0;
			for (@Pc(9) int local9 = 0; local9 < this.anInt844; local9++) {
				if (this.anIntArray212[local9] <= 0) {
					@Pc(18) boolean local18 = false;
					try {
						if (this.anIntArray272[local9] != this.anInt861 || this.anIntArray265[local9] != this.anInt1000) {
							@Pc(51) Class8_Sub1_Sub3 local51 = Class41.method502((byte) 9, this.anIntArray265[local9], this.anIntArray272[local9]);
							if (System.currentTimeMillis() + (long) (local51.anInt620 / 22) > this.aLong29 + (long) (this.anInt995 / 22)) {
								this.anInt995 = local51.anInt620;
								this.aLong29 = System.currentTimeMillis();
								if (this.method694(local51.aByteArray13, local51.anInt620)) {
									this.anInt861 = this.anIntArray272[local9];
									this.anInt1000 = this.anIntArray265[local9];
								} else {
									local18 = true;
								}
							}
						} else if (!this.method616()) {
							local18 = true;
						}
					} catch (@Pc(101) Exception local101) {
						if (signlink.reporterror) {
							this.aClass8_Sub1_Sub3_6.method395(189);
							this.aClass8_Sub1_Sub3_6.method397(this.anIntArray272[local9] & 0x7FFF);
						} else {
							this.aClass8_Sub1_Sub3_6.method395(189);
							this.aClass8_Sub1_Sub3_6.method397(-1);
						}
					}
					if (local18 && this.anIntArray212[local9] != -5) {
						this.anIntArray212[local9] = -5;
					} else {
						this.anInt844--;
						for (@Pc(144) int local144 = local9; local144 < this.anInt844; local144++) {
							this.anIntArray272[local144] = this.anIntArray272[local144 + 1];
							this.anIntArray265[local144] = this.anIntArray265[local144 + 1];
							this.anIntArray212[local144] = this.anIntArray212[local144 + 1];
						}
						local9--;
					}
				} else {
					@Pc(196) int local196 = this.anIntArray212[local9]--;
				}
			}
			if (this.anInt915 > 0) {
				this.anInt915 -= 20;
				if (this.anInt915 < 0) {
					this.anInt915 = 0;
				}
				if (this.anInt915 == 0 && this.aBoolean203 && !aBoolean236) {
					this.anInt846 = this.anInt867;
					this.aBoolean204 = true;
					this.aClass1_Sub1_1.method104(2, this.anInt846);
					return;
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("86069, " + arg0 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method596() {
		try {
			if (this.anInt1048 == 0 && super.anInt817 == 1) {
				@Pc(21) int local21 = super.anInt818 - 25 - 550;
				@Pc(28) int local28 = super.anInt819 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt920 + this.anInt923 & 0x7FF;
					@Pc(52) int local52 = Class8_Sub1_Sub2_Sub1.anIntArray163[local48];
					@Pc(56) int local56 = Class8_Sub1_Sub2_Sub1.anIntArray164[local48];
					@Pc(65) int local65 = local52 * (this.anInt1034 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt1034 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 + local84 >> 7;
					@Pc(108) int local108 = aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 - local94 >> 7;
					@Pc(129) boolean local129 = this.method631(0, 0, 1, true, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local108, 0, local101, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					if (local129) {
						this.aClass8_Sub1_Sub3_6.method396(local21);
						this.aClass8_Sub1_Sub3_6.method396(local28);
						this.aClass8_Sub1_Sub3_6.method397(this.anInt920);
						this.aClass8_Sub1_Sub3_6.method396(57);
						this.aClass8_Sub1_Sub3_6.method396(this.anInt923);
						this.aClass8_Sub1_Sub3_6.method396(this.anInt1034);
						this.aClass8_Sub1_Sub3_6.method396(89);
						this.aClass8_Sub1_Sub3_6.method397(aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230);
						this.aClass8_Sub1_Sub3_6.method397(aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231);
						this.aClass8_Sub1_Sub3_6.method396(this.anInt930);
						this.aClass8_Sub1_Sub3_6.method396(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("80202, " + 791 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
	private boolean method597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 < 0) {
				return false;
			}
			@Pc(12) int local12 = this.anIntArray270[arg1];
			if (local12 >= 2000) {
				local12 -= 2000;
			}
			return local12 == 646;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("21323, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method598(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 7320) {
				this.aClass7ArrayArrayArray1 = null;
			}
			for (@Pc(12) Class8_Sub1_Sub1_Sub4 local12 = (Class8_Sub1_Sub1_Sub4) this.aClass7_10.method32(); local12 != null; local12 = (Class8_Sub1_Sub1_Sub4) this.aClass7_10.method34()) {
				if (local12.anInt341 != this.anInt891 || local12.aBoolean79) {
					local12.method546();
				} else if (anInt917 >= local12.anInt338) {
					local12.method176(this.anInt871);
					if (local12.aBoolean79) {
						local12.method546();
					} else {
						this.aClass21_1.method189(local12.anInt343, -1, local12.anInt341, local12.anInt342, local12, 60, 0, false, local12.anInt344);
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("26429, " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method599() {
		try {
			this.anInt900 += 0;
			while (true) {
				@Pc(11) Class8_Sub1_Sub4 local11 = this.aClass1_Sub1_1.method105();
				if (local11 == null) {
					return;
				}
				if (local11.anInt678 == 0) {
					Class8_Sub1_Sub1_Sub3.method134(local11.aByteArray16, local11.anInt679);
					if ((this.aClass1_Sub1_1.method111(local11.anInt679) & 0x62) != 0) {
						this.aBoolean215 = true;
						if (this.anInt833 != -1 || this.anInt1055 != -1) {
							this.aBoolean206 = true;
						}
					}
				}
				if (local11.anInt678 == 1 && local11.aByteArray16 != null) {
					Class34.method328(local11.aByteArray16, (byte) 6);
				}
				if (local11.anInt678 == 2 && local11.anInt679 == this.anInt846 && local11.aByteArray16 != null) {
					this.method698(this.aBoolean204, local11.aByteArray16);
				}
				if (local11.anInt678 == 3 && this.anInt825 == 1) {
					for (@Pc(86) int local86 = 0; local86 < this.aByteArrayArray6.length; local86++) {
						if (this.anIntArray235[local86] == local11.anInt679) {
							this.aByteArrayArray6[local86] = local11.aByteArray16;
							if (local11.aByteArray16 == null) {
								this.anIntArray235[local86] = -1;
							}
							break;
						}
						if (this.anIntArray236[local86] == local11.anInt679) {
							this.aByteArrayArray5[local86] = local11.aByteArray16;
							if (local11.aByteArray16 == null) {
								this.anIntArray236[local86] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt678 == 93 && this.aClass1_Sub1_1.method96(local11.anInt679)) {
					Class2.method14(this.aClass1_Sub1_1, new Class8_Sub1_Sub3(local11.aByteArray16, -631));
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("20289, " + 0 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method600(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1070 = arg0;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("45913, " + -826 + ", " + arg0 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method601(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean218 &= true;
			if (aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 >> 7 == this.anInt939 && aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 >> 7 == this.anInt940) {
				this.anInt939 = 0;
			}
			@Pc(27) int local27 = this.anInt975;
			if (arg0) {
				local27 = 1;
			}
			for (@Pc(33) int local33 = 0; local33 < local27; local33++) {
				@Pc(39) Class8_Sub1_Sub1_Sub1_Sub1 local39;
				@Pc(44) int local44;
				if (arg0) {
					local39 = aClass8_Sub1_Sub1_Sub1_Sub1_1;
					local44 = this.anInt974 << 14;
				} else {
					local39 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray249[local33]];
					local44 = this.anIntArray249[local33] << 14;
				}
				if (local39 != null && local39.method85()) {
					local39.aBoolean24 = false;
					if ((aBoolean236 && this.anInt975 > 50 || this.anInt975 > 200) && !arg0 && local39.anInt210 == local39.anInt192) {
						local39.aBoolean24 = true;
					}
					@Pc(95) int local95 = local39.anInt230 >> 7;
					@Pc(100) int local100 = local39.anInt231 >> 7;
					if (local95 >= 0 && local95 < 104 && local100 >= 0 && local100 < 104) {
						if (local39.aClass8_Sub1_Sub1_Sub3_1 == null || anInt917 < local39.anInt144 || anInt917 >= local39.anInt145) {
							if ((local39.anInt230 & 0x7F) == 64 && (local39.anInt231 & 0x7F) == 64) {
								if (this.anIntArrayArray25[local95][local100] == this.anInt1039) {
									continue;
								}
								this.anIntArrayArray25[local95][local100] = this.anInt1039;
							}
							local39.anInt146 = this.method666(local39.anInt231, local39.anInt230, this.anInt891);
							this.aClass21_1.method189(local39.anInt231, local44, this.anInt891, local39.anInt230, local39, 60, local39.anInt232, local39.aBoolean45, local39.anInt146);
						} else {
							local39.aBoolean24 = false;
							local39.anInt146 = this.method666(local39.anInt231, local39.anInt230, this.anInt891);
							this.aClass21_1.method190(local39.anInt230, local39.anInt231, local39.anInt232, local39.anInt152, local44, local39.anInt151, local39, local39.anInt146, local39.anInt154, local39.anInt153, this.anInt891);
						}
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("82203, " + arg0 + ", " + true + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method602() {
		try {
			Class42.aClass15_6.method118();
			Class42.aClass15_5.method118();
			Class45.aClass15_7.method118();
			Class46.aClass15_8.method118();
			Class46.aClass15_9.method118();
			Class8_Sub1_Sub1_Sub1_Sub1.aClass15_1.method118();
			Class32.aClass15_4.method118();
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("73480, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILclient!TPUDHOHI;)V")
	private void method603(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub1_Sub2_Sub2 arg3) {
		try {
			if (arg3 != null) {
				@Pc(10) int local10 = this.anInt920 + this.anInt923 & 0x7FF;
				@Pc(18) int local18 = arg2 * arg2 + arg1 * arg1;
				@Pc(23) boolean local23 = false;
				if (local18 <= 6400) {
					@Pc(37) int local37 = Class8_Sub1_Sub1_Sub3.anIntArray106[local10];
					@Pc(41) int local41 = Class8_Sub1_Sub1_Sub3.anIntArray107[local10];
					@Pc(50) int local50 = local37 * 256 / (this.anInt1034 + 256);
					@Pc(59) int local59 = local41 * 256 / (this.anInt1034 + 256);
					@Pc(69) int local69 = arg1 * local50 + arg2 * local59 >> 16;
					@Pc(79) int local79 = arg1 * local59 - arg2 * local50 >> 16;
					if (local18 > 2500) {
						arg3.method390(83 - local79 - arg3.anInt610 / 2 - 4, local69 + 94 - arg3.anInt609 / 2 + 4, this.aClass8_Sub1_Sub2_Sub3_4);
					} else {
						arg3.method384(local69 + 94 + 4 - arg3.anInt609 / 2, 83 - local79 - arg3.anInt610 / 2 - 4);
					}
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("95120, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method604() {
		try {
			this.aClass40_25.method496();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt1048 == 2) {
				@Pc(13) byte[] local13 = this.aClass8_Sub1_Sub2_Sub3_4.aByteArray15;
				@Pc(15) int[] local15 = Class8_Sub1_Sub2.anIntArray204;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass8_Sub1_Sub2_Sub2_11.method388(0, this.anIntArray248, 25, 256, 33, 33, 25, 0, (byte) 1, this.anIntArray252, this.anInt920);
				this.aClass40_26.method496();
				Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
			} else {
				@Pc(67) int local67 = this.anInt920 + this.anInt923 & 0x7FF;
				@Pc(74) int local74 = aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32 + 48;
				local18 = 464 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
				this.aClass8_Sub1_Sub2_Sub2_10.method388(25, this.anIntArray217, local74, this.anInt1034 + 256, 151, 146, local18, 5, (byte) 1, this.anIntArray224, local67);
				this.anInt900 += 0;
				this.aClass8_Sub1_Sub2_Sub2_11.method388(0, this.anIntArray248, 25, 256, 33, 33, 25, 0, (byte) 1, this.anIntArray252, this.anInt920);
				for (local20 = 0; local20 < this.anInt996; local20++) {
					local74 = this.anIntArray257[local20] * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32;
					local18 = this.anIntArray258[local20] * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
					this.method603((byte) 5, local18, local74, this.aClass8_Sub1_Sub2_Sub2Array5[local20]);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class7 local187 = this.aClass7ArrayArrayArray1[this.anInt891][local171][local175];
						if (local187 != null) {
							local74 = local171 * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32;
							local18 = local175 * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
							this.method603((byte) 5, local18, local74, this.aClass8_Sub1_Sub2_Sub2_5);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt840; local175++) {
					@Pc(238) Class8_Sub1_Sub1_Sub1_Sub2 local238 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray215[local175]];
					if (local238 != null && local238.method85()) {
						@Pc(247) Class45 local247 = local238.aClass45_2;
						if (local247.anIntArray194 != null) {
							local247 = local247.method525(this.anInt1057);
						}
						if (local247 != null && local247.aBoolean180 && local247.aBoolean181) {
							local74 = local238.anInt230 / 32 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32;
							local18 = local238.anInt231 / 32 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
							this.method603((byte) 5, local18, local74, this.aClass8_Sub1_Sub2_Sub2_6);
						}
					}
				}
				@Pc(307) Class8_Sub1_Sub1_Sub1_Sub1 local307;
				for (@Pc(297) int local297 = 0; local297 < this.anInt975; local297++) {
					local307 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray249[local297]];
					if (local307 != null && local307.method85()) {
						local74 = local307.anInt230 / 32 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32;
						local18 = local307.anInt231 / 32 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
						@Pc(335) boolean local335 = false;
						@Pc(339) long local339 = Class28.method305(local307.aString4);
						for (@Pc(341) int local341 = 0; local341 < this.anInt1046; local341++) {
							if (local339 == this.aLongArray3[local341] && this.anIntArray216[local341] != 0) {
								local335 = true;
								break;
							}
						}
						@Pc(366) boolean local366 = false;
						if (aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt139 != 0 && local307.anInt139 != 0 && aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt139 == local307.anInt139) {
							local366 = true;
						}
						if (local335) {
							this.method603((byte) 5, local18, local74, this.aClass8_Sub1_Sub2_Sub2_8);
						} else if (local366) {
							this.method603((byte) 5, local18, local74, this.aClass8_Sub1_Sub2_Sub2_9);
						} else {
							this.method603((byte) 5, local18, local74, this.aClass8_Sub1_Sub2_Sub2_7);
						}
					}
				}
				if (this.anInt877 != 0 && anInt917 % 20 < 10) {
					if (this.anInt877 == 1 && this.anInt896 >= 0 && this.anInt896 < this.aClass8_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(440) Class8_Sub1_Sub1_Sub1_Sub2 local440 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anInt896];
						if (local440 != null) {
							local74 = local440.anInt230 / 32 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32;
							local18 = local440.anInt231 / 32 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
							this.method646(this.aClass8_Sub1_Sub2_Sub2_4, local18, local74);
						}
					}
					if (this.anInt877 == 2) {
						local74 = (this.anInt987 - this.anInt1001) * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32;
						local18 = (this.anInt988 - this.anInt1002) * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
						this.method646(this.aClass8_Sub1_Sub2_Sub2_4, local18, local74);
					}
					if (this.anInt877 == 10 && this.anInt1031 >= 0 && this.anInt1031 < this.aClass8_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local307 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anInt1031];
						if (local307 != null) {
							local74 = local307.anInt230 / 32 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32;
							local18 = local307.anInt231 / 32 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
							this.method646(this.aClass8_Sub1_Sub2_Sub2_4, local18, local74);
						}
					}
				}
				if (this.anInt939 != 0) {
					local74 = this.anInt939 * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 / 32;
					local18 = this.anInt940 * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 / 32;
					this.method603((byte) 5, local18, local74, this.aClass8_Sub1_Sub2_Sub2_3);
				}
				Class8_Sub1_Sub2.method553(3, 16777215, 97, 3, 78);
				this.aClass40_26.method496();
				Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
			}
		} catch (@Pc(608) RuntimeException local608) {
			signlink.reporterror("47736, " + 0 + ", " + local608.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method605(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean236) {
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray276.length; local19++) {
					@Pc(26) int local26 = this.anIntArray276[local19];
					if (Class8_Sub1_Sub2_Sub1.anIntArray167[local26] >= arg0) {
						@Pc(35) Class8_Sub1_Sub2_Sub3 local35 = Class8_Sub1_Sub2_Sub1.aClass8_Sub1_Sub2_Sub3Array1[local26];
						@Pc(43) int local43 = local35.anInt666 * local35.anInt667 - 1;
						@Pc(51) int local51 = local35.anInt666 * this.anInt871 * 2;
						@Pc(54) byte[] local54 = local35.aByteArray15;
						@Pc(57) byte[] local57 = this.aByteArray21;
						for (@Pc(59) int local59 = 0; local59 <= local43; local59++) {
							local57[local59] = local54[local59 - local51 & local43];
						}
						local35.aByteArray15 = local57;
						this.aByteArray21 = local54;
						Class8_Sub1_Sub2_Sub1.method353(local26);
					}
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("10664, " + arg0 + ", " + 6 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			if (!this.aBoolean230 && !this.aBoolean239 && !this.aBoolean210) {
				anInt917++;
				if (this.aBoolean218) {
					this.method610();
				} else {
					this.method633();
				}
				this.method599();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("65548, " + -531 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!TQYMAXSO;)V")
	private void method606(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2) {
		try {
			arg2.method416();
			@Pc(7) int local7 = arg2.method417(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg2.method417(2);
				@Pc(19) int local19;
				if (!arg0) {
					for (local19 = 1; local19 > 0; local19++) {
					}
				}
				if (local15 == 0) {
					this.anIntArray250[this.anInt976++] = this.anInt974;
				} else {
					@Pc(58) int local58;
					if (local15 == 1) {
						local19 = arg2.method417(3);
						aClass8_Sub1_Sub1_Sub1_Sub1_1.method84(this.anInt925, false, local19);
						local58 = arg2.method417(1);
						if (local58 == 1) {
							this.anIntArray250[this.anInt976++] = this.anInt974;
						}
					} else {
						@Pc(104) int local104;
						if (local15 == 2) {
							local19 = arg2.method417(3);
							aClass8_Sub1_Sub1_Sub1_Sub1_1.method84(this.anInt925, true, local19);
							local58 = arg2.method417(3);
							aClass8_Sub1_Sub1_Sub1_Sub1_1.method84(this.anInt925, true, local58);
							local104 = arg2.method417(1);
							if (local104 == 1) {
								this.anIntArray250[this.anInt976++] = this.anInt974;
							}
						} else if (local15 == 3) {
							this.anInt891 = arg2.method417(2);
							local19 = arg2.method417(7);
							local58 = arg2.method417(7);
							local104 = arg2.method417(1);
							@Pc(149) int local149 = arg2.method417(1);
							if (local149 == 1) {
								this.anIntArray250[this.anInt976++] = this.anInt974;
							}
							aClass8_Sub1_Sub1_Sub1_Sub1_1.method86(local104 == 1, local19, local58);
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("10249, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method607() {
		try {
			if (this.anInt946 != 0) {
				@Pc(8) Class8_Sub1_Sub2_Sub4 local8 = this.aClass8_Sub1_Sub2_Sub4_3;
				@Pc(10) int local10 = 0;
				if (this.anInt907 != 0) {
					local10 = 1;
				}
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray12[local17] != null) {
						@Pc(29) int local29 = this.anIntArray247[local17];
						@Pc(34) String local34 = this.aStringArray11[local17];
						@Pc(36) byte local36 = 0;
						if (local34 != null && local34.startsWith("@cr1@")) {
							local34 = local34.substring(5);
							local36 = 1;
						}
						if (local34 != null && local34.startsWith("@cr2@")) {
							local34 = local34.substring(5);
							local36 = 2;
						}
						@Pc(87) int local87;
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt965 == 0 || this.anInt965 == 1 && this.method623(local34))) {
							local87 = 329 - local10 * 13;
							local8.method565(local87, 0, "From", 4);
							local8.method565(local87 - 1, 65535, "From", 4);
							@Pc(112) int local112 = local8.method563("From ") + 4;
							if (local36 == 1) {
								this.aClass8_Sub1_Sub2_Sub3Array3[0].method494(local112, local87 - 12);
								local112 += 14;
							}
							if (local36 == 2) {
								this.aClass8_Sub1_Sub2_Sub3Array3[1].method494(local112, local87 - 12);
								local112 += 14;
							}
							local8.method565(local87, 0, local34 + ": " + this.aStringArray12[local17], local112);
							local8.method565(local87 - 1, 65535, local34 + ": " + this.aStringArray12[local17], local112);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local29 == 5 && this.anInt965 < 2) {
							local87 = 329 - local10 * 13;
							local8.method565(local87, 0, this.aStringArray12[local17], 4);
							local8.method565(local87 - 1, 65535, this.aStringArray12[local17], 4);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local29 == 6 && this.anInt965 < 2) {
							local87 = 329 - local10 * 13;
							local8.method565(local87, 0, "To " + local34 + ": " + this.aStringArray12[local17], 4);
							local8.method565(local87 - 1, 65535, "To " + local34 + ": " + this.aStringArray12[local17], 4);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("65350, " + -804 + ", " + local302.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!OMJBPTVL;)Z")
	private boolean method608(@OriginalArg(1) Class24 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt447;
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
				this.aStringArray13[this.anInt994] = "Remove @whi@" + this.aStringArray10[local4];
				this.anIntArray270[this.anInt994] = 978;
				this.anInt994++;
				this.aStringArray13[this.anInt994] = "Message @whi@" + this.aStringArray10[local4];
				this.anIntArray270[this.anInt994] = 34;
				this.anInt994++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray13[this.anInt994] = "Remove @whi@" + arg0.aString12;
				this.anIntArray270[this.anInt994] = 366;
				this.anInt994++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("92958, " + 0 + ", " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method609(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(14) Graphics local14 = this.method586().getGraphics();
			local14.setColor(Color.black);
			local14.fillRect(0, 0, 765, 503);
			this.method579();
			@Pc(46) byte local46;
			@Pc(52) int local52;
			if (this.aBoolean239) {
				this.aBoolean243 = false;
				local14.setFont(new Font("Helvetica", 1, 16));
				local14.setColor(Color.yellow);
				local46 = 35;
				local14.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local52 = local46 + 50;
				local14.setColor(Color.white);
				local14.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(61) int local61 = local52 + 50;
				local14.setColor(Color.white);
				local14.setFont(new Font("Helvetica", 1, 12));
				local14.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(78) int local78 = local61 + 30;
				local14.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(84) int local84 = local78 + 30;
				local14.drawString("3: Try using a different game-world", 30, 195);
				@Pc(90) int local90 = local84 + 30;
				local14.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(96) int local96 = local90 + 30;
				local14.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean210) {
				this.aBoolean243 = false;
				local14.setFont(new Font("Helvetica", 1, 20));
				local14.setColor(Color.white);
				local14.drawString("Error - unable to load game!", 50, 50);
				local14.drawString("To play RuneScape make sure you play from", 50, 100);
				local14.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean230) {
				this.aBoolean243 = false;
				local14.setColor(Color.yellow);
				local46 = 35;
				local14.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local52 = local46 + 50;
				local14.setColor(Color.white);
				local14.drawString("To fix this try the following (in order):", 30, 85);
				local52 += 50;
				local14.setColor(Color.white);
				local14.setFont(new Font("Helvetica", 1, 12));
				local14.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local52 += 30;
				local14.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local52 += 30;
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("10824, " + arg0 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method610() {
		try {
			if (this.anInt907 > 1) {
				this.anInt907--;
			}
			if (this.anInt904 > 0) {
				this.anInt904--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method594(); local22++) {
			}
			if (this.aBoolean218) {
				@Pc(51) Object local51 = this.aClass44_1.anObject1;
				@Pc(76) int local76;
				@Pc(78) int local78;
				@Pc(80) int local80;
				@Pc(113) int local113;
				synchronized (this.aClass44_1.anObject1) {
					if (!aBoolean222) {
						this.aClass44_1.anInt708 = 0;
					} else if (super.anInt817 != 0 || this.aClass44_1.anInt708 >= 40) {
						this.aClass8_Sub1_Sub3_6.method395(0);
						this.aClass8_Sub1_Sub3_6.method396(0);
						local76 = this.aClass8_Sub1_Sub3_6.anInt620;
						local78 = 0;
						@Pc(96) int local96;
						for (local80 = 0; local80 < this.aClass44_1.anInt708 && local76 - this.aClass8_Sub1_Sub3_6.anInt620 < 240; local80++) {
							local78++;
							local96 = this.aClass44_1.anIntArray190[local80];
							if (local96 < 0) {
								local96 = 0;
							} else if (local96 > 502) {
								local96 = 502;
							}
							local113 = this.aClass44_1.anIntArray189[local80];
							if (local113 < 0) {
								local113 = 0;
							} else if (local113 > 764) {
								local113 = 764;
							}
							@Pc(130) int local130 = local96 * 765 + local113;
							if (this.aClass44_1.anIntArray190[local80] == -1 && this.aClass44_1.anIntArray189[local80] == -1) {
								local113 = -1;
								local96 = -1;
								local130 = 524287;
							}
							if (local113 != this.anInt1026 || local96 != this.anInt1027) {
								@Pc(175) int local175 = local113 - this.anInt1026;
								this.anInt1026 = local113;
								@Pc(183) int local183 = local96 - this.anInt1027;
								this.anInt1027 = local96;
								if (this.anInt998 < 8 && local175 >= -32 && local175 <= 31 && local183 >= -32 && local183 <= 31) {
									local175 += 32;
									local183 += 32;
									this.aClass8_Sub1_Sub3_6.method397((this.anInt998 << 12) + (local175 << 6) + local183);
									this.anInt998 = 0;
								} else if (this.anInt998 < 8) {
									this.aClass8_Sub1_Sub3_6.method399((this.anInt998 << 19) + local130 + 8388608);
									this.anInt998 = 0;
								} else {
									this.aClass8_Sub1_Sub3_6.method400((this.anInt998 << 19) + local130 - 1073741824);
									this.anInt998 = 0;
								}
							} else if (this.anInt998 < 2047) {
								this.anInt998++;
							}
						}
						this.aClass8_Sub1_Sub3_6.method405(this.aClass8_Sub1_Sub3_6.anInt620 - local76, this.aByte36);
						if (local78 >= this.aClass44_1.anInt708) {
							this.aClass44_1.anInt708 = 0;
						} else {
							this.aClass44_1.anInt708 -= local78;
							for (local96 = 0; local96 < this.aClass44_1.anInt708; local96++) {
								this.aClass44_1.anIntArray189[local96] = this.aClass44_1.anIntArray189[local96 + local78];
								this.aClass44_1.anIntArray190[local96] = this.aClass44_1.anIntArray190[local96 + local78];
							}
						}
					}
				}
				if (super.anInt817 != 0) {
					@Pc(347) long local347 = (super.aLong28 - this.aLong31) / 50L;
					if (local347 > 4095L) {
						local347 = 4095L;
					}
					this.aLong31 = super.aLong28;
					local76 = super.anInt819;
					if (local76 < 0) {
						local76 = 0;
					} else if (local76 > 502) {
						local76 = 502;
					}
					local78 = super.anInt818;
					if (local78 < 0) {
						local78 = 0;
					} else if (local78 > 764) {
						local78 = 764;
					}
					local80 = local76 * 765 + local78;
					@Pc(393) byte local393 = 0;
					if (super.anInt817 == 2) {
						local393 = 1;
					}
					local113 = (int) local347;
					this.aClass8_Sub1_Sub3_6.method395(3);
					this.aClass8_Sub1_Sub3_6.method439((local113 << 20) + (local393 << 19) + local80);
				}
				if (this.anInt853 > 0) {
					this.anInt853--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean205 = true;
				}
				if (this.aBoolean205 && this.anInt853 <= 0) {
					this.anInt853 = 20;
					this.aBoolean205 = false;
					this.aClass8_Sub1_Sub3_6.method395(83);
					this.aClass8_Sub1_Sub3_6.method431(this.anInt919);
					this.aClass8_Sub1_Sub3_6.method431(this.anInt920);
				}
				if (super.aBoolean199 && !this.aBoolean221) {
					this.aBoolean221 = true;
					this.aClass8_Sub1_Sub3_6.method395(174);
					this.aClass8_Sub1_Sub3_6.method396(1);
				}
				if (!super.aBoolean199 && this.aBoolean221) {
					this.aBoolean221 = false;
					this.aClass8_Sub1_Sub3_6.method395(174);
					this.aClass8_Sub1_Sub3_6.method396(0);
				}
				this.method701();
				this.method727();
				this.method595(this.anInt970);
				this.anInt902++;
				if (this.anInt902 > 750) {
					this.method619();
				}
				this.method658();
				this.method677();
				this.method723();
				this.anInt871++;
				if (this.anInt1009 != 0) {
					this.anInt1008 += 20;
					if (this.anInt1008 >= 400) {
						this.anInt1009 = 0;
					}
				}
				if (this.anInt1053 != 0) {
					this.anInt1050++;
					if (this.anInt1050 >= 15) {
						if (this.anInt1053 == 2) {
							this.aBoolean215 = true;
						}
						if (this.anInt1053 == 3) {
							this.aBoolean206 = true;
						}
						this.anInt1053 = 0;
					}
				}
				if (this.anInt957 != 0) {
					this.anInt964++;
					if (super.anInt812 > this.anInt958 + 5 || super.anInt812 < this.anInt958 - 5 || super.anInt813 > this.anInt959 + 5 || super.anInt813 < this.anInt959 - 5) {
						this.aBoolean244 = true;
					}
					if (super.anInt811 == 0) {
						if (this.anInt957 == 2) {
							this.aBoolean215 = true;
						}
						if (this.anInt957 == 3) {
							this.aBoolean206 = true;
						}
						this.anInt957 = 0;
						if (this.aBoolean244 && this.anInt964 >= 5) {
							this.anInt860 = -1;
							this.method711();
							if (this.anInt860 == this.anInt955 && this.anInt859 != this.anInt956) {
								@Pc(696) Class24 local696 = Class24.method259(this.anInt955);
								@Pc(698) byte local698 = 0;
								if (this.anInt1019 == 1 && local696.anInt447 == 206) {
									local698 = 1;
								}
								if (local696.anIntArray137[this.anInt859] <= 0) {
									local698 = 0;
								}
								if (local696.aBoolean99) {
									local76 = this.anInt956;
									local78 = this.anInt859;
									local696.anIntArray137[local78] = local696.anIntArray137[local76];
									local696.anIntArray142[local78] = local696.anIntArray142[local76];
									local696.anIntArray137[local76] = -1;
									local696.anIntArray142[local76] = 0;
								} else if (local698 == 1) {
									local76 = this.anInt956;
									local78 = this.anInt859;
									while (local76 != local78) {
										if (local76 > local78) {
											local696.method256(local76 - 1, local76);
											local76--;
										} else if (local76 < local78) {
											local696.method256(local76 + 1, local76);
											local76++;
										}
									}
								} else {
									local696.method256(this.anInt859, this.anInt956);
								}
								this.aClass8_Sub1_Sub3_6.method395(97);
								this.aClass8_Sub1_Sub3_6.method432(this.anInt859, this.anInt962);
								this.aClass8_Sub1_Sub3_6.method432(this.anInt955, this.anInt962);
								this.aClass8_Sub1_Sub3_6.method422(local698);
								this.aClass8_Sub1_Sub3_6.method433(this.anInt956);
							}
						} else if ((this.anInt823 == 1 || this.method597(671, this.anInt994 - 1)) && this.anInt994 > 2) {
							this.method717();
						} else if (this.anInt994 > 0) {
							this.method716(this.anInt994 - 1, 338);
						}
						this.anInt1050 = 10;
						super.anInt817 = 0;
					}
				}
				@Pc(874) int local874;
				@Pc(876) int local876;
				if (Class21.anInt374 != -1) {
					local874 = Class21.anInt374;
					local876 = Class21.anInt375;
					@Pc(897) boolean local897 = this.method631(0, 0, 0, true, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local876, 0, local874, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					Class21.anInt374 = -1;
					if (local897) {
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 1;
						this.anInt1008 = 0;
					}
				}
				if (super.anInt817 == 1 && this.aString21 != null) {
					this.aString21 = null;
					this.aBoolean206 = true;
					super.anInt817 = 0;
				}
				this.method715();
				if (this.anInt947 == -1) {
					this.method596();
					this.method626(this.aByte37);
					this.method672(this.aBoolean241);
				}
				if (super.anInt811 == 1 || super.anInt817 == 1) {
					this.anInt938++;
				}
				if (this.anInt905 == 0 && this.anInt1015 == 0 && this.anInt960 == 0) {
					if (this.anInt894 > 0) {
						this.anInt894--;
					}
				} else if (this.anInt894 < 100) {
					this.anInt894++;
					if (this.anInt894 == 100) {
						if (this.anInt905 != 0) {
							this.aBoolean206 = true;
						}
						if (this.anInt1015 != 0) {
							this.aBoolean215 = true;
						}
					}
				}
				if (this.anInt825 == 2) {
					this.method618();
				}
				if (this.anInt825 == 2 && this.aBoolean200) {
					this.method676();
				}
				for (local874 = 0; local874 < 5; local874++) {
					@Pc(1035) int local1035 = this.anIntArray214[local874]++;
				}
				this.method700();
				super.anInt810++;
				if (super.anInt810 > 4500) {
					this.anInt904 = 250;
					super.anInt810 -= 500;
					this.aClass8_Sub1_Sub3_6.method395(61);
				}
				this.anInt986++;
				if (this.anInt986 > 500) {
					this.anInt986 = 0;
					local876 = (int) (Math.random() * 8.0D);
					if ((local876 & 0x1) == 1) {
						this.anInt883 += this.anInt884;
					}
					if ((local876 & 0x2) == 2) {
						this.anInt857 += this.anInt858;
					}
					if ((local876 & 0x4) == 4) {
						this.anInt908 += this.anInt909;
					}
				}
				if (this.anInt883 < -50) {
					this.anInt884 = 2;
				}
				if (this.anInt883 > 50) {
					this.anInt884 = -2;
				}
				if (this.anInt857 < -55) {
					this.anInt858 = 2;
				}
				if (this.anInt857 > 55) {
					this.anInt858 = -2;
				}
				if (this.anInt908 < -40) {
					this.anInt909 = 1;
				}
				if (this.anInt908 > 40) {
					this.anInt909 = -1;
				}
				this.anInt895++;
				if (this.anInt895 > 500) {
					this.anInt895 = 0;
					local876 = (int) (Math.random() * 8.0D);
					if ((local876 & 0x1) == 1) {
						this.anInt923 += this.anInt924;
					}
					if ((local876 & 0x2) == 2) {
						this.anInt1034 += this.anInt1035;
					}
				}
				if (this.anInt923 < -60) {
					this.anInt924 = 2;
				}
				if (this.anInt923 > 60) {
					this.anInt924 = -2;
				}
				if (this.anInt1034 < -20) {
					this.anInt1035 = 1;
				}
				if (this.anInt1034 > 10) {
					this.anInt1035 = -1;
				}
				this.anInt903++;
				if (this.anInt903 > 50) {
					this.aClass8_Sub1_Sub3_6.method395(235);
				}
				try {
					if (this.aClass19_1 != null && this.aClass8_Sub1_Sub3_6.anInt620 > 0) {
						this.aClass19_1.method167(this.aClass8_Sub1_Sub3_6.anInt620, this.aClass8_Sub1_Sub3_6.aByteArray13);
						this.aClass8_Sub1_Sub3_6.anInt620 = 0;
						this.anInt903 = 0;
					}
				} catch (@Pc(1277) IOException local1277) {
					this.method619();
				} catch (@Pc(1282) Exception local1282) {
					this.method612((byte) 6);
				}
			}
		} catch (@Pc(1287) RuntimeException local1287) {
			signlink.reporterror("24779, " + -737 + ", " + local1287.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)I")
	private int method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("18697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method612(@OriginalArg(0) byte arg0) {
		try {
			try {
				if (this.aClass19_1 != null) {
					this.aClass19_1.method163();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass19_1 = null;
			@Pc(17) boolean local17 = false;
			this.aBoolean218 = false;
			this.anInt837 = 0;
			this.aString27 = "";
			this.aString28 = "";
			this.method602();
			this.aClass21_1.method178();
			for (@Pc(43) int local43 = 0; local43 < 4; local43++) {
				this.aClass38Array1[local43].method453();
			}
			System.gc();
			this.method593();
			this.anInt867 = -1;
			this.anInt846 = -1;
			this.anInt915 = 0;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("44133, " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method613(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(15) int local15;
			if (this.aClass40_26 != null) {
				this.aClass40_26.method496();
				Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
				local15 = 151;
				if (arg2 != null) {
					local15 -= 7;
				}
				this.aClass8_Sub1_Sub2_Sub4_3.method561(0, 257, arg0, local15);
				this.aClass8_Sub1_Sub2_Sub4_3.method561(16777215, 256, arg0, local15 - 1);
				local15 += 15;
				if (arg2 != null) {
					this.aClass8_Sub1_Sub2_Sub4_3.method561(0, 257, arg2, local15);
					this.aClass8_Sub1_Sub2_Sub4_3.method561(16777215, 256, arg2, local15 - 1);
				}
				this.aClass40_26.method497(4, 4, super.aGraphics2);
			} else if (super.aClass40_2 != null) {
				super.aClass40_2.method496();
				Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray256;
				local15 = 251;
				Class8_Sub1_Sub2.method553(300, 0, 233, 50, 221);
				Class8_Sub1_Sub2.method554(233, 16777215, 221, 300, 50);
				if (arg2 != null) {
					local15 -= 7;
				}
				this.aClass8_Sub1_Sub2_Sub4_3.method561(0, 383, arg0, local15);
				this.aClass8_Sub1_Sub2_Sub4_3.method561(16777215, 382, arg0, local15 - 1);
				local15 += 15;
				if (arg2 != null) {
					this.aClass8_Sub1_Sub2_Sub4_3.method561(0, 383, arg2, local15);
					this.aClass8_Sub1_Sub2_Sub4_3.method561(16777215, 382, arg2, local15 - 1);
				}
				super.aClass40_2.method497(0, 0, super.aGraphics2);
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("43771, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method614(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt855 >= 100) {
					this.method688("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(23) String local23 = Class28.method309(Class28.method306(arg0));
					for (@Pc(29) int local29 = 0; local29 < this.anInt855; local29++) {
						if (this.aLongArray4[local29] == arg0) {
							this.method688("", local23 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(59) int local59 = 0; local59 < this.anInt1046; local59++) {
						if (this.aLongArray3[local59] == arg0) {
							this.method688("", "Please remove " + local23 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt855++] = arg0;
					this.aBoolean215 = true;
					this.aClass8_Sub1_Sub3_6.method395(240);
					this.aClass8_Sub1_Sub3_6.method402(66, arg0);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("86098, " + arg0 + ", " + 4 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
	private boolean method615(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) boolean local18 = false;
			@Pc(21) Class24 local21 = Class24.method259(arg0);
			for (@Pc(23) int local23 = 0; local23 < local21.anIntArray135.length && local21.anIntArray135[local23] != -1; local23++) {
				@Pc(37) Class24 local37 = Class24.method259(local21.anIntArray135[local23]);
				if (local37.anInt425 == 0) {
					local18 |= this.method615(local37.anInt454, (byte) 4, arg2);
				}
				@Pc(71) int local71;
				if (local37.anInt425 == 6 && (local37.anInt448 != -1 || local37.anInt449 != -1)) {
					@Pc(66) boolean local66 = this.method663(local37);
					if (local66) {
						local71 = local37.anInt449;
					} else {
						local71 = local37.anInt448;
					}
					if (local71 != -1) {
						@Pc(83) Class20 local83 = Class20.aClass20Array1[local71];
						local37.anInt434 += arg2;
						while (local37.anInt434 > local83.method170(local37.anInt438)) {
							local37.anInt434 -= local83.method170(local37.anInt438) + 1;
							local37.anInt438++;
							if (local37.anInt438 >= local83.anInt325) {
								local37.anInt438 -= local83.anInt326;
								if (local37.anInt438 < 0 || local37.anInt438 >= local83.anInt325) {
									local37.anInt438 = 0;
								}
							}
							local18 = true;
						}
					}
				}
				if (local37.anInt425 == 6 && local37.anInt435 != 0) {
					@Pc(154) int local154 = local37.anInt435 >> 16;
					local71 = local37.anInt435 << 16 >> 16;
					@Pc(165) int local165 = local154 * arg2;
					local71 *= arg2;
					local37.anInt430 = local37.anInt430 + local165 & 0x7FF;
					local37.anInt431 = local37.anInt431 + local71 & 0x7FF;
					local18 = true;
				}
			}
			return local18;
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("68129, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Z")
	private boolean method616() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("33323, " + -809 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method617() {
		try {
			this.aBoolean219 = true;
			try {
				@Pc(12) long local12 = System.currentTimeMillis();
				@Pc(14) int local14 = 0;
				@Pc(16) int local16 = 20;
				while (this.aBoolean243) {
					this.anInt936++;
					this.method654(this.aByte43);
					this.method654(this.aByte43);
					this.method589();
					local14++;
					if (local14 > 10) {
						@Pc(41) long local41 = System.currentTimeMillis();
						@Pc(50) int local50 = (int) (local41 - local12) / 10 - local16;
						local16 = 40 - local50;
						if (local16 < 5) {
							local16 = 5;
						}
						local14 = 0;
						local12 = local41;
					}
					try {
						Thread.sleep((long) local16);
					} catch (@Pc(68) Exception local68) {
					}
				}
			} catch (@Pc(74) Exception local74) {
			}
			this.aBoolean219 = false;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("17522, " + -931 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method618() {
		try {
			try {
				@Pc(16) int local16 = aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 + this.anInt883;
				@Pc(22) int local22 = aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 + this.anInt857;
				if (this.anInt851 - local16 < -500 || this.anInt851 - local16 > 500 || this.anInt852 - local22 < -500 || this.anInt852 - local22 > 500) {
					this.anInt851 = local16;
					this.anInt852 = local22;
				}
				if (this.anInt851 != local16) {
					this.anInt851 += (local16 - this.anInt851) / 16;
				}
				if (this.anInt852 != local22) {
					this.anInt852 += (local22 - this.anInt852) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt921 += (-this.anInt921 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt921 += (24 - this.anInt921) / 2;
				} else {
					this.anInt921 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt922 += (12 - this.anInt922) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt922 += (-this.anInt922 - 12) / 2;
				} else {
					this.anInt922 /= 2;
				}
				this.anInt920 = this.anInt920 + this.anInt921 / 2 & 0x7FF;
				this.anInt919 += this.anInt922 / 2;
				if (this.anInt919 < 128) {
					this.anInt919 = 128;
				}
				if (this.anInt919 > 383) {
					this.anInt919 = 383;
				}
				@Pc(209) int local209 = this.anInt851 >> 7;
				@Pc(214) int local214 = this.anInt852 >> 7;
				@Pc(224) int local224 = this.method666(this.anInt852, this.anInt851, this.anInt891);
				@Pc(226) int local226 = 0;
				@Pc(242) int local242;
				if (local209 > 3 && local214 > 3 && local209 < 100 && local214 < 100) {
					for (local242 = local209 - 4; local242 <= local209 + 4; local242++) {
						for (@Pc(248) int local248 = local214 - 4; local248 <= local214 + 4; local248++) {
							@Pc(253) int local253 = this.anInt891;
							if (local253 < 3 && (this.aByteArrayArrayArray8[1][local242][local248] & 0x2) == 2) {
								local253++;
							}
							@Pc(280) int local280 = local224 - this.anIntArrayArrayArray8[local253][local242][local248];
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
				if (local242 > this.anInt873) {
					this.anInt873 += (local242 - this.anInt873) / 24;
				} else if (local242 < this.anInt873) {
					this.anInt873 += (local242 - this.anInt873) / 80;
				}
			} catch (@Pc(344) Exception local344) {
				signlink.reporterror("glfc_ex " + aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 + "," + aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 + "," + this.anInt851 + "," + this.anInt852 + "," + this.anInt834 + "," + this.anInt835 + "," + this.anInt1001 + "," + this.anInt1002);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("8794, " + 680 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method619() {
		try {
			if (this.anInt904 > 0) {
				this.method612((byte) 6);
			} else {
				this.method613("Connection lost", 685, "Please wait - attempting to reestablish");
				this.anInt1048 = 0;
				this.anInt939 = 0;
				@Pc(20) Class19 local20 = this.aClass19_1;
				this.aBoolean218 = false;
				this.anInt1054 = 0;
				this.method725(this.aString27, this.aString28, true);
				if (!this.aBoolean218) {
					this.method612((byte) 6);
				}
				try {
					local20.method163();
				} catch (@Pc(48) Exception local48) {
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("39246, " + false + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;)V")
	@Override
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt888 = arg0;
			this.aString17 = arg1;
			this.method720();
			if (this.aClass35_2 == null) {
				super.method588(arg0, arg1);
			} else {
				this.aClass40_5.method496();
				this.aClass8_Sub1_Sub2_Sub4_4.method561(16777215, 180, "RuneScape is loading - please wait...", 54);
				Class8_Sub1_Sub2.method554(28, 9179409, 62, 304, 34);
				Class8_Sub1_Sub2.method554(29, 0, 63, 302, 32);
				Class8_Sub1_Sub2.method553(arg0 * 3, 9179409, 30, 30, 64);
				Class8_Sub1_Sub2.method553(300 - arg0 * 3, 0, arg0 * 3 + 30, 30, 64);
				this.aClass8_Sub1_Sub2_Sub4_4.method561(16777215, 180, arg1, 85);
				this.aClass40_5.method497(171, 202, super.aGraphics2);
				if (this.aBoolean212) {
					this.aBoolean212 = false;
					if (!this.aBoolean243) {
						this.aClass40_6.method497(0, 0, super.aGraphics2);
						this.aClass40_7.method497(0, 637, super.aGraphics2);
					}
					this.aClass40_3.method497(0, 128, super.aGraphics2);
					this.aClass40_4.method497(371, 202, super.aGraphics2);
					this.aClass40_8.method497(265, 0, super.aGraphics2);
					this.aClass40_9.method497(265, 562, super.aGraphics2);
					this.aClass40_10.method497(171, 128, super.aGraphics2);
					this.aClass40_11.method497(171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("47900, " + arg0 + ", " + -127 + ", " + arg1 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!OMJBPTVL;III)V")
	private void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean220) {
				this.anInt878 = 32;
			} else {
				this.anInt878 = 0;
			}
			this.aBoolean220 = false;
			if (this.anInt850 != -10523) {
				this.anInt901 = -1;
			}
			if (arg7 >= arg1 && arg7 < arg1 + 16 && arg3 >= arg6 && arg3 < arg6 + 16) {
				arg4.anInt451 -= this.anInt938 * 4;
				if (arg5 == 1) {
					this.aBoolean215 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean206 = true;
				}
			} else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg3 >= arg6 + arg0 - 16 && arg3 < arg6 + arg0) {
				arg4.anInt451 += this.anInt938 * 4;
				if (arg5 == 1) {
					this.aBoolean215 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean206 = true;
				}
			} else if (arg7 >= arg1 - this.anInt878 && arg7 < arg1 + this.anInt878 + 16 && arg3 >= arg6 + 16 && arg3 < arg6 + arg0 - 16 && this.anInt938 > 0) {
				@Pc(143) int local143 = (arg0 - 32) * arg0 / arg2;
				if (local143 < 8) {
					local143 = 8;
				}
				@Pc(158) int local158 = arg3 - arg6 - local143 / 2 - 16;
				@Pc(164) int local164 = arg0 - local143 - 32;
				arg4.anInt451 = (arg2 - arg0) * local158 / local164;
				if (arg5 == 1) {
					this.aBoolean215 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean206 = true;
				}
				this.aBoolean220 = true;
			}
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("35, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -10523 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11 = 2048 - arg2 & 0x7FF;
			@Pc(17) int local17 = 2048 - arg5 & 0x7FF;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = arg1;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(43) int local43;
			if (local11 != 0) {
				local29 = Class8_Sub1_Sub1_Sub3.anIntArray106[local11];
				local33 = Class8_Sub1_Sub1_Sub3.anIntArray107[local11];
				local43 = local33 * 0 - arg1 * local29 >> 16;
				local23 = local29 * 0 + arg1 * local33 >> 16;
				local21 = local43;
			}
			if (local17 != 0) {
				local29 = Class8_Sub1_Sub1_Sub3.anIntArray106[local17];
				local33 = Class8_Sub1_Sub1_Sub3.anIntArray107[local17];
				local43 = local23 * local29 + local33 * 0 >> 16;
				local23 = local23 * local33 - local29 * 0 >> 16;
				local19 = local43;
			}
			this.anInt949 = arg4 - local19;
			this.anInt950 = arg3 - local21;
			this.anInt951 = arg0 - local23;
			this.anInt952 = arg2;
			this.anInt953 = arg5;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("23419, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIILclient!OMJBPTVL;II)V")
	private void method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4.anInt425 == 0 && arg4.anIntArray135 != null && !arg4.aBoolean105 && (arg2 >= arg0 && arg6 >= arg1 && arg2 <= arg0 + arg4.anInt453 && arg6 <= arg1 + arg4.anInt440)) {
				@Pc(34) int local34 = arg4.anIntArray135.length;
				@Pc(45) int local45;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					local45 = arg4.anIntArray141[local36] + arg0;
					@Pc(54) int local54 = arg4.anIntArray138[local36] + arg1 - arg3;
					@Pc(60) Class24 local60 = Class24.method259(arg4.anIntArray135[local36]);
					@Pc(65) int local65 = local45 + local60.anInt428;
					@Pc(70) int local70 = local54 + local60.anInt452;
					if ((local60.anInt433 >= 0 || local60.anInt460 != 0) && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt453 && arg6 < local70 + local60.anInt440) {
						if (local60.anInt433 >= 0) {
							this.anInt968 = local60.anInt433;
						} else {
							this.anInt968 = local60.anInt454;
						}
					}
					if (local60.anInt425 == 8 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt453 && arg6 < local70 + local60.anInt440) {
						this.anInt1036 = local60.anInt454;
					}
					if (local60.anInt425 == 0) {
						this.method622(local65, local70, arg2, local60.anInt451, local60, arg5, arg6);
						if (local60.anInt450 > local60.anInt440) {
							this.method620(local60.anInt440, local65 + local60.anInt453, local60.anInt450, arg6, local60, arg5, local70, arg2);
						}
					} else {
						if (local60.anInt437 == 1 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt453 && arg6 < local70 + local60.anInt440) {
							@Pc(194) boolean local194 = false;
							if (local60.anInt447 != 0) {
								local194 = this.method608(local60);
							}
							if (!local194) {
								this.aStringArray13[this.anInt994] = local60.aString9;
								this.anIntArray270[this.anInt994] = 451;
								this.anIntArray269[this.anInt994] = local60.anInt454;
								this.anInt994++;
							}
						}
						if (local60.anInt437 == 2 && this.anInt982 == 0 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt453 && arg6 < local70 + local60.anInt440) {
							@Pc(258) String local258 = local60.aString11;
							if (local258.indexOf(" ") != -1) {
								local258 = local258.substring(0, local258.indexOf(" "));
							}
							this.aStringArray13[this.anInt994] = local258 + " @gre@" + local60.aString13;
							this.anIntArray270[this.anInt994] = 746;
							this.anIntArray269[this.anInt994] = local60.anInt454;
							this.anInt994++;
						}
						if (local60.anInt437 == 3 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt453 && arg6 < local70 + local60.anInt440) {
							this.aStringArray13[this.anInt994] = "Close";
							if (arg5 == 3) {
								this.anIntArray270[this.anInt994] = 424;
							} else {
								this.anIntArray270[this.anInt994] = 618;
							}
							this.anIntArray269[this.anInt994] = local60.anInt454;
							this.anInt994++;
						}
						if (local60.anInt437 == 4 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt453 && arg6 < local70 + local60.anInt440) {
							this.aStringArray13[this.anInt994] = local60.aString9;
							this.anIntArray270[this.anInt994] = 226;
							this.anIntArray269[this.anInt994] = local60.anInt454;
							this.anInt994++;
						}
						if (local60.anInt437 == 5 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt453 && arg6 < local70 + local60.anInt440) {
							this.aStringArray13[this.anInt994] = local60.aString9;
							this.anIntArray270[this.anInt994] = 737;
							this.anIntArray269[this.anInt994] = local60.anInt454;
							this.anInt994++;
						}
						if (local60.anInt437 == 6 && !this.aBoolean237 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt453 && arg6 < local70 + local60.anInt440) {
							this.aStringArray13[this.anInt994] = local60.aString9;
							this.anIntArray270[this.anInt994] = 655;
							this.anIntArray269[this.anInt994] = local60.anInt454;
							this.anInt994++;
						}
						if (local60.anInt425 == 2) {
							@Pc(517) int local517 = 0;
							for (@Pc(519) int local519 = 0; local519 < local60.anInt440; local519++) {
								for (@Pc(523) int local523 = 0; local523 < local60.anInt453; local523++) {
									@Pc(534) int local534 = local65 + local523 * (local60.anInt432 + 32);
									@Pc(543) int local543 = local70 + local519 * (local60.anInt446 + 32);
									if (local517 < 20) {
										local534 += local60.anIntArray134[local517];
										local543 += local60.anIntArray136[local517];
									}
									if (arg2 >= local534 && arg6 >= local543 && arg2 < local534 + 32 && arg6 < local543 + 32) {
										this.anInt859 = local517;
										this.anInt860 = local60.anInt454;
										if (local60.anIntArray137[local517] > 0) {
											@Pc(596) Class46 local596 = Class46.method532(local60.anIntArray137[local517] - 1);
											if (this.anInt978 == 1 && local60.aBoolean108) {
												if (local60.anInt454 != this.anInt980 || local517 != this.anInt979) {
													this.aStringArray13[this.anInt994] = "Use " + this.aString24 + " with @lre@" + local596.aString16;
													this.anIntArray270[this.anInt994] = 940;
													this.anIntArray271[this.anInt994] = local596.anInt734;
													this.anIntArray268[this.anInt994] = local517;
													this.anIntArray269[this.anInt994] = local60.anInt454;
													this.anInt994++;
												}
											} else if (this.anInt982 != 1 || !local60.aBoolean108) {
												@Pc(733) int local733;
												if (local60.aBoolean108) {
													for (local733 = 4; local733 >= 3; local733--) {
														if (local596.aStringArray6 != null && local596.aStringArray6[local733] != null) {
															this.aStringArray13[this.anInt994] = local596.aStringArray6[local733] + " @lre@" + local596.aString16;
															if (local733 == 3) {
																this.anIntArray270[this.anInt994] = 800;
															}
															if (local733 == 4) {
																this.anIntArray270[this.anInt994] = 529;
															}
															this.anIntArray271[this.anInt994] = local596.anInt734;
															this.anIntArray268[this.anInt994] = local517;
															this.anIntArray269[this.anInt994] = local60.anInt454;
															this.anInt994++;
														} else if (local733 == 4) {
															this.aStringArray13[this.anInt994] = "Drop @lre@" + local596.aString16;
															this.anIntArray270[this.anInt994] = 529;
															this.anIntArray271[this.anInt994] = local596.anInt734;
															this.anIntArray268[this.anInt994] = local517;
															this.anIntArray269[this.anInt994] = local60.anInt454;
															this.anInt994++;
														}
													}
												}
												if (local60.aBoolean106) {
													this.aStringArray13[this.anInt994] = "Use @lre@" + local596.aString16;
													this.anIntArray270[this.anInt994] = 11;
													this.anIntArray271[this.anInt994] = local596.anInt734;
													this.anIntArray268[this.anInt994] = local517;
													this.anIntArray269[this.anInt994] = local60.anInt454;
													this.anInt994++;
												}
												if (local60.aBoolean108 && local596.aStringArray6 != null) {
													for (local733 = 2; local733 >= 0; local733--) {
														if (local596.aStringArray6[local733] != null) {
															this.aStringArray13[this.anInt994] = local596.aStringArray6[local733] + " @lre@" + local596.aString16;
															if (local733 == 0) {
																this.anIntArray270[this.anInt994] = 8;
															}
															if (local733 == 1) {
																this.anIntArray270[this.anInt994] = 581;
															}
															if (local733 == 2) {
																this.anIntArray270[this.anInt994] = 197;
															}
															this.anIntArray271[this.anInt994] = local596.anInt734;
															this.anIntArray268[this.anInt994] = local517;
															this.anIntArray269[this.anInt994] = local60.anInt454;
															this.anInt994++;
														}
													}
												}
												if (local60.aStringArray2 != null) {
													for (local733 = 4; local733 >= 0; local733--) {
														if (local60.aStringArray2[local733] != null) {
															this.aStringArray13[this.anInt994] = local60.aStringArray2[local733] + " @lre@" + local596.aString16;
															if (local733 == 0) {
																this.anIntArray270[this.anInt994] = 378;
															}
															if (local733 == 1) {
																this.anIntArray270[this.anInt994] = 350;
															}
															if (local733 == 2) {
																this.anIntArray270[this.anInt994] = 236;
															}
															if (local733 == 3) {
																this.anIntArray270[this.anInt994] = 815;
															}
															if (local733 == 4) {
																this.anIntArray270[this.anInt994] = 519;
															}
															this.anIntArray271[this.anInt994] = local596.anInt734;
															this.anIntArray268[this.anInt994] = local517;
															this.anIntArray269[this.anInt994] = local60.anInt454;
															this.anInt994++;
														}
													}
												}
												this.aStringArray13[this.anInt994] = "Examine @lre@" + local596.aString16;
												this.anIntArray270[this.anInt994] = 1107;
												this.anIntArray271[this.anInt994] = local596.anInt734;
												this.anIntArray268[this.anInt994] = local517;
												this.anIntArray269[this.anInt994] = local60.anInt454;
												this.anInt994++;
											} else if ((this.anInt984 & 0x10) == 16) {
												this.aStringArray13[this.anInt994] = this.aString25 + " @lre@" + local596.aString16;
												this.anIntArray270[this.anInt994] = 666;
												this.anIntArray271[this.anInt994] = local596.anInt734;
												this.anIntArray268[this.anInt994] = local517;
												this.anIntArray269[this.anInt994] = local60.anInt454;
												this.anInt994++;
											}
										}
									}
									local517++;
								}
							}
						}
					}
				}
				if (this.aByte33 != 0) {
					for (local45 = 1; local45 > 0; local45++) {
					}
				}
			}
		} catch (@Pc(1177) RuntimeException local1177) {
			signlink.reporterror("40581, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	private boolean method623(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt1046; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray10[local7])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass8_Sub1_Sub1_Sub1_Sub1_1.aString4);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("70322, " + arg0 + ", " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OMJBPTVL;B)Z")
	private boolean method624(@OriginalArg(0) Class24 arg0) {
		try {
			@Pc(12) int local12 = arg0.anInt447;
			if (this.anInt1047 == 2) {
				if (local12 == 201) {
					this.aBoolean206 = true;
					this.anInt985 = 0;
					this.aBoolean240 = true;
					this.aString30 = "";
					this.anInt967 = 1;
					this.aString26 = "Enter name of friend to add to list";
				}
				if (local12 == 202) {
					this.aBoolean206 = true;
					this.anInt985 = 0;
					this.aBoolean240 = true;
					this.aString30 = "";
					this.anInt967 = 2;
					this.aString26 = "Enter name of friend to delete from list";
				}
			}
			if (local12 == 205) {
				this.anInt904 = 250;
				return true;
			}
			if (local12 == 501) {
				this.aBoolean206 = true;
				this.anInt985 = 0;
				this.aBoolean240 = true;
				this.aString30 = "";
				this.anInt967 = 4;
				this.aString26 = "Enter name of player to add to list";
			}
			if (local12 == 502) {
				this.aBoolean206 = true;
				this.anInt985 = 0;
				this.aBoolean240 = true;
				this.aString30 = "";
				this.anInt967 = 5;
				this.aString26 = "Enter name of player to delete from list";
			}
			@Pc(120) int local120;
			@Pc(124) int local124;
			@Pc(129) int local129;
			if (local12 >= 300 && local12 <= 313) {
				local120 = (local12 - 300) / 2;
				local124 = local12 & 0x1;
				local129 = this.anIntArray260[local120];
				if (local129 != -1) {
					while (true) {
						if (local124 == 0) {
							local129--;
							if (local129 < 0) {
								local129 = Class9.anInt160 - 1;
							}
						}
						if (local124 == 1) {
							local129++;
							if (local129 >= Class9.anInt160) {
								local129 = 0;
							}
						}
						if (!Class9.aClass9Array1[local129].aBoolean28 && Class9.aClass9Array1[local129].anInt161 == local120 + (this.aBoolean228 ? 0 : 7)) {
							this.anIntArray260[local120] = local129;
							this.aBoolean214 = true;
							break;
						}
					}
				}
			}
			if (local12 >= 314 && local12 <= 323) {
				local120 = (local12 - 314) / 2;
				local124 = local12 & 0x1;
				local129 = this.anIntArray220[local120];
				if (local124 == 0) {
					local129--;
					if (local129 < 0) {
						local129 = anIntArrayArray24[local120].length - 1;
					}
				}
				if (local124 == 1) {
					local129++;
					if (local129 >= anIntArrayArray24[local120].length) {
						local129 = 0;
					}
				}
				this.anIntArray220[local120] = local129;
				this.aBoolean214 = true;
			}
			if (local12 == 324 && !this.aBoolean228) {
				this.aBoolean228 = true;
				this.method726(749);
			}
			if (local12 == 325 && this.aBoolean228) {
				this.aBoolean228 = false;
				this.method726(749);
			}
			if (local12 == 326) {
				this.aClass8_Sub1_Sub3_6.method395(199);
				this.aClass8_Sub1_Sub3_6.method396(this.aBoolean228 ? 0 : 1);
				for (local120 = 0; local120 < 7; local120++) {
					this.aClass8_Sub1_Sub3_6.method396(this.anIntArray260[local120]);
				}
				for (local124 = 0; local124 < 5; local124++) {
					this.aClass8_Sub1_Sub3_6.method396(this.anIntArray220[local124]);
				}
				return true;
			}
			if (local12 == 620) {
				this.aBoolean217 = !this.aBoolean217;
			}
			if (local12 >= 601 && local12 <= 613) {
				this.method675((byte) 2);
				if (this.aString23.length() > 0) {
					this.aClass8_Sub1_Sub3_6.method395(144);
					this.aClass8_Sub1_Sub3_6.method402(66, Class28.method305(this.aString23));
					this.aClass8_Sub1_Sub3_6.method396(local12 - 601);
					this.aClass8_Sub1_Sub3_6.method396(this.aBoolean217 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("14689, " + arg0 + ", " + -69 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method625(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method626(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == -34 && super.anInt817 == 1) {
				if (super.anInt818 >= 539 && super.anInt818 <= 573 && super.anInt819 >= 169 && super.anInt819 < 205 && this.anIntArray275[0] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 0;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 569 && super.anInt818 <= 599 && super.anInt819 >= 168 && super.anInt819 < 205 && this.anIntArray275[1] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 1;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 597 && super.anInt818 <= 627 && super.anInt819 >= 168 && super.anInt819 < 205 && this.anIntArray275[2] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 2;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 625 && super.anInt818 <= 669 && super.anInt819 >= 168 && super.anInt819 < 203 && this.anIntArray275[3] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 3;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 666 && super.anInt818 <= 696 && super.anInt819 >= 168 && super.anInt819 < 205 && this.anIntArray275[4] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 4;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 694 && super.anInt818 <= 724 && super.anInt819 >= 168 && super.anInt819 < 205 && this.anIntArray275[5] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 5;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 722 && super.anInt818 <= 756 && super.anInt819 >= 169 && super.anInt819 < 205 && this.anIntArray275[6] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 6;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 540 && super.anInt818 <= 574 && super.anInt819 >= 466 && super.anInt819 < 502 && this.anIntArray275[7] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 7;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 572 && super.anInt818 <= 602 && super.anInt819 >= 466 && super.anInt819 < 503 && this.anIntArray275[8] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 8;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 599 && super.anInt818 <= 629 && super.anInt819 >= 466 && super.anInt819 < 503 && this.anIntArray275[9] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 9;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 627 && super.anInt818 <= 671 && super.anInt819 >= 467 && super.anInt819 < 502 && this.anIntArray275[10] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 10;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 669 && super.anInt818 <= 699 && super.anInt819 >= 466 && super.anInt819 < 503 && this.anIntArray275[11] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 11;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 696 && super.anInt818 <= 726 && super.anInt819 >= 466 && super.anInt819 < 503 && this.anIntArray275[12] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 12;
					this.aBoolean231 = true;
				}
				if (super.anInt818 >= 724 && super.anInt818 <= 758 && super.anInt819 >= 466 && super.anInt819 < 502 && this.anIntArray275[13] != -1) {
					this.aBoolean215 = true;
					this.anInt966 = 13;
					this.aBoolean231 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("8303, " + arg0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TQYMAXSO;IB)V")
	private void method627(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(7) int local7;
			if (arg2 != this.aByte32) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			while (arg0.anInt621 + 10 < arg1 * 8) {
				local7 = arg0.method417(11);
				if (local7 == 2047) {
					break;
				}
				if (this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local7] == null) {
					this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local7] = new Class8_Sub1_Sub1_Sub1_Sub1();
					if (this.aClass8_Sub1_Sub3Array1[local7] != null) {
						this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local7].method64(this.aClass8_Sub1_Sub3Array1[local7]);
					}
				}
				this.anIntArray249[this.anInt975++] = local7;
				@Pc(71) Class8_Sub1_Sub1_Sub1_Sub1 local71 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local7];
				local71.anInt191 = anInt917;
				@Pc(79) int local79 = arg0.method417(5);
				if (local79 > 15) {
					local79 -= 32;
				}
				@Pc(88) int local88 = arg0.method417(1);
				@Pc(93) int local93 = arg0.method417(1);
				if (local93 == 1) {
					this.anIntArray250[this.anInt976++] = local7;
				}
				@Pc(112) int local112 = arg0.method417(5);
				if (local112 > 15) {
					local112 -= 32;
				}
				local71.method86(local88 == 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0] + local112, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0] + local79);
			}
			arg0.method418();
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("3223, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIB)V")
	private void method628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray12[local3] != null) {
					@Pc(15) int local15 = this.anIntArray247[local3];
					@Pc(26) int local26 = this.anInt836 + 70 + 4 - local1 * 14;
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
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt934 == 0 || this.anInt934 == 1 && this.method623(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass8_Sub1_Sub1_Sub1_Sub1_1.aString4)) {
							if (this.anInt926 >= 1) {
								this.aStringArray13[this.anInt994] = "Report abuse @whi@" + local34;
								this.anIntArray270[this.anInt994] = 550;
								this.anInt994++;
							}
							this.aStringArray13[this.anInt994] = "Add ignore @whi@" + local34;
							this.anIntArray270[this.anInt994] = 955;
							this.anInt994++;
							this.aStringArray13[this.anInt994] = "Add friend @whi@" + local34;
							this.anIntArray270[this.anInt994] = 646;
							this.anInt994++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt946 == 0 && (local15 == 7 || this.anInt965 == 0 || this.anInt965 == 1 && this.method623(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt926 >= 1) {
								this.aStringArray13[this.anInt994] = "Report abuse @whi@" + local34;
								this.anIntArray270[this.anInt994] = 550;
								this.anInt994++;
							}
							this.aStringArray13[this.anInt994] = "Add ignore @whi@" + local34;
							this.anIntArray270[this.anInt994] = 955;
							this.anInt994++;
							this.aStringArray13[this.anInt994] = "Add friend @whi@" + local34;
							this.anIntArray270[this.anInt994] = 646;
							this.anInt994++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt898 == 0 || this.anInt898 == 1 && this.method623(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray13[this.anInt994] = "Accept trade @whi@" + local34;
							this.anIntArray270[this.anInt994] = 365;
							this.anInt994++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt946 == 0 && this.anInt965 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt898 == 0 || this.anInt898 == 1 && this.method623(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray13[this.anInt994] = "Accept challenge @whi@" + local34;
							this.anIntArray270[this.anInt994] = 355;
							this.anInt994++;
						}
						local1++;
					}
				}
			}
			if (arg2 == 0) {
				@Pc(401) boolean local401 = false;
			} else {
				this.anInt962 = this.aClass22_2.method229();
			}
		} catch (@Pc(409) RuntimeException local409) {
			signlink.reporterror("90398, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local409.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
	private void method629(@OriginalArg(0) boolean arg0) {
		try {
			this.method720();
			this.aClass40_5.method496();
			this.aClass8_Sub1_Sub2_Sub3_1.method494(0, 0);
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt837 == 0) {
				this.aClass8_Sub1_Sub2_Sub4_2.method562(180, 180, true, this.aClass1_Sub1_1.aString6, 7711145);
				local48 = 80;
				this.aClass8_Sub1_Sub2_Sub4_4.method562(80, 180, true, "Welcome to RuneScape", 16776960);
				local60 = local48 + 30;
				this.aClass8_Sub1_Sub2_Sub3_2.method494(27, 100);
				this.aClass8_Sub1_Sub2_Sub4_4.method562(125, 100, true, "New User", 16777215);
				this.aClass8_Sub1_Sub2_Sub3_2.method494(187, 100);
				this.aClass8_Sub1_Sub2_Sub4_4.method562(125, 260, true, "Existing User", 16777215);
			}
			if (this.anInt837 == 2) {
				local48 = 60;
				if (this.aString19.length() > 0) {
					this.aClass8_Sub1_Sub2_Sub4_4.method562(45, 180, true, this.aString19, 16776960);
					this.aClass8_Sub1_Sub2_Sub4_4.method562(60, 180, true, this.aString20, 16776960);
					local60 = local48 + 30;
				} else {
					this.aClass8_Sub1_Sub2_Sub4_4.method562(53, 180, true, this.aString20, 16776960);
					local60 = local48 + 30;
				}
				this.aClass8_Sub1_Sub2_Sub4_4.method569(16777215, 90, true, 90, "Username: " + this.aString27 + (this.anInt869 == 0 & anInt917 % 40 < 20 ? "@yel@|" : ""));
				local60 += 15;
				this.aClass8_Sub1_Sub2_Sub4_4.method569(16777215, 92, true, 105, "Password: " + Class28.method310(this.aString28) + (this.anInt869 == 1 & anInt917 % 40 < 20 ? "@yel@|" : ""));
				local60 += 15;
				if (!arg0) {
					this.aClass8_Sub1_Sub2_Sub3_2.method494(27, 130);
					this.aClass8_Sub1_Sub2_Sub4_4.method562(155, 100, true, "Login", 16777215);
					this.aClass8_Sub1_Sub2_Sub3_2.method494(187, 130);
					this.aClass8_Sub1_Sub2_Sub4_4.method562(155, 260, true, "Cancel", 16777215);
				}
			}
			if (this.anInt837 == 3) {
				this.aClass8_Sub1_Sub2_Sub4_4.method562(40, 180, true, "Create a free account", 16776960);
				local48 = 65;
				this.aClass8_Sub1_Sub2_Sub4_4.method562(65, 180, true, "To create a new account you need to", 16777215);
				local60 = local48 + 15;
				this.aClass8_Sub1_Sub2_Sub4_4.method562(80, 180, true, "go back to the main RuneScape webpage", 16777215);
				local60 += 15;
				this.aClass8_Sub1_Sub2_Sub4_4.method562(95, 180, true, "and choose the 'create account'", 16777215);
				local60 += 15;
				this.aClass8_Sub1_Sub2_Sub4_4.method562(110, 180, true, "button near the top of that page.", 16777215);
				local60 += 15;
				this.aClass8_Sub1_Sub2_Sub3_2.method494(107, 130);
				this.aClass8_Sub1_Sub2_Sub4_4.method562(155, 180, true, "Cancel", 16777215);
			}
			this.aClass40_5.method497(171, 202, super.aGraphics2);
			if (this.aBoolean212) {
				this.aBoolean212 = false;
				this.aClass40_3.method497(0, 128, super.aGraphics2);
				this.aClass40_4.method497(371, 202, super.aGraphics2);
				this.aClass40_8.method497(265, 0, super.aGraphics2);
				this.aClass40_9.method497(265, 562, super.aGraphics2);
				this.aClass40_10.method497(171, 128, super.aGraphics2);
				this.aClass40_11.method497(171, 562, super.aGraphics2);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("83780, " + arg0 + ", " + true + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method630() {
		try {
			@Pc(2) int local2 = this.anInt1021;
			@Pc(5) int local5 = this.anInt1022;
			@Pc(8) int local8 = this.anInt1023;
			@Pc(11) int local11 = this.anInt1024;
			Class8_Sub1_Sub2.method553(local8, 6116423, local2, local11, local5);
			Class8_Sub1_Sub2.method553(local8 - 2, 0, local2 + 1, 16, local5 + 1);
			Class8_Sub1_Sub2.method554(local2 + 1, 0, local5 + 18, local8 - 2, local11 - 19);
			this.aClass8_Sub1_Sub2_Sub4_4.method565(local5 + 14, 6116423, "Choose Option", local2 + 3);
			@Pc(63) int local63 = super.anInt812;
			@Pc(66) int local66 = super.anInt813;
			if (this.anInt1020 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt1020 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt1020 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt994; local85++) {
				@Pc(100) int local100 = local5 + (this.anInt994 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local100 - 13 && local66 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass8_Sub1_Sub2_Sub4_4.method569(local102, local2 + 3, true, local100, this.aStringArray13[local85]);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("95561, " + -10414 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIIIIIII)Z")
	private boolean method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray23[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg10;
			@Pc(39) int local39 = arg6;
			this.anIntArrayArray23[arg10][arg6] = 99;
			this.anIntArrayArray22[arg10][arg6] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray218[0] = arg10;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray219[0] = arg6;
			@Pc(70) boolean local70 = false;
			if (this.anInt899 > 2 || this.anInt899 < 2) {
				this.aClass7ArrayArrayArray1 = null;
			}
			@Pc(85) int local85 = this.anIntArray218.length;
			@Pc(92) int[][] local92 = this.aClass38Array1[this.anInt891].anIntArrayArray20;
			@Pc(204) int local204;
			while (local57 != local66) {
				local11 = this.anIntArray218[local57];
				local39 = this.anIntArray219[local57];
				local57 = (local57 + 1) % local85;
				if (local11 == arg9 && local39 == arg7) {
					local70 = true;
					break;
				}
				if (arg1 != 0) {
					if ((arg1 < 5 || arg1 == 10) && this.aClass38Array1[this.anInt891].method462(local11, arg9, arg4, local39, arg1 - 1, arg7)) {
						local70 = true;
						break;
					}
					if (arg1 < 10 && this.aClass38Array1[this.anInt891].method463(arg4, local39, arg1 - 1, arg7, arg9, this.anInt945, local11)) {
						local70 = true;
						break;
					}
				}
				if (arg0 != 0 && arg5 != 0 && this.aClass38Array1[this.anInt891].method464(arg8, arg5, arg0, local11, local39, arg9, arg7)) {
					local70 = true;
					break;
				}
				local204 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray23[local11 - 1][local39] == 0 && (local92[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray218[local66] = local11 - 1;
					this.anIntArray219[local66] = local39;
					local66 = (local66 + 1) % local85;
					this.anIntArrayArray23[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local204;
				}
				if (local11 < 103 && this.anIntArrayArray23[local11 + 1][local39] == 0 && (local92[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray218[local66] = local11 + 1;
					this.anIntArray219[local66] = local39;
					local66 = (local66 + 1) % local85;
					this.anIntArrayArray23[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local204;
				}
				if (local39 > 0 && this.anIntArrayArray23[local11][local39 - 1] == 0 && (local92[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray218[local66] = local11;
					this.anIntArray219[local66] = local39 - 1;
					local66 = (local66 + 1) % local85;
					this.anIntArrayArray23[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local204;
				}
				if (local39 < 103 && this.anIntArrayArray23[local11][local39 + 1] == 0 && (local92[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray218[local66] = local11;
					this.anIntArray219[local66] = local39 + 1;
					local66 = (local66 + 1) % local85;
					this.anIntArrayArray23[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local204;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray23[local11 - 1][local39 - 1] == 0 && (local92[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local92[local11 - 1][local39] & 0x1280108) == 0 && (local92[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray218[local66] = local11 - 1;
					this.anIntArray219[local66] = local39 - 1;
					local66 = (local66 + 1) % local85;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local204;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray23[local11 + 1][local39 - 1] == 0 && (local92[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local92[local11 + 1][local39] & 0x1280180) == 0 && (local92[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray218[local66] = local11 + 1;
					this.anIntArray219[local66] = local39 - 1;
					local66 = (local66 + 1) % local85;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local204;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray23[local11 - 1][local39 + 1] == 0 && (local92[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local92[local11 - 1][local39] & 0x1280108) == 0 && (local92[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray218[local66] = local11 - 1;
					this.anIntArray219[local66] = local39 + 1;
					local66 = (local66 + 1) % local85;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local204;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray23[local11 + 1][local39 + 1] == 0 && (local92[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local92[local11 + 1][local39] & 0x1280180) == 0 && (local92[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray218[local66] = local11 + 1;
					this.anIntArray219[local66] = local39 + 1;
					local66 = (local66 + 1) % local85;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local204;
				}
			}
			this.anInt930 = 0;
			@Pc(820) int local820;
			@Pc(826) int local826;
			@Pc(832) int local832;
			if (!local70) {
				if (!arg3) {
					return false;
				}
				local204 = 1000;
				local820 = 100;
				for (local826 = arg9 - 10; local826 <= arg9 + 10; local826++) {
					for (local832 = arg7 - 10; local832 <= arg7 + 10; local832++) {
						if (local826 >= 0 && local832 >= 0 && local826 < 104 && local832 < 104 && this.anIntArrayArray22[local826][local832] < 100) {
							@Pc(854) int local854 = 0;
							if (local826 < arg9) {
								local854 = arg9 - local826;
							} else if (local826 > arg9 + arg0 - 1) {
								local854 = local826 + 1 - arg9 - arg0;
							}
							@Pc(880) int local880 = 0;
							if (local832 < arg7) {
								local880 = arg7 - local832;
							} else if (local832 > arg7 + arg5 - 1) {
								local880 = local832 + 1 - arg7 - arg5;
							}
							@Pc(912) int local912 = local854 * local854 + local880 * local880;
							if (local912 < local204 || local912 == local204 && this.anIntArrayArray22[local826][local832] < local820) {
								local204 = local912;
								local820 = this.anIntArrayArray22[local826][local832];
								local11 = local826;
								local39 = local832;
							}
						}
					}
				}
				if (local204 == 1000) {
					return false;
				}
				if (local11 == arg10 && local39 == arg6) {
					return false;
				}
				this.anInt930 = 1;
			}
			@Pc(973) byte local973 = 0;
			this.anIntArray218[0] = local11;
			local57 = local973 + 1;
			this.anIntArray219[0] = local39;
			local204 = local820 = this.anIntArrayArray23[local11][local39];
			while (local11 != arg10 || local39 != arg6) {
				if (local204 != local820) {
					local820 = local204;
					this.anIntArray218[local57] = local11;
					this.anIntArray219[local57++] = local39;
				}
				if ((local204 & 0x2) != 0) {
					local11++;
				} else if ((local204 & 0x8) != 0) {
					local11--;
				}
				if ((local204 & 0x1) != 0) {
					local39++;
				} else if ((local204 & 0x4) != 0) {
					local39--;
				}
				local204 = this.anIntArrayArray23[local11][local39];
			}
			if (local57 > 0) {
				local85 = local57;
				if (local57 > 25) {
					local85 = 25;
				}
				local57--;
				@Pc(1063) int local1063 = this.anIntArray218[local57];
				local826 = this.anIntArray219[local57];
				if (arg2 == 0) {
					this.aClass8_Sub1_Sub3_6.method395(125);
					this.aClass8_Sub1_Sub3_6.method396(local85 + local85 + 3);
				}
				if (arg2 == 1) {
					this.aClass8_Sub1_Sub3_6.method395(209);
					this.aClass8_Sub1_Sub3_6.method396(local85 + local85 + 3 + 14);
				}
				if (arg2 == 2) {
					this.aClass8_Sub1_Sub3_6.method395(39);
					this.aClass8_Sub1_Sub3_6.method396(local85 + local85 + 3);
				}
				this.aClass8_Sub1_Sub3_6.method433(local826 + this.anInt1002);
				this.aClass8_Sub1_Sub3_6.method396(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass8_Sub1_Sub3_6.method397(local1063 + this.anInt1001);
				this.anInt939 = this.anIntArray218[0];
				this.anInt940 = this.anIntArray219[0];
				for (local832 = 1; local832 < local85; local832++) {
					local57--;
					this.aClass8_Sub1_Sub3_6.method422(this.anIntArray218[local57] - local1063);
					this.aClass8_Sub1_Sub3_6.method423(this.anIntArray219[local57] - local826);
				}
				return true;
			} else if (arg2 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1195) RuntimeException local1195) {
			signlink.reporterror("5013, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1195.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(15) int local15 = this.aClass21_1.method204(arg3, arg1, arg2);
			@Pc(25) int local25;
			@Pc(31) int local31;
			@Pc(35) int local35;
			@Pc(37) int local37;
			@Pc(59) int local59;
			@Pc(65) int local65;
			if (local15 != 0) {
				local25 = this.aClass21_1.method208(arg3, arg1, arg2, local15);
				local31 = local25 >> 6 & 0x3;
				local35 = local25 & 0x1F;
				local37 = arg0;
				if (local15 > 0) {
					local37 = arg4;
				}
				@Pc(45) int[] local45 = this.aClass8_Sub1_Sub2_Sub2_10.anIntArray174;
				local59 = arg1 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local65 = local15 >> 14 & 0x7FFF;
				@Pc(68) Class42 local68 = Class42.method512(local65);
				if (local68.anInt693 == -1) {
					if (local35 == 0 || local35 == 2) {
						if (local31 == 0) {
							local45[local59] = local37;
							local45[local59 + 512] = local37;
							local45[local59 + 1024] = local37;
							local45[local59 + 1536] = local37;
						} else if (local31 == 1) {
							local45[local59] = local37;
							local45[local59 + 1] = local37;
							local45[local59 + 2] = local37;
							local45[local59 + 3] = local37;
						} else if (local31 == 2) {
							local45[local59 + 3] = local37;
							local45[local59 + 3 + 512] = local37;
							local45[local59 + 3 + 1024] = local37;
							local45[local59 + 3 + 1536] = local37;
						} else if (local31 == 3) {
							local45[local59 + 1536] = local37;
							local45[local59 + 1536 + 1] = local37;
							local45[local59 + 1536 + 2] = local37;
							local45[local59 + 1536 + 3] = local37;
						}
					}
					if (local35 == 3) {
						if (local31 == 0) {
							local45[local59] = local37;
						} else if (local31 == 1) {
							local45[local59 + 3] = local37;
						} else if (local31 == 2) {
							local45[local59 + 3 + 1536] = local37;
						} else if (local31 == 3) {
							local45[local59 + 1536] = local37;
						}
					}
					if (local35 == 2) {
						if (local31 == 3) {
							local45[local59] = local37;
							local45[local59 + 512] = local37;
							local45[local59 + 1024] = local37;
							local45[local59 + 1536] = local37;
						} else if (local31 == 0) {
							local45[local59] = local37;
							local45[local59 + 1] = local37;
							local45[local59 + 2] = local37;
							local45[local59 + 3] = local37;
						} else if (local31 == 1) {
							local45[local59 + 3] = local37;
							local45[local59 + 3 + 512] = local37;
							local45[local59 + 3 + 1024] = local37;
							local45[local59 + 3 + 1536] = local37;
						} else if (local31 == 2) {
							local45[local59 + 1536] = local37;
							local45[local59 + 1536 + 1] = local37;
							local45[local59 + 1536 + 2] = local37;
							local45[local59 + 1536 + 3] = local37;
						}
					}
				} else {
					@Pc(78) Class8_Sub1_Sub2_Sub3 local78 = this.aClass8_Sub1_Sub2_Sub3Array2[local68.anInt693];
					if (local78 != null) {
						@Pc(90) int local90 = (local68.anInt690 * 4 - local78.anInt666) / 2;
						@Pc(100) int local100 = (local68.anInt707 * 4 - local78.anInt667) / 2;
						local78.method494(arg1 * 4 + local90 + 48, (104 - arg2 - local68.anInt707) * 4 + 48 + local100);
					}
				}
			}
			local15 = this.aClass21_1.method206(arg3, arg1, arg2);
			if (local15 != 0) {
				local25 = this.aClass21_1.method208(arg3, arg1, arg2, local15);
				local31 = local25 >> 6 & 0x3;
				local35 = local25 & 0x1F;
				local37 = local15 >> 14 & 0x7FFF;
				@Pc(454) Class42 local454 = Class42.method512(local37);
				@Pc(486) int local486;
				if (local454.anInt693 != -1) {
					@Pc(464) Class8_Sub1_Sub2_Sub3 local464 = this.aClass8_Sub1_Sub2_Sub3Array2[local454.anInt693];
					if (local464 != null) {
						local65 = (local454.anInt690 * 4 - local464.anInt666) / 2;
						local486 = (local454.anInt707 * 4 - local464.anInt667) / 2;
						local464.method494(arg1 * 4 + local65 + 48, (104 - arg2 - local454.anInt707) * 4 + 48 + local486);
					}
				} else if (local35 == 9) {
					local59 = 15658734;
					if (local15 > 0) {
						local59 = 15597568;
					}
					@Pc(523) int[] local523 = this.aClass8_Sub1_Sub2_Sub2_10.anIntArray174;
					local486 = arg1 * 4 + (103 - arg2) * 512 * 4 + 24624;
					if (local31 == 0 || local31 == 2) {
						local523[local486 + 1536] = local59;
						local523[local486 + 1024 + 1] = local59;
						local523[local486 + 512 + 2] = local59;
						local523[local486 + 3] = local59;
					} else {
						local523[local486] = local59;
						local523[local486 + 512 + 1] = local59;
						local523[local486 + 1024 + 2] = local59;
						local523[local486 + 1536 + 3] = local59;
					}
				}
			}
			local15 = this.aClass21_1.method207(arg3, arg1, arg2);
			if (local15 != 0) {
				local25 = local15 >> 14 & 0x7FFF;
				@Pc(618) Class42 local618 = Class42.method512(local25);
				if (local618.anInt693 != -1) {
					@Pc(628) Class8_Sub1_Sub2_Sub3 local628 = this.aClass8_Sub1_Sub2_Sub3Array2[local618.anInt693];
					if (local628 != null) {
						local37 = (local618.anInt690 * 4 - local628.anInt666) / 2;
						@Pc(650) int local650 = (local618.anInt707 * 4 - local628.anInt667) / 2;
						local628.method494(arg1 * 4 + local37 + 48, (104 - arg2 - local618.anInt707) * 4 + 48 + local650);
						return;
					}
				}
			}
		} catch (@Pc(674) RuntimeException local674) {
			signlink.reporterror("51277, " + -1730 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local674.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method633() {
		try {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (this.anInt837 == 0) {
				local21 = super.anInt808 / 2 - 80;
				local28 = super.anInt809 / 2 + 20;
				local28 += 20;
				if (super.anInt817 == 1 && super.anInt818 >= local21 - 75 && super.anInt818 <= local21 + 75 && super.anInt819 >= local28 - 20 && super.anInt819 <= local28 + 20) {
					this.anInt837 = 3;
					this.anInt869 = 0;
				}
				local21 = super.anInt808 / 2 + 80;
				if (super.anInt817 == 1 && super.anInt818 >= local21 - 75 && super.anInt818 <= local21 + 75 && super.anInt819 >= local28 - 20 && super.anInt819 <= local28 + 20) {
					this.aString19 = "";
					this.aString20 = "Enter your username & password.";
					this.anInt837 = 2;
					this.anInt869 = 0;
				}
			} else if (this.anInt837 == 2) {
				local21 = super.anInt809 / 2 - 40;
				local21 += 30;
				local21 += 25;
				if (super.anInt817 == 1 && super.anInt819 >= local21 - 15 && super.anInt819 < local21) {
					this.anInt869 = 0;
				}
				local21 += 15;
				if (super.anInt817 == 1 && super.anInt819 >= local21 - 15 && super.anInt819 < local21) {
					this.anInt869 = 1;
				}
				local21 += 15;
				local28 = super.anInt808 / 2 - 80;
				@Pc(174) int local174 = super.anInt809 / 2 + 50;
				@Pc(175) int local175 = local174 + 20;
				if (super.anInt817 == 1 && super.anInt818 >= local28 - 75 && super.anInt818 <= local28 + 75 && super.anInt819 >= local175 - 20 && super.anInt819 <= local175 + 20) {
					this.anInt1054 = 0;
					this.method725(this.aString27, this.aString28, false);
					if (this.aBoolean218) {
						return;
					}
				}
				local28 = super.anInt808 / 2 + 80;
				if (super.anInt817 == 1 && super.anInt818 >= local28 - 75 && super.anInt818 <= local28 + 75 && super.anInt819 >= local175 - 20 && super.anInt819 <= local175 + 20) {
					this.anInt837 = 0;
					this.aString27 = "";
					this.aString28 = "";
				}
				while (true) {
					while (true) {
						@Pc(265) int local265 = this.method580();
						if (local265 == -1) {
							return;
						}
						@Pc(270) boolean local270 = false;
						for (@Pc(272) int local272 = 0; local272 < aString31.length(); local272++) {
							if (local265 == aString31.charAt(local272)) {
								local270 = true;
								break;
							}
						}
						if (this.anInt869 == 0) {
							if (local265 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt869 = 1;
							}
							if (local270) {
								this.aString27 = this.aString27 + (char) local265;
							}
							if (this.aString27.length() > 12) {
								this.aString27 = this.aString27.substring(0, 12);
							}
						} else if (this.anInt869 == 1) {
							if (local265 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt869 = 0;
							}
							if (local270) {
								this.aString28 = this.aString28 + (char) local265;
							}
							if (this.aString28.length() > 20) {
								this.aString28 = this.aString28.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt837 == 3) {
				local21 = super.anInt808 / 2;
				local28 = super.anInt809 / 2 + 50;
				@Pc(429) int local429 = local28 + 20;
				if (super.anInt817 == 1 && super.anInt818 >= local21 - 75 && super.anInt818 <= local21 + 75 && super.anInt819 >= local429 - 20 && super.anInt819 <= local429 + 20) {
					this.anInt837 = 0;
					return;
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("56279, " + 26091 + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!TQYMAXSO;)V")
	private void method634(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			arg1.method416();
			@Pc(9) int local9 = arg1.method417(8);
			@Pc(15) int local15;
			if (local9 < this.anInt840) {
				for (local15 = local9; local15 < this.anInt840; local15++) {
					this.anIntArray241[this.anInt931++] = this.anIntArray215[local15];
				}
			}
			if (local9 > this.anInt840) {
				signlink.reporterror(this.aString27 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt840 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(67) int local67 = this.anIntArray215[local15];
				@Pc(72) Class8_Sub1_Sub1_Sub1_Sub2 local72 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local67];
				@Pc(77) int local77 = arg1.method417(1);
				if (local77 == 0) {
					this.anIntArray215[this.anInt840++] = local67;
					local72.anInt191 = anInt917;
				} else {
					@Pc(100) int local100 = arg1.method417(2);
					if (local100 == 0) {
						this.anIntArray215[this.anInt840++] = local67;
						local72.anInt191 = anInt917;
						this.anIntArray250[this.anInt976++] = local67;
					} else {
						@Pc(151) int local151;
						@Pc(162) int local162;
						if (local100 == 1) {
							this.anIntArray215[this.anInt840++] = local67;
							local72.anInt191 = anInt917;
							local151 = arg1.method417(3);
							local72.method84(this.anInt925, false, local151);
							local162 = arg1.method417(1);
							if (local162 == 1) {
								this.anIntArray250[this.anInt976++] = local67;
							}
						} else if (local100 == 2) {
							this.anIntArray215[this.anInt840++] = local67;
							local72.anInt191 = anInt917;
							local151 = arg1.method417(3);
							local72.method84(this.anInt925, true, local151);
							local162 = arg1.method417(3);
							local72.method84(this.anInt925, true, local162);
							@Pc(222) int local222 = arg1.method417(1);
							if (local222 == 1) {
								this.anIntArray250[this.anInt976++] = local67;
							}
						} else if (local100 == 3) {
							this.anIntArray241[this.anInt931++] = local67;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("34146, " + arg0 + ", " + false + ", " + arg1 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZLclient!TQYMAXSO;)V")
	private void method635(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			this.anInt931 = 0;
			this.anInt976 = 0;
			this.method606(this.aBoolean238, arg0, arg1);
			this.method718(arg0, arg1);
			this.method627(arg1, arg0, this.aByte31);
			this.method644(arg1, arg0);
			@Pc(38) int local38;
			for (@Pc(31) int local31 = 0; local31 < this.anInt931; local31++) {
				local38 = this.anIntArray241[local31];
				if (this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local38].anInt191 != anInt917) {
					this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local38] = null;
				}
			}
			if (arg1.anInt620 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt620 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local38 = 0; local38 < this.anInt975; local38++) {
				if (this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray249[local38]] == null) {
					signlink.reporterror(this.aString27 + " null entry in pl list - pos:" + local38 + " size:" + this.anInt975);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("8548, " + arg0 + ", " + false + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method636(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt840; local10++) {
				@Pc(20) Class8_Sub1_Sub1_Sub1_Sub2 local20 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray215[local10]];
				@Pc(29) int local29 = (this.anIntArray215[local10] << 14) + 536870912;
				if (local20 != null && local20.method85() && local20.aClass45_2.aBoolean182 == arg0 && local20.aClass45_2.method524()) {
					@Pc(50) int local50 = local20.anInt230 >> 7;
					@Pc(55) int local55 = local20.anInt231 >> 7;
					if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
						if (local20.anInt233 == 1 && (local20.anInt230 & 0x7F) == 64 && (local20.anInt231 & 0x7F) == 64) {
							if (this.anIntArrayArray25[local50][local55] == this.anInt1039) {
								continue;
							}
							this.anIntArrayArray25[local50][local55] = this.anInt1039;
						}
						if (!local20.aClass45_2.aBoolean181) {
							local29 += Integer.MIN_VALUE;
						}
						this.aClass21_1.method189(local20.anInt231, local29, this.anInt891, local20.anInt230, local20, (local20.anInt233 - 1) * 64 + 60, local20.anInt232, local20.aBoolean45, this.method666(local20.anInt231, local20.anInt230, this.anInt891));
					}
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("21691, " + 5 + ", " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method638(@OriginalArg(0) int arg0) {
		try {
			Class24.method260(arg0);
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("61556, " + arg0 + ", " + -79 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OMJBPTVL;)V")
	private void method639(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1) {
		try {
			if (arg0 != -31502) {
				this.anInt970 = this.aClass22_2.method229();
			}
			@Pc(12) int local12 = arg1.anInt447;
			@Pc(68) int local68;
			if ((local12 < 1 || local12 > 100) && (local12 < 701 || local12 > 800)) {
				if (local12 >= 101 && local12 <= 200 || !(local12 < 801 || local12 > 900)) {
					local68 = this.anInt1046;
					if (this.anInt1047 != 2) {
						local68 = 0;
					}
					if (local12 > 800) {
						local12 -= 701;
					} else {
						local12 -= 101;
					}
					if (local12 >= local68) {
						arg1.aString12 = "";
						arg1.anInt437 = 0;
					} else {
						if (this.anIntArray216[local12] == 0) {
							arg1.aString12 = "@red@Offline";
						} else if (this.anIntArray216[local12] < 200) {
							if (this.anIntArray216[local12] == anInt1013) {
								arg1.aString12 = "@gre@World" + (this.anIntArray216[local12] - 9);
							} else {
								arg1.aString12 = "@yel@World" + (this.anIntArray216[local12] - 9);
							}
						} else if (this.anIntArray216[local12] == anInt1013) {
							arg1.aString12 = "@gre@Classic" + (this.anIntArray216[local12] - 219);
						} else {
							arg1.aString12 = "@yel@Classic" + (this.anIntArray216[local12] - 219);
						}
						arg1.anInt437 = 1;
					}
				} else if (local12 == 203) {
					local68 = this.anInt1046;
					if (this.anInt1047 != 2) {
						local68 = 0;
					}
					arg1.anInt450 = local68 * 15 + 20;
					if (arg1.anInt450 <= arg1.anInt440) {
						arg1.anInt450 = arg1.anInt440 + 1;
					}
				} else if (local12 >= 401 && local12 <= 500) {
					local12 -= 401;
					if (local12 == 0 && this.anInt1047 == 0) {
						arg1.aString12 = "Loading ignore list";
						arg1.anInt437 = 0;
					} else if (local12 == 1 && this.anInt1047 == 0) {
						arg1.aString12 = "Please wait...";
						arg1.anInt437 = 0;
					} else {
						local68 = this.anInt855;
						if (this.anInt1047 == 0) {
							local68 = 0;
						}
						if (local12 >= local68) {
							arg1.aString12 = "";
							arg1.anInt437 = 0;
						} else {
							arg1.aString12 = Class28.method309(Class28.method306(this.aLongArray4[local12]));
							arg1.anInt437 = 1;
						}
					}
				} else if (local12 == 503) {
					arg1.anInt450 = this.anInt855 * 15 + 20;
					if (arg1.anInt450 <= arg1.anInt440) {
						arg1.anInt450 = arg1.anInt440 + 1;
					}
				} else if (local12 == 327) {
					arg1.anInt430 = 150;
					arg1.anInt431 = (int) (Math.sin((double) anInt917 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean214) {
						for (local68 = 0; local68 < 7; local68++) {
							@Pc(381) int local381 = this.anIntArray260[local68];
							if (local381 >= 0 && !Class9.aClass9Array1[local381].method67()) {
								return;
							}
						}
						this.aBoolean214 = false;
						@Pc(400) Class8_Sub1_Sub1_Sub3[] local400 = new Class8_Sub1_Sub1_Sub3[7];
						@Pc(402) int local402 = 0;
						for (@Pc(404) int local404 = 0; local404 < 7; local404++) {
							@Pc(411) int local411 = this.anIntArray260[local404];
							if (local411 >= 0) {
								local400[local402++] = Class9.aClass9Array1[local411].method68();
							}
						}
						@Pc(434) Class8_Sub1_Sub1_Sub3 local434 = new Class8_Sub1_Sub1_Sub3(local400, local402, this.anInt830);
						for (@Pc(436) int local436 = 0; local436 < 5; local436++) {
							if (this.anIntArray220[local436] != 0) {
								local434.method150(anIntArrayArray24[local436][0], anIntArrayArray24[local436][this.anIntArray220[local436]]);
								if (local436 == 1) {
									local434.method150(anIntArray274[0], anIntArray274[this.anIntArray220[local436]]);
								}
							}
						}
						local434.method143();
						local434.method144(Class20.aClass20Array1[aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt192].anIntArray110[0]);
						local434.method153(64, 850, -30, -50, -30, true);
						arg1.anInt426 = 5;
						arg1.anInt427 = 0;
						Class24.method261(local434);
					}
				} else if (local12 == 324) {
					if (this.aClass8_Sub1_Sub2_Sub2_16 == null) {
						this.aClass8_Sub1_Sub2_Sub2_16 = arg1.aClass8_Sub1_Sub2_Sub2_2;
						this.aClass8_Sub1_Sub2_Sub2_17 = arg1.aClass8_Sub1_Sub2_Sub2_1;
					}
					if (this.aBoolean228) {
						arg1.aClass8_Sub1_Sub2_Sub2_2 = this.aClass8_Sub1_Sub2_Sub2_17;
					} else {
						arg1.aClass8_Sub1_Sub2_Sub2_2 = this.aClass8_Sub1_Sub2_Sub2_16;
					}
				} else if (local12 == 325) {
					if (this.aClass8_Sub1_Sub2_Sub2_16 == null) {
						this.aClass8_Sub1_Sub2_Sub2_16 = arg1.aClass8_Sub1_Sub2_Sub2_2;
						this.aClass8_Sub1_Sub2_Sub2_17 = arg1.aClass8_Sub1_Sub2_Sub2_1;
					}
					if (this.aBoolean228) {
						arg1.aClass8_Sub1_Sub2_Sub2_2 = this.aClass8_Sub1_Sub2_Sub2_16;
					} else {
						arg1.aClass8_Sub1_Sub2_Sub2_2 = this.aClass8_Sub1_Sub2_Sub2_17;
					}
				} else if (local12 == 600) {
					arg1.aString12 = this.aString23;
					if (anInt917 % 20 < 10) {
						arg1.aString12 = arg1.aString12 + "|";
					} else {
						arg1.aString12 = arg1.aString12 + " ";
					}
				} else {
					if (local12 == 620) {
						if (this.anInt926 < 1) {
							arg1.aString12 = "";
						} else if (this.aBoolean217) {
							arg1.anInt458 = 16711680;
							arg1.aString12 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt458 = 16777215;
							arg1.aString12 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(641) String local641;
					if (local12 == 660) {
						local68 = this.anInt932 - this.anInt862;
						if (local68 <= 0) {
							local641 = "earlier today";
						} else if (local68 == 1) {
							local641 = "yesterday";
						} else {
							local641 = local68 + " days ago";
						}
						arg1.aString12 = "You last logged in @red@" + local641 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local12 == 661) {
						if (this.anInt1028 == 0) {
							arg1.aString12 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt1028 <= this.anInt932) {
							arg1.aString12 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method640(this.aBoolean234, this.anInt1028);
						} else {
							local68 = this.anInt932 + 14 - this.anInt1028;
							if (local68 <= 0) {
								local641 = "Earlier today";
							} else if (local68 == 1) {
								local641 = "Yesterday";
							} else {
								local641 = local68 + " days ago";
							}
							arg1.aString12 = local641 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method640(this.aBoolean234, this.anInt1028) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local12 == 662) {
						@Pc(761) String local761;
						if (this.anInt944 == 0) {
							local761 = "@yel@0 unread messages";
						} else if (this.anInt944 == 1) {
							local761 = "@gre@1 unread message";
						} else {
							local761 = "@gre@" + this.anInt944 + " unread messages";
						}
						arg1.aString12 = "You have " + local761 + "\\nin your message centre.";
					}
					if (local12 == 663) {
						if (this.anInt890 > 0 && this.anInt890 <= this.anInt932 + 10) {
							arg1.aString12 = "Last password change:\\n@gre@" + this.method640(this.aBoolean234, this.anInt890);
						} else {
							arg1.aString12 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local12 == 665) {
						if (this.anInt849 > 2 && !aBoolean235) {
							arg1.aString12 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt849 > 2) {
							arg1.aString12 = "\\n\\nYou have @gre@" + this.anInt849 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt849 > 0) {
							arg1.aString12 = "You have @gre@" + this.anInt849 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg1.aString12 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local12 == 667) {
						if (this.anInt849 > 2 && !aBoolean235) {
							arg1.aString12 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt849 > 0) {
							arg1.aString12 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg1.aString12 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local12 == 668) {
						if (this.anInt1028 > this.anInt932) {
							arg1.aString12 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg1.aString12 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local12 == 1 && this.anInt1047 == 0) {
				arg1.aString12 = "Loading friend list";
				arg1.anInt437 = 0;
			} else if (local12 == 1 && this.anInt1047 == 1) {
				arg1.aString12 = "Connecting to friendserver";
				arg1.anInt437 = 0;
			} else if (local12 == 2 && this.anInt1047 != 2) {
				arg1.aString12 = "Please wait...";
				arg1.anInt437 = 0;
			} else {
				local68 = this.anInt1046;
				if (this.anInt1047 != 2) {
					local68 = 0;
				}
				if (local12 > 700) {
					local12 -= 601;
				} else {
					local12--;
				}
				if (local12 >= local68) {
					arg1.aString12 = "";
					arg1.anInt437 = 0;
				} else {
					arg1.aString12 = this.aStringArray10[local12];
					arg1.anInt437 = 1;
				}
			}
		} catch (@Pc(919) RuntimeException local919) {
			signlink.reporterror("98266, " + arg0 + ", " + arg1 + ", " + local919.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private String method640(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 > this.anInt932 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg1 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			if (arg0) {
				this.aBoolean234 = !this.aBoolean234;
			}
			local16.setTime(new Date(local14));
			@Pc(36) int local36 = local16.get(5);
			@Pc(40) int local40 = local16.get(2);
			@Pc(44) int local44 = local16.get(1);
			@Pc(95) String[] local95 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local36 + "-" + local95[local40] + "-" + local44;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("28850, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method641(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass40_27 == null) {
				this.method648();
				super.aClass40_2 = null;
				this.aClass40_3 = null;
				this.aClass40_4 = null;
				this.aClass40_5 = null;
				this.aClass40_6 = null;
				this.aClass40_7 = null;
				this.aClass40_8 = null;
				this.aClass40_9 = null;
				this.aClass40_10 = null;
				this.aClass40_11 = null;
				this.aClass40_27 = new Class40(96, 479, aByte42, this.method586());
				this.aClass40_25 = new Class40(156, 172, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass8_Sub1_Sub2_Sub3_4.method494(0, 0);
				this.aClass40_24 = new Class40(261, 190, aByte42, this.method586());
				this.aClass40_26 = new Class40(334, 512, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_12 = new Class40(50, 496, aByte42, this.method586());
				this.aClass40_13 = new Class40(37, 269, aByte42, this.method586());
				this.aClass40_14 = new Class40(45, 249, aByte42, this.method586());
				this.aBoolean212 = true;
				this.aClass40_26.method496();
				Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
				@Pc(138) boolean local138 = false;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("49487, " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method642() {
		try {
			this.anInt886 = 0;
			@Pc(71) int local71;
			for (@Pc(6) int local6 = -1; local6 < this.anInt975 + this.anInt840; local6++) {
				@Pc(13) Class8_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass8_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local6 < this.anInt975) {
					local13 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray249[local6]];
				} else {
					local13 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray215[local6 - this.anInt975]];
				}
				if (local13 != null && local13.method85()) {
					@Pc(54) Class45 local54;
					if (local13 instanceof Class8_Sub1_Sub1_Sub1_Sub2) {
						local54 = ((Class8_Sub1_Sub1_Sub1_Sub2) local13).aClass45_2;
						if (local54.anIntArray194 != null) {
							local54 = local54.method525(this.anInt1057);
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt975) {
						local54 = ((Class8_Sub1_Sub1_Sub1_Sub2) local13).aClass45_2;
						if (local54.anInt725 >= 0 && local54.anInt725 < this.aClass8_Sub1_Sub2_Sub2Array8.length) {
							this.method708(local13, local13.anInt194 + 15);
							if (this.anInt841 > -1) {
								this.aClass8_Sub1_Sub2_Sub2Array8[local54.anInt725].method384(this.anInt841 - 12, this.anInt842 - 30);
							}
						}
						if (this.anInt877 == 1 && this.anInt896 == this.anIntArray215[local6 - this.anInt975] && anInt917 % 20 < 10) {
							this.method708(local13, local13.anInt194 + 15);
							if (this.anInt841 > -1) {
								this.aClass8_Sub1_Sub2_Sub2Array4[0].method384(this.anInt841 - 12, this.anInt842 - 28);
							}
						}
					} else {
						local71 = 30;
						@Pc(74) Class8_Sub1_Sub1_Sub1_Sub1 local74 = (Class8_Sub1_Sub1_Sub1_Sub1) local13;
						if (local74.anInt155 != -1 || local74.anInt156 != -1) {
							this.method708(local13, local13.anInt194 + 15);
							if (this.anInt841 > -1) {
								if (local74.anInt155 != -1) {
									this.aClass8_Sub1_Sub2_Sub2Array6[local74.anInt155].method384(this.anInt841 - 12, this.anInt842 - 30);
									local71 += 25;
								}
								if (local74.anInt156 != -1) {
									this.aClass8_Sub1_Sub2_Sub2Array8[local74.anInt156].method384(this.anInt841 - 12, this.anInt842 - local71);
									local71 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt877 == 10 && this.anInt1031 == this.anIntArray249[local6]) {
							this.method708(local13, local13.anInt194 + 15);
							if (this.anInt841 > -1) {
								this.aClass8_Sub1_Sub2_Sub2Array4[1].method384(this.anInt841 - 12, this.anInt842 - local71);
							}
						}
					}
					if (local13.aString5 != null && (local6 >= this.anInt975 || this.anInt934 == 0 || this.anInt934 == 3 || this.anInt934 == 1 && this.method623(((Class8_Sub1_Sub1_Sub1_Sub1) local13).aString4))) {
						this.method708(local13, local13.anInt194);
						if (this.anInt841 > -1 && this.anInt886 < this.anInt887) {
							this.anIntArray229[this.anInt886] = this.aClass8_Sub1_Sub2_Sub4_4.method564(local13.aString5) / 2;
							this.anIntArray228[this.anInt886] = this.aClass8_Sub1_Sub2_Sub4_4.anInt796;
							this.anIntArray226[this.anInt886] = this.anInt841;
							this.anIntArray227[this.anInt886] = this.anInt842;
							this.anIntArray230[this.anInt886] = local13.anInt229;
							this.anIntArray231[this.anInt886] = local13.anInt209;
							this.anIntArray232[this.anInt886] = local13.anInt186;
							this.aStringArray8[this.anInt886++] = local13.aString5;
							if (this.anInt933 == 0 && local13.anInt209 >= 1 && local13.anInt209 <= 3) {
								this.anIntArray228[this.anInt886] += 10;
								this.anIntArray227[this.anInt886] += 5;
							}
							if (this.anInt933 == 0 && local13.anInt209 == 4) {
								this.anIntArray229[this.anInt886] = 60;
							}
							if (this.anInt933 == 0 && local13.anInt209 == 5) {
								this.anIntArray228[this.anInt886] += 5;
							}
						}
					}
					if (local13.anInt206 > anInt917) {
						this.method708(local13, local13.anInt194 + 15);
						if (this.anInt841 > -1) {
							local71 = local13.anInt207 * 30 / local13.anInt208;
							if (local71 > 30) {
								local71 = 30;
							}
							Class8_Sub1_Sub2.method553(local71, 65280, this.anInt841 - 15, 5, this.anInt842 - 3);
							Class8_Sub1_Sub2.method553(30 - local71, 16711680, this.anInt841 + local71 - 15, 5, this.anInt842 - 3);
						}
					}
					for (local71 = 0; local71 < 4; local71++) {
						if (local13.anIntArray58[local71] > anInt917) {
							this.method708(local13, local13.anInt194 / 2);
							if (this.anInt841 > -1) {
								if (local71 == 1) {
									this.anInt842 -= 20;
								}
								if (local71 == 2) {
									this.anInt841 -= 15;
									this.anInt842 -= 10;
								}
								if (local71 == 3) {
									this.anInt841 += 15;
									this.anInt842 -= 10;
								}
								this.aClass8_Sub1_Sub2_Sub2Array9[local13.anIntArray57[local71]].method384(this.anInt841 - 12, this.anInt842 - 12);
								this.aClass8_Sub1_Sub2_Sub4_2.method561(0, this.anInt841, String.valueOf(local13.anIntArray56[local71]), this.anInt842 + 4);
								this.aClass8_Sub1_Sub2_Sub4_2.method561(16777215, this.anInt841 - 1, String.valueOf(local13.anIntArray56[local71]), this.anInt842 + 3);
							}
						}
					}
				}
			}
			for (@Pc(611) int local611 = 0; local611 < this.anInt886; local611++) {
				local71 = this.anIntArray226[local611];
				@Pc(623) int local623 = this.anIntArray227[local611];
				@Pc(628) int local628 = this.anIntArray229[local611];
				@Pc(633) int local633 = this.anIntArray228[local611];
				@Pc(635) boolean local635 = true;
				while (local635) {
					local635 = false;
					for (@Pc(641) int local641 = 0; local641 < local611; local641++) {
						if (local623 + 2 > this.anIntArray227[local641] - this.anIntArray228[local641] && local623 - local633 < this.anIntArray227[local641] + 2 && local71 - local628 < this.anIntArray226[local641] + this.anIntArray229[local641] && local71 + local628 > this.anIntArray226[local641] - this.anIntArray229[local641] && this.anIntArray227[local641] - this.anIntArray228[local641] < local623) {
							local623 = this.anIntArray227[local641] - this.anIntArray228[local641];
							local635 = true;
						}
					}
				}
				this.anInt841 = this.anIntArray226[local611];
				this.anInt842 = this.anIntArray227[local611] = local623;
				@Pc(740) String local740 = this.aStringArray8[local611];
				if (this.anInt933 == 0) {
					@Pc(745) int local745 = 16776960;
					if (this.anIntArray230[local611] < 6) {
						local745 = this.anIntArray267[this.anIntArray230[local611]];
					}
					if (this.anIntArray230[local611] == 6) {
						local745 = this.anInt1039 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray230[local611] == 7) {
						local745 = this.anInt1039 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray230[local611] == 8) {
						local745 = this.anInt1039 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(820) int local820;
					if (this.anIntArray230[local611] == 9) {
						local820 = 150 - this.anIntArray232[local611];
						if (local820 < 50) {
							local745 = local820 * 1280 + 16711680;
						} else if (local820 < 100) {
							local745 = 16776960 - (local820 - 50) * 327680;
						} else if (local820 < 150) {
							local745 = (local820 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray230[local611] == 10) {
						local820 = 150 - this.anIntArray232[local611];
						if (local820 < 50) {
							local745 = local820 * 5 + 16711680;
						} else if (local820 < 100) {
							local745 = 16711935 - (local820 - 50) * 327680;
						} else if (local820 < 150) {
							local745 = (local820 - 100) * 327680 + 255 - (local820 - 100) * 5;
						}
					}
					if (this.anIntArray230[local611] == 11) {
						local820 = 150 - this.anIntArray232[local611];
						if (local820 < 50) {
							local745 = 16777215 - local820 * 327685;
						} else if (local820 < 100) {
							local745 = (local820 - 50) * 327685 + 65280;
						} else if (local820 < 150) {
							local745 = 16777215 - (local820 - 100) * 327680;
						}
					}
					if (this.anIntArray231[local611] == 0) {
						this.aClass8_Sub1_Sub2_Sub4_4.method561(0, this.anInt841, local740, this.anInt842 + 1);
						this.aClass8_Sub1_Sub2_Sub4_4.method561(local745, this.anInt841, local740, this.anInt842);
					}
					if (this.anIntArray231[local611] == 1) {
						this.aClass8_Sub1_Sub2_Sub4_4.method566(this.anInt842 + 1, this.anInt841, 0, local740, this.anInt824, this.anInt1039);
						this.aClass8_Sub1_Sub2_Sub4_4.method566(this.anInt842, this.anInt841, local745, local740, this.anInt824, this.anInt1039);
					}
					if (this.anIntArray231[local611] == 2) {
						this.aClass8_Sub1_Sub2_Sub4_4.method567(this.anInt1039, this.anInt841, this.anInt842 + 1, local740, 0);
						this.aClass8_Sub1_Sub2_Sub4_4.method567(this.anInt1039, this.anInt841, this.anInt842, local740, local745);
					}
					if (this.anIntArray231[local611] == 3) {
						this.aClass8_Sub1_Sub2_Sub4_4.method568(local740, this.anInt842 + 1, this.anInt1039, 150 - this.anIntArray232[local611], 0, this.anInt841);
						this.aClass8_Sub1_Sub2_Sub4_4.method568(local740, this.anInt842, this.anInt1039, 150 - this.anIntArray232[local611], local745, this.anInt841);
					}
					@Pc(1119) int local1119;
					if (this.anIntArray231[local611] == 4) {
						local820 = this.aClass8_Sub1_Sub2_Sub4_4.method564(local740);
						local1119 = (150 - this.anIntArray232[local611]) * (local820 + 100) / 150;
						Class8_Sub1_Sub2.method550(0, this.anInt841 - 50, this.anInt841 + 50, 334);
						this.aClass8_Sub1_Sub2_Sub4_4.method565(this.anInt842 + 1, 0, local740, this.anInt841 + 50 - local1119);
						this.aClass8_Sub1_Sub2_Sub4_4.method565(this.anInt842, local745, local740, this.anInt841 + 50 - local1119);
						Class8_Sub1_Sub2.method549();
					}
					if (this.anIntArray231[local611] == 5) {
						local820 = 150 - this.anIntArray232[local611];
						local1119 = 0;
						if (local820 < 25) {
							local1119 = local820 - 25;
						} else if (local820 > 125) {
							local1119 = local820 - 125;
						}
						Class8_Sub1_Sub2.method550(this.anInt842 - this.aClass8_Sub1_Sub2_Sub4_4.anInt796 - 1, 0, 512, this.anInt842 + 5);
						this.aClass8_Sub1_Sub2_Sub4_4.method561(0, this.anInt841, local740, this.anInt842 + local1119 + 1);
						this.aClass8_Sub1_Sub2_Sub4_4.method561(local745, this.anInt841, local740, this.anInt842 + local1119);
						Class8_Sub1_Sub2.method549();
					}
				} else {
					this.aClass8_Sub1_Sub2_Sub4_4.method561(0, this.anInt841, local740, this.anInt842 + 1);
					this.aClass8_Sub1_Sub2_Sub4_4.method561(16776960, this.anInt841, local740, this.anInt842);
				}
			}
		} catch (@Pc(1271) RuntimeException local1271) {
			signlink.reporterror("16695, " + 0 + ", " + local1271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIII)V")
	private void method643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass8_Sub1_Sub2_Sub3_6.method494(arg3, arg0);
			this.aClass8_Sub1_Sub2_Sub3_7.method494(arg3, arg0 + arg1 - 16);
			Class8_Sub1_Sub2.method553(16, this.anInt874, arg3, arg1 - 32, arg0 + 16);
			@Pc(35) int local35 = (arg1 - 32) * arg1 / arg2;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg1 - local35 - 32) * arg4 / (arg2 - arg1);
			Class8_Sub1_Sub2.method553(16, this.anInt943, arg3, local35, arg0 + local52 + 16);
			Class8_Sub1_Sub2.method558(arg0 + local52 + 16, this.anInt993, local35, arg3);
			Class8_Sub1_Sub2.method558(arg0 + local52 + 16, this.anInt993, local35, arg3 + 1);
			Class8_Sub1_Sub2.method556(this.anInt993, arg0 + local52 + 16, arg3, 16);
			Class8_Sub1_Sub2.method556(this.anInt993, arg0 + local52 + 17, arg3, 16);
			Class8_Sub1_Sub2.method558(arg0 + local52 + 16, this.anInt1060, local35, arg3 + 15);
			Class8_Sub1_Sub2.method558(arg0 + local52 + 17, this.anInt1060, local35 - 1, arg3 + 14);
			Class8_Sub1_Sub2.method556(this.anInt1060, arg0 + local52 + local35 + 15, arg3, 16);
			Class8_Sub1_Sub2.method556(this.anInt1060, arg0 + local52 + local35 + 14, arg3 + 1, 15);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("64531, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!TQYMAXSO;II)V")
	private void method644(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt976; local12++) {
				@Pc(19) int local19 = this.anIntArray250[local12];
				@Pc(24) Class8_Sub1_Sub1_Sub1_Sub1 local24 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local19];
				@Pc(27) int local27 = arg0.method406();
				if ((local27 & 0x40) != 0) {
					local27 += arg0.method406() << 8;
				}
				this.method662(this.anInt1049, arg0, local19, local24, local27);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("93271, " + arg0 + ", " + arg1 + ", " + -870 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method645() {
		try {
			for (@Pc(11) Class8_Sub3 local11 = (Class8_Sub3) this.aClass7_11.method32(); local11 != null; local11 = (Class8_Sub3) this.aClass7_11.method34()) {
				if (local11.anInt312 == -1) {
					local11.anInt320 = 0;
					this.method649(local11);
				} else {
					local11.method546();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("18850, " + -977 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TPUDHOHI;ZII)V")
	private void method646(@OriginalArg(0) Class8_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg1 * arg1;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(24) int local24 = this.anInt920 + this.anInt923 & 0x7FF;
				@Pc(28) int local28 = Class8_Sub1_Sub1_Sub3.anIntArray106[local24];
				@Pc(32) int local32 = Class8_Sub1_Sub1_Sub3.anIntArray107[local24];
				@Pc(41) int local41 = local28 * 256 / (this.anInt1034 + 256);
				@Pc(50) int local50 = local32 * 256 / (this.anInt1034 + 256);
				@Pc(60) int local60 = arg1 * local41 + arg2 * local50 >> 16;
				@Pc(70) int local70 = arg1 * local50 - arg2 * local41 >> 16;
				@Pc(76) double local76 = Math.atan2((double) local60, (double) local70);
				@Pc(82) int local82 = (int) (Math.sin(local76) * 63.0D);
				@Pc(88) int local88 = (int) (Math.cos(local76) * 57.0D);
				this.aClass8_Sub1_Sub2_Sub2_14.method389(local76, this.anInt856, local82 + 94 + 4 - 10, 83 - local88 - 20);
			} else {
				this.method603((byte) 5, arg1, arg2, arg0);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("68775, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!OMJBPTVL;)V")
	private void method647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class24 arg4) {
		try {
			if (arg4.anInt425 == 0 && arg4.anIntArray135 != null && (!arg4.aBoolean105 || this.anInt1038 == arg4.anInt454 || this.anInt847 == arg4.anInt454 || this.anInt1030 == arg4.anInt454)) {
				@Pc(29) int local29 = Class8_Sub1_Sub2.anInt790;
				@Pc(31) int local31 = Class8_Sub1_Sub2.anInt788;
				@Pc(33) int local33 = Class8_Sub1_Sub2.anInt791;
				@Pc(35) int local35 = Class8_Sub1_Sub2.anInt789;
				Class8_Sub1_Sub2.method550(arg1, arg2, arg2 + arg4.anInt453, arg1 + arg4.anInt440);
				@Pc(51) boolean local51 = false;
				@Pc(55) int local55 = arg4.anIntArray135.length;
				for (@Pc(57) int local57 = 0; local57 < local55; local57++) {
					@Pc(66) int local66 = arg4.anIntArray141[local57] + arg2;
					@Pc(75) int local75 = arg4.anIntArray138[local57] + arg1 - arg3;
					@Pc(81) Class24 local81 = Class24.method259(arg4.anIntArray135[local57]);
					@Pc(86) int local86 = local66 + local81.anInt428;
					@Pc(91) int local91 = local75 + local81.anInt452;
					if (local81.anInt447 > 0) {
						this.method639(this.anInt1032, local81);
					}
					if (local81.anInt425 == 0) {
						if (local81.anInt451 > local81.anInt450 - local81.anInt440) {
							local81.anInt451 = local81.anInt450 - local81.anInt440;
						}
						if (local81.anInt451 < 0) {
							local81.anInt451 = 0;
						}
						this.method647(127, local91, local86, local81.anInt451, local81);
						if (local81.anInt450 > local81.anInt440) {
							this.method643(local91, local81.anInt440, local81.anInt450, local86 + local81.anInt453, local81.anInt451);
						}
					} else if (local81.anInt425 != 1) {
						@Pc(164) int local164;
						@Pc(168) int local168;
						@Pc(179) int local179;
						@Pc(214) int local214;
						@Pc(221) int local221;
						@Pc(246) int local246;
						@Pc(162) int local162;
						@Pc(212) int local212;
						if (local81.anInt425 == 2) {
							local162 = 0;
							for (local164 = 0; local164 < local81.anInt440; local164++) {
								for (local168 = 0; local168 < local81.anInt453; local168++) {
									local179 = local86 + local168 * (local81.anInt432 + 32);
									@Pc(188) int local188 = local91 + local164 * (local81.anInt446 + 32);
									if (local162 < 20) {
										local179 += local81.anIntArray134[local162];
										local188 += local81.anIntArray136[local162];
									}
									if (local81.anIntArray137[local162] > 0) {
										local212 = 0;
										local214 = 0;
										local221 = local81.anIntArray137[local162] - 1;
										if (local179 > Class8_Sub1_Sub2.anInt790 - 32 && local179 < Class8_Sub1_Sub2.anInt791 && local188 > Class8_Sub1_Sub2.anInt788 - 32 && local188 < Class8_Sub1_Sub2.anInt789 || this.anInt957 != 0 && this.anInt956 == local162) {
											local246 = 0;
											if (this.anInt978 == 1 && this.anInt979 == local162 && this.anInt980 == local81.anInt454) {
												local246 = 16777215;
											}
											@Pc(270) Class8_Sub1_Sub2_Sub2 local270 = Class46.method530(25, local221, local81.anIntArray142[local162], local246);
											if (local270 != null) {
												@Pc(349) int local349;
												if (this.anInt957 != 0 && this.anInt956 == local162 && this.anInt955 == local81.anInt454) {
													local212 = super.anInt812 - this.anInt958;
													local214 = super.anInt813 - this.anInt959;
													if (local212 < 5 && local212 > -5) {
														local212 = 0;
													}
													if (local214 < 5 && local214 > -5) {
														local214 = 0;
													}
													if (this.anInt964 < 5) {
														local212 = 0;
														local214 = 0;
													}
													local270.method386(local188 + local214, local179 + local212);
													if (local188 + local214 < Class8_Sub1_Sub2.anInt788 && arg4.anInt451 > 0) {
														local349 = this.anInt871 * (Class8_Sub1_Sub2.anInt788 - local188 - local214) / 3;
														if (local349 > this.anInt871 * 10) {
															local349 = this.anInt871 * 10;
														}
														if (local349 > arg4.anInt451) {
															local349 = arg4.anInt451;
														}
														arg4.anInt451 -= local349;
														this.anInt959 += local349;
													}
													if (local188 + local214 + 32 > Class8_Sub1_Sub2.anInt789 && arg4.anInt451 < arg4.anInt450 - arg4.anInt440) {
														local349 = this.anInt871 * (local188 + local214 + 32 - Class8_Sub1_Sub2.anInt789) / 3;
														if (local349 > this.anInt871 * 10) {
															local349 = this.anInt871 * 10;
														}
														if (local349 > arg4.anInt450 - arg4.anInt440 - arg4.anInt451) {
															local349 = arg4.anInt450 - arg4.anInt440 - arg4.anInt451;
														}
														arg4.anInt451 += local349;
														this.anInt959 -= local349;
													}
												} else if (this.anInt1053 != 0 && this.anInt1052 == local162 && this.anInt1051 == local81.anInt454) {
													local270.method386(local188, local179);
												} else {
													local270.method384(local179, local188);
												}
												if (local270.anInt609 == 33 || local81.anIntArray142[local162] != 1) {
													local349 = local81.anIntArray142[local162];
													this.aClass8_Sub1_Sub2_Sub4_2.method565(local188 + local214 + 10, 0, method673(43, local349), local179 + local212 + 1);
													this.aClass8_Sub1_Sub2_Sub4_2.method565(local188 + local214 + 9, 16776960, method673(43, local349), local179 + local212);
												}
											}
										}
									} else if (local81.aClass8_Sub1_Sub2_Sub2Array1 != null && local162 < 20) {
										@Pc(538) Class8_Sub1_Sub2_Sub2 local538 = local81.aClass8_Sub1_Sub2_Sub2Array1[local162];
										if (local538 != null) {
											local538.method384(local179, local188);
										}
									}
									local162++;
								}
							}
						} else if (local81.anInt425 == 3) {
							@Pc(564) boolean local564 = false;
							if (this.anInt1030 == local81.anInt454 || this.anInt847 == local81.anInt454 || this.anInt1038 == local81.anInt454) {
								local564 = true;
							}
							if (this.method663(local81)) {
								local162 = local81.anInt443;
								if (local564 && local81.anInt436 != 0) {
									local162 = local81.anInt436;
								}
							} else {
								local162 = local81.anInt458;
								if (local564 && local81.anInt460 != 0) {
									local162 = local81.anInt460;
								}
							}
							if (local81.aByte6 == 0) {
								if (local81.aBoolean107) {
									Class8_Sub1_Sub2.method553(local81.anInt453, local162, local86, local81.anInt440, local91);
								} else {
									Class8_Sub1_Sub2.method554(local86, local162, local91, local81.anInt453, local81.anInt440);
								}
							} else if (local81.aBoolean107) {
								Class8_Sub1_Sub2.method552(local81.anInt453, local86, local162, local91, 256 - (local81.aByte6 & 0xFF), local81.anInt440, this.anInt826);
							} else {
								Class8_Sub1_Sub2.method555(256 - (local81.aByte6 & 0xFF), local81.anInt440, local81.anInt453, local91, local86, local162);
							}
						} else {
							@Pc(683) Class8_Sub1_Sub2_Sub4 local683;
							@Pc(960) String local960;
							if (local81.anInt425 == 4) {
								local683 = local81.aClass8_Sub1_Sub2_Sub4_1;
								@Pc(686) String local686 = local81.aString12;
								@Pc(688) boolean local688 = false;
								if (this.anInt1030 == local81.anInt454 || this.anInt847 == local81.anInt454 || this.anInt1038 == local81.anInt454) {
									local688 = true;
								}
								if (this.method663(local81)) {
									local164 = local81.anInt443;
									if (local688 && local81.anInt436 != 0) {
										local164 = local81.anInt436;
									}
									if (local81.aString10.length() > 0) {
										local686 = local81.aString10;
									}
								} else {
									local164 = local81.anInt458;
									if (local688 && local81.anInt460 != 0) {
										local164 = local81.anInt460;
									}
								}
								if (local81.anInt437 == 6 && this.aBoolean237) {
									local686 = "Please wait...";
									local164 = local81.anInt458;
								}
								if (Class8_Sub1_Sub2.anInt786 == 479) {
									if (local164 == 16776960) {
										local164 = 255;
									}
									if (local164 == 49152) {
										local164 = 16777215;
									}
								}
								local212 = local91 + local683.anInt796;
								while (local686.length() > 0) {
									if (local686.indexOf("%") != -1) {
										label390: while (true) {
											local214 = local686.indexOf("%1");
											if (local214 == -1) {
												while (true) {
													local214 = local686.indexOf("%2");
													if (local214 == -1) {
														while (true) {
															local214 = local686.indexOf("%3");
															if (local214 == -1) {
																while (true) {
																	local214 = local686.indexOf("%4");
																	if (local214 == -1) {
																		while (true) {
																			local214 = local686.indexOf("%5");
																			if (local214 == -1) {
																				break label390;
																			}
																			local686 = local686.substring(0, local214) + this.method712(this.method690(4, local81)) + local686.substring(local214 + 2);
																		}
																	}
																	local686 = local686.substring(0, local214) + this.method712(this.method690(3, local81)) + local686.substring(local214 + 2);
																}
															}
															local686 = local686.substring(0, local214) + this.method712(this.method690(2, local81)) + local686.substring(local214 + 2);
														}
													}
													local686 = local686.substring(0, local214) + this.method712(this.method690(1, local81)) + local686.substring(local214 + 2);
												}
											}
											local686 = local686.substring(0, local214) + this.method712(this.method690(0, local81)) + local686.substring(local214 + 2);
										}
									}
									local214 = local686.indexOf("\\n");
									if (local214 == -1) {
										local960 = local686;
										local686 = "";
									} else {
										local960 = local686.substring(0, local214);
										local686 = local686.substring(local214 + 2);
									}
									if (local81.aBoolean103) {
										local683.method562(local212, local86 + local81.anInt453 / 2, local81.aBoolean102, local960, local164);
									} else {
										local683.method569(local164, local86, local81.aBoolean102, local212, local960);
									}
									local212 += local683.anInt796;
								}
							} else if (local81.anInt425 == 5) {
								@Pc(1022) Class8_Sub1_Sub2_Sub2 local1022;
								if (this.method663(local81)) {
									local1022 = local81.aClass8_Sub1_Sub2_Sub2_1;
								} else {
									local1022 = local81.aClass8_Sub1_Sub2_Sub2_2;
								}
								if (local1022 != null) {
									local1022.method384(local86, local91);
								}
							} else if (local81.anInt425 == 6) {
								local162 = Class8_Sub1_Sub2_Sub1.anInt565;
								local164 = Class8_Sub1_Sub2_Sub1.anInt566;
								Class8_Sub1_Sub2_Sub1.anInt565 = local86 + local81.anInt453 / 2;
								Class8_Sub1_Sub2_Sub1.anInt566 = local91 + local81.anInt440 / 2;
								local168 = Class8_Sub1_Sub2_Sub1.anIntArray163[local81.anInt430] * local81.anInt429 >> 16;
								local179 = Class8_Sub1_Sub2_Sub1.anIntArray164[local81.anInt430] * local81.anInt429 >> 16;
								@Pc(1083) boolean local1083 = this.method663(local81);
								if (local1083) {
									local212 = local81.anInt449;
								} else {
									local212 = local81.anInt448;
								}
								@Pc(1103) Class8_Sub1_Sub1_Sub3 local1103;
								if (local212 == -1) {
									local1103 = local81.method253(local1083, -1, -1);
								} else {
									@Pc(1109) Class20 local1109 = Class20.aClass20Array1[local212];
									local1103 = local81.method253(local1083, local1109.anIntArray110[local81.anInt438], local1109.anIntArray111[local81.anInt438]);
								}
								if (local1103 != null) {
									local1103.method157(local81.anInt431, 0, local81.anInt430, 0, local168, local179);
								}
								Class8_Sub1_Sub2_Sub1.anInt565 = local162;
								Class8_Sub1_Sub2_Sub1.anInt566 = local164;
							} else {
								if (local81.anInt425 == 7) {
									local683 = local81.aClass8_Sub1_Sub2_Sub4_1;
									local164 = 0;
									for (local168 = 0; local168 < local81.anInt440; local168++) {
										for (local179 = 0; local179 < local81.anInt453; local179++) {
											if (local81.anIntArray137[local164] > 0) {
												@Pc(1173) Class46 local1173 = Class46.method532(local81.anIntArray137[local164] - 1);
												@Pc(1177) String local1177 = String.valueOf(local1173.aString16);
												if (local1173.aBoolean186 || local81.anIntArray142[local164] != 1) {
													local1177 = local1177 + " x" + method637(local81.anIntArray142[local164]);
												}
												local214 = local86 + local179 * (local81.anInt432 + 115);
												local221 = local91 + local168 * (local81.anInt446 + 12);
												if (local81.aBoolean103) {
													local683.method562(local221, local214 + local81.anInt453 / 2, local81.aBoolean102, local1177, local81.anInt458);
												} else {
													local683.method569(local81.anInt458, local214, local81.aBoolean102, local221, local1177);
												}
											}
											local164++;
										}
									}
								}
								if (local81.anInt425 == 8 && (this.anInt905 == local81.anInt454 || this.anInt1015 == local81.anInt454 || this.anInt960 == local81.anInt454) && this.anInt894 == 100) {
									local162 = 0;
									local164 = 0;
									@Pc(1291) Class8_Sub1_Sub2_Sub4 local1291 = this.aClass8_Sub1_Sub2_Sub4_3;
									@Pc(1294) String local1294 = local81.aString12;
									while (local1294.length() > 0) {
										local212 = local1294.indexOf("\\n");
										if (local212 == -1) {
											local960 = local1294;
											local1294 = "";
										} else {
											local960 = local1294.substring(0, local212);
											local1294 = local1294.substring(local212 + 2);
										}
										local214 = local1291.method563(local960);
										if (local214 > local162) {
											local162 = local214;
										}
										local164 += local1291.anInt796 + 1;
									}
									local162 += 6;
									local164 += 7;
									local212 = local86 + local81.anInt453 - local162 - 5;
									local214 = local91 + local81.anInt440 + 5;
									if (local212 < local86 + 5) {
										local212 = local86 + 5;
									}
									if (local212 + local162 > arg2 + arg4.anInt453) {
										local212 = arg2 + arg4.anInt453 - local162;
									}
									if (local214 + local164 > arg1 + arg4.anInt440) {
										local214 = arg1 + arg4.anInt440 - local164;
									}
									Class8_Sub1_Sub2.method553(local162, 16777120, local212, local164, local214);
									Class8_Sub1_Sub2.method554(local212, 0, local214, local162, local164);
									local1294 = local81.aString12;
									local221 = local214 + local1291.anInt796 + 2;
									while (local1294.length() > 0) {
										local246 = local1294.indexOf("\\n");
										if (local246 == -1) {
											local960 = local1294;
											local1294 = "";
										} else {
											local960 = local1294.substring(0, local246);
											local1294 = local1294.substring(local246 + 2);
										}
										local1291.method569(0, local212 + 3, false, local221, local960);
										local221 += local1291.anInt796 + 1;
									}
								}
							}
						}
					}
				}
				Class8_Sub1_Sub2.method550(local31, local29, local33, local35);
			}
		} catch (@Pc(1479) RuntimeException local1479) {
			signlink.reporterror("22718, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1479.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method648() {
		try {
			this.aBoolean243 = false;
			while (this.aBoolean219) {
				this.aBoolean243 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(17) Exception local17) {
				}
			}
			this.aClass8_Sub1_Sub2_Sub3_1 = null;
			this.aClass8_Sub1_Sub2_Sub3_2 = null;
			this.aClass8_Sub1_Sub2_Sub3Array4 = null;
			this.anIntArray261 = null;
			this.anIntArray262 = null;
			this.anIntArray263 = null;
			this.anIntArray264 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.anIntArray222 = null;
			this.anIntArray223 = null;
			this.aClass8_Sub1_Sub2_Sub2_12 = null;
			this.aClass8_Sub1_Sub2_Sub2_13 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("86006, " + 515 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!KOXMDHST;)V")
	private void method649(@OriginalArg(1) Class8_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt317 == 0) {
				local1 = this.aClass21_1.method204(arg0.anInt316, arg0.anInt318, arg0.anInt319);
			}
			if (arg0.anInt317 == 1) {
				local1 = this.aClass21_1.method205(arg0.anInt319, arg0.anInt316, arg0.anInt318);
			}
			if (arg0.anInt317 == 2) {
				local1 = this.aClass21_1.method206(arg0.anInt316, arg0.anInt318, arg0.anInt319);
			}
			if (arg0.anInt317 == 3) {
				local1 = this.aClass21_1.method207(arg0.anInt316, arg0.anInt318, arg0.anInt319);
			}
			if (local1 != 0) {
				@Pc(84) int local84 = this.aClass21_1.method208(arg0.anInt316, arg0.anInt318, arg0.anInt319, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local84 & 0x1F;
				local7 = local84 >> 6;
			}
			arg0.anInt313 = local3;
			arg0.anInt315 = local5;
			arg0.anInt314 = local7;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("77719, " + -26862 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method650(@OriginalArg(0) long arg0) {
		try {
			this.aBoolean218 &= true;
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt1046; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt1046--;
						this.aBoolean215 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt1046; local34++) {
							this.aStringArray10[local34] = this.aStringArray10[local34 + 1];
							this.anIntArray216[local34] = this.anIntArray216[local34 + 1];
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass8_Sub1_Sub3_6.method395(52);
						this.aClass8_Sub1_Sub3_6.method402(66, arg0);
						return;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("84426, " + arg0 + ", " + true + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method651() {
		try {
			this.method607();
			if (this.anInt1009 == 1) {
				this.aClass8_Sub1_Sub2_Sub2Array7[this.anInt1008 / 100].method384(this.anInt1006 - 8 - 4, this.anInt1007 - 8 - 4);
			}
			if (this.anInt1009 == 2) {
				this.aClass8_Sub1_Sub2_Sub2Array7[this.anInt1008 / 100 + 4].method384(this.anInt1006 - 8 - 4, this.anInt1007 - 8 - 4);
			}
			if (this.anInt831 != -1) {
				this.method615(this.anInt831, (byte) 4, this.anInt871);
				this.method647(127, 0, 0, 0, Class24.method259(this.anInt831));
			}
			if (this.anInt827 != -1) {
				this.method615(this.anInt827, (byte) 4, this.anInt871);
				this.method647(127, 0, 0, 0, Class24.method259(this.anInt827));
			}
			this.method667(this.aByte44);
			if (!this.aBoolean216) {
				this.method711();
				this.method707(588);
			} else if (this.anInt1020 == 0) {
				this.method630();
			}
			if (this.anInt875 == 1) {
				this.aClass8_Sub1_Sub2_Sub2_15.method384(472, 296);
			}
			@Pc(175) int local175;
			if (aBoolean211) {
				@Pc(141) byte local141 = 20;
				@Pc(143) int local143 = 16776960;
				if (super.anInt807 < 30 && aBoolean236) {
					local143 = 16711680;
				}
				if (super.anInt807 < 20 && !aBoolean236) {
					local143 = 16711680;
				}
				this.aClass8_Sub1_Sub2_Sub4_3.method560(20, "Fps:" + super.anInt807, local143);
				local175 = local141 + 15;
				@Pc(177) Runtime local177 = Runtime.getRuntime();
				@Pc(186) int local186 = (int) ((local177.totalMemory() - local177.freeMemory()) / 1024L);
				if (local186 > 33554432 && aBoolean236) {
				}
				if (local186 > 67108864 && !aBoolean236) {
				}
				this.aClass8_Sub1_Sub2_Sub4_3.method560(35, "Mem:" + local186 + "k", 16776960);
				local175 += 15;
			}
			if (this.anInt907 != 0) {
				@Pc(227) int local227 = this.anInt907 / 50;
				local175 = local227 / 60;
				@Pc(235) int local235 = local227 % 60;
				if (local235 < 10) {
					this.aClass8_Sub1_Sub2_Sub4_3.method565(329, 16776960, "System update in: " + local175 + ":0" + local235, 4);
				} else {
					this.aClass8_Sub1_Sub2_Sub4_3.method565(329, 16776960, "System update in: " + local175 + ":" + local235, 4);
				}
				anInt1025++;
				if (anInt1025 > 73) {
					anInt1025 = 0;
					this.aClass8_Sub1_Sub3_6.method395(110);
					return;
				}
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("69364, " + true + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZIIII)V")
	private void method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg5 >= 1 && arg2 >= 1 && arg5 <= 102 && arg2 <= 102) {
				if (aBoolean236 && arg0 != this.anInt891) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg6 == 0) {
					local26 = this.aClass21_1.method204(arg0, arg5, arg2);
				}
				if (arg6 == 1) {
					local26 = this.aClass21_1.method205(arg2, arg0, arg5);
				}
				if (arg6 == 2) {
					local26 = this.aClass21_1.method206(arg0, arg5, arg2);
				}
				if (arg6 == 3) {
					local26 = this.aClass21_1.method207(arg0, arg5, arg2);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass21_1.method208(arg0, arg5, arg2, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class42 local108;
					if (arg6 == 0) {
						this.aClass21_1.method195(arg0, arg2, arg5);
						local108 = Class42.method512(local88);
						if (local108.aBoolean168) {
							this.aClass38Array1[arg0].method458(local108.aBoolean176, local96, arg5, arg2, local92);
						}
					}
					if (arg6 == 1) {
						this.aClass21_1.method196(arg2, arg5, arg0);
					}
					if (arg6 == 2) {
						this.aClass21_1.method197(arg2, arg0, arg5);
						local108 = Class42.method512(local88);
						if (arg5 + local108.anInt690 > 103 || arg2 + local108.anInt690 > 103 || arg5 + local108.anInt707 > 103 || arg2 + local108.anInt707 > 103) {
							return;
						}
						if (local108.aBoolean168) {
							this.aClass38Array1[arg0].method459(arg2, local108.anInt690, local108.aBoolean176, local96, local108.anInt707, arg5);
						}
					}
					if (arg6 == 3) {
						this.aClass21_1.method198(arg2, arg0, arg5);
						local108 = Class42.method512(local88);
						if (local108.aBoolean168 && local108.aBoolean174) {
							this.aClass38Array1[arg0].method461(arg2, arg5);
						}
					}
				}
				if (arg3 >= 0) {
					local82 = arg0;
					if (arg0 < 3 && (this.aByteArrayArrayArray8[1][arg5][arg2] & 0x2) == 2) {
						local82 = arg0 + 1;
					}
					Class2.method16(arg5, arg0, arg3, this.aClass38Array1[arg0], arg4, local82, arg2, this.aClass21_1, arg1, this.anIntArrayArrayArray8);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("585, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method653() {
		try {
			this.aClass8_Sub1_Sub2_Sub3_1 = new Class8_Sub1_Sub2_Sub3(this.aClass35_2, "titlebox", 0);
			this.aClass8_Sub1_Sub2_Sub3_2 = new Class8_Sub1_Sub2_Sub3(this.aClass35_2, "titlebutton", 0);
			this.aClass8_Sub1_Sub2_Sub3Array4 = new Class8_Sub1_Sub2_Sub3[12];
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				this.aClass8_Sub1_Sub2_Sub3Array4[local35] = new Class8_Sub1_Sub2_Sub3(this.aClass35_2, "runes", local35);
			}
			this.aClass8_Sub1_Sub2_Sub2_12 = new Class8_Sub1_Sub2_Sub2(128, 265);
			this.aClass8_Sub1_Sub2_Sub2_13 = new Class8_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(68) int local68 = 0; local68 < 33920; local68++) {
				this.aClass8_Sub1_Sub2_Sub2_12.anIntArray174[local68] = this.aClass40_6.anIntArray179[local68];
			}
			for (@Pc(86) int local86 = 0; local86 < 33920; local86++) {
				this.aClass8_Sub1_Sub2_Sub2_13.anIntArray174[local86] = this.aClass40_7.anIntArray179[local86];
			}
			this.anIntArray262 = new int[256];
			for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
				this.anIntArray262[local108] = local108 * 262144;
			}
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				this.anIntArray262[local123 + 64] = local123 * 1024 + 16711680;
			}
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray262[local142 + 128] = local142 * 4 + 16776960;
			}
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				this.anIntArray262[local161 + 192] = 16777215;
			}
			this.anIntArray263 = new int[256];
			for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
				this.anIntArray263[local180] = local180 * 1024;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray263[local195 + 64] = local195 * 4 + 65280;
			}
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray263[local214 + 128] = local214 * 262144 + 65535;
			}
			for (@Pc(233) int local233 = 0; local233 < 64; local233++) {
				this.anIntArray263[local233 + 192] = 16777215;
			}
			this.anIntArray264 = new int[256];
			for (@Pc(252) int local252 = 0; local252 < 64; local252++) {
				this.anIntArray264[local252] = local252 * 4;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray264[local267 + 64] = local267 * 262144 + 255;
			}
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray264[local286 + 128] = local286 * 1024 + 16711935;
			}
			for (@Pc(305) int local305 = 0; local305 < 64; local305++) {
				this.anIntArray264[local305 + 192] = 16777215;
			}
			this.anIntArray261 = new int[256];
			this.anIntArray238 = new int[32768];
			this.anIntArray239 = new int[32768];
			this.method693(null);
			this.anIntArray222 = new int[32768];
			this.anIntArray223 = new int[32768];
			this.method588(10, "Connecting to fileserver");
			if (!this.aBoolean243) {
				this.aBoolean247 = true;
				this.aBoolean243 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("25581, " + 65 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method654(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 123) {
				this.anInt901 = -1;
			}
			@Pc(18) int local18;
			for (@Pc(11) int local11 = 10; local11 < 117; local11++) {
				local18 = (int) (Math.random() * 100.0D);
				if (local18 < 50) {
					this.anIntArray222[local11 + 32512] = 255;
				}
			}
			@Pc(47) int local47;
			@Pc(54) int local54;
			@Pc(60) int local60;
			for (local18 = 0; local18 < 100; local18++) {
				local47 = (int) (Math.random() * 124.0D) + 2;
				local54 = (int) (Math.random() * 128.0D) + 128;
				local60 = local47 + (local54 << 7);
				this.anIntArray222[local60] = 192;
			}
			for (local47 = 1; local47 < 255; local47++) {
				for (local54 = 1; local54 < 127; local54++) {
					local60 = local54 + (local47 << 7);
					this.anIntArray223[local60] = (this.anIntArray222[local60 - 1] + this.anIntArray222[local60 + 1] + this.anIntArray222[local60 - 128] + this.anIntArray222[local60 + 128]) / 4;
				}
			}
			this.anInt999 += 128;
			if (this.anInt999 > this.anIntArray238.length) {
				this.anInt999 -= this.anIntArray238.length;
				local54 = (int) (Math.random() * 12.0D);
				this.method693(this.aClass8_Sub1_Sub2_Sub3Array4[local54]);
			}
			@Pc(172) int local172;
			for (local54 = 1; local54 < 255; local54++) {
				for (local60 = 1; local60 < 127; local60++) {
					local172 = local60 + (local54 << 7);
					@Pc(195) int local195 = this.anIntArray223[local172 + 128] - this.anIntArray238[local172 + this.anInt999 & this.anIntArray238.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray222[local172] = local195;
				}
			}
			for (local60 = 0; local60 < 255; local60++) {
				this.anIntArray225[local60] = this.anIntArray225[local60 + 1];
			}
			this.anIntArray225[255] = (int) (Math.sin((double) anInt917 / 14.0D) * 16.0D + Math.sin((double) anInt917 / 15.0D) * 14.0D + Math.sin((double) anInt917 / 16.0D) * 12.0D);
			if (this.anInt1058 > 0) {
				this.anInt1058 -= 4;
			}
			if (this.anInt1059 > 0) {
				this.anInt1059 -= 4;
			}
			if (this.anInt1058 == 0 && this.anInt1059 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt1058 = 1024;
				}
				if (local172 == 1) {
					this.anInt1059 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("72031, " + arg0 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method655() {
		try {
			if (super.aClass40_2 == null) {
				this.method648();
				this.aClass40_3 = null;
				this.aClass40_4 = null;
				this.anInt900 += 0;
				this.aClass40_5 = null;
				this.aClass40_6 = null;
				this.aClass40_7 = null;
				this.aClass40_8 = null;
				this.aClass40_9 = null;
				this.aClass40_10 = null;
				this.aClass40_11 = null;
				this.aClass40_27 = null;
				this.aClass40_25 = null;
				this.aClass40_24 = null;
				this.aClass40_26 = null;
				this.aClass40_12 = null;
				this.aClass40_13 = null;
				this.aClass40_14 = null;
				super.aClass40_2 = new Class40(503, 765, aByte42, this.method586());
				this.aBoolean212 = true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("69088, " + 0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class7 local9 = this.aClass7ArrayArrayArray1[this.anInt891][arg0][arg1];
		if (local9 == null) {
			this.aClass21_1.method199(this.anInt891, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class8_Sub1_Sub1_Sub2 local23 = null;
		@Pc(27) Class8_Sub1_Sub1_Sub2 local27;
		for (local27 = (Class8_Sub1_Sub1_Sub2) local9.method32(); local27 != null; local27 = (Class8_Sub1_Sub1_Sub2) local9.method34()) {
			@Pc(32) Class46 local32 = Class46.method532(local27.anInt183);
			@Pc(35) int local35 = local32.anInt741;
			if (local32.aBoolean186) {
				local35 *= local27.anInt182 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method30(local23);
		@Pc(65) Class8_Sub1_Sub1_Sub2 local65 = null;
		@Pc(67) Class8_Sub1_Sub1_Sub2 local67 = null;
		for (local27 = (Class8_Sub1_Sub1_Sub2) local9.method32(); local27 != null; local27 = (Class8_Sub1_Sub1_Sub2) local9.method34()) {
			if (local27.anInt183 != local23.anInt183 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt183 != local23.anInt183 && local27.anInt183 != local65.anInt183 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass21_1.method185(this.anInt891, local65, local110, this.method666(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt891), local67, arg1, local23, arg0);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method658() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt975; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt974;
				} else {
					local11 = this.anIntArray249[local3];
				}
				@Pc(23) Class8_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null) {
					this.method678(1, local23);
				}
			}
			anInt897++;
			if (anInt897 > 109) {
				anInt897 = 0;
				this.aClass8_Sub1_Sub3_6.method395(129);
				this.aClass8_Sub1_Sub3_6.method400(0);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("85163, " + -61 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)Ljava/lang/String;")
	private String method659() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("7438, " + 3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method660() {
		try {
			for (@Pc(6) Class8_Sub1_Sub1_Sub6 local6 = (Class8_Sub1_Sub1_Sub6) this.aClass7_12.method32(); local6 != null; local6 = (Class8_Sub1_Sub1_Sub6) this.aClass7_12.method34()) {
				if (local6.anInt649 != this.anInt891 || anInt917 > local6.anInt644) {
					local6.method546();
				} else if (anInt917 >= local6.anInt643) {
					if (local6.anInt640 > 0) {
						@Pc(43) Class8_Sub1_Sub1_Sub1_Sub2 local43 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt640 - 1];
						if (local43 != null && local43.anInt230 >= 0 && local43.anInt230 < 13312 && local43.anInt231 >= 0 && local43.anInt231 < 13312) {
							local6.method473(this.method666(local43.anInt231, local43.anInt230, local6.anInt649) - local6.anInt648, local43.anInt230, anInt917, local43.anInt231);
						}
					}
					if (local6.anInt640 < 0) {
						@Pc(88) int local88 = -local6.anInt640 - 1;
						@Pc(94) Class8_Sub1_Sub1_Sub1_Sub1 local94;
						if (local88 == this.anInt848) {
							local94 = aClass8_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local94 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local88];
						}
						if (local94 != null && local94.anInt230 >= 0 && local94.anInt230 < 13312 && local94.anInt231 >= 0 && local94.anInt231 < 13312) {
							local6.method473(this.method666(local94.anInt231, local94.anInt230, local6.anInt649) - local6.anInt648, local94.anInt230, anInt917, local94.anInt231);
						}
					}
					local6.method474(this.anInt871);
					this.aClass21_1.method189((int) local6.aDouble6, -1, this.anInt891, (int) local6.aDouble5, local6, 60, local6.anInt641, false, (int) local6.aDouble7);
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("59953, " + 11600 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)Z")
	private boolean method661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass21_1.method208(this.anInt891, arg0, arg1, arg3);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class42 local43 = Class42.method512(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt690;
					local54 = local43.anInt707;
				} else {
					local51 = local43.anInt707;
					local54 = local43.anInt690;
				}
				@Pc(65) int local65 = local43.anInt688;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method631(local51, 0, 2, true, 0, local54, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], arg1, local65, arg0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
			} else {
				this.method631(0, local25 + 1, 2, true, local31, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], arg1, 0, arg0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
			}
			this.anInt1006 = super.anInt818;
			this.anInt1007 = super.anInt819;
			this.anInt1009 = 2;
			@Pc(141) boolean local141 = false;
			this.anInt1008 = 0;
			return true;
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("79939, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!TQYMAXSO;ILclient!DEHYKQII;I)V")
	private void method662(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub1_Sub1_Sub1_Sub1 arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) int local5 = 92 / arg0;
			@Pc(17) int local17;
			if ((arg4 & 0x400) != 0) {
				arg3.anInt220 = arg1.method408();
				local17 = arg1.method441();
				arg3.anInt224 = local17 >> 16;
				arg3.anInt223 = anInt917 + (local17 & 0xFFFF);
				arg3.anInt221 = 0;
				arg3.anInt222 = 0;
				if (arg3.anInt223 > anInt917) {
					arg3.anInt221 = -1;
				}
				if (arg3.anInt220 == 65535) {
					arg3.anInt220 = -1;
				}
			}
			if ((arg4 & 0x10) != 0) {
				arg3.aString5 = arg1.method413();
				if (arg3.aString5.charAt(0) == '~') {
					arg3.aString5 = arg3.aString5.substring(1);
					this.method688(arg3.aString4, arg3.aString5, 2);
				} else if (arg3 == aClass8_Sub1_Sub1_Sub1_Sub1_1) {
					this.method688(arg3.aString4, arg3.aString5, 2);
				}
				arg3.anInt229 = 0;
				arg3.anInt209 = 0;
				arg3.anInt186 = 150;
			}
			if ((arg4 & 0x100) != 0) {
				arg3.anInt195 = arg1.method406();
				arg3.anInt197 = arg1.method426();
				arg3.anInt196 = arg1.method427();
				arg3.anInt198 = arg1.method426();
				arg3.anInt199 = arg1.method436(this.aByte41) + anInt917;
				arg3.anInt200 = arg1.method436(this.aByte41) + anInt917;
				arg3.anInt201 = arg1.method406();
				arg3.method87();
			}
			if ((arg4 & 0x80) != 0) {
				arg3.anInt204 = arg1.method434((byte) 7);
				if (arg3.anInt204 == 65535) {
					arg3.anInt204 = -1;
				}
			}
			@Pc(172) int local172;
			@Pc(176) int local176;
			if ((arg4 & 0x2) != 0) {
				local17 = arg1.method408();
				local172 = arg1.method425();
				local176 = arg1.method427();
				@Pc(179) int local179 = arg1.anInt620;
				if (arg3.aString4 != null && arg3.aBoolean25) {
					@Pc(189) long local189 = Class28.method305(arg3.aString4);
					@Pc(191) boolean local191 = false;
					if (local172 <= 1) {
						for (@Pc(196) int local196 = 0; local196 < this.anInt855; local196++) {
							if (this.aLongArray4[local196] == local189) {
								local191 = true;
								break;
							}
						}
					}
					if (!local191 && this.anInt918 == 0) {
						try {
							this.aClass8_Sub1_Sub3_8.anInt620 = 0;
							arg1.method444(this.aClass8_Sub1_Sub3_8.aByteArray13, local176);
							this.aClass8_Sub1_Sub3_8.anInt620 = 0;
							@Pc(241) String local241 = Class6.method26(local176, this.aClass8_Sub1_Sub3_8);
							@Pc(246) String local246 = Class27.method277(local241, this.aByte40);
							arg3.aString5 = local246;
							arg3.anInt229 = local17 >> 8;
							arg3.anInt209 = local17 & 0xFF;
							arg3.anInt186 = 150;
							if (local172 == 2 || local172 == 3) {
								this.method688("@cr2@" + arg3.aString4, local246, 1);
							} else if (local172 == 1) {
								this.method688("@cr1@" + arg3.aString4, local246, 1);
							} else {
								this.method688(arg3.aString4, local246, 2);
							}
						} catch (@Pc(310) Exception local310) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt620 = local179 + local176;
			}
			if ((arg4 & 0x8) != 0) {
				arg3.anInt188 = arg1.method408();
				arg3.anInt189 = arg1.method436(this.aByte41);
			}
			if ((arg4 & 0x1) != 0) {
				local17 = arg1.method436(this.aByte41);
				if (local17 == 65535) {
					local17 = -1;
				}
				local172 = arg1.method425();
				if (local17 == arg3.anInt215 && local17 != -1) {
					local176 = Class20.aClass20Array1[local17].anInt333;
					if (local176 == 1) {
						arg3.anInt216 = 0;
						arg3.anInt217 = 0;
						arg3.anInt218 = local172;
						arg3.anInt219 = 0;
					}
					if (local176 == 2) {
						arg3.anInt219 = 0;
					}
				} else if (local17 == -1 || arg3.anInt215 == -1 || Class20.aClass20Array1[local17].anInt327 >= Class20.aClass20Array1[arg3.anInt215].anInt327) {
					arg3.anInt215 = local17;
					arg3.anInt216 = 0;
					arg3.anInt217 = 0;
					arg3.anInt218 = local172;
					arg3.anInt219 = 0;
					arg3.anInt203 = arg3.anInt214;
				}
			}
			if ((arg4 & 0x200) != 0) {
				local17 = arg1.method425();
				local172 = arg1.method425();
				arg3.method88(local17, anInt917, 155, local172);
				arg3.anInt206 = anInt917 + 300;
				arg3.anInt207 = arg1.method426();
				arg3.anInt208 = arg1.method426();
			}
			if ((arg4 & 0x4) != 0) {
				local17 = arg1.method427();
				@Pc(465) byte[] local465 = new byte[local17];
				@Pc(471) Class8_Sub1_Sub3 local471 = new Class8_Sub1_Sub3(local465, -631);
				arg1.method415(local17, local465);
				this.aClass8_Sub1_Sub3Array1[arg2] = local471;
				arg3.method64(local471);
			}
			if ((arg4 & 0x20) != 0) {
				local17 = arg1.method426();
				local172 = arg1.method426();
				arg3.method88(local17, anInt917, 155, local172);
				arg3.anInt206 = anInt917 + 300;
				arg3.anInt207 = arg1.method406();
				arg3.anInt208 = arg1.method427();
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("52857, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OMJBPTVL;I)Z")
	private boolean method663(@OriginalArg(0) Class24 arg0) {
		try {
			if (arg0.anIntArray140 == null) {
				return false;
			}
			for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray140.length; local20++) {
				@Pc(28) int local28 = this.method690(local20, arg0);
				@Pc(33) int local33 = arg0.anIntArray139[local20];
				if (arg0.anIntArray140[local20] == 2) {
					if (local28 >= local33) {
						return false;
					}
				} else if (arg0.anIntArray140[local20] == 3) {
					if (local28 <= local33) {
						return false;
					}
				} else if (arg0.anIntArray140[local20] == 4) {
					if (local28 == local33) {
						return false;
					}
				} else if (local28 != local33) {
					return false;
				}
			}
			return true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("41525, " + arg0 + ", " + -642 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZI)V")
	private void method664(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1067 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("45720, " + false + ", " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!TQYMAXSO;)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt621 + 21 < arg0 * 8) {
					@Pc(17) int local17 = arg1.method417(14);
					if (local17 != 16383) {
						if (this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local17] == null) {
							this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local17] = new Class8_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(37) Class8_Sub1_Sub1_Sub1_Sub2 local37 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local17];
						this.anIntArray215[this.anInt840++] = local17;
						local37.anInt191 = anInt917;
						@Pc(56) int local56 = arg1.method417(1);
						@Pc(61) int local61 = arg1.method417(5);
						if (local61 > 15) {
							local61 -= 32;
						}
						local37.aClass45_2 = Class45.method520(arg1.method417(13));
						@Pc(77) int local77 = arg1.method417(5);
						if (local77 > 15) {
							local77 -= 32;
						}
						@Pc(86) int local86 = arg1.method417(1);
						if (local86 == 1) {
							this.anIntArray250[this.anInt976++] = local17;
						}
						local37.anInt233 = local37.aClass45_2.aByte21;
						local37.anInt205 = local37.aClass45_2.anInt719;
						local37.anInt225 = local37.aClass45_2.anInt724;
						local37.anInt226 = local37.aClass45_2.anInt713;
						local37.anInt227 = local37.aClass45_2.anInt730;
						local37.anInt228 = local37.aClass45_2.anInt720;
						local37.anInt192 = local37.aClass45_2.anInt709;
						local37.method86(local56 == 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0] + local77, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0] + local61);
						continue;
					}
				}
				arg1.method418();
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("7799, " + arg0 + ", " + 452 + ", " + arg1 + ", " + local163.toString());
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIBI)I")
	private int method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = arg1 >> 7;
			@Pc(17) int local17 = arg0 >> 7;
			if (local13 < 0 || local17 < 0 || local13 > 103 || local17 > 103) {
				return 0;
			}
			@Pc(31) int local31 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local13][local17] & 0x2) == 2) {
				local31 = arg2 + 1;
			}
			@Pc(51) int local51 = arg1 & 0x7F;
			@Pc(55) int local55 = arg0 & 0x7F;
			@Pc(83) int local83 = this.anIntArrayArrayArray8[local31][local13][local17] * (128 - local51) + this.anIntArrayArrayArray8[local31][local13 + 1][local17] * local51 >> 7;
			@Pc(115) int local115 = this.anIntArrayArrayArray8[local31][local13][local17 + 1] * (128 - local51) + this.anIntArrayArrayArray8[local31][local13 + 1][local17 + 1] * local51 >> 7;
			return local83 * (128 - local55) + local115 * local55 >> 7;
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("34853, " + arg0 + ", " + arg1 + ", " + 55 + ", " + arg2 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean212 = true;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("33446, " + -258 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method667(@OriginalArg(0) byte arg0) {
		try {
			this.anInt918 = 0;
			@Pc(10) int local10 = (aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 >> 7) + this.anInt1001;
			@Pc(18) int local18 = (aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 >> 7) + this.anInt1002;
			if (arg0 != -118) {
				this.aClass7ArrayArrayArray1 = null;
			}
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt918 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt918 = 1;
			}
			if (this.anInt918 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt918 = 0;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("92013, " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method668() {
		try {
			@Pc(7) byte[] local7 = this.aClass35_2.method364("title.dat", null);
			@Pc(13) Class8_Sub1_Sub2_Sub2 local13 = new Class8_Sub1_Sub2_Sub2(local7, this);
			this.aClass40_6.method496();
			local13.method382(0, 0);
			this.aClass40_7.method496();
			local13.method382(0, -637);
			this.aClass40_3.method496();
			local13.method382(0, -128);
			this.aClass40_4.method496();
			local13.method382(-371, -202);
			this.aClass40_5.method496();
			local13.method382(-171, -202);
			this.aClass40_8.method496();
			local13.method382(-265, 0);
			this.aClass40_9.method496();
			local13.method382(-265, -562);
			this.aClass40_10.method496();
			local13.method382(-171, -128);
			this.aClass40_11.method496();
			local13.method382(-171, -562);
			@Pc(102) int[] local102 = new int[local13.anInt605];
			for (@Pc(104) int local104 = 0; local104 < local13.anInt606; local104++) {
				for (@Pc(108) int local108 = 0; local108 < local13.anInt605; local108++) {
					local102[local108] = local13.anIntArray174[local13.anInt605 + local13.anInt605 * local104 - local108 - 1];
				}
				for (@Pc(134) int local134 = 0; local134 < local13.anInt605; local134++) {
					local13.anIntArray174[local134 + local13.anInt605 * local104] = local102[local134];
				}
			}
			this.aClass40_6.method496();
			local13.method382(0, 382);
			this.aClass40_7.method496();
			local13.method382(0, -255);
			this.aClass40_3.method496();
			local13.method382(0, 254);
			this.aClass40_4.method496();
			local13.method382(-371, 180);
			this.aClass40_5.method496();
			local13.method382(-171, 180);
			this.aClass40_8.method496();
			local13.method382(-265, 382);
			this.aClass40_9.method496();
			local13.method382(-265, -180);
			this.aClass40_10.method496();
			local13.method382(-171, 254);
			this.aClass40_11.method496();
			local13.method382(-171, -180);
			local13 = new Class8_Sub1_Sub2_Sub2(this.aClass35_2, "logo", 0);
			this.aClass40_3.method496();
			local13.method384(382 - local13.anInt605 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("18409, " + true + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!TQYMAXSO;)V")
	private void method669(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(12) int local12;
			@Pc(21) int local21;
			@Pc(28) int local28;
			@Pc(33) int local33;
			@Pc(38) int local38;
			@Pc(41) int local41;
			@Pc(44) int local44;
			@Pc(49) int local49;
			@Pc(54) int local54;
			@Pc(57) int local57;
			@Pc(60) int local60;
			@Pc(63) int local63;
			if (arg0 == 187) {
				local12 = arg1.method406();
				local21 = this.anInt828 + (local12 >> 4 & 0x7);
				local28 = this.anInt829 + (local12 & 0x7);
				local33 = local21 + arg1.method407();
				local38 = local28 + arg1.method407();
				local41 = arg1.method409();
				local44 = arg1.method408();
				local49 = arg1.method406() * 4;
				local54 = arg1.method406() * 4;
				local57 = arg1.method408();
				local60 = arg1.method408();
				local63 = arg1.method406();
				@Pc(66) int local66 = arg1.method406();
				if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104 && local33 >= 0 && local38 >= 0 && local33 < 104 && local38 < 104 && local44 != 65535) {
					local21 = local21 * 128 + 64;
					local28 = local28 * 128 + 64;
					local33 = local33 * 128 + 64;
					local38 = local38 * 128 + 64;
					@Pc(142) Class8_Sub1_Sub1_Sub6 local142 = new Class8_Sub1_Sub1_Sub6(local57 + anInt917, local63, (byte) -35, local41, local28, this.method666(local28, local21, this.anInt891) - local49, this.anInt891, local54, local66, local44, local60 + anInt917, local21);
					local142.method473(this.method666(local38, local33, this.anInt891) - local54, local33, local57 + anInt917, local38);
					this.aClass7_12.method29(local142);
				}
			} else if (arg0 == 160) {
				local12 = arg1.method406();
				local21 = this.anInt828 + (local12 >> 4 & 0x7);
				local28 = this.anInt829 + (local12 & 0x7);
				local33 = arg1.method408();
				local38 = arg1.method406();
				local41 = arg1.method408();
				if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
					local21 = local21 * 128 + 64;
					local28 = local28 * 128 + 64;
					@Pc(238) Class8_Sub1_Sub1_Sub4 local238 = new Class8_Sub1_Sub1_Sub4(this.anInt891, 0, this.method666(local28, local21, this.anInt891) - local38, anInt917, local21, local41, local33, local28);
					this.aClass7_10.method29(local238);
				}
			} else {
				if (arg0 == 185) {
					local12 = arg1.method406();
					local21 = this.anInt828 + (local12 >> 4 & 0x7);
					local28 = this.anInt829 + (local12 & 0x7);
					local33 = arg1.method408();
					local38 = arg1.method406();
					local41 = local38 >> 4 & 0xF;
					local44 = local38 & 0x7;
					if (aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0] >= local21 - local41 && aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0] <= local21 + local41 && aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0] >= local28 - local41 && aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0] <= local28 + local41 && this.aBoolean233 && !aBoolean236 && this.anInt844 < 50) {
						this.anIntArray272[this.anInt844] = local33;
						this.anIntArray265[this.anInt844] = local44;
						this.anIntArray212[this.anInt844] = Class41.anIntArray180[local33];
						this.anInt844++;
					}
				}
				if (arg0 == 14) {
					local12 = arg1.method427();
					local21 = this.anInt828 + (local12 >> 4 & 0x7);
					local28 = this.anInt829 + (local12 & 0x7);
					local33 = arg1.method426();
					local38 = local33 >> 2;
					local41 = local33 & 0x3;
					local44 = this.anIntArray213[local38];
					local49 = arg1.method434((byte) 7);
					if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
						this.method703(local49, 0, this.aByte39, local21, local44, -1, local41, this.anInt891, local38, local28);
					}
				} else {
					@Pc(471) Class8_Sub1_Sub1_Sub2 local471;
					if (arg0 == 91) {
						local12 = arg1.method427();
						local21 = this.anInt828 + (local12 >> 4 & 0x7);
						local28 = this.anInt829 + (local12 & 0x7);
						local33 = arg1.method436(this.aByte41);
						if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
							@Pc(465) Class7 local465 = this.aClass7ArrayArrayArray1[this.anInt891][local21][local28];
							if (local465 != null) {
								for (local471 = (Class8_Sub1_Sub1_Sub2) local465.method32(); local471 != null; local471 = (Class8_Sub1_Sub1_Sub2) local465.method34()) {
									if (local471.anInt183 == (local33 & 0x7FFF)) {
										local471.method546();
										break;
									}
								}
								if (local465.method32() == null) {
									this.aClass7ArrayArrayArray1[this.anInt891][local21][local28] = null;
								}
								this.method656(local21, local28);
							}
						}
					} else {
						if (arg0 == 128) {
							local12 = arg1.method434((byte) 7);
							local21 = arg1.method406();
							local28 = this.anInt828 + (local21 >> 4 & 0x7);
							local33 = this.anInt829 + (local21 & 0x7);
							local38 = arg1.method435(this.anInt866);
							local41 = arg1.method408();
							local44 = arg1.method408();
							local49 = arg1.method406();
							local54 = local49 >> 2;
							local57 = local49 & 0x3;
							local60 = this.anIntArray213[local54];
							@Pc(565) byte local565 = arg1.method428();
							@Pc(569) byte local569 = arg1.method428();
							@Pc(573) byte local573 = arg1.method429();
							@Pc(577) byte local577 = arg1.method428();
							@Pc(583) Class8_Sub1_Sub1_Sub1_Sub1 local583;
							if (local44 == this.anInt848) {
								local583 = aClass8_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local583 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local44];
							}
							if (local583 != null) {
								@Pc(595) Class42 local595 = Class42.method512(local41);
								@Pc(605) int local605 = this.anIntArrayArrayArray8[this.anInt891][local28][local33];
								@Pc(617) int local617 = this.anIntArrayArrayArray8[this.anInt891][local28 + 1][local33];
								@Pc(631) int local631 = this.anIntArrayArrayArray8[this.anInt891][local28 + 1][local33 + 1];
								@Pc(643) int local643 = this.anIntArrayArrayArray8[this.anInt891][local28][local33 + 1];
								@Pc(653) Class8_Sub1_Sub1_Sub3 local653 = local595.method513(local54, local57, local605, local617, local631, local643, -1);
								if (local653 != null) {
									this.method703(-1, local38 + 1, this.aByte39, local28, local60, local12 + 1, 0, this.anInt891, 0, local33);
									local583.anInt144 = local38 + anInt917;
									local583.anInt145 = local12 + anInt917;
									local583.aClass8_Sub1_Sub1_Sub3_1 = local653;
									@Pc(689) int local689 = local595.anInt690;
									@Pc(692) int local692 = local595.anInt707;
									if (local57 == 1 || local57 == 3) {
										local689 = local595.anInt707;
										local692 = local595.anInt690;
									}
									local583.anInt148 = local28 * 128 + local689 * 64;
									local583.anInt150 = local33 * 128 + local692 * 64;
									local583.anInt149 = this.method666(local583.anInt150, local583.anInt148, this.anInt891);
									@Pc(738) byte local738;
									if (local573 > local577) {
										local738 = local573;
										local573 = local577;
										local577 = local738;
									}
									if (local565 > local569) {
										local738 = local565;
										local565 = local569;
										local569 = local738;
									}
									local583.anInt151 = local28 + local573;
									local583.anInt153 = local28 + local577;
									local583.anInt152 = local33 + local565;
									local583.anInt154 = local33 + local569;
								}
							}
						}
						if (arg0 == 103) {
							local12 = arg1.method427();
							local21 = local12 >> 2;
							local28 = local12 & 0x3;
							local33 = this.anIntArray213[local21];
							local38 = arg1.method425();
							local41 = this.anInt828 + (local38 >> 4 & 0x7);
							local44 = this.anInt829 + (local38 & 0x7);
							if (local41 >= 0 && local44 >= 0 && local41 < 104 && local44 < 104) {
								this.method703(-1, 0, this.aByte39, local41, local33, -1, local28, this.anInt891, local21, local44);
							}
						} else if (arg0 == 255) {
							local12 = arg1.method435(this.anInt866);
							local21 = arg1.method426();
							local28 = this.anInt828 + (local21 >> 4 & 0x7);
							local33 = this.anInt829 + (local21 & 0x7);
							local38 = arg1.method406();
							local41 = local38 >> 2;
							local44 = local38 & 0x3;
							local49 = this.anIntArray213[local41];
							if (local28 >= 0 && local33 >= 0 && local28 < 103 && local33 < 103) {
								local54 = this.anIntArrayArrayArray8[this.anInt891][local28][local33];
								local57 = this.anIntArrayArrayArray8[this.anInt891][local28 + 1][local33];
								local60 = this.anIntArrayArrayArray8[this.anInt891][local28 + 1][local33 + 1];
								local63 = this.anIntArrayArrayArray8[this.anInt891][local28][local33 + 1];
								if (local49 == 0) {
									@Pc(949) Class18 local949 = this.aClass21_1.method200(this.anInt891, local28, local33);
									if (local949 != null) {
										@Pc(958) int local958 = local949.anInt308 >> 14 & 0x7FFF;
										if (local41 == 2) {
											local949.aClass8_Sub1_Sub1_1 = new Class8_Sub1_Sub1_Sub5(local63, local958, local57, false, local44 + 4, 2, local60, local12, (byte) -108, local54);
											local949.aClass8_Sub1_Sub1_2 = new Class8_Sub1_Sub1_Sub5(local63, local958, local57, false, local44 + 1 & 0x3, 2, local60, local12, (byte) -108, local54);
										} else {
											local949.aClass8_Sub1_Sub1_1 = new Class8_Sub1_Sub1_Sub5(local63, local958, local57, false, local44, local41, local60, local12, (byte) -108, local54);
										}
									}
								}
								if (local49 == 1) {
									@Pc(1027) Class50 local1027 = this.aClass21_1.method201(this.anInt891, local33, local28, this.anInt942);
									if (local1027 != null) {
										local1027.aClass8_Sub1_Sub1_8 = new Class8_Sub1_Sub1_Sub5(local63, local1027.anInt802 >> 14 & 0x7FFF, local57, false, 0, 4, local60, local12, (byte) -108, local54);
									}
								}
								if (local49 == 2) {
									@Pc(1061) Class48 local1061 = this.aClass21_1.method202(local33, this.anInt891, local28);
									if (local41 == 11) {
										local41 = 10;
									}
									if (local1061 != null) {
										local1061.aClass8_Sub1_Sub1_7 = new Class8_Sub1_Sub1_Sub5(local63, local1061.anInt779 >> 14 & 0x7FFF, local57, false, local44, local41, local60, local12, (byte) -108, local54);
									}
								}
								if (local49 == 3) {
									@Pc(1100) Class25 local1100 = this.aClass21_1.method203(local28, local33, (byte) 8, this.anInt891);
									if (local1100 != null) {
										local1100.aClass8_Sub1_Sub1_3 = new Class8_Sub1_Sub1_Sub5(local63, local1100.anInt465 >> 14 & 0x7FFF, local57, false, local44, 22, local60, local12, (byte) -108, local54);
									}
								}
							}
						} else if (arg0 == 210) {
							local12 = arg1.method408();
							local21 = arg1.method426();
							local28 = this.anInt828 + (local21 >> 4 & 0x7);
							local33 = this.anInt829 + (local21 & 0x7);
							local38 = arg1.method434((byte) 7);
							local41 = arg1.method436(this.aByte41);
							if (local28 >= 0 && local33 >= 0 && local28 < 104 && local33 < 104 && local38 != this.anInt848) {
								@Pc(1176) Class8_Sub1_Sub1_Sub2 local1176 = new Class8_Sub1_Sub1_Sub2();
								local1176.anInt183 = local12;
								local1176.anInt182 = local41;
								if (this.aClass7ArrayArrayArray1[this.anInt891][local28][local33] == null) {
									this.aClass7ArrayArrayArray1[this.anInt891][local28][local33] = new Class7((byte) 1);
								}
								this.aClass7ArrayArrayArray1[this.anInt891][local28][local33].method29(local1176);
								this.method656(local28, local33);
							}
						} else if (arg0 == 47) {
							local12 = arg1.method406();
							local21 = this.anInt828 + (local12 >> 4 & 0x7);
							local28 = this.anInt829 + (local12 & 0x7);
							local33 = arg1.method408();
							local38 = arg1.method408();
							local41 = arg1.method408();
							if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
								@Pc(1272) Class7 local1272 = this.aClass7ArrayArrayArray1[this.anInt891][local21][local28];
								if (local1272 != null) {
									for (@Pc(1278) Class8_Sub1_Sub1_Sub2 local1278 = (Class8_Sub1_Sub1_Sub2) local1272.method32(); local1278 != null; local1278 = (Class8_Sub1_Sub1_Sub2) local1272.method34()) {
										if (local1278.anInt183 == (local33 & 0x7FFF) && local1278.anInt182 == local38) {
											local1278.anInt182 = local41;
											break;
										}
									}
									this.method656(local21, local28);
								}
							}
						} else if (arg0 == 69) {
							local12 = arg1.method427();
							local21 = this.anInt828 + (local12 >> 4 & 0x7);
							local28 = this.anInt829 + (local12 & 0x7);
							local33 = arg1.method435(this.anInt866);
							local38 = arg1.method434((byte) 7);
							if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
								local471 = new Class8_Sub1_Sub1_Sub2();
								local471.anInt183 = local38;
								local471.anInt182 = local33;
								if (this.aClass7ArrayArrayArray1[this.anInt891][local21][local28] == null) {
									this.aClass7ArrayArrayArray1[this.anInt891][local21][local28] = new Class7((byte) 1);
								}
								this.aClass7ArrayArrayArray1[this.anInt891][local21][local28].method29(local471);
								this.method656(local21, local28);
							}
						}
					}
				}
			}
		} catch (@Pc(1399) RuntimeException local1399) {
			signlink.reporterror("33155, " + 24 + ", " + arg0 + ", " + arg1 + ", " + local1399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method670() {
		try {
			this.anInt1039++;
			this.method601(true);
			this.method636(true);
			this.method601(false);
			this.method636(false);
			this.method660();
			this.method598(this.anInt1029);
			@Pc(36) int local36;
			@Pc(75) int local75;
			if (!this.aBoolean200) {
				local36 = this.anInt919;
				if (this.anInt873 / 256 > local36) {
					local36 = this.anInt873 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray242[4] + 128 > local36) {
					local36 = this.anIntArray242[4] + 128;
				}
				local75 = this.anInt920 + this.anInt908 & 0x7FF;
				this.method621(this.anInt852, local36 * 3 + 600, local36, this.method666(aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231, aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230, this.anInt891) - 50, this.anInt851, local75);
			}
			if (this.aBoolean200) {
				local36 = this.method705((byte) 3);
			} else {
				local36 = this.method704(436);
			}
			local75 = this.anInt949;
			@Pc(123) int local123 = this.anInt950;
			@Pc(126) int local126 = this.anInt951;
			@Pc(129) int local129 = this.anInt952;
			@Pc(132) int local132 = this.anInt953;
			@Pc(181) int local181;
			for (@Pc(134) int local134 = 0; local134 < 5; local134++) {
				if (this.aBooleanArray12[local134]) {
					local181 = (int) (Math.random() * (double) (this.anIntArray273[local134] * 2 + 1) - (double) this.anIntArray273[local134] + Math.sin((double) this.anIntArray214[local134] * ((double) this.anIntArray221[local134] / 100.0D)) * (double) this.anIntArray242[local134]);
					if (local134 == 0) {
						this.anInt949 += local181;
					}
					if (local134 == 1) {
						this.anInt950 += local181;
					}
					if (local134 == 2) {
						this.anInt951 += local181;
					}
					if (local134 == 3) {
						this.anInt953 = this.anInt953 + local181 & 0x7FF;
					}
					if (local134 == 4) {
						this.anInt952 += local181;
						if (this.anInt952 < 128) {
							this.anInt952 = 128;
						}
						if (this.anInt952 > 383) {
							this.anInt952 = 383;
						}
					}
				}
			}
			local181 = Class8_Sub1_Sub2_Sub1.anInt569;
			Class8_Sub1_Sub1_Sub3.aBoolean68 = true;
			Class8_Sub1_Sub1_Sub3.anInt302 = 0;
			Class8_Sub1_Sub1_Sub3.anInt300 = super.anInt812 - 4;
			Class8_Sub1_Sub1_Sub3.anInt301 = super.anInt813 - 4;
			Class8_Sub1_Sub2.method551();
			this.aClass21_1.method217(this.anInt845, this.anInt951, this.anInt952, local36, this.anInt950, this.anInt949, this.anInt953);
			this.aClass21_1.method192();
			this.method642();
			this.method710();
			this.method605(local181);
			this.method651();
			this.aClass40_26.method497(4, 4, super.aGraphics2);
			this.anInt949 = local75;
			this.anInt950 = local123;
			this.anInt951 = local126;
			this.anInt952 = local129;
			this.anInt953 = local132;
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("75860, " + false + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method671(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt855; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt855--;
						this.aBoolean215 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt855; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass8_Sub1_Sub3_6.method395(185);
						this.aClass8_Sub1_Sub3_6.method402(66, arg0);
						break;
					}
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("69546, " + arg0 + ", " + -778 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method672(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0 && super.anInt817 == 1) {
				if (super.anInt818 >= 6 && super.anInt818 <= 106 && super.anInt819 >= 467 && super.anInt819 <= 499) {
					this.anInt934 = (this.anInt934 + 1) % 4;
					this.aBoolean224 = true;
					this.aBoolean206 = true;
					this.aClass8_Sub1_Sub3_6.method395(232);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt934);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt965);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt898);
				}
				if (super.anInt818 >= 135 && super.anInt818 <= 235 && super.anInt819 >= 467 && super.anInt819 <= 499) {
					this.anInt965 = (this.anInt965 + 1) % 3;
					this.aBoolean224 = true;
					this.aBoolean206 = true;
					this.aClass8_Sub1_Sub3_6.method395(232);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt934);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt965);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt898);
				}
				if (super.anInt818 >= 273 && super.anInt818 <= 373 && super.anInt819 >= 467 && super.anInt819 <= 499) {
					this.anInt898 = (this.anInt898 + 1) % 3;
					this.aBoolean224 = true;
					this.aBoolean206 = true;
					this.aClass8_Sub1_Sub3_6.method395(232);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt934);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt965);
					this.aClass8_Sub1_Sub3_6.method396(this.anInt898);
				}
				if (super.anInt818 >= 412 && super.anInt818 <= 512 && super.anInt819 >= 467 && super.anInt819 <= 499) {
					if (this.anInt827 == -1) {
						this.method675((byte) 2);
						this.aString23 = "";
						this.aBoolean217 = false;
						this.anInt969 = this.anInt827 = Class24.anInt442;
						return;
					}
					this.method688("", "Please close the interface you have open before using 'report abuse'", 0);
					return;
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("7282, " + arg0 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method675(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.aClass8_Sub1_Sub3_6.method395(188);
			if (this.anInt843 != -1) {
				this.method638(this.anInt843);
				this.anInt843 = -1;
				this.aBoolean215 = true;
				this.aBoolean237 = false;
				this.aBoolean231 = true;
			}
			if (this.anInt833 != -1) {
				this.method638(this.anInt833);
				this.anInt833 = -1;
				this.aBoolean206 = true;
				this.aBoolean237 = false;
			}
			if (this.anInt947 != -1) {
				this.method638(this.anInt947);
				this.anInt947 = -1;
				this.aBoolean212 = true;
			}
			if (this.anInt1012 != -1) {
				this.method638(this.anInt1012);
				this.anInt1012 = -1;
			}
			if (this.anInt827 != -1) {
				this.method638(this.anInt827);
				this.anInt827 = -1;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("95633, " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method676() {
		try {
			@Pc(6) int local6 = this.anInt1040 * 128 + 64;
			@Pc(13) int local13 = this.anInt1041 * 128 + 64;
			@Pc(24) int local24 = this.method666(local13, local6, this.anInt891) - this.anInt1042;
			if (this.anInt949 < local6) {
				this.anInt949 += this.anInt1043 + (local6 - this.anInt949) * this.anInt1044 / 1000;
				if (this.anInt949 > local6) {
					this.anInt949 = local6;
				}
			}
			if (this.anInt949 > local6) {
				this.anInt949 -= this.anInt1043 + (this.anInt949 - local6) * this.anInt1044 / 1000;
				if (this.anInt949 < local6) {
					this.anInt949 = local6;
				}
			}
			if (this.anInt950 < local24) {
				this.anInt950 += this.anInt1043 + (local24 - this.anInt950) * this.anInt1044 / 1000;
				if (this.anInt950 > local24) {
					this.anInt950 = local24;
				}
			}
			if (this.anInt950 > local24) {
				this.anInt950 -= this.anInt1043 + (this.anInt950 - local24) * this.anInt1044 / 1000;
				if (this.anInt950 < local24) {
					this.anInt950 = local24;
				}
			}
			if (this.anInt951 < local13) {
				this.anInt951 += this.anInt1043 + (local13 - this.anInt951) * this.anInt1044 / 1000;
				if (this.anInt951 > local13) {
					this.anInt951 = local13;
				}
			}
			if (this.anInt951 > local13) {
				this.anInt951 -= this.anInt1043 + (this.anInt951 - local13) * this.anInt1044 / 1000;
				if (this.anInt951 < local13) {
					this.anInt951 = local13;
				}
			}
			local6 = this.anInt910 * 128 + 64;
			local13 = this.anInt911 * 128 + 64;
			local24 = this.method666(local13, local6, this.anInt891) - this.anInt912;
			@Pc(226) int local226 = local6 - this.anInt949;
			@Pc(231) int local231 = local24 - this.anInt950;
			@Pc(236) int local236 = local13 - this.anInt951;
			@Pc(247) int local247 = (int) Math.sqrt((double) (local226 * local226 + local236 * local236));
			@Pc(258) int local258 = (int) (Math.atan2((double) local231, (double) local247) * 325.949D) & 0x7FF;
			@Pc(269) int local269 = (int) (Math.atan2((double) local226, (double) local236) * -325.949D) & 0x7FF;
			if (local258 < 128) {
				local258 = 128;
			}
			if (local258 > 383) {
				local258 = 383;
			}
			if (this.anInt952 < local258) {
				this.anInt952 += this.anInt913 + (local258 - this.anInt952) * this.anInt914 / 1000;
				if (this.anInt952 > local258) {
					this.anInt952 = local258;
				}
			}
			if (this.anInt952 > local258) {
				this.anInt952 -= this.anInt913 + (this.anInt952 - local258) * this.anInt914 / 1000;
				if (this.anInt952 < local258) {
					this.anInt952 = local258;
				}
			}
			@Pc(340) int local340 = local269 - this.anInt953;
			if (local340 > 1024) {
				local340 -= 2048;
			}
			if (local340 < -1024) {
				local340 += 2048;
			}
			if (local340 > 0) {
				this.anInt953 += this.anInt913 + local340 * this.anInt914 / 1000;
				this.anInt953 &= 0x7FF;
			}
			if (local340 < 0) {
				this.anInt953 -= this.anInt913 + -local340 * this.anInt914 / 1000;
				this.anInt953 &= 0x7FF;
			}
			@Pc(398) int local398 = local269 - this.anInt953;
			if (local398 > 1024) {
				local398 -= 2048;
			}
			if (local398 < -1024) {
				local398 += 2048;
			}
			if (local398 < 0 && local340 > 0 || local398 > 0 && local340 < 0) {
				this.anInt953 = local269;
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("19203, " + -2 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method677() {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anInt840; local11++) {
				@Pc(18) int local18 = this.anIntArray215[local11];
				@Pc(23) Class8_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local18];
				if (local23 != null) {
					this.method678(local23.aClass45_2.aByte21, local23);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("61016, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!JFHWDRLM;)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt230 < 128 || arg1.anInt231 < 128 || arg1.anInt230 >= 13184 || arg1.anInt231 >= 13184) {
				arg1.anInt215 = -1;
				arg1.anInt220 = -1;
				arg1.anInt199 = 0;
				arg1.anInt200 = 0;
				arg1.anInt230 = arg1.anIntArray59[0] * 128 + arg1.anInt233 * 64;
				arg1.anInt231 = arg1.anIntArray60[0] * 128 + arg1.anInt233 * 64;
				arg1.method87();
			}
			if (arg1 == aClass8_Sub1_Sub1_Sub1_Sub1_1 && (arg1.anInt230 < 1536 || arg1.anInt231 < 1536 || arg1.anInt230 >= 11776 || arg1.anInt231 >= 11776)) {
				arg1.anInt215 = -1;
				arg1.anInt220 = -1;
				arg1.anInt199 = 0;
				arg1.anInt200 = 0;
				arg1.anInt230 = arg1.anIntArray59[0] * 128 + arg1.anInt233 * 64;
				arg1.anInt231 = arg1.anIntArray60[0] * 128 + arg1.anInt233 * 64;
				arg1.method87();
			}
			if (arg1.anInt199 > anInt917) {
				this.method679(arg1);
			} else if (arg1.anInt200 >= anInt917) {
				this.method680(arg1);
			} else {
				this.method681(arg1);
			}
			this.method682(arg1);
			this.method683(arg1);
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("77975, " + arg0 + ", " + false + ", " + arg1 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!JFHWDRLM;)V")
	private void method679(@OriginalArg(1) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt199 - anInt917;
			@Pc(22) int local22 = arg0.anInt195 * 128 + arg0.anInt233 * 64;
			@Pc(32) int local32 = arg0.anInt197 * 128 + arg0.anInt233 * 64;
			arg0.anInt230 += (local22 - arg0.anInt230) / local4;
			arg0.anInt231 += (local32 - arg0.anInt231) / local4;
			arg0.anInt202 = 0;
			if (arg0.anInt201 == 0) {
				arg0.anInt187 = 1024;
			}
			if (arg0.anInt201 == 1) {
				arg0.anInt187 = 1536;
			}
			if (arg0.anInt201 == 2) {
				arg0.anInt187 = 0;
			}
			if (arg0.anInt201 == 3) {
				arg0.anInt187 = 512;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("15657, " + 32707 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JFHWDRLM;Z)V")
	private void method680(@OriginalArg(0) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			this.aBoolean218 &= true;
			if (arg0.anInt200 == anInt917 || arg0.anInt215 == -1 || arg0.anInt218 != 0 || arg0.anInt217 + 1 > Class20.aClass20Array1[arg0.anInt215].method170(arg0.anInt216)) {
				@Pc(35) int local35 = arg0.anInt200 - arg0.anInt199;
				@Pc(40) int local40 = anInt917 - arg0.anInt199;
				@Pc(50) int local50 = arg0.anInt195 * 128 + arg0.anInt233 * 64;
				@Pc(60) int local60 = arg0.anInt197 * 128 + arg0.anInt233 * 64;
				@Pc(70) int local70 = arg0.anInt196 * 128 + arg0.anInt233 * 64;
				@Pc(80) int local80 = arg0.anInt198 * 128 + arg0.anInt233 * 64;
				arg0.anInt230 = (local50 * (local35 - local40) + local70 * local40) / local35;
				arg0.anInt231 = (local60 * (local35 - local40) + local80 * local40) / local35;
			}
			arg0.anInt202 = 0;
			if (arg0.anInt201 == 0) {
				arg0.anInt187 = 1024;
			}
			if (arg0.anInt201 == 1) {
				arg0.anInt187 = 1536;
			}
			if (arg0.anInt201 == 2) {
				arg0.anInt187 = 0;
			}
			if (arg0.anInt201 == 3) {
				arg0.anInt187 = 512;
			}
			arg0.anInt232 = arg0.anInt187;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("94219, " + arg0 + ", " + true + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!JFHWDRLM;)V")
	private void method681(@OriginalArg(1) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt210 = arg0.anInt192;
			if (arg0.anInt214 == 0) {
				arg0.anInt202 = 0;
			} else {
				if (arg0.anInt215 != -1 && arg0.anInt218 == 0) {
					@Pc(24) Class20 local24 = Class20.aClass20Array1[arg0.anInt215];
					if (arg0.anInt203 > 0 && local24.anInt331 == 0) {
						arg0.anInt202++;
						return;
					}
					if (arg0.anInt203 <= 0 && local24.anInt332 == 0) {
						arg0.anInt202++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt230;
				@Pc(56) int local56 = arg0.anInt231;
				@Pc(76) int local76 = arg0.anIntArray59[arg0.anInt214 - 1] * 128 + arg0.anInt233 * 64;
				@Pc(91) int local91 = arg0.anIntArray60[arg0.anInt214 - 1] * 128 + arg0.anInt233 * 64;
				if (local76 - local53 <= 256 && local76 - local53 >= -256 && local91 - local56 <= 256 && local91 - local56 >= -256) {
					if (local53 < local76) {
						if (local56 < local91) {
							arg0.anInt187 = 1280;
						} else if (local56 > local91) {
							arg0.anInt187 = 1792;
						} else {
							arg0.anInt187 = 1536;
						}
					} else if (local53 > local76) {
						if (local56 < local91) {
							arg0.anInt187 = 768;
						} else if (local56 > local91) {
							arg0.anInt187 = 256;
						} else {
							arg0.anInt187 = 512;
						}
					} else if (local56 < local91) {
						arg0.anInt187 = 1024;
					} else {
						arg0.anInt187 = 0;
					}
					@Pc(185) int local185 = arg0.anInt187 - arg0.anInt232 & 0x7FF;
					if (local185 > 1024) {
						local185 -= 2048;
					}
					@Pc(192) int local192 = arg0.anInt226;
					if (local185 >= -256 && local185 <= 256) {
						local192 = arg0.anInt225;
					} else if (local185 >= 256 && local185 < 768) {
						local192 = arg0.anInt228;
					} else if (local185 >= -768 && local185 <= -256) {
						local192 = arg0.anInt227;
					}
					if (local192 == -1) {
						local192 = arg0.anInt225;
					}
					arg0.anInt210 = local192;
					@Pc(234) int local234 = 4;
					if (arg0.anInt232 != arg0.anInt187 && arg0.anInt204 == -1 && arg0.anInt205 != 0) {
						local234 = 2;
					}
					if (arg0.anInt214 > 2) {
						local234 = 6;
					}
					if (arg0.anInt214 > 3) {
						local234 = 8;
					}
					if (arg0.anInt202 > 0 && arg0.anInt214 > 1) {
						local234 = 8;
						arg0.anInt202--;
					}
					if (arg0.aBooleanArray4[arg0.anInt214 - 1]) {
						local234 <<= 0x1;
					}
					if (local234 >= 8 && arg0.anInt210 == arg0.anInt225 && arg0.anInt190 != -1) {
						arg0.anInt210 = arg0.anInt190;
					}
					if (local53 < local76) {
						arg0.anInt230 += local234;
						if (arg0.anInt230 > local76) {
							arg0.anInt230 = local76;
						}
					} else if (local53 > local76) {
						arg0.anInt230 -= local234;
						if (arg0.anInt230 < local76) {
							arg0.anInt230 = local76;
						}
					}
					if (local56 < local91) {
						arg0.anInt231 += local234;
						if (arg0.anInt231 > local91) {
							arg0.anInt231 = local91;
						}
					} else if (local56 > local91) {
						arg0.anInt231 -= local234;
						if (arg0.anInt231 < local91) {
							arg0.anInt231 = local91;
						}
					}
					if (arg0.anInt230 == local76 && arg0.anInt231 == local91) {
						arg0.anInt214--;
						if (arg0.anInt203 > 0) {
							arg0.anInt203--;
							return;
						}
					}
				} else {
					arg0.anInt230 = local76;
					arg0.anInt231 = local91;
				}
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("34008, " + 3 + ", " + arg0 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!JFHWDRLM;)V")
	private void method682(@OriginalArg(1) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			if (this.aByte38 != 0) {
				this.method581();
			}
			if (arg0.anInt205 != 0) {
				@Pc(37) int local37;
				@Pc(43) int local43;
				if (arg0.anInt204 != -1 && arg0.anInt204 < 32768) {
					@Pc(29) Class8_Sub1_Sub1_Sub1_Sub2 local29 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt204];
					if (local29 != null) {
						local37 = arg0.anInt230 - local29.anInt230;
						local43 = arg0.anInt231 - local29.anInt231;
						if (local37 != 0 || local43 != 0) {
							arg0.anInt187 = (int) (Math.atan2((double) local37, (double) local43) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(68) int local68;
				if (arg0.anInt204 >= 32768) {
					local68 = arg0.anInt204 - 32768;
					if (local68 == this.anInt848) {
						local68 = this.anInt974;
					}
					@Pc(80) Class8_Sub1_Sub1_Sub1_Sub1 local80 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local68];
					if (local80 != null) {
						local43 = arg0.anInt230 - local80.anInt230;
						@Pc(94) int local94 = arg0.anInt231 - local80.anInt231;
						if (local43 != 0 || local94 != 0) {
							arg0.anInt187 = (int) (Math.atan2((double) local43, (double) local94) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt188 != 0 || arg0.anInt189 != 0) && (arg0.anInt214 == 0 || arg0.anInt202 > 0)) {
					local68 = arg0.anInt230 - (arg0.anInt188 - this.anInt1001 - this.anInt1001) * 64;
					local37 = arg0.anInt231 - (arg0.anInt189 - this.anInt1002 - this.anInt1002) * 64;
					if (local68 != 0 || local37 != 0) {
						arg0.anInt187 = (int) (Math.atan2((double) local68, (double) local37) * 325.949D) & 0x7FF;
					}
					arg0.anInt188 = 0;
					arg0.anInt189 = 0;
				}
				local68 = arg0.anInt187 - arg0.anInt232 & 0x7FF;
				if (local68 != 0) {
					if (local68 < arg0.anInt205 || local68 > 2048 - arg0.anInt205) {
						arg0.anInt232 = arg0.anInt187;
					} else if (local68 > 1024) {
						arg0.anInt232 -= arg0.anInt205;
					} else {
						arg0.anInt232 += arg0.anInt205;
					}
					arg0.anInt232 &= 0x7FF;
					if (arg0.anInt210 == arg0.anInt192 && arg0.anInt232 != arg0.anInt187) {
						if (arg0.anInt193 != -1) {
							arg0.anInt210 = arg0.anInt193;
							return;
						}
						arg0.anInt210 = arg0.anInt225;
						return;
					}
				}
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("12090, " + 0 + ", " + arg0 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JFHWDRLM;I)V")
	private void method683(@OriginalArg(0) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean45 = false;
			@Pc(23) Class20 local23;
			if (arg0.anInt210 != -1) {
				local23 = Class20.aClass20Array1[arg0.anInt210];
				arg0.anInt212++;
				if (arg0.anInt211 < local23.anInt325 && arg0.anInt212 > local23.method170(arg0.anInt211)) {
					arg0.anInt212 = 0;
					arg0.anInt211++;
				}
				if (arg0.anInt211 >= local23.anInt325) {
					arg0.anInt212 = 0;
					arg0.anInt211 = 0;
				}
			}
			if (arg0.anInt220 != -1 && anInt917 >= arg0.anInt223) {
				if (arg0.anInt221 < 0) {
					arg0.anInt221 = 0;
				}
				local23 = Class32.aClass32Array1[arg0.anInt220].aClass20_2;
				arg0.anInt222++;
				while (arg0.anInt221 < local23.anInt325 && arg0.anInt222 > local23.method170(arg0.anInt221)) {
					arg0.anInt222 -= local23.method170(arg0.anInt221);
					arg0.anInt221++;
				}
				if (arg0.anInt221 >= local23.anInt325 && (arg0.anInt221 < 0 || arg0.anInt221 >= local23.anInt325)) {
					arg0.anInt220 = -1;
				}
			}
			if (arg0.anInt215 != -1 && arg0.anInt218 <= 1) {
				local23 = Class20.aClass20Array1[arg0.anInt215];
				if (local23.anInt331 == 1 && arg0.anInt203 > 0 && arg0.anInt199 <= anInt917 && arg0.anInt200 < anInt917) {
					arg0.anInt218 = 1;
					return;
				}
			}
			if (arg0.anInt215 != -1 && arg0.anInt218 == 0) {
				local23 = Class20.aClass20Array1[arg0.anInt215];
				arg0.anInt217++;
				while (arg0.anInt216 < local23.anInt325 && arg0.anInt217 > local23.method170(arg0.anInt216)) {
					arg0.anInt217 -= local23.method170(arg0.anInt216);
					arg0.anInt216++;
				}
				if (arg0.anInt216 >= local23.anInt325) {
					arg0.anInt216 -= local23.anInt326;
					arg0.anInt219++;
					if (arg0.anInt219 >= local23.anInt330) {
						arg0.anInt215 = -1;
					}
					if (arg0.anInt216 < 0 || arg0.anInt216 >= local23.anInt325) {
						arg0.anInt215 = -1;
					}
				}
				arg0.aBoolean45 = local23.aBoolean76;
			}
			if (arg0.anInt218 > 0) {
				arg0.anInt218--;
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("29333, " + arg0 + ", " + -241 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method684() {
		try {
			if (this.aByte35 != -50) {
				this.anInt901 = -1;
			}
			if (this.anInt947 == -1 || this.anInt825 != 2 && super.aClass40_2 == null) {
				if (this.aBoolean212) {
					this.method641((byte) 7);
					this.aBoolean212 = false;
					this.aClass40_15.method497(4, 0, super.aGraphics2);
					this.aClass40_16.method497(357, 0, super.aGraphics2);
					this.aClass40_17.method497(4, 722, super.aGraphics2);
					this.aClass40_18.method497(205, 743, super.aGraphics2);
					this.aClass40_19.method497(0, 0, super.aGraphics2);
					this.aClass40_20.method497(4, 516, super.aGraphics2);
					this.aClass40_21.method497(205, 516, super.aGraphics2);
					this.aClass40_22.method497(357, 496, super.aGraphics2);
					this.aClass40_23.method497(338, 0, super.aGraphics2);
					this.aBoolean215 = true;
					this.aBoolean206 = true;
					this.aBoolean231 = true;
					this.aBoolean224 = true;
					if (this.anInt825 != 2) {
						this.aClass40_26.method497(4, 4, super.aGraphics2);
						this.aClass40_25.method497(4, 550, super.aGraphics2);
					}
				}
				if (this.anInt825 == 2) {
					this.method670();
				}
				if (this.aBoolean216 && this.anInt1020 == 1) {
					this.aBoolean215 = true;
				}
				@Pc(284) boolean local284;
				if (this.anInt843 != -1) {
					local284 = this.method615(this.anInt843, (byte) 4, this.anInt871);
					if (local284) {
						this.aBoolean215 = true;
					}
				}
				if (this.anInt1053 == 2) {
					this.aBoolean215 = true;
				}
				if (this.anInt957 == 2) {
					this.aBoolean215 = true;
				}
				if (this.aBoolean215) {
					this.method699();
					this.aBoolean215 = false;
				}
				@Pc(369) int local369;
				if (this.anInt833 == -1 && this.anInt985 == 0) {
					this.aClass24_1.anInt451 = this.anInt879 - this.anInt836 - 77;
					if (super.anInt812 > 448 && super.anInt812 < 560 && super.anInt813 > 332) {
						this.method620(77, 463, this.anInt879, super.anInt813 - 357, this.aClass24_1, -1, 0, super.anInt812 - 17);
					}
					local369 = this.anInt879 - this.aClass24_1.anInt451 - 77;
					if (local369 < 0) {
						local369 = 0;
					}
					if (local369 > this.anInt879 - 77) {
						local369 = this.anInt879 - 77;
					}
					if (this.anInt836 != local369) {
						this.anInt836 = local369;
						this.aBoolean206 = true;
					}
					anInt928++;
					if (anInt928 > 156) {
						anInt928 = 0;
						this.aClass8_Sub1_Sub3_6.method395(80);
						this.aClass8_Sub1_Sub3_6.method396(96);
					}
				}
				if (this.anInt833 == -1 && this.anInt985 == 3) {
					local369 = this.anInt1017 * 14 + 7;
					this.aClass24_1.anInt451 = this.anInt1018;
					if (super.anInt812 > 448 && super.anInt812 < 560 && super.anInt813 > 332) {
						this.method620(77, 463, local369, super.anInt813 - 357, this.aClass24_1, -1, 0, super.anInt812 - 17);
					}
					@Pc(466) int local466 = this.aClass24_1.anInt451;
					if (local466 < 0) {
						local466 = 0;
					}
					if (local466 > local369 - 77) {
						local466 = local369 - 77;
					}
					if (this.anInt1018 != local466) {
						this.anInt1018 = local466;
						this.aBoolean206 = true;
					}
				}
				if (this.anInt833 != -1) {
					local284 = this.method615(this.anInt833, (byte) 4, this.anInt871);
					if (local284) {
						this.aBoolean206 = true;
					}
				}
				if (this.anInt1053 == 3) {
					this.aBoolean206 = true;
				}
				if (this.anInt957 == 3) {
					this.aBoolean206 = true;
				}
				if (this.aString21 != null) {
					this.aBoolean206 = true;
				}
				if (this.aBoolean216 && this.anInt1020 == 2) {
					this.aBoolean206 = true;
				}
				if (this.aBoolean206) {
					this.method696();
					this.aBoolean206 = false;
				}
				if (this.anInt825 == 2) {
					this.method604();
					this.aClass40_25.method497(4, 550, super.aGraphics2);
				}
				if (this.anInt864 != -1) {
					this.aBoolean231 = true;
				}
				if (this.aBoolean231) {
					if (this.anInt864 != -1 && this.anInt864 == this.anInt966) {
						this.anInt864 = -1;
						this.aClass8_Sub1_Sub3_6.method395(255);
						this.aClass8_Sub1_Sub3_6.method396(this.anInt966);
					}
					this.aBoolean231 = false;
					this.aClass40_14.method496();
					this.aClass8_Sub1_Sub2_Sub3_10.method494(0, 0);
					if (this.anInt843 == -1) {
						if (this.anIntArray275[this.anInt966] != -1) {
							if (this.anInt966 == 0) {
								this.aClass8_Sub1_Sub2_Sub3_16.method494(22, 10);
							}
							if (this.anInt966 == 1) {
								this.aClass8_Sub1_Sub2_Sub3_17.method494(54, 8);
							}
							if (this.anInt966 == 2) {
								this.aClass8_Sub1_Sub2_Sub3_17.method494(82, 8);
							}
							if (this.anInt966 == 3) {
								this.aClass8_Sub1_Sub2_Sub3_18.method494(110, 8);
							}
							if (this.anInt966 == 4) {
								this.aClass8_Sub1_Sub2_Sub3_20.method494(153, 8);
							}
							if (this.anInt966 == 5) {
								this.aClass8_Sub1_Sub2_Sub3_20.method494(181, 8);
							}
							if (this.anInt966 == 6) {
								this.aClass8_Sub1_Sub2_Sub3_19.method494(209, 9);
							}
						}
						if (this.anIntArray275[0] != -1 && (this.anInt864 != 0 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[0].method494(29, 13);
						}
						if (this.anIntArray275[1] != -1 && (this.anInt864 != 1 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[1].method494(53, 11);
						}
						if (this.anIntArray275[2] != -1 && (this.anInt864 != 2 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[2].method494(82, 11);
						}
						if (this.anIntArray275[3] != -1 && (this.anInt864 != 3 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[3].method494(115, 12);
						}
						if (this.anIntArray275[4] != -1 && (this.anInt864 != 4 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[4].method494(153, 13);
						}
						if (this.anIntArray275[5] != -1 && (this.anInt864 != 5 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[5].method494(180, 11);
						}
						if (this.anIntArray275[6] != -1 && (this.anInt864 != 6 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[6].method494(208, 13);
						}
					}
					this.aClass40_14.method497(160, 516, super.aGraphics2);
					anInt885++;
					if (anInt885 > 61) {
						anInt885 = 0;
						this.aClass8_Sub1_Sub3_6.method395(1);
					}
					this.aClass40_13.method496();
					this.aClass8_Sub1_Sub2_Sub3_9.method494(0, 0);
					if (this.anInt843 == -1) {
						if (this.anIntArray275[this.anInt966] != -1) {
							if (this.anInt966 == 7) {
								this.aClass8_Sub1_Sub2_Sub3_11.method494(42, 0);
							}
							if (this.anInt966 == 8) {
								this.aClass8_Sub1_Sub2_Sub3_12.method494(74, 0);
							}
							if (this.anInt966 == 9) {
								this.aClass8_Sub1_Sub2_Sub3_12.method494(102, 0);
							}
							if (this.anInt966 == 10) {
								this.aClass8_Sub1_Sub2_Sub3_13.method494(130, 1);
							}
							if (this.anInt966 == 11) {
								this.aClass8_Sub1_Sub2_Sub3_15.method494(173, 0);
							}
							if (this.anInt966 == 12) {
								this.aClass8_Sub1_Sub2_Sub3_15.method494(201, 0);
							}
							if (this.anInt966 == 13) {
								this.aClass8_Sub1_Sub2_Sub3_14.method494(229, 0);
							}
						}
						if (this.anIntArray275[8] != -1 && (this.anInt864 != 8 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[7].method494(74, 2);
						}
						if (this.anIntArray275[9] != -1 && (this.anInt864 != 9 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[8].method494(102, 3);
						}
						if (this.anIntArray275[10] != -1 && (this.anInt864 != 10 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[9].method494(137, 4);
						}
						if (this.anIntArray275[11] != -1 && (this.anInt864 != 11 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[10].method494(174, 2);
						}
						if (this.anIntArray275[12] != -1 && (this.anInt864 != 12 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[11].method494(201, 2);
						}
						if (this.anIntArray275[13] != -1 && (this.anInt864 != 13 || anInt917 % 20 < 10)) {
							this.aClass8_Sub1_Sub2_Sub3Array5[12].method494(226, 2);
						}
					}
					this.aClass40_13.method497(466, 496, super.aGraphics2);
					this.aClass40_26.method496();
					Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
				}
				if (this.aBoolean224) {
					this.aBoolean224 = false;
					this.aClass40_12.method496();
					this.aClass8_Sub1_Sub2_Sub3_8.method494(0, 0);
					this.aClass8_Sub1_Sub2_Sub4_3.method562(28, 55, true, "Public chat", 16777215);
					if (this.anInt934 == 0) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 55, true, "On", 65280);
					}
					if (this.anInt934 == 1) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 55, true, "Friends", 16776960);
					}
					if (this.anInt934 == 2) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 55, true, "Off", 16711680);
					}
					if (this.anInt934 == 3) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 55, true, "Hide", 65535);
					}
					this.aClass8_Sub1_Sub2_Sub4_3.method562(28, 184, true, "Private chat", 16777215);
					if (this.anInt965 == 0) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 184, true, "On", 65280);
					}
					if (this.anInt965 == 1) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 184, true, "Friends", 16776960);
					}
					if (this.anInt965 == 2) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 184, true, "Off", 16711680);
					}
					this.aClass8_Sub1_Sub2_Sub4_3.method562(28, 324, true, "Trade/compete", 16777215);
					if (this.anInt898 == 0) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 324, true, "On", 65280);
					}
					if (this.anInt898 == 1) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 324, true, "Friends", 16776960);
					}
					if (this.anInt898 == 2) {
						this.aClass8_Sub1_Sub2_Sub4_3.method562(41, 324, true, "Off", 16711680);
					}
					this.aClass8_Sub1_Sub2_Sub4_3.method562(33, 458, true, "Report abuse", 16777215);
					this.aClass40_12.method497(453, 0, super.aGraphics2);
					this.aClass40_26.method496();
					Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
				}
				this.anInt871 = 0;
			} else {
				if (this.anInt825 == 2) {
					this.method615(this.anInt947, (byte) 4, this.anInt871);
					if (this.anInt1012 != -1) {
						this.method615(this.anInt1012, (byte) 4, this.anInt871);
					}
					this.anInt871 = 0;
					this.method655();
					super.aClass40_2.method496();
					Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray256;
					Class8_Sub1_Sub2.method551();
					this.aBoolean212 = true;
					@Pc(63) Class24 local63 = Class24.method259(this.anInt947);
					if (local63.anInt453 == 512 && local63.anInt440 == 334 && local63.anInt425 == 0) {
						local63.anInt453 = 765;
						local63.anInt440 = 503;
					}
					this.method647(127, 0, 0, 0, local63);
					if (this.anInt1012 != -1) {
						local63 = Class24.method259(this.anInt1012);
						if (local63.anInt453 == 512 && local63.anInt440 == 334 && local63.anInt425 == 0) {
							local63.anInt453 = 765;
							local63.anInt440 = 503;
						}
						this.method647(127, 0, 0, 0, local63);
					}
					if (this.aBoolean216) {
						this.method630();
					} else {
						this.method711();
						this.method707(588);
					}
				}
				super.aClass40_2.method497(0, 0, super.aGraphics2);
			}
		} catch (@Pc(1310) RuntimeException local1310) {
			signlink.reporterror("53743, " + -50 + ", " + local1310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method685(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) int[] local10 = this.aClass8_Sub1_Sub2_Sub2_10.anIntArray174;
			@Pc(13) int local13 = local10.length;
			for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
				local10[local15] = 0;
			}
			@Pc(39) int local39;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 1; local27 < 103; local27++) {
				local39 = (103 - local27) * 512 * 4 + 24628;
				for (local41 = 1; local41 < 103; local41++) {
					if ((this.aByteArrayArrayArray8[arg0][local41][local27] & 0x18) == 0) {
						this.aClass21_1.method213(local10, local39, arg0, local41, local27);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local41][local27] & 0x8) != 0) {
						this.aClass21_1.method213(local10, local39, arg0 + 1, local41, local27);
					}
					local39 += 4;
				}
			}
			local39 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass8_Sub1_Sub2_Sub2_10.method379((byte) 3);
			@Pc(151) int local151;
			for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
				for (local151 = 1; local151 < 103; local151++) {
					if ((this.aByteArrayArrayArray8[arg0][local151][local147] & 0x18) == 0) {
						this.method632(local39, local151, local147, arg0, local41);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local151][local147] & 0x8) != 0) {
						this.method632(local39, local151, local147, arg0 + 1, local41);
					}
				}
			}
			if (this.aClass40_26 != null) {
				this.aClass40_26.method496();
				Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
			}
			anInt876++;
			if (anInt876 > 1530) {
				anInt876 = 0;
				this.aClass8_Sub1_Sub3_6.method395(221);
				this.aClass8_Sub1_Sub3_6.method396(0);
				local151 = this.aClass8_Sub1_Sub3_6.anInt620;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass8_Sub1_Sub3_6.method396(208);
				}
				this.aClass8_Sub1_Sub3_6.method397(61880);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass8_Sub1_Sub3_6.method397(9307);
				}
				this.aClass8_Sub1_Sub3_6.method397((int) (Math.random() * 65536.0D));
				this.aClass8_Sub1_Sub3_6.method397((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass8_Sub1_Sub3_6.method396(227);
				}
				this.aClass8_Sub1_Sub3_6.method397((int) (Math.random() * 65536.0D));
				this.aClass8_Sub1_Sub3_6.method397(6023);
				this.aClass8_Sub1_Sub3_6.method396(127);
				this.aClass8_Sub1_Sub3_6.method397(54661);
				this.aClass8_Sub1_Sub3_6.method405(this.aClass8_Sub1_Sub3_6.anInt620 - local151, this.aByte36);
			}
			this.anInt996 = 0;
			for (local151 = 0; local151 < 104; local151++) {
				for (@Pc(321) int local321 = 0; local321 < 104; local321++) {
					@Pc(331) int local331 = this.aClass21_1.method207(this.anInt891, local151, local321);
					if (local331 != 0) {
						local331 = local331 >> 14 & 0x7FFF;
						@Pc(343) int local343 = Class42.method512(local331).anInt704;
						if (local343 >= 0) {
							@Pc(347) int local347 = local151;
							@Pc(349) int local349 = local321;
							if (local343 != 22 && local343 != 29 && local343 != 34 && local343 != 36 && local343 != 46 && local343 != 47 && local343 != 48) {
								@Pc(381) int[][] local381 = this.aClass38Array1[this.anInt891].anIntArrayArray20;
								for (@Pc(383) int local383 = 0; local383 < 10; local383++) {
									@Pc(390) int local390 = (int) (Math.random() * 4.0D);
									if (local390 == 0 && local347 > 0 && local347 > local151 - 3 && (local381[local347 - 1][local349] & 0x1280108) == 0) {
										local347--;
									}
									if (local390 == 1 && local347 < 103 && local347 < local151 + 3 && (local381[local347 + 1][local349] & 0x1280180) == 0) {
										local347++;
									}
									if (local390 == 2 && local349 > 0 && local349 > local321 - 3 && (local381[local347][local349 - 1] & 0x1280102) == 0) {
										local349--;
									}
									if (local390 == 3 && local349 < 103 && local349 < local321 + 3 && (local381[local347][local349 + 1] & 0x1280120) == 0) {
										local349++;
									}
								}
							}
							this.aClass8_Sub1_Sub2_Sub2Array5[this.anInt996] = this.aClass8_Sub1_Sub2_Sub2Array10[local343];
							this.anIntArray257[this.anInt996] = local347;
							this.anIntArray258[this.anInt996] = local349;
							this.anInt996++;
						}
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("29974, " + arg0 + ", " + 2 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;BILjava/lang/String;)Lclient!SXKKBWPU;")
	private Class35 method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass39Array1[0] != null) {
					local3 = this.aClass39Array1[0].method465(arg0);
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
				return new Class35(local3, 7);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method588(arg3, "Requesting " + arg4);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method724(arg2 + arg1);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class8_Sub1_Sub3 local95 = new Class8_Sub1_Sub3(local84, -631);
					local95.anInt620 = 3;
					@Pc(103) int local103 = local95.method410() + 6;
					@Pc(105) int local105 = 6;
					local3 = new byte[local103];
					for (@Pc(110) int local110 = 0; local110 < 6; local110++) {
						local3[local110] = local84[local110];
					}
					@Pc(128) int local128;
					while (local105 < local103) {
						local128 = local103 - local105;
						if (local128 > 1000) {
							local128 = 1000;
						}
						@Pc(139) int local139 = local81.read(local3, local105, local128);
						if (local139 < 0) {
							(new StringBuffer("Length error: ")).append(local105).append("/").append(local103).toString();
							throw new IOException("EOF");
						}
						local105 += local139;
						@Pc(168) int local168 = local105 * 100 / local103;
						if (local168 != local70) {
							this.method588(arg3, "Loading " + arg4 + " - " + local168 + "%");
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass39Array1[0] != null) {
							this.aClass39Array1[0].method466(local3.length, local3, arg0);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass39Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local128 = (int) this.aCRC32_2.getValue();
						if (local128 != arg1) {
							local3 = null;
							local34++;
							local55 = "Checksum error: " + local128;
						}
					}
				} catch (@Pc(248) IOException local248) {
					if (local55.equals("Unknown error")) {
						local55 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(258) NullPointerException local258) {
					local55 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(267) ArrayIndexOutOfBoundsException local267) {
					local55 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(276) Exception local276) {
					local55 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local70 = local5; local70 > 0; local70--) {
						if (local34 >= 3) {
							this.method588(arg3, "Game updated - please reload page");
							local70 = 10;
						} else {
							this.method588(arg3, local55 + " - Retrying in " + local70);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(320) Exception local320) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean242 = !this.aBoolean242;
				}
			}
			return new Class35(local3, 7);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("57679, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 49 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!YANZSPIT;IZI)V")
	private void method687(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt994 < 400) {
				if (arg1.anIntArray194 != null) {
					arg1 = arg1.method525(this.anInt1057);
				}
				if (arg1 != null && arg1.aBoolean181) {
					@Pc(29) String local29 = arg1.aString15;
					if (arg1.anInt711 != 0) {
						local29 = local29 + method657(arg1.anInt711, aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt143) + " (level-" + arg1.anInt711 + ")";
					}
					if (this.anInt978 == 1) {
						this.aStringArray13[this.anInt994] = "Use " + this.aString24 + " with @yel@" + local29;
						this.anIntArray270[this.anInt994] = 776;
						this.anIntArray271[this.anInt994] = arg0;
						this.anIntArray268[this.anInt994] = arg2;
						this.anIntArray269[this.anInt994] = arg3;
						this.anInt994++;
					} else if (this.anInt982 != 1) {
						@Pc(167) int local167;
						if (arg1.aStringArray5 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray5[local167] != null && !arg1.aStringArray5[local167].equalsIgnoreCase("attack")) {
									this.aStringArray13[this.anInt994] = arg1.aStringArray5[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray270[this.anInt994] = 184;
									}
									if (local167 == 1) {
										this.anIntArray270[this.anInt994] = 49;
									}
									if (local167 == 2) {
										this.anIntArray270[this.anInt994] = 356;
									}
									if (local167 == 3) {
										this.anIntArray270[this.anInt994] = 80;
									}
									if (local167 == 4) {
										this.anIntArray270[this.anInt994] = 113;
									}
									this.anIntArray271[this.anInt994] = arg0;
									this.anIntArray268[this.anInt994] = arg2;
									this.anIntArray269[this.anInt994] = arg3;
									this.anInt994++;
								}
							}
						}
						if (arg1.aStringArray5 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray5[local167] != null && arg1.aStringArray5[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg1.anInt711 > aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt143) {
										local291 = 2000;
									}
									this.aStringArray13[this.anInt994] = arg1.aStringArray5[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray270[this.anInt994] = local291 + 184;
									}
									if (local167 == 1) {
										this.anIntArray270[this.anInt994] = local291 + 49;
									}
									if (local167 == 2) {
										this.anIntArray270[this.anInt994] = local291 + 356;
									}
									if (local167 == 3) {
										this.anIntArray270[this.anInt994] = local291 + 80;
									}
									if (local167 == 4) {
										this.anIntArray270[this.anInt994] = local291 + 113;
									}
									this.anIntArray271[this.anInt994] = arg0;
									this.anIntArray268[this.anInt994] = arg2;
									this.anIntArray269[this.anInt994] = arg3;
									this.anInt994++;
								}
							}
						}
						this.aStringArray13[this.anInt994] = "Examine @yel@" + local29;
						this.anIntArray270[this.anInt994] = 1827;
						this.anIntArray271[this.anInt994] = arg0;
						this.anIntArray268[this.anInt994] = arg2;
						this.anIntArray269[this.anInt994] = arg3;
						this.anInt994++;
					} else if ((this.anInt984 & 0x2) == 2) {
						this.aStringArray13[this.anInt994] = this.aString25 + " @yel@" + local29;
						this.anIntArray270[this.anInt994] = 719;
						this.anIntArray271[this.anInt994] = arg0;
						this.anIntArray268[this.anInt994] = arg2;
						this.anIntArray269[this.anInt994] = arg3;
						this.anInt994++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("97100, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method583(@OriginalArg(0) byte arg0) {
		try {
			this.aByteArray21 = null;
			this.aClass8_Sub1_Sub2_Sub3Array2 = null;
			this.aClass8_Sub1_Sub2_Sub2Array10 = null;
			this.anIntArray268 = null;
			this.anIntArray269 = null;
			this.anIntArray270 = null;
			this.anIntArray271 = null;
			this.aStringArray13 = null;
			this.anIntArray245 = null;
			this.method593();
			if (this.aClass44_1 != null) {
				this.aClass44_1.aBoolean177 = false;
			}
			this.aClass44_1 = null;
			this.anIntArray257 = null;
			this.anIntArray258 = null;
			this.aClass8_Sub1_Sub2_Sub2Array5 = null;
			this.aClass7_12 = null;
			this.aClass7_10 = null;
			this.aStringArray10 = null;
			this.aLongArray3 = null;
			this.anIntArray216 = null;
			this.anIntArrayArray25 = null;
			this.anIntArray234 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray235 = null;
			this.anIntArray236 = null;
			this.aClass8_Sub1_Sub2_Sub3_16 = null;
			this.aClass8_Sub1_Sub2_Sub3_17 = null;
			this.aClass8_Sub1_Sub2_Sub3_18 = null;
			this.aClass8_Sub1_Sub2_Sub3_19 = null;
			this.aClass8_Sub1_Sub2_Sub3_20 = null;
			if (this.aClass1_Sub1_1 != null) {
				this.aClass1_Sub1_1.method93();
			}
			this.aClass1_Sub1_1 = null;
			this.aClass40_15 = null;
			this.aClass40_16 = null;
			this.aClass40_17 = null;
			this.aClass40_18 = null;
			this.aClass7ArrayArrayArray1 = null;
			this.aClass7_11 = null;
			this.aClass40_6 = null;
			this.aClass40_7 = null;
			this.aClass40_3 = null;
			this.aClass40_4 = null;
			this.aClass40_5 = null;
			this.aClass8_Sub1_Sub2_Sub2_5 = null;
			this.aClass8_Sub1_Sub2_Sub2_6 = null;
			this.aClass8_Sub1_Sub2_Sub2_7 = null;
			this.aClass8_Sub1_Sub2_Sub2_8 = null;
			this.aClass8_Sub1_Sub2_Sub2_9 = null;
			this.aClass8_Sub1_Sub2_Sub3_8 = null;
			this.aClass8_Sub1_Sub2_Sub3_9 = null;
			this.aClass8_Sub1_Sub2_Sub3_10 = null;
			this.aClass8_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.aClass8_Sub1_Sub3Array1 = null;
			this.anIntArray241 = null;
			this.aClass40_8 = null;
			this.aClass40_9 = null;
			this.aClass40_10 = null;
			this.aClass40_11 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass21_1 = null;
			this.aClass38Array1 = null;
			this.aClass40_24 = null;
			this.aClass40_25 = null;
			this.aClass40_26 = null;
			this.aClass40_27 = null;
			try {
				if (this.aClass19_1 != null) {
					this.aClass19_1.method163();
				}
			} catch (@Pc(221) Exception local221) {
			}
			this.aClass19_1 = null;
			this.aClass8_Sub1_Sub3_6 = null;
			this.aClass8_Sub1_Sub3_7 = null;
			this.aClass8_Sub1_Sub3_9 = null;
			this.aClass8_Sub1_Sub3_8 = null;
			this.aClass8_Sub1_Sub2_Sub2_15 = null;
			this.aClass8_Sub1_Sub2_Sub2_11 = null;
			this.aClass8_Sub1_Sub2_Sub2Array9 = null;
			this.aClass8_Sub1_Sub2_Sub2Array6 = null;
			this.aClass8_Sub1_Sub2_Sub2Array8 = null;
			this.aClass8_Sub1_Sub2_Sub2Array4 = null;
			this.aClass8_Sub1_Sub2_Sub2Array7 = null;
			this.aClass40_19 = null;
			this.aClass40_20 = null;
			this.aClass40_21 = null;
			this.aClass40_22 = null;
			this.aClass40_23 = null;
			this.aClass8_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray215 = null;
			this.aClass8_Sub1_Sub2_Sub3Array5 = null;
			this.aClass8_Sub1_Sub2_Sub3_11 = null;
			this.aClass8_Sub1_Sub2_Sub3_12 = null;
			this.aClass8_Sub1_Sub2_Sub3_13 = null;
			this.aClass8_Sub1_Sub2_Sub3_14 = null;
			this.aClass8_Sub1_Sub2_Sub3_15 = null;
			this.anIntArrayArray23 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray218 = null;
			this.anIntArray219 = null;
			this.aClass40_12 = null;
			this.aClass40_13 = null;
			this.aClass40_14 = null;
			this.aClass8_Sub1_Sub2_Sub2_10 = null;
			this.aClass8_Sub1_Sub2_Sub3_3 = null;
			this.aClass8_Sub1_Sub2_Sub3_4 = null;
			this.aClass8_Sub1_Sub2_Sub3_5 = null;
			this.method648();
			Class42.method517();
			Class45.method519();
			Class46.method534();
			Class24.method262();
			Class17.aClass17Array1 = null;
			Class9.aClass9Array1 = null;
			Class11.aClass11Array1 = null;
			Class20.aClass20Array1 = null;
			Class32.aClass32Array1 = null;
			Class32.aClass15_4 = null;
			Class23.aClass23Array1 = null;
			super.aClass40_2 = null;
			Class8_Sub1_Sub1_Sub1_Sub1.aClass15_1 = null;
			Class8_Sub1_Sub2_Sub1.method346();
			Class21.method177();
			Class8_Sub1_Sub1_Sub3.method132();
			@Pc(370) boolean local370 = false;
			Class34.method329();
			System.gc();
		} catch (@Pc(382) RuntimeException local382) {
			signlink.reporterror("48670, " + arg0 + ", " + local382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
	private void method688(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt1055 != -1) {
				this.aString21 = arg1;
				super.anInt817 = 0;
			}
			if (this.anInt833 == -1) {
				this.aBoolean206 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray247[local20] = this.anIntArray247[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
			}
			this.anIntArray247[0] = arg2;
			this.aStringArray11[0] = arg0;
			this.aStringArray12[0] = arg1;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("82312, " + arg0 + ", " + arg1 + ", " + -30 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OMJBPTVL;B)I")
	private int method690(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1) {
		try {
			if (arg1.anIntArrayArray12 == null || arg0 >= arg1.anIntArrayArray12.length) {
				return -2;
			}
			try {
				@Pc(26) int[] local26 = arg1.anIntArrayArray12[arg0];
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
						local39 = this.anIntArray259[local26[local30++]];
					}
					if (local37 == 2) {
						local39 = this.anIntArray237[local26[local30++]];
					}
					if (local37 == 3) {
						local39 = this.anIntArray244[local26[local30++]];
					}
					@Pc(87) Class24 local87;
					@Pc(92) int local92;
					@Pc(105) int local105;
					if (local37 == 4) {
						local87 = Class24.method259(local26[local30++]);
						local92 = local26[local30++];
						if (local92 >= 0 && local92 < Class46.anInt746 && (!Class46.method532(local92).aBoolean183 || aBoolean235)) {
							for (local105 = 0; local105 < local87.anIntArray137.length; local105++) {
								if (local87.anIntArray137[local105] == local92 + 1) {
									local39 += local87.anIntArray142[local105];
								}
							}
						}
					}
					if (local37 == 5) {
						local39 = this.anIntArray245[local26[local30++]];
					}
					if (local37 == 6) {
						local39 = anIntArray233[this.anIntArray237[local26[local30++]] - 1];
					}
					if (local37 == 7) {
						local39 = this.anIntArray245[local26[local30++]] * 100 / 46875;
					}
					if (local37 == 8) {
						local39 = aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt143;
					}
					@Pc(180) int local180;
					if (local37 == 9) {
						for (local180 = 0; local180 < Class10.anInt162; local180++) {
							if (Class10.aBooleanArray3[local180]) {
								local39 += this.anIntArray237[local180];
							}
						}
					}
					if (local37 == 10) {
						local87 = Class24.method259(local26[local30++]);
						local92 = local26[local30++] + 1;
						if (local92 >= 0 && local92 < Class46.anInt746 && (!Class46.method532(local92).aBoolean183 || aBoolean235)) {
							for (local105 = 0; local105 < local87.anIntArray137.length; local105++) {
								if (local87.anIntArray137[local105] == local92) {
									local39 = 999999999;
									break;
								}
							}
						}
					}
					if (local37 == 11) {
						local39 = this.anInt1045;
					}
					if (local37 == 12) {
						local39 = this.anInt854;
					}
					if (local37 == 13) {
						local180 = this.anIntArray245[local26[local30++]];
						local92 = local26[local30++];
						local39 = (local180 & 0x1 << local92) == 0 ? 0 : 1;
					}
					if (local37 == 14) {
						local180 = local26[local30++];
						@Pc(294) Class5 local294 = Class5.aClass5Array1[local180];
						local105 = local294.anInt30;
						@Pc(300) int local300 = local294.anInt31;
						@Pc(303) int local303 = local294.anInt32;
						@Pc(309) int local309 = anIntArray240[local303 - local300];
						local39 = this.anIntArray245[local105] >> local300 & local309;
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
						local39 = (aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 >> 7) + this.anInt1001;
					}
					if (local37 == 19) {
						local39 = (aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 >> 7) + this.anInt1002;
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
			signlink.reporterror("25947, " + arg0 + ", " + arg1 + ", " + -76 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method691() {
		try {
			if (this.anInt946 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt907 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray12[local12] != null) {
						@Pc(24) int local24 = this.anIntArray247[local12];
						@Pc(29) String local29 = this.aStringArray11[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt965 == 0 || this.anInt965 == 1 && this.method623(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt812 > 4 && super.anInt813 - 4 > local82 - 10 && super.anInt813 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass8_Sub1_Sub2_Sub4_3.method563("From:  " + local29 + this.aStringArray12[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt812 < local121 + 4) {
									if (this.anInt926 >= 1) {
										this.aStringArray13[this.anInt994] = "Report abuse @whi@" + local29;
										this.anIntArray270[this.anInt994] = 2550;
										this.anInt994++;
									}
									this.aStringArray13[this.anInt994] = "Add ignore @whi@" + local29;
									this.anIntArray270[this.anInt994] = 2955;
									this.anInt994++;
									this.aStringArray13[this.anInt994] = "Add friend @whi@" + local29;
									this.anIntArray270[this.anInt994] = 2646;
									this.anInt994++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt965 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("27480, " + 3 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean230 || this.aBoolean239 || this.aBoolean210) {
				this.method609((byte) 8);
			} else {
				anInt868++;
				if (this.aBoolean218) {
					this.method684();
				} else {
					this.method629(false);
				}
				this.anInt938 = 0;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("29299, " + 71 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method692(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class23.aClass23Array1[arg0].anInt393;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray245[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class8_Sub1_Sub2_Sub1.method355(0.9D);
					}
					if (local12 == 2) {
						Class8_Sub1_Sub2_Sub1.method355(0.8D);
					}
					if (local12 == 3) {
						Class8_Sub1_Sub2_Sub1.method355(0.7D);
					}
					if (local12 == 4) {
						Class8_Sub1_Sub2_Sub1.method355(0.6D);
					}
					Class46.aClass15_9.method118();
					this.aBoolean212 = true;
				}
				if (local4 == 3) {
					@Pc(55) boolean local55 = this.aBoolean203;
					if (local12 == 0) {
						this.method664(this.aBoolean203, 0);
						this.aBoolean203 = true;
					}
					if (local12 == 1) {
						this.method664(this.aBoolean203, -400);
						this.aBoolean203 = true;
					}
					if (local12 == 2) {
						this.method664(this.aBoolean203, -800);
						this.aBoolean203 = true;
					}
					if (local12 == 3) {
						this.method664(this.aBoolean203, -1200);
						this.aBoolean203 = true;
					}
					if (local12 == 4) {
						this.aBoolean203 = false;
					}
					if (this.aBoolean203 != local55 && !aBoolean236) {
						if (this.aBoolean203) {
							this.anInt846 = this.anInt867;
							this.aBoolean204 = true;
							this.aClass1_Sub1_1.method104(2, this.anInt846);
						} else {
							this.method593();
						}
						this.anInt915 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean233 = true;
						this.method600(0);
					}
					if (local12 == 1) {
						this.aBoolean233 = true;
						this.method600(-400);
					}
					if (local12 == 2) {
						this.aBoolean233 = true;
						this.method600(-800);
					}
					if (local12 == 3) {
						this.aBoolean233 = true;
						this.method600(-1200);
					}
					if (local12 == 4) {
						this.aBoolean233 = false;
					}
				}
				if (local4 == 5) {
					this.anInt823 = local12;
				}
				if (local4 == 6) {
					this.anInt933 = local12;
				}
				if (local4 == 8) {
					this.anInt946 = local12;
					this.aBoolean206 = true;
				}
				if (local4 == 9) {
					this.anInt1019 = local12;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("46443, " + arg0 + ", " + true + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VCTXURSE;I)V")
	private void method693(@OriginalArg(0) Class8_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray238.length; local5++) {
				this.anIntArray238[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray238[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray239[local60] = (this.anIntArray238[local60 - 1] + this.anIntArray238[local60 + 1] + this.anIntArray238[local60 - 128] + this.anIntArray238[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray238;
				this.anIntArray238 = this.anIntArray239;
				this.anIntArray239 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt667; local52++) {
					for (local60 = 0; local60 < arg0.anInt666; local60++) {
						if (arg0.aByteArray15[local48++] != 0) {
							@Pc(147) int local147 = local60 + arg0.anInt668 + 16;
							@Pc(154) int local154 = local52 + arg0.anInt669 + 16;
							@Pc(160) int local160 = local147 + (local154 << 7);
							this.anIntArray238[local160] = 0;
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("38988, " + arg0 + ", " + 48162 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method694(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt900 += 0;
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("29609, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method695(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt978 == 0 && this.anInt982 == 0) {
				this.aStringArray13[this.anInt994] = "Walk here";
				this.anIntArray270[this.anInt994] = 134;
				this.anIntArray268[this.anInt994] = super.anInt812;
				this.anIntArray269[this.anInt994] = super.anInt813;
				this.anInt994++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class8_Sub1_Sub1_Sub3.anInt302; local43++) {
				@Pc(49) int local49 = Class8_Sub1_Sub1_Sub3.anIntArray105[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass21_1.method208(this.anInt891, local53, local59, local49) >= 0) {
						@Pc(91) Class42 local91 = Class42.method512(local71);
						if (local91.anIntArray182 != null) {
							local91 = local91.method514((byte) 2);
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt978 == 1) {
							this.aStringArray13[this.anInt994] = "Use " + this.aString24 + " with @cya@" + local91.aString14;
							this.anIntArray270[this.anInt994] = 413;
							this.anIntArray271[this.anInt994] = local49;
							this.anIntArray268[this.anInt994] = local53;
							this.anIntArray269[this.anInt994] = local59;
							this.anInt994++;
						} else if (this.anInt982 != 1) {
							if (local91.aStringArray4 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray4[local218] != null) {
										this.aStringArray13[this.anInt994] = local91.aStringArray4[local218] + " @cya@" + local91.aString14;
										if (local218 == 0) {
											this.anIntArray270[this.anInt994] = 286;
										}
										if (local218 == 1) {
											this.anIntArray270[this.anInt994] = 88;
										}
										if (local218 == 2) {
											this.anIntArray270[this.anInt994] = 377;
										}
										if (local218 == 3) {
											this.anIntArray270[this.anInt994] = 383;
										}
										if (local218 == 4) {
											this.anIntArray270[this.anInt994] = 1536;
										}
										this.anIntArray271[this.anInt994] = local49;
										this.anIntArray268[this.anInt994] = local53;
										this.anIntArray269[this.anInt994] = local59;
										this.anInt994++;
									}
								}
							}
							this.aStringArray13[this.anInt994] = "Examine @cya@" + local91.aString14;
							this.anIntArray270[this.anInt994] = 1273;
							this.anIntArray271[this.anInt994] = local91.anInt694 << 14;
							this.anIntArray268[this.anInt994] = local53;
							this.anIntArray269[this.anInt994] = local59;
							this.anInt994++;
						} else if ((this.anInt984 & 0x4) == 4) {
							this.aStringArray13[this.anInt994] = this.aString25 + " @cya@" + local91.aString14;
							this.anIntArray270[this.anInt994] = 382;
							this.anIntArray271[this.anInt994] = local49;
							this.anIntArray268[this.anInt994] = local53;
							this.anIntArray269[this.anInt994] = local59;
							this.anInt994++;
						}
					}
					@Pc(398) Class8_Sub1_Sub1_Sub1_Sub2 local398;
					@Pc(446) Class8_Sub1_Sub1_Sub1_Sub1 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class8_Sub1_Sub1_Sub1_Sub2 local369 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if (local369.aClass45_2.aByte21 == 1 && (local369.anInt230 & 0x7F) == 64 && (local369.anInt231 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt840; local218++) {
								local398 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray215[local218]];
								if (local398 != null && local398 != local369 && local398.aClass45_2.aByte21 == 1 && local398.anInt230 == local369.anInt230 && local398.anInt231 == local369.anInt231) {
									this.method687(this.anIntArray215[local218], local398.aClass45_2, local53, local59);
								}
							}
							for (local436 = 0; local436 < this.anInt975; local436++) {
								local446 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray249[local436]];
								if (local446 != null && local446.anInt230 == local369.anInt230 && local446.anInt231 == local369.anInt231) {
									this.method591(local446, this.anIntArray249[local436], local53, local59);
								}
							}
						}
						this.method687(local71, local369.aClass45_2, local53, local59);
					}
					if (local65 == 0) {
						@Pc(488) Class8_Sub1_Sub1_Sub1_Sub1 local488 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if ((local488.anInt230 & 0x7F) == 64 && (local488.anInt231 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt840; local218++) {
								local398 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray215[local218]];
								if (local398 != null && local398.aClass45_2.aByte21 == 1 && local398.anInt230 == local488.anInt230 && local398.anInt231 == local488.anInt231) {
									this.method687(this.anIntArray215[local218], local398.aClass45_2, local53, local59);
								}
							}
							for (local436 = 0; local436 < this.anInt975; local436++) {
								local446 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray249[local436]];
								if (local446 != null && local446 != local488 && local446.anInt230 == local488.anInt230 && local446.anInt231 == local488.anInt231) {
									this.method591(local446, this.anIntArray249[local436], local53, local59);
								}
							}
						}
						this.method591(local488, local71, local53, local59);
					}
					if (local65 == 3) {
						@Pc(607) Class7 local607 = this.aClass7ArrayArrayArray1[this.anInt891][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class8_Sub1_Sub1_Sub2 local614 = (Class8_Sub1_Sub1_Sub2) local607.method33(); local614 != null; local614 = (Class8_Sub1_Sub1_Sub2) local607.method35()) {
								@Pc(620) Class46 local620 = Class46.method532(local614.anInt183);
								if (this.anInt978 == 1) {
									this.aStringArray13[this.anInt994] = "Use " + this.aString24 + " with @lre@" + local620.aString16;
									this.anIntArray270[this.anInt994] = 380;
									this.anIntArray271[this.anInt994] = local614.anInt183;
									this.anIntArray268[this.anInt994] = local53;
									this.anIntArray269[this.anInt994] = local59;
									this.anInt994++;
								} else if (this.anInt982 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray7 != null && local620.aStringArray7[local737] != null) {
											this.aStringArray13[this.anInt994] = local620.aStringArray7[local737] + " @lre@" + local620.aString16;
											if (local737 == 0) {
												this.anIntArray270[this.anInt994] = 409;
											}
											if (local737 == 1) {
												this.anIntArray270[this.anInt994] = 4;
											}
											if (local737 == 2) {
												this.anIntArray270[this.anInt994] = 856;
											}
											if (local737 == 3) {
												this.anIntArray270[this.anInt994] = 145;
											}
											if (local737 == 4) {
												this.anIntArray270[this.anInt994] = 756;
											}
											this.anIntArray271[this.anInt994] = local614.anInt183;
											this.anIntArray268[this.anInt994] = local53;
											this.anIntArray269[this.anInt994] = local59;
											this.anInt994++;
										} else if (local737 == 2) {
											this.aStringArray13[this.anInt994] = "Take @lre@" + local620.aString16;
											this.anIntArray270[this.anInt994] = 856;
											this.anIntArray271[this.anInt994] = local614.anInt183;
											this.anIntArray268[this.anInt994] = local53;
											this.anIntArray269[this.anInt994] = local59;
											this.anInt994++;
										}
									}
									this.aStringArray13[this.anInt994] = "Examine @lre@" + local620.aString16;
									this.anIntArray270[this.anInt994] = 1438;
									this.anIntArray271[this.anInt994] = local614.anInt183;
									this.anIntArray268[this.anInt994] = local53;
									this.anIntArray269[this.anInt994] = local59;
									this.anInt994++;
								} else if ((this.anInt984 & 0x1) == 1) {
									this.aStringArray13[this.anInt994] = this.aString25 + " @lre@" + local620.aString16;
									this.anIntArray270[this.anInt994] = 545;
									this.anIntArray271[this.anInt994] = local614.anInt183;
									this.anIntArray268[this.anInt994] = local53;
									this.anIntArray269[this.anInt994] = local59;
									this.anInt994++;
								}
							}
						}
					}
				}
			}
			@Pc(946) boolean local946 = false;
		} catch (@Pc(948) RuntimeException local948) {
			signlink.reporterror("66376, " + arg0 + ", " + local948.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method696() {
		try {
			this.aClass40_27.method496();
			Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray253;
			this.aClass8_Sub1_Sub2_Sub3_5.method494(0, 0);
			if (this.aBoolean240) {
				this.aClass8_Sub1_Sub2_Sub4_4.method561(0, 239, this.aString26, 40);
				this.aClass8_Sub1_Sub2_Sub4_4.method561(128, 239, this.aString30 + "*", 60);
			} else if (this.anInt985 == 1) {
				this.aClass8_Sub1_Sub2_Sub4_4.method561(0, 239, "Enter amount:", 40);
				this.aClass8_Sub1_Sub2_Sub4_4.method561(128, 239, this.aString22 + "*", 60);
			} else if (this.anInt985 == 2) {
				this.aClass8_Sub1_Sub2_Sub4_4.method561(0, 239, "Enter name:", 40);
				this.aClass8_Sub1_Sub2_Sub4_4.method561(128, 239, this.aString22 + "*", 60);
			} else {
				@Pc(125) Class8_Sub1_Sub2_Sub4 local125;
				@Pc(133) int local133;
				@Pc(144) int local144;
				if (this.anInt985 == 3) {
					if (this.aString22 != this.aString29) {
						this.method722(this.aString22);
						this.aString29 = this.aString22;
					}
					local125 = this.aClass8_Sub1_Sub2_Sub4_3;
					Class8_Sub1_Sub2.method550(0, 0, 463, 77);
					for (local133 = 0; local133 < this.anInt1017; local133++) {
						local144 = local133 * 14 + 18 - this.anInt1018;
						if (local144 > 0 && local144 < 110) {
							local125.method561(0, 239, this.aStringArray14[local133], local144);
						}
					}
					Class8_Sub1_Sub2.method549();
					if (this.anInt1017 > 5) {
						this.method643(0, 77, this.anInt1017 * 14 + 7, 463, this.anInt1018);
					}
					if (this.aString22.length() == 0) {
						this.aClass8_Sub1_Sub2_Sub4_4.method561(255, 239, "Enter object name", 40);
					} else if (this.anInt1017 == 0) {
						this.aClass8_Sub1_Sub2_Sub4_4.method561(0, 239, "No matching objects found, please shorten search", 40);
					}
					local125.method561(0, 239, this.aString22 + "*", 90);
					Class8_Sub1_Sub2.method556(0, 77, 0, 479);
				} else if (this.aString21 != null) {
					this.aClass8_Sub1_Sub2_Sub4_4.method561(0, 239, this.aString21, 40);
					this.aClass8_Sub1_Sub2_Sub4_4.method561(128, 239, "Click to continue", 60);
				} else if (this.anInt833 != -1) {
					this.method647(127, 0, 0, 0, Class24.method259(this.anInt833));
				} else if (this.anInt1055 == -1) {
					local125 = this.aClass8_Sub1_Sub2_Sub4_3;
					local133 = 0;
					Class8_Sub1_Sub2.method550(0, 0, 463, 77);
					for (local144 = 0; local144 < 100; local144++) {
						if (this.aStringArray12[local144] != null) {
							@Pc(309) int local309 = this.anIntArray247[local144];
							@Pc(318) int local318 = this.anInt836 + 70 - local133 * 14;
							@Pc(323) String local323 = this.aStringArray11[local144];
							@Pc(325) byte local325 = 0;
							if (local323 != null && local323.startsWith("@cr1@")) {
								local323 = local323.substring(5);
								local325 = 1;
							}
							if (local323 != null && local323.startsWith("@cr2@")) {
								local323 = local323.substring(5);
								local325 = 2;
							}
							if (local309 == 0) {
								if (local318 > 0 && local318 < 110) {
									local125.method565(local318, 0, this.aStringArray12[local144], 4);
								}
								local133++;
							}
							@Pc(395) int local395;
							if ((local309 == 1 || local309 == 2) && (local309 == 1 || this.anInt934 == 0 || this.anInt934 == 1 && this.method623(local323))) {
								if (local318 > 0 && local318 < 110) {
									local395 = 4;
									if (local325 == 1) {
										this.aClass8_Sub1_Sub2_Sub3Array3[0].method494(4, local318 - 12);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass8_Sub1_Sub2_Sub3Array3[1].method494(local395, local318 - 12);
										local395 += 14;
									}
									local125.method565(local318, 0, local323 + ":", local395);
									local395 += local125.method563(local323) + 8;
									local125.method565(local318, 255, this.aStringArray12[local144], local395);
								}
								local133++;
							}
							if ((local309 == 3 || local309 == 7) && this.anInt946 == 0 && (local309 == 7 || this.anInt965 == 0 || this.anInt965 == 1 && this.method623(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method565(local318, 0, "From", 4);
									local395 = local125.method563("From ") + 4;
									if (local325 == 1) {
										this.aClass8_Sub1_Sub2_Sub3Array3[0].method494(local395, local318 - 12);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass8_Sub1_Sub2_Sub3Array3[1].method494(local395, local318 - 12);
										local395 += 14;
									}
									local125.method565(local318, 0, local323 + ":", local395);
									local395 += local125.method563(local323) + 8;
									local125.method565(local318, 8388608, this.aStringArray12[local144], local395);
								}
								local133++;
							}
							if (local309 == 4 && (this.anInt898 == 0 || this.anInt898 == 1 && this.method623(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method565(local318, 8388736, local323 + " " + this.aStringArray12[local144], 4);
								}
								local133++;
							}
							if (local309 == 5 && this.anInt946 == 0 && this.anInt965 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method565(local318, 8388608, this.aStringArray12[local144], 4);
								}
								local133++;
							}
							if (local309 == 6 && this.anInt946 == 0 && this.anInt965 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method565(local318, 0, "To " + local323 + ":", 4);
									local125.method565(local318, 8388608, this.aStringArray12[local144], local125.method563("To " + local323) + 12);
								}
								local133++;
							}
							if (local309 == 8 && (this.anInt898 == 0 || this.anInt898 == 1 && this.method623(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method565(local318, 8270336, local323 + " " + this.aStringArray12[local144], 4);
								}
								local133++;
							}
						}
					}
					Class8_Sub1_Sub2.method549();
					this.anInt879 = local133 * 14 + 7;
					if (this.anInt879 < 78) {
						this.anInt879 = 78;
					}
					this.method643(0, 77, this.anInt879, 463, this.anInt879 - this.anInt836 - 77);
					@Pc(765) String local765;
					if (aClass8_Sub1_Sub1_Sub1_Sub1_1 == null || aClass8_Sub1_Sub1_Sub1_Sub1_1.aString4 == null) {
						local765 = Class28.method309(this.aString27);
					} else {
						local765 = aClass8_Sub1_Sub1_Sub1_Sub1_1.aString4;
					}
					local125.method565(90, 0, local765 + ":", 4);
					local125.method565(90, 255, this.aString18 + "*", local125.method563(local765 + ": ") + 6);
					Class8_Sub1_Sub2.method556(0, 77, 0, 479);
				} else {
					this.method647(127, 0, 0, 0, Class24.method259(this.anInt1055));
				}
			}
			if (this.aBoolean216 && this.anInt1020 == 2) {
				this.method630();
			}
			this.aClass40_27.method497(357, 17, super.aGraphics2);
			this.aClass40_26.method496();
			Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
			this.anInt900 += 0;
		} catch (@Pc(852) RuntimeException local852) {
			signlink.reporterror("6154, " + 0 + ", " + local852.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method697(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class24 local2 = Class24.method259(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray135.length && local2.anIntArray135[local4] != -1; local4++) {
				@Pc(18) Class24 local18 = Class24.method259(local2.anIntArray135[local4]);
				if (local18.anInt425 == 1) {
					this.method697(local18.anInt454);
				}
				local18.anInt438 = 0;
				local18.anInt434 = 0;
			}
			this.aBoolean218 &= true;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("27595, " + true + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ[B)V")
	private void method698(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (this.aBoolean203) {
				signlink.anInt1068 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("21606, " + -91 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
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
				return new URL("http://127.0.0.1:" + (anInt1014 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method699() {
		try {
			this.aClass40_24.method496();
			Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray254;
			this.aClass8_Sub1_Sub2_Sub3_3.method494(0, 0);
			if (this.anInt843 != -1) {
				this.method647(127, 0, 0, 0, Class24.method259(this.anInt843));
			} else if (this.anIntArray275[this.anInt966] != -1) {
				this.method647(127, 0, 0, 0, Class24.method259(this.anIntArray275[this.anInt966]));
			}
			if (this.aBoolean216 && this.anInt1020 == 1) {
				this.method630();
			}
			this.aClass40_24.method497(205, 553, super.aGraphics2);
			this.aClass40_26.method496();
			Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("74153, " + -21824 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method700() {
		try {
			anInt929++;
			if (anInt929 > 114) {
				anInt929 = 0;
				this.aClass8_Sub1_Sub3_6.method395(239);
				this.aClass8_Sub1_Sub3_6.method399(15039916);
			}
			while (true) {
				@Pc(33) int local33;
				do {
					while (true) {
						local33 = this.method580();
						if (local33 == -1) {
							return;
						}
						if (this.anInt827 != -1 && this.anInt827 == this.anInt969) {
							if (local33 == 8 && this.aString23.length() > 0) {
								this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							}
							break;
						}
						@Pc(213) int local213;
						if (this.aBoolean240) {
							if (local33 >= 32 && local33 <= 122 && this.aString30.length() < 80) {
								this.aString30 = this.aString30 + (char) local33;
								this.aBoolean206 = true;
							}
							if (local33 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
								this.aBoolean206 = true;
							}
							if (local33 == 13 || local33 == 10) {
								this.aBoolean240 = false;
								this.aBoolean206 = true;
								@Pc(173) long local173;
								if (this.anInt967 == 1) {
									local173 = Class28.method305(this.aString30);
									this.method713(local173);
								}
								if (this.anInt967 == 2 && this.anInt1046 > 0) {
									local173 = Class28.method305(this.aString30);
									this.method650(local173);
								}
								if (this.anInt967 == 3 && this.aString30.length() > 0) {
									this.aClass8_Sub1_Sub3_6.method395(135);
									this.aClass8_Sub1_Sub3_6.method396(0);
									local213 = this.aClass8_Sub1_Sub3_6.anInt620;
									this.aClass8_Sub1_Sub3_6.method402(66, this.aLong30);
									Class6.method27(this.aString30, 922, this.aClass8_Sub1_Sub3_6);
									this.aClass8_Sub1_Sub3_6.method405(this.aClass8_Sub1_Sub3_6.anInt620 - local213, this.aByte36);
									this.aString30 = Class6.method28(this.aString30, this.aByte40);
									this.aString30 = Class27.method277(this.aString30, this.aByte40);
									this.method688(Class28.method309(Class28.method306(this.aLong30)), this.aString30, 6);
									if (this.anInt965 == 2) {
										this.anInt965 = 1;
										this.aBoolean224 = true;
										this.aClass8_Sub1_Sub3_6.method395(232);
										this.aClass8_Sub1_Sub3_6.method396(this.anInt934);
										this.aClass8_Sub1_Sub3_6.method396(this.anInt965);
										this.aClass8_Sub1_Sub3_6.method396(this.anInt898);
									}
								}
								if (this.anInt967 == 4 && this.anInt855 < 100) {
									local173 = Class28.method305(this.aString30);
									this.method614(local173);
								}
								if (this.anInt967 == 5 && this.anInt855 > 0) {
									local173 = Class28.method305(this.aString30);
									this.method671(local173);
								}
							}
						} else if (this.anInt985 == 1) {
							if (local33 >= 48 && local33 <= 57 && this.aString22.length() < 10) {
								this.aString22 = this.aString22 + (char) local33;
								this.aBoolean206 = true;
							}
							if (local33 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
								this.aBoolean206 = true;
							}
							if (local33 == 13 || local33 == 10) {
								if (this.aString22.length() > 0) {
									local213 = 0;
									try {
										local213 = Integer.parseInt(this.aString22);
									} catch (@Pc(393) Exception local393) {
									}
									this.aClass8_Sub1_Sub3_6.method395(151);
									this.aClass8_Sub1_Sub3_6.method400(local213);
								}
								this.anInt985 = 0;
								this.aBoolean206 = true;
							}
						} else if (this.anInt985 == 2) {
							if (local33 >= 32 && local33 <= 122 && this.aString22.length() < 12) {
								this.aString22 = this.aString22 + (char) local33;
								this.aBoolean206 = true;
							}
							if (local33 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
								this.aBoolean206 = true;
							}
							if (local33 == 13 || local33 == 10) {
								if (this.aString22.length() > 0) {
									this.aClass8_Sub1_Sub3_6.method395(158);
									this.aClass8_Sub1_Sub3_6.method402(66, Class28.method305(this.aString22));
								}
								this.anInt985 = 0;
								this.aBoolean206 = true;
							}
						} else if (this.anInt985 == 3) {
							if (local33 >= 32 && local33 <= 122 && this.aString22.length() < 40) {
								this.aString22 = this.aString22 + (char) local33;
								this.aBoolean206 = true;
							}
							if (local33 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
								this.aBoolean206 = true;
							}
						} else if (this.anInt833 == -1 && this.anInt947 == -1) {
							if (local33 >= 32 && local33 <= 122 && this.aString18.length() < 80) {
								this.aString18 = this.aString18 + (char) local33;
								this.aBoolean206 = true;
							}
							if (local33 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
								this.aBoolean206 = true;
							}
							if ((local33 == 13 || local33 == 10) && this.aString18.length() > 0) {
								if (this.anInt926 == 2) {
									if (this.aString18.equals("::clientdrop")) {
										this.method619();
									}
									if (this.aString18.equals("::lag")) {
										this.method719();
									}
									if (this.aString18.equals("::prefetchmusic")) {
										for (local213 = 0; local213 < this.aClass1_Sub1_1.method97(2, 32); local213++) {
											this.aClass1_Sub1_1.method102((byte) 1, local213, 2);
										}
									}
									if (this.aString18.equals("::fpson")) {
										aBoolean211 = true;
									}
									if (this.aString18.equals("::fpsoff")) {
										aBoolean211 = false;
									}
									if (this.aString18.equals("::noclip")) {
										for (local213 = 0; local213 < 4; local213++) {
											for (@Pc(678) int local678 = 1; local678 < 103; local678++) {
												for (@Pc(682) int local682 = 1; local682 < 103; local682++) {
													this.aClass38Array1[local213].anIntArrayArray20[local678][local682] = 0;
												}
											}
										}
									}
								}
								if (this.aString18.startsWith("::")) {
									this.aClass8_Sub1_Sub3_6.method395(124);
									this.aClass8_Sub1_Sub3_6.method396(this.aString18.length() - 1);
									this.aClass8_Sub1_Sub3_6.method403(this.aString18.substring(2));
								} else {
									@Pc(737) String local737 = this.aString18.toLowerCase();
									@Pc(739) byte local739 = 0;
									if (local737.startsWith("yellow:")) {
										local739 = 0;
										this.aString18 = this.aString18.substring(7);
									} else if (local737.startsWith("red:")) {
										local739 = 1;
										this.aString18 = this.aString18.substring(4);
									} else if (local737.startsWith("green:")) {
										local739 = 2;
										this.aString18 = this.aString18.substring(6);
									} else if (local737.startsWith("cyan:")) {
										local739 = 3;
										this.aString18 = this.aString18.substring(5);
									} else if (local737.startsWith("purple:")) {
										local739 = 4;
										this.aString18 = this.aString18.substring(7);
									} else if (local737.startsWith("white:")) {
										local739 = 5;
										this.aString18 = this.aString18.substring(6);
									} else if (local737.startsWith("flash1:")) {
										local739 = 6;
										this.aString18 = this.aString18.substring(7);
									} else if (local737.startsWith("flash2:")) {
										local739 = 7;
										this.aString18 = this.aString18.substring(7);
									} else if (local737.startsWith("flash3:")) {
										local739 = 8;
										this.aString18 = this.aString18.substring(7);
									} else if (local737.startsWith("glow1:")) {
										local739 = 9;
										this.aString18 = this.aString18.substring(6);
									} else if (local737.startsWith("glow2:")) {
										local739 = 10;
										this.aString18 = this.aString18.substring(6);
									} else if (local737.startsWith("glow3:")) {
										local739 = 11;
										this.aString18 = this.aString18.substring(6);
									}
									local737 = this.aString18.toLowerCase();
									@Pc(911) byte local911 = 0;
									if (local737.startsWith("wave:")) {
										local911 = 1;
										this.aString18 = this.aString18.substring(5);
									} else if (local737.startsWith("wave2:")) {
										local911 = 2;
										this.aString18 = this.aString18.substring(6);
									} else if (local737.startsWith("shake:")) {
										local911 = 3;
										this.aString18 = this.aString18.substring(6);
									} else if (local737.startsWith("scroll:")) {
										local911 = 4;
										this.aString18 = this.aString18.substring(7);
									} else if (local737.startsWith("slide:")) {
										local911 = 5;
										this.aString18 = this.aString18.substring(6);
									}
									this.aClass8_Sub1_Sub3_6.method395(75);
									this.aClass8_Sub1_Sub3_6.method396(0);
									@Pc(992) int local992 = this.aClass8_Sub1_Sub3_6.anInt620;
									this.aClass8_Sub1_Sub3_6.method424(local739);
									this.aClass8_Sub1_Sub3_6.method423(local911);
									this.aClass8_Sub1_Sub3_8.anInt620 = 0;
									Class6.method27(this.aString18, 922, this.aClass8_Sub1_Sub3_8);
									this.aClass8_Sub1_Sub3_6.method443(this.aClass8_Sub1_Sub3_8.aByteArray13, this.aClass8_Sub1_Sub3_8.anInt620);
									this.aClass8_Sub1_Sub3_6.method405(this.aClass8_Sub1_Sub3_6.anInt620 - local992, this.aByte36);
									this.aString18 = Class6.method28(this.aString18, this.aByte40);
									this.aString18 = Class27.method277(this.aString18, this.aByte40);
									aClass8_Sub1_Sub1_Sub1_Sub1_1.aString5 = this.aString18;
									aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt229 = local739;
									aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt209 = local911;
									aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt186 = 150;
									if (this.anInt926 == 2) {
										this.method688("@cr2@" + aClass8_Sub1_Sub1_Sub1_Sub1_1.aString4, aClass8_Sub1_Sub1_Sub1_Sub1_1.aString5, 2);
									} else if (this.anInt926 == 1) {
										this.method688("@cr1@" + aClass8_Sub1_Sub1_Sub1_Sub1_1.aString4, aClass8_Sub1_Sub1_Sub1_Sub1_1.aString5, 2);
									} else {
										this.method688(aClass8_Sub1_Sub1_Sub1_Sub1_1.aString4, aClass8_Sub1_Sub1_Sub1_Sub1_1.aString5, 2);
									}
									if (this.anInt934 == 2) {
										this.anInt934 = 3;
										this.aBoolean224 = true;
										this.aClass8_Sub1_Sub3_6.method395(232);
										this.aClass8_Sub1_Sub3_6.method396(this.anInt934);
										this.aClass8_Sub1_Sub3_6.method396(this.anInt965);
										this.aClass8_Sub1_Sub3_6.method396(this.anInt898);
									}
								}
								this.aString18 = "";
								this.aBoolean206 = true;
							}
						}
					}
				} while ((local33 < 97 || local33 > 122) && (local33 < 65 || local33 > 90) && (local33 < 48 || local33 > 57) && local33 != 32);
				if (this.aString23.length() < 12) {
					this.aString23 = this.aString23 + (char) local33;
				}
			}
		} catch (@Pc(1148) RuntimeException local1148) {
			signlink.reporterror("69484, " + -33 + ", " + local1148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method701() {
		try {
			if (aBoolean236 && this.anInt825 == 2 && Class2.anInt4 != this.anInt891) {
				this.method613("Loading - please wait.", 685, null);
				this.anInt825 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt825 == 1) {
				@Pc(38) int local38 = this.method702();
				if (local38 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString27 + " glcfb " + this.aLong33 + "," + local38 + "," + aBoolean236 + "," + this.aClass39Array1[0] + "," + this.aClass1_Sub1_1.method101() + "," + this.anInt891 + "," + this.anInt834 + "," + this.anInt835);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt825 == 2 && this.anInt891 != this.anInt1011) {
				this.anInt1011 = this.anInt891;
				this.method685(this.anInt891);
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("55909, " + 8 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)I")
	private int method702() {
		try {
			for (@Pc(14) int local14 = 0; local14 < this.aByteArrayArray6.length; local14++) {
				if (this.aByteArrayArray6[local14] == null && this.anIntArray235[local14] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local14] == null && this.anIntArray236[local14] != -1) {
					return -2;
				}
			}
			@Pc(50) boolean local50 = true;
			for (@Pc(52) int local52 = 0; local52 < this.aByteArrayArray6.length; local52++) {
				@Pc(59) byte[] local59 = this.aByteArrayArray5[local52];
				if (local59 != null) {
					@Pc(73) int local73 = (this.anIntArray234[local52] >> 8) * 64 - this.anInt1001;
					@Pc(85) int local85 = (this.anIntArray234[local52] & 0xFF) * 64 - this.anInt1002;
					if (this.aBoolean202) {
						local73 = 10;
						local85 = 10;
					}
					local50 &= Class2.method15(local73, local85, local59);
				}
			}
			if (!local50) {
				return -3;
			} else if (this.aBoolean207) {
				return -4;
			} else {
				this.anInt825 = 2;
				Class2.anInt4 = this.anInt891;
				this.method706(this.anInt927);
				this.aClass8_Sub1_Sub3_6.method395(103);
				return 0;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("15403, " + -5852 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIIIIIII)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class8_Sub3 local1 = null;
			for (@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) this.aClass7_11.method32(); local6 != null; local6 = (Class8_Sub3) this.aClass7_11.method34()) {
				if (local6.anInt316 == arg7 && local6.anInt318 == arg3 && local6.anInt319 == arg9 && local6.anInt317 == arg4) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class8_Sub3();
				local1.anInt316 = arg7;
				local1.anInt317 = arg4;
				local1.anInt318 = arg3;
				local1.anInt319 = arg9;
				this.method649(local1);
				this.aClass7_11.method29(local1);
			}
			local1.anInt309 = arg0;
			local1.anInt311 = arg8;
			local1.anInt310 = arg6;
			local1.anInt320 = arg1;
			local1.anInt312 = arg5;
			if (arg2 == 9) {
				@Pc(81) boolean local81 = false;
			} else {
				this.anInt901 = this.aClass8_Sub1_Sub3_9.method406();
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("57132, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)I")
	private int method704(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) int local7 = 3;
			if (this.anInt952 < 310) {
				@Pc(16) int local16 = this.anInt949 >> 7;
				@Pc(21) int local21 = this.anInt951 >> 7;
				@Pc(26) int local26 = aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 >> 7;
				@Pc(31) int local31 = aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt891][local16][local21] & 0x4) != 0) {
					local7 = this.anInt891;
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
						if ((this.aByteArrayArrayArray8[this.anInt891][local16][local21] & 0x4) != 0) {
							local7 = this.anInt891;
						}
						local83 += local81;
						if (local83 >= 65536) {
							local83 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt891][local16][local21] & 0x4) != 0) {
								local7 = this.anInt891;
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
						if ((this.aByteArrayArrayArray8[this.anInt891][local16][local21] & 0x4) != 0) {
							local7 = this.anInt891;
						}
						local83 += local81;
						if (local83 >= 65536) {
							local83 -= 65536;
							if (local16 < local26) {
								local16++;
							} else if (local16 > local26) {
								local16--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt891][local16][local21] & 0x4) != 0) {
								local7 = this.anInt891;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt891][aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt230 >> 7][aClass8_Sub1_Sub1_Sub1_Sub1_1.anInt231 >> 7] & 0x4) != 0) {
				local7 = this.anInt891;
			}
			return local7;
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("45237, " + arg0 + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)I")
	private int method705(@OriginalArg(0) byte arg0) {
		try {
			@Pc(9) int local9 = this.method666(this.anInt951, this.anInt949, this.anInt891);
			@Pc(14) boolean local14 = false;
			return local9 - this.anInt950 >= 800 || (this.aByteArrayArrayArray8[this.anInt891][this.anInt949 >> 7][this.anInt951 >> 7] & 0x4) == 0 ? 3 : this.anInt891;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("90168, " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method706(@OriginalArg(0) int arg0) {
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
				this.anInt1011 = -1;
				this.aClass7_10.method36();
				this.aClass7_12.method36();
				Class8_Sub1_Sub2_Sub1.method349();
				this.method602();
				this.aClass21_1.method178();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass38Array1[local22].method453();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class2 local77 = new Class2(this.aByteArrayArrayArray8, 104, this.anIntArrayArrayArray8, 104, true);
				local43 = this.aByteArrayArray6.length;
				this.aClass8_Sub1_Sub3_6.method395(235);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean202) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray234[local91] >> 8) * 64 - this.anInt1001;
						local117 = (this.anIntArray234[local91] & 0xFF) * 64 - this.anInt1002;
						local122 = this.aByteArrayArray6[local91];
						if (local122 != null) {
							local77.method23(local105, this.aClass38Array1, (this.anInt834 - 6) * 8, local122, (this.anInt835 - 6) * 8, local117);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray234[local105] >> 8) * 64 - this.anInt1001;
						local176 = (this.anIntArray234[local105] & 0xFF) * 64 - this.anInt1002;
						@Pc(181) byte[] local181 = this.aByteArrayArray6[local105];
						if (local181 == null && this.anInt835 < 800) {
							local77.method8(64, 64, local117, local176);
						}
					}
					this.aClass8_Sub1_Sub3_6.method395(235);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray5[local117];
						if (local122 != null) {
							local226 = (this.anIntArray234[local117] >> 8) * 64 - this.anInt1001;
							local238 = (this.anIntArray234[local117] & 0xFF) * 64 - this.anInt1002;
							local77.method21(local226, 488, this.aClass21_1, this.aClass38Array1, local238, local122);
						}
					}
				}
				if (this.aBoolean202) {
					local91 = 0;
					label262: while (true) {
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
										local77.method8(8, 8, local105 * 8, local117 * 8);
									}
								}
							}
							this.aClass8_Sub1_Sub3_6.method395(235);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label262;
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
											for (@Pc(496) int local496 = 0; local496 < this.anIntArray234.length; local496++) {
												if (this.anIntArray234[local496] == local317 && this.aByteArrayArray5[local496] != null) {
													local77.method13(local299, local117, local176 * 8, this.aByteArrayArray5[local496], (local315 & 0x7) * 8, local293, this.aClass21_1, local226 * 8, this.aClass38Array1, (local305 & 0x7) * 8);
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
									for (local317 = 0; local317 < this.anIntArray234.length; local317++) {
										if (this.anIntArray234[local317] == local315 && this.aByteArrayArray6[local317] != null) {
											local77.method19(this.aByteArrayArray6[local317], local117 * 8, (local305 & 0x7) * 8, local91, local105 * 8, local238, (local299 & 0x7) * 8, this.aClass38Array1, local293);
											local269 = true;
											break;
										}
									}
								}
								if (!local269) {
									local77.method4(local105 * 8, local91, local117 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.aClass8_Sub1_Sub3_6.method395(235);
				local77.method9(this.aClass21_1, this.aClass38Array1, this.anInt832);
				if (this.aClass40_26 != null) {
					this.aClass40_26.method496();
					Class8_Sub1_Sub2_Sub1.anIntArray165 = this.anIntArray255;
				}
				this.aClass8_Sub1_Sub3_6.method395(235);
				local91 = Class2.anInt1;
				if (local91 > this.anInt891) {
					local91 = this.anInt891;
				}
				if (local91 < this.anInt891 - 1) {
					local91 = this.anInt891 - 1;
				}
				if (aBoolean236) {
					this.aClass21_1.method179(Class2.anInt1);
				} else {
					this.aClass21_1.method179(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method656(local105, local117);
					}
				}
				anInt889++;
				if (anInt889 > 85) {
					anInt889 = 0;
					this.aClass8_Sub1_Sub3_6.method395(253);
				}
				this.method645();
			} catch (@Pc(660) Exception local660) {
			}
			Class42.aClass15_6.method118();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass8_Sub1_Sub3_6.method395(85);
				this.aClass8_Sub1_Sub3_6.method400(1057001181);
			}
			if (aBoolean236 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass1_Sub1_1.method97(0, 32);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass1_Sub1_1.method111(local35);
					if ((local39 & 0x79) == 0) {
						Class8_Sub1_Sub1_Sub3.method135(local35);
					}
				}
			}
			System.gc();
			Class8_Sub1_Sub2_Sub1.method350();
			this.aClass1_Sub1_1.method91(this.aBoolean208);
			if (arg0 != this.anInt1016) {
				this.anInt901 = -1;
			}
			local22 = (this.anInt834 - 6) / 8 - 1;
			local35 = (this.anInt834 + 6) / 8 + 1;
			local39 = (this.anInt835 - 6) / 8 - 1;
			local43 = (this.anInt835 + 6) / 8 + 1;
			if (this.aBoolean213) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass1_Sub1_1.method98(local105, local91, 0, anInt906);
						if (local117 != -1) {
							this.aClass1_Sub1_1.method94(local117, 3);
						}
						local176 = this.aClass1_Sub1_1.method98(local105, local91, 1, anInt906);
						if (local176 != -1) {
							this.aClass1_Sub1_1.method94(local176, 3);
						}
					}
				}
			}
		} catch (@Pc(832) RuntimeException local832) {
			signlink.reporterror("6966, " + arg0 + ", " + local832.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method707(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt994 >= 2 || this.anInt978 != 0 || this.anInt982 != 0) {
				@Pc(31) String local31;
				if (this.anInt978 == 1 && this.anInt994 < 2) {
					local31 = "Use " + this.aString24 + " with...";
				} else if (this.anInt982 == 1 && this.anInt994 < 2) {
					local31 = this.aString25 + "...";
				} else {
					local31 = this.aStringArray13[this.anInt994 - 1];
				}
				if (this.anInt994 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt994 - 2) + " more options";
				}
				this.aClass8_Sub1_Sub2_Sub4_4.method570(anInt917 / 1000, local31, (byte) 8, 4, 15, 16777215);
				@Pc(97) boolean local97 = false;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("47371, " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JFHWDRLM;IZ)V")
	private void method708(@OriginalArg(0) Class8_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean218 &= true;
			this.method709(arg0.anInt231, arg0.anInt230, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("48244, " + arg0 + ", " + arg1 + ", " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method666(arg0, arg1, this.anInt891) - arg2;
				@Pc(33) int local33 = arg1 - this.anInt949;
				@Pc(38) int local38 = local28 - this.anInt950;
				@Pc(43) int local43 = arg0 - this.anInt951;
				@Pc(48) int local48 = Class8_Sub1_Sub1_Sub3.anIntArray106[this.anInt952];
				@Pc(53) int local53 = Class8_Sub1_Sub1_Sub3.anIntArray107[this.anInt952];
				@Pc(58) int local58 = Class8_Sub1_Sub1_Sub3.anIntArray106[this.anInt953];
				@Pc(63) int local63 = Class8_Sub1_Sub1_Sub3.anIntArray107[this.anInt953];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(105) int local105 = local38 * local48 + local83 * local53 >> 16;
				if (local105 >= 50) {
					this.anInt841 = Class8_Sub1_Sub2_Sub1.anInt565 + (local85 << 9) / local105;
					this.anInt842 = Class8_Sub1_Sub2_Sub1.anInt566 + (local95 << 9) / local105;
				} else {
					this.anInt841 = -1;
					this.anInt842 = -1;
				}
			} else {
				this.anInt841 = -1;
				this.anInt842 = -1;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("54588, " + -24143 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method710() {
		try {
			if (this.anInt877 == 2) {
				this.method709((this.anInt988 - this.anInt1002 << 7) + this.anInt991, (this.anInt987 - this.anInt1001 << 7) + this.anInt990, this.anInt989 * 2);
				if (this.anInt841 > -1 && anInt917 % 20 < 10) {
					this.aClass8_Sub1_Sub2_Sub2Array4[0].method384(this.anInt841 - 12, this.anInt842 - 28);
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("65591, " + 3 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method711() {
		try {
			if (this.anInt957 == 0) {
				this.aStringArray13[0] = "Cancel";
				this.anIntArray270[0] = 1423;
				this.anInt994 = 1;
				if (this.anInt947 == -1) {
					this.method691();
					this.anInt968 = 0;
					this.anInt1036 = 0;
					if (super.anInt812 > 4 && super.anInt813 > 4 && super.anInt812 < 516 && super.anInt813 < 338) {
						if (this.anInt827 == -1) {
							this.method695(653);
						} else {
							this.method622(4, 4, super.anInt812, 0, Class24.method259(this.anInt827), 0, super.anInt813);
						}
					}
					if (this.anInt968 != this.anInt1038) {
						this.anInt1038 = this.anInt968;
					}
					if (this.anInt1036 != this.anInt960) {
						this.anInt960 = this.anInt1036;
					}
					this.anInt968 = 0;
					this.anInt1036 = 0;
					if (super.anInt812 > 553 && super.anInt813 > 205 && super.anInt812 < 743 && super.anInt813 < 466) {
						if (this.anInt843 != -1) {
							this.method622(553, 205, super.anInt812, 0, Class24.method259(this.anInt843), 1, super.anInt813);
						} else if (this.anIntArray275[this.anInt966] != -1) {
							this.method622(553, 205, super.anInt812, 0, Class24.method259(this.anIntArray275[this.anInt966]), 1, super.anInt813);
						}
					}
					if (this.anInt968 != this.anInt847) {
						this.aBoolean215 = true;
						this.anInt847 = this.anInt968;
					}
					if (this.anInt1036 != this.anInt1015) {
						this.aBoolean215 = true;
						this.anInt1015 = this.anInt1036;
					}
					this.anInt968 = 0;
					this.anInt1036 = 0;
					if (super.anInt812 > 17 && super.anInt813 > 357 && super.anInt812 < 496 && super.anInt813 < 453) {
						if (this.anInt833 != -1) {
							this.method622(17, 357, super.anInt812, 0, Class24.method259(this.anInt833), 2, super.anInt813);
						} else if (this.anInt1055 != -1) {
							this.method622(17, 357, super.anInt812, 0, Class24.method259(this.anInt1055), 3, super.anInt813);
						} else if (super.anInt813 < 434 && super.anInt812 < 426 && this.anInt985 == 0) {
							this.method628(super.anInt812 - 17, super.anInt813 - 357, this.aByte34);
						}
					}
					if ((this.anInt833 != -1 || this.anInt1055 != -1) && this.anInt968 != this.anInt1030) {
						this.aBoolean206 = true;
						this.anInt1030 = this.anInt968;
					}
					if ((this.anInt833 != -1 || this.anInt1055 != -1) && this.anInt1036 != this.anInt905) {
						this.aBoolean206 = true;
						this.anInt905 = this.anInt1036;
					}
					@Pc(352) boolean local352 = false;
					while (!local352) {
						local352 = true;
						for (@Pc(358) int local358 = 0; local358 < this.anInt994 - 1; local358++) {
							if (this.anIntArray270[local358] < 1000 && this.anIntArray270[local358 + 1] > 1000) {
								@Pc(379) String local379 = this.aStringArray13[local358];
								this.aStringArray13[local358] = this.aStringArray13[local358 + 1];
								this.aStringArray13[local358 + 1] = local379;
								@Pc(401) int local401 = this.anIntArray270[local358];
								this.anIntArray270[local358] = this.anIntArray270[local358 + 1];
								this.anIntArray270[local358 + 1] = local401;
								@Pc(423) int local423 = this.anIntArray268[local358];
								this.anIntArray268[local358] = this.anIntArray268[local358 + 1];
								this.anIntArray268[local358 + 1] = local423;
								@Pc(445) int local445 = this.anIntArray269[local358];
								this.anIntArray269[local358] = this.anIntArray269[local358 + 1];
								this.anIntArray269[local358 + 1] = local445;
								@Pc(467) int local467 = this.anIntArray271[local358];
								this.anIntArray271[local358] = this.anIntArray271[local358 + 1];
								this.anIntArray271[local358 + 1] = local467;
								local352 = false;
							}
						}
					}
				} else {
					this.anInt968 = 0;
					this.anInt1036 = 0;
					this.method622(0, 0, super.anInt812, 0, Class24.method259(this.anInt947), 0, super.anInt813);
					if (this.anInt968 != this.anInt1038) {
						this.anInt1038 = this.anInt968;
					}
					if (this.anInt1036 != this.anInt960) {
						this.anInt960 = this.anInt1036;
					}
				}
			}
		} catch (@Pc(497) RuntimeException local497) {
			signlink.reporterror("82965, " + -411 + ", " + local497.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt806 = 5;
		}
		if (aBoolean227) {
			this.aBoolean230 = true;
			return;
		}
		aBoolean227 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method659();
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
			this.aBoolean210 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass39Array1[local107] = new Class39(signlink.aRandomAccessFileArray1[local107], 500000, local107 + 1, signlink.aRandomAccessFile3, 0);
			}
		}
		try {
			this.method592();
			this.aClass35_2 = this.method686(1, this.anIntArray246[1], "title", 25, "title screen");
			this.aClass8_Sub1_Sub2_Sub4_2 = new Class8_Sub1_Sub2_Sub4(this.aClass35_2, (byte) -3, "p11_full", false);
			this.aClass8_Sub1_Sub2_Sub4_3 = new Class8_Sub1_Sub2_Sub4(this.aClass35_2, (byte) -3, "p12_full", false);
			this.aClass8_Sub1_Sub2_Sub4_4 = new Class8_Sub1_Sub2_Sub4(this.aClass35_2, (byte) -3, "b12_full", false);
			this.aClass8_Sub1_Sub2_Sub4_5 = new Class8_Sub1_Sub2_Sub4(this.aClass35_2, (byte) -3, "q8_full", true);
			this.method668();
			this.method653();
			@Pc(203) Class35 local203 = this.method686(2, this.anIntArray246[2], "config", 30, "config");
			@Pc(215) Class35 local215 = this.method686(3, this.anIntArray246[3], "interface", 35, "interface");
			@Pc(227) Class35 local227 = this.method686(4, this.anIntArray246[4], "media", 40, "2d graphics");
			@Pc(239) Class35 local239 = this.method686(6, this.anIntArray246[6], "textures", 45, "textures");
			@Pc(251) Class35 local251 = this.method686(7, this.anIntArray246[7], "wordenc", 50, "chat system");
			@Pc(263) Class35 local263 = this.method686(8, this.anIntArray246[8], "sounds", 55, "sound effects");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass21_1 = new Class21(this.anIntArrayArrayArray8, 104, 4, anInt1010, 104);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass38Array1[local288] = new Class38(74, 104, 104);
			}
			this.aClass8_Sub1_Sub2_Sub2_10 = new Class8_Sub1_Sub2_Sub2(512, 512);
			@Pc(323) Class35 local323 = this.method686(5, this.anIntArray246[5], "versionlist", 60, "update list");
			this.method588(60, "Connecting to update server");
			this.aClass1_Sub1_1 = new Class1_Sub1();
			this.aClass1_Sub1_1.method100(local323, this);
			Class34.method327(this.aClass1_Sub1_1.method99(675));
			Class8_Sub1_Sub1_Sub3.method133(this.aClass1_Sub1_1.method97(0, 32), this.aClass1_Sub1_1);
			if (!aBoolean236) {
				this.anInt846 = 0;
				this.aBoolean204 = true;
				this.aClass1_Sub1_1.method104(2, this.anInt846);
				while (this.aClass1_Sub1_1.method101() > 0) {
					this.method599();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass1_Sub1_1.anInt236 > 3) {
						this.method625("ondemand");
						return;
					}
				}
			}
			this.method588(65, "Requesting animations");
			@Pc(398) int local398 = this.aClass1_Sub1_1.method97(1, 32);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass1_Sub1_1.method104(1, local400);
			}
			@Pc(418) int local418;
			while (this.aClass1_Sub1_1.method101() > 0) {
				local418 = local398 - this.aClass1_Sub1_1.method101();
				if (local418 > 0) {
					this.method588(65, "Loading animations - " + local418 * 100 / local398 + "%");
				}
				this.method599();
				try {
					Thread.sleep(100L);
				} catch (@Pc(444) Exception local444) {
				}
				if (this.aClass1_Sub1_1.anInt236 > 3) {
					this.method625("ondemand");
					return;
				}
			}
			this.method588(70, "Requesting models");
			local398 = this.aClass1_Sub1_1.method97(0, 32);
			@Pc(478) int local478;
			for (local418 = 0; local418 < local398; local418++) {
				local478 = this.aClass1_Sub1_1.method111(local418);
				if ((local478 & 0x1) != 0) {
					this.aClass1_Sub1_1.method104(0, local418);
				}
			}
			local398 = this.aClass1_Sub1_1.method101();
			while (this.aClass1_Sub1_1.method101() > 0) {
				local478 = local398 - this.aClass1_Sub1_1.method101();
				if (local478 > 0) {
					this.method588(70, "Loading models - " + local478 * 100 / local398 + "%");
				}
				this.method599();
				try {
					Thread.sleep(100L);
				} catch (@Pc(529) Exception local529) {
				}
			}
			if (this.aClass39Array1[0] != null) {
				this.method588(75, "Requesting maps");
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(48, 47, 0, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(48, 47, 1, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(48, 48, 0, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(48, 48, 1, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(48, 49, 0, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(48, 49, 1, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(47, 47, 0, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(47, 47, 1, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(47, 48, 0, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(47, 48, 1, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(148, 48, 0, anInt906));
				this.aClass1_Sub1_1.method104(3, this.aClass1_Sub1_1.method98(148, 48, 1, anInt906));
				local398 = this.aClass1_Sub1_1.method101();
				while (this.aClass1_Sub1_1.method101() > 0) {
					local478 = local398 - this.aClass1_Sub1_1.method101();
					if (local478 > 0) {
						this.method588(75, "Loading maps - " + local478 * 100 / local398 + "%");
					}
					this.method599();
					try {
						Thread.sleep(100L);
					} catch (@Pc(714) Exception local714) {
					}
				}
			}
			local398 = this.aClass1_Sub1_1.method97(0, 32);
			@Pc(735) int local735;
			for (local478 = 0; local478 < local398; local478++) {
				local735 = this.aClass1_Sub1_1.method111(local478);
				@Pc(737) byte local737 = 0;
				if ((local735 & 0x8) != 0) {
					local737 = 10;
				} else if ((local735 & 0x20) != 0) {
					local737 = 9;
				} else if ((local735 & 0x10) != 0) {
					local737 = 8;
				} else if ((local735 & 0x40) != 0) {
					local737 = 7;
				} else if ((local735 & 0x80) != 0) {
					local737 = 6;
				} else if ((local735 & 0x2) != 0) {
					local737 = 5;
				} else if ((local735 & 0x4) != 0) {
					local737 = 4;
				}
				if ((local735 & 0x1) != 0) {
					local737 = 3;
				}
				if (local737 != 0) {
					this.aClass1_Sub1_1.method102(local737, local478, 0);
				}
			}
			this.aClass1_Sub1_1.method109((byte) 4, aBoolean235);
			if (!aBoolean236) {
				local398 = this.aClass1_Sub1_1.method97(2, 32);
				for (local735 = 1; local735 < local398; local735++) {
					if (this.aClass1_Sub1_1.method92(local735)) {
						this.aClass1_Sub1_1.method102((byte) 1, local735, 2);
					}
				}
			}
			this.method588(80, "Unpacking media");
			this.aClass8_Sub1_Sub2_Sub3_3 = new Class8_Sub1_Sub2_Sub3(local227, "invback", 0);
			this.aClass8_Sub1_Sub2_Sub3_5 = new Class8_Sub1_Sub2_Sub3(local227, "chatback", 0);
			this.aClass8_Sub1_Sub2_Sub3_4 = new Class8_Sub1_Sub2_Sub3(local227, "mapback", 0);
			this.aClass8_Sub1_Sub2_Sub3_8 = new Class8_Sub1_Sub2_Sub3(local227, "backbase1", 0);
			this.aClass8_Sub1_Sub2_Sub3_9 = new Class8_Sub1_Sub2_Sub3(local227, "backbase2", 0);
			this.aClass8_Sub1_Sub2_Sub3_10 = new Class8_Sub1_Sub2_Sub3(local227, "backhmid1", 0);
			for (local735 = 0; local735 < 13; local735++) {
				this.aClass8_Sub1_Sub2_Sub3Array5[local735] = new Class8_Sub1_Sub2_Sub3(local227, "sideicons", local735);
			}
			this.aClass8_Sub1_Sub2_Sub2_11 = new Class8_Sub1_Sub2_Sub2(local227, "compass", 0);
			this.aClass8_Sub1_Sub2_Sub2_14 = new Class8_Sub1_Sub2_Sub2(local227, "mapedge", 0);
			this.aClass8_Sub1_Sub2_Sub2_14.method381();
			for (@Pc(937) int local937 = 0; local937 < 72; local937++) {
				this.aClass8_Sub1_Sub2_Sub3Array2[local937] = new Class8_Sub1_Sub2_Sub3(local227, "mapscene", local937);
			}
			for (@Pc(955) int local955 = 0; local955 < 70; local955++) {
				this.aClass8_Sub1_Sub2_Sub2Array10[local955] = new Class8_Sub1_Sub2_Sub2(local227, "mapfunction", local955);
			}
			for (@Pc(973) int local973 = 0; local973 < 5; local973++) {
				this.aClass8_Sub1_Sub2_Sub2Array9[local973] = new Class8_Sub1_Sub2_Sub2(local227, "hitmarks", local973);
			}
			for (@Pc(991) int local991 = 0; local991 < 6; local991++) {
				this.aClass8_Sub1_Sub2_Sub2Array6[local991] = new Class8_Sub1_Sub2_Sub2(local227, "headicons_pk", local991);
			}
			for (@Pc(1009) int local1009 = 0; local1009 < 9; local1009++) {
				this.aClass8_Sub1_Sub2_Sub2Array8[local1009] = new Class8_Sub1_Sub2_Sub2(local227, "headicons_prayer", local1009);
			}
			for (@Pc(1027) int local1027 = 0; local1027 < 6; local1027++) {
				this.aClass8_Sub1_Sub2_Sub2Array4[local1027] = new Class8_Sub1_Sub2_Sub2(local227, "headicons_hint", local1027);
			}
			this.aClass8_Sub1_Sub2_Sub2_15 = new Class8_Sub1_Sub2_Sub2(local227, "overlay_multiway", 0);
			this.aClass8_Sub1_Sub2_Sub2_3 = new Class8_Sub1_Sub2_Sub2(local227, "mapmarker", 0);
			this.aClass8_Sub1_Sub2_Sub2_4 = new Class8_Sub1_Sub2_Sub2(local227, "mapmarker", 1);
			for (@Pc(1069) int local1069 = 0; local1069 < 8; local1069++) {
				this.aClass8_Sub1_Sub2_Sub2Array7[local1069] = new Class8_Sub1_Sub2_Sub2(local227, "cross", local1069);
			}
			this.aClass8_Sub1_Sub2_Sub2_5 = new Class8_Sub1_Sub2_Sub2(local227, "mapdots", 0);
			this.aClass8_Sub1_Sub2_Sub2_6 = new Class8_Sub1_Sub2_Sub2(local227, "mapdots", 1);
			this.aClass8_Sub1_Sub2_Sub2_7 = new Class8_Sub1_Sub2_Sub2(local227, "mapdots", 2);
			this.aClass8_Sub1_Sub2_Sub2_8 = new Class8_Sub1_Sub2_Sub2(local227, "mapdots", 3);
			this.aClass8_Sub1_Sub2_Sub2_9 = new Class8_Sub1_Sub2_Sub2(local227, "mapdots", 4);
			this.aClass8_Sub1_Sub2_Sub3_6 = new Class8_Sub1_Sub2_Sub3(local227, "scrollbar", 0);
			this.aClass8_Sub1_Sub2_Sub3_7 = new Class8_Sub1_Sub2_Sub3(local227, "scrollbar", 1);
			this.aClass8_Sub1_Sub2_Sub3_16 = new Class8_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass8_Sub1_Sub2_Sub3_17 = new Class8_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass8_Sub1_Sub2_Sub3_18 = new Class8_Sub1_Sub2_Sub3(local227, "redstone3", 0);
			this.aClass8_Sub1_Sub2_Sub3_19 = new Class8_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass8_Sub1_Sub2_Sub3_19.method491(anInt963);
			this.aClass8_Sub1_Sub2_Sub3_20 = new Class8_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass8_Sub1_Sub2_Sub3_20.method491(anInt963);
			this.aClass8_Sub1_Sub2_Sub3_11 = new Class8_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass8_Sub1_Sub2_Sub3_11.method492();
			this.aClass8_Sub1_Sub2_Sub3_12 = new Class8_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass8_Sub1_Sub2_Sub3_12.method492();
			this.aClass8_Sub1_Sub2_Sub3_13 = new Class8_Sub1_Sub2_Sub3(local227, "redstone3", 0);
			this.aClass8_Sub1_Sub2_Sub3_13.method492();
			this.aClass8_Sub1_Sub2_Sub3_14 = new Class8_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass8_Sub1_Sub2_Sub3_14.method491(anInt963);
			this.aClass8_Sub1_Sub2_Sub3_14.method492();
			this.aClass8_Sub1_Sub2_Sub3_15 = new Class8_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass8_Sub1_Sub2_Sub3_15.method491(anInt963);
			this.aClass8_Sub1_Sub2_Sub3_15.method492();
			for (@Pc(1259) int local1259 = 0; local1259 < 2; local1259++) {
				this.aClass8_Sub1_Sub2_Sub3Array3[local1259] = new Class8_Sub1_Sub2_Sub3(local227, "mod_icons", local1259);
			}
			@Pc(1282) Class8_Sub1_Sub2_Sub2 local1282 = new Class8_Sub1_Sub2_Sub2(local227, "backleft1", 0);
			this.aClass40_15 = new Class40(local1282.anInt606, local1282.anInt605, aByte42, this.method586());
			local1282.method382(0, 0);
			@Pc(1307) Class8_Sub1_Sub2_Sub2 local1307 = new Class8_Sub1_Sub2_Sub2(local227, "backleft2", 0);
			this.aClass40_16 = new Class40(local1307.anInt606, local1307.anInt605, aByte42, this.method586());
			local1307.method382(0, 0);
			@Pc(1332) Class8_Sub1_Sub2_Sub2 local1332 = new Class8_Sub1_Sub2_Sub2(local227, "backright1", 0);
			this.aClass40_17 = new Class40(local1332.anInt606, local1332.anInt605, aByte42, this.method586());
			local1332.method382(0, 0);
			@Pc(1357) Class8_Sub1_Sub2_Sub2 local1357 = new Class8_Sub1_Sub2_Sub2(local227, "backright2", 0);
			this.aClass40_18 = new Class40(local1357.anInt606, local1357.anInt605, aByte42, this.method586());
			local1357.method382(0, 0);
			@Pc(1382) Class8_Sub1_Sub2_Sub2 local1382 = new Class8_Sub1_Sub2_Sub2(local227, "backtop1", 0);
			this.aClass40_19 = new Class40(local1382.anInt606, local1382.anInt605, aByte42, this.method586());
			local1382.method382(0, 0);
			@Pc(1407) Class8_Sub1_Sub2_Sub2 local1407 = new Class8_Sub1_Sub2_Sub2(local227, "backvmid1", 0);
			this.aClass40_20 = new Class40(local1407.anInt606, local1407.anInt605, aByte42, this.method586());
			local1407.method382(0, 0);
			@Pc(1432) Class8_Sub1_Sub2_Sub2 local1432 = new Class8_Sub1_Sub2_Sub2(local227, "backvmid2", 0);
			this.aClass40_21 = new Class40(local1432.anInt606, local1432.anInt605, aByte42, this.method586());
			local1432.method382(0, 0);
			@Pc(1457) Class8_Sub1_Sub2_Sub2 local1457 = new Class8_Sub1_Sub2_Sub2(local227, "backvmid3", 0);
			this.aClass40_22 = new Class40(local1457.anInt606, local1457.anInt605, aByte42, this.method586());
			local1457.method382(0, 0);
			@Pc(1482) Class8_Sub1_Sub2_Sub2 local1482 = new Class8_Sub1_Sub2_Sub2(local227, "backhmid2", 0);
			this.aClass40_23 = new Class40(local1482.anInt606, local1482.anInt605, aByte42, this.method586());
			local1482.method382(0, 0);
			@Pc(1507) int local1507 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1514) int local1514 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1521) int local1521 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1528) int local1528 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1530) int local1530 = 0; local1530 < 100; local1530++) {
				if (this.aClass8_Sub1_Sub2_Sub2Array10[local1530] != null) {
					this.aClass8_Sub1_Sub2_Sub2Array10[local1530].method380(local1514 + local1528, local1521 + local1528, local1507 + local1528);
				}
				if (this.aClass8_Sub1_Sub2_Sub3Array2[local1530] != null) {
					this.aClass8_Sub1_Sub2_Sub3Array2[local1530].method493(local1514 + local1528, local1521 + local1528, local1507 + local1528);
				}
			}
			this.method588(83, "Unpacking textures");
			Class8_Sub1_Sub2_Sub1.method351(local239);
			Class8_Sub1_Sub2_Sub1.method355(0.8D);
			Class8_Sub1_Sub2_Sub1.method350();
			this.method588(86, "Unpacking config");
			Class20.method169(local203);
			Class42.method516(local203);
			Class17.method124(local203);
			Class46.method531(local203);
			Class45.method522(local203);
			Class9.method65(local203);
			Class32.method311(local203);
			Class23.method232(local203);
			Class5.method24(local203);
			Class46.aBoolean184 = aBoolean235;
			if (!aBoolean236) {
				this.method588(90, "Unpacking sounds");
				@Pc(1633) byte[] local1633 = local263.method364("sounds.dat", null);
				@Pc(1639) Class8_Sub1_Sub3 local1639 = new Class8_Sub1_Sub3(local1633, -631);
				Class41.method501(local1639);
			}
			this.method588(95, "Unpacking interfaces");
			@Pc(1670) Class8_Sub1_Sub2_Sub4[] local1670 = new Class8_Sub1_Sub2_Sub4[] { this.aClass8_Sub1_Sub2_Sub4_2, this.aClass8_Sub1_Sub2_Sub4_3, this.aClass8_Sub1_Sub2_Sub4_4, this.aClass8_Sub1_Sub2_Sub4_5 };
			Class24.method255(local227, local215, local1670);
			this.method588(100, "Preparing game engine");
			@Pc(1686) int local1686;
			@Pc(1688) int local1688;
			@Pc(1690) int local1690;
			for (@Pc(1682) int local1682 = 0; local1682 < 33; local1682++) {
				local1686 = 999;
				local1688 = 0;
				for (local1690 = 0; local1690 < 34; local1690++) {
					if (this.aClass8_Sub1_Sub2_Sub3_4.aByteArray15[local1690 + local1682 * this.aClass8_Sub1_Sub2_Sub3_4.anInt666] == 0) {
						if (local1686 == 999) {
							local1686 = local1690;
						}
					} else if (local1686 != 999) {
						local1688 = local1690;
						break;
					}
				}
				this.anIntArray248[local1682] = local1686;
				this.anIntArray252[local1682] = local1688 - local1686;
			}
			@Pc(1748) int local1748;
			for (local1686 = 5; local1686 < 156; local1686++) {
				local1688 = 999;
				local1690 = 0;
				for (local1748 = 25; local1748 < 172; local1748++) {
					if (this.aClass8_Sub1_Sub2_Sub3_4.aByteArray15[local1748 + local1686 * this.aClass8_Sub1_Sub2_Sub3_4.anInt666] == 0 && (local1748 > 34 || local1686 > 34)) {
						if (local1688 == 999) {
							local1688 = local1748;
						}
					} else if (local1688 != 999) {
						local1690 = local1748;
						break;
					}
				}
				this.anIntArray217[local1686 - 5] = local1688 - 25;
				this.anIntArray224[local1686 - 5] = local1690 - local1688;
			}
			Class8_Sub1_Sub2_Sub1.method348(503, 765);
			this.anIntArray256 = Class8_Sub1_Sub2_Sub1.anIntArray165;
			Class8_Sub1_Sub2_Sub1.method348(96, 479);
			this.anIntArray253 = Class8_Sub1_Sub2_Sub1.anIntArray165;
			Class8_Sub1_Sub2_Sub1.method348(261, 190);
			this.anIntArray254 = Class8_Sub1_Sub2_Sub1.anIntArray165;
			Class8_Sub1_Sub2_Sub1.method348(334, 512);
			this.anIntArray255 = Class8_Sub1_Sub2_Sub1.anIntArray165;
			@Pc(1839) int[] local1839 = new int[9];
			for (local1690 = 0; local1690 < 9; local1690++) {
				local1748 = local1690 * 32 + 128 + 15;
				@Pc(1857) int local1857 = local1748 * 3 + 600;
				@Pc(1861) int local1861 = Class8_Sub1_Sub2_Sub1.anIntArray163[local1748];
				local1839[local1690] = local1857 * local1861 >> 16;
			}
			Class21.method214(local1839);
			Class27.method267(local251);
			this.aClass44_1 = new Class44(this, false);
			this.method587(this.aClass44_1, 10);
			Class8_Sub1_Sub1_Sub5.aClient2 = this;
			Class42.aClient3 = this;
			Class45.aClient5 = this;
		} catch (@Pc(1902) Exception local1902) {
			signlink.reporterror("loaderror " + this.aString17 + " " + this.anInt888);
			this.aBoolean239 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private String method712(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("18142, " + arg0 + ", " + -278 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JZ)V")
	private void method713(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1046 >= 100 && this.anInt961 != 1) {
					this.method688("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt1046 >= 200) {
					this.method688("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(38) String local38 = Class28.method309(Class28.method306(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1046; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method688("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(73) int local73 = 0; local73 < this.anInt855; local73++) {
						if (this.aLongArray4[local73] == arg0) {
							this.method688("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local38.equals(aClass8_Sub1_Sub1_Sub1_Sub1_1.aString4)) {
						this.aStringArray10[this.anInt1046] = local38;
						this.aLongArray3[this.anInt1046] = arg0;
						this.anIntArray216[this.anInt1046] = 0;
						this.anInt1046++;
						this.aBoolean215 = true;
						this.aClass8_Sub1_Sub3_6.method395(66);
						this.aClass8_Sub1_Sub3_6.method402(66, arg0);
					}
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("59849, " + arg0 + ", " + false + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)Ljava/net/Socket;")
	public Socket method714(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method715() {
		try {
			if (this.anInt957 == 0) {
				@Pc(12) int local12 = super.anInt817;
				if (this.anInt982 == 1 && super.anInt818 >= 516 && super.anInt819 >= 160 && super.anInt818 <= 765 && super.anInt819 <= 205) {
					local12 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean216) {
					if (local12 != 1) {
						local43 = super.anInt812;
						local46 = super.anInt813;
						if (this.anInt1020 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt1020 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt1020 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt1021 - 10 || local43 > this.anInt1021 + this.anInt1023 + 10 || local46 < this.anInt1022 - 10 || local46 > this.anInt1022 + this.anInt1024 + 10) {
							this.aBoolean216 = false;
							if (this.anInt1020 == 1) {
								this.aBoolean215 = true;
							}
							if (this.anInt1020 == 2) {
								this.aBoolean206 = true;
							}
						}
					}
					if (local12 == 1) {
						local43 = this.anInt1021;
						local46 = this.anInt1022;
						local122 = this.anInt1023;
						@Pc(125) int local125 = super.anInt818;
						@Pc(128) int local128 = super.anInt819;
						if (this.anInt1020 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt1020 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt1020 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt994; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt994 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method716(local147, 338);
						}
						this.aBoolean216 = false;
						if (this.anInt1020 == 1) {
							this.aBoolean215 = true;
						}
						if (this.anInt1020 == 2) {
							this.aBoolean206 = true;
							return;
						}
					}
				} else {
					if (local12 == 1 && this.anInt994 > 0) {
						local43 = this.anIntArray270[this.anInt994 - 1];
						if (local43 == 378 || local43 == 350 || local43 == 236 || local43 == 815 || local43 == 519 || local43 == 8 || local43 == 581 || local43 == 197 || local43 == 800 || local43 == 529 || local43 == 11 || local43 == 1107) {
							local46 = this.anIntArray268[this.anInt994 - 1];
							local122 = this.anIntArray269[this.anInt994 - 1];
							@Pc(283) Class24 local283 = Class24.method259(local122);
							if (local283.aBoolean101 || local283.aBoolean99) {
								this.aBoolean244 = false;
								this.anInt964 = 0;
								this.anInt955 = local122;
								this.anInt956 = local46;
								this.anInt957 = 2;
								this.anInt958 = super.anInt818;
								this.anInt959 = super.anInt819;
								if (Class24.method259(local122).anInt445 == this.anInt827) {
									this.anInt957 = 1;
								}
								if (Class24.method259(local122).anInt445 == this.anInt833) {
									this.anInt957 = 3;
								}
								return;
							}
						}
					}
					if (local12 == 1 && (this.anInt823 == 1 || this.method597(671, this.anInt994 - 1)) && this.anInt994 > 2) {
						local12 = 2;
					}
					if (local12 == 1 && this.anInt994 > 0) {
						this.method716(this.anInt994 - 1, 338);
					}
					if (local12 != 2 || this.anInt994 <= 0) {
						return;
					}
					this.method717();
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("98380, " + -313 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray268[arg0];
				@Pc(14) int local14 = this.anIntArray269[arg0];
				@Pc(19) int local19 = this.anIntArray270[arg0];
				@Pc(24) int local24 = this.anIntArray271[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt985 != 0 && local19 != 1423) {
					this.anInt985 = 0;
					this.aBoolean206 = true;
				}
				@Pc(61) String local61;
				if (local19 == 1273) {
					@Pc(49) int local49 = local24 >> 14 & 0x7FFF;
					@Pc(52) Class42 local52 = Class42.method512(local49);
					if (local52.aByteArray18 == null) {
						local61 = "It's a " + local52.aString14 + ".";
					} else {
						local61 = new String(local52.aByteArray18);
					}
					this.method688("", local61, 0);
				}
				@Pc(104) boolean local104;
				if (local19 == 756) {
					local104 = this.method631(0, 0, 2, false, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					if (!local104) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					}
					this.anInt1006 = super.anInt818;
					this.anInt1007 = super.anInt819;
					this.anInt1009 = 2;
					this.anInt1008 = 0;
					this.aClass8_Sub1_Sub3_6.method395(92);
					this.aClass8_Sub1_Sub3_6.method431(local9 + this.anInt1001);
					this.aClass8_Sub1_Sub3_6.method433(local14 + this.anInt1002);
					this.aClass8_Sub1_Sub3_6.method397(local24);
				}
				if (local19 == 350) {
					this.aClass8_Sub1_Sub3_6.method395(145);
					this.aClass8_Sub1_Sub3_6.method431(local24);
					this.aClass8_Sub1_Sub3_6.method432(local9, this.anInt962);
					this.aClass8_Sub1_Sub3_6.method397(local14);
					this.anInt1050 = 0;
					this.anInt1051 = local14;
					this.anInt1052 = local9;
					this.anInt1053 = 2;
					if (Class24.method259(local14).anInt445 == this.anInt827) {
						this.anInt1053 = 1;
					}
					if (Class24.method259(local14).anInt445 == this.anInt833) {
						this.anInt1053 = 3;
					}
				}
				if (local19 == 380) {
					local104 = this.method631(0, 0, 2, false, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					if (!local104) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					}
					this.anInt1006 = super.anInt818;
					this.anInt1007 = super.anInt819;
					this.anInt1009 = 2;
					this.anInt1008 = 0;
					this.aClass8_Sub1_Sub3_6.method395(43);
					this.aClass8_Sub1_Sub3_6.method431(this.anInt980);
					this.aClass8_Sub1_Sub3_6.method431(this.anInt981);
					this.aClass8_Sub1_Sub3_6.method431(local14 + this.anInt1002);
					this.aClass8_Sub1_Sub3_6.method397(local24);
					this.aClass8_Sub1_Sub3_6.method432(local9 + this.anInt1001, this.anInt962);
					this.aClass8_Sub1_Sub3_6.method431(this.anInt979);
				}
				@Pc(332) Class8_Sub1_Sub1_Sub1_Sub1 local332;
				if (local19 == 963) {
					local332 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local332 != null) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local332.anIntArray60[0], 0, local332.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						anInt1033++;
						if (anInt1033 >= 54) {
							this.aClass8_Sub1_Sub3_6.method395(234);
							this.aClass8_Sub1_Sub3_6.method399(14720213);
							anInt1033 = 0;
						}
						this.aClass8_Sub1_Sub3_6.method395(30);
						this.aClass8_Sub1_Sub3_6.method433(local24);
					}
				}
				if (local19 == 383) {
					this.method661(local9, local14, (byte) 4, local24);
					this.aClass8_Sub1_Sub3_6.method395(20);
					this.aClass8_Sub1_Sub3_6.method432(local24 >> 14 & 0x7FFF, this.anInt962);
					this.aClass8_Sub1_Sub3_6.method433(local14 + this.anInt1002);
					this.aClass8_Sub1_Sub3_6.method433(local9 + this.anInt1001);
				}
				@Pc(452) Class8_Sub1_Sub1_Sub1_Sub2 local452;
				if (local19 == 1827) {
					local452 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local452 != null) {
						@Pc(457) Class45 local457 = local452.aClass45_2;
						if (local457.anIntArray194 != null) {
							local457 = local457.method525(this.anInt1057);
						}
						if (local457 != null) {
							if (local457.aByteArray19 == null) {
								local61 = "It's a " + local457.aString15 + ".";
							} else {
								local61 = new String(local457.aByteArray19);
							}
							this.method688("", local61, 0);
						}
					}
				}
				if (local19 == 452) {
					local332 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local332 != null) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local332.anIntArray60[0], 0, local332.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass8_Sub1_Sub3_6.method395(217);
						this.aClass8_Sub1_Sub3_6.method433(this.anInt983);
						this.aClass8_Sub1_Sub3_6.method397(local24);
					}
				}
				if (local19 == 753) {
					local332 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local332 != null) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local332.anIntArray60[0], 0, local332.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass8_Sub1_Sub3_6.method395(38);
						this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
					}
				}
				@Pc(648) int local648;
				@Pc(631) String local631;
				@Pc(635) int local635;
				@Pc(646) long local646;
				if (local19 == 34) {
					local631 = this.aStringArray13[arg0];
					local635 = local631.indexOf("@whi@");
					if (local635 != -1) {
						local646 = Class28.method305(local631.substring(local635 + 5).trim());
						local648 = -1;
						for (@Pc(650) int local650 = 0; local650 < this.anInt1046; local650++) {
							if (this.aLongArray3[local650] == local646) {
								local648 = local650;
								break;
							}
						}
						if (local648 != -1 && this.anIntArray216[local648] > 0) {
							this.aBoolean206 = true;
							this.anInt985 = 0;
							this.aBoolean240 = true;
							this.aString30 = "";
							this.anInt967 = 3;
							this.aLong30 = this.aLongArray3[local648];
							this.aString26 = "Enter message to send to " + this.aStringArray10[local648];
						}
					}
				}
				if (local19 == 184) {
					local452 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local452 != null) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local452.anIntArray60[0], 0, local452.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass8_Sub1_Sub3_6.method395(14);
						this.aClass8_Sub1_Sub3_6.method397(local24);
					}
				}
				if (local19 == 493) {
					local332 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local332 != null) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local332.anIntArray60[0], 0, local332.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass8_Sub1_Sub3_6.method395(169);
						this.aClass8_Sub1_Sub3_6.method432(this.anInt981, this.anInt962);
						this.aClass8_Sub1_Sub3_6.method432(this.anInt979, this.anInt962);
						this.aClass8_Sub1_Sub3_6.method431(local24);
						this.aClass8_Sub1_Sub3_6.method397(this.anInt980);
					}
				}
				if (local19 == 8) {
					this.aClass8_Sub1_Sub3_6.method395(86);
					this.aClass8_Sub1_Sub3_6.method397(local9);
					this.aClass8_Sub1_Sub3_6.method431(local14);
					this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
					this.anInt1050 = 0;
					this.anInt1051 = local14;
					this.anInt1052 = local9;
					this.anInt1053 = 2;
					if (Class24.method259(local14).anInt445 == this.anInt827) {
						this.anInt1053 = 1;
					}
					if (Class24.method259(local14).anInt445 == this.anInt833) {
						this.anInt1053 = 3;
					}
				}
				if (local19 == 666) {
					this.aClass8_Sub1_Sub3_6.method395(247);
					this.aClass8_Sub1_Sub3_6.method433(local14);
					this.aClass8_Sub1_Sub3_6.method431(local24);
					this.aClass8_Sub1_Sub3_6.method397(this.anInt983);
					this.aClass8_Sub1_Sub3_6.method433(local9);
					this.anInt1050 = 0;
					this.anInt1051 = local14;
					this.anInt1052 = local9;
					this.anInt1053 = 2;
					if (Class24.method259(local14).anInt445 == this.anInt827) {
						this.anInt1053 = 1;
					}
					if (Class24.method259(local14).anInt445 == this.anInt833) {
						this.anInt1053 = 3;
					}
				}
				if (local19 == 550) {
					local631 = this.aStringArray13[arg0];
					local635 = local631.indexOf("@whi@");
					if (local635 != -1) {
						if (this.anInt827 == -1) {
							this.method675((byte) 2);
							this.aString23 = local631.substring(local635 + 5).trim();
							this.aBoolean217 = false;
							this.anInt969 = this.anInt827 = Class24.anInt442;
						} else {
							this.method688("", "Please close the interface you have open before using 'report abuse'", 0);
						}
					}
				}
				if (local19 == 424) {
					this.method638(this.anInt1055);
					this.anInt1055 = -1;
					this.aBoolean206 = true;
				}
				if (local19 == 772) {
					local332 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local332 != null) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local332.anIntArray60[0], 0, local332.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass8_Sub1_Sub3_6.method395(166);
						this.aClass8_Sub1_Sub3_6.method397(local24);
					}
				}
				if (local19 == 145) {
					local104 = this.method631(0, 0, 2, false, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					if (!local104) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					}
					this.anInt1006 = super.anInt818;
					this.anInt1007 = super.anInt819;
					this.anInt1009 = 2;
					this.anInt1008 = 0;
					this.aClass8_Sub1_Sub3_6.method395(214);
					this.aClass8_Sub1_Sub3_6.method431(local9 + this.anInt1001);
					this.aClass8_Sub1_Sub3_6.method397(local14 + this.anInt1002);
					this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
				}
				if (local19 == 236) {
					anInt1056 += local24;
					if (anInt1056 >= 64) {
						this.aClass8_Sub1_Sub3_6.method395(54);
						this.aClass8_Sub1_Sub3_6.method397(19877);
						anInt1056 = 0;
					}
					this.aClass8_Sub1_Sub3_6.method395(193);
					this.aClass8_Sub1_Sub3_6.method433(local14);
					this.aClass8_Sub1_Sub3_6.method431(local9);
					this.aClass8_Sub1_Sub3_6.method433(local24);
					this.anInt1050 = 0;
					this.anInt1051 = local14;
					this.anInt1052 = local9;
					this.anInt1053 = 2;
					if (Class24.method259(local14).anInt445 == this.anInt827) {
						this.anInt1053 = 1;
					}
					if (Class24.method259(local14).anInt445 == this.anInt833) {
						this.anInt1053 = 3;
					}
				}
				if (local19 == 655 && !this.aBoolean237) {
					this.aClass8_Sub1_Sub3_6.method395(120);
					this.aClass8_Sub1_Sub3_6.method397(local14);
					this.aBoolean237 = true;
				}
				if (local19 == 49) {
					local452 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local452 != null) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local452.anIntArray60[0], 0, local452.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass8_Sub1_Sub3_6.method395(21);
						this.aClass8_Sub1_Sub3_6.method397(local24);
					}
				}
				if (local19 == 519) {
					this.aClass8_Sub1_Sub3_6.method395(251);
					this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
					this.aClass8_Sub1_Sub3_6.method431(local14);
					this.aClass8_Sub1_Sub3_6.method431(local9);
					this.anInt1050 = 0;
					this.anInt1051 = local14;
					this.anInt1052 = local9;
					this.anInt1053 = 2;
					if (Class24.method259(local14).anInt445 == this.anInt827) {
						this.anInt1053 = 1;
					}
					if (Class24.method259(local14).anInt445 == this.anInt833) {
						this.anInt1053 = 3;
					}
				}
				if (local19 == 378) {
					anInt1005 += local14;
					if (anInt1005 >= 131) {
						this.aClass8_Sub1_Sub3_6.method395(87);
						this.aClass8_Sub1_Sub3_6.method399(1812634);
						anInt1005 = 0;
					}
					this.aClass8_Sub1_Sub3_6.method395(215);
					this.aClass8_Sub1_Sub3_6.method433(local24);
					this.aClass8_Sub1_Sub3_6.method397(local9);
					this.aClass8_Sub1_Sub3_6.method432(local14, this.anInt962);
					this.anInt1050 = 0;
					this.anInt1051 = local14;
					this.anInt1052 = local9;
					this.anInt1053 = 2;
					if (Class24.method259(local14).anInt445 == this.anInt827) {
						this.anInt1053 = 1;
					}
					if (Class24.method259(local14).anInt445 == this.anInt833) {
						this.anInt1053 = 3;
					}
				}
				if (local19 == 409) {
					local104 = this.method631(0, 0, 2, false, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					if (!local104) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					}
					this.anInt1006 = super.anInt818;
					this.anInt1007 = super.anInt819;
					this.anInt1009 = 2;
					this.anInt1008 = 0;
					this.aClass8_Sub1_Sub3_6.method395(197);
					this.aClass8_Sub1_Sub3_6.method433(local9 + this.anInt1001);
					this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
					this.aClass8_Sub1_Sub3_6.method432(local14 + this.anInt1002, this.anInt962);
				}
				@Pc(1537) Class24 local1537;
				if (local19 == 451) {
					local1537 = Class24.method259(local14);
					@Pc(1539) boolean local1539 = true;
					if (local1537.anInt447 > 0) {
						local1539 = this.method624(local1537);
					}
					if (local1539) {
						this.aClass8_Sub1_Sub3_6.method395(210);
						this.aClass8_Sub1_Sub3_6.method397(local14);
					}
				}
				if (local19 == 815) {
					this.aClass8_Sub1_Sub3_6.method395(178);
					this.aClass8_Sub1_Sub3_6.method433(local14);
					this.aClass8_Sub1_Sub3_6.method397(local9);
					this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
					this.anInt1050 = 0;
					this.anInt1051 = local14;
					this.anInt1052 = local9;
					this.anInt1053 = 2;
					if (Class24.method259(local14).anInt445 == this.anInt827) {
						this.anInt1053 = 1;
					}
					if (Class24.method259(local14).anInt445 == this.anInt833) {
						this.anInt1053 = 3;
					}
				}
				if (local19 == 80) {
					local452 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local452 != null) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local452.anIntArray60[0], 0, local452.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						anInt839++;
						if (anInt839 >= 79) {
							this.aClass8_Sub1_Sub3_6.method395(224);
							this.aClass8_Sub1_Sub3_6.method397(41106);
							anInt839 = 0;
						}
						this.aClass8_Sub1_Sub3_6.method395(136);
						this.aClass8_Sub1_Sub3_6.method397(local24);
					}
				}
				@Pc(1721) String local1721;
				@Pc(1695) Class46 local1695;
				if (local19 == 1107) {
					local1695 = Class46.method532(local24);
					@Pc(1698) Class24 local1698 = Class24.method259(local14);
					if (local1698 != null && local1698.anIntArray142[local9] >= 100000) {
						local1721 = local1698.anIntArray142[local9] + " x " + local1695.aString16;
					} else if (local1695.aByteArray20 == null) {
						local1721 = "It's a " + local1695.aString16 + ".";
					} else {
						local1721 = new String(local1695.aByteArray20);
					}
					this.method688("", local1721, 0);
				}
				if (local19 == 618) {
					this.method675((byte) 2);
				}
				if (local19 == 413 && this.method661(local9, local14, (byte) 4, local24)) {
					this.aClass8_Sub1_Sub3_6.method395(220);
					this.aClass8_Sub1_Sub3_6.method433(this.anInt981);
					this.aClass8_Sub1_Sub3_6.method433(local14 + this.anInt1002);
					this.aClass8_Sub1_Sub3_6.method397(local9 + this.anInt1001);
					this.aClass8_Sub1_Sub3_6.method397(this.anInt979);
					this.aClass8_Sub1_Sub3_6.method432(local24 >> 14 & 0x7FFF, this.anInt962);
					this.aClass8_Sub1_Sub3_6.method431(this.anInt980);
				}
				if (local19 == 365 || local19 == 355) {
					local631 = this.aStringArray13[arg0];
					local635 = local631.indexOf("@whi@");
					if (local635 != -1) {
						local631 = local631.substring(local635 + 5).trim();
						local61 = Class28.method309(Class28.method306(Class28.method305(local631)));
						@Pc(1848) boolean local1848 = false;
						for (local648 = 0; local648 < this.anInt975; local648++) {
							@Pc(1860) Class8_Sub1_Sub1_Sub1_Sub1 local1860 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray249[local648]];
							if (local1860 != null && local1860.aString4 != null && local1860.aString4.equalsIgnoreCase(local61)) {
								this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local1860.anIntArray60[0], 0, local1860.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
								if (local19 == 365) {
									this.aClass8_Sub1_Sub3_6.method395(166);
									this.aClass8_Sub1_Sub3_6.method397(this.anIntArray249[local648]);
								}
								if (local19 == 355) {
									this.aClass8_Sub1_Sub3_6.method395(38);
									this.aClass8_Sub1_Sub3_6.method432(this.anIntArray249[local648], this.anInt962);
								}
								local1848 = true;
								break;
							}
						}
						if (!local1848) {
							this.method688("", "Unable to find " + local61, 0);
						}
					}
				}
				if (local19 == 545) {
					local104 = this.method631(0, 0, 2, false, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					if (!local104) {
						this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
					}
					this.anInt1006 = super.anInt818;
					this.anInt1007 = super.anInt819;
					this.anInt1009 = 2;
					this.anInt1008 = 0;
					this.aClass8_Sub1_Sub3_6.method395(96);
					this.aClass8_Sub1_Sub3_6.method431(local9 + this.anInt1001);
					this.aClass8_Sub1_Sub3_6.method397(local24);
					this.aClass8_Sub1_Sub3_6.method397(this.anInt983);
					this.aClass8_Sub1_Sub3_6.method432(local14 + this.anInt1002, this.anInt962);
				}
				if (local19 == 377) {
					this.method661(local9, local14, (byte) 4, local24);
					this.aClass8_Sub1_Sub3_6.method395(162);
					this.aClass8_Sub1_Sub3_6.method433(local14 + this.anInt1002);
					this.aClass8_Sub1_Sub3_6.method432(local9 + this.anInt1001, this.anInt962);
					this.aClass8_Sub1_Sub3_6.method397(local24 >> 14 & 0x7FFF);
				}
				if (local19 == 11) {
					this.anInt978 = 1;
					this.anInt979 = local9;
					this.anInt980 = local14;
					this.anInt981 = local24;
					this.aString24 = String.valueOf(Class46.method532(local24).aString16);
					this.anInt982 = 0;
					this.aBoolean215 = true;
				} else {
					if (local19 == 382 && this.method661(local9, local14, (byte) 4, local24)) {
						this.aClass8_Sub1_Sub3_6.method395(154);
						this.aClass8_Sub1_Sub3_6.method432(local24 >> 14 & 0x7FFF, this.anInt962);
						this.aClass8_Sub1_Sub3_6.method397(local9 + this.anInt1001);
						this.aClass8_Sub1_Sub3_6.method397(this.anInt983);
						this.aClass8_Sub1_Sub3_6.method431(local14 + this.anInt1002);
					}
					if (local19 == 719) {
						local452 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local24];
						if (local452 != null) {
							this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local452.anIntArray60[0], 0, local452.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
							this.anInt1006 = super.anInt818;
							this.anInt1007 = super.anInt819;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass8_Sub1_Sub3_6.method395(183);
							this.aClass8_Sub1_Sub3_6.method431(this.anInt983);
							this.aClass8_Sub1_Sub3_6.method433(local24);
						}
					}
					if (local19 == 737) {
						this.aClass8_Sub1_Sub3_6.method395(210);
						this.aClass8_Sub1_Sub3_6.method397(local14);
						local1537 = Class24.method259(local14);
						if (local1537.anIntArrayArray12 != null && local1537.anIntArrayArray12[0][0] == 5) {
							local635 = local1537.anIntArrayArray12[0][1];
							if (this.anIntArray245[local635] != local1537.anIntArray139[0]) {
								this.anIntArray245[local635] = local1537.anIntArray139[0];
								this.method692(local635);
								this.aBoolean215 = true;
							}
						}
					}
					if (local19 == 646 || local19 == 955 || local19 == 978 || local19 == 366) {
						local631 = this.aStringArray13[arg0];
						local635 = local631.indexOf("@whi@");
						if (local635 != -1) {
							local646 = Class28.method305(local631.substring(local635 + 5).trim());
							if (local19 == 646) {
								this.method713(local646);
							}
							if (local19 == 955) {
								this.method614(local646);
							}
							if (local19 == 978) {
								this.method650(local646);
							}
							if (local19 == 366) {
								this.method671(local646);
							}
						}
					}
					if (local19 == 134) {
						if (this.aBoolean216) {
							this.aClass21_1.method216(local9 - 4, local14 - 4);
						} else {
							this.aClass21_1.method216(super.anInt818 - 4, super.anInt819 - 4);
						}
					}
					if (local19 == 581) {
						this.aClass8_Sub1_Sub3_6.method395(173);
						this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
						this.aClass8_Sub1_Sub3_6.method431(local14);
						this.aClass8_Sub1_Sub3_6.method431(local9);
						this.anInt1050 = 0;
						this.anInt1051 = local14;
						this.anInt1052 = local9;
						this.anInt1053 = 2;
						if (Class24.method259(local14).anInt445 == this.anInt827) {
							this.anInt1053 = 1;
						}
						if (Class24.method259(local14).anInt445 == this.anInt833) {
							this.anInt1053 = 3;
						}
					}
					if (local19 == 113) {
						local452 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local24];
						if (local452 != null) {
							this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local452.anIntArray60[0], 0, local452.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
							this.anInt1006 = super.anInt818;
							this.anInt1007 = super.anInt819;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							anInt972 += local24;
							if (anInt972 >= 105) {
								this.aClass8_Sub1_Sub3_6.method395(51);
								this.aClass8_Sub1_Sub3_6.method396(125);
								anInt972 = 0;
							}
							this.aClass8_Sub1_Sub3_6.method395(246);
							this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
						}
					}
					if (local19 == 148) {
						local332 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local24];
						if (local332 != null) {
							this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local332.anIntArray60[0], 0, local332.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
							this.anInt1006 = super.anInt818;
							this.anInt1007 = super.anInt819;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass8_Sub1_Sub3_6.method395(168);
							this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
						}
					}
					if (local19 == 800) {
						anInt941 += local14;
						if (anInt941 >= 136) {
							this.aClass8_Sub1_Sub3_6.method395(191);
							this.aClass8_Sub1_Sub3_6.method397(46982);
							anInt941 = 0;
						}
						this.aClass8_Sub1_Sub3_6.method395(44);
						this.aClass8_Sub1_Sub3_6.method432(local9, this.anInt962);
						this.aClass8_Sub1_Sub3_6.method431(local14);
						this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
						this.anInt1050 = 0;
						this.anInt1051 = local14;
						this.anInt1052 = local9;
						this.anInt1053 = 2;
						if (Class24.method259(local14).anInt445 == this.anInt827) {
							this.anInt1053 = 1;
						}
						if (Class24.method259(local14).anInt445 == this.anInt833) {
							this.anInt1053 = 3;
						}
					}
					if (local19 == 4) {
						local104 = this.method631(0, 0, 2, false, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						if (!local104) {
							this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
						}
						this.anInt1006 = super.anInt818;
						this.anInt1007 = super.anInt819;
						this.anInt1009 = 2;
						this.anInt1008 = 0;
						this.aClass8_Sub1_Sub3_6.method395(213);
						this.aClass8_Sub1_Sub3_6.method397(local9 + this.anInt1001);
						this.aClass8_Sub1_Sub3_6.method433(local14 + this.anInt1002);
						this.aClass8_Sub1_Sub3_6.method433(local24);
					}
					if (local19 == 1536) {
						this.method661(local9, local14, (byte) 4, local24);
						this.aClass8_Sub1_Sub3_6.method395(78);
						this.aClass8_Sub1_Sub3_6.method431(local9 + this.anInt1001);
						this.aClass8_Sub1_Sub3_6.method433(local14 + this.anInt1002);
						this.aClass8_Sub1_Sub3_6.method432(local24 >> 14 & 0x7FFF, this.anInt962);
					}
					if (local19 == 940) {
						this.aClass8_Sub1_Sub3_6.method395(137);
						this.aClass8_Sub1_Sub3_6.method433(this.anInt980);
						this.aClass8_Sub1_Sub3_6.method431(this.anInt981);
						this.aClass8_Sub1_Sub3_6.method431(local9);
						this.aClass8_Sub1_Sub3_6.method397(local14);
						this.aClass8_Sub1_Sub3_6.method397(this.anInt979);
						this.aClass8_Sub1_Sub3_6.method432(local24, this.anInt962);
						this.anInt1050 = 0;
						this.anInt1051 = local14;
						this.anInt1052 = local9;
						this.anInt1053 = 2;
						if (Class24.method259(local14).anInt445 == this.anInt827) {
							this.anInt1053 = 1;
						}
						if (Class24.method259(local14).anInt445 == this.anInt833) {
							this.anInt1053 = 3;
						}
					}
					if (local19 == 88) {
						anInt954 += local14;
						if (anInt954 >= 84) {
							this.aClass8_Sub1_Sub3_6.method395(7);
							this.aClass8_Sub1_Sub3_6.method397(20732);
							anInt954 = 0;
						}
						this.method661(local9, local14, (byte) 4, local24);
						this.aClass8_Sub1_Sub3_6.method395(37);
						this.aClass8_Sub1_Sub3_6.method433(local14 + this.anInt1002);
						this.aClass8_Sub1_Sub3_6.method432(local24 >> 14 & 0x7FFF, this.anInt962);
						this.aClass8_Sub1_Sub3_6.method432(local9 + this.anInt1001, this.anInt962);
					}
					if (local19 == 746) {
						local1537 = Class24.method259(local14);
						this.anInt982 = 1;
						this.anInt983 = local14;
						this.anInt984 = local1537.anInt461;
						this.anInt978 = 0;
						this.aBoolean215 = true;
						local1721 = local1537.aString11;
						if (local1721.indexOf(" ") != -1) {
							local1721 = local1721.substring(0, local1721.indexOf(" "));
						}
						local61 = local1537.aString11;
						if (local61.indexOf(" ") != -1) {
							local61 = local61.substring(local61.indexOf(" ") + 1);
						}
						this.aString25 = local1721 + " " + local1537.aString13 + " " + local61;
						if (this.anInt984 == 16) {
							this.aBoolean215 = true;
							this.anInt966 = 3;
							this.aBoolean231 = true;
						}
					} else {
						if (local19 == 226) {
							this.aClass8_Sub1_Sub3_6.method395(210);
							this.aClass8_Sub1_Sub3_6.method397(local14);
							local1537 = Class24.method259(local14);
							if (local1537.anIntArrayArray12 != null && local1537.anIntArrayArray12[0][0] == 5) {
								local635 = local1537.anIntArrayArray12[0][1];
								this.anIntArray245[local635] = 1 - this.anIntArray245[local635];
								this.method692(local635);
								this.aBoolean215 = true;
							}
						}
						if (local19 == 776) {
							local452 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local24];
							if (local452 != null) {
								this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local452.anIntArray60[0], 0, local452.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
								this.anInt1006 = super.anInt818;
								this.anInt1007 = super.anInt819;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass8_Sub1_Sub3_6.method395(111);
								this.aClass8_Sub1_Sub3_6.method431(local24);
								this.aClass8_Sub1_Sub3_6.method433(this.anInt981);
								this.aClass8_Sub1_Sub3_6.method432(this.anInt980, this.anInt962);
								this.aClass8_Sub1_Sub3_6.method433(this.anInt979);
							}
						}
						if (local19 == 914) {
							local332 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local24];
							if (local332 != null) {
								this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local332.anIntArray60[0], 0, local332.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
								this.anInt1006 = super.anInt818;
								this.anInt1007 = super.anInt819;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass8_Sub1_Sub3_6.method395(4);
								this.aClass8_Sub1_Sub3_6.method397(local24);
							}
						}
						if (local19 == 856) {
							local104 = this.method631(0, 0, 2, false, 0, 0, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
							if (!local104) {
								this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local14, 0, local9, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
							}
							this.anInt1006 = super.anInt818;
							this.anInt1007 = super.anInt819;
							this.anInt1009 = 2;
							this.anInt1008 = 0;
							this.aClass8_Sub1_Sub3_6.method395(2);
							this.aClass8_Sub1_Sub3_6.method432(local9 + this.anInt1001, this.anInt962);
							this.aClass8_Sub1_Sub3_6.method432(local14 + this.anInt1002, this.anInt962);
							this.aClass8_Sub1_Sub3_6.method433(local24);
						}
						if (local19 == 197) {
							this.aClass8_Sub1_Sub3_6.method395(33);
							this.aClass8_Sub1_Sub3_6.method433(local24);
							this.aClass8_Sub1_Sub3_6.method433(local14);
							this.aClass8_Sub1_Sub3_6.method397(local9);
							this.anInt1050 = 0;
							this.anInt1051 = local14;
							this.anInt1052 = local9;
							this.anInt1053 = 2;
							if (Class24.method259(local14).anInt445 == this.anInt827) {
								this.anInt1053 = 1;
							}
							if (Class24.method259(local14).anInt445 == this.anInt833) {
								this.anInt1053 = 3;
							}
						}
						if (local19 == 286) {
							anInt935++;
							if (anInt935 >= 89) {
								this.aClass8_Sub1_Sub3_6.method395(241);
								this.aClass8_Sub1_Sub3_6.method400(0);
								anInt935 = 0;
							}
							this.method661(local9, local14, (byte) 4, local24);
							this.aClass8_Sub1_Sub3_6.method395(161);
							this.aClass8_Sub1_Sub3_6.method433(local14 + this.anInt1002);
							this.aClass8_Sub1_Sub3_6.method432(local24 >> 14 & 0x7FFF, this.anInt962);
							this.aClass8_Sub1_Sub3_6.method397(local9 + this.anInt1001);
						}
						if (local19 == 356) {
							local452 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local24];
							if (local452 != null) {
								this.method631(1, 0, 2, false, 0, 1, aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray60[0], local452.anIntArray60[0], 0, local452.anIntArray59[0], aClass8_Sub1_Sub1_Sub1_Sub1_1.anIntArray59[0]);
								this.anInt1006 = super.anInt818;
								this.anInt1007 = super.anInt819;
								this.anInt1009 = 2;
								this.anInt1008 = 0;
								this.aClass8_Sub1_Sub3_6.method395(116);
								this.aClass8_Sub1_Sub3_6.method433(local24);
							}
						}
						if (local19 == 529) {
							this.aClass8_Sub1_Sub3_6.method395(248);
							this.aClass8_Sub1_Sub3_6.method431(local9);
							this.aClass8_Sub1_Sub3_6.method397(local24);
							this.aClass8_Sub1_Sub3_6.method431(local14);
							this.anInt1050 = 0;
							this.anInt1051 = local14;
							this.anInt1052 = local9;
							this.anInt1053 = 2;
							if (Class24.method259(local14).anInt445 == this.anInt827) {
								this.anInt1053 = 1;
							}
							if (Class24.method259(local14).anInt445 == this.anInt833) {
								this.anInt1053 = 3;
							}
						}
						if (local19 == 1438) {
							local1695 = Class46.method532(local24);
							if (local1695.aByteArray20 == null) {
								local1721 = "It's a " + local1695.aString16 + ".";
							} else {
								local1721 = new String(local1695.aByteArray20);
							}
							this.method688("", local1721, 0);
						}
						this.anInt978 = 0;
						this.anInt982 = 0;
						@Pc(3527) boolean local3527 = false;
						this.aBoolean215 = true;
					}
				}
			}
		} catch (@Pc(3532) RuntimeException local3532) {
			signlink.reporterror("93498, " + arg0 + ", " + arg1 + ", " + local3532.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method717() {
		try {
			@Pc(7) int local7 = this.aClass8_Sub1_Sub2_Sub4_4.method563("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt994; local9++) {
				local20 = this.aClass8_Sub1_Sub2_Sub4_4.method563(this.aStringArray13[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt994 * 15 + 21;
			@Pc(68) int local68;
			@Pc(86) int local86;
			if (super.anInt818 > 4 && super.anInt819 > 4 && super.anInt818 < 516 && super.anInt819 < 338) {
				local68 = super.anInt818 - local7 / 2 - 4;
				if (local68 + local7 > 512) {
					local68 = 512 - local7;
				}
				if (local68 < 0) {
					local68 = 0;
				}
				local86 = super.anInt819 - 4;
				if (local86 + local20 > 334) {
					local86 = 334 - local20;
				}
				if (local86 < 0) {
					local86 = 0;
				}
				this.aBoolean216 = true;
				this.anInt1020 = 0;
				this.anInt1021 = local68;
				this.anInt1022 = local86;
				this.anInt1023 = local7;
				this.anInt1024 = this.anInt994 * 15 + 22;
			}
			if (super.anInt818 > 553 && super.anInt819 > 205 && super.anInt818 < 743 && super.anInt819 < 466) {
				local68 = super.anInt818 - local7 / 2 - 553;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 190) {
					local68 = 190 - local7;
				}
				local86 = super.anInt819 - 205;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local20 > 261) {
					local86 = 261 - local20;
				}
				this.aBoolean216 = true;
				this.anInt1020 = 1;
				this.anInt1021 = local68;
				this.anInt1022 = local86;
				this.anInt1023 = local7;
				this.anInt1024 = this.anInt994 * 15 + 22;
			}
			if (super.anInt818 > 17 && super.anInt819 > 357 && super.anInt818 < 496 && super.anInt819 < 453) {
				local68 = super.anInt818 - local7 / 2 - 17;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 479) {
					local68 = 479 - local7;
				}
				local86 = super.anInt819 - 357;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local20 > 96) {
					local86 = 96 - local20;
				}
				this.aBoolean216 = true;
				this.anInt1020 = 2;
				this.anInt1021 = local68;
				this.anInt1022 = local86;
				this.anInt1023 = local7;
				this.anInt1024 = this.anInt994 * 15 + 22;
			}
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("65851, " + 69 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!TQYMAXSO;)V")
	private void method718(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method417(8);
			@Pc(12) int local12;
			if (local6 < this.anInt975) {
				for (local12 = local6; local12 < this.anInt975; local12++) {
					this.anIntArray241[this.anInt931++] = this.anIntArray249[local12];
				}
			}
			if (local6 > this.anInt975) {
				signlink.reporterror(this.aString27 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt975 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray249[local12];
				@Pc(69) Class8_Sub1_Sub1_Sub1_Sub1 local69 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local64];
				@Pc(74) int local74 = arg1.method417(1);
				if (local74 == 0) {
					this.anIntArray249[this.anInt975++] = local64;
					local69.anInt191 = anInt917;
				} else {
					@Pc(97) int local97 = arg1.method417(2);
					if (local97 == 0) {
						this.anIntArray249[this.anInt975++] = local64;
						local69.anInt191 = anInt917;
						this.anIntArray250[this.anInt976++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(159) int local159;
						if (local97 == 1) {
							this.anIntArray249[this.anInt975++] = local64;
							local69.anInt191 = anInt917;
							local148 = arg1.method417(3);
							local69.method84(this.anInt925, false, local148);
							local159 = arg1.method417(1);
							if (local159 == 1) {
								this.anIntArray250[this.anInt976++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray249[this.anInt975++] = local64;
							local69.anInt191 = anInt917;
							local148 = arg1.method417(3);
							local69.method84(this.anInt925, true, local148);
							local159 = arg1.method417(3);
							local69.method84(this.anInt925, true, local159);
							@Pc(219) int local219 = arg1.method417(1);
							if (local219 == 1) {
								this.anIntArray250[this.anInt976++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray241[this.anInt931++] = local64;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("34634, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method719() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt936);
			if (this.aClass1_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass1_Sub1_1.anInt250);
			}
			System.out.println("loop-cycle:" + anInt917);
			System.out.println("draw-cycle:" + anInt868);
			this.anInt900 += 0;
			System.out.println("ptype:" + this.anInt901);
			System.out.println("psize:" + this.anInt900);
			if (this.aClass19_1 != null) {
				this.aClass19_1.method168();
			}
			super.aBoolean197 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("72353, " + 0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method586() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("73060, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)V")
	private void method720() {
		try {
			if (this.aClass40_3 == null) {
				super.aClass40_2 = null;
				this.aClass40_27 = null;
				this.aClass40_25 = null;
				this.aClass40_24 = null;
				this.aClass40_26 = null;
				this.aClass40_12 = null;
				this.aClass40_13 = null;
				this.aClass40_14 = null;
				this.aClass40_6 = new Class40(265, 128, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_7 = new Class40(265, 128, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_3 = new Class40(171, 509, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_4 = new Class40(132, 360, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_5 = new Class40(200, 360, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_8 = new Class40(238, 202, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_9 = new Class40(238, 203, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_10 = new Class40(94, 74, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				this.aClass40_11 = new Class40(94, 75, aByte42, this.method586());
				Class8_Sub1_Sub2.method551();
				if (this.aClass35_2 != null) {
					this.method668();
					this.method653();
				}
				this.aBoolean212 = true;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("48026, " + 3 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!TQYMAXSO;II)V")
	private void method721(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt931 = 0;
			this.anInt976 = 0;
			this.method634(arg1, arg0);
			@Pc(16) int local16 = arg1 + 0;
			this.method665(local16, arg0);
			this.method590(arg0, local16);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt931; local28++) {
				local35 = this.anIntArray241[local28];
				if (this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local35].anInt191 != anInt917) {
					this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local35].aClass45_2 = null;
					this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local35] = null;
				}
			}
			if (arg0.anInt620 != local16) {
				signlink.reporterror(this.aString27 + " size mismatch in getnpcpos - pos:" + arg0.anInt620 + " psize:" + local16);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt840; local35++) {
				if (this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray215[local35]] == null) {
					signlink.reporterror(this.aString27 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt840);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("20937, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method722(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt1017 = 0;
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
						this.anInt1017 = 0;
						label49: for (local24 = 0; local24 < Class46.anInt746; local24++) {
							@Pc(73) Class46 local73 = Class46.method532(local24);
							if (local73.anInt758 == -1 && local73.aString16 != null) {
								@Pc(84) String local84 = local73.aString16.toLowerCase();
								for (@Pc(86) int local86 = 0; local86 < local20; local86++) {
									if (local84.indexOf(local18[local86]) == -1) {
										continue label49;
									}
								}
								this.aStringArray14[this.anInt1017] = local84;
								this.anIntArray266[this.anInt1017] = local24;
								this.anInt1017++;
								if (this.anInt1017 >= this.aStringArray14.length) {
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
			signlink.reporterror("39234, " + 0 + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method723() {
		try {
			@Pc(18) int local18;
			for (@Pc(10) int local10 = -1; local10 < this.anInt975; local10++) {
				if (local10 == -1) {
					local18 = this.anInt974;
				} else {
					local18 = this.anIntArray249[local10];
				}
				@Pc(30) Class8_Sub1_Sub1_Sub1_Sub1 local30 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local18];
				if (local30 != null && local30.anInt186 > 0) {
					local30.anInt186--;
					if (local30.anInt186 == 0) {
						local30.aString5 = null;
					}
				}
			}
			anInt838++;
			if (anInt838 > 61) {
				anInt838 = 0;
				this.aClass8_Sub1_Sub3_6.method395(138);
			}
			for (local18 = 0; local18 < this.anInt840; local18++) {
				@Pc(75) int local75 = this.anIntArray215[local18];
				@Pc(80) Class8_Sub1_Sub1_Sub1_Sub2 local80 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local75];
				if (local80 != null && local80.anInt186 > 0) {
					local80.anInt186--;
					if (local80.anInt186 == 0) {
						local80.aString5 = null;
					}
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("55011, " + 1041 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method724(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean242) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method714(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method725(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString19 = "";
				this.aString20 = "Connecting to server...";
				this.method629(true);
			}
			this.aClass19_1 = new Class19(this.method714(anInt1014 + 43594), this, true);
			@Pc(30) long local30 = Class28.method305(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass8_Sub1_Sub3_6.anInt620 = 0;
			this.aClass8_Sub1_Sub3_6.method396(14);
			this.aClass8_Sub1_Sub3_6.method396(local37);
			this.aClass19_1.method167(2, this.aClass8_Sub1_Sub3_6.aByteArray13);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass19_1.method164();
			}
			@Pc(74) int local74 = this.aClass19_1.method164();
			@Pc(76) int local76 = local74;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass19_1.method166(this.aClass8_Sub1_Sub3_9.aByteArray13, 0, 8);
				this.aClass8_Sub1_Sub3_9.anInt620 = 0;
				this.aLong33 = this.aClass8_Sub1_Sub3_9.method412();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong33 >> 32), (int) this.aLong33 };
				this.aClass8_Sub1_Sub3_6.anInt620 = 0;
				this.aClass8_Sub1_Sub3_6.method396(10);
				this.aClass8_Sub1_Sub3_6.method400(local99[0]);
				this.aClass8_Sub1_Sub3_6.method400(local99[1]);
				this.aClass8_Sub1_Sub3_6.method400(local99[2]);
				this.aClass8_Sub1_Sub3_6.method400(local99[3]);
				this.aClass8_Sub1_Sub3_6.method400(signlink.anInt1062);
				this.aClass8_Sub1_Sub3_6.method403(arg0);
				this.aClass8_Sub1_Sub3_6.method403(arg1);
				this.aClass8_Sub1_Sub3_6.method421(aBigInteger1, aBigInteger2, this.aBoolean245);
				this.aClass8_Sub1_Sub3_7.anInt620 = 0;
				if (arg2) {
					this.aClass8_Sub1_Sub3_7.method396(18);
				} else {
					this.aClass8_Sub1_Sub3_7.method396(16);
				}
				this.aClass8_Sub1_Sub3_7.method396(this.aClass8_Sub1_Sub3_6.anInt620 + 36 + 1 + 1 + 2);
				this.aClass8_Sub1_Sub3_7.method396(255);
				this.aClass8_Sub1_Sub3_7.method397(363);
				this.aClass8_Sub1_Sub3_7.method396(aBoolean236 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass8_Sub1_Sub3_7.method400(this.anIntArray246[local226]);
				}
				this.aClass8_Sub1_Sub3_7.method404(this.aClass8_Sub1_Sub3_6.anInt620, this.aClass8_Sub1_Sub3_6.aByteArray13);
				this.aClass8_Sub1_Sub3_6.aClass22_1 = new Class22(0, local99);
				for (local260 = 0; local260 < 4; local260++) {
					local99[local260] += 50;
				}
				this.aClass22_2 = new Class22(0, local99);
				this.aClass19_1.method167(this.aClass8_Sub1_Sub3_7.anInt620, this.aClass8_Sub1_Sub3_7.aByteArray13);
				local74 = this.aClass19_1.method164();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method725(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local74 == 2) {
					this.anInt926 = this.aClass19_1.method164();
					aBoolean222 = this.aClass19_1.method164() == 1;
					this.aLong31 = 0L;
					this.anInt998 = 0;
					this.aClass44_1.anInt708 = 0;
					super.aBoolean199 = true;
					this.aBoolean221 = true;
					this.aBoolean218 = true;
					this.aClass8_Sub1_Sub3_6.anInt620 = 0;
					this.aClass8_Sub1_Sub3_9.anInt620 = 0;
					this.anInt901 = -1;
					this.anInt880 = -1;
					this.anInt881 = -1;
					this.anInt882 = -1;
					this.anInt900 = 0;
					this.anInt902 = 0;
					this.anInt907 = 0;
					this.anInt904 = 0;
					this.anInt877 = 0;
					this.anInt994 = 0;
					this.aBoolean216 = false;
					super.anInt810 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray12[local390] = null;
					}
					this.anInt978 = 0;
					this.anInt982 = 0;
					this.anInt825 = 0;
					this.anInt844 = 0;
					this.anInt883 = (int) (Math.random() * 100.0D) - 50;
					this.anInt857 = (int) (Math.random() * 110.0D) - 55;
					this.anInt908 = (int) (Math.random() * 80.0D) - 40;
					this.anInt923 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1034 = (int) (Math.random() * 30.0D) - 20;
					this.anInt920 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1048 = 0;
					this.anInt1011 = -1;
					this.anInt939 = 0;
					this.anInt940 = 0;
					this.anInt975 = 0;
					this.anInt840 = 0;
					for (local226 = 0; local226 < this.anInt973; local226++) {
						this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local226] = null;
						this.aClass8_Sub1_Sub3Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local260] = null;
					}
					aClass8_Sub1_Sub1_Sub1_Sub1_1 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anInt974] = new Class8_Sub1_Sub1_Sub1_Sub1();
					this.aClass7_12.method36();
					this.aClass7_10.method36();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass7ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass7_11 = new Class7((byte) 1);
					this.anInt1047 = 0;
					this.anInt1046 = 0;
					this.method638(this.anInt1055);
					this.anInt1055 = -1;
					this.method638(this.anInt833);
					this.anInt833 = -1;
					this.method638(this.anInt827);
					this.anInt827 = -1;
					this.method638(this.anInt947);
					this.anInt947 = -1;
					this.method638(this.anInt1012);
					this.anInt1012 = -1;
					this.method638(this.anInt843);
					this.anInt843 = -1;
					this.method638(this.anInt831);
					this.anInt831 = -1;
					this.aBoolean237 = false;
					this.anInt966 = 3;
					this.anInt985 = 0;
					this.aBoolean216 = false;
					this.aBoolean240 = false;
					this.aString21 = null;
					this.anInt875 = 0;
					this.anInt864 = -1;
					this.aBoolean228 = true;
					this.method726(749);
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray220[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray9[local539] = null;
						this.aBooleanArray11[local539] = false;
					}
					anInt1005 = 0;
					anInt1033 = 0;
					anInt839 = 0;
					anInt972 = 0;
					anInt1056 = 0;
					anInt954 = 0;
					anInt941 = 0;
					anInt935 = 0;
					this.method641((byte) 7);
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
					this.aBoolean218 = true;
					this.aClass8_Sub1_Sub3_6.anInt620 = 0;
					this.aClass8_Sub1_Sub3_9.anInt620 = 0;
					this.anInt901 = -1;
					this.anInt880 = -1;
					this.anInt881 = -1;
					this.anInt882 = -1;
					this.anInt900 = 0;
					this.anInt902 = 0;
					this.anInt907 = 0;
					this.anInt994 = 0;
					this.aBoolean216 = false;
					this.aLong32 = System.currentTimeMillis();
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
					local390 = this.aClass19_1.method164();
					for (@Pc(918) int local918 = local390 + 3; local918 >= 0; local918--) {
						this.aString19 = "You have only just left another world";
						this.aString20 = "Your profile will be transferred in: " + local918;
						this.method629(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(940) Exception local940) {
						}
					}
					this.method725(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString19 = "Malformed login packet.";
					this.aString20 = "Please try again.";
				} else if (local74 == 23) {
					this.aString19 = "No reply from loginserver.";
					this.aString20 = "Please try again.";
				} else if (local74 == 24) {
					this.aString19 = "Error loading your profile.";
					this.aString20 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString19 = "Unexpected loginserver response.";
					this.aString20 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString19 = "This computers address has been blocked";
					this.aString20 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString19 = "Unexpected server response";
					this.aString20 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString19 = "No response from server";
					this.aString20 = "Please try using a different world.";
				} else if (this.anInt1054 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1012) Exception local1012) {
					}
					this.anInt1054++;
					this.method725(arg0, arg1, arg2);
				} else {
					this.aString19 = "No response from loginserver";
					this.aString20 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1055) IOException local1055) {
			this.aString19 = "";
			this.aString20 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method726(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			this.aBoolean214 = true;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray260[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class9.anInt160; local19++) {
					if (!Class9.aClass9Array1[local19].aBoolean28 && Class9.aClass9Array1[local19].anInt161 == local10 + (this.aBoolean228 ? 0 : 7)) {
						this.anIntArray260[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("70565, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method727() {
		try {
			if (this.anInt825 == 2) {
				for (@Pc(13) Class8_Sub3 local13 = (Class8_Sub3) this.aClass7_11.method32(); local13 != null; local13 = (Class8_Sub3) this.aClass7_11.method34()) {
					if (local13.anInt312 > 0) {
						local13.anInt312--;
					}
					if (local13.anInt312 != 0) {
						if (local13.anInt320 > 0) {
							local13.anInt320--;
						}
						if (local13.anInt320 == 0 && local13.anInt318 >= 1 && local13.anInt319 >= 1 && local13.anInt318 <= 102 && local13.anInt319 <= 102 && (local13.anInt309 < 0 || Class2.method18(local13.anInt309, local13.anInt311))) {
							this.method652(local13.anInt316, local13.anInt311, local13.anInt319, local13.anInt309, local13.anInt310, local13.anInt318, local13.anInt317);
							local13.anInt320 = -1;
							if (local13.anInt309 == local13.anInt313 && local13.anInt313 == -1) {
								local13.method546();
							} else if (local13.anInt309 == local13.anInt313 && local13.anInt310 == local13.anInt314 && local13.anInt311 == local13.anInt315) {
								local13.method546();
							}
						}
					} else if (local13.anInt313 < 0 || Class2.method18(local13.anInt313, local13.anInt315)) {
						this.method652(local13.anInt316, local13.anInt315, local13.anInt319, local13.anInt313, local13.anInt314, local13.anInt318, local13.anInt317);
						local13.method546();
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("64635, " + true + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean247) {
			this.method617();
		} else {
			super.run();
		}
	}
}
