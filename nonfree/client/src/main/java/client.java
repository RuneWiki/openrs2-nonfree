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

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private static int anInt214;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private static int anInt225;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private static int anInt235;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	public static int anInt256;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Z")
	private static boolean aBoolean52;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private static int anInt260;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private static int anInt271;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private static int anInt272;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private static boolean aBoolean56;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Z")
	private static boolean aBoolean58;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	public static int anInt283;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private static int anInt287;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private static int anInt321;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private static int anInt323;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private static int anInt335;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private static int anInt342;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private static int anInt347;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private static int anInt366;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private static int anInt368;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private static int anInt373;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private static int anInt383;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private static int anInt389;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
	private static boolean aBoolean84;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private static int anInt427;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private static int anInt240 = 88;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "B")
	private static byte aByte7 = 8;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private static int anInt255 = 10;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
	private static boolean aBoolean51 = true;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	public static int[] anIntArray48 = new int[32];

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "[[I")
	public static final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private static int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "B")
	private static byte aByte12;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private static int anInt318;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Ljava/lang/String;")
	private static String aString10;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private static int anInt324;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private static int anInt336;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private static int anInt365;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Z")
	private static boolean aBoolean76;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private static int anInt369;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
	public static final int[] anIntArray79;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	public int[] anIntArray32 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
	private boolean aBoolean41 = true;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray33 = new int[151];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt213 = -1;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(anInt318);

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt217 = -292;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt219 = 1;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt224 = -1;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt227 = 3;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray34 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
	private int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt236 = 2048;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt237 = 2047;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt236];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
	private int[] anIntArray36 = new int[this.anInt236];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray37 = new int[this.anInt236];

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt236];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[I")
	private int[] anIntArray38 = new int[33];

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt241 = 9;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt246 = 2;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt247 = -1;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
	private int[] anIntArray42 = new int[2000];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt248 = -1;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[I")
	private int[] anIntArray43 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt250 = -1;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt251 = -1;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray44 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt253 = 9;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt254 = -1;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt258 = -1;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt259 = -484;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray45 = new int[100];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt261 = 128;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt266 = 2;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray46 = new int[256];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
	private int[] anIntArray47 = new int[50];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[200];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "B")
	private byte aByte8 = 6;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray49 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray50 = new int[500];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[I")
	private int[] anIntArray51 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray52 = new int[500];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray53 = new int[500];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt285 = 47587;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt288 = -1;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt289 = 595;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "B")
	private byte aByte9 = 47;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private final int anInt291 = 100;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray54 = new int[100];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
	private int[] anIntArray55 = new int[9];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "B")
	private byte aByte10 = 39;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt304 = -1;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "B")
	private byte aByte11 = 42;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt307 = 3353893;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt309 = 2;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt310 = 225;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt311 = 78;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "B")
	private byte aByte13 = 34;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[I")
	private int[] anIntArray59 = new int[5];

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt322 = -114;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray60 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[I")
	private int[] anIntArray61 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "B")
	private byte aByte14 = 4;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "B")
	private byte aByte15 = 64;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	private int[] anIntArray62 = new int[Class30.anInt825];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt334 = -1;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt343 = 315;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
	private int[] anIntArray63 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[I")
	private int[] anIntArray64 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt348 = 5063219;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "B")
	private byte aByte16 = -114;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray67 = new int[33];

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt349 = 4;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[I")
	private int[] anIntArray68 = new int[5];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt351 = 50;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray69 = new int[this.anInt351];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray70 = new int[this.anInt351];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray71 = new int[this.anInt351];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray72 = new int[this.anInt351];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray73 = new int[this.anInt351];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
	private int[] anIntArray74 = new int[this.anInt351];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private int[] anIntArray75 = new int[this.anInt351];

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[this.anInt351];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray76 = new int[50];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[5];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "B")
	private byte aByte17 = 7;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt364 = 977;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray77 = new int[151];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray78 = new int[Class30.anInt825];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "B")
	private byte aByte18 = 85;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "B")
	private byte aByte19 = 85;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt371 = -1;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "B")
	private byte aByte20 = 3;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt374 = 9;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt375 = 2301979;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray80 = new int[16384];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt378 = -165;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray84 = new int[Class30.anInt825];

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(anInt318);

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt380 = -50;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt381 = 8;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
	private int[] anIntArray85 = new int[7];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray90 = new int[200];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray91 = new int[5];

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt391 = 315;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt393 = -1;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt394 = 560;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt397 = 1;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
	private final int[] anIntArray92 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
	private int[] anIntArray93 = new int[5];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(anInt318);

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt410 = -1;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt411 = 7759444;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt418 = 2;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "B")
	private byte aByte21 = 39;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt419 = 3;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt422 = 9527;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "B")
	private byte aByte22 = 59;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[500];

	static {
		@Pc(12) int local12 = 2;
		@Pc(14) int local14;
		for (local14 = 0; local14 < 32; local14++) {
			anIntArray48[local14] = local12 - 1;
			local12 += local12;
		}
		anIntArrayArray4 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray56 = new int[99];
		local12 = 0;
		for (local14 = 0; local14 < 99; local14++) {
			@Pc(301) int local301 = local14 + 1;
			@Pc(314) int local314 = (int) ((double) local301 + Math.pow(2.0D, (double) local301 / 7.0D) * 300.0D);
			local12 += local314;
			anIntArray56[local14] = local12 / 4;
		}
		aByte12 = 7;
		anInt318 = 888;
		aString10 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt324 = 35102;
		anInt336 = -47;
		anInt365 = 413;
		aBoolean76 = true;
		anInt369 = 24133;
		anIntArray79 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private static void method124() {
		try {
			Class37.aBoolean212 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean149 = true;
			aBoolean52 = true;
			Class4.aBoolean30 = true;
			Class9.aBoolean119 = true;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("72732, " + -47 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 300);
			if (arg0.length == 5) {
				anInt255 = Integer.parseInt(arg0[0]);
				anInt256 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method124();
				} else if (arg0[2].equals("highmem")) {
					method177();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean51 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean51 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt954 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method84();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
	private static String method145(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("92287, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private static String method146(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("89976, " + arg0 + ", " + true + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private static void method177() {
		try {
			Class37.aBoolean212 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean149 = false;
			aBoolean52 = false;
			Class4.aBoolean30 = false;
			Class9.aBoolean119 = false;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("92338, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	private static String method201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) int local7 = arg0 - arg1;
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
			signlink.reporterror("79620, " + arg0 + ", " + false + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method97(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt275; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray3[local7])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("86090, " + arg0 + ", " + 9 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method98(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean57) {
					this.aBoolean57 = false;
					this.aBoolean53 = true;
				}
				@Pc(18) int local18 = this.anIntArray50[arg0];
				@Pc(23) int local23 = this.anIntArray51[arg0];
				@Pc(28) int local28 = this.anIntArray52[arg0];
				@Pc(33) int local33 = this.anIntArray53[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 899 && this.method168(local33, local23, local18, 167)) {
					this.aClass1_Sub1_Sub3_2.method471(this.anInt359);
				}
				if (local28 == 1071) {
					this.method168(local33, local23, local18, 246);
				}
				if (local28 == 718) {
					if (this.aBoolean81) {
						this.aClass37_1.method568(local23 - 4, local18 - 4);
					} else {
						this.aClass37_1.method568(super.anInt200 - 4, super.anInt199 - 4);
					}
				}
				if (local28 == 357) {
					this.method168(local33, local23, local18, 123);
				}
				if (local28 == 810 && this.method168(local33, local23, local18, 9)) {
					this.aClass1_Sub1_Sub3_2.method471(this.anInt332);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt330);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt331);
				}
				if (local28 == 737) {
					this.method125();
				}
				@Pc(163) String local163;
				@Pc(178) String local178;
				@Pc(144) Class6 local144;
				if (local28 == 274) {
					local144 = Class6.aClass6Array1[local23];
					this.anInt358 = 1;
					this.anInt359 = local23;
					this.anInt360 = local144.anInt460;
					this.anInt329 = 0;
					this.aBoolean60 = true;
					local163 = local144.aString20;
					if (local163.indexOf(" ") != -1) {
						local163 = local163.substring(0, local163.indexOf(" "));
					}
					local178 = local144.aString20;
					if (local178.indexOf(" ") != -1) {
						local178 = local178.substring(local178.indexOf(" ") + 1);
					}
					this.aString15 = local163 + " " + local144.aString21 + " " + local178;
					if (this.anInt360 == 16) {
						this.aBoolean60 = true;
						this.anInt419 = 3;
						this.aBoolean70 = true;
					}
				} else {
					if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
						if (local28 == 694) {
							this.aClass1_Sub1_Sub3_2.method469(67);
						}
						if (local28 == 681) {
							anInt368++;
							if (anInt368 >= 116) {
								this.aClass1_Sub1_Sub3_2.method469(214);
								this.aClass1_Sub1_Sub3_2.method473(13018169);
							}
							this.aClass1_Sub1_Sub3_2.method469(155);
						}
						if (local28 == 100) {
							this.aClass1_Sub1_Sub3_2.method469(243);
						}
						if (local28 == 795) {
							this.aClass1_Sub1_Sub3_2.method469(195);
						}
						if (local28 == 962) {
							this.aClass1_Sub1_Sub3_2.method469(52);
						}
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(local18);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						this.anInt423 = 0;
						this.anInt424 = local23;
						this.anInt425 = local18;
						this.anInt426 = 2;
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt254) {
							this.anInt426 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt371) {
							this.anInt426 = 3;
						}
					}
					@Pc(343) Class15 local343;
					if (local28 == 1328) {
						local343 = Class15.method361(local33);
						@Pc(347) Class6 local347 = Class6.aClass6Array1[local23];
						if (local347 != null && local347.anIntArray95[local18] >= 100000) {
							local163 = local347.anIntArray95[local18] + " x " + local343.aString25;
						} else if (local343.aByteArray6 == null) {
							local163 = "It's a " + local343.aString25 + ".";
						} else {
							local163 = new String(local343.aByteArray6);
						}
						this.method171(0, local163, "");
					}
					@Pc(408) String local408;
					@Pc(412) int local412;
					if (local28 == 524) {
						local408 = this.aStringArray6[arg0];
						local412 = local408.indexOf("@whi@");
						if (local412 != -1) {
							if (this.anInt254 == -1) {
								this.method125();
								this.aString9 = local408.substring(local412 + 5).trim();
								this.aBoolean86 = false;
								for (@Pc(435) int local435 = 0; local435 < Class6.aClass6Array1.length; local435++) {
									if (Class6.aClass6Array1[local435] != null && Class6.aClass6Array1[local435].anInt436 == 600) {
										this.anInt304 = this.anInt254 = Class6.aClass6Array1[local435].anInt433;
										break;
									}
								}
							} else {
								this.method171(0, "Please close the interface you have open before using 'report abuse'", "");
							}
						}
					}
					if (local28 == 743) {
						anInt342++;
						if (anInt342 >= 124) {
							this.aClass1_Sub1_Sub3_2.method469(201);
							this.aClass1_Sub1_Sub3_2.method471(37954);
						}
						this.method168(local33, local23, local18, 142);
					}
					@Pc(518) Class1_Sub1_Sub1_Sub1_Sub1 local518;
					if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
						local518 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local518 != null) {
							this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local518.anIntArray273[0], 2, local518.anIntArray272[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt220 = super.anInt199;
							this.anInt221 = super.anInt200;
							this.anInt223 = 2;
							this.anInt222 = 0;
							if (local28 == 387) {
								anInt225 += local33;
								if (anInt225 >= 66) {
									this.aClass1_Sub1_Sub3_2.method469(244);
									this.aClass1_Sub1_Sub3_2.method470(154);
								}
								this.aClass1_Sub1_Sub3_2.method469(183);
							}
							if (local28 == 499) {
								this.aClass1_Sub1_Sub3_2.method469(147);
							}
							if (local28 == 639) {
								anInt235++;
								if (anInt235 >= 52) {
									this.aClass1_Sub1_Sub3_2.method469(206);
									this.aClass1_Sub1_Sub3_2.method470(131);
								}
								this.aClass1_Sub1_Sub3_2.method469(230);
							}
							if (local28 == 185) {
								this.aClass1_Sub1_Sub3_2.method469(54);
							}
							if (local28 == 27) {
								this.aClass1_Sub1_Sub3_2.method469(27);
							}
							this.aClass1_Sub1_Sub3_2.method471(local33);
						}
					}
					@Pc(657) Class1_Sub1_Sub1_Sub1_Sub2 local657;
					if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
						local657 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local657 != null) {
							this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local657.anIntArray273[0], 2, local657.anIntArray272[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt220 = super.anInt199;
							this.anInt221 = super.anInt200;
							this.anInt223 = 2;
							this.anInt222 = 0;
							if (local28 == 309) {
								this.aClass1_Sub1_Sub3_2.method469(106);
							}
							if (local28 == 793) {
								this.aClass1_Sub1_Sub3_2.method469(149);
							}
							if (local28 == 242) {
								this.aClass1_Sub1_Sub3_2.method469(70);
							}
							if (local28 == 209) {
								this.aClass1_Sub1_Sub3_2.method469(45);
							}
							if (local28 == 852) {
								this.aClass1_Sub1_Sub3_2.method469(17);
							}
							this.aClass1_Sub1_Sub3_2.method471(local33);
						}
					}
					@Pc(780) boolean local780;
					if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
						local780 = this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, false, 0, local23, 2, local18, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
						if (!local780) {
							this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local23, 2, local18, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
						}
						this.anInt220 = super.anInt199;
						this.anInt221 = super.anInt200;
						this.anInt223 = 2;
						this.anInt222 = 0;
						if (local28 == 778) {
							this.aClass1_Sub1_Sub3_2.method469(203);
						}
						if (local28 == 139) {
							if ((local18 & 0x3) == 0) {
								anInt427++;
							}
							if (anInt427 >= 123) {
								this.aClass1_Sub1_Sub3_2.method469(237);
								this.aClass1_Sub1_Sub3_2.method474(0);
							}
							this.aClass1_Sub1_Sub3_2.method469(21);
						}
						if (local28 == 224) {
							anInt347 += local23;
							if (anInt347 >= 75) {
								this.aClass1_Sub1_Sub3_2.method469(184);
								this.aClass1_Sub1_Sub3_2.method470(19);
							}
							this.aClass1_Sub1_Sub3_2.method469(204);
						}
						if (local28 == 662) {
							anInt321 += this.anInt354;
							if (anInt321 >= 118) {
								this.aClass1_Sub1_Sub3_2.method469(122);
								this.aClass1_Sub1_Sub3_2.method474(0);
							}
							this.aClass1_Sub1_Sub3_2.method469(205);
						}
						if (local28 == 617) {
							this.aClass1_Sub1_Sub3_2.method469(66);
						}
						this.aClass1_Sub1_Sub3_2.method471(local18 + this.anInt353);
						this.aClass1_Sub1_Sub3_2.method471(local23 + this.anInt354);
						this.aClass1_Sub1_Sub3_2.method471(local33);
					}
					if (local28 == 240) {
						local657 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local657 != null) {
							this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local657.anIntArray273[0], 2, local657.anIntArray272[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt220 = super.anInt199;
							this.anInt221 = super.anInt200;
							this.anInt223 = 2;
							this.anInt222 = 0;
							this.aClass1_Sub1_Sub3_2.method469(127);
							this.aClass1_Sub1_Sub3_2.method471(local33);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt359);
						}
					}
					if (local28 == 398) {
						this.aClass1_Sub1_Sub3_2.method469(241);
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(local18);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt332);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt330);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt331);
						this.anInt423 = 0;
						this.anInt424 = local23;
						this.anInt425 = local18;
						this.anInt426 = 2;
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt254) {
							this.anInt426 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt371) {
							this.anInt426 = 3;
						}
					}
					if (local28 == 1152) {
						local343 = Class15.method361(local33);
						if (local343.aByteArray6 == null) {
							local163 = "It's a " + local343.aString25 + ".";
						} else {
							local163 = new String(local343.aByteArray6);
						}
						this.method171(0, local163, "");
					}
					if (local28 == 275) {
						local518 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local518 != null) {
							this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local518.anIntArray273[0], 2, local518.anIntArray272[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt220 = super.anInt199;
							this.anInt221 = super.anInt200;
							this.anInt223 = 2;
							this.anInt222 = 0;
							this.aClass1_Sub1_Sub3_2.method469(242);
							this.aClass1_Sub1_Sub3_2.method471(local33);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt332);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt330);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt331);
						}
					}
					@Pc(1201) long local1201;
					if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
						local408 = this.aStringArray6[arg0];
						local412 = local408.indexOf("@whi@");
						if (local412 != -1) {
							local1201 = Class48.method667(local408.substring(local412 + 5).trim());
							if (local28 == 605) {
								this.method162(local1201);
							}
							if (local28 == 47) {
								this.method190(local1201);
							}
							if (local28 == 513) {
								this.method215(local1201);
							}
							if (local28 == 884) {
								this.method160(local1201);
							}
						}
					}
					if (local28 == 829) {
						local657 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local657 != null) {
							this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local657.anIntArray273[0], 2, local657.anIntArray272[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt220 = super.anInt199;
							this.anInt221 = super.anInt200;
							this.anInt223 = 2;
							this.anInt222 = 0;
							this.aClass1_Sub1_Sub3_2.method469(150);
							this.aClass1_Sub1_Sub3_2.method471(local33);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt332);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt330);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt331);
						}
					}
					if (local28 == 997 && !this.aBoolean62) {
						this.aClass1_Sub1_Sub3_2.method469(239);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						this.aBoolean62 = true;
					}
					if (local28 == 111) {
						local780 = this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, false, 0, local23, 2, local18, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
						if (!local780) {
							this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local23, 2, local18, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
						}
						this.anInt220 = super.anInt199;
						this.anInt221 = super.anInt200;
						this.anInt223 = 2;
						this.anInt222 = 0;
						this.aClass1_Sub1_Sub3_2.method469(176);
						this.aClass1_Sub1_Sub3_2.method471(local18 + this.anInt353);
						this.aClass1_Sub1_Sub3_2.method471(local23 + this.anInt354);
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt332);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt330);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt331);
					}
					if (local28 == 225) {
						this.aClass1_Sub1_Sub3_2.method469(100);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						local144 = Class6.aClass6Array1[local23];
						if (local144.anIntArrayArray7 != null && local144.anIntArrayArray7[0][0] == 5) {
							local412 = local144.anIntArrayArray7[0][1];
							if (this.anIntArray32[local412] != local144.anIntArray97[0]) {
								this.anIntArray32[local412] = local144.anIntArray97[0];
								this.method163(local412);
								this.aBoolean60 = true;
							}
						}
					}
					if (local28 == 370) {
						local780 = this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, false, 0, local23, 2, local18, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
						if (!local780) {
							this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local23, 2, local18, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
						}
						this.anInt220 = super.anInt199;
						this.anInt221 = super.anInt200;
						this.anInt223 = 2;
						this.anInt222 = 0;
						this.aClass1_Sub1_Sub3_2.method469(144);
						this.aClass1_Sub1_Sub3_2.method471(local18 + this.anInt353);
						this.aClass1_Sub1_Sub3_2.method471(local23 + this.anInt354);
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt359);
					}
					if (local28 == 1381) {
						@Pc(1577) int local1577 = local33 >> 14 & 0x7FFF;
						@Pc(1580) Class9 local1580 = Class9.method288(local1577);
						if (local1580.aByteArray4 == null) {
							local178 = "It's a " + local1580.aString23 + ".";
						} else {
							local178 = new String(local1580.aByteArray4);
						}
						this.method171(0, local178, "");
					}
					if (local28 == 625) {
						this.method168(local33, local23, local18, 97);
					}
					if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
						if (local28 == 582) {
							if ((local33 & 0x3) == 0) {
								anInt323++;
							}
							if (anInt323 >= 133) {
								this.aClass1_Sub1_Sub3_2.method469(30);
								this.aClass1_Sub1_Sub3_2.method471(6118);
							}
							this.aClass1_Sub1_Sub3_2.method469(103);
						}
						if (local28 == 354) {
							this.aClass1_Sub1_Sub3_2.method469(198);
						}
						if (local28 == 113) {
							this.aClass1_Sub1_Sub3_2.method469(25);
						}
						if (local28 == 555) {
							this.aClass1_Sub1_Sub3_2.method469(85);
						}
						if (local28 == 331) {
							this.aClass1_Sub1_Sub3_2.method469(210);
						}
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(local18);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						this.anInt423 = 0;
						this.anInt424 = local23;
						this.anInt425 = local18;
						this.anInt426 = 2;
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt254) {
							this.anInt426 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt371) {
							this.anInt426 = 3;
						}
					}
					@Pc(1763) int local1763;
					if (local28 == 902) {
						local408 = this.aStringArray6[arg0];
						local412 = local408.indexOf("@whi@");
						if (local412 != -1) {
							local1201 = Class48.method667(local408.substring(local412 + 5).trim());
							local1763 = -1;
							for (@Pc(1765) int local1765 = 0; local1765 < this.anInt275; local1765++) {
								if (this.aLongArray4[local1765] == local1201) {
									local1763 = local1765;
									break;
								}
							}
							if (local1763 != -1 && this.anIntArray90[local1763] > 0) {
								this.aBoolean53 = true;
								this.aBoolean57 = false;
								this.aBoolean75 = true;
								this.aString17 = "";
								this.anInt357 = 3;
								this.aLong16 = this.aLongArray4[local1763];
								this.aString4 = "Enter message to send to " + this.aStringArray3[local1763];
							}
						}
					}
					if (local28 == 231) {
						local144 = Class6.aClass6Array1[local23];
						@Pc(1833) boolean local1833 = true;
						if (local144.anInt436 > 0) {
							local1833 = this.method222((byte) 3, local144);
						}
						if (local1833) {
							this.aClass1_Sub1_Sub3_2.method469(100);
							this.aClass1_Sub1_Sub3_2.method471(local23);
						}
					}
					if (local28 == 507 || local28 == 957) {
						local408 = this.aStringArray6[arg0];
						local412 = local408.indexOf("@whi@");
						if (local412 != -1) {
							local408 = local408.substring(local412 + 5).trim();
							local178 = Class48.method671(Class48.method668(Class48.method667(local408)));
							@Pc(1886) boolean local1886 = false;
							for (local1763 = 0; local1763 < this.anInt238; local1763++) {
								@Pc(1898) Class1_Sub1_Sub1_Sub1_Sub1 local1898 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray36[local1763]];
								if (local1898 != null && local1898.aString3 != null && local1898.aString3.equalsIgnoreCase(local178)) {
									this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local1898.anIntArray273[0], 2, local1898.anIntArray272[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
									if (local28 == 507) {
										anInt225 += local33;
										if (anInt225 >= 66) {
											this.aClass1_Sub1_Sub3_2.method469(244);
											this.aClass1_Sub1_Sub3_2.method470(154);
										}
										this.aClass1_Sub1_Sub3_2.method469(183);
									}
									if (local28 == 957) {
										anInt235++;
										if (anInt235 >= 52) {
											this.aClass1_Sub1_Sub3_2.method469(206);
											this.aClass1_Sub1_Sub3_2.method470(131);
										}
										this.aClass1_Sub1_Sub3_2.method469(230);
									}
									this.aClass1_Sub1_Sub3_2.method471(this.anIntArray36[local1763]);
									local1886 = true;
									break;
								}
							}
							if (!local1886) {
								this.method171(0, "Unable to find " + local178, "");
							}
						}
					}
					if (local28 == 102) {
						this.anInt329 = 1;
						this.anInt330 = local18;
						this.anInt331 = local23;
						this.anInt332 = local33;
						this.aString11 = Class15.method361(local33).aString25;
						this.anInt358 = 0;
						this.aBoolean60 = true;
					} else {
						if (local28 == 721) {
							anInt335 += local23;
							if (anInt335 >= 139) {
								this.aClass1_Sub1_Sub3_2.method469(59);
								this.aClass1_Sub1_Sub3_2.method474(0);
							}
							this.method168(local33, local23, local18, 139);
						}
						if (local28 == 435) {
							this.aClass1_Sub1_Sub3_2.method469(100);
							this.aClass1_Sub1_Sub3_2.method471(local23);
							local144 = Class6.aClass6Array1[local23];
							if (local144.anIntArrayArray7 != null && local144.anIntArrayArray7[0][0] == 5) {
								local412 = local144.anIntArrayArray7[0][1];
								this.anIntArray32[local412] = 1 - this.anIntArray32[local412];
								this.method163(local412);
								this.aBoolean60 = true;
							}
						}
						if (local28 == 1714) {
							local657 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local657 != null) {
								@Pc(2131) Class13 local2131 = local657.aClass13_2;
								if (local2131.anIntArray174 != null) {
									local2131 = local2131.method327(this.aByte17);
								}
								if (local2131 != null) {
									if (local2131.aByteArray5 == null) {
										local178 = "It's a " + local2131.aString24 + ".";
									} else {
										local178 = new String(local2131.aByteArray5);
									}
									this.method171(0, local178, "");
								}
							}
						}
						if (local28 == 563) {
							this.aClass1_Sub1_Sub3_2.method469(216);
							this.aClass1_Sub1_Sub3_2.method471(local33);
							this.aClass1_Sub1_Sub3_2.method471(local18);
							this.aClass1_Sub1_Sub3_2.method471(local23);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt359);
							this.anInt423 = 0;
							this.anInt424 = local23;
							this.anInt425 = local18;
							this.anInt426 = 2;
							if (Class6.aClass6Array1[local23].anInt433 == this.anInt254) {
								this.anInt426 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt433 == this.anInt371) {
								this.anInt426 = 3;
							}
						}
						if (local28 == 131) {
							local518 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local518 != null) {
								this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, false, 0, local518.anIntArray273[0], 2, local518.anIntArray272[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
								this.anInt220 = super.anInt199;
								this.anInt221 = super.anInt200;
								this.anInt223 = 2;
								this.anInt222 = 0;
								this.aClass1_Sub1_Sub3_2.method469(218);
								this.aClass1_Sub1_Sub3_2.method471(local33);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt359);
							}
						}
						this.anInt329 = 0;
						this.anInt358 = 0;
						this.aBoolean60 = true;
					}
				}
			}
		} catch (@Pc(2306) RuntimeException local2306) {
			signlink.reporterror("16386, " + 0 + ", " + arg0 + ", " + local2306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg2;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local5];
				local37 = local27 * 0 - arg2 * local23 >> 16;
				local17 = local23 * 0 + arg2 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt292 = arg3 - local13;
			this.anInt293 = arg1 - local15;
			this.anInt294 = arg5 - local17;
			this.anInt295 = arg0;
			this.anInt296 = arg4;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("43952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 362 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
				if (this.aStringArray2[local8] != null) {
					@Pc(20) int local20 = this.anIntArray45[local8];
					@Pc(31) int local31 = this.anInt298 + 70 + 4 - local6 * 14;
					if (local31 < -20) {
						break;
					}
					@Pc(39) String local39 = this.aStringArray1[local8];
					if (local39 != null && local39.startsWith("@cr1@")) {
						local39 = local39.substring(5);
					}
					if (local39 != null && local39.startsWith("@cr2@")) {
						local39 = local39.substring(5);
					}
					if (local20 == 0) {
						local6++;
					}
					if ((local20 == 1 || local20 == 2) && (local20 == 1 || this.anInt376 == 0 || this.anInt376 == 1 && this.method97(local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31 && !local39.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt409 >= 1) {
								this.aStringArray6[this.anInt395] = "Report abuse @whi@" + local39;
								this.anIntArray52[this.anInt395] = 524;
								this.anInt395++;
							}
							this.aStringArray6[this.anInt395] = "Add ignore @whi@" + local39;
							this.anIntArray52[this.anInt395] = 47;
							this.anInt395++;
							this.aStringArray6[this.anInt395] = "Add friend @whi@" + local39;
							this.anIntArray52[this.anInt395] = 605;
							this.anInt395++;
						}
						local6++;
					}
					if ((local20 == 3 || local20 == 7) && this.anInt370 == 0 && (local20 == 7 || this.anInt277 == 0 || this.anInt277 == 1 && this.method97(local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							if (this.anInt409 >= 1) {
								this.aStringArray6[this.anInt395] = "Report abuse @whi@" + local39;
								this.anIntArray52[this.anInt395] = 524;
								this.anInt395++;
							}
							this.aStringArray6[this.anInt395] = "Add ignore @whi@" + local39;
							this.anIntArray52[this.anInt395] = 47;
							this.anInt395++;
							this.aStringArray6[this.anInt395] = "Add friend @whi@" + local39;
							this.anIntArray52[this.anInt395] = 605;
							this.anInt395++;
						}
						local6++;
					}
					if (local20 == 4 && (this.anInt325 == 0 || this.anInt325 == 1 && this.method97(local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							this.aStringArray6[this.anInt395] = "Accept trade @whi@" + local39;
							this.anIntArray52[this.anInt395] = 507;
							this.anInt395++;
						}
						local6++;
					}
					if ((local20 == 5 || local20 == 6) && this.anInt370 == 0 && this.anInt277 < 2) {
						local6++;
					}
					if (local20 == 8 && (this.anInt325 == 0 || this.anInt325 == 1 && this.method97(local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							this.aStringArray6[this.anInt395] = "Accept challenge @whi@" + local39;
							this.anIntArray52[this.anInt395] = 957;
							this.anInt395++;
						}
						local6++;
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("86890, " + -282 + ", " + arg0 + ", " + arg1 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method95(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method95(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) int local7 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local7 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local7 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("43693, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)I")
	private int method102() {
		try {
			@Pc(8) int local8 = 3;
			if (this.anInt295 < 310) {
				@Pc(17) int local17 = this.anInt292 >> 7;
				@Pc(22) int local22 = this.anInt294 >> 7;
				@Pc(27) int local27 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 >> 7;
				@Pc(32) int local32 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt320][local17][local22] & 0x4) != 0) {
					local8 = this.anInt320;
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
						if ((this.aByteArrayArrayArray7[this.anInt320][local17][local22] & 0x4) != 0) {
							local8 = this.anInt320;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt320][local17][local22] & 0x4) != 0) {
								local8 = this.anInt320;
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
						if ((this.aByteArrayArrayArray7[this.anInt320][local17][local22] & 0x4) != 0) {
							local8 = this.anInt320;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt320][local17][local22] & 0x4) != 0) {
								local8 = this.anInt320;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt320][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 >> 7] & 0x4) != 0) {
				local8 = this.anInt320;
			}
			return local8;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("6553, " + 139 + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)I")
	private int method103() {
		try {
			@Pc(22) int local22 = this.method181(this.anInt294, this.anInt292, this.anInt320);
			return local22 - this.anInt293 >= 800 || (this.aByteArrayArrayArray7[this.anInt320][this.anInt292 >> 7][this.anInt294 >> 7] & 0x4) == 0 ? 3 : this.anInt320;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("58952, " + 2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nb;I)V")
	private void method104(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt795 == 0) {
				local1 = this.aClass37_1.method556(arg0.anInt794, arg0.anInt796, arg0.anInt797);
			}
			if (arg0.anInt795 == 1) {
				local1 = this.aClass37_1.method557(arg0.anInt797, arg0.anInt796, arg0.anInt794);
			}
			if (arg0.anInt795 == 2) {
				local1 = this.aClass37_1.method558(arg0.anInt794, arg0.anInt796, arg0.anInt797);
			}
			if (arg0.anInt795 == 3) {
				local1 = this.aClass37_1.method559(arg0.anInt794, arg0.anInt796, arg0.anInt797);
			}
			if (local1 != 0) {
				@Pc(82) int local82 = this.aClass37_1.method560(arg0.anInt794, arg0.anInt796, arg0.anInt797, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local82 & 0x1F;
				local7 = local82 >> 6;
			}
			arg0.anInt798 = local3;
			arg0.anInt800 = local5;
			arg0.anInt799 = local7;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("84202, " + arg0 + ", " + -22447 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!jb;)V")
	private void method105(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray65.length; local5++) {
				this.anIntArray65[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray65[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray66[local60] = (this.anIntArray65[local60 - 1] + this.anIntArray65[local60 + 1] + this.anIntArray65[local60 - 128] + this.anIntArray65[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray65;
				this.anIntArray65 = this.anIntArray66;
				this.anIntArray66 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt690; local52++) {
					for (local60 = 0; local60 < arg0.anInt689; local60++) {
						if (arg0.aByteArray7[local48++] != 0) {
							@Pc(146) int local146 = local60 + arg0.anInt691 + 16;
							@Pc(153) int local153 = local52 + arg0.anInt692 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray65[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("33091, " + 64 + ", " + arg0 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ib;III)V")
	private void method106(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt262 + this.anInt265 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt396 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt396 + 256);
				@Pc(62) int local62 = arg2 * local36 + arg1 * local45 >> 16;
				@Pc(72) int local72 = arg2 * local45 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg0.method397(this.aClass1_Sub1_Sub2_Sub3_11, local62 + 94 + 4 - arg0.anInt667 / 2, 83 - local72 - arg0.anInt668 / 2 - 4);
				} else {
					arg0.method391(83 - local72 - arg0.anInt668 / 2 - 4, local62 + 94 - arg0.anInt667 / 2 + 4);
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("79684, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method107() {
		try {
			if (this.aClass35_3 == null) {
				super.aClass35_2 = null;
				this.aClass35_27 = null;
				this.aClass35_25 = null;
				this.aClass35_24 = null;
				this.aClass35_26 = null;
				this.aClass35_12 = null;
				this.aClass35_13 = null;
				this.aClass35_14 = null;
				this.aClass35_6 = new Class35(aByte7, 128, 265, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_7 = new Class35(aByte7, 128, 265, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_3 = new Class35(aByte7, 509, 171, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_4 = new Class35(aByte7, 360, 132, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_5 = new Class35(aByte7, 360, 200, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_8 = new Class35(aByte7, 202, 238, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_9 = new Class35(aByte7, 203, 238, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_10 = new Class35(aByte7, 74, 94, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_11 = new Class35(aByte7, 75, 94, this.method94());
				Class1_Sub1_Sub2.method437();
				if (this.aClass47_1 != null) {
					this.method123();
					this.method148();
				}
				this.aBoolean47 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("53404, " + 0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean48) {
			this.method164();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!lb;)V")
	private void method108(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(13) int local13;
			@Pc(22) int local22;
			@Pc(29) int local29;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(45) int local45;
			@Pc(50) int local50;
			if (arg0 == 142 || arg0 == 237) {
				local13 = arg1.method480();
				local22 = this.anInt211 + (local13 >> 4 & 0x7);
				local29 = this.anInt212 + (local13 & 0x7);
				local32 = arg1.method480();
				local36 = local32 >> 2;
				local40 = local32 & 0x3;
				local45 = this.anIntArray92[local36];
				if (arg0 == 237) {
					local50 = -1;
				} else {
					local50 = arg1.method482();
				}
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
					this.method230(0, local22, local45, local36, local29, local50, -1, local40, this.anInt320);
				}
			} else {
				@Pc(140) int local140;
				@Pc(152) int local152;
				@Pc(166) int local166;
				@Pc(178) int local178;
				if (arg0 == 188) {
					local13 = arg1.method480();
					local22 = this.anInt211 + (local13 >> 4 & 0x7);
					local29 = this.anInt212 + (local13 & 0x7);
					local32 = arg1.method480();
					local36 = local32 >> 2;
					local40 = local32 & 0x3;
					local45 = this.anIntArray92[local36];
					local50 = arg1.method482();
					if (local22 >= 0 && local29 >= 0 && local22 < 103 && local29 < 103) {
						local140 = this.anIntArrayArrayArray6[this.anInt320][local22][local29];
						local152 = this.anIntArrayArrayArray6[this.anInt320][local22 + 1][local29];
						local166 = this.anIntArrayArrayArray6[this.anInt320][local22 + 1][local29 + 1];
						local178 = this.anIntArrayArrayArray6[this.anInt320][local22][local29 + 1];
						if (local45 == 0) {
							@Pc(189) Class34 local189 = this.aClass37_1.method552(this.anInt320, local22, local29);
							if (local189 != null) {
								@Pc(198) int local198 = local189.anInt853 >> 14 & 0x7FFF;
								if (local36 == 2) {
									local189.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local198, 2, local178, local152, local50, local40 + 4, local140, local166, false, 188);
									local189.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local198, 2, local178, local152, local50, local40 + 1 & 0x3, local140, local166, false, 188);
								} else {
									local189.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local198, local36, local178, local152, local50, local40, local140, local166, false, 188);
								}
							}
						}
						if (local45 == 1) {
							@Pc(266) Class14 local266 = this.aClass37_1.method553(this.anInt320, local22, (byte) 4, local29);
							if (local266 != null) {
								local266.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local266.anInt589 >> 14 & 0x7FFF, 4, local178, local152, local50, 0, local140, local166, false, 188);
							}
						}
						if (local45 == 2) {
							@Pc(300) Class31 local300 = this.aClass37_1.method554(local22, local29, this.anInt320);
							if (local36 == 11) {
								local36 = 10;
							}
							if (local300 != null) {
								local300.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local300.anInt837 >> 14 & 0x7FFF, local36, local178, local152, local50, local40, local140, local166, false, 188);
							}
						}
						if (local45 == 3) {
							@Pc(339) Class18 local339 = this.aClass37_1.method555(local29, this.anInt320, local22);
							if (local339 != null) {
								local339.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local339.anInt672 >> 14 & 0x7FFF, 22, local178, local152, local50, local40, local140, local166, false, 188);
							}
						}
					}
				} else {
					@Pc(404) Class1_Sub1_Sub1_Sub3 local404;
					if (arg0 == 7) {
						local13 = arg1.method480();
						local22 = this.anInt211 + (local13 >> 4 & 0x7);
						local29 = this.anInt212 + (local13 & 0x7);
						local32 = arg1.method482();
						local36 = arg1.method482();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local404 = new Class1_Sub1_Sub1_Sub3();
							local404.anInt177 = local32;
							local404.anInt178 = local36;
							if (this.aClass29ArrayArrayArray1[this.anInt320][local22][local29] == null) {
								this.aClass29ArrayArrayArray1[this.anInt320][local22][local29] = new Class29(anInt318);
							}
							this.aClass29ArrayArrayArray1[this.anInt320][local22][local29].method508(local404);
							this.method138(local22, local29);
						}
					} else if (arg0 == 76) {
						local13 = arg1.method480();
						local22 = this.anInt211 + (local13 >> 4 & 0x7);
						local29 = this.anInt212 + (local13 & 0x7);
						local32 = arg1.method482();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							@Pc(494) Class29 local494 = this.aClass29ArrayArrayArray1[this.anInt320][local22][local29];
							if (local494 != null) {
								for (local404 = (Class1_Sub1_Sub1_Sub3) local494.method511(); local404 != null; local404 = (Class1_Sub1_Sub1_Sub3) local494.method513()) {
									if (local404.anInt177 == (local32 & 0x7FFF)) {
										local404.method673();
										break;
									}
								}
								if (local494.method511() == null) {
									this.aClass29ArrayArrayArray1[this.anInt320][local22][local29] = null;
								}
								this.method138(local22, local29);
							}
						}
					} else if (arg0 == 192) {
						local13 = arg1.method480();
						local22 = this.anInt211 + (local13 >> 4 & 0x7);
						local29 = this.anInt212 + (local13 & 0x7);
						local32 = local22 + arg1.method481();
						local36 = local29 + arg1.method481();
						local40 = arg1.method483();
						local45 = arg1.method482();
						local50 = arg1.method480() * 4;
						local140 = arg1.method480() * 4;
						local152 = arg1.method482();
						local166 = arg1.method482();
						local178 = arg1.method480();
						@Pc(597) int local597 = arg1.method480();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local45 != 65535) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							local32 = local32 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(673) Class1_Sub1_Sub1_Sub4 local673 = new Class1_Sub1_Sub1_Sub4(-572, local597, this.anInt320, local178, local140, local22, local166 + anInt283, local152 + anInt283, local45, this.method181(local29, local22, this.anInt320) - local50, local29, local40);
							local673.method241(local32, local152 + anInt283, this.method181(local36, local32, this.anInt320) - local140, local36);
							this.aClass29_3.method508(local673);
						}
					} else if (arg0 == 45) {
						local13 = arg1.method480();
						local22 = this.anInt211 + (local13 >> 4 & 0x7);
						local29 = this.anInt212 + (local13 & 0x7);
						local32 = arg1.method482();
						local36 = arg1.method480();
						local40 = arg1.method482();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							@Pc(769) Class1_Sub1_Sub1_Sub6 local769 = new Class1_Sub1_Sub1_Sub6(5, local32, anInt283, this.anInt320, local29, local40, this.method181(local29, local22, this.anInt320) - local36, local22);
							this.aClass29_1.method508(local769);
						}
					} else if (arg0 == 14) {
						local13 = arg1.method480();
						local22 = this.anInt211 + (local13 >> 4 & 0x7);
						local29 = this.anInt212 + (local13 & 0x7);
						local32 = arg1.method482();
						local36 = arg1.method482();
						local40 = arg1.method482();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local40 != this.anInt247) {
							@Pc(823) Class1_Sub1_Sub1_Sub3 local823 = new Class1_Sub1_Sub1_Sub3();
							local823.anInt177 = local32;
							local823.anInt178 = local36;
							if (this.aClass29ArrayArrayArray1[this.anInt320][local22][local29] == null) {
								this.aClass29ArrayArrayArray1[this.anInt320][local22][local29] = new Class29(anInt318);
							}
							this.aClass29ArrayArrayArray1[this.anInt320][local22][local29].method508(local823);
							this.method138(local22, local29);
						}
					} else {
						if (arg0 == 35) {
							local13 = arg1.method480();
							local22 = this.anInt211 + (local13 >> 4 & 0x7);
							local29 = this.anInt212 + (local13 & 0x7);
							local32 = arg1.method480();
							local36 = local32 >> 2;
							local40 = local32 & 0x3;
							local45 = this.anIntArray92[local36];
							local50 = arg1.method482();
							local140 = arg1.method482();
							local152 = arg1.method482();
							local166 = arg1.method482();
							@Pc(921) byte local921 = arg1.method481();
							@Pc(924) byte local924 = arg1.method481();
							@Pc(927) byte local927 = arg1.method481();
							@Pc(930) byte local930 = arg1.method481();
							@Pc(936) Class1_Sub1_Sub1_Sub1_Sub1 local936;
							if (local166 == this.anInt247) {
								local936 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local936 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local166];
							}
							if (local936 != null) {
								@Pc(948) Class9 local948 = Class9.method288(local50);
								@Pc(958) int local958 = this.anIntArrayArrayArray6[this.anInt320][local22][local29];
								@Pc(970) int local970 = this.anIntArrayArrayArray6[this.anInt320][local22 + 1][local29];
								@Pc(984) int local984 = this.anIntArrayArrayArray6[this.anInt320][local22 + 1][local29 + 1];
								@Pc(996) int local996 = this.anIntArrayArrayArray6[this.anInt320][local22][local29 + 1];
								@Pc(1006) Class1_Sub1_Sub1_Sub5 local1006 = local948.method294(local36, local40, local958, local970, local984, local996, -1);
								if (local1006 != null) {
									this.method230(local140 + 1, local22, local45, 0, local29, -1, local152 + 1, 0, this.anInt320);
									local936.anInt131 = local140 + anInt283;
									local936.anInt132 = local152 + anInt283;
									local936.aClass1_Sub1_Sub1_Sub5_1 = local1006;
									@Pc(1041) int local1041 = local948.anInt516;
									@Pc(1044) int local1044 = local948.anInt517;
									if (local40 == 1 || local40 == 3) {
										local1041 = local948.anInt517;
										local1044 = local948.anInt516;
									}
									local936.anInt133 = local22 * 128 + local1041 * 64;
									local936.anInt135 = local29 * 128 + local1044 * 64;
									local936.anInt134 = this.method181(local936.anInt135, local936.anInt133, this.anInt320);
									@Pc(1090) byte local1090;
									if (local921 > local927) {
										local1090 = local921;
										local921 = local927;
										local927 = local1090;
									}
									if (local924 > local930) {
										local1090 = local924;
										local924 = local930;
										local930 = local1090;
									}
									local936.anInt136 = local22 + local921;
									local936.anInt138 = local22 + local927;
									local936.anInt137 = local29 + local924;
									local936.anInt139 = local29 + local930;
								}
							}
						}
						if (arg0 == 197) {
							local13 = arg1.method480();
							local22 = this.anInt211 + (local13 >> 4 & 0x7);
							local29 = this.anInt212 + (local13 & 0x7);
							local32 = arg1.method482();
							local36 = arg1.method482();
							local40 = arg1.method482();
							if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
								@Pc(1174) Class29 local1174 = this.aClass29ArrayArrayArray1[this.anInt320][local22][local29];
								if (local1174 != null) {
									for (@Pc(1180) Class1_Sub1_Sub1_Sub3 local1180 = (Class1_Sub1_Sub1_Sub3) local1174.method511(); local1180 != null; local1180 = (Class1_Sub1_Sub1_Sub3) local1174.method513()) {
										if (local1180.anInt177 == (local32 & 0x7FFF) && local1180.anInt178 == local36) {
											local1180.anInt178 = local40;
											break;
										}
									}
									this.method138(local22, local29);
								}
							}
						} else if (arg0 == 19) {
							local13 = arg1.method480();
							local22 = this.anInt211 + (local13 >> 4 & 0x7);
							local29 = this.anInt212 + (local13 & 0x7);
							local32 = arg1.method482();
							local36 = arg1.method480();
							local40 = local36 >> 4 & 0xF;
							local45 = local36 & 0x7;
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] >= local22 - local40 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] <= local22 + local40 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] >= local29 - local40 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] <= local29 + local40 && this.aBoolean88 && !aBoolean52 && this.anInt305 < 50) {
								this.anIntArray47[this.anInt305] = local32;
								this.anIntArray34[this.anInt305] = local45;
								this.anIntArray76[this.anInt305] = Class5.anIntArray29[local32];
								this.anInt305++;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1316) RuntimeException local1316) {
			signlink.reporterror("43760, " + false + ", " + arg0 + ", " + arg1 + ", " + local1316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method109(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt249 > 1) {
				this.anInt249--;
			}
			if (this.anInt416 > 0) {
				this.anInt416--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method198(); local22++) {
			}
			if (this.aBoolean82) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean58) {
						this.aClass11_1.anInt546 = 0;
					} else if (super.anInt198 != 0 || this.aClass11_1.anInt546 >= 40) {
						this.aClass1_Sub1_Sub3_2.method469(94);
						this.aClass1_Sub1_Sub3_2.method470(0);
						local66 = this.aClass1_Sub1_Sub3_2.anInt757;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt546 && local66 - this.aClass1_Sub1_Sub3_2.anInt757 < 240; local70++) {
							local68++;
							local86 = this.aClass11_1.anIntArray163[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass11_1.anIntArray162[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass11_1.anIntArray163[local70] == -1 && this.aClass11_1.anIntArray162[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt242 || local86 != this.anInt243) {
								@Pc(165) int local165 = local103 - this.anInt242;
								this.anInt242 = local103;
								@Pc(173) int local173 = local86 - this.anInt243;
								this.anInt243 = local86;
								if (this.anInt346 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_2.method471((this.anInt346 << 12) + (local165 << 6) + local173);
									this.anInt346 = 0;
								} else if (this.anInt346 < 8) {
									this.aClass1_Sub1_Sub3_2.method473((this.anInt346 << 19) + local120 + 8388608);
									this.anInt346 = 0;
								} else {
									this.aClass1_Sub1_Sub3_2.method474((this.anInt346 << 19) + local120 - 1073741824);
									this.anInt346 = 0;
								}
							} else if (this.anInt346 < 2047) {
								this.anInt346++;
							}
						}
						this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt757 - local66);
						if (local68 >= this.aClass11_1.anInt546) {
							this.aClass11_1.anInt546 = 0;
						} else {
							this.aClass11_1.anInt546 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt546; local86++) {
								this.aClass11_1.anIntArray162[local86] = this.aClass11_1.anIntArray162[local86 + local68];
								this.aClass11_1.anIntArray163[local86] = this.aClass11_1.anIntArray163[local86 + local68];
							}
						}
					}
				}
				if (super.anInt198 != 0) {
					@Pc(336) long local336 = (super.aLong13 - this.aLong18) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong18 = super.aLong13;
					local66 = super.anInt200;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt199;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt198 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_2.method469(238);
					this.aClass1_Sub1_Sub3_2.method474((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt339 > 0) {
					this.anInt339--;
				}
				if (super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1) {
					this.aBoolean71 = true;
				}
				if (this.aBoolean71 && this.anInt339 <= 0) {
					this.anInt339 = 20;
					this.aBoolean71 = false;
					this.aClass1_Sub1_Sub3_2.method469(212);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt261);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt262);
				}
				if (super.aBoolean40 && !this.aBoolean74) {
					this.aBoolean74 = true;
					this.aClass1_Sub1_Sub3_2.method469(11);
					this.aClass1_Sub1_Sub3_2.method470(1);
				}
				if (!super.aBoolean40 && this.aBoolean74) {
					this.aBoolean74 = false;
					this.aClass1_Sub1_Sub3_2.method469(11);
					this.aClass1_Sub1_Sub3_2.method470(0);
				}
				this.method172(this.aByte14);
				this.method159();
				this.method169(this.aByte9);
				this.anInt414++;
				if (this.anInt414 > 750) {
					this.method114(this.anInt259);
				}
				this.method180();
				this.method205();
				this.method117(834);
				this.anInt215++;
				if (this.anInt223 != 0) {
					this.anInt222 += 20;
					if (this.anInt222 >= 400) {
						this.anInt223 = 0;
					}
				}
				if (this.anInt426 != 0) {
					this.anInt423++;
					if (this.anInt423 >= 15) {
						if (this.anInt426 == 2) {
							this.aBoolean60 = true;
						}
						if (this.anInt426 == 3) {
							this.aBoolean53 = true;
						}
						this.anInt426 = 0;
					}
				}
				if (this.anInt403 != 0) {
					this.anInt363++;
					if (super.anInt193 > this.anInt404 + 5 || super.anInt193 < this.anInt404 - 5 || super.anInt194 > this.anInt405 + 5 || super.anInt194 < this.anInt405 - 5) {
						this.aBoolean69 = true;
					}
					if (super.anInt192 == 0) {
						if (this.anInt403 == 2) {
							this.aBoolean60 = true;
						}
						if (this.anInt403 == 3) {
							this.aBoolean53 = true;
						}
						this.anInt403 = 0;
						if (this.aBoolean69 && this.anInt363 >= 5) {
							this.anInt400 = -1;
							this.method165();
							if (this.anInt400 == this.anInt401 && this.anInt399 != this.anInt402) {
								@Pc(685) Class6 local685 = Class6.aClass6Array1[this.anInt401];
								@Pc(687) byte local687 = 0;
								if (this.anInt205 == 1 && local685.anInt436 == 206) {
									local687 = 1;
								}
								if (local685.anIntArray94[this.anInt399] <= 0) {
									local687 = 0;
								}
								if (local685.aBoolean97) {
									local66 = this.anInt402;
									local68 = this.anInt399;
									local685.anIntArray94[local68] = local685.anIntArray94[local66];
									local685.anIntArray95[local68] = local685.anIntArray95[local66];
									local685.anIntArray94[local66] = -1;
									local685.anIntArray95[local66] = 0;
								} else if (local687 == 1) {
									local66 = this.anInt402;
									local68 = this.anInt399;
									while (local66 != local68) {
										if (local66 > local68) {
											local685.method232((byte) 4, local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local685.method232((byte) 4, local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local685.method232((byte) 4, this.anInt402, this.anInt399);
								}
								this.aClass1_Sub1_Sub3_2.method469(126);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt401);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt402);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt399);
								this.aClass1_Sub1_Sub3_2.method470(local687);
							}
						} else if ((this.anInt233 == 1 || this.method193(this.anInt395 - 1, this.aBoolean83)) && this.anInt395 > 2) {
							this.method147();
						} else if (this.anInt395 > 0) {
							this.method98(this.anInt395 - 1);
						}
						this.anInt423 = 10;
						super.anInt198 = 0;
					}
				}
				anInt373++;
				if (anInt373 > 62) {
					anInt373 = 0;
					this.aClass1_Sub1_Sub3_2.method469(87);
				}
				@Pc(872) int local872;
				@Pc(874) int local874;
				if (Class37.anInt891 != -1) {
					local872 = Class37.anInt891;
					local874 = Class37.anInt892;
					@Pc(895) boolean local895 = this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, true, 0, local874, 0, local872, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
					Class37.anInt891 = -1;
					if (local895) {
						this.anInt220 = super.anInt199;
						this.anInt221 = super.anInt200;
						this.anInt223 = 1;
						this.anInt222 = 0;
					}
				}
				if (super.anInt198 == 1 && this.aString16 != null) {
					this.aString16 = null;
					this.aBoolean53 = true;
					super.anInt198 = 0;
				}
				this.method144();
				this.method191();
				this.method176();
				this.method217();
				if (super.anInt192 == 1 || super.anInt198 == 1) {
					this.anInt408++;
				}
				if (this.anInt284 == 2) {
					this.method196(this.anInt378);
				}
				if (this.anInt284 == 2 && this.aBoolean59) {
					this.method118();
				}
				for (local872 = 0; local872 < 5; local872++) {
					@Pc(982) int local982 = this.anIntArray59[local872]++;
				}
				this.method140();
				super.anInt191++;
				if (super.anInt191 > 4500) {
					this.anInt416 = 250;
					super.anInt191 -= 500;
					this.aClass1_Sub1_Sub3_2.method469(194);
				}
				this.anInt274++;
				if (this.anInt274 > 500) {
					this.anInt274 = 0;
					local874 = (int) (Math.random() * 8.0D);
					if ((local874 & 0x1) == 1) {
						this.anInt245 += this.anInt246;
					}
					if ((local874 & 0x2) == 2) {
						this.anInt417 += this.anInt418;
					}
					if ((local874 & 0x4) == 4) {
						this.anInt218 += this.anInt219;
					}
				}
				if (this.anInt245 < -50) {
					this.anInt246 = 2;
				}
				if (this.anInt245 > 50) {
					this.anInt246 = -2;
				}
				if (this.anInt417 < -55) {
					this.anInt418 = 2;
				}
				if (this.anInt417 > 55) {
					this.anInt418 = -2;
				}
				if (this.anInt218 < -40) {
					this.anInt219 = 1;
				}
				if (this.anInt218 > 40) {
					this.anInt219 = -1;
				}
				this.anInt226++;
				if (this.anInt226 > 500) {
					this.anInt226 = 0;
					local874 = (int) (Math.random() * 8.0D);
					if ((local874 & 0x1) == 1) {
						this.anInt265 += this.anInt266;
					}
					if ((local874 & 0x2) == 2) {
						this.anInt396 += this.anInt397;
					}
				}
				if (this.anInt265 < -60) {
					this.anInt266 = 2;
				}
				if (this.anInt265 > 60) {
					this.anInt266 = -2;
				}
				if (this.anInt396 < -20) {
					this.anInt397 = 1;
				}
				if (this.anInt396 > 10) {
					this.anInt397 = -1;
				}
				this.anInt415++;
				@Pc(1193) boolean local1193 = false;
				if (this.anInt415 > 50) {
					this.aClass1_Sub1_Sub3_2.method469(62);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_2.anInt757 > 0) {
						this.aClass8_1.method251(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt757);
						this.aClass1_Sub1_Sub3_2.anInt757 = 0;
						this.anInt415 = 0;
					}
				} catch (@Pc(1236) IOException local1236) {
					this.method114(this.anInt259);
				} catch (@Pc(1242) Exception local1242) {
					this.method136();
				}
			}
		} catch (@Pc(1247) RuntimeException local1247) {
			signlink.reporterror("22737, " + arg0 + ", " + local1247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!gc;IIII)V")
	private void method110(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt395 < 400) {
				if (arg0.anIntArray174 != null) {
					arg0 = arg0.method327(this.aByte17);
				}
				if (arg0 != null) {
					@Pc(20) String local20 = arg0.aString24;
					if (arg0.anInt575 != 0) {
						local20 = local20 + method201(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128, arg0.anInt575) + " (level-" + arg0.anInt575 + ")";
					}
					if (this.anInt329 == 1) {
						this.aStringArray6[this.anInt395] = "Use " + this.aString11 + " with @yel@" + local20;
						this.anIntArray52[this.anInt395] = 829;
						this.anIntArray53[this.anInt395] = arg2;
						this.anIntArray50[this.anInt395] = arg3;
						this.anIntArray51[this.anInt395] = arg1;
						this.anInt395++;
					} else if (this.anInt358 != 1) {
						@Pc(161) int local161;
						if (arg0.aStringArray9 != null) {
							for (local161 = 4; local161 >= 0; local161--) {
								if (arg0.aStringArray9[local161] != null && !arg0.aStringArray9[local161].equalsIgnoreCase("attack")) {
									this.aStringArray6[this.anInt395] = arg0.aStringArray9[local161] + " @yel@" + local20;
									if (local161 == 0) {
										this.anIntArray52[this.anInt395] = 242;
									}
									if (local161 == 1) {
										this.anIntArray52[this.anInt395] = 209;
									}
									if (local161 == 2) {
										this.anIntArray52[this.anInt395] = 309;
									}
									if (local161 == 3) {
										this.anIntArray52[this.anInt395] = 852;
									}
									if (local161 == 4) {
										this.anIntArray52[this.anInt395] = 793;
									}
									this.anIntArray53[this.anInt395] = arg2;
									this.anIntArray50[this.anInt395] = arg3;
									this.anIntArray51[this.anInt395] = arg1;
									this.anInt395++;
								}
							}
						}
						if (arg0.aStringArray9 != null) {
							for (local161 = 4; local161 >= 0; local161--) {
								if (arg0.aStringArray9[local161] != null && arg0.aStringArray9[local161].equalsIgnoreCase("attack")) {
									@Pc(285) short local285 = 0;
									if (arg0.anInt575 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128) {
										local285 = 2000;
									}
									this.aStringArray6[this.anInt395] = arg0.aStringArray9[local161] + " @yel@" + local20;
									if (local161 == 0) {
										this.anIntArray52[this.anInt395] = local285 + 242;
									}
									if (local161 == 1) {
										this.anIntArray52[this.anInt395] = local285 + 209;
									}
									if (local161 == 2) {
										this.anIntArray52[this.anInt395] = local285 + 309;
									}
									if (local161 == 3) {
										this.anIntArray52[this.anInt395] = local285 + 852;
									}
									if (local161 == 4) {
										this.anIntArray52[this.anInt395] = local285 + 793;
									}
									this.anIntArray53[this.anInt395] = arg2;
									this.anIntArray50[this.anInt395] = arg3;
									this.anIntArray51[this.anInt395] = arg1;
									this.anInt395++;
								}
							}
						}
						this.aStringArray6[this.anInt395] = "Examine @yel@" + local20;
						this.anIntArray52[this.anInt395] = 1714;
						this.anIntArray53[this.anInt395] = arg2;
						this.anIntArray50[this.anInt395] = arg3;
						this.anIntArray51[this.anInt395] = arg1;
						this.anInt395++;
					} else if ((this.anInt360 & 0x2) == 2) {
						this.aStringArray6[this.anInt395] = this.aString15 + " @yel@" + local20;
						this.anIntArray52[this.anInt395] = 240;
						this.anIntArray53[this.anInt395] = arg2;
						this.anIntArray50[this.anInt395] = arg3;
						this.anIntArray51[this.anInt395] = arg1;
						this.anInt395++;
						return;
					}
				}
			}
		} catch (@Pc(435) RuntimeException local435) {
			signlink.reporterror("77897, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 924 + ", " + arg3 + ", " + local435.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method111(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) int local10;
			for (@Pc(3) int local3 = 0; local3 < this.anInt239; local3++) {
				local10 = this.anIntArray37[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub2 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local10];
				@Pc(18) int local18 = arg0.method480();
				@Pc(26) int local26;
				@Pc(29) int local29;
				if ((local18 & 0x1) == 1) {
					local26 = arg0.method480();
					local29 = arg0.method480();
					local15.method681(local26, local29, anInt283);
					local15.anInt1015 = anInt283 + 300;
					local15.anInt1016 = arg0.method480();
					local15.anInt1017 = arg0.method480();
				}
				if ((local18 & 0x2) == 2) {
					local26 = arg0.method482();
					if (local26 == 65535) {
						local26 = -1;
					}
					if (local26 == local15.anInt1024) {
						local15.anInt1028 = 0;
					}
					local29 = arg0.method480();
					if (local26 == local15.anInt1024 && local26 != -1) {
						@Pc(83) int local83 = Class27.aClass27Array1[local26].anInt816;
						if (local83 == 1) {
							local15.anInt1025 = 0;
							local15.anInt1026 = 0;
							local15.anInt1027 = local29;
							local15.anInt1028 = 0;
						}
						if (local83 == 2) {
							local15.anInt1028 = 0;
						}
					} else if (local26 == -1 || local15.anInt1024 == -1 || Class27.aClass27Array1[local26].anInt810 >= Class27.aClass27Array1[local15.anInt1024].anInt810) {
						local15.anInt1024 = local26;
						local15.anInt1025 = 0;
						local15.anInt1026 = 0;
						local15.anInt1027 = local29;
						local15.anInt1028 = 0;
						local15.anInt1047 = local15.anInt1045;
					}
				}
				if ((local18 & 0x4) == 4) {
					local15.anInt1018 = arg0.method482();
					if (local15.anInt1018 == 65535) {
						local15.anInt1018 = -1;
					}
				}
				if ((local18 & 0x8) == 8) {
					local15.aString31 = arg0.method487();
					local15.anInt1012 = 100;
				}
				if ((local18 & 0x10) == 16) {
					local26 = arg0.method480();
					local29 = arg0.method480();
					local15.method681(local26, local29, anInt283);
					local15.anInt1015 = anInt283 + 300;
					local15.anInt1016 = arg0.method480();
					local15.anInt1017 = arg0.method480();
				}
				if ((local18 & 0x20) == 32) {
					local15.aClass13_2 = Class13.method323(arg0.method482());
					local15.anInt1004 = local15.aClass13_2.aByte33;
					local15.anInt1044 = local15.aClass13_2.anInt581;
					local15.anInt1007 = local15.aClass13_2.anInt568;
					local15.anInt1008 = local15.aClass13_2.anInt569;
					local15.anInt1009 = local15.aClass13_2.anInt570;
					local15.anInt1010 = local15.aClass13_2.anInt571;
					local15.anInt1005 = local15.aClass13_2.anInt567;
				}
				if ((local18 & 0x40) == 64) {
					local15.anInt1029 = arg0.method482();
					local26 = arg0.method485();
					local15.anInt1033 = local26 >> 16;
					local15.anInt1032 = anInt283 + (local26 & 0xFFFF);
					local15.anInt1030 = 0;
					local15.anInt1031 = 0;
					if (local15.anInt1032 > anInt283) {
						local15.anInt1030 = -1;
					}
					if (local15.anInt1029 == 65535) {
						local15.anInt1029 = -1;
					}
				}
				if ((local18 & 0x80) == 128) {
					local15.anInt1019 = arg0.method482();
					local15.anInt1020 = arg0.method482();
				}
			}
			if (this.anInt349 != 4) {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
		} catch (@Pc(320) RuntimeException local320) {
			signlink.reporterror("15164, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local320.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method112() {
		try {
			if (this.anInt329 == 0 && this.anInt358 == 0) {
				this.aStringArray6[this.anInt395] = "Walk here";
				this.anIntArray52[this.anInt395] = 718;
				this.anIntArray50[this.anInt395] = super.anInt193;
				this.anIntArray51[this.anInt395] = super.anInt194;
				this.anInt395++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub5.anInt511; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub5.anIntArray150[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass37_1.method560(this.anInt320, local53, local59, local49) >= 0) {
						@Pc(91) Class9 local91 = Class9.method288(local71);
						if (local91.anIntArray160 != null) {
							local91 = local91.method296();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt329 == 1) {
							this.aStringArray6[this.anInt395] = "Use " + this.aString11 + " with @cya@" + local91.aString23;
							this.anIntArray52[this.anInt395] = 810;
							this.anIntArray53[this.anInt395] = local49;
							this.anIntArray50[this.anInt395] = local53;
							this.anIntArray51[this.anInt395] = local59;
							this.anInt395++;
						} else if (this.anInt358 != 1) {
							if (local91.aStringArray8 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray8[local218] != null) {
										this.aStringArray6[this.anInt395] = local91.aStringArray8[local218] + " @cya@" + local91.aString23;
										if (local218 == 0) {
											this.anIntArray52[this.anInt395] = 625;
										}
										if (local218 == 1) {
											this.anIntArray52[this.anInt395] = 721;
										}
										if (local218 == 2) {
											this.anIntArray52[this.anInt395] = 743;
										}
										if (local218 == 3) {
											this.anIntArray52[this.anInt395] = 357;
										}
										if (local218 == 4) {
											this.anIntArray52[this.anInt395] = 1071;
										}
										this.anIntArray53[this.anInt395] = local49;
										this.anIntArray50[this.anInt395] = local53;
										this.anIntArray51[this.anInt395] = local59;
										this.anInt395++;
									}
								}
							}
							this.aStringArray6[this.anInt395] = "Examine @cya@" + local91.aString23;
							this.anIntArray52[this.anInt395] = 1381;
							this.anIntArray53[this.anInt395] = local91.anInt515 << 14;
							this.anIntArray50[this.anInt395] = local53;
							this.anIntArray51[this.anInt395] = local59;
							this.anInt395++;
						} else if ((this.anInt360 & 0x4) == 4) {
							this.aStringArray6[this.anInt395] = this.aString15 + " @cya@" + local91.aString23;
							this.anIntArray52[this.anInt395] = 899;
							this.anIntArray53[this.anInt395] = local49;
							this.anIntArray50[this.anInt395] = local53;
							this.anIntArray51[this.anInt395] = local59;
							this.anInt395++;
						}
					}
					@Pc(398) Class1_Sub1_Sub1_Sub1_Sub2 local398;
					@Pc(446) Class1_Sub1_Sub1_Sub1_Sub1 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class1_Sub1_Sub1_Sub1_Sub2 local369 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if (local369.aClass13_2.aByte33 == 1 && (local369.anInt1001 & 0x7F) == 64 && (local369.anInt1002 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt377; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray80[local218]];
								if (local398 != null && local398 != local369 && local398.aClass13_2.aByte33 == 1 && local398.anInt1001 == local369.anInt1001 && local398.anInt1002 == local369.anInt1002) {
									this.method110(local398.aClass13_2, local59, this.anIntArray80[local218], local53);
								}
							}
							for (local436 = 0; local436 < this.anInt238; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray36[local436]];
								if (local446 != null && local446.anInt1001 == local369.anInt1001 && local446.anInt1002 == local369.anInt1002) {
									this.method137(local59, local53, this.anIntArray36[local436], local446);
								}
							}
						}
						this.method110(local369.aClass13_2, local59, local71, local53);
					}
					if (local65 == 0) {
						@Pc(488) Class1_Sub1_Sub1_Sub1_Sub1 local488 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if ((local488.anInt1001 & 0x7F) == 64 && (local488.anInt1002 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt377; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray80[local218]];
								if (local398 != null && local398.aClass13_2.aByte33 == 1 && local398.anInt1001 == local488.anInt1001 && local398.anInt1002 == local488.anInt1002) {
									this.method110(local398.aClass13_2, local59, this.anIntArray80[local218], local53);
								}
							}
							for (local436 = 0; local436 < this.anInt238; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray36[local436]];
								if (local446 != null && local446 != local488 && local446.anInt1001 == local488.anInt1001 && local446.anInt1002 == local488.anInt1002) {
									this.method137(local59, local53, this.anIntArray36[local436], local446);
								}
							}
						}
						this.method137(local59, local53, local71, local488);
					}
					if (local65 == 3) {
						@Pc(607) Class29 local607 = this.aClass29ArrayArrayArray1[this.anInt320][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class1_Sub1_Sub1_Sub3 local614 = (Class1_Sub1_Sub1_Sub3) local607.method512(); local614 != null; local614 = (Class1_Sub1_Sub1_Sub3) local607.method514()) {
								@Pc(620) Class15 local620 = Class15.method361(local614.anInt177);
								if (this.anInt329 == 1) {
									this.aStringArray6[this.anInt395] = "Use " + this.aString11 + " with @lre@" + local620.aString25;
									this.anIntArray52[this.anInt395] = 111;
									this.anIntArray53[this.anInt395] = local614.anInt177;
									this.anIntArray50[this.anInt395] = local53;
									this.anIntArray51[this.anInt395] = local59;
									this.anInt395++;
								} else if (this.anInt358 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray10 != null && local620.aStringArray10[local737] != null) {
											this.aStringArray6[this.anInt395] = local620.aStringArray10[local737] + " @lre@" + local620.aString25;
											if (local737 == 0) {
												this.anIntArray52[this.anInt395] = 139;
											}
											if (local737 == 1) {
												this.anIntArray52[this.anInt395] = 778;
											}
											if (local737 == 2) {
												this.anIntArray52[this.anInt395] = 617;
											}
											if (local737 == 3) {
												this.anIntArray52[this.anInt395] = 224;
											}
											if (local737 == 4) {
												this.anIntArray52[this.anInt395] = 662;
											}
											this.anIntArray53[this.anInt395] = local614.anInt177;
											this.anIntArray50[this.anInt395] = local53;
											this.anIntArray51[this.anInt395] = local59;
											this.anInt395++;
										} else if (local737 == 2) {
											this.aStringArray6[this.anInt395] = "Take @lre@" + local620.aString25;
											this.anIntArray52[this.anInt395] = 617;
											this.anIntArray53[this.anInt395] = local614.anInt177;
											this.anIntArray50[this.anInt395] = local53;
											this.anIntArray51[this.anInt395] = local59;
											this.anInt395++;
										}
									}
									this.aStringArray6[this.anInt395] = "Examine @lre@" + local620.aString25;
									this.anIntArray52[this.anInt395] = 1152;
									this.anIntArray53[this.anInt395] = local614.anInt177;
									this.anIntArray50[this.anInt395] = local53;
									this.anIntArray51[this.anInt395] = local59;
									this.anInt395++;
								} else if ((this.anInt360 & 0x1) == 1) {
									this.aStringArray6[this.anInt395] = this.aString15 + " @lre@" + local620.aString25;
									this.anIntArray52[this.anInt395] = 370;
									this.anIntArray53[this.anInt395] = local614.anInt177;
									this.anIntArray50[this.anInt395] = local53;
									this.anIntArray51[this.anInt395] = local59;
									this.anInt395++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(949) RuntimeException local949) {
			signlink.reporterror("37729, " + false + ", " + local949.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_6.method418(arg1, arg0);
			this.aClass1_Sub1_Sub2_Sub3_7.method418(arg1 + arg4 - 16, arg0);
			Class1_Sub1_Sub2.method439(arg0, 16, this.anInt375, arg1 + 16, arg4 - 32);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg3;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg2 / (arg3 - arg4);
			Class1_Sub1_Sub2.method439(arg0, 16, this.anInt348, arg1 + local52 + 16, local35);
			Class1_Sub1_Sub2.method444(local35, this.anInt411, arg1 + local52 + 16, arg0);
			Class1_Sub1_Sub2.method444(local35, this.anInt411, arg1 + local52 + 16, arg0 + 1);
			Class1_Sub1_Sub2.method442(arg1 + local52 + 16, 16, arg0, this.anInt411);
			Class1_Sub1_Sub2.method442(arg1 + local52 + 17, 16, arg0, this.anInt411);
			Class1_Sub1_Sub2.method444(local35, this.anInt307, arg1 + local52 + 16, arg0 + 15);
			Class1_Sub1_Sub2.method444(local35 - 1, this.anInt307, arg1 + local52 + 17, arg0 + 14);
			Class1_Sub1_Sub2.method442(arg1 + local52 + local35 + 15, 16, arg0, this.anInt307);
			Class1_Sub1_Sub2.method442(arg1 + local52 + local35 + 14, 15, arg0 + 1, this.anInt307);
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("23142, " + -18981 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method114(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt416 > 0) {
				this.method136();
			} else {
				this.aClass35_26.method524(this.anInt253);
				this.aClass1_Sub1_Sub2_Sub4_2.method447(0, 144, 257, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method447(16777215, 143, 256, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method447(0, 159, 257, "Please wait - attempting to reestablish");
				this.aClass1_Sub1_Sub2_Sub4_2.method447(16777215, 158, 256, "Please wait - attempting to reestablish");
				this.aClass35_26.method525(4, 4, super.aGraphics2);
				this.anInt340 = 0;
				this.anInt420 = 0;
				@Pc(62) Class8 local62 = this.aClass8_1;
				this.aBoolean82 = false;
				while (arg0 >= 0) {
					for (@Pc(69) int local69 = 1; local69 > 0; local69++) {
					}
				}
				this.anInt328 = 0;
				this.method189(this.aString6, this.aString7, true);
				if (!this.aBoolean82) {
					this.method136();
				}
				try {
					local62.method247();
				} catch (@Pc(96) Exception local96) {
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("90039, " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IIII)V")
	private void method115(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0.anInt434 == 0 && arg0.anIntArray98 != null && (!arg0.aBoolean92 || this.anInt286 == arg0.anInt432 || this.anInt244 == arg0.anInt432 || this.anInt308 == arg0.anInt432)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt716;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt714;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt717;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt715;
				Class1_Sub1_Sub2.method436(arg1, arg3 + arg0.anInt438, arg1 + arg0.anInt437, arg3);
				@Pc(51) int local51 = arg0.anIntArray98.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg0.anIntArray99[local53] + arg1;
					@Pc(71) int local71 = arg0.anIntArray100[local53] + arg3 - arg2;
					@Pc(78) Class6 local78 = Class6.aClass6Array1[arg0.anIntArray98[local53]];
					@Pc(83) int local83 = local62 + local78.anInt439;
					@Pc(88) int local88 = local71 + local78.anInt440;
					if (local78.anInt436 > 0) {
						this.method227(this.anInt227, local78);
					}
					if (local78.anInt434 == 0) {
						if (local78.anInt443 > local78.anInt442 - local78.anInt438) {
							local78.anInt443 = local78.anInt442 - local78.anInt438;
						}
						if (local78.anInt443 < 0) {
							local78.anInt443 = 0;
						}
						this.method115(local78, local83, local78.anInt443, local88);
						if (local78.anInt442 > local78.anInt438) {
							this.method113(local83 + local78.anInt437, local88, local78.anInt443, local78.anInt442, local78.anInt438);
						}
					} else if (local78.anInt434 != 1) {
						@Pc(161) int local161;
						@Pc(165) int local165;
						@Pc(176) int local176;
						@Pc(211) int local211;
						@Pc(218) int local218;
						@Pc(159) int local159;
						@Pc(209) int local209;
						if (local78.anInt434 == 2) {
							local159 = 0;
							for (local161 = 0; local161 < local78.anInt438; local161++) {
								for (local165 = 0; local165 < local78.anInt437; local165++) {
									local176 = local83 + local165 * (local78.anInt445 + 32);
									@Pc(185) int local185 = local88 + local161 * (local78.anInt446 + 32);
									if (local159 < 20) {
										local176 += local78.anIntArray101[local159];
										local185 += local78.anIntArray102[local159];
									}
									if (local78.anIntArray94[local159] > 0) {
										local209 = 0;
										local211 = 0;
										local218 = local78.anIntArray94[local159] - 1;
										if (local176 > Class1_Sub1_Sub2.anInt716 - 32 && local176 < Class1_Sub1_Sub2.anInt717 && local185 > Class1_Sub1_Sub2.anInt714 - 32 && local185 < Class1_Sub1_Sub2.anInt715 || this.anInt403 != 0 && this.anInt402 == local159) {
											@Pc(243) int local243 = 0;
											if (this.anInt329 == 1 && this.anInt330 == local159 && this.anInt331 == local78.anInt432) {
												local243 = 16777215;
											}
											@Pc(267) Class1_Sub1_Sub2_Sub2 local267 = Class15.method367(local218, local78.anIntArray95[local159], local243);
											if (local267 != null) {
												@Pc(346) int local346;
												if (this.anInt403 != 0 && this.anInt402 == local159 && this.anInt401 == local78.anInt432) {
													local209 = super.anInt193 - this.anInt404;
													local211 = super.anInt194 - this.anInt405;
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (local211 < 5 && local211 > -5) {
														local211 = 0;
													}
													if (this.anInt363 < 5) {
														local209 = 0;
														local211 = 0;
													}
													local267.method393(local176 + local209, local185 + local211);
													if (local185 + local211 < Class1_Sub1_Sub2.anInt714 && arg0.anInt443 > 0) {
														local346 = this.anInt215 * (Class1_Sub1_Sub2.anInt714 - local185 - local211) / 3;
														if (local346 > this.anInt215 * 10) {
															local346 = this.anInt215 * 10;
														}
														if (local346 > arg0.anInt443) {
															local346 = arg0.anInt443;
														}
														arg0.anInt443 -= local346;
														this.anInt405 += local346;
													}
													if (local185 + local211 + 32 > Class1_Sub1_Sub2.anInt715 && arg0.anInt443 < arg0.anInt442 - arg0.anInt438) {
														local346 = this.anInt215 * (local185 + local211 + 32 - Class1_Sub1_Sub2.anInt715) / 3;
														if (local346 > this.anInt215 * 10) {
															local346 = this.anInt215 * 10;
														}
														if (local346 > arg0.anInt442 - arg0.anInt438 - arg0.anInt443) {
															local346 = arg0.anInt442 - arg0.anInt438 - arg0.anInt443;
														}
														arg0.anInt443 += local346;
														this.anInt405 -= local346;
													}
												} else if (this.anInt426 != 0 && this.anInt425 == local159 && this.anInt424 == local78.anInt432) {
													local267.method393(local176, local185);
												} else {
													local267.method391(local185, local176);
												}
												if (local267.anInt667 == 33 || local78.anIntArray95[local159] != 1) {
													local346 = local78.anIntArray95[local159];
													this.aClass1_Sub1_Sub2_Sub4_1.method451(local176 + local209 + 1, method145((byte) 4, local346), 0, local185 + local211 + 10);
													this.aClass1_Sub1_Sub2_Sub4_1.method451(local176 + local209, method145((byte) 4, local346), 16776960, local185 + local211 + 9);
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub2_Sub2Array8 != null && local159 < 20) {
										@Pc(535) Class1_Sub1_Sub2_Sub2 local535 = local78.aClass1_Sub1_Sub2_Sub2Array8[local159];
										if (local535 != null) {
											local535.method391(local185, local176);
										}
									}
									local159++;
								}
							}
						} else if (local78.anInt434 == 3) {
							@Pc(561) boolean local561 = false;
							if (this.anInt308 == local78.anInt432 || this.anInt244 == local78.anInt432 || this.anInt286 == local78.anInt432) {
								local561 = true;
							}
							if (this.method187(local78, this.aByte21)) {
								local159 = local78.anInt448;
								if (local561 && local78.anInt450 != 0) {
									local159 = local78.anInt450;
								}
							} else {
								local159 = local78.anInt447;
								if (local561 && local78.anInt449 != 0) {
									local159 = local78.anInt449;
								}
							}
							if (local78.aByte23 == 0) {
								if (local78.aBoolean98) {
									Class1_Sub1_Sub2.method439(local83, local78.anInt437, local159, local88, local78.anInt438);
								} else {
									Class1_Sub1_Sub2.method440(local159, local83, local88, local78.anInt437, local78.anInt438);
								}
							} else if (local78.aBoolean98) {
								Class1_Sub1_Sub2.method438(local78.anInt438, local88, local78.anInt437, local83, this.aBoolean43, 256 - (local78.aByte23 & 0xFF), local159);
							} else {
								Class1_Sub1_Sub2.method441(256 - (local78.aByte23 & 0xFF), local78.anInt437, local88, local83, local159, local78.anInt438);
							}
						} else {
							@Pc(681) Class1_Sub1_Sub2_Sub4 local681;
							if (local78.anInt434 == 4) {
								local681 = local78.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(684) String local684 = local78.aString18;
								@Pc(686) boolean local686 = false;
								if (this.anInt308 == local78.anInt432 || this.anInt244 == local78.anInt432 || this.anInt286 == local78.anInt432) {
									local686 = true;
								}
								if (this.method187(local78, this.aByte21)) {
									local161 = local78.anInt448;
									if (local686 && local78.anInt450 != 0) {
										local161 = local78.anInt450;
									}
									if (local78.aString19.length() > 0) {
										local684 = local78.aString19;
									}
								} else {
									local161 = local78.anInt447;
									if (local686 && local78.anInt449 != 0) {
										local161 = local78.anInt449;
									}
								}
								if (local78.anInt435 == 6 && this.aBoolean62) {
									local684 = "Please wait...";
									local161 = local78.anInt447;
								}
								if (Class1_Sub1_Sub2.anInt712 == 479) {
									if (local161 == 16776960) {
										local161 = 255;
									}
									if (local161 == 49152) {
										local161 = 16777215;
									}
								}
								local209 = local88 + local681.anInt724;
								while (local684.length() > 0) {
									if (local684.indexOf("%") != -1) {
										label348: while (true) {
											local211 = local684.indexOf("%1");
											if (local211 == -1) {
												while (true) {
													local211 = local684.indexOf("%2");
													if (local211 == -1) {
														while (true) {
															local211 = local684.indexOf("%3");
															if (local211 == -1) {
																while (true) {
																	local211 = local684.indexOf("%4");
																	if (local211 == -1) {
																		while (true) {
																			local211 = local684.indexOf("%5");
																			if (local211 == -1) {
																				break label348;
																			}
																			local684 = local684.substring(0, local211) + this.method188(this.method116(4, local78)) + local684.substring(local211 + 2);
																		}
																	}
																	local684 = local684.substring(0, local211) + this.method188(this.method116(3, local78)) + local684.substring(local211 + 2);
																}
															}
															local684 = local684.substring(0, local211) + this.method188(this.method116(2, local78)) + local684.substring(local211 + 2);
														}
													}
													local684 = local684.substring(0, local211) + this.method188(this.method116(1, local78)) + local684.substring(local211 + 2);
												}
											}
											local684 = local684.substring(0, local211) + this.method188(this.method116(0, local78)) + local684.substring(local211 + 2);
										}
									}
									local211 = local684.indexOf("\\n");
									@Pc(959) String local959;
									if (local211 == -1) {
										local959 = local684;
										local684 = "";
									} else {
										local959 = local684.substring(0, local211);
										local684 = local684.substring(local211 + 2);
									}
									if (local78.aBoolean99) {
										local681.method448(local209, local161, local78.aBoolean100, local83 + local78.anInt437 / 2, this.aBoolean80, local959);
									} else {
										local681.method455(local959, local83, local78.aBoolean100, 654, local209, local161);
									}
									local209 += local681.anInt724;
								}
							} else if (local78.anInt434 == 5) {
								@Pc(1023) Class1_Sub1_Sub2_Sub2 local1023;
								if (this.method187(local78, this.aByte21)) {
									local1023 = local78.aClass1_Sub1_Sub2_Sub2_16;
								} else {
									local1023 = local78.aClass1_Sub1_Sub2_Sub2_15;
								}
								if (local1023 != null) {
									local1023.method391(local88, local83);
								}
							} else if (local78.anInt434 == 6) {
								local159 = Class1_Sub1_Sub2_Sub1.anInt606;
								local161 = Class1_Sub1_Sub2_Sub1.anInt607;
								Class1_Sub1_Sub2_Sub1.anInt606 = local83 + local78.anInt437 / 2;
								Class1_Sub1_Sub2_Sub1.anInt607 = local88 + local78.anInt438 / 2;
								local165 = Class1_Sub1_Sub2_Sub1.anIntArray178[local78.anInt458] * local78.anInt457 >> 16;
								local176 = Class1_Sub1_Sub2_Sub1.anIntArray179[local78.anInt458] * local78.anInt457 >> 16;
								@Pc(1085) boolean local1085 = this.method187(local78, this.aByte21);
								if (local1085) {
									local209 = local78.anInt456;
								} else {
									local209 = local78.anInt455;
								}
								@Pc(1105) Class1_Sub1_Sub1_Sub5 local1105;
								if (local209 == -1) {
									local1105 = local78.method233(-1, local1085, -1);
								} else {
									@Pc(1111) Class27 local1111 = Class27.aClass27Array1[local209];
									local1105 = local78.method233(local1111.anIntArray226[local78.anInt430], local1085, local1111.anIntArray225[local78.anInt430]);
								}
								if (local1105 != null) {
									local1105.method281(local78.anInt459, 0, local78.anInt458, 0, local165, local176);
								}
								Class1_Sub1_Sub2_Sub1.anInt606 = local159;
								Class1_Sub1_Sub2_Sub1.anInt607 = local161;
							} else if (local78.anInt434 == 7) {
								local681 = local78.aClass1_Sub1_Sub2_Sub4_5;
								local161 = 0;
								for (local165 = 0; local165 < local78.anInt438; local165++) {
									for (local176 = 0; local176 < local78.anInt437; local176++) {
										if (local78.anIntArray94[local161] > 0) {
											@Pc(1175) Class15 local1175 = Class15.method361(local78.anIntArray94[local161] - 1);
											@Pc(1178) String local1178 = local1175.aString25;
											if (local1175.aBoolean156 || local78.anIntArray95[local161] != 1) {
												local1178 = local1178 + " x" + method146(local78.anIntArray95[local161]);
											}
											local211 = local83 + local176 * (local78.anInt445 + 115);
											local218 = local88 + local165 * (local78.anInt446 + 12);
											if (local78.aBoolean99) {
												local681.method448(local218, local78.anInt447, local78.aBoolean100, local211 + local78.anInt437 / 2, this.aBoolean80, local1178);
											} else {
												local681.method455(local1178, local211, local78.aBoolean100, 654, local218, local78.anInt447);
											}
										}
										local161++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method436(local29, local35, local33, local31);
			}
		} catch (@Pc(1281) RuntimeException local1281) {
			signlink.reporterror("83633, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -23258 + ", " + local1281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!d;)I")
	private int method116(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		try {
			if (arg1.anIntArrayArray7 == null || arg0 >= arg1.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg1.anIntArrayArray7[arg0];
				@Pc(24) int local24 = 0;
				@Pc(26) int local26 = 0;
				@Pc(28) byte local28 = 0;
				while (true) {
					@Pc(33) int local33 = local22[local26++];
					@Pc(35) int local35 = 0;
					@Pc(37) byte local37 = 0;
					if (local33 == 0) {
						return local24;
					}
					if (local33 == 1) {
						local35 = this.anIntArray62[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray84[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray78[local22[local26++]];
					}
					@Pc(84) Class6 local84;
					@Pc(89) int local89;
					@Pc(102) int local102;
					if (local33 == 4) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++];
						if (local89 >= 0 && local89 < Class15.anInt612 && (!Class15.method361(local89).aBoolean157 || aBoolean51)) {
							for (local102 = 0; local102 < local84.anIntArray94.length; local102++) {
								if (local84.anIntArray94[local102] == local89 + 1) {
									local35 += local84.anIntArray95[local102];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray32[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray56[this.anIntArray84[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray32[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128;
					}
					@Pc(177) int local177;
					if (local33 == 9) {
						for (local177 = 0; local177 < Class30.anInt825; local177++) {
							if (Class30.aBooleanArray9[local177]) {
								local35 += this.anIntArray84[local177];
							}
						}
					}
					if (local33 == 10) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++] + 1;
						if (local89 >= 0 && local89 < Class15.anInt612 && (!Class15.method361(local89).aBoolean157 || aBoolean51)) {
							for (local102 = 0; local102 < local84.anIntArray94.length; local102++) {
								if (local84.anIntArray94[local102] == local89) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt333;
					}
					if (local33 == 12) {
						local35 = this.anInt268;
					}
					if (local33 == 13) {
						local177 = this.anIntArray32[local22[local26++]];
						local89 = local22[local26++];
						local35 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local177 = local22[local26++];
						@Pc(292) Class36 local292 = Class36.aClass36Array1[local177];
						local102 = local292.anInt858;
						@Pc(298) int local298 = local292.anInt859;
						@Pc(301) int local301 = local292.anInt860;
						@Pc(307) int local307 = anIntArray48[local301 - local298];
						local35 = this.anIntArray32[local102] >> local298 & local307;
					}
					if (local33 == 15) {
						local37 = 1;
					}
					if (local33 == 16) {
						local37 = 2;
					}
					if (local33 == 17) {
						local37 = 3;
					}
					if (local33 == 18) {
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 >> 7) + this.anInt353;
					}
					if (local33 == 19) {
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 >> 7) + this.anInt354;
					}
					if (local33 == 20) {
						local35 = local22[local26++];
					}
					if (local37 == 0) {
						if (local28 == 0) {
							local24 += local35;
						}
						if (local28 == 1) {
							local24 -= local35;
						}
						if (local28 == 2 && local35 != 0) {
							local24 /= local35;
						}
						if (local28 == 3) {
							local24 *= local35;
						}
						local28 = 0;
					} else {
						local28 = local37;
					}
				}
			} catch (@Pc(400) Exception local400) {
				return -1;
			}
		} catch (@Pc(403) RuntimeException local403) {
			signlink.reporterror("83707, " + arg0 + ", " + true + ", " + arg1 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method117(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt238; local3++) {
				if (local3 == -1) {
					local11 = this.anInt237;
				} else {
					local11 = this.anIntArray36[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt1012 > 0) {
					local23.anInt1012--;
					if (local23.anInt1012 == 0) {
						local23.aString31 = null;
					}
				}
			}
			@Pc(49) boolean local49 = false;
			for (local11 = 0; local11 < this.anInt377; local11++) {
				@Pc(58) int local58 = this.anIntArray80[local11];
				@Pc(63) Class1_Sub1_Sub1_Sub1_Sub2 local63 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local58];
				if (local63 != null && local63.anInt1012 > 0) {
					local63.anInt1012--;
					if (local63.anInt1012 == 0) {
						local63.aString31 = null;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("79479, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method118() {
		try {
			@Pc(6) int local6 = this.anInt299 * 128 + 64;
			@Pc(13) int local13 = this.anInt300 * 128 + 64;
			@Pc(24) int local24 = this.method181(local13, local6, this.anInt320) - this.anInt301;
			if (this.anInt292 < local6) {
				this.anInt292 += this.anInt302 + (local6 - this.anInt292) * this.anInt303 / 1000;
				if (this.anInt292 > local6) {
					this.anInt292 = local6;
				}
			}
			if (this.anInt292 > local6) {
				this.anInt292 -= this.anInt302 + (this.anInt292 - local6) * this.anInt303 / 1000;
				if (this.anInt292 < local6) {
					this.anInt292 = local6;
				}
			}
			if (this.anInt293 < local24) {
				this.anInt293 += this.anInt302 + (local24 - this.anInt293) * this.anInt303 / 1000;
				if (this.anInt293 > local24) {
					this.anInt293 = local24;
				}
			}
			if (this.anInt293 > local24) {
				this.anInt293 -= this.anInt302 + (this.anInt293 - local24) * this.anInt303 / 1000;
				if (this.anInt293 < local24) {
					this.anInt293 = local24;
				}
			}
			if (this.anInt294 < local13) {
				this.anInt294 += this.anInt302 + (local13 - this.anInt294) * this.anInt303 / 1000;
				if (this.anInt294 > local13) {
					this.anInt294 = local13;
				}
			}
			if (this.anInt294 > local13) {
				this.anInt294 -= this.anInt302 + (this.anInt294 - local13) * this.anInt303 / 1000;
				if (this.anInt294 < local13) {
					this.anInt294 = local13;
				}
			}
			local6 = this.anInt206 * 128 + 64;
			local13 = this.anInt207 * 128 + 64;
			local24 = this.method181(local13, local6, this.anInt320) - this.anInt208;
			@Pc(228) int local228 = local6 - this.anInt292;
			@Pc(233) int local233 = local24 - this.anInt293;
			@Pc(238) int local238 = local13 - this.anInt294;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt295 < local260) {
				this.anInt295 += this.anInt209 + (local260 - this.anInt295) * this.anInt210 / 1000;
				if (this.anInt295 > local260) {
					this.anInt295 = local260;
				}
			}
			if (this.anInt295 > local260) {
				this.anInt295 -= this.anInt209 + (this.anInt295 - local260) * this.anInt210 / 1000;
				if (this.anInt295 < local260) {
					this.anInt295 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt296;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt296 += this.anInt209 + local342 * this.anInt210 / 1000;
				this.anInt296 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt296 -= this.anInt209 + -local342 * this.anInt210 / 1000;
				this.anInt296 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt296;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt296 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("98961, " + 7 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method119() {
		try {
			@Pc(21) int local21;
			@Pc(50) int local50;
			@Pc(54) int local54;
			@Pc(63) int local63;
			@Pc(70) int local70;
			@Pc(133) int local133;
			@Pc(190) int local190;
			try {
				this.anInt224 = -1;
				this.aClass29_1.method515();
				this.aClass29_3.method515();
				Class1_Sub1_Sub2_Sub1.method345();
				this.method134();
				this.aClass37_1.method530();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method420();
				}
				System.gc();
				@Pc(46) Class4 local46 = new Class4(this.anInt241, 104, 104, this.anIntArrayArrayArray6, this.aByteArrayArrayArray7);
				local50 = this.aByteArrayArray1.length;
				Class4.aBoolean30 = Class37.aBoolean212;
				for (local54 = 0; local54 < local50; local54++) {
					local63 = this.anIntArray39[local54] >> 8;
					local70 = this.anIntArray39[local54] & 0xFF;
					if (local63 == 33 && local70 >= 71 && local70 <= 73) {
						Class4.aBoolean30 = false;
					}
				}
				if (Class4.aBoolean30) {
					this.aClass37_1.method531(this.anInt320);
				} else {
					this.aClass37_1.method531(0);
				}
				this.aClass1_Sub1_Sub3_2.method469(62);
				@Pc(138) byte[] local138;
				for (local63 = 0; local63 < local50; local63++) {
					local70 = (this.anIntArray39[local63] >> 8) * 64 - this.anInt353;
					local133 = (this.anIntArray39[local63] & 0xFF) * 64 - this.anInt354;
					local138 = this.aByteArrayArray1[local63];
					if (local138 != null) {
						local46.method57(local138, local133, local70, (this.anInt279 - 6) * 8, (this.anInt280 - 6) * 8);
					}
				}
				for (local70 = 0; local70 < local50; local70++) {
					local133 = (this.anIntArray39[local70] >> 8) * 64 - this.anInt353;
					local190 = (this.anIntArray39[local70] & 0xFF) * 64 - this.anInt354;
					@Pc(195) byte[] local195 = this.aByteArrayArray1[local70];
					if (local195 == null && this.anInt280 < 800) {
						local46.method56(local133, local190);
					}
				}
				this.aClass1_Sub1_Sub3_2.method469(62);
				@Pc(240) int local240;
				for (local133 = 0; local133 < local50; local133++) {
					local138 = this.aByteArrayArray2[local133];
					if (local138 != null) {
						local240 = (this.anIntArray39[local133] >> 8) * 64 - this.anInt353;
						@Pc(252) int local252 = (this.anIntArray39[local133] & 0xFF) * 64 - this.anInt354;
						local46.method60(this.aClass37_1, local138, local252, this.aClass19Array1, local240);
					}
				}
				this.aClass1_Sub1_Sub3_2.method469(62);
				local46.method62(this.aClass19Array1, this.aByte15, this.aClass37_1);
				this.aClass35_26.method524(this.anInt253);
				this.aClass1_Sub1_Sub3_2.method469(62);
				for (local190 = 0; local190 < 104; local190++) {
					for (local240 = 0; local240 < 104; local240++) {
						this.method138(local190, local240);
					}
				}
				this.method152();
			} catch (@Pc(314) Exception local314) {
			}
			Class9.aClass40_4.method593();
			@Pc(328) int local328;
			if (aBoolean52 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass44_Sub1_1.method638(0, 921);
				for (local328 = 0; local328 < local21; local328++) {
					local50 = this.aClass44_Sub1_1.method643(local328);
					if ((local50 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method260(local328);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method346(aByte12);
			this.aClass44_Sub1_1.method649();
			local21 = (this.anInt279 - 6) / 8 - 1;
			local328 = (this.anInt279 + 6) / 8 + 1;
			local50 = (this.anInt280 - 6) / 8 - 1;
			local54 = (this.anInt280 + 6) / 8 + 1;
			if (this.aBoolean79) {
				local21 = 49;
				local328 = 50;
				local50 = 49;
				local54 = 50;
			}
			for (local63 = local21; local63 <= local328; local63++) {
				for (local70 = local50; local70 <= local54; local70++) {
					if (local63 == local21 || local63 == local328 || local70 == local50 || local70 == local54) {
						local133 = this.aClass44_Sub1_1.method640(0, local63, local70, anInt365);
						if (local133 != -1) {
							this.aClass44_Sub1_1.method650(local133, 3);
						}
						local190 = this.aClass44_Sub1_1.method640(1, local63, local70, anInt365);
						if (local190 != -1) {
							this.aClass44_Sub1_1.method650(local190, 3);
						}
					}
				}
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("60606, " + 44043 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method120() {
		try {
			this.anInt267 = 0;
			@Pc(15) int local15 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 >> 7) + this.anInt353;
			@Pc(23) int local23 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 >> 7) + this.anInt354;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt267 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt267 = 1;
			}
			if (this.anInt267 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt267 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("39125, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method121(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 >> 7 == this.anInt420 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 >> 7 == this.anInt421) {
				this.anInt420 = 0;
				anInt366++;
				if (anInt366 > 122) {
					anInt366 = 0;
					this.aClass1_Sub1_Sub3_2.method469(168);
					this.aClass1_Sub1_Sub3_2.method470(62);
				}
			}
			@Pc(39) int local39 = this.anInt238;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
				@Pc(51) Class1_Sub1_Sub1_Sub1_Sub1 local51;
				@Pc(56) int local56;
				if (arg0) {
					local51 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local56 = this.anInt237 << 14;
				} else {
					local51 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray36[local45]];
					local56 = this.anIntArray36[local45] << 14;
				}
				if (local51 != null && local51.method680()) {
					local51.aBoolean23 = false;
					if ((aBoolean52 && this.anInt238 > 50 || this.anInt238 > 200) && !arg0 && local51.anInt1021 == local51.anInt1005) {
						local51.aBoolean23 = true;
					}
					@Pc(107) int local107 = local51.anInt1001 >> 7;
					@Pc(112) int local112 = local51.anInt1002 >> 7;
					if (local107 >= 0 && local107 < 104 && local112 >= 0 && local112 < 104) {
						if (local51.aClass1_Sub1_Sub1_Sub5_1 == null || anInt283 < local51.anInt131 || anInt283 >= local51.anInt132) {
							if ((local51.anInt1001 & 0x7F) == 64 && (local51.anInt1002 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local107][local112] == this.anInt273) {
									continue;
								}
								this.anIntArrayArray5[local107][local112] = this.anInt273;
							}
							local51.anInt130 = this.method181(local51.anInt1002, local51.anInt1001, this.anInt320);
							this.aClass37_1.method541(local51.anInt1003, 60, local51.anInt130, local51.aBoolean243, local51, this.anInt320, local51.anInt1002, local56, local51.anInt1001);
						} else {
							local51.aBoolean23 = false;
							local51.anInt130 = this.method181(local51.anInt1002, local51.anInt1001, this.anInt320);
							this.aClass37_1.method542(local51.anInt138, local51, local51.anInt130, local51.anInt1002, local51.anInt136, local51.anInt1001, local56, local51.anInt137, local51.anInt139, this.anInt320, local51.anInt1003);
						}
					}
				}
			}
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("53429, " + arg0 + ", " + false + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method122(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			@Pc(7) int local7 = arg1.method491(1);
			if (local7 != 0) {
				@Pc(25) int local25 = arg1.method491(2);
				if (local25 == 0) {
					this.anIntArray37[this.anInt239++] = this.anInt237;
				} else {
					@Pc(48) int local48;
					@Pc(58) int local58;
					if (local25 == 1) {
						local48 = arg1.method491(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(false, local48);
						local58 = arg1.method491(1);
						if (local58 == 1) {
							this.anIntArray37[this.anInt239++] = this.anInt237;
						}
					} else {
						@Pc(102) int local102;
						if (local25 == 2) {
							local48 = arg1.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(true, local48);
							local58 = arg1.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(true, local58);
							local102 = arg1.method491(1);
							if (local102 == 1) {
								this.anIntArray37[this.anInt239++] = this.anInt237;
							}
						} else if (local25 == 3) {
							this.anInt320 = arg1.method491(2);
							local48 = arg1.method491(7);
							local58 = arg1.method491(7);
							local102 = arg1.method491(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method677(local58, local102 == 1, local48);
							@Pc(158) int local158 = arg1.method491(1);
							if (local158 == 1) {
								this.anIntArray37[this.anInt239++] = this.anInt237;
							}
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("81659, " + -50 + ", " + arg0 + ", " + arg1 + ", " + local175.toString());
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
				return new URL("http://127.0.0.1:" + (anInt256 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method123() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method666("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_6.method524(this.anInt253);
			local13.method389(0, 0);
			this.aClass35_7.method524(this.anInt253);
			local13.method389(-637, 0);
			this.aClass35_3.method524(this.anInt253);
			local13.method389(-128, 0);
			this.aClass35_4.method524(this.anInt253);
			local13.method389(-202, -371);
			this.aClass35_5.method524(this.anInt253);
			local13.method389(-202, -171);
			this.aClass35_8.method524(this.anInt253);
			local13.method389(0, -265);
			this.aClass35_9.method524(this.anInt253);
			local13.method389(-562, -265);
			this.aClass35_10.method524(this.anInt253);
			local13.method389(-128, -171);
			this.aClass35_11.method524(this.anInt253);
			local13.method389(-562, -171);
			@Pc(107) int[] local107 = new int[local13.anInt663];
			for (@Pc(109) int local109 = 0; local109 < local13.anInt664; local109++) {
				for (@Pc(113) int local113 = 0; local113 < local13.anInt663; local113++) {
					local107[local113] = local13.anIntArray208[local13.anInt663 + local13.anInt663 * local109 - local113 - 1];
				}
				for (@Pc(139) int local139 = 0; local139 < local13.anInt663; local139++) {
					local13.anIntArray208[local139 + local13.anInt663 * local109] = local107[local139];
				}
			}
			this.aClass35_6.method524(this.anInt253);
			local13.method389(382, 0);
			this.aClass35_7.method524(this.anInt253);
			local13.method389(-255, 0);
			this.aClass35_3.method524(this.anInt253);
			local13.method389(254, 0);
			this.aClass35_4.method524(this.anInt253);
			local13.method389(180, -371);
			this.aClass35_5.method524(this.anInt253);
			local13.method389(180, -171);
			this.aClass35_8.method524(this.anInt253);
			local13.method389(382, -265);
			this.aClass35_9.method524(this.anInt253);
			local13.method389(-180, -265);
			this.aClass35_10.method524(this.anInt253);
			local13.method389(254, -171);
			this.aClass35_11.method524(this.anInt253);
			local13.method389(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_3.method524(this.anInt253);
			local13.method391(18, 382 - local13.anInt663 / 2 - 128);
			System.gc();
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("13457, " + -635 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method125() {
		try {
			this.aClass1_Sub1_Sub3_2.method469(153);
			if (this.anInt288 != -1) {
				this.anInt288 = -1;
				this.aBoolean60 = true;
				this.aBoolean62 = false;
				this.aBoolean70 = true;
			}
			if (this.anInt371 != -1) {
				this.anInt371 = -1;
				this.aBoolean53 = true;
				this.aBoolean62 = false;
			}
			this.anInt254 = -1;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("29057, " + false + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ib;)V")
	private void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub2_Sub2 arg3) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg1 * arg1;
			@Pc(11) boolean local11 = false;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(25) int local25 = this.anInt262 + this.anInt265 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub5.anIntArray151[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray152[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt396 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt396 + 256);
				@Pc(61) int local61 = arg1 * local42 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg1 * local51 - arg2 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_9.method396(local83 + 94 + 4 - 10, local77, 83 - local89 - 20);
			} else {
				this.method106(arg3, arg2, arg1);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("29403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method127() {
		try {
			while (true) {
				@Pc(11) Class1_Sub1_Sub4 local11 = this.aClass44_Sub1_1.method647();
				if (local11 == null) {
					return;
				}
				if (local11.anInt785 == 0) {
					Class1_Sub1_Sub1_Sub5.method259(local11.aByteArray10, local11.anInt786, this.aByte13);
					if ((this.aClass44_Sub1_1.method643(local11.anInt786) & 0x62) != 0) {
						this.aBoolean60 = true;
						if (this.anInt371 != -1) {
							this.aBoolean53 = true;
						}
					}
				}
				if (local11.anInt785 == 1 && local11.aByteArray10 != null) {
					Class12.method303(local11.aByteArray10);
				}
				if (local11.anInt785 == 2 && local11.anInt786 == this.anInt319 && local11.aByteArray10 != null) {
					this.method195(local11.aByteArray10, this.aBoolean68);
				}
				if (local11.anInt785 == 3 && this.anInt284 == 1) {
					for (@Pc(83) int local83 = 0; local83 < this.aByteArrayArray1.length; local83++) {
						if (this.anIntArray40[local83] == local11.anInt786) {
							this.aByteArrayArray1[local83] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray40[local83] = -1;
							}
							break;
						}
						if (this.anIntArray41[local83] == local11.anInt786) {
							this.aByteArrayArray2[local83] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray41[local83] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt785 == 93 && this.aClass44_Sub1_1.method642(this.anInt285, local11.anInt786)) {
					Class4.method59(this.aClass44_Sub1_1, (byte) 4, new Class1_Sub1_Sub3(false, local11.aByteArray10));
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("79872, " + 4 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method128(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass35_27 == null) {
				this.method229();
				super.aClass35_2 = null;
				@Pc(13) boolean local13 = false;
				this.aClass35_3 = null;
				this.aClass35_4 = null;
				this.aClass35_5 = null;
				this.aClass35_6 = null;
				this.aClass35_7 = null;
				this.aClass35_8 = null;
				this.aClass35_9 = null;
				this.aClass35_10 = null;
				this.aClass35_11 = null;
				this.aClass35_27 = new Class35(aByte7, 479, 96, this.method94());
				this.aClass35_25 = new Class35(aByte7, 172, 156, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass1_Sub1_Sub2_Sub3_11.method418(0, 0);
				this.aClass35_24 = new Class35(aByte7, 190, 261, this.method94());
				this.aClass35_26 = new Class35(aByte7, 512, 334, this.method94());
				Class1_Sub1_Sub2.method437();
				this.aClass35_12 = new Class35(aByte7, 496, 50, this.method94());
				this.aClass35_13 = new Class35(aByte7, 269, 37, this.method94());
				this.aClass35_14 = new Class35(aByte7, 249, 45, this.method94());
				this.aBoolean47 = true;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("15386, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;IB)V")
	private void method129(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) int local6;
			if (arg2 != 6) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			this.anInt252 = 0;
			this.anInt239 = 0;
			this.method122(arg1, arg0);
			this.method184(arg0, arg1);
			this.method135(arg1, arg0);
			this.method194(arg0, arg1);
			@Pc(46) int local46;
			for (local6 = 0; local6 < this.anInt252; local6++) {
				local46 = this.anIntArray44[local6];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local46].anInt1041 != anInt283) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local46] = null;
				}
			}
			if (arg0.anInt757 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt757 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local46 = 0; local46 < this.anInt238; local46++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray36[local46]] == null) {
					signlink.reporterror(this.aString6 + " null entry in pl list - pos:" + local46 + " size:" + this.anInt238);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("95182, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIB)Z")
	private boolean method130(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("57892, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method556(arg0, arg5, arg1);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass37_1.method560(arg0, arg5, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg4;
				if (local8 > 0) {
					local30 = arg2;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_14.anIntArray208;
				local52 = arg5 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class9 local61 = Class9.method288(local58);
				if (local61.anInt521 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array4[local61.anInt521];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt516 * 4 - local71.anInt689) / 2;
						@Pc(93) int local93 = (local61.anInt517 * 4 - local71.anInt690) / 2;
						local71.method418((104 - arg1 - local61.anInt517) * 4 + local93 + 48, arg5 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass37_1.method558(arg0, arg5, arg1);
			if (arg3 >= 0) {
				this.aBoolean72 = !this.aBoolean72;
			}
			if (local8 != 0) {
				local18 = this.aClass37_1.method560(arg0, arg5, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(457) Class9 local457 = Class9.method288(local30);
				@Pc(489) int local489;
				if (local457.anInt521 != -1) {
					@Pc(467) Class1_Sub1_Sub2_Sub3 local467 = this.aClass1_Sub1_Sub2_Sub3Array4[local457.anInt521];
					if (local467 != null) {
						local58 = (local457.anInt516 * 4 - local467.anInt689) / 2;
						local489 = (local457.anInt517 * 4 - local467.anInt690) / 2;
						local467.method418((104 - arg1 - local457.anInt517) * 4 + local489 + 48, arg5 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(526) int[] local526 = this.aClass1_Sub1_Sub2_Sub2_14.anIntArray208;
					local489 = arg5 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local526[local489 + 1536] = local52;
						local526[local489 + 1024 + 1] = local52;
						local526[local489 + 512 + 2] = local52;
						local526[local489 + 3] = local52;
					} else {
						local526[local489] = local52;
						local526[local489 + 512 + 1] = local52;
						local526[local489 + 1024 + 2] = local52;
						local526[local489 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass37_1.method559(arg0, arg5, arg1);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(621) Class9 local621 = Class9.method288(local18);
				if (local621.anInt521 != -1) {
					@Pc(631) Class1_Sub1_Sub2_Sub3 local631 = this.aClass1_Sub1_Sub2_Sub3Array4[local621.anInt521];
					if (local631 != null) {
						local30 = (local621.anInt516 * 4 - local631.anInt689) / 2;
						@Pc(653) int local653 = (local621.anInt517 * 4 - local631.anInt690) / 2;
						local631.method418((104 - arg1 - local621.anInt517) * 4 + local653 + 48, arg5 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(677) RuntimeException local677) {
			signlink.reporterror("27786, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local677.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method132() {
		try {
			signlink.anInt959 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("6696, " + 598 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method91() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method132();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean136 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method637();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.anIntArray39 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArray40 = null;
			this.anIntArray41 = null;
			this.anIntArrayArrayArray6 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray6 = null;
			this.anIntArrayArray3 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.aByteArray2 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass35_15 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_21 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.anIntArrayArray5 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray36 = null;
			this.anIntArray37 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray44 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray80 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_2 = null;
			this.aClass29_3 = null;
			this.aClass29_1 = null;
			this.anIntArray50 = null;
			this.anIntArray51 = null;
			this.anIntArray52 = null;
			this.anIntArray53 = null;
			this.aStringArray6 = null;
			this.anIntArray32 = null;
			this.anIntArray63 = null;
			this.anIntArray64 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2_14 = null;
			this.aStringArray3 = null;
			this.aLongArray4 = null;
			this.anIntArray90 = null;
			this.aClass35_6 = null;
			this.aClass35_7 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
			this.aClass35_10 = null;
			this.aClass35_11 = null;
			this.method229();
			Class9.method287(this.aByte22);
			Class13.method322(this.aByte22);
			Class15.method360(this.aByte22);
			Class21.aClass21Array1 = null;
			Class23.aClass23Array1 = null;
			Class6.aClass6Array1 = null;
			Class25.aClass25Array1 = null;
			Class27.aClass27Array1 = null;
			Class33.aClass33Array1 = null;
			Class33.aClass40_9 = null;
			Class39.aClass39Array1 = null;
			super.aClass35_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1 = null;
			Class1_Sub1_Sub2_Sub1.method342(this.aByte22);
			Class37.method529(this.aByte22);
			Class1_Sub1_Sub1_Sub5.method257(this.aByte22);
			Class12.method304(this.aByte22);
			System.gc();
		} catch (@Pc(382) RuntimeException local382) {
			signlink.reporterror("41319, " + 28705 + ", " + local382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.anInt374 > 9 || this.anInt374 < 9) {
				this.aClass29ArrayArrayArray1 = null;
			}
			if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
				if (aBoolean52 && arg4 != this.anInt320) {
					return;
				}
				@Pc(31) int local31 = 0;
				if (arg6 == 0) {
					local31 = this.aClass37_1.method556(arg4, arg2, arg5);
				}
				if (arg6 == 1) {
					local31 = this.aClass37_1.method557(arg5, arg2, arg4);
				}
				if (arg6 == 2) {
					local31 = this.aClass37_1.method558(arg4, arg2, arg5);
				}
				if (arg6 == 3) {
					local31 = this.aClass37_1.method559(arg4, arg2, arg5);
				}
				@Pc(87) int local87;
				if (local31 != 0) {
					local87 = this.aClass37_1.method560(arg4, arg2, arg5, local31);
					@Pc(93) int local93 = local31 >> 14 & 0x7FFF;
					@Pc(97) int local97 = local87 & 0x1F;
					@Pc(101) int local101 = local87 >> 6;
					@Pc(113) Class9 local113;
					if (arg6 == 0) {
						this.aClass37_1.method547(arg4, arg2, arg5);
						local113 = Class9.method288(local93);
						if (local113.aBoolean120) {
							this.aClass19Array1[arg4].method425(arg2, arg5, local113.aBoolean121, local101, local97);
						}
					}
					if (arg6 == 1) {
						this.aClass37_1.method548(arg4, arg5, arg2);
					}
					if (arg6 == 2) {
						this.aClass37_1.method549(arg4, arg2, arg5);
						local113 = Class9.method288(local93);
						if (arg2 + local113.anInt516 > 103 || arg5 + local113.anInt516 > 103 || arg2 + local113.anInt517 > 103 || arg5 + local113.anInt517 > 103) {
							return;
						}
						if (local113.aBoolean120) {
							this.aClass19Array1[arg4].method426(local113.aBoolean121, arg2, local113.anInt517, local113.anInt516, arg5, local101);
						}
					}
					if (arg6 == 3) {
						this.aClass37_1.method550(arg4, arg2, arg5);
						local113 = Class9.method288(local93);
						if (local113.aBoolean120 && local113.aBoolean122) {
							this.aClass19Array1[arg4].method428(arg2, arg5);
						}
					}
				}
				if (arg1 >= 0) {
					local87 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray7[1][arg2][arg5] & 0x2) == 2) {
						local87 = arg4 + 1;
					}
					Class4.method73(arg1, this.anIntArrayArrayArray6, this.aClass19Array1[arg4], arg3, arg5, this.aClass37_1, arg4, local87, arg0, arg2);
					return;
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("95889, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method134() {
		try {
			Class9.aClass40_4.method593();
			Class9.aClass40_5.method593();
			Class13.aClass40_6.method593();
			Class15.aClass40_7.method593();
			Class15.aClass40_8.method593();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method593();
			Class33.aClass40_9.method593();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("57692, " + false + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method135(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt758 + 10 < arg0 * 8) {
					@Pc(19) int local19 = arg1.method491(11);
					if (local19 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local19] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19].method39(this.aClass1_Sub1_Sub3Array1[local19]);
							}
						}
						this.anIntArray36[this.anInt238++] = local19;
						@Pc(65) Class1_Sub1_Sub1_Sub1_Sub1 local65 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19];
						local65.anInt1041 = anInt283;
						@Pc(73) int local73 = arg1.method491(5);
						if (local73 > 15) {
							local73 -= 32;
						}
						@Pc(82) int local82 = arg1.method491(5);
						if (local82 > 15) {
							local82 -= 32;
						}
						@Pc(91) int local91 = arg1.method491(1);
						local65.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local82, local91 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local73);
						@Pc(117) int local117 = arg1.method491(1);
						if (local117 == 1) {
							this.anIntArray37[this.anInt239++] = local19;
						}
						continue;
					}
				}
				arg1.method492();
				return;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("86136, " + arg0 + ", " + arg1 + ", " + 4533 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method136() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(12) Exception local12) {
			}
			this.aClass8_1 = null;
			this.aBoolean82 = false;
			this.anInt270 = 0;
			this.aString6 = "";
			this.aString7 = "";
			this.method134();
			this.aClass37_1.method530();
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass19Array1[local36].method420();
			}
			System.gc();
			this.method132();
			this.anInt393 = -1;
			this.anInt319 = -1;
			this.anInt341 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("91708, " + 0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ab;I)V")
	private void method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt395 < 400) {
				@Pc(42) String local42;
				if (arg3.anInt129 == 0) {
					local42 = arg3.aString3 + method201(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128, arg3.anInt128) + " (level-" + arg3.anInt128 + ")";
				} else {
					local42 = arg3.aString3 + " (skill-" + arg3.anInt129 + ")";
				}
				@Pc(172) int local172;
				if (this.anInt329 == 1) {
					this.aStringArray6[this.anInt395] = "Use " + this.aString11 + " with @whi@" + local42;
					this.anIntArray52[this.anInt395] = 275;
					this.anIntArray53[this.anInt395] = arg2;
					this.anIntArray50[this.anInt395] = arg1;
					this.anIntArray51[this.anInt395] = arg0;
					this.anInt395++;
				} else if (this.anInt358 != 1) {
					for (local172 = 4; local172 >= 0; local172--) {
						if (this.aStringArray5[local172] != null) {
							this.aStringArray6[this.anInt395] = this.aStringArray5[local172] + " @whi@" + local42;
							@Pc(199) short local199 = 0;
							if (this.aStringArray5[local172].equalsIgnoreCase("attack")) {
								if (arg3.anInt128 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128) {
									local199 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 != 0 && arg3.anInt140 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 == arg3.anInt140) {
										local199 = 2000;
									} else {
										local199 = 0;
									}
								}
							} else if (this.aBooleanArray3[local172]) {
								local199 = 2000;
							}
							if (local172 == 0) {
								this.anIntArray52[this.anInt395] = local199 + 639;
							}
							if (local172 == 1) {
								this.anIntArray52[this.anInt395] = local199 + 499;
							}
							if (local172 == 2) {
								this.anIntArray52[this.anInt395] = local199 + 27;
							}
							if (local172 == 3) {
								this.anIntArray52[this.anInt395] = local199 + 387;
							}
							if (local172 == 4) {
								this.anIntArray52[this.anInt395] = local199 + 185;
							}
							this.anIntArray53[this.anInt395] = arg2;
							this.anIntArray50[this.anInt395] = arg1;
							this.anIntArray51[this.anInt395] = arg0;
							this.anInt395++;
						}
					}
				} else if ((this.anInt360 & 0x8) == 8) {
					this.aStringArray6[this.anInt395] = this.aString15 + " @whi@" + local42;
					this.anIntArray52[this.anInt395] = 131;
					this.anIntArray53[this.anInt395] = arg2;
					this.anIntArray50[this.anInt395] = arg1;
					this.anIntArray51[this.anInt395] = arg0;
					this.anInt395++;
				}
				for (local172 = 0; local172 < this.anInt395; local172++) {
					if (this.anIntArray52[local172] == 718) {
						this.aStringArray6[local172] = "Walk here @whi@" + local42;
						return;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("11062, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 225 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt320][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method551(this.anInt320, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			@Pc(32) Class15 local32 = Class15.method361(local27.anInt177);
			@Pc(35) int local35 = local32.anInt623;
			if (local32.aBoolean156) {
				local35 *= local27.anInt178 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method509(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			if (local27.anInt177 != local23.anInt177 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt177 != local23.anInt177 && local27.anInt177 != local65.anInt177 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method537(local67, local110, local65, this.method181(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt320), arg0, local23, this.anInt320, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method139(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt958 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("73003, " + arg0 + ", " + 518 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method140() {
		try {
			anInt271++;
			if (anInt271 > 192) {
				anInt271 = 0;
				this.aClass1_Sub1_Sub3_2.method469(166);
				this.aClass1_Sub1_Sub3_2.method470(232);
			}
			while (true) {
				@Pc(26) int local26;
				do {
					while (true) {
						local26 = this.method88();
						if (local26 == -1) {
							return;
						}
						if (this.anInt254 != -1 && this.anInt254 == this.anInt304) {
							if (local26 == 8 && this.aString9.length() > 0) {
								this.aString9 = this.aString9.substring(0, this.aString9.length() - 1);
							}
							break;
						}
						@Pc(206) int local206;
						if (this.aBoolean75) {
							if (local26 >= 32 && local26 <= 122 && this.aString17.length() < 80) {
								this.aString17 = this.aString17 + (char) local26;
								this.aBoolean53 = true;
							}
							if (local26 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean53 = true;
							}
							if (local26 == 13 || local26 == 10) {
								this.aBoolean75 = false;
								this.aBoolean53 = true;
								@Pc(166) long local166;
								if (this.anInt357 == 1) {
									local166 = Class48.method667(this.aString17);
									this.method162(local166);
								}
								if (this.anInt357 == 2 && this.anInt275 > 0) {
									local166 = Class48.method667(this.aString17);
									this.method215(local166);
								}
								if (this.anInt357 == 3 && this.aString17.length() > 0) {
									this.aClass1_Sub1_Sub3_2.method469(165);
									this.aClass1_Sub1_Sub3_2.method470(0);
									local206 = this.aClass1_Sub1_Sub3_2.anInt757;
									this.aClass1_Sub1_Sub3_2.method476(this.aLong16);
									Class49.method684(this.aClass1_Sub1_Sub3_2, this.aString17);
									this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt757 - local206);
									this.aString17 = Class49.method685(this.aString17);
									this.aString17 = Class42.method604(this.aString17);
									this.method171(6, this.aString17, Class48.method671(Class48.method668(this.aLong16)));
									if (this.anInt277 == 2) {
										this.anInt277 = 1;
										this.aBoolean46 = true;
										this.aClass1_Sub1_Sub3_2.method469(215);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt376);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt277);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt325);
									}
								}
								if (this.anInt357 == 4 && this.anInt361 < 100) {
									local166 = Class48.method667(this.aString17);
									this.method190(local166);
								}
								if (this.anInt357 == 5 && this.anInt361 > 0) {
									local166 = Class48.method667(this.aString17);
									this.method160(local166);
								}
							}
						} else if (this.aBoolean57) {
							if (local26 >= 48 && local26 <= 57 && this.aString8.length() < 10) {
								this.aString8 = this.aString8 + (char) local26;
								this.aBoolean53 = true;
							}
							if (local26 == 8 && this.aString8.length() > 0) {
								this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
								this.aBoolean53 = true;
							}
							if (local26 == 13 || local26 == 10) {
								if (this.aString8.length() > 0) {
									local206 = 0;
									try {
										local206 = Integer.parseInt(this.aString8);
									} catch (@Pc(382) Exception local382) {
									}
									this.aClass1_Sub1_Sub3_2.method469(112);
									this.aClass1_Sub1_Sub3_2.method474(local206);
								}
								this.aBoolean57 = false;
								this.aBoolean53 = true;
							}
						} else if (this.anInt371 == -1) {
							if (local26 >= 32 && local26 <= 122 && this.aString5.length() < 80) {
								this.aString5 = this.aString5 + (char) local26;
								this.aBoolean53 = true;
							}
							if (local26 == 8 && this.aString5.length() > 0) {
								this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
								this.aBoolean53 = true;
							}
							if ((local26 == 13 || local26 == 10) && this.aString5.length() > 0) {
								if (this.anInt409 == 2) {
									if (this.aString5.equals("::clientdrop")) {
										this.method114(this.anInt259);
									}
									if (this.aString5.equals("::lag")) {
										this.method141();
									}
									if (this.aString5.equals("::prefetchmusic")) {
										for (local206 = 0; local206 < this.aClass44_Sub1_1.method638(2, 921); local206++) {
											this.aClass44_Sub1_1.method648((byte) 1, local206, 2);
										}
									}
									if (this.aString5.equals("::fpson")) {
										aBoolean84 = true;
									}
									if (this.aString5.equals("::fpsoff")) {
										aBoolean84 = false;
									}
								}
								if (this.aString5.startsWith("::")) {
									this.aClass1_Sub1_Sub3_2.method469(78);
									this.aClass1_Sub1_Sub3_2.method470(this.aString5.length() - 1);
									this.aClass1_Sub1_Sub3_2.method477(this.aString5.substring(2));
								} else {
									@Pc(550) String local550 = this.aString5.toLowerCase();
									@Pc(552) byte local552 = 0;
									if (local550.startsWith("yellow:")) {
										local552 = 0;
										this.aString5 = this.aString5.substring(7);
									} else if (local550.startsWith("red:")) {
										local552 = 1;
										this.aString5 = this.aString5.substring(4);
									} else if (local550.startsWith("green:")) {
										local552 = 2;
										this.aString5 = this.aString5.substring(6);
									} else if (local550.startsWith("cyan:")) {
										local552 = 3;
										this.aString5 = this.aString5.substring(5);
									} else if (local550.startsWith("purple:")) {
										local552 = 4;
										this.aString5 = this.aString5.substring(7);
									} else if (local550.startsWith("white:")) {
										local552 = 5;
										this.aString5 = this.aString5.substring(6);
									} else if (local550.startsWith("flash1:")) {
										local552 = 6;
										this.aString5 = this.aString5.substring(7);
									} else if (local550.startsWith("flash2:")) {
										local552 = 7;
										this.aString5 = this.aString5.substring(7);
									} else if (local550.startsWith("flash3:")) {
										local552 = 8;
										this.aString5 = this.aString5.substring(7);
									} else if (local550.startsWith("glow1:")) {
										local552 = 9;
										this.aString5 = this.aString5.substring(6);
									} else if (local550.startsWith("glow2:")) {
										local552 = 10;
										this.aString5 = this.aString5.substring(6);
									} else if (local550.startsWith("glow3:")) {
										local552 = 11;
										this.aString5 = this.aString5.substring(6);
									}
									local550 = this.aString5.toLowerCase();
									@Pc(724) byte local724 = 0;
									if (local550.startsWith("wave:")) {
										local724 = 1;
										this.aString5 = this.aString5.substring(5);
									} else if (local550.startsWith("wave2:")) {
										local724 = 2;
										this.aString5 = this.aString5.substring(6);
									} else if (local550.startsWith("shake:")) {
										local724 = 3;
										this.aString5 = this.aString5.substring(6);
									} else if (local550.startsWith("scroll:")) {
										local724 = 4;
										this.aString5 = this.aString5.substring(7);
									} else if (local550.startsWith("slide:")) {
										local724 = 5;
										this.aString5 = this.aString5.substring(6);
									}
									this.aClass1_Sub1_Sub3_2.method469(233);
									this.aClass1_Sub1_Sub3_2.method470(0);
									@Pc(805) int local805 = this.aClass1_Sub1_Sub3_2.anInt757;
									this.aClass1_Sub1_Sub3_2.method470(local552);
									this.aClass1_Sub1_Sub3_2.method470(local724);
									Class49.method684(this.aClass1_Sub1_Sub3_2, this.aString5);
									this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt757 - local805);
									this.aString5 = Class49.method685(this.aString5);
									this.aString5 = Class42.method604(this.aString5);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString5;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1013 = local552;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1014 = local724;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1012 = 150;
									if (this.anInt409 == 2) {
										this.method171(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									} else if (this.anInt409 == 1) {
										this.method171(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									} else {
										this.method171(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									}
									if (this.anInt376 == 2) {
										this.anInt376 = 3;
										this.aBoolean46 = true;
										this.aClass1_Sub1_Sub3_2.method469(215);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt376);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt277);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt325);
									}
								}
								this.aString5 = "";
								this.aBoolean53 = true;
							}
						}
					}
				} while ((local26 < 97 || local26 > 122) && (local26 < 65 || local26 > 90) && (local26 < 48 || local26 > 57) && local26 != 32);
				if (this.aString9.length() < 12) {
					this.aString9 = this.aString9 + (char) local26;
				}
			}
		} catch (@Pc(941) RuntimeException local941) {
			signlink.reporterror("35791, " + false + ", " + local941.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method141() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt352);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt975);
			}
			System.out.println("loop-cycle:" + anInt283);
			System.out.println("draw-cycle:" + anInt260);
			System.out.println("ptype:" + this.anInt413);
			System.out.println("psize:" + this.anInt412);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method252();
			}
			super.aBoolean38 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("37351, " + 8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method94() {
		try {
			if (this.aByte16 != -114) {
				this.anInt413 = this.aClass1_Sub1_Sub3_4.method480();
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("36026, " + -114 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method142() {
		try {
			@Pc(7) Graphics local7 = this.method94().getGraphics();
			local7.setColor(Color.black);
			local7.fillRect(0, 0, 765, 503);
			this.method87();
			@Pc(39) byte local39;
			@Pc(45) int local45;
			if (this.aBoolean42) {
				this.aBoolean66 = false;
				local7.setFont(new Font("Helvetica", 1, 16));
				local7.setColor(Color.yellow);
				local39 = 35;
				local7.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local45 = local39 + 50;
				local7.setColor(Color.white);
				local7.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(54) int local54 = local45 + 50;
				local7.setColor(Color.white);
				local7.setFont(new Font("Helvetica", 1, 12));
				local7.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(71) int local71 = local54 + 30;
				local7.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(77) int local77 = local71 + 30;
				local7.drawString("3: Try using a different game-world", 30, 195);
				@Pc(83) int local83 = local77 + 30;
				local7.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(89) int local89 = local83 + 30;
				local7.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean64) {
				this.aBoolean66 = false;
				local7.setFont(new Font("Helvetica", 1, 20));
				local7.setColor(Color.white);
				local7.drawString("Error - unable to load game!", 50, 50);
				local7.drawString("To play RuneScape make sure you play from", 50, 100);
				local7.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean63) {
				this.aBoolean66 = false;
				local7.setColor(Color.yellow);
				local39 = 35;
				local7.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local45 = local39 + 50;
				local7.setColor(Color.white);
				local7.drawString("To fix this try the following (in order):", 30, 85);
				local45 += 50;
				local7.setColor(Color.white);
				local7.setFont(new Font("Helvetica", 1, 12));
				local7.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local45 += 30;
				local7.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local45 += 30;
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("93768, " + 331 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILclient!d;III)V")
	private void method143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2.anInt434 == 0 && arg2.anIntArray98 != null && !arg2.aBoolean92 && (arg4 >= arg1 && arg3 >= arg0 && arg4 <= arg1 + arg2.anInt437 && arg3 <= arg0 + arg2.anInt438)) {
				@Pc(42) int local42 = arg2.anIntArray98.length;
				for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
					@Pc(53) int local53 = arg2.anIntArray99[local44] + arg1;
					@Pc(62) int local62 = arg2.anIntArray100[local44] + arg0 - arg5;
					@Pc(69) Class6 local69 = Class6.aClass6Array1[arg2.anIntArray98[local44]];
					@Pc(74) int local74 = local53 + local69.anInt439;
					@Pc(79) int local79 = local62 + local69.anInt440;
					if ((local69.anInt441 >= 0 || local69.anInt449 != 0) && arg4 >= local74 && arg3 >= local79 && arg4 < local74 + local69.anInt437 && arg3 < local79 + local69.anInt438) {
						if (local69.anInt441 >= 0) {
							this.anInt216 = local69.anInt441;
						} else {
							this.anInt216 = local69.anInt432;
						}
					}
					if (local69.anInt434 == 0) {
						this.method143(local79, local74, local69, arg3, arg4, local69.anInt443);
						if (local69.anInt442 > local69.anInt438) {
							this.method174(arg3, arg4, local69, local79, local69.anInt438, true, local74 + local69.anInt437, local69.anInt442);
						}
					} else {
						if (local69.anInt435 == 1 && arg4 >= local74 && arg3 >= local79 && arg4 < local74 + local69.anInt437 && arg3 < local79 + local69.anInt438) {
							@Pc(176) boolean local176 = false;
							if (local69.anInt436 != 0) {
								local176 = this.method183(local69);
							}
							if (!local176) {
								this.aStringArray6[this.anInt395] = local69.aString22;
								this.anIntArray52[this.anInt395] = 231;
								this.anIntArray51[this.anInt395] = local69.anInt432;
								this.anInt395++;
							}
						}
						if (local69.anInt435 == 2 && this.anInt358 == 0 && arg4 >= local74 && arg3 >= local79 && arg4 < local74 + local69.anInt437 && arg3 < local79 + local69.anInt438) {
							@Pc(240) String local240 = local69.aString20;
							if (local240.indexOf(" ") != -1) {
								local240 = local240.substring(0, local240.indexOf(" "));
							}
							this.aStringArray6[this.anInt395] = local240 + " @gre@" + local69.aString21;
							this.anIntArray52[this.anInt395] = 274;
							this.anIntArray51[this.anInt395] = local69.anInt432;
							this.anInt395++;
						}
						if (local69.anInt435 == 3 && arg4 >= local74 && arg3 >= local79 && arg4 < local74 + local69.anInt437 && arg3 < local79 + local69.anInt438) {
							this.aStringArray6[this.anInt395] = "Close";
							this.anIntArray52[this.anInt395] = 737;
							this.anIntArray51[this.anInt395] = local69.anInt432;
							this.anInt395++;
						}
						if (local69.anInt435 == 4 && arg4 >= local74 && arg3 >= local79 && arg4 < local74 + local69.anInt437 && arg3 < local79 + local69.anInt438) {
							this.aStringArray6[this.anInt395] = local69.aString22;
							this.anIntArray52[this.anInt395] = 435;
							this.anIntArray51[this.anInt395] = local69.anInt432;
							this.anInt395++;
						}
						if (local69.anInt435 == 5 && arg4 >= local74 && arg3 >= local79 && arg4 < local74 + local69.anInt437 && arg3 < local79 + local69.anInt438) {
							this.aStringArray6[this.anInt395] = local69.aString22;
							this.anIntArray52[this.anInt395] = 225;
							this.anIntArray51[this.anInt395] = local69.anInt432;
							this.anInt395++;
						}
						if (local69.anInt435 == 6 && !this.aBoolean62 && arg4 >= local74 && arg3 >= local79 && arg4 < local74 + local69.anInt437 && arg3 < local79 + local69.anInt438) {
							this.aStringArray6[this.anInt395] = local69.aString22;
							this.anIntArray52[this.anInt395] = 997;
							this.anIntArray51[this.anInt395] = local69.anInt432;
							this.anInt395++;
						}
						if (local69.anInt434 == 2) {
							@Pc(488) int local488 = 0;
							for (@Pc(490) int local490 = 0; local490 < local69.anInt438; local490++) {
								for (@Pc(494) int local494 = 0; local494 < local69.anInt437; local494++) {
									@Pc(505) int local505 = local74 + local494 * (local69.anInt445 + 32);
									@Pc(514) int local514 = local79 + local490 * (local69.anInt446 + 32);
									if (local488 < 20) {
										local505 += local69.anIntArray101[local488];
										local514 += local69.anIntArray102[local488];
									}
									if (arg4 >= local505 && arg3 >= local514 && arg4 < local505 + 32 && arg3 < local514 + 32) {
										this.anInt399 = local488;
										this.anInt400 = local69.anInt432;
										if (local69.anIntArray94[local488] > 0) {
											@Pc(567) Class15 local567 = Class15.method361(local69.anIntArray94[local488] - 1);
											if (this.anInt329 == 1 && local69.aBoolean95) {
												if (local69.anInt432 != this.anInt331 || local488 != this.anInt330) {
													this.aStringArray6[this.anInt395] = "Use " + this.aString11 + " with @lre@" + local567.aString25;
													this.anIntArray52[this.anInt395] = 398;
													this.anIntArray53[this.anInt395] = local567.anInt614;
													this.anIntArray50[this.anInt395] = local488;
													this.anIntArray51[this.anInt395] = local69.anInt432;
													this.anInt395++;
												}
											} else if (this.anInt358 != 1 || !local69.aBoolean95) {
												@Pc(704) int local704;
												if (local69.aBoolean95) {
													for (local704 = 4; local704 >= 3; local704--) {
														if (local567.aStringArray11 != null && local567.aStringArray11[local704] != null) {
															this.aStringArray6[this.anInt395] = local567.aStringArray11[local704] + " @lre@" + local567.aString25;
															if (local704 == 3) {
																this.anIntArray52[this.anInt395] = 681;
															}
															if (local704 == 4) {
																this.anIntArray52[this.anInt395] = 100;
															}
															this.anIntArray53[this.anInt395] = local567.anInt614;
															this.anIntArray50[this.anInt395] = local488;
															this.anIntArray51[this.anInt395] = local69.anInt432;
															this.anInt395++;
														} else if (local704 == 4) {
															this.aStringArray6[this.anInt395] = "Drop @lre@" + local567.aString25;
															this.anIntArray52[this.anInt395] = 100;
															this.anIntArray53[this.anInt395] = local567.anInt614;
															this.anIntArray50[this.anInt395] = local488;
															this.anIntArray51[this.anInt395] = local69.anInt432;
															this.anInt395++;
														}
													}
												}
												if (local69.aBoolean96) {
													this.aStringArray6[this.anInt395] = "Use @lre@" + local567.aString25;
													this.anIntArray52[this.anInt395] = 102;
													this.anIntArray53[this.anInt395] = local567.anInt614;
													this.anIntArray50[this.anInt395] = local488;
													this.anIntArray51[this.anInt395] = local69.anInt432;
													this.anInt395++;
												}
												if (local69.aBoolean95 && local567.aStringArray11 != null) {
													for (local704 = 2; local704 >= 0; local704--) {
														if (local567.aStringArray11[local704] != null) {
															this.aStringArray6[this.anInt395] = local567.aStringArray11[local704] + " @lre@" + local567.aString25;
															if (local704 == 0) {
																this.anIntArray52[this.anInt395] = 694;
															}
															if (local704 == 1) {
																this.anIntArray52[this.anInt395] = 962;
															}
															if (local704 == 2) {
																this.anIntArray52[this.anInt395] = 795;
															}
															this.anIntArray53[this.anInt395] = local567.anInt614;
															this.anIntArray50[this.anInt395] = local488;
															this.anIntArray51[this.anInt395] = local69.anInt432;
															this.anInt395++;
														}
													}
												}
												if (local69.aStringArray7 != null) {
													for (local704 = 4; local704 >= 0; local704--) {
														if (local69.aStringArray7[local704] != null) {
															this.aStringArray6[this.anInt395] = local69.aStringArray7[local704] + " @lre@" + local567.aString25;
															if (local704 == 0) {
																this.anIntArray52[this.anInt395] = 582;
															}
															if (local704 == 1) {
																this.anIntArray52[this.anInt395] = 113;
															}
															if (local704 == 2) {
																this.anIntArray52[this.anInt395] = 555;
															}
															if (local704 == 3) {
																this.anIntArray52[this.anInt395] = 331;
															}
															if (local704 == 4) {
																this.anIntArray52[this.anInt395] = 354;
															}
															this.anIntArray53[this.anInt395] = local567.anInt614;
															this.anIntArray50[this.anInt395] = local488;
															this.anIntArray51[this.anInt395] = local69.anInt432;
															this.anInt395++;
														}
													}
												}
												this.aStringArray6[this.anInt395] = "Examine @lre@" + local567.aString25;
												this.anIntArray52[this.anInt395] = 1328;
												this.anIntArray53[this.anInt395] = local567.anInt614;
												this.anIntArray50[this.anInt395] = local488;
												this.anIntArray51[this.anInt395] = local69.anInt432;
												this.anInt395++;
											} else if ((this.anInt360 & 0x10) == 16) {
												this.aStringArray6[this.anInt395] = this.aString15 + " @lre@" + local567.aString25;
												this.anIntArray52[this.anInt395] = 563;
												this.anIntArray53[this.anInt395] = local567.anInt614;
												this.anIntArray50[this.anInt395] = local488;
												this.anIntArray51[this.anInt395] = local69.anInt432;
												this.anInt395++;
											}
										}
									}
									local488++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1134) RuntimeException local1134) {
			signlink.reporterror("15985, " + -90 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method144() {
		try {
			if (this.anInt403 == 0) {
				@Pc(6) int local6 = super.anInt198;
				if (this.anInt358 == 1 && super.anInt199 >= 516 && super.anInt200 >= 160 && super.anInt199 <= 765 && super.anInt200 <= 205) {
					local6 = 0;
				}
				@Pc(42) int local42;
				@Pc(45) int local45;
				@Pc(121) int local121;
				if (this.aBoolean81) {
					if (local6 != 1) {
						local42 = super.anInt193;
						local45 = super.anInt194;
						if (this.anInt384 == 0) {
							local42 -= 4;
							local45 -= 4;
						}
						if (this.anInt384 == 1) {
							local42 -= 553;
							local45 -= 205;
						}
						if (this.anInt384 == 2) {
							local42 -= 17;
							local45 -= 357;
						}
						if (local42 < this.anInt385 - 10 || local42 > this.anInt385 + this.anInt387 + 10 || local45 < this.anInt386 - 10 || local45 > this.anInt386 + this.anInt388 + 10) {
							this.aBoolean81 = false;
							if (this.anInt384 == 1) {
								this.aBoolean60 = true;
							}
							if (this.anInt384 == 2) {
								this.aBoolean53 = true;
							}
						}
					}
					if (local6 == 1) {
						local42 = this.anInt385;
						local45 = this.anInt386;
						local121 = this.anInt387;
						@Pc(124) int local124 = super.anInt199;
						@Pc(127) int local127 = super.anInt200;
						if (this.anInt384 == 0) {
							local124 -= 4;
							local127 -= 4;
						}
						if (this.anInt384 == 1) {
							local124 -= 553;
							local127 -= 205;
						}
						if (this.anInt384 == 2) {
							local124 -= 17;
							local127 -= 357;
						}
						@Pc(146) int local146 = -1;
						for (@Pc(148) int local148 = 0; local148 < this.anInt395; local148++) {
							@Pc(163) int local163 = local45 + (this.anInt395 - 1 - local148) * 15 + 31;
							if (local124 > local42 && local124 < local42 + local121 && local127 > local163 - 13 && local127 < local163 + 3) {
								local146 = local148;
							}
						}
						if (local146 != -1) {
							this.method98(local146);
						}
						this.aBoolean81 = false;
						if (this.anInt384 == 1) {
							this.aBoolean60 = true;
						}
						if (this.anInt384 == 2) {
							this.aBoolean53 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt395 > 0) {
						local42 = this.anIntArray52[this.anInt395 - 1];
						if (local42 == 582 || local42 == 113 || local42 == 555 || local42 == 331 || local42 == 354 || local42 == 694 || local42 == 962 || local42 == 795 || local42 == 681 || local42 == 100 || local42 == 102 || local42 == 1328) {
							local45 = this.anIntArray50[this.anInt395 - 1];
							local121 = this.anIntArray51[this.anInt395 - 1];
							@Pc(283) Class6 local283 = Class6.aClass6Array1[local121];
							if (local283.aBoolean94 || local283.aBoolean97) {
								this.aBoolean69 = false;
								this.anInt363 = 0;
								this.anInt401 = local121;
								this.anInt402 = local45;
								this.anInt403 = 2;
								this.anInt404 = super.anInt199;
								this.anInt405 = super.anInt200;
								if (Class6.aClass6Array1[local121].anInt433 == this.anInt254) {
									this.anInt403 = 1;
								}
								if (Class6.aClass6Array1[local121].anInt433 == this.anInt371) {
									this.anInt403 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt233 == 1 || this.method193(this.anInt395 - 1, this.aBoolean83)) && this.anInt395 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt395 > 0) {
						this.method98(this.anInt395 - 1);
					}
					if (local6 != 2 || this.anInt395 <= 0) {
						return;
					}
					this.method147();
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("41579, " + 0 + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method147() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method449("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt395; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method449(this.aStringArray6[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt395 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt199 > 4 && super.anInt200 > 4 && super.anInt199 < 516 && super.anInt200 < 338) {
				local70 = super.anInt199 - local7 / 2 - 4;
				if (local70 + local7 > 512) {
					local70 = 512 - local7;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt200 - 4;
				if (local88 + local20 > 334) {
					local88 = 334 - local20;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean81 = true;
				this.anInt384 = 0;
				this.anInt385 = local70;
				this.anInt386 = local88;
				this.anInt387 = local7;
				this.anInt388 = this.anInt395 * 15 + 22;
			}
			if (super.anInt199 > 553 && super.anInt200 > 205 && super.anInt199 < 743 && super.anInt200 < 466) {
				local70 = super.anInt199 - local7 / 2 - 553;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 190) {
					local70 = 190 - local7;
				}
				local88 = super.anInt200 - 205;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 261) {
					local88 = 261 - local20;
				}
				this.aBoolean81 = true;
				this.anInt384 = 1;
				this.anInt385 = local70;
				this.anInt386 = local88;
				this.anInt387 = local7;
				this.anInt388 = this.anInt395 * 15 + 22;
			}
			if (super.anInt199 > 17 && super.anInt200 > 357 && super.anInt199 < 496 && super.anInt200 < 453) {
				local70 = super.anInt199 - local7 / 2 - 17;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 479) {
					local70 = 479 - local7;
				}
				local88 = super.anInt200 - 357;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 96) {
					local88 = 96 - local20;
				}
				this.aBoolean81 = true;
				this.anInt384 = 2;
				this.anInt385 = local70;
				this.anInt386 = local88;
				this.anInt387 = local7;
				this.anInt388 = this.anInt395 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("35356, " + -288 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method148() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(25) int local25 = 0;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(32) Exception local32) {
			}
			@Pc(36) int local36;
			if (local25 == 0) {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local36] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local36);
				}
			} else {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local36] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local36 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aBoolean82 &= true;
			for (local36 = 0; local36 < 33920; local36++) {
				this.aClass1_Sub1_Sub2_Sub2_12.anIntArray208[local36] = this.aClass35_6.anIntArray231[local36];
			}
			for (@Pc(118) int local118 = 0; local118 < 33920; local118++) {
				this.aClass1_Sub1_Sub2_Sub2_13.anIntArray208[local118] = this.aClass35_7.anIntArray231[local118];
			}
			this.anIntArray87 = new int[256];
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray87[local140] = local140 * 262144;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray87[local155 + 64] = local155 * 1024 + 16711680;
			}
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray87[local174 + 128] = local174 * 4 + 16776960;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray87[local193 + 192] = 16777215;
			}
			this.anIntArray88 = new int[256];
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray88[local212] = local212 * 1024;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray88[local227 + 64] = local227 * 4 + 65280;
			}
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray88[local246 + 128] = local246 * 262144 + 65535;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray88[local265 + 192] = 16777215;
			}
			this.anIntArray89 = new int[256];
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray89[local284] = local284 * 4;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray89[local299 + 64] = local299 * 262144 + 255;
			}
			for (@Pc(318) int local318 = 0; local318 < 64; local318++) {
				this.anIntArray89[local318 + 128] = local318 * 1024 + 16711935;
			}
			for (@Pc(337) int local337 = 0; local337 < 64; local337++) {
				this.anIntArray89[local337 + 192] = 16777215;
			}
			this.anIntArray86 = new int[256];
			this.anIntArray65 = new int[32768];
			this.anIntArray66 = new int[32768];
			this.method105(null);
			this.anIntArray57 = new int[32768];
			this.anIntArray58 = new int[32768];
			this.method96(10, "Connecting to fileserver", (byte) 7);
			if (!this.aBoolean66) {
				this.aBoolean48 = true;
				this.aBoolean66 = true;
				this.method95(this, 2);
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("81768, " + true + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method92() {
		try {
			if (this.aBoolean63 || this.aBoolean42 || this.aBoolean64) {
				this.method142();
			} else {
				anInt260++;
				if (this.aBoolean82) {
					this.method212();
				} else {
					this.method204((byte) 3, false);
				}
				this.anInt408 = 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("50564, " + -97 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!y;)V")
	private void method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg2) {
		try {
			if (arg1 != 9527) {
				this.anInt413 = this.aClass1_Sub1_Sub3_4.method480();
			}
			this.method150(arg0, this.anInt343, arg2.anInt1002, arg2.anInt1001);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("24989, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method181(arg2, arg3, this.anInt320) - arg0;
				@Pc(33) int local33 = arg3 - this.anInt292;
				@Pc(38) int local38 = local28 - this.anInt293;
				@Pc(43) int local43 = arg2 - this.anInt294;
				@Pc(48) int local48 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt295];
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt295];
				if (arg1 > 0) {
					@Pc(61) int local61 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt296];
					@Pc(66) int local66 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt296];
					@Pc(76) int local76 = local43 * local61 + local33 * local66 >> 16;
					local43 = local43 * local66 - local33 * local61 >> 16;
					local33 = local76;
					@Pc(98) int local98 = local38 * local53 - local43 * local48 >> 16;
					local43 = local38 * local48 + local43 * local53 >> 16;
					if (local43 >= 50) {
						this.anInt250 = Class1_Sub1_Sub2_Sub1.anInt606 + (local33 << 9) / local43;
						this.anInt251 = Class1_Sub1_Sub2_Sub1.anInt607 + (local98 << 9) / local43;
					} else {
						this.anInt250 = -1;
						this.anInt251 = -1;
					}
				}
			} else {
				this.anInt250 = -1;
				this.anInt251 = -1;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("73195, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ab;Lclient!lb;II)V")
	private void method151(@OriginalArg(1) Class1_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(18) int local18;
			if ((arg3 & 0x1) == 1) {
				local18 = arg1.method480();
				@Pc(21) byte[] local21 = new byte[local18];
				@Pc(27) Class1_Sub1_Sub3 local27 = new Class1_Sub1_Sub3(false, local21);
				arg1.method489(local18, local21);
				this.aClass1_Sub1_Sub3Array1[arg2] = local27;
				arg0.method39(local27);
			}
			@Pc(65) int local65;
			@Pc(77) int local77;
			if ((arg3 & 0x2) == 2) {
				local18 = arg1.method482();
				if (local18 == 65535) {
					local18 = -1;
				}
				if (local18 == arg0.anInt1024) {
					arg0.anInt1028 = 0;
				}
				local65 = arg1.method480();
				if (local18 == arg0.anInt1024 && local18 != -1) {
					local77 = Class27.aClass27Array1[local18].anInt816;
					if (local77 == 1) {
						arg0.anInt1025 = 0;
						arg0.anInt1026 = 0;
						arg0.anInt1027 = local65;
						arg0.anInt1028 = 0;
					}
					if (local77 == 2) {
						arg0.anInt1028 = 0;
					}
				} else if (local18 == -1 || arg0.anInt1024 == -1 || Class27.aClass27Array1[local18].anInt810 >= Class27.aClass27Array1[arg0.anInt1024].anInt810) {
					arg0.anInt1024 = local18;
					arg0.anInt1025 = 0;
					arg0.anInt1026 = 0;
					arg0.anInt1027 = local65;
					arg0.anInt1028 = 0;
					arg0.anInt1047 = arg0.anInt1045;
				}
			}
			if ((arg3 & 0x4) == 4) {
				arg0.anInt1018 = arg1.method482();
				if (arg0.anInt1018 == 65535) {
					arg0.anInt1018 = -1;
				}
			}
			if ((arg3 & 0x8) == 8) {
				arg0.aString31 = arg1.method487();
				if (arg0.aString31.charAt(0) == '~') {
					arg0.aString31 = arg0.aString31.substring(1);
					this.method171(2, arg0.aString31, arg0.aString3);
				} else if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method171(2, arg0.aString31, arg0.aString3);
				}
				arg0.anInt1013 = 0;
				arg0.anInt1014 = 0;
				arg0.anInt1012 = 150;
			}
			if ((arg3 & 0x10) == 16) {
				local18 = arg1.method480();
				local65 = arg1.method480();
				arg0.method681(local18, local65, anInt283);
				arg0.anInt1015 = anInt283 + 300;
				arg0.anInt1016 = arg1.method480();
				arg0.anInt1017 = arg1.method480();
			}
			if ((arg3 & 0x20) == 32) {
				arg0.anInt1019 = arg1.method482();
				arg0.anInt1020 = arg1.method482();
			}
			if ((arg3 & 0x40) == 64) {
				local18 = arg1.method482();
				local65 = arg1.method480();
				local77 = arg1.method480();
				@Pc(263) int local263 = arg1.anInt757;
				if (arg0.aString3 != null && arg0.aBoolean22) {
					@Pc(273) long local273 = Class48.method667(arg0.aString3);
					@Pc(275) boolean local275 = false;
					if (local65 <= 1) {
						for (@Pc(280) int local280 = 0; local280 < this.anInt361; local280++) {
							if (this.aLongArray3[local280] == local273) {
								local275 = true;
								break;
							}
						}
					}
					if (!local275 && this.anInt267 == 0) {
						try {
							@Pc(308) String local308 = Class49.method683(arg1, local77);
							@Pc(312) String local312 = Class42.method604(local308);
							arg0.aString31 = local312;
							arg0.anInt1013 = local18 >> 8;
							arg0.anInt1014 = local18 & 0xFF;
							arg0.anInt1012 = 150;
							if (local65 == 2 || local65 == 3) {
								this.method171(1, local312, "@cr2@" + arg0.aString3);
							} else if (local65 == 1) {
								this.method171(1, local312, "@cr1@" + arg0.aString3);
							} else {
								this.method171(2, local312, arg0.aString3);
							}
						} catch (@Pc(376) Exception local376) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt757 = local263 + local77;
			}
			if ((arg3 & 0x100) == 256) {
				arg0.anInt1029 = arg1.method482();
				local18 = arg1.method485();
				arg0.anInt1033 = local18 >> 16;
				arg0.anInt1032 = anInt283 + (local18 & 0xFFFF);
				arg0.anInt1030 = 0;
				arg0.anInt1031 = 0;
				if (arg0.anInt1032 > anInt283) {
					arg0.anInt1030 = -1;
				}
				if (arg0.anInt1029 == 65535) {
					arg0.anInt1029 = -1;
				}
			}
			if ((arg3 & 0x200) == 512) {
				arg0.anInt1034 = arg1.method480();
				arg0.anInt1036 = arg1.method480();
				arg0.anInt1035 = arg1.method480();
				arg0.anInt1037 = arg1.method480();
				arg0.anInt1038 = arg1.method482() + anInt283;
				arg0.anInt1039 = arg1.method482() + anInt283;
				arg0.anInt1040 = arg1.method480();
				arg0.method679();
			}
			if ((arg3 & 0x400) == 1024) {
				local18 = arg1.method480();
				local65 = arg1.method480();
				arg0.method681(local18, local65, anInt283);
				arg0.anInt1015 = anInt283 + 300;
				arg0.anInt1016 = arg1.method480();
				arg0.anInt1017 = arg1.method480();
			}
		} catch (@Pc(500) RuntimeException local500) {
			signlink.reporterror("51395, " + -48904 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local500.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method152() {
		try {
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_2.method511(); local6 != null; local6 = (Class1_Sub2) this.aClass29_2.method513()) {
				if (local6.anInt805 == -1) {
					local6.anInt804 = 0;
					this.method104(local6);
				} else {
					local6.method673();
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("41050, " + 3 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method153() {
		try {
			if (this.anInt379 == 2) {
				this.method150(this.anInt315 * 2, this.anInt343, (this.anInt314 - this.anInt354 << 7) + this.anInt317, (this.anInt313 - this.anInt353 << 7) + this.anInt316);
				if (this.anInt250 > -1 && anInt283 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array7[2].method391(this.anInt251 - 28, this.anInt250 - 12);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("4976, " + -34858 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method154() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray57[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray57[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray58[local54] = (this.anIntArray57[local54 - 1] + this.anIntArray57[local54 + 1] + this.anIntArray57[local54 - 128] + this.anIntArray57[local54 + 128]) / 4;
				}
			}
			this.anInt362 += 128;
			if (this.anInt362 > this.anIntArray65.length) {
				this.anInt362 -= this.anIntArray65.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method105(this.aClass1_Sub1_Sub2_Sub3Array1[local48]);
			}
			@Pc(174) int local174;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local174 = local54 + (local48 << 7);
					@Pc(197) int local197 = this.anIntArray58[local174 + 128] - this.anIntArray65[local174 + this.anInt362 & this.anIntArray65.length - 1] / 5;
					if (local197 < 0) {
						local197 = 0;
					}
					this.anIntArray57[local174] = local197;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray46[local54] = this.anIntArray46[local54 + 1];
			}
			this.anIntArray46[255] = (int) (Math.sin((double) anInt283 / 14.0D) * 16.0D + Math.sin((double) anInt283 / 15.0D) * 14.0D + Math.sin((double) anInt283 / 16.0D) * 12.0D);
			if (this.anInt281 > 0) {
				this.anInt281 -= 4;
			}
			if (this.anInt282 > 0) {
				this.anInt282 -= 4;
			}
			if (this.anInt281 == 0 && this.anInt282 == 0) {
				local174 = (int) (Math.random() * 2000.0D);
				if (local174 == 0) {
					this.anInt281 = 1024;
				}
				if (local174 == 1) {
					this.anInt282 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("84549, " + false + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method155() {
		try {
			this.anInt273++;
			this.method121(true);
			this.method202(true, (byte) 7);
			this.method121(false);
			this.method202(false, (byte) 7);
			this.method224((byte) 4);
			this.method179();
			@Pc(40) int local40;
			@Pc(79) int local79;
			if (!this.aBoolean59) {
				local40 = this.anInt261;
				if (this.anInt390 / 256 > local40) {
					local40 = this.anInt390 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray91[4] + 128 > local40) {
					local40 = this.anIntArray91[4] + 128;
				}
				local79 = this.anInt262 + this.anInt218 & 0x7FF;
				this.method99(local40, this.method181(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001, this.anInt320) - 50, local40 * 3 + 600, this.anInt337, local79, this.anInt338);
			}
			if (this.aBoolean59) {
				local40 = this.method103();
			} else {
				local40 = this.method102();
			}
			local79 = this.anInt292;
			@Pc(123) int local123 = this.anInt293;
			@Pc(126) int local126 = this.anInt294;
			@Pc(129) int local129 = this.anInt295;
			@Pc(132) int local132 = this.anInt296;
			@Pc(181) int local181;
			for (@Pc(134) int local134 = 0; local134 < 5; local134++) {
				if (this.aBooleanArray4[local134]) {
					local181 = (int) (Math.random() * (double) (this.anIntArray68[local134] * 2 + 1) - (double) this.anIntArray68[local134] + Math.sin((double) this.anIntArray59[local134] * ((double) this.anIntArray35[local134] / 100.0D)) * (double) this.anIntArray91[local134]);
					if (local134 == 0) {
						this.anInt292 += local181;
					}
					if (local134 == 1) {
						this.anInt293 += local181;
					}
					if (local134 == 2) {
						this.anInt294 += local181;
					}
					if (local134 == 3) {
						this.anInt296 = this.anInt296 + local181 & 0x7FF;
					}
					if (local134 == 4) {
						this.anInt295 += local181;
						if (this.anInt295 < 128) {
							this.anInt295 = 128;
						}
						if (this.anInt295 > 383) {
							this.anInt295 = 383;
						}
					}
				}
			}
			local181 = Class1_Sub1_Sub2_Sub1.anInt610;
			Class1_Sub1_Sub1_Sub5.aBoolean117 = true;
			Class1_Sub1_Sub1_Sub5.anInt511 = 0;
			Class1_Sub1_Sub1_Sub5.anInt509 = super.anInt193 - 4;
			Class1_Sub1_Sub1_Sub5.anInt510 = super.anInt194 - 4;
			Class1_Sub1_Sub2.method437();
			this.aClass37_1.method569(this.anInt294, this.anInt292, this.anInt293, this.anInt295, local40, this.anInt296);
			this.aClass37_1.method544();
			this.method216();
			this.method153();
			this.method156(anInt383, local181);
			this.method167();
			this.aClass35_26.method525(4, 4, super.aGraphics2);
			this.anInt292 = local79;
			this.anInt293 = local123;
			this.anInt294 = local126;
			this.anInt295 = local129;
			this.anInt296 = local132;
		} catch (@Pc(320) RuntimeException local320) {
			signlink.reporterror("33918, " + -103 + ", " + local320.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == 0 && !aBoolean52) {
				@Pc(15) Class1_Sub1_Sub2_Sub3 local15;
				@Pc(23) int local23;
				@Pc(31) int local31;
				@Pc(34) byte[] local34;
				@Pc(37) byte[] local37;
				@Pc(39) int local39;
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[17] >= arg1) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local23 = local15.anInt689 * local15.anInt690 - 1;
					local31 = local15.anInt689 * this.anInt215 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray2;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray2 = local34;
					Class1_Sub1_Sub2_Sub1.method349(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[24] >= arg1) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local23 = local15.anInt689 * local15.anInt690 - 1;
					local31 = local15.anInt689 * this.anInt215 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray2;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray2 = local34;
					Class1_Sub1_Sub2_Sub1.method349(24);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[34] >= arg1) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[34];
					local23 = local15.anInt689 * local15.anInt690 - 1;
					local31 = local15.anInt689 * this.anInt215 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray2;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray2 = local34;
					Class1_Sub1_Sub2_Sub1.method349(34);
					return;
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("40990, " + arg0 + ", " + arg1 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)Ljava/lang/String;")
	private String method157() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("50598, " + 9 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method158(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method159() {
		try {
			if (this.anInt284 == 2) {
				for (@Pc(14) Class1_Sub2 local14 = (Class1_Sub2) this.aClass29_2.method511(); local14 != null; local14 = (Class1_Sub2) this.aClass29_2.method513()) {
					if (local14.anInt805 > 0) {
						local14.anInt805--;
					}
					if (local14.anInt805 != 0) {
						if (local14.anInt804 > 0) {
							local14.anInt804--;
						}
						if (local14.anInt804 == 0 && local14.anInt796 >= 1 && local14.anInt797 >= 1 && local14.anInt796 <= 102 && local14.anInt797 <= 102 && (local14.anInt801 < 0 || Class4.method72(1000, local14.anInt801, local14.anInt803))) {
							this.method133(local14.anInt802, local14.anInt801, local14.anInt796, local14.anInt803, local14.anInt794, local14.anInt797, local14.anInt795);
							local14.anInt804 = -1;
							if (local14.anInt801 == local14.anInt798 && local14.anInt798 == -1) {
								local14.method673();
							} else if (local14.anInt801 == local14.anInt798 && local14.anInt802 == local14.anInt799 && local14.anInt803 == local14.anInt800) {
								local14.method673();
							}
						}
					} else if (local14.anInt798 < 0 || Class4.method72(1000, local14.anInt798, local14.anInt800)) {
						this.method133(local14.anInt799, local14.anInt798, local14.anInt796, local14.anInt800, local14.anInt794, local14.anInt797, local14.anInt795);
						local14.method673();
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("40907, " + 1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method160(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt361; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt361--;
						this.aBoolean60 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt361; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method469(180);
						this.aClass1_Sub1_Sub3_2.method476(arg0);
						break;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("17200, " + arg0 + ", " + -14052 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method161() {
		try {
			@Pc(2) int local2 = this.anInt385;
			@Pc(5) int local5 = this.anInt386;
			@Pc(8) int local8 = this.anInt387;
			@Pc(11) int local11 = this.anInt388;
			Class1_Sub1_Sub2.method439(local2, local8, 6116423, local5, local11);
			Class1_Sub1_Sub2.method439(local2 + 1, local8 - 2, 0, local5 + 1, 16);
			Class1_Sub1_Sub2.method440(0, local2 + 1, local5 + 18, local8 - 2, local11 - 19);
			this.aClass1_Sub1_Sub2_Sub4_3.method451(local2 + 3, "Choose Option", 6116423, local5 + 14);
			@Pc(63) int local63 = super.anInt193;
			@Pc(66) int local66 = super.anInt194;
			if (this.anInt384 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt384 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt384 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt395; local85++) {
				@Pc(100) int local100 = local5 + (this.anInt395 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local100 - 13 && local66 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(this.aStringArray6[local85], local2 + 3, true, 654, local100, local102);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("92716, " + 102 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method162(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt275 >= 100 && this.anInt306 != 1) {
					this.method171(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.anInt275 >= 200) {
					this.method171(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					@Pc(38) String local38 = Class48.method671(Class48.method668(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt275; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method171(0, local38 + " is already on your friend list", "");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt361; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method171(0, "Please remove " + local38 + " from your ignore list first", "");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray3[this.anInt275] = local38;
						this.aLongArray4[this.anInt275] = arg0;
						this.anIntArray90[this.anInt275] = 0;
						this.anInt275++;
						this.aBoolean60 = true;
						this.aClass1_Sub1_Sub3_2.method469(72);
						this.aClass1_Sub1_Sub3_2.method476(arg0);
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("25093, " + arg0 + ", " + 111 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method163(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class39.aClass39Array1[arg0].anInt906;
			if (local4 != 0) {
				@Pc(17) int local17 = this.anIntArray32[arg0];
				if (local4 == 1) {
					if (local17 == 1) {
						Class1_Sub1_Sub2_Sub1.method351(0.9D);
					}
					if (local17 == 2) {
						Class1_Sub1_Sub2_Sub1.method351(0.8D);
					}
					if (local17 == 3) {
						Class1_Sub1_Sub2_Sub1.method351(0.7D);
					}
					if (local17 == 4) {
						Class1_Sub1_Sub2_Sub1.method351(0.6D);
					}
					Class15.aClass40_8.method593();
					this.aBoolean47 = true;
				}
				if (local4 == 3) {
					@Pc(55) boolean local55 = this.aBoolean44;
					if (local17 == 0) {
						this.method139(this.aBoolean44, 0);
						this.aBoolean44 = true;
					}
					if (local17 == 1) {
						this.method139(this.aBoolean44, -400);
						this.aBoolean44 = true;
					}
					if (local17 == 2) {
						this.method139(this.aBoolean44, -800);
						this.aBoolean44 = true;
					}
					if (local17 == 3) {
						this.method139(this.aBoolean44, -1200);
						this.aBoolean44 = true;
					}
					if (local17 == 4) {
						this.aBoolean44 = false;
					}
					if (this.aBoolean44 != local55 && !aBoolean52) {
						if (this.aBoolean44) {
							this.anInt319 = this.anInt393;
							this.aBoolean68 = true;
							this.aClass44_Sub1_1.method645(2, this.anInt319);
						} else {
							this.method132();
						}
						this.anInt341 = 0;
					}
				}
				if (local4 == 4) {
					if (local17 == 0) {
						this.aBoolean88 = true;
						this.method221(0);
					}
					if (local17 == 1) {
						this.aBoolean88 = true;
						this.method221(-400);
					}
					if (local17 == 2) {
						this.aBoolean88 = true;
						this.method221(-800);
					}
					if (local17 == 3) {
						this.aBoolean88 = true;
						this.method221(-1200);
					}
					if (local17 == 4) {
						this.aBoolean88 = false;
					}
				}
				if (local4 == 5) {
					this.anInt233 = local17;
				}
				if (local4 == 6) {
					this.anInt257 = local17;
				}
				if (local4 == 8) {
					this.anInt370 = local17;
					this.aBoolean53 = true;
				}
				if (local4 == 9) {
					this.anInt205 = local17;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("87417, " + -155 + ", " + arg0 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method164() {
		try {
			this.aBoolean85 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean66) {
					this.anInt352++;
					this.method154();
					this.method154();
					this.method226(595);
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
			this.aBoolean85 = false;
			this.aBoolean82 &= true;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("34480, " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method93() {
		try {
			this.aBoolean47 = true;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("38245, " + 0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method165() {
		try {
			if (this.anInt403 == 0) {
				this.aStringArray6[0] = "Cancel";
				this.anIntArray52[0] = 1106;
				this.anInt395 = 1;
				this.method170();
				this.anInt216 = 0;
				if (super.anInt193 > 4 && super.anInt194 > 4 && super.anInt193 < 516 && super.anInt194 < 338) {
					if (this.anInt254 == -1) {
						this.method112();
					} else {
						this.method143(4, 4, Class6.aClass6Array1[this.anInt254], super.anInt194, super.anInt193, 0);
					}
				}
				if (this.anInt216 != this.anInt286) {
					this.anInt286 = this.anInt216;
				}
				this.anInt216 = 0;
				if (super.anInt193 > 553 && super.anInt194 > 205 && super.anInt193 < 743 && super.anInt194 < 466) {
					if (this.anInt288 != -1) {
						this.method143(205, 553, Class6.aClass6Array1[this.anInt288], super.anInt194, super.anInt193, 0);
					} else if (this.anIntArray49[this.anInt419] != -1) {
						this.method143(205, 553, Class6.aClass6Array1[this.anIntArray49[this.anInt419]], super.anInt194, super.anInt193, 0);
					}
				}
				if (this.anInt216 != this.anInt244) {
					this.aBoolean60 = true;
					this.anInt244 = this.anInt216;
				}
				this.anInt216 = 0;
				this.anInt412 += 0;
				if (super.anInt193 > 17 && super.anInt194 > 357 && super.anInt193 < 496 && super.anInt194 < 453) {
					if (this.anInt371 != -1) {
						this.method143(357, 17, Class6.aClass6Array1[this.anInt371], super.anInt194, super.anInt193, 0);
					} else if (super.anInt194 < 434 && super.anInt193 < 426) {
						this.method100(super.anInt194 - 357, super.anInt193 - 17);
					}
				}
				if (this.anInt371 != -1 && this.anInt216 != this.anInt308) {
					this.aBoolean53 = true;
					this.anInt308 = this.anInt216;
				}
				@Pc(229) boolean local229 = false;
				while (!local229) {
					local229 = true;
					for (@Pc(235) int local235 = 0; local235 < this.anInt395 - 1; local235++) {
						if (this.anIntArray52[local235] < 1000 && this.anIntArray52[local235 + 1] > 1000) {
							@Pc(256) String local256 = this.aStringArray6[local235];
							this.aStringArray6[local235] = this.aStringArray6[local235 + 1];
							this.aStringArray6[local235 + 1] = local256;
							@Pc(278) int local278 = this.anIntArray52[local235];
							this.anIntArray52[local235] = this.anIntArray52[local235 + 1];
							this.anIntArray52[local235 + 1] = local278;
							@Pc(300) int local300 = this.anIntArray50[local235];
							this.anIntArray50[local235] = this.anIntArray50[local235 + 1];
							this.anIntArray50[local235 + 1] = local300;
							@Pc(322) int local322 = this.anIntArray51[local235];
							this.anIntArray51[local235] = this.anIntArray51[local235 + 1];
							this.anIntArray51[local235 + 1] = local322;
							@Pc(344) int local344 = this.anIntArray53[local235];
							this.anIntArray53[local235] = this.anIntArray53[local235 + 1];
							this.anIntArray53[local235 + 1] = local344;
							local229 = false;
						}
					}
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("34729, " + 0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method166(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt370 != 0) {
				@Pc(8) Class1_Sub1_Sub2_Sub4 local8 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(10) int local10 = 0;
				if (this.anInt249 != 0) {
					local10 = 1;
				}
				@Pc(29) int local29;
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray2[local17] != null) {
						local29 = this.anIntArray45[local17];
						@Pc(34) String local34 = this.aStringArray1[local17];
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
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt277 == 0 || this.anInt277 == 1 && this.method97(local34))) {
							local87 = 329 - local10 * 13;
							local8.method451(4, "From", 0, local87);
							local8.method451(4, "From", 65535, local87 - 1);
							@Pc(112) int local112 = local8.method449("From ") + 4;
							if (local36 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array3[0].method418(local87 - 12, local112);
								local112 += 14;
							}
							if (local36 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array3[1].method418(local87 - 12, local112);
								local112 += 14;
							}
							local8.method451(local112, local34 + ": " + this.aStringArray2[local17], 0, local87);
							local8.method451(local112, local34 + ": " + this.aStringArray2[local17], 65535, local87 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local29 == 5 && this.anInt277 < 2) {
							local87 = 329 - local10 * 13;
							local8.method451(4, this.aStringArray2[local17], 0, local87);
							local8.method451(4, this.aStringArray2[local17], 65535, local87 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local29 == 6 && this.anInt277 < 2) {
							local87 = 329 - local10 * 13;
							local8.method451(4, "To " + local34 + ": " + this.aStringArray2[local17], 0, local87);
							local8.method451(4, "To " + local34 + ": " + this.aStringArray2[local17], 65535, local87 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
				if (arg0 < 2 || arg0 > 2) {
					for (local29 = 1; local29 > 0; local29++) {
					}
				}
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("78418, " + arg0 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method167() {
		try {
			this.method166(this.anInt309);
			if (this.anInt223 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt222 / 100].method391(this.anInt221 - 8 - 4, this.anInt220 - 8 - 4);
			}
			if (this.anInt223 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt222 / 100 + 4].method391(this.anInt221 - 8 - 4, this.anInt220 - 8 - 4);
				anInt214++;
				if (anInt214 > 57) {
					anInt214 = 0;
					this.aClass1_Sub1_Sub3_2.method469(19);
				}
			}
			if (this.anInt410 != -1) {
				this.method175(this.anInt215, this.anInt410);
				this.method115(Class6.aClass6Array1[this.anInt410], 0, 0, 0);
			}
			if (this.anInt254 != -1) {
				this.method175(this.anInt215, this.anInt254);
				this.method115(Class6.aClass6Array1[this.anInt254], 0, 0, 0);
			}
			this.method120();
			if (!this.aBoolean81) {
				this.method165();
				this.method192(this.aBoolean77);
			} else if (this.anInt384 == 0) {
				this.method161();
			}
			if (this.anInt392 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[1].method391(296, 472);
			}
			@Pc(181) int local181;
			if (aBoolean84) {
				@Pc(157) byte local157 = 20;
				@Pc(159) int local159 = 16776960;
				if (super.anInt188 < 15) {
					local159 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446("Fps:" + super.anInt188, 20, local159);
				local181 = local157 + 15;
				@Pc(183) Runtime local183 = Runtime.getRuntime();
				@Pc(192) int local192 = (int) ((local183.totalMemory() - local183.freeMemory()) / 1024L);
				if (local192 > 33554432 && aBoolean52) {
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446("Mem:" + local192 + "k", 35, 16776960);
				local181 += 15;
			}
			if (this.anInt249 != 0) {
				@Pc(226) int local226 = this.anInt249 / 50;
				local181 = local226 / 60;
				@Pc(234) int local234 = local226 % 60;
				if (local234 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method451(4, "System update in: " + local181 + ":0" + local234, 16776960, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method451(4, "System update in: " + local181 + ":" + local234, 16776960, 329);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("48361, " + 0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZI)Z")
	private boolean method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method560(this.anInt320, arg2, arg1, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt272++;
			if (anInt272 > 1086) {
				anInt272 = 0;
				this.aClass1_Sub1_Sub3_2.method469(46);
				this.aClass1_Sub1_Sub3_2.method470(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_2.anInt757;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method471(16791);
				}
				this.aClass1_Sub1_Sub3_2.method470(254);
				this.aClass1_Sub1_Sub3_2.method471((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_2.method471(16128);
				this.aClass1_Sub1_Sub3_2.method471(52610);
				this.aClass1_Sub1_Sub3_2.method471((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_2.method471(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method471(35025);
				}
				this.aClass1_Sub1_Sub3_2.method471(46628);
				this.aClass1_Sub1_Sub3_2.method470((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt757 - local53);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(133) Class9 local133 = Class9.method288(local7);
				@Pc(141) int local141;
				@Pc(144) int local144;
				if (local31 == 0 || local31 == 2) {
					local141 = local133.anInt516;
					local144 = local133.anInt517;
				} else {
					local141 = local133.anInt517;
					local144 = local133.anInt516;
				}
				@Pc(155) int local155 = local133.anInt528;
				if (local31 != 0) {
					local155 = (local155 << local31 & 0xF) + (local155 >> 4 - local31);
				}
				this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local155, local141, 0, false, 0, arg1, 2, arg2, local144, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
			} else {
				this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, local31, false, local25 + 1, arg1, 2, arg2, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
			}
			this.anInt220 = super.anInt199;
			this.anInt221 = super.anInt200;
			this.anInt223 = 2;
			this.anInt222 = 0;
			this.aClass1_Sub1_Sub3_2.method469(arg3);
			this.aClass1_Sub1_Sub3_2.method471(arg2 + this.anInt353);
			this.aClass1_Sub1_Sub3_2.method471(arg1 + this.anInt354);
			this.aClass1_Sub1_Sub3_2.method471(local7);
			return true;
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("34050, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method169(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt305; local3++) {
				if (this.anIntArray76[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray47[local3] != this.anInt248 || this.anIntArray34[local3] != this.anInt213) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method79(this.anIntArray47[local3], this.anIntArray34[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt757 / 22) > this.aLong15 + (long) (this.anInt345 / 22)) {
								this.anInt345 = local45.anInt757;
								this.aLong15 = System.currentTimeMillis();
								if (this.method130(local45.aByteArray9, local45.anInt757)) {
									this.anInt248 = this.anIntArray47[local3];
									this.anInt213 = this.anIntArray34[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method220()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray76[local3] != -5) {
						this.anIntArray76[local3] = -5;
					} else {
						this.anInt305--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt305; local111++) {
							this.anIntArray47[local111] = this.anIntArray47[local111 + 1];
							this.anIntArray34[local111] = this.anIntArray34[local111 + 1];
							this.anIntArray76[local111] = this.anIntArray76[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray76[local3]--;
				}
			}
			if (arg0 == this.aByte9 && this.anInt341 > 0) {
				this.anInt341 -= 20;
				if (this.anInt341 < 0) {
					this.anInt341 = 0;
				}
				if (this.anInt341 == 0 && this.aBoolean44 && !aBoolean52) {
					this.anInt319 = this.anInt393;
					this.aBoolean68 = true;
					this.aClass44_Sub1_1.method645(2, this.anInt319);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("33520, " + arg0 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method170() {
		try {
			if (this.anInt370 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt249 != 0) {
					local5 = 1;
				}
				for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
					if (this.aStringArray2[local18] != null) {
						@Pc(30) int local30 = this.anIntArray45[local18];
						@Pc(35) String local35 = this.aStringArray1[local18];
						if (local35 != null && local35.startsWith("@cr1@")) {
							local35 = local35.substring(5);
						}
						if (local35 != null && local35.startsWith("@cr2@")) {
							local35 = local35.substring(5);
						}
						if ((local30 == 3 || local30 == 7) && (local30 == 7 || this.anInt277 == 0 || this.anInt277 == 1 && this.method97(local35))) {
							@Pc(88) int local88 = 329 - local5 * 13;
							if (super.anInt193 > 4 && super.anInt194 - 4 > local88 - 10 && super.anInt194 - 4 <= local88 + 3) {
								@Pc(127) int local127 = this.aClass1_Sub1_Sub2_Sub4_2.method449("From:  " + local35 + this.aStringArray2[local18]) + 25;
								if (local127 > 450) {
									local127 = 450;
								}
								if (super.anInt193 < local127 + 4) {
									if (this.anInt409 >= 1) {
										this.aStringArray6[this.anInt395] = "Report abuse @whi@" + local35;
										this.anIntArray52[this.anInt395] = 2524;
										this.anInt395++;
									}
									this.aStringArray6[this.anInt395] = "Add ignore @whi@" + local35;
									this.anIntArray52[this.anInt395] = 2047;
									this.anInt395++;
									this.aStringArray6[this.anInt395] = "Add friend @whi@" + local35;
									this.anIntArray52[this.anInt395] = 2605;
									this.anInt395++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local30 == 5 || local30 == 6) && this.anInt277 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("84680, " + 0 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
	private void method171(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt334 != -1) {
				this.aString16 = arg1;
				super.anInt198 = 0;
			}
			if (this.anInt371 == -1) {
				this.aBoolean53 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray45[local20] = this.anIntArray45[local20 - 1];
				this.aStringArray1[local20] = this.aStringArray1[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
			}
			this.anIntArray45[0] = arg0;
			this.aStringArray1[0] = arg2;
			this.aBoolean82 &= true;
			this.aStringArray2[0] = arg1;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("53290, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method172(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 4) {
				@Pc(4) boolean local4 = false;
			} else {
				this.aBoolean80 = !this.aBoolean80;
			}
			if (aBoolean52 && this.anInt284 == 2 && Class4.anInt170 != this.anInt320) {
				this.aClass35_26.method524(this.anInt253);
				this.aClass1_Sub1_Sub2_Sub4_2.method447(0, 151, 257, "Loading - please wait.");
				this.aClass1_Sub1_Sub2_Sub4_2.method447(16777215, 150, 256, "Loading - please wait.");
				this.aClass35_26.method525(4, 4, super.aGraphics2);
				this.anInt284 = 1;
				this.aLong17 = System.currentTimeMillis();
			}
			if (this.anInt284 == 1) {
				@Pc(67) int local67 = this.method173();
				if (local67 != 0 && System.currentTimeMillis() - this.aLong17 > 360000L) {
					signlink.reporterror(this.aString6 + " glcfb " + this.aLong14 + "," + local67 + "," + aBoolean52 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method646() + "," + this.anInt320 + "," + this.anInt279 + "," + this.anInt280);
					this.aLong17 = System.currentTimeMillis();
				}
			}
			if (this.anInt284 == 2 && this.anInt320 != this.anInt224) {
				this.anInt224 = this.anInt320;
				this.method225((byte) 8, this.anInt320);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("370, " + arg0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)I")
	private int method173() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray1.length; local3++) {
				if (this.aByteArrayArray1[local3] == null && this.anIntArray40[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray2[local3] == null && this.anIntArray41[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray1.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray2[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray39[local41] >> 8) * 64 - this.anInt353;
					@Pc(74) int local74 = (this.anIntArray39[local41] & 0xFF) * 64 - this.anInt354;
					local39 &= Class4.method58(local48, local62, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean61) {
				return -4;
			} else {
				this.anInt284 = 2;
				Class4.anInt170 = this.anInt320;
				this.method119();
				this.anInt412 += 0;
				this.aClass1_Sub1_Sub3_2.method469(98);
				return 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("49855, " + 0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILclient!d;IIZII)V")
	private void method174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean49) {
				this.anInt232 = 32;
			} else {
				this.anInt232 = 0;
			}
			this.aBoolean49 = false;
			if (arg1 >= arg6 && arg1 < arg6 + 16 && arg0 >= arg3 && arg0 < arg3 + 16) {
				arg2.anInt443 -= this.anInt408 * 4;
				if (arg5) {
					this.aBoolean60 = true;
					return;
				}
			} else if (arg1 >= arg6 && arg1 < arg6 + 16 && arg0 >= arg3 + arg4 - 16 && arg0 < arg3 + arg4) {
				arg2.anInt443 += this.anInt408 * 4;
				if (arg5) {
					this.aBoolean60 = true;
					return;
				}
			} else if (arg1 >= arg6 - this.anInt232 && arg1 < arg6 + this.anInt232 + 16 && arg0 >= arg3 + 16 && arg0 < arg3 + arg4 - 16 && this.anInt408 > 0) {
				@Pc(120) int local120 = (arg4 - 32) * arg4 / arg7;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(135) int local135 = arg0 - arg3 - local120 / 2 - 16;
				@Pc(141) int local141 = arg4 - local120 - 32;
				arg2.anInt443 = (arg7 - arg4) * local135 / local141;
				if (arg5) {
					this.aBoolean60 = true;
				}
				this.aBoolean49 = true;
			} else {
				return;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("75424, " + 92 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt412 += 0;
			@Pc(9) boolean local9 = false;
			@Pc(13) Class6 local13 = Class6.aClass6Array1[arg1];
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray98.length && local13.anIntArray98[local15] != -1; local15++) {
				@Pc(30) Class6 local30 = Class6.aClass6Array1[local13.anIntArray98[local15]];
				if (local30.anInt434 == 1) {
					local9 |= this.method175(arg0, local30.anInt432);
				}
				if (local30.anInt434 == 6 && (local30.anInt455 != -1 || local30.anInt456 != -1)) {
					@Pc(61) boolean local61 = this.method187(local30, this.aByte21);
					@Pc(66) int local66;
					if (local61) {
						local66 = local30.anInt456;
					} else {
						local66 = local30.anInt455;
					}
					if (local66 != -1) {
						@Pc(78) Class27 local78 = Class27.aClass27Array1[local66];
						local30.anInt431 += arg0;
						while (local30.anInt431 > local78.method506(local30.anInt430, this.anInt364)) {
							local30.anInt431 -= local78.method506(local30.anInt430, this.anInt364) + 1;
							local30.anInt430++;
							if (local30.anInt430 >= local78.anInt808) {
								local30.anInt430 -= local78.anInt809;
								if (local30.anInt430 < 0 || local30.anInt430 >= local78.anInt808) {
									local30.anInt430 = 0;
								}
							}
							local9 = true;
						}
					}
				}
			}
			return local9;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("84463, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method90() {
		try {
			if (!this.aBoolean63 && !this.aBoolean42 && !this.aBoolean64) {
				anInt283++;
				if (this.aBoolean82) {
					this.method109((byte) 5);
				} else {
					this.method182(this.anInt297);
				}
				this.method127();
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("68982, " + 249 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method176() {
		try {
			this.anInt412 += 0;
			if (super.anInt198 == 1) {
				if (super.anInt199 >= 539 && super.anInt199 <= 573 && super.anInt200 >= 169 && super.anInt200 < 205 && this.anIntArray49[0] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 0;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 569 && super.anInt199 <= 599 && super.anInt200 >= 168 && super.anInt200 < 205 && this.anIntArray49[1] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 1;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 597 && super.anInt199 <= 627 && super.anInt200 >= 168 && super.anInt200 < 205 && this.anIntArray49[2] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 2;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 625 && super.anInt199 <= 669 && super.anInt200 >= 168 && super.anInt200 < 203 && this.anIntArray49[3] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 3;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 666 && super.anInt199 <= 696 && super.anInt200 >= 168 && super.anInt200 < 205 && this.anIntArray49[4] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 4;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 694 && super.anInt199 <= 724 && super.anInt200 >= 168 && super.anInt200 < 205 && this.anIntArray49[5] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 5;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 722 && super.anInt199 <= 756 && super.anInt200 >= 169 && super.anInt200 < 205 && this.anIntArray49[6] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 6;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 540 && super.anInt199 <= 574 && super.anInt200 >= 466 && super.anInt200 < 502 && this.anIntArray49[7] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 7;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 572 && super.anInt199 <= 602 && super.anInt200 >= 466 && super.anInt200 < 503 && this.anIntArray49[8] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 8;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 599 && super.anInt199 <= 629 && super.anInt200 >= 466 && super.anInt200 < 503 && this.anIntArray49[9] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 9;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 627 && super.anInt199 <= 671 && super.anInt200 >= 467 && super.anInt200 < 502 && this.anIntArray49[10] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 10;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 669 && super.anInt199 <= 699 && super.anInt200 >= 466 && super.anInt200 < 503 && this.anIntArray49[11] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 11;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 696 && super.anInt199 <= 726 && super.anInt200 >= 466 && super.anInt200 < 503 && this.anIntArray49[12] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 12;
					this.aBoolean70 = true;
				}
				if (super.anInt199 >= 724 && super.anInt199 <= 758 && super.anInt200 >= 466 && super.anInt200 < 502 && this.anIntArray49[13] != -1) {
					this.aBoolean60 = true;
					this.anInt419 = 13;
					this.aBoolean70 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("47159, " + 0 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method178(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) Class6 local5 = Class6.aClass6Array1[arg0];
			for (@Pc(7) int local7 = 0; local7 < local5.anIntArray98.length && local5.anIntArray98[local7] != -1; local7++) {
				@Pc(22) Class6 local22 = Class6.aClass6Array1[local5.anIntArray98[local7]];
				if (local22.anInt434 == 1) {
					this.method178(local22.anInt432);
				}
				local22.anInt430 = 0;
				local22.anInt431 = 0;
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("22443, " + true + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method179() {
		try {
			for (@Pc(18) Class1_Sub1_Sub1_Sub6 local18 = (Class1_Sub1_Sub1_Sub6) this.aClass29_1.method511(); local18 != null; local18 = (Class1_Sub1_Sub1_Sub6) this.aClass29_1.method513()) {
				if (local18.anInt539 != this.anInt320 || local18.aBoolean135) {
					local18.method673();
				} else if (anInt283 >= local18.anInt538) {
					local18.method301(this.anInt215);
					if (local18.aBoolean135) {
						local18.method673();
					} else {
						this.aClass37_1.method541(0, 60, local18.anInt542, false, local18, local18.anInt539, local18.anInt541, -1, local18.anInt540);
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("5728, " + 2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method180() {
		try {
			for (@Pc(8) int local8 = -1; local8 < this.anInt238; local8++) {
				@Pc(16) int local16;
				if (local8 == -1) {
					local16 = this.anInt237;
				} else {
					local16 = this.anIntArray36[local8];
				}
				@Pc(28) Class1_Sub1_Sub1_Sub1_Sub1 local28 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
				if (local28 != null) {
					this.method206(local28, 1);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("53619, " + 336 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
	private int method181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg2 + 1;
			}
			@Pc(41) int local41 = arg1 & 0x7F;
			@Pc(45) int local45 = arg0 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray6[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray6[local21][local3 + 1][local7] * local41 >> 7;
			this.aBoolean82 &= true;
			@Pc(111) int local111 = this.anIntArrayArrayArray6[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray6[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local111 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("25550, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method182(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0 && arg0 <= 0) {
				@Pc(16) int local16;
				@Pc(23) int local23;
				if (this.anInt270 == 0) {
					local16 = super.anInt189 / 2 - 80;
					local23 = super.anInt190 / 2 + 20;
					local23 += 20;
					if (super.anInt198 == 1 && super.anInt199 >= local16 - 75 && super.anInt199 <= local16 + 75 && super.anInt200 >= local23 - 20 && super.anInt200 <= local23 + 20) {
						this.anInt270 = 3;
						this.anInt367 = 0;
					}
					local16 = super.anInt189 / 2 + 80;
					if (super.anInt198 == 1 && super.anInt199 >= local16 - 75 && super.anInt199 <= local16 + 75 && super.anInt200 >= local23 - 20 && super.anInt200 <= local23 + 20) {
						this.aString12 = "";
						this.aString13 = "Enter your username & password.";
						this.anInt270 = 2;
						this.anInt367 = 0;
					}
				} else if (this.anInt270 == 2) {
					local16 = super.anInt190 / 2 - 40;
					local16 += 30;
					local16 += 25;
					if (super.anInt198 == 1 && super.anInt200 >= local16 - 15 && super.anInt200 < local16) {
						this.anInt367 = 0;
					}
					local16 += 15;
					if (super.anInt198 == 1 && super.anInt200 >= local16 - 15 && super.anInt200 < local16) {
						this.anInt367 = 1;
					}
					local16 += 15;
					local23 = super.anInt189 / 2 - 80;
					@Pc(169) int local169 = super.anInt190 / 2 + 50;
					@Pc(170) int local170 = local169 + 20;
					if (super.anInt198 == 1 && super.anInt199 >= local23 - 75 && super.anInt199 <= local23 + 75 && super.anInt200 >= local170 - 20 && super.anInt200 <= local170 + 20) {
						this.anInt328 = 0;
						this.method189(this.aString6, this.aString7, false);
						if (this.aBoolean82) {
							return;
						}
					}
					local23 = super.anInt189 / 2 + 80;
					if (super.anInt198 == 1 && super.anInt199 >= local23 - 75 && super.anInt199 <= local23 + 75 && super.anInt200 >= local170 - 20 && super.anInt200 <= local170 + 20) {
						this.anInt270 = 0;
						this.aString6 = "";
						this.aString7 = "";
					}
					while (true) {
						while (true) {
							@Pc(260) int local260 = this.method88();
							if (local260 == -1) {
								return;
							}
							@Pc(265) boolean local265 = false;
							for (@Pc(267) int local267 = 0; local267 < aString10.length(); local267++) {
								if (local260 == aString10.charAt(local267)) {
									local265 = true;
									break;
								}
							}
							if (this.anInt367 == 0) {
								if (local260 == 8 && this.aString6.length() > 0) {
									this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
								}
								if (local260 == 9 || local260 == 10 || local260 == 13) {
									this.anInt367 = 1;
								}
								if (local265) {
									this.aString6 = this.aString6 + (char) local260;
								}
								if (this.aString6.length() > 12) {
									this.aString6 = this.aString6.substring(0, 12);
								}
							} else if (this.anInt367 == 1) {
								if (local260 == 8 && this.aString7.length() > 0) {
									this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
								}
								if (local260 == 9 || local260 == 10 || local260 == 13) {
									this.anInt367 = 0;
								}
								if (local265) {
									this.aString7 = this.aString7 + (char) local260;
								}
								if (this.aString7.length() > 20) {
									this.aString7 = this.aString7.substring(0, 20);
								}
							}
						}
					}
				} else if (this.anInt270 == 3) {
					local16 = super.anInt189 / 2;
					local23 = super.anInt190 / 2 + 50;
					@Pc(424) int local424 = local23 + 20;
					if (super.anInt198 == 1 && super.anInt199 >= local16 - 75 && super.anInt199 <= local16 + 75 && super.anInt200 >= local424 - 20 && super.anInt200 <= local424 + 20) {
						this.anInt270 = 0;
						return;
					}
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("19185, " + arg0 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method183(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt436;
			this.anInt412 += 0;
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
				this.aStringArray6[this.anInt395] = "Remove @whi@" + this.aStringArray3[local4];
				this.anIntArray52[this.anInt395] = 513;
				this.anInt395++;
				this.aStringArray6[this.anInt395] = "Message @whi@" + this.aStringArray3[local4];
				this.anIntArray52[this.anInt395] = 902;
				this.anInt395++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray6[this.anInt395] = "Remove @whi@" + arg0.aString18;
				this.anIntArray52[this.anInt395] = 884;
				this.anInt395++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("81879, " + 0 + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!lb;I)V")
	private void method184(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method491(8);
			@Pc(12) int local12;
			if (local6 < this.anInt238) {
				for (local12 = local6; local12 < this.anInt238; local12++) {
					this.anIntArray44[this.anInt252++] = this.anIntArray36[local12];
				}
			}
			if (local6 > this.anInt238) {
				signlink.reporterror(this.aString6 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt238 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray36[local12];
				@Pc(69) Class1_Sub1_Sub1_Sub1_Sub1 local69 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local64];
				@Pc(74) int local74 = arg0.method491(1);
				if (local74 == 0) {
					this.anIntArray36[this.anInt238++] = local64;
					local69.anInt1041 = anInt283;
				} else {
					@Pc(97) int local97 = arg0.method491(2);
					if (local97 == 0) {
						this.anIntArray36[this.anInt238++] = local64;
						local69.anInt1041 = anInt283;
						this.anIntArray37[this.anInt239++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray36[this.anInt238++] = local64;
							local69.anInt1041 = anInt283;
							local148 = arg0.method491(3);
							local69.method678(false, local148);
							local158 = arg0.method491(1);
							if (local158 == 1) {
								this.anIntArray37[this.anInt239++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray36[this.anInt238++] = local64;
							local69.anInt1041 = anInt283;
							local148 = arg0.method491(3);
							local69.method678(true, local148);
							local158 = arg0.method491(3);
							local69.method678(true, local158);
							@Pc(216) int local216 = arg0.method491(1);
							if (local216 == 1) {
								this.anIntArray37[this.anInt239++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray44[this.anInt252++] = local64;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("21998, " + -109 + ", " + arg0 + ", " + arg1 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method185(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean65 = true;
			this.aBoolean82 &= arg0;
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				this.anIntArray85[local12] = -1;
				for (@Pc(21) int local21 = 0; local21 < Class23.anInt764; local21++) {
					if (!Class23.aClass23Array1[local21].aBoolean187 && Class23.aClass23Array1[local21].anInt765 == local12 + (this.aBoolean41 ? 0 : 7)) {
						this.anIntArray85[local12] = local21;
						break;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("47761, " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;II)Lclient!xb;")
	private Class47 method186(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local9 = this.aClass45Array1[0].method658(arg1);
				}
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(40) int local40;
			if (local9 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local9);
				local40 = (int) this.aCRC32_1.getValue();
				if (local40 != arg4) {
					local9 = null;
				}
			}
			if (local9 != null) {
				return new Class47(local9, false);
			}
			local40 = 0;
			while (local9 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method96(arg3, "Requesting " + arg2, (byte) 7);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method199(arg0 + arg4);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class1_Sub1_Sub3 local101 = new Class1_Sub1_Sub3(false, local90);
					local101.anInt757 = 3;
					@Pc(109) int local109 = local101.method484() + 6;
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
							this.method96(arg3, "Loading " + arg2 + " - " + local174 + "%", (byte) 7);
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method659(local9.length, local9, arg1);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass45Array1[0] = null;
					}
					if (local9 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local9);
						local134 = (int) this.aCRC32_1.getValue();
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
							this.method96(arg3, "Game updated - please reload page", (byte) 7);
							local76 = 10;
						} else {
							this.method96(arg3, local61 + " - Retrying in " + local76, (byte) 7);
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
					this.aBoolean87 = !this.aBoolean87;
				}
			}
			return new Class47(local9, false);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("1620, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method187(@OriginalArg(0) Class6 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) int local7;
			if (arg1 != this.aByte10) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			if (arg0.anIntArray96 == null) {
				return false;
			}
			for (local7 = 0; local7 < arg0.anIntArray96.length; local7++) {
				@Pc(27) int local27 = this.method116(local7, arg0);
				@Pc(32) int local32 = arg0.anIntArray97[local7];
				if (arg0.anIntArray96[local7] == 2) {
					if (local27 >= local32) {
						return false;
					}
				} else if (arg0.anIntArray96[local7] == 3) {
					if (local27 <= local32) {
						return false;
					}
				} else if (arg0.anIntArray96[local7] == 4) {
					if (local27 == local32) {
						return false;
					}
				} else if (local27 != local32) {
					return false;
				}
			}
			return true;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("19352, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method188(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("12051, " + arg0 + ", " + -495 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method189(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString12 = "";
				this.aString13 = "Connecting to server...";
				this.method204((byte) 3, true);
			}
			this.aClass8_1 = new Class8(this.method228(anInt256 + 43594), (byte) 8, this);
			@Pc(30) long local30 = Class48.method667(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_2.anInt757 = 0;
			this.aClass1_Sub1_Sub3_2.method470(14);
			this.aClass1_Sub1_Sub3_2.method470(local37);
			this.aClass8_1.method251(this.aClass1_Sub1_Sub3_2.aByteArray9, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method248();
			}
			@Pc(74) int local74 = this.aClass8_1.method248();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_4.anInt757 = 0;
				this.aLong14 = this.aClass1_Sub1_Sub3_4.method486((byte) 9);
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong14 >> 32), (int) this.aLong14 };
				this.aClass1_Sub1_Sub3_2.anInt757 = 0;
				this.aClass1_Sub1_Sub3_2.method470(10);
				this.aClass1_Sub1_Sub3_2.method474(local99[0]);
				this.aClass1_Sub1_Sub3_2.method474(local99[1]);
				this.aClass1_Sub1_Sub3_2.method474(local99[2]);
				this.aClass1_Sub1_Sub3_2.method474(local99[3]);
				this.aClass1_Sub1_Sub3_2.method474(signlink.anInt953);
				this.aClass1_Sub1_Sub3_2.method477(arg0);
				this.aClass1_Sub1_Sub3_2.method477(arg1);
				this.aClass1_Sub1_Sub3_2.method495(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_3.anInt757 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_3.method470(18);
				} else {
					this.aClass1_Sub1_Sub3_3.method470(16);
				}
				this.aClass1_Sub1_Sub3_3.method470(this.aClass1_Sub1_Sub3_2.anInt757 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_3.method470(255);
				this.aClass1_Sub1_Sub3_3.method471(300);
				this.aClass1_Sub1_Sub3_3.method470(aBoolean52 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_3.method474(this.anIntArray55[local225]);
				}
				this.aClass1_Sub1_Sub3_3.method478(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt757);
				this.aClass1_Sub1_Sub3_2.aClass46_2 = new Class46((byte) -101, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass46_1 = new Class46((byte) -101, local99);
				this.aClass8_1.method251(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aClass1_Sub1_Sub3_3.anInt757);
				local74 = this.aClass8_1.method248();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method189(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt409 = this.aClass8_1.method248();
					aBoolean58 = this.aClass8_1.method248() == 1;
					this.aLong18 = 0L;
					this.anInt346 = 0;
					this.aClass11_1.anInt546 = 0;
					super.aBoolean40 = true;
					this.aBoolean74 = true;
					this.aBoolean82 = true;
					this.aClass1_Sub1_Sub3_2.anInt757 = 0;
					this.aClass1_Sub1_Sub3_4.anInt757 = 0;
					this.anInt413 = -1;
					this.anInt229 = -1;
					this.anInt230 = -1;
					this.anInt231 = -1;
					this.anInt412 = 0;
					this.anInt414 = 0;
					this.anInt249 = 0;
					this.anInt416 = 0;
					this.anInt379 = 0;
					this.anInt395 = 0;
					this.aBoolean81 = false;
					super.anInt191 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray2[local389] = null;
					}
					this.anInt329 = 0;
					this.anInt358 = 0;
					this.anInt284 = 0;
					this.anInt305 = 0;
					this.anInt245 = (int) (Math.random() * 100.0D) - 50;
					this.anInt417 = (int) (Math.random() * 110.0D) - 55;
					this.anInt218 = (int) (Math.random() * 80.0D) - 40;
					this.anInt265 = (int) (Math.random() * 120.0D) - 60;
					this.anInt396 = (int) (Math.random() * 30.0D) - 20;
					this.anInt262 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt340 = 0;
					this.anInt224 = -1;
					this.anInt420 = 0;
					this.anInt421 = 0;
					this.anInt238 = 0;
					this.anInt377 = 0;
					for (local225 = 0; local225 < this.anInt236; local225++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local259] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt237] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_3.method515();
					this.aClass29_1.method515();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass29ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass29_2 = new Class29(anInt318);
					this.anInt276 = 0;
					this.anInt275 = 0;
					this.anInt334 = -1;
					this.anInt371 = -1;
					this.anInt254 = -1;
					this.anInt288 = -1;
					this.anInt410 = -1;
					this.aBoolean62 = false;
					this.anInt419 = 3;
					this.aBoolean57 = false;
					this.aBoolean81 = false;
					this.aBoolean75 = false;
					this.aString16 = null;
					this.anInt392 = 0;
					this.anInt258 = -1;
					this.aBoolean41 = true;
					this.method185(this.aBoolean72);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray93[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray5[local538] = null;
						this.aBooleanArray3[local538] = false;
					}
					anInt335 = 0;
					anInt342 = 0;
					anInt321 = 0;
					anInt235 = 0;
					anInt225 = 0;
					anInt323 = 0;
					anInt427 = 0;
					anInt347 = 0;
					anInt368 = 0;
					this.method128(560);
				} else if (local74 == 3) {
					this.aString12 = "";
					this.aString13 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString12 = "Your account has been disabled.";
					this.aString13 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString12 = "Your account is already logged in.";
					this.aString13 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString12 = "RuneScape has been updated!";
					this.aString13 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString12 = "This world is full.";
					this.aString13 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString12 = "Unable to connect.";
					this.aString13 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString12 = "Login limit exceeded.";
					this.aString13 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString12 = "Unable to connect.";
					this.aString13 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString13 = "Login server rejected session.";
					this.aString13 = "Please try again.";
				} else if (local74 == 12) {
					this.aString12 = "You need a members account to login to this world.";
					this.aString13 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString12 = "Could not complete login.";
					this.aString13 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString12 = "The server is being updated.";
					this.aString13 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean82 = true;
					this.aClass1_Sub1_Sub3_2.anInt757 = 0;
					this.aClass1_Sub1_Sub3_4.anInt757 = 0;
					this.anInt413 = -1;
					this.anInt229 = -1;
					this.anInt230 = -1;
					this.anInt231 = -1;
					this.anInt412 = 0;
					this.anInt414 = 0;
					this.anInt249 = 0;
					this.anInt395 = 0;
					this.aBoolean81 = false;
					this.aLong17 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString12 = "Login attempts exceeded.";
					this.aString13 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString12 = "You are standing in a members-only area.";
					this.aString13 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString12 = "Invalid loginserver requested";
					this.aString13 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local389 = this.aClass8_1.method248(); local389 >= 0; local389--) {
						this.aString12 = "You have only just left another world";
						this.aString13 = "Your profile will be transferred in: " + local389 + " seconds";
						this.method204((byte) 3, true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(900) Exception local900) {
						}
					}
					this.method189(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString12 = "Unexpected server response";
					this.aString13 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString12 = "No response from server";
					this.aString13 = "Please try using a different world.";
				} else if (this.anInt328 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(922) Exception local922) {
					}
					this.anInt328++;
					this.method189(arg0, arg1, arg2);
				} else {
					this.aString12 = "No response from loginserver";
					this.aString13 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(965) IOException local965) {
			this.aString12 = "";
			this.aString13 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method190(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt361 >= 100) {
					this.method171(0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					@Pc(23) String local23 = Class48.method671(Class48.method668(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt361; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method171(0, local23 + " is already on your ignore list", "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt275; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method171(0, "Please remove " + local23 + " from your friend list first", "");
							return;
						}
					}
					this.aLongArray3[this.anInt361++] = arg0;
					this.aBoolean60 = true;
					this.aClass1_Sub1_Sub3_2.method469(131);
					this.aClass1_Sub1_Sub3_2.method476(arg0);
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("620, " + false + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method191() {
		try {
			if (this.anInt340 == 0 && super.anInt198 == 1) {
				@Pc(21) int local21 = super.anInt199 - 25 - 550;
				@Pc(28) int local28 = super.anInt200 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt262 + this.anInt265 & 0x7FF;
					@Pc(52) int local52 = Class1_Sub1_Sub2_Sub1.anIntArray178[local48];
					@Pc(56) int local56 = Class1_Sub1_Sub2_Sub1.anIntArray179[local48];
					@Pc(65) int local65 = local52 * (this.anInt396 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt396 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 + local84 >> 7;
					@Pc(108) int local108 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 - local94 >> 7;
					@Pc(129) boolean local129 = this.method203(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, true, 0, local108, 1, local101, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
					if (local129) {
						this.aClass1_Sub1_Sub3_2.method470(local21);
						this.aClass1_Sub1_Sub3_2.method470(local28);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt262);
						this.aClass1_Sub1_Sub3_2.method470(57);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt265);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt396);
						this.aClass1_Sub1_Sub3_2.method470(89);
						this.aClass1_Sub1_Sub3_2.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001);
						this.aClass1_Sub1_Sub3_2.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt372);
						this.aClass1_Sub1_Sub3_2.method470(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("83651, " + false + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method192(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt395 >= 2 || this.anInt329 != 0 || this.anInt358 != 0) {
				@Pc(31) String local31;
				if (this.anInt329 == 1 && this.anInt395 < 2) {
					local31 = "Use " + this.aString11 + " with...";
				} else if (this.anInt358 == 1 && this.anInt395 < 2) {
					local31 = this.aString15 + "...";
				} else {
					local31 = this.aStringArray6[this.anInt395 - 1];
				}
				if (this.anInt395 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt395 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method456(anInt283 / 1000, 16777215, 15, local31, 4);
				if (arg0) {
					this.aClass29ArrayArrayArray1 = null;
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("3128, " + arg0 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Z")
	private boolean method193(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(3) int local3;
			if (arg1) {
				for (local3 = 1; local3 > 0; local3++) {
				}
			}
			if (arg0 < 0) {
				return false;
			}
			local3 = this.anIntArray52[arg0];
			if (local3 >= 2000) {
				local3 -= 2000;
			}
			return local3 == 605;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("94091, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lb;II)V")
	private void method194(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt239; local7++) {
				@Pc(14) int local14 = this.anIntArray37[local7];
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub1 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local14];
				@Pc(22) int local22 = arg0.method480();
				if ((local22 & 0x80) == 128) {
					local22 += arg0.method480() << 8;
				}
				this.method151(local19, arg0, local14, local22);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("75594, " + arg0 + ", " + arg1 + ", " + -66 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BZ)V")
	private void method195(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt959 = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("90246, " + 22 + ", " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method196(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.method89();
			}
			try {
				@Pc(13) int local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 + this.anInt245;
				@Pc(19) int local19 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 + this.anInt417;
				if (this.anInt337 - local13 < -500 || this.anInt337 - local13 > 500 || this.anInt338 - local19 < -500 || this.anInt338 - local19 > 500) {
					this.anInt337 = local13;
					this.anInt338 = local19;
				}
				if (this.anInt337 != local13) {
					this.anInt337 += (local13 - this.anInt337) / 16;
				}
				if (this.anInt338 != local19) {
					this.anInt338 += (local19 - this.anInt338) / 16;
				}
				if (super.anIntArray30[1] == 1) {
					this.anInt263 += (-this.anInt263 - 24) / 2;
				} else if (super.anIntArray30[2] == 1) {
					this.anInt263 += (24 - this.anInt263) / 2;
				} else {
					this.anInt263 /= 2;
				}
				if (super.anIntArray30[3] == 1) {
					this.anInt264 += (12 - this.anInt264) / 2;
				} else if (super.anIntArray30[4] == 1) {
					this.anInt264 += (-this.anInt264 - 12) / 2;
				} else {
					this.anInt264 /= 2;
				}
				this.anInt262 = this.anInt262 + this.anInt263 / 2 & 0x7FF;
				this.anInt261 += this.anInt264 / 2;
				if (this.anInt261 < 128) {
					this.anInt261 = 128;
				}
				if (this.anInt261 > 383) {
					this.anInt261 = 383;
				}
				@Pc(206) int local206 = this.anInt337 >> 7;
				@Pc(211) int local211 = this.anInt338 >> 7;
				@Pc(221) int local221 = this.method181(this.anInt338, this.anInt337, this.anInt320);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt320;
							if (local250 < 3 && (this.aByteArrayArrayArray7[1][local239][local245] & 0x2) == 2) {
								local250++;
							}
							@Pc(277) int local277 = local221 - this.anIntArrayArrayArray6[local250][local239][local245];
							if (local277 > local223) {
								local223 = local277;
							}
						}
					}
				}
				local239 = local223 * 192;
				if (local239 > 98048) {
					local239 = 98048;
				}
				if (local239 < 32768) {
					local239 = 32768;
				}
				if (local239 > this.anInt390) {
					this.anInt390 += (local239 - this.anInt390) / 24;
				} else if (local239 < this.anInt390) {
					this.anInt390 += (local239 - this.anInt390) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 + "," + this.anInt337 + "," + this.anInt338 + "," + this.anInt279 + "," + this.anInt280 + "," + this.anInt353 + "," + this.anInt354);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("27432, " + arg0 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method197() {
		try {
			this.aClass35_24.method524(this.anInt253);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray82;
			this.aClass1_Sub1_Sub2_Sub3_10.method418(0, 0);
			if (this.anInt288 != -1) {
				this.method115(Class6.aClass6Array1[this.anInt288], 0, 0, 0);
			} else if (this.anIntArray49[this.anInt419] != -1) {
				this.method115(Class6.aClass6Array1[this.anIntArray49[this.anInt419]], 0, 0, 0);
			}
			if (this.aBoolean81 && this.anInt384 == 1) {
				this.method161();
			}
			this.aClass35_24.method525(205, 553, super.aGraphics2);
			this.aClass35_26.method524(this.anInt253);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray83;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("22993, " + 5 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)Z")
	private boolean method198() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(2420) String local2420;
			@Pc(175) int local175;
			try {
				@Pc(17) int local17 = this.aClass8_1.method249();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt413 == -1) {
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt413 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt413 = this.anInt413 - this.aClass46_1.method662() & 0xFF;
					}
					this.anInt412 = Class17.anIntArray210[this.anInt413];
					local17--;
				}
				if (this.anInt412 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt412 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					local17--;
				}
				if (this.anInt412 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_4.anInt757 = 0;
					this.anInt412 = this.aClass1_Sub1_Sub3_4.method482();
					local17 -= 2;
				}
				if (local17 < this.anInt412) {
					return false;
				}
				this.aClass1_Sub1_Sub3_4.anInt757 = 0;
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, this.anInt412);
				this.anInt414 = 0;
				this.anInt231 = this.anInt230;
				this.anInt230 = this.anInt229;
				this.anInt229 = this.anInt413;
				@Pc(170) int local170;
				if (this.anInt413 == 242) {
					this.anInt211 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt212 = this.aClass1_Sub1_Sub3_4.method480();
					for (local170 = this.anInt211; local170 < this.anInt211 + 8; local170++) {
						for (local175 = this.anInt212; local175 < this.anInt212 + 8; local175++) {
							if (this.aClass29ArrayArrayArray1[this.anInt320][local170][local175] != null) {
								this.aClass29ArrayArrayArray1[this.anInt320][local170][local175] = null;
								this.method138(local170, local175);
							}
						}
					}
					for (@Pc(220) Class1_Sub2 local220 = (Class1_Sub2) this.aClass29_2.method511(); local220 != null; local220 = (Class1_Sub2) this.aClass29_2.method513()) {
						if (local220.anInt796 >= this.anInt211 && local220.anInt796 < this.anInt211 + 8 && local220.anInt797 >= this.anInt212 && local220.anInt797 < this.anInt212 + 8 && local220.anInt794 == this.anInt320) {
							local220.anInt805 = 0;
						}
					}
					this.anInt413 = -1;
					return true;
				}
				@Pc(279) String local279;
				if (this.anInt413 == 185) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local279 = this.aClass1_Sub1_Sub3_4.method487();
					Class6.aClass6Array1[local170].aString18 = local279;
					if (Class6.aClass6Array1[local170].anInt433 == this.anIntArray49[this.anInt419]) {
						this.aBoolean60 = true;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 213) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local170].anInt451 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local170].anInt452 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[1];
					} else {
						Class6.aClass6Array1[local170].anInt452 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 122) {
					this.method129(this.aClass1_Sub1_Sub3_4, this.anInt412, this.aByte8);
					this.aBoolean61 = false;
					this.anInt413 = -1;
					return true;
				}
				@Pc(414) int local414;
				if (this.anInt413 == 116) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method480();
					local414 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.aBoolean88 && !aBoolean52 && this.anInt305 < 50) {
						this.anIntArray47[this.anInt305] = local170;
						this.anIntArray34[this.anInt305] = local175;
						this.anIntArray76[this.anInt305] = local414 + Class5.anIntArray29[local170];
						this.anInt305++;
					}
					this.anInt413 = -1;
					return true;
				}
				@Pc(472) Class6 local472;
				if (this.anInt413 == 167) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method483();
					local472 = Class6.aClass6Array1[local170];
					local472.anInt455 = local175;
					if (local175 == -1) {
						local472.anInt430 = 0;
						local472.anInt431 = 0;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 214) {
					if (this.anInt419 == 12) {
						this.aBoolean60 = true;
					}
					this.anInt268 = this.aClass1_Sub1_Sub3_4.method483();
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 44) {
					this.anInt407 = this.aClass1_Sub1_Sub3_4.method485();
					this.anInt382 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt312 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt326 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt234 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt407 != 0 && this.anInt254 == -1) {
						signlink.dnslookup(Class48.method670(this.anInt407));
						this.method125();
						@Pc(556) short local556 = 650;
						if (this.anInt312 != 201 || this.anInt234 == 1) {
							local556 = 655;
						}
						this.aString9 = "";
						this.aBoolean86 = false;
						for (local175 = 0; local175 < Class6.aClass6Array1.length; local175++) {
							if (Class6.aClass6Array1[local175] != null && Class6.aClass6Array1[local175].anInt436 == local556) {
								this.anInt254 = Class6.aClass6Array1[local175].anInt433;
								break;
							}
						}
					}
					this.anInt413 = -1;
					return true;
				}
				@Pc(628) int local628;
				@Pc(632) int local632;
				if (this.anInt413 == 236) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					local414 = local175 >> 10 & 0x1F;
					local628 = local175 >> 5 & 0x1F;
					local632 = local175 & 0x1F;
					Class6.aClass6Array1[local170].anInt447 = (local414 << 19) + (local628 << 11) + (local632 << 3);
					this.anInt413 = -1;
					return true;
				}
				@Pc(667) Class6 local667;
				if (this.anInt413 == 235) {
					this.aBoolean60 = true;
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local667 = Class6.aClass6Array1[local170];
					local414 = this.aClass1_Sub1_Sub3_4.method482();
					for (local628 = 0; local628 < local414; local628++) {
						local667.anIntArray94[local628] = this.aClass1_Sub1_Sub3_4.method482();
						local632 = this.aClass1_Sub1_Sub3_4.method480();
						if (local632 == 255) {
							local632 = this.aClass1_Sub1_Sub3_4.method485();
						}
						local667.anIntArray95[local628] = local632;
					}
					for (local632 = local414; local632 < local667.anIntArray94.length; local632++) {
						local667.anIntArray94[local632] = 0;
						local667.anIntArray95[local632] = 0;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 217) {
					this.aBoolean60 = true;
					local170 = this.aClass1_Sub1_Sub3_4.method480();
					local175 = this.aClass1_Sub1_Sub3_4.method485();
					local414 = this.aClass1_Sub1_Sub3_4.method480();
					this.anIntArray78[local170] = local175;
					this.anIntArray62[local170] = local414;
					this.anIntArray84[local170] = 1;
					for (local628 = 0; local628 < 98; local628++) {
						if (local175 >= anIntArray56[local628]) {
							this.anIntArray84[local170] = local628 + 2;
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 107) {
					local170 = this.aClass1_Sub1_Sub3_4.method483();
					this.anInt334 = local170;
					this.aBoolean53 = true;
					this.anInt413 = -1;
					return true;
				}
				@Pc(928) int local928;
				@Pc(961) int local961;
				@Pc(814) long local814;
				if (this.anInt413 == 18) {
					local814 = this.aClass1_Sub1_Sub3_4.method486((byte) 9);
					local414 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(824) String local824 = Class48.method671(Class48.method668(local814));
					for (local632 = 0; local632 < this.anInt275; local632++) {
						if (local814 == this.aLongArray4[local632]) {
							if (this.anIntArray90[local632] != local414) {
								this.anIntArray90[local632] = local414;
								this.aBoolean60 = true;
								if (local414 > 0) {
									this.method171(5, local824 + " has logged in.", "");
								}
								if (local414 == 0) {
									this.method171(5, local824 + " has logged out.", "");
								}
							}
							local824 = null;
							break;
						}
					}
					if (local824 != null && this.anInt275 < 200) {
						this.aLongArray4[this.anInt275] = local814;
						this.aStringArray3[this.anInt275] = local824;
						this.anIntArray90[this.anInt275] = local414;
						this.anInt275++;
						this.aBoolean60 = true;
					}
					@Pc(922) boolean local922 = false;
					while (!local922) {
						local922 = true;
						for (local928 = 0; local928 < this.anInt275 - 1; local928++) {
							if (this.anIntArray90[local928] != anInt255 && this.anIntArray90[local928 + 1] == anInt255 || this.anIntArray90[local928] == 0 && this.anIntArray90[local928 + 1] != 0) {
								local961 = this.anIntArray90[local928];
								this.anIntArray90[local928] = this.anIntArray90[local928 + 1];
								this.anIntArray90[local928 + 1] = local961;
								@Pc(983) String local983 = this.aStringArray3[local928];
								this.aStringArray3[local928] = this.aStringArray3[local928 + 1];
								this.aStringArray3[local928 + 1] = local983;
								@Pc(1005) long local1005 = this.aLongArray4[local928];
								this.aLongArray4[local928] = this.aLongArray4[local928 + 1];
								this.aLongArray4[local928 + 1] = local1005;
								this.aBoolean60 = true;
								local922 = false;
							}
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 127) {
					this.aBoolean59 = false;
					for (local170 = 0; local170 < 5; local170++) {
						this.aBooleanArray4[local170] = false;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 27) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local170].anInt451 = 1;
					Class6.aClass6Array1[local170].anInt452 = local175;
					this.anInt413 = -1;
					return true;
				}
				@Pc(1169) int local1169;
				if (this.anInt413 == 124) {
					this.aBoolean59 = true;
					this.anInt206 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt207 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt208 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt209 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt210 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt210 >= 100) {
						local170 = this.anInt206 * 128 + 64;
						local175 = this.anInt207 * 128 + 64;
						local414 = this.method181(local175, local170, this.anInt320) - this.anInt208;
						local628 = local170 - this.anInt292;
						local632 = local414 - this.anInt293;
						local1169 = local175 - this.anInt294;
						local928 = (int) Math.sqrt((double) (local628 * local628 + local1169 * local1169));
						this.anInt295 = (int) (Math.atan2((double) local632, (double) local928) * 325.949D) & 0x7FF;
						this.anInt296 = (int) (Math.atan2((double) local628, (double) local1169) * -325.949D) & 0x7FF;
						if (this.anInt295 < 128) {
							this.anInt295 = 128;
						}
						if (this.anInt295 > 383) {
							this.anInt295 = 383;
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 89) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method483();
					local414 = this.aClass1_Sub1_Sub3_4.method483();
					@Pc(1243) Class6 local1243 = Class6.aClass6Array1[local170];
					local1243.anInt439 = local175;
					local1243.anInt440 = local414;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 22) {
					this.anInt247 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt306 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 239 || this.anInt413 == 74) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					this.aBoolean55 = false;
					if (this.anInt413 == 74) {
						this.aClass1_Sub1_Sub3_4.method490();
						local414 = 0;
						while (true) {
							if (local414 >= 4) {
								this.aClass1_Sub1_Sub3_4.method492();
								this.aBoolean55 = true;
								break;
							}
							for (local628 = 0; local628 < 13; local628++) {
								for (local632 = 0; local632 < 13; local632++) {
									local1169 = this.aClass1_Sub1_Sub3_4.method491(1);
									if (local1169 == 1) {
										this.anIntArrayArrayArray5[local414][local628][local632] = this.aClass1_Sub1_Sub3_4.method491(26);
									} else {
										this.anIntArrayArrayArray5[local414][local628][local632] = -1;
									}
								}
							}
							local414++;
						}
					}
					if (this.anInt279 == local170 && this.anInt280 == local175 && this.anInt284 == 2) {
						this.anInt413 = -1;
						return true;
					}
					this.anInt279 = local170;
					this.anInt280 = local175;
					this.anInt353 = (this.anInt279 - 6) * 8;
					this.anInt354 = (this.anInt280 - 6) * 8;
					this.aBoolean79 = false;
					if ((this.anInt279 / 8 == 48 || this.anInt279 / 8 == 49) && this.anInt280 / 8 == 48) {
						this.aBoolean79 = true;
					}
					if (this.anInt279 / 8 == 48 && this.anInt280 / 8 == 148) {
						this.aBoolean79 = true;
					}
					this.anInt284 = 1;
					this.aLong17 = System.currentTimeMillis();
					this.aClass35_26.method524(this.anInt253);
					this.aClass1_Sub1_Sub2_Sub4_2.method447(0, 151, 257, "Loading - please wait.");
					this.aClass1_Sub1_Sub2_Sub4_2.method447(16777215, 150, 256, "Loading - please wait.");
					this.aClass35_26.method525(4, 4, super.aGraphics2);
					if (this.anInt413 == 239) {
						local414 = 0;
						local628 = (this.anInt279 - 6) / 8;
						label1063: while (true) {
							if (local628 > (this.anInt279 + 6) / 8) {
								this.aByteArrayArray1 = new byte[local414][];
								this.aByteArrayArray2 = new byte[local414][];
								this.anIntArray39 = new int[local414];
								this.anIntArray40 = new int[local414];
								this.anIntArray41 = new int[local414];
								local414 = 0;
								local632 = (this.anInt279 - 6) / 8;
								while (true) {
									if (local632 > (this.anInt279 + 6) / 8) {
										break label1063;
									}
									for (local1169 = (this.anInt280 - 6) / 8; local1169 <= (this.anInt280 + 6) / 8; local1169++) {
										this.anIntArray39[local414] = (local632 << 8) + local1169;
										if (this.aBoolean79 && (local1169 == 49 || local1169 == 149 || local1169 == 147 || local632 == 50 || local632 == 49 && local1169 == 47)) {
											this.anIntArray40[local414] = -1;
											this.anIntArray41[local414] = -1;
											local414++;
										} else {
											local928 = this.anIntArray40[local414] = this.aClass44_Sub1_1.method640(0, local632, local1169, anInt365);
											if (local928 != -1) {
												this.aClass44_Sub1_1.method645(3, local928);
											}
											local961 = this.anIntArray41[local414] = this.aClass44_Sub1_1.method640(1, local632, local1169, anInt365);
											if (local961 != -1) {
												this.aClass44_Sub1_1.method645(3, local961);
											}
											local414++;
										}
									}
									local632++;
								}
							}
							for (local632 = (this.anInt280 - 6) / 8; local632 <= (this.anInt280 + 6) / 8; local632++) {
								local414++;
							}
							local628++;
						}
					}
					local414 = this.anInt353 - this.anInt355;
					local628 = this.anInt354 - this.anInt356;
					this.anInt355 = this.anInt353;
					this.anInt356 = this.anInt354;
					for (local632 = 0; local632 < 16384; local632++) {
						@Pc(1693) Class1_Sub1_Sub1_Sub1_Sub2 local1693 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local632];
						if (local1693 != null) {
							for (local928 = 0; local928 < 10; local928++) {
								local1693.anIntArray272[local928] -= local414;
								local1693.anIntArray273[local928] -= local628;
							}
							local1693.anInt1001 -= local414 * 128;
							local1693.anInt1002 -= local628 * 128;
						}
					}
					for (local1169 = 0; local1169 < this.anInt236; local1169++) {
						@Pc(1748) Class1_Sub1_Sub1_Sub1_Sub1 local1748 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1169];
						if (local1748 != null) {
							for (local961 = 0; local961 < 10; local961++) {
								local1748.anIntArray272[local961] -= local414;
								local1748.anIntArray273[local961] -= local628;
							}
							local1748.anInt1001 -= local414 * 128;
							local1748.anInt1002 -= local628 * 128;
						}
					}
					this.aBoolean61 = true;
					@Pc(1800) byte local1800 = 0;
					@Pc(1802) byte local1802 = 104;
					@Pc(1804) byte local1804 = 1;
					if (local414 < 0) {
						local1800 = 103;
						local1802 = -1;
						local1804 = -1;
					}
					@Pc(1814) byte local1814 = 0;
					@Pc(1816) byte local1816 = 104;
					@Pc(1818) byte local1818 = 1;
					if (local628 < 0) {
						local1814 = 103;
						local1816 = -1;
						local1818 = -1;
					}
					for (@Pc(1828) int local1828 = local1800; local1828 != local1802; local1828 += local1804) {
						for (@Pc(1832) int local1832 = local1814; local1832 != local1816; local1832 += local1818) {
							@Pc(1838) int local1838 = local1828 + local414;
							@Pc(1842) int local1842 = local1832 + local628;
							for (@Pc(1844) int local1844 = 0; local1844 < 4; local1844++) {
								if (local1838 >= 0 && local1842 >= 0 && local1838 < 104 && local1842 < 104) {
									this.aClass29ArrayArrayArray1[local1844][local1828][local1832] = this.aClass29ArrayArrayArray1[local1844][local1838][local1842];
								} else {
									this.aClass29ArrayArrayArray1[local1844][local1828][local1832] = null;
								}
							}
						}
					}
					for (@Pc(1906) Class1_Sub2 local1906 = (Class1_Sub2) this.aClass29_2.method511(); local1906 != null; local1906 = (Class1_Sub2) this.aClass29_2.method513()) {
						local1906.anInt796 -= local414;
						local1906.anInt797 -= local628;
						if (local1906.anInt796 < 0 || local1906.anInt797 < 0 || local1906.anInt796 >= 104 || local1906.anInt797 >= 104) {
							local1906.method673();
						}
					}
					if (this.anInt420 != 0) {
						this.anInt420 -= local414;
						this.anInt421 -= local628;
					}
					this.aBoolean59 = false;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 109) {
					this.anInt211 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt212 = this.aClass1_Sub1_Sub3_4.method480();
					while (this.aClass1_Sub1_Sub3_4.anInt757 < this.anInt412) {
						local170 = this.aClass1_Sub1_Sub3_4.method480();
						this.method108(local170, this.aClass1_Sub1_Sub3_4);
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 31) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					if (local170 == 65535) {
						local170 = -1;
					}
					if (local170 != this.anInt393 && this.aBoolean44 && !aBoolean52 && this.anInt341 == 0) {
						this.anInt319 = local170;
						this.aBoolean68 = true;
						this.aClass44_Sub1_1.method645(2, this.anInt319);
					}
					this.anInt393 = local170;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 218) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.aBoolean44 && !aBoolean52) {
						this.anInt319 = local170;
						this.aBoolean68 = false;
						this.aClass44_Sub1_1.method645(2, this.anInt319);
						this.anInt341 = local175;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 139) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local170].anInt451 = 2;
					Class6.aClass6Array1[local170].anInt452 = local175;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 24) {
					local170 = this.aClass1_Sub1_Sub3_4.method480();
					local175 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(2129) String local2129 = this.aClass1_Sub1_Sub3_4.method487();
					if (local170 >= 1 && local170 <= 5) {
						if (local2129.equalsIgnoreCase("null")) {
							local2129 = null;
						}
						this.aStringArray5[local170 - 1] = local2129;
						this.aBooleanArray3[local170 - 1] = local175 == 0;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 132) {
					local170 = this.aClass1_Sub1_Sub3_4.method483();
					if (local170 >= 0) {
						this.method178(local170);
					}
					this.anInt410 = local170;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 58) {
					this.method200(this.aClass1_Sub1_Sub3_4, this.anInt412);
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 162) {
					this.anInt340 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 169) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					@Pc(2228) byte local2228 = this.aClass1_Sub1_Sub3_4.method481();
					this.anIntArray42[local170] = local2228;
					if (this.anIntArray32[local170] != local2228) {
						this.anIntArray32[local170] = local2228;
						this.method163(local170);
						this.aBoolean60 = true;
						if (this.anInt334 != -1) {
							this.aBoolean53 = true;
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 148) {
					for (local170 = 0; local170 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local170++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local170] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local170].anInt1024 = -1;
						}
					}
					for (local175 = 0; local175 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local175++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local175] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local175].anInt1024 = -1;
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 19 || this.anInt413 == 197 || this.anInt413 == 35 || this.anInt413 == 14 || this.anInt413 == 45 || this.anInt413 == 192 || this.anInt413 == 76 || this.anInt413 == 7 || this.anInt413 == 188 || this.anInt413 == 237 || this.anInt413 == 142) {
					this.method108(this.anInt413, this.aClass1_Sub1_Sub3_4);
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 120) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					this.method178(local170);
					if (this.anInt288 != -1) {
						this.anInt288 = -1;
						this.aBoolean60 = true;
						this.aBoolean70 = true;
					}
					this.anInt371 = local170;
					this.aBoolean53 = true;
					this.anInt254 = -1;
					this.aBoolean62 = false;
					this.anInt413 = -1;
					return true;
				}
				@Pc(2436) boolean local2436;
				@Pc(2571) String local2571;
				if (this.anInt413 == 244) {
					local2420 = this.aClass1_Sub1_Sub3_4.method487();
					@Pc(2434) long local2434;
					if (local2420.endsWith(":tradereq:")) {
						local279 = local2420.substring(0, local2420.indexOf(":"));
						local2434 = Class48.method667(local279);
						local2436 = false;
						for (local1169 = 0; local1169 < this.anInt361; local1169++) {
							if (this.aLongArray3[local1169] == local2434) {
								local2436 = true;
								break;
							}
						}
						if (!local2436 && this.anInt267 == 0) {
							this.method171(4, "wishes to trade with you.", local279);
						}
					} else if (local2420.endsWith(":duelreq:")) {
						local279 = local2420.substring(0, local2420.indexOf(":"));
						local2434 = Class48.method667(local279);
						local2436 = false;
						for (local1169 = 0; local1169 < this.anInt361; local1169++) {
							if (this.aLongArray3[local1169] == local2434) {
								local2436 = true;
								break;
							}
						}
						if (!local2436 && this.anInt267 == 0) {
							this.method171(8, "wishes to duel with you.", local279);
						}
					} else if (local2420.endsWith(":chalreq:")) {
						local279 = local2420.substring(0, local2420.indexOf(":"));
						local2434 = Class48.method667(local279);
						local2436 = false;
						for (local1169 = 0; local1169 < this.anInt361; local1169++) {
							if (this.aLongArray3[local1169] == local2434) {
								local2436 = true;
								break;
							}
						}
						if (!local2436 && this.anInt267 == 0) {
							local2571 = local2420.substring(local2420.indexOf(":") + 1, local2420.length() - 9);
							this.method171(8, local2571, local279);
						}
					} else {
						this.method171(0, local2420, "");
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 34) {
					this.anInt420 = 0;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 101) {
					this.anInt361 = this.anInt412 / 8;
					for (local170 = 0; local170 < this.anInt361; local170++) {
						this.aLongArray3[local170] = this.aClass1_Sub1_Sub3_4.method486((byte) 9);
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 66) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					this.method178(local170);
					if (this.anInt371 != -1) {
						this.anInt371 = -1;
						this.aBoolean53 = true;
					}
					if (this.aBoolean57) {
						this.aBoolean57 = false;
						this.aBoolean53 = true;
					}
					this.anInt288 = local170;
					this.aBoolean60 = true;
					this.aBoolean70 = true;
					this.anInt254 = -1;
					this.aBoolean62 = false;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 229) {
					this.method136();
					this.anInt413 = -1;
					return false;
				}
				if (this.anInt413 == 69) {
					local814 = this.aClass1_Sub1_Sub3_4.method486((byte) 9);
					local414 = this.aClass1_Sub1_Sub3_4.method485();
					local628 = this.aClass1_Sub1_Sub3_4.method480();
					local2436 = false;
					for (local1169 = 0; local1169 < 100; local1169++) {
						if (this.anIntArray54[local1169] == local414) {
							local2436 = true;
							break;
						}
					}
					if (local628 <= 1) {
						for (local928 = 0; local928 < this.anInt361; local928++) {
							if (this.aLongArray3[local928] == local814) {
								local2436 = true;
								break;
							}
						}
					}
					if (!local2436 && this.anInt267 == 0) {
						try {
							this.anIntArray54[this.anInt204] = local414;
							this.anInt204 = (this.anInt204 + 1) % 100;
							local2571 = Class49.method683(this.aClass1_Sub1_Sub3_4, this.anInt412 - 13);
							if (local628 != 3) {
								local2571 = Class42.method604(local2571);
							}
							if (local628 == 2 || local628 == 3) {
								this.method171(7, local2571, "@cr2@" + Class48.method671(Class48.method668(local814)));
							} else if (local628 == 1) {
								this.method171(7, local2571, "@cr1@" + Class48.method671(Class48.method668(local814)));
							} else {
								this.method171(3, local2571, Class48.method671(Class48.method668(local814)));
							}
						} catch (@Pc(2849) Exception local2849) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 176) {
					this.anInt249 = this.aClass1_Sub1_Sub3_4.method482() * 30;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 156) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method480();
					if (local170 == 65535) {
						local170 = -1;
					}
					this.anIntArray49[local175] = local170;
					this.aBoolean60 = true;
					this.aBoolean70 = true;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 224) {
					this.anInt276 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean60 = true;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 42) {
					this.aBoolean75 = false;
					this.aBoolean57 = true;
					this.aString8 = "";
					this.aBoolean53 = true;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 195) {
					if (this.anInt288 != -1) {
						this.anInt288 = -1;
						this.aBoolean60 = true;
						this.aBoolean70 = true;
					}
					if (this.anInt371 != -1) {
						this.anInt371 = -1;
						this.aBoolean53 = true;
					}
					if (this.aBoolean57) {
						this.aBoolean57 = false;
						this.aBoolean53 = true;
					}
					this.anInt254 = -1;
					this.aBoolean62 = false;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 228) {
					this.anInt211 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt212 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 221) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method485();
					this.anIntArray42[local170] = local175;
					if (this.anIntArray32[local170] != local175) {
						this.anIntArray32[local170] = local175;
						this.method163(local170);
						this.aBoolean60 = true;
						if (this.anInt334 != -1) {
							this.aBoolean53 = true;
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 111) {
					this.anInt419 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean60 = true;
					this.aBoolean70 = true;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 180) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					@Pc(3094) boolean local3094 = this.aClass1_Sub1_Sub3_4.method480() == 1;
					Class6.aClass6Array1[local170].aBoolean92 = local3094;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 36) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					local414 = this.aClass1_Sub1_Sub3_4.method482();
					local628 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local170].anInt458 = local175;
					Class6.aClass6Array1[local170].anInt459 = local414;
					Class6.aClass6Array1[local170].anInt457 = local628;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 159) {
					this.anInt392 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 249) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					local472 = Class6.aClass6Array1[local170];
					if (local472 != null && local472.anInt434 == 0) {
						if (local175 < 0) {
							local175 = 0;
						}
						if (local175 > local472.anInt442 - local472.anInt438) {
							local175 = local472.anInt442 - local472.anInt438;
						}
						local472.anInt443 = local175;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 234) {
					local170 = this.aClass1_Sub1_Sub3_4.method480();
					local175 = this.aClass1_Sub1_Sub3_4.method480();
					local414 = this.aClass1_Sub1_Sub3_4.method480();
					local628 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBooleanArray4[local170] = true;
					this.anIntArray68[local170] = local175;
					this.anIntArray91[local170] = local414;
					this.anIntArray35[local170] = local628;
					this.anIntArray59[local170] = 0;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 179) {
					this.anInt376 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt277 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt325 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean46 = true;
					this.aBoolean53 = true;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 16) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					this.method178(local170);
					if (this.anInt288 != -1) {
						this.anInt288 = -1;
						this.aBoolean60 = true;
						this.aBoolean70 = true;
					}
					if (this.anInt371 != -1) {
						this.anInt371 = -1;
						this.aBoolean53 = true;
					}
					if (this.aBoolean57) {
						this.aBoolean57 = false;
						this.aBoolean53 = true;
					}
					this.anInt254 = local170;
					this.aBoolean62 = false;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 231) {
					this.anInt379 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt379 == 1) {
						this.anInt327 = this.aClass1_Sub1_Sub3_4.method482();
					}
					if (this.anInt379 >= 2 && this.anInt379 <= 6) {
						if (this.anInt379 == 2) {
							this.anInt316 = 64;
							this.anInt317 = 64;
						}
						if (this.anInt379 == 3) {
							this.anInt316 = 0;
							this.anInt317 = 64;
						}
						if (this.anInt379 == 4) {
							this.anInt316 = 128;
							this.anInt317 = 64;
						}
						if (this.anInt379 == 5) {
							this.anInt316 = 64;
							this.anInt317 = 0;
						}
						if (this.anInt379 == 6) {
							this.anInt316 = 64;
							this.anInt317 = 128;
						}
						this.anInt379 = 2;
						this.anInt313 = this.aClass1_Sub1_Sub3_4.method482();
						this.anInt314 = this.aClass1_Sub1_Sub3_4.method482();
						this.anInt315 = this.aClass1_Sub1_Sub3_4.method480();
					}
					if (this.anInt379 == 10) {
						this.anInt406 = this.aClass1_Sub1_Sub3_4.method482();
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 143) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					local414 = this.aClass1_Sub1_Sub3_4.method482();
					if (local175 == 65535) {
						Class6.aClass6Array1[local170].anInt451 = 0;
						this.anInt413 = -1;
						return true;
					}
					@Pc(3479) Class15 local3479 = Class15.method361(local175);
					Class6.aClass6Array1[local170].anInt451 = 4;
					Class6.aClass6Array1[local170].anInt452 = local175;
					Class6.aClass6Array1[local170].anInt458 = local3479.anInt617;
					Class6.aClass6Array1[local170].anInt459 = local3479.anInt618;
					Class6.aClass6Array1[local170].anInt457 = local3479.anInt616 * 100 / local414;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 136) {
					for (local170 = 0; local170 < this.anIntArray32.length; local170++) {
						if (this.anIntArray32[local170] != this.anIntArray42[local170]) {
							this.anIntArray32[local170] = this.anIntArray42[local170];
							this.method163(local170);
							this.aBoolean60 = true;
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 220) {
					this.aBoolean59 = true;
					this.anInt299 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt300 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt301 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt302 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt303 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt303 >= 100) {
						this.anInt292 = this.anInt299 * 128 + 64;
						this.anInt294 = this.anInt300 * 128 + 64;
						this.anInt293 = this.method181(this.anInt294, this.anInt292, this.anInt320) - this.anInt301;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 206) {
					this.aBoolean60 = true;
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local667 = Class6.aClass6Array1[local170];
					while (this.aClass1_Sub1_Sub3_4.anInt757 < this.anInt412) {
						local414 = this.aClass1_Sub1_Sub3_4.method494();
						local628 = this.aClass1_Sub1_Sub3_4.method482();
						local632 = this.aClass1_Sub1_Sub3_4.method480();
						if (local632 == 255) {
							local632 = this.aClass1_Sub1_Sub3_4.method485();
						}
						if (local414 >= 0 && local414 < local667.anIntArray94.length) {
							local667.anIntArray94[local414] = local628;
							local667.anIntArray95[local414] = local632;
						}
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 189) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local667 = Class6.aClass6Array1[local170];
					for (local414 = 0; local414 < local667.anIntArray94.length; local414++) {
						local667.anIntArray94[local414] = -1;
						local667.anIntArray94[local414] = 0;
					}
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 121) {
					local170 = this.aClass1_Sub1_Sub3_4.method482();
					local175 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.anInt371 != -1) {
						this.anInt371 = -1;
						this.aBoolean53 = true;
					}
					if (this.aBoolean57) {
						this.aBoolean57 = false;
						this.aBoolean53 = true;
					}
					this.anInt254 = local170;
					this.anInt288 = local175;
					this.aBoolean60 = true;
					this.aBoolean70 = true;
					this.aBoolean62 = false;
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 47) {
					if (this.anInt419 == 12) {
						this.aBoolean60 = true;
					}
					this.anInt333 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt413 = -1;
					return true;
				}
				if (this.anInt413 == 247) {
					this.anInt258 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt258 == this.anInt419) {
						if (this.anInt258 == 3) {
							this.anInt419 = 1;
						} else {
							this.anInt419 = 3;
						}
						this.aBoolean60 = true;
					}
					this.anInt413 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt413 + "," + this.anInt412 + " - " + this.anInt230 + "," + this.anInt231);
				this.method136();
			} catch (@Pc(3866) IOException local3866) {
				this.method114(this.anInt259);
			} catch (@Pc(3872) Exception local3872) {
				local2420 = "T2 - " + this.anInt413 + "," + this.anInt230 + "," + this.anInt231 + " - " + this.anInt412 + "," + (this.anInt353 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]) + "," + (this.anInt354 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]) + " - ";
				for (local175 = 0; local175 < this.anInt412 && local175 < 50; local175++) {
					local2420 = local2420 + this.aClass1_Sub1_Sub3_4.aByteArray9[local175] + ",";
				}
				signlink.reporterror(local2420);
				this.method136();
			}
			return true;
		} catch (@Pc(3953) RuntimeException local3953) {
			signlink.reporterror("82843, " + -292 + ", " + local3953.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method199(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean87) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method228(43595);
			this.aSocket1.setSoTimeout(10000);
			@Pc(42) InputStream local42 = this.aSocket1.getInputStream();
			@Pc(46) OutputStream local46 = this.aSocket1.getOutputStream();
			local46.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(local42);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!lb;II)V")
	private void method200(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt252 = 0;
			this.anInt239 = 0;
			this.method219(arg1, arg0);
			this.method223(arg1, arg0);
			this.method111(arg0, arg1);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt252; local30++) {
				local37 = this.anIntArray44[local30];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37].anInt1041 != anInt283) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37] = null;
				}
			}
			if (arg0.anInt757 != arg1) {
				signlink.reporterror(this.aString6 + " size mismatch in getnpcpos - pos:" + arg0.anInt757 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt377; local37++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray80[local37]] == null) {
					signlink.reporterror(this.aString6 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt377);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("55339, " + arg0 + ", " + arg1 + ", " + -324 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method89() {
		this.method96(20, "Starting up", (byte) 7);
		if (signlink.sunjava) {
			super.anInt187 = 5;
		}
		if (aBoolean56) {
			this.aBoolean63 = true;
			return;
		}
		aBoolean56 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method157();
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.246")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.247")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.249")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.253")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.254")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.242")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean64 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(95) int local95 = 0; local95 < 5; local95++) {
				this.aClass45Array1[local95] = new Class45(500000, signlink.aRandomAccessFileArray1[local95], local95 + 1, signlink.aRandomAccessFile1, false);
			}
		}
		try {
			this.method218();
			this.aClass47_1 = this.method186("title", 1, "title screen", 25, this.anIntArray55[1]);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(anInt369, "p11_full", this.aClass47_1, false);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(anInt369, "p12_full", this.aClass47_1, false);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(anInt369, "b12_full", this.aClass47_1, false);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(anInt369, "q8_full", this.aClass47_1, true);
			this.method123();
			this.method148();
			@Pc(191) Class47 local191 = this.method186("config", 2, "config", 30, this.anIntArray55[2]);
			@Pc(203) Class47 local203 = this.method186("interface", 3, "interface", 35, this.anIntArray55[3]);
			@Pc(215) Class47 local215 = this.method186("media", 4, "2d graphics", 40, this.anIntArray55[4]);
			@Pc(227) Class47 local227 = this.method186("textures", 6, "textures", 45, this.anIntArray55[6]);
			@Pc(239) Class47 local239 = this.method186("wordenc", 7, "chat system", 50, this.anIntArray55[7]);
			@Pc(251) Class47 local251 = this.method186("sounds", 8, "sound effects", 55, this.anIntArray55[8]);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray6 = new int[4][105][105];
			this.aClass37_1 = new Class37(104, 7, 4, this.anIntArrayArrayArray6, 104);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19(104, 0, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_14 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method186("versionlist", 5, "update list", 60, this.anIntArray55[5]);
			this.method96(60, "Connecting to update server", (byte) 7);
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method636(local311, this);
			Class12.method302(this.aClass44_Sub1_1.method639(aBoolean76));
			Class1_Sub1_Sub1_Sub5.method258(this.aClass44_Sub1_1.method638(0, 921), this.aClass44_Sub1_1);
			if (!aBoolean52) {
				this.anInt319 = 0;
				try {
					this.anInt319 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean68 = true;
				this.aClass44_Sub1_1.method645(2, this.anInt319);
				while (this.aClass44_Sub1_1.method646() > 0) {
					this.method127();
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt970 > 3) {
						this.method158("ondemand");
						return;
					}
				}
			}
			this.method96(65, "Requesting animations", (byte) 7);
			@Pc(394) int local394 = this.aClass44_Sub1_1.method638(1, 921);
			for (@Pc(396) int local396 = 0; local396 < local394; local396++) {
				this.aClass44_Sub1_1.method645(1, local396);
			}
			@Pc(415) int local415;
			while (this.aClass44_Sub1_1.method646() > 0) {
				local415 = local394 - this.aClass44_Sub1_1.method646();
				if (local415 > 0) {
					this.method96(65, "Loading animations - " + local415 * 100 / local394 + "%", (byte) 7);
				}
				this.method127();
				try {
					Thread.sleep(100L);
				} catch (@Pc(441) Exception local441) {
				}
				if (this.aClass44_Sub1_1.anInt970 > 3) {
					this.method158("ondemand");
					return;
				}
			}
			this.method96(70, "Requesting models", (byte) 7);
			local394 = this.aClass44_Sub1_1.method638(0, 921);
			@Pc(475) int local475;
			for (local415 = 0; local415 < local394; local415++) {
				local475 = this.aClass44_Sub1_1.method643(local415);
				if ((local475 & 0x1) != 0) {
					this.aClass44_Sub1_1.method645(0, local415);
				}
			}
			local394 = this.aClass44_Sub1_1.method646();
			while (this.aClass44_Sub1_1.method646() > 0) {
				local475 = local394 - this.aClass44_Sub1_1.method646();
				if (local475 > 0) {
					this.method96(70, "Loading models - " + local475 * 100 / local394 + "%", (byte) 7);
				}
				this.method127();
				try {
					Thread.sleep(100L);
				} catch (@Pc(526) Exception local526) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method96(75, "Requesting maps", (byte) 7);
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 47, 48, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 47, 48, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 48, 48, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 48, 48, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 49, 48, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 49, 48, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 47, 47, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 47, 47, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 48, 47, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 48, 47, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 48, 148, anInt365));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 48, 148, anInt365));
				local394 = this.aClass44_Sub1_1.method646();
				while (this.aClass44_Sub1_1.method646() > 0) {
					local475 = local394 - this.aClass44_Sub1_1.method646();
					if (local475 > 0) {
						this.method96(75, "Loading maps - " + local475 * 100 / local394 + "%", (byte) 7);
					}
					this.method127();
					try {
						Thread.sleep(100L);
					} catch (@Pc(711) Exception local711) {
					}
				}
			}
			local394 = this.aClass44_Sub1_1.method638(0, 921);
			@Pc(732) int local732;
			for (local475 = 0; local475 < local394; local475++) {
				local732 = this.aClass44_Sub1_1.method643(local475);
				@Pc(734) byte local734 = 0;
				if ((local732 & 0x8) != 0) {
					local734 = 10;
				} else if ((local732 & 0x20) != 0) {
					local734 = 9;
				} else if ((local732 & 0x10) != 0) {
					local734 = 8;
				} else if ((local732 & 0x40) != 0) {
					local734 = 7;
				} else if ((local732 & 0x80) != 0) {
					local734 = 6;
				} else if ((local732 & 0x2) != 0) {
					local734 = 5;
				} else if ((local732 & 0x4) != 0) {
					local734 = 4;
				}
				if ((local732 & 0x1) != 0) {
					local734 = 3;
				}
				if (local734 != 0) {
					this.aClass44_Sub1_1.method648(local734, local475, 0);
				}
			}
			this.aClass44_Sub1_1.method641(aBoolean51);
			if (!aBoolean52) {
				local394 = this.aClass44_Sub1_1.method638(2, 921);
				for (local732 = 1; local732 < local394; local732++) {
					if (this.aClass44_Sub1_1.method644(local732, aBoolean45)) {
						this.aClass44_Sub1_1.method648((byte) 1, local732, 2);
					}
				}
			}
			this.method96(80, "Unpacking media", (byte) 7);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local215, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local215, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local215, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local215, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local215, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local215, "backhmid1", 0);
			for (local732 = 0; local732 < 13; local732++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local732] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local732);
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_9.method388();
			@Pc(934) int local934;
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local934] = new Class1_Sub1_Sub2_Sub3(local215, "mapscene", local934);
				}
			} catch (@Pc(952) Exception local952) {
			}
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local934] = new Class1_Sub1_Sub2_Sub2(local215, "mapfunction", local934);
				}
			} catch (@Pc(972) Exception local972) {
			}
			try {
				for (local934 = 0; local934 < 20; local934++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local934] = new Class1_Sub1_Sub2_Sub2(local215, "hitmarks", local934);
				}
			} catch (@Pc(992) Exception local992) {
			}
			try {
				for (local934 = 0; local934 < 20; local934++) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local934] = new Class1_Sub1_Sub2_Sub2(local215, "headicons", local934);
				}
			} catch (@Pc(1012) Exception local1012) {
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local934 = 0; local934 < 8; local934++) {
				this.aClass1_Sub1_Sub2_Sub2Array5[local934] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local934);
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 4);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19.method415();
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20.method415();
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_1.method416();
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_2.method416();
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_3.method416();
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method415();
			this.aClass1_Sub1_Sub2_Sub3_4.method416();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method415();
			this.aClass1_Sub1_Sub2_Sub3_5.method416();
			for (@Pc(1220) int local1220 = 0; local1220 < 2; local1220++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local1220] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1220);
			}
			@Pc(1243) Class1_Sub1_Sub2_Sub2 local1243 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_15 = new Class35(aByte7, local1243.anInt663, local1243.anInt664, this.method94());
			local1243.method389(0, 0);
			@Pc(1268) Class1_Sub1_Sub2_Sub2 local1268 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_16 = new Class35(aByte7, local1268.anInt663, local1268.anInt664, this.method94());
			local1268.method389(0, 0);
			@Pc(1293) Class1_Sub1_Sub2_Sub2 local1293 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_17 = new Class35(aByte7, local1293.anInt663, local1293.anInt664, this.method94());
			local1293.method389(0, 0);
			@Pc(1318) Class1_Sub1_Sub2_Sub2 local1318 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_18 = new Class35(aByte7, local1318.anInt663, local1318.anInt664, this.method94());
			local1318.method389(0, 0);
			@Pc(1343) Class1_Sub1_Sub2_Sub2 local1343 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_19 = new Class35(aByte7, local1343.anInt663, local1343.anInt664, this.method94());
			local1343.method389(0, 0);
			@Pc(1368) Class1_Sub1_Sub2_Sub2 local1368 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_20 = new Class35(aByte7, local1368.anInt663, local1368.anInt664, this.method94());
			local1368.method389(0, 0);
			@Pc(1393) Class1_Sub1_Sub2_Sub2 local1393 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_21 = new Class35(aByte7, local1393.anInt663, local1393.anInt664, this.method94());
			local1393.method389(0, 0);
			@Pc(1418) Class1_Sub1_Sub2_Sub2 local1418 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_22 = new Class35(aByte7, local1418.anInt663, local1418.anInt664, this.method94());
			local1418.method389(0, 0);
			@Pc(1443) Class1_Sub1_Sub2_Sub2 local1443 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_23 = new Class35(aByte7, local1443.anInt663, local1443.anInt664, this.method94());
			local1443.method389(0, 0);
			@Pc(1468) int local1468 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1475) int local1475 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1482) int local1482 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1489) int local1489 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1491) int local1491 = 0; local1491 < 100; local1491++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array3[local1491] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local1491].method387(local1482 + local1489, local1468 + local1489, local1475 + local1489);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array4[local1491] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local1491].method417(local1482 + local1489, local1468 + local1489, local1475 + local1489);
				}
			}
			this.method96(83, "Unpacking textures", (byte) 7);
			Class1_Sub1_Sub2_Sub1.method347(local227, aBoolean73);
			Class1_Sub1_Sub2_Sub1.method351(0.8D);
			Class1_Sub1_Sub2_Sub1.method346(aByte12);
			this.method96(86, "Unpacking config", (byte) 7);
			Class27.method505(anInt324, local191);
			Class9.method286(local191);
			Class21.method462(anInt324, local191);
			Class15.method359(local191);
			Class13.method321(local191);
			Class23.method496(anInt324, local191);
			Class33.method521(anInt324, local191);
			Class39.method589(anInt324, local191);
			Class36.method527(anInt324, local191);
			Class15.aBoolean155 = aBoolean51;
			if (!aBoolean52) {
				this.method96(90, "Unpacking sounds", (byte) 7);
				@Pc(1594) byte[] local1594 = local251.method666("sounds.dat", null);
				@Pc(1600) Class1_Sub1_Sub3 local1600 = new Class1_Sub1_Sub3(false, local1594);
				Class5.method78(anInt324, local1600);
			}
			this.method96(95, "Unpacking interfaces", (byte) 7);
			@Pc(1631) Class1_Sub1_Sub2_Sub4[] local1631 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method231(local203, local215, local1631);
			this.method96(100, "Preparing game engine", (byte) 7);
			@Pc(1647) int local1647;
			@Pc(1649) int local1649;
			@Pc(1651) int local1651;
			for (@Pc(1643) int local1643 = 0; local1643 < 33; local1643++) {
				local1647 = 999;
				local1649 = 0;
				for (local1651 = 0; local1651 < 34; local1651++) {
					if (this.aClass1_Sub1_Sub2_Sub3_11.aByteArray7[local1651 + local1643 * this.aClass1_Sub1_Sub2_Sub3_11.anInt689] == 0) {
						if (local1647 == 999) {
							local1647 = local1651;
						}
					} else if (local1647 != 999) {
						local1649 = local1651;
						break;
					}
				}
				this.anIntArray38[local1643] = local1647;
				this.anIntArray67[local1643] = local1649 - local1647;
			}
			@Pc(1709) int local1709;
			for (local1647 = 5; local1647 < 156; local1647++) {
				local1649 = 999;
				local1651 = 0;
				for (local1709 = 25; local1709 < 172; local1709++) {
					if (this.aClass1_Sub1_Sub2_Sub3_11.aByteArray7[local1709 + local1647 * this.aClass1_Sub1_Sub2_Sub3_11.anInt689] == 0 && (local1709 > 34 || local1647 > 34)) {
						if (local1649 == 999) {
							local1649 = local1709;
						}
					} else if (local1649 != 999) {
						local1651 = local1709;
						break;
					}
				}
				this.anIntArray77[local1647 - 5] = local1649 - 25;
				this.anIntArray33[local1647 - 5] = local1651 - local1649;
			}
			Class1_Sub1_Sub2_Sub1.method344(479, 96);
			this.anIntArray81 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(190, 261);
			this.anIntArray82 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(512, 334);
			this.anIntArray83 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			@Pc(1793) int[] local1793 = new int[9];
			for (local1651 = 0; local1651 < 9; local1651++) {
				local1709 = local1651 * 32 + 128 + 15;
				@Pc(1811) int local1811 = local1709 * 3 + 600;
				@Pc(1815) int local1815 = Class1_Sub1_Sub2_Sub1.anIntArray178[local1709];
				local1793[local1651] = local1811 * local1815 >> 16;
			}
			Class37.method566(local1793);
			Class42.method594(local239);
			this.aClass11_1 = new Class11(false, this);
			this.method95(this.aClass11_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient1 = this;
			Class9.aClient2 = this;
			Class13.aClient4 = this;
		} catch (@Pc(1856) Exception local1856) {
			signlink.reporterror("loaderror " + this.aString14 + " " + this.anInt228);
			this.aBoolean42 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method202(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(13) int local13 = 0; local13 < this.anInt377; local13++) {
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray80[local13]];
				@Pc(32) int local32 = (this.anIntArray80[local13] << 14) + 536870912;
				if (local23 != null && local23.method680() && local23.aClass13_2.aBoolean144 == arg0) {
					@Pc(48) int local48 = local23.anInt1001 >> 7;
					@Pc(53) int local53 = local23.anInt1002 >> 7;
					if (local48 >= 0 && local48 < 104 && local53 >= 0 && local53 < 104) {
						if (local23.anInt1004 == 1 && (local23.anInt1001 & 0x7F) == 64 && (local23.anInt1002 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local48][local53] == this.anInt273) {
								continue;
							}
							this.anIntArrayArray5[local48][local53] = this.anInt273;
						}
						this.aClass37_1.method541(local23.anInt1003, (local23.anInt1004 - 1) * 64 + 60, this.method181(local23.anInt1002, local23.anInt1001, this.anInt320), local23.aBoolean243, local23, this.anInt320, local23.anInt1002, local32, local23.anInt1001);
					}
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("41285, " + arg0 + ", " + arg1 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIIIIBII)Z")
	private boolean method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray6[local7][local11] = 0;
					this.anIntArrayArray3[local7][local11] = 99999999;
				}
			}
			local11 = arg0;
			@Pc(39) int local39 = arg10;
			this.anIntArrayArray6[arg0][arg10] = 99;
			this.anIntArrayArray3[arg0][arg10] = 0;
			@Pc(64) byte local64 = 0;
			@Pc(66) int local66 = 0;
			this.anIntArray60[0] = arg0;
			@Pc(75) int local75 = local64 + 1;
			this.anIntArray61[0] = arg10;
			@Pc(79) boolean local79 = false;
			@Pc(83) int local83 = this.anIntArray60.length;
			@Pc(90) int[][] local90 = this.aClass19Array1[this.anInt320].anIntArrayArray18;
			@Pc(201) int local201;
			while (local66 != local75) {
				local11 = this.anIntArray60[local66];
				local39 = this.anIntArray61[local66];
				local66 = (local66 + 1) % local83;
				if (local11 == arg8 && local39 == arg6) {
					local79 = true;
					break;
				}
				if (arg5 != 0) {
					if ((arg5 < 5 || arg5 == 10) && this.aClass19Array1[this.anInt320].method429(local11, arg3, local39, arg5 - 1, arg6, arg8)) {
						local79 = true;
						break;
					}
					if (arg5 < 10 && this.aClass19Array1[this.anInt320].method430(local11, arg5 - 1, local39, arg6, arg3, arg8)) {
						local79 = true;
						break;
					}
				}
				if (arg2 != 0 && arg9 != 0 && this.aClass19Array1[this.anInt320].method431(773, local11, arg1, arg8, arg6, arg9, arg2, local39)) {
					local79 = true;
					break;
				}
				local201 = this.anIntArrayArray3[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray6[local11 - 1][local39] == 0 && (local90[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray60[local75] = local11 - 1;
					this.anIntArray61[local75] = local39;
					local75 = (local75 + 1) % local83;
					this.anIntArrayArray6[local11 - 1][local39] = 2;
					this.anIntArrayArray3[local11 - 1][local39] = local201;
				}
				if (local11 < 103 && this.anIntArrayArray6[local11 + 1][local39] == 0 && (local90[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray60[local75] = local11 + 1;
					this.anIntArray61[local75] = local39;
					local75 = (local75 + 1) % local83;
					this.anIntArrayArray6[local11 + 1][local39] = 8;
					this.anIntArrayArray3[local11 + 1][local39] = local201;
				}
				if (local39 > 0 && this.anIntArrayArray6[local11][local39 - 1] == 0 && (local90[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local75] = local11;
					this.anIntArray61[local75] = local39 - 1;
					local75 = (local75 + 1) % local83;
					this.anIntArrayArray6[local11][local39 - 1] = 1;
					this.anIntArrayArray3[local11][local39 - 1] = local201;
				}
				if (local39 < 103 && this.anIntArrayArray6[local11][local39 + 1] == 0 && (local90[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local75] = local11;
					this.anIntArray61[local75] = local39 + 1;
					local75 = (local75 + 1) % local83;
					this.anIntArrayArray6[local11][local39 + 1] = 4;
					this.anIntArrayArray3[local11][local39 + 1] = local201;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray6[local11 - 1][local39 - 1] == 0 && (local90[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local90[local11 - 1][local39] & 0x280108) == 0 && (local90[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local75] = local11 - 1;
					this.anIntArray61[local75] = local39 - 1;
					local75 = (local75 + 1) % local83;
					this.anIntArrayArray6[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = local201;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray6[local11 + 1][local39 - 1] == 0 && (local90[local11 + 1][local39 - 1] & 0x280183) == 0 && (local90[local11 + 1][local39] & 0x280180) == 0 && (local90[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local75] = local11 + 1;
					this.anIntArray61[local75] = local39 - 1;
					local75 = (local75 + 1) % local83;
					this.anIntArrayArray6[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = local201;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray6[local11 - 1][local39 + 1] == 0 && (local90[local11 - 1][local39 + 1] & 0x280138) == 0 && (local90[local11 - 1][local39] & 0x280108) == 0 && (local90[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local75] = local11 - 1;
					this.anIntArray61[local75] = local39 + 1;
					local75 = (local75 + 1) % local83;
					this.anIntArrayArray6[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = local201;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray6[local11 + 1][local39 + 1] == 0 && (local90[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local90[local11 + 1][local39] & 0x280180) == 0 && (local90[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local75] = local11 + 1;
					this.anIntArray61[local75] = local39 + 1;
					local75 = (local75 + 1) % local83;
					this.anIntArrayArray6[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = local201;
				}
			}
			this.anInt372 = 0;
			@Pc(817) int local817;
			@Pc(823) int local823;
			@Pc(829) int local829;
			if (!local79) {
				if (arg4) {
					local201 = 100;
					for (local817 = 1; local817 < 2; local817++) {
						for (local823 = arg8 - local817; local823 <= arg8 + local817; local823++) {
							for (local829 = arg6 - local817; local829 <= arg6 + local817; local829++) {
								if (local823 >= 0 && local829 >= 0 && local823 < 104 && local829 < 104 && this.anIntArrayArray3[local823][local829] < local201) {
									local201 = this.anIntArrayArray3[local823][local829];
									local11 = local823;
									local39 = local829;
									this.anInt372 = 1;
									local79 = true;
								}
							}
						}
						if (local79) {
							break;
						}
					}
				}
				if (!local79) {
					return false;
				}
			}
			@Pc(890) byte local890 = 0;
			this.anIntArray60[0] = local11;
			local66 = local890 + 1;
			this.anIntArray61[0] = local39;
			local201 = local817 = this.anIntArrayArray6[local11][local39];
			while (local11 != arg0 || local39 != arg10) {
				if (local201 != local817) {
					local817 = local201;
					this.anIntArray60[local66] = local11;
					this.anIntArray61[local66++] = local39;
				}
				if ((local201 & 0x2) != 0) {
					local11++;
				} else if ((local201 & 0x8) != 0) {
					local11--;
				}
				if ((local201 & 0x1) != 0) {
					local39++;
				} else if ((local201 & 0x4) != 0) {
					local39--;
				}
				local201 = this.anIntArrayArray6[local11][local39];
			}
			if (local66 > 0) {
				local83 = local66;
				if (local66 > 25) {
					local83 = 25;
				}
				local66--;
				local823 = this.anIntArray60[local66];
				local829 = this.anIntArray61[local66];
				if (arg7 == 0) {
					this.aClass1_Sub1_Sub3_2.method469(102);
					this.aClass1_Sub1_Sub3_2.method470(local83 + local83 + 3);
				}
				if (arg7 == 1) {
					this.aClass1_Sub1_Sub3_2.method469(170);
					this.aClass1_Sub1_Sub3_2.method470(local83 + local83 + 3 + 14);
				}
				if (arg7 == 2) {
					this.aClass1_Sub1_Sub3_2.method469(15);
					this.aClass1_Sub1_Sub3_2.method470(local83 + local83 + 3);
				}
				if (super.anIntArray30[5] == 1) {
					this.aClass1_Sub1_Sub3_2.method470(1);
				} else {
					this.aClass1_Sub1_Sub3_2.method470(0);
				}
				this.aClass1_Sub1_Sub3_2.method471(local823 + this.anInt353);
				this.aClass1_Sub1_Sub3_2.method471(local829 + this.anInt354);
				this.anInt420 = this.anIntArray60[0];
				this.anInt421 = this.anIntArray61[0];
				for (@Pc(1078) int local1078 = 1; local1078 < local83; local1078++) {
					local66--;
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray60[local66] - local823);
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray61[local66] - local829);
				}
				return true;
			} else if (arg7 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1113) RuntimeException local1113) {
			signlink.reporterror("73480, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 9 + ", " + arg9 + ", " + arg10 + ", " + local1113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method204(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.method107();
			this.aClass35_5.method524(this.anInt253);
			this.aClass1_Sub1_Sub2_Sub3_8.method418(0, 0);
			@Pc(24) boolean local24 = false;
			@Pc(57) byte local57;
			@Pc(70) int local70;
			if (this.anInt270 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method448(180, 7711145, true, 180, this.aBoolean80, this.aClass44_Sub1_1.aString30);
				local57 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(80, 16776960, true, 180, this.aBoolean80, "Welcome to RuneScape");
				local70 = local57 + 30;
				this.aClass1_Sub1_Sub2_Sub3_9.method418(100, 27);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(125, 16777215, true, 100, this.aBoolean80, "New User");
				this.aClass1_Sub1_Sub2_Sub3_9.method418(100, 187);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(125, 16777215, true, 260, this.aBoolean80, "Existing User");
			}
			if (this.anInt270 == 2) {
				local57 = 60;
				if (this.aString12.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(45, 16776960, true, 180, this.aBoolean80, this.aString12);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(60, 16776960, true, 180, this.aBoolean80, this.aString13);
					local70 = local57 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(53, 16776960, true, 180, this.aBoolean80, this.aString13);
					local70 = local57 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455("Username: " + this.aString6 + (this.anInt367 == 0 & anInt283 % 40 < 20 ? "@yel@|" : ""), 90, true, 654, 90, 16777215);
				local70 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method455("Password: " + Class48.method672(this.aString7) + (this.anInt367 == 1 & anInt283 % 40 < 20 ? "@yel@|" : ""), 92, true, 654, 105, 16777215);
				local70 += 15;
				if (!arg1) {
					this.aClass1_Sub1_Sub2_Sub3_9.method418(130, 27);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(155, 16777215, true, 100, this.aBoolean80, "Login");
					this.aClass1_Sub1_Sub2_Sub3_9.method418(130, 187);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(155, 16777215, true, 260, this.aBoolean80, "Cancel");
				}
			}
			if (this.anInt270 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method448(40, 16776960, true, 180, this.aBoolean80, "Create a free account");
				local57 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(65, 16777215, true, 180, this.aBoolean80, "To create a new account you need to");
				local70 = local57 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(80, 16777215, true, 180, this.aBoolean80, "go back to the main RuneScape webpage");
				local70 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(95, 16777215, true, 180, this.aBoolean80, "and choose the red 'create account'");
				local70 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(110, 16777215, true, 180, this.aBoolean80, "button at the top right of that page.");
				local70 += 15;
				this.aClass1_Sub1_Sub2_Sub3_9.method418(130, 107);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(155, 16777215, true, 180, this.aBoolean80, "Cancel");
			}
			this.aClass35_5.method525(171, 202, super.aGraphics2);
			if (this.aBoolean47) {
				this.aBoolean47 = false;
				this.aClass35_3.method525(0, 128, super.aGraphics2);
				this.aClass35_4.method525(371, 202, super.aGraphics2);
				this.aClass35_8.method525(265, 0, super.aGraphics2);
				this.aClass35_9.method525(265, 562, super.aGraphics2);
				this.aClass35_10.method525(171, 128, super.aGraphics2);
				this.aClass35_11.method525(171, 562, super.aGraphics2);
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("58930, " + arg0 + ", " + arg1 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method205() {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt377; local5++) {
				@Pc(12) int local12 = this.anIntArray80[local5];
				@Pc(17) Class1_Sub1_Sub1_Sub1_Sub2 local17 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
				if (local17 != null) {
					this.method206(local17, local17.aClass13_2.aByte33);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("68773, " + 17983 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;II)V")
	private void method206(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt1001 < 128 || arg0.anInt1002 < 128 || arg0.anInt1001 >= 13184 || arg0.anInt1002 >= 13184) {
				arg0.anInt1024 = -1;
				arg0.anInt1029 = -1;
				arg0.anInt1038 = 0;
				arg0.anInt1039 = 0;
				arg0.anInt1001 = arg0.anIntArray272[0] * 128 + arg0.anInt1004 * 64;
				arg0.anInt1002 = arg0.anIntArray273[0] * 128 + arg0.anInt1004 * 64;
				arg0.method679();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt1001 < 1536 || arg0.anInt1002 < 1536 || arg0.anInt1001 >= 11776 || arg0.anInt1002 >= 11776)) {
				arg0.anInt1024 = -1;
				arg0.anInt1029 = -1;
				arg0.anInt1038 = 0;
				arg0.anInt1039 = 0;
				arg0.anInt1001 = arg0.anIntArray272[0] * 128 + arg0.anInt1004 * 64;
				arg0.anInt1002 = arg0.anIntArray273[0] * 128 + arg0.anInt1004 * 64;
				arg0.method679();
			}
			if (arg0.anInt1038 > anInt283) {
				this.method207(this.aBoolean50, arg0);
			} else if (arg0.anInt1039 >= anInt283) {
				this.method208(arg0, this.aByte18);
			} else {
				this.method209(arg0);
			}
			this.method210(arg0);
			this.method211(arg0);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("34301, " + arg0 + ", " + -698 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!y;)V")
	private void method207(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt1038 - anInt283;
			@Pc(14) int local14 = arg1.anInt1034 * 128 + arg1.anInt1004 * 64;
			@Pc(24) int local24 = arg1.anInt1036 * 128 + arg1.anInt1004 * 64;
			arg1.anInt1001 += (local14 - arg1.anInt1001) / local4;
			if (arg0) {
				this.aClass29ArrayArrayArray1 = null;
			}
			arg1.anInt1002 += (local24 - arg1.anInt1002) / local4;
			arg1.anInt1046 = 0;
			if (arg1.anInt1040 == 0) {
				arg1.anInt1043 = 1024;
			}
			if (arg1.anInt1040 == 1) {
				arg1.anInt1043 = 1536;
			}
			if (arg1.anInt1040 == 2) {
				arg1.anInt1043 = 0;
			}
			if (arg1.anInt1040 == 3) {
				arg1.anInt1043 = 512;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("23166, " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;B)V")
	private void method208(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(30) int local30;
			if (arg0.anInt1039 == anInt283 || arg0.anInt1024 == -1 || arg0.anInt1027 != 0 || arg0.anInt1026 + 1 > Class27.aClass27Array1[arg0.anInt1024].method506(arg0.anInt1025, this.anInt364)) {
				local30 = arg0.anInt1039 - arg0.anInt1038;
				@Pc(35) int local35 = anInt283 - arg0.anInt1038;
				@Pc(45) int local45 = arg0.anInt1034 * 128 + arg0.anInt1004 * 64;
				@Pc(55) int local55 = arg0.anInt1036 * 128 + arg0.anInt1004 * 64;
				@Pc(65) int local65 = arg0.anInt1035 * 128 + arg0.anInt1004 * 64;
				@Pc(75) int local75 = arg0.anInt1037 * 128 + arg0.anInt1004 * 64;
				arg0.anInt1001 = (local45 * (local30 - local35) + local65 * local35) / local30;
				arg0.anInt1002 = (local55 * (local30 - local35) + local75 * local35) / local30;
			}
			arg0.anInt1046 = 0;
			if (arg0.anInt1040 == 0) {
				arg0.anInt1043 = 1024;
			}
			if (arg0.anInt1040 == 1) {
				arg0.anInt1043 = 1536;
			}
			if (arg0.anInt1040 == 2) {
				arg0.anInt1043 = 0;
			}
			if (arg0.anInt1040 == 3) {
				arg0.anInt1043 = 512;
			}
			arg0.anInt1003 = arg0.anInt1043;
			if (arg1 != this.aByte19) {
				for (local30 = 1; local30 > 0; local30++) {
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("99527, " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;Z)V")
	private void method209(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt1021 = arg0.anInt1005;
			if (arg0.anInt1045 == 0) {
				arg0.anInt1046 = 0;
			} else {
				if (arg0.anInt1024 != -1 && arg0.anInt1027 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt1024];
					if (arg0.anInt1047 > 0 && local24.anInt814 == 0) {
						arg0.anInt1046++;
						return;
					}
					if (arg0.anInt1047 <= 0 && local24.anInt815 == 0) {
						arg0.anInt1046++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt1001;
				@Pc(56) int local56 = arg0.anInt1002;
				@Pc(71) int local71 = arg0.anIntArray272[arg0.anInt1045 - 1] * 128 + arg0.anInt1004 * 64;
				@Pc(86) int local86 = arg0.anIntArray273[arg0.anInt1045 - 1] * 128 + arg0.anInt1004 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt1043 = 1280;
						} else if (local56 > local86) {
							arg0.anInt1043 = 1792;
						} else {
							arg0.anInt1043 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt1043 = 768;
						} else if (local56 > local86) {
							arg0.anInt1043 = 256;
						} else {
							arg0.anInt1043 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt1043 = 1024;
					} else {
						arg0.anInt1043 = 0;
					}
					@Pc(180) int local180 = arg0.anInt1043 - arg0.anInt1003 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt1008;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt1007;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt1010;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt1009;
					}
					if (local187 == -1) {
						local187 = arg0.anInt1007;
					}
					arg0.anInt1021 = local187;
					@Pc(229) int local229 = 4;
					if (arg0.anInt1003 != arg0.anInt1043 && arg0.anInt1018 == -1 && arg0.anInt1044 != 0) {
						local229 = 2;
					}
					if (arg0.anInt1045 > 2) {
						local229 = 6;
					}
					if (arg0.anInt1045 > 3) {
						local229 = 8;
					}
					if (arg0.anInt1046 > 0 && arg0.anInt1045 > 1) {
						local229 = 8;
						arg0.anInt1046--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1045 - 1]) {
						local229 <<= 0x1;
					}
					if (local229 >= 8 && arg0.anInt1021 == arg0.anInt1007 && arg0.anInt1011 != -1) {
						arg0.anInt1021 = arg0.anInt1011;
					}
					if (local53 < local71) {
						arg0.anInt1001 += local229;
						if (arg0.anInt1001 > local71) {
							arg0.anInt1001 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt1001 -= local229;
						if (arg0.anInt1001 < local71) {
							arg0.anInt1001 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt1002 += local229;
						if (arg0.anInt1002 > local86) {
							arg0.anInt1002 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt1002 -= local229;
						if (arg0.anInt1002 < local86) {
							arg0.anInt1002 = local86;
						}
					}
					if (arg0.anInt1001 == local71 && arg0.anInt1002 == local86) {
						arg0.anInt1045--;
						if (arg0.anInt1047 > 0) {
							arg0.anInt1047--;
							return;
						}
					}
				} else {
					arg0.anInt1001 = local71;
					arg0.anInt1002 = local86;
				}
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("11684, " + arg0 + ", " + true + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!y;)V")
	private void method210(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1044 != 0) {
				@Pc(32) int local32;
				@Pc(38) int local38;
				if (arg0.anInt1018 != -1 && arg0.anInt1018 < 32768) {
					@Pc(24) Class1_Sub1_Sub1_Sub1_Sub2 local24 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1018];
					if (local24 != null) {
						local32 = arg0.anInt1001 - local24.anInt1001;
						local38 = arg0.anInt1002 - local24.anInt1002;
						if (local32 != 0 || local38 != 0) {
							arg0.anInt1043 = (int) (Math.atan2((double) local32, (double) local38) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(63) int local63;
				if (arg0.anInt1018 >= 32768) {
					local63 = arg0.anInt1018 - 32768;
					if (local63 == this.anInt247) {
						local63 = this.anInt237;
					}
					@Pc(75) Class1_Sub1_Sub1_Sub1_Sub1 local75 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local63];
					if (local75 != null) {
						local38 = arg0.anInt1001 - local75.anInt1001;
						@Pc(89) int local89 = arg0.anInt1002 - local75.anInt1002;
						if (local38 != 0 || local89 != 0) {
							arg0.anInt1043 = (int) (Math.atan2((double) local38, (double) local89) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt1019 != 0 || arg0.anInt1020 != 0) && (arg0.anInt1045 == 0 || arg0.anInt1046 > 0)) {
					local63 = arg0.anInt1001 - (arg0.anInt1019 - this.anInt353 - this.anInt353) * 64;
					local32 = arg0.anInt1002 - (arg0.anInt1020 - this.anInt354 - this.anInt354) * 64;
					if (local63 != 0 || local32 != 0) {
						arg0.anInt1043 = (int) (Math.atan2((double) local63, (double) local32) * 325.949D) & 0x7FF;
					}
					arg0.anInt1019 = 0;
					arg0.anInt1020 = 0;
				}
				local63 = arg0.anInt1043 - arg0.anInt1003 & 0x7FF;
				if (local63 != 0) {
					if (local63 < arg0.anInt1044 || local63 > 2048 - arg0.anInt1044) {
						arg0.anInt1003 = arg0.anInt1043;
					} else if (local63 > 1024) {
						arg0.anInt1003 -= arg0.anInt1044;
					} else {
						arg0.anInt1003 += arg0.anInt1044;
					}
					arg0.anInt1003 &= 0x7FF;
					if (arg0.anInt1021 == arg0.anInt1005 && arg0.anInt1003 != arg0.anInt1043) {
						if (arg0.anInt1006 != -1) {
							arg0.anInt1021 = arg0.anInt1006;
							return;
						}
						arg0.anInt1021 = arg0.anInt1007;
						return;
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("91657, " + true + ", " + arg0 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZLclient!y;)V")
	private void method211(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean243 = false;
			@Pc(20) Class27 local20;
			if (arg0.anInt1021 != -1) {
				local20 = Class27.aClass27Array1[arg0.anInt1021];
				arg0.anInt1023++;
				if (arg0.anInt1022 < local20.anInt808 && arg0.anInt1023 > local20.method506(arg0.anInt1022, this.anInt364)) {
					arg0.anInt1023 = 0;
					arg0.anInt1022++;
				}
				if (arg0.anInt1022 >= local20.anInt808) {
					arg0.anInt1023 = 0;
					arg0.anInt1022 = 0;
				}
			}
			if (arg0.anInt1029 != -1 && anInt283 >= arg0.anInt1032) {
				if (arg0.anInt1030 < 0) {
					arg0.anInt1030 = 0;
				}
				local20 = Class33.aClass33Array1[arg0.anInt1029].aClass27_2;
				arg0.anInt1031++;
				while (arg0.anInt1030 < local20.anInt808 && arg0.anInt1031 > local20.method506(arg0.anInt1030, this.anInt364)) {
					arg0.anInt1031 -= local20.method506(arg0.anInt1030, this.anInt364);
					arg0.anInt1030++;
				}
				if (arg0.anInt1030 >= local20.anInt808 && (arg0.anInt1030 < 0 || arg0.anInt1030 >= local20.anInt808)) {
					arg0.anInt1029 = -1;
				}
			}
			if (arg0.anInt1024 != -1 && arg0.anInt1027 <= 1) {
				local20 = Class27.aClass27Array1[arg0.anInt1024];
				if (local20.anInt814 == 1 && arg0.anInt1047 > 0 && arg0.anInt1038 <= anInt283 && arg0.anInt1039 < anInt283) {
					arg0.anInt1027 = 1;
					return;
				}
			}
			if (arg0.anInt1024 != -1 && arg0.anInt1027 == 0) {
				local20 = Class27.aClass27Array1[arg0.anInt1024];
				arg0.anInt1026++;
				while (arg0.anInt1025 < local20.anInt808 && arg0.anInt1026 > local20.method506(arg0.anInt1025, this.anInt364)) {
					arg0.anInt1026 -= local20.method506(arg0.anInt1025, this.anInt364);
					arg0.anInt1025++;
				}
				if (arg0.anInt1025 >= local20.anInt808) {
					arg0.anInt1025 -= local20.anInt809;
					arg0.anInt1028++;
					if (arg0.anInt1028 >= local20.anInt813) {
						arg0.anInt1024 = -1;
					}
					if (arg0.anInt1025 < 0 || arg0.anInt1025 >= local20.anInt808) {
						arg0.anInt1024 = -1;
					}
				}
				arg0.aBoolean243 = local20.aBoolean201;
			}
			if (arg0.anInt1027 > 0) {
				arg0.anInt1027--;
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("23983, " + true + ", " + arg0 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method212() {
		try {
			if (this.aBoolean47) {
				this.aBoolean47 = false;
				this.aClass35_15.method525(4, 0, super.aGraphics2);
				this.aClass35_16.method525(357, 0, super.aGraphics2);
				this.aClass35_17.method525(4, 722, super.aGraphics2);
				this.aClass35_18.method525(205, 743, super.aGraphics2);
				this.aClass35_19.method525(0, 0, super.aGraphics2);
				this.aClass35_20.method525(4, 516, super.aGraphics2);
				this.aClass35_21.method525(205, 516, super.aGraphics2);
				this.aClass35_22.method525(357, 496, super.aGraphics2);
				this.aClass35_23.method525(338, 0, super.aGraphics2);
				this.aBoolean60 = true;
				this.aBoolean53 = true;
				this.aBoolean70 = true;
				this.aBoolean46 = true;
				if (this.anInt284 != 2) {
					this.aClass35_26.method525(4, 4, super.aGraphics2);
					this.aClass35_25.method525(4, 550, super.aGraphics2);
				}
			}
			if (this.anInt284 == 2) {
				this.method155();
			}
			if (this.aBoolean81 && this.anInt384 == 1) {
				this.aBoolean60 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt288 != -1) {
				local138 = this.method175(this.anInt215, this.anInt288);
				if (local138) {
					this.aBoolean60 = true;
				}
			}
			if (this.anInt426 == 2) {
				this.aBoolean60 = true;
			}
			if (this.anInt403 == 2) {
				this.aBoolean60 = true;
			}
			if (this.aBoolean60) {
				this.method197();
				this.aBoolean60 = false;
			}
			if (this.anInt371 == -1) {
				this.aClass6_1.anInt443 = this.anInt311 - this.anInt298 - 77;
				if (super.anInt193 > 448 && super.anInt193 < 560 && super.anInt194 > 332) {
					this.method174(super.anInt194 - 357, super.anInt193 - 17, this.aClass6_1, 0, 77, false, 463, this.anInt311);
				}
				@Pc(220) int local220 = this.anInt311 - this.aClass6_1.anInt443 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt311 - 77) {
					local220 = this.anInt311 - 77;
				}
				if (this.anInt298 != local220) {
					this.anInt298 = local220;
					this.aBoolean53 = true;
				}
			}
			if (this.anInt371 != -1) {
				local138 = this.method175(this.anInt215, this.anInt371);
				if (local138) {
					this.aBoolean53 = true;
				}
			}
			if (this.anInt426 == 3) {
				this.aBoolean53 = true;
			}
			if (this.anInt403 == 3) {
				this.aBoolean53 = true;
			}
			if (this.aString16 != null) {
				this.aBoolean53 = true;
			}
			if (this.aBoolean81 && this.anInt384 == 2) {
				this.aBoolean53 = true;
			}
			if (this.aBoolean53) {
				this.method214();
				this.aBoolean53 = false;
			}
			if (this.anInt284 == 2) {
				this.method213(anInt240);
				this.aClass35_25.method525(4, 550, super.aGraphics2);
			}
			if (this.anInt258 != -1) {
				this.aBoolean70 = true;
			}
			if (this.aBoolean70) {
				if (this.anInt258 != -1 && this.anInt258 == this.anInt419) {
					this.anInt258 = -1;
					this.aClass1_Sub1_Sub3_2.method469(83);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt419);
				}
				this.aBoolean70 = false;
				this.aClass35_14.method524(this.anInt253);
				this.aClass1_Sub1_Sub2_Sub3_15.method418(0, 0);
				if (this.anInt288 == -1) {
					if (this.anIntArray49[this.anInt419] != -1) {
						if (this.anInt419 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_16.method418(10, 22);
						}
						if (this.anInt419 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(8, 54);
						}
						if (this.anInt419 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(8, 82);
						}
						if (this.anInt419 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_18.method418(8, 110);
						}
						if (this.anInt419 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_20.method418(8, 153);
						}
						if (this.anInt419 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_20.method418(8, 181);
						}
						if (this.anInt419 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_19.method418(9, 209);
						}
					}
					if (this.anIntArray49[0] != -1 && (this.anInt258 != 0 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method418(13, 29);
					}
					if (this.anIntArray49[1] != -1 && (this.anInt258 != 1 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method418(11, 53);
					}
					if (this.anIntArray49[2] != -1 && (this.anInt258 != 2 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method418(11, 82);
					}
					if (this.anIntArray49[3] != -1 && (this.anInt258 != 3 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method418(12, 115);
					}
					if (this.anIntArray49[4] != -1 && (this.anInt258 != 4 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method418(13, 153);
					}
					if (this.anIntArray49[5] != -1 && (this.anInt258 != 5 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method418(11, 180);
					}
					if (this.anIntArray49[6] != -1 && (this.anInt258 != 6 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method418(13, 208);
					}
				}
				this.aClass35_14.method525(160, 516, super.aGraphics2);
				this.aClass35_13.method524(this.anInt253);
				this.aClass1_Sub1_Sub2_Sub3_14.method418(0, 0);
				if (this.anInt288 == -1) {
					if (this.anIntArray49[this.anInt419] != -1) {
						if (this.anInt419 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_1.method418(0, 42);
						}
						if (this.anInt419 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_2.method418(0, 74);
						}
						if (this.anInt419 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_2.method418(0, 102);
						}
						if (this.anInt419 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_3.method418(1, 130);
						}
						if (this.anInt419 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_5.method418(0, 173);
						}
						if (this.anInt419 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_5.method418(0, 201);
						}
						if (this.anInt419 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_4.method418(0, 229);
						}
					}
					if (this.anIntArray49[8] != -1 && (this.anInt258 != 8 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method418(2, 74);
					}
					if (this.anIntArray49[9] != -1 && (this.anInt258 != 9 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method418(3, 102);
					}
					if (this.anIntArray49[10] != -1 && (this.anInt258 != 10 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method418(4, 137);
					}
					if (this.anIntArray49[11] != -1 && (this.anInt258 != 11 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method418(2, 174);
					}
					if (this.anIntArray49[12] != -1 && (this.anInt258 != 12 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method418(2, 201);
					}
					if (this.anIntArray49[13] != -1 && (this.anInt258 != 13 || anInt283 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method418(2, 226);
					}
				}
				this.aClass35_13.method525(466, 496, super.aGraphics2);
				this.aClass35_26.method524(this.anInt253);
			}
			if (this.aBoolean46) {
				this.aBoolean46 = false;
				this.aClass35_12.method524(this.anInt253);
				this.aClass1_Sub1_Sub2_Sub3_13.method418(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method448(28, 16777215, true, 55, this.aBoolean80, "Public chat");
				if (this.anInt376 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 65280, true, 55, this.aBoolean80, "On");
				}
				if (this.anInt376 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 16776960, true, 55, this.aBoolean80, "Friends");
				}
				if (this.anInt376 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 16711680, true, 55, this.aBoolean80, "Off");
				}
				if (this.anInt376 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 65535, true, 55, this.aBoolean80, "Hide");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(28, 16777215, true, 184, this.aBoolean80, "Private chat");
				if (this.anInt277 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 65280, true, 184, this.aBoolean80, "On");
				}
				if (this.anInt277 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 16776960, true, 184, this.aBoolean80, "Friends");
				}
				if (this.anInt277 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 16711680, true, 184, this.aBoolean80, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(28, 16777215, true, 324, this.aBoolean80, "Trade/compete");
				if (this.anInt325 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 65280, true, 324, this.aBoolean80, "On");
				}
				if (this.anInt325 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 16776960, true, 324, this.aBoolean80, "Friends");
				}
				if (this.anInt325 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, 16711680, true, 324, this.aBoolean80, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(33, 16777215, true, 458, this.aBoolean80, "Report abuse");
				this.aClass35_12.method525(453, 0, super.aGraphics2);
				this.aClass35_26.method524(this.anInt253);
			}
			this.anInt215 = 0;
		} catch (@Pc(1069) RuntimeException local1069) {
			signlink.reporterror("55516, " + 793 + ", " + local1069.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method213(@OriginalArg(0) int arg0) {
		try {
			this.aClass35_25.method524(this.anInt253);
			@Pc(19) int local19;
			@Pc(21) int local21;
			if (this.anInt340 == 2) {
				@Pc(14) byte[] local14 = this.aClass1_Sub1_Sub2_Sub3_11.aByteArray7;
				@Pc(16) int[] local16 = Class1_Sub1_Sub2.anIntArray213;
				local19 = local14.length;
				for (local21 = 0; local21 < local19; local21++) {
					if (local14[local21] == 0) {
						local16[local21] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_8.method395(256, this.anInt262, 33, this.anIntArray67, 0, this.anIntArray38, 33, 25, 25, 0);
				this.aClass35_26.method524(this.anInt253);
			} else {
				@Pc(66) int local66 = this.anInt262 + this.anInt265 & 0x7FF;
				@Pc(73) int local73 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32 + 48;
				local19 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
				this.aClass1_Sub1_Sub2_Sub2_14.method395(this.anInt396 + 256, local66, 151, this.anIntArray33, 25, this.anIntArray77, 146, local19, local73, 5);
				this.aClass1_Sub1_Sub2_Sub2_8.method395(256, this.anInt262, 33, this.anIntArray67, 0, this.anIntArray38, 33, 25, 25, 0);
				for (local21 = 0; local21 < this.anInt344; local21++) {
					local73 = this.anIntArray63[local21] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32;
					local19 = this.anIntArray64[local21] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
					this.method106(this.aClass1_Sub1_Sub2_Sub2Array4[local21], local73, local19);
				}
				@Pc(168) int local168;
				for (@Pc(164) int local164 = 0; local164 < 104; local164++) {
					for (local168 = 0; local168 < 104; local168++) {
						@Pc(180) Class29 local180 = this.aClass29ArrayArrayArray1[this.anInt320][local164][local168];
						if (local180 != null) {
							local73 = local164 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32;
							local19 = local168 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
							this.method106(this.aClass1_Sub1_Sub2_Sub2_3, local73, local19);
						}
					}
				}
				for (local168 = 0; local168 < this.anInt377; local168++) {
					@Pc(231) Class1_Sub1_Sub1_Sub1_Sub2 local231 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray80[local168]];
					if (local231 != null && local231.method680()) {
						@Pc(240) Class13 local240 = local231.aClass13_2;
						if (local240.anIntArray174 != null) {
							local240 = local240.method327(this.aByte17);
						}
						if (local240 != null && local240.aBoolean143) {
							local73 = local231.anInt1001 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32;
							local19 = local231.anInt1002 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
							this.method106(this.aClass1_Sub1_Sub2_Sub2_4, local73, local19);
						}
					}
				}
				@Pc(297) Class1_Sub1_Sub1_Sub1_Sub1 local297;
				for (@Pc(287) int local287 = 0; local287 < this.anInt238; local287++) {
					local297 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray36[local287]];
					if (local297 != null && local297.method680()) {
						local73 = local297.anInt1001 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32;
						local19 = local297.anInt1002 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
						@Pc(325) boolean local325 = false;
						@Pc(329) long local329 = Class48.method667(local297.aString3);
						for (@Pc(331) int local331 = 0; local331 < this.anInt275; local331++) {
							if (local329 == this.aLongArray4[local331] && this.anIntArray90[local331] != 0) {
								local325 = true;
								break;
							}
						}
						@Pc(356) boolean local356 = false;
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 != 0 && local297.anInt140 != 0 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 == local297.anInt140) {
							local356 = true;
						}
						if (local325) {
							this.method106(this.aClass1_Sub1_Sub2_Sub2_6, local73, local19);
						} else if (local356) {
							this.method106(this.aClass1_Sub1_Sub2_Sub2_7, local73, local19);
						} else {
							this.method106(this.aClass1_Sub1_Sub2_Sub2_5, local73, local19);
						}
					}
				}
				if (this.anInt379 != 0 && anInt283 % 20 < 10) {
					if (this.anInt379 == 1 && this.anInt327 >= 0 && this.anInt327 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(430) Class1_Sub1_Sub1_Sub1_Sub2 local430 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt327];
						if (local430 != null) {
							local73 = local430.anInt1001 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32;
							local19 = local430.anInt1002 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
							this.method126(403, local19, local73, this.aClass1_Sub1_Sub2_Sub2_2);
						}
					}
					if (this.anInt379 == 2) {
						local73 = (this.anInt313 - this.anInt353) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32;
						local19 = (this.anInt314 - this.anInt354) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
						this.method126(403, local19, local73, this.aClass1_Sub1_Sub2_Sub2_2);
					}
					if (this.anInt379 == 10 && this.anInt406 >= 0 && this.anInt406 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local297 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt406];
						if (local297 != null) {
							local73 = local297.anInt1001 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32;
							local19 = local297.anInt1002 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
							this.method126(403, local19, local73, this.aClass1_Sub1_Sub2_Sub2_2);
						}
					}
				}
				if (this.anInt420 != 0) {
					local73 = this.anInt420 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 / 32;
					local19 = this.anInt421 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 / 32;
					this.method106(this.aClass1_Sub1_Sub2_Sub2_1, local73, local19);
				}
				Class1_Sub1_Sub2.method439(97, 3, 16777215, 78, 3);
				this.aClass35_26.method524(this.anInt253);
				if (arg0 <= 0) {
					this.anInt413 = -1;
				}
			}
		} catch (@Pc(601) RuntimeException local601) {
			signlink.reporterror("90189, " + arg0 + ", " + local601.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method214() {
		try {
			this.aClass35_27.method524(this.anInt253);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray81;
			this.aClass1_Sub1_Sub2_Sub3_12.method418(0, 0);
			if (this.aBoolean75) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(0, 40, 239, this.aString4);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(128, 60, 239, this.aString17 + "*");
			} else if (this.aBoolean57) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(0, 40, 239, "Enter amount:");
				this.aClass1_Sub1_Sub2_Sub4_3.method447(128, 60, 239, this.aString8 + "*");
			} else if (this.aString16 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(0, 40, 239, this.aString16);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(128, 60, 239, "Click to continue");
			} else if (this.anInt371 != -1) {
				this.method115(Class6.aClass6Array1[this.anInt371], 0, 0, 0);
			} else if (this.anInt334 == -1) {
				@Pc(136) Class1_Sub1_Sub2_Sub4 local136 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(138) int local138 = 0;
				Class1_Sub1_Sub2.method436(0, 77, 463, 0);
				for (@Pc(146) int local146 = 0; local146 < 100; local146++) {
					if (this.aStringArray2[local146] != null) {
						@Pc(158) int local158 = this.anIntArray45[local146];
						@Pc(167) int local167 = this.anInt298 + 70 - local138 * 14;
						@Pc(172) String local172 = this.aStringArray1[local146];
						@Pc(174) byte local174 = 0;
						if (local172 != null && local172.startsWith("@cr1@")) {
							local172 = local172.substring(5);
							local174 = 1;
						}
						if (local172 != null && local172.startsWith("@cr2@")) {
							local172 = local172.substring(5);
							local174 = 2;
						}
						if (local158 == 0) {
							if (local167 > 0 && local167 < 110) {
								local136.method451(4, this.aStringArray2[local146], 0, local167);
							}
							local138++;
						}
						@Pc(244) int local244;
						if ((local158 == 1 || local158 == 2) && (local158 == 1 || this.anInt376 == 0 || this.anInt376 == 1 && this.method97(local172))) {
							if (local167 > 0 && local167 < 110) {
								local244 = 4;
								if (local174 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method418(local167 - 12, 4);
									local244 += 14;
								}
								if (local174 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method418(local167 - 12, local244);
									local244 += 14;
								}
								local136.method451(local244, local172 + ":", 0, local167);
								local244 += local136.method449(local172) + 8;
								local136.method451(local244, this.aStringArray2[local146], 255, local167);
							}
							local138++;
						}
						if ((local158 == 3 || local158 == 7) && this.anInt370 == 0 && (local158 == 7 || this.anInt277 == 0 || this.anInt277 == 1 && this.method97(local172))) {
							if (local167 > 0 && local167 < 110) {
								local136.method451(4, "From", 0, local167);
								local244 = local136.method449("From ") + 4;
								if (local174 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method418(local167 - 12, local244);
									local244 += 14;
								}
								if (local174 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method418(local167 - 12, local244);
									local244 += 14;
								}
								local136.method451(local244, local172 + ":", 0, local167);
								local244 += local136.method449(local172) + 8;
								local136.method451(local244, this.aStringArray2[local146], 8388608, local167);
							}
							local138++;
						}
						if (local158 == 4 && (this.anInt325 == 0 || this.anInt325 == 1 && this.method97(local172))) {
							if (local167 > 0 && local167 < 110) {
								local136.method451(4, local172 + " " + this.aStringArray2[local146], 8388736, local167);
							}
							local138++;
						}
						if (local158 == 5 && this.anInt370 == 0 && this.anInt277 < 2) {
							if (local167 > 0 && local167 < 110) {
								local136.method451(4, this.aStringArray2[local146], 8388608, local167);
							}
							local138++;
						}
						if (local158 == 6 && this.anInt370 == 0 && this.anInt277 < 2) {
							if (local167 > 0 && local167 < 110) {
								local136.method451(4, "To " + local172 + ":", 0, local167);
								local136.method451(local136.method449("To " + local172) + 12, this.aStringArray2[local146], 8388608, local167);
							}
							local138++;
						}
						if (local158 == 8 && (this.anInt325 == 0 || this.anInt325 == 1 && this.method97(local172))) {
							if (local167 > 0 && local167 < 110) {
								local136.method451(4, local172 + " " + this.aStringArray2[local146], 8270336, local167);
							}
							local138++;
						}
					}
				}
				Class1_Sub1_Sub2.method435();
				this.anInt311 = local138 * 14 + 7;
				if (this.anInt311 < 78) {
					this.anInt311 = 78;
				}
				this.method113(463, 0, this.anInt311 - this.anInt298 - 77, this.anInt311, 77);
				@Pc(614) String local614;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local614 = Class48.method671(this.aString6);
				} else {
					local614 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local136.method451(4, local614 + ":", 0, 90);
				local136.method451(local136.method449(local614 + ": ") + 6, this.aString5 + "*", 255, 90);
				Class1_Sub1_Sub2.method442(77, 479, 0, 0);
			} else {
				this.method115(Class6.aClass6Array1[this.anInt334], 0, 0, 0);
			}
			if (this.aBoolean81 && this.anInt384 == 2) {
				this.method161();
			}
			this.aClass35_27.method525(357, 17, super.aGraphics2);
			this.aClass35_26.method524(this.anInt253);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray83;
		} catch (@Pc(696) RuntimeException local696) {
			signlink.reporterror("63487, " + 18659 + ", " + local696.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method215(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt275; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt275--;
						this.aBoolean60 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt275; local28++) {
							this.aStringArray3[local28] = this.aStringArray3[local28 + 1];
							this.anIntArray90[local28] = this.anIntArray90[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method469(22);
						this.aClass1_Sub1_Sub3_2.method476(arg0);
						break;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("59745, " + true + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method216() {
		try {
			this.anInt350 = 0;
			@Pc(92) int local92;
			@Pc(71) int local71;
			for (@Pc(6) int local6 = -1; local6 < this.anInt238 + this.anInt377; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local6 < this.anInt238) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray36[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray80[local6 - this.anInt238]];
				}
				if (local13 != null && local13.method680()) {
					@Pc(54) Class13 local54;
					if (local13 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
						local54 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass13_2;
						if (local54.anIntArray174 != null) {
							local54 = local54.method327(this.aByte17);
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt238) {
						local54 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass13_2;
						if (local54.anInt580 >= 0 && local54.anInt580 < this.aClass1_Sub1_Sub2_Sub2Array7.length) {
							this.method149(local13.anInt1042 + 15, this.anInt422, local13);
							if (this.anInt250 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[local54.anInt580].method391(this.anInt251 - 30, this.anInt250 - 12);
							}
						}
						if (this.anInt379 == 1 && this.anInt327 == this.anIntArray80[local6 - this.anInt238] && anInt283 % 20 < 10) {
							this.method149(local13.anInt1042 + 15, this.anInt422, local13);
							if (this.anInt250 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[2].method391(this.anInt251 - 28, this.anInt250 - 12);
							}
						}
					} else {
						local71 = 30;
						@Pc(74) Class1_Sub1_Sub1_Sub1_Sub1 local74 = (Class1_Sub1_Sub1_Sub1_Sub1) local13;
						if (local74.anInt127 != 0) {
							this.method149(local13.anInt1042 + 15, this.anInt422, local13);
							if (this.anInt250 > -1) {
								for (local92 = 0; local92 < 8; local92++) {
									if ((local74.anInt127 & 0x1 << local92) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array7[local92].method391(this.anInt251 - local71, this.anInt250 - 12);
										local71 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt379 == 10 && this.anInt406 == this.anIntArray36[local6]) {
							this.method149(local13.anInt1042 + 15, this.anInt422, local13);
							if (this.anInt250 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[7].method391(this.anInt251 - local71, this.anInt250 - 12);
							}
						}
					}
					if (local13.aString31 != null && (local6 >= this.anInt238 || this.anInt376 == 0 || this.anInt376 == 3 || this.anInt376 == 1 && this.method97(((Class1_Sub1_Sub1_Sub1_Sub1) local13).aString3))) {
						this.method149(local13.anInt1042, this.anInt422, local13);
						if (this.anInt250 > -1 && this.anInt350 < this.anInt351) {
							this.anIntArray72[this.anInt350] = this.aClass1_Sub1_Sub2_Sub4_3.method450(local13.aString31) / 2;
							this.anIntArray71[this.anInt350] = this.aClass1_Sub1_Sub2_Sub4_3.anInt724;
							this.anIntArray69[this.anInt350] = this.anInt250;
							this.anIntArray70[this.anInt350] = this.anInt251;
							this.anIntArray73[this.anInt350] = local13.anInt1013;
							this.anIntArray74[this.anInt350] = local13.anInt1014;
							this.anIntArray75[this.anInt350] = local13.anInt1012;
							this.aStringArray4[this.anInt350++] = local13.aString31;
							if (this.anInt257 == 0 && local13.anInt1014 >= 1 && local13.anInt1014 <= 3) {
								this.anIntArray71[this.anInt350] += 10;
								this.anIntArray70[this.anInt350] += 5;
							}
							if (this.anInt257 == 0 && local13.anInt1014 == 4) {
								this.anIntArray72[this.anInt350] = 60;
							}
							if (this.anInt257 == 0 && local13.anInt1014 == 5) {
								this.anIntArray71[this.anInt350] += 5;
							}
						}
					}
					if (local13.anInt1015 > anInt283) {
						this.method149(local13.anInt1042 + 15, this.anInt422, local13);
						if (this.anInt250 > -1) {
							local71 = local13.anInt1016 * 30 / local13.anInt1017;
							if (local71 > 30) {
								local71 = 30;
							}
							Class1_Sub1_Sub2.method439(this.anInt250 - 15, local71, 65280, this.anInt251 - 3, 5);
							Class1_Sub1_Sub2.method439(this.anInt250 + local71 - 15, 30 - local71, 16711680, this.anInt251 - 3, 5);
						}
					}
					for (local71 = 0; local71 < 4; local71++) {
						if (local13.anIntArray271[local71] > anInt283) {
							this.method149(local13.anInt1042 / 2, this.anInt422, local13);
							if (this.anInt250 > -1) {
								if (local71 == 1) {
									this.anInt251 -= 20;
								}
								if (local71 == 2) {
									this.anInt250 -= 15;
									this.anInt251 -= 10;
								}
								if (local71 == 3) {
									this.anInt250 += 15;
									this.anInt251 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array6[local13.anIntArray270[local71]].method391(this.anInt251 - 12, this.anInt250 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(0, this.anInt251 + 4, this.anInt250, String.valueOf(local13.anIntArray269[local71]));
								this.aClass1_Sub1_Sub2_Sub4_1.method447(16777215, this.anInt251 + 3, this.anInt250 - 1, String.valueOf(local13.anIntArray269[local71]));
							}
						}
					}
				}
			}
			for (@Pc(603) int local603 = 0; local603 < this.anInt350; local603++) {
				local71 = this.anIntArray69[local603];
				@Pc(615) int local615 = this.anIntArray70[local603];
				local92 = this.anIntArray72[local603];
				@Pc(625) int local625 = this.anIntArray71[local603];
				@Pc(627) boolean local627 = true;
				while (local627) {
					local627 = false;
					for (@Pc(633) int local633 = 0; local633 < local603; local633++) {
						if (local615 + 2 > this.anIntArray70[local633] - this.anIntArray71[local633] && local615 - local625 < this.anIntArray70[local633] + 2 && local71 - local92 < this.anIntArray69[local633] + this.anIntArray72[local633] && local71 + local92 > this.anIntArray69[local633] - this.anIntArray72[local633] && this.anIntArray70[local633] - this.anIntArray71[local633] < local615) {
							local615 = this.anIntArray70[local633] - this.anIntArray71[local633];
							local627 = true;
						}
					}
				}
				this.anInt250 = this.anIntArray69[local603];
				this.anInt251 = this.anIntArray70[local603] = local615;
				@Pc(732) String local732 = this.aStringArray4[local603];
				if (this.anInt257 == 0) {
					@Pc(737) int local737 = 16776960;
					if (this.anIntArray73[local603] < 6) {
						local737 = this.anIntArray43[this.anIntArray73[local603]];
					}
					if (this.anIntArray73[local603] == 6) {
						local737 = this.anInt273 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray73[local603] == 7) {
						local737 = this.anInt273 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray73[local603] == 8) {
						local737 = this.anInt273 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(812) int local812;
					if (this.anIntArray73[local603] == 9) {
						local812 = 150 - this.anIntArray75[local603];
						if (local812 < 50) {
							local737 = local812 * 1280 + 16711680;
						} else if (local812 < 100) {
							local737 = 16776960 - (local812 - 50) * 327680;
						} else if (local812 < 150) {
							local737 = (local812 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray73[local603] == 10) {
						local812 = 150 - this.anIntArray75[local603];
						if (local812 < 50) {
							local737 = local812 * 5 + 16711680;
						} else if (local812 < 100) {
							local737 = 16711935 - (local812 - 50) * 327680;
						} else if (local812 < 150) {
							local737 = (local812 - 100) * 327680 + 255 - (local812 - 100) * 5;
						}
					}
					if (this.anIntArray73[local603] == 11) {
						local812 = 150 - this.anIntArray75[local603];
						if (local812 < 50) {
							local737 = 16777215 - local812 * 327685;
						} else if (local812 < 100) {
							local737 = (local812 - 50) * 327685 + 65280;
						} else if (local812 < 150) {
							local737 = 16777215 - (local812 - 100) * 327680;
						}
					}
					if (this.anIntArray74[local603] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method447(0, this.anInt251 + 1, this.anInt250, local732);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local737, this.anInt251, this.anInt250, local732);
					}
					if (this.anIntArray74[local603] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method452(914, 0, local732, this.anInt251 + 1, this.anInt250, this.anInt273);
						this.aClass1_Sub1_Sub2_Sub4_3.method452(914, local737, local732, this.anInt251, this.anInt250, this.anInt273);
					}
					if (this.anIntArray74[local603] == 2) {
						this.aClass1_Sub1_Sub2_Sub4_3.method453(this.anInt251 + 1, 0, this.anInt250, local732, this.anInt273);
						this.aClass1_Sub1_Sub2_Sub4_3.method453(this.anInt251, local737, this.anInt250, local732, this.anInt273);
					}
					if (this.anIntArray74[local603] == 3) {
						this.aClass1_Sub1_Sub2_Sub4_3.method454(150 - this.anIntArray75[local603], this.anInt251 + 1, this.anInt250, this.anInt273, local732, 0, 87);
						this.aClass1_Sub1_Sub2_Sub4_3.method454(150 - this.anIntArray75[local603], this.anInt251, this.anInt250, this.anInt273, local732, local737, 87);
					}
					@Pc(1109) int local1109;
					if (this.anIntArray74[local603] == 4) {
						local812 = this.aClass1_Sub1_Sub2_Sub4_3.method450(local732);
						local1109 = (150 - this.anIntArray75[local603]) * (local812 + 100) / 150;
						Class1_Sub1_Sub2.method436(this.anInt250 - 50, 334, this.anInt250 + 50, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(this.anInt250 + 50 - local1109, local732, 0, this.anInt251 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(this.anInt250 + 50 - local1109, local732, local737, this.anInt251);
						Class1_Sub1_Sub2.method435();
					}
					if (this.anIntArray74[local603] == 5) {
						local812 = 150 - this.anIntArray75[local603];
						local1109 = 0;
						if (local812 < 25) {
							local1109 = local812 - 25;
						} else if (local812 > 125) {
							local1109 = local812 - 125;
						}
						Class1_Sub1_Sub2.method436(0, this.anInt251 + 5, 512, this.anInt251 - this.aClass1_Sub1_Sub2_Sub4_3.anInt724 - 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(0, this.anInt251 + local1109 + 1, this.anInt250, local732);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local737, this.anInt251 + local1109, this.anInt250, local732);
						Class1_Sub1_Sub2.method435();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method447(0, this.anInt251 + 1, this.anInt250, local732);
					this.aClass1_Sub1_Sub2_Sub4_3.method447(16776960, this.anInt251, this.anInt250, local732);
				}
			}
		} catch (@Pc(1267) RuntimeException local1267) {
			signlink.reporterror("50163, " + 8 + ", " + local1267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method217() {
		try {
			if (super.anInt198 == 1) {
				if (super.anInt199 >= 6 && super.anInt199 <= 106 && super.anInt200 >= 467 && super.anInt200 <= 499) {
					this.anInt376 = (this.anInt376 + 1) % 4;
					this.aBoolean46 = true;
					this.aBoolean53 = true;
					this.aClass1_Sub1_Sub3_2.method469(215);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt376);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt277);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt325);
				}
				if (super.anInt199 >= 135 && super.anInt199 <= 235 && super.anInt200 >= 467 && super.anInt200 <= 499) {
					this.anInt277 = (this.anInt277 + 1) % 3;
					this.aBoolean46 = true;
					this.aBoolean53 = true;
					this.aClass1_Sub1_Sub3_2.method469(215);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt376);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt277);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt325);
				}
				if (super.anInt199 >= 273 && super.anInt199 <= 373 && super.anInt200 >= 467 && super.anInt200 <= 499) {
					this.anInt325 = (this.anInt325 + 1) % 3;
					this.aBoolean46 = true;
					this.aBoolean53 = true;
					this.aClass1_Sub1_Sub3_2.method469(215);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt376);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt277);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt325);
				}
				if (super.anInt199 >= 412 && super.anInt199 <= 512 && super.anInt200 >= 467 && super.anInt200 <= 499) {
					if (this.anInt254 == -1) {
						this.method125();
						this.aString9 = "";
						this.aBoolean86 = false;
						for (@Pc(190) int local190 = 0; local190 < Class6.aClass6Array1.length; local190++) {
							if (Class6.aClass6Array1[local190] != null && Class6.aClass6Array1[local190].anInt436 == 600) {
								this.anInt304 = this.anInt254 = Class6.aClass6Array1[local190].anInt433;
								return;
							}
						}
						return;
					}
					this.method171(0, "Please close the interface you have open before using 'report abuse'", "");
					return;
				}
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("36439, " + 9 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method218() {
		try {
			if (this.aByte11 != 42) {
				this.anInt413 = -1;
			}
			@Pc(10) int local10 = 5;
			this.anIntArray55[8] = 0;
			@Pc(17) int local17 = 0;
			while (this.anIntArray55[8] == 0) {
				@Pc(21) String local21 = "Unknown problem";
				this.method96(20, "Connecting to web server", (byte) 7);
				try {
					@Pc(43) DataInputStream local43 = this.method199("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 300);
					@Pc(50) Class1_Sub1_Sub3 local50 = new Class1_Sub1_Sub3(false, new byte[40]);
					local43.readFully(local50.aByteArray9, 0, 40);
					local43.close();
					for (@Pc(60) int local60 = 0; local60 < 9; local60++) {
						this.anIntArray55[local60] = local50.method485();
					}
					@Pc(75) int local75 = local50.method485();
					@Pc(77) int local77 = 1234;
					for (@Pc(79) int local79 = 0; local79 < 9; local79++) {
						local77 = (local77 << 1) + this.anIntArray55[local79];
					}
					if (local75 != local77) {
						local21 = "checksum problem";
						this.anIntArray55[8] = 0;
					}
				} catch (@Pc(106) EOFException local106) {
					local21 = "EOF problem";
					this.anIntArray55[8] = 0;
				} catch (@Pc(115) IOException local115) {
					local21 = "connection problem";
					this.anIntArray55[8] = 0;
				} catch (@Pc(124) Exception local124) {
					local21 = "logic problem";
					this.anIntArray55[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray55[8] == 0) {
					local17++;
					for (@Pc(142) int local142 = local10; local142 > 0; local142--) {
						if (local17 >= 10) {
							this.method96(10, "Game updated - please reload page", (byte) 7);
							local142 = 10;
						} else {
							this.method96(10, local21 + " - Will retry in " + local142 + " secs.", (byte) 7);
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
					this.aBoolean87 = !this.aBoolean87;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("11778, " + 42 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!lb;)V")
	private void method219(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			@Pc(16) int local16 = arg1.method491(8);
			@Pc(22) int local22;
			if (local16 < this.anInt377) {
				for (local22 = local16; local22 < this.anInt377; local22++) {
					this.anIntArray44[this.anInt252++] = this.anIntArray80[local22];
				}
			}
			if (local16 > this.anInt377) {
				signlink.reporterror(this.aString6 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt377 = 0;
			for (local22 = 0; local22 < local16; local22++) {
				@Pc(74) int local74 = this.anIntArray80[local22];
				@Pc(79) Class1_Sub1_Sub1_Sub1_Sub2 local79 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local74];
				@Pc(84) int local84 = arg1.method491(1);
				if (local84 == 0) {
					this.anIntArray80[this.anInt377++] = local74;
					local79.anInt1041 = anInt283;
				} else {
					@Pc(107) int local107 = arg1.method491(2);
					if (local107 == 0) {
						this.anIntArray80[this.anInt377++] = local74;
						local79.anInt1041 = anInt283;
						this.anIntArray37[this.anInt239++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(168) int local168;
						if (local107 == 1) {
							this.anIntArray80[this.anInt377++] = local74;
							local79.anInt1041 = anInt283;
							local158 = arg1.method491(3);
							local79.method678(false, local158);
							local168 = arg1.method491(1);
							if (local168 == 1) {
								this.anIntArray37[this.anInt239++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray80[this.anInt377++] = local74;
							local79.anInt1041 = anInt283;
							local158 = arg1.method491(3);
							local79.method678(true, local158);
							local168 = arg1.method491(3);
							local79.method678(true, local168);
							@Pc(226) int local226 = arg1.method491(1);
							if (local226 == 1) {
								this.anIntArray37[this.anInt239++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray44[this.anInt252++] = local74;
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("7446, " + 580 + ", " + arg0 + ", " + arg1 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)Z")
	private boolean method220() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("69818, " + 103 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method221(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt961 = arg0;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("28532, " + arg0 + ", " + 2 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;)Z")
	private boolean method222(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt436;
			if (this.aByte20 == 3) {
				@Pc(10) boolean local10 = false;
			} else {
				this.anInt394 = 385;
			}
			if (this.anInt276 == 2) {
				if (local4 == 201) {
					this.aBoolean53 = true;
					this.aBoolean57 = false;
					this.aBoolean75 = true;
					this.aString17 = "";
					this.anInt357 = 1;
					this.aString4 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean53 = true;
					this.aBoolean57 = false;
					this.aBoolean75 = true;
					this.aString17 = "";
					this.anInt357 = 2;
					this.aString4 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt416 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean53 = true;
				this.aBoolean57 = false;
				this.aBoolean75 = true;
				this.aString17 = "";
				this.anInt357 = 4;
				this.aString4 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean53 = true;
				this.aBoolean57 = false;
				this.aBoolean75 = true;
				this.aString17 = "";
				this.anInt357 = 5;
				this.aString4 = "Enter name of player to delete from list";
			}
			@Pc(123) int local123;
			@Pc(127) int local127;
			@Pc(132) int local132;
			if (local4 >= 300 && local4 <= 313) {
				local123 = (local4 - 300) / 2;
				local127 = local4 & 0x1;
				local132 = this.anIntArray85[local123];
				if (local132 != -1) {
					while (true) {
						if (local127 == 0) {
							local132--;
							if (local132 < 0) {
								local132 = Class23.anInt764 - 1;
							}
						}
						if (local127 == 1) {
							local132++;
							if (local132 >= Class23.anInt764) {
								local132 = 0;
							}
						}
						if (!Class23.aClass23Array1[local132].aBoolean187 && Class23.aClass23Array1[local132].anInt765 == local123 + (this.aBoolean41 ? 0 : 7)) {
							this.anIntArray85[local123] = local132;
							this.aBoolean65 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local123 = (local4 - 314) / 2;
				local127 = local4 & 0x1;
				local132 = this.anIntArray93[local123];
				if (local127 == 0) {
					local132--;
					if (local132 < 0) {
						local132 = anIntArrayArray4[local123].length - 1;
					}
				}
				if (local127 == 1) {
					local132++;
					if (local132 >= anIntArrayArray4[local123].length) {
						local132 = 0;
					}
				}
				this.anIntArray93[local123] = local132;
				this.aBoolean65 = true;
			}
			if (local4 == 324 && !this.aBoolean41) {
				this.aBoolean41 = true;
				this.method185(this.aBoolean72);
			}
			if (local4 == 325 && this.aBoolean41) {
				this.aBoolean41 = false;
				this.method185(this.aBoolean72);
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub3_2.method469(247);
				this.aClass1_Sub1_Sub3_2.method470(this.aBoolean41 ? 0 : 1);
				for (local123 = 0; local123 < 7; local123++) {
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray85[local123]);
				}
				for (local127 = 0; local127 < 5; local127++) {
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray93[local127]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean86 = !this.aBoolean86;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method125();
				if (this.aString9.length() > 0) {
					this.aClass1_Sub1_Sub3_2.method469(217);
					this.aClass1_Sub1_Sub3_2.method476(Class48.method667(this.aString9));
					this.aClass1_Sub1_Sub3_2.method470(local4 - 601);
					this.aClass1_Sub1_Sub3_2.method470(this.aBoolean86 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("38615, " + arg0 + ", " + arg1 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!lb;)V")
	private void method223(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt758 + 21 < arg0 * 8) {
					@Pc(21) int local21 = arg1.method491(14);
					if (local21 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local21] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local21] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(41) Class1_Sub1_Sub1_Sub1_Sub2 local41 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local21];
						this.anIntArray80[this.anInt377++] = local21;
						local41.anInt1041 = anInt283;
						local41.aClass13_2 = Class13.method323(arg1.method491(12));
						local41.anInt1004 = local41.aClass13_2.aByte33;
						local41.anInt1044 = local41.aClass13_2.anInt581;
						local41.anInt1007 = local41.aClass13_2.anInt568;
						local41.anInt1008 = local41.aClass13_2.anInt569;
						local41.anInt1009 = local41.aClass13_2.anInt570;
						local41.anInt1010 = local41.aClass13_2.anInt571;
						local41.anInt1005 = local41.aClass13_2.anInt567;
						@Pc(102) int local102 = arg1.method491(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						@Pc(111) int local111 = arg1.method491(5);
						if (local111 > 15) {
							local111 -= 32;
						}
						@Pc(120) int local120 = arg1.method491(1);
						local41.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local111, local120 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local102);
						@Pc(146) int local146 = arg1.method491(1);
						if (local146 == 1) {
							this.anIntArray37[this.anInt239++] = local21;
						}
						continue;
					}
				}
				arg1.method492();
				return;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("97353, " + arg0 + ", " + -45 + ", " + arg1 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method224(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_3.method511();
			@Pc(11) boolean local11 = false;
			while (local6 != null) {
				if (local6.anInt467 != this.anInt320 || anInt283 > local6.anInt473) {
					local6.method673();
				} else if (anInt283 >= local6.anInt472) {
					if (local6.anInt476 > 0) {
						@Pc(46) Class1_Sub1_Sub1_Sub1_Sub2 local46 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt476 - 1];
						if (local46 != null && local46.anInt1001 >= 0 && local46.anInt1001 < 13312 && local46.anInt1002 >= 0 && local46.anInt1002 < 13312) {
							local6.method241(local46.anInt1001, anInt283, this.method181(local46.anInt1002, local46.anInt1001, local6.anInt467) - local6.anInt471, local46.anInt1002);
						}
					}
					if (local6.anInt476 < 0) {
						@Pc(91) int local91 = -local6.anInt476 - 1;
						@Pc(97) Class1_Sub1_Sub1_Sub1_Sub1 local97;
						if (local91 == this.anInt247) {
							local97 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local97 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local91];
						}
						if (local97 != null && local97.anInt1001 >= 0 && local97.anInt1001 < 13312 && local97.anInt1002 >= 0 && local97.anInt1002 < 13312) {
							local6.method241(local97.anInt1001, anInt283, this.method181(local97.anInt1002, local97.anInt1001, local6.anInt467) - local6.anInt471, local97.anInt1002);
						}
					}
					local6.method242((byte) 5, this.anInt215);
					this.aClass37_1.method541(local6.anInt477, 60, (int) local6.aDouble3, false, local6, this.anInt320, (int) local6.aDouble2, -1, (int) local6.aDouble1);
				}
				local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_3.method513();
			}
			anInt389++;
			if (anInt389 > 1174) {
				anInt389 = 0;
				this.aClass1_Sub1_Sub3_2.method469(179);
				this.aClass1_Sub1_Sub3_2.method470(0);
				@Pc(197) int local197 = this.aClass1_Sub1_Sub3_2.anInt757;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method471(11499);
				}
				this.aClass1_Sub1_Sub3_2.method471(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method470(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method470(94);
				}
				this.aClass1_Sub1_Sub3_2.method471(51693);
				this.aClass1_Sub1_Sub3_2.method470(16);
				this.aClass1_Sub1_Sub3_2.method471(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method470(65);
				}
				this.aClass1_Sub1_Sub3_2.method470((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_2.method471(22990);
				this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt757 - local197);
			}
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("31281, " + arg0 + ", " + local271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
	private void method225(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_14.anIntArray208;
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
						this.aClass37_1.method565(local5, local34, arg1, local36, local22);
					}
					if (arg1 < 3 && (this.aByteArrayArrayArray7[arg1 + 1][local36][local22] & 0x8) != 0) {
						this.aClass37_1.method565(local5, local34, arg1 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_14.method386(this.anInt253);
			@Pc(147) int local147;
			for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
				for (local147 = 1; local147 < 103; local147++) {
					if ((this.aByteArrayArrayArray7[arg1][local147][local143] & 0x18) == 0) {
						this.method131(arg1, local143, local36, this.anInt322, local34, local147);
					}
					if (arg1 < 3 && (this.aByteArrayArrayArray7[arg1 + 1][local147][local143] & 0x8) != 0) {
						this.method131(arg1 + 1, local143, local36, this.anInt322, local34, local147);
					}
				}
			}
			this.aClass35_26.method524(this.anInt253);
			this.anInt344 = 0;
			for (local147 = 0; local147 < 104; local147++) {
				for (@Pc(218) int local218 = 0; local218 < 104; local218++) {
					@Pc(228) int local228 = this.aClass37_1.method559(this.anInt320, local147, local218);
					if (local228 != 0) {
						local228 = local228 >> 14 & 0x7FFF;
						@Pc(240) int local240 = Class9.method288(local228).anInt520;
						if (local240 >= 0) {
							@Pc(244) int local244 = local147;
							@Pc(246) int local246 = local218;
							if (local240 != 22 && local240 != 29 && local240 != 34 && local240 != 36 && local240 != 46 && local240 != 47 && local240 != 48) {
								@Pc(278) int[][] local278 = this.aClass19Array1[this.anInt320].anIntArrayArray18;
								for (@Pc(280) int local280 = 0; local280 < 10; local280++) {
									@Pc(287) int local287 = (int) (Math.random() * 4.0D);
									if (local287 == 0 && local244 > 0 && local244 > local147 - 3 && (local278[local244 - 1][local246] & 0x280108) == 0) {
										local244--;
									}
									if (local287 == 1 && local244 < 103 && local244 < local147 + 3 && (local278[local244 + 1][local246] & 0x280180) == 0) {
										local244++;
									}
									if (local287 == 2 && local246 > 0 && local246 > local218 - 3 && (local278[local244][local246 - 1] & 0x280102) == 0) {
										local246--;
									}
									if (local287 == 3 && local246 < 103 && local246 < local218 + 3 && (local278[local244][local246 + 1] & 0x280120) == 0) {
										local246++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array4[this.anInt344] = this.aClass1_Sub1_Sub2_Sub2Array3[local240];
							this.anIntArray63[this.anInt344] = local244;
							this.anIntArray64[this.anInt344] = local246;
							this.anInt344++;
						}
					}
				}
			}
			@Pc(420) boolean local420 = false;
			anInt287++;
			if (anInt287 > 112) {
				anInt287 = 0;
				this.aClass1_Sub1_Sub3_2.method469(65);
				this.aClass1_Sub1_Sub3_2.method470(50);
			}
		} catch (@Pc(447) RuntimeException local447) {
			signlink.reporterror("50279, " + arg0 + ", " + arg1 + ", " + local447.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method226(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt281 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt281 > 768) {
						this.anIntArray86[local8] = this.method101(this.anIntArray88[local8], this.anIntArray87[local8], 1024 - this.anInt281, 704);
					} else if (this.anInt281 > 256) {
						this.anIntArray86[local8] = this.anIntArray88[local8];
					} else {
						this.anIntArray86[local8] = this.method101(this.anIntArray87[local8], this.anIntArray88[local8], 256 - this.anInt281, 704);
					}
				}
			} else if (this.anInt282 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt282 > 768) {
						this.anIntArray86[local8] = this.method101(this.anIntArray89[local8], this.anIntArray87[local8], 1024 - this.anInt282, 704);
					} else if (this.anInt282 > 256) {
						this.anIntArray86[local8] = this.anIntArray89[local8];
					} else {
						this.anIntArray86[local8] = this.method101(this.anIntArray87[local8], this.anIntArray89[local8], 256 - this.anInt282, 704);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray86[local8] = this.anIntArray87[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass35_6.anIntArray231[local8] = this.aClass1_Sub1_Sub2_Sub2_12.anIntArray208[local8];
			}
			@Pc(179) int local179 = 0;
			@Pc(181) int local181 = 1152;
			@Pc(196) int local196;
			@Pc(200) int local200;
			@Pc(210) int local210;
			@Pc(218) int local218;
			@Pc(222) int local222;
			@Pc(226) int local226;
			@Pc(237) int local237;
			for (@Pc(183) int local183 = 1; local183 < 255; local183++) {
				local196 = this.anIntArray46[local183] * (256 - local183) / 256;
				local200 = local196 + 22;
				if (local200 < 0) {
					local200 = 0;
				}
				local179 += local200;
				for (local210 = local200; local210 < 128; local210++) {
					local218 = this.anIntArray57[local179++];
					if (local218 == 0) {
						local181++;
					} else {
						local222 = local218;
						local226 = 256 - local218;
						local218 = this.anIntArray86[local218];
						local237 = this.aClass35_6.anIntArray231[local181];
						this.aClass35_6.anIntArray231[local181++] = ((local218 & 0xFF00FF) * local222 + (local237 & 0xFF00FF) * local226 & 0xFF00FF00) + ((local218 & 0xFF00) * local222 + (local237 & 0xFF00) * local226 & 0xFF0000) >> 8;
					}
				}
				local181 += local200;
			}
			this.aClass35_6.method525(0, 0, super.aGraphics2);
			@Pc(301) boolean local301 = false;
			for (local196 = 0; local196 < 33920; local196++) {
				this.aClass35_7.anIntArray231[local196] = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray208[local196];
			}
			local179 = 0;
			local181 = 1176;
			for (local200 = 1; local200 < 255; local200++) {
				local210 = this.anIntArray46[local200] * (256 - local200) / 256;
				local218 = 103 - local210;
				local181 += local210;
				for (local222 = 0; local222 < local218; local222++) {
					local226 = this.anIntArray57[local179++];
					if (local226 == 0) {
						local181++;
					} else {
						local237 = local226;
						@Pc(364) int local364 = 256 - local226;
						local226 = this.anIntArray86[local226];
						@Pc(375) int local375 = this.aClass35_7.anIntArray231[local181];
						this.aClass35_7.anIntArray231[local181++] = ((local226 & 0xFF00FF) * local237 + (local375 & 0xFF00FF) * local364 & 0xFF00FF00) + ((local226 & 0xFF00) * local237 + (local375 & 0xFF00) * local364 & 0xFF0000) >> 8;
					}
				}
				local179 += 128 - local218;
				local181 += 128 - local218 - local210;
			}
			this.aClass35_7.method525(0, 637, super.aGraphics2);
		} catch (@Pc(447) RuntimeException local447) {
			signlink.reporterror("47157, " + arg0 + ", " + local447.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;B)V")
	@Override
	protected void method96(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt228 = arg0;
			this.aString14 = arg1;
			this.method107();
			if (this.aClass47_1 == null) {
				super.method96(arg0, arg1, (byte) 7);
			} else {
				this.aClass35_5.method524(this.anInt253);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(16777215, 54, 180, "RuneScape is loading - please wait...");
				Class1_Sub1_Sub2.method440(9179409, 28, 62, 304, 34);
				Class1_Sub1_Sub2.method440(0, 29, 63, 302, 32);
				Class1_Sub1_Sub2.method439(30, arg0 * 3, 9179409, 64, 30);
				Class1_Sub1_Sub2.method439(arg0 * 3 + 30, 300 - arg0 * 3, 0, 64, 30);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(16777215, 85, 180, arg1);
				this.aClass35_5.method525(171, 202, super.aGraphics2);
				if (this.aBoolean47) {
					this.aBoolean47 = false;
					if (!this.aBoolean66) {
						this.aClass35_6.method525(0, 0, super.aGraphics2);
						this.aClass35_7.method525(0, 637, super.aGraphics2);
					}
					this.aClass35_3.method525(0, 128, super.aGraphics2);
					this.aClass35_4.method525(371, 202, super.aGraphics2);
					this.aClass35_8.method525(265, 0, super.aGraphics2);
					this.aClass35_9.method525(265, 562, super.aGraphics2);
					this.aClass35_10.method525(171, 128, super.aGraphics2);
					this.aClass35_11.method525(171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("51398, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!d;)V")
	private void method227(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt436;
			if (arg0 != 3) {
				this.anInt381 = this.aClass46_1.method662();
			}
			@Pc(68) int local68;
			if (local4 >= 1 && local4 <= 100 || local4 >= 701 && local4 <= 800) {
				if (local4 == 1 && this.anInt276 == 0) {
					arg1.aString18 = "Loading friend list";
					arg1.anInt435 = 0;
				} else if (local4 == 1 && this.anInt276 == 1) {
					arg1.aString18 = "Connecting to friendserver";
					arg1.anInt435 = 0;
				} else if (local4 == 2 && this.anInt276 != 2) {
					arg1.aString18 = "Please wait...";
					arg1.anInt435 = 0;
				} else {
					local68 = this.anInt275;
					if (this.anInt276 != 2) {
						local68 = 0;
					}
					if (local4 > 700) {
						local4 -= 601;
					} else {
						local4--;
					}
					if (local4 >= local68) {
						arg1.aString18 = "";
						arg1.anInt435 = 0;
					} else {
						arg1.aString18 = this.aStringArray3[local4];
						arg1.anInt435 = 1;
					}
				}
			} else if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
				local68 = this.anInt275;
				if (this.anInt276 != 2) {
					local68 = 0;
				}
				if (local4 > 800) {
					local4 -= 701;
				} else {
					local4 -= 101;
				}
				if (local4 >= local68) {
					arg1.aString18 = "";
					arg1.anInt435 = 0;
				} else {
					if (this.anIntArray90[local4] == 0) {
						arg1.aString18 = "@red@Offline";
					} else if (this.anIntArray90[local4] == anInt255) {
						arg1.aString18 = "@gre@World-" + (this.anIntArray90[local4] - 9);
					} else {
						arg1.aString18 = "@yel@World-" + (this.anIntArray90[local4] - 9);
					}
					arg1.anInt435 = 1;
				}
			} else if (local4 == 203) {
				local68 = this.anInt275;
				if (this.anInt276 != 2) {
					local68 = 0;
				}
				arg1.anInt442 = local68 * 15 + 20;
				if (arg1.anInt442 <= arg1.anInt438) {
					arg1.anInt442 = arg1.anInt438 + 1;
				}
			} else if (local4 >= 401 && local4 <= 500) {
				local4 -= 401;
				if (local4 == 0 && this.anInt276 == 0) {
					arg1.aString18 = "Loading ignore list";
					arg1.anInt435 = 0;
				} else if (local4 == 1 && this.anInt276 == 0) {
					arg1.aString18 = "Please wait...";
					arg1.anInt435 = 0;
				} else {
					local68 = this.anInt361;
					if (this.anInt276 == 0) {
						local68 = 0;
					}
					if (local4 >= local68) {
						arg1.aString18 = "";
						arg1.anInt435 = 0;
					} else {
						arg1.aString18 = Class48.method671(Class48.method668(this.aLongArray3[local4]));
						arg1.anInt435 = 1;
					}
				}
			} else if (local4 == 503) {
				arg1.anInt442 = this.anInt361 * 15 + 20;
				if (arg1.anInt442 <= arg1.anInt438) {
					arg1.anInt442 = arg1.anInt438 + 1;
				}
			} else if (local4 == 327) {
				arg1.anInt458 = 150;
				arg1.anInt459 = (int) (Math.sin((double) anInt283 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean65) {
					for (local68 = 0; local68 < 7; local68++) {
						@Pc(337) int local337 = this.anIntArray85[local68];
						if (local337 >= 0 && !Class23.aClass23Array1[local337].method498()) {
							return;
						}
					}
					this.aBoolean65 = false;
					@Pc(356) Class1_Sub1_Sub1_Sub5[] local356 = new Class1_Sub1_Sub1_Sub5[7];
					@Pc(358) int local358 = 0;
					for (@Pc(360) int local360 = 0; local360 < 7; local360++) {
						@Pc(367) int local367 = this.anIntArray85[local360];
						if (local367 >= 0) {
							local356[local358++] = Class23.aClass23Array1[local367].method499((byte) 5);
						}
					}
					@Pc(389) Class1_Sub1_Sub1_Sub5 local389 = new Class1_Sub1_Sub1_Sub5(local358, local356, (byte) 1);
					for (@Pc(391) int local391 = 0; local391 < 5; local391++) {
						if (this.anIntArray93[local391] != 0) {
							local389.method275(anIntArrayArray4[local391][0], anIntArrayArray4[local391][this.anIntArray93[local391]]);
							if (local391 == 1) {
								local389.method275(anIntArray79[0], anIntArray79[this.anIntArray93[local391]]);
							}
						}
					}
					local389.method268(this.anInt398);
					local389.method269(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005].anIntArray225[0]);
					local389.method278(64, 850, -30, -50, -30, true);
					arg1.anInt451 = 5;
					arg1.anInt452 = 0;
					Class6.method235(local389);
				}
			} else if (local4 == 324) {
				if (this.aClass1_Sub1_Sub2_Sub2_10 == null) {
					this.aClass1_Sub1_Sub2_Sub2_10 = arg1.aClass1_Sub1_Sub2_Sub2_15;
					this.aClass1_Sub1_Sub2_Sub2_11 = arg1.aClass1_Sub1_Sub2_Sub2_16;
				}
				if (this.aBoolean41) {
					arg1.aClass1_Sub1_Sub2_Sub2_15 = this.aClass1_Sub1_Sub2_Sub2_11;
				} else {
					arg1.aClass1_Sub1_Sub2_Sub2_15 = this.aClass1_Sub1_Sub2_Sub2_10;
				}
			} else if (local4 == 325) {
				if (this.aClass1_Sub1_Sub2_Sub2_10 == null) {
					this.aClass1_Sub1_Sub2_Sub2_10 = arg1.aClass1_Sub1_Sub2_Sub2_15;
					this.aClass1_Sub1_Sub2_Sub2_11 = arg1.aClass1_Sub1_Sub2_Sub2_16;
				}
				if (this.aBoolean41) {
					arg1.aClass1_Sub1_Sub2_Sub2_15 = this.aClass1_Sub1_Sub2_Sub2_10;
				} else {
					arg1.aClass1_Sub1_Sub2_Sub2_15 = this.aClass1_Sub1_Sub2_Sub2_11;
				}
			} else if (local4 == 600) {
				arg1.aString18 = this.aString9;
				if (anInt283 % 20 < 10) {
					arg1.aString18 = arg1.aString18 + "|";
				} else {
					arg1.aString18 = arg1.aString18 + " ";
				}
			} else {
				if (local4 == 613) {
					if (this.anInt409 < 1) {
						arg1.aString18 = "";
					} else if (this.aBoolean86) {
						arg1.anInt447 = 16711680;
						arg1.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg1.anInt447 = 16777215;
						arg1.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(598) String local598;
				if (local4 == 650 || local4 == 655) {
					if (this.anInt407 == 0) {
						arg1.aString18 = "";
					} else {
						if (this.anInt382 == 0) {
							local598 = "earlier today";
						} else if (this.anInt382 == 1) {
							local598 = "yesterday";
						} else {
							local598 = this.anInt382 + " days ago";
						}
						arg1.aString18 = "You last logged in " + local598 + " from: " + signlink.dns;
					}
				}
				if (local4 == 651) {
					if (this.anInt326 == 0) {
						arg1.aString18 = "0 unread messages";
						arg1.anInt447 = 16776960;
					}
					if (this.anInt326 == 1) {
						arg1.aString18 = "1 unread message";
						arg1.anInt447 = 65280;
					}
					if (this.anInt326 > 1) {
						arg1.aString18 = this.anInt326 + " unread messages";
						arg1.anInt447 = 65280;
					}
				}
				if (local4 == 652) {
					if (this.anInt312 == 201) {
						if (this.anInt234 == 1) {
							arg1.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg1.aString18 = "";
						}
					} else if (this.anInt312 == 200) {
						arg1.aString18 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt312 == 0) {
							local598 = "Earlier today";
						} else if (this.anInt312 == 1) {
							local598 = "Yesterday";
						} else {
							local598 = this.anInt312 + " days ago";
						}
						arg1.aString18 = local598 + " you changed your recovery questions";
					}
				}
				if (local4 == 653) {
					if (this.anInt312 == 201) {
						if (this.anInt234 == 1) {
							arg1.aString18 = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg1.aString18 = "";
						}
					} else if (this.anInt312 == 200) {
						arg1.aString18 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg1.aString18 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local4 == 654) {
					if (this.anInt312 == 201) {
						if (this.anInt234 == 1) {
							arg1.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
						} else {
							arg1.aString18 = "";
						}
					} else if (this.anInt312 == 200) {
						arg1.aString18 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg1.aString18 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(806) RuntimeException local806) {
			signlink.reporterror("52033, " + arg0 + ", " + arg1 + ", " + local806.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)Ljava/net/Socket;")
	public Socket method228(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method229() {
		try {
			this.aBoolean66 = false;
			while (this.aBoolean85) {
				this.aBoolean66 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			if (this.anInt381 == 8) {
				this.anIntArray86 = null;
				this.anIntArray87 = null;
				this.anIntArray88 = null;
				this.anIntArray89 = null;
				this.anIntArray65 = null;
				this.anIntArray66 = null;
				this.anIntArray57 = null;
				this.anIntArray58 = null;
				this.aClass1_Sub1_Sub2_Sub2_12 = null;
				this.aClass1_Sub1_Sub2_Sub2_13 = null;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("52212, " + 8 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt255 = Integer.parseInt(this.getParameter("nodeid"));
		anInt256 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method124();
		} else {
			method177();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean51 = false;
		} else {
			aBoolean51 = true;
		}
		this.method85();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZI)V")
	private void method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			this.aBoolean82 &= true;
			for (@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) this.aClass29_2.method511(); local12 != null; local12 = (Class1_Sub2) this.aClass29_2.method513()) {
				if (local12.anInt794 == arg8 && local12.anInt796 == arg1 && local12.anInt797 == arg4 && local12.anInt795 == arg2) {
					local1 = local12;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt794 = arg8;
				local1.anInt795 = arg2;
				local1.anInt796 = arg1;
				local1.anInt797 = arg4;
				this.method104(local1);
				this.aClass29_2.method508(local1);
			}
			local1.anInt801 = arg5;
			local1.anInt803 = arg3;
			local1.anInt802 = arg7;
			local1.anInt804 = arg0;
			local1.anInt805 = arg6;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("101, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + true + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}
}
