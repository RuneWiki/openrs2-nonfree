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

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private static int anInt157;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private static int anInt164;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private static int anInt197;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private static int anInt198;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private static int anInt200;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private static int anInt229;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private static int anInt241;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private static int anInt244;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private static int anInt245;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private static int anInt246;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private static int anInt262;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private static int anInt273;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	public static int anInt280;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private static int anInt293;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private static int anInt303;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private static int anInt316;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
	private static boolean aBoolean68;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private static int anInt342;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "B")
	private static byte aByte12 = 7;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private static int[] anIntArray44 = new int[99];

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private static int anInt213;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "B")
	private static byte aByte14;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private static int anInt243;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private static boolean aBoolean50;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private static int anInt276;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	public static final int[] anIntArray84;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!qb;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!qb;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!qb;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!qb;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!qb;")
	private Class32 aClass32_7;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!qb;")
	private Class32 aClass32_8;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!qb;")
	private Class32 aClass32_9;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!qb;")
	private Class32 aClass32_10;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!qb;")
	private Class32 aClass32_11;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!qb;")
	private Class32 aClass32_12;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!ub;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!qb;")
	private Class32 aClass32_13;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!qb;")
	private Class32 aClass32_14;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Lclient!qb;")
	private Class32 aClass32_15;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!r;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!tb;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!qb;")
	private Class32 aClass32_16;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!qb;")
	private Class32 aClass32_17;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!qb;")
	private Class32 aClass32_18;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!qb;")
	private Class32 aClass32_19;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Lclient!d;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!z;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Lclient!qb;")
	private Class32 aClass32_20;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Lclient!qb;")
	private Class32 aClass32_21;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Lclient!qb;")
	private Class32 aClass32_22;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Lclient!qb;")
	private Class32 aClass32_23;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Lclient!qb;")
	private Class32 aClass32_24;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!qb;")
	private Class32 aClass32_25;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!qb;")
	private Class32 aClass32_26;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Lclient!qb;")
	private Class32 aClass32_27;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Lclient!qb;")
	private Class32 aClass32_28;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "F", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "G", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "H", descriptor = "[I")
	private int[] anIntArray30 = new int[5];

	@OriginalMember(owner = "client!client", name = "J", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array1 = new Class1_Sub3_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray31 = new int[50];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!hc;")
	private Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray32 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "B")
	private byte aByte13 = 31;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt158 = -1;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
	private boolean aBoolean37 = true;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array2 = new Class1_Sub3_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt168 = 50;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	private int[] anIntArray33 = new int[this.anInt168];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
	private int[] anIntArray34 = new int[this.anInt168];

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
	private int[] anIntArray35 = new int[this.anInt168];

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[I")
	private int[] anIntArray36 = new int[this.anInt168];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[I")
	private int[] anIntArray37 = new int[this.anInt168];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray38 = new int[this.anInt168];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray39 = new int[this.anInt168];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[this.anInt168];

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Lclient!ob;")
	private Class28 aClass28_1 = new Class28((byte) 30);

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt177 = -1;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt179 = 1;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
	private boolean aBoolean38 = true;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray40 = new int[2000];

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt191 = -142;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
	private int[] anIntArray41 = new int[5];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private final int[] anIntArray42 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[I")
	private int[] anIntArray43 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt196 = -1;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[500];

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt209 = 78;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt211 = 1;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!ob;")
	private Class28 aClass28_2 = new Class28((byte) 30);

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array3 = new Class1_Sub3_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray46 = new int[256];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[B")
	private byte[] aByteArray4 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt215 = 732;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt216 = -1;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt217 = -1;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray48 = new int[50];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray49 = new int[50];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private final int anInt222 = 100;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray50 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt231 = 3;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt232 = 9;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt234 = 2301979;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt240 = 3353893;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
	private int[] anIntArray53 = new int[100];

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt248 = -1;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "[Lclient!y;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array1 = new Class1_Sub1_Sub3_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
	private int[] anIntArray54 = new int[8192];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt252 = -25272;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array4 = new Class1_Sub3_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt253 = 63;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	private int[] anIntArray55 = new int[1000];

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt260 = 7759444;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray56 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array5 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "af", descriptor = "B")
	private byte aByte15 = 7;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "B")
	private byte aByte16 = 80;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt266 = 2;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "B")
	private byte aByte17 = 112;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt268 = 128;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray61 = new int[50];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "B")
	private byte aByte18 = 6;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt274 = -1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt281 = -1;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Lclient!ob;")
	private Class28 aClass28_3 = new Class28((byte) 30);

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_4 = Class1_Sub3_Sub3.method378();

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt284 = 2048;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt285 = 2047;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array1 = new Class1_Sub1_Sub3_Sub2[this.anInt284];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray62 = new int[this.anInt284];

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
	private int[] anIntArray63 = new int[this.anInt284];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[Lclient!kb;")
	private Class1_Sub3_Sub3[] aClass1_Sub3_Sub3Array1 = new Class1_Sub3_Sub3[this.anInt284];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt289 = 2;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
	private int[] anIntArray64 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[I")
	private int[] anIntArray65 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray66 = new int[9];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Z")
	private boolean aBoolean60 = true;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray67 = new int[50];

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array6 = new Class1_Sub3_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray68 = new int[50];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray69 = new int[100];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray70 = new int[5];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray73 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
	private int[] anIntArray74 = new int[5];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[[[Lclient!ob;")
	private Class28[][][] aClass28ArrayArrayArray1 = new Class28[4][104][104];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "B")
	private byte aByte19 = 25;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[I")
	private int[] anIntArray75 = new int[33];

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
	private boolean aBoolean62 = true;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "B")
	private byte aByte20 = 5;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_5 = Class1_Sub3_Sub3.method378();

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "B")
	private byte aByte21 = 6;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt310 = 24924;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
	private int[] anIntArray76 = new int[7];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_6 = Class1_Sub3_Sub3.method378();

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt314 = 2;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array7 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray77 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[I")
	private int[] anIntArray78 = new int[500];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
	private int[] anIntArray79 = new int[500];

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "[I")
	private int[] anIntArray80 = new int[500];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Ljava/lang/Object;")
	private Object anObject1 = new Object();

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "B")
	private byte aByte22 = 62;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt318 = -1;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt319 = -1;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt322 = -1;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "[Z")
	private boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt323 = -1910;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt329 = -1;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray81 = new int[1000];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[I")
	private int[] anIntArray82 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "[I")
	private int[] anIntArray83 = new int[151];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "B")
	private byte aByte23 = 96;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt337 = 222;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[Lclient!ec;")
	private Class9[] aClass9Array1 = new Class9[4];

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt338 = 9;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray85 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!ob;")
	private Class28 aClass28_4 = new Class28((byte) 30);

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt340 = 5063219;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!ob;")
	private Class28 aClass28_5 = new Class28((byte) 30);

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private boolean aBoolean73 = false;

	static {
		@Pc(266) int local266 = 0;
		for (@Pc(268) int local268 = 0; local268 < 99; local268++) {
			@Pc(273) int local273 = local268 + 1;
			@Pc(286) int local286 = (int) ((double) local273 + Math.pow(2.0D, (double) local273 / 7.0D) * 300.0D);
			local266 += local286;
			anIntArray44[local268] = local266 / 4;
		}
		anInt213 = 721;
		aByte14 = 21;
		anInt243 = 10;
		aBoolean50 = true;
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt276 = -638;
		aString16 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArray84 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) String local8 = String.valueOf(arg1);
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
			signlink.reporterror("81902, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method112(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("8232, " + arg0 + ", " + -75 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 222);
			if (arg0.length == 4) {
				anInt243 = Integer.parseInt(arg0[0]);
				anInt244 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method183();
				} else if (arg0[2].equals("highmem")) {
					method133();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean50 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean50 = true;
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

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private static void method133() {
		try {
			Class33.aBoolean143 = false;
			Class1_Sub3_Sub2_Sub1.aBoolean98 = false;
			aBoolean51 = false;
			Class4.aBoolean22 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("87056, " + 3161 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("52184, " + -653 + ", " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private static void method183() {
		try {
			Class33.aBoolean143 = true;
			Class1_Sub3_Sub2_Sub1.aBoolean98 = true;
			aBoolean51 = true;
			Class4.aBoolean22 = true;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("183, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!hc;II)V")
	private void method75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2.anInt466 == 0 && arg2.anIntArray153 != null && (!arg2.aBoolean109 || this.anInt218 == arg2.anInt464 || this.anInt290 == arg2.anInt464 || this.anInt312 == arg2.anInt464)) {
				@Pc(29) int local29 = Class1_Sub3_Sub2.anInt528;
				@Pc(31) int local31 = Class1_Sub3_Sub2.anInt526;
				@Pc(33) int local33 = Class1_Sub3_Sub2.anInt529;
				@Pc(35) int local35 = Class1_Sub3_Sub2.anInt527;
				Class1_Sub3_Sub2.method356(arg1, arg1 + arg2.anInt469, arg3 + arg2.anInt470, arg3);
				@Pc(51) int local51 = arg2.anIntArray153.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray154[local53] + arg1;
					@Pc(71) int local71 = arg2.anIntArray155[local53] + arg3 - arg0;
					@Pc(78) Class15 local78 = Class15.aClass15Array1[arg2.anIntArray153[local53]];
					@Pc(83) int local83 = local62 + local78.anInt471;
					@Pc(88) int local88 = local71 + local78.anInt472;
					if (local78.anInt468 > 0) {
						this.method130(local78);
					}
					if (local78.anInt466 == 0) {
						if (local78.anInt475 > local78.anInt474 - local78.anInt470) {
							local78.anInt475 = local78.anInt474 - local78.anInt470;
						}
						if (local78.anInt475 < 0) {
							local78.anInt475 = 0;
						}
						this.method75(local78.anInt475, local83, local78, local88);
						if (local78.anInt474 > local78.anInt470) {
							this.method107(local78.anInt474, local88, local78.anInt470, local78.anInt475, local83 + local78.anInt469);
						}
					} else if (local78.anInt466 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(158) int local158;
						@Pc(184) int local184;
						@Pc(208) int local208;
						if (local78.anInt466 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local78.anInt470; local160++) {
								for (local164 = 0; local164 < local78.anInt469; local164++) {
									local175 = local83 + local164 * (local78.anInt477 + 32);
									local184 = local88 + local160 * (local78.anInt478 + 32);
									if (local158 < 20) {
										local175 += local78.anIntArray156[local158];
										local184 += local78.anIntArray157[local158];
									}
									if (local78.anIntArray149[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local78.anIntArray149[local158] - 1;
										if (local175 >= -32 && local175 <= 512 && local184 >= -32 && local184 <= 334 || this.anInt174 != 0 && this.anInt173 == local158) {
											@Pc(244) Class1_Sub3_Sub2_Sub2 local244 = Class5.method59(local217, local78.anIntArray150[local158]);
											if (this.anInt174 != 0 && this.anInt173 == local158 && this.anInt172 == local78.anInt464) {
												local208 = super.anInt138 - this.anInt175;
												local210 = super.anInt139 - this.anInt176;
												if (local208 < 5 && local208 > -5) {
													local208 = 0;
												}
												if (local210 < 5 && local210 > -5) {
													local210 = 0;
												}
												if (this.anInt171 < 5) {
													local208 = 0;
													local210 = 0;
												}
												local244.method326(local175 + local208, local184 + local210);
											} else if (this.anInt336 != 0 && this.anInt335 == local158 && this.anInt334 == local78.anInt464) {
												local244.method326(local175, local184);
											} else {
												local244.method322(local184, local175);
											}
											if (local244.anInt460 == 33 || local78.anIntArray150[local158] != 1) {
												@Pc(344) int local344 = local78.anIntArray150[local158];
												this.aClass1_Sub3_Sub2_Sub4_1.method365(local184 + local210 + 10, method112(local344), 0, local175 + local208 + 1);
												this.aClass1_Sub3_Sub2_Sub4_1.method365(local184 + local210 + 9, method112(local344), 16776960, local175 + local208);
											}
										}
									} else if (local78.aClass1_Sub3_Sub2_Sub2Array8 != null && local158 < 20) {
										@Pc(391) Class1_Sub3_Sub2_Sub2 local391 = local78.aClass1_Sub3_Sub2_Sub2Array8[local158];
										if (local391 != null) {
											local391.method322(local184, local175);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt466 != 3) {
							@Pc(449) Class1_Sub3_Sub2_Sub4 local449;
							if (local78.anInt466 == 4) {
								local449 = local78.aClass1_Sub3_Sub2_Sub4_5;
								local160 = local78.anInt479;
								@Pc(455) String local455 = local78.aString20;
								if ((this.anInt312 == local78.anInt464 || this.anInt290 == local78.anInt464 || this.anInt218 == local78.anInt464) && local78.anInt481 != 0) {
									local160 = local78.anInt481;
								}
								if (this.method167(local78)) {
									local160 = local78.anInt480;
									if (local78.aString21.length() > 0) {
										local455 = local78.aString21;
									}
								}
								if (local78.anInt467 == 6 && this.aBoolean67) {
									local455 = "Please wait...";
									local160 = local78.anInt479;
								}
								local184 = local88 + local449.anInt535;
								while (local455.length() > 0) {
									if (local455.indexOf("%") != -1) {
										label260: while (true) {
											local208 = local455.indexOf("%1");
											if (local208 == -1) {
												while (true) {
													local208 = local455.indexOf("%2");
													if (local208 == -1) {
														while (true) {
															local208 = local455.indexOf("%3");
															if (local208 == -1) {
																while (true) {
																	local208 = local455.indexOf("%4");
																	if (local208 == -1) {
																		while (true) {
																			local208 = local455.indexOf("%5");
																			if (local208 == -1) {
																				break label260;
																			}
																			local455 = local455.substring(0, local208) + this.method164(this.method170(local78, 4)) + local455.substring(local208 + 2);
																		}
																	}
																	local455 = local455.substring(0, local208) + this.method164(this.method170(local78, 3)) + local455.substring(local208 + 2);
																}
															}
															local455 = local455.substring(0, local208) + this.method164(this.method170(local78, 2)) + local455.substring(local208 + 2);
														}
													}
													local455 = local455.substring(0, local208) + this.method164(this.method170(local78, 1)) + local455.substring(local208 + 2);
												}
											}
											local455 = local455.substring(0, local208) + this.method164(this.method170(local78, 0)) + local455.substring(local208 + 2);
										}
									}
									local208 = local455.indexOf("\\n");
									@Pc(697) String local697;
									if (local208 == -1) {
										local697 = local455;
										local455 = "";
									} else {
										local697 = local455.substring(0, local208);
										local455 = local455.substring(local208 + 2);
									}
									if (local78.aBoolean115) {
										local449.method363(local697, local78.aBoolean116, local160, local83 + local78.anInt469 / 2, local184);
									} else {
										local449.method367(local184, local83, local78.aBoolean116, local160, local697);
									}
									local184 += local449.anInt535;
								}
							} else if (local78.anInt466 == 5) {
								@Pc(759) Class1_Sub3_Sub2_Sub2 local759;
								if (this.method167(local78)) {
									local759 = local78.aClass1_Sub3_Sub2_Sub2_13;
								} else {
									local759 = local78.aClass1_Sub3_Sub2_Sub2_12;
								}
								if (local759 != null) {
									local759.method322(local88, local83);
								}
							} else if (local78.anInt466 == 6) {
								local158 = Class1_Sub3_Sub2_Sub1.anInt426;
								local160 = Class1_Sub3_Sub2_Sub1.anInt427;
								Class1_Sub3_Sub2_Sub1.anInt426 = local83 + local78.anInt469 / 2;
								Class1_Sub3_Sub2_Sub1.anInt427 = local88 + local78.anInt470 / 2;
								local164 = Class1_Sub3_Sub2_Sub1.anIntArray137[local78.anInt485] * local78.anInt484 >> 16;
								local175 = Class1_Sub3_Sub2_Sub1.anIntArray138[local78.anInt485] * local78.anInt484 >> 16;
								@Pc(820) boolean local820 = this.method167(local78);
								if (local820) {
									local208 = local78.anInt483;
								} else {
									local208 = local78.anInt482;
								}
								@Pc(839) Class1_Sub3_Sub1 local839;
								if (local208 == -1) {
									local839 = local78.method332(-1, -1, local820);
								} else {
									@Pc(845) Class19 local845 = Class19.aClass19Array1[local208];
									local839 = local78.method332(local845.anIntArray186[local78.anInt462], local845.anIntArray187[local78.anInt462], local820);
								}
								if (local839 != null) {
									local839.method243(local78.anInt486, 0, local78.anInt485, 0, local164, local175);
								}
								Class1_Sub3_Sub2_Sub1.anInt426 = local158;
								Class1_Sub3_Sub2_Sub1.anInt427 = local160;
							} else if (local78.anInt466 == 7) {
								local449 = local78.aClass1_Sub3_Sub2_Sub4_5;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt470; local164++) {
									for (local175 = 0; local175 < local78.anInt469; local175++) {
										if (local78.anIntArray149[local160] > 0) {
											@Pc(908) Class5 local908 = Class5.method54(local78.anIntArray149[local160] - 1);
											@Pc(911) String local911 = local908.aString3;
											if (local908.aBoolean29 || local78.anIntArray150[local160] != 1) {
												local911 = local911 + " x" + method102(721, local78.anIntArray150[local160]);
											}
											local210 = local83 + local175 * (local78.anInt477 + 115);
											local217 = local88 + local164 * (local78.anInt478 + 12);
											if (local78.aBoolean115) {
												local449.method363(local911, local78.aBoolean116, local78.anInt479, local210 + local78.anInt469 / 2, local217);
											} else {
												local449.method367(local217, local210, local78.aBoolean116, local78.anInt479, local911);
											}
										}
										local160++;
									}
								}
							}
						} else if (local78.aBoolean114) {
							Class1_Sub3_Sub2.method358(local88, local78.anInt469, local83, local78.anInt470, local78.anInt479);
						} else {
							Class1_Sub3_Sub2.method359(local78.anInt469, local78.anInt470, local88, local83, local78.anInt479);
						}
					}
				}
				Class1_Sub3_Sub2.method356(local29, local33, local35, local31);
			}
		} catch (@Pc(1012) RuntimeException local1012) {
			signlink.reporterror("98190, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local1012.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;I)V")
	private void method76(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method401();
			@Pc(9) int local9 = arg0.method402(8);
			@Pc(15) int local15;
			if (local9 < this.anInt249) {
				for (local15 = local9; local15 < this.anInt249; local15++) {
					this.anIntArray55[this.anInt254++] = this.anIntArray54[local15];
				}
			}
			if (local9 > this.anInt249) {
				signlink.reporterror(this.aString10 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt249 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(67) int local67 = this.anIntArray54[local15];
				@Pc(72) Class1_Sub1_Sub3_Sub1 local72 = this.aClass1_Sub1_Sub3_Sub1Array1[local67];
				@Pc(77) int local77 = arg0.method402(1);
				if (local77 == 0) {
					this.anIntArray54[this.anInt249++] = local67;
					local72.anInt932 = anInt280;
				} else {
					@Pc(100) int local100 = arg0.method402(2);
					if (local100 == 0) {
						this.anIntArray54[this.anInt249++] = local67;
						local72.anInt932 = anInt280;
						this.anIntArray63[this.anInt287++] = local67;
					} else {
						@Pc(151) int local151;
						@Pc(161) int local161;
						if (local100 == 1) {
							this.anIntArray54[this.anInt249++] = local67;
							local72.anInt932 = anInt280;
							local151 = arg0.method402(3);
							local72.method570(local151, false);
							local161 = arg0.method402(1);
							if (local161 == 1) {
								this.anIntArray63[this.anInt287++] = local67;
							}
						} else if (local100 == 2) {
							this.anIntArray54[this.anInt249++] = local67;
							local72.anInt932 = anInt280;
							local151 = arg0.method402(3);
							local72.method570(local151, true);
							local161 = arg0.method402(3);
							local72.method570(local161, true);
							@Pc(219) int local219 = arg0.method402(1);
							if (local219 == 1) {
								this.anIntArray63[this.anInt287++] = local67;
							}
						} else if (local100 == 3) {
							this.anIntArray55[this.anInt254++] = local67;
						}
					}
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("96725, " + -186 + ", " + arg0 + ", " + arg1 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method77() {
		try {
			if (this.anInt190 >= 2 || this.anInt297 != 0 || this.anInt160 != 0) {
				@Pc(38) String local38;
				if (this.anInt297 == 1 && this.anInt190 < 2) {
					local38 = "Use " + this.aString17 + " with...";
				} else if (this.anInt160 == 1 && this.anInt190 < 2) {
					local38 = this.aString6 + "...";
				} else {
					local38 = this.aStringArray6[this.anInt190 - 1];
				}
				if (this.anInt190 > 2) {
					local38 = local38 + "@whi@ / " + (this.anInt190 - 2) + " more options";
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method368(15, 16777215, local38, anInt280 / 1000, 4);
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("59202, " + -275 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method78(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(16) int local16 = 0; local16 < this.anInt208; local16++) {
					if (this.aLongArray4[local16] == arg0) {
						this.anInt208--;
						this.aBoolean34 = true;
						for (@Pc(36) int local36 = local16; local36 < this.anInt208; local36++) {
							this.aStringArray7[local36] = this.aStringArray7[local36 + 1];
							this.anIntArray69[local36] = this.anIntArray69[local36 + 1];
							this.aLongArray4[local36] = this.aLongArray4[local36 + 1];
						}
						this.aClass1_Sub3_Sub3_5.method380(11);
						this.aClass1_Sub3_Sub3_5.method387(arg0);
						return;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("59210, " + arg0 + ", " + 88 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
				if (this.aStringArray9[local7] != null) {
					@Pc(19) int local19 = this.anIntArray53[local7];
					@Pc(30) int local30 = this.anInt163 + 70 + 4 - local1 * 14;
					if (local30 < -20) {
						break;
					}
					if (local19 == 0) {
						local1++;
					}
					if ((local19 == 1 || local19 == 2) && (local19 == 1 || this.anInt339 == 0 || this.anInt339 == 1 && this.method174(this.aStringArray8[local7]))) {
						if (arg2 > local30 - 14 && arg2 <= local30 && !this.aStringArray8[local7].equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
							if (this.aBoolean64) {
								this.aStringArray6[this.anInt190] = "Report abuse @whi@" + this.aStringArray8[local7];
								this.anIntArray79[this.anInt190] = 34;
								this.anInt190++;
							}
							this.aStringArray6[this.anInt190] = "Add ignore @whi@" + this.aStringArray8[local7];
							this.anIntArray79[this.anInt190] = 436;
							this.anInt190++;
							this.aStringArray6[this.anInt190] = "Add friend @whi@" + this.aStringArray8[local7];
							this.anIntArray79[this.anInt190] = 406;
							this.anInt190++;
						}
						local1++;
					}
					if ((local19 == 3 || local19 == 7) && this.anInt296 == 0 && (local19 == 7 || this.anInt155 == 0 || this.anInt155 == 1 && this.method174(this.aStringArray8[local7]))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							if (this.aBoolean64) {
								this.aStringArray6[this.anInt190] = "Report abuse @whi@" + this.aStringArray8[local7];
								this.anIntArray79[this.anInt190] = 34;
								this.anInt190++;
							}
							this.aStringArray6[this.anInt190] = "Add ignore @whi@" + this.aStringArray8[local7];
							this.anIntArray79[this.anInt190] = 436;
							this.anInt190++;
							this.aStringArray6[this.anInt190] = "Add friend @whi@" + this.aStringArray8[local7];
							this.anIntArray79[this.anInt190] = 406;
							this.anInt190++;
						}
						local1++;
					}
					if (local19 == 4 && (this.anInt230 == 0 || this.anInt230 == 1 && this.method174(this.aStringArray8[local7]))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray6[this.anInt190] = "Accept trade @whi@" + this.aStringArray8[local7];
							this.anIntArray79[this.anInt190] = 903;
							this.anInt190++;
						}
						local1++;
					}
					if ((local19 == 5 || local19 == 6) && this.anInt296 == 0 && this.anInt155 < 2) {
						local1++;
					}
					if (local19 == 8 && (this.anInt230 == 0 || this.anInt230 == 1 && this.method174(this.aStringArray8[local7]))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray6[this.anInt190] = "Accept duel @whi@" + this.aStringArray8[local7];
							this.anIntArray79[this.anInt190] = 363;
							this.anInt190++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("79265, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method80() {
		try {
			if (super.anInt140 == 1) {
				if (super.anInt141 >= 8 && super.anInt141 <= 108 && super.anInt142 >= 490 && super.anInt142 <= 522) {
					this.anInt339 = (this.anInt339 + 1) % 4;
					this.aBoolean61 = true;
					this.aBoolean41 = true;
					this.aClass1_Sub3_Sub3_5.method380(244);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt339);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt155);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt230);
				}
				if (super.anInt141 >= 137 && super.anInt141 <= 237 && super.anInt142 >= 490 && super.anInt142 <= 522) {
					this.anInt155 = (this.anInt155 + 1) % 3;
					this.aBoolean61 = true;
					this.aBoolean41 = true;
					this.aClass1_Sub3_Sub3_5.method380(244);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt339);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt155);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt230);
				}
				if (super.anInt141 >= 275 && super.anInt141 <= 375 && super.anInt142 >= 490 && super.anInt142 <= 522) {
					this.anInt230 = (this.anInt230 + 1) % 3;
					this.aBoolean61 = true;
					this.aBoolean41 = true;
					this.aClass1_Sub3_Sub3_5.method380(244);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt339);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt155);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt230);
				}
				if (super.anInt141 >= 416 && super.anInt141 <= 516 && super.anInt142 >= 490 && super.anInt142 <= 522) {
					this.method126(this.anInt337);
					this.aString13 = "";
					this.aBoolean44 = false;
					for (@Pc(187) int local187 = 0; local187 < Class15.aClass15Array1.length; local187++) {
						if (Class15.aClass15Array1[local187] != null && Class15.aClass15Array1[local187].anInt468 == 600) {
							this.anInt319 = this.anInt158 = Class15.aClass15Array1[local187].anInt465;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("39207, " + -692 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method81(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt261 >= 100) {
					this.method83("Your ignore list is full. Max of 100 hit", this.aByte23, "", 0);
				} else {
					@Pc(24) String local24 = Class40.method542(Class40.method539(arg0));
					for (@Pc(32) int local32 = 0; local32 < this.anInt261; local32++) {
						if (this.aLongArray3[local32] == arg0) {
							this.method83(local24 + " is already on your ignore list", this.aByte23, "", 0);
							return;
						}
					}
					for (@Pc(63) int local63 = 0; local63 < this.anInt208; local63++) {
						if (this.aLongArray4[local63] == arg0) {
							this.method83("Please remove " + local24 + " from your friend list first", this.aByte23, "", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt261++] = arg0;
					this.aBoolean34 = true;
					this.aClass1_Sub3_Sub3_5.method380(79);
					this.aClass1_Sub3_Sub3_5.method387(arg0);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("63243, " + -811 + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method82() {
		try {
			@Pc(4) Graphics local4 = this.method72().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 789, 532);
			this.method65();
			@Pc(46) byte local46;
			@Pc(52) int local52;
			if (this.aBoolean46) {
				this.aBoolean48 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local46 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local52 = local46 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(61) int local61 = local52 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(78) int local78 = local61 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(84) int local84 = local78 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(90) int local90 = local84 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(96) int local96 = local90 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean42) {
				this.aBoolean48 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean69) {
				this.aBoolean48 = false;
				local4.setColor(Color.yellow);
				local46 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local52 = local46 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local52 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local52 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local52 += 30;
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("79574, " + -575 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
	private void method83(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0 && this.anInt329 != -1) {
				this.aString14 = arg0;
				super.anInt140 = 0;
			}
			if (this.anInt196 == -1) {
				this.aBoolean41 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray53[local20] = this.anIntArray53[local20 - 1];
				this.aStringArray8[local20] = this.aStringArray8[local20 - 1];
				this.aStringArray9[local20] = this.aStringArray9[local20 - 1];
			}
			this.anIntArray53[0] = arg3;
			this.aStringArray8[0] = arg2;
			this.aStringArray9[0] = arg0;
			if (arg1 != 96) {
				this.anInt191 = -465;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("78925, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method84() {
		try {
			if (this.anInt174 == 0) {
				this.aStringArray6[0] = "Cancel";
				this.anIntArray79[0] = 1252;
				this.anInt190 = 1;
				this.method110(super.anInt139, super.anInt138);
				this.anInt166 = 0;
				if (super.anInt138 > 8 && super.anInt139 > 11 && super.anInt138 < 520 && super.anInt139 < 345) {
					if (this.anInt158 == -1) {
						this.method142(this.anInt201);
					} else {
						this.method163(8, 0, 11, super.anInt139, super.anInt138, Class15.aClass15Array1[this.anInt158]);
					}
				}
				if (this.anInt166 != this.anInt218) {
					this.anInt218 = this.anInt166;
				}
				this.anInt166 = 0;
				if (super.anInt138 > 562 && super.anInt139 > 231 && super.anInt138 < 752 && super.anInt139 < 492) {
					if (this.anInt322 != -1) {
						this.method163(562, 0, 231, super.anInt139, super.anInt138, Class15.aClass15Array1[this.anInt322]);
					} else if (this.anIntArray32[this.anInt231] != -1) {
						this.method163(562, 0, 231, super.anInt139, super.anInt138, Class15.aClass15Array1[this.anIntArray32[this.anInt231]]);
					}
				}
				if (this.anInt166 != this.anInt290) {
					this.aBoolean34 = true;
					this.anInt290 = this.anInt166;
				}
				this.anInt166 = 0;
				if (super.anInt138 > 22 && super.anInt139 > 375 && super.anInt138 < 431 && super.anInt139 < 471) {
					if (this.anInt196 == -1) {
						this.method79(94, super.anInt138 - 22, super.anInt139 - 375);
					} else {
						this.method163(22, 0, 375, super.anInt139, super.anInt138, Class15.aClass15Array1[this.anInt196]);
					}
				}
				if (this.anInt196 != -1 && this.anInt166 != this.anInt312) {
					this.aBoolean41 = true;
					this.anInt312 = this.anInt166;
				}
				@Pc(220) boolean local220 = false;
				while (!local220) {
					local220 = true;
					for (@Pc(233) int local233 = 0; local233 < this.anInt190 - 1; local233++) {
						if (this.anIntArray79[local233] < 1000 && this.anIntArray79[local233 + 1] > 1000) {
							@Pc(254) String local254 = this.aStringArray6[local233];
							this.aStringArray6[local233] = this.aStringArray6[local233 + 1];
							this.aStringArray6[local233 + 1] = local254;
							@Pc(276) int local276 = this.anIntArray79[local233];
							this.anIntArray79[local233] = this.anIntArray79[local233 + 1];
							this.anIntArray79[local233 + 1] = local276;
							@Pc(298) int local298 = this.anIntArray77[local233];
							this.anIntArray77[local233] = this.anIntArray77[local233 + 1];
							this.anIntArray77[local233 + 1] = local298;
							@Pc(320) int local320 = this.anIntArray78[local233];
							this.anIntArray78[local233] = this.anIntArray78[local233 + 1];
							this.anIntArray78[local233 + 1] = local320;
							@Pc(342) int local342 = this.anIntArray80[local233];
							this.anIntArray80[local233] = this.anIntArray80[local233 + 1];
							this.anIntArray80[local233 + 1] = local342;
							local220 = false;
						}
					}
				}
			}
		} catch (@Pc(372) RuntimeException local372) {
			signlink.reporterror("79242, " + 783 + ", " + local372.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method85() {
		try {
			@Pc(8) byte[] local8 = this.aClass39_1.method536(null, "title.dat");
			@Pc(14) Class1_Sub3_Sub2_Sub2 local14 = new Class1_Sub3_Sub2_Sub2(local8, this);
			this.aClass32_23.method463();
			local14.method320(0, 0);
			this.aClass32_24.method463();
			local14.method320(-661, 0);
			this.aClass32_20.method463();
			local14.method320(-128, 0);
			this.aClass32_21.method463();
			local14.method320(-214, -386);
			this.aClass32_22.method463();
			local14.method320(-214, -186);
			this.aClass32_25.method463();
			local14.method320(0, -265);
			this.aClass32_26.method463();
			local14.method320(-574, -265);
			this.aClass32_27.method463();
			local14.method320(-128, -186);
			this.aClass32_28.method463();
			local14.method320(-574, -186);
			@Pc(105) int[] local105 = new int[local14.anInt456];
			for (@Pc(107) int local107 = 0; local107 < local14.anInt457; local107++) {
				for (@Pc(111) int local111 = 0; local111 < local14.anInt456; local111++) {
					local105[local111] = local14.anIntArray148[local14.anInt456 + local14.anInt456 * local107 - local111 - 1];
				}
				for (@Pc(137) int local137 = 0; local137 < local14.anInt456; local137++) {
					local14.anIntArray148[local137 + local14.anInt456 * local107] = local105[local137];
				}
			}
			this.aClass32_23.method463();
			local14.method320(394, 0);
			this.aClass32_24.method463();
			local14.method320(-267, 0);
			this.aClass32_20.method463();
			local14.method320(266, 0);
			this.aClass32_21.method463();
			local14.method320(180, -386);
			this.aClass32_22.method463();
			local14.method320(180, -186);
			this.aClass32_25.method463();
			local14.method320(394, -265);
			this.aClass32_26.method463();
			local14.method320(-180, -265);
			this.aClass32_27.method463();
			local14.method320(212, -186);
			this.aClass32_28.method463();
			local14.method320(-180, -186);
			local14 = new Class1_Sub3_Sub2_Sub2(this.aClass39_1, "logo", 0);
			this.aClass32_20.method463();
			local14.method322(18, super.anInt134 / 2 - local14.anInt456 / 2 - 128);
			System.gc();
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("81392, " + 24 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method86() {
		try {
			if (this.aClass32_20 == null) {
				super.aClass32_2 = null;
				this.aClass32_19 = null;
				this.aClass32_17 = null;
				this.aClass32_16 = null;
				this.aClass32_18 = null;
				this.aClass32_13 = null;
				this.aClass32_14 = null;
				this.aClass32_15 = null;
				this.aClass32_23 = new Class32(265, 128, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_24 = new Class32(265, 128, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_20 = new Class32(186, 533, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_21 = new Class32(146, 360, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_22 = new Class32(200, 360, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_25 = new Class32(267, 214, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_26 = new Class32(267, 215, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_27 = new Class32(79, 86, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_28 = new Class32(79, 87, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				if (this.aClass39_1 != null) {
					this.method85();
					this.method162();
				}
				this.aBoolean65 = true;
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("80877, " + -58 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method87(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("39932, " + arg0 + ", " + arg1 + ", " + -12770 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Z")
	private boolean method88() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("19740, " + 0 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method89(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt756 = arg0;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("62120, " + arg0 + ", " + 0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!hc;)Z")
	private boolean method90(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt468;
			if (this.aByte16 != 80) {
				this.anInt311 = this.aClass38_1.method532();
			}
			if (local4 == 201) {
				this.aBoolean41 = true;
				this.aBoolean35 = false;
				this.aBoolean56 = true;
				this.aString9 = "";
				this.anInt294 = 1;
				this.aString18 = "Enter name of friend to add to list";
			}
			if (local4 == 202) {
				this.aBoolean41 = true;
				this.aBoolean35 = false;
				this.aBoolean56 = true;
				this.aString9 = "";
				this.anInt294 = 2;
				this.aString18 = "Enter name of friend to delete from list";
			}
			if (local4 == 205) {
				this.anInt154 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean41 = true;
				this.aBoolean35 = false;
				this.aBoolean56 = true;
				this.aString9 = "";
				this.anInt294 = 4;
				this.aString18 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean41 = true;
				this.aBoolean35 = false;
				this.aBoolean56 = true;
				this.aString9 = "";
				this.anInt294 = 5;
				this.aString18 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local4 >= 300 && local4 <= 313) {
				local117 = (local4 - 300) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray76[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class13.anInt432 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class13.anInt432) {
								local126 = 0;
							}
						}
						if (!Class13.aClass13Array1[local126].aBoolean103 && Class13.aClass13Array1[local126].anInt433 == local117 + (this.aBoolean60 ? 0 : 7)) {
							this.anIntArray76[local117] = local126;
							this.aBoolean58 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local117 = (local4 - 314) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray30[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray2[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray2[local117].length) {
						local126 = 0;
					}
				}
				this.anIntArray30[local117] = local126;
				this.aBoolean58 = true;
			}
			if (local4 == 324 && !this.aBoolean60) {
				this.aBoolean60 = true;
				this.method165(this.aBoolean39);
			}
			if (local4 == 325 && this.aBoolean60) {
				this.aBoolean60 = false;
				this.method165(this.aBoolean39);
			}
			if (local4 == 326) {
				this.aClass1_Sub3_Sub3_5.method380(52);
				this.aClass1_Sub3_Sub3_5.method381(this.aBoolean60 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass1_Sub3_Sub3_5.method381(this.anIntArray76[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass1_Sub3_Sub3_5.method381(this.anIntArray30[local121]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean44 = !this.aBoolean44;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method126(this.anInt337);
				if (this.aString13.length() > 0) {
					this.aClass1_Sub3_Sub3_5.method380(190);
					this.aClass1_Sub3_Sub3_5.method387(Class40.method538(this.aString13));
					this.aClass1_Sub3_Sub3_5.method381(local4 - 601);
					this.aClass1_Sub3_Sub3_5.method381(this.aBoolean44 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("53493, " + 80 + ", " + arg0 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;B)V")
	private void method91(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			arg1.method401();
			@Pc(13) int local13 = arg1.method402(1);
			if (local13 != 0) {
				@Pc(21) int local21 = arg1.method402(2);
				if (local21 == 0) {
					this.anIntArray63[this.anInt287++] = this.anInt285;
				} else {
					@Pc(44) int local44;
					@Pc(55) int local55;
					if (local21 == 1) {
						local44 = arg1.method402(3);
						this.aClass1_Sub1_Sub3_Sub2_1.method570(local44, false);
						local55 = arg1.method402(1);
						if (local55 == 1) {
							this.anIntArray63[this.anInt287++] = this.anInt285;
						}
					} else {
						@Pc(101) int local101;
						if (local21 == 2) {
							local44 = arg1.method402(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method570(local44, true);
							local55 = arg1.method402(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method570(local55, true);
							local101 = arg1.method402(1);
							if (local101 == 1) {
								this.anIntArray63[this.anInt287++] = this.anInt285;
							}
						} else if (local21 == 3) {
							this.anInt219 = arg1.method402(2);
							local44 = arg1.method402(7);
							local55 = arg1.method402(7);
							local101 = arg1.method402(1);
							this.aClass1_Sub1_Sub3_Sub2_1.method569(local44, local101 == 1, local55);
							@Pc(158) int local158 = arg1.method402(1);
							if (local158 == 1) {
								this.anIntArray63[this.anInt287++] = this.anInt285;
							}
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("92824, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass33_1.method494(arg3, arg1, arg0);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass33_1.method498(arg3, arg1, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg2;
				if (local8 > 0) {
					local30 = arg4;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub3_Sub2_Sub2_9.anIntArray148;
				local52 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class2 local61 = Class2.method23(local58);
				if (local61.anInt50 == -1) {
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
					@Pc(71) Class1_Sub3_Sub2_Sub3 local71 = this.aClass1_Sub3_Sub2_Sub3Array1[local61.anInt50];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt45 * 4 - local71.anInt509) / 2;
						@Pc(93) int local93 = (local61.anInt46 * 4 - local71.anInt510) / 2;
						local71.method350((104 - arg0 - local61.anInt46) * 4 + local93 + 48, arg1 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass33_1.method496(arg3, arg1, arg0);
			if (local8 != 0) {
				local18 = this.aClass33_1.method498(arg3, arg1, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class2 local447 = Class2.method23(local30);
				@Pc(479) int local479;
				if (local447.anInt50 != -1) {
					@Pc(457) Class1_Sub3_Sub2_Sub3 local457 = this.aClass1_Sub3_Sub2_Sub3Array1[local447.anInt50];
					if (local457 != null) {
						local58 = (local447.anInt45 * 4 - local457.anInt509) / 2;
						local479 = (local447.anInt46 * 4 - local457.anInt510) / 2;
						local457.method350((104 - arg0 - local447.anInt46) * 4 + local479 + 48, arg1 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass1_Sub3_Sub2_Sub2_9.anIntArray148;
					local479 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			local8 = this.aClass33_1.method497(arg3, arg1, arg0);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(622) Class2 local622 = Class2.method23(local18);
				if (local622.anInt50 != -1) {
					@Pc(632) Class1_Sub3_Sub2_Sub3 local632 = this.aClass1_Sub3_Sub2_Sub3Array1[local622.anInt50];
					if (local632 != null) {
						local30 = (local622.anInt45 * 4 - local632.anInt509) / 2;
						@Pc(654) int local654 = (local622.anInt46 * 4 - local632.anInt510) / 2;
						local632.method350((104 - arg0 - local622.anInt46) * 4 + local654 + 48, arg1 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(678) RuntimeException local678) {
			signlink.reporterror("70605, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 14108 + ", " + arg3 + ", " + arg4 + ", " + local678.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method69() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method201();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass6_1 = null;
			this.method94();
			this.aBoolean63 = false;
			this.aClass1_Sub3_Sub3_5 = null;
			this.aClass1_Sub3_Sub3_4 = null;
			this.aClass1_Sub3_Sub3_6 = null;
			this.anIntArray47 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass33_1 = null;
			this.aClass9Array1 = null;
			this.anIntArrayArray5 = null;
			this.anIntArrayArray3 = null;
			this.anIntArray64 = null;
			this.anIntArray65 = null;
			this.aByteArray4 = null;
			this.aClass32_16 = null;
			this.aClass32_17 = null;
			this.aClass32_18 = null;
			this.aClass32_19 = null;
			this.aClass32_13 = null;
			this.aClass32_14 = null;
			this.aClass32_15 = null;
			this.aClass32_3 = null;
			this.aClass32_4 = null;
			this.aClass32_5 = null;
			this.aClass32_6 = null;
			this.aClass32_7 = null;
			this.aClass32_8 = null;
			this.aClass32_9 = null;
			this.aClass32_10 = null;
			this.aClass32_11 = null;
			this.aClass32_12 = null;
			this.aClass1_Sub3_Sub2_Sub3_14 = null;
			this.aClass1_Sub3_Sub2_Sub3_15 = null;
			this.aClass1_Sub3_Sub2_Sub3_16 = null;
			this.aClass1_Sub3_Sub2_Sub3_6 = null;
			this.aClass1_Sub3_Sub2_Sub3_7 = null;
			this.aClass1_Sub3_Sub2_Sub3_8 = null;
			this.aClass1_Sub3_Sub2_Sub3Array2 = null;
			this.aClass1_Sub3_Sub2_Sub3_1 = null;
			this.aClass1_Sub3_Sub2_Sub3_2 = null;
			this.aClass1_Sub3_Sub2_Sub3_3 = null;
			this.aClass1_Sub3_Sub2_Sub3_4 = null;
			this.aClass1_Sub3_Sub2_Sub3_5 = null;
			this.aClass1_Sub3_Sub2_Sub3_9 = null;
			this.aClass1_Sub3_Sub2_Sub3_10 = null;
			this.aClass1_Sub3_Sub2_Sub3_11 = null;
			this.aClass1_Sub3_Sub2_Sub3_12 = null;
			this.aClass1_Sub3_Sub2_Sub3_13 = null;
			this.aClass1_Sub3_Sub2_Sub2_5 = null;
			this.aClass1_Sub3_Sub2_Sub2Array7 = null;
			this.aClass1_Sub3_Sub2_Sub2Array5 = null;
			this.aClass1_Sub3_Sub2_Sub2Array3 = null;
			this.aClass1_Sub3_Sub2_Sub2_1 = null;
			this.aClass1_Sub3_Sub2_Sub2_2 = null;
			this.aClass1_Sub3_Sub2_Sub2_3 = null;
			this.aClass1_Sub3_Sub2_Sub2_4 = null;
			this.aClass1_Sub3_Sub2_Sub3Array1 = null;
			this.aClass1_Sub3_Sub2_Sub2Array4 = null;
			this.anIntArrayArray4 = null;
			this.aClass1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray62 = null;
			this.anIntArray63 = null;
			this.aClass1_Sub3_Sub3Array1 = null;
			this.anIntArray55 = null;
			this.aClass1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray54 = null;
			this.aClass28ArrayArrayArray1 = null;
			this.aClass28_3 = null;
			this.aClass28_5 = null;
			this.aClass28_2 = null;
			this.aClass28_1 = null;
			this.aClass28_4 = null;
			this.anIntArray77 = null;
			this.anIntArray78 = null;
			this.anIntArray79 = null;
			this.anIntArray80 = null;
			this.aStringArray6 = null;
			this.anIntArray56 = null;
			this.anIntArray81 = null;
			this.anIntArray82 = null;
			this.aClass1_Sub3_Sub2_Sub2Array6 = null;
			this.aClass1_Sub3_Sub2_Sub2_9 = null;
			this.aStringArray7 = null;
			this.aLongArray4 = null;
			this.anIntArray69 = null;
			this.aClass32_23 = null;
			this.aClass32_24 = null;
			this.aClass32_20 = null;
			this.aClass32_21 = null;
			this.aClass32_22 = null;
			this.aClass32_25 = null;
			this.aClass32_26 = null;
			this.aClass32_27 = null;
			this.aClass32_28 = null;
			this.method105();
			Class2.method22();
			Class3.method31();
			Class5.method53();
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
			Class1_Sub3_Sub2_Sub1.method287();
			Class33.method466();
			Class1_Sub3_Sub1.method224();
			Class10.aClass10Array1 = null;
			Class12.aClass12Array1 = null;
			System.gc();
		} catch (@Pc(366) RuntimeException local366) {
			signlink.reporterror("52695, " + -488 + ", " + local366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method93(@OriginalArg(0) int arg0) {
		try {
			this.method86();
			this.aClass32_22.method463();
			this.aClass1_Sub3_Sub2_Sub3_19.method350(0, 0);
			@Pc(20) boolean local20 = false;
			@Pc(29) byte local29;
			@Pc(41) int local41;
			if (this.anInt321 == 0) {
				local29 = 80;
				this.aClass1_Sub3_Sub2_Sub4_3.method363("Welcome to RuneScape", true, 16776960, 180, 80);
				local41 = local29 + 30;
				this.aClass1_Sub3_Sub2_Sub3_20.method350(100, 27);
				this.aClass1_Sub3_Sub2_Sub4_3.method363("New user", true, 16777215, 100, 125);
				this.aClass1_Sub3_Sub2_Sub3_20.method350(100, 187);
				this.aClass1_Sub3_Sub2_Sub4_3.method363("Existing User", true, 16777215, 260, 125);
			}
			if (this.anInt321 == 2) {
				local29 = 60;
				if (this.aString4.length() > 0) {
					this.aClass1_Sub3_Sub2_Sub4_3.method363(this.aString4, true, 16776960, 180, 45);
					this.aClass1_Sub3_Sub2_Sub4_3.method363(this.aString5, true, 16776960, 180, 60);
					local41 = local29 + 30;
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method363(this.aString5, true, 16776960, 180, 53);
					local41 = local29 + 30;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method367(90, 90, true, 16777215, "Username: " + this.aString10 + (this.anInt223 == 0 & anInt280 % 40 < 20 ? "@yel@|" : ""));
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method367(105, 92, true, 16777215, "Password: " + Class40.method544(this.aString11) + (this.anInt223 == 1 & anInt280 % 40 < 20 ? "@yel@|" : ""));
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub3_20.method350(130, 27);
				this.aClass1_Sub3_Sub2_Sub4_3.method363("Login", true, 16777215, 100, 155);
				this.aClass1_Sub3_Sub2_Sub3_20.method350(130, 187);
				this.aClass1_Sub3_Sub2_Sub4_3.method363("Cancel", true, 16777215, 260, 155);
			}
			if (this.anInt321 == 3) {
				this.aClass1_Sub3_Sub2_Sub4_3.method363("Create a free account", true, 16776960, 180, 40);
				local29 = 65;
				this.aClass1_Sub3_Sub2_Sub4_3.method363("To create a new account you need to", true, 16777215, 180, 65);
				local41 = local29 + 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method363("go back to the main RuneScape webpage", true, 16777215, 180, 80);
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method363("and choose the red 'create account'", true, 16777215, 180, 95);
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method363("button at the top right of that page.", true, 16777215, 180, 110);
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub3_20.method350(130, 107);
				this.aClass1_Sub3_Sub2_Sub4_3.method363("Cancel", true, 16777215, 180, 155);
			}
			this.aClass32_22.method464(super.aGraphics2, 186, 214);
			if (this.aBoolean65) {
				this.aBoolean65 = false;
				this.aClass32_20.method464(super.aGraphics2, 0, 128);
				this.aClass32_21.method464(super.aGraphics2, 386, 214);
				this.aClass32_25.method464(super.aGraphics2, 265, 0);
				this.aClass32_26.method464(super.aGraphics2, 265, 574);
				this.aClass32_27.method464(super.aGraphics2, 186, 128);
				this.aClass32_28.method464(super.aGraphics2, 186, 574);
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("5577, " + arg0 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method94() {
		try {
			signlink.anInt754 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("3867, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method95(@OriginalArg(0) int arg0) {
		try {
			this.anInt150 += 0;
			@Pc(9) Class15 local9 = Class15.aClass15Array1[arg0];
			for (@Pc(11) int local11 = 0; local11 < local9.anIntArray153.length && local9.anIntArray153[local11] != -1; local11++) {
				@Pc(26) Class15 local26 = Class15.aClass15Array1[local9.anIntArray153[local11]];
				if (local26.anInt466 == 1) {
					this.method95(local26.anInt464);
				}
				local26.anInt462 = 0;
				local26.anInt463 = 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("56623, " + arg0 + ", " + 0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZZI)V")
	private void method96(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		try {
			signlink.anInt754 = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("24762, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Ljava/lang/String;")
	private String method97() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("73381, " + 34 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method98(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("55601, " + arg0 + ", " + -10835 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method99(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.method67();
			}
			@Pc(12) int local12;
			if (this.anInt147 > 0) {
				for (local12 = 0; local12 < 256; local12++) {
					if (this.anInt147 > 768) {
						this.anIntArray57[local12] = this.method98(this.anIntArray58[local12], this.anIntArray59[local12], 1024 - this.anInt147);
					} else if (this.anInt147 > 256) {
						this.anIntArray57[local12] = this.anIntArray59[local12];
					} else {
						this.anIntArray57[local12] = this.method98(this.anIntArray59[local12], this.anIntArray58[local12], 256 - this.anInt147);
					}
				}
			} else if (this.anInt148 > 0) {
				for (local12 = 0; local12 < 256; local12++) {
					if (this.anInt148 > 768) {
						this.anIntArray57[local12] = this.method98(this.anIntArray58[local12], this.anIntArray60[local12], 1024 - this.anInt148);
					} else if (this.anInt148 > 256) {
						this.anIntArray57[local12] = this.anIntArray60[local12];
					} else {
						this.anIntArray57[local12] = this.method98(this.anIntArray60[local12], this.anIntArray58[local12], 256 - this.anInt148);
					}
				}
			} else {
				for (local12 = 0; local12 < 256; local12++) {
					this.anIntArray57[local12] = this.anIntArray58[local12];
				}
			}
			for (local12 = 0; local12 < 33920; local12++) {
				this.aClass32_23.anIntArray197[local12] = this.aClass1_Sub3_Sub2_Sub2_6.anIntArray148[local12];
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
				local202 = this.anIntArray46[local189] * (256 - local189) / 256;
				local206 = local202 + 22;
				if (local206 < 0) {
					local206 = 0;
				}
				local185 += local206;
				for (local216 = local206; local216 < 128; local216++) {
					local224 = this.anIntArray51[local185++];
					if (local224 == 0) {
						local187++;
					} else {
						local228 = local224;
						local232 = 256 - local224;
						local224 = this.anIntArray57[local224];
						local243 = this.aClass32_23.anIntArray197[local187];
						this.aClass32_23.anIntArray197[local187++] = ((local224 & 0xFF00FF) * local228 + (local243 & 0xFF00FF) * local232 & 0xFF00FF00) + ((local224 & 0xFF00) * local228 + (local243 & 0xFF00) * local232 & 0xFF0000) >> 8;
					}
				}
				local187 += local206;
			}
			this.aClass32_23.method464(super.aGraphics2, 0, 0);
			for (local202 = 0; local202 < 33920; local202++) {
				this.aClass32_24.anIntArray197[local202] = this.aClass1_Sub3_Sub2_Sub2_7.anIntArray148[local202];
			}
			local185 = 0;
			local187 = 1176;
			for (local206 = 1; local206 < 255; local206++) {
				local216 = this.anIntArray46[local206] * (256 - local206) / 256;
				local224 = 103 - local216;
				local187 += local216;
				for (local228 = 0; local228 < local224; local228++) {
					local232 = this.anIntArray51[local185++];
					if (local232 == 0) {
						local187++;
					} else {
						local243 = local232;
						@Pc(366) int local366 = 256 - local232;
						local232 = this.anIntArray57[local232];
						@Pc(377) int local377 = this.aClass32_24.anIntArray197[local187];
						this.aClass32_24.anIntArray197[local187++] = ((local232 & 0xFF00FF) * local243 + (local377 & 0xFF00FF) * local366 & 0xFF00FF00) + ((local232 & 0xFF00) * local243 + (local377 & 0xFF00) * local366 & 0xFF0000) >> 8;
					}
				}
				local185 += 128 - local224;
				local187 += 128 - local224 - local216;
			}
			this.aClass32_24.method464(super.aGraphics2, 0, 661);
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("6383, " + arg0 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method100() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt286; local3++) {
				if (local3 == -1) {
					local11 = this.anInt285;
				} else {
					local11 = this.anIntArray62[local3];
				}
				@Pc(23) Class1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null) {
					this.method153(local23, 1);
				}
			}
			anInt197++;
			if (anInt197 > 1406) {
				anInt197 = 0;
				this.aClass1_Sub3_Sub3_5.method380(219);
				this.aClass1_Sub3_Sub3_5.method381(0);
				local11 = this.aClass1_Sub3_Sub3_5.anInt554;
				this.aClass1_Sub3_Sub3_5.method381(162);
				this.aClass1_Sub3_Sub3_5.method381(22);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub3_Sub3_5.method381(84);
				}
				this.aClass1_Sub3_Sub3_5.method382(31824);
				this.aClass1_Sub3_Sub3_5.method382(13490);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub3_Sub3_5.method381(123);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub3_Sub3_5.method381(134);
				}
				this.aClass1_Sub3_Sub3_5.method381(100);
				this.aClass1_Sub3_Sub3_5.method381(94);
				this.aClass1_Sub3_Sub3_5.method382(35521);
				this.aClass1_Sub3_Sub3_5.method390(this.aClass1_Sub3_Sub3_5.anInt554 - local11);
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("31219, " + true + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method101() {
		try {
			this.method150((byte) 9);
			if (this.anInt206 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array3[this.anInt205 / 100].method322(this.anInt204 - 8 - 11, this.anInt203 - 8 - 8);
			}
			if (this.anInt206 == 2) {
				this.aClass1_Sub3_Sub2_Sub2Array3[this.anInt205 / 100 + 4].method322(this.anInt204 - 8 - 11, this.anInt203 - 8 - 8);
			}
			if (this.anInt158 != -1) {
				this.method180(this.anInt158, this.anInt320);
				this.method75(0, 0, Class15.aClass15Array1[this.anInt158], 0);
			}
			this.method190();
			if (!this.aBoolean54) {
				this.method84();
				this.method77();
			} else if (this.anInt184 == 0) {
				this.method113();
			}
			if (this.anInt317 == 1) {
				if (this.anInt159 > 0 || this.anInt214 == 1) {
					this.aClass1_Sub3_Sub2_Sub2Array5[1].method322(258, 472);
				} else {
					this.aClass1_Sub3_Sub2_Sub2Array5[1].method322(296, 472);
				}
			}
			if (this.anInt159 > 0) {
				this.aClass1_Sub3_Sub2_Sub2Array5[0].method322(296, 472);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(484, 329, "Level: " + this.anInt159, 16776960);
			}
			if (this.anInt214 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array5[6].method322(296, 472);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(484, 329, "Arena", 16776960);
			}
			if (this.anInt308 != 0) {
				@Pc(191) int local191 = this.anInt308 / 50;
				@Pc(195) int local195 = local191 / 60;
				@Pc(199) int local199 = local191 % 60;
				if (local199 < 10) {
					this.aClass1_Sub3_Sub2_Sub4_2.method365(329, "System update in: " + local195 + ":0" + local199, 16776960, 4);
				} else {
					this.aClass1_Sub3_Sub2_Sub4_2.method365(329, "System update in: " + local195 + ":" + local199, 16776960, 4);
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("28052, " + 857 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ib;I)V")
	private void method103(@OriginalArg(0) Class1_Sub3_Sub2_Sub3 arg0) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray71.length; local9++) {
				this.anIntArray71[local9] = 0;
			}
			@Pc(34) int local34;
			for (@Pc(24) int local24 = 0; local24 < 5000; local24++) {
				local34 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray71[local34] = (int) (Math.random() * 256.0D);
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			@Pc(64) int local64;
			for (local34 = 0; local34 < 20; local34++) {
				for (local52 = 1; local52 < 255; local52++) {
					for (local56 = 1; local56 < 127; local56++) {
						local64 = local56 + (local52 << 7);
						this.anIntArray72[local64] = (this.anIntArray71[local64 - 1] + this.anIntArray71[local64 + 1] + this.anIntArray71[local64 - 128] + this.anIntArray71[local64 + 128]) / 4;
					}
				}
				@Pc(110) int[] local110 = this.anIntArray71;
				this.anIntArray71 = this.anIntArray72;
				this.anIntArray72 = local110;
			}
			if (arg0 != null) {
				local52 = 0;
				for (local56 = 0; local56 < arg0.anInt510; local56++) {
					for (local64 = 0; local64 < arg0.anInt509; local64++) {
						if (arg0.aByteArray6[local52++] != 0) {
							@Pc(146) int local146 = local64 + arg0.anInt511 + 16;
							@Pc(153) int local153 = local56 + arg0.anInt512 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray71[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("41944, " + arg0 + ", " + 888 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!kb;)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			if (this.aByte22 == 62) {
				@Pc(11) int local11 = arg1.method402(8);
				@Pc(17) int local17;
				if (local11 < this.anInt286) {
					for (local17 = local11; local17 < this.anInt286; local17++) {
						this.anIntArray55[this.anInt254++] = this.anIntArray62[local17];
					}
				}
				if (local11 > this.anInt286) {
					signlink.reporterror(this.aString10 + " Too many players");
					throw new RuntimeException("eek");
				}
				this.anInt286 = 0;
				for (local17 = 0; local17 < local11; local17++) {
					@Pc(69) int local69 = this.anIntArray62[local17];
					@Pc(74) Class1_Sub1_Sub3_Sub2 local74 = this.aClass1_Sub1_Sub3_Sub2Array1[local69];
					@Pc(79) int local79 = arg1.method402(1);
					if (local79 == 0) {
						this.anIntArray62[this.anInt286++] = local69;
						local74.anInt932 = anInt280;
					} else {
						@Pc(102) int local102 = arg1.method402(2);
						if (local102 == 0) {
							this.anIntArray62[this.anInt286++] = local69;
							local74.anInt932 = anInt280;
							this.anIntArray63[this.anInt287++] = local69;
						} else {
							@Pc(153) int local153;
							@Pc(163) int local163;
							if (local102 == 1) {
								this.anIntArray62[this.anInt286++] = local69;
								local74.anInt932 = anInt280;
								local153 = arg1.method402(3);
								local74.method570(local153, false);
								local163 = arg1.method402(1);
								if (local163 == 1) {
									this.anIntArray63[this.anInt287++] = local69;
								}
							} else if (local102 == 2) {
								this.anIntArray62[this.anInt286++] = local69;
								local74.anInt932 = anInt280;
								local153 = arg1.method402(3);
								local74.method570(local153, true);
								local163 = arg1.method402(3);
								local74.method570(local163, true);
								@Pc(221) int local221 = arg1.method402(1);
								if (local221 == 1) {
									this.anIntArray63[this.anInt287++] = local69;
								}
							} else if (local102 == 3) {
								this.anIntArray55[this.anInt254++] = local69;
							}
						}
					}
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("70203, " + arg0 + ", " + 62 + ", " + arg1 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method105() {
		try {
			this.aBoolean48 = false;
			while (this.aBoolean43) {
				this.aBoolean48 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub3_Sub2_Sub3_19 = null;
			this.aClass1_Sub3_Sub2_Sub3_20 = null;
			this.aClass1_Sub3_Sub2_Sub3Array3 = null;
			this.anIntArray57 = null;
			this.anIntArray58 = null;
			this.anIntArray59 = null;
			this.anIntArray60 = null;
			this.anIntArray71 = null;
			this.anIntArray72 = null;
			this.anIntArray51 = null;
			this.anIntArray52 = null;
			this.aClass1_Sub3_Sub2_Sub2_6 = null;
			this.aClass1_Sub3_Sub2_Sub2_7 = null;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("14429, " + true + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method67() {
		if (signlink.sunjava) {
			super.anInt132 = 5;
		}
		if (!aBoolean51) {
			this.aBoolean71 = true;
			this.aBoolean63 = true;
			this.method73(this, 2);
			this.method189("scape_main", 40000, 12345678);
		}
		if (aBoolean68) {
			this.aBoolean69 = true;
			return;
		}
		aBoolean68 = true;
		@Pc(34) boolean local34 = false;
		@Pc(38) String local38 = this.method97();
		if (local38.endsWith("jagex.com")) {
			local34 = true;
		}
		if (local38.endsWith("runescape.com")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.2")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.249")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.252")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.253")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.254")) {
			local34 = true;
		}
		if (local38.endsWith("127.0.0.1")) {
			local34 = true;
		}
		if (!local34) {
			this.aBoolean42 = true;
			return;
		}
		try {
			@Pc(94) int local94 = 5;
			this.anIntArray66[8] = 0;
			while (this.anIntArray66[8] == 0) {
				this.method74("Connecting to fileserver", 10);
				try {
					@Pc(119) DataInputStream local119 = this.method139("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(126) Class1_Sub3_Sub3 local126 = new Class1_Sub3_Sub3((byte) 64, new byte[36]);
					local119.readFully(local126.aByteArray7, 0, 36);
					for (@Pc(134) int local134 = 0; local134 < 9; local134++) {
						this.anIntArray66[local134] = local126.method396();
					}
					local119.close();
				} catch (@Pc(150) IOException local150) {
					for (@Pc(152) int local152 = local94; local152 > 0; local152--) {
						this.method74("Error loading - Will retry in " + local152 + " secs.", 10);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(171) Exception local171) {
						}
					}
					local94 *= 2;
					if (local94 > 60) {
						local94 = 60;
					}
				}
			}
			this.aClass39_1 = this.method181("title", 10, this.anIntArray66[1], "title screen");
			this.aClass1_Sub3_Sub2_Sub4_1 = new Class1_Sub3_Sub2_Sub4(this.aClass39_1, 0, "p11");
			this.aClass1_Sub3_Sub2_Sub4_2 = new Class1_Sub3_Sub2_Sub4(this.aClass39_1, 0, "p12");
			this.aClass1_Sub3_Sub2_Sub4_3 = new Class1_Sub3_Sub2_Sub4(this.aClass39_1, 0, "b12");
			this.aClass1_Sub3_Sub2_Sub4_4 = new Class1_Sub3_Sub2_Sub4(this.aClass39_1, 0, "q8");
			this.method85();
			this.method162();
			@Pc(255) Class39 local255 = this.method181("config", 15, this.anIntArray66[2], "config");
			@Pc(266) Class39 local266 = this.method181("interface", 20, this.anIntArray66[3], "interface");
			@Pc(277) Class39 local277 = this.method181("media", 30, this.anIntArray66[4], "2d graphics");
			@Pc(288) Class39 local288 = this.method181("models", 40, this.anIntArray66[5], "3d graphics");
			@Pc(299) Class39 local299 = this.method181("textures", 60, this.anIntArray66[6], "textures");
			@Pc(310) Class39 local310 = this.method181("wordenc", 65, this.anIntArray66[7], "chat system");
			@Pc(321) Class39 local321 = this.method181("sounds", 70, this.anIntArray66[8], "sound effects");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass33_1 = new Class33(4, 104, this.anIntArrayArrayArray3, 104, 38656);
			for (@Pc(346) int local346 = 0; local346 < 4; local346++) {
				this.aClass9Array1[local346] = new Class9(104, 104, 4);
			}
			this.aClass1_Sub3_Sub2_Sub2_9 = new Class1_Sub3_Sub2_Sub2(512, 512);
			this.method74("Unpacking media", 75);
			this.aClass1_Sub3_Sub2_Sub3_14 = new Class1_Sub3_Sub2_Sub3(local277, "invback", 0);
			this.aClass1_Sub3_Sub2_Sub3_16 = new Class1_Sub3_Sub2_Sub3(local277, "chatback", 0);
			this.aClass1_Sub3_Sub2_Sub3_15 = new Class1_Sub3_Sub2_Sub3(local277, "mapback", 0);
			this.aClass1_Sub3_Sub2_Sub3_6 = new Class1_Sub3_Sub2_Sub3(local277, "backbase1", 0);
			this.aClass1_Sub3_Sub2_Sub3_7 = new Class1_Sub3_Sub2_Sub3(local277, "backbase2", 0);
			this.aClass1_Sub3_Sub2_Sub3_8 = new Class1_Sub3_Sub2_Sub3(local277, "backhmid1", 0);
			for (@Pc(424) int local424 = 0; local424 < 13; local424++) {
				this.aClass1_Sub3_Sub2_Sub3Array2[local424] = new Class1_Sub3_Sub2_Sub3(local277, "sideicons", local424);
			}
			this.aClass1_Sub3_Sub2_Sub2_5 = new Class1_Sub3_Sub2_Sub2(local277, "compass", 0);
			@Pc(450) int local450;
			try {
				for (local450 = 0; local450 < 50; local450++) {
					this.aClass1_Sub3_Sub2_Sub3Array1[local450] = new Class1_Sub3_Sub2_Sub3(local277, "mapscene", local450);
				}
			} catch (@Pc(468) Exception local468) {
			}
			try {
				for (local450 = 0; local450 < 50; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array4[local450] = new Class1_Sub3_Sub2_Sub2(local277, "mapfunction", local450);
				}
			} catch (@Pc(488) Exception local488) {
			}
			try {
				for (local450 = 0; local450 < 20; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array7[local450] = new Class1_Sub3_Sub2_Sub2(local277, "hitmarks", local450);
				}
			} catch (@Pc(508) Exception local508) {
			}
			try {
				for (local450 = 0; local450 < 20; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array5[local450] = new Class1_Sub3_Sub2_Sub2(local277, "headicons", local450);
				}
			} catch (@Pc(528) Exception local528) {
			}
			this.aClass1_Sub3_Sub2_Sub2_8 = new Class1_Sub3_Sub2_Sub2(local277, "mapflag", 0);
			for (local450 = 0; local450 < 8; local450++) {
				this.aClass1_Sub3_Sub2_Sub2Array3[local450] = new Class1_Sub3_Sub2_Sub2(local277, "cross", local450);
			}
			this.aClass1_Sub3_Sub2_Sub2_1 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 0);
			this.aClass1_Sub3_Sub2_Sub2_2 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 1);
			this.aClass1_Sub3_Sub2_Sub2_3 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 2);
			this.aClass1_Sub3_Sub2_Sub2_4 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 3);
			this.aClass1_Sub3_Sub2_Sub3_17 = new Class1_Sub3_Sub2_Sub3(local277, "scrollbar", 0);
			this.aClass1_Sub3_Sub2_Sub3_18 = new Class1_Sub3_Sub2_Sub3(local277, "scrollbar", 1);
			this.aClass1_Sub3_Sub2_Sub3_1 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_2 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_3 = new Class1_Sub3_Sub2_Sub3(local277, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_4 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_4.method347();
			this.aClass1_Sub3_Sub2_Sub3_5 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_5.method347();
			this.aClass1_Sub3_Sub2_Sub3_9 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_9.method348();
			this.aClass1_Sub3_Sub2_Sub3_10 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_10.method348();
			this.aClass1_Sub3_Sub2_Sub3_11 = new Class1_Sub3_Sub2_Sub3(local277, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_11.method348();
			this.aClass1_Sub3_Sub2_Sub3_12 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_12.method347();
			this.aClass1_Sub3_Sub2_Sub3_12.method348();
			this.aClass1_Sub3_Sub2_Sub3_13 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_13.method347();
			this.aClass1_Sub3_Sub2_Sub3_13.method348();
			@Pc(725) Class1_Sub3_Sub2_Sub2 local725 = new Class1_Sub3_Sub2_Sub2(local277, "backleft1", 0);
			this.aClass32_3 = new Class32(local725.anInt457, local725.anInt456, aByte14, this.method72());
			local725.method320(0, 0);
			@Pc(750) Class1_Sub3_Sub2_Sub2 local750 = new Class1_Sub3_Sub2_Sub2(local277, "backleft2", 0);
			this.aClass32_4 = new Class32(local750.anInt457, local750.anInt456, aByte14, this.method72());
			local750.method320(0, 0);
			@Pc(775) Class1_Sub3_Sub2_Sub2 local775 = new Class1_Sub3_Sub2_Sub2(local277, "backright1", 0);
			this.aClass32_5 = new Class32(local775.anInt457, local775.anInt456, aByte14, this.method72());
			local775.method320(0, 0);
			@Pc(800) Class1_Sub3_Sub2_Sub2 local800 = new Class1_Sub3_Sub2_Sub2(local277, "backright2", 0);
			this.aClass32_6 = new Class32(local800.anInt457, local800.anInt456, aByte14, this.method72());
			local800.method320(0, 0);
			@Pc(825) Class1_Sub3_Sub2_Sub2 local825 = new Class1_Sub3_Sub2_Sub2(local277, "backtop1", 0);
			this.aClass32_7 = new Class32(local825.anInt457, local825.anInt456, aByte14, this.method72());
			local825.method320(0, 0);
			@Pc(850) Class1_Sub3_Sub2_Sub2 local850 = new Class1_Sub3_Sub2_Sub2(local277, "backtop2", 0);
			this.aClass32_8 = new Class32(local850.anInt457, local850.anInt456, aByte14, this.method72());
			local850.method320(0, 0);
			@Pc(875) Class1_Sub3_Sub2_Sub2 local875 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid1", 0);
			this.aClass32_9 = new Class32(local875.anInt457, local875.anInt456, aByte14, this.method72());
			local875.method320(0, 0);
			@Pc(900) Class1_Sub3_Sub2_Sub2 local900 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid2", 0);
			this.aClass32_10 = new Class32(local900.anInt457, local900.anInt456, aByte14, this.method72());
			local900.method320(0, 0);
			@Pc(925) Class1_Sub3_Sub2_Sub2 local925 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid3", 0);
			this.aClass32_11 = new Class32(local925.anInt457, local925.anInt456, aByte14, this.method72());
			local925.method320(0, 0);
			@Pc(950) Class1_Sub3_Sub2_Sub2 local950 = new Class1_Sub3_Sub2_Sub2(local277, "backhmid2", 0);
			this.aClass32_12 = new Class32(local950.anInt457, local950.anInt456, aByte14, this.method72());
			local950.method320(0, 0);
			@Pc(975) int local975 = (int) (Math.random() * 21.0D) - 10;
			@Pc(982) int local982 = (int) (Math.random() * 21.0D) - 10;
			@Pc(989) int local989 = (int) (Math.random() * 21.0D) - 10;
			@Pc(996) int local996 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(998) int local998 = 0; local998 < 50; local998++) {
				if (this.aClass1_Sub3_Sub2_Sub2Array4[local998] != null) {
					this.aClass1_Sub3_Sub2_Sub2Array4[local998].method319(local989 + local996, local982 + local996, local975 + local996);
				}
				if (this.aClass1_Sub3_Sub2_Sub3Array1[local998] != null) {
					this.aClass1_Sub3_Sub2_Sub3Array1[local998].method349(local989 + local996, local982 + local996, local975 + local996);
				}
			}
			this.method74("Unpacking textures", 80);
			Class1_Sub3_Sub2_Sub1.method292(anInt276, local299);
			Class1_Sub3_Sub2_Sub1.method296(0.8D);
			Class1_Sub3_Sub2_Sub1.method291((byte) 8);
			this.method74("Unpacking models", 83);
			Class1_Sub3_Sub1.method225(local288);
			Class10.method261(local288);
			Class12.method276(local288);
			this.method74("Unpacking config", 86);
			Class19.method374(local255);
			Class2.method21(local255);
			Class11.method272(local255);
			Class5.method52(local255);
			Class3.method30(local255);
			Class13.method304(local255);
			Class21.method407(local255);
			Class23.method411(local255);
			Class5.aBoolean27 = aBoolean50;
			if (!aBoolean51) {
				this.method74("Unpacking sounds", 90);
				@Pc(1113) byte[] local1113 = local321.method536(null, "sounds.dat");
				@Pc(1119) Class1_Sub3_Sub3 local1119 = new Class1_Sub3_Sub3((byte) 64, local1113);
				Class43.method561(local1119);
			}
			this.method74("Unpacking interfaces", 92);
			@Pc(1150) Class1_Sub3_Sub2_Sub4[] local1150 = new Class1_Sub3_Sub2_Sub4[] { this.aClass1_Sub3_Sub2_Sub4_1, this.aClass1_Sub3_Sub2_Sub4_2, this.aClass1_Sub3_Sub2_Sub4_3, this.aClass1_Sub3_Sub2_Sub4_4 };
			Class15.method331(local277, local266, local1150);
			this.method74("Preparing game engine", 97);
			@Pc(1166) int local1166;
			@Pc(1168) int local1168;
			@Pc(1170) int local1170;
			for (@Pc(1162) int local1162 = 0; local1162 < 33; local1162++) {
				local1166 = 999;
				local1168 = 0;
				for (local1170 = 0; local1170 < 35; local1170++) {
					if (this.aClass1_Sub3_Sub2_Sub3_15.aByteArray6[local1170 + local1162 * this.aClass1_Sub3_Sub2_Sub3_15.anInt509] == 0) {
						if (local1166 == 999) {
							local1166 = local1170;
						}
					} else if (local1166 != 999) {
						local1168 = local1170;
						break;
					}
				}
				this.anIntArray75[local1162] = local1166;
				this.anIntArray85[local1162] = local1168 - local1166;
			}
			@Pc(1228) int local1228;
			for (local1166 = 9; local1166 < 160; local1166++) {
				local1168 = 999;
				local1170 = 0;
				for (local1228 = 10; local1228 < 168; local1228++) {
					if (this.aClass1_Sub3_Sub2_Sub3_15.aByteArray6[local1228 + local1166 * this.aClass1_Sub3_Sub2_Sub3_15.anInt509] == 0 && (local1228 > 34 || local1166 > 34)) {
						if (local1168 == 999) {
							local1168 = local1228;
						}
					} else if (local1168 != 999) {
						local1170 = local1228;
						break;
					}
				}
				this.anIntArray83[local1166 - 9] = local1168 - 21;
				this.anIntArray43[local1166 - 9] = local1170 - local1168;
			}
			Class1_Sub3_Sub2_Sub1.method289(479, (byte) 7, 96);
			this.anIntArray86 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			Class1_Sub3_Sub2_Sub1.method289(190, (byte) 7, 261);
			this.anIntArray87 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			Class1_Sub3_Sub2_Sub1.method289(512, (byte) 7, 334);
			this.anIntArray88 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			@Pc(1312) int[] local1312 = new int[9];
			for (local1170 = 0; local1170 < 9; local1170++) {
				local1228 = local1170 * 32 + 128 + 15;
				@Pc(1330) int local1330 = local1228 * 3 + 600;
				@Pc(1334) int local1334 = Class1_Sub3_Sub2_Sub1.anIntArray137[local1228];
				local1312[local1170] = local1330 * local1334 >> 16;
			}
			Class33.method504(local1312);
			Class25.method414(local310);
		} catch (@Pc(1357) Exception local1357) {
			this.aBoolean46 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			while (arg1 >= 0) {
				this.aClass1_Sub3_Sub3_5.method381(245);
			}
			if (arg7 >= 1 && arg0 >= 1 && arg7 <= 102 && arg0 <= 102) {
				if (aBoolean51 && arg6 != this.anInt219) {
					return;
				}
				@Pc(28) int local28 = 0;
				if (arg2 == 0) {
					local28 = this.aClass33_1.method494(arg6, arg7, arg0);
				}
				if (arg2 == 1) {
					local28 = this.aClass33_1.method495(arg7, arg6, arg0);
				}
				if (arg2 == 2) {
					local28 = this.aClass33_1.method496(arg6, arg7, arg0);
				}
				if (arg2 == 3) {
					local28 = this.aClass33_1.method497(arg6, arg7, arg0);
				}
				@Pc(84) int local84;
				if (local28 != 0) {
					local84 = this.aClass33_1.method498(arg6, arg7, arg0, local28);
					@Pc(90) int local90 = local28 >> 14 & 0x7FFF;
					@Pc(94) int local94 = local84 & 0x1F;
					@Pc(98) int local98 = local84 >> 6;
					@Pc(111) Class2 local111;
					if (arg2 == 0) {
						this.aClass33_1.method489(arg7, arg6, arg0, this.anInt253);
						local111 = Class2.method23(local90);
						if (local111.aBoolean6) {
							this.aClass9Array1[arg6].method254(arg7, local94, arg0, local111.aBoolean7, local98);
						}
					}
					if (arg2 == 1) {
						this.aClass33_1.method490(290, arg0, arg7, arg6);
					}
					if (arg2 == 2) {
						this.aClass33_1.method491(arg6, arg0, arg7);
						local111 = Class2.method23(local90);
						if (arg7 + local111.anInt45 > 103 || arg0 + local111.anInt45 > 103 || arg7 + local111.anInt46 > 103 || arg0 + local111.anInt46 > 103) {
							return;
						}
						if (local111.aBoolean6) {
							this.aClass9Array1[arg6].method255(local98, local111.aBoolean7, arg7, arg0, local111.anInt45, local111.anInt46);
						}
					}
					if (arg2 == 3) {
						this.aClass33_1.method492(arg0, arg6, arg7);
						local111 = Class2.method23(local90);
						if (local111.aBoolean6 && local111.aBoolean8) {
							this.aClass9Array1[arg6].method257(arg0, arg7);
						}
					}
				}
				if (arg3 >= 0) {
					local84 = arg6;
					if (arg6 < 3 && (this.aByteArrayArrayArray7[1][arg7][arg0] & 0x2) == 2) {
						local84 = arg6 + 1;
					}
					Class4.method50(arg6, arg4, arg7, arg5, local84, arg0, this.aClass9Array1[arg6], this.aClass33_1, arg3, this.aClass28_4, this.anIntArrayArrayArray3);
					return;
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("79278, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub3_Sub2_Sub3_17.method350(arg1, arg4);
			this.aClass1_Sub3_Sub2_Sub3_18.method350(arg1 + arg2 - 16, arg4);
			Class1_Sub3_Sub2.method358(arg1 + 16, 16, arg4, arg2 - 32, this.anInt234);
			@Pc(35) int local35 = (arg2 - 32) * arg2 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg2 - local35 - 32) * arg3 / (arg0 - arg2);
			Class1_Sub3_Sub2.method358(arg1 + local52 + 16, 16, arg4, local35, this.anInt340);
			Class1_Sub3_Sub2.method361(local35, arg1 + local52 + 16, arg4, this.anInt260);
			Class1_Sub3_Sub2.method361(local35, arg1 + local52 + 16, arg4 + 1, this.anInt260);
			Class1_Sub3_Sub2.method360(arg1 + local52 + 16, this.anInt260, 16, arg4, this.anInt232);
			Class1_Sub3_Sub2.method360(arg1 + local52 + 17, this.anInt260, 16, arg4, this.anInt232);
			Class1_Sub3_Sub2.method361(local35, arg1 + local52 + 16, arg4 + 15, this.anInt240);
			Class1_Sub3_Sub2.method361(local35 - 1, arg1 + 17 + local52, arg4 + 14, this.anInt240);
			Class1_Sub3_Sub2.method360(arg1 + local52 + local35 + 15, this.anInt240, 16, arg4, this.anInt232);
			Class1_Sub3_Sub2.method360(arg1 + local52 + local35 + 14, this.anInt240, 15, arg4 + 1, this.anInt232);
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("96454, " + -92 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method108(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub3_Sub2_Sub2_9.anIntArray148;
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
						this.aClass33_1.method503(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass33_1.method503(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.anInt150 += 0;
			this.aClass1_Sub3_Sub2_Sub2_9.method318();
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray7[arg0][local152][local148] & 0x18) == 0) {
						this.method92(local148, local152, local34, arg0, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method92(local148, local152, local34, arg0 + 1, local36);
					}
				}
			}
			this.aClass32_18.method463();
			this.anInt330 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass33_1.method497(this.anInt219, local152, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class2.method23(local230).anInt49;
						if (local242 >= 0) {
							@Pc(246) int local246 = local152;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass9Array1[this.anInt219].anIntArrayArray10;
								for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
									@Pc(289) int local289 = (int) (Math.random() * 4.0D);
									if (local289 == 0 && local246 > 0 && local246 > local152 - 3 && (local280[local246 - 1][local248] & 0x280108) == 0) {
										local246--;
									}
									if (local289 == 1 && local246 < 103 && local246 < local152 + 3 && (local280[local246 + 1][local248] & 0x280180) == 0) {
										local246++;
									}
									if (local289 == 2 && local248 > 0 && local248 > local220 - 3 && (local280[local246][local248 - 1] & 0x280102) == 0) {
										local248--;
									}
									if (local289 == 3 && local248 < 103 && local248 < local220 + 3 && (local280[local246][local248 + 1] & 0x280120) == 0) {
										local248++;
									}
								}
							}
							this.aClass1_Sub3_Sub2_Sub2Array6[this.anInt330] = this.aClass1_Sub3_Sub2_Sub2Array4[local242];
							this.anIntArray81[this.anInt330] = local246;
							this.anIntArray82[this.anInt330] = local248;
							this.anInt330++;
						}
					}
				}
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("25402, " + arg0 + ", " + 0 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method70() {
		try {
			if (this.aBoolean69 || this.aBoolean46 || this.aBoolean42) {
				this.method82();
			} else {
				if (this.aBoolean40) {
					this.method159();
				} else {
					this.method93(884);
				}
				this.anInt282 = 0;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("80556, " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIIII)V")
	private void method109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = 2048 - arg6 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg0;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub3_Sub1.anIntArray124[local5];
				local27 = Class1_Sub3_Sub1.anIntArray125[local5];
				local37 = local27 * 0 - arg0 * local23 >> 16;
				local17 = local23 * 0 + arg0 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub3_Sub1.anIntArray124[local11];
				local27 = Class1_Sub3_Sub1.anIntArray125[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt255 = arg1 - local13;
			this.anInt256 = arg4 - local15;
			this.anInt257 = arg5 - local17;
			this.anInt258 = arg6;
			if (arg2 != 25) {
				this.anInt199 = this.aClass38_1.method532();
			}
			this.anInt259 = arg3;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("37935, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)V")
	private void method110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.anInt296 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt308 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray9[local12] != null) {
						@Pc(24) int local24 = this.anIntArray53[local12];
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt155 == 0 || this.anInt155 == 1 && this.method174(this.aStringArray8[local12]))) {
							@Pc(54) int local54 = 329 - local5 * 13;
							if (super.anInt138 > 8 && super.anInt138 < 520 && arg0 - 11 > local54 - 10 && arg0 - 11 <= local54 + 3) {
								if (this.aBoolean64) {
									this.aStringArray6[this.anInt190] = "Report abuse @whi@" + this.aStringArray8[local12];
									this.anIntArray79[this.anInt190] = 2034;
									this.anInt190++;
								}
								this.aStringArray6[this.anInt190] = "Add ignore @whi@" + this.aStringArray8[local12];
								this.anIntArray79[this.anInt190] = 2436;
								this.anInt190++;
								this.aStringArray6[this.anInt190] = "Add friend @whi@" + this.aStringArray8[local12];
								this.anIntArray79[this.anInt190] = 2406;
								this.anInt190++;
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt155 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("91595, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method111(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean51) {
				@Pc(23) Class1_Sub3_Sub2_Sub3 local23;
				@Pc(31) int local31;
				@Pc(39) int local39;
				@Pc(42) byte[] local42;
				@Pc(45) byte[] local45;
				@Pc(47) int local47;
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[17] >= arg0) {
					local23 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[17];
					local31 = local23.anInt509 * local23.anInt510 - 1;
					local39 = local23.anInt509 * this.anInt320 * 2;
					local42 = local23.aByteArray6;
					local45 = this.aByteArray4;
					for (local47 = 0; local47 <= local31; local47++) {
						local45[local47] = local42[local47 - local39 & local31];
					}
					local23.aByteArray6 = local45;
					this.aByteArray4 = local42;
					Class1_Sub3_Sub2_Sub1.method294(17);
				}
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[24] >= arg0) {
					local23 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[24];
					local31 = local23.anInt509 * local23.anInt510 - 1;
					local39 = local23.anInt509 * this.anInt320 * 2;
					local42 = local23.aByteArray6;
					local45 = this.aByteArray4;
					for (local47 = 0; local47 <= local31; local47++) {
						local45[local47] = local42[local47 - local39 & local31];
					}
					local23.aByteArray6 = local45;
					this.aByteArray4 = local42;
					Class1_Sub3_Sub2_Sub1.method294(24);
					return;
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("89395, " + 8 + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method113() {
		try {
			@Pc(2) int local2 = this.anInt185;
			@Pc(5) int local5 = this.anInt186;
			@Pc(8) int local8 = this.anInt187;
			@Pc(11) int local11 = this.anInt188;
			Class1_Sub3_Sub2.method358(local5, local8, local2, local11, 6116423);
			Class1_Sub3_Sub2.method358(local5 + 1, local8 - 2, local2 + 1, 16, 0);
			Class1_Sub3_Sub2.method359(local8 - 2, local11 - 19, local5 + 18, local2 + 1, 0);
			this.aClass1_Sub3_Sub2_Sub4_3.method365(local5 + 14, "Choose Option", 6116423, local2 + 3);
			@Pc(63) int local63 = super.anInt138;
			@Pc(66) int local66 = super.anInt139;
			if (this.anInt184 == 0) {
				local63 -= 8;
				local66 -= 11;
			}
			if (this.anInt184 == 1) {
				local63 -= 562;
				local66 -= 231;
			}
			if (this.anInt184 == 2) {
				local63 -= 22;
				local66 -= 375;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt190; local85++) {
				@Pc(100) int local100 = local5 + (this.anInt190 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local100 - 13 && local66 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method367(local100, local2 + 3, true, local102, this.aStringArray6[local85]);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("14662, " + 7 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method114() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray51[local5 + 32512] = 255;
				}
			}
			@Pc(45) int local45;
			@Pc(52) int local52;
			@Pc(58) int local58;
			for (local12 = 0; local12 < 100; local12++) {
				local45 = (int) (Math.random() * 124.0D) + 2;
				local52 = (int) (Math.random() * 128.0D) + 128;
				local58 = local45 + (local52 << 7);
				this.anIntArray51[local58] = 192;
			}
			for (local45 = 1; local45 < 255; local45++) {
				for (local52 = 1; local52 < 127; local52++) {
					local58 = local52 + (local45 << 7);
					this.anIntArray52[local58] = (this.anIntArray51[local58 - 1] + this.anIntArray51[local58 + 1] + this.anIntArray51[local58 - 128] + this.anIntArray51[local58 + 128]) / 4;
				}
			}
			this.anInt146 += 128;
			if (this.anInt146 > this.anIntArray71.length) {
				this.anInt146 -= this.anIntArray71.length;
				local52 = (int) (Math.random() * 12.0D);
				this.method103(this.aClass1_Sub3_Sub2_Sub3Array3[local52]);
			}
			@Pc(170) int local170;
			for (local52 = 1; local52 < 255; local52++) {
				for (local58 = 1; local58 < 127; local58++) {
					local170 = local58 + (local52 << 7);
					@Pc(193) int local193 = this.anIntArray52[local170 + 128] - this.anIntArray71[local170 + this.anInt146 & this.anIntArray71.length - 1] / 5;
					if (local193 < 0) {
						local193 = 0;
					}
					this.anIntArray51[local170] = local193;
				}
			}
			for (local58 = 0; local58 < 255; local58++) {
				this.anIntArray46[local58] = this.anIntArray46[local58 + 1];
			}
			this.anIntArray46[255] = (int) (Math.sin((double) anInt280 / 14.0D) * 16.0D + Math.sin((double) anInt280 / 15.0D) * 14.0D + Math.sin((double) anInt280 / 16.0D) * 12.0D);
			if (this.anInt147 > 0) {
				this.anInt147 -= 4;
			}
			if (this.anInt148 > 0) {
				this.anInt148 -= 4;
			}
			if (this.anInt147 == 0 && this.anInt148 == 0) {
				local170 = (int) (Math.random() * 2000.0D);
				if (local170 == 0) {
					this.anInt147 = 1024;
				}
				if (local170 == 1) {
					this.anInt148 = 1024;
					return;
				}
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("19130, " + 8 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method115() {
		try {
			@Pc(8) int local8 = this.aClass1_Sub1_Sub3_Sub2_1.anInt890 + this.anInt265;
			@Pc(15) int local15 = this.aClass1_Sub1_Sub3_Sub2_1.anInt891 + this.anInt313;
			if (this.anInt181 - local8 < -500 || this.anInt181 - local8 > 500 || this.anInt182 - local15 < -500 || this.anInt182 - local15 > 500) {
				this.anInt181 = local8;
				this.anInt182 = local15;
			}
			if (this.anInt181 != local8) {
				this.anInt181 += (local8 - this.anInt181) / 16;
			}
			if (this.anInt182 != local15) {
				this.anInt182 += (local15 - this.anInt182) / 16;
			}
			if (super.anIntArray28[1] == 1) {
				this.anInt270 += (-this.anInt270 - 24) / 2;
			} else if (super.anIntArray28[2] == 1) {
				this.anInt270 += (24 - this.anInt270) / 2;
			} else {
				this.anInt270 /= 2;
			}
			if (super.anIntArray28[3] == 1) {
				this.anInt271 += (12 - this.anInt271) / 2;
			} else if (super.anIntArray28[4] == 1) {
				this.anInt271 += (-this.anInt271 - 12) / 2;
			} else {
				this.anInt271 /= 2;
			}
			this.anInt269 = this.anInt269 + this.anInt270 / 2 & 0x7FF;
			this.anInt268 += this.anInt271 / 2;
			if (this.anInt268 < 128) {
				this.anInt268 = 128;
			}
			if (this.anInt268 > 383) {
				this.anInt268 = 383;
			}
			@Pc(202) int local202 = this.anInt181 >> 7;
			@Pc(207) int local207 = this.anInt182 >> 7;
			@Pc(225) int local225 = this.method199(this.anInt182, this.anInt219, this.anInt181);
			@Pc(227) int local227 = 0;
			@Pc(243) int local243;
			if (local202 > 3 && local207 > 3 && local202 < 100 && local207 < 100) {
				for (local243 = local202 - 4; local243 <= local202 + 4; local243++) {
					for (@Pc(249) int local249 = local207 - 4; local249 <= local207 + 4; local249++) {
						@Pc(254) int local254 = this.anInt219;
						if (local254 < 3 && (this.aByteArrayArrayArray7[1][local243][local249] & 0x2) == 2) {
							local254++;
						}
						@Pc(281) int local281 = local225 - this.anIntArrayArrayArray3[local254][local243][local249];
						if (local281 > local227) {
							local227 = local281;
						}
					}
				}
			}
			local243 = local227 * 192;
			if (local243 > 98048) {
				local243 = 98048;
			}
			if (local243 < 32768) {
				local243 = 32768;
			}
			if (local243 > this.anInt263) {
				this.anInt263 += (local243 - this.anInt263) / 24;
			} else if (local243 < this.anInt263) {
				this.anInt263 += (local243 - this.anInt263) / 80;
			}
		} catch (@Pc(345) RuntimeException local345) {
			signlink.reporterror("14048, " + -7753 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIILclient!bc;)V")
	private void method116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3 arg3) {
		try {
			if (this.anInt190 < 400) {
				@Pc(13) String local13 = arg3.aString2;
				if (arg3.anInt80 != 0) {
					local13 = local13 + method166(this.aClass1_Sub1_Sub3_Sub2_1.anInt942, arg3.anInt80) + " (level-" + arg3.anInt80 + ")";
				}
				if (this.anInt297 == 1) {
					this.aStringArray6[this.anInt190] = "Use " + this.aString17 + " with @yel@" + local13;
					this.anIntArray79[this.anInt190] = 900;
					this.anIntArray80[this.anInt190] = arg1;
					this.anIntArray77[this.anInt190] = arg2;
					this.anIntArray78[this.anInt190] = arg0;
					this.anInt190++;
				} else if (this.anInt160 != 1) {
					@Pc(152) int local152;
					if (arg3.aStringArray2 != null) {
						for (local152 = 4; local152 >= 0; local152--) {
							if (arg3.aStringArray2[local152] != null && !arg3.aStringArray2[local152].equalsIgnoreCase("attack")) {
								this.aStringArray6[this.anInt190] = arg3.aStringArray2[local152] + " @yel@" + local13;
								if (local152 == 0) {
									this.anIntArray79[this.anInt190] = 728;
								}
								if (local152 == 1) {
									this.anIntArray79[this.anInt190] = 542;
								}
								if (local152 == 2) {
									this.anIntArray79[this.anInt190] = 6;
								}
								if (local152 == 3) {
									this.anIntArray79[this.anInt190] = 963;
								}
								if (local152 == 4) {
									this.anIntArray79[this.anInt190] = 245;
								}
								this.anIntArray80[this.anInt190] = arg1;
								this.anIntArray77[this.anInt190] = arg2;
								this.anIntArray78[this.anInt190] = arg0;
								this.anInt190++;
							}
						}
					}
					if (arg3.aStringArray2 != null) {
						for (local152 = 4; local152 >= 0; local152--) {
							if (arg3.aStringArray2[local152] != null && arg3.aStringArray2[local152].equalsIgnoreCase("attack")) {
								@Pc(276) short local276 = 0;
								if (arg3.anInt80 > this.aClass1_Sub1_Sub3_Sub2_1.anInt942) {
									local276 = 2000;
								}
								this.aStringArray6[this.anInt190] = arg3.aStringArray2[local152] + " @yel@" + local13;
								if (local152 == 0) {
									this.anIntArray79[this.anInt190] = local276 + 728;
								}
								if (local152 == 1) {
									this.anIntArray79[this.anInt190] = local276 + 542;
								}
								if (local152 == 2) {
									this.anIntArray79[this.anInt190] = local276 + 6;
								}
								if (local152 == 3) {
									this.anIntArray79[this.anInt190] = local276 + 963;
								}
								if (local152 == 4) {
									this.anIntArray79[this.anInt190] = local276 + 245;
								}
								this.anIntArray80[this.anInt190] = arg1;
								this.anIntArray77[this.anInt190] = arg2;
								this.anIntArray78[this.anInt190] = arg0;
								this.anInt190++;
							}
						}
					}
					this.aStringArray6[this.anInt190] = "Examine @yel@" + local13;
					this.anIntArray79[this.anInt190] = 1607;
					this.anIntArray80[this.anInt190] = arg1;
					this.anIntArray77[this.anInt190] = arg2;
					this.anIntArray78[this.anInt190] = arg0;
					this.anInt190++;
				} else if ((this.anInt162 & 0x2) == 2) {
					this.aStringArray6[this.anInt190] = this.aString6 + " @yel@" + local13;
					this.anIntArray79[this.anInt190] = 265;
					this.anIntArray80[this.anInt190] = arg1;
					this.anIntArray77[this.anInt190] = arg2;
					this.anIntArray78[this.anInt190] = arg0;
					this.anInt190++;
					return;
				}
			}
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("8002, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method117() {
		try {
			this.aClass32_17.method463();
			@Pc(13) int local13 = this.anInt269 + this.anInt288 & 0x7FF;
			@Pc(21) int local21 = this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32 + 48;
			@Pc(29) int local29 = 464 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
			this.aClass1_Sub3_Sub2_Sub2_9.method328(local13, local21, 21, local29, this.anIntArray43, this.anInt210 + 256, 151, 146, 9, this.anIntArray83);
			this.aClass1_Sub3_Sub2_Sub2_5.method328(this.anInt269, 25, 0, 25, this.anIntArray85, 256, 33, 33, 0, this.anIntArray75);
			for (@Pc(67) int local67 = 0; local67 < this.anInt330; local67++) {
				local21 = this.anIntArray81[local67] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
				local29 = this.anIntArray82[local67] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
				this.method131(this.aClass1_Sub3_Sub2_Sub2Array6[local67], local21, local29);
			}
			@Pc(122) int local122;
			for (@Pc(118) int local118 = 0; local118 < 104; local118++) {
				for (local122 = 0; local122 < 104; local122++) {
					@Pc(134) Class28 local134 = this.aClass28ArrayArrayArray1[this.anInt219][local118][local122];
					if (local134 != null) {
						local21 = local118 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
						local29 = local122 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
						this.method131(this.aClass1_Sub3_Sub2_Sub2_1, local21, local29);
					}
				}
			}
			for (local122 = 0; local122 < this.anInt249; local122++) {
				@Pc(187) Class1_Sub1_Sub3_Sub1 local187 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray54[local122]];
				if (local187 != null && local187.method571() && local187.aClass3_1.aBoolean20) {
					local21 = local187.anInt890 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
					local29 = local187.anInt891 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
					this.method131(this.aClass1_Sub3_Sub2_Sub2_2, local21, local29);
				}
			}
			for (@Pc(233) int local233 = 0; local233 < this.anInt286; local233++) {
				@Pc(243) Class1_Sub1_Sub3_Sub2 local243 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray62[local233]];
				if (local243 != null && local243.method571()) {
					local21 = local243.anInt890 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
					local29 = local243.anInt891 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
					@Pc(273) boolean local273 = false;
					@Pc(277) long local277 = Class40.method538(local243.aString30);
					for (@Pc(279) int local279 = 0; local279 < this.anInt208; local279++) {
						if (local277 == this.aLongArray4[local279] && this.anIntArray69[local279] != 0) {
							local273 = true;
							break;
						}
					}
					if (local273) {
						this.method131(this.aClass1_Sub3_Sub2_Sub2_4, local21, local29);
					} else {
						this.method131(this.aClass1_Sub3_Sub2_Sub2_3, local21, local29);
					}
				}
			}
			if (this.anInt331 != 0) {
				local21 = this.anInt331 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
				local29 = this.anInt332 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
				this.method131(this.aClass1_Sub3_Sub2_Sub2_8, local21, local29);
			}
			Class1_Sub3_Sub2.method358(82, 3, 93, 3, 16777215);
			this.aClass32_18.method463();
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("73976, " + false + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)Z")
	private boolean method118() {
		try {
			if (this.aClass6_1 == null) {
				return false;
			}
			@Pc(489) String local489;
			@Pc(230) int local230;
			try {
				@Pc(14) int local14 = this.aClass6_1.method203();
				if (local14 == 0) {
					return false;
				}
				if (this.anInt151 == -1) {
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_6.aByteArray7, 0, 1);
					this.anInt151 = this.aClass1_Sub3_Sub3_6.aByteArray7[0] & 0xFF;
					if (this.aClass38_1 != null) {
						this.anInt151 = this.anInt151 - this.aClass38_1.method532() & 0xFF;
					}
					this.anInt150 = Class7.anIntArray90[this.anInt151];
					local14--;
				}
				if (this.anInt150 == -1) {
					if (local14 <= 0) {
						return false;
					}
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_6.aByteArray7, 0, 1);
					this.anInt150 = this.aClass1_Sub3_Sub3_6.aByteArray7[0] & 0xFF;
					local14--;
				}
				if (this.anInt150 == -2) {
					if (local14 <= 1) {
						return false;
					}
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_6.aByteArray7, 0, 2);
					this.aClass1_Sub3_Sub3_6.anInt554 = 0;
					this.anInt150 = this.aClass1_Sub3_Sub3_6.method393();
					local14 -= 2;
				}
				if (local14 < this.anInt150) {
					return false;
				}
				this.aClass1_Sub3_Sub3_6.anInt554 = 0;
				this.aClass6_1.method204(this.aClass1_Sub3_Sub3_6.aByteArray7, 0, this.anInt150);
				this.anInt152 = 0;
				this.anInt279 = this.anInt278;
				this.anInt278 = this.anInt277;
				this.anInt277 = this.anInt151;
				if (this.anInt151 == 1) {
					this.method141(this.aBoolean62, this.anInt150, this.aClass1_Sub3_Sub3_6);
					this.anInt151 = -1;
					return true;
				}
				@Pc(175) int local175;
				if (this.anInt151 == 195) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					this.method95(local175);
					if (this.anInt196 != -1) {
						this.anInt196 = -1;
						this.aBoolean41 = true;
					}
					if (this.aBoolean35) {
						this.aBoolean35 = false;
						this.aBoolean41 = true;
					}
					this.anInt322 = local175;
					this.aBoolean34 = true;
					this.aBoolean59 = true;
					this.anInt158 = -1;
					this.aBoolean67 = false;
					this.anInt151 = -1;
					return true;
				}
				@Pc(234) int local234;
				@Pc(238) Class15 local238;
				if (this.anInt151 == 103) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method393();
					local234 = this.aClass1_Sub3_Sub3_6.method393();
					local238 = Class15.aClass15Array1[local175];
					@Pc(241) Class1_Sub3_Sub1 local241 = local238.aClass1_Sub3_Sub1_2;
					if (local241 != null) {
						local241.method237(local230, local234);
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 151 || this.anInt151 == 23 || this.anInt151 == 50 || this.anInt151 == 191 || this.anInt151 == 69 || this.anInt151 == 49 || this.anInt151 == 223 || this.anInt151 == 42 || this.anInt151 == 76 || this.anInt151 == 59) {
					this.method200(this.aClass1_Sub3_Sub3_6, this.anInt151);
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 197) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					Class15.aClass15Array1[local175].aClass1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub2_1.method574(this.aByte15);
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 87) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method393();
					Class15.aClass15Array1[local175].aClass1_Sub3_Sub1_2 = new Class1_Sub3_Sub1(local230, (byte) 1);
					this.anInt151 = -1;
					return true;
				}
				@Pc(369) int local369;
				@Pc(373) int local373;
				@Pc(394) int local394;
				@Pc(361) long local361;
				@Pc(371) boolean local371;
				if (this.anInt151 == 41) {
					local361 = this.aClass1_Sub3_Sub3_6.method397((byte) 2);
					local234 = this.aClass1_Sub3_Sub3_6.method396();
					local369 = this.aClass1_Sub3_Sub3_6.method391();
					local371 = false;
					for (local373 = 0; local373 < 100; local373++) {
						if (this.anIntArray50[local373] == local234) {
							local371 = true;
							break;
						}
					}
					if (local369 <= 1) {
						for (local394 = 0; local394 < this.anInt261; local394++) {
							if (this.aLongArray3[local394] == local361) {
								local371 = true;
								break;
							}
						}
					}
					if (!local371 && this.anInt189 == 0) {
						try {
							this.anIntArray50[this.anInt165] = local234;
							this.anInt165 = (this.anInt165 + 1) % 100;
							@Pc(440) String local440 = Class41.method545(this.aClass1_Sub3_Sub3_6, (byte) 1, this.anInt150 - 13);
							@Pc(444) String local444 = Class25.method424(local440, 400);
							if (local369 > 1) {
								this.method83(local444, this.aByte23, Class40.method542(Class40.method539(local361)), 7);
							} else {
								this.method83(local444, this.aByte23, Class40.method542(Class40.method539(local361)), 3);
							}
						} catch (@Pc(473) Exception local473) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt151 = -1;
					return true;
				}
				@Pc(500) String local500;
				if (this.anInt151 == 4) {
					local489 = this.aClass1_Sub3_Sub3_6.method398();
					@Pc(503) long local503;
					if (local489.endsWith(":tradereq:")) {
						local500 = local489.substring(0, local489.indexOf(":"));
						local503 = Class40.method538(local500);
						local371 = false;
						for (local373 = 0; local373 < this.anInt261; local373++) {
							if (this.aLongArray3[local373] == local503) {
								local371 = true;
								break;
							}
						}
						if (!local371 && this.anInt189 == 0) {
							this.method83("wishes to trade with you.", this.aByte23, local500, 4);
						}
					} else if (local489.endsWith(":duelreq:")) {
						local500 = local489.substring(0, local489.indexOf(":"));
						local503 = Class40.method538(local500);
						local371 = false;
						for (local373 = 0; local373 < this.anInt261; local373++) {
							if (this.aLongArray3[local373] == local503) {
								local371 = true;
								break;
							}
						}
						if (!local371 && this.anInt189 == 0) {
							this.method83("wishes to duel with you.", this.aByte23, local500, 8);
						}
					} else {
						this.method83(local489, this.aByte23, "", 0);
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 28) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method393();
					if (this.anInt196 != -1) {
						this.anInt196 = -1;
						this.aBoolean41 = true;
					}
					if (this.aBoolean35) {
						this.aBoolean35 = false;
						this.aBoolean41 = true;
					}
					this.anInt158 = local175;
					this.anInt322 = local230;
					this.aBoolean34 = true;
					this.aBoolean59 = true;
					this.aBoolean67 = false;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 3) {
					this.aBoolean47 = true;
					this.anInt324 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt325 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt326 = this.aClass1_Sub3_Sub3_6.method393();
					this.anInt327 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt328 = this.aClass1_Sub3_Sub3_6.method391();
					if (this.anInt328 >= 100) {
						this.anInt255 = this.anInt324 * 128 + 64;
						this.anInt257 = this.anInt325 * 128 + 64;
						this.anInt256 = this.method199(this.anInt325, this.anInt219, this.anInt324) - this.anInt326;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 226) {
					Class8.method208();
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 7) {
					this.anInt250 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt251 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 129) {
					if (this.anInt322 != -1) {
						this.anInt322 = -1;
						this.aBoolean34 = true;
						this.aBoolean59 = true;
					}
					if (this.anInt196 != -1) {
						this.anInt196 = -1;
						this.aBoolean41 = true;
					}
					if (this.aBoolean35) {
						this.aBoolean35 = false;
						this.aBoolean41 = true;
					}
					this.anInt158 = -1;
					this.aBoolean67 = false;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 20) {
					local175 = this.aClass1_Sub3_Sub3_6.method391();
					local230 = this.aClass1_Sub3_Sub3_6.method391();
					local234 = -1;
					for (local369 = 0; local369 < this.anIntArray47.length; local369++) {
						if (this.anIntArray47[local369] == (local175 << 8) + local230) {
							local234 = local369;
						}
					}
					if (local234 != -1) {
						signlink.cachesave("l" + local175 + "_" + local230, this.aByteArrayArray1[local234]);
						this.anInt212 = 1;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 44) {
					this.aBoolean34 = true;
					local175 = this.aClass1_Sub3_Sub3_6.method391();
					local230 = this.aClass1_Sub3_Sub3_6.method396();
					local234 = this.aClass1_Sub3_Sub3_6.method391();
					this.anIntArray67[local175] = local230;
					this.anIntArray61[local175] = local234;
					this.anIntArray31[local175] = 1;
					for (local369 = 0; local369 < 98; local369++) {
						if (local230 >= anIntArray44[local369]) {
							this.anIntArray31[local175] = local369 + 2;
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 212) {
					if (this.aBoolean49 && !aBoolean51) {
						local175 = this.aClass1_Sub3_Sub3_6.method393();
						local230 = this.aClass1_Sub3_Sub3_6.method396();
						local234 = this.anInt150 - 6;
						@Pc(947) byte[] local947 = new byte[local230];
						Class34.method519(local947, local230, this.aClass1_Sub3_Sub3_6.aByteArray7, local234, this.aClass1_Sub3_Sub3_6.anInt554);
						this.method96(local947, false, local230);
						this.anInt156 = local175;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 126) {
					this.anInt318 = this.aClass1_Sub3_Sub3_6.method391();
					if (this.anInt318 == this.anInt231) {
						if (this.anInt318 == 3) {
							this.anInt231 = 1;
						} else {
							this.anInt231 = 3;
						}
						this.aBoolean34 = true;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 243) {
					this.aBoolean56 = false;
					this.aBoolean35 = true;
					this.aString7 = "";
					this.aBoolean41 = true;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 46) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method393();
					local234 = this.aClass1_Sub3_Sub3_6.method393();
					@Pc(1046) Class5 local1046 = Class5.method54(local230);
					Class15.aClass15Array1[local175].aClass1_Sub3_Sub1_2 = local1046.method58(50);
					Class15.aClass15Array1[local175].anInt485 = local1046.anInt108;
					Class15.aClass15Array1[local175].anInt486 = local1046.anInt109;
					Class15.aClass15Array1[local175].anInt484 = local1046.anInt107 * 100 / local234;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 136) {
					for (local175 = 0; local175 < this.aClass1_Sub1_Sub3_Sub2Array1.length; local175++) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local175] != null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local175].anInt915 = -1;
						}
					}
					for (local230 = 0; local230 < this.aClass1_Sub1_Sub3_Sub1Array1.length; local230++) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local230] != null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local230].anInt915 = -1;
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 26) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					@Pc(1148) boolean local1148 = this.aClass1_Sub3_Sub3_6.method391() == 1;
					Class15.aClass15Array1[local175].aBoolean109 = local1148;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 167) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method391();
					if (local175 == 65535) {
						local175 = -1;
					}
					this.anIntArray32[local230] = local175;
					this.aBoolean34 = true;
					this.aBoolean59 = true;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 13) {
					local175 = this.aClass1_Sub3_Sub3_6.method391();
					local230 = this.aClass1_Sub3_Sub3_6.method391();
					local234 = this.aClass1_Sub3_Sub3_6.method391();
					local369 = this.aClass1_Sub3_Sub3_6.method391();
					this.aBooleanArray1[local175] = true;
					this.anIntArray70[local175] = local230;
					this.anIntArray74[local175] = local234;
					this.anIntArray45[local175] = local369;
					this.anIntArray41[local175] = 0;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 209) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method394();
					local234 = this.aClass1_Sub3_Sub3_6.method394();
					local238 = Class15.aClass15Array1[local175];
					local238.anInt471 = local230;
					local238.anInt472 = local234;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 162) {
					this.anInt250 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt251 = this.aClass1_Sub3_Sub3_6.method391();
					while (this.aClass1_Sub3_Sub3_6.anInt554 < this.anInt150) {
						local175 = this.aClass1_Sub3_Sub3_6.method391();
						this.method200(this.aClass1_Sub3_Sub3_6, local175);
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 204) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method393();
					@Pc(1324) Class3 local1324 = Class3.method32(local230);
					Class15.aClass15Array1[local175].aClass1_Sub3_Sub1_2 = local1324.method35();
					this.anInt151 = -1;
					return true;
				}
				@Pc(1364) int local1364;
				if (this.anInt151 == 2) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method393();
					local234 = local230 >> 10 & 0x1F;
					local369 = local230 >> 5 & 0x1F;
					local1364 = local230 & 0x1F;
					Class15.aClass15Array1[local175].anInt479 = (local234 << 19) + (local369 << 11) + (local1364 << 3);
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 12) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method391();
					local234 = this.aClass1_Sub3_Sub3_6.method393();
					if (this.aBoolean38 && !aBoolean51 && this.anInt202 < 50) {
						this.anIntArray68[this.anInt202] = local175;
						this.anIntArray48[this.anInt202] = local230;
						this.anIntArray49[this.anInt202] = local234 + Class43.anIntArray231[local175];
						this.anInt202++;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 43) {
					this.anInt308 = this.aClass1_Sub3_Sub3_6.method393() * 30;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 239) {
					this.aBoolean47 = false;
					for (local175 = 0; local175 < 5; local175++) {
						this.aBooleanArray1[local175] = false;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 150) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					@Pc(1495) byte local1495 = this.aClass1_Sub3_Sub3_6.method392();
					this.anIntArray40[local175] = local1495;
					if (this.anIntArray56[local175] != local1495) {
						this.anIntArray56[local175] = local1495;
						this.method145(local175);
						this.aBoolean34 = true;
						if (this.anInt329 != -1) {
							this.aBoolean41 = true;
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 84) {
					this.anInt231 = this.aClass1_Sub3_Sub3_6.method391();
					this.aBoolean34 = true;
					this.aBoolean59 = true;
					this.anInt151 = -1;
					return true;
				}
				@Pc(1565) Class15 local1565;
				if (this.anInt151 == 213) {
					this.aBoolean34 = true;
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local1565 = Class15.aClass15Array1[local175];
					while (this.aClass1_Sub3_Sub3_6.anInt554 < this.anInt150) {
						local234 = this.aClass1_Sub3_Sub3_6.method391();
						local369 = this.aClass1_Sub3_Sub3_6.method393();
						local1364 = this.aClass1_Sub3_Sub3_6.method391();
						if (local1364 == 255) {
							local1364 = this.aClass1_Sub3_Sub3_6.method396();
						}
						if (local234 >= 0 && local234 < local1565.anIntArray149.length) {
							local1565.anIntArray149[local234] = local369;
							local1565.anIntArray150[local234] = local1364;
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 54) {
					local489 = this.aClass1_Sub3_Sub3_6.method398();
					local230 = this.aClass1_Sub3_Sub3_6.method396();
					local234 = this.aClass1_Sub3_Sub3_6.method396();
					if (!local489.equals(this.aString8) && this.aBoolean49 && !aBoolean51) {
						this.method189(local489, local234, local230);
					}
					this.aString8 = local489;
					this.anInt295 = local230;
					this.anInt267 = local234;
					this.anInt156 = 0;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 98) {
					this.aBoolean34 = true;
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local1565 = Class15.aClass15Array1[local175];
					local234 = this.aClass1_Sub3_Sub3_6.method391();
					for (local369 = 0; local369 < local234; local369++) {
						local1565.anIntArray149[local369] = this.aClass1_Sub3_Sub3_6.method393();
						local1364 = this.aClass1_Sub3_Sub3_6.method391();
						if (local1364 == 255) {
							local1364 = this.aClass1_Sub3_Sub3_6.method396();
						}
						local1565.anIntArray150[local369] = local1364;
					}
					for (local1364 = local234; local1364 < local1565.anIntArray149.length; local1364++) {
						local1565.anIntArray149[local1364] = 0;
						local1565.anIntArray150[local1364] = 0;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 139) {
					this.anInt248 = this.aClass1_Sub3_Sub3_6.method393();
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 193) {
					for (local175 = 0; local175 < this.anIntArray56.length; local175++) {
						if (this.anIntArray56[local175] != this.anIntArray40[local175]) {
							this.anIntArray56[local175] = this.anIntArray40[local175];
							this.method145(local175);
							this.aBoolean34 = true;
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 15) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local1565 = Class15.aClass15Array1[local175];
					for (local234 = 0; local234 < local1565.anIntArray149.length; local234++) {
						local1565.anIntArray149[local234] = -1;
						local1565.anIntArray149[local234] = 0;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 135) {
					this.anInt250 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt251 = this.aClass1_Sub3_Sub3_6.method391();
					for (local175 = this.anInt250; local175 < this.anInt250 + 8; local175++) {
						for (local230 = this.anInt251; local230 < this.anInt251 + 8; local230++) {
							if (this.aClass28ArrayArrayArray1[this.anInt219][local175][local230] != null) {
								this.aClass28ArrayArrayArray1[this.anInt219][local175][local230] = null;
								this.method134(local175, local230);
							}
						}
					}
					for (@Pc(1899) Class1_Sub4 local1899 = (Class1_Sub4) this.aClass28_3.method456(); local1899 != null; local1899 = (Class1_Sub4) this.aClass28_3.method458()) {
						if (local1899.anInt588 >= this.anInt250 && local1899.anInt588 < this.anInt250 + 8 && local1899.anInt589 >= this.anInt251 && local1899.anInt589 < this.anInt251 + 8 && local1899.anInt586 == this.anInt219) {
							this.method106(local1899.anInt589, this.anInt191, local1899.anInt587, local1899.anInt593, local1899.anInt595, local1899.anInt594, local1899.anInt586, local1899.anInt588);
							local1899.method567();
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 184) {
					this.method193(this.aClass1_Sub3_Sub3_6, this.anInt150, this.anInt252);
					if (this.anInt212 == 1) {
						this.anInt212 = 2;
						Class4.anInt85 = this.anInt219;
						this.method178();
					}
					if (aBoolean51 && this.anInt212 == 2 && Class4.anInt85 != this.anInt219) {
						this.aClass32_18.method463();
						this.aClass1_Sub3_Sub2_Sub4_2.method362(257, 151, "Loading - please wait.", 0);
						this.aClass1_Sub3_Sub2_Sub4_2.method362(256, 150, "Loading - please wait.", 16777215);
						this.aClass32_18.method464(super.aGraphics2, 11, 8);
						Class4.anInt85 = this.anInt219;
						this.method178();
					}
					if (this.anInt219 != this.anInt281 && this.anInt212 == 2) {
						this.anInt281 = this.anInt219;
						this.method108(this.anInt219);
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 68) {
					if (this.anInt231 == 12) {
						this.aBoolean34 = true;
					}
					this.anInt170 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 80) {
					local175 = this.aClass1_Sub3_Sub3_6.method391();
					local230 = this.aClass1_Sub3_Sub3_6.method391();
					local234 = -1;
					for (local369 = 0; local369 < this.anIntArray47.length; local369++) {
						if (this.anIntArray47[local369] == (local175 << 8) + local230) {
							local234 = local369;
						}
					}
					if (local234 != -1) {
						signlink.cachesave("m" + local175 + "_" + local230, this.aByteArrayArray2[local234]);
						this.anInt212 = 1;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 133) {
					@Pc(2146) Class1_Sub3_Sub3 local2146 = Class8.method211();
					if (local2146 != null) {
						this.aClass1_Sub3_Sub3_5.method380(81);
						this.aClass1_Sub3_Sub3_5.method382(local2146.anInt554);
						this.aClass1_Sub3_Sub3_5.method389(local2146.aByteArray7, local2146.anInt554);
						local2146.method379();
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 254) {
					this.anInt317 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 32) {
					this.anInt339 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt155 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt230 = this.aClass1_Sub3_Sub3_6.method391();
					this.aBoolean61 = true;
					this.aBoolean41 = true;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 220) {
					local175 = this.aClass1_Sub3_Sub3_6.method391();
					local230 = this.aClass1_Sub3_Sub3_6.method391();
					local234 = this.aClass1_Sub3_Sub3_6.method393();
					local369 = this.aClass1_Sub3_Sub3_6.method393();
					local1364 = -1;
					for (local373 = 0; local373 < this.anIntArray47.length; local373++) {
						if (this.anIntArray47[local373] == (local175 << 8) + local230) {
							local1364 = local373;
						}
					}
					if (local1364 != -1) {
						if (this.aByteArrayArray1[local1364] == null || this.aByteArrayArray1[local1364].length != local369) {
							this.aByteArrayArray1[local1364] = new byte[local369];
						}
						this.aClass1_Sub3_Sub3_6.method400(this.anInt150 - 6, this.aByteArrayArray1[local1364], local234);
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 74) {
					this.aBoolean47 = true;
					this.anInt224 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt225 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt226 = this.aClass1_Sub3_Sub3_6.method393();
					this.anInt227 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt228 = this.aClass1_Sub3_Sub3_6.method391();
					if (this.anInt228 >= 100) {
						local175 = this.anInt224 * 128 + 64;
						local230 = this.anInt225 * 128 + 64;
						local234 = this.method199(this.anInt225, this.anInt219, this.anInt224) - this.anInt226;
						local369 = local175 - this.anInt255;
						local1364 = local234 - this.anInt256;
						local373 = local230 - this.anInt257;
						local394 = (int) Math.sqrt((double) (local369 * local369 + local373 * local373));
						this.anInt258 = (int) (Math.atan2((double) local1364, (double) local394) * 325.949D) & 0x7FF;
						this.anInt259 = (int) (Math.atan2((double) local369, (double) local373) * -325.949D) & 0x7FF;
						if (this.anInt258 < 128) {
							this.anInt258 = 128;
						}
						if (this.anInt258 > 383) {
							this.anInt258 = 383;
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 142) {
					this.method124();
					this.anInt151 = -1;
					return false;
				}
				if (this.anInt151 == 14) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					this.method95(local175);
					if (this.anInt322 != -1) {
						this.anInt322 = -1;
						this.aBoolean34 = true;
						this.aBoolean59 = true;
					}
					this.anInt196 = local175;
					this.aBoolean41 = true;
					this.anInt158 = -1;
					this.aBoolean67 = false;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 175) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method396();
					this.anIntArray40[local175] = local230;
					if (this.anIntArray56[local175] != local230) {
						this.anIntArray56[local175] = local230;
						this.method145(local175);
						this.aBoolean34 = true;
						if (this.anInt329 != -1) {
							this.aBoolean41 = true;
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 201) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local500 = this.aClass1_Sub3_Sub3_6.method398();
					Class15.aClass15Array1[local175].aString20 = local500;
					if (Class15.aClass15Array1[local175].anInt465 == this.anIntArray32[this.anInt231]) {
						this.aBoolean34 = true;
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 19) {
					this.anInt331 = 0;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 146) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method393();
					Class15.aClass15Array1[local175].anInt482 = local230;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 25) {
					this.anInt242 = this.aClass1_Sub3_Sub3_6.method391();
					if (this.anInt242 == 1) {
						this.anInt272 = this.aClass1_Sub3_Sub3_6.method393();
					}
					if (this.anInt242 >= 2 && this.anInt242 <= 6) {
						if (this.anInt242 == 2) {
							this.anInt238 = 64;
							this.anInt239 = 64;
						}
						if (this.anInt242 == 3) {
							this.anInt238 = 0;
							this.anInt239 = 64;
						}
						if (this.anInt242 == 4) {
							this.anInt238 = 128;
							this.anInt239 = 64;
						}
						if (this.anInt242 == 5) {
							this.anInt238 = 64;
							this.anInt239 = 0;
						}
						if (this.anInt242 == 6) {
							this.anInt238 = 64;
							this.anInt239 = 128;
						}
						this.anInt242 = 2;
						this.anInt235 = this.aClass1_Sub3_Sub3_6.method393();
						this.anInt236 = this.aClass1_Sub3_Sub3_6.method393();
						this.anInt237 = this.aClass1_Sub3_Sub3_6.method391();
					}
					if (this.anInt242 == 10) {
						this.anInt283 = this.aClass1_Sub3_Sub3_6.method393();
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 140) {
					this.anInt180 = this.aClass1_Sub3_Sub3_6.method396();
					this.anInt309 = this.aClass1_Sub3_Sub3_6.method393();
					this.anInt207 = this.aClass1_Sub3_Sub3_6.method391();
					this.anInt264 = this.aClass1_Sub3_Sub3_6.method393();
					if (this.anInt180 != 0 && this.anInt158 == -1) {
						signlink.dnslookup(Class40.method541(this.anInt180, this.aByte20));
						this.method126(this.anInt337);
						@Pc(2755) short local2755 = 650;
						if (this.anInt207 != 201) {
							local2755 = 655;
						}
						this.aString13 = "";
						this.aBoolean44 = false;
						for (local230 = 0; local230 < Class15.aClass15Array1.length; local230++) {
							if (Class15.aClass15Array1[local230] != null && Class15.aClass15Array1[local230].anInt468 == local2755) {
								this.anInt158 = Class15.aClass15Array1[local230].anInt465;
								break;
							}
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 132) {
					local175 = this.aClass1_Sub3_Sub3_6.method391();
					local230 = this.aClass1_Sub3_Sub3_6.method391();
					local234 = this.aClass1_Sub3_Sub3_6.method393();
					local369 = this.aClass1_Sub3_Sub3_6.method393();
					local1364 = -1;
					for (local373 = 0; local373 < this.anIntArray47.length; local373++) {
						if (this.anIntArray47[local373] == (local175 << 8) + local230) {
							local1364 = local373;
						}
					}
					if (local1364 != -1) {
						if (this.aByteArrayArray2[local1364] == null || this.aByteArrayArray2[local1364].length != local369) {
							this.aByteArrayArray2[local1364] = new byte[local369];
						}
						this.aClass1_Sub3_Sub3_6.method400(this.anInt150 - 6, this.aByteArrayArray2[local1364], local234);
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 22) {
					if (this.anInt231 == 12) {
						this.aBoolean34 = true;
					}
					this.anInt233 = this.aClass1_Sub3_Sub3_6.method394();
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 185) {
					local175 = this.aClass1_Sub3_Sub3_6.method394();
					this.anInt329 = local175;
					this.aBoolean41 = true;
					this.anInt151 = -1;
					return true;
				}
				@Pc(3080) int local3080;
				if (this.anInt151 == 152) {
					local361 = this.aClass1_Sub3_Sub3_6.method397((byte) 2);
					local234 = this.aClass1_Sub3_Sub3_6.method391();
					@Pc(2941) String local2941 = Class40.method542(Class40.method539(local361));
					for (local1364 = 0; local1364 < this.anInt208; local1364++) {
						if (local361 == this.aLongArray4[local1364]) {
							if (this.anIntArray69[local1364] != local234) {
								this.anIntArray69[local1364] = local234;
								this.aBoolean34 = true;
								if (local234 > 0) {
									this.method83(local2941 + " has logged in.", this.aByte23, "", 5);
								}
								if (local234 == 0) {
									this.method83(local2941 + " has logged out.", this.aByte23, "", 5);
								}
							}
							local2941 = null;
							break;
						}
					}
					if (local2941 != null && this.anInt208 < 100) {
						this.aLongArray4[this.anInt208] = local361;
						this.aStringArray7[this.anInt208] = local2941;
						this.anIntArray69[this.anInt208] = local234;
						this.anInt208++;
						this.aBoolean34 = true;
					}
					@Pc(3041) boolean local3041 = false;
					while (!local3041) {
						local3041 = true;
						for (local394 = 0; local394 < this.anInt208 - 1; local394++) {
							if (this.anIntArray69[local394] != anInt243 && this.anIntArray69[local394 + 1] == anInt243 || this.anIntArray69[local394] == 0 && this.anIntArray69[local394 + 1] != 0) {
								local3080 = this.anIntArray69[local394];
								this.anIntArray69[local394] = this.anIntArray69[local394 + 1];
								this.anIntArray69[local394 + 1] = local3080;
								@Pc(3102) String local3102 = this.aStringArray7[local394];
								this.aStringArray7[local394] = this.aStringArray7[local394 + 1];
								this.aStringArray7[local394 + 1] = local3102;
								@Pc(3124) long local3124 = this.aLongArray4[local394];
								this.aLongArray4[local394] = this.aLongArray4[local394 + 1];
								this.aLongArray4[local394 + 1] = local3124;
								this.aBoolean34 = true;
								local3041 = false;
							}
						}
					}
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 237) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					local230 = this.aClass1_Sub3_Sub3_6.method393();
					if (this.anInt306 == local175 && this.anInt307 == local230 && this.anInt212 != 0) {
						this.anInt151 = -1;
						return true;
					}
					this.anInt306 = local175;
					this.anInt307 = local230;
					this.anInt192 = (this.anInt306 - 6) * 8;
					this.anInt193 = (this.anInt307 - 6) * 8;
					this.anInt212 = 1;
					this.aClass32_18.method463();
					this.aClass1_Sub3_Sub2_Sub4_2.method362(257, 151, "Loading - please wait.", 0);
					this.aClass1_Sub3_Sub2_Sub4_2.method362(256, 150, "Loading - please wait.", 16777215);
					this.aClass32_18.method464(super.aGraphics2, 11, 8);
					signlink.looprate(5);
					local234 = (this.anInt150 - 2) / 10;
					this.aByteArrayArray2 = new byte[local234][];
					this.aByteArrayArray1 = new byte[local234][];
					this.anIntArray47 = new int[local234];
					this.aClass1_Sub3_Sub3_5.method380(150);
					this.aClass1_Sub3_Sub3_5.method381(0);
					local369 = 0;
					@Pc(3293) int local3293;
					for (local1364 = 0; local1364 < local234; local1364++) {
						local373 = this.aClass1_Sub3_Sub3_6.method391();
						local394 = this.aClass1_Sub3_Sub3_6.method391();
						local3080 = this.aClass1_Sub3_Sub3_6.method396();
						local3293 = this.aClass1_Sub3_Sub3_6.method396();
						this.anIntArray47[local1364] = (local373 << 8) + local394;
						@Pc(3317) byte[] local3317;
						if (local3080 != 0) {
							local3317 = signlink.cacheload("m" + local373 + "_" + local394);
							if (local3317 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local3317);
								if ((int) this.aCRC32_1.getValue() != local3080) {
									local3317 = null;
								}
							}
							if (local3317 == null) {
								this.anInt212 = 0;
								this.aClass1_Sub3_Sub3_5.method381(0);
								this.aClass1_Sub3_Sub3_5.method381(local373);
								this.aClass1_Sub3_Sub3_5.method381(local394);
								local369 += 3;
							} else {
								this.aByteArrayArray2[local1364] = local3317;
							}
						}
						if (local3293 != 0) {
							local3317 = signlink.cacheload("l" + local373 + "_" + local394);
							if (local3317 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local3317);
								if ((int) this.aCRC32_1.getValue() != local3293) {
									local3317 = null;
								}
							}
							if (local3317 == null) {
								this.anInt212 = 0;
								this.aClass1_Sub3_Sub3_5.method381(1);
								this.aClass1_Sub3_Sub3_5.method381(local373);
								this.aClass1_Sub3_Sub3_5.method381(local394);
								local369 += 3;
							} else {
								this.aByteArrayArray1[local1364] = local3317;
							}
						}
					}
					this.aClass1_Sub3_Sub3_5.method390(local369);
					signlink.looprate(50);
					this.aClass32_18.method463();
					if (this.anInt212 == 0) {
						this.aClass1_Sub3_Sub2_Sub4_2.method362(257, 166, "Map area updated since last visit, so load will take longer this time only", 0);
						this.aClass1_Sub3_Sub2_Sub4_2.method362(256, 165, "Map area updated since last visit, so load will take longer this time only", 16777215);
					}
					this.aClass32_18.method464(super.aGraphics2, 11, 8);
					local373 = this.anInt192 - this.anInt194;
					local394 = this.anInt193 - this.anInt195;
					this.anInt194 = this.anInt192;
					this.anInt195 = this.anInt193;
					for (local3080 = 0; local3080 < 8192; local3080++) {
						@Pc(3487) Class1_Sub1_Sub3_Sub1 local3487 = this.aClass1_Sub1_Sub3_Sub1Array1[local3080];
						if (local3487 != null) {
							for (@Pc(3491) int local3491 = 0; local3491 < 10; local3491++) {
								local3487.anIntArray232[local3491] -= local373;
								local3487.anIntArray233[local3491] -= local394;
							}
							local3487.anInt890 -= local373 * 128;
							local3487.anInt891 -= local394 * 128;
						}
					}
					for (local3293 = 0; local3293 < this.anInt284; local3293++) {
						@Pc(3542) Class1_Sub1_Sub3_Sub2 local3542 = this.aClass1_Sub1_Sub3_Sub2Array1[local3293];
						if (local3542 != null) {
							for (@Pc(3546) int local3546 = 0; local3546 < 10; local3546++) {
								local3542.anIntArray232[local3546] -= local373;
								local3542.anIntArray233[local3546] -= local394;
							}
							local3542.anInt890 -= local373 * 128;
							local3542.anInt891 -= local394 * 128;
						}
					}
					@Pc(3591) byte local3591 = 0;
					@Pc(3593) byte local3593 = 104;
					@Pc(3595) byte local3595 = 1;
					if (local373 < 0) {
						local3591 = 103;
						local3593 = -1;
						local3595 = -1;
					}
					@Pc(3605) byte local3605 = 0;
					@Pc(3607) byte local3607 = 104;
					@Pc(3609) byte local3609 = 1;
					if (local394 < 0) {
						local3605 = 103;
						local3607 = -1;
						local3609 = -1;
					}
					for (@Pc(3619) int local3619 = local3591; local3619 != local3593; local3619 += local3595) {
						for (@Pc(3623) int local3623 = local3605; local3623 != local3607; local3623 += local3609) {
							@Pc(3629) int local3629 = local3619 + local373;
							@Pc(3633) int local3633 = local3623 + local394;
							for (@Pc(3635) int local3635 = 0; local3635 < 4; local3635++) {
								if (local3629 >= 0 && local3633 >= 0 && local3629 < 104 && local3633 < 104) {
									this.aClass28ArrayArrayArray1[local3635][local3619][local3623] = this.aClass28ArrayArrayArray1[local3635][local3629][local3633];
								} else {
									this.aClass28ArrayArrayArray1[local3635][local3619][local3623] = null;
								}
							}
						}
					}
					for (@Pc(3697) Class1_Sub4 local3697 = (Class1_Sub4) this.aClass28_3.method456(); local3697 != null; local3697 = (Class1_Sub4) this.aClass28_3.method458()) {
						local3697.anInt588 -= local373;
						local3697.anInt589 -= local394;
						if (local3697.anInt588 < 0 || local3697.anInt589 < 0 || local3697.anInt588 >= 104 || local3697.anInt589 >= 104) {
							local3697.method567();
						}
					}
					if (this.anInt331 != 0) {
						this.anInt331 -= local373;
						this.anInt332 -= local394;
					}
					this.aBoolean47 = false;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 168) {
					local175 = this.aClass1_Sub3_Sub3_6.method393();
					this.method95(local175);
					if (this.anInt322 != -1) {
						this.anInt322 = -1;
						this.aBoolean34 = true;
						this.aBoolean59 = true;
					}
					if (this.anInt196 != -1) {
						this.anInt196 = -1;
						this.aBoolean41 = true;
					}
					if (this.aBoolean35) {
						this.aBoolean35 = false;
						this.aBoolean41 = true;
					}
					this.anInt158 = local175;
					this.aBoolean67 = false;
					this.anInt151 = -1;
					return true;
				}
				if (this.anInt151 == 21) {
					this.anInt261 = this.anInt150 / 8;
					for (local175 = 0; local175 < this.anInt261; local175++) {
						this.aLongArray3[local175] = this.aClass1_Sub3_Sub3_6.method397((byte) 2);
					}
					this.anInt151 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt151 + "," + this.anInt150 + " - " + this.anInt278 + "," + this.anInt279);
				this.method124();
			} catch (@Pc(3874) IOException local3874) {
				this.method122();
			} catch (@Pc(3879) Exception local3879) {
				local489 = "T2 - " + this.anInt151 + "," + this.anInt278 + "," + this.anInt279 + " - " + this.anInt150 + "," + (this.anInt192 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0]) + "," + (this.anInt193 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0]) + " - ";
				for (local230 = 0; local230 < this.anInt150 && local230 < 50; local230++) {
					local489 = local489 + this.aClass1_Sub3_Sub3_6.aByteArray7[local230] + ",";
				}
				signlink.reporterror(local489);
				this.method124();
			}
			return true;
		} catch (@Pc(3962) RuntimeException local3962) {
			signlink.reporterror("77745, " + true + ", " + local3962.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method119() {
		try {
			if (this.anInt308 > 1) {
				this.anInt308--;
			}
			if (this.anInt154 > 0) {
				this.anInt154--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method118(); local22++) {
			}
			if (this.aBoolean40) {
				@Pc(147) int local147;
				@Pc(199) int local199;
				for (@Pc(39) int local39 = 0; local39 < this.anInt202; local39++) {
					if (this.anIntArray49[local39] <= 0) {
						@Pc(48) boolean local48 = false;
						try {
							if (this.anIntArray68[local39] != this.anInt177 || this.anIntArray48[local39] != this.anInt274) {
								@Pc(81) Class1_Sub3_Sub3 local81 = Class43.method562(this.anIntArray48[local39], this.anIntArray68[local39]);
								if (System.currentTimeMillis() + (long) (local81.anInt554 / 22) > this.aLong7 + (long) (this.anInt247 / 22)) {
									this.anInt247 = local81.anInt554;
									this.aLong7 = System.currentTimeMillis();
									if (this.method87(local81.anInt554, local81.aByteArray7)) {
										this.anInt177 = this.anIntArray68[local39];
										this.anInt274 = this.anIntArray48[local39];
									} else {
										local48 = true;
									}
								}
							} else if (!this.method88()) {
								local48 = true;
							}
						} catch (@Pc(131) Exception local131) {
						}
						if (local48 && this.anIntArray49[local39] != -5) {
							this.anIntArray49[local39] = -5;
						} else {
							this.anInt202--;
							for (local147 = local39; local147 < this.anInt202; local147++) {
								this.anIntArray68[local147] = this.anIntArray68[local147 + 1];
								this.anIntArray48[local147] = this.anIntArray48[local147 + 1];
								this.anIntArray49[local147] = this.anIntArray49[local147 + 1];
							}
							local39--;
						}
					} else {
						local199 = this.anIntArray49[local39]--;
					}
				}
				if (this.anInt156 > 0) {
					this.anInt156 -= 20;
					if (this.anInt156 < 0) {
						this.anInt156 = 0;
					}
					if (this.anInt156 == 0 && this.aBoolean49 && !aBoolean51) {
						this.method189(this.aString8, this.anInt267, this.anInt295);
					}
				}
				@Pc(253) Class1_Sub3_Sub3 local253 = Class8.method210(505);
				if (local253 != null) {
					this.aClass1_Sub3_Sub3_5.method380(81);
					this.aClass1_Sub3_Sub3_5.method382(local253.anInt554);
					this.aClass1_Sub3_Sub3_5.method389(local253.aByteArray7, local253.anInt554);
					local253.method379();
				}
				this.anInt152++;
				if (this.anInt152 > 750) {
					this.method122();
				}
				this.method100();
				this.method152();
				this.method161();
				this.method129();
				if ((super.anIntArray28[1] == 1 || super.anIntArray28[2] == 1 || super.anIntArray28[3] == 1 || super.anIntArray28[4] == 1) && this.anInt183++ > 5) {
					this.anInt183 = 0;
					this.aClass1_Sub3_Sub3_5.method380(189);
					this.aClass1_Sub3_Sub3_5.method382(this.anInt268);
					this.aClass1_Sub3_Sub3_5.method382(this.anInt269);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt288);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt210);
				}
				this.anInt320++;
				if (this.anInt206 != 0) {
					this.anInt205 += 20;
					if (this.anInt205 >= 400) {
						this.anInt206 = 0;
					}
				}
				if (this.anInt336 != 0) {
					this.anInt333++;
					if (this.anInt333 >= 15) {
						if (this.anInt336 == 2) {
							this.aBoolean34 = true;
						}
						if (this.anInt336 == 3) {
							this.aBoolean41 = true;
						}
						this.anInt336 = 0;
					}
				}
				@Pc(509) int local509;
				if (this.anInt174 != 0) {
					this.anInt171++;
					if (super.anInt138 > this.anInt175 + 5 || super.anInt138 < this.anInt175 - 5 || super.anInt139 > this.anInt176 + 5 || super.anInt139 < this.anInt176 - 5) {
						this.aBoolean45 = true;
					}
					if (super.anInt137 == 0) {
						if (this.anInt174 == 2) {
							this.aBoolean34 = true;
						}
						if (this.anInt174 == 3) {
							this.aBoolean41 = true;
						}
						this.anInt174 = 0;
						if (this.aBoolean45 && this.anInt171 >= 5) {
							this.anInt305 = -1;
							this.method84();
							if (this.anInt305 == this.anInt172 && this.anInt304 != this.anInt173) {
								@Pc(503) Class15 local503 = Class15.aClass15Array1[this.anInt172];
								local509 = local503.anIntArray149[this.anInt304];
								local503.anIntArray149[this.anInt304] = local503.anIntArray149[this.anInt173];
								local503.anIntArray149[this.anInt173] = local509;
								@Pc(531) int local531 = local503.anIntArray150[this.anInt304];
								local503.anIntArray150[this.anInt304] = local503.anIntArray150[this.anInt173];
								local503.anIntArray150[this.anInt173] = local531;
								this.aClass1_Sub3_Sub3_5.method380(159);
								this.aClass1_Sub3_Sub3_5.method382(this.anInt172);
								this.aClass1_Sub3_Sub3_5.method382(this.anInt173);
								this.aClass1_Sub3_Sub3_5.method382(this.anInt304);
							}
						} else if ((this.anInt341 == 1 || this.method175(this.anInt190 - 1)) && this.anInt190 > 2) {
							this.method171();
						} else if (this.anInt190 > 0) {
							this.method140(this.anInt190 - 1);
						}
						this.anInt333 = 10;
						super.anInt140 = 0;
					}
				}
				anInt200++;
				if (anInt200 > 127) {
					anInt200 = 0;
					this.aClass1_Sub3_Sub3_5.method380(215);
					this.aClass1_Sub3_Sub3_5.method384(4991788);
				}
				if (Class33.anInt708 != -1) {
					local147 = Class33.anInt708;
					local509 = Class33.anInt709;
					@Pc(654) boolean local654 = this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local509, true, 0, local147, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0);
					Class33.anInt708 = -1;
					if (local654) {
						this.anInt203 = super.anInt141;
						this.anInt204 = super.anInt142;
						this.anInt206 = 1;
						this.anInt205 = 0;
					}
				}
				if (super.anInt140 == 1 && this.aString14 != null) {
					this.aString14 = null;
					this.aBoolean41 = true;
					super.anInt140 = 0;
				}
				this.method194();
				this.method187();
				this.method136();
				this.method80();
				if (super.anInt137 == 1 || super.anInt140 == 1) {
					this.anInt282++;
				}
				if (this.anInt212 == 2) {
					this.method115();
				}
				if (this.anInt212 == 2 && this.aBoolean47) {
					this.method168();
				}
				for (local147 = 0; local147 < 5; local147++) {
					local199 = this.anIntArray41[local147]++;
				}
				this.method184();
				super.anInt136++;
				if (super.anInt136 > 4500) {
					this.anInt154 = 250;
					super.anInt136 -= 500;
					this.aClass1_Sub3_Sub3_5.method380(70);
				}
				this.anInt149++;
				if (this.anInt149 > 500) {
					this.anInt149 = 0;
					local509 = (int) (Math.random() * 8.0D);
					if ((local509 & 0x1) == 1) {
						this.anInt265 += this.anInt266;
					}
					if ((local509 & 0x2) == 2) {
						this.anInt313 += this.anInt314;
					}
					if ((local509 & 0x4) == 4) {
						this.anInt178 += this.anInt179;
					}
				}
				if (this.anInt265 < -50) {
					this.anInt266 = 2;
				}
				if (this.anInt265 > 50) {
					this.anInt266 = -2;
				}
				if (this.anInt313 < -55) {
					this.anInt314 = 2;
				}
				if (this.anInt313 > 55) {
					this.anInt314 = -2;
				}
				if (this.anInt178 < -40) {
					this.anInt179 = 1;
				}
				if (this.anInt178 > 40) {
					this.anInt179 = -1;
				}
				this.anInt315++;
				if (this.anInt315 > 500) {
					this.anInt315 = 0;
					local509 = (int) (Math.random() * 8.0D);
					if ((local509 & 0x1) == 1) {
						this.anInt288 += this.anInt289;
					}
					if ((local509 & 0x2) == 2) {
						this.anInt210 += this.anInt211;
					}
				}
				if (this.anInt288 < -60) {
					this.anInt289 = 2;
				}
				if (this.anInt288 > 60) {
					this.anInt289 = -2;
				}
				if (this.anInt210 < -20) {
					this.anInt211 = 1;
				}
				if (this.anInt210 > 10) {
					this.anInt211 = -1;
				}
				anInt241++;
				if (anInt241 > 110) {
					anInt241 = 0;
					this.aClass1_Sub3_Sub3_5.method380(236);
					this.aClass1_Sub3_Sub3_5.method385(0);
				}
				this.anInt153++;
				if (this.anInt153 > 50) {
					this.aClass1_Sub3_Sub3_5.method380(108);
				}
				try {
					if (this.aClass6_1 != null && this.aClass1_Sub3_Sub3_5.anInt554 > 0) {
						this.aClass6_1.method205(this.aClass1_Sub3_Sub3_5.aByteArray7, this.aClass1_Sub3_Sub3_5.anInt554);
						this.aClass1_Sub3_Sub3_5.anInt554 = 0;
						this.anInt153 = 0;
					}
				} catch (@Pc(1000) IOException local1000) {
					this.method122();
				} catch (@Pc(1005) Exception local1005) {
					this.method124();
				}
			}
		} catch (@Pc(1010) RuntimeException local1010) {
			signlink.reporterror("40530, " + -46235 + ", " + local1010.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
	@Override
	protected void method74(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			this.method86();
			if (this.aClass39_1 == null) {
				super.method74(arg0, arg1);
			} else {
				this.aClass32_22.method463();
				this.aClass1_Sub3_Sub2_Sub4_3.method362(180, 54, "RuneScape is loading - please wait...", 16777215);
				Class1_Sub3_Sub2.method359(304, 34, 62, 28, 9179409);
				Class1_Sub3_Sub2.method359(302, 32, 63, 29, 0);
				Class1_Sub3_Sub2.method358(64, arg1 * 3, 30, 30, 9179409);
				Class1_Sub3_Sub2.method358(64, 300 - arg1 * 3, arg1 * 3 + 30, 30, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method362(180, 85, arg0, 16777215);
				this.aClass32_22.method464(super.aGraphics2, 186, 214);
				if (this.aBoolean65) {
					this.aBoolean65 = false;
					if (!this.aBoolean48) {
						this.aClass32_23.method464(super.aGraphics2, 0, 0);
						this.aClass32_24.method464(super.aGraphics2, 0, 661);
					}
					this.aClass32_20.method464(super.aGraphics2, 0, 128);
					this.aClass32_21.method464(super.aGraphics2, 386, 214);
					this.aClass32_25.method464(super.aGraphics2, 265, 0);
					this.aClass32_26.method464(super.aGraphics2, 265, 574);
					this.aClass32_27.method464(super.aGraphics2, 186, 128);
					this.aClass32_28.method464(super.aGraphics2, 186, 574);
				}
			}
		} catch (@Pc(209) RuntimeException local209) {
			signlink.reporterror("24722, " + arg0 + ", " + arg1 + ", " + -745 + ", " + local209.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method120(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString4 = "";
				this.aString5 = "Connecting to server...";
				this.method93(884);
			}
			this.aClass6_1 = new Class6(this, this.method185(anInt244 + 43594), false);
			this.aClass6_1.method204(this.aClass1_Sub3_Sub3_6.aByteArray7, 0, 8);
			this.aClass1_Sub3_Sub3_6.anInt554 = 0;
			this.aLong9 = this.aClass1_Sub3_Sub3_6.method397((byte) 2);
			@Pc(47) int[] local47 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong9 >> 32), (int) this.aLong9 };
			this.aClass1_Sub3_Sub3_5.anInt554 = 0;
			this.aClass1_Sub3_Sub3_5.method381(10);
			this.aClass1_Sub3_Sub3_5.method385(local47[0]);
			this.aClass1_Sub3_Sub3_5.method385(local47[1]);
			this.aClass1_Sub3_Sub3_5.method385(local47[2]);
			this.aClass1_Sub3_Sub3_5.method385(local47[3]);
			this.aClass1_Sub3_Sub3_5.method385(signlink.anInt749);
			this.aClass1_Sub3_Sub3_5.method388(arg0);
			this.aClass1_Sub3_Sub3_5.method388(arg1);
			this.aClass1_Sub3_Sub3_5.method406(aBigInteger1, aBigInteger2);
			this.aClass1_Sub3_Sub3_4.anInt554 = 0;
			if (arg2) {
				this.aClass1_Sub3_Sub3_4.method381(18);
			} else {
				this.aClass1_Sub3_Sub3_4.method381(16);
			}
			this.aClass1_Sub3_Sub3_4.method381(this.aClass1_Sub3_Sub3_5.anInt554 + 36 + 1 + 1);
			this.aClass1_Sub3_Sub3_4.method381(222);
			this.aClass1_Sub3_Sub3_4.method381(aBoolean51 ? 1 : 0);
			for (@Pc(167) int local167 = 0; local167 < 9; local167++) {
				this.aClass1_Sub3_Sub3_4.method385(this.anIntArray66[local167]);
			}
			this.aClass1_Sub3_Sub3_4.method389(this.aClass1_Sub3_Sub3_5.aByteArray7, this.aClass1_Sub3_Sub3_5.anInt554);
			this.aClass1_Sub3_Sub3_5.aClass38_2 = new Class38((byte) 6, local47);
			for (@Pc(201) int local201 = 0; local201 < 4; local201++) {
				local47[local201] += 50;
			}
			this.aClass38_1 = new Class38((byte) 6, local47);
			this.aClass6_1.method205(this.aClass1_Sub3_Sub3_4.aByteArray7, this.aClass1_Sub3_Sub3_4.anInt554);
			@Pc(236) int local236 = this.aClass6_1.method202();
			if (local236 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(243) Exception local243) {
				}
				this.method120(arg0, arg1, arg2);
				return;
			}
			if (local236 == 2 || local236 == 18) {
				if (local236 == 18) {
					this.aBoolean64 = true;
				} else {
					this.aBoolean64 = false;
				}
				Class8.method209();
				this.aBoolean40 = true;
				this.aClass1_Sub3_Sub3_5.anInt554 = 0;
				this.aClass1_Sub3_Sub3_6.anInt554 = 0;
				this.anInt151 = -1;
				this.anInt277 = -1;
				this.anInt278 = -1;
				this.anInt279 = -1;
				this.anInt150 = 0;
				this.anInt152 = 0;
				this.anInt308 = 0;
				this.anInt154 = 0;
				this.anInt242 = 0;
				this.anInt190 = 0;
				this.aBoolean54 = false;
				super.anInt136 = 0;
				for (@Pc(317) int local317 = 0; local317 < 100; local317++) {
					this.aStringArray9[local317] = null;
				}
				this.anInt297 = 0;
				this.anInt160 = 0;
				this.anInt212 = 0;
				this.anInt202 = 0;
				this.anInt265 = (int) (Math.random() * 100.0D) - 50;
				this.anInt313 = (int) (Math.random() * 110.0D) - 55;
				this.anInt178 = (int) (Math.random() * 80.0D) - 40;
				this.anInt288 = (int) (Math.random() * 120.0D) - 60;
				this.anInt210 = (int) (Math.random() * 30.0D) - 20;
				this.anInt269 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.anInt281 = -1;
				this.anInt331 = 0;
				this.anInt332 = 0;
				this.anInt286 = 0;
				this.anInt249 = 0;
				for (@Pc(407) int local407 = 0; local407 < this.anInt284; local407++) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local407] = null;
					this.aClass1_Sub3_Sub3Array1[local407] = null;
				}
				for (@Pc(426) int local426 = 0; local426 < 8192; local426++) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local426] = null;
				}
				this.aClass1_Sub1_Sub3_Sub2_1 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anInt285] = new Class1_Sub1_Sub3_Sub2();
				this.aClass28_2.method460();
				this.aClass28_1.method460();
				this.aClass28_5.method460();
				@Pc(463) int local463;
				for (@Pc(459) int local459 = 0; local459 < 4; local459++) {
					for (local463 = 0; local463 < 104; local463++) {
						for (@Pc(467) int local467 = 0; local467 < 104; local467++) {
							this.aClass28ArrayArrayArray1[local459][local463][local467] = null;
						}
					}
				}
				this.aClass28_3 = new Class28((byte) 30);
				this.anInt208 = 0;
				this.anInt329 = -1;
				this.anInt196 = -1;
				this.anInt158 = -1;
				this.anInt322 = -1;
				this.aBoolean67 = false;
				this.anInt231 = 3;
				this.aBoolean35 = false;
				this.aBoolean54 = false;
				this.aBoolean56 = false;
				this.aString14 = null;
				this.anInt317 = 0;
				this.anInt318 = -1;
				this.aBoolean60 = true;
				this.method165(this.aBoolean39);
				for (local463 = 0; local463 < 5; local463++) {
					this.anIntArray30[local463] = 0;
				}
				anInt157 = 0;
				anInt316 = 0;
				anInt245 = 0;
				anInt262 = 0;
				anInt293 = 0;
				anInt198 = 0;
				anInt342 = 0;
				anInt164 = 0;
				anInt229 = 0;
				this.method138();
				return;
			}
			if (local236 == 3) {
				this.aString4 = "";
				this.aString5 = "Invalid username or password.";
				return;
			}
			if (local236 == 4) {
				this.aString4 = "Your account has been disabled.";
				this.aString5 = "Please check your message-centre for details.";
				return;
			}
			if (local236 == 5) {
				this.aString4 = "Your account is already logged in.";
				this.aString5 = "Try again in 60 secs...";
				return;
			}
			if (local236 == 6) {
				this.aString4 = "RuneScape has been updated!";
				this.aString5 = "Please reload this page.";
				return;
			}
			if (local236 == 7) {
				this.aString4 = "This world is full.";
				this.aString5 = "Please use a different world.";
				return;
			}
			if (local236 == 8) {
				this.aString4 = "Unable to connect.";
				this.aString5 = "Login server offline.";
				return;
			}
			if (local236 == 9) {
				this.aString4 = "Login limit exceeded.";
				this.aString5 = "Too many connections from your address.";
				return;
			}
			if (local236 == 10) {
				this.aString4 = "Unable to connect.";
				this.aString5 = "Bad session id.";
				return;
			}
			if (local236 == 11) {
				this.aString5 = "Login server rejected session.";
				this.aString5 = "Please try again.";
				return;
			}
			if (local236 == 12) {
				this.aString4 = "You need a members account to login to this world.";
				this.aString5 = "Please subscribe, or use a different world.";
				return;
			}
			if (local236 == 13) {
				this.aString4 = "Could not complete login.";
				this.aString5 = "Please try using a different world.";
				return;
			}
			if (local236 == 14) {
				this.aString4 = "The server is being updated.";
				this.aString5 = "Please wait 1 minute and try again.";
				return;
			}
			if (local236 == 15) {
				this.aBoolean40 = true;
				this.aClass1_Sub3_Sub3_5.anInt554 = 0;
				this.aClass1_Sub3_Sub3_6.anInt554 = 0;
				this.anInt151 = -1;
				this.anInt277 = -1;
				this.anInt278 = -1;
				this.anInt279 = -1;
				this.anInt150 = 0;
				this.anInt152 = 0;
				this.anInt308 = 0;
				this.anInt190 = 0;
				this.aBoolean54 = false;
				return;
			}
			if (local236 == 16) {
				this.aString4 = "Login attempts exceeded.";
				this.aString5 = "Please wait 1 minute and try again.";
				return;
			}
			if (local236 == 17) {
				this.aString4 = "You are standing in a members-only area.";
				this.aString5 = "To play on this world move to a free area first";
				return;
			}
		} catch (@Pc(762) IOException local762) {
			this.aString4 = "";
			this.aString5 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method121() {
		try {
			if (this.aClass1_Sub1_Sub3_Sub2_1.anInt890 >> 7 == this.anInt331 && this.aClass1_Sub1_Sub3_Sub2_1.anInt891 >> 7 == this.anInt332) {
				this.anInt331 = 0;
			}
			for (@Pc(30) int local30 = -1; local30 < this.anInt286; local30++) {
				@Pc(38) Class1_Sub1_Sub3_Sub2 local38;
				@Pc(43) int local43;
				if (local30 == -1) {
					local38 = this.aClass1_Sub1_Sub3_Sub2_1;
					local43 = this.anInt285 << 14;
				} else {
					local38 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray62[local30]];
					local43 = this.anIntArray62[local30] << 14;
				}
				if (local38 != null && local38.method571()) {
					local38.aBoolean162 = false;
					if ((aBoolean51 && this.anInt286 > 50 || this.anInt286 > 200) && local30 != -1 && local38.anInt912 == local38.anInt894) {
						local38.aBoolean162 = true;
					}
					@Pc(95) int local95 = local38.anInt890 >> 7;
					@Pc(100) int local100 = local38.anInt891 >> 7;
					if (local95 >= 0 && local95 < 104 && local100 >= 0 && local100 < 104) {
						if (local38.aClass1_Sub3_Sub1_11 == null || anInt280 < local38.anInt944 || anInt280 >= local38.anInt945) {
							if ((local38.anInt890 & 0x7F) == 64 && (local38.anInt891 & 0x7F) == 64) {
								if (this.anIntArrayArray4[local95][local100] == this.anInt275) {
									continue;
								}
								this.anIntArrayArray4[local95][local100] = this.anInt275;
							}
							local38.anInt943 = this.method199(local38.anInt891, this.anInt219, local38.anInt890);
							this.aClass33_1.method478(60, local38.anInt890, local38.anInt891, null, local43, local38.anInt943, local38.anInt892, this.anInt219, local38, local38.aBoolean159);
						} else {
							local38.aBoolean162 = false;
							local38.anInt943 = this.method199(local38.anInt891, this.anInt219, local38.anInt890);
							this.aClass33_1.method479(null, local38.anInt891, local38.anInt950, local43, local38, local38.anInt951, local38.anInt949, local38.anInt890, 911, local38.anInt943, local38.anInt892, this.anInt219, local38.anInt952);
						}
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("72604, " + 103 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method122() {
		try {
			if (this.anInt154 > 0) {
				this.method124();
			} else {
				this.aClass32_18.method463();
				this.aClass1_Sub3_Sub2_Sub4_2.method362(257, 144, "Connection lost", 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(256, 143, "Connection lost", 16777215);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(257, 159, "Please wait - attempting to reestablish", 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(256, 158, "Please wait - attempting to reestablish", 16777215);
				this.aClass32_18.method464(super.aGraphics2, 11, 8);
				this.anInt331 = 0;
				@Pc(64) Class6 local64 = this.aClass6_1;
				this.aBoolean40 = false;
				this.method120(this.aString10, this.aString11, true);
				if (!this.aBoolean40) {
					this.method124();
				}
				try {
					local64.method201();
				} catch (@Pc(84) Exception local84) {
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("84043, " + -84 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method123(@OriginalArg(0) int arg0) {
		try {
			this.anInt167 = 0;
			@Pc(54) int local54;
			@Pc(74) int local74;
			for (@Pc(6) int local6 = -1; local6 < this.anInt286 + this.anInt249; local6++) {
				@Pc(14) Class1_Sub1_Sub3 local14;
				if (local6 == -1) {
					local14 = this.aClass1_Sub1_Sub3_Sub2_1;
				} else if (local6 < this.anInt286) {
					local14 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray62[local6]];
				} else {
					local14 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray54[local6 - this.anInt286]];
				}
				if (local14 != null && local14.method571()) {
					if (local6 < this.anInt286) {
						local54 = 30;
						@Pc(57) Class1_Sub1_Sub3_Sub2 local57 = (Class1_Sub1_Sub3_Sub2) local14;
						if (local57.anInt941 != 0) {
							this.method127(local14.anInt933 + 15, local14);
							if (this.anInt216 > -1) {
								for (local74 = 0; local74 < 8; local74++) {
									if ((local57.anInt941 & 0x1 << local74) != 0) {
										this.aClass1_Sub3_Sub2_Sub2Array5[local74].method322(this.anInt217 - local54, this.anInt216 - 12);
										local54 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt242 == 10 && this.anInt283 == this.anIntArray62[local6]) {
							this.method127(local14.anInt933 + 15, local14);
							if (this.anInt216 > -1) {
								this.aClass1_Sub3_Sub2_Sub2Array5[7].method322(this.anInt217 - local54, this.anInt216 - 12);
							}
						}
					} else if (this.anInt242 == 1 && this.anInt272 == this.anIntArray54[local6 - this.anInt286] && anInt280 % 20 < 10) {
						this.method127(local14.anInt933 + 15, local14);
						if (this.anInt216 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array5[2].method322(this.anInt217 - 28, this.anInt216 - 12);
						}
					}
					if (local14.aString29 != null && (local6 >= this.anInt286 || this.anInt339 == 0 || this.anInt339 == 3 || this.anInt339 == 1 && this.method174(((Class1_Sub1_Sub3_Sub2) local14).aString30))) {
						this.method127(local14.anInt933, local14);
						if (this.anInt216 > -1 && this.anInt167 < this.anInt168) {
							this.anIntArray36[this.anInt167] = this.aClass1_Sub3_Sub2_Sub4_3.method364(local14.aString29) / 2;
							this.anIntArray35[this.anInt167] = this.aClass1_Sub3_Sub2_Sub4_3.anInt535;
							this.anIntArray33[this.anInt167] = this.anInt216;
							this.anIntArray34[this.anInt167] = this.anInt217;
							this.anIntArray37[this.anInt167] = local14.anInt902;
							this.anIntArray38[this.anInt167] = local14.anInt903;
							this.anIntArray39[this.anInt167] = local14.anInt901;
							this.aStringArray5[this.anInt167++] = local14.aString29;
							if (this.anInt221 == 0 && local14.anInt903 == 1) {
								this.anIntArray35[this.anInt167] += 10;
								this.anIntArray34[this.anInt167] += 5;
							}
							if (this.anInt221 == 0 && local14.anInt903 == 2) {
								this.anIntArray36[this.anInt167] = 60;
							}
						}
					}
					if (local14.anInt906 > anInt280 + 100) {
						this.method127(local14.anInt933 + 15, local14);
						if (this.anInt216 > -1) {
							local54 = local14.anInt907 * 30 / local14.anInt908;
							if (local54 > 30) {
								local54 = 30;
							}
							Class1_Sub3_Sub2.method358(this.anInt217 - 3, local54, this.anInt216 - 15, 5, 65280);
							Class1_Sub3_Sub2.method358(this.anInt217 - 3, 30 - local54, this.anInt216 + local54 - 15, 5, 16711680);
						}
					}
					if (local14.anInt906 > anInt280 + 330) {
						this.method127(local14.anInt933 / 2, local14);
						if (this.anInt216 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array7[local14.anInt905].method322(this.anInt217 - 12, this.anInt216 - 12);
							this.aClass1_Sub3_Sub2_Sub4_1.method362(this.anInt216, this.anInt217 + 4, String.valueOf(local14.anInt904), 0);
							this.aClass1_Sub3_Sub2_Sub4_1.method362(this.anInt216 - 1, this.anInt217 + 3, String.valueOf(local14.anInt904), 16777215);
						}
					}
				}
			}
			@Pc(470) int local470;
			if (arg0 != 0) {
				for (local470 = 1; local470 > 0; local470++) {
				}
			}
			for (local470 = 0; local470 < this.anInt167; local470++) {
				local54 = this.anIntArray33[local470];
				@Pc(489) int local489 = this.anIntArray34[local470];
				local74 = this.anIntArray36[local470];
				@Pc(499) int local499 = this.anIntArray35[local470];
				@Pc(501) boolean local501 = true;
				while (local501) {
					local501 = false;
					for (@Pc(507) int local507 = 0; local507 < local470; local507++) {
						if (local489 + 2 > this.anIntArray34[local507] - this.anIntArray35[local507] && local489 - local499 < this.anIntArray34[local507] + 2 && local54 - local74 < this.anIntArray33[local507] + this.anIntArray36[local507] && local54 + local74 > this.anIntArray33[local507] - this.anIntArray36[local507] && this.anIntArray34[local507] - this.anIntArray35[local507] < local489) {
							local489 = this.anIntArray34[local507] - this.anIntArray35[local507];
							local501 = true;
						}
					}
				}
				this.anInt216 = this.anIntArray33[local470];
				this.anInt217 = this.anIntArray34[local470] = local489;
				@Pc(606) String local606 = this.aStringArray5[local470];
				if (this.anInt221 == 0) {
					@Pc(611) int local611 = 16776960;
					if (this.anIntArray37[local470] < 6) {
						local611 = this.anIntArray73[this.anIntArray37[local470]];
					}
					if (this.anIntArray37[local470] == 6) {
						local611 = this.anInt275 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray37[local470] == 7) {
						local611 = this.anInt275 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray37[local470] == 8) {
						local611 = this.anInt275 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(686) int local686;
					if (this.anIntArray37[local470] == 9) {
						local686 = 150 - this.anIntArray39[local470];
						if (local686 < 50) {
							local611 = local686 * 1280 + 16711680;
						} else if (local686 < 100) {
							local611 = 16776960 - (local686 - 50) * 327680;
						} else if (local686 < 150) {
							local611 = (local686 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray37[local470] == 10) {
						local686 = 150 - this.anIntArray39[local470];
						if (local686 < 50) {
							local611 = local686 * 5 + 16711680;
						} else if (local686 < 100) {
							local611 = 16711935 - (local686 - 50) * 327680;
						} else if (local686 < 150) {
							local611 = (local686 - 100) * 327680 + 255 - (local686 - 100) * 5;
						}
					}
					if (this.anIntArray37[local470] == 11) {
						local686 = 150 - this.anIntArray39[local470];
						if (local686 < 50) {
							local611 = 16777215 - local686 * 327685;
						} else if (local686 < 100) {
							local611 = (local686 - 50) * 327685 + 65280;
						} else if (local686 < 150) {
							local611 = 16777215 - (local686 - 100) * 327680;
						}
					}
					if (this.anIntArray38[local470] == 0) {
						this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt216, this.anInt217 + 1, local606, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt216, this.anInt217, local606, local611);
					}
					if (this.anIntArray38[local470] == 1) {
						this.aClass1_Sub3_Sub2_Sub4_3.method366(this.anInt217 + 1, this.anInt216, local606, 0, this.anInt275);
						this.aClass1_Sub3_Sub2_Sub4_3.method366(this.anInt217, this.anInt216, local606, local611, this.anInt275);
					}
					if (this.anIntArray38[local470] == 2) {
						local686 = this.aClass1_Sub3_Sub2_Sub4_3.method364(local606);
						@Pc(907) int local907 = (150 - this.anIntArray39[local470]) * (local686 + 100) / 150;
						Class1_Sub3_Sub2.method356(this.anInt216 - 50, this.anInt216 + 50, 334, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method365(this.anInt217 + 1, local606, 0, this.anInt216 + 50 - local907);
						this.aClass1_Sub3_Sub2_Sub4_3.method365(this.anInt217, local606, local611, this.anInt216 + 50 - local907);
						Class1_Sub3_Sub2.method355();
					}
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt216, this.anInt217 + 1, local606, 0);
					this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt216, this.anInt217, local606, 16776960);
				}
			}
		} catch (@Pc(982) RuntimeException local982) {
			signlink.reporterror("39615, " + arg0 + ", " + local982.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method124() {
		try {
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method201();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass6_1 = null;
			this.aBoolean40 = false;
			this.anInt321 = 0;
			this.aString10 = "";
			this.aString11 = "";
			Class8.method209();
			this.method196();
			this.aClass33_1.method467();
			for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
				this.aClass9Array1[local40].method249();
			}
			System.gc();
			this.method94();
			this.aString8 = null;
			this.anInt156 = 0;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("24101, " + false + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBLclient!kb;)V")
	private void method125(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt555 + 21 < arg0 * 8) {
					@Pc(24) int local24 = arg1.method402(13);
					if (local24 != 8191) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local24] == null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local24] = new Class1_Sub1_Sub3_Sub1();
						}
						@Pc(44) Class1_Sub1_Sub3_Sub1 local44 = this.aClass1_Sub1_Sub3_Sub1Array1[local24];
						this.anIntArray54[this.anInt249++] = local24;
						local44.anInt932 = anInt280;
						local44.aClass3_1 = Class3.method32(arg1.method402(11));
						local44.anInt893 = local44.aClass3_1.aByte6;
						local44.anInt896 = local44.aClass3_1.anInt73;
						local44.anInt897 = local44.aClass3_1.anInt74;
						local44.anInt898 = local44.aClass3_1.anInt75;
						local44.anInt899 = local44.aClass3_1.anInt76;
						local44.anInt894 = local44.aClass3_1.anInt72;
						@Pc(100) int local100 = arg1.method402(5);
						if (local100 > 15) {
							local100 -= 32;
						}
						@Pc(109) int local109 = arg1.method402(5);
						if (local109 > 15) {
							local109 -= 32;
						}
						local44.method569(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + local100, false, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + local109);
						@Pc(136) int local136 = arg1.method402(1);
						if (local136 == 1) {
							this.anIntArray63[this.anInt287++] = local24;
						}
						continue;
					}
				}
				arg1.method403();
				return;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("93417, " + arg0 + ", " + -55 + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method72() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("16671, " + -66 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method126(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub3_Sub3_5.method380(231);
			if (this.anInt322 != -1) {
				this.anInt322 = -1;
				this.aBoolean34 = true;
				this.aBoolean67 = false;
				this.aBoolean59 = true;
			}
			if (this.anInt196 != -1) {
				this.anInt196 = -1;
				this.aBoolean41 = true;
				this.aBoolean67 = false;
			}
			this.anInt158 = -1;
			@Pc(40) int local40 = 45 / arg0;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("99955, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!x;)V")
	private void method127(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.method128((byte) 8, arg1.anInt891, arg0, arg1.anInt890);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("44820, " + arg0 + ", " + true + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)V")
	private void method128(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method199(arg1, this.anInt219, arg3) - arg2;
				@Pc(33) int local33 = arg3 - this.anInt255;
				@Pc(38) int local38 = local28 - this.anInt256;
				@Pc(43) boolean local43 = false;
				@Pc(58) int local58 = arg1 - this.anInt257;
				@Pc(63) int local63 = Class1_Sub3_Sub1.anIntArray124[this.anInt258];
				@Pc(68) int local68 = Class1_Sub3_Sub1.anIntArray125[this.anInt258];
				@Pc(73) int local73 = Class1_Sub3_Sub1.anIntArray124[this.anInt259];
				@Pc(78) int local78 = Class1_Sub3_Sub1.anIntArray125[this.anInt259];
				@Pc(88) int local88 = local58 * local73 + local33 * local78 >> 16;
				@Pc(98) int local98 = local58 * local78 - local33 * local73 >> 16;
				@Pc(100) int local100 = local88;
				@Pc(110) int local110 = local38 * local68 - local98 * local63 >> 16;
				@Pc(120) int local120 = local38 * local63 + local98 * local68 >> 16;
				if (local120 >= 50) {
					this.anInt216 = Class1_Sub3_Sub2_Sub1.anInt426 + (local100 << 9) / local120;
					this.anInt217 = Class1_Sub3_Sub2_Sub1.anInt427 + (local110 << 9) / local120;
				} else {
					this.anInt216 = -1;
					this.anInt217 = -1;
				}
			} else {
				this.anInt216 = -1;
				this.anInt217 = -1;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("39685, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method129() {
		try {
			if (this.anInt212 == 2) {
				for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) this.aClass28_5.method456(); local15 != null; local15 = (Class1_Sub5) this.aClass28_5.method458()) {
					if (anInt280 >= local15.anInt628) {
						this.method106(local15.anInt624, this.anInt191, local15.anInt622, local15.anInt625, local15.anInt627, local15.anInt626, local15.anInt621, local15.anInt623);
						local15.method567();
					}
				}
				anInt246++;
				if (anInt246 > 85) {
					anInt246 = 0;
					this.aClass1_Sub3_Sub3_5.method380(85);
					return;
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("75066, " + -755 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;I)V")
	private void method130(@OriginalArg(0) Class15 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt468;
			if (local4 >= 1 && local4 <= 100) {
				local4--;
				if (local4 >= this.anInt208) {
					arg0.aString20 = "";
					arg0.anInt467 = 0;
				} else {
					arg0.aString20 = this.aStringArray7[local4];
					arg0.anInt467 = 1;
				}
			} else if (local4 >= 101 && local4 <= 200) {
				local4 -= 101;
				if (local4 >= this.anInt208) {
					arg0.aString20 = "";
					arg0.anInt467 = 0;
				} else {
					if (this.anIntArray69[local4] == 0) {
						arg0.aString20 = "@red@Offline";
					} else if (this.anIntArray69[local4] == anInt243) {
						arg0.aString20 = "@gre@World-" + (this.anIntArray69[local4] - 9);
					} else {
						arg0.aString20 = "@yel@World-" + (this.anIntArray69[local4] - 9);
					}
					arg0.anInt467 = 1;
				}
			} else if (local4 == 203) {
				arg0.anInt474 = this.anInt208 * 15 + 20;
				if (arg0.anInt474 <= arg0.anInt470) {
					arg0.anInt474 = arg0.anInt470 + 1;
				}
			} else if (local4 >= 401 && local4 <= 500) {
				local4 -= 401;
				if (local4 >= this.anInt261) {
					arg0.aString20 = "";
					arg0.anInt467 = 0;
				} else {
					arg0.aString20 = Class40.method542(Class40.method539(this.aLongArray3[local4]));
					arg0.anInt467 = 1;
				}
			} else if (local4 == 503) {
				arg0.anInt474 = this.anInt261 * 15 + 20;
				if (arg0.anInt474 <= arg0.anInt470) {
					arg0.anInt474 = arg0.anInt470 + 1;
				}
			} else if (local4 == 327) {
				arg0.anInt485 = 150;
				arg0.anInt486 = (int) (Math.sin((double) anInt280 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean58) {
					this.aBoolean58 = false;
					@Pc(213) Class1_Sub3_Sub1[] local213 = new Class1_Sub3_Sub1[7];
					@Pc(215) int local215 = 0;
					for (@Pc(217) int local217 = 0; local217 < 7; local217++) {
						@Pc(224) int local224 = this.anIntArray76[local217];
						if (local224 >= 0) {
							local213[local215++] = Class13.aClass13Array1[local224].method306();
						}
					}
					@Pc(245) Class1_Sub3_Sub1 local245 = new Class1_Sub3_Sub1(-406, local213, local215);
					for (@Pc(247) int local247 = 0; local247 < 5; local247++) {
						if (this.anIntArray30[local247] != 0) {
							local245.method237(anIntArrayArray2[local247][0], anIntArrayArray2[local247][this.anIntArray30[local247]]);
							if (local247 == 1) {
								local245.method237(anIntArray84[0], anIntArray84[this.anIntArray30[local247]]);
							}
						}
					}
					local245.method230();
					local245.method231(Class19.aClass19Array1[this.aClass1_Sub1_Sub3_Sub2_1.anInt894].anIntArray186[0]);
					local245.method240(64, 850, -30, -50, -30, true);
					arg0.aClass1_Sub3_Sub1_2 = local245;
				}
			} else if (local4 == 324) {
				if (this.aClass1_Sub3_Sub2_Sub2_10 == null) {
					this.aClass1_Sub3_Sub2_Sub2_10 = arg0.aClass1_Sub3_Sub2_Sub2_12;
					this.aClass1_Sub3_Sub2_Sub2_11 = arg0.aClass1_Sub3_Sub2_Sub2_13;
				}
				if (this.aBoolean60) {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_11;
				} else {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_10;
				}
			} else if (local4 == 325) {
				if (this.aClass1_Sub3_Sub2_Sub2_10 == null) {
					this.aClass1_Sub3_Sub2_Sub2_10 = arg0.aClass1_Sub3_Sub2_Sub2_12;
					this.aClass1_Sub3_Sub2_Sub2_11 = arg0.aClass1_Sub3_Sub2_Sub2_13;
				}
				if (this.aBoolean60) {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_10;
				} else {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_11;
				}
			} else if (local4 == 600) {
				arg0.aString20 = this.aString13;
				if (anInt280 % 20 < 10) {
					arg0.aString20 = arg0.aString20 + "|";
				} else {
					arg0.aString20 = arg0.aString20 + " ";
				}
			} else {
				if (local4 == 613) {
					if (!this.aBoolean64) {
						arg0.aString20 = "";
					} else if (this.aBoolean44) {
						arg0.anInt479 = 16711680;
						arg0.aString20 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.anInt479 = 16777215;
						arg0.aString20 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(445) String local445;
				if (local4 == 650 || local4 == 655) {
					if (this.anInt180 == 0) {
						arg0.aString20 = "";
					} else {
						if (this.anInt309 == 0) {
							local445 = "earlier today";
						} else if (this.anInt309 == 1) {
							local445 = "yesterday";
						} else {
							local445 = this.anInt309 + " days ago";
						}
						arg0.aString20 = "You last logged in " + local445 + " from: " + signlink.dns;
					}
				}
				if (local4 == 651) {
					if (this.anInt264 == 0) {
						arg0.aString20 = "0 unread messages";
						arg0.anInt479 = 16776960;
					}
					if (this.anInt264 == 1) {
						arg0.aString20 = "1 unread message";
						arg0.anInt479 = 65280;
					}
					if (this.anInt264 > 1) {
						arg0.aString20 = this.anInt264 + " unread messages";
						arg0.anInt479 = 65280;
					}
				}
				if (local4 == 652) {
					if (this.anInt207 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt207 == 200) {
						arg0.aString20 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt207 == 0) {
							local445 = "Earlier today";
						} else if (this.anInt207 == 1) {
							local445 = "Yesterday";
						} else {
							local445 = this.anInt207 + " days ago";
						}
						arg0.aString20 = local445 + " you changed your recovery questions";
					}
				}
				if (local4 == 653) {
					if (this.anInt207 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt207 == 200) {
						arg0.aString20 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.aString20 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local4 == 654) {
					if (this.anInt207 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt207 == 200) {
						arg0.aString20 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.aString20 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(627) RuntimeException local627) {
			signlink.reporterror("36397, " + arg0 + ", " + 14658 + ", " + local627.toString());
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
				return new URL("http://127.0.0.1:" + (anInt244 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hb;III)V")
	private void method131(@OriginalArg(0) Class1_Sub3_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt269 + this.anInt288 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub3_Sub1.anIntArray124[local7];
				@Pc(27) int local27 = Class1_Sub3_Sub1.anIntArray125[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt210 + 256);
				@Pc(53) int local53 = local27 * 256 / (this.anInt210 + 256);
				@Pc(63) int local63 = arg2 * local36 + arg1 * local53 >> 16;
				@Pc(73) int local73 = arg2 * local53 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg0.method329(this.aClass1_Sub3_Sub2_Sub3_15, local63 + 94 - arg0.anInt460 / 2, 83 - local73 - arg0.anInt461 / 2);
				} else {
					arg0.method322(83 - local73 - arg0.anInt461 / 2, local63 + 94 - arg0.anInt460 / 2);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("79393, " + arg0 + ", " + arg1 + ", " + -508 + ", " + arg2 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method132() {
		try {
			this.aClass32_19.method463();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray86;
			this.aClass1_Sub3_Sub2_Sub3_16.method350(0, 0);
			if (this.aBoolean56) {
				this.aClass1_Sub3_Sub2_Sub4_3.method362(239, 40, this.aString18, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method362(239, 60, this.aString9 + "*", 128);
			} else if (this.aBoolean35) {
				this.aClass1_Sub3_Sub2_Sub4_3.method362(239, 40, "Enter amount:", 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method362(239, 60, this.aString7 + "*", 128);
			} else if (this.aString14 != null) {
				this.aClass1_Sub3_Sub2_Sub4_3.method362(239, 40, this.aString14, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method362(239, 60, "Click to continue", 128);
			} else if (this.anInt196 != -1) {
				this.method75(0, 0, Class15.aClass15Array1[this.anInt196], 0);
			} else if (this.anInt329 == -1) {
				@Pc(134) Class1_Sub3_Sub2_Sub4 local134 = this.aClass1_Sub3_Sub2_Sub4_2;
				@Pc(136) int local136 = 0;
				Class1_Sub3_Sub2.method356(0, 463, 77, 0);
				for (@Pc(144) int local144 = 0; local144 < 100; local144++) {
					if (this.aStringArray9[local144] != null) {
						@Pc(156) int local156 = this.anIntArray53[local144];
						@Pc(165) int local165 = this.anInt163 + 70 - local136 * 14;
						if (local156 == 0) {
							if (local165 > 0 && local165 < 110) {
								local134.method365(local165, this.aStringArray9[local144], 0, 4);
							}
							local136++;
						}
						if (local156 == 1) {
							if (local165 > 0 && local165 < 110) {
								local134.method365(local165, this.aStringArray8[local144] + ":", 16777215, 4);
								local134.method365(local165, this.aStringArray9[local144], 255, local134.method364(this.aStringArray8[local144]) + 12);
							}
							local136++;
						}
						if (local156 == 2 && (this.anInt339 == 0 || this.anInt339 == 1 && this.method174(this.aStringArray8[local144]))) {
							if (local165 > 0 && local165 < 110) {
								local134.method365(local165, this.aStringArray8[local144] + ":", 0, 4);
								local134.method365(local165, this.aStringArray9[local144], 255, local134.method364(this.aStringArray8[local144]) + 12);
							}
							local136++;
						}
						if ((local156 == 3 || local156 == 7) && this.anInt296 == 0 && (local156 == 7 || this.anInt155 == 0 || this.anInt155 == 1 && this.method174(this.aStringArray8[local144]))) {
							if (local165 > 0 && local165 < 110) {
								local134.method365(local165, "From " + this.aStringArray8[local144] + ":", 0, 4);
								local134.method365(local165, this.aStringArray9[local144], 8388608, local134.method364("From " + this.aStringArray8[local144]) + 12);
							}
							local136++;
						}
						if (local156 == 4 && (this.anInt230 == 0 || this.anInt230 == 1 && this.method174(this.aStringArray8[local144]))) {
							if (local165 > 0 && local165 < 110) {
								local134.method365(local165, this.aStringArray8[local144] + " " + this.aStringArray9[local144], 8388736, 4);
							}
							local136++;
						}
						if (local156 == 5 && this.anInt296 == 0 && this.anInt155 < 2) {
							if (local165 > 0 && local165 < 110) {
								local134.method365(local165, this.aStringArray9[local144], 8388608, 4);
							}
							local136++;
						}
						if (local156 == 6 && this.anInt296 == 0 && this.anInt155 < 2) {
							if (local165 > 0 && local165 < 110) {
								local134.method365(local165, "To " + this.aStringArray8[local144] + ":", 0, 4);
								local134.method365(local165, this.aStringArray9[local144], 8388608, local134.method364("To " + this.aStringArray8[local144]) + 12);
							}
							local136++;
						}
						if (local156 == 8 && (this.anInt230 == 0 || this.anInt230 == 1 && this.method174(this.aStringArray8[local144]))) {
							if (local165 > 0 && local165 < 110) {
								local134.method365(local165, this.aStringArray8[local144] + " " + this.aStringArray9[local144], 13350793, 4);
							}
							local136++;
						}
					}
				}
				Class1_Sub3_Sub2.method355();
				this.anInt209 = local136 * 14 + 7;
				if (this.anInt209 < 78) {
					this.anInt209 = 78;
				}
				this.method107(this.anInt209, 0, 77, this.anInt209 - this.anInt163 - 77, 463);
				local134.method365(90, Class40.method542(this.aString10) + ":", 0, 4);
				local134.method365(90, this.aString12 + "*", 255, local134.method364(this.aString10 + ": ") + 6);
				Class1_Sub3_Sub2.method360(77, 0, 479, 0, this.anInt232);
			} else {
				this.method75(0, 0, Class15.aClass15Array1[this.anInt329], 0);
			}
			if (this.aBoolean54 && this.anInt184 == 2) {
				this.method113();
			}
			this.aClass32_19.method464(super.aGraphics2, 375, 22);
			this.aClass32_18.method463();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray88;
		} catch (@Pc(651) RuntimeException local651) {
			signlink.reporterror("12699, " + 2 + ", " + local651.toString());
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

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class28 local9 = this.aClass28ArrayArrayArray1[this.anInt219][arg0][arg1];
		if (local9 == null) {
			this.aClass33_1.method493(this.anInt219, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub7 local23 = null;
		@Pc(27) Class1_Sub7 local27;
		@Pc(35) int local35;
		for (local27 = (Class1_Sub7) local9.method456(); local27 != null; local27 = (Class1_Sub7) local9.method458()) {
			@Pc(32) Class5 local32 = Class5.method54(local27.anInt766);
			local35 = local32.anInt114;
			if (local32.aBoolean29) {
				local35 *= local27.anInt767 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method454(local23, (byte) 4);
		@Pc(65) int local65 = -1;
		local35 = -1;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = 0;
		for (local27 = (Class1_Sub7) local9.method456(); local27 != null; local27 = (Class1_Sub7) local9.method458()) {
			if (local27.anInt766 != local23.anInt766 && local65 == -1) {
				local65 = local27.anInt766;
				local69 = local27.anInt767;
			}
			if (local27.anInt766 != local23.anInt766 && local27.anInt766 != local65 && local35 == -1) {
				local35 = local27.anInt766;
				local71 = local27.anInt767;
			}
		}
		@Pc(118) Class1_Sub3_Sub1 local118 = null;
		if (local65 != -1) {
			local118 = Class5.method54(local65).method58(local69);
		}
		@Pc(128) Class1_Sub3_Sub1 local128 = null;
		if (local35 != -1) {
			local128 = Class5.method54(local35).method58(local71);
		}
		@Pc(144) int local144 = arg0 + (arg1 << 7) + 1610612736;
		@Pc(148) Class5 local148 = Class5.method54(local23.anInt766);
		this.aClass33_1.method474(local148.method58(local23.anInt767), local144, this.method199(arg1 * 128 + 64, this.anInt219, arg0 * 128 + 64), arg0, this.anInt219, arg1, local128, local118, this.aBoolean37);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method135(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean71 = false;
			@Pc(9) boolean local9 = false;
			while (this.aBoolean63) {
				try {
					Thread.sleep(50L);
				} catch (@Pc(25) Exception local25) {
				}
				@Pc(28) Object local28 = this.anObject1;
				@Pc(33) String local33;
				@Pc(36) int local36;
				@Pc(39) int local39;
				synchronized (this.anObject1) {
					local33 = this.aString15;
					local36 = this.anInt169;
					local39 = this.anInt291;
					this.aString15 = null;
					this.anInt169 = 0;
					this.anInt291 = 0;
				}
				if (local33 != null) {
					@Pc(66) byte[] local66 = signlink.cacheload(local33 + ".mid");
					@Pc(83) int local83;
					if (local66 != null && local36 != 12345678) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local66);
						local83 = (int) this.aCRC32_1.getValue();
						if (local83 != local36) {
							local66 = null;
						}
					}
					if (local66 == null) {
						try {
							@Pc(105) DataInputStream local105 = this.method139(local33 + "_" + local36 + ".mid");
							local66 = new byte[local39];
							@Pc(120) int local120;
							for (@Pc(110) int local110 = 0; local110 < local39; local110 += local120) {
								local120 = local105.read(local66, local110, local39 - local110);
								if (local120 == -1) {
									@Pc(126) byte[] local126 = new byte[local110];
									for (@Pc(128) int local128 = 0; local128 < local110; local128++) {
										local126[local128] = local66[local128];
									}
									local66 = local126;
									local39 = local110;
									break;
								}
							}
							local105.close();
							signlink.cachesave(local33 + ".mid", local66);
						} catch (@Pc(167) Exception local167) {
						}
					}
					if (local66 == null) {
						return;
					}
					local83 = (new Class1_Sub3_Sub3((byte) 64, local66)).method396();
					@Pc(181) byte[] local181 = new byte[local83];
					Class34.method519(local181, local83, local66, local39, 4);
					this.method96(local181, true, local83);
				}
			}
		} catch (@Pc(199) RuntimeException local199) {
			signlink.reporterror("71268, " + arg0 + ", " + local199.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean33) {
			this.method195();
		} else if (this.aBoolean71) {
			this.method135((byte) 2);
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method136() {
		try {
			if (super.anInt140 == 1) {
				if (super.anInt141 >= 549 && super.anInt141 <= 583 && super.anInt142 >= 195 && super.anInt142 < 231 && this.anIntArray32[0] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 0;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 579 && super.anInt141 <= 609 && super.anInt142 >= 194 && super.anInt142 < 231 && this.anIntArray32[1] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 1;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 607 && super.anInt141 <= 637 && super.anInt142 >= 194 && super.anInt142 < 231 && this.anIntArray32[2] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 2;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 635 && super.anInt141 <= 679 && super.anInt142 >= 194 && super.anInt142 < 229 && this.anIntArray32[3] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 3;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 676 && super.anInt141 <= 706 && super.anInt142 >= 194 && super.anInt142 < 231 && this.anIntArray32[4] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 4;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 704 && super.anInt141 <= 734 && super.anInt142 >= 194 && super.anInt142 < 231 && this.anIntArray32[5] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 5;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 732 && super.anInt141 <= 766 && super.anInt142 >= 195 && super.anInt142 < 231 && this.anIntArray32[6] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 6;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 550 && super.anInt141 <= 584 && super.anInt142 >= 492 && super.anInt142 < 528 && this.anIntArray32[7] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 7;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 582 && super.anInt141 <= 612 && super.anInt142 >= 492 && super.anInt142 < 529 && this.anIntArray32[8] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 8;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 609 && super.anInt141 <= 639 && super.anInt142 >= 492 && super.anInt142 < 529 && this.anIntArray32[9] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 9;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 637 && super.anInt141 <= 681 && super.anInt142 >= 493 && super.anInt142 < 528 && this.anIntArray32[10] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 10;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 679 && super.anInt141 <= 709 && super.anInt142 >= 492 && super.anInt142 < 529 && this.anIntArray32[11] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 11;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 706 && super.anInt141 <= 736 && super.anInt142 >= 492 && super.anInt142 < 529 && this.anIntArray32[12] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 12;
					this.aBoolean59 = true;
				}
				if (super.anInt141 >= 734 && super.anInt141 <= 768 && super.anInt142 >= 492 && super.anInt142 < 528 && this.anIntArray32[13] != -1) {
					this.aBoolean34 = true;
					this.anInt231 = 13;
					this.aBoolean59 = true;
				}
				anInt303++;
				if (anInt303 > 150) {
					anInt303 = 0;
					this.aClass1_Sub3_Sub3_5.method380(233);
					this.aClass1_Sub3_Sub3_5.method381(43);
					return;
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("44030, " + 0 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!hc;BIIZII)V")
	private void method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (this.aBoolean73) {
				this.anInt292 = 32;
			} else {
				this.anInt292 = 0;
			}
			this.aBoolean73 = false;
			@Pc(20) boolean local20 = false;
			if (arg1 >= arg4 && arg1 < arg4 + 16 && arg0 >= arg8 && arg0 < arg8 + 16) {
				arg2.anInt475 -= this.anInt282 * 4;
				if (arg6) {
					this.aBoolean34 = true;
					return;
				}
			} else if (arg1 >= arg4 && arg1 < arg4 + 16 && arg0 >= arg8 + arg5 - 16 && arg0 < arg8 + arg5) {
				arg2.anInt475 += this.anInt282 * 4;
				if (arg6) {
					this.aBoolean34 = true;
					return;
				}
			} else if (arg1 >= arg4 - this.anInt292 && arg1 < arg4 + this.anInt292 + 16 && arg0 >= arg8 + 16 && arg0 < arg8 + arg5 - 16 && this.anInt282 > 0) {
				@Pc(126) int local126 = (arg5 - 32) * arg5 / arg7;
				if (local126 < 8) {
					local126 = 8;
				}
				@Pc(141) int local141 = arg0 - arg8 - local126 / 2 - 16;
				@Pc(147) int local147 = arg5 - local126 - 32;
				arg2.anInt475 = (arg7 - arg5) * local141 / local147;
				if (arg6) {
					this.aBoolean34 = true;
				}
				this.aBoolean73 = true;
			} else {
				return;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("92497, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method138() {
		try {
			if (this.aClass32_19 == null) {
				this.method105();
				super.aClass32_2 = null;
				this.aClass32_20 = null;
				this.aClass32_21 = null;
				this.aClass32_22 = null;
				this.aClass32_23 = null;
				this.aClass32_24 = null;
				this.aClass32_25 = null;
				this.aClass32_26 = null;
				this.aClass32_27 = null;
				this.aClass32_28 = null;
				this.aClass32_19 = new Class32(96, 479, aByte14, this.method72());
				this.aClass32_17 = new Class32(160, 168, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass1_Sub3_Sub2_Sub3_15.method350(0, 0);
				this.aClass32_16 = new Class32(261, 190, aByte14, this.method72());
				this.aClass32_18 = new Class32(334, 512, aByte14, this.method72());
				Class1_Sub3_Sub2.method357(730);
				this.aClass32_13 = new Class32(61, 501, aByte14, this.method72());
				this.aClass32_14 = new Class32(40, 288, aByte14, this.method72());
				this.aClass32_15 = new Class32(66, 269, aByte14, this.method72());
				this.aBoolean65 = true;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("94030, " + 5 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt243 = Integer.parseInt(this.getParameter("nodeid"));
		anInt244 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method183();
		} else {
			method133();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean50 = false;
		} else {
			aBoolean50 = true;
		}
		this.method63(aByte12);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method139(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method140(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean35) {
					this.aBoolean35 = false;
					this.aBoolean41 = true;
				}
				@Pc(18) int local18 = this.anIntArray77[arg0];
				@Pc(23) int local23 = this.anIntArray78[arg0];
				@Pc(28) int local28 = this.anIntArray79[arg0];
				@Pc(33) int local33 = this.anIntArray80[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 450 && this.method177(local18, local23, local33, 75)) {
					this.aClass1_Sub3_Sub3_5.method382(this.anInt300);
					this.aClass1_Sub3_Sub3_5.method382(this.anInt298);
					this.aClass1_Sub3_Sub3_5.method382(this.anInt299);
				}
				if (local28 == 581) {
					if ((local33 & 0x3) == 0) {
						anInt157++;
					}
					if (anInt157 >= 99) {
						this.aClass1_Sub3_Sub3_5.method380(7);
						this.aClass1_Sub3_Sub3_5.method385(0);
					}
					this.method177(local18, local23, local33, 97);
				}
				if (local28 == 285) {
					this.method177(local18, local23, local33, 245);
				}
				@Pc(116) Class1_Sub1_Sub3_Sub1 local116;
				if (local28 == 900) {
					local116 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
					if (local116 != null) {
						this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local116.anIntArray233[0], false, 0, local116.anIntArray232[0], 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
						this.anInt203 = super.anInt141;
						this.anInt204 = super.anInt142;
						this.anInt206 = 2;
						this.anInt205 = 0;
						this.aClass1_Sub3_Sub3_5.method380(202);
						this.aClass1_Sub3_Sub3_5.method382(local33);
						this.aClass1_Sub3_Sub3_5.method382(this.anInt300);
						this.aClass1_Sub3_Sub3_5.method382(this.anInt298);
						this.aClass1_Sub3_Sub3_5.method382(this.anInt299);
					}
				}
				@Pc(200) String local200;
				@Pc(191) Class5 local191;
				if (local28 == 1102) {
					local191 = Class5.method54(local33);
					if (local191.aByteArray3 == null) {
						local200 = "It's a " + local191.aString3 + ".";
					} else {
						local200 = new String(local191.aByteArray3);
					}
					this.method83(local200, this.aByte23, "", 0);
				}
				@Pc(241) String local241;
				if (local28 == 1175) {
					@Pc(229) int local229 = local33 >> 14 & 0x7FFF;
					@Pc(232) Class2 local232 = Class2.method23(local229);
					if (local232.aByteArray1 == null) {
						local241 = "It's a " + local232.aString1 + ".";
					} else {
						local241 = new String(local232.aByteArray1);
					}
					this.method83(local241, this.aByte23, "", 0);
				}
				@Pc(277) Class15 local277;
				@Pc(295) int local295;
				if (local28 == 465) {
					this.aClass1_Sub3_Sub3_5.method380(155);
					this.aClass1_Sub3_Sub3_5.method382(local23);
					local277 = Class15.aClass15Array1[local23];
					if (local277.anIntArrayArray15 != null && local277.anIntArrayArray15[0][0] == 5) {
						local295 = local277.anIntArrayArray15[0][1];
						this.anIntArray56[local295] = 1 - this.anIntArray56[local295];
						this.method145(local295);
						this.aBoolean34 = true;
					}
				}
				if (local28 == 930) {
					local277 = Class15.aClass15Array1[local23];
					this.anInt160 = 1;
					this.anInt161 = local23;
					this.anInt162 = local277.anInt487;
					this.anInt297 = 0;
					local200 = local277.aString22;
					if (local200.indexOf(" ") != -1) {
						local200 = local200.substring(0, local200.indexOf(" "));
					}
					local241 = local277.aString22;
					if (local241.indexOf(" ") != -1) {
						local241 = local241.substring(local241.indexOf(" ") + 1);
					}
					this.aString6 = local200 + " " + local277.aString23 + " " + local241;
					if (this.anInt162 == 16) {
						this.aBoolean34 = true;
						this.anInt231 = 3;
						this.aBoolean59 = true;
					}
				} else {
					if (local28 == 405 || local28 == 38 || local28 == 422 || local28 == 478 || local28 == 347) {
						if (local28 == 478) {
							if ((local18 & 0x3) == 0) {
								anInt293++;
							}
							if (anInt293 >= 90) {
								this.aClass1_Sub3_Sub3_5.method380(220);
							}
							this.aClass1_Sub3_Sub3_5.method380(157);
						}
						if (local28 == 347) {
							this.aClass1_Sub3_Sub3_5.method380(211);
						}
						if (local28 == 405) {
							anInt245 += local33;
							if (anInt245 >= 97) {
								this.aClass1_Sub3_Sub3_5.method380(30);
								this.aClass1_Sub3_Sub3_5.method384(14953816);
							}
							this.aClass1_Sub3_Sub3_5.method380(195);
						}
						if (local28 == 38) {
							this.aClass1_Sub3_Sub3_5.method380(71);
						}
						if (local28 == 422) {
							this.aClass1_Sub3_Sub3_5.method380(133);
						}
						this.aClass1_Sub3_Sub3_5.method382(local33);
						this.aClass1_Sub3_Sub3_5.method382(local18);
						this.aClass1_Sub3_Sub3_5.method382(local23);
						this.anInt333 = 0;
						this.anInt334 = local23;
						this.anInt335 = local18;
						this.anInt336 = 2;
						if (Class15.aClass15Array1[local23].anInt465 == this.anInt158) {
							this.anInt336 = 1;
						}
						if (Class15.aClass15Array1[local23].anInt465 == this.anInt196) {
							this.anInt336 = 3;
						}
					}
					if (local28 == 951) {
						local277 = Class15.aClass15Array1[local23];
						@Pc(534) boolean local534 = true;
						if (local277.anInt468 > 0) {
							local534 = this.method90(local277);
						}
						if (local534) {
							this.aClass1_Sub3_Sub3_5.method380(155);
							this.aClass1_Sub3_Sub3_5.method382(local23);
						}
					}
					@Pc(561) Class1_Sub1_Sub3_Sub2 local561;
					if (local28 == 367) {
						local561 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
						if (local561 != null) {
							this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local561.anIntArray233[0], false, 0, local561.anIntArray232[0], 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
							this.anInt203 = super.anInt141;
							this.anInt204 = super.anInt142;
							this.anInt206 = 2;
							this.anInt205 = 0;
							this.aClass1_Sub3_Sub3_5.method380(248);
							this.aClass1_Sub3_Sub3_5.method382(local33);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt300);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt298);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt299);
						}
					}
					if (local28 == 265) {
						local116 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
						if (local116 != null) {
							this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local116.anIntArray233[0], false, 0, local116.anIntArray232[0], 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
							this.anInt203 = super.anInt141;
							this.anInt204 = super.anInt142;
							this.anInt206 = 2;
							this.anInt205 = 0;
							this.aClass1_Sub3_Sub3_5.method380(134);
							this.aClass1_Sub3_Sub3_5.method382(local33);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt161);
						}
					}
					if (local28 == 728 || local28 == 542 || local28 == 6 || local28 == 963 || local28 == 245) {
						local116 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
						if (local116 != null) {
							this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local116.anIntArray233[0], false, 0, local116.anIntArray232[0], 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
							this.anInt203 = super.anInt141;
							this.anInt204 = super.anInt142;
							this.anInt206 = 2;
							this.anInt205 = 0;
							if (local28 == 542) {
								this.aClass1_Sub3_Sub3_5.method380(8);
							}
							if (local28 == 728) {
								this.aClass1_Sub3_Sub3_5.method380(194);
							}
							if (local28 == 245) {
								if ((local33 & 0x3) == 0) {
									anInt262++;
								}
								if (anInt262 >= 85) {
									this.aClass1_Sub3_Sub3_5.method380(176);
									this.aClass1_Sub3_Sub3_5.method382(39596);
								}
								this.aClass1_Sub3_Sub3_5.method380(100);
							}
							if (local28 == 6) {
								if ((local33 & 0x3) == 0) {
									anInt316++;
								}
								if (anInt316 >= 124) {
									this.aClass1_Sub3_Sub3_5.method380(88);
									this.aClass1_Sub3_Sub3_5.method385(0);
								}
								this.aClass1_Sub3_Sub3_5.method380(27);
							}
							if (local28 == 963) {
								this.aClass1_Sub3_Sub3_5.method380(113);
							}
							this.aClass1_Sub3_Sub3_5.method382(local33);
						}
					}
					if (local28 == 1607) {
						local116 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
						if (local116 != null) {
							if (local116.aClass3_1.aByteArray2 == null) {
								local200 = "It's a " + local116.aClass3_1.aString2 + ".";
							} else {
								local200 = new String(local116.aClass3_1.aByteArray2);
							}
							this.method83(local200, this.aByte23, "", 0);
						}
					}
					if (local28 == 602 || local28 == 596 || local28 == 22 || local28 == 892 || local28 == 415) {
						if (local28 == 596) {
							this.aClass1_Sub3_Sub3_5.method380(59);
						}
						if (local28 == 22) {
							this.aClass1_Sub3_Sub3_5.method380(212);
						}
						if (local28 == 602) {
							this.aClass1_Sub3_Sub3_5.method380(31);
						}
						if (local28 == 415) {
							if ((local23 & 0x3) == 0) {
								anInt342++;
							}
							if (anInt342 >= 55) {
								this.aClass1_Sub3_Sub3_5.method380(17);
								this.aClass1_Sub3_Sub3_5.method385(0);
							}
							this.aClass1_Sub3_Sub3_5.method380(6);
						}
						if (local28 == 892) {
							if ((local18 & 0x3) == 0) {
								anInt229++;
							}
							if (anInt229 >= 130) {
								this.aClass1_Sub3_Sub3_5.method380(238);
								this.aClass1_Sub3_Sub3_5.method381(177);
							}
							this.aClass1_Sub3_Sub3_5.method380(38);
						}
						this.aClass1_Sub3_Sub3_5.method382(local33);
						this.aClass1_Sub3_Sub3_5.method382(local18);
						this.aClass1_Sub3_Sub3_5.method382(local23);
						this.anInt333 = 0;
						this.anInt334 = local23;
						this.anInt335 = local18;
						this.anInt336 = 2;
						if (Class15.aClass15Array1[local23].anInt465 == this.anInt158) {
							this.anInt336 = 1;
						}
						if (Class15.aClass15Array1[local23].anInt465 == this.anInt196) {
							this.anInt336 = 3;
						}
					}
					if (local28 == 188) {
						this.anInt297 = 1;
						this.anInt298 = local18;
						this.anInt299 = local23;
						this.anInt300 = local33;
						this.aString17 = Class5.method54(local33).aString3;
						this.anInt160 = 0;
					} else {
						@Pc(1068) String local1068;
						@Pc(1083) long local1083;
						if (local28 == 406 || local28 == 436 || local28 == 557 || local28 == 556) {
							local1068 = this.aStringArray6[arg0];
							local295 = local1068.indexOf("@whi@");
							if (local295 != -1) {
								local1083 = Class40.method538(local1068.substring(local295 + 5).trim());
								if (local28 == 406) {
									this.method169(local1083);
								}
								if (local28 == 436) {
									this.method81(local1083);
								}
								if (local28 == 557) {
									this.method78(local1083);
								}
								if (local28 == 556) {
									this.method197(local1083);
								}
							}
						}
						if (local28 == 55 && this.method177(local18, local23, local33, 9)) {
							this.aClass1_Sub3_Sub3_5.method382(this.anInt161);
						}
						if (local28 == 660) {
							if (this.aBoolean54) {
								this.aClass33_1.method506(local23 - 11, local18 - 8);
							} else {
								this.aClass33_1.method506(super.anInt142 - 11, super.anInt141 - 8);
							}
						}
						if (local28 == 504) {
							this.method177(local18, local23, local33, 172);
						}
						if (local28 == 651) {
							local561 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
							if (local561 != null) {
								this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local561.anIntArray233[0], false, 0, local561.anIntArray232[0], 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
								this.anInt203 = super.anInt141;
								this.anInt204 = super.anInt142;
								this.anInt206 = 2;
								this.anInt205 = 0;
								this.aClass1_Sub3_Sub3_5.method380(177);
								this.aClass1_Sub3_Sub3_5.method382(local33);
								this.aClass1_Sub3_Sub3_5.method382(this.anInt161);
							}
						}
						if (local28 == 1773) {
							local191 = Class5.method54(local33);
							if (local23 >= 100000) {
								local200 = local23 + " x " + local191.aString3;
							} else if (local191.aByteArray3 == null) {
								local200 = "It's a " + local191.aString3 + ".";
							} else {
								local200 = new String(local191.aByteArray3);
							}
							this.method83(local200, this.aByte23, "", 0);
						}
						@Pc(1323) int local1323;
						if (local28 == 903 || local28 == 363) {
							local1068 = this.aStringArray6[arg0];
							local295 = local1068.indexOf("@whi@");
							if (local295 != -1) {
								local1068 = local1068.substring(local295 + 5).trim();
								local241 = Class40.method542(Class40.method539(Class40.method538(local1068)));
								@Pc(1321) boolean local1321 = false;
								for (local1323 = 0; local1323 < this.anInt286; local1323++) {
									@Pc(1333) Class1_Sub1_Sub3_Sub2 local1333 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray62[local1323]];
									if (local1333 != null && local1333.aString30 != null && local1333.aString30.equalsIgnoreCase(local241)) {
										this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local1333.anIntArray233[0], false, 0, local1333.anIntArray232[0], 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
										if (local28 == 903) {
											this.aClass1_Sub3_Sub3_5.method380(206);
										}
										if (local28 == 363) {
											this.aClass1_Sub3_Sub3_5.method380(164);
										}
										this.aClass1_Sub3_Sub3_5.method382(this.anIntArray62[local1323]);
										local1321 = true;
										break;
									}
								}
								if (!local1321) {
									this.method83("Unable to find " + local241, this.aByte23, "", 0);
								}
							}
						}
						if (local28 == 391) {
							this.aClass1_Sub3_Sub3_5.method380(48);
							this.aClass1_Sub3_Sub3_5.method382(local33);
							this.aClass1_Sub3_Sub3_5.method382(local18);
							this.aClass1_Sub3_Sub3_5.method382(local23);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt161);
							this.anInt333 = 0;
							this.anInt334 = local23;
							this.anInt335 = local18;
							this.anInt336 = 2;
							if (Class15.aClass15Array1[local23].anInt465 == this.anInt158) {
								this.anInt336 = 1;
							}
							if (Class15.aClass15Array1[local23].anInt465 == this.anInt196) {
								this.anInt336 = 3;
							}
						}
						if (local28 == 1501) {
							anInt198 += this.anInt193;
							if (anInt198 >= 92) {
								this.aClass1_Sub3_Sub3_5.method380(66);
								this.aClass1_Sub3_Sub3_5.method385(0);
							}
							this.method177(local18, local23, local33, 116);
						}
						if (local28 == 364) {
							this.method177(local18, local23, local33, 96);
						}
						@Pc(1541) boolean local1541;
						if (local28 == 965) {
							local1541 = this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local23, false, 0, local18, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0);
							if (!local1541) {
								this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local23, false, 0, local18, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
							}
							this.anInt203 = super.anInt141;
							this.anInt204 = super.anInt142;
							this.anInt206 = 2;
							this.anInt205 = 0;
							this.aClass1_Sub3_Sub3_5.method380(138);
							this.aClass1_Sub3_Sub3_5.method382(local18 + this.anInt192);
							this.aClass1_Sub3_Sub3_5.method382(local23 + this.anInt193);
							this.aClass1_Sub3_Sub3_5.method382(local33);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt161);
						}
						if (local28 == 881) {
							this.aClass1_Sub3_Sub3_5.method380(130);
							this.aClass1_Sub3_Sub3_5.method382(local33);
							this.aClass1_Sub3_Sub3_5.method382(local18);
							this.aClass1_Sub3_Sub3_5.method382(local23);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt300);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt298);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt299);
							this.anInt333 = 0;
							this.anInt334 = local23;
							this.anInt335 = local18;
							this.anInt336 = 2;
							if (Class15.aClass15Array1[local23].anInt465 == this.anInt158) {
								this.anInt336 = 1;
							}
							if (Class15.aClass15Array1[local23].anInt465 == this.anInt196) {
								this.anInt336 = 3;
							}
						}
						if (local28 == 217) {
							local1541 = this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local23, false, 0, local18, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0);
							if (!local1541) {
								this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local23, false, 0, local18, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
							}
							this.anInt203 = super.anInt141;
							this.anInt204 = super.anInt142;
							this.anInt206 = 2;
							this.anInt205 = 0;
							this.aClass1_Sub3_Sub3_5.method380(239);
							this.aClass1_Sub3_Sub3_5.method382(local18 + this.anInt192);
							this.aClass1_Sub3_Sub3_5.method382(local23 + this.anInt193);
							this.aClass1_Sub3_Sub3_5.method382(local33);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt300);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt298);
							this.aClass1_Sub3_Sub3_5.method382(this.anInt299);
						}
						if (local28 == 224 || local28 == 993 || local28 == 99 || local28 == 746 || local28 == 877) {
							local1541 = this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local23, false, 0, local18, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0);
							if (!local1541) {
								this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local23, false, 0, local18, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
							}
							this.anInt203 = super.anInt141;
							this.anInt204 = super.anInt142;
							this.anInt206 = 2;
							this.anInt205 = 0;
							if (local28 == 746) {
								this.aClass1_Sub3_Sub3_5.method380(178);
							}
							if (local28 == 99) {
								this.aClass1_Sub3_Sub3_5.method380(200);
							}
							if (local28 == 224) {
								this.aClass1_Sub3_Sub3_5.method380(140);
							}
							if (local28 == 993) {
								this.aClass1_Sub3_Sub3_5.method380(40);
							}
							if (local28 == 877) {
								this.aClass1_Sub3_Sub3_5.method380(247);
							}
							this.aClass1_Sub3_Sub3_5.method382(local18 + this.anInt192);
							this.aClass1_Sub3_Sub3_5.method382(local23 + this.anInt193);
							this.aClass1_Sub3_Sub3_5.method382(local33);
						}
						if (local28 == 1373 || local28 == 1544 || local28 == 151 || local28 == 1101) {
							local561 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
							if (local561 != null) {
								this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, local561.anIntArray233[0], false, 0, local561.anIntArray232[0], 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 0);
								this.anInt203 = super.anInt141;
								this.anInt204 = super.anInt142;
								this.anInt206 = 2;
								this.anInt205 = 0;
								if (local28 == 1373) {
									this.aClass1_Sub3_Sub3_5.method380(206);
								}
								if (local28 == 1101) {
									this.aClass1_Sub3_Sub3_5.method380(164);
								}
								if (local28 == 1544) {
									this.aClass1_Sub3_Sub3_5.method380(185);
								}
								if (local28 == 151) {
									anInt164++;
									if (anInt164 >= 90) {
										this.aClass1_Sub3_Sub3_5.method380(2);
										this.aClass1_Sub3_Sub3_5.method382(31114);
									}
									this.aClass1_Sub3_Sub3_5.method380(53);
								}
								this.aClass1_Sub3_Sub3_5.method382(local33);
							}
						}
						if (local28 == 947) {
							this.method126(this.anInt337);
						}
						if (local28 == 679) {
							local1068 = this.aStringArray6[arg0];
							local295 = local1068.indexOf("@whi@");
							if (local295 != -1) {
								local1083 = Class40.method538(local1068.substring(local295 + 5).trim());
								local1323 = -1;
								for (@Pc(2061) int local2061 = 0; local2061 < this.anInt208; local2061++) {
									if (this.aLongArray4[local2061] == local1083) {
										local1323 = local2061;
										break;
									}
								}
								if (local1323 != -1 && this.anIntArray69[local1323] > 0) {
									this.aBoolean41 = true;
									this.aBoolean35 = false;
									this.aBoolean56 = true;
									this.aString9 = "";
									this.anInt294 = 3;
									this.aLong8 = this.aLongArray4[local1323];
									this.aString18 = "Enter message to send to " + this.aStringArray7[local1323];
								}
							}
						}
						if (local28 == 960) {
							this.aClass1_Sub3_Sub3_5.method380(155);
							this.aClass1_Sub3_Sub3_5.method382(local23);
							local277 = Class15.aClass15Array1[local23];
							if (local277.anIntArrayArray15 != null && local277.anIntArrayArray15[0][0] == 5) {
								local295 = local277.anIntArrayArray15[0][1];
								if (this.anIntArray56[local295] != local277.anIntArray152[0]) {
									this.anIntArray56[local295] = local277.anIntArray152[0];
									this.method145(local295);
									this.aBoolean34 = true;
								}
							}
						}
						if (local28 == 34) {
							local1068 = this.aStringArray6[arg0];
							local295 = local1068.indexOf("@whi@");
							if (local295 != -1) {
								this.method126(this.anInt337);
								this.aString13 = local1068.substring(local295 + 5).trim();
								this.aBoolean44 = false;
								for (@Pc(2210) int local2210 = 0; local2210 < Class15.aClass15Array1.length; local2210++) {
									if (Class15.aClass15Array1[local2210] != null && Class15.aClass15Array1[local2210].anInt468 == 600) {
										this.anInt319 = this.anInt158 = Class15.aClass15Array1[local2210].anInt465;
										break;
									}
								}
							}
						}
						if (local28 == 44 && !this.aBoolean67) {
							this.aClass1_Sub3_Sub3_5.method380(235);
							this.aClass1_Sub3_Sub3_5.method382(local23);
							this.aBoolean67 = true;
						}
						this.anInt297 = 0;
						this.anInt160 = 0;
					}
				}
			}
		} catch (@Pc(2264) RuntimeException local2264) {
			signlink.reporterror("94088, " + arg0 + ", " + 0 + ", " + local2264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!kb;)V")
	private void method141(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2) {
		try {
			this.anInt254 = 0;
			this.anInt287 = 0;
			this.method76(arg2, arg1);
			if (!arg0) {
				this.aBoolean53 = !this.aBoolean53;
			}
			this.method125(arg1, arg2);
			this.method148(arg2, arg1);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt254; local34++) {
				local41 = this.anIntArray55[local34];
				if (this.aClass1_Sub1_Sub3_Sub1Array1[local41].anInt932 != anInt280) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local41].aClass3_1 = null;
					this.aClass1_Sub1_Sub3_Sub1Array1[local41] = null;
				}
			}
			if (arg2.anInt554 != arg1) {
				signlink.reporterror(this.aString10 + " size mismatch in getnpcpos - pos:" + arg2.anInt554 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt249; local41++) {
				if (this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray54[local41]] == null) {
					signlink.reporterror(this.aString10 + " null entry in npc list - pos:" + local41 + " size:" + this.anInt249);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("28023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method142(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt297 == 0 && this.anInt160 == 0) {
				this.aStringArray6[this.anInt190] = "Walk here";
				this.anIntArray79[this.anInt190] = 660;
				this.anIntArray77[this.anInt190] = super.anInt138;
				this.anIntArray78[this.anInt190] = super.anInt139;
				this.anInt190++;
			}
			@Pc(41) int local41 = -1;
			if (arg0 != 0) {
				this.aBoolean62 = !this.aBoolean62;
			}
			for (@Pc(53) int local53 = 0; local53 < Class1_Sub3_Sub1.anInt376; local53++) {
				@Pc(59) int local59 = Class1_Sub3_Sub1.anIntArray123[local53];
				@Pc(63) int local63 = local59 & 0x7F;
				@Pc(69) int local69 = local59 >> 7 & 0x7F;
				@Pc(75) int local75 = local59 >> 29 & 0x3;
				@Pc(81) int local81 = local59 >> 14 & 0x7FFF;
				if (local59 != local41) {
					local41 = local59;
					@Pc(219) int local219;
					if (local75 == 2 && this.aClass33_1.method498(this.anInt219, local63, local69, local59) >= 0) {
						@Pc(101) Class2 local101 = Class2.method23(local81);
						if (this.anInt297 == 1) {
							this.aStringArray6[this.anInt190] = "Use " + this.aString17 + " with @cya@" + local101.aString1;
							this.anIntArray79[this.anInt190] = 450;
							this.anIntArray80[this.anInt190] = local59;
							this.anIntArray77[this.anInt190] = local63;
							this.anIntArray78[this.anInt190] = local69;
							this.anInt190++;
						} else if (this.anInt160 != 1) {
							if (local101.aStringArray1 != null) {
								for (local219 = 4; local219 >= 0; local219--) {
									if (local101.aStringArray1[local219] != null) {
										this.aStringArray6[this.anInt190] = local101.aStringArray1[local219] + " @cya@" + local101.aString1;
										if (local219 == 0) {
											this.anIntArray79[this.anInt190] = 285;
										}
										if (local219 == 1) {
											this.anIntArray79[this.anInt190] = 504;
										}
										if (local219 == 2) {
											this.anIntArray79[this.anInt190] = 364;
										}
										if (local219 == 3) {
											this.anIntArray79[this.anInt190] = 581;
										}
										if (local219 == 4) {
											this.anIntArray79[this.anInt190] = 1501;
										}
										this.anIntArray80[this.anInt190] = local59;
										this.anIntArray77[this.anInt190] = local63;
										this.anIntArray78[this.anInt190] = local69;
										this.anInt190++;
									}
								}
							}
							this.aStringArray6[this.anInt190] = "Examine @cya@" + local101.aString1;
							this.anIntArray79[this.anInt190] = 1175;
							this.anIntArray80[this.anInt190] = local59;
							this.anIntArray77[this.anInt190] = local63;
							this.anIntArray78[this.anInt190] = local69;
							this.anInt190++;
						} else if ((this.anInt162 & 0x4) == 4) {
							this.aStringArray6[this.anInt190] = this.aString6 + " @cya@" + local101.aString1;
							this.anIntArray79[this.anInt190] = 55;
							this.anIntArray80[this.anInt190] = local59;
							this.anIntArray77[this.anInt190] = local63;
							this.anIntArray78[this.anInt190] = local69;
							this.anInt190++;
						}
					}
					@Pc(396) Class1_Sub1_Sub3_Sub1 local396;
					if (local75 == 1) {
						@Pc(367) Class1_Sub1_Sub3_Sub1 local367 = this.aClass1_Sub1_Sub3_Sub1Array1[local81];
						if (local367.aClass3_1.aByte6 == 1 && (local367.anInt890 & 0x7F) == 64 && (local367.anInt891 & 0x7F) == 64) {
							for (local219 = 0; local219 < this.anInt249; local219++) {
								local396 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray54[local219]];
								if (local396 != null && local396 != local367 && local396.aClass3_1.aByte6 == 1 && local396.anInt890 == local367.anInt890 && local396.anInt891 == local367.anInt891) {
									this.method116(local69, this.anIntArray54[local219], local63, local396.aClass3_1);
								}
							}
						}
						this.method116(local69, local81, local63, local367.aClass3_1);
					}
					if (local75 == 0) {
						@Pc(447) Class1_Sub1_Sub3_Sub2 local447 = this.aClass1_Sub1_Sub3_Sub2Array1[local81];
						if ((local447.anInt890 & 0x7F) == 64 && (local447.anInt891 & 0x7F) == 64) {
							for (local219 = 0; local219 < this.anInt249; local219++) {
								local396 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray54[local219]];
								if (local396 != null && local396.aClass3_1.aByte6 == 1 && local396.anInt890 == local447.anInt890 && local396.anInt891 == local447.anInt891) {
									this.method116(local69, this.anIntArray54[local219], local63, local396.aClass3_1);
								}
							}
							for (@Pc(506) int local506 = 0; local506 < this.anInt286; local506++) {
								@Pc(516) Class1_Sub1_Sub3_Sub2 local516 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray62[local506]];
								if (local516 != null && local516 != local447 && local516.anInt890 == local447.anInt890 && local516.anInt891 == local447.anInt891) {
									this.method172(local516, local69, local63, this.anIntArray62[local506]);
								}
							}
						}
						this.method172(local447, local69, local63, local81);
					}
					if (local75 == 3) {
						@Pc(566) Class28 local566 = this.aClass28ArrayArrayArray1[this.anInt219][local63][local69];
						if (local566 != null) {
							for (@Pc(573) Class1_Sub7 local573 = (Class1_Sub7) local566.method457(485); local573 != null; local573 = (Class1_Sub7) local566.method459()) {
								@Pc(579) Class5 local579 = Class5.method54(local573.anInt766);
								if (this.anInt297 == 1) {
									this.aStringArray6[this.anInt190] = "Use " + this.aString17 + " with @lre@" + local579.aString3;
									this.anIntArray79[this.anInt190] = 217;
									this.anIntArray80[this.anInt190] = local573.anInt766;
									this.anIntArray77[this.anInt190] = local63;
									this.anIntArray78[this.anInt190] = local69;
									this.anInt190++;
								} else if (this.anInt160 != 1) {
									for (@Pc(696) int local696 = 4; local696 >= 0; local696--) {
										if (local579.aStringArray3 != null && local579.aStringArray3[local696] != null) {
											this.aStringArray6[this.anInt190] = local579.aStringArray3[local696] + " @lre@" + local579.aString3;
											if (local696 == 0) {
												this.anIntArray79[this.anInt190] = 224;
											}
											if (local696 == 1) {
												this.anIntArray79[this.anInt190] = 993;
											}
											if (local696 == 2) {
												this.anIntArray79[this.anInt190] = 99;
											}
											if (local696 == 3) {
												this.anIntArray79[this.anInt190] = 746;
											}
											if (local696 == 4) {
												this.anIntArray79[this.anInt190] = 877;
											}
											this.anIntArray80[this.anInt190] = local573.anInt766;
											this.anIntArray77[this.anInt190] = local63;
											this.anIntArray78[this.anInt190] = local69;
											this.anInt190++;
										} else if (local696 == 2) {
											this.aStringArray6[this.anInt190] = "Take @lre@" + local579.aString3;
											this.anIntArray79[this.anInt190] = 99;
											this.anIntArray80[this.anInt190] = local573.anInt766;
											this.anIntArray77[this.anInt190] = local63;
											this.anIntArray78[this.anInt190] = local69;
											this.anInt190++;
										}
									}
									this.aStringArray6[this.anInt190] = "Examine @lre@" + local579.aString3;
									this.anIntArray79[this.anInt190] = 1102;
									this.anIntArray80[this.anInt190] = local573.anInt766;
									this.anIntArray77[this.anInt190] = local63;
									this.anIntArray78[this.anInt190] = local69;
									this.anInt190++;
								} else if ((this.anInt162 & 0x1) == 1) {
									this.aStringArray6[this.anInt190] = this.aString6 + " @lre@" + local579.aString3;
									this.anIntArray79[this.anInt190] = 965;
									this.anIntArray80[this.anInt190] = local573.anInt766;
									this.anIntArray77[this.anInt190] = local63;
									this.anIntArray78[this.anInt190] = local69;
									this.anInt190++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(903) RuntimeException local903) {
			signlink.reporterror("40912, " + arg0 + ", " + local903.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!kb;B)V")
	private void method143(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.aByte21 == 6) {
				@Pc(7) boolean local7 = false;
			} else {
				this.method67();
			}
			while (arg1.anInt555 + 10 < arg0 * 8) {
				@Pc(24) int local24 = arg1.method402(11);
				if (local24 == 2047) {
					break;
				}
				if (this.aClass1_Sub1_Sub3_Sub2Array1[local24] == null) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local24] = new Class1_Sub1_Sub3_Sub2();
					if (this.aClass1_Sub3_Sub3Array1[local24] != null) {
						this.aClass1_Sub1_Sub3_Sub2Array1[local24].method572(this.aClass1_Sub3_Sub3Array1[local24], (byte) 4);
					}
				}
				this.anIntArray62[this.anInt286++] = local24;
				@Pc(70) Class1_Sub1_Sub3_Sub2 local70 = this.aClass1_Sub1_Sub3_Sub2Array1[local24];
				local70.anInt932 = anInt280;
				@Pc(78) int local78 = arg1.method402(5);
				if (local78 > 15) {
					local78 -= 32;
				}
				@Pc(87) int local87 = arg1.method402(5);
				if (local87 > 15) {
					local87 -= 32;
				}
				@Pc(96) int local96 = arg1.method402(1);
				local70.method569(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + local78, local96 == 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + local87);
				@Pc(124) int local124 = arg1.method402(1);
				if (local124 == 1) {
					this.anIntArray63[this.anInt287++] = local24;
				}
			}
			arg1.method403();
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("56237, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;IZ)V")
	private void method144(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt287; local1++) {
				@Pc(8) int local8 = this.anIntArray63[local1];
				@Pc(13) Class1_Sub1_Sub3_Sub2 local13 = this.aClass1_Sub1_Sub3_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method391();
				if ((local16 & 0x80) == 128) {
					local16 += arg0.method391() << 8;
				}
				this.method149(local8, local13, arg0, local16);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("82369, " + arg0 + ", " + arg1 + ", " + true + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method145(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8 = Class23.aClass23Array1[arg0].anInt600;
			if (local8 != 0) {
				@Pc(16) int local16 = this.anIntArray56[arg0];
				if (local8 == 1) {
					if (local16 == 1) {
						Class1_Sub3_Sub2_Sub1.method296(0.9D);
					}
					if (local16 == 2) {
						Class1_Sub3_Sub2_Sub1.method296(0.8D);
					}
					if (local16 == 3) {
						Class1_Sub3_Sub2_Sub1.method296(0.7D);
					}
					if (local16 == 4) {
						Class1_Sub3_Sub2_Sub1.method296(0.6D);
					}
					Class5.aClass35_5.method529();
					this.aBoolean65 = true;
				}
				if (local8 == 3) {
					@Pc(54) boolean local54 = this.aBoolean49;
					if (local16 == 0) {
						this.method182(this.aByte13, 0, this.aBoolean49);
						this.aBoolean49 = true;
					}
					if (local16 == 1) {
						this.method182(this.aByte13, -400, this.aBoolean49);
						this.aBoolean49 = true;
					}
					if (local16 == 2) {
						this.method182(this.aByte13, -800, this.aBoolean49);
						this.aBoolean49 = true;
					}
					if (local16 == 3) {
						this.method182(this.aByte13, -1200, this.aBoolean49);
						this.aBoolean49 = true;
					}
					if (local16 == 4) {
						this.aBoolean49 = false;
					}
					if (this.aBoolean49 != local54) {
						if (this.aBoolean49) {
							this.method189(this.aString8, this.anInt267, this.anInt295);
						} else {
							this.method94();
						}
						this.anInt156 = 0;
					}
				}
				if (local8 == 4) {
					if (local16 == 0) {
						this.aBoolean38 = true;
						this.method89(0);
					}
					if (local16 == 1) {
						this.aBoolean38 = true;
						this.method89(-400);
					}
					if (local16 == 2) {
						this.aBoolean38 = true;
						this.method89(-800);
					}
					if (local16 == 3) {
						this.aBoolean38 = true;
						this.method89(-1200);
					}
					if (local16 == 4) {
						this.aBoolean38 = false;
					}
				}
				if (local8 == 5) {
					this.anInt341 = local16;
				}
				if (local8 == 6) {
					this.anInt221 = local16;
				}
				if (local8 == 8) {
					this.anInt296 = local16;
					this.aBoolean41 = true;
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("52175, " + arg0 + ", " + 64 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method146() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt249; local1++) {
				@Pc(11) Class1_Sub1_Sub3_Sub1 local11 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray54[local1]];
				@Pc(20) int local20 = (this.anIntArray54[local1] << 14) + 536870912;
				if (local11 != null && local11.method571()) {
					@Pc(31) int local31 = local11.anInt890 >> 7;
					@Pc(36) int local36 = local11.anInt891 >> 7;
					if (local31 >= 0 && local31 < 104 && local36 >= 0 && local36 < 104) {
						if (local11.anInt893 == 1 && (local11.anInt890 & 0x7F) == 64 && (local11.anInt891 & 0x7F) == 64) {
							if (this.anIntArrayArray4[local31][local36] == this.anInt275) {
								continue;
							}
							this.anIntArrayArray4[local31][local36] = this.anInt275;
						}
						this.aClass33_1.method478((local11.anInt893 - 1) * 64 + 60, local11.anInt890, local11.anInt891, null, local20, this.method199(local11.anInt891, this.anInt219, local11.anInt890), local11.anInt892, this.anInt219, local11, local11.aBoolean159);
					}
				}
			}
			this.anInt150 += 0;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("17111, " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method147() {
		try {
			this.aClass32_16.method463();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray87;
			this.aClass1_Sub3_Sub2_Sub3_14.method350(0, 0);
			if (this.anInt322 != -1) {
				this.method75(0, 0, Class15.aClass15Array1[this.anInt322], 0);
			} else if (this.anIntArray32[this.anInt231] != -1) {
				this.method75(0, 0, Class15.aClass15Array1[this.anIntArray32[this.anInt231]], 0);
			}
			if (this.aBoolean54 && this.anInt184 == 1) {
				this.method113();
			}
			this.aClass32_16.method464(super.aGraphics2, 231, 562);
			this.aClass32_18.method463();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray88;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("53672, " + -777 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;II)V")
	private void method148(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt287; local1++) {
				@Pc(8) int local8 = this.anIntArray63[local1];
				@Pc(13) Class1_Sub1_Sub3_Sub1 local13 = this.aClass1_Sub1_Sub3_Sub1Array1[local8];
				@Pc(16) int local16 = arg0.method391();
				@Pc(24) int local24;
				if ((local16 & 0x2) == 2) {
					local24 = arg0.method393();
					if (local24 == 65535) {
						local24 = -1;
					}
					if (local24 == local13.anInt915) {
						local13.anInt919 = 0;
					}
					@Pc(39) int local39 = arg0.method391();
					if (local24 == -1 || local13.anInt915 == -1 || Class19.aClass19Array1[local24].anInt540 > Class19.aClass19Array1[local13.anInt915].anInt540 || Class19.aClass19Array1[local13.anInt915].anInt540 == 0) {
						local13.anInt915 = local24;
						local13.anInt916 = 0;
						local13.anInt917 = 0;
						local13.anInt918 = local39;
						local13.anInt919 = 0;
					}
				}
				if ((local16 & 0x4) == 4) {
					local13.anInt909 = arg0.method393();
					if (local13.anInt909 == 65535) {
						local13.anInt909 = -1;
					}
				}
				if ((local16 & 0x8) == 8) {
					local13.aString29 = arg0.method398();
					local13.anInt901 = 100;
				}
				if ((local16 & 0x10) == 16) {
					local13.anInt904 = arg0.method391();
					local13.anInt905 = arg0.method391();
					local13.anInt906 = anInt280 + 400;
					local13.anInt907 = arg0.method391();
					local13.anInt908 = arg0.method391();
				}
				if ((local16 & 0x20) == 32) {
					local13.aClass3_1 = Class3.method32(arg0.method393());
					local13.anInt896 = local13.aClass3_1.anInt73;
					local13.anInt897 = local13.aClass3_1.anInt74;
					local13.anInt898 = local13.aClass3_1.anInt75;
					local13.anInt899 = local13.aClass3_1.anInt76;
					local13.anInt894 = local13.aClass3_1.anInt72;
				}
				if ((local16 & 0x40) == 64) {
					local13.anInt920 = arg0.method393();
					local24 = arg0.method396();
					local13.anInt924 = local24 >> 16;
					local13.anInt923 = anInt280 + (local24 & 0xFFFF);
					local13.anInt921 = 0;
					local13.anInt922 = 0;
					if (local13.anInt923 > anInt280) {
						local13.anInt921 = -1;
					}
					if (local13.anInt920 == 65535) {
						local13.anInt920 = -1;
					}
				}
				if ((local16 & 0x80) == 128) {
					local13.anInt910 = arg0.method393();
					local13.anInt911 = arg0.method393();
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("38667, " + arg0 + ", " + arg1 + ", " + 473 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;Lclient!kb;II)V")
	private void method149(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(16) int local16;
			if ((arg3 & 0x1) == 1) {
				local16 = arg2.method391();
				@Pc(19) byte[] local19 = new byte[local16];
				@Pc(25) Class1_Sub3_Sub3 local25 = new Class1_Sub3_Sub3((byte) 64, local19);
				arg2.method400(local16, local19, 0);
				this.aClass1_Sub3_Sub3Array1[arg0] = local25;
				arg1.method572(local25, (byte) 4);
			}
			@Pc(63) int local63;
			if ((arg3 & 0x2) == 2) {
				local16 = arg2.method393();
				if (local16 == 65535) {
					local16 = -1;
				}
				if (local16 == arg1.anInt915) {
					arg1.anInt919 = 0;
				}
				local63 = arg2.method391();
				if (local16 == -1 || arg1.anInt915 == -1 || Class19.aClass19Array1[local16].anInt540 > Class19.aClass19Array1[arg1.anInt915].anInt540 || Class19.aClass19Array1[arg1.anInt915].anInt540 == 0) {
					arg1.anInt915 = local16;
					arg1.anInt916 = 0;
					arg1.anInt917 = 0;
					arg1.anInt918 = local63;
					arg1.anInt919 = 0;
				}
			}
			if ((arg3 & 0x4) == 4) {
				arg1.anInt909 = arg2.method393();
				if (arg1.anInt909 == 65535) {
					arg1.anInt909 = -1;
				}
			}
			if ((arg3 & 0x8) == 8) {
				arg1.aString29 = arg2.method398();
				arg1.anInt902 = 0;
				arg1.anInt903 = 0;
				arg1.anInt901 = 150;
				this.method83(arg1.aString29, this.aByte23, arg1.aString30, 2);
			}
			if ((arg3 & 0x10) == 16) {
				arg1.anInt904 = arg2.method391();
				arg1.anInt905 = arg2.method391();
				arg1.anInt906 = anInt280 + 400;
				arg1.anInt907 = arg2.method391();
				arg1.anInt908 = arg2.method391();
			}
			if ((arg3 & 0x20) == 32) {
				arg1.anInt910 = arg2.method393();
				arg1.anInt911 = arg2.method393();
			}
			if ((arg3 & 0x40) == 64) {
				local16 = arg2.method393();
				local63 = arg2.method391();
				@Pc(197) int local197 = arg2.method391();
				@Pc(200) int local200 = arg2.anInt554;
				if (arg1.aString30 != null) {
					@Pc(207) long local207 = Class40.method538(arg1.aString30);
					@Pc(209) boolean local209 = false;
					if (local63 <= 1) {
						for (@Pc(214) int local214 = 0; local214 < this.anInt261; local214++) {
							if (this.aLongArray3[local214] == local207) {
								local209 = true;
								break;
							}
						}
					}
					if (!local209 && this.anInt189 == 0) {
						try {
							@Pc(242) String local242 = Class41.method545(arg2, (byte) 1, local197);
							@Pc(246) String local246 = Class25.method424(local242, 400);
							arg1.aString29 = local246;
							arg1.anInt902 = local16 >> 8;
							arg1.anInt903 = local16 & 0xFF;
							arg1.anInt901 = 150;
							if (local63 > 1) {
								this.method83(local246, this.aByte23, arg1.aString30, 1);
							} else {
								this.method83(local246, this.aByte23, arg1.aString30, 2);
							}
						} catch (@Pc(285) Exception local285) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt554 = local200 + local197;
			}
			if ((arg3 & 0x100) == 256) {
				arg1.anInt920 = arg2.method393();
				local16 = arg2.method396();
				arg1.anInt924 = local16 >> 16;
				arg1.anInt923 = anInt280 + (local16 & 0xFFFF);
				arg1.anInt921 = 0;
				arg1.anInt922 = 0;
				if (arg1.anInt923 > anInt280) {
					arg1.anInt921 = -1;
				}
				if (arg1.anInt920 == 65535) {
					arg1.anInt920 = -1;
				}
			}
			if ((arg3 & 0x200) == 512) {
				arg1.anInt925 = arg2.method391();
				arg1.anInt927 = arg2.method391();
				arg1.anInt926 = arg2.method391();
				arg1.anInt928 = arg2.method391();
				arg1.anInt929 = arg2.method393() + anInt280;
				arg1.anInt930 = arg2.method393() + anInt280;
				arg1.anInt931 = arg2.method391();
				arg1.anInt935 = 0;
				arg1.anIntArray232[0] = arg1.anInt926;
				arg1.anIntArray233[0] = arg1.anInt928;
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("3564, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -931 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method150(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt296 != 0) {
				@Pc(19) Class1_Sub3_Sub2_Sub4 local19 = this.aClass1_Sub3_Sub2_Sub4_2;
				@Pc(21) int local21 = 0;
				if (this.anInt308 != 0) {
					local21 = 1;
				}
				for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
					if (this.aStringArray9[local28] != null) {
						@Pc(40) int local40 = this.anIntArray53[local28];
						@Pc(70) int local70;
						if ((local40 == 3 || local40 == 7) && (local40 == 7 || this.anInt155 == 0 || this.anInt155 == 1 && this.method174(this.aStringArray8[local28]))) {
							local70 = 329 - local21 * 13;
							local19.method365(local70, "From " + this.aStringArray8[local28] + ": " + this.aStringArray9[local28], 0, 4);
							local19.method365(local70 - 1, "From " + this.aStringArray8[local28] + ": " + this.aStringArray9[local28], 65535, 4);
							local21++;
							if (local21 >= 5) {
								return;
							}
						}
						if (local40 == 5 && this.anInt155 < 2) {
							local70 = 329 - local21 * 13;
							local19.method365(local70, this.aStringArray9[local28], 0, 4);
							local19.method365(local70 - 1, this.aStringArray9[local28], 65535, 4);
							local21++;
							if (local21 >= 5) {
								return;
							}
						}
						if (local40 == 6 && this.anInt155 < 2) {
							local70 = 329 - local21 * 13;
							local19.method365(local70, "To " + this.aStringArray8[local28] + ": " + this.aStringArray9[local28], 0, 4);
							local19.method365(local70 - 1, "To " + this.aStringArray8[local28] + ": " + this.aStringArray9[local28], 65535, 4);
							local21++;
							if (local21 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("93334, " + arg0 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method151() {
		try {
			for (@Pc(6) Class1_Sub1_Sub2 local6 = (Class1_Sub1_Sub2) this.aClass28_1.method456(); local6 != null; local6 = (Class1_Sub1_Sub2) this.aClass28_1.method458()) {
				if (local6.anInt63 != this.anInt219 || local6.aBoolean17) {
					local6.method567();
				} else if (anInt280 >= local6.anInt62) {
					local6.method29(this.anInt320);
					if (local6.aBoolean17) {
						local6.method567();
					} else {
						this.aClass33_1.method478(60, local6.anInt64, local6.anInt65, null, -1, local6.anInt66, 0, local6.anInt63, local6, false);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("36341, " + -698 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method152() {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt249; local5++) {
				@Pc(12) int local12 = this.anIntArray54[local5];
				@Pc(17) Class1_Sub1_Sub3_Sub1 local17 = this.aClass1_Sub1_Sub3_Sub1Array1[local12];
				if (local17 != null) {
					this.method153(local17, local17.aClass3_1.aByte6);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("24622, " + -24 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;ZI)V")
	private void method153(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt890 < 128 || arg0.anInt891 < 128 || arg0.anInt890 >= 13184 || arg0.anInt891 >= 13184) {
				arg0.anInt915 = -1;
				arg0.anInt920 = -1;
				arg0.anInt929 = 0;
				arg0.anInt930 = 0;
				arg0.anInt890 = arg0.anIntArray232[0] * 128 + arg0.anInt893 * 64;
				arg0.anInt891 = arg0.anIntArray233[0] * 128 + arg0.anInt893 * 64;
				arg0.anInt935 = 0;
			}
			if (arg0 == this.aClass1_Sub1_Sub3_Sub2_1 && (arg0.anInt890 < 1536 || arg0.anInt891 < 1536 || arg0.anInt890 >= 11776 || arg0.anInt891 >= 11776)) {
				arg0.anInt915 = -1;
				arg0.anInt920 = -1;
				arg0.anInt929 = 0;
				arg0.anInt930 = 0;
				arg0.anInt890 = arg0.anIntArray232[0] * 128 + arg0.anInt893 * 64;
				arg0.anInt891 = arg0.anIntArray233[0] * 128 + arg0.anInt893 * 64;
				arg0.anInt935 = 0;
			}
			if (arg0.anInt929 > anInt280) {
				this.method154(arg0, 773);
			} else if (arg0.anInt930 >= anInt280) {
				this.method155(arg0);
			} else {
				this.method156(arg0);
			}
			this.method157(arg0);
			this.method158(arg0);
			this.aBoolean40 &= true;
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("10379, " + arg0 + ", " + true + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;I)V")
	private void method154(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt929 - anInt280;
			@Pc(8) boolean local8 = false;
			@Pc(18) int local18 = arg0.anInt925 * 128 + arg0.anInt893 * 64;
			@Pc(28) int local28 = arg0.anInt927 * 128 + arg0.anInt893 * 64;
			arg0.anInt890 += (local18 - arg0.anInt890) / local4;
			arg0.anInt891 += (local28 - arg0.anInt891) / local4;
			arg0.anInt936 = 0;
			if (arg0.anInt931 == 0) {
				arg0.anInt934 = 1024;
			}
			if (arg0.anInt931 == 1) {
				arg0.anInt934 = 1536;
			}
			if (arg0.anInt931 == 2) {
				arg0.anInt934 = 0;
			}
			if (arg0.anInt931 == 3) {
				arg0.anInt934 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("53082, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!x;I)V")
	private void method155(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt930 == anInt280 || arg0.anInt915 == -1 || arg0.anInt918 != 0 || arg0.anInt917 + 1 > Class19.aClass19Array1[arg0.anInt915].anIntArray188[arg0.anInt916]) {
				@Pc(29) int local29 = arg0.anInt930 - arg0.anInt929;
				@Pc(34) int local34 = anInt280 - arg0.anInt929;
				@Pc(44) int local44 = arg0.anInt925 * 128 + arg0.anInt893 * 64;
				@Pc(54) int local54 = arg0.anInt927 * 128 + arg0.anInt893 * 64;
				@Pc(64) int local64 = arg0.anInt926 * 128 + arg0.anInt893 * 64;
				@Pc(74) int local74 = arg0.anInt928 * 128 + arg0.anInt893 * 64;
				arg0.anInt890 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt891 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt936 = 0;
			if (arg0.anInt931 == 0) {
				arg0.anInt934 = 1024;
			}
			if (arg0.anInt931 == 1) {
				arg0.anInt934 = 1536;
			}
			if (arg0.anInt931 == 2) {
				arg0.anInt934 = 0;
			}
			if (arg0.anInt931 == 3) {
				arg0.anInt934 = 512;
			}
			arg0.anInt892 = arg0.anInt934;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("96982, " + arg0 + ", " + 0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!x;I)V")
	private void method156(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt912 = arg0.anInt894;
			if (arg0.anInt935 == 0) {
				arg0.anInt936 = 0;
			} else {
				if (arg0.anInt915 != -1 && arg0.anInt918 == 0) {
					@Pc(24) Class19 local24 = Class19.aClass19Array1[arg0.anInt915];
					if (local24.anIntArray189 == null) {
						arg0.anInt936++;
						return;
					}
				}
				@Pc(37) int local37 = arg0.anInt890;
				@Pc(40) int local40 = arg0.anInt891;
				@Pc(55) int local55 = arg0.anIntArray232[arg0.anInt935 - 1] * 128 + arg0.anInt893 * 64;
				@Pc(70) int local70 = arg0.anIntArray233[arg0.anInt935 - 1] * 128 + arg0.anInt893 * 64;
				if (local55 - local37 <= 256 && local55 - local37 >= -256 && local70 - local40 <= 256 && local70 - local40 >= -256) {
					if (local37 < local55) {
						if (local40 < local70) {
							arg0.anInt934 = 1280;
						} else if (local40 > local70) {
							arg0.anInt934 = 1792;
						} else {
							arg0.anInt934 = 1536;
						}
					} else if (local37 > local55) {
						if (local40 < local70) {
							arg0.anInt934 = 768;
						} else if (local40 > local70) {
							arg0.anInt934 = 256;
						} else {
							arg0.anInt934 = 512;
						}
					} else if (local40 < local70) {
						arg0.anInt934 = 1024;
					} else {
						arg0.anInt934 = 0;
					}
					@Pc(164) int local164 = arg0.anInt934 - arg0.anInt892 & 0x7FF;
					if (local164 > 1024) {
						local164 -= 2048;
					}
					@Pc(171) int local171 = arg0.anInt897;
					if (local164 >= -256 && local164 <= 256) {
						local171 = arg0.anInt896;
					} else if (local164 >= 256 && local164 < 768) {
						local171 = arg0.anInt899;
					} else if (local164 >= -768 && local164 <= -256) {
						local171 = arg0.anInt898;
					}
					if (local171 == -1) {
						local171 = arg0.anInt896;
					}
					arg0.anInt912 = local171;
					@Pc(213) int local213 = 4;
					if (arg0.anInt892 != arg0.anInt934 && arg0.anInt909 == -1) {
						local213 = 2;
					}
					if (arg0.anInt935 > 2) {
						local213 = 6;
					}
					if (arg0.anInt935 > 3) {
						local213 = 8;
					}
					if (arg0.anInt936 > 0 && arg0.anInt935 > 1) {
						local213 = 8;
						arg0.anInt936--;
					}
					if (arg0.aBooleanArray9[arg0.anInt935 - 1]) {
						local213 <<= 0x1;
					}
					if (local213 >= 8 && arg0.anInt912 == arg0.anInt896 && arg0.anInt900 != -1) {
						arg0.anInt912 = arg0.anInt900;
					}
					if (local37 < local55) {
						arg0.anInt890 += local213;
						if (arg0.anInt890 > local55) {
							arg0.anInt890 = local55;
						}
					} else if (local37 > local55) {
						arg0.anInt890 -= local213;
						if (arg0.anInt890 < local55) {
							arg0.anInt890 = local55;
						}
					}
					if (local40 < local70) {
						arg0.anInt891 += local213;
						if (arg0.anInt891 > local70) {
							arg0.anInt891 = local70;
						}
					} else if (local40 > local70) {
						arg0.anInt891 -= local213;
						if (arg0.anInt891 < local70) {
							arg0.anInt891 = local70;
						}
					}
					if (arg0.anInt890 == local55 && arg0.anInt891 == local70) {
						arg0.anInt935--;
					}
				} else {
					arg0.anInt890 = local55;
					arg0.anInt891 = local70;
				}
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("59871, " + arg0 + ", " + 7 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!x;)V")
	private void method157(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(28) int local28;
			@Pc(34) int local34;
			if (arg0.anInt909 != -1 && arg0.anInt909 < 32768) {
				@Pc(20) Class1_Sub1_Sub3_Sub1 local20 = this.aClass1_Sub1_Sub3_Sub1Array1[arg0.anInt909];
				if (local20 != null) {
					local28 = arg0.anInt890 - local20.anInt890;
					local34 = arg0.anInt891 - local20.anInt891;
					if (local28 != 0 || local34 != 0) {
						arg0.anInt934 = (int) (Math.atan2((double) local28, (double) local34) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(59) int local59;
			if (arg0.anInt909 >= 32768) {
				local59 = arg0.anInt909 - 32768;
				if (local59 == this.anInt248) {
					local59 = this.anInt285;
				}
				@Pc(71) Class1_Sub1_Sub3_Sub2 local71 = this.aClass1_Sub1_Sub3_Sub2Array1[local59];
				if (local71 != null) {
					local34 = arg0.anInt890 - local71.anInt890;
					@Pc(85) int local85 = arg0.anInt891 - local71.anInt891;
					if (local34 != 0 || local85 != 0) {
						arg0.anInt934 = (int) (Math.atan2((double) local34, (double) local85) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt910 != 0 || arg0.anInt911 != 0) && (arg0.anInt935 == 0 || arg0.anInt936 > 0)) {
				local59 = arg0.anInt890 - (arg0.anInt910 - this.anInt192 - this.anInt192) * 64;
				local28 = arg0.anInt891 - (arg0.anInt911 - this.anInt193 - this.anInt193) * 64;
				if (local59 != 0 || local28 != 0) {
					arg0.anInt934 = (int) (Math.atan2((double) local59, (double) local28) * 325.949D) & 0x7FF;
				}
				arg0.anInt910 = 0;
				arg0.anInt911 = 0;
			}
			local59 = arg0.anInt934 - arg0.anInt892 & 0x7FF;
			if (local59 != 0) {
				if (local59 < 32 || local59 > 2016) {
					arg0.anInt892 = arg0.anInt934;
				} else if (local59 > 1024) {
					arg0.anInt892 -= 32;
				} else {
					arg0.anInt892 += 32;
				}
				arg0.anInt892 &= 0x7FF;
				if (arg0.anInt912 == arg0.anInt894 && arg0.anInt892 != arg0.anInt934) {
					if (arg0.anInt895 != -1) {
						arg0.anInt912 = arg0.anInt895;
						return;
					}
					arg0.anInt912 = arg0.anInt896;
					return;
				}
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("66793, " + false + ", " + arg0 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!x;)V")
	private void method158(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.aBoolean159 = false;
			@Pc(20) Class19 local20;
			if (arg0.anInt912 != -1) {
				local20 = Class19.aClass19Array1[arg0.anInt912];
				arg0.anInt914++;
				if (arg0.anInt913 < local20.anInt538 && arg0.anInt914 > local20.anIntArray188[arg0.anInt913]) {
					arg0.anInt914 = 0;
					arg0.anInt913++;
				}
				if (arg0.anInt913 >= local20.anInt538) {
					arg0.anInt914 = 0;
					arg0.anInt913 = 0;
				}
			}
			if (arg0.anInt915 != -1 && arg0.anInt918 == 0) {
				local20 = Class19.aClass19Array1[arg0.anInt915];
				arg0.anInt917++;
				while (arg0.anInt916 < local20.anInt538 && arg0.anInt917 > local20.anIntArray188[arg0.anInt916]) {
					arg0.anInt917 -= local20.anIntArray188[arg0.anInt916];
					arg0.anInt916++;
				}
				if (arg0.anInt916 >= local20.anInt538) {
					arg0.anInt916 -= local20.anInt539;
					arg0.anInt919++;
					if (arg0.anInt919 >= local20.anInt543) {
						arg0.anInt915 = -1;
					}
					if (arg0.anInt916 < 0 || arg0.anInt916 >= local20.anInt538) {
						arg0.anInt915 = -1;
					}
				}
				arg0.aBoolean159 = local20.aBoolean127;
			}
			if (arg0.anInt918 > 0) {
				arg0.anInt918--;
			}
			if (arg0.anInt920 != -1 && anInt280 >= arg0.anInt923) {
				if (arg0.anInt921 < 0) {
					arg0.anInt921 = 0;
				}
				local20 = Class21.aClass21Array1[arg0.anInt920].aClass19_1;
				arg0.anInt922++;
				while (arg0.anInt921 < local20.anInt538 && arg0.anInt922 > local20.anIntArray188[arg0.anInt921]) {
					arg0.anInt922 -= local20.anIntArray188[arg0.anInt921];
					arg0.anInt921++;
				}
				if (arg0.anInt921 >= local20.anInt538) {
					if (arg0.anInt921 < 0 || arg0.anInt921 >= local20.anInt538) {
						arg0.anInt920 = -1;
					}
					return;
				}
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("93608, " + -39261 + ", " + arg0 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method159() {
		try {
			if (this.aBoolean65) {
				this.aBoolean65 = false;
				this.aClass32_3.method464(super.aGraphics2, 11, 0);
				this.aClass32_4.method464(super.aGraphics2, 375, 0);
				this.aClass32_5.method464(super.aGraphics2, 5, 729);
				this.aClass32_6.method464(super.aGraphics2, 231, 752);
				this.aClass32_7.method464(super.aGraphics2, 0, 0);
				this.aClass32_8.method464(super.aGraphics2, 0, 561);
				this.aClass32_9.method464(super.aGraphics2, 11, 520);
				this.aClass32_10.method464(super.aGraphics2, 231, 520);
				this.aClass32_11.method464(super.aGraphics2, 375, 501);
				this.aClass32_12.method464(super.aGraphics2, 345, 0);
				this.aBoolean34 = true;
				this.aBoolean41 = true;
				this.aBoolean59 = true;
				this.aBoolean61 = true;
				if (this.anInt212 != 2) {
					this.aClass32_18.method464(super.aGraphics2, 11, 8);
					this.aClass32_17.method464(super.aGraphics2, 5, 561);
				}
			}
			if (this.anInt212 == 2) {
				this.method173(this.anInt310);
			}
			if (this.aBoolean54 && this.anInt184 == 1) {
				this.aBoolean34 = true;
			}
			@Pc(147) boolean local147;
			if (this.anInt322 != -1) {
				local147 = this.method180(this.anInt322, this.anInt320);
				if (local147) {
					this.aBoolean34 = true;
				}
			}
			if (this.anInt336 == 2) {
				this.aBoolean34 = true;
			}
			if (this.anInt174 == 2) {
				this.aBoolean34 = true;
			}
			if (this.aBoolean34) {
				this.method147();
				this.aBoolean34 = false;
			}
			if (this.anInt196 == -1) {
				this.aClass15_1.anInt475 = this.anInt209 - this.anInt163 - 77;
				if (super.anInt138 > 453 && super.anInt138 < 565 && super.anInt139 > 350) {
					this.method137(super.anInt139 - 375, super.anInt138 - 22, this.aClass15_1, (byte) 4, 463, 77, false, this.anInt209, 0);
				}
				@Pc(229) int local229 = this.anInt209 - this.aClass15_1.anInt475 - 77;
				if (local229 < 0) {
					local229 = 0;
				}
				if (local229 > this.anInt209 - 77) {
					local229 = this.anInt209 - 77;
				}
				if (this.anInt163 != local229) {
					this.anInt163 = local229;
					this.aBoolean41 = true;
				}
			}
			if (this.anInt196 != -1) {
				local147 = this.method180(this.anInt196, this.anInt320);
				if (local147) {
					this.aBoolean41 = true;
				}
			}
			if (this.anInt336 == 3) {
				this.aBoolean41 = true;
			}
			if (this.anInt174 == 3) {
				this.aBoolean41 = true;
			}
			if (this.aString14 != null) {
				this.aBoolean41 = true;
			}
			if (this.aBoolean54 && this.anInt184 == 2) {
				this.aBoolean41 = true;
			}
			if (this.aBoolean41) {
				this.method132();
				this.aBoolean41 = false;
			}
			if (this.anInt212 == 2) {
				this.method117();
				this.aClass32_17.method464(super.aGraphics2, 5, 561);
			}
			if (this.anInt318 != -1) {
				this.aBoolean59 = true;
			}
			if (this.aBoolean59) {
				if (this.anInt318 != -1 && this.anInt318 == this.anInt231) {
					this.anInt318 = -1;
					this.aClass1_Sub3_Sub3_5.method380(175);
					this.aClass1_Sub3_Sub3_5.method381(this.anInt231);
				}
				this.aBoolean59 = false;
				this.aClass32_15.method463();
				this.aClass1_Sub3_Sub2_Sub3_8.method350(0, 0);
				if (this.anInt322 == -1) {
					if (this.anIntArray32[this.anInt231] != -1) {
						if (this.anInt231 == 0) {
							this.aClass1_Sub3_Sub2_Sub3_1.method350(30, 29);
						}
						if (this.anInt231 == 1) {
							this.aClass1_Sub3_Sub2_Sub3_2.method350(29, 59);
						}
						if (this.anInt231 == 2) {
							this.aClass1_Sub3_Sub2_Sub3_2.method350(29, 87);
						}
						if (this.anInt231 == 3) {
							this.aClass1_Sub3_Sub2_Sub3_3.method350(29, 115);
						}
						if (this.anInt231 == 4) {
							this.aClass1_Sub3_Sub2_Sub3_5.method350(29, 156);
						}
						if (this.anInt231 == 5) {
							this.aClass1_Sub3_Sub2_Sub3_5.method350(29, 184);
						}
						if (this.anInt231 == 6) {
							this.aClass1_Sub3_Sub2_Sub3_4.method350(30, 212);
						}
					}
					if (this.anIntArray32[0] != -1 && (this.anInt318 != 0 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[0].method350(34, 35);
					}
					if (this.anIntArray32[1] != -1 && (this.anInt318 != 1 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[1].method350(32, 59);
					}
					if (this.anIntArray32[2] != -1 && (this.anInt318 != 2 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[2].method350(32, 86);
					}
					if (this.anIntArray32[3] != -1 && (this.anInt318 != 3 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[3].method350(33, 121);
					}
					if (this.anIntArray32[4] != -1 && (this.anInt318 != 4 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[4].method350(34, 157);
					}
					if (this.anIntArray32[5] != -1 && (this.anInt318 != 5 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[5].method350(32, 185);
					}
					if (this.anIntArray32[6] != -1 && (this.anInt318 != 6 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[6].method350(34, 212);
					}
				}
				this.aClass32_15.method464(super.aGraphics2, 165, 520);
				this.aClass32_14.method463();
				this.aClass1_Sub3_Sub2_Sub3_7.method350(0, 0);
				if (this.anInt322 == -1) {
					if (this.anIntArray32[this.anInt231] != -1) {
						if (this.anInt231 == 7) {
							this.aClass1_Sub3_Sub2_Sub3_9.method350(0, 49);
						}
						if (this.anInt231 == 8) {
							this.aClass1_Sub3_Sub2_Sub3_10.method350(0, 81);
						}
						if (this.anInt231 == 9) {
							this.aClass1_Sub3_Sub2_Sub3_10.method350(0, 108);
						}
						if (this.anInt231 == 10) {
							this.aClass1_Sub3_Sub2_Sub3_11.method350(1, 136);
						}
						if (this.anInt231 == 11) {
							this.aClass1_Sub3_Sub2_Sub3_13.method350(0, 178);
						}
						if (this.anInt231 == 12) {
							this.aClass1_Sub3_Sub2_Sub3_13.method350(0, 205);
						}
						if (this.anInt231 == 13) {
							this.aClass1_Sub3_Sub2_Sub3_12.method350(0, 233);
						}
					}
					if (this.anIntArray32[8] != -1 && (this.anInt318 != 8 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[7].method350(2, 80);
					}
					if (this.anIntArray32[9] != -1 && (this.anInt318 != 9 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[8].method350(3, 107);
					}
					if (this.anIntArray32[10] != -1 && (this.anInt318 != 10 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[9].method350(4, 142);
					}
					if (this.anIntArray32[11] != -1 && (this.anInt318 != 11 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[10].method350(2, 179);
					}
					if (this.anIntArray32[12] != -1 && (this.anInt318 != 12 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[11].method350(2, 206);
					}
					if (this.anIntArray32[13] != -1 && (this.anInt318 != 13 || anInt280 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[12].method350(2, 230);
					}
				}
				this.aClass32_14.method464(super.aGraphics2, 492, 501);
				this.aClass32_18.method463();
			}
			if (this.aBoolean61) {
				this.aBoolean61 = false;
				this.aClass32_13.method463();
				this.aClass1_Sub3_Sub2_Sub3_6.method350(0, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method363("Public chat", true, 16777215, 57, 33);
				if (this.anInt339 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("On", true, 65280, 57, 46);
				}
				if (this.anInt339 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("Friends", true, 16776960, 57, 46);
				}
				if (this.anInt339 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("Off", true, 16711680, 57, 46);
				}
				if (this.anInt339 == 3) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("Hide", true, 65535, 57, 46);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method363("Private chat", true, 16777215, 186, 33);
				if (this.anInt155 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("On", true, 65280, 186, 46);
				}
				if (this.anInt155 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("Friends", true, 16776960, 186, 46);
				}
				if (this.anInt155 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("Off", true, 16711680, 186, 46);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method363("Trade/duel", true, 16777215, 326, 33);
				if (this.anInt230 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("On", true, 65280, 326, 46);
				}
				if (this.anInt230 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("Friends", true, 16776960, 326, 46);
				}
				if (this.anInt230 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363("Off", true, 16711680, 326, 46);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method363("Report abuse", true, 16777215, 462, 38);
				this.aClass32_13.method464(super.aGraphics2, 471, 0);
				this.aClass32_18.method463();
			}
			this.anInt320 = 0;
		} catch (@Pc(1058) RuntimeException local1058) {
			signlink.reporterror("60707, " + -58 + ", " + local1058.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method160(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(15) Class1_Sub6 local15 = (Class1_Sub6) this.aClass28_4.method456(); local15 != null; local15 = (Class1_Sub6) this.aClass28_4.method458()) {
				@Pc(19) boolean local19 = false;
				local15.anInt645 += this.anInt320;
				if (local15.anInt644 == -1) {
					local15.anInt644 = 0;
					local19 = true;
				}
				label70: {
					do {
						do {
							if (local15.anInt645 <= local15.aClass19_2.anIntArray188[local15.anInt644]) {
								break label70;
							}
							local15.anInt645 -= local15.aClass19_2.anIntArray188[local15.anInt644] + 1;
							local15.anInt644++;
							local19 = true;
						} while (local15.anInt644 < local15.aClass19_2.anInt538);
						local15.anInt644 -= local15.aClass19_2.anInt539;
					} while (local15.anInt644 >= 0 && local15.anInt644 < local15.aClass19_2.anInt538);
					local15.method567();
					local19 = false;
				}
				if (local19) {
					@Pc(101) int local101 = local15.anInt639;
					@Pc(104) int local104 = local15.anInt641;
					@Pc(107) int local107 = local15.anInt642;
					@Pc(109) int local109 = 0;
					if (local15.anInt640 == 0) {
						local109 = this.aClass33_1.method494(local101, local104, local107);
					}
					if (local15.anInt640 == 1) {
						local109 = this.aClass33_1.method495(local104, local101, local107);
					}
					if (local15.anInt640 == 2) {
						local109 = this.aClass33_1.method496(local101, local104, local107);
					}
					if (local15.anInt640 == 3) {
						local109 = this.aClass33_1.method497(local101, local104, local107);
					}
					if (local109 != 0 && (local109 >> 14 & 0x7FFF) == local15.anInt643) {
						@Pc(176) int local176 = this.anIntArrayArrayArray3[local101][local104][local107];
						@Pc(187) int local187 = this.anIntArrayArrayArray3[local101][local104 + 1][local107];
						@Pc(200) int local200 = this.anIntArrayArrayArray3[local101][local104 + 1][local107 + 1];
						@Pc(211) int local211 = this.anIntArrayArrayArray3[local101][local104][local107 + 1];
						@Pc(215) Class2 local215 = Class2.method23(local15.anInt643);
						@Pc(217) int local217 = -1;
						if (local15.anInt644 != -1) {
							local217 = local15.aClass19_2.anIntArray186[local15.anInt644];
						}
						@Pc(240) int local240;
						@Pc(244) int local244;
						@Pc(248) int local248;
						@Pc(263) Class1_Sub3_Sub1 local263;
						if (local15.anInt640 == 2) {
							local240 = this.aClass33_1.method498(local101, local104, local107, local109);
							local244 = local240 & 0x1F;
							local248 = local240 >> 6;
							if (local244 == 11) {
								local244 = 10;
							}
							local263 = local215.method26(local244, local248, local176, local187, local200, local211, local217);
							this.aClass33_1.method483(this.anInt199, local263, local101, local107, local104);
						} else if (local15.anInt640 == 1) {
							@Pc(288) Class1_Sub3_Sub1 local288 = local215.method26(4, 0, local176, local187, local200, local211, local217);
							this.aClass33_1.method485(local107, local104, local101, local288);
						} else if (local15.anInt640 == 0) {
							local240 = this.aClass33_1.method498(local101, local104, local107, local109);
							local244 = local240 & 0x1F;
							local248 = local240 >> 6;
							if (local244 == 2) {
								@Pc(326) int local326 = local248 + 1 & 0x3;
								@Pc(338) Class1_Sub3_Sub1 local338 = local215.method26(2, local248 + 4, local176, local187, local200, local211, local217);
								@Pc(348) Class1_Sub3_Sub1 local348 = local215.method26(2, local326, local176, local187, local200, local211, local217);
								this.aClass33_1.method488(local348, local101, local107, local104, local338);
							} else {
								local263 = local215.method26(local244, local248, local176, local187, local200, local211, local217);
								this.aClass33_1.method487(local104, local101, local263, local107);
							}
						} else if (local15.anInt640 == 3) {
							local240 = this.aClass33_1.method498(local101, local104, local107, local109);
							local244 = local240 >> 6;
							@Pc(405) Class1_Sub3_Sub1 local405 = local215.method26(22, local244, local176, local187, local200, local211, local217);
							this.aClass33_1.method486(local107, local104, local101, local405);
						}
					} else {
						local15.method567();
					}
				}
			}
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("80123, " + arg0 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method161() {
		try {
			@Pc(19) int local19;
			for (@Pc(11) int local11 = -1; local11 < this.anInt286; local11++) {
				if (local11 == -1) {
					local19 = this.anInt285;
				} else {
					local19 = this.anIntArray62[local11];
				}
				@Pc(31) Class1_Sub1_Sub3_Sub2 local31 = this.aClass1_Sub1_Sub3_Sub2Array1[local19];
				if (local31 != null && local31.anInt901 > 0) {
					local31.anInt901--;
					if (local31.anInt901 == 0) {
						local31.aString29 = null;
					}
				}
			}
			for (local19 = 0; local19 < this.anInt249; local19++) {
				@Pc(62) int local62 = this.anIntArray54[local19];
				@Pc(67) Class1_Sub1_Sub3_Sub1 local67 = this.aClass1_Sub1_Sub3_Sub1Array1[local62];
				if (local67 != null && local67.anInt901 > 0) {
					local67.anInt901--;
					if (local67.anInt901 == 0) {
						local67.aString29 = null;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("34755, " + 38691 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method162() {
		try {
			this.aClass1_Sub3_Sub2_Sub3_19 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebox", 0);
			this.aClass1_Sub3_Sub2_Sub3_20 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebutton", 0);
			this.aClass1_Sub3_Sub2_Sub3Array3 = new Class1_Sub3_Sub2_Sub3[12];
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				this.aClass1_Sub3_Sub2_Sub3Array3[local30] = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "runes", local30);
			}
			this.aClass1_Sub3_Sub2_Sub2_6 = new Class1_Sub3_Sub2_Sub2(128, 265);
			this.aClass1_Sub3_Sub2_Sub2_7 = new Class1_Sub3_Sub2_Sub2(128, 265);
			for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
				this.aClass1_Sub3_Sub2_Sub2_6.anIntArray148[local63] = this.aClass32_23.anIntArray197[local63];
			}
			for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
				this.aClass1_Sub3_Sub2_Sub2_7.anIntArray148[local81] = this.aClass32_24.anIntArray197[local81];
			}
			this.anIntArray58 = new int[256];
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				this.anIntArray58[local103] = local103 * 262144;
			}
			for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
				this.anIntArray58[local118 + 64] = local118 * 1024 + 16711680;
			}
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray58[local137 + 128] = local137 * 4 + 16776960;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray58[local156 + 192] = 16777215;
			}
			this.anIntArray59 = new int[256];
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray59[local175] = local175 * 1024;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray59[local190 + 64] = local190 * 4 + 65280;
			}
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray59[local209 + 128] = local209 * 262144 + 65535;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray59[local228 + 192] = 16777215;
			}
			this.anIntArray60 = new int[256];
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray60[local247] = local247 * 4;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray60[local262 + 64] = local262 * 262144 + 255;
			}
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray60[local281 + 128] = local281 * 1024 + 16711935;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray60[local300 + 192] = 16777215;
			}
			this.anIntArray57 = new int[256];
			this.anIntArray71 = new int[32768];
			this.anIntArray72 = new int[32768];
			this.method103(null);
			this.anIntArray51 = new int[32768];
			this.anIntArray52 = new int[32768];
			this.method74("Connecting to fileserver", 10);
			if (!this.aBoolean48) {
				this.aBoolean33 = true;
				this.aBoolean48 = true;
				this.method73(this, 2);
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("57, " + 0 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method68() {
		try {
			if (!this.aBoolean69 && !this.aBoolean46 && !this.aBoolean42) {
				anInt280++;
				if (this.aBoolean40) {
					this.method119();
				} else {
					this.method198(this.anInt215);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("71532, " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!hc;)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		try {
			this.anInt150 += 0;
			if (arg5.anInt466 == 0 && arg5.anIntArray153 != null && !arg5.aBoolean109 && (arg4 >= arg0 && arg3 >= arg2 && arg4 <= arg0 + arg5.anInt469 && arg3 <= arg2 + arg5.anInt470)) {
				@Pc(40) int local40 = arg5.anIntArray153.length;
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(51) int local51 = arg5.anIntArray154[local42] + arg0;
					@Pc(60) int local60 = arg5.anIntArray155[local42] + arg2 - arg1;
					@Pc(67) Class15 local67 = Class15.aClass15Array1[arg5.anIntArray153[local42]];
					@Pc(72) int local72 = local51 + local67.anInt471;
					@Pc(77) int local77 = local60 + local67.anInt472;
					if ((local67.anInt473 >= 0 || local67.anInt481 != 0) && arg4 >= local72 && arg3 >= local77 && arg4 < local72 + local67.anInt469 && arg3 < local77 + local67.anInt470) {
						if (local67.anInt473 >= 0) {
							this.anInt166 = local67.anInt473;
						} else {
							this.anInt166 = local67.anInt464;
						}
					}
					if (local67.anInt466 == 0) {
						this.method163(local72, local67.anInt475, local77, arg3, arg4, local67);
						if (local67.anInt474 > local67.anInt470) {
							this.method137(arg3, arg4, local67, (byte) 4, local72 + local67.anInt469, local67.anInt470, true, local67.anInt474, local77);
						}
					} else {
						if (local67.anInt467 == 1 && arg4 >= local72 && arg3 >= local77 && arg4 < local72 + local67.anInt469 && arg3 < local77 + local67.anInt470) {
							@Pc(174) boolean local174 = false;
							if (local67.anInt468 != 0) {
								local174 = this.method186(local67, this.anInt323);
							}
							if (!local174) {
								this.aStringArray6[this.anInt190] = local67.aString24;
								this.anIntArray79[this.anInt190] = 951;
								this.anIntArray78[this.anInt190] = local67.anInt464;
								this.anInt190++;
							}
						}
						if (local67.anInt467 == 2 && this.anInt160 == 0 && arg4 >= local72 && arg3 >= local77 && arg4 < local72 + local67.anInt469 && arg3 < local77 + local67.anInt470) {
							@Pc(239) String local239 = local67.aString22;
							if (local239.indexOf(" ") != -1) {
								local239 = local239.substring(0, local239.indexOf(" "));
							}
							this.aStringArray6[this.anInt190] = local239 + " @gre@" + local67.aString23;
							this.anIntArray79[this.anInt190] = 930;
							this.anIntArray78[this.anInt190] = local67.anInt464;
							this.anInt190++;
						}
						if (local67.anInt467 == 3 && arg4 >= local72 && arg3 >= local77 && arg4 < local72 + local67.anInt469 && arg3 < local77 + local67.anInt470) {
							this.aStringArray6[this.anInt190] = "Close";
							this.anIntArray79[this.anInt190] = 947;
							this.anIntArray78[this.anInt190] = local67.anInt464;
							this.anInt190++;
						}
						if (local67.anInt467 == 4 && arg4 >= local72 && arg3 >= local77 && arg4 < local72 + local67.anInt469 && arg3 < local77 + local67.anInt470) {
							this.aStringArray6[this.anInt190] = local67.aString24;
							this.anIntArray79[this.anInt190] = 465;
							this.anIntArray78[this.anInt190] = local67.anInt464;
							this.anInt190++;
						}
						if (local67.anInt467 == 5 && arg4 >= local72 && arg3 >= local77 && arg4 < local72 + local67.anInt469 && arg3 < local77 + local67.anInt470) {
							this.aStringArray6[this.anInt190] = local67.aString24;
							this.anIntArray79[this.anInt190] = 960;
							this.anIntArray78[this.anInt190] = local67.anInt464;
							this.anInt190++;
						}
						if (local67.anInt467 == 6 && !this.aBoolean67 && arg4 >= local72 && arg3 >= local77 && arg4 < local72 + local67.anInt469 && arg3 < local77 + local67.anInt470) {
							this.aStringArray6[this.anInt190] = local67.aString24;
							this.anIntArray79[this.anInt190] = 44;
							this.anIntArray78[this.anInt190] = local67.anInt464;
							this.anInt190++;
						}
						if (local67.anInt466 == 2) {
							@Pc(487) int local487 = 0;
							for (@Pc(489) int local489 = 0; local489 < local67.anInt470; local489++) {
								for (@Pc(493) int local493 = 0; local493 < local67.anInt469; local493++) {
									@Pc(504) int local504 = local72 + local493 * (local67.anInt477 + 32);
									@Pc(513) int local513 = local77 + local489 * (local67.anInt478 + 32);
									if (local487 < 20) {
										local504 += local67.anIntArray156[local487];
										local513 += local67.anIntArray157[local487];
									}
									if (arg4 >= local504 && arg3 >= local513 && arg4 < local504 + 32 && arg3 < local513 + 32) {
										this.anInt304 = local487;
										this.anInt305 = local67.anInt464;
										if (local67.anIntArray149[local487] > 0) {
											@Pc(566) Class5 local566 = Class5.method54(local67.anIntArray149[local487] - 1);
											if (this.anInt297 == 1 && local67.aBoolean112) {
												if (local67.anInt464 != this.anInt299 || local487 != this.anInt298) {
													this.aStringArray6[this.anInt190] = "Use " + this.aString17 + " with @lre@" + local566.aString3;
													this.anIntArray79[this.anInt190] = 881;
													this.anIntArray80[this.anInt190] = local566.anInt105;
													this.anIntArray77[this.anInt190] = local487;
													this.anIntArray78[this.anInt190] = local67.anInt464;
													this.anInt190++;
												}
											} else if (this.anInt160 != 1 || !local67.aBoolean112) {
												@Pc(703) int local703;
												if (local67.aBoolean112) {
													for (local703 = 4; local703 >= 3; local703--) {
														if (local566.aStringArray4 != null && local566.aStringArray4[local703] != null) {
															this.aStringArray6[this.anInt190] = local566.aStringArray4[local703] + " @lre@" + local566.aString3;
															if (local703 == 3) {
																this.anIntArray79[this.anInt190] = 478;
															}
															if (local703 == 4) {
																this.anIntArray79[this.anInt190] = 347;
															}
															this.anIntArray80[this.anInt190] = local566.anInt105;
															this.anIntArray77[this.anInt190] = local487;
															this.anIntArray78[this.anInt190] = local67.anInt464;
															this.anInt190++;
														} else if (local703 == 4) {
															this.aStringArray6[this.anInt190] = "Drop @lre@" + local566.aString3;
															this.anIntArray79[this.anInt190] = 347;
															this.anIntArray80[this.anInt190] = local566.anInt105;
															this.anIntArray77[this.anInt190] = local487;
															this.anIntArray78[this.anInt190] = local67.anInt464;
															this.anInt190++;
														}
													}
												}
												if (local67.aBoolean113) {
													this.aStringArray6[this.anInt190] = "Use @lre@" + local566.aString3;
													this.anIntArray79[this.anInt190] = 188;
													this.anIntArray80[this.anInt190] = local566.anInt105;
													this.anIntArray77[this.anInt190] = local487;
													this.anIntArray78[this.anInt190] = local67.anInt464;
													this.anInt190++;
												}
												if (local67.aBoolean112 && local566.aStringArray4 != null) {
													for (local703 = 2; local703 >= 0; local703--) {
														if (local566.aStringArray4[local703] != null) {
															this.aStringArray6[this.anInt190] = local566.aStringArray4[local703] + " @lre@" + local566.aString3;
															if (local703 == 0) {
																this.anIntArray79[this.anInt190] = 405;
															}
															if (local703 == 1) {
																this.anIntArray79[this.anInt190] = 38;
															}
															if (local703 == 2) {
																this.anIntArray79[this.anInt190] = 422;
															}
															this.anIntArray80[this.anInt190] = local566.anInt105;
															this.anIntArray77[this.anInt190] = local487;
															this.anIntArray78[this.anInt190] = local67.anInt464;
															this.anInt190++;
														}
													}
												}
												if (local67.aStringArray10 != null) {
													for (local703 = 4; local703 >= 0; local703--) {
														if (local67.aStringArray10[local703] != null) {
															this.aStringArray6[this.anInt190] = local67.aStringArray10[local703] + " @lre@" + local566.aString3;
															if (local703 == 0) {
																this.anIntArray79[this.anInt190] = 602;
															}
															if (local703 == 1) {
																this.anIntArray79[this.anInt190] = 596;
															}
															if (local703 == 2) {
																this.anIntArray79[this.anInt190] = 22;
															}
															if (local703 == 3) {
																this.anIntArray79[this.anInt190] = 892;
															}
															if (local703 == 4) {
																this.anIntArray79[this.anInt190] = 415;
															}
															this.anIntArray80[this.anInt190] = local566.anInt105;
															this.anIntArray77[this.anInt190] = local487;
															this.anIntArray78[this.anInt190] = local67.anInt464;
															this.anInt190++;
														}
													}
												}
												this.aStringArray6[this.anInt190] = "Examine @lre@" + local566.aString3;
												this.anIntArray79[this.anInt190] = 1773;
												this.anIntArray80[this.anInt190] = local566.anInt105;
												this.anIntArray78[this.anInt190] = local67.anIntArray150[local487];
												this.anInt190++;
											} else if ((this.anInt162 & 0x10) == 16) {
												this.aStringArray6[this.anInt190] = this.aString6 + " @lre@" + local566.aString3;
												this.anIntArray79[this.anInt190] = 391;
												this.anIntArray80[this.anInt190] = local566.anInt105;
												this.anIntArray77[this.anInt190] = local487;
												this.anIntArray78[this.anInt190] = local67.anInt464;
												this.anInt190++;
											}
										}
									}
									local487++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1129) RuntimeException local1129) {
			signlink.reporterror("44993, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private String method164(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("9972, " + arg0 + ", " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method165(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.anInt151 = this.aClass1_Sub3_Sub3_6.method391();
			}
			this.aBoolean58 = true;
			for (@Pc(13) int local13 = 0; local13 < 7; local13++) {
				this.anIntArray76[local13] = -1;
				for (@Pc(22) int local22 = 0; local22 < Class13.anInt432; local22++) {
					if (!Class13.aClass13Array1[local22].aBoolean103 && Class13.aClass13Array1[local22].anInt433 == local13 + (this.aBoolean60 ? 0 : 7)) {
						this.anIntArray76[local13] = local22;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("70947, " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method71() {
		try {
			this.aBoolean65 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("58465, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!hc;I)Z")
	private boolean method167(@OriginalArg(0) Class15 arg0) {
		try {
			if (arg0.anIntArray151 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray151.length; local6++) {
				@Pc(14) int local14 = this.method170(arg0, local6);
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
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("21752, " + arg0 + ", " + 108 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method168() {
		try {
			@Pc(6) int local6 = this.anInt324 * 128 + 64;
			@Pc(13) int local13 = this.anInt325 * 128 + 64;
			@Pc(26) int local26 = this.method199(this.anInt325, this.anInt219, this.anInt324) - this.anInt326;
			if (this.anInt255 < local6) {
				this.anInt255 += this.anInt327 + (local6 - this.anInt255) * this.anInt328 / 1000;
				if (this.anInt255 > local6) {
					this.anInt255 = local6;
				}
			}
			if (this.anInt255 > local6) {
				this.anInt255 -= this.anInt327 + (this.anInt255 - local6) * this.anInt328 / 1000;
				if (this.anInt255 < local6) {
					this.anInt255 = local6;
				}
			}
			if (this.anInt256 < local26) {
				this.anInt256 += this.anInt327 + (local26 - this.anInt256) * this.anInt328 / 1000;
				if (this.anInt256 > local26) {
					this.anInt256 = local26;
				}
			}
			if (this.anInt256 > local26) {
				this.anInt256 -= this.anInt327 + (this.anInt256 - local26) * this.anInt328 / 1000;
				if (this.anInt256 < local26) {
					this.anInt256 = local26;
				}
			}
			if (this.anInt257 < local13) {
				this.anInt257 += this.anInt327 + (local13 - this.anInt257) * this.anInt328 / 1000;
				if (this.anInt257 > local13) {
					this.anInt257 = local13;
				}
			}
			if (this.anInt257 > local13) {
				this.anInt257 -= this.anInt327 + (this.anInt257 - local13) * this.anInt328 / 1000;
				if (this.anInt257 < local13) {
					this.anInt257 = local13;
				}
			}
			local6 = this.anInt224 * 128 + 64;
			local13 = this.anInt225 * 128 + 64;
			local26 = this.method199(this.anInt225, this.anInt219, this.anInt224) - this.anInt226;
			@Pc(232) int local232 = local6 - this.anInt255;
			@Pc(237) int local237 = local26 - this.anInt256;
			@Pc(242) int local242 = local13 - this.anInt257;
			@Pc(253) int local253 = (int) Math.sqrt((double) (local232 * local232 + local242 * local242));
			@Pc(264) int local264 = (int) (Math.atan2((double) local237, (double) local253) * 325.949D) & 0x7FF;
			@Pc(275) int local275 = (int) (Math.atan2((double) local232, (double) local242) * -325.949D) & 0x7FF;
			if (local264 < 128) {
				local264 = 128;
			}
			if (local264 > 383) {
				local264 = 383;
			}
			if (this.anInt258 < local264) {
				this.anInt258 += this.anInt227 + (local264 - this.anInt258) * this.anInt228 / 1000;
				if (this.anInt258 > local264) {
					this.anInt258 = local264;
				}
			}
			if (this.anInt258 > local264) {
				this.anInt258 -= this.anInt227 + (this.anInt258 - local264) * this.anInt228 / 1000;
				if (this.anInt258 < local264) {
					this.anInt258 = local264;
				}
			}
			@Pc(346) int local346 = local275 - this.anInt259;
			if (local346 > 1024) {
				local346 -= 2048;
			}
			if (local346 < -1024) {
				local346 += 2048;
			}
			if (local346 > 0) {
				this.anInt259 += this.anInt227 + local346 * this.anInt228 / 1000;
				this.anInt259 &= 0x7FF;
			}
			if (local346 < 0) {
				this.anInt259 -= this.anInt227 + -local346 * this.anInt228 / 1000;
				this.anInt259 &= 0x7FF;
			}
			@Pc(404) int local404 = local275 - this.anInt259;
			if (local404 > 1024) {
				local404 -= 2048;
			}
			if (local404 < -1024) {
				local404 += 2048;
			}
			if (local404 < 0 && local346 > 0 || local404 > 0 && local346 < 0) {
				this.anInt259 = local275;
			}
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("11105, " + 7 + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method169(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt208 >= 100) {
					this.method83("Your friends list is full. Max of 100 hit", this.aByte23, "", 0);
				} else {
					@Pc(24) String local24 = Class40.method542(Class40.method539(arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt208; local26++) {
						if (this.aLongArray4[local26] == arg0) {
							this.method83(local24 + " is already on your friend list", this.aByte23, "", 0);
							return;
						}
					}
					for (@Pc(57) int local57 = 0; local57 < this.anInt261; local57++) {
						if (this.aLongArray3[local57] == arg0) {
							this.method83("Please remove " + local24 + " from your ignore list first", this.aByte23, "", 0);
							return;
						}
					}
					if (!local24.equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
						this.aStringArray7[this.anInt208] = local24;
						this.aLongArray4[this.anInt208] = arg0;
						this.anIntArray69[this.anInt208] = 0;
						this.anInt208++;
						this.aBoolean34 = true;
						this.anInt150 += 0;
						this.aClass1_Sub3_Sub3_5.method380(118);
						this.aClass1_Sub3_Sub3_5.method387(arg0);
					}
				}
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("532, " + arg0 + ", " + 0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!hc;I)I")
	private int method170(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.anInt338 > 9 || this.anInt338 < 9) {
				this.anInt199 = 168;
			}
			if (arg0.anIntArrayArray15 == null || arg1 >= arg0.anIntArrayArray15.length) {
				return -2;
			}
			try {
				@Pc(27) int[] local27 = arg0.anIntArrayArray15[arg1];
				@Pc(29) int local29 = 0;
				@Pc(31) int local31 = 0;
				while (true) {
					@Pc(36) int local36 = local27[local31++];
					if (local36 == 0) {
						return local29;
					}
					if (local36 == 1) {
						local29 += this.anIntArray61[local27[local31++]];
					}
					if (local36 == 2) {
						local29 += this.anIntArray31[local27[local31++]];
					}
					if (local36 == 3) {
						local29 += this.anIntArray67[local27[local31++]];
					}
					@Pc(89) Class15 local89;
					@Pc(96) int local96;
					@Pc(98) int local98;
					if (local36 == 4) {
						local89 = Class15.aClass15Array1[local27[local31++]];
						local96 = local27[local31++] + 1;
						for (local98 = 0; local98 < local89.anIntArray149.length; local98++) {
							if (local89.anIntArray149[local98] == local96) {
								local29 += local89.anIntArray150[local98];
							}
						}
					}
					if (local36 == 5) {
						local29 += this.anIntArray56[local27[local31++]];
					}
					if (local36 == 6) {
						local29 += anIntArray44[this.anIntArray31[local27[local31++]] - 1];
					}
					if (local36 == 7) {
						local29 += this.anIntArray56[local27[local31++]] * 100 / 46875;
					}
					if (local36 == 8) {
						local29 += this.aClass1_Sub1_Sub3_Sub2_1.anInt942;
					}
					@Pc(180) int local180;
					if (local36 == 9) {
						for (local180 = 0; local180 < 19; local180++) {
							if (local180 == 18) {
								local180 = 20;
							}
							local29 += this.anIntArray31[local180];
						}
					}
					if (local36 == 10) {
						local89 = Class15.aClass15Array1[local27[local31++]];
						local96 = local27[local31++] + 1;
						for (local98 = 0; local98 < local89.anIntArray149.length; local98++) {
							if (local89.anIntArray149[local98] == local96) {
								local29 += 999999999;
								break;
							}
						}
					}
					if (local36 == 11) {
						local29 += this.anInt170;
					}
					if (local36 == 12) {
						local29 += this.anInt233;
					}
					if (local36 == 13) {
						local180 = this.anIntArray56[local27[local31++]];
						local96 = local27[local31++];
						local29 += (local180 & 0x1 << local96) == 0 ? 0 : 1;
					}
				}
			} catch (@Pc(283) Exception local283) {
				return -1;
			}
		} catch (@Pc(286) RuntimeException local286) {
			signlink.reporterror("37246, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local286.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method171() {
		try {
			@Pc(14) int local14 = this.aClass1_Sub3_Sub2_Sub4_3.method364("Choose Option");
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < this.anInt190; local16++) {
				local27 = this.aClass1_Sub3_Sub2_Sub4_3.method364(this.aStringArray6[local16]);
				if (local27 > local14) {
					local14 = local27;
				}
			}
			local14 += 8;
			local27 = this.anInt190 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt141 > 8 && super.anInt142 > 11 && super.anInt141 < 520 && super.anInt142 < 345) {
				local70 = super.anInt141 - local14 / 2 - 8;
				if (local70 + local14 > 512) {
					local70 = 512 - local14;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt142 - 11;
				if (local88 + local27 > 334) {
					local88 = 334 - local27;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean54 = true;
				this.anInt184 = 0;
				this.anInt185 = local70;
				this.anInt186 = local88;
				this.anInt187 = local14;
				this.anInt188 = this.anInt190 * 15 + 22;
			}
			if (super.anInt141 > 562 && super.anInt142 > 231 && super.anInt141 < 752 && super.anInt142 < 492) {
				local70 = super.anInt141 - local14 / 2 - 562;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local14 > 190) {
					local70 = 190 - local14;
				}
				local88 = super.anInt142 - 231;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local27 > 261) {
					local88 = 261 - local27;
				}
				this.aBoolean54 = true;
				this.anInt184 = 1;
				this.anInt185 = local70;
				this.anInt186 = local88;
				this.anInt187 = local14;
				this.anInt188 = this.anInt190 * 15 + 22;
			}
			if (super.anInt141 > 22 && super.anInt142 > 375 && super.anInt141 < 501 && super.anInt142 < 471) {
				local70 = super.anInt141 - local14 / 2 - 22;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local14 > 479) {
					local70 = 479 - local14;
				}
				local88 = super.anInt142 - 375;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local27 > 96) {
					local88 = 96 - local27;
				}
				this.aBoolean54 = true;
				this.anInt184 = 2;
				this.anInt185 = local70;
				this.anInt186 = local88;
				this.anInt187 = local14;
				this.anInt188 = this.anInt190 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("32619, " + -468 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;III)V")
	private void method172(@OriginalArg(1) Class1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != this.aClass1_Sub1_Sub3_Sub2_1 && this.anInt190 < 400) {
				@Pc(37) String local37 = arg0.aString30 + method166(this.aClass1_Sub1_Sub3_Sub2_1.anInt942, arg0.anInt942) + " (level-" + arg0.anInt942 + ")";
				if (this.anInt297 == 1) {
					this.aStringArray6[this.anInt190] = "Use " + this.aString17 + " with @whi@" + local37;
					this.anIntArray79[this.anInt190] = 367;
					this.anIntArray80[this.anInt190] = arg3;
					this.anIntArray77[this.anInt190] = arg2;
					this.anIntArray78[this.anInt190] = arg1;
					this.anInt190++;
				} else if (this.anInt160 != 1) {
					this.aStringArray6[this.anInt190] = "Follow @whi@" + local37;
					this.anIntArray79[this.anInt190] = 1544;
					this.anIntArray80[this.anInt190] = arg3;
					this.anIntArray77[this.anInt190] = arg2;
					this.anIntArray78[this.anInt190] = arg1;
					this.anInt190++;
					if (this.anInt189 == 0) {
						this.aStringArray6[this.anInt190] = "Trade with @whi@" + local37;
						this.anIntArray79[this.anInt190] = 1373;
						this.anIntArray80[this.anInt190] = arg3;
						this.anIntArray77[this.anInt190] = arg2;
						this.anIntArray78[this.anInt190] = arg1;
						this.anInt190++;
					}
					if (this.anInt159 > 0) {
						this.aStringArray6[this.anInt190] = "Attack @whi@" + local37;
						if (this.aClass1_Sub1_Sub3_Sub2_1.anInt942 >= arg0.anInt942) {
							this.anIntArray79[this.anInt190] = 151;
						} else {
							this.anIntArray79[this.anInt190] = 2151;
						}
						this.anIntArray80[this.anInt190] = arg3;
						this.anIntArray77[this.anInt190] = arg2;
						this.anIntArray78[this.anInt190] = arg1;
						this.anInt190++;
					}
					if (this.anInt214 == 1) {
						this.aStringArray6[this.anInt190] = "Fight @whi@" + local37;
						this.anIntArray79[this.anInt190] = 151;
						this.anIntArray80[this.anInt190] = arg3;
						this.anIntArray77[this.anInt190] = arg2;
						this.anIntArray78[this.anInt190] = arg1;
						this.anInt190++;
					}
					if (this.anInt214 == 2) {
						this.aStringArray6[this.anInt190] = "Duel-with @whi@" + local37;
						this.anIntArray79[this.anInt190] = 1101;
						this.anIntArray80[this.anInt190] = arg3;
						this.anIntArray77[this.anInt190] = arg2;
						this.anIntArray78[this.anInt190] = arg1;
						this.anInt190++;
					}
				} else if ((this.anInt162 & 0x8) == 8) {
					this.aStringArray6[this.anInt190] = this.aString6 + " @whi@" + local37;
					this.anIntArray79[this.anInt190] = 651;
					this.anIntArray80[this.anInt190] = arg3;
					this.anIntArray77[this.anInt190] = arg2;
					this.anIntArray78[this.anInt190] = arg1;
					this.anInt190++;
				}
				for (@Pc(388) int local388 = 0; local388 < this.anInt190; local388++) {
					if (this.anIntArray79[local388] == 660) {
						this.aStringArray6[local388] = "Walk here @whi@" + local37;
						return;
					}
				}
			}
		} catch (@Pc(415) RuntimeException local415) {
			signlink.reporterror("99907, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local415.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method173(@OriginalArg(0) int arg0) {
		try {
			this.anInt275++;
			this.method121();
			this.method146();
			this.method179();
			this.method151();
			if (arg0 != 24924) {
				this.aBoolean53 = !this.aBoolean53;
			}
			this.method160((byte) 5);
			@Pc(39) int local39;
			@Pc(78) int local78;
			@Pc(128) int local128;
			if (!this.aBoolean47) {
				local39 = this.anInt268;
				if (this.anInt263 / 256 > local39) {
					local39 = this.anInt263 / 256;
				}
				if (this.aBooleanArray1[4] && this.anIntArray74[4] + 128 > local39) {
					local39 = this.anIntArray74[4] + 128;
				}
				local78 = this.anInt269 + this.anInt178 & 0x7FF;
				this.method109(local39 * 3 + 600, this.anInt181, this.aByte19, local78, this.method199(this.aClass1_Sub1_Sub3_Sub2_1.anInt891, this.anInt219, this.aClass1_Sub1_Sub3_Sub2_1.anInt890) - 50, this.anInt182, local39);
				anInt273++;
				if (anInt273 > 1802) {
					anInt273 = 0;
					this.aClass1_Sub3_Sub3_5.method380(146);
					this.aClass1_Sub3_Sub3_5.method381(0);
					local128 = this.aClass1_Sub3_Sub3_5.anInt554;
					this.aClass1_Sub3_Sub3_5.method382(29711);
					this.aClass1_Sub3_Sub3_5.method381(70);
					this.aClass1_Sub3_Sub3_5.method381((int) (Math.random() * 256.0D));
					this.aClass1_Sub3_Sub3_5.method381(242);
					this.aClass1_Sub3_Sub3_5.method381(186);
					this.aClass1_Sub3_Sub3_5.method381(39);
					this.aClass1_Sub3_Sub3_5.method381(61);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub3_Sub3_5.method381(13);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub3_Sub3_5.method382(57856);
					}
					this.aClass1_Sub3_Sub3_5.method382((int) (Math.random() * 65536.0D));
					this.aClass1_Sub3_Sub3_5.method390(this.aClass1_Sub3_Sub3_5.anInt554 - local128);
				}
			}
			if (this.aBoolean47) {
				local39 = this.method192(this.aByte18);
			} else {
				local39 = this.method191((byte) 4);
			}
			local78 = this.anInt255;
			local128 = this.anInt256;
			@Pc(216) int local216 = this.anInt257;
			@Pc(219) int local219 = this.anInt258;
			@Pc(222) int local222 = this.anInt259;
			@Pc(271) int local271;
			for (@Pc(224) int local224 = 0; local224 < 5; local224++) {
				if (this.aBooleanArray1[local224]) {
					local271 = (int) (Math.random() * (double) (this.anIntArray70[local224] * 2 + 1) - (double) this.anIntArray70[local224] + Math.sin((double) this.anIntArray41[local224] * ((double) this.anIntArray45[local224] / 100.0D)) * (double) this.anIntArray74[local224]);
					if (local224 == 0) {
						this.anInt255 += local271;
					}
					if (local224 == 1) {
						this.anInt256 += local271;
					}
					if (local224 == 2) {
						this.anInt257 += local271;
					}
					if (local224 == 3) {
						this.anInt259 = this.anInt259 + local271 & 0x7FF;
					}
					if (local224 == 4) {
						this.anInt258 += local271;
						if (this.anInt258 < 128) {
							this.anInt258 = 128;
						}
						if (this.anInt258 > 383) {
							this.anInt258 = 383;
						}
					}
				}
			}
			local271 = Class1_Sub3_Sub2_Sub1.anInt430;
			Class1_Sub3_Sub1.aBoolean85 = true;
			Class1_Sub3_Sub1.anInt376 = 0;
			Class1_Sub3_Sub1.anInt374 = super.anInt138 - 8;
			Class1_Sub3_Sub1.anInt375 = super.anInt139 - 11;
			Class1_Sub3_Sub2.method357(730);
			this.aClass33_1.method507(this.anInt259, local39, this.anInt255, this.anInt257, this.anInt256, this.anInt258);
			this.aClass33_1.method481();
			this.method123(this.anInt311);
			this.method176();
			this.method111(local271);
			this.method101();
			this.aClass32_18.method464(super.aGraphics2, 11, 8);
			this.anInt255 = local78;
			this.anInt256 = local128;
			this.anInt257 = local216;
			this.anInt258 = local219;
			this.anInt259 = local222;
		} catch (@Pc(411) RuntimeException local411) {
			signlink.reporterror("73551, " + arg0 + ", " + local411.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method174(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt208; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray7[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(this.aClass1_Sub1_Sub3_Sub2_1.aString30);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("53874, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)Z")
	private boolean method175(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray79[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 406;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("12444, " + arg0 + ", " + -13246 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method176() {
		try {
			if (this.anInt242 == 2) {
				this.method128((byte) 8, (this.anInt236 - this.anInt193 << 7) + this.anInt239, this.anInt237 * 2, (this.anInt235 - this.anInt192 << 7) + this.anInt238);
				if (this.anInt216 > -1 && anInt280 % 20 < 10) {
					this.aClass1_Sub3_Sub2_Sub2Array5[2].method322(this.anInt217 - 28, this.anInt216 - 12);
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("79161, " + 2 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZ)Z")
	private boolean method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass33_1.method498(this.anInt219, arg0, arg1, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(52) Class2 local52 = Class2.method23(local7);
				@Pc(60) int local60;
				@Pc(63) int local63;
				if (local31 == 0 || local31 == 2) {
					local60 = local52.anInt45;
					local63 = local52.anInt46;
				} else {
					local60 = local52.anInt46;
					local63 = local52.anInt45;
				}
				@Pc(74) int local74 = local52.anInt57;
				if (local31 != 0) {
					local74 = (local74 << local31 & 0xF) + (local74 >> 4 - local31);
				}
				this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, arg1, false, local74, arg0, local63, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local60, 0);
			} else {
				this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], local25 + 1, 2, arg1, false, 0, arg0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, local31);
			}
			this.anInt203 = super.anInt141;
			this.anInt204 = super.anInt142;
			this.anInt206 = 2;
			this.anInt205 = 0;
			this.aClass1_Sub3_Sub3_5.method380(arg3);
			this.aClass1_Sub3_Sub3_5.method382(arg0 + this.anInt192);
			this.aClass1_Sub3_Sub3_5.method382(arg1 + this.anInt193);
			this.aClass1_Sub3_Sub3_5.method382(local7);
			return true;
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("65363, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method178() {
		try {
			try {
				this.anInt281 = -1;
				this.aClass28_5.method460();
				this.aClass28_4.method460();
				this.aClass28_1.method460();
				this.aClass28_2.method460();
				Class1_Sub3_Sub2_Sub1.method290();
				this.method196();
				this.aClass33_1.method467();
				for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
					this.aClass9Array1[local40].method249();
				}
				System.gc();
				@Pc(64) Class4 local64 = new Class4(false, 104, this.aByteArrayArrayArray7, 104, this.anIntArrayArrayArray3);
				@Pc(67) byte[] local67 = new byte[100000];
				@Pc(71) int local71 = this.aByteArrayArray2.length;
				Class4.aBoolean22 = Class33.aBoolean143;
				@Pc(84) int local84;
				@Pc(91) int local91;
				for (@Pc(75) int local75 = 0; local75 < local71; local75++) {
					local84 = this.anIntArray47[local75] >> 8;
					local91 = this.anIntArray47[local75] & 0xFF;
					if (local84 == 33 && local91 >= 71 && local91 <= 73) {
						Class4.aBoolean22 = false;
					}
				}
				if (Class4.aBoolean22) {
					this.aClass33_1.method468(this.anInt219);
				} else {
					this.aClass33_1.method468(0);
				}
				this.aClass1_Sub3_Sub3_5.method380(108);
				@Pc(168) int local168;
				for (local84 = 0; local84 < local71; local84++) {
					local91 = (this.anIntArray47[local84] >> 8) * 64 - this.anInt192;
					@Pc(154) int local154 = (this.anIntArray47[local84] & 0xFF) * 64 - this.anInt193;
					@Pc(159) byte[] local159 = this.aByteArrayArray2[local84];
					if (local159 != null) {
						local168 = (new Class1_Sub3_Sub3((byte) 64, local159)).method396();
						Class34.method519(local67, local168, local159, local159.length - 4, 4);
						local64.method37(local154, (this.anInt307 - 6) * 8, (this.anInt306 - 6) * 8, local67, local91);
					} else if (this.anInt307 < 800) {
						local64.method36(local91, local154);
					}
				}
				this.aClass1_Sub3_Sub3_5.method380(108);
				@Pc(236) int local236;
				for (local91 = 0; local91 < local71; local91++) {
					@Pc(227) byte[] local227 = this.aByteArrayArray1[local91];
					if (local227 != null) {
						local236 = (new Class1_Sub3_Sub3((byte) 64, local227)).method396();
						Class34.method519(local67, local236, local227, local227.length - 4, 4);
						local168 = (this.anIntArray47[local91] >> 8) * 64 - this.anInt192;
						@Pc(270) int local270 = (this.anIntArray47[local91] & 0xFF) * 64 - this.anInt193;
						local64.method38(this.aClass28_4, local67, this.aClass9Array1, this.aClass33_1, local270, local168);
					}
				}
				this.aClass1_Sub3_Sub3_5.method380(108);
				local64.method40(this.aClass9Array1, this.aClass33_1);
				this.aClass32_18.method463();
				this.aClass1_Sub3_Sub3_5.method380(108);
				for (@Pc(312) Class1_Sub6 local312 = (Class1_Sub6) this.aClass28_4.method456(); local312 != null; local312 = (Class1_Sub6) this.aClass28_4.method458()) {
					if ((this.aByteArrayArrayArray7[1][local312.anInt641][local312.anInt642] & 0x2) == 2) {
						local312.anInt639--;
						if (local312.anInt639 < 0) {
							local312.method567();
						}
					}
				}
				for (local236 = 0; local236 < 104; local236++) {
					for (local168 = 0; local168 < 104; local168++) {
						this.method134(local236, local168);
					}
				}
				for (@Pc(372) Class1_Sub4 local372 = (Class1_Sub4) this.aClass28_3.method456(); local372 != null; local372 = (Class1_Sub4) this.aClass28_3.method458()) {
					this.method106(local372.anInt589, this.anInt191, local372.anInt587, local372.anInt590, local372.anInt592, local372.anInt591, local372.anInt586, local372.anInt588);
				}
			} catch (@Pc(402) Exception local402) {
			}
			Class2.aClass35_1.method529();
			System.gc();
			Class1_Sub3_Sub2_Sub1.method291((byte) 8);
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("95958, " + 0 + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method179() {
		try {
			@Pc(6) Class1_Sub1_Sub1 local6 = (Class1_Sub1_Sub1) this.aClass28_2.method456();
			this.aBoolean40 &= true;
			while (local6 != null) {
				if (local6.anInt27 != this.anInt219 || anInt280 > local6.anInt33) {
					local6.method567();
				} else if (anInt280 >= local6.anInt32) {
					if (local6.anInt36 > 0) {
						@Pc(42) Class1_Sub1_Sub3_Sub1 local42 = this.aClass1_Sub1_Sub3_Sub1Array1[local6.anInt36 - 1];
						if (local42 != null) {
							local6.method19(local42.anInt890, anInt280, local42.anInt891, 709, this.method199(local42.anInt891, local6.anInt27, local42.anInt890) - local6.anInt31);
						}
					}
					if (local6.anInt36 < 0) {
						@Pc(73) int local73 = -local6.anInt36 - 1;
						@Pc(80) Class1_Sub1_Sub3_Sub2 local80;
						if (local73 == this.anInt248) {
							local80 = this.aClass1_Sub1_Sub3_Sub2_1;
						} else {
							local80 = this.aClass1_Sub1_Sub3_Sub2Array1[local73];
						}
						if (local80 != null) {
							local6.method19(local80.anInt890, anInt280, local80.anInt891, 709, this.method199(local80.anInt891, local6.anInt27, local80.anInt890) - local6.anInt31);
						}
					}
					local6.method20(this.anInt320);
					this.aClass33_1.method478(60, (int) local6.aDouble1, (int) local6.aDouble2, null, -1, (int) local6.aDouble3, local6.anInt37, this.anInt219, local6, false);
				}
				local6 = (Class1_Sub1_Sub1) this.aClass28_2.method458();
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("27631, " + true + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIB)Z")
	private boolean method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) boolean local10 = false;
			@Pc(14) Class15 local14 = Class15.aClass15Array1[arg0];
			for (@Pc(16) int local16 = 0; local16 < local14.anIntArray153.length && local14.anIntArray153[local16] != -1; local16++) {
				@Pc(31) Class15 local31 = Class15.aClass15Array1[local14.anIntArray153[local16]];
				if (local31.anInt466 == 1) {
					local10 |= this.method180(local31.anInt464, arg1);
				}
				if (local31.anInt466 == 6 && (local31.anInt482 != -1 || local31.anInt483 != -1)) {
					@Pc(61) boolean local61 = this.method167(local31);
					@Pc(66) int local66;
					if (local61) {
						local66 = local31.anInt483;
					} else {
						local66 = local31.anInt482;
					}
					if (local66 != -1) {
						@Pc(78) Class19 local78 = Class19.aClass19Array1[local66];
						local31.anInt463 += arg1;
						while (local31.anInt463 > local78.anIntArray188[local31.anInt462]) {
							local31.anInt463 -= local78.anIntArray188[local31.anInt462] + 1;
							local31.anInt462++;
							if (local31.anInt462 >= local78.anInt538) {
								local31.anInt462 -= local78.anInt539;
								if (local31.anInt462 < 0 || local31.anInt462 >= local78.anInt538) {
									local31.anInt462 = 0;
								}
							}
							local10 = true;
						}
					}
				}
			}
			return local10;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("57758, " + arg0 + ", " + arg1 + ", " + 46 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;)Lclient!ub;")
	private Class39 method181(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			@Pc(9) int local9 = 5;
			@Pc(12) byte[] local12 = signlink.cacheload(arg0);
			@Pc(26) int local26;
			if (local12 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local12);
				local26 = (int) this.aCRC32_1.getValue();
				if (local26 != arg2) {
					local12 = null;
				}
			}
			if (local12 != null) {
				return new Class39(this.anInt302, local12);
			}
			while (local12 == null) {
				this.method74("Requesting " + arg3, arg1);
				try {
					local26 = 0;
					@Pc(66) DataInputStream local66 = this.method139(arg0 + arg2);
					@Pc(69) byte[] local69 = new byte[6];
					local66.readFully(local69, 0, 6);
					@Pc(80) Class1_Sub3_Sub3 local80 = new Class1_Sub3_Sub3((byte) 64, local69);
					local80.anInt554 = 3;
					@Pc(88) int local88 = local80.method395() + 6;
					@Pc(90) int local90 = 6;
					local12 = new byte[local88];
					for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
						local12[local95] = local69[local95];
					}
					while (local90 < local88) {
						@Pc(113) int local113 = local88 - local90;
						if (local113 > 1000) {
							local113 = 1000;
						}
						local90 += local66.read(local12, local90, local113);
						@Pc(132) int local132 = local90 * 100 / local88;
						if (local132 != local26) {
							this.method74("Loading " + arg3 + " - " + local132 + "%", arg1);
						}
						local26 = local132;
					}
					local66.close();
				} catch (@Pc(161) IOException local161) {
					local12 = null;
					for (local26 = local9; local26 > 0; local26--) {
						this.method74("Error loading - Will retry in " + local26 + " secs.", arg1);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(184) Exception local184) {
						}
					}
					local9 *= 2;
					if (local9 > 60) {
						local9 = 60;
					}
				}
			}
			signlink.cachesave(arg0, local12);
			return new Class39(this.anInt302, local12);
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("66342, " + arg0 + ", " + arg1 + ", " + -27314 + ", " + arg2 + ", " + arg3 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIZ)V")
	private void method182(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			signlink.anInt753 = arg1;
			if (arg0 != 31) {
				anInt213 = this.aClass38_1.method532();
			}
			if (arg2) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("98573, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method184() {
		try {
			while (true) {
				@Pc(11) int local11 = this.method66();
				if (local11 == -1) {
					return;
				}
				if (this.anInt158 != -1 && this.anInt158 == this.anInt319) {
					if (local11 == 8 && this.aString13.length() > 0) {
						this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
					}
					if ((local11 >= 97 && local11 <= 122 || local11 >= 65 && local11 <= 90 || local11 >= 48 && local11 <= 57 || local11 == 32) && this.aString13.length() < 12) {
						this.aString13 = this.aString13 + (char) local11;
					}
				} else {
					@Pc(191) int local191;
					if (this.aBoolean56) {
						if (local11 >= 32 && local11 <= 122 && this.aString9.length() < 80) {
							this.aString9 = this.aString9 + (char) local11;
							this.aBoolean41 = true;
						}
						if (local11 == 8 && this.aString9.length() > 0) {
							this.aString9 = this.aString9.substring(0, this.aString9.length() - 1);
							this.aBoolean41 = true;
						}
						if (local11 == 13 || local11 == 10) {
							this.aBoolean56 = false;
							this.aBoolean41 = true;
							@Pc(151) long local151;
							if (this.anInt294 == 1) {
								local151 = Class40.method538(this.aString9);
								this.method169(local151);
							}
							if (this.anInt294 == 2 && this.anInt208 > 0) {
								local151 = Class40.method538(this.aString9);
								this.method78(local151);
							}
							if (this.anInt294 == 3 && this.aString9.length() > 0) {
								this.aClass1_Sub3_Sub3_5.method380(148);
								this.aClass1_Sub3_Sub3_5.method381(0);
								local191 = this.aClass1_Sub3_Sub3_5.anInt554;
								this.aClass1_Sub3_Sub3_5.method387(this.aLong8);
								Class41.method546(this.aClass1_Sub3_Sub3_5, this.aString9);
								this.aClass1_Sub3_Sub3_5.method390(this.aClass1_Sub3_Sub3_5.anInt554 - local191);
								this.aString9 = Class40.method543(this.aString9);
								this.aString9 = Class25.method424(this.aString9, 400);
								this.method83(this.aString9, this.aByte23, Class40.method542(Class40.method539(this.aLong8)), 6);
								if (this.anInt155 == 2) {
									this.anInt155 = 1;
									this.aBoolean61 = true;
									this.aClass1_Sub3_Sub3_5.method380(244);
									this.aClass1_Sub3_Sub3_5.method381(this.anInt339);
									this.aClass1_Sub3_Sub3_5.method381(this.anInt155);
									this.aClass1_Sub3_Sub3_5.method381(this.anInt230);
								}
							}
							if (this.anInt294 == 4 && this.anInt261 < 100) {
								local151 = Class40.method538(this.aString9);
								this.method81(local151);
							}
							if (this.anInt294 == 5 && this.anInt261 > 0) {
								local151 = Class40.method538(this.aString9);
								this.method197(local151);
							}
						}
					} else if (this.aBoolean35) {
						if (local11 >= 48 && local11 <= 57 && this.aString7.length() < 10) {
							this.aString7 = this.aString7 + (char) local11;
							this.aBoolean41 = true;
						}
						if (local11 == 8 && this.aString7.length() > 0) {
							this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							this.aBoolean41 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString7.length() > 0) {
								local191 = 0;
								try {
									local191 = Integer.parseInt(this.aString7);
								} catch (@Pc(368) Exception local368) {
								}
								this.aClass1_Sub3_Sub3_5.method380(237);
								this.aClass1_Sub3_Sub3_5.method385(local191);
							}
							this.aBoolean35 = false;
							this.aBoolean41 = true;
						}
					} else if (this.anInt196 == -1) {
						if (local11 >= 32 && local11 <= 122 && this.aString12.length() < 80) {
							this.aString12 = this.aString12 + (char) local11;
							this.aBoolean41 = true;
						}
						if (local11 == 8 && this.aString12.length() > 0) {
							this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
							this.aBoolean41 = true;
						}
						if ((local11 == 13 || local11 == 10) && this.aString12.length() > 0) {
							if (this.aString12.equals("::clientdrop") && (super.aFrame_Sub1_2 != null || this.method97().indexOf("192.168.1.") != -1)) {
								this.method122();
							} else if (this.aString12.startsWith("::")) {
								this.aClass1_Sub3_Sub3_5.method380(4);
								this.aClass1_Sub3_Sub3_5.method381(this.aString12.length() - 1);
								this.aClass1_Sub3_Sub3_5.method388(this.aString12.substring(2));
							} else {
								@Pc(495) byte local495 = 0;
								if (this.aString12.startsWith("yellow:")) {
									local495 = 0;
									this.aString12 = this.aString12.substring(7);
								}
								if (this.aString12.startsWith("red:")) {
									local495 = 1;
									this.aString12 = this.aString12.substring(4);
								}
								if (this.aString12.startsWith("green:")) {
									local495 = 2;
									this.aString12 = this.aString12.substring(6);
								}
								if (this.aString12.startsWith("cyan:")) {
									local495 = 3;
									this.aString12 = this.aString12.substring(5);
								}
								if (this.aString12.startsWith("purple:")) {
									local495 = 4;
									this.aString12 = this.aString12.substring(7);
								}
								if (this.aString12.startsWith("white:")) {
									local495 = 5;
									this.aString12 = this.aString12.substring(6);
								}
								if (this.aString12.startsWith("flash1:")) {
									local495 = 6;
									this.aString12 = this.aString12.substring(7);
								}
								if (this.aString12.startsWith("flash2:")) {
									local495 = 7;
									this.aString12 = this.aString12.substring(7);
								}
								if (this.aString12.startsWith("flash3:")) {
									local495 = 8;
									this.aString12 = this.aString12.substring(7);
								}
								if (this.aString12.startsWith("glow1:")) {
									local495 = 9;
									this.aString12 = this.aString12.substring(6);
								}
								if (this.aString12.startsWith("glow2:")) {
									local495 = 10;
									this.aString12 = this.aString12.substring(6);
								}
								if (this.aString12.startsWith("glow3:")) {
									local495 = 11;
									this.aString12 = this.aString12.substring(6);
								}
								@Pc(653) byte local653 = 0;
								if (this.aString12.startsWith("wave:")) {
									local653 = 1;
									this.aString12 = this.aString12.substring(5);
								}
								if (this.aString12.startsWith("scroll:")) {
									local653 = 2;
									this.aString12 = this.aString12.substring(7);
								}
								this.aClass1_Sub3_Sub3_5.method380(158);
								this.aClass1_Sub3_Sub3_5.method381(0);
								@Pc(692) int local692 = this.aClass1_Sub3_Sub3_5.anInt554;
								this.aClass1_Sub3_Sub3_5.method381(local495);
								this.aClass1_Sub3_Sub3_5.method381(local653);
								Class41.method546(this.aClass1_Sub3_Sub3_5, this.aString12);
								this.aClass1_Sub3_Sub3_5.method390(this.aClass1_Sub3_Sub3_5.anInt554 - local692);
								this.aString12 = Class40.method543(this.aString12);
								this.aString12 = Class25.method424(this.aString12, 400);
								this.aClass1_Sub1_Sub3_Sub2_1.aString29 = this.aString12;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt902 = local495;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt903 = local653;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt901 = 150;
								this.method83(this.aClass1_Sub1_Sub3_Sub2_1.aString29, this.aByte23, this.aClass1_Sub1_Sub3_Sub2_1.aString30, 2);
								if (this.anInt339 == 2) {
									this.anInt339 = 3;
									this.aBoolean61 = true;
									this.aClass1_Sub3_Sub3_5.method380(244);
									this.aClass1_Sub3_Sub3_5.method381(this.anInt339);
									this.aClass1_Sub3_Sub3_5.method381(this.anInt155);
									this.aClass1_Sub3_Sub3_5.method381(this.anInt230);
								}
							}
							this.aString12 = "";
							this.aBoolean41 = true;
						}
					}
				}
			}
		} catch (@Pc(795) RuntimeException local795) {
			signlink.reporterror("35945, " + -799 + ", " + local795.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)Ljava/net/Socket;")
	private Socket method185(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!hc;I)Z")
	private boolean method186(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = arg0.anInt468;
			if (arg1 != -1910) {
				this.aClass28ArrayArrayArray1 = null;
			}
			if (local2 >= 1 && local2 <= 200) {
				if (local2 >= 101) {
					local2 -= 101;
				} else {
					local2--;
				}
				this.aStringArray6[this.anInt190] = "Remove @whi@" + this.aStringArray7[local2];
				this.anIntArray79[this.anInt190] = 557;
				this.anInt190++;
				this.aStringArray6[this.anInt190] = "Message @whi@" + this.aStringArray7[local2];
				this.anIntArray79[this.anInt190] = 679;
				this.anInt190++;
				return true;
			} else if (local2 >= 401 && local2 <= 500) {
				this.aStringArray6[this.anInt190] = "Remove @whi@" + arg0.aString20;
				this.anIntArray79[this.anInt190] = 556;
				this.anInt190++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("51574, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method187() {
		try {
			if (super.anInt140 == 1) {
				@Pc(17) int local17 = super.anInt141 - 21 - 561;
				@Pc(24) int local24 = super.anInt142 - 9 - 5;
				if (local17 >= 0 && local24 >= 0 && local17 < 146 && local24 < 151) {
					local17 -= 73;
					local24 -= 75;
					@Pc(44) int local44 = this.anInt269 + this.anInt288 & 0x7FF;
					@Pc(48) int local48 = Class1_Sub3_Sub2_Sub1.anIntArray137[local44];
					@Pc(52) int local52 = Class1_Sub3_Sub2_Sub1.anIntArray138[local44];
					@Pc(61) int local61 = local48 * (this.anInt210 + 256) >> 8;
					@Pc(70) int local70 = local52 * (this.anInt210 + 256) >> 8;
					@Pc(80) int local80 = local24 * local61 + local17 * local70 >> 11;
					@Pc(90) int local90 = local24 * local70 - local17 * local61 >> 11;
					@Pc(98) int local98 = this.aClass1_Sub1_Sub3_Sub2_1.anInt890 + local80 >> 7;
					@Pc(106) int local106 = this.aClass1_Sub1_Sub3_Sub2_1.anInt891 - local90 >> 7;
					@Pc(129) boolean local129 = this.method188(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 1, local106, true, 0, local98, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0);
					if (local129) {
						this.aClass1_Sub3_Sub3_5.method381(local17);
						this.aClass1_Sub3_Sub3_5.method381(local24);
						this.aClass1_Sub3_Sub3_5.method382(this.anInt269);
						this.aClass1_Sub3_Sub3_5.method381(57);
						this.aClass1_Sub3_Sub3_5.method381(this.anInt288);
						this.aClass1_Sub3_Sub3_5.method381(this.anInt210);
						this.aClass1_Sub3_Sub3_5.method381(89);
						this.aClass1_Sub3_Sub3_5.method382(this.aClass1_Sub1_Sub3_Sub2_1.anInt890);
						this.aClass1_Sub3_Sub3_5.method382(this.aClass1_Sub1_Sub3_Sub2_1.anInt891);
						this.aClass1_Sub3_Sub3_5.method381(this.anInt220);
						this.aClass1_Sub3_Sub3_5.method381(63);
						return;
					}
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("77744, " + 0 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIIIIIII)Z")
	private boolean method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(18) int local18;
			for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
				for (local18 = 0; local18 < 104; local18++) {
					this.anIntArrayArray5[local14][local18] = 0;
					this.anIntArrayArray3[local14][local18] = 99999999;
				}
			}
			local18 = arg8;
			@Pc(46) int local46 = arg0;
			this.anIntArrayArray5[arg8][arg0] = 99;
			this.anIntArrayArray3[arg8][arg0] = 0;
			@Pc(62) byte local62 = 0;
			@Pc(64) int local64 = 0;
			this.anIntArray64[0] = arg8;
			@Pc(73) int local73 = local62 + 1;
			this.anIntArray65[0] = arg0;
			@Pc(77) boolean local77 = false;
			@Pc(81) int local81 = this.anIntArray64.length;
			@Pc(88) int[][] local88 = this.aClass9Array1[this.anInt219].anIntArrayArray10;
			@Pc(199) int local199;
			while (local64 != local73) {
				local18 = this.anIntArray64[local64];
				local46 = this.anIntArray65[local64];
				local64 = (local64 + 1) % local81;
				if (local18 == arg6 && local46 == arg3) {
					local77 = true;
					break;
				}
				if (arg1 != 0) {
					if ((arg1 < 5 || arg1 == 10) && this.aClass9Array1[this.anInt219].method258(arg3, arg1 - 1, local46, arg10, arg6, local18)) {
						local77 = true;
						break;
					}
					if (arg1 < 10 && this.aClass9Array1[this.anInt219].method259(local46, arg6, local18, arg3, arg1 - 1, arg10)) {
						local77 = true;
						break;
					}
				}
				if (arg9 != 0 && arg7 != 0 && this.aClass9Array1[this.anInt219].method260(local18, arg9, arg3, arg6, arg7, arg5, local46)) {
					local77 = true;
					break;
				}
				local199 = this.anIntArrayArray3[local18][local46] + 1;
				if (local18 > 0 && this.anIntArrayArray5[local18 - 1][local46] == 0 && (local88[local18 - 1][local46] & 0x280108) == 0) {
					this.anIntArray64[local73] = local18 - 1;
					this.anIntArray65[local73] = local46;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray5[local18 - 1][local46] = 2;
					this.anIntArrayArray3[local18 - 1][local46] = local199;
				}
				if (local18 < 103 && this.anIntArrayArray5[local18 + 1][local46] == 0 && (local88[local18 + 1][local46] & 0x280180) == 0) {
					this.anIntArray64[local73] = local18 + 1;
					this.anIntArray65[local73] = local46;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray5[local18 + 1][local46] = 8;
					this.anIntArrayArray3[local18 + 1][local46] = local199;
				}
				if (local46 > 0 && this.anIntArrayArray5[local18][local46 - 1] == 0 && (local88[local18][local46 - 1] & 0x280102) == 0) {
					this.anIntArray64[local73] = local18;
					this.anIntArray65[local73] = local46 - 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray5[local18][local46 - 1] = 1;
					this.anIntArrayArray3[local18][local46 - 1] = local199;
				}
				if (local46 < 103 && this.anIntArrayArray5[local18][local46 + 1] == 0 && (local88[local18][local46 + 1] & 0x280120) == 0) {
					this.anIntArray64[local73] = local18;
					this.anIntArray65[local73] = local46 + 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray5[local18][local46 + 1] = 4;
					this.anIntArrayArray3[local18][local46 + 1] = local199;
				}
				if (local18 > 0 && local46 > 0 && this.anIntArrayArray5[local18 - 1][local46 - 1] == 0 && (local88[local18 - 1][local46 - 1] & 0x28010E) == 0 && (local88[local18 - 1][local46] & 0x280108) == 0 && (local88[local18][local46 - 1] & 0x280102) == 0) {
					this.anIntArray64[local73] = local18 - 1;
					this.anIntArray65[local73] = local46 - 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray5[local18 - 1][local46 - 1] = 3;
					this.anIntArrayArray3[local18 - 1][local46 - 1] = local199;
				}
				if (local18 < 103 && local46 > 0 && this.anIntArrayArray5[local18 + 1][local46 - 1] == 0 && (local88[local18 + 1][local46 - 1] & 0x280183) == 0 && (local88[local18 + 1][local46] & 0x280180) == 0 && (local88[local18][local46 - 1] & 0x280102) == 0) {
					this.anIntArray64[local73] = local18 + 1;
					this.anIntArray65[local73] = local46 - 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray5[local18 + 1][local46 - 1] = 9;
					this.anIntArrayArray3[local18 + 1][local46 - 1] = local199;
				}
				if (local18 > 0 && local46 < 103 && this.anIntArrayArray5[local18 - 1][local46 + 1] == 0 && (local88[local18 - 1][local46 + 1] & 0x280138) == 0 && (local88[local18 - 1][local46] & 0x280108) == 0 && (local88[local18][local46 + 1] & 0x280120) == 0) {
					this.anIntArray64[local73] = local18 - 1;
					this.anIntArray65[local73] = local46 + 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray5[local18 - 1][local46 + 1] = 6;
					this.anIntArrayArray3[local18 - 1][local46 + 1] = local199;
				}
				if (local18 < 103 && local46 < 103 && this.anIntArrayArray5[local18 + 1][local46 + 1] == 0 && (local88[local18 + 1][local46 + 1] & 0x2801E0) == 0 && (local88[local18 + 1][local46] & 0x280180) == 0 && (local88[local18][local46 + 1] & 0x280120) == 0) {
					this.anIntArray64[local73] = local18 + 1;
					this.anIntArray65[local73] = local46 + 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray5[local18 + 1][local46 + 1] = 12;
					this.anIntArrayArray3[local18 + 1][local46 + 1] = local199;
				}
			}
			this.anInt220 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local77) {
				if (arg4) {
					local199 = 100;
					for (local815 = 1; local815 < 2; local815++) {
						for (local821 = arg6 - local815; local821 <= arg6 + local815; local821++) {
							for (local827 = arg3 - local815; local827 <= arg3 + local815; local827++) {
								if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray3[local821][local827] < local199) {
									local199 = this.anIntArrayArray3[local821][local827];
									local18 = local821;
									local46 = local827;
									this.anInt220 = 1;
									local77 = true;
								}
							}
						}
						if (local77) {
							break;
						}
					}
				}
				if (!local77) {
					return false;
				}
			}
			@Pc(888) byte local888 = 0;
			this.anIntArray64[0] = local18;
			local64 = local888 + 1;
			this.anIntArray65[0] = local46;
			local199 = local815 = this.anIntArrayArray5[local18][local46];
			while (local18 != arg8 || local46 != arg0) {
				if (local199 != local815) {
					local815 = local199;
					this.anIntArray64[local64] = local18;
					this.anIntArray65[local64++] = local46;
				}
				if ((local199 & 0x2) != 0) {
					local18++;
				} else if ((local199 & 0x8) != 0) {
					local18--;
				}
				if ((local199 & 0x1) != 0) {
					local46++;
				} else if ((local199 & 0x4) != 0) {
					local46--;
				}
				local199 = this.anIntArrayArray5[local18][local46];
			}
			if (local64 > 0) {
				local81 = local64;
				if (local64 > 25) {
					local81 = 25;
				}
				local64--;
				local821 = this.anIntArray64[local64];
				local827 = this.anIntArray65[local64];
				if (arg2 == 0) {
					this.aClass1_Sub3_Sub3_5.method380(181);
					this.aClass1_Sub3_Sub3_5.method381(local81 + local81 + 3);
				}
				if (arg2 == 1) {
					this.aClass1_Sub3_Sub3_5.method380(165);
					this.aClass1_Sub3_Sub3_5.method381(local81 + local81 + 3 + 14);
				}
				if (arg2 == 2) {
					this.aClass1_Sub3_Sub3_5.method380(93);
					this.aClass1_Sub3_Sub3_5.method381(local81 + local81 + 3);
				}
				if (super.anIntArray28[5] == 1) {
					this.aClass1_Sub3_Sub3_5.method381(1);
				} else {
					this.aClass1_Sub3_Sub3_5.method381(0);
				}
				this.aClass1_Sub3_Sub3_5.method382(local821 + this.anInt192);
				this.aClass1_Sub3_Sub3_5.method382(local827 + this.anInt193);
				this.anInt331 = this.anIntArray64[0];
				this.anInt332 = this.anIntArray65[0];
				for (@Pc(1076) int local1076 = 1; local1076 < local81; local1076++) {
					local64--;
					this.aClass1_Sub3_Sub3_5.method381(this.anIntArray64[local64] - local821);
					this.aClass1_Sub3_Sub3_5.method381(this.anIntArray65[local64] - local827);
				}
				return true;
			} else if (arg2 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1111) RuntimeException local1111) {
			signlink.reporterror("15611, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 980 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method189(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 != null) {
				@Pc(5) Object local5 = this.anObject1;
				synchronized (this.anObject1) {
					this.aString15 = arg0;
					this.anInt169 = arg2;
					this.anInt291 = arg1;
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("15588, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -242 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method190() {
		try {
			@Pc(10) int local10 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt890 >> 7) + this.anInt192;
			@Pc(19) int local19 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt891 >> 7) + this.anInt193;
			this.aBoolean40 &= true;
			if (local10 >= 2944 && local10 < 3392 && local19 >= 3520 && local19 < 6400) {
				this.anInt159 = (local19 - 3520) / 8 + 1;
			} else if (local10 >= 2944 && local10 < 3392 && local19 >= 9920 && local19 < 12800) {
				this.anInt159 = (local19 - 9920) / 8 + 1;
			} else {
				this.anInt159 = 0;
			}
			this.anInt214 = 0;
			if (local10 >= 3328 && local10 < 3392 && local19 >= 3200 && local19 < 3264) {
				@Pc(93) int local93 = local10 & 0x3F;
				@Pc(97) int local97 = local19 & 0x3F;
				if (local93 >= 4 && local93 <= 29 && local97 >= 44 && local97 <= 58) {
					this.anInt214 = 1;
				}
				if (local93 >= 36 && local93 <= 61 && local97 >= 44 && local97 <= 58) {
					this.anInt214 = 1;
				}
				if (local93 >= 4 && local93 <= 29 && local97 >= 25 && local97 <= 39) {
					this.anInt214 = 1;
				}
				if (local93 >= 36 && local93 <= 61 && local97 >= 25 && local97 <= 39) {
					this.anInt214 = 1;
				}
				if (local93 >= 4 && local93 <= 29 && local97 >= 6 && local97 <= 20) {
					this.anInt214 = 1;
				}
				if (local93 >= 36 && local93 <= 61 && local97 >= 6 && local97 <= 20) {
					this.anInt214 = 1;
				}
			}
			if (this.anInt214 == 0 && local10 >= 3328 && local10 <= 3393 && local19 >= 3203 && local19 <= 3325) {
				this.anInt214 = 2;
			}
			this.anInt189 = 0;
			if (local10 >= 3053 && local10 <= 3156 && local19 >= 3056 && local19 <= 3136) {
				this.anInt189 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local19 >= 9492 && local19 <= 9535) {
				this.anInt189 = 1;
			}
			if (this.anInt189 == 1 && local10 >= 3139 && local10 <= 3199 && local19 >= 3008 && local19 <= 3062) {
				this.anInt189 = 0;
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("87280, " + true + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)I")
	private int method191(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 3;
			@Pc(8) boolean local8 = false;
			if (this.anInt258 < 310) {
				@Pc(21) int local21 = this.anInt255 >> 7;
				@Pc(26) int local26 = this.anInt257 >> 7;
				@Pc(32) int local32 = this.aClass1_Sub1_Sub3_Sub2_1.anInt890 >> 7;
				@Pc(38) int local38 = this.aClass1_Sub1_Sub3_Sub2_1.anInt891 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt219][local21][local26] & 0x4) != 0) {
					local3 = this.anInt219;
				}
				@Pc(60) int local60;
				if (local32 > local21) {
					local60 = local32 - local21;
				} else {
					local60 = local21 - local32;
				}
				@Pc(73) int local73;
				if (local38 > local26) {
					local73 = local38 - local26;
				} else {
					local73 = local26 - local38;
				}
				@Pc(88) int local88;
				@Pc(90) int local90;
				if (local60 > local73) {
					local88 = local73 * 65536 / local60;
					local90 = 32768;
					while (local21 != local32) {
						if (local21 < local32) {
							local21++;
						} else if (local21 > local32) {
							local21--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt219][local21][local26] & 0x4) != 0) {
							local3 = this.anInt219;
						}
						local90 += local88;
						if (local90 >= 65536) {
							local90 -= 65536;
							if (local26 < local38) {
								local26++;
							} else if (local26 > local38) {
								local26--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt219][local21][local26] & 0x4) != 0) {
								local3 = this.anInt219;
							}
						}
					}
				} else {
					local88 = local60 * 65536 / local73;
					local90 = 32768;
					while (local26 != local38) {
						if (local26 < local38) {
							local26++;
						} else if (local26 > local38) {
							local26--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt219][local21][local26] & 0x4) != 0) {
							local3 = this.anInt219;
						}
						local90 += local88;
						if (local90 >= 65536) {
							local90 -= 65536;
							if (local21 < local32) {
								local21++;
							} else if (local21 > local32) {
								local21--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt219][local21][local26] & 0x4) != 0) {
								local3 = this.anInt219;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt219][this.aClass1_Sub1_Sub3_Sub2_1.anInt890 >> 7][this.aClass1_Sub1_Sub3_Sub2_1.anInt891 >> 7] & 0x4) != 0) {
				local3 = this.anInt219;
			}
			return local3;
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("43657, " + arg0 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)I")
	private int method192(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 6) {
				@Pc(14) int local14 = this.method199(this.anInt257, this.anInt219, this.anInt255);
				return local14 - this.anInt256 >= 800 || (this.aByteArrayArrayArray7[this.anInt219][this.anInt255 >> 7][this.anInt257 >> 7] & 0x4) == 0 ? 3 : this.anInt219;
			} else {
				return 0;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("88899, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kb;II)V")
	private void method193(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt254 = 0;
			this.anInt287 = 0;
			this.method91(arg1, arg0);
			this.method104(arg1, arg0);
			this.method143(arg1, arg0, (byte) 6);
			this.method144(arg0, arg1);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt254; local29++) {
				local36 = this.anIntArray55[local29];
				if (this.aClass1_Sub1_Sub3_Sub2Array1[local36].anInt932 != anInt280) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local36] = null;
				}
			}
			if (arg2 != -25272) {
				this.method67();
			}
			if (arg0.anInt554 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt554 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt286; local36++) {
				if (this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray62[local36]] == null) {
					signlink.reporterror(this.aString10 + " null entry in pl list - pos:" + local36 + " size:" + this.anInt286);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("66521, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method194() {
		try {
			if (this.anInt174 == 0) {
				@Pc(13) int local13 = super.anInt140;
				if (this.anInt160 == 1 && super.anInt141 >= 520 && super.anInt142 >= 165 && super.anInt141 <= 788 && super.anInt142 <= 230) {
					local13 = 0;
				}
				@Pc(44) int local44;
				@Pc(47) int local47;
				@Pc(123) int local123;
				if (this.aBoolean54) {
					if (local13 != 1) {
						local44 = super.anInt138;
						local47 = super.anInt139;
						if (this.anInt184 == 0) {
							local44 -= 8;
							local47 -= 11;
						}
						if (this.anInt184 == 1) {
							local44 -= 562;
							local47 -= 231;
						}
						if (this.anInt184 == 2) {
							local44 -= 22;
							local47 -= 375;
						}
						if (local44 < this.anInt185 - 10 || local44 > this.anInt185 + this.anInt187 + 10 || local47 < this.anInt186 - 10 || local47 > this.anInt186 + this.anInt188 + 10) {
							this.aBoolean54 = false;
							if (this.anInt184 == 1) {
								this.aBoolean34 = true;
							}
							if (this.anInt184 == 2) {
								this.aBoolean41 = true;
							}
						}
					}
					if (local13 == 1) {
						local44 = this.anInt185;
						local47 = this.anInt186;
						local123 = this.anInt187;
						@Pc(126) int local126 = super.anInt141;
						@Pc(129) int local129 = super.anInt142;
						if (this.anInt184 == 0) {
							local126 -= 8;
							local129 -= 11;
						}
						if (this.anInt184 == 1) {
							local126 -= 562;
							local129 -= 231;
						}
						if (this.anInt184 == 2) {
							local126 -= 22;
							local129 -= 375;
						}
						@Pc(148) int local148 = -1;
						for (@Pc(150) int local150 = 0; local150 < this.anInt190; local150++) {
							@Pc(165) int local165 = local47 + (this.anInt190 - 1 - local150) * 15 + 31;
							if (local126 > local44 && local126 < local44 + local123 && local129 > local165 - 13 && local129 < local165 + 3) {
								local148 = local150;
							}
						}
						if (local148 != -1) {
							this.method140(local148);
						}
						this.aBoolean54 = false;
						if (this.anInt184 == 1) {
							this.aBoolean34 = true;
						}
						if (this.anInt184 == 2) {
							this.aBoolean41 = true;
							return;
						}
					}
				} else {
					if (local13 == 1 && this.anInt190 > 0) {
						local44 = this.anIntArray79[this.anInt190 - 1];
						if (local44 == 602 || local44 == 596 || local44 == 22 || local44 == 892 || local44 == 415 || local44 == 405 || local44 == 38 || local44 == 422 || local44 == 478 || local44 == 347 || local44 == 188) {
							local47 = this.anIntArray77[this.anInt190 - 1];
							local123 = this.anIntArray78[this.anInt190 - 1];
							@Pc(282) Class15 local282 = Class15.aClass15Array1[local123];
							if (local282.aBoolean111) {
								this.aBoolean45 = false;
								this.anInt171 = 0;
								this.anInt172 = local123;
								this.anInt173 = local47;
								this.anInt174 = 2;
								this.anInt175 = super.anInt141;
								this.anInt176 = super.anInt142;
								if (Class15.aClass15Array1[local123].anInt465 == this.anInt158) {
									this.anInt174 = 1;
								}
								if (Class15.aClass15Array1[local123].anInt465 == this.anInt196) {
									this.anInt174 = 3;
								}
								return;
							}
						}
					}
					if (local13 == 1 && (this.anInt341 == 1 || this.method175(this.anInt190 - 1)) && this.anInt190 > 2) {
						local13 = 2;
					}
					if (local13 == 1 && this.anInt190 > 0) {
						this.method140(this.anInt190 - 1);
					}
					if (local13 != 2 || this.anInt190 <= 0) {
						return;
					}
					this.method171();
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("17704, " + -225 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method195() {
		try {
			this.aBoolean43 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean48) {
					this.method114();
					this.method114();
					this.method99(this.aBoolean52);
					local12++;
					if (local12 > 10) {
						@Pc(32) long local32 = System.currentTimeMillis();
						@Pc(41) int local41 = (int) (local32 - local10) / 10 - local14;
						local14 = 40 - local41;
						if (local14 < 5) {
							local14 = 5;
						}
						local12 = 0;
						local10 = local32;
					}
					try {
						Thread.sleep((long) local14);
					} catch (@Pc(59) Exception local59) {
					}
				}
			} catch (@Pc(65) Exception local65) {
			}
			this.aBoolean43 = false;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("21397, " + -40223 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method196() {
		try {
			Class2.aClass35_1.method529();
			Class2.aClass35_2.method529();
			Class3.aClass35_3.method529();
			Class5.aClass35_4.method529();
			Class5.aClass35_5.method529();
			Class1_Sub1_Sub3_Sub2.aClass35_9.method529();
			Class21.aClass35_8.method529();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("39061, " + 9 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method197(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt261; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt261--;
						this.aBoolean34 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt261; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub3_Sub3_5.method380(171);
						this.aClass1_Sub3_Sub3_5.method387(arg0);
						break;
					}
				}
				this.anInt150 += 0;
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("82540, " + arg0 + ", " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method198(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.anInt151 = -1;
			}
			@Pc(16) int local16;
			@Pc(23) int local23;
			if (this.anInt321 == 0) {
				local16 = super.anInt134 / 2 - 80;
				local23 = super.anInt135 / 2 + 20;
				local23 += 20;
				if (super.anInt140 == 1 && super.anInt141 >= local16 - 75 && super.anInt141 <= local16 + 75 && super.anInt142 >= local23 - 20 && super.anInt142 <= local23 + 20) {
					this.anInt321 = 3;
					this.anInt223 = 0;
				}
				local16 = super.anInt134 / 2 + 80;
				if (super.anInt140 == 1 && super.anInt141 >= local16 - 75 && super.anInt141 <= local16 + 75 && super.anInt142 >= local23 - 20 && super.anInt142 <= local23 + 20) {
					this.aString4 = "";
					this.aString5 = "Enter your username & password.";
					this.anInt321 = 2;
					this.anInt223 = 0;
				}
			} else if (this.anInt321 == 2) {
				local16 = super.anInt135 / 2 - 40;
				local16 += 30;
				local16 += 25;
				if (super.anInt140 == 1 && super.anInt142 >= local16 - 15 && super.anInt142 < local16) {
					this.anInt223 = 0;
				}
				local16 += 15;
				if (super.anInt140 == 1 && super.anInt142 >= local16 - 15 && super.anInt142 < local16) {
					this.anInt223 = 1;
				}
				local16 += 15;
				local23 = super.anInt134 / 2 - 80;
				@Pc(169) int local169 = super.anInt135 / 2 + 50;
				@Pc(170) int local170 = local169 + 20;
				if (super.anInt140 == 1 && super.anInt141 >= local23 - 75 && super.anInt141 <= local23 + 75 && super.anInt142 >= local170 - 20 && super.anInt142 <= local170 + 20) {
					this.method120(this.aString10, this.aString11, false);
				}
				local23 = super.anInt134 / 2 + 80;
				if (super.anInt140 == 1 && super.anInt141 >= local23 - 75 && super.anInt141 <= local23 + 75 && super.anInt142 >= local170 - 20 && super.anInt142 <= local170 + 20) {
					this.anInt321 = 0;
					this.aString10 = "";
					this.aString11 = "";
				}
				while (true) {
					while (true) {
						@Pc(253) int local253 = this.method66();
						if (local253 == -1) {
							return;
						}
						@Pc(258) boolean local258 = false;
						for (@Pc(260) int local260 = 0; local260 < aString16.length(); local260++) {
							if (local253 == aString16.charAt(local260)) {
								local258 = true;
								break;
							}
						}
						if (this.anInt223 == 0) {
							if (local253 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
							}
							if (local253 == 9 || local253 == 10 || local253 == 13) {
								this.anInt223 = 1;
							}
							if (local258) {
								this.aString10 = this.aString10 + (char) local253;
							}
							if (this.aString10.length() > 12) {
								this.aString10 = this.aString10.substring(0, 12);
							}
						} else if (this.anInt223 == 1) {
							if (local253 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
							}
							if (local253 == 9 || local253 == 10 || local253 == 13) {
								this.anInt223 = 0;
							}
							if (local258) {
								this.aString11 = this.aString11 + (char) local253;
							}
							if (this.aString11.length() > 20) {
								this.aString11 = this.aString11.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt321 == 3) {
				local16 = super.anInt134 / 2;
				local23 = super.anInt135 / 2 + 50;
				@Pc(417) int local417 = local23 + 20;
				if (super.anInt140 == 1 && super.anInt141 >= local16 - 75 && super.anInt141 <= local16 + 75 && super.anInt142 >= local417 - 20 && super.anInt142 <= local417 + 20) {
					this.anInt321 = 0;
					return;
				}
			}
		} catch (@Pc(450) RuntimeException local450) {
			signlink.reporterror("31152, " + arg0 + ", " + local450.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
	private int method199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			@Pc(9) int local9 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local9 = arg1 + 1;
			}
			@Pc(38) int local38 = arg2 & 0x7F;
			@Pc(42) int local42 = arg0 & 0x7F;
			@Pc(70) int local70 = this.anIntArrayArrayArray3[local9][local3][local7] * (128 - local38) + this.anIntArrayArrayArray3[local9][local3 + 1][local7] * local38 >> 7;
			@Pc(102) int local102 = this.anIntArrayArrayArray3[local9][local3][local7 + 1] * (128 - local38) + this.anIntArrayArrayArray3[local9][local3 + 1][local7 + 1] * local38 >> 7;
			return local70 * (128 - local42) + local102 * local42 >> 7;
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("89697, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!kb;II)V")
	private void method200(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt150 += 0;
			@Pc(16) int local16;
			@Pc(25) int local25;
			@Pc(32) int local32;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(48) int local48;
			@Pc(53) int local53;
			@Pc(109) int local109;
			@Pc(111) int local111;
			@Pc(113) int local113;
			if (arg1 == 59 || arg1 == 76) {
				local16 = arg0.method391();
				local25 = this.anInt250 + (local16 >> 4 & 0x7);
				local32 = this.anInt251 + (local16 & 0x7);
				local35 = arg0.method391();
				local39 = local35 >> 2;
				local43 = local35 & 0x3;
				local48 = this.anIntArray42[local39];
				if (arg1 == 76) {
					local53 = -1;
				} else {
					local53 = arg0.method393();
				}
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					@Pc(70) Class1_Sub4 local70 = null;
					for (@Pc(75) Class1_Sub4 local75 = (Class1_Sub4) this.aClass28_3.method456(); local75 != null; local75 = (Class1_Sub4) this.aClass28_3.method458()) {
						if (local75.anInt586 == this.anInt219 && local75.anInt588 == local25 && local75.anInt589 == local32 && local75.anInt587 == local48) {
							local70 = local75;
							break;
						}
					}
					if (local70 == null) {
						local109 = 0;
						local111 = -1;
						local113 = 0;
						@Pc(115) int local115 = 0;
						if (local48 == 0) {
							local109 = this.aClass33_1.method494(this.anInt219, local25, local32);
						}
						if (local48 == 1) {
							local109 = this.aClass33_1.method495(local25, this.anInt219, local32);
						}
						if (local48 == 2) {
							local109 = this.aClass33_1.method496(this.anInt219, local25, local32);
						}
						if (local48 == 3) {
							local109 = this.aClass33_1.method497(this.anInt219, local25, local32);
						}
						if (local109 != 0) {
							@Pc(170) int local170 = this.aClass33_1.method498(this.anInt219, local25, local32, local109);
							local111 = local109 >> 14 & 0x7FFF;
							local113 = local170 & 0x1F;
							local115 = local170 >> 6;
						}
						local70 = new Class1_Sub4();
						local70.anInt586 = this.anInt219;
						local70.anInt587 = local48;
						local70.anInt588 = local25;
						local70.anInt589 = local32;
						local70.anInt593 = local111;
						local70.anInt595 = local113;
						local70.anInt594 = local115;
						this.aClass28_3.method453(local70);
					}
					local70.anInt590 = local53;
					local70.anInt592 = local39;
					local70.anInt591 = local43;
					this.method106(local32, this.anInt191, local48, local53, local39, local43, this.anInt219, local25);
				}
			} else if (arg1 == 42) {
				local16 = arg0.method391();
				local25 = this.anInt250 + (local16 >> 4 & 0x7);
				local32 = this.anInt251 + (local16 & 0x7);
				local35 = arg0.method391();
				local39 = local35 >> 2;
				local43 = this.anIntArray42[local39];
				local48 = arg0.method393();
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					local53 = 0;
					if (local43 == 0) {
						local53 = this.aClass33_1.method494(this.anInt219, local25, local32);
					}
					if (local43 == 1) {
						local53 = this.aClass33_1.method495(local25, this.anInt219, local32);
					}
					if (local43 == 2) {
						local53 = this.aClass33_1.method496(this.anInt219, local25, local32);
					}
					if (local43 == 3) {
						local53 = this.aClass33_1.method497(this.anInt219, local25, local32);
					}
					if (local53 != 0) {
						@Pc(350) Class1_Sub6 local350 = new Class1_Sub6(local32, local25, Class19.aClass19Array1[local48], local43, local53 >> 14 & 0x7FFF, false, this.anInt219, 1);
						this.aClass28_4.method453(local350);
					}
				}
			} else {
				@Pc(397) Class1_Sub7 local397;
				if (arg1 == 223) {
					local16 = arg0.method391();
					local25 = this.anInt250 + (local16 >> 4 & 0x7);
					local32 = this.anInt251 + (local16 & 0x7);
					local35 = arg0.method393();
					local39 = arg0.method393();
					if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
						local397 = new Class1_Sub7();
						local397.anInt766 = local35;
						local397.anInt767 = local39;
						if (this.aClass28ArrayArrayArray1[this.anInt219][local25][local32] == null) {
							this.aClass28ArrayArrayArray1[this.anInt219][local25][local32] = new Class28((byte) 30);
						}
						this.aClass28ArrayArrayArray1[this.anInt219][local25][local32].method453(local397);
						this.method134(local25, local32);
					}
				} else if (arg1 == 49) {
					local16 = arg0.method391();
					local25 = this.anInt250 + (local16 >> 4 & 0x7);
					local32 = this.anInt251 + (local16 & 0x7);
					local35 = arg0.method393();
					if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
						@Pc(487) Class28 local487 = this.aClass28ArrayArrayArray1[this.anInt219][local25][local32];
						if (local487 != null) {
							for (local397 = (Class1_Sub7) local487.method456(); local397 != null; local397 = (Class1_Sub7) local487.method458()) {
								if (local397.anInt766 == (local35 & 0x7FFF)) {
									local397.method567();
									break;
								}
							}
							if (local487.method456() == null) {
								this.aClass28ArrayArrayArray1[this.anInt219][local25][local32] = null;
							}
							this.method134(local25, local32);
						}
					}
				} else {
					@Pc(574) int local574;
					@Pc(577) int local577;
					if (arg1 == 69) {
						local16 = arg0.method391();
						local25 = this.anInt250 + (local16 >> 4 & 0x7);
						local32 = this.anInt251 + (local16 & 0x7);
						local35 = local25 + arg0.method392();
						local39 = local32 + arg0.method392();
						local43 = arg0.method394();
						local48 = arg0.method393();
						local53 = arg0.method391();
						local574 = arg0.method391();
						local577 = arg0.method393();
						local109 = arg0.method393();
						local111 = arg0.method391();
						local113 = arg0.method391();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							local35 = local35 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(659) Class1_Sub1_Sub1 local659 = new Class1_Sub1_Sub1(local32, local48, local577 + anInt280, local43, local109 + anInt280, local113, local574, this.method199(local32, this.anInt219, local25) - local53, this.anInt219, 45526, local111, local25);
							local659.method19(local35, local577 + anInt280, local39, 709, this.method199(local39, this.anInt219, local35) - local574);
							this.aClass28_2.method453(local659);
						}
					} else if (arg1 == 191) {
						local16 = arg0.method391();
						local25 = this.anInt250 + (local16 >> 4 & 0x7);
						local32 = this.anInt251 + (local16 & 0x7);
						local35 = arg0.method393();
						local39 = arg0.method391();
						local43 = arg0.method393();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							@Pc(755) Class1_Sub1_Sub2 local755 = new Class1_Sub1_Sub2(this.anInt219, local32, anInt280, local35, 6, local43, local25, this.method199(local32, this.anInt219, local25) - local39);
							this.aClass28_1.method453(local755);
						}
					} else if (arg1 == 50) {
						local16 = arg0.method391();
						local25 = this.anInt250 + (local16 >> 4 & 0x7);
						local32 = this.anInt251 + (local16 & 0x7);
						local35 = arg0.method393();
						local39 = arg0.method393();
						local43 = arg0.method393();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local43 != this.anInt248) {
							@Pc(809) Class1_Sub7 local809 = new Class1_Sub7();
							local809.anInt766 = local35;
							local809.anInt767 = local39;
							if (this.aClass28ArrayArrayArray1[this.anInt219][local25][local32] == null) {
								this.aClass28ArrayArrayArray1[this.anInt219][local25][local32] = new Class28((byte) 30);
							}
							this.aClass28ArrayArrayArray1[this.anInt219][local25][local32].method453(local809);
							this.method134(local25, local32);
						}
					} else {
						if (arg1 == 23) {
							local16 = arg0.method391();
							local25 = this.anInt250 + (local16 >> 4 & 0x7);
							local32 = this.anInt251 + (local16 & 0x7);
							local35 = arg0.method391();
							local39 = local35 >> 2;
							local43 = local35 & 0x3;
							local48 = this.anIntArray42[local39];
							local53 = arg0.method393();
							local574 = arg0.method393();
							local577 = arg0.method393();
							local109 = arg0.method393();
							@Pc(907) byte local907 = arg0.method392();
							@Pc(910) byte local910 = arg0.method392();
							@Pc(913) byte local913 = arg0.method392();
							@Pc(916) byte local916 = arg0.method392();
							@Pc(923) Class1_Sub1_Sub3_Sub2 local923;
							if (local109 == this.anInt248) {
								local923 = this.aClass1_Sub1_Sub3_Sub2_1;
							} else {
								local923 = this.aClass1_Sub1_Sub3_Sub2Array1[local109];
							}
							if (local923 != null) {
								@Pc(948) Class1_Sub5 local948 = new Class1_Sub5(this.anInt219, local32, local574 + anInt280, local43, local25, local39, 41, local48, -1);
								this.aClass28_5.method453(local948);
								@Pc(968) Class1_Sub5 local968 = new Class1_Sub5(this.anInt219, local32, local577 + anInt280, local43, local25, local39, 41, local48, local53);
								this.aClass28_5.method453(local968);
								@Pc(982) int local982 = this.anIntArrayArrayArray3[this.anInt219][local25][local32];
								@Pc(994) int local994 = this.anIntArrayArrayArray3[this.anInt219][local25 + 1][local32];
								@Pc(1008) int local1008 = this.anIntArrayArrayArray3[this.anInt219][local25 + 1][local32 + 1];
								@Pc(1020) int local1020 = this.anIntArrayArrayArray3[this.anInt219][local25][local32 + 1];
								@Pc(1023) Class2 local1023 = Class2.method23(local53);
								local923.anInt944 = local574 + anInt280;
								local923.anInt945 = local577 + anInt280;
								local923.aClass1_Sub3_Sub1_11 = local1023.method26(local39, local43, local982, local994, local1008, local1020, -1);
								@Pc(1047) int local1047 = local1023.anInt45;
								@Pc(1050) int local1050 = local1023.anInt46;
								if (local43 == 1 || local43 == 3) {
									local1047 = local1023.anInt46;
									local1050 = local1023.anInt45;
								}
								local923.anInt946 = local25 * 128 + local1047 * 64;
								local923.anInt948 = local32 * 128 + local1050 * 64;
								local923.anInt947 = this.method199(local923.anInt948, this.anInt219, local923.anInt946);
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
								local923.anInt949 = local25 + local907;
								local923.anInt951 = local25 + local913;
								local923.anInt950 = local32 + local910;
								local923.anInt952 = local32 + local916;
							}
						}
						if (arg1 == 151) {
							local16 = arg0.method391();
							local25 = this.anInt250 + (local16 >> 4 & 0x7);
							local32 = this.anInt251 + (local16 & 0x7);
							local35 = arg0.method393();
							local39 = arg0.method393();
							local43 = arg0.method393();
							if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
								@Pc(1180) Class28 local1180 = this.aClass28ArrayArrayArray1[this.anInt219][local25][local32];
								if (local1180 != null) {
									for (@Pc(1186) Class1_Sub7 local1186 = (Class1_Sub7) local1180.method456(); local1186 != null; local1186 = (Class1_Sub7) local1180.method458()) {
										if (local1186.anInt766 == (local35 & 0x7FFF) && local1186.anInt767 == local39) {
											local1186.anInt767 = local43;
											break;
										}
									}
									this.method134(local25, local32);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1216) RuntimeException local1216) {
			signlink.reporterror("45337, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local1216.toString());
			throw new RuntimeException();
		}
	}
}
