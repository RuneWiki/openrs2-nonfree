import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
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

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private static int anInt148;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private static int anInt164;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private static int anInt178;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private static int anInt185;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private static int anInt187;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private static int anInt195;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private static int anInt213;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private static int anInt218;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private static int anInt221;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Z")
	private static boolean aBoolean55;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private static int anInt227;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private static int anInt274;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private static int anInt277;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private static int anInt284;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	public static int anInt295;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private static int anInt305;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private static int anInt315;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private static int anInt317;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "B")
	private static byte aByte10 = 6;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private static int[] anIntArray39 = new int[99];

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private static int anInt191;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private static int anInt220;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Z")
	private static boolean aBoolean54;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	public static final int[] anIntArray50;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Z")
	private static boolean aBoolean59;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Z")
	private static boolean aBoolean65;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private static int anInt285;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private static int anInt324;

	@OriginalMember(owner = "client!client", name = "D", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!client", name = "G", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!client", name = "H", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!qb;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!qb;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!qb;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!qb;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!qb;")
	private Class32 aClass32_7;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!qb;")
	private Class32 aClass32_8;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!qb;")
	private Class32 aClass32_9;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!qb;")
	private Class32 aClass32_10;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!qb;")
	private Class32 aClass32_11;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!r;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt168;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!qb;")
	private Class32 aClass32_12;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!qb;")
	private Class32 aClass32_13;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!qb;")
	private Class32 aClass32_14;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!ub;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Lclient!qb;")
	private Class32 aClass32_15;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Lclient!qb;")
	private Class32 aClass32_16;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!qb;")
	private Class32 aClass32_17;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!qb;")
	private Class32 aClass32_18;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!qb;")
	private Class32 aClass32_19;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!qb;")
	private Class32 aClass32_20;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!qb;")
	private Class32 aClass32_21;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!qb;")
	private Class32 aClass32_22;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Lclient!qb;")
	private Class32 aClass32_23;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!qb;")
	private Class32 aClass32_24;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!tb;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Lclient!qb;")
	private Class32 aClass32_25;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!qb;")
	private Class32 aClass32_26;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!qb;")
	private Class32 aClass32_27;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!qb;")
	private Class32 aClass32_28;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!d;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Lclient!z;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "C", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!client", name = "E", descriptor = "I")
	private int anInt139 = 2;

	@OriginalMember(owner = "client!client", name = "F", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt146 = -40687;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt147 = -710;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!ob;")
	private Class28 aClass28_1 = new Class28((byte) 3);

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[B")
	private byte[] aByteArray4 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt155 = 2048;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt156 = 2047;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array1 = new Class1_Sub1_Sub3_Sub2[this.anInt155];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray30 = new int[this.anInt155];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	private int[] anIntArray31 = new int[this.anInt155];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[Lclient!kb;")
	private Class1_Sub3_Sub3[] aClass1_Sub3_Sub3Array1 = new Class1_Sub3_Sub3[this.anInt155];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt160 = 2;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!ob;")
	private Class28 aClass28_2 = new Class28((byte) 3);

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt161 = -1;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Lclient!ec;")
	private Class9[] aClass9Array1 = new Class9[4];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	private int[] anIntArray32 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray33 = new int[5];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[Z")
	private boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt170 = -34388;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
	private int[] anIntArray34 = new int[100];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array3 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "B")
	private byte aByte9 = 106;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray35 = new int[2000];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt180 = -1;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[Lclient!y;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array1 = new Class1_Sub1_Sub3_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[I")
	private int[] anIntArray36 = new int[8192];

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_4 = Class1_Sub3_Sub3.method359();

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private final int[] anIntArray37 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[I")
	private int[] anIntArray38 = new int[5];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array1 = new Class1_Sub3_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt188 = 978;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array4 = new Class1_Sub3_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt193 = 78;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt203 = -1;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt204 = -1;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!ob;")
	private Class28 aClass28_3 = new Class28((byte) 3);

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
	private int[] anIntArray42 = new int[50];

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt216 = -1;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray43 = new int[100];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt219 = 2;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[[[Lclient!ob;")
	private Class28[][][] aClass28ArrayArrayArray1 = new Class28[4][104][104];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt229 = 128;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private int[] anIntArray51 = new int[33];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!ob;")
	private Class28 aClass28_4 = new Class28((byte) 3);

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[I")
	private int[] anIntArray52 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt238 = -73;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "B")
	private byte aByte11 = 1;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray53 = new int[50];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
	private int[] anIntArray54 = new int[256];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray55 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt240 = -1;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[I")
	private int[] anIntArray56 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[I")
	private int[] anIntArray57 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt243 = -1;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "B")
	private byte aByte12 = 3;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[I")
	private int[] anIntArray58 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt254 = -710;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt255 = 5063219;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt256 = -1;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt258 = 2301979;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt264 = 4;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt266 = 1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array3 = new Class1_Sub3_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt270 = 7759444;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "B")
	private byte aByte13 = 5;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_5 = Class1_Sub3_Sub3.method359();

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt272 = 4;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt276 = 50;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[I")
	private int[] anIntArray62 = new int[this.anInt276];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
	private int[] anIntArray63 = new int[this.anInt276];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[I")
	private int[] anIntArray64 = new int[this.anInt276];

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	private int[] anIntArray65 = new int[this.anInt276];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray66 = new int[this.anInt276];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
	private int[] anIntArray67 = new int[this.anInt276];

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
	private int[] anIntArray68 = new int[this.anInt276];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[this.anInt276];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
	private int[] anIntArray69 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt278 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[I")
	private int[] anIntArray70 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!ob;")
	private Class28 aClass28_5 = new Class28((byte) 3);

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[I")
	private int[] anIntArray71 = new int[50];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt282 = 3;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private int[] anIntArray73 = new int[5];

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
	private int[] anIntArray74 = new int[50];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt293 = -1;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private int[] anIntArray75 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[I")
	private int[] anIntArray76 = new int[4000];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array5 = new Class1_Sub3_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray77 = new int[9];

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray78 = new int[50];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private final int anInt299 = 100;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray79 = new int[100];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray80 = new int[7];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!hc;")
	private Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt303 = -1;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt304 = -1;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
	private int[] anIntArray81 = new int[151];

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
	private int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_6 = Class1_Sub3_Sub3.method359();

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt308 = 3353893;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	private int[] anIntArray83 = new int[33];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array6 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "B")
	private byte aByte14 = 8;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array7 = new Class1_Sub3_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "[I")
	private int[] anIntArray84 = new int[50];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray85 = new int[500];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
	private int[] anIntArray86 = new int[500];

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[I")
	private int[] anIntArray87 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
	private int[] anIntArray88 = new int[500];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt323 = 49437;

	static {
		@Pc(266) int local266 = 0;
		for (@Pc(268) int local268 = 0; local268 < 99; local268++) {
			@Pc(273) int local273 = local268 + 1;
			@Pc(286) int local286 = (int) ((double) local273 + Math.pow(2.0D, (double) local273 / 7.0D) * 300.0D);
			local266 += local286;
			anIntArray39[local268] = local266 / 4;
		}
		anInt191 = -359;
		anInt220 = 10;
		aBoolean54 = true;
		anIntArray50 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBoolean59 = true;
		aBoolean65 = true;
		anInt285 = 724;
		aString16 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt324 = 171;
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private static void method116() {
		try {
			Class33.aBoolean167 = false;
			Class1_Sub3_Sub2_Sub1.aBoolean107 = false;
			aBoolean55 = false;
			Class4.aBoolean27 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("59663, " + -461 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method136(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("61138, " + arg0 + ", " + 9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 204);
			if (arg0.length == 4) {
				anInt220 = Integer.parseInt(arg0[0]);
				anInt221 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method175();
				} else if (arg0[2].equals("highmem")) {
					method116();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean54 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean54 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(82) client local82 = new client();
				local82.method62();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
			}
		} catch (@Pc(89) Exception local89) {
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private static void method175() {
		try {
			Class33.aBoolean167 = true;
			Class1_Sub3_Sub2_Sub1.aBoolean107 = true;
			aBoolean55 = true;
			Class4.aBoolean27 = true;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("25068, " + 9 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("7611, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("7203, " + arg0 + ", " + arg1 + ", " + -29344 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!hc;)V")
	private void method75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		try {
			if (arg5.anInt451 == 0 && arg5.anIntArray153 != null && !arg5.aBoolean118 && (arg2 >= arg4 && arg0 >= arg1 && arg2 <= arg4 + arg5.anInt454 && arg0 <= arg1 + arg5.anInt455)) {
				@Pc(41) int local41 = arg5.anIntArray153.length;
				for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
					@Pc(52) int local52 = arg5.anIntArray154[local43] + arg4;
					@Pc(61) int local61 = arg5.anIntArray155[local43] + arg1 - arg3;
					@Pc(68) Class15 local68 = Class15.aClass15Array1[arg5.anIntArray153[local43]];
					@Pc(73) int local73 = local52 + local68.anInt456;
					@Pc(78) int local78 = local61 + local68.anInt457;
					if ((local68.anInt458 >= 0 || local68.anInt466 != 0) && arg2 >= local73 && arg0 >= local78 && arg2 < local73 + local68.anInt454 && arg0 < local78 + local68.anInt455) {
						if (local68.anInt458 >= 0) {
							this.anInt192 = local68.anInt458;
						} else {
							this.anInt192 = local68.anInt449;
						}
					}
					if (local68.anInt451 == 0) {
						this.method75(arg0, local78, arg2, local68.anInt460, local73, local68);
						if (local68.anInt459 > local68.anInt455) {
							this.method179(true, arg0, local68, local78, local73 + local68.anInt454, local68.anInt459, local68.anInt455, arg2);
						}
					} else {
						if (local68.anInt452 == 1 && arg2 >= local73 && arg0 >= local78 && arg2 < local73 + local68.anInt454 && arg0 < local78 + local68.anInt455) {
							this.aStringArray8[this.anInt162] = local68.aString23;
							this.anIntArray87[this.anInt162] = 238;
							this.anIntArray86[this.anInt162] = local68.anInt449;
							this.anInt162++;
						}
						if (local68.anInt452 == 2 && this.anInt167 == 0 && arg2 >= local73 && arg0 >= local78 && arg2 < local73 + local68.anInt454 && arg0 < local78 + local68.anInt455) {
							@Pc(227) String local227 = local68.aString21;
							if (local227.indexOf(" ") != -1) {
								local227 = local227.substring(0, local227.indexOf(" "));
							}
							this.aStringArray8[this.anInt162] = local227 + " @gre@" + local68.aString22;
							this.anIntArray87[this.anInt162] = 409;
							this.anIntArray86[this.anInt162] = local68.anInt449;
							this.anInt162++;
						}
						if (local68.anInt452 == 3 && arg2 >= local73 && arg0 >= local78 && arg2 < local73 + local68.anInt454 && arg0 < local78 + local68.anInt455) {
							this.aStringArray8[this.anInt162] = "Close";
							this.anIntArray87[this.anInt162] = 975;
							this.anIntArray86[this.anInt162] = local68.anInt449;
							this.anInt162++;
						}
						if (local68.anInt452 == 4 && arg2 >= local73 && arg0 >= local78 && arg2 < local73 + local68.anInt454 && arg0 < local78 + local68.anInt455) {
							this.aStringArray8[this.anInt162] = local68.aString23;
							this.anIntArray87[this.anInt162] = 261;
							this.anIntArray86[this.anInt162] = local68.anInt449;
							this.anInt162++;
						}
						if (local68.anInt452 == 5 && arg2 >= local73 && arg0 >= local78 && arg2 < local73 + local68.anInt454 && arg0 < local78 + local68.anInt455) {
							this.aStringArray8[this.anInt162] = local68.aString23;
							this.anIntArray87[this.anInt162] = 779;
							this.anIntArray86[this.anInt162] = local68.anInt449;
							this.anInt162++;
						}
						if (local68.anInt452 == 6 && !this.aBoolean46 && arg2 >= local73 && arg0 >= local78 && arg2 < local73 + local68.anInt454 && arg0 < local78 + local68.anInt455) {
							this.aStringArray8[this.anInt162] = local68.aString23;
							this.anIntArray87[this.anInt162] = 785;
							this.anIntArray86[this.anInt162] = local68.anInt449;
							this.anInt162++;
						}
						if (local68.anInt451 == 2) {
							@Pc(475) int local475 = 0;
							for (@Pc(477) int local477 = 0; local477 < local68.anInt455; local477++) {
								for (@Pc(481) int local481 = 0; local481 < local68.anInt454; local481++) {
									@Pc(492) int local492 = local73 + local481 * (local68.anInt462 + 32);
									@Pc(501) int local501 = local78 + local477 * (local68.anInt463 + 32);
									if (local475 < 20) {
										local492 += local68.anIntArray156[local475];
										local501 += local68.anIntArray157[local475];
									}
									if (arg2 >= local492 && arg0 >= local501 && arg2 < local492 + 32 && arg0 < local501 + 32) {
										this.anInt244 = local475;
										this.anInt245 = local68.anInt449;
										if (local68.anIntArray149[local475] > 0) {
											@Pc(554) Class5 local554 = Class5.method54(local68.anIntArray149[local475] - 1);
											if (this.anInt171 == 1 && local68.aBoolean121) {
												if (local68.anInt449 != this.anInt173 || local475 != this.anInt172) {
													this.aStringArray8[this.anInt162] = "Use " + this.aString7 + " with @lre@" + local554.aString3;
													this.anIntArray87[this.anInt162] = 278;
													this.anIntArray88[this.anInt162] = local554.anInt99;
													this.anIntArray85[this.anInt162] = local475;
													this.anIntArray86[this.anInt162] = local68.anInt449;
													this.anInt162++;
												}
											} else if (this.anInt167 != 1 || !local68.aBoolean121) {
												@Pc(691) int local691;
												if (local68.aBoolean121) {
													for (local691 = 4; local691 >= 3; local691--) {
														if (local554.aStringArray4 != null && local554.aStringArray4[local691] != null) {
															this.aStringArray8[this.anInt162] = local554.aStringArray4[local691] + " @lre@" + local554.aString3;
															if (local691 == 3) {
																this.anIntArray87[this.anInt162] = 274;
															}
															if (local691 == 4) {
																this.anIntArray87[this.anInt162] = 618;
															}
															this.anIntArray88[this.anInt162] = local554.anInt99;
															this.anIntArray85[this.anInt162] = local475;
															this.anIntArray86[this.anInt162] = local68.anInt449;
															this.anInt162++;
														} else if (local691 == 4) {
															this.aStringArray8[this.anInt162] = "Drop @lre@" + local554.aString3;
															this.anIntArray87[this.anInt162] = 618;
															this.anIntArray88[this.anInt162] = local554.anInt99;
															this.anIntArray85[this.anInt162] = local475;
															this.anIntArray86[this.anInt162] = local68.anInt449;
															this.anInt162++;
														}
													}
												}
												if (local68.aBoolean122) {
													this.aStringArray8[this.anInt162] = "Use @lre@" + local554.aString3;
													this.anIntArray87[this.anInt162] = 215;
													this.anIntArray88[this.anInt162] = local554.anInt99;
													this.anIntArray85[this.anInt162] = local475;
													this.anIntArray86[this.anInt162] = local68.anInt449;
													this.anInt162++;
												}
												if (local68.aBoolean121 && local554.aStringArray4 != null) {
													for (local691 = 2; local691 >= 0; local691--) {
														if (local554.aStringArray4[local691] != null) {
															this.aStringArray8[this.anInt162] = local554.aStringArray4[local691] + " @lre@" + local554.aString3;
															if (local691 == 0) {
																this.anIntArray87[this.anInt162] = 382;
															}
															if (local691 == 1) {
																this.anIntArray87[this.anInt162] = 635;
															}
															if (local691 == 2) {
																this.anIntArray87[this.anInt162] = 939;
															}
															this.anIntArray88[this.anInt162] = local554.anInt99;
															this.anIntArray85[this.anInt162] = local475;
															this.anIntArray86[this.anInt162] = local68.anInt449;
															this.anInt162++;
														}
													}
												}
												if (local68.aStringArray10 != null) {
													for (local691 = 4; local691 >= 0; local691--) {
														if (local68.aStringArray10[local691] != null) {
															this.aStringArray8[this.anInt162] = local68.aStringArray10[local691] + " @lre@" + local554.aString3;
															if (local691 == 0) {
																this.anIntArray87[this.anInt162] = 71;
															}
															if (local691 == 1) {
																this.anIntArray87[this.anInt162] = 897;
															}
															if (local691 == 2) {
																this.anIntArray87[this.anInt162] = 500;
															}
															if (local691 == 3) {
																this.anIntArray87[this.anInt162] = 837;
															}
															if (local691 == 4) {
																this.anIntArray87[this.anInt162] = 460;
															}
															this.anIntArray88[this.anInt162] = local554.anInt99;
															this.anIntArray85[this.anInt162] = local475;
															this.anIntArray86[this.anInt162] = local68.anInt449;
															this.anInt162++;
														}
													}
												}
												this.aStringArray8[this.anInt162] = "Examine @lre@" + local554.aString3;
												this.anIntArray87[this.anInt162] = 1654;
												this.anIntArray88[this.anInt162] = local554.anInt99;
												this.anIntArray86[this.anInt162] = local68.anIntArray150[local475];
												this.anInt162++;
											} else if ((this.anInt169 & 0x10) == 16) {
												this.aStringArray8[this.anInt162] = this.aString6 + " @lre@" + local554.aString3;
												this.anIntArray87[this.anInt162] = 45;
												this.anIntArray88[this.anInt162] = local554.anInt99;
												this.anIntArray85[this.anInt162] = local475;
												this.anIntArray86[this.anInt162] = local68.anInt449;
												this.anInt162++;
											}
										}
									}
									local475++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1117) RuntimeException local1117) {
			signlink.reporterror("70923, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method76() {
		try {
			this.aBoolean53 = false;
			while (this.aBoolean69) {
				this.aBoolean53 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub3_Sub2_Sub3_9 = null;
			this.aClass1_Sub3_Sub2_Sub3_10 = null;
			if (this.aByte12 != 3) {
				this.aClass28ArrayArrayArray1 = null;
			}
			this.aClass1_Sub3_Sub2_Sub3Array2 = null;
			this.anIntArray46 = null;
			this.anIntArray47 = null;
			this.anIntArray48 = null;
			this.anIntArray49 = null;
			this.anIntArray44 = null;
			this.anIntArray45 = null;
			this.anIntArray40 = null;
			this.anIntArray41 = null;
			this.aClass1_Sub3_Sub2_Sub2_4 = null;
			this.aClass1_Sub3_Sub2_Sub2_5 = null;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("30698, " + 3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method77() {
		try {
			Class2.aClass35_1.method509();
			Class2.aClass35_2.method509();
			Class3.aClass35_3.method509();
			Class5.aClass35_4.method509();
			Class5.aClass35_5.method509();
			Class1_Sub1_Sub3_Sub2.aClass35_9.method509();
			Class21.aClass35_8.method509();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("3207, " + 8 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method78(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg1;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub3_Sub1.anIntArray124[local5];
				local27 = Class1_Sub3_Sub1.anIntArray125[local5];
				local37 = local27 * 0 - arg1 * local23 >> 16;
				local17 = local23 * 0 + arg1 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub3_Sub1.anIntArray124[local11];
				local27 = Class1_Sub3_Sub1.anIntArray125[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt140 = arg2 - local13;
			this.anInt141 = arg3 - local15;
			this.anInt142 = arg0 - local17;
			this.anInt143 = arg5;
			this.anInt144 = arg4;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("79833, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method79(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) Class15 local3 = Class15.aClass15Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray153.length && local3.anIntArray153[local5] != -1; local5++) {
				@Pc(20) Class15 local20 = Class15.aClass15Array1[local3.anIntArray153[local5]];
				if (local20.anInt451 == 1) {
					this.method79(local20.anInt449);
				}
				local20.anInt447 = 0;
				local20.anInt448 = 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("33962, " + 125 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class28 local9 = this.aClass28ArrayArrayArray1[this.anInt269][arg0][arg1];
		if (local9 == null) {
			this.aClass33_1.method473(this.anInt269, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub7 local23 = null;
		@Pc(27) Class1_Sub7 local27;
		@Pc(35) int local35;
		for (local27 = (Class1_Sub7) local9.method437(); local27 != null; local27 = (Class1_Sub7) local9.method439(this.aByte14)) {
			@Pc(32) Class5 local32 = Class5.method54(local27.anInt753);
			local35 = local32.anInt108;
			if (local32.aBoolean37) {
				local35 *= local27.anInt754 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method435(local23);
		@Pc(66) int local66 = -1;
		local35 = -1;
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		for (local27 = (Class1_Sub7) local9.method437(); local27 != null; local27 = (Class1_Sub7) local9.method439(this.aByte14)) {
			if (local27.anInt753 != local23.anInt753 && local66 == -1) {
				local66 = local27.anInt753;
				local70 = local27.anInt754;
			}
			if (local27.anInt753 != local23.anInt753 && local27.anInt753 != local66 && local35 == -1) {
				local35 = local27.anInt753;
				local72 = local27.anInt754;
			}
		}
		@Pc(120) Class1_Sub3_Sub1 local120 = null;
		if (local66 != -1) {
			local120 = Class5.method54(local66).method58(local70);
		}
		@Pc(130) Class1_Sub3_Sub1 local130 = null;
		if (local35 != -1) {
			local130 = Class5.method54(local35).method58(local72);
		}
		@Pc(146) int local146 = arg0 + (arg1 << 7) + 1610612736;
		@Pc(150) Class5 local150 = Class5.method54(local23.anInt753);
		this.aClass33_1.method455(this.method132(this.anInt269, arg0 * 128 + 64, arg1 * 128 + 64), arg1, (byte) 4, local130, this.anInt269, local120, local146, arg0, local150.method58(local23.anInt754));
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method81(@OriginalArg(0) boolean arg0) {
		try {
			try {
				this.anInt278 = -1;
				this.aClass28_5.method441();
				this.aClass28_1.method441();
				this.aClass28_4.method441();
				this.aClass28_3.method441();
				Class1_Sub3_Sub2_Sub1.method277();
				this.method77();
				this.aClass33_1.method448((byte) 9);
				for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
					this.aClass9Array1[local27].method237();
				}
				System.gc();
				@Pc(51) Class4 local51 = new Class4(104, this.aByteArrayArrayArray7, this.anIntArrayArrayArray3, 104, 27245);
				@Pc(54) byte[] local54 = new byte[100000];
				@Pc(58) int local58 = this.aByteArrayArray1.length;
				Class4.aBoolean27 = Class33.aBoolean167;
				@Pc(71) int local71;
				@Pc(78) int local78;
				for (@Pc(62) int local62 = 0; local62 < local58; local62++) {
					local71 = this.anIntArray72[local62] >> 8;
					local78 = this.anIntArray72[local62] & 0xFF;
					if (local71 == 33 && local78 >= 71 && local78 <= 73) {
						Class4.aBoolean27 = false;
					}
				}
				if (Class4.aBoolean27) {
					this.aClass33_1.method449(474, this.anInt269);
				} else {
					this.aClass33_1.method449(474, 0);
				}
				this.aClass1_Sub3_Sub3_4.method361(186);
				@Pc(155) int local155;
				for (local71 = 0; local71 < local58; local71++) {
					local78 = (this.anIntArray72[local71] >> 8) * 64 - this.anInt150;
					@Pc(141) int local141 = (this.anIntArray72[local71] & 0xFF) * 64 - this.anInt151;
					@Pc(146) byte[] local146 = this.aByteArrayArray1[local71];
					if (local146 != null) {
						local155 = (new Class1_Sub3_Sub3(local146, aBoolean59)).method377();
						Class34.method499(local54, local155, local146, local146.length - 4, 4);
						local51.method37((byte) 3, local54, local141, (this.anInt252 - 6) * 8, (this.anInt251 - 6) * 8, local78);
					} else if (this.anInt252 < 800) {
						local51.method36(local141, local78, 595);
					}
				}
				this.aClass1_Sub3_Sub3_4.method361(186);
				@Pc(223) int local223;
				for (local78 = 0; local78 < local58; local78++) {
					@Pc(214) byte[] local214 = this.aByteArrayArray2[local78];
					if (local214 != null) {
						local223 = (new Class1_Sub3_Sub3(local214, aBoolean59)).method377();
						Class34.method499(local54, local223, local214, local214.length - 4, 4);
						local155 = (this.anIntArray72[local78] >> 8) * 64 - this.anInt150;
						@Pc(257) int local257 = (this.anIntArray72[local78] & 0xFF) * 64 - this.anInt151;
						local51.method38(local155, this.aClass9Array1, local54, this.aClass28_1, this.aClass33_1, local257);
					}
				}
				this.aClass1_Sub3_Sub3_4.method361(186);
				local51.method40(this.aClass33_1, this.aClass9Array1);
				this.aClass32_27.method444();
				this.aClass1_Sub3_Sub3_4.method361(186);
				for (@Pc(299) Class1_Sub6 local299 = (Class1_Sub6) this.aClass28_1.method437(); local299 != null; local299 = (Class1_Sub6) this.aClass28_1.method439(this.aByte14)) {
					if ((this.aByteArrayArrayArray7[1][local299.anInt628][local299.anInt629] & 0x2) == 2) {
						local299.anInt626--;
						if (local299.anInt626 < 0) {
							local299.method547();
						}
					}
				}
				for (local223 = 0; local223 < 104; local223++) {
					for (local155 = 0; local155 < 104; local155++) {
						this.method80(local223, local155);
					}
				}
				for (@Pc(360) Class1_Sub4 local360 = (Class1_Sub4) this.aClass28_2.method437(); local360 != null; local360 = (Class1_Sub4) this.aClass28_2.method439(this.aByte14)) {
					this.method168(local360.anInt573, local360.anInt576, local360.anInt572, local360.anInt571, local360.anInt575, local360.anInt574, local360.anInt577);
				}
			} catch (@Pc(390) Exception local390) {
			}
			Class2.aClass35_1.method509();
			if (!arg0) {
				System.gc();
				Class1_Sub3_Sub2_Sub1.method278();
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("82404, " + arg0 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method82(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("54274, " + -48200 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BI)Z")
	private boolean method83(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("50395, " + 79 + ", " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method84() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt183; local3++) {
				@Pc(13) Class1_Sub1_Sub3_Sub1 local13 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray36[local3]];
				@Pc(22) int local22 = (this.anIntArray36[local3] << 14) + 536870912;
				if (local13 != null && local13.method551()) {
					@Pc(33) int local33 = local13.anInt873 >> 7;
					@Pc(38) int local38 = local13.anInt874 >> 7;
					if (local33 >= 0 && local33 < 104 && local38 >= 0 && local38 < 104) {
						if (local13.anInt876 == 1 && (local13.anInt873 & 0x7F) == 64 && (local13.anInt874 & 0x7F) == 64) {
							if (this.anIntArrayArray3[local33][local38] == this.anInt182) {
								continue;
							}
							this.anIntArrayArray3[local33][local38] = this.anInt182;
						}
						this.aClass33_1.method459(local13.anInt875, 775, local13, null, local22, local13.anInt873, local13.aBoolean188, (local13.anInt876 - 1) * 64 + 60, this.anInt269, local13.anInt874, this.method132(this.anInt269, local13.anInt873, local13.anInt874));
					}
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("77603, " + -3 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method85(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class23.aClass23Array1[arg0].anInt586;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray35[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub3_Sub2_Sub1.method283(0.9D);
					}
					if (local12 == 2) {
						Class1_Sub3_Sub2_Sub1.method283(0.8D);
					}
					if (local12 == 3) {
						Class1_Sub3_Sub2_Sub1.method283(0.7D);
					}
					if (local12 == 4) {
						Class1_Sub3_Sub2_Sub1.method283(0.6D);
					}
					Class5.aClass35_5.method509();
					this.aBoolean57 = true;
				}
				if (local4 == 2) {
					if (local12 == 0) {
						this.aBoolean77 = true;
						signlink.anInt738 = 0;
					}
					if (local12 == 1) {
						this.aBoolean77 = true;
						signlink.anInt738 = -400;
					}
					if (local12 == 2) {
						this.aBoolean77 = true;
						signlink.anInt738 = -800;
					}
					if (local12 == 3) {
						this.aBoolean77 = true;
						signlink.anInt738 = -1200;
					}
					if (local12 == 4) {
						this.aBoolean77 = false;
					}
				}
				if (local4 == 3) {
					@Pc(95) boolean local95 = this.aBoolean78;
					@Pc(97) int local97 = signlink.anInt735;
					if (local12 == 0) {
						this.aBoolean78 = true;
						signlink.anInt735 = 0;
					}
					if (local12 == 1) {
						this.aBoolean78 = true;
						signlink.anInt735 = -400;
					}
					if (local12 == 2) {
						this.aBoolean78 = true;
						signlink.anInt735 = -800;
					}
					if (local12 == 3) {
						this.aBoolean78 = true;
						signlink.anInt735 = -1200;
					}
					if (local12 == 4) {
						this.aBoolean78 = false;
					}
					if (this.aBoolean78 != local95 || signlink.anInt735 != local97) {
						if (this.aBoolean78) {
							this.method130(this.aString9);
						} else {
							this.method130("null");
						}
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean44 = true;
						signlink.anInt740 = 0;
					}
					if (local12 == 1) {
						this.aBoolean44 = true;
						signlink.anInt740 = -400;
					}
					if (local12 == 2) {
						this.aBoolean44 = true;
						signlink.anInt740 = -800;
					}
					if (local12 == 3) {
						this.aBoolean44 = true;
						signlink.anInt740 = -1200;
					}
					if (local12 == 4) {
						this.aBoolean44 = false;
					}
				}
				if (local4 == 5) {
					this.anInt268 = local12;
				}
				if (local4 == 6) {
					this.anInt257 = local12;
				}
			}
		} catch (@Pc(209) RuntimeException local209) {
			signlink.reporterror("60162, " + 649 + ", " + arg0 + ", " + local209.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method86() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt157; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt156;
				} else {
					local11 = this.anIntArray30[local3];
				}
				@Pc(23) Class1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null) {
					this.method95(local23, 1);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("36635, " + 22801 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method87(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0 && this.anInt261 == 0) {
				this.aStringArray8[0] = "Cancel";
				this.anIntArray87[0] = 1033;
				this.anInt162 = 1;
				this.anInt192 = 0;
				if (super.anInt130 > 8 && super.anInt131 > 11 && super.anInt130 < 520 && super.anInt131 < 345) {
					if (this.anInt216 == -1) {
						this.method164();
					} else {
						this.method75(super.anInt131, 11, super.anInt130, 0, 8, Class15.aClass15Array1[this.anInt216]);
					}
				}
				if (this.anInt192 != this.anInt186) {
					this.anInt186 = this.anInt192;
				}
				this.anInt192 = 0;
				if (super.anInt130 > 562 && super.anInt131 > 231 && super.anInt130 < 752 && super.anInt131 < 492) {
					if (this.anInt161 != -1) {
						this.method75(super.anInt131, 231, super.anInt130, 0, 562, Class15.aClass15Array1[this.anInt161]);
					} else if (this.anIntArray69[this.anInt282] != -1) {
						this.method75(super.anInt131, 231, super.anInt130, 0, 562, Class15.aClass15Array1[this.anIntArray69[this.anInt282]]);
					}
				}
				if (this.anInt192 != this.anInt300) {
					this.aBoolean52 = true;
					this.anInt300 = this.anInt192;
				}
				this.anInt192 = 0;
				if (super.anInt130 > 22 && super.anInt131 > 375 && super.anInt130 < 501 && super.anInt131 < 471 && this.anInt180 != -1) {
					this.method75(super.anInt131, 375, super.anInt130, 0, 22, Class15.aClass15Array1[this.anInt180]);
				}
				if (this.anInt180 != -1 && this.anInt192 != this.anInt314) {
					this.aBoolean64 = true;
					this.anInt314 = this.anInt192;
				}
				@Pc(202) boolean local202 = false;
				while (!local202) {
					local202 = true;
					for (@Pc(208) int local208 = 0; local208 < this.anInt162 - 1; local208++) {
						if (this.anIntArray87[local208] < 1000 && this.anIntArray87[local208 + 1] > 1000) {
							@Pc(229) String local229 = this.aStringArray8[local208];
							this.aStringArray8[local208] = this.aStringArray8[local208 + 1];
							this.aStringArray8[local208 + 1] = local229;
							@Pc(251) int local251 = this.anIntArray87[local208];
							this.anIntArray87[local208] = this.anIntArray87[local208 + 1];
							this.anIntArray87[local208 + 1] = local251;
							@Pc(273) int local273 = this.anIntArray85[local208];
							this.anIntArray85[local208] = this.anIntArray85[local208 + 1];
							this.anIntArray85[local208 + 1] = local273;
							@Pc(295) int local295 = this.anIntArray86[local208];
							this.anIntArray86[local208] = this.anIntArray86[local208 + 1];
							this.anIntArray86[local208 + 1] = local295;
							@Pc(317) int local317 = this.anIntArray88[local208];
							this.anIntArray88[local208] = this.anIntArray88[local208 + 1];
							this.anIntArray88[local208 + 1] = local317;
							local202 = false;
						}
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("39116, " + arg0 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method88(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt243 != -1) {
				this.aString10 = arg1;
				super.anInt132 = 0;
			}
			if (this.anInt180 == -1) {
				this.aBoolean64 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray43[local20] = this.anIntArray43[local20 - 1];
				this.aStringArray5[local20] = this.aStringArray5[local20 - 1];
				this.aStringArray7[local20] = this.aStringArray7[local20 - 1];
			}
			this.anIntArray43[0] = arg0;
			this.aStringArray5[0] = arg2;
			this.aStringArray7[0] = arg1;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("32124, " + 386 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!kb;)V")
	private void method89(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt540 + 21 < arg0 * 8) {
					@Pc(18) int local18 = arg1.method383(13);
					if (local18 != 8191) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local18] == null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local18] = new Class1_Sub1_Sub3_Sub1();
						}
						@Pc(38) Class1_Sub1_Sub3_Sub1 local38 = this.aClass1_Sub1_Sub3_Sub1Array1[local18];
						this.anIntArray36[this.anInt183++] = local18;
						local38.anInt915 = anInt295;
						local38.aClass3_1 = Class3.method32(arg1.method383(11));
						local38.anInt876 = local38.aClass3_1.aByte5;
						local38.anInt879 = local38.aClass3_1.anInt69;
						local38.anInt880 = local38.aClass3_1.anInt70;
						local38.anInt881 = local38.aClass3_1.anInt71;
						local38.anInt882 = local38.aClass3_1.anInt72;
						local38.anInt877 = local38.aClass3_1.anInt68;
						@Pc(94) int local94 = arg1.method383(5);
						if (local94 > 15) {
							local94 -= 32;
						}
						@Pc(103) int local103 = arg1.method383(5);
						if (local103 > 15) {
							local103 -= 32;
						}
						local38.method549(this.anInt238, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + local94, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + local103, false);
						@Pc(131) int local131 = arg1.method383(1);
						if (local131 == 1) {
							this.anIntArray31[this.anInt158++] = local18;
						}
						continue;
					}
				}
				arg1.method384();
				return;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("46635, " + arg0 + ", " + false + ", " + arg1 + ", " + local152.toString());
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
				return new URL("http://127.0.0.1:" + (anInt221 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method90() {
		try {
			if (this.aClass32_3 == null) {
				super.aClass32_2 = null;
				this.aClass32_28 = null;
				this.aClass32_26 = null;
				this.aClass32_25 = null;
				this.aClass32_27 = null;
				this.aClass32_12 = null;
				this.aClass32_13 = null;
				this.aClass32_14 = null;
				this.aClass32_6 = new Class32(this.method72((byte) 9), 128, 265, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_7 = new Class32(this.method72((byte) 9), 128, 265, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_3 = new Class32(this.method72((byte) 9), 533, 186, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_4 = new Class32(this.method72((byte) 9), 360, 146, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_5 = new Class32(this.method72((byte) 9), 360, 200, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_8 = new Class32(this.method72((byte) 9), 214, 267, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_9 = new Class32(this.method72((byte) 9), 215, 267, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_10 = new Class32(this.method72((byte) 9), 86, 79, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_11 = new Class32(this.method72((byte) 9), 87, 79, true);
				Class1_Sub3_Sub2.method342();
				if (this.aClass39_1 != null) {
					this.method177();
					this.method122();
				}
				this.aBoolean57 = true;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("70102, " + -643 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method91(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) int local8 = this.aClass1_Sub1_Sub3_Sub2_1.anInt873 + this.anInt159;
			@Pc(15) int local15 = this.aClass1_Sub1_Sub3_Sub2_1.anInt874 + this.anInt138;
			if (this.anInt296 - local8 < -500 || this.anInt296 - local8 > 500 || this.anInt297 - local15 < -500 || this.anInt297 - local15 > 500) {
				this.anInt296 = local8;
				this.anInt297 = local15;
			}
			if (this.anInt296 != local8) {
				this.anInt296 += (local8 - this.anInt296) / 16;
			}
			if (this.anInt297 != local15) {
				this.anInt297 += (local15 - this.anInt297) / 16;
			}
			if (super.anIntArray28[1] == 1) {
				this.anInt231 += (-this.anInt231 - 24) / 2;
			} else if (super.anIntArray28[2] == 1) {
				this.anInt231 += (24 - this.anInt231) / 2;
			} else {
				this.anInt231 /= 2;
			}
			if (super.anIntArray28[3] == 1) {
				this.anInt232 += (12 - this.anInt232) / 2;
			} else if (super.anIntArray28[4] == 1) {
				this.anInt232 += (-this.anInt232 - 12) / 2;
			} else {
				this.anInt232 /= 2;
			}
			this.anInt230 = this.anInt230 + this.anInt231 / 2 & 0x7FF;
			this.anInt229 += this.anInt232 / 2;
			if (this.anInt229 < 128) {
				this.anInt229 = 128;
			}
			if (this.anInt229 > 383) {
				this.anInt229 = 383;
			}
			@Pc(202) int local202 = this.anInt296 >> 7;
			@Pc(207) int local207 = this.anInt297 >> 7;
			@Pc(217) int local217 = this.method132(this.anInt269, this.anInt296, this.anInt297);
			@Pc(219) int local219 = 0;
			@Pc(224) boolean local224 = false;
			@Pc(245) int local245;
			if (local202 > 3 && local207 > 3 && local202 < 100 && local207 < 100) {
				for (local245 = local202 - 4; local245 <= local202 + 4; local245++) {
					for (@Pc(251) int local251 = local207 - 4; local251 <= local207 + 4; local251++) {
						@Pc(256) int local256 = this.anInt269;
						if (local256 < 3 && (this.aByteArrayArrayArray7[1][local245][local251] & 0x2) == 2) {
							local256++;
						}
						@Pc(283) int local283 = local217 - this.anIntArrayArrayArray3[local256][local245][local251];
						if (local283 > local219) {
							local219 = local283;
						}
					}
				}
			}
			anInt277++;
			if (anInt277 > 77) {
				anInt277 = 0;
				this.aClass1_Sub3_Sub3_4.method361(156);
			}
			local245 = local219 * 192;
			if (local245 > 98048) {
				local245 = 98048;
			}
			if (local245 < 32768) {
				local245 = 32768;
			}
			if (local245 > this.anInt149) {
				this.anInt149 += (local245 - this.anInt149) / 24;
			} else if (local245 < this.anInt149) {
				this.anInt149 += (local245 - this.anInt149) / 80;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("60250, " + arg0 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass33_1.method478(this.anInt269, arg2, arg0, arg3);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(51) Class2 local51 = Class2.method23(local7);
				@Pc(59) int local59;
				@Pc(62) int local62;
				if (local31 == 0 || local31 == 2) {
					local59 = local51.anInt43;
					local62 = local51.anInt44;
				} else {
					local59 = local51.anInt44;
					local62 = local51.anInt43;
				}
				@Pc(73) int local73 = local51.anInt55;
				if (local31 != 0) {
					local73 = (local73 << local31 & 0xF) + (local73 >> 4 - local31);
				}
				this.method147(false, arg0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local62, local59, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, local73, arg2);
			} else {
				this.method147(false, arg0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], local31, local25 + 1, this.aBoolean49, 0, arg2);
			}
			this.anInt206 = super.anInt133;
			this.anInt207 = super.anInt134;
			this.anInt209 = 2;
			this.anInt208 = 0;
			this.aClass1_Sub3_Sub3_4.method361(arg1);
			this.aClass1_Sub3_Sub3_4.method363(arg2 + this.anInt150);
			this.aClass1_Sub3_Sub3_4.method363(arg0 + this.anInt151);
			this.aClass1_Sub3_Sub3_4.method363(local7);
			return true;
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("20105, " + arg0 + ", " + arg1 + ", " + -63 + ", " + arg2 + ", " + arg3 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method93(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub3_Sub2_Sub2_6.anIntArray148;
			@Pc(8) int local8 = local5.length;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				local5[local10] = 0;
			}
			@Pc(34) int local34;
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 1; local22 < 103; local22++) {
				local34 = (103 - local22) * 512 * 4 + 24628;
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray7[arg0][local36][local22] & 0x18) == 0) {
						this.aClass33_1.method483(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass33_1.method483(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			this.aClass1_Sub3_Sub2_Sub2_6.method305();
			for (local34 = 1; local34 < 103; local34++) {
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray7[arg0][local36][local34] & 0x18) == 0) {
						this.method158(arg0, local34, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local34] & 0x8) != 0) {
						this.method158(arg0 + 1, local34, local36);
					}
				}
			}
			this.aClass32_27.method444();
			this.anInt241 = 0;
			for (local36 = 0; local36 < 104; local36++) {
				for (@Pc(174) int local174 = 0; local174 < 104; local174++) {
					@Pc(184) int local184 = this.aClass33_1.method477(this.anInt269, local36, local174);
					if (local184 != 0) {
						local184 = local184 >> 14 & 0x7FFF;
						@Pc(196) int local196 = Class2.method23(local184).anInt47;
						if (local196 >= 0) {
							this.aClass1_Sub3_Sub2_Sub2Array4[this.anInt241] = this.aClass1_Sub3_Sub2_Sub2Array7[local196];
							this.anIntArray56[this.anInt241] = local36;
							this.anIntArray57[this.anInt241] = local174;
							this.anInt241++;
						}
					}
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("53182, " + 6 + ", " + arg0 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method94(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt183; local3++) {
				@Pc(10) int local10 = this.anIntArray36[local3];
				@Pc(15) Class1_Sub1_Sub3_Sub1 local15 = this.aClass1_Sub1_Sub3_Sub1Array1[local10];
				if (local15 != null) {
					this.method95(local15, local15.aClass3_1.aByte5);
				}
			}
			@Pc(34) boolean local34 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("65179, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!x;I)V")
	private void method95(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt873 < 128 || arg0.anInt874 < 128 || arg0.anInt873 >= 13184 || arg0.anInt874 >= 13184) {
				arg0.anInt898 = -1;
				arg0.anInt903 = -1;
				arg0.anInt912 = 0;
				arg0.anInt913 = 0;
				arg0.anInt873 = arg0.anIntArray232[0] * 128 + arg0.anInt876 * 64;
				arg0.anInt874 = arg0.anIntArray233[0] * 128 + arg0.anInt876 * 64;
				arg0.anInt918 = 0;
			}
			if (arg0 == this.aClass1_Sub1_Sub3_Sub2_1 && (arg0.anInt873 < 1536 || arg0.anInt874 < 1536 || arg0.anInt873 >= 11776 || arg0.anInt874 >= 11776)) {
				arg0.anInt898 = -1;
				arg0.anInt903 = -1;
				arg0.anInt912 = 0;
				arg0.anInt913 = 0;
				arg0.anInt873 = arg0.anIntArray232[0] * 128 + arg0.anInt876 * 64;
				arg0.anInt874 = arg0.anIntArray233[0] * 128 + arg0.anInt876 * 64;
				arg0.anInt918 = 0;
			}
			if (arg0.anInt912 > anInt295) {
				this.method96(arg0);
			} else if (arg0.anInt913 >= anInt295) {
				this.method97((byte) 1, arg0);
			} else {
				this.method98(arg0);
			}
			this.method99(arg0);
			this.method100(arg0);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("82816, " + ", " + arg0 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;I)V")
	private void method96(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt912 - anInt295;
			@Pc(14) int local14 = arg0.anInt908 * 128 + arg0.anInt876 * 64;
			@Pc(24) int local24 = arg0.anInt910 * 128 + arg0.anInt876 * 64;
			arg0.anInt873 += (local14 - arg0.anInt873) / local4;
			arg0.anInt874 += (local24 - arg0.anInt874) / local4;
			arg0.anInt919 = 0;
			if (arg0.anInt914 == 0) {
				arg0.anInt917 = 1024;
			}
			if (arg0.anInt914 == 1) {
				arg0.anInt917 = 1536;
			}
			if (arg0.anInt914 == 2) {
				arg0.anInt917 = 0;
			}
			if (arg0.anInt914 == 3) {
				arg0.anInt917 = 512;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("23271, " + arg0 + ", " + 2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!x;)V")
	private void method97(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg1.anInt913 == anInt295 || arg1.anInt898 == -1 || arg1.anInt901 != 0 || arg1.anInt900 + 1 > Class19.aClass19Array1[arg1.anInt898].anIntArray188[arg1.anInt899]) {
				@Pc(29) int local29 = arg1.anInt913 - arg1.anInt912;
				@Pc(34) int local34 = anInt295 - arg1.anInt912;
				@Pc(44) int local44 = arg1.anInt908 * 128 + arg1.anInt876 * 64;
				@Pc(54) int local54 = arg1.anInt910 * 128 + arg1.anInt876 * 64;
				@Pc(64) int local64 = arg1.anInt909 * 128 + arg1.anInt876 * 64;
				@Pc(74) int local74 = arg1.anInt911 * 128 + arg1.anInt876 * 64;
				arg1.anInt873 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg1.anInt874 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg1.anInt919 = 0;
			@Pc(108) boolean local108 = false;
			if (arg1.anInt914 == 0) {
				arg1.anInt917 = 1024;
			}
			if (arg1.anInt914 == 1) {
				arg1.anInt917 = 1536;
			}
			if (arg1.anInt914 == 2) {
				arg1.anInt917 = 0;
			}
			if (arg1.anInt914 == 3) {
				arg1.anInt917 = 512;
			}
			arg1.anInt875 = arg1.anInt917;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("54879, " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!x;)V")
	private void method98(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt895 = arg0.anInt877;
			if (arg0.anInt918 == 0) {
				arg0.anInt919 = 0;
			} else {
				if (arg0.anInt898 != -1 && arg0.anInt901 == 0) {
					@Pc(24) Class19 local24 = Class19.aClass19Array1[arg0.anInt898];
					if (local24.anIntArray189 == null) {
						arg0.anInt919++;
						return;
					}
				}
				@Pc(37) int local37 = arg0.anInt873;
				@Pc(40) int local40 = arg0.anInt874;
				@Pc(55) int local55 = arg0.anIntArray232[arg0.anInt918 - 1] * 128 + arg0.anInt876 * 64;
				@Pc(70) int local70 = arg0.anIntArray233[arg0.anInt918 - 1] * 128 + arg0.anInt876 * 64;
				if (local55 - local37 <= 256 && local55 - local37 >= -256 && local70 - local40 <= 256 && local70 - local40 >= -256) {
					if (local37 < local55) {
						if (local40 < local70) {
							arg0.anInt917 = 1280;
						} else if (local40 > local70) {
							arg0.anInt917 = 1792;
						} else {
							arg0.anInt917 = 1536;
						}
					} else if (local37 > local55) {
						if (local40 < local70) {
							arg0.anInt917 = 768;
						} else if (local40 > local70) {
							arg0.anInt917 = 256;
						} else {
							arg0.anInt917 = 512;
						}
					} else if (local40 < local70) {
						arg0.anInt917 = 1024;
					} else {
						arg0.anInt917 = 0;
					}
					@Pc(164) int local164 = arg0.anInt917 - arg0.anInt875 & 0x7FF;
					if (local164 > 1024) {
						local164 -= 2048;
					}
					@Pc(171) int local171 = arg0.anInt880;
					if (local164 >= -256 && local164 <= 256) {
						local171 = arg0.anInt879;
					} else if (local164 >= 256 && local164 < 768) {
						local171 = arg0.anInt882;
					} else if (local164 >= -768 && local164 <= -256) {
						local171 = arg0.anInt881;
					}
					if (local171 == -1) {
						local171 = arg0.anInt879;
					}
					arg0.anInt895 = local171;
					@Pc(218) int local218 = 4;
					if (arg0.anInt875 != arg0.anInt917 && arg0.anInt892 == -1) {
						local218 = 2;
					}
					if (arg0.anInt918 > 2) {
						local218 = 6;
					}
					if (arg0.anInt918 > 3) {
						local218 = 8;
					}
					if (arg0.anInt919 > 0 && arg0.anInt918 > 1) {
						local218 = 8;
						arg0.anInt919--;
					}
					if (arg0.aBooleanArray9[arg0.anInt918 - 1]) {
						local218 <<= 0x1;
					}
					if (local218 >= 8 && arg0.anInt895 == arg0.anInt879 && arg0.anInt883 != -1) {
						arg0.anInt895 = arg0.anInt883;
					}
					if (local37 < local55) {
						arg0.anInt873 += local218;
						if (arg0.anInt873 > local55) {
							arg0.anInt873 = local55;
						}
					} else if (local37 > local55) {
						arg0.anInt873 -= local218;
						if (arg0.anInt873 < local55) {
							arg0.anInt873 = local55;
						}
					}
					if (local40 < local70) {
						arg0.anInt874 += local218;
						if (arg0.anInt874 > local70) {
							arg0.anInt874 = local70;
						}
					} else if (local40 > local70) {
						arg0.anInt874 -= local218;
						if (arg0.anInt874 < local70) {
							arg0.anInt874 = local70;
						}
					}
					if (arg0.anInt873 == local55 && arg0.anInt874 == local70) {
						arg0.anInt918--;
					}
				} else {
					arg0.anInt873 = local55;
					arg0.anInt874 = local70;
				}
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("54115, " + -484 + ", " + arg0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!x;I)V")
	private void method99(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(29) int local29;
			@Pc(35) int local35;
			if (arg0.anInt892 != -1 && arg0.anInt892 < 32768) {
				@Pc(21) Class1_Sub1_Sub3_Sub1 local21 = this.aClass1_Sub1_Sub3_Sub1Array1[arg0.anInt892];
				if (local21 != null) {
					local29 = arg0.anInt873 - local21.anInt873;
					local35 = arg0.anInt874 - local21.anInt874;
					if (local29 != 0 || local35 != 0) {
						arg0.anInt917 = (int) (Math.atan2((double) local29, (double) local35) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(60) int local60;
			if (arg0.anInt892 >= 32768) {
				local60 = arg0.anInt892 - 32768;
				if (local60 == this.anInt256) {
					local60 = this.anInt156;
				}
				@Pc(72) Class1_Sub1_Sub3_Sub2 local72 = this.aClass1_Sub1_Sub3_Sub2Array1[local60];
				if (local72 != null) {
					local35 = arg0.anInt873 - local72.anInt873;
					@Pc(86) int local86 = arg0.anInt874 - local72.anInt874;
					if (local35 != 0 || local86 != 0) {
						arg0.anInt917 = (int) (Math.atan2((double) local35, (double) local86) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt893 != 0 || arg0.anInt894 != 0) && (arg0.anInt918 == 0 || arg0.anInt919 > 0)) {
				local60 = arg0.anInt873 - (arg0.anInt893 - this.anInt150 - this.anInt150) * 64;
				local29 = arg0.anInt874 - (arg0.anInt894 - this.anInt151 - this.anInt151) * 64;
				if (local60 != 0 || local29 != 0) {
					arg0.anInt917 = (int) (Math.atan2((double) local60, (double) local29) * 325.949D) & 0x7FF;
				}
				arg0.anInt893 = 0;
				arg0.anInt894 = 0;
			}
			local60 = arg0.anInt917 - arg0.anInt875 & 0x7FF;
			if (local60 != 0) {
				if (local60 < 32 || local60 > 2016) {
					arg0.anInt875 = arg0.anInt917;
				} else if (local60 > 1024) {
					arg0.anInt875 -= 32;
				} else {
					arg0.anInt875 += 32;
				}
				arg0.anInt875 &= 0x7FF;
				if (arg0.anInt895 == arg0.anInt877 && arg0.anInt875 != arg0.anInt917) {
					if (arg0.anInt878 != -1) {
						arg0.anInt895 = arg0.anInt878;
						return;
					}
					arg0.anInt895 = arg0.anInt879;
					return;
				}
			}
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("49037, " + arg0 + ", " + 6 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!x;)V")
	private void method100(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.aBoolean188 = false;
			@Pc(22) Class19 local22;
			if (arg0.anInt895 != -1) {
				local22 = Class19.aClass19Array1[arg0.anInt895];
				arg0.anInt897++;
				if (arg0.anInt896 < local22.anInt521 && arg0.anInt897 > local22.anIntArray188[arg0.anInt896]) {
					arg0.anInt897 = 0;
					arg0.anInt896++;
				}
				if (arg0.anInt896 >= local22.anInt521) {
					arg0.anInt897 = 0;
					arg0.anInt896 = 0;
				}
			}
			if (arg0.anInt898 != -1 && arg0.anInt901 == 0) {
				local22 = Class19.aClass19Array1[arg0.anInt898];
				arg0.anInt900++;
				while (arg0.anInt899 < local22.anInt521 && arg0.anInt900 > local22.anIntArray188[arg0.anInt899]) {
					arg0.anInt900 -= local22.anIntArray188[arg0.anInt899];
					arg0.anInt899++;
				}
				if (arg0.anInt899 >= local22.anInt521) {
					arg0.anInt899 -= local22.anInt522;
					arg0.anInt902++;
					if (arg0.anInt902 >= local22.anInt526) {
						arg0.anInt898 = -1;
					}
					if (arg0.anInt899 < 0 || arg0.anInt899 >= local22.anInt521) {
						arg0.anInt898 = -1;
					}
				}
				arg0.aBoolean188 = local22.aBoolean141;
			}
			if (arg0.anInt901 > 0) {
				arg0.anInt901--;
			}
			if (arg0.anInt903 != -1 && anInt295 >= arg0.anInt906) {
				if (arg0.anInt904 < 0) {
					arg0.anInt904 = 0;
				}
				local22 = Class21.aClass21Array1[arg0.anInt903].aClass19_1;
				arg0.anInt905++;
				while (arg0.anInt904 < local22.anInt521 && arg0.anInt905 > local22.anIntArray188[arg0.anInt904]) {
					arg0.anInt905 -= local22.anIntArray188[arg0.anInt904];
					arg0.anInt904++;
				}
				if (arg0.anInt904 >= local22.anInt521) {
					if (arg0.anInt904 < 0 || arg0.anInt904 >= local22.anInt521) {
						arg0.anInt903 = -1;
					}
					return;
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("47446, " + true + ", " + arg0 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method101() {
		try {
			if (this.aBoolean57) {
				this.aBoolean57 = false;
				this.aClass32_15.method445(super.aGraphics2, 0, 11);
				this.aClass32_16.method445(super.aGraphics2, 0, 375);
				this.aClass32_17.method445(super.aGraphics2, 729, 5);
				this.aClass32_18.method445(super.aGraphics2, 752, 231);
				this.aClass32_19.method445(super.aGraphics2, 0, 0);
				this.aClass32_20.method445(super.aGraphics2, 561, 0);
				this.aClass32_21.method445(super.aGraphics2, 520, 11);
				this.aClass32_22.method445(super.aGraphics2, 520, 231);
				this.aClass32_23.method445(super.aGraphics2, 501, 375);
				this.aClass32_24.method445(super.aGraphics2, 0, 345);
				this.aBoolean52 = true;
				this.aBoolean64 = true;
				this.aBoolean66 = true;
				this.aBoolean61 = true;
				if (this.anInt145 != 2) {
					this.aClass32_27.method445(super.aGraphics2, 8, 11);
					this.aClass32_26.method445(super.aGraphics2, 561, 5);
				}
			}
			if (this.anInt145 == 2) {
				this.method129();
			}
			if (this.aBoolean51 && this.anInt246 == 1) {
				this.aBoolean52 = true;
			}
			@Pc(151) boolean local151;
			if (this.anInt161 != -1) {
				local151 = this.method160(this.anInt184, this.anInt161, 400);
				if (local151) {
					this.aBoolean52 = true;
				}
			}
			if (this.anInt313 == 2) {
				this.aBoolean52 = true;
			}
			if (this.anInt261 == 2) {
				this.aBoolean52 = true;
			}
			if (this.aBoolean52) {
				this.method156();
				this.aBoolean52 = false;
			}
			if (this.anInt180 == -1) {
				this.aClass15_1.anInt460 = this.anInt193 - this.anInt309 - 77;
				if (super.anInt130 > 453 && super.anInt130 < 565 && super.anInt131 > 350) {
					this.method179(false, super.anInt131 - 375, this.aClass15_1, 0, 463, this.anInt193, 77, super.anInt130 - 22);
				}
				@Pc(233) int local233 = this.anInt193 - this.aClass15_1.anInt460 - 77;
				if (local233 < 0) {
					local233 = 0;
				}
				if (local233 > this.anInt193 - 77) {
					local233 = this.anInt193 - 77;
				}
				if (this.anInt309 != local233) {
					this.anInt309 = local233;
					this.aBoolean64 = true;
				}
				anInt227++;
				if (anInt227 > 87) {
					anInt227 = 0;
					this.aClass1_Sub3_Sub3_4.method361(108);
				}
			}
			if (this.anInt180 != -1) {
				local151 = this.method160(this.anInt184, this.anInt180, 400);
				if (local151) {
					this.aBoolean64 = true;
				}
			}
			if (this.anInt313 == 3) {
				this.aBoolean64 = true;
			}
			if (this.anInt261 == 3) {
				this.aBoolean64 = true;
			}
			if (this.aString10 != null) {
				this.aBoolean64 = true;
			}
			if (this.aBoolean64) {
				this.method114(this.anInt217);
				this.aBoolean64 = false;
			}
			if (this.anInt145 == 2) {
				if (aBoolean55 && this.anInt231 == 0 && anInt295 - this.anInt280 > 25) {
					this.anInt280 = anInt295;
					this.anInt279 = 1 - this.anInt279;
					if (this.anInt279 == 0) {
						this.method102();
					} else {
						this.aClass32_26.method445(super.aGraphics2, 561, 5);
					}
				}
				if (!aBoolean55) {
					this.method102();
					this.aClass32_26.method445(super.aGraphics2, 561, 5);
				}
			}
			if (this.anInt240 != -1) {
				this.aBoolean66 = true;
			}
			if (this.aBoolean66) {
				if (this.anInt240 != -1 && this.anInt240 == this.anInt282) {
					this.anInt240 = -1;
					this.aClass1_Sub3_Sub3_4.method361(193);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt282);
				}
				this.aBoolean66 = false;
				this.aClass32_14.method444();
				this.aClass1_Sub3_Sub2_Sub3_8.method335(0, 0);
				if (this.anInt161 == -1) {
					if (this.anIntArray69[this.anInt282] != -1) {
						if (this.anInt282 == 0) {
							this.aClass1_Sub3_Sub2_Sub3_11.method335(29, 30);
						}
						if (this.anInt282 == 1) {
							this.aClass1_Sub3_Sub2_Sub3_12.method335(59, 29);
						}
						if (this.anInt282 == 2) {
							this.aClass1_Sub3_Sub2_Sub3_12.method335(87, 29);
						}
						if (this.anInt282 == 3) {
							this.aClass1_Sub3_Sub2_Sub3_13.method335(115, 29);
						}
						if (this.anInt282 == 4) {
							this.aClass1_Sub3_Sub2_Sub3_15.method335(156, 29);
						}
						if (this.anInt282 == 5) {
							this.aClass1_Sub3_Sub2_Sub3_15.method335(184, 29);
						}
						if (this.anInt282 == 6) {
							this.aClass1_Sub3_Sub2_Sub3_14.method335(212, 30);
						}
					}
					if (this.anIntArray69[0] != -1 && (this.anInt240 != 0 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[0].method335(35, 34);
					}
					if (this.anIntArray69[1] != -1 && (this.anInt240 != 1 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[1].method335(59, 32);
					}
					if (this.anIntArray69[2] != -1 && (this.anInt240 != 2 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[2].method335(86, 32);
					}
					if (this.anIntArray69[3] != -1 && (this.anInt240 != 3 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[3].method335(121, 33);
					}
					if (this.anIntArray69[4] != -1 && (this.anInt240 != 4 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[4].method335(157, 34);
					}
					if (this.anIntArray69[5] != -1 && (this.anInt240 != 5 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[5].method335(185, 32);
					}
					if (this.anIntArray69[6] != -1 && (this.anInt240 != 6 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[6].method335(212, 34);
					}
				}
				this.aClass32_14.method445(super.aGraphics2, 520, 165);
				this.aClass32_13.method444();
				this.aClass1_Sub3_Sub2_Sub3_7.method335(0, 0);
				if (this.anInt161 == -1) {
					if (this.anIntArray69[this.anInt282] != -1) {
						if (this.anInt282 == 7) {
							this.aClass1_Sub3_Sub2_Sub3_1.method335(49, 0);
						}
						if (this.anInt282 == 8) {
							this.aClass1_Sub3_Sub2_Sub3_2.method335(81, 0);
						}
						if (this.anInt282 == 9) {
							this.aClass1_Sub3_Sub2_Sub3_2.method335(108, 0);
						}
						if (this.anInt282 == 10) {
							this.aClass1_Sub3_Sub2_Sub3_3.method335(136, 1);
						}
						if (this.anInt282 == 11) {
							this.aClass1_Sub3_Sub2_Sub3_5.method335(178, 0);
						}
						if (this.anInt282 == 12) {
							this.aClass1_Sub3_Sub2_Sub3_5.method335(205, 0);
						}
						if (this.anInt282 == 13) {
							this.aClass1_Sub3_Sub2_Sub3_4.method335(233, 0);
						}
					}
					if (this.anIntArray69[8] != -1 && (this.anInt240 != 8 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[7].method335(80, 2);
					}
					if (this.anIntArray69[9] != -1 && (this.anInt240 != 9 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[8].method335(107, 3);
					}
					if (this.anIntArray69[10] != -1 && (this.anInt240 != 10 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[9].method335(142, 4);
					}
					if (this.anIntArray69[11] != -1 && (this.anInt240 != 11 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[10].method335(179, 2);
					}
					if (this.anIntArray69[12] != -1 && (this.anInt240 != 12 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[11].method335(206, 2);
					}
					if (this.anIntArray69[13] != -1 && (this.anInt240 != 13 || anInt295 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array3[12].method335(230, 2);
					}
				}
				this.aClass32_13.method445(super.aGraphics2, 501, 492);
				this.aClass32_27.method444();
			}
			if (this.aBoolean61) {
				this.aBoolean61 = false;
				this.aClass32_12.method444();
				this.aClass1_Sub3_Sub2_Sub3_6.method335(0, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method348(33, "Public chat", 16777215, true, 57);
				if (this.anInt154 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "On", 65280, true, 57);
				}
				if (this.anInt154 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "Friends", 16776960, true, 57);
				}
				if (this.anInt154 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "Off", 16711680, true, 57);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method348(33, "Private chat", 16777215, true, 186);
				if (this.anInt214 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "On", 65280, true, 186);
				}
				if (this.anInt214 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "Friends", 16776960, true, 186);
				}
				if (this.anInt214 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "Off", 16711680, true, 186);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method348(33, "Trade/duel", 16777215, true, 326);
				if (this.anInt316 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "On", 65280, true, 326);
				}
				if (this.anInt316 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "Friends", 16776960, true, 326);
				}
				if (this.anInt316 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method348(46, "Off", 16711680, true, 326);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method348(38, "Report abuse", 16777215, true, 462);
				this.aClass32_12.method445(super.aGraphics2, 0, 471);
				this.aClass32_27.method444();
			}
			this.anInt184 = 0;
		} catch (@Pc(1089) RuntimeException local1089) {
			signlink.reporterror("75003, " + -659 + ", " + local1089.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method102() {
		try {
			this.aClass32_26.method444();
			@Pc(17) int local17 = this.aClass1_Sub1_Sub3_Sub2_1.anInt873 / 32 + 48;
			@Pc(25) int local25 = 464 - this.aClass1_Sub1_Sub3_Sub2_1.anInt874 / 32;
			this.aClass1_Sub3_Sub2_Sub2_6.method314(local17, this.anIntArray55, this.anInt230, 9, local25, 151, 146, 21, this.anIntArray81);
			this.aClass1_Sub3_Sub2_Sub2_11.method314(25, this.anIntArray83, this.anInt230, 0, 25, 33, 33, 0, this.anIntArray51);
			for (@Pc(59) int local59 = 0; local59 < this.anInt241; local59++) {
				local17 = this.anIntArray56[local59] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt873 / 32;
				local25 = this.anIntArray57[local59] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt874 / 32;
				this.method151(local17, this.aClass1_Sub3_Sub2_Sub2Array4[local59], local25);
			}
			@Pc(111) int local111;
			for (@Pc(107) int local107 = 0; local107 < 104; local107++) {
				for (local111 = 0; local111 < 104; local111++) {
					@Pc(123) Class28 local123 = this.aClass28ArrayArrayArray1[this.anInt269][local107][local111];
					if (local123 != null) {
						local17 = local107 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt873 / 32;
						local25 = local111 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt874 / 32;
						this.method151(local17, this.aClass1_Sub3_Sub2_Sub2_7, local25);
					}
				}
			}
			for (local111 = 0; local111 < this.anInt183; local111++) {
				@Pc(176) Class1_Sub1_Sub3_Sub1 local176 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray36[local111]];
				if (local176 != null && local176.method551() && local176.aClass3_1.aBoolean23) {
					local17 = local176.anInt873 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt873 / 32;
					local25 = local176.anInt874 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt874 / 32;
					this.method151(local17, this.aClass1_Sub3_Sub2_Sub2_8, local25);
				}
			}
			for (@Pc(222) int local222 = 0; local222 < this.anInt157; local222++) {
				@Pc(232) Class1_Sub1_Sub3_Sub2 local232 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray30[local222]];
				if (local232 != null && local232.method551()) {
					local17 = local232.anInt873 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt873 / 32;
					local25 = local232.anInt874 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt874 / 32;
					@Pc(262) boolean local262 = false;
					@Pc(266) long local266 = Class40.method518(local232.aString30);
					for (@Pc(268) int local268 = 0; local268 < this.anInt215; local268++) {
						if (local266 == this.aLongArray4[local268] && this.anIntArray34[local268] != 0) {
							local262 = true;
							break;
						}
					}
					if (local262) {
						this.method151(local17, this.aClass1_Sub3_Sub2_Sub2_10, local25);
					} else {
						this.method151(local17, this.aClass1_Sub3_Sub2_Sub2_9, local25);
					}
				}
			}
			if (this.anInt286 != 0) {
				local17 = this.anInt286 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt873 / 32;
				local25 = this.anInt287 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt874 / 32;
				this.method151(local17, this.aClass1_Sub3_Sub2_Sub2_3, local25);
			}
			Class1_Sub3_Sub2.method343(16777215, 82, 93, 3, 3);
			this.aClass32_27.method444();
		} catch (@Pc(363) RuntimeException local363) {
			signlink.reporterror("88215, " + 6 + ", " + local363.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method71() {
		try {
			this.aBoolean57 = true;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("91990, " + -879 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method103(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) Class1_Sub1_Sub1 local6 = (Class1_Sub1_Sub1) this.aClass28_3.method437();
			@Pc(10) boolean local10 = false;
			while (local6 != null) {
				if (local6.anInt26 != this.anInt269 || anInt295 > local6.anInt32) {
					local6.method547();
				} else if (anInt295 >= local6.anInt31) {
					if (local6.anInt35 > 0) {
						@Pc(40) Class1_Sub1_Sub3_Sub1 local40 = this.aClass1_Sub1_Sub3_Sub1Array1[local6.anInt35 - 1];
						if (local40 != null) {
							local6.method19(local40.anInt874, this.method132(local6.anInt26, local40.anInt873, local40.anInt874) - local6.anInt30, anInt295, local40.anInt873);
						}
					}
					if (local6.anInt35 < 0) {
						@Pc(71) int local71 = -local6.anInt35 - 1;
						@Pc(78) Class1_Sub1_Sub3_Sub2 local78;
						if (local71 == this.anInt256) {
							local78 = this.aClass1_Sub1_Sub3_Sub2_1;
						} else {
							local78 = this.aClass1_Sub1_Sub3_Sub2Array1[local71];
						}
						if (local78 != null) {
							local6.method19(local78.anInt874, this.method132(local6.anInt26, local78.anInt873, local78.anInt874) - local6.anInt30, anInt295, local78.anInt873);
						}
					}
					local6.method20(this.anInt184);
					this.aClass33_1.method459(local6.anInt36, 775, local6, null, -1, (int) local6.aDouble1, false, 60, this.anInt269, (int) local6.aDouble2, (int) local6.aDouble3);
				}
				local6 = (Class1_Sub1_Sub1) this.aClass28_3.method439(this.aByte14);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("29320, " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method104(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Graphics local4 = this.method72((byte) 9).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 789, 532);
			this.method65();
			if (arg0 < 0) {
				@Pc(39) byte local39;
				@Pc(45) int local45;
				if (this.aBoolean67) {
					this.aBoolean53 = false;
					local4.setFont(new Font("Helvetica", 1, 16));
					local4.setColor(Color.yellow);
					local39 = 35;
					local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
					local45 = local39 + 50;
					local4.setColor(Color.white);
					local4.drawString("To fix this try the following (in order):", 30, 85);
					@Pc(54) int local54 = local45 + 50;
					local4.setColor(Color.white);
					local4.setFont(new Font("Helvetica", 1, 12));
					local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
					@Pc(71) int local71 = local54 + 30;
					local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
					@Pc(77) int local77 = local71 + 30;
					local4.drawString("3: Try using a different game-world", 30, 195);
					@Pc(83) int local83 = local77 + 30;
					local4.drawString("4: Try rebooting your computer", 30, 225);
					@Pc(89) int local89 = local83 + 30;
					local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
				}
				if (this.aBoolean56) {
					this.aBoolean53 = false;
					local4.setFont(new Font("Helvetica", 1, 20));
					local4.setColor(Color.white);
					local4.drawString("Error - unable to load game!", 50, 50);
					local4.drawString("To play RuneScape make sure you play from", 50, 100);
					local4.drawString("http://www.runescape.com", 50, 150);
				}
				if (this.aBoolean74) {
					this.aBoolean53 = false;
					local4.setColor(Color.yellow);
					local39 = 35;
					local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
					local45 = local39 + 50;
					local4.setColor(Color.white);
					local4.drawString("To fix this try the following (in order):", 30, 85);
					local45 += 50;
					local4.setColor(Color.white);
					local4.setFont(new Font("Helvetica", 1, 12));
					local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
					local45 += 30;
					local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
					local45 += 30;
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("36213, " + arg0 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method105() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt306 == 0) {
				local17 = super.anInt126 / 2;
				local24 = super.anInt127 / 2 + 90;
				if (super.anInt132 == 1 && super.anInt133 >= local17 - 75 && super.anInt133 <= local17 + 75 && super.anInt134 >= local24 - 20 && super.anInt134 <= local24 + 20) {
					this.aString4 = "";
					this.aString5 = "Enter your username & password.";
					this.anInt306 = 2;
					this.anInt242 = 0;
				}
			} else if (this.anInt306 == 2) {
				local17 = super.anInt127 / 2 - 30;
				local17 += 30;
				if (super.anInt132 == 1 && super.anInt134 >= local17 - 15 && super.anInt134 < local17) {
					this.anInt242 = 0;
				}
				local17 += 15;
				if (super.anInt132 == 1 && super.anInt134 >= local17 - 15 && super.anInt134 < local17) {
					this.anInt242 = 1;
				}
				local17 += 15;
				local24 = super.anInt126 / 2 - 80;
				@Pc(127) int local127 = super.anInt127 / 2 + 60;
				if (super.anInt132 == 1 && super.anInt133 >= local24 - 75 && super.anInt133 <= local24 + 75 && super.anInt134 >= local127 - 20 && super.anInt134 <= local127 + 20) {
					this.method119(this.aString13, this.aString14, false);
				}
				local24 = super.anInt126 / 2 + 80;
				if (super.anInt132 == 1 && super.anInt133 >= local24 - 75 && super.anInt133 <= local24 + 75 && super.anInt134 >= local127 - 20 && super.anInt134 <= local127 + 20) {
					this.anInt306 = 0;
					this.aString13 = "";
					this.aString14 = "";
				}
				while (true) {
					while (true) {
						@Pc(210) int local210 = this.method66();
						if (local210 == -1) {
							return;
						}
						@Pc(215) boolean local215 = false;
						for (@Pc(217) int local217 = 0; local217 < aString16.length(); local217++) {
							if (local210 == aString16.charAt(local217)) {
								local215 = true;
								break;
							}
						}
						if (this.anInt242 == 0) {
							if (local210 == 8 && this.aString13.length() > 0) {
								this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
							}
							if (local210 == 9 || local210 == 10 || local210 == 13) {
								this.anInt242 = 1;
							}
							if (local215) {
								this.aString13 = this.aString13 + (char) local210;
							}
							if (this.aString13.length() > 12) {
								this.aString13 = this.aString13.substring(0, 12);
							}
						} else if (this.anInt242 == 1) {
							if (local210 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							}
							if (local210 == 9 || local210 == 10 || local210 == 13) {
								this.anInt242 = 0;
							}
							if (local215) {
								this.aString14 = this.aString14 + (char) local210;
							}
							if (this.aString14.length() > 20) {
								this.aString14 = this.aString14.substring(0, 20);
							}
						}
					}
				}
			}
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("99364, " + 5 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method106() {
		try {
			if (super.anInt132 == 1) {
				if (super.anInt133 >= 549 && super.anInt133 <= 583 && super.anInt134 >= 195 && super.anInt134 < 231 && this.anIntArray69[0] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 0;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 579 && super.anInt133 <= 609 && super.anInt134 >= 194 && super.anInt134 < 231 && this.anIntArray69[1] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 1;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 607 && super.anInt133 <= 637 && super.anInt134 >= 194 && super.anInt134 < 231 && this.anIntArray69[2] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 2;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 635 && super.anInt133 <= 679 && super.anInt134 >= 194 && super.anInt134 < 229 && this.anIntArray69[3] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 3;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 676 && super.anInt133 <= 706 && super.anInt134 >= 194 && super.anInt134 < 231 && this.anIntArray69[4] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 4;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 704 && super.anInt133 <= 734 && super.anInt134 >= 194 && super.anInt134 < 231 && this.anIntArray69[5] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 5;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 732 && super.anInt133 <= 766 && super.anInt134 >= 195 && super.anInt134 < 231 && this.anIntArray69[6] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 6;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 550 && super.anInt133 <= 584 && super.anInt134 >= 492 && super.anInt134 < 528 && this.anIntArray69[7] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 7;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 582 && super.anInt133 <= 612 && super.anInt134 >= 492 && super.anInt134 < 529 && this.anIntArray69[8] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 8;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 609 && super.anInt133 <= 639 && super.anInt134 >= 492 && super.anInt134 < 529 && this.anIntArray69[9] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 9;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 637 && super.anInt133 <= 681 && super.anInt134 >= 493 && super.anInt134 < 528 && this.anIntArray69[10] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 10;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 679 && super.anInt133 <= 709 && super.anInt134 >= 492 && super.anInt134 < 529 && this.anIntArray69[11] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 11;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 706 && super.anInt133 <= 736 && super.anInt134 >= 492 && super.anInt134 < 529 && this.anIntArray69[12] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 12;
					this.aBoolean66 = true;
				}
				if (super.anInt133 >= 734 && super.anInt133 <= 768 && super.anInt134 >= 492 && super.anInt134 < 528 && this.anIntArray69[13] != -1) {
					this.aBoolean52 = true;
					this.anInt282 = 13;
					this.aBoolean66 = true;
					return;
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("36923, " + false + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;III)V")
	private void method107(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != this.aClass1_Sub1_Sub3_Sub2_1 && this.anInt162 < 400) {
				@Pc(34) String local34 = arg1.aString30 + method187(arg1.anInt923, this.aClass1_Sub1_Sub3_Sub2_1.anInt923) + " (level-" + arg1.anInt923 + ")";
				if (this.anInt171 == 1) {
					this.aStringArray8[this.anInt162] = "Use " + this.aString7 + " with @whi@" + local34;
					this.anIntArray87[this.anInt162] = 65;
					this.anIntArray88[this.anInt162] = arg2;
					this.anIntArray85[this.anInt162] = arg0;
					this.anIntArray86[this.anInt162] = arg4;
					this.anInt162++;
				} else if (this.anInt167 != 1) {
					this.aStringArray8[this.anInt162] = "Follow @whi@" + local34;
					this.anIntArray87[this.anInt162] = 1958;
					this.anIntArray88[this.anInt162] = arg2;
					this.anIntArray85[this.anInt162] = arg0;
					this.anIntArray86[this.anInt162] = arg4;
					this.anInt162++;
					if (this.anInt298 == 0) {
						this.aStringArray8[this.anInt162] = "Trade with @whi@" + local34;
						this.anIntArray87[this.anInt162] = 1390;
						this.anIntArray88[this.anInt162] = arg2;
						this.anIntArray85[this.anInt162] = arg0;
						this.anIntArray86[this.anInt162] = arg4;
						this.anInt162++;
					}
					if (this.anInt228 > 0) {
						this.aStringArray8[this.anInt162] = "Attack @whi@" + local34;
						if (this.aClass1_Sub1_Sub3_Sub2_1.anInt923 >= arg1.anInt923) {
							this.anIntArray87[this.anInt162] = 905;
						} else {
							this.anIntArray87[this.anInt162] = 2905;
						}
						this.anIntArray88[this.anInt162] = arg2;
						this.anIntArray85[this.anInt162] = arg0;
						this.anIntArray86[this.anInt162] = arg4;
						this.anInt162++;
					}
					if (this.anInt239 == 1) {
						this.aStringArray8[this.anInt162] = "Fight @whi@" + local34;
						this.anIntArray87[this.anInt162] = 905;
						this.anIntArray88[this.anInt162] = arg2;
						this.anIntArray85[this.anInt162] = arg0;
						this.anIntArray86[this.anInt162] = arg4;
						this.anInt162++;
					}
					if (this.anInt239 == 2) {
						this.aStringArray8[this.anInt162] = "Duel-with @whi@" + local34;
						this.anIntArray87[this.anInt162] = 656;
						this.anIntArray88[this.anInt162] = arg2;
						this.anIntArray85[this.anInt162] = arg0;
						this.anIntArray86[this.anInt162] = arg4;
						this.anInt162++;
					}
				} else if ((this.anInt169 & 0x8) == 8) {
					this.aStringArray8[this.anInt162] = this.aString6 + " @whi@" + local34;
					this.anIntArray87[this.anInt162] = 92;
					this.anIntArray88[this.anInt162] = arg2;
					this.anIntArray85[this.anInt162] = arg0;
					this.anIntArray86[this.anInt162] = arg4;
					this.anInt162++;
				}
				for (@Pc(385) int local385 = 0; local385 < this.anInt162; local385++) {
					if (this.anIntArray87[local385] == 256) {
						this.aStringArray8[local385] = "Walk here @whi@" + local34;
						break;
					}
				}
				if (arg3 < 4 || arg3 > 4) {
					this.anInt147 = this.aClass38_1.method512();
				}
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("66400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
	private void method108(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean58) {
					this.aBoolean58 = false;
					this.aBoolean64 = true;
				}
				@Pc(18) int local18 = this.anIntArray85[arg0];
				@Pc(23) int local23 = this.anIntArray86[arg0];
				@Pc(28) int local28 = this.anIntArray87[arg0];
				@Pc(33) int local33 = this.anIntArray88[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 825 && this.method92(local23, 43, local18, local33)) {
					this.aClass1_Sub3_Sub3_4.method363(this.anInt174);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt172);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt173);
				}
				@Pc(76) Class15 local76;
				if (local28 == 238) {
					local76 = Class15.aClass15Array1[local23];
					@Pc(78) boolean local78 = true;
					if (local76.anInt453 > 0) {
						local78 = this.method152(local76);
					}
					if (local78) {
						this.aClass1_Sub3_Sub3_4.method361(203);
						this.aClass1_Sub3_Sub3_4.method363(local23);
					}
				}
				if (local28 == 771 && this.method92(local23, 109, local18, local33)) {
					this.aClass1_Sub3_Sub3_4.method363(this.anInt168);
				}
				@Pc(139) boolean local139;
				if (local28 == 788) {
					local139 = this.method147(false, local23, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local18);
					if (!local139) {
						this.method147(false, local23, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local18);
					}
					this.anInt206 = super.anInt133;
					this.anInt207 = super.anInt134;
					this.anInt209 = 2;
					this.anInt208 = 0;
					this.aClass1_Sub3_Sub3_4.method361(88);
					this.aClass1_Sub3_Sub3_4.method363(local18 + this.anInt150);
					this.aClass1_Sub3_Sub3_4.method363(local23 + this.anInt151);
					this.aClass1_Sub3_Sub3_4.method363(local33);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt168);
				}
				if (local28 == 106) {
					local139 = this.method147(false, local23, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local18);
					if (!local139) {
						this.method147(false, local23, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local18);
					}
					this.anInt206 = super.anInt133;
					this.anInt207 = super.anInt134;
					this.anInt209 = 2;
					this.anInt208 = 0;
					this.aClass1_Sub3_Sub3_4.method361(31);
					this.aClass1_Sub3_Sub3_4.method363(local18 + this.anInt150);
					this.aClass1_Sub3_Sub3_4.method363(local23 + this.anInt151);
					this.aClass1_Sub3_Sub3_4.method363(local33);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt174);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt172);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt173);
				}
				@Pc(343) int local343;
				if (local28 == 779) {
					this.aClass1_Sub3_Sub3_4.method361(203);
					this.aClass1_Sub3_Sub3_4.method363(local23);
					local76 = Class15.aClass15Array1[local23];
					if (local76.anIntArrayArray15 != null && local76.anIntArrayArray15[0][0] == 5) {
						local343 = local76.anIntArrayArray15[0][1];
						if (this.anIntArray35[local343] != local76.anIntArray152[0]) {
							this.anIntArray35[local343] = local76.anIntArray152[0];
							this.method85(local343);
							this.aBoolean52 = true;
						}
					}
				}
				@Pc(388) String local388;
				if (local28 == 1387) {
					@Pc(376) int local376 = local33 >> 14 & 0x7FFF;
					@Pc(379) Class2 local379 = Class2.method23(local376);
					if (local379.aByteArray1 == null) {
						local388 = "It's a " + local379.aString1 + ".";
					} else {
						local388 = new String(local379.aByteArray1);
					}
					this.method88(0, local388, "");
				}
				@Pc(415) Class1_Sub1_Sub3_Sub1 local415;
				if (local28 == 129) {
					local415 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
					if (local415 != null) {
						this.method147(false, local415.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local415.anIntArray232[0]);
						this.anInt206 = super.anInt133;
						this.anInt207 = super.anInt134;
						this.anInt209 = 2;
						this.anInt208 = 0;
						this.aClass1_Sub3_Sub3_4.method361(139);
						this.aClass1_Sub3_Sub3_4.method363(local33);
						this.aClass1_Sub3_Sub3_4.method363(this.anInt168);
					}
				}
				@Pc(480) Class5 local480;
				@Pc(489) String local489;
				if (local28 == 1536) {
					local480 = Class5.method54(local33);
					if (local480.aByteArray3 == null) {
						local489 = "It's a " + local480.aString3 + ".";
					} else {
						local489 = new String(local480.aByteArray3);
					}
					this.method88(0, local489, "");
				}
				if (local28 == 688) {
					local415 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
					if (local415 != null) {
						this.method147(false, local415.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local415.anIntArray232[0]);
						this.anInt206 = super.anInt133;
						this.anInt207 = super.anInt134;
						this.anInt209 = 2;
						this.anInt208 = 0;
						this.aClass1_Sub3_Sub3_4.method361(106);
						this.aClass1_Sub3_Sub3_4.method363(local33);
						this.aClass1_Sub3_Sub3_4.method363(this.anInt174);
						this.aClass1_Sub3_Sub3_4.method363(this.anInt172);
						this.aClass1_Sub3_Sub3_4.method363(this.anInt173);
					}
				}
				if (local28 == 278) {
					this.aClass1_Sub3_Sub3_4.method361(42);
					this.aClass1_Sub3_Sub3_4.method363(local33);
					this.aClass1_Sub3_Sub3_4.method363(local18);
					this.aClass1_Sub3_Sub3_4.method363(local23);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt174);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt172);
					this.aClass1_Sub3_Sub3_4.method363(this.anInt173);
					this.anInt310 = 0;
					this.anInt311 = local23;
					this.anInt312 = local18;
					this.anInt313 = 2;
					if (Class15.aClass15Array1[local23].anInt450 == this.anInt216) {
						this.anInt313 = 1;
					}
					if (Class15.aClass15Array1[local23].anInt450 == this.anInt180) {
						this.anInt313 = 3;
					}
				}
				if (local28 == 382 || local28 == 635 || local28 == 939 || local28 == 274 || local28 == 618) {
					if (local28 == 635) {
						this.aClass1_Sub3_Sub3_4.method361(145);
					}
					if (local28 == 939) {
						anInt187++;
						if (anInt187 >= 62) {
							this.aClass1_Sub3_Sub3_4.method361(208);
							this.aClass1_Sub3_Sub3_4.method362(142);
						}
						this.aClass1_Sub3_Sub3_4.method361(63);
					}
					if (local28 == 382) {
						anInt178 += local33;
						if (anInt178 >= 76) {
							this.aClass1_Sub3_Sub3_4.method361(112);
							this.aClass1_Sub3_Sub3_4.method362(171);
						}
						this.aClass1_Sub3_Sub3_4.method361(255);
					}
					if (local28 == 274) {
						this.aClass1_Sub3_Sub3_4.method361(59);
					}
					if (local28 == 618) {
						if ((local33 & 0x3) == 0) {
							anInt185++;
						}
						if (anInt185 >= 124) {
							this.aClass1_Sub3_Sub3_4.method361(236);
							this.aClass1_Sub3_Sub3_4.method366(0);
						}
						this.aClass1_Sub3_Sub3_4.method361(163);
					}
					this.aClass1_Sub3_Sub3_4.method363(local33);
					this.aClass1_Sub3_Sub3_4.method363(local18);
					this.aClass1_Sub3_Sub3_4.method363(local23);
					this.anInt310 = 0;
					this.anInt311 = local23;
					this.anInt312 = local18;
					this.anInt313 = 2;
					if (Class15.aClass15Array1[local23].anInt450 == this.anInt216) {
						this.anInt313 = 1;
					}
					if (Class15.aClass15Array1[local23].anInt450 == this.anInt180) {
						this.anInt313 = 3;
					}
				}
				@Pc(820) Class1_Sub1_Sub3_Sub2 local820;
				if (local28 == 1390 || local28 == 1958 || local28 == 905 || local28 == 656) {
					local820 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
					if (local820 != null) {
						this.method147(false, local820.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local820.anIntArray232[0]);
						this.anInt206 = super.anInt133;
						this.anInt207 = super.anInt134;
						this.anInt209 = 2;
						this.anInt208 = 0;
						if (local28 == 1958) {
							if ((local33 & 0x3) == 0) {
								anInt274++;
							}
							if (anInt274 >= 139) {
								this.aClass1_Sub3_Sub3_4.method361(111);
								this.aClass1_Sub3_Sub3_4.method366(0);
							}
							this.aClass1_Sub3_Sub3_4.method361(3);
						}
						if (local28 == 656) {
							this.aClass1_Sub3_Sub3_4.method361(50);
						}
						if (local28 == 1390) {
							this.aClass1_Sub3_Sub3_4.method361(232);
						}
						if (local28 == 905) {
							this.aClass1_Sub3_Sub3_4.method361(12);
						}
						this.aClass1_Sub3_Sub3_4.method363(local33);
					}
				}
				if (local28 == 71 || local28 == 897 || local28 == 500 || local28 == 837 || local28 == 460) {
					if (local28 == 897) {
						this.aClass1_Sub3_Sub3_4.method361(227);
					}
					if (local28 == 460) {
						this.aClass1_Sub3_Sub3_4.method361(5);
					}
					if (local28 == 837) {
						this.aClass1_Sub3_Sub3_4.method361(180);
					}
					if (local28 == 71) {
						this.aClass1_Sub3_Sub3_4.method361(61);
					}
					if (local28 == 500) {
						this.aClass1_Sub3_Sub3_4.method361(10);
					}
					this.aClass1_Sub3_Sub3_4.method363(local33);
					this.aClass1_Sub3_Sub3_4.method363(local18);
					this.aClass1_Sub3_Sub3_4.method363(local23);
					this.anInt310 = 0;
					this.anInt311 = local23;
					this.anInt312 = local18;
					this.anInt313 = 2;
					if (Class15.aClass15Array1[local23].anInt450 == this.anInt216) {
						this.anInt313 = 1;
					}
					if (Class15.aClass15Array1[local23].anInt450 == this.anInt180) {
						this.anInt313 = 3;
					}
				}
				if (local28 == 782) {
					anInt213 += local23;
					if (anInt213 >= 132) {
						this.aClass1_Sub3_Sub3_4.method361(231);
						this.aClass1_Sub3_Sub3_4.method363(17379);
					}
					this.method92(local23, 242, local18, local33);
				}
				if (local28 == 68) {
					this.method92(local23, 171, local18, local33);
				}
				if (local28 == 975) {
					this.method144();
				}
				if (local28 == 215) {
					this.anInt171 = 1;
					this.anInt172 = local18;
					this.anInt173 = local23;
					this.anInt174 = local33;
					this.aString7 = Class5.method54(local33).aString3;
					this.anInt167 = 0;
				} else {
					if (local28 == 45) {
						this.aClass1_Sub3_Sub3_4.method361(174);
						this.aClass1_Sub3_Sub3_4.method363(local33);
						this.aClass1_Sub3_Sub3_4.method363(local18);
						this.aClass1_Sub3_Sub3_4.method363(local23);
						this.aClass1_Sub3_Sub3_4.method363(this.anInt168);
						this.anInt310 = 0;
						this.anInt311 = local23;
						this.anInt312 = local18;
						this.anInt313 = 2;
						if (Class15.aClass15Array1[local23].anInt450 == this.anInt216) {
							this.anInt313 = 1;
						}
						if (Class15.aClass15Array1[local23].anInt450 == this.anInt180) {
							this.anInt313 = 3;
						}
					}
					if (local28 == 943) {
						anInt148++;
						if (anInt148 >= 135) {
							this.aClass1_Sub3_Sub3_4.method361(85);
							this.aClass1_Sub3_Sub3_4.method363(10151);
						}
						this.method92(local23, 140, local18, local33);
					}
					if (local28 == 614 || local28 == 719 || local28 == 969 || local28 == 890 || local28 == 983) {
						local415 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
						if (local415 != null) {
							this.method147(false, local415.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local415.anIntArray232[0]);
							this.anInt206 = super.anInt133;
							this.anInt207 = super.anInt134;
							this.anInt209 = 2;
							this.anInt208 = 0;
							if (local28 == 890) {
								this.aClass1_Sub3_Sub3_4.method361(33);
							}
							if (local28 == 983) {
								this.aClass1_Sub3_Sub3_4.method361(175);
							}
							if (local28 == 614) {
								this.aClass1_Sub3_Sub3_4.method361(122);
							}
							if (local28 == 969) {
								this.aClass1_Sub3_Sub3_4.method361(87);
							}
							if (local28 == 719) {
								anInt218 += local33;
								if (anInt218 >= 116) {
									this.aClass1_Sub3_Sub3_4.method361(121);
								}
								this.aClass1_Sub3_Sub3_4.method361(60);
							}
							this.aClass1_Sub3_Sub3_4.method363(local33);
						}
					}
					if (local28 == 256) {
						if (this.aBoolean51) {
							this.aClass33_1.method486(local18 - 8, local23 - 11, this.anInt323);
						} else {
							this.aClass33_1.method486(super.anInt133 - 8, super.anInt134 - 11, this.anInt323);
						}
					}
					if (local28 == 409) {
						local76 = Class15.aClass15Array1[local23];
						this.anInt167 = 1;
						this.anInt168 = local23;
						this.anInt169 = local76.anInt472;
						this.anInt171 = 0;
						local489 = local76.aString21;
						if (local489.indexOf(" ") != -1) {
							local489 = local489.substring(0, local489.indexOf(" "));
						}
						local388 = local76.aString21;
						if (local388.indexOf(" ") != -1) {
							local388 = local388.substring(local388.indexOf(" ") + 1);
						}
						this.aString6 = local489 + " " + local76.aString22 + " " + local388;
						if (this.anInt169 == 16) {
							this.aBoolean52 = true;
							this.anInt282 = 3;
							this.aBoolean66 = true;
						}
					} else {
						if (local28 == 393) {
							this.method92(local23, 51, local18, local33);
						}
						if (local28 == 653) {
							this.method92(local23, 62, local18, local33);
						}
						if (local28 == 1654) {
							local480 = Class5.method54(local33);
							if (local23 >= 100000) {
								local489 = local23 + " x " + local480.aString3;
							} else if (local480.aByteArray3 == null) {
								local489 = "It's a " + local480.aString3 + ".";
							} else {
								local489 = new String(local480.aByteArray3);
							}
							this.method88(0, local489, "");
						}
						if (local28 == 785 && !this.aBoolean46) {
							this.aClass1_Sub3_Sub3_4.method361(197);
							this.aClass1_Sub3_Sub3_4.method363(local23);
							this.aBoolean46 = true;
						}
						if (local28 == 261) {
							this.aClass1_Sub3_Sub3_4.method361(203);
							this.aClass1_Sub3_Sub3_4.method363(local23);
							local76 = Class15.aClass15Array1[local23];
							if (local76.anIntArrayArray15 != null && local76.anIntArrayArray15[0][0] == 5) {
								local343 = local76.anIntArrayArray15[0][1];
								this.anIntArray35[local343] = 1 - this.anIntArray35[local343];
								this.method85(local343);
								this.aBoolean52 = true;
							}
						}
						if (local28 == 1586) {
							local415 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
							if (local415 != null) {
								if (local415.aClass3_1.aByteArray2 == null) {
									local489 = "It's a " + local415.aClass3_1.aString2 + ".";
								} else {
									local489 = new String(local415.aClass3_1.aByteArray2);
								}
								this.method88(0, local489, "");
							}
						}
						if (local28 == 308 || local28 == 445 || local28 == 848 || local28 == 221 || local28 == 273) {
							local139 = this.method147(false, local23, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local18);
							if (!local139) {
								this.method147(false, local23, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local18);
							}
							this.anInt206 = super.anInt133;
							this.anInt207 = super.anInt134;
							this.anInt209 = 2;
							this.anInt208 = 0;
							if (local28 == 445) {
								this.aClass1_Sub3_Sub3_4.method361(17);
							}
							if (local28 == 221) {
								this.aClass1_Sub3_Sub3_4.method361(69);
							}
							if (local28 == 273) {
								anInt317++;
								if (anInt317 >= 121) {
									this.aClass1_Sub3_Sub3_4.method361(210);
									this.aClass1_Sub3_Sub3_4.method362(128);
								}
								this.aClass1_Sub3_Sub3_4.method361(135);
							}
							if (local28 == 848) {
								this.aClass1_Sub3_Sub3_4.method361(55);
							}
							if (local28 == 308) {
								this.aClass1_Sub3_Sub3_4.method361(239);
							}
							this.aClass1_Sub3_Sub3_4.method363(local18 + this.anInt150);
							this.aClass1_Sub3_Sub3_4.method363(local23 + this.anInt151);
							this.aClass1_Sub3_Sub3_4.method363(local33);
						}
						if (local28 == 92) {
							local820 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
							if (local820 != null) {
								this.method147(false, local820.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local820.anIntArray232[0]);
								this.anInt206 = super.anInt133;
								this.anInt207 = super.anInt134;
								this.anInt209 = 2;
								this.anInt208 = 0;
								this.aClass1_Sub3_Sub3_4.method361(4);
								this.aClass1_Sub3_Sub3_4.method363(local33);
								this.aClass1_Sub3_Sub3_4.method363(this.anInt168);
							}
						}
						if (local28 == 65) {
							local820 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
							if (local820 != null) {
								this.method147(false, local820.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local820.anIntArray232[0]);
								this.anInt206 = super.anInt133;
								this.anInt207 = super.anInt134;
								this.anInt209 = 2;
								this.anInt208 = 0;
								this.aClass1_Sub3_Sub3_4.method361(100);
								this.aClass1_Sub3_Sub3_4.method363(local33);
								this.aClass1_Sub3_Sub3_4.method363(this.anInt174);
								this.aClass1_Sub3_Sub3_4.method363(this.anInt172);
								this.aClass1_Sub3_Sub3_4.method363(this.anInt173);
							}
						}
						this.anInt171 = 0;
						this.anInt167 = 0;
					}
				}
			}
		} catch (@Pc(1893) RuntimeException local1893) {
			signlink.reporterror("51421, " + 9 + ", " + arg0 + ", " + local1893.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method109(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(9) int local9 = 0; local9 < this.anInt215; local9++) {
				if (arg0.equalsIgnoreCase(this.aStringArray6[local9])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(this.aClass1_Sub1_Sub3_Sub2_1.aString30);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("48813, " + true + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method110() {
		try {
			this.method90();
			this.aBoolean70 &= true;
			this.aClass32_5.method444();
			this.aClass1_Sub3_Sub2_Sub3_9.method335(0, 0);
			@Pc(31) byte local31;
			@Pc(43) int local43;
			if (this.anInt306 == 0) {
				local31 = 20;
				this.aClass1_Sub3_Sub2_Sub4_3.method348(20, "Welcome to the RuneScape-2 BETA test.", 16776960, true, 180);
				local43 = local31 + 15;
				@Pc(44) int local44 = local43 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method348(50, "Please note this test version of the game is provided for ", 16777215, true, 180);
				@Pc(56) int local56 = local44 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method348(65, "testing/preview purposes only. As such please bear in mind that:", 16777215, true, 180);
				@Pc(68) int local68 = local56 + 15;
				@Pc(69) int local69 = local68 + 10;
				this.aClass1_Sub3_Sub2_Sub4_1.method348(90, "a) Everything you do/gain here will be forgotten when the beta ends.", 16777215, true, 180);
				@Pc(81) int local81 = local69 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method348(105, "b) No customer support is available for the beta.", 16777215, true, 180);
				@Pc(93) int local93 = local81 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method348(120, "c) The beta may be incomplete/buggy, we're still working on it.", 16777215, true, 180);
				@Pc(105) int local105 = local93 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method348(135, "d) The beta may be totally unavailable at times.", 16777215, true, 180);
				@Pc(117) int local117 = local105 + 15;
				this.aClass1_Sub3_Sub2_Sub3_10.method335(107, 145);
				this.aClass1_Sub3_Sub2_Sub4_3.method348(170, "Click here to login.", 16777215, true, 180);
			}
			if (this.anInt306 == 2) {
				local31 = 50;
				if (this.aString4.length() > 0) {
					this.aClass1_Sub3_Sub2_Sub4_3.method348(35, this.aString4, 16776960, true, 180);
					this.aClass1_Sub3_Sub2_Sub4_3.method348(50, this.aString5, 16776960, true, 180);
					local43 = local31 + 30;
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method348(43, this.aString5, 16776960, true, 180);
					local43 = local31 + 30;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method352(true, 16777215, 90, 80, "Username: " + this.aString13 + (this.anInt242 == 0 & anInt295 % 40 < 20 ? "@yel@|" : ""));
				local43 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method352(true, 16777215, 92, 95, "Password: " + Class40.method524(this.aString14) + (this.anInt242 == 1 & anInt295 % 40 < 20 ? "@yel@|" : ""));
				local43 += 15;
				this.aClass1_Sub3_Sub2_Sub3_10.method335(27, 120);
				this.aClass1_Sub3_Sub2_Sub4_3.method348(145, "Login", 16777215, true, 100);
				this.aClass1_Sub3_Sub2_Sub3_10.method335(187, 120);
				this.aClass1_Sub3_Sub2_Sub4_3.method348(145, "Cancel", 16777215, true, 260);
			}
			this.aClass32_5.method445(super.aGraphics2, 214, 186);
			if (this.aBoolean57) {
				this.aBoolean57 = false;
				this.aClass32_3.method445(super.aGraphics2, 128, 0);
				this.aClass32_4.method445(super.aGraphics2, 214, 386);
				this.aClass32_8.method445(super.aGraphics2, 0, 265);
				this.aClass32_9.method445(super.aGraphics2, 574, 265);
				this.aClass32_10.method445(super.aGraphics2, 128, 186);
				this.aClass32_11.method445(super.aGraphics2, 574, 186);
			}
		} catch (@Pc(417) RuntimeException local417) {
			signlink.reporterror("76811, " + true + ", " + local417.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method111() {
		try {
			if (this.anInt273 == 2) {
				this.method186(this.anInt224 * 2, (this.anInt223 - this.anInt151 << 7) + this.anInt226, (this.anInt222 - this.anInt150 << 7) + this.anInt225);
				if (this.anInt303 > -1 && anInt295 % 20 < 10) {
					this.aClass1_Sub3_Sub2_Sub2Array6[2].method308(this.anInt303 - 12, this.anInt304 - 28);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("66407, " + -617 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ib;)V")
	private void method112(@OriginalArg(1) Class1_Sub3_Sub2_Sub3 arg0) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray44.length; local9++) {
				this.anIntArray44[local9] = 0;
			}
			@Pc(34) int local34;
			for (@Pc(24) int local24 = 0; local24 < 5000; local24++) {
				local34 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray44[local34] = (int) (Math.random() * 256.0D);
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			@Pc(64) int local64;
			for (local34 = 0; local34 < 20; local34++) {
				for (local52 = 1; local52 < 255; local52++) {
					for (local56 = 1; local56 < 127; local56++) {
						local64 = local56 + (local52 << 7);
						this.anIntArray45[local64] = (this.anIntArray44[local64 - 1] + this.anIntArray44[local64 + 1] + this.anIntArray44[local64 - 128] + this.anIntArray44[local64 + 128]) / 4;
					}
				}
				@Pc(110) int[] local110 = this.anIntArray44;
				this.anIntArray44 = this.anIntArray45;
				this.anIntArray45 = local110;
			}
			if (arg0 != null) {
				local52 = 0;
				for (local56 = 0; local56 < arg0.anInt493; local56++) {
					for (local64 = 0; local64 < arg0.anInt492; local64++) {
						if (arg0.aByteArray7[local52++] != 0) {
							@Pc(146) int local146 = local64 + arg0.anInt494 + 16;
							@Pc(153) int local153 = local56 + arg0.anInt495 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray44[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("48687, " + 7 + ", " + arg0 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method113(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method114(@OriginalArg(0) int arg0) {
		try {
			this.aClass32_28.method444();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray59;
			this.aClass1_Sub3_Sub2_Sub3_18.method335(0, 0);
			if (this.aBoolean62) {
				this.aClass1_Sub3_Sub2_Sub4_3.method347(this.aString15, 40, 239, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method347(this.aString11 + "*", 60, 239, 128);
			} else if (this.aBoolean58) {
				this.aClass1_Sub3_Sub2_Sub4_3.method347("Enter amount to transfer:", 40, 239, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method347(this.aString12 + "*", 60, 239, 128);
			} else if (this.aString10 != null) {
				this.aClass1_Sub3_Sub2_Sub4_3.method347(this.aString10, 40, 239, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method347("Click to continue", 60, 239, 128);
			} else if (this.anInt180 != -1) {
				this.method183(0, Class15.aClass15Array1[this.anInt180], this.aByte11, 0, 0);
			} else if (this.anInt243 == -1) {
				@Pc(132) Class1_Sub3_Sub2_Sub4 local132 = this.aClass1_Sub3_Sub2_Sub4_2;
				@Pc(134) int local134 = 0;
				Class1_Sub3_Sub2.method341(this.aBoolean48, 0, 0, 463, 77);
				for (@Pc(143) int local143 = 0; local143 < 50; local143++) {
					if (this.aStringArray7[local143] != null) {
						@Pc(155) int local155 = this.anIntArray43[local143];
						@Pc(164) int local164 = this.anInt309 + 70 - local134 * 14;
						if (local155 == 0) {
							if (local164 > 0 && local164 < 110) {
								local132.method350(this.aStringArray7[local143], 4, local164, 0);
							}
							local134++;
						}
						if (local155 == 1) {
							if (local164 > 0 && local164 < 110) {
								local132.method350(this.aStringArray5[local143] + ":", 4, local164, 16777215);
								local132.method350(this.aStringArray7[local143], local132.method349(this.aStringArray5[local143]) + 12, local164, 255);
							}
							local134++;
						}
						if (local155 == 2 && (this.anInt154 == 0 || this.anInt154 == 1 && this.method109(this.aStringArray5[local143]))) {
							if (local164 > 0 && local164 < 110) {
								local132.method350(this.aStringArray5[local143] + ":", 4, local164, 0);
								local132.method350(this.aStringArray7[local143], local132.method349(this.aStringArray5[local143]) + 12, local164, 255);
							}
							local134++;
						}
						if (local155 == 3 && (this.anInt214 == 0 || this.anInt214 == 1 && this.method109(this.aStringArray5[local143]))) {
							if (local164 > 0 && local164 < 110) {
								local132.method350("From " + this.aStringArray5[local143] + ":", 4, local164, 0);
								local132.method350(this.aStringArray7[local143], local132.method349("From " + this.aStringArray5[local143]) + 12, local164, 8388608);
							}
							local134++;
						}
						if (local155 == 4 && (this.anInt316 == 0 || this.anInt316 == 1 && this.method109(this.aStringArray5[local143]))) {
							if (local164 > 0 && local164 < 110) {
								local132.method350(this.aStringArray5[local143] + " " + this.aStringArray7[local143], 4, local164, 8388736);
							}
							local134++;
						}
						if (local155 == 5 && this.anInt214 < 2) {
							if (local164 > 0 && local164 < 110) {
								local132.method350(this.aStringArray7[local143], 4, local164, 8388608);
							}
							local134++;
						}
						if (local155 == 6 && this.anInt214 < 2) {
							if (local164 > 0 && local164 < 110) {
								local132.method350("To " + this.aStringArray5[local143] + ":", 4, local164, 0);
								local132.method350(this.aStringArray7[local143], local132.method349("To " + this.aStringArray5[local143]) + 12, local164, 8388608);
							}
							local134++;
						}
						if (local155 == 7) {
							if (local164 > 0 && local164 < 110) {
								local132.method350("From " + this.aStringArray5[local143] + ":", 4, local164, 0);
								local132.method350(this.aStringArray7[local143], local132.method349("From " + this.aStringArray5[local143]) + 12, local164, 8388608);
							}
							local134++;
						}
						if (local155 == 8 && (this.anInt316 == 0 || this.anInt316 == 1 && this.method109(this.aStringArray5[local143]))) {
							if (local164 > 0 && local164 < 110) {
								local132.method350(this.aStringArray5[local143] + " " + this.aStringArray7[local143], 4, local164, 13350793);
							}
							local134++;
						}
					}
				}
				Class1_Sub3_Sub2.method340();
				this.anInt193 = local134 * 14 + 7;
				if (this.anInt193 < 78) {
					this.anInt193 = 78;
				}
				this.method117(463, this.anInt193 - this.anInt309 - 77, 77, 0, this.anInt193);
				local132.method350(Class40.method522(this.aString13) + ":", 4, 90, 0);
				local132.method350(this.aString8 + "*", local132.method349(this.aString13 + ": ") + 6, 90, 255);
				Class1_Sub3_Sub2.method345(0, 77, 479, 0);
			} else {
				this.method183(0, Class15.aClass15Array1[this.anInt243], this.aByte11, 0, 0);
			}
			this.aClass32_28.method445(super.aGraphics2, 22, 375);
			this.aClass32_27.method444();
			this.anInt288 += arg0;
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray61;
		} catch (@Pc(681) RuntimeException local681) {
			signlink.reporterror("52768, " + arg0 + ", " + local681.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt220 = Integer.parseInt(this.getParameter("nodeid"));
		anInt221 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method175();
		} else {
			method116();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean54 = false;
		} else {
			aBoolean54 = true;
		}
		this.method63();
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method115() {
		try {
			@Pc(8) int local8 = this.anInt247;
			@Pc(11) int local11 = this.anInt248;
			@Pc(14) int local14 = this.anInt249;
			@Pc(17) int local17 = this.anInt250;
			Class1_Sub3_Sub2.method343(6116423, local11, local8, local14, local17);
			Class1_Sub3_Sub2.method343(0, local11 + 1, local8 + 1, local14 - 2, 16);
			Class1_Sub3_Sub2.method344(local14 - 2, 0, local11 + 18, local8 + 1, local17 - 19);
			this.aClass1_Sub3_Sub2_Sub4_3.method350("Choose Option", local8 + 3, local11 + 14, 6116423);
			@Pc(69) int local69 = super.anInt130;
			@Pc(72) int local72 = super.anInt131;
			if (this.anInt246 == 0) {
				local69 -= 8;
				local72 -= 11;
			}
			if (this.anInt246 == 1) {
				local69 -= 562;
				local72 -= 231;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt162; local85++) {
				@Pc(100) int local100 = local11 + (this.anInt162 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local69 > local8 && local69 < local8 + local14 && local72 > local100 - 13 && local72 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method352(true, local102, local8 + 3, local100, this.aStringArray8[local85]);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("89487, " + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub3_Sub2_Sub3_19.method335(arg0, arg3);
			this.aClass1_Sub3_Sub2_Sub3_20.method335(arg0, arg3 + arg2 - 16);
			Class1_Sub3_Sub2.method343(this.anInt258, arg3 + 16, arg0, 16, arg2 - 32);
			@Pc(41) int local41 = (arg2 - 32) * arg2 / arg4;
			if (local41 < 8) {
				local41 = 8;
			}
			@Pc(58) int local58 = (arg2 - local41 - 32) * arg1 / (arg4 - arg2);
			Class1_Sub3_Sub2.method343(this.anInt255, arg3 + local58 + 16, arg0, 16, local41);
			Class1_Sub3_Sub2.method346(local41, this.anInt270, arg3 + local58 + 16, arg0);
			Class1_Sub3_Sub2.method346(local41, this.anInt270, arg3 + local58 + 16, arg0 + 1);
			Class1_Sub3_Sub2.method345(arg0, arg3 + local58 + 16, 16, this.anInt270);
			Class1_Sub3_Sub2.method345(arg0, arg3 + local58 + 17, 16, this.anInt270);
			Class1_Sub3_Sub2.method346(local41, this.anInt308, arg3 + local58 + 16, arg0 + 15);
			Class1_Sub3_Sub2.method346(local41 - 1, this.anInt308, arg3 + local58 + 17, arg0 + 14);
			Class1_Sub3_Sub2.method345(arg0, arg3 + local58 + local41 + 15, 16, this.anInt308);
			Class1_Sub3_Sub2.method345(arg0 + 1, arg3 + 14 + local58 + local41, 15, this.anInt308);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("13755, " + arg0 + ", " + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZLclient!kb;)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			this.anInt281 = 0;
			this.anInt158 = 0;
			this.method161(arg0, this.anInt170, arg1);
			this.method154(arg1, arg0);
			this.method166(arg0, arg1);
			this.method127(arg0, arg1);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt281; local30++) {
				local37 = this.anIntArray70[local30];
				if (this.aClass1_Sub1_Sub3_Sub2Array1[local37].anInt915 != anInt295) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local37] = null;
				}
			}
			if (arg1.anInt539 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt539 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt157; local37++) {
				if (this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray30[local37]] == null) {
					signlink.reporterror(this.aString13 + " null entry in pl list - pos:" + local37 + " size:" + this.anInt157);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("51381, " + arg0 + ", " + true + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method119(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString4 = "";
				this.aString5 = "Connecting to server...";
				this.method110();
			}
			this.aClass6_1 = new Class6(this.method142(anInt221 + 43594), this, (byte) 7);
			this.aClass6_1.method193(this.aClass1_Sub3_Sub3_5.aByteArray8, 0, 8);
			this.aClass1_Sub3_Sub3_5.anInt539 = 0;
			this.aLong9 = this.aClass1_Sub3_Sub3_5.method378();
			@Pc(47) int[] local47 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong9 >> 32), (int) this.aLong9 };
			this.aClass1_Sub3_Sub3_4.anInt539 = 0;
			this.aClass1_Sub3_Sub3_4.method362(10);
			this.aClass1_Sub3_Sub3_4.method366(local47[0]);
			this.aClass1_Sub3_Sub3_4.method366(local47[1]);
			this.aClass1_Sub3_Sub3_4.method366(local47[2]);
			this.aClass1_Sub3_Sub3_4.method366(local47[3]);
			this.aClass1_Sub3_Sub3_4.method366(signlink.anInt732);
			this.aClass1_Sub3_Sub3_4.method369(arg0);
			this.aClass1_Sub3_Sub3_4.method369(arg1);
			this.aClass1_Sub3_Sub3_4.method387(aBigInteger2, aBigInteger1);
			this.aClass1_Sub3_Sub3_6.anInt539 = 0;
			if (arg2) {
				this.aClass1_Sub3_Sub3_6.method362(18);
			} else {
				this.aClass1_Sub3_Sub3_6.method362(16);
			}
			this.aClass1_Sub3_Sub3_6.method362(this.aClass1_Sub3_Sub3_4.anInt539 + 36 + 1);
			this.aClass1_Sub3_Sub3_6.method362(204);
			for (@Pc(157) int local157 = 0; local157 < 9; local157++) {
				this.aClass1_Sub3_Sub3_6.method366(this.anIntArray77[local157]);
			}
			this.aClass1_Sub3_Sub3_6.method370((byte) 4, this.aClass1_Sub3_Sub3_4.anInt539, this.aClass1_Sub3_Sub3_4.aByteArray8);
			this.aClass1_Sub3_Sub3_4.aClass38_2 = new Class38((byte) 68, local47);
			for (@Pc(191) int local191 = 0; local191 < 4; local191++) {
				local47[local191] += 50;
			}
			this.aClass38_1 = new Class38((byte) 68, local47);
			this.aClass6_1.method194(this.aClass1_Sub3_Sub3_6.aByteArray8, this.aBoolean71, this.aClass1_Sub3_Sub3_6.anInt539);
			@Pc(227) int local227 = this.aClass6_1.method191();
			if (local227 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(234) Exception local234) {
				}
				this.method119(arg0, arg1, arg2);
				return;
			}
			if (local227 == 2 || local227 == 18) {
				if (local227 == 18) {
					this.aBoolean63 = true;
				} else {
					this.aBoolean63 = false;
				}
				Class8.method198(false);
				this.aBoolean70 = true;
				this.aClass1_Sub3_Sub3_4.anInt539 = 0;
				this.aClass1_Sub3_Sub3_5.anInt539 = 0;
				this.anInt289 = -1;
				this.anInt233 = -1;
				this.anInt234 = -1;
				this.anInt235 = -1;
				this.anInt288 = 0;
				this.anInt290 = 0;
				this.anInt190 = 0;
				this.anInt292 = 0;
				this.anInt273 = 0;
				this.anInt162 = 0;
				this.aBoolean51 = false;
				super.anInt128 = 0;
				for (@Pc(309) int local309 = 0; local309 < 100; local309++) {
					this.aStringArray7[local309] = null;
				}
				this.anInt171 = 0;
				this.anInt167 = 0;
				this.anInt145 = 0;
				this.anInt283 = 0;
				this.anInt278 = -1;
				this.anInt286 = 0;
				this.anInt287 = 0;
				this.anInt157 = 0;
				this.anInt183 = 0;
				for (@Pc(349) int local349 = 0; local349 < this.anInt155; local349++) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local349] = null;
					this.aClass1_Sub3_Sub3Array1[local349] = null;
				}
				for (@Pc(368) int local368 = 0; local368 < 8192; local368++) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local368] = null;
				}
				this.aClass1_Sub1_Sub3_Sub2_1 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anInt156] = new Class1_Sub1_Sub3_Sub2();
				this.aClass28_3.method441();
				this.aClass28_4.method441();
				this.aClass28_5.method441();
				@Pc(405) int local405;
				for (@Pc(401) int local401 = 0; local401 < 4; local401++) {
					for (local405 = 0; local405 < 104; local405++) {
						for (@Pc(409) int local409 = 0; local409 < 104; local409++) {
							this.aClass28ArrayArrayArray1[local401][local405][local409] = null;
						}
					}
				}
				this.aClass28_2 = new Class28((byte) 3);
				this.anInt215 = 0;
				this.anInt243 = -1;
				this.anInt180 = -1;
				this.anInt216 = -1;
				this.anInt161 = -1;
				this.aBoolean46 = false;
				this.anInt282 = 3;
				this.aBoolean58 = false;
				this.aBoolean51 = false;
				this.aBoolean62 = false;
				this.aString10 = null;
				this.anInt202 = 0;
				this.aBoolean79 = true;
				this.method176();
				for (local405 = 0; local405 < 5; local405++) {
					this.anIntArray38[local405] = 0;
				}
				anInt187 = 0;
				anInt317 = 0;
				anInt213 = 0;
				anInt195 = 0;
				anInt185 = 0;
				anInt274 = 0;
				anInt218 = 0;
				anInt178 = 0;
				anInt148 = 0;
				this.method124();
				return;
			}
			if (local227 == 3) {
				this.aString4 = "";
				this.aString5 = "Invalid username or password.";
				return;
			}
			if (local227 == 4) {
				this.aString4 = "Your account has been disabled.";
				this.aString5 = "Please check your message-centre for details.";
				return;
			}
			if (local227 == 5) {
				this.aString4 = "Your account is already logged in.";
				this.aString5 = "Try again in 60 secs...";
				return;
			}
			if (local227 == 6) {
				this.aString4 = "RuneScape has been updated!";
				this.aString5 = "Please reload this page.";
				return;
			}
			if (local227 == 7) {
				this.aString4 = "This world is full.";
				this.aString5 = "Please use a different world.";
				return;
			}
			if (local227 == 8) {
				this.aString4 = "Unable to connect.";
				this.aString5 = "Login server offline.";
				return;
			}
			if (local227 == 9) {
				this.aString4 = "Login limit exceeded.";
				this.aString5 = "Too many connections from your address.";
				return;
			}
			if (local227 == 10) {
				this.aString4 = "Unable to connect.";
				this.aString5 = "Bad session id.";
				return;
			}
			if (local227 == 11) {
				this.aString5 = "Login server rejected session.";
				this.aString5 = "Please try again";
				return;
			}
			if (local227 == 12) {
				this.aString4 = "You need a members account to beta-test";
				this.aString5 = "Please subscribe, or play RS1 instead";
				return;
			}
			if (local227 == 13) {
				this.aString4 = "Could not complete login";
				this.aString5 = "Please try using a different world";
				return;
			}
			if (local227 == 14) {
				this.aString4 = "The server is being updated";
				this.aString5 = "Please wait 1 minute and try again";
				return;
			}
			if (local227 == 15) {
				this.aBoolean70 = true;
				this.aClass1_Sub3_Sub3_4.anInt539 = 0;
				this.aClass1_Sub3_Sub3_5.anInt539 = 0;
				this.anInt289 = -1;
				this.anInt233 = -1;
				this.anInt234 = -1;
				this.anInt235 = -1;
				this.anInt288 = 0;
				this.anInt290 = 0;
				this.anInt190 = 0;
				this.anInt162 = 0;
				this.aBoolean51 = false;
				return;
			}
			if (local227 == 16) {
				this.aString4 = "Login attempts exceeded";
				this.aString5 = "Please wait 1 minute and try again";
				return;
			}
			if (local227 == 17) {
				this.aString4 = "You are standing in a members-only area";
				this.aString5 = "To play on this world move to a free area first";
				return;
			}
		} catch (@Pc(700) IOException local700) {
			this.aString4 = "";
			this.aString5 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method120() {
		try {
			if (super.anInt132 == 1) {
				if (super.anInt133 >= 8 && super.anInt133 <= 108 && super.anInt134 >= 490 && super.anInt134 <= 522) {
					this.anInt154 = (this.anInt154 + 1) % 3;
					this.aBoolean61 = true;
					this.aBoolean64 = true;
					this.aClass1_Sub3_Sub3_4.method361(206);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt154);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt214);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt316);
				}
				if (super.anInt133 >= 137 && super.anInt133 <= 237 && super.anInt134 >= 490 && super.anInt134 <= 522) {
					this.anInt214 = (this.anInt214 + 1) % 3;
					this.aBoolean61 = true;
					this.aBoolean64 = true;
					this.aClass1_Sub3_Sub3_4.method361(206);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt154);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt214);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt316);
				}
				if (super.anInt133 >= 275 && super.anInt133 <= 375 && super.anInt134 >= 490 && super.anInt134 <= 522) {
					this.anInt316 = (this.anInt316 + 1) % 3;
					this.aBoolean61 = true;
					this.aBoolean64 = true;
					this.aClass1_Sub3_Sub3_4.method361(206);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt154);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt214);
					this.aClass1_Sub3_Sub3_4.method362(this.anInt316);
				}
				if (super.anInt133 >= 416 && super.anInt133 <= 516 && super.anInt134 >= 490 && super.anInt134 <= 522) {
					this.method144();
					this.aString17 = "";
					this.aBoolean60 = false;
					for (@Pc(187) int local187 = 0; local187 < Class15.aClass15Array1.length; local187++) {
						if (Class15.aClass15Array1[local187] != null && Class15.aClass15Array1[local187].anInt453 == 600) {
							this.anInt293 = this.anInt216 = Class15.aClass15Array1[local187].anInt450;
							break;
						}
					}
				}
				anInt305++;
				if (anInt305 > 195) {
					anInt305 = 0;
					this.aClass1_Sub3_Sub3_4.method361(29);
					this.aClass1_Sub3_Sub3_4.method362(239);
					return;
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("33926, " + 699 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method121() {
		try {
			for (@Pc(6) Class1_Sub1_Sub2 local6 = (Class1_Sub1_Sub2) this.aClass28_4.method437(); local6 != null; local6 = (Class1_Sub1_Sub2) this.aClass28_4.method439(this.aByte14)) {
				if (local6.anInt60 != this.anInt269 || local6.aBoolean20) {
					local6.method547();
				} else if (anInt295 >= local6.anInt59) {
					local6.method29(this.anInt184);
					if (local6.aBoolean20) {
						local6.method547();
					} else {
						this.aClass33_1.method459(0, 775, local6, null, -1, local6.anInt61, false, 60, local6.anInt60, local6.anInt62, local6.anInt63);
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("29027, " + 85 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method122() {
		try {
			this.aClass1_Sub3_Sub2_Sub3_9 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebox", 0);
			this.aClass1_Sub3_Sub2_Sub3_10 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebutton", 0);
			this.aClass1_Sub3_Sub2_Sub3Array2 = new Class1_Sub3_Sub2_Sub3[12];
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				this.aClass1_Sub3_Sub2_Sub3Array2[local35] = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "runes", local35);
			}
			this.aClass1_Sub3_Sub2_Sub2_4 = new Class1_Sub3_Sub2_Sub2(128, 265);
			this.aClass1_Sub3_Sub2_Sub2_5 = new Class1_Sub3_Sub2_Sub2(128, 265);
			for (@Pc(68) int local68 = 0; local68 < 33920; local68++) {
				this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148[local68] = this.aClass32_6.anIntArray197[local68];
			}
			for (@Pc(86) int local86 = 0; local86 < 33920; local86++) {
				this.aClass1_Sub3_Sub2_Sub2_5.anIntArray148[local86] = this.aClass32_7.anIntArray197[local86];
			}
			this.anIntArray47 = new int[256];
			for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
				this.anIntArray47[local108] = local108 * 262144;
			}
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				this.anIntArray47[local123 + 64] = local123 * 1024 + 16711680;
			}
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray47[local142 + 128] = local142 * 4 + 16776960;
			}
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				this.anIntArray47[local161 + 192] = 16777215;
			}
			this.anIntArray48 = new int[256];
			for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
				this.anIntArray48[local180] = local180 * 1024;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray48[local195 + 64] = local195 * 4 + 65280;
			}
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray48[local214 + 128] = local214 * 262144 + 65535;
			}
			for (@Pc(233) int local233 = 0; local233 < 64; local233++) {
				this.anIntArray48[local233 + 192] = 16777215;
			}
			this.anIntArray49 = new int[256];
			for (@Pc(252) int local252 = 0; local252 < 64; local252++) {
				this.anIntArray49[local252] = local252 * 4;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray49[local267 + 64] = local267 * 262144 + 255;
			}
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray49[local286 + 128] = local286 * 1024 + 16711935;
			}
			for (@Pc(305) int local305 = 0; local305 < 64; local305++) {
				this.anIntArray49[local305 + 192] = 16777215;
			}
			this.anIntArray46 = new int[256];
			this.anIntArray44 = new int[32768];
			this.anIntArray45 = new int[32768];
			this.method112(null);
			this.anIntArray40 = new int[32768];
			this.anIntArray41 = new int[32768];
			this.method74(10, "Connecting to fileserver");
			if (!this.aBoolean53) {
				this.aBoolean47 = true;
				this.aBoolean53 = true;
				this.method73(this, 2);
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("75560, " + 688 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			return ((arg0 & 0xFF00FF) * local3 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("74686, " + arg0 + ", " + 535 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method124() {
		try {
			if (this.aClass32_28 == null) {
				this.method76();
				super.aClass32_2 = null;
				this.aClass32_3 = null;
				this.aClass32_4 = null;
				this.aClass32_5 = null;
				this.aClass32_6 = null;
				this.aClass32_7 = null;
				this.aClass32_8 = null;
				this.aClass32_9 = null;
				this.aClass32_10 = null;
				this.aClass32_11 = null;
				this.aClass32_28 = new Class32(this.method72((byte) 9), 479, 96, true);
				this.aClass32_26 = new Class32(this.method72((byte) 9), 168, 160, true);
				Class1_Sub3_Sub2.method342();
				this.aClass1_Sub3_Sub2_Sub3_17.method335(0, 0);
				this.aClass32_25 = new Class32(this.method72((byte) 9), 190, 261, true);
				this.aClass32_27 = new Class32(this.method72((byte) 9), 512, 334, true);
				Class1_Sub3_Sub2.method342();
				this.aClass32_12 = new Class32(this.method72((byte) 9), 501, 61, true);
				this.aClass32_13 = new Class32(this.method72((byte) 9), 288, 40, true);
				this.aClass32_14 = new Class32(this.method72((byte) 9), 269, 66, true);
				this.aBoolean57 = true;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("36173, " + -242 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method125(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) int local10 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt873 >> 7) + this.anInt150;
			@Pc(19) int local19 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt874 >> 7) + this.anInt151;
			if (local10 >= 2944 && local10 < 3392 && local19 >= 3520 && local19 < 6400) {
				this.anInt228 = (local19 - 3520) / 8 + 1;
			} else if (local10 >= 2944 && local10 < 3392 && local19 >= 9920 && local19 < 12800) {
				this.anInt228 = (local19 - 9920) / 8 + 1;
			} else {
				this.anInt228 = 0;
			}
			this.anInt239 = 0;
			if (local10 >= 3328 && local10 < 3392 && local19 >= 3200 && local19 < 3264) {
				@Pc(87) int local87 = local10 & 0x3F;
				@Pc(91) int local91 = local19 & 0x3F;
				if (local87 >= 4 && local87 <= 29 && local91 >= 44 && local91 <= 58) {
					this.anInt239 = 1;
				}
				if (local87 >= 36 && local87 <= 61 && local91 >= 44 && local91 <= 58) {
					this.anInt239 = 1;
				}
				if (local87 >= 4 && local87 <= 29 && local91 >= 25 && local91 <= 39) {
					this.anInt239 = 1;
				}
				if (local87 >= 36 && local87 <= 61 && local91 >= 25 && local91 <= 39) {
					this.anInt239 = 1;
				}
				if (local87 >= 4 && local87 <= 29 && local91 >= 6 && local91 <= 20) {
					this.anInt239 = 1;
				}
				if (local87 >= 36 && local87 <= 61 && local91 >= 6 && local91 <= 20) {
					this.anInt239 = 1;
				}
			}
			if (this.anInt239 == 0 && local10 >= 3328 && local10 <= 3393 && local19 >= 3203 && local19 <= 3325) {
				this.anInt239 = 2;
			}
			this.anInt298 = 0;
			@Pc(206) boolean local206 = false;
			if (local10 >= 3053 && local10 <= 3156 && local19 >= 3056 && local19 <= 3136) {
				this.anInt298 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local19 >= 9492 && local19 <= 9535) {
				this.anInt298 = 1;
			}
			if (this.anInt298 == 1 && local10 >= 3139 && local10 <= 3199 && local19 >= 3008 && local19 <= 3062) {
				this.anInt298 = 0;
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("98865, " + arg0 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method126() {
		try {
			if (this.anInt292 > 0) {
				this.method178();
			} else {
				this.aClass32_27.method444();
				this.aClass1_Sub3_Sub2_Sub4_2.method347("Connection lost", 144, 257, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method347("Connection lost", 143, 256, 16777215);
				this.aClass1_Sub3_Sub2_Sub4_2.method347("Please wait - attempting to reestablish", 159, 257, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method347("Please wait - attempting to reestablish", 158, 256, 16777215);
				this.aClass32_27.method445(super.aGraphics2, 8, 11);
				this.anInt286 = 0;
				@Pc(65) Class6 local65 = this.aClass6_1;
				this.aBoolean70 = false;
				this.method119(this.aString13, this.aString14, true);
				if (!this.aBoolean70) {
					this.method178();
				}
				try {
					local65.method190();
				} catch (@Pc(85) Exception local85) {
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("44538, " + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;I)V")
	private void method127(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt158; local1++) {
				@Pc(8) int local8 = this.anIntArray31[local1];
				@Pc(13) Class1_Sub1_Sub3_Sub2 local13 = this.aClass1_Sub1_Sub3_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method372();
				if ((local16 & 0x80) == 128) {
					local16 += arg1.method372() << 8;
				}
				this.method174(local13, arg1, local16, local8);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("70997, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method128(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt197 * 128 + 64;
			@Pc(13) int local13 = this.anInt198 * 128 + 64;
			@Pc(26) int local26 = this.method132(this.anInt269, this.anInt197, this.anInt198) - this.anInt199;
			if (this.anInt140 < local6) {
				this.anInt140 += this.anInt200 + (local6 - this.anInt140) * this.anInt201 / 1000;
				if (this.anInt140 > local6) {
					this.anInt140 = local6;
				}
			}
			if (this.anInt140 > local6) {
				this.anInt140 -= this.anInt200 + (this.anInt140 - local6) * this.anInt201 / 1000;
				if (this.anInt140 < local6) {
					this.anInt140 = local6;
				}
			}
			if (this.anInt141 < local26) {
				this.anInt141 += this.anInt200 + (local26 - this.anInt141) * this.anInt201 / 1000;
				if (this.anInt141 > local26) {
					this.anInt141 = local26;
				}
			}
			if (this.anInt141 > local26) {
				this.anInt141 -= this.anInt200 + (this.anInt141 - local26) * this.anInt201 / 1000;
				if (this.anInt141 < local26) {
					this.anInt141 = local26;
				}
			}
			if (this.anInt142 < local13) {
				this.anInt142 += this.anInt200 + (local13 - this.anInt142) * this.anInt201 / 1000;
				if (this.anInt142 > local13) {
					this.anInt142 = local13;
				}
			}
			if (this.anInt142 > local13) {
				this.anInt142 -= this.anInt200 + (this.anInt142 - local13) * this.anInt201 / 1000;
				if (this.anInt142 < local13) {
					this.anInt142 = local13;
				}
			}
			local6 = this.anInt318 * 128 + 64;
			@Pc(206) int local206;
			if (arg0 != -40687) {
				for (local206 = 1; local206 > 0; local206++) {
				}
			}
			local13 = this.anInt319 * 128 + 64;
			local26 = this.method132(this.anInt269, this.anInt318, this.anInt319) - this.anInt320;
			local206 = local6 - this.anInt140;
			@Pc(241) int local241 = local26 - this.anInt141;
			@Pc(246) int local246 = local13 - this.anInt142;
			@Pc(257) int local257 = (int) Math.sqrt((double) (local206 * local206 + local246 * local246));
			@Pc(268) int local268 = (int) (Math.atan2((double) local241, (double) local257) * 325.949D) & 0x7FF;
			@Pc(279) int local279 = (int) (Math.atan2((double) local206, (double) local246) * -325.949D) & 0x7FF;
			if (local268 < 128) {
				local268 = 128;
			}
			if (local268 > 383) {
				local268 = 383;
			}
			if (this.anInt143 < local268) {
				this.anInt143 += this.anInt321 + (local268 - this.anInt143) * this.anInt322 / 1000;
				if (this.anInt143 > local268) {
					this.anInt143 = local268;
				}
			}
			if (this.anInt143 > local268) {
				this.anInt143 -= this.anInt321 + (this.anInt143 - local268) * this.anInt322 / 1000;
				if (this.anInt143 < local268) {
					this.anInt143 = local268;
				}
			}
			@Pc(350) int local350 = local279 - this.anInt144;
			if (local350 > 1024) {
				local350 -= 2048;
			}
			if (local350 < -1024) {
				local350 += 2048;
			}
			if (local350 > 0) {
				this.anInt144 += this.anInt321 + local350 * this.anInt322 / 1000;
			}
			if (local350 < 0) {
				this.anInt144 -= this.anInt321 + -local350 * this.anInt322 / 1000;
			}
			@Pc(396) int local396 = local279 - this.anInt144;
			if (local396 > 1024) {
				local396 -= 2048;
			}
			if (local396 < -1024) {
				local396 += 2048;
			}
			if (local396 < 0 && local350 > 0 || local396 > 0 && local350 < 0) {
				this.anInt144 = local279;
			}
		} catch (@Pc(417) RuntimeException local417) {
			signlink.reporterror("52925, " + arg0 + ", " + local417.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method129() {
		try {
			this.anInt182++;
			this.method143();
			this.method84();
			this.method103(665);
			this.method121();
			this.method173();
			@Pc(28) int local28;
			@Pc(67) int local67;
			if (!this.aBoolean73) {
				local28 = this.anInt229;
				if (this.anInt149 / 256 > local28) {
					local28 = this.anInt149 / 256;
				}
				if (this.aBooleanArray1[4] && this.anIntArray73[4] + 128 > local28) {
					local28 = this.anIntArray73[4] + 128;
				}
				local67 = this.anInt230 + this.anInt265 & 0x7FF;
				this.method78(this.anInt297, local28 * 3 + 600, this.anInt296, this.method133(this.aClass1_Sub1_Sub3_Sub2_1.anInt873, this.anInt296, this.anInt269, this.anInt297, this.anInt253, this.aClass1_Sub1_Sub3_Sub2_1.anInt874) - 50, local67, local28);
			}
			if (this.aBoolean73) {
				local28 = this.method146();
			} else {
				local28 = this.method145();
			}
			local67 = this.anInt140;
			@Pc(118) int local118 = this.anInt141;
			@Pc(121) int local121 = this.anInt142;
			@Pc(124) int local124 = this.anInt143;
			@Pc(127) int local127 = this.anInt144;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray1[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray82[local129] * 2 + 1) - (double) this.anIntArray82[local129] + Math.sin((double) this.anIntArray33[local129] * ((double) this.anIntArray52[local129] / 100.0D)) * (double) this.anIntArray73[local129]);
					if (local129 == 0) {
						this.anInt140 += local176;
					}
					if (local129 == 1) {
						this.anInt141 += local176;
					}
					if (local129 == 2) {
						this.anInt142 += local176;
					}
					if (local129 == 3) {
						this.anInt144 = this.anInt144 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt143 += local176;
						if (this.anInt143 < 128) {
							this.anInt143 = 128;
						}
						if (this.anInt143 > 383) {
							this.anInt143 = 383;
						}
					}
				}
			}
			local176 = Class1_Sub3_Sub2_Sub1.anInt413;
			Class1_Sub3_Sub1.aBoolean91 = true;
			Class1_Sub3_Sub1.anInt358 = 0;
			Class1_Sub3_Sub1.anInt356 = super.anInt130 - 8;
			Class1_Sub3_Sub1.anInt357 = super.anInt131 - 11;
			Class1_Sub3_Sub2.method342();
			this.aClass33_1.method487(this.anInt141, this.anInt142, this.anInt143, this.anInt144, local28, (byte) 2, this.anInt140);
			this.aClass33_1.method462();
			this.method180();
			this.method111();
			this.method134(local176);
			this.method170();
			this.aClass32_27.method445(super.aGraphics2, 8, 11);
			this.anInt140 = local67;
			this.anInt141 = local118;
			this.anInt142 = local121;
			this.anInt143 = local124;
			this.anInt144 = local127;
		} catch (@Pc(324) RuntimeException local324) {
			signlink.reporterror("45556, " + true + ", " + local324.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method130(@OriginalArg(0) String arg0) {
		try {
			signlink.aString25 = arg0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("56162, " + arg0 + ", " + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;II)Lclient!ub;")
	private Class39 method131(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(11) int local11 = 5;
			@Pc(14) byte[] local14 = signlink.cacheload(arg0);
			@Pc(28) int local28;
			if (local14 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local14);
				local28 = (int) this.aCRC32_1.getValue();
				if (local28 != arg1) {
					local14 = null;
				}
			}
			if (local14 != null) {
				return new Class39(local14, -856);
			}
			while (local14 == null) {
				this.method74(arg3, "Requesting " + arg2);
				try {
					local28 = 0;
					@Pc(67) DataInputStream local67 = this.method113(arg0 + arg1);
					@Pc(70) byte[] local70 = new byte[6];
					local67.readFully(local70, 0, 6);
					@Pc(81) Class1_Sub3_Sub3 local81 = new Class1_Sub3_Sub3(local70, aBoolean59);
					local81.anInt539 = 3;
					@Pc(89) int local89 = local81.method376() + 6;
					@Pc(91) int local91 = 6;
					local14 = new byte[local89];
					for (@Pc(96) int local96 = 0; local96 < 6; local96++) {
						local14[local96] = local70[local96];
					}
					while (local91 < local89) {
						@Pc(114) int local114 = local89 - local91;
						if (local114 > 1000) {
							local114 = 1000;
						}
						local91 += local67.read(local14, local91, local114);
						@Pc(133) int local133 = local91 * 100 / local89;
						if (local133 != local28) {
							this.method74(arg3, "Loading " + arg2 + " - " + local133 + "%");
						}
						local28 = local133;
					}
					local67.close();
				} catch (@Pc(162) IOException local162) {
					local14 = null;
					for (local28 = local11; local28 > 0; local28--) {
						this.method74(arg3, "Error loading - Will retry in " + local28 + " secs.");
						try {
							Thread.sleep(1000L);
						} catch (@Pc(185) Exception local185) {
						}
					}
					local11 *= 2;
					if (local11 > 60) {
						local11 = 60;
					}
				}
			}
			signlink.cachesave(arg0, local14);
			return new Class39(local14, -856);
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("86237, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 353 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			@Pc(9) int local9 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local9 = arg0 + 1;
			}
			@Pc(29) int local29 = arg1 & 0x7F;
			@Pc(33) int local33 = arg2 & 0x7F;
			@Pc(61) int local61 = this.anIntArrayArrayArray3[local9][local3][local7] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7] * local29 >> 7;
			@Pc(99) int local99 = this.anIntArrayArrayArray3[local9][local3][local7 + 1] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7 + 1] * local29 >> 7;
			return local61 * (128 - local33) + local99 * local33 >> 7;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("49962, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)I")
	private int method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(1) int local1 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray7[1][arg0 >> 7][arg5 >> 7] & 0x2) == 2) {
				local1 = arg2 + 1;
			}
			@Pc(25) int local25 = arg1 >> 7;
			@Pc(29) int local29 = arg3 >> 7;
			if (arg4 != 0) {
				this.anInt289 = this.aClass1_Sub3_Sub3_5.method372();
			}
			@Pc(40) int local40 = arg1 & 0x7F;
			@Pc(44) int local44 = arg3 & 0x7F;
			@Pc(72) int local72 = this.anIntArrayArrayArray3[local1][local25][local29] * (128 - local40) + this.anIntArrayArrayArray3[local1][local25 + 1][local29] * local40 >> 7;
			@Pc(104) int local104 = this.anIntArrayArrayArray3[local1][local25][local29 + 1] * (128 - local40) + this.anIntArrayArrayArray3[local1][local25 + 1][local29 + 1] * local40 >> 7;
			return local72 * (128 - local44) + local104 * local44 >> 7;
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("2396, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method134(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean70 &= true;
			if (!aBoolean55) {
				@Pc(18) Class1_Sub3_Sub2_Sub3 local18;
				@Pc(26) int local26;
				@Pc(34) int local34;
				@Pc(37) byte[] local37;
				@Pc(40) byte[] local40;
				@Pc(42) int local42;
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[17] >= arg0) {
					local18 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[17];
					local26 = local18.anInt492 * local18.anInt493 - 1;
					local34 = local18.anInt492 * this.anInt184 * 2;
					local37 = local18.aByteArray7;
					local40 = this.aByteArray4;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray7 = local40;
					this.aByteArray4 = local37;
					Class1_Sub3_Sub2_Sub1.method281(17);
				}
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[24] >= arg0) {
					local18 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[24];
					local26 = local18.anInt492 * local18.anInt493 - 1;
					local34 = local18.anInt492 * this.anInt184 * 2;
					local37 = local18.aByteArray7;
					local40 = this.aByteArray4;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray7 = local40;
					this.aByteArray4 = local37;
					Class1_Sub3_Sub2_Sub1.method281(24);
					return;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("78758, " + true + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Z")
	private boolean method135() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("12828, " + 4 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)Ljava/lang/String;")
	private String method137() {
		try {
			this.aBoolean70 &= true;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("11932, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[BI)V")
	private void method138(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			signlink.jinglesave(arg1, arg2, arg0);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("55880, " + arg0 + ", " + -656 + ", " + arg1 + ", " + arg2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method139() {
		try {
			if (this.anInt145 == 2) {
				for (@Pc(18) Class1_Sub5 local18 = (Class1_Sub5) this.aClass28_5.method437(); local18 != null; local18 = (Class1_Sub5) this.aClass28_5.method439(this.aByte14)) {
					if (anInt295 >= local18.anInt615) {
						this.method168(local18.anInt610, local18.anInt613, local18.anInt609, local18.anInt608, local18.anInt612, local18.anInt611, local18.anInt614);
						local18.method547();
					}
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("25884, " + 8 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method140() {
		try {
			if (this.anInt261 == 0) {
				@Pc(13) int local13 = super.anInt132;
				if (this.anInt167 == 1 && super.anInt133 >= 520 && super.anInt134 >= 165 && super.anInt133 <= 788 && super.anInt134 <= 230) {
					local13 = 0;
				}
				@Pc(44) int local44;
				@Pc(47) int local47;
				@Pc(110) int local110;
				if (this.aBoolean51) {
					if (local13 != 1) {
						local44 = super.anInt130;
						local47 = super.anInt131;
						if (this.anInt246 == 0) {
							local44 -= 8;
							local47 -= 11;
						}
						if (this.anInt246 == 1) {
							local44 -= 562;
							local47 -= 231;
						}
						if (local44 < this.anInt247 - 10 || local44 > this.anInt247 + this.anInt249 + 10 || local47 < this.anInt248 - 10 || local47 > this.anInt248 + this.anInt250 + 10) {
							this.aBoolean51 = false;
							if (this.anInt246 == 1) {
								this.aBoolean52 = true;
							}
						}
					}
					if (local13 == 1) {
						local44 = this.anInt247;
						local47 = this.anInt248;
						local110 = this.anInt249;
						@Pc(113) int local113 = super.anInt133;
						@Pc(116) int local116 = super.anInt134;
						if (this.anInt246 == 0) {
							local113 -= 8;
							local116 -= 11;
						}
						if (this.anInt246 == 1) {
							local113 -= 562;
							local116 -= 231;
						}
						@Pc(129) int local129 = -1;
						for (@Pc(131) int local131 = 0; local131 < this.anInt162; local131++) {
							@Pc(146) int local146 = local47 + (this.anInt162 - 1 - local131) * 15 + 31;
							if (local113 > local44 && local113 < local44 + local110 && local116 > local146 - 13 && local116 < local146 + 3) {
								local129 = local131;
							}
						}
						if (local129 != -1) {
							this.method108(local129);
						}
						this.aBoolean51 = false;
						if (this.anInt246 == 1) {
							this.aBoolean52 = true;
							return;
						}
					}
				} else {
					if (local13 == 1 && this.anInt162 > 0) {
						local44 = this.anIntArray87[this.anInt162 - 1];
						if (local44 == 71 || local44 == 897 || local44 == 500 || local44 == 837 || local44 == 460 || local44 == 382 || local44 == 635 || local44 == 939 || local44 == 274 || local44 == 618 || local44 == 215) {
							local47 = this.anIntArray85[this.anInt162 - 1];
							local110 = this.anIntArray86[this.anInt162 - 1];
							@Pc(256) Class15 local256 = Class15.aClass15Array1[local110];
							if (local256.aBoolean120) {
								this.aBoolean42 = false;
								this.anInt205 = 0;
								this.anInt259 = local110;
								this.anInt260 = local47;
								this.anInt261 = 2;
								this.anInt262 = super.anInt133;
								this.anInt263 = super.anInt134;
								if (Class15.aClass15Array1[local110].anInt450 == this.anInt216) {
									this.anInt261 = 1;
								}
								if (Class15.aClass15Array1[local110].anInt450 == this.anInt180) {
									this.anInt261 = 3;
								}
								return;
							}
						}
					}
					if (local13 == 1 && this.anInt268 == 1 && this.anInt162 > 2) {
						local13 = 2;
					}
					if (local13 == 1 && this.anInt162 > 0) {
						this.method108(this.anInt162 - 1);
					}
					if (local13 != 2 || this.anInt162 <= 0) {
						return;
					}
					this.method150();
				}
			}
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("36452, " + -127 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method141() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray40[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray40[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray41[local54] = (this.anIntArray40[local54 - 1] + this.anIntArray40[local54 + 1] + this.anIntArray40[local54 - 128] + this.anIntArray40[local54 + 128]) / 4;
				}
			}
			this.anInt294 += 128;
			if (this.anInt294 > this.anIntArray44.length) {
				this.anInt294 -= this.anIntArray44.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method112(this.aClass1_Sub3_Sub2_Sub3Array2[local48]);
			}
			@Pc(169) int local169;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local169 = local54 + (local48 << 7);
					@Pc(192) int local192 = this.anIntArray41[local169 + 128] - this.anIntArray44[local169 + this.anInt294 & this.anIntArray44.length - 1] / 5;
					if (local192 < 0) {
						local192 = 0;
					}
					this.anIntArray40[local169] = local192;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray54[local54] = this.anIntArray54[local54 + 1];
			}
			this.anIntArray54[255] = (int) (Math.sin((double) anInt295 / 14.0D) * 16.0D + Math.sin((double) anInt295 / 15.0D) * 14.0D + Math.sin((double) anInt295 / 16.0D) * 12.0D);
			if (this.anInt175 > 0) {
				this.anInt175 -= 4;
			}
			if (this.anInt176 > 0) {
				this.anInt176 -= 4;
			}
			if (this.anInt175 == 0 && this.anInt176 == 0) {
				local169 = (int) (Math.random() * 2000.0D);
				if (local169 == 0) {
					this.anInt175 = 1024;
				}
				if (local169 == 1) {
					this.anInt176 = 1024;
					return;
				}
			}
		} catch (@Pc(303) RuntimeException local303) {
			signlink.reporterror("92376, " + false + ", " + local303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)Ljava/net/Socket;")
	private Socket method142(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method143() {
		try {
			if (this.aClass1_Sub1_Sub3_Sub2_1.anInt873 >> 7 == this.anInt286 && this.aClass1_Sub1_Sub3_Sub2_1.anInt874 >> 7 == this.anInt287) {
				this.anInt286 = 0;
			}
			for (@Pc(30) int local30 = -1; local30 < this.anInt157; local30++) {
				@Pc(38) Class1_Sub1_Sub3_Sub2 local38;
				@Pc(43) int local43;
				if (local30 == -1) {
					local38 = this.aClass1_Sub1_Sub3_Sub2_1;
					local43 = this.anInt156 << 14;
				} else {
					local38 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray30[local30]];
					local43 = this.anIntArray30[local30] << 14;
				}
				if (local38 != null && local38.method551()) {
					local38.aBoolean191 = false;
					if ((aBoolean55 && this.anInt157 > 50 || this.anInt157 > 200) && local30 != -1 && local38.anInt895 == local38.anInt877) {
						local38.aBoolean191 = true;
					}
					@Pc(95) int local95 = local38.anInt873 >> 7;
					@Pc(100) int local100 = local38.anInt874 >> 7;
					if (local95 >= 0 && local95 < 104 && local100 >= 0 && local100 < 104) {
						if (local38.aClass1_Sub3_Sub1_11 == null || anInt295 < local38.anInt925 || anInt295 >= local38.anInt926) {
							if ((local38.anInt873 & 0x7F) == 64 && (local38.anInt874 & 0x7F) == 64) {
								if (this.anIntArrayArray3[local95][local100] == this.anInt182) {
									continue;
								}
								this.anIntArrayArray3[local95][local100] = this.anInt182;
							}
							local38.anInt924 = this.method132(this.anInt269, local38.anInt873, local38.anInt874);
							this.aClass33_1.method459(local38.anInt875, 775, local38, null, local43, local38.anInt873, local38.aBoolean188, 60, this.anInt269, local38.anInt874, local38.anInt924);
						} else {
							local38.aBoolean191 = false;
							local38.anInt924 = this.method132(this.anInt269, local38.anInt873, local38.anInt874);
							this.aClass33_1.method460(local38.anInt874, local38.anInt933, local43, this.anInt269, local38, local38.anInt924, local38.anInt931, local38.anInt930, local38.anInt875, null, local38.anInt932, local38.anInt873);
						}
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("3240, " + false + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method144() {
		try {
			this.aClass1_Sub3_Sub3_4.method361(40);
			if (this.anInt161 != -1) {
				this.anInt161 = -1;
				this.aBoolean52 = true;
				this.aBoolean46 = false;
				this.aBoolean66 = true;
			}
			if (this.anInt180 != -1) {
				this.anInt180 = -1;
				this.aBoolean64 = true;
				this.aBoolean46 = false;
			}
			this.anInt216 = -1;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("20485, " + 7 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method70(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > 0) {
				if (this.aBoolean74 || this.aBoolean67 || this.aBoolean56) {
					this.method104(this.anInt254);
				} else {
					if (this.aBoolean70) {
						this.method101();
					} else {
						this.method110();
					}
					this.anInt210 = 0;
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("28036, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)I")
	private int method145() {
		try {
			@Pc(10) int local10 = 3;
			if (this.anInt143 < 310) {
				@Pc(19) int local19 = this.anInt140 >> 7;
				@Pc(24) int local24 = this.anInt142 >> 7;
				@Pc(30) int local30 = this.aClass1_Sub1_Sub3_Sub2_1.anInt873 >> 7;
				@Pc(36) int local36 = this.aClass1_Sub1_Sub3_Sub2_1.anInt874 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt269][local19][local24] & 0x4) != 0) {
					local10 = this.anInt269;
				}
				@Pc(58) int local58;
				if (local30 > local19) {
					local58 = local30 - local19;
				} else {
					local58 = local19 - local30;
				}
				@Pc(71) int local71;
				if (local36 > local24) {
					local71 = local36 - local24;
				} else {
					local71 = local24 - local36;
				}
				@Pc(86) int local86;
				@Pc(88) int local88;
				if (local58 > local71) {
					local86 = local71 * 65536 / local58;
					local88 = 32768;
					while (local19 != local30) {
						if (local19 < local30) {
							local19++;
						} else if (local19 > local30) {
							local19--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt269][local19][local24] & 0x4) != 0) {
							local10 = this.anInt269;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local24 < local36) {
								local24++;
							} else if (local24 > local36) {
								local24--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt269][local19][local24] & 0x4) != 0) {
								local10 = this.anInt269;
							}
						}
					}
				} else {
					local86 = local58 * 65536 / local71;
					local88 = 32768;
					while (local24 != local36) {
						if (local24 < local36) {
							local24++;
						} else if (local24 > local36) {
							local24--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt269][local19][local24] & 0x4) != 0) {
							local10 = this.anInt269;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local19 < local30) {
								local19++;
							} else if (local19 > local30) {
								local19--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt269][local19][local24] & 0x4) != 0) {
								local10 = this.anInt269;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt269][this.aClass1_Sub1_Sub3_Sub2_1.anInt873 >> 7][this.aClass1_Sub1_Sub3_Sub2_1.anInt874 >> 7] & 0x4) != 0) {
				local10 = this.anInt269;
			}
			return local10;
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("86143, " + 6 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
	private int method146() {
		try {
			@Pc(9) int local9 = this.method132(this.anInt269, this.anInt140, this.anInt142);
			return local9 - this.anInt141 >= 800 || (this.aByteArrayArrayArray7[this.anInt269][this.anInt140 >> 7][this.anInt142 >> 7] & 0x4) == 0 ? 3 : this.anInt269;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("39869, " + true + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIZII)Z")
	private boolean method147(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray5[local7][local11] = 0;
					this.anIntArrayArray4[local7][local11] = 99999999;
				}
			}
			local11 = arg2;
			@Pc(39) int local39 = arg5;
			this.anIntArrayArray5[arg2][arg5] = 99;
			this.anIntArrayArray4[arg2][arg5] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray75[0] = arg2;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray76[0] = arg5;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray75.length;
			@Pc(81) int[][] local81 = this.aClass9Array1[this.anInt269].anIntArrayArray10;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray75[local57];
				local39 = this.anIntArray76[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg10 && local39 == arg1) {
					local70 = true;
					break;
				}
				if (arg7 != 0) {
					if ((arg7 < 5 || arg7 == 10) && this.aClass9Array1[this.anInt269].method246(local11, arg6, arg10, local39, arg7 - 1, arg1)) {
						local70 = true;
						break;
					}
					if (arg7 < 10 && this.aClass9Array1[this.anInt269].method247(arg7 - 1, arg1, arg6, local11, arg10, local39)) {
						local70 = true;
						break;
					}
				}
				if (arg4 != 0 && arg3 != 0 && this.aClass9Array1[this.anInt269].method248(arg10, arg1, local39, local11, arg3, arg9, arg4)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray4[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray5[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray75[local66] = local11 - 1;
					this.anIntArray76[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39] = 2;
					this.anIntArrayArray4[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray5[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray75[local66] = local11 + 1;
					this.anIntArray76[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39] = 8;
					this.anIntArrayArray4[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray5[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray75[local66] = local11;
					this.anIntArray76[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11][local39 - 1] = 1;
					this.anIntArrayArray4[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray5[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray75[local66] = local11;
					this.anIntArray76[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11][local39 + 1] = 4;
					this.anIntArrayArray4[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray5[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray75[local66] = local11 - 1;
					this.anIntArray76[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray5[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray75[local66] = local11 + 1;
					this.anIntArray76[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray5[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray75[local66] = local11 - 1;
					this.anIntArray76[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray5[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray75[local66] = local11 + 1;
					this.anIntArray76[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = local192;
				}
			}
			@Pc(805) int local805;
			@Pc(811) int local811;
			@Pc(817) int local817;
			if (!local70) {
				if (arg0) {
					local192 = 100;
					for (local805 = 1; local805 < 2; local805++) {
						for (local811 = arg10 - local805; local811 <= arg10 + local805; local811++) {
							for (local817 = arg1 - local805; local817 <= arg1 + local805; local817++) {
								if (local811 >= 0 && local817 >= 0 && local811 < 104 && local817 < 104 && this.anIntArrayArray4[local811][local817] < local192) {
									local192 = this.anIntArrayArray4[local811][local817];
									local11 = local811;
									local39 = local817;
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
			@Pc(875) byte local875 = 0;
			this.anIntArray75[0] = local11;
			if (arg8) {
				this.anInt267 = -257;
			}
			local57 = local875 + 1;
			this.anIntArray76[0] = local39;
			local192 = local805 = this.anIntArrayArray5[local11][local39];
			while (local11 != arg2 || local39 != arg5) {
				if (local192 != local805) {
					local805 = local192;
					this.anIntArray75[local57] = local11;
					this.anIntArray76[local57++] = local39;
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
				local192 = this.anIntArrayArray5[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local811 = this.anIntArray75[local57];
				local817 = this.anIntArray76[local57];
				anInt195 += local74;
				if (anInt195 >= 121) {
					this.aClass1_Sub3_Sub3_4.method361(241);
					this.aClass1_Sub3_Sub3_4.method363(19217);
				}
				if (super.anIntArray28[5] == 1) {
					this.aClass1_Sub3_Sub3_4.method361(205);
				} else {
					this.aClass1_Sub3_Sub3_4.method361(169);
				}
				this.aClass1_Sub3_Sub3_4.method362(local74 + local74 + 2);
				this.aClass1_Sub3_Sub3_4.method363(local811 + this.anInt150);
				this.aClass1_Sub3_Sub3_4.method363(local817 + this.anInt151);
				this.anInt286 = this.anIntArray75[0];
				this.anInt287 = this.anIntArray76[0];
				for (@Pc(1045) int local1045 = 1; local1045 < local74; local1045++) {
					local57--;
					this.aClass1_Sub3_Sub3_4.method362(this.anIntArray75[local57] - local811);
					this.aClass1_Sub3_Sub3_4.method362(this.anIntArray76[local57] - local817);
				}
			}
			return true;
		} catch (@Pc(1073) RuntimeException local1073) {
			signlink.reporterror("28440, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1073.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!kb;I)V")
	private void method148(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt281 = 0;
			this.anInt158 = 0;
			this.method167(arg1, arg0);
			this.method89(arg1, arg0);
			this.method165(arg1, arg0);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt281; local33++) {
				local40 = this.anIntArray70[local33];
				if (this.aClass1_Sub1_Sub3_Sub1Array1[local40].anInt915 != anInt295) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local40].aClass3_1 = null;
					this.aClass1_Sub1_Sub3_Sub1Array1[local40] = null;
				}
			}
			if (arg0.anInt539 != arg1) {
				signlink.reporterror(this.aString13 + " size mismatch in getnpcpos - pos:" + arg0.anInt539 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt183; local40++) {
				if (this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray36[local40]] == null) {
					signlink.reporterror(this.aString13 + " null entry in npc list - pos:" + local40 + " size:" + this.anInt183);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("94347, " + ", " + arg0 + ", " + arg1 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method149() {
		try {
			if (this.anInt190 > 1) {
				this.anInt190--;
			}
			if (this.anInt292 > 0) {
				this.anInt292--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method155(); local22++) {
			}
			if (this.aBoolean70) {
				@Pc(200) int local200;
				@Pc(148) int local148;
				for (@Pc(39) int local39 = 0; local39 < this.anInt283; local39++) {
					if (this.anIntArray71[local39] <= 0) {
						@Pc(48) boolean local48 = false;
						try {
							if (this.anIntArray42[local39] != this.anInt203 || this.anIntArray74[local39] != this.anInt204) {
								@Pc(82) Class1_Sub3_Sub3 local82 = Class43.method542(this.anIntArray42[local39], this.anInt267, this.anIntArray74[local39]);
								if (System.currentTimeMillis() + (long) (local82.anInt539 / 22) > this.aLong7 + (long) (this.anInt166 / 22)) {
									this.anInt166 = local82.anInt539;
									this.aLong7 = System.currentTimeMillis();
									if (this.method83(local82.aByteArray8, local82.anInt539)) {
										this.anInt203 = this.anIntArray42[local39];
										this.anInt204 = this.anIntArray74[local39];
									} else {
										local48 = true;
									}
								}
							} else if (!this.method135()) {
								local48 = true;
							}
						} catch (@Pc(132) Exception local132) {
						}
						if (local48 && this.anIntArray71[local39] != -5) {
							this.anIntArray71[local39] = -5;
						} else {
							this.anInt283--;
							for (local148 = local39; local148 < this.anInt283; local148++) {
								this.anIntArray42[local148] = this.anIntArray42[local148 + 1];
								this.anIntArray74[local148] = this.anIntArray74[local148 + 1];
								this.anIntArray71[local148] = this.anIntArray71[local148 + 1];
							}
							local39--;
						}
					} else {
						local200 = this.anIntArray71[local39]--;
					}
				}
				if (Class8.aBoolean86) {
					@Pc(213) Class1_Sub3_Sub3 local213 = Class8.method199();
					if (local213 != null) {
						this.aClass1_Sub3_Sub3_4.method361(196);
						this.aClass1_Sub3_Sub3_4.method363(local213.anInt539);
						this.aClass1_Sub3_Sub3_4.method370((byte) 4, local213.anInt539, local213.aByteArray8);
						local213.method360(933);
					}
				}
				this.anInt290++;
				if (this.anInt290 > 750) {
					this.method126();
				}
				this.method86();
				this.method94((byte) 5);
				this.method157();
				this.method139();
				this.anInt184++;
				if (this.anInt209 != 0) {
					this.anInt208 += 20;
					if (this.anInt208 >= 400) {
						this.anInt209 = 0;
					}
				}
				if (this.anInt313 != 0) {
					this.anInt310++;
					if (this.anInt310 >= 15) {
						if (this.anInt313 == 2) {
							this.aBoolean52 = true;
						}
						if (this.anInt313 == 3) {
							this.aBoolean64 = true;
						}
						this.anInt313 = 0;
					}
				}
				if (this.anInt261 != 0) {
					this.anInt205++;
					if (super.anInt130 > this.anInt262 + 5 || super.anInt130 < this.anInt262 - 5 || super.anInt131 > this.anInt263 + 5 || super.anInt131 < this.anInt263 - 5) {
						this.aBoolean42 = true;
					}
					if (super.anInt129 == 0) {
						if (this.anInt261 == 2) {
							this.aBoolean52 = true;
						}
						if (this.anInt261 == 3) {
							this.aBoolean64 = true;
						}
						this.anInt261 = 0;
						if (this.aBoolean42 && this.anInt205 >= 5) {
							this.anInt245 = -1;
							this.method87(this.aBoolean45);
							if (this.anInt245 == this.anInt259 && this.anInt244 != this.anInt260) {
								@Pc(409) Class15 local409 = Class15.aClass15Array1[this.anInt259];
								local148 = local409.anIntArray149[this.anInt244];
								local409.anIntArray149[this.anInt244] = local409.anIntArray149[this.anInt260];
								local409.anIntArray149[this.anInt260] = local148;
								local148 = local409.anIntArray150[this.anInt244];
								local409.anIntArray150[this.anInt244] = local409.anIntArray150[this.anInt260];
								local409.anIntArray150[this.anInt260] = local148;
								this.aClass1_Sub3_Sub3_4.method361(162);
								this.aClass1_Sub3_Sub3_4.method363(this.anInt259);
								this.aClass1_Sub3_Sub3_4.method363(this.anInt260);
								this.aClass1_Sub3_Sub3_4.method363(this.anInt244);
							}
						} else if (this.anInt268 == 1 && this.anInt162 > 2) {
							this.method150();
						} else if (this.anInt162 > 0) {
							this.method108(this.anInt162 - 1);
						}
						this.anInt310 = 10;
						super.anInt132 = 0;
					}
				}
				@Pc(509) int local509;
				if (Class33.anInt690 != -1) {
					local509 = Class33.anInt690;
					local148 = Class33.anInt691;
					@Pc(534) boolean local534 = this.method147(true, local148, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local509);
					Class33.anInt690 = -1;
					if (local534) {
						this.anInt206 = super.anInt133;
						this.anInt207 = super.anInt134;
						this.anInt209 = 1;
						this.anInt208 = 0;
					}
				}
				if (super.anInt132 == 1 && this.aString10 != null) {
					this.aString10 = null;
					this.aBoolean64 = true;
					super.anInt132 = 0;
				}
				this.method140();
				this.method159();
				this.method106();
				this.method120();
				if (super.anInt129 == 1 || super.anInt132 == 1) {
					this.anInt210++;
				}
				if (this.anInt145 == 2) {
					this.method91((byte) 5);
				}
				if (this.anInt145 == 2 && this.aBoolean73) {
					this.method128(this.anInt146);
				}
				for (local509 = 0; local509 < 5; local509++) {
					local200 = this.anIntArray33[local509]++;
				}
				this.method153();
				anInt164++;
				if (anInt164 > 54) {
					anInt164 = 0;
					this.aClass1_Sub3_Sub3_4.method361(39);
				}
				super.anInt128++;
				if (super.anInt128 > 4500) {
					this.anInt292 = 250;
					super.anInt128 -= 500;
					this.aClass1_Sub3_Sub3_4.method361(38);
				}
				this.anInt163++;
				if (this.anInt163 > 500) {
					this.anInt163 = 0;
					local148 = (int) (Math.random() * 8.0D);
					if ((local148 & 0x1) == 1) {
						this.anInt159 += this.anInt160;
					}
					if ((local148 & 0x2) == 2) {
						this.anInt138 += this.anInt139;
					}
					if ((local148 & 0x4) == 4) {
						this.anInt265 += this.anInt266;
					}
				}
				if (this.anInt159 < -50) {
					this.anInt160 = 2;
				}
				if (this.anInt159 > 50) {
					this.anInt160 = -2;
				}
				if (this.anInt138 < -55) {
					this.anInt139 = 2;
				}
				if (this.anInt138 > 55) {
					this.anInt139 = -2;
				}
				if (this.anInt265 < -40) {
					this.anInt266 = 1;
				}
				if (this.anInt265 > 40) {
					this.anInt266 = -1;
				}
				this.anInt291++;
				if (this.anInt291 > 50) {
					this.aClass1_Sub3_Sub3_4.method361(186);
				}
				try {
					if (this.aClass6_1 != null && this.aClass1_Sub3_Sub3_4.anInt539 > 0) {
						this.aClass6_1.method194(this.aClass1_Sub3_Sub3_4.aByteArray8, this.aBoolean71, this.aClass1_Sub3_Sub3_4.anInt539);
						this.aClass1_Sub3_Sub3_4.anInt539 = 0;
						this.anInt291 = 0;
					}
				} catch (@Pc(808) IOException local808) {
					this.method126();
				} catch (@Pc(813) Exception local813) {
					this.method178();
				}
			}
		} catch (@Pc(818) RuntimeException local818) {
			signlink.reporterror("80046, " + 19955 + ", " + local818.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method150() {
		try {
			this.aBoolean70 &= true;
			@Pc(13) int local13 = this.aClass1_Sub3_Sub2_Sub4_3.method349("Choose Option");
			@Pc(26) int local26;
			for (@Pc(15) int local15 = 0; local15 < this.anInt162; local15++) {
				local26 = this.aClass1_Sub3_Sub2_Sub4_3.method349(this.aStringArray8[local15]);
				if (local26 > local13) {
					local13 = local26;
				}
			}
			local13 += 8;
			local26 = this.anInt162 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt133 > 8 && super.anInt134 > 11 && super.anInt133 < 520 && super.anInt134 < 345) {
				local69 = super.anInt133 - local13 / 2 - 8;
				if (local69 + local13 > 512) {
					local69 = 512 - local13;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt134 - 11;
				if (local87 + local26 > 334) {
					local87 = 334 - local26;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean51 = true;
				this.anInt246 = 0;
				this.anInt247 = local69;
				this.anInt248 = local87;
				this.anInt249 = local13;
				this.anInt250 = this.anInt162 * 15 + 22;
			}
			if (super.anInt133 > 562 && super.anInt134 > 231 && super.anInt133 < 752 && super.anInt134 < 492) {
				local69 = super.anInt133 - local13 / 2 - 562;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local13 > 190) {
					local69 = 190 - local13;
				}
				local87 = super.anInt134 - 231;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 261) {
					local87 = 261 - local26;
				}
				this.aBoolean51 = true;
				this.anInt246 = 1;
				this.anInt247 = local69;
				this.anInt248 = local87;
				this.anInt249 = local13;
				this.anInt250 = this.anInt162 * 15 + 22;
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("29649, " + true + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!hb;I)V")
	private void method151(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 * arg0 + arg2 * arg2;
			if (local7 <= 6400) {
				@Pc(22) int local22 = Class1_Sub3_Sub1.anIntArray124[this.anInt230];
				@Pc(27) int local27 = Class1_Sub3_Sub1.anIntArray125[this.anInt230];
				@Pc(37) int local37 = arg2 * local22 + arg0 * local27 >> 16;
				@Pc(47) int local47 = arg2 * local27 - arg0 * local22 >> 16;
				if (local7 > 2500) {
					arg1.method315(83 - local47 - arg1.anInt445 / 2, this.aClass1_Sub3_Sub2_Sub3_17, local37 + 94 - arg1.anInt444 / 2);
				} else {
					arg1.method308(local37 + 94 - arg1.anInt444 / 2, 83 - local47 - arg1.anInt445 / 2);
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("93023, " + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;B)Z")
	private boolean method152(@OriginalArg(0) Class15 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt453;
			if (local4 == 201) {
				this.aBoolean64 = true;
				this.aBoolean58 = false;
				this.aBoolean62 = true;
				this.aString11 = "";
				this.anInt236 = 1;
				this.aString15 = "Enter name of friend to add to list";
			}
			if (local4 == 202) {
				this.aBoolean64 = true;
				this.aBoolean58 = false;
				this.aBoolean62 = true;
				this.aString11 = "";
				this.anInt236 = 2;
				this.aString15 = "Enter name of friend to delete from list";
			}
			if (local4 >= 1 && local4 <= 200) {
				if (local4 >= 101) {
					local4 -= 101;
				} else {
					local4--;
				}
				if (local4 >= 0 && local4 < this.anInt215 && this.anIntArray34[local4] > 0) {
					this.aBoolean64 = true;
					this.aBoolean58 = false;
					this.aBoolean62 = true;
					this.aString11 = "";
					this.anInt236 = 3;
					this.aLong8 = this.aLongArray4[local4];
					this.aString15 = "Enter message to send to " + this.aStringArray6[local4];
				}
			}
			if (local4 == 205) {
				this.anInt292 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean64 = true;
				this.aBoolean58 = false;
				this.aBoolean62 = true;
				this.aString11 = "";
				this.anInt236 = 4;
				this.aString15 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean64 = true;
				this.aBoolean58 = false;
				this.aBoolean62 = true;
				this.aString11 = "";
				this.anInt236 = 5;
				this.aString15 = "Enter name of player to delete from list";
			}
			@Pc(171) int local171;
			@Pc(175) int local175;
			@Pc(180) int local180;
			if (local4 >= 300 && local4 <= 313) {
				local171 = (local4 - 300) / 2;
				local175 = local4 & 0x1;
				local180 = this.anIntArray80[local171];
				if (local180 != -1) {
					while (true) {
						if (local175 == 0) {
							local180--;
							if (local180 < 0) {
								local180 = Class13.anInt415 - 1;
							}
						}
						if (local175 == 1) {
							local180++;
							if (local180 >= Class13.anInt415) {
								local180 = 0;
							}
						}
						if (Class13.aClass13Array1[local180].anInt416 == local171 + (this.aBoolean79 ? 0 : 7)) {
							this.anIntArray80[local171] = local180;
							this.aBoolean41 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local171 = (local4 - 314) / 2;
				local175 = local4 & 0x1;
				local180 = this.anIntArray38[local171];
				if (local175 == 0) {
					local180--;
					if (local180 < 0) {
						local180 = anIntArrayArray2[local171].length - 1;
					}
				}
				if (local175 == 1) {
					local180++;
					if (local180 >= anIntArrayArray2[local171].length) {
						local180 = 0;
					}
				}
				this.anIntArray38[local171] = local180;
				this.aBoolean41 = true;
			}
			if (local4 == 324 && !this.aBoolean79) {
				this.aBoolean79 = true;
				this.method176();
			}
			if (local4 == 325 && this.aBoolean79) {
				this.aBoolean79 = false;
				this.method176();
			}
			if (local4 == 326) {
				this.aClass1_Sub3_Sub3_4.method361(128);
				this.aClass1_Sub3_Sub3_4.method362(this.aBoolean79 ? 0 : 1);
				for (local171 = 0; local171 < 7; local171++) {
					this.aClass1_Sub3_Sub3_4.method362(this.anIntArray80[local171]);
				}
				for (local175 = 0; local175 < 5; local175++) {
					this.aClass1_Sub3_Sub3_4.method362(this.anIntArray38[local175]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean60 = !this.aBoolean60;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method144();
				if (this.aString17.length() > 0) {
					this.aClass1_Sub3_Sub3_4.method361(53);
					this.aClass1_Sub3_Sub3_4.method368(Class40.method518(this.aString17));
					this.aClass1_Sub3_Sub3_4.method362(local4 - 601);
					this.aClass1_Sub3_Sub3_4.method362(this.aBoolean60 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(403) RuntimeException local403) {
			signlink.reporterror("79108, " + arg0 + ", " + -11 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method153() {
		try {
			while (true) {
				@Pc(11) int local11 = this.method66();
				if (local11 == -1) {
					return;
				}
				if (this.anInt216 != -1 && this.anInt216 == this.anInt293) {
					if (local11 == 8 && this.aString17.length() > 0) {
						this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
					}
					if ((local11 >= 97 && local11 <= 122 || local11 >= 65 && local11 <= 90 || local11 >= 48 && local11 <= 57 || local11 == 32) && this.aString17.length() < 12) {
						this.aString17 = this.aString17 + (char) local11;
					}
				} else {
					@Pc(310) int local310;
					@Pc(405) int local405;
					if (this.aBoolean62) {
						if (local11 >= 32 && local11 <= 122 && this.aString11.length() < 80) {
							this.aString11 = this.aString11 + (char) local11;
							this.aBoolean64 = true;
						}
						if (local11 == 8 && this.aString11.length() > 0) {
							this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
							this.aBoolean64 = true;
						}
						if (local11 == 13 || local11 == 10) {
							this.aBoolean62 = false;
							this.aBoolean64 = true;
							@Pc(170) int local170;
							@Pc(204) int local204;
							@Pc(168) boolean local168;
							@Pc(155) long local155;
							if (this.anInt236 == 1 && this.anInt215 < 100) {
								local155 = Class40.method518(this.aString11);
								this.aString11 = Class40.method522(Class40.method519(local155));
								if (local155 != 0L) {
									local168 = false;
									for (local170 = 0; local170 < this.anInt215; local170++) {
										if (this.aLongArray4[local170] == local155) {
											this.method88(0, this.aString11 + " is already on your friend list", "");
											local168 = true;
											break;
										}
									}
									for (local204 = 0; local204 < this.anInt307; local204++) {
										if (this.aLongArray3[local204] == local155) {
											this.method88(0, "Please remove " + this.aString11 + " from your ignore list first", "");
											local168 = true;
											break;
										}
									}
									if (this.aString11.equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
										local168 = true;
									}
									if (!local168) {
										this.aStringArray6[this.anInt215] = this.aString11;
										this.aLongArray4[this.anInt215] = local155;
										this.anIntArray34[this.anInt215] = 0;
										this.anInt215++;
										this.aBoolean52 = true;
										this.aClass1_Sub3_Sub3_4.method361(115);
										this.aClass1_Sub3_Sub3_4.method368(local155);
									}
								}
							}
							if (this.anInt236 == 2 && this.anInt215 > 0) {
								local155 = Class40.method518(this.aString11);
								this.aString11 = Class40.method522(Class40.method519(local155));
								if (local155 != 0L) {
									for (local310 = 0; local310 < this.anInt215; local310++) {
										if (this.aLongArray4[local310] == local155) {
											this.anInt215--;
											this.aBoolean52 = true;
											for (local170 = local310; local170 < this.anInt215; local170++) {
												this.aStringArray6[local170] = this.aStringArray6[local170 + 1];
												this.anIntArray34[local170] = this.anIntArray34[local170 + 1];
												this.aLongArray4[local170] = this.aLongArray4[local170 + 1];
											}
											this.aClass1_Sub3_Sub3_4.method361(57);
											this.aClass1_Sub3_Sub3_4.method368(local155);
											break;
										}
									}
								}
							}
							if (this.anInt236 == 3 && this.aString11.length() > 0) {
								this.aClass1_Sub3_Sub3_4.method361(250);
								this.aClass1_Sub3_Sub3_4.method362(0);
								local405 = this.aClass1_Sub3_Sub3_4.anInt539;
								this.aClass1_Sub3_Sub3_4.method368(this.aLong8);
								Class41.method526(this.aClass1_Sub3_Sub3_4, this.aString11, (byte) 3);
								this.aClass1_Sub3_Sub3_4.method371(this.aClass1_Sub3_Sub3_4.anInt539 - local405);
								this.aString11 = Class40.method523(this.aString11);
								this.aString11 = Class25.method405(this.aString11);
								this.method88(6, this.aString11, Class40.method522(Class40.method519(this.aLong8)));
								if (this.anInt214 == 2) {
									this.anInt214 = 1;
									this.aBoolean61 = true;
									this.aClass1_Sub3_Sub3_4.method361(206);
									this.aClass1_Sub3_Sub3_4.method362(this.anInt154);
									this.aClass1_Sub3_Sub3_4.method362(this.anInt214);
									this.aClass1_Sub3_Sub3_4.method362(this.anInt316);
								}
							}
							if (this.anInt236 == 4 && this.anInt307 < 100 && this.aString11.length() > 0) {
								local155 = Class40.method518(this.aString11);
								local168 = false;
								for (local170 = 0; local170 < this.anInt307; local170++) {
									if (this.aLongArray3[local170] == local155) {
										this.method88(0, this.aString11 + " is already on your ignore list", "");
										local168 = true;
										break;
									}
								}
								for (local204 = 0; local204 < this.anInt215; local204++) {
									if (this.aLongArray4[local204] == local155) {
										this.method88(0, "Please remove " + this.aString11 + " from your friend list first", "");
										local168 = true;
										break;
									}
								}
								if (!local168) {
									this.aLongArray3[this.anInt307++] = local155;
									this.aBoolean52 = true;
									this.aClass1_Sub3_Sub3_4.method361(251);
									this.aClass1_Sub3_Sub3_4.method368(local155);
								}
							}
							if (this.anInt236 == 5 && this.anInt307 > 0 && this.aString11.length() > 0) {
								local155 = Class40.method518(this.aString11);
								for (local310 = 0; local310 < this.anInt307; local310++) {
									if (this.aLongArray3[local310] == local155) {
										this.anInt307--;
										this.aBoolean52 = true;
										for (local170 = local310; local170 < this.anInt307; local170++) {
											this.aLongArray3[local170] = this.aLongArray3[local170 + 1];
										}
										this.aClass1_Sub3_Sub3_4.method361(188);
										this.aClass1_Sub3_Sub3_4.method368(local155);
										break;
									}
								}
							}
						}
					} else if (this.aBoolean58) {
						if (local11 >= 48 && local11 <= 57 && this.aString12.length() < 10) {
							this.aString12 = this.aString12 + (char) local11;
							this.aBoolean64 = true;
						}
						if (local11 == 8 && this.aString12.length() > 0) {
							this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
							this.aBoolean64 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString12.length() > 0) {
								local405 = 0;
								try {
									local405 = Integer.parseInt(this.aString12);
								} catch (@Pc(734) Exception local734) {
								}
								this.aClass1_Sub3_Sub3_4.method361(184);
								this.aClass1_Sub3_Sub3_4.method366(local405);
							}
							this.aBoolean58 = false;
							this.aBoolean64 = true;
						}
					} else if (this.anInt180 == -1) {
						if (local11 >= 32 && local11 <= 122 && this.aString8.length() < 80) {
							this.aString8 = this.aString8 + (char) local11;
							this.aBoolean64 = true;
						}
						if (local11 == 8 && this.aString8.length() > 0) {
							this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
							this.aBoolean64 = true;
						}
						if ((local11 == 13 || local11 == 10) && this.aString8.length() > 0) {
							if (this.aString8.equals("::clientdrop") && super.aFrame_Sub1_2 != null) {
								this.method126();
							} else if (this.aString8.startsWith("::")) {
								this.aClass1_Sub3_Sub3_4.method361(24);
								this.aClass1_Sub3_Sub3_4.method362(this.aString8.length() - 1);
								this.aClass1_Sub3_Sub3_4.method369(this.aString8.substring(2));
							} else {
								@Pc(854) byte local854 = 0;
								if (this.aString8.startsWith("yellow:")) {
									local854 = 0;
									this.aString8 = this.aString8.substring(7);
								}
								if (this.aString8.startsWith("red:")) {
									local854 = 1;
									this.aString8 = this.aString8.substring(4);
								}
								if (this.aString8.startsWith("green:")) {
									local854 = 2;
									this.aString8 = this.aString8.substring(6);
								}
								if (this.aString8.startsWith("cyan:")) {
									local854 = 3;
									this.aString8 = this.aString8.substring(5);
								}
								if (this.aString8.startsWith("purple:")) {
									local854 = 4;
									this.aString8 = this.aString8.substring(7);
								}
								if (this.aString8.startsWith("white:")) {
									local854 = 5;
									this.aString8 = this.aString8.substring(6);
								}
								if (this.aString8.startsWith("flash1:")) {
									local854 = 6;
									this.aString8 = this.aString8.substring(7);
								}
								if (this.aString8.startsWith("flash2:")) {
									local854 = 7;
									this.aString8 = this.aString8.substring(7);
								}
								if (this.aString8.startsWith("flash3:")) {
									local854 = 8;
									this.aString8 = this.aString8.substring(7);
								}
								if (this.aString8.startsWith("glow1:")) {
									local854 = 9;
									this.aString8 = this.aString8.substring(6);
								}
								if (this.aString8.startsWith("glow2:")) {
									local854 = 10;
									this.aString8 = this.aString8.substring(6);
								}
								if (this.aString8.startsWith("glow3:")) {
									local854 = 11;
									this.aString8 = this.aString8.substring(6);
								}
								@Pc(1012) byte local1012 = 0;
								if (this.aString8.startsWith("wave:")) {
									local1012 = 1;
									this.aString8 = this.aString8.substring(5);
								}
								if (this.aString8.startsWith("scroll:")) {
									local1012 = 2;
									this.aString8 = this.aString8.substring(7);
								}
								this.aClass1_Sub3_Sub3_4.method361(11);
								this.aClass1_Sub3_Sub3_4.method362(0);
								local310 = this.aClass1_Sub3_Sub3_4.anInt539;
								this.aClass1_Sub3_Sub3_4.method362(local854);
								this.aClass1_Sub3_Sub3_4.method362(local1012);
								Class41.method526(this.aClass1_Sub3_Sub3_4, this.aString8, (byte) 3);
								this.aClass1_Sub3_Sub3_4.method371(this.aClass1_Sub3_Sub3_4.anInt539 - local310);
								this.aString8 = Class40.method523(this.aString8);
								this.aString8 = Class25.method405(this.aString8);
								this.aClass1_Sub1_Sub3_Sub2_1.aString29 = this.aString8;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt885 = local854;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt886 = local1012;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt884 = 150;
								this.method88(2, this.aClass1_Sub1_Sub3_Sub2_1.aString29, this.aClass1_Sub1_Sub3_Sub2_1.aString30);
								if (this.anInt154 == 2) {
									this.anInt154 = 1;
									this.aBoolean61 = true;
									this.aClass1_Sub3_Sub3_4.method361(206);
									this.aClass1_Sub3_Sub3_4.method362(this.anInt154);
									this.aClass1_Sub3_Sub3_4.method362(this.anInt214);
									this.aClass1_Sub3_Sub3_4.method362(this.anInt316);
								}
							}
							this.aString8 = "";
							this.aBoolean64 = true;
						}
					}
				}
			}
		} catch (@Pc(1153) RuntimeException local1153) {
			signlink.reporterror("19327, " + ", " + local1153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method73(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (signlink.mainapp == null) {
			super.method73(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!kb;I)V")
	private void method154(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13 = arg0.method383(8);
			@Pc(19) int local19;
			if (local13 < this.anInt157) {
				for (local19 = local13; local19 < this.anInt157; local19++) {
					this.anIntArray70[this.anInt281++] = this.anIntArray30[local19];
				}
			}
			if (local13 > this.anInt157) {
				signlink.reporterror(this.aString13 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt157 = 0;
			for (local19 = 0; local19 < local13; local19++) {
				@Pc(71) int local71 = this.anIntArray30[local19];
				@Pc(76) Class1_Sub1_Sub3_Sub2 local76 = this.aClass1_Sub1_Sub3_Sub2Array1[local71];
				@Pc(81) int local81 = arg0.method383(1);
				if (local81 == 0) {
					this.anIntArray30[this.anInt157++] = local71;
					local76.anInt915 = anInt295;
				} else {
					@Pc(104) int local104 = arg0.method383(2);
					if (local104 == 0) {
						this.anIntArray30[this.anInt157++] = local71;
						local76.anInt915 = anInt295;
						this.anIntArray31[this.anInt158++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray30[this.anInt157++] = local71;
							local76.anInt915 = anInt295;
							local155 = arg0.method383(3);
							local76.method550(false, local155);
							local165 = arg0.method383(1);
							if (local165 == 1) {
								this.anIntArray31[this.anInt158++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray30[this.anInt157++] = local71;
							local76.anInt915 = anInt295;
							local155 = arg0.method383(3);
							local76.method550(true, local155);
							local165 = arg0.method383(3);
							local76.method550(true, local165);
							@Pc(223) int local223 = arg0.method383(1);
							if (local223 == 1) {
								this.anIntArray31[this.anInt158++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray70[this.anInt281++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("23655, " + 21055 + ", " + arg0 + ", " + arg1 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Z")
	private boolean method155() {
		try {
			if (this.aClass6_1 == null) {
				return false;
			}
			@Pc(2802) String local2802;
			@Pc(277) int local277;
			try {
				@Pc(15) int local15 = this.aClass6_1.method192();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt289 == -1) {
					this.aClass6_1.method193(this.aClass1_Sub3_Sub3_5.aByteArray8, 0, 1);
					this.anInt289 = this.aClass1_Sub3_Sub3_5.aByteArray8[0] & 0xFF;
					if (this.aClass38_1 != null) {
						this.anInt289 = this.anInt289 - this.aClass38_1.method512() & 0xFF;
					}
					this.anInt288 = Class7.anIntArray90[this.anInt289];
					local15--;
				}
				if (this.anInt288 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass6_1.method193(this.aClass1_Sub3_Sub3_5.aByteArray8, 0, 1);
					this.anInt288 = this.aClass1_Sub3_Sub3_5.aByteArray8[0] & 0xFF;
					local15--;
				}
				if (this.anInt288 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass6_1.method193(this.aClass1_Sub3_Sub3_5.aByteArray8, 0, 2);
					this.aClass1_Sub3_Sub3_5.anInt539 = 0;
					this.anInt288 = this.aClass1_Sub3_Sub3_5.method374();
					local15 -= 2;
				}
				if (local15 < this.anInt288) {
					return false;
				}
				this.aClass1_Sub3_Sub3_5.anInt539 = 0;
				this.aClass6_1.method193(this.aClass1_Sub3_Sub3_5.aByteArray8, 0, this.anInt288);
				this.anInt290 = 0;
				this.anInt235 = this.anInt234;
				this.anInt234 = this.anInt233;
				this.anInt233 = this.anInt289;
				if (this.anInt289 == 94) {
					if (this.anInt282 == 12) {
						this.aBoolean52 = true;
					}
					this.anInt165 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 148) {
					this.method118(this.anInt288, this.aClass1_Sub3_Sub3_5);
					if (this.anInt145 == 1) {
						this.anInt145 = 2;
						Class4.anInt81 = this.anInt269;
						this.method81(this.aBoolean75);
					}
					if (aBoolean55 && this.anInt145 == 2 && Class4.anInt81 != this.anInt269) {
						this.aClass32_27.method444();
						this.aClass1_Sub3_Sub2_Sub4_2.method347("Loading - please wait.", 151, 257, 0);
						this.aClass1_Sub3_Sub2_Sub4_2.method347("Loading - please wait.", 150, 256, 16777215);
						this.aClass32_27.method445(super.aGraphics2, 8, 11);
						Class4.anInt81 = this.anInt269;
						this.method81(this.aBoolean75);
					}
					if (this.anInt269 != this.anInt278 && this.anInt145 == 2) {
						this.anInt278 = this.anInt269;
						this.method93(this.anInt269);
					}
					this.anInt289 = -1;
					return true;
				}
				@Pc(289) int local289;
				@Pc(273) int local273;
				@Pc(283) int local283;
				@Pc(293) int local293;
				if (this.anInt289 == 167) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method374();
					local283 = local277 >> 10 & 0x1F;
					local289 = local277 >> 5 & 0x1F;
					local293 = local277 & 0x1F;
					Class15.aClass15Array1[local273].anInt464 = (local283 << 19) + (local289 << 11) + (local293 << 3);
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 161) {
					Class8.method197(567);
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 86) {
					local273 = this.aClass1_Sub3_Sub3_5.method372();
					local277 = this.aClass1_Sub3_Sub3_5.method372();
					local283 = -1;
					for (local289 = 0; local289 < this.anIntArray72.length; local289++) {
						if (this.anIntArray72[local289] == (local273 << 8) + local277) {
							local283 = local289;
						}
					}
					if (local283 != -1) {
						signlink.cachesave("m" + local273 + "_" + local277, this.aByteArrayArray1[local283]);
						this.anInt145 = 1;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 195) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method372();
					if (local273 == 65535) {
						local273 = -1;
					}
					this.anIntArray69[local277] = local273;
					this.aBoolean52 = true;
					this.aBoolean66 = true;
					this.anInt289 = -1;
					return true;
				}
				@Pc(432) String local432;
				if (this.anInt289 == 240) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local432 = this.aClass1_Sub3_Sub3_5.method379();
					Class15.aClass15Array1[local273].aString19 = local432;
					if (Class15.aClass15Array1[local273].anInt450 == this.anIntArray69[this.anInt282]) {
						this.aBoolean52 = true;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 231) {
					this.anInt286 = 0;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 151) {
					this.anInt154 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt214 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt316 = this.aClass1_Sub3_Sub3_5.method372();
					this.aBoolean61 = true;
					this.aBoolean64 = true;
					this.anInt289 = -1;
					return true;
				}
				@Pc(620) int local620;
				@Pc(653) int local653;
				@Pc(506) long local506;
				if (this.anInt289 == 48) {
					local506 = this.aClass1_Sub3_Sub3_5.method378();
					local283 = this.aClass1_Sub3_Sub3_5.method372();
					@Pc(516) String local516 = Class40.method522(Class40.method519(local506));
					for (local293 = 0; local293 < this.anInt215; local293++) {
						if (local506 == this.aLongArray4[local293]) {
							if (this.anIntArray34[local293] != local283) {
								this.anIntArray34[local293] = local283;
								this.aBoolean52 = true;
								if (local283 > 0) {
									this.method88(5, local516 + " has logged in.", "");
								}
								if (local283 == 0) {
									this.method88(5, local516 + " has logged out.", "");
								}
							}
							local516 = null;
							break;
						}
					}
					if (local516 != null && this.anInt215 < 100) {
						this.aLongArray4[this.anInt215] = local506;
						this.aStringArray6[this.anInt215] = local516;
						this.anIntArray34[this.anInt215] = local283;
						this.anInt215++;
						this.aBoolean52 = true;
					}
					@Pc(614) boolean local614 = false;
					while (!local614) {
						local614 = true;
						for (local620 = 0; local620 < this.anInt215 - 1; local620++) {
							if (this.anIntArray34[local620] != anInt220 && this.anIntArray34[local620 + 1] == anInt220 || this.anIntArray34[local620] == 0 && this.anIntArray34[local620 + 1] != 0) {
								local653 = this.anIntArray34[local620];
								this.anIntArray34[local620] = this.anIntArray34[local620 + 1];
								this.anIntArray34[local620 + 1] = local653;
								@Pc(675) String local675 = this.aStringArray6[local620];
								this.aStringArray6[local620] = this.aStringArray6[local620 + 1];
								this.aStringArray6[local620 + 1] = local675;
								@Pc(697) long local697 = this.aLongArray4[local620];
								this.aLongArray4[local620] = this.aLongArray4[local620 + 1];
								this.aLongArray4[local620 + 1] = local697;
								this.aBoolean52 = true;
								local614 = false;
							}
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 60) {
					this.anInt307 = this.anInt288 / 8;
					for (local273 = 0; local273 < this.anInt307; local273++) {
						this.aLongArray3[local273] = this.aClass1_Sub3_Sub3_5.method378();
					}
					this.anInt289 = -1;
					return true;
				}
				@Pc(886) int local886;
				if (this.anInt289 == 29) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method374();
					if (this.anInt251 == local273 && this.anInt252 == local277 && this.anInt145 != 0) {
						this.anInt289 = -1;
						return true;
					}
					this.anInt251 = local273;
					this.anInt252 = local277;
					this.anInt150 = (this.anInt251 - 6) * 8;
					this.anInt151 = (this.anInt252 - 6) * 8;
					this.anInt145 = 1;
					this.aClass32_27.method444();
					this.aClass1_Sub3_Sub2_Sub4_2.method347("Loading - please wait.", 151, 257, 0);
					this.aClass1_Sub3_Sub2_Sub4_2.method347("Loading - please wait.", 150, 256, 16777215);
					this.aClass32_27.method445(super.aGraphics2, 8, 11);
					signlink.looprate(5);
					local283 = (this.anInt288 - 2) / 10;
					this.aByteArrayArray1 = new byte[local283][];
					this.aByteArrayArray2 = new byte[local283][];
					this.anIntArray72 = new int[local283];
					this.aClass1_Sub3_Sub3_4.method361(58);
					this.aClass1_Sub3_Sub3_4.method362(0);
					local289 = 0;
					@Pc(898) int local898;
					for (local293 = 0; local293 < local283; local293++) {
						local886 = this.aClass1_Sub3_Sub3_5.method372();
						local620 = this.aClass1_Sub3_Sub3_5.method372();
						local653 = this.aClass1_Sub3_Sub3_5.method377();
						local898 = this.aClass1_Sub3_Sub3_5.method377();
						this.anIntArray72[local293] = (local886 << 8) + local620;
						@Pc(922) byte[] local922;
						if (local653 != 0) {
							local922 = signlink.cacheload("m" + local886 + "_" + local620);
							if (local922 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local922);
								if ((int) this.aCRC32_1.getValue() != local653) {
									local922 = null;
								}
							}
							if (local922 == null) {
								this.anInt145 = 0;
								this.aClass1_Sub3_Sub3_4.method362(0);
								this.aClass1_Sub3_Sub3_4.method362(local886);
								this.aClass1_Sub3_Sub3_4.method362(local620);
								local289 += 3;
							} else {
								this.aByteArrayArray1[local293] = local922;
							}
						}
						if (local898 != 0) {
							local922 = signlink.cacheload("l" + local886 + "_" + local620);
							if (local922 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local922);
								if ((int) this.aCRC32_1.getValue() != local898) {
									local922 = null;
								}
							}
							if (local922 == null) {
								this.anInt145 = 0;
								this.aClass1_Sub3_Sub3_4.method362(1);
								this.aClass1_Sub3_Sub3_4.method362(local886);
								this.aClass1_Sub3_Sub3_4.method362(local620);
								local289 += 3;
							} else {
								this.aByteArrayArray2[local293] = local922;
							}
						}
					}
					this.aClass1_Sub3_Sub3_4.method371(local289);
					signlink.looprate(50);
					this.aClass32_27.method444();
					if (this.anInt145 == 0) {
						this.aClass1_Sub3_Sub2_Sub4_2.method347("Map area updated since last visit, so load will take longer this time only", 166, 257, 0);
						this.aClass1_Sub3_Sub2_Sub4_2.method347("Map area updated since last visit, so load will take longer this time only", 165, 256, 16777215);
					}
					this.aClass32_27.method445(super.aGraphics2, 8, 11);
					local886 = this.anInt150 - this.anInt152;
					local620 = this.anInt151 - this.anInt153;
					this.anInt152 = this.anInt150;
					this.anInt153 = this.anInt151;
					for (local653 = 0; local653 < 8192; local653++) {
						@Pc(1092) Class1_Sub1_Sub3_Sub1 local1092 = this.aClass1_Sub1_Sub3_Sub1Array1[local653];
						if (local1092 != null) {
							for (@Pc(1096) int local1096 = 0; local1096 < 10; local1096++) {
								local1092.anIntArray232[local1096] -= local886;
								local1092.anIntArray233[local1096] -= local620;
							}
							local1092.anInt873 -= local886 * 128;
							local1092.anInt874 -= local620 * 128;
						}
					}
					for (local898 = 0; local898 < this.anInt155; local898++) {
						@Pc(1147) Class1_Sub1_Sub3_Sub2 local1147 = this.aClass1_Sub1_Sub3_Sub2Array1[local898];
						if (local1147 != null) {
							for (@Pc(1151) int local1151 = 0; local1151 < 10; local1151++) {
								local1147.anIntArray232[local1151] -= local886;
								local1147.anIntArray233[local1151] -= local620;
							}
							local1147.anInt873 -= local886 * 128;
							local1147.anInt874 -= local620 * 128;
						}
					}
					@Pc(1196) byte local1196 = 0;
					@Pc(1198) byte local1198 = 104;
					@Pc(1200) byte local1200 = 1;
					if (local886 < 0) {
						local1196 = 103;
						local1198 = -1;
						local1200 = -1;
					}
					@Pc(1210) byte local1210 = 0;
					@Pc(1212) byte local1212 = 104;
					@Pc(1214) byte local1214 = 1;
					if (local620 < 0) {
						local1210 = 103;
						local1212 = -1;
						local1214 = -1;
					}
					for (@Pc(1224) int local1224 = local1196; local1224 != local1198; local1224 += local1200) {
						for (@Pc(1228) int local1228 = local1210; local1228 != local1212; local1228 += local1214) {
							@Pc(1234) int local1234 = local1224 + local886;
							@Pc(1238) int local1238 = local1228 + local620;
							for (@Pc(1240) int local1240 = 0; local1240 < 4; local1240++) {
								if (local1234 >= 0 && local1238 >= 0 && local1234 < 104 && local1238 < 104) {
									this.aClass28ArrayArrayArray1[local1240][local1224][local1228] = this.aClass28ArrayArrayArray1[local1240][local1234][local1238];
								} else {
									this.aClass28ArrayArrayArray1[local1240][local1224][local1228] = null;
								}
							}
						}
					}
					for (@Pc(1302) Class1_Sub4 local1302 = (Class1_Sub4) this.aClass28_2.method437(); local1302 != null; local1302 = (Class1_Sub4) this.aClass28_2.method439(this.aByte14)) {
						local1302.anInt573 -= local886;
						local1302.anInt574 -= local620;
						if (local1302.anInt573 < 0 || local1302.anInt574 < 0 || local1302.anInt573 >= 104 || local1302.anInt574 >= 104) {
							local1302.method547();
						}
					}
					if (this.anInt286 != 0) {
						this.anInt286 -= local886;
						this.anInt287 -= local620;
					}
					this.aBoolean73 = false;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 188) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method374();
					Class15.aClass15Array1[local273].anInt467 = local277;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 233) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method374();
					@Pc(1401) Class3 local1401 = Class3.method32(local277);
					Class15.aClass15Array1[local273].aClass1_Sub3_Sub1_2 = local1401.method35();
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 208) {
					this.anInt240 = this.aClass1_Sub3_Sub3_5.method372();
					if (this.anInt240 == this.anInt282) {
						if (this.anInt240 == 3) {
							this.anInt282 = 1;
						} else {
							this.anInt282 = 3;
						}
						this.aBoolean52 = true;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 18) {
					this.method148(this.aClass1_Sub3_Sub3_5, this.anInt288);
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 24) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					@Pc(1480) boolean local1480 = this.aClass1_Sub3_Sub3_5.method372() == 1;
					Class15.aClass15Array1[local273].aBoolean118 = local1480;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 171) {
					local273 = this.aClass1_Sub3_Sub3_5.method372();
					local277 = this.aClass1_Sub3_Sub3_5.method372();
					local283 = -1;
					for (local289 = 0; local289 < this.anIntArray72.length; local289++) {
						if (this.anIntArray72[local289] == (local273 << 8) + local277) {
							local283 = local289;
						}
					}
					if (local283 != -1) {
						signlink.cachesave("l" + local273 + "_" + local277, this.aByteArrayArray2[local283]);
						this.anInt145 = 1;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 199) {
					this.aBoolean62 = false;
					this.aBoolean58 = true;
					this.aString12 = "";
					this.aBoolean64 = true;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 34) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					@Pc(1586) byte local1586 = this.aClass1_Sub3_Sub3_5.method373();
					this.anIntArray32[local273] = local1586;
					if (this.anIntArray35[local273] != local1586) {
						this.anIntArray35[local273] = local1586;
						this.method85(local273);
						this.aBoolean52 = true;
						if (this.anInt243 != -1) {
							this.aBoolean64 = true;
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 235) {
					this.anInt211 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt212 = this.aClass1_Sub3_Sub3_5.method372();
					for (local273 = this.anInt211; local273 < this.anInt211 + 8; local273++) {
						for (local277 = this.anInt212; local277 < this.anInt212 + 8; local277++) {
							if (this.aClass28ArrayArrayArray1[this.anInt269][local273][local277] != null) {
								this.aClass28ArrayArrayArray1[this.anInt269][local273][local277] = null;
								this.method80(local273, local277);
							}
						}
					}
					for (@Pc(1688) Class1_Sub4 local1688 = (Class1_Sub4) this.aClass28_2.method437(); local1688 != null; local1688 = (Class1_Sub4) this.aClass28_2.method439(this.aByte14)) {
						if (local1688.anInt573 >= this.anInt211 && local1688.anInt573 < this.anInt211 + 8 && local1688.anInt574 >= this.anInt212 && local1688.anInt574 < this.anInt212 + 8 && local1688.anInt571 == this.anInt269) {
							this.method168(local1688.anInt573, local1688.anInt579, local1688.anInt572, local1688.anInt571, local1688.anInt578, local1688.anInt574, local1688.anInt580);
							local1688.method547();
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 22) {
					this.anInt273 = this.aClass1_Sub3_Sub3_5.method372();
					if (this.anInt273 == 1) {
						this.anInt271 = this.aClass1_Sub3_Sub3_5.method374();
					}
					if (this.anInt273 >= 2 && this.anInt273 <= 6) {
						if (this.anInt273 == 2) {
							this.anInt225 = 64;
							this.anInt226 = 64;
						}
						if (this.anInt273 == 3) {
							this.anInt225 = 0;
							this.anInt226 = 64;
						}
						if (this.anInt273 == 4) {
							this.anInt225 = 128;
							this.anInt226 = 64;
						}
						if (this.anInt273 == 5) {
							this.anInt225 = 64;
							this.anInt226 = 0;
						}
						if (this.anInt273 == 6) {
							this.anInt225 = 64;
							this.anInt226 = 128;
						}
						this.anInt273 = 2;
						this.anInt222 = this.aClass1_Sub3_Sub3_5.method374();
						this.anInt223 = this.aClass1_Sub3_Sub3_5.method374();
						this.anInt224 = this.aClass1_Sub3_Sub3_5.method372();
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 135) {
					this.method178();
					this.anInt289 = -1;
					return false;
				}
				if (this.anInt289 == 185) {
					for (local273 = 0; local273 < this.anIntArray35.length; local273++) {
						if (this.anIntArray35[local273] != this.anIntArray32[local273]) {
							this.anIntArray35[local273] = this.anIntArray32[local273];
							this.method85(local273);
							this.aBoolean52 = true;
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 248) {
					for (local273 = 0; local273 < this.aClass1_Sub1_Sub3_Sub2Array1.length; local273++) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local273] != null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local273].anInt898 = -1;
						}
					}
					for (local277 = 0; local277 < this.aClass1_Sub1_Sub3_Sub1Array1.length; local277++) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local277] != null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local277].anInt898 = -1;
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 26) {
					if (this.anInt282 == 12) {
						this.aBoolean52 = true;
					}
					this.anInt194 = this.aClass1_Sub3_Sub3_5.method375();
					this.anInt289 = -1;
					return true;
				}
				@Pc(1998) Class15 local1998;
				if (this.anInt289 == 154) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method374();
					local283 = this.aClass1_Sub3_Sub3_5.method374();
					local1998 = Class15.aClass15Array1[local273];
					@Pc(2001) Class1_Sub3_Sub1 local2001 = local1998.aClass1_Sub3_Sub1_2;
					if (local2001 != null) {
						local2001.method225(local277, local283);
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 112) {
					this.aBoolean73 = false;
					for (local273 = 0; local273 < 5; local273++) {
						this.aBooleanArray1[local273] = false;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 5) {
					local273 = this.aClass1_Sub3_Sub3_5.method372();
					local277 = this.aClass1_Sub3_Sub3_5.method372();
					local283 = this.aClass1_Sub3_Sub3_5.method372();
					local289 = this.aClass1_Sub3_Sub3_5.method372();
					this.aBooleanArray1[local273] = true;
					this.anIntArray82[local273] = local277;
					this.anIntArray73[local273] = local283;
					this.anIntArray52[local273] = local289;
					this.anIntArray33[local273] = 0;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 124) {
					this.aBoolean73 = true;
					this.anInt318 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt319 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt320 = this.aClass1_Sub3_Sub3_5.method374();
					this.anInt321 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt322 = this.aClass1_Sub3_Sub3_5.method372();
					if (this.anInt322 >= 100) {
						local273 = this.anInt318 * 128 + 64;
						local277 = this.anInt319 * 128 + 64;
						local283 = this.method132(this.anInt269, this.anInt318, this.anInt319) - this.anInt320;
						local289 = local273 - this.anInt140;
						local293 = local283 - this.anInt141;
						local886 = local277 - this.anInt142;
						local620 = (int) Math.sqrt((double) (local289 * local289 + local886 * local886));
						this.anInt143 = (int) (Math.atan2((double) local293, (double) local620) * 325.949D) & 0x7FF;
						this.anInt144 = (int) (Math.atan2((double) local289, (double) local886) * -325.949D) & 0x7FF;
						if (this.anInt143 < 128) {
							this.anInt143 = 128;
						}
						if (this.anInt143 > 383) {
							this.anInt143 = 383;
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 116) {
					this.anInt282 = this.aClass1_Sub3_Sub3_5.method372();
					this.aBoolean52 = true;
					this.aBoolean66 = true;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 236) {
					this.anInt177 = this.aClass1_Sub3_Sub3_5.method377();
					this.anInt302 = this.aClass1_Sub3_Sub3_5.method374();
					this.anInt189 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt196 = this.aClass1_Sub3_Sub3_5.method374();
					if (this.anInt177 != 0 && this.anInt216 == -1) {
						signlink.dnslookup(Class40.method521(this.anInt177));
						this.method144();
						@Pc(2280) short local2280 = 650;
						if (this.anInt189 != 201) {
							local2280 = 655;
						}
						this.aString17 = "";
						this.aBoolean60 = false;
						for (local277 = 0; local277 < Class15.aClass15Array1.length; local277++) {
							if (Class15.aClass15Array1[local277] != null && Class15.aClass15Array1[local277].anInt453 == local2280) {
								this.anInt216 = Class15.aClass15Array1[local277].anInt450;
								break;
							}
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 245) {
					Class8.method198(true);
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 7) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method374();
					local283 = this.aClass1_Sub3_Sub3_5.method374();
					@Pc(2355) Class5 local2355 = Class5.method54(local277);
					Class15.aClass15Array1[local273].aClass1_Sub3_Sub1_2 = local2355.method58(50);
					Class15.aClass15Array1[local273].anInt470 = local2355.anInt102;
					Class15.aClass15Array1[local273].anInt471 = local2355.anInt103;
					Class15.aClass15Array1[local273].anInt469 = local2355.anInt101 * 100 / local283;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 223) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					this.method79(local273);
					if (this.anInt180 != -1) {
						this.anInt180 = -1;
						this.aBoolean64 = true;
					}
					if (this.aBoolean58) {
						this.aBoolean58 = false;
						this.aBoolean64 = true;
					}
					this.anInt161 = local273;
					this.aBoolean52 = true;
					this.aBoolean66 = true;
					this.anInt216 = -1;
					this.aBoolean46 = false;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 191) {
					this.anInt211 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt212 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 156 || this.anInt289 == 146 || this.anInt289 == 181 || this.anInt289 == 209 || this.anInt289 == 175 || this.anInt289 == 106 || this.anInt289 == 134 || this.anInt289 == 63 || this.anInt289 == 140 || this.anInt289 == 204) {
					this.method172(this.aClass1_Sub3_Sub3_5, this.anInt289, this.anInt188);
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 90) {
					local273 = this.aClass1_Sub3_Sub3_5.method372();
					local277 = this.aClass1_Sub3_Sub3_5.method372();
					local283 = this.aClass1_Sub3_Sub3_5.method374();
					local289 = this.aClass1_Sub3_Sub3_5.method374();
					local293 = -1;
					for (local886 = 0; local886 < this.anIntArray72.length; local886++) {
						if (this.anIntArray72[local886] == (local273 << 8) + local277) {
							local293 = local886;
						}
					}
					if (local293 != -1) {
						if (this.aByteArrayArray2[local293] == null || this.aByteArrayArray2[local293].length != local289) {
							this.aByteArrayArray2[local293] = new byte[local289];
						}
						this.aClass1_Sub3_Sub3_5.method381(this.aByteArrayArray2[local293], this.anInt288 - 6, local283);
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 38) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					Class15.aClass15Array1[local273].aClass1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub2_1.method554();
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 138) {
					this.anInt190 = this.aClass1_Sub3_Sub3_5.method374() * 30;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 150) {
					if (this.aBoolean77 && !aBoolean55) {
						if (this.aByteArray5 == null) {
							this.aByteArray5 = new byte[10000];
						}
						local273 = this.aClass1_Sub3_Sub3_5.method374();
						local277 = this.aClass1_Sub3_Sub3_5.method377();
						local283 = this.anInt288 - 6;
						Class34.method499(this.aByteArray5, local277, this.aClass1_Sub3_Sub3_5.aByteArray8, local283, this.aClass1_Sub3_Sub3_5.anInt539);
						this.method138(local273, this.aByteArray5, local277);
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 32) {
					this.anInt256 = this.aClass1_Sub3_Sub3_5.method374();
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 170) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method375();
					local283 = this.aClass1_Sub3_Sub3_5.method375();
					local1998 = Class15.aClass15Array1[local273];
					local1998.anInt456 = local277;
					local1998.anInt457 = local283;
					this.anInt289 = -1;
					return true;
				}
				@Pc(2745) Class15 local2745;
				if (this.anInt289 == 16) {
					this.aBoolean52 = true;
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local2745 = Class15.aClass15Array1[local273];
					while (this.aClass1_Sub3_Sub3_5.anInt539 < this.anInt288) {
						local283 = this.aClass1_Sub3_Sub3_5.method372();
						local289 = this.aClass1_Sub3_Sub3_5.method374();
						local293 = this.aClass1_Sub3_Sub3_5.method372();
						if (local293 == 255) {
							local293 = this.aClass1_Sub3_Sub3_5.method377();
						}
						if (local283 >= 0 && local283 < local2745.anIntArray149.length) {
							local2745.anIntArray149[local283] = local289;
							local2745.anIntArray150[local283] = local293;
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 187) {
					local2802 = this.aClass1_Sub3_Sub3_5.method379();
					if (!local2802.equals(this.aString9)) {
						this.aString9 = local2802;
						if (this.aBoolean78) {
							this.method130(local2802);
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 47) {
					this.aBoolean52 = true;
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local2745 = Class15.aClass15Array1[local273];
					local283 = this.aClass1_Sub3_Sub3_5.method372();
					for (local289 = 0; local289 < local283; local289++) {
						local2745.anIntArray149[local289] = this.aClass1_Sub3_Sub3_5.method374();
						local293 = this.aClass1_Sub3_Sub3_5.method372();
						if (local293 == 255) {
							local293 = this.aClass1_Sub3_Sub3_5.method377();
						}
						local2745.anIntArray150[local289] = local293;
					}
					for (local293 = local283; local293 < local2745.anIntArray149.length; local293++) {
						local2745.anIntArray149[local293] = 0;
						local2745.anIntArray150[local293] = 0;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 55) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local2745 = Class15.aClass15Array1[local273];
					for (local283 = 0; local283 < local2745.anIntArray149.length; local283++) {
						local2745.anIntArray149[local283] = -1;
						local2745.anIntArray149[local283] = 0;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 234) {
					this.anInt211 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt212 = this.aClass1_Sub3_Sub3_5.method372();
					while (this.aClass1_Sub3_Sub3_5.anInt539 < this.anInt288) {
						local273 = this.aClass1_Sub3_Sub3_5.method372();
						this.method172(this.aClass1_Sub3_Sub3_5, local273, this.anInt188);
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 160) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method372();
					local283 = this.aClass1_Sub3_Sub3_5.method374();
					if (this.aBoolean44 && !aBoolean55 && this.anInt283 < 50) {
						this.anIntArray42[this.anInt283] = local273;
						this.anIntArray74[this.anInt283] = local277;
						this.anIntArray71[this.anInt283] = local283 + Class43.anIntArray231[local273];
						this.anInt283++;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 89) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					this.method79(local273);
					if (this.anInt161 != -1) {
						this.anInt161 = -1;
						this.aBoolean52 = true;
						this.aBoolean66 = true;
					}
					this.anInt180 = local273;
					this.aBoolean64 = true;
					this.anInt216 = -1;
					this.aBoolean46 = false;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 37) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					this.method79(local273);
					if (this.anInt161 != -1) {
						this.anInt161 = -1;
						this.aBoolean52 = true;
						this.aBoolean66 = true;
					}
					if (this.anInt180 != -1) {
						this.anInt180 = -1;
						this.aBoolean64 = true;
					}
					if (this.aBoolean58) {
						this.aBoolean58 = false;
						this.aBoolean64 = true;
					}
					this.anInt216 = local273;
					this.aBoolean46 = false;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 9) {
					if (this.anInt161 != -1) {
						this.anInt161 = -1;
						this.aBoolean52 = true;
						this.aBoolean66 = true;
					}
					if (this.anInt180 != -1) {
						this.anInt180 = -1;
						this.aBoolean64 = true;
					}
					if (this.aBoolean58) {
						this.aBoolean58 = false;
						this.aBoolean64 = true;
					}
					this.anInt216 = -1;
					this.aBoolean46 = false;
					this.anInt289 = -1;
					return true;
				}
				@Pc(3193) boolean local3193;
				if (this.anInt289 == 203) {
					local506 = this.aClass1_Sub3_Sub3_5.method378();
					local283 = this.aClass1_Sub3_Sub3_5.method377();
					local289 = this.aClass1_Sub3_Sub3_5.method372();
					local3193 = false;
					for (local886 = 0; local886 < 100; local886++) {
						if (this.anIntArray79[local886] == local283) {
							local3193 = true;
							break;
						}
					}
					if (local289 <= 1) {
						for (local620 = 0; local620 < this.anInt307; local620++) {
							if (this.aLongArray3[local620] == local506) {
								local3193 = true;
								break;
							}
						}
					}
					if (!local3193 && this.anInt298 == 0) {
						try {
							this.anIntArray79[this.anInt325] = local283;
							this.anInt325 = (this.anInt325 + 1) % 100;
							@Pc(3262) String local3262 = Class41.method525(this.anInt288 - 13, this.aClass1_Sub3_Sub3_5);
							@Pc(3266) String local3266 = Class25.method405(local3262);
							if (local289 > 1) {
								this.method88(7, local3266, Class40.method522(Class40.method519(local506)));
							} else {
								this.method88(3, local3266, Class40.method522(Class40.method519(local506)));
							}
						} catch (@Pc(3293) Exception local3293) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 102) {
					this.aBoolean73 = true;
					this.anInt197 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt198 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt199 = this.aClass1_Sub3_Sub3_5.method374();
					this.anInt200 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt201 = this.aClass1_Sub3_Sub3_5.method372();
					if (this.anInt201 >= 100) {
						this.anInt140 = this.anInt197 * 128 + 64;
						this.anInt142 = this.anInt198 * 128 + 64;
						this.anInt141 = this.method132(this.anInt269, this.anInt197, this.anInt198) - this.anInt199;
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 74) {
					this.anInt202 = this.aClass1_Sub3_Sub3_5.method372();
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 121) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method374();
					Class15.aClass15Array1[local273].aClass1_Sub3_Sub1_2 = new Class1_Sub3_Sub1(local277, true);
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 120) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method374();
					if (this.anInt180 != -1) {
						this.anInt180 = -1;
						this.aBoolean64 = true;
					}
					if (this.aBoolean58) {
						this.aBoolean58 = false;
						this.aBoolean64 = true;
					}
					this.anInt216 = local273;
					this.anInt161 = local277;
					this.aBoolean52 = true;
					this.aBoolean66 = true;
					this.aBoolean46 = false;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 36) {
					local273 = this.aClass1_Sub3_Sub3_5.method372();
					local277 = this.aClass1_Sub3_Sub3_5.method372();
					local283 = this.aClass1_Sub3_Sub3_5.method374();
					local289 = this.aClass1_Sub3_Sub3_5.method374();
					local293 = -1;
					for (local886 = 0; local886 < this.anIntArray72.length; local886++) {
						if (this.anIntArray72[local886] == (local273 << 8) + local277) {
							local293 = local886;
						}
					}
					if (local293 != -1) {
						if (this.aByteArrayArray1[local293] == null || this.aByteArrayArray1[local293].length != local289) {
							this.aByteArrayArray1[local293] = new byte[local289];
						}
						this.aClass1_Sub3_Sub3_5.method381(this.aByteArrayArray1[local293], this.anInt288 - 6, local283);
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 118) {
					this.aBoolean52 = true;
					local273 = this.aClass1_Sub3_Sub3_5.method372();
					local277 = this.aClass1_Sub3_Sub3_5.method377();
					local283 = this.aClass1_Sub3_Sub3_5.method372();
					this.anIntArray53[local273] = local277;
					this.anIntArray84[local273] = local283;
					this.anIntArray78[local273] = 1;
					for (local289 = 0; local289 < 98; local289++) {
						if (local277 >= anIntArray39[local289]) {
							this.anIntArray78[local273] = local289 + 2;
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 230) {
					local273 = this.aClass1_Sub3_Sub3_5.method374();
					local277 = this.aClass1_Sub3_Sub3_5.method377();
					this.anIntArray32[local273] = local277;
					if (this.anIntArray35[local273] != local277) {
						this.anIntArray35[local273] = local277;
						this.method85(local273);
						this.aBoolean52 = true;
						if (this.anInt243 != -1) {
							this.aBoolean64 = true;
						}
					}
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 27) {
					local273 = this.aClass1_Sub3_Sub3_5.method375();
					this.anInt243 = local273;
					this.aBoolean64 = true;
					this.anInt289 = -1;
					return true;
				}
				if (this.anInt289 == 35) {
					local2802 = this.aClass1_Sub3_Sub3_5.method379();
					@Pc(3693) long local3693;
					if (local2802.endsWith(":tradereq:")) {
						local432 = local2802.substring(0, local2802.indexOf(":"));
						local3693 = Class40.method518(local432);
						local3193 = false;
						for (local886 = 0; local886 < this.anInt307; local886++) {
							if (this.aLongArray3[local886] == local3693) {
								local3193 = true;
								break;
							}
						}
						if (!local3193 && this.anInt298 == 0) {
							this.method88(4, "wishes to trade with you.", local432);
						}
					} else if (local2802.endsWith(":duelreq:")) {
						local432 = local2802.substring(0, local2802.indexOf(":"));
						local3693 = Class40.method518(local432);
						local3193 = false;
						for (local886 = 0; local886 < this.anInt307; local886++) {
							if (this.aLongArray3[local886] == local3693) {
								local3193 = true;
								break;
							}
						}
						if (!local3193 && this.anInt298 == 0) {
							this.method88(8, "wishes to duel with you.", local432);
						}
					} else {
						this.method88(0, local2802, "");
					}
					this.anInt289 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt289 + "," + this.anInt288 + " - " + this.anInt234 + "," + this.anInt235);
				this.method178();
			} catch (@Pc(3817) IOException local3817) {
				this.method126();
			} catch (@Pc(3822) Exception local3822) {
				local2802 = "T2 - " + this.anInt289 + "," + this.anInt234 + "," + this.anInt235 + " - " + this.anInt288 + "," + (this.anInt150 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0]) + "," + (this.anInt151 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0]) + " - ";
				for (local277 = 0; local277 < this.anInt288 && local277 < 50; local277++) {
					local2802 = local2802 + this.aClass1_Sub3_Sub3_5.aByteArray8[local277] + ",";
				}
				signlink.reporterror(local2802);
				this.method178();
			}
			return true;
		} catch (@Pc(3905) RuntimeException local3905) {
			signlink.reporterror("7553, " + -17511 + ", " + local3905.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method156() {
		try {
			this.aClass32_25.method444();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray60;
			this.aClass1_Sub3_Sub2_Sub3_16.method335(0, 0);
			if (this.anInt161 != -1) {
				this.method183(0, Class15.aClass15Array1[this.anInt161], this.aByte11, 0, 0);
			} else if (this.anIntArray69[this.anInt282] != -1) {
				this.method183(0, Class15.aClass15Array1[this.anIntArray69[this.anInt282]], this.aByte11, 0, 0);
			}
			if (this.aBoolean51 && this.anInt246 == 1) {
				this.method115();
			}
			this.aClass32_25.method445(super.aGraphics2, 562, 231);
			this.aClass32_27.method444();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray61;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("32297, " + -708 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method157() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt157; local3++) {
				if (local3 == -1) {
					local11 = this.anInt156;
				} else {
					local11 = this.anIntArray30[local3];
				}
				@Pc(23) Class1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null && local23.anInt884 > 0) {
					local23.anInt884--;
					if (local23.anInt884 == 0) {
						local23.aString29 = null;
					}
				}
			}
			this.aBoolean70 &= true;
			for (local11 = 0; local11 < this.anInt183; local11++) {
				@Pc(60) int local60 = this.anIntArray36[local11];
				@Pc(65) Class1_Sub1_Sub3_Sub1 local65 = this.aClass1_Sub1_Sub3_Sub1Array1[local60];
				if (local65 != null && local65.anInt884 > 0) {
					local65.anInt884--;
					if (local65.anInt884 == 0) {
						local65.aString29 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("45018, " + true + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)V")
	private void method158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(8) int local8 = this.aClass33_1.method474(arg0, arg2, arg1);
			@Pc(22) int local22;
			@Pc(28) int local28;
			@Pc(32) int local32;
			@Pc(34) int local34;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local8 != 0) {
				local22 = this.aClass33_1.method478(arg0, arg2, arg1, local8);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = 15658734;
				if (local8 > 0) {
					local34 = 15597568;
				}
				@Pc(42) int[] local42 = this.aClass1_Sub3_Sub2_Sub2_6.anIntArray148;
				local56 = arg2 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local62 = local8 >> 14 & 0x7FFF;
				@Pc(65) Class2 local65 = Class2.method23(local62);
				if (local65.anInt48 == -1) {
					if (local32 == 0 || local32 == 2) {
						if (local28 == 0) {
							local42[local56] = local34;
							local42[local56 + 512] = local34;
							local42[local56 + 1024] = local34;
							local42[local56 + 1536] = local34;
						} else if (local28 == 1) {
							local42[local56] = local34;
							local42[local56 + 1] = local34;
							local42[local56 + 2] = local34;
							local42[local56 + 3] = local34;
						} else if (local28 == 2) {
							local42[local56 + 3] = local34;
							local42[local56 + 3 + 512] = local34;
							local42[local56 + 3 + 1024] = local34;
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 3) {
							local42[local56 + 1536] = local34;
							local42[local56 + 1536 + 1] = local34;
							local42[local56 + 1536 + 2] = local34;
							local42[local56 + 1536 + 3] = local34;
						}
					}
					if (local32 == 3) {
						if (local28 == 0) {
							local42[local56] = local34;
						} else if (local28 == 1) {
							local42[local56 + 3] = local34;
						} else if (local28 == 2) {
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 3) {
							local42[local56 + 1536] = local34;
						}
					}
					if (local32 == 2) {
						if (local28 == 3) {
							local42[local56] = local34;
							local42[local56 + 512] = local34;
							local42[local56 + 1024] = local34;
							local42[local56 + 1536] = local34;
						} else if (local28 == 0) {
							local42[local56] = local34;
							local42[local56 + 1] = local34;
							local42[local56 + 2] = local34;
							local42[local56 + 3] = local34;
						} else if (local28 == 1) {
							local42[local56 + 3] = local34;
							local42[local56 + 3 + 512] = local34;
							local42[local56 + 3 + 1024] = local34;
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 2) {
							local42[local56 + 1536] = local34;
							local42[local56 + 1536 + 1] = local34;
							local42[local56 + 1536 + 2] = local34;
							local42[local56 + 1536 + 3] = local34;
						}
					}
				} else {
					@Pc(75) Class1_Sub3_Sub2_Sub3 local75 = this.aClass1_Sub3_Sub2_Sub3Array1[local65.anInt48];
					if (local75 != null) {
						@Pc(87) int local87 = (local65.anInt43 * 4 - local75.anInt492) / 2;
						@Pc(97) int local97 = (local65.anInt44 * 4 - local75.anInt493) / 2;
						local75.method335(arg2 * 4 + local87 + 48, (104 - arg1 - local65.anInt44) * 4 + 48 + local97);
					}
				}
			}
			local8 = this.aClass33_1.method476(arg0, arg2, arg1);
			if (local8 != 0) {
				local22 = this.aClass33_1.method478(arg0, arg2, arg1, local8);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = local8 >> 14 & 0x7FFF;
				@Pc(451) Class2 local451 = Class2.method23(local34);
				@Pc(483) int local483;
				if (local451.anInt48 != -1) {
					@Pc(461) Class1_Sub3_Sub2_Sub3 local461 = this.aClass1_Sub3_Sub2_Sub3Array1[local451.anInt48];
					if (local461 != null) {
						local62 = (local451.anInt43 * 4 - local461.anInt492) / 2;
						local483 = (local451.anInt44 * 4 - local461.anInt493) / 2;
						local461.method335(arg2 * 4 + local62 + 48, (104 - arg1 - local451.anInt44) * 4 + 48 + local483);
					}
				} else if (local32 == 9) {
					local56 = 15658734;
					if (local8 > 0) {
						local56 = 15597568;
					}
					@Pc(520) int[] local520 = this.aClass1_Sub3_Sub2_Sub2_6.anIntArray148;
					local483 = arg2 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local28 == 0 || local28 == 2) {
						local520[local483 + 1536] = local56;
						local520[local483 + 1024 + 1] = local56;
						local520[local483 + 512 + 2] = local56;
						local520[local483 + 3] = local56;
					} else {
						local520[local483] = local56;
						local520[local483 + 512 + 1] = local56;
						local520[local483 + 1024 + 2] = local56;
						local520[local483 + 1536 + 3] = local56;
					}
				}
			}
			local8 = this.aClass33_1.method477(arg0, arg2, arg1);
			if (local8 != 0) {
				local22 = local8 >> 14 & 0x7FFF;
				@Pc(615) Class2 local615 = Class2.method23(local22);
				if (local615.anInt48 != -1) {
					@Pc(625) Class1_Sub3_Sub2_Sub3 local625 = this.aClass1_Sub3_Sub2_Sub3Array1[local615.anInt48];
					if (local625 != null) {
						local34 = (local615.anInt43 * 4 - local625.anInt492) / 2;
						@Pc(647) int local647 = (local615.anInt44 * 4 - local625.anInt493) / 2;
						local625.method335(arg2 * 4 + local34 + 48, (104 - arg1 - local615.anInt44) * 4 + 48 + local647);
						return;
					}
				}
			}
		} catch (@Pc(671) RuntimeException local671) {
			signlink.reporterror("3155, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 702 + ", " + local671.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method159() {
		try {
			if (super.anInt132 == 1) {
				@Pc(16) int local16 = super.anInt133 - 21 - 561;
				@Pc(23) int local23 = super.anInt134 - 9 - 5;
				if (local16 >= 0 && local23 >= 0 && local16 < 146 && local23 < 151) {
					local16 -= 73;
					local23 -= 75;
					@Pc(40) int local40 = Class1_Sub3_Sub2_Sub1.anIntArray137[this.anInt230];
					@Pc(45) int local45 = Class1_Sub3_Sub2_Sub1.anIntArray138[this.anInt230];
					@Pc(55) int local55 = local23 * local40 + local16 * local45 >> 11;
					@Pc(65) int local65 = local23 * local45 - local16 * local40 >> 11;
					@Pc(73) int local73 = this.aClass1_Sub1_Sub3_Sub2_1.anInt873 + local55 >> 7;
					@Pc(81) int local81 = this.aClass1_Sub1_Sub3_Sub2_1.anInt874 - local65 >> 7;
					this.method147(true, local81, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, this.aBoolean49, 0, local73);
					return;
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("5903, " + -86 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	private boolean method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) boolean local7 = false;
			@Pc(11) Class15 local11 = Class15.aClass15Array1[arg1];
			for (@Pc(13) int local13 = 0; local13 < local11.anIntArray153.length && local11.anIntArray153[local13] != -1; local13++) {
				@Pc(28) Class15 local28 = Class15.aClass15Array1[local11.anIntArray153[local13]];
				if (local28.anInt451 == 1) {
					local7 |= this.method160(arg0, local28.anInt449, 400);
				}
				if (local28.anInt451 == 6 && (local28.anInt467 != -1 || local28.anInt468 != -1)) {
					@Pc(58) boolean local58 = this.method189(local28);
					@Pc(63) int local63;
					if (local58) {
						local63 = local28.anInt468;
					} else {
						local63 = local28.anInt467;
					}
					if (local63 != -1) {
						@Pc(75) Class19 local75 = Class19.aClass19Array1[local63];
						local28.anInt448 += arg0;
						while (local28.anInt448 > local75.anIntArray188[local28.anInt447]) {
							local28.anInt448 -= local75.anIntArray188[local28.anInt447] + 1;
							local28.anInt447++;
							if (local28.anInt447 >= local75.anInt521) {
								local28.anInt447 -= local75.anInt522;
								if (local28.anInt447 < 0 || local28.anInt447 >= local75.anInt521) {
									local28.anInt447 = 0;
								}
							}
							local7 = true;
						}
					}
				}
			}
			return local7;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("31916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!kb;)V")
	private void method161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2) {
		try {
			arg2.method382(212);
			@Pc(7) int local7 = arg2.method383(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg2.method383(2);
				if (arg1 == -34388) {
					if (local15 == 0) {
						this.anIntArray31[this.anInt158++] = this.anInt156;
					} else {
						@Pc(42) int local42;
						@Pc(53) int local53;
						if (local15 == 1) {
							local42 = arg2.method383(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method550(false, local42);
							local53 = arg2.method383(1);
							if (local53 == 1) {
								this.anIntArray31[this.anInt158++] = this.anInt156;
							}
						} else {
							@Pc(99) int local99;
							if (local15 == 2) {
								local42 = arg2.method383(3);
								this.aClass1_Sub1_Sub3_Sub2_1.method550(true, local42);
								local53 = arg2.method383(3);
								this.aClass1_Sub1_Sub3_Sub2_1.method550(true, local53);
								local99 = arg2.method383(1);
								if (local99 == 1) {
									this.anIntArray31[this.anInt158++] = this.anInt156;
								}
							} else if (local15 == 3) {
								this.anInt269 = arg2.method383(2);
								local42 = arg2.method383(7);
								local53 = arg2.method383(7);
								local99 = arg2.method383(1);
								this.aClass1_Sub1_Sub3_Sub2_1.method549(this.anInt238, local42, local53, local99 == 1);
								@Pc(157) int local157 = arg2.method383(1);
								if (local157 == 1) {
									this.anIntArray31[this.anInt158++] = this.anInt156;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("1863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!bc;BIII)V")
	private void method162(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt162 < 400) {
				@Pc(17) String local17 = arg0.aString2;
				if (arg0.anInt76 != 0) {
					local17 = local17 + method187(arg0.anInt76, this.aClass1_Sub1_Sub3_Sub2_1.anInt923) + " (level-" + arg0.anInt76 + ")";
				}
				if (this.anInt171 == 1) {
					this.aStringArray8[this.anInt162] = "Use " + this.aString7 + " with @yel@" + local17;
					this.anIntArray87[this.anInt162] = 688;
					this.anIntArray88[this.anInt162] = arg3;
					this.anIntArray85[this.anInt162] = arg2;
					this.anIntArray86[this.anInt162] = arg1;
					this.anInt162++;
				} else if (this.anInt167 != 1) {
					@Pc(156) int local156;
					if (arg0.aStringArray2 != null) {
						for (local156 = 4; local156 >= 0; local156--) {
							if (arg0.aStringArray2[local156] != null && !arg0.aStringArray2[local156].equalsIgnoreCase("attack")) {
								this.aStringArray8[this.anInt162] = arg0.aStringArray2[local156] + " @yel@" + local17;
								if (local156 == 0) {
									this.anIntArray87[this.anInt162] = 614;
								}
								if (local156 == 1) {
									this.anIntArray87[this.anInt162] = 719;
								}
								if (local156 == 2) {
									this.anIntArray87[this.anInt162] = 969;
								}
								if (local156 == 3) {
									this.anIntArray87[this.anInt162] = 890;
								}
								if (local156 == 4) {
									this.anIntArray87[this.anInt162] = 983;
								}
								this.anIntArray88[this.anInt162] = arg3;
								this.anIntArray85[this.anInt162] = arg2;
								this.anIntArray86[this.anInt162] = arg1;
								this.anInt162++;
							}
						}
					}
					if (arg0.aStringArray2 != null) {
						for (local156 = 4; local156 >= 0; local156--) {
							if (arg0.aStringArray2[local156] != null && arg0.aStringArray2[local156].equalsIgnoreCase("attack")) {
								@Pc(280) short local280 = 0;
								if (arg0.anInt76 > this.aClass1_Sub1_Sub3_Sub2_1.anInt923) {
									local280 = 2000;
								}
								this.aStringArray8[this.anInt162] = arg0.aStringArray2[local156] + " @yel@" + local17;
								if (local156 == 0) {
									this.anIntArray87[this.anInt162] = local280 + 614;
								}
								if (local156 == 1) {
									this.anIntArray87[this.anInt162] = local280 + 719;
								}
								if (local156 == 2) {
									this.anIntArray87[this.anInt162] = local280 + 969;
								}
								if (local156 == 3) {
									this.anIntArray87[this.anInt162] = local280 + 890;
								}
								if (local156 == 4) {
									this.anIntArray87[this.anInt162] = local280 + 983;
								}
								this.anIntArray88[this.anInt162] = arg3;
								this.anIntArray85[this.anInt162] = arg2;
								this.anIntArray86[this.anInt162] = arg1;
								this.anInt162++;
							}
						}
					}
					this.aStringArray8[this.anInt162] = "Examine @yel@" + local17;
					this.anIntArray87[this.anInt162] = 1586;
					this.anIntArray88[this.anInt162] = arg3;
					this.anIntArray85[this.anInt162] = arg2;
					this.anIntArray86[this.anInt162] = arg1;
					this.anInt162++;
				} else if ((this.anInt169 & 0x2) == 2) {
					this.aStringArray8[this.anInt162] = this.aString6 + " @yel@" + local17;
					this.anIntArray87[this.anInt162] = 129;
					this.anIntArray88[this.anInt162] = arg3;
					this.anIntArray85[this.anInt162] = arg2;
					this.anIntArray86[this.anInt162] = arg1;
					this.anInt162++;
					return;
				}
			}
		} catch (@Pc(431) RuntimeException local431) {
			signlink.reporterror("25766, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local431.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!hc;)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1) {
		try {
			if (arg0 >= 2 && arg0 <= 2) {
				@Pc(11) int local11 = arg1.anInt453;
				if (local11 >= 1 && local11 <= 100) {
					local11--;
					if (local11 >= this.anInt215) {
						arg1.aString19 = "";
						arg1.anInt452 = 0;
					} else {
						arg1.aString19 = this.aStringArray6[local11];
						arg1.anInt452 = 1;
						if (arg1.aString23 == null) {
							arg1.anInt452 = 0;
						}
					}
				} else if (local11 >= 101 && local11 <= 200) {
					local11 -= 101;
					if (local11 >= this.anInt215) {
						arg1.aString19 = "";
						arg1.anInt452 = 0;
					} else {
						if (this.anIntArray34[local11] == 0) {
							arg1.aString19 = "@red@Offline";
						} else if (this.anIntArray34[local11] == anInt220) {
							arg1.aString19 = "@gre@World-" + (this.anIntArray34[local11] - 9);
						} else {
							arg1.aString19 = "@yel@World-" + (this.anIntArray34[local11] - 9);
						}
						arg1.anInt452 = 1;
						if (arg1.aString23 == null) {
							arg1.anInt452 = 0;
						}
					}
				} else if (local11 == 203) {
					arg1.anInt459 = this.anInt215 * 15 + 20;
					if (arg1.anInt459 <= arg1.anInt455) {
						arg1.anInt459 = arg1.anInt455 + 1;
					}
				} else if (local11 >= 401 && local11 <= 500) {
					local11 -= 401;
					if (local11 >= this.anInt307) {
						arg1.aString19 = "";
						arg1.anInt452 = 0;
					} else {
						arg1.aString19 = Class40.method522(Class40.method519(this.aLongArray3[local11]));
					}
				} else if (local11 == 503) {
					arg1.anInt459 = this.anInt307 * 15 + 20;
					if (arg1.anInt459 <= arg1.anInt455) {
						arg1.anInt459 = arg1.anInt455 + 1;
					}
				} else if (local11 == 327) {
					arg1.anInt470 = 150;
					arg1.anInt471 = (int) (Math.sin((double) anInt295 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean41) {
						this.aBoolean41 = false;
						@Pc(221) Class1_Sub3_Sub1[] local221 = new Class1_Sub3_Sub1[7];
						@Pc(223) int local223 = 0;
						for (@Pc(225) int local225 = 0; local225 < 7; local225++) {
							@Pc(232) int local232 = this.anIntArray80[local225];
							if (local232 >= 0) {
								local221[local223++] = Class13.aClass13Array1[local232].method293();
							}
						}
						@Pc(253) Class1_Sub3_Sub1 local253 = new Class1_Sub3_Sub1(16925, local223, local221);
						for (@Pc(255) int local255 = 0; local255 < 5; local255++) {
							if (this.anIntArray38[local255] != 0) {
								local253.method225(anIntArrayArray2[local255][0], anIntArrayArray2[local255][this.anIntArray38[local255]]);
								if (local255 == 1) {
									local253.method225(anIntArray50[0], anIntArray50[this.anIntArray38[local255]]);
								}
							}
						}
						local253.method218();
						local253.method219(Class19.aClass19Array1[this.aClass1_Sub1_Sub3_Sub2_1.anInt877].anIntArray186[0]);
						local253.method228(64, 850, -30, -50, -30, true);
						arg1.aClass1_Sub3_Sub1_2 = local253;
					}
				} else if (local11 == 324) {
					if (this.aClass1_Sub3_Sub2_Sub2_1 == null) {
						this.aClass1_Sub3_Sub2_Sub2_1 = arg1.aClass1_Sub3_Sub2_Sub2_12;
						this.aClass1_Sub3_Sub2_Sub2_2 = arg1.aClass1_Sub3_Sub2_Sub2_13;
					}
					if (this.aBoolean79) {
						arg1.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_2;
					} else {
						arg1.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_1;
					}
				} else if (local11 == 325) {
					if (this.aClass1_Sub3_Sub2_Sub2_1 == null) {
						this.aClass1_Sub3_Sub2_Sub2_1 = arg1.aClass1_Sub3_Sub2_Sub2_12;
						this.aClass1_Sub3_Sub2_Sub2_2 = arg1.aClass1_Sub3_Sub2_Sub2_13;
					}
					if (this.aBoolean79) {
						arg1.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_1;
					} else {
						arg1.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_2;
					}
				} else if (local11 == 600) {
					arg1.aString19 = this.aString17;
					if (anInt295 % 20 < 10) {
						arg1.aString19 = arg1.aString19 + "|";
					} else {
						arg1.aString19 = arg1.aString19 + " ";
					}
				} else {
					if (local11 == 613) {
						if (!this.aBoolean63) {
							arg1.aString19 = "";
						} else if (this.aBoolean60) {
							arg1.anInt464 = 16711680;
							arg1.aString19 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt464 = 16777215;
							arg1.aString19 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(453) String local453;
					if (local11 == 650 || local11 == 655) {
						if (this.anInt177 == 0) {
							arg1.aString19 = "";
						} else {
							if (this.anInt302 == 0) {
								local453 = "earlier today";
							} else if (this.anInt302 == 1) {
								local453 = "yesterday";
							} else {
								local453 = this.anInt302 + " days ago";
							}
							arg1.aString19 = "You last logged in " + local453 + " from: " + signlink.dns;
						}
					}
					if (local11 == 651) {
						if (this.anInt196 == 0) {
							arg1.aString19 = "0 unread messages";
							arg1.anInt464 = 16776960;
						}
						if (this.anInt196 == 1) {
							arg1.aString19 = "1 unread message";
							arg1.anInt464 = 65280;
						}
						if (this.anInt196 > 1) {
							arg1.aString19 = this.anInt196 + " unread messages";
							arg1.anInt464 = 65280;
						}
					}
					if (local11 == 652) {
						if (this.anInt189 == 201) {
							arg1.aString19 = "";
						} else if (this.anInt189 == 200) {
							arg1.aString19 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt189 == 0) {
								local453 = "Earlier today";
							} else if (this.anInt189 == 1) {
								local453 = "Yesterday";
							} else {
								local453 = this.anInt189 + " days ago";
							}
							arg1.aString19 = local453 + " you changed your recovery questions";
						}
					}
					if (local11 == 653) {
						if (this.anInt189 == 201) {
							arg1.aString19 = "";
						} else if (this.anInt189 == 200) {
							arg1.aString19 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg1.aString19 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local11 == 654) {
						if (this.anInt189 == 201) {
							arg1.aString19 = "";
						} else if (this.anInt189 == 200) {
							arg1.aString19 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg1.aString19 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			}
		} catch (@Pc(635) RuntimeException local635) {
			signlink.reporterror("52942, " + arg0 + ", " + arg1 + ", " + local635.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method164() {
		try {
			if (this.anInt171 == 0 && this.anInt167 == 0) {
				this.aStringArray8[this.anInt162] = "Walk here";
				this.anIntArray87[this.anInt162] = 256;
				this.anIntArray85[this.anInt162] = super.anInt130;
				this.anIntArray86[this.anInt162] = super.anInt131;
				this.anInt162++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub3_Sub1.anInt358; local43++) {
				@Pc(49) int local49 = Class1_Sub3_Sub1.anIntArray123[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(209) int local209;
					if (local65 == 2 && this.aClass33_1.method478(this.anInt269, local53, local59, local49) >= 0) {
						@Pc(91) Class2 local91 = Class2.method23(local71);
						if (this.anInt171 == 1) {
							this.aStringArray8[this.anInt162] = "Use " + this.aString7 + " with @cya@" + local91.aString1;
							this.anIntArray87[this.anInt162] = 825;
							this.anIntArray88[this.anInt162] = local49;
							this.anIntArray85[this.anInt162] = local53;
							this.anIntArray86[this.anInt162] = local59;
							this.anInt162++;
						} else if (this.anInt167 != 1) {
							if (local91.aStringArray1 != null) {
								for (local209 = 4; local209 >= 0; local209--) {
									if (local91.aStringArray1[local209] != null) {
										this.aStringArray8[this.anInt162] = local91.aStringArray1[local209] + " @cya@" + local91.aString1;
										if (local209 == 0) {
											this.anIntArray87[this.anInt162] = 943;
										}
										if (local209 == 1) {
											this.anIntArray87[this.anInt162] = 782;
										}
										if (local209 == 2) {
											this.anIntArray87[this.anInt162] = 393;
										}
										if (local209 == 3) {
											this.anIntArray87[this.anInt162] = 68;
										}
										if (local209 == 4) {
											this.anIntArray87[this.anInt162] = 653;
										}
										this.anIntArray88[this.anInt162] = local49;
										this.anIntArray85[this.anInt162] = local53;
										this.anIntArray86[this.anInt162] = local59;
										this.anInt162++;
									}
								}
							}
							this.aStringArray8[this.anInt162] = "Examine @cya@" + local91.aString1;
							this.anIntArray87[this.anInt162] = 1387;
							this.anIntArray88[this.anInt162] = local49;
							this.anIntArray85[this.anInt162] = local53;
							this.anIntArray86[this.anInt162] = local59;
							this.anInt162++;
						} else if ((this.anInt169 & 0x4) == 4) {
							this.aStringArray8[this.anInt162] = this.aString6 + " @cya@" + local91.aString1;
							this.anIntArray87[this.anInt162] = 771;
							this.anIntArray88[this.anInt162] = local49;
							this.anIntArray85[this.anInt162] = local53;
							this.anIntArray86[this.anInt162] = local59;
							this.anInt162++;
						}
					}
					@Pc(386) Class1_Sub1_Sub3_Sub1 local386;
					if (local65 == 1) {
						@Pc(357) Class1_Sub1_Sub3_Sub1 local357 = this.aClass1_Sub1_Sub3_Sub1Array1[local71];
						if (local357.aClass3_1.aByte5 == 1 && (local357.anInt873 & 0x7F) == 64 && (local357.anInt874 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt183; local209++) {
								local386 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray36[local209]];
								if (local386 != null && local386 != local357 && local386.aClass3_1.aByte5 == 1 && local386.anInt873 == local357.anInt873 && local386.anInt874 == local357.anInt874) {
									this.method162(local386.aClass3_1, local59, local53, this.anIntArray36[local209]);
								}
							}
						}
						this.method162(local357.aClass3_1, local59, local53, local71);
					}
					if (local65 == 0) {
						@Pc(437) Class1_Sub1_Sub3_Sub2 local437 = this.aClass1_Sub1_Sub3_Sub2Array1[local71];
						if ((local437.anInt873 & 0x7F) == 64 && (local437.anInt874 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt183; local209++) {
								local386 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray36[local209]];
								if (local386 != null && local386.aClass3_1.aByte5 == 1 && local386.anInt873 == local437.anInt873 && local386.anInt874 == local437.anInt874) {
									this.method162(local386.aClass3_1, local59, local53, this.anIntArray36[local209]);
								}
							}
							for (@Pc(496) int local496 = 0; local496 < this.anInt157; local496++) {
								@Pc(506) Class1_Sub1_Sub3_Sub2 local506 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray30[local496]];
								if (local506 != null && local506 != local437 && local506.anInt873 == local437.anInt873 && local506.anInt874 == local437.anInt874) {
									this.method107(local53, local506, this.anIntArray30[local496], this.anInt272, local59);
								}
							}
						}
						this.method107(local53, local437, local71, this.anInt272, local59);
					}
					if (local65 == 3) {
						@Pc(558) Class28 local558 = this.aClass28ArrayArrayArray1[this.anInt269][local53][local59];
						if (local558 != null) {
							for (@Pc(565) Class1_Sub7 local565 = (Class1_Sub7) local558.method438(); local565 != null; local565 = (Class1_Sub7) local558.method440((byte) 4)) {
								@Pc(571) Class5 local571 = Class5.method54(local565.anInt753);
								if (this.anInt171 == 1) {
									this.aStringArray8[this.anInt162] = "Use " + this.aString7 + " with @lre@" + local571.aString3;
									this.anIntArray87[this.anInt162] = 106;
									this.anIntArray88[this.anInt162] = local565.anInt753;
									this.anIntArray85[this.anInt162] = local53;
									this.anIntArray86[this.anInt162] = local59;
									this.anInt162++;
								} else if (this.anInt167 != 1) {
									for (@Pc(688) int local688 = 4; local688 >= 0; local688--) {
										if (local571.aStringArray3 != null && local571.aStringArray3[local688] != null) {
											this.aStringArray8[this.anInt162] = local571.aStringArray3[local688] + " @lre@" + local571.aString3;
											if (local688 == 0) {
												this.anIntArray87[this.anInt162] = 308;
											}
											if (local688 == 1) {
												this.anIntArray87[this.anInt162] = 445;
											}
											if (local688 == 2) {
												this.anIntArray87[this.anInt162] = 848;
											}
											if (local688 == 3) {
												this.anIntArray87[this.anInt162] = 221;
											}
											if (local688 == 4) {
												this.anIntArray87[this.anInt162] = 273;
											}
											this.anIntArray88[this.anInt162] = local565.anInt753;
											this.anIntArray85[this.anInt162] = local53;
											this.anIntArray86[this.anInt162] = local59;
											this.anInt162++;
										} else if (local688 == 2) {
											this.aStringArray8[this.anInt162] = "Take @lre@" + local571.aString3;
											this.anIntArray87[this.anInt162] = 848;
											this.anIntArray88[this.anInt162] = local565.anInt753;
											this.anIntArray85[this.anInt162] = local53;
											this.anIntArray86[this.anInt162] = local59;
											this.anInt162++;
										}
									}
									this.aStringArray8[this.anInt162] = "Examine @lre@" + local571.aString3;
									this.anIntArray87[this.anInt162] = 1536;
									this.anIntArray88[this.anInt162] = local565.anInt753;
									this.anIntArray85[this.anInt162] = local53;
									this.anIntArray86[this.anInt162] = local59;
									this.anInt162++;
								} else if ((this.anInt169 & 0x1) == 1) {
									this.aStringArray8[this.anInt162] = this.aString6 + " @lre@" + local571.aString3;
									this.anIntArray87[this.anInt162] = 788;
									this.anIntArray88[this.anInt162] = local565.anInt753;
									this.anIntArray85[this.anInt162] = local53;
									this.anIntArray86[this.anInt162] = local59;
									this.anInt162++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(899) RuntimeException local899) {
			signlink.reporterror("58414, " + false + ", " + local899.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!kb;)V")
	private void method165(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt158; local1++) {
				@Pc(8) int local8 = this.anIntArray31[local1];
				@Pc(13) Class1_Sub1_Sub3_Sub1 local13 = this.aClass1_Sub1_Sub3_Sub1Array1[local8];
				@Pc(16) int local16 = arg1.method372();
				@Pc(24) int local24;
				if ((local16 & 0x2) == 2) {
					local24 = arg1.method374();
					if (local24 == 65535) {
						local24 = -1;
					}
					if (local24 == local13.anInt898) {
						local13.anInt902 = 0;
					}
					@Pc(39) int local39 = arg1.method372();
					if (local24 == -1 || local13.anInt898 == -1 || Class19.aClass19Array1[local24].anInt523 > Class19.aClass19Array1[local13.anInt898].anInt523 || Class19.aClass19Array1[local13.anInt898].anInt523 == 0) {
						local13.anInt898 = local24;
						local13.anInt899 = 0;
						local13.anInt900 = 0;
						local13.anInt901 = local39;
						local13.anInt902 = 0;
					}
				}
				if ((local16 & 0x4) == 4) {
					local13.anInt892 = arg1.method374();
					if (local13.anInt892 == 65535) {
						local13.anInt892 = -1;
					}
				}
				if ((local16 & 0x8) == 8) {
					local13.aString29 = arg1.method379();
					local13.anInt884 = 100;
				}
				if ((local16 & 0x10) == 16) {
					local13.anInt887 = arg1.method372();
					local13.anInt888 = arg1.method372();
					local13.anInt889 = anInt295 + 400;
					local13.anInt890 = arg1.method372();
					local13.anInt891 = arg1.method372();
				}
				if ((local16 & 0x20) == 32) {
					local13.aClass3_1 = Class3.method32(arg1.method374());
					local13.anInt879 = local13.aClass3_1.anInt69;
					local13.anInt880 = local13.aClass3_1.anInt70;
					local13.anInt881 = local13.aClass3_1.anInt71;
					local13.anInt882 = local13.aClass3_1.anInt72;
					local13.anInt877 = local13.aClass3_1.anInt68;
				}
				if ((local16 & 0x40) == 64) {
					local13.anInt903 = arg1.method374();
					local24 = arg1.method377();
					local13.anInt907 = local24 >> 16;
					local13.anInt906 = anInt295 + (local24 & 0xFFFF);
					local13.anInt904 = 0;
					local13.anInt905 = 0;
					if (local13.anInt906 > anInt295) {
						local13.anInt904 = -1;
					}
					if (local13.anInt903 == 65535) {
						local13.anInt903 = -1;
					}
				}
				if ((local16 & 0x80) == 128) {
					local13.anInt893 = arg1.method374();
					local13.anInt894 = arg1.method374();
				}
			}
		} catch (@Pc(237) RuntimeException local237) {
			signlink.reporterror("51580, " + arg0 + ", " + ", " + arg1 + ", " + local237.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method68() {
		try {
			if (!this.aBoolean74 && !this.aBoolean67 && !this.aBoolean56) {
				anInt295++;
				if (this.aBoolean70) {
					this.method149();
				} else {
					this.method105();
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("61752, " + -989 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ILclient!kb;I)V")
	private void method166(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt540 + 10 < arg0 * 8) {
					@Pc(14) int local14 = arg1.method383(11);
					if (local14 != 2047) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local14] == null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local14] = new Class1_Sub1_Sub3_Sub2();
							if (this.aClass1_Sub3_Sub3Array1[local14] != null) {
								this.aClass1_Sub1_Sub3_Sub2Array1[local14].method552(265, this.aClass1_Sub3_Sub3Array1[local14]);
							}
						}
						this.anIntArray30[this.anInt157++] = local14;
						@Pc(60) Class1_Sub1_Sub3_Sub2 local60 = this.aClass1_Sub1_Sub3_Sub2Array1[local14];
						local60.anInt915 = anInt295;
						@Pc(68) int local68 = arg1.method383(5);
						if (local68 > 15) {
							local68 -= 32;
						}
						@Pc(77) int local77 = arg1.method383(5);
						if (local77 > 15) {
							local77 -= 32;
						}
						@Pc(86) int local86 = arg1.method383(1);
						local60.method549(this.anInt238, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + local68, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + local77, local86 == 1);
						this.anIntArray31[this.anInt158++] = local14;
						continue;
					}
				}
				arg1.method384();
				return;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("80932, " + arg0 + ", " + arg1 + ", " + -126 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;Z)V")
	private void method167(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			arg1.method382(212);
			@Pc(9) int local9 = arg1.method383(8);
			@Pc(15) int local15;
			if (local9 < this.anInt183) {
				for (local15 = local9; local15 < this.anInt183; local15++) {
					this.anIntArray70[this.anInt281++] = this.anIntArray36[local15];
				}
			}
			if (local9 > this.anInt183) {
				signlink.reporterror(this.aString13 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt183 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(72) int local72 = this.anIntArray36[local15];
				@Pc(77) Class1_Sub1_Sub3_Sub1 local77 = this.aClass1_Sub1_Sub3_Sub1Array1[local72];
				@Pc(82) int local82 = arg1.method383(1);
				if (local82 == 0) {
					this.anIntArray36[this.anInt183++] = local72;
					local77.anInt915 = anInt295;
				} else {
					@Pc(105) int local105 = arg1.method383(2);
					if (local105 == 0) {
						this.anIntArray36[this.anInt183++] = local72;
						local77.anInt915 = anInt295;
						this.anIntArray31[this.anInt158++] = local72;
					} else {
						@Pc(156) int local156;
						@Pc(166) int local166;
						if (local105 == 1) {
							this.anIntArray36[this.anInt183++] = local72;
							local77.anInt915 = anInt295;
							local156 = arg1.method383(3);
							local77.method550(false, local156);
							local166 = arg1.method383(1);
							if (local166 == 1) {
								this.anIntArray31[this.anInt158++] = local72;
							}
						} else if (local105 == 2) {
							this.anIntArray36[this.anInt183++] = local72;
							local77.anInt915 = anInt295;
							local156 = arg1.method383(3);
							local77.method550(true, local156);
							local166 = arg1.method383(3);
							local77.method550(true, local166);
							@Pc(224) int local224 = arg1.method383(1);
							if (local224 == 1) {
								this.anIntArray31[this.anInt158++] = local72;
							}
						} else if (local105 == 3) {
							this.anIntArray70[this.anInt281++] = local72;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("6269, " + arg0 + ", " + arg1 + ", " + false + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIII)V")
	private void method168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.aBoolean70 &= true;
			if (arg0 >= 1 && arg5 >= 1 && arg0 <= 102 && arg5 <= 102) {
				if (aBoolean55 && arg3 != this.anInt269) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg2 == 0) {
					local26 = this.aClass33_1.method474(arg3, arg0, arg5);
				}
				if (arg2 == 1) {
					local26 = this.aClass33_1.method475(arg0, arg3, arg5);
				}
				if (arg2 == 2) {
					local26 = this.aClass33_1.method476(arg3, arg0, arg5);
				}
				if (arg2 == 3) {
					local26 = this.aClass33_1.method477(arg3, arg0, arg5);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass33_1.method478(arg3, arg0, arg5, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class2 local108;
					if (arg2 == 0) {
						this.aClass33_1.method469(arg0, arg3, (byte) 5, arg5);
						local108 = Class2.method23(local88);
						if (local108.aBoolean8) {
							this.aClass9Array1[arg3].method242(arg5, local108.aBoolean9, local92, arg0, local96);
						}
					}
					if (arg2 == 1) {
						this.aClass33_1.method470(arg0, 437, arg3, arg5);
					}
					if (arg2 == 2) {
						this.aClass33_1.method471(arg5, arg3, arg0);
						local108 = Class2.method23(local88);
						if (arg0 + local108.anInt43 > 103 || arg5 + local108.anInt43 > 103 || arg0 + local108.anInt44 > 103 || arg5 + local108.anInt44 > 103) {
							return;
						}
						if (local108.aBoolean8) {
							this.aClass9Array1[arg3].method243(local108.anInt44, arg0, local108.aBoolean9, local108.anInt43, local96, arg5);
						}
					}
					if (arg2 == 3) {
						this.aClass33_1.method472(arg3, arg0, arg5);
						local108 = Class2.method23(local88);
						if (local108.aBoolean8 && local108.aBoolean10) {
							this.aClass9Array1[arg3].method245(arg5, arg0);
						}
					}
				}
				if (arg4 >= 0) {
					local82 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray7[1][arg0][arg5] & 0x2) == 2) {
						local82 = arg3 + 1;
					}
					Class4.method50(this.aClass33_1, arg4, this.aClass9Array1[arg3], arg0, this.anIntArrayArrayArray3, arg5, arg3, this.aClass28_1, (byte) 8, local82, arg6, arg1);
					return;
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("30424, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getjinglelen", descriptor = "()I")
	private int method169() {
		return signlink.anInt737;
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method170() {
		try {
			if (this.anInt209 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array5[this.anInt208 / 100].method308(this.anInt206 - 8 - 8, this.anInt207 - 8 - 11);
			}
			if (this.anInt209 == 2) {
				this.aClass1_Sub3_Sub2_Sub2Array5[this.anInt208 / 100 + 4].method308(this.anInt206 - 8 - 8, this.anInt207 - 8 - 11);
				anInt284++;
				if (anInt284 > 161) {
					anInt284 = 0;
					this.aClass1_Sub3_Sub3_4.method361(249);
					this.aClass1_Sub3_Sub3_4.method363(9331);
				}
			}
			if (this.anInt216 != -1) {
				this.method160(this.anInt184, this.anInt216, 400);
				this.method183(0, Class15.aClass15Array1[this.anInt216], this.aByte11, 0, 0);
			}
			this.method125(724);
			if (!this.aBoolean51) {
				this.method87(this.aBoolean45);
				this.method171();
			} else if (this.anInt246 == 0) {
				this.method115();
			}
			if (this.anInt202 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array6[1].method308(5, 296);
			}
			if (this.anInt228 > 0) {
				this.aClass1_Sub3_Sub2_Sub2Array6[0].method308(472, 296);
				this.aClass1_Sub3_Sub2_Sub4_2.method347("Level: " + this.anInt228, 329, 484, 16776960);
			}
			if (this.anInt239 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array6[0].method308(472, 296);
				this.aClass1_Sub3_Sub2_Sub4_2.method347("Arena", 329, 484, 16776960);
			} else if (aBoolean55) {
				@Pc(188) Runtime local188 = Runtime.getRuntime();
				@Pc(191) long local191 = local188.totalMemory();
				@Pc(194) long local194 = local188.freeMemory();
				if (!signlink.sunjava && local191 - local194 > 33554432L && anInt295 > anInt315 + 500) {
					this.method77();
					local188.gc();
					anInt315 = anInt295;
				}
			}
			if (this.anInt190 != 0) {
				@Pc(224) int local224 = this.anInt190 / 50;
				@Pc(228) int local228 = local224 / 60;
				@Pc(232) int local232 = local224 % 60;
				if (local232 < 10) {
					this.aClass1_Sub3_Sub2_Sub4_2.method347("System update in: " + local228 + ":0" + local232, 329, 256, 16776960);
				} else {
					this.aClass1_Sub3_Sub2_Sub4_2.method347("System update in: " + local228 + ":" + local232, 329, 256, 16776960);
				}
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("51245, " + -311 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method171() {
		try {
			if (this.anInt162 >= 2 || this.anInt171 != 0 || this.anInt167 != 0) {
				@Pc(34) String local34;
				if (this.anInt171 == 1 && this.anInt162 < 2) {
					local34 = "Use " + this.aString7 + " with...";
				} else if (this.anInt167 == 1 && this.anInt162 < 2) {
					local34 = this.aString6 + "...";
				} else {
					local34 = this.aStringArray8[this.anInt162 - 1];
				}
				if (this.anInt162 > 2) {
					local34 = local34 + "@whi@ / " + (this.anInt162 - 2) + " more options";
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method352(true, 16777215, 4, 15, local34);
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("84500, " + true + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method67() {
		if (signlink.sunjava) {
			super.anInt124 = 5;
		}
		this.method130("scape_main");
		if (aBoolean72) {
			this.aBoolean74 = true;
			return;
		}
		aBoolean72 = true;
		@Pc(20) boolean local20 = false;
		@Pc(24) String local24 = this.method137();
		if (local24.endsWith("jagex.com")) {
			local20 = true;
		}
		if (local24.endsWith("runescape.com")) {
			local20 = true;
		}
		if (local24.endsWith("192.168.1.2")) {
			local20 = true;
		}
		if (local24.endsWith("192.168.1.252")) {
			local20 = true;
		}
		if (local24.endsWith("192.168.1.253")) {
			local20 = true;
		}
		if (local24.endsWith("192.168.1.254")) {
			local20 = true;
		}
		if (local24.endsWith("127.0.0.1")) {
			local20 = true;
		}
		if (!local20) {
			this.aBoolean56 = true;
			return;
		}
		try {
			@Pc(74) int local74 = 5;
			this.anIntArray77[8] = 0;
			while (this.anIntArray77[8] == 0) {
				this.method74(10, "Connecting to fileserver");
				try {
					@Pc(99) DataInputStream local99 = this.method113("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(106) Class1_Sub3_Sub3 local106 = new Class1_Sub3_Sub3(new byte[36], aBoolean59);
					local99.readFully(local106.aByteArray8, 0, 36);
					for (@Pc(114) int local114 = 0; local114 < 9; local114++) {
						this.anIntArray77[local114] = local106.method377();
					}
					local99.close();
				} catch (@Pc(130) IOException local130) {
					for (@Pc(132) int local132 = local74; local132 > 0; local132--) {
						this.method74(10, "Error loading - Will retry in " + local132 + " secs.");
						try {
							Thread.sleep(1000L);
						} catch (@Pc(151) Exception local151) {
						}
					}
					local74 *= 2;
					if (local74 > 60) {
						local74 = 60;
					}
				}
			}
			this.aClass39_1 = this.method131("title", this.anIntArray77[1], "title screen", 10);
			this.aClass1_Sub3_Sub2_Sub4_1 = new Class1_Sub3_Sub2_Sub4("p11", this.aClass39_1, -37957);
			this.aClass1_Sub3_Sub2_Sub4_2 = new Class1_Sub3_Sub2_Sub4("p12", this.aClass39_1, -37957);
			this.aClass1_Sub3_Sub2_Sub4_3 = new Class1_Sub3_Sub2_Sub4("b12", this.aClass39_1, -37957);
			this.aClass1_Sub3_Sub2_Sub4_4 = new Class1_Sub3_Sub2_Sub4("q8", this.aClass39_1, -37957);
			this.method177();
			this.method122();
			@Pc(235) Class39 local235 = this.method131("config", this.anIntArray77[2], "config", 15);
			@Pc(246) Class39 local246 = this.method131("interface", this.anIntArray77[3], "interface", 20);
			@Pc(257) Class39 local257 = this.method131("media", this.anIntArray77[4], "2d graphics", 30);
			@Pc(268) Class39 local268 = this.method131("models", this.anIntArray77[5], "3d graphics", 40);
			@Pc(279) Class39 local279 = this.method131("textures", this.anIntArray77[6], "textures", 60);
			@Pc(290) Class39 local290 = this.method131("wordenc", this.anIntArray77[7], "chat system", 65);
			@Pc(301) Class39 local301 = this.method131("sounds", this.anIntArray77[8], "sound effects", 70);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass33_1 = new Class33(3, this.anIntArrayArrayArray3, 4, 104, 104);
			for (@Pc(326) int local326 = 0; local326 < 4; local326++) {
				this.aClass9Array1[local326] = new Class9(104, (byte) 8, 104);
			}
			this.aClass1_Sub3_Sub2_Sub2_6 = new Class1_Sub3_Sub2_Sub2(512, 512);
			this.method74(75, "Unpacking media");
			this.aClass1_Sub3_Sub2_Sub3_16 = new Class1_Sub3_Sub2_Sub3(local257, "invback", 0);
			this.aClass1_Sub3_Sub2_Sub3_18 = new Class1_Sub3_Sub2_Sub3(local257, "chatback", 0);
			this.aClass1_Sub3_Sub2_Sub3_17 = new Class1_Sub3_Sub2_Sub3(local257, "mapback", 0);
			this.aClass1_Sub3_Sub2_Sub3_6 = new Class1_Sub3_Sub2_Sub3(local257, "backbase1", 0);
			this.aClass1_Sub3_Sub2_Sub3_7 = new Class1_Sub3_Sub2_Sub3(local257, "backbase2", 0);
			this.aClass1_Sub3_Sub2_Sub3_8 = new Class1_Sub3_Sub2_Sub3(local257, "backhmid1", 0);
			for (@Pc(404) int local404 = 0; local404 < 13; local404++) {
				this.aClass1_Sub3_Sub2_Sub3Array3[local404] = new Class1_Sub3_Sub2_Sub3(local257, "sideicons", local404);
			}
			this.aClass1_Sub3_Sub2_Sub2_11 = new Class1_Sub3_Sub2_Sub2(local257, "compass", 0);
			@Pc(430) int local430;
			try {
				for (local430 = 0; local430 < 50; local430++) {
					this.aClass1_Sub3_Sub2_Sub3Array1[local430] = new Class1_Sub3_Sub2_Sub3(local257, "mapscene", local430);
				}
			} catch (@Pc(448) Exception local448) {
			}
			try {
				for (local430 = 0; local430 < 50; local430++) {
					this.aClass1_Sub3_Sub2_Sub2Array7[local430] = new Class1_Sub3_Sub2_Sub2(local257, "mapfunction", local430);
				}
			} catch (@Pc(468) Exception local468) {
			}
			try {
				for (local430 = 0; local430 < 20; local430++) {
					this.aClass1_Sub3_Sub2_Sub2Array3[local430] = new Class1_Sub3_Sub2_Sub2(local257, "hitmarks", local430);
				}
			} catch (@Pc(488) Exception local488) {
			}
			try {
				for (local430 = 0; local430 < 20; local430++) {
					this.aClass1_Sub3_Sub2_Sub2Array6[local430] = new Class1_Sub3_Sub2_Sub2(local257, "headicons", local430);
				}
			} catch (@Pc(508) Exception local508) {
			}
			this.aClass1_Sub3_Sub2_Sub2_3 = new Class1_Sub3_Sub2_Sub2(local257, "mapflag", 0);
			for (local430 = 0; local430 < 8; local430++) {
				this.aClass1_Sub3_Sub2_Sub2Array5[local430] = new Class1_Sub3_Sub2_Sub2(local257, "cross", local430);
			}
			this.aClass1_Sub3_Sub2_Sub2_7 = new Class1_Sub3_Sub2_Sub2(local257, "mapdots", 0);
			this.aClass1_Sub3_Sub2_Sub2_8 = new Class1_Sub3_Sub2_Sub2(local257, "mapdots", 1);
			this.aClass1_Sub3_Sub2_Sub2_9 = new Class1_Sub3_Sub2_Sub2(local257, "mapdots", 2);
			this.aClass1_Sub3_Sub2_Sub2_10 = new Class1_Sub3_Sub2_Sub2(local257, "mapdots", 3);
			this.aClass1_Sub3_Sub2_Sub3_19 = new Class1_Sub3_Sub2_Sub3(local257, "scrollbar", 0);
			this.aClass1_Sub3_Sub2_Sub3_20 = new Class1_Sub3_Sub2_Sub3(local257, "scrollbar", 1);
			this.aClass1_Sub3_Sub2_Sub3_11 = new Class1_Sub3_Sub2_Sub3(local257, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_12 = new Class1_Sub3_Sub2_Sub3(local257, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_13 = new Class1_Sub3_Sub2_Sub3(local257, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_14 = new Class1_Sub3_Sub2_Sub3(local257, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_14.method333();
			this.aClass1_Sub3_Sub2_Sub3_15 = new Class1_Sub3_Sub2_Sub3(local257, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_15.method333();
			this.aClass1_Sub3_Sub2_Sub3_1 = new Class1_Sub3_Sub2_Sub3(local257, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_1.method334();
			this.aClass1_Sub3_Sub2_Sub3_2 = new Class1_Sub3_Sub2_Sub3(local257, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_2.method334();
			this.aClass1_Sub3_Sub2_Sub3_3 = new Class1_Sub3_Sub2_Sub3(local257, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_3.method334();
			this.aClass1_Sub3_Sub2_Sub3_4 = new Class1_Sub3_Sub2_Sub3(local257, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_4.method333();
			this.aClass1_Sub3_Sub2_Sub3_4.method334();
			this.aClass1_Sub3_Sub2_Sub3_5 = new Class1_Sub3_Sub2_Sub3(local257, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_5.method333();
			this.aClass1_Sub3_Sub2_Sub3_5.method334();
			@Pc(705) Class1_Sub3_Sub2_Sub2 local705 = new Class1_Sub3_Sub2_Sub2(local257, "backleft1", 0);
			this.aClass32_15 = new Class32(this.method72((byte) 9), local705.anInt440, local705.anInt441, true);
			local705.method306(anInt191, 0, 0);
			@Pc(730) Class1_Sub3_Sub2_Sub2 local730 = new Class1_Sub3_Sub2_Sub2(local257, "backleft2", 0);
			this.aClass32_16 = new Class32(this.method72((byte) 9), local730.anInt440, local730.anInt441, true);
			local730.method306(anInt191, 0, 0);
			@Pc(755) Class1_Sub3_Sub2_Sub2 local755 = new Class1_Sub3_Sub2_Sub2(local257, "backright1", 0);
			this.aClass32_17 = new Class32(this.method72((byte) 9), local755.anInt440, local755.anInt441, true);
			local755.method306(anInt191, 0, 0);
			@Pc(780) Class1_Sub3_Sub2_Sub2 local780 = new Class1_Sub3_Sub2_Sub2(local257, "backright2", 0);
			this.aClass32_18 = new Class32(this.method72((byte) 9), local780.anInt440, local780.anInt441, true);
			local780.method306(anInt191, 0, 0);
			@Pc(805) Class1_Sub3_Sub2_Sub2 local805 = new Class1_Sub3_Sub2_Sub2(local257, "backtop1", 0);
			this.aClass32_19 = new Class32(this.method72((byte) 9), local805.anInt440, local805.anInt441, true);
			local805.method306(anInt191, 0, 0);
			@Pc(830) Class1_Sub3_Sub2_Sub2 local830 = new Class1_Sub3_Sub2_Sub2(local257, "backtop2", 0);
			this.aClass32_20 = new Class32(this.method72((byte) 9), local830.anInt440, local830.anInt441, true);
			local830.method306(anInt191, 0, 0);
			@Pc(855) Class1_Sub3_Sub2_Sub2 local855 = new Class1_Sub3_Sub2_Sub2(local257, "backvmid1", 0);
			this.aClass32_21 = new Class32(this.method72((byte) 9), local855.anInt440, local855.anInt441, true);
			local855.method306(anInt191, 0, 0);
			@Pc(880) Class1_Sub3_Sub2_Sub2 local880 = new Class1_Sub3_Sub2_Sub2(local257, "backvmid2", 0);
			this.aClass32_22 = new Class32(this.method72((byte) 9), local880.anInt440, local880.anInt441, true);
			local880.method306(anInt191, 0, 0);
			@Pc(905) Class1_Sub3_Sub2_Sub2 local905 = new Class1_Sub3_Sub2_Sub2(local257, "backvmid3", 0);
			this.aClass32_23 = new Class32(this.method72((byte) 9), local905.anInt440, local905.anInt441, true);
			local905.method306(anInt191, 0, 0);
			@Pc(930) Class1_Sub3_Sub2_Sub2 local930 = new Class1_Sub3_Sub2_Sub2(local257, "backhmid2", 0);
			this.aClass32_24 = new Class32(this.method72((byte) 9), local930.anInt440, local930.anInt441, true);
			local930.method306(anInt191, 0, 0);
			this.method74(80, "Unpacking textures");
			Class1_Sub3_Sub2_Sub1.method279(local279);
			Class1_Sub3_Sub2_Sub1.method283(0.8D);
			Class1_Sub3_Sub2_Sub1.method278();
			this.method74(83, "Unpacking models");
			Class1_Sub3_Sub1.method213(local268);
			Class10.method249(aByte10, local268);
			Class12.method263(aByte10, local268);
			this.method74(86, "Unpacking config");
			Class19.method355(local235);
			Class2.method21(local235);
			Class11.method260(local235);
			Class5.method52(local235);
			Class3.method30(local235);
			Class13.method291(local235);
			Class21.method388(local235);
			Class23.method392(local235);
			Class5.aBoolean35 = aBoolean54;
			if (!aBoolean55) {
				this.method74(90, "Unpacking sounds");
				@Pc(1017) byte[] local1017 = local301.method516("sounds.dat", null);
				@Pc(1023) Class1_Sub3_Sub3 local1023 = new Class1_Sub3_Sub3(local1017, aBoolean59);
				Class43.method541(local1023);
			}
			this.method74(92, "Unpacking interfaces");
			@Pc(1054) Class1_Sub3_Sub2_Sub4[] local1054 = new Class1_Sub3_Sub2_Sub4[] { this.aClass1_Sub3_Sub2_Sub4_1, this.aClass1_Sub3_Sub2_Sub4_2, this.aClass1_Sub3_Sub2_Sub4_3, this.aClass1_Sub3_Sub2_Sub4_4 };
			Class15.method317(local257, local246, local1054);
			this.method74(97, "Preparing game engine");
			@Pc(1070) int local1070;
			@Pc(1072) int local1072;
			@Pc(1074) int local1074;
			for (@Pc(1066) int local1066 = 0; local1066 < 33; local1066++) {
				local1070 = 999;
				local1072 = 0;
				for (local1074 = 0; local1074 < 35; local1074++) {
					if (this.aClass1_Sub3_Sub2_Sub3_17.aByteArray7[local1074 + local1066 * this.aClass1_Sub3_Sub2_Sub3_17.anInt492] == 0) {
						if (local1070 == 999) {
							local1070 = local1074;
						}
					} else if (local1070 != 999) {
						local1072 = local1074;
						break;
					}
				}
				this.anIntArray51[local1066] = local1070;
				this.anIntArray83[local1066] = local1072 - local1070;
			}
			@Pc(1132) int local1132;
			for (local1070 = 9; local1070 < 160; local1070++) {
				local1072 = 999;
				local1074 = 0;
				for (local1132 = 10; local1132 < 168; local1132++) {
					if (this.aClass1_Sub3_Sub2_Sub3_17.aByteArray7[local1132 + local1070 * this.aClass1_Sub3_Sub2_Sub3_17.anInt492] == 0 && (local1132 > 34 || local1070 > 34)) {
						if (local1072 == 999) {
							local1072 = local1132;
						}
					} else if (local1072 != 999) {
						local1074 = local1132;
						break;
					}
				}
				this.anIntArray81[local1070 - 9] = local1072 - 21;
				this.anIntArray55[local1070 - 9] = local1074 - local1072;
			}
			Class1_Sub3_Sub2_Sub1.method276(479, 96);
			this.anIntArray59 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			Class1_Sub3_Sub2_Sub1.method276(190, 261);
			this.anIntArray60 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			Class1_Sub3_Sub2_Sub1.method276(512, 334);
			this.anIntArray61 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			@Pc(1216) int[] local1216 = new int[9];
			for (local1074 = 0; local1074 < 9; local1074++) {
				local1132 = local1074 * 32 + 128 + 15;
				@Pc(1234) int local1234 = local1132 * 3 + 600;
				@Pc(1238) int local1238 = Class1_Sub3_Sub2_Sub1.anIntArray137[local1132];
				local1216[local1074] = local1234 * local1238 >> 16;
			}
			Class33.method484((byte) 9, local1216);
			Class25.method395(local290);
		} catch (@Pc(1261) Exception local1261) {
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;II)V")
	private void method172(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5 = 44 / arg2;
			@Pc(14) int local14;
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(33) int local33;
			@Pc(37) int local37;
			@Pc(41) int local41;
			@Pc(46) int local46;
			@Pc(51) int local51;
			@Pc(108) int local108;
			@Pc(110) int local110;
			@Pc(112) int local112;
			if (arg1 == 204 || arg1 == 140) {
				local14 = arg0.method372();
				local23 = this.anInt211 + (local14 >> 4 & 0x7);
				local30 = this.anInt212 + (local14 & 0x7);
				local33 = arg0.method372();
				local37 = local33 >> 2;
				local41 = local33 & 0x3;
				local46 = this.anIntArray37[local37];
				if (arg1 == 140) {
					local51 = -1;
				} else {
					local51 = arg0.method374();
				}
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					@Pc(68) Class1_Sub4 local68 = null;
					for (@Pc(73) Class1_Sub4 local73 = (Class1_Sub4) this.aClass28_2.method437(); local73 != null; local73 = (Class1_Sub4) this.aClass28_2.method439(this.aByte14)) {
						if (local73.anInt571 == this.anInt269 && local73.anInt573 == local23 && local73.anInt574 == local30 && local73.anInt572 == local46) {
							local68 = local73;
							break;
						}
					}
					if (local68 == null) {
						local108 = 0;
						local110 = -1;
						local112 = 0;
						@Pc(114) int local114 = 0;
						if (local46 == 0) {
							local108 = this.aClass33_1.method474(this.anInt269, local23, local30);
						}
						if (local46 == 1) {
							local108 = this.aClass33_1.method475(local23, this.anInt269, local30);
						}
						if (local46 == 2) {
							local108 = this.aClass33_1.method476(this.anInt269, local23, local30);
						}
						if (local46 == 3) {
							local108 = this.aClass33_1.method477(this.anInt269, local23, local30);
						}
						if (local108 != 0) {
							@Pc(169) int local169 = this.aClass33_1.method478(this.anInt269, local23, local30, local108);
							local110 = local108 >> 14 & 0x7FFF;
							local112 = local169 & 0x1F;
							local114 = local169 >> 6;
						}
						local68 = new Class1_Sub4();
						local68.anInt571 = this.anInt269;
						local68.anInt572 = local46;
						local68.anInt573 = local23;
						local68.anInt574 = local30;
						local68.anInt578 = local110;
						local68.anInt580 = local112;
						local68.anInt579 = local114;
						this.aClass28_2.method434(local68);
					}
					local68.anInt575 = local51;
					local68.anInt577 = local37;
					local68.anInt576 = local41;
					this.method168(local23, local41, local46, this.anInt269, local51, local30, local37);
				}
			} else if (arg1 == 63) {
				local14 = arg0.method372();
				local23 = this.anInt211 + (local14 >> 4 & 0x7);
				local30 = this.anInt212 + (local14 & 0x7);
				local33 = arg0.method372();
				local37 = local33 >> 2;
				local41 = this.anIntArray37[local37];
				local46 = arg0.method374();
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					local51 = 0;
					if (local41 == 0) {
						local51 = this.aClass33_1.method474(this.anInt269, local23, local30);
					}
					if (local41 == 1) {
						local51 = this.aClass33_1.method475(local23, this.anInt269, local30);
					}
					if (local41 == 2) {
						local51 = this.aClass33_1.method476(this.anInt269, local23, local30);
					}
					if (local41 == 3) {
						local51 = this.aClass33_1.method477(this.anInt269, local23, local30);
					}
					if (local51 != 0) {
						@Pc(348) Class1_Sub6 local348 = new Class1_Sub6(local51 >> 14 & 0x7FFF, local30, this.anInt269, Class19.aClass19Array1[local46], local23, local41, (byte) -50, false);
						this.aClass28_1.method434(local348);
					}
				}
			} else {
				@Pc(395) Class1_Sub7 local395;
				if (arg1 == 134) {
					local14 = arg0.method372();
					local23 = this.anInt211 + (local14 >> 4 & 0x7);
					local30 = this.anInt212 + (local14 & 0x7);
					local33 = arg0.method374();
					local37 = arg0.method374();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						local395 = new Class1_Sub7();
						local395.anInt753 = local33;
						local395.anInt754 = local37;
						if (this.aClass28ArrayArrayArray1[this.anInt269][local23][local30] == null) {
							this.aClass28ArrayArrayArray1[this.anInt269][local23][local30] = new Class28((byte) 3);
						}
						this.aClass28ArrayArrayArray1[this.anInt269][local23][local30].method434(local395);
						this.method80(local23, local30);
					}
				} else if (arg1 == 106) {
					local14 = arg0.method372();
					local23 = this.anInt211 + (local14 >> 4 & 0x7);
					local30 = this.anInt212 + (local14 & 0x7);
					local33 = arg0.method374();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						@Pc(485) Class28 local485 = this.aClass28ArrayArrayArray1[this.anInt269][local23][local30];
						if (local485 != null) {
							for (local395 = (Class1_Sub7) local485.method437(); local395 != null; local395 = (Class1_Sub7) local485.method439(this.aByte14)) {
								if (local395.anInt753 == (local33 & 0x7FFF)) {
									local395.method547();
									break;
								}
							}
							if (local485.method437() == null) {
								this.aClass28ArrayArrayArray1[this.anInt269][local23][local30] = null;
							}
							this.method80(local23, local30);
						}
					}
				} else {
					@Pc(573) int local573;
					@Pc(576) int local576;
					if (arg1 == 175) {
						local14 = arg0.method372();
						local23 = this.anInt211 + (local14 >> 4 & 0x7);
						local30 = this.anInt212 + (local14 & 0x7);
						local33 = local23 + arg0.method373();
						local37 = local30 + arg0.method373();
						local41 = arg0.method375();
						local46 = arg0.method374();
						local51 = arg0.method372();
						local573 = arg0.method372();
						local576 = arg0.method374();
						local108 = arg0.method374();
						local110 = arg0.method372();
						local112 = arg0.method372();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							local33 = local33 * 128 + 64;
							local37 = local37 * 128 + 64;
							@Pc(659) Class1_Sub1_Sub1 local659 = new Class1_Sub1_Sub1(this.anInt269, local23, local108 + anInt295, local112, this.method132(this.anInt269, local23, local30) - local51, local110, local573, local46, this.anInt301, local41, local576 + anInt295, local30);
							local659.method19(local37, this.method132(this.anInt269, local33, local37) - local573, local576 + anInt295, local33);
							this.aClass28_3.method434(local659);
						}
					} else if (arg1 == 209) {
						local14 = arg0.method372();
						local23 = this.anInt211 + (local14 >> 4 & 0x7);
						local30 = this.anInt212 + (local14 & 0x7);
						local33 = arg0.method374();
						local37 = arg0.method372();
						local41 = arg0.method374();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							@Pc(755) Class1_Sub1_Sub2 local755 = new Class1_Sub1_Sub2(local41, (byte) -108, this.method132(this.anInt269, local23, local30) - local37, local33, local30, local23, anInt295, this.anInt269);
							this.aClass28_4.method434(local755);
						}
					} else if (arg1 == 181) {
						local14 = arg0.method372();
						local23 = this.anInt211 + (local14 >> 4 & 0x7);
						local30 = this.anInt212 + (local14 & 0x7);
						local33 = arg0.method374();
						local37 = arg0.method374();
						local41 = arg0.method374();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local41 != this.anInt256) {
							@Pc(809) Class1_Sub7 local809 = new Class1_Sub7();
							local809.anInt753 = local33;
							local809.anInt754 = local37;
							if (this.aClass28ArrayArrayArray1[this.anInt269][local23][local30] == null) {
								this.aClass28ArrayArrayArray1[this.anInt269][local23][local30] = new Class28((byte) 3);
							}
							this.aClass28ArrayArrayArray1[this.anInt269][local23][local30].method434(local809);
							this.method80(local23, local30);
						}
					} else {
						if (arg1 == 146) {
							local14 = arg0.method372();
							local23 = this.anInt211 + (local14 >> 4 & 0x7);
							local30 = this.anInt212 + (local14 & 0x7);
							local33 = arg0.method372();
							local37 = local33 >> 2;
							local41 = local33 & 0x3;
							local46 = this.anIntArray37[local37];
							local51 = arg0.method374();
							local573 = arg0.method374();
							local576 = arg0.method374();
							local108 = arg0.method374();
							@Pc(907) byte local907 = arg0.method373();
							@Pc(910) byte local910 = arg0.method373();
							@Pc(913) byte local913 = arg0.method373();
							@Pc(916) byte local916 = arg0.method373();
							@Pc(923) Class1_Sub1_Sub3_Sub2 local923;
							if (local108 == this.anInt256) {
								local923 = this.aClass1_Sub1_Sub3_Sub2_1;
							} else {
								local923 = this.aClass1_Sub1_Sub3_Sub2Array1[local108];
							}
							if (local923 != null) {
								@Pc(948) Class1_Sub5 local948 = new Class1_Sub5(local23, local46, local41, this.anInt269, -1, local37, local30, local573 + anInt295, 999);
								this.aClass28_5.method434(local948);
								@Pc(968) Class1_Sub5 local968 = new Class1_Sub5(local23, local46, local41, this.anInt269, local51, local37, local30, local576 + anInt295, 999);
								this.aClass28_5.method434(local968);
								@Pc(982) int local982 = this.anIntArrayArrayArray3[this.anInt269][local23][local30];
								@Pc(994) int local994 = this.anIntArrayArrayArray3[this.anInt269][local23 + 1][local30];
								@Pc(1008) int local1008 = this.anIntArrayArrayArray3[this.anInt269][local23 + 1][local30 + 1];
								@Pc(1020) int local1020 = this.anIntArrayArrayArray3[this.anInt269][local23][local30 + 1];
								@Pc(1023) Class2 local1023 = Class2.method23(local51);
								local923.anInt925 = local573 + anInt295;
								local923.anInt926 = local576 + anInt295;
								local923.aClass1_Sub3_Sub1_11 = local1023.method26(local37, local41, local982, local994, local1008, local1020, -1);
								@Pc(1047) int local1047 = local1023.anInt43;
								@Pc(1050) int local1050 = local1023.anInt44;
								if (local41 == 1 || local41 == 3) {
									local1047 = local1023.anInt44;
									local1050 = local1023.anInt43;
								}
								local923.anInt927 = local23 * 128 + local1047 * 64;
								local923.anInt929 = local30 * 128 + local1050 * 64;
								local923.anInt928 = this.method132(this.anInt269, local923.anInt927, local923.anInt929);
								@Pc(1096) byte local1096;
								if (local907 > local913) {
									local1096 = local907;
									local907 = local913;
									local913 = local1096;
								}
								if (local910 > local916) {
									local1096 = local910;
									local910 = local916;
									local916 = local1096;
								}
								local923.anInt930 = local23 + local907;
								local923.anInt932 = local23 + local913;
								local923.anInt931 = local30 + local910;
								local923.anInt933 = local30 + local916;
							}
						}
						if (arg1 == 156) {
							local14 = arg0.method372();
							local23 = this.anInt211 + (local14 >> 4 & 0x7);
							local30 = this.anInt212 + (local14 & 0x7);
							local33 = arg0.method374();
							local37 = arg0.method374();
							local41 = arg0.method374();
							if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
								@Pc(1180) Class28 local1180 = this.aClass28ArrayArrayArray1[this.anInt269][local23][local30];
								if (local1180 != null) {
									for (@Pc(1186) Class1_Sub7 local1186 = (Class1_Sub7) local1180.method437(); local1186 != null; local1186 = (Class1_Sub7) local1180.method439(this.aByte14)) {
										if (local1186.anInt753 == (local33 & 0x7FFF) && local1186.anInt754 == local37) {
											local1186.anInt754 = local41;
											break;
										}
									}
									this.method80(local23, local30);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1217) RuntimeException local1217) {
			signlink.reporterror("98565, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method173() {
		try {
			for (@Pc(13) Class1_Sub6 local13 = (Class1_Sub6) this.aClass28_1.method437(); local13 != null; local13 = (Class1_Sub6) this.aClass28_1.method439(this.aByte14)) {
				@Pc(17) boolean local17 = false;
				local13.anInt632 += this.anInt184;
				if (local13.anInt631 == -1) {
					local13.anInt631 = 0;
					local17 = true;
				}
				label70: {
					do {
						do {
							if (local13.anInt632 <= local13.aClass19_2.anIntArray188[local13.anInt631]) {
								break label70;
							}
							local13.anInt632 -= local13.aClass19_2.anIntArray188[local13.anInt631] + 1;
							local13.anInt631++;
							local17 = true;
						} while (local13.anInt631 < local13.aClass19_2.anInt521);
						local13.anInt631 -= local13.aClass19_2.anInt522;
					} while (local13.anInt631 >= 0 && local13.anInt631 < local13.aClass19_2.anInt521);
					local13.method547();
					local17 = false;
				}
				if (local17) {
					@Pc(99) int local99 = local13.anInt626;
					@Pc(102) int local102 = local13.anInt628;
					@Pc(105) int local105 = local13.anInt629;
					@Pc(107) int local107 = 0;
					if (local13.anInt627 == 0) {
						local107 = this.aClass33_1.method474(local99, local102, local105);
					}
					if (local13.anInt627 == 1) {
						local107 = this.aClass33_1.method475(local102, local99, local105);
					}
					if (local13.anInt627 == 2) {
						local107 = this.aClass33_1.method476(local99, local102, local105);
					}
					if (local13.anInt627 == 3) {
						local107 = this.aClass33_1.method477(local99, local102, local105);
					}
					if (local107 != 0 && (local107 >> 14 & 0x7FFF) == local13.anInt630) {
						@Pc(174) int local174 = this.anIntArrayArrayArray3[local99][local102][local105];
						@Pc(185) int local185 = this.anIntArrayArrayArray3[local99][local102 + 1][local105];
						@Pc(198) int local198 = this.anIntArrayArrayArray3[local99][local102 + 1][local105 + 1];
						@Pc(209) int local209 = this.anIntArrayArrayArray3[local99][local102][local105 + 1];
						@Pc(213) Class2 local213 = Class2.method23(local13.anInt630);
						@Pc(215) int local215 = -1;
						if (local13.anInt631 != -1) {
							local215 = local13.aClass19_2.anIntArray186[local13.anInt631];
						}
						@Pc(238) int local238;
						@Pc(242) int local242;
						@Pc(246) int local246;
						@Pc(261) Class1_Sub3_Sub1 local261;
						if (local13.anInt627 == 2) {
							local238 = this.aClass33_1.method478(local99, local102, local105, local107);
							local242 = local238 & 0x1F;
							local246 = local238 >> 6;
							if (local242 == 11) {
								local242 = 10;
							}
							local261 = local213.method26(local242, local246, local174, local185, local198, local209, local215);
							this.aClass33_1.method464(local102, local261, local105, local99);
						} else if (local13.anInt627 == 1) {
							@Pc(285) Class1_Sub3_Sub1 local285 = local213.method26(4, 0, local174, local185, local198, local209, local215);
							this.aClass33_1.method465(local102, local285, local105, local99);
						} else if (local13.anInt627 == 0) {
							local238 = this.aClass33_1.method478(local99, local102, local105, local107);
							local242 = local238 & 0x1F;
							local246 = local238 >> 6;
							if (local242 == 2) {
								@Pc(323) int local323 = local246 + 1 & 0x3;
								@Pc(335) Class1_Sub3_Sub1 local335 = local213.method26(2, local246 + 4, local174, local185, local198, local209, local215);
								@Pc(345) Class1_Sub3_Sub1 local345 = local213.method26(2, local323, local174, local185, local198, local209, local215);
								this.aClass33_1.method468(local102, local335, local105, local345, local99);
							} else {
								local261 = local213.method26(local242, local246, local174, local185, local198, local209, local215);
								this.aClass33_1.method467(local105, local261, local102, local99);
							}
						} else if (local13.anInt627 == 3) {
							local238 = this.aClass33_1.method478(local99, local102, local105, local107);
							local242 = local238 >> 6;
							@Pc(402) Class1_Sub3_Sub1 local402 = local213.method26(22, local242, local174, local185, local198, local209, local215);
							this.aClass33_1.method466(local105, local402, local102, local99);
						}
					} else {
						local13.method547();
					}
				}
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("61116, " + 3 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;Lclient!kb;II)V")
	private void method174(@OriginalArg(1) Class1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(20) int local20;
			if ((arg2 & 0x1) == 1) {
				local20 = arg1.method372();
				@Pc(23) byte[] local23 = new byte[local20];
				@Pc(29) Class1_Sub3_Sub3 local29 = new Class1_Sub3_Sub3(local23, aBoolean59);
				arg1.method381(local23, local20, 0);
				this.aClass1_Sub3_Sub3Array1[arg3] = local29;
				arg0.method552(265, local29);
			}
			@Pc(67) int local67;
			if ((arg2 & 0x2) == 2) {
				local20 = arg1.method374();
				if (local20 == 65535) {
					local20 = -1;
				}
				if (local20 == arg0.anInt898) {
					arg0.anInt902 = 0;
				}
				local67 = arg1.method372();
				if (local20 == -1 || arg0.anInt898 == -1 || Class19.aClass19Array1[local20].anInt523 > Class19.aClass19Array1[arg0.anInt898].anInt523 || Class19.aClass19Array1[arg0.anInt898].anInt523 == 0) {
					arg0.anInt898 = local20;
					arg0.anInt899 = 0;
					arg0.anInt900 = 0;
					arg0.anInt901 = local67;
					arg0.anInt902 = 0;
				}
			}
			if ((arg2 & 0x4) == 4) {
				arg0.anInt892 = arg1.method374();
				if (arg0.anInt892 == 65535) {
					arg0.anInt892 = -1;
				}
			}
			if ((arg2 & 0x8) == 8) {
				arg0.aString29 = arg1.method379();
				arg0.anInt885 = 0;
				arg0.anInt886 = 0;
				arg0.anInt884 = 150;
				this.method88(2, arg0.aString29, arg0.aString30);
			}
			if ((arg2 & 0x10) == 16) {
				arg0.anInt887 = arg1.method372();
				arg0.anInt888 = arg1.method372();
				arg0.anInt889 = anInt295 + 400;
				arg0.anInt890 = arg1.method372();
				arg0.anInt891 = arg1.method372();
			}
			if ((arg2 & 0x20) == 32) {
				arg0.anInt893 = arg1.method374();
				arg0.anInt894 = arg1.method374();
			}
			if ((arg2 & 0x40) == 64) {
				local20 = arg1.method374();
				local67 = arg1.method372();
				@Pc(200) int local200 = arg1.method372();
				@Pc(203) int local203 = arg1.anInt539;
				if (arg0.aString30 != null) {
					@Pc(210) long local210 = Class40.method518(arg0.aString30);
					@Pc(212) boolean local212 = false;
					if (local67 <= 1) {
						for (@Pc(217) int local217 = 0; local217 < this.anInt307; local217++) {
							if (this.aLongArray3[local217] == local210) {
								local212 = true;
								break;
							}
						}
					}
					if (!local212 && this.anInt298 == 0) {
						try {
							@Pc(245) String local245 = Class41.method525(local200, arg1);
							@Pc(249) String local249 = Class25.method405(local245);
							arg0.aString29 = local249;
							arg0.anInt885 = local20 >> 8;
							arg0.anInt886 = local20 & 0xFF;
							arg0.anInt884 = 150;
							if (local67 > 1) {
								this.method88(1, local249, arg0.aString30);
							} else {
								this.method88(2, local249, arg0.aString30);
							}
						} catch (@Pc(286) Exception local286) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt539 = local203 + local200;
			}
			if ((arg2 & 0x100) == 256) {
				arg0.anInt903 = arg1.method374();
				local20 = arg1.method377();
				arg0.anInt907 = local20 >> 16;
				arg0.anInt906 = anInt295 + (local20 & 0xFFFF);
				arg0.anInt904 = 0;
				arg0.anInt905 = 0;
				if (arg0.anInt906 > anInt295) {
					arg0.anInt904 = -1;
				}
				if (arg0.anInt903 == 65535) {
					arg0.anInt903 = -1;
				}
			}
			if ((arg2 & 0x200) == 512) {
				arg0.anInt908 = arg1.method372();
				arg0.anInt910 = arg1.method372();
				arg0.anInt909 = arg1.method372();
				arg0.anInt911 = arg1.method372();
				arg0.anInt912 = arg1.method374() + anInt295;
				arg0.anInt913 = arg1.method374() + anInt295;
				arg0.anInt914 = arg1.method372();
				arg0.anInt918 = 0;
				arg0.anIntArray232[0] = arg0.anInt909;
				arg0.anIntArray233[0] = arg0.anInt911;
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("56962, " + -141 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method176() {
		try {
			this.aBoolean41 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray80[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class13.anInt415; local15++) {
					if (Class13.aClass13Array1[local15].anInt416 == local6 + (this.aBoolean79 ? 0 : 7)) {
						this.anIntArray80[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("49331, " + false + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method177() {
		try {
			@Pc(8) byte[] local8 = this.aClass39_1.method516("title.dat", null);
			@Pc(14) Class1_Sub3_Sub2_Sub2 local14 = new Class1_Sub3_Sub2_Sub2(local8, this);
			this.aClass32_6.method444();
			local14.method306(anInt191, 0, 0);
			this.aClass32_7.method444();
			local14.method306(anInt191, 0, -661);
			this.aClass32_3.method444();
			local14.method306(anInt191, 0, -128);
			this.aClass32_4.method444();
			local14.method306(anInt191, -386, -214);
			this.aClass32_5.method444();
			local14.method306(anInt191, -186, -214);
			this.aClass32_8.method444();
			local14.method306(anInt191, -265, 0);
			this.aClass32_9.method444();
			local14.method306(anInt191, -265, -574);
			this.aClass32_10.method444();
			local14.method306(anInt191, -186, -128);
			this.aClass32_11.method444();
			local14.method306(anInt191, -186, -574);
			@Pc(99) int[] local99 = new int[local14.anInt440];
			for (@Pc(101) int local101 = 0; local101 < local14.anInt441; local101++) {
				for (@Pc(105) int local105 = 0; local105 < local14.anInt440; local105++) {
					local99[local105] = local14.anIntArray148[local14.anInt440 + local14.anInt440 * local101 - local105 - 1];
				}
				for (@Pc(131) int local131 = 0; local131 < local14.anInt440; local131++) {
					local14.anIntArray148[local131 + local14.anInt440 * local101] = local99[local131];
				}
			}
			this.aClass32_6.method444();
			local14.method306(anInt191, 0, 394);
			this.aClass32_7.method444();
			local14.method306(anInt191, 0, -267);
			this.aClass32_3.method444();
			local14.method306(anInt191, 0, 266);
			this.aClass32_4.method444();
			local14.method306(anInt191, -386, 180);
			this.aClass32_5.method444();
			local14.method306(anInt191, -186, 180);
			if (this.aByte9 == 106) {
				this.aClass32_8.method444();
				local14.method306(anInt191, -265, 394);
				this.aClass32_9.method444();
				local14.method306(anInt191, -265, -180);
				this.aClass32_10.method444();
				local14.method306(anInt191, -186, 212);
				this.aClass32_11.method444();
				local14.method306(anInt191, -186, -180);
				local14 = new Class1_Sub3_Sub2_Sub2(this.aClass39_1, "logo", 0);
				this.aClass32_3.method444();
				local14.method308(super.anInt126 / 2 - local14.anInt440 / 2 - 128, 18);
				System.gc();
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("73283, " + 106 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method178() {
		try {
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method190();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass6_1 = null;
			this.aBoolean70 = false;
			this.anInt306 = 0;
			this.aString13 = "";
			this.aString14 = "";
			Class8.method198(false);
			this.method77();
			this.aClass33_1.method448((byte) 9);
			for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
				this.aClass9Array1[local46].method237();
			}
			System.gc();
			this.method130("null");
			this.aString9 = null;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("35209, " + 38 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIILclient!hc;IIIII)V")
	private void method179(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean50) {
				this.anInt237 = 32;
			} else {
				this.anInt237 = 0;
			}
			this.aBoolean50 = false;
			if (arg7 >= arg4 && arg7 < arg4 + 16 && arg1 >= arg3 && arg1 < arg3 + 16) {
				arg2.anInt460 -= this.anInt210 * 4;
				if (arg0) {
					this.aBoolean52 = true;
					return;
				}
			} else if (arg7 >= arg4 && arg7 < arg4 + 16 && arg1 >= arg3 + arg6 - 16 && arg1 < arg3 + arg6) {
				arg2.anInt460 += this.anInt210 * 4;
				if (arg0) {
					this.aBoolean52 = true;
					return;
				}
			} else if (arg7 >= arg4 - this.anInt237 && arg7 < arg4 + this.anInt237 + 16 && arg1 >= arg3 + 16 && arg1 < arg3 + arg6 - 16 && this.anInt210 > 0) {
				@Pc(123) int local123 = (arg6 - 32) * arg6 / arg5;
				if (local123 < 8) {
					local123 = 8;
				}
				@Pc(138) int local138 = arg1 - arg3 - local123 / 2 - 16;
				@Pc(144) int local144 = arg6 - local123 - 32;
				arg2.anInt460 = (arg5 - arg6) * local138 / local144;
				if (arg0) {
					this.aBoolean52 = true;
				}
				this.aBoolean50 = true;
			} else {
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("52097, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method180() {
		try {
			this.anInt275 = 0;
			@Pc(77) int local77;
			@Pc(79) int local79;
			@Pc(322) int local322;
			for (@Pc(11) int local11 = -1; local11 < this.anInt157 + this.anInt183; local11++) {
				@Pc(19) Class1_Sub1_Sub3 local19;
				if (local11 == -1) {
					local19 = this.aClass1_Sub1_Sub3_Sub2_1;
				} else if (local11 < this.anInt157) {
					local19 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray30[local11]];
				} else {
					local19 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray36[local11 - this.anInt157]];
				}
				if (local19 != null && local19.method551()) {
					if (local11 < this.anInt157) {
						@Pc(60) Class1_Sub1_Sub3_Sub2 local60 = (Class1_Sub1_Sub3_Sub2) local19;
						if (local60.anInt922 != 0) {
							this.method185(local19, local19.anInt916 + 15);
							if (this.anInt303 > -1) {
								local77 = 28;
								for (local79 = 0; local79 < 8; local79++) {
									if ((local60.anInt922 & 0x1 << local79) != 0) {
										this.aClass1_Sub3_Sub2_Sub2Array6[local79].method308(this.anInt303 - 12, this.anInt304 - local77);
										local77 -= 25;
									}
								}
							}
						}
					} else if (this.anInt273 == 1 && this.anInt271 == this.anIntArray36[local11 - this.anInt157] && anInt295 % 20 < 10) {
						this.method185(local19, local19.anInt916 + 15);
						if (this.anInt303 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array6[2].method308(this.anInt303 - 12, this.anInt304 - 28);
						}
					}
					if (local19.aString29 != null && (local11 >= this.anInt157 || this.anInt154 == 0 || this.anInt154 == 1 && this.method109(((Class1_Sub1_Sub3_Sub2) local19).aString30))) {
						this.method185(local19, local19.anInt916);
						if (this.anInt303 > -1 && this.anInt275 < this.anInt276) {
							this.anIntArray65[this.anInt275] = this.aClass1_Sub3_Sub2_Sub4_3.method349(local19.aString29) / 2;
							this.anIntArray64[this.anInt275] = this.aClass1_Sub3_Sub2_Sub4_3.anInt518;
							this.anIntArray62[this.anInt275] = this.anInt303;
							this.anIntArray63[this.anInt275] = this.anInt304;
							this.anIntArray66[this.anInt275] = local19.anInt885;
							this.anIntArray67[this.anInt275] = local19.anInt886;
							this.anIntArray68[this.anInt275] = local19.anInt884;
							this.aStringArray9[this.anInt275++] = local19.aString29;
							if (this.anInt257 == 0 && local19.anInt886 == 1) {
								this.anIntArray64[this.anInt275] += 10;
								this.anIntArray63[this.anInt275] += 5;
							}
							if (this.anInt257 == 0 && local19.anInt886 == 2) {
								this.anIntArray65[this.anInt275] = 60;
							}
						}
					}
					if (local19.anInt889 > anInt295 + 100) {
						this.method185(local19, local19.anInt916 + 15);
						if (this.anInt303 > -1) {
							local322 = local19.anInt890 * 30 / local19.anInt891;
							if (local322 > 30) {
								local322 = 30;
							}
							Class1_Sub3_Sub2.method343(65280, this.anInt304 - 3, this.anInt303 - 15, local322, 5);
							Class1_Sub3_Sub2.method343(16711680, this.anInt304 - 3, this.anInt303 - 15 + local322, 30 - local322, 5);
						}
					}
					if (local19.anInt889 > anInt295 + 330) {
						this.method185(local19, local19.anInt916 / 2);
						if (this.anInt303 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array3[local19.anInt888].method308(this.anInt303 - 12, this.anInt304 - 12);
							this.aClass1_Sub3_Sub2_Sub4_1.method347(String.valueOf(local19.anInt887), this.anInt304 + 4, this.anInt303, 0);
							this.aClass1_Sub3_Sub2_Sub4_1.method347(String.valueOf(local19.anInt887), this.anInt304 + 3, this.anInt303 - 1, 16777215);
						}
					}
				}
			}
			for (@Pc(430) int local430 = 0; local430 < this.anInt275; local430++) {
				local322 = this.anIntArray62[local430];
				local77 = this.anIntArray63[local430];
				local79 = this.anIntArray65[local430];
				@Pc(452) int local452 = this.anIntArray64[local430];
				@Pc(454) boolean local454 = true;
				while (local454) {
					local454 = false;
					for (@Pc(460) int local460 = 0; local460 < local430; local460++) {
						if (local77 + 2 > this.anIntArray63[local460] - this.anIntArray64[local460] && local77 - local452 < this.anIntArray63[local460] + 2 && local322 - local79 < this.anIntArray62[local460] + this.anIntArray65[local460] && local322 + local79 > this.anIntArray62[local460] - this.anIntArray65[local460] && this.anIntArray63[local460] - this.anIntArray64[local460] < local77) {
							local77 = this.anIntArray63[local460] - this.anIntArray64[local460];
							local454 = true;
						}
					}
				}
				this.anInt303 = this.anIntArray62[local430];
				this.anInt304 = this.anIntArray63[local430] = local77;
				@Pc(559) String local559 = this.aStringArray9[local430];
				if (this.anInt257 == 0) {
					@Pc(564) int local564 = 16776960;
					if (this.anIntArray66[local430] < 6) {
						local564 = this.anIntArray58[this.anIntArray66[local430]];
					}
					if (this.anIntArray66[local430] == 6) {
						local564 = this.anInt182 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray66[local430] == 7) {
						local564 = this.anInt182 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray66[local430] == 8) {
						local564 = this.anInt182 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(639) int local639;
					if (this.anIntArray66[local430] == 9) {
						local639 = 150 - this.anIntArray68[local430];
						if (local639 < 50) {
							local564 = local639 * 1280 + 16711680;
						} else if (local639 < 100) {
							local564 = 16776960 - (local639 - 50) * 327680;
						} else if (local639 < 150) {
							local564 = (local639 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray66[local430] == 10) {
						local639 = 150 - this.anIntArray68[local430];
						if (local639 < 50) {
							local564 = local639 * 5 + 16711680;
						} else if (local639 < 100) {
							local564 = 16711935 - (local639 - 50) * 327680;
						} else if (local639 < 150) {
							local564 = (local639 - 100) * 327680 + 255 - (local639 - 100) * 5;
						}
					}
					if (this.anIntArray66[local430] == 11) {
						local639 = 150 - this.anIntArray68[local430];
						if (local639 < 50) {
							local564 = 16777215 - local639 * 327685;
						} else if (local639 < 100) {
							local564 = (local639 - 50) * 327685 + 65280;
						} else if (local639 < 150) {
							local564 = 16777215 - (local639 - 100) * 327680;
						}
					}
					if (this.anIntArray67[local430] == 0) {
						this.aClass1_Sub3_Sub2_Sub4_3.method347(local559, this.anInt304 + 1, this.anInt303, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method347(local559, this.anInt304, this.anInt303, local564);
					}
					if (this.anIntArray67[local430] == 1) {
						this.aClass1_Sub3_Sub2_Sub4_3.method351(local559, this.anInt303, this.anInt304 + 1, 0, this.anInt179, this.anInt182);
						this.aClass1_Sub3_Sub2_Sub4_3.method351(local559, this.anInt303, this.anInt304, local564, this.anInt179, this.anInt182);
					}
					if (this.anIntArray67[local430] == 2) {
						local639 = this.aClass1_Sub3_Sub2_Sub4_3.method349(local559);
						@Pc(862) int local862 = (150 - this.anIntArray68[local430]) * (local639 + 100) / 150;
						Class1_Sub3_Sub2.method341(this.aBoolean48, this.anInt303 - 50, 0, this.anInt303 + 50, 334);
						this.aClass1_Sub3_Sub2_Sub4_3.method350(local559, this.anInt303 + 50 - local862, this.anInt304 + 1, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method350(local559, this.anInt303 + 50 - local862, this.anInt304, local564);
						Class1_Sub3_Sub2.method340();
					}
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method347(local559, this.anInt304 + 1, this.anInt303, 0);
					this.aClass1_Sub3_Sub2_Sub4_3.method347(local559, this.anInt304, this.anInt303, 16776960);
				}
			}
		} catch (@Pc(938) RuntimeException local938) {
			signlink.reporterror("59699, " + 3 + ", " + local938.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (!this.aBoolean47) {
			super.run();
			return;
		}
		this.aBoolean69 = true;
		try {
			@Pc(10) long local10 = System.currentTimeMillis();
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = 20;
			while (this.aBoolean53) {
				this.method141();
				this.method141();
				this.method181();
				local12++;
				if (local12 > 10) {
					@Pc(31) long local31 = System.currentTimeMillis();
					@Pc(40) int local40 = (int) (local31 - local10) / 10 - local14;
					local14 = 40 - local40;
					if (local14 < 5) {
						local14 = 5;
					}
					local12 = 0;
					local10 = local31;
				}
				try {
					Thread.sleep((long) local14);
				} catch (@Pc(58) Exception local58) {
				}
			}
		} catch (@Pc(64) Exception local64) {
		}
		this.aBoolean69 = false;
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method181() {
		try {
			@Pc(8) int local8;
			if (this.anInt175 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt175 > 768) {
						this.anIntArray46[local8] = this.method123(this.anIntArray47[local8], 1024 - this.anInt175, this.anIntArray48[local8]);
					} else if (this.anInt175 > 256) {
						this.anIntArray46[local8] = this.anIntArray48[local8];
					} else {
						this.anIntArray46[local8] = this.method123(this.anIntArray48[local8], 256 - this.anInt175, this.anIntArray47[local8]);
					}
				}
			} else if (this.anInt176 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt176 > 768) {
						this.anIntArray46[local8] = this.method123(this.anIntArray47[local8], 1024 - this.anInt176, this.anIntArray49[local8]);
					} else if (this.anInt176 > 256) {
						this.anIntArray46[local8] = this.anIntArray49[local8];
					} else {
						this.anIntArray46[local8] = this.method123(this.anIntArray49[local8], 256 - this.anInt176, this.anIntArray47[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray46[local8] = this.anIntArray47[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass32_6.anIntArray197[local8] = this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148[local8];
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
				local198 = this.anIntArray54[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray40[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray46[local220];
						local239 = this.aClass32_6.anIntArray197[local183];
						this.aClass32_6.anIntArray197[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass32_6.method445(super.aGraphics2, 0, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass32_7.anIntArray197[local198] = this.aClass1_Sub3_Sub2_Sub2_5.anIntArray148[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray54[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray40[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray46[local228];
						@Pc(373) int local373 = this.aClass32_7.anIntArray197[local183];
						this.aClass32_7.anIntArray197[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass32_7.method445(super.aGraphics2, 661, 0);
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("94414, " + -372 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;II)I")
	private int method182(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray15 == null || arg1 >= arg0.anIntArrayArray15.length) {
				return -2;
			}
			try {
				@Pc(23) int[] local23 = arg0.anIntArrayArray15[arg1];
				@Pc(25) int local25 = 0;
				@Pc(27) int local27 = 0;
				while (true) {
					@Pc(32) int local32 = local23[local27++];
					if (local32 == 0) {
						return local25;
					}
					if (local32 == 1) {
						local25 += this.anIntArray84[local23[local27++]];
					}
					if (local32 == 2) {
						local25 += this.anIntArray78[local23[local27++]];
					}
					if (local32 == 3) {
						local25 += this.anIntArray53[local23[local27++]];
					}
					@Pc(85) Class15 local85;
					@Pc(92) int local92;
					@Pc(94) int local94;
					if (local32 == 4) {
						local85 = Class15.aClass15Array1[local23[local27++]];
						local92 = local23[local27++] + 1;
						for (local94 = 0; local94 < local85.anIntArray149.length; local94++) {
							if (local85.anIntArray149[local94] == local92) {
								local25 += local85.anIntArray150[local94];
							}
						}
					}
					if (local32 == 5) {
						local25 += this.anIntArray35[local23[local27++]];
					}
					if (local32 == 6) {
						local25 += anIntArray39[this.anIntArray78[local23[local27++]] - 1];
					}
					if (local32 == 7) {
						local25 += this.anIntArray35[local23[local27++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local25 += this.aClass1_Sub1_Sub3_Sub2_1.anInt923;
					}
					@Pc(176) int local176;
					if (local32 == 9) {
						for (local176 = 0; local176 < 19; local176++) {
							if (local176 == 18) {
								local176 = 20;
							}
							local25 += this.anIntArray78[local176];
						}
					}
					if (local32 == 10) {
						local85 = Class15.aClass15Array1[local23[local27++]];
						local92 = local23[local27++] + 1;
						for (local94 = 0; local94 < local85.anIntArray149.length; local94++) {
							if (local85.anIntArray149[local94] == local92) {
								local25 += 999999999;
								break;
							}
						}
					}
					if (local32 == 11) {
						local25 += this.anInt165;
					}
					if (local32 == 12) {
						local25 += this.anInt194;
					}
					if (local32 == 13) {
						local176 = this.anIntArray35[local23[local27++]];
						local92 = local23[local27++];
						local25 += (local176 & 0x1 << local92) == 0 ? 0 : 1;
					}
				}
			} catch (@Pc(279) Exception local279) {
				return -1;
			}
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("58934, " + arg0 + ", " + -295 + ", " + arg1 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method74(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.method90();
			if (this.aClass39_1 == null) {
				super.method74(arg0, arg1);
			} else {
				this.aClass32_5.method444();
				this.aClass1_Sub3_Sub2_Sub4_3.method347("RuneScape is loading - please wait...", 54, 180, 16777215);
				Class1_Sub3_Sub2.method344(304, 9179409, 62, 28, 34);
				Class1_Sub3_Sub2.method344(302, 0, 63, 29, 32);
				Class1_Sub3_Sub2.method343(9179409, 64, 30, arg0 * 3, 30);
				Class1_Sub3_Sub2.method343(0, 64, arg0 * 3 + 30, 300 - arg0 * 3, 30);
				this.aClass1_Sub3_Sub2_Sub4_3.method347(arg1, 85, 180, 16777215);
				this.aClass32_5.method445(super.aGraphics2, 214, 186);
				if (this.aBoolean57) {
					this.aBoolean57 = false;
					if (!this.aBoolean53) {
						this.aClass32_6.method445(super.aGraphics2, 0, 0);
						this.aClass32_7.method445(super.aGraphics2, 661, 0);
					}
					this.aClass32_3.method445(super.aGraphics2, 128, 0);
					this.aClass32_4.method445(super.aGraphics2, 214, 386);
					this.aClass32_8.method445(super.aGraphics2, 0, 265);
					this.aClass32_9.method445(super.aGraphics2, 574, 265);
					this.aClass32_10.method445(super.aGraphics2, 128, 186);
					this.aClass32_11.method445(super.aGraphics2, 574, 186);
				}
			}
		} catch (@Pc(210) RuntimeException local210) {
			signlink.reporterror("32696, " + arg0 + ", " + ", " + arg1 + ", " + local210.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!hc;BII)V")
	private void method183(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1.anInt451 == 0 && arg1.anIntArray153 != null && (!arg1.aBoolean118 || this.anInt186 == arg1.anInt449 || this.anInt300 == arg1.anInt449 || this.anInt314 == arg1.anInt449)) {
				@Pc(29) int local29 = Class1_Sub3_Sub2.anInt511;
				@Pc(31) int local31 = Class1_Sub3_Sub2.anInt509;
				@Pc(33) int local33 = Class1_Sub3_Sub2.anInt512;
				@Pc(35) int local35 = Class1_Sub3_Sub2.anInt510;
				Class1_Sub3_Sub2.method341(this.aBoolean48, arg0, arg3, arg0 + arg1.anInt454, arg3 + arg1.anInt455);
				@Pc(53) int local53;
				if (arg2 != 1) {
					for (local53 = 1; local53 > 0; local53++) {
					}
				}
				local53 = arg1.anIntArray153.length;
				for (@Pc(64) int local64 = 0; local64 < local53; local64++) {
					@Pc(73) int local73 = arg1.anIntArray154[local64] + arg0;
					@Pc(82) int local82 = arg1.anIntArray155[local64] + arg3 - arg4;
					@Pc(89) Class15 local89 = Class15.aClass15Array1[arg1.anIntArray153[local64]];
					@Pc(94) int local94 = local73 + local89.anInt456;
					@Pc(99) int local99 = local82 + local89.anInt457;
					if (local89.anInt453 > 0) {
						this.method163(this.anInt219, local89);
					}
					if (local89.anInt451 == 0) {
						if (local89.anInt460 > local89.anInt459 - local89.anInt455) {
							local89.anInt460 = local89.anInt459 - local89.anInt455;
						}
						if (local89.anInt460 < 0) {
							local89.anInt460 = 0;
						}
						this.method183(local94, local89, this.aByte11, local99, local89.anInt460);
						if (local89.anInt459 > local89.anInt455) {
							this.method117(local94 + local89.anInt454, local89.anInt460, local89.anInt455, local99, local89.anInt459);
						}
					} else if (local89.anInt451 != 1) {
						@Pc(173) int local173;
						@Pc(177) int local177;
						@Pc(188) int local188;
						@Pc(223) int local223;
						@Pc(230) int local230;
						@Pc(171) int local171;
						@Pc(197) int local197;
						@Pc(221) int local221;
						if (local89.anInt451 == 2) {
							local171 = 0;
							for (local173 = 0; local173 < local89.anInt455; local173++) {
								for (local177 = 0; local177 < local89.anInt454; local177++) {
									local188 = local94 + local177 * (local89.anInt462 + 32);
									local197 = local99 + local173 * (local89.anInt463 + 32);
									if (local171 < 20) {
										local188 += local89.anIntArray156[local171];
										local197 += local89.anIntArray157[local171];
									}
									if (local89.anIntArray149[local171] > 0) {
										local221 = 0;
										local223 = 0;
										local230 = local89.anIntArray149[local171] - 1;
										@Pc(238) Class1_Sub3_Sub2_Sub2 local238 = Class5.method59(local230, local89.anIntArray150[local171], 44);
										if (this.anInt261 != 0 && this.anInt260 == local171 && this.anInt259 == local89.anInt449) {
											local221 = super.anInt130 - this.anInt262;
											local223 = super.anInt131 - this.anInt263;
											if (local221 < 5 && local221 > -5) {
												local221 = 0;
											}
											if (local223 < 5 && local223 > -5) {
												local223 = 0;
											}
											if (this.anInt205 < 5) {
												local221 = 0;
												local223 = 0;
											}
											local238.method312(local188 + local221, this.aByte13, local197 + local223);
										} else if (this.anInt313 != 0 && this.anInt312 == local171 && this.anInt311 == local89.anInt449) {
											local238.method312(local188, this.aByte13, local197);
										} else {
											local238.method308(local188, local197);
										}
										if (local238.anInt444 == 33 || local89.anIntArray150[local171] != 1) {
											@Pc(340) int local340 = local89.anIntArray150[local171];
											this.aClass1_Sub3_Sub2_Sub4_1.method350(method184(local340, 601), local188 + local221 + 1, local197 + 10 + local223, 0);
											this.aClass1_Sub3_Sub2_Sub4_1.method350(method184(local340, 601), local188 + local221, local197 + 9 + local223, 16776960);
										}
									} else if (local89.aClass1_Sub3_Sub2_Sub2Array8 != null && local171 < 20) {
										@Pc(387) Class1_Sub3_Sub2_Sub2 local387 = local89.aClass1_Sub3_Sub2_Sub2Array8[local171];
										if (local387 != null) {
											local387.method308(local188, local197);
										}
									}
									local171++;
								}
							}
						} else if (local89.anInt451 != 3) {
							@Pc(445) Class1_Sub3_Sub2_Sub4 local445;
							if (local89.anInt451 == 4) {
								local445 = local89.aClass1_Sub3_Sub2_Sub4_5;
								local173 = local89.anInt464;
								@Pc(451) String local451 = local89.aString19;
								if ((this.anInt314 == local89.anInt449 || this.anInt300 == local89.anInt449 || this.anInt186 == local89.anInt449) && local89.anInt466 != 0) {
									local173 = local89.anInt466;
								}
								if (this.method189(local89)) {
									local173 = local89.anInt465;
									if (local89.aString20.length() > 0) {
										local451 = local89.aString20;
									}
								}
								if (local89.anInt452 == 6 && this.aBoolean46) {
									local451 = "Please wait...";
									local173 = local89.anInt464;
								}
								local197 = local99 + local445.anInt518;
								while (local451.length() > 0) {
									if (local451.indexOf("%") != -1) {
										label247: while (true) {
											local221 = local451.indexOf("%1");
											if (local221 == -1) {
												while (true) {
													local221 = local451.indexOf("%2");
													if (local221 == -1) {
														while (true) {
															local221 = local451.indexOf("%3");
															if (local221 == -1) {
																while (true) {
																	local221 = local451.indexOf("%4");
																	if (local221 == -1) {
																		while (true) {
																			local221 = local451.indexOf("%5");
																			if (local221 == -1) {
																				break label247;
																			}
																			local451 = local451.substring(0, local221) + this.method82(this.method182(local89, 4)) + local451.substring(local221 + 2);
																		}
																	}
																	local451 = local451.substring(0, local221) + this.method82(this.method182(local89, 3)) + local451.substring(local221 + 2);
																}
															}
															local451 = local451.substring(0, local221) + this.method82(this.method182(local89, 2)) + local451.substring(local221 + 2);
														}
													}
													local451 = local451.substring(0, local221) + this.method82(this.method182(local89, 1)) + local451.substring(local221 + 2);
												}
											}
											local451 = local451.substring(0, local221) + this.method82(this.method182(local89, 0)) + local451.substring(local221 + 2);
										}
									}
									local221 = local451.indexOf("\\n");
									@Pc(693) String local693;
									if (local221 == -1) {
										local693 = local451;
										local451 = "";
									} else {
										local693 = local451.substring(0, local221);
										local451 = local451.substring(local221 + 2);
									}
									if (local89.aBoolean124) {
										local445.method348(local197, local693, local173, local89.aBoolean125, local94 + local89.anInt454 / 2);
									} else {
										local445.method352(local89.aBoolean125, local173, local94, local197, local693);
									}
									local197 += local445.anInt518;
								}
							} else if (local89.anInt451 == 5) {
								@Pc(755) Class1_Sub3_Sub2_Sub2 local755;
								if (this.method189(local89)) {
									local755 = local89.aClass1_Sub3_Sub2_Sub2_13;
								} else {
									local755 = local89.aClass1_Sub3_Sub2_Sub2_12;
								}
								if (local755 != null) {
									local755.method308(local94, local99);
								}
							} else if (local89.anInt451 == 6) {
								local171 = Class1_Sub3_Sub2_Sub1.anInt409;
								local173 = Class1_Sub3_Sub2_Sub1.anInt410;
								Class1_Sub3_Sub2_Sub1.anInt409 = local94 + local89.anInt454 / 2;
								Class1_Sub3_Sub2_Sub1.anInt410 = local99 + local89.anInt455 / 2;
								local177 = Class1_Sub3_Sub2_Sub1.anIntArray137[local89.anInt470] * local89.anInt469 >> 16;
								local188 = Class1_Sub3_Sub2_Sub1.anIntArray138[local89.anInt470] * local89.anInt469 >> 16;
								@Pc(816) boolean local816 = this.method189(local89);
								if (local816) {
									local221 = local89.anInt468;
								} else {
									local221 = local89.anInt467;
								}
								@Pc(835) Class1_Sub3_Sub1 local835;
								if (local221 == -1) {
									local835 = local89.method318(-1, -1, local816);
								} else {
									@Pc(841) Class19 local841 = Class19.aClass19Array1[local221];
									local835 = local89.method318(local841.anIntArray186[local89.anInt447], local841.anIntArray187[local89.anInt447], local816);
								}
								if (local835 != null) {
									local835.method231(local89.anInt471, 0, local89.anInt470, 0, local177, local188);
								}
								Class1_Sub3_Sub2_Sub1.anInt409 = local171;
								Class1_Sub3_Sub2_Sub1.anInt410 = local173;
							} else if (local89.anInt451 == 7) {
								local445 = local89.aClass1_Sub3_Sub2_Sub4_5;
								local173 = 0;
								for (local177 = 0; local177 < local89.anInt455; local177++) {
									for (local188 = 0; local188 < local89.anInt454; local188++) {
										if (local89.anIntArray149[local173] > 0) {
											@Pc(904) Class5 local904 = Class5.method54(local89.anIntArray149[local173] - 1);
											@Pc(907) String local907 = local904.aString3;
											if (local904.aBoolean37 || local89.anIntArray150[local173] != 1) {
												local907 = local907 + " x" + method136(local89.anIntArray150[local173]);
											}
											local223 = local94 + local188 * (local89.anInt462 + 115);
											local230 = local99 + local177 * (local89.anInt463 + 12);
											if (local89.aBoolean124) {
												local445.method348(local230, local907, local89.anInt464, local89.aBoolean125, local223 + local89.anInt454 / 2);
											} else {
												local445.method352(local89.aBoolean125, local89.anInt464, local223, local230, local907);
											}
										}
										local173++;
									}
								}
							}
						} else if (local89.aBoolean123) {
							Class1_Sub3_Sub2.method343(local89.anInt464, local99, local94, local89.anInt454, local89.anInt455);
						} else {
							Class1_Sub3_Sub2.method344(local89.anInt454, local89.anInt464, local99, local94, local89.anInt455);
						}
					}
				}
				Class1_Sub3_Sub2.method341(this.aBoolean48, local29, local31, local33, local35);
			}
		} catch (@Pc(1004) RuntimeException local1004) {
			signlink.reporterror("46286, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1004.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;BI)V")
	private void method185(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method186(arg1, arg0.anInt874, arg0.anInt873);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("39393, " + arg0 + ", " + 2 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)V")
	private void method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method132(this.anInt269, arg2, arg1) - arg0;
				@Pc(33) int local33 = arg2 - this.anInt140;
				@Pc(38) int local38 = local28 - this.anInt141;
				@Pc(43) int local43 = arg1 - this.anInt142;
				@Pc(48) int local48 = Class1_Sub3_Sub1.anIntArray124[this.anInt143];
				@Pc(53) int local53 = Class1_Sub3_Sub1.anIntArray125[this.anInt143];
				@Pc(68) int local68 = Class1_Sub3_Sub1.anIntArray124[this.anInt144];
				@Pc(73) int local73 = Class1_Sub3_Sub1.anIntArray125[this.anInt144];
				@Pc(83) int local83 = local43 * local68 + local33 * local73 >> 16;
				@Pc(93) int local93 = local43 * local73 - local33 * local68 >> 16;
				@Pc(95) int local95 = local83;
				@Pc(105) int local105 = local38 * local53 - local93 * local48 >> 16;
				@Pc(115) int local115 = local38 * local48 + local93 * local53 >> 16;
				if (local115 >= 50) {
					this.anInt303 = Class1_Sub3_Sub2_Sub1.anInt409 + (local95 << 9) / local115;
					this.anInt304 = Class1_Sub3_Sub2_Sub1.anInt410 + (local105 << 9) / local115;
				} else {
					this.anInt303 = -1;
					this.anInt304 = -1;
				}
			} else {
				this.anInt303 = -1;
				this.anInt304 = -1;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("13180, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getjingle", descriptor = "()Ljava/lang/String;")
	private String method188() {
		if (signlink.jingle == null) {
			return "none";
		} else {
			@Pc(5) String local5 = signlink.jingle;
			signlink.jingle = null;
			return local5;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;I)Z")
	private boolean method189(@OriginalArg(0) Class15 arg0) {
		try {
			if (arg0.anIntArray151 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray151.length; local6++) {
				@Pc(14) int local14 = this.method182(arg0, local6);
				@Pc(19) int local19 = arg0.anIntArray152[local6];
				if (arg0.anIntArray151[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray151[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray151[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			if (this.anInt264 > 4 || this.anInt264 < 4) {
				throw new NullPointerException();
			}
			return true;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("69131, " + arg0 + ", " + 4 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method69() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method190();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass6_1 = null;
			this.method130("null");
			this.aClass1_Sub3_Sub3_4 = null;
			this.aClass1_Sub3_Sub3_6 = null;
			this.aClass1_Sub3_Sub3_5 = null;
			this.anIntArray72 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass33_1 = null;
			this.aClass9Array1 = null;
			this.anIntArrayArray5 = null;
			this.anIntArrayArray4 = null;
			this.anIntArray75 = null;
			this.anIntArray76 = null;
			this.aByteArray4 = null;
			this.aClass32_25 = null;
			this.aClass32_26 = null;
			this.aClass32_27 = null;
			this.aClass32_28 = null;
			this.aClass32_12 = null;
			this.aClass32_13 = null;
			this.aClass32_14 = null;
			this.aClass32_15 = null;
			this.aClass32_16 = null;
			this.aClass32_17 = null;
			this.aClass32_18 = null;
			this.aClass32_19 = null;
			this.aClass32_20 = null;
			this.aClass32_21 = null;
			this.aClass32_22 = null;
			this.aClass32_23 = null;
			this.aClass32_24 = null;
			this.aClass1_Sub3_Sub2_Sub3_16 = null;
			this.aClass1_Sub3_Sub2_Sub3_17 = null;
			this.aClass1_Sub3_Sub2_Sub3_18 = null;
			this.aClass1_Sub3_Sub2_Sub3_6 = null;
			this.aClass1_Sub3_Sub2_Sub3_7 = null;
			this.aClass1_Sub3_Sub2_Sub3_8 = null;
			this.aClass1_Sub3_Sub2_Sub3Array3 = null;
			this.aClass1_Sub3_Sub2_Sub3_11 = null;
			this.aClass1_Sub3_Sub2_Sub3_12 = null;
			this.aClass1_Sub3_Sub2_Sub3_13 = null;
			this.aClass1_Sub3_Sub2_Sub3_14 = null;
			this.aClass1_Sub3_Sub2_Sub3_15 = null;
			this.aClass1_Sub3_Sub2_Sub3_1 = null;
			this.aClass1_Sub3_Sub2_Sub3_2 = null;
			this.aClass1_Sub3_Sub2_Sub3_3 = null;
			this.aClass1_Sub3_Sub2_Sub3_4 = null;
			this.aClass1_Sub3_Sub2_Sub3_5 = null;
			this.aClass1_Sub3_Sub2_Sub2_11 = null;
			this.aClass1_Sub3_Sub2_Sub2Array3 = null;
			this.aClass1_Sub3_Sub2_Sub2Array6 = null;
			this.aClass1_Sub3_Sub2_Sub2Array5 = null;
			this.aClass1_Sub3_Sub2_Sub2_7 = null;
			this.aClass1_Sub3_Sub2_Sub2_8 = null;
			this.aClass1_Sub3_Sub2_Sub2_9 = null;
			this.aClass1_Sub3_Sub2_Sub2_10 = null;
			this.aClass1_Sub3_Sub2_Sub3Array1 = null;
			this.aClass1_Sub3_Sub2_Sub2Array7 = null;
			this.anIntArrayArray3 = null;
			this.aClass1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray30 = null;
			this.anIntArray31 = null;
			this.aClass1_Sub3_Sub3Array1 = null;
			this.anIntArray70 = null;
			this.aClass1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray36 = null;
			this.aClass28ArrayArrayArray1 = null;
			this.aClass28_2 = null;
			this.aClass28_5 = null;
			this.aClass28_3 = null;
			this.aClass28_4 = null;
			this.aClass28_1 = null;
			this.anIntArray85 = null;
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
			this.aStringArray8 = null;
			this.anIntArray35 = null;
			this.anIntArray56 = null;
			this.anIntArray57 = null;
			this.aClass1_Sub3_Sub2_Sub2Array4 = null;
			this.aClass1_Sub3_Sub2_Sub2_6 = null;
			this.aStringArray6 = null;
			this.aLongArray4 = null;
			this.anIntArray34 = null;
			this.aClass32_6 = null;
			this.aClass32_7 = null;
			this.aClass32_3 = null;
			this.aClass32_4 = null;
			this.aClass32_5 = null;
			this.aClass32_8 = null;
			this.aClass32_9 = null;
			this.aClass32_10 = null;
			this.aClass32_11 = null;
			this.method76();
			Class2.method22(this.aBoolean43);
			Class3.method31(this.aBoolean43);
			Class5.method53(this.aBoolean43);
			Class11.aClass11Array1 = null;
			Class13.aClass13Array1 = null;
			Class15.aClass15Array1 = null;
			Class17.aClass17Array1 = null;
			Class19.aClass19Array1 = null;
			Class21.aClass21Array1 = null;
			Class21.aClass35_8 = null;
			Class23.aClass23Array1 = null;
			super.aClass32_2 = null;
			Class1_Sub1_Sub3_Sub2.aClass35_9 = null;
			Class1_Sub3_Sub2_Sub1.method274(this.aBoolean43);
			Class33.method447(this.aBoolean43);
			Class1_Sub3_Sub1.method212(this.aBoolean43);
			Class10.aClass10Array1 = null;
			Class12.aClass12Array1 = null;
			System.gc();
		} catch (@Pc(364) RuntimeException local364) {
			signlink.reporterror("37275, " + -742 + ", " + local364.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method72(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("12139, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
