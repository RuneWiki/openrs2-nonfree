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

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	public static int anInt209;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private static int anInt211;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
	private static boolean aBoolean39;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private static boolean aBoolean41;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private static int anInt219;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private static int anInt224;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private static int anInt225;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private static int anInt247;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private static int anInt251;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private static int anInt262;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private static int anInt277;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	public static int anInt310;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Z")
	private static boolean aBoolean65;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private static int anInt312;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private static int anInt314;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private static int anInt316;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private static int anInt321;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private static int anInt328;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private static int anInt343;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private static int anInt351;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private static int anInt353;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private static int anInt362;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private static int anInt385;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private static int anInt389;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "X", descriptor = "B")
	private static byte aByte3 = 7;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "B")
	private static byte aByte4 = -38;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[I")
	private static int[] anIntArray44 = new int[99];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "B")
	private static byte aByte9;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "B")
	private static byte aByte13;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[I")
	private static int[] anIntArray65;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "B")
	private static byte aByte14;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private static int anInt309;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
	private static boolean aBoolean64;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
	private static boolean aBoolean68;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	public static final int[] anIntArray71;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!gc;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!r;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!vb;")
	private Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!yb;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!rb;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!rb;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!rb;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!rb;")
	private Class37 aClass37_6;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!rb;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!rb;")
	private Class37 aClass37_8;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!rb;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!rb;")
	private Class37 aClass37_10;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!rb;")
	private Class37 aClass37_11;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!rb;")
	private Class37 aClass37_12;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!rb;")
	private Class37 aClass37_13;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Lclient!rb;")
	private Class37 aClass37_14;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Lclient!rb;")
	private Class37 aClass37_15;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!rb;")
	private Class37 aClass37_16;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!rb;")
	private Class37 aClass37_17;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!rb;")
	private Class37 aClass37_18;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!rb;")
	private Class37 aClass37_19;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!rb;")
	private Class37 aClass37_20;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!rb;")
	private Class37 aClass37_21;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!rb;")
	private Class37 aClass37_22;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!rb;")
	private Class37 aClass37_23;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!rb;")
	private Class37 aClass37_24;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!rb;")
	private Class37 aClass37_25;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!rb;")
	private Class37 aClass37_26;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!rb;")
	private Class37 aClass37_27;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "B")
	private byte aByte2 = 7;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt210 = -1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt212 = -661;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt214 = -1;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt216 = 50;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[I")
	private int[] anIntArray33 = new int[this.anInt216];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	private int[] anIntArray34 = new int[this.anInt216];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray35 = new int[this.anInt216];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
	private int[] anIntArray36 = new int[this.anInt216];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray37 = new int[this.anInt216];

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private int[] anIntArray38 = new int[this.anInt216];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
	private int[] anIntArray39 = new int[this.anInt216];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[this.anInt216];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
	private int[] anIntArray40 = new int[5];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
	private int[] anIntArray41 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	private boolean aBoolean42 = true;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private final int[] anIntArray42 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt218 = -337;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "B")
	private byte aByte5 = 110;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[[[Lclient!pb;")
	private Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt222 = 3353893;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt223 = -1;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
	private int[] anIntArray43 = new int[Class32.anInt831];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1 = Class1_Sub1_Sub3.method491(149);

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt233 = -1;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt235 = 2;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray46 = new int[Class32.anInt831];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt239 = -31779;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt240 = 2048;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt241 = 2047;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt240];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[I")
	private int[] anIntArray47 = new int[this.anInt240];

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
	private int[] anIntArray48 = new int[this.anInt240];

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[Lclient!mb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt240];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "B")
	private byte aByte6 = 9;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "B")
	private byte aByte7 = 6;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray49 = new int[256];

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "B")
	private byte aByte8 = 30;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private final int anInt248 = 100;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private int[] anIntArray50 = new int[100];

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt249 = -456;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray51 = new int[5];

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray52 = new int[100];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[I")
	private int[] anIntArray53 = new int[5];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt260 = -1;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "B")
	private byte aByte10 = 8;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "B")
	private byte aByte11 = -17;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[I")
	private int[] anIntArray56 = new int[500];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
	private int[] anIntArray57 = new int[500];

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
	private int[] anIntArray58 = new int[500];

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray59 = new int[500];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt266 = 78;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method491(149);

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method491(149);

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "B")
	private byte aByte12 = 8;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray60 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[I")
	private int[] anIntArray61 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt275 = -278;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt280 = 5063219;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt285 = 5;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt286 = -45991;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt290 = 1;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private boolean aBoolean58 = true;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
	private int[] anIntArray64 = new int[Class32.anInt831];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt294 = 44106;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt295 = 2;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt296 = -1;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt297 = 3;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[I")
	private int[] anIntArray66 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt299 = -1;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt300 = 2301979;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "B")
	private byte aByte15 = -126;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
	private int[] anIntArray67 = new int[5];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt306 = 7759444;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[B")
	private byte[] aByteArray1 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!pb;")
	private Class31 aClass31_1 = new Class31((byte) 9);

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt313 = 9;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt315 = 2;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
	private int[] anIntArray68 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray69 = new int[50];

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt319 = 8;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[500];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
	private int[] anIntArray70 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[Lclient!kc;")
	private Class21[] aClass21Array1 = new Class21[4];

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[Lclient!wb;")
	public Class46[] aClass46Array1 = new Class46[5];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt325 = -1;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!pb;")
	private Class31 aClass31_2 = new Class31((byte) 9);

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt331 = 128;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[5];

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[I")
	private int[] anIntArray75 = new int[2000];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt344 = -1;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt347 = -1;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt348 = 23391;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt350 = 2;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt352 = 9;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt355 = 451;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray76 = new int[151];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	private int[] anIntArray77 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[I")
	private int[] anIntArray78 = new int[7];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt361 = 1;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt363 = -1;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt364 = -1;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
	private int[] anIntArray79 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "[I")
	private int[] anIntArray80 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[I")
	private int[] anIntArray81 = new int[33];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!pb;")
	private Class31 aClass31_3 = new Class31((byte) 9);

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt366 = -1;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt372 = 526;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
	private int[] anIntArray82 = new int[50];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[I")
	private int[] anIntArray83 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt384 = -1;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt387 = 2;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray84 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
	private int[] anIntArray85 = new int[50];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray86 = new int[151];

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray91 = new int[9];

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "B")
	private byte aByte16 = -126;

	static {
		@Pc(273) int local273 = 0;
		@Pc(275) int local275;
		for (local275 = 0; local275 < 99; local275++) {
			@Pc(280) int local280 = local275 + 1;
			@Pc(293) int local293 = (int) ((double) local280 + Math.pow(2.0D, (double) local280 / 7.0D) * 300.0D);
			local273 += local293;
			anIntArray44[local275] = local273 / 4;
		}
		aByte9 = 7;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aByte13 = 8;
		anIntArray65 = new int[32];
		local273 = 2;
		for (local275 = 0; local275 < 32; local275++) {
			anIntArray65[local275] = local273 - 1;
			local273 += local273;
		}
		aByte14 = 105;
		anInt309 = 10;
		aBoolean64 = true;
		aBoolean68 = true;
		anIntArray71 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aString16 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 257);
			if (arg0.length == 5) {
				anInt309 = Integer.parseInt(arg0[0]);
				anInt310 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method184();
				} else if (arg0[2].equals("highmem")) {
					method202();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean64 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean64 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt912 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method79();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method180(@OriginalArg(1) int arg0) {
		try {
			@Pc(12) String local12 = String.valueOf(arg0);
			for (@Pc(17) int local17 = local12.length() - 3; local17 > 0; local17 -= 3) {
				local12 = local12.substring(0, local17) + "," + local12.substring(local17);
			}
			if (local12.length() > 8) {
				local12 = "@gre@" + local12.substring(0, local12.length() - 8) + " million @whi@(" + local12 + ")";
			} else if (local12.length() > 4) {
				local12 = "@cya@" + local12.substring(0, local12.length() - 4) + "K @whi@(" + local12 + ")";
			}
			return " " + local12;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("190, " + 0 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 0) {
				throw new NullPointerException();
			}
			@Pc(9) int local9 = arg1 - arg0;
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
			signlink.reporterror("74480, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private static void method184() {
		try {
			Class36.aBoolean208 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean141 = true;
			aBoolean65 = true;
			Class4.aBoolean28 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("33262, " + -118 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private static void method202() {
		try {
			Class36.aBoolean208 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean141 = false;
			aBoolean65 = false;
			Class4.aBoolean28 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("53707, " + 4 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(IZ)Ljava/lang/String;")
	private static String method204(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("72021, " + arg0 + ", " + true + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method92() {
		try {
			if (super.anInt199 == 1) {
				if (super.anInt200 >= 539 && super.anInt200 <= 573 && super.anInt201 >= 169 && super.anInt201 < 205 && this.anIntArray77[0] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 0;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 569 && super.anInt200 <= 599 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray77[1] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 1;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 597 && super.anInt200 <= 627 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray77[2] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 2;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 625 && super.anInt200 <= 669 && super.anInt201 >= 168 && super.anInt201 < 203 && this.anIntArray77[3] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 3;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 666 && super.anInt200 <= 696 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray77[4] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 4;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 694 && super.anInt200 <= 724 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray77[5] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 5;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 722 && super.anInt200 <= 756 && super.anInt201 >= 169 && super.anInt201 < 205 && this.anIntArray77[6] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 6;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 540 && super.anInt200 <= 574 && super.anInt201 >= 466 && super.anInt201 < 502 && this.anIntArray77[7] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 7;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 572 && super.anInt200 <= 602 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray77[8] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 8;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 599 && super.anInt200 <= 629 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray77[9] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 9;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 627 && super.anInt200 <= 671 && super.anInt201 >= 467 && super.anInt201 < 502 && this.anIntArray77[10] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 10;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 669 && super.anInt200 <= 699 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray77[11] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 11;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 696 && super.anInt200 <= 726 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray77[12] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 12;
					this.aBoolean69 = true;
				}
				if (super.anInt200 >= 724 && super.anInt200 <= 758 && super.anInt201 >= 466 && super.anInt201 < 502 && this.anIntArray77[13] != -1) {
					this.aBoolean78 = true;
					this.anInt297 = 13;
					this.aBoolean69 = true;
					return;
				}
			}
		} catch (@Pc(450) RuntimeException local450) {
			signlink.reporterror("86636, " + 38628 + ", " + local450.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method93() {
		try {
			this.aClass37_24.method599();
			Class1_Sub1_Sub2_Sub1.anIntArray172 = this.anIntArray72;
			this.aClass1_Sub1_Sub2_Sub3_12.method415(0, 0);
			if (this.aBoolean79) {
				this.aClass1_Sub1_Sub2_Sub4_3.method469(40, 239, this.aString15, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method469(60, 239, this.aString9 + "*", 128);
			} else if (this.aBoolean73) {
				this.aClass1_Sub1_Sub2_Sub4_3.method469(40, 239, "Enter amount:", 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method469(60, 239, this.aString17 + "*", 128);
			} else if (this.aString4 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method469(40, 239, this.aString4, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method469(60, 239, "Click to continue", 128);
			} else if (this.anInt223 != -1) {
				this.method209(0, 0, 0, Class6.aClass6Array1[this.anInt223]);
			} else if (this.anInt325 == -1) {
				@Pc(130) Class1_Sub1_Sub2_Sub4 local130 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(132) int local132 = 0;
				Class1_Sub1_Sub2.method459(77, 0, 0, 463);
				for (@Pc(140) int local140 = 0; local140 < 100; local140++) {
					if (this.aStringArray3[local140] != null) {
						@Pc(152) int local152 = this.anIntArray52[local140];
						@Pc(161) int local161 = this.anInt388 + 70 - local132 * 14;
						@Pc(166) String local166 = this.aStringArray2[local140];
						@Pc(168) byte local168 = 0;
						if (local166 != null && local166.startsWith("@cr1@")) {
							local166 = local166.substring(5);
							local168 = 1;
						}
						if (local166 != null && local166.startsWith("@cr2@")) {
							local166 = local166.substring(5);
							local168 = 2;
						}
						if (local152 == 0) {
							if (local161 > 0 && local161 < 110) {
								local130.method472(this.aStringArray3[local140], 0, local161, 4);
							}
							local132++;
						}
						@Pc(238) int local238;
						if ((local152 == 1 || local152 == 2) && (local152 == 1 || this.anInt250 == 0 || this.anInt250 == 1 && this.method121(local166))) {
							if (local161 > 0 && local161 < 110) {
								local238 = 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method415(4, local161 - 12);
									local238 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method415(local238, local161 - 12);
									local238 += 14;
								}
								local130.method472(local166 + ":", 0, local161, local238);
								local238 += local130.method471(local166) + 8;
								local130.method472(this.aStringArray3[local140], 255, local161, local238);
							}
							local132++;
						}
						if ((local152 == 3 || local152 == 7) && this.anInt330 == 0 && (local152 == 7 || this.anInt417 == 0 || this.anInt417 == 1 && this.method121(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method472("From", 0, local161, 4);
								local238 = local130.method471("From ") + 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method415(local238, local161 - 12);
									local238 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method415(local238, local161 - 12);
									local238 += 14;
								}
								local130.method472(local166 + ":", 0, local161, local238);
								local238 += local130.method471(local166) + 8;
								local130.method472(this.aStringArray3[local140], 8388608, local161, local238);
							}
							local132++;
						}
						if (local152 == 4 && (this.anInt267 == 0 || this.anInt267 == 1 && this.method121(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method472(local166 + " " + this.aStringArray3[local140], 8388736, local161, 4);
							}
							local132++;
						}
						if (local152 == 5 && this.anInt330 == 0 && this.anInt417 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method472(this.aStringArray3[local140], 8388608, local161, 4);
							}
							local132++;
						}
						if (local152 == 6 && this.anInt330 == 0 && this.anInt417 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method472("To " + local166 + ":", 0, local161, 4);
								local130.method472(this.aStringArray3[local140], 8388608, local161, local130.method471("To " + local166) + 12);
							}
							local132++;
						}
						if (local152 == 8 && (this.anInt267 == 0 || this.anInt267 == 1 && this.method121(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method472(local166 + " " + this.aStringArray3[local140], 8270336, local161, 4);
							}
							local132++;
						}
					}
				}
				Class1_Sub1_Sub2.method458();
				this.anInt266 = local132 * 14 + 7;
				if (this.anInt266 < 78) {
					this.anInt266 = 78;
				}
				this.method174(463, 0, this.anInt266 - this.anInt388 - 77, 77, this.anInt266);
				@Pc(608) String local608;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local608 = Class49.method704(this.aString6);
				} else {
					local608 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local130.method472(local608 + ":", 0, 90, 4);
				local130.method472(this.aString14 + "*", 255, 90, local130.method471(local608 + ": ") + 6);
				Class1_Sub1_Sub2.method465(0, 479, 0, 77, (byte) 2);
			} else {
				this.method209(0, 0, 0, Class6.aClass6Array1[this.anInt325]);
			}
			if (this.aBoolean51 && this.anInt399 == 2) {
				this.method182(243);
			}
			this.aClass37_24.method600(357, super.aGraphics2, 17);
			this.aClass37_23.method599();
			Class1_Sub1_Sub2_Sub1.anIntArray172 = this.anIntArray74;
		} catch (@Pc(695) RuntimeException local695) {
			signlink.reporterror("35845, " + -419 + ", " + local695.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method94(@OriginalArg(1) boolean arg0) {
		try {
			this.method132();
			this.aClass37_14.method599();
			this.aClass1_Sub1_Sub2_Sub3_8.method415(0, 0);
			@Pc(49) byte local49;
			@Pc(61) int local61;
			if (this.anInt327 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method470(180, true, 7711145, 180, this.aClass45_Sub1_1.aString30);
				local49 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16776960, 80, "Welcome to RuneScape");
				local61 = local49 + 30;
				this.aClass1_Sub1_Sub2_Sub3_9.method415(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method470(100, true, 16777215, 125, "New user");
				this.aClass1_Sub1_Sub2_Sub3_9.method415(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method470(260, true, 16777215, 125, "Existing User");
			}
			if (this.anInt327 == 2) {
				local49 = 60;
				if (this.aString10.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16776960, 45, this.aString10);
					this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16776960, 60, this.aString11);
					local61 = local49 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16776960, 53, this.aString11);
					local61 = local49 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method474(90, "Username: " + this.aString6 + (this.anInt261 == 0 & anInt209 % 40 < 20 ? "@yel@|" : ""), 90, true, 16777215);
				local61 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method474(105, "Password: " + Class49.method706(this.aString7) + (this.anInt261 == 1 & anInt209 % 40 < 20 ? "@yel@|" : ""), 92, true, 16777215);
				local61 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_9.method415(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method470(100, true, 16777215, 155, "Login");
					this.aClass1_Sub1_Sub2_Sub3_9.method415(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method470(260, true, 16777215, 155, "Cancel");
				}
			}
			if (this.anInt327 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16776960, 40, "Create a free account");
				local49 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16777215, 65, "To create a new account you need to");
				local61 = local49 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16777215, 80, "go back to the main RuneScape webpage");
				local61 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16777215, 95, "and choose the red 'create account'");
				local61 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16777215, 110, "button at the top right of that page.");
				local61 += 15;
				this.aClass1_Sub1_Sub2_Sub3_9.method415(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method470(180, true, 16777215, 155, "Cancel");
			}
			this.aClass37_14.method600(171, super.aGraphics2, 202);
			if (this.aBoolean54) {
				this.aBoolean54 = false;
				this.aClass37_12.method600(0, super.aGraphics2, 128);
				this.aClass37_13.method600(371, super.aGraphics2, 202);
				this.aClass37_17.method600(265, super.aGraphics2, 0);
				this.aClass37_18.method600(265, super.aGraphics2, 562);
				this.aClass37_19.method600(171, super.aGraphics2, 128);
				this.aClass37_20.method600(171, super.aGraphics2, 562);
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("40962, " + 3 + ", " + arg0 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method95() {
		try {
			if (this.anInt319 != 8) {
				this.method84();
			}
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt327 == 0) {
				local17 = super.anInt190 / 2 - 80;
				local24 = super.anInt191 / 2 + 20;
				local24 += 20;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local24 - 20 && super.anInt201 <= local24 + 20) {
					this.anInt327 = 3;
					this.anInt261 = 0;
				}
				local17 = super.anInt190 / 2 + 80;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local24 - 20 && super.anInt201 <= local24 + 20) {
					this.aString10 = "";
					this.aString11 = "Enter your username & password.";
					this.anInt327 = 2;
					this.anInt261 = 0;
				}
			} else if (this.anInt327 == 2) {
				local17 = super.anInt191 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt199 == 1 && super.anInt201 >= local17 - 15 && super.anInt201 < local17) {
					this.anInt261 = 0;
				}
				local17 += 15;
				if (super.anInt199 == 1 && super.anInt201 >= local17 - 15 && super.anInt201 < local17) {
					this.anInt261 = 1;
				}
				local17 += 15;
				local24 = super.anInt190 / 2 - 80;
				@Pc(170) int local170 = super.anInt191 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt199 == 1 && super.anInt200 >= local24 - 75 && super.anInt200 <= local24 + 75 && super.anInt201 >= local171 - 20 && super.anInt201 <= local171 + 20) {
					this.method130(this.aString6, this.aString7, false);
					if (this.aBoolean81) {
						return;
					}
				}
				local24 = super.anInt190 / 2 + 80;
				if (super.anInt199 == 1 && super.anInt200 >= local24 - 75 && super.anInt200 <= local24 + 75 && super.anInt201 >= local171 - 20 && super.anInt201 <= local171 + 20) {
					this.anInt327 = 0;
					this.aString6 = "";
					this.aString7 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method83();
						if (local258 == -1) {
							return;
						}
						@Pc(263) boolean local263 = false;
						for (@Pc(265) int local265 = 0; local265 < aString16.length(); local265++) {
							if (local258 == aString16.charAt(local265)) {
								local263 = true;
								break;
							}
						}
						if (this.anInt261 == 0) {
							if (local258 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt261 = 1;
							}
							if (local263) {
								this.aString6 = this.aString6 + (char) local258;
							}
							if (this.aString6.length() > 12) {
								this.aString6 = this.aString6.substring(0, 12);
							}
						} else if (this.anInt261 == 1) {
							if (local258 == 8 && this.aString7.length() > 0) {
								this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt261 = 0;
							}
							if (local263) {
								this.aString7 = this.aString7 + (char) local258;
							}
							if (this.aString7.length() > 20) {
								this.aString7 = this.aString7.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt327 == 3) {
				local17 = super.anInt190 / 2;
				local24 = super.anInt191 / 2 + 50;
				@Pc(422) int local422 = local24 + 20;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local422 - 20 && super.anInt201 <= local422 + 20) {
					this.anInt327 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("42176, " + 8 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZ)V")
	private void method96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass36_1.method574(arg0, arg4, arg2);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass36_1.method578(arg0, arg4, arg2, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg1;
				if (local8 > 0) {
					local30 = arg3;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_11.anIntArray200;
				local52 = arg4 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class11 local61 = Class11.method292(local58);
				if (local61.anInt525 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array2[local61.anInt525];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt520 * 4 - local71.anInt670) / 2;
						@Pc(93) int local93 = (local61.anInt521 * 4 - local71.anInt671) / 2;
						local71.method415(arg4 * 4 + local83 + 48, (104 - arg2 - local61.anInt521) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass36_1.method576(arg0, arg4, arg2);
			this.aBoolean81 &= true;
			if (local8 != 0) {
				local18 = this.aClass36_1.method578(arg0, arg4, arg2, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(453) Class11 local453 = Class11.method292(local30);
				@Pc(485) int local485;
				if (local453.anInt525 != -1) {
					@Pc(463) Class1_Sub1_Sub2_Sub3 local463 = this.aClass1_Sub1_Sub2_Sub3Array2[local453.anInt525];
					if (local463 != null) {
						local58 = (local453.anInt520 * 4 - local463.anInt670) / 2;
						local485 = (local453.anInt521 * 4 - local463.anInt671) / 2;
						local463.method415(arg4 * 4 + local58 + 48, (104 - arg2 - local453.anInt521) * 4 + 48 + local485);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass1_Sub1_Sub2_Sub2_11.anIntArray200;
					local485 = arg4 * 4 + (103 - arg2) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local522[local485 + 1536] = local52;
						local522[local485 + 1024 + 1] = local52;
						local522[local485 + 512 + 2] = local52;
						local522[local485 + 3] = local52;
					} else {
						local522[local485] = local52;
						local522[local485 + 512 + 1] = local52;
						local522[local485 + 1024 + 2] = local52;
						local522[local485 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass36_1.method577(arg0, arg4, arg2);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(617) Class11 local617 = Class11.method292(local18);
				if (local617.anInt525 != -1) {
					@Pc(627) Class1_Sub1_Sub2_Sub3 local627 = this.aClass1_Sub1_Sub2_Sub3Array2[local617.anInt525];
					if (local627 != null) {
						local30 = (local617.anInt520 * 4 - local627.anInt670) / 2;
						@Pc(649) int local649 = (local617.anInt521 * 4 - local627.anInt671) / 2;
						local627.method415(arg4 * 4 + local30 + 48, (104 - arg2 - local617.anInt521) * 4 + 48 + local649);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("72960, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method97(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt380 >= 100 && this.anInt276 != 1) {
					this.method205("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else if (this.anInt380 >= 200) {
					this.method205("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else {
					@Pc(38) String local38 = Class49.method704(Class49.method701(586, arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt380; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method205(local38 + " is already on your friend list", "", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt324; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method205("Please remove " + local38 + " from your ignore list first", "", 0);
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray6[this.anInt380] = local38;
						this.aLongArray3[this.anInt380] = arg0;
						this.anIntArray66[this.anInt380] = 0;
						this.anInt380++;
						this.aBoolean78 = true;
						this.aClass1_Sub1_Sub3_3.method492(9);
						this.aClass1_Sub1_Sub3_3.method499(arg0);
					}
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("11541, " + arg0 + ", " + false + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!y;I)V")
	private void method98(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method99(arg0.anInt994, arg1, arg0.anInt995);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("75434, " + -105 + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method181(arg0, 526, arg2, this.anInt391) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt392;
				@Pc(43) int local43 = local28 - this.anInt393;
				@Pc(48) int local48 = arg2 - this.anInt394;
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray139[this.anInt395];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray140[this.anInt395];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub5.anIntArray139[this.anInt396];
				@Pc(68) int local68 = Class1_Sub1_Sub1_Sub5.anIntArray140[this.anInt396];
				@Pc(78) int local78 = local48 * local63 + local33 * local68 >> 16;
				@Pc(88) int local88 = local48 * local68 - local33 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local43 * local58 - local88 * local53 >> 16;
				@Pc(110) int local110 = local43 * local53 + local88 * local58 >> 16;
				if (local110 >= 50) {
					this.anInt363 = Class1_Sub1_Sub2_Sub1.anInt572 + (local90 << 9) / local110;
					this.anInt364 = Class1_Sub1_Sub2_Sub1.anInt573 + (local100 << 9) / local110;
				} else {
					this.anInt363 = -1;
					this.anInt364 = -1;
				}
			} else {
				this.anInt363 = -1;
				this.anInt364 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("84129, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method100(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(14) int local14;
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(33) int local33;
			@Pc(37) int local37;
			@Pc(41) int local41;
			@Pc(46) int local46;
			@Pc(51) int local51;
			if (arg1 == 70 || arg1 == 88) {
				local14 = arg0.method503();
				local23 = this.anInt382 + (local14 >> 4 & 0x7);
				local30 = this.anInt383 + (local14 & 0x7);
				local33 = arg0.method503();
				local37 = local33 >> 2;
				local41 = local33 & 0x3;
				local46 = this.anIntArray42[local37];
				if (arg1 == 88) {
					local51 = -1;
				} else {
					local51 = arg0.method505();
				}
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					this.method156(local51, -1, 0, local30, local23, local37, local46, local41, this.anInt391);
				}
			} else {
				@Pc(141) int local141;
				@Pc(153) int local153;
				@Pc(167) int local167;
				@Pc(179) int local179;
				if (arg1 == 30) {
					local14 = arg0.method503();
					local23 = this.anInt382 + (local14 >> 4 & 0x7);
					local30 = this.anInt383 + (local14 & 0x7);
					local33 = arg0.method503();
					local37 = local33 >> 2;
					local41 = local33 & 0x3;
					local46 = this.anIntArray42[local37];
					local51 = arg0.method505();
					if (local23 >= 0 && local30 >= 0 && local23 < 103 && local30 < 103) {
						local141 = this.anIntArrayArrayArray5[this.anInt391][local23][local30];
						local153 = this.anIntArrayArrayArray5[this.anInt391][local23 + 1][local30];
						local167 = this.anIntArrayArrayArray5[this.anInt391][local23 + 1][local30 + 1];
						local179 = this.anIntArrayArrayArray5[this.anInt391][local23][local30 + 1];
						if (local46 == 0) {
							@Pc(190) Class33 local190 = this.aClass36_1.method570(this.anInt391, local23, local30);
							if (local190 != null) {
								@Pc(199) int local199 = local190.anInt837 >> 14 & 0x7FFF;
								if (local37 == 2) {
									local190.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local51, local41 + 4, (byte) 69, false, local153, local141, local199, local179, 2, local167);
									local190.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local51, local41 + 1 & 0x3, (byte) 69, false, local153, local141, local199, local179, 2, local167);
								} else {
									local190.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local51, local41, (byte) 69, false, local153, local141, local199, local179, local37, local167);
								}
							}
						}
						if (local46 == 1) {
							@Pc(268) Class14 local268 = this.aClass36_1.method571(local23, this.anInt391, local30, this.aByte7);
							if (local268 != null) {
								local268.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local51, 0, (byte) 69, false, local153, local141, local268.anInt555 >> 14 & 0x7FFF, local179, 4, local167);
							}
						}
						if (local46 == 2) {
							@Pc(302) Class30 local302 = this.aClass36_1.method572(local23, this.anInt391, local30);
							if (local37 == 11) {
								local37 = 10;
							}
							if (local302 != null) {
								local302.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local51, local41, (byte) 69, false, local153, local141, local302.anInt828 >> 14 & 0x7FFF, local179, local37, local167);
							}
						}
						if (local46 == 3) {
							@Pc(341) Class18 local341 = this.aClass36_1.method573(this.anInt391, local30, local23);
							if (local341 != null) {
								local341.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local51, local41, (byte) 69, false, local153, local141, local341.anInt655 >> 14 & 0x7FFF, local179, 22, local167);
							}
						}
					}
				} else {
					@Pc(406) Class1_Sub1_Sub1_Sub3 local406;
					if (arg1 == 120) {
						local14 = arg0.method503();
						local23 = this.anInt382 + (local14 >> 4 & 0x7);
						local30 = this.anInt383 + (local14 & 0x7);
						local33 = arg0.method505();
						local37 = arg0.method505();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local406 = new Class1_Sub1_Sub1_Sub3();
							local406.anInt178 = local33;
							local406.anInt179 = local37;
							if (this.aClass31ArrayArrayArray1[this.anInt391][local23][local30] == null) {
								this.aClass31ArrayArrayArray1[this.anInt391][local23][local30] = new Class31((byte) 9);
							}
							this.aClass31ArrayArrayArray1[this.anInt391][local23][local30].method531(local406);
							this.method212(local23, local30);
						}
					} else if (arg1 == 115) {
						local14 = arg0.method503();
						local23 = this.anInt382 + (local14 >> 4 & 0x7);
						local30 = this.anInt383 + (local14 & 0x7);
						local33 = arg0.method505();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							@Pc(496) Class31 local496 = this.aClass31ArrayArrayArray1[this.anInt391][local23][local30];
							if (local496 != null) {
								for (local406 = (Class1_Sub1_Sub1_Sub3) local496.method534(); local406 != null; local406 = (Class1_Sub1_Sub1_Sub3) local496.method536(633)) {
									if (local406.anInt178 == (local33 & 0x7FFF)) {
										local406.method690();
										break;
									}
								}
								if (local496.method534() == null) {
									this.aClass31ArrayArrayArray1[this.anInt391][local23][local30] = null;
								}
								this.method212(local23, local30);
							}
						}
					} else if (arg1 == 37) {
						local14 = arg0.method503();
						local23 = this.anInt382 + (local14 >> 4 & 0x7);
						local30 = this.anInt383 + (local14 & 0x7);
						local33 = local23 + arg0.method504();
						local37 = local30 + arg0.method504();
						local41 = arg0.method506();
						local46 = arg0.method505();
						local51 = arg0.method503() * 4;
						local141 = arg0.method503() * 4;
						local153 = arg0.method505();
						local167 = arg0.method505();
						local179 = arg0.method503();
						@Pc(599) int local599 = arg0.method503();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							local33 = local33 * 128 + 64;
							local37 = local37 * 128 + 64;
							@Pc(672) Class1_Sub1_Sub1_Sub4 local672 = new Class1_Sub1_Sub1_Sub4(local46, local153 + anInt209, local41, local30, this.method181(local23, 526, local30, this.anInt391) - local51, this.anInt391, local179, local141, local167 + anInt209, local23, true, local599);
							local672.method234(local33, this.method181(local33, 526, local37, this.anInt391) - local141, local37, local153 + anInt209);
							this.aClass31_2.method531(local672);
						}
					} else if (arg1 == 114) {
						local14 = arg0.method503();
						local23 = this.anInt382 + (local14 >> 4 & 0x7);
						local30 = this.anInt383 + (local14 & 0x7);
						local33 = arg0.method505();
						local37 = arg0.method503();
						local41 = arg0.method505();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							@Pc(768) Class1_Sub1_Sub1_Sub6 local768 = new Class1_Sub1_Sub1_Sub6(false, anInt209, local33, local30, local41, this.anInt391, this.method181(local23, 526, local30, this.anInt391) - local37, local23);
							this.aClass31_1.method531(local768);
						}
					} else if (arg1 == 8) {
						local14 = arg0.method503();
						local23 = this.anInt382 + (local14 >> 4 & 0x7);
						local30 = this.anInt383 + (local14 & 0x7);
						local33 = arg0.method505();
						local37 = arg0.method505();
						local41 = arg0.method505();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local41 != this.anInt384) {
							@Pc(822) Class1_Sub1_Sub1_Sub3 local822 = new Class1_Sub1_Sub1_Sub3();
							local822.anInt178 = local33;
							local822.anInt179 = local37;
							if (this.aClass31ArrayArrayArray1[this.anInt391][local23][local30] == null) {
								this.aClass31ArrayArrayArray1[this.anInt391][local23][local30] = new Class31((byte) 9);
							}
							this.aClass31ArrayArrayArray1[this.anInt391][local23][local30].method531(local822);
							this.method212(local23, local30);
						}
					} else {
						if (arg1 == 218) {
							local14 = arg0.method503();
							local23 = this.anInt382 + (local14 >> 4 & 0x7);
							local30 = this.anInt383 + (local14 & 0x7);
							local33 = arg0.method503();
							local37 = local33 >> 2;
							local41 = local33 & 0x3;
							local46 = this.anIntArray42[local37];
							local51 = arg0.method505();
							local141 = arg0.method505();
							local153 = arg0.method505();
							local167 = arg0.method505();
							@Pc(920) byte local920 = arg0.method504();
							@Pc(923) byte local923 = arg0.method504();
							@Pc(926) byte local926 = arg0.method504();
							@Pc(929) byte local929 = arg0.method504();
							@Pc(935) Class1_Sub1_Sub1_Sub1_Sub1 local935;
							if (local167 == this.anInt384) {
								local935 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local935 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local167];
							}
							if (local935 != null) {
								@Pc(947) Class11 local947 = Class11.method292(local51);
								@Pc(957) int local957 = this.anIntArrayArrayArray5[this.anInt391][local23][local30];
								@Pc(969) int local969 = this.anIntArrayArrayArray5[this.anInt391][local23 + 1][local30];
								@Pc(983) int local983 = this.anIntArrayArrayArray5[this.anInt391][local23 + 1][local30 + 1];
								@Pc(995) int local995 = this.anIntArrayArrayArray5[this.anInt391][local23][local30 + 1];
								@Pc(1005) Class1_Sub1_Sub1_Sub5 local1005 = local947.method298(local37, local41, local957, local969, local983, local995, -1);
								if (local1005 != null) {
									this.method156(-1, local153 + 1, local141 + 1, local30, local23, 0, local46, 0, this.anInt391);
									local935.anInt131 = local141 + anInt209;
									local935.anInt132 = local153 + anInt209;
									local935.aClass1_Sub1_Sub1_Sub5_1 = local1005;
									@Pc(1040) int local1040 = local947.anInt520;
									@Pc(1043) int local1043 = local947.anInt521;
									if (local41 == 1 || local41 == 3) {
										local1040 = local947.anInt521;
										local1043 = local947.anInt520;
									}
									local935.anInt133 = local23 * 128 + local1040 * 64;
									local935.anInt135 = local30 * 128 + local1043 * 64;
									local935.anInt134 = this.method181(local935.anInt133, 526, local935.anInt135, this.anInt391);
									@Pc(1089) byte local1089;
									if (local920 > local926) {
										local1089 = local920;
										local920 = local926;
										local926 = local1089;
									}
									if (local923 > local929) {
										local1089 = local923;
										local923 = local929;
										local929 = local1089;
									}
									local935.anInt136 = local23 + local920;
									local935.anInt138 = local23 + local926;
									local935.anInt137 = local30 + local923;
									local935.anInt139 = local30 + local929;
								}
							}
						}
						if (arg1 == 98) {
							local14 = arg0.method503();
							local23 = this.anInt382 + (local14 >> 4 & 0x7);
							local30 = this.anInt383 + (local14 & 0x7);
							local33 = arg0.method505();
							local37 = arg0.method505();
							local41 = arg0.method505();
							if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
								@Pc(1173) Class31 local1173 = this.aClass31ArrayArrayArray1[this.anInt391][local23][local30];
								if (local1173 != null) {
									for (@Pc(1179) Class1_Sub1_Sub1_Sub3 local1179 = (Class1_Sub1_Sub1_Sub3) local1173.method534(); local1179 != null; local1179 = (Class1_Sub1_Sub1_Sub3) local1173.method536(633)) {
										if (local1179.anInt178 == (local33 & 0x7FFF) && local1179.anInt179 == local37) {
											local1179.anInt179 = local41;
											break;
										}
									}
									this.method212(local23, local30);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1209) RuntimeException local1209) {
			signlink.reporterror("95872, " + arg0 + ", " + arg1 + ", " + 21631 + ", " + local1209.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method101(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method102() {
		try {
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_3.method534(); local6 != null; local6 = (Class1_Sub2) this.aClass31_3.method536(633)) {
				if (local6.anInt804 == -1) {
					local6.anInt803 = 0;
					this.method143(local6);
				} else {
					local6.method690();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("56610, " + 801 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
	private boolean method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray6[local7][local11] = 0;
					this.anIntArrayArray4[local7][local11] = 99999999;
				}
			}
			local11 = arg5;
			@Pc(39) int local39 = arg0;
			this.anIntArrayArray6[arg5][arg0] = 99;
			this.anIntArrayArray4[arg5][arg0] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray79[0] = arg5;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray80[0] = arg0;
			this.anInt405 += 0;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray79.length;
			@Pc(87) int[][] local87 = this.aClass21Array1[this.anInt391].anIntArrayArray18;
			@Pc(199) int local199;
			while (local57 != local66) {
				local11 = this.anIntArray79[local57];
				local39 = this.anIntArray80[local57];
				local57 = (local57 + 1) % local80;
				if (local11 == arg1 && local39 == arg6) {
					local76 = true;
					break;
				}
				if (arg4 != 0) {
					if ((arg4 < 5 || arg4 == 10) && this.aClass21Array1[this.anInt391].method452(arg9, local39, arg1, arg6, arg4 - 1, this.aBoolean42, local11)) {
						local76 = true;
						break;
					}
					if (arg4 < 10 && this.aClass21Array1[this.anInt391].method453(arg1, local11, local39, arg6, arg4 - 1, arg9)) {
						local76 = true;
						break;
					}
				}
				if (arg7 != 0 && arg8 != 0 && this.aClass21Array1[this.anInt391].method454(arg3, local11, arg1, arg6, arg8, arg7, local39)) {
					local76 = true;
					break;
				}
				local199 = this.anIntArrayArray4[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray6[local11 - 1][local39] == 0 && (local87[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray79[local66] = local11 - 1;
					this.anIntArray80[local66] = local39;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray6[local11 - 1][local39] = 2;
					this.anIntArrayArray4[local11 - 1][local39] = local199;
				}
				if (local11 < 103 && this.anIntArrayArray6[local11 + 1][local39] == 0 && (local87[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray79[local66] = local11 + 1;
					this.anIntArray80[local66] = local39;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray6[local11 + 1][local39] = 8;
					this.anIntArrayArray4[local11 + 1][local39] = local199;
				}
				if (local39 > 0 && this.anIntArrayArray6[local11][local39 - 1] == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray79[local66] = local11;
					this.anIntArray80[local66] = local39 - 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray6[local11][local39 - 1] = 1;
					this.anIntArrayArray4[local11][local39 - 1] = local199;
				}
				if (local39 < 103 && this.anIntArrayArray6[local11][local39 + 1] == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray79[local66] = local11;
					this.anIntArray80[local66] = local39 + 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray6[local11][local39 + 1] = 4;
					this.anIntArrayArray4[local11][local39 + 1] = local199;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray6[local11 - 1][local39 - 1] == 0 && (local87[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray79[local66] = local11 - 1;
					this.anIntArray80[local66] = local39 - 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray6[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = local199;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray6[local11 + 1][local39 - 1] == 0 && (local87[local11 + 1][local39 - 1] & 0x280183) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray79[local66] = local11 + 1;
					this.anIntArray80[local66] = local39 - 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray6[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = local199;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray6[local11 - 1][local39 + 1] == 0 && (local87[local11 - 1][local39 + 1] & 0x280138) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray79[local66] = local11 - 1;
					this.anIntArray80[local66] = local39 + 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray6[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = local199;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray6[local11 + 1][local39 + 1] == 0 && (local87[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray79[local66] = local11 + 1;
					this.anIntArray80[local66] = local39 + 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray6[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = local199;
				}
			}
			this.anInt397 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local76) {
				if (arg2) {
					local199 = 100;
					for (local815 = 1; local815 < 2; local815++) {
						for (local821 = arg1 - local815; local821 <= arg1 + local815; local821++) {
							for (local827 = arg6 - local815; local827 <= arg6 + local815; local827++) {
								if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray4[local821][local827] < local199) {
									local199 = this.anIntArrayArray4[local821][local827];
									local11 = local821;
									local39 = local827;
									this.anInt397 = 1;
									local76 = true;
								}
							}
						}
						if (local76) {
							break;
						}
					}
				}
				if (!local76) {
					return false;
				}
			}
			@Pc(888) byte local888 = 0;
			this.anIntArray79[0] = local11;
			local57 = local888 + 1;
			this.anIntArray80[0] = local39;
			local199 = local815 = this.anIntArrayArray6[local11][local39];
			while (local11 != arg5 || local39 != arg0) {
				if (local199 != local815) {
					local815 = local199;
					this.anIntArray79[local57] = local11;
					this.anIntArray80[local57++] = local39;
				}
				if ((local199 & 0x2) != 0) {
					local11++;
				} else if ((local199 & 0x8) != 0) {
					local11--;
				}
				if ((local199 & 0x1) != 0) {
					local39++;
				} else if ((local199 & 0x4) != 0) {
					local39--;
				}
				local199 = this.anIntArrayArray6[local11][local39];
			}
			if (local57 > 0) {
				local80 = local57;
				if (local57 > 25) {
					local80 = 25;
				}
				local57--;
				local821 = this.anIntArray79[local57];
				local827 = this.anIntArray80[local57];
				if (arg10 == 0) {
					this.aClass1_Sub1_Sub3_3.method492(6);
					this.aClass1_Sub1_Sub3_3.method493(local80 + local80 + 3);
				}
				if (arg10 == 1) {
					this.aClass1_Sub1_Sub3_3.method492(220);
					this.aClass1_Sub1_Sub3_3.method493(local80 + local80 + 3 + 14);
				}
				if (arg10 == 2) {
					this.aClass1_Sub1_Sub3_3.method492(127);
					this.aClass1_Sub1_Sub3_3.method493(local80 + local80 + 3);
				}
				if (super.anIntArray28[5] == 1) {
					this.aClass1_Sub1_Sub3_3.method493(1);
				} else {
					this.aClass1_Sub1_Sub3_3.method493(0);
				}
				this.aClass1_Sub1_Sub3_3.method494(local821 + this.anInt356);
				this.aClass1_Sub1_Sub3_3.method494(local827 + this.anInt357);
				this.anInt292 = this.anIntArray79[0];
				this.anInt293 = this.anIntArray80[0];
				for (@Pc(1076) int local1076 = 1; local1076 < local80; local1076++) {
					local57--;
					this.aClass1_Sub1_Sub3_3.method493(this.anIntArray79[local57] - local821);
					this.aClass1_Sub1_Sub3_3.method493(this.anIntArray80[local57] - local827);
				}
				return true;
			} else if (arg10 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1111) RuntimeException local1111) {
			signlink.reporterror("23358, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!mb;)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt243; local3++) {
				@Pc(10) int local10 = this.anIntArray48[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub2 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local10];
				@Pc(18) int local18 = arg1.method503();
				@Pc(26) int local26;
				@Pc(29) int local29;
				if ((local18 & 0x1) == 1) {
					local26 = arg1.method503();
					local29 = arg1.method503();
					local15.method698(anInt209, local26, local29);
					local15.anInt1008 = anInt209 + 300;
					local15.anInt1009 = arg1.method503();
					local15.anInt1010 = arg1.method503();
				}
				if ((local18 & 0x2) == 2) {
					local26 = arg1.method505();
					if (local26 == 65535) {
						local26 = -1;
					}
					if (local26 == local15.anInt1017) {
						local15.anInt1021 = 0;
					}
					local29 = arg1.method503();
					if (local26 == local15.anInt1017 && local26 != -1) {
						@Pc(83) int local83 = Class29.aClass29Array1[local26].anInt815;
						if (local83 == 1) {
							local15.anInt1018 = 0;
							local15.anInt1019 = 0;
							local15.anInt1020 = local29;
							local15.anInt1021 = 0;
						}
						if (local83 == 2) {
							local15.anInt1021 = 0;
						}
					} else if (local26 == -1 || local15.anInt1017 == -1 || Class29.aClass29Array1[local26].anInt809 >= Class29.aClass29Array1[local15.anInt1017].anInt809) {
						local15.anInt1017 = local26;
						local15.anInt1018 = 0;
						local15.anInt1019 = 0;
						local15.anInt1020 = local29;
						local15.anInt1021 = 0;
						local15.anInt1040 = local15.anInt1038;
					}
				}
				if ((local18 & 0x4) == 4) {
					local15.anInt1011 = arg1.method505();
					if (local15.anInt1011 == 65535) {
						local15.anInt1011 = -1;
					}
				}
				if ((local18 & 0x8) == 8) {
					local15.aString31 = arg1.method510();
					local15.anInt1005 = 100;
				}
				if ((local18 & 0x10) == 16) {
					local26 = arg1.method503();
					local29 = arg1.method503();
					local15.method698(anInt209, local26, local29);
					local15.anInt1008 = anInt209 + 300;
					local15.anInt1009 = arg1.method503();
					local15.anInt1010 = arg1.method503();
				}
				if ((local18 & 0x20) == 32) {
					local15.aClass15_2 = Class15.method352(arg1.method505());
					local15.anInt997 = local15.aClass15_2.aByte26;
					local15.anInt1037 = local15.aClass15_2.anInt595;
					local15.anInt1000 = local15.aClass15_2.anInt582;
					local15.anInt1001 = local15.aClass15_2.anInt583;
					local15.anInt1002 = local15.aClass15_2.anInt584;
					local15.anInt1003 = local15.aClass15_2.anInt585;
					local15.anInt998 = local15.aClass15_2.anInt581;
				}
				if ((local18 & 0x40) == 64) {
					local15.anInt1022 = arg1.method505();
					local26 = arg1.method508();
					local15.anInt1026 = local26 >> 16;
					local15.anInt1025 = anInt209 + (local26 & 0xFFFF);
					local15.anInt1023 = 0;
					local15.anInt1024 = 0;
					if (local15.anInt1025 > anInt209) {
						local15.anInt1023 = -1;
					}
					if (local15.anInt1022 == 65535) {
						local15.anInt1022 = -1;
					}
				}
				if ((local18 & 0x80) == 128) {
					local15.anInt1012 = arg1.method505();
					local15.anInt1013 = arg1.method505();
				}
			}
			if (this.anInt286 == -45991) {
				;
			}
		} catch (@Pc(313) RuntimeException local313) {
			signlink.reporterror("69893, " + arg0 + ", " + -45991 + ", " + arg1 + ", " + local313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method105(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) int local8 = arg1.anInt427;
			if (this.anInt381 == 2) {
				if (local8 == 201) {
					this.aBoolean70 = true;
					this.aBoolean73 = false;
					this.aBoolean79 = true;
					this.aString9 = "";
					this.anInt341 = 1;
					this.aString15 = "Enter name of friend to add to list";
				}
				if (local8 == 202) {
					this.aBoolean70 = true;
					this.aBoolean73 = false;
					this.aBoolean79 = true;
					this.aString9 = "";
					this.anInt341 = 2;
					this.aString15 = "Enter name of friend to delete from list";
				}
			}
			if (local8 == 205) {
				this.anInt409 = 250;
				return true;
			}
			if (local8 == 501) {
				this.aBoolean70 = true;
				this.aBoolean73 = false;
				this.aBoolean79 = true;
				this.aString9 = "";
				this.anInt341 = 4;
				this.aString15 = "Enter name of player to add to list";
			}
			if (local8 == 502) {
				this.aBoolean70 = true;
				this.aBoolean73 = false;
				this.aBoolean79 = true;
				this.aString9 = "";
				this.anInt341 = 5;
				this.aString15 = "Enter name of player to delete from list";
			}
			@Pc(116) int local116;
			@Pc(120) int local120;
			@Pc(125) int local125;
			if (local8 >= 300 && local8 <= 313) {
				local116 = (local8 - 300) / 2;
				local120 = local8 & 0x1;
				local125 = this.anIntArray78[local116];
				if (local125 != -1) {
					while (true) {
						if (local120 == 0) {
							local125--;
							if (local125 < 0) {
								local125 = Class25.anInt772 - 1;
							}
						}
						if (local120 == 1) {
							local125++;
							if (local125 >= Class25.anInt772) {
								local125 = 0;
							}
						}
						if (!Class25.aClass25Array1[local125].aBoolean187 && Class25.aClass25Array1[local125].anInt773 == local116 + (this.aBoolean74 ? 0 : 7)) {
							this.anIntArray78[local116] = local125;
							this.aBoolean76 = true;
							break;
						}
					}
				}
			}
			if (local8 >= 314 && local8 <= 323) {
				local116 = (local8 - 314) / 2;
				local120 = local8 & 0x1;
				local125 = this.anIntArray45[local116];
				if (local120 == 0) {
					local125--;
					if (local125 < 0) {
						local125 = anIntArrayArray3[local116].length - 1;
					}
				}
				if (local120 == 1) {
					local125++;
					if (local125 >= anIntArrayArray3[local116].length) {
						local125 = 0;
					}
				}
				this.anIntArray45[local116] = local125;
				this.aBoolean76 = true;
			}
			if (local8 == 324 && !this.aBoolean74) {
				this.aBoolean74 = true;
				this.method179();
			}
			if (local8 == 325 && this.aBoolean74) {
				this.aBoolean74 = false;
				this.method179();
			}
			if (local8 == 326) {
				this.aClass1_Sub1_Sub3_3.method492(13);
				this.aClass1_Sub1_Sub3_3.method493(this.aBoolean74 ? 0 : 1);
				for (local116 = 0; local116 < 7; local116++) {
					this.aClass1_Sub1_Sub3_3.method493(this.anIntArray78[local116]);
				}
				for (local120 = 0; local120 < 5; local120++) {
					this.aClass1_Sub1_Sub3_3.method493(this.anIntArray45[local120]);
				}
				return true;
			}
			if (local8 == 613) {
				this.aBoolean62 = !this.aBoolean62;
			}
			if (local8 >= 601 && local8 <= 612) {
				this.method119();
				if (this.aString13.length() > 0) {
					this.aClass1_Sub1_Sub3_3.method492(203);
					this.aClass1_Sub1_Sub3_3.method499(Class49.method700(this.aString13));
					this.aClass1_Sub1_Sub3_3.method493(local8 - 601);
					this.aClass1_Sub1_Sub3_3.method493(this.aBoolean62 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(353) RuntimeException local353) {
			signlink.reporterror("46264, " + arg0 + ", " + arg1 + ", " + local353.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Z")
	private boolean method106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg1];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray96.length && local7.anIntArray96[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray96[local9]];
				if (local24.anInt425 == 1) {
					local3 |= this.method106(arg0, local24.anInt423);
				}
				if (local24.anInt425 == 6 && (local24.anInt446 != -1 || local24.anInt447 != -1)) {
					@Pc(55) boolean local55 = this.method150(local24, this.aByte6);
					@Pc(60) int local60;
					if (local55) {
						local60 = local24.anInt447;
					} else {
						local60 = local24.anInt446;
					}
					if (local60 != -1) {
						@Pc(72) Class29 local72 = Class29.aClass29Array1[local60];
						local24.anInt422 += arg0;
						while (local24.anInt422 > local72.method529(local24.anInt421)) {
							local24.anInt422 -= local72.method529(local24.anInt421) + 1;
							local24.anInt421++;
							if (local24.anInt421 >= local72.anInt807) {
								local24.anInt421 -= local72.anInt808;
								if (local24.anInt421 < 0 || local24.anInt421 >= local72.anInt807) {
									local24.anInt421 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("84608, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method107() {
		try {
			if (this.aClass37_24 == null) {
				this.method200();
				super.aClass37_2 = null;
				this.aClass37_12 = null;
				this.aClass37_13 = null;
				this.aClass37_14 = null;
				this.aClass37_15 = null;
				this.aClass37_16 = null;
				this.aClass37_17 = null;
				this.aClass37_18 = null;
				this.aClass37_19 = null;
				this.aClass37_20 = null;
				this.aClass37_24 = new Class37(479, 96, 47904, this.method89());
				this.aClass37_22 = new Class37(172, 156, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass1_Sub1_Sub2_Sub3_11.method415(0, 0);
				this.aClass37_21 = new Class37(190, 261, 47904, this.method89());
				this.aClass37_23 = new Class37(512, 334, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_25 = new Class37(496, 50, 47904, this.method89());
				this.aClass37_26 = new Class37(269, 37, 47904, this.method89());
				this.aClass37_27 = new Class37(249, 45, 47904, this.method89());
				this.aBoolean54 = true;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("28096, " + true + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method108() {
		try {
			if (this.anInt213 == 2) {
				this.method99((this.anInt412 - this.anInt356 << 7) + this.anInt415, this.anInt414 * 2, (this.anInt413 - this.anInt357 << 7) + this.anInt416);
				if (this.anInt363 > -1 && anInt209 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array4[2].method375(this.anInt363 - 12, this.anInt364 - 28);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("124, " + 9 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method109(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1 != 0L) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt380; local22++) {
					if (this.aLongArray3[local22] == arg1) {
						this.anInt380--;
						this.aBoolean78 = true;
						for (@Pc(42) int local42 = local22; local42 < this.anInt380; local42++) {
							this.aStringArray6[local42] = this.aStringArray6[local42 + 1];
							this.anIntArray66[local42] = this.anIntArray66[local42 + 1];
							this.aLongArray3[local42] = this.aLongArray3[local42 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method492(84);
						this.aClass1_Sub1_Sub3_3.method499(arg1);
						return;
					}
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("4689, " + arg0 + ", " + arg1 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method110() {
		try {
			if (this.anInt330 != 0) {
				@Pc(8) Class1_Sub1_Sub2_Sub4 local8 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(10) int local10 = 0;
				if (this.anInt238 != 0) {
					local10 = 1;
				}
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray3[local17] != null) {
						@Pc(29) int local29 = this.anIntArray52[local17];
						@Pc(34) String local34 = this.aStringArray2[local17];
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
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt417 == 0 || this.anInt417 == 1 && this.method121(local34))) {
							local87 = 329 - local10 * 13;
							local8.method472("From", 0, local87, 4);
							local8.method472("From", 65535, local87 - 1, 4);
							@Pc(112) int local112 = local8.method471("From ") + 4;
							if (local36 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array3[0].method415(local112, local87 - 12);
								local112 += 14;
							}
							if (local36 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array3[1].method415(local112, local87 - 12);
								local112 += 14;
							}
							local8.method472(local34 + ": " + this.aStringArray3[local17], 0, local87, local112);
							local8.method472(local34 + ": " + this.aStringArray3[local17], 65535, local87 - 1, local112);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local29 == 5 && this.anInt417 < 2) {
							local87 = 329 - local10 * 13;
							local8.method472(this.aStringArray3[local17], 0, local87, 4);
							local8.method472(this.aStringArray3[local17], 65535, local87 - 1, 4);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local29 == 6 && this.anInt417 < 2) {
							local87 = 329 - local10 * 13;
							local8.method472("To " + local34 + ": " + this.aStringArray3[local17], 0, local87, 4);
							local8.method472("To " + local34 + ": " + this.aStringArray3[local17], 65535, local87 - 1, 4);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("62971, " + false + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)Z")
	private boolean method111() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("88062, " + false + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method112() {
		try {
			@Pc(4) Graphics local4 = this.method89().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method82();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean75) {
				this.aBoolean47 = false;
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
			if (this.aBoolean44) {
				this.aBoolean47 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean56) {
				this.aBoolean47 = false;
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
			signlink.reporterror("79182, " + true + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method113() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt342);
			if (this.aClass45_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass45_Sub1_1.anInt979);
			}
			System.out.println("loop-cycle:" + anInt209);
			System.out.println("draw-cycle:" + anInt385);
			System.out.println("ptype:" + this.anInt406);
			System.out.println("psize:" + this.anInt405);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method247();
			}
			super.aBoolean36 = true;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("69367, " + -747 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method89() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("45810, " + -125 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method114() {
		try {
			this.method110();
			if (this.anInt259 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array6[this.anInt258 / 100].method375(this.anInt256 - 8 - 4, this.anInt257 - 8 - 4);
			}
			if (this.anInt259 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array6[this.anInt258 / 100 + 4].method375(this.anInt256 - 8 - 4, this.anInt257 - 8 - 4);
				anInt314++;
				if (anInt314 > 57) {
					anInt314 = 0;
					this.aClass1_Sub1_Sub3_3.method492(100);
				}
			}
			if (this.anInt233 != -1) {
				this.method106(this.anInt255, this.anInt233);
				this.method209(0, 0, 0, Class6.aClass6Array1[this.anInt233]);
			}
			if (this.anInt210 != -1) {
				this.method106(this.anInt255, this.anInt210);
				this.method209(0, 0, 0, Class6.aClass6Array1[this.anInt210]);
			}
			this.method146();
			this.aBoolean81 &= true;
			if (!this.aBoolean51) {
				this.method210();
				this.method122(188);
			} else if (this.anInt399 == 0) {
				this.method182(243);
			}
			if (this.anInt379 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array4[1].method375(472, 296);
			}
			if (this.anInt238 != 0) {
				@Pc(158) int local158 = this.anInt238 / 50;
				@Pc(162) int local162 = local158 / 60;
				@Pc(166) int local166 = local158 % 60;
				if (local166 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method472("System update in: " + local162 + ":0" + local166, 16776960, 329, 4);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method472("System update in: " + local162 + ":" + local166, 16776960, 329, 4);
				}
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("89734, " + true + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method115() {
		try {
			if (this.anInt409 > 0) {
				this.method141();
			} else {
				this.aClass37_23.method599();
				this.aClass1_Sub1_Sub2_Sub4_2.method469(144, 257, "Connection lost", 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method469(143, 256, "Connection lost", 16777215);
				this.aClass1_Sub1_Sub2_Sub4_2.method469(159, 257, "Please wait - attempting to reestablish", 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method469(158, 256, "Please wait - attempting to reestablish", 16777215);
				this.aClass37_23.method600(4, super.aGraphics2, 4);
				this.anInt292 = 0;
				@Pc(69) Class8 local69 = this.aClass8_1;
				this.aBoolean81 = false;
				this.method130(this.aString6, this.aString7, true);
				if (!this.aBoolean81) {
					this.method141();
				}
				try {
					local69.method242();
				} catch (@Pc(89) Exception local89) {
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("97195, " + -332 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Ljava/net/Socket;")
	public Socket method116(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	private String method117(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("73561, " + arg0 + ", " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt315 != 2) {
				this.anInt352 = this.aClass47_1.method685();
			}
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
				if (this.aStringArray3[local12] != null) {
					@Pc(24) int local24 = this.anIntArray52[local12];
					@Pc(35) int local35 = this.anInt388 + 70 + 4 - local10 * 14;
					if (local35 < -20) {
						break;
					}
					@Pc(43) String local43 = this.aStringArray2[local12];
					if (local43 != null && local43.startsWith("@cr1@")) {
						local43 = local43.substring(5);
					}
					if (local43 != null && local43.startsWith("@cr2@")) {
						local43 = local43.substring(5);
					}
					if (local24 == 0) {
						local10++;
					}
					if ((local24 == 1 || local24 == 2) && (local24 == 1 || this.anInt250 == 0 || this.anInt250 == 1 && this.method121(local43))) {
						if (arg0 > local35 - 14 && arg0 <= local35 && !local43.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt373 >= 1) {
								this.aStringArray4[this.anInt308] = "Report abuse @whi@" + local43;
								this.anIntArray58[this.anInt308] = 524;
								this.anInt308++;
							}
							this.aStringArray4[this.anInt308] = "Add ignore @whi@" + local43;
							this.anIntArray58[this.anInt308] = 47;
							this.anInt308++;
							this.aStringArray4[this.anInt308] = "Add friend @whi@" + local43;
							this.anIntArray58[this.anInt308] = 605;
							this.anInt308++;
						}
						local10++;
					}
					if ((local24 == 3 || local24 == 7) && this.anInt330 == 0 && (local24 == 7 || this.anInt417 == 0 || this.anInt417 == 1 && this.method121(local43))) {
						if (arg0 > local35 - 14 && arg0 <= local35) {
							if (this.anInt373 >= 1) {
								this.aStringArray4[this.anInt308] = "Report abuse @whi@" + local43;
								this.anIntArray58[this.anInt308] = 524;
								this.anInt308++;
							}
							this.aStringArray4[this.anInt308] = "Add ignore @whi@" + local43;
							this.anIntArray58[this.anInt308] = 47;
							this.anInt308++;
							this.aStringArray4[this.anInt308] = "Add friend @whi@" + local43;
							this.anIntArray58[this.anInt308] = 605;
							this.anInt308++;
						}
						local10++;
					}
					if (local24 == 4 && (this.anInt267 == 0 || this.anInt267 == 1 && this.method121(local43))) {
						if (arg0 > local35 - 14 && arg0 <= local35) {
							this.aStringArray4[this.anInt308] = "Accept trade @whi@" + local43;
							this.anIntArray58[this.anInt308] = 507;
							this.anInt308++;
						}
						local10++;
					}
					if ((local24 == 5 || local24 == 6) && this.anInt330 == 0 && this.anInt417 < 2) {
						local10++;
					}
					if (local24 == 8 && (this.anInt267 == 0 || this.anInt267 == 1 && this.method121(local43))) {
						if (arg0 > local35 - 14 && arg0 <= local35) {
							this.aStringArray4[this.anInt308] = "Accept duel @whi@" + local43;
							this.anIntArray58[this.anInt308] = 957;
							this.anInt308++;
						}
						local10++;
					}
				}
			}
		} catch (@Pc(408) RuntimeException local408) {
			signlink.reporterror("93578, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local408.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method119() {
		try {
			this.aClass1_Sub1_Sub3_3.method492(58);
			if (this.anInt260 != -1) {
				this.anInt260 = -1;
				this.aBoolean78 = true;
				this.aBoolean59 = false;
				this.aBoolean69 = true;
			}
			if (this.anInt223 != -1) {
				this.anInt223 = -1;
				this.aBoolean70 = true;
				this.aBoolean59 = false;
			}
			this.anInt210 = -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("24777, " + -711 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method120() {
		try {
			if (this.anInt330 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt238 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray3[local12] != null) {
						@Pc(24) int local24 = this.anIntArray52[local12];
						@Pc(29) String local29 = this.aStringArray2[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt417 == 0 || this.anInt417 == 1 && this.method121(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt194 > 4 && super.anInt195 - 4 > local82 - 10 && super.anInt195 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass1_Sub1_Sub2_Sub4_2.method471("From:  " + local29 + this.aStringArray3[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt194 < local121 + 4) {
									if (this.anInt373 >= 1) {
										this.aStringArray4[this.anInt308] = "Report abuse @whi@" + local29;
										this.anIntArray58[this.anInt308] = 2524;
										this.anInt308++;
									}
									this.aStringArray4[this.anInt308] = "Add ignore @whi@" + local29;
									this.anIntArray58[this.anInt308] = 2047;
									this.anInt308++;
									this.aStringArray4[this.anInt308] = "Add friend @whi@" + local29;
									this.anIntArray58[this.anInt308] = 2605;
									this.anInt308++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt417 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("29924, " + -661 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method85(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean56 && !this.aBoolean75 && !this.aBoolean44) {
				anInt209++;
				if (this.aBoolean81) {
					this.method157();
				} else {
					this.method95();
				}
				this.method207((byte) 4);
				this.anInt405 += arg0;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("81793, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method121(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt380; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray6[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("77976, " + -983 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method122(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt308 >= 2 || this.anInt281 != 0 || this.anInt301 != 0) {
				@Pc(31) String local31;
				if (this.anInt281 == 1 && this.anInt308 < 2) {
					local31 = "Use " + this.aString8 + " with...";
				} else if (this.anInt301 == 1 && this.anInt308 < 2) {
					local31 = this.aString12 + "...";
				} else {
					local31 = this.aStringArray4[this.anInt308 - 1];
				}
				if (this.anInt308 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt308 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method475(local31, 15, 16777215, anInt209 / 1000, 4);
				@Pc(97) boolean local97 = false;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("8433, " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BI)Z")
	private boolean method123(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 == null ? true : signlink.wavesave(arg1, arg2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("89267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method124() {
		try {
			@Pc(29) int local29;
			@Pc(57) int local57;
			@Pc(61) int local61;
			@Pc(70) int local70;
			@Pc(77) int local77;
			@Pc(140) int local140;
			@Pc(197) int local197;
			try {
				this.anInt347 = -1;
				this.aClass31_1.method538();
				this.aClass31_2.method538();
				Class1_Sub1_Sub2_Sub1.method336();
				this.method189();
				this.aClass36_1.method548(this.aBoolean67);
				for (local29 = 0; local29 < 4; local29++) {
					this.aClass21Array1[local29].method443();
				}
				System.gc();
				@Pc(53) Class4 local53 = new Class4(this.anIntArrayArrayArray5, 104, 7, this.aByteArrayArrayArray7, 104);
				local57 = this.aByteArrayArray1.length;
				Class4.aBoolean28 = Class36.aBoolean208;
				for (local61 = 0; local61 < local57; local61++) {
					local70 = this.anIntArray30[local61] >> 8;
					local77 = this.anIntArray30[local61] & 0xFF;
					if (local70 == 33 && local77 >= 71 && local77 <= 73) {
						Class4.aBoolean28 = false;
					}
				}
				if (Class4.aBoolean28) {
					this.aClass36_1.method549(this.anInt391);
				} else {
					this.aClass36_1.method549(0);
				}
				this.aClass1_Sub1_Sub3_3.method492(239);
				@Pc(145) byte[] local145;
				for (local70 = 0; local70 < local57; local70++) {
					local77 = (this.anIntArray30[local70] >> 8) * 64 - this.anInt356;
					local140 = (this.anIntArray30[local70] & 0xFF) * 64 - this.anInt357;
					local145 = this.aByteArrayArray1[local70];
					if (local145 != null) {
						local53.method53(local140, (this.anInt317 - 6) * 8, (this.anInt318 - 6) * 8, local77, local145);
					}
				}
				for (local77 = 0; local77 < local57; local77++) {
					local140 = (this.anIntArray30[local77] >> 8) * 64 - this.anInt356;
					local197 = (this.anIntArray30[local77] & 0xFF) * 64 - this.anInt357;
					@Pc(202) byte[] local202 = this.aByteArrayArray1[local77];
					if (local202 == null && this.anInt318 < 800) {
						local53.method52(local197, local140);
					}
				}
				this.aClass1_Sub1_Sub3_3.method492(239);
				@Pc(247) int local247;
				for (local140 = 0; local140 < local57; local140++) {
					local145 = this.aByteArrayArray2[local140];
					if (local145 != null) {
						local247 = (this.anIntArray30[local140] >> 8) * 64 - this.anInt356;
						@Pc(259) int local259 = (this.anIntArray30[local140] & 0xFF) * 64 - this.anInt357;
						local53.method56(local259, local247, local145, this.aClass36_1, this.aClass21Array1);
					}
				}
				this.aClass1_Sub1_Sub3_3.method492(239);
				local53.method58(this.aClass36_1, this.aClass21Array1);
				this.aClass37_23.method599();
				this.aClass1_Sub1_Sub3_3.method492(239);
				for (local197 = 0; local197 < 104; local197++) {
					for (local247 = 0; local247 < 104; local247++) {
						this.method212(local197, local247);
					}
				}
				this.method102();
			} catch (@Pc(319) Exception local319) {
			}
			Class11.aClass39_4.method606();
			@Pc(333) int local333;
			if (aBoolean65 && signlink.aRandomAccessFile1 != null) {
				local29 = this.aClass45_Sub1_1.method662(0);
				for (local333 = 0; local333 < local29; local333++) {
					local57 = this.aClass45_Sub1_1.method667(local333, anInt328);
					if ((local57 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method255(local333);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method337(aByte14);
			this.aClass45_Sub1_1.method673();
			local29 = (this.anInt317 - 6) / 8 - 1;
			local333 = (this.anInt317 + 6) / 8 + 1;
			local57 = (this.anInt318 - 6) / 8 - 1;
			local61 = (this.anInt318 + 6) / 8 + 1;
			if (this.aBoolean77) {
				local29 = 49;
				local333 = 50;
				local57 = 49;
				local61 = 50;
			}
			for (local70 = local29; local70 <= local333; local70++) {
				for (local77 = local57; local77 <= local61; local77++) {
					if (local70 == local29 || local70 == local333 || local77 == local57 || local77 == local61) {
						local140 = this.aClass45_Sub1_1.method664(local70, 0, local77);
						if (local140 != -1) {
							this.aClass45_Sub1_1.method674(3, local140);
						}
						local197 = this.aClass45_Sub1_1.method664(local70, 1, local77);
						if (local197 != -1) {
							this.aClass45_Sub1_1.method674(3, local197);
						}
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("28492, " + -44088 + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method125() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt242; local3++) {
				if (local3 == -1) {
					local11 = this.anInt241;
				} else {
					local11 = this.anIntArray47[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt1005 > 0) {
					local23.anInt1005--;
					if (local23.anInt1005 == 0) {
						local23.aString31 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt217; local11++) {
				@Pc(62) int local62 = this.anIntArray41[local11];
				@Pc(67) Class1_Sub1_Sub1_Sub1_Sub2 local67 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local62];
				if (local67 != null && local67.anInt1005 > 0) {
					local67.anInt1005--;
					if (local67.anInt1005 == 0) {
						local67.aString31 = null;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("48370, " + 9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method84() {
		if (signlink.sunjava) {
			super.anInt188 = 5;
		}
		if (aBoolean39) {
			this.aBoolean56 = true;
			return;
		}
		aBoolean39 = true;
		@Pc(16) boolean local16 = false;
		@Pc(20) String local20 = this.method215();
		if (local20.endsWith("jagex.com")) {
			local16 = true;
		}
		if (local20.endsWith("runescape.com")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.2")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.246")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.247")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.249")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.253")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.254")) {
			local16 = true;
		}
		if (local20.endsWith("127.0.0.1")) {
			local16 = true;
		}
		if (!local16) {
			this.aBoolean44 = true;
			return;
		}
		@Pc(84) int local84;
		if (signlink.aRandomAccessFile1 != null) {
			for (local84 = 0; local84 < 5; local84++) {
				this.aClass46Array1[local84] = new Class46(-5745, signlink.aRandomAccessFile1, 500000, signlink.aRandomAccessFileArray1[local84], local84 + 1);
			}
		}
		try {
			local84 = 5;
			this.anIntArray91[8] = 0;
			while (this.anIntArray91[8] == 0) {
				this.method91(20, "Connecting to web server");
				try {
					@Pc(133) DataInputStream local133 = this.method101("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(140) Class1_Sub1_Sub3 local140 = new Class1_Sub1_Sub3(new byte[36], true);
					local133.readFully(local140.aByteArray9, 0, 36);
					for (@Pc(148) int local148 = 0; local148 < 9; local148++) {
						this.anIntArray91[local148] = local140.method508();
					}
					local133.close();
				} catch (@Pc(164) IOException local164) {
					for (@Pc(166) int local166 = local84; local166 > 0; local166--) {
						this.method91(10, "Error loading - Will retry in " + local166 + " secs.");
						try {
							Thread.sleep(1000L);
						} catch (@Pc(185) Exception local185) {
						}
					}
					local84 *= 2;
					if (local84 > 60) {
						local84 = 60;
					}
				}
			}
			this.aClass48_1 = this.method218("title", 1, "title screen", this.anIntArray91[1], 25);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, "p11");
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, "p12");
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4_Sub1(aByte3, "b12_full", this.aClass48_1);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, "q8");
			this.method131(aByte13);
			this.method191();
			@Pc(268) Class48 local268 = this.method218("config", 2, "config", this.anIntArray91[2], 30);
			@Pc(280) Class48 local280 = this.method218("interface", 3, "interface", this.anIntArray91[3], 35);
			@Pc(292) Class48 local292 = this.method218("media", 4, "2d graphics", this.anIntArray91[4], 40);
			@Pc(304) Class48 local304 = this.method218("textures", 6, "textures", this.anIntArray91[6], 45);
			@Pc(316) Class48 local316 = this.method218("wordenc", 7, "chat system", this.anIntArray91[7], 50);
			@Pc(328) Class48 local328 = this.method218("sounds", 8, "sound effects", this.anIntArray91[8], 55);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass36_1 = new Class36(-15570, 104, 104, this.anIntArrayArrayArray5, 4);
			for (@Pc(353) int local353 = 0; local353 < 4; local353++) {
				this.aClass21Array1[local353] = new Class21(anInt321, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(388) Class48 local388 = this.method218("versionlist", 5, "update list", this.anIntArray91[5], 60);
			this.method91(60, "Connecting to update server");
			this.aClass45_Sub1_1 = new Class45_Sub1();
			this.aClass45_Sub1_1.method660(local388, this);
			Class12.method300(this.aClass45_Sub1_1.method663());
			Class1_Sub1_Sub1_Sub5.method253(this.aClass45_Sub1_1.method662(0), this.aClass45_Sub1_1);
			if (!aBoolean65) {
				this.anInt304 = 0;
				this.aBoolean61 = false;
				this.aClass45_Sub1_1.method669(2, this.anInt304);
				while (this.aClass45_Sub1_1.method670() > 0) {
					this.method207((byte) 4);
					try {
						Thread.sleep(100L);
					} catch (@Pc(439) Exception local439) {
					}
				}
			}
			this.method91(65, "Requesting animations");
			@Pc(455) int local455 = this.aClass45_Sub1_1.method662(1);
			for (@Pc(457) int local457 = 0; local457 < local455; local457++) {
				this.aClass45_Sub1_1.method669(1, local457);
			}
			@Pc(476) int local476;
			while (this.aClass45_Sub1_1.method670() > 0) {
				local476 = local455 - this.aClass45_Sub1_1.method670();
				if (local476 > 0) {
					this.method91(65, "Loading animations - " + local476 * 100 / local455 + "%");
				}
				this.method207((byte) 4);
				try {
					Thread.sleep(100L);
				} catch (@Pc(502) Exception local502) {
				}
			}
			this.method91(70, "Requesting models");
			local455 = this.aClass45_Sub1_1.method662(0);
			@Pc(528) int local528;
			for (local476 = 0; local476 < local455; local476++) {
				local528 = this.aClass45_Sub1_1.method667(local476, anInt328);
				if ((local528 & 0x1) != 0) {
					this.aClass45_Sub1_1.method669(0, local476);
				}
			}
			local455 = this.aClass45_Sub1_1.method670();
			while (this.aClass45_Sub1_1.method670() > 0) {
				local528 = local455 - this.aClass45_Sub1_1.method670();
				if (local528 > 0) {
					this.method91(70, "Loading models - " + local528 * 100 / local455 + "%");
				}
				this.method207((byte) 4);
				try {
					Thread.sleep(100L);
				} catch (@Pc(579) Exception local579) {
				}
			}
			if (this.aClass46Array1[0] != null) {
				this.method91(75, "Requesting maps");
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(47, 0, 48));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(47, 1, 48));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(48, 0, 48));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(48, 1, 48));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(49, 0, 48));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(49, 1, 48));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(47, 0, 47));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(47, 1, 47));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(48, 0, 47));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(48, 1, 47));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(48, 0, 148));
				this.aClass45_Sub1_1.method669(3, this.aClass45_Sub1_1.method664(48, 1, 148));
				local455 = this.aClass45_Sub1_1.method670();
				while (this.aClass45_Sub1_1.method670() > 0) {
					local528 = local455 - this.aClass45_Sub1_1.method670();
					if (local528 > 0) {
						this.method91(75, "Loading maps - " + local528 * 100 / local455 + "%");
					}
					this.method207((byte) 4);
					try {
						Thread.sleep(100L);
					} catch (@Pc(764) Exception local764) {
					}
				}
			}
			local455 = this.aClass45_Sub1_1.method662(0);
			@Pc(785) int local785;
			for (local528 = 0; local528 < local455; local528++) {
				local785 = this.aClass45_Sub1_1.method667(local528, anInt328);
				@Pc(787) byte local787 = 0;
				if ((local785 & 0x8) != 0) {
					local787 = 10;
				} else if ((local785 & 0x20) != 0) {
					local787 = 9;
				} else if ((local785 & 0x10) != 0) {
					local787 = 8;
				} else if ((local785 & 0x40) != 0) {
					local787 = 7;
				} else if ((local785 & 0x80) != 0) {
					local787 = 6;
				} else if ((local785 & 0x2) != 0) {
					local787 = 5;
				} else if ((local785 & 0x4) != 0) {
					local787 = 4;
				}
				if ((local785 & 0x1) != 0) {
					local787 = 3;
				}
				if (local787 != 0) {
					this.aClass45_Sub1_1.method672(local528, local787, 0);
				}
			}
			this.aClass45_Sub1_1.method665(aBoolean64);
			if (!aBoolean65) {
				local455 = this.aClass45_Sub1_1.method662(2);
				for (local785 = 1; local785 < local455; local785++) {
					if (this.aClass45_Sub1_1.method668(aBoolean68, local785)) {
						this.aClass45_Sub1_1.method672(local785, (byte) 1, 2);
					}
				}
			}
			this.method91(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local292, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local292, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local292, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local292, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local292, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local292, "backhmid1", 0);
			for (local785 = 0; local785 < 13; local785++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local785] = new Class1_Sub1_Sub2_Sub3(local292, "sideicons", local785);
			}
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local292, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local292, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_5.method372();
			@Pc(987) int local987;
			try {
				for (local987 = 0; local987 < 50; local987++) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local987] = new Class1_Sub1_Sub2_Sub3(local292, "mapscene", local987);
				}
			} catch (@Pc(1005) Exception local1005) {
			}
			try {
				for (local987 = 0; local987 < 50; local987++) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local987] = new Class1_Sub1_Sub2_Sub2(local292, "mapfunction", local987);
				}
			} catch (@Pc(1025) Exception local1025) {
			}
			try {
				for (local987 = 0; local987 < 20; local987++) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local987] = new Class1_Sub1_Sub2_Sub2(local292, "hitmarks", local987);
				}
			} catch (@Pc(1045) Exception local1045) {
			}
			try {
				for (local987 = 0; local987 < 20; local987++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local987] = new Class1_Sub1_Sub2_Sub2(local292, "headicons", local987);
				}
			} catch (@Pc(1065) Exception local1065) {
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local292, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local292, "mapmarker", 1);
			for (local987 = 0; local987 < 8; local987++) {
				this.aClass1_Sub1_Sub2_Sub2Array6[local987] = new Class1_Sub1_Sub2_Sub2(local292, "cross", local987);
			}
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local292, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local292, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local292, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local292, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local292, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local292, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local292, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local292, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local292, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local292, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19.method412();
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local292, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20.method412();
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local292, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_1.method413();
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local292, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_2.method413();
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local292, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_3.method413();
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local292, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method412();
			this.aClass1_Sub1_Sub2_Sub3_4.method413();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local292, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method412();
			this.aClass1_Sub1_Sub2_Sub3_5.method413();
			for (@Pc(1265) int local1265 = 0; local1265 < 2; local1265++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local1265] = new Class1_Sub1_Sub2_Sub3(local292, "mod_icons", local1265);
			}
			@Pc(1288) Class1_Sub1_Sub2_Sub2 local1288 = new Class1_Sub1_Sub2_Sub2(local292, "backleft1", 0);
			this.aClass37_3 = new Class37(local1288.anInt615, local1288.anInt616, 47904, this.method89());
			local1288.method373(0, 0);
			@Pc(1313) Class1_Sub1_Sub2_Sub2 local1313 = new Class1_Sub1_Sub2_Sub2(local292, "backleft2", 0);
			this.aClass37_4 = new Class37(local1313.anInt615, local1313.anInt616, 47904, this.method89());
			local1313.method373(0, 0);
			@Pc(1338) Class1_Sub1_Sub2_Sub2 local1338 = new Class1_Sub1_Sub2_Sub2(local292, "backright1", 0);
			this.aClass37_5 = new Class37(local1338.anInt615, local1338.anInt616, 47904, this.method89());
			local1338.method373(0, 0);
			@Pc(1363) Class1_Sub1_Sub2_Sub2 local1363 = new Class1_Sub1_Sub2_Sub2(local292, "backright2", 0);
			this.aClass37_6 = new Class37(local1363.anInt615, local1363.anInt616, 47904, this.method89());
			local1363.method373(0, 0);
			@Pc(1388) Class1_Sub1_Sub2_Sub2 local1388 = new Class1_Sub1_Sub2_Sub2(local292, "backtop1", 0);
			this.aClass37_7 = new Class37(local1388.anInt615, local1388.anInt616, 47904, this.method89());
			local1388.method373(0, 0);
			@Pc(1413) Class1_Sub1_Sub2_Sub2 local1413 = new Class1_Sub1_Sub2_Sub2(local292, "backvmid1", 0);
			this.aClass37_8 = new Class37(local1413.anInt615, local1413.anInt616, 47904, this.method89());
			local1413.method373(0, 0);
			@Pc(1438) Class1_Sub1_Sub2_Sub2 local1438 = new Class1_Sub1_Sub2_Sub2(local292, "backvmid2", 0);
			this.aClass37_9 = new Class37(local1438.anInt615, local1438.anInt616, 47904, this.method89());
			local1438.method373(0, 0);
			@Pc(1463) Class1_Sub1_Sub2_Sub2 local1463 = new Class1_Sub1_Sub2_Sub2(local292, "backvmid3", 0);
			this.aClass37_10 = new Class37(local1463.anInt615, local1463.anInt616, 47904, this.method89());
			local1463.method373(0, 0);
			@Pc(1488) Class1_Sub1_Sub2_Sub2 local1488 = new Class1_Sub1_Sub2_Sub2(local292, "backhmid2", 0);
			this.aClass37_11 = new Class37(local1488.anInt615, local1488.anInt616, 47904, this.method89());
			local1488.method373(0, 0);
			@Pc(1513) int local1513 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1520) int local1520 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1527) int local1527 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1534) int local1534 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1536) int local1536 = 0; local1536 < 50; local1536++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array3[local1536] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local1536].method371(local1527 + local1534, local1513 + local1534, local1520 + local1534, aByte4);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array2[local1536] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local1536].method414(local1527 + local1534, local1513 + local1534, local1520 + local1534, aByte4);
				}
			}
			this.method91(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method338(local304);
			Class1_Sub1_Sub2_Sub1.method342(0.8D);
			Class1_Sub1_Sub2_Sub1.method337(aByte14);
			this.method91(86, "Unpacking config");
			Class29.method528(local268);
			Class11.method290(local268);
			Class23.method485(local268);
			Class17.method383(local268);
			Class15.method350(local268);
			Class25.method519(local268);
			Class35.method544(local268);
			Class41.method615(local268);
			Class38.method602(local268);
			Class17.aBoolean154 = aBoolean64;
			if (!aBoolean65) {
				this.method91(90, "Unpacking sounds");
				@Pc(1639) byte[] local1639 = local328.method689("sounds.dat", null);
				@Pc(1645) Class1_Sub1_Sub3 local1645 = new Class1_Sub1_Sub3(local1639, true);
				Class7.method236(local1645);
			}
			this.method91(95, "Unpacking interfaces");
			@Pc(1676) Class1_Sub1_Sub2_Sub4[] local1676 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method224(local1676, local280, local292);
			this.method91(100, "Preparing game engine");
			@Pc(1692) int local1692;
			@Pc(1694) int local1694;
			@Pc(1696) int local1696;
			for (@Pc(1688) int local1688 = 0; local1688 < 33; local1688++) {
				local1692 = 999;
				local1694 = 0;
				for (local1696 = 0; local1696 < 34; local1696++) {
					if (this.aClass1_Sub1_Sub2_Sub3_11.aByteArray7[local1696 + local1688 * this.aClass1_Sub1_Sub2_Sub3_11.anInt670] == 0) {
						if (local1692 == 999) {
							local1692 = local1696;
						}
					} else if (local1692 != 999) {
						local1694 = local1696;
						break;
					}
				}
				this.anIntArray81[local1688] = local1692;
				this.anIntArray84[local1688] = local1694 - local1692;
			}
			@Pc(1754) int local1754;
			for (local1692 = 5; local1692 < 156; local1692++) {
				local1694 = 999;
				local1696 = 0;
				for (local1754 = 25; local1754 < 172; local1754++) {
					if (this.aClass1_Sub1_Sub2_Sub3_11.aByteArray7[local1754 + local1692 * this.aClass1_Sub1_Sub2_Sub3_11.anInt670] == 0 && (local1754 > 34 || local1692 > 34)) {
						if (local1694 == 999) {
							local1694 = local1754;
						}
					} else if (local1694 != 999) {
						local1696 = local1754;
						break;
					}
				}
				this.anIntArray76[local1692 - 5] = local1694 - 25;
				this.anIntArray86[local1692 - 5] = local1696 - local1694;
			}
			Class1_Sub1_Sub2_Sub1.method335(96, 479, aByte9);
			this.anIntArray72 = Class1_Sub1_Sub2_Sub1.anIntArray172;
			Class1_Sub1_Sub2_Sub1.method335(261, 190, aByte9);
			this.anIntArray73 = Class1_Sub1_Sub2_Sub1.anIntArray172;
			Class1_Sub1_Sub2_Sub1.method335(334, 512, aByte9);
			this.anIntArray74 = Class1_Sub1_Sub2_Sub1.anIntArray172;
			@Pc(1838) int[] local1838 = new int[9];
			for (local1696 = 0; local1696 < 9; local1696++) {
				local1754 = local1696 * 32 + 128 + 15;
				@Pc(1856) int local1856 = local1754 * 3 + 600;
				@Pc(1860) int local1860 = Class1_Sub1_Sub2_Sub1.anIntArray170[local1754];
				local1838[local1696] = local1856 * local1860 >> 16;
			}
			Class36.method584(local1838);
			Class44.method619(local316);
			this.aClass13_1 = new Class13(this, -617);
			this.method90(this.aClass13_1, 10);
		} catch (@Pc(1895) Exception local1895) {
			signlink.reporterror("loaderror " + this.aString5 + " " + this.anInt205);
			this.aBoolean75 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method126(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt324 >= 100) {
					this.method205("Your ignore list is full. Max of 100 hit", "", 0);
				} else {
					@Pc(23) String local23 = Class49.method704(Class49.method701(586, arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt324; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method205(local23 + " is already on your ignore list", "", 0);
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt380; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method205("Please remove " + local23 + " from your friend list first", "", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt324++] = arg0;
					this.aBoolean78 = true;
					this.aClass1_Sub1_Sub3_3.method492(189);
					this.aClass1_Sub1_Sub3_3.method499(arg0);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("25895, " + arg0 + ", " + 0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!mb;)V")
	private void method127(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt320 = 0;
			this.anInt243 = 0;
			this.method154(arg1, arg0);
			this.method177(arg0, arg1);
			this.method104(arg0, arg1);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt320; local28++) {
				local35 = this.anIntArray70[local28];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local35].anInt1034 != anInt209) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local35].aClass15_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local35] = null;
				}
			}
			if (arg1.anInt766 != arg0) {
				signlink.reporterror(this.aString6 + " size mismatch in getnpcpos - pos:" + arg1.anInt766 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt217; local35++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray41[local35]] == null) {
					signlink.reporterror(this.aString6 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt217);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("56803, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt309 = Integer.parseInt(this.getParameter("nodeid"));
		anInt310 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method184();
		} else {
			method202();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean64 = false;
		} else {
			aBoolean64 = true;
		}
		this.method80();
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method128() {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt265; local7++) {
				if (this.anIntArray85[local7] <= 0) {
					@Pc(16) boolean local16 = false;
					try {
						if (this.anIntArray82[local7] != this.anInt366 || this.anIntArray69[local7] != this.anInt299) {
							@Pc(49) Class1_Sub1_Sub3 local49 = Class7.method237(this.anIntArray82[local7], this.anIntArray69[local7]);
							if (System.currentTimeMillis() + (long) (local49.anInt766 / 22) > this.aLong15 + (long) (this.anInt346 / 22)) {
								this.anInt346 = local49.anInt766;
								this.aLong15 = System.currentTimeMillis();
								if (this.method123((byte) 6, local49.aByteArray9, local49.anInt766)) {
									this.anInt366 = this.anIntArray82[local7];
									this.anInt299 = this.anIntArray69[local7];
								} else {
									local16 = true;
								}
							}
						} else if (!this.method111()) {
							local16 = true;
						}
					} catch (@Pc(99) Exception local99) {
					}
					if (local16 && this.anIntArray85[local7] != -5) {
						this.anIntArray85[local7] = -5;
					} else {
						this.anInt265--;
						for (@Pc(115) int local115 = local7; local115 < this.anInt265; local115++) {
							this.anIntArray82[local115] = this.anIntArray82[local115 + 1];
							this.anIntArray69[local115] = this.anIntArray69[local115 + 1];
							this.anIntArray85[local115] = this.anIntArray85[local115 + 1];
						}
						local7--;
					}
				} else {
					@Pc(167) int local167 = this.anIntArray85[local7]--;
				}
			}
			if (this.anInt221 > 0) {
				this.anInt221 -= 20;
				if (this.anInt221 < 0) {
					this.anInt221 = 0;
				}
				if (this.anInt221 == 0 && this.aBoolean49 && !aBoolean65) {
					this.anInt304 = this.anInt344;
					this.aBoolean61 = false;
					this.aClass45_Sub1_1.method669(2, this.anInt304);
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("96967, " + 3 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			signlink.anInt916 = arg1;
			this.anInt405 += arg0;
			if (arg2) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("73505, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method130(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString10 = "";
				this.aString11 = "Connecting to server...";
				this.method94(true);
			}
			this.aClass8_1 = new Class8(this, true, this.method116(anInt310 + 43594));
			@Pc(30) long local30 = Class49.method700(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_3.anInt766 = 0;
			this.aClass1_Sub1_Sub3_3.method493(14);
			this.aClass1_Sub1_Sub3_3.method493(local37);
			this.aClass8_1.method246(2, this.aClass1_Sub1_Sub3_3.aByteArray9);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method243();
			}
			@Pc(74) int local74 = this.aClass8_1.method243();
			@Pc(223) int local223;
			@Pc(257) int local257;
			if (local74 == 0) {
				this.aClass8_1.method245(this.aClass1_Sub1_Sub3_2.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_2.anInt766 = 0;
				this.aLong17 = this.aClass1_Sub1_Sub3_2.method509();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong17 >> 32), (int) this.aLong17 };
				this.aClass1_Sub1_Sub3_3.anInt766 = 0;
				this.aClass1_Sub1_Sub3_3.method493(10);
				this.aClass1_Sub1_Sub3_3.method497(local97[0]);
				this.aClass1_Sub1_Sub3_3.method497(local97[1]);
				this.aClass1_Sub1_Sub3_3.method497(local97[2]);
				this.aClass1_Sub1_Sub3_3.method497(local97[3]);
				this.aClass1_Sub1_Sub3_3.method497(signlink.anInt911);
				this.aClass1_Sub1_Sub3_3.method500(arg0);
				this.aClass1_Sub1_Sub3_3.method500(arg1);
				this.aClass1_Sub1_Sub3_3.method518(aBigInteger1, aBigInteger2);
				this.aClass1_Sub1_Sub3_1.anInt766 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_1.method493(18);
				} else {
					this.aClass1_Sub1_Sub3_1.method493(16);
				}
				this.aClass1_Sub1_Sub3_1.method493(this.aClass1_Sub1_Sub3_3.anInt766 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_1.method493(255);
				this.aClass1_Sub1_Sub3_1.method494(257);
				this.aClass1_Sub1_Sub3_1.method493(aBoolean65 ? 1 : 0);
				for (local223 = 0; local223 < 9; local223++) {
					this.aClass1_Sub1_Sub3_1.method497(this.anIntArray91[local223]);
				}
				this.aClass1_Sub1_Sub3_1.method501(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aClass1_Sub1_Sub3_3.anInt766);
				this.aClass1_Sub1_Sub3_3.aClass47_2 = new Class47(true, local97);
				for (local257 = 0; local257 < 4; local257++) {
					local97[local257] += 50;
				}
				this.aClass47_1 = new Class47(true, local97);
				this.aClass8_1.method246(this.aClass1_Sub1_Sub3_1.anInt766, this.aClass1_Sub1_Sub3_1.aByteArray9);
				local74 = this.aClass8_1.method243();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(299) Exception local299) {
				}
				this.method130(arg0, arg1, arg2);
			} else {
				@Pc(387) int local387;
				if (local74 == 2) {
					this.anInt373 = this.aClass8_1.method243();
					aBoolean41 = this.aClass8_1.method243() == 1;
					this.aLong18 = 0L;
					this.anInt232 = 0;
					this.aClass13_1.anInt549 = 0;
					super.aBoolean38 = true;
					this.aBoolean58 = true;
					this.aBoolean81 = true;
					this.aClass1_Sub1_Sub3_3.anInt766 = 0;
					this.aClass1_Sub1_Sub3_2.anInt766 = 0;
					this.anInt406 = -1;
					this.anInt206 = -1;
					this.anInt207 = -1;
					this.anInt208 = -1;
					this.anInt405 = 0;
					this.anInt407 = 0;
					this.anInt238 = 0;
					this.anInt409 = 0;
					this.anInt213 = 0;
					this.anInt308 = 0;
					this.aBoolean51 = false;
					super.anInt192 = 0;
					for (local387 = 0; local387 < 100; local387++) {
						this.aStringArray3[local387] = null;
					}
					this.anInt281 = 0;
					this.anInt301 = 0;
					this.anInt323 = 0;
					this.anInt265 = 0;
					this.anInt234 = (int) (Math.random() * 100.0D) - 50;
					this.anInt386 = (int) (Math.random() * 110.0D) - 55;
					this.anInt289 = (int) (Math.random() * 80.0D) - 40;
					this.anInt349 = (int) (Math.random() * 120.0D) - 60;
					this.anInt360 = (int) (Math.random() * 30.0D) - 20;
					this.anInt332 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt347 = -1;
					this.anInt292 = 0;
					this.anInt293 = 0;
					this.anInt242 = 0;
					this.anInt217 = 0;
					for (local223 = 0; local223 < this.anInt240; local223++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223] = null;
						this.aClass1_Sub1_Sub3Array1[local223] = null;
					}
					for (local257 = 0; local257 < 16384; local257++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local257] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt241] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass31_2.method538();
					this.aClass31_1.method538();
					@Pc(529) int local529;
					@Pc(533) int local533;
					for (@Pc(525) int local525 = 0; local525 < 4; local525++) {
						for (local529 = 0; local529 < 104; local529++) {
							for (local533 = 0; local533 < 104; local533++) {
								this.aClass31ArrayArrayArray1[local525][local529][local533] = null;
							}
						}
					}
					this.aClass31_3 = new Class31((byte) 9);
					this.anInt381 = 0;
					this.anInt380 = 0;
					this.anInt325 = -1;
					this.anInt223 = -1;
					this.anInt210 = -1;
					this.anInt260 = -1;
					this.anInt233 = -1;
					this.aBoolean59 = false;
					this.anInt297 = 3;
					this.aBoolean73 = false;
					this.aBoolean51 = false;
					this.aBoolean79 = false;
					this.aString4 = null;
					this.anInt379 = 0;
					this.anInt214 = -1;
					this.aBoolean74 = true;
					this.method179();
					for (local529 = 0; local529 < 5; local529++) {
						this.anIntArray45[local529] = 0;
					}
					for (local533 = 0; local533 < 5; local533++) {
						this.aStringArray5[local533] = null;
						this.aBooleanArray3[local533] = false;
					}
					anInt389 = 0;
					anInt351 = 0;
					anInt224 = 0;
					anInt316 = 0;
					anInt247 = 0;
					anInt219 = 0;
					anInt211 = 0;
					anInt362 = 0;
					anInt312 = 0;
					this.method107();
				} else if (local74 == 3) {
					this.aString10 = "";
					this.aString11 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString10 = "Your account has been disabled.";
					this.aString11 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString10 = "Your account is already logged in.";
					this.aString11 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString10 = "RuneScape has been updated!";
					this.aString11 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString10 = "This world is full.";
					this.aString11 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString10 = "Unable to connect.";
					this.aString11 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString10 = "Login limit exceeded.";
					this.aString11 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString10 = "Unable to connect.";
					this.aString11 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString11 = "Login server rejected session.";
					this.aString11 = "Please try again.";
				} else if (local74 == 12) {
					this.aString10 = "You need a members account to login to this world.";
					this.aString11 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString10 = "Could not complete login.";
					this.aString11 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString10 = "The server is being updated.";
					this.aString11 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean81 = true;
					this.aClass1_Sub1_Sub3_3.anInt766 = 0;
					this.aClass1_Sub1_Sub3_2.anInt766 = 0;
					this.anInt406 = -1;
					this.anInt206 = -1;
					this.anInt207 = -1;
					this.anInt208 = -1;
					this.anInt405 = 0;
					this.anInt407 = 0;
					this.anInt238 = 0;
					this.anInt308 = 0;
					this.aBoolean51 = false;
					this.aLong14 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString10 = "Login attempts exceeded.";
					this.aString11 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString10 = "You are standing in a members-only area.";
					this.aString11 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString10 = "Invalid loginserver requested";
					this.aString11 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local387 = this.aClass8_1.method243(); local387 >= 0; local387--) {
						this.aString10 = "You have only just left another world";
						this.aString11 = "Your profile will be transfered in: " + local387 + " seconds";
						this.method94(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(894) Exception local894) {
						}
					}
					this.method130(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString10 = "No response from server";
					this.aString11 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString10 = "Unexpected server response";
					this.aString11 = "Please try using a different world.";
				}
			}
		} catch (@Pc(930) IOException local930) {
			this.aString10 = "";
			this.aString11 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method131(@OriginalArg(0) byte arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass48_1.method689("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass37_15.method599();
			local13.method373(0, 0);
			this.aClass37_16.method599();
			local13.method373(0, -637);
			this.aClass37_12.method599();
			local13.method373(0, -128);
			this.aClass37_13.method599();
			local13.method373(-371, -202);
			this.aClass37_14.method599();
			local13.method373(-171, -202);
			this.aClass37_17.method599();
			local13.method373(-265, 0);
			this.aClass37_18.method599();
			local13.method373(-265, -562);
			this.aClass37_19.method599();
			local13.method373(-171, -128);
			this.aClass37_20.method599();
			local13.method373(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt615];
			@Pc(104) int local104;
			for (@Pc(100) int local100 = 0; local100 < local13.anInt616; local100++) {
				for (local104 = 0; local104 < local13.anInt615; local104++) {
					local98[local104] = local13.anIntArray200[local13.anInt615 + local13.anInt615 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt615; local130++) {
					local13.anIntArray200[local130 + local13.anInt615 * local100] = local98[local130];
				}
			}
			this.aClass37_15.method599();
			local13.method373(0, 382);
			this.aClass37_16.method599();
			local13.method373(0, -255);
			if (arg0 == this.aByte10) {
				@Pc(178) boolean local178 = false;
			} else {
				for (local104 = 1; local104 > 0; local104++) {
				}
			}
			this.aClass37_12.method599();
			local13.method373(0, 254);
			this.aClass37_13.method599();
			local13.method373(-371, 180);
			this.aClass37_14.method599();
			local13.method373(-171, 180);
			this.aClass37_17.method599();
			local13.method373(-265, 382);
			this.aClass37_18.method599();
			local13.method373(-265, -180);
			this.aClass37_19.method599();
			local13.method373(-171, 254);
			this.aClass37_20.method599();
			local13.method373(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass48_1, "logo", 0);
			this.aClass37_12.method599();
			local13.method375(382 - local13.anInt615 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(283) RuntimeException local283) {
			signlink.reporterror("15939, " + arg0 + ", " + local283.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method132() {
		try {
			if (this.aClass37_12 == null) {
				super.aClass37_2 = null;
				this.aClass37_24 = null;
				this.aClass37_22 = null;
				this.aClass37_21 = null;
				this.aClass37_23 = null;
				this.aClass37_25 = null;
				this.aClass37_26 = null;
				this.aClass37_27 = null;
				this.aClass37_15 = new Class37(128, 265, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_16 = new Class37(128, 265, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_12 = new Class37(509, 171, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_13 = new Class37(360, 132, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_14 = new Class37(360, 200, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_17 = new Class37(202, 238, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_18 = new Class37(203, 238, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_19 = new Class37(74, 94, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				this.aClass37_20 = new Class37(75, 94, 47904, this.method89());
				Class1_Sub1_Sub2.method460(this.anInt355);
				if (this.aClass48_1 != null) {
					this.method131(aByte13);
					this.method191();
				}
				this.aBoolean54 = true;
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("51799, " + 7 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method133() {
		try {
			for (@Pc(14) Class1_Sub1_Sub1_Sub6 local14 = (Class1_Sub1_Sub1_Sub6) this.aClass31_1.method534(); local14 != null; local14 = (Class1_Sub1_Sub1_Sub6) this.aClass31_1.method536(633)) {
				if (local14.anInt510 != this.anInt391 || local14.aBoolean117) {
					local14.method690();
				} else if (anInt209 >= local14.anInt509) {
					local14.method289(this.anInt255, this.anInt398);
					if (local14.aBoolean117) {
						local14.method690();
					} else {
						this.aClass36_1.method559(local14.anInt510, local14.anInt511, local14, local14.anInt513, false, local14.anInt512, 0, 60, -1);
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("18613, " + false + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method134() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method471("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt308; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method471(this.aStringArray4[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt308 * 15 + 21;
			@Pc(71) int local71;
			@Pc(89) int local89;
			if (super.anInt200 > 4 && super.anInt201 > 4 && super.anInt200 < 516 && super.anInt201 < 338) {
				local71 = super.anInt200 - local7 / 2 - 4;
				if (local71 + local7 > 512) {
					local71 = 512 - local7;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt201 - 4;
				if (local89 + local20 > 334) {
					local89 = 334 - local20;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.aBoolean51 = true;
				this.anInt399 = 0;
				this.anInt400 = local71;
				this.anInt401 = local89;
				this.anInt402 = local7;
				this.anInt403 = this.anInt308 * 15 + 22;
			}
			if (super.anInt200 > 553 && super.anInt201 > 205 && super.anInt200 < 743 && super.anInt201 < 466) {
				local71 = super.anInt200 - local7 / 2 - 553;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 190) {
					local71 = 190 - local7;
				}
				local89 = super.anInt201 - 205;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 261) {
					local89 = 261 - local20;
				}
				this.aBoolean51 = true;
				this.anInt399 = 1;
				this.anInt400 = local71;
				this.anInt401 = local89;
				this.anInt402 = local7;
				this.anInt403 = this.anInt308 * 15 + 22;
			}
			if (super.anInt200 > 17 && super.anInt201 > 357 && super.anInt200 < 496 && super.anInt201 < 453) {
				local71 = super.anInt200 - local7 / 2 - 17;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 479) {
					local71 = 479 - local7;
				}
				local89 = super.anInt201 - 357;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 96) {
					local89 = 96 - local20;
				}
				this.aBoolean51 = true;
				this.anInt399 = 2;
				this.anInt400 = local71;
				this.anInt401 = local89;
				this.anInt402 = local7;
				this.anInt403 = this.anInt308 * 15 + 22;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("25988, " + 6745 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!d;)V")
	private void method135(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt427;
			@Pc(65) int local65;
			if ((local9 < 1 || local9 > 100) && (local9 < 701 || local9 > 800)) {
				if (local9 >= 101 && local9 <= 200 || local9 >= 801 && local9 <= 900) {
					local65 = this.anInt380;
					if (this.anInt381 != 2) {
						local65 = 0;
					}
					if (local9 > 800) {
						local9 -= 701;
					} else {
						local9 -= 101;
					}
					if (local9 >= local65) {
						arg0.aString18 = "";
						arg0.anInt426 = 0;
					} else {
						if (this.anIntArray66[local9] == 0) {
							arg0.aString18 = "@red@Offline";
						} else if (this.anIntArray66[local9] == anInt309) {
							arg0.aString18 = "@gre@World-" + (this.anIntArray66[local9] - 9);
						} else {
							arg0.aString18 = "@yel@World-" + (this.anIntArray66[local9] - 9);
						}
						arg0.anInt426 = 1;
					}
				} else if (local9 == 203) {
					local65 = this.anInt380;
					if (this.anInt381 != 2) {
						local65 = 0;
					}
					arg0.anInt433 = local65 * 15 + 20;
					if (arg0.anInt433 <= arg0.anInt429) {
						arg0.anInt433 = arg0.anInt429 + 1;
					}
				} else if (local9 >= 401 && local9 <= 500) {
					local9 -= 401;
					if (local9 >= this.anInt324) {
						arg0.aString18 = "";
						arg0.anInt426 = 0;
					} else {
						arg0.aString18 = Class49.method704(Class49.method701(586, this.aLongArray4[local9]));
						arg0.anInt426 = 1;
					}
				} else if (local9 == 503) {
					arg0.anInt433 = this.anInt324 * 15 + 20;
					if (arg0.anInt433 <= arg0.anInt429) {
						arg0.anInt433 = arg0.anInt429 + 1;
					}
				} else if (local9 == 327) {
					arg0.anInt449 = 150;
					arg0.anInt450 = (int) (Math.sin((double) anInt209 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean76) {
						for (local65 = 0; local65 < 7; local65++) {
							@Pc(302) int local302 = this.anIntArray78[local65];
							if (local302 >= 0 && !Class25.aClass25Array1[local302].method521()) {
								return;
							}
						}
						this.aBoolean76 = false;
						@Pc(321) Class1_Sub1_Sub1_Sub5[] local321 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(323) int local323 = 0;
						for (@Pc(325) int local325 = 0; local325 < 7; local325++) {
							@Pc(332) int local332 = this.anIntArray78[local325];
							if (local332 >= 0) {
								local321[local323++] = Class25.aClass25Array1[local332].method522();
							}
						}
						@Pc(354) Class1_Sub1_Sub1_Sub5 local354 = new Class1_Sub1_Sub1_Sub5(172, local321, local323);
						for (@Pc(356) int local356 = 0; local356 < 5; local356++) {
							if (this.anIntArray45[local356] != 0) {
								local354.method270(anIntArrayArray3[local356][0], anIntArrayArray3[local356][this.anIntArray45[local356]]);
								if (local356 == 1) {
									local354.method270(anIntArray71[0], anIntArray71[this.anIntArray45[local356]]);
								}
							}
						}
						local354.method263(this.anInt278);
						local354.method264(Class29.aClass29Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt998].anIntArray237[0]);
						local354.method273(64, 850, -30, -50, -30, true);
						arg0.anInt442 = 5;
						arg0.anInt443 = 0;
						Class6.method228(local354);
					}
				} else if (local9 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_3 == null) {
						this.aClass1_Sub1_Sub2_Sub2_3 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_4 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean74) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_4;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_3;
					}
				} else if (local9 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_3 == null) {
						this.aClass1_Sub1_Sub2_Sub2_3 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_4 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean74) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_3;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_4;
					}
				} else if (local9 == 600) {
					arg0.aString18 = this.aString13;
					if (anInt209 % 20 < 10) {
						arg0.aString18 = arg0.aString18 + "|";
					} else {
						arg0.aString18 = arg0.aString18 + " ";
					}
				} else {
					if (local9 == 613) {
						if (this.anInt373 < 1) {
							arg0.aString18 = "";
						} else if (this.aBoolean62) {
							arg0.anInt438 = 16711680;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt438 = 16777215;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(563) String local563;
					if (local9 == 650 || local9 == 655) {
						if (this.anInt326 == 0) {
							arg0.aString18 = "";
						} else {
							if (this.anInt354 == 0) {
								local563 = "earlier today";
							} else if (this.anInt354 == 1) {
								local563 = "yesterday";
							} else {
								local563 = this.anInt354 + " days ago";
							}
							arg0.aString18 = "You last logged in " + local563 + " from: " + signlink.dns;
						}
					}
					if (local9 == 651) {
						if (this.anInt411 == 0) {
							arg0.aString18 = "0 unread messages";
							arg0.anInt438 = 16776960;
						}
						if (this.anInt411 == 1) {
							arg0.aString18 = "1 unread message";
							arg0.anInt438 = 65280;
						}
						if (this.anInt411 > 1) {
							arg0.aString18 = this.anInt411 + " unread messages";
							arg0.anInt438 = 65280;
						}
					}
					if (local9 == 652) {
						if (this.anInt288 == 201) {
							if (this.anInt410 == 1) {
								arg0.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt288 == 200) {
							arg0.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt288 == 0) {
								local563 = "Earlier today";
							} else if (this.anInt288 == 1) {
								local563 = "Yesterday";
							} else {
								local563 = this.anInt288 + " days ago";
							}
							arg0.aString18 = local563 + " you changed your recovery questions";
						}
					}
					if (local9 == 653) {
						if (this.anInt288 == 201) {
							if (this.anInt410 == 1) {
								arg0.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt288 == 200) {
							arg0.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local9 == 654) {
						if (this.anInt288 == 201) {
							if (this.anInt410 == 1) {
								arg0.aString18 = "@whi@this world but member benefits are unavailabe whilst here.";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt288 == 200) {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local9 == 1 && this.anInt381 == 0) {
				arg0.aString18 = "Loading friend list";
				arg0.anInt426 = 0;
			} else if (local9 == 1 && this.anInt381 == 1) {
				arg0.aString18 = "Connecting to friendserver";
				arg0.anInt426 = 0;
			} else if (local9 == 2 && this.anInt381 != 2) {
				arg0.aString18 = "Please wait...";
				arg0.anInt426 = 0;
			} else {
				local65 = this.anInt380;
				if (this.anInt381 != 2) {
					local65 = 0;
				}
				if (local9 > 700) {
					local9 -= 601;
				} else {
					local9--;
				}
				if (local9 >= local65) {
					arg0.aString18 = "";
					arg0.anInt426 = 0;
				} else {
					arg0.aString18 = this.aStringArray6[local9];
					arg0.anInt426 = 1;
				}
			}
		} catch (@Pc(771) RuntimeException local771) {
			signlink.reporterror("26429, " + -206 + ", " + arg0 + ", " + local771.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method136(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt919 = arg0;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("38983, " + -25132 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mb;II)V")
	private void method137(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5;
			if (arg1 >= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			this.anInt320 = 0;
			this.anInt243 = 0;
			this.method140(arg0, arg2);
			this.method193(arg0, arg2);
			this.method172(arg2, arg0);
			this.method171(arg0, arg2);
			@Pc(45) int local45;
			for (local5 = 0; local5 < this.anInt320; local5++) {
				local45 = this.anIntArray70[local5];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local45].anInt1034 != anInt209) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local45] = null;
				}
			}
			if (arg0.anInt766 != arg2) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt766 + " psize:" + arg2);
				throw new RuntimeException("eek");
			}
			for (local45 = 0; local45 < this.anInt242; local45++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray47[local45]] == null) {
					signlink.reporterror(this.aString6 + " null entry in pl list - pos:" + local45 + " size:" + this.anInt242);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("12672, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BJ)V")
	private void method138(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt324; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt324--;
						this.aBoolean78 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt324; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method492(193);
						this.aClass1_Sub1_Sub3_3.method499(arg0);
						break;
					}
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("11940, " + 3 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method139() {
		try {
			@Pc(17) int local17;
			for (@Pc(10) int local10 = 10; local10 < 117; local10++) {
				local17 = (int) (Math.random() * 100.0D);
				if (local17 < 50) {
					this.anIntArray54[local10 + 32512] = 255;
				}
			}
			@Pc(46) int local46;
			@Pc(53) int local53;
			@Pc(59) int local59;
			for (local17 = 0; local17 < 100; local17++) {
				local46 = (int) (Math.random() * 124.0D) + 2;
				local53 = (int) (Math.random() * 128.0D) + 128;
				local59 = local46 + (local53 << 7);
				this.anIntArray54[local59] = 192;
			}
			for (local46 = 1; local46 < 255; local46++) {
				for (local53 = 1; local53 < 127; local53++) {
					local59 = local53 + (local46 << 7);
					this.anIntArray55[local59] = (this.anIntArray54[local59 - 1] + this.anIntArray54[local59 + 1] + this.anIntArray54[local59 - 128] + this.anIntArray54[local59 + 128]) / 4;
				}
			}
			this.anInt311 += 128;
			if (this.anInt311 > this.anIntArray62.length) {
				this.anInt311 -= this.anIntArray62.length;
				local53 = (int) (Math.random() * 12.0D);
				this.method185(this.aClass1_Sub1_Sub2_Sub3Array1[local53]);
			}
			@Pc(171) int local171;
			for (local53 = 1; local53 < 255; local53++) {
				for (local59 = 1; local59 < 127; local59++) {
					local171 = local59 + (local53 << 7);
					@Pc(194) int local194 = this.anIntArray55[local171 + 128] - this.anIntArray62[local171 + this.anInt311 & this.anIntArray62.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray54[local171] = local194;
				}
			}
			for (local59 = 0; local59 < 255; local59++) {
				this.anIntArray49[local59] = this.anIntArray49[local59 + 1];
			}
			this.anIntArray49[255] = (int) (Math.sin((double) anInt209 / 14.0D) * 16.0D + Math.sin((double) anInt209 / 15.0D) * 14.0D + Math.sin((double) anInt209 / 16.0D) * 12.0D);
			if (this.anInt263 > 0) {
				this.anInt263 -= 4;
			}
			if (this.anInt264 > 0) {
				this.anInt264 -= 4;
			}
			if (this.anInt263 == 0 && this.anInt264 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt263 = 1024;
				}
				if (local171 == 1) {
					this.anInt264 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("42498, " + 9 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method140(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method513();
			@Pc(21) int local21 = arg0.method514(1, this.anInt275);
			if (local21 != 0) {
				@Pc(30) int local30 = arg0.method514(2, this.anInt275);
				if (local30 == 0) {
					this.anIntArray48[this.anInt243++] = this.anInt241;
				} else {
					@Pc(54) int local54;
					@Pc(65) int local65;
					if (local30 == 1) {
						local54 = arg0.method514(3, this.anInt275);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method695(local54, false);
						local65 = arg0.method514(1, this.anInt275);
						if (local65 == 1) {
							this.anIntArray48[this.anInt243++] = this.anInt241;
						}
					} else {
						@Pc(112) int local112;
						if (local30 == 2) {
							local54 = arg0.method514(3, this.anInt275);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method695(local54, true);
							local65 = arg0.method514(3, this.anInt275);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method695(local65, true);
							local112 = arg0.method514(1, this.anInt275);
							if (local112 == 1) {
								this.anIntArray48[this.anInt243++] = this.anInt241;
							}
						} else if (local30 == 3) {
							this.anInt391 = arg0.method514(2, this.anInt275);
							local54 = arg0.method514(7, this.anInt275);
							local65 = arg0.method514(7, this.anInt275);
							local112 = arg0.method514(1, this.anInt275);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method694(local112 == 1, local65, local54);
							@Pc(173) int local173 = arg0.method514(1, this.anInt275);
							if (local173 == 1) {
								this.anIntArray48[this.anInt243++] = this.anInt241;
							}
						}
					}
				}
			}
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("10035, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method141() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method242();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean81 = false;
			this.anInt327 = 0;
			this.aString6 = "";
			this.aString7 = "";
			this.method189();
			this.aClass36_1.method548(this.aBoolean67);
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass21Array1[local36].method443();
			}
			System.gc();
			this.method175();
			this.anInt344 = -1;
			this.anInt304 = -1;
			this.anInt221 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("51977, " + 2408 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = Class41.aClass41Array1[arg0].anInt907;
			if (local8 != 0) {
				@Pc(16) int local16 = this.anIntArray75[arg0];
				if (local8 == 1) {
					if (local16 == 1) {
						Class1_Sub1_Sub2_Sub1.method342(0.9D);
					}
					if (local16 == 2) {
						Class1_Sub1_Sub2_Sub1.method342(0.8D);
					}
					if (local16 == 3) {
						Class1_Sub1_Sub2_Sub1.method342(0.7D);
					}
					if (local16 == 4) {
						Class1_Sub1_Sub2_Sub1.method342(0.6D);
					}
					Class17.aClass39_8.method606();
					this.aBoolean54 = true;
				}
				if (local8 == 3) {
					@Pc(54) boolean local54 = this.aBoolean49;
					if (local16 == 0) {
						this.method129(this.anInt245, 0, this.aBoolean49);
						this.aBoolean49 = true;
					}
					if (local16 == 1) {
						this.method129(this.anInt245, -400, this.aBoolean49);
						this.aBoolean49 = true;
					}
					if (local16 == 2) {
						this.method129(this.anInt245, -800, this.aBoolean49);
						this.aBoolean49 = true;
					}
					if (local16 == 3) {
						this.method129(this.anInt245, -1200, this.aBoolean49);
						this.aBoolean49 = true;
					}
					if (local16 == 4) {
						this.aBoolean49 = false;
					}
					if (this.aBoolean49 != local54 && !aBoolean65) {
						if (this.aBoolean49) {
							this.anInt304 = this.anInt344;
							this.aBoolean61 = false;
							this.aClass45_Sub1_1.method669(2, this.anInt304);
						} else {
							this.method175();
						}
						this.anInt221 = 0;
					}
				}
				if (local8 == 4) {
					if (local16 == 0) {
						this.aBoolean43 = true;
						this.method136(0);
					}
					if (local16 == 1) {
						this.aBoolean43 = true;
						this.method136(-400);
					}
					if (local16 == 2) {
						this.aBoolean43 = true;
						this.method136(-800);
					}
					if (local16 == 3) {
						this.aBoolean43 = true;
						this.method136(-1200);
					}
					if (local16 == 4) {
						this.aBoolean43 = false;
					}
				}
				if (local8 == 5) {
					this.anInt307 = local16;
				}
				if (local8 == 6) {
					this.anInt279 = local16;
				}
				if (local8 == 8) {
					this.anInt330 = local16;
					this.aBoolean70 = true;
				}
				if (local8 == 9) {
					this.anInt254 = local16;
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("45039, " + arg0 + ", " + arg1 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ob;)V")
	private void method143(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt794 == 0) {
				local1 = this.aClass36_1.method574(arg0.anInt793, arg0.anInt795, arg0.anInt796);
			}
			if (arg0.anInt794 == 1) {
				local1 = this.aClass36_1.method575(arg0.anInt795, arg0.anInt793, this.aBoolean55, arg0.anInt796);
			}
			if (arg0.anInt794 == 2) {
				local1 = this.aClass36_1.method576(arg0.anInt793, arg0.anInt795, arg0.anInt796);
			}
			if (arg0.anInt794 == 3) {
				local1 = this.aClass36_1.method577(arg0.anInt793, arg0.anInt795, arg0.anInt796);
			}
			if (local1 != 0) {
				@Pc(77) int local77 = this.aClass36_1.method578(arg0.anInt793, arg0.anInt795, arg0.anInt796, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local77 & 0x1F;
				local7 = local77 >> 6;
			}
			arg0.anInt797 = local3;
			arg0.anInt799 = local5;
			this.anInt405 += 0;
			arg0.anInt798 = local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("17164, " + 0 + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method91(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt205 = arg0;
			this.aString5 = arg1;
			this.method132();
			if (this.aClass48_1 == null) {
				super.method91(arg0, arg1);
			} else {
				this.aClass37_14.method599();
				this.aClass1_Sub1_Sub2_Sub4_3.method469(54, 180, "RuneScape is loading - please wait...", 16777215);
				Class1_Sub1_Sub2.method463(28, 304, 34, 62, 9179409);
				Class1_Sub1_Sub2.method463(29, 302, 32, 63, 0);
				Class1_Sub1_Sub2.method462(arg0 * 3, 9179409, 64, 30, 30);
				Class1_Sub1_Sub2.method462(300 - arg0 * 3, 0, 64, 30, arg0 * 3 + 30);
				this.aClass1_Sub1_Sub2_Sub4_3.method469(85, 180, arg1, 16777215);
				this.aClass37_14.method600(171, super.aGraphics2, 202);
				if (this.aBoolean54) {
					this.aBoolean54 = false;
					if (!this.aBoolean47) {
						this.aClass37_15.method600(0, super.aGraphics2, 0);
						this.aClass37_16.method600(0, super.aGraphics2, 637);
					}
					this.aClass37_12.method600(0, super.aGraphics2, 128);
					this.aClass37_13.method600(371, super.aGraphics2, 202);
					this.aClass37_17.method600(265, super.aGraphics2, 0);
					this.aClass37_18.method600(265, super.aGraphics2, 562);
					this.aClass37_19.method600(171, super.aGraphics2, 128);
					this.aClass37_20.method600(171, super.aGraphics2, 562);
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("9831, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method144() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt242; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt241;
				} else {
					local11 = this.anIntArray47[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null) {
					this.method159(this.aByte8, 1, local23);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("39633, " + 127 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method145() {
		try {
			this.aClass37_22.method599();
			@Pc(13) int local13 = this.anInt332 + this.anInt349 & 0x7FF;
			@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32 + 48;
			@Pc(27) int local27 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
			this.aClass1_Sub1_Sub2_Sub2_11.method379(this.anInt360 + 256, local13, local20, local27, this.anIntArray76, 146, this.anIntArray86, 5, 25, 151);
			this.aClass1_Sub1_Sub2_Sub2_10.method379(256, this.anInt332, 25, 25, this.anIntArray81, 33, this.anIntArray84, 0, 0, 33);
			for (@Pc(73) int local73 = 0; local73 < this.anInt268; local73++) {
				local20 = this.anIntArray60[local73] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32;
				local27 = this.anIntArray61[local73] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
				this.method216(local27, this.aClass1_Sub1_Sub2_Sub2Array5[local73], local20);
			}
			@Pc(123) int local123;
			for (@Pc(119) int local119 = 0; local119 < 104; local119++) {
				for (local123 = 0; local123 < 104; local123++) {
					@Pc(135) Class31 local135 = this.aClass31ArrayArrayArray1[this.anInt391][local119][local123];
					if (local135 != null) {
						local20 = local119 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32;
						local27 = local123 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
						this.method216(local27, this.aClass1_Sub1_Sub2_Sub2_6, local20);
					}
				}
			}
			for (local123 = 0; local123 < this.anInt217; local123++) {
				@Pc(186) Class1_Sub1_Sub1_Sub1_Sub2 local186 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray41[local123]];
				if (local186 != null && local186.method697() && local186.aClass15_2.aBoolean145) {
					local20 = local186.anInt994 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32;
					local27 = local186.anInt995 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
					this.method216(local27, this.aClass1_Sub1_Sub2_Sub2_7, local20);
				}
			}
			@Pc(240) Class1_Sub1_Sub1_Sub1_Sub1 local240;
			for (@Pc(230) int local230 = 0; local230 < this.anInt242; local230++) {
				local240 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray47[local230]];
				if (local240 != null && local240.method697()) {
					local20 = local240.anInt994 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32;
					local27 = local240.anInt995 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
					@Pc(268) boolean local268 = false;
					@Pc(272) long local272 = Class49.method700(local240.aString3);
					for (@Pc(274) int local274 = 0; local274 < this.anInt380; local274++) {
						if (local272 == this.aLongArray3[local274] && this.anIntArray66[local274] != 0) {
							local268 = true;
							break;
						}
					}
					if (local268) {
						this.method216(local27, this.aClass1_Sub1_Sub2_Sub2_9, local20);
					} else {
						this.method216(local27, this.aClass1_Sub1_Sub2_Sub2_8, local20);
					}
				}
			}
			if (this.anInt213 != 0 && anInt209 % 20 < 10) {
				if (this.anInt213 == 1 && this.anInt390 >= 0 && this.anInt390 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(347) Class1_Sub1_Sub1_Sub1_Sub2 local347 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt390];
					if (local347 != null) {
						local20 = local347.anInt994 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32;
						local27 = local347.anInt995 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
						this.method152(local27, this.aClass1_Sub1_Sub2_Sub2_2, local20);
					}
				}
				if (this.anInt213 == 2) {
					local20 = (this.anInt412 - this.anInt356) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32;
					local27 = (this.anInt413 - this.anInt357) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
					this.method152(local27, this.aClass1_Sub1_Sub2_Sub2_2, local20);
				}
				if (this.anInt213 == 10 && this.anInt365 >= 0 && this.anInt365 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
					local240 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt365];
					if (local240 != null) {
						local20 = local240.anInt994 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32;
						local27 = local240.anInt995 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
						this.method152(local27, this.aClass1_Sub1_Sub2_Sub2_2, local20);
					}
				}
			}
			if (this.anInt292 != 0) {
				local20 = this.anInt292 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 / 32;
				local27 = this.anInt293 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 / 32;
				this.method216(local27, this.aClass1_Sub1_Sub2_Sub2_1, local20);
			}
			Class1_Sub1_Sub2.method462(3, 16777215, 78, 3, 97);
			this.aClass37_23.method599();
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("12321, " + -21 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method146() {
		try {
			this.anInt244 = 0;
			@Pc(17) int local17 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 >> 7) + this.anInt356;
			@Pc(25) int local25 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 >> 7) + this.anInt357;
			if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
				this.anInt244 = 1;
			}
			if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
				this.anInt244 = 1;
			}
			if (this.anInt244 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
				this.anInt244 = 0;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("11937, " + false + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method147() {
		try {
			this.anInt405 += 0;
			if (aBoolean65 && this.anInt323 == 2 && Class4.anInt170 != this.anInt391) {
				this.aClass37_23.method599();
				this.aClass1_Sub1_Sub2_Sub4_2.method469(151, 257, "Loading - please wait.", 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method469(150, 256, "Loading - please wait.", 16777215);
				this.aClass37_23.method600(4, super.aGraphics2, 4);
				this.anInt323 = 1;
				this.aLong14 = System.currentTimeMillis();
			}
			if (this.anInt323 == 1) {
				@Pc(58) int local58 = this.method148(this.aByte12);
				if (local58 != 0 && System.currentTimeMillis() - this.aLong14 > 360000L) {
					signlink.reporterror(this.aString6 + " glcfb " + this.aLong17 + "," + local58 + "," + aBoolean65 + "," + this.aClass46Array1[0] + "," + this.aClass45_Sub1_1.method670() + "," + this.anInt391 + "," + this.anInt317 + "," + this.anInt318);
					this.aLong14 = System.currentTimeMillis();
				}
			}
			if (this.anInt323 == 2 && this.anInt391 != this.anInt347) {
				this.anInt347 = this.anInt391;
				this.method208(this.anInt391);
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("85180, " + 0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)I")
	private int method148(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray1.length; local3++) {
				if (this.aByteArrayArray1[local3] == null && this.anIntArray31[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray2[local3] == null && this.anIntArray32[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray1.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray2[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray30[local41] >> 8) * 64 - this.anInt356;
					@Pc(74) int local74 = (this.anIntArray30[local41] & 0xFF) * 64 - this.anInt357;
					local39 &= Class4.method54(local48, local74, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean72) {
				return -4;
			} else {
				this.anInt323 = 2;
				Class4.anInt170 = this.anInt391;
				this.method124();
				if (arg0 != 8) {
					aBoolean68 = !aBoolean68;
				}
				this.aClass1_Sub1_Sub3_3.method492(134);
				return 0;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("9560, " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method149(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean73) {
					this.aBoolean73 = false;
					this.aBoolean70 = true;
				}
				@Pc(18) int local18 = this.anIntArray56[arg0];
				@Pc(23) int local23 = this.anIntArray57[arg0];
				@Pc(28) int local28 = this.anIntArray58[arg0];
				@Pc(33) int local33 = this.anIntArray59[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(45) String local45;
				@Pc(49) int local49;
				@Pc(60) long local60;
				@Pc(62) int local62;
				if (local28 == 902) {
					local45 = this.aStringArray4[arg0];
					local49 = local45.indexOf("@whi@");
					if (local49 != -1) {
						local60 = Class49.method700(local45.substring(local49 + 5).trim());
						local62 = -1;
						for (@Pc(64) int local64 = 0; local64 < this.anInt380; local64++) {
							if (this.aLongArray3[local64] == local60) {
								local62 = local64;
								break;
							}
						}
						if (local62 != -1 && this.anIntArray66[local62] > 0) {
							this.aBoolean70 = true;
							this.aBoolean73 = false;
							this.aBoolean79 = true;
							this.aString9 = "";
							this.anInt341 = 3;
							this.aLong16 = this.aLongArray3[local62];
							this.aString15 = "Enter message to send to " + this.aStringArray6[local62];
						}
					}
				}
				if (local28 == 357) {
					this.method206(local23, local33, 87, local18);
				}
				if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
					if (local28 == 555) {
						this.aClass1_Sub1_Sub3_3.method492(59);
					}
					if (local28 == 354) {
						this.aClass1_Sub1_Sub3_3.method492(62);
					}
					if (local28 == 113) {
						this.aClass1_Sub1_Sub3_3.method492(70);
					}
					if (local28 == 582) {
						if ((local33 & 0x3) == 0) {
							anInt219++;
						}
						if (anInt219 >= 133) {
							this.aClass1_Sub1_Sub3_3.method492(131);
							this.aClass1_Sub1_Sub3_3.method494(6118);
						}
						this.aClass1_Sub1_Sub3_3.method492(181);
					}
					if (local28 == 331) {
						this.aClass1_Sub1_Sub3_3.method492(160);
					}
					this.aClass1_Sub1_Sub3_3.method494(local33);
					this.aClass1_Sub1_Sub3_3.method494(local18);
					this.aClass1_Sub1_Sub3_3.method494(local23);
					this.anInt367 = 0;
					this.anInt368 = local23;
					this.anInt369 = local18;
					this.anInt370 = 2;
					if (Class6.aClass6Array1[local23].anInt424 == this.anInt210) {
						this.anInt370 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt424 == this.anInt223) {
						this.anInt370 = 3;
					}
				}
				if (local28 == 899 && this.method206(local23, local33, 26, local18)) {
					this.aClass1_Sub1_Sub3_3.method494(this.anInt302);
				}
				@Pc(289) Class1_Sub1_Sub1_Sub1_Sub1 local289;
				if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
					local289 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local289 != null) {
						this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local289.anIntArray284[0], false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local289.anIntArray285[0], 1, 1, 0, 2);
						this.anInt256 = super.anInt200;
						this.anInt257 = super.anInt201;
						this.anInt259 = 2;
						this.anInt258 = 0;
						if (local28 == 185) {
							this.aClass1_Sub1_Sub3_3.method492(230);
						}
						if (local28 == 387) {
							anInt247 += local33;
							if (anInt247 >= 66) {
								this.aClass1_Sub1_Sub3_3.method492(233);
								this.aClass1_Sub1_Sub3_3.method493(154);
							}
							this.aClass1_Sub1_Sub3_3.method492(72);
						}
						if (local28 == 27) {
							this.aClass1_Sub1_Sub3_3.method492(18);
						}
						if (local28 == 499) {
							this.aClass1_Sub1_Sub3_3.method492(17);
						}
						if (local28 == 639) {
							anInt316++;
							if (anInt316 >= 52) {
								this.aClass1_Sub1_Sub3_3.method492(121);
								this.aClass1_Sub1_Sub3_3.method493(131);
							}
							this.aClass1_Sub1_Sub3_3.method492(192);
						}
						this.aClass1_Sub1_Sub3_3.method494(local33);
					}
				}
				@Pc(416) Class1_Sub1_Sub1_Sub1_Sub2 local416;
				if (local28 == 829) {
					local416 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local416 != null) {
						this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local416.anIntArray284[0], false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local416.anIntArray285[0], 1, 1, 0, 2);
						this.anInt256 = super.anInt200;
						this.anInt257 = super.anInt201;
						this.anInt259 = 2;
						this.anInt258 = 0;
						this.aClass1_Sub1_Sub3_3.method492(119);
						this.aClass1_Sub1_Sub3_3.method494(local33);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt284);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt282);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt283);
					}
				}
				@Pc(489) Class17 local489;
				@Pc(516) String local516;
				if (local28 == 1328) {
					local489 = Class17.method385(local33);
					@Pc(493) Class6 local493 = Class6.aClass6Array1[local23];
					if (local493 != null && local493.anIntArray93[local18] >= 100000) {
						local516 = local493.anIntArray93[local18] + " x " + local489.aString25;
					} else if (local489.aByteArray6 == null) {
						local516 = "It's a " + local489.aString25 + ".";
					} else {
						local516 = new String(local489.aByteArray6);
					}
					this.method205(local516, "", 0);
				}
				if (local28 == 102) {
					this.anInt281 = 1;
					this.anInt282 = local18;
					this.anInt283 = local23;
					this.anInt284 = local33;
					this.aString8 = Class17.method385(local33).aString25;
					this.anInt301 = 0;
					this.aBoolean78 = true;
				} else {
					if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
						local416 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local416 != null) {
							this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local416.anIntArray284[0], false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local416.anIntArray285[0], 1, 1, 0, 2);
							this.anInt256 = super.anInt200;
							this.anInt257 = super.anInt201;
							this.anInt259 = 2;
							this.anInt258 = 0;
							if (local28 == 852) {
								this.aClass1_Sub1_Sub3_3.method492(122);
							}
							if (local28 == 242) {
								this.aClass1_Sub1_Sub3_3.method492(143);
							}
							if (local28 == 309) {
								this.aClass1_Sub1_Sub3_3.method492(69);
							}
							if (local28 == 793) {
								this.aClass1_Sub1_Sub3_3.method492(118);
							}
							if (local28 == 209) {
								this.aClass1_Sub1_Sub3_3.method492(195);
							}
							this.aClass1_Sub1_Sub3_3.method494(local33);
						}
					}
					if (local28 == 718) {
						if (this.aBoolean51) {
							this.aClass36_1.method586(local23 - 4, local18 - 4, this.anInt371);
						} else {
							this.aClass36_1.method586(super.anInt201 - 4, super.anInt200 - 4, this.anInt371);
						}
					}
					if (local28 == 743) {
						anInt351++;
						if (anInt351 >= 124) {
							this.aClass1_Sub1_Sub3_3.method492(77);
							this.aClass1_Sub1_Sub3_3.method494(37954);
						}
						this.method206(local23, local33, 98, local18);
					}
					@Pc(775) boolean local775;
					if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
						local775 = this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local18, false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local23, 0, 0, 0, 2);
						if (!local775) {
							this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local18, false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local23, 1, 1, 0, 2);
						}
						this.anInt256 = super.anInt200;
						this.anInt257 = super.anInt201;
						this.anInt259 = 2;
						this.anInt258 = 0;
						if (local28 == 662) {
							anInt224 += this.anInt357;
							if (anInt224 >= 118) {
								this.aClass1_Sub1_Sub3_3.method492(56);
								this.aClass1_Sub1_Sub3_3.method497(0);
							}
							this.aClass1_Sub1_Sub3_3.method492(97);
						}
						if (local28 == 617) {
							this.aClass1_Sub1_Sub3_3.method492(178);
						}
						if (local28 == 139) {
							if ((local18 & 0x3) == 0) {
								anInt211++;
							}
							if (anInt211 >= 123) {
								this.aClass1_Sub1_Sub3_3.method492(187);
								this.aClass1_Sub1_Sub3_3.method497(0);
							}
							this.aClass1_Sub1_Sub3_3.method492(141);
						}
						if (local28 == 224) {
							anInt362 += local23;
							if (anInt362 >= 75) {
								this.aClass1_Sub1_Sub3_3.method492(206);
								this.aClass1_Sub1_Sub3_3.method493(19);
							}
							this.aClass1_Sub1_Sub3_3.method492(47);
						}
						if (local28 == 778) {
							this.aClass1_Sub1_Sub3_3.method492(67);
						}
						this.aClass1_Sub1_Sub3_3.method494(local18 + this.anInt356);
						this.aClass1_Sub1_Sub3_3.method494(local23 + this.anInt357);
						this.aClass1_Sub1_Sub3_3.method494(local33);
					}
					@Pc(939) Class6 local939;
					if (local28 == 225) {
						this.aClass1_Sub1_Sub3_3.method492(244);
						this.aClass1_Sub1_Sub3_3.method494(local23);
						local939 = Class6.aClass6Array1[local23];
						if (local939.anIntArrayArray7 != null && local939.anIntArrayArray7[0][0] == 5) {
							local49 = local939.anIntArrayArray7[0][1];
							if (this.anIntArray75[local49] != local939.anIntArray95[0]) {
								this.anIntArray75[local49] = local939.anIntArray95[0];
								this.method142(local49, 108);
								this.aBoolean78 = true;
							}
						}
					}
					if (local28 == 398) {
						this.aClass1_Sub1_Sub3_3.method492(200);
						this.aClass1_Sub1_Sub3_3.method494(local33);
						this.aClass1_Sub1_Sub3_3.method494(local18);
						this.aClass1_Sub1_Sub3_3.method494(local23);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt284);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt282);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt283);
						this.anInt367 = 0;
						this.anInt368 = local23;
						this.anInt369 = local18;
						this.anInt370 = 2;
						if (Class6.aClass6Array1[local23].anInt424 == this.anInt210) {
							this.anInt370 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt424 == this.anInt223) {
							this.anInt370 = 3;
						}
					}
					@Pc(1069) String local1069;
					if (local28 == 1381) {
						@Pc(1057) int local1057 = local33 >> 14 & 0x7FFF;
						@Pc(1060) Class11 local1060 = Class11.method292(local1057);
						if (local1060.aByteArray4 == null) {
							local1069 = "It's a " + local1060.aString23 + ".";
						} else {
							local1069 = new String(local1060.aByteArray4);
						}
						this.method205(local1069, "", 0);
					}
					if (local28 == 997 && !this.aBoolean59) {
						this.aClass1_Sub1_Sub3_3.method492(146);
						this.aClass1_Sub1_Sub3_3.method494(local23);
						this.aBoolean59 = true;
					}
					if (local28 == 507 || local28 == 957) {
						local45 = this.aStringArray4[arg0];
						local49 = local45.indexOf("@whi@");
						if (local49 != -1) {
							local45 = local45.substring(local49 + 5).trim();
							local1069 = Class49.method704(Class49.method701(586, Class49.method700(local45)));
							@Pc(1140) boolean local1140 = false;
							for (local62 = 0; local62 < this.anInt242; local62++) {
								@Pc(1152) Class1_Sub1_Sub1_Sub1_Sub1 local1152 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray47[local62]];
								if (local1152 != null && local1152.aString3 != null && local1152.aString3.equalsIgnoreCase(local1069)) {
									this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local1152.anIntArray284[0], false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local1152.anIntArray285[0], 1, 1, 0, 2);
									if (local28 == 507) {
										anInt247 += local33;
										if (anInt247 >= 66) {
											this.aClass1_Sub1_Sub3_3.method492(233);
											this.aClass1_Sub1_Sub3_3.method493(154);
										}
										this.aClass1_Sub1_Sub3_3.method492(72);
									}
									if (local28 == 957) {
										anInt316++;
										if (anInt316 >= 52) {
											this.aClass1_Sub1_Sub3_3.method492(121);
											this.aClass1_Sub1_Sub3_3.method493(131);
										}
										this.aClass1_Sub1_Sub3_3.method492(192);
									}
									this.aClass1_Sub1_Sub3_3.method494(this.anIntArray47[local62]);
									local1140 = true;
									break;
								}
							}
							if (!local1140) {
								this.method205("Unable to find " + local1069, "", 0);
							}
						}
					}
					if (local28 == 737) {
						this.method119();
					}
					if (local28 == 563) {
						this.aClass1_Sub1_Sub3_3.method492(102);
						this.aClass1_Sub1_Sub3_3.method494(local33);
						this.aClass1_Sub1_Sub3_3.method494(local18);
						this.aClass1_Sub1_Sub3_3.method494(local23);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt302);
						this.anInt367 = 0;
						this.anInt368 = local23;
						this.anInt369 = local18;
						this.anInt370 = 2;
						if (Class6.aClass6Array1[local23].anInt424 == this.anInt210) {
							this.anInt370 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt424 == this.anInt223) {
							this.anInt370 = 3;
						}
					}
					if (local28 == 1714) {
						local416 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local416 != null) {
							if (local416.aClass15_2.aByteArray5 == null) {
								local516 = "It's a " + local416.aClass15_2.aString24 + ".";
							} else {
								local516 = new String(local416.aClass15_2.aByteArray5);
							}
							this.method205(local516, "", 0);
						}
					}
					if (local28 == 131) {
						local289 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local289 != null) {
							this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local289.anIntArray284[0], false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local289.anIntArray285[0], 1, 1, 0, 2);
							this.anInt256 = super.anInt200;
							this.anInt257 = super.anInt201;
							this.anInt259 = 2;
							this.anInt258 = 0;
							this.aClass1_Sub1_Sub3_3.method492(68);
							this.aClass1_Sub1_Sub3_3.method494(local33);
							this.aClass1_Sub1_Sub3_3.method494(this.anInt302);
						}
					}
					if (local28 == 524) {
						local45 = this.aStringArray4[arg0];
						local49 = local45.indexOf("@whi@");
						if (local49 != -1) {
							this.method119();
							this.aString13 = local45.substring(local49 + 5).trim();
							this.aBoolean62 = false;
							for (@Pc(1467) int local1467 = 0; local1467 < Class6.aClass6Array1.length; local1467++) {
								if (Class6.aClass6Array1[local1467] != null && Class6.aClass6Array1[local1467].anInt427 == 600) {
									this.anInt296 = this.anInt210 = Class6.aClass6Array1[local1467].anInt424;
									break;
								}
							}
						}
					}
					if (local28 == 240) {
						local416 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local416 != null) {
							this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local416.anIntArray284[0], false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local416.anIntArray285[0], 1, 1, 0, 2);
							this.anInt256 = super.anInt200;
							this.anInt257 = super.anInt201;
							this.anInt259 = 2;
							this.anInt258 = 0;
							this.aClass1_Sub1_Sub3_3.method492(231);
							this.aClass1_Sub1_Sub3_3.method494(local33);
							this.aClass1_Sub1_Sub3_3.method494(this.anInt302);
						}
					}
					if (local28 == 111) {
						local775 = this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local18, false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local23, 0, 0, 0, 2);
						if (!local775) {
							this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local18, false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local23, 1, 1, 0, 2);
						}
						this.anInt256 = super.anInt200;
						this.anInt257 = super.anInt201;
						this.anInt259 = 2;
						this.anInt258 = 0;
						this.aClass1_Sub1_Sub3_3.method492(245);
						this.aClass1_Sub1_Sub3_3.method494(local18 + this.anInt356);
						this.aClass1_Sub1_Sub3_3.method494(local23 + this.anInt357);
						this.aClass1_Sub1_Sub3_3.method494(local33);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt284);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt282);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt283);
					}
					if (local28 == 1152) {
						local489 = Class17.method385(local33);
						if (local489.aByteArray6 == null) {
							local516 = "It's a " + local489.aString25 + ".";
						} else {
							local516 = new String(local489.aByteArray6);
						}
						this.method205(local516, "", 0);
					}
					if (local28 == 721) {
						anInt389 += local23;
						if (anInt389 >= 139) {
							this.aClass1_Sub1_Sub3_3.method492(28);
							this.aClass1_Sub1_Sub3_3.method497(0);
						}
						this.method206(local23, local33, 213, local18);
					}
					if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
						if (local28 == 100) {
							this.aClass1_Sub1_Sub3_3.method492(74);
						}
						if (local28 == 962) {
							this.aClass1_Sub1_Sub3_3.method492(228);
						}
						if (local28 == 681) {
							anInt312++;
							if (anInt312 >= 116) {
								this.aClass1_Sub1_Sub3_3.method492(162);
								this.aClass1_Sub1_Sub3_3.method496(13018169);
							}
							this.aClass1_Sub1_Sub3_3.method492(163);
						}
						if (local28 == 694) {
							this.aClass1_Sub1_Sub3_3.method492(243);
						}
						if (local28 == 795) {
							this.aClass1_Sub1_Sub3_3.method492(80);
						}
						this.aClass1_Sub1_Sub3_3.method494(local33);
						this.aClass1_Sub1_Sub3_3.method494(local18);
						this.aClass1_Sub1_Sub3_3.method494(local23);
						this.anInt367 = 0;
						this.anInt368 = local23;
						this.anInt369 = local18;
						this.anInt370 = 2;
						if (Class6.aClass6Array1[local23].anInt424 == this.anInt210) {
							this.anInt370 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt424 == this.anInt223) {
							this.anInt370 = 3;
						}
					}
					if (local28 == 435) {
						this.aClass1_Sub1_Sub3_3.method492(244);
						this.aClass1_Sub1_Sub3_3.method494(local23);
						local939 = Class6.aClass6Array1[local23];
						if (local939.anIntArrayArray7 != null && local939.anIntArrayArray7[0][0] == 5) {
							local49 = local939.anIntArrayArray7[0][1];
							this.anIntArray75[local49] = 1 - this.anIntArray75[local49];
							this.method142(local49, 108);
							this.aBoolean78 = true;
						}
					}
					if (local28 == 275) {
						local289 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local289 != null) {
							this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local289.anIntArray284[0], false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local289.anIntArray285[0], 1, 1, 0, 2);
							this.anInt256 = super.anInt200;
							this.anInt257 = super.anInt201;
							this.anInt259 = 2;
							this.anInt258 = 0;
							this.aClass1_Sub1_Sub3_3.method492(113);
							this.aClass1_Sub1_Sub3_3.method494(local33);
							this.aClass1_Sub1_Sub3_3.method494(this.anInt284);
							this.aClass1_Sub1_Sub3_3.method494(this.anInt282);
							this.aClass1_Sub1_Sub3_3.method494(this.anInt283);
						}
					}
					if (local28 == 1071) {
						this.method206(local23, local33, 147, local18);
					}
					if (local28 == 625) {
						this.method206(local23, local33, 33, local18);
					}
					if (local28 == 231) {
						local939 = Class6.aClass6Array1[local23];
						@Pc(1992) boolean local1992 = true;
						if (local939.anInt427 > 0) {
							local1992 = this.method105(76, local939);
						}
						if (local1992) {
							this.aClass1_Sub1_Sub3_3.method492(244);
							this.aClass1_Sub1_Sub3_3.method494(local23);
						}
					}
					if (local28 == 810 && this.method206(local23, local33, 240, local18)) {
						this.aClass1_Sub1_Sub3_3.method494(this.anInt284);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt282);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt283);
					}
					if (local28 == 274) {
						local939 = Class6.aClass6Array1[local23];
						this.anInt301 = 1;
						this.anInt302 = local23;
						this.anInt303 = local939.anInt451;
						this.anInt281 = 0;
						this.aBoolean78 = true;
						local516 = local939.aString20;
						if (local516.indexOf(" ") != -1) {
							local516 = local516.substring(0, local516.indexOf(" "));
						}
						local1069 = local939.aString20;
						if (local1069.indexOf(" ") != -1) {
							local1069 = local1069.substring(local1069.indexOf(" ") + 1);
						}
						this.aString12 = local516 + " " + local939.aString21 + " " + local1069;
						if (this.anInt303 == 16) {
							this.aBoolean78 = true;
							this.anInt297 = 3;
							this.aBoolean69 = true;
						}
					} else {
						if (local28 == 370) {
							local775 = this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local18, false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local23, 0, 0, 0, 2);
							if (!local775) {
								this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local18, false, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local23, 1, 1, 0, 2);
							}
							this.anInt256 = super.anInt200;
							this.anInt257 = super.anInt201;
							this.anInt259 = 2;
							this.anInt258 = 0;
							this.aClass1_Sub1_Sub3_3.method492(202);
							this.aClass1_Sub1_Sub3_3.method494(local18 + this.anInt356);
							this.aClass1_Sub1_Sub3_3.method494(local23 + this.anInt357);
							this.aClass1_Sub1_Sub3_3.method494(local33);
							this.aClass1_Sub1_Sub3_3.method494(this.anInt302);
						}
						if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
							local45 = this.aStringArray4[arg0];
							local49 = local45.indexOf("@whi@");
							if (local49 != -1) {
								local60 = Class49.method700(local45.substring(local49 + 5).trim());
								if (local28 == 605) {
									this.method97(local60);
								}
								if (local28 == 47) {
									this.method126(local60);
								}
								if (local28 == 513) {
									this.method109((byte) 8, local60);
								}
								if (local28 == 884) {
									this.method138(local60);
								}
							}
						}
						this.anInt281 = 0;
						this.anInt301 = 0;
						this.aBoolean78 = true;
					}
				}
			}
		} catch (@Pc(2287) RuntimeException local2287) {
			signlink.reporterror("71727, " + arg0 + ", " + false + ", " + local2287.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method150(@OriginalArg(0) Class6 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 9) {
				throw new NullPointerException();
			} else if (arg0.anIntArray94 == null) {
				return false;
			} else {
				for (@Pc(13) int local13 = 0; local13 < arg0.anIntArray94.length; local13++) {
					@Pc(21) int local21 = this.method201(arg0, (byte) 5, local13);
					@Pc(26) int local26 = arg0.anIntArray95[local13];
					if (arg0.anIntArray94[local13] == 2) {
						if (local21 >= local26) {
							return false;
						}
					} else if (arg0.anIntArray94[local13] == 3) {
						if (local21 <= local26) {
							return false;
						}
					} else if (arg0.anIntArray94[local13] == 4) {
						if (local21 == local26) {
							return false;
						}
					} else if (local21 != local26) {
						return false;
					}
				}
				return true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("50344, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Z")
	private boolean method151(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray58[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("34930, " + -89 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!ib;I)V")
	private void method152(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(29) int local29 = this.anInt332 + this.anInt349 & 0x7FF;
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray139[local29];
				@Pc(37) int local37 = Class1_Sub1_Sub1_Sub5.anIntArray140[local29];
				@Pc(46) int local46 = local33 * 256 / (this.anInt360 + 256);
				@Pc(55) int local55 = local37 * 256 / (this.anInt360 + 256);
				@Pc(65) int local65 = arg0 * local46 + arg2 * local55 >> 16;
				@Pc(75) int local75 = arg0 * local55 - arg2 * local46 >> 16;
				@Pc(81) double local81 = Math.atan2((double) local65, (double) local75);
				@Pc(87) int local87 = (int) (Math.sin(local81) * 63.0D);
				@Pc(93) int local93 = (int) (Math.cos(local81) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_5.method380(local81, 83 - local93 - 20, local87 + 94 + 4 - 10);
			} else {
				this.method216(arg0, arg1, arg2);
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("13124, " + -63 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
	private int method153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("78890, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!mb;I)V")
	private void method154(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method513();
			@Pc(13) int local13 = arg0.method514(8, this.anInt275);
			@Pc(19) int local19;
			if (local13 < this.anInt217) {
				for (local19 = local13; local19 < this.anInt217; local19++) {
					this.anIntArray70[this.anInt320++] = this.anIntArray41[local19];
				}
			}
			if (local13 > this.anInt217) {
				signlink.reporterror(this.aString6 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt217 = 0;
			for (local19 = 0; local19 < local13; local19++) {
				@Pc(71) int local71 = this.anIntArray41[local19];
				@Pc(76) Class1_Sub1_Sub1_Sub1_Sub2 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
				@Pc(82) int local82 = arg0.method514(1, this.anInt275);
				if (local82 == 0) {
					this.anIntArray41[this.anInt217++] = local71;
					local76.anInt1034 = anInt209;
				} else {
					@Pc(106) int local106 = arg0.method514(2, this.anInt275);
					if (local106 == 0) {
						this.anIntArray41[this.anInt217++] = local71;
						local76.anInt1034 = anInt209;
						this.anIntArray48[this.anInt243++] = local71;
					} else {
						@Pc(158) int local158;
						@Pc(169) int local169;
						if (local106 == 1) {
							this.anIntArray41[this.anInt217++] = local71;
							local76.anInt1034 = anInt209;
							local158 = arg0.method514(3, this.anInt275);
							local76.method695(local158, false);
							local169 = arg0.method514(1, this.anInt275);
							if (local169 == 1) {
								this.anIntArray48[this.anInt243++] = local71;
							}
						} else if (local106 == 2) {
							this.anIntArray41[this.anInt217++] = local71;
							local76.anInt1034 = anInt209;
							local158 = arg0.method514(3, this.anInt275);
							local76.method695(local158, true);
							local169 = arg0.method514(3, this.anInt275);
							local76.method695(local169, true);
							@Pc(230) int local230 = arg0.method514(1, this.anInt275);
							if (local230 == 1) {
								this.anIntArray48[this.anInt243++] = local71;
							}
						} else if (local106 == 3) {
							this.anIntArray70[this.anInt320++] = local71;
						}
					}
				}
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("69122, " + false + ", " + arg0 + ", " + arg1 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;IIII)V")
	private void method155(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != this.anInt313) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (this.anInt308 < 400) {
				@Pc(20) String local20 = arg0.aString24;
				if (arg0.anInt589 != 0) {
					local20 = local20 + method183(arg0.anInt589, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129, this.anInt218) + " (level-" + arg0.anInt589 + ")";
				}
				if (this.anInt281 == 1) {
					this.aStringArray4[this.anInt308] = "Use " + this.aString8 + " with @yel@" + local20;
					this.anIntArray58[this.anInt308] = 829;
					this.anIntArray59[this.anInt308] = arg1;
					this.anIntArray56[this.anInt308] = arg4;
					this.anIntArray57[this.anInt308] = arg2;
					this.anInt308++;
				} else if (this.anInt301 != 1) {
					@Pc(159) int local159;
					if (arg0.aStringArray9 != null) {
						for (local159 = 4; local159 >= 0; local159--) {
							if (arg0.aStringArray9[local159] != null && !arg0.aStringArray9[local159].equalsIgnoreCase("attack")) {
								this.aStringArray4[this.anInt308] = arg0.aStringArray9[local159] + " @yel@" + local20;
								if (local159 == 0) {
									this.anIntArray58[this.anInt308] = 242;
								}
								if (local159 == 1) {
									this.anIntArray58[this.anInt308] = 209;
								}
								if (local159 == 2) {
									this.anIntArray58[this.anInt308] = 309;
								}
								if (local159 == 3) {
									this.anIntArray58[this.anInt308] = 852;
								}
								if (local159 == 4) {
									this.anIntArray58[this.anInt308] = 793;
								}
								this.anIntArray59[this.anInt308] = arg1;
								this.anIntArray56[this.anInt308] = arg4;
								this.anIntArray57[this.anInt308] = arg2;
								this.anInt308++;
							}
						}
					}
					if (arg0.aStringArray9 != null) {
						for (local159 = 4; local159 >= 0; local159--) {
							if (arg0.aStringArray9[local159] != null && arg0.aStringArray9[local159].equalsIgnoreCase("attack")) {
								@Pc(283) short local283 = 0;
								if (arg0.anInt589 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129) {
									local283 = 2000;
								}
								this.aStringArray4[this.anInt308] = arg0.aStringArray9[local159] + " @yel@" + local20;
								if (local159 == 0) {
									this.anIntArray58[this.anInt308] = local283 + 242;
								}
								if (local159 == 1) {
									this.anIntArray58[this.anInt308] = local283 + 209;
								}
								if (local159 == 2) {
									this.anIntArray58[this.anInt308] = local283 + 309;
								}
								if (local159 == 3) {
									this.anIntArray58[this.anInt308] = local283 + 852;
								}
								if (local159 == 4) {
									this.anIntArray58[this.anInt308] = local283 + 793;
								}
								this.anIntArray59[this.anInt308] = arg1;
								this.anIntArray56[this.anInt308] = arg4;
								this.anIntArray57[this.anInt308] = arg2;
								this.anInt308++;
							}
						}
					}
					this.aStringArray4[this.anInt308] = "Examine @yel@" + local20;
					this.anIntArray58[this.anInt308] = 1714;
					this.anIntArray59[this.anInt308] = arg1;
					this.anIntArray56[this.anInt308] = arg4;
					this.anIntArray57[this.anInt308] = arg2;
					this.anInt308++;
				} else if ((this.anInt303 & 0x2) == 2) {
					this.aStringArray4[this.anInt308] = this.aString12 + " @yel@" + local20;
					this.anIntArray58[this.anInt308] = 240;
					this.anIntArray59[this.anInt308] = arg1;
					this.anIntArray56[this.anInt308] = arg4;
					this.anIntArray57[this.anInt308] = arg2;
					this.anInt308++;
					return;
				}
			}
		} catch (@Pc(433) RuntimeException local433) {
			signlink.reporterror("57341, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local433.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZII)V")
	private void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_3.method534(); local6 != null; local6 = (Class1_Sub2) this.aClass31_3.method536(633)) {
				if (local6.anInt793 == arg8 && local6.anInt795 == arg4 && local6.anInt796 == arg3 && local6.anInt794 == arg6) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt793 = arg8;
				local1.anInt794 = arg6;
				local1.anInt795 = arg4;
				local1.anInt796 = arg3;
				this.method143(local1);
				this.aClass31_3.method531(local1);
			}
			local1.anInt800 = arg0;
			local1.anInt802 = arg5;
			local1.anInt801 = arg7;
			local1.anInt803 = arg2;
			local1.anInt804 = arg1;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("90190, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + arg8 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method157() {
		try {
			if (this.anInt238 > 1) {
				this.anInt238--;
			}
			if (this.anInt409 > 0) {
				this.anInt409--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method170(); local22++) {
			}
			if (this.aBoolean81) {
				@Pc(41) Object local41 = this.aClass13_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass13_1.anObject1) {
					if (!aBoolean41) {
						this.aClass13_1.anInt549 = 0;
					} else if (super.anInt199 != 0 || this.aClass13_1.anInt549 >= 40) {
						this.aClass1_Sub1_Sub3_3.method492(232);
						this.aClass1_Sub1_Sub3_3.method493(0);
						local66 = this.aClass1_Sub1_Sub3_3.anInt766;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass13_1.anInt549 && local66 - this.aClass1_Sub1_Sub3_3.anInt766 < 240; local70++) {
							local68++;
							local86 = this.aClass13_1.anIntArray166[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass13_1.anIntArray165[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass13_1.anIntArray166[local70] == -1 && this.aClass13_1.anIntArray165[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt252 || local86 != this.anInt253) {
								@Pc(165) int local165 = local103 - this.anInt252;
								this.anInt252 = local103;
								@Pc(173) int local173 = local86 - this.anInt253;
								this.anInt253 = local86;
								if (this.anInt232 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_3.method494((this.anInt232 << 12) + (local165 << 6) + local173);
									this.anInt232 = 0;
								} else if (this.anInt232 < 8) {
									this.aClass1_Sub1_Sub3_3.method496((this.anInt232 << 19) + local120 + 8388608);
									this.anInt232 = 0;
								} else {
									this.aClass1_Sub1_Sub3_3.method497((this.anInt232 << 19) + local120 - 1073741824);
									this.anInt232 = 0;
								}
							} else if (this.anInt232 < 2047) {
								this.anInt232++;
							}
						}
						this.aClass1_Sub1_Sub3_3.method502(this.aClass1_Sub1_Sub3_3.anInt766 - local66);
						if (local68 >= this.aClass13_1.anInt549) {
							this.aClass13_1.anInt549 = 0;
						} else {
							this.aClass13_1.anInt549 -= local68;
							for (local86 = 0; local86 < this.aClass13_1.anInt549; local86++) {
								this.aClass13_1.anIntArray165[local86] = this.aClass13_1.anIntArray165[local86 + local68];
								this.aClass13_1.anIntArray166[local86] = this.aClass13_1.anIntArray166[local86 + local68];
							}
						}
					}
				}
				if (super.anInt199 != 0) {
					@Pc(336) long local336 = (super.aLong13 - this.aLong18) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong18 = super.aLong13;
					local66 = super.anInt201;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt200;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt199 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_3.method492(234);
					this.aClass1_Sub1_Sub3_3.method497((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt272 > 0) {
					this.anInt272--;
				}
				if (super.anIntArray28[1] == 1 || super.anIntArray28[2] == 1 || super.anIntArray28[3] == 1 || super.anIntArray28[4] == 1) {
					this.aBoolean52 = true;
				}
				if (this.aBoolean52 && this.anInt272 <= 0) {
					this.anInt272 = 20;
					this.aBoolean52 = false;
					this.aClass1_Sub1_Sub3_3.method492(91);
					this.aClass1_Sub1_Sub3_3.method494(this.anInt331);
					this.aClass1_Sub1_Sub3_3.method494(this.anInt332);
				}
				if (super.aBoolean38 && !this.aBoolean58) {
					this.aBoolean58 = true;
					this.aClass1_Sub1_Sub3_3.method492(8);
					this.aClass1_Sub1_Sub3_3.method493(1);
				}
				if (!super.aBoolean38 && this.aBoolean58) {
					this.aBoolean58 = false;
					this.aClass1_Sub1_Sub3_3.method492(8);
					this.aClass1_Sub1_Sub3_3.method493(0);
				}
				this.method147();
				this.method195((byte) 9);
				this.method128();
				this.anInt407++;
				if (this.anInt407 > 750) {
					this.method115();
				}
				this.method144();
				this.method158();
				this.method125();
				this.anInt255++;
				if (this.anInt259 != 0) {
					this.anInt258 += 20;
					if (this.anInt258 >= 400) {
						this.anInt259 = 0;
					}
				}
				if (this.anInt370 != 0) {
					this.anInt367++;
					if (this.anInt367 >= 15) {
						if (this.anInt370 == 2) {
							this.aBoolean78 = true;
						}
						if (this.anInt370 == 3) {
							this.aBoolean70 = true;
						}
						this.anInt370 = 0;
					}
				}
				if (this.anInt376 != 0) {
					this.anInt269++;
					if (super.anInt194 > this.anInt377 + 5 || super.anInt194 < this.anInt377 - 5 || super.anInt195 > this.anInt378 + 5 || super.anInt195 < this.anInt378 - 5) {
						this.aBoolean80 = true;
					}
					if (super.anInt193 == 0) {
						if (this.anInt376 == 2) {
							this.aBoolean78 = true;
						}
						if (this.anInt376 == 3) {
							this.aBoolean70 = true;
						}
						this.anInt376 = 0;
						if (this.aBoolean80 && this.anInt269 >= 5) {
							this.anInt237 = -1;
							this.method210();
							if (this.anInt237 == this.anInt374 && this.anInt236 != this.anInt375) {
								@Pc(682) Class6 local682 = Class6.aClass6Array1[this.anInt374];
								@Pc(684) byte local684 = 0;
								if (this.anInt254 == 1 && local682.anInt427 == 206) {
									local684 = 1;
								}
								if (local682.anIntArray92[this.anInt236] <= 0) {
									local684 = 0;
								}
								if (local682.aBoolean89) {
									local66 = this.anInt375;
									local68 = this.anInt236;
									local682.anIntArray92[local68] = local682.anIntArray92[local66];
									local682.anIntArray93[local68] = local682.anIntArray93[local66];
									local682.anIntArray92[local66] = -1;
									local682.anIntArray93[local66] = 0;
								} else if (local684 == 1) {
									local66 = this.anInt375;
									local68 = this.anInt236;
									while (local66 != local68) {
										if (local66 > local68) {
											local682.method225(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local682.method225(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local682.method225(this.anInt236, this.anInt375);
								}
								this.aClass1_Sub1_Sub3_3.method492(176);
								this.aClass1_Sub1_Sub3_3.method494(this.anInt374);
								this.aClass1_Sub1_Sub3_3.method494(this.anInt375);
								this.aClass1_Sub1_Sub3_3.method494(this.anInt236);
								this.aClass1_Sub1_Sub3_3.method493(local684);
							}
						} else if ((this.anInt307 == 1 || this.method151(this.anInt308 - 1)) && this.anInt308 > 2) {
							this.method134();
						} else if (this.anInt308 > 0) {
							this.method149(this.anInt308 - 1);
						}
						this.anInt367 = 10;
						super.anInt199 = 0;
					}
				}
				anInt225++;
				if (anInt225 > 62) {
					anInt225 = 0;
					this.aClass1_Sub1_Sub3_3.method492(182);
				}
				@Pc(868) int local868;
				@Pc(870) int local870;
				if (Class36.anInt877 != -1) {
					local868 = Class36.anInt877;
					local870 = Class36.anInt878;
					@Pc(891) boolean local891 = this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local868, true, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local870, 0, 0, 0, 0);
					Class36.anInt877 = -1;
					if (local891) {
						this.anInt256 = super.anInt200;
						this.anInt257 = super.anInt201;
						this.anInt259 = 1;
						this.anInt258 = 0;
					}
				}
				if (super.anInt199 == 1 && this.aString4 != null) {
					this.aString4 = null;
					this.aBoolean70 = true;
					super.anInt199 = 0;
				}
				this.method166(656);
				this.method173();
				this.method92();
				this.method220();
				if (super.anInt193 == 1 || super.anInt199 == 1) {
					this.anInt220++;
				}
				if (this.anInt323 == 2) {
					this.method196();
				}
				if (this.anInt323 == 2 && this.aBoolean50) {
					this.method178();
				}
				for (local868 = 0; local868 < 5; local868++) {
					@Pc(977) int local977 = this.anIntArray67[local868]++;
				}
				this.method186((byte) 9);
				super.anInt192++;
				if (super.anInt192 > 4500) {
					this.anInt409 = 250;
					super.anInt192 -= 500;
					this.aClass1_Sub1_Sub3_3.method492(144);
				}
				this.anInt404++;
				if (this.anInt404 > 500) {
					this.anInt404 = 0;
					local870 = (int) (Math.random() * 8.0D);
					if ((local870 & 0x1) == 1) {
						this.anInt234 += this.anInt235;
					}
					if ((local870 & 0x2) == 2) {
						this.anInt386 += this.anInt387;
					}
					if ((local870 & 0x4) == 4) {
						this.anInt289 += this.anInt290;
					}
				}
				if (this.anInt234 < -50) {
					this.anInt235 = 2;
				}
				if (this.anInt234 > 50) {
					this.anInt235 = -2;
				}
				if (this.anInt386 < -55) {
					this.anInt387 = 2;
				}
				if (this.anInt386 > 55) {
					this.anInt387 = -2;
				}
				if (this.anInt289 < -40) {
					this.anInt290 = 1;
				}
				if (this.anInt289 > 40) {
					this.anInt290 = -1;
				}
				this.anInt274++;
				if (this.anInt274 > 500) {
					this.anInt274 = 0;
					local870 = (int) (Math.random() * 8.0D);
					if ((local870 & 0x1) == 1) {
						this.anInt349 += this.anInt350;
					}
					if ((local870 & 0x2) == 2) {
						this.anInt360 += this.anInt361;
					}
				}
				if (this.anInt349 < -60) {
					this.anInt350 = 2;
				}
				if (this.anInt349 > 60) {
					this.anInt350 = -2;
				}
				if (this.anInt360 < -20) {
					this.anInt361 = 1;
				}
				if (this.anInt360 > 10) {
					this.anInt361 = -1;
				}
				this.anInt408++;
				if (this.anInt408 > 50) {
					this.aClass1_Sub1_Sub3_3.method492(239);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_3.anInt766 > 0) {
						this.aClass8_1.method246(this.aClass1_Sub1_Sub3_3.anInt766, this.aClass1_Sub1_Sub3_3.aByteArray9);
						this.aClass1_Sub1_Sub3_3.anInt766 = 0;
						this.anInt408 = 0;
					}
				} catch (@Pc(1229) IOException local1229) {
					this.method115();
				} catch (@Pc(1234) Exception local1234) {
					this.method141();
				}
			}
		} catch (@Pc(1239) RuntimeException local1239) {
			signlink.reporterror("79087, " + true + ", " + local1239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method90(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method90(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method158() {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt217; local5++) {
				@Pc(12) int local12 = this.anIntArray41[local5];
				@Pc(17) Class1_Sub1_Sub1_Sub1_Sub2 local17 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
				if (local17 != null) {
					this.method159(this.aByte8, local17.aClass15_2.aByte26, local17);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("87160, " + -20457 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!y;)V")
	private void method159(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg2) {
		try {
			if (arg2.anInt994 < 128 || arg2.anInt995 < 128 || arg2.anInt994 >= 13184 || arg2.anInt995 >= 13184) {
				arg2.anInt1017 = -1;
				arg2.anInt1022 = -1;
				arg2.anInt1031 = 0;
				arg2.anInt1032 = 0;
				arg2.anInt994 = arg2.anIntArray284[0] * 128 + arg2.anInt997 * 64;
				arg2.anInt995 = arg2.anIntArray285[0] * 128 + arg2.anInt997 * 64;
				arg2.method696();
			}
			if (arg2 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg2.anInt994 < 1536 || arg2.anInt995 < 1536 || arg2.anInt994 >= 11776 || arg2.anInt995 >= 11776)) {
				arg2.anInt1017 = -1;
				arg2.anInt1022 = -1;
				arg2.anInt1031 = 0;
				arg2.anInt1032 = 0;
				arg2.anInt994 = arg2.anIntArray284[0] * 128 + arg2.anInt997 * 64;
				arg2.anInt995 = arg2.anIntArray285[0] * 128 + arg2.anInt997 * 64;
				arg2.method696();
			}
			if (arg2.anInt1031 > anInt209) {
				this.method160(arg2, this.aBoolean40);
			} else if (arg2.anInt1032 >= anInt209) {
				this.method161(arg2);
			} else {
				this.method162(arg2);
			}
			this.method163(arg2);
			if (arg0 != 30) {
				this.aClass31ArrayArrayArray1 = null;
			}
			this.method164(arg2, this.anInt285);
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("81300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;Z)V")
	private void method160(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt1031 - anInt209;
			@Pc(14) int local14 = arg0.anInt1027 * 128 + arg0.anInt997 * 64;
			@Pc(24) int local24 = arg0.anInt1029 * 128 + arg0.anInt997 * 64;
			if (arg1) {
				this.anInt406 = this.aClass1_Sub1_Sub3_2.method503();
			}
			arg0.anInt994 += (local14 - arg0.anInt994) / local4;
			arg0.anInt995 += (local24 - arg0.anInt995) / local4;
			arg0.anInt1039 = 0;
			if (arg0.anInt1033 == 0) {
				arg0.anInt1036 = 1024;
			}
			if (arg0.anInt1033 == 1) {
				arg0.anInt1036 = 1536;
			}
			if (arg0.anInt1033 == 2) {
				arg0.anInt1036 = 0;
			}
			if (arg0.anInt1033 == 3) {
				arg0.anInt1036 = 512;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("800, " + arg0 + ", " + arg1 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method161(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1032 == anInt209 || arg0.anInt1017 == -1 || arg0.anInt1020 != 0 || arg0.anInt1019 + 1 > Class29.aClass29Array1[arg0.anInt1017].method529(arg0.anInt1018)) {
				@Pc(42) int local42 = arg0.anInt1032 - arg0.anInt1031;
				@Pc(47) int local47 = anInt209 - arg0.anInt1031;
				@Pc(57) int local57 = arg0.anInt1027 * 128 + arg0.anInt997 * 64;
				@Pc(67) int local67 = arg0.anInt1029 * 128 + arg0.anInt997 * 64;
				@Pc(77) int local77 = arg0.anInt1028 * 128 + arg0.anInt997 * 64;
				@Pc(87) int local87 = arg0.anInt1030 * 128 + arg0.anInt997 * 64;
				arg0.anInt994 = (local57 * (local42 - local47) + local77 * local47) / local42;
				arg0.anInt995 = (local67 * (local42 - local47) + local87 * local47) / local42;
			}
			arg0.anInt1039 = 0;
			if (arg0.anInt1033 == 0) {
				arg0.anInt1036 = 1024;
			}
			if (arg0.anInt1033 == 1) {
				arg0.anInt1036 = 1536;
			}
			if (arg0.anInt1033 == 2) {
				arg0.anInt1036 = 0;
			}
			if (arg0.anInt1033 == 3) {
				arg0.anInt1036 = 512;
			}
			arg0.anInt996 = arg0.anInt1036;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("55478, " + arg0 + ", " + 7 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;Z)V")
	private void method162(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt1014 = arg0.anInt998;
			if (arg0.anInt1038 == 0) {
				arg0.anInt1039 = 0;
			} else {
				if (arg0.anInt1017 != -1 && arg0.anInt1020 == 0) {
					@Pc(24) Class29 local24 = Class29.aClass29Array1[arg0.anInt1017];
					if (arg0.anInt1040 > 0 && local24.anInt813 == 0) {
						arg0.anInt1039++;
						return;
					}
					if (arg0.anInt1040 <= 0 && local24.anInt814 == 0) {
						arg0.anInt1039++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt994;
				@Pc(56) int local56 = arg0.anInt995;
				@Pc(71) int local71 = arg0.anIntArray284[arg0.anInt1038 - 1] * 128 + arg0.anInt997 * 64;
				@Pc(86) int local86 = arg0.anIntArray285[arg0.anInt1038 - 1] * 128 + arg0.anInt997 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt1036 = 1280;
						} else if (local56 > local86) {
							arg0.anInt1036 = 1792;
						} else {
							arg0.anInt1036 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt1036 = 768;
						} else if (local56 > local86) {
							arg0.anInt1036 = 256;
						} else {
							arg0.anInt1036 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt1036 = 1024;
					} else {
						arg0.anInt1036 = 0;
					}
					@Pc(180) int local180 = arg0.anInt1036 - arg0.anInt996 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt1001;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt1000;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt1003;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt1002;
					}
					if (local187 == -1) {
						local187 = arg0.anInt1000;
					}
					arg0.anInt1014 = local187;
					@Pc(229) int local229 = 4;
					if (arg0.anInt996 != arg0.anInt1036 && arg0.anInt1011 == -1 && arg0.anInt1037 != 0) {
						local229 = 2;
					}
					if (arg0.anInt1038 > 2) {
						local229 = 6;
					}
					if (arg0.anInt1038 > 3) {
						local229 = 8;
					}
					if (arg0.anInt1039 > 0 && arg0.anInt1038 > 1) {
						local229 = 8;
						arg0.anInt1039--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1038 - 1]) {
						local229 <<= 0x1;
					}
					if (local229 >= 8 && arg0.anInt1014 == arg0.anInt1000 && arg0.anInt1004 != -1) {
						arg0.anInt1014 = arg0.anInt1004;
					}
					if (local53 < local71) {
						arg0.anInt994 += local229;
						if (arg0.anInt994 > local71) {
							arg0.anInt994 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt994 -= local229;
						if (arg0.anInt994 < local71) {
							arg0.anInt994 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt995 += local229;
						if (arg0.anInt995 > local86) {
							arg0.anInt995 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt995 -= local229;
						if (arg0.anInt995 < local86) {
							arg0.anInt995 = local86;
						}
					}
					if (arg0.anInt994 == local71 && arg0.anInt995 == local86) {
						arg0.anInt1038--;
						if (arg0.anInt1040 > 0) {
							arg0.anInt1040--;
							return;
						}
					}
				} else {
					arg0.anInt994 = local71;
					arg0.anInt995 = local86;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("15165, " + arg0 + ", " + false + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;I)V")
	private void method163(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1037 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt1011 != -1 && arg0.anInt1011 < 32768) {
					@Pc(25) Class1_Sub1_Sub1_Sub1_Sub2 local25 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1011];
					if (local25 != null) {
						local33 = arg0.anInt994 - local25.anInt994;
						local39 = arg0.anInt995 - local25.anInt995;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt1036 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt1011 >= 32768) {
					local64 = arg0.anInt1011 - 32768;
					if (local64 == this.anInt384) {
						local64 = this.anInt241;
					}
					@Pc(76) Class1_Sub1_Sub1_Sub1_Sub1 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt994 - local76.anInt994;
						@Pc(90) int local90 = arg0.anInt995 - local76.anInt995;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt1036 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt1012 != 0 || arg0.anInt1013 != 0) && (arg0.anInt1038 == 0 || arg0.anInt1039 > 0)) {
					local64 = arg0.anInt994 - (arg0.anInt1012 - this.anInt356 - this.anInt356) * 64;
					local33 = arg0.anInt995 - (arg0.anInt1013 - this.anInt357 - this.anInt357) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt1036 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt1012 = 0;
					arg0.anInt1013 = 0;
				}
				local64 = arg0.anInt1036 - arg0.anInt996 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt1037 || local64 > 2048 - arg0.anInt1037) {
						arg0.anInt996 = arg0.anInt1036;
					} else if (local64 > 1024) {
						arg0.anInt996 -= arg0.anInt1037;
					} else {
						arg0.anInt996 += arg0.anInt1037;
					}
					arg0.anInt996 &= 0x7FF;
					if (arg0.anInt1014 == arg0.anInt998 && arg0.anInt996 != arg0.anInt1036) {
						if (arg0.anInt999 != -1) {
							arg0.anInt1014 = arg0.anInt999;
							return;
						}
						arg0.anInt1014 = arg0.anInt1000;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("49670, " + arg0 + ", " + 37377 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!y;I)V")
	private void method164(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 5) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			arg0.aBoolean239 = false;
			@Pc(23) Class29 local23;
			if (arg0.anInt1014 != -1) {
				local23 = Class29.aClass29Array1[arg0.anInt1014];
				arg0.anInt1016++;
				if (arg0.anInt1015 < local23.anInt807 && arg0.anInt1016 > local23.method529(arg0.anInt1015)) {
					arg0.anInt1016 = 0;
					arg0.anInt1015++;
				}
				if (arg0.anInt1015 >= local23.anInt807) {
					arg0.anInt1016 = 0;
					arg0.anInt1015 = 0;
				}
			}
			if (arg0.anInt1022 != -1 && anInt209 >= arg0.anInt1025) {
				if (arg0.anInt1023 < 0) {
					arg0.anInt1023 = 0;
				}
				local23 = Class35.aClass35Array1[arg0.anInt1022].aClass29_2;
				arg0.anInt1024++;
				while (arg0.anInt1023 < local23.anInt807 && arg0.anInt1024 > local23.method529(arg0.anInt1023)) {
					arg0.anInt1024 -= local23.method529(arg0.anInt1023);
					arg0.anInt1023++;
				}
				if (arg0.anInt1023 >= local23.anInt807 && (arg0.anInt1023 < 0 || arg0.anInt1023 >= local23.anInt807)) {
					arg0.anInt1022 = -1;
				}
			}
			if (arg0.anInt1017 != -1 && arg0.anInt1020 <= 1) {
				local23 = Class29.aClass29Array1[arg0.anInt1017];
				if (local23.anInt813 == 1 && arg0.anInt1040 > 0 && arg0.anInt1031 <= anInt209 && arg0.anInt1032 < anInt209) {
					arg0.anInt1020 = 1;
					return;
				}
			}
			if (arg0.anInt1017 != -1 && arg0.anInt1020 == 0) {
				local23 = Class29.aClass29Array1[arg0.anInt1017];
				arg0.anInt1019++;
				while (arg0.anInt1018 < local23.anInt807 && arg0.anInt1019 > local23.method529(arg0.anInt1018)) {
					arg0.anInt1019 -= local23.method529(arg0.anInt1018);
					arg0.anInt1018++;
				}
				if (arg0.anInt1018 >= local23.anInt807) {
					arg0.anInt1018 -= local23.anInt808;
					arg0.anInt1021++;
					if (arg0.anInt1021 >= local23.anInt812) {
						arg0.anInt1017 = -1;
					}
					if (arg0.anInt1018 < 0 || arg0.anInt1018 >= local23.anInt807) {
						arg0.anInt1017 = -1;
					}
				}
				arg0.aBoolean239 = local23.aBoolean202;
			}
			if (arg0.anInt1020 > 0) {
				arg0.anInt1020--;
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("89523, " + arg0 + ", " + arg1 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method165(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.aBoolean54) {
				this.aBoolean54 = false;
				this.aClass37_3.method600(4, super.aGraphics2, 0);
				this.aClass37_4.method600(357, super.aGraphics2, 0);
				this.aClass37_5.method600(4, super.aGraphics2, 722);
				this.aClass37_6.method600(205, super.aGraphics2, 743);
				this.aClass37_7.method600(0, super.aGraphics2, 0);
				this.aClass37_8.method600(4, super.aGraphics2, 516);
				this.aClass37_9.method600(205, super.aGraphics2, 516);
				this.aClass37_10.method600(357, super.aGraphics2, 496);
				this.aClass37_11.method600(338, super.aGraphics2, 0);
				this.aBoolean78 = true;
				this.aBoolean70 = true;
				this.aBoolean69 = true;
				this.aBoolean53 = true;
				if (this.anInt323 != 2) {
					this.aClass37_23.method600(4, super.aGraphics2, 4);
					this.aClass37_22.method600(4, super.aGraphics2, 550);
				}
			}
			if (this.anInt323 == 2) {
				this.method187();
			}
			if (this.aBoolean51 && this.anInt399 == 1) {
				this.aBoolean78 = true;
			}
			@Pc(148) boolean local148;
			if (this.anInt260 != -1) {
				local148 = this.method106(this.anInt255, this.anInt260);
				if (local148) {
					this.aBoolean78 = true;
				}
			}
			if (this.anInt370 == 2) {
				this.aBoolean78 = true;
			}
			if (this.anInt376 == 2) {
				this.aBoolean78 = true;
			}
			if (this.aBoolean78) {
				this.method214();
				this.aBoolean78 = false;
			}
			if (this.anInt223 == -1) {
				this.aClass6_1.anInt434 = this.anInt266 - this.anInt388 - 77;
				if (super.anInt194 > 448 && super.anInt194 < 560 && super.anInt195 > 332) {
					this.method197(0, super.anInt194 - 17, 463, this.aClass6_1, false, 77, super.anInt195 - 357, this.anInt266);
				}
				@Pc(230) int local230 = this.anInt266 - this.aClass6_1.anInt434 - 77;
				if (local230 < 0) {
					local230 = 0;
				}
				if (local230 > this.anInt266 - 77) {
					local230 = this.anInt266 - 77;
				}
				if (this.anInt388 != local230) {
					this.anInt388 = local230;
					this.aBoolean70 = true;
				}
			}
			if (this.anInt223 != -1) {
				local148 = this.method106(this.anInt255, this.anInt223);
				if (local148) {
					this.aBoolean70 = true;
				}
			}
			if (this.anInt370 == 3) {
				this.aBoolean70 = true;
			}
			if (this.anInt376 == 3) {
				this.aBoolean70 = true;
			}
			if (this.aString4 != null) {
				this.aBoolean70 = true;
			}
			if (this.aBoolean51 && this.anInt399 == 2) {
				this.aBoolean70 = true;
			}
			if (this.aBoolean70) {
				this.method93();
				this.aBoolean70 = false;
			}
			if (this.anInt323 == 2) {
				this.method145();
				this.aClass37_22.method600(4, super.aGraphics2, 550);
			}
			if (this.anInt214 != -1) {
				this.aBoolean69 = true;
			}
			if (this.aBoolean69) {
				if (this.anInt214 != -1 && this.anInt214 == this.anInt297) {
					this.anInt214 = -1;
					this.aClass1_Sub1_Sub3_3.method492(201);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt297);
				}
				this.aBoolean69 = false;
				this.aClass37_27.method599();
				this.aClass1_Sub1_Sub2_Sub3_15.method415(0, 0);
				if (this.anInt260 == -1) {
					if (this.anIntArray77[this.anInt297] != -1) {
						if (this.anInt297 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_16.method415(22, 10);
						}
						if (this.anInt297 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_17.method415(54, 8);
						}
						if (this.anInt297 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_17.method415(82, 8);
						}
						if (this.anInt297 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_18.method415(110, 8);
						}
						if (this.anInt297 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_20.method415(153, 8);
						}
						if (this.anInt297 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_20.method415(181, 8);
						}
						if (this.anInt297 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_19.method415(209, 9);
						}
					}
					if (this.anIntArray77[0] != -1 && (this.anInt214 != 0 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[0].method415(29, 13);
					}
					if (this.anIntArray77[1] != -1 && (this.anInt214 != 1 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[1].method415(53, 11);
					}
					if (this.anIntArray77[2] != -1 && (this.anInt214 != 2 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[2].method415(82, 11);
					}
					if (this.anIntArray77[3] != -1 && (this.anInt214 != 3 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[3].method415(115, 12);
					}
					if (this.anIntArray77[4] != -1 && (this.anInt214 != 4 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[4].method415(153, 13);
					}
					if (this.anIntArray77[5] != -1 && (this.anInt214 != 5 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[5].method415(180, 11);
					}
					if (this.anIntArray77[6] != -1 && (this.anInt214 != 6 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[6].method415(208, 13);
					}
				}
				this.aClass37_27.method600(160, super.aGraphics2, 516);
				this.aClass37_26.method599();
				this.aClass1_Sub1_Sub2_Sub3_14.method415(0, 0);
				if (this.anInt260 == -1) {
					if (this.anIntArray77[this.anInt297] != -1) {
						if (this.anInt297 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_1.method415(42, 0);
						}
						if (this.anInt297 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_2.method415(74, 0);
						}
						if (this.anInt297 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_2.method415(102, 0);
						}
						if (this.anInt297 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_3.method415(130, 1);
						}
						if (this.anInt297 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_5.method415(173, 0);
						}
						if (this.anInt297 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_5.method415(201, 0);
						}
						if (this.anInt297 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_4.method415(229, 0);
						}
					}
					if (this.anIntArray77[8] != -1 && (this.anInt214 != 8 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[7].method415(74, 2);
					}
					if (this.anIntArray77[9] != -1 && (this.anInt214 != 9 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[8].method415(102, 3);
					}
					if (this.anIntArray77[10] != -1 && (this.anInt214 != 10 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[9].method415(137, 4);
					}
					if (this.anIntArray77[11] != -1 && (this.anInt214 != 11 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[10].method415(174, 2);
					}
					if (this.anIntArray77[12] != -1 && (this.anInt214 != 12 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[11].method415(201, 2);
					}
					if (this.anIntArray77[13] != -1 && (this.anInt214 != 13 || anInt209 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[12].method415(226, 2);
					}
				}
				this.aClass37_26.method600(466, super.aGraphics2, 496);
				this.aClass37_23.method599();
			}
			if (this.aBoolean53) {
				this.aBoolean53 = false;
				this.aClass37_25.method599();
				this.aClass1_Sub1_Sub2_Sub3_13.method415(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method470(55, true, 16777215, 28, "Public chat");
				if (this.anInt250 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(55, true, 65280, 41, "On");
				}
				if (this.anInt250 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(55, true, 16776960, 41, "Friends");
				}
				if (this.anInt250 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(55, true, 16711680, 41, "Off");
				}
				if (this.anInt250 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(55, true, 65535, 41, "Hide");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method470(184, true, 16777215, 28, "Private chat");
				if (this.anInt417 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(184, true, 65280, 41, "On");
				}
				if (this.anInt417 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(184, true, 16776960, 41, "Friends");
				}
				if (this.anInt417 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(184, true, 16711680, 41, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method470(324, true, 16777215, 28, "Trade/duel");
				if (this.anInt267 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(324, true, 65280, 41, "On");
				}
				if (this.anInt267 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(324, true, 16776960, 41, "Friends");
				}
				if (this.anInt267 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method470(324, true, 16711680, 41, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method470(458, true, 16777215, 33, "Report abuse");
				this.aClass37_25.method600(453, super.aGraphics2, 0);
				this.aClass37_23.method599();
			}
			this.anInt255 = 0;
		} catch (@Pc(1056) RuntimeException local1056) {
			signlink.reporterror("23576, " + arg0 + ", " + local1056.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method166(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt376 == 0) {
				@Pc(6) int local6 = super.anInt199;
				@Pc(10) boolean local10 = false;
				if (this.anInt301 == 1 && super.anInt200 >= 516 && super.anInt201 >= 160 && super.anInt200 <= 765 && super.anInt201 <= 205) {
					local6 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean51) {
					if (local6 != 1) {
						local41 = super.anInt194;
						local44 = super.anInt195;
						if (this.anInt399 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt399 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt399 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt400 - 10 || local41 > this.anInt400 + this.anInt402 + 10 || local44 < this.anInt401 - 10 || local44 > this.anInt401 + this.anInt403 + 10) {
							this.aBoolean51 = false;
							if (this.anInt399 == 1) {
								this.aBoolean78 = true;
							}
							if (this.anInt399 == 2) {
								this.aBoolean70 = true;
							}
						}
					}
					if (local6 == 1) {
						local41 = this.anInt400;
						local44 = this.anInt401;
						local120 = this.anInt402;
						@Pc(123) int local123 = super.anInt200;
						@Pc(126) int local126 = super.anInt201;
						if (this.anInt399 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt399 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt399 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt308; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt308 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method149(local145);
						}
						this.aBoolean51 = false;
						if (this.anInt399 == 1) {
							this.aBoolean78 = true;
						}
						if (this.anInt399 == 2) {
							this.aBoolean70 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt308 > 0) {
						local41 = this.anIntArray58[this.anInt308 - 1];
						if (local41 == 582 || local41 == 113 || local41 == 555 || local41 == 331 || local41 == 354 || local41 == 694 || local41 == 962 || local41 == 795 || local41 == 681 || local41 == 100 || local41 == 102 || local41 == 1328) {
							local44 = this.anIntArray56[this.anInt308 - 1];
							local120 = this.anIntArray57[this.anInt308 - 1];
							@Pc(282) Class6 local282 = Class6.aClass6Array1[local120];
							if (local282.aBoolean86 || local282.aBoolean89) {
								this.aBoolean80 = false;
								this.anInt269 = 0;
								this.anInt374 = local120;
								this.anInt375 = local44;
								this.anInt376 = 2;
								this.anInt377 = super.anInt200;
								this.anInt378 = super.anInt201;
								if (Class6.aClass6Array1[local120].anInt424 == this.anInt210) {
									this.anInt376 = 1;
								}
								if (Class6.aClass6Array1[local120].anInt424 == this.anInt223) {
									this.anInt376 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt307 == 1 || this.method151(this.anInt308 - 1)) && this.anInt308 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt308 > 0) {
						this.method149(this.anInt308 - 1);
					}
					if (local6 != 2 || this.anInt308 <= 0) {
						return;
					}
					this.method134();
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("81801, " + arg0 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg4;
			if (this.anInt295 > 2 || this.anInt295 < 2) {
				this.anInt295 = this.aClass47_1.method685();
			}
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(50) int local50;
			if (local5 != 0) {
				local36 = Class1_Sub1_Sub1_Sub5.anIntArray139[local5];
				local40 = Class1_Sub1_Sub1_Sub5.anIntArray140[local5];
				local50 = local40 * 0 - arg4 * local36 >> 16;
				local17 = local36 * 0 + arg4 * local40 >> 16;
				local15 = local50;
			}
			if (local11 != 0) {
				local36 = Class1_Sub1_Sub1_Sub5.anIntArray139[local11];
				local40 = Class1_Sub1_Sub1_Sub5.anIntArray140[local11];
				local50 = local17 * local36 + local40 * 0 >> 16;
				local17 = local17 * local40 - local36 * 0 >> 16;
				local13 = local50;
			}
			this.anInt392 = arg3 - local13;
			this.anInt393 = arg2 - local15;
			this.anInt394 = arg0 - local17;
			this.anInt395 = arg5;
			this.anInt396 = arg1;
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("28040, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + arg4 + ", " + arg5 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)I")
	private int method168() {
		try {
			@Pc(12) int local12 = 3;
			if (this.anInt395 < 310) {
				@Pc(21) int local21 = this.anInt392 >> 7;
				@Pc(26) int local26 = this.anInt394 >> 7;
				@Pc(31) int local31 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 >> 7;
				@Pc(36) int local36 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt391][local21][local26] & 0x4) != 0) {
					local12 = this.anInt391;
				}
				@Pc(58) int local58;
				if (local31 > local21) {
					local58 = local31 - local21;
				} else {
					local58 = local21 - local31;
				}
				@Pc(71) int local71;
				if (local36 > local26) {
					local71 = local36 - local26;
				} else {
					local71 = local26 - local36;
				}
				@Pc(86) int local86;
				@Pc(88) int local88;
				if (local58 > local71) {
					local86 = local71 * 65536 / local58;
					local88 = 32768;
					while (local21 != local31) {
						if (local21 < local31) {
							local21++;
						} else if (local21 > local31) {
							local21--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt391][local21][local26] & 0x4) != 0) {
							local12 = this.anInt391;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local26 < local36) {
								local26++;
							} else if (local26 > local36) {
								local26--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt391][local21][local26] & 0x4) != 0) {
								local12 = this.anInt391;
							}
						}
					}
				} else {
					local86 = local58 * 65536 / local71;
					local88 = 32768;
					while (local26 != local36) {
						if (local26 < local36) {
							local26++;
						} else if (local26 > local36) {
							local26--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt391][local21][local26] & 0x4) != 0) {
							local12 = this.anInt391;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt391][local21][local26] & 0x4) != 0) {
								local12 = this.anInt391;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt391][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 >> 7] & 0x4) != 0) {
				local12 = this.anInt391;
			}
			return local12;
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("81833, " + 9 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)I")
	private int method169() {
		try {
			@Pc(14) int local14 = this.method181(this.anInt392, 526, this.anInt394, this.anInt391);
			return local14 - this.anInt393 >= 800 || (this.aByteArrayArrayArray7[this.anInt391][this.anInt392 >> 7][this.anInt394 >> 7] & 0x4) == 0 ? 3 : this.anInt391;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("63431, " + false + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)Z")
	private boolean method170() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(831) String local831;
			@Pc(178) int local178;
			try {
				@Pc(15) int local15 = this.aClass8_1.method244();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt406 == -1) {
					this.aClass8_1.method245(this.aClass1_Sub1_Sub3_2.aByteArray9, 0, 1);
					this.anInt406 = this.aClass1_Sub1_Sub3_2.aByteArray9[0] & 0xFF;
					if (this.aClass47_1 != null) {
						this.anInt406 = this.anInt406 - this.aClass47_1.method685() & 0xFF;
					}
					this.anInt405 = Class19.anIntArray209[this.anInt406];
					local15--;
				}
				if (this.anInt405 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass8_1.method245(this.aClass1_Sub1_Sub3_2.aByteArray9, 0, 1);
					this.anInt405 = this.aClass1_Sub1_Sub3_2.aByteArray9[0] & 0xFF;
					local15--;
				}
				if (this.anInt405 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass8_1.method245(this.aClass1_Sub1_Sub3_2.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_2.anInt766 = 0;
					this.anInt405 = this.aClass1_Sub1_Sub3_2.method505();
					local15 -= 2;
				}
				if (local15 < this.anInt405) {
					return false;
				}
				this.aClass1_Sub1_Sub3_2.anInt766 = 0;
				this.aClass8_1.method245(this.aClass1_Sub1_Sub3_2.aByteArray9, 0, this.anInt405);
				this.anInt407 = 0;
				this.anInt208 = this.anInt207;
				this.anInt207 = this.anInt206;
				this.anInt206 = this.anInt406;
				@Pc(157) int local157;
				if (this.anInt406 == 203) {
					for (local157 = 0; local157 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local157++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local157] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local157].anInt1017 = -1;
						}
					}
					for (local178 = 0; local178 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local178++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local178] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local178].anInt1017 = -1;
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 143) {
					this.anInt238 = this.aClass1_Sub1_Sub3_2.method505() * 30;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 173) {
					this.anInt382 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt383 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt406 = -1;
					return true;
				}
				@Pc(253) Class6 local253;
				if (this.anInt406 == 14) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method505();
					local253 = Class6.aClass6Array1[local157];
					if (local253 != null && local253.anInt425 == 0) {
						if (local178 < 0) {
							local178 = 0;
						}
						if (local178 > local253.anInt433 - local253.anInt429) {
							local178 = local253.anInt433 - local253.anInt429;
						}
						local253.anInt434 = local178;
					}
					this.anInt406 = -1;
					return true;
				}
				@Pc(296) int local296;
				@Pc(300) int local300;
				@Pc(304) int local304;
				@Pc(325) int local325;
				@Pc(292) long local292;
				@Pc(302) boolean local302;
				if (this.anInt406 == 60) {
					local292 = this.aClass1_Sub1_Sub3_2.method509();
					local296 = this.aClass1_Sub1_Sub3_2.method508();
					local300 = this.aClass1_Sub1_Sub3_2.method503();
					local302 = false;
					for (local304 = 0; local304 < 100; local304++) {
						if (this.anIntArray50[local304] == local296) {
							local302 = true;
							break;
						}
					}
					if (local300 <= 1) {
						for (local325 = 0; local325 < this.anInt324; local325++) {
							if (this.aLongArray4[local325] == local292) {
								local302 = true;
								break;
							}
						}
					}
					if (!local302 && this.anInt244 == 0) {
						try {
							this.anIntArray50[this.anInt246] = local296;
							this.anInt246 = (this.anInt246 + 1) % 100;
							@Pc(371) String local371 = Class2.method42(this.aClass1_Sub1_Sub3_2, this.anInt405 - 13);
							@Pc(375) String local375 = Class44.method629(local371);
							if (local300 == 2 || local300 == 3) {
								this.method205(local375, "@cr2@" + Class49.method704(Class49.method701(586, local292)), 7);
							} else if (local300 == 1) {
								this.method205(local375, "@cr1@" + Class49.method704(Class49.method701(586, local292)), 7);
							} else {
								this.method205(local375, Class49.method704(Class49.method701(586, local292)), 3);
							}
						} catch (@Pc(432) Exception local432) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 3) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method505();
					Class6.aClass6Array1[local157].anInt442 = 2;
					Class6.aClass6Array1[local157].anInt443 = local178;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 123) {
					this.method127(this.anInt405, this.aClass1_Sub1_Sub3_2);
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 239) {
					local157 = this.aClass1_Sub1_Sub3_2.method506();
					this.anInt325 = local157;
					this.aBoolean70 = true;
					this.anInt406 = -1;
					return true;
				}
				@Pc(572) int local572;
				if (this.anInt406 == 0) {
					this.aBoolean50 = true;
					this.anInt226 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt227 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt228 = this.aClass1_Sub1_Sub3_2.method505();
					this.anInt229 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt230 = this.aClass1_Sub1_Sub3_2.method503();
					if (this.anInt230 >= 100) {
						local157 = this.anInt226 * 128 + 64;
						local178 = this.anInt227 * 128 + 64;
						local296 = this.method181(local157, 526, local178, this.anInt391) - this.anInt228;
						local300 = local157 - this.anInt392;
						local572 = local296 - this.anInt393;
						local304 = local178 - this.anInt394;
						local325 = (int) Math.sqrt((double) (local300 * local300 + local304 * local304));
						this.anInt395 = (int) (Math.atan2((double) local572, (double) local325) * 325.949D) & 0x7FF;
						this.anInt396 = (int) (Math.atan2((double) local300, (double) local304) * -325.949D) & 0x7FF;
						if (this.anInt395 < 128) {
							this.anInt395 = 128;
						}
						if (this.anInt395 > 383) {
							this.anInt395 = 383;
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 174) {
					if (this.anInt260 != -1) {
						this.anInt260 = -1;
						this.aBoolean78 = true;
						this.aBoolean69 = true;
					}
					if (this.anInt223 != -1) {
						this.anInt223 = -1;
						this.aBoolean70 = true;
					}
					if (this.aBoolean73) {
						this.aBoolean73 = false;
						this.aBoolean70 = true;
					}
					this.anInt210 = -1;
					this.aBoolean59 = false;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 58) {
					this.anInt214 = this.aClass1_Sub1_Sub3_2.method503();
					if (this.anInt214 == this.anInt297) {
						if (this.anInt214 == 3) {
							this.anInt297 = 1;
						} else {
							this.anInt297 = 3;
						}
						this.aBoolean78 = true;
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 95) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method506();
					local253 = Class6.aClass6Array1[local157];
					local253.anInt446 = local178;
					if (local178 == -1) {
						local253.anInt421 = 0;
						local253.anInt422 = 0;
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 27) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method506();
					local296 = this.aClass1_Sub1_Sub3_2.method506();
					@Pc(765) Class6 local765 = Class6.aClass6Array1[local157];
					local765.anInt430 = local178;
					local765.anInt431 = local296;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 196) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method508();
					this.anIntArray83[local157] = local178;
					if (this.anIntArray75[local157] != local178) {
						this.anIntArray75[local157] = local178;
						this.method142(local157, 108);
						this.aBoolean78 = true;
						if (this.anInt325 != -1) {
							this.aBoolean70 = true;
						}
					}
					this.anInt406 = -1;
					return true;
				}
				@Pc(842) String local842;
				if (this.anInt406 == 73) {
					local831 = this.aClass1_Sub1_Sub3_2.method510();
					@Pc(845) long local845;
					if (local831.endsWith(":tradereq:")) {
						local842 = local831.substring(0, local831.indexOf(":"));
						local845 = Class49.method700(local842);
						local302 = false;
						for (local304 = 0; local304 < this.anInt324; local304++) {
							if (this.aLongArray4[local304] == local845) {
								local302 = true;
								break;
							}
						}
						if (!local302 && this.anInt244 == 0) {
							this.method205("wishes to trade with you.", local842, 4);
						}
					} else if (local831.endsWith(":duelreq:")) {
						local842 = local831.substring(0, local831.indexOf(":"));
						local845 = Class49.method700(local842);
						local302 = false;
						for (local304 = 0; local304 < this.anInt324; local304++) {
							if (this.aLongArray4[local304] == local845) {
								local302 = true;
								break;
							}
						}
						if (!local302 && this.anInt244 == 0) {
							this.method205("wishes to duel with you.", local842, 8);
						}
					} else {
						this.method205(local831, "", 0);
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 75) {
					this.anInt379 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 222) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method505();
					local296 = this.aClass1_Sub1_Sub3_2.method505();
					@Pc(973) Class17 local973 = Class17.method385(local178);
					Class6.aClass6Array1[local157].anInt442 = 4;
					Class6.aClass6Array1[local157].anInt443 = local178;
					Class6.aClass6Array1[local157].anInt449 = local973.anInt628;
					Class6.aClass6Array1[local157].anInt450 = local973.anInt629;
					Class6.aClass6Array1[local157].anInt448 = local973.anInt627 * 100 / local296;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 159) {
					this.anInt382 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt383 = this.aClass1_Sub1_Sub3_2.method503();
					for (local157 = this.anInt382; local157 < this.anInt382 + 8; local157++) {
						for (local178 = this.anInt383; local178 < this.anInt383 + 8; local178++) {
							if (this.aClass31ArrayArrayArray1[this.anInt391][local157][local178] != null) {
								this.aClass31ArrayArrayArray1[this.anInt391][local157][local178] = null;
								this.method212(local157, local178);
							}
						}
					}
					for (@Pc(1077) Class1_Sub2 local1077 = (Class1_Sub2) this.aClass31_3.method534(); local1077 != null; local1077 = (Class1_Sub2) this.aClass31_3.method536(633)) {
						if (local1077.anInt795 >= this.anInt382 && local1077.anInt795 < this.anInt382 + 8 && local1077.anInt796 >= this.anInt383 && local1077.anInt796 < this.anInt383 + 8 && local1077.anInt793 == this.anInt391) {
							local1077.anInt804 = 0;
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 136) {
					this.aBoolean78 = true;
					local157 = this.aClass1_Sub1_Sub3_2.method503();
					local178 = this.aClass1_Sub1_Sub3_2.method508();
					local296 = this.aClass1_Sub1_Sub3_2.method503();
					this.anIntArray46[local157] = local178;
					this.anIntArray43[local157] = local296;
					this.anIntArray64[local157] = 1;
					for (local300 = 0; local300 < 98; local300++) {
						if (local178 >= anIntArray44[local300]) {
							this.anIntArray64[local157] = local300 + 2;
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 5) {
					this.aBoolean79 = false;
					this.aBoolean73 = true;
					this.aString17 = "";
					this.aBoolean70 = true;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 91) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method503();
					if (local157 == 65535) {
						local157 = -1;
					}
					this.anIntArray77[local178] = local157;
					this.aBoolean78 = true;
					this.aBoolean69 = true;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 141) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					this.method198(local157);
					if (this.anInt260 != -1) {
						this.anInt260 = -1;
						this.aBoolean78 = true;
						this.aBoolean69 = true;
					}
					this.anInt223 = local157;
					this.aBoolean70 = true;
					this.anInt210 = -1;
					this.aBoolean59 = false;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 25) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method503();
					local296 = this.aClass1_Sub1_Sub3_2.method505();
					if (this.aBoolean43 && !aBoolean65 && this.anInt265 < 50) {
						this.anIntArray82[this.anInt265] = local157;
						this.anIntArray69[this.anInt265] = local178;
						this.anIntArray85[this.anInt265] = local296 + Class7.anIntArray101[local157];
						this.anInt265++;
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 98 || this.anInt406 == 218 || this.anInt406 == 8 || this.anInt406 == 114 || this.anInt406 == 37 || this.anInt406 == 115 || this.anInt406 == 120 || this.anInt406 == 30 || this.anInt406 == 88 || this.anInt406 == 70) {
					this.method100(this.aClass1_Sub1_Sub3_2, this.anInt406);
					this.anInt406 = -1;
					return true;
				}
				@Pc(1404) Class6 local1404;
				if (this.anInt406 == 28) {
					this.aBoolean78 = true;
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local1404 = Class6.aClass6Array1[local157];
					local296 = this.aClass1_Sub1_Sub3_2.method503();
					for (local300 = 0; local300 < local296; local300++) {
						local1404.anIntArray92[local300] = this.aClass1_Sub1_Sub3_2.method505();
						local572 = this.aClass1_Sub1_Sub3_2.method503();
						if (local572 == 255) {
							local572 = this.aClass1_Sub1_Sub3_2.method508();
						}
						local1404.anIntArray93[local300] = local572;
					}
					for (local572 = local296; local572 < local1404.anIntArray92.length; local572++) {
						local1404.anIntArray92[local572] = 0;
						local1404.anIntArray93[local572] = 0;
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 204) {
					local157 = this.aClass1_Sub1_Sub3_2.method503();
					local178 = this.aClass1_Sub1_Sub3_2.method503();
					@Pc(1480) String local1480 = this.aClass1_Sub1_Sub3_2.method510();
					if (local157 >= 1 && local157 <= 5) {
						if (local1480.equalsIgnoreCase("null")) {
							local1480 = null;
						}
						this.aStringArray5[local157 - 1] = local1480;
						this.aBooleanArray3[local157 - 1] = local178 == 0;
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 63) {
					this.anInt324 = this.anInt405 / 8;
					for (local157 = 0; local157 < this.anInt324; local157++) {
						this.aLongArray4[local157] = this.aClass1_Sub1_Sub3_2.method509();
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 85) {
					local157 = this.aClass1_Sub1_Sub3_2.method506();
					if (local157 >= 0) {
						this.method198(local157);
					}
					this.anInt233 = local157;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 211) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method505();
					Class6.aClass6Array1[local157].anInt442 = 1;
					Class6.aClass6Array1[local157].anInt443 = local178;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 146) {
					this.anInt326 = this.aClass1_Sub1_Sub3_2.method508();
					this.anInt354 = this.aClass1_Sub1_Sub3_2.method505();
					this.anInt288 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt411 = this.aClass1_Sub1_Sub3_2.method505();
					this.anInt410 = this.aClass1_Sub1_Sub3_2.method503();
					if (this.anInt326 != 0 && this.anInt210 == -1) {
						signlink.dnslookup(Class49.method703(this.anInt326, this.anInt294));
						this.method119();
						@Pc(1643) short local1643 = 650;
						if (this.anInt288 != 201 || this.anInt410 == 1) {
							local1643 = 655;
						}
						this.aString13 = "";
						this.aBoolean62 = false;
						for (local178 = 0; local178 < Class6.aClass6Array1.length; local178++) {
							if (Class6.aClass6Array1[local178] != null && Class6.aClass6Array1[local178].anInt427 == local1643) {
								this.anInt210 = Class6.aClass6Array1[local178].anInt424;
								break;
							}
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 164) {
					if (this.anInt297 == 12) {
						this.aBoolean78 = true;
					}
					this.anInt298 = this.aClass1_Sub1_Sub3_2.method506();
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 227) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					@Pc(1729) boolean local1729 = this.aClass1_Sub1_Sub3_2.method503() == 1;
					Class6.aClass6Array1[local157].aBoolean84 = local1729;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 249) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method505();
					if (this.anInt223 != -1) {
						this.anInt223 = -1;
						this.aBoolean70 = true;
					}
					if (this.aBoolean73) {
						this.aBoolean73 = false;
						this.aBoolean70 = true;
					}
					this.anInt210 = local157;
					this.anInt260 = local178;
					this.aBoolean78 = true;
					this.aBoolean69 = true;
					this.aBoolean59 = false;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 87) {
					this.method137(this.aClass1_Sub1_Sub3_2, this.anInt249, this.anInt405);
					this.aBoolean72 = false;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 21) {
					this.method141();
					this.anInt406 = -1;
					return false;
				}
				if (this.anInt406 == 161) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					Class6.aClass6Array1[local157].anInt442 = 3;
					Class6.aClass6Array1[local157].anInt443 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11];
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 255) {
					this.anInt381 = this.aClass1_Sub1_Sub3_2.method503();
					this.aBoolean78 = true;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 197) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					this.method198(local157);
					if (this.anInt260 != -1) {
						this.anInt260 = -1;
						this.aBoolean78 = true;
						this.aBoolean69 = true;
					}
					if (this.anInt223 != -1) {
						this.anInt223 = -1;
						this.aBoolean70 = true;
					}
					if (this.aBoolean73) {
						this.aBoolean73 = false;
						this.aBoolean70 = true;
					}
					this.anInt210 = local157;
					this.aBoolean59 = false;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 187) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					this.method198(local157);
					if (this.anInt223 != -1) {
						this.anInt223 = -1;
						this.aBoolean70 = true;
					}
					if (this.aBoolean73) {
						this.aBoolean73 = false;
						this.aBoolean70 = true;
					}
					this.anInt260 = local157;
					this.aBoolean78 = true;
					this.aBoolean69 = true;
					this.anInt210 = -1;
					this.aBoolean59 = false;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 213) {
					this.anInt384 = this.aClass1_Sub1_Sub3_2.method505();
					this.anInt276 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 186) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					@Pc(2030) byte local2030 = this.aClass1_Sub1_Sub3_2.method504();
					this.anIntArray83[local157] = local2030;
					if (this.anIntArray75[local157] != local2030) {
						this.anIntArray75[local157] = local2030;
						this.method142(local157, 108);
						this.aBoolean78 = true;
						if (this.anInt325 != -1) {
							this.aBoolean70 = true;
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 94) {
					if (this.anInt297 == 12) {
						this.aBoolean78 = true;
					}
					this.anInt287 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 64) {
					this.anInt213 = this.aClass1_Sub1_Sub3_2.method503();
					if (this.anInt213 == 1) {
						this.anInt390 = this.aClass1_Sub1_Sub3_2.method505();
					}
					if (this.anInt213 >= 2 && this.anInt213 <= 6) {
						if (this.anInt213 == 2) {
							this.anInt415 = 64;
							this.anInt416 = 64;
						}
						if (this.anInt213 == 3) {
							this.anInt415 = 0;
							this.anInt416 = 64;
						}
						if (this.anInt213 == 4) {
							this.anInt415 = 128;
							this.anInt416 = 64;
						}
						if (this.anInt213 == 5) {
							this.anInt415 = 64;
							this.anInt416 = 0;
						}
						if (this.anInt213 == 6) {
							this.anInt415 = 64;
							this.anInt416 = 128;
						}
						this.anInt213 = 2;
						this.anInt412 = this.aClass1_Sub1_Sub3_2.method505();
						this.anInt413 = this.aClass1_Sub1_Sub3_2.method505();
						this.anInt414 = this.aClass1_Sub1_Sub3_2.method503();
					}
					if (this.anInt213 == 10) {
						this.anInt365 = this.aClass1_Sub1_Sub3_2.method505();
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 167) {
					this.aBoolean50 = false;
					for (local157 = 0; local157 < 5; local157++) {
						this.aBooleanArray4[local157] = false;
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 225) {
					local157 = this.aClass1_Sub1_Sub3_2.method503();
					local178 = this.aClass1_Sub1_Sub3_2.method503();
					local296 = this.aClass1_Sub1_Sub3_2.method503();
					local300 = this.aClass1_Sub1_Sub3_2.method503();
					this.aBooleanArray4[local157] = true;
					this.anIntArray51[local157] = local178;
					this.anIntArray53[local157] = local296;
					this.anIntArray40[local157] = local300;
					this.anIntArray67[local157] = 0;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 55) {
					this.aBoolean50 = true;
					this.anInt335 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt336 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt337 = this.aClass1_Sub1_Sub3_2.method505();
					this.anInt338 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt339 = this.aClass1_Sub1_Sub3_2.method503();
					if (this.anInt339 >= 100) {
						this.anInt392 = this.anInt335 * 128 + 64;
						this.anInt394 = this.anInt336 * 128 + 64;
						this.anInt393 = this.method181(this.anInt392, 526, this.anInt394, this.anInt391) - this.anInt337;
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 140) {
					for (local157 = 0; local157 < this.anIntArray75.length; local157++) {
						if (this.anIntArray75[local157] != this.anIntArray83[local157]) {
							this.anIntArray75[local157] = this.anIntArray83[local157];
							this.method142(local157, 108);
							this.aBoolean78 = true;
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 170) {
					this.aBoolean78 = true;
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local1404 = Class6.aClass6Array1[local157];
					while (this.aClass1_Sub1_Sub3_2.anInt766 < this.anInt405) {
						local296 = this.aClass1_Sub1_Sub3_2.method503();
						local300 = this.aClass1_Sub1_Sub3_2.method505();
						local572 = this.aClass1_Sub1_Sub3_2.method503();
						if (local572 == 255) {
							local572 = this.aClass1_Sub1_Sub3_2.method508();
						}
						if (local296 >= 0 && local296 < local1404.anIntArray92.length) {
							local1404.anIntArray92[local296] = local300;
							local1404.anIntArray93[local296] = local572;
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 61) {
					this.anInt382 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt383 = this.aClass1_Sub1_Sub3_2.method503();
					while (this.aClass1_Sub1_Sub3_2.anInt766 < this.anInt405) {
						local157 = this.aClass1_Sub1_Sub3_2.method503();
						this.method100(this.aClass1_Sub1_Sub3_2, local157);
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 108) {
					this.anInt292 = 0;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 38) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method505();
					local296 = local178 >> 10 & 0x1F;
					local300 = local178 >> 5 & 0x1F;
					local572 = local178 & 0x1F;
					Class6.aClass6Array1[local157].anInt438 = (local296 << 19) + (local300 << 11) + (local572 << 3);
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 168) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local1404 = Class6.aClass6Array1[local157];
					for (local296 = 0; local296 < local1404.anIntArray92.length; local296++) {
						local1404.anIntArray92[local296] = -1;
						local1404.anIntArray92[local296] = 0;
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 163) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					if (local157 == 65535) {
						local157 = -1;
					}
					if (local157 != this.anInt344 && this.aBoolean49 && !aBoolean65 && this.anInt221 == 0) {
						this.anInt304 = local157;
						this.aBoolean61 = true;
						this.aClass45_Sub1_1.method669(2, this.anInt304);
					}
					this.anInt344 = local157;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 242) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method505();
					if (this.aBoolean49 && !aBoolean65) {
						this.anInt304 = local157;
						this.aBoolean61 = false;
						this.aClass45_Sub1_1.method669(2, this.anInt304);
						this.anInt221 = local178;
					}
					this.anInt406 = -1;
					return true;
				}
				@Pc(2819) int local2819;
				if (this.anInt406 == 111) {
					local292 = this.aClass1_Sub1_Sub3_2.method509();
					local296 = this.aClass1_Sub1_Sub3_2.method503();
					@Pc(2682) String local2682 = Class49.method704(Class49.method701(586, local292));
					for (local572 = 0; local572 < this.anInt380; local572++) {
						if (local292 == this.aLongArray3[local572]) {
							if (this.anIntArray66[local572] != local296) {
								this.anIntArray66[local572] = local296;
								this.aBoolean78 = true;
								if (local296 > 0) {
									this.method205(local2682 + " has logged in.", "", 5);
								}
								if (local296 == 0) {
									this.method205(local2682 + " has logged out.", "", 5);
								}
							}
							local2682 = null;
							break;
						}
					}
					if (local2682 != null && this.anInt380 < 200) {
						this.aLongArray3[this.anInt380] = local292;
						this.aStringArray6[this.anInt380] = local2682;
						this.anIntArray66[this.anInt380] = local296;
						this.anInt380++;
						this.aBoolean78 = true;
					}
					@Pc(2780) boolean local2780 = false;
					while (!local2780) {
						local2780 = true;
						for (local325 = 0; local325 < this.anInt380 - 1; local325++) {
							if (this.anIntArray66[local325] != anInt309 && this.anIntArray66[local325 + 1] == anInt309 || this.anIntArray66[local325] == 0 && this.anIntArray66[local325 + 1] != 0) {
								local2819 = this.anIntArray66[local325];
								this.anIntArray66[local325] = this.anIntArray66[local325 + 1];
								this.anIntArray66[local325 + 1] = local2819;
								@Pc(2841) String local2841 = this.aStringArray6[local325];
								this.aStringArray6[local325] = this.aStringArray6[local325 + 1];
								this.aStringArray6[local325 + 1] = local2841;
								@Pc(2863) long local2863 = this.aLongArray3[local325];
								this.aLongArray3[local325] = this.aLongArray3[local325 + 1];
								this.aLongArray3[local325 + 1] = local2863;
								this.aBoolean78 = true;
								local2780 = false;
							}
						}
					}
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 138) {
					this.anInt297 = this.aClass1_Sub1_Sub3_2.method503();
					this.aBoolean78 = true;
					this.aBoolean69 = true;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 209) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local178 = this.aClass1_Sub1_Sub3_2.method505();
					if (this.anInt317 == local157 && this.anInt318 == local178 && this.anInt323 == 2) {
						this.anInt406 = -1;
						return true;
					}
					this.anInt317 = local157;
					this.anInt318 = local178;
					this.anInt356 = (this.anInt317 - 6) * 8;
					this.anInt357 = (this.anInt318 - 6) * 8;
					this.aBoolean77 = false;
					if ((this.anInt317 / 8 == 48 || this.anInt317 / 8 == 49) && this.anInt318 / 8 == 48) {
						this.aBoolean77 = true;
					}
					if (this.anInt317 / 8 == 48 && this.anInt318 / 8 == 148) {
						this.aBoolean77 = true;
					}
					this.anInt323 = 1;
					this.aLong14 = System.currentTimeMillis();
					this.aClass37_23.method599();
					this.aClass1_Sub1_Sub2_Sub4_2.method469(151, 257, "Loading - please wait.", 0);
					this.aClass1_Sub1_Sub2_Sub4_2.method469(150, 256, "Loading - please wait.", 16777215);
					this.aClass37_23.method600(4, super.aGraphics2, 4);
					local296 = 0;
					for (local300 = (this.anInt317 - 6) / 8; local300 <= (this.anInt317 + 6) / 8; local300++) {
						for (local572 = (this.anInt318 - 6) / 8; local572 <= (this.anInt318 + 6) / 8; local572++) {
							local296++;
						}
					}
					this.aByteArrayArray1 = new byte[local296][];
					this.aByteArrayArray2 = new byte[local296][];
					this.anIntArray30 = new int[local296];
					this.anIntArray31 = new int[local296];
					this.anIntArray32 = new int[local296];
					local296 = 0;
					for (local572 = (this.anInt317 - 6) / 8; local572 <= (this.anInt317 + 6) / 8; local572++) {
						for (local304 = (this.anInt318 - 6) / 8; local304 <= (this.anInt318 + 6) / 8; local304++) {
							this.anIntArray30[local296] = (local572 << 8) + local304;
							if (this.aBoolean77 && (local304 == 49 || local304 == 149 || local304 == 147 || local572 == 50 || local572 == 49 && local304 == 47)) {
								this.anIntArray31[local296] = -1;
								this.anIntArray32[local296] = -1;
								local296++;
							} else {
								local325 = this.anIntArray31[local296] = this.aClass45_Sub1_1.method664(local572, 0, local304);
								if (local325 != -1) {
									this.aClass45_Sub1_1.method669(3, local325);
								}
								local2819 = this.anIntArray32[local296] = this.aClass45_Sub1_1.method664(local572, 1, local304);
								if (local2819 != -1) {
									this.aClass45_Sub1_1.method669(3, local2819);
								}
								local296++;
							}
						}
					}
					local304 = this.anInt356 - this.anInt358;
					local325 = this.anInt357 - this.anInt359;
					this.anInt358 = this.anInt356;
					this.anInt359 = this.anInt357;
					for (local2819 = 0; local2819 < 16384; local2819++) {
						@Pc(3255) Class1_Sub1_Sub1_Sub1_Sub2 local3255 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local2819];
						if (local3255 != null) {
							for (@Pc(3259) int local3259 = 0; local3259 < 10; local3259++) {
								local3255.anIntArray284[local3259] -= local304;
								local3255.anIntArray285[local3259] -= local325;
							}
							local3255.anInt994 -= local304 * 128;
							local3255.anInt995 -= local325 * 128;
						}
					}
					for (@Pc(3303) int local3303 = 0; local3303 < this.anInt240; local3303++) {
						@Pc(3310) Class1_Sub1_Sub1_Sub1_Sub1 local3310 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local3303];
						if (local3310 != null) {
							for (@Pc(3314) int local3314 = 0; local3314 < 10; local3314++) {
								local3310.anIntArray284[local3314] -= local304;
								local3310.anIntArray285[local3314] -= local325;
							}
							local3310.anInt994 -= local304 * 128;
							local3310.anInt995 -= local325 * 128;
						}
					}
					this.aBoolean72 = true;
					@Pc(3362) byte local3362 = 0;
					@Pc(3364) byte local3364 = 104;
					@Pc(3366) byte local3366 = 1;
					if (local304 < 0) {
						local3362 = 103;
						local3364 = -1;
						local3366 = -1;
					}
					@Pc(3376) byte local3376 = 0;
					@Pc(3378) byte local3378 = 104;
					@Pc(3380) byte local3380 = 1;
					if (local325 < 0) {
						local3376 = 103;
						local3378 = -1;
						local3380 = -1;
					}
					for (@Pc(3390) int local3390 = local3362; local3390 != local3364; local3390 += local3366) {
						for (@Pc(3394) int local3394 = local3376; local3394 != local3378; local3394 += local3380) {
							@Pc(3400) int local3400 = local3390 + local304;
							@Pc(3404) int local3404 = local3394 + local325;
							for (@Pc(3406) int local3406 = 0; local3406 < 4; local3406++) {
								if (local3400 >= 0 && local3404 >= 0 && local3400 < 104 && local3404 < 104) {
									this.aClass31ArrayArrayArray1[local3406][local3390][local3394] = this.aClass31ArrayArrayArray1[local3406][local3400][local3404];
								} else {
									this.aClass31ArrayArrayArray1[local3406][local3390][local3394] = null;
								}
							}
						}
					}
					for (@Pc(3468) Class1_Sub2 local3468 = (Class1_Sub2) this.aClass31_3.method534(); local3468 != null; local3468 = (Class1_Sub2) this.aClass31_3.method536(633)) {
						local3468.anInt795 -= local304;
						local3468.anInt796 -= local325;
						if (local3468.anInt795 < 0 || local3468.anInt796 < 0 || local3468.anInt795 >= 104 || local3468.anInt796 >= 104) {
							local3468.method690();
						}
					}
					if (this.anInt292 != 0) {
						this.anInt292 -= local304;
						this.anInt293 -= local325;
					}
					this.aBoolean50 = false;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 24) {
					this.anInt250 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt417 = this.aClass1_Sub1_Sub3_2.method503();
					this.anInt267 = this.aClass1_Sub1_Sub3_2.method503();
					this.aBoolean53 = true;
					this.aBoolean70 = true;
					this.anInt406 = -1;
					return true;
				}
				if (this.anInt406 == 41) {
					local157 = this.aClass1_Sub1_Sub3_2.method505();
					local842 = this.aClass1_Sub1_Sub3_2.method510();
					Class6.aClass6Array1[local157].aString18 = local842;
					if (Class6.aClass6Array1[local157].anInt424 == this.anIntArray77[this.anInt297]) {
						this.aBoolean78 = true;
					}
					this.anInt406 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt406 + "," + this.anInt405 + " - " + this.anInt207 + "," + this.anInt208);
				this.method141();
			} catch (@Pc(3623) IOException local3623) {
				this.method115();
			} catch (@Pc(3628) Exception local3628) {
				local831 = "T2 - " + this.anInt406 + "," + this.anInt207 + "," + this.anInt208 + " - " + this.anInt405 + "," + (this.anInt356 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0]) + "," + (this.anInt357 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0]) + " - ";
				for (local178 = 0; local178 < this.anInt405 && local178 < 50; local178++) {
					local831 = local831 + this.aClass1_Sub1_Sub3_2.aByteArray9[local178] + ",";
				}
				signlink.reporterror(local831);
				this.method141();
			}
			return true;
		} catch (@Pc(3709) RuntimeException local3709) {
			signlink.reporterror("55239, " + 41 + ", " + local3709.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mb;II)V")
	private void method171(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt243; local3++) {
				@Pc(10) int local10 = this.anIntArray48[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local10];
				@Pc(18) int local18 = arg0.method503();
				if ((local18 & 0x80) == 128) {
					local18 += arg0.method503() << 8;
				}
				this.method188(local10, local18, arg0, local15);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("73731, " + arg0 + ", " + arg1 + ", " + -288 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!mb;)V")
	private void method172(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt767 + 10 < arg0 * 8) {
					@Pc(15) int local15 = arg1.method514(11, this.anInt275);
					if (local15 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local15] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15].method39(this.aClass1_Sub1_Sub3Array1[local15]);
							}
						}
						this.anIntArray47[this.anInt242++] = local15;
						@Pc(61) Class1_Sub1_Sub1_Sub1_Sub1 local61 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15];
						local61.anInt1034 = anInt209;
						@Pc(70) int local70 = arg1.method514(5, this.anInt275);
						if (local70 > 15) {
							local70 -= 32;
						}
						@Pc(80) int local80 = arg1.method514(5, this.anInt275);
						if (local80 > 15) {
							local80 -= 32;
						}
						@Pc(90) int local90 = arg1.method514(1, this.anInt275);
						local61.method694(local90 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0] + local80, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0] + local70);
						@Pc(117) int local117 = arg1.method514(1, this.anInt275);
						if (local117 == 1) {
							this.anIntArray48[this.anInt243++] = local15;
						}
						continue;
					}
				}
				arg1.method515();
				return;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("60697, " + arg0 + ", " + -700 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method173() {
		try {
			if (super.anInt199 == 1) {
				@Pc(18) int local18 = super.anInt200 - 25 - 550;
				@Pc(25) int local25 = super.anInt201 - 5 - 4;
				if (local18 >= 0 && local25 >= 0 && local18 < 146 && local25 < 151) {
					local18 -= 73;
					local25 -= 75;
					@Pc(45) int local45 = this.anInt332 + this.anInt349 & 0x7FF;
					@Pc(49) int local49 = Class1_Sub1_Sub2_Sub1.anIntArray170[local45];
					@Pc(53) int local53 = Class1_Sub1_Sub2_Sub1.anIntArray171[local45];
					@Pc(62) int local62 = local49 * (this.anInt360 + 256) >> 8;
					@Pc(71) int local71 = local53 * (this.anInt360 + 256) >> 8;
					@Pc(81) int local81 = local25 * local62 + local18 * local71 >> 11;
					@Pc(91) int local91 = local25 * local71 - local18 * local62 >> 11;
					@Pc(98) int local98 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 + local81 >> 7;
					@Pc(105) int local105 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 - local91 >> 7;
					@Pc(126) boolean local126 = this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], local98, true, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], local105, 0, 0, 0, 1);
					if (local126) {
						this.aClass1_Sub1_Sub3_3.method493(local18);
						this.aClass1_Sub1_Sub3_3.method493(local25);
						this.aClass1_Sub1_Sub3_3.method494(this.anInt332);
						this.aClass1_Sub1_Sub3_3.method493(57);
						this.aClass1_Sub1_Sub3_3.method493(this.anInt349);
						this.aClass1_Sub1_Sub3_3.method493(this.anInt360);
						this.aClass1_Sub1_Sub3_3.method493(89);
						this.aClass1_Sub1_Sub3_3.method494(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994);
						this.aClass1_Sub1_Sub3_3.method494(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995);
						this.aClass1_Sub1_Sub3_3.method493(this.anInt397);
						this.aClass1_Sub1_Sub3_3.method493(63);
						return;
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("74110, " + 8 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIB)V")
	private void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_6.method415(arg0, arg1);
			this.aClass1_Sub1_Sub2_Sub3_7.method415(arg0, arg1 + arg3 - 16);
			Class1_Sub1_Sub2.method462(16, this.anInt300, arg1 + 16, arg3 - 32, arg0);
			@Pc(35) int local35 = (arg3 - 32) * arg3 / arg4;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg3 - local35 - 32) * arg2 / (arg4 - arg3);
			Class1_Sub1_Sub2.method462(16, this.anInt280, arg1 + local52 + 16, local35, arg0);
			Class1_Sub1_Sub2.method467(arg1 + local52 + 16, arg0, this.anInt306, local35);
			Class1_Sub1_Sub2.method467(arg1 + local52 + 16, arg0 + 1, this.anInt306, local35);
			Class1_Sub1_Sub2.method465(this.anInt306, 16, arg0, arg1 + local52 + 16, (byte) 2);
			Class1_Sub1_Sub2.method465(this.anInt306, 16, arg0, arg1 + local52 + 17, (byte) 2);
			Class1_Sub1_Sub2.method467(arg1 + local52 + 16, arg0 + 15, this.anInt222, local35);
			Class1_Sub1_Sub2.method467(arg1 + local52 + 17, arg0 + 14, this.anInt222, local35 - 1);
			Class1_Sub1_Sub2.method465(this.anInt222, 16, arg0, arg1 + local52 + local35 + 15, (byte) 2);
			Class1_Sub1_Sub2.method465(this.anInt222, 15, arg0 + 1, arg1 + 14 + local52 + local35, (byte) 2);
			if (this.aByte11 == -17) {
				;
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("98093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -17 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method175() {
		try {
			signlink.anInt917 = 0;
			signlink.midi = "stop";
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("77508, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method176() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method534(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method536(633)) {
				if (local6.anInt456 != this.anInt391 || anInt209 > local6.anInt462) {
					local6.method690();
				} else if (anInt209 >= local6.anInt461) {
					if (local6.anInt465 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt465 - 1];
						if (local36 != null && local36.anInt994 >= 0 && local36.anInt994 < 13312 && local36.anInt995 >= 0 && local36.anInt995 < 13312) {
							local6.method234(local36.anInt994, this.method181(local36.anInt994, 526, local36.anInt995, local6.anInt456) - local6.anInt460, local36.anInt995, anInt209);
						}
					}
					if (local6.anInt465 < 0) {
						@Pc(81) int local81 = -local6.anInt465 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub1 local87;
						if (local81 == this.anInt384) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						}
						if (local87 != null && local87.anInt994 >= 0 && local87.anInt994 < 13312 && local87.anInt995 >= 0 && local87.anInt995 < 13312) {
							local6.method234(local87.anInt994, this.method181(local87.anInt994, 526, local87.anInt995, local6.anInt456) - local6.anInt460, local87.anInt995, anInt209);
						}
					}
					local6.method235(this.anInt255);
					this.aClass36_1.method559(this.anInt391, (int) local6.aDouble1, local6, (int) local6.aDouble3, false, (int) local6.aDouble2, local6.anInt466, 60, -1);
				}
			}
			anInt343++;
			if (anInt343 > 1174) {
				anInt343 = 0;
				this.aClass1_Sub1_Sub3_3.method492(51);
				this.aClass1_Sub1_Sub3_3.method493(0);
				@Pc(195) int local195 = this.aClass1_Sub1_Sub3_3.anInt766;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method494(11499);
				}
				this.aClass1_Sub1_Sub3_3.method494(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method493(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method493(94);
				}
				this.aClass1_Sub1_Sub3_3.method494(51693);
				this.aClass1_Sub1_Sub3_3.method493(16);
				this.aClass1_Sub1_Sub3_3.method494(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method493(65);
				}
				this.aClass1_Sub1_Sub3_3.method493((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_3.method494(22990);
				this.aClass1_Sub1_Sub3_3.method502(this.aClass1_Sub1_Sub3_3.anInt766 - local195);
			}
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("35643, " + 4 + ", " + local269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!mb;I)V")
	private void method177(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt767 + 21 < arg0 * 8) {
					@Pc(13) int local13 = arg1.method514(14, this.anInt275);
					if (local13 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local13] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local13] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(33) Class1_Sub1_Sub1_Sub1_Sub2 local33 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local13];
						this.anIntArray41[this.anInt217++] = local13;
						local33.anInt1034 = anInt209;
						local33.aClass15_2 = Class15.method352(arg1.method514(11, this.anInt275));
						local33.anInt997 = local33.aClass15_2.aByte26;
						local33.anInt1037 = local33.aClass15_2.anInt595;
						local33.anInt1000 = local33.aClass15_2.anInt582;
						local33.anInt1001 = local33.aClass15_2.anInt583;
						local33.anInt1002 = local33.aClass15_2.anInt584;
						local33.anInt1003 = local33.aClass15_2.anInt585;
						local33.anInt998 = local33.aClass15_2.anInt581;
						@Pc(96) int local96 = arg1.method514(5, this.anInt275);
						if (local96 > 15) {
							local96 -= 32;
						}
						@Pc(106) int local106 = arg1.method514(5, this.anInt275);
						if (local106 > 15) {
							local106 -= 32;
						}
						local33.method694(false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0] + local106, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0] + local96);
						@Pc(132) int local132 = arg1.method514(1, this.anInt275);
						if (local132 == 1) {
							this.anIntArray48[this.anInt243++] = local13;
						}
						continue;
					}
				}
				arg1.method515();
				return;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("18740, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method178() {
		try {
			@Pc(6) int local6 = this.anInt335 * 128 + 64;
			@Pc(13) int local13 = this.anInt336 * 128 + 64;
			@Pc(24) int local24 = this.method181(local6, 526, local13, this.anInt391) - this.anInt337;
			if (this.anInt392 < local6) {
				this.anInt392 += this.anInt338 + (local6 - this.anInt392) * this.anInt339 / 1000;
				if (this.anInt392 > local6) {
					this.anInt392 = local6;
				}
			}
			if (this.anInt392 > local6) {
				this.anInt392 -= this.anInt338 + (this.anInt392 - local6) * this.anInt339 / 1000;
				if (this.anInt392 < local6) {
					this.anInt392 = local6;
				}
			}
			if (this.anInt393 < local24) {
				this.anInt393 += this.anInt338 + (local24 - this.anInt393) * this.anInt339 / 1000;
				if (this.anInt393 > local24) {
					this.anInt393 = local24;
				}
			}
			if (this.anInt393 > local24) {
				this.anInt393 -= this.anInt338 + (this.anInt393 - local24) * this.anInt339 / 1000;
				if (this.anInt393 < local24) {
					this.anInt393 = local24;
				}
			}
			if (this.anInt394 < local13) {
				this.anInt394 += this.anInt338 + (local13 - this.anInt394) * this.anInt339 / 1000;
				if (this.anInt394 > local13) {
					this.anInt394 = local13;
				}
			}
			if (this.anInt394 > local13) {
				this.anInt394 -= this.anInt338 + (this.anInt394 - local13) * this.anInt339 / 1000;
				if (this.anInt394 < local13) {
					this.anInt394 = local13;
				}
			}
			local6 = this.anInt226 * 128 + 64;
			local13 = this.anInt227 * 128 + 64;
			this.anInt405 += 0;
			local24 = this.method181(local6, 526, local13, this.anInt391) - this.anInt228;
			@Pc(228) int local228 = local6 - this.anInt392;
			@Pc(233) int local233 = local24 - this.anInt393;
			@Pc(238) int local238 = local13 - this.anInt394;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt395 < local260) {
				this.anInt395 += this.anInt229 + (local260 - this.anInt395) * this.anInt230 / 1000;
				if (this.anInt395 > local260) {
					this.anInt395 = local260;
				}
			}
			if (this.anInt395 > local260) {
				this.anInt395 -= this.anInt229 + (this.anInt395 - local260) * this.anInt230 / 1000;
				if (this.anInt395 < local260) {
					this.anInt395 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt396;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt396 += this.anInt229 + local342 * this.anInt230 / 1000;
				this.anInt396 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt396 -= this.anInt229 + -local342 * this.anInt230 / 1000;
				this.anInt396 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt396;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt396 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("8843, " + 0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method179() {
		try {
			this.aBoolean76 = true;
			this.anInt405 += 0;
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				this.anIntArray78[local12] = -1;
				for (@Pc(21) int local21 = 0; local21 < Class25.anInt772; local21++) {
					if (!Class25.aClass25Array1[local21].aBoolean187 && Class25.aClass25Array1[local21].anInt773 == local12 + (this.aBoolean74 ? 0 : 7)) {
						this.anIntArray78[local12] = local21;
						break;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("3389, " + 0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method87() {
		try {
			if (this.aBoolean56 || this.aBoolean75 || this.aBoolean44) {
				this.method112();
			} else {
				anInt385++;
				if (this.aBoolean81) {
					this.method165((byte) 3);
				} else {
					this.method94(false);
				}
				this.anInt220 = 0;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("63644, " + false + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg3;
			if (arg3 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg3 + 1;
			}
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(105) int local105 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local41 >> 7;
			@Pc(109) boolean local109 = false;
			return local73 * (128 - local45) + local105 * local45 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("33485, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method182(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt400;
			@Pc(5) int local5 = this.anInt401;
			@Pc(8) int local8 = this.anInt402;
			@Pc(11) int local11 = this.anInt403;
			Class1_Sub1_Sub2.method462(local8, 6116423, local5, local11, local2);
			@Pc(24) boolean local24 = false;
			Class1_Sub1_Sub2.method462(local8 - 2, 0, local5 + 1, 16, local2 + 1);
			Class1_Sub1_Sub2.method463(local2 + 1, local8 - 2, local11 - 19, local5 + 18, 0);
			this.aClass1_Sub1_Sub2_Sub4_3.method472("Choose Option", 6116423, local5 + 14, local2 + 3);
			@Pc(67) int local67 = super.anInt194;
			@Pc(70) int local70 = super.anInt195;
			if (this.anInt399 == 0) {
				local67 -= 4;
				local70 -= 4;
			}
			if (this.anInt399 == 1) {
				local67 -= 553;
				local70 -= 205;
			}
			if (this.anInt399 == 2) {
				local67 -= 17;
				local70 -= 357;
			}
			for (@Pc(89) int local89 = 0; local89 < this.anInt308; local89++) {
				@Pc(104) int local104 = local5 + (this.anInt308 - 1 - local89) * 15 + 31;
				@Pc(106) int local106 = 16777215;
				if (local67 > local2 && local67 < local2 + local8 && local70 > local104 - 13 && local70 < local104 + 3) {
					local106 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method474(local104, this.aStringArray4[local89], local2 + 3, true, local106);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("97806, " + arg0 + ", " + local147.toString());
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
				return new URL("http://127.0.0.1:" + (anInt310 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;)V")
	private void method185(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray62.length; local11++) {
				this.anIntArray62[local11] = 0;
			}
			@Pc(36) int local36;
			for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
				local36 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray62[local36] = (int) (Math.random() * 256.0D);
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local36 = 0; local36 < 20; local36++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray63[local66] = (this.anIntArray62[local66 - 1] + this.anIntArray62[local66 + 1] + this.anIntArray62[local66 - 128] + this.anIntArray62[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray62;
				this.anIntArray62 = this.anIntArray63;
				this.anIntArray63 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt671; local58++) {
					for (local66 = 0; local66 < arg0.anInt670; local66++) {
						if (arg0.aByteArray7[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt672 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt673 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray62[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("6146, " + 606 + ", " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method186(@OriginalArg(0) byte arg0) {
		try {
			anInt353++;
			@Pc(10) boolean local10 = false;
			if (anInt353 > 192) {
				anInt353 = 0;
				this.aClass1_Sub1_Sub3_3.method492(226);
				this.aClass1_Sub1_Sub3_3.method493(232);
			}
			while (true) {
				@Pc(32) int local32;
				do {
					while (true) {
						local32 = this.method83();
						if (local32 == -1) {
							return;
						}
						if (this.anInt210 != -1 && this.anInt210 == this.anInt296) {
							if (local32 == 8 && this.aString13.length() > 0) {
								this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
							}
							break;
						}
						@Pc(212) int local212;
						if (this.aBoolean79) {
							if (local32 >= 32 && local32 <= 122 && this.aString9.length() < 80) {
								this.aString9 = this.aString9 + (char) local32;
								this.aBoolean70 = true;
							}
							if (local32 == 8 && this.aString9.length() > 0) {
								this.aString9 = this.aString9.substring(0, this.aString9.length() - 1);
								this.aBoolean70 = true;
							}
							if (local32 == 13 || local32 == 10) {
								this.aBoolean79 = false;
								this.aBoolean70 = true;
								@Pc(172) long local172;
								if (this.anInt341 == 1) {
									local172 = Class49.method700(this.aString9);
									this.method97(local172);
								}
								if (this.anInt341 == 2 && this.anInt380 > 0) {
									local172 = Class49.method700(this.aString9);
									this.method109((byte) 8, local172);
								}
								if (this.anInt341 == 3 && this.aString9.length() > 0) {
									this.aClass1_Sub1_Sub3_3.method492(214);
									this.aClass1_Sub1_Sub3_3.method493(0);
									local212 = this.aClass1_Sub1_Sub3_3.anInt766;
									this.aClass1_Sub1_Sub3_3.method499(this.aLong16);
									Class2.method43(this.aString9, this.aClass1_Sub1_Sub3_3);
									this.aClass1_Sub1_Sub3_3.method502(this.aClass1_Sub1_Sub3_3.anInt766 - local212);
									this.aString9 = Class49.method705(this.aString9);
									this.aString9 = Class44.method629(this.aString9);
									this.method205(this.aString9, Class49.method704(Class49.method701(586, this.aLong16)), 6);
									if (this.anInt417 == 2) {
										this.anInt417 = 1;
										this.aBoolean53 = true;
										this.aClass1_Sub1_Sub3_3.method492(129);
										this.aClass1_Sub1_Sub3_3.method493(this.anInt250);
										this.aClass1_Sub1_Sub3_3.method493(this.anInt417);
										this.aClass1_Sub1_Sub3_3.method493(this.anInt267);
									}
								}
								if (this.anInt341 == 4 && this.anInt324 < 100) {
									local172 = Class49.method700(this.aString9);
									this.method126(local172);
								}
								if (this.anInt341 == 5 && this.anInt324 > 0) {
									local172 = Class49.method700(this.aString9);
									this.method138(local172);
								}
							}
						} else if (this.aBoolean73) {
							if (local32 >= 48 && local32 <= 57 && this.aString17.length() < 10) {
								this.aString17 = this.aString17 + (char) local32;
								this.aBoolean70 = true;
							}
							if (local32 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean70 = true;
							}
							if (local32 == 13 || local32 == 10) {
								if (this.aString17.length() > 0) {
									local212 = 0;
									try {
										local212 = Integer.parseInt(this.aString17);
									} catch (@Pc(388) Exception local388) {
									}
									this.aClass1_Sub1_Sub3_3.method492(161);
									this.aClass1_Sub1_Sub3_3.method497(local212);
								}
								this.aBoolean73 = false;
								this.aBoolean70 = true;
							}
						} else if (this.anInt223 == -1) {
							if (local32 >= 32 && local32 <= 122 && this.aString14.length() < 80) {
								this.aString14 = this.aString14 + (char) local32;
								this.aBoolean70 = true;
							}
							if (local32 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
								this.aBoolean70 = true;
							}
							if ((local32 == 13 || local32 == 10) && this.aString14.length() > 0) {
								if (this.anInt373 == 2) {
									if (this.aString14.equals("::clientdrop")) {
										this.method115();
									}
									if (this.aString14.equals("::lag")) {
										this.method113();
									}
									if (this.aString14.equals("::prefetchmusic")) {
										for (local212 = 0; local212 < this.aClass45_Sub1_1.method662(2); local212++) {
											this.aClass45_Sub1_1.method672(local212, (byte) 1, 2);
										}
									}
								}
								if (this.aString14.startsWith("::")) {
									this.aClass1_Sub1_Sub3_3.method492(86);
									this.aClass1_Sub1_Sub3_3.method493(this.aString14.length() - 1);
									this.aClass1_Sub1_Sub3_3.method500(this.aString14.substring(2));
								} else {
									@Pc(539) byte local539 = 0;
									if (this.aString14.startsWith("yellow:")) {
										local539 = 0;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("red:")) {
										local539 = 1;
										this.aString14 = this.aString14.substring(4);
									}
									if (this.aString14.startsWith("green:")) {
										local539 = 2;
										this.aString14 = this.aString14.substring(6);
									}
									if (this.aString14.startsWith("cyan:")) {
										local539 = 3;
										this.aString14 = this.aString14.substring(5);
									}
									if (this.aString14.startsWith("purple:")) {
										local539 = 4;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("white:")) {
										local539 = 5;
										this.aString14 = this.aString14.substring(6);
									}
									if (this.aString14.startsWith("flash1:")) {
										local539 = 6;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("flash2:")) {
										local539 = 7;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("flash3:")) {
										local539 = 8;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("glow1:")) {
										local539 = 9;
										this.aString14 = this.aString14.substring(6);
									}
									if (this.aString14.startsWith("glow2:")) {
										local539 = 10;
										this.aString14 = this.aString14.substring(6);
									}
									if (this.aString14.startsWith("glow3:")) {
										local539 = 11;
										this.aString14 = this.aString14.substring(6);
									}
									@Pc(697) byte local697 = 0;
									if (this.aString14.startsWith("wave:")) {
										local697 = 1;
										this.aString14 = this.aString14.substring(5);
									}
									if (this.aString14.startsWith("scroll:")) {
										local697 = 2;
										this.aString14 = this.aString14.substring(7);
									}
									this.aClass1_Sub1_Sub3_3.method492(83);
									this.aClass1_Sub1_Sub3_3.method493(0);
									@Pc(736) int local736 = this.aClass1_Sub1_Sub3_3.anInt766;
									this.aClass1_Sub1_Sub3_3.method493(local539);
									this.aClass1_Sub1_Sub3_3.method493(local697);
									Class2.method43(this.aString14, this.aClass1_Sub1_Sub3_3);
									this.aClass1_Sub1_Sub3_3.method502(this.aClass1_Sub1_Sub3_3.anInt766 - local736);
									this.aString14 = Class49.method705(this.aString14);
									this.aString14 = Class44.method629(this.aString14);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString14;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 = local539;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1007 = local697;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 = 150;
									if (this.anInt373 == 2) {
										this.method205(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2);
									} else if (this.anInt373 == 1) {
										this.method205(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2);
									} else {
										this.method205(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2);
									}
									if (this.anInt250 == 2) {
										this.anInt250 = 3;
										this.aBoolean53 = true;
										this.aClass1_Sub1_Sub3_3.method492(129);
										this.aClass1_Sub1_Sub3_3.method493(this.anInt250);
										this.aClass1_Sub1_Sub3_3.method493(this.anInt417);
										this.aClass1_Sub1_Sub3_3.method493(this.anInt267);
									}
								}
								this.aString14 = "";
								this.aBoolean70 = true;
							}
						}
					}
				} while ((local32 < 97 || local32 > 122) && (local32 < 65 || local32 > 90) && (local32 < 48 || local32 > 57) && local32 != 32);
				if (this.aString13.length() < 12) {
					this.aString13 = this.aString13 + (char) local32;
				}
			}
		} catch (@Pc(872) RuntimeException local872) {
			signlink.reporterror("58888, " + arg0 + ", " + local872.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method187() {
		try {
			this.anInt329++;
			this.method217(true);
			this.method221(true, (byte) 9);
			this.method217(false);
			this.method221(false, (byte) 9);
			this.method176();
			this.method133();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean50) {
				local35 = this.anInt331;
				if (this.anInt273 / 256 > local35) {
					local35 = this.anInt273 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray53[4] + 128 > local35) {
					local35 = this.anIntArray53[4] + 128;
				}
				local74 = this.anInt332 + this.anInt289 & 0x7FF;
				this.method167(this.anInt271, local74, this.method181(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994, 526, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995, this.anInt391) - 50, this.anInt270, local35 * 3 + 600, local35);
			}
			if (this.aBoolean50) {
				local35 = this.method169();
			} else {
				local35 = this.method168();
			}
			local74 = this.anInt392;
			@Pc(118) int local118 = this.anInt393;
			@Pc(121) int local121 = this.anInt394;
			@Pc(124) int local124 = this.anInt395;
			@Pc(127) int local127 = this.anInt396;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray4[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray51[local129] * 2 + 1) - (double) this.anIntArray51[local129] + Math.sin((double) this.anIntArray67[local129] * ((double) this.anIntArray40[local129] / 100.0D)) * (double) this.anIntArray53[local129]);
					if (local129 == 0) {
						this.anInt392 += local176;
					}
					if (local129 == 1) {
						this.anInt393 += local176;
					}
					if (local129 == 2) {
						this.anInt394 += local176;
					}
					if (local129 == 3) {
						this.anInt396 = this.anInt396 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt395 += local176;
						if (this.anInt395 < 128) {
							this.anInt395 = 128;
						}
						if (this.anInt395 > 383) {
							this.anInt395 = 383;
						}
					}
				}
			}
			local176 = Class1_Sub1_Sub2_Sub1.anInt576;
			Class1_Sub1_Sub1_Sub5.aBoolean110 = true;
			Class1_Sub1_Sub1_Sub5.anInt499 = 0;
			Class1_Sub1_Sub1_Sub5.anInt497 = super.anInt194 - 4;
			Class1_Sub1_Sub1_Sub5.anInt498 = super.anInt195 - 4;
			Class1_Sub1_Sub2.method460(this.anInt355);
			this.aClass36_1.method587(this.anInt394, this.anInt392, this.anInt393, this.anInt395, local35, this.anInt396);
			this.aClass36_1.method562(this.aBoolean45);
			this.method192();
			this.method108();
			this.method194(local176, this.aBoolean48);
			this.method114();
			this.aClass37_23.method600(4, super.aGraphics2, 4);
			this.anInt392 = local74;
			this.anInt393 = local118;
			this.anInt394 = local121;
			this.anInt395 = local124;
			this.anInt396 = local127;
		} catch (@Pc(327) RuntimeException local327) {
			signlink.reporterror("10159, " + 81 + ", " + local327.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!mb;Lclient!ab;)V")
	private void method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub3 arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			@Pc(14) int local14;
			if ((arg1 & 0x1) == 1) {
				local14 = arg2.method503();
				@Pc(17) byte[] local17 = new byte[local14];
				@Pc(23) Class1_Sub1_Sub3 local23 = new Class1_Sub1_Sub3(local17, true);
				arg2.method512(local14, local17);
				this.aClass1_Sub1_Sub3Array1[arg0] = local23;
				arg3.method39(local23);
			}
			@Pc(61) int local61;
			@Pc(73) int local73;
			if ((arg1 & 0x2) == 2) {
				local14 = arg2.method505();
				if (local14 == 65535) {
					local14 = -1;
				}
				if (local14 == arg3.anInt1017) {
					arg3.anInt1021 = 0;
				}
				local61 = arg2.method503();
				if (local14 == arg3.anInt1017 && local14 != -1) {
					local73 = Class29.aClass29Array1[local14].anInt815;
					if (local73 == 1) {
						arg3.anInt1018 = 0;
						arg3.anInt1019 = 0;
						arg3.anInt1020 = local61;
						arg3.anInt1021 = 0;
					}
					if (local73 == 2) {
						arg3.anInt1021 = 0;
					}
				} else if (local14 == -1 || arg3.anInt1017 == -1 || Class29.aClass29Array1[local14].anInt809 >= Class29.aClass29Array1[arg3.anInt1017].anInt809) {
					arg3.anInt1017 = local14;
					arg3.anInt1018 = 0;
					arg3.anInt1019 = 0;
					arg3.anInt1020 = local61;
					arg3.anInt1021 = 0;
					arg3.anInt1040 = arg3.anInt1038;
				}
			}
			if ((arg1 & 0x4) == 4) {
				arg3.anInt1011 = arg2.method505();
				if (arg3.anInt1011 == 65535) {
					arg3.anInt1011 = -1;
				}
			}
			if ((arg1 & 0x8) == 8) {
				arg3.aString31 = arg2.method510();
				arg3.anInt1006 = 0;
				arg3.anInt1007 = 0;
				arg3.anInt1005 = 150;
				this.method205(arg3.aString31, arg3.aString3, 2);
			}
			if ((arg1 & 0x10) == 16) {
				local14 = arg2.method503();
				local61 = arg2.method503();
				arg3.method698(anInt209, local14, local61);
				arg3.anInt1008 = anInt209 + 300;
				arg3.anInt1009 = arg2.method503();
				arg3.anInt1010 = arg2.method503();
			}
			if ((arg1 & 0x20) == 32) {
				arg3.anInt1012 = arg2.method505();
				arg3.anInt1013 = arg2.method505();
			}
			if ((arg1 & 0x40) == 64) {
				local14 = arg2.method505();
				local61 = arg2.method503();
				local73 = arg2.method503();
				@Pc(234) int local234 = arg2.anInt766;
				if (arg3.aString3 != null && arg3.aBoolean22) {
					@Pc(244) long local244 = Class49.method700(arg3.aString3);
					@Pc(246) boolean local246 = false;
					if (local61 <= 1) {
						for (@Pc(251) int local251 = 0; local251 < this.anInt324; local251++) {
							if (this.aLongArray4[local251] == local244) {
								local246 = true;
								break;
							}
						}
					}
					if (!local246 && this.anInt244 == 0) {
						try {
							@Pc(279) String local279 = Class2.method42(arg2, local73);
							@Pc(283) String local283 = Class44.method629(local279);
							arg3.aString31 = local283;
							arg3.anInt1006 = local14 >> 8;
							arg3.anInt1007 = local14 & 0xFF;
							arg3.anInt1005 = 150;
							if (local61 == 2 || local61 == 3) {
								this.method205(local283, "@cr2@" + arg3.aString3, 1);
							} else if (local61 == 1) {
								this.method205(local283, "@cr1@" + arg3.aString3, 1);
							} else {
								this.method205(local283, arg3.aString3, 2);
							}
						} catch (@Pc(347) Exception local347) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt766 = local234 + local73;
			}
			if ((arg1 & 0x100) == 256) {
				arg3.anInt1022 = arg2.method505();
				local14 = arg2.method508();
				arg3.anInt1026 = local14 >> 16;
				arg3.anInt1025 = anInt209 + (local14 & 0xFFFF);
				arg3.anInt1023 = 0;
				arg3.anInt1024 = 0;
				if (arg3.anInt1025 > anInt209) {
					arg3.anInt1023 = -1;
				}
				if (arg3.anInt1022 == 65535) {
					arg3.anInt1022 = -1;
				}
			}
			if ((arg1 & 0x200) == 512) {
				arg3.anInt1027 = arg2.method503();
				arg3.anInt1029 = arg2.method503();
				arg3.anInt1028 = arg2.method503();
				arg3.anInt1030 = arg2.method503();
				arg3.anInt1031 = arg2.method505() + anInt209;
				arg3.anInt1032 = arg2.method505() + anInt209;
				arg3.anInt1033 = arg2.method503();
				arg3.method696();
			}
			if ((arg1 & 0x400) == 1024) {
				local14 = arg2.method503();
				local61 = arg2.method503();
				arg3.method698(anInt209, local14, local61);
				arg3.anInt1008 = anInt209 + 300;
				arg3.anInt1009 = arg2.method503();
				arg3.anInt1010 = arg2.method503();
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("49731, " + arg0 + ", " + arg1 + ", " + 39 + ", " + arg2 + ", " + arg3 + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean57) {
			this.method222();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method189() {
		try {
			Class11.aClass39_4.method606();
			Class11.aClass39_5.method606();
			Class15.aClass39_6.method606();
			Class17.aClass39_7.method606();
			if (this.anInt239 != -31779) {
				this.method84();
			}
			Class17.aClass39_8.method606();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass39_1.method606();
			Class35.aClass39_9.method606();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("23555, " + -31779 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method190(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(15) int local15 = arg0.anInt427;
			if (local15 >= 1 && local15 <= 200 || !(local15 < 701 || local15 > 900)) {
				if (local15 >= 801) {
					local15 -= 701;
				} else if (local15 >= 701) {
					local15 -= 601;
				} else if (local15 >= 101) {
					local15 -= 101;
				} else {
					local15--;
				}
				this.aStringArray4[this.anInt308] = "Remove @whi@" + this.aStringArray6[local15];
				this.anIntArray58[this.anInt308] = 513;
				this.anInt308++;
				this.aStringArray4[this.anInt308] = "Message @whi@" + this.aStringArray6[local15];
				this.anIntArray58[this.anInt308] = 902;
				this.anInt308++;
				return true;
			} else if (local15 >= 401 && local15 <= 500) {
				this.aStringArray4[this.anInt308] = "Remove @whi@" + arg0.aString18;
				this.anIntArray58[this.anInt308] = 884;
				this.anInt308++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("83946, " + arg0 + ", " + 2 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method191() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[12];
			for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local33] = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "runes", local33);
			}
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(66) int local66 = 0; local66 < 33920; local66++) {
				this.aClass1_Sub1_Sub2_Sub2_12.anIntArray200[local66] = this.aClass37_15.anIntArray258[local66];
			}
			for (@Pc(84) int local84 = 0; local84 < 33920; local84++) {
				this.aClass1_Sub1_Sub2_Sub2_13.anIntArray200[local84] = this.aClass37_16.anIntArray258[local84];
			}
			this.anIntArray88 = new int[256];
			for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
				this.anIntArray88[local106] = local106 * 262144;
			}
			for (@Pc(121) int local121 = 0; local121 < 64; local121++) {
				this.anIntArray88[local121 + 64] = local121 * 1024 + 16711680;
			}
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray88[local140 + 128] = local140 * 4 + 16776960;
			}
			for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
				this.anIntArray88[local159 + 192] = 16777215;
			}
			this.anIntArray89 = new int[256];
			for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
				this.anIntArray89[local178] = local178 * 1024;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray89[local193 + 64] = local193 * 4 + 65280;
			}
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray89[local212 + 128] = local212 * 262144 + 65535;
			}
			for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
				this.anIntArray89[local231 + 192] = 16777215;
			}
			this.anIntArray90 = new int[256];
			for (@Pc(250) int local250 = 0; local250 < 64; local250++) {
				this.anIntArray90[local250] = local250 * 4;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray90[local265 + 64] = local265 * 262144 + 255;
			}
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray90[local284 + 128] = local284 * 1024 + 16711935;
			}
			for (@Pc(303) int local303 = 0; local303 < 64; local303++) {
				this.anIntArray90[local303 + 192] = 16777215;
			}
			this.anIntArray87 = new int[256];
			this.anIntArray62 = new int[32768];
			this.anIntArray63 = new int[32768];
			this.method185(null);
			this.anIntArray54 = new int[32768];
			this.anIntArray55 = new int[32768];
			this.method91(10, "Connecting to fileserver");
			if (!this.aBoolean47) {
				this.aBoolean57 = true;
				this.aBoolean47 = true;
				this.method90(this, 2);
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("99407, " + 29758 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method192() {
		try {
			this.anInt215 = 0;
			@Pc(53) int local53;
			@Pc(73) int local73;
			for (@Pc(6) int local6 = -1; local6 < this.anInt242 + this.anInt217; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local6 < this.anInt242) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray47[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray41[local6 - this.anInt242]];
				}
				if (local13 != null && local13.method697()) {
					if (local6 >= this.anInt242) {
						@Pc(146) Class15 local146 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass15_2;
						if (local146.anInt594 >= 0 && local146.anInt594 < this.aClass1_Sub1_Sub2_Sub2Array4.length) {
							this.method98(local13, local13.anInt1035 + 15);
							if (this.anInt363 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[local146.anInt594].method375(this.anInt363 - 12, this.anInt364 - 30);
							}
						}
						if (this.anInt213 == 1 && this.anInt390 == this.anIntArray41[local6 - this.anInt242] && anInt209 % 20 < 10) {
							this.method98(local13, local13.anInt1035 + 15);
							if (this.anInt363 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[2].method375(this.anInt363 - 12, this.anInt364 - 28);
							}
						}
					} else {
						local53 = 30;
						@Pc(56) Class1_Sub1_Sub1_Sub1_Sub1 local56 = (Class1_Sub1_Sub1_Sub1_Sub1) local13;
						if (local56.anInt128 != 0) {
							this.method98(local13, local13.anInt1035 + 15);
							if (this.anInt363 > -1) {
								for (local73 = 0; local73 < 8; local73++) {
									if ((local56.anInt128 & 0x1 << local73) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array4[local73].method375(this.anInt363 - 12, this.anInt364 - local53);
										local53 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt213 == 10 && this.anInt365 == this.anIntArray47[local6]) {
							this.method98(local13, local13.anInt1035 + 15);
							if (this.anInt363 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[7].method375(this.anInt363 - 12, this.anInt364 - local53);
							}
						}
					}
					if (local13.aString31 != null && (local6 >= this.anInt242 || this.anInt250 == 0 || this.anInt250 == 3 || this.anInt250 == 1 && this.method121(((Class1_Sub1_Sub1_Sub1_Sub1) local13).aString3))) {
						this.method98(local13, local13.anInt1035);
						if (this.anInt363 > -1 && this.anInt215 < this.anInt216) {
							this.anIntArray36[this.anInt215] = this.aClass1_Sub1_Sub2_Sub4_3.method471(local13.aString31) / 2;
							this.anIntArray35[this.anInt215] = this.aClass1_Sub1_Sub2_Sub4_3.anInt732;
							this.anIntArray33[this.anInt215] = this.anInt363;
							this.anIntArray34[this.anInt215] = this.anInt364;
							this.anIntArray37[this.anInt215] = local13.anInt1006;
							this.anIntArray38[this.anInt215] = local13.anInt1007;
							this.anIntArray39[this.anInt215] = local13.anInt1005;
							this.aStringArray1[this.anInt215++] = local13.aString31;
							if (this.anInt279 == 0 && local13.anInt1007 == 1) {
								this.anIntArray35[this.anInt215] += 10;
								this.anIntArray34[this.anInt215] += 5;
							}
							if (this.anInt279 == 0 && local13.anInt1007 == 2) {
								this.anIntArray36[this.anInt215] = 60;
							}
						}
					}
					if (local13.anInt1008 > anInt209) {
						this.method98(local13, local13.anInt1035 + 15);
						if (this.anInt363 > -1) {
							local53 = local13.anInt1009 * 30 / local13.anInt1010;
							if (local53 > 30) {
								local53 = 30;
							}
							Class1_Sub1_Sub2.method462(local53, 65280, this.anInt364 - 3, 5, this.anInt363 - 15);
							Class1_Sub1_Sub2.method462(30 - local53, 16711680, this.anInt364 - 3, 5, this.anInt363 + local53 - 15);
						}
					}
					for (local53 = 0; local53 < 4; local53++) {
						if (local13.anIntArray283[local53] > anInt209) {
							this.method98(local13, local13.anInt1035 / 2);
							if (this.anInt363 > -1) {
								if (local53 == 1) {
									this.anInt364 -= 20;
								}
								if (local53 == 2) {
									this.anInt363 -= 15;
									this.anInt364 -= 10;
								}
								if (local53 == 3) {
									this.anInt363 += 15;
									this.anInt364 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array7[local13.anIntArray282[local53]].method375(this.anInt363 - 12, this.anInt364 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method469(this.anInt364 + 4, this.anInt363, String.valueOf(local13.anIntArray281[local53]), 0);
								this.aClass1_Sub1_Sub2_Sub4_1.method469(this.anInt364 + 3, this.anInt363 - 1, String.valueOf(local13.anIntArray281[local53]), 16777215);
							}
						}
					}
				}
			}
			for (@Pc(558) int local558 = 0; local558 < this.anInt215; local558++) {
				local53 = this.anIntArray33[local558];
				@Pc(570) int local570 = this.anIntArray34[local558];
				local73 = this.anIntArray36[local558];
				@Pc(580) int local580 = this.anIntArray35[local558];
				@Pc(582) boolean local582 = true;
				while (local582) {
					local582 = false;
					for (@Pc(588) int local588 = 0; local588 < local558; local588++) {
						if (local570 + 2 > this.anIntArray34[local588] - this.anIntArray35[local588] && local570 - local580 < this.anIntArray34[local588] + 2 && local53 - local73 < this.anIntArray33[local588] + this.anIntArray36[local588] && local53 + local73 > this.anIntArray33[local588] - this.anIntArray36[local588] && this.anIntArray34[local588] - this.anIntArray35[local588] < local570) {
							local570 = this.anIntArray34[local588] - this.anIntArray35[local588];
							local582 = true;
						}
					}
				}
				this.anInt363 = this.anIntArray33[local558];
				this.anInt364 = this.anIntArray34[local558] = local570;
				@Pc(687) String local687 = this.aStringArray1[local558];
				if (this.anInt279 == 0) {
					@Pc(692) int local692 = 16776960;
					if (this.anIntArray37[local558] < 6) {
						local692 = this.anIntArray68[this.anIntArray37[local558]];
					}
					if (this.anIntArray37[local558] == 6) {
						local692 = this.anInt329 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray37[local558] == 7) {
						local692 = this.anInt329 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray37[local558] == 8) {
						local692 = this.anInt329 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(767) int local767;
					if (this.anIntArray37[local558] == 9) {
						local767 = 150 - this.anIntArray39[local558];
						if (local767 < 50) {
							local692 = local767 * 1280 + 16711680;
						} else if (local767 < 100) {
							local692 = 16776960 - (local767 - 50) * 327680;
						} else if (local767 < 150) {
							local692 = (local767 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray37[local558] == 10) {
						local767 = 150 - this.anIntArray39[local558];
						if (local767 < 50) {
							local692 = local767 * 5 + 16711680;
						} else if (local767 < 100) {
							local692 = 16711935 - (local767 - 50) * 327680;
						} else if (local767 < 150) {
							local692 = (local767 - 100) * 327680 + 255 - (local767 - 100) * 5;
						}
					}
					if (this.anIntArray37[local558] == 11) {
						local767 = 150 - this.anIntArray39[local558];
						if (local767 < 50) {
							local692 = 16777215 - local767 * 327685;
						} else if (local767 < 100) {
							local692 = (local767 - 50) * 327685 + 65280;
						} else if (local767 < 150) {
							local692 = 16777215 - (local767 - 100) * 327680;
						}
					}
					if (this.anIntArray38[local558] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt364 + 1, this.anInt363, local687, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt364, this.anInt363, local687, local692);
					}
					if (this.anIntArray38[local558] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method473(local687, this.anInt363, this.anInt329, this.anInt364 + 1, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method473(local687, this.anInt363, this.anInt329, this.anInt364, local692);
					}
					if (this.anIntArray38[local558] == 2) {
						local767 = this.aClass1_Sub1_Sub2_Sub4_3.method471(local687);
						@Pc(988) int local988 = (150 - this.anIntArray39[local558]) * (local767 + 100) / 150;
						Class1_Sub1_Sub2.method459(334, 0, this.anInt363 - 50, this.anInt363 + 50);
						this.aClass1_Sub1_Sub2_Sub4_3.method472(local687, 0, this.anInt364 + 1, this.anInt363 + 50 - local988);
						this.aClass1_Sub1_Sub2_Sub4_3.method472(local687, local692, this.anInt364, this.anInt363 + 50 - local988);
						Class1_Sub1_Sub2.method458();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt364 + 1, this.anInt363, local687, 0);
					this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt364, this.anInt363, local687, 16776960);
				}
			}
		} catch (@Pc(1071) RuntimeException local1071) {
			signlink.reporterror("14141, " + -34 + ", " + local1071.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;IZ)V")
	private void method193(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) int local7 = arg0.method514(8, this.anInt275);
			@Pc(13) int local13;
			if (local7 < this.anInt242) {
				for (local13 = local7; local13 < this.anInt242; local13++) {
					this.anIntArray70[this.anInt320++] = this.anIntArray47[local13];
				}
			}
			if (local7 > this.anInt242) {
				signlink.reporterror(this.aString6 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt242 = 0;
			for (local13 = 0; local13 < local7; local13++) {
				@Pc(70) int local70 = this.anIntArray47[local13];
				@Pc(75) Class1_Sub1_Sub1_Sub1_Sub1 local75 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local70];
				@Pc(81) int local81 = arg0.method514(1, this.anInt275);
				if (local81 == 0) {
					this.anIntArray47[this.anInt242++] = local70;
					local75.anInt1034 = anInt209;
				} else {
					@Pc(105) int local105 = arg0.method514(2, this.anInt275);
					if (local105 == 0) {
						this.anIntArray47[this.anInt242++] = local70;
						local75.anInt1034 = anInt209;
						this.anIntArray48[this.anInt243++] = local70;
					} else {
						@Pc(157) int local157;
						@Pc(168) int local168;
						if (local105 == 1) {
							this.anIntArray47[this.anInt242++] = local70;
							local75.anInt1034 = anInt209;
							local157 = arg0.method514(3, this.anInt275);
							local75.method695(local157, false);
							local168 = arg0.method514(1, this.anInt275);
							if (local168 == 1) {
								this.anIntArray48[this.anInt243++] = local70;
							}
						} else if (local105 == 2) {
							this.anIntArray47[this.anInt242++] = local70;
							local75.anInt1034 = anInt209;
							local157 = arg0.method514(3, this.anInt275);
							local75.method695(local157, true);
							local168 = arg0.method514(3, this.anInt275);
							local75.method695(local168, true);
							@Pc(229) int local229 = arg0.method514(1, this.anInt275);
							if (local229 == 1) {
								this.anIntArray48[this.anInt243++] = local70;
							}
						} else if (local105 == 3) {
							this.anIntArray70[this.anInt320++] = local70;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("99215, " + arg0 + ", " + arg1 + ", " + false + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method88() {
		try {
			this.aBoolean54 = true;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("98990, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
	private void method194(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1 && !aBoolean65) {
				@Pc(15) Class1_Sub1_Sub2_Sub3 local15;
				@Pc(23) int local23;
				@Pc(31) int local31;
				@Pc(34) byte[] local34;
				@Pc(37) byte[] local37;
				@Pc(39) int local39;
				if (Class1_Sub1_Sub2_Sub1.anIntArray174[17] >= arg0) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local23 = local15.anInt670 * local15.anInt671 - 1;
					local31 = local15.anInt670 * this.anInt255 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray1;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray1 = local34;
					Class1_Sub1_Sub2_Sub1.method340(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray174[24] >= arg0) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local23 = local15.anInt670 * local15.anInt671 - 1;
					local31 = local15.anInt670 * this.anInt255 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray1;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray1 = local34;
					Class1_Sub1_Sub2_Sub1.method340(24);
					return;
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("60495, " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method195(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt323 == 2) {
				for (@Pc(18) Class1_Sub2 local18 = (Class1_Sub2) this.aClass31_3.method534(); local18 != null; local18 = (Class1_Sub2) this.aClass31_3.method536(633)) {
					if (local18.anInt804 > 0) {
						local18.anInt804--;
					}
					if (local18.anInt804 != 0) {
						if (local18.anInt803 > 0) {
							local18.anInt803--;
						}
						if (local18.anInt803 == 0 && local18.anInt795 >= 1 && local18.anInt796 >= 1 && local18.anInt795 <= 102 && local18.anInt796 <= 102 && (local18.anInt800 < 0 || Class4.method68(local18.anInt800, local18.anInt802))) {
							this.method219(local18.anInt796, local18.anInt794, local18.anInt795, local18.anInt793, local18.anInt801, local18.anInt802, local18.anInt800);
							local18.anInt803 = -1;
							if (local18.anInt800 == local18.anInt797 && local18.anInt797 == -1) {
								local18.method690();
							} else if (local18.anInt800 == local18.anInt797 && local18.anInt801 == local18.anInt798 && local18.anInt802 == local18.anInt799) {
								local18.method690();
							}
						}
					} else if (local18.anInt797 < 0 || Class4.method68(local18.anInt797, local18.anInt799)) {
						this.method219(local18.anInt796, local18.anInt794, local18.anInt795, local18.anInt793, local18.anInt798, local18.anInt799, local18.anInt797);
						local18.method690();
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("66667, " + arg0 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method196() {
		try {
			try {
				@Pc(16) int local16 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 + this.anInt234;
				@Pc(22) int local22 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 + this.anInt386;
				if (this.anInt270 - local16 < -500 || this.anInt270 - local16 > 500 || this.anInt271 - local22 < -500 || this.anInt271 - local22 > 500) {
					this.anInt270 = local16;
					this.anInt271 = local22;
				}
				if (this.anInt270 != local16) {
					this.anInt270 += (local16 - this.anInt270) / 16;
				}
				if (this.anInt271 != local22) {
					this.anInt271 += (local22 - this.anInt271) / 16;
				}
				if (super.anIntArray28[1] == 1) {
					this.anInt333 += (-this.anInt333 - 24) / 2;
				} else if (super.anIntArray28[2] == 1) {
					this.anInt333 += (24 - this.anInt333) / 2;
				} else {
					this.anInt333 /= 2;
				}
				if (super.anIntArray28[3] == 1) {
					this.anInt334 += (12 - this.anInt334) / 2;
				} else if (super.anIntArray28[4] == 1) {
					this.anInt334 += (-this.anInt334 - 12) / 2;
				} else {
					this.anInt334 /= 2;
				}
				this.anInt332 = this.anInt332 + this.anInt333 / 2 & 0x7FF;
				this.anInt331 += this.anInt334 / 2;
				if (this.anInt331 < 128) {
					this.anInt331 = 128;
				}
				if (this.anInt331 > 383) {
					this.anInt331 = 383;
				}
				@Pc(209) int local209 = this.anInt270 >> 7;
				@Pc(214) int local214 = this.anInt271 >> 7;
				@Pc(224) int local224 = this.method181(this.anInt270, 526, this.anInt271, this.anInt391);
				@Pc(226) int local226 = 0;
				@Pc(242) int local242;
				if (local209 > 3 && local214 > 3 && local209 < 100 && local214 < 100) {
					for (local242 = local209 - 4; local242 <= local209 + 4; local242++) {
						for (@Pc(248) int local248 = local214 - 4; local248 <= local214 + 4; local248++) {
							@Pc(253) int local253 = this.anInt391;
							if (local253 < 3 && (this.aByteArrayArrayArray7[1][local242][local248] & 0x2) == 2) {
								local253++;
							}
							@Pc(280) int local280 = local224 - this.anIntArrayArrayArray5[local253][local242][local248];
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
				if (local242 > this.anInt273) {
					this.anInt273 += (local242 - this.anInt273) / 24;
				} else if (local242 < this.anInt273) {
					this.anInt273 += (local242 - this.anInt273) / 80;
				}
			} catch (@Pc(344) Exception local344) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 + "," + this.anInt270 + "," + this.anInt271 + "," + this.anInt317 + "," + this.anInt318 + "," + this.anInt356 + "," + this.anInt357);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("12604, " + true + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZLclient!d;ZIII)V")
	private void method197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean46) {
				this.anInt345 = 32;
			} else {
				this.anInt345 = 0;
			}
			this.aBoolean46 = false;
			if (arg1 >= arg2 && arg1 < arg2 + 16 && arg6 >= arg0 && arg6 < arg0 + 16) {
				arg3.anInt434 -= this.anInt220 * 4;
				if (arg4) {
					this.aBoolean78 = true;
					return;
				}
			} else if (arg1 >= arg2 && arg1 < arg2 + 16 && arg6 >= arg0 + arg5 - 16 && arg6 < arg0 + arg5) {
				arg3.anInt434 += this.anInt220 * 4;
				if (arg4) {
					this.aBoolean78 = true;
					return;
				}
			} else if (arg1 >= arg2 - this.anInt345 && arg1 < arg2 + this.anInt345 + 16 && arg6 >= arg0 + 16 && arg6 < arg0 + arg5 - 16 && this.anInt220 > 0) {
				@Pc(120) int local120 = (arg5 - 32) * arg5 / arg7;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(135) int local135 = arg6 - arg0 - local120 / 2 - 16;
				@Pc(141) int local141 = arg5 - local120 - 32;
				arg3.anInt434 = (arg7 - arg5) * local135 / local141;
				if (arg4) {
					this.aBoolean78 = true;
				}
				this.aBoolean46 = true;
			} else {
				return;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("57848, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method198(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class6 local3 = Class6.aClass6Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray96.length && local3.anIntArray96[local5] != -1; local5++) {
				@Pc(20) Class6 local20 = Class6.aClass6Array1[local3.anIntArray96[local5]];
				if (local20.anInt425 == 1) {
					this.method198(local20.anInt423);
				}
				local20.anInt421 = 0;
				local20.anInt422 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("35835, " + arg0 + ", " + -925 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method199(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			signlink.anInt917 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("16526, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method200() {
		try {
			this.aBoolean47 = false;
			while (this.aBoolean71) {
				this.aBoolean47 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
			this.anIntArray89 = null;
			this.anIntArray90 = null;
			this.anIntArray62 = null;
			this.anIntArray63 = null;
			this.anIntArray54 = null;
			this.anIntArray55 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("4028, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;BI)I")
	private int method201(@OriginalArg(0) Class6 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg0.anIntArrayArray7 == null || arg2 >= arg0.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(26) int[] local26 = arg0.anIntArrayArray7[arg2];
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
						local39 = this.anIntArray43[local26[local30++]];
					}
					if (local37 == 2) {
						local39 = this.anIntArray64[local26[local30++]];
					}
					if (local37 == 3) {
						local39 = this.anIntArray46[local26[local30++]];
					}
					@Pc(88) Class6 local88;
					@Pc(93) int local93;
					@Pc(106) int local106;
					if (local37 == 4) {
						local88 = Class6.aClass6Array1[local26[local30++]];
						local93 = local26[local30++];
						if (local93 >= 0 && local93 < Class17.anInt623 && (!Class17.method385(local93).aBoolean156 || aBoolean64)) {
							for (local106 = 0; local106 < local88.anIntArray92.length; local106++) {
								if (local88.anIntArray92[local106] == local93 + 1) {
									local39 += local88.anIntArray93[local106];
								}
							}
						}
					}
					if (local37 == 5) {
						local39 = this.anIntArray75[local26[local30++]];
					}
					if (local37 == 6) {
						local39 = anIntArray44[this.anIntArray64[local26[local30++]] - 1];
					}
					if (local37 == 7) {
						local39 = this.anIntArray75[local26[local30++]] * 100 / 46875;
					}
					if (local37 == 8) {
						local39 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129;
					}
					@Pc(181) int local181;
					if (local37 == 9) {
						for (local181 = 0; local181 < Class32.anInt831; local181++) {
							if (Class32.aBooleanArray9[local181]) {
								local39 += this.anIntArray64[local181];
							}
						}
					}
					if (local37 == 10) {
						local88 = Class6.aClass6Array1[local26[local30++]];
						local93 = local26[local30++] + 1;
						if (local93 >= 0 && local93 < Class17.anInt623 && (!Class17.method385(local93).aBoolean156 || aBoolean64)) {
							for (local106 = 0; local106 < local88.anIntArray92.length; local106++) {
								if (local88.anIntArray92[local106] == local93) {
									local39 = 999999999;
									break;
								}
							}
						}
					}
					if (local37 == 11) {
						local39 = this.anInt287;
					}
					if (local37 == 12) {
						local39 = this.anInt298;
					}
					if (local37 == 13) {
						local181 = this.anIntArray75[local26[local30++]];
						local93 = local26[local30++];
						local39 = (local181 & 0x1 << local93) == 0 ? 0 : 1;
					}
					if (local37 == 14) {
						local181 = local26[local30++];
						@Pc(296) Class38 local296 = Class38.aClass38Array1[local181];
						local106 = local296.anInt894;
						@Pc(302) int local302 = local296.anInt895;
						@Pc(305) int local305 = local296.anInt896;
						@Pc(311) int local311 = anIntArray65[local305 - local302];
						local39 = this.anIntArray75[local106] >> local302 & local311;
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
						local39 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 >> 7) + this.anInt356;
					}
					if (local37 == 19) {
						local39 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 >> 7) + this.anInt357;
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
			} catch (@Pc(404) Exception local404) {
				return -1;
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("38038, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method203() {
		try {
			if (this.anInt281 == 0 && this.anInt301 == 0) {
				this.aStringArray4[this.anInt308] = "Walk here";
				this.anIntArray58[this.anInt308] = 718;
				this.anIntArray56[this.anInt308] = super.anInt194;
				this.anIntArray57[this.anInt308] = super.anInt195;
				this.anInt308++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub5.anInt499; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub5.anIntArray138[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(209) int local209;
					if (local65 == 2 && this.aClass36_1.method578(this.anInt391, local53, local59, local49) >= 0) {
						@Pc(91) Class11 local91 = Class11.method292(local71);
						if (this.anInt281 == 1) {
							this.aStringArray4[this.anInt308] = "Use " + this.aString8 + " with @cya@" + local91.aString23;
							this.anIntArray58[this.anInt308] = 810;
							this.anIntArray59[this.anInt308] = local49;
							this.anIntArray56[this.anInt308] = local53;
							this.anIntArray57[this.anInt308] = local59;
							this.anInt308++;
						} else if (this.anInt301 != 1) {
							if (local91.aStringArray8 != null) {
								for (local209 = 4; local209 >= 0; local209--) {
									if (local91.aStringArray8[local209] != null) {
										this.aStringArray4[this.anInt308] = local91.aStringArray8[local209] + " @cya@" + local91.aString23;
										if (local209 == 0) {
											this.anIntArray58[this.anInt308] = 625;
										}
										if (local209 == 1) {
											this.anIntArray58[this.anInt308] = 721;
										}
										if (local209 == 2) {
											this.anIntArray58[this.anInt308] = 743;
										}
										if (local209 == 3) {
											this.anIntArray58[this.anInt308] = 357;
										}
										if (local209 == 4) {
											this.anIntArray58[this.anInt308] = 1071;
										}
										this.anIntArray59[this.anInt308] = local49;
										this.anIntArray56[this.anInt308] = local53;
										this.anIntArray57[this.anInt308] = local59;
										this.anInt308++;
									}
								}
							}
							this.aStringArray4[this.anInt308] = "Examine @cya@" + local91.aString23;
							this.anIntArray58[this.anInt308] = 1381;
							this.anIntArray59[this.anInt308] = local49;
							this.anIntArray56[this.anInt308] = local53;
							this.anIntArray57[this.anInt308] = local59;
							this.anInt308++;
						} else if ((this.anInt303 & 0x4) == 4) {
							this.aStringArray4[this.anInt308] = this.aString12 + " @cya@" + local91.aString23;
							this.anIntArray58[this.anInt308] = 899;
							this.anIntArray59[this.anInt308] = local49;
							this.anIntArray56[this.anInt308] = local53;
							this.anIntArray57[this.anInt308] = local59;
							this.anInt308++;
						}
					}
					@Pc(386) Class1_Sub1_Sub1_Sub1_Sub2 local386;
					@Pc(435) Class1_Sub1_Sub1_Sub1_Sub1 local435;
					@Pc(425) int local425;
					if (local65 == 1) {
						@Pc(357) Class1_Sub1_Sub1_Sub1_Sub2 local357 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if (local357.aClass15_2.aByte26 == 1 && (local357.anInt994 & 0x7F) == 64 && (local357.anInt995 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt217; local209++) {
								local386 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray41[local209]];
								if (local386 != null && local386 != local357 && local386.aClass15_2.aByte26 == 1 && local386.anInt994 == local357.anInt994 && local386.anInt995 == local357.anInt995) {
									this.method155(local386.aClass15_2, this.anIntArray41[local209], local59, this.anInt352, local53);
								}
							}
							for (local425 = 0; local425 < this.anInt242; local425++) {
								local435 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray47[local425]];
								if (local435 != null && local435.anInt994 == local357.anInt994 && local435.anInt995 == local357.anInt995) {
									this.method213(local59, local53, this.anIntArray47[local425], local435);
								}
							}
						}
						this.method155(local357.aClass15_2, local71, local59, this.anInt352, local53);
					}
					if (local65 == 0) {
						@Pc(478) Class1_Sub1_Sub1_Sub1_Sub1 local478 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if ((local478.anInt994 & 0x7F) == 64 && (local478.anInt995 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt217; local209++) {
								local386 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray41[local209]];
								if (local386 != null && local386.aClass15_2.aByte26 == 1 && local386.anInt994 == local478.anInt994 && local386.anInt995 == local478.anInt995) {
									this.method155(local386.aClass15_2, this.anIntArray41[local209], local59, this.anInt352, local53);
								}
							}
							for (local425 = 0; local425 < this.anInt242; local425++) {
								local435 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray47[local425]];
								if (local435 != null && local435 != local478 && local435.anInt994 == local478.anInt994 && local435.anInt995 == local478.anInt995) {
									this.method213(local59, local53, this.anIntArray47[local425], local435);
								}
							}
						}
						this.method213(local59, local53, local71, local478);
					}
					if (local65 == 3) {
						@Pc(598) Class31 local598 = this.aClass31ArrayArrayArray1[this.anInt391][local53][local59];
						if (local598 != null) {
							for (@Pc(605) Class1_Sub1_Sub1_Sub3 local605 = (Class1_Sub1_Sub1_Sub3) local598.method535(); local605 != null; local605 = (Class1_Sub1_Sub1_Sub3) local598.method537()) {
								@Pc(611) Class17 local611 = Class17.method385(local605.anInt178);
								if (this.anInt281 == 1) {
									this.aStringArray4[this.anInt308] = "Use " + this.aString8 + " with @lre@" + local611.aString25;
									this.anIntArray58[this.anInt308] = 111;
									this.anIntArray59[this.anInt308] = local605.anInt178;
									this.anIntArray56[this.anInt308] = local53;
									this.anIntArray57[this.anInt308] = local59;
									this.anInt308++;
								} else if (this.anInt301 != 1) {
									for (@Pc(728) int local728 = 4; local728 >= 0; local728--) {
										if (local611.aStringArray10 != null && local611.aStringArray10[local728] != null) {
											this.aStringArray4[this.anInt308] = local611.aStringArray10[local728] + " @lre@" + local611.aString25;
											if (local728 == 0) {
												this.anIntArray58[this.anInt308] = 139;
											}
											if (local728 == 1) {
												this.anIntArray58[this.anInt308] = 778;
											}
											if (local728 == 2) {
												this.anIntArray58[this.anInt308] = 617;
											}
											if (local728 == 3) {
												this.anIntArray58[this.anInt308] = 224;
											}
											if (local728 == 4) {
												this.anIntArray58[this.anInt308] = 662;
											}
											this.anIntArray59[this.anInt308] = local605.anInt178;
											this.anIntArray56[this.anInt308] = local53;
											this.anIntArray57[this.anInt308] = local59;
											this.anInt308++;
										} else if (local728 == 2) {
											this.aStringArray4[this.anInt308] = "Take @lre@" + local611.aString25;
											this.anIntArray58[this.anInt308] = 617;
											this.anIntArray59[this.anInt308] = local605.anInt178;
											this.anIntArray56[this.anInt308] = local53;
											this.anIntArray57[this.anInt308] = local59;
											this.anInt308++;
										}
									}
									this.aStringArray4[this.anInt308] = "Examine @lre@" + local611.aString25;
									this.anIntArray58[this.anInt308] = 1152;
									this.anIntArray59[this.anInt308] = local605.anInt178;
									this.anIntArray56[this.anInt308] = local53;
									this.anIntArray57[this.anInt308] = local59;
									this.anInt308++;
								} else if ((this.anInt303 & 0x1) == 1) {
									this.aStringArray4[this.anInt308] = this.aString12 + " @lre@" + local611.aString25;
									this.anIntArray58[this.anInt308] = 370;
									this.anIntArray59[this.anInt308] = local605.anInt178;
									this.anIntArray56[this.anInt308] = local53;
									this.anIntArray57[this.anInt308] = local59;
									this.anInt308++;
								}
							}
						}
					}
				}
			}
			this.aBoolean81 &= true;
		} catch (@Pc(941) RuntimeException local941) {
			signlink.reporterror("15174, " + true + ", " + local941.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
	private void method205(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt325 != -1) {
				this.aString4 = arg0;
				super.anInt199 = 0;
			}
			if (this.anInt223 == -1) {
				this.aBoolean70 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray52[local20] = this.anIntArray52[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
			}
			this.anIntArray52[0] = arg2;
			this.aStringArray2[0] = arg1;
			this.aStringArray3[0] = arg0;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("74697, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass36_1.method578(this.anInt391, arg3, arg0, arg1);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt262++;
			if (anInt262 > 1086) {
				anInt262 = 0;
				this.aClass1_Sub1_Sub3_3.method492(225);
				this.aClass1_Sub1_Sub3_3.method493(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_3.anInt766;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method494(16791);
				}
				this.aClass1_Sub1_Sub3_3.method493(254);
				this.aClass1_Sub1_Sub3_3.method494((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_3.method494(16128);
				this.aClass1_Sub1_Sub3_3.method494(52610);
				this.aClass1_Sub1_Sub3_3.method494((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_3.method494(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method494(35025);
				}
				this.aClass1_Sub1_Sub3_3.method494(46628);
				this.aClass1_Sub1_Sub3_3.method493((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_3.method502(this.aClass1_Sub1_Sub3_3.anInt766 - local53);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(133) Class11 local133 = Class11.method292(local7);
				@Pc(141) int local141;
				@Pc(144) int local144;
				if (local31 == 0 || local31 == 2) {
					local141 = local133.anInt520;
					local144 = local133.anInt521;
				} else {
					local141 = local133.anInt521;
					local144 = local133.anInt520;
				}
				@Pc(155) int local155 = local133.anInt532;
				if (local31 != 0) {
					local155 = (local155 << local31 & 0xF) + (local155 >> 4 - local31);
				}
				this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], arg3, false, local155, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], arg0, local141, local144, 0, 2);
			} else {
				this.method103(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray285[0], arg3, false, 0, local25 + 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray284[0], arg0, 0, 0, local31, 2);
			}
			this.anInt256 = super.anInt200;
			this.anInt257 = super.anInt201;
			this.anInt259 = 2;
			this.anInt258 = 0;
			this.aClass1_Sub1_Sub3_3.method492(arg2);
			this.aClass1_Sub1_Sub3_3.method494(arg3 + this.anInt356);
			this.aClass1_Sub1_Sub3_3.method494(arg0 + this.anInt357);
			this.aClass1_Sub1_Sub3_3.method494(local7);
			return true;
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("6303, " + arg0 + ", " + -376 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method207(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(16) Class1_Sub1_Sub4 local16 = this.aClass45_Sub1_1.method671();
				if (local16 == null) {
					return;
				}
				if (local16.anInt779 == 0) {
					Class1_Sub1_Sub1_Sub5.method254(local16.anInt780, local16.aByteArray10);
					if ((this.aClass45_Sub1_1.method667(local16.anInt780, anInt328) & 0x62) != 0) {
						this.aBoolean78 = true;
						if (this.anInt223 != -1) {
							this.aBoolean70 = true;
						}
					}
				}
				if (local16.anInt779 == 1 && local16.aByteArray10 != null) {
					Class12.method301(local16.aByteArray10);
				}
				if (local16.anInt779 == 2 && local16.anInt780 == this.anInt304 && local16.aByteArray10 != null) {
					this.method199(this.aBoolean61, local16.aByteArray10);
				}
				if (local16.anInt779 == 3 && this.anInt323 == 1) {
					for (@Pc(87) int local87 = 0; local87 < this.aByteArrayArray1.length; local87++) {
						if (this.anIntArray31[local87] == local16.anInt780) {
							this.aByteArrayArray1[local87] = local16.aByteArray10;
							if (local16.aByteArray10 == null) {
								this.anIntArray31[local87] = -1;
							}
							break;
						}
						if (this.anIntArray32[local87] == local16.anInt780) {
							this.aByteArrayArray2[local87] = local16.aByteArray10;
							if (local16.aByteArray10 == null) {
								this.anIntArray32[local87] = -1;
							}
							break;
						}
					}
				}
				if (local16.anInt779 == 93 && this.aClass45_Sub1_1.method666(local16.anInt780)) {
					Class4.method55(this.aClass45_Sub1_1, new Class1_Sub1_Sub3(local16.aByteArray10, true));
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("63415, " + arg0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method208(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_11.anIntArray200;
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
						this.aClass36_1.method583(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass36_1.method583(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_11.method370();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray7[arg0][local146][local142] & 0x18) == 0) {
						this.method96(arg0, local34, local142, local36, local146);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method96(arg0 + 1, local34, local142, local36, local146);
					}
				}
			}
			this.aClass37_23.method599();
			this.anInt268 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(214) int local214 = 0; local214 < 104; local214++) {
					@Pc(224) int local224 = this.aClass36_1.method577(this.anInt391, local146, local214);
					if (local224 != 0) {
						local224 = local224 >> 14 & 0x7FFF;
						@Pc(236) int local236 = Class11.method292(local224).anInt524;
						if (local236 >= 0) {
							@Pc(240) int local240 = local146;
							@Pc(242) int local242 = local214;
							if (local236 != 22 && local236 != 29 && local236 != 34 && local236 != 36 && local236 != 46 && local236 != 47 && local236 != 48) {
								@Pc(274) int[][] local274 = this.aClass21Array1[this.anInt391].anIntArrayArray18;
								for (@Pc(276) int local276 = 0; local276 < 10; local276++) {
									@Pc(283) int local283 = (int) (Math.random() * 4.0D);
									if (local283 == 0 && local240 > 0 && local240 > local146 - 3 && (local274[local240 - 1][local242] & 0x280108) == 0) {
										local240--;
									}
									if (local283 == 1 && local240 < 103 && local240 < local146 + 3 && (local274[local240 + 1][local242] & 0x280180) == 0) {
										local240++;
									}
									if (local283 == 2 && local242 > 0 && local242 > local214 - 3 && (local274[local240][local242 - 1] & 0x280102) == 0) {
										local242--;
									}
									if (local283 == 3 && local242 < 103 && local242 < local214 + 3 && (local274[local240][local242 + 1] & 0x280120) == 0) {
										local242++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt268] = this.aClass1_Sub1_Sub2_Sub2Array3[local236];
							this.anIntArray60[this.anInt268] = local240;
							this.anIntArray61[this.anInt268] = local242;
							this.anInt268++;
						}
					}
				}
			}
			anInt277++;
			if (anInt277 > 112) {
				anInt277 = 0;
				this.aClass1_Sub1_Sub3_3.method492(4);
				this.aClass1_Sub1_Sub3_3.method493(50);
			}
		} catch (@Pc(435) RuntimeException local435) {
			signlink.reporterror("82997, " + arg0 + ", " + 0 + ", " + local435.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIILclient!d;)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3) {
		try {
			if (arg3.anInt425 == 0 && arg3.anIntArray96 != null && (!arg3.aBoolean84 || this.anInt322 == arg3.anInt423 || this.anInt231 == arg3.anInt423 || this.anInt340 == arg3.anInt423)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt725;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt723;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt726;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt724;
				Class1_Sub1_Sub2.method459(arg1 + arg3.anInt429, arg1, arg0, arg0 + arg3.anInt428);
				@Pc(51) int local51 = arg3.anIntArray96.length;
				for (@Pc(60) int local60 = 0; local60 < local51; local60++) {
					@Pc(69) int local69 = arg3.anIntArray97[local60] + arg0;
					@Pc(78) int local78 = arg3.anIntArray98[local60] + arg1 - arg2;
					@Pc(85) Class6 local85 = Class6.aClass6Array1[arg3.anIntArray96[local60]];
					@Pc(90) int local90 = local69 + local85.anInt430;
					@Pc(95) int local95 = local78 + local85.anInt431;
					if (local85.anInt427 > 0) {
						this.method135(local85);
					}
					if (local85.anInt425 == 0) {
						if (local85.anInt434 > local85.anInt433 - local85.anInt429) {
							local85.anInt434 = local85.anInt433 - local85.anInt429;
						}
						if (local85.anInt434 < 0) {
							local85.anInt434 = 0;
						}
						this.method209(local90, local95, local85.anInt434, local85);
						if (local85.anInt433 > local85.anInt429) {
							this.method174(local90 + local85.anInt428, local95, local85.anInt434, local85.anInt429, local85.anInt433);
						}
					} else if (local85.anInt425 != 1) {
						@Pc(167) int local167;
						@Pc(171) int local171;
						@Pc(182) int local182;
						@Pc(217) int local217;
						@Pc(224) int local224;
						@Pc(165) int local165;
						@Pc(215) int local215;
						if (local85.anInt425 == 2) {
							local165 = 0;
							for (local167 = 0; local167 < local85.anInt429; local167++) {
								for (local171 = 0; local171 < local85.anInt428; local171++) {
									local182 = local90 + local171 * (local85.anInt436 + 32);
									@Pc(191) int local191 = local95 + local167 * (local85.anInt437 + 32);
									if (local165 < 20) {
										local182 += local85.anIntArray99[local165];
										local191 += local85.anIntArray100[local165];
									}
									if (local85.anIntArray92[local165] > 0) {
										local215 = 0;
										local217 = 0;
										local224 = local85.anIntArray92[local165] - 1;
										if (local182 > Class1_Sub1_Sub2.anInt725 - 32 && local182 < Class1_Sub1_Sub2.anInt726 && local191 > Class1_Sub1_Sub2.anInt723 - 32 && local191 < Class1_Sub1_Sub2.anInt724 || this.anInt376 != 0 && this.anInt375 == local165) {
											@Pc(249) int local249 = 0;
											if (this.anInt281 == 1 && this.anInt282 == local165 && this.anInt283 == local85.anInt423) {
												local249 = 16777215;
											}
											@Pc(273) Class1_Sub1_Sub2_Sub2 local273 = Class17.method391(local249, local224, local85.anIntArray93[local165]);
											if (local273 != null) {
												@Pc(353) int local353;
												if (this.anInt376 != 0 && this.anInt375 == local165 && this.anInt374 == local85.anInt423) {
													local215 = super.anInt194 - this.anInt377;
													local217 = super.anInt195 - this.anInt378;
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (local217 < 5 && local217 > -5) {
														local217 = 0;
													}
													if (this.anInt269 < 5) {
														local215 = 0;
														local217 = 0;
													}
													local273.method377(local182 + local215, local191 + local217, this.anInt348);
													if (local191 + local217 < Class1_Sub1_Sub2.anInt723 && arg3.anInt434 > 0) {
														local353 = this.anInt255 * (Class1_Sub1_Sub2.anInt723 - local191 - local217) / 3;
														if (local353 > this.anInt255 * 10) {
															local353 = this.anInt255 * 10;
														}
														if (local353 > arg3.anInt434) {
															local353 = arg3.anInt434;
														}
														arg3.anInt434 -= local353;
														this.anInt378 += local353;
													}
													if (local191 + local217 + 32 > Class1_Sub1_Sub2.anInt724 && arg3.anInt434 < arg3.anInt433 - arg3.anInt429) {
														local353 = this.anInt255 * (local191 + local217 + 32 - Class1_Sub1_Sub2.anInt724) / 3;
														if (local353 > this.anInt255 * 10) {
															local353 = this.anInt255 * 10;
														}
														if (local353 > arg3.anInt433 - arg3.anInt429 - arg3.anInt434) {
															local353 = arg3.anInt433 - arg3.anInt429 - arg3.anInt434;
														}
														arg3.anInt434 += local353;
														this.anInt378 -= local353;
													}
												} else if (this.anInt370 != 0 && this.anInt369 == local165 && this.anInt368 == local85.anInt423) {
													local273.method377(local182, local191, this.anInt348);
												} else {
													local273.method375(local182, local191);
												}
												if (local273.anInt619 == 33 || local85.anIntArray93[local165] != 1) {
													local353 = local85.anIntArray93[local165];
													this.aClass1_Sub1_Sub2_Sub4_1.method472(method204(local353), 0, local191 + local217 + 10, local182 + 1 + local215);
													this.aClass1_Sub1_Sub2_Sub4_1.method472(method204(local353), 16776960, local191 + local217 + 9, local182 + local215);
												}
											}
										}
									} else if (local85.aClass1_Sub1_Sub2_Sub2Array8 != null && local165 < 20) {
										@Pc(543) Class1_Sub1_Sub2_Sub2 local543 = local85.aClass1_Sub1_Sub2_Sub2Array8[local165];
										if (local543 != null) {
											local543.method375(local182, local191);
										}
									}
									local165++;
								}
							}
						} else if (local85.anInt425 == 3) {
							@Pc(569) boolean local569 = false;
							if (this.anInt340 == local85.anInt423 || this.anInt231 == local85.anInt423 || this.anInt322 == local85.anInt423) {
								local569 = true;
							}
							if (this.method150(local85, this.aByte6)) {
								local165 = local85.anInt439;
								if (local569 && local85.anInt441 != 0) {
									local165 = local85.anInt441;
								}
							} else {
								local165 = local85.anInt438;
								if (local569 && local85.anInt440 != 0) {
									local165 = local85.anInt440;
								}
							}
							if (local85.aByte19 == 0) {
								if (local85.aBoolean90) {
									Class1_Sub1_Sub2.method462(local85.anInt428, local165, local95, local85.anInt429, local90);
								} else {
									Class1_Sub1_Sub2.method463(local90, local85.anInt428, local85.anInt429, local95, local165);
								}
							} else if (local85.aBoolean90) {
								Class1_Sub1_Sub2.method461(256 - (local85.aByte19 & 0xFF), local165, local90, local85.anInt429, local85.anInt428, local95);
							} else {
								Class1_Sub1_Sub2.method464(local165, local95, local85.anInt428, local85.anInt429, 256 - (local85.aByte19 & 0xFF), local90);
							}
						} else {
							@Pc(688) Class1_Sub1_Sub2_Sub4 local688;
							if (local85.anInt425 == 4) {
								local688 = local85.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(691) String local691 = local85.aString18;
								@Pc(693) boolean local693 = false;
								if (this.anInt340 == local85.anInt423 || this.anInt231 == local85.anInt423 || this.anInt322 == local85.anInt423) {
									local693 = true;
								}
								if (this.method150(local85, this.aByte6)) {
									local167 = local85.anInt439;
									if (local693 && local85.anInt441 != 0) {
										local167 = local85.anInt441;
									}
									if (local85.aString19.length() > 0) {
										local691 = local85.aString19;
									}
								} else {
									local167 = local85.anInt438;
									if (local693 && local85.anInt440 != 0) {
										local167 = local85.anInt440;
									}
								}
								if (local85.anInt426 == 6 && this.aBoolean59) {
									local691 = "Please wait...";
									local167 = local85.anInt438;
								}
								if (Class1_Sub1_Sub2.anInt721 == 479) {
									if (local167 == 16776960) {
										local167 = 255;
									}
									if (local167 == 49152) {
										local167 = 16777215;
									}
								}
								local215 = local95 + local688.anInt732;
								while (local691.length() > 0) {
									if (local691.indexOf("%") != -1) {
										label348: while (true) {
											local217 = local691.indexOf("%1");
											if (local217 == -1) {
												while (true) {
													local217 = local691.indexOf("%2");
													if (local217 == -1) {
														while (true) {
															local217 = local691.indexOf("%3");
															if (local217 == -1) {
																while (true) {
																	local217 = local691.indexOf("%4");
																	if (local217 == -1) {
																		while (true) {
																			local217 = local691.indexOf("%5");
																			if (local217 == -1) {
																				break label348;
																			}
																			local691 = local691.substring(0, local217) + this.method117(this.method201(local85, (byte) 5, 4)) + local691.substring(local217 + 2);
																		}
																	}
																	local691 = local691.substring(0, local217) + this.method117(this.method201(local85, (byte) 5, 3)) + local691.substring(local217 + 2);
																}
															}
															local691 = local691.substring(0, local217) + this.method117(this.method201(local85, (byte) 5, 2)) + local691.substring(local217 + 2);
														}
													}
													local691 = local691.substring(0, local217) + this.method117(this.method201(local85, (byte) 5, 1)) + local691.substring(local217 + 2);
												}
											}
											local691 = local691.substring(0, local217) + this.method117(this.method201(local85, (byte) 5, 0)) + local691.substring(local217 + 2);
										}
									}
									local217 = local691.indexOf("\\n");
									@Pc(966) String local966;
									if (local217 == -1) {
										local966 = local691;
										local691 = "";
									} else {
										local966 = local691.substring(0, local217);
										local691 = local691.substring(local217 + 2);
									}
									if (local85.aBoolean91) {
										local688.method470(local90 + local85.anInt428 / 2, local85.aBoolean92, local167, local215, local966);
									} else {
										local688.method474(local215, local966, local90, local85.aBoolean92, local167);
									}
									local215 += local688.anInt732;
								}
							} else if (local85.anInt425 == 5) {
								@Pc(1029) Class1_Sub1_Sub2_Sub2 local1029;
								if (this.method150(local85, this.aByte6)) {
									local1029 = local85.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1029 = local85.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1029 != null) {
									local1029.method375(local90, local95);
								}
							} else if (local85.anInt425 == 6) {
								local165 = Class1_Sub1_Sub2_Sub1.anInt572;
								local167 = Class1_Sub1_Sub2_Sub1.anInt573;
								Class1_Sub1_Sub2_Sub1.anInt572 = local90 + local85.anInt428 / 2;
								Class1_Sub1_Sub2_Sub1.anInt573 = local95 + local85.anInt429 / 2;
								local171 = Class1_Sub1_Sub2_Sub1.anIntArray170[local85.anInt449] * local85.anInt448 >> 16;
								local182 = Class1_Sub1_Sub2_Sub1.anIntArray171[local85.anInt449] * local85.anInt448 >> 16;
								@Pc(1091) boolean local1091 = this.method150(local85, this.aByte6);
								if (local1091) {
									local215 = local85.anInt447;
								} else {
									local215 = local85.anInt446;
								}
								@Pc(1112) Class1_Sub1_Sub1_Sub5 local1112;
								if (local215 == -1) {
									local1112 = local85.method226(this.aBoolean66, -1, -1, local1091);
								} else {
									@Pc(1118) Class29 local1118 = Class29.aClass29Array1[local215];
									local1112 = local85.method226(this.aBoolean66, local1118.anIntArray238[local85.anInt421], local1118.anIntArray237[local85.anInt421], local1091);
								}
								if (local1112 != null) {
									local1112.method276(local85.anInt450, 0, local85.anInt449, 0, local171, local182);
								}
								Class1_Sub1_Sub2_Sub1.anInt572 = local165;
								Class1_Sub1_Sub2_Sub1.anInt573 = local167;
							} else if (local85.anInt425 == 7) {
								local688 = local85.aClass1_Sub1_Sub2_Sub4_5;
								local167 = 0;
								for (local171 = 0; local171 < local85.anInt429; local171++) {
									for (local182 = 0; local182 < local85.anInt428; local182++) {
										if (local85.anIntArray92[local167] > 0) {
											@Pc(1183) Class17 local1183 = Class17.method385(local85.anIntArray92[local167] - 1);
											@Pc(1186) String local1186 = local1183.aString25;
											if (local1183.aBoolean155 || local85.anIntArray93[local167] != 1) {
												local1186 = local1186 + " x" + method180(local85.anIntArray93[local167]);
											}
											local217 = local90 + local182 * (local85.anInt436 + 115);
											local224 = local95 + local171 * (local85.anInt437 + 12);
											if (local85.aBoolean91) {
												local688.method470(local217 + local85.anInt428 / 2, local85.aBoolean92, local85.anInt438, local224, local1186);
											} else {
												local688.method474(local224, local1186, local217, local85.aBoolean92, local85.anInt438);
											}
										}
										local167++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method459(local35, local31, local29, local33);
			}
		} catch (@Pc(1282) RuntimeException local1282) {
			signlink.reporterror("27867, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method210() {
		try {
			if (this.anInt376 == 0) {
				this.aStringArray4[0] = "Cancel";
				this.anIntArray58[0] = 1106;
				this.anInt308 = 1;
				this.method120();
				this.anInt305 = 0;
				if (super.anInt194 > 4 && super.anInt195 > 4 && super.anInt194 < 516 && super.anInt195 < 338) {
					if (this.anInt210 == -1) {
						this.method203();
					} else {
						this.method223(Class6.aClass6Array1[this.anInt210], 0, 4, this.aByte15, super.anInt195, super.anInt194, 4);
					}
				}
				if (this.anInt305 != this.anInt322) {
					this.anInt322 = this.anInt305;
				}
				this.anInt305 = 0;
				if (super.anInt194 > 553 && super.anInt195 > 205 && super.anInt194 < 743 && super.anInt195 < 466) {
					if (this.anInt260 != -1) {
						this.method223(Class6.aClass6Array1[this.anInt260], 0, 205, this.aByte15, super.anInt195, super.anInt194, 553);
					} else if (this.anIntArray77[this.anInt297] != -1) {
						this.method223(Class6.aClass6Array1[this.anIntArray77[this.anInt297]], 0, 205, this.aByte15, super.anInt195, super.anInt194, 553);
					}
				}
				if (this.anInt305 != this.anInt231) {
					this.aBoolean78 = true;
					this.anInt231 = this.anInt305;
				}
				this.anInt305 = 0;
				if (super.anInt194 > 17 && super.anInt195 > 357 && super.anInt194 < 496 && super.anInt195 < 453) {
					if (this.anInt223 != -1) {
						this.method223(Class6.aClass6Array1[this.anInt223], 0, 357, this.aByte15, super.anInt195, super.anInt194, 17);
					} else if (super.anInt195 < 434 && super.anInt194 < 426) {
						this.method118(super.anInt195 - 357, super.anInt194 - 17);
					}
				}
				if (this.anInt223 != -1 && this.anInt305 != this.anInt340) {
					this.aBoolean70 = true;
					this.anInt340 = this.anInt305;
				}
				@Pc(232) boolean local232 = false;
				while (!local232) {
					local232 = true;
					for (@Pc(238) int local238 = 0; local238 < this.anInt308 - 1; local238++) {
						if (this.anIntArray58[local238] < 1000 && this.anIntArray58[local238 + 1] > 1000) {
							@Pc(259) String local259 = this.aStringArray4[local238];
							this.aStringArray4[local238] = this.aStringArray4[local238 + 1];
							this.aStringArray4[local238 + 1] = local259;
							@Pc(281) int local281 = this.anIntArray58[local238];
							this.anIntArray58[local238] = this.anIntArray58[local238 + 1];
							this.anIntArray58[local238 + 1] = local281;
							@Pc(303) int local303 = this.anIntArray56[local238];
							this.anIntArray56[local238] = this.anIntArray56[local238 + 1];
							this.anIntArray56[local238 + 1] = local303;
							@Pc(325) int local325 = this.anIntArray57[local238];
							this.anIntArray57[local238] = this.anIntArray57[local238 + 1];
							this.anIntArray57[local238 + 1] = local325;
							@Pc(347) int local347 = this.anIntArray59[local238];
							this.anIntArray59[local238] = this.anIntArray59[local238 + 1];
							this.anIntArray59[local238 + 1] = local347;
							local232 = false;
						}
					}
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("56189, " + false + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method86(@OriginalArg(0) int arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method242();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method175();
			if (this.aClass13_1 != null) {
				this.aClass13_1.aBoolean135 = false;
			}
			this.aClass13_1 = null;
			this.aClass45_Sub1_1.method661();
			this.aClass45_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.anIntArray30 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArray31 = null;
			this.anIntArray32 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass36_1 = null;
			this.aClass21Array1 = null;
			this.anIntArrayArray6 = null;
			this.anIntArrayArray4 = null;
			this.anIntArray79 = null;
			this.anIntArray80 = null;
			this.aByteArray1 = null;
			this.aClass37_21 = null;
			this.aClass37_22 = null;
			this.aClass37_23 = null;
			this.aClass37_24 = null;
			this.aClass37_25 = null;
			this.aClass37_26 = null;
			this.aClass37_27 = null;
			this.aClass37_3 = null;
			this.aClass37_4 = null;
			this.aClass37_5 = null;
			this.aClass37_6 = null;
			this.aClass37_7 = null;
			this.aClass37_8 = null;
			this.aClass37_9 = null;
			this.aClass37_10 = null;
			this.aClass37_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.anInt405 += arg0;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.anIntArrayArray5 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray47 = null;
			this.anIntArray48 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray70 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray41 = null;
			this.aClass31ArrayArrayArray1 = null;
			this.aClass31_3 = null;
			this.aClass31_2 = null;
			this.aClass31_1 = null;
			this.anIntArray56 = null;
			this.anIntArray57 = null;
			this.anIntArray58 = null;
			this.anIntArray59 = null;
			this.aStringArray4 = null;
			this.anIntArray75 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aStringArray6 = null;
			this.aLongArray3 = null;
			this.anIntArray66 = null;
			this.aClass37_15 = null;
			this.aClass37_16 = null;
			this.aClass37_12 = null;
			this.aClass37_13 = null;
			this.aClass37_14 = null;
			this.aClass37_17 = null;
			this.aClass37_18 = null;
			this.aClass37_19 = null;
			this.aClass37_20 = null;
			this.method200();
			Class11.method291();
			Class15.method351();
			Class17.method384();
			Class23.aClass23Array1 = null;
			Class25.aClass25Array1 = null;
			Class6.aClass6Array1 = null;
			Class27.aClass27Array1 = null;
			Class29.aClass29Array1 = null;
			Class35.aClass35Array1 = null;
			Class35.aClass39_9 = null;
			Class41.aClass41Array1 = null;
			super.aClass37_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub1.aClass39_1 = null;
			Class1_Sub1_Sub2_Sub1.method333();
			Class36.method547();
			Class1_Sub1_Sub1_Sub5.method252();
			Class12.method302();
			System.gc();
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("81781, " + arg0 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method211() {
		try {
			@Pc(8) int local8;
			if (this.anInt263 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt263 > 768) {
						this.anIntArray87[local8] = this.method153(this.anIntArray88[local8], this.anIntArray89[local8], 1024 - this.anInt263);
					} else if (this.anInt263 > 256) {
						this.anIntArray87[local8] = this.anIntArray89[local8];
					} else {
						this.anIntArray87[local8] = this.method153(this.anIntArray89[local8], this.anIntArray88[local8], 256 - this.anInt263);
					}
				}
			} else if (this.anInt264 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt264 > 768) {
						this.anIntArray87[local8] = this.method153(this.anIntArray88[local8], this.anIntArray90[local8], 1024 - this.anInt264);
					} else if (this.anInt264 > 256) {
						this.anIntArray87[local8] = this.anIntArray90[local8];
					} else {
						this.anIntArray87[local8] = this.method153(this.anIntArray90[local8], this.anIntArray88[local8], 256 - this.anInt264);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray87[local8] = this.anIntArray88[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass37_15.anIntArray258[local8] = this.aClass1_Sub1_Sub2_Sub2_12.anIntArray200[local8];
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
				local198 = this.anIntArray49[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray54[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray87[local220];
						local239 = this.aClass37_15.anIntArray258[local183];
						this.aClass37_15.anIntArray258[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass37_15.method600(0, super.aGraphics2, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass37_16.anIntArray258[local198] = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray200[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray49[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray54[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray87[local228];
						@Pc(373) int local373 = this.aClass37_16.anIntArray258[local183];
						this.aClass37_16.anIntArray258[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass37_16.method600(0, super.aGraphics2, 637);
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("8795, " + -41631 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = this.aClass31ArrayArrayArray1[this.anInt391][arg0][arg1];
		if (local9 == null) {
			this.aClass36_1.method569(this.anInt391, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method534(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method536(633)) {
			@Pc(32) Class17 local32 = Class17.method385(local27.anInt178);
			@Pc(35) int local35 = local32.anInt634;
			if (local32.aBoolean155) {
				local35 *= local27.anInt179 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method532(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method534(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method536(633)) {
			if (local27.anInt178 != local23.anInt178 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt178 != local23.anInt178 && local27.anInt178 != local65.anInt178 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass36_1.method555(this.anInt391, local23, local65, this.method181(arg0 * 128 + 64, 526, arg1 * 128 + 64, this.anInt391), arg1, arg0, this.aByte5, local110, local67);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!ab;)V")
	private void method213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt308 < 400) {
				@Pc(39) String local39 = arg3.aString3 + method183(arg3.anInt129, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129, this.anInt218) + " (level-" + arg3.anInt129 + ")";
				@Pc(152) int local152;
				if (this.anInt281 == 1) {
					this.aStringArray4[this.anInt308] = "Use " + this.aString8 + " with @whi@" + local39;
					this.anIntArray58[this.anInt308] = 275;
					this.anIntArray59[this.anInt308] = arg2;
					this.anIntArray56[this.anInt308] = arg1;
					this.anIntArray57[this.anInt308] = arg0;
					this.anInt308++;
				} else if (this.anInt301 != 1) {
					for (local152 = 4; local152 >= 0; local152--) {
						if (this.aStringArray5[local152] != null) {
							this.aStringArray4[this.anInt308] = this.aStringArray5[local152] + " @whi@" + local39;
							@Pc(179) short local179 = 0;
							if (this.aStringArray5[local152].equalsIgnoreCase("attack")) {
								if (arg3.anInt129 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129) {
									local179 = 2000;
								}
							} else if (this.aBooleanArray3[local152]) {
								local179 = 2000;
							}
							if (local152 == 0) {
								this.anIntArray58[this.anInt308] = local179 + 639;
							}
							if (local152 == 1) {
								this.anIntArray58[this.anInt308] = local179 + 499;
							}
							if (local152 == 2) {
								this.anIntArray58[this.anInt308] = local179 + 27;
							}
							if (local152 == 3) {
								this.anIntArray58[this.anInt308] = local179 + 387;
							}
							if (local152 == 4) {
								this.anIntArray58[this.anInt308] = local179 + 185;
							}
							this.anIntArray59[this.anInt308] = arg2;
							this.anIntArray56[this.anInt308] = arg1;
							this.anIntArray57[this.anInt308] = arg0;
							this.anInt308++;
						}
					}
				} else if ((this.anInt303 & 0x8) == 8) {
					this.aStringArray4[this.anInt308] = this.aString12 + " @whi@" + local39;
					this.anIntArray58[this.anInt308] = 131;
					this.anIntArray59[this.anInt308] = arg2;
					this.anIntArray56[this.anInt308] = arg1;
					this.anIntArray57[this.anInt308] = arg0;
					this.anInt308++;
				}
				for (local152 = 0; local152 < this.anInt308; local152++) {
					if (this.anIntArray58[local152] == 718) {
						this.aStringArray4[local152] = "Walk here @whi@" + local39;
						return;
					}
				}
			}
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("85900, " + 26004 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method214() {
		try {
			this.aClass37_21.method599();
			Class1_Sub1_Sub2_Sub1.anIntArray172 = this.anIntArray73;
			this.aClass1_Sub1_Sub2_Sub3_10.method415(0, 0);
			if (this.anInt260 != -1) {
				this.method209(0, 0, 0, Class6.aClass6Array1[this.anInt260]);
			} else if (this.anIntArray77[this.anInt297] != -1) {
				this.method209(0, 0, 0, Class6.aClass6Array1[this.anIntArray77[this.anInt297]]);
			}
			if (this.aBoolean51 && this.anInt399 == 1) {
				this.method182(243);
			}
			this.aClass37_21.method600(205, super.aGraphics2, 553);
			this.aClass37_23.method599();
			Class1_Sub1_Sub2_Sub1.anIntArray172 = this.anIntArray74;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("31683, " + -243 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)Ljava/lang/String;")
	private String method215() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("55773, " + 97 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ib;ZI)V")
	private void method216(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt332 + this.anInt349 & 0x7FF;
			@Pc(15) int local15 = arg2 * arg2 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray139[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray140[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt360 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt360 + 256);
				@Pc(55) int local55 = arg0 * local36 + arg2 * local45 >> 16;
				@Pc(65) int local65 = arg0 * local45 - arg2 * local36 >> 16;
				if (local15 > 2500) {
					arg1.method381(83 - local65 - arg1.anInt620 / 2 - 4, local55 + 94 - arg1.anInt619 / 2 + 4, this.aClass1_Sub1_Sub2_Sub3_11);
				} else {
					arg1.method375(local55 + 94 + 4 - arg1.anInt619 / 2, 83 - local65 - arg1.anInt620 / 2 - 4);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("24349, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method217(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 >> 7 == this.anInt292 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 >> 7 == this.anInt293) {
				this.anInt292 = 0;
				anInt251++;
				if (anInt251 > 122) {
					anInt251 = 0;
					this.aClass1_Sub1_Sub3_3.method492(36);
					this.aClass1_Sub1_Sub3_3.method493(62);
				}
			}
			@Pc(45) int local45 = this.anInt242;
			if (arg0) {
				local45 = 1;
			}
			for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
				@Pc(57) Class1_Sub1_Sub1_Sub1_Sub1 local57;
				@Pc(62) int local62;
				if (arg0) {
					local57 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local62 = this.anInt241 << 14;
				} else {
					local57 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray47[local51]];
					local62 = this.anIntArray47[local51] << 14;
				}
				if (local57 != null && local57.method697()) {
					local57.aBoolean23 = false;
					if ((aBoolean65 && this.anInt242 > 50 || this.anInt242 > 200) && !arg0 && local57.anInt1014 == local57.anInt998) {
						local57.aBoolean23 = true;
					}
					@Pc(113) int local113 = local57.anInt994 >> 7;
					@Pc(118) int local118 = local57.anInt995 >> 7;
					if (local113 >= 0 && local113 < 104 && local118 >= 0 && local118 < 104) {
						if (local57.aClass1_Sub1_Sub1_Sub5_1 == null || anInt209 < local57.anInt131 || anInt209 >= local57.anInt132) {
							if ((local57.anInt994 & 0x7F) == 64 && (local57.anInt995 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local113][local118] == this.anInt329) {
									continue;
								}
								this.anIntArrayArray5[local113][local118] = this.anInt329;
							}
							local57.anInt130 = this.method181(local57.anInt994, 526, local57.anInt995, this.anInt391);
							this.aClass36_1.method559(this.anInt391, local57.anInt994, local57, local57.anInt130, local57.aBoolean239, local57.anInt995, local57.anInt996, 60, local62);
						} else {
							local57.aBoolean23 = false;
							local57.anInt130 = this.method181(local57.anInt994, 526, local57.anInt995, this.anInt391);
							this.aClass36_1.method560(local57.anInt994, local57.anInt996, local57, local57.anInt130, this.anInt391, local57.anInt995, local62, local57.anInt138, local57.anInt139, local57.anInt137, local57.anInt136);
						}
					}
				}
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("6656, " + 30 + ", " + arg0 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IBI)Lclient!yb;")
	private Class48 method218(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (this.aByte2 != 7) {
				throw new NullPointerException();
			}
			@Pc(11) byte[] local11 = null;
			@Pc(13) int local13 = 5;
			try {
				if (this.aClass46Array1[0] != null) {
					local11 = this.aClass46Array1[0].method681(arg1);
				}
			} catch (@Pc(28) Exception local28) {
			}
			@Pc(42) int local42;
			if (local11 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local11);
				local42 = (int) this.aCRC32_1.getValue();
				if (local42 != arg3) {
					local11 = null;
				}
			}
			if (local11 != null) {
				return new Class48(local11, 289);
			}
			local42 = 0;
			while (local11 == null) {
				@Pc(63) String local63 = "Unknown error";
				this.method91(arg4, "Requesting " + arg2);
				@Pc(78) int local78;
				try {
					local78 = 0;
					@Pc(89) DataInputStream local89 = this.method101(arg0 + arg3);
					@Pc(92) byte[] local92 = new byte[6];
					local89.readFully(local92, 0, 6);
					@Pc(103) Class1_Sub1_Sub3 local103 = new Class1_Sub1_Sub3(local92, true);
					local103.anInt766 = 3;
					@Pc(111) int local111 = local103.method507() + 6;
					@Pc(113) int local113 = 6;
					local11 = new byte[local111];
					for (@Pc(118) int local118 = 0; local118 < 6; local118++) {
						local11[local118] = local92[local118];
					}
					@Pc(135) int local135;
					while (local113 < local111) {
						local135 = local111 - local113;
						if (local135 > 1000) {
							local135 = 1000;
						}
						@Pc(146) int local146 = local89.read(local11, local113, local135);
						if (local146 < 0) {
							(new StringBuffer("Length error: ")).append(local113).append("/").append(local111).toString();
							throw new IOException("EOF");
						}
						local113 += local146;
						@Pc(175) int local175 = local113 * 100 / local111;
						if (local175 != local78) {
							this.method91(arg4, "Loading " + arg2 + " - " + local175 + "%");
						}
						local78 = local175;
					}
					local89.close();
					try {
						if (this.aClass46Array1[0] != null) {
							this.aClass46Array1[0].method682(local11, arg1, local11.length);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass46Array1[0] = null;
					}
					if (local11 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local11);
						local135 = (int) this.aCRC32_1.getValue();
						if (local135 != arg3) {
							local11 = null;
							local42++;
							local63 = "Checksum error: " + local135;
						}
					}
				} catch (@Pc(255) IOException local255) {
					if (local63.equals("Unknown error")) {
						local63 = "Connection error";
					}
					local11 = null;
				} catch (@Pc(265) NullPointerException local265) {
					local63 = "Null error";
					local11 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(274) ArrayIndexOutOfBoundsException local274) {
					local63 = "Bounds error";
					local11 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(283) Exception local283) {
					local63 = "Unexpected error";
					local11 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local11 == null) {
					for (local78 = local13; local78 > 0; local78--) {
						if (local42 >= 3) {
							this.method91(arg4, "Game updated - please reload page");
							local78 = 10;
						} else {
							this.method91(arg4, local63 + " - Retrying in " + local78);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local13 *= 2;
					if (local13 > 60) {
						local13 = 60;
					}
				}
			}
			return new Class48(local11, 289);
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("10971, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 7 + ", " + arg4 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2 >= 1 && arg0 >= 1 && arg2 <= 102 && arg0 <= 102) {
				if (aBoolean65 && arg3 != this.anInt391) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg1 == 0) {
					local26 = this.aClass36_1.method574(arg3, arg2, arg0);
				}
				if (arg1 == 1) {
					local26 = this.aClass36_1.method575(arg2, arg3, this.aBoolean55, arg0);
				}
				if (arg1 == 2) {
					local26 = this.aClass36_1.method576(arg3, arg2, arg0);
				}
				if (arg1 == 3) {
					local26 = this.aClass36_1.method577(arg3, arg2, arg0);
				}
				@Pc(83) int local83;
				if (local26 != 0) {
					local83 = this.aClass36_1.method578(arg3, arg2, arg0, local26);
					@Pc(89) int local89 = local26 >> 14 & 0x7FFF;
					@Pc(93) int local93 = local83 & 0x1F;
					@Pc(97) int local97 = local83 >> 6;
					@Pc(109) Class11 local109;
					if (arg1 == 0) {
						this.aClass36_1.method565(arg3, arg0, arg2);
						local109 = Class11.method292(local89);
						if (local109.aBoolean120) {
							this.aClass21Array1[arg3].method448(local93, local97, arg2, local109.aBoolean121, arg0);
						}
					}
					if (arg1 == 1) {
						this.aClass36_1.method566(arg3, arg0, arg2);
					}
					if (arg1 == 2) {
						this.aClass36_1.method567(arg0, arg3, arg2);
						local109 = Class11.method292(local89);
						if (arg2 + local109.anInt520 > 103 || arg0 + local109.anInt520 > 103 || arg2 + local109.anInt521 > 103 || arg0 + local109.anInt521 > 103) {
							return;
						}
						if (local109.aBoolean120) {
							this.aClass21Array1[arg3].method449(arg0, arg2, local109.aBoolean121, local109.anInt521, local109.anInt520, local97);
						}
					}
					if (arg1 == 3) {
						this.aClass36_1.method568(arg0, arg3, arg2);
						local109 = Class11.method292(local89);
						if (local109.aBoolean120 && local109.aBoolean122) {
							this.aClass21Array1[arg3].method451(arg2, arg0);
						}
					}
				}
				if (arg6 >= 0) {
					local83 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray7[1][arg2][arg0] & 0x2) == 2) {
						local83 = arg3 + 1;
					}
					Class4.method69(arg4, arg5, arg3, arg2, this.anIntArrayArrayArray5, this.aClass36_1, arg0, local83, arg6, this.aClass21Array1[arg3]);
					return;
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("66059, " + arg0 + ", " + 185 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method220() {
		try {
			if (super.anInt199 == 1) {
				if (super.anInt200 >= 6 && super.anInt200 <= 106 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt250 = (this.anInt250 + 1) % 4;
					this.aBoolean53 = true;
					this.aBoolean70 = true;
					this.aClass1_Sub1_Sub3_3.method492(129);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt250);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt417);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt267);
				}
				if (super.anInt200 >= 135 && super.anInt200 <= 235 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt417 = (this.anInt417 + 1) % 3;
					this.aBoolean53 = true;
					this.aBoolean70 = true;
					this.aClass1_Sub1_Sub3_3.method492(129);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt250);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt417);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt267);
				}
				if (super.anInt200 >= 273 && super.anInt200 <= 373 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt267 = (this.anInt267 + 1) % 3;
					this.aBoolean53 = true;
					this.aBoolean70 = true;
					this.aClass1_Sub1_Sub3_3.method492(129);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt250);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt417);
					this.aClass1_Sub1_Sub3_3.method493(this.anInt267);
				}
				if (super.anInt200 >= 412 && super.anInt200 <= 512 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.method119();
					this.aString13 = "";
					this.aBoolean62 = false;
					for (@Pc(183) int local183 = 0; local183 < Class6.aClass6Array1.length; local183++) {
						if (Class6.aClass6Array1[local183] != null && Class6.aClass6Array1[local183].anInt427 == 600) {
							this.anInt296 = this.anInt210 = Class6.aClass6Array1[local183].anInt424;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(212) RuntimeException local212) {
			signlink.reporterror("44637, " + -947 + ", " + local212.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method221(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(11) int local11 = 0; local11 < this.anInt217; local11++) {
				@Pc(21) Class1_Sub1_Sub1_Sub1_Sub2 local21 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray41[local11]];
				@Pc(30) int local30 = (this.anIntArray41[local11] << 14) + 536870912;
				if (local21 != null && local21.method697() && local21.aClass15_2.aBoolean146 == arg0) {
					@Pc(46) int local46 = local21.anInt994 >> 7;
					@Pc(51) int local51 = local21.anInt995 >> 7;
					if (local46 >= 0 && local46 < 104 && local51 >= 0 && local51 < 104) {
						if (local21.anInt997 == 1 && (local21.anInt994 & 0x7F) == 64 && (local21.anInt995 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local46][local51] == this.anInt329) {
								continue;
							}
							this.anIntArrayArray5[local46][local51] = this.anInt329;
						}
						this.aClass36_1.method559(this.anInt391, local21.anInt994, local21, this.method181(local21.anInt994, 526, local21.anInt995, this.anInt391), local21.aBoolean239, local21.anInt995, local21.anInt996, (local21.anInt997 - 1) * 64 + 60, local30);
					}
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("18110, " + arg0 + ", " + arg1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method222() {
		try {
			this.aBoolean71 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean47) {
					this.anInt342++;
					this.method139();
					this.method139();
					this.method211();
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
			this.aBoolean71 = false;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("68335, " + -736 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IIBIII)V")
	private void method223(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg0.anInt425 == 0 && arg0.anIntArray96 != null && !arg0.aBoolean84 && (arg5 >= arg6 && arg4 >= arg2 && arg5 <= arg6 + arg0.anInt428 && arg4 <= arg2 + arg0.anInt429)) {
				@Pc(34) int local34 = arg0.anIntArray96.length;
				if (arg3 != this.aByte16) {
					this.method84();
				}
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg0.anIntArray97[local42] + arg6;
					@Pc(60) int local60 = arg0.anIntArray98[local42] + arg2 - arg1;
					@Pc(67) Class6 local67 = Class6.aClass6Array1[arg0.anIntArray96[local42]];
					@Pc(72) int local72 = local51 + local67.anInt430;
					@Pc(77) int local77 = local60 + local67.anInt431;
					if ((local67.anInt432 >= 0 || local67.anInt440 != 0) && arg5 >= local72 && arg4 >= local77 && arg5 < local72 + local67.anInt428 && arg4 < local77 + local67.anInt429) {
						if (local67.anInt432 >= 0) {
							this.anInt305 = local67.anInt432;
						} else {
							this.anInt305 = local67.anInt423;
						}
					}
					if (local67.anInt425 == 0) {
						this.method223(local67, local67.anInt434, local77, this.aByte15, arg4, arg5, local72);
						if (local67.anInt433 > local67.anInt429) {
							this.method197(local77, arg5, local72 + local67.anInt428, local67, true, local67.anInt429, arg4, local67.anInt433);
						}
					} else {
						if (local67.anInt426 == 1 && arg5 >= local72 && arg4 >= local77 && arg5 < local72 + local67.anInt428 && arg4 < local77 + local67.anInt429) {
							@Pc(175) boolean local175 = false;
							if (local67.anInt427 != 0) {
								local175 = this.method190(local67);
							}
							if (!local175) {
								this.aStringArray4[this.anInt308] = local67.aString22;
								this.anIntArray58[this.anInt308] = 231;
								this.anIntArray57[this.anInt308] = local67.anInt423;
								this.anInt308++;
							}
						}
						if (local67.anInt426 == 2 && this.anInt301 == 0 && arg5 >= local72 && arg4 >= local77 && arg5 < local72 + local67.anInt428 && arg4 < local77 + local67.anInt429) {
							@Pc(239) String local239 = local67.aString20;
							if (local239.indexOf(" ") != -1) {
								local239 = local239.substring(0, local239.indexOf(" "));
							}
							this.aStringArray4[this.anInt308] = local239 + " @gre@" + local67.aString21;
							this.anIntArray58[this.anInt308] = 274;
							this.anIntArray57[this.anInt308] = local67.anInt423;
							this.anInt308++;
						}
						if (local67.anInt426 == 3 && arg5 >= local72 && arg4 >= local77 && arg5 < local72 + local67.anInt428 && arg4 < local77 + local67.anInt429) {
							this.aStringArray4[this.anInt308] = "Close";
							this.anIntArray58[this.anInt308] = 737;
							this.anIntArray57[this.anInt308] = local67.anInt423;
							this.anInt308++;
						}
						if (local67.anInt426 == 4 && arg5 >= local72 && arg4 >= local77 && arg5 < local72 + local67.anInt428 && arg4 < local77 + local67.anInt429) {
							this.aStringArray4[this.anInt308] = local67.aString22;
							this.anIntArray58[this.anInt308] = 435;
							this.anIntArray57[this.anInt308] = local67.anInt423;
							this.anInt308++;
						}
						if (local67.anInt426 == 5 && arg5 >= local72 && arg4 >= local77 && arg5 < local72 + local67.anInt428 && arg4 < local77 + local67.anInt429) {
							this.aStringArray4[this.anInt308] = local67.aString22;
							this.anIntArray58[this.anInt308] = 225;
							this.anIntArray57[this.anInt308] = local67.anInt423;
							this.anInt308++;
						}
						if (local67.anInt426 == 6 && !this.aBoolean59 && arg5 >= local72 && arg4 >= local77 && arg5 < local72 + local67.anInt428 && arg4 < local77 + local67.anInt429) {
							this.aStringArray4[this.anInt308] = local67.aString22;
							this.anIntArray58[this.anInt308] = 997;
							this.anIntArray57[this.anInt308] = local67.anInt423;
							this.anInt308++;
						}
						if (local67.anInt425 == 2) {
							@Pc(487) int local487 = 0;
							for (@Pc(489) int local489 = 0; local489 < local67.anInt429; local489++) {
								for (@Pc(493) int local493 = 0; local493 < local67.anInt428; local493++) {
									@Pc(504) int local504 = local72 + local493 * (local67.anInt436 + 32);
									@Pc(513) int local513 = local77 + local489 * (local67.anInt437 + 32);
									if (local487 < 20) {
										local504 += local67.anIntArray99[local487];
										local513 += local67.anIntArray100[local487];
									}
									if (arg5 >= local504 && arg4 >= local513 && arg5 < local504 + 32 && arg4 < local513 + 32) {
										this.anInt236 = local487;
										this.anInt237 = local67.anInt423;
										if (local67.anIntArray92[local487] > 0) {
											@Pc(566) Class17 local566 = Class17.method385(local67.anIntArray92[local487] - 1);
											if (this.anInt281 == 1 && local67.aBoolean87) {
												if (local67.anInt423 != this.anInt283 || local487 != this.anInt282) {
													this.aStringArray4[this.anInt308] = "Use " + this.aString8 + " with @lre@" + local566.aString25;
													this.anIntArray58[this.anInt308] = 398;
													this.anIntArray59[this.anInt308] = local566.anInt625;
													this.anIntArray56[this.anInt308] = local487;
													this.anIntArray57[this.anInt308] = local67.anInt423;
													this.anInt308++;
												}
											} else if (this.anInt301 != 1 || !local67.aBoolean87) {
												@Pc(703) int local703;
												if (local67.aBoolean87) {
													for (local703 = 4; local703 >= 3; local703--) {
														if (local566.aStringArray11 != null && local566.aStringArray11[local703] != null) {
															this.aStringArray4[this.anInt308] = local566.aStringArray11[local703] + " @lre@" + local566.aString25;
															if (local703 == 3) {
																this.anIntArray58[this.anInt308] = 681;
															}
															if (local703 == 4) {
																this.anIntArray58[this.anInt308] = 100;
															}
															this.anIntArray59[this.anInt308] = local566.anInt625;
															this.anIntArray56[this.anInt308] = local487;
															this.anIntArray57[this.anInt308] = local67.anInt423;
															this.anInt308++;
														} else if (local703 == 4) {
															this.aStringArray4[this.anInt308] = "Drop @lre@" + local566.aString25;
															this.anIntArray58[this.anInt308] = 100;
															this.anIntArray59[this.anInt308] = local566.anInt625;
															this.anIntArray56[this.anInt308] = local487;
															this.anIntArray57[this.anInt308] = local67.anInt423;
															this.anInt308++;
														}
													}
												}
												if (local67.aBoolean88) {
													this.aStringArray4[this.anInt308] = "Use @lre@" + local566.aString25;
													this.anIntArray58[this.anInt308] = 102;
													this.anIntArray59[this.anInt308] = local566.anInt625;
													this.anIntArray56[this.anInt308] = local487;
													this.anIntArray57[this.anInt308] = local67.anInt423;
													this.anInt308++;
												}
												if (local67.aBoolean87 && local566.aStringArray11 != null) {
													for (local703 = 2; local703 >= 0; local703--) {
														if (local566.aStringArray11[local703] != null) {
															this.aStringArray4[this.anInt308] = local566.aStringArray11[local703] + " @lre@" + local566.aString25;
															if (local703 == 0) {
																this.anIntArray58[this.anInt308] = 694;
															}
															if (local703 == 1) {
																this.anIntArray58[this.anInt308] = 962;
															}
															if (local703 == 2) {
																this.anIntArray58[this.anInt308] = 795;
															}
															this.anIntArray59[this.anInt308] = local566.anInt625;
															this.anIntArray56[this.anInt308] = local487;
															this.anIntArray57[this.anInt308] = local67.anInt423;
															this.anInt308++;
														}
													}
												}
												if (local67.aStringArray7 != null) {
													for (local703 = 4; local703 >= 0; local703--) {
														if (local67.aStringArray7[local703] != null) {
															this.aStringArray4[this.anInt308] = local67.aStringArray7[local703] + " @lre@" + local566.aString25;
															if (local703 == 0) {
																this.anIntArray58[this.anInt308] = 582;
															}
															if (local703 == 1) {
																this.anIntArray58[this.anInt308] = 113;
															}
															if (local703 == 2) {
																this.anIntArray58[this.anInt308] = 555;
															}
															if (local703 == 3) {
																this.anIntArray58[this.anInt308] = 331;
															}
															if (local703 == 4) {
																this.anIntArray58[this.anInt308] = 354;
															}
															this.anIntArray59[this.anInt308] = local566.anInt625;
															this.anIntArray56[this.anInt308] = local487;
															this.anIntArray57[this.anInt308] = local67.anInt423;
															this.anInt308++;
														}
													}
												}
												this.aStringArray4[this.anInt308] = "Examine @lre@" + local566.aString25;
												this.anIntArray58[this.anInt308] = 1328;
												this.anIntArray59[this.anInt308] = local566.anInt625;
												this.anIntArray56[this.anInt308] = local487;
												this.anIntArray57[this.anInt308] = local67.anInt423;
												this.anInt308++;
											} else if ((this.anInt303 & 0x10) == 16) {
												this.aStringArray4[this.anInt308] = this.aString12 + " @lre@" + local566.aString25;
												this.anIntArray58[this.anInt308] = 563;
												this.anIntArray59[this.anInt308] = local566.anInt625;
												this.anIntArray56[this.anInt308] = local487;
												this.anIntArray57[this.anInt308] = local67.anInt423;
												this.anInt308++;
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
		} catch (@Pc(1133) RuntimeException local1133) {
			signlink.reporterror("88318, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1133.toString());
			throw new RuntimeException();
		}
	}
}
