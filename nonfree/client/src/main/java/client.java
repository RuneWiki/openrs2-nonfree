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
	private static int anInt140;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private static int anInt147;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private static int anInt152;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
	private static boolean aBoolean40;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private static int anInt183;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private static int anInt194;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private static int anInt209;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	public static int anInt239;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private static int anInt242;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private static int anInt247;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private static int anInt248;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private static int anInt249;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private static int anInt259;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private static int anInt311;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private static int anInt315;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private static int anInt326;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private static int anInt327;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private static int anInt342;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private static int[] anIntArray31 = new int[99];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private static int anInt151;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
	private static boolean aBoolean39;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "B")
	private static byte aByte16;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "B")
	private static byte aByte17;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Ljava/lang/String;")
	private static String aString5;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	public static final int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private static int anInt243;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[[I")
	public static final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt168;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!qb;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!qb;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!qb;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Lclient!qb;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!z;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!qb;")
	private Class32 aClass32_7;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!qb;")
	private Class32 aClass32_8;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!qb;")
	private Class32 aClass32_9;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!qb;")
	private Class32 aClass32_10;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!qb;")
	private Class32 aClass32_11;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!qb;")
	private Class32 aClass32_12;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!qb;")
	private Class32 aClass32_13;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!qb;")
	private Class32 aClass32_14;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!qb;")
	private Class32 aClass32_15;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!qb;")
	private Class32 aClass32_16;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!qb;")
	private Class32 aClass32_17;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!qb;")
	private Class32 aClass32_18;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!qb;")
	private Class32 aClass32_19;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Lclient!qb;")
	private Class32 aClass32_20;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Lclient!qb;")
	private Class32 aClass32_21;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!qb;")
	private Class32 aClass32_22;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!qb;")
	private Class32 aClass32_23;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!qb;")
	private Class32 aClass32_24;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!qb;")
	private Class32 aClass32_25;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Lclient!qb;")
	private Class32 aClass32_26;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Lclient!qb;")
	private Class32 aClass32_27;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Lclient!qb;")
	private Class32 aClass32_28;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!d;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!ub;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Lclient!tb;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!r;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "Lclient!ob;")
	private Class28 aClass28_1 = new Class28(2);

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private final int anInt139 = 100;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	private int[] anIntArray30 = new int[100];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
	private int[] anIntArray32 = new int[5];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ob;")
	private Class28 aClass28_2 = new Class28(2);

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt148 = -1;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array1 = new Class1_Sub3_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt150 = 2;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray33 = new int[50];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt154 = 4;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt155 = -373;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray34 = new int[50];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt157 = -1;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt160 = 958;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	private int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Ljava/lang/Object;")
	private Object anObject1 = new Object();

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt163 = 50;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray36 = new int[this.anInt163];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray37 = new int[this.anInt163];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray38 = new int[this.anInt163];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "[I")
	private int[] anIntArray39 = new int[this.anInt163];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[I")
	private int[] anIntArray40 = new int[this.anInt163];

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
	private int[] anIntArray41 = new int[this.anInt163];

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
	private int[] anIntArray42 = new int[this.anInt163];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[this.anInt163];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[B")
	private byte[] aByteArray4 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_4 = Class1_Sub3_Sub3.method370((byte) 2);

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array2 = new Class1_Sub3_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray43 = new int[5];

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "B")
	private byte aByte18 = -56;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt170 = 508;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt171 = -189;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt173 = 3;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
	private int[] anIntArray44 = new int[100];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt176 = 128;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt181 = -767;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "B")
	private byte aByte19 = 7;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!hc;")
	private Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!ob;")
	private Class28 aClass28_3 = new Class28(2);

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt184 = 999;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt185 = 2048;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt186 = 2047;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array1 = new Class1_Sub1_Sub3_Sub2[this.anInt185];

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray45 = new int[this.anInt185];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray46 = new int[this.anInt185];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[Lclient!kb;")
	private Class1_Sub3_Sub3[] aClass1_Sub3_Sub3Array1 = new Class1_Sub3_Sub3[this.anInt185];

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray47 = new int[50];

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
	private final int[] anIntArray48 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[I")
	private int[] anIntArray49 = new int[2000];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray50 = new int[500];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "[I")
	private int[] anIntArray51 = new int[500];

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
	private int[] anIntArray52 = new int[500];

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	private int[] anIntArray53 = new int[500];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt197 = -1;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt198 = -1;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt199 = 3353893;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt201 = 2;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt202 = -1;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt204 = 2;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt207 = 1;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt208 = 4;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array3 = new Class1_Sub3_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
	private int[] anIntArray57 = new int[151];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[Z")
	private boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt218 = 7759444;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[[[Lclient!ob;")
	private Class28[][][] aClass28ArrayArrayArray1 = new Class28[4][104][104];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray58 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray59 = new int[1000];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private int[] anIntArray60 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "[I")
	private int[] anIntArray61 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[Lclient!y;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array1 = new Class1_Sub1_Sub3_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[I")
	private int[] anIntArray62 = new int[8192];

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt235 = -1;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
	private boolean aBoolean56 = true;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "B")
	private byte aByte20 = 29;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt237 = 9730;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt238 = -43626;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt240 = 35328;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt241 = 1;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
	private int[] anIntArray63 = new int[2000];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray64 = new int[100];

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_5 = Class1_Sub3_Sub3.method370((byte) 2);

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!ob;")
	private Class28 aClass28_4 = new Class28(2);

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt250 = 4;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "B")
	private byte aByte21 = 9;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
	private int[] anIntArray65 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
	private int[] anIntArray66 = new int[50];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt254 = 1;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt255 = -1;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray67 = new int[33];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!ob;")
	private Class28 aClass28_5 = new Class28(2);

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_6 = Class1_Sub3_Sub3.method370((byte) 2);

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
	private int[] anIntArray68 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "B")
	private byte aByte22 = 3;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array4 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
	private int[] anIntArray69 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "B")
	private byte aByte23 = 126;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt286 = -1;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt288 = -1;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt289 = -1;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "B")
	private byte aByte24 = 42;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt305 = -1;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "B")
	private byte aByte25 = 123;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt307 = 2301979;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt309 = -1;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt310 = 9;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "B")
	private byte aByte26 = 0;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array5 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt314 = 754;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt320 = 78;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "B")
	private byte aByte27 = 5;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[I")
	private int[] anIntArray76 = new int[50];

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray81 = new int[9];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt325 = 3;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
	private int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[Lclient!ec;")
	private Class9[] aClass9Array1 = new Class9[4];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array6 = new Class1_Sub3_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray83 = new int[7];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	private int[] anIntArray84 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt328 = 4;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	private int[] anIntArray85 = new int[151];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray86 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt331 = 2;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray87 = new int[256];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt334 = -280;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array7 = new Class1_Sub3_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[I")
	private int[] anIntArray88 = new int[33];

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt341 = 5063219;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray31[local6] = local4 / 4;
		}
		anInt151 = 10;
		aBoolean39 = true;
		aByte16 = -68;
		aByte17 = 5;
		aString5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray54 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt243 = 17194;
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArrayArray5 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 219);
			if (arg0.length == 4) {
				anInt151 = Integer.parseInt(arg0[0]);
				anInt152 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method186(anInt183);
				} else if (arg0[2].equals("highmem")) {
					method113();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean39 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean39 = true;
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) int local7 = arg1 - arg0;
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
			signlink.reporterror("38809, " + arg0 + ", " + -492 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private static void method113() {
		try {
			Class33.aBoolean150 = false;
			Class1_Sub3_Sub2_Sub1.aBoolean94 = false;
			aBoolean40 = false;
			Class4.aBoolean23 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("60058, " + -317 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	private static String method120(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(17) int local17 = local4.length() - 3; local17 > 0; local17 -= 3) {
				local4 = local4.substring(0, local17) + "," + local4.substring(local17);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("96190, " + arg0 + ", " + false + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("77007, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private static void method186(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 0) {
				Class33.aBoolean150 = true;
				Class1_Sub3_Sub2_Sub1.aBoolean94 = true;
				aBoolean40 = true;
				Class4.aBoolean23 = true;
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("74099, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method75() {
		try {
			if (super.anInt132 == 1) {
				@Pc(16) int local16 = super.anInt133 - 21 - 561;
				@Pc(23) int local23 = super.anInt134 - 9 - 5;
				if (local16 >= 0 && local23 >= 0 && local16 < 146 && local23 < 151) {
					local16 -= 73;
					local23 -= 75;
					@Pc(43) int local43 = this.anInt177 + this.anInt149 & 0x7FF;
					@Pc(47) int local47 = Class1_Sub3_Sub2_Sub1.anIntArray137[local43];
					@Pc(51) int local51 = Class1_Sub3_Sub2_Sub1.anIntArray138[local43];
					@Pc(60) int local60 = local47 * (this.anInt253 + 256) >> 8;
					@Pc(69) int local69 = local51 * (this.anInt253 + 256) >> 8;
					@Pc(79) int local79 = local23 * local60 + local16 * local69 >> 11;
					@Pc(89) int local89 = local23 * local69 - local16 * local60 >> 11;
					@Pc(97) int local97 = this.aClass1_Sub1_Sub3_Sub2_1.anInt896 + local79 >> 7;
					@Pc(105) int local105 = this.aClass1_Sub1_Sub3_Sub2_1.anInt897 - local89 >> 7;
					@Pc(128) boolean local128 = this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local97, local105, true, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 1, 0);
					if (local128) {
						this.aClass1_Sub3_Sub3_6.method373(local16);
						this.aClass1_Sub3_Sub3_6.method373(local23);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt177);
						this.aClass1_Sub3_Sub3_6.method373(57);
						this.aClass1_Sub3_Sub3_6.method373(this.anInt149);
						this.aClass1_Sub3_Sub3_6.method373(this.anInt253);
						this.aClass1_Sub3_Sub3_6.method373(89);
						this.aClass1_Sub3_Sub3_6.method374(this.aClass1_Sub1_Sub3_Sub2_1.anInt896);
						this.aClass1_Sub3_Sub3_6.method374(this.aClass1_Sub1_Sub3_Sub2_1.anInt897);
						this.aClass1_Sub3_Sub3_6.method373(this.anInt261);
						this.aClass1_Sub3_Sub3_6.method373(63);
						return;
					}
				}
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("48913, " + -442 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!hc;)V")
	private void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class15 arg5) {
		try {
			if (arg5.anInt473 == 0 && arg5.anIntArray153 != null && !arg5.aBoolean104 && (arg0 >= arg1 && arg3 >= arg4 && arg0 <= arg1 + arg5.anInt476 && arg3 <= arg4 + arg5.anInt477)) {
				@Pc(34) int local34 = arg5.anIntArray153.length;
				for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
					@Pc(52) int local52 = arg5.anIntArray154[local43] + arg1;
					@Pc(61) int local61 = arg5.anIntArray155[local43] + arg4 - arg2;
					@Pc(68) Class15 local68 = Class15.aClass15Array1[arg5.anIntArray153[local43]];
					@Pc(73) int local73 = local52 + local68.anInt478;
					@Pc(78) int local78 = local61 + local68.anInt479;
					if ((local68.anInt480 >= 0 || local68.anInt488 != 0) && arg0 >= local73 && arg3 >= local78 && arg0 < local73 + local68.anInt476 && arg3 < local78 + local68.anInt477) {
						if (local68.anInt480 >= 0) {
							this.anInt312 = local68.anInt480;
						} else {
							this.anInt312 = local68.anInt471;
						}
					}
					if (local68.anInt473 == 0) {
						this.method76(arg0, local73, local68.anInt482, arg3, local78, local68);
						if (local68.anInt481 > local68.anInt477) {
							this.method90(local68, arg0, local78, local68.anInt477, local68.anInt481, local73 + local68.anInt476, arg3, true);
						}
					} else {
						if (local68.anInt474 == 1 && arg0 >= local73 && arg3 >= local78 && arg0 < local73 + local68.anInt476 && arg3 < local78 + local68.anInt477) {
							@Pc(175) boolean local175 = false;
							if (local68.anInt475 != 0) {
								local175 = this.method77(local68);
							}
							if (!local175) {
								this.aStringArray8[this.anInt252] = local68.aString24;
								this.anIntArray52[this.anInt252] = 706;
								this.anIntArray51[this.anInt252] = local68.anInt471;
								this.anInt252++;
							}
						}
						if (local68.anInt474 == 2 && this.anInt317 == 0 && arg0 >= local73 && arg3 >= local78 && arg0 < local73 + local68.anInt476 && arg3 < local78 + local68.anInt477) {
							@Pc(239) String local239 = local68.aString22;
							if (local239.indexOf(" ") != -1) {
								local239 = local239.substring(0, local239.indexOf(" "));
							}
							this.aStringArray8[this.anInt252] = local239 + " @gre@" + local68.aString23;
							this.anIntArray52[this.anInt252] = 941;
							this.anIntArray51[this.anInt252] = local68.anInt471;
							this.anInt252++;
						}
						if (local68.anInt474 == 3 && arg0 >= local73 && arg3 >= local78 && arg0 < local73 + local68.anInt476 && arg3 < local78 + local68.anInt477) {
							this.aStringArray8[this.anInt252] = "Close";
							this.anIntArray52[this.anInt252] = 309;
							this.anIntArray51[this.anInt252] = local68.anInt471;
							this.anInt252++;
						}
						if (local68.anInt474 == 4 && arg0 >= local73 && arg3 >= local78 && arg0 < local73 + local68.anInt476 && arg3 < local78 + local68.anInt477) {
							this.aStringArray8[this.anInt252] = local68.aString24;
							this.anIntArray52[this.anInt252] = 967;
							this.anIntArray51[this.anInt252] = local68.anInt471;
							this.anInt252++;
						}
						if (local68.anInt474 == 5 && arg0 >= local73 && arg3 >= local78 && arg0 < local73 + local68.anInt476 && arg3 < local78 + local68.anInt477) {
							this.aStringArray8[this.anInt252] = local68.aString24;
							this.anIntArray52[this.anInt252] = 672;
							this.anIntArray51[this.anInt252] = local68.anInt471;
							this.anInt252++;
						}
						if (local68.anInt474 == 6 && !this.aBoolean63 && arg0 >= local73 && arg3 >= local78 && arg0 < local73 + local68.anInt476 && arg3 < local78 + local68.anInt477) {
							this.aStringArray8[this.anInt252] = local68.aString24;
							this.anIntArray52[this.anInt252] = 73;
							this.anIntArray51[this.anInt252] = local68.anInt471;
							this.anInt252++;
						}
						if (local68.anInt473 == 2) {
							@Pc(487) int local487 = 0;
							for (@Pc(489) int local489 = 0; local489 < local68.anInt477; local489++) {
								for (@Pc(493) int local493 = 0; local493 < local68.anInt476; local493++) {
									@Pc(504) int local504 = local73 + local493 * (local68.anInt484 + 32);
									@Pc(513) int local513 = local78 + local489 * (local68.anInt485 + 32);
									if (local487 < 20) {
										local504 += local68.anIntArray156[local487];
										local513 += local68.anIntArray157[local487];
									}
									if (arg0 >= local504 && arg3 >= local513 && arg0 < local504 + 32 && arg3 < local513 + 32) {
										this.anInt192 = local487;
										this.anInt193 = local68.anInt471;
										if (local68.anIntArray149[local487] > 0) {
											@Pc(566) Class5 local566 = Class5.method54(local68.anIntArray149[local487] - 1);
											if (this.anInt230 == 1 && local68.aBoolean107) {
												if (local68.anInt471 != this.anInt232 || local487 != this.anInt231) {
													this.aStringArray8[this.anInt252] = "Use " + this.aString9 + " with @lre@" + local566.aString3;
													this.anIntArray52[this.anInt252] = 237;
													this.anIntArray53[this.anInt252] = local566.anInt97;
													this.anIntArray50[this.anInt252] = local487;
													this.anIntArray51[this.anInt252] = local68.anInt471;
													this.anInt252++;
												}
											} else if (this.anInt317 != 1 || !local68.aBoolean107) {
												@Pc(703) int local703;
												if (local68.aBoolean107) {
													for (local703 = 4; local703 >= 3; local703--) {
														if (local566.aStringArray4 != null && local566.aStringArray4[local703] != null) {
															this.aStringArray8[this.anInt252] = local566.aStringArray4[local703] + " @lre@" + local566.aString3;
															if (local703 == 3) {
																this.anIntArray52[this.anInt252] = 120;
															}
															if (local703 == 4) {
																this.anIntArray52[this.anInt252] = 796;
															}
															this.anIntArray53[this.anInt252] = local566.anInt97;
															this.anIntArray50[this.anInt252] = local487;
															this.anIntArray51[this.anInt252] = local68.anInt471;
															this.anInt252++;
														} else if (local703 == 4) {
															this.aStringArray8[this.anInt252] = "Drop @lre@" + local566.aString3;
															this.anIntArray52[this.anInt252] = 796;
															this.anIntArray53[this.anInt252] = local566.anInt97;
															this.anIntArray50[this.anInt252] = local487;
															this.anIntArray51[this.anInt252] = local68.anInt471;
															this.anInt252++;
														}
													}
												}
												if (local68.aBoolean108) {
													this.aStringArray8[this.anInt252] = "Use @lre@" + local566.aString3;
													this.anIntArray52[this.anInt252] = 357;
													this.anIntArray53[this.anInt252] = local566.anInt97;
													this.anIntArray50[this.anInt252] = local487;
													this.anIntArray51[this.anInt252] = local68.anInt471;
													this.anInt252++;
												}
												if (local68.aBoolean107 && local566.aStringArray4 != null) {
													for (local703 = 2; local703 >= 0; local703--) {
														if (local566.aStringArray4[local703] != null) {
															this.aStringArray8[this.anInt252] = local566.aStringArray4[local703] + " @lre@" + local566.aString3;
															if (local703 == 0) {
																this.anIntArray52[this.anInt252] = 871;
															}
															if (local703 == 1) {
																this.anIntArray52[this.anInt252] = 526;
															}
															if (local703 == 2) {
																this.anIntArray52[this.anInt252] = 156;
															}
															this.anIntArray53[this.anInt252] = local566.anInt97;
															this.anIntArray50[this.anInt252] = local487;
															this.anIntArray51[this.anInt252] = local68.anInt471;
															this.anInt252++;
														}
													}
												}
												if (local68.aStringArray10 != null) {
													for (local703 = 4; local703 >= 0; local703--) {
														if (local68.aStringArray10[local703] != null) {
															this.aStringArray8[this.anInt252] = local68.aStringArray10[local703] + " @lre@" + local566.aString3;
															if (local703 == 0) {
																this.anIntArray52[this.anInt252] = 134;
															}
															if (local703 == 1) {
																this.anIntArray52[this.anInt252] = 701;
															}
															if (local703 == 2) {
																this.anIntArray52[this.anInt252] = 570;
															}
															if (local703 == 3) {
																this.anIntArray52[this.anInt252] = 719;
															}
															if (local703 == 4) {
																this.anIntArray52[this.anInt252] = 440;
															}
															this.anIntArray53[this.anInt252] = local566.anInt97;
															this.anIntArray50[this.anInt252] = local487;
															this.anIntArray51[this.anInt252] = local68.anInt471;
															this.anInt252++;
														}
													}
												}
												this.aStringArray8[this.anInt252] = "Examine @lre@" + local566.aString3;
												this.anIntArray52[this.anInt252] = 1974;
												this.anIntArray53[this.anInt252] = local566.anInt97;
												this.anIntArray51[this.anInt252] = local68.anIntArray150[local487];
												this.anInt252++;
											} else if ((this.anInt319 & 0x10) == 16) {
												this.aStringArray8[this.anInt252] = this.aString16 + " @lre@" + local566.aString3;
												this.anIntArray52[this.anInt252] = 63;
												this.anIntArray53[this.anInt252] = local566.anInt97;
												this.anIntArray50[this.anInt252] = local487;
												this.anIntArray51[this.anInt252] = local68.anInt471;
												this.anInt252++;
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
			signlink.reporterror("7426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -772 + ", " + arg5 + ", " + local1129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!hc;)Z")
	private boolean method77(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(2) int local2 = arg0.anInt475;
			if (local2 >= 1 && local2 <= 200) {
				if (local2 >= 101) {
					local2 -= 101;
				} else {
					local2--;
				}
				this.aStringArray8[this.anInt252] = "Remove @whi@" + this.aStringArray9[local2];
				this.anIntArray52[this.anInt252] = 804;
				this.anInt252++;
				this.aStringArray8[this.anInt252] = "Message @whi@" + this.aStringArray9[local2];
				this.anIntArray52[this.anInt252] = 125;
				this.anInt252++;
				return true;
			} else if (local2 >= 401 && local2 <= 500) {
				this.aStringArray8[this.anInt252] = "Remove @whi@" + arg0.aString20;
				this.anIntArray52[this.anInt252] = 521;
				this.anInt252++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("5202, " + false + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method78() {
		try {
			@Pc(8) byte[] local8 = this.aClass39_1.method528("title.dat", null);
			@Pc(22) Class1_Sub3_Sub2_Sub2 local22 = new Class1_Sub3_Sub2_Sub2(local8, this);
			this.aClass32_13.method455();
			local22.method317(0, 0);
			this.aClass32_14.method455();
			local22.method317(-661, 0);
			this.aClass32_10.method455();
			local22.method317(-128, 0);
			this.aClass32_11.method455();
			local22.method317(-214, -386);
			this.aClass32_12.method455();
			local22.method317(-214, -186);
			this.aClass32_15.method455();
			local22.method317(0, -265);
			this.aClass32_16.method455();
			local22.method317(-574, -265);
			this.aClass32_17.method455();
			local22.method317(-128, -186);
			this.aClass32_18.method455();
			local22.method317(-574, -186);
			@Pc(107) int[] local107 = new int[local22.anInt461];
			for (@Pc(109) int local109 = 0; local109 < local22.anInt462; local109++) {
				for (@Pc(113) int local113 = 0; local113 < local22.anInt461; local113++) {
					local107[local113] = local22.anIntArray148[local22.anInt461 + local22.anInt461 * local109 - local113 - 1];
				}
				for (@Pc(139) int local139 = 0; local139 < local22.anInt461; local139++) {
					local22.anIntArray148[local139 + local22.anInt461 * local109] = local107[local139];
				}
			}
			this.aClass32_13.method455();
			local22.method317(394, 0);
			this.aClass32_14.method455();
			local22.method317(-267, 0);
			this.aClass32_10.method455();
			local22.method317(266, 0);
			this.aClass32_11.method455();
			local22.method317(180, -386);
			this.aClass32_12.method455();
			local22.method317(180, -186);
			this.aClass32_15.method455();
			local22.method317(394, -265);
			this.aClass32_16.method455();
			local22.method317(-180, -265);
			this.aClass32_17.method455();
			local22.method317(212, -186);
			this.aClass32_18.method455();
			local22.method317(-180, -186);
			local22 = new Class1_Sub3_Sub2_Sub2(this.aClass39_1, "logo", 0);
			this.aClass32_10.method455();
			local22.method319(super.anInt126 / 2 - local22.anInt461 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("18656, " + 9 + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!hc;I)I")
	private int method79(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray15 == null || arg1 >= arg0.anIntArrayArray15.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg0.anIntArrayArray15[arg1];
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(30) int local30 = local21[local25++];
					if (local30 == 0) {
						return local23;
					}
					if (local30 == 1) {
						local23 += this.anIntArray76[local21[local25++]];
					}
					if (local30 == 2) {
						local23 += this.anIntArray34[local21[local25++]];
					}
					if (local30 == 3) {
						local23 += this.anIntArray66[local21[local25++]];
					}
					@Pc(83) Class15 local83;
					@Pc(90) int local90;
					@Pc(92) int local92;
					if (local30 == 4) {
						local83 = Class15.aClass15Array1[local21[local25++]];
						local90 = local21[local25++] + 1;
						for (local92 = 0; local92 < local83.anIntArray149.length; local92++) {
							if (local83.anIntArray149[local92] == local90) {
								local23 += local83.anIntArray150[local92];
							}
						}
					}
					if (local30 == 5) {
						local23 += this.anIntArray63[local21[local25++]];
					}
					if (local30 == 6) {
						local23 += anIntArray31[this.anIntArray34[local21[local25++]] - 1];
					}
					if (local30 == 7) {
						local23 += this.anIntArray63[local21[local25++]] * 100 / 46875;
					}
					if (local30 == 8) {
						local23 += this.aClass1_Sub1_Sub3_Sub2_1.anInt946;
					}
					@Pc(174) int local174;
					if (local30 == 9) {
						for (local174 = 0; local174 < 19; local174++) {
							if (local174 == 18) {
								local174 = 20;
							}
							local23 += this.anIntArray34[local174];
						}
					}
					if (local30 == 10) {
						local83 = Class15.aClass15Array1[local21[local25++]];
						local90 = local21[local25++] + 1;
						for (local92 = 0; local92 < local83.anIntArray149.length; local92++) {
							if (local83.anIntArray149[local92] == local90) {
								local23 += 999999999;
								break;
							}
						}
					}
					if (local30 == 11) {
						local23 += this.anInt316;
					}
					if (local30 == 12) {
						local23 += this.anInt262;
					}
					if (local30 == 13) {
						local174 = this.anIntArray63[local21[local25++]];
						local90 = local21[local25++];
						local23 += (local174 & 0x1 << local90) == 0 ? 0 : 1;
					}
				}
			} catch (@Pc(277) Exception local277) {
				return -1;
			}
		} catch (@Pc(280) RuntimeException local280) {
			signlink.reporterror("18233, " + true + ", " + arg0 + ", " + arg1 + ", " + local280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method80() {
		try {
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method201();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass6_1 = null;
			this.aBoolean37 = false;
			this.anInt260 = 0;
			this.aString17 = "";
			this.aString18 = "";
			Class8.method209(false);
			this.method161();
			this.aClass33_1.method459();
			for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
				this.aClass9Array1[local38].method248();
			}
			System.gc();
			this.method96();
			this.aString6 = null;
			this.anInt228 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("9006, " + 89 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method81() {
		try {
			for (@Pc(17) Class1_Sub1_Sub1 local17 = (Class1_Sub1_Sub1) this.aClass28_4.method448(); local17 != null; local17 = (Class1_Sub1_Sub1) this.aClass28_4.method450()) {
				if (local17.anInt23 != this.anInt172 || anInt239 > local17.anInt29) {
					local17.method559();
				} else if (anInt239 >= local17.anInt28) {
					if (local17.anInt32 > 0) {
						@Pc(47) Class1_Sub1_Sub3_Sub1 local47 = this.aClass1_Sub1_Sub3_Sub1Array1[local17.anInt32 - 1];
						if (local47 != null) {
							local17.method19(local47.anInt896, this.method159(local47.anInt897, local47.anInt896, local17.anInt23) - local17.anInt27, local47.anInt897, anInt239);
						}
					}
					if (local17.anInt32 < 0) {
						@Pc(78) int local78 = -local17.anInt32 - 1;
						@Pc(85) Class1_Sub1_Sub3_Sub2 local85;
						if (local78 == this.anInt255) {
							local85 = this.aClass1_Sub1_Sub3_Sub2_1;
						} else {
							local85 = this.aClass1_Sub1_Sub3_Sub2Array1[local78];
						}
						if (local85 != null) {
							local17.method19(local85.anInt896, this.method159(local85.anInt897, local85.anInt896, local17.anInt23) - local17.anInt27, local85.anInt897, anInt239);
						}
					}
					local17.method20(this.anInt161);
					this.aClass33_1.method470(60, local17.anInt33, (int) local17.aDouble1, (int) local17.aDouble3, -1, this.anInt172, local17, null, (int) local17.aDouble2, false);
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("3507, " + -266 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Ljava/net/Socket;")
	private Socket method82(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method83(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt285 > 0) {
				this.method80();
			} else {
				this.aClass32_5.method455();
				this.aClass1_Sub3_Sub2_Sub4_2.method358(257, 144, "Connection lost", 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(256, 143, "Connection lost", 16777215);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(257, 159, "Please wait - attempting to reestablish", 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(256, 158, "Please wait - attempting to reestablish", 16777215);
				@Pc(46) boolean local46 = false;
				this.aClass32_5.method456(11, super.aGraphics2, 8);
				this.anInt164 = 0;
				@Pc(60) Class6 local60 = this.aClass6_1;
				this.aBoolean37 = false;
				this.method168(this.aString17, this.aString18, true);
				if (!this.aBoolean37) {
					this.method80();
				}
				try {
					local60.method201();
				} catch (@Pc(80) Exception local80) {
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("6884, " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method84(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt333; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt333--;
						this.aBoolean69 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt333; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub3_Sub3_6.method372(68);
						this.aClass1_Sub3_Sub3_6.method379(arg0);
						break;
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("19261, " + arg0 + ", " + -615 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method85(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt141 >= 100) {
					this.method103("Your friends list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(23) String local23 = Class40.method534(Class40.method531(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt141; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method103(local23 + " is already on your friend list", 0, "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt333; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method103("Please remove " + local23 + " from your ignore list first", 0, "");
							return;
						}
					}
					if (!local23.equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
						this.aStringArray9[this.anInt141] = local23;
						this.aLongArray4[this.anInt141] = arg0;
						this.anIntArray64[this.anInt141] = 0;
						this.anInt141++;
						this.aBoolean69 = true;
						this.aClass1_Sub3_Sub3_6.method372(66);
						this.aClass1_Sub3_Sub3_6.method379(arg0);
					}
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("70258, " + -31 + ", " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method86() {
		try {
			this.aBoolean37 &= true;
			if (super.anInt132 == 1) {
				if (super.anInt133 >= 8 && super.anInt133 <= 108 && super.anInt134 >= 490 && super.anInt134 <= 522) {
					this.anInt330 = (this.anInt330 + 1) % 4;
					this.aBoolean50 = true;
					this.aBoolean60 = true;
					this.aClass1_Sub3_Sub3_6.method372(197);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt330);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt227);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt205);
				}
				if (super.anInt133 >= 137 && super.anInt133 <= 237 && super.anInt134 >= 490 && super.anInt134 <= 522) {
					this.anInt227 = (this.anInt227 + 1) % 3;
					this.aBoolean50 = true;
					this.aBoolean60 = true;
					this.aClass1_Sub3_Sub3_6.method372(197);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt330);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt227);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt205);
				}
				if (super.anInt133 >= 275 && super.anInt133 <= 375 && super.anInt134 >= 490 && super.anInt134 <= 522) {
					this.anInt205 = (this.anInt205 + 1) % 3;
					this.aBoolean50 = true;
					this.aBoolean60 = true;
					this.aClass1_Sub3_Sub3_6.method372(197);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt330);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt227);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt205);
				}
				if (super.anInt133 >= 416 && super.anInt133 <= 516 && super.anInt134 >= 490 && super.anInt134 <= 522) {
					this.method110();
					this.aString8 = "";
					this.aBoolean66 = false;
					for (@Pc(188) int local188 = 0; local188 < Class15.aClass15Array1.length; local188++) {
						if (Class15.aClass15Array1[local188] != null && Class15.aClass15Array1[local188].anInt475 == 600) {
							this.anInt309 = this.anInt286 = Class15.aClass15Array1[local188].anInt472;
							break;
						}
					}
				}
				anInt342++;
				if (anInt342 > 195) {
					anInt342 = 0;
					this.aClass1_Sub3_Sub3_6.method372(24);
					this.aClass1_Sub3_Sub3_6.method373(239);
					return;
				}
			}
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("57625, " + true + ", " + local236.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method87() {
		try {
			if (this.anInt324 == 2) {
				for (@Pc(17) Class1_Sub5 local17 = (Class1_Sub5) this.aClass28_5.method448(); local17 != null; local17 = (Class1_Sub5) this.aClass28_5.method450()) {
					if (anInt239 >= local17.anInt642) {
						this.method157(local17.anInt636, local17.anInt640, local17.anInt641, local17.anInt638, local17.anInt637, local17.anInt635, local17.anInt639);
						local17.method559();
					}
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("4543, " + -458 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method88() {
		try {
			@Pc(8) int local8 = this.aClass1_Sub1_Sub3_Sub2_1.anInt896 + this.anInt203;
			@Pc(15) int local15 = this.aClass1_Sub1_Sub3_Sub2_1.anInt897 + this.anInt200;
			if (this.anInt189 - local8 < -500 || this.anInt189 - local8 > 500 || this.anInt190 - local15 < -500 || this.anInt190 - local15 > 500) {
				this.anInt189 = local8;
				this.anInt190 = local15;
			}
			if (this.anInt189 != local8) {
				this.anInt189 += (local8 - this.anInt189) / 16;
			}
			if (this.anInt190 != local15) {
				this.anInt190 += (local15 - this.anInt190) / 16;
			}
			if (super.anIntArray28[1] == 1) {
				this.anInt178 += (-this.anInt178 - 24) / 2;
			} else if (super.anIntArray28[2] == 1) {
				this.anInt178 += (24 - this.anInt178) / 2;
			} else {
				this.anInt178 /= 2;
			}
			if (super.anIntArray28[3] == 1) {
				this.anInt179 += (12 - this.anInt179) / 2;
			} else if (super.anIntArray28[4] == 1) {
				this.anInt179 += (-this.anInt179 - 12) / 2;
			} else {
				this.anInt179 /= 2;
			}
			this.anInt177 = this.anInt177 + this.anInt178 / 2 & 0x7FF;
			this.anInt176 += this.anInt179 / 2;
			if (this.anInt176 < 128) {
				this.anInt176 = 128;
			}
			if (this.anInt176 > 383) {
				this.anInt176 = 383;
			}
			@Pc(205) int local205 = this.anInt189 >> 7;
			@Pc(210) int local210 = this.anInt190 >> 7;
			@Pc(220) int local220 = this.method159(this.anInt190, this.anInt189, this.anInt172);
			@Pc(222) int local222 = 0;
			@Pc(238) int local238;
			if (local205 > 3 && local210 > 3 && local205 < 100 && local210 < 100) {
				for (local238 = local205 - 4; local238 <= local205 + 4; local238++) {
					for (@Pc(244) int local244 = local210 - 4; local244 <= local210 + 4; local244++) {
						@Pc(249) int local249 = this.anInt172;
						if (local249 < 3 && (this.aByteArrayArrayArray7[1][local238][local244] & 0x2) == 2) {
							local249++;
						}
						@Pc(276) int local276 = local220 - this.anIntArrayArrayArray3[local249][local238][local244];
						if (local276 > local222) {
							local222 = local276;
						}
					}
				}
			}
			anInt209++;
			if (anInt209 > 77) {
				anInt209 = 0;
				this.aClass1_Sub3_Sub3_6.method372(57);
			}
			local238 = local222 * 192;
			if (local238 > 98048) {
				local238 = 98048;
			}
			if (local238 < 32768) {
				local238 = 32768;
			}
			if (local238 > this.anInt168) {
				this.anInt168 += (local238 - this.anInt168) / 24;
			} else if (local238 < this.anInt168) {
				this.anInt168 += (local238 - this.anInt168) / 80;
			}
		} catch (@Pc(354) RuntimeException local354) {
			signlink.reporterror("54324, " + 0 + ", " + local354.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148;
			@Pc(8) int local8 = local5.length;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				local5[local10] = 0;
			}
			@Pc(34) int local34;
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 1; local22 < 103; local22++) {
				local34 = (103 - local22) * 512 * 4 + 24628;
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray7[arg1][local36][local22] & 0x18) == 0) {
						this.aClass33_1.method495(local5, local34, arg1, local36, local22);
					}
					if (arg1 < 3 && (this.aByteArrayArrayArray7[arg1 + 1][local36][local22] & 0x8) != 0) {
						this.aClass33_1.method495(local5, local34, arg1 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			this.aClass1_Sub3_Sub2_Sub2_4.method316();
			for (local34 = 1; local34 < 103; local34++) {
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray7[arg1][local36][local34] & 0x18) == 0) {
						this.method115(local36, arg1, local34);
					}
					if (arg1 < 3 && (this.aByteArrayArrayArray7[arg1 + 1][local36][local34] & 0x8) != 0) {
						this.method115(local36, arg1 + 1, local34);
					}
				}
			}
			this.aClass32_5.method455();
			this.anInt225 = 0;
			@Pc(166) boolean local166 = false;
			for (local36 = 0; local36 < 104; local36++) {
				for (@Pc(172) int local172 = 0; local172 < 104; local172++) {
					@Pc(182) int local182 = this.aClass33_1.method489(this.anInt172, local36, local172);
					if (local182 != 0) {
						local182 = local182 >> 14 & 0x7FFF;
						@Pc(194) int local194 = Class2.method23(local182).anInt44;
						if (local194 >= 0) {
							this.aClass1_Sub3_Sub2_Sub2Array6[this.anInt225] = this.aClass1_Sub3_Sub2_Sub2Array3[local194];
							this.anIntArray58[this.anInt225] = local36;
							this.anIntArray59[this.anInt225] = local172;
							this.anInt225++;
						}
					}
				}
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("60351, " + arg0 + ", " + arg1 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!hc;IIIIIIZ)V")
	private void method90(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		try {
			if (this.aBoolean68) {
				this.anInt329 = 32;
			} else {
				this.anInt329 = 0;
			}
			this.aBoolean68 = false;
			if (arg1 >= arg5 && arg1 < arg5 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
				arg0.anInt482 -= this.anInt167 * 4;
				if (arg7) {
					this.aBoolean69 = true;
					return;
				}
			} else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
				arg0.anInt482 += this.anInt167 * 4;
				if (arg7) {
					this.aBoolean69 = true;
					return;
				}
			} else if (arg1 >= arg5 - this.anInt329 && arg1 < arg5 + this.anInt329 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16 && this.anInt167 > 0) {
				@Pc(124) int local124 = (arg3 - 32) * arg3 / arg4;
				if (local124 < 8) {
					local124 = 8;
				}
				@Pc(139) int local139 = arg6 - arg2 - local124 / 2 - 16;
				@Pc(145) int local145 = arg3 - local124 - 32;
				arg0.anInt482 = (arg4 - arg3) * local139 / local145;
				if (arg7) {
					this.aBoolean69 = true;
				}
				this.aBoolean68 = true;
			} else {
				return;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("73654, " + -42 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!hb;IZ)V")
	private void method91(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt177 + this.anInt149 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub3_Sub1.anIntArray124[local7];
				@Pc(27) int local27 = Class1_Sub3_Sub1.anIntArray125[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt253 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt253 + 256);
				@Pc(55) int local55 = arg2 * local36 + arg0 * local45 >> 16;
				@Pc(65) int local65 = arg2 * local45 - arg0 * local36 >> 16;
				this.aBoolean37 &= true;
				if (local15 > 2500) {
					arg1.method326(local55 + 94 - arg1.anInt465 / 2, 83 - local65 - arg1.anInt466 / 2, this.aClass1_Sub3_Sub2_Sub3_19, this.anInt241);
				} else {
					arg1.method319(local55 + 94 - arg1.anInt465 / 2, 83 - local65 - arg1.anInt466 / 2);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("24497, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method92(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			signlink.anInt765 = arg1;
			if (this.anInt237 != 9730) {
				this.method67();
			}
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("10851, " + arg0 + ", " + arg1 + ", " + 9730 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method93(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				this.anInt282 = -1;
			}
			this.method190();
			if (this.anInt340 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array7[this.anInt339 / 100].method319(this.anInt337 - 8 - 8, this.anInt338 - 8 - 11);
			}
			if (this.anInt340 == 2) {
				this.aClass1_Sub3_Sub2_Sub2Array7[this.anInt339 / 100 + 4].method319(this.anInt337 - 8 - 8, this.anInt338 - 8 - 11);
				anInt315++;
				if (anInt315 > 161) {
					anInt315 = 0;
					this.aClass1_Sub3_Sub3_6.method372(128);
					this.aClass1_Sub3_Sub3_6.method374(9331);
				}
			}
			if (this.anInt286 != -1) {
				this.method198(this.anInt286, this.anInt161);
				this.method121(Class15.aClass15Array1[this.anInt286], 0, 0, 0);
			}
			this.method196();
			if (!this.aBoolean52) {
				this.method155();
				this.method109();
			} else if (this.anInt142 == 0) {
				this.method156();
			}
			if (this.anInt180 == 1) {
				if (this.anInt257 > 0 || this.anInt335 == 1) {
					this.aClass1_Sub3_Sub2_Sub2Array4[1].method319(472, 258);
				} else {
					this.aClass1_Sub3_Sub2_Sub2Array4[1].method319(472, 296);
				}
			}
			if (this.anInt257 > 0) {
				this.aClass1_Sub3_Sub2_Sub2Array4[0].method319(472, 296);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(484, 329, "Level: " + this.anInt257, 16776960);
			}
			if (this.anInt335 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array4[6].method319(472, 296);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(484, 329, "Arena", 16776960);
			}
			if (this.anInt332 != 0) {
				@Pc(204) int local204 = this.anInt332 / 50;
				@Pc(208) int local208 = local204 / 60;
				@Pc(212) int local212 = local204 % 60;
				if (local212 < 10) {
					this.aClass1_Sub3_Sub2_Sub4_2.method361(4, 16776960, "System update in: " + local208 + ":0" + local212, 329);
				} else {
					this.aClass1_Sub3_Sub2_Sub4_2.method361(4, 16776960, "System update in: " + local208 + ":" + local212, 329);
				}
			}
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("61904, " + arg0 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method94() {
		try {
			if (this.aClass32_10 == null) {
				super.aClass32_2 = null;
				this.aClass32_6 = null;
				this.aClass32_4 = null;
				this.aClass32_3 = null;
				this.aClass32_5 = null;
				this.aClass32_7 = null;
				this.aClass32_8 = null;
				this.aClass32_9 = null;
				this.aClass32_13 = new Class32((byte) -121, 265, this.method72(anInt243), 128);
				Class1_Sub3_Sub2.method353();
				this.aClass32_14 = new Class32((byte) -121, 265, this.method72(anInt243), 128);
				Class1_Sub3_Sub2.method353();
				this.aClass32_10 = new Class32((byte) -121, 186, this.method72(anInt243), 533);
				Class1_Sub3_Sub2.method353();
				this.aClass32_11 = new Class32((byte) -121, 146, this.method72(anInt243), 360);
				Class1_Sub3_Sub2.method353();
				this.aClass32_12 = new Class32((byte) -121, 200, this.method72(anInt243), 360);
				Class1_Sub3_Sub2.method353();
				this.aClass32_15 = new Class32((byte) -121, 267, this.method72(anInt243), 214);
				Class1_Sub3_Sub2.method353();
				this.aClass32_16 = new Class32((byte) -121, 267, this.method72(anInt243), 215);
				Class1_Sub3_Sub2.method353();
				this.aClass32_17 = new Class32((byte) -121, 79, this.method72(anInt243), 86);
				Class1_Sub3_Sub2.method353();
				this.aClass32_18 = new Class32((byte) -121, 79, this.method72(anInt243), 87);
				Class1_Sub3_Sub2.method353();
				if (this.aClass39_1 != null) {
					this.method78();
					this.method188(aByte17);
				}
				this.aBoolean64 = true;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("6572, " + true + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Z")
	private boolean method95(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray52[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 447;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("71394, " + arg0 + ", " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method96() {
		try {
			signlink.anInt766 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("19329, " + 9 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)V")
	private void method97(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				if (this.aStringArray7[local14] != null) {
					@Pc(26) int local26 = this.anIntArray44[local14];
					@Pc(37) int local37 = this.anInt246 + 70 + 4 - local12 * 14;
					if (local37 < -20) {
						break;
					}
					if (local26 == 0) {
						local12++;
					}
					if ((local26 == 1 || local26 == 2) && (local26 == 1 || this.anInt330 == 0 || this.anInt330 == 1 && this.method176(this.aStringArray6[local14], this.anInt181))) {
						if (arg1 > local37 - 14 && arg1 <= local37 && !this.aStringArray6[local14].equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
							if (this.aBoolean58) {
								this.aStringArray8[this.anInt252] = "Report abuse @whi@" + this.aStringArray6[local14];
								this.anIntArray52[this.anInt252] = 316;
								this.anInt252++;
							}
							this.aStringArray8[this.anInt252] = "Add ignore @whi@" + this.aStringArray6[local14];
							this.anIntArray52[this.anInt252] = 158;
							this.anInt252++;
							this.aStringArray8[this.anInt252] = "Add friend @whi@" + this.aStringArray6[local14];
							this.anIntArray52[this.anInt252] = 447;
							this.anInt252++;
						}
						local12++;
					}
					if ((local26 == 3 || local26 == 7) && this.anInt138 == 0 && (local26 == 7 || this.anInt227 == 0 || this.anInt227 == 1 && this.method176(this.aStringArray6[local14], this.anInt181))) {
						if (arg1 > local37 - 14 && arg1 <= local37) {
							if (this.aBoolean58) {
								this.aStringArray8[this.anInt252] = "Report abuse @whi@" + this.aStringArray6[local14];
								this.anIntArray52[this.anInt252] = 316;
								this.anInt252++;
							}
							this.aStringArray8[this.anInt252] = "Add ignore @whi@" + this.aStringArray6[local14];
							this.anIntArray52[this.anInt252] = 158;
							this.anInt252++;
							this.aStringArray8[this.anInt252] = "Add friend @whi@" + this.aStringArray6[local14];
							this.anIntArray52[this.anInt252] = 447;
							this.anInt252++;
						}
						local12++;
					}
					if (local26 == 4 && (this.anInt205 == 0 || this.anInt205 == 1 && this.method176(this.aStringArray6[local14], this.anInt181))) {
						if (arg1 > local37 - 14 && arg1 <= local37) {
							this.aStringArray8[this.anInt252] = "Accept trade @whi@" + this.aStringArray6[local14];
							this.anIntArray52[this.anInt252] = 595;
							this.anInt252++;
						}
						local12++;
					}
					if ((local26 == 5 || local26 == 6) && this.anInt138 == 0 && this.anInt227 < 2) {
						local12++;
					}
					if (local26 == 8 && (this.anInt205 == 0 || this.anInt205 == 1 && this.method176(this.aStringArray6[local14], this.anInt181))) {
						if (arg1 > local37 - 14 && arg1 <= local37) {
							this.aStringArray8[this.anInt252] = "Accept duel @whi@" + this.aStringArray6[local14];
							this.anIntArray52[this.anInt252] = 835;
							this.anInt252++;
						}
						local12++;
					}
				}
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("36059, " + -43 + ", " + arg0 + ", " + arg1 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!kb;Lclient!z;I)V")
	private void method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3_Sub2 arg3) {
		try {
			@Pc(14) int local14;
			if ((arg1 & 0x1) == 1) {
				local14 = arg2.method383();
				@Pc(17) byte[] local17 = new byte[local14];
				@Pc(23) Class1_Sub3_Sub3 local23 = new Class1_Sub3_Sub3(0, local17);
				arg2.method392(0, local17, local14);
				this.aClass1_Sub3_Sub3Array1[arg0] = local23;
				arg3.method564((byte) 4, local23);
			}
			@Pc(61) int local61;
			if ((arg1 & 0x2) == 2) {
				local14 = arg2.method385();
				if (local14 == 65535) {
					local14 = -1;
				}
				if (local14 == arg3.anInt921) {
					arg3.anInt925 = 0;
				}
				local61 = arg2.method383();
				if (local14 == -1 || arg3.anInt921 == -1 || Class19.aClass19Array1[local14].anInt548 > Class19.aClass19Array1[arg3.anInt921].anInt548 || Class19.aClass19Array1[arg3.anInt921].anInt548 == 0) {
					arg3.anInt921 = local14;
					arg3.anInt922 = 0;
					arg3.anInt923 = 0;
					arg3.anInt924 = local61;
					arg3.anInt925 = 0;
				}
			}
			if ((arg1 & 0x4) == 4) {
				arg3.anInt915 = arg2.method385();
				if (arg3.anInt915 == 65535) {
					arg3.anInt915 = -1;
				}
			}
			if ((arg1 & 0x8) == 8) {
				arg3.aString29 = arg2.method390();
				arg3.anInt908 = 0;
				arg3.anInt909 = 0;
				arg3.anInt907 = 150;
				this.method103(arg3.aString29, 2, arg3.aString30);
			}
			if ((arg1 & 0x10) == 16) {
				arg3.anInt910 = arg2.method383();
				arg3.anInt911 = arg2.method383();
				arg3.anInt912 = anInt239 + 400;
				arg3.anInt913 = arg2.method383();
				arg3.anInt914 = arg2.method383();
			}
			if ((arg1 & 0x20) == 32) {
				arg3.anInt916 = arg2.method385();
				arg3.anInt917 = arg2.method385();
			}
			if ((arg1 & 0x40) == 64) {
				local14 = arg2.method385();
				local61 = arg2.method383();
				@Pc(194) int local194 = arg2.method383();
				@Pc(197) int local197 = arg2.anInt566;
				if (arg3.aString30 != null) {
					@Pc(204) long local204 = Class40.method530(arg3.aString30);
					@Pc(206) boolean local206 = false;
					if (local61 <= 1) {
						for (@Pc(211) int local211 = 0; local211 < this.anInt333; local211++) {
							if (this.aLongArray3[local211] == local204) {
								local206 = true;
								break;
							}
						}
					}
					if (!local206 && this.anInt229 == 0) {
						try {
							@Pc(239) String local239 = Class41.method537(local194, arg2);
							@Pc(243) String local243 = Class25.method416(local239);
							arg3.aString29 = local243;
							arg3.anInt908 = local14 >> 8;
							arg3.anInt909 = local14 & 0xFF;
							arg3.anInt907 = 150;
							if (local61 > 1) {
								this.method103(local243, 1, arg3.aString30);
							} else {
								this.method103(local243, 2, arg3.aString30);
							}
						} catch (@Pc(280) Exception local280) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt566 = local197 + local194;
			}
			if ((arg1 & 0x100) == 256) {
				arg3.anInt926 = arg2.method385();
				local14 = arg2.method388();
				arg3.anInt930 = local14 >> 16;
				arg3.anInt929 = anInt239 + (local14 & 0xFFFF);
				arg3.anInt927 = 0;
				arg3.anInt928 = 0;
				if (arg3.anInt929 > anInt239) {
					arg3.anInt927 = -1;
				}
				if (arg3.anInt926 == 65535) {
					arg3.anInt926 = -1;
				}
			}
			if ((arg1 & 0x200) == 512) {
				arg3.anInt931 = arg2.method383();
				arg3.anInt933 = arg2.method383();
				arg3.anInt932 = arg2.method383();
				arg3.anInt934 = arg2.method383();
				arg3.anInt935 = arg2.method385() + anInt239;
				arg3.anInt936 = arg2.method385() + anInt239;
				arg3.anInt937 = arg2.method383();
				arg3.anInt941 = 0;
				arg3.anIntArray232[0] = arg3.anInt932;
				arg3.anIntArray233[0] = arg3.anInt934;
			}
		} catch (@Pc(386) RuntimeException local386) {
			signlink.reporterror("75449, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 6748 + ", " + local386.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method99() {
		try {
			@Pc(16) int local16;
			if (this.anInt244 > 0) {
				for (local16 = 0; local16 < 256; local16++) {
					if (this.anInt244 > 768) {
						this.anIntArray77[local16] = this.method192(this.aByte23, 1024 - this.anInt244, this.anIntArray78[local16], this.anIntArray79[local16]);
					} else if (this.anInt244 > 256) {
						this.anIntArray77[local16] = this.anIntArray79[local16];
					} else {
						this.anIntArray77[local16] = this.method192(this.aByte23, 256 - this.anInt244, this.anIntArray79[local16], this.anIntArray78[local16]);
					}
				}
			} else if (this.anInt245 > 0) {
				for (local16 = 0; local16 < 256; local16++) {
					if (this.anInt245 > 768) {
						this.anIntArray77[local16] = this.method192(this.aByte23, 1024 - this.anInt245, this.anIntArray78[local16], this.anIntArray80[local16]);
					} else if (this.anInt245 > 256) {
						this.anIntArray77[local16] = this.anIntArray80[local16];
					} else {
						this.anIntArray77[local16] = this.method192(this.aByte23, 256 - this.anInt245, this.anIntArray80[local16], this.anIntArray78[local16]);
					}
				}
			} else {
				for (local16 = 0; local16 < 256; local16++) {
					this.anIntArray77[local16] = this.anIntArray78[local16];
				}
			}
			for (local16 = 0; local16 < 33920; local16++) {
				this.aClass32_13.anIntArray197[local16] = this.aClass1_Sub3_Sub2_Sub2_1.anIntArray148[local16];
			}
			@Pc(193) int local193 = 0;
			@Pc(195) int local195 = 1152;
			@Pc(210) int local210;
			@Pc(214) int local214;
			@Pc(224) int local224;
			@Pc(232) int local232;
			@Pc(236) int local236;
			@Pc(240) int local240;
			@Pc(251) int local251;
			for (@Pc(197) int local197 = 1; local197 < 255; local197++) {
				local210 = this.anIntArray87[local197] * (256 - local197) / 256;
				local214 = local210 + 22;
				if (local214 < 0) {
					local214 = 0;
				}
				local193 += local214;
				for (local224 = local214; local224 < 128; local224++) {
					local232 = this.anIntArray71[local193++];
					if (local232 == 0) {
						local195++;
					} else {
						local236 = local232;
						local240 = 256 - local232;
						local232 = this.anIntArray77[local232];
						local251 = this.aClass32_13.anIntArray197[local195];
						this.aClass32_13.anIntArray197[local195++] = ((local232 & 0xFF00FF) * local236 + (local251 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local232 & 0xFF00) * local236 + (local251 & 0xFF00) * local240 & 0xFF0000) >> 8;
					}
				}
				local195 += local214;
			}
			this.aClass32_13.method456(0, super.aGraphics2, 0);
			for (local210 = 0; local210 < 33920; local210++) {
				this.aClass32_14.anIntArray197[local210] = this.aClass1_Sub3_Sub2_Sub2_2.anIntArray148[local210];
			}
			local193 = 0;
			local195 = 1176;
			for (local214 = 1; local214 < 255; local214++) {
				local224 = this.anIntArray87[local214] * (256 - local214) / 256;
				local232 = 103 - local224;
				local195 += local224;
				for (local236 = 0; local236 < local232; local236++) {
					local240 = this.anIntArray71[local193++];
					if (local240 == 0) {
						local195++;
					} else {
						local251 = local240;
						@Pc(374) int local374 = 256 - local240;
						local240 = this.anIntArray77[local240];
						@Pc(385) int local385 = this.aClass32_14.anIntArray197[local195];
						this.aClass32_14.anIntArray197[local195++] = ((local240 & 0xFF00FF) * local251 + (local385 & 0xFF00FF) * local374 & 0xFF00FF00) + ((local240 & 0xFF00) * local251 + (local385 & 0xFF00) * local374 & 0xFF0000) >> 8;
					}
				}
				local193 += 128 - local232;
				local195 += 128 - local232 - local224;
			}
			this.aClass32_14.method456(0, super.aGraphics2, 661);
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("34278, " + 8 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!kb;)V")
	private void method100(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method394(8);
			@Pc(12) int local12;
			if (local6 < this.anInt187) {
				for (local12 = local6; local12 < this.anInt187; local12++) {
					this.anIntArray65[this.anInt251++] = this.anIntArray45[local12];
				}
			}
			if (local6 > this.anInt187) {
				signlink.reporterror(this.aString17 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt187 = 0;
			if (this.aByte21 != 9) {
				this.anInt282 = arg1.method383();
			}
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(72) int local72 = this.anIntArray45[local12];
				@Pc(77) Class1_Sub1_Sub3_Sub2 local77 = this.aClass1_Sub1_Sub3_Sub2Array1[local72];
				@Pc(82) int local82 = arg1.method394(1);
				if (local82 == 0) {
					this.anIntArray45[this.anInt187++] = local72;
					local77.anInt938 = anInt239;
				} else {
					@Pc(105) int local105 = arg1.method394(2);
					if (local105 == 0) {
						this.anIntArray45[this.anInt187++] = local72;
						local77.anInt938 = anInt239;
						this.anIntArray46[this.anInt188++] = local72;
					} else {
						@Pc(156) int local156;
						@Pc(166) int local166;
						if (local105 == 1) {
							this.anIntArray45[this.anInt187++] = local72;
							local77.anInt938 = anInt239;
							local156 = arg1.method394(3);
							local77.method562(local156, false);
							local166 = arg1.method394(1);
							if (local166 == 1) {
								this.anIntArray46[this.anInt188++] = local72;
							}
						} else if (local105 == 2) {
							this.anIntArray45[this.anInt187++] = local72;
							local77.anInt938 = anInt239;
							local156 = arg1.method394(3);
							local77.method562(local156, true);
							local166 = arg1.method394(3);
							local77.method562(local166, true);
							@Pc(224) int local224 = arg1.method394(1);
							if (local224 == 1) {
								this.anIntArray46[this.anInt188++] = local72;
							}
						} else if (local105 == 3) {
							this.anIntArray65[this.anInt251++] = local72;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("84681, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method101() {
		try {
			@Pc(4) Graphics local4 = this.method72(anInt243).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 789, 532);
			this.method65();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean67) {
				this.aBoolean53 = false;
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
			if (this.aBoolean73) {
				this.aBoolean53 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean70) {
				this.aBoolean53 = false;
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
			signlink.reporterror("33752, " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method102() {
		try {
			for (@Pc(8) int local8 = -1; local8 < this.anInt187; local8++) {
				@Pc(16) int local16;
				if (local8 == -1) {
					local16 = this.anInt186;
				} else {
					local16 = this.anIntArray45[local8];
				}
				@Pc(28) Class1_Sub1_Sub3_Sub2 local28 = this.aClass1_Sub1_Sub3_Sub2Array1[local16];
				if (local28 != null) {
					this.method132(1, local28);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("62211, " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
	private void method103(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt202 != -1) {
				this.aString10 = arg0;
				super.anInt132 = 0;
			}
			if (this.anInt288 == -1) {
				this.aBoolean60 = true;
			}
			for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
				this.anIntArray44[local26] = this.anIntArray44[local26 - 1];
				this.aStringArray6[local26] = this.aStringArray6[local26 - 1];
				this.aStringArray7[local26] = this.aStringArray7[local26 - 1];
			}
			this.anIntArray44[0] = arg1;
			this.aStringArray6[0] = arg2;
			this.aStringArray7[0] = arg0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("698, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method70() {
		try {
			if (this.anInt238 != -43626) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (this.aBoolean70 || this.aBoolean67 || this.aBoolean73) {
				this.method101();
			} else {
				if (this.aBoolean37) {
					this.method138();
				} else {
					this.method104();
				}
				this.anInt167 = 0;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("12556, " + -43626 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method104() {
		try {
			this.method94();
			this.aClass32_12.method455();
			this.aClass1_Sub3_Sub2_Sub3_8.method346(0, 0);
			@Pc(31) byte local31;
			@Pc(43) int local43;
			if (this.anInt260 == 0) {
				local31 = 80;
				this.aClass1_Sub3_Sub2_Sub4_3.method359(80, "Welcome to RuneScape", true, 16776960, 180);
				local43 = local31 + 30;
				this.aClass1_Sub3_Sub2_Sub3_9.method346(27, 100);
				this.aClass1_Sub3_Sub2_Sub4_3.method359(125, "New user", true, 16777215, 100);
				this.aClass1_Sub3_Sub2_Sub3_9.method346(187, 100);
				this.aClass1_Sub3_Sub2_Sub4_3.method359(125, "Existing User", true, 16777215, 260);
			}
			if (this.anInt260 == 2) {
				local31 = 60;
				if (this.aString11.length() > 0) {
					this.aClass1_Sub3_Sub2_Sub4_3.method359(45, this.aString11, true, 16776960, 180);
					this.aClass1_Sub3_Sub2_Sub4_3.method359(60, this.aString12, true, 16776960, 180);
					local43 = local31 + 30;
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method359(53, this.aString12, true, 16776960, 180);
					local43 = local31 + 30;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method363(90, 16777215, 90, "Username: " + this.aString17 + (this.anInt322 == 0 & anInt239 % 40 < 20 ? "@yel@|" : ""), true);
				local43 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method363(92, 16777215, 105, "Password: " + Class40.method536(this.aString18) + (this.anInt322 == 1 & anInt239 % 40 < 20 ? "@yel@|" : ""), true);
				local43 += 15;
				this.aClass1_Sub3_Sub2_Sub3_9.method346(27, 130);
				this.aClass1_Sub3_Sub2_Sub4_3.method359(155, "Login", true, 16777215, 100);
				this.aClass1_Sub3_Sub2_Sub3_9.method346(187, 130);
				this.aClass1_Sub3_Sub2_Sub4_3.method359(155, "Cancel", true, 16777215, 260);
			}
			if (this.anInt260 == 3) {
				this.aClass1_Sub3_Sub2_Sub4_3.method359(40, "Create a free account", true, 16776960, 180);
				local31 = 65;
				this.aClass1_Sub3_Sub2_Sub4_3.method359(65, "To create a new account you need to", true, 16777215, 180);
				local43 = local31 + 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method359(80, "go back to the main RuneScape webpage", true, 16777215, 180);
				local43 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method359(95, "and choose the red 'create account'", true, 16777215, 180);
				local43 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method359(110, "button at the top right of that page.", true, 16777215, 180);
				local43 += 15;
				this.aClass1_Sub3_Sub2_Sub3_9.method346(107, 130);
				this.aClass1_Sub3_Sub2_Sub4_3.method359(155, "Cancel", true, 16777215, 180);
			}
			this.aClass32_12.method456(186, super.aGraphics2, 214);
			if (this.aBoolean64) {
				this.aBoolean64 = false;
				this.aClass32_10.method456(0, super.aGraphics2, 128);
				this.aClass32_11.method456(386, super.aGraphics2, 214);
				this.aClass32_15.method456(265, super.aGraphics2, 0);
				this.aClass32_16.method456(265, super.aGraphics2, 574);
				this.aClass32_17.method456(186, super.aGraphics2, 128);
				this.aClass32_18.method456(186, super.aGraphics2, 574);
			}
		} catch (@Pc(474) RuntimeException local474) {
			signlink.reporterror("10923, " + false + ", " + local474.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;I)V")
	private void method105(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			arg1.method393();
			@Pc(7) int local7 = arg1.method394(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg1.method394(2);
				if (arg0 != 3) {
					this.anInt282 = -1;
				}
				if (local15 == 0) {
					this.anIntArray46[this.anInt188++] = this.anInt186;
				} else {
					@Pc(44) int local44;
					@Pc(55) int local55;
					if (local15 == 1) {
						local44 = arg1.method394(3);
						this.aClass1_Sub1_Sub3_Sub2_1.method562(local44, false);
						local55 = arg1.method394(1);
						if (local55 == 1) {
							this.anIntArray46[this.anInt188++] = this.anInt186;
						}
					} else {
						@Pc(101) int local101;
						if (local15 == 2) {
							local44 = arg1.method394(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method562(local44, true);
							local55 = arg1.method394(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method562(local55, true);
							local101 = arg1.method394(1);
							if (local101 == 1) {
								this.anIntArray46[this.anInt188++] = this.anInt186;
							}
						} else if (local15 == 3) {
							this.anInt172 = arg1.method394(2);
							local44 = arg1.method394(7);
							local55 = arg1.method394(7);
							local101 = arg1.method394(1);
							this.aClass1_Sub1_Sub3_Sub2_1.method561(local55, local101 == 1, local44);
							@Pc(158) int local158 = arg1.method394(1);
							if (local158 == 1) {
								this.anIntArray46[this.anInt188++] = this.anInt186;
							}
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("51948, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method106() {
		try {
			@Pc(13) int local13 = this.aClass1_Sub3_Sub2_Sub4_3.method360("Choose Option");
			@Pc(26) int local26;
			for (@Pc(15) int local15 = 0; local15 < this.anInt252; local15++) {
				local26 = this.aClass1_Sub3_Sub2_Sub4_3.method360(this.aStringArray8[local15]);
				if (local26 > local13) {
					local13 = local26;
				}
			}
			local13 += 8;
			local26 = this.anInt252 * 15 + 21;
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
				this.aBoolean52 = true;
				this.anInt142 = 0;
				this.anInt143 = local69;
				this.anInt144 = local87;
				this.anInt145 = local13;
				this.anInt146 = this.anInt252 * 15 + 22;
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
				this.aBoolean52 = true;
				this.anInt142 = 1;
				this.anInt143 = local69;
				this.anInt144 = local87;
				this.anInt145 = local13;
				this.anInt146 = this.anInt252 * 15 + 22;
			}
			if (super.anInt133 > 22 && super.anInt134 > 375 && super.anInt133 < 501 && super.anInt134 < 471) {
				local69 = super.anInt133 - local13 / 2 - 22;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local13 > 479) {
					local69 = 479 - local13;
				}
				local87 = super.anInt134 - 375;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 96) {
					local87 = 96 - local26;
				}
				this.aBoolean52 = true;
				this.anInt142 = 2;
				this.anInt143 = local69;
				this.anInt144 = local87;
				this.anInt145 = local13;
				this.anInt146 = this.anInt252 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("48523, " + 41690 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean54) {
			this.method154();
		} else if (this.aBoolean36) {
			this.method200();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!kb;)V")
	private void method107(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2) {
		try {
			if (arg0 != this.aByte20) {
				this.aClass28ArrayArrayArray1 = null;
			}
			@Pc(17) int local17;
			@Pc(26) int local26;
			@Pc(33) int local33;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(49) int local49;
			@Pc(54) int local54;
			@Pc(110) int local110;
			@Pc(112) int local112;
			@Pc(114) int local114;
			if (arg1 == 220 || arg1 == 214) {
				local17 = arg2.method383();
				local26 = this.anInt158 + (local17 >> 4 & 0x7);
				local33 = this.anInt159 + (local17 & 0x7);
				local36 = arg2.method383();
				local40 = local36 >> 2;
				local44 = local36 & 0x3;
				local49 = this.anIntArray48[local40];
				if (arg1 == 214) {
					local54 = -1;
				} else {
					local54 = arg2.method385();
				}
				if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
					@Pc(71) Class1_Sub4 local71 = null;
					for (@Pc(76) Class1_Sub4 local76 = (Class1_Sub4) this.aClass28_1.method448(); local76 != null; local76 = (Class1_Sub4) this.aClass28_1.method450()) {
						if (local76.anInt598 == this.anInt172 && local76.anInt600 == local26 && local76.anInt601 == local33 && local76.anInt599 == local49) {
							local71 = local76;
							break;
						}
					}
					if (local71 == null) {
						local110 = 0;
						local112 = -1;
						local114 = 0;
						@Pc(116) int local116 = 0;
						if (local49 == 0) {
							local110 = this.aClass33_1.method486(this.anInt172, local26, local33);
						}
						if (local49 == 1) {
							local110 = this.aClass33_1.method487(this.anInt172, local33, local26);
						}
						if (local49 == 2) {
							local110 = this.aClass33_1.method488(this.anInt172, local26, local33);
						}
						if (local49 == 3) {
							local110 = this.aClass33_1.method489(this.anInt172, local26, local33);
						}
						if (local110 != 0) {
							@Pc(171) int local171 = this.aClass33_1.method490(this.anInt172, local26, local33, local110);
							local112 = local110 >> 14 & 0x7FFF;
							local114 = local171 & 0x1F;
							local116 = local171 >> 6;
						}
						local71 = new Class1_Sub4();
						local71.anInt598 = this.anInt172;
						local71.anInt599 = local49;
						local71.anInt600 = local26;
						local71.anInt601 = local33;
						local71.anInt605 = local112;
						local71.anInt607 = local114;
						local71.anInt606 = local116;
						this.aClass28_1.method445(local71);
					}
					local71.anInt602 = local54;
					local71.anInt604 = local40;
					local71.anInt603 = local44;
					this.method157(local49, local44, local40, local33, local26, this.anInt172, local54);
				}
			} else if (arg1 == 78) {
				local17 = arg2.method383();
				local26 = this.anInt158 + (local17 >> 4 & 0x7);
				local33 = this.anInt159 + (local17 & 0x7);
				local36 = arg2.method383();
				local40 = local36 >> 2;
				local44 = this.anIntArray48[local40];
				local49 = arg2.method385();
				if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
					local54 = 0;
					if (local44 == 0) {
						local54 = this.aClass33_1.method486(this.anInt172, local26, local33);
					}
					if (local44 == 1) {
						local54 = this.aClass33_1.method487(this.anInt172, local33, local26);
					}
					if (local44 == 2) {
						local54 = this.aClass33_1.method488(this.anInt172, local26, local33);
					}
					if (local44 == 3) {
						local54 = this.aClass33_1.method489(this.anInt172, local26, local33);
					}
					if (local54 != 0) {
						@Pc(351) Class1_Sub6 local351 = new Class1_Sub6(local44, local33, this.anInt172, false, Class19.aClass19Array1[local49], this.anInt208, local54 >> 14 & 0x7FFF, local26);
						this.aClass28_3.method445(local351);
					}
				}
			} else {
				@Pc(398) Class1_Sub7 local398;
				if (arg1 == 246) {
					local17 = arg2.method383();
					local26 = this.anInt158 + (local17 >> 4 & 0x7);
					local33 = this.anInt159 + (local17 & 0x7);
					local36 = arg2.method385();
					local40 = arg2.method385();
					if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
						local398 = new Class1_Sub7();
						local398.anInt780 = local36;
						local398.anInt781 = local40;
						if (this.aClass28ArrayArrayArray1[this.anInt172][local26][local33] == null) {
							this.aClass28ArrayArrayArray1[this.anInt172][local26][local33] = new Class28(2);
						}
						this.aClass28ArrayArrayArray1[this.anInt172][local26][local33].method445(local398);
						this.method171(local26, local33);
					}
				} else if (arg1 == 61) {
					local17 = arg2.method383();
					local26 = this.anInt158 + (local17 >> 4 & 0x7);
					local33 = this.anInt159 + (local17 & 0x7);
					local36 = arg2.method385();
					if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
						@Pc(488) Class28 local488 = this.aClass28ArrayArrayArray1[this.anInt172][local26][local33];
						if (local488 != null) {
							for (local398 = (Class1_Sub7) local488.method448(); local398 != null; local398 = (Class1_Sub7) local488.method450()) {
								if (local398.anInt780 == (local36 & 0x7FFF)) {
									local398.method559();
									break;
								}
							}
							if (local488.method448() == null) {
								this.aClass28ArrayArrayArray1[this.anInt172][local26][local33] = null;
							}
							this.method171(local26, local33);
						}
					}
				} else {
					@Pc(575) int local575;
					@Pc(578) int local578;
					if (arg1 == 1) {
						local17 = arg2.method383();
						local26 = this.anInt158 + (local17 >> 4 & 0x7);
						local33 = this.anInt159 + (local17 & 0x7);
						local36 = local26 + arg2.method384();
						local40 = local33 + arg2.method384();
						local44 = arg2.method386();
						local49 = arg2.method385();
						local54 = arg2.method383();
						local575 = arg2.method383();
						local578 = arg2.method385();
						local110 = arg2.method385();
						local112 = arg2.method383();
						local114 = arg2.method383();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local36 >= 0 && local40 >= 0 && local36 < 104 && local40 < 104) {
							local26 = local26 * 128 + 64;
							local33 = local33 * 128 + 64;
							local36 = local36 * 128 + 64;
							local40 = local40 * 128 + 64;
							@Pc(661) Class1_Sub1_Sub1 local661 = new Class1_Sub1_Sub1(local110 + anInt239, this.method159(local33, local26, this.anInt172) - local54, local114, local578 + anInt239, this.anInt172, local44, local112, local33, this.anInt250, local49, local26, local575);
							local661.method19(local36, this.method159(local40, local36, this.anInt172) - local575, local40, local578 + anInt239);
							this.aClass28_4.method445(local661);
						}
					} else if (arg1 == 195) {
						local17 = arg2.method383();
						local26 = this.anInt158 + (local17 >> 4 & 0x7);
						local33 = this.anInt159 + (local17 & 0x7);
						local36 = arg2.method385();
						local40 = arg2.method383();
						local44 = arg2.method385();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
							local26 = local26 * 128 + 64;
							local33 = local33 * 128 + 64;
							@Pc(757) Class1_Sub1_Sub2 local757 = new Class1_Sub1_Sub2(local36, local44, this.anInt172, local33, local26, 7, anInt239, this.method159(local33, local26, this.anInt172) - local40);
							this.aClass28_2.method445(local757);
						}
					} else if (arg1 == 127) {
						local17 = arg2.method383();
						local26 = this.anInt158 + (local17 >> 4 & 0x7);
						local33 = this.anInt159 + (local17 & 0x7);
						local36 = arg2.method385();
						local40 = arg2.method385();
						local44 = arg2.method385();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local44 != this.anInt255) {
							@Pc(811) Class1_Sub7 local811 = new Class1_Sub7();
							local811.anInt780 = local36;
							local811.anInt781 = local40;
							if (this.aClass28ArrayArrayArray1[this.anInt172][local26][local33] == null) {
								this.aClass28ArrayArrayArray1[this.anInt172][local26][local33] = new Class28(2);
							}
							this.aClass28ArrayArrayArray1[this.anInt172][local26][local33].method445(local811);
							this.method171(local26, local33);
						}
					} else {
						if (arg1 == 25) {
							local17 = arg2.method383();
							local26 = this.anInt158 + (local17 >> 4 & 0x7);
							local33 = this.anInt159 + (local17 & 0x7);
							local36 = arg2.method383();
							local40 = local36 >> 2;
							local44 = local36 & 0x3;
							local49 = this.anIntArray48[local40];
							local54 = arg2.method385();
							local575 = arg2.method385();
							local578 = arg2.method385();
							local110 = arg2.method385();
							@Pc(909) byte local909 = arg2.method384();
							@Pc(912) byte local912 = arg2.method384();
							@Pc(915) byte local915 = arg2.method384();
							@Pc(918) byte local918 = arg2.method384();
							@Pc(925) Class1_Sub1_Sub3_Sub2 local925;
							if (local110 == this.anInt255) {
								local925 = this.aClass1_Sub1_Sub3_Sub2_1;
							} else {
								local925 = this.aClass1_Sub1_Sub3_Sub2Array1[local110];
							}
							if (local925 != null) {
								@Pc(950) Class1_Sub5 local950 = new Class1_Sub5(local44, this.anInt172, local40, local575 + anInt239, local49, -1, local33, local26, 478);
								this.aClass28_5.method445(local950);
								@Pc(970) Class1_Sub5 local970 = new Class1_Sub5(local44, this.anInt172, local40, local578 + anInt239, local49, local54, local33, local26, 478);
								this.aClass28_5.method445(local970);
								@Pc(984) int local984 = this.anIntArrayArrayArray3[this.anInt172][local26][local33];
								@Pc(996) int local996 = this.anIntArrayArrayArray3[this.anInt172][local26 + 1][local33];
								@Pc(1010) int local1010 = this.anIntArrayArrayArray3[this.anInt172][local26 + 1][local33 + 1];
								@Pc(1022) int local1022 = this.anIntArrayArrayArray3[this.anInt172][local26][local33 + 1];
								@Pc(1025) Class2 local1025 = Class2.method23(local54);
								local925.anInt948 = local575 + anInt239;
								local925.anInt949 = local578 + anInt239;
								local925.aClass1_Sub3_Sub1_11 = local1025.method26(local40, local44, local984, local996, local1010, local1022, -1);
								@Pc(1049) int local1049 = local1025.anInt40;
								@Pc(1052) int local1052 = local1025.anInt41;
								if (local44 == 1 || local44 == 3) {
									local1049 = local1025.anInt41;
									local1052 = local1025.anInt40;
								}
								local925.anInt950 = local26 * 128 + local1049 * 64;
								local925.anInt952 = local33 * 128 + local1052 * 64;
								local925.anInt951 = this.method159(local925.anInt952, local925.anInt950, this.anInt172);
								@Pc(1098) byte local1098;
								if (local909 > local915) {
									local1098 = local909;
									local909 = local915;
									local915 = local1098;
								}
								if (local912 > local918) {
									local1098 = local912;
									local912 = local918;
									local918 = local1098;
								}
								local925.anInt953 = local26 + local909;
								local925.anInt955 = local26 + local915;
								local925.anInt954 = local33 + local912;
								local925.anInt956 = local33 + local918;
							}
						}
						if (arg1 == 117) {
							local17 = arg2.method383();
							local26 = this.anInt158 + (local17 >> 4 & 0x7);
							local33 = this.anInt159 + (local17 & 0x7);
							local36 = arg2.method385();
							local40 = arg2.method385();
							local44 = arg2.method385();
							if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
								@Pc(1182) Class28 local1182 = this.aClass28ArrayArrayArray1[this.anInt172][local26][local33];
								if (local1182 != null) {
									for (@Pc(1188) Class1_Sub7 local1188 = (Class1_Sub7) local1182.method448(); local1188 != null; local1188 = (Class1_Sub7) local1182.method450()) {
										if (local1188.anInt780 == (local36 & 0x7FFF) && local1188.anInt781 == local40) {
											local1188.anInt781 = local44;
											break;
										}
									}
									this.method171(local26, local33);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1218) RuntimeException local1218) {
			signlink.reporterror("33352, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!hc;)Z")
	private boolean method108(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt475;
			if (local11 == 201) {
				this.aBoolean60 = true;
				this.aBoolean57 = false;
				this.aBoolean62 = true;
				this.aString13 = "";
				this.anInt210 = 1;
				this.aString14 = "Enter name of friend to add to list";
			}
			if (local11 == 202) {
				this.aBoolean60 = true;
				this.aBoolean57 = false;
				this.aBoolean62 = true;
				this.aString13 = "";
				this.anInt210 = 2;
				this.aString14 = "Enter name of friend to delete from list";
			}
			if (local11 == 205) {
				this.anInt285 = 250;
				return true;
			}
			if (local11 == 501) {
				this.aBoolean60 = true;
				this.aBoolean57 = false;
				this.aBoolean62 = true;
				this.aString13 = "";
				this.anInt210 = 4;
				this.aString14 = "Enter name of player to add to list";
			}
			if (local11 == 502) {
				this.aBoolean60 = true;
				this.aBoolean57 = false;
				this.aBoolean62 = true;
				this.aString13 = "";
				this.anInt210 = 5;
				this.aString14 = "Enter name of player to delete from list";
			}
			@Pc(115) int local115;
			@Pc(119) int local119;
			@Pc(124) int local124;
			if (local11 >= 300 && local11 <= 313) {
				local115 = (local11 - 300) / 2;
				local119 = local11 & 0x1;
				local124 = this.anIntArray83[local115];
				if (local124 != -1) {
					while (true) {
						if (local119 == 0) {
							local124--;
							if (local124 < 0) {
								local124 = Class13.anInt436 - 1;
							}
						}
						if (local119 == 1) {
							local124++;
							if (local124 >= Class13.anInt436) {
								local124 = 0;
							}
						}
						if (!Class13.aClass13Array1[local124].aBoolean98 && Class13.aClass13Array1[local124].anInt437 == local115 + (this.aBoolean49 ? 0 : 7)) {
							this.anIntArray83[local115] = local124;
							this.aBoolean42 = true;
							break;
						}
					}
				}
			}
			if (local11 >= 314 && local11 <= 323) {
				local115 = (local11 - 314) / 2;
				local119 = local11 & 0x1;
				local124 = this.anIntArray35[local115];
				if (local119 == 0) {
					local124--;
					if (local124 < 0) {
						local124 = anIntArrayArray5[local115].length - 1;
					}
				}
				if (local119 == 1) {
					local124++;
					if (local124 >= anIntArrayArray5[local115].length) {
						local124 = 0;
					}
				}
				this.anIntArray35[local115] = local124;
				this.aBoolean42 = true;
			}
			if (local11 == 324 && !this.aBoolean49) {
				this.aBoolean49 = true;
				this.method144();
			}
			if (local11 == 325 && this.aBoolean49) {
				this.aBoolean49 = false;
				this.method144();
			}
			if (local11 == 326) {
				this.aClass1_Sub3_Sub3_6.method372(239);
				this.aClass1_Sub3_Sub3_6.method373(this.aBoolean49 ? 0 : 1);
				for (local115 = 0; local115 < 7; local115++) {
					this.aClass1_Sub3_Sub3_6.method373(this.anIntArray83[local115]);
				}
				for (local119 = 0; local119 < 5; local119++) {
					this.aClass1_Sub3_Sub3_6.method373(this.anIntArray35[local119]);
				}
				return true;
			}
			if (local11 == 613) {
				this.aBoolean66 = !this.aBoolean66;
			}
			if (local11 >= 601 && local11 <= 612) {
				this.method110();
				if (this.aString8.length() > 0) {
					this.aClass1_Sub3_Sub3_6.method372(252);
					this.aClass1_Sub3_Sub3_6.method379(Class40.method530(this.aString8));
					this.aClass1_Sub3_Sub3_6.method373(local11 - 601);
					this.aClass1_Sub3_Sub3_6.method373(this.aBoolean66 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("27647, " + -69 + ", " + arg0 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method109() {
		try {
			if (this.anInt252 >= 2 || this.anInt230 != 0 || this.anInt317 != 0) {
				@Pc(40) String local40;
				if (this.anInt230 == 1 && this.anInt252 < 2) {
					local40 = "Use " + this.aString9 + " with...";
				} else if (this.anInt317 == 1 && this.anInt252 < 2) {
					local40 = this.aString16 + "...";
				} else {
					local40 = this.aStringArray8[this.anInt252 - 1];
				}
				if (this.anInt252 > 2) {
					local40 = local40 + "@whi@ / " + (this.anInt252 - 2) + " more options";
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method363(4, 16777215, 15, local40, true);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("84283, " + 7 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method110() {
		try {
			this.aClass1_Sub3_Sub3_6.method372(153);
			if (this.anInt289 != -1) {
				this.anInt289 = -1;
				this.aBoolean69 = true;
				this.aBoolean63 = false;
				this.aBoolean47 = true;
			}
			if (this.anInt288 != -1) {
				this.anInt288 = -1;
				this.aBoolean60 = true;
				this.aBoolean63 = false;
			}
			this.anInt286 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("2968, " + 3 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method112(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt141; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt141--;
						this.aBoolean69 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt141; local28++) {
							this.aStringArray9[local28] = this.aStringArray9[local28 + 1];
							this.anIntArray64[local28] = this.anIntArray64[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub3_Sub3_6.method372(210);
						this.aClass1_Sub3_Sub3_6.method379(arg0);
						break;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("19206, " + -160 + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;B)V")
	private void method114(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt188; local7++) {
				@Pc(14) int local14 = this.anIntArray46[local7];
				@Pc(19) Class1_Sub1_Sub3_Sub2 local19 = this.aClass1_Sub1_Sub3_Sub2Array1[local14];
				@Pc(22) int local22 = arg1.method383();
				if ((local22 & 0x80) == 128) {
					local22 += arg1.method383() << 8;
				}
				this.method98(local14, local22, arg1, local19);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("21486, " + arg0 + ", " + arg1 + ", " + 76 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) int local8 = this.aClass33_1.method486(arg1, arg0, arg2);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass33_1.method490(arg1, arg0, arg2, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = 15658734;
				if (local8 > 0) {
					local30 = 15597568;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148;
				local52 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class2 local61 = Class2.method23(local58);
				if (local61.anInt45 == -1) {
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
					@Pc(71) Class1_Sub3_Sub2_Sub3 local71 = this.aClass1_Sub3_Sub2_Sub3Array1[local61.anInt45];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt40 * 4 - local71.anInt516) / 2;
						@Pc(93) int local93 = (local61.anInt41 * 4 - local71.anInt517) / 2;
						local71.method346(arg0 * 4 + local83 + 48, (104 - arg2 - local61.anInt41) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass33_1.method488(arg1, arg0, arg2);
			if (local8 != 0) {
				local18 = this.aClass33_1.method490(arg1, arg0, arg2, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class2 local447 = Class2.method23(local30);
				@Pc(479) int local479;
				if (local447.anInt45 != -1) {
					@Pc(457) Class1_Sub3_Sub2_Sub3 local457 = this.aClass1_Sub3_Sub2_Sub3Array1[local447.anInt45];
					if (local457 != null) {
						local58 = (local447.anInt40 * 4 - local457.anInt516) / 2;
						local479 = (local447.anInt41 * 4 - local457.anInt517) / 2;
						local457.method346(arg0 * 4 + local58 + 48, (104 - arg2 - local447.anInt41) * 4 + 48 + local479);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148;
					local479 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
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
			local8 = this.aClass33_1.method489(arg1, arg0, arg2);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(621) Class2 local621 = Class2.method23(local18);
				if (local621.anInt45 != -1) {
					@Pc(631) Class1_Sub3_Sub2_Sub3 local631 = this.aClass1_Sub3_Sub2_Sub3Array1[local621.anInt45];
					if (local631 != null) {
						local30 = (local621.anInt40 * 4 - local631.anInt516) / 2;
						@Pc(653) int local653 = (local621.anInt41 * 4 - local631.anInt517) / 2;
						local631.method346(arg0 * 4 + local30 + 48, (104 - arg2 - local621.anInt41) * 4 + 48 + local653);
						return;
					}
				}
			}
		} catch (@Pc(677) RuntimeException local677) {
			signlink.reporterror("68910, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local677.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method68() {
		try {
			if (this.aByte25 != 123) {
				this.aClass1_Sub3_Sub3_6.method373(214);
			}
			if (!this.aBoolean70 && !this.aBoolean67 && !this.aBoolean73) {
				anInt239++;
				if (this.aBoolean37) {
					this.method187();
				} else {
					this.method152();
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("47500, " + 123 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;IIII)V")
	private void method116(@OriginalArg(0) Class1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt328 > 4 || this.anInt328 < 4) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			if (arg0 != this.aClass1_Sub1_Sub3_Sub2_1 && this.anInt252 < 400) {
				@Pc(49) String local49 = arg0.aString30 + method111(arg0.anInt946, this.aClass1_Sub1_Sub3_Sub2_1.anInt946) + " (level-" + arg0.anInt946 + ")";
				if (this.anInt230 == 1) {
					this.aStringArray8[this.anInt252] = "Use " + this.aString9 + " with @whi@" + local49;
					this.anIntArray52[this.anInt252] = 103;
					this.anIntArray53[this.anInt252] = arg3;
					this.anIntArray50[this.anInt252] = arg1;
					this.anIntArray51[this.anInt252] = arg2;
					this.anInt252++;
				} else if (this.anInt317 != 1) {
					this.aStringArray8[this.anInt252] = "Follow @whi@" + local49;
					this.anIntArray52[this.anInt252] = 1741;
					this.anIntArray53[this.anInt252] = arg3;
					this.anIntArray50[this.anInt252] = arg1;
					this.anIntArray51[this.anInt252] = arg2;
					this.anInt252++;
					if (this.anInt229 == 0) {
						this.aStringArray8[this.anInt252] = "Trade with @whi@" + local49;
						this.anIntArray52[this.anInt252] = 1528;
						this.anIntArray53[this.anInt252] = arg3;
						this.anIntArray50[this.anInt252] = arg1;
						this.anIntArray51[this.anInt252] = arg2;
						this.anInt252++;
					}
					if (this.anInt257 > 0) {
						this.aStringArray8[this.anInt252] = "Attack @whi@" + local49;
						if (this.aClass1_Sub1_Sub3_Sub2_1.anInt946 >= arg0.anInt946) {
							this.anIntArray52[this.anInt252] = 593;
						} else {
							this.anIntArray52[this.anInt252] = 2593;
						}
						this.anIntArray53[this.anInt252] = arg3;
						this.anIntArray50[this.anInt252] = arg1;
						this.anIntArray51[this.anInt252] = arg2;
						this.anInt252++;
					}
					if (this.anInt335 == 1) {
						this.aStringArray8[this.anInt252] = "Fight @whi@" + local49;
						this.anIntArray52[this.anInt252] = 593;
						this.anIntArray53[this.anInt252] = arg3;
						this.anIntArray50[this.anInt252] = arg1;
						this.anIntArray51[this.anInt252] = arg2;
						this.anInt252++;
					}
					if (this.anInt335 == 2) {
						this.aStringArray8[this.anInt252] = "Duel-with @whi@" + local49;
						this.anIntArray52[this.anInt252] = 1596;
						this.anIntArray53[this.anInt252] = arg3;
						this.anIntArray50[this.anInt252] = arg1;
						this.anIntArray51[this.anInt252] = arg2;
						this.anInt252++;
					}
				} else if ((this.anInt319 & 0x8) == 8) {
					this.aStringArray8[this.anInt252] = this.aString16 + " @whi@" + local49;
					this.anIntArray52[this.anInt252] = 48;
					this.anIntArray53[this.anInt252] = arg3;
					this.anIntArray50[this.anInt252] = arg1;
					this.anIntArray51[this.anInt252] = arg2;
					this.anInt252++;
				}
				for (@Pc(400) int local400 = 0; local400 < this.anInt252; local400++) {
					if (this.anIntArray52[local400] == 981) {
						this.aStringArray8[local400] = "Walk here @whi@" + local49;
						return;
					}
				}
			}
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("9664, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ib;)V")
	private void method117(@OriginalArg(1) Class1_Sub3_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray55.length; local5++) {
				this.anIntArray55[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray55[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local30 = 0; local30 < 20; local30++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray56[local67] = (this.anIntArray55[local67 - 1] + this.anIntArray55[local67 + 1] + this.anIntArray55[local67 - 128] + this.anIntArray55[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray55;
				this.anIntArray55 = this.anIntArray56;
				this.anIntArray56 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt517; local59++) {
					for (local67 = 0; local67 < arg0.anInt516; local67++) {
						if (arg0.aByteArray6[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt518 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt519 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray55[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("45537, " + 8 + ", " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg2 != null) {
				@Pc(5) Object local5 = this.anObject1;
				synchronized (this.anObject1) {
					this.aString4 = arg2;
					this.anInt216 = arg1;
					this.anInt294 = arg0;
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("78793, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 801 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!kb;I)V")
	private void method119(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			arg1.method393();
			@Pc(16) int local16 = arg1.method394(8);
			@Pc(22) int local22;
			if (local16 < this.anInt234) {
				for (local22 = local16; local22 < this.anInt234; local22++) {
					this.anIntArray65[this.anInt251++] = this.anIntArray62[local22];
				}
			}
			if (local16 > this.anInt234) {
				signlink.reporterror(this.aString17 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt234 = 0;
			for (local22 = 0; local22 < local16; local22++) {
				@Pc(74) int local74 = this.anIntArray62[local22];
				@Pc(79) Class1_Sub1_Sub3_Sub1 local79 = this.aClass1_Sub1_Sub3_Sub1Array1[local74];
				@Pc(84) int local84 = arg1.method394(1);
				if (local84 == 0) {
					this.anIntArray62[this.anInt234++] = local74;
					local79.anInt938 = anInt239;
				} else {
					@Pc(107) int local107 = arg1.method394(2);
					if (local107 == 0) {
						this.anIntArray62[this.anInt234++] = local74;
						local79.anInt938 = anInt239;
						this.anIntArray46[this.anInt188++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(168) int local168;
						if (local107 == 1) {
							this.anIntArray62[this.anInt234++] = local74;
							local79.anInt938 = anInt239;
							local158 = arg1.method394(3);
							local79.method562(local158, false);
							local168 = arg1.method394(1);
							if (local168 == 1) {
								this.anIntArray46[this.anInt188++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray62[this.anInt234++] = local74;
							local79.anInt938 = anInt239;
							local158 = arg1.method394(3);
							local79.method562(local158, true);
							local168 = arg1.method394(3);
							local79.method562(local168, true);
							@Pc(226) int local226 = arg1.method394(1);
							if (local226 == 1) {
								this.anIntArray46[this.anInt188++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray65[this.anInt251++] = local74;
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("58136, " + arg0 + ", " + arg1 + ", " + -37941 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;ZIII)V")
	private void method121(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0.anInt473 == 0 && arg0.anIntArray153 != null && (!arg0.aBoolean104 || this.anInt256 == arg0.anInt471 || this.anInt217 == arg0.anInt471 || this.anInt226 == arg0.anInt471)) {
				@Pc(29) int local29 = Class1_Sub3_Sub2.anInt536;
				@Pc(31) int local31 = Class1_Sub3_Sub2.anInt534;
				@Pc(33) int local33 = Class1_Sub3_Sub2.anInt537;
				@Pc(35) int local35 = Class1_Sub3_Sub2.anInt535;
				Class1_Sub3_Sub2.method352(arg1 + arg0.anInt477, this.anInt334, arg3, arg1, arg3 + arg0.anInt476);
				@Pc(59) int local59 = arg0.anIntArray153.length;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(70) int local70 = arg0.anIntArray154[local61] + arg3;
					@Pc(79) int local79 = arg0.anIntArray155[local61] + arg1 - arg2;
					@Pc(86) Class15 local86 = Class15.aClass15Array1[arg0.anIntArray153[local61]];
					@Pc(91) int local91 = local70 + local86.anInt478;
					@Pc(96) int local96 = local79 + local86.anInt479;
					if (local86.anInt475 > 0) {
						this.method127(local86);
					}
					if (local86.anInt473 == 0) {
						if (local86.anInt482 > local86.anInt481 - local86.anInt477) {
							local86.anInt482 = local86.anInt481 - local86.anInt477;
						}
						if (local86.anInt482 < 0) {
							local86.anInt482 = 0;
						}
						this.method121(local86, local96, local86.anInt482, local91);
						if (local86.anInt481 > local86.anInt477) {
							this.method143(local86.anInt477, local96, local86.anInt482, local91 + local86.anInt476, local86.anInt481);
						}
					} else if (local86.anInt473 != 1) {
						@Pc(168) int local168;
						@Pc(172) int local172;
						@Pc(183) int local183;
						@Pc(218) int local218;
						@Pc(225) int local225;
						@Pc(166) int local166;
						@Pc(192) int local192;
						@Pc(216) int local216;
						if (local86.anInt473 == 2) {
							local166 = 0;
							for (local168 = 0; local168 < local86.anInt477; local168++) {
								for (local172 = 0; local172 < local86.anInt476; local172++) {
									local183 = local91 + local172 * (local86.anInt484 + 32);
									local192 = local96 + local168 * (local86.anInt485 + 32);
									if (local166 < 20) {
										local183 += local86.anIntArray156[local166];
										local192 += local86.anIntArray157[local166];
									}
									if (local86.anIntArray149[local166] > 0) {
										local216 = 0;
										local218 = 0;
										local225 = local86.anIntArray149[local166] - 1;
										@Pc(233) Class1_Sub3_Sub2_Sub2 local233 = Class5.method59(local225, local86.anIntArray150[local166], 763);
										if (this.anInt221 != 0 && this.anInt220 == local166 && this.anInt219 == local86.anInt471) {
											local216 = super.anInt130 - this.anInt222;
											local218 = super.anInt131 - this.anInt223;
											if (local216 < 5 && local216 > -5) {
												local216 = 0;
											}
											if (local218 < 5 && local218 > -5) {
												local218 = 0;
											}
											if (this.anInt156 < 5) {
												local216 = 0;
												local218 = 0;
											}
											local233.method323(local192 + local218, local183 + local216);
										} else if (this.anInt293 != 0 && this.anInt292 == local166 && this.anInt291 == local86.anInt471) {
											local233.method323(local192, local183);
										} else {
											local233.method319(local183, local192);
										}
										if (local233.anInt465 == 33 || local86.anIntArray150[local166] != 1) {
											@Pc(333) int local333 = local86.anIntArray150[local166];
											this.aClass1_Sub3_Sub2_Sub4_1.method361(local183 + local216 + 1, 0, method160(309, local333), local192 + local218 + 10);
											this.aClass1_Sub3_Sub2_Sub4_1.method361(local183 + local216, 16776960, method160(309, local333), local192 + local218 + 9);
										}
									} else if (local86.aClass1_Sub3_Sub2_Sub2Array8 != null && local166 < 20) {
										@Pc(380) Class1_Sub3_Sub2_Sub2 local380 = local86.aClass1_Sub3_Sub2_Sub2Array8[local166];
										if (local380 != null) {
											local380.method319(local183, local192);
										}
									}
									local166++;
								}
							}
						} else if (local86.anInt473 != 3) {
							@Pc(438) Class1_Sub3_Sub2_Sub4 local438;
							if (local86.anInt473 == 4) {
								local438 = local86.aClass1_Sub3_Sub2_Sub4_5;
								local168 = local86.anInt486;
								@Pc(444) String local444 = local86.aString20;
								if ((this.anInt226 == local86.anInt471 || this.anInt217 == local86.anInt471 || this.anInt256 == local86.anInt471) && local86.anInt488 != 0) {
									local168 = local86.anInt488;
								}
								if (this.method149(local86)) {
									local168 = local86.anInt487;
									if (local86.aString21.length() > 0) {
										local444 = local86.aString21;
									}
								}
								if (local86.anInt474 == 6 && this.aBoolean63) {
									local444 = "Please wait...";
									local168 = local86.anInt486;
								}
								local192 = local96 + local438.anInt543;
								while (local444.length() > 0) {
									if (local444.indexOf("%") != -1) {
										label244: while (true) {
											local216 = local444.indexOf("%1");
											if (local216 == -1) {
												while (true) {
													local216 = local444.indexOf("%2");
													if (local216 == -1) {
														while (true) {
															local216 = local444.indexOf("%3");
															if (local216 == -1) {
																while (true) {
																	local216 = local444.indexOf("%4");
																	if (local216 == -1) {
																		while (true) {
																			local216 = local444.indexOf("%5");
																			if (local216 == -1) {
																				break label244;
																			}
																			local444 = local444.substring(0, local216) + this.method126(this.method79(local86, 4)) + local444.substring(local216 + 2);
																		}
																	}
																	local444 = local444.substring(0, local216) + this.method126(this.method79(local86, 3)) + local444.substring(local216 + 2);
																}
															}
															local444 = local444.substring(0, local216) + this.method126(this.method79(local86, 2)) + local444.substring(local216 + 2);
														}
													}
													local444 = local444.substring(0, local216) + this.method126(this.method79(local86, 1)) + local444.substring(local216 + 2);
												}
											}
											local444 = local444.substring(0, local216) + this.method126(this.method79(local86, 0)) + local444.substring(local216 + 2);
										}
									}
									local216 = local444.indexOf("\\n");
									@Pc(686) String local686;
									if (local216 == -1) {
										local686 = local444;
										local444 = "";
									} else {
										local686 = local444.substring(0, local216);
										local444 = local444.substring(local216 + 2);
									}
									if (local86.aBoolean110) {
										local438.method359(local192, local686, local86.aBoolean111, local168, local91 + local86.anInt476 / 2);
									} else {
										local438.method363(local91, local168, local192, local686, local86.aBoolean111);
									}
									local192 += local438.anInt543;
								}
							} else if (local86.anInt473 == 5) {
								@Pc(748) Class1_Sub3_Sub2_Sub2 local748;
								if (this.method149(local86)) {
									local748 = local86.aClass1_Sub3_Sub2_Sub2_13;
								} else {
									local748 = local86.aClass1_Sub3_Sub2_Sub2_12;
								}
								if (local748 != null) {
									local748.method319(local91, local96);
								}
							} else if (local86.anInt473 == 6) {
								local166 = Class1_Sub3_Sub2_Sub1.anInt430;
								local168 = Class1_Sub3_Sub2_Sub1.anInt431;
								Class1_Sub3_Sub2_Sub1.anInt430 = local91 + local86.anInt476 / 2;
								Class1_Sub3_Sub2_Sub1.anInt431 = local96 + local86.anInt477 / 2;
								local172 = Class1_Sub3_Sub2_Sub1.anIntArray137[local86.anInt492] * local86.anInt491 >> 16;
								local183 = Class1_Sub3_Sub2_Sub1.anIntArray138[local86.anInt492] * local86.anInt491 >> 16;
								@Pc(809) boolean local809 = this.method149(local86);
								if (local809) {
									local216 = local86.anInt490;
								} else {
									local216 = local86.anInt489;
								}
								@Pc(828) Class1_Sub3_Sub1 local828;
								if (local216 == -1) {
									local828 = local86.method329(-1, -1, local809);
								} else {
									@Pc(834) Class19 local834 = Class19.aClass19Array1[local216];
									local828 = local86.method329(local834.anIntArray186[local86.anInt469], local834.anIntArray187[local86.anInt469], local809);
								}
								if (local828 != null) {
									local828.method242(local86.anInt493, 0, local86.anInt492, 0, local172, local183);
								}
								Class1_Sub3_Sub2_Sub1.anInt430 = local166;
								Class1_Sub3_Sub2_Sub1.anInt431 = local168;
							} else if (local86.anInt473 == 7) {
								local438 = local86.aClass1_Sub3_Sub2_Sub4_5;
								local168 = 0;
								for (local172 = 0; local172 < local86.anInt477; local172++) {
									for (local183 = 0; local183 < local86.anInt476; local183++) {
										if (local86.anIntArray149[local168] > 0) {
											@Pc(897) Class5 local897 = Class5.method54(local86.anIntArray149[local168] - 1);
											@Pc(900) String local900 = local897.aString3;
											if (local897.aBoolean31 || local86.anIntArray150[local168] != 1) {
												local900 = local900 + " x" + method120(local86.anIntArray150[local168]);
											}
											local218 = local91 + local183 * (local86.anInt484 + 115);
											local225 = local96 + local172 * (local86.anInt485 + 12);
											if (local86.aBoolean110) {
												local438.method359(local225, local900, local86.aBoolean111, local86.anInt486, local218 + local86.anInt476 / 2);
											} else {
												local438.method363(local218, local86.anInt486, local225, local900, local86.aBoolean111);
											}
										}
										local168++;
									}
								}
							}
						} else if (local86.aBoolean109) {
							Class1_Sub3_Sub2.method354(local86.anInt486, local91, local96, local86.anInt476, local86.anInt477);
						} else {
							Class1_Sub3_Sub2.method355(local86.anInt486, aBoolean65, local91, local96, local86.anInt477, local86.anInt476);
						}
					}
				}
				Class1_Sub3_Sub2.method352(local35, this.anInt334, local29, local31, local33);
			}
		} catch (@Pc(997) RuntimeException local997) {
			signlink.reporterror("72914, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local997.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)Ljava/lang/String;")
	private String method122() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("74985, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method123() {
		try {
			this.anInt162 = 0;
			@Pc(64) int local64;
			@Pc(84) int local84;
			for (@Pc(16) int local16 = -1; local16 < this.anInt187 + this.anInt234; local16++) {
				@Pc(24) Class1_Sub1_Sub3 local24;
				if (local16 == -1) {
					local24 = this.aClass1_Sub1_Sub3_Sub2_1;
				} else if (local16 < this.anInt187) {
					local24 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray45[local16]];
				} else {
					local24 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray62[local16 - this.anInt187]];
				}
				if (local24 != null && local24.method563()) {
					if (local16 < this.anInt187) {
						local64 = 30;
						@Pc(67) Class1_Sub1_Sub3_Sub2 local67 = (Class1_Sub1_Sub3_Sub2) local24;
						if (local67.anInt945 != 0) {
							this.method139(local24.anInt939 + 15, local24);
							if (this.anInt197 > -1) {
								for (local84 = 0; local84 < 8; local84++) {
									if ((local67.anInt945 & 0x1 << local84) != 0) {
										this.aClass1_Sub3_Sub2_Sub2Array4[local84].method319(this.anInt197 - 12, this.anInt198 - local64);
										local64 -= 25;
									}
								}
							}
						}
						if (local16 >= 0 && this.anInt263 == 10 && this.anInt295 == this.anIntArray45[local16]) {
							this.method139(local24.anInt939 + 15, local24);
							if (this.anInt197 > -1) {
								this.aClass1_Sub3_Sub2_Sub2Array4[7].method319(this.anInt197 - 12, this.anInt198 - local64);
							}
						}
					} else if (this.anInt263 == 1 && this.anInt175 == this.anIntArray62[local16 - this.anInt187] && anInt239 % 20 < 10) {
						this.method139(local24.anInt939 + 15, local24);
						if (this.anInt197 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array4[2].method319(this.anInt197 - 12, this.anInt198 - 28);
						}
					}
					if (local24.aString29 != null && (local16 >= this.anInt187 || this.anInt330 == 0 || this.anInt330 == 3 || this.anInt330 == 1 && this.method176(((Class1_Sub1_Sub3_Sub2) local24).aString30, this.anInt181))) {
						this.method139(local24.anInt939, local24);
						if (this.anInt197 > -1 && this.anInt162 < this.anInt163) {
							this.anIntArray39[this.anInt162] = this.aClass1_Sub3_Sub2_Sub4_3.method360(local24.aString29) / 2;
							this.anIntArray38[this.anInt162] = this.aClass1_Sub3_Sub2_Sub4_3.anInt543;
							this.anIntArray36[this.anInt162] = this.anInt197;
							this.anIntArray37[this.anInt162] = this.anInt198;
							this.anIntArray40[this.anInt162] = local24.anInt908;
							this.anIntArray41[this.anInt162] = local24.anInt909;
							this.anIntArray42[this.anInt162] = local24.anInt907;
							this.aStringArray5[this.anInt162++] = local24.aString29;
							if (this.anInt182 == 0 && local24.anInt909 == 1) {
								this.anIntArray38[this.anInt162] += 10;
								this.anIntArray37[this.anInt162] += 5;
							}
							if (this.anInt182 == 0 && local24.anInt909 == 2) {
								this.anIntArray39[this.anInt162] = 60;
							}
						}
					}
					if (local24.anInt912 > anInt239 + 100) {
						this.method139(local24.anInt939 + 15, local24);
						if (this.anInt197 > -1) {
							local64 = local24.anInt913 * 30 / local24.anInt914;
							if (local64 > 30) {
								local64 = 30;
							}
							Class1_Sub3_Sub2.method354(65280, this.anInt197 - 15, this.anInt198 - 3, local64, 5);
							Class1_Sub3_Sub2.method354(16711680, this.anInt197 + local64 - 15, this.anInt198 - 3, 30 - local64, 5);
						}
					}
					if (local24.anInt912 > anInt239 + 330) {
						this.method139(local24.anInt939 / 2, local24);
						if (this.anInt197 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array5[local24.anInt911].method319(this.anInt197 - 12, this.anInt198 - 12);
							this.aClass1_Sub3_Sub2_Sub4_1.method358(this.anInt197, this.anInt198 + 4, String.valueOf(local24.anInt910), 0);
							this.aClass1_Sub3_Sub2_Sub4_1.method358(this.anInt197 - 1, this.anInt198 + 3, String.valueOf(local24.anInt910), 16777215);
						}
					}
				}
			}
			for (@Pc(479) int local479 = 0; local479 < this.anInt162; local479++) {
				local64 = this.anIntArray36[local479];
				@Pc(491) int local491 = this.anIntArray37[local479];
				local84 = this.anIntArray39[local479];
				@Pc(501) int local501 = this.anIntArray38[local479];
				@Pc(503) boolean local503 = true;
				while (local503) {
					local503 = false;
					for (@Pc(509) int local509 = 0; local509 < local479; local509++) {
						if (local491 + 2 > this.anIntArray37[local509] - this.anIntArray38[local509] && local491 - local501 < this.anIntArray37[local509] + 2 && local64 - local84 < this.anIntArray36[local509] + this.anIntArray39[local509] && local64 + local84 > this.anIntArray36[local509] - this.anIntArray39[local509] && this.anIntArray37[local509] - this.anIntArray38[local509] < local491) {
							local491 = this.anIntArray37[local509] - this.anIntArray38[local509];
							local503 = true;
						}
					}
				}
				this.anInt197 = this.anIntArray36[local479];
				this.anInt198 = this.anIntArray37[local479] = local491;
				@Pc(608) String local608 = this.aStringArray5[local479];
				if (this.anInt182 == 0) {
					@Pc(613) int local613 = 16776960;
					if (this.anIntArray40[local479] < 6) {
						local613 = this.anIntArray69[this.anIntArray40[local479]];
					}
					if (this.anIntArray40[local479] == 6) {
						local613 = this.anInt258 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray40[local479] == 7) {
						local613 = this.anInt258 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray40[local479] == 8) {
						local613 = this.anInt258 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(688) int local688;
					if (this.anIntArray40[local479] == 9) {
						local688 = 150 - this.anIntArray42[local479];
						if (local688 < 50) {
							local613 = local688 * 1280 + 16711680;
						} else if (local688 < 100) {
							local613 = 16776960 - (local688 - 50) * 327680;
						} else if (local688 < 150) {
							local613 = (local688 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray40[local479] == 10) {
						local688 = 150 - this.anIntArray42[local479];
						if (local688 < 50) {
							local613 = local688 * 5 + 16711680;
						} else if (local688 < 100) {
							local613 = 16711935 - (local688 - 50) * 327680;
						} else if (local688 < 150) {
							local613 = (local688 - 100) * 327680 + 255 - (local688 - 100) * 5;
						}
					}
					if (this.anIntArray40[local479] == 11) {
						local688 = 150 - this.anIntArray42[local479];
						if (local688 < 50) {
							local613 = 16777215 - local688 * 327685;
						} else if (local688 < 100) {
							local613 = (local688 - 50) * 327685 + 65280;
						} else if (local688 < 150) {
							local613 = 16777215 - (local688 - 100) * 327680;
						}
					}
					if (this.anIntArray41[local479] == 0) {
						this.aClass1_Sub3_Sub2_Sub4_3.method358(this.anInt197, this.anInt198 + 1, local608, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method358(this.anInt197, this.anInt198, local608, local613);
					}
					if (this.anIntArray41[local479] == 1) {
						this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt197, this.anInt198 + 1, local608, this.anInt258, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt197, this.anInt198, local608, this.anInt258, local613);
					}
					if (this.anIntArray41[local479] == 2) {
						local688 = this.aClass1_Sub3_Sub2_Sub4_3.method360(local608);
						@Pc(909) int local909 = (150 - this.anIntArray42[local479]) * (local688 + 100) / 150;
						Class1_Sub3_Sub2.method352(334, this.anInt334, this.anInt197 - 50, 0, this.anInt197 + 50);
						this.aClass1_Sub3_Sub2_Sub4_3.method361(this.anInt197 + 50 - local909, 0, local608, this.anInt198 + 1);
						this.aClass1_Sub3_Sub2_Sub4_3.method361(this.anInt197 + 50 - local909, local613, local608, this.anInt198);
						Class1_Sub3_Sub2.method351();
					}
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method358(this.anInt197, this.anInt198 + 1, local608, 0);
					this.aClass1_Sub3_Sub2_Sub4_3.method358(this.anInt197, this.anInt198, local608, 16776960);
				}
			}
		} catch (@Pc(985) RuntimeException local985) {
			signlink.reporterror("76259, " + true + ", " + local985.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method124() {
		try {
			this.aClass32_3.method455();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray74;
			this.aClass1_Sub3_Sub2_Sub3_18.method346(0, 0);
			if (this.anInt289 != -1) {
				this.method121(Class15.aClass15Array1[this.anInt289], 0, 0, 0);
			} else if (this.anIntArray68[this.anInt325] != -1) {
				this.method121(Class15.aClass15Array1[this.anIntArray68[this.anInt325]], 0, 0, 0);
			}
			if (this.aBoolean52 && this.anInt142 == 1) {
				this.method156();
			}
			this.aClass32_3.method456(231, super.aGraphics2, 562);
			this.aClass32_5.method455();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray75;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("47033, " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!bc;IZII)V")
	private void method125(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt252 < 400) {
				@Pc(14) String local14 = arg0.aString2;
				if (arg0.anInt72 != 0) {
					local14 = local14 + method111(arg0.anInt72, this.aClass1_Sub1_Sub3_Sub2_1.anInt946) + " (level-" + arg0.anInt72 + ")";
				}
				if (this.anInt230 == 1) {
					this.aStringArray8[this.anInt252] = "Use " + this.aString9 + " with @yel@" + local14;
					this.anIntArray52[this.anInt252] = 493;
					this.anIntArray53[this.anInt252] = arg3;
					this.anIntArray50[this.anInt252] = arg2;
					this.anIntArray51[this.anInt252] = arg1;
					this.anInt252++;
				} else if (this.anInt317 != 1) {
					@Pc(153) int local153;
					if (arg0.aStringArray2 != null) {
						for (local153 = 4; local153 >= 0; local153--) {
							if (arg0.aStringArray2[local153] != null && !arg0.aStringArray2[local153].equalsIgnoreCase("attack")) {
								this.aStringArray8[this.anInt252] = arg0.aStringArray2[local153] + " @yel@" + local14;
								if (local153 == 0) {
									this.anIntArray52[this.anInt252] = 988;
								}
								if (local153 == 1) {
									this.anIntArray52[this.anInt252] = 345;
								}
								if (local153 == 2) {
									this.anIntArray52[this.anInt252] = 249;
								}
								if (local153 == 3) {
									this.anIntArray52[this.anInt252] = 960;
								}
								if (local153 == 4) {
									this.anIntArray52[this.anInt252] = 40;
								}
								this.anIntArray53[this.anInt252] = arg3;
								this.anIntArray50[this.anInt252] = arg2;
								this.anIntArray51[this.anInt252] = arg1;
								this.anInt252++;
							}
						}
					}
					if (arg0.aStringArray2 != null) {
						for (local153 = 4; local153 >= 0; local153--) {
							if (arg0.aStringArray2[local153] != null && arg0.aStringArray2[local153].equalsIgnoreCase("attack")) {
								@Pc(277) short local277 = 0;
								if (arg0.anInt72 > this.aClass1_Sub1_Sub3_Sub2_1.anInt946) {
									local277 = 2000;
								}
								this.aStringArray8[this.anInt252] = arg0.aStringArray2[local153] + " @yel@" + local14;
								if (local153 == 0) {
									this.anIntArray52[this.anInt252] = local277 + 988;
								}
								if (local153 == 1) {
									this.anIntArray52[this.anInt252] = local277 + 345;
								}
								if (local153 == 2) {
									this.anIntArray52[this.anInt252] = local277 + 249;
								}
								if (local153 == 3) {
									this.anIntArray52[this.anInt252] = local277 + 960;
								}
								if (local153 == 4) {
									this.anIntArray52[this.anInt252] = local277 + 40;
								}
								this.anIntArray53[this.anInt252] = arg3;
								this.anIntArray50[this.anInt252] = arg2;
								this.anIntArray51[this.anInt252] = arg1;
								this.anInt252++;
							}
						}
					}
					this.aStringArray8[this.anInt252] = "Examine @yel@" + local14;
					this.anIntArray52[this.anInt252] = 1814;
					this.anIntArray53[this.anInt252] = arg3;
					this.anIntArray50[this.anInt252] = arg2;
					this.anIntArray51[this.anInt252] = arg1;
					this.anInt252++;
				} else if ((this.anInt319 & 0x2) == 2) {
					this.aStringArray8[this.anInt252] = this.aString16 + " @yel@" + local14;
					this.anIntArray52[this.anInt252] = 500;
					this.anIntArray53[this.anInt252] = arg3;
					this.anIntArray50[this.anInt252] = arg2;
					this.anIntArray51[this.anInt252] = arg1;
					this.anInt252++;
					return;
				}
			}
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("90097, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	private String method126(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("60595, " + false + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;I)V")
	private void method127(@OriginalArg(0) Class15 arg0) {
		try {
			@Pc(14) int local14 = arg0.anInt475;
			if (local14 >= 1 && local14 <= 100) {
				local14--;
				if (local14 >= this.anInt141) {
					arg0.aString20 = "";
					arg0.anInt474 = 0;
				} else {
					arg0.aString20 = this.aStringArray9[local14];
					arg0.anInt474 = 1;
				}
			} else if (local14 >= 101 && local14 <= 200) {
				local14 -= 101;
				if (local14 >= this.anInt141) {
					arg0.aString20 = "";
					arg0.anInt474 = 0;
				} else {
					if (this.anIntArray64[local14] == 0) {
						arg0.aString20 = "@red@Offline";
					} else if (this.anIntArray64[local14] == anInt151) {
						arg0.aString20 = "@gre@World-" + (this.anIntArray64[local14] - 9);
					} else {
						arg0.aString20 = "@yel@World-" + (this.anIntArray64[local14] - 9);
					}
					arg0.anInt474 = 1;
				}
			} else if (local14 == 203) {
				arg0.anInt481 = this.anInt141 * 15 + 20;
				if (arg0.anInt481 <= arg0.anInt477) {
					arg0.anInt481 = arg0.anInt477 + 1;
				}
			} else if (local14 >= 401 && local14 <= 500) {
				local14 -= 401;
				if (local14 >= this.anInt333) {
					arg0.aString20 = "";
					arg0.anInt474 = 0;
				} else {
					arg0.aString20 = Class40.method534(Class40.method531(this.aLongArray3[local14]));
					arg0.anInt474 = 1;
				}
			} else if (local14 == 503) {
				arg0.anInt481 = this.anInt333 * 15 + 20;
				if (arg0.anInt481 <= arg0.anInt477) {
					arg0.anInt481 = arg0.anInt477 + 1;
				}
			} else if (local14 == 327) {
				arg0.anInt492 = 150;
				arg0.anInt493 = (int) (Math.sin((double) anInt239 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean42) {
					this.aBoolean42 = false;
					@Pc(215) Class1_Sub3_Sub1[] local215 = new Class1_Sub3_Sub1[7];
					@Pc(217) int local217 = 0;
					for (@Pc(219) int local219 = 0; local219 < 7; local219++) {
						@Pc(226) int local226 = this.anIntArray83[local219];
						if (local226 >= 0) {
							local215[local217++] = Class13.aClass13Array1[local226].method304();
						}
					}
					@Pc(247) Class1_Sub3_Sub1 local247 = new Class1_Sub3_Sub1(6, local217, local215);
					for (@Pc(249) int local249 = 0; local249 < 5; local249++) {
						if (this.anIntArray35[local249] != 0) {
							local247.method236(anIntArrayArray5[local249][0], anIntArrayArray5[local249][this.anIntArray35[local249]]);
							if (local249 == 1) {
								local247.method236(anIntArray54[0], anIntArray54[this.anIntArray35[local249]]);
							}
						}
					}
					local247.method229();
					local247.method230(Class19.aClass19Array1[this.aClass1_Sub1_Sub3_Sub2_1.anInt900].anIntArray186[0]);
					local247.method239(64, 850, -30, -50, -30, true);
					arg0.aClass1_Sub3_Sub1_2 = local247;
				}
			} else if (local14 == 324) {
				if (this.aClass1_Sub3_Sub2_Sub2_10 == null) {
					this.aClass1_Sub3_Sub2_Sub2_10 = arg0.aClass1_Sub3_Sub2_Sub2_12;
					this.aClass1_Sub3_Sub2_Sub2_11 = arg0.aClass1_Sub3_Sub2_Sub2_13;
				}
				if (this.aBoolean49) {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_11;
				} else {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_10;
				}
			} else if (local14 == 325) {
				if (this.aClass1_Sub3_Sub2_Sub2_10 == null) {
					this.aClass1_Sub3_Sub2_Sub2_10 = arg0.aClass1_Sub3_Sub2_Sub2_12;
					this.aClass1_Sub3_Sub2_Sub2_11 = arg0.aClass1_Sub3_Sub2_Sub2_13;
				}
				if (this.aBoolean49) {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_10;
				} else {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_11;
				}
			} else if (local14 == 600) {
				arg0.aString20 = this.aString8;
				if (anInt239 % 20 < 10) {
					arg0.aString20 = arg0.aString20 + "|";
				} else {
					arg0.aString20 = arg0.aString20 + " ";
				}
			} else {
				if (local14 == 613) {
					if (!this.aBoolean58) {
						arg0.aString20 = "";
					} else if (this.aBoolean66) {
						arg0.anInt486 = 16711680;
						arg0.aString20 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.anInt486 = 16777215;
						arg0.aString20 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(447) String local447;
				if (local14 == 650 || local14 == 655) {
					if (this.anInt214 == 0) {
						arg0.aString20 = "";
					} else {
						if (this.anInt166 == 0) {
							local447 = "earlier today";
						} else if (this.anInt166 == 1) {
							local447 = "yesterday";
						} else {
							local447 = this.anInt166 + " days ago";
						}
						arg0.aString20 = "You last logged in " + local447 + " from: " + signlink.dns;
					}
				}
				if (local14 == 651) {
					if (this.anInt287 == 0) {
						arg0.aString20 = "0 unread messages";
						arg0.anInt486 = 16776960;
					}
					if (this.anInt287 == 1) {
						arg0.aString20 = "1 unread message";
						arg0.anInt486 = 65280;
					}
					if (this.anInt287 > 1) {
						arg0.aString20 = this.anInt287 + " unread messages";
						arg0.anInt486 = 65280;
					}
				}
				if (local14 == 652) {
					if (this.anInt308 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt308 == 200) {
						arg0.aString20 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt308 == 0) {
							local447 = "Earlier today";
						} else if (this.anInt308 == 1) {
							local447 = "Yesterday";
						} else {
							local447 = this.anInt308 + " days ago";
						}
						arg0.aString20 = local447 + " you changed your recovery questions";
					}
				}
				if (local14 == 653) {
					if (this.anInt308 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt308 == 200) {
						arg0.aString20 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.aString20 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local14 == 654) {
					if (this.anInt308 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt308 == 200) {
						arg0.aString20 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.aString20 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(629) RuntimeException local629) {
			signlink.reporterror("44507, " + arg0 + ", " + 4 + ", " + local629.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;II)V")
	private void method128(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt251 = 0;
			this.anInt188 = 0;
			this.method105(this.anInt173, arg0, arg1);
			this.method100(arg1, arg0);
			this.method165(arg0, arg1, this.aBoolean41);
			this.method114(arg1, arg0);
			@Pc(49) int local49;
			for (@Pc(42) int local42 = 0; local42 < this.anInt251; local42++) {
				local49 = this.anIntArray65[local42];
				if (this.aClass1_Sub1_Sub3_Sub2Array1[local49].anInt938 != anInt239) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local49] = null;
				}
			}
			if (arg0.anInt566 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt566 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local49 = 0; local49 < this.anInt187; local49++) {
				if (this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray45[local49]] == null) {
					signlink.reporterror(this.aString17 + " null entry in pl list - pos:" + local49 + " size:" + this.anInt187);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("9917, " + arg0 + ", " + 45899 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method129(@OriginalArg(0) int arg0) {
		try {
			this.anInt281 += 0;
			if (!aBoolean40) {
				@Pc(18) Class1_Sub3_Sub2_Sub3 local18;
				@Pc(26) int local26;
				@Pc(34) int local34;
				@Pc(37) byte[] local37;
				@Pc(40) byte[] local40;
				@Pc(42) int local42;
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[17] >= arg0) {
					local18 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[17];
					local26 = local18.anInt516 * local18.anInt517 - 1;
					local34 = local18.anInt516 * this.anInt161 * 2;
					local37 = local18.aByteArray6;
					local40 = this.aByteArray4;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray6 = local40;
					this.aByteArray4 = local37;
					Class1_Sub3_Sub2_Sub1.method292(17);
				}
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[24] >= arg0) {
					local18 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[24];
					local26 = local18.anInt516 * local18.anInt517 - 1;
					local34 = local18.anInt516 * this.anInt161 * 2;
					local37 = local18.aByteArray6;
					local40 = this.aByteArray4;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray6 = local40;
					this.aByteArray4 = local37;
					Class1_Sub3_Sub2_Sub1.method292(24);
					return;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("23534, " + arg0 + ", " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method130(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt230 == 0 && this.anInt317 == 0) {
				this.aStringArray8[this.anInt252] = "Walk here";
				this.anIntArray52[this.anInt252] = 981;
				this.anIntArray50[this.anInt252] = super.anInt130;
				this.anIntArray51[this.anInt252] = super.anInt131;
				this.anInt252++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub3_Sub1.anInt375; local43++) {
				@Pc(49) int local49 = Class1_Sub3_Sub1.anIntArray123[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(209) int local209;
					if (local65 == 2 && this.aClass33_1.method490(this.anInt172, local53, local59, local49) >= 0) {
						@Pc(91) Class2 local91 = Class2.method23(local71);
						if (this.anInt230 == 1) {
							this.aStringArray8[this.anInt252] = "Use " + this.aString9 + " with @cya@" + local91.aString1;
							this.anIntArray52[this.anInt252] = 505;
							this.anIntArray53[this.anInt252] = local49;
							this.anIntArray50[this.anInt252] = local53;
							this.anIntArray51[this.anInt252] = local59;
							this.anInt252++;
						} else if (this.anInt317 != 1) {
							if (local91.aStringArray1 != null) {
								for (local209 = 4; local209 >= 0; local209--) {
									if (local91.aStringArray1[local209] != null) {
										this.aStringArray8[this.anInt252] = local91.aStringArray1[local209] + " @cya@" + local91.aString1;
										if (local209 == 0) {
											this.anIntArray52[this.anInt252] = 798;
										}
										if (local209 == 1) {
											this.anIntArray52[this.anInt252] = 829;
										}
										if (local209 == 2) {
											this.anIntArray52[this.anInt252] = 873;
										}
										if (local209 == 3) {
											this.anIntArray52[this.anInt252] = 104;
										}
										if (local209 == 4) {
											this.anIntArray52[this.anInt252] = 1659;
										}
										this.anIntArray53[this.anInt252] = local49;
										this.anIntArray50[this.anInt252] = local53;
										this.anIntArray51[this.anInt252] = local59;
										this.anInt252++;
									}
								}
							}
							this.aStringArray8[this.anInt252] = "Examine @cya@" + local91.aString1;
							this.anIntArray52[this.anInt252] = 1418;
							this.anIntArray53[this.anInt252] = local49;
							this.anIntArray50[this.anInt252] = local53;
							this.anIntArray51[this.anInt252] = local59;
							this.anInt252++;
						} else if ((this.anInt319 & 0x4) == 4) {
							this.aStringArray8[this.anInt252] = this.aString16 + " @cya@" + local91.aString1;
							this.anIntArray52[this.anInt252] = 737;
							this.anIntArray53[this.anInt252] = local49;
							this.anIntArray50[this.anInt252] = local53;
							this.anIntArray51[this.anInt252] = local59;
							this.anInt252++;
						}
					}
					@Pc(386) Class1_Sub1_Sub3_Sub1 local386;
					if (local65 == 1) {
						@Pc(357) Class1_Sub1_Sub3_Sub1 local357 = this.aClass1_Sub1_Sub3_Sub1Array1[local71];
						if (local357.aClass3_1.aByte8 == 1 && (local357.anInt896 & 0x7F) == 64 && (local357.anInt897 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt234; local209++) {
								local386 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray62[local209]];
								if (local386 != null && local386 != local357 && local386.aClass3_1.aByte8 == 1 && local386.anInt896 == local357.anInt896 && local386.anInt897 == local357.anInt897) {
									this.method125(local386.aClass3_1, local59, local53, this.anIntArray62[local209]);
								}
							}
						}
						this.method125(local357.aClass3_1, local59, local53, local71);
					}
					if (local65 == 0) {
						@Pc(437) Class1_Sub1_Sub3_Sub2 local437 = this.aClass1_Sub1_Sub3_Sub2Array1[local71];
						if ((local437.anInt896 & 0x7F) == 64 && (local437.anInt897 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt234; local209++) {
								local386 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray62[local209]];
								if (local386 != null && local386.aClass3_1.aByte8 == 1 && local386.anInt896 == local437.anInt896 && local386.anInt897 == local437.anInt897) {
									this.method125(local386.aClass3_1, local59, local53, this.anIntArray62[local209]);
								}
							}
							for (@Pc(496) int local496 = 0; local496 < this.anInt187; local496++) {
								@Pc(506) Class1_Sub1_Sub3_Sub2 local506 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray45[local496]];
								if (local506 != null && local506 != local437 && local506.anInt896 == local437.anInt896 && local506.anInt897 == local437.anInt897) {
									this.method116(local506, local53, local59, this.anIntArray45[local496]);
								}
							}
						}
						this.method116(local437, local53, local59, local71);
					}
					if (local65 == 3) {
						@Pc(556) Class28 local556 = this.aClass28ArrayArrayArray1[this.anInt172][local53][local59];
						if (local556 != null) {
							for (@Pc(564) Class1_Sub7 local564 = (Class1_Sub7) local556.method449(this.anInt174); local564 != null; local564 = (Class1_Sub7) local556.method451()) {
								@Pc(570) Class5 local570 = Class5.method54(local564.anInt780);
								if (this.anInt230 == 1) {
									this.aStringArray8[this.anInt252] = "Use " + this.aString9 + " with @lre@" + local570.aString3;
									this.anIntArray52[this.anInt252] = 203;
									this.anIntArray53[this.anInt252] = local564.anInt780;
									this.anIntArray50[this.anInt252] = local53;
									this.anIntArray51[this.anInt252] = local59;
									this.anInt252++;
								} else if (this.anInt317 != 1) {
									for (@Pc(687) int local687 = 4; local687 >= 0; local687--) {
										if (local570.aStringArray3 != null && local570.aStringArray3[local687] != null) {
											this.aStringArray8[this.anInt252] = local570.aStringArray3[local687] + " @lre@" + local570.aString3;
											if (local687 == 0) {
												this.anIntArray52[this.anInt252] = 56;
											}
											if (local687 == 1) {
												this.anIntArray52[this.anInt252] = 321;
											}
											if (local687 == 2) {
												this.anIntArray52[this.anInt252] = 552;
											}
											if (local687 == 3) {
												this.anIntArray52[this.anInt252] = 43;
											}
											if (local687 == 4) {
												this.anIntArray52[this.anInt252] = 687;
											}
											this.anIntArray53[this.anInt252] = local564.anInt780;
											this.anIntArray50[this.anInt252] = local53;
											this.anIntArray51[this.anInt252] = local59;
											this.anInt252++;
										} else if (local687 == 2) {
											this.aStringArray8[this.anInt252] = "Take @lre@" + local570.aString3;
											this.anIntArray52[this.anInt252] = 552;
											this.anIntArray53[this.anInt252] = local564.anInt780;
											this.anIntArray50[this.anInt252] = local53;
											this.anIntArray51[this.anInt252] = local59;
											this.anInt252++;
										}
									}
									this.aStringArray8[this.anInt252] = "Examine @lre@" + local570.aString3;
									this.anIntArray52[this.anInt252] = 1308;
									this.anIntArray53[this.anInt252] = local564.anInt780;
									this.anIntArray50[this.anInt252] = local53;
									this.anIntArray51[this.anInt252] = local59;
									this.anInt252++;
								} else if ((this.anInt319 & 0x1) == 1) {
									this.aStringArray8[this.anInt252] = this.aString16 + " @lre@" + local570.aString3;
									this.anIntArray52[this.anInt252] = 543;
									this.anIntArray53[this.anInt252] = local564.anInt780;
									this.anIntArray50[this.anInt252] = local53;
									this.anIntArray51[this.anInt252] = local59;
									this.anInt252++;
								}
							}
						}
					}
				}
			}
			if (arg0 <= 0) {
				this.anInt171 = this.aClass38_1.method524();
			}
		} catch (@Pc(901) RuntimeException local901) {
			signlink.reporterror("40874, " + arg0 + ", " + local901.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method131() {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt234; local12++) {
				@Pc(19) int local19 = this.anIntArray62[local12];
				@Pc(24) Class1_Sub1_Sub3_Sub1 local24 = this.aClass1_Sub1_Sub3_Sub1Array1[local19];
				if (local24 != null) {
					this.method132(local24.aClass3_1.aByte8, local24);
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("54637, " + -579 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!x;)V")
	private void method132(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg1.anInt896 < 128 || arg1.anInt897 < 128 || arg1.anInt896 >= 13184 || arg1.anInt897 >= 13184) {
				arg1.anInt921 = -1;
				arg1.anInt926 = -1;
				arg1.anInt935 = 0;
				arg1.anInt936 = 0;
				arg1.anInt896 = arg1.anIntArray232[0] * 128 + arg1.anInt899 * 64;
				arg1.anInt897 = arg1.anIntArray233[0] * 128 + arg1.anInt899 * 64;
				arg1.anInt941 = 0;
			}
			if (arg1 == this.aClass1_Sub1_Sub3_Sub2_1 && (arg1.anInt896 < 1536 || arg1.anInt897 < 1536 || arg1.anInt896 >= 11776 || arg1.anInt897 >= 11776)) {
				arg1.anInt921 = -1;
				arg1.anInt926 = -1;
				arg1.anInt935 = 0;
				arg1.anInt936 = 0;
				arg1.anInt896 = arg1.anIntArray232[0] * 128 + arg1.anInt899 * 64;
				arg1.anInt897 = arg1.anIntArray233[0] * 128 + arg1.anInt899 * 64;
				arg1.anInt941 = 0;
			}
			if (arg1.anInt935 > anInt239) {
				this.method133(arg1, 725);
			} else if (arg1.anInt936 >= anInt239) {
				this.method134(arg1);
			} else {
				this.method135(arg1);
			}
			this.method136(arg1);
			this.method137(262, arg1);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("5178, " + -76 + ", " + arg0 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;I)V")
	private void method133(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt935 - anInt239;
			@Pc(14) int local14 = arg0.anInt931 * 128 + arg0.anInt899 * 64;
			@Pc(24) int local24 = arg0.anInt933 * 128 + arg0.anInt899 * 64;
			arg0.anInt896 += (local14 - arg0.anInt896) / local4;
			arg0.anInt897 += (local24 - arg0.anInt897) / local4;
			arg0.anInt942 = 0;
			@Pc(53) boolean local53 = false;
			if (arg0.anInt937 == 0) {
				arg0.anInt940 = 1024;
			}
			if (arg0.anInt937 == 1) {
				arg0.anInt940 = 1536;
			}
			if (arg0.anInt937 == 2) {
				arg0.anInt940 = 0;
			}
			if (arg0.anInt937 == 3) {
				arg0.anInt940 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("31333, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!x;)V")
	private void method134(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt936 == anInt239 || arg0.anInt921 == -1 || arg0.anInt924 != 0 || arg0.anInt923 + 1 > Class19.aClass19Array1[arg0.anInt921].anIntArray188[arg0.anInt922]) {
				@Pc(29) int local29 = arg0.anInt936 - arg0.anInt935;
				@Pc(34) int local34 = anInt239 - arg0.anInt935;
				@Pc(44) int local44 = arg0.anInt931 * 128 + arg0.anInt899 * 64;
				@Pc(54) int local54 = arg0.anInt933 * 128 + arg0.anInt899 * 64;
				@Pc(64) int local64 = arg0.anInt932 * 128 + arg0.anInt899 * 64;
				@Pc(74) int local74 = arg0.anInt934 * 128 + arg0.anInt899 * 64;
				arg0.anInt896 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt897 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt942 = 0;
			if (arg0.anInt937 == 0) {
				arg0.anInt940 = 1024;
			}
			if (arg0.anInt937 == 1) {
				arg0.anInt940 = 1536;
			}
			if (arg0.anInt937 == 2) {
				arg0.anInt940 = 0;
			}
			if (arg0.anInt937 == 3) {
				arg0.anInt940 = 512;
			}
			arg0.anInt898 = arg0.anInt940;
			this.aBoolean37 &= true;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("9492, " + true + ", " + arg0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!x;)V")
	private void method135(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt918 = arg0.anInt900;
			if (arg0.anInt941 == 0) {
				arg0.anInt942 = 0;
			} else {
				if (arg0.anInt921 != -1 && arg0.anInt924 == 0) {
					@Pc(30) Class19 local30 = Class19.aClass19Array1[arg0.anInt921];
					if (local30.anIntArray189 == null) {
						arg0.anInt942++;
						return;
					}
				}
				@Pc(43) int local43 = arg0.anInt896;
				@Pc(46) int local46 = arg0.anInt897;
				@Pc(61) int local61 = arg0.anIntArray232[arg0.anInt941 - 1] * 128 + arg0.anInt899 * 64;
				@Pc(76) int local76 = arg0.anIntArray233[arg0.anInt941 - 1] * 128 + arg0.anInt899 * 64;
				if (local61 - local43 <= 256 && local61 - local43 >= -256 && local76 - local46 <= 256 && local76 - local46 >= -256) {
					if (local43 < local61) {
						if (local46 < local76) {
							arg0.anInt940 = 1280;
						} else if (local46 > local76) {
							arg0.anInt940 = 1792;
						} else {
							arg0.anInt940 = 1536;
						}
					} else if (local43 > local61) {
						if (local46 < local76) {
							arg0.anInt940 = 768;
						} else if (local46 > local76) {
							arg0.anInt940 = 256;
						} else {
							arg0.anInt940 = 512;
						}
					} else if (local46 < local76) {
						arg0.anInt940 = 1024;
					} else {
						arg0.anInt940 = 0;
					}
					@Pc(170) int local170 = arg0.anInt940 - arg0.anInt898 & 0x7FF;
					if (local170 > 1024) {
						local170 -= 2048;
					}
					@Pc(177) int local177 = arg0.anInt903;
					if (local170 >= -256 && local170 <= 256) {
						local177 = arg0.anInt902;
					} else if (local170 >= 256 && local170 < 768) {
						local177 = arg0.anInt905;
					} else if (local170 >= -768 && local170 <= -256) {
						local177 = arg0.anInt904;
					}
					if (local177 == -1) {
						local177 = arg0.anInt902;
					}
					arg0.anInt918 = local177;
					@Pc(219) int local219 = 4;
					if (arg0.anInt898 != arg0.anInt940 && arg0.anInt915 == -1) {
						local219 = 2;
					}
					if (arg0.anInt941 > 2) {
						local219 = 6;
					}
					if (arg0.anInt941 > 3) {
						local219 = 8;
					}
					if (arg0.anInt942 > 0 && arg0.anInt941 > 1) {
						local219 = 8;
						arg0.anInt942--;
					}
					if (arg0.aBooleanArray9[arg0.anInt941 - 1]) {
						local219 <<= 0x1;
					}
					if (local219 >= 8 && arg0.anInt918 == arg0.anInt902 && arg0.anInt906 != -1) {
						arg0.anInt918 = arg0.anInt906;
					}
					if (local43 < local61) {
						arg0.anInt896 += local219;
						if (arg0.anInt896 > local61) {
							arg0.anInt896 = local61;
						}
					} else if (local43 > local61) {
						arg0.anInt896 -= local219;
						if (arg0.anInt896 < local61) {
							arg0.anInt896 = local61;
						}
					}
					if (local46 < local76) {
						arg0.anInt897 += local219;
						if (arg0.anInt897 > local76) {
							arg0.anInt897 = local76;
						}
					} else if (local46 > local76) {
						arg0.anInt897 -= local219;
						if (arg0.anInt897 < local76) {
							arg0.anInt897 = local76;
						}
					}
					if (arg0.anInt896 == local61 && arg0.anInt897 == local76) {
						arg0.anInt941--;
					}
				} else {
					arg0.anInt896 = local61;
					arg0.anInt897 = local76;
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("36954, " + 9 + ", " + arg0 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;Z)V")
	private void method136(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(32) int local32;
			@Pc(38) int local38;
			if (arg0.anInt915 != -1 && arg0.anInt915 < 32768) {
				@Pc(24) Class1_Sub1_Sub3_Sub1 local24 = this.aClass1_Sub1_Sub3_Sub1Array1[arg0.anInt915];
				if (local24 != null) {
					local32 = arg0.anInt896 - local24.anInt896;
					local38 = arg0.anInt897 - local24.anInt897;
					if (local32 != 0 || local38 != 0) {
						arg0.anInt940 = (int) (Math.atan2((double) local32, (double) local38) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(63) int local63;
			if (arg0.anInt915 >= 32768) {
				local63 = arg0.anInt915 - 32768;
				if (local63 == this.anInt255) {
					local63 = this.anInt186;
				}
				@Pc(75) Class1_Sub1_Sub3_Sub2 local75 = this.aClass1_Sub1_Sub3_Sub2Array1[local63];
				if (local75 != null) {
					local38 = arg0.anInt896 - local75.anInt896;
					@Pc(89) int local89 = arg0.anInt897 - local75.anInt897;
					if (local38 != 0 || local89 != 0) {
						arg0.anInt940 = (int) (Math.atan2((double) local38, (double) local89) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt916 != 0 || arg0.anInt917 != 0) && (arg0.anInt941 == 0 || arg0.anInt942 > 0)) {
				local63 = arg0.anInt896 - (arg0.anInt916 - this.anInt296 - this.anInt296) * 64;
				local32 = arg0.anInt897 - (arg0.anInt917 - this.anInt297 - this.anInt297) * 64;
				if (local63 != 0 || local32 != 0) {
					arg0.anInt940 = (int) (Math.atan2((double) local63, (double) local32) * 325.949D) & 0x7FF;
				}
				arg0.anInt916 = 0;
				arg0.anInt917 = 0;
			}
			local63 = arg0.anInt940 - arg0.anInt898 & 0x7FF;
			if (local63 != 0) {
				if (local63 < 32 || local63 > 2016) {
					arg0.anInt898 = arg0.anInt940;
				} else if (local63 > 1024) {
					arg0.anInt898 -= 32;
				} else {
					arg0.anInt898 += 32;
				}
				arg0.anInt898 &= 0x7FF;
				if (arg0.anInt918 == arg0.anInt900 && arg0.anInt898 != arg0.anInt940) {
					if (arg0.anInt901 != -1) {
						arg0.anInt918 = arg0.anInt901;
						return;
					}
					arg0.anInt918 = arg0.anInt902;
					return;
				}
			}
		} catch (@Pc(237) RuntimeException local237) {
			signlink.reporterror("74666, " + arg0 + ", " + false + ", " + local237.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!x;)V")
	private void method137(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			arg1.aBoolean167 = false;
			@Pc(17) Class19 local17;
			if (arg1.anInt918 != -1) {
				local17 = Class19.aClass19Array1[arg1.anInt918];
				arg1.anInt920++;
				if (arg1.anInt919 < local17.anInt546 && arg1.anInt920 > local17.anIntArray188[arg1.anInt919]) {
					arg1.anInt920 = 0;
					arg1.anInt919++;
				}
				if (arg1.anInt919 >= local17.anInt546) {
					arg1.anInt920 = 0;
					arg1.anInt919 = 0;
				}
			}
			if (arg1.anInt921 != -1 && arg1.anInt924 == 0) {
				local17 = Class19.aClass19Array1[arg1.anInt921];
				arg1.anInt923++;
				while (arg1.anInt922 < local17.anInt546 && arg1.anInt923 > local17.anIntArray188[arg1.anInt922]) {
					arg1.anInt923 -= local17.anIntArray188[arg1.anInt922];
					arg1.anInt922++;
				}
				if (arg1.anInt922 >= local17.anInt546) {
					arg1.anInt922 -= local17.anInt547;
					arg1.anInt925++;
					if (arg1.anInt925 >= local17.anInt551) {
						arg1.anInt921 = -1;
					}
					if (arg1.anInt922 < 0 || arg1.anInt922 >= local17.anInt546) {
						arg1.anInt921 = -1;
					}
				}
				arg1.aBoolean167 = local17.aBoolean127;
			}
			if (arg1.anInt924 > 0) {
				arg1.anInt924--;
			}
			if (arg1.anInt926 != -1 && anInt239 >= arg1.anInt929) {
				if (arg1.anInt927 < 0) {
					arg1.anInt927 = 0;
				}
				local17 = Class21.aClass21Array1[arg1.anInt926].aClass19_1;
				arg1.anInt928++;
				while (arg1.anInt927 < local17.anInt546 && arg1.anInt928 > local17.anIntArray188[arg1.anInt927]) {
					arg1.anInt928 -= local17.anIntArray188[arg1.anInt927];
					arg1.anInt927++;
				}
				if (arg1.anInt927 >= local17.anInt546) {
					if (arg1.anInt927 < 0 || arg1.anInt927 >= local17.anInt546) {
						arg1.anInt926 = -1;
					}
					return;
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("1063, " + arg0 + ", " + arg1 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method138() {
		try {
			this.anInt281 += 0;
			if (this.aBoolean64) {
				this.aBoolean64 = false;
				this.aClass32_19.method456(11, super.aGraphics2, 0);
				this.aClass32_20.method456(375, super.aGraphics2, 0);
				this.aClass32_21.method456(5, super.aGraphics2, 729);
				this.aClass32_22.method456(231, super.aGraphics2, 752);
				this.aClass32_23.method456(0, super.aGraphics2, 0);
				this.aClass32_24.method456(0, super.aGraphics2, 561);
				this.aClass32_25.method456(11, super.aGraphics2, 520);
				this.aClass32_26.method456(231, super.aGraphics2, 520);
				this.aClass32_27.method456(375, super.aGraphics2, 501);
				this.aClass32_28.method456(345, super.aGraphics2, 0);
				this.aBoolean69 = true;
				this.aBoolean60 = true;
				this.aBoolean47 = true;
				this.aBoolean50 = true;
				if (this.anInt324 != 2) {
					this.aClass32_5.method456(11, super.aGraphics2, 8);
					this.aClass32_4.method456(5, super.aGraphics2, 561);
				}
			}
			if (this.anInt324 == 2) {
				this.method194();
			}
			if (this.aBoolean52 && this.anInt142 == 1) {
				this.aBoolean69 = true;
			}
			@Pc(152) boolean local152;
			if (this.anInt289 != -1) {
				local152 = this.method198(this.anInt289, this.anInt161);
				if (local152) {
					this.aBoolean69 = true;
				}
			}
			if (this.anInt293 == 2) {
				this.aBoolean69 = true;
			}
			if (this.anInt221 == 2) {
				this.aBoolean69 = true;
			}
			if (this.aBoolean69) {
				this.method124();
				this.aBoolean69 = false;
			}
			if (this.anInt288 == -1) {
				this.aClass15_1.anInt482 = this.anInt320 - this.anInt246 - 77;
				if (super.anInt130 > 453 && super.anInt130 < 565 && super.anInt131 > 350) {
					this.method90(this.aClass15_1, super.anInt130 - 22, 0, 77, this.anInt320, 463, super.anInt131 - 375, false);
				}
				@Pc(234) int local234 = this.anInt320 - this.aClass15_1.anInt482 - 77;
				if (local234 < 0) {
					local234 = 0;
				}
				if (local234 > this.anInt320 - 77) {
					local234 = this.anInt320 - 77;
				}
				if (this.anInt246 != local234) {
					this.anInt246 = local234;
					this.aBoolean60 = true;
				}
				anInt248++;
				if (anInt248 > 87) {
					anInt248 = 0;
					this.aClass1_Sub3_Sub3_6.method372(225);
				}
			}
			if (this.anInt288 != -1) {
				local152 = this.method198(this.anInt288, this.anInt161);
				if (local152) {
					this.aBoolean60 = true;
				}
			}
			if (this.anInt293 == 3) {
				this.aBoolean60 = true;
			}
			if (this.anInt221 == 3) {
				this.aBoolean60 = true;
			}
			if (this.aString10 != null) {
				this.aBoolean60 = true;
			}
			if (this.aBoolean52 && this.anInt142 == 2) {
				this.aBoolean60 = true;
			}
			if (this.aBoolean60) {
				this.method145();
				this.aBoolean60 = false;
			}
			if (this.anInt324 == 2) {
				this.method169();
				this.aClass32_4.method456(5, super.aGraphics2, 561);
			}
			if (this.anInt305 != -1) {
				this.aBoolean47 = true;
			}
			if (this.aBoolean47) {
				if (this.anInt305 != -1 && this.anInt305 == this.anInt325) {
					this.anInt305 = -1;
					this.aClass1_Sub3_Sub3_6.method372(50);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt325);
				}
				this.aBoolean47 = false;
				this.aClass32_9.method455();
				this.aClass1_Sub3_Sub2_Sub3_17.method346(0, 0);
				if (this.anInt289 == -1) {
					if (this.anIntArray68[this.anInt325] != -1) {
						if (this.anInt325 == 0) {
							this.aClass1_Sub3_Sub2_Sub3_10.method346(29, 30);
						}
						if (this.anInt325 == 1) {
							this.aClass1_Sub3_Sub2_Sub3_11.method346(59, 29);
						}
						if (this.anInt325 == 2) {
							this.aClass1_Sub3_Sub2_Sub3_11.method346(87, 29);
						}
						if (this.anInt325 == 3) {
							this.aClass1_Sub3_Sub2_Sub3_12.method346(115, 29);
						}
						if (this.anInt325 == 4) {
							this.aClass1_Sub3_Sub2_Sub3_14.method346(156, 29);
						}
						if (this.anInt325 == 5) {
							this.aClass1_Sub3_Sub2_Sub3_14.method346(184, 29);
						}
						if (this.anInt325 == 6) {
							this.aClass1_Sub3_Sub2_Sub3_13.method346(212, 30);
						}
					}
					if (this.anIntArray68[0] != -1 && (this.anInt305 != 0 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[0].method346(35, 34);
					}
					if (this.anIntArray68[1] != -1 && (this.anInt305 != 1 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[1].method346(59, 32);
					}
					if (this.anIntArray68[2] != -1 && (this.anInt305 != 2 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[2].method346(86, 32);
					}
					if (this.anIntArray68[3] != -1 && (this.anInt305 != 3 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[3].method346(121, 33);
					}
					if (this.anIntArray68[4] != -1 && (this.anInt305 != 4 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[4].method346(157, 34);
					}
					if (this.anIntArray68[5] != -1 && (this.anInt305 != 5 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[5].method346(185, 32);
					}
					if (this.anIntArray68[6] != -1 && (this.anInt305 != 6 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[6].method346(212, 34);
					}
				}
				this.aClass32_9.method456(165, super.aGraphics2, 520);
				this.aClass32_8.method455();
				this.aClass1_Sub3_Sub2_Sub3_16.method346(0, 0);
				if (this.anInt289 == -1) {
					if (this.anIntArray68[this.anInt325] != -1) {
						if (this.anInt325 == 7) {
							this.aClass1_Sub3_Sub2_Sub3_1.method346(49, 0);
						}
						if (this.anInt325 == 8) {
							this.aClass1_Sub3_Sub2_Sub3_2.method346(81, 0);
						}
						if (this.anInt325 == 9) {
							this.aClass1_Sub3_Sub2_Sub3_2.method346(108, 0);
						}
						if (this.anInt325 == 10) {
							this.aClass1_Sub3_Sub2_Sub3_3.method346(136, 1);
						}
						if (this.anInt325 == 11) {
							this.aClass1_Sub3_Sub2_Sub3_5.method346(178, 0);
						}
						if (this.anInt325 == 12) {
							this.aClass1_Sub3_Sub2_Sub3_5.method346(205, 0);
						}
						if (this.anInt325 == 13) {
							this.aClass1_Sub3_Sub2_Sub3_4.method346(233, 0);
						}
					}
					if (this.anIntArray68[8] != -1 && (this.anInt305 != 8 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[7].method346(80, 2);
					}
					if (this.anIntArray68[9] != -1 && (this.anInt305 != 9 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[8].method346(107, 3);
					}
					if (this.anIntArray68[10] != -1 && (this.anInt305 != 10 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[9].method346(142, 4);
					}
					if (this.anIntArray68[11] != -1 && (this.anInt305 != 11 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[10].method346(179, 2);
					}
					if (this.anIntArray68[12] != -1 && (this.anInt305 != 12 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[11].method346(206, 2);
					}
					if (this.anIntArray68[13] != -1 && (this.anInt305 != 13 || anInt239 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array2[12].method346(230, 2);
					}
				}
				this.aClass32_8.method456(492, super.aGraphics2, 501);
				this.aClass32_5.method455();
			}
			if (this.aBoolean50) {
				this.aBoolean50 = false;
				this.aClass32_7.method455();
				this.aClass1_Sub3_Sub2_Sub3_15.method346(0, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method359(33, "Public chat", true, 16777215, 57);
				if (this.anInt330 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "On", true, 65280, 57);
				}
				if (this.anInt330 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "Friends", true, 16776960, 57);
				}
				if (this.anInt330 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "Off", true, 16711680, 57);
				}
				if (this.anInt330 == 3) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "Hide", true, 65535, 57);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method359(33, "Private chat", true, 16777215, 186);
				if (this.anInt227 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "On", true, 65280, 186);
				}
				if (this.anInt227 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "Friends", true, 16776960, 186);
				}
				if (this.anInt227 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "Off", true, 16711680, 186);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method359(33, "Trade/duel", true, 16777215, 326);
				if (this.anInt205 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "On", true, 65280, 326);
				}
				if (this.anInt205 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "Friends", true, 16776960, 326);
				}
				if (this.anInt205 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359(46, "Off", true, 16711680, 326);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method359(38, "Report abuse", true, 16777215, 462);
				this.aClass32_7.method456(471, super.aGraphics2, 0);
				this.aClass32_5.method455();
			}
			this.anInt161 = 0;
		} catch (@Pc(1074) RuntimeException local1074) {
			signlink.reporterror("1768, " + 0 + ", " + local1074.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!x;I)V")
	private void method139(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.method140(arg1.anInt897, arg1.anInt896, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("85938, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method159(arg0, arg1, this.anInt172) - arg2;
				@Pc(39) int local39 = arg1 - this.anInt264;
				@Pc(44) int local44 = local28 - this.anInt265;
				@Pc(49) int local49 = arg0 - this.anInt266;
				@Pc(54) int local54 = Class1_Sub3_Sub1.anIntArray124[this.anInt267];
				@Pc(59) int local59 = Class1_Sub3_Sub1.anIntArray125[this.anInt267];
				@Pc(64) int local64 = Class1_Sub3_Sub1.anIntArray124[this.anInt268];
				@Pc(69) int local69 = Class1_Sub3_Sub1.anIntArray125[this.anInt268];
				@Pc(79) int local79 = local49 * local64 + local39 * local69 >> 16;
				@Pc(89) int local89 = local49 * local69 - local39 * local64 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local44 * local59 - local89 * local54 >> 16;
				@Pc(111) int local111 = local44 * local54 + local89 * local59 >> 16;
				if (local111 >= 50) {
					this.anInt197 = Class1_Sub3_Sub2_Sub1.anInt430 + (local91 << 9) / local111;
					this.anInt198 = Class1_Sub3_Sub2_Sub1.anInt431 + (local101 << 9) / local111;
				} else {
					this.anInt197 = -1;
					this.anInt198 = -1;
				}
			} else {
				this.anInt197 = -1;
				this.anInt198 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("84854, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 23177 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method141() {
		try {
			@Pc(6) int local6 = this.anInt270 * 128 + 64;
			@Pc(13) int local13 = this.anInt271 * 128 + 64;
			@Pc(26) int local26 = this.method159(this.anInt271, this.anInt270, this.anInt172) - this.anInt272;
			if (this.anInt264 < local6) {
				this.anInt264 += this.anInt273 + (local6 - this.anInt264) * this.anInt274 / 1000;
				if (this.anInt264 > local6) {
					this.anInt264 = local6;
				}
			}
			if (this.anInt264 > local6) {
				this.anInt264 -= this.anInt273 + (this.anInt264 - local6) * this.anInt274 / 1000;
				if (this.anInt264 < local6) {
					this.anInt264 = local6;
				}
			}
			if (this.anInt265 < local26) {
				this.anInt265 += this.anInt273 + (local26 - this.anInt265) * this.anInt274 / 1000;
				if (this.anInt265 > local26) {
					this.anInt265 = local26;
				}
			}
			if (this.anInt265 > local26) {
				this.anInt265 -= this.anInt273 + (this.anInt265 - local26) * this.anInt274 / 1000;
				if (this.anInt265 < local26) {
					this.anInt265 = local26;
				}
			}
			if (this.anInt266 < local13) {
				this.anInt266 += this.anInt273 + (local13 - this.anInt266) * this.anInt274 / 1000;
				if (this.anInt266 > local13) {
					this.anInt266 = local13;
				}
			}
			if (this.anInt266 > local13) {
				this.anInt266 -= this.anInt273 + (this.anInt266 - local13) * this.anInt274 / 1000;
				if (this.anInt266 < local13) {
					this.anInt266 = local13;
				}
			}
			local6 = this.anInt275 * 128 + 64;
			local13 = this.anInt276 * 128 + 64;
			local26 = this.method159(this.anInt276, this.anInt275, this.anInt172) - this.anInt277;
			@Pc(233) int local233 = local6 - this.anInt264;
			@Pc(238) int local238 = local26 - this.anInt265;
			@Pc(243) int local243 = local13 - this.anInt266;
			@Pc(254) int local254 = (int) Math.sqrt((double) (local233 * local233 + local243 * local243));
			@Pc(265) int local265 = (int) (Math.atan2((double) local238, (double) local254) * 325.949D) & 0x7FF;
			@Pc(276) int local276 = (int) (Math.atan2((double) local233, (double) local243) * -325.949D) & 0x7FF;
			if (local265 < 128) {
				local265 = 128;
			}
			if (local265 > 383) {
				local265 = 383;
			}
			if (this.anInt267 < local265) {
				this.anInt267 += this.anInt278 + (local265 - this.anInt267) * this.anInt279 / 1000;
				if (this.anInt267 > local265) {
					this.anInt267 = local265;
				}
			}
			if (this.anInt267 > local265) {
				this.anInt267 -= this.anInt278 + (this.anInt267 - local265) * this.anInt279 / 1000;
				if (this.anInt267 < local265) {
					this.anInt267 = local265;
				}
			}
			@Pc(347) int local347 = local276 - this.anInt268;
			if (local347 > 1024) {
				local347 -= 2048;
			}
			if (local347 < -1024) {
				local347 += 2048;
			}
			if (local347 > 0) {
				this.anInt268 += this.anInt278 + local347 * this.anInt279 / 1000;
				this.anInt268 &= 0x7FF;
			}
			if (local347 < 0) {
				this.anInt268 -= this.anInt278 + -local347 * this.anInt279 / 1000;
				this.anInt268 &= 0x7FF;
			}
			@Pc(405) int local405 = local276 - this.anInt268;
			if (local405 > 1024) {
				local405 -= 2048;
			}
			if (local405 < -1024) {
				local405 += 2048;
			}
			if (local405 < 0 && local347 > 0 || local405 > 0 && local347 < 0) {
				this.anInt268 = local276;
			}
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("17712, " + true + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt138 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt332 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray7[local12] != null) {
						@Pc(24) int local24 = this.anIntArray44[local12];
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt227 == 0 || this.anInt227 == 1 && this.method176(this.aStringArray6[local12], this.anInt181))) {
							@Pc(55) int local55 = 329 - local5 * 13;
							if (super.anInt130 > 8 && super.anInt130 < 520 && arg0 - 11 > local55 - 10 && arg0 - 11 <= local55 + 3) {
								if (this.aBoolean58) {
									this.aStringArray8[this.anInt252] = "Report abuse @whi@" + this.aStringArray6[local12];
									this.anIntArray52[this.anInt252] = 2316;
									this.anInt252++;
								}
								this.aStringArray8[this.anInt252] = "Add ignore @whi@" + this.aStringArray6[local12];
								this.anIntArray52[this.anInt252] = 2158;
								this.anInt252++;
								this.aStringArray8[this.anInt252] = "Add friend @whi@" + this.aStringArray6[local12];
								this.anIntArray52[this.anInt252] = 2447;
								this.anInt252++;
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt227 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("41040, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub3_Sub2_Sub3_6.method346(arg3, arg1);
			this.aClass1_Sub3_Sub2_Sub3_7.method346(arg3, arg1 + arg0 - 16);
			Class1_Sub3_Sub2.method354(this.anInt307, arg3, arg1 + 16, 16, arg0 - 32);
			@Pc(35) int local35 = (arg0 - 32) * arg0 / arg4;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg0 - local35 - 32) * arg2 / (arg4 - arg0);
			Class1_Sub3_Sub2.method354(this.anInt341, arg3, arg1 + local52 + 16, 16, local35);
			Class1_Sub3_Sub2.method357(arg1 + local52 + 16, this.anInt218, local35, arg3);
			Class1_Sub3_Sub2.method357(arg1 + local52 + 16, this.anInt218, local35, arg3 + 1);
			Class1_Sub3_Sub2.method356(this.anInt218, arg1 + local52 + 16, arg3, 16);
			Class1_Sub3_Sub2.method356(this.anInt218, arg1 + local52 + 17, arg3, 16);
			Class1_Sub3_Sub2.method357(arg1 + local52 + 16, this.anInt199, local35, arg3 + 15);
			Class1_Sub3_Sub2.method357(arg1 + local52 + 17, this.anInt199, local35 - 1, arg3 + 14);
			Class1_Sub3_Sub2.method356(this.anInt199, arg1 + local52 + local35 + 15, arg3, 16);
			Class1_Sub3_Sub2.method356(this.anInt199, arg1 + local52 + local35 + 14, arg3 + 1, 15);
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("22947, " + arg0 + ", " + -19 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method144() {
		try {
			@Pc(7) int local7;
			if (this.aByte19 != 7) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			this.aBoolean42 = true;
			for (local7 = 0; local7 < 7; local7++) {
				this.anIntArray83[local7] = -1;
				for (@Pc(26) int local26 = 0; local26 < Class13.anInt436; local26++) {
					if (!Class13.aClass13Array1[local26].aBoolean98 && Class13.aClass13Array1[local26].anInt437 == local7 + (this.aBoolean49 ? 0 : 7)) {
						this.anIntArray83[local7] = local26;
						break;
					}
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("6754, " + 7 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method145() {
		try {
			this.aClass32_6.method455();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray73;
			this.aClass1_Sub3_Sub2_Sub3_20.method346(0, 0);
			if (this.aBoolean62) {
				this.aClass1_Sub3_Sub2_Sub4_3.method358(239, 40, this.aString14, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method358(239, 60, this.aString13 + "*", 128);
			} else if (this.aBoolean57) {
				this.aClass1_Sub3_Sub2_Sub4_3.method358(239, 40, "Enter amount to transfer:", 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method358(239, 60, this.aString7 + "*", 128);
			} else if (this.aString10 != null) {
				this.aClass1_Sub3_Sub2_Sub4_3.method358(239, 40, this.aString10, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method358(239, 60, "Click to continue", 128);
			} else if (this.anInt288 != -1) {
				this.method121(Class15.aClass15Array1[this.anInt288], 0, 0, 0);
			} else if (this.anInt202 == -1) {
				@Pc(130) Class1_Sub3_Sub2_Sub4 local130 = this.aClass1_Sub3_Sub2_Sub4_2;
				@Pc(132) int local132 = 0;
				Class1_Sub3_Sub2.method352(77, this.anInt334, 0, 0, 463);
				for (@Pc(141) int local141 = 0; local141 < 100; local141++) {
					if (this.aStringArray7[local141] != null) {
						@Pc(153) int local153 = this.anIntArray44[local141];
						@Pc(162) int local162 = this.anInt246 + 70 - local132 * 14;
						if (local153 == 0) {
							if (local162 > 0 && local162 < 110) {
								local130.method361(4, 0, this.aStringArray7[local141], local162);
							}
							local132++;
						}
						if (local153 == 1) {
							if (local162 > 0 && local162 < 110) {
								local130.method361(4, 16777215, this.aStringArray6[local141] + ":", local162);
								local130.method361(local130.method360(this.aStringArray6[local141]) + 12, 255, this.aStringArray7[local141], local162);
							}
							local132++;
						}
						if (local153 == 2 && (this.anInt330 == 0 || this.anInt330 == 1 && this.method176(this.aStringArray6[local141], this.anInt181))) {
							if (local162 > 0 && local162 < 110) {
								local130.method361(4, 0, this.aStringArray6[local141] + ":", local162);
								local130.method361(local130.method360(this.aStringArray6[local141]) + 12, 255, this.aStringArray7[local141], local162);
							}
							local132++;
						}
						if ((local153 == 3 || local153 == 7) && this.anInt138 == 0 && (local153 == 7 || this.anInt227 == 0 || this.anInt227 == 1 && this.method176(this.aStringArray6[local141], this.anInt181))) {
							if (local162 > 0 && local162 < 110) {
								local130.method361(4, 0, "From " + this.aStringArray6[local141] + ":", local162);
								local130.method361(local130.method360("From " + this.aStringArray6[local141]) + 12, 8388608, this.aStringArray7[local141], local162);
							}
							local132++;
						}
						if (local153 == 4 && (this.anInt205 == 0 || this.anInt205 == 1 && this.method176(this.aStringArray6[local141], this.anInt181))) {
							if (local162 > 0 && local162 < 110) {
								local130.method361(4, 8388736, this.aStringArray6[local141] + " " + this.aStringArray7[local141], local162);
							}
							local132++;
						}
						if (local153 == 5 && this.anInt138 == 0 && this.anInt227 < 2) {
							if (local162 > 0 && local162 < 110) {
								local130.method361(4, 8388608, this.aStringArray7[local141], local162);
							}
							local132++;
						}
						if (local153 == 6 && this.anInt138 == 0 && this.anInt227 < 2) {
							if (local162 > 0 && local162 < 110) {
								local130.method361(4, 0, "To " + this.aStringArray6[local141] + ":", local162);
								local130.method361(local130.method360("To " + this.aStringArray6[local141]) + 12, 8388608, this.aStringArray7[local141], local162);
							}
							local132++;
						}
						if (local153 == 8 && (this.anInt205 == 0 || this.anInt205 == 1 && this.method176(this.aStringArray6[local141], this.anInt181))) {
							if (local162 > 0 && local162 < 110) {
								local130.method361(4, 13350793, this.aStringArray6[local141] + " " + this.aStringArray7[local141], local162);
							}
							local132++;
						}
					}
				}
				Class1_Sub3_Sub2.method351();
				this.anInt320 = local132 * 14 + 7;
				if (this.anInt320 < 78) {
					this.anInt320 = 78;
				}
				this.method143(77, 0, this.anInt320 - this.anInt246 - 77, 463, this.anInt320);
				local130.method361(4, 0, Class40.method534(this.aString17) + ":", 90);
				local130.method361(local130.method360(this.aString17 + ": ") + 6, 255, this.aString15 + "*", 90);
				Class1_Sub3_Sub2.method356(0, 77, 0, 479);
			} else {
				this.method121(Class15.aClass15Array1[this.anInt202], 0, 0, 0);
			}
			if (this.aBoolean52 && this.anInt142 == 2) {
				this.method156();
			}
			this.aClass32_6.method456(375, super.aGraphics2, 22);
			this.aClass32_5.method455();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray75;
		} catch (@Pc(656) RuntimeException local656) {
			signlink.reporterror("48558, " + false + ", " + local656.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method146(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) Class15 local6 = Class15.aClass15Array1[arg0];
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray153.length && local6.anIntArray153[local8] != -1; local8++) {
				@Pc(23) Class15 local23 = Class15.aClass15Array1[local6.anIntArray153[local8]];
				if (local23.anInt473 == 1) {
					this.method146(local23.anInt471);
				}
				local23.anInt469 = 0;
				local23.anInt470 = 0;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("36683, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)Z")
	private boolean method147() {
		try {
			if (this.aClass6_1 == null) {
				return false;
			}
			@Pc(894) String local894;
			@Pc(185) int local185;
			try {
				@Pc(16) int local16 = this.aClass6_1.method203();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt282 == -1) {
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, 1);
					this.anInt282 = this.aClass1_Sub3_Sub3_5.aByteArray7[0] & 0xFF;
					if (this.aClass38_1 != null) {
						this.anInt282 = this.anInt282 - this.aClass38_1.method524() & 0xFF;
					}
					this.anInt281 = Class7.anIntArray90[this.anInt282];
					local16--;
				}
				if (this.anInt281 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, 1);
					this.anInt281 = this.aClass1_Sub3_Sub3_5.aByteArray7[0] & 0xFF;
					local16--;
				}
				if (this.anInt281 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, 2);
					this.aClass1_Sub3_Sub3_5.anInt566 = 0;
					this.anInt281 = this.aClass1_Sub3_Sub3_5.method385();
					local16 -= 2;
				}
				if (local16 < this.anInt281) {
					return false;
				}
				this.aClass1_Sub3_Sub3_5.anInt566 = 0;
				this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, this.anInt281);
				this.anInt283 = 0;
				this.anInt213 = this.anInt212;
				this.anInt212 = this.anInt211;
				this.anInt211 = this.anInt282;
				@Pc(160) int local160;
				if (this.anInt282 == 169) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					Class15.aClass15Array1[local160].aClass1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub2_1.method566();
					this.anInt282 = -1;
					return true;
				}
				@Pc(191) int local191;
				@Pc(197) int local197;
				@Pc(201) int local201;
				if (this.anInt282 == 212) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method385();
					local191 = local185 >> 10 & 0x1F;
					local197 = local185 >> 5 & 0x1F;
					local201 = local185 & 0x1F;
					Class15.aClass15Array1[local160].anInt486 = (local191 << 19) + (local197 << 11) + (local201 << 3);
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 242) {
					this.anInt332 = this.aClass1_Sub3_Sub3_5.method385() * 30;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 235) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method388();
					this.anIntArray49[local160] = local185;
					if (this.anIntArray63[local160] != local185) {
						this.anIntArray63[local160] = local185;
						this.method153(local160);
						this.aBoolean69 = true;
						if (this.anInt202 != -1) {
							this.aBoolean60 = true;
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 202) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method383();
					local191 = this.aClass1_Sub3_Sub3_5.method385();
					if (this.aBoolean56 && !aBoolean40 && this.anInt336 < 50) {
						this.anIntArray47[this.anInt336] = local160;
						this.anIntArray33[this.anInt336] = local185;
						this.anIntArray84[this.anInt336] = local191 + Class43.anIntArray231[local160];
						this.anInt336++;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 57) {
					if (this.anInt325 == 12) {
						this.aBoolean69 = true;
					}
					this.anInt262 = this.aClass1_Sub3_Sub3_5.method386();
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 39) {
					this.method80();
					this.anInt282 = -1;
					return false;
				}
				@Pc(453) int local453;
				@Pc(464) int local464;
				if (this.anInt282 == 240) {
					this.aBoolean71 = true;
					this.anInt275 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt276 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt277 = this.aClass1_Sub3_Sub3_5.method385();
					this.anInt278 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt279 = this.aClass1_Sub3_Sub3_5.method383();
					if (this.anInt279 >= 100) {
						local160 = this.anInt275 * 128 + 64;
						local185 = this.anInt276 * 128 + 64;
						local191 = this.method159(this.anInt276, this.anInt275, this.anInt172) - this.anInt277;
						local197 = local160 - this.anInt264;
						local201 = local191 - this.anInt265;
						local453 = local185 - this.anInt266;
						local464 = (int) Math.sqrt((double) (local197 * local197 + local453 * local453));
						this.anInt267 = (int) (Math.atan2((double) local201, (double) local464) * 325.949D) & 0x7FF;
						this.anInt268 = (int) (Math.atan2((double) local197, (double) local453) * -325.949D) & 0x7FF;
						if (this.anInt267 < 128) {
							this.anInt267 = 128;
						}
						if (this.anInt267 > 383) {
							this.anInt267 = 383;
						}
					}
					this.anInt282 = -1;
					return true;
				}
				@Pc(516) long local516;
				@Pc(526) boolean local526;
				if (this.anInt282 == 201) {
					local516 = this.aClass1_Sub3_Sub3_5.method389();
					local191 = this.aClass1_Sub3_Sub3_5.method388();
					local197 = this.aClass1_Sub3_Sub3_5.method383();
					local526 = false;
					for (local453 = 0; local453 < 100; local453++) {
						if (this.anIntArray30[local453] == local191) {
							local526 = true;
							break;
						}
					}
					if (local197 <= 1) {
						for (local464 = 0; local464 < this.anInt333; local464++) {
							if (this.aLongArray3[local464] == local516) {
								local526 = true;
								break;
							}
						}
					}
					if (!local526 && this.anInt229 == 0) {
						try {
							this.anIntArray30[this.anInt321] = local191;
							this.anInt321 = (this.anInt321 + 1) % 100;
							@Pc(595) String local595 = Class41.method537(this.anInt281 - 13, this.aClass1_Sub3_Sub3_5);
							@Pc(599) String local599 = Class25.method416(local595);
							if (local197 > 1) {
								this.method103(local599, 7, Class40.method534(Class40.method531(local516)));
							} else {
								this.method103(local599, 3, Class40.method534(Class40.method531(local516)));
							}
						} catch (@Pc(626) Exception local626) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 66) {
					local160 = this.aClass1_Sub3_Sub3_5.method383();
					local185 = this.aClass1_Sub3_Sub3_5.method383();
					local191 = this.aClass1_Sub3_Sub3_5.method385();
					local197 = this.aClass1_Sub3_Sub3_5.method385();
					local201 = -1;
					for (local453 = 0; local453 < this.anIntArray70.length; local453++) {
						if (this.anIntArray70[local453] == (local160 << 8) + local185) {
							local201 = local453;
						}
					}
					if (local201 != -1) {
						if (this.aByteArrayArray2[local201] == null || this.aByteArrayArray2[local201].length != local197) {
							this.aByteArrayArray2[local201] = new byte[local197];
						}
						this.aClass1_Sub3_Sub3_5.method392(local191, this.aByteArrayArray2[local201], this.anInt281 - 6);
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 213) {
					this.anInt330 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt227 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt205 = this.aClass1_Sub3_Sub3_5.method383();
					this.aBoolean50 = true;
					this.aBoolean60 = true;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 177) {
					this.anInt255 = this.aClass1_Sub3_Sub3_5.method385();
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 192) {
					this.anInt158 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt159 = this.aClass1_Sub3_Sub3_5.method383();
					while (this.aClass1_Sub3_Sub3_5.anInt566 < this.anInt281) {
						local160 = this.aClass1_Sub3_Sub3_5.method383();
						this.method107(this.aByte20, local160, this.aClass1_Sub3_Sub3_5);
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 174) {
					this.aBoolean71 = true;
					this.anInt270 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt271 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt272 = this.aClass1_Sub3_Sub3_5.method385();
					this.anInt273 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt274 = this.aClass1_Sub3_Sub3_5.method383();
					if (this.anInt274 >= 100) {
						this.anInt264 = this.anInt270 * 128 + 64;
						this.anInt266 = this.anInt271 * 128 + 64;
						this.anInt265 = this.method159(this.anInt271, this.anInt270, this.anInt172) - this.anInt272;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 128) {
					this.method175(this.aClass1_Sub3_Sub3_5, this.anInt281);
					this.anInt282 = -1;
					return true;
				}
				@Pc(905) String local905;
				if (this.anInt282 == 112) {
					local894 = this.aClass1_Sub3_Sub3_5.method390();
					@Pc(908) long local908;
					if (local894.endsWith(":tradereq:")) {
						local905 = local894.substring(0, local894.indexOf(":"));
						local908 = Class40.method530(local905);
						local526 = false;
						for (local453 = 0; local453 < this.anInt333; local453++) {
							if (this.aLongArray3[local453] == local908) {
								local526 = true;
								break;
							}
						}
						if (!local526 && this.anInt229 == 0) {
							this.method103("wishes to trade with you.", 4, local905);
						}
					} else if (local894.endsWith(":duelreq:")) {
						local905 = local894.substring(0, local894.indexOf(":"));
						local908 = Class40.method530(local905);
						local526 = false;
						for (local453 = 0; local453 < this.anInt333; local453++) {
							if (this.aLongArray3[local453] == local908) {
								local526 = true;
								break;
							}
						}
						if (!local526 && this.anInt229 == 0) {
							this.method103("wishes to duel with you.", 8, local905);
						}
					} else {
						this.method103(local894, 0, "");
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 230) {
					if (this.aBoolean46 && !aBoolean40) {
						local160 = this.aClass1_Sub3_Sub3_5.method385();
						local185 = this.aClass1_Sub3_Sub3_5.method388();
						local191 = this.anInt281 - 6;
						@Pc(1028) byte[] local1028 = new byte[local185];
						Class34.method511(local1028, local185, this.aClass1_Sub3_Sub3_5.aByteArray7, local191, this.aClass1_Sub3_Sub3_5.anInt566);
						this.method170(local185, false, local1028);
						this.anInt228 = local160;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 250) {
					this.anInt158 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt159 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 48) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method385();
					@Pc(1087) Class3 local1087 = Class3.method32(local185);
					Class15.aClass15Array1[local160].aClass1_Sub3_Sub1_2 = local1087.method35();
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 47) {
					this.aBoolean71 = false;
					for (local160 = 0; local160 < 5; local160++) {
						this.aBooleanArray1[local160] = false;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 35) {
					local160 = this.aClass1_Sub3_Sub3_5.method383();
					local185 = this.aClass1_Sub3_Sub3_5.method383();
					local191 = this.aClass1_Sub3_Sub3_5.method385();
					local197 = this.aClass1_Sub3_Sub3_5.method385();
					local201 = -1;
					for (local453 = 0; local453 < this.anIntArray70.length; local453++) {
						if (this.anIntArray70[local453] == (local160 << 8) + local185) {
							local201 = local453;
						}
					}
					if (local201 != -1) {
						if (this.aByteArrayArray1[local201] == null || this.aByteArrayArray1[local201].length != local197) {
							this.aByteArrayArray1[local201] = new byte[local197];
						}
						this.aClass1_Sub3_Sub3_5.method392(local191, this.aByteArrayArray1[local201], this.anInt281 - 6);
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 153) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					this.method146(local160);
					if (this.anInt288 != -1) {
						this.anInt288 = -1;
						this.aBoolean60 = true;
					}
					if (this.aBoolean57) {
						this.aBoolean57 = false;
						this.aBoolean60 = true;
					}
					this.anInt289 = local160;
					this.aBoolean69 = true;
					this.aBoolean47 = true;
					this.anInt286 = -1;
					this.aBoolean63 = false;
					this.anInt282 = -1;
					return true;
				}
				@Pc(1278) Class15 local1278;
				if (this.anInt282 == 253) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method385();
					local191 = this.aClass1_Sub3_Sub3_5.method385();
					local1278 = Class15.aClass15Array1[local160];
					@Pc(1281) Class1_Sub3_Sub1 local1281 = local1278.aClass1_Sub3_Sub1_2;
					if (local1281 != null) {
						local1281.method236(local185, local191);
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 33) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method385();
					local191 = this.aClass1_Sub3_Sub3_5.method385();
					@Pc(1311) Class5 local1311 = Class5.method54(local185);
					Class15.aClass15Array1[local160].aClass1_Sub3_Sub1_2 = local1311.method58(50);
					Class15.aClass15Array1[local160].anInt492 = local1311.anInt100;
					Class15.aClass15Array1[local160].anInt493 = local1311.anInt101;
					Class15.aClass15Array1[local160].anInt491 = local1311.anInt99 * 100 / local191;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 60) {
					local160 = this.aClass1_Sub3_Sub3_5.method383();
					local185 = this.aClass1_Sub3_Sub3_5.method383();
					local191 = -1;
					for (local197 = 0; local197 < this.anIntArray70.length; local197++) {
						if (this.anIntArray70[local197] == (local160 << 8) + local185) {
							local191 = local197;
						}
					}
					if (local191 != -1) {
						signlink.cachesave("l" + local160 + "_" + local185, this.aByteArrayArray1[local191]);
						this.anInt324 = 1;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 132) {
					Class8.method209(true);
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 107) {
					if (this.anInt325 == 12) {
						this.aBoolean69 = true;
					}
					this.anInt316 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 255) {
					if (this.anInt289 != -1) {
						this.anInt289 = -1;
						this.aBoolean69 = true;
						this.aBoolean47 = true;
					}
					if (this.anInt288 != -1) {
						this.anInt288 = -1;
						this.aBoolean60 = true;
					}
					if (this.aBoolean57) {
						this.aBoolean57 = false;
						this.aBoolean60 = true;
					}
					this.anInt286 = -1;
					this.aBoolean63 = false;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 42) {
					this.anInt263 = this.aClass1_Sub3_Sub3_5.method383();
					if (this.anInt263 == 1) {
						this.anInt175 = this.aClass1_Sub3_Sub3_5.method385();
					}
					if (this.anInt263 >= 2 && this.anInt263 <= 6) {
						if (this.anInt263 == 2) {
							this.anInt303 = 64;
							this.anInt304 = 64;
						}
						if (this.anInt263 == 3) {
							this.anInt303 = 0;
							this.anInt304 = 64;
						}
						if (this.anInt263 == 4) {
							this.anInt303 = 128;
							this.anInt304 = 64;
						}
						if (this.anInt263 == 5) {
							this.anInt303 = 64;
							this.anInt304 = 0;
						}
						if (this.anInt263 == 6) {
							this.anInt303 = 64;
							this.anInt304 = 128;
						}
						this.anInt263 = 2;
						this.anInt300 = this.aClass1_Sub3_Sub3_5.method385();
						this.anInt301 = this.aClass1_Sub3_Sub3_5.method385();
						this.anInt302 = this.aClass1_Sub3_Sub3_5.method383();
					}
					if (this.anInt263 == 10) {
						this.anInt295 = this.aClass1_Sub3_Sub3_5.method385();
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 248) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method385();
					Class15.aClass15Array1[local160].aClass1_Sub3_Sub1_2 = new Class1_Sub3_Sub1(0, local185);
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 94) {
					this.aBoolean69 = true;
					local160 = this.aClass1_Sub3_Sub3_5.method383();
					local185 = this.aClass1_Sub3_Sub3_5.method388();
					local191 = this.aClass1_Sub3_Sub3_5.method383();
					this.anIntArray66[local160] = local185;
					this.anIntArray76[local160] = local191;
					this.anIntArray34[local160] = 1;
					for (local197 = 0; local197 < 98; local197++) {
						if (local185 >= anIntArray31[local197]) {
							this.anIntArray34[local160] = local197 + 2;
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 113) {
					this.anInt333 = this.anInt281 / 8;
					for (local160 = 0; local160 < this.anInt333; local160++) {
						this.aLongArray3[local160] = this.aClass1_Sub3_Sub3_5.method389();
					}
					this.anInt282 = -1;
					return true;
				}
				@Pc(1728) Class15 local1728;
				if (this.anInt282 == 123) {
					this.aBoolean69 = true;
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local1728 = Class15.aClass15Array1[local160];
					local191 = this.aClass1_Sub3_Sub3_5.method383();
					for (local197 = 0; local197 < local191; local197++) {
						local1728.anIntArray149[local197] = this.aClass1_Sub3_Sub3_5.method385();
						local201 = this.aClass1_Sub3_Sub3_5.method383();
						if (local201 == 255) {
							local201 = this.aClass1_Sub3_Sub3_5.method388();
						}
						local1728.anIntArray150[local197] = local201;
					}
					for (local201 = local191; local201 < local1728.anIntArray149.length; local201++) {
						local1728.anIntArray149[local201] = 0;
						local1728.anIntArray150[local201] = 0;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 12) {
					local160 = this.aClass1_Sub3_Sub3_5.method383();
					local185 = this.aClass1_Sub3_Sub3_5.method383();
					local191 = -1;
					for (local197 = 0; local197 < this.anIntArray70.length; local197++) {
						if (this.anIntArray70[local197] == (local160 << 8) + local185) {
							local191 = local197;
						}
					}
					if (local191 != -1) {
						signlink.cachesave("m" + local160 + "_" + local185, this.aByteArrayArray2[local191]);
						this.anInt324 = 1;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 231) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method385();
					if (this.anInt288 != -1) {
						this.anInt288 = -1;
						this.aBoolean60 = true;
					}
					if (this.aBoolean57) {
						this.aBoolean57 = false;
						this.aBoolean60 = true;
					}
					this.anInt286 = local160;
					this.anInt289 = local185;
					this.aBoolean69 = true;
					this.aBoolean47 = true;
					this.aBoolean63 = false;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 147) {
					this.anInt158 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt159 = this.aClass1_Sub3_Sub3_5.method383();
					for (local160 = this.anInt158; local160 < this.anInt158 + 8; local160++) {
						for (local185 = this.anInt159; local185 < this.anInt159 + 8; local185++) {
							if (this.aClass28ArrayArrayArray1[this.anInt172][local160][local185] != null) {
								this.aClass28ArrayArrayArray1[this.anInt172][local160][local185] = null;
								this.method171(local160, local185);
							}
						}
					}
					for (@Pc(1969) Class1_Sub4 local1969 = (Class1_Sub4) this.aClass28_1.method448(); local1969 != null; local1969 = (Class1_Sub4) this.aClass28_1.method450()) {
						if (local1969.anInt600 >= this.anInt158 && local1969.anInt600 < this.anInt158 + 8 && local1969.anInt601 >= this.anInt159 && local1969.anInt601 < this.anInt159 + 8 && local1969.anInt598 == this.anInt172) {
							this.method157(local1969.anInt599, local1969.anInt606, local1969.anInt607, local1969.anInt601, local1969.anInt600, local1969.anInt598, local1969.anInt605);
							local1969.method559();
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 171) {
					this.anInt214 = this.aClass1_Sub3_Sub3_5.method388();
					this.anInt166 = this.aClass1_Sub3_Sub3_5.method385();
					this.anInt308 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt287 = this.aClass1_Sub3_Sub3_5.method385();
					if (this.anInt214 != 0 && this.anInt286 == -1) {
						signlink.dnslookup(Class40.method533(this.anInt214));
						this.method110();
						@Pc(2073) short local2073 = 650;
						if (this.anInt308 != 201) {
							local2073 = 655;
						}
						this.aString8 = "";
						this.aBoolean66 = false;
						for (local185 = 0; local185 < Class15.aClass15Array1.length; local185++) {
							if (Class15.aClass15Array1[local185] != null && Class15.aClass15Array1[local185].anInt475 == local2073) {
								this.anInt286 = Class15.aClass15Array1[local185].anInt472;
								break;
							}
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 72) {
					this.anInt180 = this.aClass1_Sub3_Sub3_5.method383();
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 176) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local905 = this.aClass1_Sub3_Sub3_5.method390();
					Class15.aClass15Array1[local160].aString20 = local905;
					if (Class15.aClass15Array1[local160].anInt472 == this.anIntArray68[this.anInt325]) {
						this.aBoolean69 = true;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 71) {
					local160 = this.aClass1_Sub3_Sub3_5.method383();
					local185 = this.aClass1_Sub3_Sub3_5.method383();
					local191 = this.aClass1_Sub3_Sub3_5.method383();
					local197 = this.aClass1_Sub3_Sub3_5.method383();
					this.aBooleanArray1[local160] = true;
					this.anIntArray43[local160] = local185;
					this.anIntArray82[local160] = local191;
					this.anIntArray86[local160] = local197;
					this.anIntArray32[local160] = 0;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 68) {
					Class8.method208();
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 106) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					this.method146(local160);
					if (this.anInt289 != -1) {
						this.anInt289 = -1;
						this.aBoolean69 = true;
						this.aBoolean47 = true;
					}
					this.anInt288 = local160;
					this.aBoolean60 = true;
					this.anInt286 = -1;
					this.aBoolean63 = false;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 85) {
					this.anInt325 = this.aClass1_Sub3_Sub3_5.method383();
					this.aBoolean69 = true;
					this.aBoolean47 = true;
					this.anInt282 = -1;
					return true;
				}
				@Pc(2445) int local2445;
				if (this.anInt282 == 140) {
					local516 = this.aClass1_Sub3_Sub3_5.method389();
					local191 = this.aClass1_Sub3_Sub3_5.method383();
					@Pc(2308) String local2308 = Class40.method534(Class40.method531(local516));
					for (local201 = 0; local201 < this.anInt141; local201++) {
						if (local516 == this.aLongArray4[local201]) {
							if (this.anIntArray64[local201] != local191) {
								this.anIntArray64[local201] = local191;
								this.aBoolean69 = true;
								if (local191 > 0) {
									this.method103(local2308 + " has logged in.", 5, "");
								}
								if (local191 == 0) {
									this.method103(local2308 + " has logged out.", 5, "");
								}
							}
							local2308 = null;
							break;
						}
					}
					if (local2308 != null && this.anInt141 < 100) {
						this.aLongArray4[this.anInt141] = local516;
						this.aStringArray9[this.anInt141] = local2308;
						this.anIntArray64[this.anInt141] = local191;
						this.anInt141++;
						this.aBoolean69 = true;
					}
					@Pc(2406) boolean local2406 = false;
					while (!local2406) {
						local2406 = true;
						for (local464 = 0; local464 < this.anInt141 - 1; local464++) {
							if (this.anIntArray64[local464] != anInt151 && this.anIntArray64[local464 + 1] == anInt151 || this.anIntArray64[local464] == 0 && this.anIntArray64[local464 + 1] != 0) {
								local2445 = this.anIntArray64[local464];
								this.anIntArray64[local464] = this.anIntArray64[local464 + 1];
								this.anIntArray64[local464 + 1] = local2445;
								@Pc(2467) String local2467 = this.aStringArray9[local464];
								this.aStringArray9[local464] = this.aStringArray9[local464 + 1];
								this.aStringArray9[local464 + 1] = local2467;
								@Pc(2489) long local2489 = this.aLongArray4[local464];
								this.aLongArray4[local464] = this.aLongArray4[local464 + 1];
								this.aLongArray4[local464 + 1] = local2489;
								this.aBoolean69 = true;
								local2406 = false;
							}
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 165) {
					local160 = this.aClass1_Sub3_Sub3_5.method386();
					this.anInt202 = local160;
					this.aBoolean60 = true;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 216) {
					for (local160 = 0; local160 < this.anIntArray63.length; local160++) {
						if (this.anIntArray63[local160] != this.anIntArray49[local160]) {
							this.anIntArray63[local160] = this.anIntArray49[local160];
							this.method153(local160);
							this.aBoolean69 = true;
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 117 || this.anInt282 == 25 || this.anInt282 == 127 || this.anInt282 == 195 || this.anInt282 == 1 || this.anInt282 == 61 || this.anInt282 == 246 || this.anInt282 == 78 || this.anInt282 == 214 || this.anInt282 == 220) {
					this.method107(this.aByte20, this.anInt282, this.aClass1_Sub3_Sub3_5);
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 180) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					this.method146(local160);
					if (this.anInt289 != -1) {
						this.anInt289 = -1;
						this.aBoolean69 = true;
						this.aBoolean47 = true;
					}
					if (this.anInt288 != -1) {
						this.anInt288 = -1;
						this.aBoolean60 = true;
					}
					if (this.aBoolean57) {
						this.aBoolean57 = false;
						this.aBoolean60 = true;
					}
					this.anInt286 = local160;
					this.aBoolean63 = false;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 125) {
					this.anInt164 = 0;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 191) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method386();
					local191 = this.aClass1_Sub3_Sub3_5.method386();
					local1278 = Class15.aClass15Array1[local160];
					local1278.anInt478 = local185;
					local1278.anInt479 = local191;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 3) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method385();
					if (this.anInt195 == local160 && this.anInt196 == local185 && this.anInt324 != 0) {
						this.anInt282 = -1;
						return true;
					}
					this.anInt195 = local160;
					this.anInt196 = local185;
					this.anInt296 = (this.anInt195 - 6) * 8;
					this.anInt297 = (this.anInt196 - 6) * 8;
					this.anInt324 = 1;
					this.aClass32_5.method455();
					this.aClass1_Sub3_Sub2_Sub4_2.method358(257, 151, "Loading - please wait.", 0);
					this.aClass1_Sub3_Sub2_Sub4_2.method358(256, 150, "Loading - please wait.", 16777215);
					this.aClass32_5.method456(11, super.aGraphics2, 8);
					signlink.looprate(5);
					local191 = (this.anInt281 - 2) / 10;
					this.aByteArrayArray2 = new byte[local191][];
					this.aByteArrayArray1 = new byte[local191][];
					this.anIntArray70 = new int[local191];
					this.aClass1_Sub3_Sub3_6.method372(131);
					this.aClass1_Sub3_Sub3_6.method373(0);
					local197 = 0;
					@Pc(2871) int local2871;
					for (local201 = 0; local201 < local191; local201++) {
						local453 = this.aClass1_Sub3_Sub3_5.method383();
						local464 = this.aClass1_Sub3_Sub3_5.method383();
						local2445 = this.aClass1_Sub3_Sub3_5.method388();
						local2871 = this.aClass1_Sub3_Sub3_5.method388();
						this.anIntArray70[local201] = (local453 << 8) + local464;
						@Pc(2895) byte[] local2895;
						if (local2445 != 0) {
							local2895 = signlink.cacheload("m" + local453 + "_" + local464);
							if (local2895 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local2895);
								if ((int) this.aCRC32_1.getValue() != local2445) {
									local2895 = null;
								}
							}
							if (local2895 == null) {
								this.anInt324 = 0;
								this.aClass1_Sub3_Sub3_6.method373(0);
								this.aClass1_Sub3_Sub3_6.method373(local453);
								this.aClass1_Sub3_Sub3_6.method373(local464);
								local197 += 3;
							} else {
								this.aByteArrayArray2[local201] = local2895;
							}
						}
						if (local2871 != 0) {
							local2895 = signlink.cacheload("l" + local453 + "_" + local464);
							if (local2895 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local2895);
								if ((int) this.aCRC32_1.getValue() != local2871) {
									local2895 = null;
								}
							}
							if (local2895 == null) {
								this.anInt324 = 0;
								this.aClass1_Sub3_Sub3_6.method373(1);
								this.aClass1_Sub3_Sub3_6.method373(local453);
								this.aClass1_Sub3_Sub3_6.method373(local464);
								local197 += 3;
							} else {
								this.aByteArrayArray1[local201] = local2895;
							}
						}
					}
					this.aClass1_Sub3_Sub3_6.method382(local197);
					signlink.looprate(50);
					this.aClass32_5.method455();
					if (this.anInt324 == 0) {
						this.aClass1_Sub3_Sub2_Sub4_2.method358(257, 166, "Map area updated since last visit, so load will take longer this time only", 0);
						this.aClass1_Sub3_Sub2_Sub4_2.method358(256, 165, "Map area updated since last visit, so load will take longer this time only", 16777215);
					}
					this.aClass32_5.method456(11, super.aGraphics2, 8);
					local453 = this.anInt296 - this.anInt298;
					local464 = this.anInt297 - this.anInt299;
					this.anInt298 = this.anInt296;
					this.anInt299 = this.anInt297;
					for (local2445 = 0; local2445 < 8192; local2445++) {
						@Pc(3065) Class1_Sub1_Sub3_Sub1 local3065 = this.aClass1_Sub1_Sub3_Sub1Array1[local2445];
						if (local3065 != null) {
							for (@Pc(3069) int local3069 = 0; local3069 < 10; local3069++) {
								local3065.anIntArray232[local3069] -= local453;
								local3065.anIntArray233[local3069] -= local464;
							}
							local3065.anInt896 -= local453 * 128;
							local3065.anInt897 -= local464 * 128;
						}
					}
					for (local2871 = 0; local2871 < this.anInt185; local2871++) {
						@Pc(3120) Class1_Sub1_Sub3_Sub2 local3120 = this.aClass1_Sub1_Sub3_Sub2Array1[local2871];
						if (local3120 != null) {
							for (@Pc(3124) int local3124 = 0; local3124 < 10; local3124++) {
								local3120.anIntArray232[local3124] -= local453;
								local3120.anIntArray233[local3124] -= local464;
							}
							local3120.anInt896 -= local453 * 128;
							local3120.anInt897 -= local464 * 128;
						}
					}
					@Pc(3169) byte local3169 = 0;
					@Pc(3171) byte local3171 = 104;
					@Pc(3173) byte local3173 = 1;
					if (local453 < 0) {
						local3169 = 103;
						local3171 = -1;
						local3173 = -1;
					}
					@Pc(3183) byte local3183 = 0;
					@Pc(3185) byte local3185 = 104;
					@Pc(3187) byte local3187 = 1;
					if (local464 < 0) {
						local3183 = 103;
						local3185 = -1;
						local3187 = -1;
					}
					for (@Pc(3197) int local3197 = local3169; local3197 != local3171; local3197 += local3173) {
						for (@Pc(3201) int local3201 = local3183; local3201 != local3185; local3201 += local3187) {
							@Pc(3207) int local3207 = local3197 + local453;
							@Pc(3211) int local3211 = local3201 + local464;
							for (@Pc(3213) int local3213 = 0; local3213 < 4; local3213++) {
								if (local3207 >= 0 && local3211 >= 0 && local3207 < 104 && local3211 < 104) {
									this.aClass28ArrayArrayArray1[local3213][local3197][local3201] = this.aClass28ArrayArrayArray1[local3213][local3207][local3211];
								} else {
									this.aClass28ArrayArrayArray1[local3213][local3197][local3201] = null;
								}
							}
						}
					}
					for (@Pc(3275) Class1_Sub4 local3275 = (Class1_Sub4) this.aClass28_1.method448(); local3275 != null; local3275 = (Class1_Sub4) this.aClass28_1.method450()) {
						local3275.anInt600 -= local453;
						local3275.anInt601 -= local464;
						if (local3275.anInt600 < 0 || local3275.anInt601 < 0 || local3275.anInt600 >= 104 || local3275.anInt601 >= 104) {
							local3275.method559();
						}
					}
					if (this.anInt164 != 0) {
						this.anInt164 -= local453;
						this.anInt165 -= local464;
					}
					this.aBoolean71 = false;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 49) {
					this.method128(this.aClass1_Sub3_Sub3_5, this.anInt281);
					if (this.anInt324 == 1) {
						this.anInt324 = 2;
						Class4.anInt78 = this.anInt172;
						this.method183(508);
					}
					if (aBoolean40 && this.anInt324 == 2 && Class4.anInt78 != this.anInt172) {
						this.aClass32_5.method455();
						this.aClass1_Sub3_Sub2_Sub4_2.method358(257, 151, "Loading - please wait.", 0);
						this.aClass1_Sub3_Sub2_Sub4_2.method358(256, 150, "Loading - please wait.", 16777215);
						this.aClass32_5.method456(11, super.aGraphics2, 8);
						Class4.anInt78 = this.anInt172;
						this.method183(508);
					}
					if (this.anInt172 != this.anInt235 && this.anInt324 == 2) {
						this.anInt235 = this.anInt172;
						this.method89(839, this.anInt172);
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 92) {
					local894 = this.aClass1_Sub3_Sub3_5.method390();
					local185 = this.aClass1_Sub3_Sub3_5.method388();
					local191 = this.aClass1_Sub3_Sub3_5.method388();
					if (!local894.equals(this.aString6) && this.aBoolean46 && !aBoolean40) {
						this.method118(local191, local185, local894);
					}
					this.aString6 = local894;
					this.anInt215 = local185;
					this.anInt313 = local191;
					this.anInt228 = 0;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 133) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					@Pc(3488) byte local3488 = this.aClass1_Sub3_Sub3_5.method384();
					this.anIntArray49[local160] = local3488;
					if (this.anIntArray63[local160] != local3488) {
						this.anIntArray63[local160] = local3488;
						this.method153(local160);
						this.aBoolean69 = true;
						if (this.anInt202 != -1) {
							this.aBoolean60 = true;
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 55) {
					for (local160 = 0; local160 < this.aClass1_Sub1_Sub3_Sub2Array1.length; local160++) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local160] != null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local160].anInt921 = -1;
						}
					}
					for (local185 = 0; local185 < this.aClass1_Sub1_Sub3_Sub1Array1.length; local185++) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local185] != null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local185].anInt921 = -1;
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 80) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method385();
					Class15.aClass15Array1[local160].anInt489 = local185;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 38) {
					this.aBoolean69 = true;
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local1728 = Class15.aClass15Array1[local160];
					while (this.aClass1_Sub3_Sub3_5.anInt566 < this.anInt281) {
						local191 = this.aClass1_Sub3_Sub3_5.method383();
						local197 = this.aClass1_Sub3_Sub3_5.method385();
						local201 = this.aClass1_Sub3_Sub3_5.method383();
						if (local201 == 255) {
							local201 = this.aClass1_Sub3_Sub3_5.method388();
						}
						if (local191 >= 0 && local191 < local1728.anIntArray149.length) {
							local1728.anIntArray149[local191] = local197;
							local1728.anIntArray150[local191] = local201;
						}
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 100) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local185 = this.aClass1_Sub3_Sub3_5.method383();
					if (local160 == 65535) {
						local160 = -1;
					}
					this.anIntArray68[local185] = local160;
					this.aBoolean69 = true;
					this.aBoolean47 = true;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 186) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					local1728 = Class15.aClass15Array1[local160];
					for (local191 = 0; local191 < local1728.anIntArray149.length; local191++) {
						local1728.anIntArray149[local191] = -1;
						local1728.anIntArray149[local191] = 0;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 218) {
					local160 = this.aClass1_Sub3_Sub3_5.method385();
					@Pc(3747) boolean local3747 = this.aClass1_Sub3_Sub3_5.method383() == 1;
					Class15.aClass15Array1[local160].aBoolean104 = local3747;
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 98) {
					this.anInt305 = this.aClass1_Sub3_Sub3_5.method383();
					if (this.anInt305 == this.anInt325) {
						if (this.anInt305 == 3) {
							this.anInt325 = 1;
						} else {
							this.anInt325 = 3;
						}
						this.aBoolean69 = true;
					}
					this.anInt282 = -1;
					return true;
				}
				if (this.anInt282 == 254) {
					this.aBoolean62 = false;
					this.aBoolean57 = true;
					this.aString7 = "";
					this.aBoolean60 = true;
					this.anInt282 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt282 + "," + this.anInt281 + " - " + this.anInt212 + "," + this.anInt213);
				this.method80();
			} catch (@Pc(3841) IOException local3841) {
				this.method83(928);
			} catch (@Pc(3846) Exception local3846) {
				local894 = "T2 - " + this.anInt282 + "," + this.anInt212 + "," + this.anInt213 + " - " + this.anInt281 + "," + (this.anInt296 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0]) + "," + (this.anInt297 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0]) + " - ";
				for (local185 = 0; local185 < this.anInt281 && local185 < 50; local185++) {
					local894 = local894 + this.aClass1_Sub3_Sub3_5.aByteArray7[local185] + ",";
				}
				signlink.reporterror(local894);
				this.method80();
			}
			return true;
		} catch (@Pc(3929) RuntimeException local3929) {
			signlink.reporterror("2335, " + 47042 + ", " + local3929.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method148(@OriginalArg(0) int arg0) {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray71[local5 + 32512] = 255;
				}
			}
			if (arg0 < 9 || arg0 > 9) {
				this.method67();
			}
			@Pc(49) int local49;
			@Pc(56) int local56;
			@Pc(62) int local62;
			for (local12 = 0; local12 < 100; local12++) {
				local49 = (int) (Math.random() * 124.0D) + 2;
				local56 = (int) (Math.random() * 128.0D) + 128;
				local62 = local49 + (local56 << 7);
				this.anIntArray71[local62] = 192;
			}
			for (local49 = 1; local49 < 255; local49++) {
				for (local56 = 1; local56 < 127; local56++) {
					local62 = local56 + (local49 << 7);
					this.anIntArray72[local62] = (this.anIntArray71[local62 - 1] + this.anIntArray71[local62 + 1] + this.anIntArray71[local62 - 128] + this.anIntArray71[local62 + 128]) / 4;
				}
			}
			this.anInt236 += 128;
			if (this.anInt236 > this.anIntArray55.length) {
				this.anInt236 -= this.anIntArray55.length;
				local56 = (int) (Math.random() * 12.0D);
				this.method117(this.aClass1_Sub3_Sub2_Sub3Array3[local56]);
			}
			@Pc(174) int local174;
			for (local56 = 1; local56 < 255; local56++) {
				for (local62 = 1; local62 < 127; local62++) {
					local174 = local62 + (local56 << 7);
					@Pc(197) int local197 = this.anIntArray72[local174 + 128] - this.anIntArray55[local174 + this.anInt236 & this.anIntArray55.length - 1] / 5;
					if (local197 < 0) {
						local197 = 0;
					}
					this.anIntArray71[local174] = local197;
				}
			}
			for (local62 = 0; local62 < 255; local62++) {
				this.anIntArray87[local62] = this.anIntArray87[local62 + 1];
			}
			this.anIntArray87[255] = (int) (Math.sin((double) anInt239 / 14.0D) * 16.0D + Math.sin((double) anInt239 / 15.0D) * 14.0D + Math.sin((double) anInt239 / 16.0D) * 12.0D);
			if (this.anInt244 > 0) {
				this.anInt244 -= 4;
			}
			if (this.anInt245 > 0) {
				this.anInt245 -= 4;
			}
			if (this.anInt244 == 0 && this.anInt245 == 0) {
				local174 = (int) (Math.random() * 2000.0D);
				if (local174 == 0) {
					this.anInt244 = 1024;
				}
				if (local174 == 1) {
					this.anInt245 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("38618, " + arg0 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;B)Z")
	private boolean method149(@OriginalArg(0) Class15 arg0) {
		try {
			if (arg0.anIntArray151 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray151.length; local6++) {
				@Pc(14) int local14 = this.method79(arg0, local6);
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
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("24648, " + arg0 + ", " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;BI)V")
	private void method150(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt567 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method394(13);
					if (local12 != 8191) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local12] = new Class1_Sub1_Sub3_Sub1();
						}
						@Pc(32) Class1_Sub1_Sub3_Sub1 local32 = this.aClass1_Sub1_Sub3_Sub1Array1[local12];
						this.anIntArray62[this.anInt234++] = local12;
						local32.anInt938 = anInt239;
						local32.aClass3_1 = Class3.method32(arg0.method394(11));
						local32.anInt899 = local32.aClass3_1.aByte8;
						local32.anInt902 = local32.aClass3_1.anInt65;
						local32.anInt903 = local32.aClass3_1.anInt66;
						local32.anInt904 = local32.aClass3_1.anInt67;
						local32.anInt905 = local32.aClass3_1.anInt68;
						local32.anInt900 = local32.aClass3_1.anInt64;
						@Pc(88) int local88 = arg0.method394(5);
						if (local88 > 15) {
							local88 -= 32;
						}
						@Pc(97) int local97 = arg0.method394(5);
						if (local97 > 15) {
							local97 -= 32;
						}
						local32.method561(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + local97, false, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + local88);
						@Pc(124) int local124 = arg0.method394(1);
						if (local124 == 1) {
							this.anIntArray46[this.anInt188++] = local12;
						}
						continue;
					}
				}
				arg0.method395();
				return;
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("74070, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;IILjava/lang/String;)Lclient!ub;")
	private Class39 method151(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			@Pc(3) int local3 = 5;
			@Pc(6) byte[] local6 = signlink.cacheload(arg4);
			@Pc(20) int local20;
			if (local6 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local6);
				local20 = (int) this.aCRC32_1.getValue();
				if (local20 != arg3) {
					local6 = null;
				}
			}
			if (local6 != null) {
				return new Class39(true, local6);
			}
			while (local6 == null) {
				this.method74(arg2, "Requesting " + arg1);
				try {
					local20 = 0;
					@Pc(59) DataInputStream local59 = this.method189(arg4 + arg3);
					@Pc(62) byte[] local62 = new byte[6];
					local59.readFully(local62, 0, 6);
					@Pc(73) Class1_Sub3_Sub3 local73 = new Class1_Sub3_Sub3(0, local62);
					local73.anInt566 = 3;
					@Pc(81) int local81 = local73.method387() + 6;
					@Pc(83) int local83 = 6;
					local6 = new byte[local81];
					for (@Pc(88) int local88 = 0; local88 < 6; local88++) {
						local6[local88] = local62[local88];
					}
					while (local83 < local81) {
						@Pc(106) int local106 = local81 - local83;
						if (local106 > 1000) {
							local106 = 1000;
						}
						local83 += local59.read(local6, local83, local106);
						@Pc(125) int local125 = local83 * 100 / local81;
						if (local125 != local20) {
							this.method74(arg2, "Loading " + arg1 + " - " + local125 + "%");
						}
						local20 = local125;
					}
					local59.close();
				} catch (@Pc(154) IOException local154) {
					local6 = null;
					for (local20 = local3; local20 > 0; local20--) {
						this.method74(arg2, "Error loading - Will retry in " + local20 + " secs.");
						try {
							Thread.sleep(1000L);
						} catch (@Pc(177) Exception local177) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
				}
			}
			signlink.cachesave(arg4, local6);
			if (arg0 != -68) {
				for (local20 = 1; local20 > 0; local20++) {
				}
			}
			return new Class39(true, local6);
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("2859, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method152() {
		try {
			@Pc(7) int local7;
			if (this.anInt240 != 35328) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			@Pc(29) int local29;
			if (this.anInt260 == 0) {
				local7 = super.anInt126 / 2 - 80;
				local29 = super.anInt127 / 2 + 20;
				local29 += 20;
				if (super.anInt132 == 1 && super.anInt133 >= local7 - 75 && super.anInt133 <= local7 + 75 && super.anInt134 >= local29 - 20 && super.anInt134 <= local29 + 20) {
					this.anInt260 = 3;
					this.anInt322 = 0;
				}
				local7 = super.anInt126 / 2 + 80;
				if (super.anInt132 == 1 && super.anInt133 >= local7 - 75 && super.anInt133 <= local7 + 75 && super.anInt134 >= local29 - 20 && super.anInt134 <= local29 + 20) {
					this.aString11 = "";
					this.aString12 = "Enter your username & password.";
					this.anInt260 = 2;
					this.anInt322 = 0;
				}
			} else if (this.anInt260 == 2) {
				local7 = super.anInt127 / 2 - 40;
				local7 += 30;
				local7 += 25;
				if (super.anInt132 == 1 && super.anInt134 >= local7 - 15 && super.anInt134 < local7) {
					this.anInt322 = 0;
				}
				local7 += 15;
				if (super.anInt132 == 1 && super.anInt134 >= local7 - 15 && super.anInt134 < local7) {
					this.anInt322 = 1;
				}
				local7 += 15;
				local29 = super.anInt126 / 2 - 80;
				@Pc(175) int local175 = super.anInt127 / 2 + 50;
				@Pc(176) int local176 = local175 + 20;
				if (super.anInt132 == 1 && super.anInt133 >= local29 - 75 && super.anInt133 <= local29 + 75 && super.anInt134 >= local176 - 20 && super.anInt134 <= local176 + 20) {
					this.method168(this.aString17, this.aString18, false);
				}
				local29 = super.anInt126 / 2 + 80;
				if (super.anInt132 == 1 && super.anInt133 >= local29 - 75 && super.anInt133 <= local29 + 75 && super.anInt134 >= local176 - 20 && super.anInt134 <= local176 + 20) {
					this.anInt260 = 0;
					this.aString17 = "";
					this.aString18 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method66();
						if (local259 == -1) {
							return;
						}
						@Pc(264) boolean local264 = false;
						for (@Pc(266) int local266 = 0; local266 < aString5.length(); local266++) {
							if (local259 == aString5.charAt(local266)) {
								local264 = true;
								break;
							}
						}
						if (this.anInt322 == 0) {
							if (local259 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt322 = 1;
							}
							if (local264) {
								this.aString17 = this.aString17 + (char) local259;
							}
							if (this.aString17.length() > 12) {
								this.aString17 = this.aString17.substring(0, 12);
							}
						} else if (this.anInt322 == 1) {
							if (local259 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt322 = 0;
							}
							if (local264) {
								this.aString18 = this.aString18 + (char) local259;
							}
							if (this.aString18.length() > 20) {
								this.aString18 = this.aString18.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt260 == 3) {
				local7 = super.anInt126 / 2;
				local29 = super.anInt127 / 2 + 50;
				@Pc(423) int local423 = local29 + 20;
				if (super.anInt132 == 1 && super.anInt133 >= local7 - 75 && super.anInt133 <= local7 + 75 && super.anInt134 >= local423 - 20 && super.anInt134 <= local423 + 20) {
					this.anInt260 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("49900, " + 35328 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ZI)V")
	private void method153(@OriginalArg(1) int arg0) {
		try {
			@Pc(14) int local14 = Class23.aClass23Array1[arg0].anInt613;
			if (local14 != 0) {
				@Pc(22) int local22 = this.anIntArray63[arg0];
				if (local14 == 1) {
					if (local22 == 1) {
						Class1_Sub3_Sub2_Sub1.method294(0.9D);
					}
					if (local22 == 2) {
						Class1_Sub3_Sub2_Sub1.method294(0.8D);
					}
					if (local22 == 3) {
						Class1_Sub3_Sub2_Sub1.method294(0.7D);
					}
					if (local22 == 4) {
						Class1_Sub3_Sub2_Sub1.method294(0.6D);
					}
					Class5.aClass35_5.method521();
					this.aBoolean64 = true;
				}
				if (local14 == 3) {
					@Pc(60) boolean local60 = this.aBoolean46;
					if (local22 == 0) {
						this.method92(this.aBoolean46, 0);
						this.aBoolean46 = true;
					}
					if (local22 == 1) {
						this.method92(this.aBoolean46, -400);
						this.aBoolean46 = true;
					}
					if (local22 == 2) {
						this.method92(this.aBoolean46, -800);
						this.aBoolean46 = true;
					}
					if (local22 == 3) {
						this.method92(this.aBoolean46, -1200);
						this.aBoolean46 = true;
					}
					if (local22 == 4) {
						this.aBoolean46 = false;
					}
					if (this.aBoolean46 != local60) {
						if (this.aBoolean46) {
							this.method118(this.anInt313, this.anInt215, this.aString6);
						} else {
							this.method96();
						}
						this.anInt228 = 0;
					}
				}
				if (local14 == 4) {
					if (local22 == 0) {
						this.aBoolean56 = true;
						this.method182(0);
					}
					if (local22 == 1) {
						this.aBoolean56 = true;
						this.method182(-400);
					}
					if (local22 == 2) {
						this.aBoolean56 = true;
						this.method182(-800);
					}
					if (local22 == 3) {
						this.aBoolean56 = true;
						this.method182(-1200);
					}
					if (local22 == 4) {
						this.aBoolean56 = false;
					}
				}
				if (local14 == 5) {
					this.anInt306 = local22;
				}
				if (local14 == 6) {
					this.anInt182 = local22;
				}
				if (local14 == 8) {
					this.anInt138 = local22;
					this.aBoolean60 = true;
				}
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("77214, " + false + ", " + arg0 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method154() {
		try {
			this.aBoolean61 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean53) {
					this.method148(this.anInt310);
					this.method148(this.anInt310);
					this.method99();
					local6++;
					if (local6 > 10) {
						@Pc(27) long local27 = System.currentTimeMillis();
						@Pc(36) int local36 = (int) (local27 - local4) / 10 - local8;
						local8 = 40 - local36;
						if (local8 < 5) {
							local8 = 5;
						}
						local6 = 0;
						local4 = local27;
					}
					try {
						Thread.sleep((long) local8);
					} catch (@Pc(54) Exception local54) {
					}
				}
			} catch (@Pc(60) Exception local60) {
			}
			this.aBoolean61 = false;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("26287, " + 24 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method155() {
		try {
			if (this.anInt221 == 0) {
				this.aStringArray8[0] = "Cancel";
				this.anIntArray52[0] = 1333;
				this.anInt252 = 1;
				this.method142(super.anInt131, super.anInt130);
				this.anInt312 = 0;
				if (super.anInt130 > 8 && super.anInt131 > 11 && super.anInt130 < 520 && super.anInt131 < 345) {
					if (this.anInt286 == -1) {
						this.method130(this.anInt184);
					} else {
						this.method76(super.anInt130, 8, 0, super.anInt131, 11, Class15.aClass15Array1[this.anInt286]);
					}
				}
				if (this.anInt312 != this.anInt256) {
					this.anInt256 = this.anInt312;
				}
				this.anInt312 = 0;
				if (super.anInt130 > 562 && super.anInt131 > 231 && super.anInt130 < 752 && super.anInt131 < 492) {
					if (this.anInt289 != -1) {
						this.method76(super.anInt130, 562, 0, super.anInt131, 231, Class15.aClass15Array1[this.anInt289]);
					} else if (this.anIntArray68[this.anInt325] != -1) {
						this.method76(super.anInt130, 562, 0, super.anInt131, 231, Class15.aClass15Array1[this.anIntArray68[this.anInt325]]);
					}
				}
				if (this.anInt312 != this.anInt217) {
					this.aBoolean69 = true;
					this.anInt217 = this.anInt312;
				}
				this.anInt312 = 0;
				if (super.anInt130 > 22 && super.anInt131 > 375 && super.anInt130 < 431 && super.anInt131 < 471) {
					if (this.anInt288 == -1) {
						this.method97(super.anInt130 - 22, super.anInt131 - 375);
					} else {
						this.method76(super.anInt130, 22, 0, super.anInt131, 375, Class15.aClass15Array1[this.anInt288]);
					}
				}
				if (this.anInt288 != -1 && this.anInt312 != this.anInt226) {
					this.aBoolean60 = true;
					this.anInt226 = this.anInt312;
				}
				@Pc(224) boolean local224 = false;
				while (!local224) {
					local224 = true;
					for (@Pc(230) int local230 = 0; local230 < this.anInt252 - 1; local230++) {
						if (this.anIntArray52[local230] < 1000 && this.anIntArray52[local230 + 1] > 1000) {
							@Pc(251) String local251 = this.aStringArray8[local230];
							this.aStringArray8[local230] = this.aStringArray8[local230 + 1];
							this.aStringArray8[local230 + 1] = local251;
							@Pc(273) int local273 = this.anIntArray52[local230];
							this.anIntArray52[local230] = this.anIntArray52[local230 + 1];
							this.anIntArray52[local230 + 1] = local273;
							@Pc(295) int local295 = this.anIntArray50[local230];
							this.anIntArray50[local230] = this.anIntArray50[local230 + 1];
							this.anIntArray50[local230 + 1] = local295;
							@Pc(317) int local317 = this.anIntArray51[local230];
							this.anIntArray51[local230] = this.anIntArray51[local230 + 1];
							this.anIntArray51[local230 + 1] = local317;
							@Pc(339) int local339 = this.anIntArray53[local230];
							this.anIntArray53[local230] = this.anIntArray53[local230 + 1];
							this.anIntArray53[local230 + 1] = local339;
							local224 = false;
						}
					}
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("65502, " + 9 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method72(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != anInt243) {
				this.anInt282 = -1;
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("67529, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method156() {
		try {
			@Pc(2) int local2 = this.anInt143;
			@Pc(5) int local5 = this.anInt144;
			@Pc(8) int local8 = this.anInt145;
			@Pc(11) int local11 = this.anInt146;
			Class1_Sub3_Sub2.method354(6116423, local2, local5, local8, local11);
			Class1_Sub3_Sub2.method354(0, local2 + 1, local5 + 1, local8 - 2, 16);
			Class1_Sub3_Sub2.method355(0, aBoolean65, local2 + 1, local5 + 18, local11 - 19, local8 - 2);
			this.aClass1_Sub3_Sub2_Sub4_3.method361(local2 + 3, 6116423, "Choose Option", local5 + 14);
			@Pc(70) int local70 = super.anInt130;
			@Pc(73) int local73 = super.anInt131;
			if (this.anInt142 == 0) {
				local70 -= 8;
				local73 -= 11;
			}
			if (this.anInt142 == 1) {
				local70 -= 562;
				local73 -= 231;
			}
			if (this.anInt142 == 2) {
				local70 -= 22;
				local73 -= 375;
			}
			for (@Pc(92) int local92 = 0; local92 < this.anInt252; local92++) {
				@Pc(107) int local107 = local5 + (this.anInt252 - 1 - local92) * 15 + 31;
				@Pc(109) int local109 = 16777215;
				if (local70 > local2 && local70 < local2 + local8 && local73 > local107 - 13 && local73 < local107 + 3) {
					local109 = 16776960;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method363(local2 + 3, local109, local107, this.aStringArray8[local92], true);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("3903, " + 8 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4 >= 1 && arg3 >= 1 && arg4 <= 102 && arg3 <= 102) {
				if (aBoolean40 && arg5 != this.anInt172) {
					return;
				}
				@Pc(27) int local27 = 0;
				if (arg0 == 0) {
					local27 = this.aClass33_1.method486(arg5, arg4, arg3);
				}
				if (arg0 == 1) {
					local27 = this.aClass33_1.method487(arg5, arg3, arg4);
				}
				if (arg0 == 2) {
					local27 = this.aClass33_1.method488(arg5, arg4, arg3);
				}
				if (arg0 == 3) {
					local27 = this.aClass33_1.method489(arg5, arg4, arg3);
				}
				@Pc(83) int local83;
				if (local27 != 0) {
					local83 = this.aClass33_1.method490(arg5, arg4, arg3, local27);
					@Pc(89) int local89 = local27 >> 14 & 0x7FFF;
					@Pc(93) int local93 = local83 & 0x1F;
					@Pc(97) int local97 = local83 >> 6;
					@Pc(109) Class2 local109;
					if (arg0 == 0) {
						this.aClass33_1.method481(arg5, arg3, arg4);
						local109 = Class2.method23(local89);
						if (local109.aBoolean7) {
							this.aClass9Array1[arg5].method253(local97, arg3, local93, arg4, local109.aBoolean8);
						}
					}
					if (arg0 == 1) {
						this.aClass33_1.method482(arg3, arg5, arg4);
					}
					if (arg0 == 2) {
						this.aClass33_1.method483(arg5, arg4, arg3);
						local109 = Class2.method23(local89);
						if (arg4 + local109.anInt40 > 103 || arg3 + local109.anInt40 > 103 || arg4 + local109.anInt41 > 103 || arg3 + local109.anInt41 > 103) {
							return;
						}
						if (local109.aBoolean7) {
							this.aClass9Array1[arg5].method254(arg3, local109.anInt40, local109.anInt41, local109.aBoolean8, local97, this.anInt171, arg4);
						}
					}
					if (arg0 == 3) {
						this.aClass33_1.method484(arg5, arg4, arg3);
						local109 = Class2.method23(local89);
						if (local109.aBoolean7 && local109.aBoolean9) {
							this.aClass9Array1[arg5].method256(arg3, arg4);
						}
					}
				}
				if (arg6 >= 0) {
					local83 = arg5;
					if (arg5 < 3 && (this.aByteArrayArrayArray7[1][arg4][arg3] & 0x2) == 2) {
						local83 = arg5 + 1;
					}
					Class4.method50(this.aClass9Array1[arg5], arg5, arg3, this.anIntArrayArrayArray3, arg6, this.aClass28_3, arg4, arg2, this.aClass33_1, local83, arg1);
					return;
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("40736, " + arg0 + ", " + 36300 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local259.toString());
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
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass6_1 = null;
			this.method96();
			this.aBoolean59 = false;
			this.aClass1_Sub3_Sub3_6 = null;
			this.aClass1_Sub3_Sub3_4 = null;
			this.aClass1_Sub3_Sub3_5 = null;
			this.anIntArray70 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass33_1 = null;
			this.aClass9Array1 = null;
			this.anIntArrayArray3 = null;
			this.anIntArrayArray2 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.aByteArray4 = null;
			this.aClass32_3 = null;
			this.aClass32_4 = null;
			this.aClass32_5 = null;
			this.aClass32_6 = null;
			this.aClass32_7 = null;
			this.aClass32_8 = null;
			this.aClass32_9 = null;
			this.aClass32_19 = null;
			this.aClass32_20 = null;
			this.aClass32_21 = null;
			this.aClass32_22 = null;
			this.aClass32_23 = null;
			this.aClass32_24 = null;
			this.aClass32_25 = null;
			this.aClass32_26 = null;
			this.aClass32_27 = null;
			this.aClass32_28 = null;
			this.aClass1_Sub3_Sub2_Sub3_18 = null;
			this.aClass1_Sub3_Sub2_Sub3_19 = null;
			this.aClass1_Sub3_Sub2_Sub3_20 = null;
			this.aClass1_Sub3_Sub2_Sub3_15 = null;
			this.aClass1_Sub3_Sub2_Sub3_16 = null;
			this.aClass1_Sub3_Sub2_Sub3_17 = null;
			this.aClass1_Sub3_Sub2_Sub3Array2 = null;
			this.aClass1_Sub3_Sub2_Sub3_10 = null;
			this.aClass1_Sub3_Sub2_Sub3_11 = null;
			this.aClass1_Sub3_Sub2_Sub3_12 = null;
			this.aClass1_Sub3_Sub2_Sub3_13 = null;
			this.aClass1_Sub3_Sub2_Sub3_14 = null;
			this.aClass1_Sub3_Sub2_Sub3_1 = null;
			this.aClass1_Sub3_Sub2_Sub3_2 = null;
			this.aClass1_Sub3_Sub2_Sub3_3 = null;
			this.aClass1_Sub3_Sub2_Sub3_4 = null;
			this.aClass1_Sub3_Sub2_Sub3_5 = null;
			this.aClass1_Sub3_Sub2_Sub2_3 = null;
			this.aClass1_Sub3_Sub2_Sub2Array5 = null;
			this.aClass1_Sub3_Sub2_Sub2Array4 = null;
			this.aClass1_Sub3_Sub2_Sub2Array7 = null;
			this.aClass1_Sub3_Sub2_Sub2_5 = null;
			this.aClass1_Sub3_Sub2_Sub2_6 = null;
			this.aClass1_Sub3_Sub2_Sub2_7 = null;
			this.aClass1_Sub3_Sub2_Sub2_8 = null;
			this.aClass1_Sub3_Sub2_Sub3Array1 = null;
			this.aClass1_Sub3_Sub2_Sub2Array3 = null;
			this.anIntArrayArray4 = null;
			this.aClass1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray45 = null;
			this.anIntArray46 = null;
			this.aClass1_Sub3_Sub3Array1 = null;
			this.anIntArray65 = null;
			this.aClass1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray62 = null;
			this.aClass28ArrayArrayArray1 = null;
			this.aClass28_1 = null;
			this.aClass28_5 = null;
			this.aClass28_4 = null;
			this.aClass28_2 = null;
			this.aClass28_3 = null;
			this.anIntArray50 = null;
			this.anIntArray51 = null;
			this.anIntArray52 = null;
			this.anIntArray53 = null;
			this.aStringArray8 = null;
			this.anIntArray63 = null;
			this.anIntArray58 = null;
			this.anIntArray59 = null;
			this.aClass1_Sub3_Sub2_Sub2Array6 = null;
			this.aClass1_Sub3_Sub2_Sub2_4 = null;
			this.aStringArray9 = null;
			this.aLongArray4 = null;
			this.anIntArray64 = null;
			this.aClass32_13 = null;
			this.aClass32_14 = null;
			this.aClass32_10 = null;
			this.aClass32_11 = null;
			this.aClass32_12 = null;
			this.aClass32_15 = null;
			this.aClass32_16 = null;
			this.aClass32_17 = null;
			this.aClass32_18 = null;
			this.method184();
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
			Class1_Sub3_Sub2_Sub1.method285();
			Class33.method458();
			Class1_Sub3_Sub1.method223();
			Class10.aClass10Array1 = null;
			Class12.aClass12Array1 = null;
			System.gc();
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("43591, " + -12828 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method158() {
		try {
			for (@Pc(6) Class1_Sub1_Sub2 local6 = (Class1_Sub1_Sub2) this.aClass28_2.method448(); local6 != null; local6 = (Class1_Sub1_Sub2) this.aClass28_2.method450()) {
				if (local6.anInt56 != this.anInt172 || local6.aBoolean18) {
					local6.method559();
				} else if (anInt239 >= local6.anInt55) {
					local6.method29(this.anInt161);
					if (local6.aBoolean18) {
						local6.method559();
					} else {
						this.aClass33_1.method470(60, 0, local6.anInt57, local6.anInt59, -1, local6.anInt56, local6, null, local6.anInt58, false);
					}
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("87917, " + -211 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
	private int method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			@Pc(9) int local9 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local9 = arg2 + 1;
			}
			@Pc(29) int local29 = arg1 & 0x7F;
			@Pc(33) int local33 = arg0 & 0x7F;
			@Pc(61) int local61 = this.anIntArrayArrayArray3[local9][local3][local7] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7] * local29 >> 7;
			this.aBoolean37 &= true;
			@Pc(99) int local99 = this.anIntArrayArrayArray3[local9][local3][local7 + 1] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7 + 1] * local29 >> 7;
			return local61 * (128 - local33) + local99 * local33 >> 7;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("44761, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt151 = Integer.parseInt(this.getParameter("nodeid"));
		anInt152 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method186(anInt183);
		} else {
			method113();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean39 = false;
		} else {
			aBoolean39 = true;
		}
		this.method63();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method161() {
		try {
			Class2.aClass35_1.method521();
			Class2.aClass35_2.method521();
			Class3.aClass35_3.method521();
			Class5.aClass35_4.method521();
			Class5.aClass35_5.method521();
			Class1_Sub1_Sub3_Sub2.aClass35_9.method521();
			Class21.aClass35_8.method521();
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("97574, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method162(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 3) {
				@Pc(6) boolean local6 = false;
			}
			for (@Pc(19) Class1_Sub6 local19 = (Class1_Sub6) this.aClass28_3.method448(); local19 != null; local19 = (Class1_Sub6) this.aClass28_3.method450()) {
				@Pc(23) boolean local23 = false;
				local19.anInt661 += this.anInt161;
				if (local19.anInt660 == -1) {
					local19.anInt660 = 0;
					local23 = true;
				}
				label74: {
					do {
						do {
							if (local19.anInt661 <= local19.aClass19_2.anIntArray188[local19.anInt660]) {
								break label74;
							}
							local19.anInt661 -= local19.aClass19_2.anIntArray188[local19.anInt660] + 1;
							local19.anInt660++;
							local23 = true;
						} while (local19.anInt660 < local19.aClass19_2.anInt546);
						local19.anInt660 -= local19.aClass19_2.anInt547;
					} while (local19.anInt660 >= 0 && local19.anInt660 < local19.aClass19_2.anInt546);
					local19.method559();
					local23 = false;
				}
				if (local23) {
					@Pc(105) int local105 = local19.anInt655;
					@Pc(108) int local108 = local19.anInt657;
					@Pc(111) int local111 = local19.anInt658;
					@Pc(113) int local113 = 0;
					if (local19.anInt656 == 0) {
						local113 = this.aClass33_1.method486(local105, local108, local111);
					}
					if (local19.anInt656 == 1) {
						local113 = this.aClass33_1.method487(local105, local111, local108);
					}
					if (local19.anInt656 == 2) {
						local113 = this.aClass33_1.method488(local105, local108, local111);
					}
					if (local19.anInt656 == 3) {
						local113 = this.aClass33_1.method489(local105, local108, local111);
					}
					if (local113 != 0 && (local113 >> 14 & 0x7FFF) == local19.anInt659) {
						@Pc(180) int local180 = this.anIntArrayArrayArray3[local105][local108][local111];
						@Pc(191) int local191 = this.anIntArrayArrayArray3[local105][local108 + 1][local111];
						@Pc(204) int local204 = this.anIntArrayArrayArray3[local105][local108 + 1][local111 + 1];
						@Pc(215) int local215 = this.anIntArrayArrayArray3[local105][local108][local111 + 1];
						@Pc(219) Class2 local219 = Class2.method23(local19.anInt659);
						@Pc(221) int local221 = -1;
						if (local19.anInt660 != -1) {
							local221 = local19.aClass19_2.anIntArray186[local19.anInt660];
						}
						@Pc(244) int local244;
						@Pc(248) int local248;
						@Pc(252) int local252;
						@Pc(267) Class1_Sub3_Sub1 local267;
						if (local19.anInt656 == 2) {
							local244 = this.aClass33_1.method490(local105, local108, local111, local113);
							local248 = local244 & 0x1F;
							local252 = local244 >> 6;
							if (local248 == 11) {
								local248 = 10;
							}
							local267 = local219.method26(local248, local252, local180, local191, local204, local215, local221);
							this.aClass33_1.method475(local105, local267, local108, local111);
						} else if (local19.anInt656 == 1) {
							@Pc(291) Class1_Sub3_Sub1 local291 = local219.method26(4, 0, local180, local191, local204, local215, local221);
							this.aClass33_1.method477(local108, local291, local111, local105);
						} else if (local19.anInt656 == 0) {
							local244 = this.aClass33_1.method490(local105, local108, local111, local113);
							local248 = local244 & 0x1F;
							local252 = local244 >> 6;
							if (local248 == 2) {
								@Pc(329) int local329 = local252 + 1 & 0x3;
								@Pc(341) Class1_Sub3_Sub1 local341 = local219.method26(2, local252 + 4, local180, local191, local204, local215, local221);
								@Pc(351) Class1_Sub3_Sub1 local351 = local219.method26(2, local329, local180, local191, local204, local215, local221);
								this.aClass33_1.method480(local108, local111, local341, local105, local351);
							} else {
								local267 = local219.method26(local248, local252, local180, local191, local204, local215, local221);
								this.aClass33_1.method479(local111, local108, local267, local105);
							}
						} else if (local19.anInt656 == 3) {
							local244 = this.aClass33_1.method490(local105, local108, local111, local113);
							local248 = local244 >> 6;
							@Pc(408) Class1_Sub3_Sub1 local408 = local219.method26(22, local248, local180, local191, local204, local215, local221);
							this.aClass33_1.method478(local111, local108, local105, local408);
						}
					} else {
						local19.method559();
					}
				}
			}
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("79959, " + arg0 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBII)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg3 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg2;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub3_Sub1.anIntArray124[local5];
				local27 = Class1_Sub3_Sub1.anIntArray125[local5];
				local37 = local27 * 0 - arg2 * local23 >> 16;
				local17 = local23 * 0 + arg2 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub3_Sub1.anIntArray124[local11];
				local27 = Class1_Sub3_Sub1.anIntArray125[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt264 = arg1 - local13;
			this.anInt265 = arg5 - local15;
			this.anInt266 = arg0 - local17;
			this.anInt267 = arg3;
			this.anInt268 = arg4;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("29942, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 34 + ", " + arg4 + ", " + arg5 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method164() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt187; local3++) {
				if (local3 == -1) {
					local11 = this.anInt186;
				} else {
					local11 = this.anIntArray45[local3];
				}
				@Pc(23) Class1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null && local23.anInt907 > 0) {
					local23.anInt907--;
					if (local23.anInt907 == 0) {
						local23.aString29 = null;
					}
				}
			}
			if (this.aByte24 != 42) {
				this.method67();
			}
			for (local11 = 0; local11 < this.anInt234; local11++) {
				@Pc(60) int local60 = this.anIntArray62[local11];
				@Pc(65) Class1_Sub1_Sub3_Sub1 local65 = this.aClass1_Sub1_Sub3_Sub1Array1[local60];
				if (local65 != null && local65.anInt907 > 0) {
					local65.anInt907--;
					if (local65.anInt907 == 0) {
						local65.aString29 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("85663, " + 42 + ", " + local89.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;IZ)V")
	private void method165(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			while (true) {
				if (arg0.anInt567 + 10 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method394(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local12] = new Class1_Sub1_Sub3_Sub2();
							if (this.aClass1_Sub3_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub3_Sub2Array1[local12].method564((byte) 4, this.aClass1_Sub3_Sub3Array1[local12]);
							}
						}
						this.anIntArray45[this.anInt187++] = local12;
						@Pc(58) Class1_Sub1_Sub3_Sub2 local58 = this.aClass1_Sub1_Sub3_Sub2Array1[local12];
						local58.anInt938 = anInt239;
						@Pc(66) int local66 = arg0.method394(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg0.method394(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg0.method394(1);
						local58.method561(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + local75, local84 == 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + local66);
						@Pc(112) int local112 = arg0.method394(1);
						if (local112 == 1) {
							this.anIntArray46[this.anInt188++] = local12;
						}
						continue;
					}
				}
				arg0.method395();
				if (arg2) {
					return;
				}
				return;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("16007, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZIIIII)Z")
	private boolean method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray3[local7][local11] = 0;
					this.anIntArrayArray2[local7][local11] = 99999999;
				}
			}
			local11 = arg7;
			@Pc(39) int local39 = arg0;
			this.anIntArrayArray3[arg7][arg0] = 99;
			this.anIntArrayArray2[arg7][arg0] = 0;
			@Pc(66) byte local66 = 0;
			@Pc(68) int local68 = 0;
			this.anIntArray60[0] = arg7;
			@Pc(77) int local77 = local66 + 1;
			this.anIntArray61[0] = arg0;
			@Pc(81) boolean local81 = false;
			@Pc(85) int local85 = this.anIntArray60.length;
			@Pc(92) int[][] local92 = this.aClass9Array1[this.anInt172].anIntArrayArray10;
			@Pc(203) int local203;
			while (local68 != local77) {
				local11 = this.anIntArray60[local68];
				local39 = this.anIntArray61[local68];
				local68 = (local68 + 1) % local85;
				if (local11 == arg3 && local39 == arg4) {
					local81 = true;
					break;
				}
				if (arg2 != 0) {
					if ((arg2 < 5 || arg2 == 10) && this.aClass9Array1[this.anInt172].method257(arg4, local11, arg3, arg6, arg2 - 1, local39)) {
						local81 = true;
						break;
					}
					if (arg2 < 10 && this.aClass9Array1[this.anInt172].method258(arg3, local11, arg6, arg4, local39, arg2 - 1)) {
						local81 = true;
						break;
					}
				}
				if (arg8 != 0 && arg10 != 0 && this.aClass9Array1[this.anInt172].method259(arg8, arg3, arg10, arg4, local39, local11, arg1)) {
					local81 = true;
					break;
				}
				local203 = this.anIntArrayArray2[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray3[local11 - 1][local39] == 0 && (local92[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray60[local77] = local11 - 1;
					this.anIntArray61[local77] = local39;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 - 1][local39] = 2;
					this.anIntArrayArray2[local11 - 1][local39] = local203;
				}
				if (local11 < 103 && this.anIntArrayArray3[local11 + 1][local39] == 0 && (local92[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray60[local77] = local11 + 1;
					this.anIntArray61[local77] = local39;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 + 1][local39] = 8;
					this.anIntArrayArray2[local11 + 1][local39] = local203;
				}
				if (local39 > 0 && this.anIntArrayArray3[local11][local39 - 1] == 0 && (local92[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local77] = local11;
					this.anIntArray61[local77] = local39 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11][local39 - 1] = 1;
					this.anIntArrayArray2[local11][local39 - 1] = local203;
				}
				if (local39 < 103 && this.anIntArrayArray3[local11][local39 + 1] == 0 && (local92[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local77] = local11;
					this.anIntArray61[local77] = local39 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11][local39 + 1] = 4;
					this.anIntArrayArray2[local11][local39 + 1] = local203;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray3[local11 - 1][local39 - 1] == 0 && (local92[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local92[local11 - 1][local39] & 0x280108) == 0 && (local92[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local77] = local11 - 1;
					this.anIntArray61[local77] = local39 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray2[local11 - 1][local39 - 1] = local203;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray3[local11 + 1][local39 - 1] == 0 && (local92[local11 + 1][local39 - 1] & 0x280183) == 0 && (local92[local11 + 1][local39] & 0x280180) == 0 && (local92[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local77] = local11 + 1;
					this.anIntArray61[local77] = local39 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray2[local11 + 1][local39 - 1] = local203;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray3[local11 - 1][local39 + 1] == 0 && (local92[local11 - 1][local39 + 1] & 0x280138) == 0 && (local92[local11 - 1][local39] & 0x280108) == 0 && (local92[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local77] = local11 - 1;
					this.anIntArray61[local77] = local39 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray2[local11 - 1][local39 + 1] = local203;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray3[local11 + 1][local39 + 1] == 0 && (local92[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local92[local11 + 1][local39] & 0x280180) == 0 && (local92[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local77] = local11 + 1;
					this.anIntArray61[local77] = local39 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray2[local11 + 1][local39 + 1] = local203;
				}
			}
			this.anInt261 = 0;
			@Pc(819) int local819;
			@Pc(825) int local825;
			@Pc(831) int local831;
			if (!local81) {
				if (arg5) {
					local203 = 100;
					for (local819 = 1; local819 < 2; local819++) {
						for (local825 = arg3 - local819; local825 <= arg3 + local819; local825++) {
							for (local831 = arg4 - local819; local831 <= arg4 + local819; local831++) {
								if (local825 >= 0 && local831 >= 0 && local825 < 104 && local831 < 104 && this.anIntArrayArray2[local825][local831] < local203) {
									local203 = this.anIntArrayArray2[local825][local831];
									local11 = local825;
									local39 = local831;
									this.anInt261 = 1;
									local81 = true;
								}
							}
						}
						if (local81) {
							break;
						}
					}
				}
				if (!local81) {
					return false;
				}
			}
			@Pc(892) byte local892 = 0;
			this.anIntArray60[0] = local11;
			local68 = local892 + 1;
			this.anIntArray61[0] = local39;
			local203 = local819 = this.anIntArrayArray3[local11][local39];
			while (local11 != arg7 || local39 != arg0) {
				if (local203 != local819) {
					local819 = local203;
					this.anIntArray60[local68] = local11;
					this.anIntArray61[local68++] = local39;
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
				local203 = this.anIntArrayArray3[local11][local39];
			}
			if (local68 > 0) {
				local85 = local68;
				if (local68 > 25) {
					local85 = 25;
				}
				local68--;
				local825 = this.anIntArray60[local68];
				local831 = this.anIntArray61[local68];
				anInt147 += local85;
				if (anInt147 >= 121) {
					this.aClass1_Sub3_Sub3_6.method372(215);
					this.aClass1_Sub3_Sub3_6.method374(19217);
				}
				if (arg9 == 0) {
					this.aClass1_Sub3_Sub3_6.method372(74);
					this.aClass1_Sub3_Sub3_6.method373(local85 + local85 + 3);
				}
				if (arg9 == 1) {
					this.aClass1_Sub3_Sub3_6.method372(37);
					this.aClass1_Sub3_Sub3_6.method373(local85 + local85 + 3 + 14);
				}
				if (arg9 == 2) {
					this.aClass1_Sub3_Sub3_6.method372(73);
					this.aClass1_Sub3_Sub3_6.method373(local85 + local85 + 3);
				}
				if (super.anIntArray28[5] == 1) {
					this.aClass1_Sub3_Sub3_6.method373(1);
				} else {
					this.aClass1_Sub3_Sub3_6.method373(0);
				}
				this.aClass1_Sub3_Sub3_6.method374(local825 + this.anInt296);
				this.aClass1_Sub3_Sub3_6.method374(local831 + this.anInt297);
				this.anInt164 = this.anIntArray60[0];
				this.anInt165 = this.anIntArray61[0];
				for (@Pc(1096) int local1096 = 1; local1096 < local85; local1096++) {
					local68--;
					this.aClass1_Sub3_Sub3_6.method373(this.anIntArray60[local68] - local825);
					this.aClass1_Sub3_Sub3_6.method373(this.anIntArray61[local68] - local831);
				}
				return true;
			} else if (arg9 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1131) RuntimeException local1131) {
			signlink.reporterror("3120, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method167() {
		try {
			if (this.aClass32_6 == null) {
				this.method184();
				super.aClass32_2 = null;
				this.aClass32_10 = null;
				this.aClass32_11 = null;
				this.aClass32_12 = null;
				this.aClass32_13 = null;
				this.aClass32_14 = null;
				this.aClass32_15 = null;
				this.aClass32_16 = null;
				this.aClass32_17 = null;
				this.aClass32_18 = null;
				this.aClass32_6 = new Class32((byte) -121, 96, this.method72(anInt243), 479);
				this.aClass32_4 = new Class32((byte) -121, 160, this.method72(anInt243), 168);
				Class1_Sub3_Sub2.method353();
				this.aClass1_Sub3_Sub2_Sub3_19.method346(0, 0);
				this.aClass32_3 = new Class32((byte) -121, 261, this.method72(anInt243), 190);
				this.aClass32_5 = new Class32((byte) -121, 334, this.method72(anInt243), 512);
				Class1_Sub3_Sub2.method353();
				this.aClass32_7 = new Class32((byte) -121, 61, this.method72(anInt243), 501);
				this.aClass32_8 = new Class32((byte) -121, 40, this.method72(anInt243), 288);
				this.aClass32_9 = new Class32((byte) -121, 66, this.method72(anInt243), 269);
				this.aBoolean64 = true;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("32043, " + -763 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method168(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString11 = "";
				this.aString12 = "Connecting to server...";
				this.method104();
			}
			this.aClass6_1 = new Class6(this, (byte) 124, this.method82(anInt152 + 43594));
			this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, 8);
			this.aClass1_Sub3_Sub3_5.anInt566 = 0;
			this.aLong7 = this.aClass1_Sub3_Sub3_5.method389();
			@Pc(47) int[] local47 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong7 >> 32), (int) this.aLong7 };
			this.aClass1_Sub3_Sub3_6.anInt566 = 0;
			this.aClass1_Sub3_Sub3_6.method373(10);
			this.aClass1_Sub3_Sub3_6.method377(local47[0]);
			this.aClass1_Sub3_Sub3_6.method377(local47[1]);
			this.aClass1_Sub3_Sub3_6.method377(local47[2]);
			this.aClass1_Sub3_Sub3_6.method377(local47[3]);
			this.aClass1_Sub3_Sub3_6.method377(signlink.anInt761);
			this.aClass1_Sub3_Sub3_6.method380(arg0);
			this.aClass1_Sub3_Sub3_6.method380(arg1);
			this.aClass1_Sub3_Sub3_6.method398(this.aByte18, aBigInteger2, aBigInteger1);
			this.aClass1_Sub3_Sub3_4.anInt566 = 0;
			if (arg2) {
				this.aClass1_Sub3_Sub3_4.method373(18);
			} else {
				this.aClass1_Sub3_Sub3_4.method373(16);
			}
			this.aClass1_Sub3_Sub3_4.method373(this.aClass1_Sub3_Sub3_6.anInt566 + 36 + 1 + 1);
			this.aClass1_Sub3_Sub3_4.method373(219);
			this.aClass1_Sub3_Sub3_4.method373(aBoolean40 ? 1 : 0);
			for (@Pc(168) int local168 = 0; local168 < 9; local168++) {
				this.aClass1_Sub3_Sub3_4.method377(this.anIntArray81[local168]);
			}
			this.aClass1_Sub3_Sub3_4.method381(this.aClass1_Sub3_Sub3_6.anInt566, this.aClass1_Sub3_Sub3_6.aByteArray7, this.anInt160);
			this.aClass1_Sub3_Sub3_6.aClass38_2 = new Class38(local47, 0);
			for (@Pc(203) int local203 = 0; local203 < 4; local203++) {
				local47[local203] += 50;
			}
			this.aClass38_1 = new Class38(local47, 0);
			this.aClass6_1.method205((byte) 1, this.aClass1_Sub3_Sub3_4.aByteArray7, this.aClass1_Sub3_Sub3_4.anInt566);
			@Pc(238) int local238 = this.aClass6_1.method202();
			if (local238 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(245) Exception local245) {
				}
				this.method168(arg0, arg1, arg2);
				return;
			}
			if (local238 == 2 || local238 == 18) {
				if (local238 == 18) {
					this.aBoolean58 = true;
				} else {
					this.aBoolean58 = false;
				}
				Class8.method209(false);
				this.aBoolean37 = true;
				this.aClass1_Sub3_Sub3_6.anInt566 = 0;
				this.aClass1_Sub3_Sub3_5.anInt566 = 0;
				this.anInt282 = -1;
				this.anInt211 = -1;
				this.anInt212 = -1;
				this.anInt213 = -1;
				this.anInt281 = 0;
				this.anInt283 = 0;
				this.anInt332 = 0;
				this.anInt285 = 0;
				this.anInt263 = 0;
				this.anInt252 = 0;
				this.aBoolean52 = false;
				super.anInt128 = 0;
				for (@Pc(320) int local320 = 0; local320 < 100; local320++) {
					this.aStringArray7[local320] = null;
				}
				this.anInt230 = 0;
				this.anInt317 = 0;
				this.anInt324 = 0;
				this.anInt336 = 0;
				this.anInt203 = (int) (Math.random() * 100.0D) - 50;
				this.anInt200 = (int) (Math.random() * 110.0D) - 55;
				this.anInt206 = (int) (Math.random() * 80.0D) - 40;
				this.anInt149 = (int) (Math.random() * 120.0D) - 60;
				this.anInt253 = (int) (Math.random() * 30.0D) - 20;
				this.anInt177 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.anInt235 = -1;
				this.anInt164 = 0;
				this.anInt165 = 0;
				this.anInt187 = 0;
				this.anInt234 = 0;
				for (@Pc(410) int local410 = 0; local410 < this.anInt185; local410++) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local410] = null;
					this.aClass1_Sub3_Sub3Array1[local410] = null;
				}
				for (@Pc(429) int local429 = 0; local429 < 8192; local429++) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local429] = null;
				}
				this.aClass1_Sub1_Sub3_Sub2_1 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anInt186] = new Class1_Sub1_Sub3_Sub2();
				this.aClass28_4.method452();
				this.aClass28_2.method452();
				this.aClass28_5.method452();
				@Pc(466) int local466;
				for (@Pc(462) int local462 = 0; local462 < 4; local462++) {
					for (local466 = 0; local466 < 104; local466++) {
						for (@Pc(470) int local470 = 0; local470 < 104; local470++) {
							this.aClass28ArrayArrayArray1[local462][local466][local470] = null;
						}
					}
				}
				this.aClass28_1 = new Class28(2);
				this.anInt141 = 0;
				this.anInt202 = -1;
				this.anInt288 = -1;
				this.anInt286 = -1;
				this.anInt289 = -1;
				this.aBoolean63 = false;
				this.anInt325 = 3;
				this.aBoolean57 = false;
				this.aBoolean52 = false;
				this.aBoolean62 = false;
				this.aString10 = null;
				this.anInt180 = 0;
				this.anInt305 = -1;
				this.aBoolean49 = true;
				this.method144();
				for (local466 = 0; local466 < 5; local466++) {
					this.anIntArray35[local466] = 0;
				}
				anInt140 = 0;
				anInt242 = 0;
				anInt259 = 0;
				anInt147 = 0;
				anInt327 = 0;
				anInt194 = 0;
				anInt247 = 0;
				anInt326 = 0;
				anInt249 = 0;
				this.method167();
				return;
			}
			if (local238 == 3) {
				this.aString11 = "";
				this.aString12 = "Invalid username or password.";
				return;
			}
			if (local238 == 4) {
				this.aString11 = "Your account has been disabled.";
				this.aString12 = "Please check your message-centre for details.";
				return;
			}
			if (local238 == 5) {
				this.aString11 = "Your account is already logged in.";
				this.aString12 = "Try again in 60 secs...";
				return;
			}
			if (local238 == 6) {
				this.aString11 = "RuneScape has been updated!";
				this.aString12 = "Please reload this page.";
				return;
			}
			if (local238 == 7) {
				this.aString11 = "This world is full.";
				this.aString12 = "Please use a different world.";
				return;
			}
			if (local238 == 8) {
				this.aString11 = "Unable to connect.";
				this.aString12 = "Login server offline.";
				return;
			}
			if (local238 == 9) {
				this.aString11 = "Login limit exceeded.";
				this.aString12 = "Too many connections from your address.";
				return;
			}
			if (local238 == 10) {
				this.aString11 = "Unable to connect.";
				this.aString12 = "Bad session id.";
				return;
			}
			if (local238 == 11) {
				this.aString12 = "Login server rejected session.";
				this.aString12 = "Please try again.";
				return;
			}
			if (local238 == 12) {
				this.aString11 = "You need a members account to login to this world.";
				this.aString12 = "Please subscribe, or use a different world.";
				return;
			}
			if (local238 == 13) {
				this.aString11 = "Could not complete login.";
				this.aString12 = "Please try using a different world.";
				return;
			}
			if (local238 == 14) {
				this.aString11 = "The server is being updated.";
				this.aString12 = "Please wait 1 minute and try again.";
				return;
			}
			if (local238 == 15) {
				this.aBoolean37 = true;
				this.aClass1_Sub3_Sub3_6.anInt566 = 0;
				this.aClass1_Sub3_Sub3_5.anInt566 = 0;
				this.anInt282 = -1;
				this.anInt211 = -1;
				this.anInt212 = -1;
				this.anInt213 = -1;
				this.anInt281 = 0;
				this.anInt283 = 0;
				this.anInt332 = 0;
				this.anInt252 = 0;
				this.aBoolean52 = false;
				return;
			}
			if (local238 == 16) {
				this.aString11 = "Login attempts exceeded.";
				this.aString12 = "Please wait 1 minute and try again.";
				return;
			}
			if (local238 == 17) {
				this.aString11 = "You are standing in a members-only area.";
				this.aString12 = "To play on this world move to a free area first";
				return;
			}
		} catch (@Pc(764) IOException local764) {
			this.aString11 = "";
			this.aString12 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method169() {
		try {
			this.aClass32_4.method455();
			@Pc(13) int local13 = this.anInt177 + this.anInt149 & 0x7FF;
			@Pc(21) int local21 = this.aClass1_Sub1_Sub3_Sub2_1.anInt896 / 32 + 48;
			@Pc(29) int local29 = 464 - this.aClass1_Sub1_Sub3_Sub2_1.anInt897 / 32;
			this.aClass1_Sub3_Sub2_Sub2_4.method325(local21, 146, 21, local29, local13, this.anInt253 + 256, 9, this.anIntArray57, this.anIntArray85, 151);
			this.aClass1_Sub3_Sub2_Sub2_3.method325(25, 33, 0, 25, this.anInt177, 256, 0, this.anIntArray88, this.anIntArray67, 33);
			for (@Pc(67) int local67 = 0; local67 < this.anInt225; local67++) {
				local21 = this.anIntArray58[local67] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt896 / 32;
				local29 = this.anIntArray59[local67] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt897 / 32;
				this.method91(local21, this.aClass1_Sub3_Sub2_Sub2Array6[local67], local29);
			}
			@Pc(119) int local119;
			for (@Pc(115) int local115 = 0; local115 < 104; local115++) {
				for (local119 = 0; local119 < 104; local119++) {
					@Pc(131) Class28 local131 = this.aClass28ArrayArrayArray1[this.anInt172][local115][local119];
					if (local131 != null) {
						local21 = local115 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt896 / 32;
						local29 = local119 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt897 / 32;
						this.method91(local21, this.aClass1_Sub3_Sub2_Sub2_5, local29);
					}
				}
			}
			for (local119 = 0; local119 < this.anInt234; local119++) {
				@Pc(184) Class1_Sub1_Sub3_Sub1 local184 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray62[local119]];
				if (local184 != null && local184.method563() && local184.aClass3_1.aBoolean21) {
					local21 = local184.anInt896 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt896 / 32;
					local29 = local184.anInt897 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt897 / 32;
					this.method91(local21, this.aClass1_Sub3_Sub2_Sub2_6, local29);
				}
			}
			for (@Pc(230) int local230 = 0; local230 < this.anInt187; local230++) {
				@Pc(240) Class1_Sub1_Sub3_Sub2 local240 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray45[local230]];
				if (local240 != null && local240.method563()) {
					local21 = local240.anInt896 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt896 / 32;
					local29 = local240.anInt897 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt897 / 32;
					@Pc(270) boolean local270 = false;
					@Pc(274) long local274 = Class40.method530(local240.aString30);
					for (@Pc(276) int local276 = 0; local276 < this.anInt141; local276++) {
						if (local274 == this.aLongArray4[local276] && this.anIntArray64[local276] != 0) {
							local270 = true;
							break;
						}
					}
					if (local270) {
						this.method91(local21, this.aClass1_Sub3_Sub2_Sub2_8, local29);
					} else {
						this.method91(local21, this.aClass1_Sub3_Sub2_Sub2_7, local29);
					}
				}
			}
			if (this.anInt164 != 0) {
				local21 = this.anInt164 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt896 / 32;
				local29 = this.anInt165 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt897 / 32;
				this.method91(local21, this.aClass1_Sub3_Sub2_Sub2_9, local29);
			}
			Class1_Sub3_Sub2.method354(16777215, 93, 82, 3, 3);
			this.aClass32_5.method455();
			if (this.aByte27 != 5) {
				this.anInt323 = 201;
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("12316, " + 5 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI[B)V")
	private void method170(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2) {
		try {
			signlink.anInt766 = arg1 ? 1 : 0;
			signlink.midisave(arg2, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("28026, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class28 local9 = this.aClass28ArrayArrayArray1[this.anInt172][arg0][arg1];
		if (local9 == null) {
			this.aClass33_1.method485(this.anInt172, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub7 local23 = null;
		@Pc(27) Class1_Sub7 local27;
		@Pc(35) int local35;
		for (local27 = (Class1_Sub7) local9.method448(); local27 != null; local27 = (Class1_Sub7) local9.method450()) {
			@Pc(32) Class5 local32 = Class5.method54(local27.anInt780);
			local35 = local32.anInt106;
			if (local32.aBoolean31) {
				local35 *= local27.anInt781 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method446(local23);
		@Pc(65) int local65 = -1;
		local35 = -1;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = 0;
		for (local27 = (Class1_Sub7) local9.method448(); local27 != null; local27 = (Class1_Sub7) local9.method450()) {
			if (local27.anInt780 != local23.anInt780 && local65 == -1) {
				local65 = local27.anInt780;
				local69 = local27.anInt781;
			}
			if (local27.anInt780 != local23.anInt780 && local27.anInt780 != local65 && local35 == -1) {
				local35 = local27.anInt780;
				local71 = local27.anInt781;
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
		@Pc(148) Class5 local148 = Class5.method54(local23.anInt780);
		this.aClass33_1.method466(local144, arg0, local128, local118, local148.method58(local23.anInt781), this.anInt172, this.anInt154, arg1, this.method159(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt172));
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)I")
	private int method172() {
		try {
			@Pc(8) int local8 = 3;
			if (this.anInt267 < 310) {
				@Pc(17) int local17 = this.anInt264 >> 7;
				@Pc(22) int local22 = this.anInt266 >> 7;
				@Pc(28) int local28 = this.aClass1_Sub1_Sub3_Sub2_1.anInt896 >> 7;
				@Pc(34) int local34 = this.aClass1_Sub1_Sub3_Sub2_1.anInt897 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt172][local17][local22] & 0x4) != 0) {
					local8 = this.anInt172;
				}
				@Pc(56) int local56;
				if (local28 > local17) {
					local56 = local28 - local17;
				} else {
					local56 = local17 - local28;
				}
				@Pc(69) int local69;
				if (local34 > local22) {
					local69 = local34 - local22;
				} else {
					local69 = local22 - local34;
				}
				@Pc(84) int local84;
				@Pc(86) int local86;
				if (local56 > local69) {
					local84 = local69 * 65536 / local56;
					local86 = 32768;
					while (local17 != local28) {
						if (local17 < local28) {
							local17++;
						} else if (local17 > local28) {
							local17--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt172][local17][local22] & 0x4) != 0) {
							local8 = this.anInt172;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local22 < local34) {
								local22++;
							} else if (local22 > local34) {
								local22--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt172][local17][local22] & 0x4) != 0) {
								local8 = this.anInt172;
							}
						}
					}
				} else {
					local84 = local56 * 65536 / local69;
					local86 = 32768;
					while (local22 != local34) {
						if (local22 < local34) {
							local22++;
						} else if (local22 > local34) {
							local22--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt172][local17][local22] & 0x4) != 0) {
							local8 = this.anInt172;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local17 < local28) {
								local17++;
							} else if (local17 > local28) {
								local17--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt172][local17][local22] & 0x4) != 0) {
								local8 = this.anInt172;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt172][this.aClass1_Sub1_Sub3_Sub2_1.anInt896 >> 7][this.aClass1_Sub1_Sub3_Sub2_1.anInt897 >> 7] & 0x4) != 0) {
				local8 = this.anInt172;
			}
			return local8;
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("91041, " + true + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)I")
	private int method173() {
		try {
			@Pc(9) int local9 = this.method159(this.anInt266, this.anInt264, this.anInt172);
			return local9 - this.anInt265 >= 800 || (this.aByteArrayArrayArray7[this.anInt172][this.anInt264 >> 7][this.anInt266 >> 7] & 0x4) == 0 ? 3 : this.anInt172;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("88511, " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method174(@OriginalArg(0) long arg0) {
		try {
			this.aBoolean37 &= true;
			if (arg0 != 0L) {
				if (this.anInt333 >= 100) {
					this.method103("Your ignore list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(29) String local29 = Class40.method534(Class40.method531(arg0));
					for (@Pc(31) int local31 = 0; local31 < this.anInt333; local31++) {
						if (this.aLongArray3[local31] == arg0) {
							this.method103(local29 + " is already on your ignore list", 0, "");
							return;
						}
					}
					for (@Pc(61) int local61 = 0; local61 < this.anInt141; local61++) {
						if (this.aLongArray4[local61] == arg0) {
							this.method103("Please remove " + local29 + " from your friend list first", 0, "");
							return;
						}
					}
					this.aLongArray3[this.anInt333++] = arg0;
					this.aBoolean69 = true;
					this.aClass1_Sub3_Sub3_6.method372(175);
					this.aClass1_Sub3_Sub3_6.method379(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("86507, " + arg0 + ", " + true + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kb;II)V")
	private void method175(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt251 = 0;
			this.anInt188 = 0;
			this.method119(arg1, arg0);
			this.method150(arg0, arg1);
			this.method185(arg1, arg0);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt251; local34++) {
				local41 = this.anIntArray65[local34];
				if (this.aClass1_Sub1_Sub3_Sub1Array1[local41].anInt938 != anInt239) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local41].aClass3_1 = null;
					this.aClass1_Sub1_Sub3_Sub1Array1[local41] = null;
				}
			}
			if (arg0.anInt566 != arg1) {
				signlink.reporterror(this.aString17 + " size mismatch in getnpcpos - pos:" + arg0.anInt566 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt234; local41++) {
				if (this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray62[local41]] == null) {
					signlink.reporterror(this.aString17 + " null entry in npc list - pos:" + local41 + " size:" + this.anInt234);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("96730, " + arg0 + ", " + arg1 + ", " + 6 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method176(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				this.aClass1_Sub3_Sub3_6.method373(173);
			}
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt141; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray9[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(this.aClass1_Sub1_Sub3_Sub2_1.aString30);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("4620, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method177() {
		try {
			while (true) {
				@Pc(11) int local11 = this.method66();
				if (local11 == -1) {
					return;
				}
				if (this.anInt286 != -1 && this.anInt286 == this.anInt309) {
					if (local11 == 8 && this.aString8.length() > 0) {
						this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
					}
					if ((local11 >= 97 && local11 <= 122 || local11 >= 65 && local11 <= 90 || local11 >= 48 && local11 <= 57 || local11 == 32) && this.aString8.length() < 12) {
						this.aString8 = this.aString8 + (char) local11;
					}
				} else {
					@Pc(191) int local191;
					if (this.aBoolean62) {
						if (local11 >= 32 && local11 <= 122 && this.aString13.length() < 80) {
							this.aString13 = this.aString13 + (char) local11;
							this.aBoolean60 = true;
						}
						if (local11 == 8 && this.aString13.length() > 0) {
							this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
							this.aBoolean60 = true;
						}
						if (local11 == 13 || local11 == 10) {
							this.aBoolean62 = false;
							this.aBoolean60 = true;
							@Pc(151) long local151;
							if (this.anInt210 == 1) {
								local151 = Class40.method530(this.aString13);
								this.method85(local151);
							}
							if (this.anInt210 == 2 && this.anInt141 > 0) {
								local151 = Class40.method530(this.aString13);
								this.method112(local151);
							}
							if (this.anInt210 == 3 && this.aString13.length() > 0) {
								this.aClass1_Sub3_Sub3_6.method372(6);
								this.aClass1_Sub3_Sub3_6.method373(0);
								local191 = this.aClass1_Sub3_Sub3_6.anInt566;
								this.aClass1_Sub3_Sub3_6.method379(this.aLong8);
								Class41.method538(this.aString13, this.aClass1_Sub3_Sub3_6);
								this.aClass1_Sub3_Sub3_6.method382(this.aClass1_Sub3_Sub3_6.anInt566 - local191);
								this.aString13 = Class40.method535(this.aString13);
								this.aString13 = Class25.method416(this.aString13);
								this.method103(this.aString13, 6, Class40.method534(Class40.method531(this.aLong8)));
								if (this.anInt227 == 2) {
									this.anInt227 = 1;
									this.aBoolean50 = true;
									this.aClass1_Sub3_Sub3_6.method372(197);
									this.aClass1_Sub3_Sub3_6.method373(this.anInt330);
									this.aClass1_Sub3_Sub3_6.method373(this.anInt227);
									this.aClass1_Sub3_Sub3_6.method373(this.anInt205);
								}
							}
							if (this.anInt210 == 4 && this.anInt333 < 100) {
								local151 = Class40.method530(this.aString13);
								this.method174(local151);
							}
							if (this.anInt210 == 5 && this.anInt333 > 0) {
								local151 = Class40.method530(this.aString13);
								this.method84(local151);
							}
						}
					} else if (this.aBoolean57) {
						if (local11 >= 48 && local11 <= 57 && this.aString7.length() < 10) {
							this.aString7 = this.aString7 + (char) local11;
							this.aBoolean60 = true;
						}
						if (local11 == 8 && this.aString7.length() > 0) {
							this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							this.aBoolean60 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString7.length() > 0) {
								local191 = 0;
								try {
									local191 = Integer.parseInt(this.aString7);
								} catch (@Pc(367) Exception local367) {
								}
								this.aClass1_Sub3_Sub3_6.method372(147);
								this.aClass1_Sub3_Sub3_6.method377(local191);
							}
							this.aBoolean57 = false;
							this.aBoolean60 = true;
						}
					} else if (this.anInt288 == -1) {
						if (local11 >= 32 && local11 <= 122 && this.aString15.length() < 80) {
							this.aString15 = this.aString15 + (char) local11;
							this.aBoolean60 = true;
						}
						if (local11 == 8 && this.aString15.length() > 0) {
							this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
							this.aBoolean60 = true;
						}
						if ((local11 == 13 || local11 == 10) && this.aString15.length() > 0) {
							if (this.aString15.equals("::clientdrop") && (super.aFrame_Sub1_2 != null || this.method122().indexOf("192.168.1.") != -1)) {
								this.method83(928);
							} else if (this.aString15.startsWith("::")) {
								this.aClass1_Sub3_Sub3_6.method372(251);
								this.aClass1_Sub3_Sub3_6.method373(this.aString15.length() - 1);
								this.aClass1_Sub3_Sub3_6.method380(this.aString15.substring(2));
							} else {
								@Pc(494) byte local494 = 0;
								if (this.aString15.startsWith("yellow:")) {
									local494 = 0;
									this.aString15 = this.aString15.substring(7);
								}
								if (this.aString15.startsWith("red:")) {
									local494 = 1;
									this.aString15 = this.aString15.substring(4);
								}
								if (this.aString15.startsWith("green:")) {
									local494 = 2;
									this.aString15 = this.aString15.substring(6);
								}
								if (this.aString15.startsWith("cyan:")) {
									local494 = 3;
									this.aString15 = this.aString15.substring(5);
								}
								if (this.aString15.startsWith("purple:")) {
									local494 = 4;
									this.aString15 = this.aString15.substring(7);
								}
								if (this.aString15.startsWith("white:")) {
									local494 = 5;
									this.aString15 = this.aString15.substring(6);
								}
								if (this.aString15.startsWith("flash1:")) {
									local494 = 6;
									this.aString15 = this.aString15.substring(7);
								}
								if (this.aString15.startsWith("flash2:")) {
									local494 = 7;
									this.aString15 = this.aString15.substring(7);
								}
								if (this.aString15.startsWith("flash3:")) {
									local494 = 8;
									this.aString15 = this.aString15.substring(7);
								}
								if (this.aString15.startsWith("glow1:")) {
									local494 = 9;
									this.aString15 = this.aString15.substring(6);
								}
								if (this.aString15.startsWith("glow2:")) {
									local494 = 10;
									this.aString15 = this.aString15.substring(6);
								}
								if (this.aString15.startsWith("glow3:")) {
									local494 = 11;
									this.aString15 = this.aString15.substring(6);
								}
								@Pc(652) byte local652 = 0;
								if (this.aString15.startsWith("wave:")) {
									local652 = 1;
									this.aString15 = this.aString15.substring(5);
								}
								if (this.aString15.startsWith("scroll:")) {
									local652 = 2;
									this.aString15 = this.aString15.substring(7);
								}
								this.aClass1_Sub3_Sub3_6.method372(42);
								this.aClass1_Sub3_Sub3_6.method373(0);
								@Pc(691) int local691 = this.aClass1_Sub3_Sub3_6.anInt566;
								this.aClass1_Sub3_Sub3_6.method373(local494);
								this.aClass1_Sub3_Sub3_6.method373(local652);
								Class41.method538(this.aString15, this.aClass1_Sub3_Sub3_6);
								this.aClass1_Sub3_Sub3_6.method382(this.aClass1_Sub3_Sub3_6.anInt566 - local691);
								this.aString15 = Class40.method535(this.aString15);
								this.aString15 = Class25.method416(this.aString15);
								this.aClass1_Sub1_Sub3_Sub2_1.aString29 = this.aString15;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt908 = local494;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt909 = local652;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt907 = 150;
								this.method103(this.aClass1_Sub1_Sub3_Sub2_1.aString29, 2, this.aClass1_Sub1_Sub3_Sub2_1.aString30);
								if (this.anInt330 == 2) {
									this.anInt330 = 3;
									this.aBoolean50 = true;
									this.aClass1_Sub3_Sub3_6.method372(197);
									this.aClass1_Sub3_Sub3_6.method373(this.anInt330);
									this.aClass1_Sub3_Sub3_6.method373(this.anInt227);
									this.aClass1_Sub3_Sub3_6.method373(this.anInt205);
								}
							}
							this.aString15 = "";
							this.aBoolean60 = true;
						}
					}
				}
			}
		} catch (@Pc(793) RuntimeException local793) {
			signlink.reporterror("13396, " + -49 + ", " + local793.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method178() {
		try {
			if (super.anInt132 == 1) {
				if (super.anInt133 >= 549 && super.anInt133 <= 583 && super.anInt134 >= 195 && super.anInt134 < 231 && this.anIntArray68[0] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 0;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 579 && super.anInt133 <= 609 && super.anInt134 >= 194 && super.anInt134 < 231 && this.anIntArray68[1] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 1;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 607 && super.anInt133 <= 637 && super.anInt134 >= 194 && super.anInt134 < 231 && this.anIntArray68[2] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 2;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 635 && super.anInt133 <= 679 && super.anInt134 >= 194 && super.anInt134 < 229 && this.anIntArray68[3] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 3;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 676 && super.anInt133 <= 706 && super.anInt134 >= 194 && super.anInt134 < 231 && this.anIntArray68[4] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 4;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 704 && super.anInt133 <= 734 && super.anInt134 >= 194 && super.anInt134 < 231 && this.anIntArray68[5] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 5;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 732 && super.anInt133 <= 766 && super.anInt134 >= 195 && super.anInt134 < 231 && this.anIntArray68[6] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 6;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 550 && super.anInt133 <= 584 && super.anInt134 >= 492 && super.anInt134 < 528 && this.anIntArray68[7] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 7;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 582 && super.anInt133 <= 612 && super.anInt134 >= 492 && super.anInt134 < 529 && this.anIntArray68[8] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 8;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 609 && super.anInt133 <= 639 && super.anInt134 >= 492 && super.anInt134 < 529 && this.anIntArray68[9] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 9;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 637 && super.anInt133 <= 681 && super.anInt134 >= 493 && super.anInt134 < 528 && this.anIntArray68[10] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 10;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 679 && super.anInt133 <= 709 && super.anInt134 >= 492 && super.anInt134 < 529 && this.anIntArray68[11] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 11;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 706 && super.anInt133 <= 736 && super.anInt134 >= 492 && super.anInt134 < 529 && this.anIntArray68[12] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 12;
					this.aBoolean47 = true;
				}
				if (super.anInt133 >= 734 && super.anInt133 <= 768 && super.anInt134 >= 492 && super.anInt134 < 528 && this.anIntArray68[13] != -1) {
					this.aBoolean69 = true;
					this.anInt325 = 13;
					this.aBoolean47 = true;
					return;
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("71772, " + 345 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method179() {
		try {
			if (this.anInt263 == 2) {
				this.method140((this.anInt301 - this.anInt297 << 7) + this.anInt304, (this.anInt300 - this.anInt296 << 7) + this.anInt303, this.anInt302 * 2);
				if (this.anInt197 > -1 && anInt239 % 20 < 10) {
					this.aClass1_Sub3_Sub2_Sub2Array4[2].method319(this.anInt197 - 12, this.anInt198 - 28);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("49406, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method180(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("10189, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)Z")
	private boolean method181() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("13091, " + false + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method182(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt768 = arg0;
			if (this.anInt331 != 2) {
				this.anInt282 = this.aClass1_Sub3_Sub3_5.method383();
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("16955, " + arg0 + ", " + 2 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method183(@OriginalArg(0) int arg0) {
		try {
			try {
				this.anInt235 = -1;
				this.aClass28_5.method452();
				this.aClass28_3.method452();
				this.aClass28_2.method452();
				this.aClass28_4.method452();
				Class1_Sub3_Sub2_Sub1.method288();
				this.method161();
				this.aClass33_1.method459();
				for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
					this.aClass9Array1[local27].method248();
				}
				System.gc();
				@Pc(51) Class4 local51 = new Class4(104, this.anIntArrayArrayArray3, 0, 104, this.aByteArrayArrayArray7);
				@Pc(54) byte[] local54 = new byte[100000];
				@Pc(58) int local58 = this.aByteArrayArray2.length;
				Class4.aBoolean23 = Class33.aBoolean150;
				@Pc(71) int local71;
				@Pc(78) int local78;
				for (@Pc(62) int local62 = 0; local62 < local58; local62++) {
					local71 = this.anIntArray70[local62] >> 8;
					local78 = this.anIntArray70[local62] & 0xFF;
					if (local71 == 33 && local78 >= 71 && local78 <= 73) {
						Class4.aBoolean23 = false;
					}
				}
				if (Class4.aBoolean23) {
					this.aClass33_1.method460(this.anInt172);
				} else {
					this.aClass33_1.method460(0);
				}
				this.aClass1_Sub3_Sub3_6.method372(126);
				@Pc(155) int local155;
				for (local71 = 0; local71 < local58; local71++) {
					local78 = (this.anIntArray70[local71] >> 8) * 64 - this.anInt296;
					@Pc(141) int local141 = (this.anIntArray70[local71] & 0xFF) * 64 - this.anInt297;
					@Pc(146) byte[] local146 = this.aByteArrayArray2[local71];
					if (local146 != null) {
						local155 = (new Class1_Sub3_Sub3(0, local146)).method388();
						Class34.method511(local54, local155, local146, local146.length - 4, 4);
						local51.method37(local54, (this.anInt196 - 6) * 8, local78, (this.anInt195 - 6) * 8, local141);
					} else if (this.anInt196 < 800) {
						local51.method36(local141, local78);
					}
				}
				this.aClass1_Sub3_Sub3_6.method372(126);
				@Pc(223) int local223;
				for (local78 = 0; local78 < local58; local78++) {
					@Pc(214) byte[] local214 = this.aByteArrayArray1[local78];
					if (local214 != null) {
						local223 = (new Class1_Sub3_Sub3(0, local214)).method388();
						Class34.method511(local54, local223, local214, local214.length - 4, 4);
						local155 = (this.anIntArray70[local78] >> 8) * 64 - this.anInt296;
						@Pc(257) int local257 = (this.anIntArray70[local78] & 0xFF) * 64 - this.anInt297;
						local51.method38(local155, local54, this.aClass28_3, this.aClass9Array1, local257, this.aClass33_1);
					}
				}
				this.aClass1_Sub3_Sub3_6.method372(126);
				local51.method40(this.aClass33_1, (byte) 8, this.aClass9Array1);
				this.aClass32_5.method455();
				this.aClass1_Sub3_Sub3_6.method372(126);
				for (@Pc(299) Class1_Sub6 local299 = (Class1_Sub6) this.aClass28_3.method448(); local299 != null; local299 = (Class1_Sub6) this.aClass28_3.method450()) {
					if ((this.aByteArrayArrayArray7[1][local299.anInt657][local299.anInt658] & 0x2) == 2) {
						local299.anInt655--;
						if (local299.anInt655 < 0) {
							local299.method559();
						}
					}
				}
				for (local223 = 0; local223 < 104; local223++) {
					for (local155 = 0; local155 < 104; local155++) {
						this.method171(local223, local155);
					}
				}
				for (@Pc(359) Class1_Sub4 local359 = (Class1_Sub4) this.aClass28_1.method448(); local359 != null; local359 = (Class1_Sub4) this.aClass28_1.method450()) {
					this.method157(local359.anInt599, local359.anInt603, local359.anInt604, local359.anInt601, local359.anInt600, local359.anInt598, local359.anInt602);
				}
			} catch (@Pc(388) Exception local388) {
			}
			Class2.aClass35_1.method521();
			System.gc();
			@Pc(395) boolean local395 = false;
			Class1_Sub3_Sub2_Sub1.method289();
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("63296, " + arg0 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method184() {
		try {
			this.aBoolean53 = false;
			while (this.aBoolean61) {
				this.aBoolean53 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub3_Sub2_Sub3_8 = null;
			this.aClass1_Sub3_Sub2_Sub3_9 = null;
			this.aClass1_Sub3_Sub2_Sub3Array3 = null;
			this.anIntArray77 = null;
			this.anIntArray78 = null;
			this.anIntArray79 = null;
			this.anIntArray80 = null;
			this.anIntArray55 = null;
			this.anIntArray56 = null;
			this.anIntArray71 = null;
			this.anIntArray72 = null;
			this.aClass1_Sub3_Sub2_Sub2_1 = null;
			this.aClass1_Sub3_Sub2_Sub2_2 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("27940, " + 9 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method67() {
		if (signlink.sunjava) {
			super.anInt124 = 5;
		}
		if (!aBoolean40) {
			this.aBoolean36 = true;
			this.aBoolean59 = true;
			this.method73(this, 2);
			this.method118(40000, 12345678, "scape_main");
		}
		if (aBoolean51) {
			this.aBoolean70 = true;
			return;
		}
		aBoolean51 = true;
		@Pc(34) boolean local34 = false;
		@Pc(38) String local38 = this.method122();
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
			this.aBoolean73 = true;
			return;
		}
		try {
			@Pc(94) int local94 = 5;
			this.anIntArray81[8] = 0;
			while (this.anIntArray81[8] == 0) {
				this.method74(10, "Connecting to fileserver");
				try {
					@Pc(119) DataInputStream local119 = this.method189("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(126) Class1_Sub3_Sub3 local126 = new Class1_Sub3_Sub3(0, new byte[36]);
					local119.readFully(local126.aByteArray7, 0, 36);
					for (@Pc(134) int local134 = 0; local134 < 9; local134++) {
						this.anIntArray81[local134] = local126.method388();
					}
					local119.close();
				} catch (@Pc(150) IOException local150) {
					for (@Pc(152) int local152 = local94; local152 > 0; local152--) {
						this.method74(10, "Error loading - Will retry in " + local152 + " secs.");
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
			this.aClass39_1 = this.method151(aByte16, "title screen", 10, this.anIntArray81[1], "title");
			this.aClass1_Sub3_Sub2_Sub4_1 = new Class1_Sub3_Sub2_Sub4("p11", -10272, this.aClass39_1);
			this.aClass1_Sub3_Sub2_Sub4_2 = new Class1_Sub3_Sub2_Sub4("p12", -10272, this.aClass39_1);
			this.aClass1_Sub3_Sub2_Sub4_3 = new Class1_Sub3_Sub2_Sub4("b12", -10272, this.aClass39_1);
			this.aClass1_Sub3_Sub2_Sub4_4 = new Class1_Sub3_Sub2_Sub4("q8", -10272, this.aClass39_1);
			this.method78();
			this.method188(aByte17);
			@Pc(255) Class39 local255 = this.method151(aByte16, "config", 15, this.anIntArray81[2], "config");
			@Pc(266) Class39 local266 = this.method151(aByte16, "interface", 20, this.anIntArray81[3], "interface");
			@Pc(277) Class39 local277 = this.method151(aByte16, "2d graphics", 30, this.anIntArray81[4], "media");
			@Pc(288) Class39 local288 = this.method151(aByte16, "3d graphics", 40, this.anIntArray81[5], "models");
			@Pc(299) Class39 local299 = this.method151(aByte16, "textures", 60, this.anIntArray81[6], "textures");
			@Pc(310) Class39 local310 = this.method151(aByte16, "chat system", 65, this.anIntArray81[7], "wordenc");
			@Pc(321) Class39 local321 = this.method151(aByte16, "sound effects", 70, this.anIntArray81[8], "sounds");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass33_1 = new Class33(this.anIntArrayArrayArray3, false, 4, 104, 104);
			for (@Pc(346) int local346 = 0; local346 < 4; local346++) {
				this.aClass9Array1[local346] = new Class9(104, 104, 8);
			}
			this.aClass1_Sub3_Sub2_Sub2_4 = new Class1_Sub3_Sub2_Sub2(512, 512);
			this.method74(75, "Unpacking media");
			this.aClass1_Sub3_Sub2_Sub3_18 = new Class1_Sub3_Sub2_Sub3(local277, "invback", 0);
			this.aClass1_Sub3_Sub2_Sub3_20 = new Class1_Sub3_Sub2_Sub3(local277, "chatback", 0);
			this.aClass1_Sub3_Sub2_Sub3_19 = new Class1_Sub3_Sub2_Sub3(local277, "mapback", 0);
			this.aClass1_Sub3_Sub2_Sub3_15 = new Class1_Sub3_Sub2_Sub3(local277, "backbase1", 0);
			this.aClass1_Sub3_Sub2_Sub3_16 = new Class1_Sub3_Sub2_Sub3(local277, "backbase2", 0);
			this.aClass1_Sub3_Sub2_Sub3_17 = new Class1_Sub3_Sub2_Sub3(local277, "backhmid1", 0);
			for (@Pc(424) int local424 = 0; local424 < 13; local424++) {
				this.aClass1_Sub3_Sub2_Sub3Array2[local424] = new Class1_Sub3_Sub2_Sub3(local277, "sideicons", local424);
			}
			this.aClass1_Sub3_Sub2_Sub2_3 = new Class1_Sub3_Sub2_Sub2(local277, "compass", 0);
			@Pc(450) int local450;
			try {
				for (local450 = 0; local450 < 50; local450++) {
					this.aClass1_Sub3_Sub2_Sub3Array1[local450] = new Class1_Sub3_Sub2_Sub3(local277, "mapscene", local450);
				}
			} catch (@Pc(468) Exception local468) {
			}
			try {
				for (local450 = 0; local450 < 50; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array3[local450] = new Class1_Sub3_Sub2_Sub2(local277, "mapfunction", local450);
				}
			} catch (@Pc(488) Exception local488) {
			}
			try {
				for (local450 = 0; local450 < 20; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array5[local450] = new Class1_Sub3_Sub2_Sub2(local277, "hitmarks", local450);
				}
			} catch (@Pc(508) Exception local508) {
			}
			try {
				for (local450 = 0; local450 < 20; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array4[local450] = new Class1_Sub3_Sub2_Sub2(local277, "headicons", local450);
				}
			} catch (@Pc(528) Exception local528) {
			}
			this.aClass1_Sub3_Sub2_Sub2_9 = new Class1_Sub3_Sub2_Sub2(local277, "mapflag", 0);
			for (local450 = 0; local450 < 8; local450++) {
				this.aClass1_Sub3_Sub2_Sub2Array7[local450] = new Class1_Sub3_Sub2_Sub2(local277, "cross", local450);
			}
			this.aClass1_Sub3_Sub2_Sub2_5 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 0);
			this.aClass1_Sub3_Sub2_Sub2_6 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 1);
			this.aClass1_Sub3_Sub2_Sub2_7 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 2);
			this.aClass1_Sub3_Sub2_Sub2_8 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 3);
			this.aClass1_Sub3_Sub2_Sub3_6 = new Class1_Sub3_Sub2_Sub3(local277, "scrollbar", 0);
			this.aClass1_Sub3_Sub2_Sub3_7 = new Class1_Sub3_Sub2_Sub3(local277, "scrollbar", 1);
			this.aClass1_Sub3_Sub2_Sub3_10 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_11 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_12 = new Class1_Sub3_Sub2_Sub3(local277, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_13 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_13.method344();
			this.aClass1_Sub3_Sub2_Sub3_14 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_14.method344();
			this.aClass1_Sub3_Sub2_Sub3_1 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_1.method345();
			this.aClass1_Sub3_Sub2_Sub3_2 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_2.method345();
			this.aClass1_Sub3_Sub2_Sub3_3 = new Class1_Sub3_Sub2_Sub3(local277, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_3.method345();
			this.aClass1_Sub3_Sub2_Sub3_4 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_4.method344();
			this.aClass1_Sub3_Sub2_Sub3_4.method345();
			this.aClass1_Sub3_Sub2_Sub3_5 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_5.method344();
			this.aClass1_Sub3_Sub2_Sub3_5.method345();
			@Pc(725) Class1_Sub3_Sub2_Sub2 local725 = new Class1_Sub3_Sub2_Sub2(local277, "backleft1", 0);
			this.aClass32_19 = new Class32((byte) -121, local725.anInt462, this.method72(anInt243), local725.anInt461);
			local725.method317(0, 0);
			@Pc(750) Class1_Sub3_Sub2_Sub2 local750 = new Class1_Sub3_Sub2_Sub2(local277, "backleft2", 0);
			this.aClass32_20 = new Class32((byte) -121, local750.anInt462, this.method72(anInt243), local750.anInt461);
			local750.method317(0, 0);
			@Pc(775) Class1_Sub3_Sub2_Sub2 local775 = new Class1_Sub3_Sub2_Sub2(local277, "backright1", 0);
			this.aClass32_21 = new Class32((byte) -121, local775.anInt462, this.method72(anInt243), local775.anInt461);
			local775.method317(0, 0);
			@Pc(800) Class1_Sub3_Sub2_Sub2 local800 = new Class1_Sub3_Sub2_Sub2(local277, "backright2", 0);
			this.aClass32_22 = new Class32((byte) -121, local800.anInt462, this.method72(anInt243), local800.anInt461);
			local800.method317(0, 0);
			@Pc(825) Class1_Sub3_Sub2_Sub2 local825 = new Class1_Sub3_Sub2_Sub2(local277, "backtop1", 0);
			this.aClass32_23 = new Class32((byte) -121, local825.anInt462, this.method72(anInt243), local825.anInt461);
			local825.method317(0, 0);
			@Pc(850) Class1_Sub3_Sub2_Sub2 local850 = new Class1_Sub3_Sub2_Sub2(local277, "backtop2", 0);
			this.aClass32_24 = new Class32((byte) -121, local850.anInt462, this.method72(anInt243), local850.anInt461);
			local850.method317(0, 0);
			@Pc(875) Class1_Sub3_Sub2_Sub2 local875 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid1", 0);
			this.aClass32_25 = new Class32((byte) -121, local875.anInt462, this.method72(anInt243), local875.anInt461);
			local875.method317(0, 0);
			@Pc(900) Class1_Sub3_Sub2_Sub2 local900 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid2", 0);
			this.aClass32_26 = new Class32((byte) -121, local900.anInt462, this.method72(anInt243), local900.anInt461);
			local900.method317(0, 0);
			@Pc(925) Class1_Sub3_Sub2_Sub2 local925 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid3", 0);
			this.aClass32_27 = new Class32((byte) -121, local925.anInt462, this.method72(anInt243), local925.anInt461);
			local925.method317(0, 0);
			@Pc(950) Class1_Sub3_Sub2_Sub2 local950 = new Class1_Sub3_Sub2_Sub2(local277, "backhmid2", 0);
			this.aClass32_28 = new Class32((byte) -121, local950.anInt462, this.method72(anInt243), local950.anInt461);
			local950.method317(0, 0);
			this.method74(80, "Unpacking textures");
			Class1_Sub3_Sub2_Sub1.method290(local299);
			Class1_Sub3_Sub2_Sub1.method294(0.8D);
			Class1_Sub3_Sub2_Sub1.method289();
			this.method74(83, "Unpacking models");
			Class1_Sub3_Sub1.method224(local288);
			Class10.method260(local288);
			Class12.method274(local288);
			this.method74(86, "Unpacking config");
			Class19.method366(local255);
			Class2.method21(local255);
			Class11.method271(local255);
			Class5.method52(local255);
			Class3.method30(local255);
			Class13.method302(local255);
			Class21.method399(local255);
			Class23.method403(local255);
			Class5.aBoolean29 = aBoolean39;
			if (!aBoolean40) {
				this.method74(90, "Unpacking sounds");
				@Pc(1037) byte[] local1037 = local321.method528("sounds.dat", null);
				@Pc(1043) Class1_Sub3_Sub3 local1043 = new Class1_Sub3_Sub3(0, local1037);
				Class43.method553(local1043);
			}
			this.method74(92, "Unpacking interfaces");
			@Pc(1074) Class1_Sub3_Sub2_Sub4[] local1074 = new Class1_Sub3_Sub2_Sub4[] { this.aClass1_Sub3_Sub2_Sub4_1, this.aClass1_Sub3_Sub2_Sub4_2, this.aClass1_Sub3_Sub2_Sub4_3, this.aClass1_Sub3_Sub2_Sub4_4 };
			Class15.method328(local1074, local277, local266, (byte) 2);
			this.method74(97, "Preparing game engine");
			@Pc(1090) int local1090;
			@Pc(1092) int local1092;
			@Pc(1094) int local1094;
			for (@Pc(1086) int local1086 = 0; local1086 < 33; local1086++) {
				local1090 = 999;
				local1092 = 0;
				for (local1094 = 0; local1094 < 35; local1094++) {
					if (this.aClass1_Sub3_Sub2_Sub3_19.aByteArray6[local1094 + local1086 * this.aClass1_Sub3_Sub2_Sub3_19.anInt516] == 0) {
						if (local1090 == 999) {
							local1090 = local1094;
						}
					} else if (local1090 != 999) {
						local1092 = local1094;
						break;
					}
				}
				this.anIntArray67[local1086] = local1090;
				this.anIntArray88[local1086] = local1092 - local1090;
			}
			@Pc(1152) int local1152;
			for (local1090 = 9; local1090 < 160; local1090++) {
				local1092 = 999;
				local1094 = 0;
				for (local1152 = 10; local1152 < 168; local1152++) {
					if (this.aClass1_Sub3_Sub2_Sub3_19.aByteArray6[local1152 + local1090 * this.aClass1_Sub3_Sub2_Sub3_19.anInt516] == 0 && (local1152 > 34 || local1090 > 34)) {
						if (local1092 == 999) {
							local1092 = local1152;
						}
					} else if (local1092 != 999) {
						local1094 = local1152;
						break;
					}
				}
				this.anIntArray85[local1090 - 9] = local1092 - 21;
				this.anIntArray57[local1090 - 9] = local1094 - local1092;
			}
			Class1_Sub3_Sub2_Sub1.method287(96, 479);
			this.anIntArray73 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			Class1_Sub3_Sub2_Sub1.method287(261, 190);
			this.anIntArray74 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			Class1_Sub3_Sub2_Sub1.method287(334, 512);
			this.anIntArray75 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			@Pc(1236) int[] local1236 = new int[9];
			for (local1094 = 0; local1094 < 9; local1094++) {
				local1152 = local1094 * 32 + 128 + 15;
				@Pc(1254) int local1254 = local1152 * 3 + 600;
				@Pc(1258) int local1258 = Class1_Sub3_Sub2_Sub1.anIntArray137[local1152];
				local1236[local1094] = local1254 * local1258 >> 16;
			}
			Class33.method496(local1236);
			Class25.method406(local310);
		} catch (@Pc(1281) Exception local1281) {
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;Z)V")
	private void method185(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt188; local1++) {
				@Pc(8) int local8 = this.anIntArray46[local1];
				@Pc(13) Class1_Sub1_Sub3_Sub1 local13 = this.aClass1_Sub1_Sub3_Sub1Array1[local8];
				@Pc(16) int local16 = arg1.method383();
				@Pc(24) int local24;
				if ((local16 & 0x2) == 2) {
					local24 = arg1.method385();
					if (local24 == 65535) {
						local24 = -1;
					}
					if (local24 == local13.anInt921) {
						local13.anInt925 = 0;
					}
					@Pc(39) int local39 = arg1.method383();
					if (local24 == -1 || local13.anInt921 == -1 || Class19.aClass19Array1[local24].anInt548 > Class19.aClass19Array1[local13.anInt921].anInt548 || Class19.aClass19Array1[local13.anInt921].anInt548 == 0) {
						local13.anInt921 = local24;
						local13.anInt922 = 0;
						local13.anInt923 = 0;
						local13.anInt924 = local39;
						local13.anInt925 = 0;
					}
				}
				if ((local16 & 0x4) == 4) {
					local13.anInt915 = arg1.method385();
					if (local13.anInt915 == 65535) {
						local13.anInt915 = -1;
					}
				}
				if ((local16 & 0x8) == 8) {
					local13.aString29 = arg1.method390();
					local13.anInt907 = 100;
				}
				if ((local16 & 0x10) == 16) {
					local13.anInt910 = arg1.method383();
					local13.anInt911 = arg1.method383();
					local13.anInt912 = anInt239 + 400;
					local13.anInt913 = arg1.method383();
					local13.anInt914 = arg1.method383();
				}
				if ((local16 & 0x20) == 32) {
					local13.aClass3_1 = Class3.method32(arg1.method385());
					local13.anInt902 = local13.aClass3_1.anInt65;
					local13.anInt903 = local13.aClass3_1.anInt66;
					local13.anInt904 = local13.aClass3_1.anInt67;
					local13.anInt905 = local13.aClass3_1.anInt68;
					local13.anInt900 = local13.aClass3_1.anInt64;
				}
				if ((local16 & 0x40) == 64) {
					local13.anInt926 = arg1.method385();
					local24 = arg1.method388();
					local13.anInt930 = local24 >> 16;
					local13.anInt929 = anInt239 + (local24 & 0xFFFF);
					local13.anInt927 = 0;
					local13.anInt928 = 0;
					if (local13.anInt929 > anInt239) {
						local13.anInt927 = -1;
					}
					if (local13.anInt926 == 65535) {
						local13.anInt926 = -1;
					}
				}
				if ((local16 & 0x80) == 128) {
					local13.anInt916 = arg1.method385();
					local13.anInt917 = arg1.method385();
				}
			}
			this.aBoolean37 &= true;
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("53157, " + arg0 + ", " + arg1 + ", " + true + ", " + local236.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method71() {
		try {
			if (this.aByte26 != 0) {
				this.aClass1_Sub3_Sub3_6.method373(227);
			}
			this.aBoolean64 = true;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("77908, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method187() {
		try {
			if (this.anInt332 > 1) {
				this.anInt332--;
			}
			if (this.anInt285 > 0) {
				this.anInt285--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method147(); local22++) {
			}
			if (this.aBoolean37) {
				@Pc(200) int local200;
				@Pc(148) int local148;
				for (@Pc(39) int local39 = 0; local39 < this.anInt336; local39++) {
					if (this.anIntArray84[local39] <= 0) {
						@Pc(48) boolean local48 = false;
						try {
							if (this.anIntArray47[local39] != this.anInt157 || this.anIntArray33[local39] != this.anInt148) {
								@Pc(82) Class1_Sub3_Sub3 local82 = Class43.method554(this.anIntArray47[local39], this.anIntArray33[local39], this.anInt314);
								if (System.currentTimeMillis() + (long) (local82.anInt566 / 22) > this.aLong9 + (long) (this.anInt153 / 22)) {
									this.anInt153 = local82.anInt566;
									this.aLong9 = System.currentTimeMillis();
									if (this.method180(local82.aByteArray7, local82.anInt566)) {
										this.anInt157 = this.anIntArray47[local39];
										this.anInt148 = this.anIntArray33[local39];
									} else {
										local48 = true;
									}
								}
							} else if (!this.method181()) {
								local48 = true;
							}
						} catch (@Pc(132) Exception local132) {
						}
						if (local48 && this.anIntArray84[local39] != -5) {
							this.anIntArray84[local39] = -5;
						} else {
							this.anInt336--;
							for (local148 = local39; local148 < this.anInt336; local148++) {
								this.anIntArray47[local148] = this.anIntArray47[local148 + 1];
								this.anIntArray33[local148] = this.anIntArray33[local148 + 1];
								this.anIntArray84[local148] = this.anIntArray84[local148 + 1];
							}
							local39--;
						}
					} else {
						local200 = this.anIntArray84[local39]--;
					}
				}
				if (this.anInt228 > 0) {
					this.anInt228 -= 20;
					if (this.anInt228 < 0) {
						this.anInt228 = 0;
					}
					if (this.anInt228 == 0 && this.aBoolean46 && !aBoolean40) {
						this.method118(this.anInt313, this.anInt215, this.aString6);
					}
				}
				if (Class8.aBoolean79) {
					@Pc(245) Class1_Sub3_Sub3 local245 = Class8.method210();
					if (local245 != null) {
						this.aClass1_Sub3_Sub3_6.method372(53);
						this.aClass1_Sub3_Sub3_6.method374(local245.anInt566);
						this.aClass1_Sub3_Sub3_6.method381(local245.anInt566, local245.aByteArray7, this.anInt160);
						local245.method371();
					}
				}
				this.anInt283++;
				if (this.anInt283 > 750) {
					this.method83(928);
				}
				this.method102();
				this.method131();
				this.method164();
				this.method87();
				if ((super.anIntArray28[1] == 1 || super.anIntArray28[2] == 1 || super.anIntArray28[3] == 1 || super.anIntArray28[4] == 1) && this.anInt191++ > 5) {
					this.anInt191 = 0;
					this.aClass1_Sub3_Sub3_6.method372(109);
					this.aClass1_Sub3_Sub3_6.method374(this.anInt176);
					this.aClass1_Sub3_Sub3_6.method374(this.anInt177);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt149);
					this.aClass1_Sub3_Sub3_6.method373(this.anInt253);
				}
				this.anInt161++;
				if (this.anInt340 != 0) {
					this.anInt339 += 20;
					if (this.anInt339 >= 400) {
						this.anInt340 = 0;
					}
				}
				if (this.anInt293 != 0) {
					this.anInt290++;
					if (this.anInt290 >= 15) {
						if (this.anInt293 == 2) {
							this.aBoolean69 = true;
						}
						if (this.anInt293 == 3) {
							this.aBoolean60 = true;
						}
						this.anInt293 = 0;
					}
				}
				if (this.anInt221 != 0) {
					this.anInt156++;
					if (super.anInt130 > this.anInt222 + 5 || super.anInt130 < this.anInt222 - 5 || super.anInt131 > this.anInt223 + 5 || super.anInt131 < this.anInt223 - 5) {
						this.aBoolean48 = true;
					}
					if (super.anInt129 == 0) {
						if (this.anInt221 == 2) {
							this.aBoolean69 = true;
						}
						if (this.anInt221 == 3) {
							this.aBoolean60 = true;
						}
						this.anInt221 = 0;
						if (this.aBoolean48 && this.anInt156 >= 5) {
							this.anInt193 = -1;
							this.method155();
							if (this.anInt193 == this.anInt219 && this.anInt192 != this.anInt220) {
								@Pc(507) Class15 local507 = Class15.aClass15Array1[this.anInt219];
								local148 = local507.anIntArray149[this.anInt192];
								local507.anIntArray149[this.anInt192] = local507.anIntArray149[this.anInt220];
								local507.anIntArray149[this.anInt220] = local148;
								local148 = local507.anIntArray150[this.anInt192];
								local507.anIntArray150[this.anInt192] = local507.anIntArray150[this.anInt220];
								local507.anIntArray150[this.anInt220] = local148;
								this.aClass1_Sub3_Sub3_6.method372(80);
								this.aClass1_Sub3_Sub3_6.method374(this.anInt219);
								this.aClass1_Sub3_Sub3_6.method374(this.anInt220);
								this.aClass1_Sub3_Sub3_6.method374(this.anInt192);
							}
						} else if ((this.anInt306 == 1 || this.method95(this.anInt252 - 1)) && this.anInt252 > 2) {
							this.method106();
						} else if (this.anInt252 > 0) {
							this.method193(this.anInt252 - 1);
						}
						this.anInt290 = 10;
						super.anInt132 = 0;
					}
				}
				@Pc(615) int local615;
				if (Class33.anInt717 != -1) {
					local615 = Class33.anInt717;
					local148 = Class33.anInt718;
					@Pc(640) boolean local640 = this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local615, local148, true, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 0, 0);
					Class33.anInt717 = -1;
					if (local640) {
						this.anInt337 = super.anInt133;
						this.anInt338 = super.anInt134;
						this.anInt340 = 1;
						this.anInt339 = 0;
					}
				}
				if (super.anInt132 == 1 && this.aString10 != null) {
					this.aString10 = null;
					this.aBoolean60 = true;
					super.anInt132 = 0;
				}
				this.method191();
				this.method75();
				this.method178();
				this.method86();
				if (super.anInt129 == 1 || super.anInt132 == 1) {
					this.anInt167++;
				}
				if (this.anInt324 == 2) {
					this.method88();
				}
				if (this.anInt324 == 2 && this.aBoolean71) {
					this.method141();
				}
				for (local615 = 0; local615 < 5; local615++) {
					local200 = this.anIntArray32[local615]++;
				}
				this.method177();
				anInt311++;
				if (anInt311 > 54) {
					anInt311 = 0;
					this.aClass1_Sub3_Sub3_6.method372(180);
				}
				super.anInt128++;
				if (super.anInt128 > 4500) {
					this.anInt285 = 250;
					super.anInt128 -= 500;
					this.aClass1_Sub3_Sub3_6.method372(161);
				}
				this.anInt169++;
				if (this.anInt169 > 500) {
					this.anInt169 = 0;
					local148 = (int) (Math.random() * 8.0D);
					if ((local148 & 0x1) == 1) {
						this.anInt203 += this.anInt204;
					}
					if ((local148 & 0x2) == 2) {
						this.anInt200 += this.anInt201;
					}
					if ((local148 & 0x4) == 4) {
						this.anInt206 += this.anInt207;
					}
				}
				if (this.anInt203 < -50) {
					this.anInt204 = 2;
				}
				if (this.anInt203 > 50) {
					this.anInt204 = -2;
				}
				if (this.anInt200 < -55) {
					this.anInt201 = 2;
				}
				if (this.anInt200 > 55) {
					this.anInt201 = -2;
				}
				if (this.anInt206 < -40) {
					this.anInt207 = 1;
				}
				if (this.anInt206 > 40) {
					this.anInt207 = -1;
				}
				this.anInt280++;
				if (this.anInt280 > 500) {
					this.anInt280 = 0;
					local148 = (int) (Math.random() * 8.0D);
					if ((local148 & 0x1) == 1) {
						this.anInt149 += this.anInt150;
					}
					if ((local148 & 0x2) == 2) {
						this.anInt253 += this.anInt254;
					}
				}
				if (this.anInt149 < -60) {
					this.anInt150 = 2;
				}
				if (this.anInt149 > 60) {
					this.anInt150 = -2;
				}
				if (this.anInt253 < -20) {
					this.anInt254 = 1;
				}
				if (this.anInt253 > 10) {
					this.anInt254 = -1;
				}
				this.anInt284++;
				if (this.anInt284 > 50) {
					this.aClass1_Sub3_Sub3_6.method372(126);
				}
				try {
					if (this.aClass6_1 != null && this.aClass1_Sub3_Sub3_6.anInt566 > 0) {
						this.aClass6_1.method205((byte) 1, this.aClass1_Sub3_Sub3_6.aByteArray7, this.aClass1_Sub3_Sub3_6.anInt566);
						this.aClass1_Sub3_Sub3_6.anInt566 = 0;
						this.anInt284 = 0;
					}
				} catch (@Pc(982) IOException local982) {
					this.method83(928);
				} catch (@Pc(987) Exception local987) {
					this.method80();
				}
			}
		} catch (@Pc(992) RuntimeException local992) {
			signlink.reporterror("13665, " + 0 + ", " + local992.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method188(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 5) {
				@Pc(6) boolean local6 = false;
			} else {
				this.anInt240 = -203;
			}
			this.aClass1_Sub3_Sub2_Sub3_8 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebox", 0);
			this.aClass1_Sub3_Sub2_Sub3_9 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebutton", 0);
			this.aClass1_Sub3_Sub2_Sub3Array3 = new Class1_Sub3_Sub2_Sub3[12];
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				this.aClass1_Sub3_Sub2_Sub3Array3[local35] = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "runes", local35);
			}
			this.aClass1_Sub3_Sub2_Sub2_1 = new Class1_Sub3_Sub2_Sub2(128, 265);
			this.aClass1_Sub3_Sub2_Sub2_2 = new Class1_Sub3_Sub2_Sub2(128, 265);
			for (@Pc(68) int local68 = 0; local68 < 33920; local68++) {
				this.aClass1_Sub3_Sub2_Sub2_1.anIntArray148[local68] = this.aClass32_13.anIntArray197[local68];
			}
			for (@Pc(86) int local86 = 0; local86 < 33920; local86++) {
				this.aClass1_Sub3_Sub2_Sub2_2.anIntArray148[local86] = this.aClass32_14.anIntArray197[local86];
			}
			this.anIntArray78 = new int[256];
			for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
				this.anIntArray78[local108] = local108 * 262144;
			}
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				this.anIntArray78[local123 + 64] = local123 * 1024 + 16711680;
			}
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray78[local142 + 128] = local142 * 4 + 16776960;
			}
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				this.anIntArray78[local161 + 192] = 16777215;
			}
			this.anIntArray79 = new int[256];
			for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
				this.anIntArray79[local180] = local180 * 1024;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray79[local195 + 64] = local195 * 4 + 65280;
			}
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray79[local214 + 128] = local214 * 262144 + 65535;
			}
			for (@Pc(233) int local233 = 0; local233 < 64; local233++) {
				this.anIntArray79[local233 + 192] = 16777215;
			}
			this.anIntArray80 = new int[256];
			for (@Pc(252) int local252 = 0; local252 < 64; local252++) {
				this.anIntArray80[local252] = local252 * 4;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray80[local267 + 64] = local267 * 262144 + 255;
			}
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray80[local286 + 128] = local286 * 1024 + 16711935;
			}
			for (@Pc(305) int local305 = 0; local305 < 64; local305++) {
				this.anIntArray80[local305 + 192] = 16777215;
			}
			this.anIntArray77 = new int[256];
			this.anIntArray55 = new int[32768];
			this.anIntArray56 = new int[32768];
			this.method117(null);
			this.anIntArray71 = new int[32768];
			this.anIntArray72 = new int[32768];
			this.method74(10, "Connecting to fileserver");
			if (!this.aBoolean53) {
				this.aBoolean54 = true;
				this.aBoolean53 = true;
				this.method73(this, 2);
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("6991, " + arg0 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method189(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method190() {
		try {
			if (this.anInt138 != 0) {
				@Pc(6) Class1_Sub3_Sub2_Sub4 local6 = this.aClass1_Sub3_Sub2_Sub4_2;
				@Pc(8) int local8 = 0;
				if (this.anInt332 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray7[local15] != null) {
						@Pc(27) int local27 = this.anIntArray44[local15];
						@Pc(58) int local58;
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt227 == 0 || this.anInt227 == 1 && this.method176(this.aStringArray6[local15], this.anInt181))) {
							local58 = 329 - local8 * 13;
							local6.method361(4, 0, "From " + this.aStringArray6[local15] + ": " + this.aStringArray7[local15], local58);
							local6.method361(4, 65535, "From " + this.aStringArray6[local15] + ": " + this.aStringArray7[local15], local58 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt227 < 2) {
							local58 = 329 - local8 * 13;
							local6.method361(4, 0, this.aStringArray7[local15], local58);
							local6.method361(4, 65535, this.aStringArray7[local15], local58 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt227 < 2) {
							local58 = 329 - local8 * 13;
							local6.method361(4, 0, "To " + this.aStringArray6[local15] + ": " + this.aStringArray7[local15], local58);
							local6.method361(4, 65535, "To " + this.aStringArray6[local15] + ": " + this.aStringArray7[local15], local58 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				this.aBoolean37 &= true;
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("33304, " + true + ", " + local229.toString());
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
				return new URL("http://127.0.0.1:" + (anInt152 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method74(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.method94();
			if (this.aClass39_1 == null) {
				super.method74(arg0, arg1);
			} else {
				this.aClass32_12.method455();
				this.aClass1_Sub3_Sub2_Sub4_3.method358(180, 54, "RuneScape is loading - please wait...", 16777215);
				this.anInt281 += 0;
				Class1_Sub3_Sub2.method355(9179409, aBoolean65, 28, 62, 34, 304);
				Class1_Sub3_Sub2.method355(0, aBoolean65, 29, 63, 32, 302);
				Class1_Sub3_Sub2.method354(9179409, 30, 64, arg0 * 3, 30);
				Class1_Sub3_Sub2.method354(0, arg0 * 3 + 30, 64, 300 - arg0 * 3, 30);
				this.aClass1_Sub3_Sub2_Sub4_3.method358(180, 85, arg1, 16777215);
				this.aClass32_12.method456(186, super.aGraphics2, 214);
				if (this.aBoolean64) {
					this.aBoolean64 = false;
					if (!this.aBoolean53) {
						this.aClass32_13.method456(0, super.aGraphics2, 0);
						this.aClass32_14.method456(0, super.aGraphics2, 661);
					}
					this.aClass32_10.method456(0, super.aGraphics2, 128);
					this.aClass32_11.method456(386, super.aGraphics2, 214);
					this.aClass32_15.method456(265, super.aGraphics2, 0);
					this.aClass32_16.method456(265, super.aGraphics2, 574);
					this.aClass32_17.method456(186, super.aGraphics2, 128);
					this.aClass32_18.method456(186, super.aGraphics2, 574);
				}
			}
		} catch (@Pc(210) RuntimeException local210) {
			signlink.reporterror("64995, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local210.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method191() {
		try {
			if (this.anInt221 == 0) {
				@Pc(10) int local10 = super.anInt132;
				if (this.anInt317 == 1 && super.anInt133 >= 520 && super.anInt134 >= 165 && super.anInt133 <= 788 && super.anInt134 <= 230) {
					local10 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean52) {
					if (local10 != 1) {
						local41 = super.anInt130;
						local44 = super.anInt131;
						if (this.anInt142 == 0) {
							local41 -= 8;
							local44 -= 11;
						}
						if (this.anInt142 == 1) {
							local41 -= 562;
							local44 -= 231;
						}
						if (this.anInt142 == 2) {
							local41 -= 22;
							local44 -= 375;
						}
						if (local41 < this.anInt143 - 10 || local41 > this.anInt143 + this.anInt145 + 10 || local44 < this.anInt144 - 10 || local44 > this.anInt144 + this.anInt146 + 10) {
							this.aBoolean52 = false;
							if (this.anInt142 == 1) {
								this.aBoolean69 = true;
							}
							if (this.anInt142 == 2) {
								this.aBoolean60 = true;
							}
						}
					}
					if (local10 == 1) {
						local41 = this.anInt143;
						local44 = this.anInt144;
						local120 = this.anInt145;
						@Pc(123) int local123 = super.anInt133;
						@Pc(126) int local126 = super.anInt134;
						if (this.anInt142 == 0) {
							local123 -= 8;
							local126 -= 11;
						}
						if (this.anInt142 == 1) {
							local123 -= 562;
							local126 -= 231;
						}
						if (this.anInt142 == 2) {
							local123 -= 22;
							local126 -= 375;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt252; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt252 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method193(local145);
						}
						this.aBoolean52 = false;
						if (this.anInt142 == 1) {
							this.aBoolean69 = true;
						}
						if (this.anInt142 == 2) {
							this.aBoolean60 = true;
							return;
						}
					}
				} else {
					if (local10 == 1 && this.anInt252 > 0) {
						local41 = this.anIntArray52[this.anInt252 - 1];
						if (local41 == 134 || local41 == 701 || local41 == 570 || local41 == 719 || local41 == 440 || local41 == 871 || local41 == 526 || local41 == 156 || local41 == 120 || local41 == 796 || local41 == 357) {
							local44 = this.anIntArray50[this.anInt252 - 1];
							local120 = this.anIntArray51[this.anInt252 - 1];
							@Pc(279) Class15 local279 = Class15.aClass15Array1[local120];
							if (local279.aBoolean106) {
								this.aBoolean48 = false;
								this.anInt156 = 0;
								this.anInt219 = local120;
								this.anInt220 = local44;
								this.anInt221 = 2;
								this.anInt222 = super.anInt133;
								this.anInt223 = super.anInt134;
								if (Class15.aClass15Array1[local120].anInt472 == this.anInt286) {
									this.anInt221 = 1;
								}
								if (Class15.aClass15Array1[local120].anInt472 == this.anInt288) {
									this.anInt221 = 3;
								}
								return;
							}
						}
					}
					if (local10 == 1 && (this.anInt306 == 1 || this.method95(this.anInt252 - 1)) && this.anInt252 > 2) {
						local10 = 2;
					}
					if (local10 == 1 && this.anInt252 > 0) {
						this.method193(this.anInt252 - 1);
					}
					if (local10 != 2 || this.anInt252 <= 0) {
						return;
					}
					this.method106();
				}
			}
		} catch (@Pc(371) RuntimeException local371) {
			signlink.reporterror("31973, " + 34166 + ", " + local371.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
	private int method192(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 != 126) {
				this.aBoolean45 = !this.aBoolean45;
			}
			@Pc(14) int local14 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * local14 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * local14 + (arg3 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("49747, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method193(@OriginalArg(1) int arg0) {
		try {
			this.anInt281 += 0;
			if (arg0 >= 0) {
				if (this.aBoolean57) {
					this.aBoolean57 = false;
					this.aBoolean60 = true;
				}
				@Pc(24) int local24 = this.anIntArray50[arg0];
				@Pc(29) int local29 = this.anIntArray51[arg0];
				@Pc(34) int local34 = this.anIntArray52[arg0];
				@Pc(39) int local39 = this.anIntArray53[arg0];
				if (local34 >= 2000) {
					local34 -= 2000;
				}
				@Pc(51) Class1_Sub1_Sub3_Sub1 local51;
				if (local34 == 493) {
					local51 = this.aClass1_Sub1_Sub3_Sub1Array1[local39];
					if (local51 != null) {
						this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local51.anIntArray232[0], local51.anIntArray233[0], false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
						this.anInt337 = super.anInt133;
						this.anInt338 = super.anInt134;
						this.anInt340 = 2;
						this.anInt339 = 0;
						this.aClass1_Sub3_Sub3_6.method372(36);
						this.aClass1_Sub3_Sub3_6.method374(local39);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt233);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt231);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt232);
					}
				}
				if (local34 == 134 || local34 == 701 || local34 == 570 || local34 == 719 || local34 == 440) {
					if (local34 == 719) {
						this.aClass1_Sub3_Sub3_6.method372(186);
					}
					if (local34 == 701) {
						this.aClass1_Sub3_Sub3_6.method372(47);
					}
					if (local34 == 134) {
						this.aClass1_Sub3_Sub3_6.method372(90);
					}
					if (local34 == 570) {
						this.aClass1_Sub3_Sub3_6.method372(121);
					}
					if (local34 == 440) {
						this.aClass1_Sub3_Sub3_6.method372(31);
					}
					this.aClass1_Sub3_Sub3_6.method374(local39);
					this.aClass1_Sub3_Sub3_6.method374(local24);
					this.aClass1_Sub3_Sub3_6.method374(local29);
					this.anInt290 = 0;
					this.anInt291 = local29;
					this.anInt292 = local24;
					this.anInt293 = 2;
					if (Class15.aClass15Array1[local29].anInt472 == this.anInt286) {
						this.anInt293 = 1;
					}
					if (Class15.aClass15Array1[local29].anInt472 == this.anInt288) {
						this.anInt293 = 3;
					}
				}
				@Pc(231) int local231;
				@Pc(242) long local242;
				@Pc(244) int local244;
				@Pc(227) String local227;
				if (local34 == 125) {
					local227 = this.aStringArray8[arg0];
					local231 = local227.indexOf("@whi@");
					if (local231 != -1) {
						local242 = Class40.method530(local227.substring(local231 + 5).trim());
						local244 = -1;
						for (@Pc(246) int local246 = 0; local246 < this.anInt141; local246++) {
							if (this.aLongArray4[local246] == local242) {
								local244 = local246;
								break;
							}
						}
						if (local244 != -1 && this.anIntArray64[local244] > 0) {
							this.aBoolean60 = true;
							this.aBoolean57 = false;
							this.aBoolean62 = true;
							this.aString13 = "";
							this.anInt210 = 3;
							this.aLong8 = this.aLongArray4[local244];
							this.aString14 = "Enter message to send to " + this.aStringArray9[local244];
						}
					}
				}
				@Pc(311) Class5 local311;
				@Pc(320) String local320;
				if (local34 == 1308) {
					local311 = Class5.method54(local39);
					if (local311.aByteArray3 == null) {
						local320 = "It's a " + local311.aString3 + ".";
					} else {
						local320 = new String(local311.aByteArray3);
					}
					this.method103(local320, 0, "");
				}
				if (local34 == 798) {
					anInt249++;
					if (anInt249 >= 135) {
						this.aClass1_Sub3_Sub3_6.method372(253);
						this.aClass1_Sub3_Sub3_6.method374(10151);
					}
					this.method195(local24, 207, local29, local39);
				}
				if (local34 == 829) {
					anInt259 += local29;
					if (anInt259 >= 132) {
						this.aClass1_Sub3_Sub3_6.method372(27);
						this.aClass1_Sub3_Sub3_6.method374(17379);
					}
					this.method195(local24, 223, local29, local39);
				}
				@Pc(401) Class1_Sub1_Sub3_Sub2 local401;
				if (local34 == 48) {
					local401 = this.aClass1_Sub1_Sub3_Sub2Array1[local39];
					if (local401 != null) {
						this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local401.anIntArray232[0], local401.anIntArray233[0], false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
						this.anInt337 = super.anInt133;
						this.anInt338 = super.anInt134;
						this.anInt340 = 2;
						this.anInt339 = 0;
						this.aClass1_Sub3_Sub3_6.method372(39);
						this.aClass1_Sub3_Sub3_6.method374(local39);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt318);
					}
				}
				if (local34 == 104) {
					this.method195(local24, 168, local29, local39);
				}
				if (local34 == 237) {
					this.aClass1_Sub3_Sub3_6.method372(106);
					this.aClass1_Sub3_Sub3_6.method374(local39);
					this.aClass1_Sub3_Sub3_6.method374(local24);
					this.aClass1_Sub3_Sub3_6.method374(local29);
					this.aClass1_Sub3_Sub3_6.method374(this.anInt233);
					this.aClass1_Sub3_Sub3_6.method374(this.anInt231);
					this.aClass1_Sub3_Sub3_6.method374(this.anInt232);
					this.anInt290 = 0;
					this.anInt291 = local29;
					this.anInt292 = local24;
					this.anInt293 = 2;
					if (Class15.aClass15Array1[local29].anInt472 == this.anInt286) {
						this.anInt293 = 1;
					}
					if (Class15.aClass15Array1[local29].anInt472 == this.anInt288) {
						this.anInt293 = 3;
					}
				}
				@Pc(564) boolean local564;
				if (local34 == 203) {
					local564 = this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local24, local29, false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 2, 0);
					if (!local564) {
						this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local24, local29, false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
					}
					this.anInt337 = super.anInt133;
					this.anInt338 = super.anInt134;
					this.anInt340 = 2;
					this.anInt339 = 0;
					this.aClass1_Sub3_Sub3_6.method372(183);
					this.aClass1_Sub3_Sub3_6.method374(local24 + this.anInt296);
					this.aClass1_Sub3_Sub3_6.method374(local29 + this.anInt297);
					this.aClass1_Sub3_Sub3_6.method374(local39);
					this.aClass1_Sub3_Sub3_6.method374(this.anInt233);
					this.aClass1_Sub3_Sub3_6.method374(this.anInt231);
					this.aClass1_Sub3_Sub3_6.method374(this.anInt232);
				}
				if (local34 == 981) {
					if (this.aBoolean52) {
						this.aClass33_1.method498(local29 - 11, local24 - 8);
					} else {
						this.aClass33_1.method498(super.anInt134 - 11, super.anInt133 - 8);
					}
				}
				@Pc(687) Class15 local687;
				if (local34 == 967) {
					this.aClass1_Sub3_Sub3_6.method372(222);
					this.aClass1_Sub3_Sub3_6.method374(local29);
					local687 = Class15.aClass15Array1[local29];
					if (local687.anIntArrayArray15 != null && local687.anIntArrayArray15[0][0] == 5) {
						local231 = local687.anIntArrayArray15[0][1];
						this.anIntArray63[local231] = 1 - this.anIntArray63[local231];
						this.method153(local231);
						this.aBoolean69 = true;
					}
				}
				if (local34 == 447 || local34 == 158 || local34 == 804 || local34 == 521) {
					local227 = this.aStringArray8[arg0];
					local231 = local227.indexOf("@whi@");
					if (local231 != -1) {
						local242 = Class40.method530(local227.substring(local231 + 5).trim());
						if (local34 == 447) {
							this.method85(local242);
						}
						if (local34 == 158) {
							this.method174(local242);
						}
						if (local34 == 804) {
							this.method112(local242);
						}
						if (local34 == 521) {
							this.method84(local242);
						}
					}
				}
				if (local34 == 316) {
					local227 = this.aStringArray8[arg0];
					local231 = local227.indexOf("@whi@");
					if (local231 != -1) {
						this.method110();
						this.aString8 = local227.substring(local231 + 5).trim();
						this.aBoolean66 = false;
						for (@Pc(813) int local813 = 0; local813 < Class15.aClass15Array1.length; local813++) {
							if (Class15.aClass15Array1[local813] != null && Class15.aClass15Array1[local813].anInt475 == 600) {
								this.anInt309 = this.anInt286 = Class15.aClass15Array1[local813].anInt472;
								break;
							}
						}
					}
				}
				if (local34 == 103) {
					local401 = this.aClass1_Sub1_Sub3_Sub2Array1[local39];
					if (local401 != null) {
						this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local401.anIntArray232[0], local401.anIntArray233[0], false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
						this.anInt337 = super.anInt133;
						this.anInt338 = super.anInt134;
						this.anInt340 = 2;
						this.anInt339 = 0;
						this.aClass1_Sub3_Sub3_6.method372(184);
						this.aClass1_Sub3_Sub3_6.method374(local39);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt233);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt231);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt232);
					}
				}
				if (local34 == 357) {
					this.anInt230 = 1;
					this.anInt231 = local24;
					this.anInt232 = local29;
					this.anInt233 = local39;
					this.aString9 = Class5.method54(local39).aString3;
					this.anInt317 = 0;
				} else {
					if (local34 == 543) {
						local564 = this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local24, local29, false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 2, 0);
						if (!local564) {
							this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local24, local29, false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
						}
						this.anInt337 = super.anInt133;
						this.anInt338 = super.anInt134;
						this.anInt340 = 2;
						this.anInt339 = 0;
						this.aClass1_Sub3_Sub3_6.method372(241);
						this.aClass1_Sub3_Sub3_6.method374(local24 + this.anInt296);
						this.aClass1_Sub3_Sub3_6.method374(local29 + this.anInt297);
						this.aClass1_Sub3_Sub3_6.method374(local39);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt318);
					}
					@Pc(1056) String local1056;
					if (local34 == 1418) {
						@Pc(1044) int local1044 = local39 >> 14 & 0x7FFF;
						@Pc(1047) Class2 local1047 = Class2.method23(local1044);
						if (local1047.aByteArray1 == null) {
							local1056 = "It's a " + local1047.aString1 + ".";
						} else {
							local1056 = new String(local1047.aByteArray1);
						}
						this.method103(local1056, 0, "");
					}
					if (local34 == 595 || local34 == 835) {
						local227 = this.aStringArray8[arg0];
						local231 = local227.indexOf("@whi@");
						if (local231 != -1) {
							local227 = local227.substring(local231 + 5).trim();
							local1056 = Class40.method534(Class40.method531(Class40.method530(local227)));
							@Pc(1109) boolean local1109 = false;
							for (local244 = 0; local244 < this.anInt187; local244++) {
								@Pc(1121) Class1_Sub1_Sub3_Sub2 local1121 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray45[local244]];
								if (local1121 != null && local1121.aString30 != null && local1121.aString30.equalsIgnoreCase(local1056)) {
									this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local1121.anIntArray232[0], local1121.anIntArray233[0], false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
									if (local34 == 595) {
										this.aClass1_Sub3_Sub3_6.method372(245);
									}
									if (local34 == 835) {
										this.aClass1_Sub3_Sub3_6.method372(173);
									}
									this.aClass1_Sub3_Sub3_6.method374(this.anIntArray45[local244]);
									local1109 = true;
									break;
								}
							}
							if (!local1109) {
								this.method103("Unable to find " + local1056, 0, "");
							}
						}
					}
					if (local34 == 1814) {
						local51 = this.aClass1_Sub1_Sub3_Sub1Array1[local39];
						if (local51 != null) {
							if (local51.aClass3_1.aByteArray2 == null) {
								local320 = "It's a " + local51.aClass3_1.aString2 + ".";
							} else {
								local320 = new String(local51.aClass3_1.aByteArray2);
							}
							this.method103(local320, 0, "");
						}
					}
					if (local34 == 505 && this.method195(local24, 139, local29, local39)) {
						this.aClass1_Sub3_Sub3_6.method374(this.anInt233);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt231);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt232);
					}
					if (local34 == 706) {
						local687 = Class15.aClass15Array1[local29];
						@Pc(1282) boolean local1282 = true;
						if (local687.anInt475 > 0) {
							local1282 = this.method108(local687);
						}
						if (local1282) {
							this.aClass1_Sub3_Sub3_6.method372(222);
							this.aClass1_Sub3_Sub3_6.method374(local29);
						}
					}
					if (local34 == 73 && !this.aBoolean63) {
						this.aClass1_Sub3_Sub3_6.method372(218);
						this.aClass1_Sub3_Sub3_6.method374(local29);
						this.aBoolean63 = true;
					}
					if (local34 == 672) {
						this.aClass1_Sub3_Sub3_6.method372(222);
						this.aClass1_Sub3_Sub3_6.method374(local29);
						local687 = Class15.aClass15Array1[local29];
						if (local687.anIntArrayArray15 != null && local687.anIntArrayArray15[0][0] == 5) {
							local231 = local687.anIntArrayArray15[0][1];
							if (this.anIntArray63[local231] != local687.anIntArray152[0]) {
								this.anIntArray63[local231] = local687.anIntArray152[0];
								this.method153(local231);
								this.aBoolean69 = true;
							}
						}
					}
					if (local34 == 988 || local34 == 345 || local34 == 249 || local34 == 960 || local34 == 40) {
						local51 = this.aClass1_Sub1_Sub3_Sub1Array1[local39];
						if (local51 != null) {
							this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local51.anIntArray232[0], local51.anIntArray233[0], false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
							this.anInt337 = super.anInt133;
							this.anInt338 = super.anInt134;
							this.anInt340 = 2;
							this.anInt339 = 0;
							if (local34 == 345) {
								anInt247 += local39;
								if (anInt247 >= 116) {
									this.aClass1_Sub3_Sub3_6.method372(217);
								}
								this.aClass1_Sub3_Sub3_6.method372(191);
							}
							if (local34 == 249) {
								this.aClass1_Sub3_Sub3_6.method372(89);
							}
							if (local34 == 988) {
								this.aClass1_Sub3_Sub3_6.method372(236);
							}
							if (local34 == 40) {
								this.aClass1_Sub3_Sub3_6.method372(198);
							}
							if (local34 == 960) {
								this.aClass1_Sub3_Sub3_6.method372(114);
							}
							this.aClass1_Sub3_Sub3_6.method374(local39);
						}
					}
					if (local34 == 873) {
						this.method195(local24, 196, local29, local39);
					}
					if (local34 == 309) {
						this.method110();
					}
					if (local34 == 1974) {
						local311 = Class5.method54(local39);
						if (local29 >= 100000) {
							local320 = local29 + " x " + local311.aString3;
						} else if (local311.aByteArray3 == null) {
							local320 = "It's a " + local311.aString3 + ".";
						} else {
							local320 = new String(local311.aByteArray3);
						}
						this.method103(local320, 0, "");
					}
					if (local34 == 871 || local34 == 526 || local34 == 156 || local34 == 120 || local34 == 796) {
						if (local34 == 526) {
							this.aClass1_Sub3_Sub3_6.method372(0);
						}
						if (local34 == 871) {
							anInt326 += local39;
							if (anInt326 >= 76) {
								this.aClass1_Sub3_Sub3_6.method372(214);
								this.aClass1_Sub3_Sub3_6.method373(171);
							}
							this.aClass1_Sub3_Sub3_6.method372(140);
						}
						if (local34 == 120) {
							this.aClass1_Sub3_Sub3_6.method372(112);
						}
						if (local34 == 156) {
							anInt140++;
							if (anInt140 >= 62) {
								this.aClass1_Sub3_Sub3_6.method372(82);
								this.aClass1_Sub3_Sub3_6.method373(142);
							}
							this.aClass1_Sub3_Sub3_6.method372(155);
						}
						if (local34 == 796) {
							if ((local39 & 0x3) == 0) {
								anInt327++;
							}
							if (anInt327 >= 124) {
								this.aClass1_Sub3_Sub3_6.method372(167);
								this.aClass1_Sub3_Sub3_6.method377(0);
							}
							this.aClass1_Sub3_Sub3_6.method372(122);
						}
						this.aClass1_Sub3_Sub3_6.method374(local39);
						this.aClass1_Sub3_Sub3_6.method374(local24);
						this.aClass1_Sub3_Sub3_6.method374(local29);
						this.anInt290 = 0;
						this.anInt291 = local29;
						this.anInt292 = local24;
						this.anInt293 = 2;
						if (Class15.aClass15Array1[local29].anInt472 == this.anInt286) {
							this.anInt293 = 1;
						}
						if (Class15.aClass15Array1[local29].anInt472 == this.anInt288) {
							this.anInt293 = 3;
						}
					}
					if (local34 == 1528 || local34 == 1741 || local34 == 593 || local34 == 1596) {
						local401 = this.aClass1_Sub1_Sub3_Sub2Array1[local39];
						if (local401 != null) {
							this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local401.anIntArray232[0], local401.anIntArray233[0], false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
							this.anInt337 = super.anInt133;
							this.anInt338 = super.anInt134;
							this.anInt340 = 2;
							this.anInt339 = 0;
							if (local34 == 593) {
								this.aClass1_Sub3_Sub3_6.method372(28);
							}
							if (local34 == 1596) {
								this.aClass1_Sub3_Sub3_6.method372(173);
							}
							if (local34 == 1528) {
								this.aClass1_Sub3_Sub3_6.method372(245);
							}
							if (local34 == 1741) {
								if ((local39 & 0x3) == 0) {
									anInt194++;
								}
								if (anInt194 >= 139) {
									this.aClass1_Sub3_Sub3_6.method372(84);
									this.aClass1_Sub3_Sub3_6.method377(0);
								}
								this.aClass1_Sub3_Sub3_6.method372(63);
							}
							this.aClass1_Sub3_Sub3_6.method374(local39);
						}
					}
					if (local34 == 1659) {
						this.method195(local24, 181, local29, local39);
					}
					if (local34 == 737 && this.method195(local24, 9, local29, local39)) {
						this.aClass1_Sub3_Sub3_6.method374(this.anInt318);
					}
					if (local34 == 63) {
						this.aClass1_Sub3_Sub3_6.method372(158);
						this.aClass1_Sub3_Sub3_6.method374(local39);
						this.aClass1_Sub3_Sub3_6.method374(local24);
						this.aClass1_Sub3_Sub3_6.method374(local29);
						this.aClass1_Sub3_Sub3_6.method374(this.anInt318);
						this.anInt290 = 0;
						this.anInt291 = local29;
						this.anInt292 = local24;
						this.anInt293 = 2;
						if (Class15.aClass15Array1[local29].anInt472 == this.anInt286) {
							this.anInt293 = 1;
						}
						if (Class15.aClass15Array1[local29].anInt472 == this.anInt288) {
							this.anInt293 = 3;
						}
					}
					if (local34 == 500) {
						local51 = this.aClass1_Sub1_Sub3_Sub1Array1[local39];
						if (local51 != null) {
							this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local51.anIntArray232[0], local51.anIntArray233[0], false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
							this.anInt337 = super.anInt133;
							this.anInt338 = super.anInt134;
							this.anInt340 = 2;
							this.anInt339 = 0;
							this.aClass1_Sub3_Sub3_6.method372(244);
							this.aClass1_Sub3_Sub3_6.method374(local39);
							this.aClass1_Sub3_Sub3_6.method374(this.anInt318);
						}
					}
					if (local34 == 56 || local34 == 321 || local34 == 552 || local34 == 43 || local34 == 687) {
						local564 = this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local24, local29, false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 2, 0);
						if (!local564) {
							this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, local24, local29, false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, 2, 1);
						}
						this.anInt337 = super.anInt133;
						this.anInt338 = super.anInt134;
						this.anInt340 = 2;
						this.anInt339 = 0;
						if (local34 == 43) {
							this.aClass1_Sub3_Sub3_6.method372(143);
						}
						if (local34 == 687) {
							anInt242++;
							if (anInt242 >= 121) {
								this.aClass1_Sub3_Sub3_6.method372(13);
								this.aClass1_Sub3_Sub3_6.method373(128);
							}
							this.aClass1_Sub3_Sub3_6.method372(192);
						}
						if (local34 == 56) {
							this.aClass1_Sub3_Sub3_6.method372(91);
						}
						if (local34 == 552) {
							this.aClass1_Sub3_Sub3_6.method372(226);
						}
						if (local34 == 321) {
							this.aClass1_Sub3_Sub3_6.method372(48);
						}
						this.aClass1_Sub3_Sub3_6.method374(local24 + this.anInt296);
						this.aClass1_Sub3_Sub3_6.method374(local29 + this.anInt297);
						this.aClass1_Sub3_Sub3_6.method374(local39);
					}
					if (local34 == 941) {
						local687 = Class15.aClass15Array1[local29];
						this.anInt317 = 1;
						this.anInt318 = local29;
						this.anInt319 = local687.anInt494;
						this.anInt230 = 0;
						local320 = local687.aString22;
						if (local320.indexOf(" ") != -1) {
							local320 = local320.substring(0, local320.indexOf(" "));
						}
						local1056 = local687.aString22;
						if (local1056.indexOf(" ") != -1) {
							local1056 = local1056.substring(local1056.indexOf(" ") + 1);
						}
						this.aString16 = local320 + " " + local687.aString23 + " " + local1056;
						if (this.anInt319 == 16) {
							this.aBoolean69 = true;
							this.anInt325 = 3;
							this.aBoolean47 = true;
						}
					} else {
						this.anInt230 = 0;
						this.anInt317 = 0;
					}
				}
			}
		} catch (@Pc(2227) RuntimeException local2227) {
			signlink.reporterror("38400, " + 0 + ", " + arg0 + ", " + local2227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method194() {
		try {
			this.anInt258++;
			this.method199();
			this.method197();
			this.method81();
			this.method158();
			this.method162(this.aByte22);
			@Pc(33) int local33;
			@Pc(72) int local72;
			if (!this.aBoolean71) {
				local33 = this.anInt176;
				if (this.anInt168 / 256 > local33) {
					local33 = this.anInt168 / 256;
				}
				if (this.aBooleanArray1[4] && this.anIntArray82[4] + 128 > local33) {
					local33 = this.anIntArray82[4] + 128;
				}
				local72 = this.anInt177 + this.anInt206 & 0x7FF;
				this.method163(this.anInt190, this.anInt189, local33 * 3 + 600, local33, local72, this.method159(this.aClass1_Sub1_Sub3_Sub2_1.anInt897, this.aClass1_Sub1_Sub3_Sub2_1.anInt896, this.anInt172) - 50);
			}
			if (this.aBoolean71) {
				local33 = this.method173();
			} else {
				local33 = this.method172();
			}
			local72 = this.anInt264;
			@Pc(118) int local118 = this.anInt265;
			@Pc(121) int local121 = this.anInt266;
			@Pc(124) int local124 = this.anInt267;
			@Pc(127) int local127 = this.anInt268;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray1[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray43[local129] * 2 + 1) - (double) this.anIntArray43[local129] + Math.sin((double) this.anIntArray32[local129] * ((double) this.anIntArray86[local129] / 100.0D)) * (double) this.anIntArray82[local129]);
					if (local129 == 0) {
						this.anInt264 += local176;
					}
					if (local129 == 1) {
						this.anInt265 += local176;
					}
					if (local129 == 2) {
						this.anInt266 += local176;
					}
					if (local129 == 3) {
						this.anInt268 = this.anInt268 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt267 += local176;
						if (this.anInt267 < 128) {
							this.anInt267 = 128;
						}
						if (this.anInt267 > 383) {
							this.anInt267 = 383;
						}
					}
				}
			}
			local176 = Class1_Sub3_Sub2_Sub1.anInt434;
			Class1_Sub3_Sub1.aBoolean82 = true;
			Class1_Sub3_Sub1.anInt375 = 0;
			Class1_Sub3_Sub1.anInt373 = super.anInt130 - 8;
			Class1_Sub3_Sub1.anInt374 = super.anInt131 - 11;
			Class1_Sub3_Sub2.method353();
			this.aClass33_1.method499(this.anInt265, this.anInt267, local33, this.anInt264, this.anInt266, this.anInt268);
			this.aClass33_1.method473();
			this.method123();
			this.method179();
			this.method129(local176);
			this.method93(this.anInt155);
			this.aClass32_5.method456(11, super.aGraphics2, 8);
			this.anInt264 = local72;
			this.anInt265 = local118;
			this.anInt266 = local121;
			this.anInt267 = local124;
			this.anInt268 = local127;
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("94859, " + false + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass33_1.method490(this.anInt172, arg0, arg2, arg3);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class2 local43 = Class2.method23(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt40;
					local54 = local43.anInt41;
				} else {
					local51 = local43.anInt41;
					local54 = local43.anInt40;
				}
				@Pc(65) int local65 = local43.anInt52;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], local65, 0, arg0, arg2, false, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local51, 2, local54);
			} else {
				this.method166(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, local25 + 1, arg0, arg2, false, local31, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, 2, 0);
			}
			this.anInt337 = super.anInt133;
			this.anInt338 = super.anInt134;
			this.anInt340 = 2;
			this.anInt339 = 0;
			this.aClass1_Sub3_Sub3_6.method372(arg1);
			this.aClass1_Sub3_Sub3_6.method374(arg0 + this.anInt296);
			this.aClass1_Sub3_Sub3_6.method374(arg2 + this.anInt297);
			this.aClass1_Sub3_Sub3_6.method374(local7);
			return true;
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("45409, " + arg0 + ", " + arg1 + ", " + -57 + ", " + arg2 + ", " + arg3 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method196() {
		try {
			@Pc(10) int local10 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt896 >> 7) + this.anInt296;
			@Pc(19) int local19 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt897 >> 7) + this.anInt297;
			if (local10 >= 2944 && local10 < 3392 && local19 >= 3520 && local19 < 6400) {
				this.anInt257 = (local19 - 3520) / 8 + 1;
			} else if (local10 >= 2944 && local10 < 3392 && local19 >= 9920 && local19 < 12800) {
				this.anInt257 = (local19 - 9920) / 8 + 1;
			} else {
				this.anInt257 = 0;
			}
			this.anInt335 = 0;
			if (local10 >= 3328 && local10 < 3392 && local19 >= 3200 && local19 < 3264) {
				@Pc(93) int local93 = local10 & 0x3F;
				@Pc(97) int local97 = local19 & 0x3F;
				if (local93 >= 4 && local93 <= 29 && local97 >= 44 && local97 <= 58) {
					this.anInt335 = 1;
				}
				if (local93 >= 36 && local93 <= 61 && local97 >= 44 && local97 <= 58) {
					this.anInt335 = 1;
				}
				if (local93 >= 4 && local93 <= 29 && local97 >= 25 && local97 <= 39) {
					this.anInt335 = 1;
				}
				if (local93 >= 36 && local93 <= 61 && local97 >= 25 && local97 <= 39) {
					this.anInt335 = 1;
				}
				if (local93 >= 4 && local93 <= 29 && local97 >= 6 && local97 <= 20) {
					this.anInt335 = 1;
				}
				if (local93 >= 36 && local93 <= 61 && local97 >= 6 && local97 <= 20) {
					this.anInt335 = 1;
				}
			}
			if (this.anInt335 == 0 && local10 >= 3328 && local10 <= 3393 && local19 >= 3203 && local19 <= 3325) {
				this.anInt335 = 2;
			}
			this.anInt229 = 0;
			if (local10 >= 3053 && local10 <= 3156 && local19 >= 3056 && local19 <= 3136) {
				this.anInt229 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local19 >= 9492 && local19 <= 9535) {
				this.anInt229 = 1;
			}
			if (this.anInt229 == 1 && local10 >= 3139 && local10 <= 3199 && local19 >= 3008 && local19 <= 3062) {
				this.anInt229 = 0;
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("12508, " + 26510 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method197() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt234; local1++) {
				@Pc(11) Class1_Sub1_Sub3_Sub1 local11 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray62[local1]];
				@Pc(20) int local20 = (this.anIntArray62[local1] << 14) + 536870912;
				if (local11 != null && local11.method563()) {
					@Pc(31) int local31 = local11.anInt896 >> 7;
					@Pc(36) int local36 = local11.anInt897 >> 7;
					if (local31 >= 0 && local31 < 104 && local36 >= 0 && local36 < 104) {
						if (local11.anInt899 == 1 && (local11.anInt896 & 0x7F) == 64 && (local11.anInt897 & 0x7F) == 64) {
							if (this.anIntArrayArray4[local31][local36] == this.anInt258) {
								continue;
							}
							this.anIntArrayArray4[local31][local36] = this.anInt258;
						}
						this.aClass33_1.method470((local11.anInt899 - 1) * 64 + 60, local11.anInt898, local11.anInt896, this.method159(local11.anInt897, local11.anInt896, this.anInt172), local20, this.anInt172, local11, null, local11.anInt897, local11.aBoolean167);
					}
				}
			}
			this.anInt281 += 0;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("96936, " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Z")
	private boolean method198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class15 local7 = Class15.aClass15Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray153.length && local7.anIntArray153[local9] != -1; local9++) {
				@Pc(24) Class15 local24 = Class15.aClass15Array1[local7.anIntArray153[local9]];
				if (local24.anInt473 == 1) {
					local3 |= this.method198(local24.anInt471, arg1);
				}
				if (local24.anInt473 == 6 && (local24.anInt489 != -1 || local24.anInt490 != -1)) {
					@Pc(54) boolean local54 = this.method149(local24);
					@Pc(59) int local59;
					if (local54) {
						local59 = local24.anInt490;
					} else {
						local59 = local24.anInt489;
					}
					if (local59 != -1) {
						@Pc(71) Class19 local71 = Class19.aClass19Array1[local59];
						local24.anInt470 += arg1;
						while (local24.anInt470 > local71.anIntArray188[local24.anInt469]) {
							local24.anInt470 -= local71.anIntArray188[local24.anInt469] + 1;
							local24.anInt469++;
							if (local24.anInt469 >= local71.anInt546) {
								local24.anInt469 -= local71.anInt547;
								if (local24.anInt469 < 0 || local24.anInt469 >= local71.anInt546) {
									local24.anInt469 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("39910, " + arg0 + ", " + -25 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method199() {
		try {
			if (this.aClass1_Sub1_Sub3_Sub2_1.anInt896 >> 7 == this.anInt164 && this.aClass1_Sub1_Sub3_Sub2_1.anInt897 >> 7 == this.anInt165) {
				this.anInt164 = 0;
			}
			for (@Pc(32) int local32 = -1; local32 < this.anInt187; local32++) {
				@Pc(40) Class1_Sub1_Sub3_Sub2 local40;
				@Pc(45) int local45;
				if (local32 == -1) {
					local40 = this.aClass1_Sub1_Sub3_Sub2_1;
					local45 = this.anInt186 << 14;
				} else {
					local40 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray45[local32]];
					local45 = this.anIntArray45[local32] << 14;
				}
				if (local40 != null && local40.method563()) {
					local40.aBoolean170 = false;
					if ((aBoolean40 && this.anInt187 > 50 || this.anInt187 > 200) && local32 != -1 && local40.anInt918 == local40.anInt900) {
						local40.aBoolean170 = true;
					}
					@Pc(97) int local97 = local40.anInt896 >> 7;
					@Pc(102) int local102 = local40.anInt897 >> 7;
					if (local97 >= 0 && local97 < 104 && local102 >= 0 && local102 < 104) {
						if (local40.aClass1_Sub3_Sub1_11 == null || anInt239 < local40.anInt948 || anInt239 >= local40.anInt949) {
							if ((local40.anInt896 & 0x7F) == 64 && (local40.anInt897 & 0x7F) == 64) {
								if (this.anIntArrayArray4[local97][local102] == this.anInt258) {
									continue;
								}
								this.anIntArrayArray4[local97][local102] = this.anInt258;
							}
							local40.anInt947 = this.method159(local40.anInt897, local40.anInt896, this.anInt172);
							this.aClass33_1.method470(60, local40.anInt898, local40.anInt896, local40.anInt947, local45, this.anInt172, local40, null, local40.anInt897, local40.aBoolean167);
						} else {
							local40.aBoolean170 = false;
							local40.anInt947 = this.method159(local40.anInt897, local40.anInt896, this.anInt172);
							this.aClass33_1.method471(local40.anInt954, local40.anInt956, local40.anInt947, local40.anInt897, local45, null, local40.anInt953, local40.anInt955, local40, this.anInt172, local40.anInt896, local40.anInt898);
						}
					}
				}
			}
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("43482, " + 97 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method200() {
		try {
			this.aBoolean36 = false;
			while (this.aBoolean59) {
				try {
					Thread.sleep(50L);
				} catch (@Pc(20) Exception local20) {
				}
				@Pc(23) Object local23 = this.anObject1;
				@Pc(28) String local28;
				@Pc(31) int local31;
				@Pc(34) int local34;
				synchronized (this.anObject1) {
					local28 = this.aString4;
					local31 = this.anInt216;
					local34 = this.anInt294;
					this.aString4 = null;
					this.anInt216 = 0;
					this.anInt294 = 0;
				}
				if (local28 != null) {
					@Pc(61) byte[] local61 = signlink.cacheload(local28 + ".mid");
					@Pc(78) int local78;
					if (local61 != null && local31 != 12345678) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local61);
						local78 = (int) this.aCRC32_1.getValue();
						if (local78 != local31) {
							local61 = null;
						}
					}
					if (local61 == null) {
						try {
							@Pc(100) DataInputStream local100 = this.method189(local28 + "_" + local31 + ".mid");
							local61 = new byte[local34];
							@Pc(115) int local115;
							for (@Pc(105) int local105 = 0; local105 < local34; local105 += local115) {
								local115 = local100.read(local61, local105, local34 - local105);
								if (local115 == -1) {
									@Pc(121) byte[] local121 = new byte[local105];
									for (@Pc(123) int local123 = 0; local123 < local105; local123++) {
										local121[local123] = local61[local123];
									}
									local61 = local121;
									local34 = local105;
									break;
								}
							}
							local100.close();
							signlink.cachesave(local28 + ".mid", local61);
						} catch (@Pc(162) Exception local162) {
						}
					}
					if (local61 == null) {
						return;
					}
					local78 = (new Class1_Sub3_Sub3(0, local61)).method388();
					@Pc(176) byte[] local176 = new byte[local78];
					Class34.method511(local176, local78, local61, local34, 4);
					this.method170(local78, true, local176);
				}
			}
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("11807, " + -39294 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
