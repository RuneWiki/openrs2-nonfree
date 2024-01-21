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

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private static int anInt834;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private static int anInt852;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	public static int anInt856;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	public static int anInt862;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
	private static boolean aBoolean250;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Z")
	private static boolean aBoolean251;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private static int anInt880;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private static int anInt890;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private static int anInt901;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Z")
	private static boolean aBoolean257;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private static int anInt904;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Z")
	private static boolean aBoolean258;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private static boolean aBoolean262;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private static int anInt923;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private static int anInt933;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private static int anInt962;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private static int anInt989;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private static int anInt990;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private static int anInt1004;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private static int anInt1005;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private static int anInt1027;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "Lclient!ZATRZGAA;")
	public static Class2_Sub1_Sub2_Sub3_Sub2 aClass2_Sub1_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private static int anInt1042;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private static int anInt815 = 475;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
	private static int[] anIntArray222 = new int[99];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[[I")
	public static final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private static int anInt861;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private static boolean aBoolean249;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private static int anInt874;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Ljava/lang/String;")
	private static String aString20;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private static int anInt913;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Z")
	private static boolean aBoolean266;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	public static final int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private static boolean aBoolean276;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private static int anInt1014;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!XQKSIEVT;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!XQKSIEVT;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!XQKSIEVT;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!XQKSIEVT;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_7;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_9;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_10;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_11;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_12;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_13;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_14;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_15;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!ZPFBNGWW;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!YJYHBEIS;")
	private Class44 aClass44_2;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_7;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_9;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_10;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Lclient!KMIIMWED;")
	private Class18_Sub1 aClass18_Sub1_1;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_11;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_12;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_13;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_14;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_15;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!MWZVGOTL;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_15;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!MAARFNGV;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!CLJPNHPC;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_18;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_19;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_20;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_16;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_17;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_16;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_17;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_18;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_19;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_20;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_21;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_22;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_23;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_24;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_25;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_26;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!XBLPPVAP;")
	private Class42 aClass42_27;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "[Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array5;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "Lclient!WTGHTNMN;")
	private Class41 aClass41_10 = new Class41(36113);

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt814 = 7085;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
	private int[] anIntArray212 = new int[9];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
	private int[] anIntArray213 = new int[Class50.anInt793];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt817 = -1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!QXTIWHBH;")
	private Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt819 = 3;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!EMWAMCXW;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_6 = Class2_Sub1_Sub3.method85();

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt823 = 2;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
	private int[] anIntArray214 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt825 = -485;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt828 = 1;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private int[] anIntArray215 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!EMWAMCXW;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_7 = Class2_Sub1_Sub3.method85();

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
	private int[] anIntArray216 = new int[Class50.anInt793];

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array2 = new Class2_Sub1_Sub1_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!EMWAMCXW;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_8 = new Class2_Sub1_Sub3(new byte[5000], true);

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[Lclient!RLTBSHTA;")
	private Class2_Sub1_Sub2_Sub3_Sub1[] aClass2_Sub1_Sub2_Sub3_Sub1Array1 = new Class2_Sub1_Sub2_Sub3_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray217 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray218 = new int[50];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
	private int[] anIntArray219 = new int[100];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray220 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt842 = -1;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
	private int[] anIntArray221 = new int[33];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array4 = new Class2_Sub1_Sub1_Sub3[1000];

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt849 = -1;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array5 = new Class2_Sub1_Sub1_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt850 = -1;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt851 = -814;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	private int[] anIntArray223 = new int[5];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!WTGHTNMN;")
	private Class41 aClass41_11 = new Class41(36113);

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[Lclient!YSPVLGYE;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
	private boolean aBoolean247 = true;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "B")
	private byte aByte31 = 2;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean248 = true;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array3 = new Class2_Sub1_Sub1_Sub1[2];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray228 = new int[1000];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray229 = new int[1000];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private final int anInt858 = 100;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray230 = new int[100];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array6 = new Class2_Sub1_Sub1_Sub3[20];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt863 = -1;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt865 = 1;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt866 = -1;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt867 = -1;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray231 = new int[200];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt870 = 2;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "B")
	private byte aByte32 = 4;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "B")
	private byte aByte33 = -7;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray235 = new int[7];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array7 = new Class2_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray236 = new int[256];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt879 = 50;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
	private int[] anIntArray237 = new int[this.anInt879];

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray238 = new int[this.anInt879];

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
	private int[] anIntArray239 = new int[this.anInt879];

	@OriginalMember(owner = "client!client", name = "be", descriptor = "[I")
	private int[] anIntArray240 = new int[this.anInt879];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[I")
	private int[] anIntArray241 = new int[this.anInt879];

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[I")
	private int[] anIntArray242 = new int[this.anInt879];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private int[] anIntArray243 = new int[this.anInt879];

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[this.anInt879];

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	public int[] anIntArray244 = new int[2000];

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt882 = 655;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt884 = -892;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Z")
	private boolean aBoolean254 = true;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt889 = 135;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[500];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt891 = -1;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt895 = 5063219;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt896 = 2048;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt897 = 2047;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[Lclient!ZATRZGAA;")
	private Class2_Sub1_Sub2_Sub3_Sub2[] aClass2_Sub1_Sub2_Sub3_Sub2Array1 = new Class2_Sub1_Sub2_Sub3_Sub2[this.anInt896];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
	private int[] anIntArray245 = new int[this.anInt896];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray246 = new int[this.anInt896];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[Lclient!EMWAMCXW;")
	private Class2_Sub1_Sub3[] aClass2_Sub1_Sub3Array1 = new Class2_Sub1_Sub3[this.anInt896];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt903 = 3353893;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt906 = 2;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt911 = -580;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt915 = 243;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt916 = 603;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray248 = new int[50];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[I")
	private int[] anIntArray249 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
	private volatile boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt924 = 128;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt930 = 78;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt931 = 7759444;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Z")
	private boolean aBoolean263 = true;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt934 = 5;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt939 = -224;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt940 = -1;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
	private volatile boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray256 = new int[Class50.anInt793];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt948 = -1;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt949 = -1;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[[[Lclient!WTGHTNMN;")
	private Class41[][][] aClass41ArrayArrayArray1 = new Class41[4][104][104];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array8 = new Class2_Sub1_Sub1_Sub3[8];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!EMWAMCXW;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_9 = Class2_Sub1_Sub3.method85();

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	private int[] anIntArray258 = new int[151];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt967 = -6771;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
	private boolean aBoolean270 = true;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	public boolean aBoolean271 = false;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt969 = -1;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
	private boolean aBoolean272 = false;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[I")
	private int[] anIntArray259 = new int[5];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array9 = new Class2_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[Lclient!CAMRNFMB;")
	private Class5[] aClass5Array1 = new Class5[4];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[Lclient!CMELCUKG;")
	private Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array4 = new Class2_Sub1_Sub1_Sub1[13];

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "B")
	private byte aByte34 = -109;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray260 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private boolean aBoolean273 = false;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
	private int[] anIntArray261 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray262 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt986 = -351;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt987 = 2301979;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
	private int[] anIntArray263 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray264 = new int[500];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	private int[] anIntArray265 = new int[500];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
	private int[] anIntArray266 = new int[500];

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
	private int[] anIntArray267 = new int[500];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
	private int[] anIntArray268 = new int[50];

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
	private int[] anIntArray269 = new int[151];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
	private boolean aBoolean277 = false;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt991 = -1;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt992 = 250;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
	private volatile boolean aBoolean278 = false;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
	private int[] anIntArray270 = new int[100];

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1000 = 3;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1003 = -1;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Z")
	private boolean aBoolean280 = true;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Z")
	private boolean aBoolean281 = false;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1007 = -1;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
	private int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1013 = 2;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Z")
	private boolean aBoolean282 = false;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1025 = -1;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "B")
	private byte aByte35 = -18;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[Lclient!TFHGRYAS;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array10 = new Class2_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	private int[] anIntArray274 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
	private int[] anIntArray275 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!WTGHTNMN;")
	private Class41 aClass41_12 = new Class41(36113);

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Z")
	private boolean aBoolean283 = true;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1035 = -205;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[I")
	private final int[] anIntArray276 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1039 = 839;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "Z")
	private boolean aBoolean285 = false;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1043 = 8;

	static {
		@Pc(6) int local6 = 0;
		@Pc(8) int local8;
		for (local8 = 0; local8 < 99; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) ((double) local13 + Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D);
			local6 += local26;
			anIntArray222[local8] = local6 / 4;
		}
		anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt861 = 10;
		aBoolean249 = true;
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt874 = 43360;
		aString20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray247 = new int[32];
		local6 = 2;
		for (local8 = 0; local8 < 32; local8++) {
			anIntArray247[local8] = local6 - 1;
			local6 += local6;
		}
		anInt913 = -24958;
		aBoolean266 = true;
		anIntArray257 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBoolean276 = true;
		anInt1014 = 16822;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	private static String method604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("50213, " + arg0 + ", " + arg1 + ", " + true + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method613(@OriginalArg(0) int arg0) {
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
			signlink.reporterror("91587, " + arg0 + ", " + 2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private static void method623(@OriginalArg(0) int arg0) {
		try {
			Class47.aBoolean228 = true;
			if (arg0 != 16822) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			Class2_Sub1_Sub1_Sub2.aBoolean125 = true;
			aBoolean250 = true;
			Class34.aBoolean164 = true;
			Class1.aBoolean10 = true;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("54052, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 364);
			if (arg0.length == 5) {
				anInt861 = Integer.parseInt(arg0[0]);
				anInt862 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method623(anInt1014);
				} else if (arg0[2].equals("highmem")) {
					method683();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean249 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean249 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1046 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private static void method683() {
		try {
			Class47.aBoolean228 = false;
			Class2_Sub1_Sub1_Sub2.aBoolean125 = false;
			aBoolean250 = false;
			Class34.aBoolean164 = false;
			Class1.aBoolean10 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("28165, " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private static String method716(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("94818, " + 6 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method589(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7 = this.aClass2_Sub1_Sub1_Sub4_4.method446("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt937; local9++) {
				local20 = this.aClass2_Sub1_Sub1_Sub4_4.method446(this.aStringArray12[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt937 * 15 + 21;
			@Pc(42) int local42 = 35 / arg0;
			@Pc(67) int local67;
			@Pc(85) int local85;
			if (super.anInt809 > 4 && super.anInt810 > 4 && super.anInt809 < 516 && super.anInt810 < 338) {
				local67 = super.anInt809 - local7 / 2 - 4;
				if (local67 + local7 > 512) {
					local67 = 512 - local7;
				}
				if (local67 < 0) {
					local67 = 0;
				}
				local85 = super.anInt810 - 4;
				if (local85 + local20 > 334) {
					local85 = 334 - local20;
				}
				if (local85 < 0) {
					local85 = 0;
				}
				this.aBoolean241 = true;
				this.anInt843 = 0;
				this.anInt844 = local67;
				this.anInt845 = local85;
				this.anInt846 = local7;
				this.anInt847 = this.anInt937 * 15 + 22;
			}
			if (super.anInt809 > 553 && super.anInt810 > 205 && super.anInt809 < 743 && super.anInt810 < 466) {
				local67 = super.anInt809 - local7 / 2 - 553;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 190) {
					local67 = 190 - local7;
				}
				local85 = super.anInt810 - 205;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 261) {
					local85 = 261 - local20;
				}
				this.aBoolean241 = true;
				this.anInt843 = 1;
				this.anInt844 = local67;
				this.anInt845 = local85;
				this.anInt846 = local7;
				this.anInt847 = this.anInt937 * 15 + 22;
			}
			if (super.anInt809 > 17 && super.anInt810 > 357 && super.anInt809 < 496 && super.anInt810 < 453) {
				local67 = super.anInt809 - local7 / 2 - 17;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 479) {
					local67 = 479 - local7;
				}
				local85 = super.anInt810 - 357;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 96) {
					local85 = 96 - local20;
				}
				this.aBoolean241 = true;
				this.anInt843 = 2;
				this.anInt844 = local67;
				this.anInt845 = local85;
				this.anInt846 = local7;
				this.anInt847 = this.anInt937 * 15 + 22;
			}
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("13683, " + arg0 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!ZATRZGAA;ILclient!EMWAMCXW;)V")
	private void method590(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub3 arg3) {
		try {
			@Pc(20) int local20;
			@Pc(24) int local24;
			if ((arg2 & 0x80) != 0) {
				local20 = arg3.method118();
				local24 = arg3.method116();
				arg1.method471(local20, local24, anInt856);
				arg1.anInt668 = anInt856 + 300;
				arg1.anInt669 = arg3.method117();
				arg1.anInt670 = arg3.method116();
			}
			if ((arg2 & 0x40) != 0) {
				arg1.anInt703 = arg3.method125();
				arg1.anInt704 = arg3.method125();
			}
			if ((arg2 & 0x20) != 0) {
				arg1.aString14 = arg3.method104();
				if (arg1.aString14.charAt(0) == '~') {
					arg1.aString14 = arg1.aString14.substring(1);
					this.method626(arg1.aString14, 2, arg1.aString15);
				} else if (arg1 == aClass2_Sub1_Sub2_Sub3_Sub2_1) {
					this.method626(arg1.aString14, 2, arg1.aString15);
				}
				arg1.anInt691 = 0;
				arg1.anInt682 = 0;
				arg1.anInt674 = 150;
			}
			@Pc(138) int local138;
			if ((arg2 & 0x2) != 0) {
				local20 = arg3.method126();
				if (local20 == 65535) {
					local20 = -1;
				}
				local24 = arg3.method118();
				if (local20 == arg1.anInt684 && local20 != -1) {
					local138 = Class39.aClass39Array1[local20].anInt593;
					if (local138 == 1) {
						arg1.anInt685 = 0;
						arg1.anInt686 = 0;
						arg1.anInt687 = local24;
						arg1.anInt688 = 0;
					}
					if (local138 == 2) {
						arg1.anInt688 = 0;
					}
				} else if (local20 == -1 || arg1.anInt684 == -1 || Class39.aClass39Array1[local20].anInt587 >= Class39.aClass39Array1[arg1.anInt684].anInt587) {
					arg1.anInt684 = local20;
					arg1.anInt685 = 0;
					arg1.anInt686 = 0;
					arg1.anInt687 = local24;
					arg1.anInt688 = 0;
					arg1.anInt671 = arg1.anInt689;
				}
			}
			if ((arg2 & 0x10) != 0) {
				local20 = arg3.method97();
				@Pc(207) byte[] local207 = new byte[local20];
				@Pc(213) Class2_Sub1_Sub3 local213 = new Class2_Sub1_Sub3(local207, true);
				arg3.method135(local207, local20);
				this.aClass2_Sub1_Sub3Array1[arg0] = local213;
				arg1.method476(local213);
			}
			if ((arg2 & 0x200) != 0) {
				local20 = arg3.method118();
				local24 = arg3.method116();
				arg1.method471(local20, local24, anInt856);
				arg1.anInt668 = anInt856 + 300;
				arg1.anInt669 = arg3.method116();
				arg1.anInt670 = arg3.method118();
			}
			if ((arg2 & 0x8) != 0) {
				local20 = arg3.method127();
				local24 = arg3.method116();
				local138 = arg3.method117();
				@Pc(280) int local280 = arg3.anInt136;
				if (arg1.aString15 != null && arg1.aBoolean219) {
					@Pc(290) long local290 = Class40.method405(arg1.aString15);
					@Pc(292) boolean local292 = false;
					if (local24 <= 1) {
						for (@Pc(297) int local297 = 0; local297 < this.anInt1011; local297++) {
							if (this.aLongArray3[local297] == local290) {
								local292 = true;
								break;
							}
						}
					}
					if (!local292 && this.anInt871 == 0) {
						try {
							this.aClass2_Sub1_Sub3_8.anInt136 = 0;
							arg3.method106(this.aClass2_Sub1_Sub3_8.aByteArray10, local138);
							this.aClass2_Sub1_Sub3_8.anInt136 = 0;
							@Pc(342) String local342 = Class11.method136(this.aClass2_Sub1_Sub3_8, local138, 905);
							@Pc(346) String local346 = Class48.method548(local342);
							arg1.aString14 = local346;
							arg1.anInt691 = local20 >> 8;
							arg1.anInt682 = local20 & 0xFF;
							arg1.anInt674 = 150;
							if (local24 == 2 || local24 == 3) {
								this.method626(local346, 1, "@cr2@" + arg1.aString15);
							} else if (local24 == 1) {
								this.method626(local346, 1, "@cr1@" + arg1.aString15);
							} else {
								this.method626(local346, 2, arg1.aString15);
							}
						} catch (@Pc(410) Exception local410) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt136 = local280 + local138;
			}
			if ((arg2 & 0x100) != 0) {
				arg1.anInt696 = arg3.method118();
				arg1.anInt698 = arg3.method97();
				arg1.anInt697 = arg3.method118();
				arg1.anInt699 = arg3.method116();
				arg1.anInt700 = arg3.method127() + anInt856;
				arg1.anInt701 = arg3.method127() + anInt856;
				arg1.anInt702 = arg3.method97();
				arg1.method472();
			}
			if ((arg2 & 0x1) != 0) {
				arg1.anInt683 = arg3.method126();
				if (arg1.anInt683 == 65535) {
					arg1.anInt683 = -1;
				}
			}
			if ((arg2 & 0x400) != 0) {
				arg1.anInt663 = arg3.method125();
				local20 = arg3.method102();
				arg1.anInt667 = local20 >> 16;
				arg1.anInt666 = anInt856 + (local20 & 0xFFFF);
				arg1.anInt664 = 0;
				arg1.anInt665 = 0;
				if (arg1.anInt666 > anInt856) {
					arg1.anInt664 = -1;
				}
				if (arg1.anInt663 == 65535) {
					arg1.anInt663 = -1;
					return;
				}
			}
		} catch (@Pc(524) RuntimeException local524) {
			signlink.reporterror("50384, " + arg0 + ", " + 71 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local524.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method591(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt848 == 2) {
				this.method665(this.anInt952 * 2, (this.anInt951 - this.anInt908 << 7) + this.anInt954, (this.anInt950 - this.anInt907 << 7) + this.anInt953);
				this.anInt975 += arg0;
				if (this.anInt948 > -1 && anInt856 % 20 < 10) {
					this.aClass2_Sub1_Sub1_Sub3Array9[0].method360(this.anInt948 - 12, this.anInt949 - 28);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("46039, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method592(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt1040++;
			this.method637(this.aBoolean245, true);
			this.method705(true);
			this.method637(this.aBoolean245, false);
			this.method705(false);
			this.method601();
			this.method630();
			@Pc(37) int local37;
			@Pc(76) int local76;
			if (!this.aBoolean255) {
				local37 = this.anInt924;
				if (this.anInt1030 / 256 > local37) {
					local37 = this.anInt1030 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray223[4] + 128 > local37) {
					local37 = this.anIntArray223[4] + 128;
				}
				local76 = this.anInt925 + this.anInt827 & 0x7FF;
				this.method633(local37 * 3 + 600, this.anInt944, local37, this.method657(this.anInt1028, aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679, aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680) - 50, local76, this.anInt945);
			}
			if (this.aBoolean255) {
				local37 = this.method678();
			} else {
				local37 = this.method677();
			}
			local76 = this.anInt1015;
			@Pc(120) int local120 = this.anInt1016;
			@Pc(123) int local123 = this.anInt1017;
			@Pc(126) int local126 = this.anInt1018;
			@Pc(129) int local129 = this.anInt1019;
			@Pc(178) int local178;
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				if (this.aBooleanArray12[local131]) {
					local178 = (int) (Math.random() * (double) (this.anIntArray259[local131] * 2 + 1) - (double) this.anIntArray259[local131] + Math.sin((double) this.anIntArray273[local131] * ((double) this.anIntArray275[local131] / 100.0D)) * (double) this.anIntArray223[local131]);
					if (local131 == 0) {
						this.anInt1015 += local178;
					}
					if (local131 == 1) {
						this.anInt1016 += local178;
					}
					if (local131 == 2) {
						this.anInt1017 += local178;
					}
					if (local131 == 3) {
						this.anInt1019 = this.anInt1019 + local178 & 0x7FF;
					}
					if (local131 == 4) {
						this.anInt1018 += local178;
						if (this.anInt1018 < 128) {
							this.anInt1018 = 128;
						}
						if (this.anInt1018 > 383) {
							this.anInt1018 = 383;
						}
					}
				}
			}
			local178 = Class2_Sub1_Sub1_Sub2.anInt339;
			Class2_Sub1_Sub2_Sub2.aBoolean81 = true;
			Class2_Sub1_Sub2_Sub2.anInt170 = 0;
			Class2_Sub1_Sub2_Sub2.anInt168 = super.anInt803 - 4;
			Class2_Sub1_Sub2_Sub2.anInt169 = super.anInt804 - 4;
			Class2_Sub1_Sub1.method434();
			this.aClass47_1.method526(this.anInt1019, this.anInt1017, this.anInt1018, local37, this.anInt1015, this.anInt1016);
			this.aBoolean271 &= arg0;
			this.aClass47_1.method501();
			this.method647();
			this.method591(this.anInt956);
			this.method602(local178);
			this.method638();
			this.aClass42_14.method426(4, 4, super.aGraphics2);
			this.anInt1015 = local76;
			this.anInt1016 = local120;
			this.anInt1017 = local123;
			this.anInt1018 = local126;
			this.anInt1019 = local129;
		} catch (@Pc(324) RuntimeException local324) {
			signlink.reporterror("18888, " + arg0 + ", " + local324.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method593() {
		try {
			if (this.anInt830 == 0 && this.anInt820 == 0) {
				this.aStringArray12[this.anInt937] = "Walk here";
				this.anIntArray266[this.anInt937] = 269;
				this.anIntArray264[this.anInt937] = super.anInt803;
				this.anIntArray265[this.anInt937] = super.anInt804;
				this.anInt937++;
			}
			@Pc(41) int local41 = -1;
			this.anInt975 += 0;
			for (@Pc(49) int local49 = 0; local49 < Class2_Sub1_Sub2_Sub2.anInt170; local49++) {
				@Pc(55) int local55 = Class2_Sub1_Sub2_Sub2.anIntArray72[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(224) int local224;
					if (local71 == 2 && this.aClass47_1.method517(this.anInt1028, local59, local65, local55) >= 0) {
						@Pc(97) Class1 local97 = Class1.method4(local77);
						if (local97.anIntArray2 != null) {
							local97 = local97.method2();
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt830 == 1) {
							this.aStringArray12[this.anInt937] = "Use " + this.aString18 + " with @cya@" + local97.aString1;
							this.anIntArray266[this.anInt937] = 871;
							this.anIntArray267[this.anInt937] = local55;
							this.anIntArray264[this.anInt937] = local59;
							this.anIntArray265[this.anInt937] = local65;
							this.anInt937++;
						} else if (this.anInt820 != 1) {
							if (local97.aStringArray1 != null) {
								for (local224 = 4; local224 >= 0; local224--) {
									if (local97.aStringArray1[local224] != null) {
										this.aStringArray12[this.anInt937] = local97.aStringArray1[local224] + " @cya@" + local97.aString1;
										if (local224 == 0) {
											this.anIntArray266[this.anInt937] = 242;
										}
										if (local224 == 1) {
											this.anIntArray266[this.anInt937] = 721;
										}
										if (local224 == 2) {
											this.anIntArray266[this.anInt937] = 617;
										}
										if (local224 == 3) {
											this.anIntArray266[this.anInt937] = 846;
										}
										if (local224 == 4) {
											this.anIntArray266[this.anInt937] = 1299;
										}
										this.anIntArray267[this.anInt937] = local55;
										this.anIntArray264[this.anInt937] = local59;
										this.anIntArray265[this.anInt937] = local65;
										this.anInt937++;
									}
								}
							}
							this.aStringArray12[this.anInt937] = "Examine @cya@" + local97.aString1;
							this.anIntArray266[this.anInt937] = 1263;
							this.anIntArray267[this.anInt937] = local97.anInt11 << 14;
							this.anIntArray264[this.anInt937] = local59;
							this.anIntArray265[this.anInt937] = local65;
							this.anInt937++;
						} else if ((this.anInt822 & 0x4) == 4) {
							this.aStringArray12[this.anInt937] = this.aString17 + " @cya@" + local97.aString1;
							this.anIntArray266[this.anInt937] = 82;
							this.anIntArray267[this.anInt937] = local55;
							this.anIntArray264[this.anInt937] = local59;
							this.anIntArray265[this.anInt937] = local65;
							this.anInt937++;
						}
					}
					@Pc(404) Class2_Sub1_Sub2_Sub3_Sub1 local404;
					@Pc(452) Class2_Sub1_Sub2_Sub3_Sub2 local452;
					@Pc(442) int local442;
					if (local71 == 1) {
						@Pc(375) Class2_Sub1_Sub2_Sub3_Sub1 local375 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local77];
						if (local375.aClass46_1.aByte27 == 1 && (local375.anInt679 & 0x7F) == 64 && (local375.anInt680 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt829; local224++) {
								local404 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray217[local224]];
								if (local404 != null && local404 != local375 && local404.aClass46_1.aByte27 == 1 && local404.anInt679 == local375.anInt679 && local404.anInt680 == local375.anInt680) {
									this.method612(local59, local404.aClass46_1, 116, this.anIntArray217[local224], local65);
								}
							}
							for (local442 = 0; local442 < this.anInt898; local442++) {
								local452 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray245[local442]];
								if (local452 != null && local452.anInt679 == local375.anInt679 && local452.anInt680 == local375.anInt680) {
									this.method597(this.anIntArray245[local442], local452, local59, local65);
								}
							}
						}
						this.method612(local59, local375.aClass46_1, 116, local77, local65);
					}
					if (local71 == 0) {
						@Pc(494) Class2_Sub1_Sub2_Sub3_Sub2 local494 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local77];
						if ((local494.anInt679 & 0x7F) == 64 && (local494.anInt680 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt829; local224++) {
								local404 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray217[local224]];
								if (local404 != null && local404.aClass46_1.aByte27 == 1 && local404.anInt679 == local494.anInt679 && local404.anInt680 == local494.anInt680) {
									this.method612(local59, local404.aClass46_1, 116, this.anIntArray217[local224], local65);
								}
							}
							for (local442 = 0; local442 < this.anInt898; local442++) {
								local452 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray245[local442]];
								if (local452 != null && local452 != local494 && local452.anInt679 == local494.anInt679 && local452.anInt680 == local494.anInt680) {
									this.method597(this.anIntArray245[local442], local452, local59, local65);
								}
							}
						}
						this.method597(local77, local494, local59, local65);
					}
					if (local71 == 3) {
						@Pc(613) Class41 local613 = this.aClass41ArrayArrayArray1[this.anInt1028][local59][local65];
						if (local613 != null) {
							for (@Pc(620) Class2_Sub1_Sub2_Sub1 local620 = (Class2_Sub1_Sub2_Sub1) local613.method415(); local620 != null; local620 = (Class2_Sub1_Sub2_Sub1) local613.method417()) {
								@Pc(626) Class38 local626 = Class38.method391(local620.anInt69);
								if (this.anInt830 == 1) {
									this.aStringArray12[this.anInt937] = "Use " + this.aString18 + " with @lre@" + local626.aString13;
									this.anIntArray266[this.anInt937] = 146;
									this.anIntArray267[this.anInt937] = local620.anInt69;
									this.anIntArray264[this.anInt937] = local59;
									this.anIntArray265[this.anInt937] = local65;
									this.anInt937++;
								} else if (this.anInt820 != 1) {
									for (@Pc(743) int local743 = 4; local743 >= 0; local743--) {
										if (local626.aStringArray4 != null && local626.aStringArray4[local743] != null) {
											this.aStringArray12[this.anInt937] = local626.aStringArray4[local743] + " @lre@" + local626.aString13;
											if (local743 == 0) {
												this.anIntArray266[this.anInt937] = 278;
											}
											if (local743 == 1) {
												this.anIntArray266[this.anInt937] = 416;
											}
											if (local743 == 2) {
												this.anIntArray266[this.anInt937] = 740;
											}
											if (local743 == 3) {
												this.anIntArray266[this.anInt937] = 880;
											}
											if (local743 == 4) {
												this.anIntArray266[this.anInt937] = 609;
											}
											this.anIntArray267[this.anInt937] = local620.anInt69;
											this.anIntArray264[this.anInt937] = local59;
											this.anIntArray265[this.anInt937] = local65;
											this.anInt937++;
										} else if (local743 == 2) {
											this.aStringArray12[this.anInt937] = "Take @lre@" + local626.aString13;
											this.anIntArray266[this.anInt937] = 740;
											this.anIntArray267[this.anInt937] = local620.anInt69;
											this.anIntArray264[this.anInt937] = local59;
											this.anIntArray265[this.anInt937] = local65;
											this.anInt937++;
										}
									}
									this.aStringArray12[this.anInt937] = "Examine @lre@" + local626.aString13;
									this.anIntArray266[this.anInt937] = 1069;
									this.anIntArray267[this.anInt937] = local620.anInt69;
									this.anIntArray264[this.anInt937] = local59;
									this.anIntArray265[this.anInt937] = local65;
									this.anInt937++;
								} else if ((this.anInt822 & 0x1) == 1) {
									this.aStringArray12[this.anInt937] = this.aString17 + " @lre@" + local626.aString13;
									this.anIntArray266[this.anInt937] = 399;
									this.anIntArray267[this.anInt937] = local620.anInt69;
									this.anIntArray264[this.anInt937] = local59;
									this.anIntArray265[this.anInt937] = local65;
									this.anInt937++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("54447, " + 0 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method594() {
		try {
			Class1.aClass4_1.method39();
			Class1.aClass4_2.method39();
			Class46.aClass4_9.method39();
			Class38.aClass4_7.method39();
			Class38.aClass4_6.method39();
			Class2_Sub1_Sub2_Sub3_Sub2.aClass4_8.method39();
			Class33.aClass4_5.method39();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("3265, " + 42 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QXTIWHBH;IIIIII)V")
	private void method595(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg1.anInt397 == 0 && arg1.anIntArray137 != null && !arg1.aBoolean151 && (arg4 >= arg2 && arg6 >= arg3 && arg4 <= arg2 + arg1.anInt409 && arg6 <= arg3 + arg1.anInt387)) {
				@Pc(34) int local34 = arg1.anIntArray137.length;
				for (@Pc(45) int local45 = 0; local45 < local34; local45++) {
					@Pc(54) int local54 = arg1.anIntArray135[local45] + arg2;
					@Pc(63) int local63 = arg1.anIntArray132[local45] + arg3 - arg0;
					@Pc(69) Class31 local69 = Class31.method293(arg1.anIntArray137[local45]);
					@Pc(74) int local74 = local54 + local69.anInt410;
					@Pc(79) int local79 = local63 + local69.anInt376;
					if ((local69.anInt399 >= 0 || local69.anInt378 != 0) && arg4 >= local74 && arg6 >= local79 && arg4 < local74 + local69.anInt409 && arg6 < local79 + local69.anInt387) {
						if (local69.anInt399 >= 0) {
							this.anInt932 = local69.anInt399;
						} else {
							this.anInt932 = local69.anInt385;
						}
					}
					if (local69.anInt397 == 8 && arg4 >= local74 && arg6 >= local79 && arg4 < local74 + local69.anInt409 && arg6 < local79 + local69.anInt387) {
						this.anInt966 = local69.anInt385;
					}
					if (local69.anInt397 == 0) {
						this.method595(local69.anInt383, local69, local74, local79, arg4, arg5, arg6);
						if (local69.anInt384 > local69.anInt387) {
							this.method598(arg6, local69.anInt384, local69, arg4, local79, local74 + local69.anInt409, local69.anInt387, arg5);
						}
					} else {
						if (local69.anInt395 == 1 && arg4 >= local74 && arg6 >= local79 && arg4 < local74 + local69.anInt409 && arg6 < local79 + local69.anInt387) {
							@Pc(203) boolean local203 = false;
							if (local69.anInt405 != 0) {
								local203 = this.method632(local69);
							}
							if (!local203) {
								this.aStringArray12[this.anInt937] = local69.aString6;
								this.anIntArray266[this.anInt937] = 997;
								this.anIntArray265[this.anInt937] = local69.anInt385;
								this.anInt937++;
							}
						}
						if (local69.anInt395 == 2 && this.anInt820 == 0 && arg4 >= local74 && arg6 >= local79 && arg4 < local74 + local69.anInt409 && arg6 < local79 + local69.anInt387) {
							@Pc(267) String local267 = local69.aString7;
							if (local267.indexOf(" ") != -1) {
								local267 = local267.substring(0, local267.indexOf(" "));
							}
							this.aStringArray12[this.anInt937] = local267 + " @gre@" + local69.aString9;
							this.anIntArray266[this.anInt937] = 632;
							this.anIntArray265[this.anInt937] = local69.anInt385;
							this.anInt937++;
						}
						if (local69.anInt395 == 3 && arg4 >= local74 && arg6 >= local79 && arg4 < local74 + local69.anInt409 && arg6 < local79 + local69.anInt387) {
							this.aStringArray12[this.anInt937] = "Close";
							if (arg5 == 3) {
								this.anIntArray266[this.anInt937] = 736;
							} else {
								this.anIntArray266[this.anInt937] = 543;
							}
							this.anIntArray265[this.anInt937] = local69.anInt385;
							this.anInt937++;
						}
						if (local69.anInt395 == 4 && arg4 >= local74 && arg6 >= local79 && arg4 < local74 + local69.anInt409 && arg6 < local79 + local69.anInt387) {
							this.aStringArray12[this.anInt937] = local69.aString6;
							this.anIntArray266[this.anInt937] = 405;
							this.anIntArray265[this.anInt937] = local69.anInt385;
							this.anInt937++;
						}
						if (local69.anInt395 == 5 && arg4 >= local74 && arg6 >= local79 && arg4 < local74 + local69.anInt409 && arg6 < local79 + local69.anInt387) {
							this.aStringArray12[this.anInt937] = local69.aString6;
							this.anIntArray266[this.anInt937] = 324;
							this.anIntArray265[this.anInt937] = local69.anInt385;
							this.anInt937++;
						}
						if (local69.anInt395 == 6 && !this.aBoolean281 && arg4 >= local74 && arg6 >= local79 && arg4 < local74 + local69.anInt409 && arg6 < local79 + local69.anInt387) {
							this.aStringArray12[this.anInt937] = local69.aString6;
							this.anIntArray266[this.anInt937] = 22;
							this.anIntArray265[this.anInt937] = local69.anInt385;
							this.anInt937++;
						}
						if (local69.anInt397 == 2) {
							@Pc(526) int local526 = 0;
							for (@Pc(528) int local528 = 0; local528 < local69.anInt387; local528++) {
								for (@Pc(532) int local532 = 0; local532 < local69.anInt409; local532++) {
									@Pc(543) int local543 = local74 + local532 * (local69.anInt377 + 32);
									@Pc(552) int local552 = local79 + local528 * (local69.anInt375 + 32);
									if (local526 < 20) {
										local543 += local69.anIntArray136[local526];
										local552 += local69.anIntArray131[local526];
									}
									if (arg4 >= local543 && arg6 >= local552 && arg4 < local543 + 32 && arg6 < local552 + 32) {
										this.anInt963 = local526;
										this.anInt964 = local69.anInt385;
										if (local69.anIntArray138[local526] > 0) {
											@Pc(605) Class38 local605 = Class38.method391(local69.anIntArray138[local526] - 1);
											if (this.anInt830 == 1 && local69.aBoolean147) {
												if (local69.anInt385 != this.anInt832 || local526 != this.anInt831) {
													this.aStringArray12[this.anInt937] = "Use " + this.aString18 + " with @lre@" + local605.aString13;
													this.anIntArray266[this.anInt937] = 335;
													this.anIntArray267[this.anInt937] = local605.anInt559;
													this.anIntArray264[this.anInt937] = local526;
													this.anIntArray265[this.anInt937] = local69.anInt385;
													this.anInt937++;
												}
											} else if (this.anInt820 != 1 || !local69.aBoolean147) {
												@Pc(742) int local742;
												if (local69.aBoolean147) {
													for (local742 = 4; local742 >= 3; local742--) {
														if (local605.aStringArray3 != null && local605.aStringArray3[local742] != null) {
															this.aStringArray12[this.anInt937] = local605.aStringArray3[local742] + " @lre@" + local605.aString13;
															if (local742 == 3) {
																this.anIntArray266[this.anInt937] = 394;
															}
															if (local742 == 4) {
																this.anIntArray266[this.anInt937] = 913;
															}
															this.anIntArray267[this.anInt937] = local605.anInt559;
															this.anIntArray264[this.anInt937] = local526;
															this.anIntArray265[this.anInt937] = local69.anInt385;
															this.anInt937++;
														} else if (local742 == 4) {
															this.aStringArray12[this.anInt937] = "Drop @lre@" + local605.aString13;
															this.anIntArray266[this.anInt937] = 913;
															this.anIntArray267[this.anInt937] = local605.anInt559;
															this.anIntArray264[this.anInt937] = local526;
															this.anIntArray265[this.anInt937] = local69.anInt385;
															this.anInt937++;
														}
													}
												}
												if (local69.aBoolean145) {
													this.aStringArray12[this.anInt937] = "Use @lre@" + local605.aString13;
													this.anIntArray266[this.anInt937] = 850;
													this.anIntArray267[this.anInt937] = local605.anInt559;
													this.anIntArray264[this.anInt937] = local526;
													this.anIntArray265[this.anInt937] = local69.anInt385;
													this.anInt937++;
												}
												if (local69.aBoolean147 && local605.aStringArray3 != null) {
													for (local742 = 2; local742 >= 0; local742--) {
														if (local605.aStringArray3[local742] != null) {
															this.aStringArray12[this.anInt937] = local605.aStringArray3[local742] + " @lre@" + local605.aString13;
															if (local742 == 0) {
																this.anIntArray266[this.anInt937] = 446;
															}
															if (local742 == 1) {
																this.anIntArray266[this.anInt937] = 286;
															}
															if (local742 == 2) {
																this.anIntArray266[this.anInt937] = 210;
															}
															this.anIntArray267[this.anInt937] = local605.anInt559;
															this.anIntArray264[this.anInt937] = local526;
															this.anIntArray265[this.anInt937] = local69.anInt385;
															this.anInt937++;
														}
													}
												}
												if (local69.aStringArray2 != null) {
													for (local742 = 4; local742 >= 0; local742--) {
														if (local69.aStringArray2[local742] != null) {
															this.aStringArray12[this.anInt937] = local69.aStringArray2[local742] + " @lre@" + local605.aString13;
															if (local742 == 0) {
																this.anIntArray266[this.anInt937] = 746;
															}
															if (local742 == 1) {
																this.anIntArray266[this.anInt937] = 4;
															}
															if (local742 == 2) {
																this.anIntArray266[this.anInt937] = 253;
															}
															if (local742 == 3) {
																this.anIntArray266[this.anInt937] = 534;
															}
															if (local742 == 4) {
																this.anIntArray266[this.anInt937] = 930;
															}
															this.anIntArray267[this.anInt937] = local605.anInt559;
															this.anIntArray264[this.anInt937] = local526;
															this.anIntArray265[this.anInt937] = local69.anInt385;
															this.anInt937++;
														}
													}
												}
												this.aStringArray12[this.anInt937] = "Examine @lre@" + local605.aString13;
												this.anIntArray266[this.anInt937] = 1217;
												this.anIntArray267[this.anInt937] = local605.anInt559;
												this.anIntArray264[this.anInt937] = local526;
												this.anIntArray265[this.anInt937] = local69.anInt385;
												this.anInt937++;
											} else if ((this.anInt822 & 0x10) == 16) {
												this.aStringArray12[this.anInt937] = this.aString17 + " @lre@" + local605.aString13;
												this.anIntArray266[this.anInt937] = 864;
												this.anIntArray267[this.anInt937] = local605.anInt559;
												this.anIntArray264[this.anInt937] = local526;
												this.anIntArray265[this.anInt937] = local69.anInt385;
												this.anInt937++;
											}
										}
									}
									local526++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1172) RuntimeException local1172) {
			signlink.reporterror("5795, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 250 + ", " + local1172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method596(@OriginalArg(0) byte arg0) {
		try {
			this.aClass42_12.method425();
			Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray253;
			this.aClass2_Sub1_Sub1_Sub1_13.method77(0, 0);
			@Pc(19) boolean local19 = false;
			if (this.anInt940 != -1) {
				this.method725(0, Class31.method293(this.anInt940), 0, 0);
			} else if (this.anIntArray220[this.anInt819] != -1) {
				this.method725(0, Class31.method293(this.anIntArray220[this.anInt819]), 0, 0);
			}
			if (this.aBoolean241 && this.anInt843 == 1) {
				this.method610();
			}
			this.aClass42_12.method426(205, 553, super.aGraphics2);
			this.aClass42_14.method425();
			Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("59418, " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_Sub1_Sub1_Sub3_13 = null;
			if (this.aClass18_Sub1_1 != null) {
				this.aClass18_Sub1_1.method206();
			}
			this.aClass18_Sub1_1 = null;
			this.aClass42_22 = null;
			this.aClass42_23 = null;
			this.aClass42_19 = null;
			this.aClass42_20 = null;
			this.aClass42_21 = null;
			this.aClass42_16 = null;
			this.aClass42_17 = null;
			this.aClass42_18 = null;
			this.aClass2_Sub1_Sub2_Sub3_Sub1Array1 = null;
			this.anIntArray217 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray261 = null;
			this.anIntArray262 = null;
			this.aClass2_Sub1_Sub1_Sub1Array4 = null;
			this.anIntArray232 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray233 = null;
			this.anIntArray234 = null;
			this.aClass42_7 = null;
			this.aClass42_8 = null;
			this.aClass42_9 = null;
			this.aClass42_10 = null;
			this.aClass42_11 = null;
			this.aClass42_12 = null;
			this.aClass42_13 = null;
			this.aClass42_14 = null;
			this.aClass42_15 = null;
			if (this.aClass23_1 != null) {
				this.aClass23_1.aBoolean98 = false;
			}
			this.aClass23_1 = null;
			this.aClass2_Sub1_Sub1_Sub1_1 = null;
			this.aClass2_Sub1_Sub1_Sub1_2 = null;
			this.aClass2_Sub1_Sub1_Sub1_3 = null;
			this.aClass41ArrayArrayArray1 = null;
			this.aClass41_11 = null;
			this.aClass2_Sub1_Sub3_7 = null;
			this.aClass2_Sub1_Sub3_6 = null;
			this.aClass2_Sub1_Sub3_9 = null;
			this.anIntArray264 = null;
			@Pc(139) boolean local139 = false;
			this.anIntArray265 = null;
			this.anIntArray266 = null;
			this.anIntArray267 = null;
			this.aStringArray12 = null;
			this.aClass2_Sub1_Sub1_Sub1_16 = null;
			this.aClass2_Sub1_Sub1_Sub1_17 = null;
			this.aClass2_Sub1_Sub1_Sub1_18 = null;
			this.aClass2_Sub1_Sub1_Sub1_19 = null;
			this.aClass2_Sub1_Sub1_Sub1_20 = null;
			this.aClass41_10 = null;
			this.aClass41_12 = null;
			this.aStringArray8 = null;
			this.aLongArray4 = null;
			this.anIntArray231 = null;
			this.aClass2_Sub1_Sub3_8 = null;
			this.anIntArray244 = null;
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method52();
				}
			} catch (@Pc(195) Exception local195) {
			}
			this.aClass6_1 = null;
			this.aClass2_Sub1_Sub1_Sub1Array2 = null;
			this.aClass2_Sub1_Sub1_Sub3Array5 = null;
			this.aClass2_Sub1_Sub1_Sub1_6 = null;
			this.aClass2_Sub1_Sub1_Sub1_7 = null;
			this.aClass2_Sub1_Sub1_Sub1_8 = null;
			this.aClass2_Sub1_Sub1_Sub1_9 = null;
			this.aClass2_Sub1_Sub1_Sub1_10 = null;
			this.aClass2_Sub1_Sub1_Sub3_15 = null;
			this.aClass42_24 = null;
			this.aClass42_25 = null;
			this.aClass42_26 = null;
			this.aClass42_27 = null;
			this.aClass2_Sub1_Sub1_Sub3_7 = null;
			this.aClass2_Sub1_Sub1_Sub3_8 = null;
			this.aClass2_Sub1_Sub1_Sub3_9 = null;
			this.aClass2_Sub1_Sub1_Sub3_10 = null;
			this.aClass2_Sub1_Sub1_Sub3_11 = null;
			this.aClass2_Sub1_Sub1_Sub1_13 = null;
			this.aClass2_Sub1_Sub1_Sub1_14 = null;
			this.aClass2_Sub1_Sub1_Sub1_15 = null;
			this.anIntArray228 = null;
			this.anIntArray229 = null;
			this.aClass2_Sub1_Sub1_Sub3Array4 = null;
			this.method719((byte) 6);
			this.aClass2_Sub1_Sub2_Sub3_Sub2Array1 = null;
			this.anIntArray245 = null;
			this.anIntArray246 = null;
			this.aClass2_Sub1_Sub3Array1 = null;
			this.anIntArray274 = null;
			this.aClass42_3 = null;
			this.aClass42_4 = null;
			this.aClass42_5 = null;
			this.aClass42_6 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass47_1 = null;
			this.aClass5Array1 = null;
			this.aByteArray21 = null;
			this.anIntArrayArray24 = null;
			this.aClass2_Sub1_Sub1_Sub3_14 = null;
			this.aClass2_Sub1_Sub1_Sub3Array6 = null;
			this.aClass2_Sub1_Sub1_Sub3Array7 = null;
			this.aClass2_Sub1_Sub1_Sub3Array10 = null;
			this.aClass2_Sub1_Sub1_Sub3Array9 = null;
			this.aClass2_Sub1_Sub1_Sub3Array8 = null;
			this.method698();
			Class1.method8();
			Class46.method479();
			Class38.method401();
			Class31.method297();
			Class32.aClass32Array1 = null;
			Class30.aClass30Array1 = null;
			Class25.aClass25Array1 = null;
			Class39.aClass39Array1 = null;
			Class33.aClass33Array1 = null;
			Class33.aClass4_5 = null;
			Class15.aClass15Array1 = null;
			super.aClass42_2 = null;
			Class2_Sub1_Sub2_Sub3_Sub2.aClass4_8 = null;
			Class2_Sub1_Sub1_Sub2.method254();
			Class47.method486();
			Class2_Sub1_Sub2_Sub2.method147();
			Class26.method221();
			System.gc();
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("48716, " + arg0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ZATRZGAA;III)V")
	private void method597(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != aClass2_Sub1_Sub2_Sub3_Sub2_1 && this.anInt937 < 400) {
				@Pc(35) String local35;
				if (arg1.anInt709 == 0) {
					local35 = arg1.aString15 + method604(aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt714, arg1.anInt714) + " (level-" + arg1.anInt714 + ")";
				} else {
					local35 = arg1.aString15 + " (skill-" + arg1.anInt709 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt830 == 1) {
					this.aStringArray12[this.anInt937] = "Use " + this.aString18 + " with @whi@" + local35;
					this.anIntArray266[this.anInt937] = 244;
					this.anIntArray267[this.anInt937] = arg0;
					this.anIntArray264[this.anInt937] = arg2;
					this.anIntArray265[this.anInt937] = arg3;
					this.anInt937++;
				} else if (this.anInt820 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray9[local165] != null) {
							this.aStringArray12[this.anInt937] = this.aStringArray9[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray9[local165].equalsIgnoreCase("attack")) {
								if (arg1.anInt714 > aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt714) {
									local192 = 2000;
								}
								if (aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt710 != 0 && arg1.anInt710 != 0) {
									if (aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt710 == arg1.anInt710) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray11[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray266[this.anInt937] = local192 + 70;
							}
							if (local165 == 1) {
								this.anIntArray266[this.anInt937] = local192 + 136;
							}
							if (local165 == 2) {
								this.anIntArray266[this.anInt937] = local192 + 367;
							}
							if (local165 == 3) {
								this.anIntArray266[this.anInt937] = local192 + 321;
							}
							if (local165 == 4) {
								this.anIntArray266[this.anInt937] = local192 + 974;
							}
							this.anIntArray267[this.anInt937] = arg0;
							this.anIntArray264[this.anInt937] = arg2;
							this.anIntArray265[this.anInt937] = arg3;
							this.anInt937++;
						}
					}
				} else if ((this.anInt822 & 0x8) == 8) {
					this.aStringArray12[this.anInt937] = this.aString17 + " @whi@" + local35;
					this.anIntArray266[this.anInt937] = 461;
					this.anIntArray267[this.anInt937] = arg0;
					this.anIntArray264[this.anInt937] = arg2;
					this.anIntArray265[this.anInt937] = arg3;
					this.anInt937++;
				}
				for (local165 = 0; local165 < this.anInt937; local165++) {
					if (this.anIntArray266[local165] == 269) {
						this.aStringArray12[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
				this.anInt975 += 0;
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("94561, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!QXTIWHBH;IIIII)V")
	private void method598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean277) {
				this.anInt818 = 32;
			} else {
				this.anInt818 = 0;
			}
			this.aBoolean277 = false;
			if (arg3 >= arg5 && arg3 < arg5 + 16 && arg0 >= arg4 && arg0 < arg4 + 16) {
				arg2.anInt383 -= this.anInt972 * 4;
				if (arg7 == 1) {
					this.aBoolean256 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean252 = true;
				}
			} else if (arg3 >= arg5 && arg3 < arg5 + 16 && arg0 >= arg4 + arg6 - 16 && arg0 < arg4 + arg6) {
				arg2.anInt383 += this.anInt972 * 4;
				if (arg7 == 1) {
					this.aBoolean256 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean252 = true;
				}
			} else if (arg3 >= arg5 - this.anInt818 && arg3 < arg5 + this.anInt818 + 16 && arg0 >= arg4 + 16 && arg0 < arg4 + arg6 - 16 && this.anInt972 > 0) {
				@Pc(145) int local145 = (arg6 - 32) * arg6 / arg1;
				if (local145 < 8) {
					local145 = 8;
				}
				@Pc(160) int local160 = arg0 - arg4 - local145 / 2 - 16;
				@Pc(166) int local166 = arg6 - local145 - 32;
				arg2.anInt383 = (arg1 - arg6) * local160 / local166;
				if (arg7 == 1) {
					this.aBoolean256 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean252 = true;
				}
				this.aBoolean277 = true;
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("53361, " + -7270 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EMWAMCXW;I)V")
	private void method599(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub3 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt899; local6++) {
				@Pc(13) int local13 = this.anIntArray246[local6];
				@Pc(18) Class2_Sub1_Sub2_Sub3_Sub2 local18 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local13];
				@Pc(21) int local21 = arg1.method97();
				if ((local21 & 0x4) != 0) {
					local21 += arg1.method97() << 8;
				}
				this.method590(local13, local18, local21, arg1);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("96914, " + arg0 + ", " + arg1 + ", " + -79 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method582(@OriginalArg(0) boolean arg0) {
		try {
			if (!this.aBoolean269 && !this.aBoolean279 && !this.aBoolean268) {
				anInt856++;
				this.aBoolean271 &= arg0;
				if (this.aBoolean271) {
					this.method675();
				} else {
					this.method611();
				}
				this.method603((byte) 7);
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("45430, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method600() {
		try {
			@Pc(8) int local8;
			if (this.anInt1001 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1001 > 768) {
						this.anIntArray224[local8] = this.method673(this.anIntArray226[local8], this.anIntArray225[local8], 1024 - this.anInt1001);
					} else if (this.anInt1001 > 256) {
						this.anIntArray224[local8] = this.anIntArray226[local8];
					} else {
						this.anIntArray224[local8] = this.method673(this.anIntArray225[local8], this.anIntArray226[local8], 256 - this.anInt1001);
					}
				}
			} else if (this.anInt1002 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1002 > 768) {
						this.anIntArray224[local8] = this.method673(this.anIntArray227[local8], this.anIntArray225[local8], 1024 - this.anInt1002);
					} else if (this.anInt1002 > 256) {
						this.anIntArray224[local8] = this.anIntArray227[local8];
					} else {
						this.anIntArray224[local8] = this.method673(this.anIntArray225[local8], this.anIntArray227[local8], 256 - this.anInt1002);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray224[local8] = this.anIntArray225[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass42_22.anIntArray170[local8] = this.aClass2_Sub1_Sub1_Sub3_3.anIntArray156[local8];
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
				local198 = this.anIntArray236[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray271[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray224[local220];
						local239 = this.aClass42_22.anIntArray170[local183];
						this.aClass42_22.anIntArray170[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass42_22.method426(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass42_23.anIntArray170[local198] = this.aClass2_Sub1_Sub1_Sub3_4.anIntArray156[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray236[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray271[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(372) int local372 = 256 - local228;
						local228 = this.anIntArray224[local228];
						@Pc(383) int local383 = this.aClass42_23.anIntArray170[local183];
						this.aClass42_23.anIntArray170[local183++] = ((local228 & 0xFF00FF) * local239 + (local383 & 0xFF00FF) * local372 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local383 & 0xFF00) * local372 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass42_23.method426(0, 637, super.aGraphics2);
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("13815, " + 0 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method601() {
		try {
			for (@Pc(6) Class2_Sub1_Sub2_Sub6 local6 = (Class2_Sub1_Sub2_Sub6) this.aClass41_10.method414(); local6 != null; local6 = (Class2_Sub1_Sub2_Sub6) this.aClass41_10.method416()) {
				if (local6.anInt602 != this.anInt1028 || anInt856 > local6.anInt604) {
					local6.method466();
				} else if (anInt856 >= local6.anInt603) {
					if (local6.anInt607 > 0) {
						@Pc(42) Class2_Sub1_Sub2_Sub3_Sub1 local42 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local6.anInt607 - 1];
						if (local42 != null && local42.anInt679 >= 0 && local42.anInt679 < 13312 && local42.anInt680 >= 0 && local42.anInt680 < 13312) {
							local6.method424(local42.anInt680, local42.anInt679, anInt856, this.method657(local6.anInt602, local42.anInt679, local42.anInt680) - local6.anInt611);
						}
					}
					if (local6.anInt607 < 0) {
						@Pc(87) int local87 = -local6.anInt607 - 1;
						@Pc(93) Class2_Sub1_Sub2_Sub3_Sub2 local93;
						if (local87 == this.anInt842) {
							local93 = aClass2_Sub1_Sub2_Sub3_Sub2_1;
						} else {
							local93 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local87];
						}
						if (local93 != null && local93.anInt679 >= 0 && local93.anInt679 < 13312 && local93.anInt680 >= 0 && local93.anInt680 < 13312) {
							local6.method424(local93.anInt680, local93.anInt679, anInt856, this.method657(local6.anInt602, local93.anInt679, local93.anInt680) - local6.anInt611);
						}
					}
					local6.method423(this.anInt902, this.anInt1039);
					this.aClass47_1.method498(local6.anInt612, local6, this.anInt1028, (int) local6.aDouble8, (int) local6.aDouble6, (int) local6.aDouble7, -1, 60, false);
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("99031, " + -44999 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method602(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt1000 > 3 || this.anInt1000 < 3) {
				this.aBoolean243 = !this.aBoolean243;
			}
			if (!aBoolean250) {
				for (@Pc(21) int local21 = 0; local21 < this.anIntArray263.length; local21++) {
					@Pc(28) int local28 = this.anIntArray263[local21];
					if (Class2_Sub1_Sub1_Sub2.anIntArray121[local28] >= arg0) {
						@Pc(37) Class2_Sub1_Sub1_Sub1 local37 = Class2_Sub1_Sub1_Sub2.aClass2_Sub1_Sub1_Sub1Array1[local28];
						@Pc(45) int local45 = local37.anInt99 * local37.anInt100 - 1;
						@Pc(53) int local53 = local37.anInt99 * this.anInt902 * 2;
						@Pc(56) byte[] local56 = local37.aByteArray9;
						@Pc(59) byte[] local59 = this.aByteArray21;
						for (@Pc(61) int local61 = 0; local61 <= local45; local61++) {
							local59[local61] = local56[local61 - local53 & local45];
						}
						local37.aByteArray9 = local59;
						this.aByteArray21 = local56;
						Class2_Sub1_Sub1_Sub2.method261(local28, 666);
					}
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("48720, " + 3 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method603(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(15) Class2_Sub1_Sub4 local15 = this.aClass18_Sub1_1.method198();
				if (local15 == null) {
					return;
				}
				if (local15.anInt259 == 0) {
					Class2_Sub1_Sub2_Sub2.method149(local15.aByteArray17, local15.anInt258);
					if ((this.aClass18_Sub1_1.method208(local15.anInt258, anInt913) & 0x62) != 0) {
						this.aBoolean256 = true;
						if (this.anInt849 != -1 || this.anInt991 != -1) {
							this.aBoolean252 = true;
						}
					}
				}
				if (local15.anInt259 == 1 && local15.aByteArray17 != null) {
					Class26.method220(local15.aByteArray17);
				}
				if (local15.anInt259 == 2 && local15.anInt258 == this.anInt968 && local15.aByteArray17 != null) {
					this.method617(this.aBoolean270, local15.aByteArray17);
				}
				if (local15.anInt259 == 3 && this.anInt935 == 1) {
					for (@Pc(90) int local90 = 0; local90 < this.aByteArrayArray5.length; local90++) {
						if (this.anIntArray233[local90] == local15.anInt258) {
							this.aByteArrayArray5[local90] = local15.aByteArray17;
							if (local15.aByteArray17 == null) {
								this.anIntArray233[local90] = -1;
							}
							break;
						}
						if (this.anIntArray234[local90] == local15.anInt258) {
							this.aByteArrayArray6[local90] = local15.aByteArray17;
							if (local15.aByteArray17 == null) {
								this.anIntArray234[local90] = -1;
							}
							break;
						}
					}
				}
				if (local15.anInt259 == 93 && this.aClass18_Sub1_1.method204(local15.anInt258)) {
					Class34.method328(new Class2_Sub1_Sub3(local15.aByteArray17, true), this.anInt934, this.aClass18_Sub1_1);
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("54513, " + arg0 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!EMWAMCXW;)V")
	private void method605(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt137 + 10 < arg0 * 8) {
					@Pc(20) int local20 = arg1.method108(11);
					if (local20 != 2047) {
						if (this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20] == null) {
							this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20] = new Class2_Sub1_Sub2_Sub3_Sub2();
							if (this.aClass2_Sub1_Sub3Array1[local20] != null) {
								this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20].method476(this.aClass2_Sub1_Sub3Array1[local20]);
							}
						}
						this.anIntArray245[this.anInt898++] = local20;
						@Pc(66) Class2_Sub1_Sub2_Sub3_Sub2 local66 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
						local66.anInt678 = anInt856;
						@Pc(74) int local74 = arg1.method108(5);
						if (local74 > 15) {
							local74 -= 32;
						}
						@Pc(83) int local83 = arg1.method108(5);
						if (local83 > 15) {
							local83 -= 32;
						}
						@Pc(92) int local92 = arg1.method108(1);
						@Pc(97) int local97 = arg1.method108(1);
						if (local97 == 1) {
							this.anIntArray246[this.anInt899++] = local20;
						}
						local66.method470(aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0] + local74, local92 == 1, this.anInt884, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0] + local83);
						continue;
					}
				}
				arg1.method109();
				return;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("73167, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!EMWAMCXW;I)V")
	private void method606(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt899; local9++) {
				@Pc(16) int local16 = this.anIntArray246[local9];
				@Pc(21) Class2_Sub1_Sub2_Sub3_Sub1 local21 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local16];
				@Pc(24) int local24 = arg0.method97();
				if ((local24 & 0x4) != 0) {
					local21.aString14 = arg0.method104();
					local21.anInt674 = 100;
				}
				if ((local24 & 0x20) != 0) {
					local21.anInt703 = arg0.method125();
					local21.anInt704 = arg0.method125();
				}
				@Pc(61) int local61;
				if ((local24 & 0x8) != 0) {
					local21.anInt663 = arg0.method126();
					local61 = arg0.method102();
					local21.anInt667 = local61 >> 16;
					local21.anInt666 = anInt856 + (local61 & 0xFFFF);
					local21.anInt664 = 0;
					local21.anInt665 = 0;
					if (local21.anInt666 > anInt856) {
						local21.anInt664 = -1;
					}
					if (local21.anInt663 == 65535) {
						local21.anInt663 = -1;
					}
				}
				if ((local24 & 0x1) != 0) {
					local21.aClass46_1 = Class46.method480(arg0.method126());
					local21.anInt690 = local21.aClass46_1.aByte27;
					local21.anInt672 = local21.aClass46_1.anInt740;
					local21.anInt657 = local21.aClass46_1.anInt744;
					local21.anInt658 = local21.aClass46_1.anInt742;
					local21.anInt659 = local21.aClass46_1.anInt736;
					local21.anInt660 = local21.aClass46_1.anInt743;
					local21.anInt661 = local21.aClass46_1.anInt725;
				}
				if ((local24 & 0x40) != 0) {
					local21.anInt683 = arg0.method125();
					if (local21.anInt683 == 65535) {
						local21.anInt683 = -1;
					}
				}
				@Pc(166) int local166;
				if ((local24 & 0x80) != 0) {
					local61 = arg0.method116();
					local166 = arg0.method116();
					local21.method471(local61, local166, anInt856);
					local21.anInt668 = anInt856 + 300;
					local21.anInt669 = arg0.method116();
					local21.anInt670 = arg0.method118();
				}
				if ((local24 & 0x2) != 0) {
					local61 = arg0.method99();
					if (local61 == 65535) {
						local61 = -1;
					}
					local166 = arg0.method116();
					if (local61 == local21.anInt684 && local61 != -1) {
						@Pc(215) int local215 = Class39.aClass39Array1[local61].anInt593;
						if (local215 == 1) {
							local21.anInt685 = 0;
							local21.anInt686 = 0;
							local21.anInt687 = local166;
							local21.anInt688 = 0;
						}
						if (local215 == 2) {
							local21.anInt688 = 0;
						}
					} else if (local61 == -1 || local21.anInt684 == -1 || Class39.aClass39Array1[local61].anInt587 >= Class39.aClass39Array1[local21.anInt684].anInt587) {
						local21.anInt684 = local61;
						local21.anInt685 = 0;
						local21.anInt686 = 0;
						local21.anInt687 = local166;
						local21.anInt688 = 0;
						local21.anInt671 = local21.anInt689;
					}
				}
				if ((local24 & 0x10) != 0) {
					local61 = arg0.method117();
					local166 = arg0.method117();
					local21.method471(local61, local166, anInt856);
					local21.anInt668 = anInt856 + 300;
					local21.anInt669 = arg0.method116();
					local21.anInt670 = arg0.method116();
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("12431, " + -72 + ", " + arg0 + ", " + arg1 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI[B)Z")
	private boolean method607(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("15050, " + 115 + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method608(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class31 local2 = Class31.method293(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray137.length && local2.anIntArray137[local4] != -1; local4++) {
				@Pc(18) Class31 local18 = Class31.method293(local2.anIntArray137[local4]);
				if (local18.anInt397 == 1) {
					this.method608(local18.anInt385);
				}
				local18.anInt381 = 0;
				local18.anInt407 = 0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("97496, " + arg0 + ", " + -22137 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method609() {
		try {
			if (this.anInt872 == 0 && super.anInt808 == 1) {
				@Pc(20) int local20 = super.anInt809 - 25 - 550;
				@Pc(27) int local27 = super.anInt810 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt925 + this.anInt869 & 0x7FF;
					@Pc(51) int local51 = Class2_Sub1_Sub1_Sub2.anIntArray117[local47];
					@Pc(55) int local55 = Class2_Sub1_Sub1_Sub2.anIntArray118[local47];
					@Pc(64) int local64 = local51 * (this.anInt864 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt864 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 + local83 >> 7;
					@Pc(107) int local107 = aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 - local93 >> 7;
					@Pc(128) boolean local128 = this.method653(true, 1, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local100, local107);
					if (local128) {
						this.aClass2_Sub1_Sub3_7.method87(local20);
						this.aClass2_Sub1_Sub3_7.method87(local27);
						this.aClass2_Sub1_Sub3_7.method88(this.anInt925);
						this.aClass2_Sub1_Sub3_7.method87(57);
						this.aClass2_Sub1_Sub3_7.method87(this.anInt869);
						this.aClass2_Sub1_Sub3_7.method87(this.anInt864);
						this.aClass2_Sub1_Sub3_7.method87(89);
						this.aClass2_Sub1_Sub3_7.method88(aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679);
						this.aClass2_Sub1_Sub3_7.method88(aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680);
						this.aClass2_Sub1_Sub3_7.method87(this.anInt938);
						this.aClass2_Sub1_Sub3_7.method87(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("14566, " + 200 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method610() {
		try {
			@Pc(2) int local2 = this.anInt844;
			@Pc(5) int local5 = this.anInt845;
			@Pc(8) int local8 = this.anInt846;
			@Pc(11) int local11 = this.anInt847;
			Class2_Sub1_Sub1.method436(local2, local5, this.anInt967, 6116423, local8, local11);
			Class2_Sub1_Sub1.method436(local2 + 1, local5 + 1, this.anInt967, 0, local8 - 2, 16);
			Class2_Sub1_Sub1.method437(local2 + 1, local8 - 2, 0, local11 - 19, local5 + 18);
			this.aClass2_Sub1_Sub1_Sub4_4.method448("Choose Option", local2 + 3, 6116423, local5 + 14);
			@Pc(74) int local74 = super.anInt803;
			@Pc(77) int local77 = super.anInt804;
			if (this.anInt843 == 0) {
				local74 -= 4;
				local77 -= 4;
			}
			if (this.anInt843 == 1) {
				local74 -= 553;
				local77 -= 205;
			}
			if (this.anInt843 == 2) {
				local74 -= 17;
				local77 -= 357;
			}
			for (@Pc(96) int local96 = 0; local96 < this.anInt937; local96++) {
				@Pc(111) int local111 = local5 + (this.anInt937 - 1 - local96) * 15 + 31;
				@Pc(113) int local113 = 16777215;
				if (local74 > local2 && local74 < local2 + local8 && local77 > local111 - 13 && local77 < local111 + 3) {
					local113 = 16776960;
				}
				this.aClass2_Sub1_Sub1_Sub4_4.method452(true, local2 + 3, local113, local111, this.aStringArray12[local96]);
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("83321, " + 8 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method611() {
		try {
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt917 == 0) {
				local15 = super.anInt799 / 2 - 80;
				local22 = super.anInt800 / 2 + 20;
				local22 += 20;
				if (super.anInt808 == 1 && super.anInt809 >= local15 - 75 && super.anInt809 <= local15 + 75 && super.anInt810 >= local22 - 20 && super.anInt810 <= local22 + 20) {
					this.anInt917 = 3;
					this.anInt1032 = 0;
				}
				local15 = super.anInt799 / 2 + 80;
				if (super.anInt808 == 1 && super.anInt809 >= local15 - 75 && super.anInt809 <= local15 + 75 && super.anInt810 >= local22 - 20 && super.anInt810 <= local22 + 20) {
					this.aString30 = "";
					this.aString31 = "Enter your username & password.";
					this.anInt917 = 2;
					this.anInt1032 = 0;
				}
			} else if (this.anInt917 == 2) {
				local15 = super.anInt800 / 2 - 40;
				local15 += 30;
				local15 += 25;
				if (super.anInt808 == 1 && super.anInt810 >= local15 - 15 && super.anInt810 < local15) {
					this.anInt1032 = 0;
				}
				local15 += 15;
				if (super.anInt808 == 1 && super.anInt810 >= local15 - 15 && super.anInt810 < local15) {
					this.anInt1032 = 1;
				}
				local15 += 15;
				local22 = super.anInt799 / 2 - 80;
				@Pc(168) int local168 = super.anInt800 / 2 + 50;
				@Pc(169) int local169 = local168 + 20;
				if (super.anInt808 == 1 && super.anInt809 >= local22 - 75 && super.anInt809 <= local22 + 75 && super.anInt810 >= local169 - 20 && super.anInt810 <= local169 + 20) {
					this.anInt955 = 0;
					this.method620(this.aString25, this.aString26, false);
					if (this.aBoolean271) {
						return;
					}
				}
				local22 = super.anInt799 / 2 + 80;
				if (super.anInt808 == 1 && super.anInt809 >= local22 - 75 && super.anInt809 <= local22 + 75 && super.anInt810 >= local169 - 20 && super.anInt810 <= local169 + 20) {
					this.anInt917 = 0;
					this.aString25 = "";
					this.aString26 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method580();
						if (local259 == -1) {
							return;
						}
						@Pc(264) boolean local264 = false;
						for (@Pc(266) int local266 = 0; local266 < aString20.length(); local266++) {
							if (local259 == aString20.charAt(local266)) {
								local264 = true;
								break;
							}
						}
						if (this.anInt1032 == 0) {
							if (local259 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt1032 = 1;
							}
							if (local264) {
								this.aString25 = this.aString25 + (char) local259;
							}
							if (this.aString25.length() > 12) {
								this.aString25 = this.aString25.substring(0, 12);
							}
						} else if (this.anInt1032 == 1) {
							if (local259 == 8 && this.aString26.length() > 0) {
								this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt1032 = 0;
							}
							if (local264) {
								this.aString26 = this.aString26 + (char) local259;
							}
							if (this.aString26.length() > 20) {
								this.aString26 = this.aString26.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt917 == 3) {
				local15 = super.anInt799 / 2;
				local22 = super.anInt800 / 2 + 50;
				@Pc(423) int local423 = local22 + 20;
				if (super.anInt808 == 1 && super.anInt809 >= local15 - 75 && super.anInt809 <= local15 + 75 && super.anInt810 >= local423 - 20 && super.anInt810 <= local423 + 20) {
					this.anInt917 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("38396, " + false + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ZLQCXMFK;III)V")
	private void method612(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt937 < 400) {
				if (arg1.anIntArray192 != null) {
					arg1 = arg1.method481();
				}
				if (arg1 != null && arg1.aBoolean220) {
					@Pc(27) String local27 = arg1.aString16;
					if (arg1.anInt745 != 0) {
						local27 = local27 + method604(aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt714, arg1.anInt745) + " (level-" + arg1.anInt745 + ")";
					}
					if (this.anInt830 == 1) {
						this.aStringArray12[this.anInt937] = "Use " + this.aString18 + " with @yel@" + local27;
						this.anIntArray266[this.anInt937] = 10;
						this.anIntArray267[this.anInt937] = arg3;
						this.anIntArray264[this.anInt937] = arg0;
						this.anIntArray265[this.anInt937] = arg4;
						this.anInt937++;
					} else if (this.anInt820 != 1) {
						@Pc(165) int local165;
						if (arg1.aStringArray5 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg1.aStringArray5[local165] != null && !arg1.aStringArray5[local165].equalsIgnoreCase("attack")) {
									this.aStringArray12[this.anInt937] = arg1.aStringArray5[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray266[this.anInt937] = 88;
									}
									if (local165 == 1) {
										this.anIntArray266[this.anInt937] = 320;
									}
									if (local165 == 2) {
										this.anIntArray266[this.anInt937] = 608;
									}
									if (local165 == 3) {
										this.anIntArray266[this.anInt937] = 169;
									}
									if (local165 == 4) {
										this.anIntArray266[this.anInt937] = 189;
									}
									this.anIntArray267[this.anInt937] = arg3;
									this.anIntArray264[this.anInt937] = arg0;
									this.anIntArray265[this.anInt937] = arg4;
									this.anInt937++;
								}
							}
						}
						if (arg1.aStringArray5 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg1.aStringArray5[local165] != null && arg1.aStringArray5[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg1.anInt745 > aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt714) {
										local289 = 2000;
									}
									this.aStringArray12[this.anInt937] = arg1.aStringArray5[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray266[this.anInt937] = local289 + 88;
									}
									if (local165 == 1) {
										this.anIntArray266[this.anInt937] = local289 + 320;
									}
									if (local165 == 2) {
										this.anIntArray266[this.anInt937] = local289 + 608;
									}
									if (local165 == 3) {
										this.anIntArray266[this.anInt937] = local289 + 169;
									}
									if (local165 == 4) {
										this.anIntArray266[this.anInt937] = local289 + 189;
									}
									this.anIntArray267[this.anInt937] = arg3;
									this.anIntArray264[this.anInt937] = arg0;
									this.anIntArray265[this.anInt937] = arg4;
									this.anInt937++;
								}
							}
						}
						this.aStringArray12[this.anInt937] = "Examine @yel@" + local27;
						this.anIntArray266[this.anInt937] = 1199;
						this.anIntArray267[this.anInt937] = arg3;
						this.anIntArray264[this.anInt937] = arg0;
						this.anIntArray265[this.anInt937] = arg4;
						this.anInt937++;
					} else if ((this.anInt822 & 0x2) == 2) {
						this.aStringArray12[this.anInt937] = this.aString17 + " @yel@" + local27;
						this.anIntArray266[this.anInt937] = 209;
						this.anIntArray267[this.anInt937] = arg3;
						this.anIntArray264[this.anInt937] = arg0;
						this.anIntArray265[this.anInt937] = arg4;
						this.anInt937++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("66577, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method614() {
		try {
			@Pc(20) int local20;
			for (@Pc(13) int local13 = 10; local13 < 117; local13++) {
				local20 = (int) (Math.random() * 100.0D);
				if (local20 < 50) {
					this.anIntArray271[local13 + 32512] = 255;
				}
			}
			@Pc(49) int local49;
			@Pc(56) int local56;
			@Pc(62) int local62;
			for (local20 = 0; local20 < 100; local20++) {
				local49 = (int) (Math.random() * 124.0D) + 2;
				local56 = (int) (Math.random() * 128.0D) + 128;
				local62 = local49 + (local56 << 7);
				this.anIntArray271[local62] = 192;
			}
			for (local49 = 1; local49 < 255; local49++) {
				for (local56 = 1; local56 < 127; local56++) {
					local62 = local56 + (local49 << 7);
					this.anIntArray272[local62] = (this.anIntArray271[local62 - 1] + this.anIntArray271[local62 + 1] + this.anIntArray271[local62 - 128] + this.anIntArray271[local62 + 128]) / 4;
				}
			}
			this.anInt838 += 128;
			if (this.anInt838 > this.anIntArray250.length) {
				this.anInt838 -= this.anIntArray250.length;
				local56 = (int) (Math.random() * 12.0D);
				this.method708(this.aClass2_Sub1_Sub1_Sub1Array5[local56]);
			}
			@Pc(174) int local174;
			for (local56 = 1; local56 < 255; local56++) {
				for (local62 = 1; local62 < 127; local62++) {
					local174 = local62 + (local56 << 7);
					@Pc(197) int local197 = this.anIntArray272[local174 + 128] - this.anIntArray250[local174 + this.anInt838 & this.anIntArray250.length - 1] / 5;
					if (local197 < 0) {
						local197 = 0;
					}
					this.anIntArray271[local174] = local197;
				}
			}
			for (local62 = 0; local62 < 255; local62++) {
				this.anIntArray236[local62] = this.anIntArray236[local62 + 1];
			}
			this.anIntArray236[255] = (int) (Math.sin((double) anInt856 / 14.0D) * 16.0D + Math.sin((double) anInt856 / 15.0D) * 14.0D + Math.sin((double) anInt856 / 16.0D) * 12.0D);
			if (this.anInt1001 > 0) {
				this.anInt1001 -= 4;
			}
			if (this.anInt1002 > 0) {
				this.anInt1002 -= 4;
			}
			if (this.anInt1001 == 0 && this.anInt1002 == 0) {
				local174 = (int) (Math.random() * 2000.0D);
				if (local174 == 0) {
					this.anInt1001 = 1024;
				}
				if (local174 == 1) {
					this.anInt1002 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("9864, " + 0 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method615() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt914; local3++) {
				if (this.anIntArray218[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray248[local3] != this.anInt969 || this.anIntArray268[local3] != this.anInt817) {
							@Pc(45) Class2_Sub1_Sub3 local45 = Class21.method212(this.anIntArray248[local3], this.anIntArray268[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt136 / 22) > this.aLong29 + (long) (this.anInt859 / 22)) {
								this.anInt859 = local45.anInt136;
								this.aLong29 = System.currentTimeMillis();
								if (this.method607(local45.anInt136, local45.aByteArray10)) {
									this.anInt969 = this.anIntArray248[local3];
									this.anInt817 = this.anIntArray268[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method645()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
						if (signlink.reporterror) {
							this.aClass2_Sub1_Sub3_7.method86(215, 533);
							this.aClass2_Sub1_Sub3_7.method88(this.anIntArray248[local3] & 0x7FFF);
						} else {
							this.aClass2_Sub1_Sub3_7.method86(215, 533);
							this.aClass2_Sub1_Sub3_7.method88(-1);
						}
					}
					if (local12 && this.anIntArray218[local3] != -5) {
						this.anIntArray218[local3] = -5;
					} else {
						this.anInt914--;
						for (@Pc(138) int local138 = local3; local138 < this.anInt914; local138++) {
							this.anIntArray248[local138] = this.anIntArray248[local138 + 1];
							this.anIntArray268[local138] = this.anIntArray268[local138 + 1];
							this.anIntArray218[local138] = this.anIntArray218[local138 + 1];
						}
						local3--;
					}
				} else {
					@Pc(190) int local190 = this.anIntArray218[local3]--;
				}
			}
			if (this.anInt936 > 0) {
				this.anInt936 -= 20;
				if (this.anInt936 < 0) {
					this.anInt936 = 0;
				}
				if (this.anInt936 == 0 && this.aBoolean248 && !aBoolean250) {
					this.anInt968 = this.anInt866;
					this.aBoolean270 = true;
					this.aClass18_Sub1_1.method207(2, this.anInt968);
					return;
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("62545, " + -58 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method616(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = Class15.aClass15Array1[arg0].anInt176;
			if (local6 != 0) {
				@Pc(21) int local21 = this.anIntArray244[arg0];
				if (local6 == 1) {
					if (local21 == 1) {
						Class2_Sub1_Sub1_Sub2.method263(0.9D);
					}
					if (local21 == 2) {
						Class2_Sub1_Sub1_Sub2.method263(0.8D);
					}
					if (local21 == 3) {
						Class2_Sub1_Sub1_Sub2.method263(0.7D);
					}
					if (local21 == 4) {
						Class2_Sub1_Sub1_Sub2.method263(0.6D);
					}
					Class38.aClass4_6.method39();
					this.aBoolean282 = true;
				}
				if (local6 == 3) {
					@Pc(59) boolean local59 = this.aBoolean248;
					if (local21 == 0) {
						this.method674(0, this.aBoolean248);
						this.aBoolean248 = true;
					}
					if (local21 == 1) {
						this.method674(-400, this.aBoolean248);
						this.aBoolean248 = true;
					}
					if (local21 == 2) {
						this.method674(-800, this.aBoolean248);
						this.aBoolean248 = true;
					}
					if (local21 == 3) {
						this.method674(-1200, this.aBoolean248);
						this.aBoolean248 = true;
					}
					if (local21 == 4) {
						this.aBoolean248 = false;
					}
					if (this.aBoolean248 != local59 && !aBoolean250) {
						if (this.aBoolean248) {
							this.anInt968 = this.anInt866;
							this.aBoolean270 = true;
							this.aClass18_Sub1_1.method207(2, this.anInt968);
						} else {
							this.method719((byte) 6);
						}
						this.anInt936 = 0;
					}
				}
				if (local6 == 4) {
					if (local21 == 0) {
						this.aBoolean280 = true;
						this.method721(0);
					}
					if (local21 == 1) {
						this.aBoolean280 = true;
						this.method721(-400);
					}
					if (local21 == 2) {
						this.aBoolean280 = true;
						this.method721(-800);
					}
					if (local21 == 3) {
						this.aBoolean280 = true;
						this.method721(-1200);
					}
					if (local21 == 4) {
						this.aBoolean280 = false;
					}
				}
				if (local6 == 5) {
					this.anInt988 = local21;
				}
				if (local6 == 6) {
					this.anInt854 = local21;
				}
				if (local6 == 8) {
					this.anInt841 = local21;
					this.aBoolean252 = true;
				}
				if (local6 == 9) {
					this.anInt881 = local21;
				}
			}
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("30117, " + -580 + ", " + arg0 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method617(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean248) {
				signlink.anInt1051 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("49375, " + arg0 + ", " + arg1 + ", " + -790 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method618(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt839 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(21) String[] local21 = new String[100];
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(27) int local27 = local12.indexOf(" ");
					if (local27 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local21[local23++] = local12.toLowerCase();
						}
						this.anInt839 = 0;
						label49: for (local27 = 0; local27 < Class38.anInt580; local27++) {
							@Pc(76) Class38 local76 = Class38.method391(local27);
							if (local76.anInt574 == -1 && local76.aString13 != null) {
								@Pc(87) String local87 = local76.aString13.toLowerCase();
								for (@Pc(89) int local89 = 0; local89 < local23; local89++) {
									if (local87.indexOf(local21[local89]) == -1) {
										continue label49;
									}
								}
								this.aStringArray10[this.anInt839] = local87;
								this.anIntArray219[this.anInt839] = local27;
								this.anInt839++;
								if (this.anInt839 >= this.aStringArray10.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(36) String local36 = local12.substring(0, local27).trim();
					if (local36.length() > 0) {
						local21[local23++] = local36.toLowerCase();
					}
					local12 = local12.substring(local27 + 1);
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("44629, " + -42 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method619() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt898; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt897;
				} else {
					local11 = this.anIntArray245[local3];
				}
				@Pc(23) Class2_Sub1_Sub2_Sub3_Sub2 local23 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local11];
				if (local23 != null) {
					this.method686(local23, (byte) 9, 1);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("82758, " + -410 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method620(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString30 = "";
				this.aString31 = "Connecting to server...";
				this.method700(true);
			}
			this.aClass6_1 = new Class6(this.method644(anInt862 + 43594), this, this.anInt882);
			@Pc(31) long local31 = Class40.method405(arg0);
			@Pc(38) int local38 = (int) (local31 >> 16 & 0x1FL);
			this.aClass2_Sub1_Sub3_7.anInt136 = 0;
			this.aClass2_Sub1_Sub3_7.method87(14);
			this.aClass2_Sub1_Sub3_7.method87(local38);
			this.aClass6_1.method56(this.aClass2_Sub1_Sub3_7.aByteArray10, this.aBoolean263, 2);
			for (@Pc(62) int local62 = 0; local62 < 8; local62++) {
				this.aClass6_1.method53();
			}
			@Pc(76) int local76 = this.aClass6_1.method53();
			@Pc(78) int local78 = local76;
			@Pc(227) int local227;
			@Pc(261) int local261;
			if (local76 == 0) {
				this.aClass6_1.method55(this.aClass2_Sub1_Sub3_9.aByteArray10, 0, 8);
				this.aClass2_Sub1_Sub3_9.anInt136 = 0;
				this.aLong31 = this.aClass2_Sub1_Sub3_9.method103();
				@Pc(101) int[] local101 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong31 >> 32), (int) this.aLong31 };
				this.aClass2_Sub1_Sub3_7.anInt136 = 0;
				this.aClass2_Sub1_Sub3_7.method87(10);
				this.aClass2_Sub1_Sub3_7.method91(local101[0]);
				this.aClass2_Sub1_Sub3_7.method91(local101[1]);
				this.aClass2_Sub1_Sub3_7.method91(local101[2]);
				this.aClass2_Sub1_Sub3_7.method91(local101[3]);
				this.aClass2_Sub1_Sub3_7.method91(signlink.anInt1045);
				this.aClass2_Sub1_Sub3_7.method94(arg0);
				this.aClass2_Sub1_Sub3_7.method94(arg1);
				this.aClass2_Sub1_Sub3_7.method112(aBigInteger2, aBigInteger1);
				this.aClass2_Sub1_Sub3_6.anInt136 = 0;
				if (arg2) {
					this.aClass2_Sub1_Sub3_6.method87(18);
				} else {
					this.aClass2_Sub1_Sub3_6.method87(16);
				}
				this.aClass2_Sub1_Sub3_6.method87(this.aClass2_Sub1_Sub3_7.anInt136 + 36 + 1 + 1 + 2);
				this.aClass2_Sub1_Sub3_6.method87(255);
				this.aClass2_Sub1_Sub3_6.method88(364);
				this.aClass2_Sub1_Sub3_6.method87(aBoolean250 ? 1 : 0);
				for (local227 = 0; local227 < 9; local227++) {
					this.aClass2_Sub1_Sub3_6.method91(this.anIntArray212[local227]);
				}
				this.aClass2_Sub1_Sub3_6.method95(this.aClass2_Sub1_Sub3_7.aByteArray10, this.aClass2_Sub1_Sub3_7.anInt136);
				this.aClass2_Sub1_Sub3_7.aClass44_1 = new Class44(true, local101);
				for (local261 = 0; local261 < 4; local261++) {
					local101[local261] += 50;
				}
				this.aClass44_2 = new Class44(true, local101);
				this.aClass6_1.method56(this.aClass2_Sub1_Sub3_6.aByteArray10, this.aBoolean263, this.aClass2_Sub1_Sub3_6.anInt136);
				local76 = this.aClass6_1.method53();
			}
			if (local76 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(304) Exception local304) {
				}
				this.method620(arg0, arg1, arg2);
			} else {
				@Pc(392) int local392;
				if (local76 == 2) {
					this.anInt942 = this.aClass6_1.method53();
					aBoolean258 = this.aClass6_1.method53() == 1;
					this.aLong30 = 0L;
					this.anInt894 = 0;
					this.aClass23_1.anInt245 = 0;
					super.aBoolean239 = true;
					this.aBoolean254 = true;
					this.aBoolean271 = true;
					this.aClass2_Sub1_Sub3_7.anInt136 = 0;
					this.aClass2_Sub1_Sub3_9.anInt136 = 0;
					this.anInt976 = -1;
					this.anInt1008 = -1;
					this.anInt1009 = -1;
					this.anInt1010 = -1;
					this.anInt975 = 0;
					this.anInt977 = 0;
					this.anInt974 = 0;
					this.anInt979 = 0;
					this.anInt848 = 0;
					this.anInt937 = 0;
					this.aBoolean241 = false;
					super.anInt801 = 0;
					for (local392 = 0; local392 < 100; local392++) {
						this.aStringArray14[local392] = null;
					}
					this.anInt830 = 0;
					this.anInt820 = 0;
					this.anInt935 = 0;
					this.anInt914 = 0;
					this.anInt905 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1012 = (int) (Math.random() * 110.0D) - 55;
					this.anInt827 = (int) (Math.random() * 80.0D) - 40;
					this.anInt869 = (int) (Math.random() * 120.0D) - 60;
					this.anInt864 = (int) (Math.random() * 30.0D) - 20;
					this.anInt925 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt872 = 0;
					this.anInt863 = -1;
					this.anInt928 = 0;
					this.anInt929 = 0;
					this.anInt898 = 0;
					this.anInt829 = 0;
					for (local227 = 0; local227 < this.anInt896; local227++) {
						this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local227] = null;
						this.aClass2_Sub1_Sub3Array1[local227] = null;
					}
					for (local261 = 0; local261 < 16384; local261++) {
						this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local261] = null;
					}
					aClass2_Sub1_Sub2_Sub3_Sub2_1 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anInt897] = new Class2_Sub1_Sub2_Sub3_Sub2();
					this.aClass41_10.method418();
					this.aClass41_12.method418();
					@Pc(537) int local537;
					@Pc(541) int local541;
					for (@Pc(533) int local533 = 0; local533 < 4; local533++) {
						for (local537 = 0; local537 < 104; local537++) {
							for (local541 = 0; local541 < 104; local541++) {
								this.aClass41ArrayArrayArray1[local533][local537][local541] = null;
							}
						}
					}
					this.aClass41_11 = new Class41(36113);
					this.anInt893 = 0;
					this.anInt892 = 0;
					this.method622(this.anInt991);
					this.anInt991 = -1;
					this.method622(this.anInt849);
					this.anInt849 = -1;
					this.method622(this.anInt850);
					this.anInt850 = -1;
					this.method622(this.anInt891);
					this.anInt891 = -1;
					this.method622(this.anInt1025);
					this.anInt1025 = -1;
					this.method622(this.anInt940);
					this.anInt940 = -1;
					this.method622(this.anInt1007);
					this.anInt1007 = -1;
					this.aBoolean281 = false;
					this.anInt819 = 3;
					this.anInt973 = 0;
					this.aBoolean241 = false;
					this.aBoolean244 = false;
					this.aString23 = null;
					this.anInt985 = 0;
					this.anInt867 = -1;
					this.aBoolean260 = true;
					this.method650();
					for (local537 = 0; local537 < 5; local537++) {
						this.anIntArray260[local537] = 0;
					}
					for (local541 = 0; local541 < 5; local541++) {
						this.aStringArray9[local541] = null;
						this.aBooleanArray11[local541] = false;
					}
					anInt1042 = 0;
					anInt933 = 0;
					anInt901 = 0;
					anInt834 = 0;
					anInt1027 = 0;
					anInt1004 = 0;
					anInt880 = 0;
					anInt990 = 0;
					anInt1005 = 0;
					this.method635();
				} else if (local76 == 3) {
					this.aString30 = "";
					this.aString31 = "Invalid username or password.";
				} else if (local76 == 4) {
					this.aString30 = "Your account has been disabled.";
					this.aString31 = "Please check your message-centre for details.";
				} else if (local76 == 5) {
					this.aString30 = "Your account is already logged in.";
					this.aString31 = "Try again in 60 secs...";
				} else if (local76 == 6) {
					this.aString30 = "RuneScape has been updated!";
					this.aString31 = "Please reload this page.";
				} else if (local76 == 7) {
					this.aString30 = "This world is full.";
					this.aString31 = "Please use a different world.";
				} else if (local76 == 8) {
					this.aString30 = "Unable to connect.";
					this.aString31 = "Login server offline.";
				} else if (local76 == 9) {
					this.aString30 = "Login limit exceeded.";
					this.aString31 = "Too many connections from your address.";
				} else if (local76 == 10) {
					this.aString30 = "Unable to connect.";
					this.aString31 = "Bad session id.";
				} else if (local76 == 12) {
					this.aString30 = "You need a members account to login to this world.";
					this.aString31 = "Please subscribe, or use a different world.";
				} else if (local76 == 13) {
					this.aString30 = "Could not complete login.";
					this.aString31 = "Please try using a different world.";
				} else if (local76 == 14) {
					this.aString30 = "The server is being updated.";
					this.aString31 = "Please wait 1 minute and try again.";
				} else if (local76 == 15) {
					this.aBoolean271 = true;
					this.aClass2_Sub1_Sub3_7.anInt136 = 0;
					this.aClass2_Sub1_Sub3_9.anInt136 = 0;
					this.anInt976 = -1;
					this.anInt1008 = -1;
					this.anInt1009 = -1;
					this.anInt1010 = -1;
					this.anInt975 = 0;
					this.anInt977 = 0;
					this.anInt974 = 0;
					this.anInt937 = 0;
					this.aBoolean241 = false;
					this.aLong32 = System.currentTimeMillis();
				} else if (local76 == 16) {
					this.aString30 = "Login attempts exceeded.";
					this.aString31 = "Please wait 1 minute and try again.";
				} else if (local76 == 17) {
					this.aString30 = "You are standing in a members-only area.";
					this.aString31 = "To play on this world move to a free area first";
				} else if (local76 == 20) {
					this.aString30 = "Invalid loginserver requested";
					this.aString31 = "Please try using a different world.";
				} else if (local76 == 21) {
					local392 = this.aClass6_1.method53();
					for (@Pc(910) int local910 = local392 + 3; local910 >= 0; local910--) {
						this.aString30 = "You have only just left another world";
						this.aString31 = "Your profile will be transferred in: " + local910;
						this.method700(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(932) Exception local932) {
						}
					}
					this.method620(arg0, arg1, arg2);
				} else if (local76 == 22) {
					this.aString30 = "Malformed login packet.";
					this.aString31 = "Please try again.";
				} else if (local76 == 23) {
					this.aString30 = "No reply from loginserver.";
					this.aString31 = "Please try again.";
				} else if (local76 == 24) {
					this.aString30 = "Error loading your profile.";
					this.aString31 = "Please contact customer support.";
				} else if (local76 == 25) {
					this.aString30 = "Unexpected loginserver response.";
					this.aString31 = "Please try using a different world.";
				} else if (local76 == 26) {
					this.aString30 = "This computers address has been blocked";
					this.aString31 = "as it was used to break our rules";
				} else if (local76 != -1) {
					System.out.println("response:" + local76);
					this.aString30 = "Unexpected server response";
					this.aString31 = "Please try using a different world.";
				} else if (local78 != 0) {
					this.aString30 = "No response from server";
					this.aString31 = "Please try using a different world.";
				} else if (this.anInt955 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1004) Exception local1004) {
					}
					this.anInt955++;
					this.method620(arg0, arg1, arg2);
				} else {
					this.aString30 = "No response from loginserver";
					this.aString31 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1047) IOException local1047) {
			this.aString30 = "";
			this.aString31 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt861 = Integer.parseInt(this.getParameter("nodeid"));
		anInt862 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method623(anInt1014);
		} else {
			method683();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean249 = false;
		} else {
			aBoolean249 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method621() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray212[8] = 0;
			@Pc(14) int local14;
			if (this.aByte32 != 4) {
				for (local14 = 1; local14 > 0; local14++) {
				}
			}
			local14 = 0;
			while (this.anIntArray212[8] == 0) {
				@Pc(25) String local25 = "Unknown problem";
				this.method588("Connecting to web server", 20, (byte) 5);
				try {
					@Pc(47) DataInputStream local47 = this.method634("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 364);
					@Pc(54) Class2_Sub1_Sub3 local54 = new Class2_Sub1_Sub3(new byte[40], true);
					local47.readFully(local54.aByteArray10, 0, 40);
					local47.close();
					for (@Pc(64) int local64 = 0; local64 < 9; local64++) {
						this.anIntArray212[local64] = local54.method102();
					}
					@Pc(79) int local79 = local54.method102();
					@Pc(81) int local81 = 1234;
					for (@Pc(83) int local83 = 0; local83 < 9; local83++) {
						local81 = (local81 << 1) + this.anIntArray212[local83];
					}
					if (local79 != local81) {
						local25 = "checksum problem";
						this.anIntArray212[8] = 0;
					}
				} catch (@Pc(110) EOFException local110) {
					local25 = "EOF problem";
					this.anIntArray212[8] = 0;
				} catch (@Pc(119) IOException local119) {
					local25 = "connection problem";
					this.anIntArray212[8] = 0;
				} catch (@Pc(128) Exception local128) {
					local25 = "logic problem";
					this.anIntArray212[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray212[8] == 0) {
					local14++;
					for (@Pc(146) int local146 = local3; local146 > 0; local146--) {
						if (local14 >= 10) {
							this.method588("Game updated - please reload page", 10, (byte) 5);
							local146 = 10;
						} else {
							this.method588(local25 + " - Will retry in " + local146 + " secs.", 10, (byte) 5);
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
					this.aBoolean253 = !this.aBoolean253;
				}
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("46207, " + 4 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method622(@OriginalArg(0) int arg0) {
		try {
			if (anInt874 == 43360) {
				Class31.method292(arg0);
			}
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("92587, " + arg0 + ", " + 43360 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method624(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray264[arg0];
				@Pc(14) int local14 = this.anIntArray265[arg0];
				@Pc(19) int local19 = this.anIntArray266[arg0];
				@Pc(24) int local24 = this.anIntArray267[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt973 != 0 && local19 != 1196) {
					this.anInt973 = 0;
					this.aBoolean252 = true;
				}
				if (local19 == 850) {
					this.anInt830 = 1;
					this.anInt831 = local9;
					this.anInt832 = local14;
					this.anInt833 = local24;
					this.aString18 = String.valueOf(Class38.method391(local24).aString13);
					this.anInt820 = 0;
					this.aBoolean256 = true;
				} else {
					@Pc(83) Class31 local83;
					@Pc(101) int local101;
					if (local19 == 324) {
						this.aClass2_Sub1_Sub3_7.method86(129, 533);
						this.aClass2_Sub1_Sub3_7.method88(local14);
						local83 = Class31.method293(local14);
						if (local83.anIntArrayArray18 != null && local83.anIntArrayArray18[0][0] == 5) {
							local101 = local83.anIntArrayArray18[0][1];
							if (this.anIntArray244[local101] != local83.anIntArray134[0]) {
								this.anIntArray244[local101] = local83.anIntArray134[0];
								this.method616(local101);
								this.aBoolean256 = true;
							}
						}
					}
					@Pc(149) boolean local149;
					if (local19 == 146) {
						local149 = this.method653(false, 2, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						if (!local149) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						}
						this.anInt1021 = super.anInt809;
						this.anInt1022 = super.anInt810;
						this.anInt1024 = 2;
						this.anInt1023 = 0;
						this.aClass2_Sub1_Sub3_7.method86(145, 533);
						this.aClass2_Sub1_Sub3_7.method124(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method123(this.anInt833);
						this.aClass2_Sub1_Sub3_7.method124(local14 + this.anInt908);
						this.aClass2_Sub1_Sub3_7.method88(this.anInt831);
						this.aClass2_Sub1_Sub3_7.method123(this.anInt832);
						this.aClass2_Sub1_Sub3_7.method122(local24);
					}
					@Pc(237) Class2_Sub1_Sub2_Sub3_Sub1 local237;
					if (local19 == 209) {
						local237 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local237 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local237.anIntArray180[0], local237.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(166, 533);
							this.aClass2_Sub1_Sub3_7.method122(this.anInt821);
							this.aClass2_Sub1_Sub3_7.method123(local24);
						}
					}
					if (local19 == 189) {
						local237 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local237 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local237.anIntArray180[0], local237.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							anInt1005++;
							if (anInt1005 >= 85) {
								this.aClass2_Sub1_Sub3_7.method86(191, 533);
								this.aClass2_Sub1_Sub3_7.method90(8044226);
								anInt1005 = 0;
							}
							this.aClass2_Sub1_Sub3_7.method86(162, 533);
							this.aClass2_Sub1_Sub3_7.method122(local24);
						}
					}
					@Pc(383) String local383;
					if (local19 == 265) {
						local383 = this.aStringArray12[arg0];
						local101 = local383.indexOf("@whi@");
						if (local101 != -1) {
							if (this.anInt850 == -1) {
								this.method669();
								this.aString29 = local383.substring(local101 + 5).trim();
								this.aBoolean275 = false;
								this.anInt1003 = this.anInt850 = Class31.anInt398;
							} else {
								this.method626("Please close the interface you have open before using 'report abuse'", 0, "");
							}
						}
					}
					if (local19 == 617) {
						this.method629(local9, local14, local24);
						this.aClass2_Sub1_Sub3_7.method86(171, 533);
						this.aClass2_Sub1_Sub3_7.method88(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method122(local24 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub3_7.method124(local14 + this.anInt908);
					}
					if (local19 == 416) {
						local149 = this.method653(false, 2, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						if (!local149) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						}
						this.anInt1021 = super.anInt809;
						this.anInt1022 = super.anInt810;
						this.anInt1024 = 2;
						this.anInt1023 = 0;
						this.aClass2_Sub1_Sub3_7.method86(84, 533);
						this.aClass2_Sub1_Sub3_7.method124(local24);
						this.aClass2_Sub1_Sub3_7.method123(local14 + this.anInt908);
						this.aClass2_Sub1_Sub3_7.method124(local9 + this.anInt907);
					}
					if (local19 == 721) {
						if ((this.anInt908 & 0x3) == 0) {
							anInt1004++;
						}
						if (anInt1004 >= 97) {
							this.aClass2_Sub1_Sub3_7.method86(36, 533);
							this.aClass2_Sub1_Sub3_7.method88(43864);
							anInt1004 = 0;
						}
						this.method629(local9, local14, local24);
						this.aClass2_Sub1_Sub3_7.method86(109, 533);
						this.aClass2_Sub1_Sub3_7.method124(local14 + this.anInt908);
						this.aClass2_Sub1_Sub3_7.method123(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method124(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 278) {
						local149 = this.method653(false, 2, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						if (!local149) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						}
						this.anInt1021 = super.anInt809;
						this.anInt1022 = super.anInt810;
						this.anInt1024 = 2;
						this.anInt1023 = 0;
						this.aClass2_Sub1_Sub3_7.method86(136, 533);
						this.aClass2_Sub1_Sub3_7.method123(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method88(local14 + this.anInt908);
						this.aClass2_Sub1_Sub3_7.method122(local24);
					}
					if (local19 == 242) {
						anInt834++;
						if (anInt834 >= 120) {
							this.aClass2_Sub1_Sub3_7.method86(44, 533);
							this.aClass2_Sub1_Sub3_7.method90(14465744);
							anInt834 = 0;
						}
						this.method629(local9, local14, local24);
						this.aClass2_Sub1_Sub3_7.method86(9, 533);
						this.aClass2_Sub1_Sub3_7.method124(local14 + this.anInt908);
						this.aClass2_Sub1_Sub3_7.method88(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method123(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 609) {
						local149 = this.method653(false, 2, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						if (!local149) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						}
						this.anInt1021 = super.anInt809;
						this.anInt1022 = super.anInt810;
						this.anInt1024 = 2;
						this.anInt1023 = 0;
						this.aClass2_Sub1_Sub3_7.method86(54, 533);
						this.aClass2_Sub1_Sub3_7.method124(local24);
						this.aClass2_Sub1_Sub3_7.method124(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method124(local14 + this.anInt908);
					}
					@Pc(873) long local873;
					if (local19 == 66 || local19 == 723 || local19 == 299 || local19 == 903) {
						local383 = this.aStringArray12[arg0];
						local101 = local383.indexOf("@whi@");
						if (local101 != -1) {
							local873 = Class40.method405(local383.substring(local101 + 5).trim());
							if (local19 == 66) {
								this.method726(local873);
							}
							if (local19 == 723) {
								this.method628((byte) 9, local873);
							}
							if (local19 == 299) {
								this.method672(local873);
							}
							if (local19 == 903) {
								this.method660(local873);
							}
						}
					}
					@Pc(922) String local922;
					if (local19 == 1263) {
						@Pc(910) int local910 = local24 >> 14 & 0x7FFF;
						@Pc(913) Class1 local913 = Class1.method4(local910);
						if (local913.aByteArray1 == null) {
							local922 = "It's a " + local913.aString1 + ".";
						} else {
							local922 = new String(local913.aByteArray1);
						}
						this.method626(local922, 0, "");
					}
					if (local19 == 1199) {
						local237 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local237 != null) {
							@Pc(954) Class46 local954 = local237.aClass46_1;
							if (local954.anIntArray192 != null) {
								local954 = local954.method481();
							}
							if (local954 != null) {
								if (local954.aByteArray20 == null) {
									local922 = "It's a " + local954.aString16 + ".";
								} else {
									local922 = new String(local954.aByteArray20);
								}
								this.method626(local922, 0, "");
							}
						}
					}
					@Pc(999) Class2_Sub1_Sub2_Sub3_Sub2 local999;
					if (local19 == 70) {
						local999 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local999 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local999.anIntArray180[0], local999.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							if ((local24 & 0x3) == 0) {
								anInt880++;
							}
							if (anInt880 >= 118) {
								this.aClass2_Sub1_Sub3_7.method86(223, 533);
								this.aClass2_Sub1_Sub3_7.method91(0);
								anInt880 = 0;
							}
							this.aClass2_Sub1_Sub3_7.method86(32, 533);
							this.aClass2_Sub1_Sub3_7.method123(local24);
						}
					}
					if (local19 == 461) {
						local999 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local999 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local999.anIntArray180[0], local999.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(48, 533);
							this.aClass2_Sub1_Sub3_7.method123(local24);
							this.aClass2_Sub1_Sub3_7.method123(this.anInt821);
						}
					}
					if (local19 == 10) {
						local237 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local237 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local237.anIntArray180[0], local237.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(60, 533);
							this.aClass2_Sub1_Sub3_7.method122(this.anInt831);
							this.aClass2_Sub1_Sub3_7.method88(local24);
							this.aClass2_Sub1_Sub3_7.method123(this.anInt832);
							this.aClass2_Sub1_Sub3_7.method122(this.anInt833);
						}
					}
					if (local19 == 269) {
						if (this.aBoolean241) {
							this.aClass47_1.method525(local14 - 4, local9 - 4);
						} else {
							this.aClass47_1.method525(super.anInt810 - 4, super.anInt809 - 4);
						}
					}
					if (local19 == 169) {
						local237 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local237 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local237.anIntArray180[0], local237.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							anInt1042 += local24;
							if (anInt1042 >= 85) {
								this.aClass2_Sub1_Sub3_7.method86(204, 533);
								this.aClass2_Sub1_Sub3_7.method90(2535407);
								anInt1042 = 0;
							}
							this.aClass2_Sub1_Sub3_7.method86(41, 533);
							this.aClass2_Sub1_Sub3_7.method88(local24);
						}
					}
					@Pc(1363) int local1363;
					if (local19 == 301 || local19 == 769) {
						local383 = this.aStringArray12[arg0];
						local101 = local383.indexOf("@whi@");
						if (local101 != -1) {
							local383 = local383.substring(local101 + 5).trim();
							local922 = Class40.method409(Class40.method406(Class40.method405(local383)));
							@Pc(1361) boolean local1361 = false;
							for (local1363 = 0; local1363 < this.anInt898; local1363++) {
								@Pc(1373) Class2_Sub1_Sub2_Sub3_Sub2 local1373 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray245[local1363]];
								if (local1373 != null && local1373.aString15 != null && local1373.aString15.equalsIgnoreCase(local922)) {
									this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local1373.anIntArray180[0], local1373.anIntArray181[0]);
									if (local19 == 301) {
										this.aClass2_Sub1_Sub3_7.method86(107, 533);
										this.aClass2_Sub1_Sub3_7.method88(this.anIntArray245[local1363]);
									}
									if (local19 == 769) {
										if ((local24 & 0x3) == 0) {
											anInt880++;
										}
										if (anInt880 >= 118) {
											this.aClass2_Sub1_Sub3_7.method86(223, 533);
											this.aClass2_Sub1_Sub3_7.method91(0);
											anInt880 = 0;
										}
										this.aClass2_Sub1_Sub3_7.method86(32, 533);
										this.aClass2_Sub1_Sub3_7.method123(this.anIntArray245[local1363]);
									}
									local1361 = true;
									break;
								}
							}
							if (!local1361) {
								this.method626("Unable to find " + local922, 0, "");
							}
						}
					}
					if (local19 == 608) {
						local237 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local237 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local237.anIntArray180[0], local237.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(229, 533);
							this.aClass2_Sub1_Sub3_7.method122(local24);
						}
					}
					if (local19 == 136) {
						local999 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local999 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local999.anIntArray180[0], local999.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(177, 533);
							this.aClass2_Sub1_Sub3_7.method88(local24);
						}
					}
					if (local19 == 394) {
						this.aClass2_Sub1_Sub3_7.method86(239, 533);
						this.aClass2_Sub1_Sub3_7.method123(local14);
						this.aClass2_Sub1_Sub3_7.method122(local24);
						this.aClass2_Sub1_Sub3_7.method88(local9);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 736) {
						this.method622(this.anInt991);
						this.anInt991 = -1;
						this.aBoolean252 = true;
					}
					if (local19 == 534) {
						this.aClass2_Sub1_Sub3_7.method86(220, 533);
						this.aClass2_Sub1_Sub3_7.method88(local9);
						this.aClass2_Sub1_Sub3_7.method122(local24);
						this.aClass2_Sub1_Sub3_7.method123(local14);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 930) {
						this.aClass2_Sub1_Sub3_7.method86(142, 533);
						this.aClass2_Sub1_Sub3_7.method124(local24);
						this.aClass2_Sub1_Sub3_7.method122(local14);
						this.aClass2_Sub1_Sub3_7.method88(local9);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 4) {
						this.aClass2_Sub1_Sub3_7.method86(110, 533);
						this.aClass2_Sub1_Sub3_7.method88(local14);
						this.aClass2_Sub1_Sub3_7.method123(local24);
						this.aClass2_Sub1_Sub3_7.method122(local9);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					@Pc(1844) String local1844;
					@Pc(1835) Class38 local1835;
					if (local19 == 1069) {
						local1835 = Class38.method391(local24);
						if (local1835.aByteArray18 == null) {
							local1844 = "It's a " + local1835.aString13 + ".";
						} else {
							local1844 = new String(local1835.aByteArray18);
						}
						this.method626(local1844, 0, "");
					}
					if (local19 == 399) {
						local149 = this.method653(false, 2, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						if (!local149) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						}
						this.anInt1021 = super.anInt809;
						this.anInt1022 = super.anInt810;
						this.anInt1024 = 2;
						this.anInt1023 = 0;
						this.aClass2_Sub1_Sub3_7.method86(70, 533);
						this.aClass2_Sub1_Sub3_7.method88(local14 + this.anInt908);
						this.aClass2_Sub1_Sub3_7.method123(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method122(this.anInt821);
						this.aClass2_Sub1_Sub3_7.method124(local24);
					}
					if (local19 == 335) {
						this.aClass2_Sub1_Sub3_7.method86(116, 533);
						this.aClass2_Sub1_Sub3_7.method124(local14);
						this.aClass2_Sub1_Sub3_7.method123(this.anInt832);
						this.aClass2_Sub1_Sub3_7.method122(local24);
						this.aClass2_Sub1_Sub3_7.method88(this.anInt831);
						this.aClass2_Sub1_Sub3_7.method124(this.anInt833);
						this.aClass2_Sub1_Sub3_7.method122(local9);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 446) {
						anInt933++;
						if (anInt933 >= 66) {
							this.aClass2_Sub1_Sub3_7.method86(66, 533);
							this.aClass2_Sub1_Sub3_7.method90(16006891);
							anInt933 = 0;
						}
						this.aClass2_Sub1_Sub3_7.method86(222, 533);
						this.aClass2_Sub1_Sub3_7.method124(local14);
						this.aClass2_Sub1_Sub3_7.method88(local24);
						this.aClass2_Sub1_Sub3_7.method88(local9);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 253) {
						if ((local9 & 0x3) == 0) {
							anInt990++;
						}
						if (anInt990 >= 93) {
							this.aClass2_Sub1_Sub3_7.method86(157, 533);
							anInt990 = 0;
						}
						this.aClass2_Sub1_Sub3_7.method86(233, 533);
						this.aClass2_Sub1_Sub3_7.method123(local14);
						this.aClass2_Sub1_Sub3_7.method88(local24);
						this.aClass2_Sub1_Sub3_7.method123(local9);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 320) {
						local237 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local237 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local237.anIntArray180[0], local237.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							anInt1027++;
							if (anInt1027 >= 120) {
								this.aClass2_Sub1_Sub3_7.method86(242, 533);
								anInt1027 = 0;
							}
							this.aClass2_Sub1_Sub3_7.method86(15, 533);
							this.aClass2_Sub1_Sub3_7.method123(local24);
						}
					}
					if (local19 == 367) {
						local999 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local999 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local999.anIntArray180[0], local999.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(230, 533);
							this.aClass2_Sub1_Sub3_7.method88(local24);
						}
					}
					if (local19 == 997) {
						local83 = Class31.method293(local14);
						@Pc(2307) boolean local2307 = true;
						if (local83.anInt405 > 0) {
							local2307 = this.method667(local83);
						}
						if (local2307) {
							this.aClass2_Sub1_Sub3_7.method86(129, 533);
							this.aClass2_Sub1_Sub3_7.method88(local14);
						}
					}
					if (local19 == 1217) {
						local1835 = Class38.method391(local24);
						@Pc(2335) Class31 local2335 = Class31.method293(local14);
						if (local2335 != null && local2335.anIntArray130[local9] >= 100000) {
							local1844 = local2335.anIntArray130[local9] + " x " + local1835.aString13;
						} else if (local1835.aByteArray18 == null) {
							local1844 = "It's a " + local1835.aString13 + ".";
						} else {
							local1844 = new String(local1835.aByteArray18);
						}
						this.method626(local1844, 0, "");
					}
					if (local19 == 321) {
						local999 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local999 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local999.anIntArray180[0], local999.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(107, 533);
							this.aClass2_Sub1_Sub3_7.method88(local24);
						}
					}
					if (local19 == 286) {
						this.aClass2_Sub1_Sub3_7.method86(189, 533);
						this.aClass2_Sub1_Sub3_7.method122(local24);
						this.aClass2_Sub1_Sub3_7.method88(local9);
						this.aClass2_Sub1_Sub3_7.method123(local14);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 210) {
						this.aClass2_Sub1_Sub3_7.method86(176, 533);
						this.aClass2_Sub1_Sub3_7.method124(local14);
						this.aClass2_Sub1_Sub3_7.method122(local9);
						this.aClass2_Sub1_Sub3_7.method124(local24);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 22 && !this.aBoolean281) {
						this.aClass2_Sub1_Sub3_7.method86(17, 533);
						this.aClass2_Sub1_Sub3_7.method88(local14);
						this.aBoolean281 = true;
					}
					if (local19 == 481) {
						local383 = this.aStringArray12[arg0];
						local101 = local383.indexOf("@whi@");
						if (local101 != -1) {
							local873 = Class40.method405(local383.substring(local101 + 5).trim());
							local1363 = -1;
							for (@Pc(2598) int local2598 = 0; local2598 < this.anInt892; local2598++) {
								if (this.aLongArray4[local2598] == local873) {
									local1363 = local2598;
									break;
								}
							}
							if (local1363 != -1 && this.anIntArray231[local1363] > 0) {
								this.aBoolean252 = true;
								this.anInt973 = 0;
								this.aBoolean244 = true;
								this.aString21 = "";
								this.anInt943 = 3;
								this.aLong33 = this.aLongArray4[local1363];
								this.aString27 = "Enter message to send to " + this.aStringArray8[local1363];
							}
						}
					}
					if (local19 == 913) {
						anInt901++;
						if (anInt901 >= 91) {
							this.aClass2_Sub1_Sub3_7.method86(2, 533);
							anInt901 = 0;
						}
						this.aClass2_Sub1_Sub3_7.method86(82, 533);
						this.aClass2_Sub1_Sub3_7.method88(local9);
						this.aClass2_Sub1_Sub3_7.method122(local14);
						this.aClass2_Sub1_Sub3_7.method88(local24);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 974) {
						local999 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local999 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local999.anIntArray180[0], local999.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(45, 533);
							this.aClass2_Sub1_Sub3_7.method88(local24);
						}
					}
					if (local19 == 1299) {
						this.method629(local9, local14, local24);
						this.aClass2_Sub1_Sub3_7.method86(187, 533);
						this.aClass2_Sub1_Sub3_7.method88(local14 + this.anInt908);
						this.aClass2_Sub1_Sub3_7.method88(local24 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub3_7.method88(local9 + this.anInt907);
					}
					if (local19 == 543) {
						this.method669();
					}
					if (local19 == 746) {
						this.aClass2_Sub1_Sub3_7.method86(173, 533);
						this.aClass2_Sub1_Sub3_7.method88(local9);
						this.aClass2_Sub1_Sub3_7.method122(local14);
						this.aClass2_Sub1_Sub3_7.method88(local24);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 871 && this.method629(local9, local14, local24)) {
						this.aClass2_Sub1_Sub3_7.method86(120, 533);
						this.aClass2_Sub1_Sub3_7.method122(this.anInt832);
						this.aClass2_Sub1_Sub3_7.method122(this.anInt833);
						this.aClass2_Sub1_Sub3_7.method122(local24 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub3_7.method123(this.anInt831);
						this.aClass2_Sub1_Sub3_7.method122(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method88(local14 + this.anInt908);
					}
					if (local19 == 82 && this.method629(local9, local14, local24)) {
						this.aClass2_Sub1_Sub3_7.method86(74, 533);
						this.aClass2_Sub1_Sub3_7.method122(local14 + this.anInt908);
						this.aClass2_Sub1_Sub3_7.method122(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method123(this.anInt821);
						this.aClass2_Sub1_Sub3_7.method88(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 88) {
						local237 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local237 != null) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local237.anIntArray180[0], local237.anIntArray181[0]);
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(21, 533);
							this.aClass2_Sub1_Sub3_7.method124(local24);
						}
					}
					if (local19 == 405) {
						this.aClass2_Sub1_Sub3_7.method86(129, 533);
						this.aClass2_Sub1_Sub3_7.method88(local14);
						local83 = Class31.method293(local14);
						if (local83.anIntArrayArray18 != null && local83.anIntArrayArray18[0][0] == 5) {
							local101 = local83.anIntArrayArray18[0][1];
							this.anIntArray244[local101] = 1 - this.anIntArray244[local101];
							this.method616(local101);
							this.aBoolean256 = true;
						}
					}
					if (local19 == 864) {
						this.aClass2_Sub1_Sub3_7.method86(201, 533);
						this.aClass2_Sub1_Sub3_7.method124(local14);
						this.aClass2_Sub1_Sub3_7.method122(this.anInt821);
						this.aClass2_Sub1_Sub3_7.method88(local24);
						this.aClass2_Sub1_Sub3_7.method123(local9);
						this.anInt980 = 0;
						this.anInt981 = local14;
						this.anInt982 = local9;
						this.anInt983 = 2;
						if (Class31.method293(local14).anInt406 == this.anInt850) {
							this.anInt983 = 1;
						}
						if (Class31.method293(local14).anInt406 == this.anInt849) {
							this.anInt983 = 3;
						}
					}
					if (local19 == 880) {
						local149 = this.method653(false, 2, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						if (!local149) {
							this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
						}
						this.anInt1021 = super.anInt809;
						this.anInt1022 = super.anInt810;
						this.anInt1024 = 2;
						this.anInt1023 = 0;
						this.aClass2_Sub1_Sub3_7.method86(232, 533);
						this.aClass2_Sub1_Sub3_7.method123(local9 + this.anInt907);
						this.aClass2_Sub1_Sub3_7.method124(local24);
						this.aClass2_Sub1_Sub3_7.method122(local14 + this.anInt908);
					}
					if (local19 == 632) {
						local83 = Class31.method293(local14);
						this.anInt820 = 1;
						this.anInt821 = local14;
						this.anInt822 = local83.anInt411;
						this.anInt830 = 0;
						this.aBoolean256 = true;
						local1844 = local83.aString7;
						if (local1844.indexOf(" ") != -1) {
							local1844 = local1844.substring(0, local1844.indexOf(" "));
						}
						local922 = local83.aString7;
						if (local922.indexOf(" ") != -1) {
							local922 = local922.substring(local922.indexOf(" ") + 1);
						}
						this.aString17 = local1844 + " " + local83.aString9 + " " + local922;
						if (this.anInt822 == 16) {
							this.aBoolean256 = true;
							this.anInt819 = 3;
							this.aBoolean240 = true;
						}
					} else {
						if (local19 == 846) {
							this.method629(local9, local14, local24);
							this.aClass2_Sub1_Sub3_7.method86(212, 533);
							this.aClass2_Sub1_Sub3_7.method123(local14 + this.anInt908);
							this.aClass2_Sub1_Sub3_7.method124(local9 + this.anInt907);
							this.aClass2_Sub1_Sub3_7.method123(local24 >> 14 & 0x7FFF);
						}
						if (local19 == 244) {
							local999 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local24];
							if (local999 != null) {
								this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local999.anIntArray180[0], local999.anIntArray181[0]);
								this.anInt1021 = super.anInt809;
								this.anInt1022 = super.anInt810;
								this.anInt1024 = 2;
								this.anInt1023 = 0;
								this.aClass2_Sub1_Sub3_7.method86(163, 533);
								this.aClass2_Sub1_Sub3_7.method123(local24);
								this.aClass2_Sub1_Sub3_7.method123(this.anInt831);
								this.aClass2_Sub1_Sub3_7.method123(this.anInt833);
								this.aClass2_Sub1_Sub3_7.method122(this.anInt832);
							}
						}
						if (local19 == 740) {
							local149 = this.method653(false, 2, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
							if (!local149) {
								this.method653(false, 2, 0, 1, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local9, local14);
							}
							this.anInt1021 = super.anInt809;
							this.anInt1022 = super.anInt810;
							this.anInt1024 = 2;
							this.anInt1023 = 0;
							this.aClass2_Sub1_Sub3_7.method86(52, 533);
							this.aClass2_Sub1_Sub3_7.method124(local9 + this.anInt907);
							this.aClass2_Sub1_Sub3_7.method88(local24);
							this.aClass2_Sub1_Sub3_7.method124(local14 + this.anInt908);
						}
						this.anInt830 = 0;
						this.anInt820 = 0;
						this.aBoolean256 = true;
					}
				}
			}
		} catch (@Pc(3539) RuntimeException local3539) {
			signlink.reporterror("13964, " + arg0 + ", " + true + ", " + local3539.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method625() {
		try {
			if (super.aClass42_2 == null) {
				this.method698();
				this.aClass42_19 = null;
				this.aClass42_20 = null;
				this.aClass42_21 = null;
				this.aClass42_22 = null;
				this.aClass42_23 = null;
				this.aClass42_24 = null;
				this.aClass42_25 = null;
				this.aClass42_26 = null;
				this.aBoolean271 &= true;
				this.aClass42_27 = null;
				this.aClass42_15 = null;
				this.aClass42_13 = null;
				this.aClass42_12 = null;
				this.aClass42_14 = null;
				this.aClass42_16 = null;
				this.aClass42_17 = null;
				this.aClass42_18 = null;
				super.aClass42_2 = new Class42(this.method586(), 765, 503, false);
				this.aBoolean282 = true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("6531, " + true + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
	private void method626(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg1 == 0 && this.anInt991 != -1) {
				this.aString23 = arg0;
				super.anInt808 = 0;
			}
			if (this.anInt849 == -1) {
				this.aBoolean252 = true;
			}
			for (@Pc(25) int local25 = 99; local25 > 0; local25--) {
				this.anIntArray270[local25] = this.anIntArray270[local25 - 1];
				this.aStringArray13[local25] = this.aStringArray13[local25 - 1];
				this.aStringArray14[local25] = this.aStringArray14[local25 - 1];
			}
			this.anIntArray270[0] = arg1;
			this.aStringArray13[0] = arg2;
			this.aStringArray14[0] = arg0;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("40361, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JNEOOHMF;B)V")
	private void method627(@OriginalArg(0) Class2_Sub2 arg0) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = -1;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			if (arg0.anInt208 == 0) {
				local9 = this.aClass47_1.method513(arg0.anInt207, arg0.anInt209, arg0.anInt210);
			}
			if (arg0.anInt208 == 1) {
				local9 = this.aClass47_1.method514(arg0.anInt207, arg0.anInt209, arg0.anInt210);
			}
			if (arg0.anInt208 == 2) {
				local9 = this.aClass47_1.method515(arg0.anInt207, arg0.anInt209, arg0.anInt210);
			}
			if (arg0.anInt208 == 3) {
				local9 = this.aClass47_1.method516(arg0.anInt207, arg0.anInt209, arg0.anInt210);
			}
			if (local9 != 0) {
				@Pc(84) int local84 = this.aClass47_1.method517(arg0.anInt207, arg0.anInt209, arg0.anInt210, local9);
				local11 = local9 >> 14 & 0x7FFF;
				local13 = local84 & 0x1F;
				local15 = local84 >> 6;
			}
			arg0.anInt212 = local11;
			arg0.anInt214 = local13;
			arg0.anInt213 = local15;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("96086, " + arg0 + ", " + -25 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588("Starting up", 20, (byte) 5);
		if (signlink.sunjava) {
			super.anInt797 = 5;
		}
		if (aBoolean251) {
			this.aBoolean269 = true;
			return;
		}
		aBoolean251 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method649();
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
			this.aBoolean268 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass45Array1[local107] = new Class45(516, signlink.aRandomAccessFile3, 500000, signlink.aRandomAccessFileArray1[local107], local107 + 1);
			}
		}
		try {
			this.method621();
			this.aClass22_2 = this.method652("title screen", "title", 25, 1, this.anIntArray212[1]);
			this.aClass2_Sub1_Sub1_Sub4_2 = new Class2_Sub1_Sub1_Sub4(aBoolean262, false, this.aClass22_2, "p11_full");
			this.aClass2_Sub1_Sub1_Sub4_3 = new Class2_Sub1_Sub1_Sub4(aBoolean262, false, this.aClass22_2, "p12_full");
			this.aClass2_Sub1_Sub1_Sub4_4 = new Class2_Sub1_Sub1_Sub4(aBoolean262, false, this.aClass22_2, "b12_full");
			this.aClass2_Sub1_Sub1_Sub4_5 = new Class2_Sub1_Sub1_Sub4(aBoolean262, true, this.aClass22_2, "q8_full");
			this.method695();
			this.method718();
			@Pc(203) Class22 local203 = this.method652("config", "config", 30, 2, this.anIntArray212[2]);
			@Pc(215) Class22 local215 = this.method652("interface", "interface", 35, 3, this.anIntArray212[3]);
			@Pc(227) Class22 local227 = this.method652("2d graphics", "media", 40, 4, this.anIntArray212[4]);
			@Pc(239) Class22 local239 = this.method652("textures", "textures", 45, 6, this.anIntArray212[6]);
			@Pc(251) Class22 local251 = this.method652("chat system", "wordenc", 50, 7, this.anIntArray212[7]);
			@Pc(263) Class22 local263 = this.method652("sound effects", "sounds", 55, 8, this.anIntArray212[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass47_1 = new Class47(this.anIntArrayArrayArray7, 104, 4, 0, 104);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass5Array1[local288] = new Class5(104, (byte) 51, 104);
			}
			this.aClass2_Sub1_Sub1_Sub3_13 = new Class2_Sub1_Sub1_Sub3(512, 512);
			@Pc(323) Class22 local323 = this.method652("update list", "versionlist", 60, 5, this.anIntArray212[5]);
			this.method588("Connecting to update server", 60, (byte) 5);
			this.aClass18_Sub1_1 = new Class18_Sub1();
			this.aClass18_Sub1_1.method203(local323, this);
			Class26.method219(this.aClass18_Sub1_1.method199());
			Class2_Sub1_Sub2_Sub2.method148(this.aClass18_Sub1_1.method201(0), this.aClass18_Sub1_1);
			if (!aBoolean250) {
				this.anInt968 = 0;
				this.aBoolean270 = true;
				this.aClass18_Sub1_1.method207(2, this.anInt968);
				while (this.aClass18_Sub1_1.method192() > 0) {
					this.method603((byte) 7);
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass18_Sub1_1.anInt235 > 3) {
						this.method636("ondemand");
						return;
					}
				}
			}
			this.method588("Requesting animations", 65, (byte) 5);
			@Pc(398) int local398 = this.aClass18_Sub1_1.method201(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass18_Sub1_1.method207(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass18_Sub1_1.method192() > 0) {
				local419 = local398 - this.aClass18_Sub1_1.method192();
				if (local419 > 0) {
					this.method588("Loading animations - " + local419 * 100 / local398 + "%", 65, (byte) 5);
				}
				this.method603((byte) 7);
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass18_Sub1_1.anInt235 > 3) {
					this.method636("ondemand");
					return;
				}
			}
			this.method588("Requesting models", 70, (byte) 5);
			local398 = this.aClass18_Sub1_1.method201(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass18_Sub1_1.method208(local419, anInt913);
				if ((local479 & 0x1) != 0) {
					this.aClass18_Sub1_1.method207(0, local419);
				}
			}
			local398 = this.aClass18_Sub1_1.method192();
			while (this.aClass18_Sub1_1.method192() > 0) {
				local479 = local398 - this.aClass18_Sub1_1.method192();
				if (local479 > 0) {
					this.method588("Loading models - " + local479 * 100 / local398 + "%", 70, (byte) 5);
				}
				this.method603((byte) 7);
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method588("Requesting maps", 75, (byte) 5);
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(47, 0, 48));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(47, 1, 48));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(48, 0, 48));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(48, 1, 48));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(49, 0, 48));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(49, 1, 48));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(47, 0, 47));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(47, 1, 47));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(48, 0, 47));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(48, 1, 47));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(48, 0, 148));
				this.aClass18_Sub1_1.method207(3, this.aClass18_Sub1_1.method194(48, 1, 148));
				local398 = this.aClass18_Sub1_1.method192();
				while (this.aClass18_Sub1_1.method192() > 0) {
					local479 = local398 - this.aClass18_Sub1_1.method192();
					if (local479 > 0) {
						this.method588("Loading maps - " + local479 * 100 / local398 + "%", 75, (byte) 5);
					}
					this.method603((byte) 7);
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass18_Sub1_1.method201(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass18_Sub1_1.method208(local479, anInt913);
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
					this.aClass18_Sub1_1.method200(0, local479, (byte) 8, local738);
				}
			}
			this.aClass18_Sub1_1.method196(aBoolean249, aBoolean276);
			if (!aBoolean250) {
				local398 = this.aClass18_Sub1_1.method201(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass18_Sub1_1.method193(local736)) {
						this.aClass18_Sub1_1.method200(2, local736, (byte) 8, (byte) 1);
					}
				}
			}
			this.method588("Unpacking media", 80, (byte) 5);
			this.aClass2_Sub1_Sub1_Sub1_13 = new Class2_Sub1_Sub1_Sub1(local227, "invback", 0);
			this.aClass2_Sub1_Sub1_Sub1_15 = new Class2_Sub1_Sub1_Sub1(local227, "chatback", 0);
			this.aClass2_Sub1_Sub1_Sub1_14 = new Class2_Sub1_Sub1_Sub1(local227, "mapback", 0);
			this.aClass2_Sub1_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub1(local227, "backbase1", 0);
			this.aClass2_Sub1_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub1(local227, "backbase2", 0);
			this.aClass2_Sub1_Sub1_Sub1_3 = new Class2_Sub1_Sub1_Sub1(local227, "backhmid1", 0);
			for (local736 = 0; local736 < 13; local736++) {
				this.aClass2_Sub1_Sub1_Sub1Array4[local736] = new Class2_Sub1_Sub1_Sub1(local227, "sideicons", local736);
			}
			this.aClass2_Sub1_Sub1_Sub3_14 = new Class2_Sub1_Sub1_Sub3(local227, "compass", 0);
			this.aClass2_Sub1_Sub1_Sub3_12 = new Class2_Sub1_Sub1_Sub3(local227, "mapedge", 0);
			this.aClass2_Sub1_Sub1_Sub3_12.method357((byte) 6);
			for (@Pc(938) int local938 = 0; local938 < 72; local938++) {
				this.aClass2_Sub1_Sub1_Sub1Array2[local938] = new Class2_Sub1_Sub1_Sub1(local227, "mapscene", local938);
			}
			for (@Pc(956) int local956 = 0; local956 < 70; local956++) {
				this.aClass2_Sub1_Sub1_Sub3Array5[local956] = new Class2_Sub1_Sub1_Sub3(local227, "mapfunction", local956);
			}
			for (@Pc(974) int local974 = 0; local974 < 5; local974++) {
				this.aClass2_Sub1_Sub1_Sub3Array6[local974] = new Class2_Sub1_Sub1_Sub3(local227, "hitmarks", local974);
			}
			for (@Pc(992) int local992 = 0; local992 < 6; local992++) {
				this.aClass2_Sub1_Sub1_Sub3Array7[local992] = new Class2_Sub1_Sub1_Sub3(local227, "headicons_pk", local992);
			}
			for (@Pc(1010) int local1010 = 0; local1010 < 9; local1010++) {
				this.aClass2_Sub1_Sub1_Sub3Array10[local1010] = new Class2_Sub1_Sub1_Sub3(local227, "headicons_prayer", local1010);
			}
			for (@Pc(1028) int local1028 = 0; local1028 < 6; local1028++) {
				this.aClass2_Sub1_Sub1_Sub3Array9[local1028] = new Class2_Sub1_Sub1_Sub3(local227, "headicons_hint", local1028);
			}
			this.aClass2_Sub1_Sub1_Sub3_15 = new Class2_Sub1_Sub1_Sub3(local227, "overlay_multiway", 0);
			this.aClass2_Sub1_Sub1_Sub3_16 = new Class2_Sub1_Sub1_Sub3(local227, "mapmarker", 0);
			this.aClass2_Sub1_Sub1_Sub3_17 = new Class2_Sub1_Sub1_Sub3(local227, "mapmarker", 1);
			for (@Pc(1070) int local1070 = 0; local1070 < 8; local1070++) {
				this.aClass2_Sub1_Sub1_Sub3Array8[local1070] = new Class2_Sub1_Sub1_Sub3(local227, "cross", local1070);
			}
			this.aClass2_Sub1_Sub1_Sub3_7 = new Class2_Sub1_Sub1_Sub3(local227, "mapdots", 0);
			this.aClass2_Sub1_Sub1_Sub3_8 = new Class2_Sub1_Sub1_Sub3(local227, "mapdots", 1);
			this.aClass2_Sub1_Sub1_Sub3_9 = new Class2_Sub1_Sub1_Sub3(local227, "mapdots", 2);
			this.aClass2_Sub1_Sub1_Sub3_10 = new Class2_Sub1_Sub1_Sub3(local227, "mapdots", 3);
			this.aClass2_Sub1_Sub1_Sub3_11 = new Class2_Sub1_Sub1_Sub3(local227, "mapdots", 4);
			this.aClass2_Sub1_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub1(local227, "scrollbar", 0);
			this.aClass2_Sub1_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub1(local227, "scrollbar", 1);
			this.aClass2_Sub1_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub1(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub1_7 = new Class2_Sub1_Sub1_Sub1(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub1_8 = new Class2_Sub1_Sub1_Sub1(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub1_Sub1_9 = new Class2_Sub1_Sub1_Sub1(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub1_9.method74();
			this.aClass2_Sub1_Sub1_Sub1_10 = new Class2_Sub1_Sub1_Sub1(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub1_10.method74();
			this.aClass2_Sub1_Sub1_Sub1_16 = new Class2_Sub1_Sub1_Sub1(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub1_16.method75((byte) 6);
			this.aClass2_Sub1_Sub1_Sub1_17 = new Class2_Sub1_Sub1_Sub1(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub1_17.method75((byte) 6);
			this.aClass2_Sub1_Sub1_Sub1_18 = new Class2_Sub1_Sub1_Sub1(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub1_Sub1_18.method75((byte) 6);
			this.aClass2_Sub1_Sub1_Sub1_19 = new Class2_Sub1_Sub1_Sub1(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub1_19.method74();
			this.aClass2_Sub1_Sub1_Sub1_19.method75((byte) 6);
			this.aClass2_Sub1_Sub1_Sub1_20 = new Class2_Sub1_Sub1_Sub1(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub1_20.method74();
			this.aClass2_Sub1_Sub1_Sub1_20.method75((byte) 6);
			for (@Pc(1260) int local1260 = 0; local1260 < 2; local1260++) {
				this.aClass2_Sub1_Sub1_Sub1Array3[local1260] = new Class2_Sub1_Sub1_Sub1(local227, "mod_icons", local1260);
			}
			@Pc(1283) Class2_Sub1_Sub1_Sub3 local1283 = new Class2_Sub1_Sub1_Sub3(local227, "backleft1", 0);
			this.aClass42_3 = new Class42(this.method586(), local1283.anInt524, local1283.anInt525, false);
			local1283.method358(anInt815, 0, 0);
			@Pc(1308) Class2_Sub1_Sub1_Sub3 local1308 = new Class2_Sub1_Sub1_Sub3(local227, "backleft2", 0);
			this.aClass42_4 = new Class42(this.method586(), local1308.anInt524, local1308.anInt525, false);
			local1308.method358(anInt815, 0, 0);
			@Pc(1333) Class2_Sub1_Sub1_Sub3 local1333 = new Class2_Sub1_Sub1_Sub3(local227, "backright1", 0);
			this.aClass42_5 = new Class42(this.method586(), local1333.anInt524, local1333.anInt525, false);
			local1333.method358(anInt815, 0, 0);
			@Pc(1358) Class2_Sub1_Sub1_Sub3 local1358 = new Class2_Sub1_Sub1_Sub3(local227, "backright2", 0);
			this.aClass42_6 = new Class42(this.method586(), local1358.anInt524, local1358.anInt525, false);
			local1358.method358(anInt815, 0, 0);
			@Pc(1383) Class2_Sub1_Sub1_Sub3 local1383 = new Class2_Sub1_Sub1_Sub3(local227, "backtop1", 0);
			this.aClass42_7 = new Class42(this.method586(), local1383.anInt524, local1383.anInt525, false);
			local1383.method358(anInt815, 0, 0);
			@Pc(1408) Class2_Sub1_Sub1_Sub3 local1408 = new Class2_Sub1_Sub1_Sub3(local227, "backvmid1", 0);
			this.aClass42_8 = new Class42(this.method586(), local1408.anInt524, local1408.anInt525, false);
			local1408.method358(anInt815, 0, 0);
			@Pc(1433) Class2_Sub1_Sub1_Sub3 local1433 = new Class2_Sub1_Sub1_Sub3(local227, "backvmid2", 0);
			this.aClass42_9 = new Class42(this.method586(), local1433.anInt524, local1433.anInt525, false);
			local1433.method358(anInt815, 0, 0);
			@Pc(1458) Class2_Sub1_Sub1_Sub3 local1458 = new Class2_Sub1_Sub1_Sub3(local227, "backvmid3", 0);
			this.aClass42_10 = new Class42(this.method586(), local1458.anInt524, local1458.anInt525, false);
			local1458.method358(anInt815, 0, 0);
			@Pc(1483) Class2_Sub1_Sub1_Sub3 local1483 = new Class2_Sub1_Sub1_Sub3(local227, "backhmid2", 0);
			this.aClass42_11 = new Class42(this.method586(), local1483.anInt524, local1483.anInt525, false);
			local1483.method358(anInt815, 0, 0);
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1529) int local1529 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1531) int local1531 = 0; local1531 < 100; local1531++) {
				if (this.aClass2_Sub1_Sub1_Sub3Array5[local1531] != null) {
					this.aClass2_Sub1_Sub1_Sub3Array5[local1531].method356(local1508 + local1529, local1522 + local1529, local1515 + local1529);
				}
				if (this.aClass2_Sub1_Sub1_Sub1Array2[local1531] != null) {
					this.aClass2_Sub1_Sub1_Sub1Array2[local1531].method76(local1508 + local1529, local1522 + local1529, local1515 + local1529);
				}
			}
			this.method588("Unpacking textures", 83, (byte) 5);
			Class2_Sub1_Sub1_Sub2.method259(local239);
			Class2_Sub1_Sub1_Sub2.method263(0.8D);
			Class2_Sub1_Sub1_Sub2.method258();
			this.method588("Unpacking config", 86, (byte) 5);
			Class39.method402(local203);
			Class1.method10(local203);
			Class32.method312(local203);
			Class38.method392(local203);
			Class46.method482(local203);
			Class30.method286(local203);
			Class33.method316(local203);
			Class15.method177(local203);
			Class10.method81(local203);
			Class38.aBoolean185 = aBoolean249;
			if (!aBoolean250) {
				this.method588("Unpacking sounds", 90, (byte) 5);
				@Pc(1634) byte[] local1634 = local263.method218("sounds.dat", null);
				@Pc(1640) Class2_Sub1_Sub3 local1640 = new Class2_Sub1_Sub3(local1634, true);
				Class21.method211(local1640);
			}
			this.method588("Unpacking interfaces", 95, (byte) 5);
			@Pc(1671) Class2_Sub1_Sub1_Sub4[] local1671 = new Class2_Sub1_Sub1_Sub4[] { this.aClass2_Sub1_Sub1_Sub4_2, this.aClass2_Sub1_Sub1_Sub4_3, this.aClass2_Sub1_Sub1_Sub4_4, this.aClass2_Sub1_Sub1_Sub4_5 };
			Class31.method298(local215, local1671, local227);
			this.method588("Preparing game engine", 100, (byte) 5);
			@Pc(1687) int local1687;
			@Pc(1689) int local1689;
			@Pc(1691) int local1691;
			for (@Pc(1683) int local1683 = 0; local1683 < 33; local1683++) {
				local1687 = 999;
				local1689 = 0;
				for (local1691 = 0; local1691 < 34; local1691++) {
					if (this.aClass2_Sub1_Sub1_Sub1_14.aByteArray9[local1691 + local1683 * this.aClass2_Sub1_Sub1_Sub1_14.anInt99] == 0) {
						if (local1687 == 999) {
							local1687 = local1691;
						}
					} else if (local1687 != 999) {
						local1689 = local1691;
						break;
					}
				}
				this.anIntArray221[local1683] = local1687;
				this.anIntArray214[local1683] = local1689 - local1687;
			}
			@Pc(1749) int local1749;
			for (local1687 = 5; local1687 < 156; local1687++) {
				local1689 = 999;
				local1691 = 0;
				for (local1749 = 25; local1749 < 172; local1749++) {
					if (this.aClass2_Sub1_Sub1_Sub1_14.aByteArray9[local1749 + local1687 * this.aClass2_Sub1_Sub1_Sub1_14.anInt99] == 0 && (local1749 > 34 || local1687 > 34)) {
						if (local1689 == 999) {
							local1689 = local1749;
						}
					} else if (local1689 != 999) {
						local1691 = local1749;
						break;
					}
				}
				this.anIntArray258[local1687 - 5] = local1689 - 25;
				this.anIntArray269[local1687 - 5] = local1691 - local1689;
			}
			Class2_Sub1_Sub1_Sub2.method256(765, 503);
			this.anIntArray255 = Class2_Sub1_Sub1_Sub2.anIntArray119;
			Class2_Sub1_Sub1_Sub2.method256(479, 96);
			this.anIntArray252 = Class2_Sub1_Sub1_Sub2.anIntArray119;
			Class2_Sub1_Sub1_Sub2.method256(190, 261);
			this.anIntArray253 = Class2_Sub1_Sub1_Sub2.anIntArray119;
			Class2_Sub1_Sub1_Sub2.method256(512, 334);
			this.anIntArray254 = Class2_Sub1_Sub1_Sub2.anIntArray119;
			@Pc(1840) int[] local1840 = new int[9];
			for (local1691 = 0; local1691 < 9; local1691++) {
				local1749 = local1691 * 32 + 128 + 15;
				@Pc(1858) int local1858 = local1749 * 3 + 600;
				@Pc(1862) int local1862 = Class2_Sub1_Sub1_Sub2.anIntArray117[local1749];
				local1840[local1691] = local1858 * local1862 >> 16;
			}
			Class47.method523(local1840);
			Class48.method538(local251);
			this.aClass23_1 = new Class23(this, false);
			this.method587(this.aClass23_1, 10);
			Class2_Sub1_Sub2_Sub4.aClient4 = this;
			Class1.aClient1 = this;
			Class46.aClient5 = this;
		} catch (@Pc(1903) Exception local1903) {
			signlink.reporterror("loaderror " + this.aString28 + " " + this.anInt1006);
			this.aBoolean279 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method628(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				if (this.anInt1011 >= 100) {
					this.method626("Your ignore list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(23) String local23 = Class40.method409(Class40.method406(arg1));
					for (@Pc(25) int local25 = 0; local25 < this.anInt1011; local25++) {
						if (this.aLongArray3[local25] == arg1) {
							this.method626(local23 + " is already on your ignore list", 0, "");
							return;
						}
					}
					@Pc(58) boolean local58 = false;
					for (@Pc(69) int local69 = 0; local69 < this.anInt892; local69++) {
						if (this.aLongArray4[local69] == arg1) {
							this.method626("Please remove " + local23 + " from your friend list first", 0, "");
							return;
						}
					}
					this.aLongArray3[this.anInt1011++] = arg1;
					this.aBoolean256 = true;
					this.aClass2_Sub1_Sub3_7.method86(119, 533);
					this.aClass2_Sub1_Sub3_7.method93(arg1);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("98220, " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			this.anInt975 += 0;
			@Pc(22) int local22 = this.aClass47_1.method517(this.anInt1028, arg0, arg1, arg2);
			if (local22 == -1) {
				return false;
			}
			@Pc(31) int local31 = local22 & 0x1F;
			@Pc(37) int local37 = local22 >> 6 & 0x3;
			if (local31 == 10 || local31 == 11 || local31 == 22) {
				@Pc(49) Class1 local49 = Class1.method4(local7);
				@Pc(57) int local57;
				@Pc(60) int local60;
				if (local37 == 0 || local37 == 2) {
					local57 = local49.anInt8;
					local60 = local49.anInt13;
				} else {
					local57 = local49.anInt13;
					local60 = local49.anInt8;
				}
				@Pc(71) int local71 = local49.anInt2;
				if (local37 != 0) {
					local71 = (local71 << local37 & 0xF) + (local71 >> 4 - local37);
				}
				this.method653(true, 2, local71, local57, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], local60, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], arg0, arg1);
			} else {
				this.method653(true, 2, 0, 0, local37, local31 + 1, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], arg0, arg1);
			}
			this.anInt1021 = super.anInt809;
			this.anInt1022 = super.anInt810;
			this.anInt1024 = 2;
			this.anInt1023 = 0;
			return true;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("41890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method630() {
		try {
			for (@Pc(6) Class2_Sub1_Sub2_Sub5 local6 = (Class2_Sub1_Sub2_Sub5) this.aClass41_12.method414(); local6 != null; local6 = (Class2_Sub1_Sub2_Sub5) this.aClass41_12.method416()) {
				if (local6.anInt358 != this.anInt1028 || local6.aBoolean139) {
					local6.method466();
				} else if (anInt856 >= local6.anInt362) {
					local6.method280(this.anInt902, this.aByte33);
					if (local6.aBoolean139) {
						local6.method466();
					} else {
						this.aClass47_1.method498(0, local6, local6.anInt358, local6.anInt361, local6.anInt359, local6.anInt360, -1, 60, false);
					}
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("45027, " + -46459 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method631() {
		try {
			if (this.anInt920 == 0) {
				@Pc(15) int local15 = super.anInt808;
				if (this.anInt820 == 1 && super.anInt809 >= 516 && super.anInt810 >= 160 && super.anInt809 <= 765 && super.anInt810 <= 205) {
					local15 = 0;
				}
				@Pc(46) int local46;
				@Pc(49) int local49;
				@Pc(125) int local125;
				if (this.aBoolean241) {
					if (local15 != 1) {
						local46 = super.anInt803;
						local49 = super.anInt804;
						if (this.anInt843 == 0) {
							local46 -= 4;
							local49 -= 4;
						}
						if (this.anInt843 == 1) {
							local46 -= 553;
							local49 -= 205;
						}
						if (this.anInt843 == 2) {
							local46 -= 17;
							local49 -= 357;
						}
						if (local46 < this.anInt844 - 10 || local46 > this.anInt844 + this.anInt846 + 10 || local49 < this.anInt845 - 10 || local49 > this.anInt845 + this.anInt847 + 10) {
							this.aBoolean241 = false;
							if (this.anInt843 == 1) {
								this.aBoolean256 = true;
							}
							if (this.anInt843 == 2) {
								this.aBoolean252 = true;
							}
						}
					}
					if (local15 == 1) {
						local46 = this.anInt844;
						local49 = this.anInt845;
						local125 = this.anInt846;
						@Pc(128) int local128 = super.anInt809;
						@Pc(131) int local131 = super.anInt810;
						if (this.anInt843 == 0) {
							local128 -= 4;
							local131 -= 4;
						}
						if (this.anInt843 == 1) {
							local128 -= 553;
							local131 -= 205;
						}
						if (this.anInt843 == 2) {
							local128 -= 17;
							local131 -= 357;
						}
						@Pc(150) int local150 = -1;
						for (@Pc(152) int local152 = 0; local152 < this.anInt937; local152++) {
							@Pc(167) int local167 = local49 + (this.anInt937 - 1 - local152) * 15 + 31;
							if (local128 > local46 && local128 < local46 + local125 && local131 > local167 - 13 && local131 < local167 + 3) {
								local150 = local152;
							}
						}
						if (local150 != -1) {
							this.method624(local150);
						}
						this.aBoolean241 = false;
						if (this.anInt843 == 1) {
							this.aBoolean256 = true;
						}
						if (this.anInt843 == 2) {
							this.aBoolean252 = true;
							return;
						}
					}
				} else {
					if (local15 == 1 && this.anInt937 > 0) {
						local46 = this.anIntArray266[this.anInt937 - 1];
						if (local46 == 746 || local46 == 4 || local46 == 253 || local46 == 534 || local46 == 930 || local46 == 446 || local46 == 286 || local46 == 210 || local46 == 394 || local46 == 913 || local46 == 850 || local46 == 1217) {
							local49 = this.anIntArray264[this.anInt937 - 1];
							local125 = this.anIntArray265[this.anInt937 - 1];
							@Pc(286) Class31 local286 = Class31.method293(local125);
							if (local286.aBoolean148 || local286.aBoolean146) {
								this.aBoolean273 = false;
								this.anInt835 = 0;
								this.anInt918 = local125;
								this.anInt919 = local49;
								this.anInt920 = 2;
								this.anInt921 = super.anInt809;
								this.anInt922 = super.anInt810;
								if (Class31.method293(local125).anInt406 == this.anInt850) {
									this.anInt920 = 1;
								}
								if (Class31.method293(local125).anInt406 == this.anInt849) {
									this.anInt920 = 3;
								}
								return;
							}
						}
					}
					if (local15 == 1 && (this.anInt988 == 1 || this.method639(this.anInt937 - 1, this.anInt1035)) && this.anInt937 > 2) {
						local15 = 2;
					}
					if (local15 == 1 && this.anInt937 > 0) {
						this.method624(this.anInt937 - 1);
					}
					if (local15 != 2 || this.anInt937 <= 0) {
						return;
					}
					this.method589(this.anInt915);
				}
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("70901, " + -9398 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!QXTIWHBH;)Z")
	private boolean method632(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt405;
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
				this.aStringArray12[this.anInt937] = "Remove @whi@" + this.aStringArray8[local4];
				this.anIntArray266[this.anInt937] = 299;
				this.anInt937++;
				this.aStringArray12[this.anInt937] = "Message @whi@" + this.aStringArray8[local4];
				this.anIntArray266[this.anInt937] = 481;
				this.anInt937++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray12[this.anInt937] = "Remove @whi@" + arg0.aString10;
				this.anIntArray266[this.anInt937] = 903;
				this.anInt937++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("31742, " + false + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg2 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg0;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class2_Sub1_Sub2_Sub2.anIntArray73[local5];
				local27 = Class2_Sub1_Sub2_Sub2.anIntArray74[local5];
				local37 = local27 * 0 - arg0 * local23 >> 16;
				local17 = local23 * 0 + arg0 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class2_Sub1_Sub2_Sub2.anIntArray73[local11];
				local27 = Class2_Sub1_Sub2_Sub2.anIntArray74[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt1015 = arg1 - local13;
			this.anInt1016 = arg3 - local15;
			this.anInt1017 = arg5 - local17;
			this.anInt1018 = arg2;
			this.anInt1019 = arg4;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("76874, " + arg0 + ", " + -383 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method634(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean253) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method644(43595);
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

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method635() {
		try {
			if (this.aClass42_15 == null) {
				this.method698();
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
				this.aClass42_15 = new Class42(this.method586(), 479, 96, false);
				this.aClass42_13 = new Class42(this.method586(), 172, 156, false);
				Class2_Sub1_Sub1.method434();
				this.aClass2_Sub1_Sub1_Sub1_14.method77(0, 0);
				this.aClass42_12 = new Class42(this.method586(), 190, 261, false);
				this.aClass42_14 = new Class42(this.method586(), 512, 334, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_16 = new Class42(this.method586(), 496, 50, false);
				this.aClass42_17 = new Class42(this.method586(), 269, 37, false);
				this.aClass42_18 = new Class42(this.method586(), 249, 45, false);
				this.aBoolean282 = true;
				this.aClass42_14.method425();
				Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("10377, " + 0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean269 || this.aBoolean279 || this.aBoolean268) {
				this.method699(this.aBoolean259);
			} else {
				anInt890++;
				if (this.aBoolean271) {
					this.method692();
				} else {
					this.method700(false);
				}
				this.anInt972 = 0;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("20241, " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method636(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method637(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg0) {
				if (aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 >> 7 == this.anInt928 && aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 >> 7 == this.anInt929) {
					this.anInt928 = 0;
					anInt923++;
					if (anInt923 > 175) {
						anInt923 = 0;
						this.aClass2_Sub1_Sub3_7.method86(202, 533);
						this.aClass2_Sub1_Sub3_7.method91(0);
					}
				}
				@Pc(42) int local42 = this.anInt898;
				if (arg1) {
					local42 = 1;
				}
				for (@Pc(48) int local48 = 0; local48 < local42; local48++) {
					@Pc(54) Class2_Sub1_Sub2_Sub3_Sub2 local54;
					@Pc(59) int local59;
					if (arg1) {
						local54 = aClass2_Sub1_Sub2_Sub3_Sub2_1;
						local59 = this.anInt897 << 14;
					} else {
						local54 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray245[local48]];
						local59 = this.anIntArray245[local48] << 14;
					}
					if (local54 != null && local54.method473()) {
						local54.aBoolean218 = false;
						if ((aBoolean250 && this.anInt898 > 50 || this.anInt898 > 200) && !arg1 && local54.anInt693 == local54.anInt661) {
							local54.aBoolean218 = true;
						}
						@Pc(110) int local110 = local54.anInt679 >> 7;
						@Pc(115) int local115 = local54.anInt680 >> 7;
						if (local110 >= 0 && local110 < 104 && local115 >= 0 && local115 < 104) {
							if (local54.aClass2_Sub1_Sub2_Sub2_2 == null || anInt856 < local54.anInt711 || anInt856 >= local54.anInt712) {
								if ((local54.anInt679 & 0x7F) == 64 && (local54.anInt680 & 0x7F) == 64) {
									if (this.anIntArrayArray24[local110][local115] == this.anInt1040) {
										continue;
									}
									this.anIntArrayArray24[local110][local115] = this.anInt1040;
								}
								local54.anInt713 = this.method657(this.anInt1028, local54.anInt679, local54.anInt680);
								this.aClass47_1.method498(local54.anInt681, local54, this.anInt1028, local54.anInt713, local54.anInt679, local54.anInt680, local59, 60, local54.aBoolean217);
							} else {
								local54.aBoolean218 = false;
								local54.anInt713 = this.method657(this.anInt1028, local54.anInt679, local54.anInt680);
								this.aClass47_1.method499(local54.anInt680, local54, local59, local54.anInt681, local54.anInt708, local54.anInt679, local54.anInt705, local54.anInt707, (byte) 5, this.anInt1028, local54.anInt706, local54.anInt713);
							}
						}
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("81081, " + arg0 + ", " + arg1 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method638() {
		try {
			this.method679();
			if (this.anInt1024 == 1) {
				this.aClass2_Sub1_Sub1_Sub3Array8[this.anInt1023 / 100].method360(this.anInt1021 - 8 - 4, this.anInt1022 - 8 - 4);
			}
			@Pc(88) int local88;
			if (this.anInt1024 == 2) {
				this.aClass2_Sub1_Sub1_Sub3Array8[this.anInt1023 / 100 + 4].method360(this.anInt1021 - 8 - 4, this.anInt1022 - 8 - 4);
				anInt989++;
				if (anInt989 > 1608) {
					anInt989 = 0;
					this.aClass2_Sub1_Sub3_7.method86(31, 533);
					this.aClass2_Sub1_Sub3_7.method87(0);
					local88 = this.aClass2_Sub1_Sub3_7.anInt136;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub3_7.method87(22);
					}
					this.aClass2_Sub1_Sub3_7.method87(218);
					this.aClass2_Sub1_Sub3_7.method87(64);
					this.aClass2_Sub1_Sub3_7.method88(3198);
					this.aClass2_Sub1_Sub3_7.method88(5250);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub3_7.method88(5949);
					}
					this.aClass2_Sub1_Sub3_7.method87((int) (Math.random() * 256.0D));
					this.aClass2_Sub1_Sub3_7.method88(32257);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub3_7.method88(41491);
					}
					this.aClass2_Sub1_Sub3_7.method88(44938);
					this.aClass2_Sub1_Sub3_7.method96(this.aClass2_Sub1_Sub3_7.anInt136 - local88);
				}
			}
			if (this.anInt1007 != -1) {
				this.method713(this.anInt1007, this.anInt902);
				this.method725(0, Class31.method293(this.anInt1007), 0, 0);
			}
			if (this.anInt850 != -1) {
				this.method713(this.anInt850, this.anInt902);
				this.method725(0, Class31.method293(this.anInt850), 0, 0);
			}
			this.method706();
			if (!this.aBoolean241) {
				this.method662();
				this.method676();
			} else if (this.anInt843 == 0) {
				this.method610();
			}
			if (this.anInt985 == 1) {
				this.aClass2_Sub1_Sub1_Sub3_15.method360(472, 296);
			}
			@Pc(267) int local267;
			if (aBoolean257) {
				@Pc(233) byte local233 = 20;
				@Pc(235) int local235 = 16776960;
				if (super.anInt798 < 30 && aBoolean250) {
					local235 = 16711680;
				}
				if (super.anInt798 < 20 && !aBoolean250) {
					local235 = 16711680;
				}
				this.aClass2_Sub1_Sub1_Sub4_3.method443(local235, "Fps:" + super.anInt798, 20);
				local267 = local233 + 15;
				@Pc(269) Runtime local269 = Runtime.getRuntime();
				@Pc(278) int local278 = (int) ((local269.totalMemory() - local269.freeMemory()) / 1024L);
				if (local278 > 33554432 && aBoolean250) {
				}
				if (local278 > 67108864 && !aBoolean250) {
				}
				this.aClass2_Sub1_Sub1_Sub4_3.method443(16776960, "Mem:" + local278 + "k", 35);
				local267 += 15;
			}
			if (this.anInt974 != 0) {
				local88 = this.anInt974 / 50;
				local267 = local88 / 60;
				local88 %= 60;
				if (local88 < 10) {
					this.aClass2_Sub1_Sub1_Sub4_3.method448("System update in: " + local267 + ":0" + local88, 4, 16776960, 329);
				} else {
					this.aClass2_Sub1_Sub1_Sub4_3.method448("System update in: " + local267 + ":" + local88, 4, 16776960, 329);
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("94896, " + 0 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
	private boolean method639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray266[arg0];
			if (arg1 >= 0) {
				this.aClass2_Sub1_Sub3_7.method87(182);
			}
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 66;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("43376, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method640() {
		try {
			if (aBoolean250 && this.anInt935 == 2 && Class34.anInt485 != this.anInt1028) {
				this.method702(null, this.aByte35, "Loading - please wait.");
				this.anInt935 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt935 == 1) {
				@Pc(32) int local32 = this.method641();
				if (local32 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString25 + " glcfb " + this.aLong31 + "," + local32 + "," + aBoolean250 + "," + this.aClass45Array1[0] + "," + this.aClass18_Sub1_1.method192() + "," + this.anInt1028 + "," + this.anInt875 + "," + this.anInt876);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt935 == 2 && this.anInt1028 != this.anInt863) {
				this.anInt863 = this.anInt1028;
				this.method714(this.anInt1028);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("97879, " + false + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
	private int method641() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray233[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray234[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray232[local41] >> 8) * 64 - this.anInt907;
					@Pc(74) int local74 = (this.anIntArray232[local41] & 0xFF) * 64 - this.anInt908;
					if (this.aBoolean274) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class34.method340(local62, local48, local74, this.aBoolean283);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean246) {
				return -4;
			} else {
				this.anInt935 = 2;
				Class34.anInt485 = this.anInt1028;
				this.method693();
				this.aClass2_Sub1_Sub3_7.method86(169, 533);
				return 0;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("45807, " + 1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!EMWAMCXW;I)V")
	private void method642(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method107();
			@Pc(11) int local11 = arg0.method108(1);
			if (local11 != 0) {
				@Pc(19) int local19 = arg0.method108(2);
				if (local19 == 0) {
					this.anIntArray246[this.anInt899++] = this.anInt897;
				} else {
					@Pc(42) int local42;
					@Pc(52) int local52;
					if (local19 == 1) {
						local42 = arg0.method108(3);
						aClass2_Sub1_Sub2_Sub3_Sub2_1.method474(local42, false);
						local52 = arg0.method108(1);
						if (local52 == 1) {
							this.anIntArray246[this.anInt899++] = this.anInt897;
						}
					} else {
						@Pc(96) int local96;
						if (local19 == 2) {
							local42 = arg0.method108(3);
							aClass2_Sub1_Sub2_Sub3_Sub2_1.method474(local42, true);
							local52 = arg0.method108(3);
							aClass2_Sub1_Sub2_Sub3_Sub2_1.method474(local52, true);
							local96 = arg0.method108(1);
							if (local96 == 1) {
								this.anIntArray246[this.anInt899++] = this.anInt897;
							}
						} else if (local19 == 3) {
							local42 = arg0.method108(1);
							local52 = arg0.method108(7);
							local96 = arg0.method108(7);
							this.anInt1028 = arg0.method108(2);
							@Pc(141) int local141 = arg0.method108(1);
							if (local141 == 1) {
								this.anIntArray246[this.anInt899++] = this.anInt897;
							}
							aClass2_Sub1_Sub2_Sub3_Sub2_1.method470(local52, local42 == 1, this.anInt884, local96);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("93451, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	@Override
	protected void method588(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt1006 = arg1;
			this.aString28 = arg0;
			this.method717();
			if (this.aClass22_2 == null) {
				super.method588(arg0, arg1, (byte) 5);
			} else {
				this.aClass42_21.method425();
				this.aClass2_Sub1_Sub1_Sub4_4.method444("RuneScape is loading - please wait...", 936, 16777215, 180, 54);
				@Pc(48) boolean local48 = false;
				Class2_Sub1_Sub1.method437(28, 304, 9179409, 34, 62);
				Class2_Sub1_Sub1.method437(29, 302, 0, 32, 63);
				Class2_Sub1_Sub1.method436(30, 64, this.anInt967, 9179409, arg1 * 3, 30);
				Class2_Sub1_Sub1.method436(arg1 * 3 + 30, 64, this.anInt967, 0, 300 - arg1 * 3, 30);
				this.aClass2_Sub1_Sub1_Sub4_4.method444(arg0, 936, 16777215, 180, 85);
				this.aClass42_21.method426(171, 202, super.aGraphics2);
				if (this.aBoolean282) {
					this.aBoolean282 = false;
					if (!this.aBoolean261) {
						this.aClass42_22.method426(0, 0, super.aGraphics2);
						this.aClass42_23.method426(0, 637, super.aGraphics2);
					}
					this.aClass42_19.method426(0, 128, super.aGraphics2);
					this.aClass42_20.method426(371, 202, super.aGraphics2);
					this.aClass42_24.method426(265, 0, super.aGraphics2);
					this.aClass42_25.method426(265, 562, super.aGraphics2);
					this.aClass42_26.method426(171, 128, super.aGraphics2);
					this.aClass42_27.method426(171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(224) RuntimeException local224) {
			signlink.reporterror("69209, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local224.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method643() {
		try {
			if (this.anInt979 > 0) {
				this.method701();
			} else {
				this.method702("Please wait - attempting to reestablish", this.aByte35, "Connection lost");
				this.anInt872 = 0;
				this.anInt928 = 0;
				@Pc(21) Class6 local21 = this.aClass6_1;
				this.aBoolean271 = false;
				this.anInt955 = 0;
				this.method620(this.aString25, this.aString26, true);
				if (!this.aBoolean271) {
					this.method701();
				}
				try {
					local21.method52();
				} catch (@Pc(51) Exception local51) {
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("52966, " + -602 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)Ljava/net/Socket;")
	public Socket method644(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)Z")
	private boolean method645() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("3602, " + -44059 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILclient!TFHGRYAS;)V")
	private void method646(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub1_Sub3 arg3) {
		try {
			if (arg3 != null) {
				@Pc(12) int local12 = this.anInt925 + this.anInt869 & 0x7FF;
				@Pc(20) int local20 = arg2 * arg2 + arg1 * arg1;
				if (local20 <= 6400) {
					@Pc(28) int local28 = Class2_Sub1_Sub2_Sub2.anIntArray73[local12];
					@Pc(32) int local32 = Class2_Sub1_Sub2_Sub2.anIntArray74[local12];
					@Pc(41) int local41 = local28 * 256 / (this.anInt864 + 256);
					@Pc(50) int local50 = local32 * 256 / (this.anInt864 + 256);
					@Pc(60) int local60 = arg1 * local41 + arg2 * local50 >> 16;
					@Pc(70) int local70 = arg1 * local50 - arg2 * local41 >> 16;
					@Pc(75) boolean local75 = false;
					if (local20 > 2500) {
						arg3.method366(local60 + 94 + 4 - arg3.anInt528 / 2, this.aClass2_Sub1_Sub1_Sub1_14, 83 - local70 - arg3.anInt529 / 2 - 4);
					} else {
						arg3.method360(local60 + 94 + 4 - arg3.anInt528 / 2, 83 - local70 - arg3.anInt529 / 2 - 4);
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("9468, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method647() {
		try {
			this.anInt878 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt898 + this.anInt829; local6++) {
				@Pc(13) Class2_Sub1_Sub2_Sub3 local13;
				if (local6 == -1) {
					local13 = aClass2_Sub1_Sub2_Sub3_Sub2_1;
				} else if (local6 < this.anInt898) {
					local13 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray245[local6]];
				} else {
					local13 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray217[local6 - this.anInt898]];
				}
				if (local13 != null && local13.method473()) {
					@Pc(54) Class46 local54;
					if (local13 instanceof Class2_Sub1_Sub2_Sub3_Sub1) {
						local54 = ((Class2_Sub1_Sub2_Sub3_Sub1) local13).aClass46_1;
						if (local54.anIntArray192 != null) {
							local54 = local54.method481();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt898) {
						local54 = ((Class2_Sub1_Sub2_Sub3_Sub1) local13).aClass46_1;
						if (local54.anInt741 >= 0 && local54.anInt741 < this.aClass2_Sub1_Sub1_Sub3Array10.length) {
							this.method664(local13.anInt656 + 15, local13);
							if (this.anInt948 > -1) {
								this.aClass2_Sub1_Sub1_Sub3Array10[local54.anInt741].method360(this.anInt948 - 12, this.anInt949 - 30);
							}
						}
						if (this.anInt848 == 1 && this.anInt900 == this.anIntArray217[local6 - this.anInt898] && anInt856 % 20 < 10) {
							this.method664(local13.anInt656 + 15, local13);
							if (this.anInt948 > -1) {
								this.aClass2_Sub1_Sub1_Sub3Array9[0].method360(this.anInt948 - 12, this.anInt949 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class2_Sub1_Sub2_Sub3_Sub2 local73 = (Class2_Sub1_Sub2_Sub3_Sub2) local13;
						if (local73.anInt722 != -1 || local73.anInt719 != -1) {
							this.method664(local13.anInt656 + 15, local13);
							if (this.anInt948 > -1) {
								if (local73.anInt722 != -1) {
									this.aClass2_Sub1_Sub1_Sub3Array7[local73.anInt722].method360(this.anInt948 - 12, this.anInt949 - 30);
									local70 += 25;
								}
								if (local73.anInt719 != -1) {
									this.aClass2_Sub1_Sub1_Sub3Array10[local73.anInt719].method360(this.anInt948 - 12, this.anInt949 - local70);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt848 == 10 && this.anInt971 == this.anIntArray245[local6]) {
							this.method664(local13.anInt656 + 15, local13);
							if (this.anInt948 > -1) {
								this.aClass2_Sub1_Sub1_Sub3Array9[1].method360(this.anInt948 - 12, this.anInt949 - local70);
							}
						}
					}
					if (local13.aString14 != null && (local6 >= this.anInt898 || this.anInt941 == 0 || this.anInt941 == 3 || this.anInt941 == 1 && this.method651(((Class2_Sub1_Sub2_Sub3_Sub2) local13).aString15))) {
						this.method664(local13.anInt656, local13);
						if (this.anInt948 > -1 && this.anInt878 < this.anInt879) {
							this.anIntArray240[this.anInt878] = this.aClass2_Sub1_Sub1_Sub4_4.method447(445, local13.aString14) / 2;
							this.anIntArray239[this.anInt878] = this.aClass2_Sub1_Sub1_Sub4_4.anInt647;
							this.anIntArray237[this.anInt878] = this.anInt948;
							this.anIntArray238[this.anInt878] = this.anInt949;
							this.anIntArray241[this.anInt878] = local13.anInt691;
							this.anIntArray242[this.anInt878] = local13.anInt682;
							this.anIntArray243[this.anInt878] = local13.anInt674;
							this.aStringArray11[this.anInt878++] = local13.aString14;
							if (this.anInt854 == 0 && local13.anInt682 >= 1 && local13.anInt682 <= 3) {
								this.anIntArray239[this.anInt878] += 10;
								this.anIntArray238[this.anInt878] += 5;
							}
							if (this.anInt854 == 0 && local13.anInt682 == 4) {
								this.anIntArray240[this.anInt878] = 60;
							}
							if (this.anInt854 == 0 && local13.anInt682 == 5) {
								this.anIntArray239[this.anInt878] += 5;
							}
						}
					}
					if (local13.anInt668 > anInt856) {
						this.method664(local13.anInt656 + 15, local13);
						if (this.anInt948 > -1) {
							local70 = local13.anInt669 * 30 / local13.anInt670;
							if (local70 > 30) {
								local70 = 30;
							}
							Class2_Sub1_Sub1.method436(this.anInt948 - 15, this.anInt949 - 3, this.anInt967, 65280, local70, 5);
							Class2_Sub1_Sub1.method436(this.anInt948 + local70 - 15, this.anInt949 - 3, this.anInt967, 16711680, 30 - local70, 5);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray184[local70] > anInt856) {
							this.method664(local13.anInt656 / 2, local13);
							if (this.anInt948 > -1) {
								if (local70 == 1) {
									this.anInt949 -= 20;
								}
								if (local70 == 2) {
									this.anInt948 -= 15;
									this.anInt949 -= 10;
								}
								if (local70 == 3) {
									this.anInt948 += 15;
									this.anInt949 -= 10;
								}
								this.aClass2_Sub1_Sub1_Sub3Array6[local13.anIntArray183[local70]].method360(this.anInt948 - 12, this.anInt949 - 12);
								this.aClass2_Sub1_Sub1_Sub4_2.method444(String.valueOf(local13.anIntArray182[local70]), 936, 0, this.anInt948, this.anInt949 + 4);
								this.aClass2_Sub1_Sub1_Sub4_2.method444(String.valueOf(local13.anIntArray182[local70]), 936, 16777215, this.anInt948 - 1, this.anInt949 + 3);
							}
						}
					}
				}
			}
			for (@Pc(612) int local612 = 0; local612 < this.anInt878; local612++) {
				local70 = this.anIntArray237[local612];
				@Pc(624) int local624 = this.anIntArray238[local612];
				@Pc(629) int local629 = this.anIntArray240[local612];
				@Pc(634) int local634 = this.anIntArray239[local612];
				@Pc(636) boolean local636 = true;
				while (local636) {
					local636 = false;
					for (@Pc(642) int local642 = 0; local642 < local612; local642++) {
						if (local624 + 2 > this.anIntArray238[local642] - this.anIntArray239[local642] && local624 - local634 < this.anIntArray238[local642] + 2 && local70 - local629 < this.anIntArray237[local642] + this.anIntArray240[local642] && local70 + local629 > this.anIntArray237[local642] - this.anIntArray240[local642] && this.anIntArray238[local642] - this.anIntArray239[local642] < local624) {
							local624 = this.anIntArray238[local642] - this.anIntArray239[local642];
							local636 = true;
						}
					}
				}
				this.anInt948 = this.anIntArray237[local612];
				this.anInt949 = this.anIntArray238[local612] = local624;
				@Pc(741) String local741 = this.aStringArray11[local612];
				if (this.anInt854 == 0) {
					@Pc(746) int local746 = 16776960;
					if (this.anIntArray241[local612] < 6) {
						local746 = this.anIntArray249[this.anIntArray241[local612]];
					}
					if (this.anIntArray241[local612] == 6) {
						local746 = this.anInt1040 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray241[local612] == 7) {
						local746 = this.anInt1040 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray241[local612] == 8) {
						local746 = this.anInt1040 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(821) int local821;
					if (this.anIntArray241[local612] == 9) {
						local821 = 150 - this.anIntArray243[local612];
						if (local821 < 50) {
							local746 = local821 * 1280 + 16711680;
						} else if (local821 < 100) {
							local746 = 16776960 - (local821 - 50) * 327680;
						} else if (local821 < 150) {
							local746 = (local821 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray241[local612] == 10) {
						local821 = 150 - this.anIntArray243[local612];
						if (local821 < 50) {
							local746 = local821 * 5 + 16711680;
						} else if (local821 < 100) {
							local746 = 16711935 - (local821 - 50) * 327680;
						} else if (local821 < 150) {
							local746 = (local821 - 100) * 327680 + 255 - (local821 - 100) * 5;
						}
					}
					if (this.anIntArray241[local612] == 11) {
						local821 = 150 - this.anIntArray243[local612];
						if (local821 < 50) {
							local746 = 16777215 - local821 * 327685;
						} else if (local821 < 100) {
							local746 = (local821 - 50) * 327685 + 65280;
						} else if (local821 < 150) {
							local746 = 16777215 - (local821 - 100) * 327680;
						}
					}
					if (this.anIntArray242[local612] == 0) {
						this.aClass2_Sub1_Sub1_Sub4_4.method444(local741, 936, 0, this.anInt948, this.anInt949 + 1);
						this.aClass2_Sub1_Sub1_Sub4_4.method444(local741, 936, local746, this.anInt948, this.anInt949);
					}
					if (this.anIntArray242[local612] == 1) {
						this.aClass2_Sub1_Sub1_Sub4_4.method449(local741, this.anInt949 + 1, this.anInt948, this.anInt1040, 0);
						this.aClass2_Sub1_Sub1_Sub4_4.method449(local741, this.anInt949, this.anInt948, this.anInt1040, local746);
					}
					if (this.anIntArray242[local612] == 2) {
						this.aClass2_Sub1_Sub1_Sub4_4.method450(0, this.anInt1040, local741, this.anInt949 + 1, this.anInt948);
						this.aClass2_Sub1_Sub1_Sub4_4.method450(local746, this.anInt1040, local741, this.anInt949, this.anInt948);
					}
					if (this.anIntArray242[local612] == 3) {
						this.aClass2_Sub1_Sub1_Sub4_4.method451(0, this.anInt949 + 1, this.anInt948, 150 - this.anIntArray243[local612], this.anInt1040, local741);
						this.aClass2_Sub1_Sub1_Sub4_4.method451(local746, this.anInt949, this.anInt948, 150 - this.anIntArray243[local612], this.anInt1040, local741);
					}
					@Pc(1118) int local1118;
					if (this.anIntArray242[local612] == 4) {
						local821 = this.aClass2_Sub1_Sub1_Sub4_4.method447(445, local741);
						local1118 = (150 - this.anIntArray243[local612]) * (local821 + 100) / 150;
						Class2_Sub1_Sub1.method433(this.anInt948 + 50, 0, 334, this.anInt948 - 50);
						this.aClass2_Sub1_Sub1_Sub4_4.method448(local741, this.anInt948 + 50 - local1118, 0, this.anInt949 + 1);
						this.aClass2_Sub1_Sub1_Sub4_4.method448(local741, this.anInt948 + 50 - local1118, local746, this.anInt949);
						Class2_Sub1_Sub1.method432();
					}
					if (this.anIntArray242[local612] == 5) {
						local821 = 150 - this.anIntArray243[local612];
						local1118 = 0;
						if (local821 < 25) {
							local1118 = local821 - 25;
						} else if (local821 > 125) {
							local1118 = local821 - 125;
						}
						Class2_Sub1_Sub1.method433(512, this.anInt949 - this.aClass2_Sub1_Sub1_Sub4_4.anInt647 - 1, this.anInt949 + 5, 0);
						this.aClass2_Sub1_Sub1_Sub4_4.method444(local741, 936, 0, this.anInt948, this.anInt949 + local1118 + 1);
						this.aClass2_Sub1_Sub1_Sub4_4.method444(local741, 936, local746, this.anInt948, this.anInt949 + local1118);
						Class2_Sub1_Sub1.method432();
					}
				} else {
					this.aClass2_Sub1_Sub1_Sub4_4.method444(local741, 936, 0, this.anInt948, this.anInt949 + 1);
					this.aClass2_Sub1_Sub1_Sub4_4.method444(local741, 936, 16776960, this.anInt948, this.anInt949);
				}
			}
		} catch (@Pc(1276) RuntimeException local1276) {
			signlink.reporterror("1537, " + 8 + ", " + local1276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method648() {
		try {
			if (super.anInt808 == 1) {
				if (super.anInt809 >= 6 && super.anInt809 <= 106 && super.anInt810 >= 467 && super.anInt810 <= 499) {
					this.anInt941 = (this.anInt941 + 1) % 4;
					this.aBoolean242 = true;
					this.aBoolean252 = true;
					this.aClass2_Sub1_Sub3_7.method86(178, 533);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt941);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt816);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt877);
				}
				if (super.anInt809 >= 135 && super.anInt809 <= 235 && super.anInt810 >= 467 && super.anInt810 <= 499) {
					this.anInt816 = (this.anInt816 + 1) % 3;
					this.aBoolean242 = true;
					this.aBoolean252 = true;
					this.aClass2_Sub1_Sub3_7.method86(178, 533);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt941);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt816);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt877);
				}
				if (super.anInt809 >= 273 && super.anInt809 <= 373 && super.anInt810 >= 467 && super.anInt810 <= 499) {
					this.anInt877 = (this.anInt877 + 1) % 3;
					this.aBoolean242 = true;
					this.aBoolean252 = true;
					this.aClass2_Sub1_Sub3_7.method86(178, 533);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt941);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt816);
					this.aClass2_Sub1_Sub3_7.method87(this.anInt877);
				}
				if (super.anInt809 >= 412 && super.anInt809 <= 512 && super.anInt810 >= 467 && super.anInt810 <= 499) {
					if (this.anInt850 == -1) {
						this.method669();
						this.aString29 = "";
						this.aBoolean275 = false;
						this.anInt1003 = this.anInt850 = Class31.anInt398;
						return;
					}
					this.method626("Please close the interface you have open before using 'report abuse'", 0, "");
					return;
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("34372, " + 591 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)Ljava/lang/String;")
	private String method649() {
		try {
			this.aBoolean271 &= true;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("18405, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method650() {
		try {
			this.aBoolean285 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray235[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class30.anInt371; local15++) {
					if (!Class30.aClass30Array1[local15].aBoolean142 && Class30.aClass30Array1[local15].anInt372 == local6 + (this.aBoolean260 ? 0 : 7)) {
						this.anIntArray235[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("30681, " + -391 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method651(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt892; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray8[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass2_Sub1_Sub2_Sub3_Sub2_1.aString15);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("46197, " + 0 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean282 = true;
			this.aBoolean271 &= true;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("26284, " + true + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)Lclient!MAARFNGV;")
	private Class22 method652(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local9 = this.aClass45Array1[0].method462(arg3);
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
				return new Class22(local9, (byte) 9);
			}
			local40 = 0;
			while (local9 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method588("Requesting " + arg0, arg2, (byte) 5);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method634(arg1 + arg4);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class2_Sub1_Sub3 local101 = new Class2_Sub1_Sub3(local90, true);
					local101.anInt136 = 3;
					@Pc(109) int local109 = local101.method101() + 6;
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
							this.method588("Loading " + arg0 + " - " + local174 + "%", arg2, (byte) 5);
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method463(local9, local9.length, arg3);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass45Array1[0] = null;
					}
					if (local9 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local9);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg4) {
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
							this.method588("Game updated - please reload page", arg2, (byte) 5);
							local76 = 10;
						} else {
							this.method588(local61 + " - Retrying in " + local76, arg2, (byte) 5);
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
					this.aBoolean253 = !this.aBoolean253;
				}
			}
			return new Class22(local9, (byte) 9);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("70991, " + arg0 + ", " + arg1 + ", " + 15566 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIIIIB)Z")
	private boolean method653(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray23[local7][local11] = 99999999;
				}
			}
			local11 = arg8;
			@Pc(39) int local39 = arg6;
			this.anIntArrayArray25[arg8][arg6] = 99;
			this.anIntArrayArray23[arg8][arg6] = 0;
			@Pc(65) byte local65 = 0;
			@Pc(67) int local67 = 0;
			this.anIntArray261[0] = arg8;
			@Pc(76) int local76 = local65 + 1;
			this.anIntArray262[0] = arg6;
			@Pc(80) boolean local80 = false;
			@Pc(84) int local84 = this.anIntArray261.length;
			@Pc(91) int[][] local91 = this.aClass5Array1[this.anInt1028].anIntArrayArray4;
			@Pc(203) int local203;
			while (local67 != local76) {
				local11 = this.anIntArray261[local67];
				local39 = this.anIntArray262[local67];
				local67 = (local67 + 1) % local84;
				if (local11 == arg9 && local39 == arg10) {
					local80 = true;
					break;
				}
				if (arg5 != 0) {
					if ((arg5 < 5 || arg5 == 10) && this.aClass5Array1[this.anInt1028].method49(arg9, local39, local11, arg10, (byte) 5, arg4, arg5 - 1)) {
						local80 = true;
						break;
					}
					if (arg5 < 10 && this.aClass5Array1[this.anInt1028].method50(this.anInt825, arg5 - 1, arg9, arg10, arg4, local39, local11)) {
						local80 = true;
						break;
					}
				}
				if (arg3 != 0 && arg7 != 0 && this.aClass5Array1[this.anInt1028].method51(arg10, arg7, arg3, local39, arg9, arg2, local11)) {
					local80 = true;
					break;
				}
				local203 = this.anIntArrayArray23[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray261[local76] = local11 - 1;
					this.anIntArray262[local76] = local39;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray23[local11 - 1][local39] = local203;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray261[local76] = local11 + 1;
					this.anIntArray262[local76] = local39;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray23[local11 + 1][local39] = local203;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray261[local76] = local11;
					this.anIntArray262[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray23[local11][local39 - 1] = local203;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray261[local76] = local11;
					this.anIntArray262[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray23[local11][local39 + 1] = local203;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local91[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray261[local76] = local11 - 1;
					this.anIntArray262[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = local203;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local91[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray261[local76] = local11 + 1;
					this.anIntArray262[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = local203;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local91[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray261[local76] = local11 - 1;
					this.anIntArray262[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = local203;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local91[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray261[local76] = local11 + 1;
					this.anIntArray262[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = local203;
				}
			}
			this.anInt938 = 0;
			@Pc(819) int local819;
			@Pc(825) int local825;
			@Pc(831) int local831;
			if (!local80) {
				if (!arg0) {
					return false;
				}
				local203 = 1000;
				local819 = 100;
				for (local825 = arg9 - 10; local825 <= arg9 + 10; local825++) {
					for (local831 = arg10 - 10; local831 <= arg10 + 10; local831++) {
						if (local825 >= 0 && local831 >= 0 && local825 < 104 && local831 < 104 && this.anIntArrayArray23[local825][local831] < 100) {
							@Pc(853) int local853 = 0;
							if (local825 < arg9) {
								local853 = arg9 - local825;
							} else if (local825 > arg9 + arg3 - 1) {
								local853 = local825 + 1 - arg9 - arg3;
							}
							@Pc(879) int local879 = 0;
							if (local831 < arg10) {
								local879 = arg10 - local831;
							} else if (local831 > arg10 + arg7 - 1) {
								local879 = local831 + 1 - arg10 - arg7;
							}
							@Pc(911) int local911 = local853 * local853 + local879 * local879;
							if (local911 < local203 || local911 == local203 && this.anIntArrayArray23[local825][local831] < local819) {
								local203 = local911;
								local819 = this.anIntArrayArray23[local825][local831];
								local11 = local825;
								local39 = local831;
							}
						}
					}
				}
				if (local203 == 1000) {
					return false;
				}
				if (local11 == arg8 && local39 == arg6) {
					return false;
				}
				this.anInt938 = 1;
			}
			@Pc(972) byte local972 = 0;
			this.anIntArray261[0] = local11;
			local67 = local972 + 1;
			this.anIntArray262[0] = local39;
			local203 = local819 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg8 || local39 != arg6) {
				if (local203 != local819) {
					local819 = local203;
					this.anIntArray261[local67] = local11;
					this.anIntArray262[local67++] = local39;
				}
				if ((local203 & 0x2) != 0) {
					local11++;
				} else if ((local203 & 0x8) != 0) {
					local11--;
				}
				if ((local203 & 0x1) != 0) {
					local39++;
				} else if ((local203 & 0x4) != 0) {
					local39--;
				}
				local203 = this.anIntArrayArray25[local11][local39];
			}
			if (local67 > 0) {
				local84 = local67;
				if (local67 > 25) {
					local84 = 25;
				}
				local67--;
				@Pc(1062) int local1062 = this.anIntArray261[local67];
				local825 = this.anIntArray262[local67];
				if (arg1 == 0) {
					this.aClass2_Sub1_Sub3_7.method86(143, 533);
					this.aClass2_Sub1_Sub3_7.method87(local84 + local84 + 3);
				}
				if (arg1 == 1) {
					this.aClass2_Sub1_Sub3_7.method86(115, 533);
					this.aClass2_Sub1_Sub3_7.method87(local84 + local84 + 3 + 14);
				}
				if (arg1 == 2) {
					this.aClass2_Sub1_Sub3_7.method86(236, 533);
					this.aClass2_Sub1_Sub3_7.method87(local84 + local84 + 3);
				}
				this.anInt928 = this.anIntArray261[0];
				this.anInt929 = this.anIntArray262[0];
				for (local831 = 1; local831 < local84; local831++) {
					local67--;
					this.aClass2_Sub1_Sub3_7.method113(this.anIntArray261[local67] - local1062);
					this.aClass2_Sub1_Sub3_7.method113(this.anIntArray262[local67] - local825);
				}
				this.aClass2_Sub1_Sub3_7.method124(local1062 + this.anInt907);
				this.aClass2_Sub1_Sub3_7.method115(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass2_Sub1_Sub3_7.method88(local825 + this.anInt908);
				return true;
			} else if (arg1 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1195) RuntimeException local1195) {
			signlink.reporterror("24003, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + 78 + ", " + local1195.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class41 local9 = this.aClass41ArrayArrayArray1[this.anInt1028][arg0][arg1];
		if (local9 == null) {
			this.aClass47_1.method508(this.anInt1028, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub2_Sub1 local23 = null;
		@Pc(27) Class2_Sub1_Sub2_Sub1 local27;
		for (local27 = (Class2_Sub1_Sub2_Sub1) local9.method414(); local27 != null; local27 = (Class2_Sub1_Sub2_Sub1) local9.method416()) {
			@Pc(32) Class38 local32 = Class38.method391(local27.anInt69);
			@Pc(35) int local35 = local32.anInt573;
			if (local32.aBoolean186) {
				local35 *= local27.anInt68 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method412(local23);
		@Pc(65) Class2_Sub1_Sub2_Sub1 local65 = null;
		@Pc(67) Class2_Sub1_Sub2_Sub1 local67 = null;
		for (local27 = (Class2_Sub1_Sub2_Sub1) local9.method414(); local27 != null; local27 = (Class2_Sub1_Sub2_Sub1) local9.method416()) {
			if (local27.anInt69 != local23.anInt69 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt69 != local23.anInt69 && local27.anInt69 != local65.anInt69 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass47_1.method494(local67, local23, arg0, local65, local110, arg1, this.method657(this.anInt1028, arg0 * 128 + 64, arg1 * 128 + 64), this.anInt1028);
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)Z")
	private boolean method655(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = true;
			if (this.aClass6_1 == null) {
				return false;
			}
			@Pc(1709) String local1709;
			@Pc(440) int local440;
			try {
				@Pc(14) int local14 = this.aClass6_1.method54();
				if (local14 == 0) {
					return false;
				}
				if (this.anInt976 == -1) {
					this.aClass6_1.method55(this.aClass2_Sub1_Sub3_9.aByteArray10, 0, 1);
					this.anInt976 = this.aClass2_Sub1_Sub3_9.aByteArray10[0] & 0xFF;
					if (this.aClass44_2 != null) {
						this.anInt976 = this.anInt976 - this.aClass44_2.method459() & 0xFF;
					}
					this.anInt975 = Class36.anIntArray160[this.anInt976];
					local14--;
				}
				if (this.anInt975 == -1) {
					if (local14 <= 0) {
						return false;
					}
					this.aClass6_1.method55(this.aClass2_Sub1_Sub3_9.aByteArray10, 0, 1);
					this.anInt975 = this.aClass2_Sub1_Sub3_9.aByteArray10[0] & 0xFF;
					local14--;
				}
				if (this.anInt975 == -2) {
					if (local14 <= 1) {
						return false;
					}
					this.aClass6_1.method55(this.aClass2_Sub1_Sub3_9.aByteArray10, 0, 2);
					this.aClass2_Sub1_Sub3_9.anInt136 = 0;
					this.anInt975 = this.aClass2_Sub1_Sub3_9.method99();
					local14 -= 2;
				}
				if (local14 < this.anInt975) {
					return false;
				}
				this.aClass2_Sub1_Sub3_9.anInt136 = 0;
				this.aClass6_1.method55(this.aClass2_Sub1_Sub3_9.aByteArray10, 0, this.anInt975);
				this.anInt977 = 0;
				this.anInt1010 = this.anInt1009;
				this.anInt1009 = this.anInt1008;
				this.anInt1008 = this.anInt976;
				if (this.anInt976 == 21) {
					this.anInt888 = this.aClass2_Sub1_Sub3_9.method116();
					this.anInt887 = this.aClass2_Sub1_Sub3_9.method118();
					this.anInt976 = -1;
					return true;
				}
				@Pc(184) int local184;
				@Pc(192) int local192;
				@Pc(294) int local294;
				@Pc(327) int local327;
				@Pc(180) long local180;
				if (this.anInt976 == 18) {
					local180 = this.aClass2_Sub1_Sub3_9.method103();
					local184 = this.aClass2_Sub1_Sub3_9.method97();
					@Pc(190) String local190 = Class40.method409(Class40.method406(local180));
					for (local192 = 0; local192 < this.anInt892; local192++) {
						if (local180 == this.aLongArray4[local192]) {
							if (this.anIntArray231[local192] != local184) {
								this.anIntArray231[local192] = local184;
								this.aBoolean256 = true;
								if (local184 > 0) {
									this.method626(local190 + " has logged in.", 5, "");
								}
								if (local184 == 0) {
									this.method626(local190 + " has logged out.", 5, "");
								}
							}
							local190 = null;
							break;
						}
					}
					if (local190 != null && this.anInt892 < 200) {
						this.aLongArray4[this.anInt892] = local180;
						this.aStringArray8[this.anInt892] = local190;
						this.anIntArray231[this.anInt892] = local184;
						this.anInt892++;
						this.aBoolean256 = true;
					}
					@Pc(288) boolean local288 = false;
					while (!local288) {
						local288 = true;
						for (local294 = 0; local294 < this.anInt892 - 1; local294++) {
							if (this.anIntArray231[local294] != anInt861 && this.anIntArray231[local294 + 1] == anInt861 || this.anIntArray231[local294] == 0 && this.anIntArray231[local294 + 1] != 0) {
								local327 = this.anIntArray231[local294];
								this.anIntArray231[local294] = this.anIntArray231[local294 + 1];
								this.anIntArray231[local294 + 1] = local327;
								@Pc(349) String local349 = this.aStringArray8[local294];
								this.aStringArray8[local294] = this.aStringArray8[local294 + 1];
								this.aStringArray8[local294 + 1] = local349;
								@Pc(371) long local371 = this.aLongArray4[local294];
								this.aLongArray4[local294] = this.aLongArray4[local294 + 1];
								this.aLongArray4[local294 + 1] = local371;
								this.aBoolean256 = true;
								local288 = false;
							}
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 232) {
					this.anInt842 = this.aClass2_Sub1_Sub3_9.method99();
					this.anInt999 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt976 = -1;
					return true;
				}
				@Pc(435) int local435;
				if (this.anInt976 == 58) {
					local435 = this.aClass2_Sub1_Sub3_9.method126();
					local440 = this.aClass2_Sub1_Sub3_9.method126();
					local184 = this.aClass2_Sub1_Sub3_9.method125();
					Class31.method293(local440).anInt379 = (local184 << 16) + local435;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 25) {
					local435 = this.aClass2_Sub1_Sub3_9.method127();
					this.method608(local435);
					if (this.anInt940 != -1) {
						this.method622(this.anInt940);
						this.anInt940 = -1;
						this.aBoolean256 = true;
						this.aBoolean240 = true;
					}
					if (this.anInt849 != -1) {
						this.method622(this.anInt849);
						this.anInt849 = -1;
						this.aBoolean252 = true;
					}
					if (this.anInt891 != -1) {
						this.method622(this.anInt891);
						this.anInt891 = -1;
						this.aBoolean282 = true;
					}
					if (this.anInt1025 != -1) {
						this.method622(this.anInt1025);
						this.anInt1025 = -1;
					}
					if (this.anInt850 != local435) {
						this.method622(this.anInt850);
						this.anInt850 = local435;
					}
					if (this.anInt973 != 0) {
						this.anInt973 = 0;
						this.aBoolean252 = true;
					}
					this.aBoolean281 = false;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 215) {
					this.method701();
					this.anInt976 = -1;
					return false;
				}
				@Pc(626) int local626;
				@Pc(638) int local638;
				if (this.anInt976 == 4 || this.anInt976 == 5) {
					local435 = this.anInt875;
					local440 = this.anInt876;
					if (this.anInt976 == 4) {
						local435 = this.aClass2_Sub1_Sub3_9.method126();
						local440 = this.aClass2_Sub1_Sub3_9.method125();
						this.aBoolean274 = false;
					}
					if (this.anInt976 == 5) {
						local435 = this.aClass2_Sub1_Sub3_9.method125();
						local440 = this.aClass2_Sub1_Sub3_9.method99();
						this.aClass2_Sub1_Sub3_9.method107();
						local184 = 0;
						while (true) {
							if (local184 >= 4) {
								this.aClass2_Sub1_Sub3_9.method109();
								this.aBoolean274 = true;
								break;
							}
							for (local626 = 0; local626 < 13; local626++) {
								for (local192 = 0; local192 < 13; local192++) {
									local638 = this.aClass2_Sub1_Sub3_9.method108(1);
									if (local638 == 1) {
										this.anIntArrayArrayArray8[local184][local626][local192] = this.aClass2_Sub1_Sub3_9.method108(26);
									} else {
										this.anIntArrayArrayArray8[local184][local626][local192] = -1;
									}
								}
							}
							local184++;
						}
					}
					if (this.anInt875 == local435 && this.anInt876 == local440 && this.anInt935 == 2) {
						this.anInt976 = -1;
						return true;
					}
					this.anInt875 = local435;
					this.anInt876 = local440;
					this.anInt907 = (this.anInt875 - 6) * 8;
					this.anInt908 = (this.anInt876 - 6) * 8;
					this.aBoolean264 = false;
					if ((this.anInt875 / 8 == 48 || this.anInt875 / 8 == 49) && this.anInt876 / 8 == 48) {
						this.aBoolean264 = true;
					}
					if (this.anInt875 / 8 == 48 && this.anInt876 / 8 == 148) {
						this.aBoolean264 = true;
					}
					this.anInt935 = 1;
					this.aLong32 = System.currentTimeMillis();
					this.method702(null, this.aByte35, "Loading - please wait.");
					if (this.anInt976 == 4) {
						local184 = 0;
						local626 = (this.anInt875 - 6) / 8;
						label1247: while (true) {
							if (local626 > (this.anInt875 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local184][];
								this.aByteArrayArray6 = new byte[local184][];
								this.anIntArray232 = new int[local184];
								this.anIntArray233 = new int[local184];
								this.anIntArray234 = new int[local184];
								local184 = 0;
								local192 = (this.anInt875 - 6) / 8;
								while (true) {
									if (local192 > (this.anInt875 + 6) / 8) {
										break label1247;
									}
									for (local638 = (this.anInt876 - 6) / 8; local638 <= (this.anInt876 + 6) / 8; local638++) {
										this.anIntArray232[local184] = (local192 << 8) + local638;
										if (this.aBoolean264 && (local638 == 49 || local638 == 149 || local638 == 147 || local192 == 50 || local192 == 49 && local638 == 47)) {
											this.anIntArray233[local184] = -1;
											this.anIntArray234[local184] = -1;
											local184++;
										} else {
											local294 = this.anIntArray233[local184] = this.aClass18_Sub1_1.method194(local192, 0, local638);
											if (local294 != -1) {
												this.aClass18_Sub1_1.method207(3, local294);
											}
											local327 = this.anIntArray234[local184] = this.aClass18_Sub1_1.method194(local192, 1, local638);
											if (local327 != -1) {
												this.aClass18_Sub1_1.method207(3, local327);
											}
											local184++;
										}
									}
									local192++;
								}
							}
							for (local192 = (this.anInt876 - 6) / 8; local192 <= (this.anInt876 + 6) / 8; local192++) {
								local184++;
							}
							local626++;
						}
					}
					if (this.anInt976 == 5) {
						local184 = 0;
						@Pc(970) int[] local970 = new int[676];
						local192 = 0;
						label1208: while (true) {
							@Pc(1000) int local1000;
							@Pc(1006) int local1006;
							@Pc(1016) int local1016;
							if (local192 >= 4) {
								this.aByteArrayArray5 = new byte[local184][];
								this.aByteArrayArray6 = new byte[local184][];
								this.anIntArray232 = new int[local184];
								this.anIntArray233 = new int[local184];
								this.anIntArray234 = new int[local184];
								local638 = 0;
								while (true) {
									if (local638 >= local184) {
										break label1208;
									}
									local294 = this.anIntArray232[local638] = local970[local638];
									local327 = local294 >> 8 & 0xFF;
									local1000 = local294 & 0xFF;
									local1006 = this.anIntArray233[local638] = this.aClass18_Sub1_1.method194(local327, 0, local1000);
									if (local1006 != -1) {
										this.aClass18_Sub1_1.method207(3, local1006);
									}
									local1016 = this.anIntArray234[local638] = this.aClass18_Sub1_1.method194(local327, 1, local1000);
									if (local1016 != -1) {
										this.aClass18_Sub1_1.method207(3, local1016);
									}
									local638++;
								}
							}
							for (local638 = 0; local638 < 13; local638++) {
								for (local294 = 0; local294 < 13; local294++) {
									local327 = this.anIntArrayArrayArray8[local192][local638][local294];
									if (local327 != -1) {
										local1000 = local327 >> 14 & 0x3FF;
										local1006 = local327 >> 3 & 0x7FF;
										local1016 = (local1000 / 8 << 8) + local1006 / 8;
										for (@Pc(1018) int local1018 = 0; local1018 < local184; local1018++) {
											if (local970[local1018] == local1016) {
												local1016 = -1;
												break;
											}
										}
										if (local1016 != -1) {
											local970[local184++] = local1016;
										}
									}
								}
							}
							local192++;
						}
					}
					local184 = this.anInt907 - this.anInt909;
					local626 = this.anInt908 - this.anInt910;
					this.anInt909 = this.anInt907;
					this.anInt910 = this.anInt908;
					for (local192 = 0; local192 < 16384; local192++) {
						@Pc(1171) Class2_Sub1_Sub2_Sub3_Sub1 local1171 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local192];
						if (local1171 != null) {
							for (local294 = 0; local294 < 10; local294++) {
								local1171.anIntArray180[local294] -= local184;
								local1171.anIntArray181[local294] -= local626;
							}
							local1171.anInt679 -= local184 * 128;
							local1171.anInt680 -= local626 * 128;
						}
					}
					for (local638 = 0; local638 < this.anInt896; local638++) {
						@Pc(1226) Class2_Sub1_Sub2_Sub3_Sub2 local1226 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local638];
						if (local1226 != null) {
							for (local327 = 0; local327 < 10; local327++) {
								local1226.anIntArray180[local327] -= local184;
								local1226.anIntArray181[local327] -= local626;
							}
							local1226.anInt679 -= local184 * 128;
							local1226.anInt680 -= local626 * 128;
						}
					}
					this.aBoolean246 = true;
					@Pc(1278) byte local1278 = 0;
					@Pc(1280) byte local1280 = 104;
					@Pc(1282) byte local1282 = 1;
					if (local184 < 0) {
						local1278 = 103;
						local1280 = -1;
						local1282 = -1;
					}
					@Pc(1292) byte local1292 = 0;
					@Pc(1294) byte local1294 = 104;
					@Pc(1296) byte local1296 = 1;
					if (local626 < 0) {
						local1292 = 103;
						local1294 = -1;
						local1296 = -1;
					}
					for (@Pc(1306) int local1306 = local1278; local1306 != local1280; local1306 += local1282) {
						for (@Pc(1310) int local1310 = local1292; local1310 != local1294; local1310 += local1296) {
							@Pc(1316) int local1316 = local1306 + local184;
							@Pc(1320) int local1320 = local1310 + local626;
							for (@Pc(1322) int local1322 = 0; local1322 < 4; local1322++) {
								if (local1316 >= 0 && local1320 >= 0 && local1316 < 104 && local1320 < 104) {
									this.aClass41ArrayArrayArray1[local1322][local1306][local1310] = this.aClass41ArrayArrayArray1[local1322][local1316][local1320];
								} else {
									this.aClass41ArrayArrayArray1[local1322][local1306][local1310] = null;
								}
							}
						}
					}
					for (@Pc(1384) Class2_Sub2 local1384 = (Class2_Sub2) this.aClass41_11.method414(); local1384 != null; local1384 = (Class2_Sub2) this.aClass41_11.method416()) {
						local1384.anInt209 -= local184;
						local1384.anInt210 -= local626;
						if (local1384.anInt209 < 0 || local1384.anInt210 < 0 || local1384.anInt209 >= 104 || local1384.anInt210 >= 104) {
							local1384.method466();
						}
					}
					if (this.anInt928 != 0) {
						this.anInt928 -= local184;
						this.anInt929 -= local626;
					}
					this.aBoolean255 = false;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 212) {
					this.aClass2_Sub1_Sub3_9.method126();
					this.anInt998 = this.aClass2_Sub1_Sub3_9.method125();
					this.anInt970 = this.aClass2_Sub1_Sub3_9.method102();
					this.anInt1026 = this.aClass2_Sub1_Sub3_9.method99();
					this.anInt853 = this.aClass2_Sub1_Sub3_9.method127();
					this.anInt1033 = this.aClass2_Sub1_Sub3_9.method127();
					this.anInt1041 = this.aClass2_Sub1_Sub3_9.method126();
					this.anInt947 = this.aClass2_Sub1_Sub3_9.method126();
					this.aClass2_Sub1_Sub3_9.method116();
					this.anInt1038 = this.aClass2_Sub1_Sub3_9.method125();
					this.anInt1037 = this.aClass2_Sub1_Sub3_9.method126();
					signlink.dnslookup(Class40.method408((byte) 8, this.anInt970));
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 167) {
					this.anInt867 = this.aClass2_Sub1_Sub3_9.method118();
					if (this.anInt867 == this.anInt819) {
						if (this.anInt867 == 3) {
							this.anInt819 = 1;
						} else {
							this.anInt819 = 3;
						}
						this.aBoolean256 = true;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 60) {
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					local440 = this.aClass2_Sub1_Sub3_9.method97();
					local184 = this.aClass2_Sub1_Sub3_9.method99();
					if (local184 == 65535) {
						if (this.anInt914 < 50) {
							this.anIntArray248[this.anInt914] = (short) local435;
							this.anIntArray268[this.anInt914] = local440;
							this.anIntArray218[this.anInt914] = 0;
							this.anInt914++;
						}
					} else if (this.aBoolean280 && !aBoolean250 && this.anInt914 < 50) {
						this.anIntArray248[this.anInt914] = local435;
						this.anIntArray268[this.anInt914] = local440;
						this.anIntArray218[this.anInt914] = local184 + Class21.anIntArray98[local435];
						this.anInt914++;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 186) {
					this.anInt1011 = this.anInt975 / 8;
					for (local435 = 0; local435 < this.anInt1011; local435++) {
						this.aLongArray3[local435] = this.aClass2_Sub1_Sub3_9.method103();
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 149) {
					if (this.anInt819 == 12) {
						this.aBoolean256 = true;
					}
					this.anInt1034 = this.aClass2_Sub1_Sub3_9.method100();
					this.anInt976 = -1;
					return true;
				}
				@Pc(1725) boolean local1725;
				@Pc(1860) String local1860;
				@Pc(1720) String local1720;
				if (this.anInt976 == 49) {
					local1709 = this.aClass2_Sub1_Sub3_9.method104();
					@Pc(1723) long local1723;
					if (local1709.endsWith(":tradereq:")) {
						local1720 = local1709.substring(0, local1709.indexOf(":"));
						local1723 = Class40.method405(local1720);
						local1725 = false;
						for (local638 = 0; local638 < this.anInt1011; local638++) {
							if (this.aLongArray3[local638] == local1723) {
								local1725 = true;
								break;
							}
						}
						if (!local1725 && this.anInt871 == 0) {
							this.method626("wishes to trade with you.", 4, local1720);
						}
					} else if (local1709.endsWith(":duelreq:")) {
						local1720 = local1709.substring(0, local1709.indexOf(":"));
						local1723 = Class40.method405(local1720);
						local1725 = false;
						for (local638 = 0; local638 < this.anInt1011; local638++) {
							if (this.aLongArray3[local638] == local1723) {
								local1725 = true;
								break;
							}
						}
						if (!local1725 && this.anInt871 == 0) {
							this.method626("wishes to duel with you.", 8, local1720);
						}
					} else if (local1709.endsWith(":chalreq:")) {
						local1720 = local1709.substring(0, local1709.indexOf(":"));
						local1723 = Class40.method405(local1720);
						local1725 = false;
						for (local638 = 0; local638 < this.anInt1011; local638++) {
							if (this.aLongArray3[local638] == local1723) {
								local1725 = true;
								break;
							}
						}
						if (!local1725 && this.anInt871 == 0) {
							local1860 = local1709.substring(local1709.indexOf(":") + 1, local1709.length() - 9);
							this.method626(local1860, 8, local1720);
						}
					} else {
						this.method626(local1709, 0, "");
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 44) {
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					local440 = this.aClass2_Sub1_Sub3_9.method126();
					local184 = this.aClass2_Sub1_Sub3_9.method127();
					if (local184 == 65535) {
						Class31.method293(local435).anInt393 = 0;
						this.anInt976 = -1;
						return true;
					}
					@Pc(1912) Class38 local1912 = Class38.method391(local184);
					Class31.method293(local435).anInt393 = 4;
					Class31.method293(local435).anInt394 = local184;
					Class31.method293(local435).anInt402 = local1912.anInt558;
					Class31.method293(local435).anInt403 = local1912.anInt568;
					Class31.method293(local435).anInt401 = local1912.anInt562 * 100 / local440;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 145) {
					if (this.anInt819 == 12) {
						this.aBoolean256 = true;
					}
					this.anInt868 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 76) {
					this.method658(this.aClass2_Sub1_Sub3_9, this.anInt975);
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 99) {
					local435 = this.aClass2_Sub1_Sub3_9.method126();
					Class31.method293(local435).anInt393 = 3;
					if (aClass2_Sub1_Sub2_Sub3_Sub2_1.aClass46_2 == null) {
						Class31.method293(local435).anInt394 = (aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray186[0] << 25) + (aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray186[4] << 20) + (aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray185[0] << 15) + (aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray185[8] << 10) + (aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray185[11] << 5) + aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray185[1];
					} else {
						Class31.method293(local435).anInt394 = (int) (aClass2_Sub1_Sub2_Sub3_Sub2_1.aClass46_2.aLong26 + 305419896L);
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 236 || this.anInt976 == 19 || this.anInt976 == 231 || this.anInt976 == 131 || this.anInt976 == 216 || this.anInt976 == 65 || this.anInt976 == 93 || this.anInt976 == 94 || this.anInt976 == 103 || this.anInt976 == 87 || this.anInt976 == 191) {
					this.method656(this.anInt851, this.aClass2_Sub1_Sub3_9, this.anInt976);
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 162) {
					this.aBoolean255 = false;
					for (local435 = 0; local435 < 5; local435++) {
						this.aBooleanArray12[local435] = false;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 148) {
					local435 = this.aClass2_Sub1_Sub3_9.method97();
					local440 = this.aClass2_Sub1_Sub3_9.method97();
					local184 = this.aClass2_Sub1_Sub3_9.method97();
					local626 = this.aClass2_Sub1_Sub3_9.method97();
					this.aBooleanArray12[local435] = true;
					this.anIntArray259[local435] = local440;
					this.anIntArray223[local435] = local184;
					this.anIntArray275[local435] = local626;
					this.anIntArray273[local435] = 0;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 250) {
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					if (local435 == 65535) {
						local435 = -1;
					}
					if (local435 != this.anInt866 && this.aBoolean248 && !aBoolean250 && this.anInt936 == 0) {
						this.anInt968 = local435;
						this.aBoolean270 = true;
						this.aClass18_Sub1_1.method207(2, this.anInt968);
					}
					this.anInt866 = local435;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 84) {
					local435 = this.aClass2_Sub1_Sub3_9.method125();
					local440 = this.aClass2_Sub1_Sub3_9.method130((byte) 7);
					if (this.aBoolean248 && !aBoolean250) {
						this.anInt968 = local435;
						this.aBoolean270 = false;
						this.aClass18_Sub1_1.method207(2, this.anInt968);
						this.anInt936 = local440;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 134) {
					local435 = this.aClass2_Sub1_Sub3_9.method127();
					@Pc(2285) byte local2285 = this.aClass2_Sub1_Sub3_9.method121();
					this.anIntArray215[local435] = local2285;
					if (this.anIntArray244[local435] != local2285) {
						this.anIntArray244[local435] = local2285;
						this.method616(local435);
						this.aBoolean256 = true;
						if (this.anInt991 != -1) {
							this.aBoolean252 = true;
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 59) {
					local435 = this.aClass2_Sub1_Sub3_9.method126();
					local440 = this.aClass2_Sub1_Sub3_9.method129(this.anInt889);
					local184 = this.aClass2_Sub1_Sub3_9.method128();
					@Pc(2343) Class31 local2343 = Class31.method293(local435);
					local2343.anInt410 = local184;
					local2343.anInt376 = local440;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 233) {
					this.anInt985 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 3) {
					this.anInt928 = 0;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 153) {
					this.anInt872 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 180) {
					local435 = this.aClass2_Sub1_Sub3_9.method126();
					@Pc(2413) boolean local2413 = this.aClass2_Sub1_Sub3_9.method117() == 1;
					Class31.method293(local435).aBoolean151 = local2413;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 144) {
					local435 = this.aClass2_Sub1_Sub3_9.method126();
					local440 = this.aClass2_Sub1_Sub3_9.method126();
					Class31.method293(local435).anInt393 = 1;
					Class31.method293(local435).anInt394 = local440;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 14) {
					local435 = this.aClass2_Sub1_Sub3_9.method125();
					this.method608(local435);
					if (this.anInt849 != -1) {
						this.method622(this.anInt849);
						this.anInt849 = -1;
						this.aBoolean252 = true;
					}
					if (this.anInt891 != -1) {
						this.method622(this.anInt891);
						this.anInt891 = -1;
						this.aBoolean282 = true;
					}
					if (this.anInt1025 != -1) {
						this.method622(this.anInt1025);
						this.anInt1025 = -1;
					}
					if (this.anInt850 != -1) {
						this.method622(this.anInt850);
						this.anInt850 = -1;
					}
					if (this.anInt940 != local435) {
						this.method622(this.anInt940);
						this.anInt940 = local435;
					}
					if (this.anInt973 != 0) {
						this.anInt973 = 0;
						this.aBoolean252 = true;
					}
					this.aBoolean256 = true;
					this.aBoolean240 = true;
					this.aBoolean281 = false;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 211) {
					local435 = this.aClass2_Sub1_Sub3_9.method118();
					local1720 = this.aClass2_Sub1_Sub3_9.method104();
					local184 = this.aClass2_Sub1_Sub3_9.method118();
					if (local435 >= 1 && local435 <= 5) {
						if (local1720.equalsIgnoreCase("null")) {
							local1720 = null;
						}
						this.aStringArray9[local435 - 1] = local1720;
						this.aBooleanArray11[local435 - 1] = local184 == 0;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 73) {
					local435 = this.aClass2_Sub1_Sub3_9.method128();
					if (local435 >= 0) {
						this.method608(local435);
					}
					if (local435 != this.anInt1007) {
						this.method622(this.anInt1007);
						this.anInt1007 = local435;
					}
					this.anInt976 = -1;
					return true;
				}
				@Pc(2650) Class31 local2650;
				if (this.anInt976 == 225) {
					this.aBoolean256 = true;
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					local2650 = Class31.method293(local435);
					local184 = this.aClass2_Sub1_Sub3_9.method99();
					for (local626 = 0; local626 < local184; local626++) {
						local192 = this.aClass2_Sub1_Sub3_9.method117();
						if (local192 == 255) {
							local192 = this.aClass2_Sub1_Sub3_9.method102();
						}
						local2650.anIntArray138[local626] = this.aClass2_Sub1_Sub3_9.method127();
						local2650.anIntArray130[local626] = local192;
					}
					for (local192 = local184; local192 < local2650.anIntArray138.length; local192++) {
						local2650.anIntArray138[local192] = 0;
						local2650.anIntArray130[local192] = 0;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 221) {
					local180 = this.aClass2_Sub1_Sub3_9.method103();
					local184 = this.aClass2_Sub1_Sub3_9.method102();
					local626 = this.aClass2_Sub1_Sub3_9.method97();
					local1725 = false;
					for (local638 = 0; local638 < 100; local638++) {
						if (this.anIntArray230[local638] == local184) {
							local1725 = true;
							break;
						}
					}
					if (local626 <= 1) {
						for (local294 = 0; local294 < this.anInt1011; local294++) {
							if (this.aLongArray3[local294] == local180) {
								local1725 = true;
								break;
							}
						}
					}
					if (!local1725 && this.anInt871 == 0) {
						try {
							this.anIntArray230[this.anInt883] = local184;
							this.anInt883 = (this.anInt883 + 1) % 100;
							local1860 = Class11.method136(this.aClass2_Sub1_Sub3_9, this.anInt975 - 13, 905);
							if (local626 != 3) {
								local1860 = Class48.method548(local1860);
							}
							if (local626 == 2 || local626 == 3) {
								this.method626(local1860, 7, "@cr2@" + Class40.method409(Class40.method406(local180)));
							} else if (local626 == 1) {
								this.method626(local1860, 7, "@cr1@" + Class40.method409(Class40.method406(local180)));
							} else {
								this.method626(local1860, 3, Class40.method409(Class40.method406(local180)));
							}
						} catch (@Pc(2864) Exception local2864) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 140) {
					local435 = this.aClass2_Sub1_Sub3_9.method125();
					local1720 = this.aClass2_Sub1_Sub3_9.method104();
					Class31.method293(local435).aString10 = local1720;
					@Pc(2897) int local2897 = this.anIntArray220[this.anInt819];
					if (Class31.method293(local435).anInt406 == local2897) {
						this.aBoolean256 = true;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 241) {
					this.aBoolean255 = true;
					this.anInt993 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt994 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt995 = this.aClass2_Sub1_Sub3_9.method99();
					this.anInt996 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt997 = this.aClass2_Sub1_Sub3_9.method97();
					if (this.anInt997 >= 100) {
						this.anInt1015 = this.anInt993 * 128 + 64;
						this.anInt1017 = this.anInt994 * 128 + 64;
						this.anInt1016 = this.method657(this.anInt1028, this.anInt1015, this.anInt1017) - this.anInt995;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 90) {
					this.anInt893 = this.aClass2_Sub1_Sub3_9.method97();
					this.aBoolean256 = true;
					this.anInt976 = -1;
					return true;
				}
				@Pc(3010) Class31 local3010;
				if (this.anInt976 == 64) {
					local435 = this.aClass2_Sub1_Sub3_9.method125();
					local440 = this.aClass2_Sub1_Sub3_9.method99();
					local3010 = Class31.method293(local440);
					if (local3010 != null && local3010.anInt397 == 0) {
						if (local435 < 0) {
							local435 = 0;
						}
						if (local435 > local3010.anInt384 - local3010.anInt387) {
							local435 = local3010.anInt384 - local3010.anInt387;
						}
						local3010.anInt383 = local435;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 2) {
					this.anInt819 = this.aClass2_Sub1_Sub3_9.method118();
					this.aBoolean256 = true;
					this.aBoolean240 = true;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 45) {
					if (this.anInt940 != -1) {
						this.method622(this.anInt940);
						this.anInt940 = -1;
						this.aBoolean256 = true;
						this.aBoolean240 = true;
					}
					if (this.anInt849 != -1) {
						this.method622(this.anInt849);
						this.anInt849 = -1;
						this.aBoolean252 = true;
					}
					if (this.anInt891 != -1) {
						this.method622(this.anInt891);
						this.anInt891 = -1;
						this.aBoolean282 = true;
					}
					if (this.anInt1025 != -1) {
						this.method622(this.anInt1025);
						this.anInt1025 = -1;
					}
					if (this.anInt850 != -1) {
						this.method622(this.anInt850);
						this.anInt850 = -1;
					}
					if (this.anInt973 != 0) {
						this.anInt973 = 0;
						this.aBoolean252 = true;
					}
					this.aBoolean281 = false;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 217) {
					this.anInt974 = this.aClass2_Sub1_Sub3_9.method99() * 30;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 249) {
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					local440 = this.aClass2_Sub1_Sub3_9.method125();
					if (this.anInt849 != -1) {
						this.method622(this.anInt849);
						this.anInt849 = -1;
						this.aBoolean252 = true;
					}
					if (this.anInt891 != -1) {
						this.method622(this.anInt891);
						this.anInt891 = -1;
						this.aBoolean282 = true;
					}
					if (this.anInt1025 != -1) {
						this.method622(this.anInt1025);
						this.anInt1025 = -1;
					}
					if (this.anInt850 != local435) {
						this.method622(this.anInt850);
						this.anInt850 = local435;
					}
					if (this.anInt940 != local440) {
						this.method622(this.anInt940);
						this.anInt940 = local440;
					}
					if (this.anInt973 != 0) {
						this.anInt973 = 0;
						this.aBoolean252 = true;
					}
					this.aBoolean256 = true;
					this.aBoolean240 = true;
					this.aBoolean281 = false;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 234) {
					this.aBoolean256 = true;
					local435 = this.aClass2_Sub1_Sub3_9.method116();
					local440 = this.aClass2_Sub1_Sub3_9.method116();
					local184 = this.aClass2_Sub1_Sub3_9.method133();
					this.anIntArray216[local440] = local184;
					this.anIntArray256[local440] = local435;
					this.anIntArray213[local440] = 1;
					for (local626 = 0; local626 < 98; local626++) {
						if (local184 >= anIntArray222[local626]) {
							this.anIntArray213[local440] = local626 + 2;
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 214) {
					this.anInt887 = this.aClass2_Sub1_Sub3_9.method117();
					this.anInt888 = this.aClass2_Sub1_Sub3_9.method116();
					while (this.aClass2_Sub1_Sub3_9.anInt136 < this.anInt975) {
						local435 = this.aClass2_Sub1_Sub3_9.method97();
						this.method656(this.anInt851, this.aClass2_Sub1_Sub3_9, local435);
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 210) {
					local435 = this.aClass2_Sub1_Sub3_9.method125();
					local440 = this.aClass2_Sub1_Sub3_9.method127();
					local184 = local440 >> 10 & 0x1F;
					local626 = local440 >> 5 & 0x1F;
					local192 = local440 & 0x1F;
					Class31.method293(local435).anInt374 = (local184 << 19) + (local626 << 11) + (local192 << 3);
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 181) {
					for (local435 = 0; local435 < this.aClass2_Sub1_Sub2_Sub3_Sub2Array1.length; local435++) {
						if (this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local435] != null) {
							this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local435].anInt684 = -1;
						}
					}
					for (local440 = 0; local440 < this.aClass2_Sub1_Sub2_Sub3_Sub1Array1.length; local440++) {
						if (this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local440] != null) {
							this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local440].anInt684 = -1;
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 194) {
					this.method668(this.aClass2_Sub1_Sub3_9, this.anInt975);
					this.aBoolean246 = false;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 163) {
					local435 = this.aClass2_Sub1_Sub3_9.method127();
					local2650 = Class31.method293(local435);
					for (local184 = 0; local184 < local2650.anIntArray138.length; local184++) {
						local2650.anIntArray138[local184] = -1;
						local2650.anIntArray138[local184] = 0;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 223) {
					this.aBoolean255 = true;
					this.anInt957 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt958 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt959 = this.aClass2_Sub1_Sub3_9.method99();
					this.anInt960 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt961 = this.aClass2_Sub1_Sub3_9.method97();
					if (this.anInt961 >= 100) {
						local435 = this.anInt957 * 128 + 64;
						local440 = this.anInt958 * 128 + 64;
						local184 = this.method657(this.anInt1028, local435, local440) - this.anInt959;
						local626 = local435 - this.anInt1015;
						local192 = local184 - this.anInt1016;
						local638 = local440 - this.anInt1017;
						local294 = (int) Math.sqrt((double) (local626 * local626 + local638 * local638));
						this.anInt1018 = (int) (Math.atan2((double) local192, (double) local294) * 325.949D) & 0x7FF;
						this.anInt1019 = (int) (Math.atan2((double) local626, (double) local638) * -325.949D) & 0x7FF;
						if (this.anInt1018 < 128) {
							this.anInt1018 = 128;
						}
						if (this.anInt1018 > 383) {
							this.anInt1018 = 383;
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 197) {
					local435 = this.aClass2_Sub1_Sub3_9.method126();
					local440 = this.aClass2_Sub1_Sub3_9.method99();
					local184 = this.aClass2_Sub1_Sub3_9.method127();
					local626 = this.aClass2_Sub1_Sub3_9.method99();
					Class31.method293(local626).anInt402 = local440;
					Class31.method293(local626).anInt403 = local184;
					Class31.method293(local626).anInt401 = local435;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 16) {
					local435 = this.aClass2_Sub1_Sub3_9.method100();
					local440 = this.aClass2_Sub1_Sub3_9.method125();
					local3010 = Class31.method293(local440);
					if (local3010.anInt388 != local435 || local435 == -1) {
						local3010.anInt388 = local435;
						local3010.anInt381 = 0;
						local3010.anInt407 = 0;
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 91) {
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					local440 = this.aClass2_Sub1_Sub3_9.method99();
					Class31.method293(local435).anInt393 = 2;
					Class31.method293(local435).anInt394 = local440;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 106) {
					this.aBoolean256 = true;
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					local2650 = Class31.method293(local435);
					while (this.aClass2_Sub1_Sub3_9.anInt136 < this.anInt975) {
						local184 = this.aClass2_Sub1_Sub3_9.method111();
						local626 = this.aClass2_Sub1_Sub3_9.method99();
						local192 = this.aClass2_Sub1_Sub3_9.method97();
						if (local192 == 255) {
							local192 = this.aClass2_Sub1_Sub3_9.method102();
						}
						if (local184 >= 0 && local184 < local2650.anIntArray138.length) {
							local2650.anIntArray138[local184] = local626;
							local2650.anIntArray130[local184] = local192;
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 160) {
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					local440 = this.aClass2_Sub1_Sub3_9.method117();
					if (local435 == 65535) {
						local435 = -1;
					}
					if (this.anIntArray220[local440] != local435) {
						this.method622(this.anIntArray220[local440]);
						this.anIntArray220[local440] = local435;
					}
					this.aBoolean256 = true;
					this.aBoolean240 = true;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 238) {
					this.anInt888 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt887 = this.aClass2_Sub1_Sub3_9.method97();
					for (local435 = this.anInt887; local435 < this.anInt887 + 8; local435++) {
						for (local440 = this.anInt888; local440 < this.anInt888 + 8; local440++) {
							if (this.aClass41ArrayArrayArray1[this.anInt1028][local435][local440] != null) {
								this.aClass41ArrayArrayArray1[this.anInt1028][local435][local440] = null;
								this.method654(local435, local440);
							}
						}
					}
					for (@Pc(3938) Class2_Sub2 local3938 = (Class2_Sub2) this.aClass41_11.method414(); local3938 != null; local3938 = (Class2_Sub2) this.aClass41_11.method416()) {
						if (local3938.anInt209 >= this.anInt887 && local3938.anInt209 < this.anInt887 + 8 && local3938.anInt210 >= this.anInt888 && local3938.anInt210 < this.anInt888 + 8 && local3938.anInt207 == this.anInt1028) {
							local3938.anInt211 = 0;
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 229) {
					local435 = this.aClass2_Sub1_Sub3_9.method99();
					this.method608(local435);
					if (this.anInt940 != -1) {
						this.method622(this.anInt940);
						this.anInt940 = -1;
						this.aBoolean256 = true;
						this.aBoolean240 = true;
					}
					if (this.anInt891 != -1) {
						this.method622(this.anInt891);
						this.anInt891 = -1;
						this.aBoolean282 = true;
					}
					if (this.anInt1025 != -1) {
						this.method622(this.anInt1025);
						this.anInt1025 = -1;
					}
					if (this.anInt850 != -1) {
						this.method622(this.anInt850);
						this.anInt850 = -1;
					}
					if (this.anInt849 != local435) {
						this.method622(this.anInt849);
						this.anInt849 = local435;
					}
					this.aBoolean281 = false;
					this.aBoolean252 = true;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 219) {
					for (local435 = 0; local435 < this.anIntArray244.length; local435++) {
						if (this.anIntArray244[local435] != this.anIntArray215[local435]) {
							this.anIntArray244[local435] = this.anIntArray215[local435];
							this.method616(local435);
							this.aBoolean256 = true;
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 81) {
					this.aBoolean244 = false;
					this.anInt973 = 2;
					this.aString22 = "";
					this.aBoolean252 = true;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 39) {
					this.anInt941 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt816 = this.aClass2_Sub1_Sub3_9.method97();
					this.anInt877 = this.aClass2_Sub1_Sub3_9.method97();
					this.aBoolean242 = true;
					this.aBoolean252 = true;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 71) {
					local435 = this.aClass2_Sub1_Sub3_9.method132();
					local440 = this.aClass2_Sub1_Sub3_9.method127();
					this.anIntArray215[local440] = local435;
					if (this.anIntArray244[local440] != local435) {
						this.anIntArray244[local440] = local435;
						this.method616(local440);
						this.aBoolean256 = true;
						if (this.anInt991 != -1) {
							this.aBoolean252 = true;
						}
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 129) {
					this.anInt848 = this.aClass2_Sub1_Sub3_9.method97();
					if (this.anInt848 == 1) {
						this.anInt900 = this.aClass2_Sub1_Sub3_9.method99();
					}
					if (this.anInt848 >= 2 && this.anInt848 <= 6) {
						if (this.anInt848 == 2) {
							this.anInt953 = 64;
							this.anInt954 = 64;
						}
						if (this.anInt848 == 3) {
							this.anInt953 = 0;
							this.anInt954 = 64;
						}
						if (this.anInt848 == 4) {
							this.anInt953 = 128;
							this.anInt954 = 64;
						}
						if (this.anInt848 == 5) {
							this.anInt953 = 64;
							this.anInt954 = 0;
						}
						if (this.anInt848 == 6) {
							this.anInt953 = 64;
							this.anInt954 = 128;
						}
						this.anInt848 = 2;
						this.anInt950 = this.aClass2_Sub1_Sub3_9.method99();
						this.anInt951 = this.aClass2_Sub1_Sub3_9.method99();
						this.anInt952 = this.aClass2_Sub1_Sub3_9.method97();
					}
					if (this.anInt848 == 10) {
						this.anInt971 = this.aClass2_Sub1_Sub3_9.method99();
					}
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 68) {
					local435 = this.aClass2_Sub1_Sub3_9.method126();
					local440 = this.aClass2_Sub1_Sub3_9.method127();
					this.method608(local440);
					if (local435 != -1) {
						this.method608(local435);
					}
					if (this.anInt850 != -1) {
						this.method622(this.anInt850);
						this.anInt850 = -1;
					}
					if (this.anInt940 != -1) {
						this.method622(this.anInt940);
						this.anInt940 = -1;
					}
					if (this.anInt849 != -1) {
						this.method622(this.anInt849);
						this.anInt849 = -1;
					}
					if (this.anInt891 != local440) {
						this.method622(this.anInt891);
						this.anInt891 = local440;
					}
					if (this.anInt1025 != local440) {
						this.method622(this.anInt1025);
						this.anInt1025 = local435;
					}
					this.anInt973 = 0;
					this.aBoolean281 = false;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 255) {
					local435 = this.aClass2_Sub1_Sub3_9.method129(this.anInt889);
					if (local435 != this.anInt991) {
						this.method622(this.anInt991);
						this.anInt991 = local435;
					}
					this.aBoolean252 = true;
					this.anInt976 = -1;
					return true;
				}
				if (this.anInt976 == 30) {
					this.aBoolean244 = false;
					this.anInt973 = 1;
					this.aString22 = "";
					this.aBoolean252 = true;
					this.anInt976 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt976 + "," + this.anInt975 + " - " + this.anInt1009 + "," + this.anInt1010);
				this.method701();
			} catch (@Pc(4504) IOException local4504) {
				this.method643();
			} catch (@Pc(4509) Exception local4509) {
				local1709 = "T2 - " + this.anInt976 + "," + this.anInt1009 + "," + this.anInt1010 + " - " + this.anInt975 + "," + (this.anInt907 + aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0]) + "," + (this.anInt908 + aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0]) + " - ";
				for (local440 = 0; local440 < this.anInt975 && local440 < 50; local440++) {
					local1709 = local1709 + this.aClass2_Sub1_Sub3_9.aByteArray10[local440] + ",";
				}
				signlink.reporterror(local1709);
				this.method701();
			}
			return true;
		} catch (@Pc(4590) RuntimeException local4590) {
			signlink.reporterror("44633, " + arg0 + ", " + local4590.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!EMWAMCXW;I)V")
	private void method656(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 >= 0) {
				this.aBoolean243 = !this.aBoolean243;
			}
			@Pc(17) int local17;
			@Pc(26) int local26;
			@Pc(33) int local33;
			@Pc(36) int local36;
			@Pc(39) int local39;
			@Pc(42) int local42;
			if (arg2 == 216) {
				local17 = arg1.method97();
				local26 = this.anInt887 + (local17 >> 4 & 0x7);
				local33 = this.anInt888 + (local17 & 0x7);
				local36 = arg1.method99();
				local39 = arg1.method97();
				local42 = arg1.method99();
				if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
					local26 = local26 * 128 + 64;
					local33 = local33 * 128 + 64;
					@Pc(85) Class2_Sub1_Sub2_Sub5 local85 = new Class2_Sub1_Sub2_Sub5(this.anInt1028, local36, local26, this.method657(this.anInt1028, local26, local33) - local39, local33, local42, anInt856, 0);
					this.aClass41_12.method411(local85);
				}
			} else if (arg2 == 19) {
				local17 = arg1.method97();
				local26 = this.anInt887 + (local17 >> 4 & 0x7);
				local33 = this.anInt888 + (local17 & 0x7);
				local36 = arg1.method99();
				local39 = arg1.method99();
				local42 = arg1.method99();
				if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
					@Pc(141) Class41 local141 = this.aClass41ArrayArrayArray1[this.anInt1028][local26][local33];
					if (local141 != null) {
						for (@Pc(147) Class2_Sub1_Sub2_Sub1 local147 = (Class2_Sub1_Sub2_Sub1) local141.method414(); local147 != null; local147 = (Class2_Sub1_Sub2_Sub1) local141.method416()) {
							if (local147.anInt69 == (local36 & 0x7FFF) && local147.anInt68 == local39) {
								local147.anInt68 = local42;
								break;
							}
						}
						this.method654(local26, local33);
					}
				}
			} else {
				@Pc(214) int local214;
				if (arg2 == 236) {
					local17 = arg1.method97();
					local26 = this.anInt887 + (local17 >> 4 & 0x7);
					local33 = this.anInt888 + (local17 & 0x7);
					local36 = arg1.method99();
					local39 = arg1.method97();
					local42 = local39 >> 4 & 0xF;
					local214 = local39 & 0x7;
					if (aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0] >= local26 - local42 && aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0] <= local26 + local42 && aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0] >= local33 - local42 && aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0] <= local33 + local42 && this.aBoolean280 && !aBoolean250 && this.anInt914 < 50) {
						this.anIntArray248[this.anInt914] = local36;
						this.anIntArray268[this.anInt914] = local214;
						this.anIntArray218[this.anInt914] = Class21.anIntArray98[local36];
						this.anInt914++;
					}
				}
				@Pc(316) int local316;
				@Pc(324) int local324;
				@Pc(333) int local333;
				@Pc(340) int local340;
				@Pc(348) int local348;
				if (arg2 == 231) {
					local17 = arg1.method99();
					local26 = arg1.method99();
					@Pc(294) byte local294 = arg1.method120();
					@Pc(299) byte local299 = arg1.method119(this.anInt814);
					local39 = arg1.method118();
					local42 = local39 >> 2;
					local214 = local39 & 0x3;
					local316 = this.anIntArray276[local42];
					@Pc(320) byte local320 = arg1.method120();
					local324 = arg1.method118();
					local333 = this.anInt887 + (local324 >> 4 & 0x7);
					local340 = this.anInt888 + (local324 & 0x7);
					@Pc(344) byte local344 = arg1.method121();
					local348 = arg1.method127();
					@Pc(352) int local352 = arg1.method126();
					@Pc(358) Class2_Sub1_Sub2_Sub3_Sub2 local358;
					if (local348 == this.anInt842) {
						local358 = aClass2_Sub1_Sub2_Sub3_Sub2_1;
					} else {
						local358 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local348];
					}
					if (local358 != null) {
						@Pc(370) Class1 local370 = Class1.method4(local17);
						@Pc(380) int local380 = this.anIntArrayArrayArray7[this.anInt1028][local333][local340];
						@Pc(392) int local392 = this.anIntArrayArrayArray7[this.anInt1028][local333 + 1][local340];
						@Pc(406) int local406 = this.anIntArrayArrayArray7[this.anInt1028][local333 + 1][local340 + 1];
						@Pc(418) int local418 = this.anIntArrayArrayArray7[this.anInt1028][local333][local340 + 1];
						@Pc(428) Class2_Sub1_Sub2_Sub2 local428 = local370.method5(local42, local214, local380, local392, local406, local418, -1);
						if (local428 != null) {
							this.method711(-1, 0, 0, this.anInt1028, local26 + 1, local333, local316, local352 + 1, local340);
							local358.anInt711 = local26 + anInt856;
							local358.anInt712 = local352 + anInt856;
							local358.aClass2_Sub1_Sub2_Sub2_2 = local428;
							@Pc(463) int local463 = local370.anInt8;
							@Pc(466) int local466 = local370.anInt13;
							if (local214 == 1 || local214 == 3) {
								local463 = local370.anInt13;
								local466 = local370.anInt8;
							}
							local358.anInt715 = local333 * 128 + local463 * 64;
							local358.anInt717 = local340 * 128 + local466 * 64;
							local358.anInt716 = this.method657(this.anInt1028, local358.anInt715, local358.anInt717);
							@Pc(512) byte local512;
							if (local320 > local294) {
								local512 = local320;
								local320 = local294;
								local294 = local512;
							}
							if (local344 > local299) {
								local512 = local344;
								local344 = local299;
								local299 = local512;
							}
							local358.anInt705 = local333 + local320;
							local358.anInt707 = local333 + local294;
							local358.anInt706 = local340 + local344;
							local358.anInt708 = local340 + local299;
						}
					}
				}
				@Pc(589) Class2_Sub1_Sub2_Sub1 local589;
				if (arg2 == 94) {
					local17 = arg1.method126();
					local26 = arg1.method97();
					local33 = this.anInt887 + (local26 >> 4 & 0x7);
					local36 = this.anInt888 + (local26 & 0x7);
					local39 = arg1.method127();
					if (local33 >= 0 && local36 >= 0 && local33 < 104 && local36 < 104) {
						local589 = new Class2_Sub1_Sub2_Sub1();
						local589.anInt69 = local17;
						local589.anInt68 = local39;
						if (this.aClass41ArrayArrayArray1[this.anInt1028][local33][local36] == null) {
							this.aClass41ArrayArrayArray1[this.anInt1028][local33][local36] = new Class41(36113);
						}
						this.aClass41ArrayArrayArray1[this.anInt1028][local33][local36].method411(local589);
						this.method654(local33, local36);
					}
				} else if (arg2 == 87) {
					local17 = arg1.method97();
					local26 = this.anInt887 + (local17 >> 4 & 0x7);
					local33 = this.anInt888 + (local17 & 0x7);
					local36 = arg1.method97();
					local39 = local36 >> 2;
					local42 = local36 & 0x3;
					local214 = this.anIntArray276[local39];
					if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
						this.method711(-1, local39, local42, this.anInt1028, 0, local26, local214, -1, local33);
					}
				} else {
					@Pc(744) int local744;
					if (arg2 == 65) {
						local17 = arg1.method97();
						local26 = this.anInt887 + (local17 >> 4 & 0x7);
						local33 = this.anInt888 + (local17 & 0x7);
						local36 = local26 + arg1.method98();
						local39 = local33 + arg1.method98();
						local42 = arg1.method100();
						local214 = arg1.method99();
						local316 = arg1.method97() * 4;
						local744 = arg1.method97() * 4;
						local324 = arg1.method99();
						local333 = arg1.method99();
						local340 = arg1.method97();
						@Pc(756) int local756 = arg1.method97();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local36 >= 0 && local39 >= 0 && local36 < 104 && local39 < 104 && local214 != 65535) {
							local26 = local26 * 128 + 64;
							local33 = local33 * 128 + 64;
							local36 = local36 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(832) Class2_Sub1_Sub2_Sub6 local832 = new Class2_Sub1_Sub2_Sub6(local324 + anInt856, local33, local340, 0, local744, local333 + anInt856, local214, this.anInt1028, local26, local42, local756, this.method657(this.anInt1028, local26, local33) - local316);
							local832.method424(local39, local36, local324 + anInt856, this.method657(this.anInt1028, local36, local39) - local744);
							this.aClass41_10.method411(local832);
						}
					} else if (arg2 == 93) {
						local17 = arg1.method125();
						local26 = arg1.method118();
						local33 = this.anInt887 + (local26 >> 4 & 0x7);
						local36 = this.anInt888 + (local26 & 0x7);
						if (local33 >= 0 && local36 >= 0 && local33 < 104 && local36 < 104) {
							@Pc(901) Class41 local901 = this.aClass41ArrayArrayArray1[this.anInt1028][local33][local36];
							if (local901 != null) {
								for (local589 = (Class2_Sub1_Sub2_Sub1) local901.method414(); local589 != null; local589 = (Class2_Sub1_Sub2_Sub1) local901.method416()) {
									if (local589.anInt69 == (local17 & 0x7FFF)) {
										local589.method466();
										break;
									}
								}
								if (local901.method414() == null) {
									this.aClass41ArrayArrayArray1[this.anInt1028][local33][local36] = null;
								}
								this.method654(local33, local36);
							}
						}
					} else if (arg2 == 103) {
						local17 = arg1.method118();
						local26 = local17 >> 2;
						local33 = local17 & 0x3;
						local36 = this.anIntArray276[local26];
						local39 = arg1.method125();
						local42 = arg1.method116();
						local214 = this.anInt887 + (local42 >> 4 & 0x7);
						local316 = this.anInt888 + (local42 & 0x7);
						if (local214 >= 0 && local316 >= 0 && local214 < 103 && local316 < 103) {
							local744 = this.anIntArrayArrayArray7[this.anInt1028][local214][local316];
							local324 = this.anIntArrayArrayArray7[this.anInt1028][local214 + 1][local316];
							local333 = this.anIntArrayArrayArray7[this.anInt1028][local214 + 1][local316 + 1];
							local340 = this.anIntArrayArrayArray7[this.anInt1028][local214][local316 + 1];
							if (local36 == 0) {
								@Pc(1057) Class24 local1057 = this.aClass47_1.method509(local316, this.anInt1028, local214);
								if (local1057 != null) {
									local348 = local1057.anInt251 >> 14 & 0x7FFF;
									if (local26 == 2) {
										local1057.aClass2_Sub1_Sub2_2 = new Class2_Sub1_Sub2_Sub4(local333, local340, local33 + 4, 2, local744, local348, local324, local39, (byte) 5, false);
										local1057.aClass2_Sub1_Sub2_3 = new Class2_Sub1_Sub2_Sub4(local333, local340, local33 + 1 & 0x3, 2, local744, local348, local324, local39, (byte) 5, false);
									} else {
										local1057.aClass2_Sub1_Sub2_2 = new Class2_Sub1_Sub2_Sub4(local333, local340, local33, local26, local744, local348, local324, local39, (byte) 5, false);
									}
								}
							}
							if (local36 == 1) {
								@Pc(1134) Class27 local1134 = this.aClass47_1.method510(this.anInt1028, local316, local214);
								if (local1134 != null) {
									local1134.aClass2_Sub1_Sub2_4 = new Class2_Sub1_Sub2_Sub4(local333, local340, 0, 4, local744, local1134.anInt317 >> 14 & 0x7FFF, local324, local39, (byte) 5, false);
								}
							}
							if (local36 == 2) {
								@Pc(1168) Class7 local1168 = this.aClass47_1.method511(local316, (byte) 2, local214, this.anInt1028);
								if (local26 == 11) {
									local26 = 10;
								}
								if (local1168 != null) {
									local1168.aClass2_Sub1_Sub2_1 = new Class2_Sub1_Sub2_Sub4(local333, local340, local33, local26, local744, local1168.anInt116 >> 14 & 0x7FFF, local324, local39, (byte) 5, false);
								}
							}
							if (local36 == 3) {
								@Pc(1207) Class43 local1207 = this.aClass47_1.method512(local316, 186, this.anInt1028, local214);
								if (local1207 != null) {
									local1207.aClass2_Sub1_Sub2_5 = new Class2_Sub1_Sub2_Sub4(local333, local340, local33, 22, local744, local1207.anInt633 >> 14 & 0x7FFF, local324, local39, (byte) 5, false);
								}
							}
						}
					} else if (arg2 == 131) {
						local17 = arg1.method99();
						local26 = arg1.method127();
						local33 = arg1.method127();
						local36 = arg1.method117();
						local39 = this.anInt887 + (local36 >> 4 & 0x7);
						local42 = this.anInt888 + (local36 & 0x7);
						if (local39 >= 0 && local42 >= 0 && local39 < 104 && local42 < 104 && local17 != this.anInt842) {
							@Pc(1282) Class2_Sub1_Sub2_Sub1 local1282 = new Class2_Sub1_Sub2_Sub1();
							local1282.anInt69 = local26;
							local1282.anInt68 = local33;
							if (this.aClass41ArrayArrayArray1[this.anInt1028][local39][local42] == null) {
								this.aClass41ArrayArrayArray1[this.anInt1028][local39][local42] = new Class41(36113);
							}
							this.aClass41ArrayArrayArray1[this.anInt1028][local39][local42].method411(local1282);
							this.method654(local39, local42);
						}
					} else if (arg2 == 191) {
						local17 = arg1.method118();
						local26 = local17 >> 2;
						local33 = local17 & 0x3;
						local36 = this.anIntArray276[local26];
						local39 = arg1.method97();
						local42 = this.anInt887 + (local39 >> 4 & 0x7);
						local214 = this.anInt888 + (local39 & 0x7);
						local316 = arg1.method99();
						if (local42 >= 0 && local214 >= 0 && local42 < 104 && local214 < 104) {
							this.method711(local316, local26, local33, this.anInt1028, 0, local42, local36, -1, local214);
						}
					}
				}
			}
		} catch (@Pc(1394) RuntimeException local1394) {
			signlink.reporterror("79728, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) int local8 = arg1 >> 7;
			@Pc(12) int local12 = arg2 >> 7;
			if (local8 < 0 || local12 < 0 || local8 > 103 || local12 > 103) {
				return 0;
			}
			@Pc(26) int local26 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray8[1][local8][local12] & 0x2) == 2) {
				local26 = arg0 + 1;
			}
			@Pc(46) int local46 = arg1 & 0x7F;
			@Pc(50) int local50 = arg2 & 0x7F;
			@Pc(78) int local78 = this.anIntArrayArrayArray7[local26][local8][local12] * (128 - local46) + this.anIntArrayArrayArray7[local26][local8 + 1][local12] * local46 >> 7;
			@Pc(110) int local110 = this.anIntArrayArrayArray7[local26][local8][local12 + 1] * (128 - local46) + this.anIntArrayArrayArray7[local26][local8 + 1][local12 + 1] * local46 >> 7;
			return local78 * (128 - local50) + local110 * local50 >> 7;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("16555, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EMWAMCXW;ZI)V")
	private void method658(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1031 = 0;
			this.anInt899 = 0;
			this.method710(arg0, arg1);
			this.method659(arg0, arg1);
			this.method606(arg0, arg1);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt1031; local30++) {
				local37 = this.anIntArray274[local30];
				if (this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local37].anInt678 != anInt856) {
					this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local37].aClass46_1 = null;
					this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local37] = null;
				}
			}
			if (arg0.anInt136 != arg1) {
				signlink.reporterror(this.aString25 + " size mismatch in getnpcpos - pos:" + arg0.anInt136 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt829; local37++) {
				if (this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray217[local37]] == null) {
					signlink.reporterror(this.aString25 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt829);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("72448, " + arg0 + ", " + true + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!EMWAMCXW;I)V")
	private void method659(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt137 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method108(14);
					if (local12 != 16383) {
						if (this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local12] == null) {
							this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local12] = new Class2_Sub1_Sub2_Sub3_Sub1();
						}
						@Pc(32) Class2_Sub1_Sub2_Sub3_Sub1 local32 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local12];
						this.anIntArray217[this.anInt829++] = local12;
						local32.anInt678 = anInt856;
						@Pc(51) int local51 = arg0.method108(1);
						if (local51 == 1) {
							this.anIntArray246[this.anInt899++] = local12;
						}
						@Pc(70) int local70 = arg0.method108(5);
						if (local70 > 15) {
							local70 -= 32;
						}
						@Pc(79) int local79 = arg0.method108(1);
						@Pc(84) int local84 = arg0.method108(5);
						if (local84 > 15) {
							local84 -= 32;
						}
						local32.aClass46_1 = Class46.method480(arg0.method108(13));
						local32.anInt690 = local32.aClass46_1.aByte27;
						local32.anInt672 = local32.aClass46_1.anInt740;
						local32.anInt657 = local32.aClass46_1.anInt744;
						local32.anInt658 = local32.aClass46_1.anInt742;
						local32.anInt659 = local32.aClass46_1.anInt736;
						local32.anInt660 = local32.aClass46_1.anInt743;
						local32.anInt661 = local32.aClass46_1.anInt725;
						local32.method470(aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0] + local70, local79 == 1, this.anInt884, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0] + local84);
						continue;
					}
				}
				arg0.method109();
				return;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("65662, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method660(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt1011; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt1011--;
						this.aBoolean256 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt1011; local34++) {
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass2_Sub1_Sub3_7.method86(247, 533);
						this.aClass2_Sub1_Sub3_7.method93(arg0);
						return;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("29472, " + 7 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method661(@OriginalArg(0) boolean arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1029);
			if (!arg0) {
				this.method581();
			}
			if (this.aClass18_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass18_Sub1_1.anInt234);
			}
			System.out.println("loop-cycle:" + anInt856);
			System.out.println("draw-cycle:" + anInt890);
			System.out.println("ptype:" + this.anInt976);
			System.out.println("psize:" + this.anInt975);
			if (this.aClass6_1 != null) {
				this.aClass6_1.method57(aBoolean266);
			}
			super.aBoolean237 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("37712, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method586() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("78835, " + 75 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method662() {
		try {
			if (this.anInt920 == 0) {
				this.aStringArray12[0] = "Cancel";
				this.anIntArray266[0] = 1196;
				this.anInt937 = 1;
				if (this.anInt891 == -1) {
					this.method681(454);
					this.anInt932 = 0;
					this.anInt966 = 0;
					if (super.anInt803 > 4 && super.anInt804 > 4 && super.anInt803 < 516 && super.anInt804 < 338) {
						if (this.anInt850 == -1) {
							this.method593();
						} else {
							this.method595(0, Class31.method293(this.anInt850), 4, 4, super.anInt803, 0, super.anInt804);
						}
					}
					if (this.anInt932 != this.anInt984) {
						this.anInt984 = this.anInt932;
					}
					if (this.anInt966 != this.anInt965) {
						this.anInt965 = this.anInt966;
					}
					this.anInt932 = 0;
					this.anInt966 = 0;
					if (super.anInt803 > 553 && super.anInt804 > 205 && super.anInt803 < 743 && super.anInt804 < 466) {
						if (this.anInt940 != -1) {
							this.method595(0, Class31.method293(this.anInt940), 553, 205, super.anInt803, 1, super.anInt804);
						} else if (this.anIntArray220[this.anInt819] != -1) {
							this.method595(0, Class31.method293(this.anIntArray220[this.anInt819]), 553, 205, super.anInt803, 1, super.anInt804);
						}
					}
					if (this.anInt932 != this.anInt824) {
						this.aBoolean256 = true;
						this.anInt824 = this.anInt932;
					}
					if (this.anInt966 != this.anInt826) {
						this.aBoolean256 = true;
						this.anInt826 = this.anInt966;
					}
					this.anInt932 = 0;
					this.anInt966 = 0;
					if (super.anInt803 > 17 && super.anInt804 > 357 && super.anInt803 < 496 && super.anInt804 < 453) {
						if (this.anInt849 != -1) {
							this.method595(0, Class31.method293(this.anInt849), 17, 357, super.anInt803, 2, super.anInt804);
						} else if (this.anInt991 != -1) {
							this.method595(0, Class31.method293(this.anInt991), 17, 357, super.anInt803, 3, super.anInt804);
						} else if (super.anInt804 < 434 && super.anInt803 < 426 && this.anInt973 == 0) {
							this.method727(super.anInt804 - 357, super.anInt803 - 17);
						}
					}
					if ((this.anInt849 != -1 || this.anInt991 != -1) && this.anInt932 != this.anInt873) {
						this.aBoolean252 = true;
						this.anInt873 = this.anInt932;
					}
					if ((this.anInt849 != -1 || this.anInt991 != -1) && this.anInt966 != this.anInt886) {
						this.aBoolean252 = true;
						this.anInt886 = this.anInt966;
					}
					@Pc(343) boolean local343 = false;
					while (!local343) {
						local343 = true;
						for (@Pc(355) int local355 = 0; local355 < this.anInt937 - 1; local355++) {
							if (this.anIntArray266[local355] < 1000 && this.anIntArray266[local355 + 1] > 1000) {
								@Pc(376) String local376 = this.aStringArray12[local355];
								this.aStringArray12[local355] = this.aStringArray12[local355 + 1];
								this.aStringArray12[local355 + 1] = local376;
								@Pc(398) int local398 = this.anIntArray266[local355];
								this.anIntArray266[local355] = this.anIntArray266[local355 + 1];
								this.anIntArray266[local355 + 1] = local398;
								@Pc(420) int local420 = this.anIntArray264[local355];
								this.anIntArray264[local355] = this.anIntArray264[local355 + 1];
								this.anIntArray264[local355 + 1] = local420;
								@Pc(442) int local442 = this.anIntArray265[local355];
								this.anIntArray265[local355] = this.anIntArray265[local355 + 1];
								this.anIntArray265[local355 + 1] = local442;
								@Pc(464) int local464 = this.anIntArray267[local355];
								this.anIntArray267[local355] = this.anIntArray267[local355 + 1];
								this.anIntArray267[local355 + 1] = local464;
								local343 = false;
							}
						}
					}
				} else {
					this.anInt932 = 0;
					this.anInt966 = 0;
					this.method595(0, Class31.method293(this.anInt891), 0, 0, super.anInt803, 0, super.anInt804);
					if (this.anInt932 != this.anInt984) {
						this.anInt984 = this.anInt932;
					}
					if (this.anInt966 != this.anInt965) {
						this.anInt965 = this.anInt966;
					}
				}
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("9633, " + 54 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	private String method663(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean271 &= true;
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("93797, " + arg0 + ", " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!OKXNBSEJ;)V")
	private void method664(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub3 arg1) {
		try {
			this.aBoolean271 &= true;
			this.method665(arg0, arg1.anInt680, arg1.anInt679);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("72436, " + true + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method657(this.anInt1028, arg2, arg1) - arg0;
				@Pc(33) int local33 = arg2 - this.anInt1015;
				@Pc(38) int local38 = local28 - this.anInt1016;
				@Pc(43) int local43 = arg1 - this.anInt1017;
				@Pc(48) int local48 = Class2_Sub1_Sub2_Sub2.anIntArray73[this.anInt1018];
				@Pc(53) int local53 = Class2_Sub1_Sub2_Sub2.anIntArray74[this.anInt1018];
				@Pc(58) int local58 = Class2_Sub1_Sub2_Sub2.anIntArray73[this.anInt1019];
				@Pc(63) int local63 = Class2_Sub1_Sub2_Sub2.anIntArray74[this.anInt1019];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(110) int local110 = local38 * local48 + local83 * local53 >> 16;
				if (local110 >= 50) {
					this.anInt948 = Class2_Sub1_Sub1_Sub2.anInt335 + (local85 << 9) / local110;
					this.anInt949 = Class2_Sub1_Sub1_Sub2.anInt336 + (local95 << 9) / local110;
				} else {
					this.anInt948 = -1;
					this.anInt949 = -1;
				}
			} else {
				this.anInt948 = -1;
				this.anInt949 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("30687, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method666() {
		try {
			if (super.anInt808 == 1) {
				if (super.anInt809 >= 539 && super.anInt809 <= 573 && super.anInt810 >= 169 && super.anInt810 < 205 && this.anIntArray220[0] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 0;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 569 && super.anInt809 <= 599 && super.anInt810 >= 168 && super.anInt810 < 205 && this.anIntArray220[1] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 1;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 597 && super.anInt809 <= 627 && super.anInt810 >= 168 && super.anInt810 < 205 && this.anIntArray220[2] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 2;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 625 && super.anInt809 <= 669 && super.anInt810 >= 168 && super.anInt810 < 203 && this.anIntArray220[3] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 3;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 666 && super.anInt809 <= 696 && super.anInt810 >= 168 && super.anInt810 < 205 && this.anIntArray220[4] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 4;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 694 && super.anInt809 <= 724 && super.anInt810 >= 168 && super.anInt810 < 205 && this.anIntArray220[5] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 5;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 722 && super.anInt809 <= 756 && super.anInt810 >= 169 && super.anInt810 < 205 && this.anIntArray220[6] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 6;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 540 && super.anInt809 <= 574 && super.anInt810 >= 466 && super.anInt810 < 502 && this.anIntArray220[7] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 7;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 572 && super.anInt809 <= 602 && super.anInt810 >= 466 && super.anInt810 < 503 && this.anIntArray220[8] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 8;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 599 && super.anInt809 <= 629 && super.anInt810 >= 466 && super.anInt810 < 503 && this.anIntArray220[9] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 9;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 627 && super.anInt809 <= 671 && super.anInt810 >= 467 && super.anInt810 < 502 && this.anIntArray220[10] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 10;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 669 && super.anInt809 <= 699 && super.anInt810 >= 466 && super.anInt810 < 503 && this.anIntArray220[11] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 11;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 696 && super.anInt809 <= 726 && super.anInt810 >= 466 && super.anInt810 < 503 && this.anIntArray220[12] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 12;
					this.aBoolean240 = true;
				}
				if (super.anInt809 >= 724 && super.anInt809 <= 758 && super.anInt810 >= 466 && super.anInt810 < 502 && this.anIntArray220[13] != -1) {
					this.aBoolean256 = true;
					this.anInt819 = 13;
					this.aBoolean240 = true;
					return;
				}
			}
		} catch (@Pc(452) RuntimeException local452) {
			signlink.reporterror("69351, " + -631 + ", " + local452.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QXTIWHBH;)Z")
	private boolean method667(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(12) int local12 = arg0.anInt405;
			if (this.anInt893 == 2) {
				if (local12 == 201) {
					this.aBoolean252 = true;
					this.anInt973 = 0;
					this.aBoolean244 = true;
					this.aString21 = "";
					this.anInt943 = 1;
					this.aString27 = "Enter name of friend to add to list";
				}
				if (local12 == 202) {
					this.aBoolean252 = true;
					this.anInt973 = 0;
					this.aBoolean244 = true;
					this.aString21 = "";
					this.anInt943 = 2;
					this.aString27 = "Enter name of friend to delete from list";
				}
			}
			if (local12 == 205) {
				this.anInt979 = 250;
				return true;
			}
			if (local12 == 501) {
				this.aBoolean252 = true;
				this.anInt973 = 0;
				this.aBoolean244 = true;
				this.aString21 = "";
				this.anInt943 = 4;
				this.aString27 = "Enter name of player to add to list";
			}
			if (local12 == 502) {
				this.aBoolean252 = true;
				this.anInt973 = 0;
				this.aBoolean244 = true;
				this.aString21 = "";
				this.anInt943 = 5;
				this.aString27 = "Enter name of player to delete from list";
			}
			@Pc(120) int local120;
			@Pc(124) int local124;
			@Pc(129) int local129;
			if (local12 >= 300 && local12 <= 313) {
				local120 = (local12 - 300) / 2;
				local124 = local12 & 0x1;
				local129 = this.anIntArray235[local120];
				if (local129 != -1) {
					while (true) {
						if (local124 == 0) {
							local129--;
							if (local129 < 0) {
								local129 = Class30.anInt371 - 1;
							}
						}
						if (local124 == 1) {
							local129++;
							if (local129 >= Class30.anInt371) {
								local129 = 0;
							}
						}
						if (!Class30.aClass30Array1[local129].aBoolean142 && Class30.aClass30Array1[local129].anInt372 == local120 + (this.aBoolean260 ? 0 : 7)) {
							this.anIntArray235[local120] = local129;
							this.aBoolean285 = true;
							break;
						}
					}
				}
			}
			if (local12 >= 314 && local12 <= 323) {
				local120 = (local12 - 314) / 2;
				local124 = local12 & 0x1;
				local129 = this.anIntArray260[local120];
				if (local124 == 0) {
					local129--;
					if (local129 < 0) {
						local129 = anIntArrayArray22[local120].length - 1;
					}
				}
				if (local124 == 1) {
					local129++;
					if (local129 >= anIntArrayArray22[local120].length) {
						local129 = 0;
					}
				}
				this.anIntArray260[local120] = local129;
				this.aBoolean285 = true;
			}
			if (local12 == 324 && !this.aBoolean260) {
				this.aBoolean260 = true;
				this.method650();
			}
			if (local12 == 325 && this.aBoolean260) {
				this.aBoolean260 = false;
				this.method650();
			}
			if (local12 == 326) {
				this.aClass2_Sub1_Sub3_7.method86(19, 533);
				this.aClass2_Sub1_Sub3_7.method87(this.aBoolean260 ? 0 : 1);
				for (local120 = 0; local120 < 7; local120++) {
					this.aClass2_Sub1_Sub3_7.method87(this.anIntArray235[local120]);
				}
				for (local124 = 0; local124 < 5; local124++) {
					this.aClass2_Sub1_Sub3_7.method87(this.anIntArray260[local124]);
				}
				return true;
			}
			if (local12 == 620) {
				this.aBoolean275 = !this.aBoolean275;
			}
			if (local12 >= 601 && local12 <= 613) {
				this.method669();
				if (this.aString29.length() > 0) {
					this.aClass2_Sub1_Sub3_7.method86(255, 533);
					this.aClass2_Sub1_Sub3_7.method93(Class40.method405(this.aString29));
					this.aClass2_Sub1_Sub3_7.method87(local12 - 601);
					this.aClass2_Sub1_Sub3_7.method87(this.aBoolean275 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("75470, " + 5 + ", " + arg0 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EMWAMCXW;II)V")
	private void method668(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1031 = 0;
			this.anInt899 = 0;
			this.method642(arg0, arg1);
			this.method712(arg0, 671, arg1);
			this.method605(arg1, arg0);
			this.method599(arg1, arg0);
			@Pc(44) int local44;
			for (@Pc(37) int local37 = 0; local37 < this.anInt1031; local37++) {
				local44 = this.anIntArray274[local37];
				if (this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local44].anInt678 != anInt856) {
					this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local44] = null;
				}
			}
			if (arg0.anInt136 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt136 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local44 = 0; local44 < this.anInt898; local44++) {
				if (this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray245[local44]] == null) {
					signlink.reporterror(this.aString25 + " null entry in pl list - pos:" + local44 + " size:" + this.anInt898);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("3455, " + arg0 + ", " + -843 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method669() {
		try {
			this.aClass2_Sub1_Sub3_7.method86(94, 533);
			if (this.anInt940 != -1) {
				this.method622(this.anInt940);
				this.anInt940 = -1;
				this.aBoolean256 = true;
				this.aBoolean281 = false;
				this.aBoolean240 = true;
			}
			if (this.anInt849 != -1) {
				this.method622(this.anInt849);
				this.anInt849 = -1;
				this.aBoolean252 = true;
				this.aBoolean281 = false;
			}
			if (this.anInt891 != -1) {
				this.method622(this.anInt891);
				this.anInt891 = -1;
				this.aBoolean282 = true;
			}
			if (this.anInt1025 != -1) {
				this.method622(this.anInt1025);
				this.anInt1025 = -1;
			}
			if (this.anInt850 != -1) {
				this.method622(this.anInt850);
				this.anInt850 = -1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("43933, " + -744 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!QXTIWHBH;)Z")
	private boolean method670(@OriginalArg(1) Class31 arg0) {
		try {
			if (arg0.anIntArray133 == null) {
				return false;
			}
			for (@Pc(14) int local14 = 0; local14 < arg0.anIntArray133.length; local14++) {
				@Pc(22) int local22 = this.method722(local14, arg0);
				@Pc(27) int local27 = arg0.anIntArray134[local14];
				if (arg0.anIntArray133[local14] == 2) {
					if (local22 >= local27) {
						return false;
					}
				} else if (arg0.anIntArray133[local14] == 3) {
					if (local22 <= local27) {
						return false;
					}
				} else if (arg0.anIntArray133[local14] == 4) {
					if (local22 == local27) {
						return false;
					}
				} else if (local22 != local27) {
					return false;
				}
			}
			return true;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("33131, " + -283 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method671() {
		try {
			this.aClass42_15.method425();
			Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray252;
			this.aClass2_Sub1_Sub1_Sub1_15.method77(0, 0);
			if (this.aBoolean244) {
				this.aClass2_Sub1_Sub1_Sub4_4.method444(this.aString27, 936, 0, 239, 40);
				this.aClass2_Sub1_Sub1_Sub4_4.method444(this.aString21 + "*", 936, 128, 239, 60);
			} else if (this.anInt973 == 1) {
				this.aClass2_Sub1_Sub1_Sub4_4.method444("Enter amount:", 936, 0, 239, 40);
				this.aClass2_Sub1_Sub1_Sub4_4.method444(this.aString22 + "*", 936, 128, 239, 60);
			} else if (this.anInt973 == 2) {
				this.aClass2_Sub1_Sub1_Sub4_4.method444("Enter name:", 936, 0, 239, 40);
				this.aClass2_Sub1_Sub1_Sub4_4.method444(this.aString22 + "*", 936, 128, 239, 60);
			} else {
				@Pc(130) Class2_Sub1_Sub1_Sub4 local130;
				@Pc(138) int local138;
				@Pc(149) int local149;
				if (this.anInt973 == 3) {
					if (this.aString22 != this.aString19) {
						this.method618(this.aString22);
						this.aString19 = this.aString22;
					}
					local130 = this.aClass2_Sub1_Sub1_Sub4_3;
					Class2_Sub1_Sub1.method433(463, 0, 77, 0);
					for (local138 = 0; local138 < this.anInt839; local138++) {
						local149 = local138 * 14 + 18 - this.anInt840;
						if (local149 > 0 && local149 < 110) {
							local130.method444(this.aStringArray10[local138], 936, 0, 239, local149);
						}
					}
					Class2_Sub1_Sub1.method432();
					if (this.anInt839 > 5) {
						this.method694(0, this.anInt839 * 14 + 7, this.anInt840, 77, 463);
					}
					if (this.aString22.length() == 0) {
						this.aClass2_Sub1_Sub1_Sub4_4.method444("Enter object name", 936, 255, 239, 40);
					} else if (this.anInt839 == 0) {
						this.aClass2_Sub1_Sub1_Sub4_4.method444("No matching objects found, please shorten search", 936, 0, 239, 40);
					}
					local130.method444(this.aString22 + "*", 936, 0, 239, 90);
					Class2_Sub1_Sub1.method439(0, 129, 77, 479, 0);
				} else if (this.aString23 != null) {
					this.aClass2_Sub1_Sub1_Sub4_4.method444(this.aString23, 936, 0, 239, 40);
					this.aClass2_Sub1_Sub1_Sub4_4.method444("Click to continue", 936, 128, 239, 60);
				} else if (this.anInt849 != -1) {
					this.method725(0, Class31.method293(this.anInt849), 0, 0);
				} else if (this.anInt991 == -1) {
					local130 = this.aClass2_Sub1_Sub1_Sub4_3;
					local138 = 0;
					Class2_Sub1_Sub1.method433(463, 0, 77, 0);
					for (local149 = 0; local149 < 100; local149++) {
						if (this.aStringArray14[local149] != null) {
							@Pc(314) int local314 = this.anIntArray270[local149];
							@Pc(323) int local323 = this.anInt912 + 70 - local138 * 14;
							@Pc(328) String local328 = this.aStringArray13[local149];
							@Pc(330) byte local330 = 0;
							if (local328 != null && local328.startsWith("@cr1@")) {
								local328 = local328.substring(5);
								local330 = 1;
							}
							if (local328 != null && local328.startsWith("@cr2@")) {
								local328 = local328.substring(5);
								local330 = 2;
							}
							if (local314 == 0) {
								if (local323 > 0 && local323 < 110) {
									local130.method448(this.aStringArray14[local149], 4, 0, local323);
								}
								local138++;
							}
							@Pc(400) int local400;
							if ((local314 == 1 || local314 == 2) && (local314 == 1 || this.anInt941 == 0 || this.anInt941 == 1 && this.method651(local328))) {
								if (local323 > 0 && local323 < 110) {
									local400 = 4;
									if (local330 == 1) {
										this.aClass2_Sub1_Sub1_Sub1Array3[0].method77(4, local323 - 12);
										local400 += 14;
									}
									if (local330 == 2) {
										this.aClass2_Sub1_Sub1_Sub1Array3[1].method77(local400, local323 - 12);
										local400 += 14;
									}
									local130.method448(local328 + ":", local400, 0, local323);
									local400 += local130.method446(local328) + 8;
									local130.method448(this.aStringArray14[local149], local400, 255, local323);
								}
								local138++;
							}
							if ((local314 == 3 || local314 == 7) && this.anInt841 == 0 && (local314 == 7 || this.anInt816 == 0 || this.anInt816 == 1 && this.method651(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method448("From", 4, 0, local323);
									local400 = local130.method446("From ") + 4;
									if (local330 == 1) {
										this.aClass2_Sub1_Sub1_Sub1Array3[0].method77(local400, local323 - 12);
										local400 += 14;
									}
									if (local330 == 2) {
										this.aClass2_Sub1_Sub1_Sub1Array3[1].method77(local400, local323 - 12);
										local400 += 14;
									}
									local130.method448(local328 + ":", local400, 0, local323);
									local400 += local130.method446(local328) + 8;
									local130.method448(this.aStringArray14[local149], local400, 8388608, local323);
								}
								local138++;
							}
							if (local314 == 4 && (this.anInt877 == 0 || this.anInt877 == 1 && this.method651(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method448(local328 + " " + this.aStringArray14[local149], 4, 8388736, local323);
								}
								local138++;
							}
							if (local314 == 5 && this.anInt841 == 0 && this.anInt816 < 2) {
								if (local323 > 0 && local323 < 110) {
									local130.method448(this.aStringArray14[local149], 4, 8388608, local323);
								}
								local138++;
							}
							if (local314 == 6 && this.anInt841 == 0 && this.anInt816 < 2) {
								if (local323 > 0 && local323 < 110) {
									local130.method448("To " + local328 + ":", 4, 0, local323);
									local130.method448(this.aStringArray14[local149], local130.method446("To " + local328) + 12, 8388608, local323);
								}
								local138++;
							}
							if (local314 == 8 && (this.anInt877 == 0 || this.anInt877 == 1 && this.method651(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method448(local328 + " " + this.aStringArray14[local149], 4, 8270336, local323);
								}
								local138++;
							}
						}
					}
					Class2_Sub1_Sub1.method432();
					this.anInt930 = local138 * 14 + 7;
					if (this.anInt930 < 78) {
						this.anInt930 = 78;
					}
					this.method694(0, this.anInt930, this.anInt930 - this.anInt912 - 77, 77, 463);
					@Pc(770) String local770;
					if (aClass2_Sub1_Sub2_Sub3_Sub2_1 == null || aClass2_Sub1_Sub2_Sub3_Sub2_1.aString15 == null) {
						local770 = Class40.method409(this.aString25);
					} else {
						local770 = aClass2_Sub1_Sub2_Sub3_Sub2_1.aString15;
					}
					local130.method448(local770 + ":", 4, 0, 90);
					local130.method448(this.aString24 + "*", local130.method446(local770 + ": ") + 6, 255, 90);
					Class2_Sub1_Sub1.method439(0, 129, 77, 479, 0);
				} else {
					this.method725(0, Class31.method293(this.anInt991), 0, 0);
				}
			}
			if (this.aBoolean241 && this.anInt843 == 2) {
				this.method610();
			}
			this.aClass42_15.method426(357, 17, super.aGraphics2);
			this.aClass42_14.method425();
			Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
		} catch (@Pc(851) RuntimeException local851) {
			signlink.reporterror("75366, " + true + ", " + local851.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method672(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt892; local18++) {
					if (this.aLongArray4[local18] == arg0) {
						this.anInt892--;
						this.aBoolean256 = true;
						for (@Pc(38) int local38 = local18; local38 < this.anInt892; local38++) {
							this.aStringArray8[local38] = this.aStringArray8[local38 + 1];
							this.anIntArray231[local38] = this.anIntArray231[local38 + 1];
							this.aLongArray4[local38] = this.aLongArray4[local38 + 1];
						}
						this.aClass2_Sub1_Sub3_7.method86(193, 533);
						this.aClass2_Sub1_Sub3_7.method93(arg0);
						return;
					}
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("9761, " + -224 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("48119, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt1050 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("94797, " + arg0 + ", " + arg1 + ", " + -34172 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method675() {
		try {
			if (this.anInt974 > 1) {
				this.anInt974--;
			}
			if (this.anInt979 > 0) {
				this.anInt979--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method655(51); local22++) {
			}
			if (this.aBoolean271) {
				@Pc(41) Object local41 = this.aClass23_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass23_1.anObject1) {
					if (!aBoolean258) {
						this.aClass23_1.anInt245 = 0;
					} else if (super.anInt808 != 0 || this.aClass23_1.anInt245 >= 40) {
						this.aClass2_Sub1_Sub3_7.method86(108, 533);
						this.aClass2_Sub1_Sub3_7.method87(0);
						local66 = this.aClass2_Sub1_Sub3_7.anInt136;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass23_1.anInt245 && local66 - this.aClass2_Sub1_Sub3_7.anInt136 < 240; local70++) {
							local68++;
							local86 = this.aClass23_1.anIntArray104[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass23_1.anIntArray103[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass23_1.anIntArray104[local70] == -1 && this.aClass23_1.anIntArray103[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt836 || local86 != this.anInt837) {
								@Pc(165) int local165 = local103 - this.anInt836;
								this.anInt836 = local103;
								@Pc(173) int local173 = local86 - this.anInt837;
								this.anInt837 = local86;
								if (this.anInt894 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass2_Sub1_Sub3_7.method88((this.anInt894 << 12) + (local165 << 6) + local173);
									this.anInt894 = 0;
								} else if (this.anInt894 < 8) {
									this.aClass2_Sub1_Sub3_7.method90((this.anInt894 << 19) + local120 + 8388608);
									this.anInt894 = 0;
								} else {
									this.aClass2_Sub1_Sub3_7.method91((this.anInt894 << 19) + local120 - 1073741824);
									this.anInt894 = 0;
								}
							} else if (this.anInt894 < 2047) {
								this.anInt894++;
							}
						}
						this.aClass2_Sub1_Sub3_7.method96(this.aClass2_Sub1_Sub3_7.anInt136 - local66);
						if (local68 >= this.aClass23_1.anInt245) {
							this.aClass23_1.anInt245 = 0;
						} else {
							this.aClass23_1.anInt245 -= local68;
							for (local86 = 0; local86 < this.aClass23_1.anInt245; local86++) {
								this.aClass23_1.anIntArray103[local86] = this.aClass23_1.anIntArray103[local86 + local68];
								this.aClass23_1.anIntArray104[local86] = this.aClass23_1.anIntArray104[local86 + local68];
							}
						}
					}
				}
				if (super.anInt808 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong30) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local66 = super.anInt810;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt809;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt808 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass2_Sub1_Sub3_7.method86(134, 533);
					this.aClass2_Sub1_Sub3_7.method131((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt946 > 0) {
					this.anInt946--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean267 = true;
				}
				if (this.aBoolean267 && this.anInt946 <= 0) {
					this.anInt946 = 20;
					this.aBoolean267 = false;
					this.aClass2_Sub1_Sub3_7.method86(8, 533);
					this.aClass2_Sub1_Sub3_7.method122(this.anInt925);
					this.aClass2_Sub1_Sub3_7.method123(this.anInt924);
				}
				if (super.aBoolean239 && !this.aBoolean254) {
					this.aBoolean254 = true;
					this.aClass2_Sub1_Sub3_7.method86(22, 533);
					this.aClass2_Sub1_Sub3_7.method87(1);
				}
				if (!super.aBoolean239 && this.aBoolean254) {
					this.aBoolean254 = false;
					this.aClass2_Sub1_Sub3_7.method86(22, 533);
					this.aClass2_Sub1_Sub3_7.method87(0);
				}
				this.method640();
				this.method684();
				this.method615();
				this.anInt977++;
				if (this.anInt977 > 750) {
					this.method643();
				}
				this.method619();
				this.method685();
				this.method703();
				anInt852++;
				if (anInt852 > 114) {
					anInt852 = 0;
					this.aClass2_Sub1_Sub3_7.method86(42, 533);
					this.aClass2_Sub1_Sub3_7.method90(9592457);
				}
				this.anInt902++;
				if (this.anInt1024 != 0) {
					this.anInt1023 += 20;
					if (this.anInt1023 >= 400) {
						this.anInt1024 = 0;
					}
				}
				if (this.anInt983 != 0) {
					this.anInt980++;
					if (this.anInt980 >= 15) {
						if (this.anInt983 == 2) {
							this.aBoolean256 = true;
						}
						if (this.anInt983 == 3) {
							this.aBoolean252 = true;
						}
						this.anInt983 = 0;
					}
				}
				if (this.anInt920 != 0) {
					this.anInt835++;
					if (super.anInt803 > this.anInt921 + 5 || super.anInt803 < this.anInt921 - 5 || super.anInt804 > this.anInt922 + 5 || super.anInt804 < this.anInt922 - 5) {
						this.aBoolean273 = true;
					}
					if (super.anInt802 == 0) {
						if (this.anInt920 == 2) {
							this.aBoolean256 = true;
						}
						if (this.anInt920 == 3) {
							this.aBoolean252 = true;
						}
						this.anInt920 = 0;
						if (this.aBoolean273 && this.anInt835 >= 5) {
							this.anInt964 = -1;
							this.method662();
							if (this.anInt964 == this.anInt918 && this.anInt963 != this.anInt919) {
								@Pc(702) Class31 local702 = Class31.method293(this.anInt918);
								@Pc(704) byte local704 = 0;
								if (this.anInt881 == 1 && local702.anInt405 == 206) {
									local704 = 1;
								}
								if (local702.anIntArray138[this.anInt963] <= 0) {
									local704 = 0;
								}
								if (local702.aBoolean146) {
									local66 = this.anInt919;
									local68 = this.anInt963;
									local702.anIntArray138[local68] = local702.anIntArray138[local66];
									local702.anIntArray130[local68] = local702.anIntArray130[local66];
									local702.anIntArray138[local66] = -1;
									local702.anIntArray130[local66] = 0;
								} else if (local704 == 1) {
									local66 = this.anInt919;
									local68 = this.anInt963;
									while (local66 != local68) {
										if (local66 > local68) {
											local702.method300(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local702.method300(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local702.method300(this.anInt963, this.anInt919);
								}
								this.aClass2_Sub1_Sub3_7.method86(168, 533);
								this.aClass2_Sub1_Sub3_7.method88(this.anInt963);
								this.aClass2_Sub1_Sub3_7.method115(local704);
								this.aClass2_Sub1_Sub3_7.method123(this.anInt919);
								this.aClass2_Sub1_Sub3_7.method124(this.anInt918);
							}
						} else if ((this.anInt988 == 1 || this.method639(this.anInt937 - 1, this.anInt1035)) && this.anInt937 > 2) {
							this.method589(this.anInt915);
						} else if (this.anInt937 > 0) {
							this.method624(this.anInt937 - 1);
						}
						this.anInt980 = 10;
						super.anInt808 = 0;
					}
				}
				@Pc(879) int local879;
				@Pc(881) int local881;
				if (Class47.anInt773 != -1) {
					local879 = Class47.anInt773;
					local881 = Class47.anInt774;
					@Pc(902) boolean local902 = this.method653(true, 0, 0, 0, 0, 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray181[0], 0, aClass2_Sub1_Sub2_Sub3_Sub2_1.anIntArray180[0], local879, local881);
					Class47.anInt773 = -1;
					if (local902) {
						this.anInt1021 = super.anInt809;
						this.anInt1022 = super.anInt810;
						this.anInt1024 = 1;
						this.anInt1023 = 0;
					}
				}
				if (super.anInt808 == 1 && this.aString23 != null) {
					this.aString23 = null;
					this.aBoolean252 = true;
					super.anInt808 = 0;
				}
				this.method631();
				if (this.anInt891 == -1) {
					this.method609();
					this.method666();
					this.method648();
				}
				if (super.anInt802 == 1 || super.anInt808 == 1) {
					this.anInt972++;
				}
				if (this.anInt886 == 0 && this.anInt826 == 0 && this.anInt965 == 0) {
					if (this.anInt1036 > 0) {
						this.anInt1036--;
					}
				} else if (this.anInt1036 < 100) {
					this.anInt1036++;
					if (this.anInt1036 == 100) {
						if (this.anInt886 != 0) {
							this.aBoolean252 = true;
						}
						if (this.anInt826 != 0) {
							this.aBoolean256 = true;
						}
					}
				}
				if (this.anInt935 == 2) {
					this.method707();
				}
				if (this.anInt935 == 2 && this.aBoolean255) {
					this.method696();
				}
				for (local879 = 0; local879 < 5; local879++) {
					@Pc(1038) int local1038 = this.anIntArray273[local879]++;
				}
				this.method720();
				super.anInt801++;
				if (super.anInt801 > 4500) {
					this.anInt979 = 250;
					super.anInt801 -= 500;
					this.aClass2_Sub1_Sub3_7.method86(69, 533);
				}
				this.anInt885++;
				if (this.anInt885 > 500) {
					this.anInt885 = 0;
					local881 = (int) (Math.random() * 8.0D);
					if ((local881 & 0x1) == 1) {
						this.anInt905 += this.anInt906;
					}
					if ((local881 & 0x2) == 2) {
						this.anInt1012 += this.anInt1013;
					}
					if ((local881 & 0x4) == 4) {
						this.anInt827 += this.anInt828;
					}
				}
				if (this.anInt905 < -50) {
					this.anInt906 = 2;
				}
				if (this.anInt905 > 50) {
					this.anInt906 = -2;
				}
				if (this.anInt1012 < -55) {
					this.anInt1013 = 2;
				}
				if (this.anInt1012 > 55) {
					this.anInt1013 = -2;
				}
				if (this.anInt827 < -40) {
					this.anInt828 = 1;
				}
				if (this.anInt827 > 40) {
					this.anInt828 = -1;
				}
				this.anInt1020++;
				if (this.anInt1020 > 500) {
					this.anInt1020 = 0;
					local881 = (int) (Math.random() * 8.0D);
					if ((local881 & 0x1) == 1) {
						this.anInt869 += this.anInt870;
					}
					if ((local881 & 0x2) == 2) {
						this.anInt864 += this.anInt865;
					}
				}
				if (this.anInt869 < -60) {
					this.anInt870 = 2;
				}
				if (this.anInt869 > 60) {
					this.anInt870 = -2;
				}
				if (this.anInt864 < -20) {
					this.anInt865 = 1;
				}
				if (this.anInt864 > 10) {
					this.anInt865 = -1;
				}
				this.anInt978++;
				if (this.anInt978 > 50) {
					this.aClass2_Sub1_Sub3_7.method86(133, 533);
				}
				try {
					if (this.aClass6_1 != null && this.aClass2_Sub1_Sub3_7.anInt136 > 0) {
						this.aClass6_1.method56(this.aClass2_Sub1_Sub3_7.aByteArray10, this.aBoolean263, this.aClass2_Sub1_Sub3_7.anInt136);
						this.aClass2_Sub1_Sub3_7.anInt136 = 0;
						this.anInt978 = 0;
					}
				} catch (@Pc(1287) IOException local1287) {
					this.method643();
				} catch (@Pc(1292) Exception local1292) {
					this.method701();
				}
			}
		} catch (@Pc(1297) RuntimeException local1297) {
			signlink.reporterror("8347, " + -42550 + ", " + local1297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method676() {
		try {
			if (this.anInt937 >= 2 || this.anInt830 != 0 || this.anInt820 != 0) {
				@Pc(36) String local36;
				if (this.anInt830 == 1 && this.anInt937 < 2) {
					local36 = "Use " + this.aString18 + " with...";
				} else if (this.anInt820 == 1 && this.anInt937 < 2) {
					local36 = this.aString17 + "...";
				} else {
					local36 = this.aStringArray12[this.anInt937 - 1];
				}
				if (this.anInt937 > 2) {
					local36 = local36 + "@whi@ / " + (this.anInt937 - 2) + " more options";
				}
				this.aClass2_Sub1_Sub1_Sub4_4.method453(4, 15, local36, anInt856 / 1000, 16777215);
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("45247, " + 8 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)I")
	private int method677() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt1018 < 310) {
				@Pc(22) int local22 = this.anInt1015 >> 7;
				@Pc(27) int local27 = this.anInt1017 >> 7;
				@Pc(32) int local32 = aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 >> 7;
				@Pc(37) int local37 = aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1028][local22][local27] & 0x4) != 0) {
					local3 = this.anInt1028;
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
						if ((this.aByteArrayArrayArray8[this.anInt1028][local22][local27] & 0x4) != 0) {
							local3 = this.anInt1028;
						}
						local89 += local87;
						if (local89 >= 65536) {
							local89 -= 65536;
							if (local27 < local37) {
								local27++;
							} else if (local27 > local37) {
								local27--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1028][local22][local27] & 0x4) != 0) {
								local3 = this.anInt1028;
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
						if ((this.aByteArrayArrayArray8[this.anInt1028][local22][local27] & 0x4) != 0) {
							local3 = this.anInt1028;
						}
						local89 += local87;
						if (local89 >= 65536) {
							local89 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1028][local22][local27] & 0x4) != 0) {
								local3 = this.anInt1028;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1028][aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 >> 7][aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 >> 7] & 0x4) != 0) {
				local3 = this.anInt1028;
			}
			return local3;
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("50766, " + 6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)I")
	private int method678() {
		try {
			@Pc(9) int local9 = this.method657(this.anInt1028, this.anInt1015, this.anInt1017);
			return local9 - this.anInt1016 >= 800 || (this.aByteArrayArrayArray8[this.anInt1028][this.anInt1015 >> 7][this.anInt1017 >> 7] & 0x4) == 0 ? 3 : this.anInt1028;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("16292, " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method679() {
		try {
			if (this.anInt841 != 0) {
				@Pc(6) Class2_Sub1_Sub1_Sub4 local6 = this.aClass2_Sub1_Sub1_Sub4_3;
				@Pc(8) int local8 = 0;
				if (this.anInt974 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray14[local15] != null) {
						@Pc(27) int local27 = this.anIntArray270[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt816 == 0 || this.anInt816 == 1 && this.method651(local32))) {
							local85 = 329 - local8 * 13;
							local6.method448("From", 4, 0, local85);
							local6.method448("From", 4, 65535, local85 - 1);
							@Pc(110) int local110 = local6.method446("From ") + 4;
							if (local34 == 1) {
								this.aClass2_Sub1_Sub1_Sub1Array3[0].method77(local110, local85 - 12);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass2_Sub1_Sub1_Sub1Array3[1].method77(local110, local85 - 12);
								local110 += 14;
							}
							local6.method448(local32 + ": " + this.aStringArray14[local15], local110, 0, local85);
							local6.method448(local32 + ": " + this.aStringArray14[local15], local110, 65535, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt816 < 2) {
							local85 = 329 - local8 * 13;
							local6.method448(this.aStringArray14[local15], 4, 0, local85);
							local6.method448(this.aStringArray14[local15], 4, 65535, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt816 < 2) {
							local85 = 329 - local8 * 13;
							local6.method448("To " + local32 + ": " + this.aStringArray14[local15], 4, 0, local85);
							local6.method448("To " + local32 + ": " + this.aStringArray14[local15], 4, 65535, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				this.anInt975 += 0;
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("53381, " + 0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method680() {
		try {
			for (@Pc(6) Class2_Sub2 local6 = (Class2_Sub2) this.aClass41_11.method414(); local6 != null; local6 = (Class2_Sub2) this.aClass41_11.method416()) {
				if (local6.anInt211 == -1) {
					local6.anInt218 = 0;
					this.method627(local6);
				} else {
					local6.method466();
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("16331, " + -95 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method681(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt841 != 0) {
				@Pc(9) int local9 = 0;
				if (this.anInt974 != 0) {
					local9 = 1;
				}
				for (@Pc(16) int local16 = 0; local16 < 100; local16++) {
					if (this.aStringArray14[local16] != null) {
						@Pc(28) int local28 = this.anIntArray270[local16];
						@Pc(33) String local33 = this.aStringArray13[local16];
						if (local33 != null && local33.startsWith("@cr1@")) {
							local33 = local33.substring(5);
						}
						if (local33 != null && local33.startsWith("@cr2@")) {
							local33 = local33.substring(5);
						}
						if ((local28 == 3 || local28 == 7) && (local28 == 7 || this.anInt816 == 0 || this.anInt816 == 1 && this.method651(local33))) {
							@Pc(86) int local86 = 329 - local9 * 13;
							if (super.anInt803 > 4 && super.anInt804 - 4 > local86 - 10 && super.anInt804 - 4 <= local86 + 3) {
								@Pc(125) int local125 = this.aClass2_Sub1_Sub1_Sub4_3.method446("From:  " + local33 + this.aStringArray14[local16]) + 25;
								if (local125 > 450) {
									local125 = 450;
								}
								if (super.anInt803 < local125 + 4) {
									if (this.anInt942 >= 1) {
										this.aStringArray12[this.anInt937] = "Report abuse @whi@" + local33;
										this.anIntArray266[this.anInt937] = 2265;
										this.anInt937++;
									}
									this.aStringArray12[this.anInt937] = "Add ignore @whi@" + local33;
									this.anIntArray266[this.anInt937] = 2723;
									this.anInt937++;
									this.aStringArray12[this.anInt937] = "Add friend @whi@" + local33;
									this.anIntArray266[this.anInt937] = 2066;
									this.anInt937++;
								}
							}
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
						if ((local28 == 5 || local28 == 6) && this.anInt816 < 2) {
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("42436, " + arg0 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!TFHGRYAS;)V")
	private void method682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub3 arg2) {
		try {
			@Pc(13) int local13 = arg1 * arg1 + arg0 * arg0;
			if (local13 > 4225 && local13 < 90000) {
				@Pc(27) int local27 = this.anInt925 + this.anInt869 & 0x7FF;
				@Pc(31) int local31 = Class2_Sub1_Sub2_Sub2.anIntArray73[local27];
				@Pc(35) int local35 = Class2_Sub1_Sub2_Sub2.anIntArray74[local27];
				@Pc(44) int local44 = local31 * 256 / (this.anInt864 + 256);
				@Pc(53) int local53 = local35 * 256 / (this.anInt864 + 256);
				@Pc(63) int local63 = arg0 * local44 + arg1 * local53 >> 16;
				@Pc(73) int local73 = arg0 * local53 - arg1 * local44 >> 16;
				@Pc(79) double local79 = Math.atan2((double) local63, (double) local73);
				@Pc(85) int local85 = (int) (Math.sin(local79) * 63.0D);
				@Pc(91) int local91 = (int) (Math.cos(local79) * 57.0D);
				this.aClass2_Sub1_Sub1_Sub3_12.method365(local85 + 94 + 4 - 10, local79, 83 - local91 - 20);
			} else {
				this.method646((byte) 2, arg0, arg1, arg2);
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("96850, " + arg0 + ", " + arg1 + ", " + -33991 + ", " + arg2 + ", " + local122.toString());
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
				return new URL("http://127.0.0.1:" + (anInt862 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean278) {
			this.method704();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method684() {
		try {
			if (this.anInt935 == 2) {
				for (@Pc(15) Class2_Sub2 local15 = (Class2_Sub2) this.aClass41_11.method414(); local15 != null; local15 = (Class2_Sub2) this.aClass41_11.method416()) {
					if (local15.anInt211 > 0) {
						local15.anInt211--;
					}
					if (local15.anInt211 != 0) {
						if (local15.anInt218 > 0) {
							local15.anInt218--;
						}
						if (local15.anInt218 == 0 && local15.anInt209 >= 1 && local15.anInt210 >= 1 && local15.anInt209 <= 102 && local15.anInt210 <= 102 && (local15.anInt215 < 0 || Class34.method335(local15.anInt215, local15.anInt217))) {
							this.method697(local15.anInt209, local15.anInt207, local15.anInt215, local15.anInt217, local15.anInt208, local15.anInt210, local15.anInt216);
							local15.anInt218 = -1;
							if (local15.anInt215 == local15.anInt212 && local15.anInt212 == -1) {
								local15.method466();
							} else if (local15.anInt215 == local15.anInt212 && local15.anInt216 == local15.anInt213 && local15.anInt217 == local15.anInt214) {
								local15.method466();
							}
						}
					} else if (local15.anInt212 < 0 || Class34.method335(local15.anInt212, local15.anInt214)) {
						this.method697(local15.anInt209, local15.anInt207, local15.anInt212, local15.anInt214, local15.anInt208, local15.anInt210, local15.anInt213);
						local15.method466();
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("85648, " + false + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method685() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt829; local1++) {
				@Pc(8) int local8 = this.anIntArray217[local1];
				@Pc(13) Class2_Sub1_Sub2_Sub3_Sub1 local13 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local8];
				if (local13 != null) {
					this.method686(local13, (byte) 9, local13.aClass46_1.aByte27);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("85399, " + true + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OKXNBSEJ;BI)V")
	private void method686(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0.anInt679 < 128 || arg0.anInt680 < 128 || arg0.anInt679 >= 13184 || arg0.anInt680 >= 13184) {
				arg0.anInt684 = -1;
				arg0.anInt663 = -1;
				arg0.anInt700 = 0;
				arg0.anInt701 = 0;
				arg0.anInt679 = arg0.anIntArray180[0] * 128 + arg0.anInt690 * 64;
				arg0.anInt680 = arg0.anIntArray181[0] * 128 + arg0.anInt690 * 64;
				arg0.method472();
			}
			if (arg0 == aClass2_Sub1_Sub2_Sub3_Sub2_1 && (arg0.anInt679 < 1536 || arg0.anInt680 < 1536 || arg0.anInt679 >= 11776 || arg0.anInt680 >= 11776)) {
				arg0.anInt684 = -1;
				arg0.anInt663 = -1;
				arg0.anInt700 = 0;
				arg0.anInt701 = 0;
				arg0.anInt679 = arg0.anIntArray180[0] * 128 + arg0.anInt690 * 64;
				arg0.anInt680 = arg0.anIntArray181[0] * 128 + arg0.anInt690 * 64;
				arg0.method472();
			}
			if (arg0.anInt700 > anInt856) {
				this.method687(arg0);
			} else if (arg0.anInt701 >= anInt856) {
				this.method688(arg0);
			} else {
				this.method689(arg0);
			}
			this.method690(arg0);
			@Pc(151) boolean local151 = false;
			this.method691(arg0);
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("39159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!OKXNBSEJ;)V")
	private void method687(@OriginalArg(1) Class2_Sub1_Sub2_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt700 - anInt856;
			@Pc(14) int local14 = arg0.anInt696 * 128 + arg0.anInt690 * 64;
			@Pc(24) int local24 = arg0.anInt698 * 128 + arg0.anInt690 * 64;
			arg0.anInt679 += (local14 - arg0.anInt679) / local4;
			arg0.anInt680 += (local24 - arg0.anInt680) / local4;
			if (this.aByte34 != -109) {
				this.aBoolean243 = !this.aBoolean243;
			}
			arg0.anInt676 = 0;
			if (arg0.anInt702 == 0) {
				arg0.anInt675 = 1024;
			}
			if (arg0.anInt702 == 1) {
				arg0.anInt675 = 1536;
			}
			if (arg0.anInt702 == 2) {
				arg0.anInt675 = 0;
			}
			if (arg0.anInt702 == 3) {
				arg0.anInt675 = 512;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("64457, " + -109 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OKXNBSEJ;I)V")
	private void method688(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0) {
		try {
			if (arg0.anInt701 == anInt856 || arg0.anInt684 == -1 || arg0.anInt687 != 0 || arg0.anInt686 + 1 > Class39.aClass39Array1[arg0.anInt684].method403(arg0.anInt685)) {
				@Pc(35) int local35 = arg0.anInt701 - arg0.anInt700;
				@Pc(40) int local40 = anInt856 - arg0.anInt700;
				@Pc(50) int local50 = arg0.anInt696 * 128 + arg0.anInt690 * 64;
				@Pc(60) int local60 = arg0.anInt698 * 128 + arg0.anInt690 * 64;
				@Pc(70) int local70 = arg0.anInt697 * 128 + arg0.anInt690 * 64;
				@Pc(80) int local80 = arg0.anInt699 * 128 + arg0.anInt690 * 64;
				arg0.anInt679 = (local50 * (local35 - local40) + local70 * local40) / local35;
				arg0.anInt680 = (local60 * (local35 - local40) + local80 * local40) / local35;
			}
			arg0.anInt676 = 0;
			if (arg0.anInt702 == 0) {
				arg0.anInt675 = 1024;
			}
			if (arg0.anInt702 == 1) {
				arg0.anInt675 = 1536;
			}
			if (arg0.anInt702 == 2) {
				arg0.anInt675 = 0;
			}
			if (arg0.anInt702 == 3) {
				arg0.anInt675 = 512;
			}
			arg0.anInt681 = arg0.anInt675;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("56940, " + arg0 + ", " + 719 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OKXNBSEJ;B)V")
	private void method689(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0) {
		try {
			arg0.anInt693 = arg0.anInt661;
			if (arg0.anInt689 == 0) {
				arg0.anInt676 = 0;
			} else {
				if (arg0.anInt684 != -1 && arg0.anInt687 == 0) {
					@Pc(24) Class39 local24 = Class39.aClass39Array1[arg0.anInt684];
					if (arg0.anInt671 > 0 && local24.anInt591 == 0) {
						arg0.anInt676++;
						return;
					}
					if (arg0.anInt671 <= 0 && local24.anInt592 == 0) {
						arg0.anInt676++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt679;
				@Pc(56) int local56 = arg0.anInt680;
				@Pc(71) int local71 = arg0.anIntArray180[arg0.anInt689 - 1] * 128 + arg0.anInt690 * 64;
				@Pc(86) int local86 = arg0.anIntArray181[arg0.anInt689 - 1] * 128 + arg0.anInt690 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt675 = 1280;
						} else if (local56 > local86) {
							arg0.anInt675 = 1792;
						} else {
							arg0.anInt675 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt675 = 768;
						} else if (local56 > local86) {
							arg0.anInt675 = 256;
						} else {
							arg0.anInt675 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt675 = 1024;
					} else {
						arg0.anInt675 = 0;
					}
					@Pc(180) int local180 = arg0.anInt675 - arg0.anInt681 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt658;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt657;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt660;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt659;
					}
					if (local187 == -1) {
						local187 = arg0.anInt657;
					}
					arg0.anInt693 = local187;
					@Pc(229) int local229 = 4;
					if (arg0.anInt681 != arg0.anInt675 && arg0.anInt683 == -1 && arg0.anInt672 != 0) {
						local229 = 2;
					}
					if (arg0.anInt689 > 2) {
						local229 = 6;
					}
					if (arg0.anInt689 > 3) {
						local229 = 8;
					}
					if (arg0.anInt676 > 0 && arg0.anInt689 > 1) {
						local229 = 8;
						arg0.anInt676--;
					}
					if (arg0.aBooleanArray9[arg0.anInt689 - 1]) {
						local229 <<= 0x1;
					}
					if (local229 >= 8 && arg0.anInt693 == arg0.anInt657 && arg0.anInt677 != -1) {
						arg0.anInt693 = arg0.anInt677;
					}
					if (local53 < local71) {
						arg0.anInt679 += local229;
						if (arg0.anInt679 > local71) {
							arg0.anInt679 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt679 -= local229;
						if (arg0.anInt679 < local71) {
							arg0.anInt679 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt680 += local229;
						if (arg0.anInt680 > local86) {
							arg0.anInt680 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt680 -= local229;
						if (arg0.anInt680 < local86) {
							arg0.anInt680 = local86;
						}
					}
					if (arg0.anInt679 == local71 && arg0.anInt680 == local86) {
						arg0.anInt689--;
						if (arg0.anInt671 > 0) {
							arg0.anInt671--;
							return;
						}
					}
				} else {
					arg0.anInt679 = local71;
					arg0.anInt680 = local86;
				}
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("16039, " + arg0 + ", " + 3 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OKXNBSEJ;Z)V")
	private void method690(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0) {
		try {
			if (arg0.anInt672 != 0) {
				@Pc(37) int local37;
				@Pc(43) int local43;
				if (arg0.anInt683 != -1 && arg0.anInt683 < 32768) {
					@Pc(29) Class2_Sub1_Sub2_Sub3_Sub1 local29 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[arg0.anInt683];
					if (local29 != null) {
						local37 = arg0.anInt679 - local29.anInt679;
						local43 = arg0.anInt680 - local29.anInt680;
						if (local37 != 0 || local43 != 0) {
							arg0.anInt675 = (int) (Math.atan2((double) local37, (double) local43) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(68) int local68;
				if (arg0.anInt683 >= 32768) {
					local68 = arg0.anInt683 - 32768;
					if (local68 == this.anInt842) {
						local68 = this.anInt897;
					}
					@Pc(80) Class2_Sub1_Sub2_Sub3_Sub2 local80 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local68];
					if (local80 != null) {
						local43 = arg0.anInt679 - local80.anInt679;
						@Pc(94) int local94 = arg0.anInt680 - local80.anInt680;
						if (local43 != 0 || local94 != 0) {
							arg0.anInt675 = (int) (Math.atan2((double) local43, (double) local94) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt703 != 0 || arg0.anInt704 != 0) && (arg0.anInt689 == 0 || arg0.anInt676 > 0)) {
					local68 = arg0.anInt679 - (arg0.anInt703 - this.anInt907 - this.anInt907) * 64;
					local37 = arg0.anInt680 - (arg0.anInt704 - this.anInt908 - this.anInt908) * 64;
					if (local68 != 0 || local37 != 0) {
						arg0.anInt675 = (int) (Math.atan2((double) local68, (double) local37) * 325.949D) & 0x7FF;
					}
					arg0.anInt703 = 0;
					arg0.anInt704 = 0;
				}
				local68 = arg0.anInt675 - arg0.anInt681 & 0x7FF;
				if (local68 != 0) {
					if (local68 < arg0.anInt672 || local68 > 2048 - arg0.anInt672) {
						arg0.anInt681 = arg0.anInt675;
					} else if (local68 > 1024) {
						arg0.anInt681 -= arg0.anInt672;
					} else {
						arg0.anInt681 += arg0.anInt672;
					}
					arg0.anInt681 &= 0x7FF;
					if (arg0.anInt693 == arg0.anInt661 && arg0.anInt681 != arg0.anInt675) {
						if (arg0.anInt662 != -1) {
							arg0.anInt693 = arg0.anInt662;
							return;
						}
						arg0.anInt693 = arg0.anInt657;
						return;
					}
				}
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("81212, " + arg0 + ", " + false + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OKXNBSEJ;)V")
	private void method691(@OriginalArg(1) Class2_Sub1_Sub2_Sub3 arg0) {
		try {
			arg0.aBoolean217 = false;
			@Pc(18) Class39 local18;
			if (arg0.anInt693 != -1) {
				local18 = Class39.aClass39Array1[arg0.anInt693];
				arg0.anInt695++;
				if (arg0.anInt694 < local18.anInt585 && arg0.anInt695 > local18.method403(arg0.anInt694)) {
					arg0.anInt695 = 0;
					arg0.anInt694++;
				}
				if (arg0.anInt694 >= local18.anInt585) {
					arg0.anInt695 = 0;
					arg0.anInt694 = 0;
				}
			}
			if (arg0.anInt663 != -1 && anInt856 >= arg0.anInt666) {
				if (arg0.anInt664 < 0) {
					arg0.anInt664 = 0;
				}
				local18 = Class33.aClass33Array1[arg0.anInt663].aClass39_2;
				arg0.anInt665++;
				while (arg0.anInt664 < local18.anInt585 && arg0.anInt665 > local18.method403(arg0.anInt664)) {
					arg0.anInt665 -= local18.method403(arg0.anInt664);
					arg0.anInt664++;
				}
				if (arg0.anInt664 >= local18.anInt585 && (arg0.anInt664 < 0 || arg0.anInt664 >= local18.anInt585)) {
					arg0.anInt663 = -1;
				}
			}
			if (arg0.anInt684 != -1 && arg0.anInt687 <= 1) {
				local18 = Class39.aClass39Array1[arg0.anInt684];
				if (local18.anInt591 == 1 && arg0.anInt671 > 0 && arg0.anInt700 <= anInt856 && arg0.anInt701 < anInt856) {
					arg0.anInt687 = 1;
					return;
				}
			}
			if (arg0.anInt684 != -1 && arg0.anInt687 == 0) {
				local18 = Class39.aClass39Array1[arg0.anInt684];
				arg0.anInt686++;
				while (arg0.anInt685 < local18.anInt585 && arg0.anInt686 > local18.method403(arg0.anInt685)) {
					arg0.anInt686 -= local18.method403(arg0.anInt685);
					arg0.anInt685++;
				}
				if (arg0.anInt685 >= local18.anInt585) {
					arg0.anInt685 -= local18.anInt586;
					arg0.anInt688++;
					if (arg0.anInt688 >= local18.anInt590) {
						arg0.anInt684 = -1;
					}
					if (arg0.anInt685 < 0 || arg0.anInt685 >= local18.anInt585) {
						arg0.anInt684 = -1;
					}
				}
				arg0.aBoolean217 = local18.aBoolean187;
			}
			if (arg0.anInt687 > 0) {
				arg0.anInt687--;
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("42173, " + -475 + ", " + arg0 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method692() {
		try {
			if (this.anInt891 == -1 || this.anInt935 != 2 && super.aClass42_2 == null) {
				if (this.aBoolean282) {
					this.method635();
					this.aBoolean282 = false;
					this.aClass42_3.method426(4, 0, super.aGraphics2);
					this.aClass42_4.method426(357, 0, super.aGraphics2);
					this.aClass42_5.method426(4, 722, super.aGraphics2);
					this.aClass42_6.method426(205, 743, super.aGraphics2);
					this.aClass42_7.method426(0, 0, super.aGraphics2);
					this.aClass42_8.method426(4, 516, super.aGraphics2);
					this.aClass42_9.method426(205, 516, super.aGraphics2);
					this.aClass42_10.method426(357, 496, super.aGraphics2);
					this.aClass42_11.method426(338, 0, super.aGraphics2);
					this.aBoolean256 = true;
					this.aBoolean252 = true;
					this.aBoolean240 = true;
					this.aBoolean242 = true;
					if (this.anInt935 != 2) {
						this.aClass42_14.method426(4, 4, super.aGraphics2);
						this.aClass42_13.method426(4, 550, super.aGraphics2);
					}
				}
				if (this.anInt935 == 2) {
					this.method592(this.aBoolean247);
				}
				if (this.aBoolean241 && this.anInt843 == 1) {
					this.aBoolean256 = true;
				}
				@Pc(284) boolean local284;
				if (this.anInt940 != -1) {
					local284 = this.method713(this.anInt940, this.anInt902);
					if (local284) {
						this.aBoolean256 = true;
					}
				}
				if (this.anInt983 == 2) {
					this.aBoolean256 = true;
				}
				if (this.anInt920 == 2) {
					this.aBoolean256 = true;
				}
				if (this.aBoolean256) {
					this.method596((byte) 6);
					this.aBoolean256 = false;
				}
				@Pc(369) int local369;
				if (this.anInt849 == -1 && this.anInt973 == 0) {
					this.aClass31_1.anInt383 = this.anInt930 - this.anInt912 - 77;
					if (super.anInt803 > 448 && super.anInt803 < 560 && super.anInt804 > 332) {
						this.method598(super.anInt804 - 357, this.anInt930, this.aClass31_1, super.anInt803 - 17, 0, 463, 77, -1);
					}
					local369 = this.anInt930 - this.aClass31_1.anInt383 - 77;
					if (local369 < 0) {
						local369 = 0;
					}
					if (local369 > this.anInt930 - 77) {
						local369 = this.anInt930 - 77;
					}
					if (this.anInt912 != local369) {
						this.anInt912 = local369;
						this.aBoolean252 = true;
					}
				}
				if (this.anInt849 == -1 && this.anInt973 == 3) {
					local369 = this.anInt839 * 14 + 7;
					this.aClass31_1.anInt383 = this.anInt840;
					if (super.anInt803 > 448 && super.anInt803 < 560 && super.anInt804 > 332) {
						this.method598(super.anInt804 - 357, local369, this.aClass31_1, super.anInt803 - 17, 0, 463, 77, -1);
					}
					@Pc(448) int local448 = this.aClass31_1.anInt383;
					if (local448 < 0) {
						local448 = 0;
					}
					if (local448 > local369 - 77) {
						local448 = local369 - 77;
					}
					if (this.anInt840 != local448) {
						this.anInt840 = local448;
						this.aBoolean252 = true;
					}
				}
				if (this.anInt849 != -1) {
					local284 = this.method713(this.anInt849, this.anInt902);
					if (local284) {
						this.aBoolean252 = true;
					}
				}
				if (this.anInt983 == 3) {
					this.aBoolean252 = true;
				}
				if (this.anInt920 == 3) {
					this.aBoolean252 = true;
				}
				if (this.aString23 != null) {
					this.aBoolean252 = true;
				}
				if (this.aBoolean241 && this.anInt843 == 2) {
					this.aBoolean252 = true;
				}
				if (this.aBoolean252) {
					this.method671();
					this.aBoolean252 = false;
				}
				if (this.anInt935 == 2) {
					this.method709();
					this.aClass42_13.method426(4, 550, super.aGraphics2);
				}
				if (this.anInt867 != -1) {
					this.aBoolean240 = true;
				}
				if (this.aBoolean240) {
					if (this.anInt867 != -1 && this.anInt867 == this.anInt819) {
						this.anInt867 = -1;
						this.aClass2_Sub1_Sub3_7.method86(252, 533);
						this.aClass2_Sub1_Sub3_7.method87(this.anInt819);
					}
					this.aBoolean240 = false;
					this.aClass42_18.method425();
					this.aClass2_Sub1_Sub1_Sub1_3.method77(0, 0);
					if (this.anInt940 == -1) {
						if (this.anIntArray220[this.anInt819] != -1) {
							if (this.anInt819 == 0) {
								this.aClass2_Sub1_Sub1_Sub1_6.method77(22, 10);
							}
							if (this.anInt819 == 1) {
								this.aClass2_Sub1_Sub1_Sub1_7.method77(54, 8);
							}
							if (this.anInt819 == 2) {
								this.aClass2_Sub1_Sub1_Sub1_7.method77(82, 8);
							}
							if (this.anInt819 == 3) {
								this.aClass2_Sub1_Sub1_Sub1_8.method77(110, 8);
							}
							if (this.anInt819 == 4) {
								this.aClass2_Sub1_Sub1_Sub1_10.method77(153, 8);
							}
							if (this.anInt819 == 5) {
								this.aClass2_Sub1_Sub1_Sub1_10.method77(181, 8);
							}
							if (this.anInt819 == 6) {
								this.aClass2_Sub1_Sub1_Sub1_9.method77(209, 9);
							}
						}
						if (this.anIntArray220[0] != -1 && (this.anInt867 != 0 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[0].method77(29, 13);
						}
						if (this.anIntArray220[1] != -1 && (this.anInt867 != 1 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[1].method77(53, 11);
						}
						if (this.anIntArray220[2] != -1 && (this.anInt867 != 2 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[2].method77(82, 11);
						}
						if (this.anIntArray220[3] != -1 && (this.anInt867 != 3 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[3].method77(115, 12);
						}
						if (this.anIntArray220[4] != -1 && (this.anInt867 != 4 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[4].method77(153, 13);
						}
						if (this.anIntArray220[5] != -1 && (this.anInt867 != 5 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[5].method77(180, 11);
						}
						if (this.anIntArray220[6] != -1 && (this.anInt867 != 6 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[6].method77(208, 13);
						}
					}
					this.aClass42_18.method426(160, 516, super.aGraphics2);
					this.aClass42_17.method425();
					this.aClass2_Sub1_Sub1_Sub1_2.method77(0, 0);
					if (this.anInt940 == -1) {
						if (this.anIntArray220[this.anInt819] != -1) {
							if (this.anInt819 == 7) {
								this.aClass2_Sub1_Sub1_Sub1_16.method77(42, 0);
							}
							if (this.anInt819 == 8) {
								this.aClass2_Sub1_Sub1_Sub1_17.method77(74, 0);
							}
							if (this.anInt819 == 9) {
								this.aClass2_Sub1_Sub1_Sub1_17.method77(102, 0);
							}
							if (this.anInt819 == 10) {
								this.aClass2_Sub1_Sub1_Sub1_18.method77(130, 1);
							}
							if (this.anInt819 == 11) {
								this.aClass2_Sub1_Sub1_Sub1_20.method77(173, 0);
							}
							if (this.anInt819 == 12) {
								this.aClass2_Sub1_Sub1_Sub1_20.method77(201, 0);
							}
							if (this.anInt819 == 13) {
								this.aClass2_Sub1_Sub1_Sub1_19.method77(229, 0);
							}
						}
						if (this.anIntArray220[8] != -1 && (this.anInt867 != 8 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[7].method77(74, 2);
						}
						if (this.anIntArray220[9] != -1 && (this.anInt867 != 9 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[8].method77(102, 3);
						}
						if (this.anIntArray220[10] != -1 && (this.anInt867 != 10 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[9].method77(137, 4);
						}
						if (this.anIntArray220[11] != -1 && (this.anInt867 != 11 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[10].method77(174, 2);
						}
						if (this.anIntArray220[12] != -1 && (this.anInt867 != 12 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[11].method77(201, 2);
						}
						if (this.anIntArray220[13] != -1 && (this.anInt867 != 13 || anInt856 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub1Array4[12].method77(226, 2);
						}
					}
					this.aClass42_17.method426(466, 496, super.aGraphics2);
					this.aClass42_14.method425();
					Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
				}
				if (this.aBoolean242) {
					this.aBoolean242 = false;
					this.aClass42_16.method425();
					this.aClass2_Sub1_Sub1_Sub1_1.method77(0, 0);
					this.aClass2_Sub1_Sub1_Sub4_3.method445("Public chat", 16777215, true, 55, 28);
					if (this.anInt941 == 0) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("On", 65280, true, 55, 41);
					}
					if (this.anInt941 == 1) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("Friends", 16776960, true, 55, 41);
					}
					if (this.anInt941 == 2) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("Off", 16711680, true, 55, 41);
					}
					if (this.anInt941 == 3) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("Hide", 65535, true, 55, 41);
					}
					this.aClass2_Sub1_Sub1_Sub4_3.method445("Private chat", 16777215, true, 184, 28);
					if (this.anInt816 == 0) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("On", 65280, true, 184, 41);
					}
					if (this.anInt816 == 1) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("Friends", 16776960, true, 184, 41);
					}
					if (this.anInt816 == 2) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("Off", 16711680, true, 184, 41);
					}
					this.aClass2_Sub1_Sub1_Sub4_3.method445("Trade/compete", 16777215, true, 324, 28);
					if (this.anInt877 == 0) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("On", 65280, true, 324, 41);
					}
					if (this.anInt877 == 1) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("Friends", 16776960, true, 324, 41);
					}
					if (this.anInt877 == 2) {
						this.aClass2_Sub1_Sub1_Sub4_3.method445("Off", 16711680, true, 324, 41);
					}
					this.aClass2_Sub1_Sub1_Sub4_3.method445("Report abuse", 16777215, true, 458, 33);
					this.aClass42_16.method426(453, 0, super.aGraphics2);
					this.aClass42_14.method425();
					Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
				}
				this.anInt902 = 0;
			} else {
				if (this.anInt935 == 2) {
					this.method713(this.anInt891, this.anInt902);
					if (this.anInt1025 != -1) {
						this.method713(this.anInt1025, this.anInt902);
					}
					this.anInt902 = 0;
					this.method625();
					super.aClass42_2.method425();
					Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray255;
					Class2_Sub1_Sub1.method434();
					this.aBoolean282 = true;
					@Pc(62) Class31 local62 = Class31.method293(this.anInt891);
					if (local62.anInt409 == 512 && local62.anInt387 == 334 && local62.anInt397 == 0) {
						local62.anInt409 = 765;
						local62.anInt387 = 503;
					}
					this.method725(0, local62, 0, 0);
					if (this.anInt1025 != -1) {
						local62 = Class31.method293(this.anInt1025);
						if (local62.anInt409 == 512 && local62.anInt387 == 334 && local62.anInt397 == 0) {
							local62.anInt409 = 765;
							local62.anInt387 = 503;
						}
						this.method725(0, local62, 0, 0);
					}
					if (this.aBoolean241) {
						this.method610();
					} else {
						this.method662();
						this.method676();
					}
				}
				super.aClass42_2.method426(0, 0, super.aGraphics2);
			}
		} catch (@Pc(1278) RuntimeException local1278) {
			signlink.reporterror("80105, " + 115 + ", " + local1278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method693() {
		try {
			@Pc(50) int local50;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(119) int local119;
			@Pc(133) int local133;
			@Pc(145) int local145;
			@Pc(204) int local204;
			try {
				this.anInt863 = -1;
				this.aClass41_12.method418();
				this.aClass41_10.method418();
				anInt904++;
				if (anInt904 > 149) {
					anInt904 = 0;
					this.aClass2_Sub1_Sub3_7.method86(98, 533);
					this.aClass2_Sub1_Sub3_7.method90(14922832);
				}
				Class2_Sub1_Sub1_Sub2.method257();
				this.method594();
				this.aClass47_1.method487();
				System.gc();
				for (local50 = 0; local50 < 4; local50++) {
					this.aClass5Array1[local50].method40();
				}
				for (local63 = 0; local63 < 4; local63++) {
					for (local67 = 0; local67 < 104; local67++) {
						for (local71 = 0; local71 < 104; local71++) {
							this.aByteArrayArrayArray8[local63][local67][local71] = 0;
						}
					}
				}
				@Pc(105) Class34 local105 = new Class34(this.anIntArrayArrayArray7, 104, 104, 0, this.aByteArrayArrayArray8);
				local71 = this.aByteArrayArray5.length;
				this.aClass2_Sub1_Sub3_7.method86(133, 533);
				@Pc(266) int local266;
				@Pc(254) int local254;
				if (!this.aBoolean274) {
					@Pc(150) byte[] local150;
					for (local119 = 0; local119 < local71; local119++) {
						local133 = (this.anIntArray232[local119] >> 8) * 64 - this.anInt907;
						local145 = (this.anIntArray232[local119] & 0xFF) * 64 - this.anInt908;
						local150 = this.aByteArrayArray5[local119];
						if (local150 != null) {
							local105.method326(this.aClass5Array1, local145, (this.anInt875 - 6) * 8, local133, (this.anInt876 - 6) * 8, local150);
						}
					}
					for (local133 = 0; local133 < local71; local133++) {
						local145 = (this.anIntArray232[local133] >> 8) * 64 - this.anInt907;
						local204 = (this.anIntArray232[local133] & 0xFF) * 64 - this.anInt908;
						@Pc(209) byte[] local209 = this.aByteArrayArray5[local133];
						if (local209 == null && this.anInt876 < 800) {
							local105.method320(local204, 906, 64, 64, local145);
						}
					}
					this.aClass2_Sub1_Sub3_7.method86(133, 533);
					for (local145 = 0; local145 < local71; local145++) {
						local150 = this.aByteArrayArray6[local145];
						if (local150 != null) {
							local254 = (this.anIntArray232[local145] >> 8) * 64 - this.anInt907;
							local266 = (this.anIntArray232[local145] & 0xFF) * 64 - this.anInt908;
							local105.method329(local254, local266, this.aClass5Array1, local150, this.aClass47_1);
						}
					}
				}
				if (this.aBoolean274) {
					local119 = 0;
					label258: while (true) {
						@Pc(321) int local321;
						@Pc(327) int local327;
						@Pc(333) int local333;
						@Pc(343) int local343;
						@Pc(345) int local345;
						if (local119 >= 4) {
							for (local133 = 0; local133 < 13; local133++) {
								for (local145 = 0; local145 < 13; local145++) {
									local204 = this.anIntArrayArrayArray8[0][local133][local145];
									if (local204 == -1) {
										local105.method320(local145 * 8, 906, 8, 8, local133 * 8);
									}
								}
							}
							this.aClass2_Sub1_Sub3_7.method86(133, 533);
							local145 = 0;
							while (true) {
								if (local145 >= 4) {
									break label258;
								}
								for (local204 = 0; local204 < 13; local204++) {
									for (local254 = 0; local254 < 13; local254++) {
										local266 = this.anIntArrayArrayArray8[local145][local204][local254];
										if (local266 != -1) {
											local321 = local266 >> 24 & 0x3;
											local327 = local266 >> 1 & 0x3;
											local333 = local266 >> 14 & 0x3FF;
											local343 = local266 >> 3 & 0x7FF;
											local345 = (local333 / 8 << 8) + local343 / 8;
											for (@Pc(524) int local524 = 0; local524 < this.anIntArray232.length; local524++) {
												if (this.anIntArray232[local524] == local345 && this.aByteArrayArray6[local524] != null) {
													local105.method331(local327, (local333 & 0x7) * 8, this.aClass5Array1, local254 * 8, this.aByteArrayArray6[local524], this.aClass47_1, (local343 & 0x7) * 8, local204 * 8, local145, local321);
													break;
												}
											}
										}
									}
								}
								local145++;
							}
						}
						for (local133 = 0; local133 < 13; local133++) {
							for (local145 = 0; local145 < 13; local145++) {
								@Pc(297) boolean local297 = false;
								local254 = this.anIntArrayArrayArray8[local119][local133][local145];
								if (local254 != -1) {
									local266 = local254 >> 24 & 0x3;
									local321 = local254 >> 1 & 0x3;
									local327 = local254 >> 14 & 0x3FF;
									local333 = local254 >> 3 & 0x7FF;
									local343 = (local327 / 8 << 8) + local333 / 8;
									for (local345 = 0; local345 < this.anIntArray232.length; local345++) {
										if (this.anIntArray232[local345] == local343 && this.aByteArrayArray5[local345] != null) {
											local105.method337((local327 & 0x7) * 8, (local333 & 0x7) * 8, local133 * 8, local266, this.aByteArrayArray5[local345], local119, local321, local145 * 8, this.aClass5Array1);
											local297 = true;
											break;
										}
									}
								}
								if (!local297) {
									local105.method323(local119, local145 * 8, local133 * 8);
								}
							}
						}
						local119++;
					}
				}
				this.aClass2_Sub1_Sub3_7.method86(133, 533);
				local105.method330(this.aClass5Array1, this.aClass47_1, this.aByte31);
				if (this.aClass42_14 != null) {
					this.aClass42_14.method425();
					Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
				}
				this.aClass2_Sub1_Sub3_7.method86(133, 533);
				local119 = Class34.anInt488;
				if (local119 > this.anInt1028) {
					local119 = this.anInt1028;
				}
				if (local119 < this.anInt1028 - 1) {
					local119 = this.anInt1028 - 1;
				}
				if (aBoolean250) {
					this.aClass47_1.method488(Class34.anInt488);
				} else {
					this.aClass47_1.method488(0);
				}
				for (local133 = 0; local133 < 104; local133++) {
					for (local145 = 0; local145 < 104; local145++) {
						this.method654(local133, local145);
					}
				}
				this.method680();
			} catch (@Pc(674) Exception local674) {
			}
			Class1.aClass4_1.method39();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass2_Sub1_Sub3_7.method86(213, 533);
				this.aClass2_Sub1_Sub3_7.method91(1057001181);
			}
			if (aBoolean250 && signlink.aRandomAccessFile3 != null) {
				local50 = this.aClass18_Sub1_1.method201(0);
				for (local63 = 0; local63 < local50; local63++) {
					local67 = this.aClass18_Sub1_1.method208(local63, anInt913);
					if ((local67 & 0x79) == 0) {
						Class2_Sub1_Sub2_Sub2.method150(local63);
					}
				}
			}
			System.gc();
			Class2_Sub1_Sub1_Sub2.method258();
			this.aClass18_Sub1_1.method202(this.anInt823);
			local50 = (this.anInt875 - 6) / 8 - 1;
			local63 = (this.anInt875 + 6) / 8 + 1;
			local67 = (this.anInt876 - 6) / 8 - 1;
			local71 = (this.anInt876 + 6) / 8 + 1;
			if (this.aBoolean264) {
				local50 = 49;
				local63 = 50;
				local67 = 49;
				local71 = 50;
			}
			for (local119 = local50; local119 <= local63; local119++) {
				for (local133 = local67; local133 <= local71; local133++) {
					if (local119 == local50 || local119 == local63 || local133 == local67 || local133 == local71) {
						local145 = this.aClass18_Sub1_1.method194(local119, 0, local133);
						if (local145 != -1) {
							this.aClass18_Sub1_1.method205(3, local145);
						}
						local204 = this.aClass18_Sub1_1.method194(local119, 1, local133);
						if (local204 != -1) {
							this.aClass18_Sub1_1.method205(3, local204);
						}
					}
				}
			}
		} catch (@Pc(839) RuntimeException local839) {
			signlink.reporterror("75610, " + 9 + ", " + local839.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass2_Sub1_Sub1_Sub1_4.method77(arg4, arg0);
			this.aClass2_Sub1_Sub1_Sub1_5.method77(arg4, arg0 + arg3 - 16);
			Class2_Sub1_Sub1.method436(arg4, arg0 + 16, this.anInt967, this.anInt987, 16, arg3 - 32);
			@Pc(36) int local36 = (arg3 - 32) * arg3 / arg1;
			if (local36 < 8) {
				local36 = 8;
			}
			@Pc(53) int local53 = (arg3 - local36 - 32) * arg2 / (arg1 - arg3);
			Class2_Sub1_Sub1.method436(arg4, arg0 + local53 + 16, this.anInt967, this.anInt895, 16, local36);
			Class2_Sub1_Sub1.method441(485, this.anInt931, local36, arg4, arg0 + local53 + 16);
			Class2_Sub1_Sub1.method441(485, this.anInt931, local36, arg4 + 1, arg0 + 16 + local53);
			Class2_Sub1_Sub1.method439(arg4, 129, arg0 + local53 + 16, 16, this.anInt931);
			Class2_Sub1_Sub1.method439(arg4, 129, arg0 + local53 + 17, 16, this.anInt931);
			Class2_Sub1_Sub1.method441(485, this.anInt903, local36, arg4 + 15, arg0 + 16 + local53);
			Class2_Sub1_Sub1.method441(485, this.anInt903, local36 - 1, arg4 + 14, arg0 + local53 + 17);
			Class2_Sub1_Sub1.method439(arg4, 129, arg0 + local53 + local36 + 15, 16, this.anInt903);
			Class2_Sub1_Sub1.method439(arg4 + 1, 129, arg0 + local53 + local36 + 14, 15, this.anInt903);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("75831, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method695() {
		try {
			@Pc(7) byte[] local7 = this.aClass22_2.method218("title.dat", null);
			@Pc(13) Class2_Sub1_Sub1_Sub3 local13 = new Class2_Sub1_Sub1_Sub3(local7, this);
			this.aClass42_22.method425();
			local13.method358(anInt815, 0, 0);
			this.aClass42_23.method425();
			local13.method358(anInt815, -637, 0);
			this.aClass42_19.method425();
			local13.method358(anInt815, -128, 0);
			this.aClass42_20.method425();
			local13.method358(anInt815, -202, -371);
			this.aClass42_21.method425();
			local13.method358(anInt815, -202, -171);
			this.aClass42_24.method425();
			local13.method358(anInt815, 0, -265);
			this.aClass42_25.method425();
			local13.method358(anInt815, -562, -265);
			this.aClass42_26.method425();
			local13.method358(anInt815, -128, -171);
			this.aClass42_27.method425();
			local13.method358(anInt815, -562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt524];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt525; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt524; local104++) {
					local98[local104] = local13.anIntArray156[local13.anInt524 + local13.anInt524 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt524; local130++) {
					local13.anIntArray156[local130 + local13.anInt524 * local100] = local98[local130];
				}
			}
			this.aClass42_22.method425();
			local13.method358(anInt815, 382, 0);
			this.aClass42_23.method425();
			local13.method358(anInt815, -255, 0);
			this.aClass42_19.method425();
			local13.method358(anInt815, 254, 0);
			this.aClass42_20.method425();
			local13.method358(anInt815, 180, -371);
			this.aClass42_21.method425();
			local13.method358(anInt815, 180, -171);
			this.aClass42_24.method425();
			local13.method358(anInt815, 382, -265);
			this.aClass42_25.method425();
			local13.method358(anInt815, -180, -265);
			this.aClass42_26.method425();
			local13.method358(anInt815, 254, -171);
			this.aClass42_27.method425();
			local13.method358(anInt815, -180, -171);
			local13 = new Class2_Sub1_Sub1_Sub3(this.aClass22_2, "logo", 0);
			this.aClass42_19.method425();
			local13.method360(382 - local13.anInt524 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(280) RuntimeException local280) {
			signlink.reporterror("50023, " + -31892 + ", " + local280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method696() {
		try {
			@Pc(6) int local6 = this.anInt993 * 128 + 64;
			@Pc(13) int local13 = this.anInt994 * 128 + 64;
			@Pc(24) int local24 = this.method657(this.anInt1028, local6, local13) - this.anInt995;
			if (this.anInt1015 < local6) {
				this.anInt1015 += this.anInt996 + (local6 - this.anInt1015) * this.anInt997 / 1000;
				if (this.anInt1015 > local6) {
					this.anInt1015 = local6;
				}
			}
			if (this.anInt1015 > local6) {
				this.anInt1015 -= this.anInt996 + (this.anInt1015 - local6) * this.anInt997 / 1000;
				if (this.anInt1015 < local6) {
					this.anInt1015 = local6;
				}
			}
			if (this.anInt1016 < local24) {
				this.anInt1016 += this.anInt996 + (local24 - this.anInt1016) * this.anInt997 / 1000;
				if (this.anInt1016 > local24) {
					this.anInt1016 = local24;
				}
			}
			if (this.anInt1016 > local24) {
				this.anInt1016 -= this.anInt996 + (this.anInt1016 - local24) * this.anInt997 / 1000;
				if (this.anInt1016 < local24) {
					this.anInt1016 = local24;
				}
			}
			if (this.anInt1017 < local13) {
				this.anInt1017 += this.anInt996 + (local13 - this.anInt1017) * this.anInt997 / 1000;
				if (this.anInt1017 > local13) {
					this.anInt1017 = local13;
				}
			}
			if (this.anInt1017 > local13) {
				this.anInt1017 -= this.anInt996 + (this.anInt1017 - local13) * this.anInt997 / 1000;
				if (this.anInt1017 < local13) {
					this.anInt1017 = local13;
				}
			}
			local6 = this.anInt957 * 128 + 64;
			local13 = this.anInt958 * 128 + 64;
			local24 = this.method657(this.anInt1028, local6, local13) - this.anInt959;
			@Pc(226) int local226 = local6 - this.anInt1015;
			@Pc(231) int local231 = local24 - this.anInt1016;
			@Pc(236) int local236 = local13 - this.anInt1017;
			@Pc(247) int local247 = (int) Math.sqrt((double) (local226 * local226 + local236 * local236));
			@Pc(258) int local258 = (int) (Math.atan2((double) local231, (double) local247) * 325.949D) & 0x7FF;
			@Pc(269) int local269 = (int) (Math.atan2((double) local226, (double) local236) * -325.949D) & 0x7FF;
			if (local258 < 128) {
				local258 = 128;
			}
			if (local258 > 383) {
				local258 = 383;
			}
			if (this.anInt1018 < local258) {
				this.anInt1018 += this.anInt960 + (local258 - this.anInt1018) * this.anInt961 / 1000;
				if (this.anInt1018 > local258) {
					this.anInt1018 = local258;
				}
			}
			if (this.anInt1018 > local258) {
				this.anInt1018 -= this.anInt960 + (this.anInt1018 - local258) * this.anInt961 / 1000;
				if (this.anInt1018 < local258) {
					this.anInt1018 = local258;
				}
			}
			@Pc(340) int local340 = local269 - this.anInt1019;
			if (local340 > 1024) {
				local340 -= 2048;
			}
			if (local340 < -1024) {
				local340 += 2048;
			}
			if (local340 > 0) {
				this.anInt1019 += this.anInt960 + local340 * this.anInt961 / 1000;
				this.anInt1019 &= 0x7FF;
			}
			if (local340 < 0) {
				this.anInt1019 -= this.anInt960 + -local340 * this.anInt961 / 1000;
				this.anInt1019 &= 0x7FF;
			}
			@Pc(398) int local398 = local269 - this.anInt1019;
			if (local398 > 1024) {
				local398 -= 2048;
			}
			if (local398 < -1024) {
				local398 += 2048;
			}
			if (local398 < 0 && local340 > 0 || local398 > 0 && local340 < 0) {
				this.anInt1019 = local269;
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("87742, " + -115 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.anInt975 += 0;
			if (arg0 >= 1 && arg5 >= 1 && arg0 <= 102 && arg5 <= 102) {
				if (aBoolean250 && arg1 != this.anInt1028) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg4 == 0) {
					local26 = this.aClass47_1.method513(arg1, arg0, arg5);
				}
				if (arg4 == 1) {
					local26 = this.aClass47_1.method514(arg1, arg0, arg5);
				}
				if (arg4 == 2) {
					local26 = this.aClass47_1.method515(arg1, arg0, arg5);
				}
				if (arg4 == 3) {
					local26 = this.aClass47_1.method516(arg1, arg0, arg5);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass47_1.method517(arg1, arg0, arg5, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class1 local108;
					if (arg4 == 0) {
						this.aClass47_1.method504(arg1, arg0, arg5);
						local108 = Class1.method4(local88);
						if (local108.aBoolean7) {
							this.aClass5Array1[arg1].method45(arg0, local108.aBoolean6, this.anInt986, arg5, local92, local96);
						}
					}
					if (arg4 == 1) {
						this.aClass47_1.method505(arg1, arg0, arg5);
					}
					if (arg4 == 2) {
						this.aClass47_1.method506(arg1, arg0, arg5);
						local108 = Class1.method4(local88);
						if (arg0 + local108.anInt8 > 103 || arg5 + local108.anInt8 > 103 || arg0 + local108.anInt13 > 103 || arg5 + local108.anInt13 > 103) {
							return;
						}
						if (local108.aBoolean7) {
							this.aClass5Array1[arg1].method46(local108.anInt13, local108.aBoolean6, local96, local108.anInt8, arg0, arg5);
						}
					}
					if (arg4 == 3) {
						this.aClass47_1.method507(arg0, arg5, arg1);
						local108 = Class1.method4(local88);
						if (local108.aBoolean7 && local108.aBoolean1) {
							this.aClass5Array1[arg1].method48(arg0, this.anInt916, arg5);
						}
					}
				}
				if (arg2 >= 0) {
					local82 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg0][arg5] & 0x2) == 2) {
						local82 = arg1 + 1;
					}
					Class34.method339(arg0, this.anIntArrayArrayArray7, this.aClass47_1, arg6, arg1, this.aClass5Array1[arg1], arg2, arg3, arg5, local82);
					return;
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("1014, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method698() {
		try {
			this.aBoolean261 = false;
			while (this.aBoolean265) {
				this.aBoolean261 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass2_Sub1_Sub1_Sub1_11 = null;
			this.aClass2_Sub1_Sub1_Sub1_12 = null;
			this.aClass2_Sub1_Sub1_Sub1Array5 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.aClass2_Sub1_Sub1_Sub3_3 = null;
			this.aClass2_Sub1_Sub1_Sub3_4 = null;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("43483, " + -112 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method699(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(4) Graphics local4 = this.method586().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			if (arg0) {
				this.anInt976 = -1;
			}
			this.method579();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean279) {
				this.aBoolean261 = false;
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
			if (this.aBoolean268) {
				this.aBoolean261 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean269) {
				this.aBoolean261 = false;
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
			signlink.reporterror("61595, " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method700(@OriginalArg(1) boolean arg0) {
		try {
			this.method717();
			this.aClass42_21.method425();
			this.anInt975 += 0;
			this.aClass2_Sub1_Sub1_Sub1_11.method77(0, 0);
			@Pc(50) byte local50;
			@Pc(62) int local62;
			if (this.anInt917 == 0) {
				this.aClass2_Sub1_Sub1_Sub4_2.method445(this.aClass18_Sub1_1.aString4, 7711145, true, 180, 180);
				local50 = 80;
				this.aClass2_Sub1_Sub1_Sub4_4.method445("Welcome to RuneScape", 16776960, true, 180, 80);
				local62 = local50 + 30;
				this.aClass2_Sub1_Sub1_Sub1_12.method77(27, 100);
				this.aClass2_Sub1_Sub1_Sub4_4.method445("New User", 16777215, true, 100, 125);
				this.aClass2_Sub1_Sub1_Sub1_12.method77(187, 100);
				this.aClass2_Sub1_Sub1_Sub4_4.method445("Existing User", 16777215, true, 260, 125);
			}
			if (this.anInt917 == 2) {
				local50 = 60;
				if (this.aString30.length() > 0) {
					this.aClass2_Sub1_Sub1_Sub4_4.method445(this.aString30, 16776960, true, 180, 45);
					this.aClass2_Sub1_Sub1_Sub4_4.method445(this.aString31, 16776960, true, 180, 60);
					local62 = local50 + 30;
				} else {
					this.aClass2_Sub1_Sub1_Sub4_4.method445(this.aString31, 16776960, true, 180, 53);
					local62 = local50 + 30;
				}
				this.aClass2_Sub1_Sub1_Sub4_4.method452(true, 90, 16777215, 90, "Username: " + this.aString25 + (this.anInt1032 == 0 & anInt856 % 40 < 20 ? "@yel@|" : ""));
				local62 += 15;
				this.aClass2_Sub1_Sub1_Sub4_4.method452(true, 92, 16777215, 105, "Password: " + Class40.method410(this.aString26, (byte) 8) + (this.anInt1032 == 1 & anInt856 % 40 < 20 ? "@yel@|" : ""));
				local62 += 15;
				if (!arg0) {
					this.aClass2_Sub1_Sub1_Sub1_12.method77(27, 130);
					this.aClass2_Sub1_Sub1_Sub4_4.method445("Login", 16777215, true, 100, 155);
					this.aClass2_Sub1_Sub1_Sub1_12.method77(187, 130);
					this.aClass2_Sub1_Sub1_Sub4_4.method445("Cancel", 16777215, true, 260, 155);
				}
			}
			if (this.anInt917 == 3) {
				this.aClass2_Sub1_Sub1_Sub4_4.method445("Create a free account", 16776960, true, 180, 40);
				local50 = 65;
				this.aClass2_Sub1_Sub1_Sub4_4.method445("To create a new account you need to", 16777215, true, 180, 65);
				local62 = local50 + 15;
				this.aClass2_Sub1_Sub1_Sub4_4.method445("go back to the main RuneScape webpage", 16777215, true, 180, 80);
				local62 += 15;
				this.aClass2_Sub1_Sub1_Sub4_4.method445("and choose the 'create account'", 16777215, true, 180, 95);
				local62 += 15;
				this.aClass2_Sub1_Sub1_Sub4_4.method445("button near the top of that page.", 16777215, true, 180, 110);
				local62 += 15;
				this.aClass2_Sub1_Sub1_Sub1_12.method77(107, 130);
				this.aClass2_Sub1_Sub1_Sub4_4.method445("Cancel", 16777215, true, 180, 155);
			}
			this.aClass42_21.method426(171, 202, super.aGraphics2);
			if (this.aBoolean282) {
				this.aBoolean282 = false;
				this.aClass42_19.method426(0, 128, super.aGraphics2);
				this.aClass42_20.method426(371, 202, super.aGraphics2);
				this.aClass42_24.method426(265, 0, super.aGraphics2);
				this.aClass42_25.method426(265, 562, super.aGraphics2);
				this.aClass42_26.method426(171, 128, super.aGraphics2);
				this.aClass42_27.method426(171, 562, super.aGraphics2);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("27487, " + 0 + ", " + arg0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method701() {
		try {
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method52();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass6_1 = null;
			this.aBoolean271 = false;
			this.anInt917 = 0;
			this.aString25 = "";
			this.aString26 = "";
			this.method594();
			this.aClass47_1.method487();
			for (@Pc(39) int local39 = 0; local39 < 4; local39++) {
				this.aClass5Array1[local39].method40();
			}
			System.gc();
			this.method719((byte) 6);
			this.anInt866 = -1;
			this.anInt968 = -1;
			this.anInt936 = 0;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("42095, " + -121 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	private void method702(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(4) int local4;
			if (arg1 != -18) {
				for (local4 = 1; local4 > 0; local4++) {
				}
			}
			if (this.aClass42_14 != null) {
				this.aClass42_14.method425();
				Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
				local4 = 151;
				if (arg0 != null) {
					local4 -= 7;
				}
				this.aClass2_Sub1_Sub1_Sub4_3.method444(arg2, 936, 0, 257, local4);
				this.aClass2_Sub1_Sub1_Sub4_3.method444(arg2, 936, 16777215, 256, local4 - 1);
				local4 += 15;
				if (arg0 != null) {
					this.aClass2_Sub1_Sub1_Sub4_3.method444(arg0, 936, 0, 257, local4);
					this.aClass2_Sub1_Sub1_Sub4_3.method444(arg0, 936, 16777215, 256, local4 - 1);
				}
				this.aClass42_14.method426(4, 4, super.aGraphics2);
			} else if (super.aClass42_2 != null) {
				super.aClass42_2.method425();
				Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray255;
				local4 = 251;
				Class2_Sub1_Sub1.method436(233, 221, this.anInt967, 0, 300, 50);
				Class2_Sub1_Sub1.method437(233, 300, 16777215, 50, 221);
				if (arg0 != null) {
					local4 -= 7;
				}
				this.aClass2_Sub1_Sub1_Sub4_3.method444(arg2, 936, 0, 383, local4);
				this.aClass2_Sub1_Sub1_Sub4_3.method444(arg2, 936, 16777215, 382, local4 - 1);
				local4 += 15;
				if (arg0 != null) {
					this.aClass2_Sub1_Sub1_Sub4_3.method444(arg0, 936, 0, 383, local4);
					this.aClass2_Sub1_Sub1_Sub4_3.method444(arg0, 936, 16777215, 382, local4 - 1);
				}
				super.aClass42_2.method426(0, 0, super.aGraphics2);
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("50122, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method703() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt898; local3++) {
				if (local3 == -1) {
					local11 = this.anInt897;
				} else {
					local11 = this.anIntArray245[local3];
				}
				@Pc(23) Class2_Sub1_Sub2_Sub3_Sub2 local23 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local11];
				if (local23 != null && local23.anInt674 > 0) {
					local23.anInt674--;
					if (local23.anInt674 == 0) {
						local23.aString14 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt829; local11++) {
				@Pc(64) int local64 = this.anIntArray217[local11];
				@Pc(69) Class2_Sub1_Sub2_Sub3_Sub1 local69 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local64];
				if (local69 != null && local69.anInt674 > 0) {
					local69.anInt674--;
					if (local69.anInt674 == 0) {
						local69.aString14 = null;
					}
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("95819, " + -88 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method704() {
		try {
			this.aBoolean265 = true;
			try {
				@Pc(15) long local15 = System.currentTimeMillis();
				@Pc(17) int local17 = 0;
				@Pc(19) int local19 = 20;
				while (this.aBoolean261) {
					this.anInt1029++;
					this.method614();
					this.method614();
					this.method600();
					local17++;
					if (local17 > 10) {
						@Pc(42) long local42 = System.currentTimeMillis();
						@Pc(51) int local51 = (int) (local42 - local15) / 10 - local19;
						local19 = 40 - local51;
						if (local19 < 5) {
							local19 = 5;
						}
						local17 = 0;
						local15 = local42;
					}
					try {
						Thread.sleep((long) local19);
					} catch (@Pc(69) Exception local69) {
					}
				}
			} catch (@Pc(75) Exception local75) {
			}
			this.aBoolean265 = false;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("23665, " + 7 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method705(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt829; local1++) {
				@Pc(11) Class2_Sub1_Sub2_Sub3_Sub1 local11 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray217[local1]];
				@Pc(20) int local20 = (this.anIntArray217[local1] << 14) + 536870912;
				if (local11 != null && local11.method473() && local11.aClass46_1.aBoolean221 == arg0 && local11.aClass46_1.method484()) {
					@Pc(41) int local41 = local11.anInt679 >> 7;
					@Pc(46) int local46 = local11.anInt680 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt690 == 1 && (local11.anInt679 & 0x7F) == 64 && (local11.anInt680 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local41][local46] == this.anInt1040) {
								continue;
							}
							this.anIntArrayArray24[local41][local46] = this.anInt1040;
						}
						if (!local11.aClass46_1.aBoolean220) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass47_1.method498(local11.anInt681, local11, this.anInt1028, this.method657(this.anInt1028, local11.anInt679, local11.anInt680), local11.anInt679, local11.anInt680, local20, (local11.anInt690 - 1) * 64 + 60, local11.aBoolean217);
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("98033, " + arg0 + ", " + -124 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method706() {
		try {
			this.anInt871 = 0;
			@Pc(10) int local10 = (aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 >> 7) + this.anInt907;
			@Pc(18) int local18 = (aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 >> 7) + this.anInt908;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt871 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt871 = 1;
			}
			if (this.anInt871 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt871 = 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("7142, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method707() {
		try {
			try {
				@Pc(14) int local14 = aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 + this.anInt905;
				@Pc(20) int local20 = aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 + this.anInt1012;
				if (this.anInt944 - local14 < -500 || this.anInt944 - local14 > 500 || this.anInt945 - local20 < -500 || this.anInt945 - local20 > 500) {
					this.anInt944 = local14;
					this.anInt945 = local20;
				}
				if (this.anInt944 != local14) {
					this.anInt944 += (local14 - this.anInt944) / 16;
				}
				if (this.anInt945 != local20) {
					this.anInt945 += (local20 - this.anInt945) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt926 += (-this.anInt926 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt926 += (24 - this.anInt926) / 2;
				} else {
					this.anInt926 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt927 += (12 - this.anInt927) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt927 += (-this.anInt927 - 12) / 2;
				} else {
					this.anInt927 /= 2;
				}
				this.anInt925 = this.anInt925 + this.anInt926 / 2 & 0x7FF;
				this.anInt924 += this.anInt927 / 2;
				if (this.anInt924 < 128) {
					this.anInt924 = 128;
				}
				if (this.anInt924 > 383) {
					this.anInt924 = 383;
				}
				@Pc(207) int local207 = this.anInt944 >> 7;
				@Pc(212) int local212 = this.anInt945 >> 7;
				@Pc(222) int local222 = this.method657(this.anInt1028, this.anInt944, this.anInt945);
				@Pc(224) int local224 = 0;
				@Pc(240) int local240;
				if (local207 > 3 && local212 > 3 && local207 < 100 && local212 < 100) {
					for (local240 = local207 - 4; local240 <= local207 + 4; local240++) {
						for (@Pc(246) int local246 = local212 - 4; local246 <= local212 + 4; local246++) {
							@Pc(251) int local251 = this.anInt1028;
							if (local251 < 3 && (this.aByteArrayArrayArray8[1][local240][local246] & 0x2) == 2) {
								local251++;
							}
							@Pc(278) int local278 = local222 - this.anIntArrayArrayArray7[local251][local240][local246];
							if (local278 > local224) {
								local224 = local278;
							}
						}
					}
				}
				local240 = local224 * 192;
				if (local240 > 98048) {
					local240 = 98048;
				}
				if (local240 < 32768) {
					local240 = 32768;
				}
				if (local240 > this.anInt1030) {
					this.anInt1030 += (local240 - this.anInt1030) / 24;
				} else if (local240 < this.anInt1030) {
					this.anInt1030 += (local240 - this.anInt1030) / 80;
				}
			} catch (@Pc(342) Exception local342) {
				signlink.reporterror("glfc_ex " + aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 + "," + aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 + "," + this.anInt944 + "," + this.anInt945 + "," + this.anInt875 + "," + this.anInt876 + "," + this.anInt907 + "," + this.anInt908);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("49727, " + -38 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CMELCUKG;)V")
	private void method708(@OriginalArg(1) Class2_Sub1_Sub1_Sub1 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray250.length; local5++) {
				this.anIntArray250[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray250[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local30 = 0; local30 < 20; local30++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray251[local66] = (this.anIntArray250[local66 - 1] + this.anIntArray250[local66 + 1] + this.anIntArray250[local66 - 128] + this.anIntArray250[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray250;
				this.anIntArray250 = this.anIntArray251;
				this.anIntArray251 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt100; local58++) {
					for (local66 = 0; local66 < arg0.anInt99; local66++) {
						if (arg0.aByteArray9[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt101 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt102 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray250[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("41545, " + -55 + ", " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method709() {
		try {
			this.aClass42_13.method425();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt872 == 2) {
				@Pc(13) byte[] local13 = this.aClass2_Sub1_Sub1_Sub1_14.aByteArray9;
				@Pc(15) int[] local15 = Class2_Sub1_Sub1.anIntArray172;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass2_Sub1_Sub1_Sub3_14.method364(this.anInt925, 0, 25, 33, this.anIntArray221, 33, 25, 0, (byte) 7, 256, this.anIntArray214);
				this.aClass42_14.method425();
				Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
			} else {
				@Pc(67) int local67 = this.anInt925 + this.anInt869 & 0x7FF;
				@Pc(74) int local74 = aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32 + 48;
				local18 = 464 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
				this.aClass2_Sub1_Sub1_Sub3_13.method364(local67, 5, local18, 146, this.anIntArray258, 151, local74, 25, (byte) 7, this.anInt864 + 256, this.anIntArray269);
				this.aClass2_Sub1_Sub1_Sub3_14.method364(this.anInt925, 0, 25, 33, this.anIntArray221, 33, 25, 0, (byte) 7, 256, this.anIntArray214);
				for (local20 = 0; local20 < this.anInt857; local20++) {
					local74 = this.anIntArray228[local20] * 4 + 2 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32;
					local18 = this.anIntArray229[local20] * 4 + 2 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
					this.method646((byte) 2, local18, local74, this.aClass2_Sub1_Sub1_Sub3Array4[local20]);
				}
				@Pc(172) int local172;
				for (@Pc(168) int local168 = 0; local168 < 104; local168++) {
					for (local172 = 0; local172 < 104; local172++) {
						@Pc(184) Class41 local184 = this.aClass41ArrayArrayArray1[this.anInt1028][local168][local172];
						if (local184 != null) {
							local74 = local168 * 4 + 2 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32;
							local18 = local172 * 4 + 2 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
							this.method646((byte) 2, local18, local74, this.aClass2_Sub1_Sub1_Sub3_7);
						}
					}
				}
				for (local172 = 0; local172 < this.anInt829; local172++) {
					@Pc(235) Class2_Sub1_Sub2_Sub3_Sub1 local235 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray217[local172]];
					if (local235 != null && local235.method473()) {
						@Pc(244) Class46 local244 = local235.aClass46_1;
						if (local244.anIntArray192 != null) {
							local244 = local244.method481();
						}
						if (local244 != null && local244.aBoolean222 && local244.aBoolean220) {
							local74 = local235.anInt679 / 32 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32;
							local18 = local235.anInt680 / 32 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
							this.method646((byte) 2, local18, local74, this.aClass2_Sub1_Sub1_Sub3_8);
						}
					}
				}
				@Pc(303) Class2_Sub1_Sub2_Sub3_Sub2 local303;
				for (@Pc(293) int local293 = 0; local293 < this.anInt898; local293++) {
					local303 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray245[local293]];
					if (local303 != null && local303.method473()) {
						local74 = local303.anInt679 / 32 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32;
						local18 = local303.anInt680 / 32 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
						@Pc(331) boolean local331 = false;
						@Pc(335) long local335 = Class40.method405(local303.aString15);
						for (@Pc(337) int local337 = 0; local337 < this.anInt892; local337++) {
							if (local335 == this.aLongArray4[local337] && this.anIntArray231[local337] != 0) {
								local331 = true;
								break;
							}
						}
						@Pc(362) boolean local362 = false;
						if (aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt710 != 0 && local303.anInt710 != 0 && aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt710 == local303.anInt710) {
							local362 = true;
						}
						if (local331) {
							this.method646((byte) 2, local18, local74, this.aClass2_Sub1_Sub1_Sub3_10);
						} else if (local362) {
							this.method646((byte) 2, local18, local74, this.aClass2_Sub1_Sub1_Sub3_11);
						} else {
							this.method646((byte) 2, local18, local74, this.aClass2_Sub1_Sub1_Sub3_9);
						}
					}
				}
				if (this.anInt848 != 0 && anInt856 % 20 < 10) {
					if (this.anInt848 == 1 && this.anInt900 >= 0 && this.anInt900 < this.aClass2_Sub1_Sub2_Sub3_Sub1Array1.length) {
						@Pc(436) Class2_Sub1_Sub2_Sub3_Sub1 local436 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[this.anInt900];
						if (local436 != null) {
							local74 = local436.anInt679 / 32 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32;
							local18 = local436.anInt680 / 32 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
							this.method682(local18, local74, this.aClass2_Sub1_Sub1_Sub3_17);
						}
					}
					if (this.anInt848 == 2) {
						local74 = (this.anInt950 - this.anInt907) * 4 + 2 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32;
						local18 = (this.anInt951 - this.anInt908) * 4 + 2 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
						this.method682(local18, local74, this.aClass2_Sub1_Sub1_Sub3_17);
					}
					if (this.anInt848 == 10 && this.anInt971 >= 0 && this.anInt971 < this.aClass2_Sub1_Sub2_Sub3_Sub2Array1.length) {
						local303 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[this.anInt971];
						if (local303 != null) {
							local74 = local303.anInt679 / 32 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32;
							local18 = local303.anInt680 / 32 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
							this.method682(local18, local74, this.aClass2_Sub1_Sub1_Sub3_17);
						}
					}
				}
				if (this.anInt928 != 0) {
					local74 = this.anInt928 * 4 + 2 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 / 32;
					local18 = this.anInt929 * 4 + 2 - aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 / 32;
					this.method646((byte) 2, local18, local74, this.aClass2_Sub1_Sub1_Sub3_16);
				}
				Class2_Sub1_Sub1.method436(97, 78, this.anInt967, 16777215, 3, 3);
				this.aClass42_14.method425();
				Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
			}
		} catch (@Pc(605) RuntimeException local605) {
			signlink.reporterror("23011, " + false + ", " + local605.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ILclient!EMWAMCXW;I)V")
	private void method710(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method107();
			@Pc(9) int local9 = arg0.method108(8);
			@Pc(13) int local13 = arg1 + 0;
			@Pc(19) int local19;
			if (local9 < this.anInt829) {
				for (local19 = local9; local19 < this.anInt829; local19++) {
					this.anIntArray274[this.anInt1031++] = this.anIntArray217[local19];
				}
			}
			if (local9 > this.anInt829) {
				signlink.reporterror(this.aString25 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt829 = 0;
			for (local19 = 0; local19 < local9; local19++) {
				@Pc(71) int local71 = this.anIntArray217[local19];
				@Pc(76) Class2_Sub1_Sub2_Sub3_Sub1 local76 = this.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local71];
				@Pc(81) int local81 = arg0.method108(1);
				if (local81 == 0) {
					this.anIntArray217[this.anInt829++] = local71;
					local76.anInt678 = anInt856;
				} else {
					@Pc(104) int local104 = arg0.method108(2);
					if (local104 == 0) {
						this.anIntArray217[this.anInt829++] = local71;
						local76.anInt678 = anInt856;
						this.anIntArray246[this.anInt899++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray217[this.anInt829++] = local71;
							local76.anInt678 = anInt856;
							local155 = arg0.method108(3);
							local76.method474(local155, false);
							local165 = arg0.method108(1);
							if (local165 == 1) {
								this.anIntArray246[this.anInt899++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray217[this.anInt829++] = local71;
							local76.anInt678 = anInt856;
							local155 = arg0.method108(3);
							local76.method474(local155, true);
							local165 = arg0.method108(3);
							local76.method474(local165, true);
							@Pc(223) int local223 = arg0.method108(1);
							if (local223 == 1) {
								this.anIntArray246[this.anInt899++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray274[this.anInt1031++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("46416, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class2_Sub2 local1 = null;
			for (@Pc(6) Class2_Sub2 local6 = (Class2_Sub2) this.aClass41_11.method414(); local6 != null; local6 = (Class2_Sub2) this.aClass41_11.method416()) {
				if (local6.anInt207 == arg3 && local6.anInt209 == arg5 && local6.anInt210 == arg8 && local6.anInt208 == arg6) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class2_Sub2();
				local1.anInt207 = arg3;
				local1.anInt208 = arg6;
				local1.anInt209 = arg5;
				local1.anInt210 = arg8;
				this.method627(local1);
				this.aClass41_11.method411(local1);
			}
			local1.anInt215 = arg0;
			local1.anInt217 = arg1;
			local1.anInt216 = arg2;
			local1.anInt218 = arg4;
			local1.anInt211 = arg7;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("96069, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!EMWAMCXW;II)V")
	private void method712(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6 = arg0.method108(8);
			@Pc(12) int local12;
			if (local6 < this.anInt898) {
				for (local12 = local6; local12 < this.anInt898; local12++) {
					this.anIntArray274[this.anInt1031++] = this.anIntArray245[local12];
				}
			}
			if (local6 > this.anInt898) {
				signlink.reporterror(this.aString25 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt898 = 0;
			@Pc(59) boolean local59 = false;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(68) int local68 = this.anIntArray245[local12];
				@Pc(73) Class2_Sub1_Sub2_Sub3_Sub2 local73 = this.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local68];
				@Pc(78) int local78 = arg0.method108(1);
				if (local78 == 0) {
					this.anIntArray245[this.anInt898++] = local68;
					local73.anInt678 = anInt856;
				} else {
					@Pc(101) int local101 = arg0.method108(2);
					if (local101 == 0) {
						this.anIntArray245[this.anInt898++] = local68;
						local73.anInt678 = anInt856;
						this.anIntArray246[this.anInt899++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray245[this.anInt898++] = local68;
							local73.anInt678 = anInt856;
							local152 = arg0.method108(3);
							local73.method474(local152, false);
							local162 = arg0.method108(1);
							if (local162 == 1) {
								this.anIntArray246[this.anInt899++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray245[this.anInt898++] = local68;
							local73.anInt678 = anInt856;
							local152 = arg0.method108(3);
							local73.method474(local152, true);
							local162 = arg0.method108(3);
							local73.method474(local162, true);
							@Pc(220) int local220 = arg0.method108(1);
							if (local220 == 1) {
								this.anIntArray246[this.anInt899++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray274[this.anInt1031++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("57877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class31 local6 = Class31.method293(arg0);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray137.length && local6.anIntArray137[local8] != -1; local8++) {
				@Pc(22) Class31 local22 = Class31.method293(local6.anIntArray137[local8]);
				if (local22.anInt397 == 0) {
					local3 |= this.method713(local22.anInt385, arg1);
				}
				@Pc(56) int local56;
				if (local22.anInt397 == 6 && (local22.anInt388 != -1 || local22.anInt389 != -1)) {
					@Pc(51) boolean local51 = this.method670(local22);
					if (local51) {
						local56 = local22.anInt389;
					} else {
						local56 = local22.anInt388;
					}
					if (local56 != -1) {
						@Pc(68) Class39 local68 = Class39.aClass39Array1[local56];
						local22.anInt407 += arg1;
						while (local22.anInt407 > local68.method403(local22.anInt381)) {
							local22.anInt407 -= local68.method403(local22.anInt381) + 1;
							local22.anInt381++;
							if (local22.anInt381 >= local68.anInt585) {
								local22.anInt381 -= local68.anInt586;
								if (local22.anInt381 < 0 || local22.anInt381 >= local68.anInt585) {
									local22.anInt381 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local22.anInt397 == 6 && local22.anInt379 != 0) {
					@Pc(139) int local139 = local22.anInt379 >> 16;
					local56 = local22.anInt379 << 16 >> 16;
					@Pc(150) int local150 = local139 * arg1;
					local56 *= arg1;
					local22.anInt402 = local22.anInt402 + local150 & 0x7FF;
					local22.anInt403 = local22.anInt403 + local56 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("98090, " + arg0 + ", " + 32022 + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method714(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass2_Sub1_Sub1_Sub3_13.anIntArray156;
			@Pc(12) int local12 = local5.length;
			for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
				local5[local14] = 0;
			}
			@Pc(38) int local38;
			@Pc(40) int local40;
			for (@Pc(26) int local26 = 1; local26 < 103; local26++) {
				local38 = (103 - local26) * 512 * 4 + 24628;
				for (local40 = 1; local40 < 103; local40++) {
					if ((this.aByteArrayArrayArray8[arg0][local40][local26] & 0x18) == 0) {
						this.aClass47_1.method522(local5, local38, arg0, local40, local26);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local40][local26] & 0x8) != 0) {
						this.aClass47_1.method522(local5, local38, arg0 + 1, local40, local26);
					}
					local38 += 4;
				}
			}
			local38 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass2_Sub1_Sub1_Sub3_13.method355();
			@Pc(150) int local150;
			for (@Pc(146) int local146 = 1; local146 < 103; local146++) {
				for (local150 = 1; local150 < 103; local150++) {
					if ((this.aByteArrayArrayArray8[arg0][local150][local146] & 0x18) == 0) {
						this.method715(local146, arg0, (byte) 5, local40, local38, local150);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local150][local146] & 0x8) != 0) {
						this.method715(local146, arg0 + 1, (byte) 5, local40, local38, local150);
					}
				}
			}
			if (this.aClass42_14 != null) {
				this.aClass42_14.method425();
				Class2_Sub1_Sub1_Sub2.anIntArray119 = this.anIntArray254;
			}
			this.anInt857 = 0;
			for (local150 = 0; local150 < 104; local150++) {
				for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
					@Pc(234) int local234 = this.aClass47_1.method516(this.anInt1028, local150, local224);
					if (local234 != 0) {
						local234 = local234 >> 14 & 0x7FFF;
						@Pc(246) int local246 = Class1.method4(local234).anInt21;
						if (local246 >= 0) {
							@Pc(250) int local250 = local150;
							@Pc(252) int local252 = local224;
							if (local246 != 22 && local246 != 29 && local246 != 34 && local246 != 36 && local246 != 46 && local246 != 47 && local246 != 48) {
								@Pc(284) int[][] local284 = this.aClass5Array1[this.anInt1028].anIntArrayArray4;
								for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
									@Pc(293) int local293 = (int) (Math.random() * 4.0D);
									if (local293 == 0 && local250 > 0 && local250 > local150 - 3 && (local284[local250 - 1][local252] & 0x1280108) == 0) {
										local250--;
									}
									if (local293 == 1 && local250 < 103 && local250 < local150 + 3 && (local284[local250 + 1][local252] & 0x1280180) == 0) {
										local250++;
									}
									if (local293 == 2 && local252 > 0 && local252 > local224 - 3 && (local284[local250][local252 - 1] & 0x1280102) == 0) {
										local252--;
									}
									if (local293 == 3 && local252 < 103 && local252 < local224 + 3 && (local284[local250][local252 + 1] & 0x1280120) == 0) {
										local252++;
									}
								}
							}
							this.aClass2_Sub1_Sub1_Sub3Array4[this.anInt857] = this.aClass2_Sub1_Sub1_Sub3Array5[local246];
							this.anIntArray228[this.anInt857] = local250;
							this.anIntArray229[this.anInt857] = local252;
							this.anInt857++;
						}
					}
				}
			}
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("22037, " + arg0 + ", " + 0 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIII)V")
	private void method715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(22) int local22 = this.aClass47_1.method513(arg1, arg5, arg0);
			@Pc(32) int local32;
			@Pc(38) int local38;
			@Pc(42) int local42;
			@Pc(44) int local44;
			@Pc(66) int local66;
			@Pc(72) int local72;
			if (local22 != 0) {
				local32 = this.aClass47_1.method517(arg1, arg5, arg0, local22);
				local38 = local32 >> 6 & 0x3;
				local42 = local32 & 0x1F;
				local44 = arg4;
				if (local22 > 0) {
					local44 = arg3;
				}
				@Pc(52) int[] local52 = this.aClass2_Sub1_Sub1_Sub3_13.anIntArray156;
				local66 = arg5 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local72 = local22 >> 14 & 0x7FFF;
				@Pc(75) Class1 local75 = Class1.method4(local72);
				if (local75.anInt16 == -1) {
					if (local42 == 0 || local42 == 2) {
						if (local38 == 0) {
							local52[local66] = local44;
							local52[local66 + 512] = local44;
							local52[local66 + 1024] = local44;
							local52[local66 + 1536] = local44;
						} else if (local38 == 1) {
							local52[local66] = local44;
							local52[local66 + 1] = local44;
							local52[local66 + 2] = local44;
							local52[local66 + 3] = local44;
						} else if (local38 == 2) {
							local52[local66 + 3] = local44;
							local52[local66 + 3 + 512] = local44;
							local52[local66 + 3 + 1024] = local44;
							local52[local66 + 3 + 1536] = local44;
						} else if (local38 == 3) {
							local52[local66 + 1536] = local44;
							local52[local66 + 1536 + 1] = local44;
							local52[local66 + 1536 + 2] = local44;
							local52[local66 + 1536 + 3] = local44;
						}
					}
					if (local42 == 3) {
						if (local38 == 0) {
							local52[local66] = local44;
						} else if (local38 == 1) {
							local52[local66 + 3] = local44;
						} else if (local38 == 2) {
							local52[local66 + 3 + 1536] = local44;
						} else if (local38 == 3) {
							local52[local66 + 1536] = local44;
						}
					}
					if (local42 == 2) {
						if (local38 == 3) {
							local52[local66] = local44;
							local52[local66 + 512] = local44;
							local52[local66 + 1024] = local44;
							local52[local66 + 1536] = local44;
						} else if (local38 == 0) {
							local52[local66] = local44;
							local52[local66 + 1] = local44;
							local52[local66 + 2] = local44;
							local52[local66 + 3] = local44;
						} else if (local38 == 1) {
							local52[local66 + 3] = local44;
							local52[local66 + 3 + 512] = local44;
							local52[local66 + 3 + 1024] = local44;
							local52[local66 + 3 + 1536] = local44;
						} else if (local38 == 2) {
							local52[local66 + 1536] = local44;
							local52[local66 + 1536 + 1] = local44;
							local52[local66 + 1536 + 2] = local44;
							local52[local66 + 1536 + 3] = local44;
						}
					}
				} else {
					@Pc(85) Class2_Sub1_Sub1_Sub1 local85 = this.aClass2_Sub1_Sub1_Sub1Array2[local75.anInt16];
					if (local85 != null) {
						@Pc(97) int local97 = (local75.anInt8 * 4 - local85.anInt99) / 2;
						@Pc(107) int local107 = (local75.anInt13 * 4 - local85.anInt100) / 2;
						local85.method77(arg5 * 4 + local97 + 48, (104 - arg0 - local75.anInt13) * 4 + 48 + local107);
					}
				}
			}
			local22 = this.aClass47_1.method515(arg1, arg5, arg0);
			if (local22 != 0) {
				local32 = this.aClass47_1.method517(arg1, arg5, arg0, local22);
				local38 = local32 >> 6 & 0x3;
				local42 = local32 & 0x1F;
				local44 = local22 >> 14 & 0x7FFF;
				@Pc(461) Class1 local461 = Class1.method4(local44);
				@Pc(493) int local493;
				if (local461.anInt16 != -1) {
					@Pc(471) Class2_Sub1_Sub1_Sub1 local471 = this.aClass2_Sub1_Sub1_Sub1Array2[local461.anInt16];
					if (local471 != null) {
						local72 = (local461.anInt8 * 4 - local471.anInt99) / 2;
						local493 = (local461.anInt13 * 4 - local471.anInt100) / 2;
						local471.method77(arg5 * 4 + local72 + 48, (104 - arg0 - local461.anInt13) * 4 + 48 + local493);
					}
				} else if (local42 == 9) {
					local66 = 15658734;
					if (local22 > 0) {
						local66 = 15597568;
					}
					@Pc(530) int[] local530 = this.aClass2_Sub1_Sub1_Sub3_13.anIntArray156;
					local493 = arg5 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local38 == 0 || local38 == 2) {
						local530[local493 + 1536] = local66;
						local530[local493 + 1024 + 1] = local66;
						local530[local493 + 512 + 2] = local66;
						local530[local493 + 3] = local66;
					} else {
						local530[local493] = local66;
						local530[local493 + 512 + 1] = local66;
						local530[local493 + 1024 + 2] = local66;
						local530[local493 + 1536 + 3] = local66;
					}
				}
			}
			local22 = this.aClass47_1.method516(arg1, arg5, arg0);
			if (local22 != 0) {
				local32 = local22 >> 14 & 0x7FFF;
				@Pc(625) Class1 local625 = Class1.method4(local32);
				if (local625.anInt16 != -1) {
					@Pc(635) Class2_Sub1_Sub1_Sub1 local635 = this.aClass2_Sub1_Sub1_Sub1Array2[local625.anInt16];
					if (local635 != null) {
						local44 = (local625.anInt8 * 4 - local635.anInt99) / 2;
						@Pc(657) int local657 = (local625.anInt13 * 4 - local635.anInt100) / 2;
						local635.method77(arg5 * 4 + local44 + 48, (104 - arg0 - local625.anInt13) * 4 + 48 + local657);
						return;
					}
				}
			}
		} catch (@Pc(681) RuntimeException local681) {
			signlink.reporterror("4385, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local681.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method717() {
		try {
			if (this.aClass42_19 == null) {
				super.aClass42_2 = null;
				this.aBoolean271 &= true;
				this.aClass42_15 = null;
				this.aClass42_13 = null;
				this.aClass42_12 = null;
				this.aClass42_14 = null;
				this.aClass42_16 = null;
				this.aClass42_17 = null;
				this.aClass42_18 = null;
				this.aClass42_22 = new Class42(this.method586(), 128, 265, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_23 = new Class42(this.method586(), 128, 265, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_19 = new Class42(this.method586(), 509, 171, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_20 = new Class42(this.method586(), 360, 132, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_21 = new Class42(this.method586(), 360, 200, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_24 = new Class42(this.method586(), 202, 238, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_25 = new Class42(this.method586(), 203, 238, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_26 = new Class42(this.method586(), 74, 94, false);
				Class2_Sub1_Sub1.method434();
				this.aClass42_27 = new Class42(this.method586(), 75, 94, false);
				Class2_Sub1_Sub1.method434();
				if (this.aClass22_2 != null) {
					this.method695();
					this.method718();
				}
				this.aBoolean282 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("46724, " + true + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method718() {
		try {
			this.aClass2_Sub1_Sub1_Sub1_11 = new Class2_Sub1_Sub1_Sub1(this.aClass22_2, "titlebox", 0);
			this.aClass2_Sub1_Sub1_Sub1_12 = new Class2_Sub1_Sub1_Sub1(this.aClass22_2, "titlebutton", 0);
			this.aClass2_Sub1_Sub1_Sub1Array5 = new Class2_Sub1_Sub1_Sub1[12];
			for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
				this.aClass2_Sub1_Sub1_Sub1Array5[local32] = new Class2_Sub1_Sub1_Sub1(this.aClass22_2, "runes", local32);
			}
			this.aClass2_Sub1_Sub1_Sub3_3 = new Class2_Sub1_Sub1_Sub3(128, 265);
			this.aClass2_Sub1_Sub1_Sub3_4 = new Class2_Sub1_Sub1_Sub3(128, 265);
			for (@Pc(65) int local65 = 0; local65 < 33920; local65++) {
				this.aClass2_Sub1_Sub1_Sub3_3.anIntArray156[local65] = this.aClass42_22.anIntArray170[local65];
			}
			for (@Pc(83) int local83 = 0; local83 < 33920; local83++) {
				this.aClass2_Sub1_Sub1_Sub3_4.anIntArray156[local83] = this.aClass42_23.anIntArray170[local83];
			}
			this.anIntArray225 = new int[256];
			for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
				this.anIntArray225[local105] = local105 * 262144;
			}
			for (@Pc(120) int local120 = 0; local120 < 64; local120++) {
				this.anIntArray225[local120 + 64] = local120 * 1024 + 16711680;
			}
			for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
				this.anIntArray225[local139 + 128] = local139 * 4 + 16776960;
			}
			for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
				this.anIntArray225[local158 + 192] = 16777215;
			}
			this.anIntArray226 = new int[256];
			for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
				this.anIntArray226[local177] = local177 * 1024;
			}
			for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
				this.anIntArray226[local192 + 64] = local192 * 4 + 65280;
			}
			for (@Pc(211) int local211 = 0; local211 < 64; local211++) {
				this.anIntArray226[local211 + 128] = local211 * 262144 + 65535;
			}
			for (@Pc(230) int local230 = 0; local230 < 64; local230++) {
				this.anIntArray226[local230 + 192] = 16777215;
			}
			this.anIntArray227 = new int[256];
			for (@Pc(249) int local249 = 0; local249 < 64; local249++) {
				this.anIntArray227[local249] = local249 * 4;
			}
			for (@Pc(264) int local264 = 0; local264 < 64; local264++) {
				this.anIntArray227[local264 + 64] = local264 * 262144 + 255;
			}
			for (@Pc(283) int local283 = 0; local283 < 64; local283++) {
				this.anIntArray227[local283 + 128] = local283 * 1024 + 16711935;
			}
			for (@Pc(302) int local302 = 0; local302 < 64; local302++) {
				this.anIntArray227[local302 + 192] = 16777215;
			}
			this.anIntArray224 = new int[256];
			this.anIntArray250 = new int[32768];
			this.anIntArray251 = new int[32768];
			this.method708(null);
			this.anIntArray271 = new int[32768];
			this.anIntArray272 = new int[32768];
			this.method588("Connecting to fileserver", 10, (byte) 5);
			if (!this.aBoolean261) {
				this.aBoolean278 = true;
				this.aBoolean261 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("63982, " + 312 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method719(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			signlink.aBoolean286 = false;
			signlink.anInt1051 = 0;
			signlink.midi = "stop";
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("90834, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method720() {
		try {
			anInt962++;
			if (anInt962 > 130) {
				anInt962 = 0;
				this.aClass2_Sub1_Sub3_7.method86(137, 533);
				this.aClass2_Sub1_Sub3_7.method87(209);
			}
			while (true) {
				@Pc(31) int local31;
				do {
					while (true) {
						local31 = this.method580();
						if (local31 == -1) {
							return;
						}
						if (this.anInt850 != -1 && this.anInt850 == this.anInt1003) {
							if (local31 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							}
							break;
						}
						@Pc(211) int local211;
						if (this.aBoolean244) {
							if (local31 >= 32 && local31 <= 122 && this.aString21.length() < 80) {
								this.aString21 = this.aString21 + (char) local31;
								this.aBoolean252 = true;
							}
							if (local31 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
								this.aBoolean252 = true;
							}
							if (local31 == 13 || local31 == 10) {
								this.aBoolean244 = false;
								this.aBoolean252 = true;
								@Pc(171) long local171;
								if (this.anInt943 == 1) {
									local171 = Class40.method405(this.aString21);
									this.method726(local171);
								}
								if (this.anInt943 == 2 && this.anInt892 > 0) {
									local171 = Class40.method405(this.aString21);
									this.method672(local171);
								}
								if (this.anInt943 == 3 && this.aString21.length() > 0) {
									this.aClass2_Sub1_Sub3_7.method86(238, 533);
									this.aClass2_Sub1_Sub3_7.method87(0);
									local211 = this.aClass2_Sub1_Sub3_7.anInt136;
									this.aClass2_Sub1_Sub3_7.method93(this.aLong33);
									Class11.method137(this.aString21, this.aClass2_Sub1_Sub3_7);
									this.aClass2_Sub1_Sub3_7.method96(this.aClass2_Sub1_Sub3_7.anInt136 - local211);
									this.aString21 = Class11.method138(this.aString21);
									this.aString21 = Class48.method548(this.aString21);
									this.method626(this.aString21, 6, Class40.method409(Class40.method406(this.aLong33)));
									if (this.anInt816 == 2) {
										this.anInt816 = 1;
										this.aBoolean242 = true;
										this.aClass2_Sub1_Sub3_7.method86(178, 533);
										this.aClass2_Sub1_Sub3_7.method87(this.anInt941);
										this.aClass2_Sub1_Sub3_7.method87(this.anInt816);
										this.aClass2_Sub1_Sub3_7.method87(this.anInt877);
									}
								}
								if (this.anInt943 == 4 && this.anInt1011 < 100) {
									local171 = Class40.method405(this.aString21);
									this.method628((byte) 9, local171);
								}
								if (this.anInt943 == 5 && this.anInt1011 > 0) {
									local171 = Class40.method405(this.aString21);
									this.method660(local171);
								}
							}
						} else if (this.anInt973 == 1) {
							if (local31 >= 48 && local31 <= 57 && this.aString22.length() < 10) {
								this.aString22 = this.aString22 + (char) local31;
								this.aBoolean252 = true;
							}
							if (local31 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
								this.aBoolean252 = true;
							}
							if (local31 == 13 || local31 == 10) {
								if (this.aString22.length() > 0) {
									local211 = 0;
									try {
										local211 = Integer.parseInt(this.aString22);
									} catch (@Pc(388) Exception local388) {
									}
									this.aClass2_Sub1_Sub3_7.method86(59, 533);
									this.aClass2_Sub1_Sub3_7.method91(local211);
								}
								this.anInt973 = 0;
								this.aBoolean252 = true;
							}
						} else if (this.anInt973 == 2) {
							if (local31 >= 32 && local31 <= 122 && this.aString22.length() < 12) {
								this.aString22 = this.aString22 + (char) local31;
								this.aBoolean252 = true;
							}
							if (local31 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
								this.aBoolean252 = true;
							}
							if (local31 == 13 || local31 == 10) {
								if (this.aString22.length() > 0) {
									this.aClass2_Sub1_Sub3_7.method86(16, 533);
									this.aClass2_Sub1_Sub3_7.method93(Class40.method405(this.aString22));
								}
								this.anInt973 = 0;
								this.aBoolean252 = true;
							}
						} else if (this.anInt973 == 3) {
							if (local31 >= 32 && local31 <= 122 && this.aString22.length() < 40) {
								this.aString22 = this.aString22 + (char) local31;
								this.aBoolean252 = true;
							}
							if (local31 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
								this.aBoolean252 = true;
							}
						} else if (this.anInt849 == -1 && this.anInt891 == -1) {
							if (local31 >= 32 && local31 <= 122 && this.aString24.length() < 80) {
								this.aString24 = this.aString24 + (char) local31;
								this.aBoolean252 = true;
							}
							if (local31 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
								this.aBoolean252 = true;
							}
							if ((local31 == 13 || local31 == 10) && this.aString24.length() > 0) {
								if (this.anInt942 == 2) {
									if (this.aString24.equals("::clientdrop")) {
										this.method643();
									}
									if (this.aString24.equals("::lag")) {
										this.method661(aBoolean266);
									}
									if (this.aString24.equals("::prefetchmusic")) {
										for (local211 = 0; local211 < this.aClass18_Sub1_1.method201(2); local211++) {
											this.aClass18_Sub1_1.method200(2, local211, (byte) 8, (byte) 1);
										}
									}
									if (this.aString24.equals("::fpson")) {
										aBoolean257 = true;
									}
									if (this.aString24.equals("::fpsoff")) {
										aBoolean257 = false;
									}
									if (this.aString24.equals("::noclip")) {
										for (local211 = 0; local211 < 4; local211++) {
											for (@Pc(673) int local673 = 1; local673 < 103; local673++) {
												for (@Pc(677) int local677 = 1; local677 < 103; local677++) {
													this.aClass5Array1[local211].anIntArrayArray4[local673][local677] = 0;
												}
											}
										}
									}
								}
								if (this.aString24.startsWith("::")) {
									this.aClass2_Sub1_Sub3_7.method86(146, 533);
									this.aClass2_Sub1_Sub3_7.method87(this.aString24.length() - 1);
									this.aClass2_Sub1_Sub3_7.method94(this.aString24.substring(2));
								} else {
									@Pc(732) String local732 = this.aString24.toLowerCase();
									@Pc(734) byte local734 = 0;
									if (local732.startsWith("yellow:")) {
										local734 = 0;
										this.aString24 = this.aString24.substring(7);
									} else if (local732.startsWith("red:")) {
										local734 = 1;
										this.aString24 = this.aString24.substring(4);
									} else if (local732.startsWith("green:")) {
										local734 = 2;
										this.aString24 = this.aString24.substring(6);
									} else if (local732.startsWith("cyan:")) {
										local734 = 3;
										this.aString24 = this.aString24.substring(5);
									} else if (local732.startsWith("purple:")) {
										local734 = 4;
										this.aString24 = this.aString24.substring(7);
									} else if (local732.startsWith("white:")) {
										local734 = 5;
										this.aString24 = this.aString24.substring(6);
									} else if (local732.startsWith("flash1:")) {
										local734 = 6;
										this.aString24 = this.aString24.substring(7);
									} else if (local732.startsWith("flash2:")) {
										local734 = 7;
										this.aString24 = this.aString24.substring(7);
									} else if (local732.startsWith("flash3:")) {
										local734 = 8;
										this.aString24 = this.aString24.substring(7);
									} else if (local732.startsWith("glow1:")) {
										local734 = 9;
										this.aString24 = this.aString24.substring(6);
									} else if (local732.startsWith("glow2:")) {
										local734 = 10;
										this.aString24 = this.aString24.substring(6);
									} else if (local732.startsWith("glow3:")) {
										local734 = 11;
										this.aString24 = this.aString24.substring(6);
									}
									local732 = this.aString24.toLowerCase();
									@Pc(906) byte local906 = 0;
									if (local732.startsWith("wave:")) {
										local906 = 1;
										this.aString24 = this.aString24.substring(5);
									} else if (local732.startsWith("wave2:")) {
										local906 = 2;
										this.aString24 = this.aString24.substring(6);
									} else if (local732.startsWith("shake:")) {
										local906 = 3;
										this.aString24 = this.aString24.substring(6);
									} else if (local732.startsWith("scroll:")) {
										local906 = 4;
										this.aString24 = this.aString24.substring(7);
									} else if (local732.startsWith("slide:")) {
										local906 = 5;
										this.aString24 = this.aString24.substring(6);
									}
									this.aClass2_Sub1_Sub3_7.method86(35, 533);
									this.aClass2_Sub1_Sub3_7.method87(0);
									@Pc(987) int local987 = this.aClass2_Sub1_Sub3_7.anInt136;
									this.aClass2_Sub1_Sub3_7.method114(local734);
									this.aClass2_Sub1_Sub3_7.method115(local906);
									this.aClass2_Sub1_Sub3_8.anInt136 = 0;
									Class11.method137(this.aString24, this.aClass2_Sub1_Sub3_8);
									this.aClass2_Sub1_Sub3_7.method134(this.aClass2_Sub1_Sub3_8.aByteArray10, this.aClass2_Sub1_Sub3_8.anInt136);
									this.aClass2_Sub1_Sub3_7.method96(this.aClass2_Sub1_Sub3_7.anInt136 - local987);
									this.aString24 = Class11.method138(this.aString24);
									this.aString24 = Class48.method548(this.aString24);
									aClass2_Sub1_Sub2_Sub3_Sub2_1.aString14 = this.aString24;
									aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt691 = local734;
									aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt682 = local906;
									aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt674 = 150;
									if (this.anInt942 == 2) {
										this.method626(aClass2_Sub1_Sub2_Sub3_Sub2_1.aString14, 2, "@cr2@" + aClass2_Sub1_Sub2_Sub3_Sub2_1.aString15);
									} else if (this.anInt942 == 1) {
										this.method626(aClass2_Sub1_Sub2_Sub3_Sub2_1.aString14, 2, "@cr1@" + aClass2_Sub1_Sub2_Sub3_Sub2_1.aString15);
									} else {
										this.method626(aClass2_Sub1_Sub2_Sub3_Sub2_1.aString14, 2, aClass2_Sub1_Sub2_Sub3_Sub2_1.aString15);
									}
									if (this.anInt941 == 2) {
										this.anInt941 = 3;
										this.aBoolean242 = true;
										this.aClass2_Sub1_Sub3_7.method86(178, 533);
										this.aClass2_Sub1_Sub3_7.method87(this.anInt941);
										this.aClass2_Sub1_Sub3_7.method87(this.anInt816);
										this.aClass2_Sub1_Sub3_7.method87(this.anInt877);
									}
								}
								this.aString24 = "";
								this.aBoolean252 = true;
							}
						}
					}
				} while ((local31 < 97 || local31 > 122) && (local31 < 65 || local31 > 90) && (local31 < 48 || local31 > 57) && local31 != 32);
				if (this.aString29.length() < 12) {
					this.aString29 = this.aString29 + (char) local31;
				}
			}
		} catch (@Pc(1140) RuntimeException local1140) {
			signlink.reporterror("23454, " + -904 + ", " + local1140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
	private void method721(@OriginalArg(0) int arg0) {
		try {
			this.anInt975 += 0;
			signlink.anInt1053 = arg0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("49446, " + arg0 + ", " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!QXTIWHBH;)I")
	private int method722(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		try {
			if (arg1.anIntArrayArray18 == null || arg0 >= arg1.anIntArrayArray18.length) {
				return -2;
			}
			try {
				@Pc(23) int[] local23 = arg1.anIntArrayArray18[arg0];
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
						local36 = this.anIntArray256[local23[local27++]];
					}
					if (local34 == 2) {
						local36 = this.anIntArray213[local23[local27++]];
					}
					if (local34 == 3) {
						local36 = this.anIntArray216[local23[local27++]];
					}
					@Pc(84) Class31 local84;
					@Pc(89) int local89;
					@Pc(102) int local102;
					if (local34 == 4) {
						local84 = Class31.method293(local23[local27++]);
						local89 = local23[local27++];
						if (local89 >= 0 && local89 < Class38.anInt580 && (!Class38.method391(local89).aBoolean183 || aBoolean249)) {
							for (local102 = 0; local102 < local84.anIntArray138.length; local102++) {
								if (local84.anIntArray138[local102] == local89 + 1) {
									local36 += local84.anIntArray130[local102];
								}
							}
						}
					}
					if (local34 == 5) {
						local36 = this.anIntArray244[local23[local27++]];
					}
					if (local34 == 6) {
						local36 = anIntArray222[this.anIntArray213[local23[local27++]] - 1];
					}
					if (local34 == 7) {
						local36 = this.anIntArray244[local23[local27++]] * 100 / 46875;
					}
					if (local34 == 8) {
						local36 = aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt714;
					}
					@Pc(177) int local177;
					if (local34 == 9) {
						for (local177 = 0; local177 < Class50.anInt793; local177++) {
							if (Class50.aBooleanArray10[local177]) {
								local36 += this.anIntArray213[local177];
							}
						}
					}
					if (local34 == 10) {
						local84 = Class31.method293(local23[local27++]);
						local89 = local23[local27++] + 1;
						if (local89 >= 0 && local89 < Class38.anInt580 && (!Class38.method391(local89).aBoolean183 || aBoolean249)) {
							for (local102 = 0; local102 < local84.anIntArray138.length; local102++) {
								if (local84.anIntArray138[local102] == local89) {
									local36 = 999999999;
									break;
								}
							}
						}
					}
					if (local34 == 11) {
						local36 = this.anInt868;
					}
					if (local34 == 12) {
						local36 = this.anInt1034;
					}
					if (local34 == 13) {
						local177 = this.anIntArray244[local23[local27++]];
						local89 = local23[local27++];
						local36 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
					}
					if (local34 == 14) {
						local177 = local23[local27++];
						@Pc(291) Class10 local291 = Class10.aClass10Array1[local177];
						local102 = local291.anInt126;
						@Pc(297) int local297 = local291.anInt127;
						@Pc(300) int local300 = local291.anInt128;
						@Pc(306) int local306 = anIntArray247[local300 - local297];
						local36 = this.anIntArray244[local102] >> local297 & local306;
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
						local36 = (aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt679 >> 7) + this.anInt907;
					}
					if (local34 == 19) {
						local36 = (aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt680 >> 7) + this.anInt908;
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
			signlink.reporterror("58601, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QXTIWHBH;I)V")
	private void method723(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt405;
			@Pc(8) boolean local8 = false;
			@Pc(64) int local64;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local64 = this.anInt892;
					if (this.anInt893 != 2) {
						local64 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local64) {
						arg0.aString10 = "";
						arg0.anInt395 = 0;
					} else {
						if (this.anIntArray231[local4] == 0) {
							arg0.aString10 = "@red@Offline";
						} else if (this.anIntArray231[local4] < 200) {
							if (this.anIntArray231[local4] == anInt861) {
								arg0.aString10 = "@gre@World" + (this.anIntArray231[local4] - 9);
							} else {
								arg0.aString10 = "@yel@World" + (this.anIntArray231[local4] - 9);
							}
						} else if (this.anIntArray231[local4] == anInt861) {
							arg0.aString10 = "@gre@Classic" + (this.anIntArray231[local4] - 219);
						} else {
							arg0.aString10 = "@yel@Classic" + (this.anIntArray231[local4] - 219);
						}
						arg0.anInt395 = 1;
					}
				} else if (local4 == 203) {
					local64 = this.anInt892;
					if (this.anInt893 != 2) {
						local64 = 0;
					}
					arg0.anInt384 = local64 * 15 + 20;
					if (arg0.anInt384 <= arg0.anInt387) {
						arg0.anInt384 = arg0.anInt387 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt893 == 0) {
						arg0.aString10 = "Loading ignore list";
						arg0.anInt395 = 0;
					} else if (local4 == 1 && this.anInt893 == 0) {
						arg0.aString10 = "Please wait...";
						arg0.anInt395 = 0;
					} else {
						local64 = this.anInt1011;
						if (this.anInt893 == 0) {
							local64 = 0;
						}
						if (local4 >= local64) {
							arg0.aString10 = "";
							arg0.anInt395 = 0;
						} else {
							arg0.aString10 = Class40.method409(Class40.method406(this.aLongArray3[local4]));
							arg0.anInt395 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt384 = this.anInt1011 * 15 + 20;
					if (arg0.anInt384 <= arg0.anInt387) {
						arg0.anInt384 = arg0.anInt387 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt402 = 150;
					arg0.anInt403 = (int) (Math.sin((double) anInt856 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean285) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(377) int local377 = this.anIntArray235[local64];
							if (local377 >= 0 && !Class30.aClass30Array1[local377].method288()) {
								return;
							}
						}
						this.aBoolean285 = false;
						@Pc(396) Class2_Sub1_Sub2_Sub2[] local396 = new Class2_Sub1_Sub2_Sub2[7];
						@Pc(398) int local398 = 0;
						for (@Pc(400) int local400 = 0; local400 < 7; local400++) {
							@Pc(407) int local407 = this.anIntArray235[local400];
							if (local407 >= 0) {
								local396[local398++] = Class30.aClass30Array1[local407].method289();
							}
						}
						@Pc(430) Class2_Sub1_Sub2_Sub2 local430 = new Class2_Sub1_Sub2_Sub2(local396, this.anInt1043, local398);
						for (@Pc(432) int local432 = 0; local432 < 5; local432++) {
							if (this.anIntArray260[local432] != 0) {
								local430.method165(anIntArrayArray22[local432][0], anIntArrayArray22[local432][this.anIntArray260[local432]]);
								if (local432 == 1) {
									local430.method165(anIntArray257[0], anIntArray257[this.anIntArray260[local432]]);
								}
							}
						}
						local430.method158();
						local430.method159((byte) 9, Class39.aClass39Array1[aClass2_Sub1_Sub2_Sub3_Sub2_1.anInt661].anIntArray166[0]);
						local430.method168(64, 850, -30, -50, -30, true);
						arg0.anInt393 = 5;
						arg0.anInt394 = 0;
						Class31.method296(local430);
					}
				} else if (local4 == 324) {
					if (this.aClass2_Sub1_Sub1_Sub3_5 == null) {
						this.aClass2_Sub1_Sub1_Sub3_5 = arg0.aClass2_Sub1_Sub1_Sub3_2;
						this.aClass2_Sub1_Sub1_Sub3_6 = arg0.aClass2_Sub1_Sub1_Sub3_1;
					}
					if (this.aBoolean260) {
						arg0.aClass2_Sub1_Sub1_Sub3_2 = this.aClass2_Sub1_Sub1_Sub3_6;
					} else {
						arg0.aClass2_Sub1_Sub1_Sub3_2 = this.aClass2_Sub1_Sub1_Sub3_5;
					}
				} else if (local4 == 325) {
					if (this.aClass2_Sub1_Sub1_Sub3_5 == null) {
						this.aClass2_Sub1_Sub1_Sub3_5 = arg0.aClass2_Sub1_Sub1_Sub3_2;
						this.aClass2_Sub1_Sub1_Sub3_6 = arg0.aClass2_Sub1_Sub1_Sub3_1;
					}
					if (this.aBoolean260) {
						arg0.aClass2_Sub1_Sub1_Sub3_2 = this.aClass2_Sub1_Sub1_Sub3_5;
					} else {
						arg0.aClass2_Sub1_Sub1_Sub3_2 = this.aClass2_Sub1_Sub1_Sub3_6;
					}
				} else if (local4 == 600) {
					arg0.aString10 = this.aString29;
					if (anInt856 % 20 < 10) {
						arg0.aString10 = arg0.aString10 + "|";
					} else {
						arg0.aString10 = arg0.aString10 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt942 < 1) {
							arg0.aString10 = "";
						} else if (this.aBoolean275) {
							arg0.anInt374 = 16711680;
							arg0.aString10 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt374 = 16777215;
							arg0.aString10 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(637) String local637;
					if (local4 == 660) {
						local64 = this.anInt1038 - this.anInt1033;
						if (local64 <= 0) {
							local637 = "earlier today";
						} else if (local64 == 1) {
							local637 = "yesterday";
						} else {
							local637 = local64 + " days ago";
						}
						arg0.aString10 = "You last logged in @red@" + local637 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt998 == 0) {
							arg0.aString10 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt998 <= this.anInt1038) {
							arg0.aString10 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method724(this.anInt998);
						} else {
							local64 = this.anInt1038 + 14 - this.anInt998;
							if (local64 <= 0) {
								local637 = "Earlier today";
							} else if (local64 == 1) {
								local637 = "Yesterday";
							} else {
								local637 = local64 + " days ago";
							}
							arg0.aString10 = local637 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method724(this.anInt998) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(755) String local755;
						if (this.anInt853 == 0) {
							local755 = "@yel@0 unread messages";
						} else if (this.anInt853 == 1) {
							local755 = "@gre@1 unread message";
						} else {
							local755 = "@gre@" + this.anInt853 + " unread messages";
						}
						arg0.aString10 = "You have " + local755 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt947 > 0 && this.anInt947 <= this.anInt1038 + 10) {
							arg0.aString10 = "Last password change:\\n@gre@" + this.method724(this.anInt947);
						} else {
							arg0.aString10 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt1026 > 2 && !aBoolean249) {
							arg0.aString10 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt1026 > 2) {
							arg0.aString10 = "\\n\\nYou have @gre@" + this.anInt1026 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt1026 > 0) {
							arg0.aString10 = "You have @gre@" + this.anInt1026 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString10 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt1026 > 2 && !aBoolean249) {
							arg0.aString10 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt1026 > 0) {
							arg0.aString10 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString10 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt998 > this.anInt1038) {
							arg0.aString10 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString10 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt893 == 0) {
				arg0.aString10 = "Loading friend list";
				arg0.anInt395 = 0;
			} else if (local4 == 1 && this.anInt893 == 1) {
				arg0.aString10 = "Connecting to friendserver";
				arg0.anInt395 = 0;
			} else if (local4 == 2 && this.anInt893 != 2) {
				arg0.aString10 = "Please wait...";
				arg0.anInt395 = 0;
			} else {
				local64 = this.anInt892;
				if (this.anInt893 != 2) {
					local64 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local64) {
					arg0.aString10 = "";
					arg0.anInt395 = 0;
				} else {
					arg0.aString10 = this.aStringArray8[local4];
					arg0.anInt395 = 1;
				}
			}
		} catch (@Pc(912) RuntimeException local912) {
			signlink.reporterror("58399, " + arg0 + ", " + arg1 + ", " + local912.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private String method724(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt1038 + 10) {
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
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("37467, " + true + ", " + arg0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QXTIWHBH;BII)V")
	private void method725(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt397 == 0 && arg1.anIntArray137 != null && (!arg1.aBoolean151 || this.anInt984 == arg1.anInt385 || this.anInt824 == arg1.anInt385 || this.anInt873 == arg1.anInt385)) {
				@Pc(29) int local29 = Class2_Sub1_Sub1.anInt641;
				@Pc(31) int local31 = Class2_Sub1_Sub1.anInt639;
				@Pc(33) int local33 = Class2_Sub1_Sub1.anInt642;
				@Pc(35) int local35 = Class2_Sub1_Sub1.anInt640;
				Class2_Sub1_Sub1.method433(arg0 + arg1.anInt409, arg2, arg2 + arg1.anInt387, arg0);
				@Pc(51) int local51 = arg1.anIntArray137.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg1.anIntArray135[local53] + arg0;
					@Pc(71) int local71 = arg1.anIntArray132[local53] + arg2 - arg3;
					@Pc(77) Class31 local77 = Class31.method293(arg1.anIntArray137[local53]);
					@Pc(82) int local82 = local62 + local77.anInt410;
					@Pc(87) int local87 = local71 + local77.anInt376;
					if (local77.anInt405 > 0) {
						this.method723(local77, 591);
					}
					if (local77.anInt397 == 0) {
						if (local77.anInt383 > local77.anInt384 - local77.anInt387) {
							local77.anInt383 = local77.anInt384 - local77.anInt387;
						}
						if (local77.anInt383 < 0) {
							local77.anInt383 = 0;
						}
						this.method725(local82, local77, local87, local77.anInt383);
						if (local77.anInt384 > local77.anInt387) {
							this.method694(local87, local77.anInt384, local77.anInt383, local77.anInt387, local82 + local77.anInt409);
						}
					} else if (local77.anInt397 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt397 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt387; local159++) {
								for (local163 = 0; local163 < local77.anInt409; local163++) {
									local174 = local82 + local163 * (local77.anInt377 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt375 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray136[local157];
										local183 += local77.anIntArray131[local157];
									}
									if (local77.anIntArray138[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray138[local157] - 1;
										if (local174 > Class2_Sub1_Sub1.anInt641 - 32 && local174 < Class2_Sub1_Sub1.anInt642 && local183 > Class2_Sub1_Sub1.anInt639 - 32 && local183 < Class2_Sub1_Sub1.anInt640 || this.anInt920 != 0 && this.anInt919 == local157) {
											local241 = 0;
											if (this.anInt830 == 1 && this.anInt831 == local157 && this.anInt832 == local77.anInt385) {
												local241 = 16777215;
											}
											@Pc(265) Class2_Sub1_Sub1_Sub3 local265 = Class38.method390(local77.anIntArray130[local157], local216, local241);
											if (local265 != null) {
												@Pc(344) int local344;
												if (this.anInt920 != 0 && this.anInt919 == local157 && this.anInt918 == local77.anInt385) {
													local207 = super.anInt803 - this.anInt921;
													local209 = super.anInt804 - this.anInt922;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt835 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local265.method362(local174 + local207, local183 + local209);
													if (local183 + local209 < Class2_Sub1_Sub1.anInt639 && arg1.anInt383 > 0) {
														local344 = this.anInt902 * (Class2_Sub1_Sub1.anInt639 - local183 - local209) / 3;
														if (local344 > this.anInt902 * 10) {
															local344 = this.anInt902 * 10;
														}
														if (local344 > arg1.anInt383) {
															local344 = arg1.anInt383;
														}
														arg1.anInt383 -= local344;
														this.anInt922 += local344;
													}
													if (local183 + local209 + 32 > Class2_Sub1_Sub1.anInt640 && arg1.anInt383 < arg1.anInt384 - arg1.anInt387) {
														local344 = this.anInt902 * (local183 + local209 + 32 - Class2_Sub1_Sub1.anInt640) / 3;
														if (local344 > this.anInt902 * 10) {
															local344 = this.anInt902 * 10;
														}
														if (local344 > arg1.anInt384 - arg1.anInt387 - arg1.anInt383) {
															local344 = arg1.anInt384 - arg1.anInt387 - arg1.anInt383;
														}
														arg1.anInt383 += local344;
														this.anInt922 -= local344;
													}
												} else if (this.anInt983 != 0 && this.anInt982 == local157 && this.anInt981 == local77.anInt385) {
													local265.method362(local174, local183);
												} else {
													local265.method360(local174, local183);
												}
												if (local265.anInt528 == 33 || local77.anIntArray130[local157] != 1) {
													local344 = local77.anIntArray130[local157];
													this.aClass2_Sub1_Sub1_Sub4_2.method448(method716(local344), local174 + local207 + 1, 0, local183 + local209 + 10);
													this.aClass2_Sub1_Sub1_Sub4_2.method448(method716(local344), local174 + local207, 16776960, local183 + local209 + 9);
												}
											}
										}
									} else if (local77.aClass2_Sub1_Sub1_Sub3Array1 != null && local157 < 20) {
										@Pc(533) Class2_Sub1_Sub1_Sub3 local533 = local77.aClass2_Sub1_Sub1_Sub3Array1[local157];
										if (local533 != null) {
											local533.method360(local174, local183);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt397 == 3) {
							@Pc(558) boolean local558 = false;
							if (this.anInt873 == local77.anInt385 || this.anInt824 == local77.anInt385 || this.anInt984 == local77.anInt385) {
								local558 = true;
							}
							if (this.method670(local77)) {
								local157 = local77.anInt373;
								if (local558 && local77.anInt400 != 0) {
									local157 = local77.anInt400;
								}
							} else {
								local157 = local77.anInt374;
								if (local558 && local77.anInt378 != 0) {
									local157 = local77.anInt378;
								}
							}
							if (local77.aByte17 == 0) {
								if (local77.aBoolean143) {
									Class2_Sub1_Sub1.method436(local82, local87, this.anInt967, local157, local77.anInt409, local77.anInt387);
								} else {
									Class2_Sub1_Sub1.method437(local82, local77.anInt409, local157, local77.anInt387, local87);
								}
							} else if (local77.aBoolean143) {
								Class2_Sub1_Sub1.method435(local82, 256 - (local77.aByte17 & 0xFF), local77.anInt409, local77.anInt387, local157, local87);
							} else {
								Class2_Sub1_Sub1.method438(local82, local77.anInt387, 256 - (local77.aByte17 & 0xFF), local77.anInt409, local157, local87);
							}
						} else {
							@Pc(677) Class2_Sub1_Sub1_Sub4 local677;
							@Pc(954) String local954;
							if (local77.anInt397 == 4) {
								local677 = local77.aClass2_Sub1_Sub1_Sub4_1;
								@Pc(680) String local680 = local77.aString10;
								@Pc(682) boolean local682 = false;
								if (this.anInt873 == local77.anInt385 || this.anInt824 == local77.anInt385 || this.anInt984 == local77.anInt385) {
									local682 = true;
								}
								if (this.method670(local77)) {
									local159 = local77.anInt373;
									if (local682 && local77.anInt400 != 0) {
										local159 = local77.anInt400;
									}
									if (local77.aString8.length() > 0) {
										local680 = local77.aString8;
									}
								} else {
									local159 = local77.anInt374;
									if (local682 && local77.anInt378 != 0) {
										local159 = local77.anInt378;
									}
								}
								if (local77.anInt395 == 6 && this.aBoolean281) {
									local680 = "Please wait...";
									local159 = local77.anInt374;
								}
								if (Class2_Sub1_Sub1.anInt637 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local677.anInt647;
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
																			local680 = local680.substring(0, local209) + this.method663(this.method722(4, local77)) + local680.substring(local209 + 2);
																		}
																	}
																	local680 = local680.substring(0, local209) + this.method663(this.method722(3, local77)) + local680.substring(local209 + 2);
																}
															}
															local680 = local680.substring(0, local209) + this.method663(this.method722(2, local77)) + local680.substring(local209 + 2);
														}
													}
													local680 = local680.substring(0, local209) + this.method663(this.method722(1, local77)) + local680.substring(local209 + 2);
												}
											}
											local680 = local680.substring(0, local209) + this.method663(this.method722(0, local77)) + local680.substring(local209 + 2);
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
									if (local77.aBoolean150) {
										local677.method445(local954, local159, local77.aBoolean152, local82 + local77.anInt409 / 2, local207);
									} else {
										local677.method452(local77.aBoolean152, local82, local159, local207, local954);
									}
									local207 += local677.anInt647;
								}
							} else if (local77.anInt397 == 5) {
								@Pc(1015) Class2_Sub1_Sub1_Sub3 local1015;
								if (this.method670(local77)) {
									local1015 = local77.aClass2_Sub1_Sub1_Sub3_1;
								} else {
									local1015 = local77.aClass2_Sub1_Sub1_Sub3_2;
								}
								if (local1015 != null) {
									local1015.method360(local82, local87);
								}
							} else if (local77.anInt397 == 6) {
								local157 = Class2_Sub1_Sub1_Sub2.anInt335;
								local159 = Class2_Sub1_Sub1_Sub2.anInt336;
								Class2_Sub1_Sub1_Sub2.anInt335 = local82 + local77.anInt409 / 2;
								Class2_Sub1_Sub1_Sub2.anInt336 = local87 + local77.anInt387 / 2;
								local163 = Class2_Sub1_Sub1_Sub2.anIntArray117[local77.anInt402] * local77.anInt401 >> 16;
								local174 = Class2_Sub1_Sub1_Sub2.anIntArray118[local77.anInt402] * local77.anInt401 >> 16;
								@Pc(1076) boolean local1076 = this.method670(local77);
								if (local1076) {
									local207 = local77.anInt389;
								} else {
									local207 = local77.anInt388;
								}
								@Pc(1096) Class2_Sub1_Sub2_Sub2 local1096;
								if (local207 == -1) {
									local1096 = local77.method294(-1, local1076, -1);
								} else {
									@Pc(1102) Class39 local1102 = Class39.aClass39Array1[local207];
									local1096 = local77.method294(local1102.anIntArray167[local77.anInt381], local1076, local1102.anIntArray166[local77.anInt381]);
								}
								if (local1096 != null) {
									local1096.method172(local77.anInt403, 0, local77.anInt402, 0, local163, local174);
								}
								Class2_Sub1_Sub1_Sub2.anInt335 = local157;
								Class2_Sub1_Sub1_Sub2.anInt336 = local159;
							} else {
								if (local77.anInt397 == 7) {
									local677 = local77.aClass2_Sub1_Sub1_Sub4_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt387; local163++) {
										for (local174 = 0; local174 < local77.anInt409; local174++) {
											if (local77.anIntArray138[local159] > 0) {
												@Pc(1166) Class38 local1166 = Class38.method391(local77.anIntArray138[local159] - 1);
												@Pc(1170) String local1170 = String.valueOf(local1166.aString13);
												if (local1166.aBoolean186 || local77.anIntArray130[local159] != 1) {
													local1170 = local1170 + " x" + method613(local77.anIntArray130[local159]);
												}
												local209 = local82 + local174 * (local77.anInt377 + 115);
												local216 = local87 + local163 * (local77.anInt375 + 12);
												if (local77.aBoolean150) {
													local677.method445(local1170, local77.anInt374, local77.aBoolean152, local209 + local77.anInt409 / 2, local216);
												} else {
													local677.method452(local77.aBoolean152, local209, local77.anInt374, local216, local1170);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt397 == 8 && (this.anInt886 == local77.anInt385 || this.anInt826 == local77.anInt385 || this.anInt965 == local77.anInt385) && this.anInt1036 == 100) {
									local157 = 0;
									local159 = 0;
									@Pc(1284) Class2_Sub1_Sub1_Sub4 local1284 = this.aClass2_Sub1_Sub1_Sub4_3;
									@Pc(1287) String local1287 = local77.aString10;
									while (local1287.length() > 0) {
										local207 = local1287.indexOf("\\n");
										if (local207 == -1) {
											local954 = local1287;
											local1287 = "";
										} else {
											local954 = local1287.substring(0, local207);
											local1287 = local1287.substring(local207 + 2);
										}
										local209 = local1284.method446(local954);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1284.anInt647 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt409 - local157 - 5;
									local209 = local87 + local77.anInt387 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg0 + arg1.anInt409) {
										local207 = arg0 + arg1.anInt409 - local157;
									}
									if (local209 + local159 > arg2 + arg1.anInt387) {
										local209 = arg2 + arg1.anInt387 - local159;
									}
									Class2_Sub1_Sub1.method436(local207, local209, this.anInt967, 16777120, local157, local159);
									Class2_Sub1_Sub1.method437(local207, local157, 0, local159, local209);
									local1287 = local77.aString10;
									local216 = local209 + local1284.anInt647 + 2;
									while (local1287.length() > 0) {
										local241 = local1287.indexOf("\\n");
										if (local241 == -1) {
											local954 = local1287;
											local1287 = "";
										} else {
											local954 = local1287.substring(0, local241);
											local1287 = local1287.substring(local241 + 2);
										}
										local1284.method452(false, local207 + 3, 0, local216, local954);
										local216 += local1284.anInt647 + 1;
									}
								}
							}
						}
					}
				}
				Class2_Sub1_Sub1.method433(local33, local31, local35, local29);
			}
		} catch (@Pc(1480) RuntimeException local1480) {
			signlink.reporterror("63497, " + arg0 + ", " + arg1 + ", " + 27 + ", " + arg2 + ", " + arg3 + ", " + local1480.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IJ)V")
	private void method726(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt892 >= 100 && this.anInt999 != 1) {
					this.method626("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else if (this.anInt892 >= 200) {
					this.method626("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else {
					@Pc(38) String local38 = Class40.method409(Class40.method406(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt892; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method626(local38 + " is already on your friend list", 0, "");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt1011; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method626("Please remove " + local38 + " from your ignore list first", 0, "");
							return;
						}
					}
					if (!local38.equals(aClass2_Sub1_Sub2_Sub3_Sub2_1.aString15)) {
						this.aStringArray8[this.anInt892] = local38;
						this.aLongArray4[this.anInt892] = arg0;
						this.anIntArray231[this.anInt892] = 0;
						this.anInt892++;
						this.aBoolean256 = true;
						this.anInt975 += 0;
						this.aClass2_Sub1_Sub3_7.method86(217, 533);
						this.aClass2_Sub1_Sub3_7.method93(arg0);
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("6078, " + 0 + ", " + arg0 + ", " + local150.toString());
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

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
				if (this.aStringArray14[local5] != null) {
					@Pc(17) int local17 = this.anIntArray270[local5];
					@Pc(28) int local28 = this.anInt912 + 70 + 4 - local3 * 14;
					if (local28 < -20) {
						break;
					}
					@Pc(36) String local36 = this.aStringArray13[local5];
					if (local36 != null && local36.startsWith("@cr1@")) {
						local36 = local36.substring(5);
					}
					if (local36 != null && local36.startsWith("@cr2@")) {
						local36 = local36.substring(5);
					}
					if (local17 == 0) {
						local3++;
					}
					if ((local17 == 1 || local17 == 2) && (local17 == 1 || this.anInt941 == 0 || this.anInt941 == 1 && this.method651(local36))) {
						if (arg0 > local28 - 14 && arg0 <= local28 && !local36.equals(aClass2_Sub1_Sub2_Sub3_Sub2_1.aString15)) {
							if (this.anInt942 >= 1) {
								this.aStringArray12[this.anInt937] = "Report abuse @whi@" + local36;
								this.anIntArray266[this.anInt937] = 265;
								this.anInt937++;
							}
							this.aStringArray12[this.anInt937] = "Add ignore @whi@" + local36;
							this.anIntArray266[this.anInt937] = 723;
							this.anInt937++;
							this.aStringArray12[this.anInt937] = "Add friend @whi@" + local36;
							this.anIntArray266[this.anInt937] = 66;
							this.anInt937++;
						}
						local3++;
					}
					if ((local17 == 3 || local17 == 7) && this.anInt841 == 0 && (local17 == 7 || this.anInt816 == 0 || this.anInt816 == 1 && this.method651(local36))) {
						if (arg0 > local28 - 14 && arg0 <= local28) {
							if (this.anInt942 >= 1) {
								this.aStringArray12[this.anInt937] = "Report abuse @whi@" + local36;
								this.anIntArray266[this.anInt937] = 265;
								this.anInt937++;
							}
							this.aStringArray12[this.anInt937] = "Add ignore @whi@" + local36;
							this.anIntArray266[this.anInt937] = 723;
							this.anInt937++;
							this.aStringArray12[this.anInt937] = "Add friend @whi@" + local36;
							this.anIntArray266[this.anInt937] = 66;
							this.anInt937++;
						}
						local3++;
					}
					if (local17 == 4 && (this.anInt877 == 0 || this.anInt877 == 1 && this.method651(local36))) {
						if (arg0 > local28 - 14 && arg0 <= local28) {
							this.aStringArray12[this.anInt937] = "Accept trade @whi@" + local36;
							this.anIntArray266[this.anInt937] = 301;
							this.anInt937++;
						}
						local3++;
					}
					if ((local17 == 5 || local17 == 6) && this.anInt841 == 0 && this.anInt816 < 2) {
						local3++;
					}
					if (local17 == 8 && (this.anInt877 == 0 || this.anInt877 == 1 && this.method651(local36))) {
						if (arg0 > local28 - 14 && arg0 <= local28) {
							this.aStringArray12[this.anInt937] = "Accept challenge @whi@" + local36;
							this.anIntArray266[this.anInt937] = 769;
							this.anInt937++;
						}
						local3++;
					}
				}
			}
		} catch (@Pc(411) RuntimeException local411) {
			signlink.reporterror("2694, " + arg0 + ", " + -16295 + ", " + arg1 + ", " + local411.toString());
			throw new RuntimeException();
		}
	}
}
